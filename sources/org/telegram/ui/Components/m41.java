package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class m41 extends uk0 {
    public final /* synthetic */ t41 e3;
    public final /* synthetic */ x41 f3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m41(x41 x41Var, Context context, t41 t41Var) {
        super(context, null);
        this.f3 = x41Var;
        this.e3 = t41Var;
    }

    @Override // org.telegram.ui.Components.uk0
    public final boolean E0(float f7) {
        return f7 >= ((float) (org.telegram.messenger.i0.L(58.0f) + this.f3.E));
    }

    @Override // org.telegram.ui.Components.uk0, android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        this.f3.F = true;
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.uk0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return super.onInterceptTouchEvent(motionEvent) || this.e3.d(this, motionEvent);
    }

    @Override // org.telegram.ui.Components.uk0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f3.L != null) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.uk0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.f3.H) {
            return;
        }
        super.requestLayout();
    }
}
