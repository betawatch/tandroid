package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.ui.Components.hv0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class e extends a0 {
    public final /* synthetic */ l h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(l lVar, Context context, l lVar2) {
        super(context, lVar2);
        this.h = lVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        l lVar = this.h;
        Paint paint = lVar.H0;
        if (lVar.G0 && this.a && lVar.w != 0) {
            lVar.I0.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
            paint.setColor(lVar.w);
            canvas2 = canvas;
            lVar.F0.J(canvas2, 0.0f, lVar.I0, paint, true);
        } else {
            canvas2 = canvas;
        }
        super.dispatchDraw(canvas2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        hv0 hv0Var = this.h.F0;
        if (hv0Var != null) {
            hv0Var.P.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        hv0 hv0Var = this.h.F0;
        if (hv0Var != null) {
            hv0Var.P.remove(this);
        }
    }

    @Override // android.view.View
    public final void setAlpha(float f9) {
        super.setAlpha(f9);
        l lVar = this.h;
        lVar.invalidate();
        Runnable runnable = lVar.P0;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i10) {
        l lVar = this.h;
        lVar.w = i10;
        if (lVar.G0) {
            return;
        }
        super.setBackgroundColor(i10);
    }
}
