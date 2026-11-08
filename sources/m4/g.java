package m4;

import a8.ia;
import c8.e1;
import e2.s0;
import e2.t0;
import f3.j0;
import h2.m0;
import java.math.RoundingMode;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.qs;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final class g implements i {
    public final h2.x a;
    public final String c;
    public final int d;
    public String f;
    public j0 g;
    public int i;
    public int j;
    public long k;
    public e2.u l;
    public int m;
    public int n;
    public int h = 0;
    public long q = -9223372036854775807L;
    public final AtomicInteger b = new AtomicInteger();
    public int o = -1;
    public int p = -1;
    public final String e = "video/mp2t";

    public g(String str, int i7, int i10) {
        this.a = new h2.x(new byte[i10]);
        this.c = str;
        this.d = i7;
    }

    public final boolean a(h2.x xVar, byte[] bArr, int i7) {
        int min = Math.min(xVar.a(), i7 - this.i);
        xVar.k(this.i, min, bArr);
        int i10 = this.i + min;
        this.i = i10;
        return i10 == i7;
    }

    public final void b(f3.a aVar) {
        int i7 = aVar.b;
        String str = aVar.a;
        int i10 = aVar.c;
        if (i7 == -2147483647 || i10 == -1) {
            return;
        }
        e2.u uVar = this.l;
        if (uVar != null && i10 == uVar.K && i7 == uVar.L && str.equals(uVar.s)) {
            return;
        }
        e2.u uVar2 = this.l;
        e2.t tVar = uVar2 == null ? new e2.t() : uVar2.a();
        tVar.a = this.f;
        tVar.q = s0.n(this.e);
        tVar.r = s0.n(str);
        tVar.J = i10;
        tVar.K = i7;
        tVar.d = this.c;
        tVar.f = this.d;
        e2.u uVar3 = new e2.u(tVar);
        this.l = uVar3;
        this.g.g(uVar3);
    }

    @Override // m4.i
    public final void c(h2.x xVar) {
        int i7;
        byte b10;
        int i10;
        byte b11;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        long j3;
        int i17;
        long j10;
        int i18;
        int i19;
        int i20;
        int i21;
        this.g.getClass();
        while (xVar.a() > 0) {
            int i22 = this.h;
            h2.x xVar2 = this.a;
            switch (i22) {
                case 0:
                    while (true) {
                        if (xVar.a() > 0) {
                            int i23 = this.j << 8;
                            this.j = i23;
                            int A = i23 | xVar.A();
                            this.j = A;
                            int i24 = f3.b.i(A);
                            this.n = i24;
                            if (i24 != 0) {
                                byte[] bArr = xVar2.a;
                                int i25 = this.j;
                                bArr[0] = (byte) ((i25 >> 24) & qs.e4);
                                bArr[1] = (byte) ((i25 >> 16) & qs.e4);
                                bArr[2] = (byte) ((i25 >> 8) & qs.e4);
                                bArr[3] = (byte) (i25 & qs.e4);
                                this.i = 4;
                                this.j = 0;
                                if (i24 != 3 && i24 != 4) {
                                    if (i24 == 1) {
                                        this.h = 1;
                                        break;
                                    } else {
                                        this.h = 2;
                                        break;
                                    }
                                } else {
                                    this.h = 4;
                                    break;
                                }
                            }
                        }
                    }
                    break;
                case 1:
                    if (!a(xVar, xVar2.a, 18)) {
                        break;
                    } else {
                        byte[] bArr2 = xVar2.a;
                        if (this.l == null) {
                            String str = this.f;
                            d4.f k10 = f3.b.k(bArr2);
                            k10.L(60);
                            int i26 = f3.b.j[k10.j(6)];
                            int i27 = f3.b.k[k10.j(4)];
                            int j11 = k10.j(5);
                            int i28 = j11 >= 29 ? -1 : (f3.b.l[j11] * 1000) / 2;
                            k10.L(10);
                            int i29 = i26 + (k10.j(2) > 0 ? 1 : 0);
                            e2.t tVar = new e2.t();
                            tVar.a = str;
                            tVar.q = s0.n(this.e);
                            tVar.r = s0.n("audio/vnd.dts");
                            tVar.h = i28;
                            tVar.J = i29;
                            tVar.K = i27;
                            tVar.v = null;
                            tVar.d = this.c;
                            tVar.f = this.d;
                            e2.u uVar = new e2.u(tVar);
                            this.l = uVar;
                            this.g.g(uVar);
                        }
                        this.m = f3.b.g(bArr2);
                        byte b12 = bArr2[0];
                        if (b12 != -2) {
                            if (b12 == -1) {
                                i7 = (bArr2[4] & 7) << 4;
                                b11 = bArr2[7];
                            } else if (b12 != 31) {
                                i7 = (bArr2[4] & 1) << 6;
                                b10 = bArr2[5];
                            } else {
                                i7 = (bArr2[5] & 7) << 4;
                                b11 = bArr2[6];
                            }
                            i10 = b11 & 60;
                            this.k = e1.b(m0.Y(this.l.L, (((i10 >> 2) | i7) + 1) * 32));
                            xVar2.N(0);
                            this.g.b(18, xVar2);
                            this.h = 6;
                            break;
                        } else {
                            i7 = (bArr2[5] & 1) << 6;
                            b10 = bArr2[4];
                        }
                        i10 = b10 & 252;
                        this.k = e1.b(m0.Y(this.l.L, (((i10 >> 2) | i7) + 1) * 32));
                        xVar2.N(0);
                        this.g.b(18, xVar2);
                        this.h = 6;
                    }
                case 2:
                    if (a(xVar, xVar2.a, 7)) {
                        d4.f k11 = f3.b.k(xVar2.a);
                        k11.L(42);
                        this.o = k11.j(k11.i() ? 12 : 8) + 1;
                        this.h = 3;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    int i30 = 8;
                    if (a(xVar, xVar2.a, this.o)) {
                        d4.f k12 = f3.b.k(xVar2.a);
                        k12.L(40);
                        int j12 = k12.j(2);
                        if (k12.i()) {
                            i11 = 20;
                            i12 = 12;
                        } else {
                            i11 = 16;
                            i12 = 8;
                        }
                        k12.L(i12);
                        int j13 = k12.j(i11) + 1;
                        boolean i31 = k12.i();
                        if (i31) {
                            i13 = k12.j(2);
                            i14 = (k12.j(3) + 1) * 512;
                            if (k12.i()) {
                                k12.L(36);
                            }
                            int j14 = k12.j(3) + 1;
                            int j15 = k12.j(3) + 1;
                            if (j14 != 1 || j15 != 1) {
                                throw t0.c("Multiple audio presentations or assets not supported");
                            }
                            int i32 = j12 + 1;
                            int j16 = k12.j(i32);
                            int i33 = 0;
                            while (i33 < i32) {
                                if (((j16 >> i33) & 1) == 1) {
                                    k12.L(i30);
                                }
                                i33++;
                                i30 = 8;
                            }
                            if (k12.i()) {
                                k12.L(2);
                                int j17 = (k12.j(2) + 1) << 2;
                                int j18 = k12.j(2) + 1;
                                for (int i34 = 0; i34 < j18; i34++) {
                                    k12.L(j17);
                                }
                            }
                        } else {
                            i13 = -1;
                            i14 = 0;
                        }
                        k12.L(i11);
                        k12.L(12);
                        if (i31) {
                            if (k12.i()) {
                                k12.L(4);
                            }
                            if (k12.i()) {
                                k12.L(24);
                            }
                            if (k12.i()) {
                                k12.M(k12.j(10) + 1);
                            }
                            k12.L(5);
                            i16 = f3.b.m[k12.j(4)];
                            i15 = k12.j(8) + 1;
                        } else {
                            i15 = -1;
                            i16 = -2147483647;
                        }
                        if (i31) {
                            if (i13 == 0) {
                                i17 = 32000;
                            } else if (i13 == 1) {
                                i17 = 44100;
                            } else {
                                if (i13 != 2) {
                                    throw t0.a(null, "Unsupported reference clock code in DTS HD header: " + i13);
                                }
                                i17 = 48000;
                            }
                            String str2 = m0.a;
                            j3 = m0.a0(i14, 1000000L, i17, RoundingMode.DOWN);
                        } else {
                            j3 = -9223372036854775807L;
                        }
                        b(new f3.a("audio/vnd.dts.hd;profile=lbr", i15, i16, j13, j3));
                        this.m = j13;
                        this.k = j3 == -9223372036854775807L ? 0L : j3;
                        xVar2.N(0);
                        this.g.b(this.o, xVar2);
                        this.h = 6;
                        break;
                    } else {
                        continue;
                    }
                case 4:
                    if (a(xVar, xVar2.a, 6)) {
                        d4.f k13 = f3.b.k(xVar2.a);
                        k13.L(32);
                        int q10 = f3.b.q(k13, f3.b.r) + 1;
                        this.p = q10;
                        int i35 = this.i;
                        if (i35 > q10) {
                            int i36 = i35 - q10;
                            this.i = i35 - i36;
                            xVar.N(xVar.b - i36);
                        }
                        this.h = 5;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (a(xVar, xVar2.a, this.p)) {
                        byte[] bArr3 = xVar2.a;
                        d4.f k14 = f3.b.k(bArr3);
                        int i37 = k14.j(32) == 1078008818 ? 1 : 0;
                        int q11 = f3.b.q(k14, f3.b.n);
                        int i38 = q11 + 1;
                        if (i37 == 0) {
                            j10 = -9223372036854775807L;
                            i18 = -2147483647;
                        } else {
                            if (!k14.i()) {
                                throw t0.c("Only supports full channel mask-based audio presentation");
                            }
                            int i39 = q11 - 1;
                            int i40 = ((bArr3[i39] << 8) & 65535) | (bArr3[q11] & 255);
                            String str3 = m0.a;
                            int i41 = 65535;
                            for (int i42 = 0; i42 < i39; i42++) {
                                byte b13 = bArr3[i42];
                                int i43 = (((b13 & 255) >> 4) ^ ((i41 >> 12) & qs.e4)) & qs.e4;
                                int[] iArr = m0.k;
                                int i44 = (iArr[i43] ^ ((i41 << 4) & 65535)) & 65535;
                                i41 = (iArr[((b13 & 15) ^ ((i44 >> 12) & qs.e4)) & qs.e4] ^ ((i44 << 4) & 65535)) & 65535;
                            }
                            if (i40 != i41) {
                                throw t0.a(null, "CRC check failed");
                            }
                            int j19 = k14.j(2);
                            if (j19 != 0) {
                                if (j19 == 1) {
                                    i20 = 480;
                                } else {
                                    if (j19 != 2) {
                                        throw t0.a(null, "Unsupported base duration index in DTS UHD header: " + j19);
                                    }
                                    i20 = 384;
                                }
                                i19 = 3;
                            } else {
                                i19 = 3;
                                i20 = 512;
                            }
                            int j20 = (k14.j(i19) + 1) * i20;
                            int j21 = k14.j(2);
                            if (j21 == 0) {
                                i21 = 32000;
                            } else if (j21 == 1) {
                                i21 = 44100;
                            } else {
                                if (j21 != 2) {
                                    throw t0.a(null, "Unsupported clock rate index in DTS UHD header: " + j21);
                                }
                                i21 = 48000;
                            }
                            if (k14.i()) {
                                k14.L(36);
                            }
                            int j22 = i21 * (1 << k14.j(2));
                            j10 = m0.a0(j20, 1000000L, i21, RoundingMode.DOWN);
                            i18 = j22;
                        }
                        int i45 = 0;
                        for (int i46 = 0; i46 < i37; i46++) {
                            i45 += f3.b.q(k14, f3.b.o);
                        }
                        AtomicInteger atomicInteger = this.b;
                        if (i37 != 0) {
                            atomicInteger.set(f3.b.q(k14, f3.b.p));
                        }
                        int q12 = i45 + (atomicInteger.get() != 0 ? f3.b.q(k14, f3.b.q) : 0) + i38;
                        f3.a aVar = new f3.a("audio/vnd.dts.uhd;profile=p2", 2, i18, q12, j10);
                        if (this.n == 3) {
                            b(aVar);
                        }
                        this.m = q12;
                        this.k = j10 == -9223372036854775807L ? 0L : j10;
                        xVar2.N(0);
                        this.g.b(this.p, xVar2);
                        this.h = 6;
                        break;
                    } else {
                        continue;
                    }
                case 6:
                    int min = Math.min(xVar.a(), this.m - this.i);
                    this.g.b(min, xVar);
                    int i47 = this.i + min;
                    this.i = i47;
                    if (i47 != this.m) {
                        break;
                    } else {
                        ia.p(this.q != -9223372036854775807L);
                        this.g.c(this.q, this.n == 4 ? 0 : 1, this.m, 0, null);
                        this.q += this.k;
                        this.h = 0;
                        break;
                    }
                default:
                    throw new IllegalStateException();
            }
        }
    }

    @Override // m4.i
    public final void d() {
        this.h = 0;
        this.i = 0;
        this.j = 0;
        this.q = -9223372036854775807L;
        this.b.set(0);
    }

    @Override // m4.i
    public final void f(int i7, long j3) {
        this.q = j3;
    }

    @Override // m4.i
    public final void g(f3.q qVar, g0 g0Var) {
        g0Var.b();
        g0Var.c();
        this.f = (String) g0Var.e;
        g0Var.c();
        this.g = qVar.O1(g0Var.c, 1);
    }

    @Override // m4.i
    public final void e(boolean z9) {
    }
}
