package org.telegram.ui;

import android.os.Bundle;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
