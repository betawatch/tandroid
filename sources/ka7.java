// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final /* synthetic */ class ka7 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ uc7 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Runnable d;

    public /* synthetic */ ka7(uc7 uc7Var, long j, Runnable runnable, byte b) {
        this.a = b;
        this.b = uc7Var;
        this.c = j;
        this.d = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        Runnable runnable = this.d;
        long j = this.c;
        uc7 uc7Var = this.b;
        switch (b) {
            case 0:
                uc7Var.e3(0, j, true);
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            default:
                uc7Var.e3(0, j, true);
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
        }
    }
}
