package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class ow extends org.telegram.ui.Components.fz {
    public final /* synthetic */ yw B0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ow(yw ywVar, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, g6Var);
        this.B0 = ywVar;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        getParent().requestDisallowInterceptTouchEvent(true);
        this.B0.o3 = false;
        return super.onInterceptTouchEvent(motionEvent);
    }
}
