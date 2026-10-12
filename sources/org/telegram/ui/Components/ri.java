package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class ri extends o20 {
    public final vi J;

    public ri(Context context, org.telegram.ui.ActionBar.c6 c6Var, vi viVar) {
        super(context, c6Var);
        this.J = viVar;
    }

    @Override // org.telegram.ui.Components.o20
    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.J.w1(this.r, true);
        return super.onInterceptTouchEvent(motionEvent);
    }
}
