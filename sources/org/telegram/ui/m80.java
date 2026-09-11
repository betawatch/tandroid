package org.telegram.ui;

import android.os.Bundle;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class m80 extends a6 {
    public final /* synthetic */ uy f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m80(Bundle bundle, uy uyVar) {
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
