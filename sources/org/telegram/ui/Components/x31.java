package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class x31 extends wk0 {
    public final /* synthetic */ e41 T2;
    public final /* synthetic */ h41 U2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x31(h41 h41Var, Context context, e41 e41Var) {
        super(context, null);
        this.U2 = h41Var;
        this.T2 = e41Var;
    }

    @Override // org.telegram.ui.Components.wk0
    public final boolean E0(float f10) {
        return f10 >= ((float) (AndroidUtilities.dp(58.0f) + this.U2.A));
    }

    @Override // org.telegram.ui.Components.wk0, android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        this.U2.B = true;
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.wk0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return super.onInterceptTouchEvent(motionEvent) || this.T2.d(this, motionEvent);
    }

    @Override // org.telegram.ui.Components.wk0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.U2.H != null) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.wk0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.U2.D) {
            return;
        }
        super.requestLayout();
    }
}
