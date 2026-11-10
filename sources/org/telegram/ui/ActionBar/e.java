package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.ui.Components.st0;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class e extends y {
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
        st0 st0Var = this.h.K0;
        if (st0Var != null) {
            st0Var.O.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        st0 st0Var = this.h.K0;
        if (st0Var != null) {
            st0Var.O.remove(this);
        }
    }

    @Override // android.view.View
    public final void setAlpha(float f10) {
        super.setAlpha(f10);
        l lVar = this.h;
        lVar.invalidate();
        Runnable runnable = lVar.d1;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i7) {
        l lVar = this.h;
        lVar.x = i7;
        if (lVar.L0) {
            return;
        }
        super.setBackgroundColor(i7);
    }
}
