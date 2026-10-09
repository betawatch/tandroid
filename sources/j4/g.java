package j4;

import b2.r0;
import b2.s0;
import c3.h0;
import java.math.RoundingMode;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.MediaDataController;
import v7.v7;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class g implements i {
    public final e2.v a;
    public final String c;
    public final int d;
    public String f;
    public h0 g;
    public int i;
    public int j;
    public long k;
    public b2.s l;
    public int m;
    public int n;
    public int h = 0;
    public long q = -9223372036854775807L;
    public final AtomicInteger b = new AtomicInteger();
    public int o = -1;
    public int p = -1;
    public final String e = "video/mp2t";

    public g(String str, int i10, int i11) {
        this.a = new e2.v(new byte[i11]);
        this.c = str;
        this.d = i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:193:0x0480  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0488  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x04bb  */
    @Override // j4.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(e2.v vVar) {
        int i10;
        byte b10;
        boolean z10;
        int i11;
        int i12;
        byte b11;
        int i13;
        byte b12;
        int i14;
        byte b13;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        long j3;
        int i21;
        long j10;
        int i22;
        int i23;
        int i24;
        int i25;
        e2.d.h(this.g);
        while (vVar.a() > 0) {
            int i26 = this.h;
            int i27 = 8;
            e2.v vVar2 = this.a;
            switch (i26) {
                case 0:
                    while (true) {
                        if (vVar.a() > 0) {
                            int i28 = this.j << 8;
                            this.j = i28;
                            int x10 = i28 | vVar.x();
                            this.j = x10;
                            int i29 = (x10 == 2147385345 || x10 == -25230976 || x10 == 536864768 || x10 == -14745368) ? 1 : (x10 == 1683496997 || x10 == 622876772) ? 2 : (x10 == 1078008818 || x10 == -233094848) ? 3 : (x10 == 1908687592 || x10 == -398277519) ? 4 : 0;
                            this.n = i29;
                            if (i29 != 0) {
                                byte[] bArr = vVar2.a;
                                bArr[0] = (byte) ((x10 >> 24) & 255);
                                bArr[1] = (byte) ((x10 >> 16) & 255);
                                bArr[2] = (byte) ((x10 >> 8) & 255);
                                bArr[3] = (byte) (x10 & 255);
                                this.i = 4;
                                this.j = 0;
                                if (i29 != 3 && i29 != 4) {
                                    if (i29 == 1) {
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
                    if (!b(vVar, vVar2.a, 18)) {
                        break;
                    } else {
                        byte[] bArr2 = vVar2.a;
                        if (this.l == null) {
                            String str = this.f;
                            a4.g j11 = c3.b.j(bArr2);
                            j11.t(60);
                            int i30 = c3.b.j[j11.i(6)];
                            int i31 = c3.b.k[j11.i(4)];
                            int i32 = j11.i(5);
                            int i33 = i32 >= 29 ? -1 : (c3.b.l[i32] * MediaDataController.MAX_STYLE_RUNS_COUNT) / 2;
                            j11.t(10);
                            int i34 = i30 + (j11.i(2) > 0 ? 1 : 0);
                            b2.r rVar = new b2.r();
                            rVar.a = str;
                            rVar.p = r0.n(this.e);
                            rVar.q = r0.n("audio/vnd.dts");
                            rVar.h = i33;
                            rVar.I = i34;
                            rVar.J = i31;
                            rVar.u = null;
                            rVar.d = this.c;
                            rVar.f = this.d;
                            b2.s sVar = new b2.s(rVar);
                            this.l = sVar;
                            this.g.b(sVar);
                        }
                        byte b14 = bArr2[0];
                        if (b14 != -2) {
                            if (b14 == -1) {
                                i14 = ((bArr2[7] & 3) << 12) | ((bArr2[6] & 255) << 4);
                                b13 = bArr2[9];
                            } else if (b14 != 31) {
                                i10 = ((bArr2[5] & 3) << 12) | ((bArr2[6] & 255) << 4);
                                b10 = bArr2[7];
                            } else {
                                i14 = ((bArr2[6] & 3) << 12) | ((bArr2[7] & 255) << 4);
                                b13 = bArr2[8];
                            }
                            i11 = (i14 | ((b13 & 60) >> 2)) + 1;
                            z10 = true;
                            if (z10) {
                                i11 = (i11 * 16) / 14;
                            }
                            this.m = i11;
                            if (b14 == -2) {
                                if (b14 == -1) {
                                    i12 = (bArr2[4] & 7) << 4;
                                    b12 = bArr2[7];
                                } else if (b14 != 31) {
                                    i12 = (bArr2[4] & 1) << 6;
                                    b11 = bArr2[5];
                                } else {
                                    i12 = (bArr2[5] & 7) << 4;
                                    b12 = bArr2[6];
                                }
                                i13 = b12 & 60;
                                this.k = v7.b(e2.d0.V(this.l.K, (((i13 >> 2) | i12) + 1) * 32));
                                vVar2.J(0);
                                this.g.d(18, vVar2);
                                this.h = 6;
                                break;
                            } else {
                                i12 = (bArr2[5] & 1) << 6;
                                b11 = bArr2[4];
                            }
                            i13 = b11 & 252;
                            this.k = v7.b(e2.d0.V(this.l.K, (((i13 >> 2) | i12) + 1) * 32));
                            vVar2.J(0);
                            this.g.d(18, vVar2);
                            this.h = 6;
                        } else {
                            i10 = ((bArr2[4] & 3) << 12) | ((bArr2[7] & 255) << 4);
                            b10 = bArr2[6];
                        }
                        i11 = (i10 | ((b10 & 240) >> 4)) + 1;
                        z10 = false;
                        if (z10) {
                        }
                        this.m = i11;
                        if (b14 == -2) {
                        }
                        i13 = b11 & 252;
                        this.k = v7.b(e2.d0.V(this.l.K, (((i13 >> 2) | i12) + 1) * 32));
                        vVar2.J(0);
                        this.g.d(18, vVar2);
                        this.h = 6;
                    }
                case 2:
                    if (b(vVar, vVar2.a, 7)) {
                        a4.g j12 = c3.b.j(vVar2.a);
                        j12.t(42);
                        this.o = j12.i(j12.h() ? 12 : 8) + 1;
                        this.h = 3;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (b(vVar, vVar2.a, this.o)) {
                        a4.g j13 = c3.b.j(vVar2.a);
                        j13.t(40);
                        int i35 = j13.i(2);
                        if (j13.h()) {
                            i15 = 20;
                            i16 = 12;
                        } else {
                            i15 = 16;
                            i16 = 8;
                        }
                        j13.t(i16);
                        int i36 = j13.i(i15) + 1;
                        boolean h = j13.h();
                        if (h) {
                            i17 = j13.i(2);
                            i18 = (j13.i(3) + 1) * 512;
                            if (j13.h()) {
                                j13.t(36);
                            }
                            int i37 = j13.i(3) + 1;
                            int i38 = j13.i(3) + 1;
                            if (i37 != 1 || i38 != 1) {
                                throw s0.c("Multiple audio presentations or assets not supported");
                            }
                            int i39 = i35 + 1;
                            int i40 = j13.i(i39);
                            int i41 = 0;
                            while (i41 < i39) {
                                if (((i40 >> i41) & 1) == 1) {
                                    j13.t(i27);
                                }
                                i41++;
                                i27 = 8;
                            }
                            if (j13.h()) {
                                j13.t(2);
                                int i42 = (j13.i(2) + 1) << 2;
                                int i43 = j13.i(2) + 1;
                                for (int i44 = 0; i44 < i43; i44++) {
                                    j13.t(i42);
                                }
                            }
                        } else {
                            i17 = -1;
                            i18 = 0;
                        }
                        j13.t(i15);
                        j13.t(12);
                        if (h) {
                            if (j13.h()) {
                                j13.t(4);
                            }
                            if (j13.h()) {
                                j13.t(24);
                            }
                            if (j13.h()) {
                                j13.u(j13.i(10) + 1);
                            }
                            j13.t(5);
                            int i45 = c3.b.m[j13.i(4)];
                            i19 = j13.i(8) + 1;
                            i20 = i45;
                        } else {
                            i19 = -1;
                            i20 = -2147483647;
                        }
                        if (h) {
                            if (i17 == 0) {
                                i21 = 32000;
                            } else if (i17 == 1) {
                                i21 = 44100;
                            } else {
                                if (i17 != 2) {
                                    throw s0.a(null, "Unsupported reference clock code in DTS HD header: " + i17);
                                }
                                i21 = 48000;
                            }
                            String str2 = e2.d0.a;
                            j3 = e2.d0.X(i18, 1000000L, i21, RoundingMode.DOWN);
                        } else {
                            j3 = -9223372036854775807L;
                        }
                        g(new c3.a("audio/vnd.dts.hd;profile=lbr", i19, i20, i36, j3));
                        this.m = i36;
                        this.k = j3 == -9223372036854775807L ? 0L : j3;
                        vVar2.J(0);
                        this.g.d(this.o, vVar2);
                        this.h = 6;
                        break;
                    } else {
                        continue;
                    }
                case 4:
                    if (b(vVar, vVar2.a, 6)) {
                        a4.g j14 = c3.b.j(vVar2.a);
                        j14.t(32);
                        int q6 = c3.b.q(j14, c3.b.r) + 1;
                        this.p = q6;
                        int i46 = this.i;
                        if (i46 > q6) {
                            int i47 = i46 - q6;
                            this.i = i46 - i47;
                            vVar.J(vVar.b - i47);
                        }
                        this.h = 5;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (b(vVar, vVar2.a, this.p)) {
                        byte[] bArr3 = vVar2.a;
                        a4.g j15 = c3.b.j(bArr3);
                        int i48 = j15.i(32) == 1078008818 ? 1 : 0;
                        int q10 = c3.b.q(j15, c3.b.n);
                        int i49 = q10 + 1;
                        if (i48 == 0) {
                            j10 = -9223372036854775807L;
                            i22 = -2147483647;
                        } else {
                            if (!j15.h()) {
                                throw s0.c("Only supports full channel mask-based audio presentation");
                            }
                            int i50 = q10 - 1;
                            int i51 = ((bArr3[i50] << 8) & 65535) | (bArr3[q10] & 255);
                            String str3 = e2.d0.a;
                            int i52 = 65535;
                            for (int i53 = 0; i53 < i50; i53++) {
                                byte b15 = bArr3[i53];
                                int i54 = (((i52 >> 12) & 255) ^ ((b15 & 255) >> 4)) & 255;
                                int i55 = (i52 << 4) & 65535;
                                int[] iArr = e2.d0.k;
                                int i56 = (iArr[i54] ^ i55) & 65535;
                                i52 = (iArr[((b15 & 15) ^ ((i56 >> 12) & 255)) & 255] ^ ((i56 << 4) & 65535)) & 65535;
                            }
                            if (i51 != i52) {
                                throw s0.a(null, "CRC check failed");
                            }
                            int i57 = j15.i(2);
                            if (i57 != 0) {
                                if (i57 == 1) {
                                    i24 = 480;
                                } else {
                                    if (i57 != 2) {
                                        throw s0.a(null, "Unsupported base duration index in DTS UHD header: " + i57);
                                    }
                                    i24 = 384;
                                }
                                i23 = 3;
                            } else {
                                i23 = 3;
                                i24 = 512;
                            }
                            int i58 = (j15.i(i23) + 1) * i24;
                            int i59 = j15.i(2);
                            if (i59 == 0) {
                                i25 = 32000;
                            } else if (i59 == 1) {
                                i25 = 44100;
                            } else {
                                if (i59 != 2) {
                                    throw s0.a(null, "Unsupported clock rate index in DTS UHD header: " + i59);
                                }
                                i25 = 48000;
                            }
                            if (j15.h()) {
                                j15.t(36);
                            }
                            int i60 = i25 * (1 << j15.i(2));
                            j10 = e2.d0.X(i58, 1000000L, i25, RoundingMode.DOWN);
                            i22 = i60;
                        }
                        int i61 = 0;
                        for (int i62 = 0; i62 < i48; i62++) {
                            i61 += c3.b.q(j15, c3.b.o);
                        }
                        AtomicInteger atomicInteger = this.b;
                        if (i48 != 0) {
                            atomicInteger.set(c3.b.q(j15, c3.b.p));
                        }
                        int q11 = i61 + (atomicInteger.get() != 0 ? c3.b.q(j15, c3.b.q) : 0) + i49;
                        c3.a aVar = new c3.a("audio/vnd.dts.uhd;profile=p2", 2, i22, q11, j10);
                        if (this.n == 3) {
                            g(aVar);
                        }
                        this.m = q11;
                        this.k = j10 == -9223372036854775807L ? 0L : j10;
                        vVar2.J(0);
                        this.g.d(this.p, vVar2);
                        this.h = 6;
                        break;
                    } else {
                        continue;
                    }
                case 6:
                    int min = Math.min(vVar.a(), this.m - this.i);
                    this.g.d(min, vVar);
                    int i63 = this.i + min;
                    this.i = i63;
                    if (i63 != this.m) {
                        break;
                    } else {
                        e2.d.g(this.q != -9223372036854775807L);
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

    public final boolean b(e2.v vVar, byte[] bArr, int i10) {
        int min = Math.min(vVar.a(), i10 - this.i);
        vVar.h(this.i, min, bArr);
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
        this.g = qVar.f2(f0Var.c, 1);
    }

    @Override // j4.i
    public final void f(int i10, long j3) {
        this.q = j3;
    }

    public final void g(c3.a aVar) {
        int i10 = aVar.b;
        String str = aVar.a;
        int i11 = aVar.c;
        if (i10 == -2147483647 || i11 == -1) {
            return;
        }
        b2.s sVar = this.l;
        if (sVar != null && i11 == sVar.J && i10 == sVar.K && str.equals(sVar.r)) {
            return;
        }
        b2.s sVar2 = this.l;
        b2.r rVar = sVar2 == null ? new b2.r() : sVar2.a();
        rVar.a = this.f;
        rVar.p = r0.n(this.e);
        rVar.q = r0.n(str);
        rVar.I = i11;
        rVar.J = i10;
        rVar.d = this.c;
        rVar.f = this.d;
        b2.s sVar3 = new b2.s(rVar);
        this.l = sVar3;
        this.g.b(sVar3);
    }

    @Override // j4.i
    public final void e(boolean z10) {
    }
}
