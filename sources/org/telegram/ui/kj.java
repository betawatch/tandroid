package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class kj extends org.telegram.ui.Cells.t0 {
    public final /* synthetic */ cn t2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kj(Context context, org.telegram.ui.ActionBar.g6 g6Var, cn cnVar) {
        super(context, g6Var, false);
        this.t2 = cnVar;
    }

    @Override // org.telegram.ui.Cells.t0, android.view.View
    public final void onDraw(Canvas canvas) {
        cn cnVar = this.t2;
        if (cnVar.P8 != null) {
            return;
        }
        float y10 = ((cnVar.z0.getY() + cnVar.N9) - getY()) - org.telegram.messenger.g0.L(4.0f);
        if (y10 <= 0.0f) {
            super.onDraw(canvas);
        } else if (y10 < getMeasuredHeight()) {
            canvas.save();
            canvas.clipRect(0.0f, y10, getMeasuredWidth(), getMeasuredHeight());
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
        cn cnVar = this.t2;
        kVar = ((org.telegram.ui.ActionBar.f2) cnVar).actionBar;
        if (kVar.w() || cnVar.X9()) {
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
        cn cnVar = this.t2;
        kVar = ((org.telegram.ui.ActionBar.f2) cnVar).actionBar;
        if (kVar.w() || cnVar.X9()) {
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
