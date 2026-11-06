package bi;

import android.view.View;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final /* synthetic */ class tb implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ sc b;

    public /* synthetic */ tb(sc scVar, int i7) {
        this.a = i7;
        this.b = scVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        org.telegram.ui.ActionBar.f2 Q;
        org.telegram.ui.ActionBar.f2 Q2;
        switch (this.a) {
            case 0:
                if (this.b.f > 0 && (Q = LaunchActivity.Q()) != null) {
                    org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2();
                    d2Var.a = true;
                    Q.showAsSheet(new dd(), d2Var);
                    break;
                }
                break;
            default:
                if (this.b.f > 0 && (Q2 = LaunchActivity.Q()) != null) {
                    org.telegram.ui.ActionBar.d2 d2Var2 = new org.telegram.ui.ActionBar.d2();
                    d2Var2.a = true;
                    Q2.showAsSheet(new dd(), d2Var2);
                    break;
                }
                break;
        }
    }
}
