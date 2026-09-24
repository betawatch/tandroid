package a9;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes.dex */
public final class p implements t {
    public static final Object c = new Object();
    public volatile t a;
    public volatile Object b;

    /* JADX WARN: Multi-variable type inference failed */
    public static p b(q qVar) {
        if (qVar instanceof p) {
            return (p) qVar;
        }
        p pVar = new p();
        pVar.b = c;
        pVar.a = qVar;
        return pVar;
    }

    @Override // a9.u
    public final Object a() {
        Object obj;
        Object obj2 = this.b;
        Object obj3 = c;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
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
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return obj;
    }
}
