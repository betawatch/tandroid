package hi;

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
import org.telegram.messenger.hd;
import org.telegram.messenger.ls;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.p80;
import org.telegram.ui.Components.q80;
import org.telegram.ui.Components.up;
import org.telegram.ui.nd;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
public class e extends FrameLayout implements p80, org.telegram.ui.ActionBar.b6 {
    public int E;
    public boolean F;
    public int G;
    public int H;
    public boolean I;
    public int J;
    public c K;
    public float L;
    public ValueAnimator M;
    public boolean N;
    public q80 O;
    public boolean P;
    public float Q;
    public boolean R;
    public ValueAnimator S;
    public boolean T;
    public float U;
    public ValueAnimator V;
    public int W;
    public org.telegram.ui.ActionBar.h6 a;
    public boolean a0;
    public int b;
    public boolean b0;
    public final Paint c;
    public Drawable c0;
    public final org.telegram.ui.Components.n6 d;
    public float d0;
    public final org.telegram.ui.Components.n6 e;
    public boolean e0;
    public final org.telegram.ui.Components.n6 f;
    public ValueAnimator f0;
    public up g0;
    public float h;
    public int h0;
    public boolean i0;
    public int j0;
    public boolean k0;
    public int l0;
    public final org.telegram.ui.Components.d6 n;
    public final View r;
    public boolean s;
    public boolean w;
    public boolean x;
    public boolean y;

    public e(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        this(context, h6Var, true);
    }

    private int getWrapWidth() {
        return getPaddingRight() + getPaddingLeft() + ((int) (b(this.f.c() + org.telegram.messenger.g0.L(15.66f), this.n.e(false, this.h)) + this.d.c() + (this.b0 ? org.telegram.messenger.g0.L(12.0f) : 0.0f)));
    }

    private void setRippleColor(int i7) {
        View view = this.r;
        Drawable background = view.getBackground();
        if (background == null || this.H != i7) {
            this.H = i7;
            if (background instanceof RippleDrawable) {
                ((RippleDrawable) background).setColor(ColorStateList.valueOf(i7));
            } else {
                int i10 = this.b;
                view.setBackground(org.telegram.ui.ActionBar.m6.a0(i7, i10, i10));
            }
        }
    }

    @Override // org.telegram.ui.Components.p80
    public final boolean a() {
        return this.R;
    }

    public float b(float f10, float f11) {
        return f10 * f11;
    }

    public final void c(int i7, boolean z10) {
        int i10;
        org.telegram.ui.Components.n6 n6Var = this.f;
        if (z10) {
            n6Var.a();
        }
        int i11 = 1;
        if (z10 && i7 != (i10 = this.W) && i7 > 0 && i10 > 0) {
            ValueAnimator valueAnimator = this.V;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.V = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.V = ofFloat;
            ofFloat.addUpdateListener(new b(this, 0));
            this.V.addListener(new d(this, i11));
            org.telegram.ui.Cells.c0.q(2.0f, this.V);
            this.V.setDuration(200L);
            this.V.start();
        }
        this.W = i7;
        this.h = (i7 != 0 || this.a0) ? 1.0f : 0.0f;
        n6Var.t(hd.E(i7, ' '), z10, true);
        invalidate();
    }

    public final void d() {
        ShapeDrawable d02 = org.telegram.ui.ActionBar.m6.d0(org.telegram.messenger.g0.L(this.b), this.E);
        if (this.y) {
            setBackground(d02);
            return;
        }
        org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(this.x ? org.telegram.ui.ActionBar.m6.ob : org.telegram.ui.ActionBar.m6.Fi);
        org.telegram.ui.ActionBar.h6 h6Var = this.a;
        setBackground(d02);
        org.telegram.ui.ActionBar.t6.j(this, d02, M, null, h6Var);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        return false;
    }

