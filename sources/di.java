// default package

import android.view.View;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class di implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ my0 b;

    public /* synthetic */ di(my0 my0Var, byte b) {
        this.a = b;
        this.b = my0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        my0 my0Var = this.b;
        switch (b) {
            case 0:
                my0Var.dismiss();
                break;
            case 1:
                my0Var.I(((Integer) view.getTag()).intValue());
                break;
            case 2:
                my0Var.dismiss();
                break;
            case 3:
                my0Var.dismiss();
                break;
            case 4:
                d Q = LaunchActivity.Q();
                if (Q != null) {
                    Q.presentFragment(new PremiumPreviewFragment(0, "contact"));
                    my0Var.dismiss();
                    break;
                }
                break;
            case 5:
                my0Var.dismiss();
                break;
            case 6:
                my0Var.dismiss();
                break;
            case 7:
                my0Var.dismiss();
                break;
            default:
                my0Var.dismiss();
                break;
        }
    }
}
