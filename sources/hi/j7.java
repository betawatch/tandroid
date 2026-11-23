package hi;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeMap;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class j7 implements ai.p {
    public final /* synthetic */ r7 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ k7 c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;
    public final /* synthetic */ long f;

    public /* synthetic */ j7(r7 r7Var, int i7, k7 k7Var, long j3, long j10, long j11) {
        this.a = r7Var;
        this.b = i7;
        this.c = k7Var;
        this.d = j3;
        this.e = j10;
        this.f = j11;
    }

    @Override // ai.p
    public final void a(String str, int[] iArr, boolean z10) {
        int i7;
        ArrayList arrayList;
        int length;
        long j3;
        o7 o7Var;
        ArrayList arrayList2;
        int i10;
        int i11;
        ArrayList arrayList3;
        ArrayList arrayList4;
        int i12;
        float f10;
        float f11;
        float f12;
        int i13;
        int i14;
        float f13;
        char charAt;
        long j10;
        int[] iArr2;
        StringBuilder sb2;
        int i15;
        int i16;
        r7 r7Var = this.a;
        if (r7Var.h || this.b != r7Var.g) {
            return;
        }
        r7Var.j();
        k7 k7Var = this.c;
        if (str == null) {
            r7Var.w = null;
            r7Var.p = false;
            if (r7Var.q) {
                k7Var.c = true;
                r7Var.f();
                return;
            }
            r7Var.o = false;
            l7 l7Var = r7Var.t;
            if (l7Var != null) {
                l7Var.p();
                return;
            }
            return;
        }
        r7Var.q = true;
        StringBuilder sb3 = new StringBuilder();
        int[] iArr3 = new int[iArr == null ? 0 : iArr.length];
        int i17 = 0;
        int i18 = 0;
        int i19 = -1;
        while (true) {
            if (iArr == null) {
                i7 = 2;
                break;
            }
            int i20 = i17 + 3;
            i7 = 2;
            if (i20 >= iArr.length) {
                break;
            }
            long j11 = (iArr[i17 + 2] + iArr[i20]) / 2;
            StringBuilder sb4 = sb3;
            long j12 = this.d;
            long j13 = j11 + j12;
            int i21 = i17;
            if (j13 >= this.e && j13 < this.f && iArr[i21] >= 0) {
                int i22 = i21 + 1;
                if (iArr[i22] <= str.length() && iArr[i21] < iArr[i22]) {
                    if (sb4.length() > 0) {
                        String substring = (i19 != i21 + (-4) || (i15 = iArr[i21 + (-3)]) > (i16 = iArr[i21])) ? " " : str.substring(i15, i16);
                        sb2 = sb4;
                        sb2.append(substring);
                    } else {
                        sb2 = sb4;
                    }
                    iArr3[i18] = sb2.length();
                    sb2.append((CharSequence) str, iArr[i21], iArr[i22]);
                    iArr3[i18 + 1] = sb2.length();
                    int i23 = i18 + 3;
                    iArr3[i18 + 2] = (int) (iArr[r14] + j12);
                    i18 += 4;
                    iArr3[i23] = (int) (j12 + iArr[i20]);
                    i19 = i21;
                    i17 = i21 + 4;
                    sb3 = sb2;
                }
            }
            sb2 = sb4;
            i17 = i21 + 4;
            sb3 = sb2;
        }
        k7Var.a = sb3.toString();
        k7Var.b = Arrays.copyOf(iArr3, i18);
        if (z10) {
            k7Var.c = true;
            r7Var.w = null;
            r7Var.p = false;
        }
        ArrayList arrayList5 = r7Var.s;
        StringBuilder sb5 = new StringBuilder();
        TreeMap treeMap = r7Var.i;
        Iterator it = treeMap.values().iterator();
        int i24 = 0;
        while (it.hasNext()) {
            int[] iArr4 = ((k7) it.next()).b;
            if (iArr4 != null) {
                i24 += iArr4.length;
            }
        }
        int[] iArr5 = new int[i24];
        int i25 = 0;
        for (k7 k7Var2 : treeMap.values()) {
            if (k7Var2.a != null && (iArr2 = k7Var2.b) != null && iArr2.length != 0) {
                if (sb5.length() > 0) {
                    sb5.append(' ');
                }
                int length2 = sb5.length();
                sb5.append(k7Var2.a);
                int i26 = 0;
                while (true) {
                    int i27 = i26 + 3;
                    int[] iArr6 = k7Var2.b;
                    if (i27 < iArr6.length) {
                        iArr5[i25] = length2 + iArr6[i26];
                        iArr5[i25 + 1] = length2 + iArr6[i26 + 1];
                        int i28 = i25 + 3;
                        iArr5[i25 + 2] = iArr6[i26 + 2];
                        i25 += 4;
                        iArr5[i28] = iArr6[i27];
                        i26 += 4;
                    }
                }
            }
        }
        String sb6 = sb5.toString();
        if (i25 != i24) {
            iArr5 = Arrays.copyOf(iArr5, i25);
        }
        m7 m7Var = r7Var.u;
        float f14 = r7Var.v;
        ArrayList arrayList6 = new ArrayList(arrayList5);
        arrayList5.clear();
        if (sb6 == null || iArr5 == null || (length = iArr5.length / 4) == 0) {
            arrayList = arrayList5;
        } else {
            float f15 = 0.0f;
            if (m7Var == null || f14 <= 0.0f) {
                f14 = 36.0f;
            }
            float[] fArr = new float[length + 1];
            float[] fArr2 = new float[length];
            int i29 = 0;
            while (i29 < length) {
                int i30 = i29 * 4;
                int i31 = iArr5[i30];
                int i32 = iArr5[i30 + 1];
                if (i29 > 0) {
                    int i33 = iArr5[i30 - 3];
                    fArr2[i29] = i33 >= i31 ? 0.0f : m7Var != null ? m7Var.m(sb6.subSequence(i33, i31)) : i31 - i33;
                }
                int i34 = i29 + 1;
                fArr[i34] = fArr[i29] + fArr2[i29] + (m7Var != null ? m7Var.m(sb6.subSequence(i31, i32)) : i32 - i31);
                i29 = i34;
            }
            ArrayList arrayList7 = new ArrayList();
            int i35 = 0;
            int i36 = 0;
            while (true) {
                j3 = 700;
                if (i36 >= length) {
                    break;
                }
                float f16 = f15;
                if (i36 != length - 1 && r7.d(iArr5, i36) <= 700) {
                    int i37 = i36 * 4;
                    CharSequence subSequence = sb6.subSequence(iArr5[i37], iArr5[i37 + 1]);
                    if (subSequence.length() != 0) {
                        char charAt2 = subSequence.charAt(subSequence.length() - 1);
                        if (charAt2 != '.' && charAt2 != '!' && charAt2 != '?' && charAt2 != 8230 && charAt2 != 12290 && charAt2 != 65281 && charAt2 != 65311 && charAt2 != 1748) {
                        }
                    }
                    i36++;
                    f15 = f16;
                }
                arrayList7.add(new int[]{i35, i36});
                i35 = i36 + 1;
                i36++;
                f15 = f16;
            }
            float f17 = f15;
            int i38 = 0;
            while (i38 < arrayList7.size()) {
                int[] iArr7 = (int[]) arrayList7.get(i38);
                if (iArr7[1] - iArr7[0] > 1) {
                    j10 = j3;
                } else {
                    int[] iArr8 = i38 > 0 ? (int[]) arrayList7.get(i38 - 1) : null;
                    int i39 = i38 + 1;
                    j10 = j3;
                    int[] iArr9 = i39 < arrayList7.size() ? (int[]) arrayList7.get(i39) : null;
                    boolean z11 = iArr8 != null && r7.d(iArr5, iArr8[1]) <= j10 && r7.k(fArr, fArr2, iArr8[0], iArr7[1]) <= f14;
                    boolean z12 = iArr9 != null && r7.d(iArr5, iArr7[1]) <= j10 && r7.k(fArr, fArr2, iArr7[0], iArr9[1]) <= f14;
                    if (z11 && (!z12 || r7.d(iArr5, iArr8[1]) <= r7.d(iArr5, iArr7[1]))) {
                        iArr8[1] = iArr7[1];
                        arrayList7.remove(i38);
                        i38 = Math.max(-1, i38 - 2);
                    } else if (z12) {
                        iArr9[0] = iArr7[0];
                        arrayList7.remove(i38);
                        i38 = Math.max(-1, i38 - 1);
                    }
                }
                i38++;
                j3 = j10;
            }
            long j14 = j3;
            ArrayList arrayList8 = new ArrayList();
            int size = arrayList7.size();
            int i40 = 0;
            while (i40 < size) {
                Object obj = arrayList7.get(i40);
                i40++;
                int[] iArr10 = (int[]) obj;
                int i41 = iArr10[0];
                int i42 = iArr10[1];
                if (i41 == i42 || r7.k(fArr, fArr2, i41, i42) <= f14) {
                    arrayList3 = arrayList7;
                    arrayList4 = arrayList5;
                    i12 = size;
                    f10 = f14;
                    arrayList8.add(iArr10);
                } else {
                    int i43 = iArr10[0];
                    int i44 = iArr10[1];
                    int i45 = i44 - i43;
                    int i46 = i45 + 1;
                    float k10 = r7.k(fArr, fArr2, i43, i44);
                    int i47 = i45 + 2;
                    arrayList3 = arrayList7;
                    float[] fArr3 = new float[i47];
                    int i48 = 1;
                    while (i48 < i46) {
                        int i49 = i48;
                        int i50 = ((i43 + i48) - 1) * 4;
                        int i51 = size;
                        float f18 = f14;
                        CharSequence subSequence2 = sb6.subSequence(iArr5[i50], iArr5[i50 + 1]);
                        if (subSequence2.length() != 0 && ((charAt = subSequence2.charAt(subSequence2.length() - 1)) == ',' || charAt == ';' || charAt == ':' || charAt == 8212 || charAt == 8211 || charAt == 1548 || charAt == 12289 || charAt == 65292)) {
                            fArr3[i49] = fArr3[i49] - 0.3f;
                        }
                        fArr3[i49] = fArr3[i49] - ((Math.min(500L, Math.max(0L, r7.d(iArr5, r1))) * 0.3f) / 500.0f);
                        i48 = i49 + 1;
                        i43 = i43;
                        size = i51;
                        f14 = f18;
                        i47 = i47;
                        arrayList5 = arrayList5;
                    }
                    arrayList4 = arrayList5;
                    i12 = size;
                    f10 = f14;
                    int i52 = i43;
                    int i53 = i47;
                    int i54 = i7;
                    int max = Math.max(i54, (int) Math.ceil(k10 / f10));
                    while (true) {
                        if (max <= i46) {
                            float f19 = k10 / max;
                            int i55 = max + 1;
                            int[] iArr11 = new int[i54];
                            iArr11[1] = i53;
                            iArr11[0] = i55;
                            float[][] fArr4 = (float[][]) Array.newInstance((Class<?>) Float.TYPE, iArr11);
                            int[][] iArr12 = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i55, i53);
                            int length3 = fArr4.length;
                            int i56 = 0;
                            while (true) {
                                f11 = Float.MAX_VALUE;
                                if (i56 >= length3) {
                                    break;
                                }
                                int i57 = i56;
                                Arrays.fill(fArr4[i57], Float.MAX_VALUE);
                                i56 = i57 + 1;
                            }
                            fArr4[0][0] = f17;
                            int i58 = 1;
                            while (i58 <= max) {
                                int i59 = i58;
                                while (true) {
                                    f12 = f11;
                                    if (i59 <= i46 - (max - i58)) {
                                        int i60 = i58 - 1;
                                        int i61 = i58;
                                        int i62 = i60;
                                        while (i62 < i59) {
                                            if (fArr4[i60][i62] == f12) {
                                                i13 = i62;
                                                i14 = i60;
                                            } else {
                                                i13 = i62;
                                                i14 = i60;
                                                float k11 = r7.k(fArr, fArr2, i52 + i13, (i52 + i59) - 1);
                                                if (k11 > f10) {
                                                    f13 = k11;
                                                    if (i59 - i13 > 1) {
                                                    }
                                                } else {
                                                    f13 = k11;
                                                }
                                                float f20 = (f13 - f19) / f10;
                                                float f21 = (f20 * f20) + fArr4[i14][i13] + fArr3[i59];
                                                float f22 = (i59 - i13 != 1 || i46 <= max) ? f21 : f21 + 1.0f;
                                                float[] fArr5 = fArr4[i61];
                                                if (f22 < fArr5[i59]) {
                                                    fArr5[i59] = f22;
                                                    iArr12[i61][i59] = i13;
                                                }
                                            }
                                            i62 = i13 + 1;
                                            i60 = i14;
                                        }
                                        i59++;
                                        i58 = i61;
                                        f11 = f12;
                                    }
                                }
                                i58++;
                                f11 = f12;
                            }
                            if (fArr4[max][i46] == f11) {
                                max = i55;
                                i54 = 2;
                            } else {
                                int size2 = arrayList8.size();
                                while (max >= 1) {
                                    int i63 = iArr12[max][i46];
                                    arrayList8.add(size2, new int[]{i52 + i63, (i46 + i52) - 1});
                                    max--;
                                    i46 = i63;
                                }
                            }
                        } else {
                            for (int i64 = i52; i64 <= i44; i64++) {
                                arrayList8.add(new int[]{i64, i64});
                            }
                        }
                    }
                }
                arrayList7 = arrayList3;
                size = i12;
                f14 = f10;
                arrayList5 = arrayList4;
                i7 = 2;
            }
            ArrayList arrayList9 = arrayList5;
            float f23 = f14;
            int i65 = 0;
            while (i65 < arrayList8.size()) {
                int[] iArr13 = (int[]) arrayList8.get(i65);
                if (iArr13[0] == iArr13[1]) {
                    int[] iArr14 = i65 > 0 ? (int[]) arrayList8.get(i65 - 1) : null;
                    int i66 = i65 + 1;
                    int[] iArr15 = i66 < arrayList8.size() ? (int[]) arrayList8.get(i66) : null;
                    boolean z13 = iArr14 != null && r7.d(iArr5, iArr14[1]) <= j14 && r7.k(fArr, fArr2, iArr14[0], iArr13[1]) <= f23;
                    boolean z14 = iArr15 != null && r7.d(iArr5, iArr13[1]) <= j14 && r7.k(fArr, fArr2, iArr13[0], iArr15[1]) <= f23;
                    if (z13 && (!z14 || r7.d(iArr5, iArr14[1]) <= r7.d(iArr5, iArr13[1]))) {
                        iArr14[1] = iArr13[1];
                        i11 = i65 - 1;
                        arrayList8.remove(i65);
                    } else if (z14) {
                        iArr15[0] = iArr13[0];
                        i11 = i65 - 1;
                        arrayList8.remove(i65);
                    }
                    i65 = i11;
                }
                i65++;
            }
            char c10 = 1;
            int size3 = arrayList8.size();
            int i67 = 0;
            while (i67 < size3) {
                Object obj2 = arrayList8.get(i67);
                i67++;
                int[] iArr16 = (int[]) obj2;
                int i68 = iArr16[0];
                int i69 = iArr16[c10];
                int i70 = i68 * 4;
                long j15 = iArr5[i70 + 2];
                int i71 = 0;
                while (true) {
                    if (i71 >= arrayList6.size()) {
                        o7Var = null;
                        break;
                    } else {
                        if (((o7) arrayList6.get(i71)).a == j15) {
                            o7Var = (o7) arrayList6.get(i71);
                            break;
                        }
                        i71++;
                    }
                }
                if (o7Var == null) {
                    o7Var = new o7();
                    o7Var.a = j15;
                }
                int i72 = i69 * 4;
                o7Var.b = iArr5[i72 + 3] + 300;
                if (o7Var.e) {
                    arrayList2 = arrayList8;
                    i10 = size3;
                    c10 = 1;
                } else {
                    String substring2 = sb6.substring(iArr5[i70], iArr5[i72 + 1]);
                    CharSequence charSequence = o7Var.c;
                    if (charSequence == null || !substring2.contentEquals(charSequence)) {
                        o7Var.c = substring2;
                    }
                    c10 = 1;
                    int[] iArr17 = new int[((i69 - i68) + 1) * 4];
                    int i73 = i68;
                    while (i73 <= i69) {
                        int i74 = (i73 - i68) * 4;
                        int i75 = i73 * 4;
                        iArr17[i74] = iArr5[i75] - iArr5[i70];
                        iArr17[i74 + 1] = iArr5[i75 + 1] - iArr5[i70];
                        iArr17[i74 + 2] = iArr5[i75 + 2];
                        iArr17[i74 + 3] = iArr5[i75 + 3];
                        i73++;
                        arrayList8 = arrayList8;
                        size3 = size3;
                    }
                    arrayList2 = arrayList8;
                    i10 = size3;
                    o7Var.d = iArr17;
                }
                ArrayList arrayList10 = arrayList9;
                arrayList10.add(o7Var);
                size3 = i10;
                arrayList9 = arrayList10;
                arrayList8 = arrayList2;
            }
            arrayList = arrayList9;
            int i76 = 0;
            while (true) {
                int i77 = i76 + 1;
                if (i77 >= arrayList.size()) {
                    break;
                }
                ((o7) arrayList.get(i76)).b = Math.max(((o7) arrayList.get(i76)).a, Math.min(((o7) arrayList.get(i76)).b, ((o7) arrayList.get(i77)).a));
                i76 = i77;
            }
        }
        l7 l7Var2 = r7Var.t;
        if (l7Var2 != null) {
            l7Var2.g(arrayList);
        }
        if (z10) {
            r7Var.f();
        }
    }
}
