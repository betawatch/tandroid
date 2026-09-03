package o4;

import android.net.Uri;
import j7.q7;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.Map;
import l7.w0;
import org.telegram.ui.Components.jb;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class b0 implements g5.j0 {
    public final Uri a;
    public final g5.u0 b;
    public final w0 c;
    public final e0 d;
    public final h5.c e;
    public volatile boolean h;
    public long r;
    public g5.p s;
    public k0 v;
    public boolean w;
    public final /* synthetic */ e0 x;
    public final jb f = new jb();
    public boolean n = true;

    public b0(e0 e0Var, Uri uri, g5.m mVar, w0 w0Var, e0 e0Var2, h5.c cVar) {
        this.x = e0Var;
        this.a = uri;
        this.b = new g5.u0(mVar);
        this.c = w0Var;
        this.d = e0Var2;
        this.e = cVar;
        j.a.getAndIncrement();
        this.s = b(0L);
    }

    @Override // g5.j0
    public final void a() {
        g5.m mVar;
        int i10;
        int i11 = 0;
        while (i11 == 0 && !this.h) {
            try {
                long j10 = this.f.a;
                g5.p b10 = b(j10);
                this.s = b10;
                long open = this.b.open(b10);
                if (open != -1) {
                    open += j10;
                    e0 e0Var = this.x;
                    e0Var.C.post(new a0(e0Var, 2));
                }
                long j11 = open;
                this.x.E = i4.b.a(this.b.a.getResponseHeaders());
                g5.u0 u0Var = this.b;
                i4.b bVar = this.x.E;
                if (bVar == null || (i10 = bVar.f) == -1) {
                    mVar = u0Var;
                } else {
                    mVar = new i(u0Var, i10, this);
                    k0 z4 = this.x.z(new d0(0, true));
                    this.v = z4;
                    z4.b(e0.a0);
                }
                this.c.x(mVar, this.a, this.b.a.getResponseHeaders(), j10, j11, this.d);
                if (this.x.E != null) {
                    r3.k kVar = (r3.k) this.c.c;
                    if (kVar instanceof y3.e) {
                        ((y3.e) kVar).r = true;
                    }
                }
                if (this.n) {
                    w0 w0Var = this.c;
                    long j12 = this.r;
                    r3.k kVar2 = (r3.k) w0Var.c;
                    kVar2.getClass();
                    kVar2.d(j10, j12);
                    this.n = false;
                }
                while (i11 == 0 && !this.h) {
                    try {
                        h5.c cVar = this.e;
                        synchronized (cVar) {
                            while (!cVar.a) {
                                cVar.wait();
                            }
                        }
                        w0 w0Var2 = this.c;
                        jb jbVar = this.f;
                        r3.k kVar3 = (r3.k) w0Var2.c;
                        kVar3.getClass();
                        r3.h hVar = (r3.h) w0Var2.d;
                        hVar.getClass();
                        i11 = kVar3.h(hVar, jbVar);
                        r3.h hVar2 = (r3.h) this.c.d;
                        long j13 = hVar2 != null ? hVar2.d : -1L;
                        if (j13 > this.x.s + j10) {
                            this.e.b();
                            e0 e0Var2 = this.x;
                            e0Var2.C.post(e0Var2.B);
                            j10 = j13;
                        }
                    } catch (InterruptedException unused) {
                        throw new InterruptedIOException();
                    }
                }
                if (i11 == 1) {
                    i11 = 0;
                } else {
                    r3.h hVar3 = (r3.h) this.c.d;
                    if ((hVar3 != null ? hVar3.d : -1L) != -1) {
                        this.f.a = hVar3 != null ? hVar3.d : -1L;
                    }
                }
                q7.a(this.b);
            } catch (Throwable th2) {
                if (i11 != 1) {
                    r3.h hVar4 = (r3.h) this.c.d;
                    if ((hVar4 != null ? hVar4.d : -1L) != -1) {
                        this.f.a = hVar4 != null ? hVar4.d : -1L;
                    }
                }
                q7.a(this.b);
                throw th2;
            }
        }
    }

    public final g5.p b(long j10) {
        Map map = Collections.EMPTY_MAP;
        String str = this.x.r;
        Map map2 = e0.Z;
        Uri uri = this.a;
        h5.a.k(uri, "The uri must be set.");
        return new g5.p(uri, 1, null, map2, j10, -1L, str, 6);
    }

    @Override // g5.j0
    public final void l() {
        this.h = true;
    }
}
