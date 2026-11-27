// default package

import android.os.Bundle;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
