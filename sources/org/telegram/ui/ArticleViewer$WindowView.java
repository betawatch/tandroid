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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
class ArticleViewer$WindowView extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public int E;
    public int F;
    public int G;
    public boolean H;
    public final /* synthetic */ i4 I;
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
    public ArticleViewer$WindowView(i4 i4Var, Activity activity) {
        super(activity);
        this.I = i4Var;
        this.a = new Paint();
        this.x = 1.0f;
    }

    public final boolean a(MotionEvent motionEvent) {
        l3 l3Var;
        i4 i4Var = this.I;
        u3 u3Var = i4Var.L;
        if (i4Var.w0 == null && !i4Var.V0 && i4Var.Q.getVisibility() != 0 && !i4Var.Q0.x()) {
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
                l3 l3Var2 = i4Var.v0[0];
                this.H = l3Var2 == null || !l3Var2.f() || (i4Var.v0[0].e.b(true) && !i4Var.v0[0].e.c);
                if ((u3Var == null || !u3Var.I) && this.c && !this.d && max >= org.telegram.messenger.g0.a1(true, 0.4f) && Math.abs(max) / 3 > abs && this.H) {
                    b(motionEvent);
                } else if (this.d) {
                    i4Var.d = null;
                    i4Var.f = null;
                    if (this.e && (l3Var = i4Var.v0[0]) != null) {
                        l3Var.setTranslationX(max);
                    } else if (u3Var != null) {
                        u3Var.J = max / getWidth();
                        u3Var.c.invalidate();
                        u3Var.u();
                        u3Var.r();
                    } else {
                        l0 l0Var = i4Var.h0;
                        float f10 = max;
                        l0Var.setTranslationX(f10);
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
                if ((u3Var == null || !u3Var.I) && !this.d && xVelocity >= 3500.0f && xVelocity > Math.abs(yVelocity)) {
                    b(motionEvent);
                }
                if (this.d) {
                    boolean z10 = this.e;
                    View view = z10 ? i4Var.v0[0] : i4Var.h0;
                    float x10 = (z10 || u3Var == null) ? view.getX() : u3Var.J * u3Var.c.getWidth();
                    boolean z11 = (x10 < ((float) view.getMeasuredWidth()) * 0.3f && (xVelocity < 2500.0f || xVelocity < yVelocity)) || !this.H;
                    AnimatorSet animatorSet = new AnimatorSet();
                    Property property = View.TRANSLATION_X;
                    if (!z11) {
                        x10 = view.getMeasuredWidth() - x10;
                        if (this.e) {
                            animatorSet.playTogether(ObjectAnimator.ofFloat(i4Var.v0[0], (Property<l3, Float>) property, view.getMeasuredWidth()));
                        } else if (u3Var != null) {
                            animatorSet.playTogether(u3Var.l(1.0f));
                        } else {
                            animatorSet.playTogether(ObjectAnimator.ofFloat(i4Var.h0, (Property<l0, Float>) property, view.getMeasuredWidth()), ObjectAnimator.ofFloat(this, i4.f1, view.getMeasuredWidth()));
                        }
                    } else if (this.e) {
                        animatorSet.playTogether(ObjectAnimator.ofFloat(i4Var.v0[0], (Property<l3, Float>) property, 0.0f));
                    } else if (u3Var != null) {
                        animatorSet.playTogether(u3Var.l(0.0f));
                    } else {
                        animatorSet.playTogether(ObjectAnimator.ofFloat(i4Var.h0, (Property<l0, Float>) property, 0.0f), ObjectAnimator.ofFloat(this, i4.f1, 0.0f));
                    }
                    animatorSet.setDuration(Math.max((int) ((420.0f / view.getMeasuredWidth()) * x10), org.telegram.messenger.hs.Z3));
                    animatorSet.setInterpolator(org.telegram.ui.Components.xq.h);
                    animatorSet.addListener(new h4(this, z11));
                    animatorSet.start();
                    i4Var.V0 = true;
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
                org.telegram.ui.Cells.h9 h9Var = i4Var.Q0;
                if (h9Var != null && !h9Var.x()) {
                    i4Var.Q0.f(false);
                }
            }
            if (this.d && this.H) {
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.z5
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
        m0 m0Var;
        this.c = false;
        this.d = true;
        this.n = (int) motionEvent.getX();
        i4 i4Var = this.I;
        ArrayList arrayList = i4Var.e0;
        if (arrayList.size() <= 1 || ((m0Var = i4Var.i0) != null && (m0Var.U || m0Var.a0))) {
            this.e = false;
        } else {
            this.e = true;
            this.h = i4Var.K0;
            i4Var.v0[1].setVisibility(0);
            i4Var.v0[1].setAlpha(1.0f);
            i4Var.v0[1].setTranslationX(0.0f);
            i4Var.v0[0].setBackgroundColor(i4Var.L == null ? 0 : i4Var.m0.getColor());
            i4Var.c0(-1, arrayList.get(arrayList.size() - 2), true);
            if (i4Var.h0.indexOfChild(i4Var.v0[0]) < i4Var.h0.indexOfChild(i4Var.v0[1])) {
                int indexOfChild = i4Var.h0.indexOfChild(i4Var.v0[0]);
                i4Var.h0.removeView(i4Var.v0[1]);
                i4Var.h0.addView(i4Var.v0[1], indexOfChild);
            }
        }
        i4Var.i();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        ArticleViewer$WindowView articleViewer$WindowView;
        Activity activity;
        DisplayCutout displayCutout;
        List<Rect> boundingRects;
        i4 i4Var = this.I;
        if (i4Var.L != null) {
            return super.dispatchApplyWindowInsets(windowInsets);
        }
        WindowInsets windowInsets2 = i4Var.U;
        i4Var.U = windowInsets;
        if ((windowInsets2 == null || !windowInsets2.toString().equals(windowInsets.toString())) && (articleViewer$WindowView = i4Var.g0) != null) {
            articleViewer$WindowView.requestLayout();
        }
        if (Build.VERSION.SDK_INT >= 28 && (activity = i4Var.M) != null && (displayCutout = activity.getWindow().getDecorView().getRootWindowInsets().getDisplayCutout()) != null && (boundingRects = displayCutout.getBoundingRects()) != null && !boundingRects.isEmpty()) {
            i4Var.V = boundingRects.get(0).height() != 0;
        }
        return super.dispatchApplyWindowInsets(windowInsets);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int i3;
        super.dispatchDraw(canvas);
        i4 i4Var = this.I;
        if (i4Var.U != null || this.E == 0 || this.G == 0) {
            return;
        }
        int alpha = (int) (i4Var.g0.getAlpha() * 255.0f);
        Paint paint = this.a;
        paint.setAlpha(alpha);
        int i10 = this.y;
        if (i10 == 0 && (i3 = this.F) == 0) {
            canvas.drawRect(i10, i3, i10 + this.E, i3 + this.G, paint);
        } else {
            canvas.drawRect(i10 - getTranslationX(), this.F, (this.y + this.E) - getTranslationX(), this.F + this.G, paint);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        if (keyEvent == null || keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 1) {
            return super.dispatchKeyEventPreIme(keyEvent);
        }
        i4 i4Var = this.I;
        if (i4Var.i0.W.isFocused()) {
            i4Var.i0.W.clearFocus();
            org.telegram.messenger.g0.v1(i4Var.i0.W);
            return true;
        }
        if (i4Var.i0.c0.isFocused()) {
            i4Var.i0.c0.clearFocus();
            org.telegram.messenger.g0.v1(i4Var.i0.c0);
            return true;
        }
        if (i4Var.p0) {
            org.telegram.messenger.g0.v1(this);
            return true;
        }
        l3 l3Var = i4Var.v0[0];
        if (l3Var == null || !l3Var.f() || i4Var.v0[0].getWebView() == null || !i4Var.v0[0].getWebView().canGoBack()) {
            i4Var.m(true, false);
            return true;
        }
        i4Var.v0[0].getWebView().goBack();
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        l3 l3Var;
        ArrayList arrayList;
        i4 i4Var = this.I;
        if (i4Var.S0.n) {
            motionEvent.offsetLocation(-i4Var.h0.getX(), -i4Var.h0.getY());
            return i4Var.S0.g(motionEvent);
        }
        org.telegram.ui.Cells.t9 n4 = i4Var.Q0.n(getContext());
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.offsetLocation(-i4Var.h0.getX(), -i4Var.h0.getY());
        if (!i4Var.Q0.x() || !i4Var.Q0.n(getContext()).onTouchEvent(obtain)) {
            if (n4.b(motionEvent)) {
                l3[] l3VarArr = i4Var.v0;
                if (l3VarArr == null || (l3Var = l3VarArr[0]) == null || !l3Var.f() || (arrayList = i4Var.e0) == null || arrayList.size() > 1) {
                    motionEvent.setAction(3);
                } else {
                    motionEvent.setAction(1);
                }
            }
            if (motionEvent.getAction() != 0 || !i4Var.Q0.x() || (motionEvent.getY() >= i4Var.h0.getTop() && motionEvent.getY() <= i4Var.h0.getBottom())) {
                return super.dispatchTouchEvent(motionEvent);
            }
            if (i4Var.Q0.n(getContext()).onTouchEvent(obtain)) {
                return super.dispatchTouchEvent(motionEvent);
            }
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        int measuredWidth = getMeasuredWidth();
        int i3 = (int) this.w;
        int save = canvas.save();
        canvas.clipRect(i3, 0, measuredWidth, getHeight());
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restoreToCount(save);
        if (i3 != 0) {
            i4 i4Var = this.I;
            if (view == i4Var.h0) {
                float f10 = measuredWidth - i3;
                float min = Math.min(0.8f, f10 / measuredWidth);
                if (min < 0.0f) {
                    min = 0.0f;
                }
                i4Var.o0.setColor(((int) (min * 153.0f)) << 24);
                canvas.drawRect(0.0f, 0.0f, i3, getHeight(), i4Var.o0);
                float max = Math.max(0.0f, Math.min(f10 / org.telegram.messenger.g0.L(20.0f), 1.0f));
                Drawable drawable = i4Var.n0;
                drawable.setBounds(i3 - drawable.getIntrinsicWidth(), view.getTop(), i3, view.getBottom());
                i4Var.n0.setAlpha((int) (max * 255.0f));
                i4Var.n0.draw(canvas);
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
        this.I.X = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        i4 i4Var = this.I;
        i4Var.X = false;
        VideoPlayerHolderBase videoPlayerHolderBase = i4Var.x;
        if (videoPlayerHolderBase != null) {
            videoPlayerHolderBase.release(null);
            i4Var.x = null;
        }
        i4Var.y = null;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f10;
        i4 i4Var = this.I;
        Paint paint = i4Var.y0;
        if (i4Var.L == null) {
            int measuredWidth = getMeasuredWidth();
            float f11 = measuredWidth;
            float measuredHeight = getMeasuredHeight();
            canvas.drawRect(this.w, 0.0f, f11, measuredHeight, i4Var.m0);
            WindowInsets windowInsets = i4Var.U;
            if (windowInsets != null) {
                canvas.drawRect(this.w, 0.0f, f11, windowInsets.getSystemWindowInsetTop(), paint);
                if (i4Var.V) {
                    int systemWindowInsetLeft = windowInsets.getSystemWindowInsetLeft();
                    if (systemWindowInsetLeft != 0) {
                        canvas.drawRect(0.0f, 0.0f, systemWindowInsetLeft, measuredHeight, paint);
                    }
                    if (windowInsets.getSystemWindowInsetRight() != 0) {
                        f10 = f11;
                        canvas.drawRect(measuredWidth - r2, 0.0f, f10, measuredHeight, paint);
                        canvas.drawRect(0.0f, r9 - windowInsets.getStableInsetBottom(), f10, measuredHeight, i4Var.z0);
                    }
                }
                f10 = f11;
                canvas.drawRect(0.0f, r9 - windowInsets.getStableInsetBottom(), f10, measuredHeight, i4Var.z0);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        HashSet hashSet = i4.d1;
        this.I.getClass();
        return a(motionEvent) || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        int i13;
        int i14 = i11 - i3;
        i4 i4Var = this.I;
        int i15 = 0;
        if (i4Var.P0 != i14) {
            int i16 = 0;
            while (true) {
                l3[] l3VarArr = i4Var.v0;
                if (i16 >= l3VarArr.length) {
                    break;
                }
                Iterator it = l3VarArr[i16].c.n.entrySet().iterator();
                while (it.hasNext()) {
                    ((Map.Entry) it.next()).setValue(-1);
                }
                i16++;
            }
            i4Var.P0 = i14;
        }
        WindowInsets windowInsets = i4Var.U;
        if (windowInsets != null) {
            int systemWindowInsetLeft = windowInsets.getSystemWindowInsetLeft();
            if (windowInsets.getSystemWindowInsetRight() != 0) {
                this.y = i14 - this.E;
                this.F = 0;
            } else if (windowInsets.getSystemWindowInsetLeft() != 0) {
                this.y = 0;
                this.F = 0;
            } else {
                this.y = 0;
                this.F = (i12 - i10) - this.G;
            }
            i13 = windowInsets.getSystemWindowInsetTop();
            i15 = systemWindowInsetLeft;
        } else {
            i13 = 0;
        }
        l0 l0Var = i4Var.h0;
        l0Var.layout(i15, i13, l0Var.getMeasuredWidth() + i15, i4Var.h0.getMeasuredHeight() + i13);
        FrameLayout frameLayout = i4Var.Q;
        frameLayout.layout(i15, i13, frameLayout.getMeasuredWidth() + i15, i4Var.Q.getMeasuredHeight() + i13);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        int size = View.MeasureSpec.getSize(i3);
        int size2 = View.MeasureSpec.getSize(i10);
        i4 i4Var = this.I;
        if (i4Var.U != null) {
            setMeasuredDimension(size, size2);
            WindowInsets windowInsets = i4Var.U;
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
                this.E = windowInsets.getSystemWindowInsetRight();
                this.G = systemWindowInsetBottom;
            } else if (windowInsets.getSystemWindowInsetLeft() != 0) {
                this.E = windowInsets.getSystemWindowInsetLeft();
                this.G = systemWindowInsetBottom;
            } else {
                this.E = size;
                this.G = windowInsets.getStableInsetBottom();
            }
            size2 = systemWindowInsetBottom - windowInsets.getSystemWindowInsetTop();
        } else {
            setMeasuredDimension(size, size2);
        }
        if (i4Var.L == null) {
            i4Var.p0 = size2 < org.telegram.messenger.g0.q.y - org.telegram.messenger.g0.L(100.0f);
        }
        i4Var.h0.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
        i4Var.Q.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        HashSet hashSet = i4.d1;
        this.I.getClass();
        return a(motionEvent) || super.onTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        a(null);
        super.requestDisallowInterceptTouchEvent(z10);
    }

    @Override // android.view.View
    public void setAlpha(float f10) {
        i4 i4Var = this.I;
        int i3 = (int) (255.0f * f10);
        i4Var.m0.setAlpha(i3);
        i4Var.y0.setAlpha(i3);
        this.x = f10;
        cg.u0 u0Var = i4Var.W0;
        if (u0Var != null) {
            u0Var.c(i4Var.W && f10 == 1.0f && this.w == 0.0f);
        }
        invalidate();
    }

    public void setInnerTranslationX(float f10) {
        this.w = f10;
        i4 i4Var = this.I;
        cg.u0 u0Var = i4Var.W0;
        if (u0Var != null) {
            u0Var.c(i4Var.W && this.x == 1.0f && f10 == 0.0f);
        }
        invalidate();
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        gi.v vVar;
        org.telegram.ui.ActionBar.x2 x2Var;
        org.telegram.ui.ActionBar.w2 w2Var;
        Paint paint;
        l3 l3Var;
        l3 l3Var2;
        int i3;
        c3 c3Var;
        i4 i4Var = this.I;
        u3 u3Var = i4Var.L;
        try {
            int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Dl, false);
            if (i4Var.v0 != null) {
                int i10 = 0;
                while (true) {
                    l3[] l3VarArr = i4Var.v0;
                    if (i10 >= l3VarArr.length) {
                        break;
                    }
                    l3 l3Var3 = l3VarArr[i10];
                    if (l3Var3 != null && (i3 = l3Var3.E) != x02) {
                        if (l3Var3.x == i3) {
                            l3Var3.x = x02;
                        }
                        if (l3Var3.y == i3) {
                            l3Var3.y = x02;
                        }
                        l3Var3.E = x02;
                        if (l3Var3.n && (c3Var = l3Var3.r) != null) {
                            c3Var.b(org.telegram.messenger.g0.B(x02) <= 0.721f, false);
                        }
                    }
                    i10++;
                }
            }
            m0 m0Var = i4Var.i0;
            if (m0Var != null) {
                l3[] l3VarArr2 = i4Var.v0;
                m0Var.setMenuColors((l3VarArr2 == null || (l3Var2 = l3VarArr2[0]) == null || !org.telegram.messenger.az.v0) ? x02 : l3Var2.getBackgroundColor());
                m0 m0Var2 = i4Var.i0;
                l3[] l3VarArr3 = i4Var.v0;
                m0Var2.d((l3VarArr3 == null || (l3Var = l3VarArr3[0]) == null || !org.telegram.messenger.az.v0) ? x02 : l3Var.getActionBarColor(), false);
            }
            Paint paint2 = i4Var.m0;
            if (paint2 != null) {
                paint2.setColor(x02);
            }
            if (i4Var.A0 && (paint = i4Var.z0) != null) {
                paint.setColor(u3Var == null ? org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.a7, true) : org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.a7, false));
            }
            if (u3Var != null && (x2Var = u3Var.e) != null && (w2Var = x2Var.b) != null) {
                org.telegram.messenger.g0.r3(w2Var, u3Var.f());
            }
            if (i4Var.m0 != null && i4.s1 != null) {
                i4.e0(i4Var);
            }
            if (i4Var.v0 != null) {
                int i11 = 0;
                while (true) {
                    l3[] l3VarArr4 = i4Var.v0;
                    if (i11 >= l3VarArr4.length) {
                        break;
                    }
                    l3 l3Var4 = l3VarArr4[i11];
                    if (l3Var4 != null && (vVar = l3Var4.b) != null) {
                        for (int i12 = 0; i12 < vVar.getChildCount(); i12++) {
                            View childAt = vVar.getChildAt(i12);
                            if ((childAt instanceof t2) && ((t2) childAt).e != null) {
                                ((t2) childAt).e.invalidate();
                            }
                            childAt.invalidate();
                        }
                    }
                    i11++;
                }
            }
            ArticleViewer$WindowView articleViewer$WindowView = i4Var.g0;
            if (articleViewer$WindowView != null) {
                articleViewer$WindowView.invalidate();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
