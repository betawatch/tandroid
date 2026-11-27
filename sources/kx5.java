// default package

import android.os.Bundle;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class kx5 extends d61 {
    public final /* synthetic */ uj3 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kx5(Bundle bundle, uj3 uj3Var) {
        super(bundle);
        this.f = uj3Var;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onTransitionAnimationEnd(boolean z, boolean z2) {
        super.onTransitionAnimationEnd(z, z2);
        if (!z || z2) {
            return;
        }
        this.f.removeSelfFromStack();
    }
}
