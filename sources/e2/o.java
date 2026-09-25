package e2;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
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
