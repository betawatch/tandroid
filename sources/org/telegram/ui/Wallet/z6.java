package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class z6 extends lg.g {
    public final /* synthetic */ a7 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z6(a7 a7Var, Context context) {
        super(context);
        this.L = a7Var;
    }

    @Override // lg.g, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return !this.L.y && super.onTouchEvent(motionEvent);
    }
}
