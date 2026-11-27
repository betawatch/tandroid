// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class ofb implements mfb {
    public static final m40 d = new m40(7);
    public final Object a = new Object();
    public volatile mfb b;
    public Object c;

    public ofb(mfb mfbVar) {
        this.b = mfbVar;
    }

    @Override // mfb
    public final Object get() {
        mfb mfbVar = this.b;
        m40 m40Var = d;
        if (mfbVar != m40Var) {
            synchronized (this.a) {
                if (this.b != m40Var) {
                    Object obj = this.b.get();
                    this.c = obj;
                    this.b = m40Var;
                    return obj;
                }
            }
        }
        return this.c;
    }

    public final String toString() {
        Object obj = this.b;
        StringBuilder sb = new StringBuilder("Suppliers.memoize(");
        if (obj == d) {
            obj = "<supplier that returned " + this.c + ">";
        }
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }
}
