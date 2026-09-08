package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class xa extends org.telegram.ui.ActionBar.k {
    public final /* synthetic */ ov0 t1;
    public final /* synthetic */ bb u1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xa(bb bbVar, Context context, ov0 ov0Var) {
        super(context, null);
        this.u1 = bbVar;
        this.t1 = ov0Var;
    }

    @Override // org.telegram.ui.ActionBar.k, android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        bb bbVar = this.u1;
        if (bbVar.L && bbVar.M) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void setAlpha(float f7) {
        if (getAlpha() != f7) {
            super.setAlpha(f7);
            this.t1.invalidate();
        }
    }

    @Override // android.view.View
    public final void setTag(Object obj) {
        super.setTag(obj);
        this.u1.M();
    }
}
