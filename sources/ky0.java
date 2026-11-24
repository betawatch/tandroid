// default package

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
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public abstract class ky0 extends FrameLayout implements vlb {
    public float E;
    public boolean F;
    public final Paint G;
    public final /* synthetic */ my0 H;
    public VelocityTracker a;
    public int b;
    public int c;
    public int d;
    public boolean e;
    public boolean f;
    public AnimatorSet h;
    public final az8 n;
    public final Rect r;
    public final Paint s;
    public boolean w;
    public int x;
    public float y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ky0(my0 my0Var, Context context) {
        super(context);
        this.H = my0Var;
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
        this.n = new az8((byte) 3);
        setWillNotDraw(false);
    }

    public final void a() {
        AnimatorSet animatorSet = this.h;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.h = null;
        }
        this.H.o0();
    }

    @Override // vlb
    public final void addColorKeys(HashSet hashSet) {
        this.H.z(hashSet);
    }

    public final void b(float f, float f2) {
        my0 my0Var = this.H;
        byte b = 0;
        if ((my0Var.b.getTranslationY() >= gm.Z0(false, 0.8f) || (f2 >= 3500.0f && Math.abs(f2) >= Math.abs(f))) && (f2 >= 0.0f || Math.abs(f2) < 3500.0f)) {
            boolean z = my0Var.e0;
            my0Var.e0 = false;
            my0Var.dismiss();
            my0Var.e0 = z;
            return;
        }
        this.e = false;
        this.h = new AnimatorSet();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new iy0(this, (byte) 1));
        this.h.playTogether(ObjectAnimator.ofFloat(my0Var.b, "translationY", 0.0f), ofFloat);
        this.h.setDuration((int) ((Math.max(0.0f, r1) / gm.Z0(false, 0.8f)) * 250.0f));
        this.h.setInterpolator(d53.f);
        this.h.addListener(new jy0(this, b));
        nm7.e().k(nm7.j1, 512);
        this.h.start();
    }

    public final void c(Canvas canvas, float f) {
        int i = Build.VERSION.SDK_INT;
        Paint paint = this.s;
        my0 my0Var = this.H;
        if (i >= 26) {
            int i2 = my0Var.G0;
            if (i2 >= 0) {
                paint.setColor(cmb.v0(i2, my0Var.J0));
            } else {
                paint.setColor(my0Var.H0);
            }
        } else {
            paint.setColor(-16777216);
        }
        if (!my0Var.V0 || my0Var.b.getVisibility() == 0) {
            boolean z = my0Var.n;
            float f2 = 0.0f;
            if ((!z || my0Var.S == 0) && my0Var.F0 == 0.0f) {
                return;
            }
            int O = z ? my0Var.O() : 0;
            float max = (my0Var.w || (i >= 29 && my0Var.M() > 0)) ? my0Var.s ? Math.max(0.0f, Math.min(O - my0Var.F0, my0Var.b.getTranslationY())) : Math.max(0.0f, my0Var.O() - (my0Var.b.getMeasuredHeight() - my0Var.b.getTranslationY())) : 0.0f;
            int alpha = paint.getAlpha();
            if (my0Var.V0) {
                f *= my0Var.b.getAlpha();
            }
            boolean z2 = my0Var.V0;
            ViewGroup viewGroup = my0Var.b;
            int x = z2 ? (int) viewGroup.getX() : viewGroup.getLeft();
            if (f < 1.0f) {
                paint.setAlpha((int) (alpha * f));
            }
            canvas.drawRect(my0Var.u0 + x, ((getMeasuredHeight() - O) + max) - my0Var.F0, my0Var.b.getRight() - my0Var.u0, getMeasuredHeight() + max, paint);
            paint.setAlpha(alpha);
            int i3 = my0Var.g1;
            if (i3 != 0) {
                paint.setColor(i3);
                int alpha2 = paint.getAlpha();
                float Q0 = gm.Q0(O);
                if (f < 1.0f) {
                    paint.setAlpha((int) (alpha2 * f * Q0));
                } else {
                    f2 = max;
                }
                if (paint.getAlpha() > 0) {
                    canvas.drawRect(x + my0Var.u0, ((getMeasuredHeight() - O) + f2) - my0Var.F0, my0Var.b.getRight() - my0Var.u0, getMeasuredHeight() + f2, paint);
                }
                paint.setAlpha(alpha2);
            }
        }
    }

    public final boolean d(MotionEvent motionEvent, boolean z) {
        my0 my0Var = this.H;
        dy0 dy0Var = my0Var.c;
        int i = my0Var.j0;
        if (!my0Var.J) {
            byte b = 1;
            if (!my0Var.c0(motionEvent)) {
                byte b2 = 3;
                byte b3 = 2;
                if (my0Var.F(motionEvent) || this.F) {
                    if (motionEvent != null && ((motionEvent.getAction() == 0 || motionEvent.getAction() == 2) && !this.f && !this.e && motionEvent.getPointerCount() == 1)) {
                        this.F = true;
                        this.b = (int) motionEvent.getX();
                        this.c = (int) motionEvent.getY();
                        this.d = motionEvent.getPointerId(0);
                        this.e = true;
                        a();
                    } else if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.d) {
                        float x = motionEvent.getX() - this.b;
                        float y = motionEvent.getY() - this.c;
                        VelocityTracker velocityTracker = this.a;
                        if (velocityTracker == null) {
                            velocityTracker = VelocityTracker.obtain();
                            this.a = velocityTracker;
                        }
                        velocityTracker.addMovement(motionEvent);
                        if (!my0Var.E0 && this.e && !this.f && x > 0.0f && x / 3.0f > Math.abs(y) && Math.abs(x) >= i) {
                            this.b = (int) motionEvent.getX();
                            this.e = false;
                            this.f = true;
                        } else if (this.f) {
                            float f = this.E + x;
                            this.E = f;
                            my0Var.b.setTranslationX(Math.max(f, 0.0f));
                            this.b = (int) motionEvent.getX();
                            dy0Var.invalidate();
                        }
                    } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.d && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
                        VelocityTracker velocityTracker2 = this.a;
                        if (velocityTracker2 == null) {
                            velocityTracker2 = VelocityTracker.obtain();
                            this.a = velocityTracker2;
                        }
                        float xVelocity = velocityTracker2.getXVelocity();
                        float yVelocity = this.a.getYVelocity();
                        if (this.E >= my0Var.b.getMeasuredWidth() / 3.0f || (xVelocity >= 3500.0f && xVelocity >= yVelocity)) {
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.E, getMeasuredWidth());
                            ofFloat.addUpdateListener(new iy0(this, b2));
                            ofFloat.addListener(new jy0(this, b3));
                            d53 d53Var = d53.h;
                            ofFloat.setInterpolator(d53Var);
                            ofFloat.setDuration(320L);
                            ofFloat.start();
                            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
                            ofFloat2.addUpdateListener(new iy0(this, (byte) 4));
                            ofFloat2.setInterpolator(d53Var);
                            ofFloat2.setDuration(320L);
                            ofFloat2.start();
                        } else {
                            float max = Math.max(this.E, 0.0f);
                            this.E = max;
                            ValueAnimator ofFloat3 = ValueAnimator.ofFloat(max, 0.0f);
                            ofFloat3.addUpdateListener(new iy0(this, b3));
                            ofFloat3.addListener(new jy0(this, b));
                            ofFloat3.setInterpolator(d53.f);
                            ofFloat3.setDuration(220L);
                            ofFloat3.start();
                        }
                        this.e = false;
                        this.f = false;
                        this.d = -1;
                        this.F = false;
                    }
                } else if (my0Var.E() && motionEvent != null && ((motionEvent.getAction() == 0 || motionEvent.getAction() == 2) && !this.f && !this.e && motionEvent.getPointerCount() == 1)) {
                    this.b = (int) motionEvent.getX();
                    int y2 = (int) motionEvent.getY();
                    this.c = y2;
                    if (my0Var.T(this.b, y2)) {
                        my0Var.l0();
                        return true;
                    }
                    this.d = motionEvent.getPointerId(0);
                    this.e = true;
                    a();
                    VelocityTracker velocityTracker3 = this.a;
                    if (velocityTracker3 != null) {
                        velocityTracker3.clear();
                    }
                } else if (my0Var.C() && motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.d) {
                    if (this.a == null) {
                        this.a = VelocityTracker.obtain();
                    }
                    float abs = Math.abs((int) (motionEvent.getX() - this.b));
                    float y3 = ((int) motionEvent.getY()) - this.c;
                    this.a.addMovement(motionEvent);
                    if (!my0Var.E0 && this.e && !this.f && y3 > 0.0f && y3 / 3.0f > Math.abs(abs) && Math.abs(y3) >= i) {
                        this.c = (int) motionEvent.getY();
                        this.e = false;
                        this.f = true;
                        requestDisallowInterceptTouchEvent(true);
                    } else if (this.f) {
                        float f2 = this.y + y3;
                        this.y = f2;
                        float max2 = Math.max(f2, 0.0f);
                        this.y = max2;
                        my0Var.b.setTranslationY(Math.max(max2, 0.0f));
                        my0Var.e0();
                        this.c = (int) motionEvent.getY();
                        dy0Var.invalidate();
                    }
                } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.d && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
                    VelocityTracker velocityTracker4 = this.a;
                    if (velocityTracker4 == null) {
                        velocityTracker4 = VelocityTracker.obtain();
                        this.a = velocityTracker4;
                    }
                    velocityTracker4.computeCurrentVelocity(1000);
                    if (this.f || this.y > 0.0f) {
                        b(this.a.getXVelocity(), this.a.getYVelocity());
                    } else {
                        this.e = false;
                    }
                    this.f = false;
                    VelocityTracker velocityTracker5 = this.a;
                    if (velocityTracker5 != null) {
                        velocityTracker5.recycle();
                        this.a = null;
                    }
                    this.d = -1;
                }
                if ((z || !this.e) && !this.f && (my0Var.C() || my0Var.F(motionEvent))) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void dispatchDraw(Canvas canvas) {
        Paint paint;
        int i;
        Point point;
        int i2;
        my0 my0Var = this.H;
        if (my0Var.b != null && this.x > 0) {
            int i3 = my0Var.c1;
            Paint paint2 = this.G;
            paint2.setColor(i3);
            canvas.drawRect(0.0f, (my0Var.b.getTranslationY() + (getMeasuredHeight() - this.x)) - 1.0f, getMeasuredWidth(), my0Var.b.getTranslationY() + getMeasuredHeight(), paint2);
        }
        int i4 = Build.VERSION.SDK_INT;
        Paint paint3 = this.s;
        if (i4 >= 26) {
            int i5 = my0Var.G0;
            if (i5 >= 0) {
                paint3.setColor(cmb.v0(i5, my0Var.J0));
            } else {
                paint3.setColor(my0Var.H0);
            }
        } else {
            paint3.setColor(-16777216);
        }
        if (my0Var.s && !my0Var.A0()) {
            c(canvas, 1.0f);
        }
        if (paint3.getAlpha() >= 255 || !my0Var.n) {
            super.dispatchDraw(canvas);
        } else {
            float f = 0.0f;
            if (my0Var.w || (i4 >= 29 && my0Var.M() > 0)) {
                f = Math.max(0.0f, my0Var.O() - (my0Var.b.getMeasuredHeight() - my0Var.b.getTranslationY()));
            }
            int O = my0Var.n ? my0Var.O() : 0;
            canvas.save();
            canvas.clipRect(my0Var.b.getLeft() + my0Var.u0, ((getMeasuredHeight() - O) + f) - my0Var.F0, my0Var.b.getRight() - my0Var.u0, getMeasuredHeight() + f, Region.Op.DIFFERENCE);
            super.dispatchDraw(canvas);
            canvas.restore();
        }
        if (my0Var.r) {
            if ((getMeasuredHeight() - my0Var.b.getY()) - my0Var.b.getMeasuredHeight() > gm.L(48.0f)) {
                int i6 = my0Var.b0;
                paint3.setColor(i6 >= 0 ? cmb.v0(i6, my0Var.J0) : 0);
                canvas.drawRect(my0Var.b.getLeft() + my0Var.u0, my0Var.b.getY() + my0Var.b.getMeasuredHeight(), my0Var.b.getRight() - my0Var.u0, getMeasuredHeight(), paint3);
                return;
            }
            return;
        }
        if (!my0Var.A0()) {
            c(canvas, my0Var.s ? my0Var.D0 * 0.7f : 1.0f);
        }
        if (my0Var.n && (i2 = my0Var.U) != 0 && i2 > my0Var.T && my0Var.V) {
            Point point2 = gm.q;
            if (point2.x > point2.y) {
                canvas.drawRect(my0Var.b.getRight() - my0Var.u0, my0Var.b.getTranslationY(), my0Var.b.getRight() + my0Var.U, getMeasuredHeight(), paint3);
                paint = paint3;
                if (my0Var.n && (i = my0Var.T) != 0 && i > my0Var.U && my0Var.V) {
                    point = gm.q;
                    if (point.x > point.y) {
                        Paint paint4 = paint;
                        canvas.drawRect(0.0f, my0Var.b.getTranslationY(), my0Var.b.getLeft() + my0Var.u0, getMeasuredHeight(), paint4);
                        paint = paint4;
                    }
                }
                if (my0Var.b.getY() + my0Var.b.getMeasuredHeight() >= getMeasuredHeight()) {
                    int i7 = my0Var.b0;
                    paint.setColor(i7 >= 0 ? cmb.v0(i7, my0Var.J0) : 0);
                    canvas.drawRect(my0Var.b.getLeft() + my0Var.u0, my0Var.b.getY() + my0Var.b.getMeasuredHeight(), my0Var.b.getRight() - my0Var.u0, getMeasuredHeight(), paint);
                    return;
                }
                return;
            }
        }
        paint = paint3;
        if (my0Var.n) {
            point = gm.q;
            if (point.x > point.y) {
            }
        }
        if (my0Var.b.getY() + my0Var.b.getMeasuredHeight() >= getMeasuredHeight()) {
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j) {
        if (!(view instanceof CameraView)) {
            return super.drawChild(canvas, view, j);
        }
        if (this.H.A0()) {
            c(canvas, 1.0f);
        }
        return super.drawChild(canvas, view, j);
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
        boolean z;
        Paint paint = this.s;
        int alpha = paint.getAlpha();
        my0 my0Var = this.H;
        if (alpha >= 255 || !my0Var.n) {
            canvas2 = canvas;
            z = false;
        } else {
            float f = 0.0f;
            if (my0Var.w || (Build.VERSION.SDK_INT >= 29 && my0Var.M() > 0)) {
                f = Math.max(0.0f, my0Var.O() - (my0Var.b.getMeasuredHeight() - my0Var.b.getTranslationY()));
            }
            int O = my0Var.n ? my0Var.O() : 0;
            canvas.save();
            canvas.clipRect(my0Var.b.getLeft() + my0Var.u0, ((getMeasuredHeight() - O) + f) - my0Var.F0, my0Var.b.getRight() - my0Var.u0, getMeasuredHeight() + f, Region.Op.DIFFERENCE);
            canvas2 = canvas;
            z = true;
        }
        super.onDraw(canvas2);
        if (my0Var.n && my0Var.h != null && my0Var.f != 0) {
            int i = my0Var.b0;
            paint.setColor(i >= 0 ? cmb.v0(i, my0Var.J0) : 0);
            canvas2.drawRect(my0Var.b.getLeft() + my0Var.u0, (getMeasuredHeight() - my0Var.f) - (my0Var.n ? my0Var.O() : 0), my0Var.b.getRight() - my0Var.u0, getMeasuredHeight() - (my0Var.n ? my0Var.O() : 0), paint);
        }
        my0Var.a0();
        if (z) {
            canvas2.restore();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        my0 my0Var = this.H;
        return (my0Var.C() || my0Var.F(motionEvent)) ? d(motionEvent, true) : super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x00b9, code lost:
    
        if (java.lang.System.currentTimeMillis() < r2.h1) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00cf  */
    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        o1 o1Var;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        ValueAnimator valueAnimator;
        int i15 = i4 - this.x;
        my0 my0Var = this.H;
        my0Var.b0();
        int i16 = 1;
        my0Var.I--;
        ViewGroup viewGroup = my0Var.b;
        byte b = 0;
        if (viewGroup != null) {
            int measuredHeight = (i15 - i2) - viewGroup.getMeasuredHeight();
            if (my0Var.h != null) {
                i13 = my0Var.Q() + i;
                i14 = i3 - (my0Var.h != null ? (int) (r5.getSystemWindowInsetRight() * 1.0f) : 0);
                if (my0Var.G) {
                    measuredHeight = 0;
                } else if (!my0Var.x) {
                    float f = measuredHeight;
                    float systemWindowInsetBottom = my0Var.h.getSystemWindowInsetBottom();
                    int i17 = my0.k1;
                    measuredHeight = (int) (f - ((systemWindowInsetBottom * 1.0f) - (my0Var.n ? 0 : my0Var.O())));
                    if (Build.VERSION.SDK_INT >= 29) {
                        measuredHeight -= my0Var.M();
                    }
                }
            } else {
                i13 = i;
                i14 = i3;
            }
            int measuredWidth = ((i14 - i13) - my0Var.b.getMeasuredWidth()) / 2;
            if (my0Var.h != null) {
                measuredWidth += my0Var.Q();
            }
            if (my0Var.Q0 && my0Var.H == null && this.w && !my0Var.J) {
                boolean z2 = my0Var.R0;
                ViewGroup viewGroup2 = my0Var.b;
                if (z2) {
                    my0Var.b.setTranslationY(!my0Var.R0 ? r7.getBottom() - (my0Var.b.getMeasuredHeight() + measuredHeight) : r7.getTop() - measuredHeight);
                    my0Var.e0();
                    my0Var.n0(my0Var.b.getTranslationY());
                    valueAnimator = my0Var.P0;
                    if (valueAnimator != null) {
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(my0Var.b.getTranslationY(), 0.0f);
                    my0Var.P0 = ofFloat;
                    ofFloat.addUpdateListener(new iy0(this, b));
                    my0Var.P0.addListener(new jy0(this, (byte) 3));
                    my0Var.P0.setDuration(250L).setInterpolator(gb.w);
                    my0Var.P0.start();
                    my0Var.h1 = -1L;
                    ViewGroup viewGroup3 = my0Var.b;
                    viewGroup3.layout(measuredWidth, measuredHeight, viewGroup3.getMeasuredWidth() + measuredWidth, my0Var.b.getMeasuredHeight() + measuredHeight);
                    i5 = i13;
                    i6 = i14;
                } else {
                    my0Var.b.setTranslationY(!my0Var.R0 ? r7.getBottom() - (my0Var.b.getMeasuredHeight() + measuredHeight) : r7.getTop() - measuredHeight);
                    my0Var.e0();
                    my0Var.n0(my0Var.b.getTranslationY());
                    valueAnimator = my0Var.P0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(my0Var.b.getTranslationY(), 0.0f);
                    my0Var.P0 = ofFloat2;
                    ofFloat2.addUpdateListener(new iy0(this, b));
                    my0Var.P0.addListener(new jy0(this, (byte) 3));
                    my0Var.P0.setDuration(250L).setInterpolator(gb.w);
                    my0Var.P0.start();
                    my0Var.h1 = -1L;
                    ViewGroup viewGroup32 = my0Var.b;
                    viewGroup32.layout(measuredWidth, measuredHeight, viewGroup32.getMeasuredWidth() + measuredWidth, my0Var.b.getMeasuredHeight() + measuredHeight);
                    i5 = i13;
                    i6 = i14;
                }
            }
            if (my0Var.h1 > 0) {
            }
            ViewGroup viewGroup322 = my0Var.b;
            viewGroup322.layout(measuredWidth, measuredHeight, viewGroup322.getMeasuredWidth() + measuredWidth, my0Var.b.getMeasuredHeight() + measuredHeight);
            i5 = i13;
            i6 = i14;
        } else {
            i5 = i;
            i6 = i3;
        }
        int childCount = getChildCount();
        int i18 = 0;
        while (i18 < childCount) {
            View childAt = getChildAt(i18);
            if (childAt.getVisibility() != 8 && childAt != my0Var.b) {
                if (!my0Var.h0(childAt, i5, i2, i6, i15 - (my0Var.n ? my0Var.O() : 0))) {
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                    int measuredWidth2 = childAt.getMeasuredWidth();
                    int measuredHeight2 = childAt.getMeasuredHeight();
                    int i19 = layoutParams.gravity;
                    if (i19 == -1) {
                        i19 = 51;
                    }
                    int i20 = i19 & nm7.w1;
                    int i21 = i19 & 7;
                    if (i21 == i16) {
                        i7 = (((i6 - i5) - measuredWidth2) / 2) + layoutParams.leftMargin;
                        i8 = layoutParams.rightMargin;
                    } else if (i21 != 5) {
                        i9 = layoutParams.leftMargin;
                        if (i20 != 16) {
                            i10 = (((i15 - i2) - measuredHeight2) / 2) + layoutParams.topMargin;
                            i11 = layoutParams.bottomMargin;
                        } else if (i20 != 80) {
                            i12 = layoutParams.topMargin;
                            if (my0Var.h != null) {
                                i9 += my0Var.Q();
                            }
                            childAt.layout(i9, i12, measuredWidth2 + i9, measuredHeight2 + i12);
                        } else {
                            i10 = (i15 - i2) - measuredHeight2;
                            i11 = layoutParams.bottomMargin;
                        }
                        i12 = i10 - i11;
                        if (my0Var.h != null) {
                        }
                        childAt.layout(i9, i12, measuredWidth2 + i9, measuredHeight2 + i12);
                    } else {
                        i7 = i6 - measuredWidth2;
                        i8 = layoutParams.rightMargin;
                    }
                    i9 = i7 - i8;
                    if (i20 != 16) {
                    }
                    i12 = i10 - i11;
                    if (my0Var.h != null) {
                    }
                    childAt.layout(i9, i12, measuredWidth2 + i9, measuredHeight2 + i12);
                }
            }
            i18++;
            i16 = 1;
        }
        if (my0Var.I == 0 && (o1Var = my0Var.H) != null && !my0Var.E) {
            gm.r(o1Var);
            my0Var.H.run();
            my0Var.H = null;
        }
        if (my0Var.E && my0Var.d) {
            o1 o1Var2 = my0Var.H;
            if (o1Var2 != null) {
                gm.r(o1Var2);
                my0Var.H.run();
            }
            my0Var.E = false;
        }
        this.w = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00ef, code lost:
    
        if (r3 > (gm.L(10.0f) + gm.n)) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x010d  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        WindowInsets windowInsets;
        WindowInsets windowInsets2;
        ViewGroup viewGroup;
        int childCount;
        int makeMeasureSpec;
        float f;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        View rootView = getRootView();
        Rect rect = this.r;
        getWindowVisibleDisplayFrame(rect);
        my0 my0Var = this.H;
        int i5 = my0Var.f;
        if (rect.bottom == 0 || rect.top == 0) {
            my0Var.f = 0;
            i3 = 0;
        } else {
            float height = rootView.getHeight();
            if (rect.top != 0) {
                float f2 = gm.m;
                int i6 = my0.k1;
                f = f2 * 1.0f;
            } else {
                f = 0.0f;
            }
            float f3 = height - f;
            float o1 = gm.o1(rootView);
            int i7 = my0.k1;
            int max = Math.max(0, ((int) (f3 - (o1 * 1.0f))) - (rect.bottom - rect.top));
            my0Var.f = max;
            if (max < gm.L(20.0f)) {
                my0Var.f = 0;
                i3 = 0;
            } else {
                i3 = my0Var.f;
                my0Var.e = i3;
            }
            my0Var.S -= i3;
        }
        if (i5 != i3) {
            this.w = true;
        }
        my0Var.d = i3 > gm.L(20.0f);
        WindowInsets windowInsets3 = my0Var.h;
        if (windowInsets3 != null) {
            my0Var.S = windowInsets3.getSystemWindowInsetBottom();
            my0Var.T = my0Var.h.getSystemWindowInsetLeft();
            my0Var.U = my0Var.h.getSystemWindowInsetRight();
            if (Build.VERSION.SDK_INT >= 29) {
                my0Var.S += my0Var.M();
            }
            if (my0Var.d && rect.bottom != 0 && rect.top != 0) {
                my0Var.S -= my0Var.f;
            }
            if (!my0Var.n && !my0Var.x && !my0Var.y) {
                i4 = size2 - my0Var.O();
                this.x = size2 - i4;
                setMeasuredDimension(size, size2);
                windowInsets = my0Var.h;
                if (windowInsets != null && !my0Var.x) {
                    float systemWindowInsetBottom = windowInsets.getSystemWindowInsetBottom();
                    int i8 = my0.k1;
                    int i9 = (int) (systemWindowInsetBottom * 1.0f);
                    if (Build.VERSION.SDK_INT >= 29) {
                        i9 += my0Var.M();
                    }
                    if (my0Var.y) {
                    }
                    size2 -= i9;
                }
                int i10 = size2;
                windowInsets2 = my0Var.h;
                if (windowInsets2 != null) {
                    size -= my0Var.Q() + (windowInsets2 != null ? (int) (windowInsets2.getSystemWindowInsetRight() * 1.0f) : 0);
                }
                int i11 = size;
                my0Var.K0 = i11 >= i10;
                viewGroup = my0Var.b;
                if (viewGroup != null) {
                    if (my0Var.V) {
                        viewGroup.measure(View.MeasureSpec.makeMeasureSpec((my0Var.u0 << 1) + i11, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i10, TLObject.FLAG_31));
                    } else {
                        if (gm.O1()) {
                            float L = gm.L(500.0f);
                            Point point = gm.q;
                            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(((int) Math.min(L, Math.min(point.x, point.y) * 0.8f)) + (my0Var.u0 << 1), TLObject.FLAG_30);
                        } else {
                            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec((my0Var.K0 ? i11 : (int) Math.max(i11 * 0.8f, Math.min(gm.L(480.0f), i11))) + (my0Var.u0 << 1), TLObject.FLAG_30);
                        }
                        my0Var.b.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(i10, TLObject.FLAG_31));
                    }
                }
                childCount = getChildCount();
                for (int i12 = 0; i12 < childCount; i12++) {
                    View childAt = getChildAt(i12);
                    if (childAt.getVisibility() != 8 && childAt != my0Var.b) {
                        if (childAt instanceof yt5) {
                            measureChildWithMargins(childAt, View.MeasureSpec.makeMeasureSpec(i11, TLObject.FLAG_30), 0, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), TLObject.FLAG_30), 0);
                        } else if (!my0Var.i0(childAt, i11, i10)) {
                            measureChildWithMargins(childAt, View.MeasureSpec.makeMeasureSpec(i11, TLObject.FLAG_30), 0, View.MeasureSpec.makeMeasureSpec(i10, TLObject.FLAG_30), 0);
                        }
                    }
                }
            }
        }
        i4 = size2;
        this.x = size2 - i4;
        setMeasuredDimension(size, size2);
        windowInsets = my0Var.h;
        if (windowInsets != null) {
            float systemWindowInsetBottom2 = windowInsets.getSystemWindowInsetBottom();
            int i82 = my0.k1;
            int i92 = (int) (systemWindowInsetBottom2 * 1.0f);
            if (Build.VERSION.SDK_INT >= 29) {
            }
            if (my0Var.y) {
            }
            size2 -= i92;
        }
        int i102 = size2;
        windowInsets2 = my0Var.h;
        if (windowInsets2 != null) {
        }
        int i112 = size;
        my0Var.K0 = i112 >= i102;
        viewGroup = my0Var.b;
        if (viewGroup != null) {
        }
        childCount = getChildCount();
        while (i12 < childCount) {
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        my0 my0Var = this.H;
        if (my0Var.J || !my0Var.r0) {
            return;
        }
        a();
        float translationY = my0Var.b.getTranslationY();
        if (translationY <= 0.0f || i2 <= 0) {
            return;
        }
        float f = translationY - i2;
        iArr[1] = i2;
        my0Var.b.setTranslationY(f >= 0.0f ? f : 0.0f);
        my0Var.e0();
        my0Var.c.invalidate();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        my0 my0Var = this.H;
        if (my0Var.J || !my0Var.r0) {
            return;
        }
        a();
        if (i4 != 0) {
            float translationY = my0Var.b.getTranslationY() - i4;
            if (translationY < 0.0f) {
                translationY = 0.0f;
            }
            my0Var.b.setTranslationY(translationY);
            my0Var.e0();
            my0Var.c.invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        this.n.b = i;
        my0 my0Var = this.H;
        if (my0Var.J || !my0Var.r0) {
            return;
        }
        a();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        my0 my0Var = this.H;
        return !my0Var.J && my0Var.r0 && i == 2 && !my0Var.C();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        this.n.b = 0;
        my0 my0Var = this.H;
        if (my0Var.J || !my0Var.r0) {
            return;
        }
        b(0.0f, 0.0f);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return d(motionEvent, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        if (this.e && !this.f) {
            d(null, false);
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // vlb
    public final void updateColors() {
        my0 my0Var = this.H;
        try {
            int i = my0.k1;
            my0Var.C0();
        } catch (Exception e) {
            fc4.g(e, true);
        }
        my0Var.p0();
    }
}
