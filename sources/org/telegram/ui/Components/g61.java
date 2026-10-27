package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class g61 extends nm0 {
    public final /* synthetic */ n61 f3;
    public final /* synthetic */ q61 g3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g61(q61 q61Var, Context context, n61 n61Var) {
        super(context, null);
        this.g3 = q61Var;
        this.f3 = n61Var;
    }

    @Override // org.telegram.ui.Components.nm0
    public final boolean E0(float f7) {
        return f7 >= ((float) (AndroidUtilities.dp(58.0f) + this.g3.E));
    }

    @Override // org.telegram.ui.Components.nm0, android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        this.g3.F = true;
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.nm0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return super.onInterceptTouchEvent(motionEvent) || this.f3.d(this, motionEvent);
    }

    @Override // org.telegram.ui.Components.nm0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.g3.L != null) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.nm0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.g3.H) {
            return;
        }
        super.requestLayout();
    }
}
