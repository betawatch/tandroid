// default package

import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class i75 extends et8 {
    public final /* synthetic */ j95 t1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i75(j95 j95Var, LaunchActivity launchActivity, e85 e85Var, t85 t85Var, h75 h75Var) {
        super(launchActivity, e85Var, t85Var, h75Var);
        this.t1 = j95Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        this.t1.b.invalidate();
    }
}
