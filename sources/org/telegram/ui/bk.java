package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class bk extends org.telegram.ui.Cells.v0 {
    public final /* synthetic */ zn h2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bk(Context context, org.telegram.ui.ActionBar.f6 f6Var, zn znVar) {
        super(context, f6Var, false);
        this.h2 = znVar;
    }

    @Override // org.telegram.ui.Cells.v0, android.view.View
    public final void onDraw(Canvas canvas) {
        zn znVar = this.h2;
        if (znVar.y8 != null) {
            return;
        }
        float y10 = ((znVar.u0.getY() + znVar.p9) - getY()) - AndroidUtilities.dp(4.0f);
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
        zn znVar = this.h2;
        kVar = ((org.telegram.ui.ActionBar.p2) znVar).actionBar;
        if (kVar.s() || znVar.A9()) {
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
        zn znVar = this.h2;
        kVar = ((org.telegram.ui.ActionBar.p2) znVar).actionBar;
        if (kVar.s() || znVar.A9()) {
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
