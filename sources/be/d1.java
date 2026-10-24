package be;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
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
