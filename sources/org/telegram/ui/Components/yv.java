package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
