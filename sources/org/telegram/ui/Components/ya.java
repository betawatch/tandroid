package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
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
