package org.telegram.ui.Components;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class qw extends org.telegram.ui.bn {
    @Override // org.telegram.ui.bn, org.telegram.ui.ActionBar.h2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        org.telegram.ui.rj rjVar;
        super.onTransitionAnimationEnd(z10, z11);
        if (!z10 || (rjVar = this.a0) == null) {
            return;
        }
        rjVar.S1();
        this.a0.postDelayed(new mo(this, 14), 100L);
    }
}
