// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
