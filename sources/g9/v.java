package g9;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final class v implements t {
    public static final d3.p d = new d3.p(1);
    public final Object a = new Object();
    public volatile t b;
    public Object c;

    public v(t tVar) {
        this.b = tVar;
    }

    @Override // g9.t
    public final Object get() {
        t tVar = this.b;
        d3.p pVar = d;
        if (tVar != pVar) {
            synchronized (this.a) {
                try {
                    if (this.b != pVar) {
                        Object obj = this.b.get();
                        this.c = obj;
                        this.b = pVar;
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
