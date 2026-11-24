// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final /* synthetic */ class a87 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ na7 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Runnable d;

    public /* synthetic */ a87(na7 na7Var, long j, Runnable runnable, byte b) {
        this.a = b;
        this.b = na7Var;
        this.c = j;
        this.d = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        Runnable runnable = this.d;
        long j = this.c;
        na7 na7Var = this.b;
        switch (b) {
            case 0:
                na7Var.Y2(0, j, true);
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            default:
                na7Var.Y2(0, j, true);
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
        }
    }
}
