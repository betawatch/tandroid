// default package

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
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public class c51 extends FrameLayout implements ka6, snb {
    public int E;
    public boolean F;
    public int G;
    public int H;
    public boolean I;
    public int J;
    public z21 K;
    public float L;
    public ValueAnimator M;
    public boolean N;
    public va6 O;
    public boolean P;
    public float Q;
    public boolean R;
    public ValueAnimator S;
    public boolean T;
    public float U;
    public ValueAnimator V;
    public int W;
    public vnb a;
    public boolean a0;
    public int b;
    public boolean b0;
    public final Paint c;
    public Drawable c0;
    public final hn d;
    public float d0;
    public final hn e;
    public boolean e0;
    public final hn f;
    public ValueAnimator f0;
    public di2 g0;
    public float h;
    public int h0;
    public boolean i0;
    public int j0;
    public boolean k0;
    public int l0;
    public final mm n;
    public final View r;
    public boolean s;
    public boolean w;
    public boolean x;
    public boolean y;

    public c51(vnb vnbVar, Context context, boolean z) {
        super(context);
        this.b = 8;
        k43 k43Var = k43.h;
        this.n = new mm(350L, k43Var);
        this.G = -1;
        this.I = true;
        this.J = 0;
        this.L = 0.0f;
        this.Q = 0.0f;
        this.U = 1.0f;
        this.d0 = 1.0f;
        this.e0 = true;
        this.h0 = jn7.d4;
        this.s = z;
        this.a = vnbVar;
        iye.b(this, 0.02f, 1.2f);
        View view = new View(context);
        this.r = view;
        addView(view, tre.c(-1.0f, -1));
        if (z) {
            int L = hl.L(8.0f);
            int i = aob.Fi;
            int v0 = aob.v0(i, vnbVar);
            this.E = v0;
            ShapeDrawable b0 = aob.b0(L, v0);
            uob M = yob.M(i);
            setBackground(b0);
            yob.j(this, b0, M, null, vnbVar);
        }
        Paint paint = new Paint(1);
        this.c = paint;
        paint.setColor(aob.v0(aob.Ji, vnbVar));
        hn hnVar = new hn(true, true, false, false, true);
        this.d = hnVar;
        hnVar.n(0.3f, 250L, k43Var);
        hnVar.setCallback(this);
        hnVar.w(hl.L(14.0f));
        if (z) {
            hnVar.x(hl.o());
        }
        hnVar.b = 1;
        hn hnVar2 = new hn(j(), true, false);
        this.e = hnVar2;
        hnVar2.n(0.3f, 250L, k43Var);
        hnVar2.setCallback(this);
        hnVar2.w(hl.L(12.0f));
        hnVar2.b = 1;
        hn hnVar3 = new hn(false, false, true);
        this.f = hnVar3;
        hnVar3.n(0.3f, 250L, k43Var);
        hnVar3.setCallback(this);
        hnVar3.w(hl.L(12.0f));
        hnVar3.x(hl.o());
        hnVar3.t("", true, true);
        hnVar3.b = 1;
        setWillNotDraw(false);
        updateColors();
    }

    private int getWrapWidth() {
        return getPaddingRight() + getPaddingLeft() + ((int) (b(this.f.c() + hl.L(15.66f), this.n.e(false, this.h)) + this.d.c() + (this.b0 ? hl.L(12.0f) : 0.0f)));
    }

    private void setRippleColor(int i) {
        View view = this.r;
        Drawable background = view.getBackground();
        if (background == null || this.H != i) {
            this.H = i;
            if (background instanceof RippleDrawable) {
                ((RippleDrawable) background).setColor(ColorStateList.valueOf(i));
            } else {
                int i2 = this.b;
                view.setBackground(aob.Y(i, i2, i2));
            }
        }
    }

    @Override // ka6
    public final boolean a() {
        return this.R;
    }

    public float b(float f, float f2) {
        return f * f2;
    }

    public final void c(int i, boolean z) {
        hn hnVar = this.f;
        if (z) {
            hnVar.a();
            int i2 = this.W;
            if (i != i2 && i > 0 && i2 > 0) {
                ValueAnimator valueAnimator = this.V;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.V = null;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.V = ofFloat;
                ofFloat.addUpdateListener(new a51(this, (byte) 0));
                this.V.addListener(new b51(this, (byte) 1));
                c00.o(2.0f, this.V);
                this.V.setDuration(200L);
                this.V.start();
            }
        }
        this.W = i;
        this.h = (i != 0 || this.a0) ? 1.0f : 0.0f;
        hnVar.t(ob6.E(i, ' '), z, true);
        invalidate();
    }

    public final void d() {
        ShapeDrawable b0 = aob.b0(hl.L(this.b), this.E);
        if (this.y) {
            setBackground(b0);
            return;
        }
        uob M = yob.M(this.x ? aob.ob : aob.Fi);
        vnb vnbVar = this.a;
        setBackground(b0);
        yob.j(this, b0, M, null, vnbVar);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        return false;
    }

    public final void e() {
        this.x = true;
        setFilled(true);
        if (!this.y) {
            this.E = aob.v0(aob.ob, this.a);
            d();
        }
        updateColors();
    }

    public final void f() {
        setRoundRadius(24);
    }

    public final void g(CharSequence charSequence, boolean z) {
        boolean z2 = charSequence != null;
        hn hnVar = this.e;
        if (z) {
            hnVar.a();
        }
        setContentDescription(charSequence);
        invalidate();
        if (!this.N || z2) {
            hnVar.t(charSequence, z, true);
        } else {
            ValueAnimator valueAnimator = this.M;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.M = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.L, 0.0f);
            this.M = ofFloat;
            ofFloat.addUpdateListener(new a51(this, (byte) 3));
            this.M.addListener(new b51(this, (byte) 0));
            this.M.setDuration(200L);
            this.M.setInterpolator(k43.f);
            this.M.start();
        }
        if (this.N || !z2) {
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
        ofFloat2.addUpdateListener(new a51(this, (byte) 4));
        this.M.setDuration(200L);
        this.M.setInterpolator(k43.f);
        this.M.start();
    }

    public TextPaint getTextPaint() {
        return this.d.a;
    }

    public final void h(CharSequence charSequence, boolean z) {
        i(charSequence, false, true);
    }

    public final void i(CharSequence charSequence, boolean z, boolean z2) {
        hn hnVar = this.d;
        if (z) {
            hnVar.a();
        }
        hnVar.t(charSequence, z, z2);
        setContentDescription(charSequence);
        invalidate();
    }

    @Override // android.view.View
    public final boolean isEnabled() {
        return this.e0;
    }

    public boolean j() {
        return !(this instanceof xi1);
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
        boolean z;
        float f;
        this.r.draw(canvas);
        if (this.P) {
            boolean z2 = this.R;
            va6 va6Var = this.O;
            if (z2) {
                if (va6Var == null) {
                    va6 va6Var2 = new va6(this.a);
                    this.O = va6Var2;
                    va6Var2.setCallback(this);
                    va6 va6Var3 = this.O;
                    va6Var3.t = 2.0f;
                    va6Var3.D = true;
                    va6Var3.x.setStrokeWidth(0.0f);
                    this.O.f(aob.p1(0.02f, -1), aob.p1(0.375f, -1));
                }
                va6 va6Var4 = this.O;
                va6Var4.c = -1L;
                va6Var4.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                this.O.j(this.b);
                this.O.draw(canvas);
            } else if (va6Var != null) {
                va6Var.a();
                this.O.draw(canvas);
                if (this.O.c()) {
                    this.O.b = -1L;
                }
            }
        }
        float f2 = this.Q;
        hn hnVar = this.d;
        if (f2 > 0.0f) {
            di2 di2Var = this.g0;
            if (di2Var == null) {
                di2Var = new di2(hnVar.a.getColor());
                this.g0 = di2Var;
            }
            if (this.T) {
                di2Var.setBounds(0, 0, getWidth(), getHeight());
                this.g0.setAlpha((int) (this.Q * 255.0f));
                float R1 = hl.R1(0.6f, 1.0f, this.Q);
                canvas.save();
                canvas.scale(R1, R1, getWidth() / 2.0f, getHeight() / 2.0f);
                this.g0.draw(canvas);
                canvas.restore();
            } else {
                int L = (int) ((1.0f - this.Q) * hl.L(24.0f));
                this.g0.setBounds(0, L, getWidth(), getHeight() + L);
                this.g0.setAlpha((int) (this.Q * 255.0f));
                this.g0.draw(canvas);
            }
            invalidate();
        }
        float f3 = this.Q;
        if (f3 < 1.0f) {
            if (f3 != 0.0f) {
                canvas.save();
                boolean z3 = this.T;
                float f4 = this.Q;
                if (z3) {
                    float f5 = 1.0f - (f4 * 0.2f);
                    canvas.scale(f5, f5, getWidth() / 2.0f, getHeight() / 2.0f);
                } else {
                    canvas.translate(0.0f, (int) (f4 * hl.L(-24.0f)));
                    canvas.scale(1.0f, 1.0f - (this.Q * 0.4f));
                }
                z = true;
            } else {
                z = false;
            }
            float c = hnVar.c();
            float e = this.n.e(false, this.h);
            float L2 = this.b0 ? hl.L(12.0f) : 0.0f;
            float L3 = hl.L(15.66f);
            hn hnVar2 = this.f;
            float b = b(hnVar2.c() + L3, e) + c + L2;
            Rect rect = hl.Q;
            rect.set((int) (((getMeasuredWidth() - b) - getWidth()) / 2.0f), (int) (((getMeasuredHeight() - hnVar.e) / 2.0f) - hl.L(1.0f)), (int) qd4.e(getMeasuredWidth() - b, getWidth(), 2.0f, c), (int) (((getMeasuredHeight() + hnVar.e) / 2.0f) - hl.L(1.0f)));
            rect.offset(0, (int) ((-hl.L(7.0f)) * this.L));
            hnVar.C = (int) (hl.R1(0.5f, 1.0f, this.d0) * (1.0f - this.Q) * this.h0);
            hnVar.setBounds(rect);
            hnVar.draw(canvas);
            if (this.N) {
                hn hnVar3 = this.e;
                b = hnVar3.c();
                rect.set((int) (((getMeasuredWidth() - b) - getWidth()) / 2.0f), (int) (((getMeasuredHeight() - hnVar3.e) / 2.0f) - hl.L(1.0f)), (int) qd4.e(getMeasuredWidth() - b, getWidth(), 2.0f, b), (int) (((getMeasuredHeight() + hnVar3.e) / 2.0f) - hl.L(1.0f)));
                rect.offset(0, hl.L(11.0f));
                canvas.save();
                float R12 = hl.R1(0.1f, 1.0f, this.L);
                canvas.scale(R12, R12, rect.centerX(), rect.bottom);
                hnVar3.C = (int) (hl.R1(0.5f, 1.0f, this.d0) * (1.0f - this.Q) * 200.0f * this.L);
                hnVar3.setBounds(rect);
                hnVar3.draw(canvas);
                canvas.restore();
            }
            rect.set((int) (bp1.z(getMeasuredWidth(), b, 2.0f, c) + hl.L(this.I ? 5.0f : 2.0f)), (int) ((getMeasuredHeight() - hl.L(18.0f)) / 2.0f), (int) (Math.max(hl.L(9.0f), hnVar2.c() + L2) + bp1.z(getMeasuredWidth(), b, 2.0f, c) + hl.L((this.I ? 5 : 2) + 8)), (int) ((hl.L(18.0f) + getMeasuredHeight()) / 2.0f));
            RectF rectF = hl.P;
            rectF.set(rect);
            if (this.U != 1.0f) {
                canvas.save();
                float f6 = this.U;
                canvas.scale(f6, f6, rect.centerX(), rect.centerY());
            }
            if (this.I) {
                f = 0.5f;
                int R13 = (int) (hl.R1(0.5f, 1.0f, this.d0) * (1.0f - this.Q) * this.h0 * e * e);
                Paint paint = this.c;
                paint.setAlpha(R13);
                float L4 = hl.L(this.b0 ? 4.0f : 10.0f);
                canvas.drawRoundRect(rectF, L4, L4, paint);
            } else {
                f = 0.5f;
            }
            CharSequence charSequence = hnVar2.i;
            rect.offset(-hl.L((charSequence != null ? charSequence.length() : 0) > 1 ? 0.3f : 0.0f), -hl.L(0.4f));
            float z4 = qd4.z(1.0f, this.Q, this.h0, e);
            if (this.I) {
                f = 1.0f;
            }
            hnVar2.C = (int) (z4 * f);
            hnVar2.setBounds(rect);
            canvas.save();
            if (this.I && this.b0) {
                this.c0.setAlpha((int) ((1.0f - this.Q) * this.h0 * e * 1.0f));
                this.c0.setBounds(hl.L(1.0f) + rect.left, hl.L(2.0f) + rect.top, this.c0.getIntrinsicWidth() + hl.L(1.0f) + rect.left, this.c0.getIntrinsicHeight() + hl.L(2.0f) + rect.top);
                this.c0.draw(canvas);
                canvas.translate(L2 / 2.0f, 0.0f);
            }
            hnVar2.draw(canvas);
            canvas.restore();
            if (this.U != 1.0f) {
                canvas.restore();
            }
            if (z) {
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
    public void onMeasure(int i, int i2) {
        if (!this.w) {
            if (!this.k0) {
                super.onMeasure(i, i2);
                return;
            } else {
                super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) Math.min(Math.max(this.d.c() + getPaddingLeft() + getPaddingRight(), this.j0), View.MeasureSpec.getSize(i)), TLObject.FLAG_30), i2);
                return;
            }
        }
        int wrapWidth = getWrapWidth();
        this.l0 = wrapWidth;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(wrapWidth, View.MeasureSpec.getSize(i)), TLObject.FLAG_30), i2);
        View view = this.r;
        if (view != null) {
            view.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), TLObject.FLAG_30));
        }
    }

    public void setColor(int i) {
        if (this.s) {
            this.y = true;
            int L = hl.L(this.b);
            this.E = i;
            setBackground(aob.b0(L, i));
            return;
        }
        this.F = true;
        this.d.u(i);
        int p1 = aob.p1(0.1f, i);
        int i2 = this.b;
        this.r.setBackground(aob.Y(p1, i2, i2));
    }

    public void setCountFilled(boolean z) {
        this.I = z;
        float L = hl.L(z ? 12.0f : 14.0f);
        hn hnVar = this.f;
        hnVar.w(L);
        hnVar.u(this.I ? this.E : this.d.a.getColor());
    }

    public void setCounterColor(int i) {
        this.f.u(i);
        this.c0.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        if (this.e0 != z) {
            ValueAnimator valueAnimator = this.f0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f0 = null;
            }
            float f = this.d0;
            this.e0 = z;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f, z ? 1.0f : 0.0f);
            this.f0 = ofFloat;
            ofFloat.addUpdateListener(new a51(this, (byte) 1));
            this.f0.start();
        }
        super.setEnabled(z);
    }

    public void setFilled(boolean z) {
        if (this.s == z) {
            return;
        }
        this.s = z;
        hn hnVar = this.d;
        if (z) {
            d();
            hnVar.x(hl.o());
        } else {
            setBackground(null);
            hnVar.x(null);
        }
        updateColors();
    }

    public void setFlickeringLoading(boolean z) {
        this.P = z;
    }

    public void setGlobalAlpha(float f) {
        this.h0 = (int) (f * 255.0f);
    }

    @Override // ka6
    public void setLoading(boolean z) {
        if (this.R != z) {
            if (this.P) {
                this.R = z;
                invalidate();
                return;
            }
            ValueAnimator valueAnimator = this.S;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.S = null;
            }
            float f = this.Q;
            this.R = z;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f, z ? 1.0f : 0.0f);
            this.S = ofFloat;
            ofFloat.addUpdateListener(new a51(this, (byte) 2));
            this.S.addListener(new z7((byte) 10, (Object) this, z));
            this.S.setDuration(this.T ? 240L : 320L);
            this.S.setInterpolator(k43.h);
            this.S.start();
        }
    }

    public void setMinWidth(int i) {
        this.k0 = true;
        this.j0 = i;
    }

    public void setRoundRadius(int i) {
        this.b = i;
        if (this.s) {
            d();
        } else {
            setBackground(null);
        }
        this.r.setBackground(null);
        updateColors();
    }

    public void setScaleLoading(boolean z) {
        this.T = z;
    }

    public void setShowZero(boolean z) {
        this.a0 = z;
    }

    public void setText(CharSequence charSequence) {
        i(charSequence, false, true);
    }

    public void setTextAlpha(float f) {
        this.d.C = (int) (f * 255.0f);
    }

    public void setTextColor(int i) {
        this.G = -1;
        this.F = true;
        hn hnVar = this.d;
        hnVar.u(i);
        if (this.s) {
            return;
        }
        setRippleColor(aob.p1(0.1f, hnVar.a.getColor()));
    }

    public void setTextColorKey(int i) {
        this.G = i;
        this.F = false;
        updateColors();
    }

    public void setUseWrapContent(boolean z) {
        this.w = z;
    }

    @Override // snb
    public void updateColors() {
        if (!this.y) {
            this.E = aob.v0(this.x ? aob.ob : aob.Fi, this.a);
        }
        boolean z = this.F;
        hn hnVar = this.d;
        if (!z) {
            int i = this.G;
            if (i < 0) {
                i = this.s ? this.x ? aob.pb : aob.Ji : aob.Fi;
            }
            hnVar.u(aob.v0(i, this.a));
        }
        if (this.s) {
            setRippleColor(aob.v0(aob.i6, this.a));
        } else if (!this.F) {
            setRippleColor(aob.p1(0.1f, hnVar.a.getColor()));
        }
        if (!this.F) {
            this.e.u(aob.v0(this.s ? this.x ? aob.pb : aob.Ji : aob.Fi, this.a));
        }
        this.f.u(this.E);
        this.c.setColor(aob.v0(aob.Ji, this.a));
        invalidate();
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return this.O == drawable || this.d == drawable || this.e == drawable || this.f == drawable || super.verifyDrawable(drawable);
    }

    @Override // snb
    public final void addColorKeys(HashSet hashSet) {
    }

    public c51(Context context, vnb vnbVar) {
        this(vnbVar, context, true);
    }
}
