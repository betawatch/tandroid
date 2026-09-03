package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class u41 extends rl0 {
    public final /* synthetic */ b51 U2;
    public final /* synthetic */ e51 V2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u41(e51 e51Var, Context context, b51 b51Var) {
        super(context, null);
        this.V2 = e51Var;
        this.U2 = b51Var;
    }

    @Override // org.telegram.ui.Components.rl0
    public final boolean E0(float f10) {
        return f10 >= ((float) (AndroidUtilities.dp(58.0f) + this.V2.B));
    }

    @Override // org.telegram.ui.Components.rl0, android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        this.V2.C = true;
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.rl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return super.onInterceptTouchEvent(motionEvent) || this.U2.d(this, motionEvent);
    }

    @Override // org.telegram.ui.Components.rl0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.V2.I != null) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.rl0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.V2.E) {
            return;
        }
        super.requestLayout();
    }
}
