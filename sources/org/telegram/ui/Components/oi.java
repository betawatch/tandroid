package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class oi extends c10 {
    public final si K;

    public oi(Context context, org.telegram.ui.ActionBar.i6 i6Var, si siVar) {
        super(context, i6Var);
        this.K = siVar;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.K.i1(this.r, true);
        return super.onInterceptTouchEvent(motionEvent);
    }
}
