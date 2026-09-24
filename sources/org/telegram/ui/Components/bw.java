package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
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
