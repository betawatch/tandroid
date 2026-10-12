package j3;

import ad.d;
import b2.u0;
import b2.w;
import b2.w0;
import c3.i0;
import c3.l;
import c3.o;
import c3.p;
import c3.q;
import c3.s;
import c3.t;
import e2.x;
import e9.l0;
import e9.n0;
import e9.x1;
import java.util.List;
import v7.k8;
import w3.m;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final class a implements o {
    public q b;
    public p c;
    public d d;
    public m e;
    public int g;
    public long h;
    public int i;
    public final x a = new x(16);
    public long j = -1;
    public int f = 0;

    @Override // c3.o
    public final boolean a(p pVar) {
        return k8.a((l) pVar, true);
    }

    @Override // c3.o
    public final void c(q qVar) {
        this.b = qVar;
    }

    @Override // c3.o
    public final void d(long j10, long j11) {
        if (j10 != 0) {
            if (this.f == 3) {
                m mVar = this.e;
                mVar.getClass();
                mVar.d(j10, j11);
                return;
            }
            return;
        }
        this.f = 0;
        this.i = 0;
        this.j = -1L;
        if (this.e != null) {
            this.e = null;
        }
    }

    @Override // c3.o
    public final List e() {
        l0 l0Var = n0.b;
        return x1.e;
    }

    @Override // c3.o
    public final int f(p pVar, s sVar) {
        while (true) {
            int i10 = this.f;
            if (i10 == 0) {
                int i11 = this.i;
                x xVar = this.a;
                if (i11 == 0) {
                    if (!pVar.d(xVar.a, 0, 8, true)) {
                        q qVar = this.b;
                        qVar.getClass();
                        qVar.D();
                        this.b.K(new t(-9223372036854775807L));
                        this.f = 4;
                        return -1;
                    }
                    this.i = 8;
                    xVar.N(0);
                    this.h = xVar.C();
                    this.g = xVar.m();
                }
                if (this.h == 1) {
                    pVar.readFully(xVar.a, 8, 8);
                    this.i += 8;
                    this.h = xVar.G();
                }
                if (this.g == 1836086884) {
                    long position = pVar.getPosition();
                    this.j = position;
                    long j10 = this.i;
                    l3.b bVar = new l3.b(0L, position - j10, -9223372036854775807L, position, this.h - j10);
                    q qVar2 = this.b;
                    qVar2.getClass();
                    i0 a02 = qVar2.a0(1024, 4);
                    w wVar = new w();
                    wVar.q = w0.n("image/heic");
                    wVar.k = new u0(bVar);
                    i2.d.s(wVar, a02);
                    this.f = 2;
                } else {
                    this.f = 1;
                }
            } else if (i10 == 1) {
                pVar.r((int) (this.h - this.i));
                this.i = 0;
                this.f = 0;
            } else {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 == 4) {
                            return -1;
                        }
                        throw new IllegalStateException();
                    }
                    if (this.d == null || pVar != this.c) {
                        this.c = pVar;
                        this.d = new d(pVar, this.j);
                    }
                    m mVar = this.e;
                    mVar.getClass();
                    int f7 = mVar.f(this.d, sVar);
                    if (f7 == 1) {
                        sVar.a += this.j;
                    }
                    return f7;
                }
                if (this.e == null) {
                    this.e = new m(z3.l.D, 8);
                }
                d dVar = new d(pVar, this.j);
                this.d = dVar;
                if (this.e.a(dVar)) {
                    m mVar2 = this.e;
                    long j11 = this.j;
                    q qVar3 = this.b;
                    qVar3.getClass();
                    mVar2.c(new d(j11, qVar3, 2));
                    this.f = 3;
                } else {
                    q qVar4 = this.b;
                    qVar4.getClass();
                    qVar4.D();
                    this.b.K(new t(-9223372036854775807L));
                    this.f = 4;
                }
            }
        }
    }

    @Override // c3.o
    public final void release() {
        m mVar = this.e;
        if (mVar != null) {
            mVar.getClass();
            this.e = null;
        }
    }

    @Override // c3.o
    public final o b() {
        return this;
    }
}
