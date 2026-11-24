// default package

import android.media.MediaCodec;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class fve {
    /* JADX WARN: Removed duplicated region for block: B:44:0x0151  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static dn9 a(File file, om9 om9Var, long j, long j2, boolean z, cn9 cn9Var) {
        long j3;
        long j4;
        String str;
        String str2;
        om9 om9Var2 = om9Var;
        long max = Math.max(0L, j * 1000);
        long max2 = Math.max(max, j2 * 1000);
        MediaExtractor mediaExtractor = new MediaExtractor();
        try {
            mediaExtractor.setDataSource(file.getAbsolutePath());
            int d = d(mediaExtractor, true);
            int d2 = d(mediaExtractor, false);
            if (d < 0 || (z && d2 < 0)) {
                throw new IOException("Source file has no required tracks");
            }
            MediaFormat trackFormat = mediaExtractor.getTrackFormat(d);
            MediaFormat trackFormat2 = z ? mediaExtractor.getTrackFormat(d2) : null;
            mediaExtractor.release();
            int i = cn9Var.c;
            synchronized (om9Var) {
                om9Var2.s = i;
            }
            if (trackFormat2 != null) {
                om9Var2.n(trackFormat2, false);
            }
            mediaExtractor = new MediaExtractor();
            try {
                mediaExtractor.setDataSource(file.getAbsolutePath());
                int d3 = d(mediaExtractor, true);
                long j5 = Long.MAX_VALUE;
                if (d3 >= 0) {
                    mediaExtractor.selectTrack(d3);
                    j3 = Long.MIN_VALUE;
                    while (true) {
                        if (mediaExtractor.getSampleTime() < 0) {
                            break;
                        }
                        long sampleTime = mediaExtractor.getSampleTime();
                        boolean z2 = (mediaExtractor.getSampleFlags() & 1) != 0;
                        if (sampleTime >= max2) {
                            break;
                        }
                        if (z2) {
                            if (sampleTime > max) {
                                j5 = sampleTime;
                                break;
                            }
                            j3 = sampleTime;
                        }
                        mediaExtractor.advance();
                    }
                } else {
                    j3 = Long.MIN_VALUE;
                }
                mediaExtractor.release();
                long[] jArr = {j3, j5};
                long j6 = jArr[0];
                long j7 = jArr[1];
                if (j6 == Long.MIN_VALUE) {
                    wa3.d("Trim range has no video sync sample");
                    return null;
                }
                if (j6 == max) {
                    om9Var2.n(trackFormat, true);
                    b(file, om9Var2, max, max, max2);
                    str = "copy";
                    j4 = 0;
                } else {
                    long min = Math.min(j7, max2);
                    wm9 wm9Var = new wm9((byte) 1);
                    j4 = 0;
                    gve.c(file, j6, max, min, cn9Var.a, cn9Var.b, cn9Var.c, wm9Var);
                    if (((MediaFormat) wm9Var.d) == null || ((ArrayList) wm9Var.b).isEmpty()) {
                        wa3.d("Re-encoded trim start produced no frames");
                        return null;
                    }
                    boolean m = om9.m(trackFormat, (MediaFormat) wm9Var.d, "csd-0", "csd-1");
                    if (min >= max2) {
                        om9Var2.n(m ? trackFormat : (MediaFormat) wm9Var.d, true);
                        e(om9Var2, wm9Var, max);
                        str2 = "reencode-range-in-gop";
                        max = max;
                        if (z) {
                            mediaExtractor = new MediaExtractor();
                            MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
                            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(TLObject.FLAG_21);
                            try {
                                mediaExtractor.setDataSource(file.getAbsolutePath());
                                int d4 = d(mediaExtractor, false);
                                if (d4 < 0) {
                                    throw new IOException("Source track disappeared");
                                }
                                mediaExtractor.selectTrack(d4);
                                mediaExtractor.seekTo(max, 2);
                                while (mediaExtractor.getSampleTime() >= j4 && mediaExtractor.getSampleTime() < max) {
                                    mediaExtractor.advance();
                                }
                                while (mediaExtractor.getSampleTime() >= j4 && mediaExtractor.getSampleTime() < max2) {
                                    allocateDirect.clear();
                                    int readSampleData = mediaExtractor.readSampleData(allocateDirect, 0);
                                    if (readSampleData < 0) {
                                        break;
                                    }
                                    bufferInfo.set(0, readSampleData, mediaExtractor.getSampleTime(), mediaExtractor.getSampleFlags());
                                    om9Var2.q(false, allocateDirect, bufferInfo, -max);
                                    mediaExtractor.advance();
                                    om9Var2 = om9Var;
                                }
                            } finally {
                            }
                        }
                        return new dn9(max / 1000, str2, om9Var.h());
                    }
                    if (m) {
                        om9Var2.n(trackFormat, true);
                        e(om9Var2, wm9Var, max);
                        b(file, om9Var2, j7, max, max2);
                        max = max;
                        str = "reencode-head";
                    } else {
                        max = max;
                        gve.c(file, j6, max, max2, cn9Var.a, cn9Var.b, cn9Var.c, new vh2(om9Var2, max, (byte) 6));
                        str = "reencode-all";
                    }
                }
                str2 = str;
                if (z) {
                }
                return new dn9(max / 1000, str2, om9Var.h());
            } finally {
            }
        } finally {
        }
    }

    public static void b(File file, om9 om9Var, long j, long j2, long j3) {
        ByteBuffer byteBuffer;
        MediaCodec.BufferInfo bufferInfo;
        om9 om9Var2;
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
            mediaExtractor.seekTo(j, 0);
            while (mediaExtractor.getSampleTime() >= 0) {
                long sampleTime = mediaExtractor.getSampleTime();
                if (sampleTime >= j3) {
                    break;
                }
                if (sampleTime >= j) {
                    allocateDirect.clear();
                    int readSampleData = mediaExtractor.readSampleData(allocateDirect, 0);
                    if (readSampleData < 0) {
                        break;
                    }
                    bufferInfo2.set(0, readSampleData, sampleTime, mediaExtractor.getSampleFlags());
                    byteBuffer = allocateDirect;
                    bufferInfo = bufferInfo2;
                    om9Var2 = om9Var;
                    om9Var2.q(true, byteBuffer, bufferInfo, -j2);
                } else {
                    byteBuffer = allocateDirect;
                    bufferInfo = bufferInfo2;
                    om9Var2 = om9Var;
                }
                mediaExtractor.advance();
                om9Var = om9Var2;
                allocateDirect = byteBuffer;
                bufferInfo2 = bufferInfo;
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

    public static int d(MediaExtractor mediaExtractor, boolean z) {
        String str = z ? "video/" : "audio/";
        for (int i = 0; i < mediaExtractor.getTrackCount(); i++) {
            String string = mediaExtractor.getTrackFormat(i).getString("mime");
            if (string != null && string.startsWith(str)) {
                return i;
            }
        }
        return -1;
    }

    public static void e(om9 om9Var, wm9 wm9Var, long j) {
        ArrayList arrayList = (ArrayList) wm9Var.b;
        for (int i = 0; i < arrayList.size(); i++) {
            om9Var.q(true, (ByteBuffer) arrayList.get(i), (MediaCodec.BufferInfo) ((ArrayList) wm9Var.c).get(i), -j);
        }
    }
}
