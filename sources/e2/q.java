package e2;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public final class q {
    public final Object a;
    public b2.t b = new b2.t();
    public boolean c;
    public boolean d;

    public q(Object obj) {
        this.a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((q) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
