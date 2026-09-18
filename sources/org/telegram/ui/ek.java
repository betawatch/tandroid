package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class ek extends org.telegram.ui.Cells.w0 {
    public final /* synthetic */ bo l2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ek(Context context, org.telegram.ui.ActionBar.f6 f6Var, bo boVar) {
        super(context, f6Var, false);
        this.l2 = boVar;
    }

    @Override // org.telegram.ui.Cells.w0, android.view.View
    public final void onDraw(Canvas canvas) {
        bo boVar = this.l2;
        if (boVar.B8 != null) {
            return;
        }
        float y3 = ((boVar.x0.getY() + boVar.s9) - getY()) - AndroidUtilities.dp(4.0f);
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
        org.telegram.ui.ActionBar.k kVar;
        if (getAlpha() == 0.0f) {
            return false;
        }
        bo boVar = this.l2;
        kVar = ((org.telegram.ui.ActionBar.o2) boVar).actionBar;
        if (kVar.s() || boVar.A9()) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Cells.w0, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k kVar;
        if (getAlpha() == 0.0f) {
            return false;
        }
        bo boVar = this.l2;
        kVar = ((org.telegram.ui.ActionBar.o2) boVar).actionBar;
        if (kVar.s() || boVar.A9()) {
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
