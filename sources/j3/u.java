package j3;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final /* synthetic */ class u implements h5.k, h5.j {
    public final /* synthetic */ f0 a;

    public /* synthetic */ u(f0 f0Var) {
        this.a = f0Var;
    }

    @Override // h5.k
    public void d(Object obj, h5.g gVar) {
        ((y1) obj).onEvents(this.a.f, new x1(gVar));
    }

    @Override // h5.j
    public void invoke(Object obj) {
        ((y1) obj).onAvailableCommandsChanged(this.a.L);
    }
}
