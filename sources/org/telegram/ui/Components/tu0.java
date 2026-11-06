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

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class tu0 extends ch0 implements org.telegram.ui.ActionBar.a6 {
    public float D;
    public float E;
    public ValueAnimator F;
    public ValueAnimator G;
    public final /* synthetic */ yu0 H;
    public int r;
    public float s;
    public ValueAnimator w;
    public boolean x;
    public long y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tu0(yu0 yu0Var, Context context) {
        super(context);
        org.telegram.ui.ActionBar.f6 f6Var = yu0Var.n2;
        this.H = yu0Var;
        this.x = false;
        this.D = 1.0f;
        k(yu0Var.D3 ? i0.a.o(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Kl, f6Var), (int) 102.0f) : org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Bf, f6Var));
        setScaleType(ImageView.ScaleType.CENTER);
        setLayerNum(null);
    }

    @Override // org.telegram.ui.Components.ch0
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
            ofFloat.addUpdateListener(new qu0(this, 2));
            this.G.addListener(new su0(this, 0));
            this.G.setDuration(320L);
            this.G.setInterpolator(xq.h);
            this.G.start();
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        if (isPressed()) {
            float f10 = this.E;
            if (f10 != 1.0f) {
                this.E = Utilities.i(((1000.0f / org.telegram.messenger.g0.r) / 100.0f) + f10, 1.0f, 0.0f);
                invalidate();
                this.H.invalidate();
            }
        }
        float z9 = com.google.android.recaptcha.internal.a.z(1.0f, this.E, 0.15f, 0.85f) * this.D;
        if (z9 != 1.0f) {
            canvas.save();
            canvas.scale(z9, z9, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
        }
        super.draw(canvas);
        if (z9 != 1.0f) {
            canvas.restore();
        }
    }

    public final void j() {
        if (System.currentTimeMillis() - this.y <= 250) {
            return;
        }
        this.y = System.currentTimeMillis();
        zg0 animatedDrawable = getAnimatedDrawable();
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

    public final void k(int i7) {
        if (this.r != i7) {
            this.r = i7;
            setColorFilter(new PorterDuffColorFilter(i7, PorterDuff.Mode.SRC_IN));
        }
    }

    public final void l(boolean z9, boolean z10) {
        if (Math.abs(this.s - (z9 ? 1.0f : 0.0f)) > 0.01f) {
            ValueAnimator valueAnimator = this.w;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.w = null;
            }
            if (!z10) {
                m(z9 ? 1.0f : 0.0f);
                return;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.s, z9 ? 1.0f : 0.0f);
            this.w = ofFloat;
            ofFloat.addUpdateListener(new qu0(this, 1));
            this.w.addListener(new su0(this, 1));
            this.w.setDuration(350L);
            this.w.setInterpolator(xq.h);
            this.w.start();
        }
    }

    public final void m(float f10) {
        this.s = f10;
        yu0 yu0Var = this.H;
        org.telegram.ui.ActionBar.f6 f6Var = yu0Var.n2;
        if (yu0Var.D3) {
            k(i0.a.o(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Kl, f6Var), (int) (org.telegram.messenger.g0.T1(0.4f, 0.8f, f10) * 255.0f)));
        } else {
            k(i0.a.f(this.s, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Bf, f6Var), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Df, f6Var)));
        }
        invalidate();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i10);
        super.onMeasure(org.telegram.messenger.camera.q.c(4.0f, size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final void setPressed(boolean z9) {
        ValueAnimator valueAnimator;
        if (isPressed() != z9) {
            super.setPressed(z9);
            invalidate();
            this.H.invalidate();
            if (z9 && (valueAnimator = this.F) != null) {
                valueAnimator.removeAllListeners();
                this.F.cancel();
            }
            if (z9) {
                return;
            }
            float f10 = this.E;
            if (f10 != 0.0f) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, 0.0f);
                this.F = ofFloat;
                ofFloat.addUpdateListener(new qu0(this, 0));
                this.F.addListener(new su0(this, 2));
                org.telegram.messenger.camera.q.i(3.0f, this.F);
                this.F.setDuration(350L);
                this.F.start();
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final void updateColors() {
        try {
            if (this.w == null) {
                m(this.s);
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
