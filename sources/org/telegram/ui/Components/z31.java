package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class z31 extends zk0 {
    public final /* synthetic */ g41 T2;
    public final /* synthetic */ j41 U2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z31(j41 j41Var, Context context, g41 g41Var) {
        super(context, null);
        this.U2 = j41Var;
        this.T2 = g41Var;
    }

    @Override // org.telegram.ui.Components.zk0
    public final boolean E0(float f10) {
        return f10 >= ((float) (AndroidUtilities.dp(58.0f) + this.U2.A));
    }

    @Override // org.telegram.ui.Components.zk0, android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        this.U2.B = true;
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.zk0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return super.onInterceptTouchEvent(motionEvent) || this.T2.d(this, motionEvent);
    }

    @Override // org.telegram.ui.Components.zk0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.U2.H != null) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.zk0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.U2.D) {
            return;
        }
        super.requestLayout();
    }
}
