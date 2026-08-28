package j4;

import java.util.Arrays;
import java.util.Random;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class e1 implements g1 {
    public final Random a;
    public final int[] b;
    public final int[] c;

    public e1() {
        this(new Random());
    }

    @Override // j4.g1
    public final g1 a(int i9, int i10) {
        int i11 = i10 - i9;
        int[] iArr = this.b;
        int[] iArr2 = new int[iArr.length - i11];
        int i12 = 0;
        for (int i13 = 0; i13 < iArr.length; i13++) {
            int i14 = iArr[i13];
            if (i14 < i9 || i14 >= i10) {
                int i15 = i13 - i12;
                if (i14 >= i9) {
                    i14 -= i11;
                }
                iArr2[i15] = i14;
            } else {
                i12++;
            }
        }
        return new e1(iArr2, new Random(this.a.nextLong()));
    }

    @Override // j4.g1
    public final int b() {
        int[] iArr = this.b;
        if (iArr.length > 0) {
            return iArr[0];
        }
        return -1;
    }

    @Override // j4.g1
    public final int c(int i9) {
        int i10 = this.c[i9] - 1;
        if (i10 >= 0) {
            return this.b[i10];
        }
        return -1;
    }

    @Override // j4.g1
    public final int d(int i9) {
        int i10 = this.c[i9] + 1;
        int[] iArr = this.b;
        if (i10 < iArr.length) {
            return iArr[i10];
        }
        return -1;
    }

    @Override // j4.g1
    public final g1 e(int i9, int i10) {
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
            iArr3[nextInt] = i11 + i9;
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
                if (i17 >= i9) {
                    iArr4[i15] = i17 + i10;
                }
                i14 = i16;
            } else {
                iArr4[i15] = iArr3[i13];
                i13++;
            }
        }
        return new e1(iArr4, new Random(random.nextLong()));
    }

    @Override // j4.g1
    public final int f() {
        int[] iArr = this.b;
        if (iArr.length > 0) {
            return iArr[iArr.length - 1];
        }
        return -1;
    }

    @Override // j4.g1
    public final g1 g() {
        return new e1(new Random(this.a.nextLong()));
    }

    @Override // j4.g1
    public final int getLength() {
        return this.b.length;
    }

    public e1(int[] iArr, Random random) {
        this.b = iArr;
        this.a = random;
        this.c = new int[iArr.length];
        for (int i9 = 0; i9 < iArr.length; i9++) {
            this.c[iArr[i9]] = i9;
        }
    }

    public e1(Random random) {
        this(new int[0], random);
    }
}
