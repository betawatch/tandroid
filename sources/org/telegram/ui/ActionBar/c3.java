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
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.z60;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public abstract class c3 extends FrameLayout {
    public boolean A;
    public final Paint B;
    public final /* synthetic */ e3 C;
    public VelocityTracker a;
    public int b;
    public int c;
    public int d;
    public boolean e;
    public boolean f;
    public AnimatorSet h;
    public final d5.p n;
    public final Rect r;
    public final Paint s;
    public boolean v;
    public int w;
    public float x;
    public float y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c3(e3 e3Var, Context context) {
        super(context);
        this.C = e3Var;
        this.a = null;
        this.d = -1;
        this.e = false;
        this.f = false;
        this.h = null;
        this.r = new Rect();
        this.s = new Paint();
        this.x = 0.0f;
        this.y = 0.0f;
        this.B = new Paint(1);
        this.n = new d5.p();
        setWillNotDraw(false);
    }

    public final void a() {
        AnimatorSet animatorSet = this.h;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.h = null;
        }
        this.C.onSwipeStarts();
    }

    public final void b(float f10, float f11) {
        boolean z10;
        e3 e3Var = this.C;
        if ((e3Var.containerView.getTranslationY() >= AndroidUtilities.getPixelsInCM(0.8f, false) || (f11 >= 3500.0f && Math.abs(f11) >= Math.abs(f10))) && (f11 >= 0.0f || Math.abs(f11) < 3500.0f)) {
            z10 = e3Var.allowCustomAnimation;
            e3Var.allowCustomAnimation = false;
            e3Var.useFastDismiss = true;
            e3Var.dismiss();
            e3Var.allowCustomAnimation = z10;
            return;
        }
        this.e = false;
        this.h = new AnimatorSet();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new a3(this, 4));
        this.h.playTogether(ObjectAnimator.ofFloat(e3Var.containerView, "translationY", 0.0f), ofFloat);
        this.h.setDuration((int) ((Math.max(0.0f, r1) / AndroidUtilities.getPixelsInCM(0.8f, false)) * 250.0f));
        this.h.setInterpolator(er.f);
        this.h.addListener(new b3(this, 3));
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
        this.h.start();
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
    
        if (r1 == 0) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(Canvas canvas, float f10) {
        boolean z10;
        float f11;
        float max;
        float f12;
        boolean z11;
        boolean z12;
        float f13;
        int i10;
        int i11;
        float f14;
        int i12;
        int i13 = Build.VERSION.SDK_INT;
        Paint paint = this.s;
        e3 e3Var = this.C;
        if (i13 >= 26) {
            int i14 = e3Var.navBarColorKey;
            if (i14 >= 0) {
                paint.setColor(e3Var.getThemedColor(i14));
            } else {
                paint.setColor(e3Var.navBarColor);
            }
        } else {
            paint.setColor(-16777216);
        }
        z10 = e3Var.transitionFromRight;
        if (!z10 || e3Var.containerView.getVisibility() == 0) {
            float f15 = 0.0f;
            if (e3Var.drawNavigationBar) {
                i12 = e3Var.bottomInset;
            }
            f11 = e3Var.currentPanTranslationY;
            if (f11 == 0.0f) {
                return;
            }
            int bottomInset = e3Var.drawNavigationBar ? e3Var.getBottomInset() : 0;
            if (!e3Var.scrollNavBar && (i13 < 29 || e3.access$1400(e3Var) <= 0)) {
                max = 0.0f;
            } else if (e3Var.drawDoubleNavigationBar) {
                f12 = e3Var.currentPanTranslationY;
                max = Math.max(0.0f, Math.min(bottomInset - f12, e3Var.containerView.getTranslationY()));
            } else {
                max = Math.max(0.0f, e3Var.getBottomInset() - (e3Var.containerView.getMeasuredHeight() - e3Var.containerView.getTranslationY()));
            }
            int alpha = paint.getAlpha();
            z11 = e3Var.transitionFromRight;
            if (z11) {
                f10 *= e3Var.containerView.getAlpha();
            }
            z12 = e3Var.transitionFromRight;
            int x8 = z12 ? (int) e3Var.containerView.getX() : e3Var.containerView.getLeft();
            if (f10 < 1.0f) {
                paint.setAlpha((int) (alpha * f10));
            }
            f13 = e3Var.currentPanTranslationY;
            canvas.drawRect(e3Var.backgroundPaddingLeft + x8, ((getMeasuredHeight() - bottomInset) + max) - f13, e3Var.containerView.getRight() - e3Var.backgroundPaddingLeft, getMeasuredHeight() + max, paint);
            paint.setAlpha(alpha);
            i10 = e3Var.overlayDrawNavBarColor;
            if (i10 != 0) {
                i11 = e3Var.overlayDrawNavBarColor;
                paint.setColor(i11);
                int alpha2 = paint.getAlpha();
                float navigationBarThirdButtonsFactor = AndroidUtilities.getNavigationBarThirdButtonsFactor(bottomInset);
                if (f10 < 1.0f) {
                    paint.setAlpha((int) (alpha2 * f10 * navigationBarThirdButtonsFactor));
                } else {
                    f15 = max;
                }
                if (paint.getAlpha() > 0) {
                    f14 = e3Var.currentPanTranslationY;
                    canvas.drawRect(x8 + e3Var.backgroundPaddingLeft, ((getMeasuredHeight() - bottomInset) + f15) - f14, e3Var.containerView.getRight() - e3Var.backgroundPaddingLeft, getMeasuredHeight() + f15, paint);
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
        e3 e3Var = this.C;
        z11 = e3Var.dismissed;
        int i12 = 0;
        if (!z11) {
            int i13 = 1;
            if (!e3Var.onContainerTouchEvent(motionEvent)) {
                int i14 = 3;
                int i15 = 2;
                if (e3Var.canSwipeToBack(motionEvent) || this.A) {
                    if (motionEvent != null && ((motionEvent.getAction() == 0 || motionEvent.getAction() == 2) && !this.f && !this.e && motionEvent.getPointerCount() == 1)) {
                        this.A = true;
                        this.b = (int) motionEvent.getX();
                        this.c = (int) motionEvent.getY();
                        this.d = motionEvent.getPointerId(0);
                        this.e = true;
                        a();
                    } else if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.d) {
                        float x8 = motionEvent.getX() - this.b;
                        float y10 = motionEvent.getY() - this.c;
                        if (this.a == null) {
                            this.a = VelocityTracker.obtain();
                        }
                        this.a.addMovement(motionEvent);
                        z12 = e3Var.disableScroll;
                        if (!z12 && this.e && !this.f && x8 > 0.0f && x8 / 3.0f > Math.abs(y10)) {
                            float abs = Math.abs(x8);
                            i10 = e3Var.touchSlop;
                            if (abs >= i10) {
                                this.b = (int) motionEvent.getX();
                                this.e = false;
                                this.f = true;
                            }
                        }
                        if (this.f) {
                            float f10 = this.y + x8;
                            this.y = f10;
                            e3Var.containerView.setTranslationX(Math.max(f10, 0.0f));
                            this.b = (int) motionEvent.getX();
                            e3Var.container.invalidate();
                        }
                    } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.d && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
                        if (this.a == null) {
                            this.a = VelocityTracker.obtain();
                        }
                        float xVelocity = this.a.getXVelocity();
                        float yVelocity = this.a.getYVelocity();
                        if (this.y >= e3Var.containerView.getMeasuredWidth() / 3.0f || (xVelocity >= 3500.0f && xVelocity >= yVelocity)) {
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.y, getMeasuredWidth());
                            ofFloat.addUpdateListener(new a3(this, i15));
                            ofFloat.addListener(new b3(this, i13));
                            er erVar = er.h;
                            ofFloat.setInterpolator(erVar);
                            ofFloat.setDuration(320L);
                            ofFloat.start();
                            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
                            ofFloat2.addUpdateListener(new a3(this, i14));
                            ofFloat2.setInterpolator(erVar);
                            ofFloat2.setDuration(320L);
                            ofFloat2.start();
                        } else {
                            float max = Math.max(this.y, 0.0f);
                            this.y = max;
                            ValueAnimator ofFloat3 = ValueAnimator.ofFloat(max, 0.0f);
                            ofFloat3.addUpdateListener(new a3(this, i13));
                            ofFloat3.addListener(new b3(this, i12));
                            ofFloat3.setInterpolator(er.f);
                            ofFloat3.setDuration(220L);
                            ofFloat3.start();
                        }
                        this.e = false;
                        this.f = false;
                        this.d = -1;
                        this.A = false;
                    }
                } else if (e3Var.canDismissWithTouchOutside() && motionEvent != null && ((motionEvent.getAction() == 0 || motionEvent.getAction() == 2) && !this.f && !this.e && motionEvent.getPointerCount() == 1)) {
                    this.b = (int) motionEvent.getX();
                    int y11 = (int) motionEvent.getY();
                    this.c = y11;
                    if (e3Var.isTouchOutside(this.b, y11)) {
                        e3Var.onDismissWithTouchOutside();
                        return true;
                    }
                    e3Var.onScrollUpBegin(this.x);
                    this.d = motionEvent.getPointerId(0);
                    this.e = true;
                    a();
                    VelocityTracker velocityTracker = this.a;
                    if (velocityTracker != null) {
                        velocityTracker.clear();
                    }
                } else if (e3Var.canDismissWithSwipe() && motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.d) {
                    if (this.a == null) {
                        this.a = VelocityTracker.obtain();
                    }
                    float abs2 = Math.abs((int) (motionEvent.getX() - this.b));
                    float y12 = ((int) motionEvent.getY()) - this.c;
                    boolean onScrollUp = e3Var.onScrollUp(this.x + y12);
                    this.a.addMovement(motionEvent);
                    z13 = e3Var.disableScroll;
                    if (!z13 && this.e && !this.f && y12 > 0.0f && y12 / 3.0f > Math.abs(abs2)) {
                        float abs3 = Math.abs(y12);
                        i11 = e3Var.touchSlop;
                        if (abs3 >= i11) {
                            this.c = (int) motionEvent.getY();
                            this.e = false;
                            this.f = true;
                            requestDisallowInterceptTouchEvent(true);
                        }
                    }
                    if (this.f) {
                        float f11 = this.x + y12;
                        this.x = f11;
                        if (!onScrollUp) {
                            this.x = Math.max(f11, 0.0f);
                        }
                        e3Var.containerView.setTranslationY(Math.max(this.x, 0.0f));
                        e3Var.onContainerViewTranslation();
                        this.c = (int) motionEvent.getY();
                        e3Var.container.invalidate();
                    }
                } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.d && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
                    if (this.a == null) {
                        this.a = VelocityTracker.obtain();
                    }
                    this.a.computeCurrentVelocity(MediaDataController.MAX_STYLE_RUNS_COUNT);
                    e3Var.onScrollUpEnd(this.x);
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
                if ((z10 || !this.e) && !this.f && (e3Var.canDismissWithSwipe() || e3Var.canSwipeToBack(motionEvent))) {
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
        float f10;
        int i17;
        e3 e3Var = this.C;
        if (e3Var.containerView != null && this.w > 0) {
            i17 = e3Var.internalBackgroundColor;
            Paint paint2 = this.B;
            paint2.setColor(i17);
            canvas.drawRect(0.0f, (e3Var.containerView.getTranslationY() + (getMeasuredHeight() - this.w)) - 1.0f, getMeasuredWidth(), e3Var.containerView.getTranslationY() + getMeasuredHeight(), paint2);
        }
        int i18 = Build.VERSION.SDK_INT;
        Paint paint3 = this.s;
        if (i18 >= 26) {
            int i19 = e3Var.navBarColorKey;
            if (i19 >= 0) {
                paint3.setColor(e3Var.getThemedColor(i19));
            } else {
                paint3.setColor(e3Var.navBarColor);
            }
        } else {
            paint3.setColor(-16777216);
        }
        if (e3Var.drawDoubleNavigationBar && !e3Var.shouldOverlayCameraViewOverNavBar()) {
            c(canvas, 1.0f);
        }
        if (paint3.getAlpha() >= 255 || !e3Var.drawNavigationBar) {
            super.dispatchDraw(canvas);
        } else {
            float f11 = 0.0f;
            if (e3Var.scrollNavBar || (i18 >= 29 && e3.access$1400(e3Var) > 0)) {
                f11 = Math.max(0.0f, e3Var.getBottomInset() - (e3Var.containerView.getMeasuredHeight() - e3Var.containerView.getTranslationY()));
            }
            int bottomInset = e3Var.drawNavigationBar ? e3Var.getBottomInset() : 0;
            canvas.save();
            f10 = e3Var.currentPanTranslationY;
            canvas.clipRect(e3Var.containerView.getLeft() + e3Var.backgroundPaddingLeft, ((getMeasuredHeight() - bottomInset) + f11) - f10, e3Var.containerView.getRight() - e3Var.backgroundPaddingLeft, getMeasuredHeight() + f11, Region.Op.DIFFERENCE);
            super.dispatchDraw(canvas);
            canvas.restore();
        }
        if (e3Var.doNotOverlayNavigationBar) {
            if ((getMeasuredHeight() - e3Var.containerView.getY()) - e3Var.containerView.getMeasuredHeight() > AndroidUtilities.dp(48.0f)) {
                int i20 = e3Var.behindKeyboardColorKey;
                paint3.setColor(i20 >= 0 ? e3Var.getThemedColor(i20) : e3Var.behindKeyboardColor);
                canvas.drawRect(e3Var.containerView.getLeft() + e3Var.backgroundPaddingLeft, e3Var.containerView.getMeasuredHeight() + e3Var.containerView.getY(), e3Var.containerView.getRight() - e3Var.backgroundPaddingLeft, getMeasuredHeight(), paint3);
                return;
            }
            return;
        }
        if (!e3Var.shouldOverlayCameraViewOverNavBar()) {
            c(canvas, e3Var.drawDoubleNavigationBar ? e3Var.navigationBarAlpha * 0.7f : 1.0f);
        }
        if (e3Var.drawNavigationBar) {
            i13 = e3Var.rightInset;
            if (i13 != 0) {
                i14 = e3Var.rightInset;
                i15 = e3Var.leftInset;
                if (i14 > i15 && e3Var.fullWidth) {
                    Point point = AndroidUtilities.displaySize;
                    if (point.x > point.y) {
                        float right = e3Var.containerView.getRight() - e3Var.backgroundPaddingLeft;
                        float translationY = e3Var.containerView.getTranslationY();
                        int right2 = e3Var.containerView.getRight();
                        i16 = e3Var.rightInset;
                        paint = paint3;
                        canvas.drawRect(right, translationY, i16 + right2, getMeasuredHeight(), paint);
                        if (e3Var.drawNavigationBar) {
                            i10 = e3Var.leftInset;
                            if (i10 != 0) {
                                i11 = e3Var.leftInset;
                                i12 = e3Var.rightInset;
                                if (i11 > i12 && e3Var.fullWidth) {
                                    Point point2 = AndroidUtilities.displaySize;
                                    if (point2.x > point2.y) {
                                        canvas.drawRect(0.0f, e3Var.containerView.getTranslationY(), e3Var.containerView.getLeft() + e3Var.backgroundPaddingLeft, getMeasuredHeight(), paint);
                                    }
                                }
                            }
                        }
                        if (e3Var.containerView.getY() + e3Var.containerView.getMeasuredHeight() >= getMeasuredHeight()) {
                            int i21 = e3Var.behindKeyboardColorKey;
                            paint.setColor(i21 >= 0 ? e3Var.getThemedColor(i21) : e3Var.behindKeyboardColor);
                            canvas.drawRect(e3Var.containerView.getLeft() + e3Var.backgroundPaddingLeft, e3Var.containerView.getMeasuredHeight() + e3Var.containerView.getY(), e3Var.containerView.getRight() - e3Var.backgroundPaddingLeft, getMeasuredHeight(), paint);
                            return;
                        }
                        return;
                    }
                }
            }
        }
        paint = paint3;
        if (e3Var.drawNavigationBar) {
        }
        if (e3Var.containerView.getY() + e3Var.containerView.getMeasuredHeight() >= getMeasuredHeight()) {
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j10) {
        if (!(view instanceof CameraView)) {
            return super.drawChild(canvas, view, j10);
        }
        if (this.C.shouldOverlayCameraViewOverNavBar()) {
            c(canvas, 1.0f);
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        d5.p pVar = this.n;
        return pVar.b | pVar.a;
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
        float f10;
        Paint paint = this.s;
        int alpha = paint.getAlpha();
        e3 e3Var = this.C;
        if (alpha >= 255 || !e3Var.drawNavigationBar) {
            canvas2 = canvas;
            z10 = false;
        } else {
            float f11 = 0.0f;
            if (e3Var.scrollNavBar || (Build.VERSION.SDK_INT >= 29 && e3.access$1400(e3Var) > 0)) {
                f11 = Math.max(0.0f, e3Var.getBottomInset() - (e3Var.containerView.getMeasuredHeight() - e3Var.containerView.getTranslationY()));
            }
            int bottomInset = e3Var.drawNavigationBar ? e3Var.getBottomInset() : 0;
            canvas.save();
            f10 = e3Var.currentPanTranslationY;
            canvas.clipRect(e3Var.containerView.getLeft() + e3Var.backgroundPaddingLeft, ((getMeasuredHeight() - bottomInset) + f11) - f10, e3Var.containerView.getRight() - e3Var.backgroundPaddingLeft, getMeasuredHeight() + f11, Region.Op.DIFFERENCE);
            canvas2 = canvas;
            z10 = true;
        }
        super.onDraw(canvas2);
        if (e3Var.drawNavigationBar) {
            windowInsets = e3Var.lastInsets;
            if (windowInsets != null && e3Var.keyboardHeight != 0) {
                int i10 = e3Var.behindKeyboardColorKey;
                paint.setColor(i10 >= 0 ? e3Var.getThemedColor(i10) : e3Var.behindKeyboardColor);
                canvas2.drawRect(e3Var.containerView.getLeft() + e3Var.backgroundPaddingLeft, (getMeasuredHeight() - e3Var.keyboardHeight) - (e3Var.drawNavigationBar ? e3Var.getBottomInset() : 0), e3Var.containerView.getRight() - e3Var.backgroundPaddingLeft, getMeasuredHeight() - (e3Var.drawNavigationBar ? e3Var.getBottomInset() : 0), paint);
            }
        }
        e3Var.onContainerDraw(canvas2);
        if (z10) {
            canvas2.restore();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        e3 e3Var = this.C;
        return (e3Var.canDismissWithSwipe() || e3Var.canSwipeToBack(motionEvent)) ? d(motionEvent, true) : super.onInterceptTouchEvent(motionEvent);
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
        r11.addUpdateListener(new org.telegram.ui.ActionBar.a3(r17, r10));
        r3.keyboardContentAnimator.addListener(new org.telegram.ui.ActionBar.b3(r17, r9));
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
        e3 e3Var;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        WindowInsets windowInsets;
        WindowInsets windowInsets2;
        WindowInsets windowInsets3;
        long j10;
        long j11;
        boolean z11;
        WindowInsets windowInsets4;
        float f10;
        int i22 = i10;
        int i23 = i11;
        int i24 = i12;
        int i25 = i13 - this.w;
        e3 e3Var2 = this.C;
        e3Var2.onContainerLayout(i22, i23, i24, i25);
        e3.access$1510(e3Var2);
        ViewGroup viewGroup = e3Var2.containerView;
        int i26 = 1;
        int i27 = 2;
        int i28 = 0;
        if (viewGroup != null) {
            int measuredHeight = (i25 - i23) - viewGroup.getMeasuredHeight();
            windowInsets2 = e3Var2.lastInsets;
            if (windowInsets2 != null) {
                i22 += e3Var2.getLeftInset();
                i24 -= e3Var2.getRightInset();
                if (e3Var2.useSmoothKeyboard) {
                    measuredHeight = 0;
                } else if (!e3Var2.occupyNavigationBar) {
                    float f11 = measuredHeight;
                    windowInsets4 = e3Var2.lastInsets;
                    float systemWindowInsetBottom = windowInsets4.getSystemWindowInsetBottom();
                    f10 = e3Var2.hideSystemVerticalInsetsProgress;
                    measuredHeight = (int) (f11 - (((1.0f - f10) * systemWindowInsetBottom) - (e3Var2.drawNavigationBar ? 0 : e3Var2.getBottomInset())));
                    if (Build.VERSION.SDK_INT >= 29) {
                        measuredHeight -= e3.access$1400(e3Var2);
                    }
                }
            }
            int measuredWidth = ((i24 - i22) - e3Var2.containerView.getMeasuredWidth()) / 2;
            windowInsets3 = e3Var2.lastInsets;
            if (windowInsets3 != null) {
                measuredWidth += e3Var2.getLeftInset();
            }
            if (e3Var2.smoothKeyboardAnimationEnabled && e3Var2.startAnimationRunnable == null && this.v) {
                z11 = e3Var2.dismissed;
                if (!z11) {
                    if (e3Var2.smoothKeyboardByBottom) {
                    }
                }
            }
            j10 = e3Var2.smoothContainerViewLayoutUntil;
            if (j10 > 0) {
                long currentTimeMillis = System.currentTimeMillis();
                j11 = e3Var2.smoothContainerViewLayoutUntil;
            }
            ViewGroup viewGroup2 = e3Var2.containerView;
            viewGroup2.layout(measuredWidth, measuredHeight, viewGroup2.getMeasuredWidth() + measuredWidth, e3Var2.containerView.getMeasuredHeight() + measuredHeight);
        }
        int i29 = i24;
        int childCount = getChildCount();
        int i30 = 0;
        while (i30 < childCount) {
            View childAt = getChildAt(i30);
            if (childAt.getVisibility() == 8 || childAt == e3Var2.containerView) {
                e3 e3Var3 = e3Var2;
                i15 = i22;
                e3Var = e3Var3;
            } else {
                int bottomInset = e3Var2.drawNavigationBar ? e3Var2.getBottomInset() : 0;
                e3 e3Var4 = e3Var2;
                i15 = i22;
                e3Var = e3Var4;
                if (!e3Var.onCustomLayout(childAt, i15, i23, i29, i25 - bottomInset)) {
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
                            windowInsets = e3Var.lastInsets;
                            if (windowInsets != null) {
                                i18 += e3Var.getLeftInset();
                            }
                            childAt.layout(i18, i21, measuredWidth2 + i18, measuredHeight2 + i21);
                        } else {
                            i19 = (i25 - i11) - measuredHeight2;
                            i20 = layoutParams.bottomMargin;
                        }
                        i21 = i19 - i20;
                        windowInsets = e3Var.lastInsets;
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
                    windowInsets = e3Var.lastInsets;
                    if (windowInsets != null) {
                    }
                    childAt.layout(i18, i21, measuredWidth2 + i18, measuredHeight2 + i21);
                }
            }
            i30++;
            int i34 = i15;
            e3Var2 = e3Var;
            i22 = i34;
            i23 = i11;
            i26 = 1;
        }
        e3 e3Var5 = e3Var2;
        i14 = e3Var5.layoutCount;
        if (i14 == 0 && (runnable = e3Var5.startAnimationRunnable) != null && !e3Var5.waitingKeyboard) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            e3Var5.startAnimationRunnable.run();
            e3Var5.startAnimationRunnable = null;
        }
        if (e3Var5.waitingKeyboard && e3Var5.keyboardVisible) {
            Runnable runnable2 = e3Var5.startAnimationRunnable;
            if (runnable2 != null) {
                AndroidUtilities.cancelRunOnUIThread(runnable2);
                e3Var5.startAnimationRunnable.run();
            }
            e3Var5.waitingKeyboard = false;
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
        float f10;
        WindowInsets windowInsets5;
        WindowInsets windowInsets6;
        WindowInsets windowInsets7;
        float f11;
        float f12;
        float f13;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        View rootView = getRootView();
        Rect rect = this.r;
        getWindowVisibleDisplayFrame(rect);
        e3 e3Var = this.C;
        int i13 = e3Var.keyboardHeight;
        if (rect.bottom == 0 || rect.top == 0) {
            e3Var.keyboardHeight = 0;
        } else {
            float height = rootView.getHeight();
            if (rect.top != 0) {
                float f14 = AndroidUtilities.statusBarHeight;
                f13 = e3Var.hideSystemVerticalInsetsProgress;
                f11 = (1.0f - f13) * f14;
            } else {
                f11 = 0.0f;
            }
            float viewInset = AndroidUtilities.getViewInset(rootView);
            f12 = e3Var.hideSystemVerticalInsetsProgress;
            e3Var.keyboardHeight = Math.max(0, ((int) ((height - f11) - ((1.0f - f12) * viewInset))) - (rect.bottom - rect.top));
            if (e3Var.keyboardHeight < AndroidUtilities.dp(20.0f)) {
                e3Var.keyboardHeight = 0;
            } else {
                e3Var.lastKeyboardHeight = e3Var.keyboardHeight;
            }
            e3.access$1020(e3Var, e3Var.keyboardHeight);
        }
        int i14 = e3Var.keyboardHeight;
        if (i13 != i14) {
            this.v = true;
        }
        e3Var.keyboardVisible = i14 > AndroidUtilities.dp(20.0f);
        windowInsets = e3Var.lastInsets;
        if (windowInsets != null) {
            windowInsets5 = e3Var.lastInsets;
            e3Var.bottomInset = windowInsets5.getSystemWindowInsetBottom();
            windowInsets6 = e3Var.lastInsets;
            e3Var.leftInset = windowInsets6.getSystemWindowInsetLeft();
            windowInsets7 = e3Var.lastInsets;
            e3Var.rightInset = windowInsets7.getSystemWindowInsetRight();
            if (Build.VERSION.SDK_INT >= 29) {
                e3.access$1012(e3Var, e3.access$1400(e3Var));
            }
            if (e3Var.keyboardVisible && rect.bottom != 0 && rect.top != 0) {
                e3.access$1020(e3Var, e3Var.keyboardHeight);
            }
            if (!e3Var.drawNavigationBar && !e3Var.occupyNavigationBar && !e3Var.occupyNavigationBarWithoutKeyboard) {
                i12 = size2 - e3Var.getBottomInset();
                this.w = size2 - i12;
                setMeasuredDimension(size, size2);
                e3Var.navigationBarHeight = 0;
                windowInsets2 = e3Var.lastInsets;
                if (windowInsets2 != null && !e3Var.occupyNavigationBar) {
                    windowInsets4 = e3Var.lastInsets;
                    float systemWindowInsetBottom = windowInsets4.getSystemWindowInsetBottom();
                    f10 = e3Var.hideSystemVerticalInsetsProgress;
                    int i15 = (int) ((1.0f - f10) * systemWindowInsetBottom);
                    if (Build.VERSION.SDK_INT >= 29) {
                        i15 += e3.access$1400(e3Var);
                    }
                    if (e3Var.occupyNavigationBarWithoutKeyboard) {
                    }
                    size2 -= i15;
                    e3Var.navigationBarHeight = Math.min(i15, AndroidUtilities.navigationBarHeight);
                }
                int i16 = size2;
                windowInsets3 = e3Var.lastInsets;
                if (windowInsets3 != null) {
                    size -= e3Var.getLeftInset() + e3Var.getRightInset();
                }
                int i17 = size;
                e3Var.isPortrait = i17 < i16;
                viewGroup = e3Var.containerView;
                if (viewGroup != null) {
                    if (e3Var.fullWidth) {
                        viewGroup.measure(View.MeasureSpec.makeMeasureSpec((e3Var.backgroundPaddingLeft * 2) + i17, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i16, TLObject.FLAG_31));
                    } else {
                        if (AndroidUtilities.isTablet()) {
                            float dp = AndroidUtilities.dp(500.0f);
                            Point point = AndroidUtilities.displaySize;
                            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec((e3Var.backgroundPaddingLeft * 2) + ((int) Math.min(dp, Math.min(point.x, point.y) * 0.8f)), TLObject.FLAG_30);
                        } else {
                            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec((e3Var.backgroundPaddingLeft * 2) + e3Var.getBottomSheetWidth(e3Var.isPortrait, i17, i16), TLObject.FLAG_30);
                        }
                        e3Var.containerView.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(i16, TLObject.FLAG_31));
                    }
                }
                childCount = getChildCount();
                for (int i18 = 0; i18 < childCount; i18++) {
                    View childAt = getChildAt(i18);
                    if (childAt.getVisibility() != 8 && childAt != e3Var.containerView) {
                        if (childAt instanceof z60) {
                            measureChildWithMargins(childAt, View.MeasureSpec.makeMeasureSpec(i17, TLObject.FLAG_30), 0, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), TLObject.FLAG_30), 0);
                        } else if (!e3Var.onCustomMeasure(childAt, i17, i16)) {
                            measureChildWithMargins(childAt, View.MeasureSpec.makeMeasureSpec(i17, TLObject.FLAG_30), 0, View.MeasureSpec.makeMeasureSpec(i16, TLObject.FLAG_30), 0);
                        }
                    }
                }
            }
        }
        i12 = size2;
        this.w = size2 - i12;
        setMeasuredDimension(size, size2);
        e3Var.navigationBarHeight = 0;
        windowInsets2 = e3Var.lastInsets;
        if (windowInsets2 != null) {
            windowInsets4 = e3Var.lastInsets;
            float systemWindowInsetBottom2 = windowInsets4.getSystemWindowInsetBottom();
            f10 = e3Var.hideSystemVerticalInsetsProgress;
            int i152 = (int) ((1.0f - f10) * systemWindowInsetBottom2);
            if (Build.VERSION.SDK_INT >= 29) {
            }
            if (e3Var.occupyNavigationBarWithoutKeyboard) {
            }
            size2 -= i152;
            e3Var.navigationBarHeight = Math.min(i152, AndroidUtilities.navigationBarHeight);
        }
        int i162 = size2;
        windowInsets3 = e3Var.lastInsets;
        if (windowInsets3 != null) {
        }
        int i172 = size;
        e3Var.isPortrait = i172 < i162;
        viewGroup = e3Var.containerView;
        if (viewGroup != null) {
        }
        childCount = getChildCount();
        while (i18 < childCount) {
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
    public final void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
        boolean z10;
        e3 e3Var = this.C;
        z10 = e3Var.dismissed;
        if (z10 || !e3Var.allowNestedScroll) {
            return;
        }
        a();
        float translationY = e3Var.containerView.getTranslationY();
        if (translationY <= 0.0f || i11 <= 0) {
            return;
        }
        float f10 = translationY - i11;
        iArr[1] = i11;
        e3Var.containerView.setTranslationY(f10 >= 0.0f ? f10 : 0.0f);
        e3Var.onContainerViewTranslation();
        e3Var.container.invalidate();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        boolean z10;
        e3 e3Var = this.C;
        z10 = e3Var.dismissed;
        if (z10 || !e3Var.allowNestedScroll) {
            return;
        }
        a();
        if (i13 != 0) {
            float translationY = e3Var.containerView.getTranslationY() - i13;
            if (translationY < 0.0f) {
                translationY = 0.0f;
            }
            e3Var.containerView.setTranslationY(translationY);
            e3Var.onContainerViewTranslation();
            e3Var.container.invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i10) {
        boolean z10;
        this.n.a = i10;
        e3 e3Var = this.C;
        z10 = e3Var.dismissed;
        if (z10 || !e3Var.allowNestedScroll) {
            return;
        }
        a();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i10) {
        boolean z10;
        e3 e3Var = this.C;
        View view3 = e3Var.nestedScrollChild;
        if (view3 != null && view != view3) {
            return false;
        }
        z10 = e3Var.dismissed;
        return !z10 && e3Var.allowNestedScroll && i10 == 2 && !e3Var.canDismissWithSwipe();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        boolean z10;
        this.n.a = 0;
        e3 e3Var = this.C;
        z10 = e3Var.dismissed;
        if (z10 || !e3Var.allowNestedScroll) {
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
