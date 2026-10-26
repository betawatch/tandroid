package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.vh;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class z5 extends FrameLayout {
    public float E;
    public float F;
    public float G;
    public boolean H;
    public final RectF I;
    public final RectF J;
    public final RectF K;
    public final RectF L;
    public final Path M;
    public final float[] N;
    public final int[] O;
    public r5 a;
    public y5 b;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout c;
    public eh.d d;
    public r5 e;
    public final Paint f;
    public final Paint h;
    public boolean n;
    public boolean r;
    public boolean s;
    public long v;
    public Runnable w;
    public long x;
    public float y;

    public z5(Context context) {
        super(context);
        this.f = new Paint(1);
        Paint paint = new Paint();
        this.h = paint;
        this.I = new RectF();
        this.J = new RectF();
        this.K = new RectF();
        this.L = new RectF();
        this.M = new Path();
        this.N = new float[2];
        this.O = new int[2];
        setWillNotDraw(false);
        setClipChildren(false);
        setVisibility(8);
        paint.setColor(-16777216);
    }

    public static double e(double d, double d10, double d11) {
        if (d <= 0.0d) {
            return 0.0d;
        }
        double d12 = 6.283185307179586d / d11;
        double d13 = 1.0d - (d10 * d10);
        double sqrt = Math.sqrt(d13) * d12;
        double d14 = sqrt * d;
        return 1.0d - (((Math.sin(d14) * (d10 / Math.sqrt(d13))) + Math.cos(d14)) * Math.exp(((-d10) * d12) * d));
    }

    public final void a(boolean z10) {
        boolean z11 = this.n;
        if (z11 || this.H) {
            if (z11) {
                this.n = false;
                if (z10 && isAttachedToWindow() && isLaidOut()) {
                    this.y = Math.max(this.E, this.F);
                    this.x = 0L;
                    this.H = true;
                    invalidate();
                    return;
                }
            }
            d();
        }
    }

    public final void b(View view) {
        ViewParent parent = getParent();
        float f7 = 0.0f;
        View view2 = view;
        float f10 = 0.0f;
        while (view2 != null && view2 != parent) {
            f7 += view2.getX();
            f10 += view2.getY();
            Object parent2 = view2.getParent();
            view2 = parent2 instanceof View ? (View) parent2 : null;
        }
        float[] fArr = this.N;
        if (view2 != null) {
            fArr[0] = f7 - getX();
            fArr[1] = f10 - getY();
            return;
        }
        int[] iArr = this.O;
        view.getLocationInWindow(iArr);
        float f11 = iArr[0];
        float f12 = iArr[1];
        getLocationInWindow(iArr);
        fArr[0] = f11 - iArr[0];
        fArr[1] = f12 - iArr[1];
    }

    public final void c() {
        y5 y5Var;
        r5 r5Var = this.a;
        if (r5Var == null || (y5Var = this.b) == null) {
            return;
        }
        RectF rectF = this.I;
        this.r = r5Var.m(y5Var, rectF);
        b(this.a);
        float[] fArr = this.N;
        rectF.offset(fArr[0], fArr[1]);
    }

    public final void d() {
        this.H = false;
        this.n = false;
        this.G = 0.0f;
        this.F = 0.0f;
        this.E = 0.0f;
        clearFocus();
        setVisibility(8);
        y5 y5Var = this.b;
        r5 r5Var = this.a;
        this.b = null;
        if (r5Var != null) {
            r5Var.O = null;
            r5Var.P = null;
            r5Var.invalidate();
        }
        if (y5Var != null) {
            y5Var.getIconView().setAlpha(1.0f);
            t0 t0Var = y5Var.Q;
            if (t0Var != null) {
                t0Var.a();
            }
        }
        Runnable runnable = this.w;
        if (runnable != null) {
            this.w = null;
            runnable.run();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        char c10;
        float f10;
        float f11;
        float clamp01;
        float f12;
        if (this.a == null || this.b == null || this.c == null) {
            return;
        }
        if (this.H) {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            if (this.x == 0) {
                this.x = currentAnimationTimeMillis;
            }
            float durationScale = Build.VERSION.SDK_INT >= 26 ? ValueAnimator.getDurationScale() : 1.0f;
            float f13 = durationScale <= 0.0f ? 10.0f : ((currentAnimationTimeMillis - this.x) / 1000.0f) / durationScale;
            float f14 = this.y;
            if (this.n) {
                this.G = 0.0f;
                this.E = f13 > 0.7f ? 1.0f : ((1.0f - f14) * ((float) e(f13, 0.78d, 0.3d))) + f14;
                this.F = f13 > 0.7f ? 1.0f : ((1.0f - f14) * ((float) e(f13 - 0.02d, 0.8d, 0.34d))) + f14;
                if (f13 > 0.7f) {
                    this.H = false;
                }
            } else {
                float clamp012 = Utilities.clamp01(f13 / 0.2f);
                float clamp013 = Utilities.clamp01(f13 / 0.17f);
                this.E = (1.0f - ((3.0f - (clamp013 * 2.0f)) * (clamp013 * clamp013))) * f14;
                this.F = (1.0f - ((3.0f - (clamp012 * 2.0f)) * (clamp012 * clamp012))) * f14;
                float f15 = f13 - 0.2f;
                this.G = (f15 <= 0.0f || !this.r) ? 0.0f : f14 * 0.07f * ((float) Math.exp((-f15) / 0.11f)) * ((float) Math.sin((f15 * 6.283185307179586d) / 0.17000000178813934d));
                if (!this.r ? f15 >= 0.0f : f15 > 0.45f) {
                    this.G = 0.0f;
                    post(new q(this, 15));
                }
            }
        }
        c();
        float left = this.c.getLeft();
        float top = this.c.getTop();
        float right = this.c.getRight();
        float bottom = this.c.getBottom();
        RectF rectF = this.J;
        rectF.set(left, top, right, bottom);
        float f16 = this.E;
        float f17 = this.F;
        float clamp014 = Utilities.clamp01(Math.max(f16, f17));
        RectF rectF2 = this.I;
        float lerp = AndroidUtilities.lerp(rectF2.left, rectF.left, f16);
        float lerp2 = AndroidUtilities.lerp(rectF2.top, rectF.top, f17);
        float lerp3 = AndroidUtilities.lerp(rectF2.right, rectF.right, f16);
        float lerp4 = AndroidUtilities.lerp(rectF2.bottom, rectF.bottom, f17);
        RectF rectF3 = this.K;
        rectF3.set(lerp, lerp2, lerp3, lerp4);
        if (this.G != 0.0f) {
            float centerX = rectF3.centerX();
            float centerY = rectF3.centerY();
            f7 = 0.45f;
            float C = c3.h0.C(this.G, 0.5f, 1.0f, rectF3.width() / 2.0f);
            float height = (1.0f - this.G) * (rectF3.height() / 2.0f);
            c10 = 0;
            rectF3.set(centerX - C, centerY - height, centerX + C, centerY + height);
        } else {
            f7 = 0.45f;
            c10 = 0;
        }
        float min = Math.min(Math.min(rectF3.height(), rectF3.width()) / 2.0f, AndroidUtilities.lerp(rectF2.height() / 2.0f, AndroidUtilities.dp(22.0f), Utilities.clamp01(f17)));
        Paint paint = this.h;
        paint.setAlpha((int) (26.0f * clamp014));
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
        int dp = AndroidUtilities.dp(6.0f);
        float clamp015 = this.r ? 1.0f : Utilities.clamp01(clamp014 / 0.25f);
        eh.d dVar = this.d;
        if (dVar != null) {
            dVar.x(min);
            this.d.setBounds(((int) rectF3.left) - dp, ((int) rectF3.top) - dp, ((int) rectF3.right) + dp, ((int) rectF3.bottom) + dp);
            this.d.setAlpha((int) (clamp015 * 255.0f));
            this.d.draw(canvas);
        } else {
            int w02 = y6.w0(y6.G8, this.a.a);
            Paint paint2 = this.f;
            paint2.setColor(w02);
            paint2.setAlpha((int) (paint2.getAlpha() * clamp015));
            canvas.drawRoundRect(rectF3, min, min, paint2);
        }
        canvas.save();
        Path path = this.M;
        path.rewind();
        path.addRoundRect(rectF3, min, min, Path.Direction.CW);
        canvas.clipPath(path);
        float clamp016 = 1.0f - Utilities.clamp01(clamp014 / (this.n ? 0.3f : 0.7f));
        View menuView = this.r ? this.a.getMenuView() : this.b.getIconView();
        if (clamp016 <= 0.004f || menuView == null) {
            f10 = 0.004f;
        } else {
            b(menuView);
            float[] fArr = this.N;
            float f18 = fArr[c10];
            f10 = 0.004f;
            float height2 = fArr[1] + menuView.getHeight();
            RectF rectF4 = this.L;
            rectF4.set(f18, fArr[1], menuView.getWidth() + f18, height2);
            float clamp017 = 1.0f - (Utilities.clamp01(clamp014 / 0.3f) * 0.15f);
            canvas.saveLayerAlpha(rectF4.left, rectF4.top, rectF4.right, rectF4.bottom, (int) (clamp016 * 255.0f));
            float f19 = this.G;
            canvas.scale(c3.h0.C(f19, 0.5f, 1.0f, clamp017), (1.0f - f19) * clamp017, rectF4.centerX(), rectF4.centerY());
            canvas.translate(rectF4.left, rectF4.top);
            menuView.draw(canvas);
            canvas.restore();
        }
        if (this.n) {
            clamp01 = Utilities.clamp01((clamp014 - 0.25f) / 0.5f);
            f12 = clamp01 * clamp01;
            f11 = 3.0f;
        } else {
            f11 = 3.0f;
            clamp01 = Utilities.clamp01((clamp014 - 0.5f) / f7);
            f12 = clamp01 * clamp01;
        }
        float D = c3.h0.D(clamp01, 2.0f, f11, f12);
        if (D > f10) {
            float max = Math.max(0.3f, rectF3.width() / Math.max(1.0f, rectF.width()));
            canvas.saveLayerAlpha(rectF3.left, rectF3.top, rectF3.right, rectF3.bottom, (int) (D * 255.0f));
            canvas.translate(rectF3.right - rectF.right, rectF3.top - rectF.top);
            canvas.scale(max, max, rectF.right, rectF.top);
            super.dispatchDraw(canvas);
            canvas.restore();
        }
        canvas.restore();
        if (this.H) {
            invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.n || keyEvent.getAction() != 1 || keyEvent.getRepeatCount() != 0 || (keyEvent.getKeyCode() != 82 && keyEvent.getKeyCode() != 4)) {
            return super.dispatchKeyEvent(keyEvent);
        }
        a(true);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0031, code lost:
    
        if (r7.I.contains(r8.getX(), r8.getY()) != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0044, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0045, code lost:
    
        r7.s = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0047, code lost:
    
        if (r1 == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0049, code lost:
    
        a(true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004c, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0042, code lost:
    
        if (r7.J.contains(r8.getX(), r8.getY()) == false) goto L17;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z10 = false;
        if (!this.n) {
            return false;
        }
        if (motionEvent.getActionMasked() == 0) {
            ViewParent parent = getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (SystemClock.uptimeMillis() - this.v < 300) {
            }
        }
        if (this.s) {
            return true;
        }
        super.dispatchTouchEvent(motionEvent);
        return true;
    }

    public y5 getItem() {
        return this.b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.n || this.H) {
            d();
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.c;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout == null || actionBarPopupWindow$ActionBarPopupWindowLayout.getParent() != this) {
            return;
        }
        c();
        RectF rectF = this.I;
        int i14 = (int) rectF.right;
        int i15 = (int) rectF.top;
        int max = Math.max(AndroidUtilities.dp(8.0f), i14 - this.c.getMeasuredWidth());
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = this.c;
        actionBarPopupWindow$ActionBarPopupWindowLayout2.layout(max, i15, actionBarPopupWindow$ActionBarPopupWindowLayout2.getMeasuredWidth() + max, this.c.getMeasuredHeight() + i15);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        setMeasuredDimension(size, size2);
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.c;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout == null || actionBarPopupWindow$ActionBarPopupWindowLayout.getParent() != this) {
            return;
        }
        c();
        this.c.measure(vh.x(16.0f, size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(Math.max(AndroidUtilities.dp(48.0f), (int) (((size2 - this.I.top) - AndroidUtilities.dp(16.0f)) - AndroidUtilities.navigationBarHeight)), TLObject.FLAG_31));
    }

    public void setOnClosed(Runnable runnable) {
        this.w = runnable;
    }
}
