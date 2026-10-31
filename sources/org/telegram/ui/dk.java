package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class dk extends org.telegram.ui.Cells.s0 {
    public final /* synthetic */ un t2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dk(Context context, org.telegram.ui.ActionBar.p6 p6Var, un unVar) {
        super(context, p6Var, false);
        this.t2 = unVar;
    }

    @Override // org.telegram.ui.Cells.s0, android.view.View
    public final void onDraw(Canvas canvas) {
        un unVar = this.t2;
        if (unVar.P8 != null) {
            return;
        }
        float y3 = ((unVar.z0.getY() + unVar.L9) - getY()) - org.telegram.messenger.i0.L(4.0f);
        if (y3 <= 0.0f) {
            super.onDraw(canvas);
        } else if (y3 < getMeasuredHeight()) {
            canvas.save();
            canvas.clipRect(0.0f, y3, getMeasuredWidth(), getMeasuredHeight());
            super.onDraw(canvas);
            canvas.restore();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.l lVar;
        if (getAlpha() == 0.0f) {
            return false;
        }
        un unVar = this.t2;
        lVar = ((org.telegram.ui.ActionBar.k2) unVar).actionBar;
        if (lVar.u() || unVar.M9()) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Cells.s0, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.l lVar;
        if (getAlpha() == 0.0f) {
            return false;
        }
        un unVar = this.t2;
        lVar = ((org.telegram.ui.ActionBar.k2) unVar).actionBar;
        if (lVar.u() || unVar.M9()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void setAlpha(float f7) {
        super.setAlpha(f7);
        setVisibility(f7 > 0.0f ? 0 : 4);
    }

    @Override // android.view.View
    public final void setTranslationY(float f7) {
        if (getTranslationY() != f7) {
            invalidate();
        }
        super.setTranslationY(f7);
    }
}
