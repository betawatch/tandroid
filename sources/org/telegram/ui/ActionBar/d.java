package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.ui.Components.cw0;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
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
        Paint paint = kVar.M0;
        if (kVar.L0 && this.a && kVar.w != 0) {
            kVar.N0.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
            paint.setColor(kVar.w);
            canvas2 = canvas;
            kVar.K0.J(canvas2, 0.0f, kVar.N0, paint, true);
        } else {
            canvas2 = canvas;
        }
        super.dispatchDraw(canvas2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        cw0 cw0Var = this.h.K0;
        if (cw0Var != null) {
            cw0Var.T.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        cw0 cw0Var = this.h.K0;
        if (cw0Var != null) {
            cw0Var.T.remove(this);
        }
    }

    @Override // android.view.View
    public final void setAlpha(float f7) {
        super.setAlpha(f7);
        k kVar = this.h;
        kVar.invalidate();
        Runnable runnable = kVar.U0;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i10) {
        k kVar = this.h;
        kVar.w = i10;
        if (kVar.L0) {
            return;
        }
        super.setBackgroundColor(i10);
    }
}
