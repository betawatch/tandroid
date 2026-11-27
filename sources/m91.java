// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class m91 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ o91 b;

    public /* synthetic */ m91(o91 o91Var, byte b) {
        this.a = b;
        this.b = o91Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        o91 o91Var = this.b;
        switch (b) {
            case 0:
                o91Var.x = false;
                o91Var.c();
                break;
            default:
                o91Var.a.setVisibility(4);
                break;
        }
    }
}
