package ei;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.xc;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes4.dex */
public final /* synthetic */ class e3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.a2 b;

    public /* synthetic */ e3(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        this.a = i10;
        this.b = a2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.dismiss();
                break;
            default:
                this.b.dismiss();
                org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                if (U != null) {
                    qc Q = xc.a0(U).Q(R.raw.error, 36, LocaleController.getString(R.string.MessageNotFound));
                    Q.t = true;
                    Q.j();
                    break;
                }
                break;
        }
    }
}
