package j3;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
