package d9;

import a3.s;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
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
