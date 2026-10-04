package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class ya extends org.telegram.ui.ActionBar.k {
    public final /* synthetic */ lw0 w1;
    public final /* synthetic */ cb x1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ya(cb cbVar, Context context, lw0 lw0Var) {
        super(context, null);
        this.x1 = cbVar;
        this.w1 = lw0Var;
    }

    @Override // org.telegram.ui.ActionBar.k, android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        cb cbVar = this.x1;
        if (cbVar.L && cbVar.M) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void setAlpha(float f7) {
        if (getAlpha() != f7) {
            super.setAlpha(f7);
            this.w1.invalidate();
        }
    }

    @Override // android.view.View
    public final void setTag(Object obj) {
        super.setTag(obj);
        this.x1.K();
    }
}
