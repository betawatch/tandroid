package org.telegram.ui;

import android.os.Bundle;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class b60 extends x5 {
    public final /* synthetic */ cx f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b60(Bundle bundle, cx cxVar) {
        super(bundle);
        this.f = cxVar;
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        super.onTransitionAnimationEnd(z10, z11);
        if (!z10 || z11) {
            return;
        }
        this.f.removeSelfFromStack();
    }
}
