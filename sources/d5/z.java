package d5;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class z {
    public static final z c = new z(-1, -1);
    public final int a;
    public final int b;

    static {
        new z(0, 0);
    }

    public z(int i9, int i10) {
        a.f((i9 == -1 || i9 >= 0) && (i10 == -1 || i10 >= 0));
        this.a = i9;
        this.b = i10;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof z) {
            z zVar = (z) obj;
            if (this.a == zVar.a && this.b == zVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i9 = this.a;
        return ((i9 >>> 16) | (i9 << 16)) ^ this.b;
    }

    public final String toString() {
        return this.a + "x" + this.b;
    }
}
