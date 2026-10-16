package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class jk extends org.telegram.ui.Cells.w0 {
    public final /* synthetic */ fo t2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jk(Context context, org.telegram.ui.ActionBar.c6 c6Var, fo foVar) {
        super(context, c6Var, false);
        this.t2 = foVar;
    }

    @Override // org.telegram.ui.Cells.w0, android.view.View
    public final void onDraw(Canvas canvas) {
        fo foVar = this.t2;
        if (foVar.B8 != null) {
            return;
        }
        float y3 = ((foVar.x0.getY() + foVar.s9) - getY()) - AndroidUtilities.dp(4.0f);
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
        fo foVar = this.t2;
        kVar = ((org.telegram.ui.ActionBar.m2) foVar).actionBar;
        if (kVar.t() || foVar.F9()) {
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
        fo foVar = this.t2;
        kVar = ((org.telegram.ui.ActionBar.m2) foVar).actionBar;
        if (kVar.t() || foVar.F9()) {
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
