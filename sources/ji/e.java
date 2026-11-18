package ji;

import ai.g2;
import ai.l1;
import ai.n0;
import ai.s0;
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
import bi.h2;
import com.google.android.gms.internal.vision.e2;
import di.j8;
import hi.r1;
import hi.t6;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.g0;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.w2;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.au0;
import org.telegram.ui.Components.gf;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.pf;
import org.telegram.ui.Components.vu0;
import org.telegram.ui.Dictation.DictationAsr;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final class e extends View {
    public static int s3;
    public static long w3;
    public static int x3;
    public static int y3;
    public static float z3;
    public long A0;
    public final RectF A1;
    public boolean A2;
    public float B0;
    public Drawable B1;
    public boolean B2;
    public long C0;
    public Drawable C1;
    public boolean C2;
    public float D0;
    public Drawable D1;
    public long D2;
    public final Matrix E;
    public float E0;
    public final int E1;
    public long E2;
    public LinearGradient F;
    public long F0;
    public LinearGradient F1;
    public float F2;
    public final w2 G;
    public float G0;
    public LinearGradient G1;
    public float G2;
    public final Drawable H;
    public float H0;
    public final Matrix H1;
    public float H2;
    public fh.g I;
    public float I0;
    public final TextPaint I1;
    public float I2;
    public fh.g J;
    public float J0;
    public final Matrix J1;
    public float J2;
    public float K;
    public boolean K0;
    public final TextPaint K1;
    public float K2;
    public float L;
    public final int L0;
    public fh.g L1;
    public float L2;
    public boolean M;
    public LinearGradient M0;
    public fh.g M1;
    public float M2;
    public int N;
    public final Matrix N0;
    public fh.g N1;
    public float N2;
    public int O;
    public String O0;
    public float O1;
    public float O2;
    public int P;
    public StaticLayout P0;
    public long P1;
    public float P2;
    public int Q;
    public StaticLayout Q0;
    public LinearGradient Q1;
    public Bitmap Q2;
    public boolean R;
    public StaticLayout R0;
    public RadialGradient R1;
    public float[] R2;
    public boolean S;
    public StaticLayout S0;
    public LinearGradient S1;
    public float[] S2;
    public boolean T;
    public float T0;
    public final Paint T1;
    public int T2;
    public float U;
    public LinearGradient U0;
    public final Paint U1;
    public int U2;
    public float V;
    public float V0;
    public final Paint V1;
    public int V2;
    public float W;
    public final Matrix W0;
    public final Paint W1;
    public int W2;
    public final Paint X0;
    public final Matrix X1;
    public float X2;
    public long Y0;
    public final RectF Y1;
    public float Y2;
    public int Z0;
    public boolean Z1;
    public float Z2;
    public final xi.e a;
    public float a0;
    public final ArrayList a1;
    public boolean a2;
    public float a3;
    public final i6 b;
    public float b0;
    public int[] b1;
    public long b2;
    public boolean b3;
    public final s0 c;
    public float c0;
    public final ArrayList c1;
    public float c2;
    public final Paint c3;
    public final TextPaint d;
    public float d0;
    public final Paint d1;
    public float d2;
    public final Paint d3;
    public final TextPaint e;
    public float e0;
    public float e1;
    public float e2;
    public final Paint e3;
    public final TextPaint f;
    public int f0;
    public boolean f1;
    public final RectF f2;
    public LinearGradient f3;
    public long g0;
    public final Path g1;
    public Drawable g2;
    public LinearGradient g3;
    public int h;
    public long h0;
    public final Paint h1;
    public fh.g h2;
    public LinearGradient h3;
    public final RectF i0;
    public final Paint i1;
    public boolean i2;
    public final Matrix i3;
    public final RectF j0;
    public float j1;
    public boolean j2;
    public LinearGradient j3;
    public final RectF k0;
    public boolean k1;
    public long k2;
    public final Matrix k3;
    public final RectF l0;
    public float l1;
    public float l2;
    public float l3;
    public final RectF m0;
    public float m1;
    public float[] m2;
    public final a m3;
    public final TextPaint n;
    public boolean n0;
    public final String n1;
    public int n2;
    public boolean n3;
    public float o0;
    public String o1;
    public int o2;
    public boolean o3;
    public float p0;
    public String p1;
    public float p2;
    public final int[] p3;
    public float q0;
    public float q1;
    public float q2;
    public final Paint r;
    public float r0;
    public float r1;
    public float r2;
    public final Paint s;
    public float s0;
    public float s1;
    public float s2;
    public float t0;
    public float t1;
    public final ArrayList t2;
    public float u0;
    public float u1;
    public final Paint u2;
    public float v0;
    public float v1;
    public final RectF v2;
    public final Paint w;
    public float w0;
    public float w1;
    public final lr w2;
    public final Paint x;
    public float x0;
    public boolean x1;
    public final float[] x2;
    public final Paint y;
    public float y0;
    public final RectF y1;
    public final Path y2;
    public float z0;
    public final RectF z1;
    public final vu0 z2;
    public static final float q3 = g0.L(19.0f);
    public static final float r3 = g0.L(3.0f);
    public static final float t3 = g0.L(3.0f);
    public static final float u3 = g0.N(0.5f);
    public static final float v3 = g0.L(6.0f);
    public static final lr A3 = new lr(0.3d, 0.0d, 0.2d, 1.0d);
    public static final lr B3 = l1.J;

    public e(Context context, i6 i6Var, xi.e eVar) {
        super(context);
        this.c = new s0();
        this.d = new TextPaint(1);
        this.e = new TextPaint(1);
        this.f = new TextPaint(1);
        this.h = ks.e4;
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
        this.Q = ks.e4;
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
        this.l1 = Float.NaN;
        this.n1 = gd.M0(2131745071, null);
        this.y1 = new RectF();
        this.z1 = new RectF();
        this.A1 = new RectF();
        this.E1 = g0.L(36.0f);
        this.H1 = new Matrix();
        this.I1 = new TextPaint(1);
        this.J1 = new Matrix();
        this.K1 = new TextPaint(1);
        this.T1 = new Paint(1);
        this.U1 = new Paint(1);
        this.V1 = new Paint(1);
        this.W1 = new Paint(1);
        this.X1 = new Matrix();
        this.Y1 = new RectF();
        this.f2 = new RectF();
        this.m2 = new float[0];
        this.t2 = new ArrayList();
        this.u2 = new Paint(1);
        this.v2 = new RectF();
        this.w2 = lr.h;
        this.x2 = new float[2];
        this.y2 = new Path();
        this.z2 = new vu0(2200);
        this.E2 = 900L;
        this.R2 = new float[0];
        this.S2 = new float[0];
        this.c3 = new Paint();
        this.d3 = new Paint();
        this.e3 = new Paint();
        this.i3 = new Matrix();
        this.k3 = new Matrix();
        this.m3 = new a(this, 1);
        this.p3 = new int[2];
        this.b = i6Var;
        this.a = eVar;
        w2 w2Var = new w2(context);
        this.G = w2Var;
        w2Var.setCallback(this);
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

    public final void A(float f10, float f11, float f12, long j3, Canvas canvas) {
        vu0 vu0Var;
        float f13;
        float f14;
        d dVar;
        float f15;
        char c10;
        d dVar2;
        int i7;
        float f16;
        Canvas canvas2 = canvas;
        float f17 = (j3 - this.k2) / 1000.0f;
        float f18 = 0.4f;
        float f19 = 1.0f;
        float f20 = 0.0f;
        float interpolation = this.w2.getInterpolation(Math.max(0.0f, Math.min(1.0f, (f17 - 0.08f) / 0.4f)));
        int i10 = this.N;
        TextPaint textPaint = this.d;
        textPaint.setColor(i10);
        ArrayList arrayList = this.t2;
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
                    textPaint.setColor(i0.a.f(e2.C(max2, 2.0f, 3.0f, max2 * max2), this.O, dVar3.q ? s3 : this.N));
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
                    boolean n10 = n(dVar3);
                    float[] fArr = this.x2;
                    if (n10) {
                        int indexOf = arrayList.indexOf(dVar3);
                        int i13 = indexOf;
                        while (!m((d) arrayList.get(i13))) {
                            i13++;
                        }
                        d dVar4 = (d) arrayList.get(i13);
                        float f26 = this.q2;
                        float f27 = dVar3.f + f26;
                        float f28 = u3;
                        float f29 = f27 + f28;
                        f15 = 0.5f;
                        float f30 = (f26 + dVar3.g) - f28;
                        float f31 = this.p2;
                        c10 = 1;
                        float f32 = dVar3.d + f31;
                        float f33 = t3;
                        float f34 = f31 + dVar4.l + f33;
                        RectF rectF = this.v2;
                        rectF.set(f32 - f33, f29, f34, f30);
                        Path path = this.y2;
                        path.rewind();
                        float f35 = v3;
                        d dVar5 = dVar3;
                        path.addRoundRect(rectF, f35, f35, Path.Direction.CW);
                        canvas2.save();
                        canvas2.clipPath(path);
                        int i14 = this.P;
                        float f36 = f29;
                        Paint paint = this.u2;
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
                                float f39 = this.p2;
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
                        float f42 = this.p2;
                        float f43 = fArr[0];
                        float f44 = dVar.d;
                        if (f43 <= f44 + f15) {
                            f43 = f44 - g0.L(4.0f);
                        }
                        float f45 = f42 + f43;
                        float L2 = (this.q2 + dVar.f) - g0.L(4.0f);
                        float f46 = this.p2;
                        float f47 = fArr[c10];
                        if (f47 >= dVar.l - f15) {
                            f47 = dVar.d + dVar.k + g0.L(4.0f);
                        }
                        canvas2.clipRect(f45, L2, f46 + f47, this.q2 + dVar.g + g0.L(4.0f));
                        textPaint.setColor(s3);
                        textPaint.setAlpha((int) (f12 * 255.0f));
                        canvas2.drawText(dVar.a, this.p2 + dVar.d, this.q2 + dVar.e, textPaint);
                        textPaint.setColor(this.N);
                        canvas2.restore();
                    }
                } else {
                    float f48 = this.p2;
                    float f49 = dVar3.d;
                    float f50 = ((((f10 + dVar3.h) - f48) - f49) * interpolation) + f48 + f49;
                    float f51 = this.q2;
                    float f52 = dVar3.e;
                    float f53 = ((((f11 + dVar3.i) - f51) - f52) * interpolation) + f51 + f52;
                    textPaint.setColor((this.j2 || !dVar3.q) ? this.N : s3);
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
        textPaint.setAlpha(ks.e4);
        float f55 = g0.p;
        while (true) {
            int i16 = this.o2;
            int i17 = this.n2;
            vu0Var = this.z2;
            if (i16 >= i17) {
                break;
            }
            float[] fArr2 = this.m2;
            int i18 = i16 * 3;
            if (fArr2[i18 + 2] > f17) {
                break;
            }
            this.o2 = i16 + 1;
            float f56 = f10 + fArr2[i18];
            float f57 = f11 + fArr2[i18 + 1];
            RectF rectF2 = this.j0;
            if (f57 >= rectF2.top && f57 <= rectF2.bottom) {
                double d = vu0Var.d() * 3.141592653589793d * 2.0d;
                float d2 = ((vu0Var.d() * 18.0f) + 8.0f) * f55;
                this.z2.h((((float) Math.cos(d)) * d2) + f56, e2.x((float) Math.sin(d), d2, 0.7f, f57), f56, f57, ((vu0Var.d() * f54) + 0.8f) * 0.26f);
            }
        }
        if (f17 >= this.l2) {
            this.i2 = false;
            arrayList.clear();
            vu0Var.Q = g0.L(10.0f);
        }
    }

    public final boolean C(d dVar, boolean z10) {
        float L = z10 ? dVar.f : dVar.i - g0.L(14.0f);
        if ((z10 ? dVar.g : dVar.i + g0.L(4.0f)) >= this.O2 - g0.L(2.0f)) {
            return L <= (Math.max(1.0f, this.P2) + this.O2) + ((float) g0.L(2.0f));
        }
        return false;
    }

    public final void E() {
        int i7 = n6.d6;
        i6 i6Var = this.b;
        int w02 = n6.w0(i7, i6Var);
        boolean c10 = s0.c(w02);
        this.M = c10;
        s0 s0Var = this.c;
        if (s0Var.h != c10) {
            s0Var.h = c10;
        }
        int w03 = n6.w0(n6.Pe, i6Var) | (-16777216);
        s0.h(w03);
        s0Var.g(-6440822, w03);
        this.N = n6.w0(n6.Le, i6Var) | (-16777216);
        boolean z10 = this.M;
        this.O = z10 ? i0.a.f(0.12f, w03, -1) : n0.t(w03, w02, z10);
        z3 = this.M ? g0.L(7.0f) : 0.0f;
        this.P = n6.r1(this.M ? 0.18f : 0.14f, this.O);
        s3 = this.O;
        this.d.setColor(this.N);
        int w04 = n6.w0(n6.Me, i6Var);
        TextPaint textPaint = this.e;
        textPaint.setColor(w04);
        this.Q = Color.alpha(textPaint.getColor());
        int w05 = n6.w0(n6.G6, i6Var);
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
        this.j3 = null;
        this.Q1 = null;
        this.G1 = null;
        textPaint.setShader(null);
        invalidate();
    }

    public final void F() {
        int[] iArr;
        if (this.M0 == null) {
            int[] iArr2 = this.c.B;
            boolean z10 = this.M;
            i6 i6Var = this.b;
            int d = (z10 ? s0.d(n6.w0(n6.Me, i6Var)) : n6.w0(n6.Me, i6Var)) | (-16777216);
            int e10 = this.M ? s0.e(-7359233) : i0.a.f(0.55f, iArr2[0], iArr2[4]);
            int e11 = this.M ? s0.e(-7411982) : i0.a.f(0.55f, iArr2[1], iArr2[4]);
            int e12 = this.M ? s0.e(-4940545) : i0.a.f(0.55f, iArr2[2], iArr2[4]);
            if (this.M) {
                int e13 = s0.e(-7359233);
                int e14 = s0.e(-5650177);
                iArr = new int[]{i0.a.f(0.4f, d, e13), i0.a.f(0.3f, d, e14), i0.a.f(0.4f, d, e13), i0.a.f(0.3f, d, e14)};
            } else {
                int w02 = n6.w0(n6.Me, i6Var);
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
            this.Q = Math.round(147.9f);
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

    public final void c(Canvas canvas, float f10, float f11, float f12, float f13, long j3) {
        if (this.M) {
            LinearGradient linearGradient = this.Q1;
            Paint paint = this.U1;
            Paint paint2 = this.T1;
            Paint paint3 = this.V1;
            if (linearGradient == null) {
                LinearGradient linearGradient2 = new LinearGradient(-1.0f, 0.0f, 1.0f, 0.0f, new int[]{s0.e(-7447553), s0.e(-13649665), s0.e(-13665281)}, (float[]) null, Shader.TileMode.MIRROR);
                this.Q1 = linearGradient2;
                paint2.setShader(linearGradient2);
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                RadialGradient radialGradient = new RadialGradient(0.0f, 0.0f, 1.0f, new int[]{788529151, 536870911, 234881023, 16777215}, new float[]{0.0f, 0.35f, 0.7f, 1.0f}, tileMode);
                this.R1 = radialGradient;
                paint.setShader(radialGradient);
                LinearGradient linearGradient3 = new LinearGradient(0.0f, -1.0f, 0.0f, 1.0f, new int[]{1090519039, 184549375, 352321535}, new float[]{0.0f, 0.6f, 1.0f}, tileMode);
                this.S1 = linearGradient3;
                paint3.setShader(linearGradient3);
                paint3.setStyle(Paint.Style.STROKE);
            }
            float f14 = (j3 % 5000) / 5000.0f;
            Matrix matrix = this.X1;
            matrix.setTranslate(4.0f * f14, 0.0f);
            float f15 = 2.6f * f12;
            matrix.postScale(f15, f15);
            matrix.postRotate(35.0f);
            matrix.postTranslate(f10, f11);
            this.Q1.setLocalMatrix(matrix);
            int i7 = (int) (255.0f * f13);
            paint2.setAlpha(i7);
            canvas.drawCircle(f10, f11, f12, paint2);
            float sin = 0.06f * f12 * ((float) Math.sin(f14 * 3.141592653589793d * 2.0d));
            float f16 = 0.62f * f12;
            matrix.setScale(1.35f * f12, f16);
            matrix.postTranslate(f10 + sin, f11 - f16);
            this.R1.setLocalMatrix(matrix);
            paint.setAlpha(i7);
            canvas.drawCircle(f10, f11, f12, paint);
            matrix.setScale(f12, f12);
            matrix.postTranslate(f10, f11);
            this.S1.setLocalMatrix(matrix);
            paint3.setStrokeWidth(Math.max(1.0f, g0.N(0.8f)));
            paint3.setAlpha(i7);
            canvas.drawCircle(f10, f11, f12 - g0.N(0.4f), paint3);
        }
    }

    public final void d(Canvas canvas, fh.g gVar, RectF rectF, float f10) {
        float height = rectF.height() / 2.0f;
        if (gVar != null) {
            gVar.r(height);
            gVar.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            gVar.setAlpha((int) (f10 * 255.0f));
            gVar.draw(canvas);
            return;
        }
        int i7 = (int) ((this.M ? ks.u3 : 235) * f10);
        Paint paint = this.r;
        paint.setAlpha(i7);
        canvas.drawRoundRect(rectF, height, height, paint);
    }

    public final void e(Canvas canvas, float f10, float f11, boolean z10) {
        float f12;
        float f13;
        float f14;
        float f15;
        xi.e eVar;
        RectF rectF;
        PorterDuff.Mode mode;
        float f16;
        float f17;
        boolean z11;
        int i7;
        this.w1 = a(this.w1, this.o1 != null ? 1.0f : 0.0f, f11, 0.09f);
        String str = this.o1;
        String str2 = this.n1;
        if (str == null) {
            str = str2;
        }
        TextPaint textPaint = this.n;
        float measureText = textPaint.measureText(str);
        float f18 = this.v1;
        if (f18 > 0.0f) {
            measureText = a(f18, measureText, f11, 0.11f);
        }
        this.v1 = measureText;
        float L = g0.L(36.0f);
        RectF rectF2 = this.j0;
        float L2 = rectF2.top - g0.L(8.0f);
        float f19 = this.q1;
        float C = e2.C(f19, 2.0f, 3.0f, f19 * f19);
        int color = textPaint.getColor();
        float L3 = rectF2.left + g0.L(2.0f);
        float f20 = L2 - L;
        RectF rectF3 = this.z1;
        rectF3.set(L3, f20, this.E1 + L3, L2);
        fh.g gVar = this.M1;
        xi.e eVar2 = this.a;
        if (gVar == null) {
            this.M1 = eVar2.k(this);
        }
        canvas.save();
        float f21 = 1.0f - C;
        canvas.translate(0.0f, g0.L(6.0f) * f21);
        float f22 = (C * 0.1f) + 0.9f;
        float C2 = e2.C(this.s1, 0.06f, 1.0f, f22);
        canvas.scale(C2, C2, rectF3.centerX(), rectF3.centerY());
        d(canvas, this.M1, rectF3, f10);
        if (this.C1 == null) {
            this.C1 = getContext().getResources().getDrawable(R.drawable.msg_settings).mutate();
        }
        Drawable drawable = this.C1;
        PorterDuff.Mode mode2 = PorterDuff.Mode.SRC_IN;
        drawable.setColorFilter(new PorterDuffColorFilter(color, mode2));
        this.C1.setAlpha((int) (f10 * 255.0f));
        int centerX = (int) rectF3.centerX();
        int centerY = (int) rectF3.centerY();
        int L4 = g0.L(18.5f);
        float f23 = centerX;
        float f24 = L4 / 2.0f;
        float f25 = f23 - f24;
        float f26 = centerY - f24;
        this.C1.setBounds(Math.round(f25), Math.round(f26), Math.round(f25) + L4, Math.round(f26) + L4);
        this.C1.draw(canvas);
        canvas.restore();
        float L5 = rectF3.right + g0.L(8.0f);
        float f27 = this.v1;
        if (f27 <= 0.0f) {
            String str3 = this.o1;
            if (str3 == null) {
                str3 = str2;
            }
            f27 = textPaint.measureText(str3);
        }
        RectF rectF4 = this.y1;
        rectF4.set(L5, f20, g0.L(6.0f) + g0.L(18.0f) + g0.L(12.0f) + f27 + g0.L(8.0f) + g0.L(8.0f) + g0.L(13.0f) + L5, L2);
        float max = Math.max(0.0f, 1.0f - (this.a0 * 2.0f));
        if (max < 0.01f) {
            f12 = 0.01f;
            if (!this.x1) {
                rectF4.setEmpty();
            }
        } else {
            f12 = 0.01f;
        }
        if (this.x1 || max < f12) {
            f13 = 12.0f;
            f14 = f20;
            f15 = L2;
            eVar = eVar2;
            rectF = rectF4;
            mode = mode2;
            f16 = 0.0f;
        } else {
            float f28 = f10 * max;
            if (this.L1 == null) {
                this.L1 = eVar2.k(this);
            }
            canvas.save();
            float L6 = g0.L(6.0f) * f21;
            f13 = 12.0f;
            canvas.translate(0.0f, L6);
            float C3 = e2.C(this.r1, 0.04f, 1.0f, f22);
            canvas.scale(C3, C3, rectF4.left + g0.L(18.0f), rectF4.bottom);
            d(canvas, this.L1, rectF4, f28);
            if (this.B1 == null) {
                this.B1 = getContext().getResources().getDrawable(R.drawable.msg_language).mutate();
            }
            int color2 = textPaint.getColor();
            float centerY2 = rectF4.centerY();
            this.B1.setColorFilter(new PorterDuffColorFilter(color2, mode2));
            float f29 = f28 * 255.0f;
            int i10 = (int) f29;
            this.B1.setAlpha(i10);
            int L7 = (int) (rectF4.left + g0.L(12.0f));
            int L8 = (int) (centerY2 - g0.L(9.0f));
            mode = mode2;
            eVar = eVar2;
            f14 = f20;
            this.B1.setBounds(L7, L8, g0.L(18.0f) + L7, g0.L(18.0f) + L8);
            this.B1.draw(canvas);
            float L9 = (rectF4.right - g0.L(13.0f)) - g0.L(4.0f);
            canvas.save();
            canvas.clipRect(rectF4.left, rectF4.top, L9 - g0.L(8.0f), rectF4.bottom);
            int alpha = textPaint.getAlpha();
            float L10 = rectF4.left + g0.L(12.0f) + g0.L(18.0f) + g0.L(6.0f);
            boolean z12 = this.o1 == null && this.w1 < 0.99f;
            TextPaint textPaint2 = this.K1;
            if (z12) {
                z11 = z12;
                if (this.F1 == null) {
                    f15 = L2;
                    this.F1 = new LinearGradient(0.0f, 0.0f, 1.0f, 0.0f, new int[]{16777215, -1, 16777215}, (float[]) null, Shader.TileMode.CLAMP);
                    textPaint2.setTypeface(textPaint.getTypeface());
                } else {
                    f15 = L2;
                }
                textPaint2.setTextSize(textPaint.getTextSize());
                float measureText2 = textPaint.measureText(str2);
                float L11 = g0.L(36.0f);
                f17 = L9;
                float min = (Math.min(1.0f, (SystemClock.uptimeMillis() % 2200) / 1100.0f) * ((L11 * 2.0f) + measureText2)) + (L10 - L11);
                Matrix matrix = this.J1;
                matrix.setScale(L11, 1.0f);
                matrix.postTranslate(min - (L11 / 2.0f), 0.0f);
                this.F1.setLocalMatrix(matrix);
                postInvalidateOnAnimation();
            } else {
                f17 = L9;
                f15 = L2;
                z11 = z12;
            }
            Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
            float f30 = centerY2 - ((fontMetrics.ascent + fontMetrics.descent) / 2.0f);
            if (z11 && this.M) {
                if (this.G1 == null) {
                    int color3 = textPaint.getColor() | (-16777216);
                    int f31 = i0.a.f(0.4f, color3, s0.e(-7359233));
                    rectF = rectF4;
                    this.G1 = new LinearGradient(0.0f, 0.0f, 1.0f, 0.0f, new int[]{f31, i0.a.f(0.28f, color3, s0.e(-5650177)), f31}, (float[]) null, Shader.TileMode.MIRROR);
                } else {
                    rectF = rectF4;
                }
                float L12 = g0.L(200.0f);
                Matrix matrix2 = this.H1;
                matrix2.setScale(L12, 1.0f);
                i7 = i10;
                matrix2.postTranslate((((SystemClock.uptimeMillis() % 6000) / 6000.0f) * 2.0f * L12) + L10, 0.0f);
                this.G1.setLocalMatrix(matrix2);
                Typeface typeface = textPaint.getTypeface();
                TextPaint textPaint3 = this.I1;
                textPaint3.setTypeface(typeface);
                textPaint3.setTextSize(textPaint.getTextSize());
                textPaint3.setShader(this.G1);
                textPaint3.setAlpha((int) ((1.0f - this.w1) * 0.62f * f29));
                canvas.drawText(str2, L10, f30, textPaint3);
                float f32 = this.w1;
                if (f32 > f12 && this.o1 != null) {
                    textPaint.setAlpha((int) (f32 * f29));
                    canvas.drawText(this.o1, L10, f30, textPaint);
                }
            } else {
                rectF = rectF4;
                i7 = i10;
                textPaint.setAlpha((int) e2.B(this.w1, 0.5f, 0.5f, f29));
                String str4 = this.o1;
                if (str4 == null) {
                    str4 = str2;
                }
                canvas.drawText(str4, L10, f30, textPaint);
            }
            if (z11 && SystemClock.uptimeMillis() % 2200 < 1100) {
                textPaint2.setShader(this.F1);
                textPaint2.setAlpha((int) ((1.0f - this.w1) * f29 * 0.55f));
                canvas.drawText(str2, L10, f30, textPaint2);
            }
            textPaint.setAlpha(alpha);
            canvas.restore();
            Path path = this.g1;
            boolean isEmpty = path.isEmpty();
            Paint paint = this.h1;
            if (isEmpty) {
                path.moveTo(-g0.N(3.8f), g0.N(1.9f));
                f16 = 0.0f;
                path.lineTo(0.0f, -g0.N(1.9f));
                path.lineTo(g0.N(3.8f), g0.N(1.9f));
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeWidth(g0.N(1.75f));
                paint.setStrokeCap(Paint.Cap.ROUND);
                paint.setStrokeJoin(Paint.Join.ROUND);
            } else {
                f16 = 0.0f;
            }
            paint.setColor(color2);
            paint.setAlpha(i7);
            canvas.save();
            canvas.translate(f17, centerY2);
            canvas.drawPath(path, paint);
            canvas.restore();
            canvas.restore();
        }
        float a10 = a(this.u1, (this.T || !z10) ? f16 : 1.0f, f11, 0.1f);
        this.u1 = a10;
        RectF rectF5 = this.A1;
        if (a10 <= f12) {
            rectF5.setEmpty();
            return;
        }
        String M0 = gd.M0(2131745445, null);
        float L13 = rectF.right + g0.L(8.0f);
        rectF5.set(L13, f14, textPaint.measureText(M0) + g0.L(f13) + L13 + g0.L(22.0f) + g0.L(8.0f) + g0.L(16.0f), f15);
        if (this.N1 == null) {
            this.N1 = eVar.k(this);
        }
        float f33 = this.u1;
        float C4 = e2.C(f33, 2.0f, 3.0f, f33 * f33);
        float f34 = f33 * f10;
        canvas.save();
        float C5 = e2.C(this.t1, 0.04f, 1.0f, (C4 * 0.15f) + 0.85f);
        canvas.scale(C5, C5, rectF5.left, rectF5.centerY());
        d(canvas, this.N1, rectF5, f34);
        if (this.D1 == null) {
            this.D1 = getContext().getResources().getDrawable(R.drawable.voice_field_send_text).mutate();
        }
        this.D1.setColorFilter(new PorterDuffColorFilter(color, mode));
        int i11 = (int) (f34 * 255.0f);
        this.D1.setAlpha(i11);
        int L14 = (int) (rectF5.left + g0.L(f13));
        int centerY3 = (int) (rectF5.centerY() - g0.L(11.0f));
        this.D1.setBounds(L14, centerY3, g0.L(22.0f) + L14, g0.L(22.0f) + centerY3);
        this.D1.draw(canvas);
        int alpha2 = textPaint.getAlpha();
        textPaint.setAlpha(i11);
        Paint.FontMetrics fontMetrics2 = textPaint.getFontMetrics();
        canvas.drawText(M0, rectF5.left + g0.L(f13) + g0.L(22.0f) + g0.L(8.0f), rectF5.centerY() - ((fontMetrics2.ascent + fontMetrics2.descent) / 2.0f), textPaint);
        textPaint.setAlpha(alpha2);
        canvas.restore();
    }

    public final void f(Canvas canvas, float f10) {
        float f11;
        float f12;
        float f13 = this.a0;
        float L = g0.L(36.0f);
        String M0 = gd.M0(this.Z1 ? 2131745065 : 2131745066, null);
        float i7 = i();
        RectF rectF = this.j0;
        float L2 = rectF.left + g0.L(2.0f);
        float L3 = rectF.top - g0.L(8.0f);
        if (this.a.z()) {
            f11 = 2.0f;
            float L4 = this.E1 + L2 + g0.L(8.0f);
            f12 = 8.0f;
            boolean z10 = (i() + ((float) ((!this.a2 || this.Z1) ? 0 : g0.L(36.0f) + g0.L(6.0f)))) + L4 <= rectF.right - ((float) g0.L(56.0f));
            if (z10) {
                L2 = L4;
            }
            float L5 = z10 ? 0.0f : g0.L(8.0f) + L;
            if (Float.isNaN(this.l1)) {
                this.l1 = L2;
                this.m1 = L5;
            } else {
                this.l1 = a(this.l1, L2, 0.016f, 0.07f);
                this.m1 = a(this.m1, L5, 0.016f, 0.07f);
                if (Math.abs(this.l1 - L2) > 0.5f || Math.abs(this.m1 - L5) > 0.5f) {
                    postInvalidateOnAnimation();
                }
            }
            if (this.a0 < 0.01f) {
                this.l1 = Float.NaN;
            }
            if (!Float.isNaN(this.l1)) {
                L2 = this.l1;
            }
            if (!Float.isNaN(this.l1)) {
                L5 = this.m1;
            }
            L3 -= L5;
        } else {
            f11 = 2.0f;
            f12 = 8.0f;
        }
        RectF rectF2 = this.k0;
        rectF2.set(L2, L3 - L, i7 + L2, L3);
        float f14 = 1.0f - f13;
        float pow = 1.0f - ((float) Math.pow(f14, 3.0d));
        float min = 1.0f - Math.min(1.0f, f13 / 0.55f);
        float sin = ((((float) Math.sin(Math.min(1.0f, f13 / 0.8f) * 3.141592653589793d)) * 0.07f * f14) + ((1.0f - (min * min)) * 0.38f) + 0.62f) * L;
        float f15 = L * 0.62f;
        float max = Math.max(sin, ((rectF2.width() - f15) * pow) + f15);
        float f16 = rectF2.left;
        float f17 = rectF2.bottom;
        RectF rectF3 = this.m0;
        rectF3.set(f16, f17 - sin, max + f16, f17);
        float min2 = Math.min(1.0f, 3.0f * f13) * f10;
        float max2 = Math.max(0.0f, Math.min(1.0f, (f13 - 0.62f) / 0.38f)) * f10;
        float f18 = 1.0f - (this.d0 * 0.04f);
        canvas.save();
        canvas.scale(f18, f18, rectF2.left + g0.L(18.0f), rectF2.bottom);
        float height = rectF3.height() / f11;
        if (this.J != null) {
            if (Math.abs(this.L - height) > 0.5f) {
                this.L = height;
                this.J.r(height);
            }
            this.J.setBounds((int) rectF3.left, (int) rectF3.top, (int) rectF3.right, (int) rectF3.bottom);
            this.J.setAlpha((int) (min2 * 255.0f));
            this.J.draw(canvas);
        } else {
            int i10 = this.M ? ks.u3 : 235;
            Paint paint = this.r;
            paint.setAlpha((int) (i10 * min2));
            canvas.drawRoundRect(rectF3, height, height, paint);
            Paint paint2 = this.s;
            paint2.setAlpha((int) ((this.M ? 38 : 20) * min2));
            canvas.drawRoundRect(rectF3, height, height, paint2);
        }
        if (max2 > 0.0f) {
            float centerY = rectF2.centerY();
            float L6 = rectF2.left + g0.L(12.0f);
            int i11 = (int) L6;
            w2 w2Var = this.G;
            w2Var.setBounds(i11, (int) (centerY - g0.L(12.0f)), g0.L(24.0f) + i11, (int) (g0.L(12.0f) + centerY));
            int i12 = (int) (255.0f * max2);
            w2Var.setAlpha(i12);
            w2Var.draw(canvas);
            TextPaint textPaint = this.n;
            int alpha = textPaint.getAlpha();
            textPaint.setAlpha(i12);
            Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
            canvas.drawText(M0, L6 + g0.L(6.0f) + g0.L(24.0f), centerY - ((fontMetrics.ascent + fontMetrics.descent) / f11), textPaint);
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
            float L7 = (((rectF2.right - g0.L(10.0f)) - g0.L(14.0f)) - g0.L(f12)) - g0.L(1.0f);
            this.j1 = L7;
            int r12 = n6.r1(max2 * 0.14f, textPaint.getColor());
            Paint paint4 = this.i1;
            paint4.setColor(r12);
            canvas.drawRect(L7, rectF2.centerY() - g0.L(10.0f), g0.L(1.0f) + L7, rectF2.centerY() + g0.L(10.0f), paint4);
            paint3.setColor(textPaint.getColor());
            paint3.setAlpha(i12);
            canvas.save();
            canvas.translate((rectF2.right - g0.L(10.0f)) - g0.L(7.0f), rectF2.centerY());
            canvas.drawPath(path, paint3);
            canvas.restore();
        }
        canvas.restore();
    }

    public final void g(Canvas canvas, float f10) {
        float a10 = a(this.d2, (!this.a2 || this.Z1) ? 0.0f : 1.0f, 0.016f, 0.06f);
        this.d2 = a10;
        RectF rectF = this.f2;
        if (a10 < 0.01f) {
            rectF.setEmpty();
            return;
        }
        Drawable drawable = this.g2;
        xi.e eVar = this.a;
        if (drawable == null) {
            this.g2 = getContext().getResources().getDrawable(R.drawable.chats_undo).mutate();
            fh.g k10 = eVar.k(this);
            this.h2 = k10;
            if (k10 != null) {
                k10.r(g0.L(18.0f));
            }
        }
        float L = g0.L(36.0f);
        RectF rectF2 = this.k0;
        rectF.set(rectF2.right + g0.L(6.0f), rectF2.top, rectF2.right + g0.L(6.0f) + L, rectF2.top + L);
        float max = Math.max(0.0f, Math.min(1.0f, (this.a0 - 0.62f) / 0.38f));
        float f11 = this.d2;
        float f12 = f10 * f11 * max;
        if (f12 < 0.01f) {
            return;
        }
        float x10 = (1.0f - (this.e2 * 0.06f)) * e2.x(f11, 0.3f, max, 0.7f);
        canvas.save();
        canvas.scale(x10, x10, rectF.centerX(), rectF.centerY());
        fh.g gVar = this.h2;
        if (gVar != null) {
            gVar.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            this.h2.setAlpha((int) (255.0f * f12));
            this.h2.draw(canvas);
        } else {
            int i7 = this.M ? ks.u3 : 235;
            Paint paint = this.r;
            paint.setAlpha((int) (i7 * f12));
            float f13 = L / 2.0f;
            canvas.drawRoundRect(rectF, f13, f13, paint);
        }
        ((m) eVar.d).b.getClass();
        this.g2.setColorFilter(new PorterDuffColorFilter((-16777216) | this.n.getColor(), PorterDuff.Mode.SRC_IN));
        float L2 = g0.L(24.0f) / 2.0f;
        this.g2.setBounds((int) (rectF.centerX() - L2), (int) (rectF.centerY() - L2), (int) (rectF.centerX() + L2), (int) (rectF.centerY() + L2));
        this.g2.setAlpha((int) (Color.alpha(r0) * f12));
        this.g2.draw(canvas);
        canvas.restore();
        float f14 = this.d2;
        if (f14 <= 0.01f || f14 >= 0.99f) {
            return;
        }
        postInvalidateOnAnimation();
    }

    public String getShownText() {
        return this.O0;
    }

    public final void h(Canvas canvas, float f10, float f11, float f12, float f13, long j3) {
        Paint.Style style = Paint.Style.STROKE;
        Paint paint = this.W1;
        paint.setStyle(style);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(g0.N(2.0f));
        paint.setColor(-1);
        paint.setAlpha((int) (f12 * 255.0f));
        float B = e2.B(f13, 0.3f, 0.7f, g0.N(8.5f));
        RectF rectF = this.Y1;
        rectF.set(f10 - B, f11 - B, f10 + B, f11 + B);
        long j10 = j3 - this.P1;
        float f14 = ((j10 % 1400) / 1400.0f) * 2.0f;
        float min = Math.min(1.0f, f14);
        float C = e2.C(min, 2.0f, 3.0f, min * min);
        float max = Math.max(0.0f, f14 - 1.0f);
        float f15 = ((j10 / 1400) % 18) * 220.0f;
        float C2 = (e2.C(max, 2.0f, 3.0f, max * max) * 220.0f) + f15;
        canvas.drawArc(rectF, (((((j10 % 6000) / 6000.0f) * 360.0f) * 5.0f) + C2) % 360.0f, (((C * 220.0f) + f15) + 30.0f) - C2, false, paint);
    }

    public final float i() {
        return this.n.measureText(gd.M0(this.Z1 ? 2131745065 : 2131745066, null)) + g0.L(6.0f) + g0.L(24.0f) + g0.L(12.0f) + g0.L(12.0f) + g0.L(1.0f) + g0.L(8.0f) + g0.L(14.0f) + g0.L(10.0f);
    }

    public final boolean j() {
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

    public final void k(d dVar, ArrayList arrayList, int i7) {
        if (arrayList == null || i7 >= arrayList.size()) {
            return;
        }
        float[] fArr = (float[]) arrayList.get(i7);
        if (Float.isNaN(fArr[0])) {
            return;
        }
        float f10 = fArr[1] - this.N2;
        float f11 = dVar.e;
        float f12 = f10 - f11;
        dVar.d = fArr[0] - this.M2;
        dVar.e = f11 + f12;
        dVar.f += f12;
        dVar.g += f12;
    }

    public final int l(float f10, float f11) {
        if (!this.R || this.W < 0.6f || this.l3 > 0.3f) {
            return -1;
        }
        float L = g0.L(6.0f);
        if (this.q1 > 0.7f) {
            RectF rectF = this.z1;
            if (!rectF.isEmpty() && f10 >= rectF.left - L && f10 < rectF.right + g0.L(4.0f) && f11 >= rectF.top - L && f11 <= rectF.bottom + L) {
                return 7;
            }
            if (!this.T) {
                RectF rectF2 = this.y1;
                if (!rectF2.isEmpty() && !this.x1 && f10 >= rectF2.left - g0.L(4.0f) && f10 < rectF2.right + g0.L(4.0f) && f11 >= rectF2.top - L && f11 <= rectF2.bottom + L) {
                    return 6;
                }
            }
            if (this.u1 > 0.7f && !this.T) {
                RectF rectF3 = this.A1;
                if (!rectF3.isEmpty() && f10 >= rectF3.left - g0.L(4.0f) && f10 <= rectF3.right + L && f11 >= rectF3.top - L && f11 <= rectF3.bottom + L) {
                    return 8;
                }
            }
        }
        if (this.a0 > 0.7f && this.T0 > 0.7f && !this.Z1) {
            RectF rectF4 = this.l0;
            if (!rectF4.isEmpty() && f10 >= rectF4.left - L && f10 <= rectF4.right + L && f11 >= rectF4.top - L && f11 <= rectF4.bottom + L) {
                return 0;
            }
        }
        RectF rectF5 = this.f2;
        if (!rectF5.isEmpty() && this.d2 > 0.7f && f10 >= rectF5.left - L && f10 <= rectF5.right + L && f11 >= rectF5.top - L && f11 <= rectF5.bottom + L) {
            return 5;
        }
        boolean z10 = this.Z1;
        RectF rectF6 = this.k0;
        if (z10 && !rectF6.isEmpty() && rectF6.contains(f10, f11)) {
            return -1;
        }
        return (this.a0 <= 0.7f || rectF6.isEmpty() || f10 < rectF6.left - L || f10 > rectF6.right + L || f11 < rectF6.top - L || f11 > rectF6.bottom + L) ? this.j0.contains(f10, f11) ? 2 : -1 : f10 >= this.j1 ? 4 : 1;
    }

    public final boolean m(d dVar) {
        ArrayList arrayList = this.t2;
        int indexOf = arrayList.indexOf(dVar) + 1;
        d dVar2 = indexOf < arrayList.size() ? (d) arrayList.get(indexOf) : null;
        return dVar2 == null || !dVar2.b || Math.abs(dVar2.f - dVar.f) >= 1.0f;
    }

    public final boolean n(d dVar) {
        ArrayList arrayList = this.t2;
        int indexOf = arrayList.indexOf(dVar);
        d dVar2 = indexOf > 0 ? (d) arrayList.get(indexOf - 1) : null;
        return dVar2 == null || !dVar2.b || Math.abs(dVar2.f - dVar.f) >= 1.0f;
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
            arrayList = this.t2;
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
    public final void onDraw(android.graphics.Canvas r64) {
        /*
            Method dump skipped, instructions count: 3532
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ji.e.onDraw(android.graphics.Canvas):void");
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i7;
        int actionMasked = motionEvent.getActionMasked();
        a aVar = this.m3;
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
                if (i12 >= 0 && l(motionEvent.getX(), motionEvent.getY()) == i12) {
                    performHapticFeedback(3);
                    xi.e eVar = this.a;
                    if (i12 == 0) {
                        eVar.G();
                        return true;
                    }
                    if (i12 == 1) {
                        m mVar = (m) eVar.d;
                        ChatActivityEnterView chatActivityEnterView = mVar.b.a;
                        int i13 = ChatActivityEnterView.n7;
                        ArrayList G = chatActivityEnterView.w0().G();
                        mVar.k(G.isEmpty() ? ai.h.c : G.get(0));
                        return true;
                    }
                    if (i12 == 4) {
                        m mVar2 = (m) eVar.d;
                        if (mVar2.K != null && !mVar2.n.trim().isEmpty()) {
                            pf pfVar = mVar2.b;
                            e eVar2 = mVar2.K;
                            t6 t6Var = new t6(eVar, 6);
                            ChatActivityEnterView chatActivityEnterView2 = pfVar.a;
                            au0 au0Var = chatActivityEnterView2.a2;
                            RectF rectF = new RectF();
                            rectF.set(eVar2.k0);
                            if (!rectF.isEmpty() && au0Var != null) {
                                FrameLayout frameLayout = new FrameLayout(chatActivityEnterView2.getContext());
                                au0Var.addView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
                                View view = new View(chatActivityEnterView2.getContext());
                                frameLayout.addView(view, new FrameLayout.LayoutParams((int) rectF.width(), (int) rectF.height(), 51));
                                frameLayout.post(new h2(pfVar, eVar2, frameLayout, view, rectF, t6Var, 14));
                                return true;
                            }
                        }
                    } else if (i12 == 5) {
                        m mVar3 = (m) eVar.d;
                        if (mVar3.g0 != null && !mVar3.i0) {
                            Log.d("VoiceLive", "field: back to the text before the style");
                            if (mVar3.h0) {
                                mVar3.e0 = mVar3.g0;
                                mVar3.f0 = mVar3.c().size();
                            } else {
                                mVar3.e0 = null;
                            }
                            mVar3.g0 = null;
                            e eVar3 = mVar3.K;
                            if (eVar3 != null) {
                                eVar3.setRevertShown(false);
                                mVar3.K.setRebuildNext(true);
                            }
                            mVar3.p();
                            e eVar4 = mVar3.K;
                            if (eVar4 != null) {
                                eVar4.setRebuildNext(false);
                                return true;
                            }
                        }
                    } else if (i12 == 6) {
                        m mVar4 = (m) eVar.d;
                        if (mVar4.K != null && ((i7 = mVar4.c) == 2 || i7 == 4)) {
                            String[] C = DictationAsr.C();
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(gd.M0(2131745074, null));
                            boolean v = DictationAsr.v();
                            int i14 = v ? 0 : -1;
                            for (int i15 = 0; i15 < C.length; i15++) {
                                arrayList.add(n0.p(C[i15]));
                                if (!v && i14 < 0 && DictationAsr.y(C[i15])) {
                                    i14 = i15 + 1;
                                }
                            }
                            pf pfVar2 = mVar4.b;
                            e eVar5 = mVar4.K;
                            g gVar = new g(mVar4, C, i11);
                            f fVar = new f(mVar4, i10);
                            ChatActivityEnterView chatActivityEnterView3 = pfVar2.a;
                            au0 au0Var2 = chatActivityEnterView3.a2;
                            RectF rectF2 = new RectF();
                            rectF2.set(eVar5.y1);
                            if (!rectF2.isEmpty() && au0Var2 != null) {
                                FrameLayout frameLayout2 = new FrameLayout(chatActivityEnterView3.getContext());
                                au0Var2.addView(frameLayout2, new FrameLayout.LayoutParams(-1, -1));
                                View view2 = new View(chatActivityEnterView3.getContext());
                                frameLayout2.addView(view2, new FrameLayout.LayoutParams((int) rectF2.width(), (int) rectF2.height(), 51));
                                frameLayout2.post(new j8(pfVar2, eVar5, frameLayout2, view2, rectF2, arrayList, i14, gVar, fVar));
                                return true;
                            }
                        }
                    } else {
                        if (i12 == 7) {
                            ((m) eVar.d).m();
                            return true;
                        }
                        if (i12 == 8) {
                            eVar.G();
                            return true;
                        }
                        m mVar5 = (m) eVar.d;
                        pf pfVar3 = mVar5.b;
                        if (mVar5.K != null && mVar5.c != 0) {
                            ChatActivityEnterView chatActivityEnterView4 = pfVar3.a;
                            ChatActivityEnterView chatActivityEnterView5 = pfVar3.a;
                            au0 au0Var3 = chatActivityEnterView4.a2;
                            if (au0Var3 != null) {
                                EditTextBoldCursor editTextBoldCursor = mVar5.X;
                                if (editTextBoldCursor != null) {
                                    editTextBoldCursor.requestFocus();
                                    g0.I3(mVar5.X);
                                    return true;
                                }
                                i6 i6Var = chatActivityEnterView4.K4;
                                EditTextBoldCursor editTextBoldCursor2 = new EditTextBoldCursor(mVar5.a);
                                editTextBoldCursor2.setBackground(null);
                                editTextBoldCursor2.setPadding(0, 0, 0, 0);
                                editTextBoldCursor2.setIncludeFontPadding(false);
                                gf gfVar = chatActivityEnterView5.F0;
                                editTextBoldCursor2.setTextSize(0, gfVar != null ? gfVar.getTextSize() : g0.L(18.0f));
                                editTextBoldCursor2.setTextColor(n6.w0(n6.Le, i6Var));
                                int i16 = n6.Pe;
                                int i17 = ChatActivityEnterView.n7;
                                editTextBoldCursor2.setCursorColor(chatActivityEnterView5.C0(i16) | (-16777216));
                                u6.C(editTextBoldCursor2, n6.lg, i6Var);
                                u6.l(editTextBoldCursor2, 36, n6.mg, i6Var);
                                editTextBoldCursor2.setCursorSize(g0.L(20.0f));
                                editTextBoldCursor2.setCursorWidth(2.0f);
                                editTextBoldCursor2.setGravity(51);
                                editTextBoldCursor2.setInputType(147457);
                                editTextBoldCursor2.setImeOptions(TLObject.FLAG_28);
                                editTextBoldCursor2.setText(mVar5.n);
                                editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                                int size = mVar5.c().size();
                                mVar5.b0 = size;
                                mVar5.Y = size;
                                mVar5.Z = editTextBoldCursor2.length();
                                mVar5.a0 = "";
                                editTextBoldCursor2.addTextChangedListener(new ah.j(mVar5, 9));
                                au0Var3.addView(editTextBoldCursor2, mVar5.K.getParent() == au0Var3 ? au0Var3.indexOfChild(mVar5.K) + 1 : au0Var3.getChildCount(), new FrameLayout.LayoutParams(1, 1, 51));
                                mVar5.X = editTextBoldCursor2;
                                editTextBoldCursor2.requestFocus();
                                g0.h3(new r1(27, mVar5, editTextBoldCursor2), 50L);
                                StringBuilder sb2 = new StringBuilder("field: editing in place (");
                                sb2.append(mVar5.n.length());
                                sb2.append(" chars, recording ");
                                sb2.append(mVar5.c == 2 ? "on" : "paused");
                                sb2.append(")");
                                Log.d("VoiceLive", sb2.toString());
                                mVar5.K.invalidate();
                            }
                        }
                    }
                }
            } else if (actionMasked == 2) {
                int i18 = this.f0;
                if ((i18 == 2 || i18 == 3 || this.K0) && this.J0 > 0.0f) {
                    float y10 = motionEvent.getY() - this.H0;
                    if (!this.K0 && Math.abs(y10) > this.L0) {
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
                int i19 = this.f0;
                if (i19 >= 0 && i19 != 3 && l(motionEvent.getX(), motionEvent.getY()) != this.f0) {
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
        int l10 = l(motionEvent.getX(), motionEvent.getY());
        this.f0 = l10;
        if (l10 >= 0) {
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
        this.B2 = false;
        Bitmap bitmap = this.Q2;
        Bitmap bitmap2 = null;
        if (bitmap != null) {
            bitmap.recycle();
            this.Q2 = null;
        }
        if (staticLayout == null || staticLayout2 == null || !this.n0 || staticLayout.getWidth() <= 0 || staticLayout.getHeight() <= 0) {
            return;
        }
        LinearGradient linearGradient = this.f3;
        Paint paint = this.e3;
        if (linearGradient == null) {
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            this.f3 = new LinearGradient(0.0f, 0.0f, 1.0f, 0.0f, 0, -16777216, tileMode);
            this.g3 = new LinearGradient(0.0f, 0.0f, 1.0f, 0.0f, -16777216, 0, tileMode);
            this.h3 = new LinearGradient(0.0f, 0.0f, 1.0f, 0.0f, 16777215, -1, tileMode);
            this.d3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_ATOP));
        }
        paint.setColorFilter(new PorterDuffColorFilter(s0.e(this.M ? -7358721 : -15363160), PorterDuff.Mode.SRC_IN));
        this.I2 = this.M2;
        this.J2 = this.N2;
        this.K2 = this.O2;
        this.L2 = Math.max(1.0f, this.P2);
        try {
            int width = staticLayout.getWidth() + g0.L(4.0f);
            int height = staticLayout.getHeight() + 2;
            Bitmap.Config config = Bitmap.Config.ARGB_8888;
            this.Q2 = Bitmap.createBitmap(width, height, config);
            TextPaint textPaint = this.d;
            textPaint.setAlpha(ks.e4);
            float f10 = this.I2;
            this.X2 = f10 - ((float) Math.floor(f10));
            float f11 = this.J2;
            this.Y2 = f11 - ((float) Math.floor(f11));
            Canvas canvas = new Canvas(this.Q2);
            canvas.translate(this.X2, this.Y2);
            y(SystemClock.uptimeMillis());
            staticLayout.draw(canvas);
            textPaint.setShader(null);
            this.b3 = this.Z1;
            this.T2 = t(1100, this.Q2, true);
            this.U2 = 0;
            try {
                bitmap2 = Bitmap.createBitmap(staticLayout2.getWidth() + g0.L(4.0f), Math.max(1, staticLayout2.getHeight()), config);
                staticLayout2.draw(new Canvas(bitmap2));
                this.U2 = t(1000, bitmap2, false);
            } catch (Throwable unused) {
            }
            bitmap2.recycle();
            RectF rectF = this.j0;
            float width2 = rectF.width();
            float centerY = rectF.centerY() - this.J2;
            float f12 = rectF.left;
            float f13 = this.I2;
            float f14 = centerY * 0.9f;
            this.G2 = ((f12 - (0.35f * width2)) - f13) + f14;
            this.H2 = (((width2 * 1.35f) + f12) - f13) + f14;
            this.E2 = Math.max(800L, Math.min(1200L, (Math.max(staticLayout.getLineCount(), staticLayout2.getLineCount()) * 70) + 700));
            float v = v(this.K2 * 0.9f);
            this.Z2 = v;
            this.a3 = Math.max(v + 0.12f, v(((this.K2 + this.L2) * 0.9f) + staticLayout.getWidth()) + 0.06f);
            this.W2 = 0;
            this.V2 = 0;
            vu0 vu0Var = this.z2;
            vu0Var.a();
            vu0Var.e(this.M);
            vu0Var.a = s0.k(this.M);
            vu0Var.Q = g0.L(10.0f);
            this.D2 = SystemClock.uptimeMillis();
            float f15 = this.c2;
            if (f15 > 0.05f) {
                this.F2 = Math.max(this.F2, f15);
            }
            this.B2 = true;
        } catch (Throwable unused2) {
        }
    }

    public final void q(Canvas canvas, long j3, float f10, float f11, float f12, float f13, float f14) {
        float f15;
        vu0 vu0Var;
        float f16 = (j3 - this.D2) / 1000.0f;
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
        s(this.h3, r11 - g0.L(48.0f), r11);
        LinearGradient linearGradient = this.h3;
        Paint paint = this.e3;
        paint.setShader(linearGradient);
        canvas.drawRect(f17, f18, L2, L3, paint);
        s(this.g3, r11 - L, r11);
        LinearGradient linearGradient2 = this.g3;
        Paint paint2 = this.d3;
        paint2.setShader(linearGradient2);
        canvas.drawRect(f17, f18, L2, L3, paint2);
        canvas.restoreToCount(saveLayer);
        canvas.restore();
        if (this.Q2 == null || r10 - L >= this.H2) {
            f15 = 2.0f;
        } else {
            canvas.save();
            canvas.translate(this.I2, this.J2);
            float max = Math.max(L2, this.Q2.getWidth());
            f15 = 2.0f;
            int saveLayer2 = canvas.saveLayer(f17, this.K2 - g0.L(2.0f), max, this.K2 + this.L2 + g0.L(2.0f), null);
            Paint paint3 = this.c3;
            paint3.setAlpha(i7);
            canvas.drawBitmap(this.Q2, -this.X2, -this.Y2, paint3);
            s(this.f3, r10, L + r10);
            paint2.setShader(this.f3);
            canvas.drawRect(f17, f18, max, Math.max(L3, g0.L(40.0f) + this.Q2.getHeight()), paint2);
            canvas.restoreToCount(saveLayer2);
            canvas.restore();
        }
        float f19 = g0.p;
        long j10 = this.E2;
        float max2 = Math.max(0.05f, Math.min(j10, j10 - (j3 - this.D2)) / 1000.0f);
        while (true) {
            int i10 = this.V2;
            int i11 = this.T2;
            vu0Var = this.z2;
            if (i10 >= i11) {
                break;
            }
            float[] fArr = this.R2;
            int i12 = i10 * 3;
            if (fArr[i12 + 2] > r10) {
                break;
            }
            vu0Var.g(this.I2 + fArr[i12], this.J2 + fArr[i12 + 1], ((vu0Var.d() * 34.0f) + 10.0f) * f19, (-((vu0Var.d() * 20.0f) + 6.0f)) * f19, Math.min(max2, (vu0Var.d() * 0.3f) + 0.26f), 0.0f);
            this.V2++;
        }
        float f20 = f13 - f11;
        while (true) {
            int i13 = this.W2;
            if (i13 >= this.U2) {
                break;
            }
            float[] fArr2 = this.S2;
            int i14 = i13 * 3;
            if (fArr2[i14 + 2] > r10) {
                break;
            }
            this.W2 = i13 + 1;
            float f21 = fArr2[i14 + 1];
            if (f21 >= f20 - g0.L(f15) && f21 <= f20 + f14 + g0.L(f15)) {
                float f22 = f10 + this.S2[i14];
                float f23 = f11 + f21;
                vu0Var.h((((vu0Var.d() * 16.0f) + 6.0f) * f19) + f22, ((vu0Var.d() - 0.5f) * 14.0f * f19) + f23, f22, f23, Math.min(max2, (vu0Var.d() * 0.08f) + 0.099999994f));
            }
        }
        if (f16 * 1000.0f >= this.E2) {
            this.B2 = false;
            Bitmap bitmap = this.Q2;
            if (bitmap != null) {
                bitmap.recycle();
                this.Q2 = null;
            }
        }
    }

    public final float r(float f10) {
        float interpolation = B3.getInterpolation(Math.max(0.0f, Math.min(1.0f, (f10 * 1000.0f) / (this.E2 - 60.0f))));
        float f11 = this.G2;
        return e2.z(this.H2, f11, interpolation, f11);
    }

    public final void s(LinearGradient linearGradient, float f10, float f11) {
        float sqrt = (float) Math.sqrt(1.809999942779541d);
        float f12 = 1.0f / sqrt;
        float f13 = 0.9f / sqrt;
        float f14 = f10 / sqrt;
        float f15 = f11 / sqrt;
        Matrix matrix = this.i3;
        matrix.reset();
        matrix.setScale(Math.max(0.01f, f15 - f14), 1.0f);
        matrix.postRotate((float) Math.toDegrees(Math.atan2(f13, f12)));
        matrix.postTranslate(f12 * f14, f14 * f13);
        linearGradient.setLocalMatrix(matrix);
    }

    public void setBusy(boolean z10) {
        if (this.Z1 == z10) {
            return;
        }
        this.Z1 = z10;
        if (z10) {
            this.b2 = SystemClock.uptimeMillis();
        }
        invalidate();
    }

    public void setLanguage(CharSequence charSequence) {
        this.o1 = charSequence == null ? null : charSequence.toString();
        invalidate();
    }

    public void setLanguagePillHidden(boolean z10) {
        this.x1 = z10;
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
        if (Objects.equals(str, this.p1)) {
            return;
        }
        this.p1 = str;
        this.R0 = null;
        invalidate();
    }

    public void setRebuildNext(boolean z10) {
        this.A2 = z10;
    }

    public void setRevertShown(boolean z10) {
        this.a2 = z10;
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
                float f11 = this.K2;
                float f12 = max;
                if (f10 >= f11 - f12) {
                    if (f10 > f11 + this.L2 + f12) {
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
        float[] fArr = z10 ? this.R2 : this.S2;
        if (fArr.length < min) {
            fArr = new float[min];
        }
        int i13 = 0;
        for (int i14 = 0; i14 < height; i14 += max) {
            if (z10) {
                float f14 = i14;
                float f15 = this.K2;
                float f16 = max;
                if (f14 >= f15 - f16) {
                    if (f14 > f15 + this.L2 + f16) {
                    }
                }
            }
            for (int i15 = 0; i15 < width; i15 += max) {
                if ((iArr[(i14 * width) + i15] >>> 24) > 90) {
                    vu0 vu0Var = this.z2;
                    if (vu0Var.d() <= f13) {
                        int i16 = i13 + 1;
                        if (i16 * 3 <= fArr.length) {
                            float f17 = max;
                            float d = ((vu0Var.d() - 0.5f) * f17) + i15;
                            float d2 = ((vu0Var.d() - 0.5f) * f17) + i14;
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
        Arrays.sort(numArr, new ai.l(2, fArr));
        float[] copyOf = Arrays.copyOf(fArr, i13 * 3);
        for (int i19 = 0; i19 < i13; i19++) {
            int i20 = i19 * 3;
            int intValue = numArr[i19].intValue() * 3;
            fArr[i20] = copyOf[intValue];
            fArr[i20 + 1] = copyOf[intValue + 1];
            fArr[i20 + 2] = copyOf[intValue + 2];
        }
        if (z10) {
            this.R2 = fArr;
            return i13;
        }
        this.S2 = fArr;
        return i13;
    }

    public final float u(long j3) {
        return B3.getInterpolation(Math.max(0.0f, Math.min(1.0f, (j3 - this.D2) / this.E2)));
    }

    public final float v(float f10) {
        float f11 = 0.0f;
        if (this.H2 <= this.G2) {
            return 0.0f;
        }
        float f12 = this.E2 / 1000.0f;
        for (int i7 = 0; i7 < 24; i7++) {
            float f13 = (f11 + f12) / 2.0f;
            if (r(f13) < f10) {
                f11 = f13;
            } else {
                f12 = f13;
            }
        }
        return Math.min(f12, this.E2 / 1000.0f);
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
                spannableString.setSpan(new g2(cVar, 1), cVar.a, cVar.b, 33);
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
                        float f10 = t3;
                        float lineTop = this.P0.getLineTop(i15);
                        float f11 = u3;
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
        long j3;
        ArrayList arrayList2;
        long j10;
        ArrayList arrayList3;
        float f10;
        float f11;
        vu0 vu0Var;
        Bitmap bitmap;
        Bitmap bitmap2;
        vu0 vu0Var2;
        int i7;
        int i10;
        float f12;
        float f13;
        vu0 vu0Var3;
        int i11;
        float f14;
        int i12;
        vu0 vu0Var4;
        float f15;
        float f16;
        float f17;
        vu0 vu0Var5;
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
            if (!this.A2 || (staticLayout = this.P0) == null) {
                return;
            }
            this.A2 = false;
            p(staticLayout, staticLayout);
            invalidate();
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        String str = this.O0;
        this.b1 = iArr;
        boolean z12 = this.A2;
        ArrayList arrayList6 = this.a1;
        if (z12 && !str.isEmpty() && !sb3.equals(str) && this.P0 != null) {
            this.A2 = false;
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
                    j3 = uptimeMillis;
                    arrayList2 = arrayList6;
                    j10 = 1550;
                } else {
                    StaticLayout staticLayout3 = this.P0;
                    j10 = 1550;
                    boolean z13 = this.i2;
                    ArrayList arrayList7 = this.t2;
                    if (z13) {
                        arrayList3 = new ArrayList();
                        int size3 = arrayList7.size();
                        int i25 = 0;
                        while (i25 < size3) {
                            Object obj = arrayList7.get(i25);
                            i25++;
                            int i26 = i13;
                            d dVar2 = (d) obj;
                            if (!this.j2 || !dVar2.b) {
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
                        j3 = uptimeMillis;
                        arrayList2 = arrayList6;
                    } else {
                        boolean z14 = D2.size() < D.size() ? 1 : i27;
                        ArrayList arrayList8 = z14 != 0 ? D : D2;
                        if (z14 == 0) {
                            D2 = D;
                        }
                        String str2 = z14 != 0 ? str : sb3;
                        String str3 = z14 != 0 ? sb3 : str;
                        j3 = uptimeMillis;
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
                            this.j2 = z14;
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
                                    k(dVar3, arrayList3, i33);
                                }
                                arrayList7.add(dVar3);
                            }
                            TextPaint textPaint = this.d;
                            vu0 vu0Var6 = this.z2;
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
                                        k(dVar4, arrayList3, i35);
                                        i35++;
                                    }
                                }
                                f11 = 4.0f;
                                this.p2 = this.M2;
                                this.q2 = this.N2;
                                this.k2 = SystemClock.uptimeMillis();
                                this.i2 = true;
                                vu0Var = vu0Var6;
                            } else {
                                f10 = 0.8f;
                                f11 = 4.0f;
                                this.p2 = this.M2;
                                this.q2 = this.N2;
                                this.r2 = this.O2;
                                this.s2 = Math.max(1.0f, this.P2);
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
                                vu0Var6.a();
                                vu0Var6.e(this.M);
                                vu0Var6.a = s0.k(this.M);
                                float f20 = 10.0f;
                                vu0Var6.Q = g0.L(10.0f);
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
                                textPaint.setAlpha(ks.e4);
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
                                                float f26 = this.r2;
                                                bitmap2 = createBitmap;
                                                float f27 = max;
                                                if (f25 >= f26 - f27) {
                                                    f14 = f23;
                                                    try {
                                                        if (f25 <= f26 + this.s2 + f27) {
                                                            int i45 = 0;
                                                            while (i45 < i40) {
                                                                int i46 = i40;
                                                                if ((iArr7[(i44 * i40) + i45] >>> 24) <= 90 || vu0Var6.d() > f14) {
                                                                    i12 = i45;
                                                                    vu0Var4 = vu0Var6;
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
                                                                                vu0Var5 = vu0Var6;
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
                                                                                    vu0Var6 = vu0Var5;
                                                                                    i47 = i48;
                                                                                } catch (Throwable unused) {
                                                                                    vu0Var2 = vu0Var5;
                                                                                    vu0Var = vu0Var2;
                                                                                    bitmap = bitmap2;
                                                                                }
                                                                            } catch (Throwable unused2) {
                                                                                vu0Var5 = vu0Var6;
                                                                            }
                                                                        }
                                                                        vu0 vu0Var7 = vu0Var6;
                                                                        if (dVar8 != null) {
                                                                            try {
                                                                                f15 = dVar8.j;
                                                                            } catch (Throwable unused3) {
                                                                                vu0Var = vu0Var7;
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
                                                                        vu0Var4 = vu0Var7;
                                                                        vu0Var4.g(e2.z(vu0Var7.d(), 0.5f, f27, this.p2 + f28), e2.z(vu0Var7.d(), 0.5f, f27, this.q2 + f25), e2.B(vu0Var7.d(), 30.0f, 8.0f, f24), (-((vu0Var7.d() * 26.0f) + f22)) * f24, (vu0Var7.d() * 0.34f) + 0.32f, (f17 * 0.12f) + f16);
                                                                    } catch (Throwable unused4) {
                                                                        vu0Var2 = vu0Var6;
                                                                    }
                                                                }
                                                                i45 = i12 + max;
                                                                vu0Var6 = vu0Var4;
                                                                i40 = i46;
                                                            }
                                                        }
                                                        i11 = i40;
                                                    } catch (Throwable unused5) {
                                                        vu0Var = vu0Var6;
                                                        bitmap = bitmap2;
                                                    }
                                                } else {
                                                    i11 = i40;
                                                    f14 = f23;
                                                }
                                                vu0Var2 = vu0Var6;
                                                try {
                                                    i44 += max;
                                                    vu0Var6 = vu0Var2;
                                                    createBitmap = bitmap2;
                                                    f23 = f14;
                                                    i40 = i11;
                                                } catch (Throwable unused6) {
                                                    vu0Var = vu0Var2;
                                                    bitmap = bitmap2;
                                                }
                                            }
                                            bitmap2 = createBitmap;
                                            vu0Var2 = vu0Var6;
                                            float L = g0.L(3.0f);
                                            int size7 = arrayList7.size();
                                            int i49 = 0;
                                            while (i49 < size7) {
                                                Object obj5 = arrayList7.get(i49);
                                                i49++;
                                                d dVar10 = (d) obj5;
                                                if (dVar10.b) {
                                                    float f30 = dVar10.f;
                                                    float f31 = u3;
                                                    float f32 = f30 + f31;
                                                    float f33 = dVar10.g - f31;
                                                    float f34 = this.r2;
                                                    if (f33 >= f34) {
                                                        if (f32 <= f34 + this.s2) {
                                                            float f35 = dVar10.d;
                                                            boolean n10 = n(dVar10);
                                                            float f36 = t3;
                                                            float f37 = f35 - (n10 ? f36 : 0.0f);
                                                            float f38 = dVar10.l;
                                                            if (!m(dVar10)) {
                                                                f36 = 0.0f;
                                                            }
                                                            float f39 = f38 + f36;
                                                            float f40 = L / 2.0f;
                                                            float f41 = f32 + f40;
                                                            while (f41 < f33) {
                                                                float f42 = f37 + f40;
                                                                while (f42 < f39) {
                                                                    if (vu0Var2.d() > 0.5f) {
                                                                        f13 = L;
                                                                        i7 = size7;
                                                                        i10 = i49;
                                                                        f12 = f41;
                                                                        vu0Var3 = vu0Var2;
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
                                                                        vu0Var2.g(e2.z(vu0Var2.d(), 0.5f, L, this.p2 + f42), e2.z(vu0Var2.d(), 0.5f, L, this.q2 + f12), e2.B(vu0Var2.d(), 22.0f, 6.0f, f24), (-((vu0Var2.d() * 20.0f) + 8.0f)) * f24, (vu0Var2.d() * 0.3f) + 0.26f, (max2 * 0.12f) + dVar10.j);
                                                                        vu0Var3 = vu0Var2;
                                                                    }
                                                                    f42 += f13;
                                                                    vu0Var2 = vu0Var3;
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
                                            vu0Var = vu0Var2;
                                            bitmap = bitmap2;
                                        } catch (Throwable unused7) {
                                            vu0Var = vu0Var6;
                                            bitmap2 = createBitmap;
                                        }
                                    } catch (Throwable unused8) {
                                        bitmap2 = createBitmap;
                                    }
                                } catch (Throwable unused9) {
                                    vu0Var = vu0Var6;
                                    bitmap = null;
                                }
                                bitmap.recycle();
                                this.k2 = SystemClock.uptimeMillis();
                                this.i2 = true;
                            }
                            arrayList2.clear();
                            d dVar11 = null;
                            this.Q0 = null;
                            this.b1 = iArr;
                            this.O0 = sb3;
                            w();
                            if (this.P0 == null) {
                                this.i2 = false;
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
                                        if (!dVar12.b || !this.j2) {
                                            int indexOf2 = str4.indexOf(dVar12.a, i50);
                                            if (indexOf2 < 0) {
                                                this.i2 = false;
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
                                        this.l2 = 0.48000002f;
                                        this.o2 = 0;
                                        this.n2 = 0;
                                        if (!this.j2) {
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
                                                    this.l2 = Math.max(this.l2, dVar13.j + 0.26f + 0.12f + 0.45f);
                                                } else {
                                                    ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(0);
                                                    int i56 = dVar13.p;
                                                    spannableString2.setSpan(foregroundColorSpan, i56, dVar13.a.length() + i56, 33);
                                                }
                                            }
                                            int i57 = 0;
                                            vu0Var.a();
                                            vu0Var.e(this.M);
                                            vu0Var.a = s0.k(this.M);
                                            vu0Var.Q = 0.0f;
                                            textPaint.setAlpha(ks.e4);
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
                                                        if (this.m2.length < Math.min(i58, 1340) * 3) {
                                                            this.m2 = new float[Math.min(i58, 1340) * 3];
                                                        }
                                                        int i62 = 0;
                                                        while (i62 < height2) {
                                                            int i63 = i57;
                                                            while (i63 < width2) {
                                                                if ((iArr9[(i62 * width2) + i63] >>> 24) > 90 && vu0Var.d() <= f45 && (this.n2 + 1) * i61 <= this.m2.length) {
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
                                                                        float[] fArr2 = this.m2;
                                                                        int i65 = this.n2;
                                                                        int i66 = i65 * 3;
                                                                        fArr2[i66] = f46;
                                                                        fArr2[i66 + 1] = i62;
                                                                        fArr2[i66 + 2] = (max4 * 0.12f) + dVar14.j;
                                                                        this.n2 = i65 + 1;
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
                                                        float[] fArr3 = this.m2;
                                                        Integer[] numArr = new Integer[this.n2];
                                                        for (int i67 = 0; i67 < this.n2; i67++) {
                                                            numArr[i67] = Integer.valueOf(i67);
                                                        }
                                                        Arrays.sort(numArr, new ai.l(3, fArr3));
                                                        float[] copyOf = Arrays.copyOf(fArr3, this.n2 * 3);
                                                        for (int i68 = 0; i68 < this.n2; i68++) {
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
                        if (cVar3.a >= i71 || j3 - cVar3.c > j10) {
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
                        cVar4.c = (Math.min(i72, 5) * 40) + j3;
                        arrayList10.add(cVar4);
                        i72++;
                        i71 = i73;
                    }
                } else {
                    arrayList2.clear();
                    this.Q0 = this.P0;
                    this.Y0 = j3;
                }
            }
        }
        this.O0 = sb3;
        w();
        invalidate();
    }

    public final void y(long j3) {
        if (this.Z1) {
            if (this.j3 == null) {
                int e10 = s0.e(this.M ? -10777345 : -15374904);
                int e11 = s0.e(this.M ? -6128385 : -15823740);
                float f10 = this.M ? 0.6f : 0.75f;
                int f11 = i0.a.f(f10, this.N, e10);
                int f12 = i0.a.f(f10, this.N, e11);
                this.j3 = new LinearGradient(0.0f, 0.0f, g0.L(150.0f), 0.0f, new int[]{this.N, f11, i0.a.f(0.5f, f11, f12), f12, this.N}, new float[]{0.0f, 0.3f, 0.5f, 0.7f, 1.0f}, Shader.TileMode.MIRROR);
            }
            float sin = (((float) Math.sin((0.23f * r11) + 1.3f)) * 12.0f) + (((float) Math.sin(0.45f * r11)) * 28.0f);
            Matrix matrix = this.k3;
            matrix.reset();
            matrix.setRotate(sin);
            matrix.postTranslate(g0.L(46.0f) * ((j3 - this.b2) / 1000.0f), g0.L(10.0f) * ((float) Math.sin(r11 * 0.7f)));
            this.j3.setLocalMatrix(matrix);
            this.d.setShader(this.j3);
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
            this.B2 = false;
            Bitmap bitmap = this.Q2;
            if (bitmap != null) {
                bitmap.recycle();
                this.Q2 = null;
            }
            this.i2 = false;
            this.z2.a();
            this.a2 = false;
            this.d2 = 0.0f;
            this.o1 = null;
            this.p1 = null;
            this.R0 = null;
            this.q1 = 0.0f;
            this.Z1 = false;
            this.c2 = 0.0f;
            this.O1 = 0.0f;
            this.A2 = false;
            this.n3 = false;
            this.o3 = false;
        }
        setVisibility(0);
        invalidate();
    }
}
