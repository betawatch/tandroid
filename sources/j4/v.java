package j4;

import b2.v0;
import b2.w0;
import c3.l0;
import ci.b7;
import e2.m0;
import e9.n0;
import e9.x1;
import org.telegram.messenger.OneUIUtilities;
import v7.l8;
import v7.n7;
import v7.u6;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes.dex */
public final class v implements i {
    public String e;
    public l0 f;
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
    public final b7 p = new b7();
    public int q = -2147483647;
    public int r = -1;
    public long t = -1;
    public boolean j = true;
    public boolean m = true;
    public double g = -9.223372036854776E18d;
    public double h = -9.223372036854776E18d;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:219:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x045f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0487 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x046e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x046b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0421  */
    @Override // j4.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(e2.x xVar) {
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
                b7 b7Var = this.p;
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
                        gVar.k(i21, bArr2);
                        gVar.d();
                        int a10 = l8.a(gVar, 3, 8, 8);
                        b7Var.b = a10;
                        if (a10 != -1) {
                            u6.g(Math.max(Math.max(2, 8), 32) <= 63);
                            n7.a(n7.a(3L, 255L), 4294967296L);
                            if (gVar.b() >= 2) {
                                long i22 = gVar.i(2);
                                if (i22 == 3) {
                                    if (gVar.b() >= 8) {
                                        long i23 = gVar.i(8);
                                        i22 += i23;
                                        if (i23 == 255) {
                                            if (gVar.b() >= 32) {
                                                i22 = gVar.i(32) + i22;
                                            }
                                        }
                                    }
                                }
                                j12 = i22;
                                b7Var.c = j12;
                                if (j12 != -1) {
                                    if (j12 > 16) {
                                        throw w0.c("Contains sub-stream with an invalid packet label " + b7Var.c);
                                    }
                                    if (j12 == 0) {
                                        int i24 = b7Var.b;
                                        if (i24 == 1) {
                                            throw w0.a(null, "Mpegh3daConfig packet with invalid packet label 0");
                                        }
                                        if (i24 == 2) {
                                            throw w0.a(null, "Mpegh3daFrame packet with invalid packet label 0");
                                        }
                                        if (i24 == 17) {
                                            throw w0.a(null, "AudioTruncation packet with invalid packet label 0");
                                        }
                                    }
                                    int a11 = l8.a(gVar, 11, 24, 24);
                                    b7Var.d = a11;
                                    if (a11 != -1) {
                                        z10 = true;
                                        if (z10) {
                                            i16 = 0;
                                        } else {
                                            i16 = 0;
                                            this.n = 0;
                                            this.o = b7Var.d + i21 + this.o;
                                        }
                                        if (z10) {
                                            int i25 = xVar3.c;
                                            if (i25 < 15) {
                                                xVar3.M(i25 + 1);
                                                this.m = false;
                                            }
                                        } else {
                                            xVar3.N(i16);
                                            this.f.d(xVar3.c, xVar3);
                                            xVar3.K(2);
                                            xVar2.K(b7Var.d);
                                            this.m = true;
                                            this.d = 2;
                                        }
                                    }
                                }
                            }
                            j12 = -1;
                            b7Var.c = j12;
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
                    int i26 = b7Var.b;
                    if (i26 == 1 || i26 == 17) {
                        int i27 = xVar.b;
                        int min2 = Math.min(xVar.a(), xVar2.a());
                        xVar.k(xVar2.b, min2, xVar2.a);
                        xVar2.O(min2);
                        xVar.N(i27);
                    }
                    int min3 = Math.min(xVar.a(), b7Var.d - this.n);
                    this.f.d(min3, xVar);
                    int i28 = this.n + min3;
                    this.n = i28;
                    if (i28 != b7Var.d) {
                        continue;
                    } else {
                        int i29 = b7Var.b;
                        if (i29 == 1) {
                            byte[] bArr3 = xVar2.a;
                            a4.g gVar2 = new a4.g(bArr3, bArr3.length);
                            int g10 = gVar2.g(8);
                            int g11 = gVar2.g(5);
                            if (g11 != 31) {
                                switch (g11) {
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
                                        throw w0.c("Unsupported sampling rate index " + g11);
                                    case 15:
                                        i13 = 57600;
                                        break;
                                    case 16:
                                        i13 = 51200;
                                        break;
                                    case 17:
                                        i13 = OneUIUtilities.ONE_UI_4_0;
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
                                i13 = gVar2.g(24);
                            }
                            int g12 = gVar2.g(3);
                            if (g12 == 0) {
                                i14 = 768;
                            } else if (g12 == 1) {
                                i14 = 1024;
                            } else if (g12 == 2 || g12 == 3) {
                                i14 = 2048;
                            } else {
                                if (g12 != 4) {
                                    throw w0.c("Unsupported coreSbrFrameLengthIndex " + g12);
                                }
                                i14 = 4096;
                            }
                            int i30 = i14;
                            if (g12 == 0 || g12 == 1) {
                                c10 = 0;
                            } else if (g12 == 2) {
                                c10 = 2;
                            } else if (g12 == 3) {
                                c10 = 3;
                            } else {
                                if (g12 != 4) {
                                    throw w0.c("Unsupported coreSbrFrameLengthIndex " + g12);
                                }
                                c10 = 1;
                            }
                            gVar2.o(2);
                            l8.c(gVar2);
                            int g13 = gVar2.g(5);
                            int i31 = 0;
                            int i32 = 0;
                            while (true) {
                                int i33 = i20;
                                int i34 = 16;
                                if (i31 < g13 + 1) {
                                    int g14 = gVar2.g(3);
                                    i32 = l8.a(gVar2, 5, 8, 16) + 1 + i32;
                                    if ((g14 == 0 || g14 == 2) && gVar2.f()) {
                                        l8.c(gVar2);
                                    }
                                    i31++;
                                    i20 = i33;
                                } else {
                                    int a12 = l8.a(gVar2, 4, 8, 16) + 1;
                                    gVar2.n();
                                    int i35 = 0;
                                    while (true) {
                                        double d = 2.0d;
                                        if (i35 < a12) {
                                            int g15 = gVar2.g(2);
                                            if (g15 == 0) {
                                                gVar2.o(i19);
                                                if (gVar2.f()) {
                                                    gVar2.o(13);
                                                }
                                                if (c10 > 0) {
                                                    l8.b(gVar2);
                                                }
                                            } else if (g15 == i33) {
                                                gVar2.o(i19);
                                                boolean f7 = gVar2.f();
                                                if (f7) {
                                                    gVar2.o(13);
                                                }
                                                if (f7) {
                                                    gVar2.n();
                                                }
                                                if (c10 > 0) {
                                                    l8.b(gVar2);
                                                    i15 = gVar2.g(2);
                                                } else {
                                                    i15 = 0;
                                                }
                                                if (i15 > 0) {
                                                    gVar2.o(6);
                                                    int g16 = gVar2.g(2);
                                                    gVar2.o(4);
                                                    if (gVar2.f()) {
                                                        gVar2.o(5);
                                                    }
                                                    if (i15 == 2 || i15 == i19) {
                                                        gVar2.o(6);
                                                    }
                                                    if (g16 == 2) {
                                                        gVar2.n();
                                                    }
                                                }
                                                int floor = ((int) Math.floor(Math.log(i32 - 1) / Math.log(2.0d))) + 1;
                                                int g17 = gVar2.g(2);
                                                if (g17 > 0 && gVar2.f()) {
                                                    gVar2.o(floor);
                                                }
                                                if (gVar2.f()) {
                                                    gVar2.o(floor);
                                                }
                                                if (c10 == 0 && g17 == 0) {
                                                    gVar2.n();
                                                }
                                            } else if (g15 == i19) {
                                                l8.a(gVar2, 4, i18, i34);
                                                int a13 = l8.a(gVar2, 4, i18, i34);
                                                if (gVar2.f()) {
                                                    l8.a(gVar2, i18, i34, 0);
                                                }
                                                gVar2.n();
                                                if (a13 > 0) {
                                                    gVar2.o(a13 * 8);
                                                }
                                            }
                                            i35++;
                                            i18 = 8;
                                            i19 = 3;
                                            i34 = 16;
                                            i33 = 1;
                                        } else {
                                            if (gVar2.f()) {
                                                int i36 = 8;
                                                int a14 = l8.a(gVar2, 2, 4, 8) + 1;
                                                int i37 = 0;
                                                bArr = null;
                                                while (i37 < a14) {
                                                    int a15 = l8.a(gVar2, 4, i36, 16);
                                                    int a16 = l8.a(gVar2, 4, i36, 16);
                                                    if (a15 == 7) {
                                                        int g18 = gVar2.g(4) + 1;
                                                        gVar2.o(4);
                                                        byte[] bArr4 = new byte[g18];
                                                        for (int i38 = 0; i38 < g18; i38++) {
                                                            bArr4[i38] = (byte) gVar2.g(i36);
                                                        }
                                                        bArr = bArr4;
                                                    } else {
                                                        gVar2.o(a16 * i36);
                                                    }
                                                    i37++;
                                                    i36 = 8;
                                                }
                                            } else {
                                                bArr = null;
                                            }
                                            switch (i13) {
                                                case 14700:
                                                case androidx.car.app.media.b.AUDIO_CONTENT_SAMPLING_RATE /* 16000 */:
                                                    d = 3.0d;
                                                    this.q = (int) (i13 * d);
                                                    this.r = (int) (i30 * d);
                                                    j10 = this.t;
                                                    j11 = b7Var.c;
                                                    if (j10 != j11) {
                                                        this.t = j11;
                                                        String concat = g10 != -1 ? "mhm1".concat(String.format(".%02X", Integer.valueOf(g10))) : "mhm1";
                                                        x1 z11 = (bArr == null || bArr.length <= 0) ? null : n0.z(m0.b, bArr);
                                                        b2.v vVar = new b2.v();
                                                        vVar.a = this.e;
                                                        vVar.q = v0.n("video/mp2t");
                                                        vVar.r = v0.n("audio/mhm1");
                                                        vVar.K = this.q;
                                                        vVar.j = concat;
                                                        vVar.u = z11;
                                                        this.f.b(new b2.w(vVar));
                                                    }
                                                    i11 = 1;
                                                    this.u = true;
                                                    break;
                                                case 22050:
                                                case 24000:
                                                    this.q = (int) (i13 * d);
                                                    this.r = (int) (i30 * d);
                                                    j10 = this.t;
                                                    j11 = b7Var.c;
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
                                                    this.r = (int) (i30 * d);
                                                    j10 = this.t;
                                                    j11 = b7Var.c;
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
                                                    this.r = (int) (i30 * d);
                                                    j10 = this.t;
                                                    j11 = b7Var.c;
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
                            if (i29 == 17) {
                                byte[] bArr5 = xVar2.a;
                                a4.g gVar3 = new a4.g(bArr5, bArr5.length);
                                if (gVar3.f()) {
                                    gVar3.o(2);
                                    i12 = gVar3.g(13);
                                } else {
                                    i12 = 0;
                                }
                                this.s = i12;
                            } else if (i29 == 2) {
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
                int i39 = this.k;
                if ((i39 & 2) == 0) {
                    xVar.N(xVar.c);
                } else {
                    if ((i39 & 4) == 0) {
                        while (xVar.a() > 0) {
                            int i40 = this.l << 8;
                            this.l = i40;
                            int A = i40 | xVar.A();
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
    public final void c() {
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
    public final void d(c3.s sVar, f0 f0Var) {
        f0Var.b();
        f0Var.c();
        this.e = (String) f0Var.e;
        f0Var.c();
        this.f = sVar.j0(f0Var.c, 1);
    }

    @Override // j4.i
    public final void f(int i10, long j10) {
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
    public final void e(boolean z10) {
    }
}
