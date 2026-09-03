package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
