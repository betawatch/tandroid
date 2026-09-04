package j4;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class b0 implements g0 {
    public final a0 a;
    public final e2.v b = new e2.v(32);
    public int c;
    public int d;
    public boolean e;
    public boolean f;

    public b0(a0 a0Var) {
        this.a = a0Var;
    }

    @Override // j4.g0
    public final void a(int i10, e2.v vVar) {
        boolean z10 = (i10 & 1) != 0;
        int x10 = z10 ? vVar.b + vVar.x() : -1;
        if (this.f) {
            if (!z10) {
                return;
            }
            this.f = false;
            vVar.J(x10);
            this.d = 0;
        }
        while (vVar.a() > 0) {
            int i11 = this.d;
            e2.v vVar2 = this.b;
            if (i11 < 3) {
                if (i11 == 0) {
                    int x11 = vVar.x();
                    vVar.J(vVar.b - 1);
                    if (x11 == 255) {
                        this.f = true;
                        return;
                    }
                }
                int min = Math.min(vVar.a(), 3 - this.d);
                vVar.h(this.d, min, vVar2.a);
                int i12 = this.d + min;
                this.d = i12;
                if (i12 == 3) {
                    vVar2.J(0);
                    vVar2.I(3);
                    vVar2.K(1);
                    int x12 = vVar2.x();
                    int x13 = vVar2.x();
                    this.e = (x12 & 128) != 0;
                    int i13 = (((x12 & 15) << 8) | x13) + 3;
                    this.c = i13;
                    byte[] bArr = vVar2.a;
                    if (bArr.length < i13) {
                        vVar2.c(Math.min(4098, Math.max(i13, bArr.length * 2)));
                    }
                }
            } else {
                int min2 = Math.min(vVar.a(), this.c - this.d);
                vVar.h(this.d, min2, vVar2.a);
                int i14 = this.d + min2;
                this.d = i14;
                int i15 = this.c;
                if (i14 != i15) {
                    continue;
                } else {
                    if (!this.e) {
                        vVar2.I(i15);
                    } else {
                        if (e2.d0.n(0, i15, -1, vVar2.a) != 0) {
                            this.f = true;
                            return;
                        }
                        vVar2.I(this.c - 4);
                    }
                    vVar2.J(0);
                    this.a.b(vVar2);
                    this.d = 0;
                }
            }
        }
    }

    @Override // j4.g0
    public final void c(e2.b0 b0Var, c3.q qVar, f0 f0Var) {
        this.a.c(b0Var, qVar, f0Var);
        this.f = true;
    }

    @Override // j4.g0
    public final void d() {
        this.f = true;
    }
}
