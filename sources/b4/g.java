package b4;

import j3.m0;
import j3.n0;
import java.util.Arrays;
import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class g implements i {
    public final String b;
    public String c;
    public r3.v d;
    public int f;
    public int g;
    public long h;
    public n0 i;
    public int j;
    public final h5.w a = new h5.w(new byte[18]);
    public int e = 0;
    public long k = -9223372036854775807L;

    public g(String str) {
        this.b = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x026d  */
    @Override // b4.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(h5.w wVar) {
        char c3;
        char c10;
        int i10;
        byte b10;
        boolean z4;
        int i11;
        int i12;
        int i13;
        byte b11;
        int i14;
        byte b12;
        h5.v vVar;
        h5.a.j(this.d);
        while (wVar.a() > 0) {
            int i15 = this.e;
            int i16 = 8;
            int i17 = 2;
            h5.w wVar2 = this.a;
            if (i15 == 0) {
                while (wVar.a() > 0) {
                    int i18 = this.g << 8;
                    this.g = i18;
                    int u10 = i18 | wVar.u();
                    this.g = u10;
                    if (u10 == 2147385345 || u10 == -25230976 || u10 == 536864768 || u10 == -14745368) {
                        byte[] bArr = wVar2.a;
                        bArr[0] = (byte) ((u10 >> 24) & 255);
                        bArr[1] = (byte) ((u10 >> 16) & 255);
                        bArr[2] = (byte) ((u10 >> 8) & 255);
                        bArr[3] = (byte) (u10 & 255);
                        this.f = 4;
                        this.g = 0;
                        this.e = 1;
                        break;
                    }
                }
            } else if (i15 == 1) {
                byte[] bArr2 = wVar2.a;
                int min = Math.min(wVar.a(), 18 - this.f);
                wVar.e(this.f, min, bArr2);
                int i19 = this.f + min;
                this.f = i19;
                if (i19 == 18) {
                    byte[] bArr3 = wVar2.a;
                    if (this.i == null) {
                        String str = this.c;
                        c3 = 0;
                        if (bArr3[0] == Byte.MAX_VALUE) {
                            vVar = new h5.v(bArr3, bArr3.length);
                            c10 = '\b';
                        } else {
                            byte[] copyOf = Arrays.copyOf(bArr3, bArr3.length);
                            byte b13 = copyOf[0];
                            if (b13 == -2 || b13 == -1) {
                                for (int i20 = 0; i20 < copyOf.length - 1; i20 += 2) {
                                    byte b14 = copyOf[i20];
                                    int i21 = i20 + 1;
                                    copyOf[i20] = copyOf[i21];
                                    copyOf[i21] = b14;
                                }
                            }
                            h5.v vVar2 = new h5.v(copyOf, copyOf.length);
                            if (copyOf[0] == 31) {
                                h5.v vVar3 = new h5.v(copyOf, copyOf.length);
                                while (vVar3.b() >= 16) {
                                    vVar3.s(i17);
                                    int i22 = vVar3.i(14) & 16383;
                                    int min2 = Math.min(8 - vVar2.d, 14);
                                    int i23 = vVar2.d;
                                    int i24 = (8 - i23) - min2;
                                    byte[] bArr4 = vVar2.b;
                                    int i25 = vVar2.c;
                                    byte b15 = (byte) (bArr4[i25] & ((65280 >> i23) | ((1 << i24) - 1)));
                                    bArr4[i25] = b15;
                                    int i26 = 14 - min2;
                                    bArr4[i25] = (byte) (b15 | ((i22 >>> i26) << i24));
                                    int i27 = i25 + 1;
                                    while (i26 > i16) {
                                        vVar2.b[i27] = (byte) (i22 >>> (i26 - 8));
                                        i26 -= 8;
                                        i27++;
                                        i16 = 8;
                                    }
                                    byte[] bArr5 = vVar2.b;
                                    byte b16 = (byte) (bArr5[i27] & ((1 << r4) - 1));
                                    bArr5[i27] = b16;
                                    bArr5[i27] = (byte) (((i22 & ((1 << i26) - 1)) << (8 - i26)) | b16);
                                    vVar2.s(14);
                                    vVar2.a();
                                    i16 = 8;
                                    i17 = 2;
                                }
                            }
                            c10 = '\b';
                            vVar2.n(copyOf.length, copyOf);
                            vVar = vVar2;
                        }
                        vVar.s(60);
                        int i28 = l3.a.j[vVar.i(6)];
                        int i29 = l3.a.k[vVar.i(4)];
                        int i30 = vVar.i(5);
                        int i31 = i30 >= 29 ? -1 : (l3.a.l[i30] * MediaDataController.MAX_STYLE_RUNS_COUNT) / 2;
                        vVar.s(10);
                        int i32 = i28 + (vVar.i(2) > 0 ? 1 : 0);
                        m0 m0Var = new m0();
                        m0Var.a = str;
                        m0Var.o = "audio/vnd.dts";
                        m0Var.f = i31;
                        m0Var.B = i32;
                        m0Var.C = i29;
                        m0Var.r = null;
                        m0Var.c = this.b;
                        n0 n0Var = new n0(m0Var);
                        this.i = n0Var;
                        this.d.b(n0Var);
                    } else {
                        c3 = 0;
                        c10 = '\b';
                    }
                    byte b17 = bArr3[c3];
                    if (b17 != -2) {
                        if (b17 == -1) {
                            i14 = ((bArr3[7] & 3) << 12) | ((bArr3[6] & 255) << 4);
                            b12 = bArr3[9];
                        } else if (b17 != 31) {
                            i10 = ((bArr3[5] & 3) << 12) | ((bArr3[6] & 255) << 4);
                            b10 = bArr3[7];
                        } else {
                            i14 = ((bArr3[6] & 3) << 12) | ((bArr3[7] & 255) << 4);
                            b12 = bArr3[c10];
                        }
                        i11 = (i14 | ((b12 & 60) >> 2)) + 1;
                        z4 = true;
                        if (z4) {
                            i11 = (i11 * 16) / 14;
                        }
                        this.j = i11;
                        if (b17 == -2) {
                            if (b17 == -1) {
                                i12 = (bArr3[4] & 7) << 4;
                                b11 = bArr3[7];
                            } else if (b17 != 31) {
                                i12 = (bArr3[4] & 1) << 6;
                                i13 = bArr3[5] & 252;
                            } else {
                                i12 = (bArr3[5] & 7) << 4;
                                b11 = bArr3[6];
                            }
                            i13 = b11 & 60;
                        } else {
                            i12 = (bArr3[5] & 1) << 6;
                            i13 = bArr3[4] & 252;
                        }
                        this.h = (int) ((((((i13 >> 2) | i12) + 1) * 32) * 1000000) / this.i.Q);
                        wVar2.F(0);
                        this.d.d(18, wVar2);
                        this.e = 2;
                    } else {
                        i10 = ((bArr3[4] & 3) << 12) | ((bArr3[7] & 255) << 4);
                        b10 = bArr3[6];
                    }
                    i11 = (i10 | ((b10 & 240) >> 4)) + 1;
                    z4 = false;
                    if (z4) {
                    }
                    this.j = i11;
                    if (b17 == -2) {
                    }
                    this.h = (int) ((((((i13 >> 2) | i12) + 1) * 32) * 1000000) / this.i.Q);
                    wVar2.F(0);
                    this.d.d(18, wVar2);
                    this.e = 2;
                }
            } else {
                if (i15 != 2) {
                    throw new IllegalStateException();
                }
                int min3 = Math.min(wVar.a(), this.j - this.f);
                this.d.d(min3, wVar);
                int i33 = this.f + min3;
                this.f = i33;
                int i34 = this.j;
                if (i33 == i34) {
                    long j10 = this.k;
                    if (j10 != -9223372036854775807L) {
                        this.d.c(j10, 1, i34, 0, null);
                        this.k += this.h;
                    }
                    this.e = 0;
                }
            }
        }
    }

    @Override // b4.i
    public final void b() {
        this.e = 0;
        this.f = 0;
        this.g = 0;
        this.k = -9223372036854775807L;
    }

    @Override // b4.i
    public final void c(r3.m mVar, h0 h0Var) {
        h0Var.a();
        h0Var.b();
        this.c = h0Var.e;
        h0Var.b();
        this.d = mVar.i2(h0Var.d, 1);
    }

    @Override // b4.i
    public final void e(int i10, long j10) {
        if (j10 != -9223372036854775807L) {
            this.k = j10;
        }
    }

    @Override // b4.i
    public final void d() {
    }
}
