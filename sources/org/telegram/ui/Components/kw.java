package org.telegram.ui.Components;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
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
