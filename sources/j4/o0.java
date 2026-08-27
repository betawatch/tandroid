package j4;

import android.net.Uri;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class o0 implements com.google.android.exoplayer2.upstream.n0 {
    public final Uri a;
    public final com.google.android.exoplayer2.upstream.x0 b;
    public final a5.n c;
    public final r0 d;
    public final d5.c e;
    public volatile boolean h;
    public long r;
    public com.google.android.exoplayer2.upstream.q s;
    public a1 v;
    public boolean w;
    public final /* synthetic */ r0 x;
    public final m3.n f = new m3.n();
    public boolean n = true;

    public o0(r0 r0Var, Uri uri, com.google.android.exoplayer2.upstream.m mVar, a5.n nVar, r0 r0Var2, d5.c cVar) {
        this.x = r0Var;
        this.a = uri;
        this.b = new com.google.android.exoplayer2.upstream.x0(mVar);
        this.c = nVar;
        this.d = r0Var2;
        this.e = cVar;
        p.a.getAndIncrement();
        this.s = b(0L);
    }

    @Override // com.google.android.exoplayer2.upstream.n0
    public final void a() {
        com.google.android.exoplayer2.upstream.m mVar;
        int i10;
        int i11 = 0;
        while (i11 == 0 && !this.h) {
            try {
                long j10 = this.f.a;
                com.google.android.exoplayer2.upstream.q b10 = b(j10);
                this.s = b10;
                long open = this.b.open(b10);
                if (open != -1) {
                    open += j10;
                    r0 r0Var = this.x;
                    r0Var.A.post(new n0(r0Var, 2));
                }
                long j11 = open;
                this.x.C = d4.b.a(this.b.a.getResponseHeaders());
                com.google.android.exoplayer2.upstream.x0 x0Var = this.b;
                d4.b bVar = this.x.C;
                if (bVar == null || (i10 = bVar.f) == -1) {
                    mVar = x0Var;
                } else {
                    mVar = new o(x0Var, i10, this);
                    a1 t10 = this.x.t(new q0(0, true));
                    this.v = t10;
                    t10.c(r0.Y);
                }
                this.c.w(mVar, this.a, this.b.a.getResponseHeaders(), j10, j11, this.d);
                if (this.x.C != null) {
                    m3.k kVar = (m3.k) this.c.c;
                    if (kVar instanceof t3.d) {
                        ((t3.d) kVar).r = true;
                    }
                }
                if (this.n) {
                    a5.n nVar = this.c;
                    long j12 = this.r;
                    m3.k kVar2 = (m3.k) nVar.c;
                    kVar2.getClass();
                    kVar2.g(j10, j12);
                    this.n = false;
                }
                while (i11 == 0 && !this.h) {
                    try {
                        d5.c cVar = this.e;
                        synchronized (cVar) {
                            while (!cVar.a) {
                                cVar.wait();
                            }
                        }
                        a5.n nVar2 = this.c;
                        m3.n nVar3 = this.f;
                        m3.k kVar3 = (m3.k) nVar2.c;
                        kVar3.getClass();
                        m3.h hVar = (m3.h) nVar2.d;
                        hVar.getClass();
                        i11 = kVar3.b(hVar, nVar3);
                        m3.h hVar2 = (m3.h) this.c.d;
                        long j13 = hVar2 != null ? hVar2.d : -1L;
                        if (j13 > this.x.r + j10) {
                            this.e.b();
                            r0 r0Var2 = this.x;
                            r0Var2.A.post(r0Var2.y);
                            j10 = j13;
                        }
                    } catch (InterruptedException unused) {
                        throw new InterruptedIOException();
                    }
                }
                if (i11 == 1) {
                    i11 = 0;
                } else {
                    m3.h hVar3 = (m3.h) this.c.d;
                    if ((hVar3 != null ? hVar3.d : -1L) != -1) {
                        this.f.a = hVar3 != null ? hVar3.d : -1L;
                    }
                }
                g7.l0.a(this.b);
            } catch (Throwable th) {
                if (i11 != 1) {
                    m3.h hVar4 = (m3.h) this.c.d;
                    if ((hVar4 != null ? hVar4.d : -1L) != -1) {
                        this.f.a = hVar4 != null ? hVar4.d : -1L;
                    }
                }
                g7.l0.a(this.b);
                throw th;
            }
        }
    }

    public final com.google.android.exoplayer2.upstream.q b(long j10) {
        Map map = Collections.EMPTY_MAP;
        Map map2 = r0.X;
        Uri uri = this.a;
        d5.a.k(uri, "The uri must be set.");
        return new com.google.android.exoplayer2.upstream.q(uri, 1, null, map2, j10, -1L, null, 6);
    }

    @Override // com.google.android.exoplayer2.upstream.n0
    public final void l() {
        this.h = true;
    }
}
