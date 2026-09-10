package j4;

import b2.r0;
import i2.k0;
import java.util.Collections;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class s implements i {
    public final d0 a;
    public String b;
    public c3.h0 c;
    public r d;
    public boolean e;
    public long l;
    public final boolean[] f = new boolean[3];
    public final k0 g = new k0(32);
    public final k0 h = new k0(33);
    public final k0 i = new k0(34);
    public final k0 j = new k0(39);
    public final k0 k = new k0(40);
    public long m = -9223372036854775807L;
    public final e2.v n = new e2.v();

    public s(d0 d0Var) {
        this.a = d0Var;
    }

    @Override // j4.i
    public final void a(e2.v vVar) {
        int i10;
        e2.d.h(this.c);
        String str = e2.d0.a;
        while (vVar.a() > 0) {
            int i11 = vVar.b;
            int i12 = vVar.c;
            byte[] bArr = vVar.a;
            this.l += vVar.a();
            this.c.d(vVar.a(), vVar);
            while (i11 < i12) {
                int b10 = f2.o.b(bArr, i11, i12, this.f);
                if (b10 == i12) {
                    g(i11, i12, bArr);
                    return;
                }
                int i13 = (bArr[b10 + 3] & 126) >> 1;
                if (b10 <= 0 || bArr[b10 - 1] != 0) {
                    i10 = 3;
                } else {
                    b10--;
                    i10 = 4;
                }
                int i14 = b10;
                int i15 = i14 - i11;
                if (i15 > 0) {
                    g(i11, i14, bArr);
                }
                int i16 = i12 - i14;
                long j3 = this.l - i16;
                f(j3, i16, i15 < 0 ? -i15 : 0, this.m);
                h(j3, i16, i13, this.m);
                i11 = i14 + i10;
            }
        }
    }

    @Override // j4.i
    public final void b() {
        this.l = 0L;
        this.m = -9223372036854775807L;
        f2.o.a(this.f);
        this.g.g();
        this.h.g();
        this.i.g();
        this.j.g();
        this.k.g();
        this.a.d.c(0);
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
    public final void c(c3.q qVar, g0 g0Var) {
        g0Var.a();
        g0Var.b();
        this.b = g0Var.e;
        g0Var.b();
        c3.h0 I = qVar.I(g0Var.d, 2);
        this.c = I;
        this.d = new r(I);
        this.a.b(qVar, g0Var);
    }

    @Override // j4.i
    public final void d(boolean z10) {
        e2.d.h(this.c);
        String str = e2.d0.a;
        if (z10) {
            this.a.d.c(0);
            f(this.l, 0, 0, this.m);
            h(this.l, 0, 48, this.m);
        }
    }

    @Override // j4.i
    public final void e(int i10, long j3) {
        this.m = j3;
    }

    public final void f(long j3, int i10, int i11, long j10) {
        e2.c cVar = this.a.d;
        r rVar = this.d;
        boolean z10 = this.e;
        if (rVar.j && rVar.g) {
            rVar.m = rVar.c;
            rVar.j = false;
        } else if (rVar.h || rVar.g) {
            if (z10 && rVar.i) {
                rVar.a(i10 + ((int) (j3 - rVar.b)));
            }
            rVar.k = rVar.b;
            rVar.l = rVar.e;
            rVar.m = rVar.c;
            rVar.i = true;
        }
        if (!this.e) {
            k0 k0Var = this.g;
            k0Var.e(i11);
            k0 k0Var2 = this.h;
            k0Var2.e(i11);
            k0 k0Var3 = this.i;
            k0Var3.e(i11);
            if (k0Var.d && k0Var2.d && k0Var3.d) {
                String str = this.b;
                int i12 = k0Var.e;
                byte[] bArr = new byte[k0Var2.e + i12 + k0Var3.e];
                System.arraycopy((byte[]) k0Var.f, 0, bArr, 0, i12);
                System.arraycopy((byte[]) k0Var2.f, 0, bArr, k0Var.e, k0Var2.e);
                System.arraycopy((byte[]) k0Var3.f, 0, bArr, k0Var.e + k0Var2.e, k0Var3.e);
                String str2 = null;
                f2.k h = f2.o.h((byte[]) k0Var2.f, 3, k0Var2.e, null);
                f2.h hVar = h.b;
                if (hVar != null) {
                    int i13 = hVar.a;
                    boolean z11 = hVar.b;
                    str2 = e2.e.a(i13, hVar.c, hVar.d, hVar.f, z11, hVar.e);
                }
                b2.r rVar2 = new b2.r();
                rVar2.a = str;
                rVar2.p = r0.n("video/mp2t");
                rVar2.q = r0.n("video/hevc");
                rVar2.j = str2;
                rVar2.x = h.e;
                rVar2.y = h.f;
                rVar2.z = h.g;
                rVar2.A = h.h;
                rVar2.G = new b2.j(h.k, h.l, h.m, null, h.c + 8, h.d + 8);
                rVar2.D = h.i;
                rVar2.s = h.j;
                rVar2.H = h.a + 1;
                rVar2.t = Collections.singletonList(bArr);
                b2.s sVar = new b2.s(rVar2);
                this.c.b(sVar);
                int i14 = sVar.t;
                if (i14 == -1) {
                    throw new IllegalStateException();
                }
                cVar.k(i14);
                this.e = true;
            }
        }
        k0 k0Var4 = this.j;
        boolean e = k0Var4.e(i11);
        e2.v vVar = this.n;
        if (e) {
            vVar.H(f2.o.m(k0Var4.e, (byte[]) k0Var4.f), (byte[]) k0Var4.f);
            vVar.K(5);
            cVar.a(j10, vVar);
        }
        k0 k0Var5 = this.k;
        if (k0Var5.e(i11)) {
            vVar.H(f2.o.m(k0Var5.e, (byte[]) k0Var5.f), (byte[]) k0Var5.f);
            vVar.K(5);
            cVar.a(j10, vVar);
        }
    }

    public final void g(int i10, int i11, byte[] bArr) {
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

    public final void h(long j3, int i10, int i11, long j10) {
        r rVar = this.d;
        boolean z10 = this.e;
        rVar.g = false;
        rVar.h = false;
        rVar.e = j10;
        rVar.d = 0;
        rVar.b = j3;
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
}
