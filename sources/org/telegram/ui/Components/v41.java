package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class v41 extends ml0 {
    public final /* synthetic */ c51 X2;
    public final /* synthetic */ f51 Y2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v41(f51 f51Var, Context context, c51 c51Var) {
        super(context, null);
        this.Y2 = f51Var;
        this.X2 = c51Var;
    }

    @Override // org.telegram.ui.Components.ml0
    public final boolean F0(float f7) {
        return f7 >= ((float) (AndroidUtilities.dp(58.0f) + this.Y2.E));
    }

    @Override // org.telegram.ui.Components.ml0, android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        this.Y2.F = true;
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.ml0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return super.onInterceptTouchEvent(motionEvent) || this.X2.d(this, motionEvent);
    }

    @Override // org.telegram.ui.Components.ml0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.Y2.L != null) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.ml0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.Y2.H) {
            return;
        }
        super.requestLayout();
    }
}
