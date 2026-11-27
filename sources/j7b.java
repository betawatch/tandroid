// default package

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeMap;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public final /* synthetic */ class j7b implements mm3 {
    public final /* synthetic */ r7b a;
    public final /* synthetic */ int b;
    public final /* synthetic */ l7b c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;
    public final /* synthetic */ long f;

    public /* synthetic */ j7b(r7b r7bVar, int i, l7b l7bVar, long j, long j2, long j3) {
        this.a = r7bVar;
        this.b = i;
        this.c = l7bVar;
        this.d = j;
        this.e = j2;
        this.f = j3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:186:0x02e1, code lost:
    
        if (r7b.d(r5, r9[r19]) > r7b.d(r5, r8[r19])) goto L162;
     */
    /* JADX WARN: Removed duplicated region for block: B:184:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x02f8  */
    @Override // mm3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(String str, int[] iArr, boolean z) {
        int i;
        long j;
        ArrayList arrayList;
        o7b o7bVar;
        int i2;
        int i3;
        int i4;
        ArrayList arrayList2;
        ArrayList arrayList3;
        int i5;
        int i6;
        float f;
        float f2;
        int i7;
        int i8;
        float f3;
        char charAt;
        long j2;
        char c;
        boolean z2;
        char c2;
        float f4;
        int[] iArr2;
        StringBuilder sb;
        int i9;
        int i10;
        r7b r7bVar = this.a;
        if (r7bVar.h || this.b != r7bVar.g) {
            return;
        }
        r7bVar.j();
        l7b l7bVar = this.c;
        if (str == null) {
            r7bVar.w = null;
            r7bVar.p = false;
            if (r7bVar.q) {
                l7bVar.c = true;
                r7bVar.f();
                return;
            }
            r7bVar.o = false;
            m7b m7bVar = r7bVar.t;
            if (m7bVar != null) {
                m7bVar.d();
                return;
            }
            return;
        }
        r7bVar.q = true;
        StringBuilder sb2 = new StringBuilder();
        int[] iArr3 = new int[iArr == null ? 0 : iArr.length];
        int i11 = 0;
        int i12 = 0;
        int i13 = -1;
        while (true) {
            if (iArr == null) {
                i = 2;
                break;
            }
            int i14 = i11 + 3;
            i = 2;
            if (i14 >= iArr.length) {
                break;
            }
            long j3 = (iArr[i11 + 2] + iArr[i14]) / 2;
            StringBuilder sb3 = sb2;
            long j4 = this.d;
            long j5 = j3 + j4;
            int i15 = i11;
            if (j5 >= this.e && j5 < this.f && iArr[i15] >= 0) {
                int i16 = i15 + 1;
                if (iArr[i16] <= str.length() && iArr[i15] < iArr[i16]) {
                    if (sb3.length() > 0) {
                        String substring = (i13 != i15 + (-4) || (i9 = iArr[i15 + (-3)]) > (i10 = iArr[i15])) ? " " : str.substring(i9, i10);
                        sb = sb3;
                        sb.append(substring);
                    } else {
                        sb = sb3;
                    }
                    iArr3[i12] = sb.length();
                    sb.append((CharSequence) str, iArr[i15], iArr[i16]);
                    iArr3[i12 + 1] = sb.length();
                    int i17 = i12 + 3;
                    iArr3[i12 + 2] = (int) (iArr[r14] + j4);
                    i12 += 4;
                    iArr3[i17] = (int) (j4 + iArr[i14]);
                    i13 = i15;
                    i11 = i15 + 4;
                    sb2 = sb;
                }
            }
            sb = sb3;
            i11 = i15 + 4;
            sb2 = sb;
        }
        l7bVar.a = sb2.toString();
        l7bVar.b = Arrays.copyOf(iArr3, i12);
        if (z) {
            l7bVar.c = true;
            r7bVar.w = null;
            r7bVar.p = false;
        }
        ArrayList arrayList4 = r7bVar.s;
        StringBuilder sb4 = new StringBuilder();
        TreeMap treeMap = r7bVar.i;
        Iterator it = treeMap.values().iterator();
        int i18 = 0;
        while (it.hasNext()) {
            int[] iArr4 = ((l7b) it.next()).b;
            if (iArr4 != null) {
                i18 += iArr4.length;
            }
        }
        int[] iArr5 = new int[i18];
        int i19 = 0;
        for (l7b l7bVar2 : treeMap.values()) {
            if (l7bVar2.a != null && (iArr2 = l7bVar2.b) != null && iArr2.length != 0) {
                if (sb4.length() > 0) {
                    sb4.append(' ');
                }
                int length = sb4.length();
                sb4.append(l7bVar2.a);
                int i20 = 0;
                while (true) {
                    int i21 = i20 + 3;
                    int[] iArr6 = l7bVar2.b;
                    if (i21 < iArr6.length) {
                        iArr5[i19] = iArr6[i20] + length;
                        iArr5[i19 + 1] = length + iArr6[i20 + 1];
                        int i22 = i19 + 3;
                        iArr5[i19 + 2] = iArr6[i20 + 2];
                        i19 += 4;
                        iArr5[i22] = iArr6[i21];
                        i20 += 4;
                    }
                }
            }
        }
        String sb5 = sb4.toString();
        if (i19 != i18) {
            iArr5 = Arrays.copyOf(iArr5, i19);
        }
        ec1 ec1Var = r7bVar.u;
        float f5 = r7bVar.v;
        ArrayList arrayList5 = new ArrayList(arrayList4);
        arrayList4.clear();
        int length2 = iArr5.length / 4;
        if (length2 != 0) {
            float f6 = 0.0f;
            if (ec1Var == null || f5 <= 0.0f) {
                f5 = 36.0f;
            }
            float[] fArr = new float[length2 + 1];
            float[] fArr2 = new float[length2];
            int i23 = 0;
            while (i23 < length2) {
                int i24 = i23 << 2;
                int i25 = iArr5[i24];
                int i26 = iArr5[i24 + 1];
                if (i23 > 0) {
                    int i27 = iArr5[i24 - 3];
                    fArr2[i23] = i27 >= i25 ? 0.0f : ec1Var != null ? ec1Var.a(sb5.subSequence(i27, i25)) : i25 - i27;
                }
                int i28 = i23 + 1;
                fArr[i28] = fArr[i23] + fArr2[i23] + (ec1Var != null ? ec1Var.a(sb5.subSequence(i25, i26)) : i26 - i25);
                i23 = i28;
            }
            ArrayList arrayList6 = new ArrayList();
            int i29 = 0;
            int i30 = 0;
            while (true) {
                j = 700;
                if (i29 >= length2) {
                    break;
                }
                float f7 = f6;
                if (i29 != length2 - 1 && r7b.d(iArr5, i29) <= 700) {
                    int i31 = i29 << 2;
                    CharSequence subSequence = sb5.subSequence(iArr5[i31], iArr5[i31 + 1]);
                    if (subSequence.length() != 0) {
                        char charAt2 = subSequence.charAt(subSequence.length() - 1);
                        if (charAt2 != '.' && charAt2 != '!' && charAt2 != '?' && charAt2 != 8230 && charAt2 != 12290 && charAt2 != 65281 && charAt2 != 65311 && charAt2 != 1748) {
                        }
                    }
                    i29++;
                    f6 = f7;
                }
                arrayList6.add(new int[]{i30, i29});
                i30 = i29 + 1;
                i29++;
                f6 = f7;
            }
            float f8 = f6;
            int i32 = 0;
            while (i32 < arrayList6.size()) {
                int[] iArr7 = (int[]) arrayList6.get(i32);
                if (iArr7[1] - iArr7[0] > 1) {
                    f4 = f5;
                    j2 = j;
                } else {
                    int[] iArr8 = i32 > 0 ? (int[]) arrayList6.get(i32 - 1) : null;
                    int i33 = i32 + 1;
                    int[] iArr9 = i33 < arrayList6.size() ? (int[]) arrayList6.get(i33) : null;
                    if (iArr8 != null) {
                        c = 1;
                        if (r7b.d(iArr5, iArr8[1]) <= j) {
                            j2 = j;
                            if (r7b.k(fArr, fArr2, iArr8[0], iArr7[1]) <= f5) {
                                z2 = true;
                                c2 = (iArr9 != null || r7b.d(iArr5, iArr7[c]) > j2 || r7b.k(fArr, fArr2, iArr7[0], iArr9[c]) > f5) ? (char) 0 : c;
                                if (z2) {
                                    f4 = f5;
                                } else {
                                    if (c2 != 0) {
                                        f4 = f5;
                                    } else {
                                        f4 = f5;
                                    }
                                    iArr8[c] = iArr7[c];
                                    arrayList6.remove(i32);
                                    i32 = Math.max(-1, i32 - 2);
                                }
                                if (c2 != 0) {
                                    iArr9[0] = iArr7[0];
                                    arrayList6.remove(i32);
                                    i32 = Math.max(-1, i32 - 1);
                                }
                            }
                        } else {
                            j2 = j;
                        }
                    } else {
                        j2 = j;
                        c = 1;
                    }
                    z2 = false;
                    if (iArr9 != null) {
                    }
                    if (z2) {
                    }
                    if (c2 != 0) {
                    }
                }
                i32++;
                j = j2;
                f5 = f4;
            }
            float f9 = f5;
            long j6 = j;
            ArrayList arrayList7 = new ArrayList();
            int size = arrayList6.size();
            int i34 = 0;
            while (i34 < size) {
                Object obj = arrayList6.get(i34);
                int i35 = i34 + 1;
                int[] iArr10 = (int[]) obj;
                int i36 = iArr10[0];
                int i37 = iArr10[1];
                if (i36 == i37 || r7b.k(fArr, fArr2, i36, i37) <= f9) {
                    arrayList2 = arrayList6;
                    arrayList3 = arrayList4;
                    i5 = size;
                    i6 = i35;
                    arrayList7.add(iArr10);
                } else {
                    int i38 = iArr10[0];
                    int i39 = iArr10[1];
                    int i40 = i39 - i38;
                    int i41 = i40 + 1;
                    float k = r7b.k(fArr, fArr2, i38, i39);
                    int i42 = i40 + 2;
                    float[] fArr3 = new float[i42];
                    arrayList2 = arrayList6;
                    int i43 = 1;
                    while (i43 < i41) {
                        int i44 = i43;
                        int i45 = ((i38 + i43) - 1) << 2;
                        int i46 = size;
                        int i47 = i35;
                        CharSequence subSequence2 = sb5.subSequence(iArr5[i45], iArr5[i45 + 1]);
                        if (subSequence2.length() != 0 && ((charAt = subSequence2.charAt(subSequence2.length() - 1)) == ',' || charAt == ';' || charAt == ':' || charAt == 8212 || charAt == 8211 || charAt == 1548 || charAt == 12289 || charAt == 65292)) {
                            fArr3[i44] = fArr3[i44] - 0.3f;
                        }
                        fArr3[i44] = fArr3[i44] - ((Math.min(500L, Math.max(0L, r7b.d(iArr5, r0))) * 0.3f) / 500.0f);
                        i43 = i44 + 1;
                        i38 = i38;
                        size = i46;
                        i35 = i47;
                        i42 = i42;
                        arrayList4 = arrayList4;
                    }
                    arrayList3 = arrayList4;
                    i5 = size;
                    i6 = i35;
                    int i48 = i38;
                    int i49 = i42;
                    int i50 = i;
                    int max = Math.max(i50, (int) Math.ceil(k / f9));
                    while (true) {
                        if (max <= i41) {
                            float f10 = k / max;
                            int i51 = max + 1;
                            int[] iArr11 = new int[i50];
                            iArr11[1] = i49;
                            iArr11[0] = i51;
                            float[][] fArr4 = (float[][]) Array.newInstance((Class<?>) Float.TYPE, iArr11);
                            int[][] iArr12 = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i51, i49);
                            int length3 = fArr4.length;
                            int i52 = 0;
                            while (true) {
                                f = Float.MAX_VALUE;
                                if (i52 >= length3) {
                                    break;
                                }
                                int i53 = i52;
                                Arrays.fill(fArr4[i53], Float.MAX_VALUE);
                                i52 = i53 + 1;
                            }
                            fArr4[0][0] = f8;
                            int i54 = 1;
                            while (i54 <= max) {
                                int i55 = i54;
                                while (true) {
                                    f2 = f;
                                    if (i55 <= i41 - (max - i54)) {
                                        int i56 = i54 - 1;
                                        int i57 = i54;
                                        int i58 = i56;
                                        while (i58 < i55) {
                                            if (fArr4[i56][i58] == f2) {
                                                i7 = i58;
                                                i8 = i56;
                                            } else {
                                                i7 = i58;
                                                i8 = i56;
                                                float k2 = r7b.k(fArr, fArr2, i48 + i7, (i48 + i55) - 1);
                                                if (k2 > f9) {
                                                    f3 = k2;
                                                    if (i55 - i7 > 1) {
                                                    }
                                                } else {
                                                    f3 = k2;
                                                }
                                                float f11 = (f3 - f10) / f9;
                                                float f12 = (f11 * f11) + fArr4[i8][i7] + fArr3[i55];
                                                float f13 = (i55 - i7 != 1 || i41 <= max) ? f12 : f12 + 1.0f;
                                                float[] fArr5 = fArr4[i57];
                                                if (f13 < fArr5[i55]) {
                                                    fArr5[i55] = f13;
                                                    iArr12[i57][i55] = i7;
                                                }
                                            }
                                            i58 = i7 + 1;
                                            i56 = i8;
                                        }
                                        i55++;
                                        i54 = i57;
                                        f = f2;
                                    }
                                }
                                i54++;
                                f = f2;
                            }
                            if (fArr4[max][i41] == f) {
                                max = i51;
                                i50 = 2;
                            } else {
                                int size2 = arrayList7.size();
                                while (max >= 1) {
                                    int i59 = iArr12[max][i41];
                                    arrayList7.add(size2, new int[]{i48 + i59, (i48 + i41) - 1});
                                    max--;
                                    i41 = i59;
                                }
                            }
                        } else {
                            for (int i60 = i48; i60 <= i39; i60++) {
                                arrayList7.add(new int[]{i60, i60});
                            }
                        }
                    }
                }
                arrayList6 = arrayList2;
                size = i5;
                i34 = i6;
                arrayList4 = arrayList3;
                i = 2;
            }
            ArrayList arrayList8 = arrayList4;
            int i61 = 0;
            while (i61 < arrayList7.size()) {
                int[] iArr13 = (int[]) arrayList7.get(i61);
                if (iArr13[0] == iArr13[1]) {
                    int[] iArr14 = i61 > 0 ? (int[]) arrayList7.get(i61 - 1) : null;
                    int i62 = i61 + 1;
                    int[] iArr15 = i62 < arrayList7.size() ? (int[]) arrayList7.get(i62) : null;
                    boolean z3 = iArr14 != null && r7b.d(iArr5, iArr14[1]) <= j6 && r7b.k(fArr, fArr2, iArr14[0], iArr13[1]) <= f9;
                    boolean z4 = iArr15 != null && r7b.d(iArr5, iArr13[1]) <= j6 && r7b.k(fArr, fArr2, iArr13[0], iArr15[1]) <= f9;
                    if (z3 && (!z4 || r7b.d(iArr5, iArr14[1]) <= r7b.d(iArr5, iArr13[1]))) {
                        iArr14[1] = iArr13[1];
                        i4 = i61 - 1;
                        arrayList7.remove(i61);
                    } else if (z4) {
                        iArr15[0] = iArr13[0];
                        i4 = i61 - 1;
                        arrayList7.remove(i61);
                    }
                    i61 = i4;
                }
                i61++;
            }
            char c3 = 1;
            int size3 = arrayList7.size();
            int i63 = 0;
            while (i63 < size3) {
                Object obj2 = arrayList7.get(i63);
                int i64 = i63 + 1;
                int[] iArr16 = (int[]) obj2;
                int i65 = iArr16[0];
                int i66 = iArr16[c3];
                int i67 = i65 << 2;
                long j7 = iArr5[i67 + 2];
                int i68 = 0;
                while (true) {
                    if (i68 >= arrayList5.size()) {
                        o7bVar = null;
                        break;
                    } else {
                        if (((o7b) arrayList5.get(i68)).a == j7) {
                            o7bVar = (o7b) arrayList5.get(i68);
                            break;
                        }
                        i68++;
                    }
                }
                if (o7bVar == null) {
                    o7bVar = new o7b();
                    o7bVar.a = j7;
                }
                int i69 = i66 << 2;
                o7bVar.b = iArr5[i69 + 3] + 300;
                if (o7bVar.e) {
                    i2 = size3;
                    i3 = i64;
                    c3 = 1;
                } else {
                    String substring2 = sb5.substring(iArr5[i67], iArr5[i69 + 1]);
                    CharSequence charSequence = o7bVar.c;
                    if (charSequence == null || !substring2.contentEquals(charSequence)) {
                        o7bVar.c = substring2;
                    }
                    c3 = 1;
                    int[] iArr17 = new int[((i66 - i65) + 1) << 2];
                    int i70 = i65;
                    while (i70 <= i66) {
                        int i71 = (i70 - i65) << 2;
                        int i72 = i70 << 2;
                        iArr17[i71] = iArr5[i72] - iArr5[i67];
                        iArr17[i71 + 1] = iArr5[i72 + 1] - iArr5[i67];
                        iArr17[i71 + 2] = iArr5[i72 + 2];
                        iArr17[i71 + 3] = iArr5[i72 + 3];
                        i70++;
                        size3 = size3;
                        i64 = i64;
                    }
                    i2 = size3;
                    i3 = i64;
                    o7bVar.d = iArr17;
                }
                ArrayList arrayList9 = arrayList8;
                arrayList9.add(o7bVar);
                i63 = i3;
                arrayList8 = arrayList9;
                size3 = i2;
            }
            arrayList = arrayList8;
            int i73 = 0;
            while (true) {
                int i74 = i73 + 1;
                if (i74 >= arrayList.size()) {
                    break;
                }
                ((o7b) arrayList.get(i73)).b = Math.max(((o7b) arrayList.get(i73)).a, Math.min(((o7b) arrayList.get(i73)).b, ((o7b) arrayList.get(i74)).a));
                i73 = i74;
            }
        } else {
            arrayList = arrayList4;
        }
        m7b m7bVar2 = r7bVar.t;
        if (m7bVar2 != null) {
            m7bVar2.a(arrayList);
        }
        if (z) {
            r7bVar.f();
        }
    }
}
