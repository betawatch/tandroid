package org.telegram.ui;

import android.os.Bundle;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class j80 extends b6 {
    public final /* synthetic */ ry f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j80(Bundle bundle, ry ryVar) {
        super(bundle);
        this.f = ryVar;
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
