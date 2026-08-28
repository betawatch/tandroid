package hd;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class d1 implements e1 {
    public final zc.l a;

    public d1(zc.l lVar) {
        this.a = lVar;
    }

    @Override // hd.e1
    public final void a(Throwable th) {
        this.a.invoke(th);
    }

    public final String toString() {
        return "InternalCompletionHandler.UserSupplied[" + this.a.getClass().getSimpleName() + '@' + f0.k(this) + ']';
    }
}
