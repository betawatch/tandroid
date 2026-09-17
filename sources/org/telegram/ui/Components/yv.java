package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes3.dex */
public final class yv extends xv {
    public final /* synthetic */ zv K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yv(zv zvVar, Context context, int i10, int i11) {
        super(zvVar.s, context, i10, i11);
        this.K = zvVar;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.K.d(motionEvent);
        return super.onTouchEvent(motionEvent);
    }
}
