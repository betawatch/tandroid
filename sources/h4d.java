// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class h4d implements l4d {
    public static final Object c = new Object();
    public volatile i4d a;
    public volatile Object b;

    /* JADX WARN: Multi-variable type inference failed */
    public static h4d b(i4d i4dVar) {
        if (i4dVar instanceof h4d) {
            return (h4d) i4dVar;
        }
        h4d h4dVar = new h4d();
        h4dVar.b = c;
        h4dVar.a = i4dVar;
        return h4dVar;
    }

    @Override // m4d
    public final Object a() {
        Object obj;
        Object obj2 = this.b;
        Object obj3 = c;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            obj = this.b;
            if (obj == obj3) {
                obj = this.a.a();
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
