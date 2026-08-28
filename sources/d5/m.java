package d5;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class m {
    public final Object a;
    public c2.t b = new c2.t();
    public boolean c;
    public boolean d;

    public m(Object obj) {
        this.a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((m) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
