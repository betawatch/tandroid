package org.telegram.ui;

import android.os.Bundle;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class f80 extends f6 {
    public final /* synthetic */ qy f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f80(Bundle bundle, qy qyVar) {
        super(bundle);
        this.f = qyVar;
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
