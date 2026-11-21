package c8;

import android.media.MediaCodec;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public abstract class oe {
    public static n2.q0 a(File file, zi.x xVar, long j3, long j10, boolean z10, b7.d dVar) {
        long j11;
        long j12;
        String str;
        zi.x xVar2 = xVar;
        long max = Math.max(0L, j3 * 1000);
        long max2 = Math.max(max, j10 * 1000);
        MediaExtractor mediaExtractor = new MediaExtractor();
        try {
            mediaExtractor.setDataSource(file.getAbsolutePath());
            int d = d(mediaExtractor, true);
            int d2 = d(mediaExtractor, false);
            if (d < 0 || (z10 && d2 < 0)) {
                throw new IOException("Source file has no required tracks");
            }
            MediaFormat trackFormat = mediaExtractor.getTrackFormat(d);
            MediaFormat trackFormat2 = z10 ? mediaExtractor.getTrackFormat(d2) : null;
            mediaExtractor.release();
            int i7 = dVar.c;
            synchronized (xVar) {
                xVar2.s = i7;
            }
            if (trackFormat2 != null) {
                xVar2.n(trackFormat2, false);
            }
            mediaExtractor = new MediaExtractor();
            try {
                mediaExtractor.setDataSource(file.getAbsolutePath());
                int d10 = d(mediaExtractor, true);
                long j13 = Long.MAX_VALUE;
                if (d10 >= 0) {
                    mediaExtractor.selectTrack(d10);
                    j11 = Long.MIN_VALUE;
                    while (true) {
                        if (mediaExtractor.getSampleTime() < 0) {
                            break;
                        }
                        long sampleTime = mediaExtractor.getSampleTime();
                        boolean z11 = (mediaExtractor.getSampleFlags() & 1) != 0;
                        if (sampleTime >= max2) {
                            break;
                        }
                        if (z11) {
                            if (sampleTime > max) {
                                j13 = sampleTime;
                                break;
                            }
                            j11 = sampleTime;
                        }
                        mediaExtractor.advance();
                    }
                } else {
                    j11 = Long.MIN_VALUE;
                }
                mediaExtractor.release();
                long[] jArr = {j11, j13};
                long j14 = jArr[0];
                long j15 = jArr[1];
                if (j14 == Long.MIN_VALUE) {
                    throw new IOException("Trim range has no video sync sample");
                }
                if (j14 == max) {
                    xVar2.n(trackFormat, true);
                    b(file, xVar2, max, max, max2);
                    str = "copy";
                    j12 = 0;
                } else {
                    long min = Math.min(j15, max2);
                    y7.f7 f7Var = new y7.f7(4);
                    j12 = 0;
                    pe.c(file, j14, max, min, dVar.a, dVar.b, dVar.c, f7Var);
                    if (((MediaFormat) f7Var.c) == null || ((ArrayList) f7Var.a).isEmpty()) {
                        throw new IOException("Re-encoded trim start produced no frames");
                    }
                    boolean m10 = zi.x.m(trackFormat, (MediaFormat) f7Var.c, "csd-0", "csd-1");
                    if (min >= max2) {
                        xVar2.n(m10 ? trackFormat : (MediaFormat) f7Var.c, true);
                        e(xVar2, f7Var, max);
                        str = "reencode-range-in-gop";
                        max = max;
                    } else if (m10) {
                        xVar2.n(trackFormat, true);
                        e(xVar2, f7Var, max);
                        b(file, xVar2, j15, max, max2);
                        max = max;
                        str = "reencode-head";
                    } else {
                        max = max;
                        pe.c(file, j14, max, max2, dVar.a, dVar.b, dVar.c, new a8.va(xVar2, max, 11));
                        str = "reencode-all";
                    }
                }
                if (z10) {
                    mediaExtractor = new MediaExtractor();
                    MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
                    ByteBuffer allocateDirect = ByteBuffer.allocateDirect(TLObject.FLAG_21);
                    try {
                        mediaExtractor.setDataSource(file.getAbsolutePath());
                        int d11 = d(mediaExtractor, false);
                        if (d11 < 0) {
                            throw new IOException("Source track disappeared");
                        }
                        mediaExtractor.selectTrack(d11);
                        mediaExtractor.seekTo(max, 2);
                        while (mediaExtractor.getSampleTime() >= j12 && mediaExtractor.getSampleTime() < max) {
                            mediaExtractor.advance();
                        }
                        while (mediaExtractor.getSampleTime() >= j12 && mediaExtractor.getSampleTime() < max2) {
                            allocateDirect.clear();
                            int readSampleData = mediaExtractor.readSampleData(allocateDirect, 0);
                            if (readSampleData >= 0) {
                                bufferInfo.set(0, readSampleData, mediaExtractor.getSampleTime(), mediaExtractor.getSampleFlags());
                                ByteBuffer byteBuffer = allocateDirect;
                                xVar2.q(false, byteBuffer, bufferInfo, -max);
                                mediaExtractor.advance();
                                allocateDirect = byteBuffer;
                                xVar2 = xVar;
                            }
                        }
                    } finally {
                    }
                }
                long h = xVar.h();
                n2.q0 q0Var = new n2.q0();
                q0Var.a = max / 1000;
                q0Var.b = h;
                q0Var.c = str;
                return q0Var;
            } finally {
            }
        } finally {
        }
    }

    public static void b(File file, zi.x xVar, long j3, long j10, long j11) {
        ByteBuffer byteBuffer;
        MediaCodec.BufferInfo bufferInfo;
        zi.x xVar2;
        MediaExtractor mediaExtractor = new MediaExtractor();
        MediaCodec.BufferInfo bufferInfo2 = new MediaCodec.BufferInfo();
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(TLObject.FLAG_21);
        try {
            mediaExtractor.setDataSource(file.getAbsolutePath());
            int d = d(mediaExtractor, true);
            if (d < 0) {
                throw new IOException("Source track disappeared");
            }
            mediaExtractor.selectTrack(d);
            mediaExtractor.seekTo(j3, 0);
            while (mediaExtractor.getSampleTime() >= 0) {
                long sampleTime = mediaExtractor.getSampleTime();
                if (sampleTime < j11) {
                    if (sampleTime >= j3) {
                        allocateDirect.clear();
                        int readSampleData = mediaExtractor.readSampleData(allocateDirect, 0);
                        if (readSampleData < 0) {
                            break;
                        }
                        bufferInfo2.set(0, readSampleData, sampleTime, mediaExtractor.getSampleFlags());
                        byteBuffer = allocateDirect;
                        bufferInfo = bufferInfo2;
                        xVar2 = xVar;
                        xVar2.q(true, byteBuffer, bufferInfo, -j10);
                    } else {
                        byteBuffer = allocateDirect;
                        bufferInfo = bufferInfo2;
                        xVar2 = xVar;
                    }
                    mediaExtractor.advance();
                    xVar = xVar2;
                    allocateDirect = byteBuffer;
                    bufferInfo2 = bufferInfo;
                }
            }
        } finally {
            mediaExtractor.release();
        }
    }

    public static void c(File file) {
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            try {
                randomAccessFile.setLength(0L);
                randomAccessFile.close();
            } finally {
            }
        } catch (IOException unused) {
        }
        if (file.exists()) {
            file.delete();
        }
    }

    public static int d(MediaExtractor mediaExtractor, boolean z10) {
        String str = z10 ? "video/" : "audio/";
        for (int i7 = 0; i7 < mediaExtractor.getTrackCount(); i7++) {
            String string = mediaExtractor.getTrackFormat(i7).getString("mime");
            if (string != null && string.startsWith(str)) {
                return i7;
            }
        }
        return -1;
    }

    public static void e(zi.x xVar, y7.f7 f7Var, long j3) {
        ArrayList arrayList = (ArrayList) f7Var.a;
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            xVar.q(true, (ByteBuffer) arrayList.get(i7), (MediaCodec.BufferInfo) ((ArrayList) f7Var.b).get(i7), -j3);
        }
    }
}
