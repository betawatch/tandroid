package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class x31 extends ck0 {
    public final /* synthetic */ e41 f3;
    public final /* synthetic */ h41 g3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x31(h41 h41Var, Context context, e41 e41Var) {
        super(context, null);
        this.g3 = h41Var;
        this.f3 = e41Var;
    }

    @Override // org.telegram.ui.Components.ck0
    public final boolean E0(float f10) {
        return f10 >= ((float) (org.telegram.messenger.g0.L(58.0f) + this.g3.F));
    }

    @Override // org.telegram.ui.Components.ck0, android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        this.g3.G = true;
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.ck0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return super.onInterceptTouchEvent(motionEvent) || this.f3.d(this, motionEvent);
    }

    @Override // org.telegram.ui.Components.ck0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.g3.M != null) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.ck0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.g3.I) {
            return;
        }
        super.requestLayout();
    }
}
