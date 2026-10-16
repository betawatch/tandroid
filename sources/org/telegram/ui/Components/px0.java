package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class px0 extends bk0 {
    public float E;
    public ValueAnimator F;
    public ValueAnimator G;
    public final /* synthetic */ ux0 H;
    public int r;
    public float s;
    public ValueAnimator v;
    public boolean w;
    public long x;
    public float y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public px0(ux0 ux0Var, Context context) {
        super(context);
        org.telegram.ui.ActionBar.c6 c6Var = ux0Var.n2;
        this.H = ux0Var;
        this.w = false;
        this.y = 1.0f;
        k(ux0Var.u3 ? i0.a.k(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Wk, c6Var), (int) 102.0f) : org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Me, c6Var));
        setScaleType(ImageView.ScaleType.CENTER);
        setLayerNum(null);
    }

    @Override // org.telegram.ui.Components.bk0
    public final void c() {
        this.w = true;
        if (this.y < 1.0f) {
            ValueAnimator valueAnimator = this.G;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.G = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.y, 1.0f);
            this.G = ofFloat;
            ofFloat.addUpdateListener(new mx0(this, 2));
            this.G.addListener(new ox0(this, 0));
            this.G.setDuration(320L);
            this.G.setInterpolator(es.h);
            this.G.start();
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        if (isPressed()) {
            float f7 = this.E;
            if (f7 != 1.0f) {
                this.E = Utilities.clamp(((1000.0f / AndroidUtilities.screenRefreshRate) / 100.0f) + f7, 1.0f, 0.0f);
                invalidate();
                this.H.invalidate();
            }
        }
        float y3 = com.google.android.gms.internal.play_billing.k3.y(1.0f, this.E, 0.15f, 0.85f) * this.y;
        if (y3 != 1.0f) {
            canvas.save();
            canvas.scale(y3, y3, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
        }
        super.draw(canvas);
        if (y3 != 1.0f) {
            canvas.restore();
        }
    }

    public final void j() {
        if (System.currentTimeMillis() - this.x <= 250) {
            return;
        }
        this.x = System.currentTimeMillis();
        yj0 animatedDrawable = getAnimatedDrawable();
        if (animatedDrawable == null && getImageReceiver() != null) {
            animatedDrawable = getImageReceiver().getLottieAnimation();
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
            ValueAnimator valueAnimator = this.v;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.v = null;
            }
            if (!z11) {
                m(z10 ? 1.0f : 0.0f);
                return;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.s, z10 ? 1.0f : 0.0f);
            this.v = ofFloat;
            ofFloat.addUpdateListener(new mx0(this, 1));
            this.v.addListener(new ox0(this, 1));
            this.v.setDuration(350L);
            this.v.setInterpolator(es.h);
            this.v.start();
        }
    }

    public final void m(float f7) {
        this.s = f7;
        ux0 ux0Var = this.H;
        org.telegram.ui.ActionBar.c6 c6Var = ux0Var.n2;
        if (ux0Var.u3) {
            k(i0.a.k(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Wk, c6Var), (int) (AndroidUtilities.lerp(0.4f, 0.8f, f7) * 255.0f)));
        } else {
            k(i0.a.d(this.s, org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Me, c6Var), org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Oe, c6Var)));
        }
        invalidate();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i11);
        super.onMeasure(org.telegram.messenger.sk.c(4.0f, size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30));
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
                ofFloat.addUpdateListener(new mx0(this, 0));
                this.F.addListener(new ox0(this, 2));
                org.telegram.messenger.sk.l(3.0f, this.F);
                this.F.setDuration(350L);
                this.F.start();
            }
        }
    }
}
