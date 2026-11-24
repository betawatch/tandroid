// default package

import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class cy7 extends by7 {
    public final /* synthetic */ dy7 k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cy7(dy7 dy7Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.k0 = dy7Var;
    }

    @Override // by7
    public final void h(float f) {
        LaunchActivity launchActivity = LaunchActivity.H1;
        if (launchActivity == null) {
            return;
        }
        wr3 wr3Var = launchActivity.y0;
        wr3Var.setScaleX(gm.R1(1.0f, 1.25f, f));
        wr3Var.setScaleY(gm.R1(1.0f, 1.25f, f));
    }

    @Override // by7
    public final void j() {
        super/*android.app.Dialog*/.dismiss();
        LaunchActivity launchActivity = LaunchActivity.H1;
        if (launchActivity == null) {
            return;
        }
        wr3 wr3Var = launchActivity.y0;
        wr3Var.setScaleX(1.0f);
        wr3Var.setScaleY(1.0f);
    }
}
