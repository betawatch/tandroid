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
import org.telegram.ui.Components.qr;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public abstract class e3 extends FrameLayout {
    public boolean E;
    public final Paint F;
    public final /* synthetic */ g3 G;
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
    public e3(g3 g3Var, Context context) {
        super(context);
        this.G = g3Var;
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
        g3 g3Var = this.G;
        if ((g3Var.containerView.getTranslationY() >= AndroidUtilities.getPixelsInCM(0.8f, false) || (f10 >= 3500.0f && Math.abs(f10) >= Math.abs(f7))) && (f10 >= 0.0f || Math.abs(f10) < 3500.0f)) {
            z10 = g3Var.allowCustomAnimation;
            g3Var.allowCustomAnimation = false;
            g3Var.useFastDismiss = true;
            g3Var.dismiss();
            g3Var.allowCustomAnimation = z10;
            return;
        }
        this.e = false;
        this.h = new AnimatorSet();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new c3(this, 4));
        this.h.playTogether(ObjectAnimator.ofFloat(g3Var.containerView, "translationY", 0.0f), ofFloat);
        this.h.setDuration((int) ((Math.max(0.0f, r1) / AndroidUtilities.getPixelsInCM(0.8f, false)) * 250.0f));
        this.h.setInterpolator(qr.f);
        this.h.addListener(new d3(this, 3));
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
        g3 g3Var = this.G;
        if (i13 >= 26) {
            int i14 = g3Var.navBarColorKey;
            if (i14 >= 0) {
                paint.setColor(g3Var.getThemedColor(i14));
            } else {
                paint.setColor(g3Var.navBarColor);
            }
        } else {
            paint.setColor(-16777216);
        }
        z10 = g3Var.transitionFromRight;
        if (!z10 || g3Var.containerView.getVisibility() == 0) {
            float f14 = 0.0f;
            if (g3Var.drawNavigationBar) {
                i12 = g3Var.bottomInset;
            }
            f10 = g3Var.currentPanTranslationY;
            if (f10 == 0.0f) {
                return;
            }
            int bottomInset = g3Var.drawNavigationBar ? g3Var.getBottomInset() : 0;
            if (!g3Var.scrollNavBar && (i13 < 29 || g3.access$1400(g3Var) <= 0)) {
                max = 0.0f;
            } else if (g3Var.drawDoubleNavigationBar) {
                f11 = g3Var.currentPanTranslationY;
                max = Math.max(0.0f, Math.min(bottomInset - f11, g3Var.containerView.getTranslationY()));
            } else {
                max = Math.max(0.0f, g3Var.getBottomInset() - (g3Var.containerView.getMeasuredHeight() - g3Var.containerView.getTranslationY()));
            }
            int alpha = paint.getAlpha();
            z11 = g3Var.transitionFromRight;
            if (z11) {
                f7 *= g3Var.containerView.getAlpha();
            }
            z12 = g3Var.transitionFromRight;
            int x10 = z12 ? (int) g3Var.containerView.getX() : g3Var.containerView.getLeft();
            if (f7 < 1.0f) {
                paint.setAlpha((int) (alpha * f7));
            }
            f12 = g3Var.currentPanTranslationY;
            canvas.drawRect(g3Var.backgroundPaddingLeft + x10, ((getMeasuredHeight() - bottomInset) + max) - f12, g3Var.containerView.getRight() - g3Var.backgroundPaddingLeft, getMeasuredHeight() + max, paint);
            paint.setAlpha(alpha);
            i10 = g3Var.overlayDrawNavBarColor;
            if (i10 != 0) {
                i11 = g3Var.overlayDrawNavBarColor;
                paint.setColor(i11);
                int alpha2 = paint.getAlpha();
                float navigationBarThirdButtonsFactor = AndroidUtilities.getNavigationBarThirdButtonsFactor(bottomInset);
                if (f7 < 1.0f) {
                    paint.setAlpha((int) (alpha2 * f7 * navigationBarThirdButtonsFactor));
                } else {
                    f14 = max;
                }
                if (paint.getAlpha() > 0) {
                    f13 = g3Var.currentPanTranslationY;
                    canvas.drawRect(x10 + g3Var.backgroundPaddingLeft, ((getMeasuredHeight() - bottomInset) + f14) - f13, g3Var.containerView.getRight() - g3Var.backgroundPaddingLeft, getMeasuredHeight() + f14, paint);
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
        g3 g3Var = this.G;
        z11 = g3Var.dismissed;
        int i12 = 0;
        if (!z11) {
            int i13 = 1;
            if (!g3Var.onContainerTouchEvent(motionEvent)) {
                int i14 = 3;
                int i15 = 2;
                if (g3Var.canSwipeToBack(motionEvent) || this.E) {
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
                        z12 = g3Var.disableScroll;
                        if (!z12 && this.e && !this.f && x10 > 0.0f && x10 / 3.0f > Math.abs(y3)) {
                            float abs = Math.abs(x10);
                            i10 = g3Var.touchSlop;
                            if (abs >= i10) {
                                this.b = (int) motionEvent.getX();
                                this.e = false;
                                this.f = true;
                            }
                        }
                        if (this.f) {
                            float f7 = this.y + x10;
                            this.y = f7;
                            g3Var.containerView.setTranslationX(Math.max(f7, 0.0f));
                            this.b = (int) motionEvent.getX();
                            g3Var.container.invalidate();
                        }
                    } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.d && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
                        if (this.a == null) {
                            this.a = VelocityTracker.obtain();
                        }
                        float xVelocity = this.a.getXVelocity();
                        float yVelocity = this.a.getYVelocity();
                        if (this.y >= g3Var.containerView.getMeasuredWidth() / 3.0f || (xVelocity >= 3500.0f && xVelocity >= yVelocity)) {
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.y, getMeasuredWidth());
                            ofFloat.addUpdateListener(new c3(this, i15));
                            ofFloat.addListener(new d3(this, i13));
                            qr qrVar = qr.h;
                            ofFloat.setInterpolator(qrVar);
                            ofFloat.setDuration(320L);
                            ofFloat.start();
                            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
                            ofFloat2.addUpdateListener(new c3(this, i14));
                            ofFloat2.setInterpolator(qrVar);
                            ofFloat2.setDuration(320L);
                            ofFloat2.start();
                        } else {
                            float max = Math.max(this.y, 0.0f);
                            this.y = max;
                            ValueAnimator ofFloat3 = ValueAnimator.ofFloat(max, 0.0f);
                            ofFloat3.addUpdateListener(new c3(this, i13));
                            ofFloat3.addListener(new d3(this, i12));
                            ofFloat3.setInterpolator(qr.f);
                            ofFloat3.setDuration(220L);
                            ofFloat3.start();
                        }
                        this.e = false;
                        this.f = false;
                        this.d = -1;
                        this.E = false;
                    }
                } else if (g3Var.canDismissWithTouchOutside() && motionEvent != null && ((motionEvent.getAction() == 0 || motionEvent.getAction() == 2) && !this.f && !this.e && motionEvent.getPointerCount() == 1)) {
                    this.b = (int) motionEvent.getX();
                    int y10 = (int) motionEvent.getY();
                    this.c = y10;
                    if (g3Var.isTouchOutside(this.b, y10)) {
                        g3Var.onDismissWithTouchOutside();
                        return true;
                    }
                    g3Var.onScrollUpBegin(this.x);
                    this.d = motionEvent.getPointerId(0);
                    this.e = true;
                    a();
                    VelocityTracker velocityTracker = this.a;
                    if (velocityTracker != null) {
                        velocityTracker.clear();
                    }
                } else if (g3Var.canDismissWithSwipe() && motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.d) {
                    if (this.a == null) {
                        this.a = VelocityTracker.obtain();
                    }
                    float abs2 = Math.abs((int) (motionEvent.getX() - this.b));
                    float y11 = ((int) motionEvent.getY()) - this.c;
                    boolean onScrollUp = g3Var.onScrollUp(this.x + y11);
                    this.a.addMovement(motionEvent);
                    z13 = g3Var.disableScroll;
                    if (!z13 && this.e && !this.f && y11 > 0.0f && y11 / 3.0f > Math.abs(abs2)) {
                        float abs3 = Math.abs(y11);
                        i11 = g3Var.touchSlop;
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
                        g3Var.containerView.setTranslationY(Math.max(this.x, 0.0f));
                        g3Var.onContainerViewTranslation();
                        this.c = (int) motionEvent.getY();
                        g3Var.container.invalidate();
                    }
                } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.d && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
                    if (this.a == null) {
                        this.a = VelocityTracker.obtain();
                    }
                    this.a.computeCurrentVelocity(MediaDataController.MAX_STYLE_RUNS_COUNT);
                    g3Var.onScrollUpEnd(this.x);
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
                if ((z10 || !this.e) && !this.f && (g3Var.canDismissWithSwipe() || g3Var.canSwipeToBack(motionEvent))) {
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
        g3 g3Var = this.G;
        if (g3Var.containerView != null && this.w > 0) {
            i17 = g3Var.internalBackgroundColor;
            Paint paint2 = this.F;
            paint2.setColor(i17);
            canvas.drawRect(0.0f, (g3Var.containerView.getTranslationY() + (getMeasuredHeight() - this.w)) - 1.0f, getMeasuredWidth(), g3Var.containerView.getTranslationY() + getMeasuredHeight(), paint2);
        }
        int i18 = Build.VERSION.SDK_INT;
        Paint paint3 = this.s;
        if (i18 >= 26) {
            int i19 = g3Var.navBarColorKey;
            if (i19 >= 0) {
                paint3.setColor(g3Var.getThemedColor(i19));
            } else {
                paint3.setColor(g3Var.navBarColor);
            }
        } else {
            paint3.setColor(-16777216);
        }
        if (g3Var.drawDoubleNavigationBar && !g3Var.shouldOverlayCameraViewOverNavBar()) {
            c(canvas, 1.0f);
        }
        if (paint3.getAlpha() >= 255 || !g3Var.drawNavigationBar) {
            super.dispatchDraw(canvas);
        } else {
            float f10 = 0.0f;
            if (g3Var.scrollNavBar || (i18 >= 29 && g3.access$1400(g3Var) > 0)) {
                f10 = Math.max(0.0f, g3Var.getBottomInset() - (g3Var.containerView.getMeasuredHeight() - g3Var.containerView.getTranslationY()));
            }
            int bottomInset = g3Var.drawNavigationBar ? g3Var.getBottomInset() : 0;
            canvas.save();
            f7 = g3Var.currentPanTranslationY;
            canvas.clipRect(g3Var.containerView.getLeft() + g3Var.backgroundPaddingLeft, ((getMeasuredHeight() - bottomInset) + f10) - f7, g3Var.containerView.getRight() - g3Var.backgroundPaddingLeft, getMeasuredHeight() + f10, Region.Op.DIFFERENCE);
            super.dispatchDraw(canvas);
            canvas.restore();
        }
        if (g3Var.doNotOverlayNavigationBar) {
            if ((getMeasuredHeight() - g3Var.containerView.getY()) - g3Var.containerView.getMeasuredHeight() > AndroidUtilities.dp(48.0f)) {
                int i20 = g3Var.behindKeyboardColorKey;
                paint3.setColor(i20 >= 0 ? g3Var.getThemedColor(i20) : g3Var.behindKeyboardColor);
                canvas.drawRect(g3Var.containerView.getLeft() + g3Var.backgroundPaddingLeft, g3Var.containerView.getMeasuredHeight() + g3Var.containerView.getY(), g3Var.containerView.getRight() - g3Var.backgroundPaddingLeft, getMeasuredHeight(), paint3);
                return;
            }
            return;
        }
        if (!g3Var.shouldOverlayCameraViewOverNavBar()) {
            c(canvas, g3Var.drawDoubleNavigationBar ? g3Var.navigationBarAlpha * 0.7f : 1.0f);
        }
        if (g3Var.drawNavigationBar) {
            i13 = g3Var.rightInset;
            if (i13 != 0) {
                i14 = g3Var.rightInset;
                i15 = g3Var.leftInset;
                if (i14 > i15 && g3Var.fullWidth) {
                    Point point = AndroidUtilities.displaySize;
                    if (point.x > point.y) {
                        float right = g3Var.containerView.getRight() - g3Var.backgroundPaddingLeft;
                        float translationY = g3Var.containerView.getTranslationY();
                        int right2 = g3Var.containerView.getRight();
                        i16 = g3Var.rightInset;
                        paint = paint3;
                        canvas.drawRect(right, translationY, i16 + right2, getMeasuredHeight(), paint);
                        if (g3Var.drawNavigationBar) {
                            i10 = g3Var.leftInset;
                            if (i10 != 0) {
                                i11 = g3Var.leftInset;
                                i12 = g3Var.rightInset;
                                if (i11 > i12 && g3Var.fullWidth) {
                                    Point point2 = AndroidUtilities.displaySize;
                                    if (point2.x > point2.y) {
                                        canvas.drawRect(0.0f, g3Var.containerView.getTranslationY(), g3Var.containerView.getLeft() + g3Var.backgroundPaddingLeft, getMeasuredHeight(), paint);
                                    }
                                }
                            }
                        }
                        if (g3Var.containerView.getY() + g3Var.containerView.getMeasuredHeight() >= getMeasuredHeight()) {
                            int i21 = g3Var.behindKeyboardColorKey;
                            paint.setColor(i21 >= 0 ? g3Var.getThemedColor(i21) : g3Var.behindKeyboardColor);
                            canvas.drawRect(g3Var.containerView.getLeft() + g3Var.backgroundPaddingLeft, g3Var.containerView.getMeasuredHeight() + g3Var.containerView.getY(), g3Var.containerView.getRight() - g3Var.backgroundPaddingLeft, getMeasuredHeight(), paint);
                            return;
                        }
                        return;
                    }
                }
            }
        }
        paint = paint3;
        if (g3Var.drawNavigationBar) {
        }
        if (g3Var.containerView.getY() + g3Var.containerView.getMeasuredHeight() >= getMeasuredHeight()) {
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
        g3 g3Var = this.G;
        if (alpha >= 255 || !g3Var.drawNavigationBar) {
            canvas2 = canvas;
            z10 = false;
        } else {
            float f10 = 0.0f;
            if (g3Var.scrollNavBar || (Build.VERSION.SDK_INT >= 29 && g3.access$1400(g3Var) > 0)) {
                f10 = Math.max(0.0f, g3Var.getBottomInset() - (g3Var.containerView.getMeasuredHeight() - g3Var.containerView.getTranslationY()));
            }
            int bottomInset = g3Var.drawNavigationBar ? g3Var.getBottomInset() : 0;
            canvas.save();
            f7 = g3Var.currentPanTranslationY;
            canvas.clipRect(g3Var.containerView.getLeft() + g3Var.backgroundPaddingLeft, ((getMeasuredHeight() - bottomInset) + f10) - f7, g3Var.containerView.getRight() - g3Var.backgroundPaddingLeft, getMeasuredHeight() + f10, Region.Op.DIFFERENCE);
            canvas2 = canvas;
            z10 = true;
        }
        super.onDraw(canvas2);
        if (g3Var.drawNavigationBar) {
            windowInsets = g3Var.lastInsets;
            if (windowInsets != null && g3Var.keyboardHeight != 0) {
                int i10 = g3Var.behindKeyboardColorKey;
                paint.setColor(i10 >= 0 ? g3Var.getThemedColor(i10) : g3Var.behindKeyboardColor);
                canvas2.drawRect(g3Var.containerView.getLeft() + g3Var.backgroundPaddingLeft, (getMeasuredHeight() - g3Var.keyboardHeight) - (g3Var.drawNavigationBar ? g3Var.getBottomInset() : 0), g3Var.containerView.getRight() - g3Var.backgroundPaddingLeft, getMeasuredHeight() - (g3Var.drawNavigationBar ? g3Var.getBottomInset() : 0), paint);
            }
        }
        g3Var.onContainerDraw(canvas2);
        if (z10) {
            canvas2.restore();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        g3 g3Var = this.G;
        return (g3Var.canDismissWithSwipe() || g3Var.canSwipeToBack(motionEvent)) ? d(motionEvent, true) : super.onInterceptTouchEvent(motionEvent);
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
        r11.addUpdateListener(new org.telegram.ui.ActionBar.c3(r17, r10));
        r3.keyboardContentAnimator.addListener(new org.telegram.ui.ActionBar.d3(r17, r9));
        r3.keyboardContentAnimator.setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.q1.w);
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
        g3 g3Var;
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
        g3 g3Var2 = this.G;
        g3Var2.onContainerLayout(i22, i23, i24, i25);
        g3.access$1510(g3Var2);
        ViewGroup viewGroup = g3Var2.containerView;
        int i26 = 1;
        int i27 = 2;
        int i28 = 0;
        if (viewGroup != null) {
            int measuredHeight = (i25 - i23) - viewGroup.getMeasuredHeight();
            windowInsets2 = g3Var2.lastInsets;
            if (windowInsets2 != null) {
                i22 += g3Var2.getLeftInset();
                i24 -= g3Var2.getRightInset();
                if (g3Var2.useSmoothKeyboard) {
                    measuredHeight = 0;
                } else if (!g3Var2.occupyNavigationBar) {
                    float f10 = measuredHeight;
                    windowInsets4 = g3Var2.lastInsets;
                    float systemWindowInsetBottom = windowInsets4.getSystemWindowInsetBottom();
                    f7 = g3Var2.hideSystemVerticalInsetsProgress;
                    measuredHeight = (int) (f10 - (((1.0f - f7) * systemWindowInsetBottom) - (g3Var2.drawNavigationBar ? 0 : g3Var2.getBottomInset())));
                    if (Build.VERSION.SDK_INT >= 29) {
                        measuredHeight -= g3.access$1400(g3Var2);
                    }
                }
            }
            int measuredWidth = ((i24 - i22) - g3Var2.containerView.getMeasuredWidth()) / 2;
            windowInsets3 = g3Var2.lastInsets;
            if (windowInsets3 != null) {
                measuredWidth += g3Var2.getLeftInset();
            }
            if (g3Var2.smoothKeyboardAnimationEnabled && g3Var2.startAnimationRunnable == null && this.v) {
                z11 = g3Var2.dismissed;
                if (!z11) {
                    if (g3Var2.smoothKeyboardByBottom) {
                    }
                }
            }
            j3 = g3Var2.smoothContainerViewLayoutUntil;
            if (j3 > 0) {
                long currentTimeMillis = System.currentTimeMillis();
                j10 = g3Var2.smoothContainerViewLayoutUntil;
            }
            ViewGroup viewGroup2 = g3Var2.containerView;
            viewGroup2.layout(measuredWidth, measuredHeight, viewGroup2.getMeasuredWidth() + measuredWidth, g3Var2.containerView.getMeasuredHeight() + measuredHeight);
        }
        int i29 = i24;
        int childCount = getChildCount();
        int i30 = 0;
        while (i30 < childCount) {
            View childAt = getChildAt(i30);
            if (childAt.getVisibility() == 8 || childAt == g3Var2.containerView) {
                g3 g3Var3 = g3Var2;
                i15 = i22;
                g3Var = g3Var3;
            } else {
                int bottomInset = g3Var2.drawNavigationBar ? g3Var2.getBottomInset() : 0;
                g3 g3Var4 = g3Var2;
                i15 = i22;
                g3Var = g3Var4;
                if (!g3Var.onCustomLayout(childAt, i15, i23, i29, i25 - bottomInset)) {
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
                            windowInsets = g3Var.lastInsets;
                            if (windowInsets != null) {
                                i18 += g3Var.getLeftInset();
                            }
                            childAt.layout(i18, i21, measuredWidth2 + i18, measuredHeight2 + i21);
                        } else {
                            i19 = (i25 - i11) - measuredHeight2;
                            i20 = layoutParams.bottomMargin;
                        }
                        i21 = i19 - i20;
                        windowInsets = g3Var.lastInsets;
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
                    windowInsets = g3Var.lastInsets;
                    if (windowInsets != null) {
                    }
                    childAt.layout(i18, i21, measuredWidth2 + i18, measuredHeight2 + i21);
                }
            }
            i30++;
            int i34 = i15;
            g3Var2 = g3Var;
            i22 = i34;
            i23 = i11;
            i26 = 1;
        }
        g3 g3Var5 = g3Var2;
        i14 = g3Var5.layoutCount;
        if (i14 == 0 && (runnable = g3Var5.startAnimationRunnable) != null && !g3Var5.waitingKeyboard) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            g3Var5.startAnimationRunnable.run();
            g3Var5.startAnimationRunnable = null;
        }
        if (g3Var5.waitingKeyboard && g3Var5.keyboardVisible) {
            Runnable runnable2 = g3Var5.startAnimationRunnable;
            if (runnable2 != null) {
                AndroidUtilities.cancelRunOnUIThread(runnable2);
                g3Var5.startAnimationRunnable.run();
            }
            g3Var5.waitingKeyboard = false;
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
        g3 g3Var = this.G;
        int i13 = g3Var.keyboardHeight;
        if (rect.bottom == 0 || rect.top == 0) {
            g3Var.keyboardHeight = 0;
        } else {
            float height = rootView.getHeight();
            if (rect.top != 0) {
                float f13 = AndroidUtilities.statusBarHeight;
                f12 = g3Var.hideSystemVerticalInsetsProgress;
                f10 = (1.0f - f12) * f13;
            } else {
                f10 = 0.0f;
            }
            float viewInset = AndroidUtilities.getViewInset(rootView);
            f11 = g3Var.hideSystemVerticalInsetsProgress;
            g3Var.keyboardHeight = Math.max(0, ((int) ((height - f10) - ((1.0f - f11) * viewInset))) - (rect.bottom - rect.top));
            if (g3Var.keyboardHeight < AndroidUtilities.dp(20.0f)) {
                g3Var.keyboardHeight = 0;
            } else {
                g3Var.lastKeyboardHeight = g3Var.keyboardHeight;
            }
            g3.access$1020(g3Var, g3Var.keyboardHeight);
        }
        int i14 = g3Var.keyboardHeight;
        if (i13 != i14) {
            this.v = true;
        }
        g3Var.keyboardVisible = i14 > AndroidUtilities.dp(20.0f);
        windowInsets = g3Var.lastInsets;
        if (windowInsets != null) {
            windowInsets5 = g3Var.lastInsets;
            g3Var.bottomInset = windowInsets5.getSystemWindowInsetBottom();
            windowInsets6 = g3Var.lastInsets;
            g3Var.leftInset = windowInsets6.getSystemWindowInsetLeft();
            windowInsets7 = g3Var.lastInsets;
            g3Var.rightInset = windowInsets7.getSystemWindowInsetRight();
            if (Build.VERSION.SDK_INT >= 29) {
                g3.access$1012(g3Var, g3.access$1400(g3Var));
            }
            if (g3Var.keyboardVisible && rect.bottom != 0 && rect.top != 0) {
                g3.access$1020(g3Var, g3Var.keyboardHeight);
            }
            if (!g3Var.drawNavigationBar && !g3Var.occupyNavigationBar && !g3Var.occupyNavigationBarWithoutKeyboard) {
                i12 = size2 - g3Var.getBottomInset();
                this.w = size2 - i12;
                setMeasuredDimension(size, size2);
                g3Var.navigationBarHeight = 0;
                windowInsets2 = g3Var.lastInsets;
                if (windowInsets2 != null && !g3Var.occupyNavigationBar) {
                    windowInsets4 = g3Var.lastInsets;
                    float systemWindowInsetBottom = windowInsets4.getSystemWindowInsetBottom();
                    f7 = g3Var.hideSystemVerticalInsetsProgress;
                    int i15 = (int) ((1.0f - f7) * systemWindowInsetBottom);
                    if (Build.VERSION.SDK_INT >= 29) {
                        i15 += g3.access$1400(g3Var);
                    }
                    if (g3Var.occupyNavigationBarWithoutKeyboard) {
                    }
                    size2 -= i15;
                    g3Var.navigationBarHeight = Math.min(i15, AndroidUtilities.navigationBarHeight);
                }
                int i16 = size2;
                windowInsets3 = g3Var.lastInsets;
                if (windowInsets3 != null) {
                    size -= g3Var.getLeftInset() + g3Var.getRightInset();
                }
                int i17 = size;
                g3Var.isPortrait = i17 < i16;
                viewGroup = g3Var.containerView;
                if (viewGroup != null) {
                    if (g3Var.fullWidth) {
                        viewGroup.measure(View.MeasureSpec.makeMeasureSpec((g3Var.backgroundPaddingLeft * 2) + i17, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i16, TLObject.FLAG_31));
                    } else {
                        if (AndroidUtilities.isTablet()) {
                            float dp = AndroidUtilities.dp(500.0f);
                            Point point = AndroidUtilities.displaySize;
                            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec((g3Var.backgroundPaddingLeft * 2) + ((int) Math.min(dp, Math.min(point.x, point.y) * 0.8f)), TLObject.FLAG_30);
                        } else {
                            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec((g3Var.backgroundPaddingLeft * 2) + g3Var.getBottomSheetWidth(g3Var.isPortrait, i17, i16), TLObject.FLAG_30);
                        }
                        g3Var.containerView.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(i16, TLObject.FLAG_31));
                    }
                }
                childCount = getChildCount();
                for (int i18 = 0; i18 < childCount; i18++) {
                    View childAt = getChildAt(i18);
                    if (childAt.getVisibility() != 8 && childAt != g3Var.containerView) {
                        if (childAt instanceof l70) {
                            measureChildWithMargins(childAt, View.MeasureSpec.makeMeasureSpec(i17, TLObject.FLAG_30), 0, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), TLObject.FLAG_30), 0);
                        } else if (!g3Var.onCustomMeasure(childAt, i17, i16)) {
                            measureChildWithMargins(childAt, View.MeasureSpec.makeMeasureSpec(i17, TLObject.FLAG_30), 0, View.MeasureSpec.makeMeasureSpec(i16, TLObject.FLAG_30), 0);
                        }
                    }
                }
            }
        }
        i12 = size2;
        this.w = size2 - i12;
        setMeasuredDimension(size, size2);
        g3Var.navigationBarHeight = 0;
        windowInsets2 = g3Var.lastInsets;
        if (windowInsets2 != null) {
            windowInsets4 = g3Var.lastInsets;
            float systemWindowInsetBottom2 = windowInsets4.getSystemWindowInsetBottom();
            f7 = g3Var.hideSystemVerticalInsetsProgress;
            int i152 = (int) ((1.0f - f7) * systemWindowInsetBottom2);
            if (Build.VERSION.SDK_INT >= 29) {
            }
            if (g3Var.occupyNavigationBarWithoutKeyboard) {
            }
            size2 -= i152;
            g3Var.navigationBarHeight = Math.min(i152, AndroidUtilities.navigationBarHeight);
        }
        int i162 = size2;
        windowInsets3 = g3Var.lastInsets;
        if (windowInsets3 != null) {
        }
        int i172 = size;
        g3Var.isPortrait = i172 < i162;
        viewGroup = g3Var.containerView;
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
        g3 g3Var = this.G;
        z10 = g3Var.dismissed;
        if (z10 || !g3Var.allowNestedScroll) {
            return;
        }
        a();
        float translationY = g3Var.containerView.getTranslationY();
        if (translationY <= 0.0f || i11 <= 0) {
            return;
        }
        float f7 = translationY - i11;
        iArr[1] = i11;
        g3Var.containerView.setTranslationY(f7 >= 0.0f ? f7 : 0.0f);
        g3Var.onContainerViewTranslation();
        g3Var.container.invalidate();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        boolean z10;
        g3 g3Var = this.G;
        z10 = g3Var.dismissed;
        if (z10 || !g3Var.allowNestedScroll) {
            return;
        }
        a();
        if (i13 != 0) {
            float translationY = g3Var.containerView.getTranslationY() - i13;
            if (translationY < 0.0f) {
                translationY = 0.0f;
            }
            g3Var.containerView.setTranslationY(translationY);
            g3Var.onContainerViewTranslation();
            g3Var.container.invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i10) {
        boolean z10;
        this.n.a = i10;
        g3 g3Var = this.G;
        z10 = g3Var.dismissed;
        if (z10 || !g3Var.allowNestedScroll) {
            return;
        }
        a();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i10) {
        boolean z10;
        g3 g3Var = this.G;
        View view3 = g3Var.nestedScrollChild;
        if (view3 != null && view != view3) {
            return false;
        }
        z10 = g3Var.dismissed;
        return !z10 && g3Var.allowNestedScroll && i10 == 2 && !g3Var.canDismissWithSwipe();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        boolean z10;
        this.n.a = 0;
        g3 g3Var = this.G;
        z10 = g3Var.dismissed;
        if (z10 || !g3Var.allowNestedScroll) {
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
