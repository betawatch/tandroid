package di;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.g90;
import org.telegram.ui.Components.h90;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.sp;
import org.telegram.ui.be;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes4.dex */
public class d extends FrameLayout implements g90 {
    public boolean E;
    public int F;
    public bi.s8 G;
    public float H;
    public ValueAnimator I;
    public boolean J;
    public h90 K;
    public boolean L;
    public float M;
    public boolean N;
    public ValueAnimator O;
    public float P;
    public ValueAnimator Q;
    public int R;
    public boolean S;
    public boolean T;
    public Drawable U;
    public float V;
    public boolean W;
    public org.telegram.ui.ActionBar.f6 a;
    public ValueAnimator a0;
    public int b;
    public sp b0;
    public final Paint c;
    public int c0;
    public final org.telegram.ui.Components.p6 d;
    public boolean d0;
    public final org.telegram.ui.Components.p6 e;
    public int e0;
    public final org.telegram.ui.Components.p6 f;
    public boolean f0;
    public int g0;
    public float h;
    public final org.telegram.ui.Components.e6 n;
    public final View r;
    public boolean s;
    public boolean v;
    public boolean w;
    public boolean x;
    public int y;

    public d(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        this(context, f6Var, true);
    }

    private int getWrapWidth() {
        return getPaddingRight() + getPaddingLeft() + ((int) (a(this.f.d() + AndroidUtilities.dp(15.66f), this.n.d(this.h, false)) + this.d.d() + (this.T ? AndroidUtilities.dp(12.0f) : 0.0f)));
    }

    public float a(float f7, float f10) {
        return f7 * f10;
    }

    public final void b(int i10, boolean z10) {
        int i11;
        org.telegram.ui.Components.p6 p6Var = this.f;
        if (z10) {
            p6Var.b();
        }
        int i12 = 1;
        if (z10 && i10 != (i11 = this.R) && i10 > 0 && i11 > 0) {
            ValueAnimator valueAnimator = this.Q;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.Q = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.Q = ofFloat;
            ofFloat.addUpdateListener(new b(this, 0));
            this.Q.addListener(new c(this, i12));
            this.Q.setInterpolator(new OvershootInterpolator(2.0f));
            this.Q.setDuration(200L);
            this.Q.start();
        }
        this.R = i10;
        this.h = (i10 != 0 || this.S) ? 1.0f : 0.0f;
        p6Var.q(LocaleController.formatNumber(i10, ' '), z10, true);
        invalidate();
    }

    @Override // org.telegram.ui.Components.g90
    public final boolean c() {
        return this.N;
    }

