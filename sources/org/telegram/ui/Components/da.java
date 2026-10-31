package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class da extends org.telegram.ui.ActionBar.l {
    public final /* synthetic */ uu0 E1;
    public final /* synthetic */ ha F1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public da(ha haVar, Context context, uu0 uu0Var) {
        super(context, null);
        this.F1 = haVar;
        this.E1 = uu0Var;
    }

    @Override // org.telegram.ui.ActionBar.l, android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        ha haVar = this.F1;
        if (haVar.C1 && haVar.D1) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void setAlpha(float f7) {
        if (getAlpha() != f7) {
            super.setAlpha(f7);
            this.E1.invalidate();
        }
    }

    @Override // android.view.View
    public final void setTag(Object obj) {
        super.setTag(obj);
        this.F1.a1();
    }
}
