// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
