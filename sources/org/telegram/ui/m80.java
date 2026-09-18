package org.telegram.ui;

import android.os.Bundle;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class m80 extends a6 {
    public final /* synthetic */ uy f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m80(Bundle bundle, uy uyVar) {
        super(bundle);
        this.f = uyVar;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        super.onTransitionAnimationEnd(z10, z11);
        if (!z10 || z11) {
            return;
        }
        this.f.removeSelfFromStack();
    }
}
