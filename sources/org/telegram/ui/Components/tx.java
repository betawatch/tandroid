package org.telegram.ui.Components;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class tx extends org.telegram.ui.fo {
    @Override // org.telegram.ui.fo, org.telegram.ui.ActionBar.m2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        org.telegram.ui.sk skVar;
        super.onTransitionAnimationEnd(z10, z11);
        if (!z10 || (skVar = this.Y) == null) {
            return;
        }
        skVar.p1();
        this.Y.postDelayed(new kq(this, 13), 100L);
    }
}
