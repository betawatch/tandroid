package hi;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.view.Surface;
import j$.util.DesugarCollections;
import java.io.Closeable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.Dictation.DictationAsr;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class r7 {
    public static android.support.v4.media.session.a0 A;
    public static final long[] y = {30000, 90000};
    public static String z;
    public final String b;
    public final p7 c;
    public final Runnable e;
    public android.support.v4.media.session.a0 f;
    public int g;
    public boolean h;
    public long l;
    public long m;
    public n7 n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public l7 t;
    public m7 u;
    public float v;
    public ai.i w;
    public di.a8 x;
    public final Set a = DesugarCollections.synchronizedSet(new HashSet());
    public int d = -1;
    public final TreeMap i = new TreeMap();
    public final HashMap j = new HashMap();
    public long k = Long.MAX_VALUE;
    public final ArrayList s = new ArrayList();

    public r7(p7 p7Var, long j3, long j10, Runnable runnable) {
        this.c = p7Var;
        this.e = runnable;
        this.l = j3;
        this.m = j10;
        String str = p7Var.l() + "|" + j3;
        this.b = str;
        if (str.equals(z)) {
            this.f = A;
        } else {
            new Thread(new d3.e0(this, j3, j10, p7Var, 3), "StoryCaptions").start();
        }
    }

    public static int a(long j3) {
        return (int) (Math.max(0L, j3) / 30000);
    }

    public static long d(int[] iArr, int i7) {
        return iArr[((i7 + 1) * 4) + 2] - iArr[(i7 * 4) + 3];
    }

    public static int g(int i7, int i10, float[] fArr) {
        int max = Math.max(0, i7);
        int min = Math.min(fArr.length, i10);
        int max2 = Math.max(0, Math.min(fArr.length, (max + min) / 2));
        double d = Double.MAX_VALUE;
        while (true) {
            int i11 = max + 1600;
            if (i11 > min) {
                return max2;
            }
            double d2 = 0.0d;
            for (int i12 = max; i12 < i11; i12++) {
                float f10 = fArr[i12];
                d2 += f10 * f10;
            }
            if (d2 < d) {
                max2 = max + 800;
                d = d2;
            }
            max += 800;
        }
    }

    public static float k(float[] fArr, float[] fArr2, int i7, int i10) {
        return (fArr[i10 + 1] - fArr[i7]) - fArr2[i7];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:110:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x029d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0148 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x016e  */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r8v3, types: [android.media.MediaCrypto, android.view.Surface] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float[] b(p7 p7Var, long j3, long j10, long[] jArr) {
        MediaExtractor mediaExtractor;
        MediaCodec mediaCodec;
        Closeable closeable;
        long j11;
        float[] fArr;
        MediaFormat mediaFormat;
        MediaCodec mediaCodec2;
        int integer;
        MediaCodec mediaCodec3;
        MediaCodec mediaCodec4;
        int dequeueOutputBuffer;
        String str;
        String str2;
        long j12;
        int i7;
        String str3 = "channel-count";
        String str4 = "sample-rate";
        Set set = this.a;
        long j13 = 1000;
        long max = Math.max(0L, j3) * 1000;
        long j14 = j3 + 600000;
        if (j10 > j3) {
            j14 = Math.min(j10, j14);
        }
        long j15 = j14 * 1000;
        MediaExtractor mediaExtractor2 = new MediaExtractor();
        try {
            closeable = p7Var.o(mediaExtractor2);
            if (closeable != null) {
                try {
                    set.add(closeable);
                } catch (Throwable th2) {
                    th = th2;
                    mediaExtractor = mediaExtractor2;
                    mediaCodec = null;
                    if (mediaCodec != null) {
                    }
                    mediaExtractor.release();
                    if (closeable != null) {
                    }
                }
            }
            if (this.h && closeable != null) {
                ((q7) closeable).close();
            }
            int i10 = 0;
            int i11 = 0;
            while (true) {
                j11 = j13;
                if (i11 >= mediaExtractor2.getTrackCount()) {
                    fArr = null;
                    mediaFormat = null;
                    break;
                }
                try {
                    mediaFormat = mediaExtractor2.getTrackFormat(i11);
                    String string = mediaFormat.getString("mime");
                    if (string != null) {
                        fArr = null;
                        try {
                            if (string.startsWith("audio/")) {
                                mediaExtractor2.selectTrack(i11);
                                break;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            mediaCodec2 = fArr;
                            mediaExtractor = mediaExtractor2;
                            mediaCodec = mediaCodec2;
                            if (mediaCodec != null) {
                                try {
                                    mediaCodec.stop();
                                    mediaCodec.release();
                                } catch (Throwable unused) {
                                }
                            }
                            mediaExtractor.release();
                            if (closeable != null) {
                                throw th;
                            }
                            set.remove(closeable);
                            try {
                                ((q7) closeable).close();
                                throw th;
                            } catch (Throwable unused2) {
                                throw th;
                            }
                        }
                    }
                    i11++;
                    j13 = j11;
                } catch (Throwable th4) {
                    th = th4;
                    fArr = null;
                    mediaCodec2 = fArr;
                    mediaExtractor = mediaExtractor2;
                    mediaCodec = mediaCodec2;
                    if (mediaCodec != null) {
                    }
                    mediaExtractor.release();
                    if (closeable != null) {
                    }
                }
            }
            if (mediaFormat == null) {
                mediaExtractor2.release();
                if (closeable != null) {
                    set.remove(closeable);
                    try {
                        ((q7) closeable).close();
                    } catch (Throwable unused3) {
                    }
                }
                return fArr;
            }
            if (max > 0) {
                mediaExtractor2.seekTo(max, 0);
            }
            mediaCodec2 = MediaCodec.createDecoderByType(mediaFormat.getString("mime"));
            ?? r82 = fArr;
            try {
                mediaCodec2.configure(mediaFormat, (Surface) r82, (MediaCrypto) r82, 0);
                mediaCodec2.start();
                if (mediaFormat.containsKey("sample-rate")) {
                    try {
                        integer = mediaFormat.getInteger("sample-rate");
                    } catch (Throwable th5) {
                        th = th5;
                        mediaExtractor = mediaExtractor2;
                        mediaCodec = mediaCodec2;
                        if (mediaCodec != null) {
                        }
                        mediaExtractor.release();
                        if (closeable != null) {
                        }
                    }
                } else {
                    integer = 48000;
                }
                int integer2 = mediaFormat.containsKey("channel-count") ? mediaFormat.getInteger("channel-count") : 1;
                MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
                float[] fArr2 = new float[480000];
                boolean z10 = false;
                int i12 = 0;
                boolean z11 = false;
                long j16 = -1;
                double d = 0.0d;
                mediaCodec2 = mediaCodec2;
                while (!z10) {
                    long j17 = j15;
                    try {
                        if (!z11) {
                            try {
                                int dequeueInputBuffer = mediaCodec2.dequeueInputBuffer(5000L);
                                if (dequeueInputBuffer >= 0) {
                                    int readSampleData = mediaExtractor2.readSampleData(mediaCodec2.getInputBuffer(dequeueInputBuffer), i10);
                                    try {
                                        if (readSampleData >= 0) {
                                            try {
                                                if (mediaExtractor2.getSampleTime() <= j17) {
                                                    MediaCodec mediaCodec5 = mediaCodec2;
                                                    try {
                                                        mediaCodec5.queueInputBuffer(dequeueInputBuffer, 0, readSampleData, mediaExtractor2.getSampleTime(), 0);
                                                        mediaExtractor2.advance();
                                                        mediaCodec3 = mediaCodec5;
                                                        dequeueOutputBuffer = mediaCodec3.dequeueOutputBuffer(bufferInfo, 5000L);
                                                        if (dequeueOutputBuffer == -2) {
                                                            try {
                                                                MediaFormat outputFormat = mediaCodec3.getOutputFormat();
                                                                if (outputFormat.containsKey(str4)) {
                                                                    integer = outputFormat.getInteger(str4);
                                                                }
                                                                if (outputFormat.containsKey(str3)) {
                                                                    integer2 = outputFormat.getInteger(str3);
                                                                }
                                                                str = str3;
                                                                mediaExtractor = mediaExtractor2;
                                                                str2 = str4;
                                                                j12 = max;
                                                                i7 = i10;
                                                            } catch (Throwable th6) {
                                                                th = th6;
                                                                mediaCodec2 = mediaCodec3;
                                                                mediaExtractor = mediaExtractor2;
                                                                mediaCodec = mediaCodec2;
                                                                if (mediaCodec != null) {
                                                                }
                                                                mediaExtractor.release();
                                                                if (closeable != null) {
                                                                }
                                                            }
                                                        } else if (dequeueOutputBuffer >= 0) {
                                                            if ((bufferInfo.flags & 4) != 0) {
                                                                z10 = true;
                                                            }
                                                            if (bufferInfo.size > 0) {
                                                                mediaExtractor = mediaExtractor2;
                                                                try {
                                                                    long j18 = bufferInfo.presentationTimeUs;
                                                                    if (j18 + 100000 >= max) {
                                                                        if (j16 < 0) {
                                                                            jArr[i10] = j18 / j11;
                                                                            j16 = j18;
                                                                        }
                                                                        ByteBuffer outputBuffer = mediaCodec3.getOutputBuffer(dequeueOutputBuffer);
                                                                        outputBuffer.position(bufferInfo.offset);
                                                                        outputBuffer.limit(bufferInfo.offset + bufferInfo.size);
                                                                        ShortBuffer asShortBuffer = outputBuffer.order(ByteOrder.LITTLE_ENDIAN).asShortBuffer();
                                                                        int remaining = asShortBuffer.remaining() / Math.max(1, integer2);
                                                                        str2 = str4;
                                                                        double d2 = integer / 16000.0d;
                                                                        double d10 = remaining;
                                                                        int i13 = i12;
                                                                        int i14 = i13 + ((int) (d10 / d2)) + 2;
                                                                        j12 = max;
                                                                        if (i14 > 9680000) {
                                                                            z10 = true;
                                                                        }
                                                                        if (fArr2.length < i14) {
                                                                            fArr2 = Arrays.copyOf(fArr2, Math.max(i14, fArr2.length * 2));
                                                                        }
                                                                        i12 = i13;
                                                                        double d11 = d;
                                                                        while (d11 < d10) {
                                                                            int i15 = (int) d11;
                                                                            d11 += d2;
                                                                            int max2 = Math.max(i15 + 1, Math.min(remaining, (int) d11));
                                                                            String str5 = str3;
                                                                            int i16 = i15;
                                                                            int i17 = 0;
                                                                            while (i16 < max2) {
                                                                                int i18 = i17;
                                                                                int i19 = 0;
                                                                                while (i19 < integer2) {
                                                                                    int i20 = i19;
                                                                                    i18 += asShortBuffer.get((i16 * integer2) + i20);
                                                                                    i19 = i20 + 1;
                                                                                }
                                                                                i16++;
                                                                                i17 = i18;
                                                                            }
                                                                            fArr2[i12] = (i17 / ((max2 - i15) * integer2)) / 32768.0f;
                                                                            i12++;
                                                                            str3 = str5;
                                                                        }
                                                                        str = str3;
                                                                        d = d11 - d10;
                                                                        i7 = 0;
                                                                        mediaCodec3.releaseOutputBuffer(dequeueOutputBuffer, false);
                                                                    }
                                                                } catch (Throwable th7) {
                                                                    th = th7;
                                                                    mediaCodec = mediaCodec3;
                                                                    if (mediaCodec != null) {
                                                                    }
                                                                    mediaExtractor.release();
                                                                    if (closeable != null) {
                                                                    }
                                                                }
                                                            } else {
                                                                mediaExtractor = mediaExtractor2;
                                                            }
                                                            str = str3;
                                                            str2 = str4;
                                                            j12 = max;
                                                            i12 = i12;
                                                            i7 = 0;
                                                            mediaCodec3.releaseOutputBuffer(dequeueOutputBuffer, false);
                                                        } else {
                                                            str = str3;
                                                            mediaExtractor = mediaExtractor2;
                                                            str2 = str4;
                                                            j12 = max;
                                                            i7 = i10;
                                                        }
                                                        j15 = j17;
                                                        mediaExtractor2 = mediaExtractor;
                                                        i10 = i7;
                                                        mediaCodec2 = mediaCodec3;
                                                        str4 = str2;
                                                        max = j12;
                                                        str3 = str;
                                                    } catch (Throwable th8) {
                                                        th = th8;
                                                        mediaExtractor = mediaExtractor2;
                                                        mediaCodec = mediaCodec5;
                                                        if (mediaCodec != null) {
                                                        }
                                                        mediaExtractor.release();
                                                        if (closeable != null) {
                                                        }
                                                    }
                                                }
                                            } catch (Throwable th9) {
                                                th = th9;
                                                mediaExtractor = mediaExtractor2;
                                                mediaCodec = mediaCodec2;
                                                if (mediaCodec != null) {
                                                }
                                                mediaExtractor.release();
                                                if (closeable != null) {
                                                }
                                            }
                                        }
                                        mediaCodec4.queueInputBuffer(dequeueInputBuffer, 0, 0, 0L, 4);
                                        mediaCodec3 = mediaCodec4;
                                        z11 = true;
                                        dequeueOutputBuffer = mediaCodec3.dequeueOutputBuffer(bufferInfo, 5000L);
                                        if (dequeueOutputBuffer == -2) {
                                        }
                                        j15 = j17;
                                        mediaExtractor2 = mediaExtractor;
                                        i10 = i7;
                                        mediaCodec2 = mediaCodec3;
                                        str4 = str2;
                                        max = j12;
                                        str3 = str;
                                    } catch (Throwable th10) {
                                        th = th10;
                                        mediaCodec3 = mediaCodec4;
                                        mediaCodec2 = mediaCodec3;
                                        mediaExtractor = mediaExtractor2;
                                        mediaCodec = mediaCodec2;
                                        if (mediaCodec != null) {
                                        }
                                        mediaExtractor.release();
                                        if (closeable != null) {
                                        }
                                    }
                                    mediaCodec4 = mediaCodec2;
                                }
                            } catch (Throwable th11) {
                                th = th11;
                            }
                        }
                        dequeueOutputBuffer = mediaCodec3.dequeueOutputBuffer(bufferInfo, 5000L);
                        if (dequeueOutputBuffer == -2) {
                        }
                        j15 = j17;
                        mediaExtractor2 = mediaExtractor;
                        i10 = i7;
                        mediaCodec2 = mediaCodec3;
                        str4 = str2;
                        max = j12;
                        str3 = str;
                    } catch (Throwable th12) {
                        th = th12;
                        mediaExtractor = mediaExtractor2;
                        mediaCodec = mediaCodec3;
                        if (mediaCodec != null) {
                        }
                        mediaExtractor.release();
                        if (closeable != null) {
                        }
                    }
                    mediaCodec3 = mediaCodec2;
                }
                mediaExtractor = mediaExtractor2;
                mediaCodec3 = mediaCodec2;
                int i21 = i12;
                float[] copyOf = i21 == 0 ? null : Arrays.copyOf(fArr2, i21);
                try {
                    mediaCodec3.stop();
                    mediaCodec3.release();
                } catch (Throwable unused4) {
                }
                mediaExtractor.release();
                if (closeable != null) {
                    set.remove(closeable);
                    try {
                        ((q7) closeable).close();
                    } catch (Throwable unused5) {
                    }
                }
                return copyOf;
            } catch (Throwable th13) {
                th = th13;
                mediaExtractor = mediaExtractor2;
                mediaCodec = mediaCodec2;
            }
        } catch (Throwable th14) {
            th = th14;
            mediaExtractor = mediaExtractor2;
            mediaCodec = null;
            closeable = null;
        }
    }

    public final void c() {
        int i7;
        Closeable[] closeableArr;
        this.h = true;
        i();
        synchronized (this.a) {
            closeableArr = (Closeable[]) this.a.toArray(new Closeable[0]);
        }
        for (Closeable closeable : closeableArr) {
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }
    }

    public final boolean e(int i7) {
        k7 k7Var = (k7) this.i.get(Integer.valueOf(i7));
        return (k7Var != null && k7Var.c) || ((long) i7) * 30000 >= this.k;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:?, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f() {
        int i7;
        int a10;
        l7 l7Var;
        if (!this.o || this.p || this.h || this.f == null) {
            return;
        }
        int a11 = a(this.l);
        long j3 = this.m;
        if (j3 <= this.l) {
            j3 = this.k;
            if (j3 == Long.MAX_VALUE) {
                i7 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                n7 n7Var = this.n;
                a10 = a(n7Var == null ? n7Var.get() : this.l);
                if (e(a10)) {
                    int i10 = -1;
                    if (this.d >= 0) {
                        for (int i11 = a10 + 1; i11 <= this.d + a10 && i10 < 0 && i11 * 30000 < this.k; i11++) {
                            if (!e(i11)) {
                                i10 = i11;
                            }
                        }
                    } else {
                        for (int max = Math.max(a11, a10); max <= i7 && i10 < 0 && max * 30000 < this.k; max++) {
                            if (!e(max)) {
                                i10 = max;
                            }
                        }
                        while (a11 < a10 && a11 <= i7 && i10 < 0) {
                            if (!e(a11)) {
                                i10 = a11;
                            }
                            a11++;
                        }
                    }
                    a10 = i10;
                }
                if (a10 >= 0) {
                    if (this.r || (l7Var = this.t) == null) {
                        return;
                    }
                    this.r = true;
                    l7Var.g(this.s);
                    return;
                }
                this.p = true;
                int i12 = this.g;
                long j10 = a10 * 30000;
                Integer valueOf = Integer.valueOf(a10);
                HashMap hashMap = this.j;
                new Thread(new h7(this, j10, 30000 + j10, a10, (Long) hashMap.get(valueOf), (Long) hashMap.get(Integer.valueOf(a10 + 1)), i12), "StoryCaptions").start();
                return;
            }
        }
        i7 = a(j3 - 1);
        n7 n7Var2 = this.n;
        a10 = a(n7Var2 == null ? n7Var2.get() : this.l);
        if (e(a10)) {
        }
        if (a10 >= 0) {
        }
    }

    public final void h(long j3, long j10, l7 l7Var) {
        this.t = l7Var;
        if (this.f != null) {
            this.l = j3;
            this.m = j10;
            this.o = true;
            this.r = false;
            ArrayList arrayList = this.s;
            if (!arrayList.isEmpty()) {
                l7Var.g(arrayList);
            }
            f();
        }
    }

    public final void i() {
        this.g++;
        ai.i iVar = this.w;
        if (iVar != null) {
            iVar.run();
            this.w = null;
        }
        Iterator it = this.i.values().iterator();
        while (it.hasNext()) {
            if (!((k7) it.next()).c) {
                it.remove();
            }
        }
        this.p = false;
        this.o = false;
        j();
        this.t = null;
    }

    public final void j() {
        di.a8 a8Var = this.x;
        if (a8Var == null) {
            return;
        }
        DictationAsr.U(a8Var);
        this.x = null;
        l7 l7Var = this.t;
        if (l7Var != null) {
            l7Var.j(0L, 0L, false);
        }
    }
}
