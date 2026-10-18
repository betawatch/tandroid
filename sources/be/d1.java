package be;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes.dex */
public final class d1 implements e1 {
    public final td.l a;

    public d1(td.l lVar) {
        this.a = lVar;
    }

    @Override // be.e1
    public final void a(Throwable th2) {
        this.a.invoke(th2);
    }

    public final String toString() {
        return "InternalCompletionHandler.UserSupplied[" + this.a.getClass().getSimpleName() + '@' + f0.k(this) + ']';
    }
}
