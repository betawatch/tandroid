package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class za extends org.telegram.ui.ActionBar.k {
    public final /* synthetic */ ow0 u1;
    public final /* synthetic */ db v1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public za(db dbVar, Context context, ow0 ow0Var) {
        super(context, null);
        this.v1 = dbVar;
        this.u1 = ow0Var;
    }

    @Override // org.telegram.ui.ActionBar.k, android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        db dbVar = this.v1;
        if (dbVar.L && dbVar.M) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void setAlpha(float f7) {
        if (getAlpha() != f7) {
            super.setAlpha(f7);
            this.u1.invalidate();
        }
    }

    @Override // android.view.View
    public final void setTag(Object obj) {
        super.setTag(obj);
        this.v1.N();
    }
}
