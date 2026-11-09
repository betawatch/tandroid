package org.telegram.ui.Components;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class fw extends org.telegram.ui.cn {
    @Override // org.telegram.ui.cn, org.telegram.ui.ActionBar.f2
    public final void onTransitionAnimationEnd(boolean z9, boolean z10) {
        org.telegram.ui.sj sjVar;
        super.onTransitionAnimationEnd(z9, z10);
        if (!z9 || (sjVar = this.Z) == null) {
            return;
        }
        sjVar.s1();
        this.Z.postDelayed(new gp(this, 12), 100L);
    }
}
