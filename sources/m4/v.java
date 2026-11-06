package m4;

import a8.ia;
import c8.n9;
import c8.s0;
import di.s6;
import e2.t0;
import f3.j0;
import h2.m0;
import h9.i0;
import h9.t1;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class v implements i {
    public String e;
    public j0 f;
    public boolean i;
    public int k;
    public int l;
    public int n;
    public int o;
    public int s;
    public boolean u;
    public int d = 0;
    public final h2.x a = new h2.x(new byte[15], 2);
    public final d4.f b = new d4.f();
    public final h2.x c = new h2.x();
    public final s6 p = new s6();
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
    @Override // m4.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(h2.x xVar) {
        int i7;
        int i10;
        int i11;
        int i12;
        int i13;
        char c10;
        byte[] bArr;
        long j3;
        long j10;
        int i14;
        long j11;
        boolean z9;
        int i15;
        this.f.getClass();
        while (xVar.a() > 0) {
            int i16 = this.d;
            int i17 = 8;
            int i18 = 3;
            int i19 = 1;
            if (i16 != 0) {
                h2.x xVar2 = this.c;
                s6 s6Var = this.p;
                if (i16 == 1) {
                    int a10 = xVar.a();
                    h2.x xVar3 = this.a;
                    int min = Math.min(a10, xVar3.a());
                    xVar.k(xVar3.b, min, xVar3.a);
                    xVar3.O(min);
                    if (xVar3.a() == 0) {
                        int i20 = xVar3.c;
                        byte[] bArr2 = xVar3.a;
                        d4.f fVar = this.b;
                        fVar.H(i20, bArr2);
                        fVar.d();
                        int a11 = n9.a(fVar, 3, 8, 8);
                        s6Var.b = a11;
                        if (a11 != -1) {
                            ia.f(Math.max(Math.max(2, 8), 32) <= 63);
                            s0.a(s0.a(3L, 255L), 4294967296L);
                            if (fVar.b() >= 2) {
                                long l10 = fVar.l(2);
                                if (l10 == 3) {
                                    if (fVar.b() >= 8) {
                                        long l11 = fVar.l(8);
                                        l10 += l11;
                                        if (l11 == 255) {
                                            if (fVar.b() >= 32) {
                                                l10 = fVar.l(32) + l10;
                                            }
                                        }
                                    }
                                }
                                j11 = l10;
                                s6Var.c = j11;
                                if (j11 != -1) {
                                    if (j11 > 16) {
                                        throw t0.c("Contains sub-stream with an invalid packet label " + s6Var.c);
                                    }
                                    if (j11 == 0) {
                                        int i21 = s6Var.b;
                                        if (i21 == 1) {
                                            throw t0.a(null, "Mpegh3daConfig packet with invalid packet label 0");
                                        }
                                        if (i21 == 2) {
                                            throw t0.a(null, "Mpegh3daFrame packet with invalid packet label 0");
                                        }
                                        if (i21 == 17) {
                                            throw t0.a(null, "AudioTruncation packet with invalid packet label 0");
                                        }
                                    }
                                    int a12 = n9.a(fVar, 11, 24, 24);
                                    s6Var.d = a12;
                                    if (a12 != -1) {
                                        z9 = true;
                                        if (z9) {
                                            i15 = 0;
                                        } else {
                                            i15 = 0;
                                            this.n = 0;
                                            this.o = s6Var.d + i20 + this.o;
                                        }
                                        if (z9) {
                                            int i22 = xVar3.c;
                                            if (i22 < 15) {
                                                xVar3.M(i22 + 1);
                                                this.m = false;
                                            }
                                        } else {
                                            xVar3.N(i15);
                                            this.f.b(xVar3.c, xVar3);
                                            xVar3.K(2);
                                            xVar2.K(s6Var.d);
                                            this.m = true;
                                            this.d = 2;
                                        }
                                    }
                                }
                            }
                            j11 = -1;
                            s6Var.c = j11;
                            if (j11 != -1) {
                            }
                        }
                        z9 = false;
                        if (z9) {
                        }
                        if (z9) {
                        }
                    } else {
                        this.m = false;
                    }
                } else {
                    if (i16 != 2) {
                        throw new IllegalStateException();
                    }
                    int i23 = s6Var.b;
                    if (i23 == 1 || i23 == 17) {
                        int i24 = xVar.b;
                        int min2 = Math.min(xVar.a(), xVar2.a());
                        xVar.k(xVar2.b, min2, xVar2.a);
                        xVar2.O(min2);
                        xVar.N(i24);
                    }
                    int min3 = Math.min(xVar.a(), s6Var.d - this.n);
                    this.f.b(min3, xVar);
                    int i25 = this.n + min3;
                    this.n = i25;
                    if (i25 != s6Var.d) {
                        continue;
                    } else {
                        int i26 = s6Var.b;
                        if (i26 == 1) {
                            byte[] bArr3 = xVar2.a;
                            d4.f fVar2 = new d4.f(bArr3, bArr3.length);
                            int j12 = fVar2.j(8);
                            int j13 = fVar2.j(5);
                            if (j13 != 31) {
                                switch (j13) {
                                    case 0:
                                        i12 = 96000;
                                        break;
                                    case 1:
                                        i12 = 88200;
                                        break;
                                    case 2:
                                        i12 = 64000;
                                        break;
                                    case 3:
                                        i12 = 48000;
                                        break;
                                    case 4:
                                        i12 = 44100;
                                        break;
                                    case 5:
                                        i12 = 32000;
                                        break;
                                    case 6:
                                        i12 = 24000;
                                        break;
                                    case 7:
                                        i12 = 22050;
                                        break;
                                    case 8:
                                        i12 = androidx.car.app.media.b.AUDIO_CONTENT_SAMPLING_RATE;
                                        break;
                                    case 9:
                                        i12 = 12000;
                                        break;
                                    case 10:
                                        i12 = 11025;
                                        break;
                                    case 11:
                                        i12 = 8000;
                                        break;
                                    case 12:
                                        i12 = 7350;
                                        break;
                                    case 13:
                                    case 14:
                                    default:
                                        throw t0.c("Unsupported sampling rate index " + j13);
                                    case 15:
                                        i12 = 57600;
                                        break;
                                    case 16:
                                        i12 = 51200;
                                        break;
                                    case 17:
                                        i12 = 40000;
                                        break;
                                    case 18:
                                        i12 = 38400;
                                        break;
                                    case 19:
                                        i12 = 34150;
                                        break;
                                    case 20:
                                        i12 = 28800;
                                        break;
                                    case 21:
                                        i12 = 25600;
                                        break;
                                    case 22:
                                        i12 = 20000;
                                        break;
                                    case 23:
                                        i12 = 19200;
                                        break;
                                    case 24:
                                        i12 = 17075;
                                        break;
                                    case 25:
                                        i12 = 14400;
                                        break;
                                    case 26:
                                        i12 = 12800;
                                        break;
                                    case 27:
                                        i12 = 9600;
                                        break;
                                }
                            } else {
                                i12 = fVar2.j(24);
                            }
                            int j14 = fVar2.j(3);
                            if (j14 == 0) {
                                i13 = 768;
                            } else if (j14 == 1) {
                                i13 = 1024;
                            } else if (j14 == 2 || j14 == 3) {
                                i13 = 2048;
                            } else {
                                if (j14 != 4) {
                                    throw t0.c("Unsupported coreSbrFrameLengthIndex " + j14);
                                }
                                i13 = TLObject.FLAG_12;
                            }
                            int i27 = i13;
                            if (j14 == 0 || j14 == 1) {
                                c10 = 0;
                            } else if (j14 == 2) {
                                c10 = 2;
                            } else if (j14 == 3) {
                                c10 = 3;
                            } else {
                                if (j14 != 4) {
                                    throw t0.c("Unsupported coreSbrFrameLengthIndex " + j14);
                                }
                                c10 = 1;
                            }
                            fVar2.L(2);
                            n9.c(fVar2);
                            int j15 = fVar2.j(5);
                            int i28 = 0;
                            int i29 = 0;
                            while (true) {
                                int i30 = i19;
                                int i31 = 16;
                                if (i28 < j15 + 1) {
                                    int j16 = fVar2.j(3);
                                    i29 = n9.a(fVar2, 5, 8, 16) + 1 + i29;
                                    if ((j16 == 0 || j16 == 2) && fVar2.i()) {
                                        n9.c(fVar2);
                                    }
                                    i28++;
                                    i19 = i30;
                                } else {
                                    int a13 = n9.a(fVar2, 4, 8, 16) + 1;
                                    fVar2.K();
                                    int i32 = 0;
                                    while (true) {
                                        double d = 2.0d;
                                        if (i32 < a13) {
                                            int j17 = fVar2.j(2);
                                            if (j17 == 0) {
                                                fVar2.L(i18);
                                                if (fVar2.i()) {
                                                    fVar2.L(13);
                                                }
                                                if (c10 > 0) {
                                                    n9.b(fVar2);
                                                }
                                            } else if (j17 == i30) {
                                                fVar2.L(i18);
                                                boolean i33 = fVar2.i();
                                                if (i33) {
                                                    fVar2.L(13);
                                                }
                                                if (i33) {
                                                    fVar2.K();
                                                }
                                                if (c10 > 0) {
                                                    n9.b(fVar2);
                                                    i14 = fVar2.j(2);
                                                } else {
                                                    i14 = 0;
                                                }
                                                if (i14 > 0) {
                                                    fVar2.L(6);
                                                    int j18 = fVar2.j(2);
                                                    fVar2.L(4);
                                                    if (fVar2.i()) {
                                                        fVar2.L(5);
                                                    }
                                                    if (i14 == 2 || i14 == i18) {
                                                        fVar2.L(6);
                                                    }
                                                    if (j18 == 2) {
                                                        fVar2.K();
                                                    }
                                                }
                                                int floor = ((int) Math.floor(Math.log(i29 - 1) / Math.log(2.0d))) + 1;
                                                int j19 = fVar2.j(2);
                                                if (j19 > 0 && fVar2.i()) {
                                                    fVar2.L(floor);
                                                }
                                                if (fVar2.i()) {
                                                    fVar2.L(floor);
                                                }
                                                if (c10 == 0 && j19 == 0) {
                                                    fVar2.K();
                                                }
                                            } else if (j17 == i18) {
                                                n9.a(fVar2, 4, i17, i31);
                                                int a14 = n9.a(fVar2, 4, i17, i31);
                                                if (fVar2.i()) {
                                                    n9.a(fVar2, i17, i31, 0);
                                                }
                                                fVar2.K();
                                                if (a14 > 0) {
                                                    fVar2.L(a14 * 8);
                                                }
                                            }
                                            i32++;
                                            i17 = 8;
                                            i18 = 3;
                                            i31 = 16;
                                            i30 = 1;
                                        } else {
                                            if (fVar2.i()) {
                                                int i34 = 8;
                                                int a15 = n9.a(fVar2, 2, 4, 8) + 1;
                                                int i35 = 0;
                                                bArr = null;
                                                while (i35 < a15) {
                                                    int a16 = n9.a(fVar2, 4, i34, 16);
                                                    int a17 = n9.a(fVar2, 4, i34, 16);
                                                    if (a16 == 7) {
                                                        int j20 = fVar2.j(4) + 1;
                                                        fVar2.L(4);
                                                        byte[] bArr4 = new byte[j20];
                                                        for (int i36 = 0; i36 < j20; i36++) {
                                                            bArr4[i36] = (byte) fVar2.j(i34);
                                                        }
                                                        bArr = bArr4;
                                                    } else {
                                                        fVar2.L(a17 * i34);
                                                    }
                                                    i35++;
                                                    i34 = 8;
                                                }
                                            } else {
                                                bArr = null;
                                            }
                                            switch (i12) {
                                                case 14700:
                                                case androidx.car.app.media.b.AUDIO_CONTENT_SAMPLING_RATE /* 16000 */:
                                                    d = 3.0d;
                                                    this.q = (int) (i12 * d);
                                                    this.r = (int) (i27 * d);
                                                    j3 = this.t;
                                                    j10 = s6Var.c;
                                                    if (j3 != j10) {
                                                        this.t = j10;
                                                        String concat = j12 != -1 ? "mhm1".concat(String.format(".%02X", Integer.valueOf(j12))) : "mhm1";
                                                        t1 v = (bArr == null || bArr.length <= 0) ? null : i0.v(m0.b, bArr);
                                                        e2.t tVar = new e2.t();
                                                        tVar.a = this.e;
                                                        tVar.q = e2.s0.n("video/mp2t");
                                                        tVar.r = e2.s0.n("audio/mhm1");
                                                        tVar.K = this.q;
                                                        tVar.j = concat;
                                                        tVar.u = v;
                                                        this.f.g(new e2.u(tVar));
                                                    }
                                                    i10 = 1;
                                                    this.u = true;
                                                    break;
                                                case 22050:
                                                case 24000:
                                                    this.q = (int) (i12 * d);
                                                    this.r = (int) (i27 * d);
                                                    j3 = this.t;
                                                    j10 = s6Var.c;
                                                    if (j3 != j10) {
                                                    }
                                                    i10 = 1;
                                                    this.u = true;
                                                    break;
                                                case 29400:
                                                case 32000:
                                                case 58800:
                                                case 64000:
                                                    d = 1.5d;
                                                    this.q = (int) (i12 * d);
                                                    this.r = (int) (i27 * d);
                                                    j3 = this.t;
                                                    j10 = s6Var.c;
                                                    if (j3 != j10) {
                                                    }
                                                    i10 = 1;
                                                    this.u = true;
                                                    break;
                                                case 44100:
                                                case 48000:
                                                case 88200:
                                                case 96000:
                                                    d = 1.0d;
                                                    this.q = (int) (i12 * d);
                                                    this.r = (int) (i27 * d);
                                                    j3 = this.t;
                                                    j10 = s6Var.c;
                                                    if (j3 != j10) {
                                                    }
                                                    i10 = 1;
                                                    this.u = true;
                                                    break;
                                                default:
                                                    throw t0.c("Unsupported sampling rate " + i12);
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            if (i26 == 17) {
                                byte[] bArr5 = xVar2.a;
                                d4.f fVar3 = new d4.f(bArr5, bArr5.length);
                                if (fVar3.i()) {
                                    fVar3.L(2);
                                    i11 = fVar3.j(13);
                                } else {
                                    i11 = 0;
                                }
                                this.s = i11;
                            } else if (i26 == 2) {
                                if (this.u) {
                                    this.j = false;
                                    i7 = 1;
                                } else {
                                    i7 = 0;
                                }
                                double d2 = ((this.r - this.s) * 1000000.0d) / this.q;
                                long round = Math.round(this.g);
                                if (this.i) {
                                    this.i = false;
                                    this.g = this.h;
                                } else {
                                    this.g += d2;
                                }
                                this.f.c(round, i7, this.o, 0, null);
                                this.u = false;
                                this.s = 0;
                                this.o = 0;
                            }
                            i10 = 1;
                        }
                        this.d = i10;
                    }
                }
            } else {
                int i37 = this.k;
                if ((i37 & 2) == 0) {
                    xVar.N(xVar.c);
                } else {
                    if ((i37 & 4) == 0) {
                        while (xVar.a() > 0) {
                            int i38 = this.l << 8;
                            this.l = i38;
                            int A = i38 | xVar.A();
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

    @Override // m4.i
    public final void d() {
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

    @Override // m4.i
    public final void f(int i7, long j3) {
        this.k = i7;
        if (!this.j && (this.o != 0 || !this.m)) {
            this.i = true;
        }
        if (j3 != -9223372036854775807L) {
            if (this.i) {
                this.h = j3;
            } else {
                this.g = j3;
            }
        }
    }

    @Override // m4.i
    public final void g(f3.q qVar, g0 g0Var) {
        g0Var.b();
        g0Var.c();
        this.e = (String) g0Var.e;
        g0Var.c();
        this.f = qVar.O1(g0Var.c, 1);
    }

    @Override // m4.i
    public final void e(boolean z9) {
    }
}
