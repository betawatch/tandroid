package bi;

import android.view.View;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class bb implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ rc b;

    public /* synthetic */ bb(rc rcVar, int i10) {
        this.a = i10;
        this.b = rcVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        org.telegram.ui.ActionBar.r2 R;
        org.telegram.ui.ActionBar.r2 R2;
        switch (this.a) {
            case 0:
                if (this.b.f > 0 && (R = LaunchActivity.R()) != null) {
                    org.telegram.ui.ActionBar.p2 p2Var = new org.telegram.ui.ActionBar.p2();
                    p2Var.a = true;
                    R.showAsSheet(new dd(), p2Var);
                    break;
                }
                break;
            default:
                if (this.b.f > 0 && (R2 = LaunchActivity.R()) != null) {
                    org.telegram.ui.ActionBar.p2 p2Var2 = new org.telegram.ui.ActionBar.p2();
                    p2Var2.a = true;
                    R2.showAsSheet(new dd(), p2Var2);
                    break;
                }
                break;
        }
    }
}
