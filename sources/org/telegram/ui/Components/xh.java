package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class xh extends n00 {
    public final bi K;

    public xh(Context context, org.telegram.ui.ActionBar.e6 e6Var, bi biVar) {
        super(context, e6Var);
        this.K = biVar;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.K.h1(this.r, true);
        return super.onInterceptTouchEvent(motionEvent);
    }
}
