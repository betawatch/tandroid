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
import org.telegram.messenger.qs;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.i60;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public abstract class s2 extends FrameLayout implements a6 {
    public float D;
    public boolean E;
    public final Paint F;
    public final /* synthetic */ v2 G;
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
    public s2(v2 v2Var, Context context) {
        super(context);
        this.G = v2Var;
        this.a = null;
        this.d = -1;
        this.e = false;
        this.f = false;
        this.h = null;
        this.r = new Rect();
        this.s = new Paint();
        this.y = 0.0f;
        this.D = 0.0f;
        this.F = new Paint(1);
        this.n = new e2.r0();
        setWillNotDraw(false);
    }

    public final void a() {
        AnimatorSet animatorSet = this.h;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.h = null;
        }
        this.G.r0();
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final void addColorKeys(HashSet hashSet) {
        this.G.D(hashSet);
    }

    public final void b(float f10, float f11) {
        v2 v2Var = this.G;
        int i7 = 0;
        if ((v2Var.b.getTranslationY() >= org.telegram.messenger.g0.a1(false, 0.8f) || (f11 >= 3500.0f && Math.abs(f11) >= Math.abs(f10))) && (f11 >= 0.0f || Math.abs(f11) < 3500.0f)) {
            boolean z9 = v2Var.d0;
            v2Var.d0 = false;
            v2Var.dismiss();
            v2Var.d0 = z9;
            return;
        }
        this.e = false;
        this.h = new AnimatorSet();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new q2(this, 1));
        this.h.playTogether(ObjectAnimator.ofFloat(v2Var.b, "translationY", 0.0f), ofFloat);
        this.h.setDuration((int) ((Math.max(0.0f, r1) / org.telegram.messenger.g0.a1(false, 0.8f)) * 250.0f));
        this.h.setInterpolator(xq.f);
        this.h.addListener(new r2(this, i7));
        qs.e().k(qs.j1, 512);
        this.h.start();
    }

    public final void c(Canvas canvas, float f10) {
        int i7 = Build.VERSION.SDK_INT;
        Paint paint = this.s;
        v2 v2Var = this.G;
        if (i7 >= 26) {
            int i10 = v2Var.F0;
            if (i10 >= 0) {
                paint.setColor(k6.w0(i10, v2Var.I0));
            } else {
                paint.setColor(v2Var.G0);
            }
        } else {
            paint.setColor(-16777216);
        }
        if (!v2Var.V0 || v2Var.b.getVisibility() == 0) {
            boolean z9 = v2Var.n;
            float f11 = 0.0f;
            if ((!z9 || v2Var.R == 0) && v2Var.E0 == 0.0f) {
                return;
            }
            int Q = z9 ? v2Var.Q() : 0;
            float max = (v2Var.w || (i7 >= 29 && v2.B(v2Var) > 0)) ? v2Var.s ? Math.max(0.0f, Math.min(Q - v2Var.E0, v2Var.b.getTranslationY())) : Math.max(0.0f, v2Var.Q() - (v2Var.b.getMeasuredHeight() - v2Var.b.getTranslationY())) : 0.0f;
            int alpha = paint.getAlpha();
            if (v2Var.V0) {
                f10 *= v2Var.b.getAlpha();
            }
            int x10 = v2Var.V0 ? (int) v2Var.b.getX() : v2Var.b.getLeft();
            if (f10 < 1.0f) {
                paint.setAlpha((int) (alpha * f10));
            }
            canvas.drawRect(v2Var.t0 + x10, ((getMeasuredHeight() - Q) + max) - v2Var.E0, v2Var.b.getRight() - v2Var.t0, getMeasuredHeight() + max, paint);
            paint.setAlpha(alpha);
            int i11 = v2Var.d1;
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
                    canvas.drawRect(x10 + v2Var.t0, ((getMeasuredHeight() - Q) + f11) - v2Var.E0, v2Var.b.getRight() - v2Var.t0, getMeasuredHeight() + f11, paint);
                }
                paint.setAlpha(alpha2);
            }
        }
    }

    public final boolean d(MotionEvent motionEvent, boolean z9) {
        v2 v2Var = this.G;
        l2 l2Var = v2Var.c;
        int i7 = v2Var.i0;
        if (!v2Var.I) {
            int i10 = 1;
            if (!v2Var.f0(motionEvent)) {
                int i11 = 3;
                int i12 = 2;
                if (v2Var.I(motionEvent) || this.E) {
                    if (motionEvent != null && ((motionEvent.getAction() == 0 || motionEvent.getAction() == 2) && !this.f && !this.e && motionEvent.getPointerCount() == 1)) {
                        this.E = true;
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
                        if (!v2Var.D0 && this.e && !this.f && x10 > 0.0f && x10 / 3.0f > Math.abs(y10) && Math.abs(x10) >= i7) {
                            this.b = (int) motionEvent.getX();
                            this.e = false;
                            this.f = true;
                        } else if (this.f) {
                            float f10 = this.D + x10;
                            this.D = f10;
                            v2Var.b.setTranslationX(Math.max(f10, 0.0f));
                            this.b = (int) motionEvent.getX();
                            l2Var.invalidate();
                        }
                    } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.d && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
                        if (this.a == null) {
                            this.a = VelocityTracker.obtain();
                        }
                        float xVelocity = this.a.getXVelocity();
                        float yVelocity = this.a.getYVelocity();
                        if (this.D >= v2Var.b.getMeasuredWidth() / 3.0f || (xVelocity >= 3500.0f && xVelocity >= yVelocity)) {
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.D, getMeasuredWidth());
                            ofFloat.addUpdateListener(new q2(this, i11));
                            ofFloat.addListener(new r2(this, i12));
                            xq xqVar = xq.h;
                            ofFloat.setInterpolator(xqVar);
                            ofFloat.setDuration(320L);
                            ofFloat.start();
                            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
                            ofFloat2.addUpdateListener(new q2(this, 4));
                            ofFloat2.setInterpolator(xqVar);
                            ofFloat2.setDuration(320L);
                            ofFloat2.start();
                        } else {
                            float max = Math.max(this.D, 0.0f);
                            this.D = max;
                            ValueAnimator ofFloat3 = ValueAnimator.ofFloat(max, 0.0f);
                            ofFloat3.addUpdateListener(new q2(this, i12));
                            ofFloat3.addListener(new r2(this, i10));
                            ofFloat3.setInterpolator(xq.f);
                            ofFloat3.setDuration(220L);
                            ofFloat3.start();
                        }
                        this.e = false;
                        this.f = false;
                        this.d = -1;
                        this.E = false;
                    }
                } else if (v2Var.H() && motionEvent != null && ((motionEvent.getAction() == 0 || motionEvent.getAction() == 2) && !this.f && !this.e && motionEvent.getPointerCount() == 1)) {
                    this.b = (int) motionEvent.getX();
                    int y11 = (int) motionEvent.getY();
                    this.c = y11;
                    if (v2Var.X(this.b, y11)) {
                        v2Var.o0();
                        return true;
                    }
                    this.d = motionEvent.getPointerId(0);
                    this.e = true;
                    a();
                    VelocityTracker velocityTracker = this.a;
                    if (velocityTracker != null) {
                        velocityTracker.clear();
                    }
                } else if (v2Var.G() && motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.d) {
                    if (this.a == null) {
                        this.a = VelocityTracker.obtain();
                    }
                    float abs = Math.abs((int) (motionEvent.getX() - this.b));
                    float y12 = ((int) motionEvent.getY()) - this.c;
                    this.a.addMovement(motionEvent);
                    if (!v2Var.D0 && this.e && !this.f && y12 > 0.0f && y12 / 3.0f > Math.abs(abs) && Math.abs(y12) >= i7) {
                        this.c = (int) motionEvent.getY();
                        this.e = false;
                        this.f = true;
                        requestDisallowInterceptTouchEvent(true);
                    } else if (this.f) {
                        float f11 = this.y + y12;
                        this.y = f11;
                        float max2 = Math.max(f11, 0.0f);
                        this.y = max2;
                        v2Var.b.setTranslationY(Math.max(max2, 0.0f));
                        v2Var.h0();
                        this.c = (int) motionEvent.getY();
                        l2Var.invalidate();
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
                if ((z9 || !this.e) && !this.f && (v2Var.G() || v2Var.I(motionEvent))) {
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
        v2 v2Var = this.G;
        if (v2Var.b != null && this.x > 0) {
            int i11 = v2Var.Z0;
            Paint paint2 = this.F;
            paint2.setColor(i11);
            canvas.drawRect(0.0f, (v2Var.b.getTranslationY() + (getMeasuredHeight() - this.x)) - 1.0f, getMeasuredWidth(), v2Var.b.getTranslationY() + getMeasuredHeight(), paint2);
        }
        int i12 = Build.VERSION.SDK_INT;
        Paint paint3 = this.s;
        if (i12 >= 26) {
            int i13 = v2Var.F0;
            if (i13 >= 0) {
                paint3.setColor(k6.w0(i13, v2Var.I0));
            } else {
                paint3.setColor(v2Var.G0);
            }
        } else {
            paint3.setColor(-16777216);
        }
        if (v2Var.s && !v2Var.H0()) {
            c(canvas, 1.0f);
        }
        if (paint3.getAlpha() >= 255 || !v2Var.n) {
            super.dispatchDraw(canvas);
        } else {
            float f10 = 0.0f;
            if (v2Var.w || (i12 >= 29 && v2.B(v2Var) > 0)) {
                f10 = Math.max(0.0f, v2Var.Q() - (v2Var.b.getMeasuredHeight() - v2Var.b.getTranslationY()));
            }
            int Q = v2Var.n ? v2Var.Q() : 0;
            canvas.save();
            canvas.clipRect(v2Var.b.getLeft() + v2Var.t0, ((getMeasuredHeight() - Q) + f10) - v2Var.E0, v2Var.b.getRight() - v2Var.t0, getMeasuredHeight() + f10, Region.Op.DIFFERENCE);
            super.dispatchDraw(canvas);
            canvas.restore();
        }
        if (v2Var.r) {
            if ((getMeasuredHeight() - v2Var.b.getY()) - v2Var.b.getMeasuredHeight() > org.telegram.messenger.g0.L(48.0f)) {
                int i14 = v2Var.a0;
                paint3.setColor(i14 >= 0 ? k6.w0(i14, v2Var.I0) : 0);
                canvas.drawRect(v2Var.b.getLeft() + v2Var.t0, v2Var.b.getMeasuredHeight() + v2Var.b.getY(), v2Var.b.getRight() - v2Var.t0, getMeasuredHeight(), paint3);
                return;
            }
            return;
        }
        if (!v2Var.H0()) {
            c(canvas, v2Var.s ? v2Var.C0 * 0.7f : 1.0f);
        }
        if (v2Var.n && (i10 = v2Var.T) != 0 && i10 > v2Var.S && v2Var.U) {
            Point point2 = org.telegram.messenger.g0.q;
            if (point2.x > point2.y) {
                paint = paint3;
                canvas.drawRect(v2Var.b.getRight() - v2Var.t0, v2Var.b.getTranslationY(), v2Var.b.getRight() + v2Var.T, getMeasuredHeight(), paint);
                if (v2Var.n && (i7 = v2Var.S) != 0 && i7 > v2Var.T && v2Var.U) {
                    point = org.telegram.messenger.g0.q;
                    if (point.x > point.y) {
                        canvas.drawRect(0.0f, v2Var.b.getTranslationY(), v2Var.b.getLeft() + v2Var.t0, getMeasuredHeight(), paint);
                    }
                }
                if (v2Var.b.getY() + v2Var.b.getMeasuredHeight() >= getMeasuredHeight()) {
                    int i15 = v2Var.a0;
                    paint.setColor(i15 >= 0 ? k6.w0(i15, v2Var.I0) : 0);
                    canvas.drawRect(v2Var.b.getLeft() + v2Var.t0, v2Var.b.getMeasuredHeight() + v2Var.b.getY(), v2Var.b.getRight() - v2Var.t0, getMeasuredHeight(), paint);
                    return;
                }
                return;
            }
        }
        paint = paint3;
        if (v2Var.n) {
            point = org.telegram.messenger.g0.q;
            if (point.x > point.y) {
            }
        }
        if (v2Var.b.getY() + v2Var.b.getMeasuredHeight() >= getMeasuredHeight()) {
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j3) {
        if (!(view instanceof CameraView)) {
            return super.drawChild(canvas, view, j3);
        }
        if (this.G.H0()) {
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
        boolean z9;
        Paint paint = this.s;
        int alpha = paint.getAlpha();
        v2 v2Var = this.G;
        if (alpha >= 255 || !v2Var.n) {
            canvas2 = canvas;
            z9 = false;
        } else {
            float f10 = 0.0f;
            if (v2Var.w || (Build.VERSION.SDK_INT >= 29 && v2.B(v2Var) > 0)) {
                f10 = Math.max(0.0f, v2Var.Q() - (v2Var.b.getMeasuredHeight() - v2Var.b.getTranslationY()));
            }
            int Q = v2Var.n ? v2Var.Q() : 0;
            canvas.save();
            canvas.clipRect(v2Var.b.getLeft() + v2Var.t0, ((getMeasuredHeight() - Q) + f10) - v2Var.E0, v2Var.b.getRight() - v2Var.t0, getMeasuredHeight() + f10, Region.Op.DIFFERENCE);
            canvas2 = canvas;
            z9 = true;
        }
        super.onDraw(canvas2);
        if (v2Var.n && v2Var.h != null && v2Var.f != 0) {
            int i7 = v2Var.a0;
            paint.setColor(i7 >= 0 ? k6.w0(i7, v2Var.I0) : 0);
            canvas2.drawRect(v2Var.b.getLeft() + v2Var.t0, (getMeasuredHeight() - v2Var.f) - (v2Var.n ? v2Var.Q() : 0), v2Var.b.getRight() - v2Var.t0, getMeasuredHeight() - (v2Var.n ? v2Var.Q() : 0), paint);
        }
        v2Var.d0();
        if (z9) {
            canvas2.restore();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        v2 v2Var = this.G;
        return (v2Var.G() || v2Var.I(motionEvent)) ? d(motionEvent, true) : super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01aa  */
    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        int i13;
        int i14;
        m.f3 f3Var;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23 = i12 - this.x;
        v2 v2Var = this.G;
        v2Var.e0();
        int i24 = 1;
        v2Var.H--;
        ViewGroup viewGroup = v2Var.b;
        int i25 = 0;
        if (viewGroup != null) {
            int measuredHeight = (i23 - i10) - viewGroup.getMeasuredHeight();
            if (v2Var.h != null) {
                i21 = v2Var.S() + i7;
                i22 = i11 - v2Var.T();
                if (v2Var.F) {
                    measuredHeight = 0;
                } else if (!v2Var.x) {
                    measuredHeight = (int) (measuredHeight - (((1.0f - v2Var.S0) * v2Var.h.getSystemWindowInsetBottom()) - (v2Var.n ? 0 : v2Var.Q())));
                    if (Build.VERSION.SDK_INT >= 29) {
                        measuredHeight -= v2.B(v2Var);
                    }
                }
            } else {
                i21 = i7;
                i22 = i11;
            }
            int measuredWidth = ((i22 - i21) - v2Var.b.getMeasuredWidth()) / 2;
            if (v2Var.h != null) {
                measuredWidth += v2Var.S();
            }
            if ((v2Var.P0 && v2Var.G == null && this.w && !v2Var.I && (!v2Var.Q0 ? v2Var.b.getTop() != measuredHeight : v2Var.b.getBottom() != v2Var.b.getMeasuredHeight() + measuredHeight)) || (v2Var.e1 > 0 && System.currentTimeMillis() < v2Var.e1)) {
                v2Var.b.setTranslationY(v2Var.Q0 ? r7.getBottom() - (v2Var.b.getMeasuredHeight() + measuredHeight) : r7.getTop() - measuredHeight);
                v2Var.h0();
                v2Var.q0(v2Var.b.getTranslationY());
                ValueAnimator valueAnimator = v2Var.O0;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(v2Var.b.getTranslationY(), 0.0f);
                v2Var.O0 = ofFloat;
                ofFloat.addUpdateListener(new q2(this, i25));
                v2Var.O0.addListener(new r2(this, 3));
                v2Var.O0.setDuration(250L).setInterpolator(i1.w);
                v2Var.O0.start();
                v2Var.e1 = -1L;
            }
            ViewGroup viewGroup2 = v2Var.b;
            viewGroup2.layout(measuredWidth, measuredHeight, viewGroup2.getMeasuredWidth() + measuredWidth, v2Var.b.getMeasuredHeight() + measuredHeight);
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
            if (childAt.getVisibility() != 8 && childAt != v2Var.b) {
                if (!v2Var.k0(childAt, i13, i10, i14, i23 - (v2Var.n ? v2Var.Q() : 0))) {
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                    int measuredWidth2 = childAt.getMeasuredWidth();
                    int measuredHeight2 = childAt.getMeasuredHeight();
                    int i27 = layoutParams.gravity;
                    if (i27 == -1) {
                        i27 = 51;
                    }
                    int i28 = i27 & qs.x1;
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
                            if (v2Var.h != null) {
                                i17 += v2Var.S();
                            }
                            childAt.layout(i17, i20, measuredWidth2 + i17, measuredHeight2 + i20);
                        } else {
                            i18 = (i23 - i10) - measuredHeight2;
                            i19 = layoutParams.bottomMargin;
                        }
                        i20 = i18 - i19;
                        if (v2Var.h != null) {
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
                    if (v2Var.h != null) {
                    }
                    childAt.layout(i17, i20, measuredWidth2 + i17, measuredHeight2 + i20);
                }
            }
            i26++;
            i24 = 1;
        }
        if (v2Var.H == 0 && (f3Var = v2Var.G) != null && !v2Var.D) {
            org.telegram.messenger.g0.r(f3Var);
            v2Var.G.run();
            v2Var.G = null;
        }
        if (v2Var.D && v2Var.d) {
            m.f3 f3Var2 = v2Var.G;
            if (f3Var2 != null) {
                org.telegram.messenger.g0.r(f3Var2);
                v2Var.G.run();
            }
            v2Var.D = false;
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
        v2 v2Var = this.G;
        int i12 = v2Var.f;
        if (rect.bottom == 0 || rect.top == 0) {
            v2Var.f = 0;
        } else {
            int max = Math.max(0, ((int) com.google.android.recaptcha.internal.a.v(1.0f, v2Var.S0, org.telegram.messenger.g0.q1(rootView), rootView.getHeight() - (rect.top != 0 ? (1.0f - v2Var.S0) * org.telegram.messenger.g0.m : 0.0f))) - (rect.bottom - rect.top));
            v2Var.f = max;
            if (max < org.telegram.messenger.g0.L(20.0f)) {
                v2Var.f = 0;
            } else {
                v2Var.e = v2Var.f;
            }
            v2Var.R -= v2Var.f;
        }
        int i13 = v2Var.f;
        if (i12 != i13) {
            this.w = true;
        }
        v2Var.d = i13 > org.telegram.messenger.g0.L(20.0f);
        WindowInsets windowInsets = v2Var.h;
        if (windowInsets != null) {
            v2Var.R = windowInsets.getSystemWindowInsetBottom();
            v2Var.S = v2Var.h.getSystemWindowInsetLeft();
            v2Var.T = v2Var.h.getSystemWindowInsetRight();
            if (Build.VERSION.SDK_INT >= 29) {
                v2Var.R += v2.B(v2Var);
            }
            if (v2Var.d && rect.bottom != 0 && rect.top != 0) {
                v2Var.R -= v2Var.f;
            }
            if (!v2Var.n && !v2Var.x && !v2Var.y) {
                i11 = size2 - v2Var.Q();
                this.x = size2 - i11;
                setMeasuredDimension(size, size2);
                if (v2Var.h != null && !v2Var.x) {
                    int systemWindowInsetBottom = (int) ((1.0f - v2Var.S0) * r3.getSystemWindowInsetBottom());
                    if (Build.VERSION.SDK_INT >= 29) {
                        systemWindowInsetBottom += v2.B(v2Var);
                    }
                    if (v2Var.y) {
                    }
                    size2 -= systemWindowInsetBottom;
                    Math.min(systemWindowInsetBottom, org.telegram.messenger.g0.n);
                }
                int i14 = size2;
                if (v2Var.h != null) {
                    size -= v2Var.S() + v2Var.T();
                }
                int i15 = size;
                v2Var.J0 = i15 < i14;
                viewGroup = v2Var.b;
                if (viewGroup != null) {
                    if (v2Var.U) {
                        viewGroup.measure(View.MeasureSpec.makeMeasureSpec((v2Var.t0 * 2) + i15, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i14, TLObject.FLAG_31));
                    } else {
                        if (org.telegram.messenger.g0.Q1()) {
                            float L = org.telegram.messenger.g0.L(500.0f);
                            Point point = org.telegram.messenger.g0.q;
                            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec((v2Var.t0 * 2) + ((int) Math.min(L, Math.min(point.x, point.y) * 0.8f)), TLObject.FLAG_30);
                        } else {
                            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec((v2Var.t0 * 2) + (v2Var.J0 ? i15 : (int) Math.max(i15 * 0.8f, Math.min(org.telegram.messenger.g0.L(480.0f), i15))), TLObject.FLAG_30);
                        }
                        v2Var.b.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(i14, TLObject.FLAG_31));
                    }
                }
                childCount = getChildCount();
                for (int i16 = 0; i16 < childCount; i16++) {
                    View childAt = getChildAt(i16);
                    if (childAt.getVisibility() != 8 && childAt != v2Var.b) {
                        if (childAt instanceof i60) {
                            measureChildWithMargins(childAt, View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_30), 0, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), 0);
                        } else if (!v2Var.l0(childAt, i15, i14)) {
                            measureChildWithMargins(childAt, View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_30), 0, View.MeasureSpec.makeMeasureSpec(i14, TLObject.FLAG_30), 0);
                        }
                    }
                }
            }
        }
        i11 = size2;
        this.x = size2 - i11;
        setMeasuredDimension(size, size2);
        if (v2Var.h != null) {
            int systemWindowInsetBottom2 = (int) ((1.0f - v2Var.S0) * r3.getSystemWindowInsetBottom());
            if (Build.VERSION.SDK_INT >= 29) {
            }
            if (v2Var.y) {
            }
            size2 -= systemWindowInsetBottom2;
            Math.min(systemWindowInsetBottom2, org.telegram.messenger.g0.n);
        }
        int i142 = size2;
        if (v2Var.h != null) {
        }
        int i152 = size;
        v2Var.J0 = i152 < i142;
        viewGroup = v2Var.b;
        if (viewGroup != null) {
        }
        childCount = getChildCount();
        while (i16 < childCount) {
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f10, float f11, boolean z9) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f10, float f11) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i7, int i10, int[] iArr) {
        v2 v2Var = this.G;
        if (v2Var.I || !v2Var.q0) {
            return;
        }
        a();
        float translationY = v2Var.b.getTranslationY();
        if (translationY <= 0.0f || i10 <= 0) {
            return;
        }
        float f10 = translationY - i10;
        iArr[1] = i10;
        v2Var.b.setTranslationY(f10 >= 0.0f ? f10 : 0.0f);
        v2Var.h0();
        v2Var.c.invalidate();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i7, int i10, int i11, int i12) {
        v2 v2Var = this.G;
        if (v2Var.I || !v2Var.q0) {
            return;
        }
        a();
        if (i12 != 0) {
            float translationY = v2Var.b.getTranslationY() - i12;
            if (translationY < 0.0f) {
                translationY = 0.0f;
            }
            v2Var.b.setTranslationY(translationY);
            v2Var.h0();
            v2Var.c.invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i7) {
        this.n.a = i7;
        v2 v2Var = this.G;
        if (v2Var.I || !v2Var.q0) {
            return;
        }
        a();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i7) {
        v2 v2Var = this.G;
        return !v2Var.I && v2Var.q0 && i7 == 2 && !v2Var.G();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        this.n.a = 0;
        v2 v2Var = this.G;
        if (v2Var.I || !v2Var.q0) {
            return;
        }
        b(0.0f, 0.0f);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return d(motionEvent, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z9) {
        if (this.e && !this.f) {
            d(null, false);
        }
        super.requestDisallowInterceptTouchEvent(z9);
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final void updateColors() {
        v2 v2Var = this.G;
        try {
            v2.A(v2Var);
        } catch (Exception e10) {
            a8.g(e10, true);
        }
        v2Var.s0();
    }
}
