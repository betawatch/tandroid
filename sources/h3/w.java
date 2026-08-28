package h3;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class w implements d5.l, d5.k {
    public final /* synthetic */ k0 a;

    public /* synthetic */ w(k0 k0Var) {
        this.a = k0Var;
    }

    @Override // d5.l
    public void g(Object obj, d5.g gVar) {
        ((a2) obj).onEvents(this.a.f, new z1(gVar));
    }

    @Override // d5.k
    public void invoke(Object obj) {
        ((a2) obj).onAvailableCommandsChanged(this.a.N);
    }
}
