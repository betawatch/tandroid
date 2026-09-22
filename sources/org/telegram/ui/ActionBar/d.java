package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.ui.Components.pv0;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class d extends z {
    public final /* synthetic */ k h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(k kVar, Context context, k kVar2) {
        super(context, kVar2);
        this.h = kVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        k kVar = this.h;
        Paint paint = kVar.L0;
        if (kVar.K0 && this.a && kVar.w != 0) {
            kVar.M0.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
            paint.setColor(kVar.w);
            canvas2 = canvas;
            kVar.J0.J(canvas2, 0.0f, kVar.M0, paint, true);
        } else {
            canvas2 = canvas;
        }
        super.dispatchDraw(canvas2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        pv0 pv0Var = this.h.J0;
        if (pv0Var != null) {
            pv0Var.T.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        pv0 pv0Var = this.h.J0;
        if (pv0Var != null) {
            pv0Var.T.remove(this);
        }
    }

    @Override // android.view.View
    public final void setAlpha(float f7) {
        super.setAlpha(f7);
        k kVar = this.h;
        kVar.invalidate();
        Runnable runnable = kVar.T0;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i10) {
        k kVar = this.h;
        kVar.w = i10;
        if (kVar.K0) {
            return;
        }
        super.setBackgroundColor(i10);
    }
}
