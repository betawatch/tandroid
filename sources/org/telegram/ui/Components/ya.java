package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class ya extends org.telegram.ui.ActionBar.k {
    public final /* synthetic */ mw0 v1;
    public final /* synthetic */ cb w1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ya(cb cbVar, Context context, mw0 mw0Var) {
        super(context, null);
        this.w1 = cbVar;
        this.v1 = mw0Var;
    }

    @Override // org.telegram.ui.ActionBar.k, android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        cb cbVar = this.w1;
        if (cbVar.L && cbVar.M) {
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
        this.w1.K();
    }
}
