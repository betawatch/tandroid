package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Property;
import android.view.DisplayCutout;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
class ArticleViewer$WindowView extends FrameLayout {
    public int B;
    public int C;
    public boolean D;
    public final /* synthetic */ n4 E;
    public final Paint a;
    public int b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public int h;
    public int n;
    public int r;
    public VelocityTracker s;
    public float v;
    public float w;
    public int x;
    public int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ArticleViewer$WindowView(n4 n4Var, Activity activity) {
        super(activity);
        this.E = n4Var;
        this.a = new Paint();
        this.w = 1.0f;
    }

    public final boolean a(MotionEvent motionEvent) {
        r3 r3Var;
        n4 n4Var = this.E;
        a4 a4Var = n4Var.H;
        if (n4Var.s0 == null && !n4Var.Q0 && n4Var.M.getVisibility() != 0 && !n4Var.L0.y()) {
            if (motionEvent != null && motionEvent.getAction() == 0 && !this.d && !this.c) {
                this.b = motionEvent.getPointerId(0);
                this.c = true;
                this.n = (int) motionEvent.getX();
                this.r = (int) motionEvent.getY();
                VelocityTracker velocityTracker = this.s;
                if (velocityTracker != null) {
                    velocityTracker.clear();
                }
            } else if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.b) {
                if (this.s == null) {
                    this.s = VelocityTracker.obtain();
                }
                int max = Math.max(0, (int) (motionEvent.getX() - this.n));
                int abs = Math.abs(((int) motionEvent.getY()) - this.r);
                this.s.addMovement(motionEvent);
                r3 r3Var2 = n4Var.r0[0];
                this.D = r3Var2 == null || !r3Var2.f() || (n4Var.r0[0].e.b(true) && !n4Var.r0[0].e.c);
                if ((a4Var == null || !a4Var.E) && this.c && !this.d && max >= AndroidUtilities.getPixelsInCM(0.4f, true) && Math.abs(max) / 3 > abs && this.D) {
                    b(motionEvent);
                } else if (this.d) {
                    n4Var.d = null;
                    n4Var.f = null;
                    if (this.e && (r3Var = n4Var.r0[0]) != null) {
                        r3Var.setTranslationX(max);
                    } else if (a4Var != null) {
                        a4Var.F = max / getWidth();
                        a4Var.c.invalidate();
                        a4Var.i();
                        a4Var.h();
                    } else {
                        n0 n0Var = n4Var.d0;
                        float f10 = max;
                        n0Var.setTranslationX(f10);
                        setInnerTranslationX(f10);
                    }
                }
            } else if (motionEvent != null && motionEvent.getPointerId(0) == this.b && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6)) {
                if (this.s == null) {
                    this.s = VelocityTracker.obtain();
                }
                this.s.computeCurrentVelocity(MediaDataController.MAX_STYLE_RUNS_COUNT);
                float xVelocity = this.s.getXVelocity();
                float yVelocity = this.s.getYVelocity();
                if ((a4Var == null || !a4Var.E) && !this.d && xVelocity >= 3500.0f && xVelocity > Math.abs(yVelocity)) {
                    b(motionEvent);
                }
                if (this.d) {
                    boolean z4 = this.e;
                    View view = z4 ? n4Var.r0[0] : n4Var.d0;
                    float x10 = (z4 || a4Var == null) ? view.getX() : a4Var.F * a4Var.c.getWidth();
                    boolean z10 = (x10 < ((float) view.getMeasuredWidth()) * 0.3f && (xVelocity < 2500.0f || xVelocity < yVelocity)) || !this.D;
                    AnimatorSet animatorSet = new AnimatorSet();
                    Property property = View.TRANSLATION_X;
                    if (!z10) {
                        x10 = view.getMeasuredWidth() - x10;
                        if (this.e) {
                            animatorSet.playTogether(ObjectAnimator.ofFloat(n4Var.r0[0], (Property<r3, Float>) property, view.getMeasuredWidth()));
                        } else if (a4Var != null) {
                            animatorSet.playTogether(a4Var.d(1.0f));
                        } else {
                            animatorSet.playTogether(ObjectAnimator.ofFloat(n4Var.d0, (Property<n0, Float>) property, view.getMeasuredWidth()), ObjectAnimator.ofFloat(this, n4.a1, view.getMeasuredWidth()));
                        }
                    } else if (this.e) {
                        animatorSet.playTogether(ObjectAnimator.ofFloat(n4Var.r0[0], (Property<r3, Float>) property, 0.0f));
                    } else if (a4Var != null) {
                        animatorSet.playTogether(a4Var.d(0.0f));
                    } else {
                        animatorSet.playTogether(ObjectAnimator.ofFloat(n4Var.d0, (Property<n0, Float>) property, 0.0f), ObjectAnimator.ofFloat(this, n4.a1, 0.0f));
                    }
                    animatorSet.setDuration(Math.max((int) ((420.0f / view.getMeasuredWidth()) * x10), MediaDataController.MAX_LINKS_COUNT));
                    animatorSet.setInterpolator(org.telegram.ui.Components.mr.h);
                    animatorSet.addListener(new m4(this, z10));
                    animatorSet.start();
                    n4Var.Q0 = true;
                } else {
                    this.c = false;
                    this.d = false;
                    this.e = false;
                }
                VelocityTracker velocityTracker2 = this.s;
                if (velocityTracker2 != null) {
                    velocityTracker2.recycle();
                    this.s = null;
                }
            } else if (motionEvent == null) {
                this.c = false;
                this.d = false;
                this.e = false;
                VelocityTracker velocityTracker3 = this.s;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                    this.s = null;
                }
                org.telegram.ui.Cells.l9 l9Var = n4Var.L0;
                if (l9Var != null && !l9Var.y()) {
                    n4Var.L0.f(false);
                }
            }
            if (this.d && this.D) {
                return true;
            }
        }
        return false;
    }

    public final void b(MotionEvent motionEvent) {
        o0 o0Var;
        this.c = false;
        this.d = true;
        this.n = (int) motionEvent.getX();
        n4 n4Var = this.E;
        ArrayList arrayList = n4Var.a0;
        if (arrayList.size() <= 1 || ((o0Var = n4Var.e0) != null && (o0Var.Q || o0Var.T))) {
            this.e = false;
        } else {
            this.e = true;
            this.h = n4Var.F0;
            n4Var.r0[1].setVisibility(0);
            n4Var.r0[1].setAlpha(1.0f);
            n4Var.r0[1].setTranslationX(0.0f);
            n4Var.r0[0].setBackgroundColor(n4Var.H == null ? 0 : n4Var.i0.getColor());
            n4Var.e0(-1, arrayList.get(arrayList.size() - 2), true);
            if (n4Var.d0.indexOfChild(n4Var.r0[0]) < n4Var.d0.indexOfChild(n4Var.r0[1])) {
                int indexOfChild = n4Var.d0.indexOfChild(n4Var.r0[0]);
                n4Var.d0.removeView(n4Var.r0[1]);
                n4Var.d0.addView(n4Var.r0[1], indexOfChild);
            }
        }
        n4Var.k();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        ArticleViewer$WindowView articleViewer$WindowView;
        Activity activity;
        DisplayCutout displayCutout;
        List<Rect> boundingRects;
        n4 n4Var = this.E;
        if (n4Var.H != null) {
            return super.dispatchApplyWindowInsets(windowInsets);
        }
        WindowInsets windowInsets2 = n4Var.Q;
        n4Var.Q = windowInsets;
        if ((windowInsets2 == null || !windowInsets2.toString().equals(windowInsets.toString())) && (articleViewer$WindowView = n4Var.c0) != null) {
            articleViewer$WindowView.requestLayout();
        }
        if (Build.VERSION.SDK_INT >= 28 && (activity = n4Var.I) != null && (displayCutout = activity.getWindow().getDecorView().getRootWindowInsets().getDisplayCutout()) != null && (boundingRects = displayCutout.getBoundingRects()) != null && !boundingRects.isEmpty()) {
            n4Var.R = boundingRects.get(0).height() != 0;
        }
        return super.dispatchApplyWindowInsets(windowInsets);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        super.dispatchDraw(canvas);
        n4 n4Var = this.E;
        if (n4Var.Q != null || this.y == 0 || this.C == 0) {
            return;
        }
        int alpha = (int) (n4Var.c0.getAlpha() * 255.0f);
        Paint paint = this.a;
        paint.setAlpha(alpha);
        int i11 = this.x;
        if (i11 == 0 && (i10 = this.B) == 0) {
            canvas.drawRect(i11, i10, i11 + this.y, i10 + this.C, paint);
        } else {
            canvas.drawRect(i11 - getTranslationX(), this.B, (this.x + this.y) - getTranslationX(), this.B + this.C, paint);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        if (keyEvent == null || keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 1) {
            return super.dispatchKeyEventPreIme(keyEvent);
        }
        n4 n4Var = this.E;
        if (n4Var.e0.S.isFocused()) {
            n4Var.e0.S.clearFocus();
            AndroidUtilities.hideKeyboard(n4Var.e0.S);
            return true;
        }
        if (n4Var.e0.V.isFocused()) {
            n4Var.e0.V.clearFocus();
            AndroidUtilities.hideKeyboard(n4Var.e0.V);
            return true;
        }
        if (n4Var.l0) {
            AndroidUtilities.hideKeyboard(this);
            return true;
        }
        r3 r3Var = n4Var.r0[0];
        if (r3Var == null || !r3Var.f() || n4Var.r0[0].getWebView() == null || !n4Var.r0[0].getWebView().canGoBack()) {
            n4Var.o(true, false);
            return true;
        }
        n4Var.r0[0].getWebView().goBack();
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        r3 r3Var;
        ArrayList arrayList;
        n4 n4Var = this.E;
        if (n4Var.N0.n) {
            motionEvent.offsetLocation(-n4Var.d0.getX(), -n4Var.d0.getY());
            return n4Var.N0.g(motionEvent);
        }
        org.telegram.ui.Cells.x9 o10 = n4Var.L0.o(getContext());
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.offsetLocation(-n4Var.d0.getX(), -n4Var.d0.getY());
        if (!n4Var.L0.y() || !n4Var.L0.o(getContext()).onTouchEvent(obtain)) {
            if (o10.b(motionEvent)) {
                r3[] r3VarArr = n4Var.r0;
                if (r3VarArr == null || (r3Var = r3VarArr[0]) == null || !r3Var.f() || (arrayList = n4Var.a0) == null || arrayList.size() > 1) {
                    motionEvent.setAction(3);
                } else {
                    motionEvent.setAction(1);
                }
            }
            if (motionEvent.getAction() != 0 || !n4Var.L0.y() || (motionEvent.getY() >= n4Var.d0.getTop() && motionEvent.getY() <= n4Var.d0.getBottom())) {
                return super.dispatchTouchEvent(motionEvent);
            }
            if (n4Var.L0.o(getContext()).onTouchEvent(obtain)) {
                return super.dispatchTouchEvent(motionEvent);
            }
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        int measuredWidth = getMeasuredWidth();
        int i10 = (int) this.v;
        int save = canvas.save();
        canvas.clipRect(i10, 0, measuredWidth, getHeight());
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restoreToCount(save);
        if (i10 != 0) {
            n4 n4Var = this.E;
            if (view == n4Var.d0) {
                float f10 = measuredWidth - i10;
                float min = Math.min(0.8f, f10 / measuredWidth);
                if (min < 0.0f) {
                    min = 0.0f;
                }
                n4Var.k0.setColor(((int) (min * 153.0f)) << 24);
                canvas.drawRect(0.0f, 0.0f, i10, getHeight(), n4Var.k0);
                float max = Math.max(0.0f, Math.min(f10 / AndroidUtilities.dp(20.0f), 1.0f));
                Drawable drawable = n4Var.j0;
                drawable.setBounds(i10 - drawable.getIntrinsicWidth(), view.getTop(), i10, view.getBottom());
                n4Var.j0.setAlpha((int) (max * 255.0f));
                n4Var.j0.draw(canvas);
            }
        }
        return drawChild;
    }

    @Override // android.view.View
    public float getAlpha() {
        return this.w;
    }

    public float getInnerTranslationX() {
        return this.v;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.E.T = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        n4 n4Var = this.E;
        n4Var.T = false;
        VideoPlayerHolderBase videoPlayerHolderBase = n4Var.w;
        if (videoPlayerHolderBase != null) {
            videoPlayerHolderBase.release(null);
            n4Var.w = null;
        }
        n4Var.x = null;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f10;
        n4 n4Var = this.E;
        Paint paint = n4Var.u0;
        if (n4Var.H == null) {
            int measuredWidth = getMeasuredWidth();
            float f11 = measuredWidth;
            float measuredHeight = getMeasuredHeight();
            canvas.drawRect(this.v, 0.0f, f11, measuredHeight, n4Var.i0);
            WindowInsets windowInsets = n4Var.Q;
            if (windowInsets != null) {
                canvas.drawRect(this.v, 0.0f, f11, windowInsets.getSystemWindowInsetTop(), paint);
                if (n4Var.R) {
                    int systemWindowInsetLeft = windowInsets.getSystemWindowInsetLeft();
                    if (systemWindowInsetLeft != 0) {
                        canvas.drawRect(0.0f, 0.0f, systemWindowInsetLeft, measuredHeight, paint);
                    }
                    if (windowInsets.getSystemWindowInsetRight() != 0) {
                        f10 = f11;
                        canvas.drawRect(measuredWidth - r2, 0.0f, f10, measuredHeight, paint);
                        canvas.drawRect(0.0f, r9 - windowInsets.getStableInsetBottom(), f10, measuredHeight, n4Var.v0);
                    }
                }
                f10 = f11;
                canvas.drawRect(0.0f, r9 - windowInsets.getStableInsetBottom(), f10, measuredHeight, n4Var.v0);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        HashSet hashSet = n4.Y0;
        this.E.getClass();
        return a(motionEvent) || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        int i14;
        int i15 = i12 - i10;
        n4 n4Var = this.E;
        int i16 = 0;
        if (n4Var.K0 != i15) {
            int i17 = 0;
            while (true) {
                r3[] r3VarArr = n4Var.r0;
                if (i17 >= r3VarArr.length) {
                    break;
                }
                Iterator it = r3VarArr[i17].c.n.entrySet().iterator();
                while (it.hasNext()) {
                    ((Map.Entry) it.next()).setValue(-1);
                }
                i17++;
            }
            n4Var.K0 = i15;
        }
        WindowInsets windowInsets = n4Var.Q;
        if (windowInsets != null) {
            int systemWindowInsetLeft = windowInsets.getSystemWindowInsetLeft();
            if (windowInsets.getSystemWindowInsetRight() != 0) {
                this.x = i15 - this.y;
                this.B = 0;
            } else if (windowInsets.getSystemWindowInsetLeft() != 0) {
                this.x = 0;
                this.B = 0;
            } else {
                this.x = 0;
                this.B = (i13 - i11) - this.C;
            }
            i14 = windowInsets.getSystemWindowInsetTop();
            i16 = systemWindowInsetLeft;
        } else {
            i14 = 0;
        }
        n0 n0Var = n4Var.d0;
        n0Var.layout(i16, i14, n0Var.getMeasuredWidth() + i16, n4Var.d0.getMeasuredHeight() + i14);
        FrameLayout frameLayout = n4Var.M;
        frameLayout.layout(i16, i14, frameLayout.getMeasuredWidth() + i16, n4Var.M.getMeasuredHeight() + i14);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        n4 n4Var = this.E;
        if (n4Var.Q != null) {
            setMeasuredDimension(size, size2);
            WindowInsets windowInsets = n4Var.Q;
            if (AndroidUtilities.incorrectDisplaySizeFix) {
                int i12 = AndroidUtilities.displaySize.y;
                if (size2 > i12) {
                    size2 = i12;
                }
                size2 += AndroidUtilities.statusBarHeight;
            }
            int systemWindowInsetBottom = size2 - windowInsets.getSystemWindowInsetBottom();
            size -= windowInsets.getSystemWindowInsetLeft() + windowInsets.getSystemWindowInsetRight();
            if (windowInsets.getSystemWindowInsetRight() != 0) {
                this.y = windowInsets.getSystemWindowInsetRight();
                this.C = systemWindowInsetBottom;
            } else if (windowInsets.getSystemWindowInsetLeft() != 0) {
                this.y = windowInsets.getSystemWindowInsetLeft();
                this.C = systemWindowInsetBottom;
            } else {
                this.y = size;
                this.C = windowInsets.getStableInsetBottom();
            }
            size2 = systemWindowInsetBottom - windowInsets.getSystemWindowInsetTop();
        } else {
            setMeasuredDimension(size, size2);
        }
        if (n4Var.H == null) {
            n4Var.l0 = size2 < AndroidUtilities.displaySize.y - AndroidUtilities.dp(100.0f);
        }
        n4Var.d0.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
        n4Var.M.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        HashSet hashSet = n4.Y0;
        this.E.getClass();
        return a(motionEvent) || super.onTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z4) {
        a(null);
        super.requestDisallowInterceptTouchEvent(z4);
    }

    @Override // android.view.View
    public void setAlpha(float f10) {
        n4 n4Var = this.E;
        int i10 = (int) (255.0f * f10);
        n4Var.i0.setAlpha(i10);
        n4Var.u0.setAlpha(i10);
        this.w = f10;
        kf.t0 t0Var = n4Var.R0;
        if (t0Var != null) {
            t0Var.a(n4Var.S && f10 == 1.0f && this.v == 0.0f);
        }
        invalidate();
    }

    public void setInnerTranslationX(float f10) {
        this.v = f10;
        n4 n4Var = this.E;
        kf.t0 t0Var = n4Var.R0;
        if (t0Var != null) {
            t0Var.a(n4Var.S && this.w == 1.0f && f10 == 0.0f);
        }
        invalidate();
    }
}
