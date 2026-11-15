package di;

import android.view.View;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class fa implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ab b;

    public /* synthetic */ fa(ab abVar, int i7) {
        this.a = i7;
        this.b = abVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        org.telegram.ui.ActionBar.e2 Q;
        org.telegram.ui.ActionBar.e2 Q2;
        switch (this.a) {
            case 0:
                if (this.b.e > 0 && (Q = LaunchActivity.Q()) != null) {
                    org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2();
                    c2Var.a = true;
                    Q.showAsSheet(new lb(), c2Var);
                    break;
                }
                break;
            default:
                if (this.b.e > 0 && (Q2 = LaunchActivity.Q()) != null) {
                    org.telegram.ui.ActionBar.c2 c2Var2 = new org.telegram.ui.ActionBar.c2();
                    c2Var2.a = true;
                    Q2.showAsSheet(new lb(), c2Var2);
                    break;
                }
                break;
        }
    }
}
