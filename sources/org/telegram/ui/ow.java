package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class ow extends org.telegram.ui.Components.l00 {
    public final /* synthetic */ py y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ow(py pyVar, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, g6Var);
        this.y0 = pyVar;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        getParent().requestDisallowInterceptTouchEvent(true);
        this.y0.j3 = false;
        return super.onInterceptTouchEvent(motionEvent);
    }
}
