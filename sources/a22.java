// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class a22 implements fd, h22, nu4 {
    public final /* synthetic */ j22 a;

    public /* synthetic */ a22(j22 j22Var) {
        this.a = j22Var;
    }

    @Override // h22
    public final void e(boolean z) {
        j22 j22Var = this.a;
        if (j22Var.O()) {
            return;
        }
        j22Var.K.d(0.0f);
    }

    @Override // nu4
    public final Object h(Object obj) {
        return Boolean.valueOf(this.a.b.o3.getKeyboardHeight() >= hl.L(20.0f));
    }

    @Override // fd
    public final void w(id idVar, int i) {
        this.a.b.dismiss();
    }
}
