package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.SystemClock;
import android.provider.Settings;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.WeakHashMap;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.z20;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.yf0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class s5 extends FrameLayout {
    public boolean D;
    public boolean E;
    public long F;
    public Runnable G;
    public long H;
    public float I;
    public float J;
    public float K;
    public float L;
    public boolean M;
    public final e2.f N;
    public final RectF O;
    public final RectF P;
    public final RectF Q;
    public final RectF R;
    public final RectF S;
    public final float[] T;
    public final Path U;
    public final ArrayList V;
    public float W;
    public float a;
    public float a0;
    public yf0 b;
    public float b0;
    public final n2.u c;
    public final float[] c0;
    public b5 d;
    public final RectF d0;
    public t0 e;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout f;
    public vg.f h;
    public b5 n;
    public final WeakHashMap r;
    public boolean s;
    public final Paint w;
    public final Paint x;
    public boolean y;

    public s5(Context context) {
        super(context);
        this.a = 1.0f;
        this.c = new n2.u(this, 7);
        this.r = new WeakHashMap();
        this.w = new Paint(1);
        Paint paint = new Paint();
        this.x = paint;
        this.N = new e2.f(null);
        this.O = new RectF();
        this.P = new RectF();
        this.Q = new RectF();
        this.R = new RectF();
        this.S = new RectF();
        this.T = new float[8];
        this.U = new Path();
        this.V = new ArrayList();
        this.c0 = new float[2];
        this.d0 = new RectF();
        setWillNotDraw(false);
        setClipChildren(false);
        setVisibility(8);
        paint.setColor(-16777216);
    }

    public static float d(float f7, float f10, float f11) {
        float l4 = Utilities.l((f11 - f7) / (f10 - f7));
        return c3.i0.D(l4, 2.0f, 3.0f, l4 * l4);
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

    private float getAnimatorDurationScale() {
        if (Build.VERSION.SDK_INT >= 33) {
            return ValueAnimator.getDurationScale();
        }
        try {
            return Settings.Global.getFloat(getContext().getContentResolver(), "animator_duration_scale", 1.0f);
        } catch (Exception unused) {
            return 1.0f;
        }
    }

    private void setAnimating(boolean z10) {
        if (this.M == z10) {
            return;
        }
        this.M = z10;
        e2.f fVar = this.N;
        if (z10) {
            fVar.d();
        } else {
            fVar.e();
        }
    }

    public final void a(boolean z10) {
        boolean z11 = this.y;
        if (z11 || this.M) {
            if (z11) {
                this.y = false;
                if (z10 && isAttachedToWindow() && isLaidOut()) {
                    f();
                    return;
                }
            }
            c();
        }
    }

    public final void b() {
        b5 b5Var = this.d;
        if (b5Var == null) {
            return;
        }
        t0 t0Var = this.e;
        RectF rectF = this.O;
        this.D = b5Var.a(t0Var, rectF);
        View menuHostView = this.d.getMenuHostView();
        RectF rectF2 = this.d0;
        boolean c10 = zg.h.c(menuHostView, this, rectF2);
        float[] fArr = this.c0;
        if (c10) {
            fArr[0] = rectF2.left;
            fArr[1] = rectF2.top;
        } else {
            fArr[1] = 0.0f;
            fArr[0] = 0.0f;
        }
        rectF.offset(fArr[0], fArr[1]);
    }

    public final void c() {
        ArrayList arrayList;
        vg.f fVar = this.h;
        if (fVar != null) {
            fVar.a.setEmpty();
        }
        setAnimating(false);
        this.y = false;
        this.L = 0.0f;
        this.K = 0.0f;
        this.J = 0.0f;
        clearFocus();
        setVisibility(8);
        int i10 = 0;
        while (true) {
            arrayList = this.V;
            if (i10 >= arrayList.size()) {
                break;
            }
            r5 r5Var = (r5) arrayList.get(i10);
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = r5Var.a;
            actionBarPopupWindow$ActionBarPopupWindowLayout.setBackground(r5Var.b);
            Drawable drawable = r5Var.c;
            actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundDrawable(drawable);
            if (drawable != null) {
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundColor(r5Var.d);
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout.setPadding(r5Var.e, r5Var.f, r5Var.g, r5Var.h);
            i10++;
        }
        arrayList.clear();
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = this.f;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout2 != null && actionBarPopupWindow$ActionBarPopupWindowLayout2.getSwipeBack() != null) {
            this.f.getSwipeBack().setForegroundOnGlass(false);
        }
        t0 t0Var = this.e;
        b5 b5Var = this.d;
        this.e = null;
        this.d = null;
        if (b5Var != null) {
            b5Var.d(null, null);
        }
        if (t0Var != null) {
            t0Var.getIconView().setAlpha(1.0f);
            q0 q0Var = t0Var.Q;
            if (q0Var != null) {
                q0Var.a();
            }
        }
        Runnable runnable = this.G;
        if (runnable != null) {
            this.G = null;
            runnable.run();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        char c10;
        RectF rectF;
        float f10;
        float f11;
        char c11;
        if (this.d == null || this.f == null) {
            return;
        }
        if (this.M) {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            if (this.H == 0) {
                this.H = currentAnimationTimeMillis;
            }
            float animatorDurationScale = getAnimatorDurationScale();
            float f12 = animatorDurationScale <= 0.0f ? 10.0f : ((currentAnimationTimeMillis - this.H) / 1000.0f) / animatorDurationScale;
            float f13 = this.I;
            if (this.y) {
                this.L = 0.0f;
                this.J = f12 > 0.7f ? 1.0f : ((1.0f - f13) * ((float) e(f12, 0.78d, 0.3d))) + f13;
                this.K = f12 > 0.7f ? 1.0f : ((1.0f - f13) * ((float) e(f12 - 0.02d, 0.8d, 0.34d))) + f13;
                if (f12 > 0.7f) {
                    setAnimating(false);
                }
            } else {
                float l4 = Utilities.l(f12 / 0.2f);
                float l10 = Utilities.l(f12 / 0.17f);
                this.J = (1.0f - ((3.0f - (l10 * 2.0f)) * (l10 * l10))) * f13;
                this.K = (1.0f - ((3.0f - (l4 * 2.0f)) * (l4 * l4))) * f13;
                float f14 = f12 - 0.2f;
                this.L = (f14 <= 0.0f || !this.D) ? 0.0f : f13 * 0.07f * ((float) Math.exp((-f14) / 0.11f)) * ((float) Math.sin((f14 * 6.283185307179586d) / 0.17000000178813934d));
                if (!this.D ? f14 >= 0.0f : f14 > 0.45f) {
                    this.L = 0.0f;
                    post(new lg.s(this, 28));
                }
            }
            float f15 = this.b0;
            float f16 = f15 == 0.0f ? 0.0f : f12 - f15;
            if (f16 > 0.001f) {
                this.a0 = (this.K - this.W) / f16;
            } else if (f15 == 0.0f) {
                this.a0 = 0.0f;
            }
            this.W = this.K;
            this.b0 = Math.max(f12, 1.0E-4f);
        }
        b();
        float backScaleX = this.f.getBackScaleX() * this.f.getMeasuredWidth();
        float backScaleY = this.f.getBackScaleY() * this.f.getMeasuredHeight();
        yf0 swipeBack = this.f.getSwipeBack();
        RectF rectF2 = this.P;
        if (swipeBack == null || !(swipeBack.Q || this.f.c)) {
            rectF2.set(this.f.getLeft(), this.f.getTop(), this.f.getLeft() + backScaleX, this.f.getTop() + backScaleY);
        } else {
            rectF2.set(this.f.getRight() - backScaleX, this.f.getTop(), this.f.getRight(), this.f.getTop() + backScaleY);
        }
        float f17 = this.J;
        float f18 = this.K;
        float l11 = Utilities.l(Math.max(f17, f18));
        RectF rectF3 = this.O;
        float T1 = org.telegram.messenger.i0.T1(rectF3.left, rectF2.left, f17);
        float T12 = org.telegram.messenger.i0.T1(rectF3.top, rectF2.top, f18);
        float T13 = org.telegram.messenger.i0.T1(rectF3.right, rectF2.right, f17);
        float T14 = org.telegram.messenger.i0.T1(rectF3.bottom, rectF2.bottom, f18);
        RectF rectF4 = this.Q;
        rectF4.set(T1, T12, T13, T14);
        if (this.L != 0.0f) {
            float centerX = rectF4.centerX();
            float centerY = rectF4.centerY();
            float C = c3.i0.C(this.L, 0.5f, 1.0f, rectF4.width() / 2.0f);
            f7 = 2.0f;
            float height = (1.0f - this.L) * (rectF4.height() / 2.0f);
            rectF4.set(centerX - C, centerY - height, centerX + C, centerY + height);
        } else {
            f7 = 2.0f;
        }
        float min = Math.min(Math.min(rectF4.height(), rectF4.width()) / f7, org.telegram.messenger.i0.T1(rectF3.height() / f7, org.telegram.messenger.i0.L(22.0f), Utilities.l(f18)));
        float l12 = this.s ? Utilities.l(this.a0 / 9.0f) * org.telegram.messenger.i0.L(5.0f) * 0.75f : 0.0f;
        float f19 = min + l12;
        float[] fArr = this.T;
        fArr[3] = f19;
        fArr[2] = f19;
        fArr[1] = f19;
        fArr[0] = f19;
        fArr[7] = min;
        fArr[6] = min;
        fArr[5] = min;
        fArr[4] = min;
        float f20 = rectF4.left;
        float f21 = rectF4.top - l12;
        float f22 = rectF4.right;
        float f23 = rectF4.bottom;
        RectF rectF5 = this.S;
        rectF5.set(f20, f21, f22, f23);
        Paint paint = this.x;
        paint.setAlpha((int) (26.0f * l11));
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
        int L = org.telegram.messenger.i0.L(6.0f);
        float l13 = this.D ? 1.0f : Utilities.l(l11 / 0.25f);
        vg.f fVar = this.h;
        Path path = this.U;
        RectF rectF6 = this.R;
        if (fVar != null) {
            float l14 = this.D ? Utilities.l(l11) : 1.0f;
            this.a = l14;
            this.d.setMenuGlassFrostedProgress(l14);
            this.h.updateColors();
            vg.f fVar2 = this.h;
            float g10 = g(this.d.getButtonsGlassColorProvider(), true);
            n2.u uVar = this.c;
            c10 = 1;
            float T15 = org.telegram.messenger.i0.T1(g10, g(uVar, true), this.a);
            float T16 = org.telegram.messenger.i0.T1(g(this.d.getButtonsGlassColorProvider(), false), g(uVar, false), this.a);
            vg.e eVar = fVar2.M;
            eVar.i = T15;
            eVar.j = T16;
            fVar2.L = null;
            if (l12 > 0.0f) {
                this.h.s(f19, f19, min, min, false);
            } else {
                this.h.q(min);
            }
            this.h.setBounds(Math.round(rectF5.left) - L, Math.round(rectF5.top) - L, Math.round(rectF5.right) + L, Math.round(rectF5.bottom) + L);
            rectF6.set(this.f.getLeft(), this.f.getTop(), this.f.getRight(), this.f.getBottom());
            rectF6.union(rectF3);
            float max = (Math.max(rectF6.width(), rectF6.height()) * 0.04f) + org.telegram.messenger.i0.L(4.0f);
            rectF = rectF2;
            this.h.a.set((int) Math.floor(rectF6.left - max), (int) Math.floor(rectF6.top - max), (int) Math.ceil(rectF6.right + max), (int) Math.ceil(rectF6.bottom + max));
            this.h.setAlpha((int) (l13 * 255.0f));
            this.h.draw(canvas);
        } else {
            float f24 = l13;
            c10 = 1;
            rectF = rectF2;
            int w02 = t6.w0(t6.G8, this.d.getMenuResourcesProvider());
            Paint paint2 = this.w;
            paint2.setColor(w02);
            paint2.setAlpha((int) (paint2.getAlpha() * f24));
            path.rewind();
            path.addRoundRect(rectF5, fArr, Path.Direction.CW);
            canvas.drawPath(path, paint2);
        }
        canvas.save();
        path.rewind();
        path.addRoundRect(rectF5, fArr, Path.Direction.CW);
        canvas.clipPath(path);
        float l15 = 1.0f - Utilities.l(l11 / (this.y ? 0.3f : 0.7f));
        View menuView = this.D ? this.d.getMenuView() : this.e.getIconView();
        if (l15 <= 0.004f || menuView == null) {
            f10 = 0.004f;
            f11 = 0.25f;
        } else {
            RectF rectF7 = this.d0;
            boolean c12 = zg.h.c(menuView, this, rectF7);
            float[] fArr2 = this.c0;
            if (c12) {
                c11 = 0;
                fArr2[0] = rectF7.left;
                fArr2[c10] = rectF7.top;
            } else {
                c11 = 0;
                fArr2[c10] = 0.0f;
                fArr2[0] = 0.0f;
            }
            float f25 = fArr2[c11];
            rectF6.set(f25, fArr2[c10], menuView.getWidth() + f25, fArr2[c10] + menuView.getHeight());
            float l16 = 1.0f - (Utilities.l(l11 / 0.3f) * 0.15f);
            f10 = 0.004f;
            f11 = 0.25f;
            canvas.saveLayerAlpha(rectF6.left, rectF6.top, rectF6.right, rectF6.bottom, (int) (l15 * 255.0f));
            float f26 = this.L;
            canvas.scale(c3.i0.C(f26, 0.5f, 1.0f, l16), (1.0f - f26) * l16, rectF6.centerX(), rectF6.centerY());
            canvas.translate(rectF6.left, rectF6.top);
            menuView.draw(canvas);
            canvas.restore();
        }
        float d = this.s ? this.y ? d(0.15f, 0.6f, l11) : d(0.6f, 1.0f, l11) : this.y ? d(f11, 0.75f, l11) : d(0.5f, 0.95f, l11);
        if (d <= f10 || !this.s) {
            float f27 = d;
            RectF rectF8 = rectF;
            if (d > f10) {
                float max2 = Math.max(0.3f, rectF4.width() / Math.max(1.0f, rectF8.width()));
                canvas.saveLayerAlpha(rectF4.left, rectF4.top, rectF4.right, rectF4.bottom, (int) (f27 * 255.0f));
                canvas.translate(rectF4.right - rectF8.right, rectF4.top - rectF8.top);
                canvas.scale(max2, max2, rectF8.right, rectF8.top);
                super.dispatchDraw(canvas);
                canvas.restore();
            }
        } else {
            float centerX2 = rectF4.centerX() - rectF.centerX();
            float f28 = rectF4.top - rectF.top;
            if (Math.abs(this.a0) < 0.6f) {
                centerX2 = Math.round(centerX2);
                f28 = Math.round(f28);
            }
            canvas.saveLayerAlpha(rectF5.left, rectF5.top, rectF5.right, rectF5.bottom, (int) (d * 255.0f));
            canvas.translate(centerX2, f28);
            super.dispatchDraw(canvas);
            canvas.restore();
        }
        canvas.restore();
        if (this.M) {
            invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.y || keyEvent.getAction() != 1 || keyEvent.getRepeatCount() != 0 || (keyEvent.getKeyCode() != 82 && keyEvent.getKeyCode() != 4)) {
            return super.dispatchKeyEvent(keyEvent);
        }
        a(true);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0031, code lost:
    
        if (r7.O.contains(r8.getX(), r8.getY()) != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0044, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0045, code lost:
    
        r7.E = r1;
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
    
        if (r7.P.contains(r8.getX(), r8.getY()) == false) goto L17;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z10 = false;
        if (!this.y) {
            return false;
        }
        if (motionEvent.getActionMasked() == 0) {
            ViewParent parent = getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (SystemClock.uptimeMillis() - this.F < 300) {
            }
        }
        if (this.E) {
            return true;
        }
        super.dispatchTouchEvent(motionEvent);
        return true;
    }

    public final void f() {
        this.I = Math.max(this.J, this.K);
        this.W = this.K;
        this.b0 = 0.0f;
        this.H = 0L;
        setAnimating(true);
        invalidate();
    }

    public final float g(wg.a aVar, boolean z10) {
        if (aVar == this.c) {
            b5 b5Var = this.d;
            aVar = b5Var != null ? b5Var.getMenuGlassColorProvider() : null;
        }
        if (!(aVar instanceof wg.d)) {
            return org.telegram.messenger.i0.N(z10 ? 1.0f : 0.6666667f);
        }
        wg.d dVar = (wg.d) aVar;
        return z10 ? dVar.f : dVar.h;
    }

    public t0 getItem() {
        return this.e;
    }

    public final void h(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int i10) {
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.V;
            if (i11 >= arrayList.size()) {
                arrayList.add(new r5(actionBarPopupWindow$ActionBarPopupWindowLayout));
                break;
            } else if (((r5) arrayList.get(i11)).a == actionBarPopupWindow$ActionBarPopupWindowLayout) {
                break;
            } else {
                i11++;
            }
        }
        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackground(null);
        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundDrawable(null);
        actionBarPopupWindow$ActionBarPopupWindowLayout.setPadding(0, i10, 0, i10);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.y || this.M) {
            c();
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.f;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout == null || actionBarPopupWindow$ActionBarPopupWindowLayout.getParent() != this) {
            return;
        }
        b();
        int measuredWidth = this.f.getMeasuredWidth();
        int measuredHeight = this.f.getMeasuredHeight();
        boolean z11 = this.s;
        RectF rectF = this.O;
        if (z11) {
            int max = (int) Math.max(org.telegram.messenger.i0.L(8.0f), Math.min(org.telegram.messenger.m5.z(8.0f, getWidth(), measuredWidth), rectF.centerX() - (measuredWidth / 2.0f)));
            int i14 = (int) rectF.bottom;
            this.f.layout(max, i14 - measuredHeight, measuredWidth + max, i14);
        } else {
            int i15 = (int) rectF.right;
            int i16 = (int) rectF.top;
            int max2 = Math.max(org.telegram.messenger.i0.L(8.0f), i15 - measuredWidth);
            this.f.layout(max2, i16, measuredWidth + max2, measuredHeight + i16);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        float L;
        int i12;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        setMeasuredDimension(size, size2);
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.f;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout == null || actionBarPopupWindow$ActionBarPopupWindowLayout.getParent() != this) {
            return;
        }
        b();
        boolean z10 = this.s;
        RectF rectF = this.O;
        if (z10) {
            L = rectF.bottom - org.telegram.messenger.i0.m;
            i12 = org.telegram.messenger.i0.L(16.0f);
        } else {
            L = (size2 - rectF.top) - org.telegram.messenger.i0.L(16.0f);
            i12 = org.telegram.messenger.i0.n;
        }
        this.f.measure(z20.c(16.0f, size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(Math.max(org.telegram.messenger.i0.L(48.0f), (int) (L - i12)), TLObject.FLAG_31));
    }

    public void setOnClosed(Runnable runnable) {
        this.G = runnable;
    }
}
