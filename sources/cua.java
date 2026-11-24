// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class cua implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Runnable b;
    public final /* synthetic */ Runnable c;

    public /* synthetic */ cua(Runnable runnable, Runnable runnable2, byte b) {
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
                ijb.b(runnable2);
                if (runnable != null) {
                    gl.c3(runnable);
                    break;
                }
                break;
        }
    }
}
