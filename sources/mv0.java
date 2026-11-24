// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final /* synthetic */ class mv0 implements q12, js4, ed {
    public final /* synthetic */ ow0 a;

    public /* synthetic */ mv0(ow0 ow0Var) {
        this.a = ow0Var;
    }

    @Override // q12
    public final void d(boolean z) {
        ow0 ow0Var = this.a;
        if (ow0Var.f0 && z) {
            return;
        }
        ow0Var.m(true);
    }

    @Override // js4
    public final Object m(Object obj) {
        return Boolean.valueOf(this.a.f.getKeyboardHeight() >= gl.L(20.0f));
    }

    @Override // ed
    public final void u(hd hdVar, int i) {
        this.a.m(false);
    }
}
