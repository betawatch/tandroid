package org.telegram.ui;

import android.os.Bundle;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class q80 extends e6 {
    public final /* synthetic */ yy f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q80(Bundle bundle, yy yyVar) {
        super(bundle);
        this.f = yyVar;
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        super.onTransitionAnimationEnd(z10, z11);
        if (!z10 || z11) {
            return;
        }
        this.f.removeSelfFromStack();
    }
}
