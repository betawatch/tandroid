package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class i41 extends jl0 {
    public final /* synthetic */ p41 T2;
    public final /* synthetic */ s41 U2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i41(s41 s41Var, Context context, p41 p41Var) {
        super(context, null);
        this.U2 = s41Var;
        this.T2 = p41Var;
    }

    @Override // org.telegram.ui.Components.jl0
    public final boolean E0(float f9) {
        return f9 >= ((float) (AndroidUtilities.dp(58.0f) + this.U2.A));
    }

    @Override // org.telegram.ui.Components.jl0, android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        this.U2.B = true;
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.jl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return super.onInterceptTouchEvent(motionEvent) || this.T2.d(this, motionEvent);
    }

    @Override // org.telegram.ui.Components.jl0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.U2.H != null) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.jl0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.U2.D) {
            return;
        }
        super.requestLayout();
    }
}
