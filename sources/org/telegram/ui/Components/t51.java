package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class t51 extends zl0 {
    public final /* synthetic */ a61 e3;
    public final /* synthetic */ d61 f3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t51(d61 d61Var, Context context, a61 a61Var) {
        super(context, null);
        this.f3 = d61Var;
        this.e3 = a61Var;
    }

    @Override // org.telegram.ui.Components.zl0
    public final boolean F0(float f7) {
        return f7 >= ((float) (AndroidUtilities.dp(58.0f) + this.f3.E));
    }

    @Override // org.telegram.ui.Components.zl0, android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        this.f3.F = true;
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.zl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return super.onInterceptTouchEvent(motionEvent) || this.e3.d(this, motionEvent);
    }

    @Override // org.telegram.ui.Components.zl0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f3.L != null) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.zl0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.f3.H) {
            return;
        }
        super.requestLayout();
    }
}
