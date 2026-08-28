package j4;

import android.net.Uri;
import f7.f5;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class p0 implements com.google.android.exoplayer2.upstream.n0 {
    public final Uri a;
    public final com.google.android.exoplayer2.upstream.x0 b;
    public final c c;
    public final s0 d;
    public final d5.c e;
    public volatile boolean h;
    public long r;
    public com.google.android.exoplayer2.upstream.q s;
    public a1 v;
    public boolean w;
    public final /* synthetic */ s0 x;
    public final m3.n f = new m3.n();
    public boolean n = true;

    public p0(s0 s0Var, Uri uri, com.google.android.exoplayer2.upstream.m mVar, c cVar, s0 s0Var2, d5.c cVar2) {
        this.x = s0Var;
        this.a = uri;
        this.b = new com.google.android.exoplayer2.upstream.x0(mVar);
        this.c = cVar;
        this.d = s0Var2;
        this.e = cVar2;
        q.a.getAndIncrement();
        this.s = b(0L);
    }

    @Override // com.google.android.exoplayer2.upstream.n0
    public final void K() {
        this.h = true;
    }

    @Override // com.google.android.exoplayer2.upstream.n0
    public final void a() {
        com.google.android.exoplayer2.upstream.m mVar;
        int i9;
        int i10 = 0;
        while (i10 == 0 && !this.h) {
            try {
                long j10 = this.f.a;
                com.google.android.exoplayer2.upstream.q b10 = b(j10);
                this.s = b10;
                long open = this.b.open(b10);
                if (open != -1) {
                    open += j10;
                    s0 s0Var = this.x;
                    s0Var.B.post(new o0(s0Var, 2));
                }
                long j11 = open;
                this.x.D = d4.b.a(this.b.a.getResponseHeaders());
                com.google.android.exoplayer2.upstream.x0 x0Var = this.b;
                d4.b bVar = this.x.D;
                if (bVar == null || (i9 = bVar.f) == -1) {
                    mVar = x0Var;
                } else {
                    mVar = new p(x0Var, i9, this);
                    a1 A = this.x.A(new r0(0, true));
                    this.v = A;
                    A.c(s0.Z);
                }
                this.c.C(mVar, this.a, this.b.a.getResponseHeaders(), j10, j11, this.d);
                if (this.x.D != null) {
                    m3.k kVar = (m3.k) this.c.c;
                    if (kVar instanceof t3.d) {
                        ((t3.d) kVar).r = true;
                    }
                }
                if (this.n) {
                    c cVar = this.c;
                    long j12 = this.r;
                    m3.k kVar2 = (m3.k) cVar.c;
                    kVar2.getClass();
                    kVar2.g(j10, j12);
                    this.n = false;
                }
                while (i10 == 0 && !this.h) {
                    try {
                        d5.c cVar2 = this.e;
                        synchronized (cVar2) {
                            while (!cVar2.a) {
                                cVar2.wait();
                            }
                        }
                        c cVar3 = this.c;
                        m3.n nVar = this.f;
                        m3.k kVar3 = (m3.k) cVar3.c;
                        kVar3.getClass();
                        m3.h hVar = (m3.h) cVar3.d;
                        hVar.getClass();
                        i10 = kVar3.b(hVar, nVar);
                        m3.h hVar2 = (m3.h) this.c.d;
                        long j13 = hVar2 != null ? hVar2.d : -1L;
                        if (j13 > this.x.s + j10) {
                            this.e.b();
                            s0 s0Var2 = this.x;
                            s0Var2.B.post(s0Var2.A);
                            j10 = j13;
                        }
                    } catch (InterruptedException unused) {
                        throw new InterruptedIOException();
                    }
                }
                if (i10 == 1) {
                    i10 = 0;
                } else {
                    m3.h hVar3 = (m3.h) this.c.d;
                    if ((hVar3 != null ? hVar3.d : -1L) != -1) {
                        this.f.a = hVar3 != null ? hVar3.d : -1L;
                    }
                }
                f5.a(this.b);
            } catch (Throwable th) {
                if (i10 != 1) {
                    m3.h hVar4 = (m3.h) this.c.d;
                    if ((hVar4 != null ? hVar4.d : -1L) != -1) {
                        this.f.a = hVar4 != null ? hVar4.d : -1L;
                    }
                }
                f5.a(this.b);
                throw th;
            }
        }
    }

    public final com.google.android.exoplayer2.upstream.q b(long j10) {
        Map map = Collections.EMPTY_MAP;
        String str = this.x.r;
        Map map2 = s0.Y;
        Uri uri = this.a;
        d5.a.k(uri, "The uri must be set.");
        return new com.google.android.exoplayer2.upstream.q(uri, 1, null, map2, j10, -1L, str, 6);
    }
}
