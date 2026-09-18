package d9;

import java.io.Serializable;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
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
