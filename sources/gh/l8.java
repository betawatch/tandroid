package gh;

import android.view.View;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class l8 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ da b;

    public /* synthetic */ l8(da daVar, int i9) {
        this.a = i9;
        this.b = daVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        org.telegram.ui.ActionBar.o2 R;
        org.telegram.ui.ActionBar.o2 R2;
        switch (this.a) {
            case 0:
                if (this.b.f > 0 && (R = LaunchActivity.R()) != null) {
                    org.telegram.ui.ActionBar.m2 m2Var = new org.telegram.ui.ActionBar.m2();
                    m2Var.a = true;
                    R.showAsSheet(new oa(), m2Var);
                    break;
                }
                break;
            default:
                if (this.b.f > 0 && (R2 = LaunchActivity.R()) != null) {
                    org.telegram.ui.ActionBar.m2 m2Var2 = new org.telegram.ui.ActionBar.m2();
                    m2Var2.a = true;
                    R2.showAsSheet(new oa(), m2Var2);
                    break;
                }
                break;
        }
    }
}
