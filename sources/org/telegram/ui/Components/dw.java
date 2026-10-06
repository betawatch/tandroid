package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final class dw extends cw {
    public final /* synthetic */ ew K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dw(ew ewVar, Context context, int i10, int i11) {
        super(ewVar.s, context, i10, i11);
        this.K = ewVar;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.K.d(motionEvent);
        return super.onTouchEvent(motionEvent);
    }
}
