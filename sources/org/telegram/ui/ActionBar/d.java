package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.ui.Components.au0;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
        Paint paint = kVar.N0;
        if (kVar.M0 && this.a && kVar.x != 0) {
            kVar.O0.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
            paint.setColor(kVar.x);
            canvas2 = canvas;
            kVar.L0.H(canvas2, 0.0f, kVar.O0, paint, true);
        } else {
            canvas2 = canvas;
        }
        super.dispatchDraw(canvas2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        au0 au0Var = this.h.L0;
        if (au0Var != null) {
            au0Var.P.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        au0 au0Var = this.h.L0;
        if (au0Var != null) {
            au0Var.P.remove(this);
        }
    }

    @Override // android.view.View
    public final void setAlpha(float f10) {
        super.setAlpha(f10);
        k kVar = this.h;
        kVar.invalidate();
        Runnable runnable = kVar.e1;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i7) {
        k kVar = this.h;
        kVar.x = i7;
        if (kVar.M0) {
            return;
        }
        super.setBackgroundColor(i7);
    }
}
