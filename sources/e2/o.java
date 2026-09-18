package e2;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
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
