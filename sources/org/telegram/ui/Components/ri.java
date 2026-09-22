package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class ri extends b20 {
    public final vi J;

    public ri(Context context, org.telegram.ui.ActionBar.e6 e6Var, vi viVar) {
        super(context, e6Var);
        this.J = viVar;
    }

    @Override // org.telegram.ui.Components.b20
    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.J.t1(this.r, true);
        return super.onInterceptTouchEvent(motionEvent);
    }
}
