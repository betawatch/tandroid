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
import org.telegram.messenger.camera.CameraView;
import org.telegram.messenger.f8;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.x60;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public abstract class w2 extends FrameLayout implements k6 {
    public float D;
    public boolean E;
    public final Paint F;
    public final /* synthetic */ z2 G;
    public VelocityTracker a;
    public int b;
    public int c;
    public int d;
    public boolean e;
    public boolean f;
    public AnimatorSet h;
    public final ac.g n;
    public final Rect r;
    public final Paint s;
    public boolean w;
    public int x;
    public float y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w2(z2 z2Var, Context context) {
        super(context);
        this.G = z2Var;
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
        this.n = new ac.g();
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

    @Override // org.telegram.ui.ActionBar.k6
    public final void addColorKeys(HashSet hashSet) {
        this.G.F(hashSet);
    }

    public final void b(float f7, float f10) {
        z2 z2Var = this.G;
        int i10 = 0;
        if ((z2Var.b.getTranslationY() >= org.telegram.messenger.i0.a1(false, 0.8f) || (f10 >= 3500.0f && Math.abs(f10) >= Math.abs(f7))) && (f10 >= 0.0f || Math.abs(f10) < 3500.0f)) {
            boolean z10 = z2Var.d0;
            z2Var.d0 = false;
            z2Var.dismiss();
            z2Var.d0 = z10;
            return;
        }
        this.e = false;
        this.h = new AnimatorSet();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new u2(this, 1));
        this.h.playTogether(ObjectAnimator.ofFloat(z2Var.b, "translationY", 0.0f), ofFloat);
        this.h.setDuration((int) ((Math.max(0.0f, r1) / org.telegram.messenger.i0.a1(false, 0.8f)) * 250.0f));
        this.h.setInterpolator(gr.f);
        this.h.addListener(new v2(this, i10));
        zs.e().k(zs.j1, 512);
        this.h.start();
    }

    public final void c(Canvas canvas, float f7) {
        int i10 = Build.VERSION.SDK_INT;
        Paint paint = this.s;
        z2 z2Var = this.G;
        if (i10 >= 26) {
            int i11 = z2Var.F0;
            if (i11 >= 0) {
                paint.setColor(t6.w0(i11, z2Var.I0));
            } else {
                paint.setColor(z2Var.G0);
            }
        } else {
            paint.setColor(-16777216);
        }
        if (!z2Var.V0 || z2Var.b.getVisibility() == 0) {
            boolean z10 = z2Var.n;
            float f10 = 0.0f;
            if ((!z10 || z2Var.R == 0) && z2Var.E0 == 0.0f) {
                return;
            }
            int R = z10 ? z2Var.R() : 0;
            float max = (z2Var.w || (i10 >= 29 && z2.D(z2Var) > 0)) ? z2Var.s ? Math.max(0.0f, Math.min(R - z2Var.E0, z2Var.b.getTranslationY())) : Math.max(0.0f, z2Var.R() - (z2Var.b.getMeasuredHeight() - z2Var.b.getTranslationY())) : 0.0f;
            int alpha = paint.getAlpha();
            if (z2Var.V0) {
                f7 *= z2Var.b.getAlpha();
            }
            int x10 = z2Var.V0 ? (int) z2Var.b.getX() : z2Var.b.getLeft();
            if (f7 < 1.0f) {
                paint.setAlpha((int) (alpha * f7));
            }
            canvas.drawRect(z2Var.t0 + x10, ((getMeasuredHeight() - R) + max) - z2Var.E0, z2Var.b.getRight() - z2Var.t0, getMeasuredHeight() + max, paint);
            paint.setAlpha(alpha);
            int i12 = z2Var.d1;
            if (i12 != 0) {
                paint.setColor(i12);
                int alpha2 = paint.getAlpha();
                float R0 = org.telegram.messenger.i0.R0(R);
                if (f7 < 1.0f) {
                    paint.setAlpha((int) (alpha2 * f7 * R0));
                } else {
                    f10 = max;
                }
                if (paint.getAlpha() > 0) {
                    canvas.drawRect(x10 + z2Var.t0, ((getMeasuredHeight() - R) + f10) - z2Var.E0, z2Var.b.getRight() - z2Var.t0, getMeasuredHeight() + f10, paint);
                }
                paint.setAlpha(alpha2);
            }
        }
    }

    public final boolean d(MotionEvent motionEvent, boolean z10) {
        z2 z2Var = this.G;
        p2 p2Var = z2Var.c;
        int i10 = z2Var.i0;
        if (!z2Var.I) {
            int i11 = 1;
            if (!z2Var.f0(motionEvent)) {
                int i12 = 3;
                int i13 = 2;
                if (z2Var.J(motionEvent) || this.E) {
                    if (motionEvent != null && ((motionEvent.getAction() == 0 || motionEvent.getAction() == 2) && !this.f && !this.e && motionEvent.getPointerCount() == 1)) {
                        this.E = true;
                        this.b = (int) motionEvent.getX();
                        this.c = (int) motionEvent.getY();
                        this.d = motionEvent.getPointerId(0);
                        this.e = true;
                        a();
                    } else if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.d) {
                        float x10 = motionEvent.getX() - this.b;
                        float y3 = motionEvent.getY() - this.c;
                        if (this.a == null) {
                            this.a = VelocityTracker.obtain();
                        }
                        this.a.addMovement(motionEvent);
                        if (!z2Var.D0 && this.e && !this.f && x10 > 0.0f && x10 / 3.0f > Math.abs(y3) && Math.abs(x10) >= i10) {
                            this.b = (int) motionEvent.getX();
                            this.e = false;
                            this.f = true;
                        } else if (this.f) {
                            float f7 = this.D + x10;
                            this.D = f7;
                            z2Var.b.setTranslationX(Math.max(f7, 0.0f));
                            this.b = (int) motionEvent.getX();
                            p2Var.invalidate();
                        }
                    } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.d && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
                        if (this.a == null) {
                            this.a = VelocityTracker.obtain();
                        }
                        float xVelocity = this.a.getXVelocity();
                        float yVelocity = this.a.getYVelocity();
                        if (this.D >= z2Var.b.getMeasuredWidth() / 3.0f || (xVelocity >= 3500.0f && xVelocity >= yVelocity)) {
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.D, getMeasuredWidth());
                            ofFloat.addUpdateListener(new u2(this, i12));
                            ofFloat.addListener(new v2(this, i13));
                            gr grVar = gr.h;
                            ofFloat.setInterpolator(grVar);
                            ofFloat.setDuration(320L);
                            ofFloat.start();
                            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
                            ofFloat2.addUpdateListener(new u2(this, 4));
                            ofFloat2.setInterpolator(grVar);
                            ofFloat2.setDuration(320L);
                            ofFloat2.start();
                        } else {
                            float max = Math.max(this.D, 0.0f);
                            this.D = max;
                            ValueAnimator ofFloat3 = ValueAnimator.ofFloat(max, 0.0f);
                            ofFloat3.addUpdateListener(new u2(this, i13));
                            ofFloat3.addListener(new v2(this, i11));
                            ofFloat3.setInterpolator(gr.f);
                            ofFloat3.setDuration(220L);
                            ofFloat3.start();
                        }
                        this.e = false;
                        this.f = false;
                        this.d = -1;
                        this.E = false;
                    }
                } else if (z2Var.I() && motionEvent != null && ((motionEvent.getAction() == 0 || motionEvent.getAction() == 2) && !this.f && !this.e && motionEvent.getPointerCount() == 1)) {
                    this.b = (int) motionEvent.getX();
                    int y10 = (int) motionEvent.getY();
                    this.c = y10;
                    if (z2Var.Y(this.b, y10)) {
                        z2Var.o0();
                        return true;
                    }
                    this.d = motionEvent.getPointerId(0);
                    this.e = true;
                    a();
                    VelocityTracker velocityTracker = this.a;
                    if (velocityTracker != null) {
                        velocityTracker.clear();
                    }
                } else if (z2Var.H() && motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.d) {
                    if (this.a == null) {
                        this.a = VelocityTracker.obtain();
                    }
                    float abs = Math.abs((int) (motionEvent.getX() - this.b));
                    float y11 = ((int) motionEvent.getY()) - this.c;
                    this.a.addMovement(motionEvent);
                    if (!z2Var.D0 && this.e && !this.f && y11 > 0.0f && y11 / 3.0f > Math.abs(abs) && Math.abs(y11) >= i10) {
                        this.c = (int) motionEvent.getY();
                        this.e = false;
                        this.f = true;
                        requestDisallowInterceptTouchEvent(true);
                    } else if (this.f) {
                        float f10 = this.y + y11;
                        this.y = f10;
                        float max2 = Math.max(f10, 0.0f);
                        this.y = max2;
                        z2Var.b.setTranslationY(Math.max(max2, 0.0f));
                        z2Var.h0();
                        this.c = (int) motionEvent.getY();
                        p2Var.invalidate();
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
                if ((z10 || !this.e) && !this.f && (z2Var.H() || z2Var.J(motionEvent))) {
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
        int i10;
        Point point;
        int i11;
        z2 z2Var = this.G;
        if (z2Var.b != null && this.x > 0) {
            int i12 = z2Var.Z0;
            Paint paint2 = this.F;
            paint2.setColor(i12);
            canvas.drawRect(0.0f, (z2Var.b.getTranslationY() + (getMeasuredHeight() - this.x)) - 1.0f, getMeasuredWidth(), z2Var.b.getTranslationY() + getMeasuredHeight(), paint2);
        }
        int i13 = Build.VERSION.SDK_INT;
        Paint paint3 = this.s;
        if (i13 >= 26) {
            int i14 = z2Var.F0;
            if (i14 >= 0) {
                paint3.setColor(t6.w0(i14, z2Var.I0));
            } else {
                paint3.setColor(z2Var.G0);
            }
        } else {
            paint3.setColor(-16777216);
        }
        if (z2Var.s && !z2Var.H0()) {
            c(canvas, 1.0f);
        }
        if (paint3.getAlpha() >= 255 || !z2Var.n) {
            super.dispatchDraw(canvas);
        } else {
            float f7 = 0.0f;
            if (z2Var.w || (i13 >= 29 && z2.D(z2Var) > 0)) {
                f7 = Math.max(0.0f, z2Var.R() - (z2Var.b.getMeasuredHeight() - z2Var.b.getTranslationY()));
            }
            int R = z2Var.n ? z2Var.R() : 0;
            canvas.save();
            canvas.clipRect(z2Var.b.getLeft() + z2Var.t0, ((getMeasuredHeight() - R) + f7) - z2Var.E0, z2Var.b.getRight() - z2Var.t0, getMeasuredHeight() + f7, Region.Op.DIFFERENCE);
            super.dispatchDraw(canvas);
            canvas.restore();
        }
        if (z2Var.r) {
            if ((getMeasuredHeight() - z2Var.b.getY()) - z2Var.b.getMeasuredHeight() > org.telegram.messenger.i0.L(48.0f)) {
                int i15 = z2Var.a0;
                paint3.setColor(i15 >= 0 ? t6.w0(i15, z2Var.I0) : 0);
                canvas.drawRect(z2Var.b.getLeft() + z2Var.t0, z2Var.b.getMeasuredHeight() + z2Var.b.getY(), z2Var.b.getRight() - z2Var.t0, getMeasuredHeight(), paint3);
                return;
            }
            return;
        }
        if (!z2Var.H0()) {
            c(canvas, z2Var.s ? z2Var.C0 * 0.7f : 1.0f);
        }
        if (z2Var.n && (i11 = z2Var.T) != 0 && i11 > z2Var.S && z2Var.U) {
            Point point2 = org.telegram.messenger.i0.q;
            if (point2.x > point2.y) {
                paint = paint3;
                canvas.drawRect(z2Var.b.getRight() - z2Var.t0, z2Var.b.getTranslationY(), z2Var.b.getRight() + z2Var.T, getMeasuredHeight(), paint);
                if (z2Var.n && (i10 = z2Var.S) != 0 && i10 > z2Var.T && z2Var.U) {
                    point = org.telegram.messenger.i0.q;
                    if (point.x > point.y) {
                        canvas.drawRect(0.0f, z2Var.b.getTranslationY(), z2Var.b.getLeft() + z2Var.t0, getMeasuredHeight(), paint);
                    }
                }
                if (z2Var.b.getY() + z2Var.b.getMeasuredHeight() >= getMeasuredHeight()) {
                    int i16 = z2Var.a0;
                    paint.setColor(i16 >= 0 ? t6.w0(i16, z2Var.I0) : 0);
                    canvas.drawRect(z2Var.b.getLeft() + z2Var.t0, z2Var.b.getMeasuredHeight() + z2Var.b.getY(), z2Var.b.getRight() - z2Var.t0, getMeasuredHeight(), paint);
                    return;
                }
                return;
            }
        }
        paint = paint3;
        if (z2Var.n) {
            point = org.telegram.messenger.i0.q;
            if (point.x > point.y) {
            }
        }
        if (z2Var.b.getY() + z2Var.b.getMeasuredHeight() >= getMeasuredHeight()) {
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j10) {
        if (!(view instanceof CameraView)) {
            return super.drawChild(canvas, view, j10);
        }
        if (this.G.H0()) {
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
        z2 z2Var = this.G;
        if (alpha >= 255 || !z2Var.n) {
            canvas2 = canvas;
            z10 = false;
        } else {
            float f7 = 0.0f;
            if (z2Var.w || (Build.VERSION.SDK_INT >= 29 && z2.D(z2Var) > 0)) {
                f7 = Math.max(0.0f, z2Var.R() - (z2Var.b.getMeasuredHeight() - z2Var.b.getTranslationY()));
            }
            int R = z2Var.n ? z2Var.R() : 0;
            canvas.save();
            canvas.clipRect(z2Var.b.getLeft() + z2Var.t0, ((getMeasuredHeight() - R) + f7) - z2Var.E0, z2Var.b.getRight() - z2Var.t0, getMeasuredHeight() + f7, Region.Op.DIFFERENCE);
            canvas2 = canvas;
            z10 = true;
        }
        super.onDraw(canvas2);
        if (z2Var.n && z2Var.h != null && z2Var.f != 0) {
            int i10 = z2Var.a0;
            paint.setColor(i10 >= 0 ? t6.w0(i10, z2Var.I0) : 0);
            canvas2.drawRect(z2Var.b.getLeft() + z2Var.t0, (getMeasuredHeight() - z2Var.f) - (z2Var.n ? z2Var.R() : 0), z2Var.b.getRight() - z2Var.t0, getMeasuredHeight() - (z2Var.n ? z2Var.R() : 0), paint);
        }
        z2Var.d0();
        if (z10) {
            canvas2.restore();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        z2 z2Var = this.G;
        return (z2Var.H() || z2Var.J(motionEvent)) ? d(motionEvent, true) : super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01aa  */
    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        mg.c2 c2Var;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24 = i13 - this.x;
        z2 z2Var = this.G;
        z2Var.e0();
        int i25 = 1;
        z2Var.H--;
        ViewGroup viewGroup = z2Var.b;
        int i26 = 0;
        if (viewGroup != null) {
            int measuredHeight = (i24 - i11) - viewGroup.getMeasuredHeight();
            if (z2Var.h != null) {
                i22 = z2Var.T() + i10;
                i23 = i12 - z2Var.U();
                if (z2Var.F) {
                    measuredHeight = 0;
                } else if (!z2Var.x) {
                    measuredHeight = (int) (measuredHeight - (((1.0f - z2Var.S0) * z2Var.h.getSystemWindowInsetBottom()) - (z2Var.n ? 0 : z2Var.R())));
                    if (Build.VERSION.SDK_INT >= 29) {
                        measuredHeight -= z2.D(z2Var);
                    }
                }
            } else {
                i22 = i10;
                i23 = i12;
            }
            int measuredWidth = ((i23 - i22) - z2Var.b.getMeasuredWidth()) / 2;
            if (z2Var.h != null) {
                measuredWidth += z2Var.T();
            }
            if ((z2Var.P0 && z2Var.G == null && this.w && !z2Var.I && (!z2Var.Q0 ? z2Var.b.getTop() != measuredHeight : z2Var.b.getBottom() != z2Var.b.getMeasuredHeight() + measuredHeight)) || (z2Var.e1 > 0 && System.currentTimeMillis() < z2Var.e1)) {
                z2Var.b.setTranslationY(z2Var.Q0 ? r7.getBottom() - (z2Var.b.getMeasuredHeight() + measuredHeight) : r7.getTop() - measuredHeight);
                z2Var.h0();
                z2Var.q0(z2Var.b.getTranslationY());
                ValueAnimator valueAnimator = z2Var.O0;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(z2Var.b.getTranslationY(), 0.0f);
                z2Var.O0 = ofFloat;
                ofFloat.addUpdateListener(new u2(this, i26));
                z2Var.O0.addListener(new v2(this, 3));
                z2Var.O0.setDuration(250L).setInterpolator(m1.w);
                z2Var.O0.start();
                z2Var.e1 = -1L;
            }
            ViewGroup viewGroup2 = z2Var.b;
            viewGroup2.layout(measuredWidth, measuredHeight, viewGroup2.getMeasuredWidth() + measuredWidth, z2Var.b.getMeasuredHeight() + measuredHeight);
            i14 = i22;
            i15 = i23;
        } else {
            i14 = i10;
            i15 = i12;
        }
        int childCount = getChildCount();
        int i27 = 0;
        while (i27 < childCount) {
            View childAt = getChildAt(i27);
            if (childAt.getVisibility() != 8 && childAt != z2Var.b) {
                if (!z2Var.k0(childAt, i14, i11, i15, i24 - (z2Var.n ? z2Var.R() : 0))) {
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                    int measuredWidth2 = childAt.getMeasuredWidth();
                    int measuredHeight2 = childAt.getMeasuredHeight();
                    int i28 = layoutParams.gravity;
                    if (i28 == -1) {
                        i28 = 51;
                    }
                    int i29 = i28 & zs.x1;
                    int i30 = i28 & 7;
                    if (i30 == i25) {
                        i16 = (((i15 - i14) - measuredWidth2) / 2) + layoutParams.leftMargin;
                        i17 = layoutParams.rightMargin;
                    } else if (i30 != 5) {
                        i18 = layoutParams.leftMargin;
                        if (i29 != 16) {
                            i19 = (((i24 - i11) - measuredHeight2) / 2) + layoutParams.topMargin;
                            i20 = layoutParams.bottomMargin;
                        } else if (i29 != 80) {
                            i21 = layoutParams.topMargin;
                            if (z2Var.h != null) {
                                i18 += z2Var.T();
                            }
                            childAt.layout(i18, i21, measuredWidth2 + i18, measuredHeight2 + i21);
                        } else {
                            i19 = (i24 - i11) - measuredHeight2;
                            i20 = layoutParams.bottomMargin;
                        }
                        i21 = i19 - i20;
                        if (z2Var.h != null) {
                        }
                        childAt.layout(i18, i21, measuredWidth2 + i18, measuredHeight2 + i21);
                    } else {
                        i16 = i15 - measuredWidth2;
                        i17 = layoutParams.rightMargin;
                    }
                    i18 = i16 - i17;
                    if (i29 != 16) {
                    }
                    i21 = i19 - i20;
                    if (z2Var.h != null) {
                    }
                    childAt.layout(i18, i21, measuredWidth2 + i18, measuredHeight2 + i21);
                }
            }
            i27++;
            i25 = 1;
        }
        if (z2Var.H == 0 && (c2Var = z2Var.G) != null && !z2Var.D) {
            org.telegram.messenger.i0.r(c2Var);
            z2Var.G.run();
            z2Var.G = null;
        }
        if (z2Var.D && z2Var.d) {
            mg.c2 c2Var2 = z2Var.G;
            if (c2Var2 != null) {
                org.telegram.messenger.i0.r(c2Var2);
                z2Var.G.run();
            }
            z2Var.D = false;
        }
        this.w = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00f6, code lost:
    
        if (r3 > (org.telegram.messenger.i0.L(10.0f) + org.telegram.messenger.i0.n)) goto L54;
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
    public final void onMeasure(int i10, int i11) {
        int i12;
        ViewGroup viewGroup;
        int childCount;
        int makeMeasureSpec;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        View rootView = getRootView();
        Rect rect = this.r;
        getWindowVisibleDisplayFrame(rect);
        z2 z2Var = this.G;
        int i13 = z2Var.f;
        if (rect.bottom == 0 || rect.top == 0) {
            z2Var.f = 0;
        } else {
            int max = Math.max(0, ((int) sc.e.z(1.0f, z2Var.S0, org.telegram.messenger.i0.q1(rootView), rootView.getHeight() - (rect.top != 0 ? (1.0f - z2Var.S0) * org.telegram.messenger.i0.m : 0.0f))) - (rect.bottom - rect.top));
            z2Var.f = max;
            if (max < org.telegram.messenger.i0.L(20.0f)) {
                z2Var.f = 0;
            } else {
                z2Var.e = z2Var.f;
            }
            z2Var.R -= z2Var.f;
        }
        int i14 = z2Var.f;
        if (i13 != i14) {
            this.w = true;
        }
        z2Var.d = i14 > org.telegram.messenger.i0.L(20.0f);
        WindowInsets windowInsets = z2Var.h;
        if (windowInsets != null) {
            z2Var.R = windowInsets.getSystemWindowInsetBottom();
            z2Var.S = z2Var.h.getSystemWindowInsetLeft();
            z2Var.T = z2Var.h.getSystemWindowInsetRight();
            if (Build.VERSION.SDK_INT >= 29) {
                z2Var.R += z2.D(z2Var);
            }
            if (z2Var.d && rect.bottom != 0 && rect.top != 0) {
                z2Var.R -= z2Var.f;
            }
            if (!z2Var.n && !z2Var.x && !z2Var.y) {
                i12 = size2 - z2Var.R();
                this.x = size2 - i12;
                setMeasuredDimension(size, size2);
                if (z2Var.h != null && !z2Var.x) {
                    int systemWindowInsetBottom = (int) ((1.0f - z2Var.S0) * r3.getSystemWindowInsetBottom());
                    if (Build.VERSION.SDK_INT >= 29) {
                        systemWindowInsetBottom += z2.D(z2Var);
                    }
                    if (z2Var.y) {
                    }
                    size2 -= systemWindowInsetBottom;
                    Math.min(systemWindowInsetBottom, org.telegram.messenger.i0.n);
                }
                int i15 = size2;
                if (z2Var.h != null) {
                    size -= z2Var.T() + z2Var.U();
                }
                int i16 = size;
                z2Var.J0 = i16 < i15;
                viewGroup = z2Var.b;
                if (viewGroup != null) {
                    if (z2Var.U) {
                        viewGroup.measure(View.MeasureSpec.makeMeasureSpec((z2Var.t0 * 2) + i16, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_31));
                    } else {
                        if (org.telegram.messenger.i0.Q1()) {
                            float L = org.telegram.messenger.i0.L(500.0f);
                            Point point = org.telegram.messenger.i0.q;
                            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec((z2Var.t0 * 2) + ((int) Math.min(L, Math.min(point.x, point.y) * 0.8f)), TLObject.FLAG_30);
                        } else {
                            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec((z2Var.t0 * 2) + (z2Var.J0 ? i16 : (int) Math.max(i16 * 0.8f, Math.min(org.telegram.messenger.i0.L(480.0f), i16))), TLObject.FLAG_30);
                        }
                        z2Var.b.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_31));
                    }
                }
                childCount = getChildCount();
                for (int i17 = 0; i17 < childCount; i17++) {
                    View childAt = getChildAt(i17);
                    if (childAt.getVisibility() != 8 && childAt != z2Var.b) {
                        if (childAt instanceof x60) {
                            measureChildWithMargins(childAt, View.MeasureSpec.makeMeasureSpec(i16, TLObject.FLAG_30), 0, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), TLObject.FLAG_30), 0);
                        } else if (!z2Var.l0(childAt, i16, i15)) {
                            measureChildWithMargins(childAt, View.MeasureSpec.makeMeasureSpec(i16, TLObject.FLAG_30), 0, View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_30), 0);
                        }
                    }
                }
            }
        }
        i12 = size2;
        this.x = size2 - i12;
        setMeasuredDimension(size, size2);
        if (z2Var.h != null) {
            int systemWindowInsetBottom2 = (int) ((1.0f - z2Var.S0) * r3.getSystemWindowInsetBottom());
            if (Build.VERSION.SDK_INT >= 29) {
            }
            if (z2Var.y) {
            }
            size2 -= systemWindowInsetBottom2;
            Math.min(systemWindowInsetBottom2, org.telegram.messenger.i0.n);
        }
        int i152 = size2;
        if (z2Var.h != null) {
        }
        int i162 = size;
        z2Var.J0 = i162 < i152;
        viewGroup = z2Var.b;
        if (viewGroup != null) {
        }
        childCount = getChildCount();
        while (i17 < childCount) {
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f7, float f10, boolean z10) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f7, float f10) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
        z2 z2Var = this.G;
        if (z2Var.I || !z2Var.q0) {
            return;
        }
        a();
        float translationY = z2Var.b.getTranslationY();
        if (translationY <= 0.0f || i11 <= 0) {
            return;
        }
        float f7 = translationY - i11;
        iArr[1] = i11;
        z2Var.b.setTranslationY(f7 >= 0.0f ? f7 : 0.0f);
        z2Var.h0();
        z2Var.c.invalidate();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        z2 z2Var = this.G;
        if (z2Var.I || !z2Var.q0) {
            return;
        }
        a();
        if (i13 != 0) {
            float translationY = z2Var.b.getTranslationY() - i13;
            if (translationY < 0.0f) {
                translationY = 0.0f;
            }
            z2Var.b.setTranslationY(translationY);
            z2Var.h0();
            z2Var.c.invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i10) {
        this.n.a = i10;
        z2 z2Var = this.G;
        if (z2Var.I || !z2Var.q0) {
            return;
        }
        a();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i10) {
        z2 z2Var = this.G;
        return !z2Var.I && z2Var.q0 && i10 == 2 && !z2Var.H();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        this.n.a = 0;
        z2 z2Var = this.G;
        if (z2Var.I || !z2Var.q0) {
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

    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        z2 z2Var = this.G;
        try {
            z2.B(z2Var);
        } catch (Exception e) {
            f8.g(e, true);
        }
        z2Var.s0();
    }
}
