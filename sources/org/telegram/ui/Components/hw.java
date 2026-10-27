package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class hw extends gw {
    public final /* synthetic */ iw O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hw(iw iwVar, Context context, int i10) {
        super(iwVar.s, context, i10);
        this.O = iwVar;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.O.d(motionEvent);
        return super.onTouchEvent(motionEvent);
    }
}
