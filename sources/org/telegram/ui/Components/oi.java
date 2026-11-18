package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
