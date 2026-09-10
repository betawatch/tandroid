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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
class ArticleViewer$WindowView extends FrameLayout {
    public int E;
    public int F;
    public boolean G;
    public final /* synthetic */ j4 H;
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
    public ArticleViewer$WindowView(j4 j4Var, Activity activity) {
        super(activity);
        this.H = j4Var;
        this.a = new Paint();
        this.w = 1.0f;
    }

    public final boolean a(MotionEvent motionEvent) {
        n3 n3Var;
        j4 j4Var = this.H;
        w3 w3Var = j4Var.K;
        if (j4Var.v0 == null && !j4Var.T0 && j4Var.P.getVisibility() != 0 && !j4Var.O0.y()) {
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
                n3 n3Var2 = j4Var.u0[0];
                this.G = n3Var2 == null || !n3Var2.f() || (j4Var.u0[0].e.b(true) && !j4Var.u0[0].e.c);
                if ((w3Var == null || !w3Var.H) && this.c && !this.d && max >= AndroidUtilities.getPixelsInCM(0.4f, true) && Math.abs(max) / 3 > abs && this.G) {
                    b(motionEvent);
                } else if (this.d) {
                    j4Var.d = null;
                    j4Var.f = null;
                    if (this.e && (n3Var = j4Var.u0[0]) != null) {
                        n3Var.setTranslationX(max);
                    } else if (w3Var != null) {
                        w3Var.I = max / getWidth();
                        w3Var.c.invalidate();
                        w3Var.i();
                        w3Var.h();
                    } else {
                        k0 k0Var = j4Var.g0;
                        float f7 = max;
                        k0Var.setTranslationX(f7);
                        setInnerTranslationX(f7);
                    }
                }
            } else if (motionEvent != null && motionEvent.getPointerId(0) == this.b && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6)) {
                if (this.s == null) {
                    this.s = VelocityTracker.obtain();
                }
                this.s.computeCurrentVelocity(MediaDataController.MAX_STYLE_RUNS_COUNT);
                float xVelocity = this.s.getXVelocity();
                float yVelocity = this.s.getYVelocity();
                if ((w3Var == null || !w3Var.H) && !this.d && xVelocity >= 3500.0f && xVelocity > Math.abs(yVelocity)) {
                    b(motionEvent);
                }
                if (this.d) {
                    boolean z10 = this.e;
                    View view = z10 ? j4Var.u0[0] : j4Var.g0;
                    float x10 = (z10 || w3Var == null) ? view.getX() : w3Var.I * w3Var.c.getWidth();
                    boolean z11 = (x10 < ((float) view.getMeasuredWidth()) * 0.3f && (xVelocity < 2500.0f || xVelocity < yVelocity)) || !this.G;
                    AnimatorSet animatorSet = new AnimatorSet();
                    Property property = View.TRANSLATION_X;
                    if (!z11) {
                        x10 = view.getMeasuredWidth() - x10;
                        if (this.e) {
                            animatorSet.playTogether(ObjectAnimator.ofFloat(j4Var.u0[0], (Property<n3, Float>) property, view.getMeasuredWidth()));
                        } else if (w3Var != null) {
                            animatorSet.playTogether(w3Var.d(1.0f));
                        } else {
                            animatorSet.playTogether(ObjectAnimator.ofFloat(j4Var.g0, (Property<k0, Float>) property, view.getMeasuredWidth()), ObjectAnimator.ofFloat(this, j4.d1, view.getMeasuredWidth()));
                        }
                    } else if (this.e) {
                        animatorSet.playTogether(ObjectAnimator.ofFloat(j4Var.u0[0], (Property<n3, Float>) property, 0.0f));
                    } else if (w3Var != null) {
                        animatorSet.playTogether(w3Var.d(0.0f));
                    } else {
                        animatorSet.playTogether(ObjectAnimator.ofFloat(j4Var.g0, (Property<k0, Float>) property, 0.0f), ObjectAnimator.ofFloat(this, j4.d1, 0.0f));
                    }
                    animatorSet.setDuration(Math.max((int) ((420.0f / view.getMeasuredWidth()) * x10), MediaDataController.MAX_LINKS_COUNT));
                    animatorSet.setInterpolator(org.telegram.ui.Components.wr.h);
                    animatorSet.addListener(new i4(this, z11));
                    animatorSet.start();
                    j4Var.T0 = true;
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
                org.telegram.ui.Cells.s9 s9Var = j4Var.O0;
                if (s9Var != null && !s9Var.y()) {
                    j4Var.O0.f(false);
                }
            }
            if (this.d && this.G) {
                return true;
            }
        }
        return false;
    }

    public final void b(MotionEvent motionEvent) {
        l0 l0Var;
        this.c = false;
        this.d = true;
        this.n = (int) motionEvent.getX();
        j4 j4Var = this.H;
        ArrayList arrayList = j4Var.d0;
        if (arrayList.size() <= 1 || ((l0Var = j4Var.h0) != null && (l0Var.T || l0Var.W))) {
            this.e = false;
        } else {
            this.e = true;
            this.h = j4Var.I0;
            j4Var.u0[1].setVisibility(0);
            j4Var.u0[1].setAlpha(1.0f);
            j4Var.u0[1].setTranslationX(0.0f);
            j4Var.u0[0].setBackgroundColor(j4Var.K == null ? 0 : j4Var.l0.getColor());
            j4Var.e0(-1, arrayList.get(arrayList.size() - 2), true);
            if (j4Var.g0.indexOfChild(j4Var.u0[0]) < j4Var.g0.indexOfChild(j4Var.u0[1])) {
                int indexOfChild = j4Var.g0.indexOfChild(j4Var.u0[0]);
                j4Var.g0.removeView(j4Var.u0[1]);
                j4Var.g0.addView(j4Var.u0[1], indexOfChild);
            }
        }
        j4Var.k();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        ArticleViewer$WindowView articleViewer$WindowView;
        Activity activity;
        DisplayCutout displayCutout;
        List<Rect> boundingRects;
        j4 j4Var = this.H;
        if (j4Var.K != null) {
            return super.dispatchApplyWindowInsets(windowInsets);
        }
        WindowInsets windowInsets2 = j4Var.T;
        j4Var.T = windowInsets;
        if ((windowInsets2 == null || !windowInsets2.toString().equals(windowInsets.toString())) && (articleViewer$WindowView = j4Var.f0) != null) {
            articleViewer$WindowView.requestLayout();
        }
        if (Build.VERSION.SDK_INT >= 28 && (activity = j4Var.L) != null && (displayCutout = activity.getWindow().getDecorView().getRootWindowInsets().getDisplayCutout()) != null && (boundingRects = displayCutout.getBoundingRects()) != null && !boundingRects.isEmpty()) {
            j4Var.U = boundingRects.get(0).height() != 0;
        }
        return super.dispatchApplyWindowInsets(windowInsets);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        super.dispatchDraw(canvas);
        j4 j4Var = this.H;
        if (j4Var.T != null || this.y == 0 || this.F == 0) {
            return;
        }
        int alpha = (int) (j4Var.f0.getAlpha() * 255.0f);
        Paint paint = this.a;
        paint.setAlpha(alpha);
        int i11 = this.x;
        if (i11 == 0 && (i10 = this.E) == 0) {
            canvas.drawRect(i11, i10, i11 + this.y, i10 + this.F, paint);
        } else {
            canvas.drawRect(i11 - getTranslationX(), this.E, (this.x + this.y) - getTranslationX(), this.E + this.F, paint);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        if (keyEvent == null || keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 1) {
            return super.dispatchKeyEventPreIme(keyEvent);
        }
        j4 j4Var = this.H;
        if (j4Var.h0.V.isFocused()) {
            j4Var.h0.V.clearFocus();
            AndroidUtilities.hideKeyboard(j4Var.h0.V);
            return true;
        }
        if (j4Var.h0.b0.isFocused()) {
            j4Var.h0.b0.clearFocus();
            AndroidUtilities.hideKeyboard(j4Var.h0.b0);
            return true;
        }
        if (j4Var.o0) {
            AndroidUtilities.hideKeyboard(this);
            return true;
        }
        n3 n3Var = j4Var.u0[0];
        if (n3Var == null || !n3Var.f() || j4Var.u0[0].getWebView() == null || !j4Var.u0[0].getWebView().canGoBack()) {
            j4Var.o(true, false);
            return true;
        }
        j4Var.u0[0].getWebView().goBack();
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        n3 n3Var;
        ArrayList arrayList;
        j4 j4Var = this.H;
        if (j4Var.Q0.n) {
            motionEvent.offsetLocation(-j4Var.g0.getX(), -j4Var.g0.getY());
            return j4Var.Q0.g(motionEvent);
        }
        org.telegram.ui.Cells.ea o9 = j4Var.O0.o(getContext());
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.offsetLocation(-j4Var.g0.getX(), -j4Var.g0.getY());
        if (!j4Var.O0.y() || !j4Var.O0.o(getContext()).onTouchEvent(obtain)) {
            if (o9.b(motionEvent)) {
                n3[] n3VarArr = j4Var.u0;
                if (n3VarArr == null || (n3Var = n3VarArr[0]) == null || !n3Var.f() || (arrayList = j4Var.d0) == null || arrayList.size() > 1) {
                    motionEvent.setAction(3);
                } else {
                    motionEvent.setAction(1);
                }
            }
            if (motionEvent.getAction() != 0 || !j4Var.O0.y() || (motionEvent.getY() >= j4Var.g0.getTop() && motionEvent.getY() <= j4Var.g0.getBottom())) {
                return super.dispatchTouchEvent(motionEvent);
            }
            if (j4Var.O0.o(getContext()).onTouchEvent(obtain)) {
                return super.dispatchTouchEvent(motionEvent);
            }
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        int measuredWidth = getMeasuredWidth();
        int i10 = (int) this.v;
        int save = canvas.save();
        canvas.clipRect(i10, 0, measuredWidth, getHeight());
        boolean drawChild = super.drawChild(canvas, view, j3);
        canvas.restoreToCount(save);
        if (i10 != 0) {
            j4 j4Var = this.H;
            if (view == j4Var.g0) {
                float f7 = measuredWidth - i10;
                float min = Math.min(0.8f, f7 / measuredWidth);
                if (min < 0.0f) {
                    min = 0.0f;
                }
                j4Var.n0.setColor(((int) (min * 153.0f)) << 24);
                canvas.drawRect(0.0f, 0.0f, i10, getHeight(), j4Var.n0);
                float max = Math.max(0.0f, Math.min(f7 / AndroidUtilities.dp(20.0f), 1.0f));
                Drawable drawable = j4Var.m0;
                drawable.setBounds(i10 - drawable.getIntrinsicWidth(), view.getTop(), i10, view.getBottom());
                j4Var.m0.setAlpha((int) (max * 255.0f));
                j4Var.m0.draw(canvas);
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
        this.H.W = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        j4 j4Var = this.H;
        j4Var.W = false;
        VideoPlayerHolderBase videoPlayerHolderBase = j4Var.w;
        if (videoPlayerHolderBase != null) {
            videoPlayerHolderBase.release(null);
            j4Var.w = null;
        }
        j4Var.x = null;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f7;
        j4 j4Var = this.H;
        Paint paint = j4Var.x0;
        if (j4Var.K == null) {
            int measuredWidth = getMeasuredWidth();
            float f10 = measuredWidth;
            float measuredHeight = getMeasuredHeight();
            canvas.drawRect(this.v, 0.0f, f10, measuredHeight, j4Var.l0);
            WindowInsets windowInsets = j4Var.T;
            if (windowInsets != null) {
                canvas.drawRect(this.v, 0.0f, f10, windowInsets.getSystemWindowInsetTop(), paint);
                if (j4Var.U) {
                    int systemWindowInsetLeft = windowInsets.getSystemWindowInsetLeft();
                    if (systemWindowInsetLeft != 0) {
                        canvas.drawRect(0.0f, 0.0f, systemWindowInsetLeft, measuredHeight, paint);
                    }
                    if (windowInsets.getSystemWindowInsetRight() != 0) {
                        f7 = f10;
                        canvas.drawRect(measuredWidth - r2, 0.0f, f7, measuredHeight, paint);
                        canvas.drawRect(0.0f, r9 - windowInsets.getStableInsetBottom(), f7, measuredHeight, j4Var.y0);
                    }
                }
                f7 = f10;
                canvas.drawRect(0.0f, r9 - windowInsets.getStableInsetBottom(), f7, measuredHeight, j4Var.y0);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        HashSet hashSet = j4.b1;
        this.H.getClass();
        return a(motionEvent) || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        int i15 = i12 - i10;
        j4 j4Var = this.H;
        int i16 = 0;
        if (j4Var.N0 != i15) {
            int i17 = 0;
            while (true) {
                n3[] n3VarArr = j4Var.u0;
                if (i17 >= n3VarArr.length) {
                    break;
                }
                Iterator it = n3VarArr[i17].c.n.entrySet().iterator();
                while (it.hasNext()) {
                    ((Map.Entry) it.next()).setValue(-1);
                }
                i17++;
            }
            j4Var.N0 = i15;
        }
        WindowInsets windowInsets = j4Var.T;
        if (windowInsets != null) {
            int systemWindowInsetLeft = windowInsets.getSystemWindowInsetLeft();
            if (windowInsets.getSystemWindowInsetRight() != 0) {
                this.x = i15 - this.y;
                this.E = 0;
            } else if (windowInsets.getSystemWindowInsetLeft() != 0) {
                this.x = 0;
                this.E = 0;
            } else {
                this.x = 0;
                this.E = (i13 - i11) - this.F;
            }
            i14 = windowInsets.getSystemWindowInsetTop();
            i16 = systemWindowInsetLeft;
        } else {
            i14 = 0;
        }
        k0 k0Var = j4Var.g0;
        k0Var.layout(i16, i14, k0Var.getMeasuredWidth() + i16, j4Var.g0.getMeasuredHeight() + i14);
        FrameLayout frameLayout = j4Var.P;
        frameLayout.layout(i16, i14, frameLayout.getMeasuredWidth() + i16, j4Var.P.getMeasuredHeight() + i14);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        j4 j4Var = this.H;
        if (j4Var.T != null) {
            setMeasuredDimension(size, size2);
            WindowInsets windowInsets = j4Var.T;
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
                this.F = systemWindowInsetBottom;
            } else if (windowInsets.getSystemWindowInsetLeft() != 0) {
                this.y = windowInsets.getSystemWindowInsetLeft();
                this.F = systemWindowInsetBottom;
            } else {
                this.y = size;
                this.F = windowInsets.getStableInsetBottom();
            }
            size2 = systemWindowInsetBottom - windowInsets.getSystemWindowInsetTop();
        } else {
            setMeasuredDimension(size, size2);
        }
        if (j4Var.K == null) {
            j4Var.o0 = size2 < AndroidUtilities.displaySize.y - AndroidUtilities.dp(100.0f);
        }
        j4Var.g0.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
        j4Var.P.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        HashSet hashSet = j4.b1;
        this.H.getClass();
        return a(motionEvent) || super.onTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        a(null);
        super.requestDisallowInterceptTouchEvent(z10);
    }

    @Override // android.view.View
    public void setAlpha(float f7) {
        j4 j4Var = this.H;
        int i10 = (int) (255.0f * f7);
        j4Var.l0.setAlpha(i10);
        j4Var.x0.setAlpha(i10);
        this.w = f7;
        kb0 kb0Var = j4Var.U0;
        if (kb0Var != null) {
            kb0Var.a(j4Var.V && f7 == 1.0f && this.v == 0.0f);
        }
        invalidate();
    }

    public void setInnerTranslationX(float f7) {
        this.v = f7;
        j4 j4Var = this.H;
        kb0 kb0Var = j4Var.U0;
        if (kb0Var != null) {
            kb0Var.a(j4Var.V && this.w == 1.0f && f7 == 0.0f);
        }
        invalidate();
    }
}
