// default package

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class di7 implements av3 {
    public String e;
    public x1c f;
    public boolean i;
    public int k;
    public int l;
    public int n;
    public int o;
    public int s;
    public boolean u;
    public byte d = 0;
    public final ey7 a = new ey7(2, new byte[15]);
    public final zd1 b = new zd1();
    public final ey7 c = new ey7();
    public final qz0 p = new qz0();
    public int q = -2147483647;
    public int r = -1;
    public long t = -1;
    public boolean j = true;
    public boolean m = true;
    public double g = -9.223372036854776E18d;
    public double h = -9.223372036854776E18d;

    /* JADX WARN: Removed duplicated region for block: B:53:0x0402  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x045e A[SYNTHETIC] */
    @Override // av3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(ey7 ey7Var) {
        int i;
        byte b;
        int i2;
        int i3;
        int i4;
        char c;
        byte[] bArr;
        double d;
        int i5;
        long j;
        this.f.getClass();
        while (ey7Var.a() > 0) {
            byte b2 = this.d;
            int i6 = 8;
            int i7 = 3;
            int i8 = 1;
            if (b2 != 0) {
                ey7 ey7Var2 = this.c;
                qz0 qz0Var = this.p;
                if (b2 == 1) {
                    int a = ey7Var.a();
                    ey7 ey7Var3 = this.a;
                    int min = Math.min(a, ey7Var3.a());
                    ey7Var.k(ey7Var3.b, min, ey7Var3.a);
                    ey7Var3.O(min);
                    if (ey7Var3.a() == 0) {
                        int i9 = ey7Var3.c;
                        byte[] bArr2 = ey7Var3.a;
                        zd1 zd1Var = this.b;
                        zd1Var.j(i9, bArr2);
                        zd1Var.d();
                        int a2 = due.a(zd1Var, 3, 8, 8);
                        qz0Var.b = a2;
                        if (a2 != -1) {
                            qse.a(qse.a(3L, 255L), 4294967296L);
                            if (zd1Var.b() >= 2) {
                                long h = zd1Var.h(2);
                                if (h == 3) {
                                    if (zd1Var.b() >= 8) {
                                        long h2 = zd1Var.h(8);
                                        h += h2;
                                        if (h2 == 255) {
                                            if (zd1Var.b() >= 32) {
                                                h = zd1Var.h(32) + h;
                                            }
                                        }
                                    }
                                }
                                j = h;
                                qz0Var.c = j;
                                if (j != -1) {
                                    if (j > 16) {
                                        throw hy7.d("Contains sub-stream with an invalid packet label " + qz0Var.c);
                                    }
                                    if (j == 0) {
                                        int i10 = qz0Var.b;
                                        if (i10 == 1) {
                                            throw hy7.a("Mpegh3daConfig packet with invalid packet label 0", null);
                                        }
                                        if (i10 == 2) {
                                            throw hy7.a("Mpegh3daFrame packet with invalid packet label 0", null);
                                        }
                                        if (i10 == 17) {
                                            throw hy7.a("AudioTruncation packet with invalid packet label 0", null);
                                        }
                                    }
                                    int a3 = due.a(zd1Var, 11, 24, 24);
                                    qz0Var.d = a3;
                                    if (a3 != -1) {
                                        this.n = 0;
                                        this.o = a3 + i9 + this.o;
                                        ey7Var3.N(0);
                                        this.f.e(ey7Var3.c, ey7Var3);
                                        ey7Var3.K(2);
                                        ey7Var2.K(qz0Var.d);
                                        this.m = true;
                                        this.d = (byte) 2;
                                    }
                                }
                            }
                            j = -1;
                            qz0Var.c = j;
                            if (j != -1) {
                            }
                        }
                        int i11 = ey7Var3.c;
                        if (i11 < 15) {
                            ey7Var3.M(i11 + 1);
                            this.m = false;
                        }
                    } else {
                        this.m = false;
                    }
                } else {
                    if (b2 != 2) {
                        grb.g();
                        return;
                    }
                    int i12 = qz0Var.b;
                    if (i12 == 1 || i12 == 17) {
                        int i13 = ey7Var.b;
                        int min2 = Math.min(ey7Var.a(), ey7Var2.a());
                        ey7Var.k(ey7Var2.b, min2, ey7Var2.a);
                        ey7Var2.O(min2);
                        ey7Var.N(i13);
                    }
                    int min3 = Math.min(ey7Var.a(), qz0Var.d - this.n);
                    this.f.e(min3, ey7Var);
                    int i14 = this.n + min3;
                    this.n = i14;
                    if (i14 != qz0Var.d) {
                        continue;
                    } else {
                        int i15 = qz0Var.b;
                        if (i15 == 1) {
                            byte[] bArr3 = ey7Var2.a;
                            zd1 zd1Var2 = new zd1(bArr3.length, bArr3);
                            int f = zd1Var2.f(8);
                            int f2 = zd1Var2.f(5);
                            if (f2 != 31) {
                                switch (f2) {
                                    case 0:
                                        i3 = 96000;
                                        break;
                                    case 1:
                                        i3 = 88200;
                                        break;
                                    case 2:
                                        i3 = 64000;
                                        break;
                                    case 3:
                                        i3 = 48000;
                                        break;
                                    case 4:
                                        i3 = 44100;
                                        break;
                                    case 5:
                                        i3 = 32000;
                                        break;
                                    case 6:
                                        i3 = 24000;
                                        break;
                                    case 7:
                                        i3 = 22050;
                                        break;
                                    case 8:
                                        i3 = oc1.AUDIO_CONTENT_SAMPLING_RATE;
                                        break;
                                    case 9:
                                        i3 = 12000;
                                        break;
                                    case 10:
                                        i3 = 11025;
                                        break;
                                    case 11:
                                        i3 = 8000;
                                        break;
                                    case 12:
                                        i3 = 7350;
                                        break;
                                    case 13:
                                    case 14:
                                    default:
                                        throw hy7.d("Unsupported sampling rate index " + f2);
                                    case 15:
                                        i3 = 57600;
                                        break;
                                    case 16:
                                        i3 = 51200;
                                        break;
                                    case 17:
                                        i3 = 40000;
                                        break;
                                    case 18:
                                        i3 = 38400;
                                        break;
                                    case 19:
                                        i3 = 34150;
                                        break;
                                    case 20:
                                        i3 = 28800;
                                        break;
                                    case 21:
                                        i3 = 25600;
                                        break;
                                    case 22:
                                        i3 = 20000;
                                        break;
                                    case 23:
                                        i3 = 19200;
                                        break;
                                    case 24:
                                        i3 = 17075;
                                        break;
                                    case 25:
                                        i3 = 14400;
                                        break;
                                    case 26:
                                        i3 = 12800;
                                        break;
                                    case 27:
                                        i3 = 9600;
                                        break;
                                }
                            } else {
                                i3 = zd1Var2.f(24);
                            }
                            int f3 = zd1Var2.f(3);
                            if (f3 == 0) {
                                i4 = 768;
                            } else if (f3 == 1) {
                                i4 = 1024;
                            } else if (f3 == 2 || f3 == 3) {
                                i4 = 2048;
                            } else {
                                if (f3 != 4) {
                                    throw hy7.d("Unsupported coreSbrFrameLengthIndex " + f3);
                                }
                                i4 = TLObject.FLAG_12;
                            }
                            int i16 = i4;
                            if (f3 == 0 || f3 == 1) {
                                c = 0;
                            } else if (f3 == 2) {
                                c = 2;
                            } else if (f3 == 3) {
                                c = 3;
                            } else {
                                if (f3 != 4) {
                                    throw hy7.d("Unsupported coreSbrFrameLengthIndex " + f3);
                                }
                                c = 1;
                            }
                            zd1Var2.n(2);
                            due.c(zd1Var2);
                            int f4 = zd1Var2.f(5);
                            int i17 = 0;
                            int i18 = 0;
                            while (true) {
                                int i19 = i8;
                                int i20 = 16;
                                if (i17 < f4 + 1) {
                                    int f5 = zd1Var2.f(3);
                                    i18 = due.a(zd1Var2, 5, 8, 16) + 1 + i18;
                                    if ((f5 == 0 || f5 == 2) && zd1Var2.e()) {
                                        due.c(zd1Var2);
                                    }
                                    i17++;
                                    i8 = i19;
                                } else {
                                    int a4 = due.a(zd1Var2, 4, 8, 16) + 1;
                                    zd1Var2.m();
                                    int i21 = 0;
                                    while (i21 < a4) {
                                        int f6 = zd1Var2.f(2);
                                        if (f6 == 0) {
                                            zd1Var2.n(i7);
                                            if (zd1Var2.e()) {
                                                zd1Var2.n(13);
                                            }
                                            if (c > 0) {
                                                due.b(zd1Var2);
                                            }
                                        } else if (f6 == i19) {
                                            zd1Var2.n(i7);
                                            if (zd1Var2.e()) {
                                                zd1Var2.n(13);
                                                zd1Var2.m();
                                            }
                                            if (c > 0) {
                                                due.b(zd1Var2);
                                                i5 = zd1Var2.f(2);
                                            } else {
                                                i5 = 0;
                                            }
                                            if (i5 > 0) {
                                                zd1Var2.n(6);
                                                int f7 = zd1Var2.f(2);
                                                zd1Var2.n(4);
                                                if (zd1Var2.e()) {
                                                    zd1Var2.n(5);
                                                }
                                                if (i5 == 2 || i5 == i7) {
                                                    zd1Var2.n(6);
                                                }
                                                if (f7 == 2) {
                                                    zd1Var2.m();
                                                }
                                            }
                                            int floor = ((int) Math.floor(Math.log(i18 - 1) / 0.6931471805599453d)) + 1;
                                            int f8 = zd1Var2.f(2);
                                            if (f8 > 0 && zd1Var2.e()) {
                                                zd1Var2.n(floor);
                                            }
                                            if (zd1Var2.e()) {
                                                zd1Var2.n(floor);
                                            }
                                            if (c == 0 && f8 == 0) {
                                                zd1Var2.m();
                                            }
                                        } else if (f6 == i7) {
                                            due.a(zd1Var2, 4, i6, i20);
                                            int a5 = due.a(zd1Var2, 4, i6, i20);
                                            if (zd1Var2.e()) {
                                                due.a(zd1Var2, i6, i20, 0);
                                            }
                                            zd1Var2.m();
                                            if (a5 > 0) {
                                                zd1Var2.n(a5 << 3);
                                            }
                                        }
                                        i21++;
                                        i6 = 8;
                                        i7 = 3;
                                        i20 = 16;
                                        i19 = 1;
                                    }
                                    if (zd1Var2.e()) {
                                        int i22 = 8;
                                        int a6 = due.a(zd1Var2, 2, 4, 8) + 1;
                                        int i23 = 0;
                                        bArr = null;
                                        while (i23 < a6) {
                                            int a7 = due.a(zd1Var2, 4, i22, 16);
                                            int a8 = due.a(zd1Var2, 4, i22, 16);
                                            if (a7 == 7) {
                                                int f9 = zd1Var2.f(4) + 1;
                                                zd1Var2.n(4);
                                                byte[] bArr4 = new byte[f9];
                                                int i24 = 0;
                                                while (i24 < f9) {
                                                    bArr4[i24] = (byte) zd1Var2.f(i22);
                                                    i24++;
                                                    i22 = 8;
                                                }
                                                bArr = bArr4;
                                            } else {
                                                zd1Var2.n(a8 << 3);
                                            }
                                            i23++;
                                            i22 = 8;
                                        }
                                    } else {
                                        bArr = null;
                                    }
                                    switch (i3) {
                                        case 14700:
                                        case oc1.AUDIO_CONTENT_SAMPLING_RATE /* 16000 */:
                                            d = 3.0d;
                                            break;
                                        case 22050:
                                        case 24000:
                                            d = 2.0d;
                                            break;
                                        case 29400:
                                        case 32000:
                                        case 58800:
                                        case 64000:
                                            d = 1.5d;
                                            break;
                                        case 44100:
                                        case 48000:
                                        case 88200:
                                        case 96000:
                                            d = 1.0d;
                                            break;
                                        default:
                                            throw hy7.d("Unsupported sampling rate " + i3);
                                    }
                                    this.q = (int) (i3 * d);
                                    this.r = (int) (i16 * d);
                                    long j2 = this.t;
                                    long j3 = qz0Var.c;
                                    if (j2 != j3) {
                                        this.t = j3;
                                        String concat = f != -1 ? "mhm1".concat(String.format(".%02X", Integer.valueOf(f))) : "mhm1";
                                        j99 v = (bArr == null || bArr.length <= 0) ? null : po5.v(gcc.b, bArr);
                                        jo4 jo4Var = new jo4();
                                        jo4Var.a = this.e;
                                        jo4Var.r = dg7.n("video/mp2t");
                                        jo4Var.s = dg7.n("audio/mhm1");
                                        jo4Var.O = this.q;
                                        jo4Var.k = concat;
                                        jo4Var.v = v;
                                        this.f.g(new ko4(jo4Var));
                                    }
                                    b = 1;
                                    this.u = true;
                                }
                            }
                        } else {
                            if (i15 == 17) {
                                byte[] bArr5 = ey7Var2.a;
                                zd1 zd1Var3 = new zd1(bArr5.length, bArr5);
                                if (zd1Var3.e()) {
                                    zd1Var3.n(2);
                                    i2 = zd1Var3.f(13);
                                } else {
                                    i2 = 0;
                                }
                                this.s = i2;
                            } else if (i15 == 2) {
                                if (this.u) {
                                    this.j = false;
                                    i = 1;
                                } else {
                                    i = 0;
                                }
                                double d2 = ((this.r - this.s) * 1000000.0d) / this.q;
                                long round = Math.round(this.g);
                                if (this.i) {
                                    this.i = false;
                                    this.g = this.h;
                                } else {
                                    this.g += d2;
                                }
                                this.f.a(round, i, this.o, 0, null);
                                this.u = false;
                                this.s = 0;
                                this.o = 0;
                            }
                            b = 1;
                        }
                        this.d = b;
                    }
                }
            } else {
                int i25 = this.k;
                if ((i25 & 2) == 0) {
                    ey7Var.N(ey7Var.c);
                } else {
                    if ((i25 & 4) == 0) {
                        while (ey7Var.a() > 0) {
                            int i26 = this.l << 8;
                            this.l = i26;
                            int A = i26 | ey7Var.A();
                            this.l = A;
                            if ((A & 16777215) == 12583333) {
                                ey7Var.N(ey7Var.b - 3);
                                this.l = 0;
                            }
                        }
                    }
                    this.d = (byte) 1;
                }
            }
        }
    }

    @Override // av3
    public final void d() {
        this.d = (byte) 0;
        this.l = 0;
        this.a.K(2);
        this.n = 0;
        this.o = 0;
        this.q = -2147483647;
        this.r = -1;
        this.s = 0;
        this.t = -1L;
        this.u = false;
        this.i = false;
        this.m = true;
        this.j = true;
        this.g = -9.223372036854776E18d;
        this.h = -9.223372036854776E18d;
    }

    @Override // av3
    public final void g(int i, long j) {
        this.k = i;
        if (!this.j && (this.o != 0 || !this.m)) {
            this.i = true;
        }
        if (j != -9223372036854775807L) {
            if (this.i) {
                this.h = j;
            } else {
                this.g = j;
            }
        }
    }

    @Override // av3
    public final void h(g84 g84Var, l6c l6cVar) {
        l6cVar.a();
        l6cVar.b();
        this.e = l6cVar.e;
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
