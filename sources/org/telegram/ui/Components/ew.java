package org.telegram.ui.Components;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class ew extends org.telegram.ui.cn {
    @Override // org.telegram.ui.cn, org.telegram.ui.ActionBar.f2
    public final void onTransitionAnimationEnd(boolean z9, boolean z10) {
        org.telegram.ui.sj sjVar;
        super.onTransitionAnimationEnd(z9, z10);
        if (!z9 || (sjVar = this.Z) == null) {
            return;
        }
        sjVar.s1();
        this.Z.postDelayed(new gp(this, 12), 100L);
    }
}
