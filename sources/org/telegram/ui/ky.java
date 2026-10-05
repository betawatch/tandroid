package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class ky extends org.telegram.ui.Components.n00 {
    public final /* synthetic */ uy B0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ky(uy uyVar, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, d6Var);
        this.B0 = uyVar;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        getParent().requestDisallowInterceptTouchEvent(true);
        this.B0.m3 = false;
        return super.onInterceptTouchEvent(motionEvent);
    }
}
