package j4;

import b2.v0;
import c3.k0;
import e2.l0;
import i2.p0;
import java.util.Collections;
import v7.t6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class s implements i {
    public final d0 a;
    public String b;
    public k0 c;
    public r d;
    public boolean e;
    public long l;
    public final boolean[] f = new boolean[3];
    public final p0 g = new p0(32);
    public final p0 h = new p0(33);
    public final p0 i = new p0(34);
    public final p0 j = new p0(39);
    public final p0 k = new p0(40);
    public long m = -9223372036854775807L;
    public final e2.x n = new e2.x();

    public s(d0 d0Var) {
        this.a = d0Var;
    }

    public final void a(long j10, long j11, int i10, int i11) {
        e2.c cVar = this.a.d;
        r rVar = this.d;
        boolean z10 = this.e;
        if (rVar.j && rVar.g) {
            rVar.m = rVar.c;
            rVar.j = false;
        } else if (rVar.h || rVar.g) {
            if (z10 && rVar.i) {
                rVar.a(i10 + ((int) (j10 - rVar.b)));
            }
            rVar.k = rVar.b;
            rVar.l = rVar.e;
            rVar.m = rVar.c;
            rVar.i = true;
        }
        if (!this.e) {
            p0 p0Var = this.g;
            p0Var.e(i11);
            p0 p0Var2 = this.h;
            p0Var2.e(i11);
            p0 p0Var3 = this.i;
            p0Var3.e(i11);
            if (p0Var.d && p0Var2.d && p0Var3.d) {
                String str = this.b;
                int i12 = p0Var.e;
                byte[] bArr = new byte[p0Var2.e + i12 + p0Var3.e];
                System.arraycopy((byte[]) p0Var.f, 0, bArr, 0, i12);
                System.arraycopy((byte[]) p0Var2.f, 0, bArr, p0Var.e, p0Var2.e);
                System.arraycopy((byte[]) p0Var3.f, 0, bArr, p0Var.e + p0Var2.e, p0Var3.e);
                String str2 = null;
                f2.m k10 = f2.q.k((byte[]) p0Var2.f, 3, p0Var2.e, null);
                f2.j jVar = k10.b;
                if (jVar != null) {
                    str2 = e2.g.a(jVar.a, jVar.c, jVar.d, jVar.f, jVar.b, jVar.e);
                }
                b2.w wVar = new b2.w();
                wVar.a = str;
                wVar.q = v0.n("video/mp2t");
                wVar.r = v0.n("video/hevc");
                wVar.j = str2;
                wVar.y = k10.e;
                wVar.z = k10.f;
                wVar.A = k10.g;
                wVar.B = k10.h;
                wVar.H = new b2.o(k10.k, k10.l, k10.m, null, k10.c + 8, k10.d + 8);
                wVar.E = k10.i;
                wVar.t = k10.j;
                wVar.I = k10.a + 1;
                wVar.u = Collections.singletonList(bArr);
                b2.x xVar = new b2.x(wVar);
                this.c.b(xVar);
                int i13 = xVar.u;
                t6.p(i13 != -1);
                cVar.p(i13);
                this.e = true;
            }
        }
        p0 p0Var4 = this.j;
        boolean e = p0Var4.e(i11);
        e2.x xVar2 = this.n;
        if (e) {
            xVar2.L(f2.q.p(p0Var4.e, (byte[]) p0Var4.f), (byte[]) p0Var4.f);
            xVar2.O(5);
            cVar.a(j11, xVar2);
        }
        p0 p0Var5 = this.k;
        if (p0Var5.e(i11)) {
            xVar2.L(f2.q.p(p0Var5.e, (byte[]) p0Var5.f), (byte[]) p0Var5.f);
            xVar2.O(5);
            cVar.a(j11, xVar2);
        }
    }

    public final void b(int i10, int i11, byte[] bArr) {
        r rVar = this.d;
        if (rVar.f) {
            int i12 = rVar.d;
            int i13 = (i10 + 2) - i12;
            if (i13 < i11) {
                rVar.g = (bArr[i13] & 128) != 0;
                rVar.f = false;
            } else {
                rVar.d = (i11 - i10) + i12;
            }
        }
        if (!this.e) {
            this.g.a(i10, i11, bArr);
            this.h.a(i10, i11, bArr);
            this.i.a(i10, i11, bArr);
        }
        this.j.a(i10, i11, bArr);
        this.k.a(i10, i11, bArr);
    }

    @Override // j4.i
    public final void c(e2.x xVar) {
        int i10;
        this.c.getClass();
        String str = l0.a;
        while (xVar.a() > 0) {
            int i11 = xVar.b;
            int i12 = xVar.c;
            byte[] bArr = xVar.a;
            this.l += xVar.a();
            this.c.d(xVar.a(), xVar);
            while (i11 < i12) {
                int c10 = f2.q.c(bArr, i11, i12, this.f);
                if (c10 == i12) {
                    b(i11, i12, bArr);
                    return;
                }
                int i13 = (bArr[c10 + 3] & 126) >> 1;
                if (c10 <= 0 || bArr[c10 - 1] != 0) {
                    i10 = 3;
                } else {
                    c10--;
                    i10 = 4;
                }
                int i14 = c10;
                int i15 = i10;
                int i16 = i14 - i11;
                if (i16 > 0) {
                    b(i11, i14, bArr);
                }
                int i17 = i12 - i14;
                long j10 = this.l - i17;
                a(j10, this.m, i17, i16 < 0 ? -i16 : 0);
                d(j10, this.m, i17, i13);
                i11 = i14 + i15;
            }
        }
    }

    public final void d(long j10, long j11, int i10, int i11) {
        r rVar = this.d;
        boolean z10 = this.e;
        rVar.g = false;
        rVar.h = false;
        rVar.e = j11;
        rVar.d = 0;
        rVar.b = j10;
        if (i11 >= 32 && i11 != 40) {
            if (rVar.i && !rVar.j) {
                if (z10) {
                    rVar.a(i10);
                }
                rVar.i = false;
            }
            if ((32 <= i11 && i11 <= 35) || i11 == 39) {
                rVar.h = !rVar.j;
                rVar.j = true;
            }
        }
        boolean z11 = i11 >= 16 && i11 <= 21;
        rVar.c = z11;
        rVar.f = z11 || i11 <= 9;
        if (!this.e) {
            this.g.h(i11);
            this.h.h(i11);
            this.i.h(i11);
        }
        this.j.h(i11);
        this.k.h(i11);
    }

    @Override // j4.i
    public final void e() {
        this.l = 0L;
        this.m = -9223372036854775807L;
        f2.q.b(this.f);
        this.g.g();
        this.h.g();
        this.i.g();
        this.j.g();
        this.k.g();
        this.a.d.e(0);
        r rVar = this.d;
        if (rVar != null) {
            rVar.f = false;
            rVar.g = false;
            rVar.h = false;
            rVar.i = false;
            rVar.j = false;
        }
    }

    @Override // j4.i
    public final void f(c3.q qVar, g0 g0Var) {
        g0Var.b();
        g0Var.c();
        this.b = (String) g0Var.e;
        g0Var.c();
        k0 I1 = qVar.I1(g0Var.c, 2);
        this.c = I1;
        this.d = new r(I1);
        this.a.b(qVar, g0Var);
    }

    @Override // j4.i
    public final void g(boolean z10) {
        this.c.getClass();
        String str = l0.a;
        if (z10) {
            this.a.d.e(0);
            a(this.l, this.m, 0, 0);
            d(this.l, this.m, 0, 48);
        }
    }

    @Override // j4.i
    public final void h(int i10, long j10) {
        this.m = j10;
    }
}
