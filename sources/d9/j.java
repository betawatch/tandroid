package d9;

import java.io.Serializable;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes.dex */
public final class j implements i, Serializable {
    public final transient Object a = new Object();
    public final i b;
    public volatile transient boolean c;
    public transient Object d;

    public j(i iVar) {
        this.b = iVar;
    }

    @Override // d9.i
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
