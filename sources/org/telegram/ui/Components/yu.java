package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class yu extends xu {
    public final /* synthetic */ zu O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yu(zu zuVar, Context context, int i7) {
        super(zuVar.s, context, i7);
        this.O = zuVar;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.O.d(motionEvent);
        return super.onTouchEvent(motionEvent);
    }
}
