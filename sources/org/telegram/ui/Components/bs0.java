package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public abstract class bs0 extends FrameLayout {
    public org.telegram.ui.ActionBar.l5 E;
    public int F;
    public bi.p2 G;
    public hn0 H;
    public boolean I;
    public int J;
    public boolean K;
    public float L;
    public boolean M;
    public final Paint N;
    public org.telegram.ui.ActionBar.i6 O;
    public Drawable P;
    public long a;
    public boolean b;
    public ObjectAnimator c;
    public v4.k d;
    public v4.w0 e;
    public v4.w0 f;
    public lq0 h;
    public as0 n;
    public mq0 r;
    public vq0 s;
    public xq0 w;
    public jq0 x;
    public uq0 y;

    public bs0(Context context) {
        super(context);
        this.N = new Paint();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDrawPageBackground(boolean z10) {
        if (this.M != z10) {
            this.M = z10;
            invalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWallpaper(Drawable drawable) {
        Drawable drawable2 = this.P;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            this.P = drawable;
            if (drawable != null) {
                drawable.setCallback(this);
            }
            invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        h(canvas);
        super.dispatchDraw(canvas);
        bi.p2 p2Var = this.G;
        if (p2Var == null || p2Var.getVisibility() != 0) {
            return;
        }
        hj0 fastScroll = this.h.getFastScroll();
        if (fastScroll != null) {
            float L = org.telegram.messenger.g0.L(36.0f) + fastScroll.getScrollBarY();
            if (this.F == 9) {
                L += org.telegram.messenger.g0.L(64.0f);
            }
            int i7 = this.F;
            if (i7 == 8 || gt0.J0(i7)) {
                L += org.telegram.messenger.g0.L(42.0f);
            }
            float measuredWidth = (getMeasuredWidth() - this.G.getMeasuredWidth()) - org.telegram.messenger.g0.L(16.0f);
            this.G.setPivotX(r2.getMeasuredWidth());
            this.G.setPivotY(0.0f);
            this.G.setTranslationX(measuredWidth);
            this.G.setTranslationY(L);
        }
        if (fastScroll.getProgress() > 0.85f) {
            gt0.s(this, null, false);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view == this.n) {
            return true;
        }
        return super.drawChild(canvas, view, j3);
    }

    public final void h(Canvas canvas) {
        int min = Math.min(0, this.h.getTop());
        int max = Math.max(getHeight(), this.h.getBottom());
        int L = org.telegram.messenger.g0.L(2.0f);
        if (this.P != null) {
            canvas.save();
            int i7 = -L;
            canvas.clipRect(i7, min, getWidth() + L, max);
            this.P.setBounds(i7, min, getWidth() + L, max);
            this.P.draw(canvas);
            canvas.restore();
            return;
        }
        if (this.M) {
            int w02 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.a7, this.O);
            Paint paint = this.N;
            paint.setColor(w02);
            canvas.drawRect(-L, min, getWidth() + L, max, paint);
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.P || super.verifyDrawable(drawable);
    }
}
