// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class hda implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ kea b;

    public /* synthetic */ hda(kea keaVar, byte b) {
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
