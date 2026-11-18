package c8;

import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public abstract class md {
    public static wi.j a(float[] fArr, float[] fArr2, float f10, float f11, int[] iArr, float f12) {
        int[][] iArr2;
        float f13;
        float f14;
        int[][] iArr3;
        int length = fArr.length;
        wi.j jVar = new wi.j();
        float f15 = 0.0f;
        if (length == 0) {
            jVar.a = Math.max(f10, Math.min(f11, f12 > 0.0f ? f12 : 1.0f));
            jVar.b = new float[0];
            jVar.c = new int[0];
            jVar.e = new int[0];
            return jVar;
        }
        jVar.f = Float.MAX_VALUE;
        Integer[] numArr = new Integer[length];
        for (int i7 = 0; i7 < length; i7++) {
            numArr[i7] = Integer.valueOf(i7);
        }
        if (iArr != null) {
            Arrays.sort(numArr, new di.s4(iArr, 7));
        }
        int[] iArr4 = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            iArr4[i10] = numArr[i10].intValue();
        }
        int i11 = 1;
        if (length <= 1) {
            iArr2 = new int[][]{iArr4};
        } else {
            Integer[] numArr2 = new Integer[length];
            for (int i12 = 0; i12 < length; i12++) {
                numArr2[i12] = Integer.valueOf(iArr4[i12]);
            }
            Arrays.sort(numArr2, new ai.l(4, fArr));
            int[] iArr5 = new int[length];
            int[] iArr6 = new int[length];
            for (int i13 = 0; i13 < length; i13++) {
                iArr5[i13] = numArr2[i13].intValue();
                iArr6[(length - 1) - i13] = numArr2[i13].intValue();
            }
            iArr2 = Arrays.equals(iArr5, iArr4) ? new int[][]{iArr4, iArr6} : Arrays.equals(iArr6, iArr4) ? new int[][]{iArr4, iArr5} : new int[][]{iArr4, iArr5, iArr6};
        }
        int[][] iArr7 = iArr2;
        if (length <= 8) {
            int i14 = length - 1;
            int i15 = 1 << i14;
            iArr3 = new int[i15][];
            int i16 = 0;
            while (i16 < i15) {
                int[] iArr8 = new int[Integer.bitCount(i16) + 1];
                float f16 = f15;
                int i17 = 0;
                int i18 = 1;
                for (int i19 = 0; i19 < i14; i19++) {
                    if ((i16 & (1 << i19)) != 0) {
                        iArr8[i17] = i18;
                        i18 = 1;
                        i17++;
                    } else {
                        i18++;
                    }
                }
                iArr8[i17] = i18;
                iArr3[i16] = iArr8;
                i16++;
                f15 = f16;
            }
            f13 = f15;
            f14 = 1.0f;
        } else {
            f13 = 0.0f;
            ArrayList arrayList = new ArrayList();
            int i20 = 1;
            while (i20 <= length) {
                int i21 = length / i20;
                int i22 = length % i20;
                int[] iArr9 = new int[i20];
                int[] iArr10 = new int[i20];
                int i23 = 0;
                while (i23 < i20) {
                    iArr9[i23] = i21 + (i23 < i22 ? i11 : 0);
                    iArr10[i23] = (i23 >= i20 - i22 ? 1 : 0) + i21;
                    i23++;
                    i11 = 1;
                }
                arrayList.add(iArr9);
                if (i22 != 0) {
                    arrayList.add(iArr10);
                }
                i20++;
                i11 = 1;
            }
            f14 = 1.0f;
            iArr3 = (int[][]) arrayList.toArray(new int[0][]);
        }
        float[] fArr3 = new float[length];
        for (int i24 = 0; i24 < length; i24++) {
            float f17 = fArr[i24];
            fArr3[i24] = f17 > f13 ? f14 / f17 : f13;
        }
        float[] fArr4 = new float[length];
        for (int i25 = 0; i25 < length; i25++) {
            fArr4[i25] = fArr2[i25];
        }
        wi.i iVar = new wi.i(fArr, fArr4, f10, f11, f12);
        wi.i iVar2 = new wi.i(fArr3, fArr4, f14 / f11, f14 / f10, f12 > f13 ? f14 / f12 : f13);
        int length2 = iArr7.length;
        int i26 = 0;
        while (i26 < length2) {
            int[] iArr11 = iArr7[i26];
            int i27 = 0;
            for (int i28 = 0; i28 < iArr11.length; i28++) {
                if (iArr11[i28] != iArr4[i28]) {
                    i27++;
                }
            }
            float f18 = i27 * 0.05f;
            int length3 = iArr3.length;
            int i29 = 0;
            while (i29 < length3) {
                int[] iArr12 = iArr3[i29];
                wi.i iVar3 = iVar;
                int[] iArr13 = iArr11;
                float f19 = f18;
                wi.j jVar2 = jVar;
                iVar3.a(iArr13, iArr12, f19, jVar2, false);
                if (iArr12.length > 1) {
                    iVar2.a(iArr13, iArr12, f19, jVar2, true);
                }
                i29++;
                jVar = jVar2;
                iVar = iVar3;
                iArr11 = iArr13;
                f18 = f19;
            }
            i26++;
            iVar = iVar;
        }
        return jVar;
    }
}
