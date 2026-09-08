package j4;

import b2.r0;
import b2.s0;
import bi.n8;
import c3.h0;
import e9.a1;
import e9.i0;
import org.telegram.messenger.OneUIUtilities;
import v7.p7;
import v7.p8;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class v implements i {
    public String e;
    public h0 f;
    public boolean i;
    public int k;
    public int l;
    public int n;
    public int o;
    public int s;
    public boolean u;
    public int d = 0;
    public final e2.v a = new e2.v(new byte[15], 2);
    public final a4.h b = new a4.h();
    public final e2.v c = new e2.v();
    public final n8 p = new n8();
    public int q = -2147483647;
    public int r = -1;
    public long t = -1;
    public boolean j = true;
    public boolean m = true;
    public double g = -9.223372036854776E18d;
    public double h = -9.223372036854776E18d;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:218:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0464  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x048c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0473 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0470  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0426  */
    @Override // j4.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(e2.v vVar) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        char c10;
        byte[] bArr;
        long j3;
        long j10;
        int i15;
        long j11;
        boolean z10;
        int i16;
        e2.d.h(this.f);
        while (vVar.a() > 0) {
            int i17 = this.d;
            int i18 = 8;
            int i19 = 3;
            if (i17 != 0) {
                e2.v vVar2 = this.c;
                n8 n8Var = this.p;
                if (i17 == 1) {
                    int a2 = vVar.a();
                    e2.v vVar3 = this.a;
                    int min = Math.min(a2, vVar3.a());
                    vVar.h(vVar3.b, min, vVar3.a);
                    vVar3.K(min);
                    if (vVar3.a() == 0) {
                        int i20 = vVar3.c;
                        byte[] bArr2 = vVar3.a;
                        a4.h hVar = this.b;
                        hVar.o(i20, bArr2);
                        hVar.f();
                        int a10 = p8.a(hVar, 3, 8, 8);
                        n8Var.a = a10;
                        if (a10 != -1) {
                            e2.d.b(Math.max(Math.max(2, 8), 32) <= 63);
                            p7.a(p7.a(3L, 255L), 4294967296L);
                            if (hVar.b() >= 2) {
                                long k10 = hVar.k(2);
                                if (k10 == 3) {
                                    if (hVar.b() >= 8) {
                                        long k11 = hVar.k(8);
                                        k10 += k11;
                                        if (k11 == 255) {
                                            if (hVar.b() >= 32) {
                                                k10 = hVar.k(32) + k10;
                                            }
                                        }
                                    }
                                }
                                j11 = k10;
                                n8Var.b = j11;
                                if (j11 != -1) {
                                    if (j11 > 16) {
                                        throw s0.c("Contains sub-stream with an invalid packet label " + n8Var.b);
                                    }
                                    if (j11 == 0) {
                                        int i21 = n8Var.a;
                                        if (i21 == 1) {
                                            throw s0.a(null, "Mpegh3daConfig packet with invalid packet label 0");
                                        }
                                        if (i21 == 2) {
                                            throw s0.a(null, "Mpegh3daFrame packet with invalid packet label 0");
                                        }
                                        if (i21 == 17) {
                                            throw s0.a(null, "AudioTruncation packet with invalid packet label 0");
                                        }
                                    }
                                    int a11 = p8.a(hVar, 11, 24, 24);
                                    n8Var.c = a11;
                                    if (a11 != -1) {
                                        z10 = true;
                                        if (z10) {
                                            i16 = 0;
                                        } else {
                                            i16 = 0;
                                            this.n = 0;
                                            this.o = n8Var.c + i20 + this.o;
                                        }
                                        if (z10) {
                                            int i22 = vVar3.c;
                                            if (i22 < 15) {
                                                vVar3.I(i22 + 1);
                                                this.m = false;
                                            }
                                        } else {
                                            vVar3.J(i16);
                                            this.f.d(vVar3.c, vVar3);
                                            vVar3.G(2);
                                            vVar2.G(n8Var.c);
                                            this.m = true;
                                            this.d = 2;
                                        }
                                    }
                                }
                            }
                            j11 = -1;
                            n8Var.b = j11;
                            if (j11 != -1) {
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
                    int i23 = n8Var.a;
                    if (i23 == 1 || i23 == 17) {
                        int i24 = vVar.b;
                        int min2 = Math.min(vVar.a(), vVar2.a());
                        vVar.h(vVar2.b, min2, vVar2.a);
                        vVar2.K(min2);
                        vVar.J(i24);
                    }
                    int min3 = Math.min(vVar.a(), n8Var.c - this.n);
                    this.f.d(min3, vVar);
                    int i25 = this.n + min3;
                    this.n = i25;
                    if (i25 != n8Var.c) {
                        continue;
                    } else {
                        int i26 = n8Var.a;
                        if (i26 == 1) {
                            byte[] bArr3 = vVar2.a;
                            a4.h hVar2 = new a4.h(bArr3, bArr3.length);
                            int i27 = hVar2.i(8);
                            int i28 = hVar2.i(5);
                            if (i28 != 31) {
                                switch (i28) {
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
                                        throw s0.c("Unsupported sampling rate index " + i28);
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
                                i13 = hVar2.i(24);
                            }
                            int i29 = hVar2.i(3);
                            if (i29 == 0) {
                                i14 = 768;
                            } else if (i29 == 1) {
                                i14 = 1024;
                            } else if (i29 == 2 || i29 == 3) {
                                i14 = 2048;
                            } else {
                                if (i29 != 4) {
                                    throw s0.c("Unsupported coreSbrFrameLengthIndex " + i29);
                                }
                                i14 = 4096;
                            }
                            if (i29 == 0 || i29 == 1) {
                                c10 = 0;
                            } else if (i29 == 2) {
                                c10 = 2;
                            } else if (i29 == 3) {
                                c10 = 3;
                            } else {
                                if (i29 != 4) {
                                    throw s0.c("Unsupported coreSbrFrameLengthIndex " + i29);
                                }
                                c10 = 1;
                            }
                            hVar2.t(2);
                            p8.c(hVar2);
                            int i30 = hVar2.i(5);
                            int i31 = 0;
                            int i32 = 0;
                            while (true) {
                                int i33 = 16;
                                if (i31 < i30 + 1) {
                                    int i34 = hVar2.i(3);
                                    i32 = p8.a(hVar2, 5, 8, 16) + 1 + i32;
                                    if ((i34 == 0 || i34 == 2) && hVar2.h()) {
                                        p8.c(hVar2);
                                    }
                                    i31++;
                                } else {
                                    int a12 = p8.a(hVar2, 4, 8, 16) + 1;
                                    hVar2.s();
                                    int i35 = 0;
                                    while (true) {
                                        double d = 2.0d;
                                        if (i35 < a12) {
                                            int i36 = hVar2.i(2);
                                            if (i36 == 0) {
                                                hVar2.t(3);
                                                if (hVar2.h()) {
                                                    hVar2.t(13);
                                                }
                                                if (c10 > 0) {
                                                    p8.b(hVar2);
                                                }
                                            } else if (i36 == 1) {
                                                hVar2.t(i19);
                                                boolean h = hVar2.h();
                                                if (h) {
                                                    hVar2.t(13);
                                                }
                                                if (h) {
                                                    hVar2.s();
                                                }
                                                if (c10 > 0) {
                                                    p8.b(hVar2);
                                                    i15 = hVar2.i(2);
                                                } else {
                                                    i15 = 0;
                                                }
                                                if (i15 > 0) {
                                                    hVar2.t(6);
                                                    int i37 = hVar2.i(2);
                                                    hVar2.t(4);
                                                    if (hVar2.h()) {
                                                        hVar2.t(5);
                                                    }
                                                    if (i15 == 2 || i15 == i19) {
                                                        hVar2.t(6);
                                                    }
                                                    if (i37 == 2) {
                                                        hVar2.s();
                                                    }
                                                }
                                                int floor = ((int) Math.floor(Math.log(i32 - 1) / Math.log(2.0d))) + 1;
                                                int i38 = hVar2.i(2);
                                                if (i38 > 0 && hVar2.h()) {
                                                    hVar2.t(floor);
                                                }
                                                if (hVar2.h()) {
                                                    hVar2.t(floor);
                                                }
                                                if (c10 == 0 && i38 == 0) {
                                                    hVar2.s();
                                                }
                                            } else if (i36 == i19) {
                                                p8.a(hVar2, 4, i18, i33);
                                                int a13 = p8.a(hVar2, 4, i18, i33);
                                                if (hVar2.h()) {
                                                    p8.a(hVar2, i18, i33, 0);
                                                }
                                                hVar2.s();
                                                if (a13 > 0) {
                                                    hVar2.t(a13 * 8);
                                                }
                                            }
                                            i35++;
                                            i18 = 8;
                                            i19 = 3;
                                            i33 = 16;
                                        } else {
                                            if (hVar2.h()) {
                                                int i39 = 8;
                                                int a14 = p8.a(hVar2, 2, 4, 8) + 1;
                                                int i40 = 0;
                                                bArr = null;
                                                while (i40 < a14) {
                                                    int a15 = p8.a(hVar2, 4, i39, 16);
                                                    int a16 = p8.a(hVar2, 4, i39, 16);
                                                    if (a15 == 7) {
                                                        int i41 = hVar2.i(4) + 1;
                                                        hVar2.t(4);
                                                        byte[] bArr4 = new byte[i41];
                                                        for (int i42 = 0; i42 < i41; i42++) {
                                                            bArr4[i42] = (byte) hVar2.i(i39);
                                                        }
                                                        bArr = bArr4;
                                                    } else {
                                                        hVar2.t(a16 * 8);
                                                    }
                                                    i40++;
                                                    i39 = 8;
                                                }
                                            } else {
                                                bArr = null;
                                            }
                                            switch (i13) {
                                                case 14700:
                                                case androidx.car.app.media.b.AUDIO_CONTENT_SAMPLING_RATE /* 16000 */:
                                                    d = 3.0d;
                                                    this.q = (int) (i13 * d);
                                                    this.r = (int) (i14 * d);
                                                    j3 = this.t;
                                                    j10 = n8Var.b;
                                                    if (j3 != j10) {
                                                        this.t = j10;
                                                        String concat = i27 != -1 ? "mhm1".concat(String.format(".%02X", Integer.valueOf(i27))) : "mhm1";
                                                        a1 A = (bArr == null || bArr.length <= 0) ? null : i0.A(e2.d0.b, bArr);
                                                        b2.r rVar = new b2.r();
                                                        rVar.a = this.e;
                                                        rVar.p = r0.n("video/mp2t");
                                                        rVar.q = r0.n("audio/mhm1");
                                                        rVar.J = this.q;
                                                        rVar.j = concat;
                                                        rVar.t = A;
                                                        this.f.b(new b2.s(rVar));
                                                    }
                                                    i11 = 1;
                                                    this.u = true;
                                                    break;
                                                case 22050:
                                                case 24000:
                                                    this.q = (int) (i13 * d);
                                                    this.r = (int) (i14 * d);
                                                    j3 = this.t;
                                                    j10 = n8Var.b;
                                                    if (j3 != j10) {
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
                                                    this.r = (int) (i14 * d);
                                                    j3 = this.t;
                                                    j10 = n8Var.b;
                                                    if (j3 != j10) {
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
                                                    this.r = (int) (i14 * d);
                                                    j3 = this.t;
                                                    j10 = n8Var.b;
                                                    if (j3 != j10) {
                                                    }
                                                    i11 = 1;
                                                    this.u = true;
                                                    break;
                                                default:
                                                    throw s0.c("Unsupported sampling rate " + i13);
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            if (i26 == 17) {
                                byte[] bArr5 = vVar2.a;
                                a4.h hVar3 = new a4.h(bArr5, bArr5.length);
                                if (hVar3.h()) {
                                    hVar3.t(2);
                                    i12 = hVar3.i(13);
                                } else {
                                    i12 = 0;
                                }
                                this.s = i12;
                            } else if (i26 == 2) {
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
                int i43 = this.k;
                if ((i43 & 2) == 0) {
                    vVar.J(vVar.c);
                } else {
                    if ((i43 & 4) == 0) {
                        while (vVar.a() > 0) {
                            int i44 = this.l << 8;
                            this.l = i44;
                            int x10 = i44 | vVar.x();
                            this.l = x10;
                            if ((x10 & 16777215) == 12583333) {
                                vVar.J(vVar.b - 3);
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
    public final void d() {
        this.d = 0;
        this.l = 0;
        this.a.G(2);
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
    public final void e(c3.q qVar, f0 f0Var) {
        f0Var.a();
        f0Var.b();
        this.e = f0Var.e;
        f0Var.b();
        this.f = qVar.R1(f0Var.d, 1);
    }

    @Override // j4.i
    public final void g(int i10, long j3) {
        this.k = i10;
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

    @Override // j4.i
    public final void f(boolean z10) {
    }
}
