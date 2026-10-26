package b9;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class n implements r {
    public static final Object c = new Object();
    public volatile r a;
    public volatile Object b;

    /* JADX WARN: Multi-variable type inference failed */
    public static n b(o oVar) {
        if (oVar instanceof n) {
            return (n) oVar;
        }
        n nVar = new n();
        nVar.b = c;
        nVar.a = oVar;
        return nVar;
    }

    @Override // b9.s
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
