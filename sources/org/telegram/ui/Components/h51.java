package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class h51 extends wl0 {
    public final /* synthetic */ o51 X2;
    public final /* synthetic */ r51 Y2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h51(r51 r51Var, Context context, o51 o51Var) {
        super(context, null);
        this.Y2 = r51Var;
        this.X2 = o51Var;
    }

    @Override // org.telegram.ui.Components.wl0
    public final boolean E0(float f7) {
        return f7 >= ((float) (AndroidUtilities.dp(58.0f) + this.Y2.E));
    }

    @Override // org.telegram.ui.Components.wl0, android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        this.Y2.F = true;
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.wl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return super.onInterceptTouchEvent(motionEvent) || this.X2.d(this, motionEvent);
    }

    @Override // org.telegram.ui.Components.wl0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.Y2.L != null) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.wl0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.Y2.H) {
            return;
        }
        super.requestLayout();
    }
}
