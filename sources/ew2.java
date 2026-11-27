// default package

import android.app.Activity;
import android.view.View;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class ew2 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ rw2 b;

    public /* synthetic */ ew2(rw2 rw2Var, byte b) {
        this.a = b;
        this.b = rw2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        rw2 rw2Var = this.b;
        switch (b) {
            case 0:
                rw2Var.K = false;
                rw2Var.z.invalidate();
                rw2Var.b();
                break;
            case 1:
                Activity activity = rw2Var.w;
                if (activity instanceof LaunchActivity) {
                    LaunchActivity launchActivity = (LaunchActivity) activity;
                    if (launchActivity.N() != null && launchActivity.N().getLastFragment() != null) {
                        launchActivity.N().getLastFragment().dismissCurrentDialog();
                    }
                    launchActivity.t0(new PremiumPreviewFragment(0, PremiumPreviewFragment.o0(5)));
                }
                rw2Var.K = false;
                rw2Var.z.invalidate();
                rw2Var.b();
                break;
            case 2:
                pw2 pw2Var = rw2Var.l;
                if (pw2Var != null) {
                    pw2Var.N();
                }
                rw2Var.d();
                break;
            default:
                pw2 pw2Var2 = rw2Var.l;
                if (pw2Var2 != null) {
                    pw2Var2.p();
                }
                rw2Var.d();
                break;
        }
    }
}
