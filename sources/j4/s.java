package j4;

import b2.w0;
import c3.i0;
import e2.m0;
import i2.o0;
import java.util.Collections;
import v7.u6;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
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
    public final e2.x n = new e2.x();

    public s(c0 c0Var) {
        this.a = c0Var;
    }

    @Override // j4.i
    public final void a(e2.x xVar) {
        int i10;
        this.c.getClass();
        String str = m0.a;
        while (xVar.a() > 0) {
            int i11 = xVar.b;
            int i12 = xVar.c;
            byte[] bArr = xVar.a;
            this.l += xVar.a();
            this.c.d(xVar.a(), xVar);
            while (i11 < i12) {
                int c10 = f2.p.c(bArr, i11, i12, this.f);
                if (c10 == i12) {
                    g(i11, i12, bArr);
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
                    g(i11, i14, bArr);
                }
                int i17 = i12 - i14;
                long j10 = this.l - i17;
                b(j10, i17, i16 < 0 ? -i16 : 0, this.m);
                h(j10, i17, i13, this.m);
                i11 = i14 + i15;
            }
        }
    }

    public final void b(long j10, int i10, int i11, long j11) {
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
            o0 o0Var = this.g;
            o0Var.e(i11);
            o0 o0Var2 = this.h;
            o0Var2.e(i11);
            o0 o0Var3 = this.i;
            o0Var3.e(i11);
            if (o0Var.d && o0Var2.d && o0Var3.d) {
                String str = this.b;
                int i12 = o0Var.e;
                byte[] bArr = new byte[o0Var2.e + i12 + o0Var3.e];
                System.arraycopy((byte[]) o0Var.f, 0, bArr, 0, i12);
                System.arraycopy((byte[]) o0Var2.f, 0, bArr, o0Var.e, o0Var2.e);
                System.arraycopy((byte[]) o0Var3.f, 0, bArr, o0Var.e + o0Var2.e, o0Var3.e);
                String str2 = null;
                f2.l k10 = f2.p.k((byte[]) o0Var2.f, 3, o0Var2.e, null);
                f2.i iVar = k10.b;
                if (iVar != null) {
                    str2 = e2.g.a(iVar.a, iVar.c, iVar.d, iVar.f, iVar.b, iVar.e);
                }
                b2.w wVar = new b2.w();
                wVar.a = str;
                wVar.q = w0.n("video/mp2t");
                wVar.r = w0.n("video/hevc");
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
                u6.p(i13 != -1);
                cVar.k(i13);
                this.e = true;
            }
        }
        o0 o0Var4 = this.j;
        boolean e = o0Var4.e(i11);
        e2.x xVar2 = this.n;
        if (e) {
            xVar2.L(f2.p.p(o0Var4.e, (byte[]) o0Var4.f), (byte[]) o0Var4.f);
            xVar2.O(5);
            cVar.a(j11, xVar2);
        }
        o0 o0Var5 = this.k;
        if (o0Var5.e(i11)) {
            xVar2.L(f2.p.p(o0Var5.e, (byte[]) o0Var5.f), (byte[]) o0Var5.f);
            xVar2.O(5);
            cVar.a(j11, xVar2);
        }
    }

    @Override // j4.i
    public final void c() {
        this.l = 0L;
        this.m = -9223372036854775807L;
        f2.p.b(this.f);
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
    public final void d(c3.q qVar, f0 f0Var) {
        f0Var.b();
        f0Var.c();
        this.b = (String) f0Var.e;
        f0Var.c();
        i0 W = qVar.W(f0Var.c, 2);
        this.c = W;
        this.d = new r(W);
        this.a.b(qVar, f0Var);
    }

    @Override // j4.i
    public final void e(boolean z10) {
        this.c.getClass();
        String str = m0.a;
        if (z10) {
            this.a.d.c(0);
            b(this.l, 0, 0, this.m);
            h(this.l, 0, 48, this.m);
        }
    }

    @Override // j4.i
    public final void f(int i10, long j10) {
        this.m = j10;
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

    public final void h(long j10, int i10, int i11, long j11) {
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
}
