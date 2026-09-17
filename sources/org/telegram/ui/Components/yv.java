package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-09da8b159cf36792e88674cebe3dc77c7407e16cea1bdebcb1e8ccd47061bd65 */
/* loaded from: classes3.dex */
public final class yv extends xv {
    public final /* synthetic */ zv K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yv(zv zvVar, Context context, int i10, int i11) {
        super(zvVar.s, context, i10, i11);
        this.K = zvVar;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.K.d(motionEvent);
        return super.onTouchEvent(motionEvent);
    }
}
