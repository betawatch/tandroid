package ki;

import android.media.MediaCodec;
import android.media.MediaFormat;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.telegram.messenger.video.MP4Builder;
import org.telegram.messenger.video.Mp4Movie;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes4.dex */
public final class t {
    public final File a;
    public final int b;
    public final boolean c;
    public final l d;
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
    public final ArrayList f = new ArrayList();
    public final s g = new s(33333);
    public final s h = new s(21333);
    public int l = -1;
    public int m = -1;
    public long q = Long.MIN_VALUE;
    public final MediaCodec.BufferInfo t = new MediaCodec.BufferInfo();

    public t(File file, int i10, boolean z10, l lVar, ah.b bVar) {
        this.a = file;
        this.b = i10;
        this.c = z10;
        this.d = lVar;
        this.e = bVar;
    }

    public static IOException a(String str, Exception exc) {
        return exc instanceof IOException ? (IOException) exc : new IOException(str, exc);
    }

    public static int b(ByteBuffer byteBuffer) {
        if (byteBuffer.limit() >= 4 && byteBuffer.get(0) == 0 && byteBuffer.get(1) == 0 && byteBuffer.get(2) == 0 && byteBuffer.get(3) == 1) {
            return 4;
        }
        return (byteBuffer.limit() >= 3 && byteBuffer.get(0) == 0 && byteBuffer.get(1) == 0 && byteBuffer.get(2) == 1) ? 3 : 0;
    }

