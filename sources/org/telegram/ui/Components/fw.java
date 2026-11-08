package org.telegram.ui.Components;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class fw extends org.telegram.ui.an {
    @Override // org.telegram.ui.an, org.telegram.ui.ActionBar.f2
    public final void onTransitionAnimationEnd(boolean z9, boolean z10) {
        org.telegram.ui.qj qjVar;
        super.onTransitionAnimationEnd(z9, z10);
        if (!z9 || (qjVar = this.Z) == null) {
            return;
        }
        qjVar.s1();
        this.Z.postDelayed(new gp(this, 12), 100L);
    }
}
