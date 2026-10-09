package ic;

import com.google.android.gms.internal.vision.e2;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class e {
    public static final d e = new d();
    public final dc.b a;
    public boolean c;
    public final ArrayList b = new ArrayList();
    public final int[] d = new int[5];

    public e(dc.b bVar) {
        this.a = bVar;
    }

    public static float a(int i10, int[] iArr) {
        return ((i10 - iArr[4]) - iArr[3]) - (iArr[2] / 2.0f);
    }

    public static boolean b(int[] iArr) {
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i10 < 5) {
                int i12 = iArr[i10];
                if (i12 == 0) {
                    break;
                }
                i11 += i12;
                i10++;
            } else if (i11 >= 7) {
                float f7 = i11 / 7.0f;
                float f10 = f7 / 2.0f;
                if (Math.abs(f7 - iArr[0]) >= f10 || Math.abs(f7 - iArr[1]) >= f10 || Math.abs((f7 * 3.0f) - iArr[2]) >= 3.0f * f10 || Math.abs(f7 - iArr[3]) >= f10 || Math.abs(f7 - iArr[4]) >= f10) {
                    break;
                }
                return true;
            }
        }
        return false;
    }

    public static double e(c cVar, c cVar2) {
        double d = cVar.a - cVar2.a;
        double d10 = cVar.b - cVar2.b;
        return (d10 * d10) + (d * d);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c(int i10, int i11, int[] iArr) {
        char c10;
        float a2;
        char c11;
        boolean z10;
        ArrayList arrayList;
        c cVar;
        float f7;
        float f10;
        int i12;
        int i13;
        int i14;
        boolean z11 = false;
        char c12 = 2;
        char c13 = 3;
        int i15 = iArr[0] + iArr[1] + iArr[2] + iArr[3] + iArr[4];
        int a10 = (int) a(i11, iArr);
        int i16 = iArr[2];
        dc.b bVar = this.a;
        int i17 = bVar.b;
        int i18 = bVar.a;
        int[] iArr2 = this.d;
        Arrays.fill(iArr2, 0);
        int i19 = i10;
        while (i19 >= 0 && bVar.b(a10, i19)) {
            iArr2[2] = iArr2[2] + 1;
            i19--;
        }
        float f11 = Float.NaN;
        if (i19 < 0) {
            c10 = 2;
        } else {
            while (i19 >= 0 && !bVar.b(a10, i19)) {
                c10 = c12;
                int i20 = iArr2[1];
                if (i20 > i16) {
                    break;
                }
                iArr2[1] = i20 + 1;
                i19--;
                c12 = c10;
            }
            c10 = c12;
            if (i19 >= 0 && iArr2[1] <= i16) {
                while (i19 >= 0 && bVar.b(a10, i19)) {
                    int i21 = iArr2[0];
                    if (i21 > i16) {
                        break;
                    }
                    iArr2[0] = i21 + 1;
                    i19--;
                }
                if (iArr2[0] <= i16) {
                    int i22 = i10 + 1;
                    while (i22 < i17 && bVar.b(a10, i22)) {
                        iArr2[c10] = iArr2[c10] + 1;
                        i22++;
                    }
                    if (i22 != i17) {
                        while (i22 < i17 && !bVar.b(a10, i22)) {
                            int i23 = iArr2[3];
                            if (i23 >= i16) {
                                break;
                            }
                            iArr2[3] = i23 + 1;
                            i22++;
                        }
                        if (i22 != i17 && iArr2[3] < i16) {
                            while (i22 < i17 && bVar.b(a10, i22)) {
                                int i24 = iArr2[4];
                                if (i24 >= i16) {
                                    break;
                                }
                                iArr2[4] = i24 + 1;
                                i22++;
                            }
                            int i25 = iArr2[4];
                            if (i25 < i16 && Math.abs(((((iArr2[0] + iArr2[1]) + iArr2[c10]) + iArr2[3]) + i25) - i15) * 5 < i15 * 2 && b(iArr2)) {
                                a2 = a(i22, iArr2);
                                if (!Float.isNaN(a2)) {
                                    int i26 = (int) a2;
                                    int i27 = iArr[c10];
                                    Arrays.fill(iArr2, 0);
                                    int i28 = a10;
                                    while (i28 >= 0 && bVar.b(i28, i26)) {
                                        iArr2[c10] = iArr2[c10] + 1;
                                        i28--;
                                    }
                                    if (i28 < 0) {
                                        c11 = 3;
                                    } else {
                                        while (i28 >= 0 && !bVar.b(i28, i26)) {
                                            c11 = c13;
                                            int i29 = iArr2[1];
                                            if (i29 > i27) {
                                                break;
                                            }
                                            iArr2[1] = i29 + 1;
                                            i28--;
                                            c13 = c11;
                                        }
                                        c11 = c13;
                                        if (i28 >= 0 && iArr2[1] <= i27) {
                                            while (i28 >= 0 && bVar.b(i28, i26)) {
                                                int i30 = iArr2[0];
                                                if (i30 > i27) {
                                                    break;
                                                }
                                                iArr2[0] = i30 + 1;
                                                i28--;
                                            }
                                            if (iArr2[0] <= i27) {
                                                int i31 = a10 + 1;
                                                while (i31 < i18 && bVar.b(i31, i26)) {
                                                    iArr2[c10] = iArr2[c10] + 1;
                                                    i31++;
                                                }
                                                if (i31 != i18) {
                                                    while (i31 < i18 && !bVar.b(i31, i26)) {
                                                        int i32 = iArr2[c11];
                                                        if (i32 >= i27) {
                                                            break;
                                                        }
                                                        iArr2[c11] = i32 + 1;
                                                        i31++;
                                                    }
                                                    if (i31 != i18 && iArr2[c11] < i27) {
                                                        while (i31 < i18 && bVar.b(i31, i26)) {
                                                            int i33 = iArr2[4];
                                                            if (i33 >= i27) {
                                                                break;
                                                            }
                                                            iArr2[4] = i33 + 1;
                                                            i31++;
                                                        }
                                                        int i34 = iArr2[4];
                                                        if (i34 < i27 && Math.abs(((((iArr2[0] + iArr2[1]) + iArr2[c10]) + iArr2[c11]) + i34) - i15) * 5 < i15 && b(iArr2)) {
                                                            f11 = a(i31, iArr2);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    if (!Float.isNaN(f11)) {
                                        int i35 = (int) f11;
                                        Arrays.fill(iArr2, 0);
                                        int i36 = 0;
                                        while (i26 >= i36 && i35 >= i36 && bVar.b(i35 - i36, i26 - i36)) {
                                            iArr2[c10] = iArr2[c10] + 1;
                                            i36++;
                                        }
                                        if (iArr2[c10] != 0) {
                                            while (i26 >= i36 && i35 >= i36 && !bVar.b(i35 - i36, i26 - i36)) {
                                                iArr2[1] = iArr2[1] + 1;
                                                i36++;
                                            }
                                            if (iArr2[1] != 0) {
                                                while (i26 >= i36 && i35 >= i36 && bVar.b(i35 - i36, i26 - i36)) {
                                                    iArr2[0] = iArr2[0] + 1;
                                                    i36++;
                                                }
                                                if (iArr2[0] != 0) {
                                                    int i37 = bVar.b;
                                                    int i38 = 1;
                                                    while (true) {
                                                        int i39 = i26 + i38;
                                                        z10 = z11;
                                                        if (i39 >= i37 || (i14 = i35 + i38) >= i18 || !bVar.b(i14, i39)) {
                                                            break;
                                                        }
                                                        iArr2[c10] = iArr2[c10] + 1;
                                                        i38++;
                                                        z11 = z10 ? 1 : 0;
                                                    }
                                                    while (true) {
                                                        int i40 = i26 + i38;
                                                        if (i40 >= i37 || (i13 = i35 + i38) >= i18 || bVar.b(i13, i40)) {
                                                            break;
                                                        }
                                                        iArr2[c11] = iArr2[c11] + 1;
                                                        i38++;
                                                    }
                                                    if (iArr2[c11] == 0) {
                                                        return z10;
                                                    }
                                                    while (true) {
                                                        int i41 = i26 + i38;
                                                        if (i41 >= i37 || (i12 = i35 + i38) >= i18 || !bVar.b(i12, i41)) {
                                                            break;
                                                        }
                                                        iArr2[4] = iArr2[4] + 1;
                                                        i38++;
                                                    }
                                                    if (iArr2[4] == 0) {
                                                        return z10;
                                                    }
                                                    int i42 = z10 ? 1 : 0;
                                                    int i43 = i42;
                                                    while (i42 < 5) {
                                                        int i44 = iArr2[i42];
                                                        if (i44 == 0) {
                                                            return z10;
                                                        }
                                                        i43 += i44;
                                                        i42++;
                                                    }
                                                    if (i43 < 7) {
                                                        return z10;
                                                    }
                                                    float f12 = i43 / 7.0f;
                                                    float f13 = f12 / 1.333f;
                                                    if (Math.abs(f12 - iArr2[z10 ? 1 : 0]) >= f13 || Math.abs(f12 - iArr2[1]) >= f13 || Math.abs((f12 * 3.0f) - iArr2[c10]) >= 3.0f * f13 || Math.abs(f12 - iArr2[c11]) >= f13 || Math.abs(f12 - iArr2[4]) >= f13) {
                                                        return z10;
                                                    }
                                                    float f14 = i15 / 7.0f;
                                                    int i45 = z10 ? 1 : 0;
                                                    while (true) {
                                                        arrayList = this.b;
                                                        if (i45 >= arrayList.size()) {
                                                            arrayList.add(new c(f11, a2, f14, 1));
                                                            return true;
                                                        }
                                                        cVar = (c) arrayList.get(i45);
                                                        float f15 = cVar.c;
                                                        f7 = cVar.a;
                                                        f10 = cVar.b;
                                                        if (Math.abs(a2 - f10) <= f14 && Math.abs(f11 - f7) <= f14) {
                                                            float abs = Math.abs(f14 - f15);
                                                            if (abs <= 1.0f || abs <= f15) {
                                                                break;
                                                            }
                                                        }
                                                        i45++;
                                                    }
                                                    int i46 = cVar.d;
                                                    int i47 = i46 + 1;
                                                    float f16 = i46;
                                                    float f17 = i47;
                                                    arrayList.set(i45, new c(((f7 * f16) + f11) / f17, e2.x(f16, f10, a2, f17), e2.x(f16, cVar.c, f14, f17), i47));
                                                    return true;
                                                }
                                            }
                                        }
                                    }
                                }
                                return false;
                            }
                        }
                    }
                }
            }
        }
        a2 = Float.NaN;
        if (!Float.isNaN(a2)) {
        }
        return false;
    }

    public final boolean d() {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int size2 = arrayList.size();
        float f7 = 0.0f;
        int i10 = 0;
        int i11 = 0;
        float f10 = 0.0f;
        while (i11 < size2) {
            Object obj = arrayList.get(i11);
            i11++;
            c cVar = (c) obj;
            if (cVar.d >= 2) {
                i10++;
                f10 += cVar.c;
            }
        }
        if (i10 >= 3) {
            float f11 = f10 / size;
            int size3 = arrayList.size();
            int i12 = 0;
            while (i12 < size3) {
                Object obj2 = arrayList.get(i12);
                i12++;
                f7 += Math.abs(((c) obj2).c - f11);
            }
            if (f7 <= f10 * 0.05f) {
                return true;
            }
        }
        return false;
    }
}
