// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class my9 implements m6c {
    public final ly9 a;
    public final ey7 b = new ey7(32);
    public int c;
    public int d;
    public boolean e;
    public boolean f;

    public my9(ly9 ly9Var) {
        this.a = ly9Var;
    }

    @Override // m6c
    public final void a(int i, ey7 ey7Var) {
        boolean z = (i & 1) != 0;
        int A = z ? ey7Var.b + ey7Var.A() : -1;
        if (this.f) {
            if (!z) {
                return;
            }
            this.f = false;
            ey7Var.N(A);
            this.d = 0;
        }
        while (ey7Var.a() > 0) {
            int i2 = this.d;
            ey7 ey7Var2 = this.b;
            if (i2 < 3) {
                if (i2 == 0) {
                    int A2 = ey7Var.A();
                    ey7Var.N(ey7Var.b - 1);
                    if (A2 == 255) {
                        this.f = true;
                        return;
                    }
                }
                int min = Math.min(ey7Var.a(), 3 - this.d);
                ey7Var.k(this.d, min, ey7Var2.a);
                int i3 = this.d + min;
                this.d = i3;
                if (i3 == 3) {
                    ey7Var2.N(0);
                    ey7Var2.M(3);
                    ey7Var2.O(1);
                    int A3 = ey7Var2.A();
                    int A4 = ey7Var2.A();
                    this.e = (A3 & 128) != 0;
                    int i4 = (((A3 & 15) << 8) | A4) + 3;
                    this.c = i4;
                    byte[] bArr = ey7Var2.a;
                    if (bArr.length < i4) {
                        ey7Var2.c(Math.min(4098, Math.max(i4, bArr.length << 1)));
                    }
                }
            } else {
                int min2 = Math.min(ey7Var.a(), this.c - this.d);
                ey7Var.k(this.d, min2, ey7Var2.a);
                int i5 = this.d + min2;
                this.d = i5;
                int i6 = this.c;
                if (i5 != i6) {
                    continue;
                } else {
                    if (!this.e) {
                        ey7Var2.M(i6);
                    } else {
                        if (gcc.p(0, i6, -1, ey7Var2.a) != 0) {
                            this.f = true;
                            return;
                        }
                        ey7Var2.M(this.c - 4);
                    }
                    ey7Var2.N(0);
                    this.a.b(ey7Var2);
                    this.d = 0;
                }
            }
        }
    }

    @Override // m6c
    public final void c(usb usbVar, g84 g84Var, l6c l6cVar) {
        this.a.c(usbVar, g84Var, l6cVar);
        this.f = true;
    }

    @Override // m6c
    public final void d() {
        this.f = true;
    }
}
