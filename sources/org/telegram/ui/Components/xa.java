package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final class xa extends org.telegram.ui.ActionBar.k {
    public final /* synthetic */ cw0 t1;
    public final /* synthetic */ bb u1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xa(bb bbVar, Context context, cw0 cw0Var) {
        super(context, null);
        this.u1 = bbVar;
        this.t1 = cw0Var;
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
