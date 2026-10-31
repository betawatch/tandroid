package j4;

import b2.v0;
import b2.w0;
import c3.k0;
import e2.l0;
import e9.n0;
import e9.x1;
import org.telegram.tgnet.TLObject;
import v7.k8;
import v7.o7;
import v7.t6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class v implements i {
    public String e;
    public k0 f;
    public boolean i;
    public int k;
    public int l;
    public int n;
    public int o;
    public int s;
    public boolean u;
    public int d = 0;
    public final e2.x a = new e2.x(new byte[15], 2);
    public final a4.g b = new a4.g();
    public final e2.x c = new e2.x();
    public final w p = new w();
    public int q = -2147483647;
    public int r = -1;
    public long t = -1;
    public boolean j = true;
    public boolean m = true;
    public double g = -9.223372036854776E18d;
    public double h = -9.223372036854776E18d;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:219:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x045e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0486 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x046d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x046a  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0420  */
    @Override // j4.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(e2.x xVar) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        char c10;
        byte[] bArr;
        long j10;
        long j11;
        int i15;
        long j12;
        boolean z10;
        int i16;
        this.f.getClass();
        while (xVar.a() > 0) {
            int i17 = this.d;
            int i18 = 8;
            int i19 = 3;
            int i20 = 1;
            if (i17 != 0) {
                e2.x xVar2 = this.c;
                w wVar = this.p;
                if (i17 == 1) {
                    int a2 = xVar.a();
                    e2.x xVar3 = this.a;
                    int min = Math.min(a2, xVar3.a());
                    xVar.k(xVar3.b, min, xVar3.a);
                    xVar3.O(min);
                    if (xVar3.a() == 0) {
                        int i21 = xVar3.c;
                        byte[] bArr2 = xVar3.a;
                        a4.g gVar = this.b;
                        gVar.b0(i21, bArr2);
                        gVar.d();
                        int a10 = k8.a(gVar, 3, 8, 8);
                        wVar.c = a10;
                        if (a10 != -1) {
                            t6.f(Math.max(Math.max(2, 8), 32) <= 63);
                            o7.a(o7.a(3L, 255L), 4294967296L);
                            if (gVar.b() >= 2) {
                                long k10 = gVar.k(2);
                                if (k10 == 3) {
                                    if (gVar.b() >= 8) {
                                        long k11 = gVar.k(8);
                                        k10 += k11;
                                        if (k11 == 255) {
                                            if (gVar.b() >= 32) {
                                                k10 = gVar.k(32) + k10;
                                            }
                                        }
                                    }
                                }
                                j12 = k10;
                                wVar.b = j12;
                                if (j12 != -1) {
                                    if (j12 > 16) {
                                        throw w0.c("Contains sub-stream with an invalid packet label " + wVar.b);
                                    }
                                    if (j12 == 0) {
                                        int i22 = wVar.c;
                                        if (i22 == 1) {
                                            throw w0.a(null, "Mpegh3daConfig packet with invalid packet label 0");
                                        }
                                        if (i22 == 2) {
                                            throw w0.a(null, "Mpegh3daFrame packet with invalid packet label 0");
                                        }
                                        if (i22 == 17) {
                                            throw w0.a(null, "AudioTruncation packet with invalid packet label 0");
                                        }
                                    }
                                    int a11 = k8.a(gVar, 11, 24, 24);
                                    wVar.d = a11;
                                    if (a11 != -1) {
                                        z10 = true;
                                        if (z10) {
                                            i16 = 0;
                                        } else {
                                            i16 = 0;
                                            this.n = 0;
                                            this.o = wVar.d + i21 + this.o;
                                        }
                                        if (z10) {
                                            int i23 = xVar3.c;
                                            if (i23 < 15) {
                                                xVar3.M(i23 + 1);
                                                this.m = false;
                                            }
                                        } else {
                                            xVar3.N(i16);
                                            this.f.d(xVar3.c, xVar3);
                                            xVar3.K(2);
                                            xVar2.K(wVar.d);
                                            this.m = true;
                                            this.d = 2;
                                        }
                                    }
                                }
                            }
                            j12 = -1;
                            wVar.b = j12;
                            if (j12 != -1) {
                            }
                        }
                        z10 = false;
                        if (z10) {
                        }
                        if (z10) {
                        }
                    } else {
                        this.m = false;
                    }
                } else {
                    if (i17 != 2) {
                        throw new IllegalStateException();
                    }
                    int i24 = wVar.c;
                    if (i24 == 1 || i24 == 17) {
                        int i25 = xVar.b;
                        int min2 = Math.min(xVar.a(), xVar2.a());
                        xVar.k(xVar2.b, min2, xVar2.a);
                        xVar2.O(min2);
                        xVar.N(i25);
                    }
                    int min3 = Math.min(xVar.a(), wVar.d - this.n);
                    this.f.d(min3, xVar);
                    int i26 = this.n + min3;
                    this.n = i26;
                    if (i26 != wVar.d) {
                        continue;
                    } else {
                        int i27 = wVar.c;
                        if (i27 == 1) {
                            byte[] bArr3 = xVar2.a;
                            a4.g gVar2 = new a4.g(bArr3, bArr3.length);
                            int i28 = gVar2.i(8);
                            int i29 = gVar2.i(5);
                            if (i29 != 31) {
                                switch (i29) {
                                    case 0:
                                        i13 = 96000;
                                        break;
                                    case 1:
                                        i13 = 88200;
                                        break;
                                    case 2:
                                        i13 = 64000;
                                        break;
                                    case 3:
                                        i13 = 48000;
                                        break;
                                    case 4:
                                        i13 = 44100;
                                        break;
                                    case 5:
                                        i13 = 32000;
                                        break;
                                    case 6:
                                        i13 = 24000;
                                        break;
                                    case 7:
                                        i13 = 22050;
                                        break;
                                    case 8:
                                        i13 = androidx.car.app.media.b.AUDIO_CONTENT_SAMPLING_RATE;
                                        break;
                                    case 9:
                                        i13 = 12000;
                                        break;
                                    case 10:
                                        i13 = 11025;
                                        break;
                                    case 11:
                                        i13 = 8000;
                                        break;
                                    case 12:
                                        i13 = 7350;
                                        break;
                                    case 13:
                                    case 14:
                                    default:
                                        throw w0.c("Unsupported sampling rate index " + i29);
                                    case 15:
                                        i13 = 57600;
                                        break;
                                    case 16:
                                        i13 = 51200;
                                        break;
                                    case 17:
                                        i13 = 40000;
                                        break;
                                    case 18:
                                        i13 = 38400;
                                        break;
                                    case 19:
                                        i13 = 34150;
                                        break;
                                    case 20:
                                        i13 = 28800;
                                        break;
                                    case 21:
                                        i13 = 25600;
                                        break;
                                    case 22:
                                        i13 = 20000;
                                        break;
                                    case 23:
                                        i13 = 19200;
                                        break;
                                    case 24:
                                        i13 = 17075;
                                        break;
                                    case 25:
                                        i13 = 14400;
                                        break;
                                    case 26:
                                        i13 = 12800;
                                        break;
                                    case 27:
                                        i13 = 9600;
                                        break;
                                }
                            } else {
                                i13 = gVar2.i(24);
                            }
                            int i30 = gVar2.i(3);
                            if (i30 == 0) {
                                i14 = 768;
                            } else if (i30 == 1) {
                                i14 = 1024;
                            } else if (i30 == 2 || i30 == 3) {
                                i14 = 2048;
                            } else {
                                if (i30 != 4) {
                                    throw w0.c("Unsupported coreSbrFrameLengthIndex " + i30);
                                }
                                i14 = TLObject.FLAG_12;
                            }
                            int i31 = i14;
                            if (i30 == 0 || i30 == 1) {
                                c10 = 0;
                            } else if (i30 == 2) {
                                c10 = 2;
                            } else if (i30 == 3) {
                                c10 = 3;
                            } else {
                                if (i30 != 4) {
                                    throw w0.c("Unsupported coreSbrFrameLengthIndex " + i30);
                                }
                                c10 = 1;
                            }
                            gVar2.f0(2);
                            k8.c(gVar2);
                            int i32 = gVar2.i(5);
                            int i33 = 0;
                            int i34 = 0;
                            while (true) {
                                int i35 = i20;
                                int i36 = 16;
                                if (i33 < i32 + 1) {
                                    int i37 = gVar2.i(3);
                                    i34 = k8.a(gVar2, 5, 8, 16) + 1 + i34;
                                    if ((i37 == 0 || i37 == 2) && gVar2.h()) {
                                        k8.c(gVar2);
                                    }
                                    i33++;
                                    i20 = i35;
                                } else {
                                    int a12 = k8.a(gVar2, 4, 8, 16) + 1;
                                    gVar2.e0();
                                    int i38 = 0;
                                    while (true) {
                                        double d = 2.0d;
                                        if (i38 < a12) {
                                            int i39 = gVar2.i(2);
                                            if (i39 == 0) {
                                                gVar2.f0(i19);
                                                if (gVar2.h()) {
                                                    gVar2.f0(13);
                                                }
                                                if (c10 > 0) {
                                                    k8.b(gVar2);
                                                }
                                            } else if (i39 == i35) {
                                                gVar2.f0(i19);
                                                boolean h = gVar2.h();
                                                if (h) {
                                                    gVar2.f0(13);
                                                }
                                                if (h) {
                                                    gVar2.e0();
                                                }
                                                if (c10 > 0) {
                                                    k8.b(gVar2);
                                                    i15 = gVar2.i(2);
                                                } else {
                                                    i15 = 0;
                                                }
                                                if (i15 > 0) {
                                                    gVar2.f0(6);
                                                    int i40 = gVar2.i(2);
                                                    gVar2.f0(4);
                                                    if (gVar2.h()) {
                                                        gVar2.f0(5);
                                                    }
                                                    if (i15 == 2 || i15 == i19) {
                                                        gVar2.f0(6);
                                                    }
                                                    if (i40 == 2) {
                                                        gVar2.e0();
                                                    }
                                                }
                                                int floor = ((int) Math.floor(Math.log(i34 - 1) / Math.log(2.0d))) + 1;
                                                int i41 = gVar2.i(2);
                                                if (i41 > 0 && gVar2.h()) {
                                                    gVar2.f0(floor);
                                                }
                                                if (gVar2.h()) {
                                                    gVar2.f0(floor);
                                                }
                                                if (c10 == 0 && i41 == 0) {
                                                    gVar2.e0();
                                                }
                                            } else if (i39 == i19) {
                                                k8.a(gVar2, 4, i18, i36);
                                                int a13 = k8.a(gVar2, 4, i18, i36);
                                                if (gVar2.h()) {
                                                    k8.a(gVar2, i18, i36, 0);
                                                }
                                                gVar2.e0();
                                                if (a13 > 0) {
                                                    gVar2.f0(a13 * 8);
                                                }
                                            }
                                            i38++;
                                            i18 = 8;
                                            i19 = 3;
                                            i36 = 16;
                                            i35 = 1;
                                        } else {
                                            if (gVar2.h()) {
                                                int i42 = 8;
                                                int a14 = k8.a(gVar2, 2, 4, 8) + 1;
                                                int i43 = 0;
                                                bArr = null;
                                                while (i43 < a14) {
                                                    int a15 = k8.a(gVar2, 4, i42, 16);
                                                    int a16 = k8.a(gVar2, 4, i42, 16);
                                                    if (a15 == 7) {
                                                        int i44 = gVar2.i(4) + 1;
                                                        gVar2.f0(4);
                                                        byte[] bArr4 = new byte[i44];
                                                        for (int i45 = 0; i45 < i44; i45++) {
                                                            bArr4[i45] = (byte) gVar2.i(i42);
                                                        }
                                                        bArr = bArr4;
                                                    } else {
                                                        gVar2.f0(a16 * i42);
                                                    }
                                                    i43++;
                                                    i42 = 8;
                                                }
                                            } else {
                                                bArr = null;
                                            }
                                            switch (i13) {
                                                case 14700:
                                                case androidx.car.app.media.b.AUDIO_CONTENT_SAMPLING_RATE /* 16000 */:
                                                    d = 3.0d;
                                                    this.q = (int) (i13 * d);
                                                    this.r = (int) (i31 * d);
                                                    j10 = this.t;
                                                    j11 = wVar.b;
                                                    if (j10 != j11) {
                                                        this.t = j11;
                                                        String concat = i28 != -1 ? "mhm1".concat(String.format(".%02X", Integer.valueOf(i28))) : "mhm1";
                                                        x1 z11 = (bArr == null || bArr.length <= 0) ? null : n0.z(l0.b, bArr);
                                                        b2.w wVar2 = new b2.w();
                                                        wVar2.a = this.e;
                                                        wVar2.q = v0.n("video/mp2t");
                                                        wVar2.r = v0.n("audio/mhm1");
                                                        wVar2.K = this.q;
                                                        wVar2.j = concat;
                                                        wVar2.u = z11;
                                                        this.f.b(new b2.x(wVar2));
                                                    }
                                                    i11 = 1;
                                                    this.u = true;
                                                    break;
                                                case 22050:
                                                case 24000:
                                                    this.q = (int) (i13 * d);
                                                    this.r = (int) (i31 * d);
                                                    j10 = this.t;
                                                    j11 = wVar.b;
                                                    if (j10 != j11) {
                                                    }
                                                    i11 = 1;
                                                    this.u = true;
                                                    break;
                                                case 29400:
                                                case 32000:
                                                case 58800:
                                                case 64000:
                                                    d = 1.5d;
                                                    this.q = (int) (i13 * d);
                                                    this.r = (int) (i31 * d);
                                                    j10 = this.t;
                                                    j11 = wVar.b;
                                                    if (j10 != j11) {
                                                    }
                                                    i11 = 1;
                                                    this.u = true;
                                                    break;
                                                case 44100:
                                                case 48000:
                                                case 88200:
                                                case 96000:
                                                    d = 1.0d;
                                                    this.q = (int) (i13 * d);
                                                    this.r = (int) (i31 * d);
                                                    j10 = this.t;
                                                    j11 = wVar.b;
                                                    if (j10 != j11) {
                                                    }
                                                    i11 = 1;
                                                    this.u = true;
                                                    break;
                                                default:
                                                    throw w0.c("Unsupported sampling rate " + i13);
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            if (i27 == 17) {
                                byte[] bArr5 = xVar2.a;
                                a4.g gVar3 = new a4.g(bArr5, bArr5.length);
                                if (gVar3.h()) {
                                    gVar3.f0(2);
                                    i12 = gVar3.i(13);
                                } else {
                                    i12 = 0;
                                }
                                this.s = i12;
                            } else if (i27 == 2) {
                                if (this.u) {
                                    this.j = false;
                                    i10 = 1;
                                } else {
                                    i10 = 0;
                                }
                                double d10 = ((this.r - this.s) * 1000000.0d) / this.q;
                                long round = Math.round(this.g);
                                if (this.i) {
                                    this.i = false;
                                    this.g = this.h;
                                } else {
                                    this.g += d10;
                                }
                                this.f.c(round, i10, this.o, 0, null);
                                this.u = false;
                                this.s = 0;
                                this.o = 0;
                            }
                            i11 = 1;
                        }
                        this.d = i11;
                    }
                }
            } else {
                int i46 = this.k;
                if ((i46 & 2) == 0) {
                    xVar.N(xVar.c);
                } else {
                    if ((i46 & 4) == 0) {
                        while (xVar.a() > 0) {
                            int i47 = this.l << 8;
                            this.l = i47;
                            int A = i47 | xVar.A();
                            this.l = A;
                            if ((A & 16777215) == 12583333) {
                                xVar.N(xVar.b - 3);
                                this.l = 0;
                            }
                        }
                    }
                    this.d = 1;
                }
            }
        }
    }

    @Override // j4.i
    public final void e() {
        this.d = 0;
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

    @Override // j4.i
    public final void f(c3.q qVar, g0 g0Var) {
        g0Var.b();
        g0Var.c();
        this.e = (String) g0Var.e;
        g0Var.c();
        this.f = qVar.I1(g0Var.c, 1);
    }

    @Override // j4.i
    public final void h(int i10, long j10) {
        this.k = i10;
        if (!this.j && (this.o != 0 || !this.m)) {
            this.i = true;
        }
        if (j10 != -9223372036854775807L) {
            if (this.i) {
                this.h = j10;
            } else {
                this.g = j10;
            }
        }
    }

    @Override // j4.i
    public final void g(boolean z10) {
    }
}
