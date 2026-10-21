package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
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
