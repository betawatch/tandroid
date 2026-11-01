package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.ui.Components.vu0;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class d extends y {
    public final /* synthetic */ l h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(l lVar, Context context, l lVar2) {
        super(context, lVar2);
        this.h = lVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        l lVar = this.h;
        Paint paint = lVar.M0;
        if (lVar.L0 && this.a && lVar.x != 0) {
            lVar.N0.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
            paint.setColor(lVar.x);
            canvas2 = canvas;
            lVar.K0.H(canvas2, 0.0f, lVar.N0, paint, true);
        } else {
            canvas2 = canvas;
        }
        super.dispatchDraw(canvas2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        vu0 vu0Var = this.h.K0;
        if (vu0Var != null) {
            vu0Var.O.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        vu0 vu0Var = this.h.K0;
        if (vu0Var != null) {
            vu0Var.O.remove(this);
        }
    }

    @Override // android.view.View
    public final void setAlpha(float f7) {
        super.setAlpha(f7);
        l lVar = this.h;
        lVar.invalidate();
        Runnable runnable = lVar.d1;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i10) {
        l lVar = this.h;
        lVar.x = i10;
        if (lVar.L0) {
            return;
        }
        super.setBackgroundColor(i10);
    }
}
