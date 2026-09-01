package o4;

import java.util.Arrays;
import java.util.Random;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class o0 implements q0 {
    public final Random a;
    public final int[] b;
    public final int[] c;

    public o0() {
        this(new Random());
    }

    @Override // o4.q0
    public final int a() {
        int[] iArr = this.b;
        if (iArr.length > 0) {
            return iArr[0];
        }
        return -1;
    }

    @Override // o4.q0
    public final q0 b(int i10) {
        int[] iArr = this.b;
        int[] iArr2 = new int[iArr.length - i10];
        int i11 = 0;
        for (int i12 = 0; i12 < iArr.length; i12++) {
            int i13 = iArr[i12];
            if (i13 < 0 || i13 >= i10) {
                int i14 = i12 - i11;
                if (i13 >= 0) {
                    i13 -= i10;
                }
                iArr2[i14] = i13;
            } else {
                i11++;
            }
        }
        return new o0(iArr2, new Random(this.a.nextLong()));
    }

    @Override // o4.q0
    public final int c(int i10) {
        int i11 = this.c[i10] - 1;
        if (i11 >= 0) {
            return this.b[i11];
        }
        return -1;
    }

    @Override // o4.q0
    public final int d(int i10) {
        int i11 = this.c[i10] + 1;
        int[] iArr = this.b;
        if (i11 < iArr.length) {
            return iArr[i11];
        }
        return -1;
    }

    @Override // o4.q0
    public final q0 e(int i10) {
        int[] iArr;
        Random random;
        int[] iArr2 = new int[i10];
        int[] iArr3 = new int[i10];
        int i11 = 0;
        while (true) {
            iArr = this.b;
            random = this.a;
            if (i11 >= i10) {
                break;
            }
            iArr2[i11] = random.nextInt(iArr.length + 1);
            int i12 = i11 + 1;
            int nextInt = random.nextInt(i12);
            iArr3[i11] = iArr3[nextInt];
            iArr3[nextInt] = i11;
            i11 = i12;
        }
        Arrays.sort(iArr2);
        int[] iArr4 = new int[iArr.length + i10];
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 0; i15 < iArr.length + i10; i15++) {
            if (i13 >= i10 || i14 != iArr2[i13]) {
                int i16 = i14 + 1;
                int i17 = iArr[i14];
                iArr4[i15] = i17;
                if (i17 >= 0) {
                    iArr4[i15] = i17 + i10;
                }
                i14 = i16;
            } else {
                iArr4[i15] = iArr3[i13];
                i13++;
            }
        }
        return new o0(iArr4, new Random(random.nextLong()));
    }

    @Override // o4.q0
    public final int f() {
        int[] iArr = this.b;
        if (iArr.length > 0) {
            return iArr[iArr.length - 1];
        }
        return -1;
    }

    @Override // o4.q0
    public final q0 g() {
        return new o0(new Random(this.a.nextLong()));
    }

    @Override // o4.q0
    public final int getLength() {
        return this.b.length;
    }

    public o0(int[] iArr, Random random) {
        this.b = iArr;
        this.a = random;
        this.c = new int[iArr.length];
        for (int i10 = 0; i10 < iArr.length; i10++) {
            this.c[iArr[i10]] = i10;
        }
    }

    public o0(Random random) {
        this(new int[0], random);
    }
}
