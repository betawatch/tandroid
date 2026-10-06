package ki;

import android.media.MediaCodec;
import android.media.MediaFormat;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.telegram.messenger.video.MP4Builder;
import org.telegram.messenger.video.Mp4Movie;
import org.webrtc.MediaStreamTrack;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes4.dex */
public final class t {
    public final File a;
    public final int b;
    public final boolean c;
    public final m d;
    public final ah.b e;
    public MP4Builder i;
    public MediaFormat j;
    public MediaFormat k;
    public long n;
    public long o;
    public long p;
    public long r;
    public ByteBuffer s;
    public boolean u;
    public boolean v;
    public boolean w;
    public final ArrayList f = new ArrayList();
    public final s g = new s(33333);
    public final s h = new s(21333);
    public int l = -1;
    public int m = -1;
    public long q = Long.MIN_VALUE;
    public final MediaCodec.BufferInfo t = new MediaCodec.BufferInfo();

    public t(File file, int i10, boolean z10, m mVar, ah.b bVar) {
        this.a = file;
        this.b = i10;
        this.c = z10;
        this.d = mVar;
        this.e = bVar;
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
        int i10;
        int i11;
        n(byteBuffer, bufferInfo);
        int i12 = bufferInfo.offset;
        int i13 = bufferInfo.size + i12;
        int f7 = f(byteBuffer, i12, i13);
        if (f7 == bufferInfo.offset) {
            i10 = m(byteBuffer, f7, i13);
            i11 = 0;
            while (f7 >= 0) {
                i11++;
                f7 = f(byteBuffer, m(byteBuffer, f7, i13) + f7, i13);
            }
        } else {
            i10 = 0;
            i11 = 0;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(d(byteBuffer, bufferInfo));
        sb2.append(", format=");
        sb2.append(i11 > 0 ? "annex-b" : "avcc");
        sb2.append(", nalCount=");
        sb2.append(i11);
        sb2.append(", firstPrefix=");
        sb2.append(i10);
        sb2.append(", head=");
        int i14 = bufferInfo.offset;
        StringBuilder sb3 = new StringBuilder();
        int min = Math.min(16, i13 - i14);
        for (int i15 = 0; i15 < min; i15++) {
            if (i15 > 0) {
                sb3.append(' ');
            }
            int i16 = byteBuffer.get(i14 + i15) & 255;
            if (i16 < 16) {
                sb3.append('0');
            }
            sb3.append(Integer.toHexString(i16));
        }
        sb2.append(sb3.toString());
        return sb2.toString();
    }

    public static int f(ByteBuffer byteBuffer, int i10, int i11) {
        int i12;
        while (true) {
            int i13 = i10 + 2;
            if (i13 >= i11) {
                return -1;
            }
            if (byteBuffer.get(i10) != 0 || byteBuffer.get(i10 + 1) != 0 || (byteBuffer.get(i13) != 1 && ((i12 = i10 + 3) >= i11 || byteBuffer.get(i13) != 0 || byteBuffer.get(i12) != 1))) {
                i10++;
            }
        }
        return i10;
    }

    public static boolean k(MediaFormat mediaFormat, MediaFormat mediaFormat2, String... strArr) {
        if (mediaFormat != null) {
            for (String str : strArr) {
                ByteBuffer byteBuffer = mediaFormat.getByteBuffer(str);
                ByteBuffer byteBuffer2 = mediaFormat2.getByteBuffer(str);
                if (byteBuffer != null && byteBuffer2 != null) {
                    int a2 = a(byteBuffer);
                    int a10 = a(byteBuffer2);
                    int limit = byteBuffer.limit() - a2;
                    if (limit == byteBuffer2.limit() - a10) {
                        for (int i10 = 0; i10 < limit; i10++) {
                            if (byteBuffer.get(a2 + i10) == byteBuffer2.get(a10 + i10)) {
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

    public static int m(ByteBuffer byteBuffer, int i10, int i11) {
        return (i10 + 3 >= i11 || byteBuffer.get(i10 + 2) != 0) ? 3 : 4;
    }

    public static void n(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        int i10 = bufferInfo.offset;
        int i11 = bufferInfo.size;
        long j3 = i10 + i11;
        if (i10 < 0 || i11 < 0 || j3 > byteBuffer.limit()) {
            throw new IOException("Invalid codec buffer range: offset=" + bufferInfo.offset + ", size=" + bufferInfo.size + ", position=" + byteBuffer.position() + ", limit=" + byteBuffer.limit() + ", capacity=" + byteBuffer.capacity());
        }
    }

    public final MediaCodec.BufferInfo b(boolean z10, MediaCodec.BufferInfo bufferInfo, long j3) {
        long j10;
        long j11;
        long max;
        s sVar = this.h;
        s sVar2 = this.g;
        s sVar3 = z10 ? sVar2 : sVar;
        if (j3 < 0) {
            max = Math.max(0L, j3 + bufferInfo.presentationTimeUs);
            j11 = 0;
        } else {
            if (this.q != j3) {
                this.q = j3;
                long j12 = sVar2.c;
                long max2 = j12 != Long.MIN_VALUE ? Math.max(1L, sVar2.d) + j12 : 0L;
                long j13 = sVar.c;
                this.r = Math.max(j3, Math.max(max2, j13 == Long.MIN_VALUE ? 0L : Math.max(1L, sVar.d) + j13));
                j10 = Long.MIN_VALUE;
                sVar2.a = Long.MIN_VALUE;
                sVar2.b = Long.MIN_VALUE;
                sVar.a = Long.MIN_VALUE;
                sVar.b = Long.MIN_VALUE;
            } else {
                j10 = Long.MIN_VALUE;
            }
            if (sVar3.a == j10) {
                sVar3.a = bufferInfo.presentationTimeUs;
            }
            j11 = 0;
            max = this.r + Math.max(0L, bufferInfo.presentationTimeUs - sVar3.a);
        }
        long j14 = max;
        long j15 = bufferInfo.presentationTimeUs;
        long j16 = sVar3.b;
        if (j16 != Long.MIN_VALUE) {
            long j17 = j15 - j16;
            if (j17 > j11 && j17 < 1000000) {
                sVar3.d = j17;
            }
        }
        sVar3.b = j15;
        sVar3.c = Math.max(sVar3.c, j14);
        MediaCodec.BufferInfo bufferInfo2 = new MediaCodec.BufferInfo();
        bufferInfo2.set(bufferInfo.offset, bufferInfo.size, j14, bufferInfo.flags);
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
        } catch (Exception e7) {
            throw new IOException("Unable to create preview MP4", e7);
        }
    }

    public final synchronized void g() {
        if (this.w) {
            return;
        }
        if (this.i == null) {
            throw new IOException("MP4 tracks are not initialized");
        }
        long nanoTime = System.nanoTime();
        try {
            this.i.finishMovie();
            this.w = true;
            j(this.a.length());
            this.d.b("MP4 finalized: file=" + this.a.getName() + ", size=" + this.a.length() + ", videoSamples=" + this.o + ", audioSamples=" + this.p + ", elapsedMs=" + ((System.nanoTime() - nanoTime) / 1000000));
        } catch (Exception e7) {
            throw new IOException("Unable to finish MP4", e7);
        }
    }

    public final void h() {
        ArrayList arrayList = this.f;
        if (this.j != null) {
            boolean z10 = this.c;
            if (z10 && this.k == null) {
                return;
            }
            Mp4Movie mp4Movie = new Mp4Movie();
            File file = this.a;
            mp4Movie.setCacheFile(file);
            int i10 = this.b;
            mp4Movie.setSize(i10, i10);
            try {
                MP4Builder createMovie = new MP4Builder().createMovie(mp4Movie, true, false);
                this.i = createMovie;
                this.l = createMovie.addTrack(this.j, false);
                if (z10) {
                    this.m = this.i.addTrack(this.k, true);
                }
                this.d.b("MP4 initialized: file=" + file.getName() + ", output=" + i10 + "x" + i10 + ", includeAudio=" + z10 + ", pendingSamples=" + arrayList.size());
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    r rVar = (r) arrayList.get(i11);
                    p(rVar.a, rVar.b, rVar.c);
                }
                arrayList.clear();
            } catch (Exception e7) {
                throw new IOException("Unable to initialize MP4", e7);
            }
        }
    }

    public final void i(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        int position;
        int limit;
        n(byteBuffer, bufferInfo);
        int i10 = bufferInfo.offset;
        int i11 = bufferInfo.size + i10;
        int f7 = f(byteBuffer, i10, i11);
        if (f7 != bufferInfo.offset) {
            int i12 = bufferInfo.size;
            ByteBuffer byteBuffer2 = this.s;
            if (byteBuffer2 == null || byteBuffer2.capacity() < i12) {
                this.s = ByteBuffer.allocateDirect(i12);
            }
            this.s.clear();
            position = byteBuffer.position();
            limit = byteBuffer.limit();
            try {
                byteBuffer.position(bufferInfo.offset);
                byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
                this.s.put(byteBuffer);
                byteBuffer.limit(limit);
                byteBuffer.position(position);
                this.s.flip();
                this.t.set(0, bufferInfo.size, bufferInfo.presentationTimeUs, bufferInfo.flags);
                return;
            } finally {
            }
        }
        int i13 = 0;
        int i14 = f7;
        int i15 = 0;
        while (i14 >= 0) {
            int m10 = m(byteBuffer, i14, i11) + i14;
            i14 = f(byteBuffer, m10, i11);
            int i16 = i14 < 0 ? i11 : i14;
            if (i16 > m10) {
                i13++;
                i15 = ((i16 + 4) - m10) + i15;
            }
        }
        if (i13 == 0) {
            throw new IOException("Annex-B video sample contains no NAL units");
        }
        ByteBuffer byteBuffer3 = this.s;
        if (byteBuffer3 == null || byteBuffer3.capacity() < i15) {
            this.s = ByteBuffer.allocateDirect(i15);
        }
        this.s.clear();
        position = byteBuffer.position();
        limit = byteBuffer.limit();
        while (f7 >= 0) {
            try {
                int m11 = f7 + m(byteBuffer, f7, i11);
                int f10 = f(byteBuffer, m11, i11);
                int i17 = f10 < 0 ? i11 : f10;
                if (i17 > m11) {
                    this.s.putInt(i17 - m11);
                    byteBuffer.position(m11);
                    byteBuffer.limit(i17);
                    this.s.put(byteBuffer);
                }
                f7 = f10;
            } finally {
            }
        }
        byteBuffer.limit(limit);
        byteBuffer.position(position);
        this.s.flip();
        this.t.set(0, this.s.remaining(), bufferInfo.presentationTimeUs, bufferInfo.flags);
    }

    public final void j(long j3) {
        if (j3 <= this.n) {
            return;
        }
        this.n = j3;
        if (this.v) {
            return;
        }
        ah.b bVar = this.e;
        s0 s0Var = (s0) bVar.b;
        o0 o0Var = (o0) bVar.c;
        synchronized (s0Var.g) {
            try {
                long j10 = o0Var.c;
                long j11 = j3 - j10;
                if (j11 > 0 && !o0Var.d) {
                    o0Var.c = j3;
                    s0Var.k.execute(new a3.g0(s0Var, o0Var, j10, j11, 3));
                }
            } finally {
            }
        }
    }

    public final synchronized void l(MediaFormat mediaFormat, boolean z10) {
        try {
            if (this.w) {
                return;
            }
            if (this.i == null) {
                if (z10) {
                    this.j = mediaFormat;
                } else if (this.c) {
                    this.k = mediaFormat;
                }
                h();
                return;
            }
            MediaFormat mediaFormat2 = z10 ? this.j : this.k;
            if ((!z10 || k(mediaFormat2, mediaFormat, "csd-0", "csd-1")) && (z10 || !this.c || k(mediaFormat2, mediaFormat, "csd-0"))) {
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(z10 ? "Video" : "Audio");
            sb2.append(" codec configuration changed between segments");
            throw new IOException(sb2.toString());
        } finally {
        }
    }

    public final synchronized void o(boolean z10, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo, long j3) {
        try {
            if (!this.w) {
                if (!z10) {
                    if (this.c) {
                    }
                }
                if (bufferInfo.size > 0) {
                    MediaCodec.BufferInfo b10 = b(z10, bufferInfo, j3);
                    if (this.i != null) {
                        p(z10, byteBuffer, b10);
                        return;
                    }
                    ByteBuffer allocateDirect = ByteBuffer.allocateDirect(bufferInfo.size);
                    byteBuffer.position(bufferInfo.offset);
                    byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
                    allocateDirect.put(byteBuffer).flip();
                    b10.offset = 0;
                    this.f.add(new r(z10, allocateDirect, b10));
                }
            }
        } finally {
        }
    }

    public final void p(boolean z10, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        ByteBuffer byteBuffer2;
        MediaCodec.BufferInfo bufferInfo2;
        String d;
        m mVar = this.d;
        if (z10) {
            try {
                r2 = this.u ? null : e(byteBuffer, bufferInfo);
                i(byteBuffer, bufferInfo);
                byteBuffer2 = this.s;
                bufferInfo2 = this.t;
                if (!this.u) {
                    this.u = true;
                    mVar.b("first video sample prepared: " + r2 + ", outputSize=" + bufferInfo2.size);
                }
            } catch (Exception e7) {
                if (!z10) {
                    r2 = d(byteBuffer, bufferInfo);
                } else if (r2 == null) {
                    try {
                        d = e(byteBuffer, bufferInfo);
                    } catch (Exception unused) {
                        d = d(byteBuffer, bufferInfo);
                    }
                    r2 = d;
                }
                StringBuilder sb2 = new StringBuilder("MP4 sample write failed: track=");
                String str = MediaStreamTrack.AUDIO_TRACK_KIND;
                mVar.a(a4.a.r(z10 ? MediaStreamTrack.VIDEO_TRACK_KIND : MediaStreamTrack.AUDIO_TRACK_KIND, ", ", r2, sb2), e7);
                StringBuilder sb3 = new StringBuilder("Unable to write ");
                if (z10) {
                    str = MediaStreamTrack.VIDEO_TRACK_KIND;
                }
                throw new IOException(a4.a.r(str, " MP4 sample: ", r2, sb3), e7);
            }
        } else {
            byteBuffer2 = byteBuffer;
            bufferInfo2 = bufferInfo;
        }
        long writeSampleData = this.i.writeSampleData(z10 ? this.l : this.m, byteBuffer2, bufferInfo2, false);
        if (z10) {
            this.o++;
        } else {
            this.p++;
        }
        if (writeSampleData > 0) {
            j(writeSampleData);
        }
    }
}
