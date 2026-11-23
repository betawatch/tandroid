package jh;

import ai.b2;
import ai.i1;
import ai.j1;
import ai.l0;
import ai.q0;
import ai.r0;
import ai.w;
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
import bi.g3;
import bi.o3;
import c8.na;
import com.google.android.gms.internal.vision.e2;
import java.util.HashSet;
import org.telegram.messenger.f3;
import org.telegram.messenger.g0;
import org.telegram.messenger.ks;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.g2;
import org.telegram.ui.Components.ge;
import org.telegram.ui.Components.hf;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.rf;
import r0.l1;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class f extends FrameLayout implements c6 {
    public boolean E;
    public float F;
    public float G;
    public float H;
    public int I;
    public final Rect J;
    public final RectF K;
    public dh.d L;
    public float M;
    public float N;
    public int O;
    public float P;
    public boolean Q;
    public rh.f a;
    public final o3 b;
    public final FrameLayout c;
    public final g3 d;
    public boolean e;
    public w f;
    public g2 h;
    public fh.g n;
    public fh.g r;
    public final Path s;
    public int w;
    public float x;
    public float y;

    public f(Context context) {
        super(context);
        this.e = true;
        this.s = new Path();
        this.J = new Rect();
        this.K = new RectF();
        this.O = ks.e4;
        this.P = 1.0f;
        FrameLayout frameLayout = new FrameLayout(context);
        this.c = frameLayout;
        addView(frameLayout, na.e(-1, -2, 80));
        g3 g3Var = new g3(8, context, this);
        this.d = g3Var;
        addView(g3Var, na.e(-1, -2, 80));
        this.b = new o3(6, context, this);
    }

    public final void a(boolean z10) {
        e();
        int round = Math.round(this.x) + g0.L(9.0f) + this.I;
        if (this.w != round || z10) {
            this.w = round;
            int L = g0.L(29.0f);
            float measuredHeight = getMeasuredHeight() - this.y;
            float measuredWidth = getMeasuredWidth();
            float measuredHeight2 = getMeasuredHeight();
            RectF rectF = this.K;
            rectF.set(0.0f, measuredHeight, measuredWidth, measuredHeight2);
            Path path = this.s;
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
        dh.d dVar = this.L;
        if (dVar == null || (i7 = dVar.getBounds().top) == (measuredHeight = getMeasuredHeight() - Math.round(this.M))) {
            return;
        }
        this.L.setBounds(0, measuredHeight, getMeasuredWidth(), getMeasuredHeight());
        this.b.invalidate(0, Math.max(0, Math.min(i7, measuredHeight)), getMeasuredWidth(), getMeasuredHeight());
        invalidate(0, Math.max(0, Math.min(i7, measuredHeight)), getMeasuredWidth(), getMeasuredHeight());
    }

    public final void c() {
        l1 l1Var = ((rh.h) this.a).r;
        int i7 = l1Var != null ? l1Var.a.f(2).d : 0;
        float c10 = ((rh.h) this.a).c();
        g3 g3Var = this.d;
        int childCount = g3Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            KeyEvent.Callback childAt = g3Var.getChildAt(i10);
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
        this.x = ((rh.h) this.a).d();
        this.y = ((rh.h) this.a).c();
        int i10 = 0;
        this.E = ((rh.h) this.a).s != 1;
        g3 g3Var = this.d;
        boolean z10 = g3Var.getVisibility() == 0;
        boolean z11 = this.E;
        if (z10 != z11) {
            g3Var.setVisibility(z11 ? 0 : 8);
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) g3Var.getLayoutParams();
        int i11 = layoutParams.height;
        int i12 = ((rh.h) this.a).x;
        if (i11 != i12) {
            layoutParams.height = i12;
            requestLayout();
        }
        a(false);
        c();
        if (this.r != null) {
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
            this.r.t(g0.L(29.0f), g0.L(29.0f), i10, i7, true);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0513  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02de  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        float f11;
        float f12;
        float f13;
        Canvas canvas2;
        float d;
        boolean z10;
        long j3;
        i6 i6Var;
        RectF rectF;
        int[] iArr;
        float f14;
        float f15;
        ge geVar;
        hf hfVar;
        float f16;
        int f17;
        int i7;
        float f18;
        this.r.setBounds(0, getMeasuredHeight() - ((int) this.y), getMeasuredWidth(), f3.b(58.0f, getMeasuredHeight() - ((int) this.y), getMeasuredHeight()));
        int measuredHeight = getMeasuredHeight() - this.w;
        int round = Math.round(this.F);
        int measuredWidth = getMeasuredWidth() - Math.round(this.G);
        int i10 = this.I;
        Rect rect = this.J;
        rect.set(round, 0, measuredWidth, i10);
        rect.inset(0, -g0.L(7.0f));
        rect.offset(0, measuredHeight + ((int) this.N));
        this.n.setBounds(rect);
        if (this.e) {
            this.n.draw(canvas);
        }
        w wVar = this.f;
        if (wVar == null || !this.e) {
            f10 = 22.0f;
            f11 = 0.45f;
            f12 = 0.3f;
            f13 = 2.0f;
        } else {
            Rect rect2 = this.n.R.m;
            l0 l0Var = wVar.b;
            i6 i6Var2 = l0Var.n;
            RectF rectF2 = l0Var.y;
            int[] iArr2 = l0Var.E;
            RectF rectF3 = l0Var.Z;
            f10 = 22.0f;
            q0 q0Var = l0Var.x;
            f11 = 0.45f;
            rf rfVar = l0Var.f;
            f12 = 0.3f;
            i1 i1Var = l0Var.w;
            f13 = 2.0f;
            if (i1Var != null && (i1Var.T || i1Var.W.c > 0.0f || i1Var.y0 || i1Var.C0.c > 0.0f)) {
                i1Var.invalidate();
            }
            if (l0Var.Y != null) {
                boolean z11 = l0Var.r == 4;
                j1 j1Var = l0Var.a;
                boolean z12 = j1Var != null && j1Var.d;
                boolean z13 = SystemClock.uptimeMillis() < l0Var.W;
                long uptimeMillis = SystemClock.uptimeMillis();
                boolean z14 = z12;
                long j10 = l0Var.b;
                if (j10 <= 0 || uptimeMillis < j10 || l0Var.X || z11) {
                    d = l0Var.Y.d(l0Var.X || z11 || z13 || z14 || j10 > 0);
                } else {
                    float min = Math.min(1.0f, (uptimeMillis - j10) / 580.0f);
                    if (min >= 1.0f) {
                        l0Var.b = 0L;
                        l0Var.Y.e(true, 0.0f);
                        d = 0.0f;
                    } else {
                        l0Var.Y.e(true, 1.0f);
                        d = 1.0f - l0.I0.getInterpolation(min);
                    }
                }
                if (d <= 0.0f) {
                    l0Var.d = false;
                    l0Var.D(0.0f, 0.0f);
                    rfVar.c(0.0f, 0);
                } else {
                    long uptimeMillis2 = SystemClock.uptimeMillis();
                    float min2 = l0Var.R == 0 ? 0.016f : Math.min(0.05f, (uptimeMillis2 - r14) / 1000.0f);
                    l0Var.R = uptimeMillis2;
                    float f19 = z11 ? 0.55f : l0Var.P;
                    float f20 = l0Var.Q;
                    float f21 = d;
                    float z15 = e2.z(1.0f, (float) Math.exp((-min2) / (f19 > f20 ? 0.12f : 0.4f)), f19 - f20, f20);
                    l0Var.Q = z15;
                    if (l0Var.X && !z11) {
                        float f22 = l0Var.P;
                        if (f22 > 0.3f && f22 > (z15 * 1.5f) + 0.08f && uptimeMillis2 - l0Var.S > 1000) {
                            j3 = uptimeMillis2;
                            l0Var.S = j3;
                            z10 = z11;
                            l0Var.T = (float) (((Math.random() * 3.141592653589793d) * 2.0d) - 3.141592653589793d);
                            float f23 = (j3 - l0Var.S) / 1200.0f;
                            float interpolation = (f23 >= 0.0f || f23 >= 1.0f || z10) ? -1.0f : kr.g.getInterpolation(f23);
                            float f24 = l0Var.T;
                            q0Var.C = interpolation;
                            int[] iArr3 = q0Var.B;
                            q0Var.D = f24;
                            l0Var.c = (f23 >= 0.0f || f23 >= 1.0f) ? 0.0f : (float) Math.sin(f23 * 3.141592653589793d);
                            rectF3.set(rect2);
                            if (z10) {
                                i6Var = i6Var2;
                                rectF = rectF2;
                                iArr = iArr2;
                                f14 = 0.7f;
                                if (z14) {
                                    float g10 = l0Var.a.g();
                                    l0Var.d = true;
                                    f15 = g10;
                                } else if (l0Var.d) {
                                    f15 = 1.0f;
                                }
                                float e10 = f21 * l0Var.e.e(false, l0Var.X ? 1.0f : (z10 || z14 || l0Var.d) ? 0.85f : f14);
                                RectF rectF4 = rectF;
                                int[] iArr4 = iArr;
                                l0Var.x.b(Math.min(g0.L(22.0f), rectF3.height() / 2.0f), e10, f15, l0Var.Q, canvas, rectF3);
                                l0Var.D(e10, l0Var.c);
                                geVar = rfVar.a.R0;
                                if (geVar == null && geVar.getVisibility() == 0 && geVar.getAlpha() > 0.01f && l0Var.k(rectF4)) {
                                    geVar.getLocationInWindow(iArr4);
                                    int a10 = q0Var.a((geVar.getWidth() / 2.0f) + iArr4[0], (geVar.getHeight() / 2.0f) + iArr4[1], rectF4);
                                    boolean c10 = q0.c(n6.w0(n6.d6, i6Var));
                                    if (c10) {
                                        i7 = -1;
                                        f18 = 0.4f;
                                    } else {
                                        i7 = iArr3[4];
                                        f18 = 0.5f;
                                    }
                                    rfVar.c((c10 ? 1.0f : r0.c(11)) * e10, i0.a.f(f18, a10, i7));
                                } else {
                                    rfVar.c(0.0f, 0);
                                }
                                Matrix matrix = l0Var.z0;
                                hfVar = rfVar.a.F0;
                                if (hfVar != null) {
                                    if (l0Var.r == 1) {
                                        boolean c11 = q0.c(n6.w0(n6.d6, i6Var));
                                        if (l0Var.w0 == null || l0Var.x0 != c11 || l0Var.y0 != q0.U) {
                                            l0Var.x0 = c11;
                                            l0Var.y0 = q0.U;
                                            int w02 = n6.w0(n6.Me, i6Var);
                                            if (c11) {
                                                w02 = q0.d(w02);
                                            }
                                            int i11 = w02 | (-16777216);
                                            if (c11) {
                                                f17 = q0.e(-7359233);
                                                f16 = 0.55f;
                                            } else {
                                                f16 = 0.55f;
                                                f17 = i0.a.f(0.55f, iArr3[0], iArr3[4]);
                                            }
                                            int e11 = c11 ? q0.e(-7411982) : i0.a.f(f16, iArr3[1], iArr3[4]);
                                            int e12 = c11 ? q0.e(-4940545) : i0.a.f(f16, iArr3[2], iArr3[4]);
                                            float f25 = c11 ? 0.92f : 0.9f;
                                            if (c11) {
                                                l0Var.w0 = new LinearGradient(0.0f, 0.0f, 1.0f, 0.0f, new int[]{i0.a.f(f25, i11, f17), i0.a.f(f25, i11, e11), i0.a.f(f25, i11, e12), i0.a.f(f25, i11, f17)}, (float[]) null, Shader.TileMode.MIRROR);
                                            } else {
                                                int w03 = n6.w0(n6.Me, i6Var);
                                                int alpha = Color.alpha(w03);
                                                int[] iArr5 = new int[4];
                                                iArr5[0] = f17;
                                                iArr5[1] = e11;
                                                iArr5[2] = e12;
                                                iArr5[3] = f17;
                                                for (int i12 = 0; i12 < 4; i12++) {
                                                    iArr5[i12] = i0.a.o(i0.a.f(0.12f, w03 | (-16777216), iArr5[i12]), alpha);
                                                }
                                                l0Var.w0 = new LinearGradient(0.0f, 0.0f, 1.0f, 0.0f, iArr5, (float[]) null, Shader.TileMode.MIRROR);
                                            }
                                        }
                                        float L = g0.L(160.0f);
                                        matrix.setScale(L, 1.0f);
                                        matrix.postTranslate(((SystemClock.uptimeMillis() % 6000) / 6000.0f) * 2.0f * L, 0.0f);
                                        l0Var.w0.setLocalMatrix(matrix);
                                        hfVar.m1 = l0Var.w0;
                                        hfVar.invalidate();
                                    } else if (hfVar.m1 != null) {
                                        hfVar.m1 = null;
                                        hfVar.invalidate();
                                    }
                                }
                                l0Var.a0.postInvalidateOnAnimation();
                            } else {
                                b2 b2Var = l0Var.F;
                                i6Var = i6Var2;
                                f14 = 0.7f;
                                float uptimeMillis3 = (SystemClock.uptimeMillis() - l0Var.V) / 1000.0f;
                                Matrix matrix2 = b2Var.l;
                                if (b2Var.k == null) {
                                    rectF = rectF2;
                                    iArr = iArr2;
                                } else {
                                    rectF = rectF2;
                                    iArr = iArr2;
                                    float sin = (((float) Math.sin((0.23f * uptimeMillis3) + 1.3f)) * 12.0f) + (((float) Math.sin(uptimeMillis3 * 0.45f)) * 28.0f);
                                    matrix2.reset();
                                    matrix2.setRotate(sin);
                                    matrix2.postTranslate(g0.L(46.0f) * uptimeMillis3, g0.L(10.0f) * ((float) Math.sin(uptimeMillis3 * 0.7f)));
                                    b2Var.k.setLocalMatrix(matrix2);
                                }
                            }
                            f15 = -1.0f;
                            float e102 = f21 * l0Var.e.e(false, l0Var.X ? 1.0f : (z10 || z14 || l0Var.d) ? 0.85f : f14);
                            RectF rectF42 = rectF;
                            int[] iArr42 = iArr;
                            l0Var.x.b(Math.min(g0.L(22.0f), rectF3.height() / 2.0f), e102, f15, l0Var.Q, canvas, rectF3);
                            l0Var.D(e102, l0Var.c);
                            geVar = rfVar.a.R0;
                            if (geVar == null) {
                            }
                            rfVar.c(0.0f, 0);
                            Matrix matrix3 = l0Var.z0;
                            hfVar = rfVar.a.F0;
                            if (hfVar != null) {
                            }
                            l0Var.a0.postInvalidateOnAnimation();
                        }
                    }
                    z10 = z11;
                    j3 = uptimeMillis2;
                    float f232 = (j3 - l0Var.S) / 1200.0f;
                    if (f232 >= 0.0f) {
                    }
                    float f242 = l0Var.T;
                    q0Var.C = interpolation;
                    int[] iArr32 = q0Var.B;
                    q0Var.D = f242;
                    l0Var.c = (f232 >= 0.0f || f232 >= 1.0f) ? 0.0f : (float) Math.sin(f232 * 3.141592653589793d);
                    rectF3.set(rect2);
                    if (z10) {
                    }
                    f15 = -1.0f;
                    float e1022 = f21 * l0Var.e.e(false, l0Var.X ? 1.0f : (z10 || z14 || l0Var.d) ? 0.85f : f14);
                    RectF rectF422 = rectF;
                    int[] iArr422 = iArr;
                    l0Var.x.b(Math.min(g0.L(22.0f), rectF3.height() / 2.0f), e1022, f15, l0Var.Q, canvas, rectF3);
                    l0Var.D(e1022, l0Var.c);
                    geVar = rfVar.a.R0;
                    if (geVar == null) {
                    }
                    rfVar.c(0.0f, 0);
                    Matrix matrix32 = l0Var.z0;
                    hfVar = rfVar.a.F0;
                    if (hfVar != null) {
                    }
                    l0Var.a0.postInvalidateOnAnimation();
                }
            }
        }
        g2 g2Var = this.h;
        if (g2Var != null && this.e) {
            Rect rect3 = this.n.R.m;
            ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) g2Var.b;
            f fVar = (f) g2Var.c;
            RectF rectF5 = chatActivityEnterView.w6;
            j1 j1Var2 = chatActivityEnterView.o6;
            if (j1Var2 != null && j1Var2.d && chatActivityEnterView.v6 != null && q0.c(chatActivityEnterView.G0(n6.d6))) {
                float g11 = j1Var2.g();
                if (g11 >= 0.0f) {
                    float min3 = Math.min(1.0f, (1.0f - g11) / f12) * Math.min(1.0f, g11 / 0.15f);
                    q0 q0Var2 = chatActivityEnterView.v6;
                    if (!q0Var2.h) {
                        q0Var2.h = true;
                    }
                    if (min3 > 0.001f) {
                        rectF5.set(rect3);
                        canvas2 = canvas;
                        chatActivityEnterView.v6.b(Math.min(g0.L(f10), rectF5.height() / f13), min3 * f11, g11, 0.35f, canvas2, rectF5);
                    } else {
                        canvas2 = canvas;
                    }
                    fVar.postInvalidateOnAnimation();
                    if (this.E) {
                        this.r.draw(canvas2);
                    }
                    super.dispatchDraw(canvas);
                }
            }
        }
        canvas2 = canvas;
        if (this.E) {
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        boolean z10 = view == this.d;
        if (z10) {
            canvas.save();
            canvas.clipPath(this.r.R.k);
        }
        boolean drawChild = super.drawChild(canvas, view, j3);
        if (z10) {
            canvas.restore();
        }
        return drawChild;
    }

    public final void e() {
        this.c.setTranslationY((-this.x) - g0.L(9.0f));
        this.d.setTranslationY(r0.getMeasuredHeight() - this.y);
    }

    public View getFadeView() {
        return this.b;
    }

    public FrameLayout getInAppKeyboardBubbleContainer() {
        return this.d;
    }

    public float getInputBubbleBottom() {
        return (getMeasuredHeight() - this.x) - g0.L(9.0f);
    }

    public float getInputBubbleHeight() {
        return this.H;
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
            fh.g gVar2 = this.n;
            this.Q = (gVar2 != null && gVar2.c == 255 && gVar2.getBounds().contains(x10, y10)) || ((gVar = this.r) != null && gVar.getBounds().contains(x10, y10));
        }
        if (action == 1 || action == 3) {
            this.Q = false;
        }
        return this.Q;
    }

    public void setBackgroundWithFadeDrawable(dh.d dVar) {
        this.L = dVar;
    }

    public void setBlurredBottomHeight(float f10) {
        if (this.M != f10) {
            this.M = f10;
            b();
        }
    }

    public void setInputBubbleAlpha(int i7) {
        this.O = i7;
        fh.g gVar = this.n;
        if (gVar != null) {
            gVar.setAlpha((int) (i7 * this.P));
        }
    }

    public void setInputBubbleExtraAlpha(float f10) {
        if (this.P != f10) {
            this.P = f10;
            fh.g gVar = this.n;
            if (gVar != null) {
                gVar.setAlpha((int) (this.O * f10));
            }
            invalidate();
        }
    }

    public void setInputBubbleHeight(float f10) {
        this.H = f10;
        this.I = Math.round(f10);
        a(false);
    }

    public void setInputBubbleTranslationY(float f10) {
        this.N = f10;
        invalidate();
    }

    public void setInputIslandBubbleDrawable(fh.g gVar) {
        this.n = gVar;
        gVar.q(g0.L(7.0f));
        this.n.r(g0.L(22.0f));
    }

    public void setUnderKeyboardBackgroundDrawable(fh.g gVar) {
        this.r = gVar;
        gVar.T = true;
        gVar.s(g0.L(29.0f), g0.L(29.0f), 0.0f, 0.0f);
        this.r.u(g0.L(32.0f));
        fh.g gVar2 = this.r;
        gVar2.R.g = 0.4f;
        gVar2.n();
    }

    public void setWindowInsetsProvider(rh.f fVar) {
        this.a = fVar;
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void updateColors() {
        fh.g gVar = this.n;
        if (gVar != null) {
            gVar.updateColors();
        }
        fh.g gVar2 = this.r;
        if (gVar2 != null) {
            gVar2.updateColors();
        }
        invalidate();
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
