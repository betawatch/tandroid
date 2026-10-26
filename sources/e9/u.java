package e9;

import java.io.Serializable;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class u implements t, Serializable {
    public final transient Object a = new Object();
    public final t b;
    public volatile transient boolean c;
    public transient Object d;

    public u(t tVar) {
        this.b = tVar;
    }

    @Override // e9.t
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
