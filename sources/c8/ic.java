package c8;

import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public abstract class ic {
    public static ti.k a(float[] fArr, float[] fArr2, float f10, float f11, int[] iArr, float f12) {
        int[][] iArr2;
        float f13;
        float f14;
        int[][] iArr3;
        int length = fArr.length;
        ti.k kVar = new ti.k();
        float f15 = 0.0f;
        if (length == 0) {
            kVar.a = Math.max(f10, Math.min(f11, f12 > 0.0f ? f12 : 1.0f));
            kVar.b = new float[0];
            kVar.c = new int[0];
            kVar.e = new int[0];
            return kVar;
        }
        kVar.f = Float.MAX_VALUE;
        Integer[] numArr = new Integer[length];
        for (int i7 = 0; i7 < length; i7++) {
            numArr[i7] = Integer.valueOf(i7);
        }
        if (iArr != null) {
            Arrays.sort(numArr, new bi.s5(iArr, 4));
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
            Arrays.sort(numArr2, new bi.s5(fArr, 5));
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
        ti.j jVar = new ti.j(fArr, fArr4, f10, f11, f12);
        ti.j jVar2 = new ti.j(fArr3, fArr4, f14 / f11, f14 / f10, f12 > f13 ? f14 / f12 : f13);
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
                ti.j jVar3 = jVar;
                int[] iArr13 = iArr11;
                float f19 = f18;
                ti.k kVar2 = kVar;
                jVar3.a(iArr13, iArr12, f19, kVar2, false);
                if (iArr12.length > 1) {
                    jVar2.a(iArr13, iArr12, f19, kVar2, true);
                }
                i29++;
                kVar = kVar2;
                jVar = jVar3;
                iArr11 = iArr13;
                f18 = f19;
            }
            i26++;
            jVar = jVar;
        }
        return kVar;
    }
}
