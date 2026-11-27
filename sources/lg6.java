// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class lg6 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ tg6 b;
    public final /* synthetic */ int c;

    public /* synthetic */ lg6(tg6 tg6Var, int i, byte b) {
        this.a = b;
        this.b = tg6Var;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        int i = this.c;
        tg6 tg6Var = this.b;
        switch (b) {
            case 0:
                hl.c3(new lg6(tg6Var, i, (byte) 1));
                break;
            case 1:
                tg6Var.z(i);
                break;
            default:
                tg6Var.f.f[i].D(1.0f);
                break;
        }
    }
}
