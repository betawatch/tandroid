package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class hi extends c20 {
    public final li G;

    public hi(Context context, org.telegram.ui.ActionBar.f6 f6Var, li liVar) {
        super(context, f6Var);
        this.G = liVar;
    }

    @Override // org.telegram.ui.Components.c20
    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.G.t1(this.r, true);
        return super.onInterceptTouchEvent(motionEvent);
    }
}
