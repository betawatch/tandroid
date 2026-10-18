package ai;

import android.view.View;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final /* synthetic */ class ab implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ad b;

    public /* synthetic */ ab(ad adVar, int i10) {
        this.a = i10;
        this.b = adVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        org.telegram.ui.ActionBar.n2 R;
        org.telegram.ui.ActionBar.n2 R2;
        switch (this.a) {
            case 0:
                if (this.b.f > 0 && (R = LaunchActivity.R()) != null) {
                    org.telegram.ui.ActionBar.l2 l2Var = new org.telegram.ui.ActionBar.l2();
                    l2Var.a = true;
                    R.showAsSheet(new md(), l2Var);
                    break;
                }
                break;
            default:
                if (this.b.f > 0 && (R2 = LaunchActivity.R()) != null) {
                    org.telegram.ui.ActionBar.l2 l2Var2 = new org.telegram.ui.ActionBar.l2();
                    l2Var2.a = true;
                    R2.showAsSheet(new md(), l2Var2);
                    break;
                }
                break;
        }
    }
}
