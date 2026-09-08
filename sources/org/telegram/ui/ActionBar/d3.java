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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.camera.CameraView;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.l70;
import org.telegram.ui.Components.pr;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public abstract class d3 extends FrameLayout {
    public boolean E;
    public final Paint F;
    public final /* synthetic */ f3 G;
    public VelocityTracker a;
    public int b;
    public int c;
    public int d;
    public boolean e;
    public boolean f;
    public AnimatorSet h;
    public final b2.q0 n;
    public final Rect r;
    public final Paint s;
    public boolean v;
    public int w;
    public float x;
    public float y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d3(f3 f3Var, Context context) {
        super(context);
        this.G = f3Var;
        this.a = null;
        this.d = -1;
        this.e = false;
        this.f = false;
        this.h = null;
        this.r = new Rect();
        this.s = new Paint();
        this.x = 0.0f;
        this.y = 0.0f;
        this.F = new Paint(1);
        this.n = new b2.q0();
        setWillNotDraw(false);
    }

    public final void a() {
        AnimatorSet animatorSet = this.h;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.h = null;
        }
        this.G.onSwipeStarts();
    }

    public final void b(float f7, float f10) {
        boolean z10;
        f3 f3Var = this.G;
        if ((f3Var.containerView.getTranslationY() >= AndroidUtilities.getPixelsInCM(0.8f, false) || (f10 >= 3500.0f && Math.abs(f10) >= Math.abs(f7))) && (f10 >= 0.0f || Math.abs(f10) < 3500.0f)) {
            z10 = f3Var.allowCustomAnimation;
            f3Var.allowCustomAnimation = false;
            f3Var.useFastDismiss = true;
            f3Var.dismiss();
            f3Var.allowCustomAnimation = z10;
            return;
        }
        this.e = false;
        this.h = new AnimatorSet();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new b3(this, 4));
        this.h.playTogether(ObjectAnimator.ofFloat(f3Var.containerView, "translationY", 0.0f), ofFloat);
        this.h.setDuration((int) ((Math.max(0.0f, r1) / AndroidUtilities.getPixelsInCM(0.8f, false)) * 250.0f));
        this.h.setInterpolator(pr.f);
        this.h.addListener(new c3(this, 3));
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
        this.h.start();
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
    
        if (r1 == 0) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(Canvas canvas, float f7) {
        boolean z10;
        float f10;
        float max;
        float f11;
        boolean z11;
        boolean z12;
        float f12;
        int i10;
        int i11;
        float f13;
        int i12;
        int i13 = Build.VERSION.SDK_INT;
        Paint paint = this.s;
        f3 f3Var = this.G;
        if (i13 >= 26) {
            int i14 = f3Var.navBarColorKey;
            if (i14 >= 0) {
                paint.setColor(f3Var.getThemedColor(i14));
            } else {
                paint.setColor(f3Var.navBarColor);
            }
        } else {
            paint.setColor(-16777216);
        }
        z10 = f3Var.transitionFromRight;
        if (!z10 || f3Var.containerView.getVisibility() == 0) {
            float f14 = 0.0f;
            if (f3Var.drawNavigationBar) {
                i12 = f3Var.bottomInset;
            }
            f10 = f3Var.currentPanTranslationY;
            if (f10 == 0.0f) {
                return;
            }
            int bottomInset = f3Var.drawNavigationBar ? f3Var.getBottomInset() : 0;
            if (!f3Var.scrollNavBar && (i13 < 29 || f3.access$1400(f3Var) <= 0)) {
                max = 0.0f;
            } else if (f3Var.drawDoubleNavigationBar) {
                f11 = f3Var.currentPanTranslationY;
                max = Math.max(0.0f, Math.min(bottomInset - f11, f3Var.containerView.getTranslationY()));
            } else {
                max = Math.max(0.0f, f3Var.getBottomInset() - (f3Var.containerView.getMeasuredHeight() - f3Var.containerView.getTranslationY()));
            }
            int alpha = paint.getAlpha();
            z11 = f3Var.transitionFromRight;
            if (z11) {
                f7 *= f3Var.containerView.getAlpha();
            }
            z12 = f3Var.transitionFromRight;
            int x10 = z12 ? (int) f3Var.containerView.getX() : f3Var.containerView.getLeft();
            if (f7 < 1.0f) {
                paint.setAlpha((int) (alpha * f7));
            }
            f12 = f3Var.currentPanTranslationY;
            canvas.drawRect(f3Var.backgroundPaddingLeft + x10, ((getMeasuredHeight() - bottomInset) + max) - f12, f3Var.containerView.getRight() - f3Var.backgroundPaddingLeft, getMeasuredHeight() + max, paint);
            paint.setAlpha(alpha);
            i10 = f3Var.overlayDrawNavBarColor;
            if (i10 != 0) {
                i11 = f3Var.overlayDrawNavBarColor;
                paint.setColor(i11);
                int alpha2 = paint.getAlpha();
                float navigationBarThirdButtonsFactor = AndroidUtilities.getNavigationBarThirdButtonsFactor(bottomInset);
                if (f7 < 1.0f) {
                    paint.setAlpha((int) (alpha2 * f7 * navigationBarThirdButtonsFactor));
                } else {
                    f14 = max;
                }
                if (paint.getAlpha() > 0) {
                    f13 = f3Var.currentPanTranslationY;
                    canvas.drawRect(x10 + f3Var.backgroundPaddingLeft, ((getMeasuredHeight() - bottomInset) + f14) - f13, f3Var.containerView.getRight() - f3Var.backgroundPaddingLeft, getMeasuredHeight() + f14, paint);
                }
                paint.setAlpha(alpha2);
            }
        }
    }

    public final boolean d(MotionEvent motionEvent, boolean z10) {
        boolean z11;
        boolean z12;
        int i10;
        boolean z13;
        int i11;
        f3 f3Var = this.G;
        z11 = f3Var.dismissed;
        int i12 = 0;
        if (!z11) {
            int i13 = 1;
            if (!f3Var.onContainerTouchEvent(motionEvent)) {
                int i14 = 3;
                int i15 = 2;
                if (f3Var.canSwipeToBack(motionEvent) || this.E) {
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
                        z12 = f3Var.disableScroll;
                        if (!z12 && this.e && !this.f && x10 > 0.0f && x10 / 3.0f > Math.abs(y3)) {
                            float abs = Math.abs(x10);
                            i10 = f3Var.touchSlop;
                            if (abs >= i10) {
                                this.b = (int) motionEvent.getX();
                                this.e = false;
                                this.f = true;
                            }
                        }
                        if (this.f) {
                            float f7 = this.y + x10;
                            this.y = f7;
                            f3Var.containerView.setTranslationX(Math.max(f7, 0.0f));
                            this.b = (int) motionEvent.getX();
                            f3Var.container.invalidate();
                        }
                    } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.d && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
                        if (this.a == null) {
                            this.a = VelocityTracker.obtain();
                        }
                        float xVelocity = this.a.getXVelocity();
                        float yVelocity = this.a.getYVelocity();
                        if (this.y >= f3Var.containerView.getMeasuredWidth() / 3.0f || (xVelocity >= 3500.0f && xVelocity >= yVelocity)) {
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.y, getMeasuredWidth());
                            ofFloat.addUpdateListener(new b3(this, i15));
                            ofFloat.addListener(new c3(this, i13));
                            pr prVar = pr.h;
                            ofFloat.setInterpolator(prVar);
                            ofFloat.setDuration(320L);
                            ofFloat.start();
                            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
                            ofFloat2.addUpdateListener(new b3(this, i14));
                            ofFloat2.setInterpolator(prVar);
                            ofFloat2.setDuration(320L);
                            ofFloat2.start();
                        } else {
                            float max = Math.max(this.y, 0.0f);
                            this.y = max;
                            ValueAnimator ofFloat3 = ValueAnimator.ofFloat(max, 0.0f);
                            ofFloat3.addUpdateListener(new b3(this, i13));
                            ofFloat3.addListener(new c3(this, i12));
                            ofFloat3.setInterpolator(pr.f);
                            ofFloat3.setDuration(220L);
                            ofFloat3.start();
                        }
                        this.e = false;
                        this.f = false;
                        this.d = -1;
                        this.E = false;
                    }
                } else if (f3Var.canDismissWithTouchOutside() && motionEvent != null && ((motionEvent.getAction() == 0 || motionEvent.getAction() == 2) && !this.f && !this.e && motionEvent.getPointerCount() == 1)) {
                    this.b = (int) motionEvent.getX();
                    int y10 = (int) motionEvent.getY();
                    this.c = y10;
                    if (f3Var.isTouchOutside(this.b, y10)) {
                        f3Var.onDismissWithTouchOutside();
                        return true;
                    }
                    f3Var.onScrollUpBegin(this.x);
                    this.d = motionEvent.getPointerId(0);
                    this.e = true;
                    a();
                    VelocityTracker velocityTracker = this.a;
                    if (velocityTracker != null) {
                        velocityTracker.clear();
                    }
                } else if (f3Var.canDismissWithSwipe() && motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.d) {
                    if (this.a == null) {
                        this.a = VelocityTracker.obtain();
                    }
                    float abs2 = Math.abs((int) (motionEvent.getX() - this.b));
                    float y11 = ((int) motionEvent.getY()) - this.c;
                    boolean onScrollUp = f3Var.onScrollUp(this.x + y11);
                    this.a.addMovement(motionEvent);
                    z13 = f3Var.disableScroll;
                    if (!z13 && this.e && !this.f && y11 > 0.0f && y11 / 3.0f > Math.abs(abs2)) {
                        float abs3 = Math.abs(y11);
                        i11 = f3Var.touchSlop;
                        if (abs3 >= i11) {
                            this.c = (int) motionEvent.getY();
                            this.e = false;
                            this.f = true;
                            requestDisallowInterceptTouchEvent(true);
                        }
                    }
                    if (this.f) {
                        float f10 = this.x + y11;
                        this.x = f10;
                        if (!onScrollUp) {
                            this.x = Math.max(f10, 0.0f);
                        }
                        f3Var.containerView.setTranslationY(Math.max(this.x, 0.0f));
                        f3Var.onContainerViewTranslation();
                        this.c = (int) motionEvent.getY();
                        f3Var.container.invalidate();
                    }
                } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.d && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
                    if (this.a == null) {
                        this.a = VelocityTracker.obtain();
                    }
                    this.a.computeCurrentVelocity(MediaDataController.MAX_STYLE_RUNS_COUNT);
                    f3Var.onScrollUpEnd(this.x);
                    if (this.f || this.x > 0.0f) {
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
                if ((z10 || !this.e) && !this.f && (f3Var.canDismissWithSwipe() || f3Var.canSwipeToBack(motionEvent))) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void dispatchDraw(Canvas canvas) {
        Paint paint;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        float f7;
        int i17;
        f3 f3Var = this.G;
        if (f3Var.containerView != null && this.w > 0) {
            i17 = f3Var.internalBackgroundColor;
            Paint paint2 = this.F;
            paint2.setColor(i17);
            canvas.drawRect(0.0f, (f3Var.containerView.getTranslationY() + (getMeasuredHeight() - this.w)) - 1.0f, getMeasuredWidth(), f3Var.containerView.getTranslationY() + getMeasuredHeight(), paint2);
        }
        int i18 = Build.VERSION.SDK_INT;
        Paint paint3 = this.s;
        if (i18 >= 26) {
            int i19 = f3Var.navBarColorKey;
            if (i19 >= 0) {
                paint3.setColor(f3Var.getThemedColor(i19));
            } else {
                paint3.setColor(f3Var.navBarColor);
            }
        } else {
            paint3.setColor(-16777216);
        }
        if (f3Var.drawDoubleNavigationBar && !f3Var.shouldOverlayCameraViewOverNavBar()) {
            c(canvas, 1.0f);
        }
        if (paint3.getAlpha() >= 255 || !f3Var.drawNavigationBar) {
            super.dispatchDraw(canvas);
        } else {
            float f10 = 0.0f;
            if (f3Var.scrollNavBar || (i18 >= 29 && f3.access$1400(f3Var) > 0)) {
                f10 = Math.max(0.0f, f3Var.getBottomInset() - (f3Var.containerView.getMeasuredHeight() - f3Var.containerView.getTranslationY()));
            }
            int bottomInset = f3Var.drawNavigationBar ? f3Var.getBottomInset() : 0;
            canvas.save();
            f7 = f3Var.currentPanTranslationY;
            canvas.clipRect(f3Var.containerView.getLeft() + f3Var.backgroundPaddingLeft, ((getMeasuredHeight() - bottomInset) + f10) - f7, f3Var.containerView.getRight() - f3Var.backgroundPaddingLeft, getMeasuredHeight() + f10, Region.Op.DIFFERENCE);
            super.dispatchDraw(canvas);
            canvas.restore();
        }
        if (f3Var.doNotOverlayNavigationBar) {
            if ((getMeasuredHeight() - f3Var.containerView.getY()) - f3Var.containerView.getMeasuredHeight() > AndroidUtilities.dp(48.0f)) {
                int i20 = f3Var.behindKeyboardColorKey;
                paint3.setColor(i20 >= 0 ? f3Var.getThemedColor(i20) : f3Var.behindKeyboardColor);
                canvas.drawRect(f3Var.containerView.getLeft() + f3Var.backgroundPaddingLeft, f3Var.containerView.getMeasuredHeight() + f3Var.containerView.getY(), f3Var.containerView.getRight() - f3Var.backgroundPaddingLeft, getMeasuredHeight(), paint3);
                return;
            }
            return;
        }
        if (!f3Var.shouldOverlayCameraViewOverNavBar()) {
            c(canvas, f3Var.drawDoubleNavigationBar ? f3Var.navigationBarAlpha * 0.7f : 1.0f);
        }
        if (f3Var.drawNavigationBar) {
            i13 = f3Var.rightInset;
            if (i13 != 0) {
                i14 = f3Var.rightInset;
                i15 = f3Var.leftInset;
                if (i14 > i15 && f3Var.fullWidth) {
                    Point point = AndroidUtilities.displaySize;
                    if (point.x > point.y) {
                        float right = f3Var.containerView.getRight() - f3Var.backgroundPaddingLeft;
                        float translationY = f3Var.containerView.getTranslationY();
                        int right2 = f3Var.containerView.getRight();
                        i16 = f3Var.rightInset;
                        paint = paint3;
                        canvas.drawRect(right, translationY, i16 + right2, getMeasuredHeight(), paint);
                        if (f3Var.drawNavigationBar) {
                            i10 = f3Var.leftInset;
                            if (i10 != 0) {
                                i11 = f3Var.leftInset;
                                i12 = f3Var.rightInset;
                                if (i11 > i12 && f3Var.fullWidth) {
                                    Point point2 = AndroidUtilities.displaySize;
                                    if (point2.x > point2.y) {
                                        canvas.drawRect(0.0f, f3Var.containerView.getTranslationY(), f3Var.containerView.getLeft() + f3Var.backgroundPaddingLeft, getMeasuredHeight(), paint);
                                    }
                                }
                            }
                        }
                        if (f3Var.containerView.getY() + f3Var.containerView.getMeasuredHeight() >= getMeasuredHeight()) {
                            int i21 = f3Var.behindKeyboardColorKey;
                            paint.setColor(i21 >= 0 ? f3Var.getThemedColor(i21) : f3Var.behindKeyboardColor);
                            canvas.drawRect(f3Var.containerView.getLeft() + f3Var.backgroundPaddingLeft, f3Var.containerView.getMeasuredHeight() + f3Var.containerView.getY(), f3Var.containerView.getRight() - f3Var.backgroundPaddingLeft, getMeasuredHeight(), paint);
                            return;
                        }
                        return;
                    }
                }
            }
        }
        paint = paint3;
        if (f3Var.drawNavigationBar) {
        }
        if (f3Var.containerView.getY() + f3Var.containerView.getMeasuredHeight() >= getMeasuredHeight()) {
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j3) {
        if (!(view instanceof CameraView)) {
            return super.drawChild(canvas, view, j3);
        }
        if (this.G.shouldOverlayCameraViewOverNavBar()) {
            c(canvas, 1.0f);
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        b2.q0 q0Var = this.n;
        return q0Var.b | q0Var.a;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        boolean z10;
        WindowInsets windowInsets;
        float f7;
        Paint paint = this.s;
        int alpha = paint.getAlpha();
        f3 f3Var = this.G;
        if (alpha >= 255 || !f3Var.drawNavigationBar) {
            canvas2 = canvas;
            z10 = false;
        } else {
            float f10 = 0.0f;
            if (f3Var.scrollNavBar || (Build.VERSION.SDK_INT >= 29 && f3.access$1400(f3Var) > 0)) {
                f10 = Math.max(0.0f, f3Var.getBottomInset() - (f3Var.containerView.getMeasuredHeight() - f3Var.containerView.getTranslationY()));
            }
            int bottomInset = f3Var.drawNavigationBar ? f3Var.getBottomInset() : 0;
            canvas.save();
            f7 = f3Var.currentPanTranslationY;
            canvas.clipRect(f3Var.containerView.getLeft() + f3Var.backgroundPaddingLeft, ((getMeasuredHeight() - bottomInset) + f10) - f7, f3Var.containerView.getRight() - f3Var.backgroundPaddingLeft, getMeasuredHeight() + f10, Region.Op.DIFFERENCE);
            canvas2 = canvas;
            z10 = true;
        }
        super.onDraw(canvas2);
        if (f3Var.drawNavigationBar) {
            windowInsets = f3Var.lastInsets;
            if (windowInsets != null && f3Var.keyboardHeight != 0) {
                int i10 = f3Var.behindKeyboardColorKey;
                paint.setColor(i10 >= 0 ? f3Var.getThemedColor(i10) : f3Var.behindKeyboardColor);
                canvas2.drawRect(f3Var.containerView.getLeft() + f3Var.backgroundPaddingLeft, (getMeasuredHeight() - f3Var.keyboardHeight) - (f3Var.drawNavigationBar ? f3Var.getBottomInset() : 0), f3Var.containerView.getRight() - f3Var.backgroundPaddingLeft, getMeasuredHeight() - (f3Var.drawNavigationBar ? f3Var.getBottomInset() : 0), paint);
            }
        }
        f3Var.onContainerDraw(canvas2);
        if (z10) {
            canvas2.restore();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        f3 f3Var = this.G;
        return (f3Var.canDismissWithSwipe() || f3Var.canSwipeToBack(motionEvent)) ? d(motionEvent, true) : super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c1, code lost:
    
        r11 = r3.containerView;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00c5, code lost:
    
        if (r3.smoothKeyboardByBottom == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00c7, code lost:
    
        r12 = r11.getBottom() - (r3.containerView.getMeasuredHeight() + r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00db, code lost:
    
        r11.setTranslationY(r12);
        r3.onContainerViewTranslation();
        r3.onSmoothContainerViewLayout(r3.containerView.getTranslationY());
        r11 = r3.keyboardContentAnimator;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ec, code lost:
    
        if (r11 == null) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ee, code lost:
    
        r11.cancel();
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00f1, code lost:
    
        r11 = android.animation.ValueAnimator.ofFloat(r3.containerView.getTranslationY(), 0.0f);
        r3.keyboardContentAnimator = r11;
        r11.addUpdateListener(new org.telegram.ui.ActionBar.b3(r17, r10));
        r3.keyboardContentAnimator.addListener(new org.telegram.ui.ActionBar.c3(r17, r9));
        r3.keyboardContentAnimator.setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.p1.w);
        r3.keyboardContentAnimator.start();
        r3.smoothContainerViewLayoutUntil = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d5, code lost:
    
        r12 = r11.getTop() - r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00bf, code lost:
    
        if (r11 < r13) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01b8  */
    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        Runnable runnable;
        int i15;
        f3 f3Var;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        WindowInsets windowInsets;
        WindowInsets windowInsets2;
        WindowInsets windowInsets3;
        long j3;
        long j10;
        boolean z11;
        WindowInsets windowInsets4;
        float f7;
        int i22 = i10;
        int i23 = i11;
        int i24 = i12;
        int i25 = i13 - this.w;
        f3 f3Var2 = this.G;
        f3Var2.onContainerLayout(i22, i23, i24, i25);
        f3.access$1510(f3Var2);
        ViewGroup viewGroup = f3Var2.containerView;
        int i26 = 1;
        int i27 = 2;
        int i28 = 0;
        if (viewGroup != null) {
            int measuredHeight = (i25 - i23) - viewGroup.getMeasuredHeight();
            windowInsets2 = f3Var2.lastInsets;
            if (windowInsets2 != null) {
                i22 += f3Var2.getLeftInset();
                i24 -= f3Var2.getRightInset();
                if (f3Var2.useSmoothKeyboard) {
                    measuredHeight = 0;
                } else if (!f3Var2.occupyNavigationBar) {
                    float f10 = measuredHeight;
                    windowInsets4 = f3Var2.lastInsets;
                    float systemWindowInsetBottom = windowInsets4.getSystemWindowInsetBottom();
                    f7 = f3Var2.hideSystemVerticalInsetsProgress;
                    measuredHeight = (int) (f10 - (((1.0f - f7) * systemWindowInsetBottom) - (f3Var2.drawNavigationBar ? 0 : f3Var2.getBottomInset())));
                    if (Build.VERSION.SDK_INT >= 29) {
                        measuredHeight -= f3.access$1400(f3Var2);
                    }
                }
            }
            int measuredWidth = ((i24 - i22) - f3Var2.containerView.getMeasuredWidth()) / 2;
            windowInsets3 = f3Var2.lastInsets;
            if (windowInsets3 != null) {
                measuredWidth += f3Var2.getLeftInset();
            }
            if (f3Var2.smoothKeyboardAnimationEnabled && f3Var2.startAnimationRunnable == null && this.v) {
                z11 = f3Var2.dismissed;
                if (!z11) {
                    if (f3Var2.smoothKeyboardByBottom) {
                    }
                }
            }
            j3 = f3Var2.smoothContainerViewLayoutUntil;
            if (j3 > 0) {
                long currentTimeMillis = System.currentTimeMillis();
                j10 = f3Var2.smoothContainerViewLayoutUntil;
            }
            ViewGroup viewGroup2 = f3Var2.containerView;
            viewGroup2.layout(measuredWidth, measuredHeight, viewGroup2.getMeasuredWidth() + measuredWidth, f3Var2.containerView.getMeasuredHeight() + measuredHeight);
        }
        int i29 = i24;
        int childCount = getChildCount();
        int i30 = 0;
        while (i30 < childCount) {
            View childAt = getChildAt(i30);
            if (childAt.getVisibility() == 8 || childAt == f3Var2.containerView) {
                f3 f3Var3 = f3Var2;
                i15 = i22;
                f3Var = f3Var3;
            } else {
                int bottomInset = f3Var2.drawNavigationBar ? f3Var2.getBottomInset() : 0;
                f3 f3Var4 = f3Var2;
                i15 = i22;
                f3Var = f3Var4;
                if (!f3Var.onCustomLayout(childAt, i15, i23, i29, i25 - bottomInset)) {
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                    int measuredWidth2 = childAt.getMeasuredWidth();
                    int measuredHeight2 = childAt.getMeasuredHeight();
                    int i31 = layoutParams.gravity;
                    if (i31 == -1) {
                        i31 = 51;
                    }
                    int i32 = i31 & 112;
                    int i33 = i31 & 7;
                    if (i33 == i26) {
                        i16 = (((i29 - i15) - measuredWidth2) / 2) + layoutParams.leftMargin;
                        i17 = layoutParams.rightMargin;
                    } else if (i33 != 5) {
                        i18 = layoutParams.leftMargin;
                        if (i32 != 16) {
                            i19 = (((i25 - i11) - measuredHeight2) / 2) + layoutParams.topMargin;
                            i20 = layoutParams.bottomMargin;
                        } else if (i32 != 80) {
                            i21 = layoutParams.topMargin;
                            windowInsets = f3Var.lastInsets;
                            if (windowInsets != null) {
                                i18 += f3Var.getLeftInset();
                            }
                            childAt.layout(i18, i21, measuredWidth2 + i18, measuredHeight2 + i21);
                        } else {
                            i19 = (i25 - i11) - measuredHeight2;
                            i20 = layoutParams.bottomMargin;
                        }
                        i21 = i19 - i20;
                        windowInsets = f3Var.lastInsets;
                        if (windowInsets != null) {
                        }
                        childAt.layout(i18, i21, measuredWidth2 + i18, measuredHeight2 + i21);
                    } else {
                        i16 = i29 - measuredWidth2;
                        i17 = layoutParams.rightMargin;
                    }
                    i18 = i16 - i17;
                    if (i32 != 16) {
                    }
                    i21 = i19 - i20;
                    windowInsets = f3Var.lastInsets;
                    if (windowInsets != null) {
                    }
                    childAt.layout(i18, i21, measuredWidth2 + i18, measuredHeight2 + i21);
                }
            }
            i30++;
            int i34 = i15;
            f3Var2 = f3Var;
            i22 = i34;
            i23 = i11;
            i26 = 1;
        }
        f3 f3Var5 = f3Var2;
        i14 = f3Var5.layoutCount;
        if (i14 == 0 && (runnable = f3Var5.startAnimationRunnable) != null && !f3Var5.waitingKeyboard) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            f3Var5.startAnimationRunnable.run();
            f3Var5.startAnimationRunnable = null;
        }
        if (f3Var5.waitingKeyboard && f3Var5.keyboardVisible) {
            Runnable runnable2 = f3Var5.startAnimationRunnable;
            if (runnable2 != null) {
                AndroidUtilities.cancelRunOnUIThread(runnable2);
                f3Var5.startAnimationRunnable.run();
            }
            f3Var5.waitingKeyboard = false;
        }
        this.v = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0111, code lost:
    
        if (r3 > (org.telegram.messenger.AndroidUtilities.dp(10.0f) + org.telegram.messenger.AndroidUtilities.navigationBarHeight)) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x019b  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i10, int i11) {
        WindowInsets windowInsets;
        int i12;
        WindowInsets windowInsets2;
        WindowInsets windowInsets3;
        ViewGroup viewGroup;
        int childCount;
        int makeMeasureSpec;
        WindowInsets windowInsets4;
        float f7;
        WindowInsets windowInsets5;
        WindowInsets windowInsets6;
        WindowInsets windowInsets7;
        float f10;
        float f11;
        float f12;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        View rootView = getRootView();
        Rect rect = this.r;
        getWindowVisibleDisplayFrame(rect);
        f3 f3Var = this.G;
        int i13 = f3Var.keyboardHeight;
        if (rect.bottom == 0 || rect.top == 0) {
            f3Var.keyboardHeight = 0;
        } else {
            float height = rootView.getHeight();
            if (rect.top != 0) {
                float f13 = AndroidUtilities.statusBarHeight;
                f12 = f3Var.hideSystemVerticalInsetsProgress;
                f10 = (1.0f - f12) * f13;
            } else {
                f10 = 0.0f;
            }
            float viewInset = AndroidUtilities.getViewInset(rootView);
            f11 = f3Var.hideSystemVerticalInsetsProgress;
            f3Var.keyboardHeight = Math.max(0, ((int) ((height - f10) - ((1.0f - f11) * viewInset))) - (rect.bottom - rect.top));
            if (f3Var.keyboardHeight < AndroidUtilities.dp(20.0f)) {
                f3Var.keyboardHeight = 0;
            } else {
                f3Var.lastKeyboardHeight = f3Var.keyboardHeight;
            }
            f3.access$1020(f3Var, f3Var.keyboardHeight);
        }
        int i14 = f3Var.keyboardHeight;
        if (i13 != i14) {
            this.v = true;
        }
        f3Var.keyboardVisible = i14 > AndroidUtilities.dp(20.0f);
        windowInsets = f3Var.lastInsets;
        if (windowInsets != null) {
            windowInsets5 = f3Var.lastInsets;
            f3Var.bottomInset = windowInsets5.getSystemWindowInsetBottom();
            windowInsets6 = f3Var.lastInsets;
            f3Var.leftInset = windowInsets6.getSystemWindowInsetLeft();
            windowInsets7 = f3Var.lastInsets;
            f3Var.rightInset = windowInsets7.getSystemWindowInsetRight();
            if (Build.VERSION.SDK_INT >= 29) {
                f3.access$1012(f3Var, f3.access$1400(f3Var));
            }
            if (f3Var.keyboardVisible && rect.bottom != 0 && rect.top != 0) {
                f3.access$1020(f3Var, f3Var.keyboardHeight);
            }
            if (!f3Var.drawNavigationBar && !f3Var.occupyNavigationBar && !f3Var.occupyNavigationBarWithoutKeyboard) {
                i12 = size2 - f3Var.getBottomInset();
                this.w = size2 - i12;
                setMeasuredDimension(size, size2);
                f3Var.navigationBarHeight = 0;
                windowInsets2 = f3Var.lastInsets;
                if (windowInsets2 != null && !f3Var.occupyNavigationBar) {
                    windowInsets4 = f3Var.lastInsets;
                    float systemWindowInsetBottom = windowInsets4.getSystemWindowInsetBottom();
                    f7 = f3Var.hideSystemVerticalInsetsProgress;
                    int i15 = (int) ((1.0f - f7) * systemWindowInsetBottom);
                    if (Build.VERSION.SDK_INT >= 29) {
                        i15 += f3.access$1400(f3Var);
                    }
                    if (f3Var.occupyNavigationBarWithoutKeyboard) {
                    }
                    size2 -= i15;
                    f3Var.navigationBarHeight = Math.min(i15, AndroidUtilities.navigationBarHeight);
                }
                int i16 = size2;
                windowInsets3 = f3Var.lastInsets;
                if (windowInsets3 != null) {
                    size -= f3Var.getLeftInset() + f3Var.getRightInset();
                }
                int i17 = size;
                f3Var.isPortrait = i17 < i16;
                viewGroup = f3Var.containerView;
                if (viewGroup != null) {
                    if (f3Var.fullWidth) {
                        viewGroup.measure(View.MeasureSpec.makeMeasureSpec((f3Var.backgroundPaddingLeft * 2) + i17, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i16, TLObject.FLAG_31));
                    } else {
                        if (AndroidUtilities.isTablet()) {
                            float dp = AndroidUtilities.dp(500.0f);
                            Point point = AndroidUtilities.displaySize;
                            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec((f3Var.backgroundPaddingLeft * 2) + ((int) Math.min(dp, Math.min(point.x, point.y) * 0.8f)), TLObject.FLAG_30);
                        } else {
                            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec((f3Var.backgroundPaddingLeft * 2) + f3Var.getBottomSheetWidth(f3Var.isPortrait, i17, i16), TLObject.FLAG_30);
                        }
                        f3Var.containerView.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(i16, TLObject.FLAG_31));
                    }
                }
                childCount = getChildCount();
                for (int i18 = 0; i18 < childCount; i18++) {
                    View childAt = getChildAt(i18);
                    if (childAt.getVisibility() != 8 && childAt != f3Var.containerView) {
                        if (childAt instanceof l70) {
                            measureChildWithMargins(childAt, View.MeasureSpec.makeMeasureSpec(i17, TLObject.FLAG_30), 0, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), TLObject.FLAG_30), 0);
                        } else if (!f3Var.onCustomMeasure(childAt, i17, i16)) {
                            measureChildWithMargins(childAt, View.MeasureSpec.makeMeasureSpec(i17, TLObject.FLAG_30), 0, View.MeasureSpec.makeMeasureSpec(i16, TLObject.FLAG_30), 0);
                        }
                    }
                }
            }
        }
        i12 = size2;
        this.w = size2 - i12;
        setMeasuredDimension(size, size2);
        f3Var.navigationBarHeight = 0;
        windowInsets2 = f3Var.lastInsets;
        if (windowInsets2 != null) {
            windowInsets4 = f3Var.lastInsets;
            float systemWindowInsetBottom2 = windowInsets4.getSystemWindowInsetBottom();
            f7 = f3Var.hideSystemVerticalInsetsProgress;
            int i152 = (int) ((1.0f - f7) * systemWindowInsetBottom2);
            if (Build.VERSION.SDK_INT >= 29) {
            }
            if (f3Var.occupyNavigationBarWithoutKeyboard) {
            }
            size2 -= i152;
            f3Var.navigationBarHeight = Math.min(i152, AndroidUtilities.navigationBarHeight);
        }
        int i162 = size2;
        windowInsets3 = f3Var.lastInsets;
        if (windowInsets3 != null) {
        }
        int i172 = size;
        f3Var.isPortrait = i172 < i162;
        viewGroup = f3Var.containerView;
        if (viewGroup != null) {
        }
        childCount = getChildCount();
        while (i18 < childCount) {
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
        boolean z10;
        f3 f3Var = this.G;
        z10 = f3Var.dismissed;
        if (z10 || !f3Var.allowNestedScroll) {
            return;
        }
        a();
        float translationY = f3Var.containerView.getTranslationY();
        if (translationY <= 0.0f || i11 <= 0) {
            return;
        }
        float f7 = translationY - i11;
        iArr[1] = i11;
        f3Var.containerView.setTranslationY(f7 >= 0.0f ? f7 : 0.0f);
        f3Var.onContainerViewTranslation();
        f3Var.container.invalidate();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        boolean z10;
        f3 f3Var = this.G;
        z10 = f3Var.dismissed;
        if (z10 || !f3Var.allowNestedScroll) {
            return;
        }
        a();
        if (i13 != 0) {
            float translationY = f3Var.containerView.getTranslationY() - i13;
            if (translationY < 0.0f) {
                translationY = 0.0f;
            }
            f3Var.containerView.setTranslationY(translationY);
            f3Var.onContainerViewTranslation();
            f3Var.container.invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i10) {
        boolean z10;
        this.n.a = i10;
        f3 f3Var = this.G;
        z10 = f3Var.dismissed;
        if (z10 || !f3Var.allowNestedScroll) {
            return;
        }
        a();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i10) {
        boolean z10;
        f3 f3Var = this.G;
        View view3 = f3Var.nestedScrollChild;
        if (view3 != null && view != view3) {
            return false;
        }
        z10 = f3Var.dismissed;
        return !z10 && f3Var.allowNestedScroll && i10 == 2 && !f3Var.canDismissWithSwipe();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        boolean z10;
        this.n.a = 0;
        f3 f3Var = this.G;
        z10 = f3Var.dismissed;
        if (z10 || !f3Var.allowNestedScroll) {
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
}
