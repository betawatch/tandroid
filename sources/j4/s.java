package j4;

import b2.r0;
import c3.h0;
import i2.l0;
import java.util.Collections;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class s implements i {
    public final c0 a;
    public String b;
    public h0 c;
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
    public final e2.v n = new e2.v();

    public s(c0 c0Var) {
        this.a = c0Var;
    }

    public final void a(long j3, int i10, int i11, long j10) {
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
            l0 l0Var = this.g;
            l0Var.e(i11);
            l0 l0Var2 = this.h;
            l0Var2.e(i11);
            l0 l0Var3 = this.i;
            l0Var3.e(i11);
            if (l0Var.d && l0Var2.d && l0Var3.d) {
                String str = this.b;
                int i12 = l0Var.e;
                byte[] bArr = new byte[l0Var2.e + i12 + l0Var3.e];
                System.arraycopy((byte[]) l0Var.f, 0, bArr, 0, i12);
                System.arraycopy((byte[]) l0Var2.f, 0, bArr, l0Var.e, l0Var2.e);
                System.arraycopy((byte[]) l0Var3.f, 0, bArr, l0Var.e + l0Var2.e, l0Var3.e);
                String str2 = null;
                f2.l h = f2.p.h((byte[]) l0Var2.f, 3, l0Var2.e, null);
                f2.i iVar = h.b;
                if (iVar != null) {
                    int i13 = iVar.a;
                    boolean z11 = iVar.b;
                    str2 = e2.e.a(i13, iVar.c, iVar.d, iVar.f, z11, iVar.e);
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
        l0 l0Var4 = this.j;
        boolean e7 = l0Var4.e(i11);
        e2.v vVar = this.n;
        if (e7) {
            vVar.H(f2.p.m(l0Var4.e, (byte[]) l0Var4.f), (byte[]) l0Var4.f);
            vVar.K(5);
            cVar.a(j10, vVar);
        }
        l0 l0Var5 = this.k;
        if (l0Var5.e(i11)) {
            vVar.H(f2.p.m(l0Var5.e, (byte[]) l0Var5.f), (byte[]) l0Var5.f);
            vVar.K(5);
            cVar.a(j10, vVar);
        }
    }

    @Override // j4.i
    public final void b(e2.v vVar) {
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
                int b10 = f2.p.b(bArr, i11, i12, this.f);
                if (b10 == i12) {
                    c(i11, i12, bArr);
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
                    c(i11, i14, bArr);
                }
                int i16 = i12 - i14;
                long j3 = this.l - i16;
                a(j3, i16, i15 < 0 ? -i15 : 0, this.m);
                h(j3, i16, i13, this.m);
                i11 = i14 + i10;
            }
        }
    }

    public final void c(int i10, int i11, byte[] bArr) {
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
    public final void d() {
        this.l = 0L;
        this.m = -9223372036854775807L;
        f2.p.a(this.f);
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
    public final void e(c3.q qVar, f0 f0Var) {
        f0Var.a();
        f0Var.b();
        this.b = f0Var.e;
        f0Var.b();
        h0 R1 = qVar.R1(f0Var.d, 2);
        this.c = R1;
        this.d = new r(R1);
        this.a.b(qVar, f0Var);
    }

    @Override // j4.i
    public final void f(boolean z10) {
        e2.d.h(this.c);
        String str = e2.d0.a;
        if (z10) {
            this.a.d.c(0);
            a(this.l, 0, 0, this.m);
            h(this.l, 0, 48, this.m);
        }
    }

    @Override // j4.i
    public final void g(int i10, long j3) {
        this.m = j3;
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
