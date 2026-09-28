package org.telegram.ui;

import android.os.Bundle;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final class h80 extends a6 {
    public final /* synthetic */ qy f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h80(Bundle bundle, qy qyVar) {
        super(bundle);
        this.f = qyVar;
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
