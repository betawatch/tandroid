package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class na extends org.telegram.ui.ActionBar.k {
    public final /* synthetic */ zu0 p1;
    public final /* synthetic */ qa q1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public na(qa qaVar, Context context, zu0 zu0Var) {
        super(context, null);
        this.q1 = qaVar;
        this.p1 = zu0Var;
    }

    @Override // org.telegram.ui.ActionBar.k, android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        qa qaVar = this.q1;
        if (qaVar.H && qaVar.I) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void setAlpha(float f10) {
        if (getAlpha() != f10) {
            super.setAlpha(f10);
            this.p1.invalidate();
        }
    }

    @Override // android.view.View
    public final void setTag(Object obj) {
        super.setTag(obj);
        this.q1.M();
    }
}
