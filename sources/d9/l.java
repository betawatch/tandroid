package d9;

import a3.r;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class l implements j {
    public static final r d = new r(1);
    public final Object a = new Object();
    public volatile j b;
    public Object c;

    public l(j jVar) {
        this.b = jVar;
    }

    @Override // d9.j
    public final Object get() {
        j jVar = this.b;
        r rVar = d;
        if (jVar != rVar) {
            synchronized (this.a) {
                try {
                    if (this.b != rVar) {
                        Object obj = this.b.get();
                        this.c = obj;
                        this.b = rVar;
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
