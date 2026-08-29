package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class qv extends pv {
    public final /* synthetic */ rv G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qv(rv rvVar, Context context, int i10, int i11) {
        super(rvVar.s, context, i10, i11);
        this.G = rvVar;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.G.d(motionEvent);
        return super.onTouchEvent(motionEvent);
    }
}
