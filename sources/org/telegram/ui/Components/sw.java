package org.telegram.ui.Components;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class sw extends org.telegram.ui.bn {
    @Override // org.telegram.ui.bn, org.telegram.ui.ActionBar.g2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        org.telegram.ui.rj rjVar;
        super.onTransitionAnimationEnd(z10, z11);
        if (!z10 || (rjVar = this.a0) == null) {
            return;
        }
        rjVar.W1();
        this.a0.postDelayed(new oo(this, 14), 100L);
    }
}
