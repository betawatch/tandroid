package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class fw extends org.telegram.ui.Components.yz {
    public final /* synthetic */ gy x0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fw(gy gyVar, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, c6Var);
        this.x0 = gyVar;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        getParent().requestDisallowInterceptTouchEvent(true);
        this.x0.i3 = false;
        return super.onInterceptTouchEvent(motionEvent);
    }
}
