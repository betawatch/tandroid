// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
