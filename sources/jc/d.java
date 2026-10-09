package jc;

import cc.k;
import java.util.Arrays;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public abstract class d {
    public static final int[][] a = {new int[]{1, 1, 1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1, 1, 1}};
    public static final int[][] b = {new int[]{1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 0, 1, 0, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1}};
    public static final int[][] c = {new int[]{-1, -1, -1, -1, -1, -1, -1}, new int[]{6, 18, -1, -1, -1, -1, -1}, new int[]{6, 22, -1, -1, -1, -1, -1}, new int[]{6, 26, -1, -1, -1, -1, -1}, new int[]{6, 30, -1, -1, -1, -1, -1}, new int[]{6, 34, -1, -1, -1, -1, -1}, new int[]{6, 22, 38, -1, -1, -1, -1}, new int[]{6, 24, 42, -1, -1, -1, -1}, new int[]{6, 26, 46, -1, -1, -1, -1}, new int[]{6, 28, 50, -1, -1, -1, -1}, new int[]{6, 30, 54, -1, -1, -1, -1}, new int[]{6, 32, 58, -1, -1, -1, -1}, new int[]{6, 34, 62, -1, -1, -1, -1}, new int[]{6, 26, 46, 66, -1, -1, -1}, new int[]{6, 26, 48, 70, -1, -1, -1}, new int[]{6, 26, 50, 74, -1, -1, -1}, new int[]{6, 30, 54, 78, -1, -1, -1}, new int[]{6, 30, 56, 82, -1, -1, -1}, new int[]{6, 30, 58, 86, -1, -1, -1}, new int[]{6, 34, 62, 90, -1, -1, -1}, new int[]{6, 28, 50, 72, 94, -1, -1}, new int[]{6, 26, 50, 74, 98, -1, -1}, new int[]{6, 30, 54, 78, 102, -1, -1}, new int[]{6, 28, 54, 80, 106, -1, -1}, new int[]{6, 32, 58, 84, 110, -1, -1}, new int[]{6, 30, 58, 86, 114, -1, -1}, new int[]{6, 34, 62, 90, 118, -1, -1}, new int[]{6, 26, 50, 74, 98, 122, -1}, new int[]{6, 30, 54, 78, 102, 126, -1}, new int[]{6, 26, 52, 78, 104, 130, -1}, new int[]{6, 30, 56, 82, 108, 134, -1}, new int[]{6, 34, 60, 86, 112, 138, -1}, new int[]{6, 30, 58, 86, 114, 142, -1}, new int[]{6, 34, 62, 90, 118, 146, -1}, new int[]{6, 30, 54, 78, 102, 126, ImageReceiver.DEFAULT_CROSSFADE_DURATION}, new int[]{6, 24, 50, 76, 102, 128, 154}, new int[]{6, 28, 54, 80, 106, 132, 158}, new int[]{6, 32, 58, 84, 110, 136, 162}, new int[]{6, 26, 54, 82, 110, 138, 166}, new int[]{6, 30, 58, 86, 114, 142, 170}};
    public static final int[][] d = {new int[]{8, 0}, new int[]{8, 1}, new int[]{8, 2}, new int[]{8, 3}, new int[]{8, 4}, new int[]{8, 5}, new int[]{8, 7}, new int[]{8, 8}, new int[]{7, 8}, new int[]{5, 8}, new int[]{4, 8}, new int[]{3, 8}, new int[]{2, 8}, new int[]{1, 8}, new int[]{0, 8}};

    public static int a(b bVar, boolean z10) {
        int i10 = bVar.b;
        int i11 = bVar.c;
        int i12 = z10 ? i11 : i10;
        if (!z10) {
            i10 = i11;
        }
        byte[][] bArr = bVar.a;
        int i13 = 0;
        for (int i14 = 0; i14 < i12; i14++) {
            byte b10 = -1;
            int i15 = 0;
            for (int i16 = 0; i16 < i10; i16++) {
                byte b11 = z10 ? bArr[i14][i16] : bArr[i16][i14];
                if (b11 == b10) {
                    i15++;
                } else {
                    if (i15 >= 5) {
                        i13 += i15 - 2;
                    }
                    i15 = 1;
                    b10 = b11;
                }
            }
            if (i15 >= 5) {
                i13 = (i15 - 2) + i13;
            }
        }
        return i13;
    }

    /* JADX WARN: Removed duplicated region for block: B:88:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0230  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void b(dc.a aVar, hc.c cVar, hc.f fVar, int i10, b bVar) {
        int i11;
        int i12;
        byte[][] bArr;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        byte[][] bArr2 = bVar.a;
        int i21 = bVar.b;
        int i22 = bVar.c;
        for (byte[] bArr3 : bArr2) {
            Arrays.fill(bArr3, (byte) -1);
        }
        int length = a[0].length;
        e(0, 0, bVar);
        int i23 = i21 - length;
        e(i23, 0, bVar);
        e(0, i23, bVar);
        d(0, 7, bVar);
        int i24 = i21 - 8;
        d(i24, 7, bVar);
        d(0, i24, bVar);
        f(7, 0, bVar);
        int i25 = i22 - 8;
        f(i25, 0, bVar);
        int i26 = i22 - 7;
        f(7, i26, bVar);
        if (bVar.a(8, i25) == 0) {
            throw new k();
        }
        bVar.b(8, i25, 1);
        int i27 = fVar.a;
        if (i27 < 2) {
            i11 = 0;
            i12 = 1;
        } else {
            i11 = 0;
            int[] iArr = c[i27 - 1];
            i12 = 1;
            int length2 = iArr.length;
            int i28 = 0;
            while (i28 < length2) {
                int i29 = iArr[i28];
                if (i29 >= 0) {
                    int length3 = iArr.length;
                    int i30 = 0;
                    while (i30 < length3) {
                        int i31 = iArr[i30];
                        if (i31 >= 0 && g(bVar.a(i31, i29))) {
                            int i32 = i31 - 2;
                            int i33 = i29 - 2;
                            bArr = bArr2;
                            i13 = i21;
                            int i34 = 0;
                            while (true) {
                                if (i34 >= 5) {
                                    break;
                                }
                                int[] iArr2 = b[i34];
                                int i35 = i34;
                                int i36 = 0;
                                for (int i37 = 5; i36 < i37; i37 = 5) {
                                    int i38 = i36;
                                    bVar.b(i32 + i36, i33 + i35, iArr2[i38]);
                                    i36 = i38 + 1;
                                    length3 = length3;
                                }
                                i34 = i35 + 1;
                            }
                        } else {
                            bArr = bArr2;
                            i13 = i21;
                        }
                        i30++;
                        bArr2 = bArr;
                        i21 = i13;
                        length3 = length3;
                    }
                }
                i28++;
                bArr2 = bArr2;
                i21 = i21;
            }
        }
        byte[][] bArr4 = bArr2;
        int i39 = i21;
        int i40 = 8;
        while (i40 < i24) {
            int i41 = i40 + 1;
            int i42 = i41 % 2;
            if (g(bVar.a(i40, 6))) {
                bVar.b(i40, 6, i42);
            }
            if (g(bVar.a(6, i40))) {
                bVar.b(6, i40, i42);
            }
            i40 = i41;
        }
        dc.a aVar2 = new dc.a();
        if (i10 < 0 || i10 >= 8) {
            throw new k("Invalid mask pattern");
        }
        int i43 = (cVar.a << 3) | i10;
        aVar2.b(i43, 5);
        aVar2.b(c(i43, 1335), 10);
        dc.a aVar3 = new dc.a();
        aVar3.b(21522, 15);
        if (aVar2.b != aVar3.b) {
            throw new IllegalArgumentException("Sizes don't match");
        }
        int i44 = i11;
        while (true) {
            int[] iArr3 = aVar2.a;
            if (i44 >= iArr3.length) {
                break;
            }
            iArr3[i44] = iArr3[i44] ^ aVar3.a[i44];
            i44++;
        }
        if (aVar2.b != 15) {
            throw new k("should not happen but we got: " + aVar2.b);
        }
        int i45 = i11;
        while (true) {
            int i46 = aVar2.b;
            if (i45 >= i46) {
                break;
            }
            boolean d10 = aVar2.d((i46 - 1) - i45);
            int[] iArr4 = d[i45];
            int i47 = iArr4[i11];
            byte[] bArr5 = bArr4[iArr4[i12]];
            byte b10 = d10 ? (byte) 1 : (byte) 0;
            bArr5[i47] = b10;
            if (i45 < 8) {
                i20 = (i39 - i45) - 1;
                i19 = 8;
            } else {
                i19 = (i45 - 8) + i26;
                i20 = 8;
            }
            bArr4[i19][i20] = b10;
            i45++;
        }
        if (i27 >= 7) {
            dc.a aVar4 = new dc.a();
            aVar4.b(i27, 6);
            aVar4.b(c(i27, 7973), 12);
            if (aVar4.b != 18) {
                throw new k("should not happen but we got: " + aVar4.b);
            }
            int i48 = 17;
            for (int i49 = i11; i49 < 6; i49++) {
                for (int i50 = i11; i50 < 3; i50++) {
                    boolean d11 = aVar4.d(i48);
                    i48--;
                    int i51 = (i22 - 11) + i50;
                    byte[] bArr6 = bArr4[i51];
                    byte b11 = d11 ? (byte) 1 : (byte) 0;
                    bArr6[i49] = b11;
                    bArr4[i49][i51] = b11;
                }
            }
        }
        int i52 = i39 - 1;
        int i53 = i22 - 1;
        int i54 = i11;
        int i55 = -1;
        while (i52 > 0) {
            if (i52 == 6) {
                i52--;
            }
            while (i53 >= 0 && i53 < i22) {
                for (int i56 = i11; i56 < 2; i56++) {
                    int i57 = i52 - i56;
                    if (g(bVar.a(i57, i53))) {
                        if (i54 < aVar.b) {
                            boolean d12 = aVar.d(i54);
                            i54++;
                            i14 = d12;
                        } else {
                            i14 = i11;
                        }
                        if (i10 != -1) {
                            switch (i10) {
                                case 0:
                                    i15 = i53 + i57;
                                    i16 = i15 & 1;
                                    if ((i16 != 0 ? i12 : i11) != 0) {
                                        i14 = ~i14;
                                        break;
                                    }
                                    break;
                                case 1:
                                    i16 = i53 & 1;
                                    if ((i16 != 0 ? i12 : i11) != 0) {
                                    }
                                    break;
                                case 2:
                                    i16 = i57 % 3;
                                    if ((i16 != 0 ? i12 : i11) != 0) {
                                    }
                                    break;
                                case 3:
                                    i16 = (i53 + i57) % 3;
                                    if ((i16 != 0 ? i12 : i11) != 0) {
                                    }
                                    break;
                                case 4:
                                    i16 = ((i57 / 3) + (i53 / 2)) & 1;
                                    if ((i16 != 0 ? i12 : i11) != 0) {
                                    }
                                    break;
                                case 5:
                                    int i58 = i53 * i57;
                                    i16 = (i58 % 3) + (i58 & 1);
                                    if ((i16 != 0 ? i12 : i11) != 0) {
                                    }
                                    break;
                                case 6:
                                    int i59 = i53 * i57;
                                    i17 = i59 & 1;
                                    i18 = i59 % 3;
                                    i15 = i18 + i17;
                                    i16 = i15 & 1;
                                    if ((i16 != 0 ? i12 : i11) != 0) {
                                    }
                                    break;
                                case 7:
                                    i18 = (i53 * i57) % 3;
                                    i17 = (i53 + i57) & 1;
                                    i15 = i18 + i17;
                                    i16 = i15 & 1;
                                    if ((i16 != 0 ? i12 : i11) != 0) {
                                    }
                                    break;
                                default:
                                    throw new IllegalArgumentException(hg.c.h(i10, "Invalid mask pattern: "));
                            }
                        }
                        bArr4[i53][i57] = (byte) i14;
                    }
                }
                i53 += i55;
            }
            i55 = -i55;
            i53 += i55;
            i52 -= 2;
        }
        if (i54 == aVar.b) {
            return;
        }
        throw new k("Not all bits consumed: " + i54 + '/' + aVar.b);
    }

    public static int c(int i10, int i11) {
        if (i11 == 0) {
            throw new IllegalArgumentException("0 polynomial");
        }
        int numberOfLeadingZeros = Integer.numberOfLeadingZeros(i11);
        int i12 = 32 - numberOfLeadingZeros;
        int i13 = i10 << (31 - numberOfLeadingZeros);
        while (32 - Integer.numberOfLeadingZeros(i13) >= i12) {
            i13 ^= i11 << ((32 - Integer.numberOfLeadingZeros(i13)) - i12);
        }
        return i13;
    }

    public static void d(int i10, int i11, b bVar) {
        for (int i12 = 0; i12 < 8; i12++) {
            int i13 = i10 + i12;
            if (!g(bVar.a(i13, i11))) {
                throw new k();
            }
            bVar.b(i13, i11, 0);
        }
    }

    public static void e(int i10, int i11, b bVar) {
        for (int i12 = 0; i12 < 7; i12++) {
            int[] iArr = a[i12];
            for (int i13 = 0; i13 < 7; i13++) {
                bVar.b(i10 + i13, i11 + i12, iArr[i13]);
            }
        }
    }

    public static void f(int i10, int i11, b bVar) {
        for (int i12 = 0; i12 < 7; i12++) {
            int i13 = i11 + i12;
            if (!g(bVar.a(i10, i13))) {
                throw new k();
            }
            bVar.b(i10, i13, 0);
        }
    }

    public static boolean g(int i10) {
        return i10 == -1;
    }
}
