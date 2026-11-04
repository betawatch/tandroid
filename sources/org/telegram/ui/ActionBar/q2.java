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
import org.telegram.messenger.hs;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.d60;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public abstract class q2 extends FrameLayout implements z5 {
    public float E;
    public boolean F;
    public final Paint G;
    public final /* synthetic */ t2 H;
    public VelocityTracker a;
    public int b;
    public int c;
    public int d;
    public boolean e;
    public boolean f;
    public AnimatorSet h;
    public final d2.t0 n;
    public final Rect r;
    public final Paint s;
    public boolean w;
    public int x;
    public float y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q2(t2 t2Var, Context context) {
        super(context);
        this.H = t2Var;
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
        this.n = new d2.t0();
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

    @Override // org.telegram.ui.ActionBar.z5
    public final void addColorKeys(HashSet hashSet) {
        this.H.D(hashSet);
    }

    public final void b(float f10, float f11) {
        t2 t2Var = this.H;
        int i3 = 0;
        if ((t2Var.b.getTranslationY() >= org.telegram.messenger.g0.a1(false, 0.8f) || (f11 >= 3500.0f && Math.abs(f11) >= Math.abs(f10))) && (f11 >= 0.0f || Math.abs(f11) < 3500.0f)) {
            boolean z10 = t2Var.e0;
            t2Var.e0 = false;
            t2Var.dismiss();
            t2Var.e0 = z10;
            return;
        }
        this.e = false;
        this.h = new AnimatorSet();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new o2(this, 1));
        this.h.playTogether(ObjectAnimator.ofFloat(t2Var.b, "translationY", 0.0f), ofFloat);
        this.h.setDuration((int) ((Math.max(0.0f, r1) / org.telegram.messenger.g0.a1(false, 0.8f)) * 250.0f));
        this.h.setInterpolator(xq.f);
        this.h.addListener(new p2(this, i3));
        hs.e().k(hs.j1, 512);
        this.h.start();
    }

    public final void c(Canvas canvas, float f10) {
        int i3 = Build.VERSION.SDK_INT;
        Paint paint = this.s;
        t2 t2Var = this.H;
        if (i3 >= 26) {
            int i10 = t2Var.G0;
            if (i10 >= 0) {
                paint.setColor(k6.w0(i10, t2Var.J0));
            } else {
                paint.setColor(t2Var.H0);
            }
        } else {
            paint.setColor(-16777216);
        }
        if (!t2Var.W0 || t2Var.b.getVisibility() == 0) {
            boolean z10 = t2Var.n;
            float f11 = 0.0f;
            if ((!z10 || t2Var.S == 0) && t2Var.F0 == 0.0f) {
                return;
            }
            int Q = z10 ? t2Var.Q() : 0;
            float max = (t2Var.w || (i3 >= 29 && t2.B(t2Var) > 0)) ? t2Var.s ? Math.max(0.0f, Math.min(Q - t2Var.F0, t2Var.b.getTranslationY())) : Math.max(0.0f, t2Var.Q() - (t2Var.b.getMeasuredHeight() - t2Var.b.getTranslationY())) : 0.0f;
            int alpha = paint.getAlpha();
            if (t2Var.W0) {
                f10 *= t2Var.b.getAlpha();
            }
            int x10 = t2Var.W0 ? (int) t2Var.b.getX() : t2Var.b.getLeft();
            if (f10 < 1.0f) {
                paint.setAlpha((int) (alpha * f10));
            }
            canvas.drawRect(t2Var.u0 + x10, ((getMeasuredHeight() - Q) + max) - t2Var.F0, t2Var.b.getRight() - t2Var.u0, getMeasuredHeight() + max, paint);
            paint.setAlpha(alpha);
            int i11 = t2Var.e1;
            if (i11 != 0) {
                paint.setColor(i11);
                int alpha2 = paint.getAlpha();
                float R0 = org.telegram.messenger.g0.R0(Q);
                if (f10 < 1.0f) {
                    paint.setAlpha((int) (alpha2 * f10 * R0));
                } else {
                    f11 = max;
                }
                if (paint.getAlpha() > 0) {
                    canvas.drawRect(x10 + t2Var.u0, ((getMeasuredHeight() - Q) + f11) - t2Var.F0, t2Var.b.getRight() - t2Var.u0, getMeasuredHeight() + f11, paint);
                }
                paint.setAlpha(alpha2);
            }
        }
    }

    public final boolean d(MotionEvent motionEvent, boolean z10) {
        t2 t2Var = this.H;
        j2 j2Var = t2Var.c;
        int i3 = t2Var.j0;
        if (!t2Var.J) {
            int i10 = 1;
            if (!t2Var.f0(motionEvent)) {
                int i11 = 3;
                int i12 = 2;
                if (t2Var.I(motionEvent) || this.F) {
                    if (motionEvent != null && ((motionEvent.getAction() == 0 || motionEvent.getAction() == 2) && !this.f && !this.e && motionEvent.getPointerCount() == 1)) {
                        this.F = true;
                        this.b = (int) motionEvent.getX();
                        this.c = (int) motionEvent.getY();
                        this.d = motionEvent.getPointerId(0);
                        this.e = true;
                        a();
                    } else if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.d) {
                        float x10 = motionEvent.getX() - this.b;
                        float y9 = motionEvent.getY() - this.c;
                        if (this.a == null) {
                            this.a = VelocityTracker.obtain();
                        }
                        this.a.addMovement(motionEvent);
                        if (!t2Var.E0 && this.e && !this.f && x10 > 0.0f && x10 / 3.0f > Math.abs(y9) && Math.abs(x10) >= i3) {
                            this.b = (int) motionEvent.getX();
                            this.e = false;
                            this.f = true;
                        } else if (this.f) {
                            float f10 = this.E + x10;
                            this.E = f10;
                            t2Var.b.setTranslationX(Math.max(f10, 0.0f));
                            this.b = (int) motionEvent.getX();
                            j2Var.invalidate();
                        }
                    } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.d && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
                        if (this.a == null) {
                            this.a = VelocityTracker.obtain();
                        }
                        float xVelocity = this.a.getXVelocity();
                        float yVelocity = this.a.getYVelocity();
                        if (this.E >= t2Var.b.getMeasuredWidth() / 3.0f || (xVelocity >= 3500.0f && xVelocity >= yVelocity)) {
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.E, getMeasuredWidth());
                            ofFloat.addUpdateListener(new o2(this, i11));
                            ofFloat.addListener(new p2(this, i12));
                            xq xqVar = xq.h;
                            ofFloat.setInterpolator(xqVar);
                            ofFloat.setDuration(320L);
                            ofFloat.start();
                            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
                            ofFloat2.addUpdateListener(new o2(this, 4));
                            ofFloat2.setInterpolator(xqVar);
                            ofFloat2.setDuration(320L);
                            ofFloat2.start();
                        } else {
                            float max = Math.max(this.E, 0.0f);
                            this.E = max;
                            ValueAnimator ofFloat3 = ValueAnimator.ofFloat(max, 0.0f);
                            ofFloat3.addUpdateListener(new o2(this, i12));
                            ofFloat3.addListener(new p2(this, i10));
                            ofFloat3.setInterpolator(xq.f);
                            ofFloat3.setDuration(220L);
                            ofFloat3.start();
                        }
                        this.e = false;
                        this.f = false;
                        this.d = -1;
                        this.F = false;
                    }
                } else if (t2Var.H() && motionEvent != null && ((motionEvent.getAction() == 0 || motionEvent.getAction() == 2) && !this.f && !this.e && motionEvent.getPointerCount() == 1)) {
                    this.b = (int) motionEvent.getX();
                    int y10 = (int) motionEvent.getY();
                    this.c = y10;
                    if (t2Var.X(this.b, y10)) {
                        t2Var.o0();
                        return true;
                    }
                    this.d = motionEvent.getPointerId(0);
                    this.e = true;
                    a();
                    VelocityTracker velocityTracker = this.a;
                    if (velocityTracker != null) {
                        velocityTracker.clear();
                    }
                } else if (t2Var.G() && motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.d) {
                    if (this.a == null) {
                        this.a = VelocityTracker.obtain();
                    }
                    float abs = Math.abs((int) (motionEvent.getX() - this.b));
                    float y11 = ((int) motionEvent.getY()) - this.c;
                    this.a.addMovement(motionEvent);
                    if (!t2Var.E0 && this.e && !this.f && y11 > 0.0f && y11 / 3.0f > Math.abs(abs) && Math.abs(y11) >= i3) {
                        this.c = (int) motionEvent.getY();
                        this.e = false;
                        this.f = true;
                        requestDisallowInterceptTouchEvent(true);
                    } else if (this.f) {
                        float f11 = this.y + y11;
                        this.y = f11;
                        float max2 = Math.max(f11, 0.0f);
                        this.y = max2;
                        t2Var.b.setTranslationY(Math.max(max2, 0.0f));
                        t2Var.h0();
                        this.c = (int) motionEvent.getY();
                        j2Var.invalidate();
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
                if ((z10 || !this.e) && !this.f && (t2Var.G() || t2Var.I(motionEvent))) {
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
        int i3;
        Point point;
        int i10;
        t2 t2Var = this.H;
        if (t2Var.b != null && this.x > 0) {
            int i11 = t2Var.a1;
            Paint paint2 = this.G;
            paint2.setColor(i11);
            canvas.drawRect(0.0f, (t2Var.b.getTranslationY() + (getMeasuredHeight() - this.x)) - 1.0f, getMeasuredWidth(), t2Var.b.getTranslationY() + getMeasuredHeight(), paint2);
        }
        int i12 = Build.VERSION.SDK_INT;
        Paint paint3 = this.s;
        if (i12 >= 26) {
            int i13 = t2Var.G0;
            if (i13 >= 0) {
                paint3.setColor(k6.w0(i13, t2Var.J0));
            } else {
                paint3.setColor(t2Var.H0);
            }
        } else {
            paint3.setColor(-16777216);
        }
        if (t2Var.s && !t2Var.H0()) {
            c(canvas, 1.0f);
        }
        if (paint3.getAlpha() >= 255 || !t2Var.n) {
            super.dispatchDraw(canvas);
        } else {
            float f10 = 0.0f;
            if (t2Var.w || (i12 >= 29 && t2.B(t2Var) > 0)) {
                f10 = Math.max(0.0f, t2Var.Q() - (t2Var.b.getMeasuredHeight() - t2Var.b.getTranslationY()));
            }
            int Q = t2Var.n ? t2Var.Q() : 0;
            canvas.save();
            canvas.clipRect(t2Var.b.getLeft() + t2Var.u0, ((getMeasuredHeight() - Q) + f10) - t2Var.F0, t2Var.b.getRight() - t2Var.u0, getMeasuredHeight() + f10, Region.Op.DIFFERENCE);
            super.dispatchDraw(canvas);
            canvas.restore();
        }
        if (t2Var.r) {
            if ((getMeasuredHeight() - t2Var.b.getY()) - t2Var.b.getMeasuredHeight() > org.telegram.messenger.g0.L(48.0f)) {
                int i14 = t2Var.b0;
                paint3.setColor(i14 >= 0 ? k6.w0(i14, t2Var.J0) : 0);
                canvas.drawRect(t2Var.b.getLeft() + t2Var.u0, t2Var.b.getMeasuredHeight() + t2Var.b.getY(), t2Var.b.getRight() - t2Var.u0, getMeasuredHeight(), paint3);
                return;
            }
            return;
        }
        if (!t2Var.H0()) {
            c(canvas, t2Var.s ? t2Var.D0 * 0.7f : 1.0f);
        }
        if (t2Var.n && (i10 = t2Var.U) != 0 && i10 > t2Var.T && t2Var.V) {
            Point point2 = org.telegram.messenger.g0.q;
            if (point2.x > point2.y) {
                paint = paint3;
                canvas.drawRect(t2Var.b.getRight() - t2Var.u0, t2Var.b.getTranslationY(), t2Var.b.getRight() + t2Var.U, getMeasuredHeight(), paint);
                if (t2Var.n && (i3 = t2Var.T) != 0 && i3 > t2Var.U && t2Var.V) {
                    point = org.telegram.messenger.g0.q;
                    if (point.x > point.y) {
                        canvas.drawRect(0.0f, t2Var.b.getTranslationY(), t2Var.b.getLeft() + t2Var.u0, getMeasuredHeight(), paint);
                    }
                }
                if (t2Var.b.getY() + t2Var.b.getMeasuredHeight() >= getMeasuredHeight()) {
                    int i15 = t2Var.b0;
                    paint.setColor(i15 >= 0 ? k6.w0(i15, t2Var.J0) : 0);
                    canvas.drawRect(t2Var.b.getLeft() + t2Var.u0, t2Var.b.getMeasuredHeight() + t2Var.b.getY(), t2Var.b.getRight() - t2Var.u0, getMeasuredHeight(), paint);
                    return;
                }
                return;
            }
        }
        paint = paint3;
        if (t2Var.n) {
            point = org.telegram.messenger.g0.q;
            if (point.x > point.y) {
            }
        }
        if (t2Var.b.getY() + t2Var.b.getMeasuredHeight() >= getMeasuredHeight()) {
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j10) {
        if (!(view instanceof CameraView)) {
            return super.drawChild(canvas, view, j10);
        }
        if (this.H.H0()) {
            c(canvas, 1.0f);
        }
        return super.drawChild(canvas, view, j10);
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
        t2 t2Var = this.H;
        if (alpha >= 255 || !t2Var.n) {
            canvas2 = canvas;
            z10 = false;
        } else {
            float f10 = 0.0f;
            if (t2Var.w || (Build.VERSION.SDK_INT >= 29 && t2.B(t2Var) > 0)) {
                f10 = Math.max(0.0f, t2Var.Q() - (t2Var.b.getMeasuredHeight() - t2Var.b.getTranslationY()));
            }
            int Q = t2Var.n ? t2Var.Q() : 0;
            canvas.save();
            canvas.clipRect(t2Var.b.getLeft() + t2Var.u0, ((getMeasuredHeight() - Q) + f10) - t2Var.F0, t2Var.b.getRight() - t2Var.u0, getMeasuredHeight() + f10, Region.Op.DIFFERENCE);
            canvas2 = canvas;
            z10 = true;
        }
        super.onDraw(canvas2);
        if (t2Var.n && t2Var.h != null && t2Var.f != 0) {
            int i3 = t2Var.b0;
            paint.setColor(i3 >= 0 ? k6.w0(i3, t2Var.J0) : 0);
            canvas2.drawRect(t2Var.b.getLeft() + t2Var.u0, (getMeasuredHeight() - t2Var.f) - (t2Var.n ? t2Var.Q() : 0), t2Var.b.getRight() - t2Var.u0, getMeasuredHeight() - (t2Var.n ? t2Var.Q() : 0), paint);
        }
        t2Var.d0();
        if (z10) {
            canvas2.restore();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        t2 t2Var = this.H;
        return (t2Var.G() || t2Var.I(motionEvent)) ? d(motionEvent, true) : super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01aa  */
    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        int i13;
        int i14;
        mi.b0 b0Var;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23 = i12 - this.x;
        t2 t2Var = this.H;
        t2Var.e0();
        int i24 = 1;
        t2Var.I--;
        ViewGroup viewGroup = t2Var.b;
        int i25 = 0;
        if (viewGroup != null) {
            int measuredHeight = (i23 - i10) - viewGroup.getMeasuredHeight();
            if (t2Var.h != null) {
                i21 = t2Var.S() + i3;
                i22 = i11 - t2Var.T();
                if (t2Var.G) {
                    measuredHeight = 0;
                } else if (!t2Var.x) {
                    measuredHeight = (int) (measuredHeight - (((1.0f - t2Var.T0) * t2Var.h.getSystemWindowInsetBottom()) - (t2Var.n ? 0 : t2Var.Q())));
                    if (Build.VERSION.SDK_INT >= 29) {
                        measuredHeight -= t2.B(t2Var);
                    }
                }
            } else {
                i21 = i3;
                i22 = i11;
            }
            int measuredWidth = ((i22 - i21) - t2Var.b.getMeasuredWidth()) / 2;
            if (t2Var.h != null) {
                measuredWidth += t2Var.S();
            }
            if ((t2Var.Q0 && t2Var.H == null && this.w && !t2Var.J && (!t2Var.R0 ? t2Var.b.getTop() != measuredHeight : t2Var.b.getBottom() != t2Var.b.getMeasuredHeight() + measuredHeight)) || (t2Var.f1 > 0 && System.currentTimeMillis() < t2Var.f1)) {
                t2Var.b.setTranslationY(t2Var.R0 ? r7.getBottom() - (t2Var.b.getMeasuredHeight() + measuredHeight) : r7.getTop() - measuredHeight);
                t2Var.h0();
                t2Var.q0(t2Var.b.getTranslationY());
                ValueAnimator valueAnimator = t2Var.P0;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(t2Var.b.getTranslationY(), 0.0f);
                t2Var.P0 = ofFloat;
                ofFloat.addUpdateListener(new o2(this, i25));
                t2Var.P0.addListener(new p2(this, 3));
                t2Var.P0.setDuration(250L).setInterpolator(h1.w);
                t2Var.P0.start();
                t2Var.f1 = -1L;
            }
            ViewGroup viewGroup2 = t2Var.b;
            viewGroup2.layout(measuredWidth, measuredHeight, viewGroup2.getMeasuredWidth() + measuredWidth, t2Var.b.getMeasuredHeight() + measuredHeight);
            i13 = i21;
            i14 = i22;
        } else {
            i13 = i3;
            i14 = i11;
        }
        int childCount = getChildCount();
        int i26 = 0;
        while (i26 < childCount) {
            View childAt = getChildAt(i26);
            if (childAt.getVisibility() != 8 && childAt != t2Var.b) {
                if (!t2Var.k0(childAt, i13, i10, i14, i23 - (t2Var.n ? t2Var.Q() : 0))) {
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                    int measuredWidth2 = childAt.getMeasuredWidth();
                    int measuredHeight2 = childAt.getMeasuredHeight();
                    int i27 = layoutParams.gravity;
                    if (i27 == -1) {
                        i27 = 51;
                    }
                    int i28 = i27 & hs.x1;
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
                            if (t2Var.h != null) {
                                i17 += t2Var.S();
                            }
                            childAt.layout(i17, i20, measuredWidth2 + i17, measuredHeight2 + i20);
                        } else {
                            i18 = (i23 - i10) - measuredHeight2;
                            i19 = layoutParams.bottomMargin;
                        }
                        i20 = i18 - i19;
                        if (t2Var.h != null) {
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
                    if (t2Var.h != null) {
                    }
                    childAt.layout(i17, i20, measuredWidth2 + i17, measuredHeight2 + i20);
                }
            }
            i26++;
            i24 = 1;
        }
        if (t2Var.I == 0 && (b0Var = t2Var.H) != null && !t2Var.E) {
            org.telegram.messenger.g0.r(b0Var);
            t2Var.H.run();
            t2Var.H = null;
        }
        if (t2Var.E && t2Var.d) {
            mi.b0 b0Var2 = t2Var.H;
            if (b0Var2 != null) {
                org.telegram.messenger.g0.r(b0Var2);
                t2Var.H.run();
            }
            t2Var.E = false;
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
    public final void onMeasure(int i3, int i10) {
        int i11;
        ViewGroup viewGroup;
        int childCount;
        int makeMeasureSpec;
        int size = View.MeasureSpec.getSize(i3);
        int size2 = View.MeasureSpec.getSize(i10);
        View rootView = getRootView();
        Rect rect = this.r;
        getWindowVisibleDisplayFrame(rect);
        t2 t2Var = this.H;
        int i12 = t2Var.f;
        if (rect.bottom == 0 || rect.top == 0) {
            t2Var.f = 0;
        } else {
            int max = Math.max(0, ((int) a1.g.D(1.0f, t2Var.T0, org.telegram.messenger.g0.q1(rootView), rootView.getHeight() - (rect.top != 0 ? (1.0f - t2Var.T0) * org.telegram.messenger.g0.m : 0.0f))) - (rect.bottom - rect.top));
            t2Var.f = max;
            if (max < org.telegram.messenger.g0.L(20.0f)) {
                t2Var.f = 0;
            } else {
                t2Var.e = t2Var.f;
            }
            t2Var.S -= t2Var.f;
        }
        int i13 = t2Var.f;
        if (i12 != i13) {
            this.w = true;
        }
        t2Var.d = i13 > org.telegram.messenger.g0.L(20.0f);
        WindowInsets windowInsets = t2Var.h;
        if (windowInsets != null) {
            t2Var.S = windowInsets.getSystemWindowInsetBottom();
            t2Var.T = t2Var.h.getSystemWindowInsetLeft();
            t2Var.U = t2Var.h.getSystemWindowInsetRight();
            if (Build.VERSION.SDK_INT >= 29) {
                t2Var.S += t2.B(t2Var);
            }
            if (t2Var.d && rect.bottom != 0 && rect.top != 0) {
                t2Var.S -= t2Var.f;
            }
            if (!t2Var.n && !t2Var.x && !t2Var.y) {
                i11 = size2 - t2Var.Q();
                this.x = size2 - i11;
                setMeasuredDimension(size, size2);
                if (t2Var.h != null && !t2Var.x) {
                    int systemWindowInsetBottom = (int) ((1.0f - t2Var.T0) * r3.getSystemWindowInsetBottom());
                    if (Build.VERSION.SDK_INT >= 29) {
                        systemWindowInsetBottom += t2.B(t2Var);
                    }
                    if (t2Var.y) {
                    }
                    size2 -= systemWindowInsetBottom;
                    Math.min(systemWindowInsetBottom, org.telegram.messenger.g0.n);
                }
                int i14 = size2;
                if (t2Var.h != null) {
                    size -= t2Var.S() + t2Var.T();
                }
                int i15 = size;
                t2Var.K0 = i15 < i14;
                viewGroup = t2Var.b;
                if (viewGroup != null) {
                    if (t2Var.V) {
                        viewGroup.measure(View.MeasureSpec.makeMeasureSpec((t2Var.u0 * 2) + i15, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i14, TLObject.FLAG_31));
                    } else {
                        if (org.telegram.messenger.g0.Q1()) {
                            float L = org.telegram.messenger.g0.L(500.0f);
                            Point point = org.telegram.messenger.g0.q;
                            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec((t2Var.u0 * 2) + ((int) Math.min(L, Math.min(point.x, point.y) * 0.8f)), TLObject.FLAG_30);
                        } else {
                            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec((t2Var.u0 * 2) + (t2Var.K0 ? i15 : (int) Math.max(i15 * 0.8f, Math.min(org.telegram.messenger.g0.L(480.0f), i15))), TLObject.FLAG_30);
                        }
                        t2Var.b.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(i14, TLObject.FLAG_31));
                    }
                }
                childCount = getChildCount();
                for (int i16 = 0; i16 < childCount; i16++) {
                    View childAt = getChildAt(i16);
                    if (childAt.getVisibility() != 8 && childAt != t2Var.b) {
                        if (childAt instanceof d60) {
                            measureChildWithMargins(childAt, View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_30), 0, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), 0);
                        } else if (!t2Var.l0(childAt, i15, i14)) {
                            measureChildWithMargins(childAt, View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_30), 0, View.MeasureSpec.makeMeasureSpec(i14, TLObject.FLAG_30), 0);
                        }
                    }
                }
            }
        }
        i11 = size2;
        this.x = size2 - i11;
        setMeasuredDimension(size, size2);
        if (t2Var.h != null) {
            int systemWindowInsetBottom2 = (int) ((1.0f - t2Var.T0) * r3.getSystemWindowInsetBottom());
            if (Build.VERSION.SDK_INT >= 29) {
            }
            if (t2Var.y) {
            }
            size2 -= systemWindowInsetBottom2;
            Math.min(systemWindowInsetBottom2, org.telegram.messenger.g0.n);
        }
        int i142 = size2;
        if (t2Var.h != null) {
        }
        int i152 = size;
        t2Var.K0 = i152 < i142;
        viewGroup = t2Var.b;
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
    public final void onNestedPreScroll(View view, int i3, int i10, int[] iArr) {
        t2 t2Var = this.H;
        if (t2Var.J || !t2Var.r0) {
            return;
        }
        a();
        float translationY = t2Var.b.getTranslationY();
        if (translationY <= 0.0f || i10 <= 0) {
            return;
        }
        float f10 = translationY - i10;
        iArr[1] = i10;
        t2Var.b.setTranslationY(f10 >= 0.0f ? f10 : 0.0f);
        t2Var.h0();
        t2Var.c.invalidate();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i3, int i10, int i11, int i12) {
        t2 t2Var = this.H;
        if (t2Var.J || !t2Var.r0) {
            return;
        }
        a();
        if (i12 != 0) {
            float translationY = t2Var.b.getTranslationY() - i12;
            if (translationY < 0.0f) {
                translationY = 0.0f;
            }
            t2Var.b.setTranslationY(translationY);
            t2Var.h0();
            t2Var.c.invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i3) {
        this.n.a = i3;
        t2 t2Var = this.H;
        if (t2Var.J || !t2Var.r0) {
            return;
        }
        a();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i3) {
        t2 t2Var = this.H;
        return !t2Var.J && t2Var.r0 && i3 == 2 && !t2Var.G();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        this.n.a = 0;
        t2 t2Var = this.H;
        if (t2Var.J || !t2Var.r0) {
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

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        t2 t2Var = this.H;
        try {
            t2.A(t2Var);
        } catch (Exception e10) {
            a8.g(e10, true);
        }
        t2Var.s0();
    }
}
