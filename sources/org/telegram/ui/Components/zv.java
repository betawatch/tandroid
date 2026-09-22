package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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
