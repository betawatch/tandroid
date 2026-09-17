package org.telegram.ui;

import android.os.Bundle;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
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
