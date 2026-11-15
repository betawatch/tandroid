package m4;

import a8.ja;
import e2.s0;
import f3.i0;
import java.util.Collections;
import l2.l0;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class s implements i {
    public final c0 a;
    public String b;
    public i0 c;
    public r d;
    public boolean e;
    public long l;
    public final boolean[] f = new boolean[3];
    public final l0 g = new l0(32);
    public final l0 h = new l0(33);
    public final l0 i = new l0(34);
    public final l0 j = new l0(39);
    public final l0 k = new l0(40);
    public long m = -9223372036854775807L;
    public final h2.x n = new h2.x();

    public s(c0 c0Var) {
        this.a = c0Var;
    }

    public final void a(long j3, long j10, int i7, int i10) {
        h2.c cVar = this.a.d;
        r rVar = this.d;
        boolean z10 = this.e;
        if (rVar.j && rVar.g) {
            rVar.m = rVar.c;
            rVar.j = false;
        } else if (rVar.h || rVar.g) {
            if (z10 && rVar.i) {
                rVar.a(i7 + ((int) (j3 - rVar.b)));
            }
            rVar.k = rVar.b;
            rVar.l = rVar.e;
            rVar.m = rVar.c;
            rVar.i = true;
        }
        if (!this.e) {
            l0 l0Var = this.g;
            l0Var.e(i10);
            l0 l0Var2 = this.h;
            l0Var2.e(i10);
            l0 l0Var3 = this.i;
            l0Var3.e(i10);
            if (l0Var.d && l0Var2.d && l0Var3.d) {
                String str = this.b;
                int i11 = l0Var.e;
                byte[] bArr = new byte[l0Var2.e + i11 + l0Var3.e];
                System.arraycopy((byte[]) l0Var.f, 0, bArr, 0, i11);
                System.arraycopy((byte[]) l0Var2.f, 0, bArr, l0Var.e, l0Var2.e);
                System.arraycopy((byte[]) l0Var3.f, 0, bArr, l0Var.e + l0Var2.e, l0Var3.e);
                String str2 = null;
                i2.k k10 = i2.o.k((byte[]) l0Var2.f, 3, l0Var2.e, null);
                i2.h hVar = k10.b;
                if (hVar != null) {
                    str2 = h2.g.a(hVar.a, hVar.c, hVar.d, hVar.f, hVar.b, hVar.e);
                }
                e2.t tVar = new e2.t();
                tVar.a = str;
                tVar.q = s0.n("video/mp2t");
                tVar.r = s0.n("video/hevc");
                tVar.j = str2;
                tVar.y = k10.e;
                tVar.z = k10.f;
                tVar.A = k10.g;
                tVar.B = k10.h;
                tVar.H = new e2.m(k10.k, k10.l, k10.m, null, k10.c + 8, k10.d + 8);
                tVar.E = k10.i;
                tVar.t = k10.j;
                tVar.I = k10.a + 1;
                tVar.u = Collections.singletonList(bArr);
                e2.u uVar = new e2.u(tVar);
                this.c.g(uVar);
                int i12 = uVar.u;
                ja.p(i12 != -1);
                cVar.C(i12);
                this.e = true;
            }
        }
        l0 l0Var4 = this.j;
        boolean e10 = l0Var4.e(i10);
        h2.x xVar = this.n;
        if (e10) {
            xVar.L(i2.o.p(l0Var4.e, (byte[]) l0Var4.f), (byte[]) l0Var4.f);
            xVar.O(5);
            cVar.a(j10, xVar);
        }
        l0 l0Var5 = this.k;
        if (l0Var5.e(i10)) {
            xVar.L(i2.o.p(l0Var5.e, (byte[]) l0Var5.f), (byte[]) l0Var5.f);
            xVar.O(5);
            cVar.a(j10, xVar);
        }
    }

    public final void b(int i7, int i10, byte[] bArr) {
        r rVar = this.d;
        if (rVar.f) {
            int i11 = rVar.d;
            int i12 = (i7 + 2) - i11;
            if (i12 < i10) {
                rVar.g = (bArr[i12] & 128) != 0;
                rVar.f = false;
            } else {
                rVar.d = (i10 - i7) + i11;
            }
        }
        if (!this.e) {
            this.g.a(i7, i10, bArr);
            this.h.a(i7, i10, bArr);
            this.i.a(i7, i10, bArr);
        }
        this.j.a(i7, i10, bArr);
        this.k.a(i7, i10, bArr);
    }

    @Override // m4.i
    public final void c(h2.x xVar) {
        int i7;
        this.c.getClass();
        String str = h2.l0.a;
        while (xVar.a() > 0) {
            int i10 = xVar.b;
            int i11 = xVar.c;
            byte[] bArr = xVar.a;
            this.l += xVar.a();
            this.c.b(xVar.a(), xVar);
            while (i10 < i11) {
                int c10 = i2.o.c(bArr, i10, i11, this.f);
                if (c10 == i11) {
                    b(i10, i11, bArr);
                    return;
                }
                int i12 = (bArr[c10 + 3] & 126) >> 1;
                if (c10 <= 0 || bArr[c10 - 1] != 0) {
                    i7 = 3;
                } else {
                    c10--;
                    i7 = 4;
                }
                int i13 = c10;
                int i14 = i7;
                int i15 = i13 - i10;
                if (i15 > 0) {
                    b(i10, i13, bArr);
                }
                int i16 = i11 - i13;
                long j3 = this.l - i16;
                a(j3, this.m, i16, i15 < 0 ? -i15 : 0);
                h(j3, this.m, i16, i12);
                i10 = i13 + i14;
            }
        }
    }

    @Override // m4.i
    public final void d() {
        this.l = 0L;
        this.m = -9223372036854775807L;
        i2.o.b(this.f);
        this.g.g();
        this.h.g();
        this.i.g();
        this.j.g();
        this.k.g();
        this.a.d.r(0);
        r rVar = this.d;
        if (rVar != null) {
            rVar.f = false;
            rVar.g = false;
            rVar.h = false;
            rVar.i = false;
            rVar.j = false;
        }
    }

    @Override // m4.i
    public final void e(boolean z10) {
        this.c.getClass();
        String str = h2.l0.a;
        if (z10) {
            this.a.d.r(0);
            a(this.l, this.m, 0, 0);
            h(this.l, this.m, 0, 48);
        }
    }

    @Override // m4.i
    public final void f(int i7, long j3) {
        this.m = j3;
    }

    @Override // m4.i
    public final void g(f3.q qVar, f0 f0Var) {
        f0Var.b();
        f0Var.c();
        this.b = (String) f0Var.e;
        f0Var.c();
        i0 d2 = qVar.d2(f0Var.c, 2);
        this.c = d2;
        this.d = new r(d2);
        this.a.b(qVar, f0Var);
    }

    public final void h(long j3, long j10, int i7, int i10) {
        r rVar = this.d;
        boolean z10 = this.e;
        rVar.g = false;
        rVar.h = false;
        rVar.e = j10;
        rVar.d = 0;
        rVar.b = j3;
        if (i10 >= 32 && i10 != 40) {
            if (rVar.i && !rVar.j) {
                if (z10) {
                    rVar.a(i7);
                }
                rVar.i = false;
            }
            if ((32 <= i10 && i10 <= 35) || i10 == 39) {
                rVar.h = !rVar.j;
                rVar.j = true;
            }
        }
        boolean z11 = i10 >= 16 && i10 <= 21;
        rVar.c = z11;
        rVar.f = z11 || i10 <= 9;
        if (!this.e) {
            this.g.h(i10);
            this.h.h(i10);
            this.i.h(i10);
        }
        this.j.h(i10);
        this.k.h(i10);
    }
}
