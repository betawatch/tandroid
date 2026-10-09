package ae;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class e1 implements f1 {
    public final sd.l a;

    public e1(sd.l lVar) {
        this.a = lVar;
    }

    @Override // ae.f1
    public final void a(Throwable th2) {
        this.a.invoke(th2);
    }

    public final String toString() {
        return "InternalCompletionHandler.UserSupplied[" + this.a.getClass().getSimpleName() + '@' + g0.k(this) + ']';
    }
}
