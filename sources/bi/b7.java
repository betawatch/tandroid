package bi;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class b7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.k5 b;

    public /* synthetic */ b7(org.telegram.ui.ActionBar.k5 k5Var, int i7) {
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
