package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
