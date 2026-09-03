package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class hi extends d20 {
    public final li G;

    public hi(Context context, org.telegram.ui.ActionBar.f6 f6Var, li liVar) {
        super(context, f6Var);
        this.G = liVar;
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
