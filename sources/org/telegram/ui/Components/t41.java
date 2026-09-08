package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class t41 extends ll0 {
    public final /* synthetic */ a51 X2;
    public final /* synthetic */ d51 Y2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t41(d51 d51Var, Context context, a51 a51Var) {
        super(context, null);
        this.Y2 = d51Var;
        this.X2 = a51Var;
    }

    @Override // org.telegram.ui.Components.ll0
    public final boolean E0(float f7) {
        return f7 >= ((float) (AndroidUtilities.dp(58.0f) + this.Y2.E));
    }

    @Override // org.telegram.ui.Components.ll0, android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        this.Y2.F = true;
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.ll0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return super.onInterceptTouchEvent(motionEvent) || this.X2.d(this, motionEvent);
    }

    @Override // org.telegram.ui.Components.ll0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.Y2.L != null) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.ll0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.Y2.H) {
            return;
        }
        super.requestLayout();
    }
}
