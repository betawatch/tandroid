package ei;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.sl;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.ba0;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.ca0;
import org.telegram.ui.Components.eq;
import org.telegram.ui.zd;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes4.dex */
public class d extends FrameLayout implements ba0, org.telegram.ui.ActionBar.b6 {
    public boolean E;
    public int F;
    public int G;
    public boolean H;
    public int I;
    public ci.u7 J;
    public float K;
    public ValueAnimator L;
    public boolean M;
    public ca0 N;
    public boolean O;
    public float P;
    public boolean Q;
    public ValueAnimator R;
    public float S;
    public ValueAnimator T;
    public int U;
    public boolean V;
    public boolean W;
    public org.telegram.ui.ActionBar.g6 a;
    public Drawable a0;
    public int b;
    public float b0;
    public final Paint c;
    public boolean c0;
    public final org.telegram.ui.Components.p6 d;
    public ValueAnimator d0;
    public final org.telegram.ui.Components.p6 e;
    public eq e0;
    public final org.telegram.ui.Components.p6 f;
    public int f0;
    public boolean g0;
    public float h;
    public int h0;
    public boolean i0;
    public int j0;
    public final org.telegram.ui.Components.f6 n;
    public final View r;
    public boolean s;
    public boolean v;
    public boolean w;
    public boolean x;
    public int y;

    public d(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        this(context, g6Var, true);
    }

    private int getWrapWidth() {
        return getPaddingRight() + getPaddingLeft() + ((int) (a(this.f.c() + AndroidUtilities.dp(15.66f), this.n.d(this.h, false)) + this.d.c() + (this.W ? AndroidUtilities.dp(12.0f) : 0.0f)));
    }

    private void setRippleColor(int i10) {
        View view = this.r;
        Drawable background = view.getBackground();
        if (background == null || this.G != i10) {
            this.G = i10;
            if (background instanceof RippleDrawable) {
                ((RippleDrawable) background).setColor(ColorStateList.valueOf(i10));
            } else {
                int i11 = this.b;
                view.setBackground(org.telegram.ui.ActionBar.k6.Z(i10, i11, i11));
            }
        }
    }

    public float a(float f7, float f10) {
        return f7 * f10;
    }

    public final void b(int i10, boolean z10) {
        int i11;
        org.telegram.ui.Components.p6 p6Var = this.f;
        if (z10) {
            p6Var.a();
        }
        int i12 = 1;
        if (z10 && i10 != (i11 = this.U) && i10 > 0 && i11 > 0) {
            ValueAnimator valueAnimator = this.T;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.T = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.T = ofFloat;
            ofFloat.addUpdateListener(new b(this, 0));
            this.T.addListener(new c(this, i12));
            sl.l(2.0f, this.T);
            this.T.setDuration(200L);
            this.T.start();
        }
        this.U = i10;
        this.h = (i10 != 0 || this.V) ? 1.0f : 0.0f;
        p6Var.t(LocaleController.formatNumber(i10, ' '), z10, true);
        invalidate();
    }

    @Override // org.telegram.ui.Components.ba0
    public final boolean c() {
        return this.Q;
    }

    public final void d() {
        ShapeDrawable c02 = org.telegram.ui.ActionBar.k6.c0(AndroidUtilities.dp(this.b), this.y);
        if (this.x) {
            setBackground(c02);
            return;
        }
        org.telegram.ui.ActionBar.n6 O = org.telegram.ui.ActionBar.r6.O(this.w ? org.telegram.ui.ActionBar.k6.xa : org.telegram.ui.ActionBar.k6.Oh);
        org.telegram.ui.ActionBar.g6 g6Var = this.a;
        setBackground(c02);
        org.telegram.ui.ActionBar.r6.k(this, c02, O, null, g6Var);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        return false;
    }

