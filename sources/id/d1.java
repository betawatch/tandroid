package id;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class d1 implements e1 {
    public final ad.l a;

    public d1(ad.l lVar) {
        this.a = lVar;
    }

    @Override // id.e1
    public final void a(Throwable th) {
        this.a.invoke(th);
    }

    public final String toString() {
        return "InternalCompletionHandler.UserSupplied[" + this.a.getClass().getSimpleName() + '@' + f0.k(this) + ']';
    }
}
