package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class ij extends org.telegram.ui.Cells.t0 {
    public final /* synthetic */ an u2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ij(Context context, org.telegram.ui.ActionBar.e6 e6Var, an anVar) {
        super(context, e6Var, false);
        this.u2 = anVar;
    }

    @Override // org.telegram.ui.Cells.t0, android.view.View
    public final void onDraw(Canvas canvas) {
        an anVar = this.u2;
        if (anVar.Q8 != null) {
            return;
        }
        float y10 = ((anVar.A0.getY() + anVar.O9) - getY()) - org.telegram.messenger.g0.L(4.0f);
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
        an anVar = this.u2;
        kVar = ((org.telegram.ui.ActionBar.e2) anVar).actionBar;
        if (kVar.x() || anVar.Y9()) {
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
        an anVar = this.u2;
        kVar = ((org.telegram.ui.ActionBar.e2) anVar).actionBar;
        if (kVar.x() || anVar.Y9()) {
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
