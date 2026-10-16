package org.telegram.ui;

import android.os.Bundle;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
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
