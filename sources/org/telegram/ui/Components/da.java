package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class da extends org.telegram.ui.ActionBar.l {
    public final /* synthetic */ vu0 F1;
    public final /* synthetic */ ha G1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public da(ha haVar, Context context, vu0 vu0Var) {
        super(context, null);
        this.G1 = haVar;
        this.F1 = vu0Var;
    }

    @Override // org.telegram.ui.ActionBar.l, android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        ha haVar = this.G1;
        if (haVar.C1 && haVar.D1) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void setAlpha(float f7) {
        if (getAlpha() != f7) {
            super.setAlpha(f7);
            this.F1.invalidate();
        }
    }

    @Override // android.view.View
    public final void setTag(Object obj) {
        super.setTag(obj);
        this.G1.a1();
    }
}
