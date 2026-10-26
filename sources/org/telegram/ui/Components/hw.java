package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
