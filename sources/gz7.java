// default package

import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class gz7 extends fz7 {
    public final /* synthetic */ hz7 k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gz7(hz7 hz7Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.k0 = hz7Var;
    }

    @Override // fz7
    public final void h(float f) {
        LaunchActivity launchActivity = LaunchActivity.H1;
        if (launchActivity == null) {
            return;
        }
        dr3 dr3Var = launchActivity.y0;
        dr3Var.setScaleX(hl.R1(1.0f, 1.25f, f));
        dr3Var.setScaleY(hl.R1(1.0f, 1.25f, f));
    }

    @Override // fz7
    public final void j() {
        super/*android.app.Dialog*/.dismiss();
        LaunchActivity launchActivity = LaunchActivity.H1;
        if (launchActivity == null) {
            return;
        }
        dr3 dr3Var = launchActivity.y0;
        dr3Var.setScaleX(1.0f);
        dr3Var.setScaleY(1.0f);
    }
}
