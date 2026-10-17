package d9;

import java.io.Serializable;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes.dex */
public final class v implements u, Serializable {
    public final transient Object a = new Object();
    public final u b;
    public volatile transient boolean c;
    public transient Object d;

    public v(u uVar) {
        this.b = uVar;
    }

    @Override // d9.u
    public final Object get() {
        if (!this.c) {
            synchronized (this.a) {
                try {
                    if (!this.c) {
                        Object obj = this.b.get();
                        this.d = obj;
                        this.c = true;
                        return obj;
                    }
                } finally {
                }
            }
        }
        return this.d;
    }

    public final String toString() {
        Object obj;
        StringBuilder sb2 = new StringBuilder("Suppliers.memoize(");
        if (this.c) {
            obj = "<supplier that returned " + this.d + ">";
        } else {
            obj = this.b;
        }
        sb2.append(obj);
        sb2.append(")");
        return sb2.toString();
    }
}
