package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class ja extends org.telegram.ui.ActionBar.k {
    public final /* synthetic */ rt0 F1;
    public final /* synthetic */ na G1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ja(na naVar, Context context, rt0 rt0Var) {
        super(context, null);
        this.G1 = naVar;
        this.F1 = rt0Var;
    }

    @Override // org.telegram.ui.ActionBar.k, android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        na naVar = this.G1;
        if (naVar.C1 && naVar.D1) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void setAlpha(float f10) {
        if (getAlpha() != f10) {
            super.setAlpha(f10);
            this.F1.invalidate();
        }
    }

    @Override // android.view.View
    public final void setTag(Object obj) {
        super.setTag(obj);
        this.G1.a1();
    }
}
