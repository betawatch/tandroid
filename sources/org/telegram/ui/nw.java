package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
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
