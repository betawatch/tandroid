package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
