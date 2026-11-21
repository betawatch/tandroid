package h2;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
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
