package j4;

import a8.ed;
import a8.yb;
import b2.w0;
import b2.x0;
import c3.j0;
import e2.n0;
import java.math.RoundingMode;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class g implements i {
    public final e2.x a;
    public final String c;
    public final int d;
    public String f;
    public j0 g;
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

    @Override // j4.i
    public final void a(e2.x xVar) {
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
                                bArr[0] = (byte) ((i26 >> 24) & 255);
                                bArr[1] = (byte) ((i26 >> 16) & 255);
                                bArr[2] = (byte) ((i26 >> 8) & 255);
                                bArr[3] = (byte) (i26 & 255);
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
                    if (!b(xVar, xVar2.a, 18)) {
                        break;
                    } else {
                        byte[] bArr2 = xVar2.a;
                        if (this.l == null) {
                            String str = this.f;
                            a4.g k10 = c3.b.k(bArr2);
                            k10.o(60);
                            int i27 = c3.b.j[k10.g(6)];
                            int i28 = c3.b.k[k10.g(4)];
                            int g7 = k10.g(5);
                            int i29 = g7 >= 29 ? -1 : (c3.b.l[g7] * MediaDataController.MAX_STYLE_RUNS_COUNT) / 2;
                            k10.o(10);
                            int i30 = i27 + (k10.g(2) > 0 ? 1 : 0);
                            b2.w wVar = new b2.w();
                            wVar.a = str;
                            wVar.q = w0.n(this.e);
                            wVar.r = w0.n("audio/vnd.dts");
                            wVar.h = i29;
                            wVar.J = i30;
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
                            this.k = ed.b(n0.Y(this.l.L, (((i11 >> 2) | i10) + 1) * 32));
                            xVar2.N(0);
                            this.g.d(18, xVar2);
                            this.h = 6;
                            break;
                        } else {
                            i10 = (bArr2[5] & 1) << 6;
                            b10 = bArr2[4];
                        }
                        i11 = b10 & 252;
                        this.k = ed.b(n0.Y(this.l.L, (((i11 >> 2) | i10) + 1) * 32));
                        xVar2.N(0);
                        this.g.d(18, xVar2);
                        this.h = 6;
                    }
                case 2:
                    if (b(xVar, xVar2.a, 7)) {
                        a4.g k11 = c3.b.k(xVar2.a);
                        k11.o(42);
                        this.o = k11.g(k11.f() ? 12 : 8) + 1;
                        this.h = 3;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    int i31 = 8;
                    if (b(xVar, xVar2.a, this.o)) {
                        a4.g k12 = c3.b.k(xVar2.a);
                        k12.o(40);
                        int g10 = k12.g(2);
                        if (k12.f()) {
                            i12 = 20;
                            i13 = 12;
                        } else {
                            i12 = 16;
                            i13 = 8;
                        }
                        k12.o(i13);
                        int g11 = k12.g(i12) + 1;
                        boolean f7 = k12.f();
                        if (f7) {
                            i14 = k12.g(2);
                            i15 = (k12.g(3) + 1) * 512;
                            if (k12.f()) {
                                k12.o(36);
                            }
                            int g12 = k12.g(3) + 1;
                            int g13 = k12.g(3) + 1;
                            if (g12 != 1 || g13 != 1) {
                                throw x0.c("Multiple audio presentations or assets not supported");
                            }
                            int i32 = g10 + 1;
                            int g14 = k12.g(i32);
                            int i33 = 0;
                            while (i33 < i32) {
                                if (((g14 >> i33) & 1) == 1) {
                                    k12.o(i31);
                                }
                                i33++;
                                i31 = 8;
                            }
                            if (k12.f()) {
                                k12.o(2);
                                int g15 = (k12.g(2) + 1) << 2;
                                int g16 = k12.g(2) + 1;
                                for (int i34 = 0; i34 < g16; i34++) {
                                    k12.o(g15);
                                }
                            }
                        } else {
                            i14 = -1;
                            i15 = 0;
                        }
                        k12.o(i12);
                        k12.o(12);
                        if (f7) {
                            if (k12.f()) {
                                k12.o(4);
                            }
                            if (k12.f()) {
                                k12.o(24);
                            }
                            if (k12.f()) {
                                k12.p(k12.g(10) + 1);
                            }
                            k12.o(5);
                            i17 = c3.b.m[k12.g(4)];
                            i16 = k12.g(8) + 1;
                        } else {
                            i16 = -1;
                            i17 = -2147483647;
                        }
                        if (f7) {
                            if (i14 == 0) {
                                i18 = 32000;
                            } else if (i14 == 1) {
                                i18 = 44100;
                            } else {
                                if (i14 != 2) {
                                    throw x0.a(null, "Unsupported reference clock code in DTS HD header: " + i14);
                                }
                                i18 = 48000;
                            }
                            String str2 = n0.a;
                            j10 = n0.a0(i15, 1000000L, i18, RoundingMode.DOWN);
                        } else {
                            j10 = -9223372036854775807L;
                        }
                        g(new c3.a("audio/vnd.dts.hd;profile=lbr", i16, i17, g11, j10));
                        this.m = g11;
                        this.k = j10 == -9223372036854775807L ? 0L : j10;
                        xVar2.N(0);
                        this.g.d(this.o, xVar2);
                        this.h = 6;
                        break;
                    } else {
                        continue;
                    }
                case 4:
                    if (b(xVar, xVar2.a, 6)) {
                        a4.g k13 = c3.b.k(xVar2.a);
                        k13.o(32);
                        int q5 = c3.b.q(k13, c3.b.r) + 1;
                        this.p = q5;
                        int i35 = this.i;
                        if (i35 > q5) {
                            int i36 = i35 - q5;
                            this.i = i35 - i36;
                            xVar.N(xVar.b - i36);
                        }
                        this.h = 5;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (b(xVar, xVar2.a, this.p)) {
                        byte[] bArr3 = xVar2.a;
                        a4.g k14 = c3.b.k(bArr3);
                        int i37 = k14.g(32) == 1078008818 ? 1 : 0;
                        int q9 = c3.b.q(k14, c3.b.n);
                        int i38 = q9 + 1;
                        if (i37 == 0) {
                            j11 = -9223372036854775807L;
                            i19 = -2147483647;
                        } else {
                            if (!k14.f()) {
                                throw x0.c("Only supports full channel mask-based audio presentation");
                            }
                            int i39 = q9 - 1;
                            int i40 = ((bArr3[i39] << 8) & 65535) | (bArr3[q9] & 255);
                            String str3 = n0.a;
                            int i41 = 65535;
                            for (int i42 = 0; i42 < i39; i42++) {
                                byte b13 = bArr3[i42];
                                int[] iArr = n0.k;
                                int i43 = (iArr[(((b13 & 255) >> 4) ^ ((i41 >> 12) & 255)) & 255] ^ ((i41 << 4) & 65535)) & 65535;
                                i41 = (iArr[((b13 & 15) ^ ((i43 >> 12) & 255)) & 255] ^ ((i43 << 4) & 65535)) & 65535;
                            }
                            if (i40 != i41) {
                                throw x0.a(null, "CRC check failed");
                            }
                            int g17 = k14.g(2);
                            if (g17 != 0) {
                                if (g17 == 1) {
                                    i21 = 480;
                                } else {
                                    if (g17 != 2) {
                                        throw x0.a(null, "Unsupported base duration index in DTS UHD header: " + g17);
                                    }
                                    i21 = 384;
                                }
                                i20 = 3;
                            } else {
                                i20 = 3;
                                i21 = 512;
                            }
                            int g18 = (k14.g(i20) + 1) * i21;
                            int g19 = k14.g(2);
                            if (g19 == 0) {
                                i22 = 32000;
                            } else if (g19 == 1) {
                                i22 = 44100;
                            } else {
                                if (g19 != 2) {
                                    throw x0.a(null, "Unsupported clock rate index in DTS UHD header: " + g19);
                                }
                                i22 = 48000;
                            }
                            if (k14.f()) {
                                k14.o(36);
                            }
                            int g20 = i22 * (1 << k14.g(2));
                            j11 = n0.a0(g18, 1000000L, i22, RoundingMode.DOWN);
                            i19 = g20;
                        }
                        int i44 = 0;
                        for (int i45 = 0; i45 < i37; i45++) {
                            i44 += c3.b.q(k14, c3.b.o);
                        }
                        AtomicInteger atomicInteger = this.b;
                        if (i37 != 0) {
                            atomicInteger.set(c3.b.q(k14, c3.b.p));
                        }
                        int q10 = i44 + (atomicInteger.get() != 0 ? c3.b.q(k14, c3.b.q) : 0) + i38;
                        c3.a aVar = new c3.a("audio/vnd.dts.uhd;profile=p2", 2, i19, q10, j11);
                        if (this.n == 3) {
                            g(aVar);
                        }
                        this.m = q10;
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
                    int i46 = this.i + min;
                    this.i = i46;
                    if (i46 != this.m) {
                        break;
                    } else {
                        yb.p(this.q != -9223372036854775807L);
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

    public final boolean b(e2.x xVar, byte[] bArr, int i10) {
        int min = Math.min(xVar.a(), i10 - this.i);
        xVar.k(this.i, min, bArr);
        int i11 = this.i + min;
        this.i = i11;
        return i11 == i10;
    }

    @Override // j4.i
    public final void c() {
        this.h = 0;
        this.i = 0;
        this.j = 0;
        this.q = -9223372036854775807L;
        this.b.set(0);
    }

    @Override // j4.i
    public final void d(c3.q qVar, f0 f0Var) {
        f0Var.b();
        f0Var.c();
        this.f = (String) f0Var.e;
        f0Var.c();
        this.g = qVar.F1(f0Var.c, 1);
    }

    @Override // j4.i
    public final void f(int i10, long j10) {
        this.q = j10;
    }

    public final void g(c3.a aVar) {
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
        wVar.q = w0.n(this.e);
        wVar.r = w0.n(str);
        wVar.J = i11;
        wVar.K = i10;
        wVar.d = this.c;
        wVar.f = this.d;
        b2.x xVar3 = new b2.x(wVar);
        this.l = xVar3;
        this.g.b(xVar3);
    }

    @Override // j4.i
    public final void e(boolean z10) {
    }
}
