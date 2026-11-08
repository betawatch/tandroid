package fi;

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
import org.telegram.messenger.beta.R;
import org.telegram.messenger.id;
import org.telegram.messenger.qs;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.a80;
import org.telegram.ui.Components.cp;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Components.z70;
import org.telegram.ui.pd;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public class d extends FrameLayout implements z70, org.telegram.ui.ActionBar.a6 {
    public int D;
    public boolean E;
    public int F;
    public int G;
    public boolean H;
    public int I;
    public f2.h J;
    public float K;
    public ValueAnimator L;
    public boolean M;
    public a80 N;
    public boolean O;
    public float P;
    public boolean Q;
    public ValueAnimator R;
    public float S;
    public ValueAnimator T;
    public int U;
    public boolean V;
    public boolean W;
    public org.telegram.ui.ActionBar.f6 a;
    public Drawable a0;
    public int b;
    public float b0;
    public final Paint c;
    public boolean c0;
    public final org.telegram.ui.Components.i6 d;
    public ValueAnimator d0;
    public final org.telegram.ui.Components.i6 e;
    public cp e0;
    public final org.telegram.ui.Components.i6 f;
    public int f0;
    public boolean g0;
    public float h;
    public int h0;
    public boolean i0;
    public int j0;
    public final org.telegram.ui.Components.w5 n;
    public final View r;
    public boolean s;
    public boolean w;
    public boolean x;
    public boolean y;

    public d(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        this(context, f6Var, true);
    }

    private int getWrapWidth() {
        return getPaddingRight() + getPaddingLeft() + ((int) (b(this.f.c() + org.telegram.messenger.g0.L(15.66f), this.n.e(false, this.h)) + this.d.c() + (this.W ? org.telegram.messenger.g0.L(12.0f) : 0.0f)));
    }

    private void setRippleColor(int i7) {
        View view = this.r;
        Drawable background = view.getBackground();
        if (background == null || this.G != i7) {
            this.G = i7;
            if (background instanceof RippleDrawable) {
                ((RippleDrawable) background).setColor(ColorStateList.valueOf(i7));
            } else {
                int i10 = this.b;
                view.setBackground(org.telegram.ui.ActionBar.k6.a0(i7, i10, i10));
            }
        }
    }

    @Override // org.telegram.ui.Components.z70
    public final boolean a() {
        return this.Q;
    }

    public float b(float f10, float f11) {
        return f10 * f11;
    }

    public final void c(int i7, boolean z9) {
        int i10;
        org.telegram.ui.Components.i6 i6Var = this.f;
        if (z9) {
            i6Var.a();
        }
        if (z9 && i7 != (i10 = this.U) && i7 > 0 && i10 > 0) {
            ValueAnimator valueAnimator = this.T;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.T = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.T = ofFloat;
            ofFloat.addUpdateListener(new b(this, 0));
            this.T.addListener(new c(this, 1));
            org.telegram.messenger.camera.q.i(2.0f, this.T);
            this.T.setDuration(200L);
            this.T.start();
        }
        this.U = i7;
        this.h = (i7 != 0 || this.V) ? 1.0f : 0.0f;
        i6Var.t(id.E(i7, ' '), z9, true);
        invalidate();
    }

    public final void d() {
        ShapeDrawable d02 = org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(this.b), this.D);
        if (this.y) {
            setBackground(d02);
            return;
        }
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(this.x ? org.telegram.ui.ActionBar.k6.lb : org.telegram.ui.ActionBar.k6.Ci);
        org.telegram.ui.ActionBar.f6 f6Var = this.a;
        setBackground(d02);
        org.telegram.ui.ActionBar.r6.k(this, d02, N, null, f6Var);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        return false;
    }

    public final void e() {
        this.x = true;
        setFilled(true);
        if (!this.y) {
            this.D = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.lb, this.a);
            d();
        }
        updateColors();
    }

    public final void f() {
        setRoundRadius(24);
    }

    public final void g(CharSequence charSequence, boolean z9) {
        boolean z10 = charSequence != null;
        org.telegram.ui.Components.i6 i6Var = this.e;
        if (z9) {
            i6Var.a();
        }
        setContentDescription(charSequence);
        invalidate();
        if (!this.M || z10) {
            i6Var.t(charSequence, z9, true);
        } else {
            ValueAnimator valueAnimator = this.L;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.L = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.K, 0.0f);
            this.L = ofFloat;
            ofFloat.addUpdateListener(new b(this, 3));
            this.L.addListener(new c(this, 0));
            this.L.setDuration(200L);
            this.L.setInterpolator(xq.f);
            this.L.start();
        }
        if (this.M || !z10) {
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
        this.L.setInterpolator(xq.f);
        this.L.start();
    }

    public TextPaint getTextPaint() {
        return this.d.a;
    }

    public final void h(CharSequence charSequence, boolean z9) {
        i(charSequence, false, true);
    }

    public final void i(CharSequence charSequence, boolean z9, boolean z10) {
        org.telegram.ui.Components.i6 i6Var = this.d;
        if (z9) {
            i6Var.a();
        }
        i6Var.t(charSequence, z9, z10);
        setContentDescription(charSequence);
        invalidate();
    }

    @Override // android.view.View
    public final boolean isEnabled() {
        return this.c0;
    }

    public boolean j() {
        return !(this instanceof pd);
    }

    public final void k() {
        this.W = true;
        Drawable mutate = getContext().getDrawable(R.drawable.mini_boost_button).mutate();
        this.a0 = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(this.D, PorterDuff.Mode.SRC_IN));
    }

    public final void l() {
        this.g0 = true;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int wrapWidth;
        boolean z9;
        float f10;
        this.r.draw(canvas);
        if (this.O) {
            if (this.Q) {
                if (this.N == null) {
                    a80 a80Var = new a80(this.a);
                    this.N = a80Var;
                    a80Var.setCallback(this);
                    a80 a80Var2 = this.N;
                    a80Var2.t = 2.0f;
                    a80Var2.D = true;
                    a80Var2.x.setStrokeWidth(0.0f);
                    this.N.f(org.telegram.ui.ActionBar.k6.r1(0.02f, -1), org.telegram.ui.ActionBar.k6.r1(0.375f, -1));
                }
                a80 a80Var3 = this.N;
                a80Var3.c = -1L;
                a80Var3.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                this.N.k(this.b);
                this.N.draw(canvas);
            } else {
                a80 a80Var4 = this.N;
                if (a80Var4 != null) {
                    a80Var4.a();
                    this.N.draw(canvas);
                    if (this.N.c()) {
                        this.N.b = -1L;
                    }
                }
            }
        }
        float f11 = this.P;
        org.telegram.ui.Components.i6 i6Var = this.d;
        if (f11 > 0.0f) {
            if (this.e0 == null) {
                this.e0 = new cp(i6Var.a.getColor());
            }
            int L = (int) ((1.0f - this.P) * org.telegram.messenger.g0.L(24.0f));
            this.e0.setBounds(0, L, getWidth(), getHeight() + L);
            this.e0.setAlpha((int) (this.P * 255.0f));
            this.e0.draw(canvas);
            invalidate();
        }
        float f12 = this.P;
        if (f12 < 1.0f) {
            if (f12 != 0.0f) {
                canvas.save();
                canvas.translate(0.0f, (int) (this.P * org.telegram.messenger.g0.L(-24.0f)));
                canvas.scale(1.0f, 1.0f - (this.P * 0.4f));
                z9 = true;
            } else {
                z9 = false;
            }
            float c10 = i6Var.c();
            float e10 = this.n.e(false, this.h);
            float L2 = this.W ? org.telegram.messenger.g0.L(12.0f) : 0.0f;
            float L3 = org.telegram.messenger.g0.L(15.66f);
            org.telegram.ui.Components.i6 i6Var2 = this.f;
            float b10 = b(i6Var2.c() + L3, e10) + c10 + L2;
            Rect rect = org.telegram.messenger.g0.Q;
            rect.set((int) (((getMeasuredWidth() - b10) - getWidth()) / 2.0f), (int) (((getMeasuredHeight() - i6Var.e) / 2.0f) - org.telegram.messenger.g0.L(1.0f)), (int) org.telegram.messenger.k5.a(getMeasuredWidth() - b10, getWidth(), 2.0f, c10), (int) (((getMeasuredHeight() + i6Var.e) / 2.0f) - org.telegram.messenger.g0.L(1.0f)));
            rect.offset(0, (int) ((-org.telegram.messenger.g0.L(7.0f)) * this.K));
            i6Var.B = (int) (org.telegram.messenger.g0.T1(0.5f, 1.0f, this.b0) * (1.0f - this.P) * this.f0);
            i6Var.setBounds(rect);
            i6Var.draw(canvas);
            if (this.M) {
                org.telegram.ui.Components.i6 i6Var3 = this.e;
                b10 = i6Var3.c();
                rect.set((int) (((getMeasuredWidth() - b10) - getWidth()) / 2.0f), (int) (((getMeasuredHeight() - i6Var3.e) / 2.0f) - org.telegram.messenger.g0.L(1.0f)), (int) org.telegram.messenger.k5.a(getMeasuredWidth() - b10, getWidth(), 2.0f, b10), (int) (((getMeasuredHeight() + i6Var3.e) / 2.0f) - org.telegram.messenger.g0.L(1.0f)));
                rect.offset(0, org.telegram.messenger.g0.L(11.0f));
                canvas.save();
                float T1 = org.telegram.messenger.g0.T1(0.1f, 1.0f, this.K);
                canvas.scale(T1, T1, rect.centerX(), rect.bottom);
                i6Var3.B = (int) (org.telegram.messenger.g0.T1(0.5f, 1.0f, this.b0) * (1.0f - this.P) * 200.0f * this.K);
                i6Var3.setBounds(rect);
                i6Var3.draw(canvas);
                canvas.restore();
            }
            rect.set((int) (com.google.android.recaptcha.internal.a.A(getMeasuredWidth(), b10, 2.0f, c10) + org.telegram.messenger.g0.L(this.H ? 5.0f : 2.0f)), (int) ((getMeasuredHeight() - org.telegram.messenger.g0.L(18.0f)) / 2.0f), (int) (Math.max(org.telegram.messenger.g0.L(9.0f), i6Var2.c() + L2) + com.google.android.recaptcha.internal.a.A(getMeasuredWidth(), b10, 2.0f, c10) + org.telegram.messenger.g0.L((this.H ? 5 : 2) + 8)), (int) ((org.telegram.messenger.g0.L(18.0f) + getMeasuredHeight()) / 2.0f));
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(rect);
            if (this.S != 1.0f) {
                canvas.save();
                float f13 = this.S;
                canvas.scale(f13, f13, rect.centerX(), rect.centerY());
            }
            if (this.H) {
                f10 = 0.5f;
                int T12 = (int) (org.telegram.messenger.g0.T1(0.5f, 1.0f, this.b0) * (1.0f - this.P) * this.f0 * e10 * e10);
                Paint paint = this.c;
                paint.setAlpha(T12);
                float L4 = org.telegram.messenger.g0.L(this.W ? 4.0f : 10.0f);
                canvas.drawRoundRect(rectF, L4, L4, paint);
            } else {
                f10 = 0.5f;
            }
            CharSequence charSequence = i6Var2.i;
            rect.offset(-org.telegram.messenger.g0.L((charSequence != null ? charSequence.length() : 0) > 1 ? 0.3f : 0.0f), -org.telegram.messenger.g0.L(0.4f));
            float A = org.telegram.messenger.k5.A(1.0f, this.P, this.f0, e10);
            if (this.H) {
                f10 = 1.0f;
            }
            i6Var2.B = (int) (A * f10);
            i6Var2.setBounds(rect);
            canvas.save();
            if (this.H && this.W) {
                this.a0.setAlpha((int) ((1.0f - this.P) * this.f0 * e10 * 1.0f));
                this.a0.setBounds(org.telegram.messenger.g0.L(1.0f) + rect.left, org.telegram.messenger.g0.L(2.0f) + rect.top, this.a0.getIntrinsicWidth() + org.telegram.messenger.g0.L(1.0f) + rect.left, this.a0.getIntrinsicHeight() + org.telegram.messenger.g0.L(2.0f) + rect.top);
                this.a0.draw(canvas);
                canvas.translate(L2 / 2.0f, 0.0f);
            }
            i6Var2.draw(canvas);
            canvas.restore();
            if (this.S != 1.0f) {
                canvas.restore();
            }
            if (z9) {
                canvas.restore();
            }
        }
        if (!this.w || this.j0 == (wrapWidth = getWrapWidth())) {
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
    public void onMeasure(int i7, int i10) {
        if (!this.w) {
            if (!this.i0) {
                super.onMeasure(i7, i10);
                return;
            } else {
                super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) Math.min(Math.max(this.d.c() + getPaddingLeft() + getPaddingRight(), this.h0), View.MeasureSpec.getSize(i7)), TLObject.FLAG_30), i10);
                return;
            }
        }
        int wrapWidth = getWrapWidth();
        this.j0 = wrapWidth;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(wrapWidth, View.MeasureSpec.getSize(i7)), TLObject.FLAG_30), i10);
        View view = this.r;
        if (view != null) {
            view.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), TLObject.FLAG_30));
        }
    }

    public void setColor(int i7) {
        if (this.s) {
            this.y = true;
            int L = org.telegram.messenger.g0.L(this.b);
            this.D = i7;
            setBackground(org.telegram.ui.ActionBar.k6.d0(L, i7));
            return;
        }
        this.E = true;
        this.d.u(i7);
        int r12 = org.telegram.ui.ActionBar.k6.r1(0.1f, i7);
        int i10 = this.b;
        this.r.setBackground(org.telegram.ui.ActionBar.k6.a0(r12, i10, i10));
    }

    public void setCountFilled(boolean z9) {
        this.H = z9;
        float L = org.telegram.messenger.g0.L(z9 ? 12.0f : 14.0f);
        org.telegram.ui.Components.i6 i6Var = this.f;
        i6Var.w(L);
        i6Var.u(this.H ? this.D : this.d.a.getColor());
    }

    public void setCounterColor(int i7) {
        this.f.u(i7);
        this.a0.setColorFilter(new PorterDuffColorFilter(i7, PorterDuff.Mode.SRC_IN));
    }

    @Override // android.view.View
    public void setEnabled(boolean z9) {
        if (this.c0 != z9) {
            ValueAnimator valueAnimator = this.d0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.d0 = null;
            }
            float f10 = this.b0;
            this.c0 = z9;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, z9 ? 1.0f : 0.0f);
            this.d0 = ofFloat;
            ofFloat.addUpdateListener(new b(this, 1));
            this.d0.start();
        }
        super.setEnabled(z9);
    }

    public void setFilled(boolean z9) {
        if (this.s == z9) {
            return;
        }
        this.s = z9;
        org.telegram.ui.Components.i6 i6Var = this.d;
        if (z9) {
            d();
            i6Var.x(org.telegram.messenger.g0.o());
        } else {
            setBackground(null);
            i6Var.x(null);
        }
        updateColors();
    }

    public void setFlickeringLoading(boolean z9) {
        this.O = z9;
    }

    public void setGlobalAlpha(float f10) {
        this.f0 = (int) (f10 * 255.0f);
    }

    @Override // org.telegram.ui.Components.z70
    public void setLoading(boolean z9) {
        if (this.Q != z9) {
            if (this.O) {
                this.Q = z9;
                invalidate();
                return;
            }
            ValueAnimator valueAnimator = this.R;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.R = null;
            }
            float f10 = this.P;
            this.Q = z9;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, z9 ? 1.0f : 0.0f);
            this.R = ofFloat;
            ofFloat.addUpdateListener(new b(this, 2));
            this.R.addListener(new ch.y(6, this, z9));
            this.R.setDuration(320L);
            this.R.setInterpolator(xq.h);
            this.R.start();
        }
    }

    public void setMinWidth(int i7) {
        this.i0 = true;
        this.h0 = i7;
    }

    public void setRoundRadius(int i7) {
        this.b = i7;
        if (this.s) {
            d();
        } else {
            setBackground(null);
        }
        this.r.setBackground(null);
        updateColors();
    }

    public void setShowZero(boolean z9) {
        this.V = z9;
    }

    public void setText(CharSequence charSequence) {
        i(charSequence, false, true);
    }

    public void setTextAlpha(float f10) {
        this.d.B = (int) (f10 * 255.0f);
    }

    public void setTextColor(int i7) {
        this.F = -1;
        this.E = true;
        org.telegram.ui.Components.i6 i6Var = this.d;
        i6Var.u(i7);
        if (this.s) {
            return;
        }
        setRippleColor(org.telegram.ui.ActionBar.k6.r1(0.1f, i6Var.a.getColor()));
    }

    public void setTextColorKey(int i7) {
        this.F = i7;
        this.E = false;
        updateColors();
    }

    public void setUseWrapContent(boolean z9) {
        this.w = z9;
    }

    @Override // org.telegram.ui.ActionBar.a6
    public void updateColors() {
        if (!this.y) {
            this.D = org.telegram.ui.ActionBar.k6.w0(this.x ? org.telegram.ui.ActionBar.k6.lb : org.telegram.ui.ActionBar.k6.Ci, this.a);
        }
        boolean z9 = this.E;
        org.telegram.ui.Components.i6 i6Var = this.d;
        if (!z9) {
            int i7 = this.F;
            if (i7 < 0) {
                i7 = this.s ? this.x ? org.telegram.ui.ActionBar.k6.mb : org.telegram.ui.ActionBar.k6.Gi : org.telegram.ui.ActionBar.k6.Ci;
            }
            i6Var.u(org.telegram.ui.ActionBar.k6.w0(i7, this.a));
        }
        if (this.s) {
            setRippleColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.i6, this.a));
        } else if (!this.E) {
            setRippleColor(org.telegram.ui.ActionBar.k6.r1(0.1f, i6Var.a.getColor()));
        }
        if (!this.E) {
            this.e.u(org.telegram.ui.ActionBar.k6.w0(this.s ? this.x ? org.telegram.ui.ActionBar.k6.mb : org.telegram.ui.ActionBar.k6.Gi : org.telegram.ui.ActionBar.k6.Ci, this.a));
        }
        this.f.u(this.D);
        this.c.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Gi, this.a));
        invalidate();
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return this.N == drawable || this.d == drawable || this.e == drawable || this.f == drawable || super.verifyDrawable(drawable);
    }

    public d(Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z9) {
        super(context);
        this.b = 8;
        xq xqVar = xq.h;
        this.n = new org.telegram.ui.Components.w5(350L, xqVar);
        this.F = -1;
        this.H = true;
        this.I = 0;
        this.K = 0.0f;
        this.P = 0.0f;
        this.S = 1.0f;
        this.b0 = 1.0f;
        this.c0 = true;
        this.f0 = qs.e4;
        this.s = z9;
        this.a = f6Var;
        c8.ka.b(this, 0.02f, 1.2f);
        View view = new View(context);
        this.r = view;
        addView(view, c8.ha.c(-1.0f, -1));
        if (z9) {
            int L = org.telegram.messenger.g0.L(8.0f);
            int i7 = org.telegram.ui.ActionBar.k6.Ci;
            int w02 = org.telegram.ui.ActionBar.k6.w0(i7, f6Var);
            this.D = w02;
            ShapeDrawable d02 = org.telegram.ui.ActionBar.k6.d0(L, w02);
            org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i7);
            setBackground(d02);
            org.telegram.ui.ActionBar.r6.k(this, d02, N, null, f6Var);
        }
        Paint paint = new Paint(1);
        this.c = paint;
        paint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Gi, f6Var));
        org.telegram.ui.Components.i6 i6Var = new org.telegram.ui.Components.i6(true, true, false, false, true);
        this.d = i6Var;
        i6Var.n(0.3f, 250L, xqVar);
        i6Var.setCallback(this);
        i6Var.w(org.telegram.messenger.g0.L(14.0f));
        if (z9) {
            i6Var.x(org.telegram.messenger.g0.o());
        }
        i6Var.b = 1;
        org.telegram.ui.Components.i6 i6Var2 = new org.telegram.ui.Components.i6(j(), true, false);
        this.e = i6Var2;
        i6Var2.n(0.3f, 250L, xqVar);
        i6Var2.setCallback(this);
        i6Var2.w(org.telegram.messenger.g0.L(12.0f));
        i6Var2.b = 1;
        org.telegram.ui.Components.i6 i6Var3 = new org.telegram.ui.Components.i6(false, false, true);
        this.f = i6Var3;
        i6Var3.n(0.3f, 250L, xqVar);
        i6Var3.setCallback(this);
        i6Var3.w(org.telegram.messenger.g0.L(12.0f));
        i6Var3.x(org.telegram.messenger.g0.o());
        i6Var3.t("", true, true);
        i6Var3.b = 1;
        setWillNotDraw(false);
        updateColors();
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
