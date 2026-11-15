package h2;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class q {
    public final Object a;
    public ca.i b = new ca.i();
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
