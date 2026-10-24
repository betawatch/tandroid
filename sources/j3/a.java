package j3;

import ad.d;
import b2.t0;
import b2.v0;
import c3.q;
import c3.r;
import c3.s;
import c3.u;
import c3.v;
import e2.x;
import e9.l0;
import e9.n0;
import e9.x1;
import i2.o1;
import java.util.List;
import v7.k8;
import w3.l;
import z3.k;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final class a implements q {
    public s b;
    public r c;
    public d d;
    public l e;
    public int g;
    public long h;
    public int i;
    public final x a = new x(16);
    public long j = -1;
    public int f = 0;

    @Override // c3.q
    public final boolean a(r rVar) {
        return k8.a((c3.l) rVar, true);
    }

    @Override // c3.q
    public final void c(s sVar) {
        this.b = sVar;
    }

    @Override // c3.q
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

    @Override // c3.q
    public final List e() {
        l0 l0Var = n0.b;
        return x1.e;
    }

    @Override // c3.q
    public final int f(r rVar, u uVar) {
        while (true) {
            int i10 = this.f;
            if (i10 == 0) {
                int i11 = this.i;
                x xVar = this.a;
                if (i11 == 0) {
                    if (!rVar.d(xVar.a, 0, 8, true)) {
                        s sVar = this.b;
                        sVar.getClass();
                        sVar.C();
                        this.b.g0(new v(-9223372036854775807L));
                        this.f = 4;
                        return -1;
                    }
                    this.i = 8;
                    xVar.N(0);
                    this.h = xVar.C();
                    this.g = xVar.m();
                }
                if (this.h == 1) {
                    rVar.readFully(xVar.a, 8, 8);
                    this.i += 8;
                    this.h = xVar.G();
                }
                if (this.g == 1836086884) {
                    long position = rVar.getPosition();
                    this.j = position;
                    long j10 = this.i;
                    l3.b bVar = new l3.b(0L, position - j10, -9223372036854775807L, position, this.h - j10);
                    s sVar2 = this.b;
                    sVar2.getClass();
                    c3.l0 j02 = sVar2.j0(1024, 4);
                    b2.v vVar = new b2.v();
                    vVar.q = v0.n("image/heic");
                    vVar.k = new t0(bVar);
                    o1.v(vVar, j02);
                    this.f = 2;
                } else {
                    this.f = 1;
                }
            } else if (i10 == 1) {
                rVar.r((int) (this.h - this.i));
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
                    if (this.d == null || rVar != this.c) {
                        this.c = rVar;
                        this.d = new d(rVar, this.j);
                    }
                    l lVar = this.e;
                    lVar.getClass();
                    int f7 = lVar.f(this.d, uVar);
                    if (f7 == 1) {
                        uVar.a += this.j;
                    }
                    return f7;
                }
                if (this.e == null) {
                    this.e = new l(k.D, 8);
                }
                d dVar = new d(rVar, this.j);
                this.d = dVar;
                if (this.e.a(dVar)) {
                    l lVar2 = this.e;
                    long j11 = this.j;
                    s sVar3 = this.b;
                    sVar3.getClass();
                    lVar2.c(new d(j11, sVar3, 2));
                    this.f = 3;
                } else {
                    s sVar4 = this.b;
                    sVar4.getClass();
                    sVar4.C();
                    this.b.g0(new v(-9223372036854775807L));
                    this.f = 4;
                }
            }
        }
    }

    @Override // c3.q
    public final void release() {
        l lVar = this.e;
        if (lVar != null) {
            lVar.getClass();
            this.e = null;
        }
    }

    @Override // c3.q
    public final q b() {
        return this;
    }
}
