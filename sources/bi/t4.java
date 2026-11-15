package bi;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class t4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.g5 b;

    public /* synthetic */ t4(org.telegram.ui.ActionBar.g5 g5Var, int i7) {
        this.a = i7;
        this.b = g5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.a(true);
                break;
            case 1:
                this.b.a(true);
                break;
            default:
                org.telegram.ui.ActionBar.g5 g5Var = this.b;
                if (!g5Var.E && g5Var.O) {
                    g5Var.c();
                    break;
                }
                break;
        }
    }
}