    public final void e() {
        this.x = true;
        setFilled(true);
        if (!this.y) {
            this.E = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.ob, this.a);
            d();
        }
        updateColors();
    }

    public final void f() {
        setRoundRadius(24);
    }

    public final void g(CharSequence charSequence, boolean z10) {
        int i7 = 0;
        boolean z11 = charSequence != null;
        org.telegram.ui.Components.n6 n6Var = this.e;
        if (z10) {
            n6Var.a();
        }
        setContentDescription(charSequence);
        invalidate();
        if (!this.N || z11) {
            n6Var.t(charSequence, z10, true);
        } else {
            ValueAnimator valueAnimator = this.M;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.M = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.L, 0.0f);
            this.M = ofFloat;
            ofFloat.addUpdateListener(new b(this, 3));
            this.M.addListener(new d(this, i7));
            this.M.setDuration(200L);
            this.M.setInterpolator(nr.f);
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
        this.M.setInterpolator(nr.f);
        this.M.start();
    }

    public TextPaint getTextPaint() {
        return this.d.a;
    }

    public final void h(CharSequence charSequence, boolean z10) {
        i(charSequence, false, true);
    }

    public final void i(CharSequence charSequence, boolean z10, boolean z11) {
        org.telegram.ui.Components.n6 n6Var = this.d;
        if (z10) {
            n6Var.a();
        }
        n6Var.t(charSequence, z10, z11);
        setContentDescription(charSequence);
        invalidate();
    }

    @Override // android.view.View
    public final boolean isEnabled() {
        return this.e0;
    }

    public boolean j() {
        return !(this instanceof nd);
    }

    public final void k() {
        this.b0 = true;
        Drawable mutate = getContext().getDrawable(R.drawable.mini_boost_button).mutate();
        this.c0 = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(this.E, PorterDuff.Mode.SRC_IN));
    }

    public final void l() {
        this.i0 = true;
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
                    q80 q80Var = new q80(this.a);
                    this.O = q80Var;
                    q80Var.setCallback(this);
                    q80 q80Var2 = this.O;
                    q80Var2.t = 2.0f;
                    q80Var2.D = true;
                    q80Var2.x.setStrokeWidth(0.0f);
                    this.O.f(org.telegram.ui.ActionBar.m6.r1(0.02f, -1), org.telegram.ui.ActionBar.m6.r1(0.375f, -1));
                }
                q80 q80Var3 = this.O;
                q80Var3.c = -1L;
                q80Var3.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                this.O.k(this.b);
                this.O.draw(canvas);
            } else {
                q80 q80Var4 = this.O;
                if (q80Var4 != null) {
                    q80Var4.a();
                    this.O.draw(canvas);
                    if (this.O.c()) {
                        this.O.b = -1L;
                    }
                }
            }
        }
        float f11 = this.Q;
        org.telegram.ui.Components.n6 n6Var = this.d;
        if (f11 > 0.0f) {
            if (this.g0 == null) {
                this.g0 = new up(n6Var.a.getColor());
            }
            if (this.T) {
                this.g0.setBounds(0, 0, getWidth(), getHeight());
                this.g0.setAlpha((int) (this.Q * 255.0f));
                float T1 = org.telegram.messenger.g0.T1(0.6f, 1.0f, this.Q);
                canvas.save();
                canvas.scale(T1, T1, getWidth() / 2.0f, getHeight() / 2.0f);
                this.g0.draw(canvas);
                canvas.restore();
            } else {
                int L = (int) ((1.0f - this.Q) * org.telegram.messenger.g0.L(24.0f));
                this.g0.setBounds(0, L, getWidth(), getHeight() + L);
                this.g0.setAlpha((int) (this.Q * 255.0f));
                this.g0.draw(canvas);
            }
            invalidate();
        }
        float f12 = this.Q;
        if (f12 < 1.0f) {
            if (f12 != 0.0f) {
                canvas.save();
                if (this.T) {
                    float f13 = 1.0f - (this.Q * 0.2f);
                    canvas.scale(f13, f13, getWidth() / 2.0f, getHeight() / 2.0f);
                } else {
                    canvas.translate(0.0f, (int) (this.Q * org.telegram.messenger.g0.L(-24.0f)));
                    canvas.scale(1.0f, 1.0f - (this.Q * 0.4f));
                }
                z10 = true;
            } else {
                z10 = false;
            }
            float c10 = n6Var.c();
            float e10 = this.n.e(false, this.h);
            float L2 = this.b0 ? org.telegram.messenger.g0.L(12.0f) : 0.0f;
            float L3 = org.telegram.messenger.g0.L(15.66f);
            org.telegram.ui.Components.n6 n6Var2 = this.f;
            float b10 = b(n6Var2.c() + L3, e10) + c10 + L2;
            Rect rect = org.telegram.messenger.g0.Q;
            rect.set((int) (((getMeasuredWidth() - b10) - getWidth()) / 2.0f), (int) (((getMeasuredHeight() - n6Var.e) / 2.0f) - org.telegram.messenger.g0.L(1.0f)), (int) org.telegram.messenger.f3.a(getMeasuredWidth() - b10, getWidth(), 2.0f, c10), (int) (((getMeasuredHeight() + n6Var.e) / 2.0f) - org.telegram.messenger.g0.L(1.0f)));
            rect.offset(0, (int) ((-org.telegram.messenger.g0.L(7.0f)) * this.L));
            n6Var.C = (int) (org.telegram.messenger.g0.T1(0.5f, 1.0f, this.d0) * (1.0f - this.Q) * this.h0);
            n6Var.setBounds(rect);
            n6Var.draw(canvas);
            if (this.N) {
                org.telegram.ui.Components.n6 n6Var3 = this.e;
                b10 = n6Var3.c();
                rect.set((int) (((getMeasuredWidth() - b10) - getWidth()) / 2.0f), (int) (((getMeasuredHeight() - n6Var3.e) / 2.0f) - org.telegram.messenger.g0.L(1.0f)), (int) org.telegram.messenger.f3.a(getMeasuredWidth() - b10, getWidth(), 2.0f, b10), (int) (((getMeasuredHeight() + n6Var3.e) / 2.0f) - org.telegram.messenger.g0.L(1.0f)));
                rect.offset(0, org.telegram.messenger.g0.L(11.0f));
                canvas.save();
                float T12 = org.telegram.messenger.g0.T1(0.1f, 1.0f, this.L);
                canvas.scale(T12, T12, rect.centerX(), rect.bottom);
                n6Var3.C = (int) (org.telegram.messenger.g0.T1(0.5f, 1.0f, this.d0) * (1.0f - this.Q) * 200.0f * this.L);
                n6Var3.setBounds(rect);
                n6Var3.draw(canvas);
                canvas.restore();
            }
            rect.set((int) (com.google.android.gms.internal.vision.e2.A(getMeasuredWidth(), b10, 2.0f, c10) + org.telegram.messenger.g0.L(this.I ? 5.0f : 2.0f)), (int) ((getMeasuredHeight() - org.telegram.messenger.g0.L(18.0f)) / 2.0f), (int) (Math.max(org.telegram.messenger.g0.L(9.0f), n6Var2.c() + L2) + com.google.android.gms.internal.vision.e2.A(getMeasuredWidth(), b10, 2.0f, c10) + org.telegram.messenger.g0.L((this.I ? 5 : 2) + 8)), (int) ((org.telegram.messenger.g0.L(18.0f) + getMeasuredHeight()) / 2.0f));
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(rect);
            if (this.U != 1.0f) {
                canvas.save();
                float f14 = this.U;
                canvas.scale(f14, f14, rect.centerX(), rect.centerY());
            }
            if (this.I) {
                f10 = 0.5f;
                int T13 = (int) (org.telegram.messenger.g0.T1(0.5f, 1.0f, this.d0) * (1.0f - this.Q) * this.h0 * e10 * e10);
                Paint paint = this.c;
                paint.setAlpha(T13);
                float L4 = org.telegram.messenger.g0.L(this.b0 ? 4.0f : 10.0f);
                canvas.drawRoundRect(rectF, L4, L4, paint);
            } else {
                f10 = 0.5f;
            }
            CharSequence charSequence = n6Var2.i;
            rect.offset(-org.telegram.messenger.g0.L((charSequence != null ? charSequence.length() : 0) > 1 ? 0.3f : 0.0f), -org.telegram.messenger.g0.L(0.4f));
            float A = org.telegram.messenger.f3.A(1.0f, this.Q, this.h0, e10);
            if (this.I) {
                f10 = 1.0f;
            }
            n6Var2.C = (int) (A * f10);
            n6Var2.setBounds(rect);
            canvas.save();
            if (this.I && this.b0) {
                this.c0.setAlpha((int) ((1.0f - this.Q) * this.h0 * e10 * 1.0f));
                this.c0.setBounds(org.telegram.messenger.g0.L(1.0f) + rect.left, org.telegram.messenger.g0.L(2.0f) + rect.top, this.c0.getIntrinsicWidth() + org.telegram.messenger.g0.L(1.0f) + rect.left, this.c0.getIntrinsicHeight() + org.telegram.messenger.g0.L(2.0f) + rect.top);
                this.c0.draw(canvas);
                canvas.translate(L2 / 2.0f, 0.0f);
            }
            n6Var2.draw(canvas);
            canvas.restore();
            if (this.U != 1.0f) {
                canvas.restore();
            }
            if (z10) {
                canvas.restore();
            }
        }
        if (!this.w || this.l0 == (wrapWidth = getWrapWidth())) {
            return;
        }
        this.l0 = wrapWidth;
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
            if (!this.k0) {
                super.onMeasure(i7, i10);
                return;
            } else {
                super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) Math.min(Math.max(this.d.c() + getPaddingLeft() + getPaddingRight(), this.j0), View.MeasureSpec.getSize(i7)), TLObject.FLAG_30), i10);
                return;
            }
        }
        int wrapWidth = getWrapWidth();
        this.l0 = wrapWidth;
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
            this.E = i7;
            setBackground(org.telegram.ui.ActionBar.m6.d0(L, i7));
            return;
        }
        this.F = true;
        this.d.u(i7);
        int r12 = org.telegram.ui.ActionBar.m6.r1(0.1f, i7);
        int i10 = this.b;
        this.r.setBackground(org.telegram.ui.ActionBar.m6.a0(r12, i10, i10));
    }

    public void setCountFilled(boolean z10) {
        this.I = z10;
        float L = org.telegram.messenger.g0.L(z10 ? 12.0f : 14.0f);
        org.telegram.ui.Components.n6 n6Var = this.f;
        n6Var.w(L);
        n6Var.u(this.I ? this.E : this.d.a.getColor());
    }

    public void setCounterColor(int i7) {
        this.f.u(i7);
        this.c0.setColorFilter(new PorterDuffColorFilter(i7, PorterDuff.Mode.SRC_IN));
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        if (this.e0 != z10) {
            ValueAnimator valueAnimator = this.f0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f0 = null;
            }
            float f10 = this.d0;
            this.e0 = z10;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, z10 ? 1.0f : 0.0f);
            this.f0 = ofFloat;
            ofFloat.addUpdateListener(new b(this, 1));
            this.f0.start();
        }
        super.setEnabled(z10);
    }

    public void setFilled(boolean z10) {
        if (this.s == z10) {
            return;
        }
        this.s = z10;
        org.telegram.ui.Components.n6 n6Var = this.d;
        if (z10) {
            d();
            n6Var.x(org.telegram.messenger.g0.o());
        } else {
            setBackground(null);
            n6Var.x(null);
        }
        updateColors();
    }

    public void setFlickeringLoading(boolean z10) {
        this.P = z10;
    }

    public void setGlobalAlpha(float f10) {
        this.h0 = (int) (f10 * 255.0f);
    }

    @Override // org.telegram.ui.Components.p80
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
            this.S.addListener(new bi.g7(7, this, z10));
            this.S.setDuration(this.T ? 240L : 320L);
            this.S.setInterpolator(nr.h);
            this.S.start();
        }
    }

    public void setMinWidth(int i7) {
        this.k0 = true;
        this.j0 = i7;
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

    public void setScaleLoading(boolean z10) {
        this.T = z10;
    }

    public void setShowZero(boolean z10) {
        this.a0 = z10;
    }

    public void setText(CharSequence charSequence) {
        i(charSequence, false, true);
    }

    public void setTextAlpha(float f10) {
        this.d.C = (int) (f10 * 255.0f);
    }

    public void setTextColor(int i7) {
        this.G = -1;
        this.F = true;
        org.telegram.ui.Components.n6 n6Var = this.d;
        n6Var.u(i7);
        if (this.s) {
            return;
        }
        setRippleColor(org.telegram.ui.ActionBar.m6.r1(0.1f, n6Var.a.getColor()));
    }

    public void setTextColorKey(int i7) {
        this.G = i7;
        this.F = false;
        updateColors();
    }

    public void setUseWrapContent(boolean z10) {
        this.w = z10;
    }

    @Override // org.telegram.ui.ActionBar.b6
    public void updateColors() {
        if (!this.y) {
            this.E = org.telegram.ui.ActionBar.m6.w0(this.x ? org.telegram.ui.ActionBar.m6.ob : org.telegram.ui.ActionBar.m6.Fi, this.a);
        }
        boolean z10 = this.F;
        org.telegram.ui.Components.n6 n6Var = this.d;
        if (!z10) {
            int i7 = this.G;
            if (i7 < 0) {
                i7 = this.s ? this.x ? org.telegram.ui.ActionBar.m6.pb : org.telegram.ui.ActionBar.m6.Ji : org.telegram.ui.ActionBar.m6.Fi;
            }
            n6Var.u(org.telegram.ui.ActionBar.m6.w0(i7, this.a));
        }
        if (this.s) {
            setRippleColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.i6, this.a));
        } else if (!this.F) {
            setRippleColor(org.telegram.ui.ActionBar.m6.r1(0.1f, n6Var.a.getColor()));
        }
        if (!this.F) {
            this.e.u(org.telegram.ui.ActionBar.m6.w0(this.s ? this.x ? org.telegram.ui.ActionBar.m6.pb : org.telegram.ui.ActionBar.m6.Ji : org.telegram.ui.ActionBar.m6.Fi, this.a));
        }
        this.f.u(this.E);
        this.c.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Ji, this.a));
        invalidate();
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return this.O == drawable || this.d == drawable || this.e == drawable || this.f == drawable || super.verifyDrawable(drawable);
    }

    public e(Context context, org.telegram.ui.ActionBar.h6 h6Var, boolean z10) {
        super(context);
        this.b = 8;
        nr nrVar = nr.h;
        this.n = new org.telegram.ui.Components.d6(350L, nrVar);
        this.G = -1;
        this.I = true;
        this.J = 0;
        this.L = 0.0f;
        this.Q = 0.0f;
        this.U = 1.0f;
        this.d0 = 1.0f;
        this.e0 = true;
        this.h0 = ls.e4;
        this.s = z10;
        this.a = h6Var;
        c8.ra.b(this, 0.02f, 1.2f);
        View view = new View(context);
        this.r = view;
        addView(view, c8.ma.c(-1.0f, -1));
        if (z10) {
            int L = org.telegram.messenger.g0.L(8.0f);
            int i7 = org.telegram.ui.ActionBar.m6.Fi;
            int w02 = org.telegram.ui.ActionBar.m6.w0(i7, h6Var);
            this.E = w02;
            ShapeDrawable d02 = org.telegram.ui.ActionBar.m6.d0(L, w02);
            org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i7);
            setBackground(d02);
            org.telegram.ui.ActionBar.t6.j(this, d02, M, null, h6Var);
        }
        Paint paint = new Paint(1);
        this.c = paint;
        paint.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Ji, h6Var));
        org.telegram.ui.Components.n6 n6Var = new org.telegram.ui.Components.n6(true, true, false, false, true);
        this.d = n6Var;
        n6Var.n(0.3f, 250L, nrVar);
        n6Var.setCallback(this);
        n6Var.w(org.telegram.messenger.g0.L(14.0f));
        if (z10) {
            n6Var.x(org.telegram.messenger.g0.o());
        }
        n6Var.b = 1;
        org.telegram.ui.Components.n6 n6Var2 = new org.telegram.ui.Components.n6(j(), true, false);
        this.e = n6Var2;
        n6Var2.n(0.3f, 250L, nrVar);
        n6Var2.setCallback(this);
        n6Var2.w(org.telegram.messenger.g0.L(12.0f));
        n6Var2.b = 1;
        org.telegram.ui.Components.n6 n6Var3 = new org.telegram.ui.Components.n6(false, false, true);
        this.f = n6Var3;
        n6Var3.n(0.3f, 250L, nrVar);
        n6Var3.setCallback(this);
        n6Var3.w(org.telegram.messenger.g0.L(12.0f));
        n6Var3.x(org.telegram.messenger.g0.o());
        n6Var3.t("", true, true);
        n6Var3.b = 1;
        setWillNotDraw(false);
        updateColors();
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
