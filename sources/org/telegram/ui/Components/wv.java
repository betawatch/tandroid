package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class wv extends vv {
    public final /* synthetic */ xv H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wv(xv xvVar, Context context, int i10, int i11) {
        super(xvVar.s, context, i10, i11);
        this.H = xvVar;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.H.d(motionEvent);
        return super.onTouchEvent(motionEvent);
    }
}
