// default package

import android.os.Bundle;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class fx5 extends c71 {
    public final /* synthetic */ nk3 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fx5(Bundle bundle, nk3 nk3Var) {
        super(bundle);
        this.f = nk3Var;
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
