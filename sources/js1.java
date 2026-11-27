// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class js1 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ks1 b;

    public /* synthetic */ js1(ks1 ks1Var, byte b) {
        this.a = b;
        this.b = ks1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        ks1 ks1Var = this.b;
        switch (b) {
            case 0:
                nr1 nr1Var = ks1Var.I.a0;
                if (nr1Var != null) {
                    nr1Var.o1();
                    break;
                }
                break;
            default:
                nr1 nr1Var2 = ks1Var.I.a0;
                if (nr1Var2 != null) {
                    nr1Var2.U0 = false;
                    my1 my1Var = nr1Var2.V0;
                    if (my1Var != null) {
                        my1Var.s(false);
                        break;
                    }
                }
                break;
        }
    }
}
