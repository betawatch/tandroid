// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class iq3 implements lv8 {
    public static final Object c = new Object();
    public volatile lv8 a;
    public volatile Object b;

    public static lv8 a(lv8 lv8Var) {
        if (lv8Var instanceof iq3) {
            return lv8Var;
        }
        iq3 iq3Var = new iq3();
        iq3Var.b = c;
        iq3Var.a = lv8Var;
        return iq3Var;
    }

    @Override // mv8
    public final Object get() {
        Object obj;
        Object obj2 = this.b;
        Object obj3 = c;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            obj = this.b;
            if (obj == obj3) {
                obj = this.a.get();
                Object obj4 = this.b;
                if (obj4 != obj3 && obj4 != obj) {
                    throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                }
                this.b = obj;
                this.a = null;
            }
        }
        return obj;
    }
}
