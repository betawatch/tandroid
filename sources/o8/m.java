package o8;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class m implements p {
    public static final Object c = new Object();
    public volatile p a;
    public volatile Object b;

    /* JADX WARN: Multi-variable type inference failed */
    public static m b(n nVar) {
        if (nVar instanceof m) {
            return (m) nVar;
        }
        m mVar = new m();
        mVar.b = c;
        mVar.a = nVar;
        return mVar;
    }

    @Override // o8.q
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
