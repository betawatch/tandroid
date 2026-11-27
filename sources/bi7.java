// default package

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class bi7 implements av3 {
    public final ey7 a;
    public final ci7 b;
    public final String c;
    public final int d;
    public final String e;
    public x1c f;
    public String g;
    public byte h = 0;
    public int i;
    public boolean j;
    public boolean k;
    public long l;
    public int m;
    public long n;

    public bi7(String str, int i, String str2) {
        ey7 ey7Var = new ey7(4);
        this.a = ey7Var;
        ey7Var.a[0] = -1;
        this.b = new ci7();
        this.n = -9223372036854775807L;
        this.c = str;
        this.d = i;
        this.e = str2;
    }

    @Override // av3
    public final void b(ey7 ey7Var) {
        this.f.getClass();
        while (ey7Var.a() > 0) {
            byte b = this.h;
            ey7 ey7Var2 = this.a;
            if (b == 0) {
                byte[] bArr = ey7Var.a;
                int i = ey7Var.b;
                int i2 = ey7Var.c;
                while (true) {
                    if (i >= i2) {
                        ey7Var.N(i2);
                        break;
                    }
                    byte b2 = bArr[i];
                    boolean z = (b2 & 255) == 255;
                    boolean z2 = this.k && (b2 & 224) == 224;
                    this.k = z;
                    if (z2) {
                        ey7Var.N(i + 1);
                        this.k = false;
                        ey7Var2.a[1] = bArr[i];
                        this.i = 2;
                        this.h = (byte) 1;
                        break;
                    }
                    i++;
                }
            } else if (b == 1) {
                int min = Math.min(ey7Var.a(), 4 - this.i);
                ey7Var.k(this.i, min, ey7Var2.a);
                int i3 = this.i + min;
                this.i = i3;
                if (i3 >= 4) {
                    ey7Var2.N(0);
                    int m = ey7Var2.m();
                    ci7 ci7Var = this.b;
                    if (ci7Var.a(m)) {
                        this.m = ci7Var.c;
                        if (!this.j) {
                            this.l = (ci7Var.g * 1000000) / ci7Var.d;
                            jo4 jo4Var = new jo4();
                            jo4Var.a = this.g;
                            jo4Var.r = dg7.n(this.e);
                            jo4Var.s = dg7.n(ci7Var.b);
                            jo4Var.t = TLObject.FLAG_12;
                            jo4Var.M = ci7Var.e;
                            jo4Var.O = ci7Var.d;
                            jo4Var.d = this.c;
                            jo4Var.f = this.d;
                            this.f.g(new ko4(jo4Var));
                            this.j = true;
                        }
                        ey7Var2.N(0);
                        this.f.e(4, ey7Var2);
                        this.h = (byte) 2;
                    } else {
                        this.i = 0;
                        this.h = (byte) 1;
                    }
                }
            } else {
                if (b != 2) {
                    grb.g();
                    return;
                }
                int min2 = Math.min(ey7Var.a(), this.m - this.i);
                this.f.e(min2, ey7Var);
                int i4 = this.i + min2;
                this.i = i4;
                if (i4 >= this.m) {
                    yve.p(this.n != -9223372036854775807L);
                    this.f.a(this.n, 1, this.m, 0, null);
                    this.n += this.l;
                    this.i = 0;
                    this.h = (byte) 0;
                }
            }
        }
    }

    @Override // av3
    public final void d() {
        this.h = (byte) 0;
        this.i = 0;
        this.k = false;
        this.n = -9223372036854775807L;
    }

    @Override // av3
    public final void g(int i, long j) {
        this.n = j;
    }

    @Override // av3
    public final void h(g84 g84Var, l6c l6cVar) {
        l6cVar.a();
        l6cVar.b();
        this.g = l6cVar.e;
        l6cVar.b();
        this.f = g84Var.e0(l6cVar.d, 1);
    }

    @Override // av3
    public final void e() {
    }

    @Override // av3
    public final void f() {
    }
}
