// default package

import j$.util.Objects;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class g4 implements av3 {
    public final /* synthetic */ byte a;
    public final zd1 b;
    public final ey7 c;
    public final String d;
    public final int e;
    public final String f;
    public String g;
    public x1c h;
    public byte i;
    public int j;
    public boolean k;
    public long l;
    public ko4 m;
    public int n;
    public long o;

    public g4(String str, int i, String str2, byte b) {
        this.a = b;
        switch (b) {
            case 1:
                zd1 zd1Var = new zd1(16, new byte[16]);
                this.b = zd1Var;
                this.c = new ey7(zd1Var.b);
                this.i = (byte) 0;
                this.j = 0;
                this.k = false;
                this.o = -9223372036854775807L;
                this.d = str;
                this.e = i;
                this.f = str2;
                break;
            default:
                zd1 zd1Var2 = new zd1(128, new byte[128]);
                this.b = zd1Var2;
                this.c = new ey7(zd1Var2.b);
                this.i = (byte) 0;
                this.o = -9223372036854775807L;
                this.d = str;
                this.e = i;
                this.f = str2;
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x03d8  */
    @Override // av3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(ey7 ey7Var) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        String str;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        long j;
        ey7 ey7Var2 = ey7Var;
        byte b = this.a;
        int i18 = this.e;
        String str2 = this.d;
        String str3 = this.f;
        zd1 zd1Var = this.b;
        long j2 = -9223372036854775807L;
        byte b2 = 0;
        byte b3 = 1;
        int i19 = 2;
        ey7 ey7Var3 = this.c;
        int i20 = 16;
        switch (b) {
            case 0:
                this.h.getClass();
                while (ey7Var2.a() > 0) {
                    int i21 = this.i;
                    if (i21 == 0) {
                        while (true) {
                            if (ey7Var.a() <= 0) {
                                ey7Var2 = ey7Var;
                                b2 = 0;
                                b3 = 1;
                                i19 = 2;
                            } else if (this.k) {
                                int A = ey7Var.A();
                                if (A == 119) {
                                    this.k = false;
                                    b3 = 1;
                                    this.i = (byte) 1;
                                    byte[] bArr = ey7Var3.a;
                                    bArr[0] = 11;
                                    bArr[1] = 119;
                                    this.j = 2;
                                    ey7Var2 = ey7Var;
                                    i19 = 2;
                                    b2 = 0;
                                } else {
                                    this.k = A == 11;
                                }
                            } else {
                                this.k = ey7Var.A() == 11;
                            }
                        }
                    } else if (i21 == b3) {
                        byte[] bArr2 = ey7Var3.a;
                        int min = Math.min(ey7Var2.a(), 128 - this.j);
                        ey7Var2.k(this.j, min, bArr2);
                        int i22 = this.j + min;
                        this.j = i22;
                        if (i22 == 128) {
                            zd1Var.l(b2);
                            int[] iArr = ud3.e;
                            int[] iArr2 = ud3.c;
                            int i23 = (zd1Var.c << 3) + zd1Var.d;
                            zd1Var.n(40);
                            byte b4 = zd1Var.f(5) > 10 ? b3 : (byte) 0;
                            zd1Var.l(i23);
                            if (b4 != 0) {
                                zd1Var.n(i20);
                                int f = zd1Var.f(i19);
                                int i24 = f != 0 ? f != b3 ? f != i19 ? -1 : i19 : b3 : 0;
                                zd1Var.n(3);
                                i4 = (zd1Var.f(11) + b3) << b3;
                                int f2 = zd1Var.f(i19);
                                if (f2 == 3) {
                                    i6 = ud3.d[zd1Var.f(i19)];
                                    i7 = 3;
                                    i8 = 6;
                                } else {
                                    int f3 = zd1Var.f(i19);
                                    int i25 = ud3.b[f3];
                                    i6 = iArr2[f2];
                                    i7 = f3;
                                    i8 = i25;
                                }
                                i3 = i8 << 8;
                                int i26 = (i4 * i6) / (i8 << 5);
                                int f4 = zd1Var.f(3);
                                boolean e = zd1Var.e();
                                i2 = iArr[f4] + (e ? 1 : 0);
                                zd1Var.n(10);
                                if (zd1Var.e()) {
                                    zd1Var.n(8);
                                }
                                if (f4 == 0) {
                                    zd1Var.n(5);
                                    if (zd1Var.e()) {
                                        zd1Var.n(8);
                                    }
                                }
                                if (i24 == 1 && zd1Var.e()) {
                                    zd1Var.n(16);
                                }
                                if (zd1Var.e()) {
                                    if (f4 > 2) {
                                        zd1Var.n(2);
                                    }
                                    if ((f4 & 1) == 0 || f4 <= 2) {
                                        i13 = 6;
                                    } else {
                                        i13 = 6;
                                        zd1Var.n(6);
                                    }
                                    if ((f4 & 4) != 0) {
                                        zd1Var.n(i13);
                                    }
                                    if (e && zd1Var.e()) {
                                        zd1Var.n(5);
                                    }
                                    if (i24 == 0) {
                                        if (zd1Var.e()) {
                                            i14 = 6;
                                            zd1Var.n(6);
                                        } else {
                                            i14 = 6;
                                        }
                                        if (f4 == 0 && zd1Var.e()) {
                                            zd1Var.n(i14);
                                        }
                                        if (zd1Var.e()) {
                                            zd1Var.n(i14);
                                        }
                                        int f5 = zd1Var.f(2);
                                        if (f5 == 1) {
                                            zd1Var.n(5);
                                        } else if (f5 == 2) {
                                            zd1Var.n(12);
                                        } else if (f5 == 3) {
                                            int f6 = zd1Var.f(5);
                                            if (zd1Var.e()) {
                                                zd1Var.n(5);
                                                if (zd1Var.e()) {
                                                    i16 = 4;
                                                    zd1Var.n(4);
                                                } else {
                                                    i16 = 4;
                                                }
                                                if (zd1Var.e()) {
                                                    zd1Var.n(i16);
                                                }
                                                if (zd1Var.e()) {
                                                    zd1Var.n(i16);
                                                }
                                                if (zd1Var.e()) {
                                                    zd1Var.n(i16);
                                                }
                                                if (zd1Var.e()) {
                                                    zd1Var.n(i16);
                                                }
                                                if (zd1Var.e()) {
                                                    zd1Var.n(i16);
                                                }
                                                if (zd1Var.e()) {
                                                    zd1Var.n(i16);
                                                }
                                                if (zd1Var.e()) {
                                                    if (zd1Var.e()) {
                                                        zd1Var.n(i16);
                                                    }
                                                    if (zd1Var.e()) {
                                                        zd1Var.n(i16);
                                                    }
                                                }
                                            }
                                            if (zd1Var.e()) {
                                                zd1Var.n(5);
                                                if (zd1Var.e()) {
                                                    zd1Var.n(7);
                                                    if (zd1Var.e()) {
                                                        zd1Var.n(8);
                                                    }
                                                }
                                            }
                                            i15 = 2;
                                            zd1Var.n((f6 + 2) << 3);
                                            zd1Var.c();
                                            if (f4 < i15) {
                                                if (zd1Var.e()) {
                                                    zd1Var.n(14);
                                                }
                                                if (f4 == 0 && zd1Var.e()) {
                                                    zd1Var.n(14);
                                                }
                                            }
                                            if (zd1Var.e()) {
                                                i9 = i7;
                                                if (i9 == 0) {
                                                    zd1Var.n(5);
                                                } else {
                                                    int i27 = 0;
                                                    while (i27 < i8) {
                                                        if (zd1Var.e()) {
                                                            i17 = i27;
                                                            zd1Var.n(5);
                                                        } else {
                                                            i17 = i27;
                                                        }
                                                        i27 = i17 + 1;
                                                    }
                                                }
                                                if (zd1Var.e()) {
                                                    i10 = 3;
                                                } else {
                                                    zd1Var.n(5);
                                                    if (f4 == 2) {
                                                        zd1Var.n(4);
                                                    }
                                                    if (f4 >= 6) {
                                                        zd1Var.n(2);
                                                    }
                                                    if (zd1Var.e()) {
                                                        i12 = 8;
                                                        zd1Var.n(8);
                                                    } else {
                                                        i12 = 8;
                                                    }
                                                    if (f4 == 0 && zd1Var.e()) {
                                                        zd1Var.n(i12);
                                                    }
                                                    i10 = 3;
                                                    if (f2 < 3) {
                                                        zd1Var.m();
                                                    }
                                                }
                                                if (i24 == 0 && i9 != i10) {
                                                    zd1Var.m();
                                                }
                                                if (i24 == 2 || !(i9 == i10 || zd1Var.e())) {
                                                    i11 = 6;
                                                } else {
                                                    i11 = 6;
                                                    zd1Var.n(6);
                                                }
                                                str = (!zd1Var.e() && zd1Var.f(i11) == 1 && zd1Var.f(8) == 1) ? "audio/eac3-joc" : "audio/eac3";
                                                i5 = i26;
                                            }
                                        }
                                        i15 = 2;
                                        if (f4 < i15) {
                                        }
                                        if (zd1Var.e()) {
                                        }
                                    }
                                }
                                i9 = i7;
                                if (zd1Var.e()) {
                                }
                                if (i24 == 0) {
                                    zd1Var.m();
                                }
                                if (i24 == 2) {
                                }
                                i11 = 6;
                                if (!zd1Var.e()) {
                                }
                                i5 = i26;
                            } else {
                                zd1Var.n(32);
                                int f7 = zd1Var.f(2);
                                String str4 = f7 == 3 ? null : "audio/ac3";
                                int f8 = zd1Var.f(6);
                                int i28 = ud3.f[f8 / 2] * 1000;
                                int a = ud3.a(f7, f8);
                                zd1Var.n(8);
                                int f9 = zd1Var.f(3);
                                if ((f9 & 1) == 0 || f9 == 1) {
                                    i = 2;
                                } else {
                                    i = 2;
                                    zd1Var.n(2);
                                }
                                if ((f9 & 4) != 0) {
                                    zd1Var.n(i);
                                }
                                if (f9 == i) {
                                    zd1Var.n(i);
                                }
                                int i29 = f7 < 3 ? iArr2[f7] : -1;
                                i2 = iArr[f9] + (zd1Var.e() ? 1 : 0);
                                i3 = 1536;
                                i4 = a;
                                i5 = i28;
                                str = str4;
                                i6 = i29;
                            }
                            int i30 = i3;
                            ko4 ko4Var = this.m;
                            if (ko4Var == null || i2 != ko4Var.N || i6 != ko4Var.P || !Objects.equals(str, ko4Var.t)) {
                                jo4 jo4Var = new jo4();
                                jo4Var.a = this.g;
                                jo4Var.r = dg7.n(str3);
                                jo4Var.s = dg7.n(str);
                                jo4Var.M = i2;
                                jo4Var.O = i6;
                                jo4Var.d = str2;
                                jo4Var.f = i18;
                                jo4Var.j = i5;
                                if ("audio/ac3".equals(str)) {
                                    jo4Var.i = i5;
                                }
                                ko4 ko4Var2 = new ko4(jo4Var);
                                this.m = ko4Var2;
                                this.h.g(ko4Var2);
                            }
                            this.n = i4;
                            this.l = (i30 * 1000000) / this.m.P;
                            ey7Var3.N(0);
                            this.h.e(128, ey7Var3);
                            this.i = (byte) 2;
                            ey7Var2 = ey7Var;
                            i19 = 2;
                            b2 = 0;
                            b3 = 1;
                        } else {
                            ey7Var2 = ey7Var;
                        }
                    } else if (i21 == i19) {
                        int min2 = Math.min(ey7Var2.a(), this.n - this.j);
                        this.h.e(min2, ey7Var2);
                        int i31 = this.j + min2;
                        this.j = i31;
                        if (i31 == this.n) {
                            yve.p(this.o != -9223372036854775807L ? b3 : b2);
                            this.h.a(this.o, 1, this.n, 0, null);
                            this.o += this.l;
                            this.i = b2;
                        }
                    }
                    i20 = 16;
                }
                break;
            default:
                this.h.getClass();
                while (ey7Var2.a() > 0) {
                    byte b5 = this.i;
                    if (b5 == 0) {
                        j = j2;
                        while (ey7Var2.a() > 0) {
                            if (this.k) {
                                int A2 = ey7Var2.A();
                                this.k = A2 == 172;
                                if (A2 == 64 || A2 == 65) {
                                    Object[] objArr = A2 == 65;
                                    this.i = (byte) 1;
                                    byte[] bArr3 = ey7Var3.a;
                                    bArr3[0] = -84;
                                    bArr3[1] = (byte) (objArr == true ? 65 : 64);
                                    this.j = 2;
                                }
                            } else {
                                this.k = ey7Var2.A() == 172;
                            }
                        }
                    } else if (b5 == 1) {
                        j = j2;
                        byte[] bArr4 = ey7Var3.a;
                        int min3 = Math.min(ey7Var2.a(), 16 - this.j);
                        ey7Var2.k(this.j, min3, bArr4);
                        int i32 = this.j + min3;
                        this.j = i32;
                        if (i32 == 16) {
                            zd1Var.l(0);
                            j4 e2 = ok7.e(zd1Var);
                            char c = e2.a;
                            ko4 ko4Var3 = this.m;
                            if (ko4Var3 == null || 2 != ko4Var3.N || c != ko4Var3.P || !"audio/ac4".equals(ko4Var3.t)) {
                                jo4 jo4Var2 = new jo4();
                                jo4Var2.a = this.g;
                                jo4Var2.r = dg7.n(str3);
                                jo4Var2.s = dg7.n("audio/ac4");
                                jo4Var2.M = 2;
                                jo4Var2.O = c;
                                jo4Var2.d = str2;
                                jo4Var2.f = i18;
                                ko4 ko4Var4 = new ko4(jo4Var2);
                                this.m = ko4Var4;
                                this.h.g(ko4Var4);
                            }
                            this.n = e2.b;
                            this.l = (e2.c * 1000000) / this.m.P;
                            ey7Var3.N(0);
                            this.h.e(16, ey7Var3);
                            this.i = (byte) 2;
                        }
                    } else if (b5 == 2) {
                        int min4 = Math.min(ey7Var2.a(), this.n - this.j);
                        this.h.e(min4, ey7Var2);
                        int i33 = this.j + min4;
                        this.j = i33;
                        if (i33 == this.n) {
                            yve.p(this.o != j2);
                            j = j2;
                            this.h.a(this.o, 1, this.n, 0, null);
                            this.o += this.l;
                            this.i = (byte) 0;
                        }
                    }
                    j2 = j;
                }
                break;
        }
    }

    @Override // av3
    public final void d() {
        switch (this.a) {
            case 0:
                this.i = (byte) 0;
                this.j = 0;
                this.k = false;
                this.o = -9223372036854775807L;
                break;
            default:
                this.i = (byte) 0;
                this.j = 0;
                this.k = false;
                this.o = -9223372036854775807L;
                break;
        }
    }

    @Override // av3
    public final void e() {
        byte b = this.a;
    }

    @Override // av3
    public final void f() {
        byte b = this.a;
    }

    @Override // av3
    public final void g(int i, long j) {
        switch (this.a) {
            case 0:
                this.o = j;
                break;
            default:
                this.o = j;
                break;
        }
    }

    @Override // av3
    public final void h(g84 g84Var, l6c l6cVar) {
        switch (this.a) {
            case 0:
                l6cVar.a();
                l6cVar.b();
                this.g = l6cVar.e;
                l6cVar.b();
                this.h = g84Var.e0(l6cVar.d, 1);
                break;
            default:
                l6cVar.a();
                l6cVar.b();
                this.g = l6cVar.e;
                l6cVar.b();
                this.h = g84Var.e0(l6cVar.d, 1);
                break;
        }
    }

    private final void a() {
    }

    private final void c() {
    }

    private final void i() {
    }

    private final void j() {
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public g4(String str) {
        this(null, 0, str, (byte) 0);
        this.a = (byte) 0;
    }
}
