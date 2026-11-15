package ji;

import ai.f2;
import ai.k1;
import ai.m0;
import ai.r0;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.Layout;
import android.text.SpannableString;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.style.ForegroundColorSpan;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import bi.p1;
import com.google.android.gms.internal.vision.e2;
import di.h8;
import hi.g7;
import hi.h4;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.g0;
import org.telegram.messenger.ns;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.t2;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.gf;
import org.telegram.ui.Components.nu0;
import org.telegram.ui.Components.st0;
import org.telegram.ui.Components.uc;
import org.telegram.ui.Components.xe;
import org.telegram.ui.Dictation.DictationAsr;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final class e extends View {
    public static int j3;
    public static long n3;
    public static int o3;
    public static int p3;
    public static float q3;
    public long A0;
    public final TextPaint A1;
    public float A2;
    public float B0;
    public final Matrix B1;
    public float B2;
    public long C0;
    public final TextPaint C1;
    public float C2;
    public float D0;
    public fh.g D1;
    public float D2;
    public final Matrix E;
    public float E0;
    public float E1;
    public float E2;
    public LinearGradient F;
    public long F0;
    public float F1;
    public float F2;
    public final t2 G;
    public float G0;
    public float G1;
    public float G2;
    public final Drawable H;
    public float H0;
    public long H1;
    public float H2;
    public fh.g I;
    public float I0;
    public LinearGradient I1;
    public Bitmap I2;
    public fh.g J;
    public float J0;
    public RadialGradient J1;
    public float[] J2;
    public float K;
    public boolean K0;
    public LinearGradient K1;
    public float[] K2;
    public float L;
    public final int L0;
    public final Paint L1;
    public int L2;
    public boolean M;
    public LinearGradient M0;
    public final Paint M1;
    public int M2;
    public int N;
    public final Matrix N0;
    public final Paint N1;
    public int N2;
    public int O;
    public String O0;
    public final Paint O1;
    public int O2;
    public int P;
    public StaticLayout P0;
    public final Matrix P1;
    public float P2;
    public int Q;
    public StaticLayout Q0;
    public final RectF Q1;
    public float Q2;
    public boolean R;
    public StaticLayout R0;
    public boolean R1;
    public float R2;
    public boolean S;
    public StaticLayout S0;
    public boolean S1;
    public float S2;
    public boolean T;
    public float T0;
    public long T1;
    public boolean T2;
    public float U;
    public LinearGradient U0;
    public float U1;
    public final Paint U2;
    public float V;
    public float V0;
    public float V1;
    public final Paint V2;
    public float W;
    public final Matrix W0;
    public float W1;
    public final Paint W2;
    public final Paint X0;
    public final RectF X1;
    public LinearGradient X2;
    public long Y0;
    public Drawable Y1;
    public LinearGradient Y2;
    public int Z0;
    public fh.g Z1;
    public LinearGradient Z2;
    public final xi.e a;
    public float a0;
    public final ArrayList a1;
    public boolean a2;
    public final Matrix a3;
    public final e6 b;
    public float b0;
    public int[] b1;
    public boolean b2;
    public LinearGradient b3;
    public final r0 c;
    public float c0;
    public final ArrayList c1;
    public long c2;
    public final Matrix c3;
    public final TextPaint d;
    public float d0;
    public final Paint d1;
    public float d2;
    public final a d3;
    public final TextPaint e;
    public float e0;
    public float e1;
    public float[] e2;
    public boolean e3;
    public final TextPaint f;
    public int f0;
    public boolean f1;
    public int f2;
    public boolean f3;
    public long g0;
    public final Path g1;
    public int g2;
    public final int[] g3;
    public int h;
    public long h0;
    public final Paint h1;
    public float h2;
    public final RectF i0;
    public final Paint i1;
    public float i2;
    public final RectF j0;
    public float j1;
    public float j2;
    public final RectF k0;
    public boolean k1;
    public float k2;
    public final RectF l0;
    public String l1;
    public final ArrayList l2;
    public final RectF m0;
    public String m1;
    public final Paint m2;
    public final TextPaint n;
    public boolean n0;
    public float n1;
    public final RectF n2;
    public float o0;
    public float o1;
    public final er o2;
    public float p0;
    public float p1;
    public final float[] p2;
    public float q0;
    public float q1;
    public final Path q2;
    public final Paint r;
    public float r0;
    public float r1;
    public final nu0 r2;
    public final Paint s;
    public float s0;
    public boolean s1;
    public boolean s2;
    public float t0;
    public final RectF t1;
    public boolean t2;
    public float u0;
    public Drawable u1;
    public boolean u2;
    public float v0;
    public Drawable v1;
    public long v2;
    public final Paint w;
    public float w0;
    public final int w1;
    public long w2;
    public final Paint x;
    public float x0;
    public LinearGradient x1;
    public float x2;
    public final Paint y;
    public float y0;
    public LinearGradient y1;
    public float y2;
    public float z0;
    public final Matrix z1;
    public float z2;
    public static final float h3 = g0.L(19.0f);
    public static final float i3 = g0.L(3.0f);
    public static final float k3 = g0.L(3.0f);
    public static final float l3 = g0.N(0.5f);
    public static final float m3 = g0.L(6.0f);
    public static final er r3 = new er(0.3d, 0.0d, 0.2d, 1.0d);
    public static final er s3 = k1.E;

    public e(Context context, e6 e6Var, xi.e eVar) {
        super(context);
        this.c = new r0();
        this.d = new TextPaint(1);
        this.e = new TextPaint(1);
        this.f = new TextPaint(1);
        this.h = ns.e4;
        TextPaint textPaint = new TextPaint(1);
        this.n = textPaint;
        this.r = new Paint(1);
        Paint paint = new Paint(1);
        this.s = paint;
        this.w = new Paint(1);
        this.x = new Paint(1);
        Paint paint2 = new Paint(1);
        this.y = paint2;
        this.E = new Matrix();
        this.K = -1.0f;
        this.L = -1.0f;
        this.Q = ns.e4;
        this.f0 = -1;
        this.i0 = new RectF();
        this.j0 = new RectF();
        this.k0 = new RectF();
        this.l0 = new RectF();
        this.m0 = new RectF();
        this.B0 = -1.0f;
        this.E0 = -1.0f;
        this.G0 = Float.NaN;
        this.L0 = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        this.N0 = new Matrix();
        this.O0 = "";
        this.W0 = new Matrix();
        Paint paint3 = new Paint(1);
        this.X0 = paint3;
        Paint.Style style = Paint.Style.STROKE;
        paint3.setStyle(style);
        paint3.setStrokeWidth(g0.N(1.0f));
        this.a1 = new ArrayList();
        this.b1 = new int[0];
        this.c1 = new ArrayList();
        this.d1 = new Paint(1);
        this.f1 = true;
        this.g1 = new Path();
        this.h1 = new Paint(1);
        this.i1 = new Paint(1);
        this.t1 = new RectF();
        this.w1 = g0.L(10.0f) + g0.L(20.0f) + g0.L(8.0f) + g0.L(1.0f);
        this.z1 = new Matrix();
        this.A1 = new TextPaint(1);
        this.B1 = new Matrix();
        this.C1 = new TextPaint(1);
        this.E1 = -1.0f;
        this.L1 = new Paint(1);
        this.M1 = new Paint(1);
        this.N1 = new Paint(1);
        this.O1 = new Paint(1);
        this.P1 = new Matrix();
        this.Q1 = new RectF();
        this.X1 = new RectF();
        this.e2 = new float[0];
        this.l2 = new ArrayList();
        this.m2 = new Paint(1);
        this.n2 = new RectF();
        this.o2 = er.h;
        this.p2 = new float[2];
        this.q2 = new Path();
        this.r2 = new nu0(2200);
        this.w2 = 900L;
        this.J2 = new float[0];
        this.K2 = new float[0];
        this.U2 = new Paint();
        this.V2 = new Paint();
        this.W2 = new Paint();
        this.a3 = new Matrix();
        this.c3 = new Matrix();
        this.d3 = new a(this, 1);
        this.g3 = new int[2];
        this.b = e6Var;
        this.a = eVar;
        t2 t2Var = new t2(context);
        this.G = t2Var;
        t2Var.setCallback(this);
        this.H = context.getResources().getDrawable(R.drawable.send_plane_24).mutate();
        textPaint.setTextSize(g0.L(15.0f));
        textPaint.setTypeface(g0.o());
        paint.setStyle(style);
        paint.setStrokeWidth(g0.N(0.66f));
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        E();
    }

    public static void B(d dVar, float f10, float[] fArr) {
        float max = Math.max(0.0f, Math.min(1.0f, (f10 - dVar.j) / 0.12f));
        float f11 = dVar.l;
        float f12 = dVar.d;
        float f13 = f11 - f12;
        if (dVar.m) {
            fArr[0] = f12;
            fArr[1] = f11 - (f13 * max);
        } else {
            fArr[0] = (f13 * max) + f12;
            fArr[1] = f11;
        }
    }

    public static ArrayList D(String str) {
        ArrayList arrayList = new ArrayList();
        int i7 = 0;
        while (i7 < str.length()) {
            while (i7 < str.length() && Character.isWhitespace(str.charAt(i7))) {
                i7++;
            }
            if (i7 >= str.length()) {
                break;
            }
            int i10 = i7;
            while (i10 < str.length() && !Character.isWhitespace(str.charAt(i10))) {
                i10++;
            }
            arrayList.add(new int[]{i7, i10});
            i7 = i10;
        }
        return arrayList;
    }

    public static float a(float f10, float f11, float f12, float f13) {
        return e2.z(1.0f, (float) Math.exp((-f12) / f13), f11 - f10, f10);
    }

    public final void A(float f10, float f11, float f12, long j10, Canvas canvas) {
        nu0 nu0Var;
        float f13;
        float f14;
        d dVar;
        float f15;
        char c10;
        d dVar2;
        int i7;
        float f16;
        Canvas canvas2 = canvas;
        float f17 = (j10 - this.c2) / 1000.0f;
        float f18 = 0.4f;
        float f19 = 1.0f;
        float f20 = 0.0f;
        float interpolation = this.o2.getInterpolation(Math.max(0.0f, Math.min(1.0f, (f17 - 0.08f) / 0.4f)));
        int i10 = this.N;
        TextPaint textPaint = this.d;
        textPaint.setColor(i10);
        ArrayList arrayList = this.l2;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            int i12 = i11 + 1;
            d dVar3 = (d) arrayList.get(i11);
            if (dVar3.c) {
                float max = Math.max(f20, Math.min(f19, ((f17 - dVar3.j) - 0.26f) / 0.12f));
                if (max <= f20) {
                    i11 = i12;
                } else {
                    float L = g0.L(10.0f);
                    float f21 = dVar3.h;
                    float f22 = dVar3.k;
                    float f23 = (L + f22) * max;
                    float f24 = f23 + f21;
                    f13 = f18;
                    if (dVar3.m) {
                        f21 += f22;
                    } else {
                        f23 = g0.L(4.0f);
                    }
                    float f25 = f21 - f23;
                    float max2 = Math.max(f20, Math.min(f19, (((f17 - dVar3.j) - 0.26f) - 0.12f) / 0.45f));
                    f14 = f19;
                    textPaint.setColor(i0.a.f(e2.C(max2, 2.0f, 3.0f, max2 * max2), this.O, dVar3.q ? j3 : this.N));
                    textPaint.setAlpha((int) (255.0f * f12 * f14));
                    canvas2.save();
                    canvas2.clipRect(f10 + f25, (f11 + dVar3.i) - g0.L(40.0f), dVar3.m ? f10 + dVar3.h + dVar3.k + g0.L(4.0f) : f10 + f24, f11 + dVar3.i + g0.L(20.0f));
                    canvas2.drawText(dVar3.a, f10 + dVar3.h, f11 + dVar3.i, textPaint);
                    canvas2.restore();
                    textPaint.setColor(this.N);
                    dVar3.n = f10 + dVar3.h;
                    dVar3.o = f11 + dVar3.i;
                }
            } else {
                f13 = f18;
                f14 = f19;
                if (dVar3.b) {
                    boolean m10 = m(dVar3);
                    float[] fArr = this.p2;
                    if (m10) {
                        int indexOf = arrayList.indexOf(dVar3);
                        int i13 = indexOf;
                        while (!l((d) arrayList.get(i13))) {
                            i13++;
                        }
                        d dVar4 = (d) arrayList.get(i13);
                        float f26 = this.i2;
                        float f27 = dVar3.f + f26;
                        float f28 = l3;
                        float f29 = f27 + f28;
                        f15 = 0.5f;
                        float f30 = (f26 + dVar3.g) - f28;
                        float f31 = this.h2;
                        c10 = 1;
                        float f32 = dVar3.d + f31;
                        float f33 = k3;
                        float f34 = f31 + dVar4.l + f33;
                        RectF rectF = this.n2;
                        rectF.set(f32 - f33, f29, f34, f30);
                        Path path = this.q2;
                        path.rewind();
                        float f35 = m3;
                        d dVar5 = dVar3;
                        path.addRoundRect(rectF, f35, f35, Path.Direction.CW);
                        canvas2.save();
                        canvas2.clipPath(path);
                        int i14 = this.P;
                        float f36 = f29;
                        Paint paint = this.m2;
                        paint.setColor(i14);
                        paint.setAlpha((int) (Color.alpha(this.P) * f12));
                        int i15 = indexOf;
                        while (i15 <= i13) {
                            d dVar6 = (d) arrayList.get(i15);
                            B(dVar6, f17, fArr);
                            float f37 = fArr[1];
                            float f38 = fArr[0];
                            if (f37 - f38 < 0.5f) {
                                dVar2 = dVar5;
                                i7 = i13;
                                f16 = f36;
                            } else {
                                if (f38 <= dVar6.d + 0.5f && i15 == indexOf) {
                                    f38 -= f33;
                                }
                                if (f37 >= dVar6.l - 0.5f && i15 == i13) {
                                    f37 += f33;
                                }
                                float f39 = this.h2;
                                float f40 = f39 + f38;
                                float f41 = f39 + f37;
                                dVar2 = dVar5;
                                i7 = i13;
                                f16 = f36;
                                canvas2 = canvas;
                                canvas2.drawRect(f40, f16, f41, f30, paint);
                            }
                            i15++;
                            f36 = f16;
                            i13 = i7;
                            dVar5 = dVar2;
                        }
                        dVar = dVar5;
                        canvas2.restore();
                    } else {
                        dVar = dVar3;
                        f15 = 0.5f;
                        c10 = 1;
                    }
                    B(dVar, f17, fArr);
                    if (Math.min(fArr[c10], (dVar.d + dVar.k) + g0.L(4.0f)) - Math.max(fArr[0], dVar.d - g0.L(4.0f)) >= f15) {
                        canvas2.save();
                        float f42 = this.h2;
                        float f43 = fArr[0];
                        float f44 = dVar.d;
                        if (f43 <= f44 + f15) {
                            f43 = f44 - g0.L(4.0f);
                        }
                        float f45 = f42 + f43;
                        float L2 = (this.i2 + dVar.f) - g0.L(4.0f);
                        float f46 = this.h2;
                        float f47 = fArr[c10];
                        if (f47 >= dVar.l - f15) {
                            f47 = dVar.d + dVar.k + g0.L(4.0f);
                        }
                        canvas2.clipRect(f45, L2, f46 + f47, this.i2 + dVar.g + g0.L(4.0f));
                        textPaint.setColor(j3);
                        textPaint.setAlpha((int) (f12 * 255.0f));
                        canvas2.drawText(dVar.a, this.h2 + dVar.d, this.i2 + dVar.e, textPaint);
                        textPaint.setColor(this.N);
                        canvas2.restore();
                    }
                } else {
                    float f48 = this.h2;
                    float f49 = dVar3.d;
                    float f50 = ((((f10 + dVar3.h) - f48) - f49) * interpolation) + f48 + f49;
                    float f51 = this.i2;
                    float f52 = dVar3.e;
                    float f53 = ((((f11 + dVar3.i) - f51) - f52) * interpolation) + f51 + f52;
                    textPaint.setColor((this.b2 || !dVar3.q) ? this.N : j3);
                    textPaint.setAlpha((int) (255.0f * f12 * f14));
                    canvas2.drawText(dVar3.a, f50, f53, textPaint);
                    textPaint.setColor(this.N);
                    dVar3.n = f50;
                    dVar3.o = f53;
                }
            }
            f19 = f14;
            i11 = i12;
            f18 = f13;
            f20 = 0.0f;
        }
        float f54 = f18;
        textPaint.setAlpha(ns.e4);
        float f55 = g0.p;
        while (true) {
            int i16 = this.g2;
            int i17 = this.f2;
            nu0Var = this.r2;
            if (i16 >= i17) {
                break;
            }
            float[] fArr2 = this.e2;
            int i18 = i16 * 3;
            if (fArr2[i18 + 2] > f17) {
                break;
            }
            this.g2 = i16 + 1;
            float f56 = f10 + fArr2[i18];
            float f57 = f11 + fArr2[i18 + 1];
            RectF rectF2 = this.j0;
            if (f57 >= rectF2.top && f57 <= rectF2.bottom) {
                double d = nu0Var.d() * 3.141592653589793d * 2.0d;
                float d2 = ((nu0Var.d() * 18.0f) + 8.0f) * f55;
                this.r2.h((((float) Math.cos(d)) * d2) + f56, e2.x((float) Math.sin(d), d2, 0.7f, f57), f56, f57, ((nu0Var.d() * f54) + 0.8f) * 0.26f);
            }
        }
        if (f17 >= this.d2) {
            this.a2 = false;
            arrayList.clear();
            nu0Var.Q = g0.L(10.0f);
        }
    }

    public final boolean C(d dVar, boolean z10) {
        float L = z10 ? dVar.f : dVar.i - g0.L(14.0f);
        if ((z10 ? dVar.g : dVar.i + g0.L(4.0f)) >= this.G2 - g0.L(2.0f)) {
            return L <= (Math.max(1.0f, this.H2) + this.G2) + ((float) g0.L(2.0f));
        }
        return false;
    }

    public final void E() {
        int i7 = j6.d6;
        e6 e6Var = this.b;
        int w02 = j6.w0(i7, e6Var);
        boolean c10 = r0.c(w02);
        this.M = c10;
        r0 r0Var = this.c;
        if (r0Var.h != c10) {
            r0Var.h = c10;
        }
        int w03 = j6.w0(j6.Pe, e6Var) | (-16777216);
        r0.h(w03);
        r0Var.g(-6440822, w03);
        this.N = j6.w0(j6.Le, e6Var) | (-16777216);
        boolean z10 = this.M;
        this.O = z10 ? i0.a.f(0.12f, w03, -1) : m0.o(w03, w02, z10);
        q3 = this.M ? g0.L(7.0f) : 0.0f;
        this.P = j6.r1(this.M ? 0.18f : 0.14f, this.O);
        j3 = this.O;
        this.d.setColor(this.N);
        int w04 = j6.w0(j6.Me, e6Var);
        TextPaint textPaint = this.e;
        textPaint.setColor(w04);
        this.Q = Color.alpha(textPaint.getColor());
        int w05 = j6.w0(j6.G6, e6Var);
        TextPaint textPaint2 = this.n;
        textPaint2.setColor(w05);
        int color = textPaint2.getColor();
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.G.setColorFilter(new PorterDuffColorFilter(color, mode));
        this.x.setColor(w03);
        this.H.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.w.setColor(this.O);
        this.r.setColor(this.M ? -651810255 : -335544321);
        this.s.setColor(this.M ? 654311423 : 335544320);
        fh.g gVar = this.I;
        if (gVar != null) {
            gVar.updateColors();
        }
        fh.g gVar2 = this.J;
        if (gVar2 != null) {
            gVar2.updateColors();
        }
        this.R0 = null;
        this.M0 = null;
        this.b3 = null;
        this.I1 = null;
        this.y1 = null;
        textPaint.setShader(null);
        invalidate();
    }

    public final void F() {
        int[] iArr;
        if (this.M0 == null) {
            int[] iArr2 = this.c.B;
            boolean z10 = this.M;
            e6 e6Var = this.b;
            int d = (z10 ? r0.d(j6.w0(j6.Me, e6Var)) : j6.w0(j6.Me, e6Var)) | (-16777216);
            int e10 = this.M ? r0.e(-7359233) : i0.a.f(0.55f, iArr2[0], iArr2[4]);
            int e11 = this.M ? r0.e(-7411982) : i0.a.f(0.55f, iArr2[1], iArr2[4]);
            int e12 = this.M ? r0.e(-4940545) : i0.a.f(0.55f, iArr2[2], iArr2[4]);
            if (this.M) {
                int e13 = r0.e(-7359233);
                int e14 = r0.e(-5650177);
                iArr = new int[]{i0.a.f(0.4f, d, e13), i0.a.f(0.3f, d, e14), i0.a.f(0.4f, d, e13), i0.a.f(0.3f, d, e14)};
            } else {
                int w02 = j6.w0(j6.Me, e6Var);
                int alpha = Color.alpha(w02);
                int[] iArr3 = new int[4];
                iArr3[0] = e10;
                iArr3[1] = e11;
                iArr3[2] = e12;
                iArr3[3] = e10;
                for (int i7 = 0; i7 < 4; i7++) {
                    iArr3[i7] = i0.a.o(i0.a.f(0.12f, w02 | (-16777216), iArr3[i7]), alpha);
                }
                iArr = iArr3;
            }
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 1.0f, 0.0f, iArr, (float[]) null, Shader.TileMode.MIRROR);
            this.M0 = linearGradient;
            TextPaint textPaint = this.e;
            textPaint.setShader(linearGradient);
            textPaint.setColor(-1);
            this.Q = ns.e4;
        }
        float L = g0.L(this.M ? 260.0f : 160.0f);
        Matrix matrix = this.N0;
        matrix.setScale(L, 1.0f);
        matrix.postTranslate(((SystemClock.uptimeMillis() % 6000) / 6000.0f) * 2.0f * L, 0.0f);
        this.M0.setLocalMatrix(matrix);
    }

    public final StaticLayout b(CharSequence charSequence, TextPaint textPaint) {
        return StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, Math.max(1, this.Z0)).setAlignment(Layout.Alignment.ALIGN_NORMAL).setLineSpacing(0.0f, 1.0f).setIncludePad(false).build();
    }

    public final void c(Canvas canvas, float f10, float f11, float f12, float f13, long j10) {
        if (this.M) {
            LinearGradient linearGradient = this.I1;
            Paint paint = this.M1;
            Paint paint2 = this.L1;
            Paint paint3 = this.N1;
            if (linearGradient == null) {
                LinearGradient linearGradient2 = new LinearGradient(-1.0f, 0.0f, 1.0f, 0.0f, new int[]{r0.e(-7447553), r0.e(-13649665), r0.e(-13665281)}, (float[]) null, Shader.TileMode.MIRROR);
                this.I1 = linearGradient2;
                paint2.setShader(linearGradient2);
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                RadialGradient radialGradient = new RadialGradient(0.0f, 0.0f, 1.0f, new int[]{788529151, 536870911, 234881023, 16777215}, new float[]{0.0f, 0.35f, 0.7f, 1.0f}, tileMode);
                this.J1 = radialGradient;
                paint.setShader(radialGradient);
                LinearGradient linearGradient3 = new LinearGradient(0.0f, -1.0f, 0.0f, 1.0f, new int[]{1090519039, 184549375, 352321535}, new float[]{0.0f, 0.6f, 1.0f}, tileMode);
                this.K1 = linearGradient3;
                paint3.setShader(linearGradient3);
                paint3.setStyle(Paint.Style.STROKE);
            }
            float f14 = (j10 % 5000) / 5000.0f;
            Matrix matrix = this.P1;
            matrix.setTranslate(4.0f * f14, 0.0f);
            float f15 = 2.6f * f12;
            matrix.postScale(f15, f15);
            matrix.postRotate(35.0f);
            matrix.postTranslate(f10, f11);
            this.I1.setLocalMatrix(matrix);
            int i7 = (int) (255.0f * f13);
            paint2.setAlpha(i7);
            canvas.drawCircle(f10, f11, f12, paint2);
            float sin = 0.06f * f12 * ((float) Math.sin(f14 * 3.141592653589793d * 2.0d));
            float f16 = 0.62f * f12;
            matrix.setScale(1.35f * f12, f16);
            matrix.postTranslate(f10 + sin, f11 - f16);
            this.J1.setLocalMatrix(matrix);
            paint.setAlpha(i7);
            canvas.drawCircle(f10, f11, f12, paint);
            matrix.setScale(f12, f12);
            matrix.postTranslate(f10, f11);
            this.K1.setLocalMatrix(matrix);
            paint3.setStrokeWidth(Math.max(1.0f, g0.N(0.8f)));
            paint3.setAlpha(i7);
            canvas.drawCircle(f10, f11, f12 - g0.N(0.4f), paint3);
        }
    }

    public final void d(Canvas canvas, float f10, float f11) {
        float f12;
        float f13;
        float f14;
        boolean z10;
        PorterDuff.Mode mode;
        float f15;
        float f16;
        int i7;
        this.q1 = a(this.q1, this.l1 != null ? 1.0f : 0.0f, f11, 0.09f);
        String str = this.l1;
        if (str == null) {
            str = "Detecting…";
        }
        TextPaint textPaint = this.n;
        float measureText = textPaint.measureText(str);
        float f17 = this.p1;
        if (f17 > 0.0f) {
            measureText = a(f17, measureText, f11, 0.11f);
        }
        this.p1 = measureText;
        float L = g0.L(36.0f);
        float n10 = n();
        RectF rectF = this.j0;
        float L2 = rectF.left + g0.L(2.0f);
        float L3 = rectF.top - g0.L(8.0f);
        RectF rectF2 = this.t1;
        rectF2.set(L2, L3 - L, n10 + L2, L3);
        float f18 = rectF2.right;
        float f19 = this.w1;
        this.r1 = f18 - f19;
        if (this.D1 == null) {
            this.D1 = this.a.k(this);
        }
        float f20 = this.n1;
        float f21 = (3.0f - (f20 * 2.0f)) * f20 * f20;
        canvas.save();
        canvas.translate(0.0f, (1.0f - f21) * g0.L(6.0f));
        float C = e2.C(this.o1, 0.04f, 1.0f, (f21 * 0.1f) + 0.9f);
        canvas.scale(C, C, rectF2.left + g0.L(18.0f), rectF2.bottom);
        fh.g gVar = this.D1;
        if (gVar != null) {
            gVar.r(L / 2.0f);
            f12 = 6.0f;
            f13 = 255.0f;
            this.D1.setBounds((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
            this.D1.setAlpha((int) (f10 * 255.0f));
            this.D1.draw(canvas);
        } else {
            f12 = 6.0f;
            f13 = 255.0f;
            int i10 = this.M ? ns.u3 : ns.K3;
            Paint paint = this.r;
            paint.setAlpha((int) (i10 * f10));
            float f22 = L / 2.0f;
            canvas.drawRoundRect(rectF2, f22, f22, paint);
        }
        if (this.u1 == null) {
            this.u1 = getContext().getResources().getDrawable(R.drawable.msg_language).mutate();
        }
        int color = textPaint.getColor();
        float centerY = rectF2.centerY();
        Drawable drawable = this.u1;
        PorterDuff.Mode mode2 = PorterDuff.Mode.SRC_IN;
        drawable.setColorFilter(new PorterDuffColorFilter(color, mode2));
        float f23 = f10 * f13;
        int i11 = (int) f23;
        this.u1.setAlpha(i11);
        int L4 = (int) (rectF2.left + g0.L(12.0f));
        int L5 = (int) (centerY - g0.L(9.0f));
        this.u1.setBounds(L4, L5, g0.L(18.0f) + L4, g0.L(18.0f) + L5);
        this.u1.draw(canvas);
        float f24 = rectF2.right - f19;
        float L6 = (f24 - g0.L(13.0f)) - g0.L(4.0f);
        canvas.save();
        canvas.clipRect(rectF2.left, rectF2.top, L6 - g0.L(8.0f), rectF2.bottom);
        int alpha = textPaint.getAlpha();
        float L7 = rectF2.left + g0.L(12.0f) + g0.L(18.0f) + g0.L(f12);
        boolean z11 = this.l1 == null && this.q1 < 0.99f;
        TextPaint textPaint2 = this.C1;
        if (z11) {
            if (this.x1 == null) {
                f14 = f24;
                this.x1 = new LinearGradient(0.0f, 0.0f, 1.0f, 0.0f, new int[]{16777215, -1, 16777215}, (float[]) null, Shader.TileMode.CLAMP);
                textPaint2.setTypeface(textPaint.getTypeface());
            } else {
                f14 = f24;
            }
            textPaint2.setTextSize(textPaint.getTextSize());
            float measureText2 = textPaint.measureText("Detecting…");
            float L8 = g0.L(36.0f);
            z10 = z11;
            mode = mode2;
            float min = (Math.min(1.0f, (SystemClock.uptimeMillis() % 2200) / 1100.0f) * ((L8 * 2.0f) + measureText2)) + (L7 - L8);
            Matrix matrix = this.B1;
            matrix.setScale(L8, 1.0f);
            matrix.postTranslate(min - (L8 / 2.0f), 0.0f);
            this.x1.setLocalMatrix(matrix);
            postInvalidateOnAnimation();
        } else {
            f14 = f24;
            z10 = z11;
            mode = mode2;
        }
        Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
        float f25 = centerY - ((fontMetrics.ascent + fontMetrics.descent) / 2.0f);
        if (z10 && this.M) {
            if (this.y1 == null) {
                int color2 = textPaint.getColor() | (-16777216);
                int f26 = i0.a.f(0.4f, color2, r0.e(-7359233));
                f15 = L6;
                this.y1 = new LinearGradient(0.0f, 0.0f, 1.0f, 0.0f, new int[]{f26, i0.a.f(0.28f, color2, r0.e(-5650177)), f26}, (float[]) null, Shader.TileMode.MIRROR);
            } else {
                f15 = L6;
            }
            float L9 = g0.L(200.0f);
            Matrix matrix2 = this.z1;
            matrix2.setScale(L9, 1.0f);
            f16 = centerY;
            i7 = i11;
            matrix2.postTranslate((((SystemClock.uptimeMillis() % 6000) / 6000.0f) * 2.0f * L9) + L7, 0.0f);
            this.y1.setLocalMatrix(matrix2);
            Typeface typeface = textPaint.getTypeface();
            TextPaint textPaint3 = this.A1;
            textPaint3.setTypeface(typeface);
            textPaint3.setTextSize(textPaint.getTextSize());
            textPaint3.setShader(this.y1);
            textPaint3.setAlpha((int) ((1.0f - this.q1) * 0.62f * f23));
            canvas.drawText("Detecting…", L7, f25, textPaint3);
            float f27 = this.q1;
            if (f27 > 0.01f && this.l1 != null) {
                textPaint.setAlpha((int) (f27 * f23));
                canvas.drawText(this.l1, L7, f25, textPaint);
            }
        } else {
            f15 = L6;
            f16 = centerY;
            i7 = i11;
            textPaint.setAlpha((int) e2.B(this.q1, 0.5f, 0.5f, f23));
            String str2 = this.l1;
            if (str2 == null) {
                str2 = "Detecting…";
            }
            canvas.drawText(str2, L7, f25, textPaint);
        }
        if (z10 && SystemClock.uptimeMillis() % 2200 < 1100) {
            textPaint2.setShader(this.x1);
            textPaint2.setAlpha((int) ((1.0f - this.q1) * f23 * 0.55f));
            canvas.drawText("Detecting…", L7, f25, textPaint2);
        }
        textPaint.setAlpha(alpha);
        canvas.restore();
        Path path = this.g1;
        boolean isEmpty = path.isEmpty();
        Paint paint2 = this.h1;
        if (isEmpty) {
            path.moveTo(-g0.N(3.8f), g0.N(1.9f));
            path.lineTo(0.0f, -g0.N(1.9f));
            path.lineTo(g0.N(3.8f), g0.N(1.9f));
            paint2.setStyle(Paint.Style.STROKE);
            paint2.setStrokeWidth(g0.N(1.75f));
            paint2.setStrokeCap(Paint.Cap.ROUND);
            paint2.setStrokeJoin(Paint.Join.ROUND);
        }
        paint2.setColor(color);
        paint2.setAlpha(i7);
        canvas.save();
        canvas.translate(f15, f16);
        canvas.drawPath(path, paint2);
        canvas.restore();
        int r12 = j6.r1(0.14f * f10, color);
        Paint paint3 = this.i1;
        paint3.setColor(r12);
        canvas.drawRect(f14, f16 - g0.L(10.0f), f14 + g0.L(1.0f), f16 + g0.L(10.0f), paint3);
        if (this.v1 == null) {
            this.v1 = getContext().getResources().getDrawable(R.drawable.msg_settings).mutate();
        }
        this.v1.setColorFilter(new PorterDuffColorFilter(color, mode));
        this.v1.setAlpha(i7);
        int L10 = (int) (f14 + g0.L(1.0f) + g0.L(8.0f) + g0.L(10.0f));
        int i12 = (int) f16;
        this.v1.setBounds(L10 - g0.L(10.0f), i12 - g0.L(10.0f), g0.L(10.0f) + L10, g0.L(10.0f) + i12);
        this.v1.draw(canvas);
        canvas.restore();
    }

    public final void e(Canvas canvas, float f10) {
        float f11;
        float f12;
        float f13;
        float f14;
        float f15 = this.a0;
        float L = g0.L(36.0f);
        boolean z10 = this.R1;
        String str = z10 ? "Enhancing…" : "Enhance";
        float h = h(z10);
        RectF rectF = this.j0;
        float L2 = rectF.left + g0.L(2.0f);
        float L3 = rectF.top - g0.L(8.0f);
        boolean w10 = this.a.w();
        TextPaint textPaint = this.n;
        if (w10) {
            f11 = 8.0f;
            float max = Math.max(h(false), h(true)) + g0.L(6.0f) + g0.L(36.0f);
            if (this.E1 < 0.0f || this.F1 != textPaint.getTextSize()) {
                this.F1 = textPaint.getTextSize();
                float measureText = textPaint.measureText("Detecting…");
                f13 = 18.0f;
                f12 = 6.0f;
                float f16 = measureText;
                f14 = 12.0f;
                for (String str2 : DictationAsr.C()) {
                    String l10 = m0.l(str2);
                    if (l10 != null) {
                        f16 = Math.max(f16, textPaint.measureText(l10));
                    }
                }
                String str3 = this.l1;
                if (str3 != null) {
                    f16 = Math.max(f16, textPaint.measureText(str3));
                }
                this.E1 = f16;
            } else {
                f12 = 6.0f;
                f13 = 18.0f;
                f14 = 12.0f;
            }
            if (g0.L(f12) + g0.L(f13) + g0.L(f14) + this.E1 + g0.L(8.0f) + g0.L(8.0f) + g0.L(13.0f) + this.w1 + L2 + g0.L(8.0f) + max <= rectF.right - g0.L(56.0f)) {
                L2 += n() + g0.L(8.0f);
            } else {
                L3 -= g0.L(8.0f) + L;
            }
        } else {
            f11 = 8.0f;
            f12 = 6.0f;
            f13 = 18.0f;
            f14 = 12.0f;
        }
        RectF rectF2 = this.k0;
        rectF2.set(L2, L3 - L, h + L2, L3);
        float f17 = 1.0f - f15;
        float pow = 1.0f - ((float) Math.pow(f17, 3.0d));
        float min = 1.0f - Math.min(1.0f, f15 / 0.55f);
        float sin = ((((float) Math.sin(Math.min(1.0f, f15 / 0.8f) * 3.141592653589793d)) * 0.07f * f17) + ((1.0f - (min * min)) * 0.38f) + 0.62f) * L;
        float f18 = L * 0.62f;
        float max2 = Math.max(sin, ((rectF2.width() - f18) * pow) + f18);
        float f19 = rectF2.left;
        float f20 = rectF2.bottom;
        RectF rectF3 = this.m0;
        rectF3.set(f19, f20 - sin, max2 + f19, f20);
        float min2 = Math.min(1.0f, 3.0f * f15) * f10;
        float max3 = Math.max(0.0f, Math.min(1.0f, (f15 - 0.62f) / 0.38f)) * f10;
        float f21 = 1.0f - (this.d0 * 0.04f);
        canvas.save();
        canvas.scale(f21, f21, rectF2.left + g0.L(f13), rectF2.bottom);
        float height = rectF3.height() / 2.0f;
        if (this.J != null) {
            if (Math.abs(this.L - height) > 0.5f) {
                this.L = height;
                this.J.r(height);
            }
            this.J.setBounds((int) rectF3.left, (int) rectF3.top, (int) rectF3.right, (int) rectF3.bottom);
            this.J.setAlpha((int) (min2 * 255.0f));
            this.J.draw(canvas);
        } else {
            int i7 = this.M ? ns.u3 : ns.K3;
            Paint paint = this.r;
            paint.setAlpha((int) (i7 * min2));
            canvas.drawRoundRect(rectF3, height, height, paint);
            Paint paint2 = this.s;
            paint2.setAlpha((int) ((this.M ? 38 : 20) * min2));
            canvas.drawRoundRect(rectF3, height, height, paint2);
        }
        if (max3 > 0.0f) {
            float centerY = rectF2.centerY();
            float L4 = rectF2.left + g0.L(f14);
            int i10 = (int) L4;
            t2 t2Var = this.G;
            t2Var.setBounds(i10, (int) (centerY - g0.L(f14)), g0.L(24.0f) + i10, (int) (g0.L(f14) + centerY));
            int i11 = (int) (255.0f * max3);
            t2Var.setAlpha(i11);
            t2Var.draw(canvas);
            int alpha = textPaint.getAlpha();
            textPaint.setAlpha(i11);
            Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
            canvas.drawText(str, L4 + g0.L(f12) + g0.L(24.0f), centerY - ((fontMetrics.ascent + fontMetrics.descent) / 2.0f), textPaint);
            textPaint.setAlpha(alpha);
            Path path = this.g1;
            boolean isEmpty = path.isEmpty();
            Paint paint3 = this.h1;
            if (isEmpty) {
                path.moveTo(-g0.N(3.8f), g0.N(1.9f));
                path.lineTo(0.0f, -g0.N(1.9f));
                path.lineTo(g0.N(3.8f), g0.N(1.9f));
                paint3.setStyle(Paint.Style.STROKE);
                paint3.setStrokeWidth(g0.N(1.75f));
                paint3.setStrokeCap(Paint.Cap.ROUND);
                paint3.setStrokeJoin(Paint.Join.ROUND);
            }
            float L5 = (((rectF2.right - g0.L(10.0f)) - g0.L(14.0f)) - g0.L(f11)) - g0.L(1.0f);
            this.j1 = L5;
            int r12 = j6.r1(max3 * 0.14f, textPaint.getColor());
            Paint paint4 = this.i1;
            paint4.setColor(r12);
            canvas.drawRect(L5, rectF2.centerY() - g0.L(10.0f), g0.L(1.0f) + L5, rectF2.centerY() + g0.L(10.0f), paint4);
            paint3.setColor(textPaint.getColor());
            paint3.setAlpha(i11);
            canvas.save();
            canvas.translate((rectF2.right - g0.L(10.0f)) - g0.L(7.0f), rectF2.centerY());
            canvas.drawPath(path, paint3);
            canvas.restore();
        }
        canvas.restore();
    }

    public final void f(Canvas canvas, float f10) {
        float a10 = a(this.V1, (!this.S1 || this.R1) ? 0.0f : 1.0f, 0.016f, 0.06f);
        this.V1 = a10;
        RectF rectF = this.X1;
        if (a10 < 0.01f) {
            rectF.setEmpty();
            return;
        }
        Drawable drawable = this.Y1;
        xi.e eVar = this.a;
        if (drawable == null) {
            this.Y1 = getContext().getResources().getDrawable(R.drawable.chats_undo).mutate();
            fh.g k10 = eVar.k(this);
            this.Z1 = k10;
            if (k10 != null) {
                k10.r(g0.L(18.0f));
            }
        }
        float L = g0.L(36.0f);
        RectF rectF2 = this.k0;
        rectF.set(rectF2.right + g0.L(6.0f), rectF2.top, rectF2.right + g0.L(6.0f) + L, rectF2.top + L);
        float max = Math.max(0.0f, Math.min(1.0f, (this.a0 - 0.62f) / 0.38f));
        float f11 = this.V1;
        float f12 = f10 * f11 * max;
        if (f12 < 0.01f) {
            return;
        }
        float x10 = (1.0f - (this.W1 * 0.06f)) * e2.x(f11, 0.3f, max, 0.7f);
        canvas.save();
        canvas.scale(x10, x10, rectF.centerX(), rectF.centerY());
        fh.g gVar = this.Z1;
        if (gVar != null) {
            gVar.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            this.Z1.setAlpha((int) (255.0f * f12));
            this.Z1.draw(canvas);
        } else {
            int i7 = this.M ? ns.u3 : ns.K3;
            Paint paint = this.r;
            paint.setAlpha((int) (i7 * f12));
            float f13 = L / 2.0f;
            canvas.drawRoundRect(rectF, f13, f13, paint);
        }
        ((m) eVar.d).b.getClass();
        this.Y1.setColorFilter(new PorterDuffColorFilter((-16777216) | this.n.getColor(), PorterDuff.Mode.SRC_IN));
        float L2 = g0.L(24.0f) / 2.0f;
        this.Y1.setBounds((int) (rectF.centerX() - L2), (int) (rectF.centerY() - L2), (int) (rectF.centerX() + L2), (int) (rectF.centerY() + L2));
        this.Y1.setAlpha((int) (Color.alpha(r0) * f12));
        this.Y1.draw(canvas);
        canvas.restore();
        float f14 = this.V1;
        if (f14 <= 0.01f || f14 >= 0.99f) {
            return;
        }
        postInvalidateOnAnimation();
    }

    public final void g(Canvas canvas, float f10, float f11, float f12, float f13, long j10) {
        Paint.Style style = Paint.Style.STROKE;
        Paint paint = this.O1;
        paint.setStyle(style);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(g0.N(2.0f));
        paint.setColor(-1);
        paint.setAlpha((int) (f12 * 255.0f));
        float B = e2.B(f13, 0.3f, 0.7f, g0.N(8.5f));
        RectF rectF = this.Q1;
        rectF.set(f10 - B, f11 - B, f10 + B, f11 + B);
        long j11 = j10 - this.H1;
        float f14 = ((j11 % 1400) / 1400.0f) * 2.0f;
        float min = Math.min(1.0f, f14);
        float C = e2.C(min, 2.0f, 3.0f, min * min);
        float max = Math.max(0.0f, f14 - 1.0f);
        float f15 = ((j11 / 1400) % 18) * 220.0f;
        float C2 = (e2.C(max, 2.0f, 3.0f, max * max) * 220.0f) + f15;
        canvas.drawArc(rectF, (((((j11 % 6000) / 6000.0f) * 360.0f) * 5.0f) + C2) % 360.0f, (((C * 220.0f) + f15) + 30.0f) - C2, false, paint);
    }

    public String getShownText() {
        return this.O0;
    }

    public final float h(boolean z10) {
        return this.n.measureText(z10 ? "Enhancing…" : "Enhance") + g0.L(6.0f) + g0.L(24.0f) + g0.L(12.0f) + g0.L(12.0f) + g0.L(1.0f) + g0.L(8.0f) + g0.L(14.0f) + g0.L(10.0f);
    }

    public final boolean i() {
        long uptimeMillis = SystemClock.uptimeMillis();
        ArrayList arrayList = this.a1;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            if (uptimeMillis - ((c) obj).c < 1520) {
                return true;
            }
        }
        return false;
    }

    public final void j(d dVar, ArrayList arrayList, int i7) {
        if (arrayList == null || i7 >= arrayList.size()) {
            return;
        }
        float[] fArr = (float[]) arrayList.get(i7);
        if (Float.isNaN(fArr[0])) {
            return;
        }
        float f10 = fArr[1] - this.F2;
        float f11 = dVar.e;
        float f12 = f10 - f11;
        dVar.d = fArr[0] - this.E2;
        dVar.e = f11 + f12;
        dVar.f += f12;
        dVar.g += f12;
    }

    public final int k(float f10, float f11) {
        if (!this.R || this.W < 0.6f) {
            return -1;
        }
        float L = g0.L(6.0f);
        if (this.n1 > 0.7f) {
            RectF rectF = this.t1;
            if (!rectF.isEmpty() && !this.s1 && f10 >= rectF.left - L && f10 <= rectF.right + L && f11 >= rectF.top - L && f11 <= rectF.bottom + L) {
                return f10 >= this.r1 - ((float) g0.L(4.0f)) ? 7 : 6;
            }
        }
        if (this.a0 > 0.7f && this.T0 > 0.7f && !this.R1) {
            RectF rectF2 = this.l0;
            if (!rectF2.isEmpty() && f10 >= rectF2.left - L && f10 <= rectF2.right + L && f11 >= rectF2.top - L && f11 <= rectF2.bottom + L) {
                return 0;
            }
        }
        RectF rectF3 = this.X1;
        if (!rectF3.isEmpty() && this.V1 > 0.7f && f10 >= rectF3.left - L && f10 <= rectF3.right + L && f11 >= rectF3.top - L && f11 <= rectF3.bottom + L) {
            return 5;
        }
        boolean z10 = this.R1;
        RectF rectF4 = this.k0;
        if (z10 && !rectF4.isEmpty() && rectF4.contains(f10, f11)) {
            return -1;
        }
        return (this.a0 <= 0.7f || rectF4.isEmpty() || f10 < rectF4.left - L || f10 > rectF4.right + L || f11 < rectF4.top - L || f11 > rectF4.bottom + L) ? this.j0.contains(f10, f11) ? 2 : -1 : f10 >= this.j1 ? 4 : 1;
    }

    public final boolean l(d dVar) {
        ArrayList arrayList = this.l2;
        int indexOf = arrayList.indexOf(dVar) + 1;
        d dVar2 = indexOf < arrayList.size() ? (d) arrayList.get(indexOf) : null;
        return dVar2 == null || !dVar2.b || Math.abs(dVar2.f - dVar.f) >= 1.0f;
    }

    public final boolean m(d dVar) {
        ArrayList arrayList = this.l2;
        int indexOf = arrayList.indexOf(dVar);
        d dVar2 = indexOf > 0 ? (d) arrayList.get(indexOf - 1) : null;
        return dVar2 == null || !dVar2.b || Math.abs(dVar2.f - dVar.f) >= 1.0f;
    }

    public final float n() {
        float f10 = this.p1;
        if (f10 <= 0.0f) {
            String str = this.l1;
            if (str == null) {
                str = "Detecting…";
            }
            f10 = this.n.measureText(str);
        }
        return g0.L(6.0f) + g0.L(18.0f) + g0.L(12.0f) + f10 + g0.L(8.0f) + g0.L(8.0f) + g0.L(13.0f) + this.w1;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void o(boolean z10, float f10) {
        int i7;
        ArrayList arrayList;
        int i10;
        int i11 = -1;
        int i12 = 0;
        int i13 = -1;
        while (true) {
            arrayList = this.l2;
            if (i7 >= arrayList.size()) {
                break;
            }
            d dVar = (d) arrayList.get(i7);
            if (z10) {
                i7 = dVar.b ? i7 + 1 : 0;
                if (i11 < 0) {
                    i11 = i7;
                }
                i13 = i7;
            } else {
                if (dVar.c) {
                }
                if (i11 < 0) {
                }
                i13 = i7;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (0; i10 < arrayList.size(); i10 + 1) {
            d dVar2 = (d) arrayList.get(i10);
            if (z10) {
                i10 = dVar2.b ? 0 : i10 + 1;
                if (i13 >= 0 || i10 < i13) {
                    arrayList2.add(dVar2);
                }
            } else {
                if (!dVar2.c) {
                }
                if (i13 >= 0) {
                }
                arrayList2.add(dVar2);
            }
        }
        for (int size = arrayList.size() - 1; size > i13 && i13 >= 0; size--) {
            ((d) arrayList.get(size)).m = true;
            arrayList2.add((d) arrayList.get(size));
        }
        int size2 = arrayList2.size();
        int i14 = 0;
        int i15 = 0;
        while (i15 < size2) {
            Object obj = arrayList2.get(i15);
            i15++;
            if (C((d) obj, z10)) {
                i14++;
            }
        }
        int size3 = arrayList2.size();
        int i16 = 0;
        while (i16 < size3) {
            Object obj2 = arrayList2.get(i16);
            i16++;
            d dVar3 = (d) obj2;
            dVar3.j = e2.c(i12, Math.max(1, i14), 0.16f, f10);
            if (C(dVar3, z10)) {
                i12++;
            }
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    @Override // android.view.View
    public final void onDraw(android.graphics.Canvas r63) {
        /*
            Method dump skipped, instructions count: 3394
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ji.e.onDraw(android.graphics.Canvas):void");
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i7;
        int actionMasked = motionEvent.getActionMasked();
        a aVar = this.d3;
        int i10 = 3;
        int i11 = 1;
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                removeCallbacks(aVar);
                int i12 = this.f0;
                if (i12 == 3) {
                    i12 = 2;
                }
                this.f0 = -1;
                if (this.K0) {
                    this.K0 = false;
                    invalidate();
                    return true;
                }
                invalidate();
                if (i12 >= 0 && k(motionEvent.getX(), motionEvent.getY()) == i12) {
                    performHapticFeedback(3);
                    xi.e eVar = this.a;
                    if (i12 == 0) {
                        m mVar = (m) eVar.d;
                        String trim = mVar.n.trim();
                        if (!trim.isEmpty()) {
                            Log.d("VoiceLive", "field: send " + trim.length() + " chars as text");
                            mVar.l("field send");
                            ChatActivityEnterView chatActivityEnterView = mVar.b.a;
                            int i13 = ChatActivityEnterView.N6;
                            chatActivityEnterView.n2(trim, new uc(chatActivityEnterView, 13));
                            return true;
                        }
                    } else {
                        if (i12 == 1) {
                            m mVar2 = (m) eVar.d;
                            ChatActivityEnterView chatActivityEnterView2 = mVar2.b.a;
                            int i14 = ChatActivityEnterView.N6;
                            ArrayList y10 = chatActivityEnterView2.o0().y();
                            mVar2.j(y10.isEmpty() ? ai.i.c : y10.get(0));
                            return true;
                        }
                        if (i12 == 4) {
                            m mVar3 = (m) eVar.d;
                            if (mVar3.K != null && !mVar3.n.trim().isEmpty()) {
                                gf gfVar = mVar3.b;
                                e eVar2 = mVar3.K;
                                g7 g7Var = new g7(eVar, 5);
                                ChatActivityEnterView chatActivityEnterView3 = gfVar.a;
                                st0 st0Var = chatActivityEnterView3.U1;
                                RectF rectF = new RectF();
                                rectF.set(eVar2.k0);
                                if (!rectF.isEmpty() && st0Var != null) {
                                    FrameLayout frameLayout = new FrameLayout(chatActivityEnterView3.getContext());
                                    st0Var.addView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
                                    View view = new View(chatActivityEnterView3.getContext());
                                    frameLayout.addView(view, new FrameLayout.LayoutParams((int) rectF.width(), (int) rectF.height(), 51));
                                    frameLayout.post(new p1(gfVar, eVar2, frameLayout, view, rectF, g7Var, 14));
                                    return true;
                                }
                            }
                        } else if (i12 == 5) {
                            m mVar4 = (m) eVar.d;
                            if (mVar4.g0 != null && !mVar4.i0) {
                                Log.d("VoiceLive", "field: back to the text before the style");
                                if (mVar4.h0) {
                                    mVar4.e0 = mVar4.g0;
                                    mVar4.f0 = mVar4.c().size();
                                } else {
                                    mVar4.e0 = null;
                                }
                                mVar4.g0 = null;
                                e eVar3 = mVar4.K;
                                if (eVar3 != null) {
                                    eVar3.setRevertShown(false);
                                    mVar4.K.setRebuildNext(true);
                                }
                                mVar4.n();
                                e eVar4 = mVar4.K;
                                if (eVar4 != null) {
                                    eVar4.setRebuildNext(false);
                                    return true;
                                }
                            }
                        } else if (i12 == 6) {
                            m mVar5 = (m) eVar.d;
                            if (mVar5.K != null && ((i7 = mVar5.c) == 2 || i7 == 4)) {
                                String[] C = DictationAsr.C();
                                ArrayList arrayList = new ArrayList();
                                arrayList.add("Auto-Detect");
                                boolean v = DictationAsr.v();
                                int i15 = v ? 0 : -1;
                                for (int i16 = 0; i16 < C.length; i16++) {
                                    arrayList.add(m0.l(C[i16]));
                                    if (!v && i15 < 0 && DictationAsr.y(C[i16])) {
                                        i15 = i16 + 1;
                                    }
                                }
                                gf gfVar2 = mVar5.b;
                                e eVar5 = mVar5.K;
                                g gVar = new g(mVar5, C, i11);
                                f fVar = new f(mVar5, i10);
                                ChatActivityEnterView chatActivityEnterView4 = gfVar2.a;
                                st0 st0Var2 = chatActivityEnterView4.U1;
                                RectF rectF2 = new RectF();
                                rectF2.set(eVar5.t1);
                                if (!rectF2.isEmpty() && st0Var2 != null) {
                                    FrameLayout frameLayout2 = new FrameLayout(chatActivityEnterView4.getContext());
                                    st0Var2.addView(frameLayout2, new FrameLayout.LayoutParams(-1, -1));
                                    View view2 = new View(chatActivityEnterView4.getContext());
                                    frameLayout2.addView(view2, new FrameLayout.LayoutParams((int) rectF2.width(), (int) rectF2.height(), 51));
                                    frameLayout2.post(new h8(gfVar2, eVar5, frameLayout2, view2, rectF2, arrayList, i15, gVar, fVar));
                                    return true;
                                }
                            }
                        } else {
                            if (i12 == 7) {
                                ((m) eVar.d).k();
                                return true;
                            }
                            m mVar6 = (m) eVar.d;
                            gf gfVar3 = mVar6.b;
                            if (mVar6.K != null && mVar6.c != 0) {
                                ChatActivityEnterView chatActivityEnterView5 = gfVar3.a;
                                ChatActivityEnterView chatActivityEnterView6 = gfVar3.a;
                                st0 st0Var3 = chatActivityEnterView5.U1;
                                if (st0Var3 != null) {
                                    EditTextBoldCursor editTextBoldCursor = mVar6.X;
                                    if (editTextBoldCursor != null) {
                                        editTextBoldCursor.requestFocus();
                                        g0.J3(mVar6.X);
                                        return true;
                                    }
                                    e6 e6Var = chatActivityEnterView5.E4;
                                    EditTextBoldCursor editTextBoldCursor2 = new EditTextBoldCursor(mVar6.a);
                                    editTextBoldCursor2.setBackground(null);
                                    editTextBoldCursor2.setPadding(0, 0, 0, 0);
                                    editTextBoldCursor2.setIncludeFontPadding(false);
                                    xe xeVar = chatActivityEnterView6.F0;
                                    editTextBoldCursor2.setTextSize(0, xeVar != null ? xeVar.getTextSize() : g0.L(18.0f));
                                    editTextBoldCursor2.setTextColor(j6.w0(j6.Le, e6Var));
                                    int i17 = j6.Pe;
                                    int i18 = ChatActivityEnterView.N6;
                                    editTextBoldCursor2.setCursorColor(chatActivityEnterView6.u0(i17) | (-16777216));
                                    editTextBoldCursor2.setCursorSize(g0.L(20.0f));
                                    editTextBoldCursor2.setCursorWidth(2.0f);
                                    editTextBoldCursor2.setGravity(51);
                                    editTextBoldCursor2.setInputType(147457);
                                    editTextBoldCursor2.setImeOptions(TLObject.FLAG_28);
                                    editTextBoldCursor2.setText(mVar6.n);
                                    editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                                    int size = mVar6.c().size();
                                    mVar6.b0 = size;
                                    mVar6.Y = size;
                                    mVar6.Z = editTextBoldCursor2.length();
                                    mVar6.a0 = "";
                                    editTextBoldCursor2.addTextChangedListener(new ah.j(mVar6, 8));
                                    st0Var3.addView(editTextBoldCursor2, mVar6.K.getParent() == st0Var3 ? st0Var3.indexOfChild(mVar6.K) + 1 : st0Var3.getChildCount(), new FrameLayout.LayoutParams(1, 1, 51));
                                    mVar6.X = editTextBoldCursor2;
                                    editTextBoldCursor2.requestFocus();
                                    g0.i3(new h4(24, mVar6, editTextBoldCursor2), 50L);
                                    StringBuilder sb2 = new StringBuilder("field: editing in place (");
                                    sb2.append(mVar6.n.length());
                                    sb2.append(" chars, recording ");
                                    sb2.append(mVar6.c == 2 ? "on" : "paused");
                                    sb2.append(")");
                                    Log.d("VoiceLive", sb2.toString());
                                    mVar6.K.invalidate();
                                }
                            }
                        }
                    }
                }
            } else if (actionMasked == 2) {
                int i19 = this.f0;
                if ((i19 == 2 || i19 == 3 || this.K0) && this.J0 > 0.0f) {
                    float y11 = motionEvent.getY() - this.H0;
                    if (!this.K0 && Math.abs(y11) > this.L0) {
                        this.K0 = true;
                        this.H0 = motionEvent.getY();
                        this.I0 = this.s0;
                        this.f0 = -1;
                    }
                    if (this.K0) {
                        this.G0 = Math.max(0.0f, Math.min(this.J0, this.I0 - (motionEvent.getY() - this.H0)));
                        invalidate();
                        return true;
                    }
                }
                int i20 = this.f0;
                if (i20 >= 0 && i20 != 3 && k(motionEvent.getX(), motionEvent.getY()) != this.f0) {
                    removeCallbacks(aVar);
                    this.f0 = -1;
                    invalidate();
                    return true;
                }
            } else if (actionMasked == 3) {
                removeCallbacks(aVar);
                this.f0 = -1;
                this.K0 = false;
                invalidate();
                return true;
            }
            return true;
        }
        this.K0 = false;
        int k10 = k(motionEvent.getX(), motionEvent.getY());
        this.f0 = k10;
        if (k10 >= 0) {
            if (getParent() != null) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            this.H0 = motionEvent.getY();
            this.I0 = this.s0;
            if (this.f0 == 2 && !this.T) {
                this.f0 = 3;
            }
            if (this.f0 == 0) {
                postDelayed(aVar, ViewConfiguration.getLongPressTimeout());
            }
            invalidate();
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0122, code lost:
    
        if (r2 != null) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void p(StaticLayout staticLayout, StaticLayout staticLayout2) {
        this.t2 = false;
        Bitmap bitmap = this.I2;
        Bitmap bitmap2 = null;
        if (bitmap != null) {
            bitmap.recycle();
            this.I2 = null;
        }
        if (staticLayout == null || staticLayout2 == null || !this.n0 || staticLayout.getWidth() <= 0 || staticLayout.getHeight() <= 0) {
            return;
        }
        LinearGradient linearGradient = this.X2;
        Paint paint = this.W2;
        if (linearGradient == null) {
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            this.X2 = new LinearGradient(0.0f, 0.0f, 1.0f, 0.0f, 0, -16777216, tileMode);
            this.Y2 = new LinearGradient(0.0f, 0.0f, 1.0f, 0.0f, -16777216, 0, tileMode);
            this.Z2 = new LinearGradient(0.0f, 0.0f, 1.0f, 0.0f, 16777215, -1, tileMode);
            this.V2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_ATOP));
        }
        paint.setColorFilter(new PorterDuffColorFilter(r0.e(this.M ? -7358721 : -15363160), PorterDuff.Mode.SRC_IN));
        this.A2 = this.E2;
        this.B2 = this.F2;
        this.C2 = this.G2;
        this.D2 = Math.max(1.0f, this.H2);
        try {
            int width = staticLayout.getWidth() + g0.L(4.0f);
            int height = staticLayout.getHeight() + 2;
            Bitmap.Config config = Bitmap.Config.ARGB_8888;
            this.I2 = Bitmap.createBitmap(width, height, config);
            TextPaint textPaint = this.d;
            textPaint.setAlpha(ns.e4);
            float f10 = this.A2;
            this.P2 = f10 - ((float) Math.floor(f10));
            float f11 = this.B2;
            this.Q2 = f11 - ((float) Math.floor(f11));
            Canvas canvas = new Canvas(this.I2);
            canvas.translate(this.P2, this.Q2);
            y(SystemClock.uptimeMillis());
            staticLayout.draw(canvas);
            textPaint.setShader(null);
            this.T2 = this.R1;
            this.L2 = t(1100, this.I2, true);
            this.M2 = 0;
            try {
                bitmap2 = Bitmap.createBitmap(staticLayout2.getWidth() + g0.L(4.0f), Math.max(1, staticLayout2.getHeight()), config);
                staticLayout2.draw(new Canvas(bitmap2));
                this.M2 = t(1000, bitmap2, false);
            } catch (Throwable unused) {
            }
            bitmap2.recycle();
            RectF rectF = this.j0;
            float width2 = rectF.width();
            float centerY = rectF.centerY() - this.B2;
            float f12 = rectF.left;
            float f13 = this.A2;
            float f14 = centerY * 0.9f;
            this.y2 = ((f12 - (0.35f * width2)) - f13) + f14;
            this.z2 = (((width2 * 1.35f) + f12) - f13) + f14;
            this.w2 = Math.max(800L, Math.min(1200L, (Math.max(staticLayout.getLineCount(), staticLayout2.getLineCount()) * 70) + 700));
            float v = v(this.C2 * 0.9f);
            this.R2 = v;
            this.S2 = Math.max(v + 0.12f, v(((this.C2 + this.D2) * 0.9f) + staticLayout.getWidth()) + 0.06f);
            this.O2 = 0;
            this.N2 = 0;
            nu0 nu0Var = this.r2;
            nu0Var.a();
            nu0Var.e(this.M);
            nu0Var.a = r0.j(this.M);
            nu0Var.Q = g0.L(10.0f);
            this.v2 = SystemClock.uptimeMillis();
            float f15 = this.U1;
            if (f15 > 0.05f) {
                this.x2 = Math.max(this.x2, f15);
            }
            this.t2 = true;
        } catch (Throwable unused2) {
        }
    }

    public final void q(Canvas canvas, long j10, float f10, float f11, float f12, float f13, float f14) {
        float f15;
        nu0 nu0Var;
        float f16 = (j10 - this.v2) / 1000.0f;
        float r10 = r(f16);
        float r11 = r(f16 - 0.06f);
        float L = g0.L(22.0f);
        float f17 = -g0.L(8.0f);
        float L2 = g0.L(8.0f) + this.P0.getWidth();
        float f18 = -g0.L(40.0f);
        float L3 = g0.L(40.0f) + this.P0.getHeight();
        canvas.save();
        canvas.translate(f10, f11);
        int saveLayer = canvas.saveLayer(f17, f18, L2, L3, null);
        int i7 = (int) (255.0f * f12);
        this.d.setAlpha(i7);
        this.P0.draw(canvas);
        s(this.Z2, r11 - g0.L(48.0f), r11);
        LinearGradient linearGradient = this.Z2;
        Paint paint = this.W2;
        paint.setShader(linearGradient);
        canvas.drawRect(f17, f18, L2, L3, paint);
        s(this.Y2, r11 - L, r11);
        LinearGradient linearGradient2 = this.Y2;
        Paint paint2 = this.V2;
        paint2.setShader(linearGradient2);
        canvas.drawRect(f17, f18, L2, L3, paint2);
        canvas.restoreToCount(saveLayer);
        canvas.restore();
        if (this.I2 == null || r10 - L >= this.z2) {
            f15 = 2.0f;
        } else {
            canvas.save();
            canvas.translate(this.A2, this.B2);
            float max = Math.max(L2, this.I2.getWidth());
            f15 = 2.0f;
            int saveLayer2 = canvas.saveLayer(f17, this.C2 - g0.L(2.0f), max, this.C2 + this.D2 + g0.L(2.0f), null);
            Paint paint3 = this.U2;
            paint3.setAlpha(i7);
            canvas.drawBitmap(this.I2, -this.P2, -this.Q2, paint3);
            s(this.X2, r10, L + r10);
            paint2.setShader(this.X2);
            canvas.drawRect(f17, f18, max, Math.max(L3, g0.L(40.0f) + this.I2.getHeight()), paint2);
            canvas.restoreToCount(saveLayer2);
            canvas.restore();
        }
        float f19 = g0.p;
        long j11 = this.w2;
        float max2 = Math.max(0.05f, Math.min(j11, j11 - (j10 - this.v2)) / 1000.0f);
        while (true) {
            int i10 = this.N2;
            int i11 = this.L2;
            nu0Var = this.r2;
            if (i10 >= i11) {
                break;
            }
            float[] fArr = this.J2;
            int i12 = i10 * 3;
            if (fArr[i12 + 2] > r10) {
                break;
            }
            nu0Var.g(this.A2 + fArr[i12], this.B2 + fArr[i12 + 1], ((nu0Var.d() * 34.0f) + 10.0f) * f19, (-((nu0Var.d() * 20.0f) + 6.0f)) * f19, Math.min(max2, (nu0Var.d() * 0.3f) + 0.26f), 0.0f);
            this.N2++;
        }
        float f20 = f13 - f11;
        while (true) {
            int i13 = this.O2;
            if (i13 >= this.M2) {
                break;
            }
            float[] fArr2 = this.K2;
            int i14 = i13 * 3;
            if (fArr2[i14 + 2] > r10) {
                break;
            }
            this.O2 = i13 + 1;
            float f21 = fArr2[i14 + 1];
            if (f21 >= f20 - g0.L(f15) && f21 <= f20 + f14 + g0.L(f15)) {
                float f22 = f10 + this.K2[i14];
                float f23 = f11 + f21;
                nu0Var.h((((nu0Var.d() * 16.0f) + 6.0f) * f19) + f22, ((nu0Var.d() - 0.5f) * 14.0f * f19) + f23, f22, f23, Math.min(max2, (nu0Var.d() * 0.08f) + 0.099999994f));
            }
        }
        if (f16 * 1000.0f >= this.w2) {
            this.t2 = false;
            Bitmap bitmap = this.I2;
            if (bitmap != null) {
                bitmap.recycle();
                this.I2 = null;
            }
        }
    }

    public final float r(float f10) {
        float interpolation = s3.getInterpolation(Math.max(0.0f, Math.min(1.0f, (f10 * 1000.0f) / (this.w2 - 60.0f))));
        float f11 = this.y2;
        return e2.z(this.z2, f11, interpolation, f11);
    }

    public final void s(LinearGradient linearGradient, float f10, float f11) {
        float sqrt = (float) Math.sqrt(1.809999942779541d);
        float f12 = 1.0f / sqrt;
        float f13 = 0.9f / sqrt;
        float f14 = f10 / sqrt;
        float f15 = f11 / sqrt;
        Matrix matrix = this.a3;
        matrix.reset();
        matrix.setScale(Math.max(0.01f, f15 - f14), 1.0f);
        matrix.postRotate((float) Math.toDegrees(Math.atan2(f13, f12)));
        matrix.postTranslate(f12 * f14, f14 * f13);
        linearGradient.setLocalMatrix(matrix);
    }

    public void setBusy(boolean z10) {
        if (this.R1 == z10) {
            return;
        }
        this.R1 = z10;
        if (z10) {
            this.T1 = SystemClock.uptimeMillis();
        }
        invalidate();
    }

    public void setLanguage(CharSequence charSequence) {
        this.l1 = charSequence == null ? null : charSequence.toString();
        invalidate();
    }

    public void setLanguagePillHidden(boolean z10) {
        this.s1 = z10;
        invalidate();
    }

    public void setLevel(float f10) {
        this.U = Math.max(0.0f, Math.min(1.0f, f10));
    }

    public void setListening(boolean z10) {
        this.S = z10;
        invalidate();
    }

    public void setPaused(boolean z10) {
        if (this.T != z10) {
            this.C0 = SystemClock.uptimeMillis();
        }
        this.T = z10;
        invalidate();
    }

    public void setPillHidden(boolean z10) {
        this.k1 = z10;
        invalidate();
    }

    public void setPlaceholder(String str) {
        if (Objects.equals(str, this.m1)) {
            return;
        }
        this.m1 = str;
        this.R0 = null;
        invalidate();
    }

    public void setRebuildNext(boolean z10) {
        this.s2 = z10;
    }

    public void setRevertShown(boolean z10) {
        this.S1 = z10;
        invalidate();
    }

    public final int t(int i7, Bitmap bitmap, boolean z10) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int[] iArr = new int[width * height];
        bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
        int max = Math.max(1, Math.round(g0.p * 0.8f));
        int i10 = 0;
        for (int i11 = 0; i11 < height; i11 += max) {
            if (z10) {
                float f10 = i11;
                float f11 = this.C2;
                float f12 = max;
                if (f10 >= f11 - f12) {
                    if (f10 > f11 + this.D2 + f12) {
                    }
                }
            }
            for (int i12 = 0; i12 < width; i12 += max) {
                if ((iArr[(i11 * width) + i12] >>> 24) > 90) {
                    i10++;
                }
            }
        }
        float f13 = i10 > i7 ? i7 / i10 : 1.0f;
        int min = Math.min(i10, i7 + 32) * 3;
        float[] fArr = z10 ? this.J2 : this.K2;
        if (fArr.length < min) {
            fArr = new float[min];
        }
        int i13 = 0;
        for (int i14 = 0; i14 < height; i14 += max) {
            if (z10) {
                float f14 = i14;
                float f15 = this.C2;
                float f16 = max;
                if (f14 >= f15 - f16) {
                    if (f14 > f15 + this.D2 + f16) {
                    }
                }
            }
            for (int i15 = 0; i15 < width; i15 += max) {
                if ((iArr[(i14 * width) + i15] >>> 24) > 90) {
                    nu0 nu0Var = this.r2;
                    if (nu0Var.d() <= f13) {
                        int i16 = i13 + 1;
                        if (i16 * 3 <= fArr.length) {
                            float f17 = max;
                            float d = ((nu0Var.d() - 0.5f) * f17) + i15;
                            float d2 = ((nu0Var.d() - 0.5f) * f17) + i14;
                            int i17 = i13 * 3;
                            fArr[i17] = d;
                            fArr[i17 + 1] = d2;
                            fArr[i17 + 2] = (d2 * 0.9f) + d;
                            i13 = i16;
                        }
                    }
                }
            }
        }
        Integer[] numArr = new Integer[i13];
        for (int i18 = 0; i18 < i13; i18++) {
            numArr[i18] = Integer.valueOf(i18);
        }
        Arrays.sort(numArr, new ai.k(2, fArr));
        float[] copyOf = Arrays.copyOf(fArr, i13 * 3);
        for (int i19 = 0; i19 < i13; i19++) {
            int i20 = i19 * 3;
            int intValue = numArr[i19].intValue() * 3;
            fArr[i20] = copyOf[intValue];
            fArr[i20 + 1] = copyOf[intValue + 1];
            fArr[i20 + 2] = copyOf[intValue + 2];
        }
        if (z10) {
            this.J2 = fArr;
            return i13;
        }
        this.K2 = fArr;
        return i13;
    }

    public final float u(long j10) {
        return s3.getInterpolation(Math.max(0.0f, Math.min(1.0f, (j10 - this.v2) / this.w2)));
    }

    public final float v(float f10) {
        float f11 = 0.0f;
        if (this.z2 <= this.y2) {
            return 0.0f;
        }
        float f12 = this.w2 / 1000.0f;
        for (int i7 = 0; i7 < 24; i7++) {
            float f13 = (f11 + f12) / 2.0f;
            if (r(f13) < f10) {
                f11 = f13;
            } else {
                f12 = f13;
            }
        }
        return Math.min(f12, this.w2 / 1000.0f);
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.G || super.verifyDrawable(drawable);
    }

    public final void w() {
        if (this.Z0 <= 0) {
            return;
        }
        if (this.O0.isEmpty()) {
            this.P0 = null;
            return;
        }
        SpannableString spannableString = new SpannableString(this.O0);
        ArrayList arrayList = this.a1;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            c cVar = (c) obj;
            int i10 = cVar.b;
            if (i10 > cVar.a && i10 <= spannableString.length()) {
                spannableString.setSpan(new f2(cVar, 1), cVar.a, cVar.b, 33);
            }
        }
        int i11 = 0;
        while (true) {
            int i12 = i11 + 1;
            int[] iArr = this.b1;
            if (i12 >= iArr.length) {
                break;
            }
            int max = Math.max(0, iArr[i11]);
            int min = Math.min(spannableString.length(), this.b1[i12]);
            if (min > max) {
                spannableString.setSpan(new b(0), max, min, 33);
            }
            i11 += 2;
        }
        this.P0 = b(spannableString, this.d);
        ArrayList arrayList2 = this.c1;
        arrayList2.clear();
        int i13 = 0;
        while (true) {
            int i14 = i13 + 1;
            int[] iArr2 = this.b1;
            if (i14 >= iArr2.length) {
                return;
            }
            int max2 = Math.max(0, iArr2[i13]);
            int min2 = Math.min(spannableString.length(), this.b1[i14]);
            if (min2 > max2) {
                int lineForOffset = this.P0.getLineForOffset(max2);
                int lineForOffset2 = this.P0.getLineForOffset(min2);
                int i15 = lineForOffset;
                while (i15 <= lineForOffset2) {
                    StaticLayout staticLayout = this.P0;
                    float primaryHorizontal = i15 == lineForOffset ? staticLayout.getPrimaryHorizontal(max2) : staticLayout.getLineLeft(i15);
                    StaticLayout staticLayout2 = this.P0;
                    float primaryHorizontal2 = i15 == lineForOffset2 ? staticLayout2.getPrimaryHorizontal(min2) : staticLayout2.getLineRight(i15);
                    if ((i15 != lineForOffset2 || min2 <= 0 || min2 != this.P0.getLineStart(i15)) && primaryHorizontal2 - primaryHorizontal >= 1.0f) {
                        float f10 = k3;
                        float lineTop = this.P0.getLineTop(i15);
                        float f11 = l3;
                        arrayList2.add(new RectF(primaryHorizontal - f10, lineTop + f11, primaryHorizontal2 + f10, this.P0.getLineBottom(i15) - f11));
                    }
                    i15++;
                }
            }
            i13 += 2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:384:0x06c8, code lost:
    
        if (r3 != null) goto L310;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void x(ArrayList arrayList, boolean[] zArr, boolean z10) {
        long j10;
        ArrayList arrayList2;
        long j11;
        ArrayList arrayList3;
        float f10;
        float f11;
        nu0 nu0Var;
        Bitmap bitmap;
        Bitmap bitmap2;
        nu0 nu0Var2;
        int i7;
        int i10;
        float f12;
        float f13;
        nu0 nu0Var3;
        int i11;
        float f14;
        int i12;
        nu0 nu0Var4;
        float f15;
        float f16;
        float f17;
        nu0 nu0Var5;
        d dVar;
        Bitmap bitmap3;
        Bitmap bitmap4;
        ArrayList arrayList4;
        StaticLayout staticLayout;
        StringBuilder sb2 = new StringBuilder();
        ArrayList arrayList5 = new ArrayList();
        int i13 = 0;
        int i14 = 0;
        while (i14 < arrayList.size()) {
            boolean z11 = zArr != null && i14 < zArr.length && zArr[i14];
            if (!z11 || z10) {
                if (sb2.length() > 0) {
                    sb2.append(' ');
                }
                int length = sb2.length();
                sb2.append((String) arrayList.get(i14));
                if (z11) {
                    if (arrayList5.isEmpty() || ((Integer) i5.c.h(1, arrayList5)).intValue() < length - 1) {
                        arrayList5.add(Integer.valueOf(length));
                        arrayList5.add(Integer.valueOf(sb2.length()));
                    } else {
                        arrayList5.set(arrayList5.size() - 1, Integer.valueOf(sb2.length()));
                    }
                }
            }
            i14++;
        }
        int size = arrayList5.size();
        int[] iArr = new int[size];
        for (int i15 = 0; i15 < size; i15++) {
            iArr[i15] = ((Integer) arrayList5.get(i15)).intValue();
        }
        String sb3 = sb2.toString();
        boolean equals = Arrays.equals(iArr, this.b1);
        int i16 = 0;
        int i17 = 0;
        while (true) {
            int i18 = i16 + 1;
            if (i18 >= size) {
                break;
            }
            i17 += Math.max(0, iArr[i18] - iArr[i16]);
            i16 += 2;
        }
        int[] iArr2 = this.b1;
        int i19 = 0;
        int i20 = 0;
        while (true) {
            int i21 = i19 + 1;
            if (i21 >= iArr2.length) {
                break;
            }
            i20 += Math.max(0, iArr2[i21] - iArr2[i19]);
            i19 += 2;
        }
        if (i17 > i20 && sb3.length() <= this.O0.length()) {
            this.f1 = true;
        } else if (sb3.length() > this.O0.length()) {
            this.f1 = false;
        }
        if (sb3.equals(this.O0) && equals) {
            if (!this.s2 || (staticLayout = this.P0) == null) {
                return;
            }
            this.s2 = false;
            p(staticLayout, staticLayout);
            invalidate();
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        String str = this.O0;
        this.b1 = iArr;
        boolean z12 = this.s2;
        ArrayList arrayList6 = this.a1;
        if (z12 && !str.isEmpty() && !sb3.equals(str) && this.P0 != null) {
            this.s2 = false;
            arrayList6.clear();
            this.Q0 = null;
            this.b1 = iArr;
            this.O0 = sb3;
            StaticLayout staticLayout2 = this.P0;
            w();
            p(staticLayout2, this.P0);
            invalidate();
            return;
        }
        if (!sb3.equals(str)) {
            if (sb3.startsWith(str) || str.isEmpty()) {
                int min = Math.min(str.length(), sb3.length());
                int i22 = 0;
                while (i22 < min && str.charAt(i22) == sb3.charAt(i22)) {
                    i22++;
                }
                for (int size2 = arrayList6.size() - 1; size2 >= 0; size2--) {
                    c cVar = (c) arrayList6.get(size2);
                    if (cVar.a >= i22 || uptimeMillis - cVar.c > 1550) {
                        arrayList6.remove(size2);
                    } else if (cVar.b > i22) {
                        cVar.b = i22;
                    }
                }
                while (i22 > 0 && !Character.isWhitespace(sb3.charAt(Math.min(i22, sb3.length()) - 1))) {
                    i22--;
                }
                int i23 = 0;
                while (i22 < sb3.length()) {
                    int i24 = i22;
                    while (i24 < sb3.length() && Character.isWhitespace(sb3.charAt(i24))) {
                        i24++;
                    }
                    while (i24 < sb3.length() && !Character.isWhitespace(sb3.charAt(i24))) {
                        i24++;
                    }
                    c cVar2 = new c();
                    cVar2.a = i22;
                    cVar2.b = i24;
                    cVar2.d = i22 < str.length() ? 1.0f : 0.0f;
                    cVar2.c = (Math.min(i23, 5) * 40) + uptimeMillis;
                    arrayList6.add(cVar2);
                    i23++;
                    i22 = i24;
                }
            } else {
                if (this.S || !this.T || this.P0 == null || sb3.isEmpty()) {
                    j10 = uptimeMillis;
                    arrayList2 = arrayList6;
                    j11 = 1550;
                } else {
                    StaticLayout staticLayout3 = this.P0;
                    j11 = 1550;
                    boolean z13 = this.a2;
                    ArrayList arrayList7 = this.l2;
                    if (z13) {
                        arrayList3 = new ArrayList();
                        int size3 = arrayList7.size();
                        int i25 = 0;
                        while (i25 < size3) {
                            Object obj = arrayList7.get(i25);
                            i25++;
                            int i26 = i13;
                            d dVar2 = (d) obj;
                            if (!this.b2 || !dVar2.b) {
                                float f18 = dVar2.n;
                                float f19 = dVar2.o;
                                float[] fArr = new float[2];
                                fArr[i26] = f18;
                                fArr[1] = f19;
                                arrayList3.add(fArr);
                            }
                            i13 = i26;
                        }
                    } else {
                        arrayList3 = null;
                    }
                    int i27 = i13;
                    arrayList7.clear();
                    ArrayList D = D(str);
                    ArrayList D2 = D(sb3);
                    if (D.size() == D2.size() || D.size() > 400 || D2.size() > 400) {
                        j10 = uptimeMillis;
                        arrayList2 = arrayList6;
                    } else {
                        boolean z14 = D2.size() < D.size() ? 1 : i27;
                        ArrayList arrayList8 = z14 != 0 ? D : D2;
                        if (z14 == 0) {
                            D2 = D;
                        }
                        String str2 = z14 != 0 ? str : sb3;
                        String str3 = z14 != 0 ? sb3 : str;
                        j10 = uptimeMillis;
                        boolean[] zArr2 = new boolean[arrayList8.size()];
                        arrayList2 = arrayList6;
                        int i28 = i27;
                        int i29 = i28;
                        while (i29 < arrayList8.size()) {
                            int[] iArr3 = (int[]) arrayList8.get(i29);
                            int i30 = i29;
                            if (i28 < D2.size()) {
                                int[] iArr4 = (int[]) D2.get(i28);
                                arrayList4 = D2;
                                int i31 = iArr3[i27];
                                int i32 = iArr4[i27];
                                if (str2.regionMatches(i31, str3, i32, iArr4[1] - i32) && iArr3[1] - iArr3[i27] == iArr4[1] - iArr4[i27]) {
                                    i28++;
                                    i29 = i30 + 1;
                                    D2 = arrayList4;
                                }
                            } else {
                                arrayList4 = D2;
                            }
                            zArr2[i30] = true;
                            i29 = i30 + 1;
                            D2 = arrayList4;
                        }
                        if (i28 == D2.size()) {
                            this.b2 = z14;
                            for (int i33 = i27; i33 < arrayList8.size(); i33++) {
                                int[] iArr5 = (int[]) arrayList8.get(i33);
                                d dVar3 = new d();
                                dVar3.n = Float.NaN;
                                dVar3.o = Float.NaN;
                                dVar3.a = str2.substring(iArr5[i27], iArr5[1]);
                                boolean z15 = zArr2[i33];
                                dVar3.b = z15;
                                dVar3.c = (z14 == 0 && z15) ? 1 : i27;
                                if (z14 != 0) {
                                    int lineForOffset = staticLayout3.getLineForOffset(iArr5[i27]);
                                    dVar3.d = staticLayout3.getPrimaryHorizontal(iArr5[i27]);
                                    dVar3.e = staticLayout3.getLineBaseline(lineForOffset);
                                    dVar3.f = staticLayout3.getLineTop(lineForOffset);
                                    dVar3.g = staticLayout3.getLineBottom(lineForOffset);
                                    j(dVar3, arrayList3, i33);
                                }
                                arrayList7.add(dVar3);
                            }
                            TextPaint textPaint = this.d;
                            nu0 nu0Var6 = this.r2;
                            if (z14 == 0) {
                                int size4 = arrayList7.size();
                                int i34 = i27;
                                int i35 = i34;
                                f10 = 0.8f;
                                while (i34 < size4) {
                                    Object obj2 = arrayList7.get(i34);
                                    i34++;
                                    d dVar4 = (d) obj2;
                                    if (!dVar4.c) {
                                        int[] iArr6 = (int[]) D.get(i35);
                                        int lineForOffset2 = staticLayout3.getLineForOffset(iArr6[i27]);
                                        dVar4.d = staticLayout3.getPrimaryHorizontal(iArr6[i27]);
                                        dVar4.e = staticLayout3.getLineBaseline(lineForOffset2);
                                        j(dVar4, arrayList3, i35);
                                        i35++;
                                    }
                                }
                                f11 = 4.0f;
                                this.h2 = this.E2;
                                this.i2 = this.F2;
                                this.c2 = SystemClock.uptimeMillis();
                                this.a2 = true;
                                nu0Var = nu0Var6;
                            } else {
                                f10 = 0.8f;
                                f11 = 4.0f;
                                this.h2 = this.E2;
                                this.i2 = this.F2;
                                this.j2 = this.G2;
                                this.k2 = Math.max(1.0f, this.H2);
                                SpannableString spannableString = new SpannableString(str);
                                o(true, 0.0f);
                                for (int i36 = i27; i36 < arrayList7.size(); i36++) {
                                    d dVar5 = (d) arrayList7.get(i36);
                                    float measureText = textPaint.measureText(dVar5.a);
                                    dVar5.k = measureText;
                                    dVar5.l = dVar5.d + measureText;
                                    if (dVar5.b) {
                                        int i37 = i36 + 1;
                                        d dVar6 = i37 < arrayList7.size() ? (d) arrayList7.get(i37) : null;
                                        if (dVar6 != null && dVar6.b && Math.abs(dVar6.f - dVar5.f) < 1.0f) {
                                            dVar5.l = dVar6.d;
                                        }
                                    }
                                }
                                nu0Var6.a();
                                nu0Var6.e(this.M);
                                nu0Var6.a = r0.j(this.M);
                                float f20 = 10.0f;
                                nu0Var6.Q = g0.L(10.0f);
                                int size5 = arrayList7.size();
                                int i38 = i27;
                                int i39 = i38;
                                while (i39 < size5) {
                                    Object obj3 = arrayList7.get(i39);
                                    i39++;
                                    d dVar7 = (d) obj3;
                                    int indexOf = str.indexOf(dVar7.a, i38);
                                    int length2 = dVar7.a.length() + indexOf;
                                    if (!dVar7.b) {
                                        spannableString.setSpan(new ForegroundColorSpan(i27), indexOf, length2, 33);
                                    }
                                    i38 = length2;
                                    i27 = 0;
                                }
                                textPaint.setAlpha(ns.e4);
                                StaticLayout b10 = b(spannableString, textPaint);
                                try {
                                    Bitmap createBitmap = Bitmap.createBitmap(b10.getWidth() + g0.L(4.0f), Math.max(1, b10.getHeight()), Bitmap.Config.ARGB_8888);
                                    try {
                                        b10.draw(new Canvas(createBitmap));
                                        int width = createBitmap.getWidth();
                                        int height = createBitmap.getHeight();
                                        int[] iArr7 = new int[width * height];
                                        try {
                                            createBitmap.getPixels(iArr7, 0, width, 0, 0, width, height);
                                            int i40 = width;
                                            int max = Math.max(1, Math.round(g0.p * 0.8f));
                                            int i41 = 0;
                                            for (int i42 = 0; i42 < height; i42 += max) {
                                                int i43 = 0;
                                                while (i43 < i40) {
                                                    float f21 = f20;
                                                    if ((iArr7[(i42 * i40) + i43] >>> 24) > 90) {
                                                        i41++;
                                                    }
                                                    i43 += max;
                                                    f20 = f21;
                                                }
                                            }
                                            float f22 = f20;
                                            float f23 = i41 > 1400 ? 1400.0f / i41 : 1.0f;
                                            float f24 = g0.p;
                                            int i44 = 0;
                                            while (i44 < height) {
                                                float f25 = i44;
                                                float f26 = this.j2;
                                                bitmap2 = createBitmap;
                                                float f27 = max;
                                                if (f25 >= f26 - f27) {
                                                    f14 = f23;
                                                    try {
                                                        if (f25 <= f26 + this.k2 + f27) {
                                                            int i45 = 0;
                                                            while (i45 < i40) {
                                                                int i46 = i40;
                                                                if ((iArr7[(i44 * i40) + i45] >>> 24) <= 90 || nu0Var6.d() > f14) {
                                                                    i12 = i45;
                                                                    nu0Var4 = nu0Var6;
                                                                } else {
                                                                    float f28 = i45;
                                                                    try {
                                                                        int size6 = arrayList7.size();
                                                                        i12 = i45;
                                                                        int i47 = 0;
                                                                        d dVar8 = null;
                                                                        while (i47 < size6) {
                                                                            try {
                                                                                Object obj4 = arrayList7.get(i47);
                                                                                int i48 = i47 + 1;
                                                                                d dVar9 = (d) obj4;
                                                                                nu0Var5 = nu0Var6;
                                                                                try {
                                                                                    if (dVar9.b && f25 >= dVar9.f && f25 <= dVar9.g && f28 >= dVar9.d - g0.L(2.0f)) {
                                                                                        if (dVar8 != null) {
                                                                                            dVar = dVar9;
                                                                                            if (dVar9.d <= dVar8.d) {
                                                                                            }
                                                                                        } else {
                                                                                            dVar = dVar9;
                                                                                        }
                                                                                        dVar8 = dVar;
                                                                                    }
                                                                                    nu0Var6 = nu0Var5;
                                                                                    i47 = i48;
                                                                                } catch (Throwable unused) {
                                                                                    nu0Var2 = nu0Var5;
                                                                                    nu0Var = nu0Var2;
                                                                                    bitmap = bitmap2;
                                                                                }
                                                                            } catch (Throwable unused2) {
                                                                                nu0Var5 = nu0Var6;
                                                                            }
                                                                        }
                                                                        nu0 nu0Var7 = nu0Var6;
                                                                        if (dVar8 != null) {
                                                                            try {
                                                                                f15 = dVar8.j;
                                                                            } catch (Throwable unused3) {
                                                                                nu0Var = nu0Var7;
                                                                                bitmap = bitmap2;
                                                                            }
                                                                        } else {
                                                                            f15 = 0.0f;
                                                                        }
                                                                        if (dVar8 != null) {
                                                                            float f29 = dVar8.d;
                                                                            f16 = f15;
                                                                            f17 = Math.max(0.0f, Math.min(1.0f, (f28 - f29) / Math.max(1.0f, dVar8.l - f29)));
                                                                        } else {
                                                                            f16 = f15;
                                                                            f17 = 0.0f;
                                                                        }
                                                                        if (dVar8 != null && dVar8.m) {
                                                                            f17 = 1.0f - f17;
                                                                        }
                                                                        nu0Var4 = nu0Var7;
                                                                        nu0Var4.g(e2.z(nu0Var7.d(), 0.5f, f27, this.h2 + f28), e2.z(nu0Var7.d(), 0.5f, f27, this.i2 + f25), e2.B(nu0Var7.d(), 30.0f, 8.0f, f24), (-((nu0Var7.d() * 26.0f) + f22)) * f24, (nu0Var7.d() * 0.34f) + 0.32f, (f17 * 0.12f) + f16);
                                                                    } catch (Throwable unused4) {
                                                                        nu0Var2 = nu0Var6;
                                                                    }
                                                                }
                                                                i45 = i12 + max;
                                                                nu0Var6 = nu0Var4;
                                                                i40 = i46;
                                                            }
                                                        }
                                                        i11 = i40;
                                                    } catch (Throwable unused5) {
                                                        nu0Var = nu0Var6;
                                                        bitmap = bitmap2;
                                                    }
                                                } else {
                                                    i11 = i40;
                                                    f14 = f23;
                                                }
                                                nu0Var2 = nu0Var6;
                                                try {
                                                    i44 += max;
                                                    nu0Var6 = nu0Var2;
                                                    createBitmap = bitmap2;
                                                    f23 = f14;
                                                    i40 = i11;
                                                } catch (Throwable unused6) {
                                                    nu0Var = nu0Var2;
                                                    bitmap = bitmap2;
                                                }
                                            }
                                            bitmap2 = createBitmap;
                                            nu0Var2 = nu0Var6;
                                            float L = g0.L(3.0f);
                                            int size7 = arrayList7.size();
                                            int i49 = 0;
                                            while (i49 < size7) {
                                                Object obj5 = arrayList7.get(i49);
                                                i49++;
                                                d dVar10 = (d) obj5;
                                                if (dVar10.b) {
                                                    float f30 = dVar10.f;
                                                    float f31 = l3;
                                                    float f32 = f30 + f31;
                                                    float f33 = dVar10.g - f31;
                                                    float f34 = this.j2;
                                                    if (f33 >= f34) {
                                                        if (f32 <= f34 + this.k2) {
                                                            float f35 = dVar10.d;
                                                            boolean m10 = m(dVar10);
                                                            float f36 = k3;
                                                            float f37 = f35 - (m10 ? f36 : 0.0f);
                                                            float f38 = dVar10.l;
                                                            if (!l(dVar10)) {
                                                                f36 = 0.0f;
                                                            }
                                                            float f39 = f38 + f36;
                                                            float f40 = L / 2.0f;
                                                            float f41 = f32 + f40;
                                                            while (f41 < f33) {
                                                                float f42 = f37 + f40;
                                                                while (f42 < f39) {
                                                                    if (nu0Var2.d() > 0.5f) {
                                                                        f13 = L;
                                                                        i7 = size7;
                                                                        i10 = i49;
                                                                        f12 = f41;
                                                                        nu0Var3 = nu0Var2;
                                                                    } else {
                                                                        i7 = size7;
                                                                        float f43 = dVar10.d;
                                                                        i10 = i49;
                                                                        float max2 = Math.max(0.0f, Math.min(1.0f, (f42 - f43) / Math.max(1.0f, dVar10.l - f43)));
                                                                        if (dVar10.m) {
                                                                            max2 = 1.0f - max2;
                                                                        }
                                                                        f12 = f41;
                                                                        f13 = L;
                                                                        nu0Var2.g(e2.z(nu0Var2.d(), 0.5f, L, this.h2 + f42), e2.z(nu0Var2.d(), 0.5f, L, this.i2 + f12), e2.B(nu0Var2.d(), 22.0f, 6.0f, f24), (-((nu0Var2.d() * 20.0f) + 8.0f)) * f24, (nu0Var2.d() * 0.3f) + 0.26f, (max2 * 0.12f) + dVar10.j);
                                                                        nu0Var3 = nu0Var2;
                                                                    }
                                                                    f42 += f13;
                                                                    nu0Var2 = nu0Var3;
                                                                    size7 = i7;
                                                                    i49 = i10;
                                                                    f41 = f12;
                                                                    L = f13;
                                                                }
                                                                float f44 = L;
                                                                f41 += f44;
                                                                L = f44;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            nu0Var = nu0Var2;
                                            bitmap = bitmap2;
                                        } catch (Throwable unused7) {
                                            nu0Var = nu0Var6;
                                            bitmap2 = createBitmap;
                                        }
                                    } catch (Throwable unused8) {
                                        bitmap2 = createBitmap;
                                    }
                                } catch (Throwable unused9) {
                                    nu0Var = nu0Var6;
                                    bitmap = null;
                                }
                                bitmap.recycle();
                                this.c2 = SystemClock.uptimeMillis();
                                this.a2 = true;
                            }
                            arrayList2.clear();
                            d dVar11 = null;
                            this.Q0 = null;
                            this.b1 = iArr;
                            this.O0 = sb3;
                            w();
                            if (this.P0 == null) {
                                this.a2 = false;
                            } else {
                                String str4 = this.O0;
                                int size8 = arrayList7.size();
                                int i50 = 0;
                                int i51 = 0;
                                while (true) {
                                    if (i51 < size8) {
                                        Object obj6 = arrayList7.get(i51);
                                        i51++;
                                        d dVar12 = (d) obj6;
                                        if (!dVar12.b || !this.b2) {
                                            int indexOf2 = str4.indexOf(dVar12.a, i50);
                                            if (indexOf2 < 0) {
                                                this.a2 = false;
                                                break;
                                            }
                                            int length3 = dVar12.a.length() + indexOf2;
                                            int lineForOffset3 = this.P0.getLineForOffset(indexOf2);
                                            dVar12.h = this.P0.getPrimaryHorizontal(indexOf2);
                                            dVar12.i = this.P0.getLineBaseline(lineForOffset3);
                                            dVar12.p = indexOf2;
                                            dVar12.k = textPaint.measureText(dVar12.a);
                                            dVar12.q = false;
                                            int i52 = 0;
                                            while (true) {
                                                int i53 = i52 + 1;
                                                int[] iArr8 = this.b1;
                                                if (i53 >= iArr8.length) {
                                                    break;
                                                }
                                                if (indexOf2 >= iArr8[i52] && indexOf2 < iArr8[i53]) {
                                                    dVar12.q = true;
                                                }
                                                i52 += 2;
                                            }
                                            i50 = length3;
                                        }
                                    } else {
                                        this.d2 = 0.48000002f;
                                        this.g2 = 0;
                                        this.f2 = 0;
                                        if (!this.b2) {
                                            int size9 = arrayList7.size();
                                            int i54 = 0;
                                            while (i54 < size9) {
                                                Object obj7 = arrayList7.get(i54);
                                                i54++;
                                                boolean z16 = ((d) obj7).c;
                                            }
                                            SpannableString spannableString2 = new SpannableString(str4);
                                            o(false, 0.14f);
                                            int size10 = arrayList7.size();
                                            int i55 = 0;
                                            while (i55 < size10) {
                                                Object obj8 = arrayList7.get(i55);
                                                i55++;
                                                d dVar13 = (d) obj8;
                                                if (dVar13.c) {
                                                    this.d2 = Math.max(this.d2, dVar13.j + 0.26f + 0.12f + 0.45f);
                                                } else {
                                                    ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(0);
                                                    int i56 = dVar13.p;
                                                    spannableString2.setSpan(foregroundColorSpan, i56, dVar13.a.length() + i56, 33);
                                                }
                                            }
                                            int i57 = 0;
                                            nu0Var.a();
                                            nu0Var.e(this.M);
                                            nu0Var.a = r0.j(this.M);
                                            nu0Var.Q = 0.0f;
                                            textPaint.setAlpha(ns.e4);
                                            StaticLayout b11 = b(spannableString2, textPaint);
                                            try {
                                                Bitmap createBitmap2 = Bitmap.createBitmap(b11.getWidth() + g0.L(f11), Math.max(1, b11.getHeight()), Bitmap.Config.ARGB_8888);
                                                try {
                                                    b11.draw(new Canvas(createBitmap2));
                                                    int width2 = createBitmap2.getWidth();
                                                    int height2 = createBitmap2.getHeight();
                                                    int[] iArr9 = new int[width2 * height2];
                                                    bitmap4 = createBitmap2;
                                                    try {
                                                        bitmap4.getPixels(iArr9, 0, width2, 0, 0, width2, height2);
                                                        int max3 = Math.max(1, Math.round(g0.p * f10));
                                                        int i58 = 0;
                                                        for (int i59 = 0; i59 < height2; i59 += max3) {
                                                            for (int i60 = 0; i60 < width2; i60 += max3) {
                                                                if ((iArr9[(i59 * width2) + i60] >>> 24) > 90) {
                                                                    i58++;
                                                                }
                                                            }
                                                        }
                                                        float f45 = i58 > 1300 ? 1300.0f / i58 : 1.0f;
                                                        int i61 = 3;
                                                        if (this.e2.length < Math.min(i58, 1340) * 3) {
                                                            this.e2 = new float[Math.min(i58, 1340) * 3];
                                                        }
                                                        int i62 = 0;
                                                        while (i62 < height2) {
                                                            int i63 = i57;
                                                            while (i63 < width2) {
                                                                if ((iArr9[(i62 * width2) + i63] >>> 24) > 90 && nu0Var.d() <= f45 && (this.f2 + 1) * i61 <= this.e2.length) {
                                                                    int size11 = arrayList7.size();
                                                                    d dVar14 = dVar11;
                                                                    int i64 = i57;
                                                                    while (i64 < size11) {
                                                                        Object obj9 = arrayList7.get(i64);
                                                                        i64++;
                                                                        d dVar15 = (d) obj9;
                                                                        if (dVar15.c) {
                                                                            StaticLayout staticLayout4 = this.P0;
                                                                            if (i62 >= staticLayout4.getLineTop(staticLayout4.getLineForOffset(dVar15.p))) {
                                                                                StaticLayout staticLayout5 = this.P0;
                                                                                if (i62 <= staticLayout5.getLineBottom(staticLayout5.getLineForOffset(dVar15.p)) && i63 >= dVar15.h - g0.L(2.0f) && (dVar14 == null || dVar15.h > dVar14.h)) {
                                                                                    dVar14 = dVar15;
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    if (dVar14 != null) {
                                                                        float f46 = i63;
                                                                        float max4 = Math.max(0.0f, Math.min(1.0f, (f46 - dVar14.h) / Math.max(1.0f, dVar14.k)));
                                                                        if (dVar14.m) {
                                                                            max4 = 1.0f - max4;
                                                                        }
                                                                        float[] fArr2 = this.e2;
                                                                        int i65 = this.f2;
                                                                        int i66 = i65 * 3;
                                                                        fArr2[i66] = f46;
                                                                        fArr2[i66 + 1] = i62;
                                                                        fArr2[i66 + 2] = (max4 * 0.12f) + dVar14.j;
                                                                        this.f2 = i65 + 1;
                                                                        i63 += max3;
                                                                        dVar11 = null;
                                                                        i57 = 0;
                                                                        i61 = 3;
                                                                    }
                                                                }
                                                                i63 += max3;
                                                                dVar11 = null;
                                                                i57 = 0;
                                                                i61 = 3;
                                                            }
                                                            i62 += max3;
                                                            dVar11 = null;
                                                            i57 = 0;
                                                            i61 = 3;
                                                        }
                                                        float[] fArr3 = this.e2;
                                                        Integer[] numArr = new Integer[this.f2];
                                                        for (int i67 = 0; i67 < this.f2; i67++) {
                                                            numArr[i67] = Integer.valueOf(i67);
                                                        }
                                                        Arrays.sort(numArr, new ai.k(3, fArr3));
                                                        float[] copyOf = Arrays.copyOf(fArr3, this.f2 * 3);
                                                        for (int i68 = 0; i68 < this.f2; i68++) {
                                                            int i69 = i68 * 3;
                                                            int intValue = numArr[i68].intValue() * 3;
                                                            fArr3[i69] = copyOf[intValue];
                                                            fArr3[i69 + 1] = copyOf[intValue + 1];
                                                            fArr3[i69 + 2] = copyOf[intValue + 2];
                                                        }
                                                        bitmap4.recycle();
                                                    } catch (Throwable unused10) {
                                                        bitmap3 = bitmap4;
                                                        if (bitmap3 != null) {
                                                            bitmap3.recycle();
                                                        }
                                                        invalidate();
                                                        return;
                                                    }
                                                } catch (Throwable unused11) {
                                                    bitmap4 = createBitmap2;
                                                }
                                            } catch (Throwable unused12) {
                                                bitmap3 = null;
                                            }
                                        }
                                    }
                                }
                            }
                            invalidate();
                            return;
                        }
                    }
                }
                int min2 = Math.min(str.length(), sb3.length());
                int i70 = 0;
                while (i70 < min2 && str.charAt(i70) == sb3.charAt(i70)) {
                    i70++;
                }
                while (i70 > 0 && !Character.isWhitespace(sb3.charAt(i70 - 1))) {
                    i70--;
                }
                if (i70 > 0) {
                    int min3 = Math.min(str.length(), sb3.length());
                    int i71 = 0;
                    while (i71 < min3 && str.charAt(i71) == sb3.charAt(i71)) {
                        i71++;
                    }
                    int size12 = arrayList2.size() - 1;
                    while (size12 >= 0) {
                        ArrayList arrayList9 = arrayList2;
                        c cVar3 = (c) arrayList9.get(size12);
                        if (cVar3.a >= i71 || j10 - cVar3.c > j11) {
                            arrayList9.remove(size12);
                        } else if (cVar3.b > i71) {
                            cVar3.b = i71;
                        }
                        size12--;
                        arrayList2 = arrayList9;
                    }
                    ArrayList arrayList10 = arrayList2;
                    while (i71 > 0 && !Character.isWhitespace(sb3.charAt(Math.min(i71, sb3.length()) - 1))) {
                        i71--;
                    }
                    int i72 = 0;
                    while (i71 < sb3.length()) {
                        int i73 = i71;
                        while (i73 < sb3.length() && Character.isWhitespace(sb3.charAt(i73))) {
                            i73++;
                        }
                        while (i73 < sb3.length() && !Character.isWhitespace(sb3.charAt(i73))) {
                            i73++;
                        }
                        c cVar4 = new c();
                        cVar4.a = i71;
                        cVar4.b = i73;
                        cVar4.d = i71 < str.length() ? 0.35f : 0.0f;
                        cVar4.c = (Math.min(i72, 5) * 40) + j10;
                        arrayList10.add(cVar4);
                        i72++;
                        i71 = i73;
                    }
                } else {
                    arrayList2.clear();
                    this.Q0 = this.P0;
                    this.Y0 = j10;
                }
            }
        }
        this.O0 = sb3;
        w();
        invalidate();
    }

    public final void y(long j10) {
        if (this.R1) {
            if (this.b3 == null) {
                int e10 = r0.e(this.M ? -10777345 : -15374904);
                int e11 = r0.e(this.M ? -6128385 : -15823740);
                float f10 = this.M ? 0.6f : 0.75f;
                int f11 = i0.a.f(f10, this.N, e10);
                int f12 = i0.a.f(f10, this.N, e11);
                this.b3 = new LinearGradient(0.0f, 0.0f, g0.L(150.0f), 0.0f, new int[]{this.N, f11, i0.a.f(0.5f, f11, f12), f12, this.N}, new float[]{0.0f, 0.3f, 0.5f, 0.7f, 1.0f}, Shader.TileMode.MIRROR);
            }
            float sin = (((float) Math.sin((0.23f * r11) + 1.3f)) * 12.0f) + (((float) Math.sin(0.45f * r11)) * 28.0f);
            Matrix matrix = this.c3;
            matrix.reset();
            matrix.setRotate(sin);
            matrix.postTranslate(g0.L(46.0f) * ((j10 - this.T1) / 1000.0f), g0.L(10.0f) * ((float) Math.sin(r11 * 0.7f)));
            this.b3.setLocalMatrix(matrix);
            this.d.setShader(this.b3);
        }
    }

    public final void z() {
        if (this.I == null) {
            xi.e eVar = this.a;
            this.I = eVar.k(this);
            this.J = eVar.k(this);
        }
        if (!this.R) {
            this.R = true;
            this.h0 = SystemClock.uptimeMillis();
            this.n0 = false;
            this.c.f();
            this.t2 = false;
            Bitmap bitmap = this.I2;
            if (bitmap != null) {
                bitmap.recycle();
                this.I2 = null;
            }
            this.a2 = false;
            this.r2.a();
            this.S1 = false;
            this.V1 = 0.0f;
            this.l1 = null;
            this.m1 = null;
            this.R0 = null;
            this.n1 = 0.0f;
            this.R1 = false;
            this.U1 = 0.0f;
            this.G1 = 0.0f;
            this.s2 = false;
            this.e3 = false;
            this.f3 = false;
        }
        setVisibility(0);
        invalidate();
    }
}
