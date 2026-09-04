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
import bi.u5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.wl;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.pr;
import org.telegram.ui.ci1;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class s1 extends FrameLayout {
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
    public final u5 e0;
    public int f;
    public ValueAnimator f0;
    public final ki.a g0;
    public int h;
    public View.OnClickListener h0;
    public r1 i0;
    public long j0;
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
        this.E = -1.0f;
        this.J = 0.0f;
        this.K = 0.0f;
        this.Q = -1.0f;
        this.R = true;
        this.e0 = new u5(this, 10);
        int i10 = 4;
        this.g0 = new ki.a(this, i10);
        this.r = ViewConfiguration.get(activity).getScaledTouchSlop();
        setOutlineProvider(new dh.b(this, i10));
        setClipToOutline(true);
        paint.setColor(i0.a.k(-16777216, 102));
        this.x = activity.getDrawable(R.drawable.calls_mute_mini);
    }

    public final void a() {
        f();
        float f7 = this.U;
        if (f7 < 0.0f || this.O) {
            return;
        }
        e(f7, this.V, getMeasuredWidth(), getMeasuredHeight(), true);
        this.U = -1.0f;
        this.V = -1.0f;
    }

    public final void b() {
        if (getMeasuredWidth() <= 0 || this.y >= 0.0f) {
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

    public final void c(boolean z10, boolean z11) {
        s1 s1Var;
        if (getMeasuredWidth() <= 0 || getVisibility() != 0) {
            z11 = false;
        }
        if (!z11) {
            if (this.M != z10) {
                this.M = z10;
                this.N = z10;
                this.J = z10 ? 1.0f : 0.0f;
                requestLayout();
                invalidateOutline();
                return;
            }
            return;
        }
        if (this.O) {
            this.N = z10;
            return;
        }
        if (!z10 || this.M) {
            if (z10 || !this.M) {
                this.J = this.M ? 1.0f : 0.0f;
                this.M = z10;
                this.N = z10;
                requestLayout();
                return;
            }
            this.N = z10;
            float translationX = getTranslationX();
            float translationY = getTranslationY();
            f();
            this.M = false;
            this.O = true;
            requestLayout();
            animate().setListener(null).cancel();
            getViewTreeObserver().addOnPreDrawListener(new q1(this, translationX, translationY));
            return;
        }
        this.M = true;
        this.N = z10;
        f();
        float f7 = this.y;
        if (f7 >= 0.0f) {
            s1Var = this;
            s1Var.e(f7, this.E, (int) (getMeasuredWidth() * 0.23f), (int) (getMeasuredHeight() * 0.23f), false);
        } else {
            s1Var = this;
        }
        s1Var.M = false;
        s1Var.O = true;
        float translationX2 = getTranslationX();
        float translationY2 = getTranslationY();
        setTranslationX(0.0f);
        setTranslationY(0.0f);
        invalidate();
        ValueAnimator valueAnimator = s1Var.d0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(s1Var.J, 1.0f);
        s1Var.d0 = ofFloat;
        ofFloat.addUpdateListener(s1Var.e0);
        s1Var.d0.setDuration(300L);
        s1Var.d0.start();
        animate().setListener(null).cancel();
        ViewPropertyAnimator duration = animate().scaleX(0.23f).scaleY(0.23f).translationX(translationX2 - ((getMeasuredWidth() - (getMeasuredWidth() * 0.23f)) / 2.0f)).translationY(translationY2 - ((getMeasuredHeight() - (getMeasuredHeight() * 0.23f)) / 2.0f)).alpha(1.0f).setStartDelay(0L).setDuration(300L);
        pr prVar = pr.f;
        duration.setInterpolator(prVar).setListener(new le.c(this, translationX2, translationY2, 1)).setInterpolator(prVar).start();
    }

    public final void d(float f7, float f10) {
        Object parent = getParent();
        if (this.M && parent != null && ((View) parent).getMeasuredWidth() <= 0 && getMeasuredWidth() != 0 && getMeasuredHeight() != 0) {
            e(f7, f10, getMeasuredWidth(), getMeasuredHeight(), true);
        } else {
            this.y = f7;
            this.E = f10;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        s1 s1Var;
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
        if (this.y < 0.0f || !this.M || getMeasuredWidth() <= 0) {
            s1Var = this;
        } else {
            s1Var = this;
            s1Var.e(this.y, this.E, getMeasuredWidth(), getMeasuredHeight(), false);
            s1Var.y = -1.0f;
            s1Var.E = -1.0f;
        }
        super.dispatchDraw(canvas);
        if (!s1Var.O) {
            boolean z10 = s1Var.M;
            boolean z11 = s1Var.N;
            if (z10 != z11) {
                c(z11, true);
            }
        }
        int measuredWidth = getMeasuredWidth() >> 1;
        int measuredHeight = getMeasuredHeight() - ((int) ((AndroidUtilities.dp(18.0f) * 1.0f) / getScaleY()));
        canvas.save();
        float f7 = measuredWidth;
        float f10 = measuredHeight;
        canvas.scale((1.0f / getScaleX()) * s1Var.J * s1Var.K, (1.0f / getScaleY()) * s1Var.J * s1Var.K, f7, f10);
        canvas.drawCircle(f7, f10, AndroidUtilities.dp(14.0f), s1Var.w);
        Drawable drawable = s1Var.x;
        drawable.setBounds(wl.w(2, measuredWidth, drawable), wl.e(2, measuredHeight, drawable), wl.B(2, measuredWidth, drawable), wl.z(2, measuredHeight, drawable));
        drawable.draw(canvas);
        canvas.restore();
        if (s1Var.O) {
            invalidate();
        }
    }

    public final void e(float f7, float f10, int i10, int i11, boolean z10) {
        Object parent = getParent();
        if (parent == null || !this.M || this.O || !this.R) {
            return;
        }
        float systemWindowInsetTop = this.n == null ? 0.0f : r1.getSystemWindowInsetTop() + this.H;
        float systemWindowInsetBottom = this.n != null ? r3.getSystemWindowInsetBottom() + this.I : 0.0f;
        View view = (View) parent;
        float z11 = com.google.android.gms.internal.vision.e2.z((view.getMeasuredWidth() - this.F) - this.G, i10, f7, this.F);
        float z12 = com.google.android.gms.internal.vision.e2.z((view.getMeasuredHeight() - systemWindowInsetBottom) - systemWindowInsetTop, i11, f10, systemWindowInsetTop);
        if (z10) {
            animate().setListener(null).cancel();
            animate().scaleX(1.0f).scaleY(1.0f).translationX(z11).translationY(z12).alpha(1.0f).setStartDelay(this.L ? 0L : 150L).setDuration(150L).setInterpolator(pr.f).start();
            return;
        }
        if (!this.S) {
            animate().setListener(null).cancel();
            setScaleX(1.0f);
            setScaleY(1.0f);
            animate().alpha(1.0f).setDuration(150L).start();
        }
        setTranslationX(z11);
        setTranslationY(z12);
    }

    public final void f() {
        this.F = AndroidUtilities.dp(16.0f);
        this.G = AndroidUtilities.dp(16.0f);
        this.H = this.L ? AndroidUtilities.dp(60.0f) : AndroidUtilities.dp(16.0f);
        this.I = AndroidUtilities.dp(this.L ? 100.0f : 16.0f) + this.T;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        this.P = false;
        if (this.M) {
            size = (int) (size * 0.23f);
            size2 = (int) (size2 * 0.23f);
            this.P = true;
        } else if (!this.b0) {
            setTranslationX(0.0f);
            setTranslationY(0.0f);
        }
        r1 r1Var = this.i0;
        if (r1Var != null) {
            ((ci1) r1Var).b.d0.d(this.J, this.P);
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
        if (!this.M || this.O || !this.R) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    float x10 = (getX() + motionEvent.getX()) - this.a;
                    float y3 = (getY() + motionEvent.getY()) - this.b;
                    if (!this.e) {
                        float f7 = (y3 * y3) + (x10 * x10);
                        float f10 = this.r;
                        if (f7 > f10 * f10) {
                            if (parent != null) {
                                parent.requestDisallowInterceptTouchEvent(true);
                            }
                            this.e = true;
                            this.a = getX() + motionEvent.getX();
                            this.b = getY() + motionEvent.getY();
                            this.c = getTranslationX();
                            this.d = getTranslationY();
                            x10 = 0.0f;
                            y3 = 0.0f;
                        }
                    }
                    if (this.e) {
                        setTranslationX(this.c + x10);
                        setTranslationY(this.d + y3);
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
                float f11 = this.H;
                float f12 = this.I;
                if (this.n != null) {
                    f11 += r5.getSystemWindowInsetTop();
                    f12 += this.n.getSystemWindowInsetBottom();
                }
                float x11 = getX();
                float f13 = this.F;
                if (x11 < f13) {
                    startDelay.translationX(f13);
                } else if (getX() + getMeasuredWidth() > measuredWidth - this.G) {
                    startDelay.translationX((measuredWidth - getMeasuredWidth()) - this.G);
                }
                if (getY() < f11) {
                    startDelay.translationY(f11);
                } else if (getY() + getMeasuredHeight() > measuredHeight - f12) {
                    startDelay.translationY((measuredHeight - getMeasuredHeight()) - f12);
                }
                startDelay.setDuration(150L).setInterpolator(pr.f).start();
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

    public void setCornerRadius(float f7) {
        this.Q = f7;
        invalidateOutline();
    }

    public void setDelegate(r1 r1Var) {
        this.i0 = r1Var;
    }

    public void setInsets(WindowInsets windowInsets) {
        this.n = windowInsets;
    }

    public void setIsActive(boolean z10) {
        this.R = z10;
    }

    public void setOnTapListener(View.OnClickListener onClickListener) {
        this.h0 = onClickListener;
    }

    public void setRelativePosition(s1 s1Var) {
        Object parent = getParent();
        if (parent == null) {
            return;
        }
        float systemWindowInsetTop = this.n == null ? 0.0f : r1.getSystemWindowInsetTop() + this.H;
        View view = (View) parent;
        d(Math.min(1.0f, Math.max(0.0f, (s1Var.getTranslationX() - this.F) / (((view.getMeasuredWidth() - this.F) - this.G) - s1Var.getMeasuredWidth()))), Math.min(1.0f, Math.max(0.0f, (s1Var.getTranslationY() - systemWindowInsetTop) / (((view.getMeasuredHeight() - (this.n == null ? 0.0f : r3.getSystemWindowInsetBottom() + this.I)) - systemWindowInsetTop) - s1Var.getMeasuredHeight()))));
    }

    public void setUiVisible(boolean z10) {
        if (getParent() == null) {
            this.L = z10;
        } else {
            this.L = z10;
        }
    }
}
