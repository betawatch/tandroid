// default package

import j$.util.Objects;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class f4 implements gu3 {
    public final /* synthetic */ byte a;
    public final qd1 b;
    public final xu7 c;
    public final String d;
    public final int e;
    public final String f;
    public String g;
    public wxb h;
    public byte i;
    public int j;
    public boolean k;
    public long l;
    public fm4 m;
    public int n;
    public long o;

    public f4(String str, int i, String str2, byte b) {
        this.a = b;
        switch (b) {
            case 1:
                qd1 qd1Var = new qd1(16, new byte[16]);
                this.b = qd1Var;
                this.c = new xu7(qd1Var.b);
                this.i = (byte) 0;
                this.j = 0;
                this.k = false;
                this.o = -9223372036854775807L;
                this.d = str;
                this.e = i;
                this.f = str2;
                break;
            default:
                qd1 qd1Var2 = new qd1(128, new byte[128]);
                this.b = qd1Var2;
                this.c = new xu7(qd1Var2.b);
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
    @Override // gu3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(xu7 xu7Var) {
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
        xu7 xu7Var2 = xu7Var;
        byte b = this.a;
        int i18 = this.e;
        String str2 = this.d;
        String str3 = this.f;
        qd1 qd1Var = this.b;
        long j2 = -9223372036854775807L;
        byte b2 = 0;
        byte b3 = 1;
        int i19 = 2;
        xu7 xu7Var3 = this.c;
        int i20 = 16;
        switch (b) {
            case 0:
                this.h.getClass();
                while (xu7Var2.a() > 0) {
                    int i21 = this.i;
                    if (i21 == 0) {
                        while (true) {
                            if (xu7Var.a() <= 0) {
                                xu7Var2 = xu7Var;
                                b2 = 0;
                                b3 = 1;
                                i19 = 2;
                            } else if (this.k) {
                                int A = xu7Var.A();
                                if (A == 119) {
                                    this.k = false;
                                    b3 = 1;
                                    this.i = (byte) 1;
                                    byte[] bArr = xu7Var3.a;
                                    bArr[0] = 11;
                                    bArr[1] = 119;
                                    this.j = 2;
                                    xu7Var2 = xu7Var;
                                    i19 = 2;
                                    b2 = 0;
                                } else {
                                    this.k = A == 11;
                                }
                            } else {
                                this.k = xu7Var.A() == 11;
                            }
                        }
                    } else if (i21 == b3) {
                        byte[] bArr2 = xu7Var3.a;
                        int min = Math.min(xu7Var2.a(), 128 - this.j);
                        xu7Var2.k(this.j, min, bArr2);
                        int i22 = this.j + min;
                        this.j = i22;
                        if (i22 == 128) {
                            qd1Var.l(b2);
                            int[] iArr = cd3.e;
                            int[] iArr2 = cd3.c;
                            int i23 = (qd1Var.c << 3) + qd1Var.d;
                            qd1Var.n(40);
                            byte b4 = qd1Var.f(5) > 10 ? b3 : (byte) 0;
                            qd1Var.l(i23);
                            if (b4 != 0) {
                                qd1Var.n(i20);
                                int f = qd1Var.f(i19);
                                int i24 = f != 0 ? f != b3 ? f != i19 ? -1 : i19 : b3 : 0;
                                qd1Var.n(3);
                                i4 = (qd1Var.f(11) + b3) << b3;
                                int f2 = qd1Var.f(i19);
                                if (f2 == 3) {
                                    i6 = cd3.d[qd1Var.f(i19)];
                                    i7 = 3;
                                    i8 = 6;
                                } else {
                                    int f3 = qd1Var.f(i19);
                                    int i25 = cd3.b[f3];
                                    i6 = iArr2[f2];
                                    i7 = f3;
                                    i8 = i25;
                                }
                                i3 = i8 << 8;
                                int i26 = (i4 * i6) / (i8 << 5);
                                int f4 = qd1Var.f(3);
                                boolean e = qd1Var.e();
                                i2 = iArr[f4] + (e ? 1 : 0);
                                qd1Var.n(10);
                                if (qd1Var.e()) {
                                    qd1Var.n(8);
                                }
                                if (f4 == 0) {
                                    qd1Var.n(5);
                                    if (qd1Var.e()) {
                                        qd1Var.n(8);
                                    }
                                }
                                if (i24 == 1 && qd1Var.e()) {
                                    qd1Var.n(16);
                                }
                                if (qd1Var.e()) {
                                    if (f4 > 2) {
                                        qd1Var.n(2);
                                    }
                                    if ((f4 & 1) == 0 || f4 <= 2) {
                                        i13 = 6;
                                    } else {
                                        i13 = 6;
                                        qd1Var.n(6);
                                    }
                                    if ((f4 & 4) != 0) {
                                        qd1Var.n(i13);
                                    }
                                    if (e && qd1Var.e()) {
                                        qd1Var.n(5);
                                    }
                                    if (i24 == 0) {
                                        if (qd1Var.e()) {
                                            i14 = 6;
                                            qd1Var.n(6);
                                        } else {
                                            i14 = 6;
                                        }
                                        if (f4 == 0 && qd1Var.e()) {
                                            qd1Var.n(i14);
                                        }
                                        if (qd1Var.e()) {
                                            qd1Var.n(i14);
                                        }
                                        int f5 = qd1Var.f(2);
                                        if (f5 == 1) {
                                            qd1Var.n(5);
                                        } else if (f5 == 2) {
                                            qd1Var.n(12);
                                        } else if (f5 == 3) {
                                            int f6 = qd1Var.f(5);
                                            if (qd1Var.e()) {
                                                qd1Var.n(5);
                                                if (qd1Var.e()) {
                                                    i16 = 4;
                                                    qd1Var.n(4);
                                                } else {
                                                    i16 = 4;
                                                }
                                                if (qd1Var.e()) {
                                                    qd1Var.n(i16);
                                                }
                                                if (qd1Var.e()) {
                                                    qd1Var.n(i16);
                                                }
                                                if (qd1Var.e()) {
                                                    qd1Var.n(i16);
                                                }
                                                if (qd1Var.e()) {
                                                    qd1Var.n(i16);
                                                }
                                                if (qd1Var.e()) {
                                                    qd1Var.n(i16);
                                                }
                                                if (qd1Var.e()) {
                                                    qd1Var.n(i16);
                                                }
                                                if (qd1Var.e()) {
                                                    if (qd1Var.e()) {
                                                        qd1Var.n(i16);
                                                    }
                                                    if (qd1Var.e()) {
                                                        qd1Var.n(i16);
                                                    }
                                                }
                                            }
                                            if (qd1Var.e()) {
                                                qd1Var.n(5);
                                                if (qd1Var.e()) {
                                                    qd1Var.n(7);
                                                    if (qd1Var.e()) {
                                                        qd1Var.n(8);
                                                    }
                                                }
                                            }
                                            i15 = 2;
                                            qd1Var.n((f6 + 2) << 3);
                                            qd1Var.c();
                                            if (f4 < i15) {
                                                if (qd1Var.e()) {
                                                    qd1Var.n(14);
                                                }
                                                if (f4 == 0 && qd1Var.e()) {
                                                    qd1Var.n(14);
                                                }
                                            }
                                            if (qd1Var.e()) {
                                                i9 = i7;
                                                if (i9 == 0) {
                                                    qd1Var.n(5);
                                                } else {
                                                    int i27 = 0;
                                                    while (i27 < i8) {
                                                        if (qd1Var.e()) {
                                                            i17 = i27;
                                                            qd1Var.n(5);
                                                        } else {
                                                            i17 = i27;
                                                        }
                                                        i27 = i17 + 1;
                                                    }
                                                }
                                                if (qd1Var.e()) {
                                                    i10 = 3;
                                                } else {
                                                    qd1Var.n(5);
                                                    if (f4 == 2) {
                                                        qd1Var.n(4);
                                                    }
                                                    if (f4 >= 6) {
                                                        qd1Var.n(2);
                                                    }
                                                    if (qd1Var.e()) {
                                                        i12 = 8;
                                                        qd1Var.n(8);
                                                    } else {
                                                        i12 = 8;
                                                    }
                                                    if (f4 == 0 && qd1Var.e()) {
                                                        qd1Var.n(i12);
                                                    }
                                                    i10 = 3;
                                                    if (f2 < 3) {
                                                        qd1Var.m();
                                                    }
                                                }
                                                if (i24 == 0 && i9 != i10) {
                                                    qd1Var.m();
                                                }
                                                if (i24 == 2 || !(i9 == i10 || qd1Var.e())) {
                                                    i11 = 6;
                                                } else {
                                                    i11 = 6;
                                                    qd1Var.n(6);
                                                }
                                                str = (!qd1Var.e() && qd1Var.f(i11) == 1 && qd1Var.f(8) == 1) ? "audio/eac3-joc" : "audio/eac3";
                                                i5 = i26;
                                            }
                                        }
                                        i15 = 2;
                                        if (f4 < i15) {
                                        }
                                        if (qd1Var.e()) {
                                        }
                                    }
                                }
                                i9 = i7;
                                if (qd1Var.e()) {
                                }
                                if (i24 == 0) {
                                    qd1Var.m();
                                }
                                if (i24 == 2) {
                                }
                                i11 = 6;
                                if (!qd1Var.e()) {
                                }
                                i5 = i26;
                            } else {
                                qd1Var.n(32);
                                int f7 = qd1Var.f(2);
                                String str4 = f7 == 3 ? null : "audio/ac3";
                                int f8 = qd1Var.f(6);
                                int i28 = cd3.f[f8 / 2] * 1000;
                                int a = cd3.a(f7, f8);
                                qd1Var.n(8);
                                int f9 = qd1Var.f(3);
                                if ((f9 & 1) == 0 || f9 == 1) {
                                    i = 2;
                                } else {
                                    i = 2;
                                    qd1Var.n(2);
                                }
                                if ((f9 & 4) != 0) {
                                    qd1Var.n(i);
                                }
                                if (f9 == i) {
                                    qd1Var.n(i);
                                }
                                int i29 = f7 < 3 ? iArr2[f7] : -1;
                                i2 = iArr[f9] + (qd1Var.e() ? 1 : 0);
                                i3 = 1536;
                                i4 = a;
                                i5 = i28;
                                str = str4;
                                i6 = i29;
                            }
                            int i30 = i3;
                            fm4 fm4Var = this.m;
                            if (fm4Var == null || i2 != fm4Var.N || i6 != fm4Var.P || !Objects.equals(str, fm4Var.t)) {
                                em4 em4Var = new em4();
                                em4Var.a = this.g;
                                em4Var.r = ud7.n(str3);
                                em4Var.s = ud7.n(str);
                                em4Var.M = i2;
                                em4Var.O = i6;
                                em4Var.d = str2;
                                em4Var.f = i18;
                                em4Var.j = i5;
                                if ("audio/ac3".equals(str)) {
                                    em4Var.i = i5;
                                }
                                fm4 fm4Var2 = new fm4(em4Var);
                                this.m = fm4Var2;
                                this.h.g(fm4Var2);
                            }
                            this.n = i4;
                            this.l = (i30 * 1000000) / this.m.P;
                            xu7Var3.N(0);
                            this.h.e(128, xu7Var3);
                            this.i = (byte) 2;
                            xu7Var2 = xu7Var;
                            i19 = 2;
                            b2 = 0;
                            b3 = 1;
                        } else {
                            xu7Var2 = xu7Var;
                        }
                    } else if (i21 == i19) {
                        int min2 = Math.min(xu7Var2.a(), this.n - this.j);
                        this.h.e(min2, xu7Var2);
                        int i31 = this.j + min2;
                        this.j = i31;
                        if (i31 == this.n) {
                            gre.p(this.o != -9223372036854775807L ? b3 : b2);
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
                while (xu7Var2.a() > 0) {
                    byte b5 = this.i;
                    if (b5 == 0) {
                        j = j2;
                        while (xu7Var2.a() > 0) {
                            if (this.k) {
                                int A2 = xu7Var2.A();
                                this.k = A2 == 172;
                                if (A2 == 64 || A2 == 65) {
                                    Object[] objArr = A2 == 65;
                                    this.i = (byte) 1;
                                    byte[] bArr3 = xu7Var3.a;
                                    bArr3[0] = -84;
                                    bArr3[1] = (byte) (objArr == true ? 65 : 64);
                                    this.j = 2;
                                }
                            } else {
                                this.k = xu7Var2.A() == 172;
                            }
                        }
                    } else if (b5 == 1) {
                        j = j2;
                        byte[] bArr4 = xu7Var3.a;
                        int min3 = Math.min(xu7Var2.a(), 16 - this.j);
                        xu7Var2.k(this.j, min3, bArr4);
                        int i32 = this.j + min3;
                        this.j = i32;
                        if (i32 == 16) {
                            qd1Var.l(0);
                            i4 e2 = gi7.e(qd1Var);
                            char c = e2.a;
                            fm4 fm4Var3 = this.m;
                            if (fm4Var3 == null || 2 != fm4Var3.N || c != fm4Var3.P || !"audio/ac4".equals(fm4Var3.t)) {
                                em4 em4Var2 = new em4();
                                em4Var2.a = this.g;
                                em4Var2.r = ud7.n(str3);
                                em4Var2.s = ud7.n("audio/ac4");
                                em4Var2.M = 2;
                                em4Var2.O = c;
                                em4Var2.d = str2;
                                em4Var2.f = i18;
                                fm4 fm4Var4 = new fm4(em4Var2);
                                this.m = fm4Var4;
                                this.h.g(fm4Var4);
                            }
                            this.n = e2.b;
                            this.l = (e2.c * 1000000) / this.m.P;
                            xu7Var3.N(0);
                            this.h.e(16, xu7Var3);
                            this.i = (byte) 2;
                        }
                    } else if (b5 == 2) {
                        int min4 = Math.min(xu7Var2.a(), this.n - this.j);
                        this.h.e(min4, xu7Var2);
                        int i33 = this.j + min4;
                        this.j = i33;
                        if (i33 == this.n) {
                            gre.p(this.o != j2);
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

    @Override // gu3
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

    @Override // gu3
    public final void e() {
        byte b = this.a;
    }

    @Override // gu3
    public final void f() {
        byte b = this.a;
    }

    @Override // gu3
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

    @Override // gu3
    public final void h(l74 l74Var, l2c l2cVar) {
        switch (this.a) {
            case 0:
                l2cVar.a();
                l2cVar.b();
                this.g = l2cVar.e;
                l2cVar.b();
                this.h = l74Var.S(l2cVar.d, 1);
                break;
            default:
                l2cVar.a();
                l2cVar.b();
                this.g = l2cVar.e;
                l2cVar.b();
                this.h = l74Var.S(l2cVar.d, 1);
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
    public f4(String str) {
        this(null, 0, str, (byte) 0);
        this.a = (byte) 0;
    }
}
