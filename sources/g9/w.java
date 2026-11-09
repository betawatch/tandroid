package g9;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public final class w implements u {
    public static final d3.q d = new d3.q(1);
    public final Object a = new Object();
    public volatile u b;
    public Object c;

    public w(u uVar) {
        this.b = uVar;
    }

    @Override // g9.u
    public final Object get() {
        u uVar = this.b;
        d3.q qVar = d;
        if (uVar != qVar) {
            synchronized (this.a) {
                try {
                    if (this.b != qVar) {
                        Object obj = this.b.get();
                        this.c = obj;
                        this.b = qVar;
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
