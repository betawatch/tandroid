package i2;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes.dex */
public final class n1 {
    public static final n1 c = new n1(0, false);
    public final int a;
    public final boolean b;

    public n1(int i10, boolean z10) {
        this.a = i10;
        this.b = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && n1.class == obj.getClass()) {
            n1 n1Var = (n1) obj;
            if (this.a == n1Var.a && this.b == n1Var.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a << 1) + (this.b ? 1 : 0);
    }
}
