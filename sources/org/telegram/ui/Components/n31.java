package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class n31 extends uj0 {
    public final /* synthetic */ u31 f3;
    public final /* synthetic */ x31 g3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n31(x31 x31Var, Context context, u31 u31Var) {
        super(context, null);
        this.g3 = x31Var;
        this.f3 = u31Var;
    }

    @Override // org.telegram.ui.Components.uj0
    public final boolean E0(float f10) {
        return f10 >= ((float) (org.telegram.messenger.g0.L(58.0f) + this.g3.F));
    }

    @Override // org.telegram.ui.Components.uj0, android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        this.g3.G = true;
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.uj0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return super.onInterceptTouchEvent(motionEvent) || this.f3.d(this, motionEvent);
    }

    @Override // org.telegram.ui.Components.uj0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.g3.M != null) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.uj0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.g3.I) {
            return;
        }
        super.requestLayout();
    }
}
