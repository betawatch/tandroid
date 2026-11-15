package org.telegram.ui.Components;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class kw extends org.telegram.ui.an {
    @Override // org.telegram.ui.an, org.telegram.ui.ActionBar.e2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        org.telegram.ui.qj qjVar;
        super.onTransitionAnimationEnd(z10, z11);
        if (!z10 || (qjVar = this.a0) == null) {
            return;
        }
        qjVar.K1();
        this.a0.postDelayed(new fo(this, 14), 100L);
    }
}
