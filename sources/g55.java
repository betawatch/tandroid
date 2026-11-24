// default package

import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class g55 extends sp8 {
    public final /* synthetic */ h75 t1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g55(h75 h75Var, LaunchActivity launchActivity, c65 c65Var, r65 r65Var, f55 f55Var) {
        super(launchActivity, c65Var, r65Var, f55Var);
        this.t1 = h75Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        this.t1.b.invalidate();
    }
}
