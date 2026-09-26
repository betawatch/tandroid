package org.telegram.ui;

import android.os.Bundle;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class h80 extends a6 {
    public final /* synthetic */ qy f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h80(Bundle bundle, qy qyVar) {
        super(bundle);
        this.f = qyVar;
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        super.onTransitionAnimationEnd(z10, z11);
        if (!z10 || z11) {
            return;
        }
        this.f.removeSelfFromStack();
    }
}
