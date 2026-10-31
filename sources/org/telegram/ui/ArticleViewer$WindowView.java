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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
class ArticleViewer$WindowView extends FrameLayout implements org.telegram.ui.ActionBar.k6 {
    public int D;
    public int E;
    public int F;
    public boolean G;
    public final /* synthetic */ h4 H;
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
    public ArticleViewer$WindowView(h4 h4Var, Activity activity) {
        super(activity);
        this.H = h4Var;
        this.a = new Paint();
        this.x = 1.0f;
    }

    public final boolean a(MotionEvent motionEvent) {
        l3 l3Var;
        h4 h4Var = this.H;
        u3 u3Var = h4Var.K;
        if (h4Var.v0 == null && !h4Var.U0 && h4Var.P.getVisibility() != 0 && !h4Var.P0.x()) {
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
                l3 l3Var2 = h4Var.u0[0];
                this.G = l3Var2 == null || !l3Var2.f() || (h4Var.u0[0].e.b(true) && !h4Var.u0[0].e.c);
                if ((u3Var == null || !u3Var.H) && this.c && !this.d && max >= org.telegram.messenger.i0.a1(true, 0.4f) && Math.abs(max) / 3 > abs && this.G) {
                    b(motionEvent);
                } else if (this.d) {
                    h4Var.d = null;
                    h4Var.f = null;
                    if (this.e && (l3Var = h4Var.u0[0]) != null) {
                        l3Var.setTranslationX(max);
                    } else if (u3Var != null) {
                        u3Var.I = max / getWidth();
                        u3Var.c.invalidate();
                        u3Var.u();
                        u3Var.r();
                    } else {
                        l0 l0Var = h4Var.g0;
                        float f7 = max;
                        l0Var.setTranslationX(f7);
                        setInnerTranslationX(f7);
                    }
                }
            } else if (motionEvent != null && motionEvent.getPointerId(0) == this.b && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6)) {
                if (this.s == null) {
                    this.s = VelocityTracker.obtain();
                }
                this.s.computeCurrentVelocity(1000);
                float xVelocity = this.s.getXVelocity();
                float yVelocity = this.s.getYVelocity();
                if ((u3Var == null || !u3Var.H) && !this.d && xVelocity >= 3500.0f && xVelocity > Math.abs(yVelocity)) {
                    b(motionEvent);
                }
                if (this.d) {
                    boolean z10 = this.e;
                    View view = z10 ? h4Var.u0[0] : h4Var.g0;
                    float x10 = (z10 || u3Var == null) ? view.getX() : u3Var.I * u3Var.c.getWidth();
                    boolean z11 = (x10 < ((float) view.getMeasuredWidth()) * 0.3f && (xVelocity < 2500.0f || xVelocity < yVelocity)) || !this.G;
                    AnimatorSet animatorSet = new AnimatorSet();
                    Property property = View.TRANSLATION_X;
                    if (!z11) {
                        x10 = view.getMeasuredWidth() - x10;
                        if (this.e) {
                            animatorSet.playTogether(ObjectAnimator.ofFloat(h4Var.u0[0], (Property<l3, Float>) property, view.getMeasuredWidth()));
                        } else if (u3Var != null) {
                            animatorSet.playTogether(u3Var.l(1.0f));
                        } else {
                            animatorSet.playTogether(ObjectAnimator.ofFloat(h4Var.g0, (Property<l0, Float>) property, view.getMeasuredWidth()), ObjectAnimator.ofFloat(this, h4.e1, view.getMeasuredWidth()));
                        }
                    } else if (this.e) {
                        animatorSet.playTogether(ObjectAnimator.ofFloat(h4Var.u0[0], (Property<l3, Float>) property, 0.0f));
                    } else if (u3Var != null) {
                        animatorSet.playTogether(u3Var.l(0.0f));
                    } else {
                        animatorSet.playTogether(ObjectAnimator.ofFloat(h4Var.g0, (Property<l0, Float>) property, 0.0f), ObjectAnimator.ofFloat(this, h4.e1, 0.0f));
                    }
                    animatorSet.setDuration(Math.max((int) ((420.0f / view.getMeasuredWidth()) * x10), org.telegram.messenger.zs.Z3));
                    animatorSet.setInterpolator(org.telegram.ui.Components.gr.h);
                    animatorSet.addListener(new g4(this, z11));
                    animatorSet.start();
                    h4Var.U0 = true;
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
                org.telegram.ui.Cells.k9 k9Var = h4Var.P0;
                if (k9Var != null && !k9Var.x()) {
                    h4Var.P0.f(false);
                }
            }
            if (this.d && this.G) {
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Dl));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.d6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.J6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.K6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.k6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.M6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Id));
    }

    public final void b(MotionEvent motionEvent) {
        m0 m0Var;
        this.c = false;
        this.d = true;
        this.n = (int) motionEvent.getX();
        h4 h4Var = this.H;
        ArrayList arrayList = h4Var.d0;
        if (arrayList.size() <= 1 || ((m0Var = h4Var.h0) != null && (m0Var.T || m0Var.W))) {
            this.e = false;
        } else {
            this.e = true;
            this.h = h4Var.J0;
            h4Var.u0[1].setVisibility(0);
            h4Var.u0[1].setAlpha(1.0f);
            h4Var.u0[1].setTranslationX(0.0f);
            h4Var.u0[0].setBackgroundColor(h4Var.K == null ? 0 : h4Var.l0.getColor());
            h4Var.c0(-1, arrayList.get(arrayList.size() - 2), true);
            if (h4Var.g0.indexOfChild(h4Var.u0[0]) < h4Var.g0.indexOfChild(h4Var.u0[1])) {
                int indexOfChild = h4Var.g0.indexOfChild(h4Var.u0[0]);
                h4Var.g0.removeView(h4Var.u0[1]);
                h4Var.g0.addView(h4Var.u0[1], indexOfChild);
            }
        }
        h4Var.i();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        ArticleViewer$WindowView articleViewer$WindowView;
        Activity activity;
        DisplayCutout displayCutout;
        List<Rect> boundingRects;
        h4 h4Var = this.H;
        if (h4Var.K != null) {
            return super.dispatchApplyWindowInsets(windowInsets);
        }
        WindowInsets windowInsets2 = h4Var.T;
        h4Var.T = windowInsets;
        if ((windowInsets2 == null || !windowInsets2.toString().equals(windowInsets.toString())) && (articleViewer$WindowView = h4Var.f0) != null) {
            articleViewer$WindowView.requestLayout();
        }
        if (Build.VERSION.SDK_INT >= 28 && (activity = h4Var.L) != null && (displayCutout = activity.getWindow().getDecorView().getRootWindowInsets().getDisplayCutout()) != null && (boundingRects = displayCutout.getBoundingRects()) != null && !boundingRects.isEmpty()) {
            h4Var.U = boundingRects.get(0).height() != 0;
        }
        return super.dispatchApplyWindowInsets(windowInsets);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        super.dispatchDraw(canvas);
        h4 h4Var = this.H;
        if (h4Var.T != null || this.D == 0 || this.F == 0) {
            return;
        }
        int alpha = (int) (h4Var.f0.getAlpha() * 255.0f);
        Paint paint = this.a;
        paint.setAlpha(alpha);
        int i11 = this.y;
        if (i11 == 0 && (i10 = this.E) == 0) {
            canvas.drawRect(i11, i10, i11 + this.D, i10 + this.F, paint);
        } else {
            canvas.drawRect(i11 - getTranslationX(), this.E, (this.y + this.D) - getTranslationX(), this.E + this.F, paint);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        if (keyEvent == null || keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 1) {
            return super.dispatchKeyEventPreIme(keyEvent);
        }
        h4 h4Var = this.H;
        if (h4Var.h0.V.isFocused()) {
            h4Var.h0.V.clearFocus();
            org.telegram.messenger.i0.v1(h4Var.h0.V);
            return true;
        }
        if (h4Var.h0.b0.isFocused()) {
            h4Var.h0.b0.clearFocus();
            org.telegram.messenger.i0.v1(h4Var.h0.b0);
            return true;
        }
        if (h4Var.o0) {
            org.telegram.messenger.i0.v1(this);
            return true;
        }
        l3 l3Var = h4Var.u0[0];
        if (l3Var == null || !l3Var.f() || h4Var.u0[0].getWebView() == null || !h4Var.u0[0].getWebView().canGoBack()) {
            h4Var.m(true, false);
            return true;
        }
        h4Var.u0[0].getWebView().goBack();
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        l3 l3Var;
        ArrayList arrayList;
        h4 h4Var = this.H;
        if (h4Var.R0.n) {
            motionEvent.offsetLocation(-h4Var.g0.getX(), -h4Var.g0.getY());
            return h4Var.R0.g(motionEvent);
        }
        org.telegram.ui.Cells.v9 n10 = h4Var.P0.n(getContext());
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.offsetLocation(-h4Var.g0.getX(), -h4Var.g0.getY());
        if (!h4Var.P0.x() || !h4Var.P0.n(getContext()).onTouchEvent(obtain)) {
            if (n10.b(motionEvent)) {
                l3[] l3VarArr = h4Var.u0;
                if (l3VarArr == null || (l3Var = l3VarArr[0]) == null || !l3Var.f() || (arrayList = h4Var.d0) == null || arrayList.size() > 1) {
                    motionEvent.setAction(3);
                } else {
                    motionEvent.setAction(1);
                }
            }
            if (motionEvent.getAction() != 0 || !h4Var.P0.x() || (motionEvent.getY() >= h4Var.g0.getTop() && motionEvent.getY() <= h4Var.g0.getBottom())) {
                return super.dispatchTouchEvent(motionEvent);
            }
            if (h4Var.P0.n(getContext()).onTouchEvent(obtain)) {
                return super.dispatchTouchEvent(motionEvent);
            }
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        int measuredWidth = getMeasuredWidth();
        int i10 = (int) this.w;
        int save = canvas.save();
        canvas.clipRect(i10, 0, measuredWidth, getHeight());
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restoreToCount(save);
        if (i10 != 0) {
            h4 h4Var = this.H;
            if (view == h4Var.g0) {
                float f7 = measuredWidth - i10;
                float min = Math.min(0.8f, f7 / measuredWidth);
                if (min < 0.0f) {
                    min = 0.0f;
                }
                h4Var.n0.setColor(((int) (min * 153.0f)) << 24);
                canvas.drawRect(0.0f, 0.0f, i10, getHeight(), h4Var.n0);
                float max = Math.max(0.0f, Math.min(f7 / org.telegram.messenger.i0.L(20.0f), 1.0f));
                Drawable drawable = h4Var.m0;
                drawable.setBounds(i10 - drawable.getIntrinsicWidth(), view.getTop(), i10, view.getBottom());
                h4Var.m0.setAlpha((int) (max * 255.0f));
                h4Var.m0.draw(canvas);
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
        h4 h4Var = this.H;
        h4Var.W = false;
        VideoPlayerHolderBase videoPlayerHolderBase = h4Var.x;
        if (videoPlayerHolderBase != null) {
            videoPlayerHolderBase.release(null);
            h4Var.x = null;
        }
        h4Var.y = null;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f7;
        h4 h4Var = this.H;
        Paint paint = h4Var.x0;
        if (h4Var.K == null) {
            int measuredWidth = getMeasuredWidth();
            float f10 = measuredWidth;
            float measuredHeight = getMeasuredHeight();
            canvas.drawRect(this.w, 0.0f, f10, measuredHeight, h4Var.l0);
            WindowInsets windowInsets = h4Var.T;
            if (windowInsets != null) {
                canvas.drawRect(this.w, 0.0f, f10, windowInsets.getSystemWindowInsetTop(), paint);
                if (h4Var.U) {
                    int systemWindowInsetLeft = windowInsets.getSystemWindowInsetLeft();
                    if (systemWindowInsetLeft != 0) {
                        canvas.drawRect(0.0f, 0.0f, systemWindowInsetLeft, measuredHeight, paint);
                    }
                    if (windowInsets.getSystemWindowInsetRight() != 0) {
                        f7 = f10;
                        canvas.drawRect(measuredWidth - r2, 0.0f, f7, measuredHeight, paint);
                        canvas.drawRect(0.0f, r9 - windowInsets.getStableInsetBottom(), f7, measuredHeight, h4Var.y0);
                    }
                }
                f7 = f10;
                canvas.drawRect(0.0f, r9 - windowInsets.getStableInsetBottom(), f7, measuredHeight, h4Var.y0);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        HashSet hashSet = h4.c1;
        this.H.getClass();
        return a(motionEvent) || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        int i15 = i12 - i10;
        h4 h4Var = this.H;
        int i16 = 0;
        if (h4Var.O0 != i15) {
            int i17 = 0;
            while (true) {
                l3[] l3VarArr = h4Var.u0;
                if (i17 >= l3VarArr.length) {
                    break;
                }
                Iterator it = l3VarArr[i17].c.n.entrySet().iterator();
                while (it.hasNext()) {
                    ((Map.Entry) it.next()).setValue(-1);
                }
                i17++;
            }
            h4Var.O0 = i15;
        }
        WindowInsets windowInsets = h4Var.T;
        if (windowInsets != null) {
            int systemWindowInsetLeft = windowInsets.getSystemWindowInsetLeft();
            if (windowInsets.getSystemWindowInsetRight() != 0) {
                this.y = i15 - this.D;
                this.E = 0;
            } else if (windowInsets.getSystemWindowInsetLeft() != 0) {
                this.y = 0;
                this.E = 0;
            } else {
                this.y = 0;
                this.E = (i13 - i11) - this.F;
            }
            i14 = windowInsets.getSystemWindowInsetTop();
            i16 = systemWindowInsetLeft;
        } else {
            i14 = 0;
        }
        l0 l0Var = h4Var.g0;
        l0Var.layout(i16, i14, l0Var.getMeasuredWidth() + i16, h4Var.g0.getMeasuredHeight() + i14);
        FrameLayout frameLayout = h4Var.P;
        frameLayout.layout(i16, i14, frameLayout.getMeasuredWidth() + i16, h4Var.P.getMeasuredHeight() + i14);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        h4 h4Var = this.H;
        if (h4Var.T != null) {
            setMeasuredDimension(size, size2);
            WindowInsets windowInsets = h4Var.T;
            if (org.telegram.messenger.i0.y) {
                int i12 = org.telegram.messenger.i0.q.y;
                if (size2 > i12) {
                    size2 = i12;
                }
                size2 += org.telegram.messenger.i0.m;
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
        if (h4Var.K == null) {
            h4Var.o0 = size2 < org.telegram.messenger.i0.q.y - org.telegram.messenger.i0.L(100.0f);
        }
        h4Var.g0.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
        h4Var.P.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        HashSet hashSet = h4.c1;
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
        h4 h4Var = this.H;
        int i10 = (int) (255.0f * f7);
        h4Var.l0.setAlpha(i10);
        h4Var.x0.setAlpha(i10);
        this.x = f7;
        aa0 aa0Var = h4Var.V0;
        if (aa0Var != null) {
            aa0Var.c(h4Var.V && f7 == 1.0f && this.w == 0.0f);
        }
        invalidate();
    }

    public void setInnerTranslationX(float f7) {
        this.w = f7;
        h4 h4Var = this.H;
        aa0 aa0Var = h4Var.V0;
        if (aa0Var != null) {
            aa0Var.c(h4Var.V && this.x == 1.0f && f7 == 0.0f);
        }
        invalidate();
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        g3 g3Var;
        org.telegram.ui.ActionBar.d3 d3Var;
        org.telegram.ui.ActionBar.c3 c3Var;
        Paint paint;
        l3 l3Var;
        l3 l3Var2;
        int i10;
        b3 b3Var;
        h4 h4Var = this.H;
        u3 u3Var = h4Var.K;
        try {
            int x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Dl, false);
            if (h4Var.u0 != null) {
                int i11 = 0;
                while (true) {
                    l3[] l3VarArr = h4Var.u0;
                    if (i11 >= l3VarArr.length) {
                        break;
                    }
                    l3 l3Var3 = l3VarArr[i11];
                    if (l3Var3 != null && (i10 = l3Var3.D) != x02) {
                        if (l3Var3.x == i10) {
                            l3Var3.x = x02;
                        }
                        if (l3Var3.y == i10) {
                            l3Var3.y = x02;
                        }
                        l3Var3.D = x02;
                        if (l3Var3.n && (b3Var = l3Var3.r) != null) {
                            b3Var.b(org.telegram.messenger.i0.B(x02) <= 0.721f, false);
                        }
                    }
                    i11++;
                }
            }
            m0 m0Var = h4Var.h0;
            if (m0Var != null) {
                l3[] l3VarArr2 = h4Var.u0;
                m0Var.setMenuColors((l3VarArr2 == null || (l3Var2 = l3VarArr2[0]) == null || !org.telegram.messenger.tz.v0) ? x02 : l3Var2.getBackgroundColor());
                m0 m0Var2 = h4Var.h0;
                l3[] l3VarArr3 = h4Var.u0;
                m0Var2.d((l3VarArr3 == null || (l3Var = l3VarArr3[0]) == null || !org.telegram.messenger.tz.v0) ? x02 : l3Var.getActionBarColor(), false);
            }
            Paint paint2 = h4Var.l0;
            if (paint2 != null) {
                paint2.setColor(x02);
            }
            if (h4Var.z0 && (paint = h4Var.y0) != null) {
                paint.setColor(u3Var == null ? org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.a7, true) : org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.a7, false));
            }
            if (u3Var != null && (d3Var = u3Var.e) != null && (c3Var = d3Var.b) != null) {
                org.telegram.messenger.i0.q3(c3Var, u3Var.f());
            }
            if (h4Var.l0 != null && h4.r1 != null) {
                h4.e0(h4Var);
            }
            if (h4Var.u0 != null) {
                int i12 = 0;
                while (true) {
                    l3[] l3VarArr4 = h4Var.u0;
                    if (i12 >= l3VarArr4.length) {
                        break;
                    }
                    l3 l3Var4 = l3VarArr4[i12];
                    if (l3Var4 != null && (g3Var = l3Var4.b) != null) {
                        for (int i13 = 0; i13 < g3Var.getChildCount(); i13++) {
                            View childAt = g3Var.getChildAt(i13);
                            if ((childAt instanceof s2) && ((s2) childAt).e != null) {
                                ((s2) childAt).e.invalidate();
                            }
                            childAt.invalidate();
                        }
                    }
                    i12++;
                }
            }
            ArticleViewer$WindowView articleViewer$WindowView = h4Var.f0;
            if (articleViewer$WindowView != null) {
                articleViewer$WindowView.invalidate();
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }
}
