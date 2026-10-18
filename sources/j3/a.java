package j3;

import ad.d;
import b2.t0;
import b2.v;
import b2.v0;
import c3.j0;
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
import w3.l;
import z3.k;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes.dex */
public final class a implements o {
    public q b;
    public p c;
    public d d;
    public l e;
    public int g;
    public long h;
    public int i;
    public final x a = new x(16);
    public long j = -1;
    public int f = 0;

    @Override // c3.o
    public final boolean a(p pVar) {
        return k8.a((c3.l) pVar, true);
    }

    @Override // c3.o
    public final void c(q qVar) {
        this.b = qVar;
    }

    @Override // c3.o
    public final void d(long j10, long j11) {
        if (j10 != 0) {
            if (this.f == 3) {
                l lVar = this.e;
                lVar.getClass();
                lVar.d(j10, j11);
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
                    if (!pVar.c(xVar.a, 0, 8, true)) {
                        q qVar = this.b;
                        qVar.getClass();
                        qVar.H();
                        this.b.g0(new t(-9223372036854775807L));
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
                    j0 j02 = qVar2.j0(1024, 4);
                    v vVar = new v();
                    vVar.q = v0.n("image/heic");
                    vVar.k = new t0(bVar);
                    i2.d.u(vVar, j02);
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
                    l lVar = this.e;
                    lVar.getClass();
                    int f7 = lVar.f(this.d, sVar);
                    if (f7 == 1) {
                        sVar.a += this.j;
                    }
                    return f7;
                }
                if (this.e == null) {
                    this.e = new l(k.D, 8);
                }
                d dVar = new d(pVar, this.j);
                this.d = dVar;
                if (this.e.a(dVar)) {
                    l lVar2 = this.e;
                    long j11 = this.j;
                    q qVar3 = this.b;
                    qVar3.getClass();
                    lVar2.c(new d(j11, qVar3, 2));
                    this.f = 3;
                } else {
                    q qVar4 = this.b;
                    qVar4.getClass();
                    qVar4.H();
                    this.b.g0(new t(-9223372036854775807L));
                    this.f = 4;
                }
            }
        }
    }

    @Override // c3.o
    public final void release() {
        l lVar = this.e;
        if (lVar != null) {
            lVar.getClass();
            this.e = null;
        }
    }

    @Override // c3.o
    public final o b() {
        return this;
    }
}
