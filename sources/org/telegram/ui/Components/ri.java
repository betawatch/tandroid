package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class ri extends b20 {
    public final vi J;

    public ri(Context context, org.telegram.ui.ActionBar.f6 f6Var, vi viVar) {
        super(context, f6Var);
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
