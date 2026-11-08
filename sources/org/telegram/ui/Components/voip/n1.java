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
import di.m4;
import fi.v3;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.qs;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.xq;
import org.telegram.ui.qb1;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class n1 extends FrameLayout {
    public float D;
    public float E;
    public float F;
    public float G;
    public float H;
    public float I;
    public float J;
    public float K;
    public boolean L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public float Q;
    public boolean R;
    public boolean S;
    public int T;
    public float U;
    public float V;
    public float W;
    public float a;
    public float a0;
    public float b;
    public boolean b0;
    public float c;
    public boolean c0;
    public float d;
    public ValueAnimator d0;
    public boolean e;
    public final m4 e0;
    public int f;
    public ValueAnimator f0;
    public final v3 g0;
    public int h;
    public View.OnClickListener h0;
    public m1 i0;
    public long j0;
    public WindowInsets n;
    public final float r;
    public final Path s;
    public final RectF w;
    public final Paint x;
    public final Drawable y;

    public n1(Activity activity) {
        super(activity);
        this.s = new Path();
        this.w = new RectF();
        new Paint(1);
        Paint paint = new Paint(1);
        this.x = paint;
        this.D = -1.0f;
        this.E = -1.0f;
        this.J = 0.0f;
        this.K = 0.0f;
        this.Q = -1.0f;
        this.R = true;
        this.e0 = new m4(this, 11);
        this.g0 = new v3(this, 19);
        this.r = ViewConfiguration.get(activity).getScaledTouchSlop();
        setOutlineProvider(new fh.a(this, 7));
        setClipToOutline(true);
        paint.setColor(i0.a.o(-16777216, qs.n1));
        this.y = activity.getDrawable(R.drawable.calls_mute_mini);
    }

    public final void a() {
        f();
        float f10 = this.U;
        if (f10 < 0.0f || this.O) {
            return;
        }
        e(f10, this.V, getMeasuredWidth(), getMeasuredHeight(), true);
        this.U = -1.0f;
        this.V = -1.0f;
    }

    public final void b() {
        if (getMeasuredWidth() <= 0 || this.D >= 0.0f) {
            this.U = -1.0f;
            this.V = -1.0f;
            return;
        }
        Object parent = getParent();
        if (parent == null) {
            return;
        }
        float systemWindowInsetTop = this.n == null ? 0.0f : r2.getSystemWindowInsetTop() + this.H;
        float systemWindowInsetBottom = this.n == null ? 0.0f : r3.getSystemWindowInsetBottom() + this.I;
        View view = (View) parent;
        this.U = (getTranslationX() - this.F) / (((view.getMeasuredWidth() - this.F) - this.G) - getMeasuredWidth());
        this.V = (getTranslationY() - systemWindowInsetTop) / (((view.getMeasuredHeight() - systemWindowInsetBottom) - systemWindowInsetTop) - getMeasuredHeight());
        this.U = Math.max(0.0f, Math.min(1.0f, this.U));
        this.V = Math.max(0.0f, Math.min(1.0f, this.V));
    }

    public final void c(boolean z9, boolean z10) {
        n1 n1Var;
        if (getMeasuredWidth() <= 0 || getVisibility() != 0) {
            z10 = false;
        }
        if (!z10) {
            if (this.M != z9) {
                this.M = z9;
                this.N = z9;
                this.J = z9 ? 1.0f : 0.0f;
                requestLayout();
                invalidateOutline();
                return;
            }
            return;
        }
        if (this.O) {
            this.N = z9;
            return;
        }
        if (!z9 || this.M) {
            if (z9 || !this.M) {
                this.J = this.M ? 1.0f : 0.0f;
                this.M = z9;
                this.N = z9;
                requestLayout();
                return;
            }
            this.N = z9;
            float translationX = getTranslationX();
            float translationY = getTranslationY();
            f();
            this.M = false;
            this.O = true;
            requestLayout();
            animate().setListener(null).cancel();
            getViewTreeObserver().addOnPreDrawListener(new l1(this, translationX, translationY));
            return;
        }
        this.M = true;
        this.N = z9;
        f();
        float f10 = this.D;
        if (f10 >= 0.0f) {
            n1Var = this;
            n1Var.e(f10, this.E, (int) (getMeasuredWidth() * 0.23f), (int) (getMeasuredHeight() * 0.23f), false);
        } else {
            n1Var = this;
        }
        n1Var.M = false;
        n1Var.O = true;
        float translationX2 = getTranslationX();
        float translationY2 = getTranslationY();
        setTranslationX(0.0f);
        setTranslationY(0.0f);
        invalidate();
        ValueAnimator valueAnimator = n1Var.d0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(n1Var.J, 1.0f);
        n1Var.d0 = ofFloat;
        ofFloat.addUpdateListener(n1Var.e0);
        n1Var.d0.setDuration(300L);
        n1Var.d0.start();
        animate().setListener(null).cancel();
        ViewPropertyAnimator duration = animate().scaleX(0.23f).scaleY(0.23f).translationX(translationX2 - ((getMeasuredWidth() - (getMeasuredWidth() * 0.23f)) / 2.0f)).translationY(translationY2 - ((getMeasuredHeight() - (getMeasuredHeight() * 0.23f)) / 2.0f)).alpha(1.0f).setStartDelay(0L).setDuration(300L);
        xq xqVar = xq.f;
        duration.setInterpolator(xqVar).setListener(new k1(this, translationX2, translationY2, 0)).setInterpolator(xqVar).start();
    }

    public final void d(float f10, float f11) {
        Object parent = getParent();
        if (this.M && parent != null && ((View) parent).getMeasuredWidth() <= 0 && getMeasuredWidth() != 0 && getMeasuredHeight() != 0) {
            e(f10, f11, getMeasuredWidth(), getMeasuredHeight(), true);
        } else {
            this.D = f10;
            this.E = f11;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        n1 n1Var;
        if (this.W >= 0.0f) {
            if (!this.c0) {
                animate().setListener(null).cancel();
            }
            setTranslationX(this.W);
            setTranslationY(this.a0);
            if (!this.c0) {
                setScaleX(1.0f);
                setScaleY(1.0f);
                setAlpha(1.0f);
            }
            this.W = -1.0f;
            this.a0 = -1.0f;
        }
        if (this.D < 0.0f || !this.M || getMeasuredWidth() <= 0) {
            n1Var = this;
        } else {
            n1Var = this;
            n1Var.e(this.D, this.E, getMeasuredWidth(), getMeasuredHeight(), false);
            n1Var.D = -1.0f;
            n1Var.E = -1.0f;
        }
        super.dispatchDraw(canvas);
        if (!n1Var.O) {
            boolean z9 = n1Var.M;
            boolean z10 = n1Var.N;
            if (z9 != z10) {
                c(z10, true);
            }
        }
        int measuredWidth = getMeasuredWidth() >> 1;
        int measuredHeight = getMeasuredHeight() - ((int) ((org.telegram.messenger.g0.L(18.0f) * 1.0f) / getScaleY()));
        canvas.save();
        float f10 = measuredWidth;
        float f11 = measuredHeight;
        canvas.scale((1.0f / getScaleX()) * n1Var.J * n1Var.K, (1.0f / getScaleY()) * n1Var.J * n1Var.K, f10, f11);
        canvas.drawCircle(f10, f11, org.telegram.messenger.g0.L(14.0f), n1Var.x);
        Drawable drawable = n1Var.y;
        drawable.setBounds(org.telegram.ui.Cells.f1.z(2, measuredWidth, drawable), org.telegram.ui.Cells.f1.y(2, measuredHeight, drawable), org.telegram.ui.Cells.f1.w(2, measuredWidth, drawable), org.telegram.ui.Cells.f1.f(2, measuredHeight, drawable));
        drawable.draw(canvas);
        canvas.restore();
        if (n1Var.O) {
            invalidate();
        }
    }

    public final void e(float f10, float f11, int i7, int i10, boolean z9) {
        Object parent = getParent();
        if (parent == null || !this.M || this.O || !this.R) {
            return;
        }
        float systemWindowInsetTop = this.n == null ? 0.0f : r1.getSystemWindowInsetTop() + this.H;
        float systemWindowInsetBottom = this.n != null ? r3.getSystemWindowInsetBottom() + this.I : 0.0f;
        View view = (View) parent;
        float z10 = com.google.android.recaptcha.internal.a.z((view.getMeasuredWidth() - this.F) - this.G, i7, f10, this.F);
        float z11 = com.google.android.recaptcha.internal.a.z((view.getMeasuredHeight() - systemWindowInsetBottom) - systemWindowInsetTop, i10, f11, systemWindowInsetTop);
        if (z9) {
            animate().setListener(null).cancel();
            animate().scaleX(1.0f).scaleY(1.0f).translationX(z10).translationY(z11).alpha(1.0f).setStartDelay(this.L ? 0L : 150L).setDuration(150L).setInterpolator(xq.f).start();
            return;
        }
        if (!this.S) {
            animate().setListener(null).cancel();
            setScaleX(1.0f);
            setScaleY(1.0f);
            animate().alpha(1.0f).setDuration(150L).start();
        }
        setTranslationX(z10);
        setTranslationY(z11);
    }

    public final void f() {
        this.F = org.telegram.messenger.g0.L(16.0f);
        this.G = org.telegram.messenger.g0.L(16.0f);
        this.H = this.L ? org.telegram.messenger.g0.L(60.0f) : org.telegram.messenger.g0.L(16.0f);
        this.I = org.telegram.messenger.g0.L(this.L ? 100.0f : 16.0f) + this.T;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i10);
        this.P = false;
        if (this.M) {
            size = (int) (size * 0.23f);
            size2 = (int) (size2 * 0.23f);
            this.P = true;
        } else if (!this.b0) {
            setTranslationX(0.0f);
            setTranslationY(0.0f);
        }
        m1 m1Var = this.i0;
        if (m1Var != null) {
            ((qb1) m1Var).b.d0.d(this.P, this.J);
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
        if (!this.M || this.O || !this.R) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    float x10 = (getX() + motionEvent.getX()) - this.a;
                    float y10 = (getY() + motionEvent.getY()) - this.b;
                    if (!this.e) {
                        float f10 = (y10 * y10) + (x10 * x10);
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
                            y10 = 0.0f;
                        }
                    }
                    if (this.e) {
                        setTranslationX(this.c + x10);
                        setTranslationY(this.d + y10);
                        return true;
                    }
                }
            }
            if (parent != null && this.M && !this.O) {
                parent.requestDisallowInterceptTouchEvent(false);
                animate().setListener(null).cancel();
                ViewPropertyAnimator startDelay = animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setStartDelay(0L);
                if (this.h0 != null && !this.e && System.currentTimeMillis() - this.j0 < 200) {
                    this.h0.onClick(this);
                }
                int measuredWidth = ((View) getParent()).getMeasuredWidth();
                int measuredHeight = ((View) getParent()).getMeasuredHeight();
                float f12 = this.H;
                float f13 = this.I;
                if (this.n != null) {
                    f12 += r5.getSystemWindowInsetTop();
                    f13 += this.n.getSystemWindowInsetBottom();
                }
                float x11 = getX();
                float f14 = this.F;
                if (x11 < f14) {
                    startDelay.translationX(f14);
                } else if (getX() + getMeasuredWidth() > measuredWidth - this.G) {
                    startDelay.translationX((measuredWidth - getMeasuredWidth()) - this.G);
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
        if (this.M && !this.O) {
            this.j0 = System.currentTimeMillis();
            this.a = getX() + motionEvent.getX();
            this.b = getY() + motionEvent.getY();
            animate().setListener(null).cancel();
            animate().scaleY(1.05f).scaleX(1.05f).alpha(1.0f).setStartDelay(0L).start();
        }
        return true;
    }

    public void setCornerRadius(float f10) {
        this.Q = f10;
        invalidateOutline();
    }

    public void setDelegate(m1 m1Var) {
        this.i0 = m1Var;
    }

    public void setInsets(WindowInsets windowInsets) {
        this.n = windowInsets;
    }

    public void setIsActive(boolean z9) {
        this.R = z9;
    }

    public void setOnTapListener(View.OnClickListener onClickListener) {
        this.h0 = onClickListener;
    }

    public void setRelativePosition(n1 n1Var) {
        Object parent = getParent();
        if (parent == null) {
            return;
        }
        float systemWindowInsetTop = this.n == null ? 0.0f : r1.getSystemWindowInsetTop() + this.H;
        View view = (View) parent;
        d(Math.min(1.0f, Math.max(0.0f, (n1Var.getTranslationX() - this.F) / (((view.getMeasuredWidth() - this.F) - this.G) - n1Var.getMeasuredWidth()))), Math.min(1.0f, Math.max(0.0f, (n1Var.getTranslationY() - systemWindowInsetTop) / (((view.getMeasuredHeight() - (this.n == null ? 0.0f : r3.getSystemWindowInsetBottom() + this.I)) - systemWindowInsetTop) - n1Var.getMeasuredHeight()))));
    }

    public void setUiVisible(boolean z9) {
        if (getParent() == null) {
            this.L = z9;
        } else {
            this.L = z9;
        }
    }
}
