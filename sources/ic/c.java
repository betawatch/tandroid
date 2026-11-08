package ic;

import ab.a0;
import java.util.Arrays;
import jg.g;
import org.telegram.messenger.qs;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public abstract class c {
    public static final int[][] a = {new int[]{1, 1, 1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1, 1, 1}};
    public static final int[][] b = {new int[]{1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 0, 1, 0, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1}};
    public static final int[][] c = {new int[]{-1, -1, -1, -1, -1, -1, -1}, new int[]{6, 18, -1, -1, -1, -1, -1}, new int[]{6, 22, -1, -1, -1, -1, -1}, new int[]{6, 26, -1, -1, -1, -1, -1}, new int[]{6, 30, -1, -1, -1, -1, -1}, new int[]{6, 34, -1, -1, -1, -1, -1}, new int[]{6, 22, 38, -1, -1, -1, -1}, new int[]{6, 24, 42, -1, -1, -1, -1}, new int[]{6, 26, 46, -1, -1, -1, -1}, new int[]{6, 28, 50, -1, -1, -1, -1}, new int[]{6, 30, 54, -1, -1, -1, -1}, new int[]{6, 32, 58, -1, -1, -1, -1}, new int[]{6, 34, 62, -1, -1, -1, -1}, new int[]{6, 26, 46, 66, -1, -1, -1}, new int[]{6, 26, 48, 70, -1, -1, -1}, new int[]{6, 26, 50, 74, -1, -1, -1}, new int[]{6, 30, 54, 78, -1, -1, -1}, new int[]{6, 30, 56, 82, -1, -1, -1}, new int[]{6, 30, 58, 86, -1, -1, -1}, new int[]{6, 34, 62, 90, -1, -1, -1}, new int[]{6, 28, 50, 72, 94, -1, -1}, new int[]{6, 26, 50, 74, 98, -1, -1}, new int[]{6, 30, 54, 78, qs.n1, -1, -1}, new int[]{6, 28, 54, 80, qs.r1, -1, -1}, new int[]{6, 32, 58, 84, qs.v1, -1, -1}, new int[]{6, 30, 58, 86, qs.z1, -1, -1}, new int[]{6, 34, 62, 90, qs.D1, -1, -1}, new int[]{6, 26, 50, 74, 98, qs.G1, -1}, new int[]{6, 30, 54, 78, qs.n1, qs.K1, -1}, new int[]{6, 26, 52, 78, qs.p1, qs.O1, -1}, new int[]{6, 30, 56, 82, qs.t1, 134, -1}, new int[]{6, 34, 60, 86, qs.x1, qs.U1, -1}, new int[]{6, 30, 58, 86, qs.z1, qs.Y1, -1}, new int[]{6, 34, 62, 90, qs.D1, qs.c2, -1}, new int[]{6, 30, 54, 78, qs.n1, qs.K1, qs.g2}, new int[]{6, 24, 50, 76, qs.n1, 128, qs.k2}, new int[]{6, 28, 54, 80, qs.r1, qs.Q1, qs.o2}, new int[]{6, 32, 58, 84, qs.v1, qs.S1, qs.s2}, new int[]{6, 26, 54, 82, qs.v1, qs.U1, qs.w2}, new int[]{6, 30, 58, 86, qs.z1, qs.Y1, qs.A2}};
    public static final int[][] d = {new int[]{8, 0}, new int[]{8, 1}, new int[]{8, 2}, new int[]{8, 3}, new int[]{8, 4}, new int[]{8, 5}, new int[]{8, 7}, new int[]{8, 8}, new int[]{7, 8}, new int[]{5, 8}, new int[]{4, 8}, new int[]{3, 8}, new int[]{2, 8}, new int[]{1, 8}, new int[]{0, 8}};

    public static int a(cc.c cVar, boolean z9) {
        int i7 = cVar.b;
        int i10 = cVar.c;
        int i11 = z9 ? i10 : i7;
        if (!z9) {
            i7 = i10;
        }
        byte[][] bArr = (byte[][]) cVar.d;
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            byte b10 = -1;
            int i14 = 0;
            for (int i15 = 0; i15 < i7; i15++) {
                byte b11 = z9 ? bArr[i13][i15] : bArr[i15][i13];
                if (b11 == b10) {
                    i14++;
                } else {
                    if (i14 >= 5) {
                        i12 += i14 - 2;
                    }
                    i14 = 1;
                    b10 = b11;
                }
            }
            if (i14 >= 5) {
                i12 = (i14 - 2) + i12;
            }
        }
        return i12;
    }

    /* JADX WARN: Removed duplicated region for block: B:88:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0231  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void b(cc.a aVar, gc.b bVar, gc.e eVar, int i7, cc.c cVar) {
        int i10;
        int i11;
        byte[][] bArr;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        byte[][] bArr2 = (byte[][]) cVar.d;
        int i20 = cVar.b;
        int i21 = cVar.c;
        for (byte[] bArr3 : bArr2) {
            Arrays.fill(bArr3, (byte) -1);
        }
        int length = a[0].length;
        e(0, 0, cVar);
        int i22 = i20 - length;
        e(i22, 0, cVar);
        e(0, i22, cVar);
        d(0, 7, cVar);
        int i23 = i20 - 8;
        d(i23, 7, cVar);
        d(0, i23, cVar);
        f(7, 0, cVar);
        int i24 = i21 - 8;
        f(i24, 0, cVar);
        int i25 = i21 - 7;
        f(7, i25, cVar);
        if (cVar.e(8, i24) == 0) {
            throw new a0();
        }
        cVar.g(8, i24, 1);
        int i26 = eVar.a;
        if (i26 < 2) {
            i10 = 0;
            i11 = 1;
        } else {
            i10 = 0;
            int[] iArr = c[i26 - 1];
            i11 = 1;
            int length2 = iArr.length;
            int i27 = 0;
            while (i27 < length2) {
                int i28 = iArr[i27];
                if (i28 >= 0) {
                    int length3 = iArr.length;
                    int i29 = 0;
                    while (i29 < length3) {
                        int i30 = iArr[i29];
                        if (i30 >= 0 && g(cVar.e(i30, i28))) {
                            int i31 = i30 - 2;
                            int i32 = i28 - 2;
                            bArr = bArr2;
                            i12 = i20;
                            int i33 = 0;
                            while (true) {
                                if (i33 >= 5) {
                                    break;
                                }
                                int[] iArr2 = b[i33];
                                int i34 = i33;
                                int i35 = 0;
                                for (int i36 = 5; i35 < i36; i36 = 5) {
                                    int i37 = i35;
                                    cVar.g(i31 + i35, i32 + i34, iArr2[i37]);
                                    i35 = i37 + 1;
                                    length3 = length3;
                                }
                                i33 = i34 + 1;
                            }
                        } else {
                            bArr = bArr2;
                            i12 = i20;
                        }
                        i29++;
                        bArr2 = bArr;
                        i20 = i12;
                        length3 = length3;
                    }
                }
                i27++;
                bArr2 = bArr2;
                i20 = i20;
            }
        }
        byte[][] bArr4 = bArr2;
        int i38 = i20;
        int i39 = 8;
        while (i39 < i23) {
            int i40 = i39 + 1;
            int i41 = i40 % 2;
            if (g(cVar.e(i39, 6))) {
                cVar.g(i39, 6, i41);
            }
            if (g(cVar.e(6, i39))) {
                cVar.g(6, i39, i41);
            }
            i39 = i40;
        }
        cc.a aVar2 = new cc.a();
        if (i7 < 0 || i7 >= 8) {
            throw new a0("Invalid mask pattern");
        }
        int i42 = (bVar.a << 3) | i7;
        aVar2.b(i42, 5);
        aVar2.b(c(i42, 1335), 10);
        cc.a aVar3 = new cc.a();
        aVar3.b(21522, 15);
        if (aVar2.b != aVar3.b) {
            throw new IllegalArgumentException("Sizes don't match");
        }
        int i43 = i10;
        while (true) {
            int[] iArr3 = aVar2.a;
            if (i43 >= iArr3.length) {
                break;
            }
            iArr3[i43] = iArr3[i43] ^ aVar3.a[i43];
            i43++;
        }
        if (aVar2.b != 15) {
            throw new a0("should not happen but we got: " + aVar2.b);
        }
        int i44 = i10;
        while (true) {
            int i45 = aVar2.b;
            if (i44 >= i45) {
                break;
            }
            boolean d2 = aVar2.d((i45 - 1) - i44);
            int[] iArr4 = d[i44];
            int i46 = iArr4[i10];
            byte[] bArr5 = bArr4[iArr4[i11]];
            byte b10 = d2 ? (byte) 1 : (byte) 0;
            bArr5[i46] = b10;
            if (i44 < 8) {
                i19 = (i38 - i44) - 1;
                i18 = 8;
            } else {
                i18 = (i44 - 8) + i25;
                i19 = 8;
            }
            bArr4[i18][i19] = b10;
            i44++;
        }
        if (i26 >= 7) {
            cc.a aVar4 = new cc.a();
            aVar4.b(i26, 6);
            aVar4.b(c(i26, 7973), 12);
            if (aVar4.b != 18) {
                throw new a0("should not happen but we got: " + aVar4.b);
            }
            int i47 = 17;
            for (int i48 = i10; i48 < 6; i48++) {
                for (int i49 = i10; i49 < 3; i49++) {
                    boolean d10 = aVar4.d(i47);
                    i47--;
                    int i50 = (i21 - 11) + i49;
                    byte[] bArr6 = bArr4[i50];
                    byte b11 = d10 ? (byte) 1 : (byte) 0;
                    bArr6[i48] = b11;
                    bArr4[i48][i50] = b11;
                }
            }
        }
        int i51 = i38 - 1;
        int i52 = i21 - 1;
        int i53 = i10;
        int i54 = -1;
        while (i51 > 0) {
            if (i51 == 6) {
                i51--;
            }
            while (i52 >= 0 && i52 < i21) {
                for (int i55 = i10; i55 < 2; i55++) {
                    int i56 = i51 - i55;
                    if (g(cVar.e(i56, i52))) {
                        if (i53 < aVar.b) {
                            boolean d11 = aVar.d(i53);
                            i53++;
                            i13 = d11;
                        } else {
                            i13 = i10;
                        }
                        if (i7 != -1) {
                            switch (i7) {
                                case 0:
                                    i14 = i52 + i56;
                                    i15 = i14 & 1;
                                    if ((i15 != 0 ? i11 : i10) != 0) {
                                        i13 = ~i13;
                                        break;
                                    }
                                    break;
                                case 1:
                                    i15 = i52 & 1;
                                    if ((i15 != 0 ? i11 : i10) != 0) {
                                    }
                                    break;
                                case 2:
                                    i15 = i56 % 3;
                                    if ((i15 != 0 ? i11 : i10) != 0) {
                                    }
                                    break;
                                case 3:
                                    i15 = (i52 + i56) % 3;
                                    if ((i15 != 0 ? i11 : i10) != 0) {
                                    }
                                    break;
                                case 4:
                                    i15 = ((i56 / 3) + (i52 / 2)) & 1;
                                    if ((i15 != 0 ? i11 : i10) != 0) {
                                    }
                                    break;
                                case 5:
                                    int i57 = i52 * i56;
                                    i15 = (i57 % 3) + (i57 & 1);
                                    if ((i15 != 0 ? i11 : i10) != 0) {
                                    }
                                    break;
                                case 6:
                                    int i58 = i52 * i56;
                                    i16 = i58 & 1;
                                    i17 = i58 % 3;
                                    i14 = i17 + i16;
                                    i15 = i14 & 1;
                                    if ((i15 != 0 ? i11 : i10) != 0) {
                                    }
                                    break;
                                case 7:
                                    i17 = (i52 * i56) % 3;
                                    i16 = (i52 + i56) & 1;
                                    i14 = i17 + i16;
                                    i15 = i14 & 1;
                                    if ((i15 != 0 ? i11 : i10) != 0) {
                                    }
                                    break;
                                default:
                                    throw new IllegalArgumentException(g.j(i7, "Invalid mask pattern: "));
                            }
                        }
                        bArr4[i52][i56] = (byte) i13;
                    }
                }
                i52 += i54;
            }
            i54 = -i54;
            i52 += i54;
            i51 -= 2;
        }
        if (i53 == aVar.b) {
            return;
        }
        throw new a0("Not all bits consumed: " + i53 + '/' + aVar.b);
    }

    public static int c(int i7, int i10) {
        if (i10 == 0) {
            throw new IllegalArgumentException("0 polynomial");
        }
        int numberOfLeadingZeros = Integer.numberOfLeadingZeros(i10);
        int i11 = 32 - numberOfLeadingZeros;
        int i12 = i7 << (31 - numberOfLeadingZeros);
        while (32 - Integer.numberOfLeadingZeros(i12) >= i11) {
            i12 ^= i10 << ((32 - Integer.numberOfLeadingZeros(i12)) - i11);
        }
        return i12;
    }

    public static void d(int i7, int i10, cc.c cVar) {
        for (int i11 = 0; i11 < 8; i11++) {
            int i12 = i7 + i11;
            if (!g(cVar.e(i12, i10))) {
                throw new a0();
            }
            cVar.g(i12, i10, 0);
        }
    }

    public static void e(int i7, int i10, cc.c cVar) {
        for (int i11 = 0; i11 < 7; i11++) {
            int[] iArr = a[i11];
            for (int i12 = 0; i12 < 7; i12++) {
                cVar.g(i7 + i12, i10 + i11, iArr[i12]);
            }
        }
    }

    public static void f(int i7, int i10, cc.c cVar) {
        for (int i11 = 0; i11 < 7; i11++) {
            int i12 = i10 + i11;
            if (!g(cVar.e(i7, i12))) {
                throw new a0();
            }
            cVar.g(i7, i12, 0);
        }
    }

    public static boolean g(int i7) {
        return i7 == -1;
    }
}
