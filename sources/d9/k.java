package d9;

import a3.s;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes.dex */
public final class k implements i {
    public static final s d = new s(1);
    public final Object a = new Object();
    public volatile i b;
    public Object c;

    public k(i iVar) {
        this.b = iVar;
    }

    @Override // d9.i
    public final Object get() {
        i iVar = this.b;
        s sVar = d;
        if (iVar != sVar) {
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
