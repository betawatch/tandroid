// default package

import android.os.Bundle;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class fv5 extends v51 {
    public final /* synthetic */ cj3 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fv5(Bundle bundle, cj3 cj3Var) {
        super(bundle);
        this.f = cj3Var;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onTransitionAnimationEnd(boolean z, boolean z2) {
        super.onTransitionAnimationEnd(z, z2);
        if (!z || z2) {
            return;
        }
        this.f.removeSelfFromStack();
    }
}
