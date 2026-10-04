package org.telegram.ui;

import android.os.Bundle;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class l80 extends b6 {
    public final /* synthetic */ uy f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l80(Bundle bundle, uy uyVar) {
        super(bundle);
        this.f = uyVar;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        super.onTransitionAnimationEnd(z10, z11);
        if (!z10 || z11) {
            return;
        }
        this.f.removeSelfFromStack();
    }
}
