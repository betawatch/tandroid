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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class zv0 extends pi0 {
    public float A;
    public ValueAnimator B;
    public ValueAnimator C;
    public final /* synthetic */ ew0 D;
    public int r;
    public float s;
    public ValueAnimator v;
    public boolean w;
    public long x;
    public float y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zv0(ew0 ew0Var, Context context) {
        super(context);
        org.telegram.ui.ActionBar.b6 b6Var = ew0Var.l2;
        this.D = ew0Var;
        this.w = false;
        this.y = 1.0f;
        k(ew0Var.s3 ? i0.a.k(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Wk, b6Var), (int) 102.0f) : org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Me, b6Var));
        setScaleType(ImageView.ScaleType.CENTER);
        setLayerNum(null);
    }

    @Override // org.telegram.ui.Components.pi0
    public final void c() {
        this.w = true;
        if (this.y < 1.0f) {
            ValueAnimator valueAnimator = this.C;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.C = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.y, 1.0f);
            this.C = ofFloat;
            ofFloat.addUpdateListener(new wv0(this, 2));
            this.C.addListener(new yv0(this, 0));
            this.C.setDuration(320L);
            this.C.setInterpolator(gr.h);
            this.C.start();
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        if (isPressed()) {
            float f10 = this.A;
            if (f10 != 1.0f) {
                this.A = Utilities.clamp(((1000.0f / AndroidUtilities.screenRefreshRate) / 100.0f) + f10, 1.0f, 0.0f);
                invalidate();
                this.D.invalidate();
            }
        }
        float z10 = e2.c.z(1.0f, this.A, 0.15f, 0.85f) * this.y;
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
        if (System.currentTimeMillis() - this.x <= 250) {
            return;
        }
        this.x = System.currentTimeMillis();
        mi0 animatedDrawable = getAnimatedDrawable();
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

    public final void k(int i9) {
        if (this.r != i9) {
            this.r = i9;
            setColorFilter(new PorterDuffColorFilter(i9, PorterDuff.Mode.SRC_IN));
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
            ofFloat.addUpdateListener(new wv0(this, 1));
            this.v.addListener(new yv0(this, 1));
            this.v.setDuration(350L);
            this.v.setInterpolator(gr.h);
            this.v.start();
        }
    }

    public final void m(float f10) {
        this.s = f10;
        ew0 ew0Var = this.D;
        org.telegram.ui.ActionBar.b6 b6Var = ew0Var.l2;
        if (ew0Var.s3) {
            k(i0.a.k(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Wk, b6Var), (int) (AndroidUtilities.lerp(0.4f, 0.8f, f10) * 255.0f)));
        } else {
            k(i0.a.d(this.s, org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Me, b6Var), org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Oe, b6Var)));
        }
        invalidate();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i9, int i10) {
        int size = View.MeasureSpec.getSize(i10);
        super.onMeasure(org.telegram.messenger.ll.d(4.0f, size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final void setPressed(boolean z10) {
        ValueAnimator valueAnimator;
        if (isPressed() != z10) {
            super.setPressed(z10);
            invalidate();
            this.D.invalidate();
            if (z10 && (valueAnimator = this.B) != null) {
                valueAnimator.removeAllListeners();
                this.B.cancel();
            }
            if (z10) {
                return;
            }
            float f10 = this.A;
            if (f10 != 0.0f) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, 0.0f);
                this.B = ofFloat;
                ofFloat.addUpdateListener(new wv0(this, 0));
                this.B.addListener(new yv0(this, 2));
                this.B.setInterpolator(new OvershootInterpolator(3.0f));
                this.B.setDuration(350L);
                this.B.start();
            }
        }
    }
}
