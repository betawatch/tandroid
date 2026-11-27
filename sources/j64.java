// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final /* synthetic */ class j64 implements b86 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ s64 b;

    public /* synthetic */ j64(s64 s64Var, byte b) {
        this.a = b;
        this.b = s64Var;
    }

    @Override // b86
    public final void invoke(Object obj) {
        byte b = this.a;
        s64 s64Var = this.b;
        bg8 bg8Var = (bg8) obj;
        switch (b) {
            case 2:
                bg8Var.K(s64Var.P);
                break;
            default:
                bg8Var.C(s64Var.R);
                break;
        }
    }
}
