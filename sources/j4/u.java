package j4;

import b2.r0;
import c3.h0;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class u implements i {
    public final e2.v a;
    public final c3.z b;
    public final String c;
    public final int d;
    public final String e;
    public h0 f;
    public String g;
    public int h = 0;
    public int i;
    public boolean j;
    public boolean k;
    public long l;
    public int m;
    public long n;

    public u(String str, int i10, String str2) {
        e2.v vVar = new e2.v(4);
        this.a = vVar;
        vVar.a[0] = -1;
        this.b = new c3.z();
        this.n = -9223372036854775807L;
        this.c = str;
        this.d = i10;
        this.e = str2;
    }

    @Override // j4.i
    public final void b(e2.v vVar) {
        e2.d.h(this.f);
        while (vVar.a() > 0) {
            int i10 = this.h;
            e2.v vVar2 = this.a;
            if (i10 == 0) {
                byte[] bArr = vVar.a;
                int i11 = vVar.b;
                int i12 = vVar.c;
                while (true) {
                    if (i11 >= i12) {
                        vVar.J(i12);
                        break;
                    }
                    byte b10 = bArr[i11];
                    boolean z10 = (b10 & 255) == 255;
                    boolean z11 = this.k && (b10 & 224) == 224;
                    this.k = z10;
                    if (z11) {
                        vVar.J(i11 + 1);
                        this.k = false;
                        vVar2.a[1] = bArr[i11];
                        this.i = 2;
                        this.h = 1;
                        break;
                    }
                    i11++;
                }
            } else if (i10 == 1) {
                int min = Math.min(vVar.a(), 4 - this.i);
                vVar.h(this.i, min, vVar2.a);
                int i13 = this.i + min;
                this.i = i13;
                if (i13 >= 4) {
                    vVar2.J(0);
                    int j3 = vVar2.j();
                    c3.z zVar = this.b;
                    if (zVar.a(j3)) {
                        this.m = zVar.b;
                        if (!this.j) {
                            this.l = (zVar.f * 1000000) / zVar.c;
                            b2.r rVar = new b2.r();
                            rVar.a = this.g;
                            rVar.p = r0.n(this.e);
                            rVar.q = r0.n((String) zVar.g);
                            rVar.r = 4096;
                            rVar.I = zVar.d;
                            rVar.J = zVar.c;
                            rVar.d = this.c;
                            rVar.f = this.d;
                            this.f.b(new b2.s(rVar));
                            this.j = true;
                        }
                        vVar2.J(0);
                        this.f.d(4, vVar2);
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
                int min2 = Math.min(vVar.a(), this.m - this.i);
                this.f.d(min2, vVar);
                int i14 = this.i + min2;
                this.i = i14;
                if (i14 >= this.m) {
                    e2.d.g(this.n != -9223372036854775807L);
                    this.f.c(this.n, 1, this.m, 0, null);
                    this.n += this.l;
                    this.i = 0;
                    this.h = 0;
                }
            }
        }
    }

    @Override // j4.i
    public final void d() {
        this.h = 0;
        this.i = 0;
        this.k = false;
        this.n = -9223372036854775807L;
    }

    @Override // j4.i
    public final void e(c3.q qVar, f0 f0Var) {
        f0Var.a();
        f0Var.b();
        this.g = f0Var.e;
        f0Var.b();
        this.f = qVar.R1(f0Var.d, 1);
    }

    @Override // j4.i
    public final void g(int i10, long j3) {
        this.n = j3;
    }

    @Override // j4.i
    public final void f(boolean z10) {
    }
}
