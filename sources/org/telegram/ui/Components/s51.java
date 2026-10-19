package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class s51 extends im0 {
    public final /* synthetic */ z51 V2;
    public final /* synthetic */ c61 W2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s51(c61 c61Var, Context context, z51 z51Var) {
        super(context, null);
        this.W2 = c61Var;
        this.V2 = z51Var;
    }

    @Override // org.telegram.ui.Components.im0
    public final boolean E0(float f7) {
        return f7 >= ((float) (AndroidUtilities.dp(58.0f) + this.W2.E));
    }

    @Override // org.telegram.ui.Components.im0, android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        this.W2.F = true;
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.im0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return super.onInterceptTouchEvent(motionEvent) || this.V2.d(this, motionEvent);
    }

    @Override // org.telegram.ui.Components.im0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.W2.L != null) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.im0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.W2.H) {
            return;
        }
        super.requestLayout();
    }
}
