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
import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
class ArticleViewer$WindowView extends FrameLayout implements org.telegram.ui.ActionBar.a6 {
    public int D;
    public int E;
    public int F;
    public boolean G;
    public final /* synthetic */ g4 H;
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
    public float w;
    public float x;
    public int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ArticleViewer$WindowView(g4 g4Var, Activity activity) {
        super(activity);
        this.H = g4Var;
        this.a = new Paint();
        this.x = 1.0f;
    }

    public final boolean a(MotionEvent motionEvent) {
        k3 k3Var;
        g4 g4Var = this.H;
        t3 t3Var = g4Var.K;
        if (g4Var.v0 == null && !g4Var.U0 && g4Var.P.getVisibility() != 0 && !g4Var.P0.x()) {
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
                k3 k3Var2 = g4Var.u0[0];
                this.G = k3Var2 == null || !k3Var2.f() || (g4Var.u0[0].e.b(true) && !g4Var.u0[0].e.c);
                if ((t3Var == null || !t3Var.H) && this.c && !this.d && max >= org.telegram.messenger.g0.a1(true, 0.4f) && Math.abs(max) / 3 > abs && this.G) {
                    b(motionEvent);
                } else if (this.d) {
                    g4Var.d = null;
                    g4Var.f = null;
                    if (this.e && (k3Var = g4Var.u0[0]) != null) {
                        k3Var.setTranslationX(max);
                    } else if (t3Var != null) {
                        t3Var.I = max / getWidth();
                        t3Var.c.invalidate();
                        t3Var.u();
                        t3Var.r();
                    } else {
                        k0 k0Var = g4Var.g0;
                        float f10 = max;
                        k0Var.setTranslationX(f10);
                        setInnerTranslationX(f10);
                    }
                }
            } else if (motionEvent != null && motionEvent.getPointerId(0) == this.b && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6)) {
                if (this.s == null) {
                    this.s = VelocityTracker.obtain();
                }
                this.s.computeCurrentVelocity(1000);
                float xVelocity = this.s.getXVelocity();
                float yVelocity = this.s.getYVelocity();
                if ((t3Var == null || !t3Var.H) && !this.d && xVelocity >= 3500.0f && xVelocity > Math.abs(yVelocity)) {
                    b(motionEvent);
                }
                if (this.d) {
                    boolean z9 = this.e;
                    View view = z9 ? g4Var.u0[0] : g4Var.g0;
                    float x10 = (z9 || t3Var == null) ? view.getX() : t3Var.I * t3Var.c.getWidth();
                    boolean z10 = (x10 < ((float) view.getMeasuredWidth()) * 0.3f && (xVelocity < 2500.0f || xVelocity < yVelocity)) || !this.G;
                    AnimatorSet animatorSet = new AnimatorSet();
                    Property property = View.TRANSLATION_X;
                    if (!z10) {
                        x10 = view.getMeasuredWidth() - x10;
                        if (this.e) {
                            animatorSet.playTogether(ObjectAnimator.ofFloat(g4Var.u0[0], (Property<k3, Float>) property, view.getMeasuredWidth()));
                        } else if (t3Var != null) {
                            animatorSet.playTogether(t3Var.l(1.0f));
                        } else {
                            animatorSet.playTogether(ObjectAnimator.ofFloat(g4Var.g0, (Property<k0, Float>) property, view.getMeasuredWidth()), ObjectAnimator.ofFloat(this, g4.e1, view.getMeasuredWidth()));
                        }
                    } else if (this.e) {
                        animatorSet.playTogether(ObjectAnimator.ofFloat(g4Var.u0[0], (Property<k3, Float>) property, 0.0f));
                    } else if (t3Var != null) {
                        animatorSet.playTogether(t3Var.l(0.0f));
                    } else {
                        animatorSet.playTogether(ObjectAnimator.ofFloat(g4Var.g0, (Property<k0, Float>) property, 0.0f), ObjectAnimator.ofFloat(this, g4.e1, 0.0f));
                    }
                    animatorSet.setDuration(Math.max((int) ((420.0f / view.getMeasuredWidth()) * x10), org.telegram.messenger.qs.Z3));
                    animatorSet.setInterpolator(org.telegram.ui.Components.xq.h);
                    animatorSet.addListener(new f4(this, z10));
                    animatorSet.start();
                    g4Var.U0 = true;
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
                org.telegram.ui.Cells.i9 i9Var = g4Var.P0;
                if (i9Var != null && !i9Var.x()) {
                    g4Var.P0.f(false);
                }
            }
            if (this.d && this.G) {
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Dl));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.d6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.J6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.K6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.k6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.M6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Id));
    }

    public final void b(MotionEvent motionEvent) {
        l0 l0Var;
        this.c = false;
        this.d = true;
        this.n = (int) motionEvent.getX();
        g4 g4Var = this.H;
        ArrayList arrayList = g4Var.d0;
        if (arrayList.size() <= 1 || ((l0Var = g4Var.h0) != null && (l0Var.T || l0Var.W))) {
            this.e = false;
        } else {
            this.e = true;
            this.h = g4Var.J0;
            g4Var.u0[1].setVisibility(0);
            g4Var.u0[1].setAlpha(1.0f);
            g4Var.u0[1].setTranslationX(0.0f);
            g4Var.u0[0].setBackgroundColor(g4Var.K == null ? 0 : g4Var.l0.getColor());
            g4Var.c0(-1, arrayList.get(arrayList.size() - 2), true);
            if (g4Var.g0.indexOfChild(g4Var.u0[0]) < g4Var.g0.indexOfChild(g4Var.u0[1])) {
                int indexOfChild = g4Var.g0.indexOfChild(g4Var.u0[0]);
                g4Var.g0.removeView(g4Var.u0[1]);
                g4Var.g0.addView(g4Var.u0[1], indexOfChild);
            }
        }
        g4Var.i();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        ArticleViewer$WindowView articleViewer$WindowView;
        Activity activity;
        DisplayCutout displayCutout;
        List<Rect> boundingRects;
        g4 g4Var = this.H;
        if (g4Var.K != null) {
            return super.dispatchApplyWindowInsets(windowInsets);
        }
        WindowInsets windowInsets2 = g4Var.T;
        g4Var.T = windowInsets;
        if ((windowInsets2 == null || !windowInsets2.toString().equals(windowInsets.toString())) && (articleViewer$WindowView = g4Var.f0) != null) {
            articleViewer$WindowView.requestLayout();
        }
        if (Build.VERSION.SDK_INT >= 28 && (activity = g4Var.L) != null && (displayCutout = activity.getWindow().getDecorView().getRootWindowInsets().getDisplayCutout()) != null && (boundingRects = displayCutout.getBoundingRects()) != null && !boundingRects.isEmpty()) {
            g4Var.U = boundingRects.get(0).height() != 0;
        }
        return super.dispatchApplyWindowInsets(windowInsets);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int i7;
        super.dispatchDraw(canvas);
        g4 g4Var = this.H;
        if (g4Var.T != null || this.D == 0 || this.F == 0) {
            return;
        }
        int alpha = (int) (g4Var.f0.getAlpha() * 255.0f);
        Paint paint = this.a;
        paint.setAlpha(alpha);
        int i10 = this.y;
        if (i10 == 0 && (i7 = this.E) == 0) {
            canvas.drawRect(i10, i7, i10 + this.D, i7 + this.F, paint);
        } else {
            canvas.drawRect(i10 - getTranslationX(), this.E, (this.y + this.D) - getTranslationX(), this.E + this.F, paint);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        if (keyEvent == null || keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 1) {
            return super.dispatchKeyEventPreIme(keyEvent);
        }
        g4 g4Var = this.H;
        if (g4Var.h0.V.isFocused()) {
            g4Var.h0.V.clearFocus();
            org.telegram.messenger.g0.v1(g4Var.h0.V);
            return true;
        }
        if (g4Var.h0.b0.isFocused()) {
            g4Var.h0.b0.clearFocus();
            org.telegram.messenger.g0.v1(g4Var.h0.b0);
            return true;
        }
        if (g4Var.o0) {
            org.telegram.messenger.g0.v1(this);
            return true;
        }
        k3 k3Var = g4Var.u0[0];
        if (k3Var == null || !k3Var.f() || g4Var.u0[0].getWebView() == null || !g4Var.u0[0].getWebView().canGoBack()) {
            g4Var.m(true, false);
            return true;
        }
        g4Var.u0[0].getWebView().goBack();
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        k3 k3Var;
        ArrayList arrayList;
        g4 g4Var = this.H;
        if (g4Var.R0.n) {
            motionEvent.offsetLocation(-g4Var.g0.getX(), -g4Var.g0.getY());
            return g4Var.R0.g(motionEvent);
        }
        org.telegram.ui.Cells.u9 n10 = g4Var.P0.n(getContext());
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.offsetLocation(-g4Var.g0.getX(), -g4Var.g0.getY());
        if (!g4Var.P0.x() || !g4Var.P0.n(getContext()).onTouchEvent(obtain)) {
            if (n10.b(motionEvent)) {
                k3[] k3VarArr = g4Var.u0;
                if (k3VarArr == null || (k3Var = k3VarArr[0]) == null || !k3Var.f() || (arrayList = g4Var.d0) == null || arrayList.size() > 1) {
                    motionEvent.setAction(3);
                } else {
                    motionEvent.setAction(1);
                }
            }
            if (motionEvent.getAction() != 0 || !g4Var.P0.x() || (motionEvent.getY() >= g4Var.g0.getTop() && motionEvent.getY() <= g4Var.g0.getBottom())) {
                return super.dispatchTouchEvent(motionEvent);
            }
            if (g4Var.P0.n(getContext()).onTouchEvent(obtain)) {
                return super.dispatchTouchEvent(motionEvent);
            }
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        int measuredWidth = getMeasuredWidth();
        int i7 = (int) this.w;
        int save = canvas.save();
        canvas.clipRect(i7, 0, measuredWidth, getHeight());
        boolean drawChild = super.drawChild(canvas, view, j3);
        canvas.restoreToCount(save);
        if (i7 != 0) {
            g4 g4Var = this.H;
            if (view == g4Var.g0) {
                float f10 = measuredWidth - i7;
                float min = Math.min(0.8f, f10 / measuredWidth);
                if (min < 0.0f) {
                    min = 0.0f;
                }
                g4Var.n0.setColor(((int) (min * 153.0f)) << 24);
                canvas.drawRect(0.0f, 0.0f, i7, getHeight(), g4Var.n0);
                float max = Math.max(0.0f, Math.min(f10 / org.telegram.messenger.g0.L(20.0f), 1.0f));
                Drawable drawable = g4Var.m0;
                drawable.setBounds(i7 - drawable.getIntrinsicWidth(), view.getTop(), i7, view.getBottom());
                g4Var.m0.setAlpha((int) (max * 255.0f));
                g4Var.m0.draw(canvas);
            }
        }
        return drawChild;
    }

    @Override // android.view.View
    public float getAlpha() {
        return this.x;
    }

    public float getInnerTranslationX() {
        return this.w;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.H.W = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        g4 g4Var = this.H;
        g4Var.W = false;
        VideoPlayerHolderBase videoPlayerHolderBase = g4Var.x;
        if (videoPlayerHolderBase != null) {
            videoPlayerHolderBase.release(null);
            g4Var.x = null;
        }
        g4Var.y = null;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f10;
        g4 g4Var = this.H;
        Paint paint = g4Var.x0;
        if (g4Var.K == null) {
            int measuredWidth = getMeasuredWidth();
            float f11 = measuredWidth;
            float measuredHeight = getMeasuredHeight();
            canvas.drawRect(this.w, 0.0f, f11, measuredHeight, g4Var.l0);
            WindowInsets windowInsets = g4Var.T;
            if (windowInsets != null) {
                canvas.drawRect(this.w, 0.0f, f11, windowInsets.getSystemWindowInsetTop(), paint);
                if (g4Var.U) {
                    int systemWindowInsetLeft = windowInsets.getSystemWindowInsetLeft();
                    if (systemWindowInsetLeft != 0) {
                        canvas.drawRect(0.0f, 0.0f, systemWindowInsetLeft, measuredHeight, paint);
                    }
                    if (windowInsets.getSystemWindowInsetRight() != 0) {
                        f10 = f11;
                        canvas.drawRect(measuredWidth - r2, 0.0f, f10, measuredHeight, paint);
                        canvas.drawRect(0.0f, r9 - windowInsets.getStableInsetBottom(), f10, measuredHeight, g4Var.y0);
                    }
                }
                f10 = f11;
                canvas.drawRect(0.0f, r9 - windowInsets.getStableInsetBottom(), f10, measuredHeight, g4Var.y0);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        HashSet hashSet = g4.c1;
        this.H.getClass();
        return a(motionEvent) || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        int i13;
        int i14 = i11 - i7;
        g4 g4Var = this.H;
        int i15 = 0;
        if (g4Var.O0 != i14) {
            int i16 = 0;
            while (true) {
                k3[] k3VarArr = g4Var.u0;
                if (i16 >= k3VarArr.length) {
                    break;
                }
                Iterator it = k3VarArr[i16].c.n.entrySet().iterator();
                while (it.hasNext()) {
                    ((Map.Entry) it.next()).setValue(-1);
                }
                i16++;
            }
            g4Var.O0 = i14;
        }
        WindowInsets windowInsets = g4Var.T;
        if (windowInsets != null) {
            int systemWindowInsetLeft = windowInsets.getSystemWindowInsetLeft();
            if (windowInsets.getSystemWindowInsetRight() != 0) {
                this.y = i14 - this.D;
                this.E = 0;
            } else if (windowInsets.getSystemWindowInsetLeft() != 0) {
                this.y = 0;
                this.E = 0;
            } else {
                this.y = 0;
                this.E = (i12 - i10) - this.F;
            }
            i13 = windowInsets.getSystemWindowInsetTop();
            i15 = systemWindowInsetLeft;
        } else {
            i13 = 0;
        }
        k0 k0Var = g4Var.g0;
        k0Var.layout(i15, i13, k0Var.getMeasuredWidth() + i15, g4Var.g0.getMeasuredHeight() + i13);
        FrameLayout frameLayout = g4Var.P;
        frameLayout.layout(i15, i13, frameLayout.getMeasuredWidth() + i15, g4Var.P.getMeasuredHeight() + i13);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i10);
        g4 g4Var = this.H;
        if (g4Var.T != null) {
            setMeasuredDimension(size, size2);
            WindowInsets windowInsets = g4Var.T;
            if (org.telegram.messenger.g0.y) {
                int i11 = org.telegram.messenger.g0.q.y;
                if (size2 > i11) {
                    size2 = i11;
                }
                size2 += org.telegram.messenger.g0.m;
            }
            int systemWindowInsetBottom = size2 - windowInsets.getSystemWindowInsetBottom();
            size -= windowInsets.getSystemWindowInsetLeft() + windowInsets.getSystemWindowInsetRight();
            if (windowInsets.getSystemWindowInsetRight() != 0) {
                this.D = windowInsets.getSystemWindowInsetRight();
                this.F = systemWindowInsetBottom;
            } else if (windowInsets.getSystemWindowInsetLeft() != 0) {
                this.D = windowInsets.getSystemWindowInsetLeft();
                this.F = systemWindowInsetBottom;
            } else {
                this.D = size;
                this.F = windowInsets.getStableInsetBottom();
            }
            size2 = systemWindowInsetBottom - windowInsets.getSystemWindowInsetTop();
        } else {
            setMeasuredDimension(size, size2);
        }
        if (g4Var.K == null) {
            g4Var.o0 = size2 < org.telegram.messenger.g0.q.y - org.telegram.messenger.g0.L(100.0f);
        }
        g4Var.g0.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
        g4Var.P.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        HashSet hashSet = g4.c1;
        this.H.getClass();
        return a(motionEvent) || super.onTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z9) {
        a(null);
        super.requestDisallowInterceptTouchEvent(z9);
    }

    @Override // android.view.View
    public void setAlpha(float f10) {
        g4 g4Var = this.H;
        int i7 = (int) (255.0f * f10);
        g4Var.l0.setAlpha(i7);
        g4Var.x0.setAlpha(i7);
        this.x = f10;
        bg.v0 v0Var = g4Var.V0;
        if (v0Var != null) {
            v0Var.c(g4Var.V && f10 == 1.0f && this.w == 0.0f);
        }
        invalidate();
    }

    public void setInnerTranslationX(float f10) {
        this.w = f10;
        g4 g4Var = this.H;
        bg.v0 v0Var = g4Var.V0;
        if (v0Var != null) {
            v0Var.c(g4Var.V && this.x == 1.0f && f10 == 0.0f);
        }
        invalidate();
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final void updateColors() {
        fi.v vVar;
        org.telegram.ui.ActionBar.z2 z2Var;
        org.telegram.ui.ActionBar.y2 y2Var;
        Paint paint;
        k3 k3Var;
        k3 k3Var2;
        int i7;
        b3 b3Var;
        g4 g4Var = this.H;
        t3 t3Var = g4Var.K;
        try {
            int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Dl, false);
            if (g4Var.u0 != null) {
                int i10 = 0;
                while (true) {
                    k3[] k3VarArr = g4Var.u0;
                    if (i10 >= k3VarArr.length) {
                        break;
                    }
                    k3 k3Var3 = k3VarArr[i10];
                    if (k3Var3 != null && (i7 = k3Var3.D) != x02) {
                        if (k3Var3.x == i7) {
                            k3Var3.x = x02;
                        }
                        if (k3Var3.y == i7) {
                            k3Var3.y = x02;
                        }
                        k3Var3.D = x02;
                        if (k3Var3.n && (b3Var = k3Var3.r) != null) {
                            b3Var.b(org.telegram.messenger.g0.B(x02) <= 0.721f, false);
                        }
                    }
                    i10++;
                }
            }
            l0 l0Var = g4Var.h0;
            if (l0Var != null) {
                k3[] k3VarArr2 = g4Var.u0;
                l0Var.setMenuColors((k3VarArr2 == null || (k3Var2 = k3VarArr2[0]) == null || !org.telegram.messenger.iz.v0) ? x02 : k3Var2.getBackgroundColor());
                l0 l0Var2 = g4Var.h0;
                k3[] k3VarArr3 = g4Var.u0;
                l0Var2.d((k3VarArr3 == null || (k3Var = k3VarArr3[0]) == null || !org.telegram.messenger.iz.v0) ? x02 : k3Var.getActionBarColor(), false);
            }
            Paint paint2 = g4Var.l0;
            if (paint2 != null) {
                paint2.setColor(x02);
            }
            if (g4Var.z0 && (paint = g4Var.y0) != null) {
                paint.setColor(t3Var == null ? org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.a7, true) : org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.a7, false));
            }
            if (t3Var != null && (z2Var = t3Var.e) != null && (y2Var = z2Var.b) != null) {
                org.telegram.messenger.g0.r3(y2Var, t3Var.f());
            }
            if (g4Var.l0 != null && g4.r1 != null) {
                g4.e0(g4Var);
            }
            if (g4Var.u0 != null) {
                int i11 = 0;
                while (true) {
                    k3[] k3VarArr4 = g4Var.u0;
                    if (i11 >= k3VarArr4.length) {
                        break;
                    }
                    k3 k3Var4 = k3VarArr4[i11];
                    if (k3Var4 != null && (vVar = k3Var4.b) != null) {
                        for (int i12 = 0; i12 < vVar.getChildCount(); i12++) {
                            View childAt = vVar.getChildAt(i12);
                            if ((childAt instanceof s2) && ((s2) childAt).e != null) {
                                ((s2) childAt).e.invalidate();
                            }
                            childAt.invalidate();
                        }
                    }
                    i11++;
                }
            }
            ArticleViewer$WindowView articleViewer$WindowView = g4Var.f0;
            if (articleViewer$WindowView != null) {
                articleViewer$WindowView.invalidate();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
