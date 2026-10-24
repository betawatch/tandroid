package d9;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final class w implements u {
    public static final a3.s d = new a3.s(1);
    public final Object a = new Object();
    public volatile u b;
    public Object c;

    public w(u uVar) {
        this.b = uVar;
    }

    @Override // d9.u
    public final Object get() {
        u uVar = this.b;
        a3.s sVar = d;
        if (uVar != sVar) {
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
