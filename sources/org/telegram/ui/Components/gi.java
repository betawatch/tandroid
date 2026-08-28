package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class gi extends m10 {
    public final ki F;

    public gi(Context context, org.telegram.ui.ActionBar.b6 b6Var, ki kiVar) {
        super(context, b6Var);
        this.F = kiVar;
    }

    @Override // org.telegram.ui.Components.m10
    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.F.t1(this.r, true);
        return super.onInterceptTouchEvent(motionEvent);
    }
}
