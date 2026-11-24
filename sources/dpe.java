// default package

import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public abstract class dpe {
    public static we7 a(float[] fArr, float[] fArr2, float f, float f2, int[] iArr, float f3) {
        int[][] iArr2;
        float f4;
        float f5;
        int[][] iArr3;
        int length = fArr.length;
        we7 we7Var = new we7();
        float f6 = 0.0f;
        if (length == 0) {
            we7Var.a = Math.max(f, Math.min(f2, f3 > 0.0f ? f3 : 1.0f));
            we7Var.b = new float[0];
            we7Var.c = new int[0];
            we7Var.e = new int[0];
            return we7Var;
        }
        we7Var.f = Float.MAX_VALUE;
        Integer[] numArr = new Integer[length];
        for (int i = 0; i < length; i++) {
            numArr[i] = Integer.valueOf(i);
        }
        if (iArr != null) {
            Arrays.sort(numArr, new bz0(iArr, (byte) 4));
        }
        int[] iArr4 = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr4[i2] = numArr[i2].intValue();
        }
        int i3 = 1;
        if (length <= 1) {
            iArr2 = new int[][]{iArr4};
        } else {
            Integer[] numArr2 = new Integer[length];
            for (int i4 = 0; i4 < length; i4++) {
                numArr2[i4] = Integer.valueOf(iArr4[i4]);
            }
            Arrays.sort(numArr2, new ml3(fArr, (byte) 2));
            int[] iArr5 = new int[length];
            int[] iArr6 = new int[length];
            for (int i5 = 0; i5 < length; i5++) {
                iArr5[i5] = numArr2[i5].intValue();
                iArr6[(length - 1) - i5] = numArr2[i5].intValue();
            }
            iArr2 = Arrays.equals(iArr5, iArr4) ? new int[][]{iArr4, iArr6} : Arrays.equals(iArr6, iArr4) ? new int[][]{iArr4, iArr5} : new int[][]{iArr4, iArr5, iArr6};
        }
        int[][] iArr7 = iArr2;
        if (length <= 8) {
            int i6 = length - 1;
            int i7 = 1 << i6;
            iArr3 = new int[i7][];
            int i8 = 0;
            while (i8 < i7) {
                int[] iArr8 = new int[Integer.bitCount(i8) + 1];
                float f7 = f6;
                int i9 = 0;
                int i10 = 1;
                for (int i11 = 0; i11 < i6; i11++) {
                    if ((i8 & (1 << i11)) != 0) {
                        iArr8[i9] = i10;
                        i10 = 1;
                        i9++;
                    } else {
                        i10++;
                    }
                }
                iArr8[i9] = i10;
                iArr3[i8] = iArr8;
                i8++;
                f6 = f7;
            }
            f4 = f6;
            f5 = 1.0f;
        } else {
            f4 = 0.0f;
            ArrayList arrayList = new ArrayList();
            int i12 = 1;
            while (i12 <= length) {
                int i13 = length / i12;
                int i14 = length % i12;
                int[] iArr9 = new int[i12];
                int[] iArr10 = new int[i12];
                int i15 = 0;
                while (i15 < i12) {
                    iArr9[i15] = i13 + (i15 < i14 ? i3 : 0);
                    iArr10[i15] = (i15 >= i12 - i14 ? 1 : 0) + i13;
                    i15++;
                    i3 = 1;
                }
                arrayList.add(iArr9);
                if (i14 != 0) {
                    arrayList.add(iArr10);
                }
                i12++;
                i3 = 1;
            }
            f5 = 1.0f;
            iArr3 = (int[][]) arrayList.toArray(new int[0][]);
        }
        float[] fArr3 = new float[length];
        for (int i16 = 0; i16 < length; i16++) {
            float f8 = fArr[i16];
            fArr3[i16] = f8 > f4 ? f5 / f8 : f4;
        }
        float[] fArr4 = new float[length];
        for (int i17 = 0; i17 < length; i17++) {
            fArr4[i17] = fArr2[i17];
        }
        ve7 ve7Var = new ve7(fArr, fArr4, f, f2, f3);
        ve7 ve7Var2 = new ve7(fArr3, fArr4, f5 / f2, f5 / f, f3 > f4 ? f5 / f3 : f4);
        int length2 = iArr7.length;
        int i18 = 0;
        while (i18 < length2) {
            int[] iArr11 = iArr7[i18];
            int i19 = 0;
            for (int i20 = 0; i20 < iArr11.length; i20++) {
                if (iArr11[i20] != iArr4[i20]) {
                    i19++;
                }
            }
            float f9 = i19 * 0.05f;
            int length3 = iArr3.length;
            int i21 = 0;
            while (i21 < length3) {
                int[] iArr12 = iArr3[i21];
                ve7 ve7Var3 = ve7Var;
                int[] iArr13 = iArr11;
                float f10 = f9;
                we7 we7Var2 = we7Var;
                ve7Var3.a(iArr13, iArr12, f10, we7Var2, false);
                if (iArr12.length > 1) {
                    ve7Var2.a(iArr13, iArr12, f10, we7Var2, true);
                }
                i21++;
                we7Var = we7Var2;
                ve7Var = ve7Var3;
                iArr11 = iArr13;
                f9 = f10;
            }
            i18++;
            ve7Var = ve7Var;
        }
        return we7Var;
    }
}
