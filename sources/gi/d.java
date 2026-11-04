package gi;

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
import b8.mf;
import b8.pf;
import java.util.HashSet;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hs;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.cp;
import org.telegram.ui.Components.v70;
import org.telegram.ui.Components.w70;
import org.telegram.ui.Components.xq;
import org.telegram.ui.nd;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public class d extends FrameLayout implements v70, org.telegram.ui.ActionBar.z5 {
    public int E;
    public boolean F;
    public int G;
    public int H;
    public boolean I;
    public int J;
    public g2.c K;
    public float L;
    public ValueAnimator M;
    public boolean N;
    public w70 O;
    public boolean P;
    public float Q;
    public boolean R;
    public ValueAnimator S;
    public float T;
    public ValueAnimator U;
    public int V;
    public boolean W;
    public org.telegram.ui.ActionBar.e6 a;
    public boolean a0;
    public int b;
    public Drawable b0;
    public final Paint c;
    public float c0;
    public final org.telegram.ui.Components.g6 d;
    public boolean d0;
    public final org.telegram.ui.Components.g6 e;
    public ValueAnimator e0;
    public final org.telegram.ui.Components.g6 f;
    public cp f0;
    public int g0;
    public float h;
    public boolean h0;
    public int i0;
    public boolean j0;
    public int k0;
    public final org.telegram.ui.Components.u5 n;
    public final View r;
    public boolean s;
    public boolean w;
    public boolean x;
    public boolean y;

    public d(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        this(context, e6Var, true);
    }

    private int getWrapWidth() {
        return getPaddingRight() + getPaddingLeft() + ((int) (b(this.f.c() + org.telegram.messenger.g0.L(15.66f), this.n.e(false, this.h)) + this.d.c() + (this.a0 ? org.telegram.messenger.g0.L(12.0f) : 0.0f)));
    }

    private void setRippleColor(int i3) {
        View view = this.r;
        Drawable background = view.getBackground();
        if (background == null || this.H != i3) {
            this.H = i3;
            if (background instanceof RippleDrawable) {
                ((RippleDrawable) background).setColor(ColorStateList.valueOf(i3));
            } else {
                int i10 = this.b;
                view.setBackground(org.telegram.ui.ActionBar.k6.a0(i3, i10, i10));
            }
        }
    }

    @Override // org.telegram.ui.Components.v70
    public final boolean a() {
        return this.R;
    }

    public float b(float f10, float f11) {
        return f10 * f11;
    }

    public final void c(int i3, boolean z10) {
        int i10;
        org.telegram.ui.Components.g6 g6Var = this.f;
        if (z10) {
            g6Var.a();
        }
        if (z10 && i3 != (i10 = this.V) && i3 > 0 && i10 > 0) {
            ValueAnimator valueAnimator = this.U;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.U = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.U = ofFloat;
            ofFloat.addUpdateListener(new b(this, 0));
            this.U.addListener(new c(this, 1));
            org.telegram.messenger.camera.q.i(2.0f, this.U);
            this.U.setDuration(200L);
            this.U.start();
        }
        this.V = i3;
        this.h = (i3 != 0 || this.W) ? 1.0f : 0.0f;
        g6Var.t(bd.E(i3, ' '), z10, true);
        invalidate();
    }

    public final void d() {
        ShapeDrawable d02 = org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(this.b), this.E);
        if (this.y) {
            setBackground(d02);
            return;
        }
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(this.x ? org.telegram.ui.ActionBar.k6.lb : org.telegram.ui.ActionBar.k6.Ci);
        org.telegram.ui.ActionBar.e6 e6Var = this.a;
        setBackground(d02);
        org.telegram.ui.ActionBar.r6.k(this, d02, N, null, e6Var);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        return false;
    }

    public final void e() {
        this.x = true;
        setFilled(true);
        if (!this.y) {
            this.E = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.lb, this.a);
            d();
        }
        updateColors();
    }

    public final void f() {
        setRoundRadius(24);
    }

    public final void g(CharSequence charSequence, boolean z10) {
        boolean z11 = charSequence != null;
        org.telegram.ui.Components.g6 g6Var = this.e;
        if (z10) {
            g6Var.a();
        }
        setContentDescription(charSequence);
        invalidate();
        if (!this.N || z11) {
            g6Var.t(charSequence, z10, true);
        } else {
            ValueAnimator valueAnimator = this.M;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.M = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.L, 0.0f);
            this.M = ofFloat;
            ofFloat.addUpdateListener(new b(this, 3));
            this.M.addListener(new c(this, 0));
            this.M.setDuration(200L);
            this.M.setInterpolator(xq.f);
            this.M.start();
        }
        if (this.N || !z11) {
            return;
        }
        this.N = true;
        ValueAnimator valueAnimator2 = this.M;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
            this.M = null;
        }
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.L, 1.0f);
        this.M = ofFloat2;
        ofFloat2.addUpdateListener(new b(this, 4));
        this.M.setDuration(200L);
        this.M.setInterpolator(xq.f);
        this.M.start();
    }

    public TextPaint getTextPaint() {
        return this.d.a;
    }

    public final void h(CharSequence charSequence, boolean z10) {
        i(charSequence, false, true);
    }

    public final void i(CharSequence charSequence, boolean z10, boolean z11) {
        org.telegram.ui.Components.g6 g6Var = this.d;
        if (z10) {
            g6Var.a();
        }
        g6Var.t(charSequence, z10, z11);
        setContentDescription(charSequence);
        invalidate();
    }

    @Override // android.view.View
    public final boolean isEnabled() {
        return this.d0;
    }

    public boolean j() {
        return !(this instanceof nd);
    }

    public final void k() {
        this.a0 = true;
        Drawable mutate = getContext().getDrawable(R.drawable.mini_boost_button).mutate();
        this.b0 = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(this.E, PorterDuff.Mode.SRC_IN));
    }

    public final void l() {
        this.h0 = true;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int wrapWidth;
        boolean z10;
        float f10;
        this.r.draw(canvas);
        if (this.P) {
            if (this.R) {
                if (this.O == null) {
                    w70 w70Var = new w70(this.a);
                    this.O = w70Var;
                    w70Var.setCallback(this);
                    w70 w70Var2 = this.O;
                    w70Var2.t = 2.0f;
                    w70Var2.D = true;
                    w70Var2.x.setStrokeWidth(0.0f);
                    this.O.f(org.telegram.ui.ActionBar.k6.r1(0.02f, -1), org.telegram.ui.ActionBar.k6.r1(0.375f, -1));
                }
                w70 w70Var3 = this.O;
                w70Var3.c = -1L;
                w70Var3.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                this.O.k(this.b);
                this.O.draw(canvas);
            } else {
                w70 w70Var4 = this.O;
                if (w70Var4 != null) {
                    w70Var4.a();
                    this.O.draw(canvas);
                    if (this.O.c()) {
                        this.O.b = -1L;
                    }
                }
            }
        }
        float f11 = this.Q;
        org.telegram.ui.Components.g6 g6Var = this.d;
        if (f11 > 0.0f) {
            if (this.f0 == null) {
                this.f0 = new cp(g6Var.a.getColor());
            }
            int L = (int) ((1.0f - this.Q) * org.telegram.messenger.g0.L(24.0f));
            this.f0.setBounds(0, L, getWidth(), getHeight() + L);
            this.f0.setAlpha((int) (this.Q * 255.0f));
            this.f0.draw(canvas);
            invalidate();
        }
        float f12 = this.Q;
        if (f12 < 1.0f) {
            if (f12 != 0.0f) {
                canvas.save();
                canvas.translate(0.0f, (int) (this.Q * org.telegram.messenger.g0.L(-24.0f)));
                canvas.scale(1.0f, 1.0f - (this.Q * 0.4f));
                z10 = true;
            } else {
                z10 = false;
            }
            float c2 = g6Var.c();
            float e10 = this.n.e(false, this.h);
            float L2 = this.a0 ? org.telegram.messenger.g0.L(12.0f) : 0.0f;
            float L3 = org.telegram.messenger.g0.L(15.66f);
            org.telegram.ui.Components.g6 g6Var2 = this.f;
            float b10 = b(g6Var2.c() + L3, e10) + c2 + L2;
            Rect rect = org.telegram.messenger.g0.Q;
            rect.set((int) (((getMeasuredWidth() - b10) - getWidth()) / 2.0f), (int) (((getMeasuredHeight() - g6Var.e) / 2.0f) - org.telegram.messenger.g0.L(1.0f)), (int) org.telegram.messenger.k5.a(getMeasuredWidth() - b10, getWidth(), 2.0f, c2), (int) (((getMeasuredHeight() + g6Var.e) / 2.0f) - org.telegram.messenger.g0.L(1.0f)));
            rect.offset(0, (int) ((-org.telegram.messenger.g0.L(7.0f)) * this.L));
            g6Var.B = (int) (org.telegram.messenger.g0.T1(0.5f, 1.0f, this.c0) * (1.0f - this.Q) * this.g0);
            g6Var.setBounds(rect);
            g6Var.draw(canvas);
            if (this.N) {
                org.telegram.ui.Components.g6 g6Var3 = this.e;
                b10 = g6Var3.c();
                rect.set((int) (((getMeasuredWidth() - b10) - getWidth()) / 2.0f), (int) (((getMeasuredHeight() - g6Var3.e) / 2.0f) - org.telegram.messenger.g0.L(1.0f)), (int) org.telegram.messenger.k5.a(getMeasuredWidth() - b10, getWidth(), 2.0f, b10), (int) (((getMeasuredHeight() + g6Var3.e) / 2.0f) - org.telegram.messenger.g0.L(1.0f)));
                rect.offset(0, org.telegram.messenger.g0.L(11.0f));
                canvas.save();
                float T1 = org.telegram.messenger.g0.T1(0.1f, 1.0f, this.L);
                canvas.scale(T1, T1, rect.centerX(), rect.bottom);
                g6Var3.B = (int) (org.telegram.messenger.g0.T1(0.5f, 1.0f, this.c0) * (1.0f - this.Q) * 200.0f * this.L);
                g6Var3.setBounds(rect);
                g6Var3.draw(canvas);
                canvas.restore();
            }
            rect.set((int) (com.google.android.recaptcha.internal.a.z(getMeasuredWidth(), b10, 2.0f, c2) + org.telegram.messenger.g0.L(this.I ? 5.0f : 2.0f)), (int) ((getMeasuredHeight() - org.telegram.messenger.g0.L(18.0f)) / 2.0f), (int) (Math.max(org.telegram.messenger.g0.L(9.0f), g6Var2.c() + L2) + com.google.android.recaptcha.internal.a.z(getMeasuredWidth(), b10, 2.0f, c2) + org.telegram.messenger.g0.L((this.I ? 5 : 2) + 8)), (int) ((org.telegram.messenger.g0.L(18.0f) + getMeasuredHeight()) / 2.0f));
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(rect);
            if (this.T != 1.0f) {
                canvas.save();
                float f13 = this.T;
                canvas.scale(f13, f13, rect.centerX(), rect.centerY());
            }
            if (this.I) {
                f10 = 0.5f;
                int T12 = (int) (org.telegram.messenger.g0.T1(0.5f, 1.0f, this.c0) * (1.0f - this.Q) * this.g0 * e10 * e10);
                Paint paint = this.c;
                paint.setAlpha(T12);
                float L4 = org.telegram.messenger.g0.L(this.a0 ? 4.0f : 10.0f);
                canvas.drawRoundRect(rectF, L4, L4, paint);
            } else {
                f10 = 0.5f;
            }
            CharSequence charSequence = g6Var2.i;
            rect.offset(-org.telegram.messenger.g0.L((charSequence != null ? charSequence.length() : 0) > 1 ? 0.3f : 0.0f), -org.telegram.messenger.g0.L(0.4f));
            float A = org.telegram.messenger.k5.A(1.0f, this.Q, this.g0, e10);
            if (this.I) {
                f10 = 1.0f;
            }
            g6Var2.B = (int) (A * f10);
            g6Var2.setBounds(rect);
            canvas.save();
            if (this.I && this.a0) {
                this.b0.setAlpha((int) ((1.0f - this.Q) * this.g0 * e10 * 1.0f));
                this.b0.setBounds(org.telegram.messenger.g0.L(1.0f) + rect.left, org.telegram.messenger.g0.L(2.0f) + rect.top, this.b0.getIntrinsicWidth() + org.telegram.messenger.g0.L(1.0f) + rect.left, this.b0.getIntrinsicHeight() + org.telegram.messenger.g0.L(2.0f) + rect.top);
                this.b0.draw(canvas);
                canvas.translate(L2 / 2.0f, 0.0f);
            }
            g6Var2.draw(canvas);
            canvas.restore();
            if (this.T != 1.0f) {
                canvas.restore();
            }
            if (z10) {
                canvas.restore();
            }
        }
        if (!this.w || this.k0 == (wrapWidth = getWrapWidth())) {
            return;
        }
        this.k0 = wrapWidth;
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
    public void onMeasure(int i3, int i10) {
        if (!this.w) {
            if (!this.j0) {
                super.onMeasure(i3, i10);
                return;
            } else {
                super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) Math.min(Math.max(this.d.c() + getPaddingLeft() + getPaddingRight(), this.i0), View.MeasureSpec.getSize(i3)), TLObject.FLAG_30), i10);
                return;
            }
        }
        int wrapWidth = getWrapWidth();
        this.k0 = wrapWidth;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(wrapWidth, View.MeasureSpec.getSize(i3)), TLObject.FLAG_30), i10);
        View view = this.r;
        if (view != null) {
            view.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), TLObject.FLAG_30));
        }
    }

    public void setColor(int i3) {
        if (this.s) {
            this.y = true;
            int L = org.telegram.messenger.g0.L(this.b);
            this.E = i3;
            setBackground(org.telegram.ui.ActionBar.k6.d0(L, i3));
            return;
        }
        this.F = true;
        this.d.u(i3);
        int r12 = org.telegram.ui.ActionBar.k6.r1(0.1f, i3);
        int i10 = this.b;
        this.r.setBackground(org.telegram.ui.ActionBar.k6.a0(r12, i10, i10));
    }

    public void setCountFilled(boolean z10) {
        this.I = z10;
        float L = org.telegram.messenger.g0.L(z10 ? 12.0f : 14.0f);
        org.telegram.ui.Components.g6 g6Var = this.f;
        g6Var.w(L);
        g6Var.u(this.I ? this.E : this.d.a.getColor());
    }

    public void setCounterColor(int i3) {
        this.f.u(i3);
        this.b0.setColorFilter(new PorterDuffColorFilter(i3, PorterDuff.Mode.SRC_IN));
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        if (this.d0 != z10) {
            ValueAnimator valueAnimator = this.e0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.e0 = null;
            }
            float f10 = this.c0;
            this.d0 = z10;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, z10 ? 1.0f : 0.0f);
            this.e0 = ofFloat;
            ofFloat.addUpdateListener(new b(this, 1));
            this.e0.start();
        }
        super.setEnabled(z10);
    }

    public void setFilled(boolean z10) {
        if (this.s == z10) {
            return;
        }
        this.s = z10;
        org.telegram.ui.Components.g6 g6Var = this.d;
        if (z10) {
            d();
            g6Var.x(org.telegram.messenger.g0.o());
        } else {
            setBackground(null);
            g6Var.x(null);
        }
        updateColors();
    }

    public void setFlickeringLoading(boolean z10) {
        this.P = z10;
    }

    public void setGlobalAlpha(float f10) {
        this.g0 = (int) (f10 * 255.0f);
    }

    @Override // org.telegram.ui.Components.v70
    public void setLoading(boolean z10) {
        if (this.R != z10) {
            if (this.P) {
                this.R = z10;
                invalidate();
                return;
            }
            ValueAnimator valueAnimator = this.S;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.S = null;
            }
            float f10 = this.Q;
            this.R = z10;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, z10 ? 1.0f : 0.0f);
            this.S = ofFloat;
            ofFloat.addUpdateListener(new b(this, 2));
            this.S.addListener(new dh.x(7, this, z10));
            this.S.setDuration(320L);
            this.S.setInterpolator(xq.h);
            this.S.start();
        }
    }

    public void setMinWidth(int i3) {
        this.j0 = true;
        this.i0 = i3;
    }

    public void setRoundRadius(int i3) {
        this.b = i3;
        if (this.s) {
            d();
        } else {
            setBackground(null);
        }
        this.r.setBackground(null);
        updateColors();
    }

    public void setShowZero(boolean z10) {
        this.W = z10;
    }

    public void setText(CharSequence charSequence) {
        i(charSequence, false, true);
    }

    public void setTextAlpha(float f10) {
        this.d.B = (int) (f10 * 255.0f);
    }

    public void setTextColor(int i3) {
        this.G = -1;
        this.F = true;
        org.telegram.ui.Components.g6 g6Var = this.d;
        g6Var.u(i3);
        if (this.s) {
            return;
        }
        setRippleColor(org.telegram.ui.ActionBar.k6.r1(0.1f, g6Var.a.getColor()));
    }

    public void setTextColorKey(int i3) {
        this.G = i3;
        this.F = false;
        updateColors();
    }

    public void setUseWrapContent(boolean z10) {
        this.w = z10;
    }

    @Override // org.telegram.ui.ActionBar.z5
    public void updateColors() {
        if (!this.y) {
            this.E = org.telegram.ui.ActionBar.k6.w0(this.x ? org.telegram.ui.ActionBar.k6.lb : org.telegram.ui.ActionBar.k6.Ci, this.a);
        }
        boolean z10 = this.F;
        org.telegram.ui.Components.g6 g6Var = this.d;
        if (!z10) {
            int i3 = this.G;
            if (i3 < 0) {
                i3 = this.s ? this.x ? org.telegram.ui.ActionBar.k6.mb : org.telegram.ui.ActionBar.k6.Gi : org.telegram.ui.ActionBar.k6.Ci;
            }
            g6Var.u(org.telegram.ui.ActionBar.k6.w0(i3, this.a));
        }
        if (this.s) {
            setRippleColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.i6, this.a));
        } else if (!this.F) {
            setRippleColor(org.telegram.ui.ActionBar.k6.r1(0.1f, g6Var.a.getColor()));
        }
        if (!this.F) {
            this.e.u(org.telegram.ui.ActionBar.k6.w0(this.s ? this.x ? org.telegram.ui.ActionBar.k6.mb : org.telegram.ui.ActionBar.k6.Gi : org.telegram.ui.ActionBar.k6.Ci, this.a));
        }
        this.f.u(this.E);
        this.c.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Gi, this.a));
        invalidate();
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return this.O == drawable || this.d == drawable || this.e == drawable || this.f == drawable || super.verifyDrawable(drawable);
    }

    public d(Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        super(context);
        this.b = 8;
        xq xqVar = xq.h;
        this.n = new org.telegram.ui.Components.u5(350L, xqVar);
        this.G = -1;
        this.I = true;
        this.J = 0;
        this.L = 0.0f;
        this.Q = 0.0f;
        this.T = 1.0f;
        this.c0 = 1.0f;
        this.d0 = true;
        this.g0 = hs.e4;
        this.s = z10;
        this.a = e6Var;
        pf.b(this, 0.02f, 1.2f);
        View view = new View(context);
        this.r = view;
        addView(view, mf.c(-1.0f, -1));
        if (z10) {
            int L = org.telegram.messenger.g0.L(8.0f);
            int i3 = org.telegram.ui.ActionBar.k6.Ci;
            int w02 = org.telegram.ui.ActionBar.k6.w0(i3, e6Var);
            this.E = w02;
            ShapeDrawable d02 = org.telegram.ui.ActionBar.k6.d0(L, w02);
            org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i3);
            setBackground(d02);
            org.telegram.ui.ActionBar.r6.k(this, d02, N, null, e6Var);
        }
        Paint paint = new Paint(1);
        this.c = paint;
        paint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Gi, e6Var));
        org.telegram.ui.Components.g6 g6Var = new org.telegram.ui.Components.g6(true, true, false, false, true);
        this.d = g6Var;
        g6Var.n(0.3f, 250L, xqVar);
        g6Var.setCallback(this);
        g6Var.w(org.telegram.messenger.g0.L(14.0f));
        if (z10) {
            g6Var.x(org.telegram.messenger.g0.o());
        }
        g6Var.b = 1;
        org.telegram.ui.Components.g6 g6Var2 = new org.telegram.ui.Components.g6(j(), true, false);
        this.e = g6Var2;
        g6Var2.n(0.3f, 250L, xqVar);
        g6Var2.setCallback(this);
        g6Var2.w(org.telegram.messenger.g0.L(12.0f));
        g6Var2.b = 1;
        org.telegram.ui.Components.g6 g6Var3 = new org.telegram.ui.Components.g6(false, false, true);
        this.f = g6Var3;
        g6Var3.n(0.3f, 250L, xqVar);
        g6Var3.setCallback(this);
        g6Var3.w(org.telegram.messenger.g0.L(12.0f));
        g6Var3.x(org.telegram.messenger.g0.o());
        g6Var3.t("", true, true);
        g6Var3.b = 1;
        setWillNotDraw(false);
        updateColors();
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
