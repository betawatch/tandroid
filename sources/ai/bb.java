package ai;

import android.view.View;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final /* synthetic */ class bb implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ bd b;

    public /* synthetic */ bb(bd bdVar, int i10) {
        this.a = i10;
        this.b = bdVar;
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
                    R.showAsSheet(new nd(), m2Var);
                    break;
                }
                break;
            default:
                if (this.b.f > 0 && (R2 = LaunchActivity.R()) != null) {
                    org.telegram.ui.ActionBar.m2 m2Var2 = new org.telegram.ui.ActionBar.m2();
                    m2Var2.a = true;
                    R2.showAsSheet(new nd(), m2Var2);
                    break;
                }
                break;
        }
    }
}
