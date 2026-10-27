package bi;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class q4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.e2 b;

    public /* synthetic */ q4(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        this.a = i10;
        this.b = e2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.dismiss();
                org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
                if (U != null) {
                    org.telegram.ui.Components.qc R = org.telegram.ui.Components.wc.b0(U).R(R.raw.error, 36, LocaleController.getString(R.string.MessageNotFound));
                    R.u = true;
                    R.j();
                    break;
                }
                break;
            default:
                this.b.dismiss();
                break;
        }
    }
}
