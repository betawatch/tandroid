package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public abstract class sr0 extends FrameLayout {
    public ri0 D;
    public int E;
    public di.a4 F;
    public v80 G;
    public boolean H;
    public int I;
    public boolean J;
    public float K;
    public boolean L;
    public final Paint M;
    public org.telegram.ui.ActionBar.f6 N;
    public Drawable O;
    public long a;
    public boolean b;
    public ObjectAnimator c;
    public v4.k d;
    public v4.u0 e;
    public v4.u0 f;
    public cq0 h;
    public rr0 n;
    public dq0 r;
    public lq0 s;
    public nq0 w;
    public aq0 x;
    public kq0 y;

    public sr0(Context context) {
        super(context);
        this.M = new Paint();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDrawPageBackground(boolean z9) {
        if (this.L != z9) {
            this.L = z9;
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
        g(canvas);
        super.dispatchDraw(canvas);
        di.a4 a4Var = this.F;
        if (a4Var == null || a4Var.getVisibility() != 0) {
            return;
        }
        ui0 fastScroll = this.h.getFastScroll();
        if (fastScroll != null) {
            float L = org.telegram.messenger.g0.L(36.0f) + fastScroll.getScrollBarY();
            if (this.E == 9) {
                L += org.telegram.messenger.g0.L(64.0f);
            }
            int i7 = this.E;
            if (i7 == 8 || xs0.I0(i7)) {
                L += org.telegram.messenger.g0.L(42.0f);
            }
            float measuredWidth = (getMeasuredWidth() - this.F.getMeasuredWidth()) - org.telegram.messenger.g0.L(16.0f);
            this.F.setPivotX(r2.getMeasuredWidth());
            this.F.setPivotY(0.0f);
            this.F.setTranslationX(measuredWidth);
            this.F.setTranslationY(L);
        }
        if (fastScroll.getProgress() > 0.85f) {
            xs0.s(this, null, false);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view == this.n) {
            return true;
        }
        return super.drawChild(canvas, view, j3);
    }

    public final void g(Canvas canvas) {
        int min = Math.min(0, this.h.getTop());
        int max = Math.max(getHeight(), this.h.getBottom());
        int L = org.telegram.messenger.g0.L(2.0f);
        if (this.O != null) {
            canvas.save();
            int i7 = -L;
            canvas.clipRect(i7, min, getWidth() + L, max);
            this.O.setBounds(i7, min, getWidth() + L, max);
            this.O.draw(canvas);
            canvas.restore();
            return;
        }
        if (this.L) {
            int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.a7, this.N);
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
