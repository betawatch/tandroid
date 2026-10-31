package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.ImageView;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class wv0 extends ei0 implements org.telegram.ui.ActionBar.k6 {
    public float D;
    public float E;
    public ValueAnimator F;
    public ValueAnimator G;
    public final /* synthetic */ bw0 H;
    public int r;
    public float s;
    public ValueAnimator w;
    public boolean x;
    public long y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wv0(bw0 bw0Var, Context context) {
        super(context);
        org.telegram.ui.ActionBar.p6 p6Var = bw0Var.n2;
        this.H = bw0Var;
        this.x = false;
        this.D = 1.0f;
        k(bw0Var.D3 ? i0.b.o(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Kl, p6Var), (int) 102.0f) : org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Bf, p6Var));
        setScaleType(ImageView.ScaleType.CENTER);
        setLayerNum(null);
    }

    @Override // org.telegram.ui.Components.ei0
    public final void c() {
        this.x = true;
        if (this.D < 1.0f) {
            ValueAnimator valueAnimator = this.G;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.G = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.D, 1.0f);
            this.G = ofFloat;
            ofFloat.addUpdateListener(new tv0(this, 2));
            this.G.addListener(new vv0(this, 0));
            this.G.setDuration(320L);
            this.G.setInterpolator(gr.h);
            this.G.start();
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        if (isPressed()) {
            float f7 = this.E;
            if (f7 != 1.0f) {
                this.E = Utilities.i(((1000.0f / org.telegram.messenger.i0.r) / 100.0f) + f7, 1.0f, 0.0f);
                invalidate();
                this.H.invalidate();
            }
        }
        float z10 = c3.i0.z(1.0f, this.E, 0.15f, 0.85f) * this.D;
        if (z10 != 1.0f) {
            canvas.save();
            canvas.scale(z10, z10, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
        }
        super.draw(canvas);
        if (z10 != 1.0f) {
            canvas.restore();
        }
    }

    public final void j() {
        if (System.currentTimeMillis() - this.y <= 250) {
            return;
        }
        this.y = System.currentTimeMillis();
        bi0 animatedDrawable = getAnimatedDrawable();
        if (animatedDrawable == null && getImageReceiver() != null) {
            animatedDrawable = getImageReceiver().B();
        }
        if (animatedDrawable != null) {
            animatedDrawable.stop();
            animatedDrawable.M(0);
            animatedDrawable.H(true);
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

    public final void l(boolean z10, boolean z11) {
        if (Math.abs(this.s - (z10 ? 1.0f : 0.0f)) > 0.01f) {
            ValueAnimator valueAnimator = this.w;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.w = null;
            }
            if (!z11) {
                m(z10 ? 1.0f : 0.0f);
                return;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.s, z10 ? 1.0f : 0.0f);
            this.w = ofFloat;
            ofFloat.addUpdateListener(new tv0(this, 1));
            this.w.addListener(new vv0(this, 1));
            this.w.setDuration(350L);
            this.w.setInterpolator(gr.h);
            this.w.start();
        }
    }

    public final void m(float f7) {
        this.s = f7;
        bw0 bw0Var = this.H;
        org.telegram.ui.ActionBar.p6 p6Var = bw0Var.n2;
        if (bw0Var.D3) {
            k(i0.b.o(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Kl, p6Var), (int) (org.telegram.messenger.i0.T1(0.4f, 0.8f, f7) * 255.0f)));
        } else {
            k(i0.b.f(this.s, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Bf, p6Var), org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Df, p6Var)));
        }
        invalidate();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i11);
        super.onMeasure(org.telegram.messenger.z20.c(4.0f, size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final void setPressed(boolean z10) {
        ValueAnimator valueAnimator;
        if (isPressed() != z10) {
            super.setPressed(z10);
            invalidate();
            this.H.invalidate();
            if (z10 && (valueAnimator = this.F) != null) {
                valueAnimator.removeAllListeners();
                this.F.cancel();
            }
            if (z10) {
                return;
            }
            float f7 = this.E;
            if (f7 != 0.0f) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, 0.0f);
                this.F = ofFloat;
                ofFloat.addUpdateListener(new tv0(this, 0));
                this.F.addListener(new vv0(this, 2));
                org.telegram.messenger.z20.j(3.0f, this.F);
                this.F.setDuration(350L);
                this.F.start();
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        try {
            if (this.w == null) {
                m(this.s);
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
