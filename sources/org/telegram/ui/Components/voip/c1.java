package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import ei.n4;
import gi.j3;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hs;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.xq;
import org.telegram.ui.ib1;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class c1 extends FrameLayout {
    public float E;
    public float F;
    public float G;
    public float H;
    public float I;
    public float J;
    public float K;
    public float L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public float R;
    public boolean S;
    public boolean T;
    public int U;
    public float V;
    public float W;
    public float a;
    public float a0;
    public float b;
    public float b0;
    public float c;
    public boolean c0;
    public float d;
    public boolean d0;
    public boolean e;
    public ValueAnimator e0;
    public int f;
    public final n4 f0;
    public ValueAnimator g0;
    public int h;
    public final j3 h0;
    public View.OnClickListener i0;
    public b1 j0;
    public long k0;
    public WindowInsets n;
    public final float r;
    public final Path s;
    public final RectF w;
    public final Paint x;
    public final Drawable y;

    public c1(Activity activity) {
        super(activity);
        this.s = new Path();
        this.w = new RectF();
        new Paint(1);
        Paint paint = new Paint(1);
        this.x = paint;
        this.E = -1.0f;
        this.F = -1.0f;
        this.K = 0.0f;
        this.L = 0.0f;
        this.R = -1.0f;
        this.S = true;
        this.f0 = new n4(this, 11);
        this.h0 = new j3(this, 20);
        this.r = ViewConfiguration.get(activity).getScaledTouchSlop();
        setOutlineProvider(new gh.a(this, 6));
        setClipToOutline(true);
        paint.setColor(i0.a.o(-16777216, hs.n1));
        this.y = activity.getDrawable(R.drawable.calls_mute_mini);
    }

    public final void a() {
        f();
        float f10 = this.V;
        if (f10 < 0.0f || this.P) {
            return;
        }
        e(f10, this.W, getMeasuredWidth(), getMeasuredHeight(), true);
        this.V = -1.0f;
        this.W = -1.0f;
    }

    public final void b() {
        if (getMeasuredWidth() <= 0 || this.E >= 0.0f) {
            this.V = -1.0f;
            this.W = -1.0f;
            return;
        }
        Object parent = getParent();
        if (parent == null) {
            return;
        }
        float systemWindowInsetTop = this.n == null ? 0.0f : r2.getSystemWindowInsetTop() + this.I;
        float systemWindowInsetBottom = this.n == null ? 0.0f : r3.getSystemWindowInsetBottom() + this.J;
        View view = (View) parent;
        this.V = (getTranslationX() - this.G) / (((view.getMeasuredWidth() - this.G) - this.H) - getMeasuredWidth());
        this.W = (getTranslationY() - systemWindowInsetTop) / (((view.getMeasuredHeight() - systemWindowInsetBottom) - systemWindowInsetTop) - getMeasuredHeight());
        this.V = Math.max(0.0f, Math.min(1.0f, this.V));
        this.W = Math.max(0.0f, Math.min(1.0f, this.W));
    }

    public final void c(boolean z10, boolean z11) {
        c1 c1Var;
        if (getMeasuredWidth() <= 0 || getVisibility() != 0) {
            z11 = false;
        }
        if (!z11) {
            if (this.N != z10) {
                this.N = z10;
                this.O = z10;
                this.K = z10 ? 1.0f : 0.0f;
                requestLayout();
                invalidateOutline();
                return;
            }
            return;
        }
        if (this.P) {
            this.O = z10;
            return;
        }
        if (!z10 || this.N) {
            if (z10 || !this.N) {
                this.K = this.N ? 1.0f : 0.0f;
                this.N = z10;
                this.O = z10;
                requestLayout();
                return;
            }
            this.O = z10;
            float translationX = getTranslationX();
            float translationY = getTranslationY();
            f();
            this.N = false;
            this.P = true;
            requestLayout();
            animate().setListener(null).cancel();
            getViewTreeObserver().addOnPreDrawListener(new a1(this, translationX, translationY));
            return;
        }
        this.N = true;
        this.O = z10;
        f();
        float f10 = this.E;
        if (f10 >= 0.0f) {
            c1Var = this;
            c1Var.e(f10, this.F, (int) (getMeasuredWidth() * 0.23f), (int) (getMeasuredHeight() * 0.23f), false);
        } else {
            c1Var = this;
        }
        c1Var.N = false;
        c1Var.P = true;
        float translationX2 = getTranslationX();
        float translationY2 = getTranslationY();
        setTranslationX(0.0f);
        setTranslationY(0.0f);
        invalidate();
        ValueAnimator valueAnimator = c1Var.e0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(c1Var.K, 1.0f);
        c1Var.e0 = ofFloat;
        ofFloat.addUpdateListener(c1Var.f0);
        c1Var.e0.setDuration(300L);
        c1Var.e0.start();
        animate().setListener(null).cancel();
        ViewPropertyAnimator duration = animate().scaleX(0.23f).scaleY(0.23f).translationX(translationX2 - ((getMeasuredWidth() - (getMeasuredWidth() * 0.23f)) / 2.0f)).translationY(translationY2 - ((getMeasuredHeight() - (getMeasuredHeight() * 0.23f)) / 2.0f)).alpha(1.0f).setStartDelay(0L).setDuration(300L);
        xq xqVar = xq.f;
        duration.setInterpolator(xqVar).setListener(new z0(this, translationX2, translationY2, 0)).setInterpolator(xqVar).start();
    }

    public final void d(float f10, float f11) {
        Object parent = getParent();
        if (this.N && parent != null && ((View) parent).getMeasuredWidth() <= 0 && getMeasuredWidth() != 0 && getMeasuredHeight() != 0) {
            e(f10, f11, getMeasuredWidth(), getMeasuredHeight(), true);
        } else {
            this.E = f10;
            this.F = f11;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        c1 c1Var;
        if (this.a0 >= 0.0f) {
            if (!this.d0) {
                animate().setListener(null).cancel();
            }
            setTranslationX(this.a0);
            setTranslationY(this.b0);
            if (!this.d0) {
                setScaleX(1.0f);
                setScaleY(1.0f);
                setAlpha(1.0f);
            }
            this.a0 = -1.0f;
            this.b0 = -1.0f;
        }
        if (this.E < 0.0f || !this.N || getMeasuredWidth() <= 0) {
            c1Var = this;
        } else {
            c1Var = this;
            c1Var.e(this.E, this.F, getMeasuredWidth(), getMeasuredHeight(), false);
            c1Var.E = -1.0f;
            c1Var.F = -1.0f;
        }
        super.dispatchDraw(canvas);
        if (!c1Var.P) {
            boolean z10 = c1Var.N;
            boolean z11 = c1Var.O;
            if (z10 != z11) {
                c(z11, true);
            }
        }
        int measuredWidth = getMeasuredWidth() >> 1;
        int measuredHeight = getMeasuredHeight() - ((int) ((org.telegram.messenger.g0.L(18.0f) * 1.0f) / getScaleY()));
        canvas.save();
        float f10 = measuredWidth;
        float f11 = measuredHeight;
        canvas.scale((1.0f / getScaleX()) * c1Var.K * c1Var.L, (1.0f / getScaleY()) * c1Var.K * c1Var.L, f10, f11);
        canvas.drawCircle(f10, f11, org.telegram.messenger.g0.L(14.0f), c1Var.x);
        Drawable drawable = c1Var.y;
        drawable.setBounds(org.telegram.ui.Cells.f1.C(2, measuredWidth, drawable), org.telegram.ui.Cells.f1.B(2, measuredHeight, drawable), org.telegram.ui.Cells.f1.z(2, measuredWidth, drawable), org.telegram.ui.Cells.f1.i(2, measuredHeight, drawable));
        drawable.draw(canvas);
        canvas.restore();
        if (c1Var.P) {
            invalidate();
        }
    }

    public final void e(float f10, float f11, int i3, int i10, boolean z10) {
        Object parent = getParent();
        if (parent == null || !this.N || this.P || !this.S) {
            return;
        }
        float systemWindowInsetTop = this.n == null ? 0.0f : r1.getSystemWindowInsetTop() + this.I;
        float systemWindowInsetBottom = this.n != null ? r3.getSystemWindowInsetBottom() + this.J : 0.0f;
        View view = (View) parent;
        float y9 = com.google.android.recaptcha.internal.a.y((view.getMeasuredWidth() - this.G) - this.H, i3, f10, this.G);
        float y10 = com.google.android.recaptcha.internal.a.y((view.getMeasuredHeight() - systemWindowInsetBottom) - systemWindowInsetTop, i10, f11, systemWindowInsetTop);
        if (z10) {
            animate().setListener(null).cancel();
            animate().scaleX(1.0f).scaleY(1.0f).translationX(y9).translationY(y10).alpha(1.0f).setStartDelay(this.M ? 0L : 150L).setDuration(150L).setInterpolator(xq.f).start();
            return;
        }
        if (!this.T) {
            animate().setListener(null).cancel();
            setScaleX(1.0f);
            setScaleY(1.0f);
            animate().alpha(1.0f).setDuration(150L).start();
        }
        setTranslationX(y9);
        setTranslationY(y10);
    }

    public final void f() {
        this.G = org.telegram.messenger.g0.L(16.0f);
        this.H = org.telegram.messenger.g0.L(16.0f);
        this.I = this.M ? org.telegram.messenger.g0.L(60.0f) : org.telegram.messenger.g0.L(16.0f);
        this.J = org.telegram.messenger.g0.L(this.M ? 100.0f : 16.0f) + this.U;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        int size = View.MeasureSpec.getSize(i3);
        int size2 = View.MeasureSpec.getSize(i10);
        this.Q = false;
        if (this.N) {
            size = (int) (size * 0.23f);
            size2 = (int) (size2 * 0.23f);
            this.Q = true;
        } else if (!this.c0) {
            setTranslationX(0.0f);
            setTranslationY(0.0f);
        }
        b1 b1Var = this.j0;
        if (b1Var != null) {
            ((ib1) b1Var).b.e0.d(this.Q, this.K);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
        if (getMeasuredHeight() != this.f && getMeasuredWidth() != this.h) {
            Path path = this.s;
            path.reset();
            float measuredWidth = getMeasuredWidth();
            float measuredHeight = getMeasuredHeight();
            RectF rectF = this.w;
            rectF.set(0.0f, 0.0f, measuredWidth, measuredHeight);
            path.addRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), Path.Direction.CW);
            path.toggleInverseFillType();
        }
        this.f = getMeasuredHeight();
        this.h = getMeasuredWidth();
        f();
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
    
        if (r1 != 3) goto L63;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent = getParent();
        if (!this.N || this.P || !this.S) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    float x10 = (getX() + motionEvent.getX()) - this.a;
                    float y9 = (getY() + motionEvent.getY()) - this.b;
                    if (!this.e) {
                        float f10 = (y9 * y9) + (x10 * x10);
                        float f11 = this.r;
                        if (f10 > f11 * f11) {
                            if (parent != null) {
                                parent.requestDisallowInterceptTouchEvent(true);
                            }
                            this.e = true;
                            this.a = getX() + motionEvent.getX();
                            this.b = getY() + motionEvent.getY();
                            this.c = getTranslationX();
                            this.d = getTranslationY();
                            x10 = 0.0f;
                            y9 = 0.0f;
                        }
                    }
                    if (this.e) {
                        setTranslationX(this.c + x10);
                        setTranslationY(this.d + y9);
                        return true;
                    }
                }
            }
            if (parent != null && this.N && !this.P) {
                parent.requestDisallowInterceptTouchEvent(false);
                animate().setListener(null).cancel();
                ViewPropertyAnimator startDelay = animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setStartDelay(0L);
                if (this.i0 != null && !this.e && System.currentTimeMillis() - this.k0 < 200) {
                    this.i0.onClick(this);
                }
                int measuredWidth = ((View) getParent()).getMeasuredWidth();
                int measuredHeight = ((View) getParent()).getMeasuredHeight();
                float f12 = this.I;
                float f13 = this.J;
                if (this.n != null) {
                    f12 += r5.getSystemWindowInsetTop();
                    f13 += this.n.getSystemWindowInsetBottom();
                }
                float x11 = getX();
                float f14 = this.G;
                if (x11 < f14) {
                    startDelay.translationX(f14);
                } else if (getX() + getMeasuredWidth() > measuredWidth - this.H) {
                    startDelay.translationX((measuredWidth - getMeasuredWidth()) - this.H);
                }
                if (getY() < f12) {
                    startDelay.translationY(f12);
                } else if (getY() + getMeasuredHeight() > measuredHeight - f13) {
                    startDelay.translationY((measuredHeight - getMeasuredHeight()) - f13);
                }
                startDelay.setDuration(150L).setInterpolator(xq.f).start();
            }
            this.e = false;
            return true;
        }
        if (this.N && !this.P) {
            this.k0 = System.currentTimeMillis();
            this.a = getX() + motionEvent.getX();
            this.b = getY() + motionEvent.getY();
            animate().setListener(null).cancel();
            animate().scaleY(1.05f).scaleX(1.05f).alpha(1.0f).setStartDelay(0L).start();
        }
        return true;
    }

    public void setCornerRadius(float f10) {
        this.R = f10;
        invalidateOutline();
    }

    public void setDelegate(b1 b1Var) {
        this.j0 = b1Var;
    }

    public void setInsets(WindowInsets windowInsets) {
        this.n = windowInsets;
    }

    public void setIsActive(boolean z10) {
        this.S = z10;
    }

    public void setOnTapListener(View.OnClickListener onClickListener) {
        this.i0 = onClickListener;
    }

    public void setRelativePosition(c1 c1Var) {
        Object parent = getParent();
        if (parent == null) {
            return;
        }
        float systemWindowInsetTop = this.n == null ? 0.0f : r1.getSystemWindowInsetTop() + this.I;
        View view = (View) parent;
        d(Math.min(1.0f, Math.max(0.0f, (c1Var.getTranslationX() - this.G) / (((view.getMeasuredWidth() - this.G) - this.H) - c1Var.getMeasuredWidth()))), Math.min(1.0f, Math.max(0.0f, (c1Var.getTranslationY() - systemWindowInsetTop) / (((view.getMeasuredHeight() - (this.n == null ? 0.0f : r3.getSystemWindowInsetBottom() + this.J)) - systemWindowInsetTop) - c1Var.getMeasuredHeight()))));
    }

    public void setUiVisible(boolean z10) {
        if (getParent() == null) {
            this.M = z10;
        } else {
            this.M = z10;
        }
    }
}
