package j4;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class r0 {
    public final int a;
    public final boolean b;

    public r0(int i9, boolean z10) {
        this.a = i9;
        this.b = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || r0.class != obj.getClass()) {
            return false;
        }
        r0 r0Var = (r0) obj;
        return this.a == r0Var.a && this.b == r0Var.b;
    }

    public final int hashCode() {
        return (this.a * 31) + (this.b ? 1 : 0);
    }
}
