package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class xa extends org.telegram.ui.ActionBar.k {
    public final /* synthetic */ ww0 x1;
    public final /* synthetic */ bb y1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xa(bb bbVar, Context context, ww0 ww0Var) {
        super(context, null);
        this.y1 = bbVar;
        this.x1 = ww0Var;
    }

    @Override // org.telegram.ui.ActionBar.k, android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        bb bbVar = this.y1;
        if (bbVar.L && bbVar.M) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void setAlpha(float f7) {
        if (getAlpha() != f7) {
            super.setAlpha(f7);
            this.x1.invalidate();
        }
    }

    @Override // android.view.View
    public final void setTag(Object obj) {
        super.setTag(obj);
        this.y1.M();
    }
}
