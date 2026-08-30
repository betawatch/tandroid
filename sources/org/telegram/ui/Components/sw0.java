package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class sw0 extends jj0 {
    public float B;
    public ValueAnimator C;
    public ValueAnimator D;
    public final /* synthetic */ xw0 E;
    public int r;
    public float s;
    public ValueAnimator v;
    public boolean w;
    public long x;
    public float y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sw0(xw0 xw0Var, Context context) {
        super(context);
        org.telegram.ui.ActionBar.f6 f6Var = xw0Var.m2;
        this.E = xw0Var;
        this.w = false;
        this.y = 1.0f;
        k(xw0Var.t3 ? i0.a.k(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Wk, f6Var), (int) 102.0f) : org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Me, f6Var));
        setScaleType(ImageView.ScaleType.CENTER);
        setLayerNum(null);
    }

    @Override // org.telegram.ui.Components.jj0
    public final void c() {
        this.w = true;
        if (this.y < 1.0f) {
            ValueAnimator valueAnimator = this.D;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.D = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.y, 1.0f);
            this.D = ofFloat;
            ofFloat.addUpdateListener(new pw0(this, 2));
            this.D.addListener(new rw0(this, 0));
            this.D.setDuration(320L);
            this.D.setInterpolator(nr.h);
            this.D.start();
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        if (isPressed()) {
            float f10 = this.B;
            if (f10 != 1.0f) {
                this.B = Utilities.clamp(((1000.0f / AndroidUtilities.screenRefreshRate) / 100.0f) + f10, 1.0f, 0.0f);
                invalidate();
                this.E.invalidate();
            }
        }
        float w10 = e2.c.w(1.0f, this.B, 0.15f, 0.85f) * this.y;
        if (w10 != 1.0f) {
            canvas.save();
            canvas.scale(w10, w10, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
        }
        super.draw(canvas);
        if (w10 != 1.0f) {
            canvas.restore();
        }
    }

    public final void j() {
        if (System.currentTimeMillis() - this.x <= 250) {
            return;
        }
        this.x = System.currentTimeMillis();
        gj0 animatedDrawable = getAnimatedDrawable();
        if (animatedDrawable == null && getImageReceiver() != null) {
            animatedDrawable = getImageReceiver().getLottieAnimation();
        }
        if (animatedDrawable != null) {
            animatedDrawable.stop();
            animatedDrawable.K(0);
            animatedDrawable.F(true);
        } else if (animatedDrawable == null) {
            setProgress(0.0f);
            d();
        }
    }

    public final void k(int i10) {
        if (this.r != i10) {
            this.r = i10;
            setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
        }
    }

    public final void l(boolean z4, boolean z10) {
        if (Math.abs(this.s - (z4 ? 1.0f : 0.0f)) > 0.01f) {
            ValueAnimator valueAnimator = this.v;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.v = null;
            }
            if (!z10) {
                m(z4 ? 1.0f : 0.0f);
                return;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.s, z4 ? 1.0f : 0.0f);
            this.v = ofFloat;
            ofFloat.addUpdateListener(new pw0(this, 1));
            this.v.addListener(new rw0(this, 1));
            this.v.setDuration(350L);
            this.v.setInterpolator(nr.h);
            this.v.start();
        }
    }

    public final void m(float f10) {
        this.s = f10;
        xw0 xw0Var = this.E;
        org.telegram.ui.ActionBar.f6 f6Var = xw0Var.m2;
        if (xw0Var.t3) {
            k(i0.a.k(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Wk, f6Var), (int) (AndroidUtilities.lerp(0.4f, 0.8f, f10) * 255.0f)));
        } else {
            k(i0.a.d(this.s, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Me, f6Var), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oe, f6Var)));
        }
        invalidate();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i11);
        super.onMeasure(org.telegram.ui.b.d(4.0f, size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final void setPressed(boolean z4) {
        ValueAnimator valueAnimator;
        if (isPressed() != z4) {
            super.setPressed(z4);
            invalidate();
            this.E.invalidate();
            if (z4 && (valueAnimator = this.C) != null) {
                valueAnimator.removeAllListeners();
                this.C.cancel();
            }
            if (z4) {
                return;
            }
            float f10 = this.B;
            if (f10 != 0.0f) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, 0.0f);
                this.C = ofFloat;
                ofFloat.addUpdateListener(new pw0(this, 0));
                this.C.addListener(new rw0(this, 2));
                this.C.setInterpolator(new OvershootInterpolator(3.0f));
                this.C.setDuration(350L);
                this.C.start();
            }
        }
    }
}
