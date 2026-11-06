package org.telegram.ui.Components;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class ew extends org.telegram.ui.an {
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
