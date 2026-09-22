package d9;

import a3.s;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes.dex */
public final class l implements j {
    public static final s d = new s(1);
    public final Object a = new Object();
    public volatile j b;
    public Object c;

    public l(j jVar) {
        this.b = jVar;
    }

    @Override // d9.j
    public final Object get() {
        j jVar = this.b;
        s sVar = d;
        if (jVar != sVar) {
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
