package j3;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
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
