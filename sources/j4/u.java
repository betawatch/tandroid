package j4;

import b2.v0;
import c3.k0;
import org.telegram.tgnet.TLObject;
import v7.t6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class u implements i {
    public final e2.x a;
    public final c3.z b;
    public final String c;
    public final int d;
    public final String e;
    public k0 f;
    public String g;
    public int h = 0;
    public int i;
    public boolean j;
    public boolean k;
    public long l;
    public int m;
    public long n;

    public u(String str, int i10, String str2) {
        e2.x xVar = new e2.x(4);
        this.a = xVar;
        xVar.a[0] = -1;
        this.b = new c3.z();
        this.n = -9223372036854775807L;
        this.c = str;
        this.d = i10;
        this.e = str2;
    }

    @Override // j4.i
    public final void c(e2.x xVar) {
        this.f.getClass();
        while (xVar.a() > 0) {
            int i10 = this.h;
            e2.x xVar2 = this.a;
            if (i10 == 0) {
                byte[] bArr = xVar.a;
                int i11 = xVar.b;
                int i12 = xVar.c;
                while (true) {
                    if (i11 >= i12) {
                        xVar.N(i12);
                        break;
                    }
                    byte b10 = bArr[i11];
                    boolean z10 = (b10 & 255) == 255;
                    boolean z11 = this.k && (b10 & 224) == 224;
                    this.k = z10;
                    if (z11) {
                        xVar.N(i11 + 1);
                        this.k = false;
                        xVar2.a[1] = bArr[i11];
                        this.i = 2;
                        this.h = 1;
                        break;
                    }
                    i11++;
                }
            } else if (i10 == 1) {
                int min = Math.min(xVar.a(), 4 - this.i);
                xVar.k(this.i, min, xVar2.a);
                int i13 = this.i + min;
                this.i = i13;
                if (i13 >= 4) {
                    xVar2.N(0);
                    int m10 = xVar2.m();
                    c3.z zVar = this.b;
                    if (zVar.a(m10)) {
                        this.m = zVar.b;
                        if (!this.j) {
                            this.l = (zVar.f * 1000000) / zVar.c;
                            b2.w wVar = new b2.w();
                            wVar.a = this.g;
                            wVar.q = v0.n(this.e);
                            wVar.r = v0.n((String) zVar.g);
                            wVar.s = TLObject.FLAG_12;
                            wVar.J = zVar.d;
                            wVar.K = zVar.c;
                            wVar.d = this.c;
                            wVar.f = this.d;
                            this.f.b(new b2.x(wVar));
                            this.j = true;
                        }
                        xVar2.N(0);
                        this.f.d(4, xVar2);
                        this.h = 2;
                    } else {
                        this.i = 0;
                        this.h = 1;
                    }
                }
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException();
                }
                int min2 = Math.min(xVar.a(), this.m - this.i);
                this.f.d(min2, xVar);
                int i14 = this.i + min2;
                this.i = i14;
                if (i14 >= this.m) {
                    t6.p(this.n != -9223372036854775807L);
                    this.f.c(this.n, 1, this.m, 0, null);
                    this.n += this.l;
                    this.i = 0;
                    this.h = 0;
                }
            }
        }
    }

    @Override // j4.i
    public final void e() {
        this.h = 0;
        this.i = 0;
        this.k = false;
        this.n = -9223372036854775807L;
    }

    @Override // j4.i
    public final void f(c3.q qVar, g0 g0Var) {
        g0Var.b();
        g0Var.c();
        this.g = (String) g0Var.e;
        g0Var.c();
        this.f = qVar.I1(g0Var.c, 1);
    }

    @Override // j4.i
    public final void h(int i10, long j10) {
        this.n = j10;
    }

    @Override // j4.i
    public final void g(boolean z10) {
    }
}
