package org.telegram.ui;

import android.os.Bundle;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
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
