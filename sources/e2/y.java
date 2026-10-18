package e2;

import v7.u6;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes.dex */
public final class y {
    public static final y c = new y(-1, -1);
    public final int a;
    public final int b;

    static {
        new y(0, 0);
        Integer.toString(0, 36);
        Integer.toString(1, 36);
    }

    public y(int i10, int i11) {
        u6.g((i10 == -1 || i10 >= 0) && (i11 == -1 || i11 >= 0));
        this.a = i10;
        this.b = i11;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof y) {
            y yVar = (y) obj;
            if (this.a == yVar.a && this.b == yVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.a;
        return ((i10 >>> 16) | (i10 << 16)) ^ this.b;
    }

    public final String toString() {
        return this.a + "x" + this.b;
    }
}
