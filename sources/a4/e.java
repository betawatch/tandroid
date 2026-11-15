package a4;

import e2.t0;
import e2.u;
import f3.b0;
import f3.o;
import f3.p;
import f3.q;
import f3.s;
import h2.l0;
import h2.x;
import h9.g0;
import h9.i0;
import h9.s1;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final class e implements o {
    public q a;
    public j b;
    public boolean c;

    @Override // f3.o
    public final boolean b(p pVar) {
        try {
            return g(pVar);
        } catch (t0 unused) {
            return false;
        }
    }

    @Override // f3.o
    public final void c(q qVar) {
        this.a = qVar;
    }

    @Override // f3.o
    public final void d(long j3, long j10) {
        j jVar = this.b;
        if (jVar != null) {
            f fVar = jVar.a;
            g gVar = fVar.a;
            gVar.a = 0;
            gVar.b = 0L;
            gVar.c = 0;
            gVar.d = 0;
            gVar.e = 0;
            fVar.b.K(0);
            fVar.c = -1;
            fVar.e = false;
            if (j3 == 0) {
                jVar.d(!jVar.l);
                return;
            }
            if (jVar.h != 0) {
                long j11 = (jVar.i * j10) / 1000000;
                jVar.e = j11;
                h hVar = jVar.d;
                String str = l0.a;
                hVar.v0(j11);
                jVar.h = 2;
            }
        }
    }

    @Override // f3.o
    public final List e() {
        g0 g0Var = i0.b;
        return s1.e;
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0178 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0179  */
    @Override // f3.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int f(p pVar, s sVar) {
        int i7;
        byte[] bArr;
        this.a.getClass();
        if (this.b == null) {
            if (!g(pVar)) {
                throw t0.a(null, "Failed to determine bitstream type");
            }
            pVar.l();
        }
        if (!this.c) {
            f3.i0 d2 = this.a.d2(0, 1);
            this.a.d1();
            j jVar = this.b;
            jVar.c = this.a;
            jVar.b = d2;
            jVar.d(true);
            this.c = true;
        }
        j jVar2 = this.b;
        f fVar = jVar2.a;
        jVar2.b.getClass();
        String str = l0.a;
        int i10 = jVar2.h;
        int i11 = -1;
        int i12 = 3;
        if (i10 != 0) {
            if (i10 == 1) {
                pVar.m((int) jVar2.f);
                jVar2.h = 2;
                return 0;
            }
            if (i10 != 2) {
                if (i10 == 3) {
                    return -1;
                }
                throw new IllegalStateException();
            }
            long m0 = jVar2.d.m0(pVar);
            if (m0 >= 0) {
                sVar.a = m0;
                return 1;
            }
            if (m0 < -1) {
                jVar2.a(-(m0 + 2));
            }
            if (!jVar2.l) {
                b0 Y = jVar2.d.Y();
                Y.getClass();
                jVar2.c.f(Y);
                jVar2.b.d(Y.h());
                jVar2.l = true;
            }
            if (jVar2.k <= 0 && !fVar.b(pVar)) {
                jVar2.h = 3;
                return -1;
            }
            jVar2.k = 0L;
            x xVar = fVar.b;
            long b10 = jVar2.b(xVar);
            if (b10 >= 0) {
                long j3 = jVar2.g;
                if (j3 + b10 >= jVar2.e) {
                    jVar2.b.b(xVar.c, xVar);
                    jVar2.b.c((j3 * 1000000) / jVar2.i, 1, xVar.c, 0, null);
                    jVar2.e = -1L;
                }
            }
            jVar2.g += b10;
            return 0;
        }
        while (true) {
            boolean b11 = fVar.b(pVar);
            x xVar2 = fVar.b;
            if (!b11) {
                jVar2.h = i12;
                return i11;
            }
            long position = pVar.getPosition();
            long j10 = jVar2.f;
            jVar2.k = position - j10;
            if (jVar2.c(xVar2, j10, jVar2.j)) {
                jVar2.f = pVar.getPosition();
                i11 = -1;
                i12 = 3;
            } else {
                u uVar = (u) jVar2.j.b;
                jVar2.i = uVar.L;
                if (!jVar2.m) {
                    jVar2.b.g(uVar);
                    jVar2.m = true;
                }
                c cVar = (c) jVar2.j.c;
                if (cVar != null) {
                    jVar2.d = cVar;
                } else {
                    if (pVar.getLength() != -1) {
                        g gVar = fVar.a;
                        i7 = 2;
                        jVar2.d = new b(jVar2, jVar2.f, pVar.getLength(), gVar.d + gVar.e, gVar.b, (gVar.a & 4) != 0);
                        jVar2.h = i7;
                        bArr = xVar2.a;
                        if (bArr.length != 65025) {
                            return 0;
                        }
                        xVar2.L(xVar2.c, Arrays.copyOf(bArr, Math.max(65025, xVar2.c)));
                        return 0;
                    }
                    jVar2.d = new pb.b(1);
                }
                i7 = 2;
                jVar2.h = i7;
                bArr = xVar2.a;
                if (bArr.length != 65025) {
                }
            }
        }
    }

    public final boolean g(p pVar) {
        boolean z10;
        g gVar = new g();
        if (gVar.a(pVar, true) && (gVar.a & 2) == 2) {
            int min = Math.min(gVar.e, 8);
            x xVar = new x(min);
            pVar.c(0, min, xVar.a);
            xVar.N(0);
            if (xVar.a() >= 5 && xVar.A() == 127 && xVar.C() == 1179402563) {
                this.b = new d();
                return true;
            }
            xVar.N(0);
            try {
                z10 = f3.b.w(1, xVar, true);
            } catch (t0 unused) {
                z10 = false;
            }
            if (z10) {
                this.b = new l();
            } else {
                xVar.N(0);
                if (i.e(xVar, i.o)) {
                    this.b = new i();
                }
            }
            return true;
        }
        return false;
    }

    @Override // f3.o
    public final o a() {
        return this;
    }

    @Override // f3.o
    public final void release() {
    }
}
