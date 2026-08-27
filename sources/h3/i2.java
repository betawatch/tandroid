package h3;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
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
