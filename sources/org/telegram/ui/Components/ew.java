package org.telegram.ui.Components;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
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
