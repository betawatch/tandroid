package org.telegram.ui.ActionBar;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.Region;
import android.os.Build;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.a8;
import org.telegram.messenger.camera.CameraView;
import org.telegram.messenger.ks;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.u60;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public abstract class u2 extends FrameLayout implements c6 {
    public float E;
    public boolean F;
    public final Paint G;
    public final /* synthetic */ x2 H;
    public VelocityTracker a;
    public int b;
    public int c;
    public int d;
    public boolean e;
    public boolean f;
    public AnimatorSet h;
    public final e2.r0 n;
    public final Rect r;
    public final Paint s;
    public boolean w;
    public int x;
    public float y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u2(x2 x2Var, Context context) {
        super(context);
        this.H = x2Var;
        this.a = null;
        this.d = -1;
        this.e = false;
        this.f = false;
        this.h = null;
        this.r = new Rect();
        this.s = new Paint();
        this.y = 0.0f;
        this.E = 0.0f;
        this.G = new Paint(1);
        this.n = new e2.r0();
        setWillNotDraw(false);
    }

    public final void a() {
        AnimatorSet animatorSet = this.h;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.h = null;
        }
        this.H.r0();
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void addColorKeys(HashSet hashSet) {
        this.H.E(hashSet);
    }

    public final void b(float f10, float f11) {
        x2 x2Var = this.H;
        int i7 = 0;
        if ((x2Var.b.getTranslationY() >= org.telegram.messenger.g0.a1(false, 0.8f) || (f11 >= 3500.0f && Math.abs(f11) >= Math.abs(f10))) && (f11 >= 0.0f || Math.abs(f11) < 3500.0f)) {
            boolean z10 = x2Var.e0;
            x2Var.e0 = false;
            x2Var.dismiss();
            x2Var.e0 = z10;
            return;
        }
        this.e = false;
        this.h = new AnimatorSet();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new s2(this, 1));
        this.h.playTogether(ObjectAnimator.ofFloat(x2Var.b, "translationY", 0.0f), ofFloat);
        this.h.setDuration((int) ((Math.max(0.0f, r1) / org.telegram.messenger.g0.a1(false, 0.8f)) * 250.0f));
        this.h.setInterpolator(lr.f);
        this.h.addListener(new t2(this, i7));
        ks.e().k(ks.j1, 512);
        this.h.start();
    }

    public final void c(Canvas canvas, float f10) {
        int i7 = Build.VERSION.SDK_INT;
        Paint paint = this.s;
        x2 x2Var = this.H;
        if (i7 >= 26) {
            int i10 = x2Var.G0;
            if (i10 >= 0) {
                paint.setColor(n6.w0(i10, x2Var.J0));
            } else {
                paint.setColor(x2Var.H0);
            }
        } else {
            paint.setColor(-16777216);
        }
        if (!x2Var.W0 || x2Var.b.getVisibility() == 0) {
            boolean z10 = x2Var.n;
            float f11 = 0.0f;
            if ((!z10 || x2Var.S == 0) && x2Var.F0 == 0.0f) {
                return;
            }
            int R = z10 ? x2Var.R() : 0;
            float max = (x2Var.w || (i7 >= 29 && x2.B(x2Var) > 0)) ? x2Var.s ? Math.max(0.0f, Math.min(R - x2Var.F0, x2Var.b.getTranslationY())) : Math.max(0.0f, x2Var.R() - (x2Var.b.getMeasuredHeight() - x2Var.b.getTranslationY())) : 0.0f;
            int alpha = paint.getAlpha();
            if (x2Var.W0) {
                f10 *= x2Var.b.getAlpha();
            }
            int x10 = x2Var.W0 ? (int) x2Var.b.getX() : x2Var.b.getLeft();
            if (f10 < 1.0f) {
                paint.setAlpha((int) (alpha * f10));
            }
            canvas.drawRect(x2Var.u0 + x10, ((getMeasuredHeight() - R) + max) - x2Var.F0, x2Var.b.getRight() - x2Var.u0, getMeasuredHeight() + max, paint);
            paint.setAlpha(alpha);
            int i11 = x2Var.h1;
            if (i11 != 0) {
                paint.setColor(i11);
                int alpha2 = paint.getAlpha();
                float R0 = org.telegram.messenger.g0.R0(R);
                if (f10 < 1.0f) {
                    paint.setAlpha((int) (alpha2 * f10 * R0));
                } else {
                    f11 = max;
                }
                if (paint.getAlpha() > 0) {
                    canvas.drawRect(x10 + x2Var.u0, ((getMeasuredHeight() - R) + f11) - x2Var.F0, x2Var.b.getRight() - x2Var.u0, getMeasuredHeight() + f11, paint);
                }
                paint.setAlpha(alpha2);
            }
        }
    }

    public final boolean d(MotionEvent motionEvent, boolean z10) {
        x2 x2Var = this.H;
        n2 n2Var = x2Var.c;
        int i7 = x2Var.j0;
        if (!x2Var.J) {
            int i10 = 1;
            if (!x2Var.f0(motionEvent)) {
                int i11 = 3;
                int i12 = 2;
                if (x2Var.J(motionEvent) || this.F) {
                    if (motionEvent != null && ((motionEvent.getAction() == 0 || motionEvent.getAction() == 2) && !this.f && !this.e && motionEvent.getPointerCount() == 1)) {
                        this.F = true;
                        this.b = (int) motionEvent.getX();
                        this.c = (int) motionEvent.getY();
                        this.d = motionEvent.getPointerId(0);
                        this.e = true;
                        a();
                    } else if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.d) {
                        float x10 = motionEvent.getX() - this.b;
                        float y10 = motionEvent.getY() - this.c;
                        if (this.a == null) {
                            this.a = VelocityTracker.obtain();
                        }
                        this.a.addMovement(motionEvent);
                        if (!x2Var.E0 && this.e && !this.f && x10 > 0.0f && x10 / 3.0f > Math.abs(y10) && Math.abs(x10) >= i7) {
                            this.b = (int) motionEvent.getX();
                            this.e = false;
                            this.f = true;
                        } else if (this.f) {
                            float f10 = this.E + x10;
                            this.E = f10;
                            x2Var.b.setTranslationX(Math.max(f10, 0.0f));
                            this.b = (int) motionEvent.getX();
                            n2Var.invalidate();
                        }
                    } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.d && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
                        if (this.a == null) {
                            this.a = VelocityTracker.obtain();
                        }
                        float xVelocity = this.a.getXVelocity();
                        float yVelocity = this.a.getYVelocity();
                        if (this.E >= x2Var.b.getMeasuredWidth() / 3.0f || (xVelocity >= 3500.0f && xVelocity >= yVelocity)) {
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.E, getMeasuredWidth());
                            ofFloat.addUpdateListener(new s2(this, i11));
                            ofFloat.addListener(new t2(this, i12));
                            lr lrVar = lr.h;
                            ofFloat.setInterpolator(lrVar);
                            ofFloat.setDuration(320L);
                            ofFloat.start();
                            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
                            ofFloat2.addUpdateListener(new s2(this, 4));
                            ofFloat2.setInterpolator(lrVar);
                            ofFloat2.setDuration(320L);
                            ofFloat2.start();
                        } else {
                            float max = Math.max(this.E, 0.0f);
                            this.E = max;
                            ValueAnimator ofFloat3 = ValueAnimator.ofFloat(max, 0.0f);
                            ofFloat3.addUpdateListener(new s2(this, i12));
                            ofFloat3.addListener(new t2(this, i10));
                            ofFloat3.setInterpolator(lr.f);
                            ofFloat3.setDuration(220L);
                            ofFloat3.start();
                        }
                        this.e = false;
                        this.f = false;
                        this.d = -1;
                        this.F = false;
                    }
                } else if (x2Var.I() && motionEvent != null && ((motionEvent.getAction() == 0 || motionEvent.getAction() == 2) && !this.f && !this.e && motionEvent.getPointerCount() == 1)) {
                    this.b = (int) motionEvent.getX();
                    int y11 = (int) motionEvent.getY();
                    this.c = y11;
                    if (x2Var.Y(this.b, y11)) {
                        x2Var.o0();
                        return true;
                    }
                    this.d = motionEvent.getPointerId(0);
                    this.e = true;
                    a();
                    VelocityTracker velocityTracker = this.a;
                    if (velocityTracker != null) {
                        velocityTracker.clear();
                    }
                } else if (x2Var.G() && motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.d) {
                    if (this.a == null) {
                        this.a = VelocityTracker.obtain();
                    }
                    float abs = Math.abs((int) (motionEvent.getX() - this.b));
                    float y12 = ((int) motionEvent.getY()) - this.c;
                    this.a.addMovement(motionEvent);
                    if (!x2Var.E0 && this.e && !this.f && y12 > 0.0f && y12 / 3.0f > Math.abs(abs) && Math.abs(y12) >= i7) {
                        this.c = (int) motionEvent.getY();
                        this.e = false;
                        this.f = true;
                        requestDisallowInterceptTouchEvent(true);
                    } else if (this.f) {
                        float f11 = this.y + y12;
                        this.y = f11;
                        float max2 = Math.max(f11, 0.0f);
                        this.y = max2;
                        x2Var.b.setTranslationY(Math.max(max2, 0.0f));
                        x2Var.h0();
                        this.c = (int) motionEvent.getY();
                        n2Var.invalidate();
                    }
                } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.d && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
                    if (this.a == null) {
                        this.a = VelocityTracker.obtain();
                    }
                    this.a.computeCurrentVelocity(1000);
                    if (this.f || this.y > 0.0f) {
                        b(this.a.getXVelocity(), this.a.getYVelocity());
                    } else {
                        this.e = false;
                    }
                    this.f = false;
                    VelocityTracker velocityTracker2 = this.a;
                    if (velocityTracker2 != null) {
                        velocityTracker2.recycle();
                        this.a = null;
                    }
                    this.d = -1;
                }
                if ((z10 || !this.e) && !this.f && (x2Var.G() || x2Var.J(motionEvent))) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void dispatchDraw(Canvas canvas) {
        Paint paint;
        int i7;
        Point point;
        int i10;
        x2 x2Var = this.H;
        if (x2Var.b != null && this.x > 0) {
            int i11 = x2Var.d1;
            Paint paint2 = this.G;
            paint2.setColor(i11);
            canvas.drawRect(0.0f, (x2Var.b.getTranslationY() + (getMeasuredHeight() - this.x)) - 1.0f, getMeasuredWidth(), x2Var.b.getTranslationY() + getMeasuredHeight(), paint2);
        }
        int i12 = Build.VERSION.SDK_INT;
        Paint paint3 = this.s;
        if (i12 >= 26) {
            int i13 = x2Var.G0;
            if (i13 >= 0) {
                paint3.setColor(n6.w0(i13, x2Var.J0));
            } else {
                paint3.setColor(x2Var.H0);
            }
        } else {
            paint3.setColor(-16777216);
        }
        if (x2Var.s && !x2Var.H0()) {
            c(canvas, 1.0f);
        }
        if (paint3.getAlpha() >= 255 || !x2Var.n) {
            super.dispatchDraw(canvas);
        } else {
            float f10 = 0.0f;
            if (x2Var.w || (i12 >= 29 && x2.B(x2Var) > 0)) {
                f10 = Math.max(0.0f, x2Var.R() - (x2Var.b.getMeasuredHeight() - x2Var.b.getTranslationY()));
            }
            int R = x2Var.n ? x2Var.R() : 0;
            canvas.save();
            canvas.clipRect(x2Var.b.getLeft() + x2Var.u0, ((getMeasuredHeight() - R) + f10) - x2Var.F0, x2Var.b.getRight() - x2Var.u0, getMeasuredHeight() + f10, Region.Op.DIFFERENCE);
            super.dispatchDraw(canvas);
            canvas.restore();
        }
        if (x2Var.r) {
            if ((getMeasuredHeight() - x2Var.b.getY()) - x2Var.b.getMeasuredHeight() > org.telegram.messenger.g0.L(48.0f)) {
                int i14 = x2Var.b0;
                paint3.setColor(i14 >= 0 ? n6.w0(i14, x2Var.J0) : 0);
                canvas.drawRect(x2Var.b.getLeft() + x2Var.u0, x2Var.b.getMeasuredHeight() + x2Var.b.getY(), x2Var.b.getRight() - x2Var.u0, getMeasuredHeight(), paint3);
                return;
            }
            return;
        }
        if (!x2Var.H0()) {
            c(canvas, x2Var.s ? x2Var.D0 * 0.7f : 1.0f);
        }
        if (x2Var.n && (i10 = x2Var.U) != 0 && i10 > x2Var.T && x2Var.V) {
            Point point2 = org.telegram.messenger.g0.q;
            if (point2.x > point2.y) {
                paint = paint3;
                canvas.drawRect(x2Var.b.getRight() - x2Var.u0, x2Var.b.getTranslationY(), x2Var.b.getRight() + x2Var.U, getMeasuredHeight(), paint);
                if (x2Var.n && (i7 = x2Var.T) != 0 && i7 > x2Var.U && x2Var.V) {
                    point = org.telegram.messenger.g0.q;
                    if (point.x > point.y) {
                        canvas.drawRect(0.0f, x2Var.b.getTranslationY(), x2Var.b.getLeft() + x2Var.u0, getMeasuredHeight(), paint);
                    }
                }
                if (x2Var.b.getY() + x2Var.b.getMeasuredHeight() >= getMeasuredHeight()) {
                    int i15 = x2Var.b0;
                    paint.setColor(i15 >= 0 ? n6.w0(i15, x2Var.J0) : 0);
                    canvas.drawRect(x2Var.b.getLeft() + x2Var.u0, x2Var.b.getMeasuredHeight() + x2Var.b.getY(), x2Var.b.getRight() - x2Var.u0, getMeasuredHeight(), paint);
                    return;
                }
                return;
            }
        }
        paint = paint3;
        if (x2Var.n) {
            point = org.telegram.messenger.g0.q;
            if (point.x > point.y) {
            }
        }
        if (x2Var.b.getY() + x2Var.b.getMeasuredHeight() >= getMeasuredHeight()) {
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j3) {
        if (!(view instanceof CameraView)) {
            return super.drawChild(canvas, view, j3);
        }
        if (this.H.H0()) {
            c(canvas, 1.0f);
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.n.b();
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        boolean z10;
        Paint paint = this.s;
        int alpha = paint.getAlpha();
        x2 x2Var = this.H;
        if (alpha >= 255 || !x2Var.n) {
            canvas2 = canvas;
            z10 = false;
        } else {
            float f10 = 0.0f;
            if (x2Var.w || (Build.VERSION.SDK_INT >= 29 && x2.B(x2Var) > 0)) {
                f10 = Math.max(0.0f, x2Var.R() - (x2Var.b.getMeasuredHeight() - x2Var.b.getTranslationY()));
            }
            int R = x2Var.n ? x2Var.R() : 0;
            canvas.save();
            canvas.clipRect(x2Var.b.getLeft() + x2Var.u0, ((getMeasuredHeight() - R) + f10) - x2Var.F0, x2Var.b.getRight() - x2Var.u0, getMeasuredHeight() + f10, Region.Op.DIFFERENCE);
            canvas2 = canvas;
            z10 = true;
        }
        super.onDraw(canvas2);
        if (x2Var.n && x2Var.h != null && x2Var.f != 0) {
            int i7 = x2Var.b0;
            paint.setColor(i7 >= 0 ? n6.w0(i7, x2Var.J0) : 0);
            canvas2.drawRect(x2Var.b.getLeft() + x2Var.u0, (getMeasuredHeight() - x2Var.f) - (x2Var.n ? x2Var.R() : 0), x2Var.b.getRight() - x2Var.u0, getMeasuredHeight() - (x2Var.n ? x2Var.R() : 0), paint);
        }
        x2Var.d0();
        if (z10) {
            canvas2.restore();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        x2 x2Var = this.H;
        return (x2Var.G() || x2Var.J(motionEvent)) ? d(motionEvent, true) : super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01aa  */
    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        int i13;
        int i14;
        j6.o oVar;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23 = i12 - this.x;
        x2 x2Var = this.H;
        x2Var.e0();
        int i24 = 1;
        x2Var.I--;
        ViewGroup viewGroup = x2Var.b;
        int i25 = 0;
        if (viewGroup != null) {
            int measuredHeight = (i23 - i10) - viewGroup.getMeasuredHeight();
            if (x2Var.h != null) {
                i21 = x2Var.T() + i7;
                i22 = i11 - x2Var.U();
                if (x2Var.G) {
                    measuredHeight = 0;
                } else if (!x2Var.x) {
                    measuredHeight = (int) (measuredHeight - (((1.0f - x2Var.T0) * x2Var.h.getSystemWindowInsetBottom()) - (x2Var.n ? 0 : x2Var.R())));
                    if (Build.VERSION.SDK_INT >= 29) {
                        measuredHeight -= x2.B(x2Var);
                    }
                }
            } else {
                i21 = i7;
                i22 = i11;
            }
            int measuredWidth = ((i22 - i21) - x2Var.b.getMeasuredWidth()) / 2;
            if (x2Var.h != null) {
                measuredWidth += x2Var.T();
            }
            if ((x2Var.Q0 && x2Var.H == null && this.w && !x2Var.J && (!x2Var.R0 ? x2Var.b.getTop() != measuredHeight : x2Var.b.getBottom() != x2Var.b.getMeasuredHeight() + measuredHeight)) || (x2Var.i1 > 0 && System.currentTimeMillis() < x2Var.i1)) {
                x2Var.b.setTranslationY(x2Var.R0 ? r7.getBottom() - (x2Var.b.getMeasuredHeight() + measuredHeight) : r7.getTop() - measuredHeight);
                x2Var.h0();
                x2Var.q0(x2Var.b.getTranslationY());
                ValueAnimator valueAnimator = x2Var.P0;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(x2Var.b.getTranslationY(), 0.0f);
                x2Var.P0 = ofFloat;
                ofFloat.addUpdateListener(new s2(this, i25));
                x2Var.P0.addListener(new t2(this, 3));
                x2Var.P0.setDuration(250L).setInterpolator(j1.w);
                x2Var.P0.start();
                x2Var.i1 = -1L;
            }
            ViewGroup viewGroup2 = x2Var.b;
            viewGroup2.layout(measuredWidth, measuredHeight, viewGroup2.getMeasuredWidth() + measuredWidth, x2Var.b.getMeasuredHeight() + measuredHeight);
            i13 = i21;
            i14 = i22;
        } else {
            i13 = i7;
            i14 = i11;
        }
        int childCount = getChildCount();
        int i26 = 0;
        while (i26 < childCount) {
            View childAt = getChildAt(i26);
            if (childAt.getVisibility() != 8 && childAt != x2Var.b) {
                if (!x2Var.k0(childAt, i13, i10, i14, i23 - (x2Var.n ? x2Var.R() : 0))) {
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                    int measuredWidth2 = childAt.getMeasuredWidth();
                    int measuredHeight2 = childAt.getMeasuredHeight();
                    int i27 = layoutParams.gravity;
                    if (i27 == -1) {
                        i27 = 51;
                    }
                    int i28 = i27 & ks.x1;
                    int i29 = i27 & 7;
                    if (i29 == i24) {
                        i15 = (((i14 - i13) - measuredWidth2) / 2) + layoutParams.leftMargin;
                        i16 = layoutParams.rightMargin;
                    } else if (i29 != 5) {
                        i17 = layoutParams.leftMargin;
                        if (i28 != 16) {
                            i18 = (((i23 - i10) - measuredHeight2) / 2) + layoutParams.topMargin;
                            i19 = layoutParams.bottomMargin;
                        } else if (i28 != 80) {
                            i20 = layoutParams.topMargin;
                            if (x2Var.h != null) {
                                i17 += x2Var.T();
                            }
                            childAt.layout(i17, i20, measuredWidth2 + i17, measuredHeight2 + i20);
                        } else {
                            i18 = (i23 - i10) - measuredHeight2;
                            i19 = layoutParams.bottomMargin;
                        }
                        i20 = i18 - i19;
                        if (x2Var.h != null) {
                        }
                        childAt.layout(i17, i20, measuredWidth2 + i17, measuredHeight2 + i20);
                    } else {
                        i15 = i14 - measuredWidth2;
                        i16 = layoutParams.rightMargin;
                    }
                    i17 = i15 - i16;
                    if (i28 != 16) {
                    }
                    i20 = i18 - i19;
                    if (x2Var.h != null) {
                    }
                    childAt.layout(i17, i20, measuredWidth2 + i17, measuredHeight2 + i20);
                }
            }
            i26++;
            i24 = 1;
        }
        if (x2Var.I == 0 && (oVar = x2Var.H) != null && !x2Var.E) {
            org.telegram.messenger.g0.r(oVar);
            x2Var.H.run();
            x2Var.H = null;
        }
        if (x2Var.E && x2Var.d) {
            j6.o oVar2 = x2Var.H;
            if (oVar2 != null) {
                org.telegram.messenger.g0.r(oVar2);
                x2Var.H.run();
            }
            x2Var.E = false;
        }
        this.w = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00f6, code lost:
    
        if (r3 > (org.telegram.messenger.g0.L(10.0f) + org.telegram.messenger.g0.n)) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x018c  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i7, int i10) {
        int i11;
        ViewGroup viewGroup;
        int childCount;
        int makeMeasureSpec;
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i10);
        View rootView = getRootView();
        Rect rect = this.r;
        getWindowVisibleDisplayFrame(rect);
        x2 x2Var = this.H;
        int i12 = x2Var.f;
        if (rect.bottom == 0 || rect.top == 0) {
            x2Var.f = 0;
        } else {
            int max = Math.max(0, ((int) com.google.android.gms.internal.vision.e2.t(1.0f, x2Var.T0, org.telegram.messenger.g0.q1(rootView), rootView.getHeight() - (rect.top != 0 ? (1.0f - x2Var.T0) * org.telegram.messenger.g0.m : 0.0f))) - (rect.bottom - rect.top));
            x2Var.f = max;
            if (max < org.telegram.messenger.g0.L(20.0f)) {
                x2Var.f = 0;
            } else {
                x2Var.e = x2Var.f;
            }
            x2Var.S -= x2Var.f;
        }
        int i13 = x2Var.f;
        if (i12 != i13) {
            this.w = true;
        }
        x2Var.d = i13 > org.telegram.messenger.g0.L(20.0f);
        WindowInsets windowInsets = x2Var.h;
        if (windowInsets != null) {
            x2Var.S = windowInsets.getSystemWindowInsetBottom();
            x2Var.T = x2Var.h.getSystemWindowInsetLeft();
            x2Var.U = x2Var.h.getSystemWindowInsetRight();
            if (Build.VERSION.SDK_INT >= 29) {
                x2Var.S += x2.B(x2Var);
            }
            if (x2Var.d && rect.bottom != 0 && rect.top != 0) {
                x2Var.S -= x2Var.f;
            }
            if (!x2Var.n && !x2Var.x && !x2Var.y) {
                i11 = size2 - x2Var.R();
                this.x = size2 - i11;
                setMeasuredDimension(size, size2);
                if (x2Var.h != null && !x2Var.x) {
                    int systemWindowInsetBottom = (int) ((1.0f - x2Var.T0) * r3.getSystemWindowInsetBottom());
                    if (Build.VERSION.SDK_INT >= 29) {
                        systemWindowInsetBottom += x2.B(x2Var);
                    }
                    if (x2Var.y) {
                    }
                    size2 -= systemWindowInsetBottom;
                    Math.min(systemWindowInsetBottom, org.telegram.messenger.g0.n);
                }
                int i14 = size2;
                if (x2Var.h != null) {
                    size -= x2Var.T() + x2Var.U();
                }
                int i15 = size;
                x2Var.K0 = i15 < i14;
                viewGroup = x2Var.b;
                if (viewGroup != null) {
                    if (x2Var.V) {
                        viewGroup.measure(View.MeasureSpec.makeMeasureSpec((x2Var.u0 * 2) + i15, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i14, TLObject.FLAG_31));
                    } else {
                        if (org.telegram.messenger.g0.Q1()) {
                            float L = org.telegram.messenger.g0.L(500.0f);
                            Point point = org.telegram.messenger.g0.q;
                            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec((x2Var.u0 * 2) + ((int) Math.min(L, Math.min(point.x, point.y) * 0.8f)), TLObject.FLAG_30);
                        } else {
                            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec((x2Var.u0 * 2) + (x2Var.K0 ? i15 : (int) Math.max(i15 * 0.8f, Math.min(org.telegram.messenger.g0.L(480.0f), i15))), TLObject.FLAG_30);
                        }
                        x2Var.b.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(i14, TLObject.FLAG_31));
                    }
                }
                childCount = getChildCount();
                for (int i16 = 0; i16 < childCount; i16++) {
                    View childAt = getChildAt(i16);
                    if (childAt.getVisibility() != 8 && childAt != x2Var.b) {
                        if (childAt instanceof u60) {
                            measureChildWithMargins(childAt, View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_30), 0, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), 0);
                        } else if (!x2Var.l0(childAt, i15, i14)) {
                            measureChildWithMargins(childAt, View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_30), 0, View.MeasureSpec.makeMeasureSpec(i14, TLObject.FLAG_30), 0);
                        }
                    }
                }
            }
        }
        i11 = size2;
        this.x = size2 - i11;
        setMeasuredDimension(size, size2);
        if (x2Var.h != null) {
            int systemWindowInsetBottom2 = (int) ((1.0f - x2Var.T0) * r3.getSystemWindowInsetBottom());
            if (Build.VERSION.SDK_INT >= 29) {
            }
            if (x2Var.y) {
            }
            size2 -= systemWindowInsetBottom2;
            Math.min(systemWindowInsetBottom2, org.telegram.messenger.g0.n);
        }
        int i142 = size2;
        if (x2Var.h != null) {
        }
        int i152 = size;
        x2Var.K0 = i152 < i142;
        viewGroup = x2Var.b;
        if (viewGroup != null) {
        }
        childCount = getChildCount();
        while (i16 < childCount) {
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f10, float f11) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i7, int i10, int[] iArr) {
        x2 x2Var = this.H;
        if (x2Var.J || !x2Var.r0) {
            return;
        }
        a();
        float translationY = x2Var.b.getTranslationY();
        if (translationY <= 0.0f || i10 <= 0) {
            return;
        }
        float f10 = translationY - i10;
        iArr[1] = i10;
        x2Var.b.setTranslationY(f10 >= 0.0f ? f10 : 0.0f);
        x2Var.h0();
        x2Var.c.invalidate();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i7, int i10, int i11, int i12) {
        x2 x2Var = this.H;
        if (x2Var.J || !x2Var.r0) {
            return;
        }
        a();
        if (i12 != 0) {
            float translationY = x2Var.b.getTranslationY() - i12;
            if (translationY < 0.0f) {
                translationY = 0.0f;
            }
            x2Var.b.setTranslationY(translationY);
            x2Var.h0();
            x2Var.c.invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i7) {
        this.n.a = i7;
        x2 x2Var = this.H;
        if (x2Var.J || !x2Var.r0) {
            return;
        }
        a();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i7) {
        x2 x2Var = this.H;
        return !x2Var.J && x2Var.r0 && i7 == 2 && !x2Var.G();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        this.n.a = 0;
        x2 x2Var = this.H;
        if (x2Var.J || !x2Var.r0) {
            return;
        }
        b(0.0f, 0.0f);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return d(motionEvent, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        if (this.e && !this.f) {
            d(null, false);
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void updateColors() {
        x2 x2Var = this.H;
        try {
            x2.A(x2Var);
        } catch (Exception e10) {
            a8.g(e10, true);
        }
        x2Var.s0();
    }
}
