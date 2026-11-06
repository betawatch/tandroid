package org.telegram.ui.Components;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
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
