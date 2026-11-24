// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class k12 implements ed, q12, js4 {
    public final /* synthetic */ s12 a;

    public /* synthetic */ k12(s12 s12Var) {
        this.a = s12Var;
    }

    @Override // q12
    public final void d(boolean z) {
        s12 s12Var = this.a;
        if (s12Var.P()) {
            return;
        }
        s12Var.K.d(0.0f);
    }

    @Override // js4
    public final Object m(Object obj) {
        return Boolean.valueOf(this.a.b.o3.getKeyboardHeight() >= gl.L(20.0f));
    }

    @Override // ed
    public final void u(hd hdVar, int i) {
        this.a.b.dismiss();
    }
}
