package m;

import androidx.appcompat.widget.Toolbar;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes.dex */
public final /* synthetic */ class e3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Toolbar b;

    public /* synthetic */ e3(Toolbar toolbar, int i10) {
        this.a = i10;
        this.b = toolbar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                g3 g3Var = this.b.e0;
                l.n nVar = g3Var == null ? null : g3Var.b;
                if (nVar != null) {
                    nVar.collapseActionView();
                    break;
                }
                break;
            default:
                this.b.m();
                break;
        }
    }
}
