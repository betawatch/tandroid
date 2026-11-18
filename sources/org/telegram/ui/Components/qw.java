package org.telegram.ui.Components;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
