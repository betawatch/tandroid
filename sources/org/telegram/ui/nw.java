package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class nw extends org.telegram.ui.Components.j00 {
    public final /* synthetic */ oy y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nw(oy oyVar, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var);
        this.y0 = oyVar;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        getParent().requestDisallowInterceptTouchEvent(true);
        this.y0.j3 = false;
        return super.onInterceptTouchEvent(motionEvent);
    }
}
