package di;

import android.view.View;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
        org.telegram.ui.ActionBar.h2 Q;
        org.telegram.ui.ActionBar.h2 Q2;
        switch (this.a) {
            case 0:
                if (this.b.e > 0 && (Q = LaunchActivity.Q()) != null) {
                    org.telegram.ui.ActionBar.f2 f2Var = new org.telegram.ui.ActionBar.f2();
                    f2Var.a = true;
                    Q.showAsSheet(new pb(), f2Var);
                    break;
                }
                break;
            default:
                if (this.b.e > 0 && (Q2 = LaunchActivity.Q()) != null) {
                    org.telegram.ui.ActionBar.f2 f2Var2 = new org.telegram.ui.ActionBar.f2();
                    f2Var2.a = true;
                    Q2.showAsSheet(new pb(), f2Var2);
                    break;
                }
                break;
        }
    }
}
