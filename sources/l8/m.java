package l8;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
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

    @Override // l8.q
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
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }
}
