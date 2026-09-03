package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.ui.Components.pv0;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
        Paint paint = kVar.I0;
        if (kVar.H0 && this.a && kVar.w != 0) {
            kVar.J0.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
            paint.setColor(kVar.w);
            canvas2 = canvas;
            kVar.G0.J(canvas2, 0.0f, kVar.J0, paint, true);
        } else {
            canvas2 = canvas;
        }
        super.dispatchDraw(canvas2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        pv0 pv0Var = this.h.G0;
        if (pv0Var != null) {
            pv0Var.Q.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        pv0 pv0Var = this.h.G0;
        if (pv0Var != null) {
            pv0Var.Q.remove(this);
        }
    }

    @Override // android.view.View
    public final void setAlpha(float f10) {
        super.setAlpha(f10);
        k kVar = this.h;
        kVar.invalidate();
        Runnable runnable = kVar.Q0;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i10) {
        k kVar = this.h;
        kVar.w = i10;
        if (kVar.H0) {
            return;
        }
        super.setBackgroundColor(i10);
    }
}
