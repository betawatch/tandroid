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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.rl;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.er;
import org.telegram.ui.tg1;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class s1 extends FrameLayout {
    public float A;
    public float B;
    public float C;
    public float D;
    public float E;
    public float F;
    public float G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public float M;
    public boolean N;
    public boolean O;
    public int P;
    public float Q;
    public float R;
    public float S;
    public float T;
    public boolean U;
    public boolean V;
    public ValueAnimator W;
    public float a;
    public final ag.q1 a0;
    public float b;
    public ValueAnimator b0;
    public float c;
    public final lh.m2 c0;
    public float d;
    public View.OnClickListener d0;
    public boolean e;
    public r1 e0;
    public int f;
    public long f0;
    public int h;
    public WindowInsets n;
    public final float r;
    public final Path s;
    public final RectF v;
    public final Paint w;
    public final Drawable x;
    public float y;

    public s1(Activity activity) {
        super(activity);
        this.s = new Path();
        this.v = new RectF();
        new Paint(1);
        Paint paint = new Paint(1);
        this.w = paint;
        this.y = -1.0f;
        this.A = -1.0f;
        this.F = 0.0f;
        this.G = 0.0f;
        this.M = -1.0f;
        this.N = true;
        this.a0 = new ag.q1(this, 10);
        this.c0 = new lh.m2(this, 13);
        this.r = ViewConfiguration.get(activity).getScaledTouchSlop();
        setOutlineProvider(new lg.b(this, 4));
        setClipToOutline(true);
        paint.setColor(i0.b.k(-16777216, 102));
        this.x = activity.getDrawable(R.drawable.calls_mute_mini);
    }

    public final void a() {
        f();
        float f10 = this.Q;
        if (f10 < 0.0f || this.K) {
            return;
        }
        e(f10, this.R, getMeasuredWidth(), getMeasuredHeight(), true);
        this.Q = -1.0f;
        this.R = -1.0f;
    }

    public final void b() {
        if (getMeasuredWidth() <= 0 || this.y >= 0.0f) {
            this.Q = -1.0f;
            this.R = -1.0f;
            return;
        }
        Object parent = getParent();
        if (parent == null) {
            return;
        }
        float systemWindowInsetTop = this.n == null ? 0.0f : r2.getSystemWindowInsetTop() + this.D;
        float systemWindowInsetBottom = this.n == null ? 0.0f : r3.getSystemWindowInsetBottom() + this.E;
        View view = (View) parent;
        this.Q = (getTranslationX() - this.B) / (((view.getMeasuredWidth() - this.B) - this.C) - getMeasuredWidth());
        this.R = (getTranslationY() - systemWindowInsetTop) / (((view.getMeasuredHeight() - systemWindowInsetBottom) - systemWindowInsetTop) - getMeasuredHeight());
        this.Q = Math.max(0.0f, Math.min(1.0f, this.Q));
        this.R = Math.max(0.0f, Math.min(1.0f, this.R));
    }

    public final void c(boolean z10, boolean z11) {
        s1 s1Var;
        if (getMeasuredWidth() <= 0 || getVisibility() != 0) {
            z11 = false;
        }
        if (!z11) {
            if (this.I != z10) {
                this.I = z10;
                this.J = z10;
                this.F = z10 ? 1.0f : 0.0f;
                requestLayout();
                invalidateOutline();
                return;
            }
            return;
        }
        if (this.K) {
            this.J = z10;
            return;
        }
        if (!z10 || this.I) {
            if (z10 || !this.I) {
                this.F = this.I ? 1.0f : 0.0f;
                this.I = z10;
                this.J = z10;
                requestLayout();
                return;
            }
            this.J = z10;
            float translationX = getTranslationX();
            float translationY = getTranslationY();
            f();
            this.I = false;
            this.K = true;
            requestLayout();
            animate().setListener(null).cancel();
            getViewTreeObserver().addOnPreDrawListener(new q1(this, translationX, translationY));
            return;
        }
        this.I = true;
        this.J = z10;
        f();
        float f10 = this.y;
        if (f10 >= 0.0f) {
            s1Var = this;
            s1Var.e(f10, this.A, (int) (getMeasuredWidth() * 0.23f), (int) (getMeasuredHeight() * 0.23f), false);
        } else {
            s1Var = this;
        }
        s1Var.I = false;
        s1Var.K = true;
        float translationX2 = getTranslationX();
        float translationY2 = getTranslationY();
        setTranslationX(0.0f);
        setTranslationY(0.0f);
        invalidate();
        ValueAnimator valueAnimator = s1Var.W;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(s1Var.F, 1.0f);
        s1Var.W = ofFloat;
        ofFloat.addUpdateListener(s1Var.a0);
        s1Var.W.setDuration(300L);
        s1Var.W.start();
        animate().setListener(null).cancel();
        ViewPropertyAnimator duration = animate().scaleX(0.23f).scaleY(0.23f).translationX(translationX2 - ((getMeasuredWidth() - (getMeasuredWidth() * 0.23f)) / 2.0f)).translationY(translationY2 - ((getMeasuredHeight() - (getMeasuredHeight() * 0.23f)) / 2.0f)).alpha(1.0f).setStartDelay(0L).setDuration(300L);
        er erVar = er.f;
        duration.setInterpolator(erVar).setListener(new p1(this, translationX2, translationY2, 0)).setInterpolator(erVar).start();
    }

    public final void d(float f10, float f11) {
        Object parent = getParent();
        if (this.I && parent != null && ((View) parent).getMeasuredWidth() <= 0 && getMeasuredWidth() != 0 && getMeasuredHeight() != 0) {
            e(f10, f11, getMeasuredWidth(), getMeasuredHeight(), true);
        } else {
            this.y = f10;
            this.A = f11;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        s1 s1Var;
        if (this.S >= 0.0f) {
            if (!this.V) {
                animate().setListener(null).cancel();
            }
            setTranslationX(this.S);
            setTranslationY(this.T);
            if (!this.V) {
                setScaleX(1.0f);
                setScaleY(1.0f);
                setAlpha(1.0f);
            }
            this.S = -1.0f;
            this.T = -1.0f;
        }
        if (this.y < 0.0f || !this.I || getMeasuredWidth() <= 0) {
            s1Var = this;
        } else {
            s1Var = this;
            s1Var.e(this.y, this.A, getMeasuredWidth(), getMeasuredHeight(), false);
            s1Var.y = -1.0f;
            s1Var.A = -1.0f;
        }
        super.dispatchDraw(canvas);
        if (!s1Var.K) {
            boolean z10 = s1Var.I;
            boolean z11 = s1Var.J;
            if (z10 != z11) {
                c(z11, true);
            }
        }
        int measuredWidth = getMeasuredWidth() >> 1;
        int measuredHeight = getMeasuredHeight() - ((int) ((AndroidUtilities.dp(18.0f) * 1.0f) / getScaleY()));
        canvas.save();
        float f10 = measuredWidth;
        float f11 = measuredHeight;
        canvas.scale((1.0f / getScaleX()) * s1Var.F * s1Var.G, (1.0f / getScaleY()) * s1Var.F * s1Var.G, f10, f11);
        canvas.drawCircle(f10, f11, AndroidUtilities.dp(14.0f), s1Var.w);
        Drawable drawable = s1Var.x;
        drawable.setBounds(rl.v(2, measuredWidth, drawable), rl.e(2, measuredHeight, drawable), rl.A(2, measuredWidth, drawable), rl.y(2, measuredHeight, drawable));
        drawable.draw(canvas);
        canvas.restore();
        if (s1Var.K) {
            invalidate();
        }
    }

    public final void e(float f10, float f11, int i10, int i11, boolean z10) {
        Object parent = getParent();
        if (parent == null || !this.I || this.K || !this.N) {
            return;
        }
        float systemWindowInsetTop = this.n == null ? 0.0f : r1.getSystemWindowInsetTop() + this.D;
        float systemWindowInsetBottom = this.n != null ? r3.getSystemWindowInsetBottom() + this.E : 0.0f;
        View view = (View) parent;
        float z11 = com.google.android.recaptcha.internal.a.z((view.getMeasuredWidth() - this.B) - this.C, i10, f10, this.B);
        float z12 = com.google.android.recaptcha.internal.a.z((view.getMeasuredHeight() - systemWindowInsetBottom) - systemWindowInsetTop, i11, f11, systemWindowInsetTop);
        if (z10) {
            animate().setListener(null).cancel();
            animate().scaleX(1.0f).scaleY(1.0f).translationX(z11).translationY(z12).alpha(1.0f).setStartDelay(this.H ? 0L : 150L).setDuration(150L).setInterpolator(er.f).start();
            return;
        }
        if (!this.O) {
            animate().setListener(null).cancel();
            setScaleX(1.0f);
            setScaleY(1.0f);
            animate().alpha(1.0f).setDuration(150L).start();
        }
        setTranslationX(z11);
        setTranslationY(z12);
    }

    public final void f() {
        this.B = AndroidUtilities.dp(16.0f);
        this.C = AndroidUtilities.dp(16.0f);
        this.D = this.H ? AndroidUtilities.dp(60.0f) : AndroidUtilities.dp(16.0f);
        this.E = AndroidUtilities.dp(this.H ? 100.0f : 16.0f) + this.P;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        this.L = false;
        if (this.I) {
            size = (int) (size * 0.23f);
            size2 = (int) (size2 * 0.23f);
            this.L = true;
        } else if (!this.U) {
            setTranslationX(0.0f);
            setTranslationY(0.0f);
        }
        r1 r1Var = this.e0;
        if (r1Var != null) {
            ((tg1) r1Var).b.Z.d(this.F, this.L);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
        if (getMeasuredHeight() != this.f && getMeasuredWidth() != this.h) {
            Path path = this.s;
            path.reset();
            float measuredWidth = getMeasuredWidth();
            float measuredHeight = getMeasuredHeight();
            RectF rectF = this.v;
            rectF.set(0.0f, 0.0f, measuredWidth, measuredHeight);
            path.addRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), Path.Direction.CW);
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
        if (!this.I || this.K || !this.N) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    float x8 = (getX() + motionEvent.getX()) - this.a;
                    float y10 = (getY() + motionEvent.getY()) - this.b;
                    if (!this.e) {
                        float f10 = (y10 * y10) + (x8 * x8);
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
                            x8 = 0.0f;
                            y10 = 0.0f;
                        }
                    }
                    if (this.e) {
                        setTranslationX(this.c + x8);
                        setTranslationY(this.d + y10);
                        return true;
                    }
                }
            }
            if (parent != null && this.I && !this.K) {
                parent.requestDisallowInterceptTouchEvent(false);
                animate().setListener(null).cancel();
                ViewPropertyAnimator startDelay = animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setStartDelay(0L);
                if (this.d0 != null && !this.e && System.currentTimeMillis() - this.f0 < 200) {
                    this.d0.onClick(this);
                }
                int measuredWidth = ((View) getParent()).getMeasuredWidth();
                int measuredHeight = ((View) getParent()).getMeasuredHeight();
                float f12 = this.D;
                float f13 = this.E;
                if (this.n != null) {
                    f12 += r5.getSystemWindowInsetTop();
                    f13 += this.n.getSystemWindowInsetBottom();
                }
                float x10 = getX();
                float f14 = this.B;
                if (x10 < f14) {
                    startDelay.translationX(f14);
                } else if (getX() + getMeasuredWidth() > measuredWidth - this.C) {
                    startDelay.translationX((measuredWidth - getMeasuredWidth()) - this.C);
                }
                if (getY() < f12) {
                    startDelay.translationY(f12);
                } else if (getY() + getMeasuredHeight() > measuredHeight - f13) {
                    startDelay.translationY((measuredHeight - getMeasuredHeight()) - f13);
                }
                startDelay.setDuration(150L).setInterpolator(er.f).start();
            }
            this.e = false;
            return true;
        }
        if (this.I && !this.K) {
            this.f0 = System.currentTimeMillis();
            this.a = getX() + motionEvent.getX();
            this.b = getY() + motionEvent.getY();
            animate().setListener(null).cancel();
            animate().scaleY(1.05f).scaleX(1.05f).alpha(1.0f).setStartDelay(0L).start();
        }
        return true;
    }

    public void setCornerRadius(float f10) {
        this.M = f10;
        invalidateOutline();
    }

    public void setDelegate(r1 r1Var) {
        this.e0 = r1Var;
    }

    public void setInsets(WindowInsets windowInsets) {
        this.n = windowInsets;
    }

    public void setIsActive(boolean z10) {
        this.N = z10;
    }

    public void setOnTapListener(View.OnClickListener onClickListener) {
        this.d0 = onClickListener;
    }

    public void setRelativePosition(s1 s1Var) {
        Object parent = getParent();
        if (parent == null) {
            return;
        }
        float systemWindowInsetTop = this.n == null ? 0.0f : r1.getSystemWindowInsetTop() + this.D;
        View view = (View) parent;
        d(Math.min(1.0f, Math.max(0.0f, (s1Var.getTranslationX() - this.B) / (((view.getMeasuredWidth() - this.B) - this.C) - s1Var.getMeasuredWidth()))), Math.min(1.0f, Math.max(0.0f, (s1Var.getTranslationY() - systemWindowInsetTop) / (((view.getMeasuredHeight() - (this.n == null ? 0.0f : r3.getSystemWindowInsetBottom() + this.E)) - systemWindowInsetTop) - s1Var.getMeasuredHeight()))));
    }

    public void setUiVisible(boolean z10) {
        if (getParent() == null) {
            this.H = z10;
        } else {
            this.H = z10;
        }
    }
}