    public final void d() {
        this.w = true;
        setFilled(true);
        setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.xa, this.a));
        j();
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        return false;
    }

    public final void e() {
        setRoundRadius(24);
    }

    public final void f(CharSequence charSequence, boolean z10) {
        int i10 = 0;
        boolean z11 = charSequence != null;
        org.telegram.ui.Components.p6 p6Var = this.e;
        if (z10) {
            p6Var.b();
        }
        setContentDescription(charSequence);
        invalidate();
        if (!this.J || z11) {
            p6Var.q(charSequence, z10, true);
        } else {
            ValueAnimator valueAnimator = this.I;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.I = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.H, 0.0f);
            this.I = ofFloat;
            ofFloat.addUpdateListener(new b(this, 3));
            this.I.addListener(new c(this, i10));
            this.I.setDuration(200L);
            this.I.setInterpolator(pr.f);
            this.I.start();
        }
        if (this.J || !z11) {
            return;
        }
        this.J = true;
        ValueAnimator valueAnimator2 = this.I;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
            this.I = null;
        }
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.H, 1.0f);
        this.I = ofFloat2;
        ofFloat2.addUpdateListener(new b(this, 4));
        this.I.setDuration(200L);
        this.I.setInterpolator(pr.f);
        this.I.start();
    }

    public final void g(CharSequence charSequence, boolean z10, boolean z11) {
        org.telegram.ui.Components.p6 p6Var = this.d;
        if (z10) {
            p6Var.b();
        }
        p6Var.q(charSequence, z10, z11);
        setContentDescription(charSequence);
        invalidate();
    }

    public TextPaint getTextPaint() {
        return this.d.a;
    }

    public final void h(CharSequence charSequence) {
        g(charSequence, false, true);
    }

    public boolean i() {
        return !(this instanceof be);
    }

    @Override // android.view.View
    public final boolean isEnabled() {
        return this.W;
    }

    public final void j() {
        if (!this.x) {
            this.y = org.telegram.ui.ActionBar.j6.v0(this.w ? org.telegram.ui.ActionBar.j6.xa : org.telegram.ui.ActionBar.j6.Oh, this.a);
        }
        int v02 = org.telegram.ui.ActionBar.j6.v0(this.s ? this.w ? org.telegram.ui.ActionBar.j6.ya : org.telegram.ui.ActionBar.j6.Sh : org.telegram.ui.ActionBar.j6.Oh, this.a);
        org.telegram.ui.Components.p6 p6Var = this.d;
        p6Var.r(v02);
        boolean z10 = this.s;
        View view = this.r;
        if (z10) {
            int v03 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.i6, this.a);
            int i10 = this.b;
            view.setBackground(org.telegram.ui.ActionBar.j6.Y(v03, i10, i10));
        } else {
            int l1 = org.telegram.ui.ActionBar.j6.l1(0.1f, p6Var.a.getColor());
            int i11 = this.b;
            view.setBackground(org.telegram.ui.ActionBar.j6.Y(l1, i11, i11));
        }
        this.e.r(org.telegram.ui.ActionBar.j6.v0(this.s ? this.w ? org.telegram.ui.ActionBar.j6.ya : org.telegram.ui.ActionBar.j6.Sh : org.telegram.ui.ActionBar.j6.Oh, this.a));
        this.f.r(this.y);
        this.c.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Sh, this.a));
    }

    public final void k() {
        this.T = true;
        Drawable mutate = getContext().getDrawable(R.drawable.mini_boost_button).mutate();
        this.U = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(this.y, PorterDuff.Mode.SRC_IN));
    }

    public final void l() {
        this.d0 = true;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int wrapWidth;
        boolean z10;
        float f7;
        this.r.draw(canvas);
        if (this.L) {
            if (this.N) {
                if (this.K == null) {
                    h90 h90Var = new h90(this.a);
                    this.K = h90Var;
                    h90Var.setCallback(this);
                    h90 h90Var2 = this.K;
                    h90Var2.t = 2.0f;
                    h90Var2.C = true;
                    h90Var2.w.setStrokeWidth(0.0f);
                    this.K.e(org.telegram.ui.ActionBar.j6.l1(0.02f, -1), org.telegram.ui.ActionBar.j6.l1(0.375f, -1));
                }
                h90 h90Var3 = this.K;
                h90Var3.c = -1L;
                h90Var3.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                this.K.j(this.b);
                this.K.draw(canvas);
            } else {
                h90 h90Var4 = this.K;
                if (h90Var4 != null) {
                    h90Var4.a();
                    this.K.draw(canvas);
                    if (this.K.b()) {
                        this.K.b = -1L;
                    }
                }
            }
        }
        float f10 = this.M;
        org.telegram.ui.Components.p6 p6Var = this.d;
        if (f10 > 0.0f) {
            if (this.b0 == null) {
                this.b0 = new sp(p6Var.a.getColor());
            }
            int dp = (int) ((1.0f - this.M) * AndroidUtilities.dp(24.0f));
            this.b0.setBounds(0, dp, getWidth(), getHeight() + dp);
            this.b0.setAlpha((int) (this.M * 255.0f));
            this.b0.draw(canvas);
            invalidate();
        }
        float f11 = this.M;
        if (f11 < 1.0f) {
            if (f11 != 0.0f) {
                canvas.save();
                canvas.translate(0.0f, (int) (this.M * AndroidUtilities.dp(-24.0f)));
                canvas.scale(1.0f, 1.0f - (this.M * 0.4f));
                z10 = true;
            } else {
                z10 = false;
            }
            float d = p6Var.d();
            float d10 = this.n.d(this.h, false);
            float dp2 = this.T ? AndroidUtilities.dp(12.0f) : 0.0f;
            float dp3 = AndroidUtilities.dp(15.66f);
            org.telegram.ui.Components.p6 p6Var2 = this.f;
            float a2 = a(p6Var2.d() + dp3, d10) + d + dp2;
            Rect rect = AndroidUtilities.rectTmp2;
            rect.set((int) (((getMeasuredWidth() - a2) - getWidth()) / 2.0f), (int) (((getMeasuredHeight() - p6Var.e) / 2.0f) - AndroidUtilities.dp(1.0f)), (int) org.telegram.messenger.w1.a(getMeasuredWidth() - a2, getWidth(), 2.0f, d), (int) (((getMeasuredHeight() + p6Var.e) / 2.0f) - AndroidUtilities.dp(1.0f)));
            rect.offset(0, (int) ((-AndroidUtilities.dp(7.0f)) * this.H));
            p6Var.w = (int) (AndroidUtilities.lerp(0.5f, 1.0f, this.V) * (1.0f - this.M) * this.c0);
            p6Var.setBounds(rect);
            p6Var.draw(canvas);
            if (this.J) {
                org.telegram.ui.Components.p6 p6Var3 = this.e;
                a2 = p6Var3.d();
                rect.set((int) (((getMeasuredWidth() - a2) - getWidth()) / 2.0f), (int) (((getMeasuredHeight() - p6Var3.e) / 2.0f) - AndroidUtilities.dp(1.0f)), (int) org.telegram.messenger.w1.a(getMeasuredWidth() - a2, getWidth(), 2.0f, a2), (int) (((getMeasuredHeight() + p6Var3.e) / 2.0f) - AndroidUtilities.dp(1.0f)));
                rect.offset(0, AndroidUtilities.dp(11.0f));
                canvas.save();
                float lerp = AndroidUtilities.lerp(0.1f, 1.0f, this.H);
                canvas.scale(lerp, lerp, rect.centerX(), rect.bottom);
                p6Var3.w = (int) (AndroidUtilities.lerp(0.5f, 1.0f, this.V) * (1.0f - this.M) * 200.0f * this.H);
                p6Var3.setBounds(rect);
                p6Var3.draw(canvas);
                canvas.restore();
            }
            rect.set((int) (com.google.android.gms.internal.vision.e2.A(getMeasuredWidth(), a2, 2.0f, d) + AndroidUtilities.dp(this.E ? 5.0f : 2.0f)), (int) ((getMeasuredHeight() - AndroidUtilities.dp(18.0f)) / 2.0f), (int) (Math.max(AndroidUtilities.dp(9.0f), p6Var2.d() + dp2) + com.google.android.gms.internal.vision.e2.A(getMeasuredWidth(), a2, 2.0f, d) + AndroidUtilities.dp((this.E ? 5 : 2) + 8)), (int) ((AndroidUtilities.dp(18.0f) + getMeasuredHeight()) / 2.0f));
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(rect);
            if (this.P != 1.0f) {
                canvas.save();
                float f12 = this.P;
                canvas.scale(f12, f12, rect.centerX(), rect.centerY());
            }
            if (this.E) {
                f7 = 0.5f;
                int lerp2 = (int) (AndroidUtilities.lerp(0.5f, 1.0f, this.V) * (1.0f - this.M) * this.c0 * d10 * d10);
                Paint paint = this.c;
                paint.setAlpha(lerp2);
                float dp4 = AndroidUtilities.dp(this.T ? 4.0f : 10.0f);
                canvas.drawRoundRect(rectF, dp4, dp4, paint);
            } else {
                f7 = 0.5f;
            }
            CharSequence charSequence = p6Var2.g;
            rect.offset(-AndroidUtilities.dp((charSequence != null ? charSequence.length() : 0) > 1 ? 0.3f : 0.0f), -AndroidUtilities.dp(0.4f));
            float A = org.telegram.messenger.w1.A(1.0f, this.M, this.c0, d10);
            if (this.E) {
                f7 = 1.0f;
            }
            p6Var2.w = (int) (A * f7);
            p6Var2.setBounds(rect);
            canvas.save();
            if (this.E && this.T) {
                this.U.setAlpha((int) ((1.0f - this.M) * this.c0 * d10 * 1.0f));
                this.U.setBounds(AndroidUtilities.dp(1.0f) + rect.left, AndroidUtilities.dp(2.0f) + rect.top, this.U.getIntrinsicWidth() + AndroidUtilities.dp(1.0f) + rect.left, this.U.getIntrinsicHeight() + AndroidUtilities.dp(2.0f) + rect.top);
                this.U.draw(canvas);
                canvas.translate(dp2 / 2.0f, 0.0f);
            }
            p6Var2.draw(canvas);
            canvas.restore();
            if (this.P != 1.0f) {
                canvas.restore();
            }
            if (z10) {
                canvas.restore();
            }
        }
        if (!this.v || this.g0 == (wrapWidth = getWrapWidth())) {
            return;
        }
        this.g0 = wrapWidth;
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
            if (!this.f0) {
                super.onMeasure(i10, i11);
                return;
            } else {
                super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) Math.min(Math.max(this.d.d() + getPaddingLeft() + getPaddingRight(), this.e0), View.MeasureSpec.getSize(i10)), TLObject.FLAG_30), i11);
                return;
            }
        }
        int wrapWidth = getWrapWidth();
        this.g0 = wrapWidth;
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
            setBackground(org.telegram.ui.ActionBar.j6.b0(dp, i10));
            return;
        }
        this.d.r(i10);
        int l1 = org.telegram.ui.ActionBar.j6.l1(0.1f, i10);
        int i11 = this.b;
        this.r.setBackground(org.telegram.ui.ActionBar.j6.Y(l1, i11, i11));
    }

    public void setCountFilled(boolean z10) {
        this.E = z10;
        float dp = AndroidUtilities.dp(z10 ? 12.0f : 14.0f);
        org.telegram.ui.Components.p6 p6Var = this.f;
        p6Var.t(dp);
        p6Var.r(this.E ? this.y : this.d.a.getColor());
    }

    public void setCounterColor(int i10) {
        this.f.r(i10);
        this.U.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        if (this.W != z10) {
            ValueAnimator valueAnimator = this.a0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.a0 = null;
            }
            float f7 = this.V;
            this.W = z10;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, z10 ? 1.0f : 0.0f);
            this.a0 = ofFloat;
            ofFloat.addUpdateListener(new b(this, 1));
            this.a0.start();
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
            setBackground(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(this.b), this.y));
            p6Var.u(AndroidUtilities.bold());
        } else {
            setBackground(null);
            p6Var.u(null);
        }
        j();
    }

    public void setFlickeringLoading(boolean z10) {
        this.L = z10;
    }

    public void setGlobalAlpha(float f7) {
        this.c0 = (int) (f7 * 255.0f);
    }

    @Override // org.telegram.ui.Components.g90
    public void setLoading(boolean z10) {
        if (this.N != z10) {
            if (this.L) {
                this.N = z10;
                invalidate();
                return;
            }
            ValueAnimator valueAnimator = this.O;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.O = null;
            }
            float f7 = this.M;
            this.N = z10;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, z10 ? 1.0f : 0.0f);
            this.O = ofFloat;
            ofFloat.addUpdateListener(new b(this, 2));
            this.O.addListener(new ah.q0(7, this, z10));
            this.O.setDuration(320L);
            this.O.setInterpolator(pr.h);
            this.O.start();
        }
    }

    public void setMinWidth(int i10) {
        this.f0 = true;
        this.e0 = i10;
    }

    public void setRoundRadius(int i10) {
        this.b = i10;
        if (this.s) {
            setBackground(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(i10), this.y));
        } else {
            setBackground(null);
        }
        j();
    }

    public void setShowZero(boolean z10) {
        this.S = z10;
    }

    public void setText(CharSequence charSequence) {
        g(charSequence, false, true);
    }

    public void setTextAlpha(float f7) {
        this.d.w = (int) (f7 * 255.0f);
    }

    public void setTextColor(int i10) {
        org.telegram.ui.Components.p6 p6Var = this.d;
        p6Var.r(i10);
        if (this.s) {
            return;
        }
        int l1 = org.telegram.ui.ActionBar.j6.l1(0.1f, p6Var.a.getColor());
        int i11 = this.b;
        this.r.setBackground(org.telegram.ui.ActionBar.j6.Y(l1, i11, i11));
    }

    public void setUseWrapContent(boolean z10) {
        this.v = z10;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return this.K == drawable || this.d == drawable || this.e == drawable || this.f == drawable || super.verifyDrawable(drawable);
    }

    public d(Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z10) {
        super(context);
        this.b = 8;
        pr prVar = pr.h;
        this.n = new org.telegram.ui.Components.e6(350L, prVar);
        this.E = true;
        this.F = 0;
        this.H = 0.0f;
        this.M = 0.0f;
        this.P = 1.0f;
        this.V = 1.0f;
        this.W = true;
        this.c0 = 255;
        this.s = z10;
        this.a = f6Var;
        w7.z5.b(this, 0.02f, 1.2f);
        View view = new View(context);
        this.r = view;
        addView(view, w7.x5.c(-1.0f, -1));
        if (z10) {
            int dp = AndroidUtilities.dp(8.0f);
            int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, f6Var);
            this.y = v02;
            setBackground(org.telegram.ui.ActionBar.j6.b0(dp, v02));
        }
        Paint paint = new Paint(1);
        this.c = paint;
        paint.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Sh, f6Var));
        org.telegram.ui.Components.p6 p6Var = new org.telegram.ui.Components.p6(true, true, false, false);
        this.d = p6Var;
        p6Var.k(0.3f, 250L, prVar);
        p6Var.setCallback(this);
        p6Var.t(AndroidUtilities.dp(14.0f));
        if (z10) {
            p6Var.u(AndroidUtilities.bold());
        }
        p6Var.b = 1;
        org.telegram.ui.Components.p6 p6Var2 = new org.telegram.ui.Components.p6(i(), true, false, false);
        this.e = p6Var2;
        p6Var2.k(0.3f, 250L, prVar);
        p6Var2.setCallback(this);
        p6Var2.t(AndroidUtilities.dp(12.0f));
        p6Var2.b = 1;
        org.telegram.ui.Components.p6 p6Var3 = new org.telegram.ui.Components.p6(false, false, true, false);
        this.f = p6Var3;
        p6Var3.k(0.3f, 250L, prVar);
        p6Var3.setCallback(this);
        p6Var3.t(AndroidUtilities.dp(12.0f));
        p6Var3.u(AndroidUtilities.bold());
        p6Var3.q("", true, true);
        p6Var3.b = 1;
        setWillNotDraw(false);
        j();
    }
}
