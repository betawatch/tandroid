package d9;

import a3.r;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
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
