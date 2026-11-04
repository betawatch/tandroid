package l4;

import b8.td;
import b8.xc;
import b8.zb;
import d2.u0;
import d2.v0;
import e3.i0;
import ei.t6;
import g2.n0;
import g9.s1;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class v implements i {
    public String e;
    public i0 f;
    public boolean i;
    public int k;
    public int l;
    public int n;
    public int o;
    public int s;
    public boolean u;
    public int d = 0;
    public final g2.y a = new g2.y(new byte[15], 2);
    public final c4.f b = new c4.f();
    public final g2.y c = new g2.y();
    public final t6 p = new t6();
    public int q = -2147483647;
    public int r = -1;
    public long t = -1;
    public boolean j = true;
    public boolean m = true;
    public double g = -9.223372036854776E18d;
    public double h = -9.223372036854776E18d;

    @Override // l4.i
    public final void a() {
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

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:219:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x045e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0486 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x046d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x046a  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0420  */
    @Override // l4.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(g2.y yVar) {
        int i3;
        int i10;
        int i11;
        int i12;
        int i13;
        char c2;
        byte[] bArr;
        long j10;
        long j11;
        int i14;
        long j12;
        boolean z10;
        int i15;
        this.f.getClass();
        while (yVar.a() > 0) {
            int i16 = this.d;
            int i17 = 8;
            int i18 = 3;
            int i19 = 1;
            if (i16 != 0) {
                g2.y yVar2 = this.c;
                t6 t6Var = this.p;
                if (i16 == 1) {
                    int a10 = yVar.a();
                    g2.y yVar3 = this.a;
                    int min = Math.min(a10, yVar3.a());
                    yVar.k(yVar3.b, min, yVar3.a);
                    yVar3.O(min);
                    if (yVar3.a() == 0) {
                        int i20 = yVar3.c;
                        byte[] bArr2 = yVar3.a;
                        c4.f fVar = this.b;
                        fVar.H(i20, bArr2);
                        fVar.d();
                        int a11 = td.a(fVar, 3, 8, 8);
                        t6Var.b = a11;
                        if (a11 != -1) {
                            zb.f(Math.max(Math.max(2, 8), 32) <= 63);
                            xc.a(xc.a(3L, 255L), 4294967296L);
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
                                j12 = l10;
                                t6Var.c = j12;
                                if (j12 != -1) {
                                    if (j12 > 16) {
                                        throw v0.c("Contains sub-stream with an invalid packet label " + t6Var.c);
                                    }
                                    if (j12 == 0) {
                                        int i21 = t6Var.b;
                                        if (i21 == 1) {
                                            throw v0.a(null, "Mpegh3daConfig packet with invalid packet label 0");
                                        }
                                        if (i21 == 2) {
                                            throw v0.a(null, "Mpegh3daFrame packet with invalid packet label 0");
                                        }
                                        if (i21 == 17) {
                                            throw v0.a(null, "AudioTruncation packet with invalid packet label 0");
                                        }
                                    }
                                    int a12 = td.a(fVar, 11, 24, 24);
                                    t6Var.d = a12;
                                    if (a12 != -1) {
                                        z10 = true;
                                        if (z10) {
                                            i15 = 0;
                                        } else {
                                            i15 = 0;
                                            this.n = 0;
                                            this.o = t6Var.d + i20 + this.o;
                                        }
                                        if (z10) {
                                            int i22 = yVar3.c;
                                            if (i22 < 15) {
                                                yVar3.M(i22 + 1);
                                                this.m = false;
                                            }
                                        } else {
                                            yVar3.N(i15);
                                            this.f.e(yVar3.c, yVar3);
                                            yVar3.K(2);
                                            yVar2.K(t6Var.d);
                                            this.m = true;
                                            this.d = 2;
                                        }
                                    }
                                }
                            }
                            j12 = -1;
                            t6Var.c = j12;
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
                    if (i16 != 2) {
                        throw new IllegalStateException();
                    }
                    int i23 = t6Var.b;
                    if (i23 == 1 || i23 == 17) {
                        int i24 = yVar.b;
                        int min2 = Math.min(yVar.a(), yVar2.a());
                        yVar.k(yVar2.b, min2, yVar2.a);
                        yVar2.O(min2);
                        yVar.N(i24);
                    }
                    int min3 = Math.min(yVar.a(), t6Var.d - this.n);
                    this.f.e(min3, yVar);
                    int i25 = this.n + min3;
                    this.n = i25;
                    if (i25 != t6Var.d) {
                        continue;
                    } else {
                        int i26 = t6Var.b;
                        if (i26 == 1) {
                            byte[] bArr3 = yVar2.a;
                            c4.f fVar2 = new c4.f(bArr3, bArr3.length);
                            int j13 = fVar2.j(8);
                            int j14 = fVar2.j(5);
                            if (j14 != 31) {
                                switch (j14) {
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
                                        throw v0.c("Unsupported sampling rate index " + j14);
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
                            int j15 = fVar2.j(3);
                            if (j15 == 0) {
                                i13 = 768;
                            } else if (j15 == 1) {
                                i13 = 1024;
                            } else if (j15 == 2 || j15 == 3) {
                                i13 = 2048;
                            } else {
                                if (j15 != 4) {
                                    throw v0.c("Unsupported coreSbrFrameLengthIndex " + j15);
                                }
                                i13 = TLObject.FLAG_12;
                            }
                            int i27 = i13;
                            if (j15 == 0 || j15 == 1) {
                                c2 = 0;
                            } else if (j15 == 2) {
                                c2 = 2;
                            } else if (j15 == 3) {
                                c2 = 3;
                            } else {
                                if (j15 != 4) {
                                    throw v0.c("Unsupported coreSbrFrameLengthIndex " + j15);
                                }
                                c2 = 1;
                            }
                            fVar2.L(2);
                            td.c(fVar2);
                            int j16 = fVar2.j(5);
                            int i28 = 0;
                            int i29 = 0;
                            while (true) {
                                int i30 = i19;
                                int i31 = 16;
                                if (i28 < j16 + 1) {
                                    int j17 = fVar2.j(3);
                                    i29 = td.a(fVar2, 5, 8, 16) + 1 + i29;
                                    if ((j17 == 0 || j17 == 2) && fVar2.i()) {
                                        td.c(fVar2);
                                    }
                                    i28++;
                                    i19 = i30;
                                } else {
                                    int a13 = td.a(fVar2, 4, 8, 16) + 1;
                                    fVar2.K();
                                    int i32 = 0;
                                    while (true) {
                                        double d = 2.0d;
                                        if (i32 < a13) {
                                            int j18 = fVar2.j(2);
                                            if (j18 == 0) {
                                                fVar2.L(i18);
                                                if (fVar2.i()) {
                                                    fVar2.L(13);
                                                }
                                                if (c2 > 0) {
                                                    td.b(fVar2);
                                                }
                                            } else if (j18 == i30) {
                                                fVar2.L(i18);
                                                boolean i33 = fVar2.i();
                                                if (i33) {
                                                    fVar2.L(13);
                                                }
                                                if (i33) {
                                                    fVar2.K();
                                                }
                                                if (c2 > 0) {
                                                    td.b(fVar2);
                                                    i14 = fVar2.j(2);
                                                } else {
                                                    i14 = 0;
                                                }
                                                if (i14 > 0) {
                                                    fVar2.L(6);
                                                    int j19 = fVar2.j(2);
                                                    fVar2.L(4);
                                                    if (fVar2.i()) {
                                                        fVar2.L(5);
                                                    }
                                                    if (i14 == 2 || i14 == i18) {
                                                        fVar2.L(6);
                                                    }
                                                    if (j19 == 2) {
                                                        fVar2.K();
                                                    }
                                                }
                                                int floor = ((int) Math.floor(Math.log(i29 - 1) / Math.log(2.0d))) + 1;
                                                int j20 = fVar2.j(2);
                                                if (j20 > 0 && fVar2.i()) {
                                                    fVar2.L(floor);
                                                }
                                                if (fVar2.i()) {
                                                    fVar2.L(floor);
                                                }
                                                if (c2 == 0 && j20 == 0) {
                                                    fVar2.K();
                                                }
                                            } else if (j18 == i18) {
                                                td.a(fVar2, 4, i17, i31);
                                                int a14 = td.a(fVar2, 4, i17, i31);
                                                if (fVar2.i()) {
                                                    td.a(fVar2, i17, i31, 0);
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
                                                int a15 = td.a(fVar2, 2, 4, 8) + 1;
                                                int i35 = 0;
                                                bArr = null;
                                                while (i35 < a15) {
                                                    int a16 = td.a(fVar2, 4, i34, 16);
                                                    int a17 = td.a(fVar2, 4, i34, 16);
                                                    if (a16 == 7) {
                                                        int j21 = fVar2.j(4) + 1;
                                                        fVar2.L(4);
                                                        byte[] bArr4 = new byte[j21];
                                                        for (int i36 = 0; i36 < j21; i36++) {
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
                                                    j10 = this.t;
                                                    j11 = t6Var.c;
                                                    if (j10 != j11) {
                                                        this.t = j11;
                                                        String concat = j13 != -1 ? "mhm1".concat(String.format(".%02X", Integer.valueOf(j13))) : "mhm1";
                                                        s1 v = (bArr == null || bArr.length <= 0) ? null : g9.i0.v(n0.b, bArr);
                                                        d2.u uVar = new d2.u();
                                                        uVar.a = this.e;
                                                        uVar.q = u0.n("video/mp2t");
                                                        uVar.r = u0.n("audio/mhm1");
                                                        uVar.K = this.q;
                                                        uVar.j = concat;
                                                        uVar.u = v;
                                                        this.f.g(new d2.v(uVar));
                                                    }
                                                    i10 = 1;
                                                    this.u = true;
                                                    break;
                                                case 22050:
                                                case 24000:
                                                    this.q = (int) (i12 * d);
                                                    this.r = (int) (i27 * d);
                                                    j10 = this.t;
                                                    j11 = t6Var.c;
                                                    if (j10 != j11) {
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
                                                    j10 = this.t;
                                                    j11 = t6Var.c;
                                                    if (j10 != j11) {
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
                                                    j10 = this.t;
                                                    j11 = t6Var.c;
                                                    if (j10 != j11) {
                                                    }
                                                    i10 = 1;
                                                    this.u = true;
                                                    break;
                                                default:
                                                    throw v0.c("Unsupported sampling rate " + i12);
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            if (i26 == 17) {
                                byte[] bArr5 = yVar2.a;
                                c4.f fVar3 = new c4.f(bArr5, bArr5.length);
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
                                    i3 = 1;
                                } else {
                                    i3 = 0;
                                }
                                double d10 = ((this.r - this.s) * 1000000.0d) / this.q;
                                long round = Math.round(this.g);
                                if (this.i) {
                                    this.i = false;
                                    this.g = this.h;
                                } else {
                                    this.g += d10;
                                }
                                this.f.d(round, i3, this.o, 0, null);
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
                    yVar.N(yVar.c);
                } else {
                    if ((i37 & 4) == 0) {
                        while (yVar.a() > 0) {
                            int i38 = this.l << 8;
                            this.l = i38;
                            int A = i38 | yVar.A();
                            this.l = A;
                            if ((A & 16777215) == 12583333) {
                                yVar.N(yVar.b - 3);
                                this.l = 0;
                            }
                        }
                    }
                    this.d = 1;
                }
            }
        }
    }

    @Override // l4.i
    public final void e(int i3, long j10) {
        this.k = i3;
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

    @Override // l4.i
    public final void f(e3.q qVar, f0 f0Var) {
        f0Var.b();
        f0Var.c();
        this.e = (String) f0Var.e;
        f0Var.c();
        this.f = qVar.i0(f0Var.c, 1);
    }

    @Override // l4.i
    public final void d(boolean z10) {
    }
}
