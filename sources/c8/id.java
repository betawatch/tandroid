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
import org.telegram.ui.hy0;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public abstract class id {
    public static n2.p0 a(File file, wi.x xVar, long j3, long j10, boolean z9, b7.d dVar) {
        long j11;
        long j12;
        String str;
        wi.x xVar2 = xVar;
        long max = Math.max(0L, j3 * 1000);
        long max2 = Math.max(max, j10 * 1000);
        MediaExtractor mediaExtractor = new MediaExtractor();
        try {
            mediaExtractor.setDataSource(file.getAbsolutePath());
            int d = d(mediaExtractor, true);
            int d2 = d(mediaExtractor, false);
            if (d < 0 || (z9 && d2 < 0)) {
                throw new IOException("Source file has no required tracks");
            }
            MediaFormat trackFormat = mediaExtractor.getTrackFormat(d);
            MediaFormat trackFormat2 = z9 ? mediaExtractor.getTrackFormat(d2) : null;
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
                        boolean z10 = (mediaExtractor.getSampleFlags() & 1) != 0;
                        if (sampleTime >= max2) {
                            break;
                        }
                        if (z10) {
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
                    hy0 hy0Var = new hy0(25);
                    j12 = 0;
                    jd.c(file, j14, max, min, dVar.a, dVar.b, dVar.c, hy0Var);
                    if (((MediaFormat) hy0Var.d) == null || ((ArrayList) hy0Var.b).isEmpty()) {
                        throw new IOException("Re-encoded trim start produced no frames");
                    }
                    boolean m10 = wi.x.m(trackFormat, (MediaFormat) hy0Var.d, "csd-0", "csd-1");
                    if (min >= max2) {
                        xVar2.n(m10 ? trackFormat : (MediaFormat) hy0Var.d, true);
                        e(xVar2, hy0Var, max);
                        str = "reencode-range-in-gop";
                        max = max;
                    } else if (m10) {
                        xVar2.n(trackFormat, true);
                        e(xVar2, hy0Var, max);
                        b(file, xVar2, j15, max, max2);
                        max = max;
                        str = "reencode-head";
                    } else {
                        max = max;
                        jd.c(file, j14, max, max2, dVar.a, dVar.b, dVar.c, new a8.ua(xVar2, max, 9));
                        str = "reencode-all";
                    }
                }
                if (z9) {
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
                n2.p0 p0Var = new n2.p0();
                p0Var.a = max / 1000;
                p0Var.b = h;
                p0Var.c = str;
                return p0Var;
            } finally {
            }
        } finally {
        }
    }

    public static void b(File file, wi.x xVar, long j3, long j10, long j11) {
        ByteBuffer byteBuffer;
        MediaCodec.BufferInfo bufferInfo;
        wi.x xVar2;
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

    public static int d(MediaExtractor mediaExtractor, boolean z9) {
        String str = z9 ? "video/" : "audio/";
        for (int i7 = 0; i7 < mediaExtractor.getTrackCount(); i7++) {
            String string = mediaExtractor.getTrackFormat(i7).getString("mime");
            if (string != null && string.startsWith(str)) {
                return i7;
            }
        }
        return -1;
    }

    public static void e(wi.x xVar, hy0 hy0Var, long j3) {
        ArrayList arrayList = (ArrayList) hy0Var.b;
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            xVar.q(true, (ByteBuffer) arrayList.get(i7), (MediaCodec.BufferInfo) ((ArrayList) hy0Var.c).get(i7), -j3);
        }
    }
}
