// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class jq3 implements mv8 {
    public static final Object c = new Object();
    public volatile mv8 a;
    public volatile Object b;

    public static mv8 a(mv8 mv8Var) {
        if (mv8Var instanceof jq3) {
            return mv8Var;
        }
        jq3 jq3Var = new jq3();
        jq3Var.b = c;
        jq3Var.a = mv8Var;
        return jq3Var;
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
