package org.telegram.ui.Components;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class tw extends org.telegram.ui.un {
    @Override // org.telegram.ui.un, org.telegram.ui.ActionBar.k2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        org.telegram.ui.mk mkVar;
        super.onTransitionAnimationEnd(z10, z11);
        if (!z10 || (mkVar = this.Z) == null) {
            return;
        }
        mkVar.q1();
        this.Z.postDelayed(new ho(this, 14), 100L);
    }
}
