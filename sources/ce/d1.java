package ce;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class d1 implements e1 {
    public final ud.l a;

    public d1(ud.l lVar) {
        this.a = lVar;
    }

    @Override // ce.e1
    public final void a(Throwable th2) {
        this.a.invoke(th2);
    }

    public final String toString() {
        return "InternalCompletionHandler.UserSupplied[" + this.a.getClass().getSimpleName() + '@' + f0.k(this) + ']';
    }
}
