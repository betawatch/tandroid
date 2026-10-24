package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class xa extends org.telegram.ui.ActionBar.k {
    public final /* synthetic */ ow0 v1;
    public final /* synthetic */ bb w1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xa(bb bbVar, Context context, ow0 ow0Var) {
        super(context, null);
        this.w1 = bbVar;
        this.v1 = ow0Var;
    }

    @Override // org.telegram.ui.ActionBar.k, android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        bb bbVar = this.w1;
        if (bbVar.L && bbVar.M) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void setAlpha(float f7) {
        if (getAlpha() != f7) {
            super.setAlpha(f7);
            this.v1.invalidate();
        }
    }

    @Override // android.view.View
    public final void setTag(Object obj) {
        super.setTag(obj);
        this.w1.M();
    }
}
