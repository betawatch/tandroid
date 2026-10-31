package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public abstract class ss0 extends FrameLayout {
    public vj0 D;
    public int E;
    public org.telegram.ui.Cells.a5 F;
    public gi0 G;
    public boolean H;
    public int I;
    public boolean J;
    public float K;
    public boolean L;
    public final Paint M;
    public org.telegram.ui.ActionBar.p6 N;
    public Drawable O;
    public long a;
    public boolean b;
    public ObjectAnimator c;
    public s4.j d;
    public s4.u0 e;
    public s4.u0 f;
    public dr0 h;
    public rs0 n;
    public er0 r;
    public mr0 s;
    public or0 w;
    public br0 x;
    public lr0 y;

    public ss0(Context context) {
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
        org.telegram.ui.Cells.a5 a5Var = this.F;
        if (a5Var == null || a5Var.getVisibility() != 0) {
            return;
        }
        zj0 fastScroll = this.h.getFastScroll();
        if (fastScroll != null) {
            float L = org.telegram.messenger.i0.L(36.0f) + fastScroll.getScrollBarY();
            if (this.E == 9) {
                L += org.telegram.messenger.i0.L(64.0f);
            }
            int i10 = this.E;
            if (i10 == 8 || zt0.F0(i10)) {
                L += org.telegram.messenger.i0.L(42.0f);
            }
            float measuredWidth = (getMeasuredWidth() - this.F.getMeasuredWidth()) - org.telegram.messenger.i0.L(16.0f);
            this.F.setPivotX(r2.getMeasuredWidth());
            this.F.setPivotY(0.0f);
            this.F.setTranslationX(measuredWidth);
            this.F.setTranslationY(L);
        }
        if (fastScroll.getProgress() > 0.85f) {
            zt0.p(this, null, false);
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
        int L = org.telegram.messenger.i0.L(2.0f);
        if (this.O != null) {
            canvas.save();
            int i10 = -L;
            canvas.clipRect(i10, min, getWidth() + L, max);
            this.O.setBounds(i10, min, getWidth() + L, max);
            this.O.draw(canvas);
            canvas.restore();
            return;
        }
        if (this.L) {
            int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.a7, this.N);
            Paint paint = this.M;
            paint.setColor(w02);
            canvas.drawRect(-L, min, getWidth() + L, max, paint);
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.O || super.verifyDrawable(drawable);
    }
}
