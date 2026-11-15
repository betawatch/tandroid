package jh;

import ai.a0;
import ai.h2;
import ai.l1;
import ai.n0;
import ai.s0;
import ai.t0;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Build;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.RoundedCorner;
import android.view.View;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import bi.g2;
import bi.o2;
import c8.ja;
import com.google.android.gms.internal.vision.e2;
import java.util.HashSet;
import org.telegram.messenger.g0;
import org.telegram.messenger.k5;
import org.telegram.messenger.ns;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.z5;
import org.telegram.ui.Components.ae;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.wd;
import org.telegram.ui.Components.xe;
import r0.k1;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class f extends FrameLayout implements z5 {
    public float E;
    public float F;
    public float G;
    public int H;
    public final Rect I;
    public final RectF J;
    public dh.d K;
    public float L;
    public float M;
    public int N;
    public float O;
    public boolean P;
    public rh.f a;
    public final o2 b;
    public final FrameLayout c;
    public final g2 d;
    public boolean e;
    public a0 f;
    public fh.g h;
    public fh.g n;
    public final Path r;
    public int s;
    public float w;
    public float x;
    public boolean y;

    public f(Context context) {
        super(context);
        this.e = true;
        this.r = new Path();
        this.I = new Rect();
        this.J = new RectF();
        this.N = ns.e4;
        this.O = 1.0f;
        FrameLayout frameLayout = new FrameLayout(context);
        this.c = frameLayout;
        addView(frameLayout, ja.e(-1, -2, 80));
        g2 g2Var = new g2(8, context, this);
        this.d = g2Var;
        addView(g2Var, ja.e(-1, -2, 80));
        this.b = new o2(6, context, this);
    }

    public final void a(boolean z10) {
        e();
        int round = Math.round(this.w) + g0.L(9.0f) + this.H;
        if (this.s != round || z10) {
            this.s = round;
            int L = g0.L(29.0f);
            float measuredHeight = getMeasuredHeight() - this.x;
            float measuredWidth = getMeasuredWidth();
            float measuredHeight2 = getMeasuredHeight();
            RectF rectF = this.J;
            rectF.set(0.0f, measuredHeight, measuredWidth, measuredHeight2);
            Path path = this.r;
            path.rewind();
            float f10 = L;
            path.addRoundRect(rectF, new float[]{f10, f10, f10, f10, 0.0f, 0.0f, 0.0f, 0.0f}, Path.Direction.CW);
            path.close();
            invalidate();
        }
    }

    public final void b() {
        int i7;
        int measuredHeight;
        dh.d dVar = this.K;
        if (dVar == null || (i7 = dVar.getBounds().top) == (measuredHeight = getMeasuredHeight() - Math.round(this.L))) {
            return;
        }
        this.K.setBounds(0, measuredHeight, getMeasuredWidth(), getMeasuredHeight());
        this.b.invalidate(0, Math.max(0, Math.min(i7, measuredHeight)), getMeasuredWidth(), getMeasuredHeight());
        invalidate(0, Math.max(0, Math.min(i7, measuredHeight)), getMeasuredWidth(), getMeasuredHeight());
    }

    public final void c() {
        k1 k1Var = ((rh.h) this.a).r;
        int i7 = k1Var != null ? k1Var.a.f(2).d : 0;
        float c10 = ((rh.h) this.a).c();
        g2 g2Var = this.d;
        int childCount = g2Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            KeyEvent.Callback childAt = g2Var.getChildAt(i10);
            if (childAt instanceof rh.a) {
                rh.a aVar = (rh.a) childAt;
                aVar.b(i7);
                aVar.c(c10);
            }
        }
    }

    public final void d() {
        int i7;
        WindowInsets rootWindowInsets;
        this.w = ((rh.h) this.a).d();
        this.x = ((rh.h) this.a).c();
        int i10 = 0;
        this.y = ((rh.h) this.a).s != 1;
        g2 g2Var = this.d;
        boolean z10 = g2Var.getVisibility() == 0;
        boolean z11 = this.y;
        if (z10 != z11) {
            g2Var.setVisibility(z11 ? 0 : 8);
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) g2Var.getLayoutParams();
        int i11 = layoutParams.height;
        int i12 = ((rh.h) this.a).x;
        if (i11 != i12) {
            layoutParams.height = i12;
            requestLayout();
        }
        a(false);
        c();
        if (this.n != null) {
            if (Build.VERSION.SDK_INT < 31 || (rootWindowInsets = getRootWindowInsets()) == null) {
                i7 = 0;
            } else {
                RoundedCorner roundedCorner = rootWindowInsets.getRoundedCorner(3);
                RoundedCorner roundedCorner2 = rootWindowInsets.getRoundedCorner(2);
                i7 = roundedCorner == null ? 0 : roundedCorner.getRadius();
                if (roundedCorner2 != null) {
                    i10 = roundedCorner2.getRadius();
                }
            }
            this.n.t(g0.L(29.0f), g0.L(29.0f), i10, i7, true);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02af  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        n0 n0Var;
        float d;
        int[] iArr;
        float f10;
        boolean z11;
        float f11;
        float interpolation;
        wd wdVar;
        e6 e6Var;
        xe xeVar;
        int i7;
        float f12;
        this.n.setBounds(0, getMeasuredHeight() - ((int) this.x), getMeasuredWidth(), k5.b(58.0f, getMeasuredHeight() - ((int) this.x), getMeasuredHeight()));
        int measuredHeight = getMeasuredHeight() - this.s;
        int round = Math.round(this.E);
        int measuredWidth = getMeasuredWidth() - Math.round(this.F);
        int i10 = this.H;
        Rect rect = this.I;
        rect.set(round, 0, measuredWidth, i10);
        rect.inset(0, -g0.L(7.0f));
        rect.offset(0, measuredHeight + ((int) this.M));
        this.h.setBounds(rect);
        if (this.e) {
            this.h.draw(canvas);
        }
        a0 a0Var = this.f;
        if (a0Var != null && this.e) {
            Rect rect2 = this.h.R.m;
            n0 n0Var2 = a0Var.b;
            e6 e6Var2 = n0Var2.n;
            RectF rectF = n0Var2.y;
            int[] iArr2 = n0Var2.E;
            RectF rectF2 = n0Var2.Z;
            s0 s0Var = n0Var2.x;
            ae aeVar = n0Var2.f;
            ai.k1 k1Var = n0Var2.w;
            if (k1Var != null && (k1Var.S || k1Var.V.c > 0.0f || k1Var.w0 || k1Var.A0.c > 0.0f)) {
                k1Var.invalidate();
            }
            if (n0Var2.Y != null) {
                boolean z12 = n0Var2.r == 4;
                l1 l1Var = n0Var2.a;
                boolean z13 = l1Var != null && l1Var.d;
                boolean z14 = SystemClock.uptimeMillis() < n0Var2.W;
                long uptimeMillis = SystemClock.uptimeMillis();
                boolean z15 = z14;
                long j3 = n0Var2.b;
                if (j3 <= 0 || uptimeMillis < j3) {
                    z10 = z13;
                    n0Var = n0Var2;
                } else {
                    n0Var = n0Var2;
                    if (n0Var.X || z12) {
                        z10 = z13;
                    } else {
                        float min = Math.min(1.0f, (uptimeMillis - j3) / 580.0f);
                        if (min >= 1.0f) {
                            z10 = z13;
                            n0Var.b = 0L;
                            n0Var.Y.e(true, 0.0f);
                            d = 0.0f;
                        } else {
                            z10 = z13;
                            n0Var.Y.e(true, 1.0f);
                            d = 1.0f - n0.H0.getInterpolation(min);
                        }
                        if (d > 0.0f) {
                            n0Var.d = false;
                            n0Var.x(0.0f, 0.0f);
                            aeVar.d(0.0f, 0);
                        } else {
                            long uptimeMillis2 = SystemClock.uptimeMillis();
                            boolean z16 = z12;
                            float min2 = n0Var.R == 0 ? 0.016f : Math.min(0.05f, (uptimeMillis2 - r0) / 1000.0f);
                            n0Var.R = uptimeMillis2;
                            float f13 = z16 ? 0.55f : n0Var.P;
                            float f14 = n0Var.Q;
                            boolean z17 = z10;
                            float z18 = e2.z(1.0f, (float) Math.exp((-min2) / (f13 > f14 ? 0.12f : 0.4f)), f13 - f14, f14);
                            n0Var.Q = z18;
                            if (n0Var.X && !z16) {
                                float f15 = n0Var.P;
                                if (f15 > 0.3f && f15 > (z18 * 1.5f) + 0.08f && uptimeMillis2 - n0Var.S > 1000) {
                                    n0Var.S = uptimeMillis2;
                                    n0Var.T = (float) (((Math.random() * 3.141592653589793d) * 2.0d) - 3.141592653589793d);
                                }
                            }
                            float f16 = (uptimeMillis2 - n0Var.S) / 1200.0f;
                            float interpolation2 = (f16 < 0.0f || f16 >= 1.0f || z16) ? -1.0f : er.g.getInterpolation(f16);
                            float f17 = n0Var.T;
                            s0Var.C = interpolation2;
                            int[] iArr3 = s0Var.B;
                            s0Var.D = f17;
                            n0Var.c = (f16 < 0.0f || f16 >= 1.0f) ? 0.0f : (float) Math.sin(f16 * 3.141592653589793d);
                            rectF2.set(rect2);
                            if (z16) {
                                h2 h2Var = n0Var.F;
                                iArr = iArr3;
                                float uptimeMillis3 = (SystemClock.uptimeMillis() - n0Var.V) / 1000.0f;
                                Matrix matrix = h2Var.l;
                                if (h2Var.k == null) {
                                    f10 = 0.7f;
                                } else {
                                    f10 = 0.7f;
                                    float sin = (((float) Math.sin((0.23f * uptimeMillis3) + 1.3f)) * 12.0f) + (((float) Math.sin(0.45f * uptimeMillis3)) * 28.0f);
                                    matrix.reset();
                                    matrix.setRotate(sin);
                                    matrix.postTranslate(g0.L(46.0f) * uptimeMillis3, g0.L(10.0f) * ((float) Math.sin(uptimeMillis3 * 0.7f)));
                                    h2Var.k.setLocalMatrix(matrix);
                                }
                                z11 = true;
                            } else {
                                iArr = iArr3;
                                f10 = 0.7f;
                                if (z17) {
                                    l1 l1Var2 = n0Var.a;
                                    if (!l1Var2.d) {
                                        z11 = true;
                                        interpolation = -1.0f;
                                    } else if (l1Var2.e == 0) {
                                        z11 = true;
                                        interpolation = 0.0f;
                                    } else {
                                        interpolation = l1.E.getInterpolation(Math.min(1.0f, (SystemClock.uptimeMillis() - l1Var2.e) / l1Var2.a));
                                        z11 = true;
                                    }
                                    n0Var.d = z11;
                                    f11 = interpolation;
                                } else {
                                    z11 = true;
                                    if (n0Var.d) {
                                        f11 = 1.0f;
                                    }
                                }
                                float e10 = d * n0Var.e.e(false, !n0Var.X ? 1.0f : (z16 || z17 || n0Var.d) ? 0.85f : f10);
                                boolean z19 = z11;
                                n0Var.x.b(Math.min(g0.L(22.0f), rectF2.height() / 2.0f), e10, f11, n0Var.Q, canvas, rectF2);
                                n0Var.x(e10, n0Var.c);
                                wdVar = aeVar.b.R0;
                                if (wdVar == null && wdVar.getVisibility() == 0 && wdVar.getAlpha() > 0.01f && n0Var.j(rectF)) {
                                    wdVar.getLocationInWindow(iArr2);
                                    int a10 = s0Var.a((wdVar.getWidth() / 2.0f) + iArr2[0], (wdVar.getHeight() / 2.0f) + iArr2[z19 ? 1 : 0], rectF);
                                    e6Var = e6Var2;
                                    boolean c10 = s0.c(j6.w0(j6.d6, e6Var));
                                    if (c10) {
                                        i7 = -1;
                                        f12 = 0.4f;
                                    } else {
                                        i7 = iArr[4];
                                        f12 = 0.5f;
                                    }
                                    aeVar.d(e10 * (c10 ? 1.0f : t0.c(11)), i0.a.f(f12, a10, i7));
                                } else {
                                    e6Var = e6Var2;
                                    aeVar.d(0.0f, 0);
                                }
                                Matrix matrix2 = n0Var.y0;
                                xeVar = aeVar.b.F0;
                                if (xeVar != null) {
                                    if (n0Var.r == z19) {
                                        boolean c11 = s0.c(j6.w0(j6.d6, e6Var));
                                        if (n0Var.v0 == null || n0Var.w0 != c11 || n0Var.x0 != s0.R) {
                                            n0Var.w0 = c11;
                                            n0Var.x0 = s0.R;
                                            int w02 = j6.w0(j6.Me, e6Var);
                                            if (c11) {
                                                w02 = s0.d(w02);
                                            }
                                            int i11 = w02 | (-16777216);
                                            int e11 = c11 ? s0.e(-7359233) : i0.a.f(0.55f, iArr[0], iArr[4]);
                                            int e12 = c11 ? s0.e(-7411982) : i0.a.f(0.55f, iArr[z19 ? 1 : 0], iArr[4]);
                                            int e13 = c11 ? s0.e(-4940545) : i0.a.f(0.55f, iArr[2], iArr[4]);
                                            float f18 = c11 ? 0.92f : 0.9f;
                                            if (c11) {
                                                n0Var.v0 = new LinearGradient(0.0f, 0.0f, 1.0f, 0.0f, new int[]{i0.a.f(f18, i11, e11), i0.a.f(f18, i11, e12), i0.a.f(f18, i11, e13), i0.a.f(f18, i11, e11)}, (float[]) null, Shader.TileMode.MIRROR);
                                            } else {
                                                int w03 = j6.w0(j6.Me, e6Var);
                                                int alpha = Color.alpha(w03);
                                                int[] iArr4 = new int[4];
                                                iArr4[0] = e11;
                                                iArr4[z19 ? 1 : 0] = e12;
                                                iArr4[2] = e13;
                                                iArr4[3] = e11;
                                                for (int i12 = 0; i12 < 4; i12++) {
                                                    iArr4[i12] = i0.a.o(i0.a.f(0.12f, w03 | (-16777216), iArr4[i12]), alpha);
                                                }
                                                n0Var.v0 = new LinearGradient(0.0f, 0.0f, 1.0f, 0.0f, iArr4, (float[]) null, Shader.TileMode.MIRROR);
                                            }
                                        }
                                        float L = g0.L(160.0f);
                                        matrix2.setScale(L, 1.0f);
                                        matrix2.postTranslate(((SystemClock.uptimeMillis() % 6000) / 6000.0f) * 2.0f * L, 0.0f);
                                        n0Var.v0.setLocalMatrix(matrix2);
                                        xeVar.m1 = n0Var.v0;
                                        xeVar.invalidate();
                                    } else if (xeVar.m1 != null) {
                                        xeVar.m1 = null;
                                        xeVar.invalidate();
                                    }
                                }
                                n0Var.a0.postInvalidateOnAnimation();
                            }
                            f11 = -1.0f;
                            float e102 = d * n0Var.e.e(false, !n0Var.X ? 1.0f : (z16 || z17 || n0Var.d) ? 0.85f : f10);
                            boolean z192 = z11;
                            n0Var.x.b(Math.min(g0.L(22.0f), rectF2.height() / 2.0f), e102, f11, n0Var.Q, canvas, rectF2);
                            n0Var.x(e102, n0Var.c);
                            wdVar = aeVar.b.R0;
                            if (wdVar == null) {
                            }
                            e6Var = e6Var2;
                            aeVar.d(0.0f, 0);
                            Matrix matrix22 = n0Var.y0;
                            xeVar = aeVar.b.F0;
                            if (xeVar != null) {
                            }
                            n0Var.a0.postInvalidateOnAnimation();
                        }
                    }
                }
                d = n0Var.Y.d(n0Var.X || z12 || z15 || z10 || j3 > 0);
                if (d > 0.0f) {
                }
            }
        }
        if (this.y) {
            this.n.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        boolean z10 = view == this.d;
        if (z10) {
            canvas.save();
            canvas.clipPath(this.n.R.k);
        }
        boolean drawChild = super.drawChild(canvas, view, j3);
        if (z10) {
            canvas.restore();
        }
        return drawChild;
    }

    public final void e() {
        this.c.setTranslationY((-this.w) - g0.L(9.0f));
        this.d.setTranslationY(r0.getMeasuredHeight() - this.x);
    }

    public View getFadeView() {
        return this.b;
    }

    public FrameLayout getInAppKeyboardBubbleContainer() {
        return this.d;
    }

    public float getInputBubbleBottom() {
        return (getMeasuredHeight() - this.w) - g0.L(9.0f);
    }

    public float getInputBubbleHeight() {
        return this.G;
    }

    public float getInputBubbleTop() {
        return getInputBubbleBottom() - getInputBubbleHeight();
    }

    public FrameLayout getInputIslandBubbleContainer() {
        return this.c;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        e();
        c();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        a(true);
        b();
        e();
        c();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        fh.g gVar;
        int action = motionEvent.getAction();
        if (action == 0) {
            int x10 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            fh.g gVar2 = this.h;
            this.P = (gVar2 != null && gVar2.c == 255 && gVar2.getBounds().contains(x10, y10)) || ((gVar = this.n) != null && gVar.getBounds().contains(x10, y10));
        }
        if (action == 1 || action == 3) {
            this.P = false;
        }
        return this.P;
    }

    public void setBackgroundWithFadeDrawable(dh.d dVar) {
        this.K = dVar;
    }

    public void setBlurredBottomHeight(float f10) {
        if (this.L != f10) {
            this.L = f10;
            b();
        }
    }

    public void setInputBubbleAlpha(int i7) {
        this.N = i7;
        fh.g gVar = this.h;
        if (gVar != null) {
            gVar.setAlpha((int) (i7 * this.O));
        }
    }

    public void setInputBubbleExtraAlpha(float f10) {
        if (this.O != f10) {
            this.O = f10;
            fh.g gVar = this.h;
            if (gVar != null) {
                gVar.setAlpha((int) (this.N * f10));
            }
            invalidate();
        }
    }

    public void setInputBubbleHeight(float f10) {
        this.G = f10;
        this.H = Math.round(f10);
        a(false);
    }

    public void setInputBubbleTranslationY(float f10) {
        this.M = f10;
        invalidate();
    }

    public void setInputIslandBubbleDrawable(fh.g gVar) {
        this.h = gVar;
        gVar.q(g0.L(7.0f));
        this.h.r(g0.L(22.0f));
    }

    public void setUnderKeyboardBackgroundDrawable(fh.g gVar) {
        this.n = gVar;
        gVar.T = true;
        gVar.s(g0.L(29.0f), g0.L(29.0f), 0.0f, 0.0f);
        this.n.u(g0.L(32.0f));
        fh.g gVar2 = this.n;
        gVar2.R.g = 0.4f;
        gVar2.n();
    }

    public void setWindowInsetsProvider(rh.f fVar) {
        this.a = fVar;
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        fh.g gVar = this.h;
        if (gVar != null) {
            gVar.updateColors();
        }
        fh.g gVar2 = this.n;
        if (gVar2 != null) {
            gVar2.updateColors();
        }
        invalidate();
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
