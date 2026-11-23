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
import org.telegram.messenger.hd;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.fz0;
import org.telegram.ui.Components.gz0;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.oh0;
import org.telegram.ui.Components.xy0;
import org.telegram.ui.vf;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
public final class m4 {
    public float A;
    public float B;
    public boolean D;
    public boolean E;
    public r1.g F;
    public ValueAnimator G;
    public boolean H;
    public final j4 I;
    public final org.telegram.ui.Components.d6 J;
    public final org.telegram.ui.Components.d6 K;
    public final Paint L;
    public boolean M;
    public long N;
    public final Paint O;
    public long P;
    public final org.telegram.ui.Components.d6 Q;
    public float R;
    public long S;
    public int T;
    public int U;
    public int V;
    public final Path W;
    public final Paint X;
    public final mc Y;
    public r1.g Z;
    public final org.telegram.ui.Cells.v0 a;
    public float a0;
    public final org.telegram.ui.ActionBar.h6 b;
    public r1.g b0;
    public float c0;
    public k4 d0;
    public boolean e;
    public long e0;
    public boolean f0;
    public boolean g0;
    public boolean h0;
    public final Drawable i;
    public boolean i0;
    public ValueAnimator j0;
    public final y6 k;
    public vf k0;
    public final oh0 l;
    public TLRPC.TL_messageActionGramTransfer l0;
    public l4 m;
    public boolean m0;
    public boolean n;
    public xy0 n0;
    public boolean o;
    public xy0 o0;
    public float p;
    public xy0 p0;
    public float q;
    public xy0 q0;
    public float r;
    public boolean r0;
    public float s;
    public org.telegram.ui.Cells.n0 s0;
    public float t;
    public int t0;
    public final oi.w5 u0;
    public long v;
    public int v0;
    public final org.telegram.ui.Components.d6 w0;
    public final h4 x0;
    public float y;
    public boolean y0;
    public float z;
    public final ArrayList c = new ArrayList();
    public final Stack d = new Stack();
    public final RectF f = new RectF();
    public final RectF g = new RectF();
    public final Path h = new Path();
    public final Path j = new Path();
    public final fa u = new fa();
    public final Rect w = new Rect();
    public int x = -1;
    public float C = 1.0f;

