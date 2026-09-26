package e2;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes.dex */
public final class o {
    public final Object a;
    public b2.p b = new b2.p();
    public boolean c;
    public boolean d;

    public o(Object obj) {
        this.a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((o) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
