package a9;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class p implements s {
    public static final Object c = new Object();
    public volatile s a;
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

    @Override // a9.t
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
