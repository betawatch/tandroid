// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class db0 extends d6 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ob0 b;

    public /* synthetic */ db0(ob0 ob0Var, byte b) {
        this.a = b;
        this.b = ob0Var;
    }

    @Override // d6
    public final void b(int i) {
        byte b = this.a;
        ob0 ob0Var = this.b;
        switch (b) {
            case 0:
                if (i == -1) {
                    ob0Var.h0();
                    break;
                }
                break;
            default:
                if (i == -1) {
                    ob0Var.h0();
                }
                if (i == 1) {
                    ob0Var.j0();
                    break;
                }
                break;
        }
    }
}
