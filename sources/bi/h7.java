package bi;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class h7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.k5 b;

    public /* synthetic */ h7(org.telegram.ui.ActionBar.k5 k5Var, int i7) {
        this.a = i7;
        this.b = k5Var;
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
                org.telegram.ui.ActionBar.k5 k5Var = this.b;
                if (!k5Var.I && k5Var.S) {
                    k5Var.c();
                    break;
                }
                break;
        }
    }
}
