// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class l42 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ s42 b;
    public final /* synthetic */ xj5 c;

    public /* synthetic */ l42(s42 s42Var, xj5 xj5Var, byte b) {
        this.a = b;
        this.b = s42Var;
        this.c = xj5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        xj5 xj5Var = this.c;
        s42 s42Var = this.b;
        switch (b) {
            case 0:
                try {
                    ((am2) xj5Var).F();
                } catch (Exception unused) {
                }
                hl.c3(new l42(s42Var, xj5Var, (byte) 1));
                break;
            default:
                s42Var.T(xj5Var);
                break;
        }
    }
}
