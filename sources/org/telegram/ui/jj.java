package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class jj extends org.telegram.ui.Cells.v0 {
    public final /* synthetic */ bn z2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jj(Context context, org.telegram.ui.ActionBar.h6 h6Var, bn bnVar) {
        super(context, h6Var, false);
        this.z2 = bnVar;
    }

    @Override // org.telegram.ui.Cells.v0, android.view.View
    public final void onDraw(Canvas canvas) {
        bn bnVar = this.z2;
        if (bnVar.R8 != null) {
            return;
        }
        float y10 = ((bnVar.A0.getY() + bnVar.P9) - getY()) - org.telegram.messenger.g0.L(4.0f);
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
        bn bnVar = this.z2;
        kVar = ((org.telegram.ui.ActionBar.g2) bnVar).actionBar;
        if (kVar.x() || bnVar.Y9()) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Cells.v0, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k kVar;
        if (getAlpha() == 0.0f) {
            return false;
        }
        bn bnVar = this.z2;
        kVar = ((org.telegram.ui.ActionBar.g2) bnVar).actionBar;
        if (kVar.x() || bnVar.Y9()) {
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
