package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class i31 extends pj0 {
    public final /* synthetic */ p31 e3;
    public final /* synthetic */ t31 f3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i31(t31 t31Var, Context context, p31 p31Var) {
        super(context, null);
        this.f3 = t31Var;
        this.e3 = p31Var;
    }

    @Override // org.telegram.ui.Components.pj0
    public final boolean E0(float f10) {
        return f10 >= ((float) (org.telegram.messenger.g0.L(58.0f) + this.f3.E));
    }

    @Override // org.telegram.ui.Components.pj0, android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        this.f3.F = true;
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.pj0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return super.onInterceptTouchEvent(motionEvent) || this.e3.d(this, motionEvent);
    }

    @Override // org.telegram.ui.Components.pj0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f3.L != null) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.pj0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.f3.H) {
            return;
        }
        super.requestLayout();
    }
}
