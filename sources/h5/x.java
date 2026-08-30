package h5;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class x {
    public static final x c = new x(-1, -1);
    public final int a;
    public final int b;

    static {
        new x(0, 0);
    }

    public x(int i10, int i11) {
        a.f((i10 == -1 || i10 >= 0) && (i11 == -1 || i11 >= 0));
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
        if (obj instanceof x) {
            x xVar = (x) obj;
            if (this.a == xVar.a && this.b == xVar.b) {
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
