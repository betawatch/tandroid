package h3;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class i2 {
    public static final i2 b = new i2(false);
    public final boolean a;

    public i2(boolean z10) {
        this.a = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && i2.class == obj.getClass() && this.a == ((i2) obj).a;
    }

    public final int hashCode() {
        return !this.a ? 1 : 0;
    }
}
