package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class aw extends zv {
    public final /* synthetic */ bw K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aw(bw bwVar, Context context, int i10, int i11) {
        super(bwVar.s, context, i10, i11);
        this.K = bwVar;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.K.d(motionEvent);
        return super.onTouchEvent(motionEvent);
    }
}
