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

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public class ArticleViewer$WindowView extends FrameLayout implements snb {
    public int E;
    public int F;
    public int G;
    public boolean H;
    public final /* synthetic */ o I;
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
    public ArticleViewer$WindowView(o oVar, Activity activity) {
        super(activity);
        this.I = oVar;
        this.a = new Paint();
        this.x = 1.0f;
    }

    public final boolean a(MotionEvent motionEvent) {
        m mVar;
        o oVar = this.I;
        tw twVar = oVar.L;
        if (oVar.w0 == null && !oVar.V0 && oVar.Q.getVisibility() != 0 && !oVar.Q0.w()) {
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
                m mVar2 = oVar.v0[0];
                this.H = mVar2 == null || !mVar2.e() || (oVar.v0[0].e.b(true) && !oVar.v0[0].e.c);
                if ((twVar == null || !twVar.I) && this.c && !this.d && max >= hl.Z0(true, 0.4f) && Math.abs(max) / 3 > abs && this.H) {
                    b(motionEvent);
                } else if (this.d) {
                    oVar.d = null;
                    oVar.f = null;
                    if (this.e && (mVar = oVar.v0[0]) != null) {
                        mVar.setTranslationX(max);
                    } else if (twVar != null) {
                        twVar.J = max / getWidth();
                        twVar.c.invalidate();
                        twVar.t();
                        twVar.r();
                    } else {
                        a aVar = oVar.h0;
                        float f = max;
                        aVar.setTranslationX(f);
                        setInnerTranslationX(f);
                    }
                }
            } else if (motionEvent != null && motionEvent.getPointerId(0) == this.b && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6)) {
                VelocityTracker velocityTracker2 = this.s;
                if (velocityTracker2 == null) {
                    velocityTracker2 = VelocityTracker.obtain();
                    this.s = velocityTracker2;
                }
                velocityTracker2.computeCurrentVelocity(1000);
                float xVelocity = this.s.getXVelocity();
                float yVelocity = this.s.getYVelocity();
                if ((twVar == null || !twVar.I) && !this.d && xVelocity >= 3500.0f && xVelocity > Math.abs(yVelocity)) {
                    b(motionEvent);
                }
                if (this.d) {
                    boolean z = this.e;
                    View view = z ? oVar.v0[0] : oVar.h0;
                    float x = (z || twVar == null) ? view.getX() : twVar.J * twVar.c.getWidth();
                    boolean z2 = (x < ((float) view.getMeasuredWidth()) * 0.3f && (xVelocity < 2500.0f || xVelocity < yVelocity)) || !this.H;
                    AnimatorSet animatorSet = new AnimatorSet();
                    Property property = View.TRANSLATION_X;
                    if (!z2) {
                        x = view.getMeasuredWidth() - x;
                        if (this.e) {
                            animatorSet.playTogether(ObjectAnimator.ofFloat(oVar.v0[0], (Property<m, Float>) property, view.getMeasuredWidth()));
                        } else if (twVar != null) {
                            animatorSet.playTogether(twVar.l(1.0f));
                        } else {
                            animatorSet.playTogether(ObjectAnimator.ofFloat(oVar.h0, (Property<a, Float>) property, view.getMeasuredWidth()), ObjectAnimator.ofFloat(this, o.f1, view.getMeasuredWidth()));
                        }
                    } else if (this.e) {
                        animatorSet.playTogether(ObjectAnimator.ofFloat(oVar.v0[0], (Property<m, Float>) property, 0.0f));
                    } else if (twVar != null) {
                        animatorSet.playTogether(twVar.l(0.0f));
                    } else {
                        animatorSet.playTogether(ObjectAnimator.ofFloat(oVar.h0, (Property<a, Float>) property, 0.0f), ObjectAnimator.ofFloat(this, o.f1, 0.0f));
                    }
                    animatorSet.setDuration(Math.max((int) ((420.0f / view.getMeasuredWidth()) * x), jn7.Y3));
                    animatorSet.setInterpolator(k43.h);
                    animatorSet.addListener(new n(this, z2));
                    animatorSet.start();
                    oVar.V0 = true;
                } else {
                    this.c = false;
                    this.d = false;
                    this.e = false;
                }
                VelocityTracker velocityTracker3 = this.s;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                    this.s = null;
                }
            } else if (motionEvent == null) {
                this.c = false;
                this.d = false;
                this.e = false;
                VelocityTracker velocityTracker4 = this.s;
                if (velocityTracker4 != null) {
                    velocityTracker4.recycle();
                    this.s = null;
                }
                amb ambVar = oVar.Q0;
                if (ambVar != null && !ambVar.w()) {
                    oVar.Q0.e(false);
                }
            }
            if (this.d && this.H) {
                return true;
            }
        }
        return false;
    }

    @Override // snb
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(aob.Gl));
        hashSet.add(Integer.valueOf(aob.d6));
        hashSet.add(Integer.valueOf(aob.G6));
        hashSet.add(Integer.valueOf(aob.y6));
        hashSet.add(Integer.valueOf(aob.J6));
        hashSet.add(Integer.valueOf(aob.K6));
        hashSet.add(Integer.valueOf(aob.k6));
        hashSet.add(Integer.valueOf(aob.d7));
        hashSet.add(Integer.valueOf(aob.M6));
        hashSet.add(Integer.valueOf(aob.Ld));
    }

    public final void b(MotionEvent motionEvent) {
        xt xtVar;
        this.c = false;
        this.d = true;
        this.n = (int) motionEvent.getX();
        o oVar = this.I;
        ArrayList arrayList = oVar.e0;
        if (arrayList.size() <= 1 || ((xtVar = oVar.i0) != null && (xtVar.U || xtVar.a0))) {
            this.e = false;
        } else {
            this.e = true;
            this.h = oVar.K0;
            oVar.v0[1].setVisibility(0);
            oVar.v0[1].setAlpha(1.0f);
            oVar.v0[1].setTranslationX(0.0f);
            oVar.v0[0].setBackgroundColor(oVar.L == null ? 0 : oVar.m0.getColor());
            oVar.c0(-1, arrayList.get(arrayList.size() - 2), true);
            if (oVar.h0.indexOfChild(oVar.v0[0]) < oVar.h0.indexOfChild(oVar.v0[1])) {
                int indexOfChild = oVar.h0.indexOfChild(oVar.v0[0]);
                oVar.h0.removeView(oVar.v0[1]);
                oVar.h0.addView(oVar.v0[1], indexOfChild);
            }
        }
        oVar.h();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        ArticleViewer$WindowView articleViewer$WindowView;
        Activity activity;
        DisplayCutout displayCutout;
        List<Rect> boundingRects;
        o oVar = this.I;
        if (oVar.L != null) {
            return super.dispatchApplyWindowInsets(windowInsets);
        }
        WindowInsets windowInsets2 = oVar.U;
        oVar.U = windowInsets;
        if ((windowInsets2 == null || !windowInsets2.toString().equals(windowInsets.toString())) && (articleViewer$WindowView = oVar.g0) != null) {
            articleViewer$WindowView.requestLayout();
        }
        if (Build.VERSION.SDK_INT >= 28 && (activity = oVar.M) != null && (displayCutout = activity.getWindow().getDecorView().getRootWindowInsets().getDisplayCutout()) != null && (boundingRects = displayCutout.getBoundingRects()) != null && !boundingRects.isEmpty()) {
            oVar.V = boundingRects.get(0).height() != 0;
        }
        return super.dispatchApplyWindowInsets(windowInsets);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int i;
        super.dispatchDraw(canvas);
        o oVar = this.I;
        if (oVar.U != null || this.E == 0 || this.G == 0) {
            return;
        }
        int alpha = (int) (oVar.g0.getAlpha() * 255.0f);
        Paint paint = this.a;
        paint.setAlpha(alpha);
        int i2 = this.y;
        if (i2 == 0 && (i = this.F) == 0) {
            canvas.drawRect(i2, i, i2 + this.E, i + this.G, paint);
        } else {
            canvas.drawRect(i2 - getTranslationX(), this.F, (this.y + this.E) - getTranslationX(), this.F + this.G, paint);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        if (keyEvent == null || keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 1) {
            return super.dispatchKeyEventPreIme(keyEvent);
        }
        o oVar = this.I;
        boolean isFocused = oVar.i0.W.isFocused();
        xt xtVar = oVar.i0;
        if (isFocused) {
            xtVar.W.clearFocus();
            hl.t1(oVar.i0.W);
            return true;
        }
        if (xtVar.c0.isFocused()) {
            oVar.i0.c0.clearFocus();
            hl.t1(oVar.i0.c0);
            return true;
        }
        if (oVar.p0) {
            hl.t1(this);
            return true;
        }
        m mVar = oVar.v0[0];
        if (mVar == null || !mVar.e() || oVar.v0[0].getWebView() == null || !oVar.v0[0].getWebView().canGoBack()) {
            oVar.l(true, false);
            return true;
        }
        oVar.v0[0].getWebView().goBack();
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        m mVar;
        ArrayList arrayList;
        o oVar = this.I;
        if (oVar.S0.n) {
            motionEvent.offsetLocation(-oVar.h0.getX(), -oVar.h0.getY());
            return oVar.S0.g(motionEvent);
        }
        lmb m = oVar.Q0.m(getContext());
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.offsetLocation(-oVar.h0.getX(), -oVar.h0.getY());
        if (!oVar.Q0.w() || !oVar.Q0.m(getContext()).onTouchEvent(obtain)) {
            if (m.b(motionEvent)) {
                m[] mVarArr = oVar.v0;
                if (mVarArr == null || (mVar = mVarArr[0]) == null || !mVar.e() || (arrayList = oVar.e0) == null || arrayList.size() > 1) {
                    motionEvent.setAction(3);
                } else {
                    motionEvent.setAction(1);
                }
            }
            if (motionEvent.getAction() != 0 || !oVar.Q0.w() || (motionEvent.getY() >= oVar.h0.getTop() && motionEvent.getY() <= oVar.h0.getBottom())) {
                return super.dispatchTouchEvent(motionEvent);
            }
            if (oVar.Q0.m(getContext()).onTouchEvent(obtain)) {
                return super.dispatchTouchEvent(motionEvent);
            }
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        int measuredWidth = getMeasuredWidth();
        int i = (int) this.w;
        int save = canvas.save();
        canvas.clipRect(i, 0, measuredWidth, getHeight());
        boolean drawChild = super.drawChild(canvas, view, j);
        canvas.restoreToCount(save);
        if (i != 0) {
            o oVar = this.I;
            if (view == oVar.h0) {
                float f = measuredWidth - i;
                float min = Math.min(0.8f, f / measuredWidth);
                if (min < 0.0f) {
                    min = 0.0f;
                }
                oVar.o0.setColor(((int) (min * 153.0f)) << 24);
                canvas.drawRect(0.0f, 0.0f, i, getHeight(), oVar.o0);
                float max = Math.max(0.0f, Math.min(f / hl.L(20.0f), 1.0f));
                Drawable drawable = oVar.n0;
                drawable.setBounds(i - drawable.getIntrinsicWidth(), view.getTop(), i, view.getBottom());
                oVar.n0.setAlpha((int) (max * 255.0f));
                oVar.n0.draw(canvas);
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
        o oVar = this.I;
        oVar.X = false;
        VideoPlayerHolderBase videoPlayerHolderBase = oVar.x;
        if (videoPlayerHolderBase != null) {
            videoPlayerHolderBase.release(null);
            oVar.x = null;
        }
        oVar.y = null;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f;
        o oVar = this.I;
        Paint paint = oVar.y0;
        if (oVar.L == null) {
            int measuredWidth = getMeasuredWidth();
            float f2 = measuredWidth;
            float measuredHeight = getMeasuredHeight();
            canvas.drawRect(this.w, 0.0f, f2, measuredHeight, oVar.m0);
            WindowInsets windowInsets = oVar.U;
            if (windowInsets != null) {
                canvas.drawRect(this.w, 0.0f, f2, windowInsets.getSystemWindowInsetTop(), paint);
                if (oVar.V) {
                    int systemWindowInsetLeft = windowInsets.getSystemWindowInsetLeft();
                    if (systemWindowInsetLeft != 0) {
                        canvas.drawRect(0.0f, 0.0f, systemWindowInsetLeft, measuredHeight, paint);
                    }
                    if (windowInsets.getSystemWindowInsetRight() != 0) {
                        f = f2;
                        canvas.drawRect(measuredWidth - r0, 0.0f, f, measuredHeight, paint);
                        canvas.drawRect(0.0f, r9 - windowInsets.getStableInsetBottom(), f, measuredHeight, oVar.z0);
                    }
                }
                f = f2;
                canvas.drawRect(0.0f, r9 - windowInsets.getStableInsetBottom(), f, measuredHeight, oVar.z0);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return a(motionEvent) || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6 = i3 - i;
        o oVar = this.I;
        int i7 = 0;
        if (oVar.P0 != i6) {
            int i8 = 0;
            while (true) {
                m[] mVarArr = oVar.v0;
                if (i8 >= mVarArr.length) {
                    break;
                }
                Iterator it = mVarArr[i8].c.n.entrySet().iterator();
                while (it.hasNext()) {
                    ((Map.Entry) it.next()).setValue(-1);
                }
                i8++;
            }
            oVar.P0 = i6;
        }
        WindowInsets windowInsets = oVar.U;
        if (windowInsets != null) {
            int systemWindowInsetLeft = windowInsets.getSystemWindowInsetLeft();
            if (windowInsets.getSystemWindowInsetRight() != 0) {
                this.y = i6 - this.E;
                this.F = 0;
            } else if (windowInsets.getSystemWindowInsetLeft() != 0) {
                this.y = 0;
                this.F = 0;
            } else {
                this.y = 0;
                this.F = (i4 - i2) - this.G;
            }
            i5 = windowInsets.getSystemWindowInsetTop();
            i7 = systemWindowInsetLeft;
        } else {
            i5 = 0;
        }
        a aVar = oVar.h0;
        aVar.layout(i7, i5, aVar.getMeasuredWidth() + i7, oVar.h0.getMeasuredHeight() + i5);
        FrameLayout frameLayout = oVar.Q;
        frameLayout.layout(i7, i5, frameLayout.getMeasuredWidth() + i7, oVar.Q.getMeasuredHeight() + i5);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        o oVar = this.I;
        if (oVar.U != null) {
            setMeasuredDimension(size, size2);
            WindowInsets windowInsets = oVar.U;
            if (hl.y) {
                int i3 = hl.q.y;
                if (size2 > i3) {
                    size2 = i3;
                }
                size2 += hl.m;
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
        if (oVar.L == null) {
            oVar.p0 = size2 < hl.q.y - hl.L(100.0f);
        }
        oVar.h0.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
        oVar.Q.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return a(motionEvent) || super.onTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        a(null);
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View
    public void setAlpha(float f) {
        o oVar = this.I;
        int i = (int) (255.0f * f);
        oVar.m0.setAlpha(i);
        oVar.y0.setAlpha(i);
        this.x = f;
        e26 e26Var = oVar.W0;
        if (e26Var != null) {
            e26Var.b(oVar.W && f == 1.0f && this.w == 0.0f);
        }
        invalidate();
    }

    public void setInnerTranslationX(float f) {
        this.w = f;
        o oVar = this.I;
        e26 e26Var = oVar.W0;
        if (e26Var != null) {
            e26Var.b(oVar.W && this.x == 1.0f && f == 0.0f);
        }
        invalidate();
    }

    @Override // snb
    public final void updateColors() {
        iw iwVar;
        tx0 tx0Var;
        sx0 sx0Var;
        Paint paint;
        m mVar;
        m mVar2;
        m[] mVarArr;
        int i;
        dw dwVar;
        HashSet hashSet = o.d1;
        o oVar = this.I;
        tw twVar = oVar.L;
        try {
            int w0 = aob.w0(null, aob.Gl, false);
            m[] mVarArr2 = oVar.v0;
            if (mVarArr2 != null) {
                int i2 = 0;
                while (true) {
                    mVarArr = oVar.v0;
                    if (i2 >= mVarArr.length) {
                        break;
                    }
                    m mVar3 = mVarArr[i2];
                    if (mVar3 != null && (i = mVar3.E) != w0) {
                        if (mVar3.x == i) {
                            mVar3.x = w0;
                        }
                        if (mVar3.y == i) {
                            mVar3.y = w0;
                        }
                        mVar3.E = w0;
                        if (mVar3.n && (dwVar = mVar3.r) != null) {
                            dwVar.b(hl.B(w0) <= 0.721f, false);
                        }
                    }
                    i2++;
                }
                mVarArr2 = mVarArr;
            }
            xt xtVar = oVar.i0;
            if (xtVar != null) {
                xtVar.setMenuColors((mVarArr2 == null || (mVar2 = mVarArr2[0]) == null || !xea.s0) ? w0 : mVar2.getBackgroundColor());
                xt xtVar2 = oVar.i0;
                m[] mVarArr3 = oVar.v0;
                xtVar2.d((mVarArr3 == null || (mVar = mVarArr3[0]) == null || !xea.s0) ? w0 : mVar.getActionBarColor(), false);
            }
            Paint paint2 = oVar.m0;
            if (paint2 != null) {
                paint2.setColor(w0);
            }
            if (oVar.A0 && (paint = oVar.z0) != null) {
                paint.setColor(twVar == null ? aob.w0(null, aob.a7, true) : aob.w0(null, aob.a7, false));
            }
            if (twVar != null && (tx0Var = twVar.e) != null && (sx0Var = tx0Var.b) != null) {
                hl.m3(sx0Var, twVar.f());
            }
            if (oVar.m0 != null && o.s1 != null) {
                o.e0(oVar);
            }
            if (oVar.v0 != null) {
                int i3 = 0;
                while (true) {
                    m[] mVarArr4 = oVar.v0;
                    if (i3 >= mVarArr4.length) {
                        break;
                    }
                    m mVar4 = mVarArr4[i3];
                    if (mVar4 != null && (iwVar = mVar4.b) != null) {
                        for (int i4 = 0; i4 < iwVar.getChildCount(); i4++) {
                            View childAt = iwVar.getChildAt(i4);
                            if ((childAt instanceof vv) && ((vv) childAt).e != null) {
                                ((vv) childAt).e.invalidate();
                            }
                            childAt.invalidate();
                        }
                    }
                    i3++;
                }
            }
            ArticleViewer$WindowView articleViewer$WindowView = oVar.g0;
            if (articleViewer$WindowView != null) {
                articleViewer$WindowView.invalidate();
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }
}
