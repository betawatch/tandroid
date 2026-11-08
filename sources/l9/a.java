package l9;

import a8.ia;
import java.io.Serializable;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final class a implements Serializable {
    public static final a c = new a(new int[0]);
    public final int[] a;
    public final int b;

    public a(int[] iArr) {
        int length = iArr.length;
        this.a = iArr;
        this.b = length;
    }

    public final boolean a(int i7) {
        int i10 = 0;
        while (true) {
            if (i10 >= this.b) {
                i10 = -1;
                break;
            }
            if (this.a[i10] == i7) {
                break;
            }
            i10++;
        }
        return i10 >= 0;
    }

    public final int b(int i7) {
        ia.j(i7, this.b);
        return this.a[i7];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            int i7 = aVar.b;
            int i10 = this.b;
            if (i10 == i7) {
                for (int i11 = 0; i11 < i10; i11++) {
                    if (b(i11) == aVar.b(i11)) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7 = 1;
        for (int i10 = 0; i10 < this.b; i10++) {
            i7 = (i7 * 31) + this.a[i10];
        }
        return i7;
    }

    public final String toString() {
        int i7 = this.b;
        if (i7 == 0) {
            return "[]";
        }
        StringBuilder sb2 = new StringBuilder(i7 * 5);
        sb2.append('[');
        int[] iArr = this.a;
        sb2.append(iArr[0]);
        for (int i10 = 1; i10 < i7; i10++) {
            sb2.append(", ");
            sb2.append(iArr[i10]);
        }
        sb2.append(']');
        return sb2.toString();
    }
}
