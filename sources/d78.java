// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class d78 implements m6c {
    public final av3 a;
    public final zd1 b = new zd1(10, new byte[10]);
    public byte c = 0;
    public int d;
    public usb e;
    public boolean f;
    public boolean g;
    public boolean h;
    public int i;
    public int j;
    public boolean k;

    public d78(av3 av3Var) {
        this.a = av3Var;
    }

    @Override // m6c
    public final void a(int i, ey7 ey7Var) {
        int i2;
        byte b;
        long j;
        this.e.getClass();
        int i3 = i & 1;
        int i4 = -1;
        byte b2 = 2;
        int i5 = 0;
        byte b3 = 3;
        av3 av3Var = this.a;
        if (i3 != 0) {
            byte b4 = this.c;
            if (b4 != 0 && b4 != 1) {
                if (b4 == 2) {
                    efd.f("PesReader", "Unexpected start indicator reading extended header");
                } else {
                    if (b4 != 3) {
                        grb.g();
                        return;
                    }
                    if (this.j != -1) {
                        efd.f("PesReader", "Unexpected start indicator: expected " + this.j + " more bytes");
                    }
                    av3Var.e();
                }
            }
            if (ey7Var.c == 0) {
                av3Var.f();
            }
            this.c = (byte) 1;
            this.d = 0;
        }
        int i6 = i;
        while (ey7Var.a() > 0) {
            byte b5 = this.c;
            if (b5 != 0) {
                zd1 zd1Var = this.b;
                if (b5 == 1) {
                    b = b3;
                    if (b(ey7Var, zd1Var.b, 9)) {
                        this.c = e() ? (byte) 2 : (byte) 0;
                        i2 = 0;
                        this.d = 0;
                    } else {
                        i2 = 0;
                    }
                } else if (b5 == b2) {
                    if (b(ey7Var, zd1Var.b, Math.min(10, this.i)) && b(ey7Var, null, this.i)) {
                        zd1Var.l(i5);
                        if (this.f) {
                            zd1Var.n(4);
                            zd1Var.n(1);
                            zd1Var.n(1);
                            long f = (zd1Var.f(b3) << 30) | (zd1Var.f(15) << 15) | zd1Var.f(15);
                            zd1Var.n(1);
                            if (!this.h && this.g) {
                                zd1Var.n(4);
                                zd1Var.n(1);
                                zd1Var.n(1);
                                zd1Var.n(1);
                                this.e.b((zd1Var.f(b3) << 30) | (zd1Var.f(15) << 15) | zd1Var.f(15));
                                this.h = true;
                            }
                            j = this.e.b(f);
                        } else {
                            j = -9223372036854775807L;
                        }
                        i6 |= this.k ? 4 : 0;
                        av3Var.g(i6, j);
                        this.c = (byte) 3;
                        this.d = 0;
                        b3 = 3;
                        i4 = -1;
                        b2 = 2;
                        i5 = 0;
                    } else {
                        b = b3;
                        i2 = i5;
                    }
                } else {
                    if (b5 != b3) {
                        grb.g();
                        return;
                    }
                    int a = ey7Var.a();
                    int i7 = this.j;
                    int i8 = i7 == i4 ? i5 : a - i7;
                    if (i8 > 0) {
                        a -= i8;
                        ey7Var.M(ey7Var.b + a);
                    }
                    av3Var.b(ey7Var);
                    int i9 = this.j;
                    if (i9 != i4) {
                        int i10 = i9 - a;
                        this.j = i10;
                        if (i10 == 0) {
                            av3Var.e();
                            this.c = (byte) 1;
                            this.d = i5;
                        }
                    }
                    i2 = i5;
                    b = b3;
                }
            } else {
                i2 = i5;
                b = b3;
                ey7Var.O(ey7Var.a());
            }
            b3 = b;
            i5 = i2;
            i4 = -1;
            b2 = 2;
        }
    }

    public final boolean b(ey7 ey7Var, byte[] bArr, int i) {
        int min = Math.min(ey7Var.a(), i - this.d);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            ey7Var.O(min);
        } else {
            ey7Var.k(this.d, min, bArr);
        }
        int i2 = this.d + min;
        this.d = i2;
        return i2 == i;
    }

    @Override // m6c
    public final void c(usb usbVar, g84 g84Var, l6c l6cVar) {
        this.e = usbVar;
        this.a.h(g84Var, l6cVar);
    }

    @Override // m6c
    public final void d() {
        this.c = (byte) 0;
        this.d = 0;
        this.h = false;
        this.a.d();
    }

    public final boolean e() {
        zd1 zd1Var = this.b;
        zd1Var.l(0);
        int f = zd1Var.f(24);
        if (f != 1) {
            c00.p(f, "Unexpected start code prefix: ", "PesReader");
            this.j = -1;
            return false;
        }
        zd1Var.n(8);
        int f2 = zd1Var.f(16);
        zd1Var.n(5);
        this.k = zd1Var.e();
        zd1Var.n(2);
        this.f = zd1Var.e();
        this.g = zd1Var.e();
        zd1Var.n(6);
        int f3 = zd1Var.f(8);
        this.i = f3;
        if (f2 == 0) {
            this.j = -1;
            return true;
        }
        int i = (f2 - 3) - f3;
        this.j = i;
        if (i < 0) {
            efd.f("PesReader", "Found negative packet payload size: " + this.j);
            this.j = -1;
        }
        return true;
    }
}