    public m4(org.telegram.ui.Cells.v0 v0Var, org.telegram.ui.ActionBar.h6 h6Var) {
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
        this.u0 = new oi.w5(this, 4);
        this.v0 = -1;
        new Paint(1);
        new Paint(1);
        this.x0 = new h4();
        this.a = v0Var;
        this.b = h6Var;
        this.i = v0Var.getResources().getDrawable(R.drawable.wallet_action_card_gradient).mutate();
        Context context = v0Var.getContext();
        if (y6.H == null) {
            y6.H = new y6(context.getApplicationContext());
        }
        this.k = y6.H;
        oh0 oh0Var = new oh0(R.raw.wallet_diamond_white, org.telegram.messenger.g0.L(42.0f), org.telegram.messenger.g0.L(42.0f), false, null);
        this.l = oh0Var;
        oh0Var.R(v0Var);
        oh0Var.K(0);
        v0Var.addOnAttachStateChangeListener(new org.telegram.ui.Components.ea(2, this, v0Var));
        paint2.setColor(-10033409);
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        paint2.setStrokeWidth(org.telegram.messenger.g0.N(1.0f));
        int i7 = 5;
        m mVar = new m(v0Var, i7);
        nr nrVar = nr.h;
        this.Q = new org.telegram.ui.Components.d6(1.0f, mVar, 0L, 180L, nrVar);
        this.K = new org.telegram.ui.Components.d6(new m(v0Var, i7), 320L, nrVar, 0);
        this.J = new org.telegram.ui.Components.d6(new m(v0Var, i7), 320L, nrVar, 0);
        j4 j4Var = new j4(v0Var, v0Var);
        this.I = j4Var;
        j4Var.y = -1;
        bi.j3.d(path, 1.0f, false);
        paint3.setStyle(style);
        paint3.setStrokeWidth(org.telegram.messenger.g0.N(4.0f));
        paint3.setPathEffect(new CornerPathEffect(org.telegram.messenger.g0.L(2.33f)));
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint3.setShader(new LinearGradient(0.0f, 0.0f, org.telegram.messenger.g0.L(48.0f), org.telegram.messenger.g0.L(48.0f), new int[]{16777215, org.telegram.ui.ActionBar.m6.r1(0.35f, 16777215), 16777215}, new float[]{0.0f, 0.5f, 1.0f}, tileMode));
        paint.setShader(new LinearGradient(-org.telegram.messenger.g0.L(10.0f), 0.0f, org.telegram.messenger.g0.L(10.0f), 0.0f, new int[]{16777215, -2130706433, 16777215}, new float[]{0.0f, 0.5f, 1.0f}, tileMode));
        mc mcVar = new mc(v0Var);
        this.Y = mcVar;
        mcVar.f = new i4(this, 0);
        this.w0 = new org.telegram.ui.Components.d6(1.0f, new m(v0Var, i7), 0L, 400L, nrVar);
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
            this.F.b(new g4(this, 0));
        }
        this.F.c(f10);
    }

    public final void b() {
        org.telegram.ui.Cells.v0 v0Var = this.a;
        if (v0Var.isShown()) {
            org.telegram.messenger.g0.a4(v0Var);
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
        gVar3.b(new g4(this, 2));
        this.Z.h();
    }

    public final void c(Canvas canvas, float f10, float f11) {
        canvas.translate(0.0f, org.telegram.messenger.g0.L(4.0f) * this.c0);
        mc mcVar = this.Y;
        canvas.scale(com.google.android.gms.internal.vision.e2.B(this.c0, 0.012f, 1.0f, mcVar.a(0.025f) * this.a0), com.google.android.gms.internal.vision.e2.C(this.c0, 0.04f, 1.0f, mcVar.a(0.025f) * this.a0), (org.telegram.messenger.g0.L(206.0f) / 2.0f) + f10, f11 + org.telegram.messenger.g0.L(70.0f));
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x0563  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0572  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x05fc  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0565  */
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
        fa faVar;
        boolean z10;
        boolean z11;
        xy0 xy0Var;
        Canvas canvas2;
        k4 k4Var;
        float e10;
        boolean z12;
        float f12;
        float e11;
        float f13;
        long j3;
        float f14;
        l4 l4Var;
        canvas.save();
        mc mcVar = this.Y;
        float B = com.google.android.gms.internal.vision.e2.B(this.c0, 0.012f, 1.0f, mcVar.a(0.025f) * this.a0);
        float C = com.google.android.gms.internal.vision.e2.C(this.c0, 0.04f, 1.0f, mcVar.a(0.025f) * this.a0);
        float L = org.telegram.messenger.g0.L(4.0f) * this.c0;
        c(canvas, 0.0f, 0.0f);
        float L2 = org.telegram.messenger.g0.L(4.0f);
        RectF rectF = this.f;
        rectF.set(L2, L2, org.telegram.messenger.g0.L(206.0f) - L2, org.telegram.messenger.g0.L(140.0f) - L2);
        Canvas.EdgeType edgeType = Canvas.EdgeType.AA;
        boolean quickReject = canvas.quickReject(rectF, edgeType);
        org.telegram.ui.Cells.v0 v0Var = this.a;
        y6 y6Var = this.k;
        if (quickReject) {
            f10 = 4.0f;
        } else {
            Handler handler = y6Var.d;
            f10 = 4.0f;
            Sensor sensor = y6Var.b;
            if (sensor != null && v0Var.isAttachedToWindow() && v0Var.isShown() && v0Var.getWindowVisibility() == 0) {
                f11 = 206.0f;
                y6Var.e.put(v0Var, Long.valueOf(SystemClock.uptimeMillis()));
                if (!y6Var.r) {
                    y6Var.s = false;
                    boolean registerListener = y6Var.a.registerListener(y6Var, sensor, 1, handler);
                    y6Var.r = registerListener;
                    if (registerListener) {
                        handler.postDelayed(y6Var.G, 250L);
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
                canvas.translate((org.telegram.messenger.g0.L(10.0f) * y6Var.E) + rectF.centerX(), (org.telegram.messenger.g0.L(8.0f) * y6Var.F) + rectF.centerY());
                q();
                canvas.rotate((y6Var.F * 6.0f) + (y6Var.E * 14.0f) + this.R);
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
                oh0 oh0Var = this.l;
                oh0Var.setBounds(round, round2, i7, i10);
                boolean quickReject2 = canvas.quickReject(round, round2, i7, i10, edgeType);
                Rect bounds = oh0Var.getBounds();
                Rect rect = this.w;
                rect.set(bounds);
                faVar = this.u;
                if (faVar.d()) {
                    canvas.save();
                    canvas.clipPath(path);
                    canvas.translate(rect.exactCenterX(), rect.exactCenterY());
                    faVar.c(canvas);
                    canvas.restore();
                    v0Var.postInvalidateOnAnimation();
                }
                p();
                if (this.m != null) {
                    float exactCenterX = ((rect.exactCenterX() - (org.telegram.messenger.g0.L(f11) / 2.0f)) * B) + (org.telegram.messenger.g0.L(f11) / 2.0f);
                    float z13 = com.google.android.gms.internal.vision.e2.z(rect.exactCenterY(), org.telegram.messenger.g0.L(70.0f), C, L + org.telegram.messenger.g0.L(70.0f));
                    this.m.setTranslationX((this.p + exactCenterX) - f15);
                    this.m.setTranslationY((this.q + z13) - f15);
                    this.m.setScaleX(B * this.C);
                    this.m.setScaleY(C * this.C);
                }
                z10 = quickReject2 && (l4Var = this.m) != null && l4Var.n;
                if (!z10) {
                    oh0Var.stop();
                    this.H = false;
                } else if (!this.H && !quickReject2) {
                    z11 = true;
                    this.H = true;
                    oh0Var.T(true, 0.0f);
                    oh0Var.start();
                    if (!z10 && !this.E) {
                        oh0Var.draw(canvas);
                    }
                    xy0Var = this.n0;
                    if (xy0Var != null) {
                        float k10 = xy0Var.k();
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
                        xy0 xy0Var2 = this.p0;
                        if (xy0Var2 != null) {
                            xy0Var2.c((org.telegram.messenger.g0.L(f11) - this.p0.k()) / 2.0f, (L9 - org.telegram.messenger.g0.L(f10)) - (this.p0.i() / 2.0f), 1.0f, this.t0, canvas);
                        }
                        this.o0.c(L8, L9 + org.telegram.messenger.g0.L(1.0f), 1.0f, 268435455, canvas);
                        canvas2 = canvas;
                        this.o0.c(L8, L9, 1.0f, e12 < 1.0f ? i0.a.f(e12, -16693808, -16693808) : -16693808, canvas2);
                    } else {
                        canvas2 = canvas;
                    }
                    k4Var = this.d0;
                    if (k4Var != null && !k4Var.c()) {
                        if (this.e0 != 0 && !this.h0 && !this.f0 && SystemClock.elapsedRealtime() - this.e0 >= 600) {
                            this.d0.a();
                            this.f0 = z11;
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
                    boolean z14 = (valueAnimator != null || valueAnimator.getCurrentPlayTime() >= 1000) ? false : z11;
                    float f17 = (!this.h0 || this.i0 || z14) ? 0.0f : 1.0f;
                    org.telegram.ui.Components.d6 d6Var = this.K;
                    e10 = d6Var.e(false, f17);
                    z12 = this.h0;
                    org.telegram.ui.ActionBar.h6 h6Var = this.b;
                    if (!z12 || this.i0 || z14) {
                        f12 = 255.0f;
                    } else {
                        boolean z15 = this.y0;
                        org.telegram.ui.Components.d6 d6Var2 = this.J;
                        if (z15) {
                            f13 = 1.0f;
                            if (d6Var2.c >= 1.0f) {
                                this.U = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.q7, h6Var);
                            }
                        } else {
                            f13 = 1.0f;
                        }
                        float e13 = d6Var2.e(false, f13);
                        int f18 = e13 >= f13 ? this.U : i0.a.f(e13, this.T, this.U);
                        this.V = f18;
                        j4 j4Var = this.I;
                        j4Var.f(f18);
                        f12 = 255.0f;
                        j4Var.setBounds(((int) rectF.right) - org.telegram.messenger.g0.L(46.0f), ((int) rectF.top) - org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f) + ((int) rectF.right), org.telegram.messenger.g0.L(46.0f) + ((int) rectF.top));
                        canvas2.save();
                        if (e10 < 1.0f) {
                            float exactCenterX2 = j4Var.getBounds().exactCenterX();
                            f14 = 48.0f;
                            float exactCenterY = j4Var.getBounds().exactCenterY();
                            j3 = 0;
                            float L10 = org.telegram.messenger.g0.L(48.0f) * ((float) Math.sqrt(0.5d)) * e10;
                            canvas2.rotate(45.0f, exactCenterX2, exactCenterY);
                            canvas2.clipRect(exactCenterX2 - L10, exactCenterY - org.telegram.messenger.g0.L(48.0f), L10 + exactCenterX2, org.telegram.messenger.g0.L(48.0f) + exactCenterY);
                            canvas2.rotate(-45.0f, exactCenterX2, exactCenterY);
                        } else {
                            j3 = 0;
                            f14 = 48.0f;
                        }
                        j4Var.draw(canvas2);
                        if (this.U != -15352320) {
                            e13 = this.T == -15352320 ? 1.0f - e13 : 0.0f;
                        }
                        Path path3 = this.W;
                        if (e13 > 0.0f) {
                            Rect bounds2 = j4Var.getBounds();
                            canvas2.save();
                            canvas2.translate(bounds2.right - org.telegram.messenger.g0.L(f14), bounds2.top);
                            canvas2.clipPath(path3);
                            Paint paint = this.X;
                            paint.setAlpha((int) (e13 * 255.0f));
                            canvas2.drawPath(path3, paint);
                            canvas2.restore();
                        }
                        if (e10 < 1.0f || d6Var.i) {
                            this.M = true;
                            this.N = 0L;
                        } else {
                            long elapsedRealtime = SystemClock.elapsedRealtime();
                            if (this.M) {
                                this.M = false;
                                this.N = elapsedRealtime + 500;
                                v0Var.postInvalidateDelayed(500L);
                            }
                            long j10 = this.N;
                            if (j10 != j3 && elapsedRealtime >= j10) {
                                float f19 = (elapsedRealtime - j10) / 600.0f;
                                if (f19 >= 1.0f) {
                                    this.N = j3;
                                } else {
                                    Rect bounds3 = j4Var.getBounds();
                                    canvas2.save();
                                    canvas2.translate(bounds3.right - org.telegram.messenger.g0.L(f14), bounds3.top);
                                    canvas2.clipPath(path3);
                                    canvas2.rotate(45.0f);
                                    float L11 = org.telegram.messenger.g0.L(10.0f);
                                    float f20 = -L11;
                                    canvas2.translate(org.telegram.ui.Cells.c0.g(L11, 2.0f, org.telegram.messenger.g0.L(f14) * ((float) Math.sqrt(2.0d)), f19, f20), 0.0f);
                                    canvas.drawRect(f20, -org.telegram.messenger.g0.L(f14), L11, org.telegram.messenger.g0.L(f14), this.L);
                                    canvas2 = canvas;
                                    canvas2.restore();
                                    v0Var.postInvalidateOnAnimation();
                                }
                            }
                        }
                        canvas2.restore();
                    }
                    e11 = this.Q.e(false, this.E ? 0.0f : 1.0f);
                    if (this.g0 && !this.E && e10 < 1.0f && e11 > 0.0f) {
                        int round3 = Math.round((1.0f - e10) * e11 * f12);
                        Paint paint2 = this.O;
                        paint2.setAlpha(round3);
                        float N = rectF.right - org.telegram.messenger.g0.N(15.5f);
                        float N2 = org.telegram.messenger.g0.N(15.5f) + rectF.top;
                        canvas2.drawCircle(N, N2, org.telegram.messenger.g0.N(5.0f), paint2);
                        long elapsedRealtime2 = SystemClock.elapsedRealtime() - this.P;
                        float f21 = ((elapsedRealtime2 % 2000) / 2000.0f) * 360.0f;
                        canvas2.save();
                        canvas2.rotate(f21, N, N2);
                        Canvas canvas3 = canvas2;
                        canvas3.drawLine(N, N2, N, N2 - org.telegram.messenger.g0.N(f10), paint2);
                        canvas3.rotate((360.0f * ((elapsedRealtime2 % 24000) / 24000.0f)) - f21, N, N2);
                        canvas3.drawLine(N, N2, org.telegram.messenger.g0.N(2.5f) + N, N2, paint2);
                        canvas2 = canvas3;
                        canvas2.restore();
                        v0Var.postInvalidateOnAnimation();
                    }
                    if (this.q0 != null) {
                        int w02 = org.telegram.ui.ActionBar.m6.i1(h6Var) ? org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Fa, h6Var) : -1;
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
                z11 = true;
                if (!z10) {
                    oh0Var.draw(canvas);
                }
                xy0Var = this.n0;
                if (xy0Var != null) {
                }
                if (this.o0 != null) {
                }
                k4Var = this.d0;
                if (k4Var != null) {
                    if (this.e0 != 0) {
                        this.d0.a();
                        this.f0 = z11;
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
                org.telegram.ui.Components.d6 d6Var3 = this.K;
                e10 = d6Var3.e(false, f17);
                z12 = this.h0;
                org.telegram.ui.ActionBar.h6 h6Var2 = this.b;
                if (z12) {
                }
                f12 = 255.0f;
                e11 = this.Q.e(false, this.E ? 0.0f : 1.0f);
                if (this.g0) {
                    int round32 = Math.round((1.0f - e10) * e11 * f12);
                    Paint paint22 = this.O;
                    paint22.setAlpha(round32);
                    float N3 = rectF.right - org.telegram.messenger.g0.N(15.5f);
                    float N22 = org.telegram.messenger.g0.N(15.5f) + rectF.top;
                    canvas2.drawCircle(N3, N22, org.telegram.messenger.g0.N(5.0f), paint22);
                    long elapsedRealtime22 = SystemClock.elapsedRealtime() - this.P;
                    float f212 = ((elapsedRealtime22 % 2000) / 2000.0f) * 360.0f;
                    canvas2.save();
                    canvas2.rotate(f212, N3, N22);
                    Canvas canvas32 = canvas2;
                    canvas32.drawLine(N3, N22, N3, N22 - org.telegram.messenger.g0.N(f10), paint22);
                    canvas32.rotate((360.0f * ((elapsedRealtime22 % 24000) / 24000.0f)) - f212, N3, N22);
                    canvas32.drawLine(N3, N22, org.telegram.messenger.g0.N(2.5f) + N3, N22, paint22);
                    canvas2 = canvas32;
                    canvas2.restore();
                    v0Var.postInvalidateOnAnimation();
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
        canvas.translate((org.telegram.messenger.g0.L(10.0f) * y6Var.E) + rectF.centerX(), (org.telegram.messenger.g0.L(8.0f) * y6Var.F) + rectF.centerY());
        q();
        canvas.rotate((y6Var.F * 6.0f) + (y6Var.E * 14.0f) + this.R);
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
        oh0 oh0Var2 = this.l;
        oh0Var2.setBounds(round4, round22, i72, i102);
        boolean quickReject22 = canvas.quickReject(round4, round22, i72, i102, edgeType);
        Rect bounds4 = oh0Var2.getBounds();
        Rect rect2 = this.w;
        rect2.set(bounds4);
        faVar = this.u;
        if (faVar.d()) {
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
        xy0Var = this.n0;
        if (xy0Var != null) {
        }
        if (this.o0 != null) {
        }
        k4Var = this.d0;
        if (k4Var != null) {
        }
        ValueAnimator valueAnimator22 = this.j0;
        if (valueAnimator22 != null) {
        }
        if (this.h0) {
        }
        org.telegram.ui.Components.d6 d6Var32 = this.K;
        e10 = d6Var32.e(false, f17);
        z12 = this.h0;
        org.telegram.ui.ActionBar.h6 h6Var22 = this.b;
        if (z12) {
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
        k4 k4Var = new k4(this, this.b);
        this.d0 = k4Var;
        k4Var.g(4969977, org.telegram.ui.ActionBar.m6.r1(0.125f, -11807239), 4969977, org.telegram.ui.ActionBar.m6.r1(0.75f, -11807239));
        this.d0.x.setStrokeWidth(org.telegram.messenger.g0.N(2.0f));
        k4 k4Var2 = this.d0;
        k4Var2.t = 2.0f;
        k4Var2.y = this.h;
        k4Var2.D = true;
    }

    public final void f() {
        ValueAnimator valueAnimator = this.j0;
        if (valueAnimator == null) {
            return;
        }
        this.j0 = null;
        valueAnimator.removeAllListeners();
        valueAnimator.cancel();
        org.telegram.ui.Components.d6 d6Var = this.K;
        if (d6Var.i) {
            this.M = false;
            this.N = 0L;
        }
        d6Var.e(true, 1.0f);
        this.t = 0.0f;
        this.u.a.clear();
        vf vfVar = this.k0;
        this.k0 = null;
        this.a.invalidate();
        if (vfVar != null) {
            org.telegram.messenger.g0.h3(vfVar, 1L);
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
            this.s = com.google.android.gms.internal.vision.e2.z(f13, f10, exp, f10);
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
        return (this.k.E * 0.14f) + ((float) (((uptimeMillis / 1000.0d) * 0.5961171984672546d) % 6.283185307179586d)) + this.r;
    }

    public final void i(boolean z10) {
        if (z10) {
            this.Q.e(true, 0.0f);
        } else if (this.E && this.h0) {
            this.P = SystemClock.elapsedRealtime();
        }
        this.E = z10;
        l4 l4Var = this.m;
        if (l4Var != null) {
            l4Var.setAlpha(z10 ? 0.0f : 1.0f);
        }
        this.a.invalidate();
    }

    public final void j() {
        this.x = -1;
        org.telegram.ui.Cells.v0 v0Var = this.a;
        if (v0Var.getParent() != null) {
            v0Var.getParent().requestDisallowInterceptTouchEvent(false);
        }
        float IEEEremainder = (float) Math.IEEEremainder(this.A - g(), 6.283185307179586d);
        float IEEEremainder2 = (float) Math.IEEEremainder(this.B - (this.k.F * 0.14f), 6.283185307179586d);
        this.D = true;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.G = ofFloat;
        ofFloat.setDuration(350L);
        this.G.setInterpolator(nr.h);
        this.G.addUpdateListener(new hi.i9(this, IEEEremainder, IEEEremainder2, 5));
        this.G.start();
        a(1.0f);
    }

    public final void k() {
        i(false);
        this.Q.e(true, 1.0f);
        if (this.x != -1) {
            org.telegram.ui.Cells.v0 v0Var = this.a;
            if (v0Var.getParent() != null) {
                v0Var.getParent().requestDisallowInterceptTouchEvent(false);
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
        l4 l4Var = this.m;
        if (l4Var != null) {
            l4Var.setScaleX(1.0f);
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
        org.telegram.ui.Cells.v0 v0Var = this.a;
        v0Var.invalidate();
        if (v0Var.getParent() instanceof View) {
            ((View) v0Var.getParent()).invalidate();
        }
    }

    public final void m(boolean z10, TLRPC.TL_messageActionGramTransfer tL_messageActionGramTransfer, String str, int i7, boolean z11, boolean z12) {
        org.telegram.ui.Cells.v0 v0Var = this.a;
        if (z11) {
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
            v0Var.invalidate();
            if (v0Var.getParent() instanceof View) {
                ((View) v0Var.getParent()).invalidate();
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
        org.telegram.ui.Components.d6 d6Var = this.K;
        if (z13) {
            d6Var.e(true, 0.0f);
            this.M = false;
            this.N = 0L;
        } else if (z11) {
            d6Var.e(true, 1.0f);
            this.M = false;
            this.N = 0L;
        }
        this.m0 = false;
        boolean z14 = z10 && i7 == 2;
        boolean z15 = z10 && i7 == 1;
        if (this.h0 && z10 && i7 == 0) {
            b();
            g();
            this.t = 18.0f;
            this.u.f();
            v0Var.invalidate();
        }
        if (z15) {
            if (!this.h0) {
                this.P = SystemClock.elapsedRealtime();
            }
            d6Var.e(true, 0.0f);
            this.M = false;
            this.N = 0L;
        } else if (z14) {
            d6Var.e(true, 1.0f);
            this.M = false;
            this.N = 0L;
        }
        q();
        this.h0 = z15;
        this.S = z15 ? SystemClock.elapsedRealtime() : 0L;
        if (z15) {
            e();
            k4 k4Var = this.d0;
            k4Var.getClass();
            k4Var.v = Math.max(0L, 0L);
            if (this.d0.d() || this.d0.c()) {
                k4 k4Var2 = this.d0;
                k4Var2.b = -1L;
                k4Var2.c = -1L;
            }
            v0Var.invalidate();
        } else {
            k4 k4Var3 = this.d0;
            if (k4Var3 != null && this.e0 == 0 && !k4Var3.d() && !this.d0.c()) {
                this.d0.a();
                v0Var.invalidate();
            }
        }
        int w02 = z14 ? org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.q7, this.b) : z10 ? -15352320 : -11814402;
        this.y0 = z14;
        int i10 = this.U;
        if (i10 == 0) {
            this.V = w02;
            this.U = w02;
            this.T = w02;
        } else if (w02 != i10) {
            this.T = this.V;
            this.U = w02;
            this.J.e(true, 0.0f);
            v0Var.invalidate();
        }
        String N0 = z14 ? hd.N0(2131742713, null) : z10 ? hd.N0(2131742711, null) : hd.N0(2131742712, null);
        j4 j4Var = this.I;
        if (z15) {
            j4Var.g(10, N0, true);
        } else {
            j4Var.h(10, N0);
        }
        SpannableStringBuilder v = u0.v(u0.t(Math.abs(tL_messageActionGramTransfer.amount), false), 0.75f);
        for (RelativeSizeSpan relativeSizeSpan : (RelativeSizeSpan[]) v.getSpans(0, v.length(), RelativeSizeSpan.class)) {
            v.removeSpan(relativeSizeSpan);
        }
        v.insert(0, (CharSequence) (z10 ? "–" : "+"));
        int indexOf = v.toString().indexOf(46);
        if (indexOf >= 0) {
            v.setSpan(new RelativeSizeSpan(0.75f), indexOf, v.length(), 33);
        }
        Object obj = new Object();
        v.setSpan(obj, 0, v.length(), 33);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(u0.q("Grams", v, 2131749314));
        int spanStart = spannableStringBuilder.getSpanStart(obj);
        int spanEnd = spannableStringBuilder.getSpanEnd(obj);
        spannableStringBuilder.removeSpan(obj);
        oi.w5 w5Var = this.u0;
        if (spanStart > 0) {
            spannableStringBuilder.setSpan(CharacterStyle.wrap(w5Var), 0, spanStart, 33);
        }
        if (spanEnd >= 0 && spanEnd < spannableStringBuilder.length()) {
            spannableStringBuilder.setSpan(CharacterStyle.wrap(w5Var), spanEnd, spannableStringBuilder.length(), 33);
        }
        this.n0 = new xy0(spannableStringBuilder, 16.0f, org.telegram.messenger.g0.o());
        String str2 = tL_messageActionGramTransfer.peer_address;
        Locale locale = Locale.US;
        String f10 = x6.f(x6.d(str2.toUpperCase(locale)));
        xy0 xy0Var = new xy0("", 9.3f, org.telegram.messenger.g0.o1("fonts/rmono.ttf"));
        xy0Var.m(2);
        this.o0 = xy0Var;
        xy0Var.q(f10);
        if (TextUtils.isEmpty(str)) {
            this.p0 = null;
        } else {
            xy0 xy0Var2 = new xy0("", 10.0f, Typeface.create(org.telegram.messenger.g0.o1("fonts/rmono.ttf"), 1));
            this.p0 = xy0Var2;
            xy0Var2.q(TextUtils.ellipsize(org.telegram.messenger.g0.N2(str.toUpperCase(locale)), this.p0.a, org.telegram.messenger.g0.L(206.0f) - org.telegram.messenger.g0.L(24.0f), TextUtils.TruncateAt.END));
        }
        Stack stack = this.d;
        ArrayList arrayList = this.c;
        stack.addAll(arrayList);
        arrayList.clear();
        if (TextUtils.isEmpty(tL_messageActionGramTransfer.comment)) {
            this.q0 = null;
            return;
        }
        xy0 xy0Var3 = new xy0("", 12.0f, null);
        xy0Var3.m(ConnectionsManager.DEFAULT_DATACENTER_ID);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        xy0Var3.a();
        xy0Var3.p(org.telegram.messenger.g0.L(184.0f));
        this.q0 = xy0Var3;
        if ((!tL_messageActionGramTransfer.comment_encrypted && !tL_messageActionGramTransfer.comment_encrypted_preparing) || this.m0) {
            xy0Var3.q(org.telegram.messenger.j6.m(tL_messageActionGramTransfer.comment, xy0Var3.a.getFontMetricsInt(), false, null, 0));
            return;
        }
        StringBuilder sb2 = new StringBuilder(25);
        for (int i11 = 0; i11 < 25; i11++) {
            sb2.append("a");
        }
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(sb2.toString());
        fz0 fz0Var = new fz0();
        fz0Var.a |= 256;
        spannableStringBuilder2.setSpan(new gz0(fz0Var, 0), 0, spannableStringBuilder2.length(), 33);
        this.q0.q(spannableStringBuilder2);
        xh.f.c(v0Var, this.q0.b, stack, arrayList);
        n(this.e);
    }

    public final void n(boolean z10) {
        this.e = z10;
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
            this.B = this.k.F * 0.14f;
        }
        boolean z10 = true;
        boolean z11 = this.x != -1 || this.D || this.C > 1.001f;
        l4 l4Var = this.m;
        float f10 = this.A;
        float f11 = this.B;
        if (!z11 && !this.h0 && this.r == 0.0f && this.s == 0.0f && this.t == 0.0f) {
            z10 = false;
        }
        l4Var.r = f10;
        l4Var.s = f11;
        l4Var.w = z10;
        l4Var.x = z11;
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
