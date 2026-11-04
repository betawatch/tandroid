package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class ej extends org.telegram.ui.Cells.t0 {
    public final /* synthetic */ wm u2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ej(Context context, org.telegram.ui.ActionBar.e6 e6Var, wm wmVar) {
        super(context, e6Var, false);
        this.u2 = wmVar;
    }

    @Override // org.telegram.ui.Cells.t0, android.view.View
    public final void onDraw(Canvas canvas) {
        wm wmVar = this.u2;
        if (wmVar.Q8 != null) {
            return;
        }
        float y9 = ((wmVar.A0.getY() + wmVar.M9) - getY()) - org.telegram.messenger.g0.L(4.0f);
        if (y9 <= 0.0f) {
            super.onDraw(canvas);
        } else if (y9 < getMeasuredHeight()) {
            canvas.save();
            canvas.clipRect(0.0f, y9, getMeasuredWidth(), getMeasuredHeight());
            super.onDraw(canvas);
            canvas.restore();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k kVar;
        if (getAlpha() == 0.0f) {
            return false;
        }
        wm wmVar = this.u2;
        kVar = ((org.telegram.ui.ActionBar.d2) wmVar).actionBar;
        if (kVar.v() || wmVar.W9()) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Cells.t0, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k kVar;
        if (getAlpha() == 0.0f) {
            return false;
        }
        wm wmVar = this.u2;
        kVar = ((org.telegram.ui.ActionBar.d2) wmVar).actionBar;
        if (kVar.v() || wmVar.W9()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void setAlpha(float f10) {
        super.setAlpha(f10);
        setVisibility(f10 > 0.0f ? 0 : 4);
    }

    @Override // android.view.View
    public final void setTranslationY(float f10) {
        if (getTranslationY() != f10) {
            invalidate();
        }
        super.setTranslationY(f10);
    }
}
