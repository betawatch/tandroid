package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class lw extends kw {
    public final /* synthetic */ mw K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lw(mw mwVar, Context context, int i10) {
        super(mwVar.s, context, i10);
        this.K = mwVar;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.K.d(motionEvent);
        return super.onTouchEvent(motionEvent);
    }
}
