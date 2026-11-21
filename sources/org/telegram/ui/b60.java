package org.telegram.ui;

import android.os.Bundle;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
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
