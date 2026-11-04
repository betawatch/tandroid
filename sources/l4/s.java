package l4;

import b8.zb;
import d2.u0;
import e3.i0;
import g2.n0;
import java.util.Collections;
import k2.o0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class s implements i {
    public final c0 a;
    public String b;
    public i0 c;
    public r d;
    public boolean e;
    public long l;
    public final boolean[] f = new boolean[3];
    public final o0 g = new o0(32);
    public final o0 h = new o0(33);
    public final o0 i = new o0(34);
    public final o0 j = new o0(39);
    public final o0 k = new o0(40);
    public long m = -9223372036854775807L;
    public final g2.y n = new g2.y();

    public s(c0 c0Var) {
        this.a = c0Var;
    }

    @Override // l4.i
    public final void a() {
        this.l = 0L;
        this.m = -9223372036854775807L;
        h2.o.b(this.f);
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

    public final void b(long j10, long j11, int i3, int i10) {
        g2.d dVar = this.a.d;
        r rVar = this.d;
        boolean z10 = this.e;
        if (rVar.j && rVar.g) {
            rVar.m = rVar.c;
            rVar.j = false;
        } else if (rVar.h || rVar.g) {
            if (z10 && rVar.i) {
                rVar.a(i3 + ((int) (j10 - rVar.b)));
            }
            rVar.k = rVar.b;
            rVar.l = rVar.e;
            rVar.m = rVar.c;
            rVar.i = true;
        }
        if (!this.e) {
            o0 o0Var = this.g;
            o0Var.e(i10);
            o0 o0Var2 = this.h;
            o0Var2.e(i10);
            o0 o0Var3 = this.i;
            o0Var3.e(i10);
            if (o0Var.d && o0Var2.d && o0Var3.d) {
                String str = this.b;
                int i11 = o0Var.e;
                byte[] bArr = new byte[o0Var2.e + i11 + o0Var3.e];
                System.arraycopy((byte[]) o0Var.f, 0, bArr, 0, i11);
                System.arraycopy((byte[]) o0Var2.f, 0, bArr, o0Var.e, o0Var2.e);
                System.arraycopy((byte[]) o0Var3.f, 0, bArr, o0Var.e + o0Var2.e, o0Var3.e);
                String str2 = null;
                h2.k k10 = h2.o.k((byte[]) o0Var2.f, 3, o0Var2.e, null);
                h2.h hVar = k10.b;
                if (hVar != null) {
                    str2 = g2.h.a(hVar.a, hVar.c, hVar.d, hVar.f, hVar.b, hVar.e);
                }
                d2.u uVar = new d2.u();
                uVar.a = str;
                uVar.q = u0.n("video/mp2t");
                uVar.r = u0.n("video/hevc");
                uVar.j = str2;
                uVar.y = k10.e;
                uVar.z = k10.f;
                uVar.A = k10.g;
                uVar.B = k10.h;
                uVar.H = new d2.n(k10.k, k10.l, k10.m, null, k10.c + 8, k10.d + 8);
                uVar.E = k10.i;
                uVar.t = k10.j;
                uVar.I = k10.a + 1;
                uVar.u = Collections.singletonList(bArr);
                d2.v vVar = new d2.v(uVar);
                this.c.g(vVar);
                int i12 = vVar.u;
                zb.p(i12 != -1);
                dVar.C(i12);
                this.e = true;
            }
        }
        o0 o0Var4 = this.j;
        boolean e10 = o0Var4.e(i10);
        g2.y yVar = this.n;
        if (e10) {
            yVar.L(h2.o.p(o0Var4.e, (byte[]) o0Var4.f), (byte[]) o0Var4.f);
            yVar.O(5);
            dVar.a(j11, yVar);
        }
        o0 o0Var5 = this.k;
        if (o0Var5.e(i10)) {
            yVar.L(h2.o.p(o0Var5.e, (byte[]) o0Var5.f), (byte[]) o0Var5.f);
            yVar.O(5);
            dVar.a(j11, yVar);
        }
    }

    @Override // l4.i
    public final void c(g2.y yVar) {
        int i3;
        this.c.getClass();
        String str = n0.a;
        while (yVar.a() > 0) {
            int i10 = yVar.b;
            int i11 = yVar.c;
            byte[] bArr = yVar.a;
            this.l += yVar.a();
            this.c.e(yVar.a(), yVar);
            while (i10 < i11) {
                int c2 = h2.o.c(bArr, i10, i11, this.f);
                if (c2 == i11) {
                    g(i10, i11, bArr);
                    return;
                }
                int i12 = (bArr[c2 + 3] & 126) >> 1;
                if (c2 <= 0 || bArr[c2 - 1] != 0) {
                    i3 = 3;
                } else {
                    c2--;
                    i3 = 4;
                }
                int i13 = c2;
                int i14 = i3;
                int i15 = i13 - i10;
                if (i15 > 0) {
                    g(i10, i13, bArr);
                }
                int i16 = i11 - i13;
                long j10 = this.l - i16;
                b(j10, this.m, i16, i15 < 0 ? -i15 : 0);
                h(j10, this.m, i16, i12);
                i10 = i13 + i14;
            }
        }
    }

    @Override // l4.i
    public final void d(boolean z10) {
        this.c.getClass();
        String str = n0.a;
        if (z10) {
            this.a.d.r(0);
            b(this.l, this.m, 0, 0);
            h(this.l, this.m, 0, 48);
        }
    }

    @Override // l4.i
    public final void e(int i3, long j10) {
        this.m = j10;
    }

    @Override // l4.i
    public final void f(e3.q qVar, f0 f0Var) {
        f0Var.b();
        f0Var.c();
        this.b = (String) f0Var.e;
        f0Var.c();
        i0 i02 = qVar.i0(f0Var.c, 2);
        this.c = i02;
        this.d = new r(i02);
        this.a.b(qVar, f0Var);
    }

    public final void g(int i3, int i10, byte[] bArr) {
        r rVar = this.d;
        if (rVar.f) {
            int i11 = rVar.d;
            int i12 = (i3 + 2) - i11;
            if (i12 < i10) {
                rVar.g = (bArr[i12] & 128) != 0;
                rVar.f = false;
            } else {
                rVar.d = (i10 - i3) + i11;
            }
        }
        if (!this.e) {
            this.g.a(i3, i10, bArr);
            this.h.a(i3, i10, bArr);
            this.i.a(i3, i10, bArr);
        }
        this.j.a(i3, i10, bArr);
        this.k.a(i3, i10, bArr);
    }

    public final void h(long j10, long j11, int i3, int i10) {
        r rVar = this.d;
        boolean z10 = this.e;
        rVar.g = false;
        rVar.h = false;
        rVar.e = j11;
        rVar.d = 0;
        rVar.b = j10;
        if (i10 >= 32 && i10 != 40) {
            if (rVar.i && !rVar.j) {
                if (z10) {
                    rVar.a(i3);
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