    public final void e() {
        this.w = true;
        setFilled(true);
        if (!this.x) {
            this.y = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.xa, this.a);
            d();
        }
        updateColors();
    }

    public final void f() {
        setRoundRadius(24);
    }

    public final void g(CharSequence charSequence, boolean z10) {
        int i10 = 0;
        boolean z11 = charSequence != null;
        org.telegram.ui.Components.p6 p6Var = this.e;
        if (z10) {
            p6Var.a();
        }
        setContentDescription(charSequence);
        invalidate();
        if (!this.M || z11) {
            p6Var.t(charSequence, z10, true);
        } else {
            ValueAnimator valueAnimator = this.L;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.L = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.K, 0.0f);
            this.L = ofFloat;
            ofFloat.addUpdateListener(new b(this, 3));
            this.L.addListener(new c(this, i10));
            this.L.setDuration(200L);
            this.L.setInterpolator(bs.f);
            this.L.start();
        }
        if (this.M || !z11) {
            return;
        }
        this.M = true;
        ValueAnimator valueAnimator2 = this.L;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
            this.L = null;
        }
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.K, 1.0f);
        this.L = ofFloat2;
        ofFloat2.addUpdateListener(new b(this, 4));
        this.L.setDuration(200L);
        this.L.setInterpolator(bs.f);
        this.L.start();
    }

    public TextPaint getTextPaint() {
        return this.d.a;
    }

    public final void h(CharSequence charSequence, boolean z10) {
        i(charSequence, false, true);
    }

    public final void i(CharSequence charSequence, boolean z10, boolean z11) {
        org.telegram.ui.Components.p6 p6Var = this.d;
        if (z10) {
            p6Var.a();
        }
        p6Var.t(charSequence, z10, z11);
        setContentDescription(charSequence);
        invalidate();
    }

    @Override // android.view.View
    public final boolean isEnabled() {
        return this.c0;
    }

    public boolean j() {
        return !(this instanceof zd);
    }

    public final void k() {
        this.W = true;
        Drawable mutate = getContext().getDrawable(R.drawable.mini_boost_button).mutate();
        this.a0 = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(this.y, PorterDuff.Mode.SRC_IN));
    }

    public final void l() {
        this.g0 = true;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int wrapWidth;
        boolean z10;
        float f7;
        this.r.draw(canvas);
        if (this.O) {
            if (this.Q) {
                if (this.N == null) {
                    ca0 ca0Var = new ca0(this.a);
                    this.N = ca0Var;
                    ca0Var.setCallback(this);
                    ca0 ca0Var2 = this.N;
                    ca0Var2.t = 2.0f;
                    ca0Var2.D = true;
                    ca0Var2.x.setStrokeWidth(0.0f);
                    this.N.f(org.telegram.ui.ActionBar.k6.o1(0.02f, -1), org.telegram.ui.ActionBar.k6.o1(0.375f, -1));
                }
                ca0 ca0Var3 = this.N;
                ca0Var3.c = -1L;
                ca0Var3.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                this.N.k(this.b);
                this.N.draw(canvas);
            } else {
                ca0 ca0Var4 = this.N;
                if (ca0Var4 != null) {
                    ca0Var4.a();
                    this.N.draw(canvas);
                    if (this.N.c()) {
                        this.N.b = -1L;
                    }
                }
            }
        }
        float f10 = this.P;
        org.telegram.ui.Components.p6 p6Var = this.d;
        if (f10 > 0.0f) {
            if (this.e0 == null) {
                this.e0 = new eq(p6Var.a.getColor());
            }
            int dp = (int) ((1.0f - this.P) * AndroidUtilities.dp(24.0f));
            this.e0.setBounds(0, dp, getWidth(), getHeight() + dp);
            this.e0.setAlpha((int) (this.P * 255.0f));
            this.e0.draw(canvas);
            invalidate();
        }
        float f11 = this.P;
        if (f11 < 1.0f) {
            if (f11 != 0.0f) {
                canvas.save();
                canvas.translate(0.0f, (int) (this.P * AndroidUtilities.dp(-24.0f)));
                canvas.scale(1.0f, 1.0f - (this.P * 0.4f));
                z10 = true;
            } else {
                z10 = false;
            }
            float c10 = p6Var.c();
            float d = this.n.d(this.h, false);
            float dp2 = this.W ? AndroidUtilities.dp(12.0f) : 0.0f;
            float dp3 = AndroidUtilities.dp(15.66f);
            org.telegram.ui.Components.p6 p6Var2 = this.f;
            float a2 = a(p6Var2.c() + dp3, d) + c10 + dp2;
            Rect rect = AndroidUtilities.rectTmp2;
            rect.set((int) (((getMeasuredWidth() - a2) - getWidth()) / 2.0f), (int) (((getMeasuredHeight() - p6Var.e) / 2.0f) - AndroidUtilities.dp(1.0f)), (int) org.telegram.messenger.v0.a(getMeasuredWidth() - a2, getWidth(), 2.0f, c10), (int) (((getMeasuredHeight() + p6Var.e) / 2.0f) - AndroidUtilities.dp(1.0f)));
            rect.offset(0, (int) ((-AndroidUtilities.dp(7.0f)) * this.K));
            p6Var.B = (int) (AndroidUtilities.lerp(0.5f, 1.0f, this.b0) * (1.0f - this.P) * this.f0);
            p6Var.setBounds(rect);
            p6Var.draw(canvas);
            if (this.M) {
                org.telegram.ui.Components.p6 p6Var3 = this.e;
                a2 = p6Var3.c();
                rect.set((int) (((getMeasuredWidth() - a2) - getWidth()) / 2.0f), (int) (((getMeasuredHeight() - p6Var3.e) / 2.0f) - AndroidUtilities.dp(1.0f)), (int) org.telegram.messenger.v0.a(getMeasuredWidth() - a2, getWidth(), 2.0f, a2), (int) (((getMeasuredHeight() + p6Var3.e) / 2.0f) - AndroidUtilities.dp(1.0f)));
                rect.offset(0, AndroidUtilities.dp(11.0f));
                canvas.save();
                float lerp = AndroidUtilities.lerp(0.1f, 1.0f, this.K);
                canvas.scale(lerp, lerp, rect.centerX(), rect.bottom);
                p6Var3.B = (int) (AndroidUtilities.lerp(0.5f, 1.0f, this.b0) * (1.0f - this.P) * 200.0f * this.K);
                p6Var3.setBounds(rect);
                p6Var3.draw(canvas);
                canvas.restore();
            }
            rect.set((int) (com.google.android.gms.internal.play_billing.k3.z(getMeasuredWidth(), a2, 2.0f, c10) + AndroidUtilities.dp(this.H ? 5.0f : 2.0f)), (int) ((getMeasuredHeight() - AndroidUtilities.dp(18.0f)) / 2.0f), (int) (Math.max(AndroidUtilities.dp(9.0f), p6Var2.c() + dp2) + com.google.android.gms.internal.play_billing.k3.z(getMeasuredWidth(), a2, 2.0f, c10) + AndroidUtilities.dp((this.H ? 5 : 2) + 8)), (int) ((AndroidUtilities.dp(18.0f) + getMeasuredHeight()) / 2.0f));
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(rect);
            if (this.S != 1.0f) {
                canvas.save();
                float f12 = this.S;
                canvas.scale(f12, f12, rect.centerX(), rect.centerY());
            }
            if (this.H) {
                f7 = 0.5f;
                int lerp2 = (int) (AndroidUtilities.lerp(0.5f, 1.0f, this.b0) * (1.0f - this.P) * this.f0 * d * d);
                Paint paint = this.c;
                paint.setAlpha(lerp2);
                float dp4 = AndroidUtilities.dp(this.W ? 4.0f : 10.0f);
                canvas.drawRoundRect(rectF, dp4, dp4, paint);
            } else {
                f7 = 0.5f;
            }
            CharSequence charSequence = p6Var2.i;
            rect.offset(-AndroidUtilities.dp((charSequence != null ? charSequence.length() : 0) > 1 ? 0.3f : 0.0f), -AndroidUtilities.dp(0.4f));
            float A = org.telegram.messenger.v0.A(1.0f, this.P, this.f0, d);
            if (this.H) {
                f7 = 1.0f;
            }
            p6Var2.B = (int) (A * f7);
            p6Var2.setBounds(rect);
            canvas.save();
            if (this.H && this.W) {
                this.a0.setAlpha((int) ((1.0f - this.P) * this.f0 * d * 1.0f));
                this.a0.setBounds(AndroidUtilities.dp(1.0f) + rect.left, AndroidUtilities.dp(2.0f) + rect.top, this.a0.getIntrinsicWidth() + AndroidUtilities.dp(1.0f) + rect.left, this.a0.getIntrinsicHeight() + AndroidUtilities.dp(2.0f) + rect.top);
                this.a0.draw(canvas);
                canvas.translate(dp2 / 2.0f, 0.0f);
            }
            p6Var2.draw(canvas);
            canvas.restore();
            if (this.S != 1.0f) {
                canvas.restore();
            }
            if (z10) {
                canvas.restore();
            }
        }
        if (!this.v || this.j0 == (wrapWidth = getWrapWidth())) {
            return;
        }
        this.j0 = wrapWidth;
        requestLayout();
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Button");
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.s && isClickable() && getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        if (!this.v) {
            if (!this.i0) {
                super.onMeasure(i10, i11);
                return;
            } else {
                super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) Math.min(Math.max(this.d.c() + getPaddingLeft() + getPaddingRight(), this.h0), View.MeasureSpec.getSize(i10)), TLObject.FLAG_30), i11);
                return;
            }
        }
        int wrapWidth = getWrapWidth();
        this.j0 = wrapWidth;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(wrapWidth, View.MeasureSpec.getSize(i10)), TLObject.FLAG_30), i11);
        View view = this.r;
        if (view != null) {
            view.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), TLObject.FLAG_30));
        }
    }

    public void setColor(int i10) {
        if (this.s) {
            this.x = true;
            int dp = AndroidUtilities.dp(this.b);
            this.y = i10;
            setBackground(org.telegram.ui.ActionBar.k6.c0(dp, i10));
            return;
        }
        this.E = true;
        this.d.u(i10);
        int o12 = org.telegram.ui.ActionBar.k6.o1(0.1f, i10);
        int i11 = this.b;
        this.r.setBackground(org.telegram.ui.ActionBar.k6.Z(o12, i11, i11));
    }

    public void setCountFilled(boolean z10) {
        this.H = z10;
        float dp = AndroidUtilities.dp(z10 ? 12.0f : 14.0f);
        org.telegram.ui.Components.p6 p6Var = this.f;
        p6Var.w(dp);
        p6Var.u(this.H ? this.y : this.d.a.getColor());
    }

    public void setCounterColor(int i10) {
        this.f.u(i10);
        this.a0.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        if (this.c0 != z10) {
            ValueAnimator valueAnimator = this.d0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.d0 = null;
            }
            float f7 = this.b0;
            this.c0 = z10;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, z10 ? 1.0f : 0.0f);
            this.d0 = ofFloat;
            ofFloat.addUpdateListener(new b(this, 1));
            this.d0.start();
        }
        super.setEnabled(z10);
    }

    public void setFilled(boolean z10) {
        if (this.s == z10) {
            return;
        }
        this.s = z10;
        org.telegram.ui.Components.p6 p6Var = this.d;
        if (z10) {
            d();
            p6Var.x(AndroidUtilities.bold());
        } else {
            setBackground(null);
            p6Var.x(null);
        }
        updateColors();
    }

    public void setFlickeringLoading(boolean z10) {
        this.O = z10;
    }

    public void setGlobalAlpha(float f7) {
        this.f0 = (int) (f7 * 255.0f);
    }

    @Override // org.telegram.ui.Components.ba0
    public void setLoading(boolean z10) {
        if (this.Q != z10) {
            if (this.O) {
                this.Q = z10;
                invalidate();
                return;
            }
            ValueAnimator valueAnimator = this.R;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.R = null;
            }
            float f7 = this.P;
            this.Q = z10;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, z10 ? 1.0f : 0.0f);
            this.R = ofFloat;
            ofFloat.addUpdateListener(new b(this, 2));
            this.R.addListener(new ah.p0(7, this, z10));
            this.R.setDuration(320L);
            this.R.setInterpolator(bs.h);
            this.R.start();
        }
    }

    public void setMinWidth(int i10) {
        this.i0 = true;
        this.h0 = i10;
    }

    public void setRoundRadius(int i10) {
        this.b = i10;
        if (this.s) {
            d();
        } else {
            setBackground(null);
        }
        this.r.setBackground(null);
        updateColors();
    }

    public void setShowZero(boolean z10) {
        this.V = z10;
    }

    public void setText(CharSequence charSequence) {
        i(charSequence, false, true);
    }

    public void setTextAlpha(float f7) {
        this.d.B = (int) (f7 * 255.0f);
    }

    public void setTextColor(int i10) {
        this.F = -1;
        this.E = true;
        org.telegram.ui.Components.p6 p6Var = this.d;
        p6Var.u(i10);
        if (this.s) {
            return;
        }
        setRippleColor(org.telegram.ui.ActionBar.k6.o1(0.1f, p6Var.a.getColor()));
    }

    public void setTextColorKey(int i10) {
        this.F = i10;
        this.E = false;
        updateColors();
    }

    public void setUseWrapContent(boolean z10) {
        this.v = z10;
    }

    @Override // org.telegram.ui.ActionBar.b6
    public void updateColors() {
        if (!this.x) {
            this.y = org.telegram.ui.ActionBar.k6.w0(this.w ? org.telegram.ui.ActionBar.k6.xa : org.telegram.ui.ActionBar.k6.Oh, this.a);
        }
        boolean z10 = this.E;
        org.telegram.ui.Components.p6 p6Var = this.d;
        if (!z10) {
            int i10 = this.F;
            if (i10 < 0) {
                i10 = this.s ? this.w ? org.telegram.ui.ActionBar.k6.ya : org.telegram.ui.ActionBar.k6.Sh : org.telegram.ui.ActionBar.k6.Oh;
            }
            p6Var.u(org.telegram.ui.ActionBar.k6.w0(i10, this.a));
        }
        if (this.s) {
            setRippleColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.i6, this.a));
        } else if (!this.E) {
            setRippleColor(org.telegram.ui.ActionBar.k6.o1(0.1f, p6Var.a.getColor()));
        }
        if (!this.E) {
            this.e.u(org.telegram.ui.ActionBar.k6.w0(this.s ? this.w ? org.telegram.ui.ActionBar.k6.ya : org.telegram.ui.ActionBar.k6.Sh : org.telegram.ui.ActionBar.k6.Oh, this.a));
        }
        this.f.u(this.y);
        this.c.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Sh, this.a));
        invalidate();
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return this.N == drawable || this.d == drawable || this.e == drawable || this.f == drawable || super.verifyDrawable(drawable);
    }

    public d(Context context, org.telegram.ui.ActionBar.g6 g6Var, boolean z10) {
        super(context);
        this.b = 8;
        bs bsVar = bs.h;
        this.n = new org.telegram.ui.Components.f6(350L, bsVar);
        this.F = -1;
        this.H = true;
        this.I = 0;
        this.K = 0.0f;
        this.P = 0.0f;
        this.S = 1.0f;
        this.b0 = 1.0f;
        this.c0 = true;
        this.f0 = 255;
        this.s = z10;
        this.a = g6Var;
        w7.b6.b(this, 0.02f, 1.2f);
        View view = new View(context);
        this.r = view;
        addView(view, w7.z5.c(-1.0f, -1));
        if (z10) {
            int dp = AndroidUtilities.dp(8.0f);
            int i10 = org.telegram.ui.ActionBar.k6.Oh;
            int w02 = org.telegram.ui.ActionBar.k6.w0(i10, g6Var);
            this.y = w02;
            ShapeDrawable c02 = org.telegram.ui.ActionBar.k6.c0(dp, w02);
            org.telegram.ui.ActionBar.n6 O = org.telegram.ui.ActionBar.r6.O(i10);
            setBackground(c02);
            org.telegram.ui.ActionBar.r6.k(this, c02, O, null, g6Var);
        }
        Paint paint = new Paint(1);
        this.c = paint;
        paint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Sh, g6Var));
        org.telegram.ui.Components.p6 p6Var = new org.telegram.ui.Components.p6(true, true, false, false, true);
        this.d = p6Var;
        p6Var.n(0.3f, 250L, bsVar);
        p6Var.setCallback(this);
        p6Var.w(AndroidUtilities.dp(14.0f));
        if (z10) {
            p6Var.x(AndroidUtilities.bold());
        }
        p6Var.b = 1;
        org.telegram.ui.Components.p6 p6Var2 = new org.telegram.ui.Components.p6(j(), true, false);
        this.e = p6Var2;
        p6Var2.n(0.3f, 250L, bsVar);
        p6Var2.setCallback(this);
        p6Var2.w(AndroidUtilities.dp(12.0f));
        p6Var2.b = 1;
        org.telegram.ui.Components.p6 p6Var3 = new org.telegram.ui.Components.p6(false, false, true);
        this.f = p6Var3;
        p6Var3.n(0.3f, 250L, bsVar);
        p6Var3.setCallback(this);
        p6Var3.w(AndroidUtilities.dp(12.0f));
        p6Var3.x(AndroidUtilities.bold());
        p6Var3.t("", true, true);
        p6Var3.b = 1;
        setWillNotDraw(false);
        updateColors();
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
