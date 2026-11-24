// default package

import android.view.View;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class dh implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ fx0 b;

    public /* synthetic */ dh(fx0 fx0Var, byte b) {
        this.a = b;
        this.b = fx0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        fx0 fx0Var = this.b;
        switch (b) {
            case 0:
                fx0Var.dismiss();
                break;
            case 1:
                fx0Var.J(((Integer) view.getTag()).intValue());
                break;
            case 2:
                fx0Var.dismiss();
                break;
            case 3:
                fx0Var.dismiss();
                break;
            case 4:
                d Q = LaunchActivity.Q();
                if (Q != null) {
                    Q.presentFragment(new PremiumPreviewFragment(0, "contact"));
                    fx0Var.dismiss();
                    break;
                }
                break;
            case 5:
                fx0Var.dismiss();
                break;
            case 6:
                fx0Var.dismiss();
                break;
            case 7:
                fx0Var.dismiss();
                break;
            default:
                fx0Var.dismiss();
                break;
        }
    }
}
