package h2;

import a8.ia;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
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

    public y(int i7, int i10) {
        ia.f((i7 == -1 || i7 >= 0) && (i10 == -1 || i10 >= 0));
        this.a = i7;
        this.b = i10;
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
        int i7 = this.a;
        return ((i7 >>> 16) | (i7 << 16)) ^ this.b;
    }

    public final String toString() {
        return this.a + "x" + this.b;
    }
}
