package org.telegram.ui;

import android.os.Bundle;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class e80 extends d6 {
    public final /* synthetic */ py f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e80(Bundle bundle, py pyVar) {
        super(bundle);
        this.f = pyVar;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onTransitionAnimationEnd(boolean z4, boolean z10) {
        super.onTransitionAnimationEnd(z4, z10);
        if (!z4 || z10) {
            return;
        }
        this.f.removeSelfFromStack();
    }
}
