package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class l41 extends tk0 {
    public final /* synthetic */ s41 e3;
    public final /* synthetic */ w41 f3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l41(w41 w41Var, Context context, s41 s41Var) {
        super(context, null);
        this.f3 = w41Var;
        this.e3 = s41Var;
    }

    @Override // org.telegram.ui.Components.tk0
    public final boolean E0(float f7) {
        return f7 >= ((float) (org.telegram.messenger.i0.L(58.0f) + this.f3.E));
    }

    @Override // org.telegram.ui.Components.tk0, android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        this.f3.F = true;
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.tk0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return super.onInterceptTouchEvent(motionEvent) || this.e3.d(this, motionEvent);
    }

    @Override // org.telegram.ui.Components.tk0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f3.L != null) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.tk0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.f3.H) {
            return;
        }
        super.requestLayout();
    }
}
