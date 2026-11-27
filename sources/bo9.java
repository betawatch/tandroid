// default package

import android.media.MediaCodec;
import android.media.MediaFormat;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.telegram.messenger.video.MP4Builder;
import org.telegram.messenger.video.Mp4Movie;
import org.webrtc.MediaStreamTrack;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes3.dex */
public final class bo9 {
    public final File a;
    public final short b;
    public final boolean c;
    public final sn9 d;
    public final m88 e;
    public MP4Builder i;
    public MediaFormat j;
    public MediaFormat k;
    public long n;
    public long o;
    public long p;
    public long r;
    public int s;
    public ByteBuffer t;
    public boolean v;
    public boolean w;
    public boolean x;
    public final ArrayList f = new ArrayList();
    public final ao9 g = new ao9(33333);
    public final ao9 h = new ao9(21333);
    public int l = -1;
    public int m = -1;
    public long q = Long.MIN_VALUE;
    public final MediaCodec.BufferInfo u = new MediaCodec.BufferInfo();

    /* JADX WARN: Multi-variable type inference failed */
    public bo9(File file, int i, boolean z, sn9 sn9Var, m88 m88Var) {
        this.a = file;
        this.b = i;
        this.c = z;
        this.d = sn9Var;
        this.e = m88Var;
    }

    public static int a(ByteBuffer byteBuffer) {
        if (byteBuffer.limit() >= 4 && byteBuffer.get(0) == 0 && byteBuffer.get(1) == 0 && byteBuffer.get(2) == 0 && byteBuffer.get(3) == 1) {
            return 4;
        }
        return (byteBuffer.limit() >= 3 && byteBuffer.get(0) == 0 && byteBuffer.get(1) == 0 && byteBuffer.get(2) == 1) ? 3 : 0;
    }

    public static String d(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        return "offset=" + bufferInfo.offset + ", size=" + bufferInfo.size + ", ptsUs=" + bufferInfo.presentationTimeUs + ", flags=" + bufferInfo.flags + ", position=" + byteBuffer.position() + ", limit=" + byteBuffer.limit() + ", capacity=" + byteBuffer.capacity();
    }

    public static String e(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        int i;
        int i2;
        p(byteBuffer, bufferInfo);
        int i3 = bufferInfo.offset;
        int i4 = bufferInfo.size + i3;
        int f = f(byteBuffer, i3, i4);
        if (f == bufferInfo.offset) {
            i = o(byteBuffer, f, i4);
            i2 = 0;
            while (f >= 0) {
                i2++;
                f = f(byteBuffer, o(byteBuffer, f, i4) + f, i4);
            }
        } else {
            i = 0;
            i2 = 0;
        }
        StringBuilder sb = new StringBuilder(d(byteBuffer, bufferInfo));
        sb.append(", format=");
        sb.append(i2 > 0 ? "annex-b" : "avcc");
        sb.append(", nalCount=");
        sb.append(i2);
        sb.append(", firstPrefix=");
        sb.append(i);
        sb.append(", head=");
        int i5 = bufferInfo.offset;
        StringBuilder sb2 = new StringBuilder();
        int min = Math.min(16, i4 - i5);
        for (int i6 = 0; i6 < min; i6++) {
            if (i6 > 0) {
                sb2.append(' ');
            }
            int i7 = byteBuffer.get(i5 + i6) & 255;
            if (i7 < 16) {
                sb2.append('0');
            }
            sb2.append(Integer.toHexString(i7));
        }
        sb.append(sb2.toString());
        return sb.toString();
    }

    public static int f(ByteBuffer byteBuffer, int i, int i2) {
        int i3;
        while (true) {
            int i4 = i + 2;
            if (i4 >= i2) {
                return -1;
            }
            if (byteBuffer.get(i) != 0 || byteBuffer.get(i + 1) != 0 || (byteBuffer.get(i4) != 1 && ((i3 = i + 3) >= i2 || byteBuffer.get(i4) != 0 || byteBuffer.get(i3) != 1))) {
                i++;
            }
        }
        return i;
    }

