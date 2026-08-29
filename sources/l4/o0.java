package l4;

import android.net.Uri;
import h7.m5;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class o0 implements com.google.android.exoplayer2.upstream.n0 {
    public final Uri a;
    public final com.google.android.exoplayer2.upstream.x0 b;
    public final l3.g0 c;
    public final r0 d;
    public final f5.c e;
    public volatile boolean h;
    public long r;
    public com.google.android.exoplayer2.upstream.q s;
    public b1 v;
    public boolean w;
    public final /* synthetic */ r0 x;
    public final o3.n f = new o3.n();
    public boolean n = true;

    public o0(r0 r0Var, Uri uri, com.google.android.exoplayer2.upstream.m mVar, l3.g0 g0Var, r0 r0Var2, f5.c cVar) {
        this.x = r0Var;
        this.a = uri;
        this.b = new com.google.android.exoplayer2.upstream.x0(mVar);
        this.c = g0Var;
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
                    r0Var.B.post(new n0(r0Var, 2));
                }
                long j11 = open;
                this.x.D = f4.b.a(this.b.a.getResponseHeaders());
                com.google.android.exoplayer2.upstream.x0 x0Var = this.b;
                f4.b bVar = this.x.D;
                if (bVar == null || (i10 = bVar.f) == -1) {
                    mVar = x0Var;
                } else {
                    mVar = new o(x0Var, i10, this);
                    b1 u10 = this.x.u(new q0(0, true));
                    this.v = u10;
                    u10.b(r0.Z);
                }
                this.c.x(mVar, this.a, this.b.a.getResponseHeaders(), j10, j11, this.d);
                if (this.x.D != null) {
                    o3.k kVar = (o3.k) this.c.c;
                    if (kVar instanceof v3.d) {
                        ((v3.d) kVar).r = true;
                    }
                }
                if (this.n) {
                    l3.g0 g0Var = this.c;
                    long j12 = this.r;
                    o3.k kVar2 = (o3.k) g0Var.c;
                    kVar2.getClass();
                    kVar2.f(j10, j12);
                    this.n = false;
                }
                while (i11 == 0 && !this.h) {
                    try {
                        f5.c cVar = this.e;
                        synchronized (cVar) {
                            while (!cVar.a) {
                                cVar.wait();
                            }
                        }
                        l3.g0 g0Var2 = this.c;
                        o3.n nVar = this.f;
                        o3.k kVar3 = (o3.k) g0Var2.c;
                        kVar3.getClass();
                        o3.h hVar = (o3.h) g0Var2.d;
                        hVar.getClass();
                        i11 = kVar3.d(hVar, nVar);
                        o3.h hVar2 = (o3.h) this.c.d;
                        long j13 = hVar2 != null ? hVar2.d : -1L;
                        if (j13 > this.x.s + j10) {
                            this.e.b();
                            r0 r0Var2 = this.x;
                            r0Var2.B.post(r0Var2.A);
                            j10 = j13;
                        }
                    } catch (InterruptedException unused) {
                        throw new InterruptedIOException();
                    }
                }
                if (i11 == 1) {
                    i11 = 0;
                } else {
                    o3.h hVar3 = (o3.h) this.c.d;
                    if ((hVar3 != null ? hVar3.d : -1L) != -1) {
                        this.f.a = hVar3 != null ? hVar3.d : -1L;
                    }
                }
                m5.a(this.b);
            } catch (Throwable th2) {
                if (i11 != 1) {
                    o3.h hVar4 = (o3.h) this.c.d;
                    if ((hVar4 != null ? hVar4.d : -1L) != -1) {
                        this.f.a = hVar4 != null ? hVar4.d : -1L;
                    }
                }
                m5.a(this.b);
                throw th2;
            }
        }
    }

    public final com.google.android.exoplayer2.upstream.q b(long j10) {
        Map map = Collections.EMPTY_MAP;
        String str = this.x.r;
        Map map2 = r0.Y;
        Uri uri = this.a;
        f5.a.k(uri, "The uri must be set.");
        return new com.google.android.exoplayer2.upstream.q(uri, 1, null, map2, j10, -1L, str, 6);
    }

    @Override // com.google.android.exoplayer2.upstream.n0
    public final void q() {
        this.h = true;
    }
}
