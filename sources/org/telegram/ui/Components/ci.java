package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class ci extends p10 {
    public final gi F;

    public ci(Context context, org.telegram.ui.ActionBar.c6 c6Var, gi giVar) {
        super(context, c6Var);
        this.F = giVar;
    }

    @Override // org.telegram.ui.Components.p10
    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.F.t1(this.r, true);
        return super.onInterceptTouchEvent(motionEvent);
    }
}
