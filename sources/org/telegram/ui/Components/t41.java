package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class t41 extends sl0 {
    public final /* synthetic */ a51 U2;
    public final /* synthetic */ d51 V2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t41(d51 d51Var, Context context, a51 a51Var) {
        super(context, null);
        this.V2 = d51Var;
        this.U2 = a51Var;
    }

    @Override // org.telegram.ui.Components.sl0
    public final boolean E0(float f10) {
        return f10 >= ((float) (AndroidUtilities.dp(58.0f) + this.V2.B));
    }

    @Override // org.telegram.ui.Components.sl0, android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        this.V2.C = true;
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.sl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return super.onInterceptTouchEvent(motionEvent) || this.U2.d(this, motionEvent);
    }

    @Override // org.telegram.ui.Components.sl0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.V2.I != null) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.sl0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.V2.E) {
            return;
        }
        super.requestLayout();
    }
}
