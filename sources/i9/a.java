package i9;

import java.io.Serializable;
import v7.u6;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
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

    public final boolean a(int i10) {
        int i11 = 0;
        while (true) {
            if (i11 >= this.b) {
                i11 = -1;
                break;
            }
            if (this.a[i11] == i10) {
                break;
            }
            i11++;
        }
        return i11 >= 0;
    }

    public final int b(int i10) {
        u6.j(i10, this.b);
        return this.a[i10];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            int i10 = aVar.b;
            int i11 = this.b;
            if (i11 == i10) {
                for (int i12 = 0; i12 < i11; i12++) {
                    if (b(i12) == aVar.b(i12)) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.b; i11++) {
            i10 = (i10 * 31) + this.a[i11];
        }
        return i10;
    }

    public final String toString() {
        int i10 = this.b;
        if (i10 == 0) {
            return "[]";
        }
        StringBuilder sb2 = new StringBuilder(i10 * 5);
        sb2.append('[');
        int[] iArr = this.a;
        sb2.append(iArr[0]);
        for (int i11 = 1; i11 < i10; i11++) {
            sb2.append(", ");
            sb2.append(iArr[i11]);
        }
        sb2.append(']');
        return sb2.toString();
    }
}
