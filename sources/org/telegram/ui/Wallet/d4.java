package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.hardware.Sensor;
import android.os.Handler;
import android.os.SystemClock;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.text.style.RelativeSizeSpan;
import android.view.View;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Stack;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.bi0;
import org.telegram.ui.Components.dc;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.qz0;
import org.telegram.ui.Components.yz0;
import org.telegram.ui.Components.zz0;
import org.telegram.ui.lg;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class d4 {
    public float A;
    public float B;
    public boolean D;
    public boolean E;
    public o1.j F;
    public ValueAnimator G;
    public boolean H;
    public final a4 I;
    public final org.telegram.ui.Components.t5 J;
    public final org.telegram.ui.Components.t5 K;
    public final Paint L;
    public boolean M;
    public long N;
    public final Paint O;
    public long P;
    public final org.telegram.ui.Components.t5 Q;
    public float R;
    public long S;
    public int T;
    public int U;
    public int V;
    public final Path W;
    public final Paint X;
    public final dc Y;
    public o1.j Z;
    public final org.telegram.ui.Cells.s0 a;
    public float a0;
    public final org.telegram.ui.ActionBar.p6 b;
    public o1.j b0;
    public float c0;
    public b4 d0;
    public boolean e;
    public long e0;
    public boolean f0;
    public boolean g0;
    public boolean h0;
    public final Drawable i;
    public boolean i0;
    public ValueAnimator j0;
    public final m6 k;
    public lg k0;
    public final bi0 l;
    public TLRPC.TL_messageActionGramTransfer l0;
    public c4 m;
    public boolean m0;
    public boolean n;
    public qz0 n0;
    public boolean o;
    public qz0 o0;
    public float p;
    public qz0 p0;
    public float q;
    public qz0 q0;
    public float r;
    public boolean r0;
    public float s;
    public org.telegram.ui.Cells.m0 s0;
    public float t;
    public int t0;
    public final bi.m6 u0;
    public long v;
    public int v0;
    public final org.telegram.ui.Components.t5 w0;
    public final y3 x0;
    public float y;
    public boolean y0;
    public float z;
    public final ArrayList c = new ArrayList();
    public final Stack d = new Stack();
    public final RectF f = new RectF();
    public final RectF g = new RectF();
    public final Path h = new Path();
    public final Path j = new Path();
    public final t9 u = new t9();
    public final Rect w = new Rect();
    public int x = -1;
    public float C = 1.0f;

    public d4(org.telegram.ui.Cells.s0 s0Var, org.telegram.ui.ActionBar.p6 p6Var) {
        Paint paint = new Paint(1);
        this.L = paint;
        Paint paint2 = new Paint(1);
        this.O = paint2;
        Path path = new Path();
        this.W = path;
        Paint paint3 = new Paint(1);
        this.X = paint3;
        this.a0 = 1.0f;
        new Matrix();
        this.t0 = -10624001;
        this.u0 = new bi.m6(this, 4);
        this.v0 = -1;
        new Paint(1);
        new Paint(1);
        this.x0 = new y3();
        this.a = s0Var;
        this.b = p6Var;
        this.i = s0Var.getResources().getDrawable(R.drawable.wallet_action_card_gradient).mutate();
        Context context = s0Var.getContext();
        if (m6.G == null) {
            m6.G = new m6(context.getApplicationContext());
        }
        this.k = m6.G;
        bi0 bi0Var = new bi0(R.raw.wallet_diamond_white, org.telegram.messenger.i0.L(42.0f), org.telegram.messenger.i0.L(42.0f), false, null);
        this.l = bi0Var;
        bi0Var.R(s0Var);
        bi0Var.K(0);
        s0Var.addOnAttachStateChangeListener(new org.telegram.ui.Components.u9(2, this, s0Var));
        paint2.setColor(-10033409);
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        paint2.setStrokeWidth(org.telegram.messenger.i0.N(1.0f));
        int i10 = 6;
        l lVar = new l(s0Var, i10);
        gr grVar = gr.h;
        this.Q = new org.telegram.ui.Components.t5(1.0f, lVar, 0L, 180L, grVar);
        this.K = new org.telegram.ui.Components.t5(new l(s0Var, i10), 320L, grVar, 0);
        this.J = new org.telegram.ui.Components.t5(new l(s0Var, i10), 320L, grVar, 0);
        a4 a4Var = new a4(s0Var, s0Var);
        this.I = a4Var;
        a4Var.y = -1;
        ph.f1.d(path, 1.0f, false);
        paint3.setStyle(style);
        paint3.setStrokeWidth(org.telegram.messenger.i0.N(4.0f));
        paint3.setPathEffect(new CornerPathEffect(org.telegram.messenger.i0.L(2.33f)));
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint3.setShader(new LinearGradient(0.0f, 0.0f, org.telegram.messenger.i0.L(48.0f), org.telegram.messenger.i0.L(48.0f), new int[]{16777215, org.telegram.ui.ActionBar.t6.r1(0.35f, 16777215), 16777215}, new float[]{0.0f, 0.5f, 1.0f}, tileMode));
        paint.setShader(new LinearGradient(-org.telegram.messenger.i0.L(10.0f), 0.0f, org.telegram.messenger.i0.L(10.0f), 0.0f, new int[]{16777215, -2130706433, 16777215}, new float[]{0.0f, 0.5f, 1.0f}, tileMode));
        dc dcVar = new dc(s0Var);
        this.Y = dcVar;
        dcVar.f = new z3(this, 0);
        this.w0 = new org.telegram.ui.Components.t5(1.0f, new l(s0Var, i10), 0L, 400L, grVar);
    }

    public static int h() {
        return org.telegram.messenger.i0.L(206.0f);
    }

    public final void a(float f7) {
        if (this.F == null) {
            o1.j jVar = new o1.j(new o1.i(this.C));
            this.F = jVar;
            o1.k kVar = new o1.k(f7);
            kVar.a(0.55f);
            kVar.b(280.0f);
            jVar.m = kVar;
            this.F.f(0.001f);
            this.F.b(new x3(this, 0));
        }
        this.F.c(f7);
    }

    public final void b() {
        org.telegram.ui.Cells.s0 s0Var = this.a;
        if (s0Var.isShown()) {
            org.telegram.messenger.i0.b4(s0Var);
        }
        o1.j jVar = this.Z;
        if (jVar != null) {
            jVar.d();
        }
        o1.j jVar2 = new o1.j(new o1.i(this.a0));
        this.Z = jVar2;
        o1.k kVar = new o1.k(1.0f);
        kVar.a(0.55f);
        kVar.b(280.0f);
        jVar2.m = kVar;
        this.Z.f(0.001f);
        o1.j jVar3 = this.Z;
        jVar3.a = -3.0f;
        jVar3.b(new x3(this, 2));
        this.Z.h();
    }

    public final void c(Canvas canvas, float f7, float f10) {
        canvas.translate(0.0f, org.telegram.messenger.i0.L(4.0f) * this.c0);
        dc dcVar = this.Y;
        canvas.scale(c3.i0.C(this.c0, 0.012f, 1.0f, dcVar.a(0.025f) * this.a0), c3.i0.D(this.c0, 0.04f, 1.0f, dcVar.a(0.025f) * this.a0), (org.telegram.messenger.i0.L(206.0f) / 2.0f) + f7, f10 + org.telegram.messenger.i0.L(70.0f));
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x0568  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0577  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0601  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x056a  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x03ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(Canvas canvas) {
        float f7;
        float f10;
        t9 t9Var;
        boolean z10;
        boolean z11;
        qz0 qz0Var;
        Canvas canvas2;
        b4 b4Var;
        float e;
        boolean z12;
        float f11;
        float e7;
        float f12;
        long j10;
        float f13;
        c4 c4Var;
        canvas.save();
        dc dcVar = this.Y;
        float C = c3.i0.C(this.c0, 0.012f, 1.0f, dcVar.a(0.025f) * this.a0);
        float D = c3.i0.D(this.c0, 0.04f, 1.0f, dcVar.a(0.025f) * this.a0);
        float L = org.telegram.messenger.i0.L(4.0f) * this.c0;
        c(canvas, 0.0f, 0.0f);
        float L2 = org.telegram.messenger.i0.L(4.0f);
        RectF rectF = this.f;
        rectF.set(L2, L2, org.telegram.messenger.i0.L(206.0f) - L2, org.telegram.messenger.i0.L(140.0f) - L2);
        Canvas.EdgeType edgeType = Canvas.EdgeType.AA;
        boolean quickReject = canvas.quickReject(rectF, edgeType);
        org.telegram.ui.Cells.s0 s0Var = this.a;
        m6 m6Var = this.k;
        if (quickReject) {
            f7 = 4.0f;
        } else {
            Handler handler = m6Var.d;
            f7 = 4.0f;
            Sensor sensor = m6Var.b;
            if (sensor != null && s0Var.isAttachedToWindow() && s0Var.isShown() && s0Var.getWindowVisibility() == 0) {
                f10 = 206.0f;
                m6Var.e.put(s0Var, Long.valueOf(SystemClock.uptimeMillis()));
                if (!m6Var.r) {
                    m6Var.s = false;
                    boolean registerListener = m6Var.a.registerListener(m6Var, sensor, 1, handler);
                    m6Var.r = registerListener;
                    if (registerListener) {
                        handler.postDelayed(m6Var.F, 250L);
                    }
                }
                Path path = this.j;
                path.rewind();
                float L3 = org.telegram.messenger.i0.L(16.0f);
                float L4 = org.telegram.messenger.i0.L(16.0f);
                Path.Direction direction = Path.Direction.CW;
                path.addRoundRect(rectF, L3, L4, direction);
                canvas.save();
                canvas.clipPath(path);
                canvas.translate((org.telegram.messenger.i0.L(10.0f) * m6Var.D) + rectF.centerX(), (org.telegram.messenger.i0.L(8.0f) * m6Var.E) + rectF.centerY());
                q();
                canvas.rotate((m6Var.E * 6.0f) + (m6Var.D * 14.0f) + this.R);
                float hypot = (((float) Math.hypot(rectF.width(), rectF.height())) / 2.0f) + org.telegram.messenger.i0.L(16.0f);
                Drawable drawable = this.i;
                int max = Math.max(1, drawable.getIntrinsicWidth());
                int max2 = Math.max(1, drawable.getIntrinsicHeight());
                float min = hypot / Math.min(max, max2);
                int ceil = (int) Math.ceil(max * min);
                int ceil2 = (int) Math.ceil(max2 * min);
                float e10 = this.w0.e(false, 1.0f);
                drawable.setBounds(-ceil, -ceil2, ceil, ceil2);
                drawable.draw(canvas);
                this.t0 = e10 < 1.0f ? i0.b.f(e10, -10624001, -10624001) : -10624001;
                canvas.restore();
                int L5 = org.telegram.messenger.i0.L(42.0f);
                float f14 = L5 / 2.0f;
                int round = Math.round(rectF.centerX() - f14);
                float max3 = Math.max(0.0f, Math.min(1.0f, (this.C - 1.0f) / 2.0f));
                float L6 = rectF.top + org.telegram.messenger.i0.L(8.0f);
                int round2 = Math.round((((rectF.centerY() - f14) - L6) * max3) + L6);
                int i10 = round + L5;
                int i11 = L5 + round2;
                bi0 bi0Var = this.l;
                bi0Var.setBounds(round, round2, i10, i11);
                boolean quickReject2 = canvas.quickReject(round, round2, i10, i11, edgeType);
                Rect bounds = bi0Var.getBounds();
                Rect rect = this.w;
                rect.set(bounds);
                t9Var = this.u;
                if (t9Var.d()) {
                    canvas.save();
                    canvas.clipPath(path);
                    canvas.translate(rect.exactCenterX(), rect.exactCenterY());
                    t9Var.c(canvas);
                    canvas.restore();
                    s0Var.postInvalidateOnAnimation();
                }
                p();
                if (this.m != null) {
                    float exactCenterX = ((rect.exactCenterX() - (org.telegram.messenger.i0.L(f10) / 2.0f)) * C) + (org.telegram.messenger.i0.L(f10) / 2.0f);
                    float z13 = c3.i0.z(rect.exactCenterY(), org.telegram.messenger.i0.L(70.0f), D, L + org.telegram.messenger.i0.L(70.0f));
                    this.m.setTranslationX((this.p + exactCenterX) - f14);
                    this.m.setTranslationY((this.q + z13) - f14);
                    this.m.setScaleX(C * this.C);
                    this.m.setScaleY(D * this.C);
                }
                z10 = quickReject2 && (c4Var = this.m) != null && c4Var.n;
                if (!z10) {
                    bi0Var.stop();
                    this.H = false;
                } else if (!this.H && !quickReject2) {
                    z11 = true;
                    this.H = true;
                    bi0Var.T(true, 0.0f);
                    bi0Var.start();
                    if (!z10 && !this.E) {
                        bi0Var.draw(canvas);
                    }
                    qz0Var = this.n0;
                    if (qz0Var != null) {
                        float k10 = qz0Var.k();
                        float width = rectF.width() - org.telegram.messenger.i0.L(16.0f);
                        float f15 = k10 > width ? width / k10 : 1.0f;
                        float L7 = rectF.top + org.telegram.messenger.i0.L(55.0f) + (this.n0.i() / 2.0f);
                        canvas.save();
                        canvas.scale(f15, f15, rectF.centerX(), L7);
                        this.n0.c(rectF.centerX() - (k10 / 2.0f), L7, 1.0f, -1, canvas);
                        canvas.restore();
                    }
                    if (this.o0 != null) {
                        float L8 = (org.telegram.messenger.i0.L(f10) - this.o0.k()) / 2.0f;
                        float L9 = (rectF.bottom - org.telegram.messenger.i0.L(7.0f)) - this.o0.i();
                        qz0 qz0Var2 = this.p0;
                        if (qz0Var2 != null) {
                            qz0Var2.c((org.telegram.messenger.i0.L(f10) - this.p0.k()) / 2.0f, (L9 - org.telegram.messenger.i0.L(f7)) - (this.p0.i() / 2.0f), 1.0f, this.t0, canvas);
                        }
                        this.o0.c(L8, L9 + org.telegram.messenger.i0.L(1.0f), 1.0f, 268435455, canvas);
                        canvas2 = canvas;
                        this.o0.c(L8, L9, 1.0f, e10 < 1.0f ? i0.b.f(e10, -16693808, -16693808) : -16693808, canvas2);
                    } else {
                        canvas2 = canvas;
                    }
                    b4Var = this.d0;
                    if (b4Var != null && !b4Var.c()) {
                        if (this.e0 != 0 && !this.h0 && !this.f0 && SystemClock.elapsedRealtime() - this.e0 >= 600) {
                            this.d0.a();
                            this.f0 = z11;
                        }
                        float strokeWidth = this.d0.x.getStrokeWidth() / 2.0f;
                        RectF rectF2 = this.g;
                        rectF2.set(rectF);
                        rectF2.inset(strokeWidth, strokeWidth);
                        float max4 = Math.max(0.0f, org.telegram.messenger.i0.L(16.0f) - strokeWidth);
                        Path path2 = this.h;
                        path2.rewind();
                        path2.addRoundRect(rectF2, max4, max4, direction);
                        this.d0.e(rectF);
                        this.d0.draw(canvas2);
                        if (this.e0 != 0 && this.d0.c()) {
                            this.e0 = 0L;
                        }
                    }
                    ValueAnimator valueAnimator = this.j0;
                    boolean z14 = (valueAnimator != null || valueAnimator.getCurrentPlayTime() >= 1000) ? false : z11;
                    float f16 = (!this.h0 || this.i0 || z14) ? 0.0f : 1.0f;
                    org.telegram.ui.Components.t5 t5Var = this.K;
                    e = t5Var.e(false, f16);
                    z12 = this.h0;
                    org.telegram.ui.ActionBar.p6 p6Var = this.b;
                    if (!z12 || this.i0 || z14) {
                        f11 = 255.0f;
                    } else {
                        boolean z15 = this.y0;
                        org.telegram.ui.Components.t5 t5Var2 = this.J;
                        if (z15) {
                            f12 = 1.0f;
                            if (t5Var2.c >= 1.0f) {
                                this.U = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.q7, p6Var);
                            }
                        } else {
                            f12 = 1.0f;
                        }
                        float e11 = t5Var2.e(false, f12);
                        int f17 = e11 >= f12 ? this.U : i0.b.f(e11, this.T, this.U);
                        this.V = f17;
                        a4 a4Var = this.I;
                        Paint paint = (Paint) a4Var.b;
                        f11 = 255.0f;
                        paint.setShader(null);
                        paint.setColor(f17);
                        a4Var.setBounds(((int) rectF.right) - org.telegram.messenger.i0.L(46.0f), ((int) rectF.top) - org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(2.0f) + ((int) rectF.right), org.telegram.messenger.i0.L(46.0f) + ((int) rectF.top));
                        canvas2.save();
                        if (e < 1.0f) {
                            float exactCenterX2 = a4Var.getBounds().exactCenterX();
                            f13 = 48.0f;
                            float exactCenterY = a4Var.getBounds().exactCenterY();
                            j10 = 0;
                            float L10 = org.telegram.messenger.i0.L(48.0f) * ((float) Math.sqrt(0.5d)) * e;
                            canvas2.rotate(45.0f, exactCenterX2, exactCenterY);
                            canvas2.clipRect(exactCenterX2 - L10, exactCenterY - org.telegram.messenger.i0.L(48.0f), L10 + exactCenterX2, org.telegram.messenger.i0.L(48.0f) + exactCenterY);
                            canvas2.rotate(-45.0f, exactCenterX2, exactCenterY);
                        } else {
                            j10 = 0;
                            f13 = 48.0f;
                        }
                        a4Var.draw(canvas2);
                        if (this.U != -15352320) {
                            e11 = this.T == -15352320 ? 1.0f - e11 : 0.0f;
                        }
                        Path path3 = this.W;
                        if (e11 > 0.0f) {
                            Rect bounds2 = a4Var.getBounds();
                            canvas2.save();
                            canvas2.translate(bounds2.right - org.telegram.messenger.i0.L(f13), bounds2.top);
                            canvas2.clipPath(path3);
                            Paint paint2 = this.X;
                            paint2.setAlpha((int) (e11 * 255.0f));
                            canvas2.drawPath(path3, paint2);
                            canvas2.restore();
                        }
                        if (e < 1.0f || t5Var.i) {
                            this.M = true;
                            this.N = 0L;
                        } else {
                            long elapsedRealtime = SystemClock.elapsedRealtime();
                            if (this.M) {
                                this.M = false;
                                this.N = elapsedRealtime + 500;
                                s0Var.postInvalidateDelayed(500L);
                            }
                            long j11 = this.N;
                            if (j11 != j10 && elapsedRealtime >= j11) {
                                float f18 = (elapsedRealtime - j11) / 600.0f;
                                if (f18 >= 1.0f) {
                                    this.N = j10;
                                } else {
                                    Rect bounds3 = a4Var.getBounds();
                                    canvas2.save();
                                    canvas2.translate(bounds3.right - org.telegram.messenger.i0.L(f13), bounds3.top);
                                    canvas2.clipPath(path3);
                                    canvas2.rotate(45.0f);
                                    float L11 = org.telegram.messenger.i0.L(10.0f);
                                    float f19 = -L11;
                                    canvas2.translate((((L11 * 2.0f) + (org.telegram.messenger.i0.L(f13) * ((float) Math.sqrt(2.0d)))) * f18) + f19, 0.0f);
                                    canvas.drawRect(f19, -org.telegram.messenger.i0.L(f13), L11, org.telegram.messenger.i0.L(f13), this.L);
                                    canvas2 = canvas;
                                    canvas2.restore();
                                    s0Var.postInvalidateOnAnimation();
                                }
                            }
                        }
                        canvas2.restore();
                    }
                    e7 = this.Q.e(false, this.E ? 0.0f : 1.0f);
                    if (this.g0 && !this.E && e < 1.0f && e7 > 0.0f) {
                        int round3 = Math.round((1.0f - e) * e7 * f11);
                        Paint paint3 = this.O;
                        paint3.setAlpha(round3);
                        float N = rectF.right - org.telegram.messenger.i0.N(15.5f);
                        float N2 = org.telegram.messenger.i0.N(15.5f) + rectF.top;
                        canvas2.drawCircle(N, N2, org.telegram.messenger.i0.N(5.0f), paint3);
                        long elapsedRealtime2 = SystemClock.elapsedRealtime() - this.P;
                        float f20 = ((elapsedRealtime2 % 2000) / 2000.0f) * 360.0f;
                        canvas2.save();
                        canvas2.rotate(f20, N, N2);
                        Canvas canvas3 = canvas2;
                        canvas3.drawLine(N, N2, N, N2 - org.telegram.messenger.i0.N(f7), paint3);
                        canvas3.rotate((360.0f * ((elapsedRealtime2 % 24000) / 24000.0f)) - f20, N, N2);
                        canvas3.drawLine(N, N2, org.telegram.messenger.i0.N(2.5f) + N, N2, paint3);
                        canvas2 = canvas3;
                        canvas2.restore();
                        s0Var.postInvalidateOnAnimation();
                    }
                    if (this.q0 != null) {
                        int w02 = org.telegram.ui.ActionBar.t6.i1(p6Var) ? org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Fa, p6Var) : -1;
                        TLRPC.TL_messageActionGramTransfer tL_messageActionGramTransfer = this.l0;
                        if ((tL_messageActionGramTransfer.comment_encrypted || tL_messageActionGramTransfer.comment_encrypted_preparing) && !this.m0) {
                            canvas2.save();
                            canvas2.translate((org.telegram.messenger.i0.L(f10) - this.q0.k()) / 2.0f, org.telegram.messenger.i0.L(143.0f));
                            ArrayList arrayList = this.c;
                            int size = arrayList.size();
                            int i12 = 0;
                            while (i12 < size) {
                                Object obj = arrayList.get(i12);
                                i12++;
                                nh.i iVar = (nh.i) obj;
                                iVar.h(w02);
                                iVar.draw(canvas2);
                            }
                            canvas2.restore();
                        } else {
                            this.q0.c((org.telegram.messenger.i0.L(f10) - this.q0.k()) / 2.0f, org.telegram.messenger.i0.L(143.0f), 1.0f, w02, canvas2);
                        }
                    }
                    canvas.restore();
                }
                z11 = true;
                if (!z10) {
                    bi0Var.draw(canvas);
                }
                qz0Var = this.n0;
                if (qz0Var != null) {
                }
                if (this.o0 != null) {
                }
                b4Var = this.d0;
                if (b4Var != null) {
                    if (this.e0 != 0) {
                        this.d0.a();
                        this.f0 = z11;
                    }
                    float strokeWidth2 = this.d0.x.getStrokeWidth() / 2.0f;
                    RectF rectF22 = this.g;
                    rectF22.set(rectF);
                    rectF22.inset(strokeWidth2, strokeWidth2);
                    float max42 = Math.max(0.0f, org.telegram.messenger.i0.L(16.0f) - strokeWidth2);
                    Path path22 = this.h;
                    path22.rewind();
                    path22.addRoundRect(rectF22, max42, max42, direction);
                    this.d0.e(rectF);
                    this.d0.draw(canvas2);
                    if (this.e0 != 0) {
                        this.e0 = 0L;
                    }
                }
                ValueAnimator valueAnimator2 = this.j0;
                if (valueAnimator2 != null) {
                }
                if (this.h0) {
                }
                org.telegram.ui.Components.t5 t5Var3 = this.K;
                e = t5Var3.e(false, f16);
                z12 = this.h0;
                org.telegram.ui.ActionBar.p6 p6Var2 = this.b;
                if (z12) {
                }
                f11 = 255.0f;
                e7 = this.Q.e(false, this.E ? 0.0f : 1.0f);
                if (this.g0) {
                    int round32 = Math.round((1.0f - e) * e7 * f11);
                    Paint paint32 = this.O;
                    paint32.setAlpha(round32);
                    float N3 = rectF.right - org.telegram.messenger.i0.N(15.5f);
                    float N22 = org.telegram.messenger.i0.N(15.5f) + rectF.top;
                    canvas2.drawCircle(N3, N22, org.telegram.messenger.i0.N(5.0f), paint32);
                    long elapsedRealtime22 = SystemClock.elapsedRealtime() - this.P;
                    float f202 = ((elapsedRealtime22 % 2000) / 2000.0f) * 360.0f;
                    canvas2.save();
                    canvas2.rotate(f202, N3, N22);
                    Canvas canvas32 = canvas2;
                    canvas32.drawLine(N3, N22, N3, N22 - org.telegram.messenger.i0.N(f7), paint32);
                    canvas32.rotate((360.0f * ((elapsedRealtime22 % 24000) / 24000.0f)) - f202, N3, N22);
                    canvas32.drawLine(N3, N22, org.telegram.messenger.i0.N(2.5f) + N3, N22, paint32);
                    canvas2 = canvas32;
                    canvas2.restore();
                    s0Var.postInvalidateOnAnimation();
                }
                if (this.q0 != null) {
                }
                canvas.restore();
            }
        }
        f10 = 206.0f;
        Path path4 = this.j;
        path4.rewind();
        float L32 = org.telegram.messenger.i0.L(16.0f);
        float L42 = org.telegram.messenger.i0.L(16.0f);
        Path.Direction direction2 = Path.Direction.CW;
        path4.addRoundRect(rectF, L32, L42, direction2);
        canvas.save();
        canvas.clipPath(path4);
        canvas.translate((org.telegram.messenger.i0.L(10.0f) * m6Var.D) + rectF.centerX(), (org.telegram.messenger.i0.L(8.0f) * m6Var.E) + rectF.centerY());
        q();
        canvas.rotate((m6Var.E * 6.0f) + (m6Var.D * 14.0f) + this.R);
        float hypot2 = (((float) Math.hypot(rectF.width(), rectF.height())) / 2.0f) + org.telegram.messenger.i0.L(16.0f);
        Drawable drawable2 = this.i;
        int max5 = Math.max(1, drawable2.getIntrinsicWidth());
        int max22 = Math.max(1, drawable2.getIntrinsicHeight());
        float min2 = hypot2 / Math.min(max5, max22);
        int ceil3 = (int) Math.ceil(max5 * min2);
        int ceil22 = (int) Math.ceil(max22 * min2);
        float e102 = this.w0.e(false, 1.0f);
        drawable2.setBounds(-ceil3, -ceil22, ceil3, ceil22);
        drawable2.draw(canvas);
        this.t0 = e102 < 1.0f ? i0.b.f(e102, -10624001, -10624001) : -10624001;
        canvas.restore();
        int L52 = org.telegram.messenger.i0.L(42.0f);
        float f142 = L52 / 2.0f;
        int round4 = Math.round(rectF.centerX() - f142);
        float max32 = Math.max(0.0f, Math.min(1.0f, (this.C - 1.0f) / 2.0f));
        float L62 = rectF.top + org.telegram.messenger.i0.L(8.0f);
        int round22 = Math.round((((rectF.centerY() - f142) - L62) * max32) + L62);
        int i102 = round4 + L52;
        int i112 = L52 + round22;
        bi0 bi0Var2 = this.l;
        bi0Var2.setBounds(round4, round22, i102, i112);
        boolean quickReject22 = canvas.quickReject(round4, round22, i102, i112, edgeType);
        Rect bounds4 = bi0Var2.getBounds();
        Rect rect2 = this.w;
        rect2.set(bounds4);
        t9Var = this.u;
        if (t9Var.d()) {
        }
        p();
        if (this.m != null) {
        }
        if (quickReject22) {
        }
        if (!z10) {
        }
        z11 = true;
        if (!z10) {
        }
        qz0Var = this.n0;
        if (qz0Var != null) {
        }
        if (this.o0 != null) {
        }
        b4Var = this.d0;
        if (b4Var != null) {
        }
        ValueAnimator valueAnimator22 = this.j0;
        if (valueAnimator22 != null) {
        }
        if (this.h0) {
        }
        org.telegram.ui.Components.t5 t5Var32 = this.K;
        e = t5Var32.e(false, f16);
        z12 = this.h0;
        org.telegram.ui.ActionBar.p6 p6Var22 = this.b;
        if (z12) {
        }
        f11 = 255.0f;
        e7 = this.Q.e(false, this.E ? 0.0f : 1.0f);
        if (this.g0) {
        }
        if (this.q0 != null) {
        }
        canvas.restore();
    }

    public final void e() {
        if (this.d0 != null) {
            return;
        }
        b4 b4Var = new b4(this, this.b);
        this.d0 = b4Var;
        b4Var.g(4969977, org.telegram.ui.ActionBar.t6.r1(0.125f, -11807239), 4969977, org.telegram.ui.ActionBar.t6.r1(0.75f, -11807239));
        this.d0.x.setStrokeWidth(org.telegram.messenger.i0.N(2.0f));
        b4 b4Var2 = this.d0;
        b4Var2.t = 2.0f;
        b4Var2.y = this.h;
        b4Var2.D = true;
    }

    public final void f() {
        ValueAnimator valueAnimator = this.j0;
        if (valueAnimator == null) {
            return;
        }
        this.j0 = null;
        valueAnimator.removeAllListeners();
        valueAnimator.cancel();
        org.telegram.ui.Components.t5 t5Var = this.K;
        if (t5Var.i) {
            this.M = false;
            this.N = 0L;
        }
        t5Var.e(true, 1.0f);
        this.t = 0.0f;
        this.u.a.clear();
        lg lgVar = this.k0;
        this.k0 = null;
        this.a.invalidate();
        if (lgVar != null) {
            org.telegram.messenger.i0.h3(lgVar, 1L);
        }
    }

    public final float g() {
        long uptimeMillis = SystemClock.uptimeMillis();
        if (this.v != 0) {
            float min = Math.min(0.1f, (uptimeMillis - r2) / 1000.0f);
            float f7 = this.h0 ? 1.7883515f : 0.0f;
            float f10 = -min;
            float exp = (float) Math.exp(f10 / 0.2f);
            float f11 = (min * f7) + this.r;
            float f12 = this.s;
            this.r = (((1.0f - exp) * ((f12 - f7) * 0.2f)) + f11) % 6.2831855f;
            this.s = c3.i0.z(f12, f7, exp, f7);
            float exp2 = (float) Math.exp(f10 / 0.75f);
            float f13 = this.r;
            float f14 = this.t;
            this.r = (((1.0f - exp2) * (0.75f * f14)) + f13) % 6.2831855f;
            float f15 = f14 * exp2;
            this.t = f15;
            if (f15 < 0.001f) {
                this.t = 0.0f;
            }
        }
        this.v = uptimeMillis;
        return (this.k.D * 0.14f) + ((float) (((uptimeMillis / 1000.0d) * 0.5961171984672546d) % 6.283185307179586d)) + this.r;
    }

    public final void i(boolean z10) {
        if (z10) {
            this.Q.e(true, 0.0f);
        } else if (this.E && this.h0) {
            this.P = SystemClock.elapsedRealtime();
        }
        this.E = z10;
        c4 c4Var = this.m;
        if (c4Var != null) {
            c4Var.setAlpha(z10 ? 0.0f : 1.0f);
        }
        this.a.invalidate();
    }

    public final void j() {
        this.x = -1;
        org.telegram.ui.Cells.s0 s0Var = this.a;
        if (s0Var.getParent() != null) {
            s0Var.getParent().requestDisallowInterceptTouchEvent(false);
        }
        float IEEEremainder = (float) Math.IEEEremainder(this.A - g(), 6.283185307179586d);
        float IEEEremainder2 = (float) Math.IEEEremainder(this.B - (this.k.E * 0.14f), 6.283185307179586d);
        this.D = true;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.G = ofFloat;
        ofFloat.setDuration(350L);
        this.G.setInterpolator(gr.h);
        this.G.addUpdateListener(new fe.c(this, IEEEremainder, IEEEremainder2, 5));
        this.G.start();
        a(1.0f);
    }

    public final void k() {
        i(false);
        this.Q.e(true, 1.0f);
        if (this.x != -1) {
            org.telegram.ui.Cells.s0 s0Var = this.a;
            if (s0Var.getParent() != null) {
                s0Var.getParent().requestDisallowInterceptTouchEvent(false);
            }
        }
        this.x = -1;
        ValueAnimator valueAnimator = this.G;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.G = null;
        }
        o1.j jVar = this.F;
        if (jVar != null) {
            jVar.d();
            this.F = null;
        }
        this.D = false;
        this.C = 1.0f;
        this.B = 0.0f;
        this.v = 0L;
        this.t = 0.0f;
        this.s = 0.0f;
        this.r = 0.0f;
        this.u.a.clear();
        c4 c4Var = this.m;
        if (c4Var != null) {
            c4Var.setScaleX(1.0f);
            this.m.setScaleY(1.0f);
        }
    }

    public final void l() {
        o1.j jVar = this.b0;
        if (jVar != null) {
            jVar.d();
            this.b0 = null;
        }
        this.c0 = 0.0f;
        org.telegram.ui.Cells.s0 s0Var = this.a;
        s0Var.invalidate();
        if (s0Var.getParent() instanceof View) {
            ((View) s0Var.getParent()).invalidate();
        }
    }

    public final void m(boolean z10, TLRPC.TL_messageActionGramTransfer tL_messageActionGramTransfer, String str, int i10, boolean z11, boolean z12) {
        org.telegram.ui.Cells.s0 s0Var = this.a;
        if (z11) {
            f();
            this.M = false;
            this.N = 0L;
            this.h0 = false;
            k();
            o1.j jVar = this.Z;
            if (jVar != null) {
                jVar.d();
                this.Z = null;
            }
            this.a0 = 1.0f;
            s0Var.invalidate();
            if (s0Var.getParent() instanceof View) {
                ((View) s0Var.getParent()).invalidate();
            }
            l();
            this.R = 0.0f;
            this.S = 0L;
            this.l.stop();
            this.H = false;
        }
        this.g0 = z10;
        this.l0 = tL_messageActionGramTransfer;
        boolean z13 = !z10 && z12;
        this.i0 = z13;
        org.telegram.ui.Components.t5 t5Var = this.K;
        if (z13) {
            t5Var.e(true, 0.0f);
            this.M = false;
            this.N = 0L;
        } else if (z11) {
            t5Var.e(true, 1.0f);
            this.M = false;
            this.N = 0L;
        }
        this.m0 = false;
        boolean z14 = z10 && i10 == 2;
        boolean z15 = z10 && i10 == 1;
        if (this.h0 && z10 && i10 == 0) {
            b();
            g();
            this.t = 18.0f;
            this.u.f();
            s0Var.invalidate();
        }
        if (z15) {
            if (!this.h0) {
                this.P = SystemClock.elapsedRealtime();
            }
            t5Var.e(true, 0.0f);
            this.M = false;
            this.N = 0L;
        } else if (z14) {
            t5Var.e(true, 1.0f);
            this.M = false;
            this.N = 0L;
        }
        q();
        this.h0 = z15;
        this.S = z15 ? SystemClock.elapsedRealtime() : 0L;
        if (z15) {
            e();
            b4 b4Var = this.d0;
            b4Var.getClass();
            b4Var.v = Math.max(0L, 0L);
            if (this.d0.d() || this.d0.c()) {
                b4 b4Var2 = this.d0;
                b4Var2.b = -1L;
                b4Var2.c = -1L;
            }
            s0Var.invalidate();
        } else {
            b4 b4Var3 = this.d0;
            if (b4Var3 != null && this.e0 == 0 && !b4Var3.d() && !this.d0.c()) {
                this.d0.a();
                s0Var.invalidate();
            }
        }
        int w02 = z14 ? org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.q7, this.b) : z10 ? -15352320 : -11814402;
        this.y0 = z14;
        int i11 = this.U;
        if (i11 == 0) {
            this.V = w02;
            this.U = w02;
            this.T = w02;
        } else if (w02 != i11) {
            this.T = this.V;
            this.U = w02;
            this.J.e(true, 0.0f);
            s0Var.invalidate();
        }
        String L0 = z14 ? cd.L0(2131743005, null) : z10 ? cd.L0(2131743003, null) : cd.L0(2131743004, null);
        a4 a4Var = this.I;
        if (z15) {
            a4Var.f(10, L0, true);
        } else {
            a4Var.g(10, L0);
        }
        SpannableStringBuilder q6 = k0.q(k0.o(Math.abs(tL_messageActionGramTransfer.amount), false), 0.75f);
        for (RelativeSizeSpan relativeSizeSpan : (RelativeSizeSpan[]) q6.getSpans(0, q6.length(), RelativeSizeSpan.class)) {
            q6.removeSpan(relativeSizeSpan);
        }
        q6.insert(0, (CharSequence) (z10 ? "–" : "+"));
        int indexOf = q6.toString().indexOf(46);
        if (indexOf >= 0) {
            q6.setSpan(new RelativeSizeSpan(0.75f), indexOf, q6.length(), 33);
        }
        Object obj = new Object();
        q6.setSpan(obj, 0, q6.length(), 33);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(k0.l("Grams", q6, 2131749516));
        int spanStart = spannableStringBuilder.getSpanStart(obj);
        int spanEnd = spannableStringBuilder.getSpanEnd(obj);
        spannableStringBuilder.removeSpan(obj);
        bi.m6 m6Var = this.u0;
        if (spanStart > 0) {
            spannableStringBuilder.setSpan(CharacterStyle.wrap(m6Var), 0, spanStart, 33);
        }
        if (spanEnd >= 0 && spanEnd < spannableStringBuilder.length()) {
            spannableStringBuilder.setSpan(CharacterStyle.wrap(m6Var), spanEnd, spannableStringBuilder.length(), 33);
        }
        this.n0 = new qz0(spannableStringBuilder, 16.0f, org.telegram.messenger.i0.o());
        String str2 = tL_messageActionGramTransfer.peer_address;
        Locale locale = Locale.US;
        String f7 = l6.f(l6.d(str2.toUpperCase(locale)));
        qz0 qz0Var = new qz0("", 9.3f, org.telegram.messenger.i0.o1("fonts/rmono.ttf"));
        qz0Var.m(2);
        this.o0 = qz0Var;
        qz0Var.q(f7);
        if (TextUtils.isEmpty(str)) {
            this.p0 = null;
        } else {
            qz0 qz0Var2 = new qz0("", 10.0f, Typeface.create(org.telegram.messenger.i0.o1("fonts/rmono.ttf"), 1));
            this.p0 = qz0Var2;
            qz0Var2.q(TextUtils.ellipsize(org.telegram.messenger.i0.M2(str.toUpperCase(locale)), this.p0.a, org.telegram.messenger.i0.L(206.0f) - org.telegram.messenger.i0.L(24.0f), TextUtils.TruncateAt.END));
        }
        Stack stack = this.d;
        ArrayList arrayList = this.c;
        stack.addAll(arrayList);
        arrayList.clear();
        if (TextUtils.isEmpty(tL_messageActionGramTransfer.comment)) {
            this.q0 = null;
            return;
        }
        qz0 qz0Var3 = new qz0("", 12.0f, null);
        qz0Var3.m(ConnectionsManager.DEFAULT_DATACENTER_ID);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        qz0Var3.a();
        qz0Var3.p(org.telegram.messenger.i0.L(184.0f));
        this.q0 = qz0Var3;
        if ((!tL_messageActionGramTransfer.comment_encrypted && !tL_messageActionGramTransfer.comment_encrypted_preparing) || this.m0) {
            qz0Var3.q(org.telegram.messenger.k6.m(tL_messageActionGramTransfer.comment, qz0Var3.a.getFontMetricsInt(), false, null, 0));
            return;
        }
        StringBuilder sb2 = new StringBuilder(25);
        for (int i12 = 0; i12 < 25; i12++) {
            sb2.append("a");
        }
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(sb2.toString());
        yz0 yz0Var = new yz0();
        yz0Var.a |= 256;
        spannableStringBuilder2.setSpan(new zz0(yz0Var, 0), 0, spannableStringBuilder2.length(), 33);
        this.q0.q(spannableStringBuilder2);
        nh.i.c(s0Var, this.q0.b, stack, arrayList);
        n(this.e);
    }

    public final void n(boolean z10) {
        this.e = z10;
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((nh.i) obj).invalidateSelf();
        }
    }

    public final void o(float f7, float f10) {
        this.p = f7;
        this.q = f10;
    }

    public final void p() {
        if (this.m == null) {
            return;
        }
        if (this.x == -1 && !this.D) {
            this.A = g();
            this.B = this.k.E * 0.14f;
        }
        boolean z10 = true;
        boolean z11 = this.x != -1 || this.D || this.C > 1.001f;
        c4 c4Var = this.m;
        float f7 = this.A;
        float f10 = this.B;
        if (!z11 && !this.h0 && this.r == 0.0f && this.s == 0.0f && this.t == 0.0f) {
            z10 = false;
        }
        c4Var.r = f7;
        c4Var.s = f10;
        c4Var.w = z10;
        c4Var.x = z11;
    }

    public final void q() {
        if (!this.h0 || this.S == 0) {
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.R = ((((elapsedRealtime - this.S) * 360.0f) / 4000.0f) + this.R) % 360.0f;
        this.S = elapsedRealtime;
    }
}
