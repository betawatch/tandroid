package l3;

import b4.k;
import b8.ig;
import b8.sd;
import d2.s0;
import d2.u;
import d2.u0;
import e3.l;
import e3.o;
import e3.p;
import e3.q;
import e3.s;
import e3.t;
import g2.y;
import g9.g0;
import g9.i0;
import g9.s1;
import java.util.List;
import org.telegram.ui.Cells.f1;
import y3.m;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class a implements o {
    public q b;
    public p c;
    public ig d;
    public m e;
    public int g;
    public long h;
    public int i;
    public final y a = new y(16);
    public long j = -1;
    public int f = 0;

    @Override // e3.o
    public final boolean b(p pVar) {
        return sd.a((l) pVar, true);
    }

    @Override // e3.o
    public final void c(q qVar) {
        this.b = qVar;
    }

    @Override // e3.o
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

    @Override // e3.o
    public final List e() {
        g0 g0Var = i0.b;
        return s1.e;
    }

    @Override // e3.o
    public final int f(p pVar, s sVar) {
        while (true) {
            int i3 = this.f;
            if (i3 == 0) {
                int i10 = this.i;
                y yVar = this.a;
                if (i10 == 0) {
                    if (!pVar.d(yVar.a, 0, 8, true)) {
                        q qVar = this.b;
                        qVar.getClass();
                        qVar.L();
                        this.b.f(new t(-9223372036854775807L));
                        this.f = 4;
                        return -1;
                    }
                    this.i = 8;
                    yVar.N(0);
                    this.h = yVar.C();
                    this.g = yVar.m();
                }
                if (this.h == 1) {
                    pVar.readFully(yVar.a, 8, 8);
                    this.i += 8;
                    this.h = yVar.G();
                }
                if (this.g == 1836086884) {
                    long position = pVar.getPosition();
                    this.j = position;
                    long j10 = this.i;
                    n3.b bVar = new n3.b(0L, position - j10, -9223372036854775807L, position, this.h - j10);
                    q qVar2 = this.b;
                    qVar2.getClass();
                    e3.i0 i02 = qVar2.i0(1024, 4);
                    u uVar = new u();
                    uVar.q = u0.n("image/heic");
                    uVar.k = new s0(bVar);
                    f1.w(uVar, i02);
                    this.f = 2;
                } else {
                    this.f = 1;
                }
            } else if (i3 == 1) {
                pVar.u((int) (this.h - this.i));
                this.i = 0;
                this.f = 0;
            } else {
                if (i3 != 2) {
                    if (i3 != 3) {
                        if (i3 == 4) {
                            return -1;
                        }
                        throw new IllegalStateException();
                    }
                    if (this.d == null || pVar != this.c) {
                        this.c = pVar;
                        this.d = new ig(pVar, this.j);
                    }
                    m mVar = this.e;
                    mVar.getClass();
                    int f10 = mVar.f(this.d, sVar);
                    if (f10 == 1) {
                        sVar.a += this.j;
                    }
                    return f10;
                }
                if (this.e == null) {
                    this.e = new m(k.g, 8);
                }
                ig igVar = new ig(pVar, this.j);
                this.d = igVar;
                if (this.e.b(igVar)) {
                    m mVar2 = this.e;
                    long j11 = this.j;
                    q qVar3 = this.b;
                    qVar3.getClass();
                    mVar2.c(new ig(j11, qVar3, 2));
                    this.f = 3;
                } else {
                    q qVar4 = this.b;
                    qVar4.getClass();
                    qVar4.L();
                    this.b.f(new t(-9223372036854775807L));
                    this.f = 4;
                }
            }
        }
    }

    @Override // e3.o
    public final void release() {
        m mVar = this.e;
        if (mVar != null) {
            mVar.getClass();
            this.e = null;
        }
    }

    @Override // e3.o
    public final o a() {
        return this;
    }
}
