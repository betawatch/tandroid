package lh;

import android.view.View;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final /* synthetic */ class j8 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ y9 b;

    public /* synthetic */ j8(y9 y9Var, int i10) {
        this.a = i10;
        this.b = y9Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        org.telegram.ui.ActionBar.p2 R;
        org.telegram.ui.ActionBar.p2 R2;
        switch (this.a) {
            case 0:
                if (this.b.f > 0 && (R = LaunchActivity.R()) != null) {
                    org.telegram.ui.ActionBar.n2 n2Var = new org.telegram.ui.ActionBar.n2();
                    n2Var.a = true;
                    R.showAsSheet(new ja(), n2Var);
                    break;
                }
                break;
            default:
                if (this.b.f > 0 && (R2 = LaunchActivity.R()) != null) {
                    org.telegram.ui.ActionBar.n2 n2Var2 = new org.telegram.ui.ActionBar.n2();
                    n2Var2.a = true;
                    R2.showAsSheet(new ja(), n2Var2);
                    break;
                }
                break;
        }
    }
}
