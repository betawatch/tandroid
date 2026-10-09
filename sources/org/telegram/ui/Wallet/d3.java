package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.LinearGradient;
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
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.view.View;
import ci.ya;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Stack;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.bd;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.hs;
import org.telegram.ui.Components.l11;
import org.telegram.ui.Components.oa;
import org.telegram.ui.Components.t11;
import org.telegram.ui.Components.u11;
import org.telegram.ui.tg;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class d3 {
    public float A;
    public float B;
    public boolean D;
    public boolean E;
    public o1.k F;
    public ValueAnimator G;
    public boolean H;
    public final a3 I;
    public final org.telegram.ui.Components.g6 J;
    public final org.telegram.ui.Components.g6 K;
    public final Paint L;
    public boolean M;
    public long N;
    public final Paint O;
    public long P;
    public final org.telegram.ui.Components.g6 Q;
    public float R;
    public long S;
    public int T;
    public int U;
    public int V;
    public final Path W;
    public final Paint X;
    public final bd Y;
    public o1.k Z;
    public final org.telegram.ui.Cells.w0 a;
    public float a0;
    public final org.telegram.ui.ActionBar.e6 b;
    public o1.k b0;
    public float c0;
    public b3 d0;
    public boolean e;
    public long e0;
    public boolean f0;
    public boolean g0;
    public boolean h0;
    public final Drawable i;
    public boolean i0;
    public ValueAnimator j0;
    public final l5 k;
    public tg k0;
    public final ck0 l;
    public TLRPC.TL_messageActionGramTransfer l0;
    public c3 m;
    public boolean m0;
    public boolean n;
    public l11 n0;
    public boolean o;
    public l11 o0;
    public float p;
    public l11 p0;
    public float q;
    public l11 q0;
    public float r;
    public boolean r0;
    public float s;
    public org.telegram.ui.Cells.p0 s0;
    public float t;
    public long v;
    public float y;
    public float z;
    public final ArrayList c = new ArrayList();
    public final Stack d = new Stack();
    public final RectF f = new RectF();
    public final RectF g = new RectF();
    public final Path h = new Path();
    public final Path j = new Path();
    public final l8 u = new l8();
    public final Rect w = new Rect();
    public int x = -1;
    public float C = 1.0f;

    public d3(org.telegram.ui.Cells.w0 w0Var, org.telegram.ui.ActionBar.e6 e6Var) {
        Paint paint = new Paint(1);
        this.L = paint;
        Paint paint2 = new Paint(1);
        this.O = paint2;
        Path path = new Path();
        this.W = path;
        Paint paint3 = new Paint(1);
        this.X = paint3;
        this.a0 = 1.0f;
        this.a = w0Var;
        this.b = e6Var;
        this.i = w0Var.getResources().getDrawable(R.drawable.wallet_action_card_gradient).mutate();
        Context context = w0Var.getContext();
        if (l5.G == null) {
            l5.G = new l5(context.getApplicationContext());
        }
        this.k = l5.G;
        ck0 ck0Var = new ck0(R.raw.wallet_diamond_white, AndroidUtilities.dp(42.0f), AndroidUtilities.dp(42.0f), false, null);
        this.l = ck0Var;
        ck0Var.R(w0Var);
        ck0Var.K(0);
        w0Var.addOnAttachStateChangeListener(new oa(2, this, w0Var));
        paint2.setColor(-10033409);
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        paint2.setStrokeWidth(AndroidUtilities.dpf2(1.0f));
        int i10 = 5;
        m mVar = new m(w0Var, i10);
        hs hsVar = hs.h;
        this.Q = new org.telegram.ui.Components.g6(1.0f, mVar, 0L, 180L, hsVar);
        this.K = new org.telegram.ui.Components.g6(new m(w0Var, i10), 320L, hsVar, 0);
        this.J = new org.telegram.ui.Components.g6(new m(w0Var, i10), 320L, hsVar, 0);
        a3 a3Var = new a3(w0Var, w0Var);
        this.I = a3Var;
        a3Var.x = -1;
        xh.m1.d(path, 1.0f, false);
        paint3.setStyle(style);
        paint3.setStrokeWidth(AndroidUtilities.dpf2(4.0f));
        paint3.setPathEffect(new CornerPathEffect(AndroidUtilities.dp(2.33f)));
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint3.setShader(new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(48.0f), AndroidUtilities.dp(48.0f), new int[]{16777215, org.telegram.ui.ActionBar.i6.m1(0.35f, 16777215), 16777215}, new float[]{0.0f, 0.5f, 1.0f}, tileMode));
        paint.setShader(new LinearGradient(-AndroidUtilities.dp(10.0f), 0.0f, AndroidUtilities.dp(10.0f), 0.0f, new int[]{16777215, -2130706433, 16777215}, new float[]{0.0f, 0.5f, 1.0f}, tileMode));
        bd bdVar = new bd(w0Var);
        this.Y = bdVar;
        bdVar.f = new z2(this, 0);
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
            this.F.b(new y2(this, 0));
        }
        this.F.g(f7);
    }

    public final void b() {
        org.telegram.ui.Cells.w0 w0Var = this.a;
        if (w0Var.isShown()) {
            AndroidUtilities.vibrateCursor(w0Var);
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
        kVar3.b(new y2(this, 2));
        this.Z.h();
    }

    public final void c(Canvas canvas, float f7, float f10) {
        canvas.translate(0.0f, AndroidUtilities.dp(4.0f) * this.c0);
        bd bdVar = this.Y;
        canvas.scale(com.google.android.gms.internal.vision.e2.A(this.c0, 0.012f, 1.0f, bdVar.a(0.025f) * this.a0), com.google.android.gms.internal.vision.e2.B(this.c0, 0.04f, 1.0f, bdVar.a(0.025f) * this.a0), (AndroidUtilities.dp(206.0f) / 2.0f) + f7, f10 + AndroidUtilities.dp(70.0f));
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x052f  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x053d  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x05c7  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0531  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x03ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(Canvas canvas) {
        float f7;
        float f10;
        l8 l8Var;
        boolean z10;
        boolean z11;
        l11 l11Var;
        Canvas canvas2;
        b3 b3Var;
        float d;
        float f11;
        float d10;
        l11 l11Var2;
        long j3;
        float f12;
        c3 c3Var;
        canvas.save();
        bd bdVar = this.Y;
        float A = com.google.android.gms.internal.vision.e2.A(this.c0, 0.012f, 1.0f, bdVar.a(0.025f) * this.a0);
        float B = com.google.android.gms.internal.vision.e2.B(this.c0, 0.04f, 1.0f, bdVar.a(0.025f) * this.a0);
        float dp = AndroidUtilities.dp(4.0f) * this.c0;
        c(canvas, 0.0f, 0.0f);
        float dp2 = AndroidUtilities.dp(4.0f);
        RectF rectF = this.f;
        rectF.set(dp2, dp2, AndroidUtilities.dp(206.0f) - dp2, AndroidUtilities.dp(140.0f) - dp2);
        Canvas.EdgeType edgeType = Canvas.EdgeType.AA;
        boolean quickReject = canvas.quickReject(rectF, edgeType);
        org.telegram.ui.Cells.w0 w0Var = this.a;
        l5 l5Var = this.k;
        if (quickReject) {
            f7 = 4.0f;
        } else {
            Handler handler = l5Var.d;
            f7 = 4.0f;
            Sensor sensor = l5Var.b;
            if (sensor != null && w0Var.isAttachedToWindow() && w0Var.isShown() && w0Var.getWindowVisibility() == 0) {
                f10 = 206.0f;
                l5Var.e.put(w0Var, Long.valueOf(SystemClock.uptimeMillis()));
                if (!l5Var.r) {
                    l5Var.s = false;
                    boolean registerListener = l5Var.a.registerListener(l5Var, sensor, 1, handler);
                    l5Var.r = registerListener;
                    if (registerListener) {
                        handler.postDelayed(l5Var.F, 250L);
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
                canvas.translate((AndroidUtilities.dp(10.0f) * l5Var.y) + rectF.centerX(), (AndroidUtilities.dp(8.0f) * l5Var.E) + rectF.centerY());
                q();
                canvas.rotate((l5Var.E * 6.0f) + (l5Var.y * 14.0f) + this.R);
                float hypot = (((float) Math.hypot(rectF.width(), rectF.height())) / 2.0f) + AndroidUtilities.dp(16.0f);
                Drawable drawable = this.i;
                int max = Math.max(1, drawable.getIntrinsicWidth());
                int max2 = Math.max(1, drawable.getIntrinsicHeight());
                float min = hypot / Math.min(max, max2);
                int ceil = (int) Math.ceil(max * min);
                int ceil2 = (int) Math.ceil(max2 * min);
                drawable.setBounds(-ceil, -ceil2, ceil, ceil2);
                drawable.draw(canvas);
                canvas.restore();
                int dp5 = AndroidUtilities.dp(42.0f);
                float f13 = dp5 / 2.0f;
                int round = Math.round(rectF.centerX() - f13);
                float max3 = Math.max(0.0f, Math.min(1.0f, (this.C - 1.0f) / 2.0f));
                float dp6 = rectF.top + AndroidUtilities.dp(8.0f);
                int round2 = Math.round((((rectF.centerY() - f13) - dp6) * max3) + dp6);
                int i10 = round + dp5;
                int i11 = dp5 + round2;
                ck0 ck0Var = this.l;
                ck0Var.setBounds(round, round2, i10, i11);
                boolean quickReject2 = canvas.quickReject(round, round2, i10, i11, edgeType);
                Rect bounds = ck0Var.getBounds();
                Rect rect = this.w;
                rect.set(bounds);
                l8Var = this.u;
                if (l8Var.d()) {
                    canvas.save();
                    canvas.clipPath(path);
                    canvas.translate(rect.exactCenterX(), rect.exactCenterY());
                    l8Var.c(canvas);
                    canvas.restore();
                    w0Var.postInvalidateOnAnimation();
                }
                p();
                if (this.m != null) {
                    float exactCenterX = ((rect.exactCenterX() - (AndroidUtilities.dp(f10) / 2.0f)) * A) + (AndroidUtilities.dp(f10) / 2.0f);
                    float y3 = com.google.android.gms.internal.vision.e2.y(rect.exactCenterY(), AndroidUtilities.dp(70.0f), B, dp + AndroidUtilities.dp(70.0f));
                    this.m.setTranslationX((this.p + exactCenterX) - f13);
                    this.m.setTranslationY((this.q + y3) - f13);
                    this.m.setScaleX(this.C * A);
                    this.m.setScaleY(B * this.C);
                }
                z10 = quickReject2 && (c3Var = this.m) != null && c3Var.h;
                if (!z10) {
                    ck0Var.stop();
                    this.H = false;
                } else if (!this.H && !quickReject2) {
                    z11 = true;
                    this.H = true;
                    ck0Var.T(0.0f, true);
                    ck0Var.start();
                    if (!z10 && !this.E) {
                        ck0Var.draw(canvas);
                    }
                    l11Var = this.n0;
                    if (l11Var != null) {
                        float l4 = l11Var.l();
                        float width = rectF.width() - AndroidUtilities.dp(16.0f);
                        float f14 = l4 > width ? width / l4 : 1.0f;
                        float dp7 = rectF.top + AndroidUtilities.dp(55.0f) + (this.n0.j() / 2.0f);
                        canvas.save();
                        canvas.scale(f14, f14, rectF.centerX(), dp7);
                        this.n0.c(rectF.centerX() - (l4 / 2.0f), dp7, 1.0f, -1, canvas);
                        canvas.restore();
                    }
                    if (this.o0 != null) {
                        float dp8 = (AndroidUtilities.dp(f10) - this.o0.l()) / 2.0f;
                        float dp9 = (rectF.bottom - AndroidUtilities.dp(7.0f)) - this.o0.j();
                        l11 l11Var3 = this.p0;
                        if (l11Var3 != null) {
                            l11Var3.c((AndroidUtilities.dp(f10) - this.p0.l()) / 2.0f, (dp9 - AndroidUtilities.dp(f7)) - (this.p0.j() / 2.0f), 1.0f, -10624001, canvas);
                        }
                        canvas2 = canvas;
                        this.o0.c(dp8, dp9 + AndroidUtilities.dp(1.0f), 1.0f, 268435455, canvas2);
                        this.o0.c(dp8, dp9, 1.0f, -16693808, canvas2);
                    } else {
                        canvas2 = canvas;
                    }
                    b3Var = this.d0;
                    if (b3Var != null && !b3Var.c()) {
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
                    float f15 = (!this.h0 || this.i0 || z12) ? 0.0f : 1.0f;
                    org.telegram.ui.Components.g6 g6Var = this.K;
                    d = g6Var.d(f15, false);
                    if (!this.h0 || this.i0 || z12) {
                        f11 = 255.0f;
                    } else {
                        float d11 = this.J.d(1.0f, false);
                        int d12 = d11 >= 1.0f ? this.U : i0.a.d(d11, this.T, this.U);
                        this.V = d12;
                        a3 a3Var = this.I;
                        Paint paint = (Paint) a3Var.b;
                        paint.setShader(null);
                        paint.setColor(d12);
                        f11 = 255.0f;
                        a3Var.setBounds(((int) rectF.right) - AndroidUtilities.dp(46.0f), ((int) rectF.top) - AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f) + ((int) rectF.right), AndroidUtilities.dp(46.0f) + ((int) rectF.top));
                        canvas2.save();
                        if (d < 1.0f) {
                            float exactCenterX2 = a3Var.getBounds().exactCenterX();
                            f12 = 48.0f;
                            float exactCenterY = a3Var.getBounds().exactCenterY();
                            j3 = 0;
                            float dp10 = AndroidUtilities.dp(48.0f) * ((float) Math.sqrt(0.5d)) * d;
                            canvas2.rotate(45.0f, exactCenterX2, exactCenterY);
                            canvas2.clipRect(exactCenterX2 - dp10, exactCenterY - AndroidUtilities.dp(48.0f), dp10 + exactCenterX2, AndroidUtilities.dp(48.0f) + exactCenterY);
                            canvas2.rotate(-45.0f, exactCenterX2, exactCenterY);
                        } else {
                            j3 = 0;
                            f12 = 48.0f;
                        }
                        a3Var.draw(canvas2);
                        if (this.U != -15352320) {
                            d11 = this.T == -15352320 ? 1.0f - d11 : 0.0f;
                        }
                        Path path3 = this.W;
                        if (d11 > 0.0f) {
                            Rect bounds2 = a3Var.getBounds();
                            canvas2.save();
                            canvas2.translate(bounds2.right - AndroidUtilities.dp(f12), bounds2.top);
                            canvas2.clipPath(path3);
                            Paint paint2 = this.X;
                            paint2.setAlpha((int) (d11 * 255.0f));
                            canvas2.drawPath(path3, paint2);
                            canvas2.restore();
                        }
                        if (d < 1.0f || g6Var.i) {
                            this.M = true;
                            this.N = 0L;
                        } else {
                            long elapsedRealtime = SystemClock.elapsedRealtime();
                            if (this.M) {
                                this.M = false;
                                this.N = elapsedRealtime + 500;
                                w0Var.postInvalidateDelayed(500L);
                            }
                            long j10 = this.N;
                            if (j10 != j3 && elapsedRealtime >= j10) {
                                float f16 = (elapsedRealtime - j10) / 600.0f;
                                if (f16 >= 1.0f) {
                                    this.N = j3;
                                } else {
                                    Rect bounds3 = a3Var.getBounds();
                                    canvas2.save();
                                    canvas2.translate(bounds3.right - AndroidUtilities.dp(f12), bounds3.top);
                                    canvas2.clipPath(path3);
                                    canvas2.rotate(45.0f);
                                    float dp11 = AndroidUtilities.dp(10.0f);
                                    float f17 = -dp11;
                                    canvas2.translate((((dp11 * 2.0f) + (AndroidUtilities.dp(f12) * ((float) Math.sqrt(2.0d)))) * f16) + f17, 0.0f);
                                    canvas.drawRect(f17, -AndroidUtilities.dp(f12), dp11, AndroidUtilities.dp(f12), this.L);
                                    canvas2 = canvas;
                                    canvas2.restore();
                                    w0Var.postInvalidateOnAnimation();
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
                        float f18 = ((elapsedRealtime2 % 2000) / 2000.0f) * 360.0f;
                        canvas2.save();
                        canvas2.rotate(f18, dpf2, dpf22);
                        Canvas canvas3 = canvas2;
                        canvas3.drawLine(dpf2, dpf22, dpf2, dpf22 - AndroidUtilities.dpf2(f7), paint3);
                        canvas3.rotate((360.0f * ((elapsedRealtime2 % 24000) / 24000.0f)) - f18, dpf2, dpf22);
                        canvas3.drawLine(dpf2, dpf22, AndroidUtilities.dpf2(2.5f) + dpf2, dpf22, paint3);
                        canvas2 = canvas3;
                        canvas2.restore();
                        w0Var.postInvalidateOnAnimation();
                    }
                    l11Var2 = this.q0;
                    if (l11Var2 != null) {
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
                                vh.g gVar = (vh.g) obj;
                                gVar.h(-1);
                                gVar.draw(canvas2);
                            }
                            canvas2.restore();
                        } else {
                            l11Var2.c((AndroidUtilities.dp(f10) - this.q0.l()) / 2.0f, AndroidUtilities.dp(143.0f), 1.0f, -1, canvas2);
                        }
                    }
                    canvas.restore();
                }
                z11 = true;
                if (!z10) {
                    ck0Var.draw(canvas);
                }
                l11Var = this.n0;
                if (l11Var != null) {
                }
                if (this.o0 != null) {
                }
                b3Var = this.d0;
                if (b3Var != null) {
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
                org.telegram.ui.Components.g6 g6Var2 = this.K;
                d = g6Var2.d(f15, false);
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
                    float f182 = ((elapsedRealtime22 % 2000) / 2000.0f) * 360.0f;
                    canvas2.save();
                    canvas2.rotate(f182, dpf23, dpf222);
                    Canvas canvas32 = canvas2;
                    canvas32.drawLine(dpf23, dpf222, dpf23, dpf222 - AndroidUtilities.dpf2(f7), paint32);
                    canvas32.rotate((360.0f * ((elapsedRealtime22 % 24000) / 24000.0f)) - f182, dpf23, dpf222);
                    canvas32.drawLine(dpf23, dpf222, AndroidUtilities.dpf2(2.5f) + dpf23, dpf222, paint32);
                    canvas2 = canvas32;
                    canvas2.restore();
                    w0Var.postInvalidateOnAnimation();
                }
                l11Var2 = this.q0;
                if (l11Var2 != null) {
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
        canvas.translate((AndroidUtilities.dp(10.0f) * l5Var.y) + rectF.centerX(), (AndroidUtilities.dp(8.0f) * l5Var.E) + rectF.centerY());
        q();
        canvas.rotate((l5Var.E * 6.0f) + (l5Var.y * 14.0f) + this.R);
        float hypot2 = (((float) Math.hypot(rectF.width(), rectF.height())) / 2.0f) + AndroidUtilities.dp(16.0f);
        Drawable drawable2 = this.i;
        int max5 = Math.max(1, drawable2.getIntrinsicWidth());
        int max22 = Math.max(1, drawable2.getIntrinsicHeight());
        float min2 = hypot2 / Math.min(max5, max22);
        int ceil3 = (int) Math.ceil(max5 * min2);
        int ceil22 = (int) Math.ceil(max22 * min2);
        drawable2.setBounds(-ceil3, -ceil22, ceil3, ceil22);
        drawable2.draw(canvas);
        canvas.restore();
        int dp52 = AndroidUtilities.dp(42.0f);
        float f132 = dp52 / 2.0f;
        int round4 = Math.round(rectF.centerX() - f132);
        float max32 = Math.max(0.0f, Math.min(1.0f, (this.C - 1.0f) / 2.0f));
        float dp62 = rectF.top + AndroidUtilities.dp(8.0f);
        int round22 = Math.round((((rectF.centerY() - f132) - dp62) * max32) + dp62);
        int i102 = round4 + dp52;
        int i112 = dp52 + round22;
        ck0 ck0Var2 = this.l;
        ck0Var2.setBounds(round4, round22, i102, i112);
        boolean quickReject22 = canvas.quickReject(round4, round22, i102, i112, edgeType);
        Rect bounds4 = ck0Var2.getBounds();
        Rect rect2 = this.w;
        rect2.set(bounds4);
        l8Var = this.u;
        if (l8Var.d()) {
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
        l11Var = this.n0;
        if (l11Var != null) {
        }
        if (this.o0 != null) {
        }
        b3Var = this.d0;
        if (b3Var != null) {
        }
        ValueAnimator valueAnimator22 = this.j0;
        if (valueAnimator22 != null) {
        }
        if (this.h0) {
        }
        org.telegram.ui.Components.g6 g6Var22 = this.K;
        d = g6Var22.d(f15, false);
        if (this.h0) {
        }
        f11 = 255.0f;
        d10 = this.Q.d(this.E ? 0.0f : 1.0f, false);
        if (this.g0) {
        }
        l11Var2 = this.q0;
        if (l11Var2 != null) {
        }
        canvas.restore();
    }

    public final void e() {
        if (this.d0 != null) {
            return;
        }
        b3 b3Var = new b3(this, this.b);
        this.d0 = b3Var;
        b3Var.g(4969977, org.telegram.ui.ActionBar.i6.m1(0.125f, -11807239), 4969977, org.telegram.ui.ActionBar.i6.m1(0.75f, -11807239));
        this.d0.x.setStrokeWidth(AndroidUtilities.dpf2(2.0f));
        b3 b3Var2 = this.d0;
        b3Var2.t = 2.0f;
        b3Var2.y = this.h;
        b3Var2.D = true;
    }

    public final void f() {
        ValueAnimator valueAnimator = this.j0;
        if (valueAnimator == null) {
            return;
        }
        this.j0 = null;
        valueAnimator.removeAllListeners();
        valueAnimator.cancel();
        org.telegram.ui.Components.g6 g6Var = this.K;
        if (g6Var.i) {
            this.M = false;
            this.N = 0L;
        }
        g6Var.d(1.0f, true);
        this.t = 0.0f;
        this.u.a.clear();
        tg tgVar = this.k0;
        this.k0 = null;
        this.a.invalidate();
        if (tgVar != null) {
            AndroidUtilities.runOnUIThread(tgVar, 1L);
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
            this.s = com.google.android.gms.internal.vision.e2.y(f12, f7, exp, f7);
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
        c3 c3Var = this.m;
        if (c3Var != null) {
            c3Var.setAlpha(z10 ? 0.0f : 1.0f);
        }
        this.a.invalidate();
    }

    public final void j() {
        this.x = -1;
        org.telegram.ui.Cells.w0 w0Var = this.a;
        if (w0Var.getParent() != null) {
            w0Var.getParent().requestDisallowInterceptTouchEvent(false);
        }
        float IEEEremainder = (float) Math.IEEEremainder(this.A - g(), 6.283185307179586d);
        float IEEEremainder2 = (float) Math.IEEEremainder(this.B - (this.k.E * 0.14f), 6.283185307179586d);
        this.D = true;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.G = ofFloat;
        ofFloat.setDuration(350L);
        this.G.setInterpolator(hs.h);
        this.G.addUpdateListener(new ya(this, IEEEremainder, IEEEremainder2, 5));
        this.G.start();
        a(1.0f);
    }

    public final void k() {
        i(false);
        this.Q.d(1.0f, true);
        if (this.x != -1) {
            org.telegram.ui.Cells.w0 w0Var = this.a;
            if (w0Var.getParent() != null) {
                w0Var.getParent().requestDisallowInterceptTouchEvent(false);
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
        c3 c3Var = this.m;
        if (c3Var != null) {
            c3Var.setScaleX(1.0f);
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
        org.telegram.ui.Cells.w0 w0Var = this.a;
        w0Var.invalidate();
        if (w0Var.getParent() instanceof View) {
            ((View) w0Var.getParent()).invalidate();
        }
    }

    public final void m(boolean z10, TLRPC.TL_messageActionGramTransfer tL_messageActionGramTransfer, String str, int i10, boolean z11, boolean z12) {
        org.telegram.ui.Cells.w0 w0Var = this.a;
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
            w0Var.invalidate();
            if (w0Var.getParent() instanceof View) {
                ((View) w0Var.getParent()).invalidate();
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
        org.telegram.ui.Components.g6 g6Var = this.K;
        if (z13) {
            g6Var.d(0.0f, true);
            this.M = false;
            this.N = 0L;
        } else if (z11) {
            g6Var.d(1.0f, true);
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
            w0Var.invalidate();
        }
        if (z15) {
            if (!this.h0) {
                this.P = SystemClock.elapsedRealtime();
            }
            g6Var.d(0.0f, true);
            this.M = false;
            this.N = 0L;
        } else if (z14) {
            g6Var.d(1.0f, true);
            this.M = false;
            this.N = 0L;
        }
        q();
        this.h0 = z15;
        this.S = z15 ? SystemClock.elapsedRealtime() : 0L;
        if (z15) {
            e();
            b3 b3Var = this.d0;
            b3Var.getClass();
            b3Var.v = Math.max(0L, 0L);
            if (this.d0.d() || this.d0.c()) {
                b3 b3Var2 = this.d0;
                b3Var2.b = -1L;
                b3Var2.c = -1L;
            }
            w0Var.invalidate();
        } else {
            b3 b3Var3 = this.d0;
            if (b3Var3 != null && this.e0 == 0 && !b3Var3.d() && !this.d0.c()) {
                this.d0.a();
                w0Var.invalidate();
            }
        }
        int w02 = z14 ? org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.q7, this.b) : z10 ? -15352320 : -11814402;
        int i11 = this.U;
        if (i11 == 0) {
            this.V = w02;
            this.U = w02;
            this.T = w02;
        } else if (w02 != i11) {
            this.T = this.V;
            this.U = w02;
            this.J.d(0.0f, true);
            w0Var.invalidate();
        }
        String string = z14 ? LocaleController.getString(R.string.WalletTransferStatusFailed) : z10 ? LocaleController.getString(R.string.WalletTransferStatusSent) : LocaleController.getString(R.string.WalletTransferStatusReceived);
        a3 a3Var = this.I;
        if (z15) {
            a3Var.f(10, string, true);
        } else {
            l11 l11Var = a3Var.c;
            if (l11Var == null) {
                a3Var.f(10, string, true);
            } else if (!TextUtils.equals(l11Var.k(), string)) {
                a3Var.d = a3Var.c;
                a3Var.c = new l11(string, 10, AndroidUtilities.bold());
                a3Var.e.d(0.0f, true);
                a3Var.invalidateSelf();
            }
        }
        SpannableStringBuilder o9 = k0.o(k0.n(Math.abs(tL_messageActionGramTransfer.amount), false), 0.75f);
        for (RelativeSizeSpan relativeSizeSpan : (RelativeSizeSpan[]) o9.getSpans(0, o9.length(), RelativeSizeSpan.class)) {
            o9.removeSpan(relativeSizeSpan);
        }
        o9.insert(0, (CharSequence) (z10 ? "–" : "+"));
        int indexOf = o9.toString().indexOf(46);
        if (indexOf >= 0) {
            o9.setSpan(new RelativeSizeSpan(0.75f), indexOf, o9.length(), 33);
        }
        Object obj = new Object();
        o9.setSpan(obj, 0, o9.length(), 33);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(k0.k("Grams", o9, R.string.Grams_other));
        int spanStart = spannableStringBuilder.getSpanStart(obj);
        int spanEnd = spannableStringBuilder.getSpanEnd(obj);
        spannableStringBuilder.removeSpan(obj);
        if (spanStart > 0) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(-10624001), 0, spanStart, 33);
        }
        if (spanEnd >= 0 && spanEnd < spannableStringBuilder.length()) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(-10624001), spanEnd, spannableStringBuilder.length(), 33);
        }
        this.n0 = new l11(spannableStringBuilder, 16.0f, AndroidUtilities.bold());
        String str2 = tL_messageActionGramTransfer.peer_address;
        Locale locale = Locale.US;
        String d = i5.d(i5.b(str2.toUpperCase(locale)));
        l11 l11Var2 = new l11("", 9.3f, AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MONO));
        l11Var2.n(2);
        this.o0 = l11Var2;
        l11Var2.r(d);
        if (TextUtils.isEmpty(str)) {
            this.p0 = null;
        } else {
            l11 l11Var3 = new l11("", 10.0f, Typeface.create(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MONO), 1));
            this.p0 = l11Var3;
            l11Var3.r(TextUtils.ellipsize(AndroidUtilities.replaceNewLines(str.toUpperCase(locale)), this.p0.a, AndroidUtilities.dp(206.0f) - AndroidUtilities.dp(24.0f), TextUtils.TruncateAt.END));
        }
        Stack stack = this.d;
        ArrayList arrayList = this.c;
        stack.addAll(arrayList);
        arrayList.clear();
        if (TextUtils.isEmpty(tL_messageActionGramTransfer.comment)) {
            this.q0 = null;
            return;
        }
        l11 l11Var4 = new l11("", 12.0f, null);
        l11Var4.n(ConnectionsManager.DEFAULT_DATACENTER_ID);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        l11Var4.a();
        l11Var4.q(AndroidUtilities.dp(184.0f));
        this.q0 = l11Var4;
        if ((!tL_messageActionGramTransfer.comment_encrypted && !tL_messageActionGramTransfer.comment_encrypted_preparing) || this.m0) {
            l11Var4.r(Emoji.replaceEmoji(tL_messageActionGramTransfer.comment, l11Var4.a.getFontMetricsInt(), false));
            return;
        }
        StringBuilder sb2 = new StringBuilder(25);
        for (int i12 = 0; i12 < 25; i12++) {
            sb2.append("a");
        }
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(sb2.toString());
        t11 t11Var = new t11();
        t11Var.a |= 256;
        spannableStringBuilder2.setSpan(new u11(t11Var, 0), 0, spannableStringBuilder2.length(), 33);
        this.q0.r(spannableStringBuilder2);
        vh.g.c(w0Var, this.q0.b, stack, arrayList);
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
            ((vh.g) obj).invalidateSelf();
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
        c3 c3Var = this.m;
        float f7 = this.A;
        float f10 = this.B;
        if (!z11 && !this.h0 && this.r == 0.0f && this.s == 0.0f && this.t == 0.0f) {
            z10 = false;
        }
        c3Var.n = f7;
        c3Var.r = f10;
        c3Var.s = z10;
        c3Var.v = z11;
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
