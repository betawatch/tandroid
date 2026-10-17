package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class hw extends gw {
    public final /* synthetic */ iw K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hw(iw iwVar, Context context, int i10) {
        super(iwVar.s, context, i10);
        this.K = iwVar;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.K.d(motionEvent);
        return super.onTouchEvent(motionEvent);
    }
}
