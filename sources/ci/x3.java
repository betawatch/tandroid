package ci;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes4.dex */
public final /* synthetic */ class x3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ a4 b;

    public /* synthetic */ x3(a4 a4Var, int i10) {
        this.a = i10;
        this.b = a4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.dismiss();
                break;
            default:
                super/*org.telegram.ui.ActionBar.e3*/.dismiss();
                break;
        }
    }
}
