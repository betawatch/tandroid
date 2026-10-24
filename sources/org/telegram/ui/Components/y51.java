package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class y51 extends mm0 {
    public final /* synthetic */ f61 Y2;
    public final /* synthetic */ i61 Z2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y51(i61 i61Var, Context context, f61 f61Var) {
        super(context, null);
        this.Z2 = i61Var;
        this.Y2 = f61Var;
    }

    @Override // org.telegram.ui.Components.mm0
    public final boolean E0(float f7) {
        return f7 >= ((float) (AndroidUtilities.dp(58.0f) + this.Z2.E));
    }

    @Override // org.telegram.ui.Components.mm0, android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        this.Z2.F = true;
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.mm0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return super.onInterceptTouchEvent(motionEvent) || this.Y2.d(this, motionEvent);
    }

    @Override // org.telegram.ui.Components.mm0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.Z2.L != null) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.mm0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.Z2.H) {
            return;
        }
        super.requestLayout();
    }
}
