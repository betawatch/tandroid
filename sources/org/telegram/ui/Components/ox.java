package org.telegram.ui.Components;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class ox extends org.telegram.ui.wn {
    @Override // org.telegram.ui.wn, org.telegram.ui.ActionBar.r2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        org.telegram.ui.jk jkVar;
        super.onTransitionAnimationEnd(z10, z11);
        if (!z10 || (jkVar = this.Y) == null) {
            return;
        }
        jkVar.o1();
        this.Y.postDelayed(new cp(this, 15), 100L);
    }
}
