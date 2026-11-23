package org.telegram.ui.Components;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
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
