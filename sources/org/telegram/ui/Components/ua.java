package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class ua extends org.telegram.ui.ActionBar.l {
    public final /* synthetic */ hv0 p1;
    public final /* synthetic */ xa q1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ua(xa xaVar, Context context, hv0 hv0Var) {
        super(context, null);
        this.q1 = xaVar;
        this.p1 = hv0Var;
    }

    @Override // org.telegram.ui.ActionBar.l, android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        xa xaVar = this.q1;
        if (xaVar.H && xaVar.I) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void setAlpha(float f9) {
        if (getAlpha() != f9) {
            super.setAlpha(f9);
            this.p1.invalidate();
        }
    }

    @Override // android.view.View
    public final void setTag(Object obj) {
        super.setTag(obj);
        this.q1.L();
    }
}
