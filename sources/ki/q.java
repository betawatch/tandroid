package ki;

import android.media.MediaCodec;
import android.media.MediaFormat;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.telegram.messenger.video.MP4Builder;
import org.telegram.messenger.video.Mp4Movie;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes4.dex */
public final class q {
    public final File a;
    public final int b;
    public final boolean c;
    public final k d;
    public final ah.b e;
    public MP4Builder g;
    public MediaFormat h;
    public MediaFormat i;
    public long l;
    public long m;
    public long n;
    public boolean o;
    public final ArrayList f = new ArrayList();
    public int j = -1;
    public int k = -1;

    public q(File file, int i10, boolean z10, k kVar, ah.b bVar) {
        this.a = file;
        this.b = i10;
        this.c = z10;
        this.d = kVar;
        this.e = bVar;
    }

    public static IOException a(String str, Exception exc) {
        return exc instanceof IOException ? (IOException) exc : new IOException(str, exc);
    }

    public final synchronized void b(File file) {
        if (this.g == null) {
            throw new IOException("MP4 tracks are not initialized");
        }
        long nanoTime = System.nanoTime();
        try {
            this.g.finishMovie(file);
            this.d.b("MP4 preview written: file=" + file.getName() + ", size=" + file.length() + ", elapsedMs=" + ((System.nanoTime() - nanoTime) / 1000000));
        } catch (Exception e) {
            throw a("Unable to create preview MP4", e);
        }
    }

    public final synchronized void c() {
        if (this.o) {
            return;
        }
        if (this.g == null) {
            throw new IOException("MP4 tracks are not initialized");
        }
        long nanoTime = System.nanoTime();
        try {
            this.g.finishMovie();
            this.o = true;
            e(this.a.length());
            this.d.b("MP4 finalized: file=" + this.a.getName() + ", size=" + this.a.length() + ", videoSamples=" + this.m + ", audioSamples=" + this.n + ", elapsedMs=" + ((System.nanoTime() - nanoTime) / 1000000));
        } catch (Exception e) {
            throw a("Unable to finish MP4", e);
        }
    }

    public final void d() {
        ArrayList arrayList = this.f;
        if (this.h != null) {
            boolean z10 = this.c;
            if (z10 && this.i == null) {
                return;
            }
            Mp4Movie mp4Movie = new Mp4Movie();
            File file = this.a;
            mp4Movie.setCacheFile(file);
            int i10 = this.b;
            mp4Movie.setSize(i10, i10);
            try {
                MP4Builder createMovie = new MP4Builder().createMovie(mp4Movie, true, false);
                this.g = createMovie;
                this.j = createMovie.addTrack(this.h, false);
                if (z10) {
                    this.k = this.g.addTrack(this.i, true);
                }
                this.d.b("MP4 initialized: file=" + file.getName() + ", output=" + i10 + "x" + i10 + ", includeAudio=" + z10 + ", pendingSamples=" + arrayList.size());
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    p pVar = (p) arrayList.get(i11);
                    h(pVar.a, pVar.b, pVar.c);
                }
                arrayList.clear();
            } catch (Exception e) {
                throw a("Unable to initialize MP4", e);
            }
        }
    }

    public final void e(long j3) {
        if (j3 <= this.l) {
            return;
        }
        this.l = j3;
        ah.b bVar = this.e;
        q0 q0Var = (q0) bVar.b;
        m0 m0Var = (m0) bVar.c;
        synchronized (q0Var.f) {
            try {
                long j10 = m0Var.c;
                long j11 = j3 - j10;
                if (j11 > 0 && !m0Var.d) {
                    m0Var.c = j3;
                    q0Var.j.execute(new a3.g0(q0Var, m0Var, j10, j11, 3));
                }
            } finally {
            }
        }
    }

    public final synchronized void f(MediaFormat mediaFormat, boolean z10) {
        try {
            if (!this.o && this.g == null) {
                if (z10) {
                    this.h = mediaFormat;
                } else if (this.c) {
                    this.i = mediaFormat;
                }
                d();
            }
        } finally {
        }
    }

    public final synchronized void g(boolean z10, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo, long j3) {
        try {
            if (!this.o) {
                if (!z10) {
                    if (this.c) {
                    }
                }
                if (bufferInfo.size > 0) {
                    MediaCodec.BufferInfo bufferInfo2 = new MediaCodec.BufferInfo();
                    bufferInfo2.set(bufferInfo.offset, bufferInfo.size, Math.max(0L, j3 + bufferInfo.presentationTimeUs), bufferInfo.flags);
                    if (this.g != null) {
                        h(z10, byteBuffer, bufferInfo2);
                        return;
                    }
                    ByteBuffer allocateDirect = ByteBuffer.allocateDirect(bufferInfo.size);
                    byteBuffer.position(bufferInfo.offset);
                    byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
                    allocateDirect.put(byteBuffer).flip();
                    bufferInfo2.offset = 0;
                    this.f.add(new p(z10, allocateDirect, bufferInfo2));
                }
            }
        } finally {
        }
    }

    public final void h(boolean z10, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        try {
            long writeSampleData = this.g.writeSampleData(z10 ? this.j : this.k, byteBuffer, bufferInfo, z10);
            if (z10) {
                this.m++;
            } else {
                this.n++;
            }
            if (writeSampleData > 0) {
                e(writeSampleData);
            }
        } catch (Exception e) {
            throw a("Unable to write MP4 sample", e);
        }
    }
}
