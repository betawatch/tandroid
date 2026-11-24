// default package

import java.util.Collections;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class gc5 implements gu3 {
    public final uv9 a;
    public String b;
    public wxb c;
    public fc5 d;
    public boolean e;
    public long l;
    public final boolean[] f = new boolean[3];
    public final oh7 g = new oh7(32);
    public final oh7 h = new oh7(33);
    public final oh7 i = new oh7(34);
    public final oh7 j = new oh7(39);
    public final oh7 k = new oh7(40);
    public long m = -9223372036854775807L;
    public final xu7 n = new xu7();

    public gc5(uv9 uv9Var) {
        this.a = uv9Var;
    }

    public final void a(int i, int i2, long j, long j2) {
        ko koVar = this.a.d;
        fc5 fc5Var = this.d;
        boolean z = this.e;
        if (fc5Var.j && fc5Var.g) {
            fc5Var.m = fc5Var.c;
            fc5Var.j = false;
        } else if (fc5Var.h || fc5Var.g) {
            if (z && fc5Var.i) {
                fc5Var.a(i + ((int) (j - fc5Var.b)));
            }
            fc5Var.k = fc5Var.b;
            fc5Var.l = fc5Var.e;
            fc5Var.m = fc5Var.c;
            fc5Var.i = true;
        }
        if (!this.e) {
            oh7 oh7Var = this.g;
            oh7Var.b(i2);
            oh7 oh7Var2 = this.h;
            oh7Var2.b(i2);
            oh7 oh7Var3 = this.i;
            oh7Var3.b(i2);
            if (oh7Var.c && oh7Var2.c && oh7Var3.c) {
                String str = this.b;
                int i3 = oh7Var.e;
                byte[] bArr = new byte[oh7Var2.e + i3 + oh7Var3.e];
                System.arraycopy(oh7Var.d, 0, bArr, 0, i3);
                System.arraycopy(oh7Var2.d, 0, bArr, oh7Var.e, oh7Var2.e);
                System.arraycopy(oh7Var3.d, 0, bArr, oh7Var.e + oh7Var2.e, oh7Var3.e);
                String str2 = null;
                th7 i4 = yad.i(oh7Var2.d, 3, oh7Var2.e, null);
                qh7 qh7Var = i4.b;
                if (qh7Var != null) {
                    str2 = wj2.a(qh7Var.a, qh7Var.c, qh7Var.d, qh7Var.f, qh7Var.b, qh7Var.e);
                }
                em4 em4Var = new em4();
                em4Var.a = str;
                em4Var.r = ud7.n("video/mp2t");
                em4Var.s = ud7.n("video/hevc");
                em4Var.k = str2;
                em4Var.z = i4.e;
                em4Var.A = i4.f;
                em4Var.C = i4.g;
                em4Var.D = i4.h;
                em4Var.K = new hl2(i4.k, i4.l, i4.m, null, i4.c + 8, i4.d + 8);
                em4Var.H = i4.i;
                em4Var.u = i4.j;
                em4Var.L = i4.a + 1;
                em4Var.v = Collections.singletonList(bArr);
                fm4 fm4Var = new fm4(em4Var);
                this.c.g(fm4Var);
                int i5 = fm4Var.v;
                gre.p(i5 != -1);
                koVar.l(i5);
                this.e = true;
            }
        }
        oh7 oh7Var4 = this.j;
        boolean b = oh7Var4.b(i2);
        xu7 xu7Var = this.n;
        if (b) {
            xu7Var.L(yad.m(oh7Var4.e, oh7Var4.d), oh7Var4.d);
            xu7Var.O(5);
            koVar.a(j2, xu7Var);
        }
        oh7 oh7Var5 = this.k;
        if (oh7Var5.b(i2)) {
            xu7Var.L(yad.m(oh7Var5.e, oh7Var5.d), oh7Var5.d);
            xu7Var.O(5);
            koVar.a(j2, xu7Var);
        }
    }

    @Override // gu3
    public final void b(xu7 xu7Var) {
        int i;
        this.c.getClass();
        String str = g8c.a;
        while (xu7Var.a() > 0) {
            int i2 = xu7Var.b;
            int i3 = xu7Var.c;
            byte[] bArr = xu7Var.a;
            this.l += xu7Var.a();
            this.c.e(xu7Var.a(), xu7Var);
            while (i2 < i3) {
                int b = yad.b(bArr, i2, i3, this.f);
                if (b == i3) {
                    c(i2, i3, bArr);
                    return;
                }
                int i4 = (bArr[b + 3] & 126) >> 1;
                if (b <= 0 || bArr[b - 1] != 0) {
                    i = 3;
                } else {
                    b--;
                    i = 4;
                }
                int i5 = b;
                int i6 = i;
                int i7 = i5 - i2;
                if (i7 > 0) {
                    c(i2, i5, bArr);
                }
                int i8 = i3 - i5;
                long j = this.l - i8;
                a(i8, i7 < 0 ? -i7 : 0, j, this.m);
                i(i8, i4, j, this.m);
                i2 = i5 + i6;
            }
        }
    }

    public final void c(int i, int i2, byte[] bArr) {
        fc5 fc5Var = this.d;
        if (fc5Var.f) {
            int i3 = fc5Var.d;
            int i4 = (i + 2) - i3;
            if (i4 < i2) {
                fc5Var.g = (bArr[i4] & 128) != 0;
                fc5Var.f = false;
            } else {
                fc5Var.d = (i2 - i) + i3;
            }
        }
        if (!this.e) {
            this.g.a(i, i2, bArr);
            this.h.a(i, i2, bArr);
            this.i.a(i, i2, bArr);
        }
        this.j.a(i, i2, bArr);
        this.k.a(i, i2, bArr);
    }

    @Override // gu3
    public final void d() {
        this.l = 0L;
        this.m = -9223372036854775807L;
        yad.a(this.f);
        this.g.c();
        this.h.c();
        this.i.c();
        this.j.c();
        this.k.c();
        this.a.d.d(0);
        fc5 fc5Var = this.d;
        if (fc5Var != null) {
            fc5Var.f = false;
            fc5Var.g = false;
            fc5Var.h = false;
            fc5Var.i = false;
            fc5Var.j = false;
        }
    }

    @Override // gu3
    public final void f() {
        this.c.getClass();
        String str = g8c.a;
        this.a.d.d(0);
        a(0, 0, this.l, this.m);
        i(0, 48, this.l, this.m);
    }

    @Override // gu3
    public final void g(int i, long j) {
        this.m = j;
    }

    @Override // gu3
    public final void h(l74 l74Var, l2c l2cVar) {
        l2cVar.a();
        l2cVar.b();
        this.b = l2cVar.e;
        l2cVar.b();
        wxb T = l74Var.T(l2cVar.d, 2);
        this.c = T;
        this.d = new fc5(T);
        this.a.b(l74Var, l2cVar);
    }

    public final void i(int i, int i2, long j, long j2) {
        fc5 fc5Var = this.d;
        boolean z = this.e;
        fc5Var.g = false;
        fc5Var.h = false;
        fc5Var.e = j2;
        fc5Var.d = 0;
        fc5Var.b = j;
        if (i2 >= 32 && i2 != 40) {
            if (fc5Var.i && !fc5Var.j) {
                if (z) {
                    fc5Var.a(i);
                }
                fc5Var.i = false;
            }
            if ((32 <= i2 && i2 <= 35) || i2 == 39) {
                fc5Var.h = !fc5Var.j;
                fc5Var.j = true;
            }
        }
        boolean z2 = i2 >= 16 && i2 <= 21;
        fc5Var.c = z2;
        fc5Var.f = z2 || i2 <= 9;
        if (!this.e) {
            this.g.d(i2);
            this.h.d(i2);
            this.i.d(i2);
        }
        this.j.d(i2);
        this.k.d(i2);
    }

    @Override // gu3
    public final void e() {
    }
}
