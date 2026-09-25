package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class ak extends org.telegram.ui.Cells.w0 {
    public final /* synthetic */ wn l2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ak(Context context, org.telegram.ui.ActionBar.d6 d6Var, wn wnVar) {
        super(context, d6Var, false);
        this.l2 = wnVar;
    }

    @Override // org.telegram.ui.Cells.w0, android.view.View
    public final void onDraw(Canvas canvas) {
        wn wnVar = this.l2;
        if (wnVar.B8 != null) {
            return;
        }
        float y3 = ((wnVar.x0.getY() + wnVar.s9) - getY()) - AndroidUtilities.dp(4.0f);
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
        wn wnVar = this.l2;
        kVar = ((org.telegram.ui.ActionBar.m2) wnVar).actionBar;
        if (kVar.s() || wnVar.A9()) {
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
        wn wnVar = this.l2;
        kVar = ((org.telegram.ui.ActionBar.m2) wnVar).actionBar;
        if (kVar.s() || wnVar.A9()) {
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
