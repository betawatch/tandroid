// default package

import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class e75 extends tr8 {
    public final /* synthetic */ g95 t1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e75(g95 g95Var, LaunchActivity launchActivity, a85 a85Var, p85 p85Var, d75 d75Var) {
        super(launchActivity, a85Var, p85Var, d75Var);
        this.t1 = g95Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        this.t1.b.invalidate();
    }
}
