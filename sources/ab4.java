// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final /* synthetic */ class ab4 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hb4 b;
    public final /* synthetic */ gb4 c;

    public /* synthetic */ ab4(hb4 hb4Var, gb4 gb4Var, byte b) {
        this.a = b;
        this.b = hb4Var;
        this.c = gb4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        gb4 gb4Var = this.c;
        hb4 hb4Var = this.b;
        switch (b) {
            case 0:
                hb4Var.k(gb4Var, null);
                gb4Var.f.freeResources();
                break;
            default:
                gb4Var.l = null;
                hb4Var.H0.remove(gb4Var);
                gb4Var.k = true;
                break;
        }
    }
}
