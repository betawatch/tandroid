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
import org.telegram.messenger.id;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ah0;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.ny0;
import org.telegram.ui.Components.vy0;
import org.telegram.ui.Components.wy0;
import org.telegram.ui.Components.xq;
import org.telegram.ui.xf;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes4.dex */
public final class b4 {
    public float A;
    public float B;
    public boolean D;
    public boolean E;
    public r1.g F;
    public ValueAnimator G;
    public boolean H;
    public final y3 I;
    public final org.telegram.ui.Components.w5 J;
    public final org.telegram.ui.Components.w5 K;
    public final Paint L;
    public boolean M;
    public long N;
    public final Paint O;
    public long P;
    public final org.telegram.ui.Components.w5 Q;
    public float R;
    public long S;
    public int T;
    public int U;
    public int V;
    public final Path W;
    public final Paint X;
    public final ic Y;
    public r1.g Z;
    public final org.telegram.ui.Cells.t0 a;
    public float a0;
    public final org.telegram.ui.ActionBar.g6 b;
    public r1.g b0;
    public float c0;
    public z3 d0;
    public boolean e;
    public long e0;
    public boolean f0;
    public boolean g0;
    public boolean h0;
    public final Drawable i;
    public boolean i0;
    public ValueAnimator j0;
    public final g6 k;
    public xf k0;
    public final ah0 l;
    public TLRPC.TL_messageActionGramTransfer l0;
    public a4 m;
    public boolean m0;
    public boolean n;
    public ny0 n0;
    public boolean o;
    public ny0 o0;
    public float p;
    public ny0 p0;
    public float q;
    public ny0 q0;
    public float r;
    public boolean r0;
    public float s;
    public org.telegram.ui.Cells.m0 s0;
    public float t;
    public int t0;
    public final li.w5 u0;
    public long v;
    public int v0;
    public final org.telegram.ui.Components.w5 w0;
    public final w3 x0;
    public float y;
    public boolean y0;
    public float z;
    public final ArrayList c = new ArrayList();
    public final Stack d = new Stack();
    public final RectF f = new RectF();
    public final RectF g = new RectF();
    public final Path h = new Path();
    public final Path j = new Path();
    public final n9 u = new n9();
    public final Rect w = new Rect();
    public int x = -1;
    public float C = 1.0f;

    public b4(org.telegram.ui.Cells.t0 t0Var, org.telegram.ui.ActionBar.g6 g6Var) {
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
        this.u0 = new li.w5(this, 4);
        this.v0 = -1;
        new Paint(1);
        new Paint(1);
        this.x0 = new w3();
        this.a = t0Var;
        this.b = g6Var;
        this.i = t0Var.getResources().getDrawable(R.drawable.wallet_action_card_gradient).mutate();
        Context context = t0Var.getContext();
        if (g6.G == null) {
            g6.G = new g6(context.getApplicationContext());
        }
        this.k = g6.G;
        ah0 ah0Var = new ah0(R.raw.wallet_diamond_white, org.telegram.messenger.g0.L(42.0f), org.telegram.messenger.g0.L(42.0f), false, null);
        this.l = ah0Var;
        ah0Var.R(t0Var);
        ah0Var.K(0);
        t0Var.addOnAttachStateChangeListener(new org.telegram.ui.Components.aa(2, this, t0Var));
        paint2.setColor(-10033409);
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        paint2.setStrokeWidth(org.telegram.messenger.g0.N(1.0f));
        int i7 = 6;
        l lVar = new l(t0Var, i7);
        xq xqVar = xq.h;
        this.Q = new org.telegram.ui.Components.w5(1.0f, lVar, 0L, 180L, xqVar);
        this.K = new org.telegram.ui.Components.w5(new l(t0Var, i7), 320L, xqVar, 0);
        this.J = new org.telegram.ui.Components.w5(new l(t0Var, i7), 320L, xqVar, 0);
        y3 y3Var = new y3(t0Var, t0Var);
        this.I = y3Var;
        y3Var.y = -1;
        zh.b1.d(path, 1.0f, false);
        paint3.setStyle(style);
        paint3.setStrokeWidth(org.telegram.messenger.g0.N(4.0f));
        paint3.setPathEffect(new CornerPathEffect(org.telegram.messenger.g0.L(2.33f)));
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint3.setShader(new LinearGradient(0.0f, 0.0f, org.telegram.messenger.g0.L(48.0f), org.telegram.messenger.g0.L(48.0f), new int[]{16777215, org.telegram.ui.ActionBar.l6.r1(0.35f, 16777215), 16777215}, new float[]{0.0f, 0.5f, 1.0f}, tileMode));
        paint.setShader(new LinearGradient(-org.telegram.messenger.g0.L(10.0f), 0.0f, org.telegram.messenger.g0.L(10.0f), 0.0f, new int[]{16777215, -2130706433, 16777215}, new float[]{0.0f, 0.5f, 1.0f}, tileMode));
        ic icVar = new ic(t0Var);
        this.Y = icVar;
        icVar.f = new x3(this, 0);
        this.w0 = new org.telegram.ui.Components.w5(1.0f, new l(t0Var, i7), 0L, 400L, xqVar);
    }

