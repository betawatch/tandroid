package org.telegram.ui.Components;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class ix extends org.telegram.ui.xn {
    @Override // org.telegram.ui.xn, org.telegram.ui.ActionBar.p2
    public final void onTransitionAnimationEnd(boolean z4, boolean z10) {
        org.telegram.ui.jk jkVar;
        super.onTransitionAnimationEnd(z4, z10);
        if (!z4 || (jkVar = this.V) == null) {
            return;
        }
        jkVar.s1();
        this.V.postDelayed(new xp(this, 13), 100L);
    }
}
