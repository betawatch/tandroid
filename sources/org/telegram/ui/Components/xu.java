package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class xu extends wu {
    public final /* synthetic */ yu O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xu(yu yuVar, Context context, int i7) {
        super(yuVar.s, context, i7);
        this.O = yuVar;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.O.d(motionEvent);
        return super.onTouchEvent(motionEvent);
    }
}
