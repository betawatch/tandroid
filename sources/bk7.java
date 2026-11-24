// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class bk7 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ kk7 b;

    public /* synthetic */ bk7(kk7 kk7Var, byte b) {
        this.a = b;
        this.b = kk7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        kk7 kk7Var = this.b;
        switch (b) {
            case 0:
            case 2:
                kk7Var.c();
                break;
            case 1:
                kk7Var.getClass();
                kk7Var.i = new bk7(kk7Var, (byte) 2);
                break;
            default:
                kk7Var.o();
                break;
        }
    }
}
