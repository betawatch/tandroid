package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
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
