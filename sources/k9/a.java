package k9;

import b8.zb;
import java.io.Serializable;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
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

    public final boolean a(int i3) {
        int i10 = 0;
        while (true) {
            if (i10 >= this.b) {
                i10 = -1;
                break;
            }
            if (this.a[i10] == i3) {
                break;
            }
            i10++;
        }
        return i10 >= 0;
    }

    public final int b(int i3) {
        zb.j(i3, this.b);
        return this.a[i3];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            int i3 = aVar.b;
            int i10 = this.b;
            if (i10 == i3) {
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
        int i3 = 1;
        for (int i10 = 0; i10 < this.b; i10++) {
            i3 = (i3 * 31) + this.a[i10];
        }
        return i3;
    }

    public final String toString() {
        int i3 = this.b;
        if (i3 == 0) {
            return "[]";
        }
        StringBuilder sb2 = new StringBuilder(i3 * 5);
        sb2.append('[');
        int[] iArr = this.a;
        sb2.append(iArr[0]);
        for (int i10 = 1; i10 < i3; i10++) {
            sb2.append(", ");
            sb2.append(iArr[i10]);
        }
        sb2.append(']');
        return sb2.toString();
    }
}
