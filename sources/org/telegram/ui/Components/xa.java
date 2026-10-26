package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class xa extends org.telegram.ui.ActionBar.k {
    public final /* synthetic */ vw0 x1;
    public final /* synthetic */ bb y1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xa(bb bbVar, Context context, vw0 vw0Var) {
        super(context, null);
        this.y1 = bbVar;
        this.x1 = vw0Var;
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
