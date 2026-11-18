package org.telegram.ui;

import android.os.Bundle;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class b60 extends x5 {
    public final /* synthetic */ cx f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b60(Bundle bundle, cx cxVar) {
        super(bundle);
        this.f = cxVar;
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        super.onTransitionAnimationEnd(z10, z11);
        if (!z10 || z11) {
            return;
        }
        this.f.removeSelfFromStack();
    }
}
