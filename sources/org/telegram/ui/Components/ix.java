package org.telegram.ui.Components;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class ix extends org.telegram.ui.zn {
    @Override // org.telegram.ui.zn, org.telegram.ui.ActionBar.n2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        org.telegram.ui.lk lkVar;
        super.onTransitionAnimationEnd(z10, z11);
        if (!z10 || (lkVar = this.Y) == null) {
            return;
        }
        lkVar.r1();
        this.Y.postDelayed(new xp(this, 13), 100L);
    }
}
