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
import nh.e5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.sl;
import org.telegram.ui.ih1;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class s1 extends FrameLayout {
    public float B;
    public float C;
    public float D;
    public float E;
    public float F;
    public float G;
    public float H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public boolean M;
    public float N;
    public boolean O;
    public boolean P;
    public int Q;
    public float R;
    public float S;
    public float T;
    public float U;
    public boolean V;
    public boolean W;
    public float a;
    public ValueAnimator a0;
    public float b;
    public final eg.b1 b0;
    public float c;
    public ValueAnimator c0;
    public float d;
    public final e5 d0;
    public boolean e;
    public View.OnClickListener e0;
    public int f;
    public r1 f0;
    public long g0;
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
        this.B = -1.0f;
        this.G = 0.0f;
        this.H = 0.0f;
        this.N = -1.0f;
        this.O = true;
        this.b0 = new eg.b1(this, 9);
        this.d0 = new e5(this, 7);
        this.r = ViewConfiguration.get(activity).getScaledTouchSlop();
        setOutlineProvider(new sl(this, 3));
        setClipToOutline(true);
        paint.setColor(i0.a.k(-16777216, 102));
        this.x = activity.getDrawable(R.drawable.calls_mute_mini);
    }

    public final void a() {
        f();
        float f10 = this.R;
        if (f10 < 0.0f || this.L) {
            return;
        }
        e(f10, this.S, getMeasuredWidth(), getMeasuredHeight(), true);
        this.R = -1.0f;
        this.S = -1.0f;
    }

    public final void b() {
        if (getMeasuredWidth() <= 0 || this.y >= 0.0f) {
            this.R = -1.0f;
            this.S = -1.0f;
            return;
        }
        Object parent = getParent();
        if (parent == null) {
            return;
        }
        float systemWindowInsetTop = this.n == null ? 0.0f : r2.getSystemWindowInsetTop() + this.E;
        float systemWindowInsetBottom = this.n == null ? 0.0f : r3.getSystemWindowInsetBottom() + this.F;
        View view = (View) parent;
        this.R = (getTranslationX() - this.C) / (((view.getMeasuredWidth() - this.C) - this.D) - getMeasuredWidth());
        this.S = (getTranslationY() - systemWindowInsetTop) / (((view.getMeasuredHeight() - systemWindowInsetBottom) - systemWindowInsetTop) - getMeasuredHeight());
        this.R = Math.max(0.0f, Math.min(1.0f, this.R));
        this.S = Math.max(0.0f, Math.min(1.0f, this.S));
    }

    public final void c(boolean z4, boolean z10) {
        s1 s1Var;
        if (getMeasuredWidth() <= 0 || getVisibility() != 0) {
            z10 = false;
        }
        if (!z10) {
            if (this.J != z4) {
                this.J = z4;
                this.K = z4;
                this.G = z4 ? 1.0f : 0.0f;
                requestLayout();
                invalidateOutline();
                return;
            }
            return;
        }
        if (this.L) {
            this.K = z4;
            return;
        }
        if (!z4 || this.J) {
            if (z4 || !this.J) {
                this.G = this.J ? 1.0f : 0.0f;
                this.J = z4;
                this.K = z4;
                requestLayout();
                return;
            }
            this.K = z4;
            float translationX = getTranslationX();
            float translationY = getTranslationY();
            f();
            this.J = false;
            this.L = true;
            requestLayout();
            animate().setListener(null).cancel();
            getViewTreeObserver().addOnPreDrawListener(new q1(this, translationX, translationY));
            return;
        }
        this.J = true;
        this.K = z4;
        f();
        float f10 = this.y;
        if (f10 >= 0.0f) {
            s1Var = this;
            s1Var.e(f10, this.B, (int) (getMeasuredWidth() * 0.23f), (int) (getMeasuredHeight() * 0.23f), false);
        } else {
            s1Var = this;
        }
        s1Var.J = false;
        s1Var.L = true;
        float translationX2 = getTranslationX();
        float translationY2 = getTranslationY();
        setTranslationX(0.0f);
        setTranslationY(0.0f);
        invalidate();
        ValueAnimator valueAnimator = s1Var.a0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(s1Var.G, 1.0f);
        s1Var.a0 = ofFloat;
        ofFloat.addUpdateListener(s1Var.b0);
        s1Var.a0.setDuration(300L);
        s1Var.a0.start();
        animate().setListener(null).cancel();
        ViewPropertyAnimator duration = animate().scaleX(0.23f).scaleY(0.23f).translationX(translationX2 - ((getMeasuredWidth() - (getMeasuredWidth() * 0.23f)) / 2.0f)).translationY(translationY2 - ((getMeasuredHeight() - (getMeasuredHeight() * 0.23f)) / 2.0f)).alpha(1.0f).setStartDelay(0L).setDuration(300L);
        nr nrVar = nr.f;
        duration.setInterpolator(nrVar).setListener(new p1(this, translationX2, translationY2, 0)).setInterpolator(nrVar).start();
    }

    public final void d(float f10, float f11) {
        Object parent = getParent();
        if (this.J && parent != null && ((View) parent).getMeasuredWidth() <= 0 && getMeasuredWidth() != 0 && getMeasuredHeight() != 0) {
            e(f10, f11, getMeasuredWidth(), getMeasuredHeight(), true);
        } else {
            this.y = f10;
            this.B = f11;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        s1 s1Var;
        if (this.T >= 0.0f) {
            if (!this.W) {
                animate().setListener(null).cancel();
            }
            setTranslationX(this.T);
            setTranslationY(this.U);
            if (!this.W) {
                setScaleX(1.0f);
                setScaleY(1.0f);
                setAlpha(1.0f);
            }
            this.T = -1.0f;
            this.U = -1.0f;
        }
        if (this.y < 0.0f || !this.J || getMeasuredWidth() <= 0) {
            s1Var = this;
        } else {
            s1Var = this;
            s1Var.e(this.y, this.B, getMeasuredWidth(), getMeasuredHeight(), false);
            s1Var.y = -1.0f;
            s1Var.B = -1.0f;
        }
        super.dispatchDraw(canvas);
        if (!s1Var.L) {
            boolean z4 = s1Var.J;
            boolean z10 = s1Var.K;
            if (z4 != z10) {
                c(z10, true);
            }
        }
        int measuredWidth = getMeasuredWidth() >> 1;
        int measuredHeight = getMeasuredHeight() - ((int) ((AndroidUtilities.dp(18.0f) * 1.0f) / getScaleY()));
        canvas.save();
        float f10 = measuredWidth;
        float f11 = measuredHeight;
        canvas.scale((1.0f / getScaleX()) * s1Var.G * s1Var.H, (1.0f / getScaleY()) * s1Var.G * s1Var.H, f10, f11);
        canvas.drawCircle(f10, f11, AndroidUtilities.dp(14.0f), s1Var.w);
        Drawable drawable = s1Var.x;
        drawable.setBounds(org.telegram.ui.b.u(2, measuredWidth, drawable), org.telegram.ui.b.f(2, measuredHeight, drawable), org.telegram.ui.b.A(2, measuredWidth, drawable), org.telegram.ui.b.y(2, measuredHeight, drawable));
        drawable.draw(canvas);
        canvas.restore();
        if (s1Var.L) {
            invalidate();
        }
    }

    public final void e(float f10, float f11, int i10, int i11, boolean z4) {
        Object parent = getParent();
        if (parent == null || !this.J || this.L || !this.O) {
            return;
        }
        float systemWindowInsetTop = this.n == null ? 0.0f : r1.getSystemWindowInsetTop() + this.E;
        float systemWindowInsetBottom = this.n != null ? r3.getSystemWindowInsetBottom() + this.F : 0.0f;
        View view = (View) parent;
        float w10 = e2.c.w((view.getMeasuredWidth() - this.C) - this.D, i10, f10, this.C);
        float w11 = e2.c.w((view.getMeasuredHeight() - systemWindowInsetBottom) - systemWindowInsetTop, i11, f11, systemWindowInsetTop);
        if (z4) {
            animate().setListener(null).cancel();
            animate().scaleX(1.0f).scaleY(1.0f).translationX(w10).translationY(w11).alpha(1.0f).setStartDelay(this.I ? 0L : 150L).setDuration(150L).setInterpolator(nr.f).start();
            return;
        }
        if (!this.P) {
            animate().setListener(null).cancel();
            setScaleX(1.0f);
            setScaleY(1.0f);
            animate().alpha(1.0f).setDuration(150L).start();
        }
        setTranslationX(w10);
        setTranslationY(w11);
    }

    public final void f() {
        this.C = AndroidUtilities.dp(16.0f);
        this.D = AndroidUtilities.dp(16.0f);
        this.E = this.I ? AndroidUtilities.dp(60.0f) : AndroidUtilities.dp(16.0f);
        this.F = AndroidUtilities.dp(this.I ? 100.0f : 16.0f) + this.Q;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        this.M = false;
        if (this.J) {
            size = (int) (size * 0.23f);
            size2 = (int) (size2 * 0.23f);
            this.M = true;
        } else if (!this.V) {
            setTranslationX(0.0f);
            setTranslationY(0.0f);
        }
        r1 r1Var = this.f0;
        if (r1Var != null) {
            ((ih1) r1Var).b.a0.d(this.G, this.M);
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
        if (!this.J || this.L || !this.O) {
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
            if (parent != null && this.J && !this.L) {
                parent.requestDisallowInterceptTouchEvent(false);
                animate().setListener(null).cancel();
                ViewPropertyAnimator startDelay = animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setStartDelay(0L);
                if (this.e0 != null && !this.e && System.currentTimeMillis() - this.g0 < 200) {
                    this.e0.onClick(this);
                }
                int measuredWidth = ((View) getParent()).getMeasuredWidth();
                int measuredHeight = ((View) getParent()).getMeasuredHeight();
                float f12 = this.E;
                float f13 = this.F;
                if (this.n != null) {
                    f12 += r5.getSystemWindowInsetTop();
                    f13 += this.n.getSystemWindowInsetBottom();
                }
                float x11 = getX();
                float f14 = this.C;
                if (x11 < f14) {
                    startDelay.translationX(f14);
                } else if (getX() + getMeasuredWidth() > measuredWidth - this.D) {
                    startDelay.translationX((measuredWidth - getMeasuredWidth()) - this.D);
                }
                if (getY() < f12) {
                    startDelay.translationY(f12);
                } else if (getY() + getMeasuredHeight() > measuredHeight - f13) {
                    startDelay.translationY((measuredHeight - getMeasuredHeight()) - f13);
                }
                startDelay.setDuration(150L).setInterpolator(nr.f).start();
            }
            this.e = false;
            return true;
        }
        if (this.J && !this.L) {
            this.g0 = System.currentTimeMillis();
            this.a = getX() + motionEvent.getX();
            this.b = getY() + motionEvent.getY();
            animate().setListener(null).cancel();
            animate().scaleY(1.05f).scaleX(1.05f).alpha(1.0f).setStartDelay(0L).start();
        }
        return true;
    }

    public void setCornerRadius(float f10) {
        this.N = f10;
        invalidateOutline();
    }

    public void setDelegate(r1 r1Var) {
        this.f0 = r1Var;
    }

    public void setInsets(WindowInsets windowInsets) {
        this.n = windowInsets;
    }

    public void setIsActive(boolean z4) {
        this.O = z4;
    }

    public void setOnTapListener(View.OnClickListener onClickListener) {
        this.e0 = onClickListener;
    }

    public void setRelativePosition(s1 s1Var) {
        Object parent = getParent();
        if (parent == null) {
            return;
        }
        float systemWindowInsetTop = this.n == null ? 0.0f : r1.getSystemWindowInsetTop() + this.E;
        View view = (View) parent;
        d(Math.min(1.0f, Math.max(0.0f, (s1Var.getTranslationX() - this.C) / (((view.getMeasuredWidth() - this.C) - this.D) - s1Var.getMeasuredWidth()))), Math.min(1.0f, Math.max(0.0f, (s1Var.getTranslationY() - systemWindowInsetTop) / (((view.getMeasuredHeight() - (this.n == null ? 0.0f : r3.getSystemWindowInsetBottom() + this.F)) - systemWindowInsetTop) - s1Var.getMeasuredHeight()))));
    }

    public void setUiVisible(boolean z4) {
        if (getParent() == null) {
            this.I = z4;
        } else {
            this.I = z4;
        }
    }
}
