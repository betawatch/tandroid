package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class gi extends v00 {
    public final ki K;

    public gi(Context context, org.telegram.ui.ActionBar.e6 e6Var, ki kiVar) {
        super(context, e6Var);
        this.K = kiVar;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.K.h1(this.r, true);
        return super.onInterceptTouchEvent(motionEvent);
    }
}
