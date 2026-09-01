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
import org.telegram.ui.Components.o70;
import org.telegram.ui.Components.pr;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public abstract class f3 extends FrameLayout {
    public boolean B;
    public final Paint C;
    public final /* synthetic */ h3 D;
    public VelocityTracker a;
    public int b;
    public int c;
    public int d;
    public boolean e;
    public boolean f;
    public AnimatorSet h;
    public final c5.e n;
    public final Rect r;
    public final Paint s;
    public boolean v;
    public int w;
    public float x;
    public float y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f3(h3 h3Var, Context context) {
        super(context);
        this.D = h3Var;
        this.a = null;
        this.d = -1;
        this.e = false;
        this.f = false;
        this.h = null;
        this.r = new Rect();
        this.s = new Paint();
        this.x = 0.0f;
        this.y = 0.0f;
        this.C = new Paint(1);
        this.n = new c5.e();
        setWillNotDraw(false);
    }

    public final void a() {
        AnimatorSet animatorSet = this.h;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.h = null;
        }
        this.D.onSwipeStarts();
    }

    public final void b(float f10, float f11) {
        boolean z4;
        h3 h3Var = this.D;
        if ((h3Var.containerView.getTranslationY() >= AndroidUtilities.getPixelsInCM(0.8f, false) || (f11 >= 3500.0f && Math.abs(f11) >= Math.abs(f10))) && (f11 >= 0.0f || Math.abs(f11) < 3500.0f)) {
            z4 = h3Var.allowCustomAnimation;
            h3Var.allowCustomAnimation = false;
            h3Var.useFastDismiss = true;
            h3Var.dismiss();
            h3Var.allowCustomAnimation = z4;
            return;
        }
        this.e = false;
        this.h = new AnimatorSet();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new d3(this, 4));
        this.h.playTogether(ObjectAnimator.ofFloat(h3Var.containerView, "translationY", 0.0f), ofFloat);
        this.h.setDuration((int) ((Math.max(0.0f, r1) / AndroidUtilities.getPixelsInCM(0.8f, false)) * 250.0f));
        this.h.setInterpolator(pr.f);
        this.h.addListener(new e3(this, 3));
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
        boolean z4;
        float f11;
        float max;
        float f12;
        boolean z10;
        boolean z11;
        float f13;
        int i10;
        int i11;
        float f14;
        int i12;
        int i13 = Build.VERSION.SDK_INT;
        Paint paint = this.s;
        h3 h3Var = this.D;
        if (i13 >= 26) {
            int i14 = h3Var.navBarColorKey;
            if (i14 >= 0) {
                paint.setColor(h3Var.getThemedColor(i14));
            } else {
                paint.setColor(h3Var.navBarColor);
            }
        } else {
            paint.setColor(-16777216);
        }
        z4 = h3Var.transitionFromRight;
        if (!z4 || h3Var.containerView.getVisibility() == 0) {
            float f15 = 0.0f;
            if (h3Var.drawNavigationBar) {
                i12 = h3Var.bottomInset;
            }
            f11 = h3Var.currentPanTranslationY;
            if (f11 == 0.0f) {
                return;
            }
            int bottomInset = h3Var.drawNavigationBar ? h3Var.getBottomInset() : 0;
            if (!h3Var.scrollNavBar && (i13 < 29 || h3.access$1400(h3Var) <= 0)) {
                max = 0.0f;
            } else if (h3Var.drawDoubleNavigationBar) {
                f12 = h3Var.currentPanTranslationY;
                max = Math.max(0.0f, Math.min(bottomInset - f12, h3Var.containerView.getTranslationY()));
            } else {
                max = Math.max(0.0f, h3Var.getBottomInset() - (h3Var.containerView.getMeasuredHeight() - h3Var.containerView.getTranslationY()));
            }
            int alpha = paint.getAlpha();
            z10 = h3Var.transitionFromRight;
            if (z10) {
                f10 *= h3Var.containerView.getAlpha();
            }
            z11 = h3Var.transitionFromRight;
            int x10 = z11 ? (int) h3Var.containerView.getX() : h3Var.containerView.getLeft();
            if (f10 < 1.0f) {
                paint.setAlpha((int) (alpha * f10));
            }
            f13 = h3Var.currentPanTranslationY;
            canvas.drawRect(h3Var.backgroundPaddingLeft + x10, ((getMeasuredHeight() - bottomInset) + max) - f13, h3Var.containerView.getRight() - h3Var.backgroundPaddingLeft, getMeasuredHeight() + max, paint);
            paint.setAlpha(alpha);
            i10 = h3Var.overlayDrawNavBarColor;
            if (i10 != 0) {
                i11 = h3Var.overlayDrawNavBarColor;
                paint.setColor(i11);
                int alpha2 = paint.getAlpha();
                float navigationBarThirdButtonsFactor = AndroidUtilities.getNavigationBarThirdButtonsFactor(bottomInset);
                if (f10 < 1.0f) {
                    paint.setAlpha((int) (alpha2 * f10 * navigationBarThirdButtonsFactor));
                } else {
                    f15 = max;
                }
                if (paint.getAlpha() > 0) {
                    f14 = h3Var.currentPanTranslationY;
                    canvas.drawRect(x10 + h3Var.backgroundPaddingLeft, ((getMeasuredHeight() - bottomInset) + f15) - f14, h3Var.containerView.getRight() - h3Var.backgroundPaddingLeft, getMeasuredHeight() + f15, paint);
                }
                paint.setAlpha(alpha2);
            }
        }
    }

    public final boolean d(MotionEvent motionEvent, boolean z4) {
        boolean z10;
        boolean z11;
        int i10;
        boolean z12;
        int i11;
        h3 h3Var = this.D;
        z10 = h3Var.dismissed;
        int i12 = 0;
        if (!z10) {
            int i13 = 1;
            if (!h3Var.onContainerTouchEvent(motionEvent)) {
                int i14 = 3;
                int i15 = 2;
                if (h3Var.canSwipeToBack(motionEvent) || this.B) {
                    if (motionEvent != null && ((motionEvent.getAction() == 0 || motionEvent.getAction() == 2) && !this.f && !this.e && motionEvent.getPointerCount() == 1)) {
                        this.B = true;
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
                        z11 = h3Var.disableScroll;
                        if (!z11 && this.e && !this.f && x10 > 0.0f && x10 / 3.0f > Math.abs(y10)) {
                            float abs = Math.abs(x10);
                            i10 = h3Var.touchSlop;
                            if (abs >= i10) {
                                this.b = (int) motionEvent.getX();
                                this.e = false;
                                this.f = true;
                            }
                        }
                        if (this.f) {
                            float f10 = this.y + x10;
                            this.y = f10;
                            h3Var.containerView.setTranslationX(Math.max(f10, 0.0f));
                            this.b = (int) motionEvent.getX();
                            h3Var.container.invalidate();
                        }
                    } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.d && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
                        if (this.a == null) {
                            this.a = VelocityTracker.obtain();
                        }
                        float xVelocity = this.a.getXVelocity();
                        float yVelocity = this.a.getYVelocity();
                        if (this.y >= h3Var.containerView.getMeasuredWidth() / 3.0f || (xVelocity >= 3500.0f && xVelocity >= yVelocity)) {
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.y, getMeasuredWidth());
                            ofFloat.addUpdateListener(new d3(this, i15));
                            ofFloat.addListener(new e3(this, i13));
                            pr prVar = pr.h;
                            ofFloat.setInterpolator(prVar);
                            ofFloat.setDuration(320L);
                            ofFloat.start();
                            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
                            ofFloat2.addUpdateListener(new d3(this, i14));
                            ofFloat2.setInterpolator(prVar);
                            ofFloat2.setDuration(320L);
                            ofFloat2.start();
                        } else {
                            float max = Math.max(this.y, 0.0f);
                            this.y = max;
                            ValueAnimator ofFloat3 = ValueAnimator.ofFloat(max, 0.0f);
                            ofFloat3.addUpdateListener(new d3(this, i13));
                            ofFloat3.addListener(new e3(this, i12));
                            ofFloat3.setInterpolator(pr.f);
                            ofFloat3.setDuration(220L);
                            ofFloat3.start();
                        }
                        this.e = false;
                        this.f = false;
                        this.d = -1;
                        this.B = false;
                    }
                } else if (h3Var.canDismissWithTouchOutside() && motionEvent != null && ((motionEvent.getAction() == 0 || motionEvent.getAction() == 2) && !this.f && !this.e && motionEvent.getPointerCount() == 1)) {
                    this.b = (int) motionEvent.getX();
                    int y11 = (int) motionEvent.getY();
                    this.c = y11;
                    if (h3Var.isTouchOutside(this.b, y11)) {
                        h3Var.onDismissWithTouchOutside();
                        return true;
                    }
                    h3Var.onScrollUpBegin(this.x);
                    this.d = motionEvent.getPointerId(0);
                    this.e = true;
                    a();
                    VelocityTracker velocityTracker = this.a;
                    if (velocityTracker != null) {
                        velocityTracker.clear();
                    }
                } else if (h3Var.canDismissWithSwipe() && motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.d) {
                    if (this.a == null) {
                        this.a = VelocityTracker.obtain();
                    }
                    float abs2 = Math.abs((int) (motionEvent.getX() - this.b));
                    float y12 = ((int) motionEvent.getY()) - this.c;
                    boolean onScrollUp = h3Var.onScrollUp(this.x + y12);
                    this.a.addMovement(motionEvent);
                    z12 = h3Var.disableScroll;
                    if (!z12 && this.e && !this.f && y12 > 0.0f && y12 / 3.0f > Math.abs(abs2)) {
                        float abs3 = Math.abs(y12);
                        i11 = h3Var.touchSlop;
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
                        h3Var.containerView.setTranslationY(Math.max(this.x, 0.0f));
                        h3Var.onContainerViewTranslation();
                        this.c = (int) motionEvent.getY();
                        h3Var.container.invalidate();
                    }
                } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.d && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
                    if (this.a == null) {
                        this.a = VelocityTracker.obtain();
                    }
                    this.a.computeCurrentVelocity(MediaDataController.MAX_STYLE_RUNS_COUNT);
                    h3Var.onScrollUpEnd(this.x);
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
                if ((z4 || !this.e) && !this.f && (h3Var.canDismissWithSwipe() || h3Var.canSwipeToBack(motionEvent))) {
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
        h3 h3Var = this.D;
        if (h3Var.containerView != null && this.w > 0) {
            i17 = h3Var.internalBackgroundColor;
            Paint paint2 = this.C;
            paint2.setColor(i17);
            canvas.drawRect(0.0f, (h3Var.containerView.getTranslationY() + (getMeasuredHeight() - this.w)) - 1.0f, getMeasuredWidth(), h3Var.containerView.getTranslationY() + getMeasuredHeight(), paint2);
        }
        int i18 = Build.VERSION.SDK_INT;
        Paint paint3 = this.s;
        if (i18 >= 26) {
            int i19 = h3Var.navBarColorKey;
            if (i19 >= 0) {
                paint3.setColor(h3Var.getThemedColor(i19));
            } else {
                paint3.setColor(h3Var.navBarColor);
            }
        } else {
            paint3.setColor(-16777216);
        }
        if (h3Var.drawDoubleNavigationBar && !h3Var.shouldOverlayCameraViewOverNavBar()) {
            c(canvas, 1.0f);
        }
        if (paint3.getAlpha() >= 255 || !h3Var.drawNavigationBar) {
            super.dispatchDraw(canvas);
        } else {
            float f11 = 0.0f;
            if (h3Var.scrollNavBar || (i18 >= 29 && h3.access$1400(h3Var) > 0)) {
                f11 = Math.max(0.0f, h3Var.getBottomInset() - (h3Var.containerView.getMeasuredHeight() - h3Var.containerView.getTranslationY()));
            }
            int bottomInset = h3Var.drawNavigationBar ? h3Var.getBottomInset() : 0;
            canvas.save();
            f10 = h3Var.currentPanTranslationY;
            canvas.clipRect(h3Var.containerView.getLeft() + h3Var.backgroundPaddingLeft, ((getMeasuredHeight() - bottomInset) + f11) - f10, h3Var.containerView.getRight() - h3Var.backgroundPaddingLeft, getMeasuredHeight() + f11, Region.Op.DIFFERENCE);
            super.dispatchDraw(canvas);
            canvas.restore();
        }
        if (h3Var.doNotOverlayNavigationBar) {
            if ((getMeasuredHeight() - h3Var.containerView.getY()) - h3Var.containerView.getMeasuredHeight() > AndroidUtilities.dp(48.0f)) {
                int i20 = h3Var.behindKeyboardColorKey;
                paint3.setColor(i20 >= 0 ? h3Var.getThemedColor(i20) : h3Var.behindKeyboardColor);
                canvas.drawRect(h3Var.containerView.getLeft() + h3Var.backgroundPaddingLeft, h3Var.containerView.getMeasuredHeight() + h3Var.containerView.getY(), h3Var.containerView.getRight() - h3Var.backgroundPaddingLeft, getMeasuredHeight(), paint3);
                return;
            }
            return;
        }
        if (!h3Var.shouldOverlayCameraViewOverNavBar()) {
            c(canvas, h3Var.drawDoubleNavigationBar ? h3Var.navigationBarAlpha * 0.7f : 1.0f);
        }
        if (h3Var.drawNavigationBar) {
            i13 = h3Var.rightInset;
            if (i13 != 0) {
                i14 = h3Var.rightInset;
                i15 = h3Var.leftInset;
                if (i14 > i15 && h3Var.fullWidth) {
                    Point point = AndroidUtilities.displaySize;
                    if (point.x > point.y) {
                        float right = h3Var.containerView.getRight() - h3Var.backgroundPaddingLeft;
                        float translationY = h3Var.containerView.getTranslationY();
                        int right2 = h3Var.containerView.getRight();
                        i16 = h3Var.rightInset;
                        paint = paint3;
                        canvas.drawRect(right, translationY, i16 + right2, getMeasuredHeight(), paint);
                        if (h3Var.drawNavigationBar) {
                            i10 = h3Var.leftInset;
                            if (i10 != 0) {
                                i11 = h3Var.leftInset;
                                i12 = h3Var.rightInset;
                                if (i11 > i12 && h3Var.fullWidth) {
                                    Point point2 = AndroidUtilities.displaySize;
                                    if (point2.x > point2.y) {
                                        canvas.drawRect(0.0f, h3Var.containerView.getTranslationY(), h3Var.containerView.getLeft() + h3Var.backgroundPaddingLeft, getMeasuredHeight(), paint);
                                    }
                                }
                            }
                        }
                        if (h3Var.containerView.getY() + h3Var.containerView.getMeasuredHeight() >= getMeasuredHeight()) {
                            int i21 = h3Var.behindKeyboardColorKey;
                            paint.setColor(i21 >= 0 ? h3Var.getThemedColor(i21) : h3Var.behindKeyboardColor);
                            canvas.drawRect(h3Var.containerView.getLeft() + h3Var.backgroundPaddingLeft, h3Var.containerView.getMeasuredHeight() + h3Var.containerView.getY(), h3Var.containerView.getRight() - h3Var.backgroundPaddingLeft, getMeasuredHeight(), paint);
                            return;
                        }
                        return;
                    }
                }
            }
        }
        paint = paint3;
        if (h3Var.drawNavigationBar) {
        }
        if (h3Var.containerView.getY() + h3Var.containerView.getMeasuredHeight() >= getMeasuredHeight()) {
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j10) {
        if (!(view instanceof CameraView)) {
            return super.drawChild(canvas, view, j10);
        }
        if (this.D.shouldOverlayCameraViewOverNavBar()) {
            c(canvas, 1.0f);
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        c5.e eVar = this.n;
        return eVar.b | eVar.a;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        boolean z4;
        WindowInsets windowInsets;
        float f10;
        Paint paint = this.s;
        int alpha = paint.getAlpha();
        h3 h3Var = this.D;
        if (alpha >= 255 || !h3Var.drawNavigationBar) {
            canvas2 = canvas;
            z4 = false;
        } else {
            float f11 = 0.0f;
            if (h3Var.scrollNavBar || (Build.VERSION.SDK_INT >= 29 && h3.access$1400(h3Var) > 0)) {
                f11 = Math.max(0.0f, h3Var.getBottomInset() - (h3Var.containerView.getMeasuredHeight() - h3Var.containerView.getTranslationY()));
            }
            int bottomInset = h3Var.drawNavigationBar ? h3Var.getBottomInset() : 0;
            canvas.save();
            f10 = h3Var.currentPanTranslationY;
            canvas.clipRect(h3Var.containerView.getLeft() + h3Var.backgroundPaddingLeft, ((getMeasuredHeight() - bottomInset) + f11) - f10, h3Var.containerView.getRight() - h3Var.backgroundPaddingLeft, getMeasuredHeight() + f11, Region.Op.DIFFERENCE);
            canvas2 = canvas;
            z4 = true;
        }
        super.onDraw(canvas2);
        if (h3Var.drawNavigationBar) {
            windowInsets = h3Var.lastInsets;
            if (windowInsets != null && h3Var.keyboardHeight != 0) {
                int i10 = h3Var.behindKeyboardColorKey;
                paint.setColor(i10 >= 0 ? h3Var.getThemedColor(i10) : h3Var.behindKeyboardColor);
                canvas2.drawRect(h3Var.containerView.getLeft() + h3Var.backgroundPaddingLeft, (getMeasuredHeight() - h3Var.keyboardHeight) - (h3Var.drawNavigationBar ? h3Var.getBottomInset() : 0), h3Var.containerView.getRight() - h3Var.backgroundPaddingLeft, getMeasuredHeight() - (h3Var.drawNavigationBar ? h3Var.getBottomInset() : 0), paint);
            }
        }
        h3Var.onContainerDraw(canvas2);
        if (z4) {
            canvas2.restore();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        h3 h3Var = this.D;
        return (h3Var.canDismissWithSwipe() || h3Var.canSwipeToBack(motionEvent)) ? d(motionEvent, true) : super.onInterceptTouchEvent(motionEvent);
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
        r11.addUpdateListener(new org.telegram.ui.ActionBar.d3(r17, r10));
        r3.keyboardContentAnimator.addListener(new org.telegram.ui.ActionBar.e3(r17, r9));
        r3.keyboardContentAnimator.setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.r1.w);
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
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        int i14;
        Runnable runnable;
        int i15;
        h3 h3Var;
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
        boolean z10;
        WindowInsets windowInsets4;
        float f10;
        int i22 = i10;
        int i23 = i11;
        int i24 = i12;
        int i25 = i13 - this.w;
        h3 h3Var2 = this.D;
        h3Var2.onContainerLayout(i22, i23, i24, i25);
        h3.access$1510(h3Var2);
        ViewGroup viewGroup = h3Var2.containerView;
        int i26 = 1;
        int i27 = 2;
        int i28 = 0;
        if (viewGroup != null) {
            int measuredHeight = (i25 - i23) - viewGroup.getMeasuredHeight();
            windowInsets2 = h3Var2.lastInsets;
            if (windowInsets2 != null) {
                i22 += h3Var2.getLeftInset();
                i24 -= h3Var2.getRightInset();
                if (h3Var2.useSmoothKeyboard) {
                    measuredHeight = 0;
                } else if (!h3Var2.occupyNavigationBar) {
                    float f11 = measuredHeight;
                    windowInsets4 = h3Var2.lastInsets;
                    float systemWindowInsetBottom = windowInsets4.getSystemWindowInsetBottom();
                    f10 = h3Var2.hideSystemVerticalInsetsProgress;
                    measuredHeight = (int) (f11 - (((1.0f - f10) * systemWindowInsetBottom) - (h3Var2.drawNavigationBar ? 0 : h3Var2.getBottomInset())));
                    if (Build.VERSION.SDK_INT >= 29) {
                        measuredHeight -= h3.access$1400(h3Var2);
                    }
                }
            }
            int measuredWidth = ((i24 - i22) - h3Var2.containerView.getMeasuredWidth()) / 2;
            windowInsets3 = h3Var2.lastInsets;
            if (windowInsets3 != null) {
                measuredWidth += h3Var2.getLeftInset();
            }
            if (h3Var2.smoothKeyboardAnimationEnabled && h3Var2.startAnimationRunnable == null && this.v) {
                z10 = h3Var2.dismissed;
                if (!z10) {
                    if (h3Var2.smoothKeyboardByBottom) {
                    }
                }
            }
            j10 = h3Var2.smoothContainerViewLayoutUntil;
            if (j10 > 0) {
                long currentTimeMillis = System.currentTimeMillis();
                j11 = h3Var2.smoothContainerViewLayoutUntil;
            }
            ViewGroup viewGroup2 = h3Var2.containerView;
            viewGroup2.layout(measuredWidth, measuredHeight, viewGroup2.getMeasuredWidth() + measuredWidth, h3Var2.containerView.getMeasuredHeight() + measuredHeight);
        }
        int i29 = i24;
        int childCount = getChildCount();
        int i30 = 0;
        while (i30 < childCount) {
            View childAt = getChildAt(i30);
            if (childAt.getVisibility() == 8 || childAt == h3Var2.containerView) {
                h3 h3Var3 = h3Var2;
                i15 = i22;
                h3Var = h3Var3;
            } else {
                int bottomInset = h3Var2.drawNavigationBar ? h3Var2.getBottomInset() : 0;
                h3 h3Var4 = h3Var2;
                i15 = i22;
                h3Var = h3Var4;
                if (!h3Var.onCustomLayout(childAt, i15, i23, i29, i25 - bottomInset)) {
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
                            windowInsets = h3Var.lastInsets;
                            if (windowInsets != null) {
                                i18 += h3Var.getLeftInset();
                            }
                            childAt.layout(i18, i21, measuredWidth2 + i18, measuredHeight2 + i21);
                        } else {
                            i19 = (i25 - i11) - measuredHeight2;
                            i20 = layoutParams.bottomMargin;
                        }
                        i21 = i19 - i20;
                        windowInsets = h3Var.lastInsets;
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
                    windowInsets = h3Var.lastInsets;
                    if (windowInsets != null) {
                    }
                    childAt.layout(i18, i21, measuredWidth2 + i18, measuredHeight2 + i21);
                }
            }
            i30++;
            int i34 = i15;
            h3Var2 = h3Var;
            i22 = i34;
            i23 = i11;
            i26 = 1;
        }
        h3 h3Var5 = h3Var2;
        i14 = h3Var5.layoutCount;
        if (i14 == 0 && (runnable = h3Var5.startAnimationRunnable) != null && !h3Var5.waitingKeyboard) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            h3Var5.startAnimationRunnable.run();
            h3Var5.startAnimationRunnable = null;
        }
        if (h3Var5.waitingKeyboard && h3Var5.keyboardVisible) {
            Runnable runnable2 = h3Var5.startAnimationRunnable;
            if (runnable2 != null) {
                AndroidUtilities.cancelRunOnUIThread(runnable2);
                h3Var5.startAnimationRunnable.run();
            }
            h3Var5.waitingKeyboard = false;
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
        h3 h3Var = this.D;
        int i13 = h3Var.keyboardHeight;
        if (rect.bottom == 0 || rect.top == 0) {
            h3Var.keyboardHeight = 0;
        } else {
            float height = rootView.getHeight();
            if (rect.top != 0) {
                float f14 = AndroidUtilities.statusBarHeight;
                f13 = h3Var.hideSystemVerticalInsetsProgress;
                f11 = (1.0f - f13) * f14;
            } else {
                f11 = 0.0f;
            }
            float viewInset = AndroidUtilities.getViewInset(rootView);
            f12 = h3Var.hideSystemVerticalInsetsProgress;
            h3Var.keyboardHeight = Math.max(0, ((int) ((height - f11) - ((1.0f - f12) * viewInset))) - (rect.bottom - rect.top));
            if (h3Var.keyboardHeight < AndroidUtilities.dp(20.0f)) {
                h3Var.keyboardHeight = 0;
            } else {
                h3Var.lastKeyboardHeight = h3Var.keyboardHeight;
            }
            h3.access$1020(h3Var, h3Var.keyboardHeight);
        }
        int i14 = h3Var.keyboardHeight;
        if (i13 != i14) {
            this.v = true;
        }
        h3Var.keyboardVisible = i14 > AndroidUtilities.dp(20.0f);
        windowInsets = h3Var.lastInsets;
        if (windowInsets != null) {
            windowInsets5 = h3Var.lastInsets;
            h3Var.bottomInset = windowInsets5.getSystemWindowInsetBottom();
            windowInsets6 = h3Var.lastInsets;
            h3Var.leftInset = windowInsets6.getSystemWindowInsetLeft();
            windowInsets7 = h3Var.lastInsets;
            h3Var.rightInset = windowInsets7.getSystemWindowInsetRight();
            if (Build.VERSION.SDK_INT >= 29) {
                h3.access$1012(h3Var, h3.access$1400(h3Var));
            }
            if (h3Var.keyboardVisible && rect.bottom != 0 && rect.top != 0) {
                h3.access$1020(h3Var, h3Var.keyboardHeight);
            }
            if (!h3Var.drawNavigationBar && !h3Var.occupyNavigationBar && !h3Var.occupyNavigationBarWithoutKeyboard) {
                i12 = size2 - h3Var.getBottomInset();
                this.w = size2 - i12;
                setMeasuredDimension(size, size2);
                h3Var.navigationBarHeight = 0;
                windowInsets2 = h3Var.lastInsets;
                if (windowInsets2 != null && !h3Var.occupyNavigationBar) {
                    windowInsets4 = h3Var.lastInsets;
                    float systemWindowInsetBottom = windowInsets4.getSystemWindowInsetBottom();
                    f10 = h3Var.hideSystemVerticalInsetsProgress;
                    int i15 = (int) ((1.0f - f10) * systemWindowInsetBottom);
                    if (Build.VERSION.SDK_INT >= 29) {
                        i15 += h3.access$1400(h3Var);
                    }
                    if (h3Var.occupyNavigationBarWithoutKeyboard) {
                    }
                    size2 -= i15;
                    h3Var.navigationBarHeight = Math.min(i15, AndroidUtilities.navigationBarHeight);
                }
                int i16 = size2;
                windowInsets3 = h3Var.lastInsets;
                if (windowInsets3 != null) {
                    size -= h3Var.getLeftInset() + h3Var.getRightInset();
                }
                int i17 = size;
                h3Var.isPortrait = i17 < i16;
                viewGroup = h3Var.containerView;
                if (viewGroup != null) {
                    if (h3Var.fullWidth) {
                        viewGroup.measure(View.MeasureSpec.makeMeasureSpec((h3Var.backgroundPaddingLeft * 2) + i17, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i16, TLObject.FLAG_31));
                    } else {
                        if (AndroidUtilities.isTablet()) {
                            float dp = AndroidUtilities.dp(500.0f);
                            Point point = AndroidUtilities.displaySize;
                            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec((h3Var.backgroundPaddingLeft * 2) + ((int) Math.min(dp, Math.min(point.x, point.y) * 0.8f)), TLObject.FLAG_30);
                        } else {
                            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec((h3Var.backgroundPaddingLeft * 2) + h3Var.getBottomSheetWidth(h3Var.isPortrait, i17, i16), TLObject.FLAG_30);
                        }
                        h3Var.containerView.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(i16, TLObject.FLAG_31));
                    }
                }
                childCount = getChildCount();
                for (int i18 = 0; i18 < childCount; i18++) {
                    View childAt = getChildAt(i18);
                    if (childAt.getVisibility() != 8 && childAt != h3Var.containerView) {
                        if (childAt instanceof o70) {
                            measureChildWithMargins(childAt, View.MeasureSpec.makeMeasureSpec(i17, TLObject.FLAG_30), 0, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), TLObject.FLAG_30), 0);
                        } else if (!h3Var.onCustomMeasure(childAt, i17, i16)) {
                            measureChildWithMargins(childAt, View.MeasureSpec.makeMeasureSpec(i17, TLObject.FLAG_30), 0, View.MeasureSpec.makeMeasureSpec(i16, TLObject.FLAG_30), 0);
                        }
                    }
                }
            }
        }
        i12 = size2;
        this.w = size2 - i12;
        setMeasuredDimension(size, size2);
        h3Var.navigationBarHeight = 0;
        windowInsets2 = h3Var.lastInsets;
        if (windowInsets2 != null) {
            windowInsets4 = h3Var.lastInsets;
            float systemWindowInsetBottom2 = windowInsets4.getSystemWindowInsetBottom();
            f10 = h3Var.hideSystemVerticalInsetsProgress;
            int i152 = (int) ((1.0f - f10) * systemWindowInsetBottom2);
            if (Build.VERSION.SDK_INT >= 29) {
            }
            if (h3Var.occupyNavigationBarWithoutKeyboard) {
            }
            size2 -= i152;
            h3Var.navigationBarHeight = Math.min(i152, AndroidUtilities.navigationBarHeight);
        }
        int i162 = size2;
        windowInsets3 = h3Var.lastInsets;
        if (windowInsets3 != null) {
        }
        int i172 = size;
        h3Var.isPortrait = i172 < i162;
        viewGroup = h3Var.containerView;
        if (viewGroup != null) {
        }
        childCount = getChildCount();
        while (i18 < childCount) {
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f10, float f11, boolean z4) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f10, float f11) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
        boolean z4;
        h3 h3Var = this.D;
        z4 = h3Var.dismissed;
        if (z4 || !h3Var.allowNestedScroll) {
            return;
        }
        a();
        float translationY = h3Var.containerView.getTranslationY();
        if (translationY <= 0.0f || i11 <= 0) {
            return;
        }
        float f10 = translationY - i11;
        iArr[1] = i11;
        h3Var.containerView.setTranslationY(f10 >= 0.0f ? f10 : 0.0f);
        h3Var.onContainerViewTranslation();
        h3Var.container.invalidate();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        boolean z4;
        h3 h3Var = this.D;
        z4 = h3Var.dismissed;
        if (z4 || !h3Var.allowNestedScroll) {
            return;
        }
        a();
        if (i13 != 0) {
            float translationY = h3Var.containerView.getTranslationY() - i13;
            if (translationY < 0.0f) {
                translationY = 0.0f;
            }
            h3Var.containerView.setTranslationY(translationY);
            h3Var.onContainerViewTranslation();
            h3Var.container.invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i10) {
        boolean z4;
        this.n.a = i10;
        h3 h3Var = this.D;
        z4 = h3Var.dismissed;
        if (z4 || !h3Var.allowNestedScroll) {
            return;
        }
        a();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i10) {
        boolean z4;
        h3 h3Var = this.D;
        View view3 = h3Var.nestedScrollChild;
        if (view3 != null && view != view3) {
            return false;
        }
        z4 = h3Var.dismissed;
        return !z4 && h3Var.allowNestedScroll && i10 == 2 && !h3Var.canDismissWithSwipe();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        boolean z4;
        this.n.a = 0;
        h3 h3Var = this.D;
        z4 = h3Var.dismissed;
        if (z4 || !h3Var.allowNestedScroll) {
            return;
        }
        b(0.0f, 0.0f);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return d(motionEvent, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z4) {
        if (this.e && !this.f) {
            d(null, false);
        }
        super.requestDisallowInterceptTouchEvent(z4);
    }
}
