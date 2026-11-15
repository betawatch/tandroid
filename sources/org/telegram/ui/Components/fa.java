package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class fa extends org.telegram.ui.ActionBar.k {
    public final /* synthetic */ st0 G1;
    public final /* synthetic */ ja H1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fa(ja jaVar, Context context, st0 st0Var) {
        super(context, null);
        this.H1 = jaVar;
        this.G1 = st0Var;
    }

    @Override // org.telegram.ui.ActionBar.k, android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        ja jaVar = this.H1;
        if (jaVar.G1 && jaVar.H1) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void setAlpha(float f10) {
        if (getAlpha() != f10) {
            super.setAlpha(f10);
            this.G1.invalidate();
        }
    }

    @Override // android.view.View
    public final void setTag(Object obj) {
        super.setTag(obj);
        this.H1.a1();
    }
}
