package m3;

import a8.ua;
import c4.k;
import c8.m9;
import e2.q0;
import e2.s0;
import f3.j0;
import f3.o;
import f3.p;
import f3.q;
import f3.s;
import f3.t;
import h2.x;
import h9.g0;
import h9.i0;
import h9.t1;
import java.util.List;
import org.telegram.ui.Cells.f1;
import z3.l;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class a implements o {
    public q b;
    public p c;
    public ua d;
    public l e;
    public int g;
    public long h;
    public int i;
    public final x a = new x(16);
    public long j = -1;
    public int f = 0;

    @Override // f3.o
    public final boolean b(p pVar) {
        return m9.a((f3.l) pVar, true);
    }

    @Override // f3.o
    public final void c(q qVar) {
        this.b = qVar;
    }

    @Override // f3.o
    public final void d(long j3, long j10) {
        if (j3 != 0) {
            if (this.f == 3) {
                l lVar = this.e;
                lVar.getClass();
                lVar.d(j3, j10);
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

    @Override // f3.o
    public final List e() {
        g0 g0Var = i0.b;
        return t1.e;
    }

    @Override // f3.o
    public final int f(p pVar, s sVar) {
        while (true) {
            int i7 = this.f;
            if (i7 == 0) {
                int i10 = this.i;
                x xVar = this.a;
                if (i10 == 0) {
                    if (!pVar.c(xVar.a, 0, 8, true)) {
                        q qVar = this.b;
                        qVar.getClass();
                        qVar.U0();
                        this.b.f(new t(-9223372036854775807L));
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
                    long j3 = this.i;
                    o3.b bVar = new o3.b(0L, position - j3, -9223372036854775807L, position, this.h - j3);
                    q qVar2 = this.b;
                    qVar2.getClass();
                    j0 O1 = qVar2.O1(1024, 4);
                    e2.t tVar = new e2.t();
                    tVar.q = s0.n("image/heic");
                    tVar.k = new q0(bVar);
                    f1.s(tVar, O1);
                    this.f = 2;
                } else {
                    this.f = 1;
                }
            } else if (i7 == 1) {
                pVar.s((int) (this.h - this.i));
                this.i = 0;
                this.f = 0;
            } else {
                if (i7 != 2) {
                    if (i7 != 3) {
                        if (i7 == 4) {
                            return -1;
                        }
                        throw new IllegalStateException();
                    }
                    if (this.d == null || pVar != this.c) {
                        this.c = pVar;
                        this.d = new ua(pVar, this.j);
                    }
                    l lVar = this.e;
                    lVar.getClass();
                    int f10 = lVar.f(this.d, sVar);
                    if (f10 == 1) {
                        sVar.a += this.j;
                    }
                    return f10;
                }
                if (this.e == null) {
                    this.e = new l(k.i, 8);
                }
                ua uaVar = new ua(pVar, this.j);
                this.d = uaVar;
                if (this.e.b(uaVar)) {
                    l lVar2 = this.e;
                    long j10 = this.j;
                    q qVar3 = this.b;
                    qVar3.getClass();
                    lVar2.c(new ua(j10, qVar3, 3));
                    this.f = 3;
                } else {
                    q qVar4 = this.b;
                    qVar4.getClass();
                    qVar4.U0();
                    this.b.f(new t(-9223372036854775807L));
                    this.f = 4;
                }
            }
        }
    }

    @Override // f3.o
    public final void release() {
        l lVar = this.e;
        if (lVar != null) {
            lVar.getClass();
            this.e = null;
        }
    }

    @Override // f3.o
    public final o a() {
        return this;
    }
}
