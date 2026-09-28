package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final class bw extends aw {
    public final /* synthetic */ cw K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bw(cw cwVar, Context context, int i10, int i11) {
        super(cwVar.s, context, i10, i11);
        this.K = cwVar;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.K.d(motionEvent);
        return super.onTouchEvent(motionEvent);
    }
}
