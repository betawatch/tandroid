package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class nw extends org.telegram.ui.Components.l00 {
    public final /* synthetic */ qy B0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nw(qy qyVar, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, d6Var);
        this.B0 = qyVar;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        getParent().requestDisallowInterceptTouchEvent(true);
        this.B0.m3 = false;
        return super.onInterceptTouchEvent(motionEvent);
    }
}
