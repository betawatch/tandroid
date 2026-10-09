package org.telegram.ui;

import android.os.Bundle;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class m80 extends a6 {
    public final /* synthetic */ ty f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m80(Bundle bundle, ty tyVar) {
        super(bundle);
        this.f = tyVar;
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
