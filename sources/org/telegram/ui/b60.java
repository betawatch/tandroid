package org.telegram.ui;

import android.os.Bundle;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class b60 extends x5 {
    public final /* synthetic */ cx f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b60(Bundle bundle, cx cxVar) {
        super(bundle);
        this.f = cxVar;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        super.onTransitionAnimationEnd(z10, z11);
        if (!z10 || z11) {
            return;
        }
        this.f.removeSelfFromStack();
    }
}
