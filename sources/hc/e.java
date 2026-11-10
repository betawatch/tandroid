package hc;

import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class e {
    public static final d e = new d();
    public final cc.b a;
    public boolean c;
    public final ArrayList b = new ArrayList();
    public final int[] d = new int[5];

    public e(cc.b bVar) {
        this.a = bVar;
    }

    public static float a(int[] iArr, int i7) {
        return ((i7 - iArr[4]) - iArr[3]) - (iArr[2] / 2.0f);
    }

    public static boolean b(int[] iArr) {
        int i7 = 0;
        int i10 = 0;
        while (true) {
            if (i7 < 5) {
                int i11 = iArr[i7];
                if (i11 == 0) {
                    break;
                }
                i10 += i11;
                i7++;
            } else if (i10 >= 7) {
                float f10 = i10 / 7.0f;
                float f11 = f10 / 2.0f;
                if (Math.abs(f10 - iArr[0]) >= f11 || Math.abs(f10 - iArr[1]) >= f11 || Math.abs((f10 * 3.0f) - iArr[2]) >= 3.0f * f11 || Math.abs(f10 - iArr[3]) >= f11 || Math.abs(f10 - iArr[4]) >= f11) {
                    break;
                }
                return true;
            }
        }
        return false;
    }

    public static double e(c cVar, c cVar2) {
        double d = cVar.a - cVar2.a;
        double d2 = cVar.b - cVar2.b;
        return (d2 * d2) + (d * d);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00ee  */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r16v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r16v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c(int i7, int i10, int[] iArr) {
        char c10;
        float a10;
        ?? r16;
        char c11;
        ArrayList arrayList;
        c cVar;
        float f10;
        float f11;
        int i11;
        int i12;
        int i13;
        boolean z9 = false;
        char c12 = 2;
        char c13 = 3;
        int i14 = iArr[0] + iArr[1] + iArr[2] + iArr[3] + iArr[4];
        int a11 = (int) a(iArr, i10);
        int i15 = iArr[2];
        cc.b bVar = this.a;
        int i16 = bVar.b;
        int i17 = bVar.a;
        int[] iArr2 = this.d;
        Arrays.fill(iArr2, 0);
        int i18 = i7;
        while (i18 >= 0 && bVar.b(a11, i18)) {
            iArr2[2] = iArr2[2] + 1;
            i18--;
        }
        float f12 = Float.NaN;
        if (i18 < 0) {
            c10 = 2;
        } else {
            while (i18 >= 0 && !bVar.b(a11, i18)) {
                c10 = c12;
                int i19 = iArr2[1];
                if (i19 > i15) {
                    break;
                }
                iArr2[1] = i19 + 1;
                i18--;
                c12 = c10;
            }
            c10 = c12;
            if (i18 >= 0 && iArr2[1] <= i15) {
                while (i18 >= 0 && bVar.b(a11, i18)) {
                    int i20 = iArr2[0];
                    if (i20 > i15) {
                        break;
                    }
                    iArr2[0] = i20 + 1;
                    i18--;
                }
                if (iArr2[0] <= i15) {
                    int i21 = i7 + 1;
                    while (i21 < i16 && bVar.b(a11, i21)) {
                        iArr2[c10] = iArr2[c10] + 1;
                        i21++;
                    }
                    if (i21 != i16) {
                        while (i21 < i16 && !bVar.b(a11, i21)) {
                            int i22 = iArr2[3];
                            if (i22 >= i15) {
                                break;
                            }
                            iArr2[3] = i22 + 1;
                            i21++;
                        }
                        if (i21 != i16 && iArr2[3] < i15) {
                            while (i21 < i16 && bVar.b(a11, i21)) {
                                int i23 = iArr2[4];
                                if (i23 >= i15) {
                                    break;
                                }
                                iArr2[4] = i23 + 1;
                                i21++;
                            }
                            int i24 = iArr2[4];
                            if (i24 < i15 && Math.abs(((((iArr2[0] + iArr2[1]) + iArr2[c10]) + iArr2[3]) + i24) - i14) * 5 < i14 * 2 && b(iArr2)) {
                                a10 = a(iArr2, i21);
                                if (!Float.isNaN(a10)) {
                                    int i25 = (int) a10;
                                    int i26 = iArr[c10];
                                    Arrays.fill(iArr2, 0);
                                    int i27 = a11;
                                    while (i27 >= 0 && bVar.b(i27, i25)) {
                                        iArr2[c10] = iArr2[c10] + 1;
                                        i27--;
                                    }
                                    if (i27 >= 0) {
                                        while (i27 >= 0 && !bVar.b(i27, i25)) {
                                            int i28 = iArr2[1];
                                            if (i28 > i26) {
                                                break;
                                            }
                                            iArr2[1] = i28 + 1;
                                            i27--;
                                        }
                                        if (i27 >= 0 && iArr2[1] <= i26) {
                                            while (i27 >= 0 && bVar.b(i27, i25)) {
                                                int i29 = iArr2[0];
                                                if (i29 > i26) {
                                                    break;
                                                }
                                                iArr2[0] = i29 + 1;
                                                i27--;
                                            }
                                            if (iArr2[0] <= i26) {
                                                int i30 = a11 + 1;
                                                while (i30 < i17 && bVar.b(i30, i25)) {
                                                    iArr2[c10] = iArr2[c10] + 1;
                                                    i30++;
                                                }
                                                if (i30 != i17) {
                                                    while (i30 < i17 && !bVar.b(i30, i25)) {
                                                        int i31 = iArr2[3];
                                                        if (i31 >= i26) {
                                                            break;
                                                        }
                                                        iArr2[3] = i31 + 1;
                                                        i30++;
                                                    }
                                                    if (i30 != i17 && iArr2[3] < i26) {
                                                        while (i30 < i17 && bVar.b(i30, i25)) {
                                                            int i32 = iArr2[4];
                                                            if (i32 >= i26) {
                                                                break;
                                                            }
                                                            iArr2[4] = i32 + 1;
                                                            i30++;
                                                        }
                                                        int i33 = iArr2[4];
                                                        if (i33 < i26 && Math.abs(((((iArr2[0] + iArr2[1]) + iArr2[c10]) + iArr2[3]) + i33) - i14) * 5 < i14 && b(iArr2)) {
                                                            f12 = a(iArr2, i30);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    float f13 = f12;
                                    if (!Float.isNaN(f13)) {
                                        int i34 = (int) f13;
                                        Arrays.fill(iArr2, 0);
                                        int i35 = 0;
                                        while (i25 >= i35 && i34 >= i35) {
                                            r16 = z9;
                                            if (!bVar.b(i34 - i35, i25 - i35)) {
                                                break;
                                            }
                                            iArr2[c10] = iArr2[c10] + 1;
                                            i35++;
                                            z9 = r16 == true ? 1 : 0;
                                        }
                                        r16 = z9;
                                        if (iArr2[c10] == 0) {
                                            return r16;
                                        }
                                        while (i25 >= i35 && i34 >= i35 && !bVar.b(i34 - i35, i25 - i35)) {
                                            iArr2[1] = iArr2[1] + 1;
                                            i35++;
                                        }
                                        if (iArr2[1] == 0) {
                                            return r16;
                                        }
                                        while (i25 >= i35 && i34 >= i35 && bVar.b(i34 - i35, i25 - i35)) {
                                            iArr2[r16] = iArr2[r16] + 1;
                                            i35++;
                                        }
                                        if (iArr2[r16] == 0) {
                                            return r16;
                                        }
                                        int i36 = bVar.b;
                                        int i37 = 1;
                                        while (true) {
                                            int i38 = i25 + i37;
                                            c11 = c13;
                                            if (i38 >= i36 || (i13 = i34 + i37) >= i17 || !bVar.b(i13, i38)) {
                                                break;
                                            }
                                            iArr2[c10] = iArr2[c10] + 1;
                                            i37++;
                                            c13 = c11;
                                        }
                                        while (true) {
                                            int i39 = i25 + i37;
                                            if (i39 >= i36 || (i12 = i34 + i37) >= i17 || bVar.b(i12, i39)) {
                                                break;
                                            }
                                            iArr2[c11] = iArr2[c11] + 1;
                                            i37++;
                                        }
                                        if (iArr2[c11] == 0) {
                                            return r16;
                                        }
                                        while (true) {
                                            int i40 = i25 + i37;
                                            if (i40 >= i36 || (i11 = i34 + i37) >= i17 || !bVar.b(i11, i40)) {
                                                break;
                                            }
                                            iArr2[4] = iArr2[4] + 1;
                                            i37++;
                                        }
                                        if (iArr2[4] == 0) {
                                            return r16;
                                        }
                                        int i41 = r16;
                                        int i42 = i41;
                                        while (i41 < 5) {
                                            int i43 = iArr2[i41];
                                            if (i43 == 0) {
                                                return r16;
                                            }
                                            i42 += i43;
                                            i41++;
                                        }
                                        if (i42 < 7) {
                                            return r16;
                                        }
                                        float f14 = i42 / 7.0f;
                                        float f15 = f14 / 1.333f;
                                        if (Math.abs(f14 - iArr2[r16]) >= f15 || Math.abs(f14 - iArr2[1]) >= f15 || Math.abs((f14 * 3.0f) - iArr2[c10]) >= 3.0f * f15 || Math.abs(f14 - iArr2[c11]) >= f15 || Math.abs(f14 - iArr2[4]) >= f15) {
                                            return r16;
                                        }
                                        float f16 = i14 / 7.0f;
                                        int i44 = r16;
                                        while (true) {
                                            arrayList = this.b;
                                            if (i44 >= arrayList.size()) {
                                                arrayList.add(new c(f13, a10, f16, 1));
                                                return true;
                                            }
                                            cVar = (c) arrayList.get(i44);
                                            float f17 = cVar.c;
                                            f10 = cVar.a;
                                            f11 = cVar.b;
                                            if (Math.abs(a10 - f11) <= f16 && Math.abs(f13 - f10) <= f16) {
                                                float abs = Math.abs(f16 - f17);
                                                if (abs <= 1.0f || abs <= f17) {
                                                    break;
                                                }
                                            }
                                            i44++;
                                        }
                                        int i45 = cVar.d;
                                        int i46 = i45 + 1;
                                        float f18 = i45;
                                        float f19 = (f10 * f18) + f13;
                                        float f20 = i46;
                                        arrayList.set(i44, new c(f19 / f20, com.google.android.recaptcha.internal.a.y(f18, f11, a10, f20), com.google.android.recaptcha.internal.a.y(f18, cVar.c, f16, f20), i46));
                                        return true;
                                    }
                                }
                                return false;
                            }
                        }
                    }
                }
            }
        }
        a10 = Float.NaN;
        if (!Float.isNaN(a10)) {
        }
        return false;
    }

    public final boolean d() {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int size2 = arrayList.size();
        float f10 = 0.0f;
        int i7 = 0;
        int i10 = 0;
        float f11 = 0.0f;
        while (i10 < size2) {
            Object obj = arrayList.get(i10);
            i10++;
            c cVar = (c) obj;
            if (cVar.d >= 2) {
                i7++;
                f11 += cVar.c;
            }
        }
        if (i7 >= 3) {
            float f12 = f11 / size;
            int size3 = arrayList.size();
            int i11 = 0;
            while (i11 < size3) {
                Object obj2 = arrayList.get(i11);
                i11++;
                f10 += Math.abs(((c) obj2).c - f12);
            }
            if (f10 <= f11 * 0.05f) {
                return true;
            }
        }
        return false;
    }
}