    public static int e(ByteBuffer byteBuffer, int i10, int i11) {
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

    public static boolean j(MediaFormat mediaFormat, MediaFormat mediaFormat2, String... strArr) {
        if (mediaFormat != null) {
            for (String str : strArr) {
                ByteBuffer byteBuffer = mediaFormat.getByteBuffer(str);
                ByteBuffer byteBuffer2 = mediaFormat2.getByteBuffer(str);
                if (byteBuffer != null && byteBuffer2 != null) {
                    int b10 = b(byteBuffer);
                    int b11 = b(byteBuffer2);
                    int limit = byteBuffer.limit() - b10;
                    if (limit == byteBuffer2.limit() - b11) {
                        for (int i10 = 0; i10 < limit; i10++) {
                            if (byteBuffer.get(b10 + i10) == byteBuffer2.get(b11 + i10)) {
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

    public static int l(ByteBuffer byteBuffer, int i10, int i11) {
        return (i10 + 3 >= i11 || byteBuffer.get(i10 + 2) != 0) ? 3 : 4;
    }

    public final MediaCodec.BufferInfo c(boolean z10, MediaCodec.BufferInfo bufferInfo, long j3) {
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

    public final synchronized void d(File file) {
        if (this.i == null) {
            throw new IOException("MP4 tracks are not initialized");
        }
        long nanoTime = System.nanoTime();
        try {
            this.i.finishMovie(file);
            this.d.b("MP4 preview written: file=" + file.getName() + ", size=" + file.length() + ", elapsedMs=" + ((System.nanoTime() - nanoTime) / 1000000));
        } catch (Exception e) {
            throw a("Unable to create preview MP4", e);
        }
    }

    public final synchronized void f() {
        if (this.v) {
            return;
        }
        if (this.i == null) {
            throw new IOException("MP4 tracks are not initialized");
        }
        long nanoTime = System.nanoTime();
        try {
            this.i.finishMovie();
            this.v = true;
            i(this.a.length());
            this.d.b("MP4 finalized: file=" + this.a.getName() + ", size=" + this.a.length() + ", videoSamples=" + this.o + ", audioSamples=" + this.p + ", elapsedMs=" + ((System.nanoTime() - nanoTime) / 1000000));
        } catch (Exception e) {
            throw a("Unable to finish MP4", e);
        }
    }

    public final void g() {
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
                    n(rVar.a, rVar.b, rVar.c);
                }
                arrayList.clear();
            } catch (Exception e) {
                throw a("Unable to initialize MP4", e);
            }
        }
    }

    /* JADX WARN: Finally extract failed */
    public final int h(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        int i10 = bufferInfo.offset;
        int i11 = bufferInfo.size + i10;
        int e = e(byteBuffer, i10, i11);
        if (e == bufferInfo.offset) {
            int l4 = l(byteBuffer, e, i11);
            int e7 = e(byteBuffer, e + l4, i11);
            if (l4 == 4 && e7 < 0) {
                return 1;
            }
            int i12 = e;
            int i13 = 0;
            int i14 = 0;
            while (i12 >= 0) {
                int l10 = l(byteBuffer, i12, i11) + i12;
                i12 = e(byteBuffer, l10, i11);
                int i15 = i12 < 0 ? i11 : i12;
                if (i15 > l10) {
                    i13++;
                    i14 += (i15 + 4) - l10;
                }
            }
            if (i13 != 0) {
                ByteBuffer byteBuffer2 = this.s;
                if (byteBuffer2 == null || byteBuffer2.capacity() < i14) {
                    this.s = ByteBuffer.allocateDirect(i14);
                }
                this.s.clear();
                int position = byteBuffer.position();
                int limit = byteBuffer.limit();
                while (e >= 0) {
                    try {
                        int l11 = e + l(byteBuffer, e, i11);
                        int e10 = e(byteBuffer, l11, i11);
                        int i16 = e10 < 0 ? i11 : e10;
                        if (i16 > l11) {
                            this.s.putInt(i16 - l11);
                            byteBuffer.position(l11);
                            byteBuffer.limit(i16);
                            this.s.put(byteBuffer);
                        }
                        e = e10;
                    } catch (Throwable th2) {
                        byteBuffer.limit(limit);
                        byteBuffer.position(position);
                        throw th2;
                    }
                }
                byteBuffer.limit(limit);
                byteBuffer.position(position);
                this.s.flip();
                this.t.set(0, this.s.remaining(), bufferInfo.presentationTimeUs, bufferInfo.flags);
                return 2;
            }
        }
        return 0;
    }

    public final void i(long j3) {
        if (j3 <= this.n) {
            return;
        }
        this.n = j3;
        if (this.u) {
            return;
        }
        ah.b bVar = this.e;
        r0 r0Var = (r0) bVar.b;
        n0 n0Var = (n0) bVar.c;
        synchronized (r0Var.f) {
            try {
                long j10 = n0Var.c;
                long j11 = j3 - j10;
                if (j11 > 0 && !n0Var.d) {
                    n0Var.c = j3;
                    r0Var.j.execute(new a3.g0(r0Var, n0Var, j10, j11, 3));
                }
            } finally {
            }
        }
    }

    public final synchronized void k(MediaFormat mediaFormat, boolean z10) {
        try {
            if (this.v) {
                return;
            }
            if (this.i == null) {
                if (z10) {
                    this.j = mediaFormat;
                } else if (this.c) {
                    this.k = mediaFormat;
                }
                g();
                return;
            }
            MediaFormat mediaFormat2 = z10 ? this.j : this.k;
            if ((!z10 || j(mediaFormat2, mediaFormat, "csd-0", "csd-1")) && (z10 || !this.c || j(mediaFormat2, mediaFormat, "csd-0"))) {
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(z10 ? "Video" : "Audio");
            sb2.append(" codec configuration changed between segments");
            throw new IOException(sb2.toString());
        } finally {
        }
    }

    public final synchronized void m(boolean z10, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo, long j3) {
        try {
            if (!this.v) {
                if (!z10) {
                    if (this.c) {
                    }
                }
                if (bufferInfo.size > 0) {
                    MediaCodec.BufferInfo c10 = c(z10, bufferInfo, j3);
                    if (this.i != null) {
                        n(z10, byteBuffer, c10);
                        return;
                    }
                    ByteBuffer allocateDirect = ByteBuffer.allocateDirect(bufferInfo.size);
                    byteBuffer.position(bufferInfo.offset);
                    byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
                    allocateDirect.put(byteBuffer).flip();
                    c10.offset = 0;
                    this.f.add(new r(z10, allocateDirect, c10));
                }
            }
        } finally {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0037 A[Catch: Exception -> 0x000f, TRY_LEAVE, TryCatch #0 {Exception -> 0x000f, blocks: (B:23:0x0002, B:25:0x000a, B:3:0x0015, B:5:0x0019, B:6:0x001e, B:8:0x0026, B:11:0x0037, B:20:0x002c, B:21:0x001c), top: B:22:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x002c A[Catch: Exception -> 0x000f, TryCatch #0 {Exception -> 0x000f, blocks: (B:23:0x0002, B:25:0x000a, B:3:0x0015, B:5:0x0019, B:6:0x001e, B:8:0x0026, B:11:0x0037, B:20:0x002c, B:21:0x001c), top: B:22:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x001c A[Catch: Exception -> 0x000f, TryCatch #0 {Exception -> 0x000f, blocks: (B:23:0x0002, B:25:0x000a, B:3:0x0015, B:5:0x0019, B:6:0x001e, B:8:0x0026, B:11:0x0037, B:20:0x002c, B:21:0x001c), top: B:22:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:5:0x0019 A[Catch: Exception -> 0x000f, TryCatch #0 {Exception -> 0x000f, blocks: (B:23:0x0002, B:25:0x000a, B:3:0x0015, B:5:0x0019, B:6:0x001e, B:8:0x0026, B:11:0x0037, B:20:0x002c, B:21:0x001c), top: B:22:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026 A[Catch: Exception -> 0x000f, TryCatch #0 {Exception -> 0x000f, blocks: (B:23:0x0002, B:25:0x000a, B:3:0x0015, B:5:0x0019, B:6:0x001e, B:8:0x0026, B:11:0x0037, B:20:0x002c, B:21:0x001c), top: B:22:0x0002 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n(boolean z10, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        boolean z11;
        long writeSampleData;
        if (z10) {
            try {
                int h = h(byteBuffer, bufferInfo);
                z11 = false;
                if (h == 2) {
                    byteBuffer = this.s;
                    bufferInfo = this.t;
                } else if (h == 0) {
                }
                writeSampleData = this.i.writeSampleData(!z10 ? this.l : this.m, byteBuffer, bufferInfo, z11);
                if (z10) {
                    this.p++;
                } else {
                    this.o++;
                }
                if (writeSampleData <= 0) {
                    i(writeSampleData);
                    return;
                }
                return;
            } catch (Exception e) {
                throw a("Unable to write MP4 sample", e);
            }
        }
        z11 = z10;
        writeSampleData = this.i.writeSampleData(!z10 ? this.l : this.m, byteBuffer, bufferInfo, z11);
        if (z10) {
        }
        if (writeSampleData <= 0) {
        }
    }
}
