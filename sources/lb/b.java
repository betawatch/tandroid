package lb;

import java.util.Arrays;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class b implements Cloneable {
    public int a;
    public int b;
    public int c;
    public int[] d;

    public b(int i9, int i10) {
        if (i9 < 1 || i10 < 1) {
            throw new IllegalArgumentException("Both dimensions must be greater than 0");
        }
        this.a = i9;
        this.b = i10;
        int i11 = (i9 + 31) / 32;
        this.c = i11;
        this.d = new int[i11 * i10];
    }

    public final void a(int i9, int i10) {
        int i11 = (i9 / 32) + (i10 * this.c);
        int[] iArr = this.d;
        iArr[i11] = (1 << (i9 & 31)) ^ iArr[i11];
    }

    public final boolean b(int i9, int i10) {
        return ((this.d[(i9 / 32) + (i10 * this.c)] >>> (i9 & 31)) & 1) != 0;
    }

    public final void c(int i9, int i10, int i11, int i12) {
        if (i10 < 0 || i9 < 0) {
            throw new IllegalArgumentException("Left and top must be nonnegative");
        }
        if (i12 < 1 || i11 < 1) {
            throw new IllegalArgumentException("Height and width must be at least 1");
        }
        int i13 = i11 + i9;
        int i14 = i12 + i10;
        if (i14 > this.b || i13 > this.a) {
            throw new IllegalArgumentException("The region must fit inside the matrix");
        }
        while (i10 < i14) {
            int i15 = this.c * i10;
            for (int i16 = i9; i16 < i13; i16++) {
                int[] iArr = this.d;
                int i17 = (i16 / 32) + i15;
                iArr[i17] = iArr[i17] | (1 << (i16 & 31));
            }
            i10++;
        }
    }

    public final Object clone() {
        int i9 = this.a;
        int i10 = this.b;
        int i11 = this.c;
        int[] iArr = (int[]) this.d.clone();
        b bVar = new b();
        bVar.a = i9;
        bVar.b = i10;
        bVar.c = i11;
        bVar.d = iArr;
        return bVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.a == bVar.a && this.b == bVar.b && this.c == bVar.c && Arrays.equals(this.d, bVar.d);
    }

    public final int hashCode() {
        int i9 = this.a;
        return Arrays.hashCode(this.d) + (((((((i9 * 31) + i9) * 31) + this.b) * 31) + this.c) * 31);
    }

    public final String toString() {
        int i9 = this.b;
        int i10 = this.a;
        StringBuilder sb2 = new StringBuilder((i10 + 1) * i9);
        for (int i11 = 0; i11 < i9; i11++) {
            for (int i12 = 0; i12 < i10; i12++) {
                sb2.append(b(i12, i11) ? "X " : "  ");
            }
            sb2.append("\n");
        }
        return sb2.toString();
    }
}
