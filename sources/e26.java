// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class e26 implements nv8 {
    public static final Object c = new Object();
    public volatile Object a = c;
    public volatile nv8 b;

    public e26(nv8 nv8Var) {
        this.b = nv8Var;
    }

    @Override // nv8
    public final Object get() {
        Object obj;
        Object obj2 = this.a;
        Object obj3 = c;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            obj = this.a;
            if (obj == obj3) {
                obj = this.b.get();
                this.a = obj;
                this.b = null;
            }
        }
        return obj;
    }
}
