package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final class cw extends bw {
    public final /* synthetic */ dw K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cw(dw dwVar, Context context, int i10, int i11) {
        super(dwVar.s, context, i10, i11);
        this.K = dwVar;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.K.d(motionEvent);
        return super.onTouchEvent(motionEvent);
    }
}
