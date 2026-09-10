package org.telegram.ui;

import android.os.Bundle;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class m80 extends b6 {
    public final /* synthetic */ wy f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m80(Bundle bundle, wy wyVar) {
        super(bundle);
        this.f = wyVar;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        super.onTransitionAnimationEnd(z10, z11);
        if (!z10 || z11) {
            return;
        }
        this.f.removeSelfFromStack();
    }
}
