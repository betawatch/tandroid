package bi;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class e7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.j5 b;

    public /* synthetic */ e7(org.telegram.ui.ActionBar.j5 j5Var, int i7) {
        this.a = i7;
        this.b = j5Var;
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
                org.telegram.ui.ActionBar.j5 j5Var = this.b;
                if (!j5Var.I && j5Var.S) {
                    j5Var.c();
                    break;
                }
                break;
        }
    }
}
