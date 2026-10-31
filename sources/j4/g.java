package j4;

import b2.v0;
import b2.w0;
import c3.k0;
import e2.l0;
import java.math.RoundingMode;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.zs;
import v7.c8;
import v7.t6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class g implements i {
    public final e2.x a;
    public final String c;
    public final int d;
    public String f;
    public k0 g;
    public int i;
    public int j;
    public long k;
    public b2.x l;
    public int m;
    public int n;
    public int h = 0;
    public long q = -9223372036854775807L;
    public final AtomicInteger b = new AtomicInteger();
    public int o = -1;
    public int p = -1;
    public final String e = "video/mp2t";

    public g(String str, int i10, int i11) {
        this.a = new e2.x(new byte[i11]);
        this.c = str;
        this.d = i10;
    }

    public final boolean a(e2.x xVar, byte[] bArr, int i10) {
        int min = Math.min(xVar.a(), i10 - this.i);
        xVar.k(this.i, min, bArr);
        int i11 = this.i + min;
        this.i = i11;
        return i11 == i10;
    }

    public final void b(c3.a aVar) {
        int i10 = aVar.b;
        String str = aVar.a;
        int i11 = aVar.c;
        if (i10 == -2147483647 || i11 == -1) {
            return;
        }
        b2.x xVar = this.l;
        if (xVar != null && i11 == xVar.K && i10 == xVar.L && str.equals(xVar.s)) {
            return;
        }
        b2.x xVar2 = this.l;
        b2.w wVar = xVar2 == null ? new b2.w() : xVar2.a();
        wVar.a = this.f;
        wVar.q = v0.n(this.e);
        wVar.r = v0.n(str);
        wVar.J = i11;
        wVar.K = i10;
        wVar.d = this.c;
        wVar.f = this.d;
        b2.x xVar3 = new b2.x(wVar);
        this.l = xVar3;
        this.g.b(xVar3);
    }

    @Override // j4.i
    public final void c(e2.x xVar) {
        int i10;
        byte b10;
        int i11;
        byte b11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        long j10;
        int i18;
        long j11;
        int i19;
        int i20;
        int i21;
        int i22;
        this.g.getClass();
        while (xVar.a() > 0) {
            int i23 = this.h;
            e2.x xVar2 = this.a;
            switch (i23) {
                case 0:
                    while (true) {
                        if (xVar.a() > 0) {
                            int i24 = this.j << 8;
                            this.j = i24;
                            int A = i24 | xVar.A();
                            this.j = A;
                            int i25 = c3.b.i(A);
                            this.n = i25;
                            if (i25 != 0) {
                                byte[] bArr = xVar2.a;
                                int i26 = this.j;
                                bArr[0] = (byte) ((i26 >> 24) & zs.e4);
                                bArr[1] = (byte) ((i26 >> 16) & zs.e4);
                                bArr[2] = (byte) ((i26 >> 8) & zs.e4);
                                bArr[3] = (byte) (i26 & zs.e4);
                                this.i = 4;
                                this.j = 0;
                                if (i25 != 3 && i25 != 4) {
                                    if (i25 == 1) {
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
                            a4.g k10 = c3.b.k(bArr2);
                            k10.f0(60);
                            int i27 = c3.b.j[k10.i(6)];
                            int i28 = c3.b.k[k10.i(4)];
                            int i29 = k10.i(5);
                            int i30 = i29 >= 29 ? -1 : (c3.b.l[i29] * 1000) / 2;
                            k10.f0(10);
                            int i31 = i27 + (k10.i(2) > 0 ? 1 : 0);
                            b2.w wVar = new b2.w();
                            wVar.a = str;
                            wVar.q = v0.n(this.e);
                            wVar.r = v0.n("audio/vnd.dts");
                            wVar.h = i30;
                            wVar.J = i31;
                            wVar.K = i28;
                            wVar.v = null;
                            wVar.d = this.c;
                            wVar.f = this.d;
                            b2.x xVar3 = new b2.x(wVar);
                            this.l = xVar3;
                            this.g.b(xVar3);
                        }
                        this.m = c3.b.g(bArr2);
                        byte b12 = bArr2[0];
                        if (b12 != -2) {
                            if (b12 == -1) {
                                i10 = (bArr2[4] & 7) << 4;
                                b11 = bArr2[7];
                            } else if (b12 != 31) {
                                i10 = (bArr2[4] & 1) << 6;
                                b10 = bArr2[5];
                            } else {
                                i10 = (bArr2[5] & 7) << 4;
                                b11 = bArr2[6];
                            }
                            i11 = b11 & 60;
                            this.k = c8.b(l0.Y(this.l.L, (((i11 >> 2) | i10) + 1) * 32));
                            xVar2.N(0);
                            this.g.d(18, xVar2);
                            this.h = 6;
                            break;
                        } else {
                            i10 = (bArr2[5] & 1) << 6;
                            b10 = bArr2[4];
                        }
                        i11 = b10 & 252;
                        this.k = c8.b(l0.Y(this.l.L, (((i11 >> 2) | i10) + 1) * 32));
                        xVar2.N(0);
                        this.g.d(18, xVar2);
                        this.h = 6;
                    }
                case 2:
                    if (a(xVar, xVar2.a, 7)) {
                        a4.g k11 = c3.b.k(xVar2.a);
                        k11.f0(42);
                        this.o = k11.i(k11.h() ? 12 : 8) + 1;
                        this.h = 3;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    int i32 = 8;
                    if (a(xVar, xVar2.a, this.o)) {
                        a4.g k12 = c3.b.k(xVar2.a);
                        k12.f0(40);
                        int i33 = k12.i(2);
                        if (k12.h()) {
                            i12 = 20;
                            i13 = 12;
                        } else {
                            i12 = 16;
                            i13 = 8;
                        }
                        k12.f0(i13);
                        int i34 = k12.i(i12) + 1;
                        boolean h = k12.h();
                        if (h) {
                            i14 = k12.i(2);
                            i15 = (k12.i(3) + 1) * 512;
                            if (k12.h()) {
                                k12.f0(36);
                            }
                            int i35 = k12.i(3) + 1;
                            int i36 = k12.i(3) + 1;
                            if (i35 != 1 || i36 != 1) {
                                throw w0.c("Multiple audio presentations or assets not supported");
                            }
                            int i37 = i33 + 1;
                            int i38 = k12.i(i37);
                            int i39 = 0;
                            while (i39 < i37) {
                                if (((i38 >> i39) & 1) == 1) {
                                    k12.f0(i32);
                                }
                                i39++;
                                i32 = 8;
                            }
                            if (k12.h()) {
                                k12.f0(2);
                                int i40 = (k12.i(2) + 1) << 2;
                                int i41 = k12.i(2) + 1;
                                for (int i42 = 0; i42 < i41; i42++) {
                                    k12.f0(i40);
                                }
                            }
                        } else {
                            i14 = -1;
                            i15 = 0;
                        }
                        k12.f0(i12);
                        k12.f0(12);
                        if (h) {
                            if (k12.h()) {
                                k12.f0(4);
                            }
                            if (k12.h()) {
                                k12.f0(24);
                            }
                            if (k12.h()) {
                                k12.g0(k12.i(10) + 1);
                            }
                            k12.f0(5);
                            i17 = c3.b.m[k12.i(4)];
                            i16 = k12.i(8) + 1;
                        } else {
                            i16 = -1;
                            i17 = -2147483647;
                        }
                        if (h) {
                            if (i14 == 0) {
                                i18 = 32000;
                            } else if (i14 == 1) {
                                i18 = 44100;
                            } else {
                                if (i14 != 2) {
                                    throw w0.a(null, "Unsupported reference clock code in DTS HD header: " + i14);
                                }
                                i18 = 48000;
                            }
                            String str2 = l0.a;
                            j10 = l0.a0(i15, 1000000L, i18, RoundingMode.DOWN);
                        } else {
                            j10 = -9223372036854775807L;
                        }
                        b(new c3.a("audio/vnd.dts.hd;profile=lbr", i16, i17, i34, j10));
                        this.m = i34;
                        this.k = j10 == -9223372036854775807L ? 0L : j10;
                        xVar2.N(0);
                        this.g.d(this.o, xVar2);
                        this.h = 6;
                        break;
                    } else {
                        continue;
                    }
                case 4:
                    if (a(xVar, xVar2.a, 6)) {
                        a4.g k13 = c3.b.k(xVar2.a);
                        k13.f0(32);
                        int q6 = c3.b.q(k13, c3.b.r) + 1;
                        this.p = q6;
                        int i43 = this.i;
                        if (i43 > q6) {
                            int i44 = i43 - q6;
                            this.i = i43 - i44;
                            xVar.N(xVar.b - i44);
                        }
                        this.h = 5;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (a(xVar, xVar2.a, this.p)) {
                        byte[] bArr3 = xVar2.a;
                        a4.g k14 = c3.b.k(bArr3);
                        int i45 = k14.i(32) == 1078008818 ? 1 : 0;
                        int q10 = c3.b.q(k14, c3.b.n);
                        int i46 = q10 + 1;
                        if (i45 == 0) {
                            j11 = -9223372036854775807L;
                            i19 = -2147483647;
                        } else {
                            if (!k14.h()) {
                                throw w0.c("Only supports full channel mask-based audio presentation");
                            }
                            int i47 = q10 - 1;
                            int i48 = ((bArr3[i47] << 8) & 65535) | (bArr3[q10] & 255);
                            String str3 = l0.a;
                            int i49 = 65535;
                            for (int i50 = 0; i50 < i47; i50++) {
                                byte b13 = bArr3[i50];
                                int i51 = (((b13 & 255) >> 4) ^ ((i49 >> 12) & zs.e4)) & zs.e4;
                                int[] iArr = l0.k;
                                int i52 = (iArr[i51] ^ ((i49 << 4) & 65535)) & 65535;
                                i49 = (iArr[((b13 & 15) ^ ((i52 >> 12) & zs.e4)) & zs.e4] ^ ((i52 << 4) & 65535)) & 65535;
                            }
                            if (i48 != i49) {
                                throw w0.a(null, "CRC check failed");
                            }
                            int i53 = k14.i(2);
                            if (i53 != 0) {
                                if (i53 == 1) {
                                    i21 = 480;
                                } else {
                                    if (i53 != 2) {
                                        throw w0.a(null, "Unsupported base duration index in DTS UHD header: " + i53);
                                    }
                                    i21 = 384;
                                }
                                i20 = 3;
                            } else {
                                i20 = 3;
                                i21 = 512;
                            }
                            int i54 = (k14.i(i20) + 1) * i21;
                            int i55 = k14.i(2);
                            if (i55 == 0) {
                                i22 = 32000;
                            } else if (i55 == 1) {
                                i22 = 44100;
                            } else {
                                if (i55 != 2) {
                                    throw w0.a(null, "Unsupported clock rate index in DTS UHD header: " + i55);
                                }
                                i22 = 48000;
                            }
                            if (k14.h()) {
                                k14.f0(36);
                            }
                            int i56 = i22 * (1 << k14.i(2));
                            j11 = l0.a0(i54, 1000000L, i22, RoundingMode.DOWN);
                            i19 = i56;
                        }
                        int i57 = 0;
                        for (int i58 = 0; i58 < i45; i58++) {
                            i57 += c3.b.q(k14, c3.b.o);
                        }
                        AtomicInteger atomicInteger = this.b;
                        if (i45 != 0) {
                            atomicInteger.set(c3.b.q(k14, c3.b.p));
                        }
                        int q11 = i57 + (atomicInteger.get() != 0 ? c3.b.q(k14, c3.b.q) : 0) + i46;
                        c3.a aVar = new c3.a("audio/vnd.dts.uhd;profile=p2", 2, i19, q11, j11);
                        if (this.n == 3) {
                            b(aVar);
                        }
                        this.m = q11;
                        this.k = j11 == -9223372036854775807L ? 0L : j11;
                        xVar2.N(0);
                        this.g.d(this.p, xVar2);
                        this.h = 6;
                        break;
                    } else {
                        continue;
                    }
                case 6:
                    int min = Math.min(xVar.a(), this.m - this.i);
                    this.g.d(min, xVar);
                    int i59 = this.i + min;
                    this.i = i59;
                    if (i59 != this.m) {
                        break;
                    } else {
                        t6.p(this.q != -9223372036854775807L);
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

    @Override // j4.i
    public final void e() {
        this.h = 0;
        this.i = 0;
        this.j = 0;
        this.q = -9223372036854775807L;
        this.b.set(0);
    }

    @Override // j4.i
    public final void f(c3.q qVar, g0 g0Var) {
        g0Var.b();
        g0Var.c();
        this.f = (String) g0Var.e;
        g0Var.c();
        this.g = qVar.I1(g0Var.c, 1);
    }

    @Override // j4.i
    public final void h(int i10, long j10) {
        this.q = j10;
    }

    @Override // j4.i
    public final void g(boolean z10) {
    }
}
