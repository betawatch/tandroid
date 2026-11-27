// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class gda implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ kea b;

    public /* synthetic */ gda(kea keaVar, byte b) {
        this.a = b;
        this.b = keaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        kea keaVar = this.b;
        switch (b) {
            case 0:
                keaVar.v2 = true;
                rq4 rq4Var = keaVar.t2;
                rq4Var.r.setText("");
                hl.E3(rq4Var.r);
                break;
            default:
                pg6 pg6Var = new pg6((byte) 24);
                if (!keaVar.d) {
                    pg6Var.run();
                    break;
                } else {
                    rq4 rq4Var2 = keaVar.t2;
                    if (rq4Var2 != null) {
                        hl.t1(rq4Var2.r);
                    }
                    hl.d3(pg6Var, 300L);
                    break;
                }
        }
    }
}
