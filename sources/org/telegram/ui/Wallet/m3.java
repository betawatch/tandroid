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
import ei.ja;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Stack;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.i11;
import org.telegram.ui.Components.la;
import org.telegram.ui.Components.q11;
import org.telegram.ui.Components.r11;
import org.telegram.ui.Components.yc;
import org.telegram.ui.Components.yj0;
import org.telegram.ui.kg;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes4.dex */
public final class m3 {
    public float A;
    public float B;
    public boolean D;
    public boolean E;
    public o1.k F;
    public ValueAnimator G;
    public boolean H;
    public final j3 I;
    public final org.telegram.ui.Components.f6 J;
    public final org.telegram.ui.Components.f6 K;
    public final Paint L;
    public boolean M;
    public long N;
    public final Paint O;
    public long P;
    public final org.telegram.ui.Components.f6 Q;
    public float R;
    public long S;
    public int T;
    public int U;
    public int V;
    public final Path W;
    public final Paint X;
    public final yc Y;
    public o1.k Z;
    public final org.telegram.ui.Cells.v0 a;
    public float a0;
    public final org.telegram.ui.ActionBar.g6 b;
    public o1.k b0;
    public float c0;
    public k3 d0;
    public boolean e;
    public long e0;
    public boolean f0;
    public boolean g0;
    public boolean h0;
    public final Drawable i;
    public boolean i0;
    public ValueAnimator j0;
    public final y5 k;
    public kg k0;
    public final yj0 l;
    public TLRPC.TL_messageActionGramTransfer l0;
    public l3 m;
    public boolean m0;
    public boolean n;
    public i11 n0;
    public boolean o;
    public i11 o0;
    public float p;
    public i11 p0;
    public float q;
    public i11 q0;
    public float r;
    public boolean r0;
    public float s;
    public org.telegram.ui.Cells.o0 s0;
    public float t;
    public int t0;
    public final ki.y5 u0;
    public long v;
    public int v0;
    public final org.telegram.ui.Components.f6 w0;
    public final h3 x0;
    public float y;
    public boolean y0;
    public float z;
    public final ArrayList c = new ArrayList();
    public final Stack d = new Stack();
    public final RectF f = new RectF();
    public final RectF g = new RectF();
    public final Path h = new Path();
    public final Path j = new Path();
    public final l9 u = new l9();
    public final Rect w = new Rect();
    public int x = -1;
    public float C = 1.0f;

