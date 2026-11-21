package m4;

import a8.la;
import e2.s0;
import f3.i0;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public final class u implements i {
    public final h2.x a;
    public final f3.z b;
    public final String c;
    public final int d;
    public final String e;
    public i0 f;
    public String g;
    public int h = 0;
    public int i;
    public boolean j;
    public boolean k;
    public long l;
    public int m;
    public long n;

    public u(String str, int i7, String str2) {
        h2.x xVar = new h2.x(4);
        this.a = xVar;
        xVar.a[0] = -1;
        this.b = new f3.z();
        this.n = -9223372036854775807L;
        this.c = str;
        this.d = i7;
        this.e = str2;
    }

    @Override // m4.i
    public final void c(h2.x xVar) {
        this.f.getClass();
        while (xVar.a() > 0) {
            int i7 = this.h;
            h2.x xVar2 = this.a;
            if (i7 == 0) {
                byte[] bArr = xVar.a;
                int i10 = xVar.b;
                int i11 = xVar.c;
                while (true) {
                    if (i10 >= i11) {
                        xVar.N(i11);
                        break;
                    }
                    byte b10 = bArr[i10];
                    boolean z10 = (b10 & 255) == 255;
                    boolean z11 = this.k && (b10 & 224) == 224;
                    this.k = z10;
                    if (z11) {
                        xVar.N(i10 + 1);
                        this.k = false;
                        xVar2.a[1] = bArr[i10];
                        this.i = 2;
                        this.h = 1;
                        break;
                    }
                    i10++;
                }
            } else if (i7 == 1) {
                int min = Math.min(xVar.a(), 4 - this.i);
                xVar.k(this.i, min, xVar2.a);
                int i12 = this.i + min;
                this.i = i12;
                if (i12 >= 4) {
                    xVar2.N(0);
                    int m10 = xVar2.m();
                    f3.z zVar = this.b;
                    if (zVar.a(m10)) {
                        this.m = zVar.b;
                        if (!this.j) {
                            this.l = (zVar.f * 1000000) / zVar.c;
                            e2.t tVar = new e2.t();
                            tVar.a = this.g;
                            tVar.q = s0.n(this.e);
                            tVar.r = s0.n((String) zVar.g);
                            tVar.s = TLObject.FLAG_12;
                            tVar.J = zVar.d;
                            tVar.K = zVar.c;
                            tVar.d = this.c;
                            tVar.f = this.d;
                            this.f.g(new e2.u(tVar));
                            this.j = true;
                        }
                        xVar2.N(0);
                        this.f.b(4, xVar2);
                        this.h = 2;
                    } else {
                        this.i = 0;
                        this.h = 1;
                    }
                }
            } else {
                if (i7 != 2) {
                    throw new IllegalStateException();
                }
                int min2 = Math.min(xVar.a(), this.m - this.i);
                this.f.b(min2, xVar);
                int i13 = this.i + min2;
                this.i = i13;
                if (i13 >= this.m) {
                    la.p(this.n != -9223372036854775807L);
                    this.f.c(this.n, 1, this.m, 0, null);
                    this.n += this.l;
                    this.i = 0;
                    this.h = 0;
                }
            }
        }
    }

    @Override // m4.i
    public final void d() {
        this.h = 0;
        this.i = 0;
        this.k = false;
        this.n = -9223372036854775807L;
    }

    @Override // m4.i
    public final void f(int i7, long j3) {
        this.n = j3;
    }

    @Override // m4.i
    public final void g(f3.q qVar, f0 f0Var) {
        f0Var.b();
        f0Var.c();
        this.g = (String) f0Var.e;
        f0Var.c();
        this.f = qVar.d2(f0Var.c, 1);
    }

    @Override // m4.i
    public final void e(boolean z10) {
    }
}
