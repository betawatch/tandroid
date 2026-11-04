package f9;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class v implements t {
    public static final c3.q d = new c3.q(1);
    public final Object a = new Object();
    public volatile t b;
    public Object c;

    public v(t tVar) {
        this.b = tVar;
    }

    @Override // f9.t
    public final Object get() {
        t tVar = this.b;
        c3.q qVar = d;
        if (tVar != qVar) {
            synchronized (this.a) {
                try {
                    if (this.b != qVar) {
                        Object obj = this.b.get();
                        this.c = obj;
                        this.b = qVar;
                        return obj;
                    }
                } finally {
                }
            }
        }
        return this.c;
    }

    public final String toString() {
        Object obj = this.b;
        StringBuilder sb2 = new StringBuilder("Suppliers.memoize(");
        if (obj == d) {
            obj = "<supplier that returned " + this.c + ">";
        }
        sb2.append(obj);
        sb2.append(")");
        return sb2.toString();
    }
}
