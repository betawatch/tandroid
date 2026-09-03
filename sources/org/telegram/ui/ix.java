package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class ix extends nh.q {
    public final /* synthetic */ qy L0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ix(qy qyVar, Context context, qy qyVar2, int i10, int i11) {
        super(context, qyVar2, i10, i11);
        this.L0 = qyVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k kVar;
        kVar = ((org.telegram.ui.ActionBar.p2) this.L0).actionBar;
        return !kVar.s() && super.dispatchTouchEvent(motionEvent);
    }
}
