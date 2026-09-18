package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class zv extends yv {
    public final /* synthetic */ aw K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zv(aw awVar, Context context, int i10, int i11) {
        super(awVar.s, context, i10, i11);
        this.K = awVar;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.K.d(motionEvent);
        return super.onTouchEvent(motionEvent);
    }
}
