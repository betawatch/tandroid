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

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
class ArticleViewer$WindowView extends FrameLayout {
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
    public float v;
    public float w;
    public int x;
    public int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ArticleViewer$WindowView(h4 h4Var, Activity activity) {
        super(activity);
        this.H = h4Var;
        this.a = new Paint();
        this.w = 1.0f;
    }

    public final boolean a(MotionEvent motionEvent) {
        l3 l3Var;
        h4 h4Var = this.H;
        u3 u3Var = h4Var.K;
        if (h4Var.v0 == null && !h4Var.T0 && h4Var.P.getVisibility() != 0 && !h4Var.O0.y()) {
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
                if ((u3Var == null || !u3Var.H) && this.c && !this.d && max >= AndroidUtilities.getPixelsInCM(0.4f, true) && Math.abs(max) / 3 > abs && this.G) {
                    b(motionEvent);
                } else if (this.d) {
                    h4Var.d = null;
                    h4Var.f = null;
                    if (this.e && (l3Var = h4Var.u0[0]) != null) {
                        l3Var.setTranslationX(max);
                    } else if (u3Var != null) {
                        u3Var.I = max / getWidth();
                        u3Var.c.invalidate();
                        u3Var.i();
                        u3Var.h();
                    } else {
                        j0 j0Var = h4Var.g0;
                        float f7 = max;
                        j0Var.setTranslationX(f7);
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
                            animatorSet.playTogether(u3Var.d(1.0f));
                        } else {
                            animatorSet.playTogether(ObjectAnimator.ofFloat(h4Var.g0, (Property<j0, Float>) property, view.getMeasuredWidth()), ObjectAnimator.ofFloat(this, h4.d1, view.getMeasuredWidth()));
                        }
                    } else if (this.e) {
                        animatorSet.playTogether(ObjectAnimator.ofFloat(h4Var.u0[0], (Property<l3, Float>) property, 0.0f));
                    } else if (u3Var != null) {
                        animatorSet.playTogether(u3Var.d(0.0f));
                    } else {
                        animatorSet.playTogether(ObjectAnimator.ofFloat(h4Var.g0, (Property<j0, Float>) property, 0.0f), ObjectAnimator.ofFloat(this, h4.d1, 0.0f));
                    }
                    animatorSet.setDuration(Math.max((int) ((420.0f / view.getMeasuredWidth()) * x10), MediaDataController.MAX_LINKS_COUNT));
                    animatorSet.setInterpolator(org.telegram.ui.Components.qr.h);
                    animatorSet.addListener(new g4(this, z11));
                    animatorSet.start();
                    h4Var.T0 = true;
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
                org.telegram.ui.Cells.q9 q9Var = h4Var.O0;
                if (q9Var != null && !q9Var.y()) {
                    h4Var.O0.f(false);
                }
            }
            if (this.d && this.G) {
                return true;
            }
        }
        return false;
    }

    public final void b(MotionEvent motionEvent) {
        k0 k0Var;
        this.c = false;
        this.d = true;
        this.n = (int) motionEvent.getX();
        h4 h4Var = this.H;
        ArrayList arrayList = h4Var.d0;
        if (arrayList.size() <= 1 || ((k0Var = h4Var.h0) != null && (k0Var.T || k0Var.W))) {
            this.e = false;
        } else {
            this.e = true;
            this.h = h4Var.I0;
            h4Var.u0[1].setVisibility(0);
            h4Var.u0[1].setAlpha(1.0f);
            h4Var.u0[1].setTranslationX(0.0f);
            h4Var.u0[0].setBackgroundColor(h4Var.K == null ? 0 : h4Var.l0.getColor());
            h4Var.e0(-1, arrayList.get(arrayList.size() - 2), true);
            if (h4Var.g0.indexOfChild(h4Var.u0[0]) < h4Var.g0.indexOfChild(h4Var.u0[1])) {
                int indexOfChild = h4Var.g0.indexOfChild(h4Var.u0[0]);
                h4Var.g0.removeView(h4Var.u0[1]);
                h4Var.g0.addView(h4Var.u0[1], indexOfChild);
            }
        }
        h4Var.k();
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
        if (h4Var.T != null || this.y == 0 || this.F == 0) {
            return;
        }
        int alpha = (int) (h4Var.f0.getAlpha() * 255.0f);
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
        h4 h4Var = this.H;
        if (h4Var.h0.V.isFocused()) {
            h4Var.h0.V.clearFocus();
            AndroidUtilities.hideKeyboard(h4Var.h0.V);
            return true;
        }
        if (h4Var.h0.b0.isFocused()) {
            h4Var.h0.b0.clearFocus();
            AndroidUtilities.hideKeyboard(h4Var.h0.b0);
            return true;
        }
        if (h4Var.o0) {
            AndroidUtilities.hideKeyboard(this);
            return true;
        }
        l3 l3Var = h4Var.u0[0];
        if (l3Var == null || !l3Var.f() || h4Var.u0[0].getWebView() == null || !h4Var.u0[0].getWebView().canGoBack()) {
            h4Var.o(true, false);
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
        if (h4Var.Q0.n) {
            motionEvent.offsetLocation(-h4Var.g0.getX(), -h4Var.g0.getY());
            return h4Var.Q0.g(motionEvent);
        }
        org.telegram.ui.Cells.ca o9 = h4Var.O0.o(getContext());
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.offsetLocation(-h4Var.g0.getX(), -h4Var.g0.getY());
        if (!h4Var.O0.y() || !h4Var.O0.o(getContext()).onTouchEvent(obtain)) {
            if (o9.b(motionEvent)) {
                l3[] l3VarArr = h4Var.u0;
                if (l3VarArr == null || (l3Var = l3VarArr[0]) == null || !l3Var.f() || (arrayList = h4Var.d0) == null || arrayList.size() > 1) {
                    motionEvent.setAction(3);
                } else {
                    motionEvent.setAction(1);
                }
            }
            if (motionEvent.getAction() != 0 || !h4Var.O0.y() || (motionEvent.getY() >= h4Var.g0.getTop() && motionEvent.getY() <= h4Var.g0.getBottom())) {
                return super.dispatchTouchEvent(motionEvent);
            }
            if (h4Var.O0.o(getContext()).onTouchEvent(obtain)) {
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
            h4 h4Var = this.H;
            if (view == h4Var.g0) {
                float f7 = measuredWidth - i10;
                float min = Math.min(0.8f, f7 / measuredWidth);
                if (min < 0.0f) {
                    min = 0.0f;
                }
                h4Var.n0.setColor(((int) (min * 153.0f)) << 24);
                canvas.drawRect(0.0f, 0.0f, i10, getHeight(), h4Var.n0);
                float max = Math.max(0.0f, Math.min(f7 / AndroidUtilities.dp(20.0f), 1.0f));
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
        h4 h4Var = this.H;
        h4Var.W = false;
        VideoPlayerHolderBase videoPlayerHolderBase = h4Var.w;
        if (videoPlayerHolderBase != null) {
            videoPlayerHolderBase.release(null);
            h4Var.w = null;
        }
        h4Var.x = null;
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
            canvas.drawRect(this.v, 0.0f, f10, measuredHeight, h4Var.l0);
            WindowInsets windowInsets = h4Var.T;
            if (windowInsets != null) {
                canvas.drawRect(this.v, 0.0f, f10, windowInsets.getSystemWindowInsetTop(), paint);
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
        HashSet hashSet = h4.b1;
        this.H.getClass();
        return a(motionEvent) || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        int i15 = i12 - i10;
        h4 h4Var = this.H;
        int i16 = 0;
        if (h4Var.N0 != i15) {
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
            h4Var.N0 = i15;
        }
        WindowInsets windowInsets = h4Var.T;
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
        j0 j0Var = h4Var.g0;
        j0Var.layout(i16, i14, j0Var.getMeasuredWidth() + i16, h4Var.g0.getMeasuredHeight() + i14);
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
        if (h4Var.K == null) {
            h4Var.o0 = size2 < AndroidUtilities.displaySize.y - AndroidUtilities.dp(100.0f);
        }
        h4Var.g0.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
        h4Var.P.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        HashSet hashSet = h4.b1;
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
        this.w = f7;
        lb0 lb0Var = h4Var.U0;
        if (lb0Var != null) {
            lb0Var.a(h4Var.V && f7 == 1.0f && this.v == 0.0f);
        }
        invalidate();
    }

    public void setInnerTranslationX(float f7) {
        this.v = f7;
        h4 h4Var = this.H;
        lb0 lb0Var = h4Var.U0;
        if (lb0Var != null) {
            lb0Var.a(h4Var.V && this.w == 1.0f && f7 == 0.0f);
        }
        invalidate();
    }
}
