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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
class ArticleViewer$WindowView extends FrameLayout {
    public int A;
    public int B;
    public boolean C;
    public final /* synthetic */ m4 D;
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
    public ArticleViewer$WindowView(m4 m4Var, Activity activity) {
        super(activity);
        this.D = m4Var;
        this.a = new Paint();
        this.w = 1.0f;
    }

    public final boolean a(MotionEvent motionEvent) {
        q3 q3Var;
        m4 m4Var = this.D;
        z3 z3Var = m4Var.G;
        if (m4Var.r0 == null && !m4Var.P0 && m4Var.L.getVisibility() != 0 && !m4Var.K0.y()) {
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
                q3 q3Var2 = m4Var.q0[0];
                this.C = q3Var2 == null || !q3Var2.f() || (m4Var.q0[0].e.b(true) && !m4Var.q0[0].e.c);
                if ((z3Var == null || !z3Var.D) && this.c && !this.d && max >= AndroidUtilities.getPixelsInCM(0.4f, true) && Math.abs(max) / 3 > abs && this.C) {
                    b(motionEvent);
                } else if (this.d) {
                    m4Var.d = null;
                    m4Var.f = null;
                    if (this.e && (q3Var = m4Var.q0[0]) != null) {
                        q3Var.setTranslationX(max);
                    } else if (z3Var != null) {
                        z3Var.E = max / getWidth();
                        z3Var.c.invalidate();
                        z3Var.i();
                        z3Var.h();
                    } else {
                        n0 n0Var = m4Var.c0;
                        float f9 = max;
                        n0Var.setTranslationX(f9);
                        setInnerTranslationX(f9);
                    }
                }
            } else if (motionEvent != null && motionEvent.getPointerId(0) == this.b && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6)) {
                if (this.s == null) {
                    this.s = VelocityTracker.obtain();
                }
                this.s.computeCurrentVelocity(MediaDataController.MAX_STYLE_RUNS_COUNT);
                float xVelocity = this.s.getXVelocity();
                float yVelocity = this.s.getYVelocity();
                if ((z3Var == null || !z3Var.D) && !this.d && xVelocity >= 3500.0f && xVelocity > Math.abs(yVelocity)) {
                    b(motionEvent);
                }
                if (this.d) {
                    boolean z10 = this.e;
                    View view = z10 ? m4Var.q0[0] : m4Var.c0;
                    float x4 = (z10 || z3Var == null) ? view.getX() : z3Var.E * z3Var.c.getWidth();
                    boolean z11 = (x4 < ((float) view.getMeasuredWidth()) * 0.3f && (xVelocity < 2500.0f || xVelocity < yVelocity)) || !this.C;
                    AnimatorSet animatorSet = new AnimatorSet();
                    Property property = View.TRANSLATION_X;
                    if (!z11) {
                        x4 = view.getMeasuredWidth() - x4;
                        if (this.e) {
                            animatorSet.playTogether(ObjectAnimator.ofFloat(m4Var.q0[0], (Property<q3, Float>) property, view.getMeasuredWidth()));
                        } else if (z3Var != null) {
                            animatorSet.playTogether(z3Var.d(1.0f));
                        } else {
                            animatorSet.playTogether(ObjectAnimator.ofFloat(m4Var.c0, (Property<n0, Float>) property, view.getMeasuredWidth()), ObjectAnimator.ofFloat(this, m4.Z0, view.getMeasuredWidth()));
                        }
                    } else if (this.e) {
                        animatorSet.playTogether(ObjectAnimator.ofFloat(m4Var.q0[0], (Property<q3, Float>) property, 0.0f));
                    } else if (z3Var != null) {
                        animatorSet.playTogether(z3Var.d(0.0f));
                    } else {
                        animatorSet.playTogether(ObjectAnimator.ofFloat(m4Var.c0, (Property<n0, Float>) property, 0.0f), ObjectAnimator.ofFloat(this, m4.Z0, 0.0f));
                    }
                    animatorSet.setDuration(Math.max((int) ((420.0f / view.getMeasuredWidth()) * x4), MediaDataController.MAX_LINKS_COUNT));
                    animatorSet.setInterpolator(org.telegram.ui.Components.jr.h);
                    animatorSet.addListener(new l4(this, z11));
                    animatorSet.start();
                    m4Var.P0 = true;
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
                org.telegram.ui.Cells.k9 k9Var = m4Var.K0;
                if (k9Var != null && !k9Var.y()) {
                    m4Var.K0.f(false);
                }
            }
            if (this.d && this.C) {
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
        m4 m4Var = this.D;
        ArrayList arrayList = m4Var.Z;
        if (arrayList.size() <= 1 || ((o0Var = m4Var.d0) != null && (o0Var.P || o0Var.S))) {
            this.e = false;
        } else {
            this.e = true;
            this.h = m4Var.E0;
            m4Var.q0[1].setVisibility(0);
            m4Var.q0[1].setAlpha(1.0f);
            m4Var.q0[1].setTranslationX(0.0f);
            m4Var.q0[0].setBackgroundColor(m4Var.G == null ? 0 : m4Var.h0.getColor());
            m4Var.e0(-1, arrayList.get(arrayList.size() - 2), true);
            if (m4Var.c0.indexOfChild(m4Var.q0[0]) < m4Var.c0.indexOfChild(m4Var.q0[1])) {
                int indexOfChild = m4Var.c0.indexOfChild(m4Var.q0[0]);
                m4Var.c0.removeView(m4Var.q0[1]);
                m4Var.c0.addView(m4Var.q0[1], indexOfChild);
            }
        }
        m4Var.k();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        ArticleViewer$WindowView articleViewer$WindowView;
        Activity activity;
        DisplayCutout displayCutout;
        List<Rect> boundingRects;
        m4 m4Var = this.D;
        if (m4Var.G != null) {
            return super.dispatchApplyWindowInsets(windowInsets);
        }
        WindowInsets windowInsets2 = m4Var.P;
        m4Var.P = windowInsets;
        if ((windowInsets2 == null || !windowInsets2.toString().equals(windowInsets.toString())) && (articleViewer$WindowView = m4Var.b0) != null) {
            articleViewer$WindowView.requestLayout();
        }
        if (Build.VERSION.SDK_INT >= 28 && (activity = m4Var.H) != null && (displayCutout = activity.getWindow().getDecorView().getRootWindowInsets().getDisplayCutout()) != null && (boundingRects = displayCutout.getBoundingRects()) != null && !boundingRects.isEmpty()) {
            m4Var.Q = boundingRects.get(0).height() != 0;
        }
        return super.dispatchApplyWindowInsets(windowInsets);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        super.dispatchDraw(canvas);
        m4 m4Var = this.D;
        if (m4Var.P != null || this.y == 0 || this.B == 0) {
            return;
        }
        int alpha = (int) (m4Var.b0.getAlpha() * 255.0f);
        Paint paint = this.a;
        paint.setAlpha(alpha);
        int i11 = this.x;
        if (i11 == 0 && (i10 = this.A) == 0) {
            canvas.drawRect(i11, i10, i11 + this.y, i10 + this.B, paint);
        } else {
            canvas.drawRect(i11 - getTranslationX(), this.A, (this.x + this.y) - getTranslationX(), this.A + this.B, paint);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        if (keyEvent == null || keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 1) {
            return super.dispatchKeyEventPreIme(keyEvent);
        }
        m4 m4Var = this.D;
        if (m4Var.d0.R.isFocused()) {
            m4Var.d0.R.clearFocus();
            AndroidUtilities.hideKeyboard(m4Var.d0.R);
            return true;
        }
        if (m4Var.d0.U.isFocused()) {
            m4Var.d0.U.clearFocus();
            AndroidUtilities.hideKeyboard(m4Var.d0.U);
            return true;
        }
        if (m4Var.k0) {
            AndroidUtilities.hideKeyboard(this);
            return true;
        }
        q3 q3Var = m4Var.q0[0];
        if (q3Var == null || !q3Var.f() || m4Var.q0[0].getWebView() == null || !m4Var.q0[0].getWebView().canGoBack()) {
            m4Var.o(true, false);
            return true;
        }
        m4Var.q0[0].getWebView().goBack();
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        q3 q3Var;
        ArrayList arrayList;
        m4 m4Var = this.D;
        if (m4Var.M0.n) {
            motionEvent.offsetLocation(-m4Var.c0.getX(), -m4Var.c0.getY());
            return m4Var.M0.g(motionEvent);
        }
        org.telegram.ui.Cells.w9 o10 = m4Var.K0.o(getContext());
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.offsetLocation(-m4Var.c0.getX(), -m4Var.c0.getY());
        if (!m4Var.K0.y() || !m4Var.K0.o(getContext()).onTouchEvent(obtain)) {
            if (o10.b(motionEvent)) {
                q3[] q3VarArr = m4Var.q0;
                if (q3VarArr == null || (q3Var = q3VarArr[0]) == null || !q3Var.f() || (arrayList = m4Var.Z) == null || arrayList.size() > 1) {
                    motionEvent.setAction(3);
                } else {
                    motionEvent.setAction(1);
                }
            }
            if (motionEvent.getAction() != 0 || !m4Var.K0.y() || (motionEvent.getY() >= m4Var.c0.getTop() && motionEvent.getY() <= m4Var.c0.getBottom())) {
                return super.dispatchTouchEvent(motionEvent);
            }
            if (m4Var.K0.o(getContext()).onTouchEvent(obtain)) {
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
            m4 m4Var = this.D;
            if (view == m4Var.c0) {
                float f9 = measuredWidth - i10;
                float min = Math.min(0.8f, f9 / measuredWidth);
                if (min < 0.0f) {
                    min = 0.0f;
                }
                m4Var.j0.setColor(((int) (min * 153.0f)) << 24);
                canvas.drawRect(0.0f, 0.0f, i10, getHeight(), m4Var.j0);
                float max = Math.max(0.0f, Math.min(f9 / AndroidUtilities.dp(20.0f), 1.0f));
                Drawable drawable = m4Var.i0;
                drawable.setBounds(i10 - drawable.getIntrinsicWidth(), view.getTop(), i10, view.getBottom());
                m4Var.i0.setAlpha((int) (max * 255.0f));
                m4Var.i0.draw(canvas);
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
        m4 m4Var = this.D;
        m4Var.S = false;
        VideoPlayerHolderBase videoPlayerHolderBase = m4Var.w;
        if (videoPlayerHolderBase != null) {
            videoPlayerHolderBase.release(null);
            m4Var.w = null;
        }
        m4Var.x = null;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f9;
        m4 m4Var = this.D;
        Paint paint = m4Var.t0;
        if (m4Var.G == null) {
            int measuredWidth = getMeasuredWidth();
            float f10 = measuredWidth;
            float measuredHeight = getMeasuredHeight();
            canvas.drawRect(this.v, 0.0f, f10, measuredHeight, m4Var.h0);
            WindowInsets windowInsets = m4Var.P;
            if (windowInsets != null) {
                canvas.drawRect(this.v, 0.0f, f10, windowInsets.getSystemWindowInsetTop(), paint);
                if (m4Var.Q) {
                    int systemWindowInsetLeft = windowInsets.getSystemWindowInsetLeft();
                    if (systemWindowInsetLeft != 0) {
                        canvas.drawRect(0.0f, 0.0f, systemWindowInsetLeft, measuredHeight, paint);
                    }
                    if (windowInsets.getSystemWindowInsetRight() != 0) {
                        f9 = f10;
                        canvas.drawRect(measuredWidth - r2, 0.0f, f9, measuredHeight, paint);
                        canvas.drawRect(0.0f, r9 - windowInsets.getStableInsetBottom(), f9, measuredHeight, m4Var.u0);
                    }
                }
                f9 = f10;
                canvas.drawRect(0.0f, r9 - windowInsets.getStableInsetBottom(), f9, measuredHeight, m4Var.u0);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        HashSet hashSet = m4.X0;
        this.D.getClass();
        return a(motionEvent) || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        int i15 = i12 - i10;
        m4 m4Var = this.D;
        int i16 = 0;
        if (m4Var.J0 != i15) {
            int i17 = 0;
            while (true) {
                q3[] q3VarArr = m4Var.q0;
                if (i17 >= q3VarArr.length) {
                    break;
                }
                Iterator it = q3VarArr[i17].c.n.entrySet().iterator();
                while (it.hasNext()) {
                    ((Map.Entry) it.next()).setValue(-1);
                }
                i17++;
            }
            m4Var.J0 = i15;
        }
        WindowInsets windowInsets = m4Var.P;
        if (windowInsets != null) {
            int systemWindowInsetLeft = windowInsets.getSystemWindowInsetLeft();
            if (windowInsets.getSystemWindowInsetRight() != 0) {
                this.x = i15 - this.y;
                this.A = 0;
            } else if (windowInsets.getSystemWindowInsetLeft() != 0) {
                this.x = 0;
                this.A = 0;
            } else {
                this.x = 0;
                this.A = (i13 - i11) - this.B;
            }
            i14 = windowInsets.getSystemWindowInsetTop();
            i16 = systemWindowInsetLeft;
        } else {
            i14 = 0;
        }
        n0 n0Var = m4Var.c0;
        n0Var.layout(i16, i14, n0Var.getMeasuredWidth() + i16, m4Var.c0.getMeasuredHeight() + i14);
        FrameLayout frameLayout = m4Var.L;
        frameLayout.layout(i16, i14, frameLayout.getMeasuredWidth() + i16, m4Var.L.getMeasuredHeight() + i14);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        m4 m4Var = this.D;
        if (m4Var.P != null) {
            setMeasuredDimension(size, size2);
            WindowInsets windowInsets = m4Var.P;
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
        if (m4Var.G == null) {
            m4Var.k0 = size2 < AndroidUtilities.displaySize.y - AndroidUtilities.dp(100.0f);
        }
        m4Var.c0.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
        m4Var.L.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        HashSet hashSet = m4.X0;
        this.D.getClass();
        return a(motionEvent) || super.onTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        a(null);
        super.requestDisallowInterceptTouchEvent(z10);
    }

    @Override // android.view.View
    public void setAlpha(float f9) {
        m4 m4Var = this.D;
        int i10 = (int) (255.0f * f9);
        m4Var.h0.setAlpha(i10);
        m4Var.t0.setAlpha(i10);
        this.w = f9;
        jf.s0 s0Var = m4Var.Q0;
        if (s0Var != null) {
            s0Var.a(m4Var.R && f9 == 1.0f && this.v == 0.0f);
        }
        invalidate();
    }

    public void setInnerTranslationX(float f9) {
        this.v = f9;
        m4 m4Var = this.D;
        jf.s0 s0Var = m4Var.Q0;
        if (s0Var != null) {
            s0Var.a(m4Var.R && this.w == 1.0f && f9 == 0.0f);
        }
        invalidate();
    }
}
