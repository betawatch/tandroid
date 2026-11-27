// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class lx7 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ nx7 b;
    public final /* synthetic */ rx c;

    public /* synthetic */ lx7(nx7 nx7Var, rx rxVar, byte b) {
        this.a = b;
        this.b = nx7Var;
        this.c = rxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        rx rxVar = this.c;
        nx7 nx7Var = this.b;
        switch (b) {
            case 0:
                nx7Var.p(rxVar, true);
                break;
            default:
                nx7Var.f.f(new lx7(nx7Var, rxVar, (byte) 0));
                break;
        }
    }
}
