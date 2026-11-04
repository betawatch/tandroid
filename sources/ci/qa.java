package ci;

import android.view.View;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qa implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ lb b;

    public /* synthetic */ qa(lb lbVar, int i3) {
        this.a = i3;
        this.b = lbVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        org.telegram.ui.ActionBar.d2 Q;
        org.telegram.ui.ActionBar.d2 Q2;
        switch (this.a) {
            case 0:
                if (this.b.f > 0 && (Q = LaunchActivity.Q()) != null) {
                    org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2();
                    b2Var.a = true;
                    Q.showAsSheet(new wb(), b2Var);
                    break;
                }
                break;
            default:
                if (this.b.f > 0 && (Q2 = LaunchActivity.Q()) != null) {
                    org.telegram.ui.ActionBar.b2 b2Var2 = new org.telegram.ui.ActionBar.b2();
                    b2Var2.a = true;
                    Q2.showAsSheet(new wb(), b2Var2);
                    break;
                }
                break;
        }
    }
}
