package org.telegram.ui.Components;

/* compiled from: r8-map-id-09da8b159cf36792e88674cebe3dc77c7407e16cea1bdebcb1e8ccd47061bd65 */
/* loaded from: classes3.dex */
public final class ix extends org.telegram.ui.co {
    @Override // org.telegram.ui.co, org.telegram.ui.ActionBar.n2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        org.telegram.ui.mk mkVar;
        super.onTransitionAnimationEnd(z10, z11);
        if (!z10 || (mkVar = this.Y) == null) {
            return;
        }
        mkVar.s1();
        this.Y.postDelayed(new wp(this, 13), 100L);
    }
}
