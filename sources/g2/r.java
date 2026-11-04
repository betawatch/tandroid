package g2;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class r {
    public final Object a;
    public ba.i b = new ba.i();
    public boolean c;
    public boolean d;

    public r(Object obj) {
        this.a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || r.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((r) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