    public static int h() {
        return org.telegram.messenger.g0.L(206.0f);
    }

    public final void a(float f10) {
        if (this.F == null) {
            r1.g gVar = new r1.g(new r1.f(this.C));
            this.F = gVar;
            r1.h hVar = new r1.h(f10);
            hVar.a(0.55f);
            hVar.b(280.0f);
            gVar.m = hVar;
            this.F.f(0.001f);
            this.F.b(new v3(this, 0));
        }
        this.F.c(f10);
    }

    public final void b() {
        org.telegram.ui.Cells.t0 t0Var = this.a;
        if (t0Var.isShown()) {
            org.telegram.messenger.g0.c4(t0Var);
        }
        r1.g gVar = this.Z;
        if (gVar != null) {
            gVar.d();
        }
        r1.g gVar2 = new r1.g(new r1.f(this.a0));
        this.Z = gVar2;
        r1.h hVar = new r1.h(1.0f);
        hVar.a(0.55f);
        hVar.b(280.0f);
        gVar2.m = hVar;
        this.Z.f(0.001f);
        r1.g gVar3 = this.Z;
        gVar3.a = -3.0f;
        gVar3.b(new v3(this, 2));
        this.Z.h();
    }

    public final void c(Canvas canvas, float f10, float f11) {
        canvas.translate(0.0f, org.telegram.messenger.g0.L(4.0f) * this.c0);
        ic icVar = this.Y;
        canvas.scale(com.google.android.recaptcha.internal.a.B(this.c0, 0.012f, 1.0f, icVar.a(0.025f) * this.a0), com.google.android.recaptcha.internal.a.C(this.c0, 0.04f, 1.0f, icVar.a(0.025f) * this.a0), (org.telegram.messenger.g0.L(206.0f) / 2.0f) + f10, f11 + org.telegram.messenger.g0.L(70.0f));
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
        float f10;
        float f11;
        n9 n9Var;
        boolean z9;
        boolean z10;
        ny0 ny0Var;
        Canvas canvas2;
        z3 z3Var;
        float e10;
        boolean z11;
        float f12;
        float e11;
        float f13;
        long j3;
        float f14;
        a4 a4Var;
        canvas.save();
        ic icVar = this.Y;
        float B = com.google.android.recaptcha.internal.a.B(this.c0, 0.012f, 1.0f, icVar.a(0.025f) * this.a0);
        float C = com.google.android.recaptcha.internal.a.C(this.c0, 0.04f, 1.0f, icVar.a(0.025f) * this.a0);
        float L = org.telegram.messenger.g0.L(4.0f) * this.c0;
        c(canvas, 0.0f, 0.0f);
        float L2 = org.telegram.messenger.g0.L(4.0f);
        RectF rectF = this.f;
        rectF.set(L2, L2, org.telegram.messenger.g0.L(206.0f) - L2, org.telegram.messenger.g0.L(140.0f) - L2);
        Canvas.EdgeType edgeType = Canvas.EdgeType.AA;
        boolean quickReject = canvas.quickReject(rectF, edgeType);
        org.telegram.ui.Cells.t0 t0Var = this.a;
        g6 g6Var = this.k;
        if (quickReject) {
            f10 = 4.0f;
        } else {
            Handler handler = g6Var.d;
            f10 = 4.0f;
            Sensor sensor = g6Var.b;
            if (sensor != null && t0Var.isAttachedToWindow() && t0Var.isShown() && t0Var.getWindowVisibility() == 0) {
                f11 = 206.0f;
                g6Var.e.put(t0Var, Long.valueOf(SystemClock.uptimeMillis()));
                if (!g6Var.r) {
                    g6Var.s = false;
                    boolean registerListener = g6Var.a.registerListener(g6Var, sensor, 1, handler);
                    g6Var.r = registerListener;
                    if (registerListener) {
                        handler.postDelayed(g6Var.F, 250L);
                    }
                }
                Path path = this.j;
                path.rewind();
                float L3 = org.telegram.messenger.g0.L(16.0f);
                float L4 = org.telegram.messenger.g0.L(16.0f);
                Path.Direction direction = Path.Direction.CW;
                path.addRoundRect(rectF, L3, L4, direction);
                canvas.save();
                canvas.clipPath(path);
                canvas.translate((org.telegram.messenger.g0.L(10.0f) * g6Var.D) + rectF.centerX(), (org.telegram.messenger.g0.L(8.0f) * g6Var.E) + rectF.centerY());
                q();
                canvas.rotate((g6Var.E * 6.0f) + (g6Var.D * 14.0f) + this.R);
                float hypot = (((float) Math.hypot(rectF.width(), rectF.height())) / 2.0f) + org.telegram.messenger.g0.L(16.0f);
                Drawable drawable = this.i;
                int max = Math.max(1, drawable.getIntrinsicWidth());
                int max2 = Math.max(1, drawable.getIntrinsicHeight());
                float min = hypot / Math.min(max, max2);
                int ceil = (int) Math.ceil(max * min);
                int ceil2 = (int) Math.ceil(max2 * min);
                float e12 = this.w0.e(false, 1.0f);
                drawable.setBounds(-ceil, -ceil2, ceil, ceil2);
                drawable.draw(canvas);
                this.t0 = e12 < 1.0f ? i0.a.f(e12, -10624001, -10624001) : -10624001;
                canvas.restore();
                int L5 = org.telegram.messenger.g0.L(42.0f);
                float f15 = L5 / 2.0f;
                int round = Math.round(rectF.centerX() - f15);
                float max3 = Math.max(0.0f, Math.min(1.0f, (this.C - 1.0f) / 2.0f));
                float L6 = rectF.top + org.telegram.messenger.g0.L(8.0f);
                int round2 = Math.round((((rectF.centerY() - f15) - L6) * max3) + L6);
                int i7 = round + L5;
                int i10 = L5 + round2;
                ah0 ah0Var = this.l;
                ah0Var.setBounds(round, round2, i7, i10);
                boolean quickReject2 = canvas.quickReject(round, round2, i7, i10, edgeType);
                Rect bounds = ah0Var.getBounds();
                Rect rect = this.w;
                rect.set(bounds);
                n9Var = this.u;
                if (n9Var.d()) {
                    canvas.save();
                    canvas.clipPath(path);
                    canvas.translate(rect.exactCenterX(), rect.exactCenterY());
                    n9Var.c(canvas);
                    canvas.restore();
                    t0Var.postInvalidateOnAnimation();
                }
                p();
                if (this.m != null) {
                    float exactCenterX = ((rect.exactCenterX() - (org.telegram.messenger.g0.L(f11) / 2.0f)) * B) + (org.telegram.messenger.g0.L(f11) / 2.0f);
                    float z12 = com.google.android.recaptcha.internal.a.z(rect.exactCenterY(), org.telegram.messenger.g0.L(70.0f), C, L + org.telegram.messenger.g0.L(70.0f));
                    this.m.setTranslationX((this.p + exactCenterX) - f15);
                    this.m.setTranslationY((this.q + z12) - f15);
                    this.m.setScaleX(B * this.C);
                    this.m.setScaleY(C * this.C);
                }
                z9 = quickReject2 && (a4Var = this.m) != null && a4Var.n;
                if (!z9) {
                    ah0Var.stop();
                    this.H = false;
                } else if (!this.H && !quickReject2) {
                    z10 = true;
                    this.H = true;
                    ah0Var.T(true, 0.0f);
                    ah0Var.start();
                    if (!z9 && !this.E) {
                        ah0Var.draw(canvas);
                    }
                    ny0Var = this.n0;
                    if (ny0Var != null) {
                        float k10 = ny0Var.k();
                        float width = rectF.width() - org.telegram.messenger.g0.L(16.0f);
                        float f16 = k10 > width ? width / k10 : 1.0f;
                        float L7 = rectF.top + org.telegram.messenger.g0.L(55.0f) + (this.n0.i() / 2.0f);
                        canvas.save();
                        canvas.scale(f16, f16, rectF.centerX(), L7);
                        this.n0.c(rectF.centerX() - (k10 / 2.0f), L7, 1.0f, -1, canvas);
                        canvas.restore();
                    }
                    if (this.o0 != null) {
                        float L8 = (org.telegram.messenger.g0.L(f11) - this.o0.k()) / 2.0f;
                        float L9 = (rectF.bottom - org.telegram.messenger.g0.L(7.0f)) - this.o0.i();
                        ny0 ny0Var2 = this.p0;
                        if (ny0Var2 != null) {
                            ny0Var2.c((org.telegram.messenger.g0.L(f11) - this.p0.k()) / 2.0f, (L9 - org.telegram.messenger.g0.L(f10)) - (this.p0.i() / 2.0f), 1.0f, this.t0, canvas);
                        }
                        this.o0.c(L8, L9 + org.telegram.messenger.g0.L(1.0f), 1.0f, 268435455, canvas);
                        canvas2 = canvas;
                        this.o0.c(L8, L9, 1.0f, e12 < 1.0f ? i0.a.f(e12, -16693808, -16693808) : -16693808, canvas2);
                    } else {
                        canvas2 = canvas;
                    }
                    z3Var = this.d0;
                    if (z3Var != null && !z3Var.c()) {
                        if (this.e0 != 0 && !this.h0 && !this.f0 && SystemClock.elapsedRealtime() - this.e0 >= 600) {
                            this.d0.a();
                            this.f0 = z10;
                        }
                        float strokeWidth = this.d0.x.getStrokeWidth() / 2.0f;
                        RectF rectF2 = this.g;
                        rectF2.set(rectF);
                        rectF2.inset(strokeWidth, strokeWidth);
                        float max4 = Math.max(0.0f, org.telegram.messenger.g0.L(16.0f) - strokeWidth);
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
                    boolean z13 = (valueAnimator != null || valueAnimator.getCurrentPlayTime() >= 1000) ? false : z10;
                    float f17 = (!this.h0 || this.i0 || z13) ? 0.0f : 1.0f;
                    org.telegram.ui.Components.w5 w5Var = this.K;
                    e10 = w5Var.e(false, f17);
                    z11 = this.h0;
                    org.telegram.ui.ActionBar.g6 g6Var2 = this.b;
                    if (!z11 || this.i0 || z13) {
                        f12 = 255.0f;
                    } else {
                        boolean z14 = this.y0;
                        org.telegram.ui.Components.w5 w5Var2 = this.J;
                        if (z14) {
                            f13 = 1.0f;
                            if (w5Var2.c >= 1.0f) {
                                this.U = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.q7, g6Var2);
                            }
                        } else {
                            f13 = 1.0f;
                        }
                        float e13 = w5Var2.e(false, f13);
                        int f18 = e13 >= f13 ? this.U : i0.a.f(e13, this.T, this.U);
                        this.V = f18;
                        y3 y3Var = this.I;
                        Paint paint = (Paint) y3Var.b;
                        f12 = 255.0f;
                        paint.setShader(null);
                        paint.setColor(f18);
                        y3Var.setBounds(((int) rectF.right) - org.telegram.messenger.g0.L(46.0f), ((int) rectF.top) - org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f) + ((int) rectF.right), org.telegram.messenger.g0.L(46.0f) + ((int) rectF.top));
                        canvas2.save();
                        if (e10 < 1.0f) {
                            float exactCenterX2 = y3Var.getBounds().exactCenterX();
                            f14 = 48.0f;
                            float exactCenterY = y3Var.getBounds().exactCenterY();
                            j3 = 0;
                            float L10 = org.telegram.messenger.g0.L(48.0f) * ((float) Math.sqrt(0.5d)) * e10;
                            canvas2.rotate(45.0f, exactCenterX2, exactCenterY);
                            canvas2.clipRect(exactCenterX2 - L10, exactCenterY - org.telegram.messenger.g0.L(48.0f), L10 + exactCenterX2, org.telegram.messenger.g0.L(48.0f) + exactCenterY);
                            canvas2.rotate(-45.0f, exactCenterX2, exactCenterY);
                        } else {
                            j3 = 0;
                            f14 = 48.0f;
                        }
                        y3Var.draw(canvas2);
                        if (this.U != -15352320) {
                            e13 = this.T == -15352320 ? 1.0f - e13 : 0.0f;
                        }
                        Path path3 = this.W;
                        if (e13 > 0.0f) {
                            Rect bounds2 = y3Var.getBounds();
                            canvas2.save();
                            canvas2.translate(bounds2.right - org.telegram.messenger.g0.L(f14), bounds2.top);
                            canvas2.clipPath(path3);
                            Paint paint2 = this.X;
                            paint2.setAlpha((int) (e13 * 255.0f));
                            canvas2.drawPath(path3, paint2);
                            canvas2.restore();
                        }
                        if (e10 < 1.0f || w5Var.i) {
                            this.M = true;
                            this.N = 0L;
                        } else {
                            long elapsedRealtime = SystemClock.elapsedRealtime();
                            if (this.M) {
                                this.M = false;
                                this.N = elapsedRealtime + 500;
                                t0Var.postInvalidateDelayed(500L);
                            }
                            long j10 = this.N;
                            if (j10 != j3 && elapsedRealtime >= j10) {
                                float f19 = (elapsedRealtime - j10) / 600.0f;
                                if (f19 >= 1.0f) {
                                    this.N = j3;
                                } else {
                                    Rect bounds3 = y3Var.getBounds();
                                    canvas2.save();
                                    canvas2.translate(bounds3.right - org.telegram.messenger.g0.L(f14), bounds3.top);
                                    canvas2.clipPath(path3);
                                    canvas2.rotate(45.0f);
                                    float L11 = org.telegram.messenger.g0.L(10.0f);
                                    float f20 = -L11;
                                    canvas2.translate((((L11 * 2.0f) + (org.telegram.messenger.g0.L(f14) * ((float) Math.sqrt(2.0d)))) * f19) + f20, 0.0f);
                                    canvas.drawRect(f20, -org.telegram.messenger.g0.L(f14), L11, org.telegram.messenger.g0.L(f14), this.L);
                                    canvas2 = canvas;
                                    canvas2.restore();
                                    t0Var.postInvalidateOnAnimation();
                                }
                            }
                        }
                        canvas2.restore();
                    }
                    e11 = this.Q.e(false, this.E ? 0.0f : 1.0f);
                    if (this.g0 && !this.E && e10 < 1.0f && e11 > 0.0f) {
                        int round3 = Math.round((1.0f - e10) * e11 * f12);
                        Paint paint3 = this.O;
                        paint3.setAlpha(round3);
                        float N = rectF.right - org.telegram.messenger.g0.N(15.5f);
                        float N2 = org.telegram.messenger.g0.N(15.5f) + rectF.top;
                        canvas2.drawCircle(N, N2, org.telegram.messenger.g0.N(5.0f), paint3);
                        long elapsedRealtime2 = SystemClock.elapsedRealtime() - this.P;
                        float f21 = ((elapsedRealtime2 % 2000) / 2000.0f) * 360.0f;
                        canvas2.save();
                        canvas2.rotate(f21, N, N2);
                        Canvas canvas3 = canvas2;
                        canvas3.drawLine(N, N2, N, N2 - org.telegram.messenger.g0.N(f10), paint3);
                        canvas3.rotate((360.0f * ((elapsedRealtime2 % 24000) / 24000.0f)) - f21, N, N2);
                        canvas3.drawLine(N, N2, org.telegram.messenger.g0.N(2.5f) + N, N2, paint3);
                        canvas2 = canvas3;
                        canvas2.restore();
                        t0Var.postInvalidateOnAnimation();
                    }
                    if (this.q0 != null) {
                        int w02 = org.telegram.ui.ActionBar.l6.i1(g6Var2) ? org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.Fa, g6Var2) : -1;
                        TLRPC.TL_messageActionGramTransfer tL_messageActionGramTransfer = this.l0;
                        if ((tL_messageActionGramTransfer.comment_encrypted || tL_messageActionGramTransfer.comment_encrypted_preparing) && !this.m0) {
                            canvas2.save();
                            canvas2.translate((org.telegram.messenger.g0.L(f11) - this.q0.k()) / 2.0f, org.telegram.messenger.g0.L(143.0f));
                            ArrayList arrayList = this.c;
                            int size = arrayList.size();
                            int i11 = 0;
                            while (i11 < size) {
                                Object obj = arrayList.get(i11);
                                i11++;
                                xh.f fVar = (xh.f) obj;
                                fVar.h(w02);
                                fVar.draw(canvas2);
                            }
                            canvas2.restore();
                        } else {
                            this.q0.c((org.telegram.messenger.g0.L(f11) - this.q0.k()) / 2.0f, org.telegram.messenger.g0.L(143.0f), 1.0f, w02, canvas2);
                        }
                    }
                    canvas.restore();
                }
                z10 = true;
                if (!z9) {
                    ah0Var.draw(canvas);
                }
                ny0Var = this.n0;
                if (ny0Var != null) {
                }
                if (this.o0 != null) {
                }
                z3Var = this.d0;
                if (z3Var != null) {
                    if (this.e0 != 0) {
                        this.d0.a();
                        this.f0 = z10;
                    }
                    float strokeWidth2 = this.d0.x.getStrokeWidth() / 2.0f;
                    RectF rectF22 = this.g;
                    rectF22.set(rectF);
                    rectF22.inset(strokeWidth2, strokeWidth2);
                    float max42 = Math.max(0.0f, org.telegram.messenger.g0.L(16.0f) - strokeWidth2);
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
                org.telegram.ui.Components.w5 w5Var3 = this.K;
                e10 = w5Var3.e(false, f17);
                z11 = this.h0;
                org.telegram.ui.ActionBar.g6 g6Var22 = this.b;
                if (z11) {
                }
                f12 = 255.0f;
                e11 = this.Q.e(false, this.E ? 0.0f : 1.0f);
                if (this.g0) {
                    int round32 = Math.round((1.0f - e10) * e11 * f12);
                    Paint paint32 = this.O;
                    paint32.setAlpha(round32);
                    float N3 = rectF.right - org.telegram.messenger.g0.N(15.5f);
                    float N22 = org.telegram.messenger.g0.N(15.5f) + rectF.top;
                    canvas2.drawCircle(N3, N22, org.telegram.messenger.g0.N(5.0f), paint32);
                    long elapsedRealtime22 = SystemClock.elapsedRealtime() - this.P;
                    float f212 = ((elapsedRealtime22 % 2000) / 2000.0f) * 360.0f;
                    canvas2.save();
                    canvas2.rotate(f212, N3, N22);
                    Canvas canvas32 = canvas2;
                    canvas32.drawLine(N3, N22, N3, N22 - org.telegram.messenger.g0.N(f10), paint32);
                    canvas32.rotate((360.0f * ((elapsedRealtime22 % 24000) / 24000.0f)) - f212, N3, N22);
                    canvas32.drawLine(N3, N22, org.telegram.messenger.g0.N(2.5f) + N3, N22, paint32);
                    canvas2 = canvas32;
                    canvas2.restore();
                    t0Var.postInvalidateOnAnimation();
                }
                if (this.q0 != null) {
                }
                canvas.restore();
            }
        }
        f11 = 206.0f;
        Path path4 = this.j;
        path4.rewind();
        float L32 = org.telegram.messenger.g0.L(16.0f);
        float L42 = org.telegram.messenger.g0.L(16.0f);
        Path.Direction direction2 = Path.Direction.CW;
        path4.addRoundRect(rectF, L32, L42, direction2);
        canvas.save();
        canvas.clipPath(path4);
        canvas.translate((org.telegram.messenger.g0.L(10.0f) * g6Var.D) + rectF.centerX(), (org.telegram.messenger.g0.L(8.0f) * g6Var.E) + rectF.centerY());
        q();
        canvas.rotate((g6Var.E * 6.0f) + (g6Var.D * 14.0f) + this.R);
        float hypot2 = (((float) Math.hypot(rectF.width(), rectF.height())) / 2.0f) + org.telegram.messenger.g0.L(16.0f);
        Drawable drawable2 = this.i;
        int max5 = Math.max(1, drawable2.getIntrinsicWidth());
        int max22 = Math.max(1, drawable2.getIntrinsicHeight());
        float min2 = hypot2 / Math.min(max5, max22);
        int ceil3 = (int) Math.ceil(max5 * min2);
        int ceil22 = (int) Math.ceil(max22 * min2);
        float e122 = this.w0.e(false, 1.0f);
        drawable2.setBounds(-ceil3, -ceil22, ceil3, ceil22);
        drawable2.draw(canvas);
        this.t0 = e122 < 1.0f ? i0.a.f(e122, -10624001, -10624001) : -10624001;
        canvas.restore();
        int L52 = org.telegram.messenger.g0.L(42.0f);
        float f152 = L52 / 2.0f;
        int round4 = Math.round(rectF.centerX() - f152);
        float max32 = Math.max(0.0f, Math.min(1.0f, (this.C - 1.0f) / 2.0f));
        float L62 = rectF.top + org.telegram.messenger.g0.L(8.0f);
        int round22 = Math.round((((rectF.centerY() - f152) - L62) * max32) + L62);
        int i72 = round4 + L52;
        int i102 = L52 + round22;
        ah0 ah0Var2 = this.l;
        ah0Var2.setBounds(round4, round22, i72, i102);
        boolean quickReject22 = canvas.quickReject(round4, round22, i72, i102, edgeType);
        Rect bounds4 = ah0Var2.getBounds();
        Rect rect2 = this.w;
        rect2.set(bounds4);
        n9Var = this.u;
        if (n9Var.d()) {
        }
        p();
        if (this.m != null) {
        }
        if (quickReject22) {
        }
        if (!z9) {
        }
        z10 = true;
        if (!z9) {
        }
        ny0Var = this.n0;
        if (ny0Var != null) {
        }
        if (this.o0 != null) {
        }
        z3Var = this.d0;
        if (z3Var != null) {
        }
        ValueAnimator valueAnimator22 = this.j0;
        if (valueAnimator22 != null) {
        }
        if (this.h0) {
        }
        org.telegram.ui.Components.w5 w5Var32 = this.K;
        e10 = w5Var32.e(false, f17);
        z11 = this.h0;
        org.telegram.ui.ActionBar.g6 g6Var222 = this.b;
        if (z11) {
        }
        f12 = 255.0f;
        e11 = this.Q.e(false, this.E ? 0.0f : 1.0f);
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
        z3 z3Var = new z3(this, this.b);
        this.d0 = z3Var;
        z3Var.g(4969977, org.telegram.ui.ActionBar.l6.r1(0.125f, -11807239), 4969977, org.telegram.ui.ActionBar.l6.r1(0.75f, -11807239));
        this.d0.x.setStrokeWidth(org.telegram.messenger.g0.N(2.0f));
        z3 z3Var2 = this.d0;
        z3Var2.t = 2.0f;
        z3Var2.y = this.h;
        z3Var2.D = true;
    }

    public final void f() {
        ValueAnimator valueAnimator = this.j0;
        if (valueAnimator == null) {
            return;
        }
        this.j0 = null;
        valueAnimator.removeAllListeners();
        valueAnimator.cancel();
        org.telegram.ui.Components.w5 w5Var = this.K;
        if (w5Var.i) {
            this.M = false;
            this.N = 0L;
        }
        w5Var.e(true, 1.0f);
        this.t = 0.0f;
        this.u.a.clear();
        xf xfVar = this.k0;
        this.k0 = null;
        this.a.invalidate();
        if (xfVar != null) {
            org.telegram.messenger.g0.i3(xfVar, 1L);
        }
    }

    public final float g() {
        long uptimeMillis = SystemClock.uptimeMillis();
        if (this.v != 0) {
            float min = Math.min(0.1f, (uptimeMillis - r2) / 1000.0f);
            float f10 = this.h0 ? 1.7883515f : 0.0f;
            float f11 = -min;
            float exp = (float) Math.exp(f11 / 0.2f);
            float f12 = (min * f10) + this.r;
            float f13 = this.s;
            this.r = (((1.0f - exp) * ((f13 - f10) * 0.2f)) + f12) % 6.2831855f;
            this.s = com.google.android.recaptcha.internal.a.z(f13, f10, exp, f10);
            float exp2 = (float) Math.exp(f11 / 0.75f);
            float f14 = this.r;
            float f15 = this.t;
            this.r = (((1.0f - exp2) * (0.75f * f15)) + f14) % 6.2831855f;
            float f16 = f15 * exp2;
            this.t = f16;
            if (f16 < 0.001f) {
                this.t = 0.0f;
            }
        }
        this.v = uptimeMillis;
        return (this.k.D * 0.14f) + ((float) (((uptimeMillis / 1000.0d) * 0.5961171984672546d) % 6.283185307179586d)) + this.r;
    }

    public final void i(boolean z9) {
        if (z9) {
            this.Q.e(true, 0.0f);
        } else if (this.E && this.h0) {
            this.P = SystemClock.elapsedRealtime();
        }
        this.E = z9;
        a4 a4Var = this.m;
        if (a4Var != null) {
            a4Var.setAlpha(z9 ? 0.0f : 1.0f);
        }
        this.a.invalidate();
    }

    public final void j() {
        this.x = -1;
        org.telegram.ui.Cells.t0 t0Var = this.a;
        if (t0Var.getParent() != null) {
            t0Var.getParent().requestDisallowInterceptTouchEvent(false);
        }
        float IEEEremainder = (float) Math.IEEEremainder(this.A - g(), 6.283185307179586d);
        float IEEEremainder2 = (float) Math.IEEEremainder(this.B - (this.k.E * 0.14f), 6.283185307179586d);
        this.D = true;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.G = ofFloat;
        ofFloat.setDuration(350L);
        this.G.setInterpolator(xq.h);
        this.G.addUpdateListener(new fi.k9(this, IEEEremainder, IEEEremainder2, 4));
        this.G.start();
        a(1.0f);
    }

    public final void k() {
        i(false);
        this.Q.e(true, 1.0f);
        if (this.x != -1) {
            org.telegram.ui.Cells.t0 t0Var = this.a;
            if (t0Var.getParent() != null) {
                t0Var.getParent().requestDisallowInterceptTouchEvent(false);
            }
        }
        this.x = -1;
        ValueAnimator valueAnimator = this.G;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.G = null;
        }
        r1.g gVar = this.F;
        if (gVar != null) {
            gVar.d();
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
        a4 a4Var = this.m;
        if (a4Var != null) {
            a4Var.setScaleX(1.0f);
            this.m.setScaleY(1.0f);
        }
    }

    public final void l() {
        r1.g gVar = this.b0;
        if (gVar != null) {
            gVar.d();
            this.b0 = null;
        }
        this.c0 = 0.0f;
        org.telegram.ui.Cells.t0 t0Var = this.a;
        t0Var.invalidate();
        if (t0Var.getParent() instanceof View) {
            ((View) t0Var.getParent()).invalidate();
        }
    }

    public final void m(boolean z9, TLRPC.TL_messageActionGramTransfer tL_messageActionGramTransfer, String str, int i7, boolean z10, boolean z11) {
        org.telegram.ui.Cells.t0 t0Var = this.a;
        if (z10) {
            f();
            this.M = false;
            this.N = 0L;
            this.h0 = false;
            k();
            r1.g gVar = this.Z;
            if (gVar != null) {
                gVar.d();
                this.Z = null;
            }
            this.a0 = 1.0f;
            t0Var.invalidate();
            if (t0Var.getParent() instanceof View) {
                ((View) t0Var.getParent()).invalidate();
            }
            l();
            this.R = 0.0f;
            this.S = 0L;
            this.l.stop();
            this.H = false;
        }
        this.g0 = z9;
        this.l0 = tL_messageActionGramTransfer;
        boolean z12 = !z9 && z11;
        this.i0 = z12;
        org.telegram.ui.Components.w5 w5Var = this.K;
        if (z12) {
            w5Var.e(true, 0.0f);
            this.M = false;
            this.N = 0L;
        } else if (z10) {
            w5Var.e(true, 1.0f);
            this.M = false;
            this.N = 0L;
        }
        this.m0 = false;
        boolean z13 = z9 && i7 == 2;
        boolean z14 = z9 && i7 == 1;
        if (this.h0 && z9 && i7 == 0) {
            b();
            g();
            this.t = 18.0f;
            this.u.f();
            t0Var.invalidate();
        }
        if (z14) {
            if (!this.h0) {
                this.P = SystemClock.elapsedRealtime();
            }
            w5Var.e(true, 0.0f);
            this.M = false;
            this.N = 0L;
        } else if (z13) {
            w5Var.e(true, 1.0f);
            this.M = false;
            this.N = 0L;
        }
        q();
        this.h0 = z14;
        this.S = z14 ? SystemClock.elapsedRealtime() : 0L;
        if (z14) {
            e();
            z3 z3Var = this.d0;
            z3Var.getClass();
            z3Var.v = Math.max(0L, 0L);
            if (this.d0.d() || this.d0.c()) {
                z3 z3Var2 = this.d0;
                z3Var2.b = -1L;
                z3Var2.c = -1L;
            }
            t0Var.invalidate();
        } else {
            z3 z3Var3 = this.d0;
            if (z3Var3 != null && this.e0 == 0 && !z3Var3.d() && !this.d0.c()) {
                this.d0.a();
                t0Var.invalidate();
            }
        }
        int w02 = z13 ? org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.q7, this.b) : z9 ? -15352320 : -11814402;
        this.y0 = z13;
        int i10 = this.U;
        if (i10 == 0) {
            this.V = w02;
            this.U = w02;
            this.T = w02;
        } else if (w02 != i10) {
            this.T = this.V;
            this.U = w02;
            this.J.e(true, 0.0f);
            t0Var.invalidate();
        }
        String M0 = z13 ? id.M0(2131742979, null) : z9 ? id.M0(2131742977, null) : id.M0(2131742978, null);
        y3 y3Var = this.I;
        if (z14) {
            y3Var.f(10, M0, true);
        } else {
            y3Var.g(10, M0);
        }
        SpannableStringBuilder q10 = l0.q(l0.o(Math.abs(tL_messageActionGramTransfer.amount), false), 0.75f);
        for (RelativeSizeSpan relativeSizeSpan : (RelativeSizeSpan[]) q10.getSpans(0, q10.length(), RelativeSizeSpan.class)) {
            q10.removeSpan(relativeSizeSpan);
        }
        q10.insert(0, (CharSequence) (z9 ? "–" : "+"));
        int indexOf = q10.toString().indexOf(46);
        if (indexOf >= 0) {
            q10.setSpan(new RelativeSizeSpan(0.75f), indexOf, q10.length(), 33);
        }
        Object obj = new Object();
        q10.setSpan(obj, 0, q10.length(), 33);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(l0.l("Grams", q10, 2131749507));
        int spanStart = spannableStringBuilder.getSpanStart(obj);
        int spanEnd = spannableStringBuilder.getSpanEnd(obj);
        spannableStringBuilder.removeSpan(obj);
        li.w5 w5Var2 = this.u0;
        if (spanStart > 0) {
            spannableStringBuilder.setSpan(CharacterStyle.wrap(w5Var2), 0, spanStart, 33);
        }
        if (spanEnd >= 0 && spanEnd < spannableStringBuilder.length()) {
            spannableStringBuilder.setSpan(CharacterStyle.wrap(w5Var2), spanEnd, spannableStringBuilder.length(), 33);
        }
        this.n0 = new ny0(spannableStringBuilder, 16.0f, org.telegram.messenger.g0.o());
        String str2 = tL_messageActionGramTransfer.peer_address;
        Locale locale = Locale.US;
        String f10 = f6.f(f6.d(str2.toUpperCase(locale)));
        ny0 ny0Var = new ny0("", 9.3f, org.telegram.messenger.g0.o1("fonts/rmono.ttf"));
        ny0Var.m(2);
        this.o0 = ny0Var;
        ny0Var.q(f10);
        if (TextUtils.isEmpty(str)) {
            this.p0 = null;
        } else {
            ny0 ny0Var2 = new ny0("", 10.0f, Typeface.create(org.telegram.messenger.g0.o1("fonts/rmono.ttf"), 1));
            this.p0 = ny0Var2;
            ny0Var2.q(TextUtils.ellipsize(org.telegram.messenger.g0.N2(str.toUpperCase(locale)), this.p0.a, org.telegram.messenger.g0.L(206.0f) - org.telegram.messenger.g0.L(24.0f), TextUtils.TruncateAt.END));
        }
        Stack stack = this.d;
        ArrayList arrayList = this.c;
        stack.addAll(arrayList);
        arrayList.clear();
        if (TextUtils.isEmpty(tL_messageActionGramTransfer.comment)) {
            this.q0 = null;
            return;
        }
        ny0 ny0Var3 = new ny0("", 12.0f, null);
        ny0Var3.m(ConnectionsManager.DEFAULT_DATACENTER_ID);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        ny0Var3.a();
        ny0Var3.p(org.telegram.messenger.g0.L(184.0f));
        this.q0 = ny0Var3;
        if ((!tL_messageActionGramTransfer.comment_encrypted && !tL_messageActionGramTransfer.comment_encrypted_preparing) || this.m0) {
            ny0Var3.q(org.telegram.messenger.i6.m(tL_messageActionGramTransfer.comment, ny0Var3.a.getFontMetricsInt(), false, null, 0));
            return;
        }
        StringBuilder sb2 = new StringBuilder(25);
        for (int i11 = 0; i11 < 25; i11++) {
            sb2.append("a");
        }
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(sb2.toString());
        vy0 vy0Var = new vy0();
        vy0Var.a |= 256;
        spannableStringBuilder2.setSpan(new wy0(vy0Var, 0), 0, spannableStringBuilder2.length(), 33);
        this.q0.q(spannableStringBuilder2);
        xh.f.c(t0Var, this.q0.b, stack, arrayList);
        n(this.e);
    }

    public final void n(boolean z9) {
        this.e = z9;
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ((xh.f) obj).invalidateSelf();
        }
    }

    public final void o(float f10, float f11) {
        this.p = f10;
        this.q = f11;
    }

    public final void p() {
        if (this.m == null) {
            return;
        }
        if (this.x == -1 && !this.D) {
            this.A = g();
            this.B = this.k.E * 0.14f;
        }
        boolean z9 = true;
        boolean z10 = this.x != -1 || this.D || this.C > 1.001f;
        a4 a4Var = this.m;
        float f10 = this.A;
        float f11 = this.B;
        if (!z10 && !this.h0 && this.r == 0.0f && this.s == 0.0f && this.t == 0.0f) {
            z9 = false;
        }
        a4Var.r = f10;
        a4Var.s = f11;
        a4Var.w = z9;
        a4Var.x = z10;
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
