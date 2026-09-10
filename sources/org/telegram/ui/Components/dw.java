package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
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
