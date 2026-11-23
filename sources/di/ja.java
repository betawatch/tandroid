package di;

import android.view.View;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class ja implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ eb b;

    public /* synthetic */ ja(eb ebVar, int i7) {
        this.a = i7;
        this.b = ebVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        org.telegram.ui.ActionBar.g2 Q;
        org.telegram.ui.ActionBar.g2 Q2;
        switch (this.a) {
            case 0:
                if (this.b.e > 0 && (Q = LaunchActivity.Q()) != null) {
                    org.telegram.ui.ActionBar.e2 e2Var = new org.telegram.ui.ActionBar.e2();
                    e2Var.a = true;
                    Q.showAsSheet(new pb(), e2Var);
                    break;
                }
                break;
            default:
                if (this.b.e > 0 && (Q2 = LaunchActivity.Q()) != null) {
                    org.telegram.ui.ActionBar.e2 e2Var2 = new org.telegram.ui.ActionBar.e2();
                    e2Var2.a = true;
                    Q2.showAsSheet(new pb(), e2Var2);
                    break;
                }
                break;
        }
    }
}
