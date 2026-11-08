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
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.ve0;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class i5 extends FrameLayout {
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
    public final h2.f N;
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
    public ve0 b;
    public float b0;
    public final g6.d0 c;
    public final float[] c0;
    public s4 d;
    public final RectF d0;
    public r0 e;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout f;
    public fh.g h;
    public s4 n;
    public final WeakHashMap r;
    public boolean s;
    public final Paint w;
    public final Paint x;
    public boolean y;

    public i5(Context context) {
        super(context);
        this.a = 1.0f;
        this.c = new g6.d0(this, 28);
        this.r = new WeakHashMap();
        this.w = new Paint(1);
        Paint paint = new Paint();
        this.x = paint;
        this.N = new h2.f((int[]) null);
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

    public static void d(Canvas canvas, float f10, float f11, float f12, float f13, float f14) {
        if (f14 >= 1.0f) {
            canvas.save();
        } else {
            canvas.saveLayerAlpha(f10, f11, f12, f13, (int) (f14 * 255.0f));
        }
    }

    public static float e(float f10, float f11, float f12) {
        float l10 = Utilities.l((f12 - f10) / (f11 - f10));
        return com.google.android.recaptcha.internal.a.C(l10, 2.0f, 3.0f, l10 * l10);
    }

    public static double f(double d, double d2, double d10) {
        if (d <= 0.0d) {
            return 0.0d;
        }
        double d11 = 6.283185307179586d / d10;
        double d12 = 1.0d - (d2 * d2);
        double sqrt = Math.sqrt(d12) * d11;
        double d13 = sqrt * d;
        return 1.0d - (((Math.sin(d13) * (d2 / Math.sqrt(d12))) + Math.cos(d13)) * Math.exp(((-d2) * d11) * d));
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

    private int getContentTop() {
        int i7 = (int) this.O.top;
        return Math.max(Math.min(i7, 0), i7 - this.d.getMenuRise());
    }

    private void setAnimating(boolean z9) {
        if (this.M == z9) {
            return;
        }
        this.M = z9;
        h2.f fVar = this.N;
        if (z9) {
            fVar.d();
        } else {
            fVar.e();
        }
    }

    public final void a(boolean z9) {
        boolean z10 = this.y;
        if (z10 || this.M) {
            if (z10) {
                this.y = false;
                if (z9 && isAttachedToWindow() && isLaidOut()) {
                    g();
                    return;
                }
            }
            c();
        }
    }

    public final void b() {
        s4 s4Var = this.d;
        if (s4Var == null) {
            return;
        }
        r0 r0Var = this.e;
        RectF rectF = this.O;
        this.D = s4Var.a(r0Var, rectF);
        View menuHostView = this.d.getMenuHostView();
        RectF rectF2 = this.d0;
        boolean c10 = jh.k.c(menuHostView, this, rectF2);
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
        fh.g gVar = this.h;
        if (gVar != null) {
            gVar.a.setEmpty();
        }
        setAnimating(false);
        this.y = false;
        this.L = 0.0f;
        this.K = 0.0f;
        this.J = 0.0f;
        clearFocus();
        setVisibility(8);
        int i7 = 0;
        while (true) {
            arrayList = this.V;
            if (i7 >= arrayList.size()) {
                break;
            }
            h5 h5Var = (h5) arrayList.get(i7);
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = h5Var.a;
            actionBarPopupWindow$ActionBarPopupWindowLayout.setBackground(h5Var.b);
            Drawable drawable = h5Var.c;
            actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundDrawable(drawable);
            if (drawable != null) {
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundColor(h5Var.d);
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout.setPadding(h5Var.e, h5Var.f, h5Var.g, h5Var.h);
            i7++;
        }
        arrayList.clear();
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = this.f;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout2 != null && actionBarPopupWindow$ActionBarPopupWindowLayout2.getSwipeBack() != null) {
            this.f.getSwipeBack().setForegroundOnGlass(false);
        }
        r0 r0Var = this.e;
        s4 s4Var = this.d;
        this.e = null;
        this.d = null;
        if (s4Var != null) {
            s4Var.d(null, null);
        }
        if (r0Var != null) {
            r0Var.getIconView().setAlpha(1.0f);
            o0 o0Var = r0Var.Q;
            if (o0Var != null) {
                o0Var.i();
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
        float f10;
        char c10;
        RectF rectF;
        float f11;
        float f12;
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
            float f13 = animatorDurationScale <= 0.0f ? 10.0f : ((currentAnimationTimeMillis - this.H) / 1000.0f) / animatorDurationScale;
            float f14 = this.I;
            if (this.y) {
                this.L = 0.0f;
                this.J = f13 > 0.7f ? 1.0f : ((1.0f - f14) * ((float) f(f13, 0.78d, 0.3d))) + f14;
                this.K = f13 > 0.7f ? 1.0f : ((1.0f - f14) * ((float) f(f13 - 0.02d, 0.8d, 0.34d))) + f14;
                if (f13 > 0.7f) {
                    setAnimating(false);
                }
            } else {
                float l10 = Utilities.l(f13 / 0.2f);
                float l11 = Utilities.l(f13 / 0.17f);
                this.J = (1.0f - ((3.0f - (l11 * 2.0f)) * (l11 * l11))) * f14;
                this.K = (1.0f - ((3.0f - (l10 * 2.0f)) * (l10 * l10))) * f14;
                float f15 = f13 - 0.2f;
                this.L = (f15 <= 0.0f || !this.D) ? 0.0f : f14 * 0.07f * ((float) Math.exp((-f15) / 0.11f)) * ((float) Math.sin((f15 * 6.283185307179586d) / 0.17000000178813934d));
                if (!this.D ? f15 >= 0.0f : f15 > 0.45f) {
                    this.L = 0.0f;
                    post(new l2.w(this, 29));
                }
            }
            float f16 = this.b0;
            float f17 = f16 == 0.0f ? 0.0f : f13 - f16;
            if (f17 > 0.001f) {
                this.a0 = (this.K - this.W) / f17;
            } else if (f16 == 0.0f) {
                this.a0 = 0.0f;
            }
            this.W = this.K;
            this.b0 = Math.max(f13, 1.0E-4f);
        }
        b();
        float backScaleX = this.f.getBackScaleX() * this.f.getMeasuredWidth();
        float backScaleY = this.f.getBackScaleY() * this.f.getMeasuredHeight();
        ve0 swipeBack = this.f.getSwipeBack();
        RectF rectF2 = this.P;
        if (swipeBack == null || !(swipeBack.Q || this.f.c)) {
            rectF2.set(this.f.getLeft(), this.f.getTop(), this.f.getLeft() + backScaleX, this.f.getTop() + backScaleY);
        } else {
            rectF2.set(this.f.getRight() - backScaleX, this.f.getTop(), this.f.getRight(), this.f.getTop() + backScaleY);
        }
        float f18 = this.J;
        float f19 = this.K;
        float l12 = Utilities.l(Math.max(f18, f19));
        RectF rectF3 = this.O;
        float T1 = org.telegram.messenger.g0.T1(rectF3.left, rectF2.left, f18);
        float T12 = org.telegram.messenger.g0.T1(rectF3.top, rectF2.top, f19);
        float T13 = org.telegram.messenger.g0.T1(rectF3.right, rectF2.right, f18);
        float T14 = org.telegram.messenger.g0.T1(rectF3.bottom, rectF2.bottom, f19);
        RectF rectF4 = this.Q;
        rectF4.set(T1, T12, T13, T14);
        if (this.L != 0.0f) {
            float centerX = rectF4.centerX();
            float centerY = rectF4.centerY();
            float B = com.google.android.recaptcha.internal.a.B(this.L, 0.5f, 1.0f, rectF4.width() / 2.0f);
            f10 = 2.0f;
            float height = (1.0f - this.L) * (rectF4.height() / 2.0f);
            rectF4.set(centerX - B, centerY - height, centerX + B, centerY + height);
        } else {
            f10 = 2.0f;
        }
        float min = Math.min(Math.min(rectF4.height(), rectF4.width()) / f10, org.telegram.messenger.g0.T1(rectF3.height() / f10, org.telegram.messenger.g0.L(22.0f), Utilities.l(f19)));
        float l13 = this.s ? Utilities.l(this.a0 / 9.0f) * org.telegram.messenger.g0.L(5.0f) * 0.75f : 0.0f;
        float f20 = min + l13;
        float[] fArr = this.T;
        fArr[3] = f20;
        fArr[2] = f20;
        fArr[1] = f20;
        fArr[0] = f20;
        fArr[7] = min;
        fArr[6] = min;
        fArr[5] = min;
        fArr[4] = min;
        float f21 = rectF4.left;
        float f22 = rectF4.top - l13;
        float f23 = rectF4.right;
        float f24 = rectF4.bottom;
        RectF rectF5 = this.S;
        rectF5.set(f21, f22, f23, f24);
        Paint paint = this.x;
        paint.setAlpha((int) (26.0f * l12));
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
        int L = org.telegram.messenger.g0.L(6.0f);
        float l14 = this.D ? 1.0f : Utilities.l(l12 / 0.25f);
        fh.g gVar = this.h;
        Path path = this.U;
        RectF rectF6 = this.R;
        if (gVar != null) {
            float l15 = this.D ? Utilities.l(l12) : 1.0f;
            this.a = l15;
            this.d.setMenuGlassFrostedProgress(l15);
            this.h.updateColors();
            fh.g gVar2 = this.h;
            float h = h(this.d.getButtonsGlassColorProvider(), true);
            g6.d0 d0Var = this.c;
            c10 = 1;
            float T15 = org.telegram.messenger.g0.T1(h, h(d0Var, true), this.a);
            float T16 = org.telegram.messenger.g0.T1(h(this.d.getButtonsGlassColorProvider(), false), h(d0Var, false), this.a);
            fh.f fVar = gVar2.Q;
            fVar.i = T15;
            fVar.j = T16;
            gVar2.O = null;
            if (l13 > 0.0f) {
                this.h.t(f20, f20, min, min, false);
            } else {
                this.h.r(min);
            }
            this.h.setBounds(Math.round(rectF5.left) - L, Math.round(rectF5.top) - L, Math.round(rectF5.right) + L, Math.round(rectF5.bottom) + L);
            rectF6.set(this.f.getLeft(), this.f.getTop(), this.f.getRight(), this.f.getBottom());
            rectF6.union(rectF3);
            float max = (Math.max(rectF6.width(), rectF6.height()) * 0.04f) + org.telegram.messenger.g0.L(4.0f);
            rectF = rectF2;
            this.h.a.set((int) Math.floor(rectF6.left - max), (int) Math.floor(rectF6.top - max), (int) Math.ceil(rectF6.right + max), (int) Math.ceil(rectF6.bottom + max));
            this.h.setAlpha((int) (255.0f * l14));
            this.h.draw(canvas);
        } else {
            float f25 = l14;
            c10 = 1;
            rectF = rectF2;
            int w02 = k6.w0(k6.G8, this.d.getMenuResourcesProvider());
            Paint paint2 = this.w;
            paint2.setColor(w02);
            paint2.setAlpha((int) (paint2.getAlpha() * f25));
            path.rewind();
            path.addRoundRect(rectF5, fArr, Path.Direction.CW);
            canvas.drawPath(path, paint2);
        }
        canvas.save();
        path.rewind();
        path.addRoundRect(rectF5, fArr, Path.Direction.CW);
        canvas.clipPath(path);
        float l16 = 1.0f - Utilities.l(l12 / (this.y ? 0.3f : 0.7f));
        View menuView = this.D ? this.d.getMenuView() : this.e.getIconView();
        if (l16 <= 0.004f || menuView == null) {
            f11 = 0.004f;
            f12 = 0.25f;
        } else {
            RectF rectF7 = this.d0;
            boolean c12 = jh.k.c(menuView, this, rectF7);
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
            float f26 = fArr2[c11];
            rectF6.set(f26, fArr2[c10], menuView.getWidth() + f26, fArr2[c10] + menuView.getHeight());
            float l17 = 1.0f - (Utilities.l(l12 / 0.3f) * 0.15f);
            f11 = 0.004f;
            f12 = 0.25f;
            d(canvas, rectF6.left, rectF6.top, rectF6.right, rectF6.bottom, l16);
            float f27 = this.L;
            canvas.scale(com.google.android.recaptcha.internal.a.B(f27, 0.5f, 1.0f, l17), (1.0f - f27) * l17, rectF6.centerX(), rectF6.centerY());
            canvas.translate(rectF6.left, rectF6.top);
            menuView.draw(canvas);
            canvas.restore();
        }
        float e10 = this.s ? this.y ? e(0.15f, 0.6f, l12) : e(0.6f, 1.0f, l12) : this.y ? e(f12, 0.75f, l12) : e(0.5f, 0.95f, l12);
        if (e10 <= f11 || !this.s) {
            RectF rectF8 = rectF;
            if (e10 > f11) {
                float max2 = Math.max(0.3f, rectF4.width() / Math.max(1.0f, rectF8.width()));
                d(canvas, rectF4.left, rectF4.top, rectF4.right, rectF4.bottom, e10);
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
            d(canvas, rectF5.left, rectF5.top, rectF5.right, rectF5.bottom, e10);
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
        boolean z9 = false;
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

    public final void g() {
        this.I = Math.max(this.J, this.K);
        this.W = this.K;
        this.b0 = 0.0f;
        this.H = 0L;
        setAnimating(true);
        invalidate();
    }

    public r0 getItem() {
        return this.e;
    }

    public final float h(gh.a aVar, boolean z9) {
        if (aVar == this.c) {
            s4 s4Var = this.d;
            aVar = s4Var != null ? s4Var.getMenuGlassColorProvider() : null;
        }
        if (!(aVar instanceof gh.e)) {
            return org.telegram.messenger.g0.N(z9 ? 1.0f : 0.6666667f);
        }
        gh.e eVar = (gh.e) aVar;
        return z9 ? eVar.f : eVar.h;
    }

    public final void i(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int i7) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.V;
            if (i10 >= arrayList.size()) {
                arrayList.add(new h5(actionBarPopupWindow$ActionBarPopupWindowLayout));
                break;
            } else if (((h5) arrayList.get(i10)).a == actionBarPopupWindow$ActionBarPopupWindowLayout) {
                break;
            } else {
                i10++;
            }
        }
        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackground(null);
        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundDrawable(null);
        actionBarPopupWindow$ActionBarPopupWindowLayout.setPadding(0, i7, 0, i7);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.y || this.M) {
            c();
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.f;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout == null || actionBarPopupWindow$ActionBarPopupWindowLayout.getParent() != this) {
            return;
        }
        b();
        int measuredWidth = this.f.getMeasuredWidth();
        int measuredHeight = this.f.getMeasuredHeight();
        boolean z10 = this.s;
        RectF rectF = this.O;
        if (z10) {
            int max = (int) Math.max(org.telegram.messenger.g0.L(8.0f), Math.min(org.telegram.messenger.k5.z(8.0f, getWidth(), measuredWidth), rectF.centerX() - (measuredWidth / 2.0f)));
            int i13 = (int) rectF.bottom;
            this.f.layout(max, i13 - measuredHeight, measuredWidth + max, i13);
        } else {
            int i14 = (int) rectF.right;
            int contentTop = getContentTop();
            int max2 = Math.max(org.telegram.messenger.g0.L(8.0f), i14 - measuredWidth);
            this.f.layout(max2, contentTop, measuredWidth + max2, measuredHeight + contentTop);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i10);
        setMeasuredDimension(size, size2);
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.f;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout == null || actionBarPopupWindow$ActionBarPopupWindowLayout.getParent() != this) {
            return;
        }
        b();
        this.f.measure(org.telegram.messenger.camera.q.c(16.0f, size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(Math.max(org.telegram.messenger.g0.L(48.0f), this.s ? (int) ((this.O.bottom - org.telegram.messenger.g0.m) - org.telegram.messenger.g0.L(16.0f)) : ((size2 - getContentTop()) - org.telegram.messenger.g0.L(16.0f)) - org.telegram.messenger.g0.n), TLObject.FLAG_31));
    }

    public void setOnClosed(Runnable runnable) {
        this.G = runnable;
    }
}
