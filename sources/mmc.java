// default package

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
import android.text.style.CharacterStyle;
import android.text.style.RelativeSizeSpan;
import android.view.View;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Stack;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Wallet.c;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class mmc {
    public float A;
    public float B;
    public boolean D;
    public boolean E;
    public zna F;
    public ValueAnimator G;
    public boolean H;
    public final jmc I;
    public final ln J;
    public final ln K;
    public final Paint L;
    public boolean M;
    public long N;
    public final Paint O;
    public long P;
    public final ln Q;
    public float R;
    public long S;
    public int T;
    public int U;
    public int V;
    public final Path W;
    public final Paint X;
    public final u51 Y;
    public zna Z;
    public final cm1 a;
    public float a0;
    public final ylb b;
    public zna b0;
    public float c0;
    public kmc d0;
    public boolean e;
    public long e0;
    public boolean f0;
    public boolean g0;
    public boolean h0;
    public final Drawable i;
    public boolean i0;
    public ValueAnimator j0;
    public final uoc k;
    public ho1 k0;
    public final p09 l;
    public TLRPC.TL_messageActionGramTransfer l0;
    public lmc m;
    public boolean m0;
    public boolean n;
    public uib n0;
    public boolean o;
    public uib o0;
    public float p;
    public uib p0;
    public float q;
    public uib q0;
    public float r;
    public boolean r0;
    public float s;
    public vl1 s0;
    public float t;
    public int t0;
    public final yl u0;
    public long v;
    public int v0;
    public final ln w0;
    public final hmc x0;
    public float y;
    public boolean y0;
    public float z;
    public final ArrayList c = new ArrayList();
    public final Stack d = new Stack();
    public final RectF f = new RectF();
    public final RectF g = new RectF();
    public final Path h = new Path();
    public final Path j = new Path();
    public final trc u = new trc();
    public final Rect w = new Rect();
    public int x = -1;
    public float C = 1.0f;

    public mmc(cm1 cm1Var, ylb ylbVar) {
        Paint paint = new Paint(1);
        this.L = paint;
        Paint paint2 = new Paint(1);
        this.O = paint2;
        Path path = new Path();
        this.W = path;
        Paint paint3 = new Paint(1);
        this.X = paint3;
        this.a0 = 1.0f;
        this.t0 = -10624001;
        this.u0 = new yl(this, (byte) 3);
        this.v0 = -1;
        new Paint(1);
        new Paint(1);
        this.x0 = new hmc();
        this.a = cm1Var;
        this.b = ylbVar;
        this.i = cm1Var.getResources().getDrawable(R.drawable.wallet_action_card_gradient).mutate();
        Context context = cm1Var.getContext();
        uoc uocVar = uoc.H;
        if (uocVar == null) {
            uocVar = new uoc(context.getApplicationContext());
            uoc.H = uocVar;
        }
        this.k = uocVar;
        p09 p09Var = new p09(R.raw.wallet_diamond_white, gm.L(42.0f), gm.L(42.0f), false, null);
        this.l = p09Var;
        p09Var.M(cm1Var);
        p09Var.F(0);
        cm1Var.addOnAttachStateChangeListener(new um0(this, cm1Var, (byte) 2));
        paint2.setColor(-10033409);
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        paint2.setStrokeWidth(gm.N(1.0f));
        byte b = 7;
        vl1 vl1Var = new vl1(cm1Var, b);
        d53 d53Var = d53.h;
        this.Q = new ln(1.0f, vl1Var, 0L, 180L, d53Var);
        this.K = new ln(new vl1(cm1Var, b), 320L, d53Var, 0);
        this.J = new ln(new vl1(cm1Var, b), 320L, d53Var, 0);
        jmc jmcVar = new jmc(cm1Var, cm1Var);
        this.I = jmcVar;
        jmcVar.y = -1;
        rx4.d(path, 1.0f, false);
        paint3.setStyle(style);
        paint3.setStrokeWidth(gm.N(4.0f));
        paint3.setPathEffect(new CornerPathEffect(gm.L(2.33f)));
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint3.setShader(new LinearGradient(0.0f, 0.0f, gm.L(48.0f), gm.L(48.0f), new int[]{16777215, cmb.p1(0.35f, 16777215), 16777215}, new float[]{0.0f, 0.5f, 1.0f}, tileMode));
        paint.setShader(new LinearGradient(-gm.L(10.0f), 0.0f, gm.L(10.0f), 0.0f, new int[]{16777215, -2130706433, 16777215}, new float[]{0.0f, 0.5f, 1.0f}, tileMode));
        u51 u51Var = new u51(cm1Var);
        this.Y = u51Var;
        u51Var.f = new imc(this, (byte) 0);
        this.w0 = new ln(1.0f, new vl1(cm1Var, b), 0L, 400L, d53Var);
    }

    public static int h() {
        return gm.L(206.0f);
    }

    public final void a(float f) {
        if (this.F == null) {
            zna znaVar = new zna(new xk4(this.C));
            this.F = znaVar;
            aoa aoaVar = new aoa(f);
            aoaVar.a(0.55f);
            aoaVar.b(280.0f);
            znaVar.m = aoaVar;
            this.F.f(0.001f);
            this.F.b(new gmc(this, (byte) 0));
        }
        this.F.c(f);
    }

    public final void b() {
        cm1 cm1Var = this.a;
        if (cm1Var.isShown()) {
            gm.W3(cm1Var);
        }
        zna znaVar = this.Z;
        if (znaVar != null) {
            znaVar.d();
        }
        zna znaVar2 = new zna(new xk4(this.a0));
        this.Z = znaVar2;
        aoa aoaVar = new aoa(1.0f);
        aoaVar.a(0.55f);
        aoaVar.b(280.0f);
        znaVar2.m = aoaVar;
        this.Z.f(0.001f);
        zna znaVar3 = this.Z;
        znaVar3.a = -3.0f;
        znaVar3.b(new gmc(this, (byte) 2));
        this.Z.h();
    }

    public final void c(Canvas canvas, float f, float f2) {
        canvas.translate(0.0f, gm.L(4.0f) * this.c0);
        u51 u51Var = this.Y;
        canvas.scale(mlb.A(this.c0, 0.012f, 1.0f, u51Var.a(0.025f) * this.a0), mlb.B(this.c0, 0.04f, 1.0f, u51Var.a(0.025f) * this.a0), (gm.L(206.0f) / 2.0f) + f, f2 + gm.L(70.0f));
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x0567  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0576  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x05f1  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0569  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x03da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(Canvas canvas) {
        float f;
        float f2;
        trc trcVar;
        boolean z;
        boolean z2;
        uib uibVar;
        RectF rectF;
        Canvas canvas2;
        kmc kmcVar;
        float e;
        boolean z3;
        float f3;
        float e2;
        float f4;
        long j;
        float f5;
        lmc lmcVar;
        canvas.save();
        u51 u51Var = this.Y;
        float A = mlb.A(this.c0, 0.012f, 1.0f, u51Var.a(0.025f) * this.a0);
        float B = mlb.B(this.c0, 0.04f, 1.0f, u51Var.a(0.025f) * this.a0);
        float L = gm.L(4.0f) * this.c0;
        c(canvas, 0.0f, 0.0f);
        float L2 = gm.L(4.0f);
        RectF rectF2 = this.f;
        rectF2.set(L2, L2, gm.L(206.0f) - L2, gm.L(140.0f) - L2);
        Canvas.EdgeType edgeType = Canvas.EdgeType.AA;
        boolean quickReject = canvas.quickReject(rectF2, edgeType);
        cm1 cm1Var = this.a;
        uoc uocVar = this.k;
        if (quickReject) {
            f = 4.0f;
        } else {
            Handler handler = uocVar.d;
            f = 4.0f;
            Sensor sensor = uocVar.b;
            if (sensor != null && cm1Var.isAttachedToWindow() && cm1Var.isShown() && cm1Var.getWindowVisibility() == 0) {
                f2 = 206.0f;
                uocVar.e.put(cm1Var, Long.valueOf(SystemClock.uptimeMillis()));
                if (!uocVar.r) {
                    uocVar.s = false;
                    boolean registerListener = uocVar.a.registerListener(uocVar, sensor, 1, handler);
                    uocVar.r = registerListener;
                    if (registerListener) {
                        handler.postDelayed(uocVar.G, 250L);
                    }
                }
                Path path = this.j;
                path.rewind();
                float L3 = gm.L(16.0f);
                float L4 = gm.L(16.0f);
                Path.Direction direction = Path.Direction.CW;
                path.addRoundRect(rectF2, L3, L4, direction);
                canvas.save();
                canvas.clipPath(path);
                canvas.translate((gm.L(10.0f) * uocVar.E) + rectF2.centerX(), (gm.L(8.0f) * uocVar.F) + rectF2.centerY());
                q();
                canvas.rotate((uocVar.F * 6.0f) + (uocVar.E * 14.0f) + this.R);
                float hypot = (((float) Math.hypot(rectF2.width(), rectF2.height())) / 2.0f) + gm.L(16.0f);
                Drawable drawable = this.i;
                int max = Math.max(1, drawable.getIntrinsicWidth());
                int max2 = Math.max(1, drawable.getIntrinsicHeight());
                float min = hypot / Math.min(max, max2);
                int ceil = (int) Math.ceil(max * min);
                int ceil2 = (int) Math.ceil(max2 * min);
                float e3 = this.w0.e(false, 1.0f);
                drawable.setBounds(-ceil, -ceil2, ceil, ceil2);
                drawable.draw(canvas);
                this.t0 = e3 < 1.0f ? on2.f(e3, -10624001, -10624001) : -10624001;
                canvas.restore();
                int L5 = gm.L(42.0f);
                float centerX = rectF2.centerX();
                float f6 = L5 / 2.0f;
                int round = Math.round(centerX - f6);
                float max3 = Math.max(0.0f, Math.min(1.0f, (this.C - 1.0f) / 2.0f));
                float L6 = rectF2.top + gm.L(8.0f);
                int round2 = Math.round((((rectF2.centerY() - f6) - L6) * max3) + L6);
                int i = round + L5;
                int i2 = L5 + round2;
                p09 p09Var = this.l;
                p09Var.setBounds(round, round2, i, i2);
                boolean quickReject2 = canvas.quickReject(round, round2, i, i2, edgeType);
                Rect bounds = p09Var.getBounds();
                Rect rect = this.w;
                rect.set(bounds);
                trcVar = this.u;
                if (trcVar.q()) {
                    canvas.save();
                    canvas.clipPath(path);
                    canvas.translate(rect.exactCenterX(), rect.exactCenterY());
                    trcVar.p(canvas);
                    canvas.restore();
                    cm1Var.postInvalidateOnAnimation();
                }
                p();
                if (this.m != null) {
                    float exactCenterX = ((rect.exactCenterX() - (gm.L(f2) / 2.0f)) * A) + (gm.L(f2) / 2.0f);
                    float A2 = td4.A(rect.exactCenterY(), gm.L(70.0f), B, L + gm.L(70.0f));
                    this.m.setTranslationX((this.p + exactCenterX) - f6);
                    this.m.setTranslationY((this.q + A2) - f6);
                    this.m.setScaleX(this.C * A);
                    this.m.setScaleY(B * this.C);
                }
                z = quickReject2 && (lmcVar = this.m) != null && lmcVar.n;
                if (!z) {
                    p09Var.stop();
                    this.H = false;
                } else if (!this.H && !quickReject2) {
                    z2 = true;
                    this.H = true;
                    p09Var.O(true, 0.0f);
                    p09Var.start();
                    if (!z && !this.E) {
                        p09Var.draw(canvas);
                    }
                    uibVar = this.n0;
                    if (uibVar != null) {
                        float j2 = uibVar.j();
                        float width = rectF2.width() - gm.L(16.0f);
                        float f7 = j2 > width ? width / j2 : 1.0f;
                        rectF = rectF2;
                        float h = (this.n0.h() / 2.0f) + rectF.top + gm.L(55.0f);
                        canvas.save();
                        canvas.scale(f7, f7, rectF.centerX(), h);
                        this.n0.c(rectF.centerX() - (j2 / 2.0f), h, 1.0f, -1, canvas);
                        canvas.restore();
                    } else {
                        rectF = rectF2;
                    }
                    if (this.o0 != null) {
                        float L7 = (gm.L(f2) - this.o0.j()) / 2.0f;
                        float L8 = (rectF.bottom - gm.L(7.0f)) - this.o0.h();
                        uib uibVar2 = this.p0;
                        if (uibVar2 != null) {
                            uibVar2.c((gm.L(f2) - this.p0.j()) / 2.0f, (L8 - gm.L(f)) - (this.p0.h() / 2.0f), 1.0f, this.t0, canvas);
                        }
                        this.o0.c(L7, L8 + gm.L(1.0f), 1.0f, 268435455, canvas);
                        this.o0.c(L7, L8, 1.0f, e3 < 1.0f ? on2.f(e3, -16693808, -16693808) : -16693808, canvas);
                        canvas2 = canvas;
                    } else {
                        canvas2 = canvas;
                    }
                    kmcVar = this.d0;
                    if (kmcVar != null && !kmcVar.c()) {
                        if (this.e0 != 0 && !this.h0 && !this.f0 && SystemClock.elapsedRealtime() - this.e0 >= 600) {
                            this.d0.a();
                            this.f0 = z2;
                        }
                        float strokeWidth = this.d0.x.getStrokeWidth() / 2.0f;
                        RectF rectF3 = this.g;
                        rectF3.set(rectF);
                        rectF3.inset(strokeWidth, strokeWidth);
                        float max4 = Math.max(0.0f, gm.L(16.0f) - strokeWidth);
                        Path path2 = this.h;
                        path2.rewind();
                        path2.addRoundRect(rectF3, max4, max4, direction);
                        this.d0.e(rectF);
                        this.d0.draw(canvas2);
                        if (this.e0 != 0 && this.d0.c()) {
                            this.e0 = 0L;
                        }
                    }
                    ValueAnimator valueAnimator = this.j0;
                    boolean z4 = (valueAnimator != null || valueAnimator.getCurrentPlayTime() >= 1000) ? false : z2;
                    float f8 = (!this.h0 || this.i0 || z4) ? 0.0f : 1.0f;
                    ln lnVar = this.K;
                    e = lnVar.e(false, f8);
                    z3 = this.h0;
                    ylb ylbVar = this.b;
                    if (!z3 || this.i0 || z4) {
                        f3 = 255.0f;
                    } else {
                        boolean z5 = this.y0;
                        ln lnVar2 = this.J;
                        if (z5) {
                            f4 = 1.0f;
                            if (lnVar2.c >= 1.0f) {
                                this.U = cmb.v0(cmb.p7, ylbVar);
                            }
                        } else {
                            f4 = 1.0f;
                        }
                        float e4 = lnVar2.e(false, f4);
                        int f9 = e4 >= f4 ? this.U : on2.f(e4, this.T, this.U);
                        this.V = f9;
                        jmc jmcVar = this.I;
                        jmcVar.f(f9);
                        f3 = 255.0f;
                        jmcVar.setBounds(((int) rectF.right) - gm.L(46.0f), ((int) rectF.top) - gm.L(2.0f), gm.L(2.0f) + ((int) rectF.right), gm.L(46.0f) + ((int) rectF.top));
                        canvas2.save();
                        if (e < 1.0f) {
                            float exactCenterX2 = jmcVar.getBounds().exactCenterX();
                            f5 = 48.0f;
                            float exactCenterY = jmcVar.getBounds().exactCenterY();
                            float L9 = gm.L(48.0f) * 0.70710677f * e;
                            canvas2.rotate(45.0f, exactCenterX2, exactCenterY);
                            j = 0;
                            canvas2.clipRect(exactCenterX2 - L9, exactCenterY - gm.L(48.0f), L9 + exactCenterX2, gm.L(48.0f) + exactCenterY);
                            canvas2.rotate(-45.0f, exactCenterX2, exactCenterY);
                        } else {
                            j = 0;
                            f5 = 48.0f;
                        }
                        jmcVar.draw(canvas2);
                        if (this.U != -15352320) {
                            e4 = this.T == -15352320 ? 1.0f - e4 : 0.0f;
                        }
                        Path path3 = this.W;
                        if (e4 > 0.0f) {
                            Rect bounds2 = jmcVar.getBounds();
                            canvas2.save();
                            canvas2.translate(bounds2.right - gm.L(f5), bounds2.top);
                            canvas2.clipPath(path3);
                            Paint paint = this.X;
                            paint.setAlpha((int) (e4 * 255.0f));
                            canvas2.drawPath(path3, paint);
                            canvas2.restore();
                        }
                        if (e < 1.0f || lnVar.i) {
                            this.M = true;
                            this.N = 0L;
                        } else {
                            long elapsedRealtime = SystemClock.elapsedRealtime();
                            if (this.M) {
                                this.M = false;
                                this.N = elapsedRealtime + 500;
                                cm1Var.postInvalidateDelayed(500L);
                            }
                            long j3 = this.N;
                            if (j3 != j && elapsedRealtime >= j3) {
                                float f10 = (elapsedRealtime - j3) / 600.0f;
                                if (f10 >= 1.0f) {
                                    this.N = j;
                                } else {
                                    Rect bounds3 = jmcVar.getBounds();
                                    canvas2.save();
                                    canvas2.translate(bounds3.right - gm.L(f5), bounds3.top);
                                    canvas2.clipPath(path3);
                                    canvas2.rotate(45.0f);
                                    float L10 = gm.L(10.0f);
                                    float f11 = -L10;
                                    canvas2.translate(aq1.g(L10, 2.0f, gm.L(f5) * 1.4142135f, f10, f11), 0.0f);
                                    canvas2.drawRect(f11, -gm.L(f5), L10, gm.L(f5), this.L);
                                    canvas2.restore();
                                    cm1Var.postInvalidateOnAnimation();
                                }
                            }
                        }
                        canvas2.restore();
                    }
                    int i3 = 0;
                    e2 = this.Q.e(false, this.E ? 0.0f : 1.0f);
                    if (this.g0 && !this.E && e < 1.0f && e2 > 0.0f) {
                        int round3 = Math.round((1.0f - e) * e2 * f3);
                        Paint paint2 = this.O;
                        paint2.setAlpha(round3);
                        float N = rectF.right - gm.N(15.5f);
                        float N2 = gm.N(15.5f) + rectF.top;
                        canvas2.drawCircle(N, N2, gm.N(5.0f), paint2);
                        long elapsedRealtime2 = SystemClock.elapsedRealtime() - this.P;
                        float f12 = ((elapsedRealtime2 % 2000) / 2000.0f) * 360.0f;
                        canvas2.save();
                        canvas2.rotate(f12, N, N2);
                        canvas2.drawLine(N, N2, N, N2 - gm.N(f), paint2);
                        canvas2.rotate((360.0f * ((elapsedRealtime2 % 24000) / 24000.0f)) - f12, N, N2);
                        canvas2.drawLine(N, N2, gm.N(2.5f) + N, N2, paint2);
                        canvas2.restore();
                        cm1Var.postInvalidateOnAnimation();
                    }
                    if (this.q0 != null) {
                        int v0 = cmb.g1(ylbVar) ? cmb.v0(cmb.Ea, ylbVar) : -1;
                        TLRPC.TL_messageActionGramTransfer tL_messageActionGramTransfer = this.l0;
                        if ((tL_messageActionGramTransfer.comment_encrypted || tL_messageActionGramTransfer.comment_encrypted_preparing) && !this.m0) {
                            canvas2.save();
                            canvas2.translate((gm.L(f2) - this.q0.j()) / 2.0f, gm.L(143.0f));
                            ArrayList arrayList = this.c;
                            int size = arrayList.size();
                            while (i3 < size) {
                                Object obj = arrayList.get(i3);
                                i3++;
                                rna rnaVar = (rna) obj;
                                rnaVar.h(v0);
                                rnaVar.draw(canvas2);
                            }
                            canvas2.restore();
                        } else {
                            this.q0.c((gm.L(f2) - this.q0.j()) / 2.0f, gm.L(143.0f), 1.0f, v0, canvas);
                        }
                    }
                    canvas.restore();
                }
                z2 = true;
                if (!z) {
                    p09Var.draw(canvas);
                }
                uibVar = this.n0;
                if (uibVar != null) {
                }
                if (this.o0 != null) {
                }
                kmcVar = this.d0;
                if (kmcVar != null) {
                    if (this.e0 != 0) {
                        this.d0.a();
                        this.f0 = z2;
                    }
                    float strokeWidth2 = this.d0.x.getStrokeWidth() / 2.0f;
                    RectF rectF32 = this.g;
                    rectF32.set(rectF);
                    rectF32.inset(strokeWidth2, strokeWidth2);
                    float max42 = Math.max(0.0f, gm.L(16.0f) - strokeWidth2);
                    Path path22 = this.h;
                    path22.rewind();
                    path22.addRoundRect(rectF32, max42, max42, direction);
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
                ln lnVar3 = this.K;
                e = lnVar3.e(false, f8);
                z3 = this.h0;
                ylb ylbVar2 = this.b;
                if (z3) {
                }
                f3 = 255.0f;
                int i32 = 0;
                e2 = this.Q.e(false, this.E ? 0.0f : 1.0f);
                if (this.g0) {
                    int round32 = Math.round((1.0f - e) * e2 * f3);
                    Paint paint22 = this.O;
                    paint22.setAlpha(round32);
                    float N3 = rectF.right - gm.N(15.5f);
                    float N22 = gm.N(15.5f) + rectF.top;
                    canvas2.drawCircle(N3, N22, gm.N(5.0f), paint22);
                    long elapsedRealtime22 = SystemClock.elapsedRealtime() - this.P;
                    float f122 = ((elapsedRealtime22 % 2000) / 2000.0f) * 360.0f;
                    canvas2.save();
                    canvas2.rotate(f122, N3, N22);
                    canvas2.drawLine(N3, N22, N3, N22 - gm.N(f), paint22);
                    canvas2.rotate((360.0f * ((elapsedRealtime22 % 24000) / 24000.0f)) - f122, N3, N22);
                    canvas2.drawLine(N3, N22, gm.N(2.5f) + N3, N22, paint22);
                    canvas2.restore();
                    cm1Var.postInvalidateOnAnimation();
                }
                if (this.q0 != null) {
                }
                canvas.restore();
            }
        }
        f2 = 206.0f;
        Path path4 = this.j;
        path4.rewind();
        float L32 = gm.L(16.0f);
        float L42 = gm.L(16.0f);
        Path.Direction direction2 = Path.Direction.CW;
        path4.addRoundRect(rectF2, L32, L42, direction2);
        canvas.save();
        canvas.clipPath(path4);
        canvas.translate((gm.L(10.0f) * uocVar.E) + rectF2.centerX(), (gm.L(8.0f) * uocVar.F) + rectF2.centerY());
        q();
        canvas.rotate((uocVar.F * 6.0f) + (uocVar.E * 14.0f) + this.R);
        float hypot2 = (((float) Math.hypot(rectF2.width(), rectF2.height())) / 2.0f) + gm.L(16.0f);
        Drawable drawable2 = this.i;
        int max5 = Math.max(1, drawable2.getIntrinsicWidth());
        int max22 = Math.max(1, drawable2.getIntrinsicHeight());
        float min2 = hypot2 / Math.min(max5, max22);
        int ceil3 = (int) Math.ceil(max5 * min2);
        int ceil22 = (int) Math.ceil(max22 * min2);
        float e32 = this.w0.e(false, 1.0f);
        drawable2.setBounds(-ceil3, -ceil22, ceil3, ceil22);
        drawable2.draw(canvas);
        this.t0 = e32 < 1.0f ? on2.f(e32, -10624001, -10624001) : -10624001;
        canvas.restore();
        int L52 = gm.L(42.0f);
        float centerX2 = rectF2.centerX();
        float f62 = L52 / 2.0f;
        int round4 = Math.round(centerX2 - f62);
        float max32 = Math.max(0.0f, Math.min(1.0f, (this.C - 1.0f) / 2.0f));
        float L62 = rectF2.top + gm.L(8.0f);
        int round22 = Math.round((((rectF2.centerY() - f62) - L62) * max32) + L62);
        int i4 = round4 + L52;
        int i22 = L52 + round22;
        p09 p09Var2 = this.l;
        p09Var2.setBounds(round4, round22, i4, i22);
        boolean quickReject22 = canvas.quickReject(round4, round22, i4, i22, edgeType);
        Rect bounds4 = p09Var2.getBounds();
        Rect rect2 = this.w;
        rect2.set(bounds4);
        trcVar = this.u;
        if (trcVar.q()) {
        }
        p();
        if (this.m != null) {
        }
        if (quickReject22) {
        }
        if (!z) {
        }
        z2 = true;
        if (!z) {
        }
        uibVar = this.n0;
        if (uibVar != null) {
        }
        if (this.o0 != null) {
        }
        kmcVar = this.d0;
        if (kmcVar != null) {
        }
        ValueAnimator valueAnimator22 = this.j0;
        if (valueAnimator22 != null) {
        }
        if (this.h0) {
        }
        ln lnVar32 = this.K;
        e = lnVar32.e(false, f8);
        z3 = this.h0;
        ylb ylbVar22 = this.b;
        if (z3) {
        }
        f3 = 255.0f;
        int i322 = 0;
        e2 = this.Q.e(false, this.E ? 0.0f : 1.0f);
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
        kmc kmcVar = new kmc(this, this.b);
        this.d0 = kmcVar;
        kmcVar.g(4969977, cmb.p1(0.125f, -11807239), 4969977, cmb.p1(0.75f, -11807239));
        this.d0.x.setStrokeWidth(gm.N(2.0f));
        kmc kmcVar2 = this.d0;
        kmcVar2.t = 2.0f;
        kmcVar2.y = this.h;
        kmcVar2.D = true;
    }

    public final void f() {
        ValueAnimator valueAnimator = this.j0;
        if (valueAnimator != null) {
            this.j0 = null;
            valueAnimator.removeAllListeners();
            valueAnimator.cancel();
            ln lnVar = this.K;
            if (lnVar.i) {
                this.M = false;
                this.N = 0L;
            }
            lnVar.e(true, 1.0f);
            this.t = 0.0f;
            ((ArrayList) this.u.b).clear();
            ho1 ho1Var = this.k0;
            this.k0 = null;
            this.a.invalidate();
            if (ho1Var != null) {
                gm.d3(ho1Var, 1L);
            }
        }
    }

    public final float g() {
        long uptimeMillis = SystemClock.uptimeMillis();
        if (this.v != 0) {
            float min = Math.min(0.1f, (uptimeMillis - r2) / 1000.0f);
            float f = this.h0 ? 1.7883515f : 0.0f;
            float f2 = -min;
            float exp = (float) Math.exp(f2 / 0.2f);
            float f3 = (min * f) + this.r;
            float f4 = this.s - f;
            this.r = (((1.0f - exp) * (0.2f * f4)) + f3) % 6.2831855f;
            this.s = (f4 * exp) + f;
            float exp2 = (float) Math.exp(f2 / 0.75f);
            float f5 = this.r;
            float f6 = this.t;
            this.r = (((1.0f - exp2) * (0.75f * f6)) + f5) % 6.2831855f;
            float f7 = f6 * exp2;
            this.t = f7;
            if (f7 < 0.001f) {
                this.t = 0.0f;
            }
        }
        this.v = uptimeMillis;
        return (this.k.E * 0.14f) + ((float) (((uptimeMillis / 1000.0d) * 0.5961171984672546d) % 6.283185307179586d)) + this.r;
    }

    public final void i(boolean z) {
        if (z) {
            this.Q.e(true, 0.0f);
        } else if (this.E && this.h0) {
            this.P = SystemClock.elapsedRealtime();
        }
        this.E = z;
        lmc lmcVar = this.m;
        if (lmcVar != null) {
            lmcVar.setAlpha(z ? 0.0f : 1.0f);
        }
        this.a.invalidate();
    }

    public final void j() {
        this.x = -1;
        cm1 cm1Var = this.a;
        if (cm1Var.getParent() != null) {
            cm1Var.getParent().requestDisallowInterceptTouchEvent(false);
        }
        float IEEEremainder = (float) Math.IEEEremainder(this.A - g(), 6.283185307179586d);
        float IEEEremainder2 = (float) Math.IEEEremainder(this.B - (this.k.F * 0.14f), 6.283185307179586d);
        this.D = true;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.G = ofFloat;
        ofFloat.setDuration(350L);
        this.G.setInterpolator(d53.h);
        this.G.addUpdateListener(new dz1(this, IEEEremainder, IEEEremainder2, (byte) 7));
        this.G.start();
        a(1.0f);
    }

    public final void k() {
        i(false);
        this.Q.e(true, 1.0f);
        if (this.x != -1) {
            cm1 cm1Var = this.a;
            if (cm1Var.getParent() != null) {
                cm1Var.getParent().requestDisallowInterceptTouchEvent(false);
            }
        }
        this.x = -1;
        ValueAnimator valueAnimator = this.G;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.G = null;
        }
        zna znaVar = this.F;
        if (znaVar != null) {
            znaVar.d();
            this.F = null;
        }
        this.D = false;
        this.C = 1.0f;
        this.B = 0.0f;
        this.v = 0L;
        this.t = 0.0f;
        this.s = 0.0f;
        this.r = 0.0f;
        ((ArrayList) this.u.b).clear();
        lmc lmcVar = this.m;
        if (lmcVar != null) {
            lmcVar.setScaleX(1.0f);
            this.m.setScaleY(1.0f);
        }
    }

    public final void l() {
        zna znaVar = this.b0;
        if (znaVar != null) {
            znaVar.d();
            this.b0 = null;
        }
        this.c0 = 0.0f;
        cm1 cm1Var = this.a;
        cm1Var.invalidate();
        if (cm1Var.getParent() instanceof View) {
            ((View) cm1Var.getParent()).invalidate();
        }
    }

    public final void m(boolean z, TLRPC.TL_messageActionGramTransfer tL_messageActionGramTransfer, String str, int i, boolean z2, boolean z3) {
        cm1 cm1Var = this.a;
        if (z2) {
            f();
            this.M = false;
            this.N = 0L;
            this.h0 = false;
            k();
            zna znaVar = this.Z;
            if (znaVar != null) {
                znaVar.d();
                this.Z = null;
            }
            this.a0 = 1.0f;
            cm1Var.invalidate();
            if (cm1Var.getParent() instanceof View) {
                ((View) cm1Var.getParent()).invalidate();
            }
            l();
            this.R = 0.0f;
            this.S = 0L;
            this.l.stop();
            this.H = false;
        }
        this.g0 = z;
        this.l0 = tL_messageActionGramTransfer;
        boolean z4 = !z && z3;
        this.i0 = z4;
        ln lnVar = this.K;
        if (z4) {
            lnVar.e(true, 0.0f);
            this.M = false;
            this.N = 0L;
        } else if (z2) {
            lnVar.e(true, 1.0f);
            this.M = false;
            this.N = 0L;
        }
        this.m0 = false;
        boolean z5 = z && i == 2;
        boolean z6 = z && i == 1;
        if (this.h0 && z && i == 0) {
            b();
            g();
            this.t = 18.0f;
            this.u.z();
            cm1Var.invalidate();
        }
        if (z6) {
            if (!this.h0) {
                this.P = SystemClock.elapsedRealtime();
            }
            lnVar.e(true, 0.0f);
            this.M = false;
            this.N = 0L;
        } else if (z5) {
            lnVar.e(true, 1.0f);
            this.M = false;
            this.N = 0L;
        }
        q();
        this.h0 = z6;
        this.S = z6 ? SystemClock.elapsedRealtime() : 0L;
        if (z6) {
            e();
            kmc kmcVar = this.d0;
            kmcVar.v = 0L;
            if (kmcVar.d() || this.d0.c()) {
                kmc kmcVar2 = this.d0;
                kmcVar2.b = -1L;
                kmcVar2.c = -1L;
            }
            cm1Var.invalidate();
        } else {
            kmc kmcVar3 = this.d0;
            if (kmcVar3 != null && this.e0 == 0 && !kmcVar3.d() && !this.d0.c()) {
                this.d0.a();
                cm1Var.invalidate();
            }
        }
        int v0 = z5 ? cmb.v0(cmb.p7, this.b) : z ? -15352320 : -11814402;
        this.y0 = z5;
        int i2 = this.U;
        if (i2 == 0) {
            this.V = v0;
            this.U = v0;
            this.T = v0;
        } else if (v0 != i2) {
            this.T = this.V;
            this.U = v0;
            this.J.e(true, 0.0f);
            cm1Var.invalidate();
        }
        String M0 = z5 ? jb6.M0(2131742642, null) : z ? jb6.M0(2131742640, null) : jb6.M0(2131742641, null);
        jmc jmcVar = this.I;
        if (z6) {
            jmcVar.g(10, M0, true);
        } else {
            jmcVar.h(10, M0);
        }
        SpannableStringBuilder u = c.u(c.s(Math.abs(tL_messageActionGramTransfer.amount), false), 0.75f);
        for (RelativeSizeSpan relativeSizeSpan : (RelativeSizeSpan[]) u.getSpans(0, u.length(), RelativeSizeSpan.class)) {
            u.removeSpan(relativeSizeSpan);
        }
        u.insert(0, (CharSequence) (z ? "–" : "+"));
        int indexOf = u.toString().indexOf(46);
        if (indexOf >= 0) {
            u.setSpan(new RelativeSizeSpan(0.75f), indexOf, u.length(), 33);
        }
        Object obj = new Object();
        u.setSpan(obj, 0, u.length(), 33);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(c.p("Grams", u, 2131749264));
        int spanStart = spannableStringBuilder.getSpanStart(obj);
        int spanEnd = spannableStringBuilder.getSpanEnd(obj);
        spannableStringBuilder.removeSpan(obj);
        yl ylVar = this.u0;
        if (spanStart > 0) {
            spannableStringBuilder.setSpan(CharacterStyle.wrap(ylVar), 0, spanStart, 33);
        }
        if (spanEnd >= 0 && spanEnd < spannableStringBuilder.length()) {
            spannableStringBuilder.setSpan(CharacterStyle.wrap(ylVar), spanEnd, spannableStringBuilder.length(), 33);
        }
        this.n0 = new uib(spannableStringBuilder, 16.0f, gm.o());
        String str2 = tL_messageActionGramTransfer.peer_address;
        Locale locale = Locale.US;
        String f = soc.f(soc.d(str2.toUpperCase(locale)));
        uib uibVar = new uib("", 9.3f, gm.n1("fonts/rmono.ttf"));
        uibVar.l(2);
        this.o0 = uibVar;
        uibVar.p(f);
        if (TextUtils.isEmpty(str)) {
            this.p0 = null;
        } else {
            uib uibVar2 = new uib("", 10.0f, Typeface.create(gm.n1("fonts/rmono.ttf"), 1));
            this.p0 = uibVar2;
            uibVar2.p(TextUtils.ellipsize(gm.J2(str.toUpperCase(locale)), this.p0.a, gm.L(206.0f) - gm.L(24.0f), TextUtils.TruncateAt.END));
        }
        Stack stack = this.d;
        ArrayList arrayList = this.c;
        stack.addAll(arrayList);
        arrayList.clear();
        if (TextUtils.isEmpty(tL_messageActionGramTransfer.comment)) {
            this.q0 = null;
            return;
        }
        uib uibVar3 = new uib("", 12.0f, null);
        uibVar3.l(ConnectionsManager.DEFAULT_DATACENTER_ID);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        uibVar3.a();
        uibVar3.o(gm.L(184.0f));
        this.q0 = uibVar3;
        if ((!tL_messageActionGramTransfer.comment_encrypted && !tL_messageActionGramTransfer.comment_encrypted_preparing) || this.m0) {
            uibVar3.p(gw3.m(tL_messageActionGramTransfer.comment, uibVar3.a.getFontMetricsInt(), false, null, 0));
            return;
        }
        StringBuilder sb = new StringBuilder(25);
        for (int i3 = 0; i3 < 25; i3++) {
            sb.append("a");
        }
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(sb.toString());
        wkb wkbVar = new wkb();
        wkbVar.a |= 256;
        spannableStringBuilder2.setSpan(new xkb(wkbVar, 0), 0, spannableStringBuilder2.length(), 33);
        this.q0.p(spannableStringBuilder2);
        rna.c(cm1Var, this.q0.b, stack, arrayList);
        n(this.e);
    }

    public final void n(boolean z) {
        this.e = z;
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((rna) obj).invalidateSelf();
        }
    }

    public final void o(float f, float f2) {
        this.p = f;
        this.q = f2;
    }

    public final void p() {
        if (this.m == null) {
            return;
        }
        if (this.x == -1 && !this.D) {
            this.A = g();
            this.B = this.k.F * 0.14f;
        }
        boolean z = true;
        boolean z2 = this.x != -1 || this.D || this.C > 1.001f;
        lmc lmcVar = this.m;
        float f = this.A;
        float f2 = this.B;
        if (!z2 && !this.h0 && this.r == 0.0f && this.s == 0.0f && this.t == 0.0f) {
            z = false;
        }
        lmcVar.r = f;
        lmcVar.s = f2;
        lmcVar.w = z;
        lmcVar.x = z2;
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
