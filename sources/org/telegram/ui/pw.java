package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class pw extends org.telegram.ui.Components.k00 {
    public final /* synthetic */ qy y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pw(qy qyVar, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var);
        this.y0 = qyVar;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        getParent().requestDisallowInterceptTouchEvent(true);
        this.y0.j3 = false;
        return super.onInterceptTouchEvent(motionEvent);
    }
}
