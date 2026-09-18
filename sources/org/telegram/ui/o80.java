package org.telegram.ui;

import android.os.Bundle;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class o80 extends b6 {
    public final /* synthetic */ wy f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o80(Bundle bundle, wy wyVar) {
        super(bundle);
        this.f = wyVar;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        super.onTransitionAnimationEnd(z10, z11);
        if (!z10 || z11) {
            return;
        }
        this.f.removeSelfFromStack();
    }
}
