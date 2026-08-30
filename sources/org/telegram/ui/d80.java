package org.telegram.ui;

import android.os.Bundle;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class d80 extends d6 {
    public final /* synthetic */ oy f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d80(Bundle bundle, oy oyVar) {
        super(bundle);
        this.f = oyVar;
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
