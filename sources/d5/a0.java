package d5;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class a0 {
    public static final a0 c = new a0(-1, -1);
    public final int a;
    public final int b;

    static {
        new a0(0, 0);
    }

    public a0(int i10, int i11) {
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
        if (obj instanceof a0) {
            a0 a0Var = (a0) obj;
            if (this.a == a0Var.a && this.b == a0Var.b) {
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