    public static boolean m(MediaFormat mediaFormat, MediaFormat mediaFormat2, String... strArr) {
        if (mediaFormat != null) {
            for (String str : strArr) {
                ByteBuffer byteBuffer = mediaFormat.getByteBuffer(str);
                ByteBuffer byteBuffer2 = mediaFormat2.getByteBuffer(str);
                if (byteBuffer != null && byteBuffer2 != null) {
                    int a = a(byteBuffer);
                    int a2 = a(byteBuffer2);
                    int limit = byteBuffer.limit() - a;
                    if (limit == byteBuffer2.limit() - a2) {
                        for (int i = 0; i < limit; i++) {
                            if (byteBuffer.get(a + i) == byteBuffer2.get(a2 + i)) {
                            }
                        }
                    }
                } else if (byteBuffer == byteBuffer2) {
                }
            }
            return true;
        }
        return false;
    }

    public static int o(ByteBuffer byteBuffer, int i, int i2) {
        return (i + 3 >= i2 || byteBuffer.get(i + 2) != 0) ? 3 : 4;
    }

    public static void p(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        int i = bufferInfo.offset;
        int i2 = bufferInfo.size;
        long j = i + i2;
        if (i < 0 || i2 < 0 || j > byteBuffer.limit()) {
            throw new IOException("Invalid codec buffer range: offset=" + bufferInfo.offset + ", size=" + bufferInfo.size + ", position=" + byteBuffer.position() + ", limit=" + byteBuffer.limit() + ", capacity=" + byteBuffer.capacity());
        }
    }

    public final MediaCodec.BufferInfo b(boolean z, MediaCodec.BufferInfo bufferInfo, long j) {
        long max;
        ao9 ao9Var = this.h;
        ao9 ao9Var2 = this.g;
        ao9 ao9Var3 = z ? ao9Var2 : ao9Var;
        if (j < 0) {
            max = Math.max(0L, j + bufferInfo.presentationTimeUs);
        } else {
            if (this.q != j) {
                this.q = j;
                this.r = Math.max(j, Math.max(ao9Var2.a(), ao9Var.a()));
                ao9Var2.a = Long.MIN_VALUE;
                ao9Var2.b = Long.MIN_VALUE;
                ao9Var.a = Long.MIN_VALUE;
                ao9Var.b = Long.MIN_VALUE;
            }
            long j2 = ao9Var3.a;
            if (j2 == Long.MIN_VALUE) {
                j2 = bufferInfo.presentationTimeUs;
                ao9Var3.a = j2;
            }
            max = Math.max(0L, bufferInfo.presentationTimeUs - j2) + this.r;
        }
        long j3 = bufferInfo.presentationTimeUs;
        long j4 = ao9Var3.b;
        if (j4 != Long.MIN_VALUE) {
            long j5 = j3 - j4;
            if (j5 > 0 && j5 < 1000000) {
                ao9Var3.d = j5;
            }
        }
        ao9Var3.b = j3;
        ao9Var3.c = Math.max(ao9Var3.c, max);
        MediaCodec.BufferInfo bufferInfo2 = new MediaCodec.BufferInfo();
        bufferInfo2.set(bufferInfo.offset, bufferInfo.size, max, bufferInfo.flags);
        return bufferInfo2;
    }

    public final synchronized void c(File file) {
        if (this.i == null) {
            throw new IOException("MP4 tracks are not initialized");
        }
        long nanoTime = System.nanoTime();
        try {
            this.i.finishMovie(file);
            this.d.b("MP4 preview written: file=" + file.getName() + ", size=" + file.length() + ", elapsedMs=" + ((System.nanoTime() - nanoTime) / 1000000));
        } catch (Exception e) {
            throw new IOException("Unable to create preview MP4", e);
        }
    }

