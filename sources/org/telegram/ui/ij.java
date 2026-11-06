package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class ij extends org.telegram.ui.Cells.t0 {
    public final /* synthetic */ an t2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ij(Context context, org.telegram.ui.ActionBar.f6 f6Var, an anVar) {
        super(context, f6Var, false);
        this.t2 = anVar;
    }

    @Override // org.telegram.ui.Cells.t0, android.view.View
    public final void onDraw(Canvas canvas) {
        an anVar = this.t2;
        if (anVar.P8 != null) {
            return;
        }
        float y10 = ((anVar.z0.getY() + anVar.L9) - getY()) - org.telegram.messenger.g0.L(4.0f);
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
        an anVar = this.t2;
        kVar = ((org.telegram.ui.ActionBar.f2) anVar).actionBar;
        if (kVar.v() || anVar.W9()) {
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
        an anVar = this.t2;
        kVar = ((org.telegram.ui.ActionBar.f2) anVar).actionBar;
        if (kVar.v() || anVar.W9()) {
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
