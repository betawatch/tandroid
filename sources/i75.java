// default package

import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