    public final synchronized void g() {
        if (this.x) {
            return;
        }
        if (this.i == null) {
            throw new IOException("MP4 tracks are not initialized");
        }
        long nanoTime = System.nanoTime();
        try {
            this.i.finishMovie();
            this.x = true;
            l(this.a.length());
            this.d.b("MP4 finalized: file=" + this.a.getName() + ", size=" + this.a.length() + ", videoSamples=" + this.o + ", audioSamples=" + this.p + ", elapsedMs=" + ((System.nanoTime() - nanoTime) / 1000000));
        } catch (Exception e) {
            throw new IOException("Unable to finish MP4", e);
        }
    }

    public final synchronized long h() {
        long a;
        a = this.g.a();
        if (this.c) {
            a = Math.max(a, this.h.a());
        }
        return a / 1000;
    }

    public final synchronized int i() {
        return this.s;
    }

    public final void j() {
        ArrayList arrayList = this.f;
        if (this.j != null) {
            boolean z = this.c;
            if (z && this.k == null) {
                return;
            }
            Mp4Movie mp4Movie = new Mp4Movie();
            File file = this.a;
            mp4Movie.setCacheFile(file);
            short s = this.b;
            mp4Movie.setSize(s, s);
            try {
                MP4Builder createMovie = new MP4Builder().createMovie(mp4Movie, true, false);
                this.i = createMovie;
                this.l = createMovie.addTrack(this.j, false);
                if (z) {
                    this.m = this.i.addTrack(this.k, true);
                }
                this.d.b("MP4 initialized: file=" + file.getName() + ", output=" + ((int) s) + "x" + ((int) s) + ", includeAudio=" + z + ", pendingSamples=" + arrayList.size());
                for (int i = 0; i < arrayList.size(); i++) {
                    zn9 zn9Var = (zn9) arrayList.get(i);
                    r(zn9Var.a, zn9Var.b, zn9Var.c);
                }
                arrayList.clear();
            } catch (Exception e) {
                throw new IOException("Unable to initialize MP4", e);
            }
        }
    }

    public final void k(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        int position;
        int limit;
        p(byteBuffer, bufferInfo);
        int i = bufferInfo.offset;
        int i2 = bufferInfo.size + i;
        int f = f(byteBuffer, i, i2);
        int i3 = bufferInfo.offset;
        MediaCodec.BufferInfo bufferInfo2 = this.u;
        if (f != i3) {
            int i4 = bufferInfo.size;
            ByteBuffer byteBuffer2 = this.t;
            if (byteBuffer2 == null || byteBuffer2.capacity() < i4) {
                this.t = ByteBuffer.allocateDirect(i4);
            }
            this.t.clear();
            position = byteBuffer.position();
            limit = byteBuffer.limit();
            try {
                byteBuffer.position(bufferInfo.offset);
                byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
                this.t.put(byteBuffer);
                byteBuffer.limit(limit);
                byteBuffer.position(position);
                this.t.flip();
                bufferInfo2.set(0, bufferInfo.size, bufferInfo.presentationTimeUs, bufferInfo.flags);
                return;
            } finally {
            }
        }
        int i5 = 0;
        int i6 = f;
        int i7 = 0;
        while (i6 >= 0) {
            int o = o(byteBuffer, i6, i2) + i6;
            i6 = f(byteBuffer, o, i2);
            int i8 = i6 < 0 ? i2 : i6;
            if (i8 > o) {
                i5++;
                i7 = ((i8 + 4) - o) + i7;
            }
        }
        if (i5 == 0) {
            su3.e("Annex-B video sample contains no NAL units");
            return;
        }
        ByteBuffer byteBuffer3 = this.t;
        if (byteBuffer3 == null || byteBuffer3.capacity() < i7) {
            this.t = ByteBuffer.allocateDirect(i7);
        }
        this.t.clear();
        position = byteBuffer.position();
        limit = byteBuffer.limit();
        while (f >= 0) {
            try {
                int o2 = f + o(byteBuffer, f, i2);
                int f2 = f(byteBuffer, o2, i2);
                int i9 = f2 < 0 ? i2 : f2;
                if (i9 > o2) {
                    this.t.putInt(i9 - o2);
                    byteBuffer.position(o2);
                    byteBuffer.limit(i9);
                    this.t.put(byteBuffer);
                    byteBuffer.limit(limit);
                }
                f = f2;
            } finally {
            }
        }
        byteBuffer.limit(limit);
        byteBuffer.position(position);
        this.t.flip();
        bufferInfo2.set(0, this.t.remaining(), bufferInfo.presentationTimeUs, bufferInfo.flags);
    }

