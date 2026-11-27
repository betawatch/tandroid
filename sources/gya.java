// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class gya implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Runnable b;
    public final /* synthetic */ Runnable c;

    public /* synthetic */ gya(Runnable runnable, Runnable runnable2, byte b) {
        this.a = b;
        this.b = runnable;
        this.c = runnable2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        Runnable runnable = this.c;
        Runnable runnable2 = this.b;
        switch (b) {
            case 0:
                runnable2.run();
                runnable.run();
                break;
            default:
                hnb.b(runnable2);
                if (runnable != null) {
                    hl.c3(runnable);
                    break;
                }
                break;
        }
    }
}
