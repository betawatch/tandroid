package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class ji extends x10 {
    public final ni F;

    public ji(Context context, org.telegram.ui.ActionBar.c6 c6Var, ni niVar) {
        super(context, c6Var);
        this.F = niVar;
    }

    @Override // org.telegram.ui.Components.x10
    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.F.t1(this.r, true);
        return super.onInterceptTouchEvent(motionEvent);
    }
}