    public final void l(long j) {
        if (j > this.n) {
            this.n = j;
            if (this.w) {
                return;
            }
            m88 m88Var = this.e;
            jp9 jp9Var = (jp9) m88Var.b;
            fp9 fp9Var = (fp9) m88Var.c;
            synchronized (jp9Var.g) {
                long j2 = fp9Var.c;
                long j3 = j - j2;
                if (j3 <= 0 || fp9Var.d) {
                    return;
                }
                fp9Var.c = j;
                jp9Var.k.execute(new o30((Object) jp9Var, (Object) fp9Var, j2, j3, (byte) 13));
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0033, code lost:
    
        if (m(r1, r5, "csd-0") == false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void n(MediaFormat mediaFormat, boolean z) {
        if (this.x) {
            return;
        }
        if (this.i == null) {
            if (z) {
                this.j = mediaFormat;
            } else if (this.c) {
                this.k = mediaFormat;
            }
            j();
            return;
        }
        MediaFormat mediaFormat2 = z ? this.j : this.k;
        if (!z) {
            if (this.c) {
            }
        } else {
            if (m(mediaFormat2, mediaFormat, "csd-0", "csd-1")) {
            }
            throw new yn9((z ? "Video" : "Audio").concat(" codec configuration changed between segments"));
        }
    }

    public final synchronized void q(boolean z, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo, long j) {
        if (this.x || (!(z || this.c) || bufferInfo.size <= 0)) {
            return;
        }
        MediaCodec.BufferInfo b = b(z, bufferInfo, j);
        if (this.i != null) {
            r(z, byteBuffer, b);
            return;
        }
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(bufferInfo.size);
        byteBuffer.position(bufferInfo.offset);
        byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
        allocateDirect.put(byteBuffer).flip();
        b.offset = 0;
        this.f.add(new zn9(z, allocateDirect, b));
    }

    public final void r(boolean z, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        ByteBuffer byteBuffer2;
        MediaCodec.BufferInfo bufferInfo2;
        String d;
        sn9 sn9Var = this.d;
        if (z) {
            try {
                r2 = this.v ? null : e(byteBuffer, bufferInfo);
                k(byteBuffer, bufferInfo);
                byteBuffer2 = this.t;
                bufferInfo2 = this.u;
                if (!this.v) {
                    this.v = true;
                    sn9Var.b("first video sample prepared: " + r2 + ", outputSize=" + bufferInfo2.size);
                }
            } catch (Exception e) {
                if (!z) {
                    r2 = d(byteBuffer, bufferInfo);
                } else if (r2 == null) {
                    try {
                        d = e(byteBuffer, bufferInfo);
                    } catch (Exception unused) {
                        d = d(byteBuffer, bufferInfo);
                    }
                    r2 = d;
                }
                StringBuilder sb = new StringBuilder("MP4 sample write failed: track=");
                String str = MediaStreamTrack.AUDIO_TRACK_KIND;
                sn9Var.a(qu6.o(z ? MediaStreamTrack.VIDEO_TRACK_KIND : MediaStreamTrack.AUDIO_TRACK_KIND, ", ", r2, sb), e);
                StringBuilder sb2 = new StringBuilder("Unable to write ");
                if (z) {
                    str = MediaStreamTrack.VIDEO_TRACK_KIND;
                }
                throw new IOException(qu6.o(str, " MP4 sample: ", r2, sb2), e);
            }
        } else {
            byteBuffer2 = byteBuffer;
            bufferInfo2 = bufferInfo;
        }
        long writeSampleData = this.i.writeSampleData(z ? this.l : this.m, byteBuffer2, bufferInfo2, false);
        if (z) {
            this.o++;
        } else {
            this.p++;
        }
        if (writeSampleData > 0) {
            l(writeSampleData);
        }
    }
}
