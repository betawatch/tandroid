package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class qi extends e10 {
    public final ui K;

    public qi(Context context, org.telegram.ui.ActionBar.h6 h6Var, ui uiVar) {
        super(context, h6Var);
        this.K = uiVar;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.K.i1(this.r, true);
        return super.onInterceptTouchEvent(motionEvent);
    }
}