    public m3(org.telegram.ui.Cells.v0 v0Var, org.telegram.ui.ActionBar.g6 g6Var) {
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
        this.u0 = new ki.y5(this, 3);
        this.v0 = -1;
        new Paint(1);
        new Paint(1);
        this.x0 = new h3(this, 0);
        this.a = v0Var;
        this.b = g6Var;
        this.i = v0Var.getResources().getDrawable(R.drawable.wallet_action_card_gradient).mutate();
        Context context = v0Var.getContext();
        if (y5.G == null) {
            y5.G = new y5(context.getApplicationContext());
        }
        this.k = y5.G;
        yj0 yj0Var = new yj0(R.raw.wallet_diamond_white, AndroidUtilities.dp(42.0f), AndroidUtilities.dp(42.0f), false, null);
        this.l = yj0Var;
        yj0Var.R(v0Var);
        yj0Var.K(0);
        v0Var.addOnAttachStateChangeListener(new la(2, this, v0Var));
        paint2.setColor(-10033409);
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        paint2.setStrokeWidth(AndroidUtilities.dpf2(1.0f));
        int i10 = 6;
        m mVar = new m(v0Var, i10);
        bs bsVar = bs.h;
        this.Q = new org.telegram.ui.Components.f6(1.0f, mVar, 0L, 180L, bsVar);
        this.K = new org.telegram.ui.Components.f6(new m(v0Var, i10), 320L, bsVar, 0);
        this.J = new org.telegram.ui.Components.f6(new m(v0Var, i10), 320L, bsVar, 0);
        j3 j3Var = new j3(v0Var, v0Var);
        this.I = j3Var;
        j3Var.x = -1;
        yh.j1.d(path, 1.0f, false);
        paint3.setStyle(style);
        paint3.setStrokeWidth(AndroidUtilities.dpf2(4.0f));
        paint3.setPathEffect(new CornerPathEffect(AndroidUtilities.dp(2.33f)));
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint3.setShader(new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(48.0f), AndroidUtilities.dp(48.0f), new int[]{16777215, org.telegram.ui.ActionBar.k6.o1(0.35f, 16777215), 16777215}, new float[]{0.0f, 0.5f, 1.0f}, tileMode));
        paint.setShader(new LinearGradient(-AndroidUtilities.dp(10.0f), 0.0f, AndroidUtilities.dp(10.0f), 0.0f, new int[]{16777215, -2130706433, 16777215}, new float[]{0.0f, 0.5f, 1.0f}, tileMode));
        yc ycVar = new yc(v0Var);
        this.Y = ycVar;
        ycVar.f = new i3(this, 0);
        this.w0 = new org.telegram.ui.Components.f6(1.0f, new m(v0Var, i10), 0L, 400L, bsVar);
    }

    public static int h() {
        return AndroidUtilities.dp(206.0f);
    }

    public final void a(float f7) {
        if (this.F == null) {
            o1.k kVar = new o1.k(new o1.j(this.C));
            this.F = kVar;
            o1.l lVar = new o1.l(f7);
            lVar.a(0.55f);
            lVar.b(280.0f);
            kVar.u = lVar;
            this.F.e(0.001f);
            this.F.b(new g3(this, 0));
        }
        this.F.g(f7);
    }

    public final void b() {
        org.telegram.ui.Cells.v0 v0Var = this.a;
        if (v0Var.isShown()) {
            AndroidUtilities.vibrateCursor(v0Var);
        }
        o1.k kVar = this.Z;
        if (kVar != null) {
            kVar.c();
        }
        o1.k kVar2 = new o1.k(new o1.j(this.a0));
        this.Z = kVar2;
        o1.l lVar = new o1.l(1.0f);
        lVar.a(0.55f);
        lVar.b(280.0f);
        kVar2.u = lVar;
        this.Z.e(0.001f);
        o1.k kVar3 = this.Z;
        kVar3.a = -3.0f;
        kVar3.b(new g3(this, 2));
        this.Z.h();
    }

    public final void c(Canvas canvas, float f7, float f10) {
        canvas.translate(0.0f, AndroidUtilities.dp(4.0f) * this.c0);
        yc ycVar = this.Y;
        canvas.scale(com.google.android.gms.internal.play_billing.k3.A(this.c0, 0.012f, 1.0f, ycVar.a(0.025f) * this.a0), com.google.android.gms.internal.play_billing.k3.B(this.c0, 0.04f, 1.0f, ycVar.a(0.025f) * this.a0), (AndroidUtilities.dp(206.0f) / 2.0f) + f7, f10 + AndroidUtilities.dp(70.0f));
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x0567  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0575  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x05ff  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0569  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0251  */
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
    /* JADX WARN: Removed duplicated region for block: B:85:0x03cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(Canvas canvas) {
        float f7;
        float f10;
        l9 l9Var;
        boolean z10;
        boolean z11;
        i11 i11Var;
        Canvas canvas2;
        k3 k3Var;
        float d;
        float f11;
        float d10;
        i11 i11Var2;
        float f12;
        long j10;
        float f13;
        l3 l3Var;
        canvas.save();
        yc ycVar = this.Y;
        float A = com.google.android.gms.internal.play_billing.k3.A(this.c0, 0.012f, 1.0f, ycVar.a(0.025f) * this.a0);
        float B = com.google.android.gms.internal.play_billing.k3.B(this.c0, 0.04f, 1.0f, ycVar.a(0.025f) * this.a0);
        float dp = AndroidUtilities.dp(4.0f) * this.c0;
        c(canvas, 0.0f, 0.0f);
        float dp2 = AndroidUtilities.dp(4.0f);
        RectF rectF = this.f;
        rectF.set(dp2, dp2, AndroidUtilities.dp(206.0f) - dp2, AndroidUtilities.dp(140.0f) - dp2);
        Canvas.EdgeType edgeType = Canvas.EdgeType.AA;
        boolean quickReject = canvas.quickReject(rectF, edgeType);
        org.telegram.ui.Cells.v0 v0Var = this.a;
        y5 y5Var = this.k;
        if (quickReject) {
            f7 = 4.0f;
        } else {
            Handler handler = y5Var.d;
            f7 = 4.0f;
            Sensor sensor = y5Var.b;
            if (sensor != null && v0Var.isAttachedToWindow() && v0Var.isShown() && v0Var.getWindowVisibility() == 0) {
                f10 = 206.0f;
                y5Var.e.put(v0Var, Long.valueOf(SystemClock.uptimeMillis()));
                if (!y5Var.r) {
                    y5Var.s = false;
                    boolean registerListener = y5Var.a.registerListener(y5Var, sensor, 1, handler);
                    y5Var.r = registerListener;
                    if (registerListener) {
                        handler.postDelayed(y5Var.F, 250L);
                    }
                }
                Path path = this.j;
                path.rewind();
                float dp3 = AndroidUtilities.dp(16.0f);
                float dp4 = AndroidUtilities.dp(16.0f);
                Path.Direction direction = Path.Direction.CW;
                path.addRoundRect(rectF, dp3, dp4, direction);
                canvas.save();
                canvas.clipPath(path);
                canvas.translate((AndroidUtilities.dp(10.0f) * y5Var.y) + rectF.centerX(), (AndroidUtilities.dp(8.0f) * y5Var.E) + rectF.centerY());
                q();
                canvas.rotate((y5Var.E * 6.0f) + (y5Var.y * 14.0f) + this.R);
                float hypot = (((float) Math.hypot(rectF.width(), rectF.height())) / 2.0f) + AndroidUtilities.dp(16.0f);
                Drawable drawable = this.i;
                int max = Math.max(1, drawable.getIntrinsicWidth());
                int max2 = Math.max(1, drawable.getIntrinsicHeight());
                float min = hypot / Math.min(max, max2);
                int ceil = (int) Math.ceil(max * min);
                int ceil2 = (int) Math.ceil(max2 * min);
                float d11 = this.w0.d(1.0f, false);
                drawable.setBounds(-ceil, -ceil2, ceil, ceil2);
                drawable.draw(canvas);
                this.t0 = d11 < 1.0f ? i0.a.f(d11, -10624001, -10624001) : -10624001;
                canvas.restore();
                int dp5 = AndroidUtilities.dp(42.0f);
                float f14 = dp5 / 2.0f;
                int round = Math.round(rectF.centerX() - f14);
                float max3 = Math.max(0.0f, Math.min(1.0f, (this.C - 1.0f) / 2.0f));
                float dp6 = rectF.top + AndroidUtilities.dp(8.0f);
                int round2 = Math.round((((rectF.centerY() - f14) - dp6) * max3) + dp6);
                int i10 = round + dp5;
                int i11 = dp5 + round2;
                yj0 yj0Var = this.l;
                yj0Var.setBounds(round, round2, i10, i11);
                boolean quickReject2 = canvas.quickReject(round, round2, i10, i11, edgeType);
                Rect bounds = yj0Var.getBounds();
                Rect rect = this.w;
                rect.set(bounds);
                l9Var = this.u;
                if (l9Var.d()) {
                    canvas.save();
                    canvas.clipPath(path);
                    canvas.translate(rect.exactCenterX(), rect.exactCenterY());
                    l9Var.c(canvas);
                    canvas.restore();
                    v0Var.postInvalidateOnAnimation();
                }
                p();
                if (this.m != null) {
                    float exactCenterX = ((rect.exactCenterX() - (AndroidUtilities.dp(f10) / 2.0f)) * A) + (AndroidUtilities.dp(f10) / 2.0f);
                    float y3 = com.google.android.gms.internal.play_billing.k3.y(rect.exactCenterY(), AndroidUtilities.dp(70.0f), B, dp + AndroidUtilities.dp(70.0f));
                    this.m.setTranslationX((this.p + exactCenterX) - f14);
                    this.m.setTranslationY((this.q + y3) - f14);
                    this.m.setScaleX(A * this.C);
                    this.m.setScaleY(B * this.C);
                }
                z10 = quickReject2 && (l3Var = this.m) != null && l3Var.n;
                if (!z10) {
                    yj0Var.stop();
                    this.H = false;
                } else if (!this.H && !quickReject2) {
                    z11 = true;
                    this.H = true;
                    yj0Var.T(0.0f, true);
                    yj0Var.start();
                    if (!z10 && !this.E) {
                        yj0Var.draw(canvas);
                    }
                    i11Var = this.n0;
                    if (i11Var != null) {
                        float l4 = i11Var.l();
                        float width = rectF.width() - AndroidUtilities.dp(16.0f);
                        float f15 = l4 > width ? width / l4 : 1.0f;
                        float dp7 = rectF.top + AndroidUtilities.dp(55.0f) + (this.n0.j() / 2.0f);
                        canvas.save();
                        canvas.scale(f15, f15, rectF.centerX(), dp7);
                        this.n0.c(rectF.centerX() - (l4 / 2.0f), dp7, 1.0f, -1, canvas);
                        canvas.restore();
                    }
                    if (this.o0 != null) {
                        float dp8 = (AndroidUtilities.dp(f10) - this.o0.l()) / 2.0f;
                        float dp9 = (rectF.bottom - AndroidUtilities.dp(7.0f)) - this.o0.j();
                        i11 i11Var3 = this.p0;
                        if (i11Var3 != null) {
                            i11Var3.c((AndroidUtilities.dp(f10) - this.p0.l()) / 2.0f, (dp9 - AndroidUtilities.dp(f7)) - (this.p0.j() / 2.0f), 1.0f, this.t0, canvas);
                        }
                        this.o0.c(dp8, dp9 + AndroidUtilities.dp(1.0f), 1.0f, 268435455, canvas);
                        canvas2 = canvas;
                        this.o0.c(dp8, dp9, 1.0f, d11 < 1.0f ? i0.a.f(d11, -16693808, -16693808) : -16693808, canvas2);
                    } else {
                        canvas2 = canvas;
                    }
                    k3Var = this.d0;
                    if (k3Var != null && !k3Var.c()) {
                        if (this.e0 != 0 && !this.h0 && !this.f0 && SystemClock.elapsedRealtime() - this.e0 >= 600) {
                            this.d0.a();
                            this.f0 = z11;
                        }
                        float strokeWidth = this.d0.x.getStrokeWidth() / 2.0f;
                        RectF rectF2 = this.g;
                        rectF2.set(rectF);
                        rectF2.inset(strokeWidth, strokeWidth);
                        float max4 = Math.max(0.0f, AndroidUtilities.dp(16.0f) - strokeWidth);
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
                    boolean z12 = (valueAnimator != null || valueAnimator.getCurrentPlayTime() >= 1000) ? false : z11;
                    float f16 = (!this.h0 || this.i0 || z12) ? 0.0f : 1.0f;
                    org.telegram.ui.Components.f6 f6Var = this.K;
                    d = f6Var.d(f16, false);
                    if (!this.h0 || this.i0 || z12) {
                        f11 = 255.0f;
                    } else {
                        boolean z13 = this.y0;
                        org.telegram.ui.Components.f6 f6Var2 = this.J;
                        if (z13) {
                            f12 = 1.0f;
                            if (f6Var2.c >= 1.0f) {
                                this.U = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.q7, this.b);
                            }
                        } else {
                            f12 = 1.0f;
                        }
                        float d12 = f6Var2.d(f12, false);
                        int f17 = d12 >= f12 ? this.U : i0.a.f(d12, this.T, this.U);
                        this.V = f17;
                        j3 j3Var = this.I;
                        Paint paint = (Paint) j3Var.b;
                        paint.setShader(null);
                        paint.setColor(f17);
                        f11 = 255.0f;
                        j3Var.setBounds(((int) rectF.right) - AndroidUtilities.dp(46.0f), ((int) rectF.top) - AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f) + ((int) rectF.right), AndroidUtilities.dp(46.0f) + ((int) rectF.top));
                        canvas2.save();
                        if (d < 1.0f) {
                            float exactCenterX2 = j3Var.getBounds().exactCenterX();
                            f13 = 48.0f;
                            float exactCenterY = j3Var.getBounds().exactCenterY();
                            j10 = 0;
                            float dp10 = AndroidUtilities.dp(48.0f) * ((float) Math.sqrt(0.5d)) * d;
                            canvas2.rotate(45.0f, exactCenterX2, exactCenterY);
                            canvas2.clipRect(exactCenterX2 - dp10, exactCenterY - AndroidUtilities.dp(48.0f), dp10 + exactCenterX2, AndroidUtilities.dp(48.0f) + exactCenterY);
                            canvas2.rotate(-45.0f, exactCenterX2, exactCenterY);
                        } else {
                            j10 = 0;
                            f13 = 48.0f;
                        }
                        j3Var.draw(canvas2);
                        if (this.U != -15352320) {
                            d12 = this.T == -15352320 ? 1.0f - d12 : 0.0f;
                        }
                        Path path3 = this.W;
                        if (d12 > 0.0f) {
                            Rect bounds2 = j3Var.getBounds();
                            canvas2.save();
                            canvas2.translate(bounds2.right - AndroidUtilities.dp(f13), bounds2.top);
                            canvas2.clipPath(path3);
                            Paint paint2 = this.X;
                            paint2.setAlpha((int) (d12 * 255.0f));
                            canvas2.drawPath(path3, paint2);
                            canvas2.restore();
                        }
                        if (d < 1.0f || f6Var.i) {
                            this.M = true;
                            this.N = 0L;
                        } else {
                            long elapsedRealtime = SystemClock.elapsedRealtime();
                            if (this.M) {
                                this.M = false;
                                this.N = elapsedRealtime + 500;
                                v0Var.postInvalidateDelayed(500L);
                            }
                            long j11 = this.N;
                            if (j11 != j10 && elapsedRealtime >= j11) {
                                float f18 = (elapsedRealtime - j11) / 600.0f;
                                if (f18 >= 1.0f) {
                                    this.N = j10;
                                } else {
                                    Rect bounds3 = j3Var.getBounds();
                                    canvas2.save();
                                    canvas2.translate(bounds3.right - AndroidUtilities.dp(f13), bounds3.top);
                                    canvas2.clipPath(path3);
                                    canvas2.rotate(45.0f);
                                    float dp11 = AndroidUtilities.dp(10.0f);
                                    float f19 = -dp11;
                                    canvas2.translate((((dp11 * 2.0f) + (AndroidUtilities.dp(f13) * ((float) Math.sqrt(2.0d)))) * f18) + f19, 0.0f);
                                    canvas.drawRect(f19, -AndroidUtilities.dp(f13), dp11, AndroidUtilities.dp(f13), this.L);
                                    canvas2 = canvas;
                                    canvas2.restore();
                                    v0Var.postInvalidateOnAnimation();
                                }
                            }
                        }
                        canvas2.restore();
                    }
                    d10 = this.Q.d(this.E ? 0.0f : 1.0f, false);
                    if (this.g0 && !this.E && d < 1.0f && d10 > 0.0f) {
                        int round3 = Math.round((1.0f - d) * d10 * f11);
                        Paint paint3 = this.O;
                        paint3.setAlpha(round3);
                        float dpf2 = rectF.right - AndroidUtilities.dpf2(15.5f);
                        float dpf22 = AndroidUtilities.dpf2(15.5f) + rectF.top;
                        canvas2.drawCircle(dpf2, dpf22, AndroidUtilities.dpf2(5.0f), paint3);
                        long elapsedRealtime2 = SystemClock.elapsedRealtime() - this.P;
                        float f20 = ((elapsedRealtime2 % 2000) / 2000.0f) * 360.0f;
                        canvas2.save();
                        canvas2.rotate(f20, dpf2, dpf22);
                        Canvas canvas3 = canvas2;
                        canvas3.drawLine(dpf2, dpf22, dpf2, dpf22 - AndroidUtilities.dpf2(f7), paint3);
                        canvas3.rotate((360.0f * ((elapsedRealtime2 % 24000) / 24000.0f)) - f20, dpf2, dpf22);
                        canvas3.drawLine(dpf2, dpf22, AndroidUtilities.dpf2(2.5f) + dpf2, dpf22, paint3);
                        canvas2 = canvas3;
                        canvas2.restore();
                        v0Var.postInvalidateOnAnimation();
                    }
                    i11Var2 = this.q0;
                    if (i11Var2 != null) {
                        TLRPC.TL_messageActionGramTransfer tL_messageActionGramTransfer = this.l0;
                        if ((tL_messageActionGramTransfer.comment_encrypted || tL_messageActionGramTransfer.comment_encrypted_preparing) && !this.m0) {
                            canvas2.save();
                            canvas2.translate((AndroidUtilities.dp(f10) - this.q0.l()) / 2.0f, AndroidUtilities.dp(143.0f));
                            ArrayList arrayList = this.c;
                            int size = arrayList.size();
                            int i12 = 0;
                            while (i12 < size) {
                                Object obj = arrayList.get(i12);
                                i12++;
                                wh.g gVar = (wh.g) obj;
                                gVar.h(-1);
                                gVar.draw(canvas2);
                            }
                            canvas2.restore();
                        } else {
                            i11Var2.c((AndroidUtilities.dp(f10) - this.q0.l()) / 2.0f, AndroidUtilities.dp(143.0f), 1.0f, -1, canvas2);
                        }
                    }
                    canvas.restore();
                }
                z11 = true;
                if (!z10) {
                    yj0Var.draw(canvas);
                }
                i11Var = this.n0;
                if (i11Var != null) {
                }
                if (this.o0 != null) {
                }
                k3Var = this.d0;
                if (k3Var != null) {
                    if (this.e0 != 0) {
                        this.d0.a();
                        this.f0 = z11;
                    }
                    float strokeWidth2 = this.d0.x.getStrokeWidth() / 2.0f;
                    RectF rectF22 = this.g;
                    rectF22.set(rectF);
                    rectF22.inset(strokeWidth2, strokeWidth2);
                    float max42 = Math.max(0.0f, AndroidUtilities.dp(16.0f) - strokeWidth2);
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
                org.telegram.ui.Components.f6 f6Var3 = this.K;
                d = f6Var3.d(f16, false);
                if (this.h0) {
                }
                f11 = 255.0f;
                d10 = this.Q.d(this.E ? 0.0f : 1.0f, false);
                if (this.g0) {
                    int round32 = Math.round((1.0f - d) * d10 * f11);
                    Paint paint32 = this.O;
                    paint32.setAlpha(round32);
                    float dpf23 = rectF.right - AndroidUtilities.dpf2(15.5f);
                    float dpf222 = AndroidUtilities.dpf2(15.5f) + rectF.top;
                    canvas2.drawCircle(dpf23, dpf222, AndroidUtilities.dpf2(5.0f), paint32);
                    long elapsedRealtime22 = SystemClock.elapsedRealtime() - this.P;
                    float f202 = ((elapsedRealtime22 % 2000) / 2000.0f) * 360.0f;
                    canvas2.save();
                    canvas2.rotate(f202, dpf23, dpf222);
                    Canvas canvas32 = canvas2;
                    canvas32.drawLine(dpf23, dpf222, dpf23, dpf222 - AndroidUtilities.dpf2(f7), paint32);
                    canvas32.rotate((360.0f * ((elapsedRealtime22 % 24000) / 24000.0f)) - f202, dpf23, dpf222);
                    canvas32.drawLine(dpf23, dpf222, AndroidUtilities.dpf2(2.5f) + dpf23, dpf222, paint32);
                    canvas2 = canvas32;
                    canvas2.restore();
                    v0Var.postInvalidateOnAnimation();
                }
                i11Var2 = this.q0;
                if (i11Var2 != null) {
                }
                canvas.restore();
            }
        }
        f10 = 206.0f;
        Path path4 = this.j;
        path4.rewind();
        float dp32 = AndroidUtilities.dp(16.0f);
        float dp42 = AndroidUtilities.dp(16.0f);
        Path.Direction direction2 = Path.Direction.CW;
        path4.addRoundRect(rectF, dp32, dp42, direction2);
        canvas.save();
        canvas.clipPath(path4);
        canvas.translate((AndroidUtilities.dp(10.0f) * y5Var.y) + rectF.centerX(), (AndroidUtilities.dp(8.0f) * y5Var.E) + rectF.centerY());
        q();
        canvas.rotate((y5Var.E * 6.0f) + (y5Var.y * 14.0f) + this.R);
        float hypot2 = (((float) Math.hypot(rectF.width(), rectF.height())) / 2.0f) + AndroidUtilities.dp(16.0f);
        Drawable drawable2 = this.i;
        int max5 = Math.max(1, drawable2.getIntrinsicWidth());
        int max22 = Math.max(1, drawable2.getIntrinsicHeight());
        float min2 = hypot2 / Math.min(max5, max22);
        int ceil3 = (int) Math.ceil(max5 * min2);
        int ceil22 = (int) Math.ceil(max22 * min2);
        float d112 = this.w0.d(1.0f, false);
        drawable2.setBounds(-ceil3, -ceil22, ceil3, ceil22);
        drawable2.draw(canvas);
        this.t0 = d112 < 1.0f ? i0.a.f(d112, -10624001, -10624001) : -10624001;
        canvas.restore();
        int dp52 = AndroidUtilities.dp(42.0f);
        float f142 = dp52 / 2.0f;
        int round4 = Math.round(rectF.centerX() - f142);
        float max32 = Math.max(0.0f, Math.min(1.0f, (this.C - 1.0f) / 2.0f));
        float dp62 = rectF.top + AndroidUtilities.dp(8.0f);
        int round22 = Math.round((((rectF.centerY() - f142) - dp62) * max32) + dp62);
        int i102 = round4 + dp52;
        int i112 = dp52 + round22;
        yj0 yj0Var2 = this.l;
        yj0Var2.setBounds(round4, round22, i102, i112);
        boolean quickReject22 = canvas.quickReject(round4, round22, i102, i112, edgeType);
        Rect bounds4 = yj0Var2.getBounds();
        Rect rect2 = this.w;
        rect2.set(bounds4);
        l9Var = this.u;
        if (l9Var.d()) {
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
        i11Var = this.n0;
        if (i11Var != null) {
        }
        if (this.o0 != null) {
        }
        k3Var = this.d0;
        if (k3Var != null) {
        }
        ValueAnimator valueAnimator22 = this.j0;
        if (valueAnimator22 != null) {
        }
        if (this.h0) {
        }
        org.telegram.ui.Components.f6 f6Var32 = this.K;
        d = f6Var32.d(f16, false);
        if (this.h0) {
        }
        f11 = 255.0f;
        d10 = this.Q.d(this.E ? 0.0f : 1.0f, false);
        if (this.g0) {
        }
        i11Var2 = this.q0;
        if (i11Var2 != null) {
        }
        canvas.restore();
    }

    public final void e() {
        if (this.d0 != null) {
            return;
        }
        k3 k3Var = new k3(this, this.b);
        this.d0 = k3Var;
        k3Var.g(4969977, org.telegram.ui.ActionBar.k6.o1(0.125f, -11807239), 4969977, org.telegram.ui.ActionBar.k6.o1(0.75f, -11807239));
        this.d0.x.setStrokeWidth(AndroidUtilities.dpf2(2.0f));
        k3 k3Var2 = this.d0;
        k3Var2.t = 2.0f;
        k3Var2.y = this.h;
        k3Var2.D = true;
    }

    public final void f() {
        ValueAnimator valueAnimator = this.j0;
        if (valueAnimator == null) {
            return;
        }
        this.j0 = null;
        valueAnimator.removeAllListeners();
        valueAnimator.cancel();
        org.telegram.ui.Components.f6 f6Var = this.K;
        if (f6Var.i) {
            this.M = false;
            this.N = 0L;
        }
        f6Var.d(1.0f, true);
        this.t = 0.0f;
        this.u.a.clear();
        kg kgVar = this.k0;
        this.k0 = null;
        this.a.invalidate();
        if (kgVar != null) {
            AndroidUtilities.runOnUIThread(kgVar, 1L);
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
            this.s = com.google.android.gms.internal.play_billing.k3.y(f12, f7, exp, f7);
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
        return (this.k.y * 0.14f) + ((float) (((uptimeMillis / 1000.0d) * 0.5961171984672546d) % 6.283185307179586d)) + this.r;
    }

    public final void i(boolean z10) {
        if (z10) {
            this.Q.d(0.0f, true);
        } else if (this.E && this.h0) {
            this.P = SystemClock.elapsedRealtime();
        }
        this.E = z10;
        l3 l3Var = this.m;
        if (l3Var != null) {
            l3Var.setAlpha(z10 ? 0.0f : 1.0f);
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
        float IEEEremainder2 = (float) Math.IEEEremainder(this.B - (this.k.E * 0.14f), 6.283185307179586d);
        this.D = true;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.G = ofFloat;
        ofFloat.setDuration(350L);
        this.G.setInterpolator(bs.h);
        this.G.addUpdateListener(new ja(this, IEEEremainder, IEEEremainder2, 5));
        this.G.start();
        a(1.0f);
    }

    public final void k() {
        i(false);
        this.Q.d(1.0f, true);
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
        o1.k kVar = this.F;
        if (kVar != null) {
            kVar.c();
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
        l3 l3Var = this.m;
        if (l3Var != null) {
            l3Var.setScaleX(1.0f);
            this.m.setScaleY(1.0f);
        }
    }

    public final void l() {
        o1.k kVar = this.b0;
        if (kVar != null) {
            kVar.c();
            this.b0 = null;
        }
        this.c0 = 0.0f;
        org.telegram.ui.Cells.v0 v0Var = this.a;
        v0Var.invalidate();
        if (v0Var.getParent() instanceof View) {
            ((View) v0Var.getParent()).invalidate();
        }
    }

    public final void m(boolean z10, TLRPC.TL_messageActionGramTransfer tL_messageActionGramTransfer, String str, int i10, boolean z11, boolean z12) {
        org.telegram.ui.Cells.v0 v0Var = this.a;
        if (z11) {
            f();
            this.M = false;
            this.N = 0L;
            this.h0 = false;
            k();
            o1.k kVar = this.Z;
            if (kVar != null) {
                kVar.c();
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
        org.telegram.ui.Components.f6 f6Var = this.K;
        if (z13) {
            f6Var.d(0.0f, true);
            this.M = false;
            this.N = 0L;
        } else if (z11) {
            f6Var.d(1.0f, true);
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
            v0Var.invalidate();
        }
        if (z15) {
            if (!this.h0) {
                this.P = SystemClock.elapsedRealtime();
            }
            f6Var.d(0.0f, true);
            this.M = false;
            this.N = 0L;
        } else if (z14) {
            f6Var.d(1.0f, true);
            this.M = false;
            this.N = 0L;
        }
        q();
        this.h0 = z15;
        this.S = z15 ? SystemClock.elapsedRealtime() : 0L;
        if (z15) {
            e();
            k3 k3Var = this.d0;
            k3Var.getClass();
            k3Var.v = Math.max(0L, 0L);
            if (this.d0.d() || this.d0.c()) {
                k3 k3Var2 = this.d0;
                k3Var2.b = -1L;
                k3Var2.c = -1L;
            }
            v0Var.invalidate();
        } else {
            k3 k3Var3 = this.d0;
            if (k3Var3 != null && this.e0 == 0 && !k3Var3.d() && !this.d0.c()) {
                this.d0.a();
                v0Var.invalidate();
            }
        }
        int w02 = z14 ? org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.q7, this.b) : z10 ? -15352320 : -11814402;
        this.y0 = z14;
        int i11 = this.U;
        if (i11 == 0) {
            this.V = w02;
            this.U = w02;
            this.T = w02;
        } else if (w02 != i11) {
            this.T = this.V;
            this.U = w02;
            this.J.d(0.0f, true);
            v0Var.invalidate();
        }
        String string = z14 ? LocaleController.getString(R.string.WalletTransferStatusFailed) : z10 ? LocaleController.getString(R.string.WalletTransferStatusSent) : LocaleController.getString(R.string.WalletTransferStatusReceived);
        j3 j3Var = this.I;
        if (z15) {
            j3Var.f(10, string, true);
        } else {
            j3Var.g(10, string);
        }
        SpannableStringBuilder p5 = l0.p(l0.n(Math.abs(tL_messageActionGramTransfer.amount), false), 0.75f);
        for (RelativeSizeSpan relativeSizeSpan : (RelativeSizeSpan[]) p5.getSpans(0, p5.length(), RelativeSizeSpan.class)) {
            p5.removeSpan(relativeSizeSpan);
        }
        p5.insert(0, (CharSequence) (z10 ? "–" : "+"));
        int indexOf = p5.toString().indexOf(46);
        if (indexOf >= 0) {
            p5.setSpan(new RelativeSizeSpan(0.75f), indexOf, p5.length(), 33);
        }
        Object obj = new Object();
        p5.setSpan(obj, 0, p5.length(), 33);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(l0.k("Grams", p5, R.string.Grams_other));
        int spanStart = spannableStringBuilder.getSpanStart(obj);
        int spanEnd = spannableStringBuilder.getSpanEnd(obj);
        spannableStringBuilder.removeSpan(obj);
        ki.y5 y5Var = this.u0;
        if (spanStart > 0) {
            spannableStringBuilder.setSpan(CharacterStyle.wrap(y5Var), 0, spanStart, 33);
        }
        if (spanEnd >= 0 && spanEnd < spannableStringBuilder.length()) {
            spannableStringBuilder.setSpan(CharacterStyle.wrap(y5Var), spanEnd, spannableStringBuilder.length(), 33);
        }
        this.n0 = new i11(spannableStringBuilder, 16.0f, AndroidUtilities.bold());
        String str2 = tL_messageActionGramTransfer.peer_address;
        Locale locale = Locale.US;
        String f7 = x5.f(x5.d(str2.toUpperCase(locale)));
        i11 i11Var = new i11("", 9.3f, AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MONO));
        i11Var.n(2);
        this.o0 = i11Var;
        i11Var.r(f7);
        if (TextUtils.isEmpty(str)) {
            this.p0 = null;
        } else {
            i11 i11Var2 = new i11("", 10.0f, Typeface.create(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MONO), 1));
            this.p0 = i11Var2;
            i11Var2.r(TextUtils.ellipsize(AndroidUtilities.replaceNewLines(str.toUpperCase(locale)), this.p0.a, AndroidUtilities.dp(206.0f) - AndroidUtilities.dp(24.0f), TextUtils.TruncateAt.END));
        }
        Stack stack = this.d;
        ArrayList arrayList = this.c;
        stack.addAll(arrayList);
        arrayList.clear();
        if (TextUtils.isEmpty(tL_messageActionGramTransfer.comment)) {
            this.q0 = null;
            return;
        }
        i11 i11Var3 = new i11("", 12.0f, null);
        i11Var3.n(ConnectionsManager.DEFAULT_DATACENTER_ID);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        i11Var3.a();
        i11Var3.q(AndroidUtilities.dp(184.0f));
        this.q0 = i11Var3;
        if ((!tL_messageActionGramTransfer.comment_encrypted && !tL_messageActionGramTransfer.comment_encrypted_preparing) || this.m0) {
            i11Var3.r(Emoji.replaceEmoji(tL_messageActionGramTransfer.comment, i11Var3.a.getFontMetricsInt(), false));
            return;
        }
        StringBuilder sb2 = new StringBuilder(25);
        for (int i12 = 0; i12 < 25; i12++) {
            sb2.append("a");
        }
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(sb2.toString());
        q11 q11Var = new q11();
        q11Var.a |= 256;
        spannableStringBuilder2.setSpan(new r11(q11Var, 0), 0, spannableStringBuilder2.length(), 33);
        this.q0.r(spannableStringBuilder2);
        wh.g.c(v0Var, this.q0.b, stack, arrayList);
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
            ((wh.g) obj).invalidateSelf();
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
        l3 l3Var = this.m;
        float f7 = this.A;
        float f10 = this.B;
        if (!z11 && !this.h0 && this.r == 0.0f && this.s == 0.0f && this.t == 0.0f) {
            z10 = false;
        }
        l3Var.r = f7;
        l3Var.s = f10;
        l3Var.v = z10;
        l3Var.w = z11;
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
