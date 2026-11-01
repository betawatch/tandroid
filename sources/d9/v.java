package d9;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class v implements t {
    public static final a3.s d = new a3.s(1);
    public final Object a = new Object();
    public volatile t b;
    public Object c;

    public v(t tVar) {
        this.b = tVar;
    }

    @Override // d9.t
    public final Object get() {
        t tVar = this.b;
        a3.s sVar = d;
        if (tVar != sVar) {
            synchronized (this.a) {
                try {
                    if (this.b != sVar) {
                        Object obj = this.b.get();
                        this.c = obj;
                        this.b = sVar;
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
