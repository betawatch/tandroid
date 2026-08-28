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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
class ArticleViewer$WindowView extends FrameLayout {
    public int A;
    public int B;
    public boolean C;
    public final /* synthetic */ l4 D;
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
    public ArticleViewer$WindowView(l4 l4Var, Activity activity) {
        super(activity);
        this.D = l4Var;
        this.a = new Paint();
        this.w = 1.0f;
    }

    public final boolean a(MotionEvent motionEvent) {
        p3 p3Var;
        l4 l4Var = this.D;
        y3 y3Var = l4Var.G;
        if (l4Var.r0 == null && !l4Var.P0 && l4Var.L.getVisibility() != 0 && !l4Var.K0.y()) {
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
                p3 p3Var2 = l4Var.q0[0];
                this.C = p3Var2 == null || !p3Var2.f() || (l4Var.q0[0].e.b(true) && !l4Var.q0[0].e.c);
                if ((y3Var == null || !y3Var.D) && this.c && !this.d && max >= AndroidUtilities.getPixelsInCM(0.4f, true) && Math.abs(max) / 3 > abs && this.C) {
                    b(motionEvent);
                } else if (this.d) {
                    l4Var.d = null;
                    l4Var.f = null;
                    if (this.e && (p3Var = l4Var.q0[0]) != null) {
                        p3Var.setTranslationX(max);
                    } else if (y3Var != null) {
                        y3Var.E = max / getWidth();
                        y3Var.c.invalidate();
                        y3Var.i();
                        y3Var.h();
                    } else {
                        m0 m0Var = l4Var.c0;
                        float f10 = max;
                        m0Var.setTranslationX(f10);
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
                if ((y3Var == null || !y3Var.D) && !this.d && xVelocity >= 3500.0f && xVelocity > Math.abs(yVelocity)) {
                    b(motionEvent);
                }
                if (this.d) {
                    boolean z10 = this.e;
                    View view = z10 ? l4Var.q0[0] : l4Var.c0;
                    float x10 = (z10 || y3Var == null) ? view.getX() : y3Var.E * y3Var.c.getWidth();
                    boolean z11 = (x10 < ((float) view.getMeasuredWidth()) * 0.3f && (xVelocity < 2500.0f || xVelocity < yVelocity)) || !this.C;
                    AnimatorSet animatorSet = new AnimatorSet();
                    Property property = View.TRANSLATION_X;
                    if (!z11) {
                        x10 = view.getMeasuredWidth() - x10;
                        if (this.e) {
                            animatorSet.playTogether(ObjectAnimator.ofFloat(l4Var.q0[0], (Property<p3, Float>) property, view.getMeasuredWidth()));
                        } else if (y3Var != null) {
                            animatorSet.playTogether(y3Var.d(1.0f));
                        } else {
                            animatorSet.playTogether(ObjectAnimator.ofFloat(l4Var.c0, (Property<m0, Float>) property, view.getMeasuredWidth()), ObjectAnimator.ofFloat(this, l4.Z0, view.getMeasuredWidth()));
                        }
                    } else if (this.e) {
                        animatorSet.playTogether(ObjectAnimator.ofFloat(l4Var.q0[0], (Property<p3, Float>) property, 0.0f));
                    } else if (y3Var != null) {
                        animatorSet.playTogether(y3Var.d(0.0f));
                    } else {
                        animatorSet.playTogether(ObjectAnimator.ofFloat(l4Var.c0, (Property<m0, Float>) property, 0.0f), ObjectAnimator.ofFloat(this, l4.Z0, 0.0f));
                    }
                    animatorSet.setDuration(Math.max((int) ((420.0f / view.getMeasuredWidth()) * x10), MediaDataController.MAX_LINKS_COUNT));
                    animatorSet.setInterpolator(org.telegram.ui.Components.gr.h);
                    animatorSet.addListener(new k4(this, z11));
                    animatorSet.start();
                    l4Var.P0 = true;
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
                org.telegram.ui.Cells.n9 n9Var = l4Var.K0;
                if (n9Var != null && !n9Var.y()) {
                    l4Var.K0.f(false);
                }
            }
            if (this.d && this.C) {
                return true;
            }
        }
        return false;
    }

    public final void b(MotionEvent motionEvent) {
        n0 n0Var;
        this.c = false;
        this.d = true;
        this.n = (int) motionEvent.getX();
        l4 l4Var = this.D;
        ArrayList arrayList = l4Var.Z;
        if (arrayList.size() <= 1 || ((n0Var = l4Var.d0) != null && (n0Var.P || n0Var.S))) {
            this.e = false;
        } else {
            this.e = true;
            this.h = l4Var.E0;
            l4Var.q0[1].setVisibility(0);
            l4Var.q0[1].setAlpha(1.0f);
            l4Var.q0[1].setTranslationX(0.0f);
            l4Var.q0[0].setBackgroundColor(l4Var.G == null ? 0 : l4Var.h0.getColor());
            l4Var.e0(-1, arrayList.get(arrayList.size() - 2), true);
            if (l4Var.c0.indexOfChild(l4Var.q0[0]) < l4Var.c0.indexOfChild(l4Var.q0[1])) {
                int indexOfChild = l4Var.c0.indexOfChild(l4Var.q0[0]);
                l4Var.c0.removeView(l4Var.q0[1]);
                l4Var.c0.addView(l4Var.q0[1], indexOfChild);
            }
        }
        l4Var.k();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        ArticleViewer$WindowView articleViewer$WindowView;
        Activity activity;
        DisplayCutout displayCutout;
        List<Rect> boundingRects;
        l4 l4Var = this.D;
        if (l4Var.G != null) {
            return super.dispatchApplyWindowInsets(windowInsets);
        }
        WindowInsets windowInsets2 = l4Var.P;
        l4Var.P = windowInsets;
        if ((windowInsets2 == null || !windowInsets2.toString().equals(windowInsets.toString())) && (articleViewer$WindowView = l4Var.b0) != null) {
            articleViewer$WindowView.requestLayout();
        }
        if (Build.VERSION.SDK_INT >= 28 && (activity = l4Var.H) != null && (displayCutout = activity.getWindow().getDecorView().getRootWindowInsets().getDisplayCutout()) != null && (boundingRects = displayCutout.getBoundingRects()) != null && !boundingRects.isEmpty()) {
            l4Var.Q = boundingRects.get(0).height() != 0;
        }
        return super.dispatchApplyWindowInsets(windowInsets);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int i9;
        super.dispatchDraw(canvas);
        l4 l4Var = this.D;
        if (l4Var.P != null || this.y == 0 || this.B == 0) {
            return;
        }
        int alpha = (int) (l4Var.b0.getAlpha() * 255.0f);
        Paint paint = this.a;
        paint.setAlpha(alpha);
        int i10 = this.x;
        if (i10 == 0 && (i9 = this.A) == 0) {
            canvas.drawRect(i10, i9, i10 + this.y, i9 + this.B, paint);
        } else {
            canvas.drawRect(i10 - getTranslationX(), this.A, (this.x + this.y) - getTranslationX(), this.A + this.B, paint);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        if (keyEvent == null || keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 1) {
            return super.dispatchKeyEventPreIme(keyEvent);
        }
        l4 l4Var = this.D;
        if (l4Var.d0.R.isFocused()) {
            l4Var.d0.R.clearFocus();
            AndroidUtilities.hideKeyboard(l4Var.d0.R);
            return true;
        }
        if (l4Var.d0.U.isFocused()) {
            l4Var.d0.U.clearFocus();
            AndroidUtilities.hideKeyboard(l4Var.d0.U);
            return true;
        }
        if (l4Var.k0) {
            AndroidUtilities.hideKeyboard(this);
            return true;
        }
        p3 p3Var = l4Var.q0[0];
        if (p3Var == null || !p3Var.f() || l4Var.q0[0].getWebView() == null || !l4Var.q0[0].getWebView().canGoBack()) {
            l4Var.o(true, false);
            return true;
        }
        l4Var.q0[0].getWebView().goBack();
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        p3 p3Var;
        ArrayList arrayList;
        l4 l4Var = this.D;
        if (l4Var.M0.n) {
            motionEvent.offsetLocation(-l4Var.c0.getX(), -l4Var.c0.getY());
            return l4Var.M0.g(motionEvent);
        }
        org.telegram.ui.Cells.z9 o6 = l4Var.K0.o(getContext());
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.offsetLocation(-l4Var.c0.getX(), -l4Var.c0.getY());
        if (!l4Var.K0.y() || !l4Var.K0.o(getContext()).onTouchEvent(obtain)) {
            if (o6.b(motionEvent)) {
                p3[] p3VarArr = l4Var.q0;
                if (p3VarArr == null || (p3Var = p3VarArr[0]) == null || !p3Var.f() || (arrayList = l4Var.Z) == null || arrayList.size() > 1) {
                    motionEvent.setAction(3);
                } else {
                    motionEvent.setAction(1);
                }
            }
            if (motionEvent.getAction() != 0 || !l4Var.K0.y() || (motionEvent.getY() >= l4Var.c0.getTop() && motionEvent.getY() <= l4Var.c0.getBottom())) {
                return super.dispatchTouchEvent(motionEvent);
            }
            if (l4Var.K0.o(getContext()).onTouchEvent(obtain)) {
                return super.dispatchTouchEvent(motionEvent);
            }
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        int measuredWidth = getMeasuredWidth();
        int i9 = (int) this.v;
        int save = canvas.save();
        canvas.clipRect(i9, 0, measuredWidth, getHeight());
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restoreToCount(save);
        if (i9 != 0) {
            l4 l4Var = this.D;
            if (view == l4Var.c0) {
                float f10 = measuredWidth - i9;
                float min = Math.min(0.8f, f10 / measuredWidth);
                if (min < 0.0f) {
                    min = 0.0f;
                }
                l4Var.j0.setColor(((int) (min * 153.0f)) << 24);
                canvas.drawRect(0.0f, 0.0f, i9, getHeight(), l4Var.j0);
                float max = Math.max(0.0f, Math.min(f10 / AndroidUtilities.dp(20.0f), 1.0f));
                Drawable drawable = l4Var.i0;
                drawable.setBounds(i9 - drawable.getIntrinsicWidth(), view.getTop(), i9, view.getBottom());
                l4Var.i0.setAlpha((int) (max * 255.0f));
                l4Var.i0.draw(canvas);
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
        this.D.S = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        l4 l4Var = this.D;
        l4Var.S = false;
        VideoPlayerHolderBase videoPlayerHolderBase = l4Var.w;
        if (videoPlayerHolderBase != null) {
            videoPlayerHolderBase.release(null);
            l4Var.w = null;
        }
        l4Var.x = null;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f10;
        l4 l4Var = this.D;
        Paint paint = l4Var.t0;
        if (l4Var.G == null) {
            int measuredWidth = getMeasuredWidth();
            float f11 = measuredWidth;
            float measuredHeight = getMeasuredHeight();
            canvas.drawRect(this.v, 0.0f, f11, measuredHeight, l4Var.h0);
            WindowInsets windowInsets = l4Var.P;
            if (windowInsets != null) {
                canvas.drawRect(this.v, 0.0f, f11, windowInsets.getSystemWindowInsetTop(), paint);
                if (l4Var.Q) {
                    int systemWindowInsetLeft = windowInsets.getSystemWindowInsetLeft();
                    if (systemWindowInsetLeft != 0) {
                        canvas.drawRect(0.0f, 0.0f, systemWindowInsetLeft, measuredHeight, paint);
                    }
                    if (windowInsets.getSystemWindowInsetRight() != 0) {
                        f10 = f11;
                        canvas.drawRect(measuredWidth - r2, 0.0f, f10, measuredHeight, paint);
                        canvas.drawRect(0.0f, r9 - windowInsets.getStableInsetBottom(), f10, measuredHeight, l4Var.u0);
                    }
                }
                f10 = f11;
                canvas.drawRect(0.0f, r9 - windowInsets.getStableInsetBottom(), f10, measuredHeight, l4Var.u0);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        HashSet hashSet = l4.X0;
        this.D.getClass();
        return a(motionEvent) || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        int i13;
        int i14 = i11 - i9;
        l4 l4Var = this.D;
        int i15 = 0;
        if (l4Var.J0 != i14) {
            int i16 = 0;
            while (true) {
                p3[] p3VarArr = l4Var.q0;
                if (i16 >= p3VarArr.length) {
                    break;
                }
                Iterator it = p3VarArr[i16].c.n.entrySet().iterator();
                while (it.hasNext()) {
                    ((Map.Entry) it.next()).setValue(-1);
                }
                i16++;
            }
            l4Var.J0 = i14;
        }
        WindowInsets windowInsets = l4Var.P;
        if (windowInsets != null) {
            int systemWindowInsetLeft = windowInsets.getSystemWindowInsetLeft();
            if (windowInsets.getSystemWindowInsetRight() != 0) {
                this.x = i14 - this.y;
                this.A = 0;
            } else if (windowInsets.getSystemWindowInsetLeft() != 0) {
                this.x = 0;
                this.A = 0;
            } else {
                this.x = 0;
                this.A = (i12 - i10) - this.B;
            }
            i13 = windowInsets.getSystemWindowInsetTop();
            i15 = systemWindowInsetLeft;
        } else {
            i13 = 0;
        }
        m0 m0Var = l4Var.c0;
        m0Var.layout(i15, i13, m0Var.getMeasuredWidth() + i15, l4Var.c0.getMeasuredHeight() + i13);
        FrameLayout frameLayout = l4Var.L;
        frameLayout.layout(i15, i13, frameLayout.getMeasuredWidth() + i15, l4Var.L.getMeasuredHeight() + i13);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        int size = View.MeasureSpec.getSize(i9);
        int size2 = View.MeasureSpec.getSize(i10);
        l4 l4Var = this.D;
        if (l4Var.P != null) {
            setMeasuredDimension(size, size2);
            WindowInsets windowInsets = l4Var.P;
            if (AndroidUtilities.incorrectDisplaySizeFix) {
                int i11 = AndroidUtilities.displaySize.y;
                if (size2 > i11) {
                    size2 = i11;
                }
                size2 += AndroidUtilities.statusBarHeight;
            }
            int systemWindowInsetBottom = size2 - windowInsets.getSystemWindowInsetBottom();
            size -= windowInsets.getSystemWindowInsetLeft() + windowInsets.getSystemWindowInsetRight();
            if (windowInsets.getSystemWindowInsetRight() != 0) {
                this.y = windowInsets.getSystemWindowInsetRight();
                this.B = systemWindowInsetBottom;
            } else if (windowInsets.getSystemWindowInsetLeft() != 0) {
                this.y = windowInsets.getSystemWindowInsetLeft();
                this.B = systemWindowInsetBottom;
            } else {
                this.y = size;
                this.B = windowInsets.getStableInsetBottom();
            }
            size2 = systemWindowInsetBottom - windowInsets.getSystemWindowInsetTop();
        } else {
            setMeasuredDimension(size, size2);
        }
        if (l4Var.G == null) {
            l4Var.k0 = size2 < AndroidUtilities.displaySize.y - AndroidUtilities.dp(100.0f);
        }
        l4Var.c0.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
        l4Var.L.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        HashSet hashSet = l4.X0;
        this.D.getClass();
        return a(motionEvent) || super.onTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        a(null);
        super.requestDisallowInterceptTouchEvent(z10);
    }

    @Override // android.view.View
    public void setAlpha(float f10) {
        l4 l4Var = this.D;
        int i9 = (int) (255.0f * f10);
        l4Var.h0.setAlpha(i9);
        l4Var.t0.setAlpha(i9);
        this.w = f10;
        ff.t0 t0Var = l4Var.Q0;
        if (t0Var != null) {
            t0Var.a(l4Var.R && f10 == 1.0f && this.v == 0.0f);
        }
        invalidate();
    }

    public void setInnerTranslationX(float f10) {
        this.v = f10;
        l4 l4Var = this.D;
        ff.t0 t0Var = l4Var.Q0;
        if (t0Var != null) {
            t0Var.a(l4Var.R && this.w == 1.0f && f10 == 0.0f);
        }
        invalidate();
    }
}
