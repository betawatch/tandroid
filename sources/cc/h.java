package cc;

import java.lang.reflect.Array;
import org.telegram.messenger.qs;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class h extends g {
    public b e;

    @Override // cc.g
    public final b a() {
        b bVar = this.e;
        if (bVar != null) {
            return bVar;
        }
        bc.d dVar = this.a;
        int i7 = dVar.a;
        int i10 = dVar.b;
        if (i7 < 40 || i10 < 40) {
            this.e = super.a();
        } else {
            byte[] a10 = dVar.a();
            int i11 = i7 >> 3;
            if ((i7 & 7) != 0) {
                i11++;
            }
            int i12 = i10 >> 3;
            if ((i10 & 7) != 0) {
                i12++;
            }
            int i13 = i10 - 8;
            int i14 = i7 - 8;
            int i15 = 2;
            boolean z9 = true;
            int i16 = 0;
            int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i12, i11);
            int i17 = 0;
            while (true) {
                int i18 = 8;
                if (i17 >= i12) {
                    break;
                }
                int i19 = i17 << 3;
                if (i19 > i13) {
                    i19 = i13;
                }
                boolean z10 = z9;
                int i20 = i16;
                while (i20 < i11) {
                    int i21 = i20 << 3;
                    if (i21 > i14) {
                        i21 = i14;
                    }
                    int i22 = (i19 * i7) + i21;
                    int i23 = i15;
                    int i24 = qs.e4;
                    int i25 = 0;
                    int i26 = 0;
                    int i27 = 0;
                    while (i25 < i18) {
                        byte[] bArr = a10;
                        int i28 = i27;
                        int i29 = 0;
                        while (i29 < i18) {
                            int i30 = i29;
                            int i31 = bArr[i22 + i29] & 255;
                            i26 += i31;
                            if (i31 < i24) {
                                i24 = i31;
                            }
                            if (i31 > i28) {
                                i28 = i31;
                            }
                            i29 = i30 + 1;
                            i18 = 8;
                        }
                        if (i28 - i24 > 24) {
                            while (true) {
                                i25++;
                                i22 += i7;
                                if (i25 < 8) {
                                    int i32 = 0;
                                    for (int i33 = 8; i32 < i33; i33 = 8) {
                                        i26 += bArr[i22 + i32] & 255;
                                        i32++;
                                        i24 = i24;
                                    }
                                }
                            }
                        }
                        i25++;
                        i22 += i7;
                        i24 = i24;
                        a10 = bArr;
                        i18 = 8;
                        i27 = i28;
                    }
                    byte[] bArr2 = a10;
                    int i34 = i26 >> 6;
                    if (i27 - i24 <= 24) {
                        i34 = i24 / 2;
                        if (i17 > 0 && i20 > 0) {
                            int[] iArr2 = iArr[i17 - 1];
                            int i35 = i20 - 1;
                            int i36 = (((iArr[i17][i35] * 2) + iArr2[i20]) + iArr2[i35]) / 4;
                            if (i24 < i36) {
                                i34 = i36;
                            }
                        }
                    }
                    iArr[i17][i20] = i34;
                    i20++;
                    i15 = i23;
                    a10 = bArr2;
                    i18 = 8;
                }
                i17++;
                z9 = z10;
                i16 = 0;
            }
            byte[] bArr3 = a10;
            int i37 = i15;
            b bVar2 = new b(i7, i10);
            int i38 = 0;
            while (i38 < i12) {
                int i39 = i38 << 3;
                if (i39 > i13) {
                    i39 = i13;
                }
                int min = i38 < i37 ? 2 : Math.min(i38, i12 - 3);
                int i40 = 0;
                while (i40 < i11) {
                    int i41 = i40 << 3;
                    if (i41 > i14) {
                        i41 = i14;
                    }
                    int min2 = i40 < 2 ? 2 : Math.min(i40, i11 - 3);
                    int i42 = -2;
                    int i43 = 0;
                    for (int i44 = 2; i42 <= i44; i44 = 2) {
                        int[] iArr3 = iArr[min + i42];
                        i43 = iArr3[min2 - 2] + iArr3[min2 - 1] + iArr3[min2] + iArr3[min2 + 1] + iArr3[min2 + 2] + i43;
                        i42++;
                    }
                    int i45 = i43 / 25;
                    int i46 = (i39 * i7) + i41;
                    int i47 = i7;
                    int i48 = 0;
                    while (true) {
                        if (i48 < 8) {
                            int i49 = i38;
                            int i50 = 0;
                            for (int i51 = 8; i50 < i51; i51 = 8) {
                                int i52 = i50;
                                if ((bArr3[i46 + i50] & 255) <= i45) {
                                    bVar2.c(i41 + i52, i39 + i48);
                                }
                                i50 = i52 + 1;
                            }
                            i48++;
                            i46 += i47;
                            i38 = i49;
                        }
                    }
                    i40++;
                    i7 = i47;
                }
                i37 = 2;
                i38++;
            }
            this.e = bVar2;
        }
        return this.e;
    }
}
