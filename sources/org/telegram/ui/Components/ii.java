package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class ii extends d20 {
    public final mi G;

    public ii(Context context, org.telegram.ui.ActionBar.g6 g6Var, mi miVar) {
        super(context, g6Var);
        this.G = miVar;
    }

    @Override // org.telegram.ui.Components.d20
    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.G.t1(this.r, true);
        return super.onInterceptTouchEvent(motionEvent);
    }
}
