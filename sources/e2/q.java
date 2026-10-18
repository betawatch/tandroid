package e2;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
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
