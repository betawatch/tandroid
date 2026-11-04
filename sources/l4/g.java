package l4;

import b8.od;
import b8.zb;
import d2.u0;
import d2.v0;
import e3.i0;
import g2.n0;
import java.math.RoundingMode;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.hs;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class g implements i {
    public final g2.y a;
    public final String c;
    public final int d;
    public String f;
    public i0 g;
    public int i;
    public int j;
    public long k;
    public d2.v l;
    public int m;
    public int n;
    public int h = 0;
    public long q = -9223372036854775807L;
    public final AtomicInteger b = new AtomicInteger();
    public int o = -1;
    public int p = -1;
    public final String e = "video/mp2t";

    public g(String str, int i3, int i10) {
        this.a = new g2.y(new byte[i10]);
        this.c = str;
        this.d = i3;
    }

    @Override // l4.i
    public final void a() {
        this.h = 0;
        this.i = 0;
        this.j = 0;
        this.q = -9223372036854775807L;
        this.b.set(0);
    }

    public final boolean b(g2.y yVar, byte[] bArr, int i3) {
        int min = Math.min(yVar.a(), i3 - this.i);
        yVar.k(this.i, min, bArr);
        int i10 = this.i + min;
        this.i = i10;
        return i10 == i3;
    }

    @Override // l4.i
    public final void c(g2.y yVar) {
        int i3;
        byte b10;
        int i10;
        byte b11;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        long j10;
        int i17;
        long j11;
        int i18;
        int i19;
        int i20;
        int i21;
        this.g.getClass();
        while (yVar.a() > 0) {
            int i22 = this.h;
            g2.y yVar2 = this.a;
            switch (i22) {
                case 0:
                    while (true) {
                        if (yVar.a() > 0) {
                            int i23 = this.j << 8;
                            this.j = i23;
                            int A = i23 | yVar.A();
                            this.j = A;
                            int i24 = e3.b.i(A);
                            this.n = i24;
                            if (i24 != 0) {
                                byte[] bArr = yVar2.a;
                                int i25 = this.j;
                                bArr[0] = (byte) ((i25 >> 24) & hs.e4);
                                bArr[1] = (byte) ((i25 >> 16) & hs.e4);
                                bArr[2] = (byte) ((i25 >> 8) & hs.e4);
                                bArr[3] = (byte) (i25 & hs.e4);
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
                    if (!b(yVar, yVar2.a, 18)) {
                        break;
                    } else {
                        byte[] bArr2 = yVar2.a;
                        if (this.l == null) {
                            String str = this.f;
                            c4.f k10 = e3.b.k(bArr2);
                            k10.L(60);
                            int i26 = e3.b.j[k10.j(6)];
                            int i27 = e3.b.k[k10.j(4)];
                            int j12 = k10.j(5);
                            int i28 = j12 >= 29 ? -1 : (e3.b.l[j12] * 1000) / 2;
                            k10.L(10);
                            int i29 = i26 + (k10.j(2) > 0 ? 1 : 0);
                            d2.u uVar = new d2.u();
                            uVar.a = str;
                            uVar.q = u0.n(this.e);
                            uVar.r = u0.n("audio/vnd.dts");
                            uVar.h = i28;
                            uVar.J = i29;
                            uVar.K = i27;
                            uVar.v = null;
                            uVar.d = this.c;
                            uVar.f = this.d;
                            d2.v vVar = new d2.v(uVar);
                            this.l = vVar;
                            this.g.g(vVar);
                        }
                        this.m = e3.b.g(bArr2);
                        byte b12 = bArr2[0];
                        if (b12 != -2) {
                            if (b12 == -1) {
                                i3 = (bArr2[4] & 7) << 4;
                                b11 = bArr2[7];
                            } else if (b12 != 31) {
                                i3 = (bArr2[4] & 1) << 6;
                                b10 = bArr2[5];
                            } else {
                                i3 = (bArr2[5] & 7) << 4;
                                b11 = bArr2[6];
                            }
                            i10 = b11 & 60;
                            this.k = od.b(n0.Y(this.l.L, (((i10 >> 2) | i3) + 1) * 32));
                            yVar2.N(0);
                            this.g.e(18, yVar2);
                            this.h = 6;
                            break;
                        } else {
                            i3 = (bArr2[5] & 1) << 6;
                            b10 = bArr2[4];
                        }
                        i10 = b10 & 252;
                        this.k = od.b(n0.Y(this.l.L, (((i10 >> 2) | i3) + 1) * 32));
                        yVar2.N(0);
                        this.g.e(18, yVar2);
                        this.h = 6;
                    }
                case 2:
                    if (b(yVar, yVar2.a, 7)) {
                        c4.f k11 = e3.b.k(yVar2.a);
                        k11.L(42);
                        this.o = k11.j(k11.i() ? 12 : 8) + 1;
                        this.h = 3;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    int i30 = 8;
                    if (b(yVar, yVar2.a, this.o)) {
                        c4.f k12 = e3.b.k(yVar2.a);
                        k12.L(40);
                        int j13 = k12.j(2);
                        if (k12.i()) {
                            i11 = 20;
                            i12 = 12;
                        } else {
                            i11 = 16;
                            i12 = 8;
                        }
                        k12.L(i12);
                        int j14 = k12.j(i11) + 1;
                        boolean i31 = k12.i();
                        if (i31) {
                            i13 = k12.j(2);
                            i14 = (k12.j(3) + 1) * 512;
                            if (k12.i()) {
                                k12.L(36);
                            }
                            int j15 = k12.j(3) + 1;
                            int j16 = k12.j(3) + 1;
                            if (j15 != 1 || j16 != 1) {
                                throw v0.c("Multiple audio presentations or assets not supported");
                            }
                            int i32 = j13 + 1;
                            int j17 = k12.j(i32);
                            int i33 = 0;
                            while (i33 < i32) {
                                if (((j17 >> i33) & 1) == 1) {
                                    k12.L(i30);
                                }
                                i33++;
                                i30 = 8;
                            }
                            if (k12.i()) {
                                k12.L(2);
                                int j18 = (k12.j(2) + 1) << 2;
                                int j19 = k12.j(2) + 1;
                                for (int i34 = 0; i34 < j19; i34++) {
                                    k12.L(j18);
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
                            i16 = e3.b.m[k12.j(4)];
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
                                    throw v0.a(null, "Unsupported reference clock code in DTS HD header: " + i13);
                                }
                                i17 = 48000;
                            }
                            String str2 = n0.a;
                            j10 = n0.a0(i14, 1000000L, i17, RoundingMode.DOWN);
                        } else {
                            j10 = -9223372036854775807L;
                        }
                        g(new e3.a("audio/vnd.dts.hd;profile=lbr", i15, i16, j14, j10));
                        this.m = j14;
                        this.k = j10 == -9223372036854775807L ? 0L : j10;
                        yVar2.N(0);
                        this.g.e(this.o, yVar2);
                        this.h = 6;
                        break;
                    } else {
                        continue;
                    }
                case 4:
                    if (b(yVar, yVar2.a, 6)) {
                        c4.f k13 = e3.b.k(yVar2.a);
                        k13.L(32);
                        int q10 = e3.b.q(k13, e3.b.r) + 1;
                        this.p = q10;
                        int i35 = this.i;
                        if (i35 > q10) {
                            int i36 = i35 - q10;
                            this.i = i35 - i36;
                            yVar.N(yVar.b - i36);
                        }
                        this.h = 5;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (b(yVar, yVar2.a, this.p)) {
                        byte[] bArr3 = yVar2.a;
                        c4.f k14 = e3.b.k(bArr3);
                        int i37 = k14.j(32) == 1078008818 ? 1 : 0;
                        int q11 = e3.b.q(k14, e3.b.n);
                        int i38 = q11 + 1;
                        if (i37 == 0) {
                            j11 = -9223372036854775807L;
                            i18 = -2147483647;
                        } else {
                            if (!k14.i()) {
                                throw v0.c("Only supports full channel mask-based audio presentation");
                            }
                            int i39 = q11 - 1;
                            int i40 = ((bArr3[i39] << 8) & 65535) | (bArr3[q11] & 255);
                            String str3 = n0.a;
                            int i41 = 65535;
                            for (int i42 = 0; i42 < i39; i42++) {
                                byte b13 = bArr3[i42];
                                int i43 = (((b13 & 255) >> 4) ^ ((i41 >> 12) & hs.e4)) & hs.e4;
                                int[] iArr = n0.k;
                                int i44 = (iArr[i43] ^ ((i41 << 4) & 65535)) & 65535;
                                i41 = (iArr[((b13 & 15) ^ ((i44 >> 12) & hs.e4)) & hs.e4] ^ ((i44 << 4) & 65535)) & 65535;
                            }
                            if (i40 != i41) {
                                throw v0.a(null, "CRC check failed");
                            }
                            int j20 = k14.j(2);
                            if (j20 != 0) {
                                if (j20 == 1) {
                                    i20 = 480;
                                } else {
                                    if (j20 != 2) {
                                        throw v0.a(null, "Unsupported base duration index in DTS UHD header: " + j20);
                                    }
                                    i20 = 384;
                                }
                                i19 = 3;
                            } else {
                                i19 = 3;
                                i20 = 512;
                            }
                            int j21 = (k14.j(i19) + 1) * i20;
                            int j22 = k14.j(2);
                            if (j22 == 0) {
                                i21 = 32000;
                            } else if (j22 == 1) {
                                i21 = 44100;
                            } else {
                                if (j22 != 2) {
                                    throw v0.a(null, "Unsupported clock rate index in DTS UHD header: " + j22);
                                }
                                i21 = 48000;
                            }
                            if (k14.i()) {
                                k14.L(36);
                            }
                            int j23 = i21 * (1 << k14.j(2));
                            j11 = n0.a0(j21, 1000000L, i21, RoundingMode.DOWN);
                            i18 = j23;
                        }
                        int i45 = 0;
                        for (int i46 = 0; i46 < i37; i46++) {
                            i45 += e3.b.q(k14, e3.b.o);
                        }
                        AtomicInteger atomicInteger = this.b;
                        if (i37 != 0) {
                            atomicInteger.set(e3.b.q(k14, e3.b.p));
                        }
                        int q12 = i45 + (atomicInteger.get() != 0 ? e3.b.q(k14, e3.b.q) : 0) + i38;
                        e3.a aVar = new e3.a("audio/vnd.dts.uhd;profile=p2", 2, i18, q12, j11);
                        if (this.n == 3) {
                            g(aVar);
                        }
                        this.m = q12;
                        this.k = j11 == -9223372036854775807L ? 0L : j11;
                        yVar2.N(0);
                        this.g.e(this.p, yVar2);
                        this.h = 6;
                        break;
                    } else {
                        continue;
                    }
                case 6:
                    int min = Math.min(yVar.a(), this.m - this.i);
                    this.g.e(min, yVar);
                    int i47 = this.i + min;
                    this.i = i47;
                    if (i47 != this.m) {
                        break;
                    } else {
                        zb.p(this.q != -9223372036854775807L);
                        this.g.d(this.q, this.n == 4 ? 0 : 1, this.m, 0, null);
                        this.q += this.k;
                        this.h = 0;
                        break;
                    }
                default:
                    throw new IllegalStateException();
            }
        }
    }

    @Override // l4.i
    public final void e(int i3, long j10) {
        this.q = j10;
    }

    @Override // l4.i
    public final void f(e3.q qVar, f0 f0Var) {
        f0Var.b();
        f0Var.c();
        this.f = (String) f0Var.e;
        f0Var.c();
        this.g = qVar.i0(f0Var.c, 1);
    }

    public final void g(e3.a aVar) {
        int i3 = aVar.b;
        String str = aVar.a;
        int i10 = aVar.c;
        if (i3 == -2147483647 || i10 == -1) {
            return;
        }
        d2.v vVar = this.l;
        if (vVar != null && i10 == vVar.K && i3 == vVar.L && str.equals(vVar.s)) {
            return;
        }
        d2.v vVar2 = this.l;
        d2.u uVar = vVar2 == null ? new d2.u() : vVar2.a();
        uVar.a = this.f;
        uVar.q = u0.n(this.e);
        uVar.r = u0.n(str);
        uVar.J = i10;
        uVar.K = i3;
        uVar.d = this.c;
        uVar.f = this.d;
        d2.v vVar3 = new d2.v(uVar);
        this.l = vVar3;
        this.g.g(vVar3);
    }

    @Override // l4.i
    public final void d(boolean z10) {
    }
}
