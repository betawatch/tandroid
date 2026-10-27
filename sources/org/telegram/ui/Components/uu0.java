package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public abstract class uu0 extends FrameLayout {
    public int E;
    public tr0 F;
    public u90 G;
    public boolean H;
    public int I;
    public boolean J;
    public float K;
    public boolean L;
    public final Paint M;
    public org.telegram.ui.ActionBar.u6 N;
    public Drawable O;
    public long a;
    public boolean b;
    public ObjectAnimator c;
    public s4.l d;
    public s4.w0 e;
    public s4.w0 f;
    public et0 h;
    public tu0 n;
    public ft0 r;
    public nt0 s;
    public pt0 v;
    public ct0 w;
    public mt0 x;
    public ql0 y;

    public uu0(Context context) {
        super(context);
        this.M = new Paint();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDrawPageBackground(boolean z10) {
        if (this.L != z10) {
            this.L = z10;
            invalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWallpaper(Drawable drawable) {
        Drawable drawable2 = this.O;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            this.O = drawable;
            if (drawable != null) {
                drawable.setCallback(this);
            }
            invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        e(canvas);
        super.dispatchDraw(canvas);
        tr0 tr0Var = this.F;
        if (tr0Var == null || tr0Var.getVisibility() != 0) {
            return;
        }
        tl0 fastScroll = this.h.getFastScroll();
        if (fastScroll != null) {
            float dp = AndroidUtilities.dp(36.0f) + fastScroll.getScrollBarY();
            if (this.E == 9) {
                dp += AndroidUtilities.dp(64.0f);
            }
            int i10 = this.E;
            if (i10 == 8 || bw0.E0(i10)) {
                dp += AndroidUtilities.dp(42.0f);
            }
            float measuredWidth = (getMeasuredWidth() - this.F.getMeasuredWidth()) - AndroidUtilities.dp(16.0f);
            this.F.setPivotX(r2.getMeasuredWidth());
            this.F.setPivotY(0.0f);
            this.F.setTranslationX(measuredWidth);
            this.F.setTranslationY(dp);
        }
        if (fastScroll.getProgress() > 0.85f) {
            bw0.t(this, null, false);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.n) {
            return true;
        }
        return super.drawChild(canvas, view, j10);
    }

    public final void e(Canvas canvas) {
        int min = Math.min(0, this.h.getTop());
        int max = Math.max(getHeight(), this.h.getBottom());
        int dp = AndroidUtilities.dp(2.0f);
        if (this.O != null) {
            canvas.save();
            int i10 = -dp;
            canvas.clipRect(i10, min, getWidth() + dp, max);
            this.O.setBounds(i10, min, getWidth() + dp, max);
            this.O.draw(canvas);
            canvas.restore();
            return;
        }
        if (this.L) {
            int w02 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.a7, this.N);
            Paint paint = this.M;
            paint.setColor(w02);
            canvas.drawRect(-dp, min, getWidth() + dp, max, paint);
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.O || super.verifyDrawable(drawable);
    }
}
