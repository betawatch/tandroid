package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class jv extends iv {
    public final /* synthetic */ kv O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jv(kv kvVar, Context context, int i10) {
        super(kvVar.s, context, i10);
        this.O = kvVar;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.O.d(motionEvent);
        return super.onTouchEvent(motionEvent);
    }
}
