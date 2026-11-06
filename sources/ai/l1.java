package ai;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Build;
import android.os.SystemClock;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AnimationUtils;
import android.widget.OverScroller;
import bi.v9;
import di.z2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.e6;
import org.telegram.messenger.hd;
import org.telegram.messenger.k5;
import org.telegram.messenger.ls;
import org.telegram.messenger.p10;
import org.telegram.messenger.qs;
import org.telegram.messenger.rc;
import org.telegram.messenger.ui;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.y1;
import org.telegram.ui.Cells.u6;
import org.telegram.ui.Components.RLottieNative;
import org.telegram.ui.Components.g5;
import org.telegram.ui.Components.i5;
import org.telegram.ui.Components.i6;
import org.telegram.ui.Components.mu0;
import org.telegram.ui.Components.v5;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Components.zg0;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class l1 extends View {
    public static int[] D9;
    public static int[] E9;
    public static int[] F9;
    public static String J9;
    public static g K9;
    public static volatile byte[] N9;
    public static int O9;
    public static int P9;
    public static int Q9;
    public boolean A0;
    public final Paint A1;
    public int A2;
    public int[] A3;
    public final float A4;
    public final boolean[] A5;
    public boolean A6;
    public final LinearGradient A7;
    public long A8;
    public final Rect[] A9;
    public float B0;
    public final Paint B1;
    public boolean B2;
    public final Paint B3;
    public final Paint B4;
    public int B5;
    public int B6;
    public final Paint B7;
    public float B8;
    public float C0;
    public final TextPaint C1;
    public float C2;
    public final RectF C3;
    public final Paint C4;
    public final LinearGradient C5;
    public final SweepGradient[] C6;
    public final Matrix C7;
    public float C8;
    public final long D;
    public float D0;
    public final TextPaint D1;
    public float D2;
    public boolean D3;
    public final RectF D4;
    public final Paint D5;
    public float D6;
    public final RectF[] D7;
    public float D8;
    public final Matrix E;
    public long E0;
    public final Path E1;
    public float E2;
    public float E3;
    public final float[] E4;
    public final Path E5;
    public float E6;
    public float E7;
    public float E8;
    public i1 F;
    public boolean F0;
    public final RectF F1;
    public long F2;
    public float F3;
    public final float[] F4;
    public final TextPaint F5;
    public float F6;
    public float F7;
    public float F8;
    public i1 G;
    public float G0;
    public Object G1;
    public long G2;
    public float G3;
    public final float[] G4;
    public Drawable G5;
    public float G6;
    public boolean G7;
    public float G8;
    public long H;
    public final TextPaint H0;
    public Object H1;
    public boolean H2;
    public float H3;
    public final float[] H4;
    public StaticLayout H5;
    public float H6;
    public int H7;
    public float H8;
    public final ArrayList I;
    public String I0;
    public int I1;
    public long I2;
    public float I3;
    public final float[] I4;
    public int I5;
    public float I6;
    public final RectF I7;
    public final Path I8;
    public final HashMap J;
    public String J0;
    public final Drawable J1;
    public float J2;
    public float J3;
    public final long[] J4;
    public final RectF J5;
    public float J6;
    public final HashMap J7;
    public final RectF J8;
    public float K;
    public boolean K0;
    public final Drawable K1;
    public float K2;
    public float K3;
    public int K4;
    public final RectF K5;
    public float K6;
    public final HashMap K7;
    public final RectF K8;
    public float L;
    public final i6 L0;
    public final Drawable L1;
    public float L2;
    public final h1 L3;
    public float L4;
    public final Path L5;
    public boolean L6;
    public int L7;
    public final RectF L8;
    public float M;
    public final float[] M0;
    public final Drawable M1;
    public long M2;
    public float M3;
    public float M4;
    public final float[] M5;
    public long M6;
    public int M7;
    public long M8;
    public float N;
    public final float[] N0;
    public final Drawable N1;
    public long N2;
    public float N3;
    public final Paint N4;
    public float N5;
    public SensorManager N6;
    public float N7;
    public boolean N8;
    public float O;
    public final float[] O0;
    public final Drawable O1;
    public String O2;
    public float O3;
    public final Paint O4;
    public final Matrix O5;
    public final g1 O6;
    public float O7;
    public Bitmap O8;
    public float P;
    public final float[] P0;
    public final Drawable P1;
    public float P2;
    public float P3;
    public final RectF P4;
    public final Matrix P5;
    public float P6;
    public int P7;
    public Bitmap P8;
    public float Q;
    public final float[] Q0;
    public final Drawable Q1;
    public long Q2;
    public float Q3;
    public float Q4;
    public final LinearGradient Q5;
    public float Q6;
    public int Q7;
    public final Paint Q8;
    public boolean R;
    public final float[] R0;
    public final Drawable R1;
    public Bitmap R2;
    public final Path R3;
    public float R4;
    public final LongSparseArray R5;
    public float R6;
    public long R7;
    public final Paint R8;
    public boolean S;
    public final float[] S0;
    public final Drawable S1;
    public final Paint S2;
    public Bitmap S3;
    public boolean S4;
    public final Path S5;
    public float S6;
    public long S7;
    public final RectF S8;
    public boolean T;
    public final float[] T0;
    public final m1 T1;
    public boolean T2;
    public Bitmap T3;
    public boolean T4;
    public boolean T5;
    public long T6;
    public long T7;
    public int T8;
    public boolean U;
    public final float[] U0;
    public final Paint U1;
    public int U2;
    public float U3;
    public float U4;
    public final RectF U5;
    public long U6;
    public final float U7;
    public String U8;
    public long V;
    public final float[] V0;
    public final String V1;
    public boolean V2;
    public float V3;
    public boolean V4;
    public final RectF V5;
    public boolean V6;
    public int V7;
    public boolean V8;
    public long W;
    public final float[] W0;
    public final y1 W1;
    public long W2;
    public float W3;
    public Bitmap W4;
    public final RectF W5;
    public final Matrix W6;
    public long W7;
    public int W8;
    public final float[] X0;
    public final zg0 X1;
    public float X2;
    public final Paint X3;
    public int[] X4;
    public final LinearGradient X5;
    public final Path X6;
    public long X7;
    public long X8;
    public final float[] Y0;
    public final Paint Y1;
    public Bitmap Y2;
    public final int[] Y3;
    public int Y4;
    public final LinearGradient Y5;
    public final RectF Y6;
    public float Y7;
    public zg0 Y8;
    public final float[] Z0;
    public boolean Z1;
    public Bitmap Z2;
    public final int[] Z3;
    public final Paint Z4;
    public final Matrix Z5;
    public final Path Z6;
    public final RectF Z7;
    public zg0 Z8;
    public boolean a;
    public float a0;
    public final byte[] a1;
    public int a2;
    public BitmapShader a3;
    public final float[] a4;
    public final Rect a5;
    public final Paint a6;
    public final Path a7;
    public final TextPaint a8;
    public zg0 a9;
    public final int b;
    public float b0;
    public final boolean[] b1;
    public int b2;
    public final Paint b3;
    public final float[] b4;
    public final RectF b5;
    public float b6;
    public int b7;
    public final TextPaint b8;
    public Object b9;
    public final cb.c c;
    public float c0;
    public int c1;
    public final HashMap c2;
    public final Paint c3;
    public final float[] c4;
    public final int[] c5;
    public long c6;
    public final RectF c7;
    public final TextPaint c8;
    public float c9;
    public String d;
    public float d0;
    public boolean d1;
    public Runnable d2;
    public final Matrix d3;
    public final float[] d4;
    public final float[] d5;
    public long d6;
    public final Matrix d7;
    public TextPaint d8;
    public String d9;
    public String e;
    public float e0;
    public final Random e1;
    public boolean e2;
    public final RectF e3;
    public int e4;
    public final float[] e5;
    public boolean e6;
    public final SparseArray e7;
    public final TextPaint e8;
    public long e9;
    public String f;
    public float f0;
    public float f1;
    public boolean f2;
    public float f3;
    public float[] f4;
    public final float[] f5;
    public boolean f6;
    public final Drawable[] f7;
    public StaticLayout f8;
    public float f9;
    public float g0;
    public float g1;
    public Bitmap g2;
    public boolean g3;
    public float[] g4;
    public final float[] g5;
    public int g6;
    public final RectF g7;
    public int g8;
    public boolean g9;
    public boolean h;
    public float h0;
    public int h1;
    public final int[] h2;
    public boolean h3;
    public float[] h4;
    public final float[] h5;
    public int h6;
    public final RectF h7;
    public boolean h8;
    public float h9;
    public float i0;
    public float i1;
    public v9 i2;
    public int i3;
    public int i4;
    public final boolean[] i5;
    public int i6;
    public final RectF i7;
    public final String i8;
    public float i9;
    public float j0;
    public float j1;
    public final c1 j2;
    public final float[] j3;
    public int j4;
    public int j5;
    public float j6;
    public final RectF j7;
    public final String j8;
    public float j9;
    public VelocityTracker k0;
    public float k1;
    public final d1 k2;
    public final float[] k3;
    public PorterDuffColorFilter k4;
    public float k5;
    public float k6;
    public final RectF k7;
    public i5 k8;
    public final OverScroller k9;
    public float l0;
    public float l1;
    public boolean l2;
    public final int[] l3;
    public int l4;
    public float l5;
    public float l6;
    public boolean l7;
    public zg0 l8;
    public final ViewConfiguration l9;
    public float m0;
    public String m1;
    public long m2;
    public final int[] m3;
    public float m4;
    public StaticLayout m5;
    public float m6;
    public boolean m7;
    public long m8;
    public VelocityTracker m9;
    public j1 n;
    public float n0;
    public int n1;
    public long n2;
    public final float[] n3;
    public float n4;
    public boolean n5;
    public final float[] n6;
    public float n7;
    public boolean n8;
    public boolean n9;
    public float o0;
    public String o1;
    public long o2;
    public final float[] o3;
    public float o4;
    public final float[] o5;
    public final Paint o6;
    public float o7;
    public TLRPC.TL_inputStickerSetShortName o8;
    public boolean o9;
    public float p0;
    public String p1;
    public float p2;
    public float p3;
    public float p4;
    public final float[] p5;
    public float p6;
    public long p7;
    public TLRPC.Document p8;
    public final d1 p9;
    public int q0;
    public final RectF q1;
    public long q2;
    public final double[] q3;
    public float q4;
    public final float[] q5;
    public boolean q6;
    public boolean q7;
    public long q8;
    public final RippleDrawable[] q9;
    public j1 r;
    public long r0;
    public boolean r1;
    public final RectF r2;
    public final double[] r3;
    public float r4;
    public final float[] r5;
    public float r6;
    public float r7;
    public LinearGradient[] r8;
    public int r9;
    public float s;
    public final h s0;
    public float s1;
    public boolean s2;
    public final double[] s3;
    public final long[] s4;
    public final float[] s5;
    public boolean s6;
    public float s7;
    public int[] s8;
    public final Paint s9;
    public g t0;
    public float t1;
    public float t2;
    public int t3;
    public final float[] t4;
    public final float[] t5;
    public Object t6;
    public long t7;
    public final n1 t8;
    public final Path t9;
    public g u0;
    public long u1;
    public String u2;
    public int u3;
    public final float[] u4;
    public final float[] u5;
    public float u6;
    public final RectF u7;
    public int u8;
    public final float[] u9;
    public boolean v0;
    public final ArrayList v1;
    public String v2;
    public float v3;
    public final float[] v4;
    public final float[] v5;
    public int v6;
    public long v7;
    public int v8;
    public final float[] v9;
    public long w;
    public boolean w0;
    public long w1;
    public String w2;
    public float w3;
    public final float[] w4;
    public final float[] w5;
    public int w6;
    public float w7;
    public float w8;
    public final long[] w9;
    public float x;
    public boolean x0;
    public boolean x1;
    public String x2;
    public float x3;
    public final long[] x4;
    public final float[] x5;
    public final SparseIntArray x6;
    public float x7;
    public float x8;
    public final long[] x9;
    public float y;
    public boolean y0;
    public final HashMap y1;
    public final TextPaint y2;
    public boolean y3;
    public final boolean[] y4;
    public final float[] y5;
    public int y6;
    public float y7;
    public final RectF[] y8;
    public final float[] y9;
    public long z0;
    public final Paint z1;
    public String z2;
    public Bitmap z3;
    public final Paint z4;
    public final float[] z5;
    public boolean z6;
    public final RectF z7;
    public long z8;
    public final float[] z9;
    public static final String[] B9 = {"❤️", "🔥", "🎉", "😎", "🚀", "💎", "💙", "✨", "⭐", "🍀", "🐸", "🦄", "🌈", "🍕", "👻", "🍒", "🌸", "⚡", "🏆", "🎁", "👀", "😍", "🥳", "🤩", "🐱", "🐶", "🦋", "🌙", "☀️", "🍓", "🍩", "🎈", "🎮", "🎧", "💜", "🌊"};
    public static final float C9 = (float) Math.atan2(-5.5d, -3.5d);
    public static int G9 = a.b("Black");
    public static int H9 = a.b("Neon Blue");
    public static final int I9 = org.telegram.messenger.g0.L(70.0f);
    public static final float L9 = (float) Math.sin(Math.toRadians(18.0d));
    public static final float M9 = (float) Math.cos(Math.toRadians(18.0d));
    public static final xq R9 = new xq(0.16d, 1.0d, 0.3d, 1.0d);

    /* JADX WARN: Type inference failed for: r11v17, types: [ai.c1] */
    /* JADX WARN: Type inference failed for: r11v18, types: [ai.d1] */
    /* JADX WARN: Type inference failed for: r3v26, types: [ai.d1] */
    public l1(Context context, int i7, String str, String str2, boolean z9, cb.c cVar) {
        super(context);
        g gVar;
        final int i10 = 1;
        this.a = true;
        this.s = 1.0f;
        this.D = AnimationUtils.currentAnimationTimeMillis();
        this.E = new Matrix();
        this.F = new i1();
        this.I = new ArrayList();
        this.J = new HashMap();
        Paint paint = new Paint(3);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        paint.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.M = -1.0f;
        this.s0 = new h();
        this.w0 = true;
        this.x0 = true;
        this.D0 = 0.0f;
        this.G0 = 1.0f;
        this.H0 = new TextPaint(1);
        this.I0 = "";
        this.J0 = "";
        this.M0 = new float[qs.r5];
        this.N0 = new float[qs.r5];
        this.O0 = new float[qs.r5];
        this.P0 = new float[qs.r5];
        this.Q0 = new float[qs.r5];
        this.R0 = new float[qs.r5];
        this.S0 = new float[qs.r5];
        this.T0 = new float[qs.r5];
        this.U0 = new float[qs.r5];
        this.V0 = new float[qs.r5];
        this.W0 = new float[qs.r5];
        this.X0 = new float[qs.r5];
        this.Y0 = new float[qs.r5];
        this.Z0 = new float[qs.r5];
        this.a1 = new byte[qs.r5];
        this.b1 = new boolean[qs.r5];
        this.e1 = new Random();
        final int i11 = 0;
        this.h1 = 0;
        this.q1 = new RectF();
        this.v1 = new ArrayList();
        this.y1 = new HashMap();
        this.z1 = new Paint(1);
        this.A1 = new Paint(1);
        this.B1 = new Paint(1);
        this.C1 = new TextPaint(1);
        this.D1 = new TextPaint(1);
        this.E1 = new Path();
        new Path();
        this.F1 = new RectF();
        this.I1 = -1;
        this.U1 = new Paint(1);
        this.V1 = hd.M0(2131746469, null);
        this.Y1 = new Paint(1);
        this.a2 = 1;
        this.c2 = new HashMap();
        this.h2 = new int[3];
        this.j2 = new ls() { // from class: ai.c1
            @Override // org.telegram.messenger.ls
            public final void didReceivedNotification(int i12, int i13, Object[] objArr) {
                if (objArr.length > 1) {
                    Object obj = objArr[1];
                    l1 l1Var = l1.this;
                    if (obj == l1Var.i2) {
                        l1Var.y0();
                    }
                }
            }
        };
        this.k2 = new Runnable(this) { // from class: ai.d1
            public final /* synthetic */ l1 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                TLRPC.Document document;
                int lastIndexOf;
                int L;
                switch (i11) {
                    case 0:
                        l1 l1Var = this.b;
                        ArrayList arrayList = l1Var.v1;
                        for (int i12 = 0; i12 < Math.min(arrayList.size(), 9); i12++) {
                            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList.get(i12);
                            ArrayList<TL_stars.StarGiftAttribute> arrayList2 = tL_starGiftUnique.attributes;
                            int size = arrayList2.size();
                            int i13 = 0;
                            while (i13 < size) {
                                TL_stars.StarGiftAttribute starGiftAttribute = arrayList2.get(i13);
                                i13++;
                                TL_stars.StarGiftAttribute starGiftAttribute2 = starGiftAttribute;
                                if ((starGiftAttribute2 instanceof TL_stars.starGiftAttributeModel) && (document = ((TL_stars.starGiftAttributeModel) starGiftAttribute2).document) != null) {
                                    l1Var.g0(tL_starGiftUnique.id, document);
                                }
                            }
                            l1Var.m1(tL_starGiftUnique);
                        }
                        break;
                    default:
                        l1 l1Var2 = this.b;
                        ArrayList arrayList3 = l1Var2.I;
                        if (l1Var2.f1 >= 0.5f && l1Var2.h1 == 1 && !l1Var2.o9) {
                            float f10 = l1Var2.h9;
                            float f11 = l1Var2.i9;
                            float width = (l1Var2.getWidth() - org.telegram.messenger.g0.L(28.0f)) / 6.0f;
                            float f12 = l1Var2.j1 + f11;
                            RectF rectF = l1Var2.u7;
                            float L2 = f12 - (rectF.top + org.telegram.messenger.g0.L(16.0f));
                            int i14 = -1;
                            if (L2 >= 0.0f && f10 >= org.telegram.messenger.g0.L(14.0f) && f11 >= rectF.top + org.telegram.messenger.g0.L(8.0f) && (L = (((int) (L2 / width)) * 6) + ((int) ((f10 - org.telegram.messenger.g0.L(14.0f)) / width))) >= 0 && L < 36) {
                                i14 = L;
                            }
                            if (i14 >= 0) {
                                String[] strArr = l1.B9;
                                if (arrayList3.contains(strArr[i14]) && (lastIndexOf = arrayList3.lastIndexOf(strArr[i14])) >= 0) {
                                    arrayList3.remove(lastIndexOf);
                                    l1Var2.c();
                                    l1Var2.i0();
                                    break;
                                }
                            }
                        }
                        break;
                }
            }
        };
        this.p2 = 1.0f;
        this.r2 = new RectF();
        TextPaint textPaint = new TextPaint(1);
        this.y2 = textPaint;
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        this.A2 = -1;
        this.E2 = -1.0f;
        this.L2 = -1.0f;
        this.N2 = -1L;
        this.O2 = "";
        this.P2 = -1.0f;
        this.S2 = new Paint(3);
        this.X2 = 1.0f;
        this.b3 = new Paint(2);
        this.c3 = new Paint(3);
        this.d3 = new Matrix();
        this.e3 = new RectF();
        this.j3 = new float[14];
        this.k3 = new float[14];
        this.l3 = new int[7];
        this.m3 = new int[7];
        this.n3 = new float[15];
        this.o3 = new float[15];
        this.p3 = -1.0f;
        this.q3 = new double[3];
        this.r3 = new double[3];
        this.s3 = new double[3];
        this.t3 = org.telegram.messenger.g0.m;
        this.u3 = org.telegram.messenger.g0.n;
        this.B3 = new Paint(2);
        this.C3 = new RectF();
        this.G3 = 5.0f;
        this.H3 = -0.7071f;
        this.I3 = 0.7071f;
        this.L3 = new h1();
        this.N3 = 1.0f;
        this.P3 = -1.0f;
        this.R3 = new Path();
        this.U3 = -1.0f;
        this.V3 = -1.0f;
        this.W3 = -1.0f;
        Paint paint2 = new Paint(2);
        this.X3 = paint2;
        PorterDuff.Mode mode2 = PorterDuff.Mode.DST_OUT;
        paint2.setXfermode(new PorterDuffXfermode(mode2));
        this.Y3 = new int[1024];
        this.Z3 = new int[1024];
        this.a4 = new float[1024];
        this.b4 = new float[1024];
        this.c4 = new float[1024];
        this.d4 = new float[1024];
        this.j4 = -1;
        this.l4 = -1;
        this.s4 = new long[2048];
        this.t4 = new float[2048];
        this.u4 = new float[2048];
        this.v4 = new float[2048];
        this.w4 = new float[2048];
        this.x4 = new long[2048];
        this.y4 = new boolean[2048];
        Paint paint3 = new Paint(2);
        this.z4 = paint3;
        paint3.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.A4 = (float) Math.random();
        this.B4 = new Paint(2);
        this.C4 = new Paint(2);
        this.D4 = new RectF();
        this.E4 = new float[96];
        this.F4 = new float[96];
        this.G4 = new float[96];
        this.H4 = new float[96];
        this.I4 = new float[96];
        this.J4 = new long[96];
        this.N4 = new Paint(2);
        Paint paint4 = new Paint(2);
        this.O4 = paint4;
        paint4.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.P4 = new RectF();
        this.Q4 = 1.0f;
        this.R4 = 1.0f;
        this.T4 = true;
        this.U4 = 1.0f;
        this.Z4 = new Paint(2);
        this.a5 = new Rect();
        this.b5 = new RectF();
        this.c5 = new int[4];
        this.d5 = new float[4];
        this.e5 = new float[4];
        this.f5 = new float[qs.P3];
        this.g5 = new float[qs.P3];
        this.h5 = new float[qs.P3];
        this.i5 = new boolean[qs.P3];
        this.o5 = new float[qs.P3];
        this.p5 = new float[qs.P3];
        this.q5 = new float[qs.P3];
        this.r5 = new float[qs.P3];
        this.s5 = new float[qs.P3];
        this.t5 = new float[qs.P3];
        this.u5 = new float[qs.P3];
        this.v5 = new float[qs.P3];
        this.w5 = new float[qs.P3];
        this.x5 = new float[qs.P3];
        this.y5 = new float[qs.P3];
        this.z5 = new float[qs.P3];
        this.A5 = new boolean[qs.P3];
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 1.0f, 0.0f, -16777216, 0, tileMode);
        this.C5 = linearGradient;
        Paint paint5 = new Paint(1);
        this.D5 = paint5;
        paint5.setShader(linearGradient);
        paint5.setXfermode(new PorterDuffXfermode(mode2));
        this.E5 = new Path();
        this.F5 = new TextPaint(65);
        this.J5 = new RectF();
        this.K5 = new RectF();
        this.L5 = new Path();
        this.M5 = new float[7];
        this.O5 = new Matrix();
        this.P5 = new Matrix();
        this.Q5 = new LinearGradient(0.0f, 0.0f, 1.0f, 0.0f, new int[]{16777215, -1, 16777215}, new float[]{0.0f, 0.88f, 1.0f}, tileMode);
        this.R5 = new LongSparseArray();
        this.S5 = new Path();
        this.U5 = new RectF();
        this.V5 = new RectF();
        this.W5 = new RectF();
        this.X5 = new LinearGradient(0.0f, 0.0f, 1.0f, 0.0f, 16777215, -1, tileMode);
        this.Y5 = new LinearGradient(0.0f, 0.0f, 1.0f, 0.0f, -1, 16777215, tileMode);
        this.Z5 = new Matrix();
        this.a6 = new Paint();
        this.l6 = 0.85f;
        this.n6 = new float[qs.r5];
        Paint paint6 = new Paint();
        this.o6 = paint6;
        PorterDuff.Mode mode3 = PorterDuff.Mode.DST_IN;
        paint6.setXfermode(new PorterDuffXfermode(mode3));
        this.p6 = 1.0f;
        this.q6 = true;
        this.u6 = -1.0f;
        this.v6 = -1;
        this.x6 = new SparseIntArray();
        this.y6 = -1;
        this.B6 = -1;
        this.C6 = new SweepGradient[4];
        this.O6 = new g1(this);
        this.W6 = new Matrix();
        this.X6 = new Path();
        this.Y6 = new RectF();
        this.Z6 = new Path();
        this.a7 = new Path();
        this.b7 = -1;
        this.c7 = new RectF();
        this.d7 = new Matrix();
        this.e7 = new SparseArray();
        this.g7 = new RectF();
        this.h7 = new RectF();
        this.i7 = new RectF();
        this.j7 = new RectF();
        this.k7 = new RectF();
        this.n7 = 1.0f;
        this.o7 = 1.0f;
        this.r7 = 1.0f;
        this.s7 = 1.0f;
        this.u7 = new RectF();
        this.z7 = new RectF();
        LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, new int[]{0, 805306368, -1627389952, -285212672, -16777216}, new float[]{0.0f, 0.25f, 0.5f, 0.75f, 1.0f}, tileMode);
        this.A7 = linearGradient2;
        Paint paint7 = new Paint();
        this.B7 = paint7;
        paint7.setXfermode(new PorterDuffXfermode(mode3));
        paint7.setShader(linearGradient2);
        this.C7 = new Matrix();
        this.D7 = new RectF[]{new RectF(), new RectF(), new RectF(), new RectF(), new RectF(), new RectF()};
        this.E7 = -1.0f;
        this.F7 = -1.0f;
        this.I7 = new RectF();
        this.J7 = new HashMap();
        this.K7 = new HashMap();
        this.L7 = -1;
        this.M7 = G9;
        this.P7 = -1;
        this.Q7 = -1;
        this.U7 = org.telegram.messenger.g0.L(20.17f);
        this.V7 = -1;
        this.X7 = -1L;
        this.Y7 = 1.0f;
        this.Z7 = new RectF();
        this.a8 = new TextPaint(1);
        this.b8 = new TextPaint(1);
        this.c8 = new TextPaint(1);
        TextPaint textPaint2 = new TextPaint(qs.N1);
        this.e8 = textPaint2;
        textPaint2.setXfermode(new PorterDuffXfermode(mode2));
        this.i8 = hd.M0(2131746491, null);
        this.j8 = hd.M0(2131746501, null);
        int[] iArr = a.b;
        this.r8 = new LinearGradient[iArr.length];
        this.s8 = new int[iArr.length];
        this.t8 = new n1(0);
        this.u8 = -100;
        this.v8 = -100;
        this.y8 = new RectF[]{new RectF(), new RectF(), new RectF()};
        this.I8 = new Path();
        this.J8 = new RectF();
        this.K8 = new RectF();
        this.L8 = new RectF();
        this.Q8 = new Paint(3);
        this.R8 = new Paint(1);
        this.S8 = new RectF();
        this.c9 = -1.0f;
        this.k9 = new OverScroller(getContext());
        this.l9 = ViewConfiguration.get(getContext());
        this.p9 = new Runnable(this) { // from class: ai.d1
            public final /* synthetic */ l1 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                TLRPC.Document document;
                int lastIndexOf;
                int L;
                switch (i10) {
                    case 0:
                        l1 l1Var = this.b;
                        ArrayList arrayList = l1Var.v1;
                        for (int i12 = 0; i12 < Math.min(arrayList.size(), 9); i12++) {
                            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList.get(i12);
                            ArrayList<TL_stars.StarGiftAttribute> arrayList2 = tL_starGiftUnique.attributes;
                            int size = arrayList2.size();
                            int i13 = 0;
                            while (i13 < size) {
                                TL_stars.StarGiftAttribute starGiftAttribute = arrayList2.get(i13);
                                i13++;
                                TL_stars.StarGiftAttribute starGiftAttribute2 = starGiftAttribute;
                                if ((starGiftAttribute2 instanceof TL_stars.starGiftAttributeModel) && (document = ((TL_stars.starGiftAttributeModel) starGiftAttribute2).document) != null) {
                                    l1Var.g0(tL_starGiftUnique.id, document);
                                }
                            }
                            l1Var.m1(tL_starGiftUnique);
                        }
                        break;
                    default:
                        l1 l1Var2 = this.b;
                        ArrayList arrayList3 = l1Var2.I;
                        if (l1Var2.f1 >= 0.5f && l1Var2.h1 == 1 && !l1Var2.o9) {
                            float f10 = l1Var2.h9;
                            float f11 = l1Var2.i9;
                            float width = (l1Var2.getWidth() - org.telegram.messenger.g0.L(28.0f)) / 6.0f;
                            float f12 = l1Var2.j1 + f11;
                            RectF rectF = l1Var2.u7;
                            float L2 = f12 - (rectF.top + org.telegram.messenger.g0.L(16.0f));
                            int i14 = -1;
                            if (L2 >= 0.0f && f10 >= org.telegram.messenger.g0.L(14.0f) && f11 >= rectF.top + org.telegram.messenger.g0.L(8.0f) && (L = (((int) (L2 / width)) * 6) + ((int) ((f10 - org.telegram.messenger.g0.L(14.0f)) / width))) >= 0 && L < 36) {
                                i14 = L;
                            }
                            if (i14 >= 0) {
                                String[] strArr = l1.B9;
                                if (arrayList3.contains(strArr[i14]) && (lastIndexOf = arrayList3.lastIndexOf(strArr[i14])) >= 0) {
                                    arrayList3.remove(lastIndexOf);
                                    l1Var2.c();
                                    l1Var2.i0();
                                    break;
                                }
                            }
                        }
                        break;
                }
            }
        };
        this.q9 = new RippleDrawable[12];
        ColorStateList.valueOf(738197503);
        ColorStateList.valueOf(335544320);
        this.r9 = -1;
        this.s9 = new Paint(1);
        this.t9 = new Path();
        this.u9 = new float[12];
        this.v9 = new float[12];
        this.w9 = new long[12];
        this.x9 = new long[12];
        this.y9 = new float[12];
        this.z9 = new float[12];
        this.A9 = new Rect[12];
        for (int i12 = 0; i12 < 12; i12++) {
            this.A9[i12] = new Rect();
        }
        this.b = i7;
        this.d = str;
        this.f = str2;
        this.h = z9;
        this.c = cVar;
        this.L1 = w(R.drawable.msg_share);
        this.M1 = w(R.drawable.msg_download);
        this.N1 = w(R.drawable.msg_qr_scan);
        this.U1.setTypeface(org.telegram.messenger.g0.o());
        Drawable w10 = w(R.drawable.msg_colors);
        this.O1 = w10;
        Drawable w11 = w(R.drawable.input_smile);
        this.P1 = w11;
        Drawable w12 = w(R.drawable.menu_gift);
        this.Q1 = w12;
        this.W1 = new y1(true);
        this.R1 = w(R.drawable.msg_retry);
        this.S1 = w(R.drawable.msg_recent);
        this.T1 = new m1();
        this.J1 = w(R.drawable.msg_copy);
        this.K1 = w(R.drawable.menu_premium_main);
        this.f7 = new Drawable[]{w10, w11, w12};
        zg0 zg0Var = new zg0(R.raw.plane_logo_plain, org.telegram.messenger.g0.L(60.0f), org.telegram.messenger.g0.L(60.0f), false, null);
        this.X1 = zg0Var;
        zg0Var.R(this);
        zg0Var.K(1);
        zg0Var.setCallback(this);
        zg0Var.start();
        Paint paint8 = this.Y1;
        Paint.Style style = Paint.Style.STROKE;
        paint8.setStyle(style);
        this.Y1.setStrokeCap(Paint.Cap.ROUND);
        this.Y1.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.C1.setTextSize(org.telegram.messenger.g0.L(11.0f));
        this.D1.setTypeface(org.telegram.messenger.g0.o());
        this.A1.setStyle(style);
        i6 i6Var = new i6(false, true, true);
        this.L0 = i6Var;
        i6Var.w(org.telegram.messenger.g0.L(11.0f));
        i6Var.n(0.35f, 280L, xq.h);
        i6Var.setCallback(this);
        i6Var.b = 3;
        j1 t6 = t(G9);
        this.n = t6;
        this.b7 = W0(t6.c);
        if (str != null) {
            String str3 = this.d;
            if (!str3.equals(J9) || (gVar = K9) == null) {
                g c10 = h.c(str3, org.telegram.messenger.g0.L(240.0f), gc.b.c, 0.75f, null);
                this.t0 = c10;
                K9 = c10;
                J9 = str3;
            } else {
                this.t0 = gVar;
            }
            this.s0.a(this.t0);
        }
        u1(false);
    }

    public static void C0(double d, double d2, double d10, double[] dArr) {
        double d11 = (0.2158037573d * d10) + (0.3963377774d * d2) + d;
        double d12 = (d - (0.1055613458d * d2)) - (0.0638541728d * d10);
        double d13 = (d - (d2 * 0.0894841775d)) - (d10 * 1.291485548d);
        double d14 = d11 * d11 * d11;
        double d15 = d12 * d12 * d12;
        double d16 = d13 * d13 * d13;
        dArr[0] = (0.2309699292d * d16) + ((4.0767416621d * d14) - (3.3077115913d * d15));
        dArr[1] = ((2.6097574011d * d15) + ((-1.2684380046d) * d14)) - (0.3413193965d * d16);
        dArr[2] = (d16 * 1.707614701d) + ((d14 * (-0.0041960863d)) - (d15 * 0.7034186147d));
    }

    public static int D0(float f10, float f11, float f12, int i7) {
        float i12 = i1(Color.red(i7));
        float i13 = i1(Color.green(i7));
        float i14 = i1(Color.blue(i7));
        float cbrt = (float) Math.cbrt((0.051445995f * i14) + (0.53633255f * i13) + (0.41222146f * i12));
        float cbrt2 = (float) Math.cbrt((0.10739696f * i14) + (0.6806995f * i13) + (0.2119035f * i12));
        float cbrt3 = (float) Math.cbrt((i14 * 0.6299787f) + (i13 * 0.28171885f) + (i12 * 0.08830246f));
        float f13 = (0.4505937f * cbrt3) + ((1.9779985f * cbrt) - (2.4285922f * cbrt2));
        float f14 = ((cbrt2 * 0.78277177f) + (cbrt * 0.025904037f)) - (cbrt3 * 0.80867577f);
        float hypot = (float) Math.hypot(f13, f14);
        float min = hypot > 1.0E-5f ? Math.min(f12, f11 * hypot) / hypot : 0.0f;
        float f15 = f13 * min;
        float f16 = f14 * min;
        float f17 = (0.21580376f * f16) + (0.39633778f * f15) + f10;
        float f18 = (f10 - (0.105561346f * f15)) - (0.06385417f * f16);
        float f19 = (f10 - (f15 * 0.08948418f)) - (f16 * 1.2914855f);
        float f20 = f17 * f17 * f17;
        float f21 = f18 * f18 * f18;
        float f22 = f19 * f19 * f19;
        return Color.rgb(w0((0.23096994f * f22) + ((4.0767417f * f20) - (3.3077116f * f21))), w0(((2.6097574f * f21) + ((-1.268438f) * f20)) - (0.34131938f * f22)), w0((f22 * 1.7076147f) + ((f20 * (-0.0041960864f)) - (f21 * 0.7034186f))));
    }

    public static float S(float f10, float f11) {
        float f12 = f10 - 1.0f;
        return com.google.android.recaptcha.internal.a.x(f11, f12, f12, ((f11 + 1.0f) * f12 * f12 * f12) + 1.0f);
    }

    public static int W0(int i7) {
        double[] dArr = new double[3];
        double[] dArr2 = new double[3];
        o1(i7, dArr);
        double hypot = Math.hypot(dArr[1], dArr[2]);
        if (hypot < 0.03d) {
            return -1;
        }
        b0(0.96d, Math.min(0.06d, hypot * 0.7d), Math.atan2(dArr[2], dArr[1]), dArr2);
        return Color.rgb((int) Math.round(r(d0(r(dArr2[0]))) * 255.0d), (int) Math.round(r(d0(r(dArr2[1]))) * 255.0d), (int) Math.round(r(d0(r(dArr2[2]))) * 255.0d));
    }

    public static int Z0(int i7) {
        double[] dArr = new double[3];
        i0.a.j(i7, dArr);
        return i0.a.o(i0.a.b(Math.min(96.0d, dArr[0] + 24.0d), dArr[1] * 0.75d, dArr[2] * 0.75d), 26);
    }

    public static int a(float f10, int i7) {
        return i0.a.o(i7, (int) (Utilities.l(f10) * Color.alpha(i7)));
    }

    public static void b0(double d, double d2, double d10, double[] dArr) {
        double cos = Math.cos(d10);
        double sin = Math.sin(d10);
        C0(d, d2 * cos, d2 * sin, dArr);
        if (p0(dArr)) {
            return;
        }
        double d11 = 0.0d;
        double d12 = d2;
        for (int i7 = 0; i7 < 14; i7++) {
            double d13 = (d11 + d12) / 2.0d;
            C0(d, d13 * cos, d13 * sin, dArr);
            if (p0(dArr)) {
                d11 = d13;
            } else {
                d12 = d13;
            }
        }
        C0(d, d11 * cos, d11 * sin, dArr);
    }

    public static float c0(double d) {
        return (float) (d - Math.floor(d));
    }

    public static double d0(double d) {
        return d <= 0.0031308d ? d * 12.92d : (Math.pow(d, 0.4166666666666667d) * 1.055d) - 0.055d;
    }

    public static int e1(int i7) {
        if (a.h != null) {
            return i7;
        }
        if (a.g == null) {
            int length = a.a.length;
            int[] iArr = new int[length];
            boolean[] zArr = new boolean[length];
            int i10 = 0;
            for (int i11 = 0; i11 < 80; i11++) {
                int b10 = a.b(a.f[i11]);
                if (b10 >= 0 && !zArr[b10]) {
                    zArr[b10] = true;
                    iArr[i10] = b10;
                    i10++;
                }
            }
            for (int i12 = 0; i12 < length; i12++) {
                if (!zArr[i12]) {
                    iArr[i10] = i12;
                    i10++;
                }
            }
            a.g = iArr;
        }
        return a.g[i7];
    }

    public static float f1(boolean z9, boolean z10, float f10) {
        if (!z9) {
            if (!z10) {
                f10 -= 0.135f;
            }
            if (f10 <= 0.0f) {
                return 0.0f;
            }
            if (f10 < 0.315f) {
                return h(f10 / 0.315f);
            }
        } else if (f10 > 0.0f) {
            return org.telegram.ui.Cells.f1.v(f10, 0.18f, 1.0f, 0.0f);
        }
        return 1.0f;
    }

    public static int g(float f10, int i7) {
        return (((int) (Math.max(0.0f, Math.min(1.0f, f10)) * 255.0f)) << 24) | (i7 & 16777215);
    }

    public static float g1(float f10, float f11, float f12) {
        float l10 = Utilities.l((f12 - f10) / (f11 - f10));
        return com.google.android.recaptcha.internal.a.C(l10, 2.0f, 3.0f, l10 * l10);
    }

    public static float h(float f10) {
        float f11 = f10 - 1.0f;
        return com.google.android.recaptcha.internal.a.x(f11, 1.70158f, f11, (2.70158f * f11 * f11 * f11) + 1.0f);
    }

    public static double h1(double d, double d2, double d10) {
        if (d <= 0.0d) {
            return 0.0d;
        }
        double d11 = 6.283185307179586d / d10;
        double d12 = 1.0d - (d2 * d2);
        double sqrt = Math.sqrt(d12) * d11;
        double d13 = sqrt * d;
        return 1.0d - (((Math.sin(d13) * (d2 / Math.sqrt(d12))) + Math.cos(d13)) * Math.exp(((-d2) * d11) * d));
    }

    public static boolean i() {
        return a0.f() && rc.e(256);
    }

    public static float i1(int i7) {
        float f10 = i7 / 255.0f;
        return f10 <= 0.04045f ? f10 / 12.92f : (float) Math.pow((f10 + 0.055f) / 1.055f, 2.4000000953674316d);
    }

    public static float j(long j3, float f10, float f11) {
        if (j3 == 0) {
            return 1.0f;
        }
        float currentAnimationTimeMillis = (AnimationUtils.currentAnimationTimeMillis() - j3) / 320.0f;
        if (currentAnimationTimeMillis <= 0.0f || currentAnimationTimeMillis >= 1.0f) {
            return 1.0f;
        }
        if (currentAnimationTimeMillis < 0.25f) {
            return (f10 * ((float) Math.sin((currentAnimationTimeMillis * 1.5707963267948966d) / 0.25d))) + 1.0f;
        }
        if (currentAnimationTimeMillis < 0.6f) {
            float f12 = (currentAnimationTimeMillis - 0.25f) / 0.35f;
            return org.telegram.messenger.g0.T1(f10 + 1.0f, 1.0f - f11, com.google.android.recaptcha.internal.a.C(f12, 2.0f, 3.0f, f12 * f12));
        }
        float f13 = (currentAnimationTimeMillis - 0.6f) / 0.4f;
        return org.telegram.messenger.g0.T1(1.0f - f11, 1.0f, com.google.android.recaptcha.internal.a.C(f13, 2.0f, 3.0f, f13 * f13));
    }

    public static void k() {
        if (D9 != null) {
            return;
        }
        int length = a.b.length;
        D9 = new int[length];
        E9 = new int[length];
        F9 = new int[length];
        for (int i7 = 0; i7 < length; i7++) {
            D9[i7] = x(a.b[i7], false);
            E9[i7] = x(a.c[i7], true);
            F9[i7] = v(D9[i7], E9[i7]);
        }
    }

    public static float k0(int i7, int i10, int i11) {
        int i12 = (i11 * 1442695041) + (i10 * 668265263) + (i7 * 374761393);
        int i13 = ((i12 >>> 13) ^ i12) * 1274126177;
        return ((i13 ^ (i13 >>> 16)) & 65535) / 65535.0f;
    }

    public static int l1(int i7, int i10) {
        int i11 = i7 | (-16777216);
        int i12 = i10 | (-16777216);
        if (i0.a.g(i11, i12) < 1.15d) {
            double[] dArr = new double[3];
            i0.a.j(i11, dArr);
            for (int i13 = 0; i13 < 40 && i0.a.g(i11, i12) < 1.15d; i13++) {
                double max = Math.max(0.0d, dArr[0] - 2.0d);
                dArr[0] = max;
                i11 = i0.a.b(max, dArr[1], dArr[2]);
            }
        }
        return i0.a.o(i11, 95);
    }

    public static boolean m0(RectF rectF, float f10, float f11) {
        float L = org.telegram.messenger.g0.L(8.0f);
        return !rectF.isEmpty() && f10 >= rectF.left - L && f10 <= rectF.right + L && f11 >= rectF.top - L && f11 <= rectF.bottom + L;
    }

    public static void o1(int i7, double[] dArr) {
        double v02 = v0(Color.red(i7) / 255.0d);
        double v03 = v0(Color.green(i7) / 255.0d);
        double v04 = v0(Color.blue(i7) / 255.0d);
        double cbrt = Math.cbrt((0.0514459929d * v04) + (0.5363325363d * v03) + (0.4122214708d * v02));
        double cbrt2 = Math.cbrt((0.1073969566d * v04) + (0.6806995451d * v03) + (0.2119034982d * v02));
        double cbrt3 = Math.cbrt((v04 * 0.6299787005d) + (v03 * 0.2817188376d) + (v02 * 0.0883024619d));
        dArr[0] = ((0.793617785d * cbrt2) + (0.2104542553d * cbrt)) - (0.0040720468d * cbrt3);
        dArr[1] = (0.4505937099d * cbrt3) + ((1.9779984951d * cbrt) - (2.428592205d * cbrt2));
        dArr[2] = ((cbrt2 * 0.7827717662d) + (cbrt * 0.0259040371d)) - (cbrt3 * 0.808675766d);
    }

    public static boolean p0(double[] dArr) {
        double d = dArr[0];
        if (d >= -1.0E-4d && d <= 1.0001d) {
            double d2 = dArr[1];
            if (d2 >= -1.0E-4d && d2 <= 1.0001d) {
                double d10 = dArr[2];
                if (d10 >= -1.0E-4d && d10 <= 1.0001d) {
                    return true;
                }
            }
        }
        return false;
    }

    public static Bitmap q0(Bitmap bitmap, Bitmap bitmap2, int i7) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i10 = width * height;
        int[] iArr = new int[i10];
        bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
        int i11 = 16777215 & i7;
        int i12 = i7 >>> 24;
        for (int i13 = 0; i13 < i10; i13++) {
            iArr[i13] = ((((iArr[i13] >>> 24) * i12) / qs.e4) << 24) | i11;
        }
        if (bitmap2 == null || !bitmap2.isMutable() || bitmap2.getWidth() != width || bitmap2.getHeight() != height) {
            bitmap2 = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        }
        Bitmap bitmap3 = bitmap2;
        bitmap3.setPixels(iArr, 0, width, 0, 0, width, height);
        bitmap3.setHasMipMap(bitmap.hasMipMap());
        return bitmap3;
    }

    public static double r(double d) {
        if (d < 0.0d) {
            return 0.0d;
        }
        if (d > 1.0d) {
            return 1.0d;
        }
        return d;
    }

    public static Bitmap r0(i1 i1Var, Bitmap bitmap, boolean z9) {
        if (z9) {
            Bitmap bitmap2 = i1Var.m;
            if (bitmap2 == null || i1Var.n != bitmap || i1Var.p != i1Var.j) {
                i1Var.m = q0(bitmap, bitmap2, i1Var.j);
                i1Var.n = bitmap;
                i1Var.p = i1Var.j;
            }
            return i1Var.m;
        }
        Bitmap bitmap3 = i1Var.k;
        if (bitmap3 == null || i1Var.l != bitmap || i1Var.o != i1Var.j) {
            i1Var.k = q0(bitmap, bitmap3, i1Var.j);
            i1Var.l = bitmap;
            i1Var.o = i1Var.j;
        }
        return i1Var.k;
    }

    public static void s(int[] iArr, byte[] bArr, int i7) {
        int i10 = 16777215 & i7;
        int i11 = i7 >>> 24;
        for (int i12 = 0; i12 < iArr.length; i12++) {
            iArr[i12] = ((((bArr[i12] & qs.e4) * i11) / qs.e4) << 24) | i10;
        }
    }

    private void setPattern(i1 i1Var) {
        if (!this.f2) {
            i1Var.h = this.s < 1.0f && this.r != null;
            if (i1Var.a == 2) {
                Z(i1Var);
                if (i1Var.e == null) {
                    i1Var.f = this.g2;
                }
            }
            i1 i1Var2 = this.G;
            if (i1Var2 != null && i1Var2 != this.F) {
                P0(i1Var2);
            }
            this.G = this.F;
            this.F = i1Var;
            this.H = AnimationUtils.currentAnimationTimeMillis();
            invalidate();
            return;
        }
        i1 i1Var3 = this.G;
        if (i1Var3 != null && i1Var3 != this.F) {
            P0(i1Var3);
        }
        i1 i1Var4 = this.F;
        if (i1Var4 != i1Var) {
            P0(i1Var4);
        }
        this.G = null;
        this.F = i1Var;
        if (i1Var.a == 2) {
            Z(i1Var);
            if (i1Var.e == null) {
                i1Var.f = this.g2;
            }
        }
        this.H = AnimationUtils.currentAnimationTimeMillis() - 10000;
        invalidate();
    }

    private void setSceneFromCard(j1 j1Var) {
        Y0(j1Var, getWidth() / 2.0f, (l() / 2.0f) + m());
        if (this.f2) {
            return;
        }
        this.p2 = j(this.n2, 0.03f, 0.005f);
        this.n2 = AnimationUtils.currentAnimationTimeMillis();
    }

    public static j1 t(int i7) {
        j1 j1Var = new j1();
        j1Var.a = 0;
        j1Var.f = i7;
        if (i7 == H9) {
            j1Var.b = -12602881;
            j1Var.c = -15308082;
            j1Var.d = a.d[i7];
        } else {
            j1Var.b = x(a.b[i7], false);
            j1Var.c = x(a.c[i7], true);
            j1Var.d = a.d[i7];
        }
        if (i7 == H9) {
            j1Var.e = -16747023;
        } else {
            k();
            j1Var.e = F9[i7];
        }
        j1Var.h = Z0(j1Var.b);
        j1Var.g = h.k(0.5f, j1Var.b, j1Var.c);
        return j1Var;
    }

    public static float t1(float f10, float f11, float f12) {
        float N = (f10 - f12) / org.telegram.messenger.g0.N(1.7f);
        float N2 = f11 / org.telegram.messenger.g0.N(3.2f);
        return org.telegram.messenger.g0.N(3.6f) * (((w1(N * 2.6f, N2 * 1.7f, 91) * 0.32f) + (w1(N, N2, 17) * 0.68f)) - 0.5f);
    }

    public static int u(j1 j1Var) {
        int f10 = j1Var != null ? i0.a.f(0.5f, j1Var.b, j1Var.c) : -16777216;
        double h = j1Var != null ? i0.a.h(j1Var.b) : 0.3d;
        float[] fArr = o1.b;
        float max = (fArr[10] / 100.0f) * ((float) Math.max(0.0d, Math.min(1.0d, (0.85d - h) / 0.45d)));
        float f11 = (fArr[11] / 100.0f) + 1.0f;
        float f12 = ((0.5f - (f11 * 0.5f)) + max) * 255.0f;
        return i0.a.k(j1Var != null ? j1Var.h : TLObject.FLAG_30, i0.a.k(g((fArr[3] + fArr[9]) / 100.0f, 16777215), Color.rgb(Math.max(0, Math.min(qs.e4, Math.round((Color.red(f10) * f11) + f12))), Math.max(0, Math.min(qs.e4, Math.round((Color.green(f10) * f11) + f12))), Math.max(0, Math.min(qs.e4, Math.round((f11 * Color.blue(f10)) + f12))))));
    }

    public static double u0(int i7, int i10) {
        long j3 = (i10 * (-4417276706812531889L)) ^ (i7 * (-7046029254386353131L));
        long j10 = (j3 ^ (j3 >>> 31)) * (-4658895280553007687L);
        long j11 = (j10 ^ (j10 >>> 27)) * (-7723592293110705685L);
        return ((j11 ^ (j11 >>> 31)) >>> 11) / 9.007199254740992E15d;
    }

    public static int v(int i7, int i10) {
        double d;
        double atan2;
        double min;
        double[] dArr = new double[3];
        double[] dArr2 = new double[3];
        double[] dArr3 = new double[3];
        o1(i10, dArr);
        o1(i7, dArr2);
        double d2 = dArr[0];
        double d10 = d2 < 0.45d ? d2 - 0.03d : 2.0d;
        double hypot = Math.hypot(dArr[1], dArr[2]);
        if (hypot < 0.03d) {
            double d11 = (dArr[1] * 0.6d) + (dArr2[1] * 0.4d);
            double d12 = (dArr[2] * 0.6d) + (dArr2[2] * 0.4d);
            atan2 = Math.atan2(d12, d11);
            d = 2.0d;
            min = Math.min(0.012d, Math.hypot(d11, d12));
        } else {
            d = 2.0d;
            atan2 = Math.atan2(dArr[2], dArr[1]);
            min = Math.min((hypot * 1.25d) + 0.02d, 0.2d);
        }
        double d13 = 0.9d;
        double d14 = 0.2d;
        int i11 = 0;
        while (i11 < 12) {
            double d15 = (d14 + d13) / d;
            double d16 = atan2;
            double d17 = min;
            b0(d15, d17, d16, dArr3);
            if (1.05d / (((r(dArr3[2]) * 0.0722d) + ((r(dArr3[1]) * 0.7152d) + (r(dArr3[0]) * 0.2126d))) + 0.05d) > 4.4d) {
                d14 = d15;
            } else {
                d13 = d15;
            }
            i11++;
            min = d17;
            atan2 = d16;
        }
        double d18 = atan2;
        double d19 = min;
        double d20 = (d14 + d13) / d;
        if (d20 > d10) {
            d20 = Math.max(0.05d, d10);
        }
        b0(d20, d19, d18, dArr3);
        return Color.rgb((int) Math.round(r(d0(r(dArr3[0]))) * 255.0d), (int) Math.round(r(d0(r(dArr3[1]))) * 255.0d), (int) Math.round(r(d0(r(dArr3[2]))) * 255.0d));
    }

    public static double v0(double d) {
        return d <= 0.04045d ? d / 12.92d : Math.pow((d + 0.055d) / 1.055d, 2.4d);
    }

    public static float v1(float f10) {
        int floor = (int) Math.floor(f10);
        float f11 = f10 - floor;
        float C = com.google.android.recaptcha.internal.a.C(f11, 2.0f, 3.0f, f11 * f11);
        float c02 = c0(Math.sin(floor * 127.1d) * 43758.5453d);
        return ((c0(Math.sin((floor + 1) * 127.1d) * 43758.5453d) - c02) * C) + c02;
    }

    public static int w0(float f10) {
        float max = Math.max(0.0f, Math.min(1.0f, f10));
        return Math.round(Math.max(0.0f, Math.min(1.0f, max <= 0.0031308f ? max * 12.92f : (((float) Math.pow(max, 0.4166666567325592d)) * 1.055f) - 0.055f)) * 255.0f);
    }

    public static float w1(float f10, float f11, int i7) {
        int floor = (int) Math.floor(f10);
        int floor2 = (int) Math.floor(f11);
        float f12 = f10 - floor;
        float f13 = f11 - floor2;
        float C = com.google.android.recaptcha.internal.a.C(f12, 2.0f, 3.0f, f12 * f12);
        float C2 = com.google.android.recaptcha.internal.a.C(f13, 2.0f, 3.0f, f13 * f13);
        float k02 = k0(floor, floor2, i7);
        int i10 = floor + 1;
        float k03 = k0(i10, floor2, i7);
        int i11 = floor2 + 1;
        float k04 = k0(floor, i11, i7);
        float k05 = k0(i10, i11, i7);
        float z9 = com.google.android.recaptcha.internal.a.z(k03, k02, C, k02);
        return (((((k05 - k04) * C) + k04) - z9) * C2) + z9;
    }

    public static int x(int i7, boolean z9) {
        double[] dArr = new double[3];
        i0.a.j(i7, dArr);
        if (!z9) {
            return i7;
        }
        double max = Math.max(0.0d, dArr[0] - 3.0d);
        dArr[0] = max;
        double d = dArr[1] * 1.03d;
        dArr[1] = d;
        double d2 = dArr[2] * 1.03d;
        dArr[2] = d2;
        return i0.a.b(max, d, d2);
    }

    public static PorterDuffColorFilter x0(i1 i1Var) {
        float[] fArr = o1.b;
        int i7 = ((int) (fArr[14] * 10.0f)) ^ i1Var.s;
        if (i1Var.u == null || i1Var.t != i7) {
            i1Var.t = i7;
            i1Var.u = new PorterDuffColorFilter(i0.a.f(fArr[14] / 100.0f, i1Var.s, -1), PorterDuff.Mode.SRC_IN);
        }
        return i1Var.u;
    }

    public static float y1(float f10) {
        return 1.0f - ((float) Math.pow(1.0f - f10, 2.4000000953674316d));
    }

    /* JADX WARN: Code restructure failed: missing block: B:255:0x0250, code lost:
    
        if (r4 > 1500) goto L50;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x06ee  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0857  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0a51  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x06e8  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0815  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x044e  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0616  */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r15v15, types: [int] */
    /* JADX WARN: Type inference failed for: r15v37 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A(Canvas canvas, int i7) {
        int i10;
        int i11;
        Bitmap bitmap;
        float f10;
        int i12;
        float f11;
        long currentTimeMillis;
        float l10;
        float f12;
        float x10;
        float f13;
        int i13;
        TextPaint textPaint;
        StaticLayout staticLayout;
        String str;
        int i14;
        float f14;
        int i15;
        StaticLayout staticLayout2;
        float f15;
        float f16;
        float f17;
        int i16;
        int i17;
        float[] fArr;
        float[] fArr2;
        float[] fArr3;
        float f18;
        int i18;
        float pow;
        float[] fArr4;
        int i19;
        int i20;
        float[] fArr5;
        RectF rectF;
        float f19;
        char c10;
        float f20;
        float f21;
        boolean z9;
        int i21;
        boolean[] zArr;
        int i22;
        int i23;
        int i24;
        Canvas canvas2 = canvas;
        canvas2.save();
        float T1 = this.Q4 >= 1.0f ? 1.0f : this.T4 ? org.telegram.messenger.g0.T1(0.9f, 1.0f, this.U4) : org.telegram.messenger.g0.T1(0.92f, 1.0f, this.U4);
        float l11 = 1.0f - (this.n2 == 0 ? 1.0f : Utilities.l((AnimationUtils.currentAnimationTimeMillis() - this.n2) / 320.0f));
        float j3 = (((this.p2 - 1.0f) * l11 * l11) + j(this.n2, 0.03f, 0.005f)) * T1;
        if (this.r0 != 0) {
            float currentAnimationTimeMillis = (AnimationUtils.currentAnimationTimeMillis() - this.r0) / 360.0f;
            if (currentAnimationTimeMillis >= 1.0f) {
                this.r0 = 0L;
            } else if (currentAnimationTimeMillis > 0.0f) {
                j3 *= 1.0f - ((1.0f - (currentAnimationTimeMillis * 0.3f)) * (((float) Math.sin(currentAnimationTimeMillis * 3.141592653589793d)) * 0.03f));
            }
        }
        float f22 = i7;
        canvas2.scale(j3, j3, f22 / 2.0f, (l() / 2.0f) + m());
        float width = getWidth() * 0.745f;
        float l12 = l();
        float f23 = (f22 - width) / 2.0f;
        float m10 = m();
        float f24 = f23 + width;
        float f25 = l12 + m10;
        this.F1.set(f23, m10, f24, f25);
        this.B1.setColor(-1);
        RectF rectF2 = this.F1;
        int o4 = i0.a.o(i0.a.f(0.4f, N0(), -16777216), 16);
        Bitmap bitmap2 = this.W4;
        int i25 = 3;
        if (bitmap2 == null) {
            K0();
            i10 = 0;
            i11 = 1;
        } else {
            i10 = 0;
            byte[] bArr = N9;
            int i26 = O9;
            i11 = 1;
            if (o4 != this.Y4) {
                this.Y4 = o4;
                s(this.X4, bArr, o4);
                bitmap2.setPixels(this.X4, 0, i26, 0, 0, i26, i26);
                bitmap = bitmap2;
            } else {
                bitmap = bitmap2;
            }
            float f26 = P9 * 4.0f;
            float f27 = Q9 * 4.0f;
            float L = org.telegram.messenger.g0.L(4.0f);
            int[] iArr = this.c5;
            iArr[0] = 0;
            int i27 = Q9;
            iArr[1] = i27;
            iArr[2] = i26 - i27;
            iArr[3] = i26;
            float[] fArr6 = this.d5;
            float f28 = rectF2.left - f26;
            fArr6[0] = f28;
            fArr6[1] = f28 + f27;
            float f29 = rectF2.right + f26;
            fArr6[3] = f29;
            fArr6[2] = f29 - f27;
            float[] fArr7 = this.e5;
            float f30 = (rectF2.top - f26) + L;
            fArr7[0] = f30;
            fArr7[1] = f30 + f27;
            float f31 = rectF2.bottom + f26 + L;
            fArr7[3] = f31;
            fArr7[2] = f31 - f27;
            for (int i28 = 0; i28 < i25; i28++) {
                int i29 = 0;
                while (i29 < i25) {
                    Rect rect = this.a5;
                    int[] iArr2 = this.c5;
                    int i30 = i29 + 1;
                    int i31 = i25;
                    int i32 = i28 + 1;
                    rect.set(iArr2[i29], iArr2[i28], iArr2[i30], iArr2[i32]);
                    RectF rectF3 = this.b5;
                    float[] fArr8 = this.d5;
                    float f32 = fArr8[i29];
                    float[] fArr9 = this.e5;
                    rectF3.set(f32, fArr9[i28], fArr8[i30], fArr9[i32]);
                    canvas2.drawBitmap(bitmap, this.a5, this.b5, this.Z4);
                    i29 = i30;
                    i25 = i31;
                }
            }
        }
        int i33 = i25;
        canvas2.drawRoundRect(this.F1, org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(30.0f), this.B1);
        this.s0.r.set(f23, m10, f24, f25);
        int N0 = N0();
        float f33 = 0.7f * width;
        float f34 = (width - f33) / 2.0f;
        float f35 = f23 + f34;
        float T12 = org.telegram.messenger.g0.T1(width * 0.12f, f34, this.C2) + m10;
        h hVar = this.s0;
        if (hVar.y != N0 || hVar.z == null) {
            hVar.y = N0;
            hVar.z = new PorterDuffColorFilter(N0, PorterDuff.Mode.SRC_IN);
        }
        this.s0.e(canvas2, f35, T12, f33);
        h hVar2 = this.s0;
        float f36 = (hVar2.m == null ? 0.0f : (r13.l * f33) / r13.b) / 2.0f;
        float f37 = f33 / 2.0f;
        float f38 = f35 + f37;
        float f39 = f37 + T12;
        if (hVar2.q == 2) {
            Math.max(0.0f, hVar2.o);
        }
        float T = T(1.0f);
        canvas2.save();
        canvas2.scale(T, T, f38, f39);
        this.z1.setColor(N0);
        canvas2.drawCircle(f38, f39, f36, this.z1);
        h hVar3 = this.s0;
        if (hVar3.q == 2) {
            f10 = 30.0f;
            i12 = 2;
            if (hVar3.p == 0) {
                currentTimeMillis = -1;
                f11 = 0.12f;
            } else {
                f11 = 0.12f;
                currentTimeMillis = System.currentTimeMillis() - hVar3.p;
            }
            l10 = (!this.T2 || currentTimeMillis == Long.MAX_VALUE) ? 1.0f : currentTimeMillis < 0 ? 0.0f : Utilities.l(currentTimeMillis / 500.0f);
            if (l10 < 1.0f) {
                f12 = T12;
                x10 = 1.0f;
            } else {
                f12 = T12;
                x10 = com.google.android.recaptcha.internal.a.x((float) Math.sin(l10 * 3.141592653589793d), 0.015f, l10, 1.0f - ((float) Math.pow(1.0f - l10, 3.0d)));
            }
            if (x10 <= 0.004f) {
                canvas2.save();
                this.E5.rewind();
                f13 = 0.004f;
                this.E5.addCircle(f38, f39, f36, Path.Direction.CW);
                canvas2.clipPath(this.E5);
                float min = (1.0f - Math.min(1.0f, x10)) * f36 * 0.55f;
                float f40 = (x10 * 0.5f) + 0.5f;
                canvas2.translate(-min, min);
                canvas2.scale(f40, f40, f38, f39);
                if (!this.T2 || this.R2 == null) {
                    this.X1.setAlpha((int) (Utilities.l(l10 * 2.0f) * 255.0f));
                    this.X1.setBounds((int) (f38 - f36), (int) (f39 - f36), (int) (f38 + f36), (int) (f39 + f36));
                    this.X1.draw(canvas2);
                    this.X1.setAlpha(qs.e4);
                } else {
                    this.c7.set(f38 - f36, f39 - f36, f38 + f36, f39 + f36);
                    canvas2.drawBitmap(this.R2, (Rect) null, this.c7, this.S2);
                }
                canvas2.restore();
            } else {
                f13 = 0.004f;
            }
            canvas2.restore();
            i13 = (int) width;
            textPaint = this.F5;
            staticLayout = this.H5;
            if (staticLayout == null && this.I5 == i13) {
                f14 = f33;
            } else {
                this.I5 = i13;
                str = this.f;
                if (str == null) {
                    str = "";
                }
                String upperCase = str.toUpperCase();
                textPaint.setTypeface(org.telegram.messenger.g0.o1("fonts/rcondensedbold.ttf"));
                int L2 = i13 - (org.telegram.messenger.g0.L(20.0f) * i12);
                this.H5 = null;
                i14 = i10;
                while (i14 <= i12) {
                    if (i14 == 0) {
                        this.G5 = w(R.drawable.qr_at_large);
                        textPaint.setTextSize(org.telegram.messenger.g0.L(f10));
                    } else if (i14 == i11) {
                        this.G5 = w(R.drawable.qr_at_medium);
                        textPaint.setTextSize(org.telegram.messenger.g0.L(25.0f));
                    } else {
                        this.G5 = w(R.drawable.qr_at_small);
                        textPaint.setTextSize(org.telegram.messenger.g0.L(19.0f));
                    }
                    Drawable drawable = this.G5;
                    int i34 = i10;
                    drawable.setBounds(i34, i34, drawable.getIntrinsicWidth(), this.G5.getIntrinsicHeight());
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.h ? rf.b.i(" ", upperCase) : upperCase);
                    if (this.h) {
                        f14 = f33;
                        spannableStringBuilder.setSpan(new u6(this.G5), 0, 1, 33);
                    } else {
                        f14 = f33;
                    }
                    float width2 = this.h ? this.G5.getBounds().width() : 0;
                    float measureText = textPaint.measureText(spannableStringBuilder, this.h ? 1 : 0, spannableStringBuilder.length()) + width2;
                    if (i14 > 1 || measureText <= L2) {
                        int i35 = measureText > ((float) L2) ? 2 : 1;
                        int L3 = i35 > 1 ? org.telegram.messenger.g0.L(2.0f) + (((int) (measureText + width2)) / 2) : L2;
                        if (L3 > L2) {
                            L3 = org.telegram.messenger.g0.L(4.0f) + (((int) (measureText + width2)) / 3);
                            i15 = i33;
                        } else {
                            i15 = i35;
                        }
                        int i36 = L3;
                        this.H5 = mu0.c(spannableStringBuilder, textPaint, i36, Layout.Alignment.ALIGN_CENTER, 0.0f, null, Math.min(org.telegram.messenger.g0.L(10.0f) + i36, i13), i15, true);
                        staticLayout = this.H5;
                    } else {
                        i14++;
                        f33 = f14;
                        i12 = 2;
                        i10 = 0;
                        i11 = 1;
                    }
                }
                f14 = f33;
                staticLayout = this.H5;
            }
            staticLayout2 = staticLayout;
            if (staticLayout2 == null) {
                this.F5.setColor(N0);
                this.G5.setColorFilter(n1(N0));
                float descent = (this.F5.descent() - this.F5.ascent()) * staticLayout2.getLineCount();
                float f41 = f12 + f14;
                boolean z10 = this.n5 && !this.T2;
                float f42 = this.C2;
                float f43 = z10 ? f42 < 0.999f ? 1.0f : 0.0f : 1.0f - f42;
                f15 = 3.0f;
                float A = com.google.android.recaptcha.internal.a.A(width, staticLayout2.getWidth(), 2.0f, f23);
                float L4 = ((((f25 - f41) - descent) / 2.0f) + f41) - org.telegram.messenger.g0.L(4.0f);
                if (z10) {
                    c10 = 26214;
                    if (this.m5 != staticLayout2) {
                        Random random = this.e1;
                        this.m5 = staticLayout2;
                        f20 = 0.82f;
                        this.j5 = 0;
                        f21 = 0.18f;
                        int max = Math.max(1, staticLayout2.getWidth());
                        f16 = 36.0f;
                        int max2 = Math.max(1, staticLayout2.getHeight());
                        Bitmap createBitmap = Bitmap.createBitmap(max, max2, Bitmap.Config.ALPHA_8);
                        staticLayout2.draw(new Canvas(createBitmap));
                        int[] iArr3 = new int[max];
                        f17 = 1.6f;
                        int max3 = Math.max(2, org.telegram.messenger.g0.L(2.0f));
                        int i37 = max3 / 2;
                        f19 = descent;
                        int i38 = max;
                        int i39 = i38;
                        int i40 = i37;
                        int i41 = 0;
                        int i42 = 0;
                        while (i40 < max2) {
                            int i43 = i40;
                            Bitmap bitmap3 = createBitmap;
                            int[] iArr4 = iArr3;
                            bitmap3.getPixels(iArr4, 0, i39, 0, i43, i39, 1);
                            int i44 = i39;
                            int i45 = i42;
                            for (int i46 = i37; i46 < i44; i46 += max3) {
                                int i47 = i41;
                                if ((iArr4[i46] >>> 24) < 96) {
                                    i41 = i47;
                                } else {
                                    i41 = i47 + 1;
                                    if (i46 < i38) {
                                        i38 = i46;
                                    }
                                    if (i46 > i45) {
                                        i45 = i46;
                                    }
                                }
                            }
                            i40 = i43 + max3;
                            i41 = i41;
                            i39 = i44;
                            i42 = i45;
                            createBitmap = bitmap3;
                            iArr3 = iArr4;
                        }
                        Bitmap bitmap4 = createBitmap;
                        int[] iArr5 = iArr3;
                        int i48 = i39;
                        if (i41 == 0) {
                            bitmap4.recycle();
                            this.k5 = 0.0f;
                            this.l5 = i48;
                            z9 = false;
                        } else {
                            this.k5 = i38;
                            this.l5 = Math.max(1, i42 - i38);
                            float min2 = Math.min(1.0f, Math.max(80, Math.min(qs.e3, (int) (r5 / org.telegram.messenger.g0.N(1.3f)))) / i41);
                            int i49 = i37;
                            while (i49 < max2) {
                                bitmap4.getPixels(iArr5, 0, i48, 0, i49, i48, 1);
                                int i50 = i37;
                                while (i50 < i48 && this.j5 < 240) {
                                    if ((iArr5[i50] >>> 24) < 96 || random.nextFloat() > min2) {
                                        i23 = i49;
                                        i24 = i48;
                                    } else {
                                        int i51 = this.j5;
                                        this.j5 = i51 + 1;
                                        i24 = i48;
                                        float f44 = i50;
                                        this.f5[i51] = f44;
                                        this.g5[i51] = i49;
                                        i23 = i49;
                                        this.h5[i51] = (random.nextFloat() * 0.18f) + (((f44 - this.k5) * 0.82f) / this.l5);
                                        this.i5[i51] = false;
                                    }
                                    i50 += max3;
                                    i48 = i24;
                                    i49 = i23;
                                }
                                i49 += max3;
                                i48 = i48;
                            }
                            z9 = false;
                            bitmap4.recycle();
                        }
                        if (f43 <= f13) {
                            canvas2.save();
                            canvas2.translate(A, L4);
                            float T2 = T(f43);
                            canvas2.scale(T2, T2, staticLayout2.getWidth() / 2.0f, f19 / 2.0f);
                            if (z10) {
                                float f45 = -org.telegram.messenger.g0.L(8.0f);
                                float f46 = -org.telegram.messenger.g0.L(4.0f);
                                float L5 = org.telegram.messenger.g0.L(8.0f) + staticLayout2.getWidth();
                                float L6 = org.telegram.messenger.g0.L(4.0f) + staticLayout2.getHeight();
                                float f47 = f20;
                                i21 = qs.P3;
                                canvas2.saveLayer(f45, f46, L5, L6, null);
                                staticLayout2.draw(canvas2);
                                float f48 = this.C2 * 1.12f;
                                float f49 = this.k5;
                                float f50 = this.l5;
                                float f51 = (((f48 - f21) * f50) / f47) + f49;
                                this.E.setScale(Math.max(1.0f, a8.p0.f(f50, f48, f47, f49) - f51), 1.0f);
                                this.E.postTranslate(f51, 0.0f);
                                this.C5.setLocalMatrix(this.E);
                                canvas2.drawRect(-org.telegram.messenger.g0.L(8.0f), -org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(8.0f) + staticLayout2.getWidth(), org.telegram.messenger.g0.L(4.0f) + staticLayout2.getHeight(), this.D5);
                                canvas.restore();
                                canvas2 = canvas;
                            } else {
                                i21 = qs.P3;
                                if (f43 < 1.0f) {
                                    canvas2 = canvas;
                                    canvas2.saveLayerAlpha(0.0f, -org.telegram.messenger.g0.L(4.0f), staticLayout2.getWidth(), f19 + org.telegram.messenger.g0.L(4.0f), (int) (f43 * 255.0f));
                                } else {
                                    canvas2 = canvas;
                                }
                                staticLayout2.draw(canvas2);
                                if (f43 < 1.0f) {
                                    canvas2.restore();
                                }
                            }
                            canvas2.restore();
                        } else {
                            i21 = qs.P3;
                        }
                        if (z10) {
                            boolean[] zArr2 = this.i5;
                            Random random2 = this.e1;
                            float f52 = this.C2 * 1.12f;
                            for (?? r15 = z9; r15 < this.j5; r15++) {
                                boolean z11 = this.h5[r15] < f52 ? true : z9;
                                if (!z11 || zArr2[r15] || this.E2 != 1.0f || (i22 = this.B5) >= i21) {
                                    zArr = zArr2;
                                } else {
                                    this.B5 = i22 + 1;
                                    boolean z12 = random2.nextFloat() < f11 ? true : z9;
                                    float[] fArr10 = this.o5;
                                    float[] fArr11 = this.t5;
                                    float nextFloat = ((random2.nextFloat() - 0.5f) * org.telegram.messenger.g0.L(2.0f)) + this.f5[r15] + A;
                                    fArr11[i22] = nextFloat;
                                    fArr10[i22] = nextFloat;
                                    float[] fArr12 = this.p5;
                                    float[] fArr13 = this.u5;
                                    zArr = zArr2;
                                    float nextFloat2 = ((random2.nextFloat() - 0.5f) * org.telegram.messenger.g0.L(2.0f)) + this.g5[r15] + L4;
                                    fArr13[i22] = nextFloat2;
                                    fArr12[i22] = nextFloat2;
                                    this.q5[i22] = ((random2.nextFloat() - 0.5f) * org.telegram.messenger.g0.L(f16)) + org.telegram.messenger.g0.L(6.0f);
                                    this.r5[i22] = -((random2.nextFloat() * org.telegram.messenger.g0.L(f16)) + org.telegram.messenger.g0.L(18.0f));
                                    this.s5[i22] = -((random2.nextFloat() * org.telegram.messenger.g0.L(70.0f)) + org.telegram.messenger.g0.L(60.0f));
                                    this.v5[i22] = z12 ? org.telegram.ui.Cells.f1.d(0.8f, random2.nextFloat(), org.telegram.messenger.g0.N(f17)) : org.telegram.ui.Cells.f1.d(1.3f, random2.nextFloat(), org.telegram.messenger.g0.N(1.2f));
                                    this.w5[i22] = (random2.nextFloat() * 0.4f) + 0.6f;
                                    this.x5[i22] = 0.0f;
                                    this.y5[i22] = (random2.nextFloat() * 3.0f) + 4.0f;
                                    this.z5[i22] = random2.nextFloat() * 6.2832f;
                                    this.A5[i22] = z12;
                                }
                                zArr[r15] = z11;
                                zArr2 = zArr;
                                i21 = qs.P3;
                            }
                        }
                    } else {
                        f19 = descent;
                    }
                } else {
                    f19 = descent;
                    c10 = 26214;
                }
                f20 = 0.82f;
                f21 = 0.18f;
                f16 = 36.0f;
                z9 = false;
                f17 = 1.6f;
                if (f43 <= f13) {
                }
                if (z10) {
                }
            } else {
                f15 = 3.0f;
                f16 = 36.0f;
                f17 = 1.6f;
            }
            if (!this.T2 && (i16 = this.B5) > 0) {
                RectF rectF4 = this.F1;
                boolean[] zArr3 = this.A5;
                float[] fArr14 = this.z5;
                float[] fArr15 = this.y5;
                float[] fArr16 = this.v5;
                float[] fArr17 = this.u5;
                float[] fArr18 = this.t5;
                float[] fArr19 = this.s5;
                float[] fArr20 = this.w5;
                float[] fArr21 = this.p5;
                float[] fArr22 = this.o5;
                float[] fArr23 = this.x5;
                Paint paint = this.z1;
                float[] fArr24 = this.r5;
                float[] fArr25 = this.q5;
                float f53 = this.X2 * 0.016667f;
                i17 = i16 - 1;
                while (i17 >= 0) {
                    float f54 = fArr23[i17] + f53;
                    fArr23[i17] = f54;
                    if (f54 >= fArr20[i17]) {
                        fArr = fArr14;
                        int i52 = this.B5 - 1;
                        this.B5 = i52;
                        fArr22[i17] = fArr22[i52];
                        fArr21[i17] = fArr21[i52];
                        fArr25[i17] = fArr25[i52];
                        fArr24[i17] = fArr24[i52];
                        fArr19[i17] = fArr19[i52];
                        fArr18[i17] = fArr18[i52];
                        fArr17[i17] = fArr17[i52];
                        fArr16[i17] = fArr16[i52];
                        fArr20[i17] = fArr20[i52];
                        fArr23[i17] = fArr23[i52];
                        fArr15[i17] = fArr15[i52];
                        fArr[i17] = fArr[i52];
                        zArr3[i17] = zArr3[i52];
                        rectF = rectF4;
                        f18 = f53;
                        fArr2 = fArr15;
                        fArr3 = fArr16;
                        fArr4 = fArr17;
                        fArr5 = fArr18;
                        i19 = N0;
                    } else {
                        fArr = fArr14;
                        fArr24[i17] = (fArr19[i17] * f53) + fArr24[i17];
                        fArr2 = fArr15;
                        fArr3 = fArr16;
                        fArr25[i17] = com.google.android.recaptcha.internal.a.C(f53, f17, 1.0f, fArr25[i17]);
                        fArr24[i17] = com.google.android.recaptcha.internal.a.C(f53, 0.8f, 1.0f, fArr24[i17]);
                        fArr22[i17] = (fArr25[i17] * f53) + fArr22[i17];
                        float f55 = (fArr24[i17] * f53) + fArr21[i17];
                        fArr21[i17] = f55;
                        float f56 = fArr22[i17] - fArr18[i17];
                        float f57 = f55 - fArr17[i17];
                        float f58 = (f57 * f57) + (f56 * f56);
                        int i53 = N0;
                        float sqrt = (float) Math.sqrt(f58);
                        float f59 = fArr23[i17] / fArr20[i17];
                        if (f59 < 0.08f) {
                            pow = f59 / 0.08f;
                            f18 = f53;
                            i18 = i53;
                        } else {
                            f18 = f53;
                            i18 = i53;
                            pow = (float) Math.pow(k5.y(f59, 0.08f, 0.92f, 1.0f), 0.550000011920929d);
                        }
                        float exp = pow * ((float) Math.exp((-sqrt) / org.telegram.messenger.g0.L(90.0f)));
                        float min3 = (1.0f - (Math.min(1.0f, sqrt / org.telegram.messenger.g0.L(90.0f)) * 0.4f)) * (fArr3[i17] / 2.0f);
                        float hypot = (float) Math.hypot(fArr25[i17], fArr24[i17]);
                        float f60 = fArr22[i17];
                        float f61 = fArr21[i17];
                        if (hypot > 1.0f) {
                            float sin = ((float) Math.sin((fArr23[i17] * fArr2[i17]) + fArr[i17])) * org.telegram.messenger.g0.L(f15);
                            f60 = com.google.android.recaptcha.internal.a.c(-fArr24[i17], hypot, sin, f60);
                            f61 = com.google.android.recaptcha.internal.a.c(fArr25[i17], hypot, sin, f61);
                        }
                        fArr4 = fArr17;
                        float min4 = Math.min(1.0f, Math.max(Math.max(rectF4.left - f60, Math.max(0.0f, f60 - rectF4.right)), Math.max(rectF4.top - f61, Math.max(0.0f, f61 - rectF4.bottom))) / org.telegram.messenger.g0.L(f16));
                        if (min4 > 0.0f) {
                            i19 = i18;
                            i20 = h.k(min4, i19, -1);
                        } else {
                            i19 = i18;
                            i20 = i19;
                        }
                        paint.setColor(i20);
                        paint.setAlpha((int) (exp * 255.0f));
                        float min5 = Math.min(1.8f, (hypot / org.telegram.messenger.g0.L(220.0f)) + 1.0f);
                        canvas2.save();
                        fArr5 = fArr18;
                        rectF = rectF4;
                        canvas2.rotate((float) Math.toDegrees(Math.atan2(fArr24[i17], fArr25[i17])), f60, f61);
                        float f62 = min3 * min5;
                        this.U5.set(f60 - f62, f61 - min3, f62 + f60, f61 + min3);
                        canvas2.drawOval(this.U5, paint);
                        canvas2.restore();
                        if (zArr3[i17]) {
                            paint.setAlpha((int) (exp * f16));
                            canvas2.drawCircle(f60, f61, 2.2f * min3, paint);
                        }
                    }
                    i17--;
                    N0 = i19;
                    fArr17 = fArr4;
                    fArr14 = fArr;
                    fArr15 = fArr2;
                    fArr16 = fArr3;
                    f53 = f18;
                    fArr18 = fArr5;
                    rectF4 = rectF;
                    f17 = 1.6f;
                }
                if (this.B5 > 0) {
                    invalidate();
                }
            }
            canvas2.restore();
        }
        f10 = 30.0f;
        i12 = 2;
        f11 = 0.12f;
        currentTimeMillis = Long.MAX_VALUE;
        if (this.T2) {
        }
        if (l10 < 1.0f) {
        }
        if (x10 <= 0.004f) {
        }
        canvas2.restore();
        i13 = (int) width;
        textPaint = this.F5;
        staticLayout = this.H5;
        if (staticLayout == null) {
        }
        this.I5 = i13;
        str = this.f;
        if (str == null) {
        }
        String upperCase2 = str.toUpperCase();
        textPaint.setTypeface(org.telegram.messenger.g0.o1("fonts/rcondensedbold.ttf"));
        int L22 = i13 - (org.telegram.messenger.g0.L(20.0f) * i12);
        this.H5 = null;
        i14 = i10;
        while (i14 <= i12) {
        }
        f14 = f33;
        staticLayout = this.H5;
        staticLayout2 = staticLayout;
        if (staticLayout2 == null) {
        }
        if (!this.T2) {
            RectF rectF42 = this.F1;
            boolean[] zArr32 = this.A5;
            float[] fArr142 = this.z5;
            float[] fArr152 = this.y5;
            float[] fArr162 = this.v5;
            float[] fArr172 = this.u5;
            float[] fArr182 = this.t5;
            float[] fArr192 = this.s5;
            float[] fArr202 = this.w5;
            float[] fArr212 = this.p5;
            float[] fArr222 = this.o5;
            float[] fArr232 = this.x5;
            Paint paint2 = this.z1;
            float[] fArr242 = this.r5;
            float[] fArr252 = this.q5;
            float f532 = this.X2 * 0.016667f;
            i17 = i16 - 1;
            while (i17 >= 0) {
            }
            if (this.B5 > 0) {
            }
        }
        canvas2.restore();
    }

    public final PorterDuffColorFilter A0(i1 i1Var) {
        float[] fArr = o1.b;
        int i7 = ((int) (fArr[30] * 10.0f)) ^ (i1Var.s * 31);
        if (this.k4 == null || this.l4 != i7) {
            this.l4 = i7;
            this.k4 = new PorterDuffColorFilter(i0.a.f(fArr[30] / 100.0f, i1Var.s, -1), PorterDuff.Mode.SRC_IN);
        }
        return this.k4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0094, code lost:
    
        if (r0.B0 > 0.001f) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x023f, code lost:
    
        if (java.lang.Math.hypot(r66 - r7, r67 - r6) > r4) goto L53;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r57v1 */
    /* JADX WARN: Type inference failed for: r57v2 */
    /* JADX WARN: Type inference failed for: r57v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void B(Canvas canvas, int i7) {
        TextPaint textPaint;
        RectF rectF;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        TextPaint textPaint2;
        float[] fArr;
        float f15;
        boolean z9;
        float[] fArr2;
        boolean z10;
        float f16;
        float f17;
        Random random;
        int i10;
        float f18;
        float[] fArr3;
        Paint paint;
        Path path;
        RectF rectF2;
        int i11;
        Path path2;
        RectF rectF3;
        boolean[] zArr;
        float f19;
        TextPaint textPaint3;
        float f20;
        float f21;
        Canvas canvas2;
        float[] fArr4;
        float[] fArr5;
        float[] fArr6;
        float[] fArr7;
        float[] fArr8;
        float[] fArr9;
        float[] fArr10;
        float[] fArr11;
        float[] fArr12;
        float[] fArr13;
        float[] fArr14;
        float[] fArr15;
        Path path3;
        float f22;
        float pow;
        float f23;
        Paint paint2;
        RectF rectF4;
        float f24;
        float f25;
        RectF rectF5;
        float f26;
        TextPaint textPaint4;
        Paint paint3;
        float N;
        float nextFloat;
        float f27;
        int i12;
        int i13;
        int i14;
        float f28;
        float[] fArr16;
        boolean z11;
        l1 l1Var = this;
        Canvas canvas3 = canvas;
        float f29 = l1Var.C2;
        float f30 = l1Var.J2;
        float f31 = (1.0f - f30) * f29;
        RectF rectF6 = l1Var.J5;
        TextPaint textPaint5 = l1Var.H0;
        RectF rectF7 = l1Var.F1;
        if (f30 > 0.001f) {
            boolean z12 = f30 < 0.999f;
            if (z12) {
                canvas3.save();
                float f32 = l1Var.J2;
                f12 = 0.999f;
                f10 = 2.0f;
                canvas3.scale(f32, f32, i7 / 2.0f, l1Var.o());
            } else {
                f12 = 0.999f;
                f10 = 2.0f;
            }
            float o4 = l1Var.o();
            textPaint5.setTextSize(org.telegram.messenger.g0.L(11.0f));
            float measureText = textPaint5.measureText(l1Var.J0) + textPaint5.measureText(l1Var.I0) + org.telegram.messenger.g0.L(11.0f) + org.telegram.messenger.g0.L(12.0f) + org.telegram.messenger.g0.L(1.0f) + org.telegram.messenger.g0.L(11.0f);
            if (!l1Var.v0) {
                f14 = l1Var.t2;
                if (f14 > 0.0f) {
                    f13 = 8.0f;
                }
            }
            f13 = 8.0f;
            f14 = org.telegram.messenger.g0.L(11.0f) + l1Var.L0.c() + org.telegram.messenger.g0.L(f10) + org.telegram.messenger.g0.L(12.0f) + org.telegram.messenger.g0.L(f13);
            boolean z13 = l1Var.v0;
            if (!z13 && l1Var.B0 <= 0.001f) {
                l1Var.t2 = 0.0f;
            }
            float f33 = l1Var.B0;
            if (z13) {
                f33 = Math.max(f33, l1Var.F0 ? 1.0f : 0.0f);
            }
            float T1 = org.telegram.messenger.g0.T1(measureText, f14, f33);
            float L = org.telegram.messenger.g0.L(22.0f);
            float f34 = (i7 - T1) / f10;
            float f35 = L / f10;
            rectF7.set(f34, o4 - f35, T1 + f34, o4 + f35);
            rectF6.set(rectF7);
            if (!l1Var.T5) {
                l1Var.z6 = true;
                l1Var.J(canvas3, rectF7, f35, 1.0f);
                l1Var.z6 = false;
            }
            l1Var.M(canvas3, 9, rectF7, false);
            RectF rectF8 = l1Var.K5;
            rectF8.set(rectF7);
            float min = Math.min(0.0f, org.telegram.messenger.g0.N(o1.a[1][8]));
            rectF8.inset(min, min);
            float f36 = f35 - min;
            f11 = f31;
            boolean z14 = l1Var.q2 > 0 && !l1Var.v0;
            boolean z15 = l1Var.s2;
            float[] fArr17 = l1Var.Z0;
            float[] fArr18 = l1Var.Y0;
            RectF rectF9 = rectF6;
            float[] fArr19 = l1Var.X0;
            float[] fArr20 = l1Var.U0;
            float[] fArr21 = l1Var.T0;
            float[] fArr22 = l1Var.R0;
            float[] fArr23 = l1Var.Q0;
            float[] fArr24 = l1Var.S0;
            float[] fArr25 = l1Var.P0;
            float[] fArr26 = l1Var.O0;
            float[] fArr27 = l1Var.W0;
            float[] fArr28 = l1Var.V0;
            float[] fArr29 = l1Var.N0;
            float[] fArr30 = l1Var.M0;
            boolean[] zArr2 = l1Var.b1;
            byte[] bArr = l1Var.a1;
            float f37 = 0.8f;
            RectF rectF10 = l1Var.r2;
            Random random2 = l1Var.e1;
            if (z15) {
                l1Var.s2 = false;
                float f38 = rectF8.left;
                z10 = 0;
                textPaint2 = textPaint5;
                fArr = fArr18;
                rectF10.set(f38, rectF8.top, (rectF8.width() * l1Var.B0 * l1Var.G0) + f38, rectF8.bottom);
                float L2 = org.telegram.messenger.g0.L(3.0f);
                float centerX = rectF7.centerX();
                float centerY = rectF7.centerY();
                int max = Math.max(1, (int) (rectF10.width() / L2));
                int max2 = Math.max(1, (int) (rectF10.height() / L2));
                float min2 = Math.min(1.0f, 260.0f / (max * max2));
                int i15 = 0;
                while (i15 < max2) {
                    float f39 = min2;
                    int i16 = 0;
                    while (i16 < max) {
                        if (random2.nextFloat() <= f39) {
                            i13 = max2;
                            f28 = L;
                            if (l1Var.c1 >= 320) {
                                i12 = i16;
                                i14 = i15;
                            } else {
                                float nextFloat2 = ((((random2.nextFloat() - 0.5f) * f37) + i16 + 0.5f) * L2) + rectF10.left;
                                float nextFloat3 = ((((random2.nextFloat() - 0.5f) * f37) + i15 + 0.5f) * L2) + rectF10.top;
                                float height = rectF7.height() / f10;
                                if (nextFloat2 < rectF7.left + height) {
                                    i14 = i15;
                                    i12 = i16;
                                    z11 = z14;
                                    fArr16 = fArr17;
                                } else {
                                    i12 = i16;
                                    i14 = i15;
                                    z11 = z14;
                                    fArr16 = fArr17;
                                }
                                float f40 = nextFloat2 - centerX;
                                float f41 = nextFloat3 - centerY;
                                float max3 = Math.max(1.0f, (float) Math.hypot(f40, f41));
                                float f42 = f40 / max3;
                                float f43 = f41 / max3;
                                float nextFloat4 = (random2.nextFloat() * org.telegram.messenger.g0.L(140.0f)) + org.telegram.messenger.g0.L(60.0f);
                                boolean z16 = random2.nextFloat() < 0.15f;
                                int i17 = l1Var.c1;
                                l1Var.c1 = i17 + 1;
                                bArr[i17] = (byte) (z16 ? 4 : 3);
                                zArr2[i17] = false;
                                fArr30[i17] = nextFloat2;
                                fArr29[i17] = nextFloat3;
                                fArr28[i17] = nextFloat2;
                                fArr27[i17] = nextFloat3;
                                fArr26[i17] = ((random2.nextFloat() - 0.5f) * org.telegram.messenger.g0.L(60.0f)) + (f42 * nextFloat4);
                                fArr25[i17] = ((random2.nextFloat() - 0.5f) * org.telegram.messenger.g0.L(60.0f)) + ((f43 * nextFloat4) - ((random2.nextFloat() * org.telegram.messenger.g0.L(80.0f)) + org.telegram.messenger.g0.L(40.0f)));
                                fArr24[i17] = z16 ? org.telegram.ui.Cells.f1.d(f37, random2.nextFloat(), org.telegram.messenger.g0.N(1.4f)) : org.telegram.ui.Cells.f1.d(1.2f, random2.nextFloat(), org.telegram.messenger.g0.N(1.0f));
                                fArr23[i17] = (random2.nextFloat() * 0.3f) + 0.35f;
                                fArr22[i17] = 0.0f;
                                fArr21[i17] = 1.0f;
                                fArr20[i17] = 0.0f;
                                fArr19[i17] = 0.0f;
                                fArr[i17] = 0.0f;
                                fArr16[i17] = 0.0f;
                                i16 = i12 + 1;
                                max2 = i13;
                                L = f28;
                                i15 = i14;
                                z14 = z11;
                                fArr17 = fArr16;
                                f37 = 0.8f;
                            }
                        } else {
                            i12 = i16;
                            i13 = max2;
                            i14 = i15;
                            f28 = L;
                        }
                        z11 = z14;
                        fArr16 = fArr17;
                        i16 = i12 + 1;
                        max2 = i13;
                        L = f28;
                        i15 = i14;
                        z14 = z11;
                        fArr17 = fArr16;
                        f37 = 0.8f;
                    }
                    i15++;
                    min2 = f39;
                    L = L;
                    f37 = 0.8f;
                }
                f15 = L;
                z9 = z14;
                fArr2 = fArr17;
                l1Var.invalidate();
            } else {
                textPaint2 = textPaint5;
                fArr = fArr18;
                f15 = L;
                z9 = z14;
                fArr2 = fArr17;
                z10 = 0;
            }
            float f44 = z9 ? 0.0f : l1Var.B0 * l1Var.G0;
            float width = (rectF8.width() * f44) + rectF8.left;
            if (z9) {
                f16 = f35;
                f17 = Utilities.l((AnimationUtils.currentAnimationTimeMillis() - l1Var.q2) / 80.0f);
            } else {
                f16 = f35;
                f17 = 1.0f;
            }
            Paint paint4 = l1Var.z1;
            Path path4 = l1Var.E1;
            if (!z9 || f17 >= 1.0f) {
                random = random2;
            } else {
                random = random2;
                float l10 = 1.0f - Utilities.l((AnimationUtils.currentAnimationTimeMillis() - l1Var.q2) / 60.0f);
                canvas3.save();
                path4.rewind();
                path4.addRoundRect(rectF8, f36, f36, Path.Direction.CW);
                canvas3.clipPath(path4);
                canvas3.clipRect(rectF10);
                if (l10 > 0.0f) {
                    paint4.setColor(-134217729);
                    paint4.setAlpha((int) (l10 * 247.0f));
                    canvas3.drawRect(rectF10, paint4);
                }
                l1Var.G(canvas3, rectF7, a(1.0f - f17, l1Var.n != null ? l1Var.N0() : -16777216));
                canvas3.restore();
                l1Var.invalidate();
            }
            boolean z17 = l1Var.v0;
            boolean z18 = (z17 && l1Var.F0 && l1Var.w0 && f44 < f12) ? true : z10;
            RectF rectF11 = rectF7;
            float elapsedRealtime = (SystemClock.elapsedRealtime() % 100000) / 1000.0f;
            float f45 = 6.0f;
            float f46 = f44;
            l1Var.N5 = org.telegram.messenger.g0.N((!z17 || l1Var.F0) ? z10 : true ? 5.0f : 2.2f) * Utilities.l((rectF8.right - width) / org.telegram.messenger.g0.L(6.0f)) * Utilities.l((width - rectF8.left) / org.telegram.messenger.g0.L(6.0f));
            float L3 = rectF11.top - org.telegram.messenger.g0.L(4.0f);
            float L4 = rectF11.bottom + org.telegram.messenger.g0.L(4.0f);
            float f47 = L4 - L3;
            int i18 = z10;
            while (true) {
                i10 = 7;
                f18 = f17;
                fArr3 = l1Var.M5;
                if (i18 >= 7) {
                    break;
                }
                float f48 = 5.1f * elapsedRealtime;
                float f49 = i18;
                fArr3[i18] = (((float) ((Math.sin((f49 * 2.9f) + (8.3f * elapsedRealtime)) * 0.4000000059604645d) + (Math.sin((1.7f * f49) + f48) * 0.6000000238418579d))) * l1Var.N5) + width;
                i18++;
                f17 = f18;
                z18 = z18;
            }
            boolean z19 = z18;
            Path path5 = l1Var.L5;
            path5.rewind();
            path5.moveTo(rectF11.left - org.telegram.messenger.g0.L(f13), L3);
            path5.lineTo(fArr3[z10], L3);
            int i19 = 1;
            while (i19 < i10) {
                int i20 = i19 - 1;
                float f50 = i20;
                float f51 = f45;
                float f52 = a8.p0.f(f47, f50, f51, L3);
                float f53 = a8.p0.f(f47, i19, f51, L3);
                float f54 = fArr3[i20];
                path5.quadTo(f54, f52, (f54 + fArr3[i19]) / f10, (f53 + f52) / f10);
                i19++;
                L3 = L3;
                i10 = 7;
                f45 = 6.0f;
            }
            path5.lineTo(fArr3[6], L4);
            path5.lineTo(rectF11.left - org.telegram.messenger.g0.L(f13), L4);
            path5.close();
            if (l1Var.N5 > 0.01f) {
                l1Var.invalidate();
            }
            int i21 = (f46 > 0.001f ? 1 : (f46 == 0.001f ? 0 : -1));
            Path path6 = l1Var.S5;
            if (i21 > 0) {
                canvas3.save();
                path4.rewind();
                path4.addRoundRect(rectF8, f36, f36, Path.Direction.CW);
                canvas3.clipPath(path4);
                canvas3.clipPath(path5);
                paint4.setColor(-134217729);
                if (z19) {
                    path6.rewind();
                    float L5 = rectF8.top - org.telegram.messenger.g0.L(f10);
                    float L6 = rectF8.bottom + org.telegram.messenger.g0.L(f10);
                    float N2 = org.telegram.messenger.g0.N(0.75f);
                    f20 = 20.0f;
                    path6.moveTo(rectF8.left - org.telegram.messenger.g0.L(4.0f), L5);
                    while (true) {
                        float min3 = Math.min(L5, L6);
                        path6.lineTo(t1(min3, width, rectF8.top) + width, min3);
                        if (min3 >= L6) {
                            break;
                        } else {
                            L5 += N2;
                        }
                    }
                    path6.lineTo(rectF8.left - org.telegram.messenger.g0.L(4.0f), L6);
                    path6.close();
                    canvas3.drawPath(path6, paint4);
                    textPaint4 = textPaint2;
                } else {
                    f20 = 20.0f;
                    textPaint4 = textPaint2;
                    canvas3.drawRect(rectF8.left, rectF8.top, l1Var.N5 + width, rectF8.bottom, paint4);
                }
                if (z19 || (l1Var.v0 && !l1Var.F0)) {
                    float L7 = org.telegram.messenger.g0.L(23.0f);
                    Matrix matrix = l1Var.P5;
                    matrix.setScale(L7, 1.0f);
                    matrix.postTranslate(width - org.telegram.messenger.g0.L(22.0f), 0.0f);
                    LinearGradient linearGradient = l1Var.Q5;
                    linearGradient.setLocalMatrix(matrix);
                    paint4.setShader(linearGradient);
                    canvas.drawRect(width - org.telegram.messenger.g0.L(22.0f), rectF8.top, width + org.telegram.messenger.g0.L(1.0f), rectF8.bottom, paint4);
                    paint3 = paint4;
                    paint3.setShader(null);
                } else {
                    paint3 = paint4;
                }
                canvas.restore();
                float f55 = l1Var.X2 * 0.016667f;
                float currentTimeMillis = z19 ? 1.2f : ((l1Var.o2 + 250) - System.currentTimeMillis()) / 1000.0f;
                if (z19) {
                    int floor = (int) Math.floor(random.nextFloat() + (110.0f * f55));
                    int i22 = z10;
                    while (i22 < floor) {
                        float nextFloat5 = (random.nextFloat() * f15) + rectF11.top;
                        boolean[] zArr3 = zArr2;
                        float[] fArr31 = fArr30;
                        float[] fArr32 = fArr29;
                        float[] fArr33 = fArr28;
                        float[] fArr34 = fArr27;
                        float[] fArr35 = fArr26;
                        float[] fArr36 = fArr25;
                        float[] fArr37 = fArr24;
                        q((random.nextFloat() * org.telegram.messenger.g0.L(3.0f)) + t1(nextFloat5, width, rectF8.top) + width, nextFloat5, (random.nextFloat() * org.telegram.messenger.g0.L(f20)) + org.telegram.messenger.g0.L(10.0f), -((random.nextFloat() * org.telegram.messenger.g0.L(10.0f)) + org.telegram.messenger.g0.L(4.0f)), 0.0f, org.telegram.ui.Cells.f1.d(0.7f, random.nextFloat(), org.telegram.messenger.g0.N(0.8f)), (random.nextFloat() * 0.25f) + 0.25f, (random.nextFloat() * 0.1f) + 0.9f, false, false);
                        i22++;
                        rectF11 = rectF11;
                        rectF8 = rectF8;
                        i21 = i21;
                        floor = floor;
                        path6 = path6;
                        fArr19 = fArr19;
                        fArr20 = fArr20;
                        fArr21 = fArr21;
                        fArr22 = fArr22;
                        fArr23 = fArr23;
                        fArr24 = fArr37;
                        fArr25 = fArr36;
                        fArr26 = fArr35;
                        fArr27 = fArr34;
                        fArr28 = fArr33;
                        fArr29 = fArr32;
                        fArr30 = fArr31;
                        zArr2 = zArr3;
                        textPaint4 = textPaint4;
                        path4 = path4;
                        paint3 = paint3;
                        rectF9 = rectF9;
                        f16 = f16;
                        path5 = path5;
                    }
                    paint = paint3;
                    path = path4;
                    rectF2 = rectF11;
                    i11 = i21;
                    path2 = path5;
                    rectF3 = rectF9;
                    zArr = zArr2;
                    f19 = f16;
                    f21 = 0.12f;
                    canvas2 = canvas;
                    textPaint3 = textPaint4;
                    fArr4 = fArr30;
                    RectF rectF12 = rectF8;
                    fArr5 = fArr29;
                    fArr6 = fArr28;
                    fArr7 = fArr27;
                    fArr8 = fArr26;
                    fArr9 = fArr25;
                    fArr10 = fArr24;
                    fArr11 = fArr23;
                    fArr12 = fArr22;
                    fArr13 = fArr21;
                    fArr14 = fArr20;
                    fArr15 = fArr19;
                    path3 = path6;
                    int i23 = z10;
                    for (int floor2 = (int) Math.floor(random.nextFloat() + (f55 * 70.0f)); i23 < floor2; floor2 = floor2) {
                        boolean z20 = random.nextFloat() < 0.12f ? true : z10;
                        float nextFloat6 = rectF2.top + (random.nextFloat() * f15);
                        float nextFloat7 = (random.nextFloat() * org.telegram.messenger.g0.L(10.0f)) + t1(nextFloat6, width, rectF12.top) + width + org.telegram.messenger.g0.L(f10);
                        float L8 = org.telegram.messenger.g0.L(40.0f) + (random.nextFloat() * org.telegram.messenger.g0.L(70.0f));
                        float f56 = -((random.nextFloat() * org.telegram.messenger.g0.L(30.0f)) + org.telegram.messenger.g0.L(10.0f));
                        float f57 = -((random.nextFloat() * org.telegram.messenger.g0.L(34.0f)) + org.telegram.messenger.g0.L(26.0f));
                        if (z20) {
                            N = org.telegram.messenger.g0.N(1.4f);
                            nextFloat = random.nextFloat();
                            f27 = 0.8f;
                        } else {
                            N = org.telegram.messenger.g0.N(0.9f);
                            nextFloat = random.nextFloat();
                            f27 = 1.1f;
                        }
                        q(nextFloat7, nextFloat6, L8, f56, f57, org.telegram.ui.Cells.f1.d(f27, nextFloat, N), (random.nextFloat() * 0.7f) + 0.6f, 1.0f, z20, true);
                        i23++;
                    }
                    l1Var = this;
                } else {
                    paint = paint3;
                    path = path4;
                    rectF2 = rectF11;
                    i11 = i21;
                    path2 = path5;
                    rectF3 = rectF9;
                    zArr = zArr2;
                    f19 = f16;
                    f21 = 0.12f;
                    canvas2 = canvas;
                    textPaint3 = textPaint4;
                    fArr4 = fArr30;
                    fArr5 = fArr29;
                    fArr6 = fArr28;
                    fArr7 = fArr27;
                    fArr8 = fArr26;
                    fArr9 = fArr25;
                    fArr10 = fArr24;
                    fArr11 = fArr23;
                    fArr12 = fArr22;
                    fArr13 = fArr21;
                    fArr14 = fArr20;
                    fArr15 = fArr19;
                    path3 = path6;
                    int floor3 = (int) Math.floor(random.nextFloat() + (((!l1Var.v0 || l1Var.F0) ? 0.0f : 260.0f) * f55));
                    for (int i24 = z10; i24 < floor3; i24++) {
                        l1Var.p(width, (random.nextFloat() * f15) + rectF2.top, currentTimeMillis);
                    }
                }
            } else {
                paint = paint4;
                path = path4;
                rectF2 = rectF11;
                i11 = i21;
                path2 = path5;
                rectF3 = rectF9;
                zArr = zArr2;
                f19 = f16;
                textPaint3 = textPaint2;
                f20 = 20.0f;
                f21 = 0.12f;
                canvas2 = canvas3;
                fArr4 = fArr30;
                fArr5 = fArr29;
                fArr6 = fArr28;
                fArr7 = fArr27;
                fArr8 = fArr26;
                fArr9 = fArr25;
                fArr10 = fArr24;
                fArr11 = fArr23;
                fArr12 = fArr22;
                fArr13 = fArr21;
                fArr14 = fArr20;
                fArr15 = fArr19;
                path3 = path6;
            }
            int N0 = l1Var.n != null ? l1Var.N0() : -16777216;
            canvas2.save();
            path.rewind();
            Path path7 = path;
            path7.addRoundRect(rectF2, f19, f19, Path.Direction.CW);
            canvas2.clipPath(path7);
            if (i11 > 0) {
                a0.b(canvas2, z19 ? path3 : path2);
            }
            if (l1Var.v0 && l1Var.F0) {
                l1Var.G(canvas2, rectF2, -218103809);
                canvas3 = canvas2;
                textPaint = textPaint3;
            } else {
                int a10 = a(z9 ? f18 : 1.0f - Utilities.l(l1Var.B0 * 1.25f), -218103809);
                float centerY2 = rectF2.centerY();
                float L10 = org.telegram.messenger.g0.L(12.0f);
                float L11 = rectF2.left + org.telegram.messenger.g0.L(11.0f);
                textPaint = textPaint3;
                textPaint.setColor(a10);
                canvas2.drawText(l1Var.I0, L11, org.telegram.messenger.g0.L(4.0f) + centerY2, textPaint);
                float measureText2 = textPaint.measureText(l1Var.I0) + L11;
                canvas3 = canvas2;
                l1Var.O(canvas3, measureText2, centerY2, L10, a10, false);
                textPaint.setColor(a10);
                canvas3.drawText(l1Var.J0, measureText2 + L10 + org.telegram.messenger.g0.L(1.0f), centerY2 + org.telegram.messenger.g0.L(4.0f), textPaint);
            }
            canvas3.restore();
            if (i11 > 0) {
                canvas3.save();
                canvas3.clipPath(z19 ? path3 : path2);
                l1Var.G(canvas3, rectF2, N0);
                canvas3.restore();
            }
            if (l1Var.d1) {
                l1Var.d1 = z10;
                for (int i25 = 0; i25 < 24; i25++) {
                    l1Var.p((rectF2.width() * random.nextFloat() * 0.4f) + rectF2.left, (rectF2.height() * random.nextFloat()) + rectF2.top, 0.5f);
                }
            }
            float f58 = 0.5f;
            float f59 = l1Var.X2 * 0.016667f;
            RectF rectF13 = rectF3;
            float L12 = rectF13.top - org.telegram.messenger.g0.L(40.0f);
            float L13 = rectF13.top - org.telegram.messenger.g0.L(48.0f);
            int i26 = l1Var.c1 - 1;
            while (i26 >= 0) {
                float f60 = fArr12[i26] + f59;
                fArr12[i26] = f60;
                if (f60 >= fArr11[i26]) {
                    int i27 = l1Var.c1 - 1;
                    l1Var.c1 = i27;
                    fArr4[i26] = fArr4[i27];
                    fArr5[i26] = fArr5[i27];
                    fArr8[i26] = fArr8[i27];
                    fArr9[i26] = fArr9[i27];
                    fArr11[i26] = fArr11[i27];
                    fArr12[i26] = fArr12[i27];
                    fArr10[i26] = fArr10[i27];
                    fArr13[i26] = fArr13[i27];
                    fArr14[i26] = fArr14[i27];
                    bArr[i26] = bArr[i27];
                    zArr[i26] = zArr[i27];
                    fArr6[i26] = fArr6[i27];
                    fArr7[i26] = fArr7[i27];
                    fArr15[i26] = fArr15[i27];
                    fArr[i26] = fArr[i27];
                    fArr2[i26] = fArr2[i27];
                    f22 = f58;
                    rectF4 = rectF13;
                    f24 = L12;
                    f25 = L13;
                    rectF5 = rectF2;
                    paint2 = paint;
                } else {
                    if (bArr[i26] >= 3) {
                        float f61 = 1.0f - (2.4f * f59);
                        fArr8[i26] = fArr8[i26] * f61;
                        float f62 = fArr9[i26] * f61;
                        fArr9[i26] = f62;
                        if (fArr12[i26] > f21) {
                            fArr9[i26] = (org.telegram.messenger.g0.L(120.0f) * f59) + f62;
                        }
                        if (fArr5[i26] < rectF13.top - org.telegram.messenger.g0.L(70.0f)) {
                            fArr9[i26] = fArr9[i26] * 0.85f;
                        }
                    } else if (zArr[i26]) {
                        fArr9[i26] = (fArr15[i26] * f59) + fArr9[i26];
                        fArr8[i26] = com.google.android.recaptcha.internal.a.C(f59, 1.6f, 1.0f, fArr8[i26]);
                        float C = com.google.android.recaptcha.internal.a.C(f59, 0.8f, 1.0f, fArr9[i26]);
                        fArr9[i26] = C;
                        if (fArr5[i26] < L13) {
                            fArr9[i26] = C * ((float) Math.pow(0.8999999761581421d, l1Var.X2));
                        }
                    } else {
                        fArr9[i26] = fArr9[i26] - (org.telegram.messenger.g0.L(f20) * f59);
                        float f63 = 1.0f - (f59 * 3.0f);
                        fArr8[i26] = fArr8[i26] * f63;
                        float f64 = fArr9[i26] * f63;
                        fArr9[i26] = f64;
                        if (fArr5[i26] < L12) {
                            fArr9[i26] = f64 * 0.85f;
                        }
                    }
                    fArr4[i26] = (fArr8[i26] * f59) + fArr4[i26];
                    fArr5[i26] = (fArr9[i26] * f59) + fArr5[i26];
                    float f65 = fArr12[i26] / fArr11[i26];
                    if (f65 < f21) {
                        pow = f65 / f21;
                        f22 = f58;
                    } else {
                        f22 = f58;
                        pow = (float) Math.pow(k5.y(f65, f21, 0.88f, 1.0f), zArr[i26] ? 0.550000011920929d : 0.699999988079071d);
                    }
                    float f66 = fArr5[i26];
                    if (f66 < L12) {
                        f23 = 1.0f;
                        pow *= Math.max(0.0f, 1.0f - ((L12 - f66) / org.telegram.messenger.g0.L(24.0f)));
                    } else {
                        f23 = 1.0f;
                    }
                    float f67 = ((f23 - (f65 * f22)) * fArr10[i26]) / f10;
                    paint2 = paint;
                    paint2.setColor(-1);
                    paint2.setAlpha((int) (pow * 255.0f));
                    byte b10 = bArr[i26];
                    RectF rectF14 = l1Var.U5;
                    if (b10 >= 3) {
                        f24 = L12;
                        f25 = L13;
                        float f68 = f10;
                        float e10 = org.telegram.ui.Cells.f1.e((float) Math.hypot(fArr8[i26], fArr9[i26]), org.telegram.messenger.g0.L(200.0f), 1.0f, f68);
                        float f69 = ((1.0f - (f65 * 0.4f)) * fArr10[i26]) / f68;
                        if (fArr5[i26] < rectF13.top - org.telegram.messenger.g0.L(70.0f)) {
                            pow *= Math.max(0.0f, 1.0f - (((rectF13.top - org.telegram.messenger.g0.L(70.0f)) - fArr5[i26]) / org.telegram.messenger.g0.L(16.0f)));
                        }
                        paint2.setAlpha((int) (pow * 255.0f));
                        canvas3.save();
                        f10 = f68;
                        rectF5 = rectF2;
                        rectF4 = rectF13;
                        canvas3.rotate((float) Math.toDegrees(Math.atan2(fArr9[i26], fArr8[i26])), fArr4[i26], fArr5[i26]);
                        float f70 = fArr4[i26];
                        float f71 = f69 * e10;
                        float f72 = fArr5[i26];
                        rectF14.set(f70 - f71, f72 - f69, f70 + f71, f72 + f69);
                        canvas3.drawOval(rectF14, paint2);
                        canvas3.restore();
                        if (bArr[i26] == 4) {
                            paint2.setAlpha((int) (pow * 36.0f));
                            canvas3.drawCircle(fArr4[i26], fArr5[i26], f69 * 2.2f, paint2);
                        }
                    } else {
                        rectF4 = rectF13;
                        f24 = L12;
                        f25 = L13;
                        rectF5 = rectF2;
                        if (zArr[i26]) {
                            float f73 = fArr4[i26] - fArr6[i26];
                            float f74 = fArr5[i26] - fArr7[i26];
                            float sqrt = (float) Math.sqrt((f74 * f74) + (f73 * f73));
                            float f75 = fArr12[i26] / fArr11[i26];
                            float exp = fArr13[i26] * ((float) Math.exp((-sqrt) / org.telegram.messenger.g0.L(44.0f))) * (f75 < 0.08f ? f75 / 0.08f : (float) Math.pow(k5.y(f75, 0.08f, 0.92f, 1.0f), 0.550000011920929d));
                            float f76 = fArr5[i26];
                            if (f76 < f25) {
                                f26 = 1.0f;
                                exp *= Math.max(0.0f, 1.0f - ((f25 - f76) / org.telegram.messenger.g0.L(16.0f)));
                            } else {
                                f26 = 1.0f;
                            }
                            float min4 = (f26 - (Math.min(f26, sqrt / org.telegram.messenger.g0.L(70.0f)) * 0.4f)) * (fArr10[i26] / f10);
                            float hypot = (float) Math.hypot(fArr8[i26], fArr9[i26]);
                            float f77 = fArr4[i26];
                            float f78 = fArr5[i26];
                            if (fArr[i26] > 0.0f && hypot > 1.0f) {
                                float L14 = org.telegram.messenger.g0.L(3.0f) * ((float) Math.sin((fArr12[i26] * fArr[i26]) + fArr2[i26]));
                                f77 = com.google.android.recaptcha.internal.a.c(-fArr9[i26], hypot, L14, f77);
                                f78 = com.google.android.recaptcha.internal.a.c(fArr8[i26], hypot, L14, f78);
                            }
                            paint2.setAlpha((int) (exp * 255.0f));
                            float min5 = Math.min(1.8f, (hypot / org.telegram.messenger.g0.L(220.0f)) + 1.0f);
                            canvas3.save();
                            canvas3.rotate((float) Math.toDegrees(Math.atan2(fArr9[i26], fArr8[i26])), f77, f78);
                            float f79 = min4 * min5;
                            rectF14.set(f77 - f79, f78 - min4, f79 + f77, f78 + min4);
                            canvas3.drawOval(rectF14, paint2);
                            canvas3.restore();
                            if (bArr[i26] == 1) {
                                paint2.setAlpha((int) (exp * 36.0f));
                                canvas3.drawCircle(f77, f78, min4 * 2.2f, paint2);
                            }
                        } else {
                            canvas3.drawCircle(fArr4[i26], fArr5[i26], b10 == 1 ? f67 * f10 : f67, paint2);
                            if (bArr[i26] == 1) {
                                paint2.setAlpha((int) (pow * 36.0f));
                                canvas3.drawCircle(fArr4[i26], fArr5[i26], f67 * 4.4f, paint2);
                            }
                        }
                        i26--;
                        paint = paint2;
                        L12 = f24;
                        L13 = f25;
                        f58 = f22;
                        rectF2 = rectF5;
                        rectF13 = rectF4;
                        f21 = 0.12f;
                    }
                }
                i26--;
                paint = paint2;
                L12 = f24;
                L13 = f25;
                f58 = f22;
                rectF2 = rectF5;
                rectF13 = rectF4;
                f21 = 0.12f;
            }
            rectF = rectF2;
            if (z12) {
                canvas3.restore();
            }
        } else {
            textPaint = textPaint5;
            rectF = rectF7;
            f10 = 2.0f;
            f11 = f31;
            rectF6.setEmpty();
        }
        if (f11 > 0.001f) {
            long currentTimeMillis2 = System.currentTimeMillis();
            long j3 = l1Var.G2;
            long max4 = j3 > 0 ? Math.max(0L, (j3 - (currentTimeMillis2 / 1000)) - 1) : -1L;
            if (max4 != l1Var.N2) {
                l1Var.N2 = max4;
                l1Var.O2 = max4 >= 0 ? hd.a0(null, null, 2131746490, String.format(Locale.US, "%d:%02d", Long.valueOf(max4 / 60), Long.valueOf(max4 % 60))) : hd.M0(2131746497, null);
            }
            String str = l1Var.O2;
            textPaint.setTextSize(org.telegram.messenger.g0.L(11.0f));
            float measureText3 = textPaint.measureText(str) + org.telegram.messenger.g0.L(11.0f) + org.telegram.messenger.g0.L(11.0f);
            float L15 = org.telegram.messenger.g0.L(22.0f);
            float o10 = l1Var.o();
            float f80 = i7;
            float f81 = L15 / f10;
            RectF rectF15 = rectF;
            rectF15.set((f80 - measureText3) / f10, o10 - f81, (f80 + measureText3) / f10, o10 + f81);
            l1Var.z6 = true;
            float f82 = f11;
            l1Var.J(canvas3, rectF15, f81, f82);
            l1Var.z6 = false;
            textPaint.setColor(a(f82, -218103809));
            canvas3.drawText(str, rectF15.left + org.telegram.messenger.g0.L(11.0f), o10 + org.telegram.messenger.g0.L(4.0f), textPaint);
            if (l1Var.G2 > 0) {
                l1Var.postInvalidateDelayed(1005 - (currentTimeMillis2 % 1000));
            }
        }
    }

    public final void B0() {
        cb.c cVar;
        y0 y0Var;
        if (this.e2 || (cVar = this.c) == null || (y0Var = ((s0) cVar.b).e) == null) {
            return;
        }
        y0Var.j();
    }

    public final void C(Canvas canvas, Path path, RectF rectF, float f10, float f11) {
        int i7;
        RectF rectF2;
        float f12;
        float[][] fArr;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        int i10;
        int i11;
        Path path2 = path;
        int i12 = 1;
        if (path2 == null) {
            if (z.a(f10, f11, this.z6 ? 1 : this.A6 ? 2 : 0, canvas, rectF)) {
                return;
            }
        }
        int i13 = this.B6;
        SweepGradient[] sweepGradientArr = this.C6;
        int i14 = 4;
        float[][] fArr2 = o1.a;
        if (i13 != 1) {
            this.B6 = 1;
            int i15 = 0;
            while (i15 < i14) {
                float[] fArr3 = fArr2[i15];
                int i16 = i14;
                int[] iArr = new int[73];
                int i17 = i12;
                float[] fArr4 = new float[73];
                int i18 = 0;
                for (int i19 = 73; i18 < i19; i19 = 73) {
                    int i20 = i15;
                    double radians = Math.toRadians(i18 * 5);
                    float pow = (float) Math.pow(Math.abs(Math.cos(radians)), fArr3[6]);
                    float f18 = (((float) Math.sin(radians)) < 0.0f ? fArr3[11] : fArr3[12]) / 100.0f;
                    iArr[i18] = g(Math.min(1.0f, (((fArr3[5] / 100.0f) - f18) * pow) + f18), 0);
                    fArr4[i18] = i18 / 72.0f;
                    i18++;
                    i15 = i20;
                }
                int i21 = i15;
                sweepGradientArr[i21] = new SweepGradient(0.0f, 0.0f, iArr, fArr4);
                i15 = i21 + 1;
                i14 = i16;
                i12 = i17;
            }
        }
        int i22 = i12;
        int i23 = i14;
        int i24 = this.z6 ? i22 : this.A6 ? 2 : 0;
        float[] fArr5 = fArr2[i24];
        float f19 = this.D6;
        float[] fArr6 = o1.b;
        float f20 = f19 * fArr6[0];
        float f21 = (this.E6 * fArr6[i22]) / 100.0f;
        float N = org.telegram.messenger.g0.N(fArr5[8]);
        if (N != 0.0f) {
            rectF2 = this.c7;
            rectF2.set(rectF);
            rectF2.inset(N, N);
            if (path2 != null) {
                float width = rectF2.width() / Math.max(1.0f, rectF.width());
                float height = rectF2.height() / Math.max(1.0f, rectF.height());
                float centerX = rectF.centerX();
                float centerY = rectF.centerY();
                i7 = i24;
                Matrix matrix = this.W6;
                matrix.setScale(width, height, centerX, centerY);
                Path path3 = this.X6;
                path2.transform(matrix, path3);
                path2 = path3;
            } else {
                i7 = i24;
            }
            f12 = Math.max(0.0f, f10 - N);
        } else {
            i7 = i24;
            rectF2 = rectF;
            f12 = f10;
        }
        Matrix matrix2 = this.d7;
        matrix2.setRotate(f20);
        matrix2.postScale(rectF2.width() / Math.max(1.0f, rectF2.height()), 1.0f);
        matrix2.postTranslate(rectF2.centerX(), rectF2.centerY());
        float N2 = org.telegram.messenger.g0.N(fArr5[i23]);
        if (N2 > 0.05f) {
            SweepGradient sweepGradient = sweepGradientArr[i7];
            sweepGradient.setLocalMatrix(matrix2);
            Paint paint = this.A1;
            paint.setShader(sweepGradient);
            paint.setColor(-1);
            paint.setAlpha((int) (f11 * 255.0f));
            if (path2 == null) {
                paint.setStrokeWidth(N2);
                RectF rectF3 = this.V5;
                rectF3.set(rectF2);
                float f22 = (-N2) / 2.0f;
                rectF3.inset(f22, f22);
                float f23 = (N2 / 2.0f) + f12;
                canvas.drawRoundRect(rectF3, f23, f23, paint);
            } else {
                canvas.save();
                a0.b(canvas, path2);
                paint.setStrokeWidth(N2 * 2.0f);
                canvas.drawPath(path2, paint);
                canvas.restore();
            }
            paint.setShader(null);
            paint.setAlpha(qs.e4);
        }
        double radians2 = Math.toRadians(f20);
        float f24 = (float) (-Math.sin(radians2));
        float cos = (float) Math.cos(radians2);
        float N3 = org.telegram.messenger.g0.N(fArr5[0]);
        float N4 = org.telegram.messenger.g0.N(fArr5[2]);
        float f25 = this.A6 ? 0.0f : this.b6 * ((fArr6[21] * 1.25f) / 100.0f);
        if (f25 <= 0.0f || !this.y3) {
            fArr = fArr2;
            f13 = 0.0f;
        } else {
            fArr = fArr2;
            f13 = c1(rectF2.centerX(), rectF2.top, getWidth(), getHeight());
        }
        float c12 = (f25 <= 0.0f || !this.y3) ? 0.0f : c1(rectF2.centerX(), rectF2.bottom, getWidth(), getHeight());
        float min = Math.min(1.0f, ((f13 * f25) + 1.0f) * (f21 + 1.0f) * (fArr5[i22] / 100.0f));
        float min2 = Math.min(1.0f, ((f25 * c12) + 1.0f) * (1.0f - f21) * (fArr5[3] / 100.0f));
        int i25 = Build.VERSION.SDK_INT >= 29 ? i22 : 0;
        int i26 = 0;
        for (int i27 = 2; i26 < i27; i27 = 2) {
            float f26 = i26 == 0 ? N3 : -N4;
            float f27 = i26 == 0 ? min : min2;
            if (f27 <= 0.004f || Math.abs(f26) < 0.1f) {
                f14 = f12;
                f15 = min;
                f16 = min2;
                f17 = f24;
                i10 = i25;
                i11 = i22;
            } else {
                canvas.save();
                Path path4 = this.Z6;
                f15 = min;
                Path path5 = this.a7;
                if (path2 == null) {
                    f16 = min2;
                    f17 = f24;
                    float min3 = Math.min(f12, Math.min(rectF2.width(), rectF2.height()) / 2.0f);
                    path4.rewind();
                    Path.Direction direction = Path.Direction.CW;
                    path4.addRoundRect(rectF2, min3, min3, direction);
                    f14 = f12;
                    RectF rectF4 = this.Y6;
                    rectF4.set(rectF2);
                    i10 = i25;
                    rectF4.offset(f17 * f26, f26 * cos);
                    path5.rewind();
                    path5.addRoundRect(rectF4, min3, min3, direction);
                } else {
                    f14 = f12;
                    f16 = min2;
                    f17 = f24;
                    i10 = i25;
                    path4.set(path2);
                    path5.set(path2);
                    path5.offset(f17 * f26, f26 * cos);
                }
                a0.b(canvas, path5);
                Paint paint2 = this.z1;
                if (i10 == 0) {
                    float f28 = fArr[i7][10];
                    int i28 = this.b7;
                    paint2.setColor(Color.rgb(Math.max(0, Math.min(qs.e4, Math.round(((Color.red(i28) - qs.e4) * f28) + 255.0f))), Math.max(0, Math.min(qs.e4, Math.round(((Color.green(i28) - qs.e4) * f28) + 255.0f))), Math.max(0, Math.min(qs.e4, Math.round(((Color.blue(i28) - qs.e4) * f28) + 255.0f)))));
                    paint2.setAlpha((int) (f27 * 255.0f * f11));
                    i11 = i22;
                } else {
                    int round = Math.round(Math.max(0.0f, Math.min(1.0f, f27)) * 255.0f);
                    paint2.setColor(round | (round << 16) | (-16777216) | (round << 8));
                    paint2.setAlpha((int) (f11 * 255.0f));
                    i11 = i22;
                    a0.i(i11, paint2);
                }
                canvas.drawPath(path4, paint2);
                if (i10 != 0) {
                    a0.i(0, paint2);
                }
                canvas.restore();
            }
            i26++;
            i22 = i11;
            min = f15;
            min2 = f16;
            f24 = f17;
            f12 = f14;
            i25 = i10;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0054, code lost:
    
        if (r8 != false) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void D(Canvas canvas, i1 i1Var, int i7, float f10, float f11, float f12, float f13, float f14) {
        float f15;
        Drawable drawable = i1Var.b[i7];
        if (drawable == null || f13 <= 0.01f) {
            return;
        }
        boolean z9 = drawable instanceof i5;
        Bitmap V = z9 ? V((i5) drawable) : null;
        boolean z10 = false;
        if (!z9 ? !(drawable instanceof e6) || ((e6) drawable).a() : V != null) {
            z10 = true;
        }
        long[] jArr = i1Var.y;
        if (!this.T2) {
            if (jArr != null && i7 < jArr.length) {
                if (jArr[i7] != 1) {
                    if (this.S4) {
                        if (z10) {
                            long elapsedRealtime = SystemClock.elapsedRealtime();
                            if (jArr[i7] == 0) {
                                jArr[i7] = elapsedRealtime;
                            }
                            f15 = Utilities.l(((elapsedRealtime - jArr[i7]) - b(f14)) / 380.0f);
                        }
                    } else if (this.V2 && z10) {
                        jArr[i7] = 1;
                    }
                }
                if (f15 <= 0.0f) {
                    return;
                }
                float B = com.google.android.recaptcha.internal.a.B((float) Math.sin((this.M3 * 1.3f) + f12), 0.03f, 1.0f, (this.o0 + 1.0f) * (f15 < 1.0f ? h(f15) : 1.0f) * f13 * this.l0);
                int round = Math.round(f10 / 2.0f);
                if (V == null) {
                    canvas.save();
                    canvas.translate(this.J3, this.K3);
                    canvas.rotate(f11 + this.n0);
                    canvas.scale(B, B);
                    int i10 = -round;
                    drawable.setBounds(i10, i10, round, round);
                    drawable.setAlpha((int) (this.m0 * 255.0f));
                    if (x.d(drawable)) {
                        x.b(canvas, drawable);
                    } else {
                        drawable.draw(canvas);
                    }
                    drawable.setAlpha(qs.e4);
                    canvas.restore();
                    return;
                }
                float f16 = round * B;
                canvas.save();
                canvas.translate(this.J3, this.K3);
                canvas.rotate(f11 + this.n0);
                float f17 = -f16;
                RectF rectF = this.P4;
                rectF.set(f17, f17, f16, f16);
                if (x.d(drawable)) {
                    int i11 = (int) (this.m0 * 255.0f);
                    Paint paint = this.O4;
                    paint.setAlpha(i11);
                    canvas.drawBitmap(V, (Rect) null, rectF, paint);
                } else {
                    int i12 = (int) (this.m0 * 255.0f);
                    Paint paint2 = this.N4;
                    paint2.setAlpha(i12);
                    canvas.drawBitmap(V, (Rect) null, rectF, paint2);
                }
                canvas.restore();
                return;
            }
            f15 = 0.0f;
            if (f15 <= 0.0f) {
            }
        }
        f15 = 1.0f;
        if (f15 <= 0.0f) {
        }
    }

    public final void E(Canvas canvas, int i7, int i10, i1 i1Var, i1 i1Var2, float f10, boolean z9, boolean z10) {
        float f11;
        int i11;
        float f12;
        boolean z11;
        float f13;
        float f14;
        int i12;
        int i13;
        l1 l1Var = this;
        i1 i1Var3 = i1Var;
        i1 i1Var4 = i1Var2;
        l1Var.X(i1Var3);
        l1Var.X(i1Var4);
        float L = org.telegram.messenger.g0.L(86.0f);
        float L2 = org.telegram.messenger.g0.L(70.0f);
        float L3 = org.telegram.messenger.g0.L(90.0f) * 1.3f;
        float f15 = l1Var.K + l1Var.N;
        float f16 = l1Var.L + l1Var.O;
        float f17 = -L3;
        boolean z12 = true;
        int floor = ((int) Math.floor((f17 - f16) / L2)) - 1;
        int ceil = ((int) Math.ceil(((i10 + L3) - f16) / L2)) + 1;
        org.telegram.messenger.g0.L(24.0f);
        int i14 = floor;
        while (i14 <= ceil) {
            int i15 = i14 & 1;
            float f18 = i15 == 0 ? 0.0f : L / 2.0f;
            boolean z13 = z12;
            int floor2 = ((int) Math.floor(((f17 - f15) - f18) / L)) - 1;
            int i16 = i7;
            float f19 = L3;
            int ceil2 = ((int) Math.ceil((((i16 + L3) - f15) - f18) / L)) + 1;
            while (floor2 <= ceil2) {
                float f20 = L2;
                int i17 = ceil2;
                double u02 = u0(i14, floor2);
                if (c0(53.1d * u02) < 0.2f) {
                    f11 = f15;
                    i13 = floor2;
                    i11 = ceil;
                    i12 = i14;
                    f13 = f18;
                    f12 = L;
                    z11 = z13;
                    f14 = f17;
                } else {
                    l1Var.G0(u02, 3.0f, 10.0f);
                    float f21 = f17;
                    float f22 = (float) (2.0d * u02 * 3.141592653589793d);
                    f11 = f15;
                    float d = l1Var.L4 + rf.b.d(floor2, L, f18, f15);
                    float sin = (((float) Math.sin((l1Var.M3 * 0.45f) + f22)) * org.telegram.messenger.g0.L(3.0f)) + (i14 * f20) + f16 + l1Var.M4;
                    boolean z14 = i15 == 0 ? z13 : false;
                    i11 = ceil;
                    float f23 = (float) u02;
                    float B = com.google.android.recaptcha.internal.a.B(f23, 0.16f, 0.92f, org.telegram.messenger.g0.L(38.0f) * (z14 ? 1.3f : 0.9f));
                    f12 = L;
                    z11 = z13;
                    f13 = f18;
                    f14 = f21;
                    int i18 = floor2;
                    i12 = i14;
                    i13 = i18;
                    if (J0(d, sin, B, i16, i10, 0, i14, i18, (Math.max(0.0f, (B / org.telegram.messenger.g0.L(24.0f)) - 1.0f) * 0.8f) + 1.0f)) {
                        if (z14) {
                            B *= 0.9f;
                        }
                        float f24 = B;
                        float sin2 = (((float) Math.sin((this.M3 * 0.3f) + f22)) * 4.0f) + ((f23 - 0.5f) * 26.0f);
                        float c02 = c0(59.3d * u02) * 0.3f;
                        int i19 = (i13 - ((i12 - i15) / 2)) - i12;
                        int length = i1Var4.b.length;
                        int i20 = ((i19 % length) + length) % length;
                        float c03 = c0(71.9d * u02);
                        if (i1Var3 == null) {
                            D(canvas, i1Var4, i20, f24, sin2, f22 * 2.0f, f1(z9, z10, f10 - c02), c03);
                        } else {
                            i1 i1Var5 = i1Var4;
                            Drawable[] drawableArr = i1Var3.b;
                            int length2 = drawableArr.length;
                            int i21 = ((i19 % length2) + length2) % length2;
                            if (drawableArr[i21] == i1Var5.b[i20]) {
                                D(canvas, i1Var5, i20, f24, sin2, f22 * 2.0f, 1.0f, c03);
                            } else {
                                float f25 = f22 * 2.0f;
                                float f26 = f10 - c02;
                                D(canvas, i1Var3, i21, f24, sin2, f25, f1(z11, false, f26), c03);
                                D(canvas, i1Var2, i20, f24, sin2, f25, f1(false, false, f26), c03);
                            }
                        }
                    }
                }
                floor2 = i13 + 1;
                l1Var = this;
                i16 = i7;
                i1Var3 = i1Var;
                i1Var4 = i1Var2;
                i14 = i12;
                f17 = f14;
                ceil2 = i17;
                f18 = f13;
                f15 = f11;
                ceil = i11;
                L = f12;
                z13 = z11;
                L2 = f20;
            }
            i14++;
            l1Var = this;
            i1Var3 = i1Var;
            i1Var4 = i1Var2;
            z12 = z13;
            L2 = L2;
            L3 = f19;
        }
    }

    public final void E0(i1 i1Var, Bitmap bitmap) {
        i1Var.e = bitmap;
        if (bitmap != null) {
            if (o1.b[35] > 0.5f) {
                Y(bitmap);
            }
            x0(i1Var);
        }
        i1Var.g = AnimationUtils.currentAnimationTimeMillis();
        this.g2 = bitmap;
        invalidate();
    }

    /* JADX WARN: Removed duplicated region for block: B:133:0x073b  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x07c9  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0802  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x088e  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x07e4  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0747  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void F(Canvas canvas, int i7, int i10, i1 i1Var, boolean z9, boolean z10, float f10) {
        long[] jArr;
        float[] fArr;
        float f11;
        float[] fArr2;
        float[] fArr3;
        float[] fArr4;
        float[] fArr5;
        float f12;
        float f13;
        char c10;
        float f14;
        float f15;
        float l10;
        long j3;
        boolean z11;
        float f16;
        Rect rect;
        Bitmap bitmap;
        float f17;
        float f18;
        float f19;
        float f20;
        float f21;
        float[] fArr6;
        float[] fArr7;
        float[] fArr8;
        float[] fArr9;
        int[] iArr;
        int[] iArr2;
        float f22;
        boolean[] zArr;
        long[] jArr2;
        float f23;
        float f24;
        float f25;
        float f26;
        i1 i1Var2;
        Paint paint;
        float f27;
        Bitmap bitmap2;
        Paint paint2;
        int i11;
        float f28;
        l1 l1Var = this;
        if (i1Var != null) {
            Paint paint3 = i1Var.i;
            Paint paint4 = i1Var.v;
            int i12 = i1Var.a;
            if (i12 == 0) {
                return;
            }
            float f29 = l1Var.v3;
            if (i12 == 1) {
                l1Var.E(canvas, i7, i10, null, i1Var, f10, z9, z10);
                return;
            }
            i1 i1Var3 = i1Var;
            float f30 = l1Var.K + l1Var.N;
            float f31 = l1Var.L + l1Var.O;
            float L = org.telegram.messenger.g0.L(90.0f) * 1.3f;
            float L2 = org.telegram.messenger.g0.L(170.0f);
            float L3 = org.telegram.messenger.g0.L(150.0f);
            l1Var.K4 = 0;
            float f32 = -(org.telegram.messenger.g0.L(60.0f) + L);
            boolean z12 = true;
            Paint paint5 = paint3;
            int floor = ((int) Math.floor((f32 - f31) / L3)) - 1;
            float f33 = i10;
            int ceil = ((int) Math.ceil(((f33 + r8) - f31) / L3)) + 1;
            while (true) {
                jArr = l1Var.J4;
                fArr = l1Var.H4;
                f11 = f33;
                fArr2 = l1Var.G4;
                fArr3 = l1Var.F4;
                fArr4 = l1Var.E4;
                float f34 = f32;
                fArr5 = l1Var.I4;
                f12 = 0.5f;
                f13 = 2.0f;
                c10 = 0;
                if (floor > ceil) {
                    f14 = 0.0f;
                    break;
                }
                f14 = 0.0f;
                if (l1Var.K4 >= 96) {
                    break;
                }
                float f35 = (floor & 1) == 0 ? 0.0f : L2 / 2.0f;
                int i13 = ceil;
                int floor2 = ((int) Math.floor(((f34 - f30) - f35) / L2)) - 1;
                int ceil2 = ((int) Math.ceil((((i7 + r8) - f30) - f35) / L2)) + 1;
                while (floor2 <= ceil2 && l1Var.K4 < 96) {
                    float f36 = L2;
                    double u02 = u0(floor, floor2);
                    l1Var.G0(u02, 5.0f, 12.0f);
                    float f37 = f30;
                    fArr4[l1Var.K4] = (org.telegram.messenger.g0.L(76.0f) * (c0(u02 * 3.7d) - 0.5f)) + rf.b.d(floor2, f36, f35, f30) + l1Var.L4;
                    fArr3[l1Var.K4] = (org.telegram.messenger.g0.L(64.0f) * (c0(u02 * 5.3d) - 0.5f)) + (floor * L3) + f31 + l1Var.M4;
                    fArr2[l1Var.K4] = (c0(u02 * 11.9d) * org.telegram.messenger.g0.L(32.0f)) + org.telegram.messenger.g0.L(62.0f);
                    fArr[l1Var.K4] = (c0(17.3d * u02) - 0.5f) * 22.0f;
                    int i14 = l1Var.K4;
                    fArr5[i14] = (float) u02;
                    jArr[i14] = (floor << 32) ^ (floor2 & 4294967295L);
                    l1Var.K4 = i14 + 1;
                    floor2++;
                    L2 = f36;
                    ceil2 = ceil2;
                    f30 = f37;
                }
                floor++;
                L2 = L2;
                f33 = f11;
                f32 = f34;
                ceil = i13;
                f30 = f30;
            }
            float f38 = f30;
            l1Var.X(i1Var3);
            l1Var.Z(i1Var3);
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            Bitmap bitmap3 = i1Var3.e;
            Bitmap bitmap4 = bitmap3 != null ? bitmap3 : i1Var3.f;
            float l11 = (bitmap3 == null || i1Var3.f == null) ? 1.0f : Utilities.l((currentAnimationTimeMillis - i1Var3.g) / 150.0f);
            if (bitmap4 != null) {
                org.telegram.messenger.g0.L(44.0f);
                org.telegram.messenger.g0.L(38.0f);
                org.telegram.messenger.g0.L(17.0f);
                int i15 = i1Var3.r;
                l1Var.e4 = 0;
                float width = bitmap4.getWidth() / 2.0f;
                float f39 = 7.0f;
                if (l1Var.j4 != i15 || l1Var.f4 == null) {
                    l1Var.j4 = i15;
                    f17 = 0.55f;
                    Random random = new Random((i15 * 7919) + 20973);
                    float L4 = org.telegram.messenger.g0.L(300.0f);
                    int round = Math.round(33.46154f);
                    l1Var.f4 = new float[round];
                    l1Var.g4 = new float[round];
                    l1Var.h4 = new float[round];
                    int i16 = 0;
                    l1Var.i4 = 0;
                    int i17 = 0;
                    f18 = 0.35f;
                    while (i17 < round) {
                        float nextFloat = random.nextFloat();
                        f19 = 1.0f;
                        float L5 = ((((((nextFloat * 0.75f) * nextFloat) + 0.55f) * (org.telegram.messenger.g0.L(21.0f) * 1.1f)) / 2.0f) * 1.25f) + org.telegram.messenger.g0.L(7.0f);
                        int i18 = i17 + 12;
                        float f40 = f14;
                        float f41 = -3.4028235E38f;
                        float f42 = f40;
                        while (i16 < i18) {
                            float nextFloat2 = random.nextFloat() * L4;
                            float nextFloat3 = random.nextFloat() * L4;
                            int i19 = i17;
                            float f43 = Float.MAX_VALUE;
                            int i20 = i18;
                            int i21 = 0;
                            while (i21 < l1Var.i4) {
                                float abs = Math.abs(nextFloat2 - l1Var.f4[i21]);
                                float abs2 = Math.abs(nextFloat3 - l1Var.g4[i21]);
                                float f44 = L4 / 2.0f;
                                if (abs > f44) {
                                    abs = L4 - abs;
                                }
                                float f45 = abs;
                                if (abs2 > f44) {
                                    f20 = L4;
                                    f21 = L4 - abs2;
                                } else {
                                    f20 = L4;
                                    f21 = abs2;
                                }
                                int i22 = round;
                                float f46 = l1Var.h4[i21];
                                int i23 = i16;
                                f43 = Math.min(f43, ((((float) Math.hypot(f45, f21)) - L5) - (((((((f46 * 0.75f) * f46) + 0.55f) * (org.telegram.messenger.g0.L(21.0f) * 1.1f)) / 2.0f) * 1.25f) + org.telegram.messenger.g0.L(7.0f))) - ((nextFloat <= 0.7f || f46 <= 0.7f) ? f14 : org.telegram.messenger.g0.L(10.0f)));
                                i21++;
                                random = random;
                                L4 = f20;
                                round = i22;
                                i16 = i23;
                            }
                            float f47 = L4;
                            int i24 = round;
                            int i25 = i16;
                            Random random2 = random;
                            if (f43 > f41) {
                                f41 = f43;
                                f42 = nextFloat2;
                                f40 = nextFloat3;
                            }
                            i16 = i25 + 1;
                            random = random2;
                            i17 = i19;
                            i18 = i20;
                            L4 = f47;
                            round = i24;
                        }
                        int i26 = i17;
                        float f48 = L4;
                        int i27 = round;
                        Random random3 = random;
                        if (l1Var.i4 > 0 && f41 < org.telegram.messenger.g0.L(3.5f)) {
                            break;
                        }
                        float[] fArr10 = l1Var.f4;
                        int i28 = l1Var.i4;
                        fArr10[i28] = f42;
                        l1Var.g4[i28] = f40;
                        l1Var.h4[i28] = nextFloat;
                        l1Var.i4 = i28 + 1;
                        i17 = i26 + 1;
                        random = random3;
                        L4 = f48;
                        round = i27;
                        i16 = 0;
                    }
                } else {
                    f18 = 0.35f;
                    f17 = 0.55f;
                }
                f19 = 1.0f;
                float L6 = org.telegram.messenger.g0.L(300.0f);
                float f49 = -L;
                int floor3 = ((int) Math.floor((f49 - f31) / L6)) - 1;
                float f50 = f11 + L;
                int ceil3 = (int) Math.ceil((f50 - f31) / L6);
                int floor4 = ((int) Math.floor((f49 - f38) / L6)) - 1;
                float f51 = i7 + L;
                int ceil4 = (int) Math.ceil((f51 - f38) / L6);
                while (true) {
                    fArr6 = l1Var.d4;
                    float f52 = f50;
                    fArr7 = l1Var.c4;
                    fArr8 = l1Var.b4;
                    fArr9 = l1Var.a4;
                    iArr = l1Var.Z3;
                    iArr2 = l1Var.Y3;
                    if (floor3 > ceil3) {
                        break;
                    }
                    int i29 = floor4;
                    while (i29 <= ceil4) {
                        int i30 = ceil4;
                        float f53 = f49;
                        int i31 = 0;
                        while (i31 < l1Var.i4) {
                            int i32 = i31;
                            if (l1Var.e4 < 1024) {
                                float f54 = (i29 * L6) + l1Var.f4[i32];
                                float f55 = (floor3 * L6) + l1Var.g4[i32];
                                float f56 = f54 + f38;
                                float f57 = f55 + f31;
                                if (f56 < f53 - org.telegram.messenger.g0.L(20.0f) || f56 > org.telegram.messenger.g0.L(20.0f) + f51 || f57 < f53 - org.telegram.messenger.g0.L(20.0f) || f57 > f52 + org.telegram.messenger.g0.L(20.0f)) {
                                    i11 = i29;
                                } else {
                                    float f58 = l1Var.h4[i32];
                                    float L7 = ((((((f58 * 0.75f) * f58) + f17) * (org.telegram.messenger.g0.L(21.0f) * 1.1f)) / 2.0f) * 1.25f) + org.telegram.messenger.g0.L(7.0f);
                                    float L8 = org.telegram.messenger.g0.L(170.0f);
                                    float L10 = org.telegram.messenger.g0.L(150.0f);
                                    int round2 = Math.round(f55 / L10);
                                    int i33 = round2 - 1;
                                    while (true) {
                                        i11 = i29;
                                        if (i33 > round2 + 1) {
                                            int i34 = l1Var.e4;
                                            iArr2[i34] = (floor3 * TLObject.FLAG_12) + i32;
                                            iArr[i34] = i11;
                                            fArr9[i34] = f54;
                                            fArr8[i34] = f55;
                                            fArr7[i34] = f19;
                                            fArr6[i34] = f58;
                                            l1Var.e4 = i34 + 1;
                                            break;
                                        }
                                        float f59 = (i33 & 1) == 0 ? f14 : L8 / 2.0f;
                                        int round3 = Math.round((f54 - f59) / L8);
                                        float f60 = f59;
                                        int i35 = round3 - 1;
                                        while (true) {
                                            f28 = f55;
                                            if (i35 <= round3 + 1) {
                                                double u03 = u0(i33, i35);
                                                int i36 = i35;
                                                float c02 = ((c0(u03 * 3.7d) - 0.5f) * org.telegram.messenger.g0.L(76.0f)) + (i35 * L8) + f60;
                                                int i37 = i33;
                                                float c03 = ((c0(u03 * 5.3d) - 0.5f) * org.telegram.messenger.g0.L(64.0f)) + (i33 * L10);
                                                float c04 = (c0(u03 * 11.9d) * org.telegram.messenger.g0.L(32.0f)) + org.telegram.messenger.g0.L(62.0f);
                                                float c05 = L7 < f14 ? c04 * 0.66f : (((c0(u03 * 31.7d) * 7.0f) + 5.0f) * org.telegram.messenger.g0.L(f19)) + (c04 * f18) + L7 + org.telegram.messenger.g0.L(3.5f);
                                                float f61 = c02 - f54;
                                                float f62 = c03 - f28;
                                                if ((f62 * f62) + (f61 * f61) < c05 * c05) {
                                                    break;
                                                }
                                                i35 = i36 + 1;
                                                f55 = f28;
                                                i33 = i37;
                                            }
                                        }
                                        i33++;
                                        i29 = i11;
                                        f55 = f28;
                                    }
                                }
                                i31 = i32 + 1;
                                i29 = i11;
                            }
                        }
                        i29++;
                        ceil4 = i30;
                        f49 = f53;
                    }
                    floor3++;
                    f50 = f52;
                }
                int i38 = 0;
                while (i38 < l1Var.e4) {
                    int i39 = iArr2[i38];
                    int i40 = iArr[i38];
                    double u04 = u0(i39, i40);
                    float f63 = fArr9[i38];
                    float f64 = fArr8[i38];
                    float f65 = fArr7[i38];
                    float f66 = fArr6[i38];
                    int i41 = i38;
                    l1Var.G0(u04, f13, f39);
                    float f67 = f63 + f38 + l1Var.L4;
                    float f68 = f64 + f31 + l1Var.M4;
                    float c06 = c0(7.31d * u04);
                    float L11 = ((f66 * 0.75f * f66) + f17) * org.telegram.messenger.g0.L(21.0f) * 1.1f * f65;
                    int[] iArr3 = iArr2;
                    Bitmap bitmap5 = bitmap4;
                    Paint paint6 = paint4;
                    long[] jArr3 = jArr;
                    f39 = 7.0f;
                    l1Var = this;
                    if (l1Var.J0(f67, f68, L11, i7, i10, 1, i39, i40, (Math.max(f14, (L11 / org.telegram.messenger.g0.L(15.0f)) - f19) * 0.8f) + f19)) {
                        float f110 = f1(z9, z10, f10 - ((i1Var3.h || (z9 && l1Var.F.h)) ? l1Var.x1(l1Var.J3, l1Var.K3, i7, i10) : c0(u04 * 53.1d) * 0.3f));
                        if (f110 > 0.01f) {
                            float L0 = l1Var.L0(1.0f);
                            float f69 = l1Var.p0;
                            long j10 = (i40 & 4294967295L) ^ (i39 << 32);
                            int i42 = ((int) (((-7046029254386353131L) * j10) >>> 53)) & 2047;
                            int i43 = 0;
                            while (true) {
                                f22 = f110;
                                zArr = l1Var.y4;
                                jArr2 = l1Var.s4;
                                if (i43 >= 2048 || !zArr[i42] || jArr2[i42] == j10) {
                                    break;
                                }
                                i43++;
                                i42 = (i42 + 1) & 2047;
                                f110 = f22;
                            }
                            long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                            boolean z13 = zArr[i42];
                            float[] fArr11 = o1.b;
                            float[] fArr12 = l1Var.v4;
                            float[] fArr13 = l1Var.t4;
                            long[] jArr4 = l1Var.x4;
                            float[] fArr14 = l1Var.w4;
                            float[] fArr15 = l1Var.u4;
                            if (z13 && jArr2[i42] == j10) {
                                f23 = L11;
                                if (currentAnimationTimeMillis2 - jArr4[i42] <= 1000) {
                                    float exp = 1.0f - ((float) Math.exp((-Math.min(64.0f, r3)) / Math.max(10.0f, (((Math.abs(L0) > Math.abs(fArr15[i42]) || f69 > fArr14[i42]) ? fArr11[48] : fArr11[49]) / 3.4f) / 2.0f)));
                                    float f70 = fArr13[i42];
                                    float z14 = com.google.android.recaptcha.internal.a.z(L0, f70, exp, f70);
                                    fArr13[i42] = z14;
                                    float f71 = fArr15[i42];
                                    fArr15[i42] = com.google.android.recaptcha.internal.a.z(z14, f71, exp, f71);
                                    float f72 = fArr12[i42];
                                    float z15 = com.google.android.recaptcha.internal.a.z(f69, f72, exp, f72);
                                    fArr12[i42] = z15;
                                    float f73 = fArr14[i42];
                                    fArr14[i42] = com.google.android.recaptcha.internal.a.z(z15, f73, exp, f73);
                                    jArr4[i42] = currentAnimationTimeMillis2;
                                    f24 = fArr15[i42];
                                    float f74 = fArr14[i42];
                                    if (Math.abs(f24) <= 0.05f || f74 > 0.002f) {
                                        l1Var.invalidate();
                                    }
                                    float f75 = (l1Var.H3 * f24) + l1Var.J3;
                                    float f76 = (l1Var.I3 * f24) + l1Var.K3;
                                    f25 = l1Var.p0;
                                    float f77 = c0(61.37d * u04) * 100.0f >= fArr11[17] ? fArr11[18] / 100.0f : 1.0f;
                                    f26 = 0.35f;
                                    float pow = (float) Math.pow((Math.sin((u04 * 6.283d) + com.google.android.recaptcha.internal.a.B(c06, 0.55f, 0.35f, f29)) * 0.5d) + 0.5d, 2.0d);
                                    float B = (((((fArr11[43] / 100.0f) * f74) + 1.0f) * com.google.android.recaptcha.internal.a.B(pow, 0.1f, (0.06f * f25) + 1.0f, (l1Var.o0 + 1.0f) * (l1Var.l0 * f22))) * f23) / bitmap5.getWidth();
                                    float f78 = fArr11[44] * f74;
                                    canvas.save();
                                    canvas.translate(f75, f76);
                                    canvas.rotate(((c06 - 0.5f) * 70.0f) + l1Var.n0 + f78);
                                    canvas.scale(B, B);
                                    int i44 = (int) (((pow * 0.15f) + 0.85f) * l1Var.m0 * 255.0f * f77);
                                    if (l11 >= 1.0f) {
                                        paint = paint5;
                                        paint.setAlpha((int) ((1.0f - l11) * i44));
                                        i1Var2 = i1Var;
                                        f27 = width;
                                        float f79 = -f27;
                                        canvas.drawBitmap(r0(i1Var2, i1Var2.f, z12), f79, f79, paint);
                                    } else {
                                        i1Var2 = i1Var;
                                        paint = paint5;
                                        f27 = width;
                                    }
                                    paint.setAlpha((int) (i44 * l11));
                                    bitmap2 = bitmap5;
                                    float f80 = -f27;
                                    canvas.drawBitmap(r0(i1Var2, bitmap2, false), f80, f80, paint);
                                    if (f25 <= 0.01f) {
                                        ColorFilter colorFilter = paint6.getColorFilter();
                                        paint2 = paint6;
                                        paint2.setColorFilter(x0(i1Var2));
                                        paint2.setAlpha((int) (Math.min(1.0f, (fArr11[13] * f25) / 100.0f) * 255.0f * l1Var.m0 * l11));
                                        canvas.drawBitmap(bitmap2, f80, f80, paint2);
                                        paint2.setColorFilter(colorFilter);
                                        float f81 = fArr11[35];
                                        Paint paint7 = l1Var.z4;
                                        if (f81 > 0.5f && l1Var.Y(bitmap2)) {
                                            paint7.setColorFilter(l1Var.A0(i1Var2));
                                            paint7.setAlpha((int) (Math.min(255.0f, ((f25 * 255.0f) * fArr11[37]) / 100.0f) * l1Var.m0 * l11));
                                            canvas.drawBitmap(l1Var.S3, f80, f80, paint7);
                                        }
                                        float f82 = (l1Var.n4 * fArr11[22]) / 100.0f;
                                        if (f82 > 0.01f) {
                                            paint7.setColorFilter(l1Var.A0(i1Var2));
                                            paint7.setAlpha((int) (Math.min(1.0f, f82) * 255.0f * l1Var.m0 * l11));
                                            canvas.drawBitmap(bitmap2, f80, f80, paint7);
                                        }
                                    } else {
                                        paint2 = paint6;
                                    }
                                    canvas.restore();
                                    i38 = i41 + 1;
                                    bitmap4 = bitmap2;
                                    paint5 = paint;
                                    width = f27;
                                    paint4 = paint2;
                                    i1Var3 = i1Var2;
                                    jArr = jArr3;
                                    iArr2 = iArr3;
                                    f18 = f26;
                                    z12 = true;
                                    f13 = 2.0f;
                                    c10 = 0;
                                    f14 = 0.0f;
                                    f17 = 0.55f;
                                    f19 = 1.0f;
                                }
                            } else {
                                f23 = L11;
                            }
                            zArr[i42] = z12;
                            jArr2[i42] = j10;
                            fArr15[i42] = L0;
                            fArr13[i42] = L0;
                            fArr14[i42] = f69;
                            fArr12[i42] = f69;
                            jArr4[i42] = currentAnimationTimeMillis2;
                            f24 = fArr15[i42];
                            float f742 = fArr14[i42];
                            if (Math.abs(f24) <= 0.05f) {
                            }
                            l1Var.invalidate();
                            float f752 = (l1Var.H3 * f24) + l1Var.J3;
                            float f762 = (l1Var.I3 * f24) + l1Var.K3;
                            f25 = l1Var.p0;
                            if (c0(61.37d * u04) * 100.0f >= fArr11[17]) {
                            }
                            f26 = 0.35f;
                            float pow2 = (float) Math.pow((Math.sin((u04 * 6.283d) + com.google.android.recaptcha.internal.a.B(c06, 0.55f, 0.35f, f29)) * 0.5d) + 0.5d, 2.0d);
                            float B2 = (((((fArr11[43] / 100.0f) * f742) + 1.0f) * com.google.android.recaptcha.internal.a.B(pow2, 0.1f, (0.06f * f25) + 1.0f, (l1Var.o0 + 1.0f) * (l1Var.l0 * f22))) * f23) / bitmap5.getWidth();
                            float f782 = fArr11[44] * f742;
                            canvas.save();
                            canvas.translate(f752, f762);
                            canvas.rotate(((c06 - 0.5f) * 70.0f) + l1Var.n0 + f782);
                            canvas.scale(B2, B2);
                            int i442 = (int) (((pow2 * 0.15f) + 0.85f) * l1Var.m0 * 255.0f * f77);
                            if (l11 >= 1.0f) {
                            }
                            paint.setAlpha((int) (i442 * l11));
                            bitmap2 = bitmap5;
                            float f802 = -f27;
                            canvas.drawBitmap(r0(i1Var2, bitmap2, false), f802, f802, paint);
                            if (f25 <= 0.01f) {
                            }
                            canvas.restore();
                            i38 = i41 + 1;
                            bitmap4 = bitmap2;
                            paint5 = paint;
                            width = f27;
                            paint4 = paint2;
                            i1Var3 = i1Var2;
                            jArr = jArr3;
                            iArr2 = iArr3;
                            f18 = f26;
                            z12 = true;
                            f13 = 2.0f;
                            c10 = 0;
                            f14 = 0.0f;
                            f17 = 0.55f;
                            f19 = 1.0f;
                        }
                    }
                    i1Var2 = i1Var3;
                    paint = paint5;
                    paint2 = paint6;
                    bitmap2 = bitmap5;
                    f27 = width;
                    f26 = 0.35f;
                    i38 = i41 + 1;
                    bitmap4 = bitmap2;
                    paint5 = paint;
                    width = f27;
                    paint4 = paint2;
                    i1Var3 = i1Var2;
                    jArr = jArr3;
                    iArr2 = iArr3;
                    f18 = f26;
                    z12 = true;
                    f13 = 2.0f;
                    c10 = 0;
                    f14 = 0.0f;
                    f17 = 0.55f;
                    f19 = 1.0f;
                }
                f15 = f18;
            } else {
                f15 = 0.35f;
            }
            long[] jArr5 = jArr;
            i1 i1Var4 = i1Var3;
            i5 i5Var = i1Var4.d;
            Bitmap V = i5Var != null ? l1Var.V(i5Var) : null;
            Bitmap bitmap6 = (V == null || V.isRecycled()) ? null : V;
            Bitmap bitmap7 = i1Var4.D;
            if (bitmap6 == null && bitmap7 == null) {
                return;
            }
            if (i1Var4.C == 0 && l1Var.V2) {
                i1Var4.C = 1L;
            }
            if (i1Var4.C == 0 && l1Var.S4) {
                i1Var4.C = SystemClock.elapsedRealtime();
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (bitmap6 != null && i1Var4.E == 0) {
                i1Var4.E = (bitmap7 == null || i1Var4.C == 0) ? 1L : elapsedRealtime;
            }
            if (bitmap6 == null) {
                l10 = 0.0f;
            } else {
                l10 = i1Var4.E == 1 ? 1.0f : Utilities.l((elapsedRealtime - r8) / 150.0f);
            }
            if (l10 > 0.0f && l10 < 1.0f) {
                l1Var.invalidate();
            }
            if (l1Var.T2) {
                j3 = Long.MAX_VALUE;
            } else {
                long j11 = i1Var4.C;
                j3 = j11 == 0 ? -1L : elapsedRealtime - j11;
            }
            org.telegram.messenger.g0.L(41.0f);
            int i45 = 0;
            while (i45 < l1Var.K4) {
                long j12 = j3;
                float f83 = fArr2[i45];
                float sin = fArr3[i45] + (((float) Math.sin((fArr5[i45] * 2.0f * 3.141592653589793d) + (l1Var.M3 * f15))) * org.telegram.messenger.g0.L(3.0f));
                Bitmap bitmap8 = bitmap7;
                float f84 = fArr4[i45];
                long j13 = jArr5[i45];
                Bitmap bitmap9 = bitmap6;
                int i46 = i45;
                if (l1Var.J0(f84, sin, f83, i7, i10, 2, (int) (j13 >> 32), (int) j13, (Math.max(0.0f, (f83 / org.telegram.messenger.g0.L(40.0f)) - 1.0f) * 0.8f) + 1.0f)) {
                    z11 = z10;
                    float f111 = f1(z9, z11, f10 - ((i1Var4.h || (z9 && l1Var.F.h)) ? l1Var.x1(l1Var.J3, l1Var.K3, i7, i10) : c0(fArr5[i46] * 53.1d) * 0.3f));
                    if (f111 > 0.01f) {
                        float l12 = Utilities.l((j12 - l1Var.b(fArr5[i46])) / 380.0f);
                        if (l12 <= 0.0f) {
                            bitmap = bitmap9;
                            f16 = f12;
                            bitmap6 = bitmap;
                            j3 = j12;
                            f12 = f16;
                            i45 = i46 + 1;
                            bitmap7 = bitmap8;
                        } else {
                            float B3 = (f83 / 2.0f) * com.google.android.recaptcha.internal.a.B((float) Math.sin((fArr5[i46] * 12.6f) + (l1Var.M3 * 1.3f)), 0.03f, 1.0f, (l1Var.o0 + 1.0f) * f111 * (l12 < 1.0f ? h(l12) : 1.0f) * l1Var.l0);
                            f16 = f12;
                            float L02 = l1Var.L0(f16);
                            canvas.save();
                            canvas.translate((l1Var.H3 * L02) + l1Var.J3, (l1Var.I3 * L02) + l1Var.K3);
                            canvas.rotate(fArr[i46] + l1Var.n0);
                            float f85 = -B3;
                            RectF rectF = l1Var.D4;
                            rectF.set(f85, f85, B3, B3);
                            if (bitmap8 == null) {
                                rect = null;
                            } else if (l10 < 1.0f) {
                                int i47 = (int) ((1.0f - l10) * l1Var.m0 * 38.25f);
                                Paint paint8 = l1Var.C4;
                                paint8.setAlpha(i47);
                                rect = null;
                                canvas.drawBitmap(bitmap8, (Rect) null, rectF, paint8);
                            } else {
                                rect = null;
                            }
                            if (bitmap9 != null) {
                                int i48 = (int) (l1Var.m0 * 255.0f * l10);
                                Paint paint9 = l1Var.B4;
                                paint9.setAlpha(i48);
                                bitmap = bitmap9;
                                canvas.drawBitmap(bitmap, rect, rectF, paint9);
                            } else {
                                bitmap = bitmap9;
                            }
                            canvas.restore();
                            bitmap6 = bitmap;
                            j3 = j12;
                            f12 = f16;
                            i45 = i46 + 1;
                            bitmap7 = bitmap8;
                        }
                    }
                } else {
                    z11 = z10;
                }
                bitmap = bitmap9;
                f16 = f12;
                bitmap6 = bitmap;
                j3 = j12;
                f12 = f16;
                i45 = i46 + 1;
                bitmap7 = bitmap8;
            }
        }
    }

    public final void F0(int i7) {
        if (this.a) {
            if (i7 == 2 && !p10.i(this.b).q()) {
                d1(0, hd.M0(2131746473, null), hd.M0(2131746472, null));
                i0();
                return;
            }
            if (i7 == 2 && (this.h1 != i7 || this.f1 < 0.5f)) {
                AnimationUtils.currentAnimationTimeMillis();
            }
            this.h1 = i7;
            this.i1 = i7;
            this.j1 = 0.0f;
            this.k9.forceFinished(true);
            if (this.f1 > 0.5f) {
                this.c6 = AnimationUtils.currentAnimationTimeMillis();
            }
            if (this.g1 < 0.5f) {
                this.I2 = AnimationUtils.currentAnimationTimeMillis();
            }
            this.g1 = 1.0f;
            l0();
            if (this.h1 == 2) {
                y0();
            }
            i0();
        }
    }

    public final void G(Canvas canvas, RectF rectF, int i7) {
        float centerY = rectF.centerY();
        float L = org.telegram.messenger.g0.L(12.0f);
        i6 i6Var = this.L0;
        float c10 = i6Var.c() + org.telegram.messenger.g0.L(2.0f) + L;
        float L2 = rectF.left + org.telegram.messenger.g0.L(8.0f);
        O(canvas, L2, centerY, L, i7, true);
        i6Var.u(i7);
        i6Var.setBounds((int) (L2 + L + org.telegram.messenger.g0.L(2.0f)), (int) (centerY - org.telegram.messenger.g0.L(8.0f)), (int) (L2 + c10 + org.telegram.messenger.g0.L(40.0f)), (int) (centerY + org.telegram.messenger.g0.L(8.0f)));
        i6Var.draw(canvas);
    }

    public final void G0(double d, float f10, float f11) {
        float c02 = ((c0(31.7d * d) * (f11 - f10)) + f10) * org.telegram.messenger.g0.L(1.0f);
        double c03 = (d * 6.283d) + (((((c0(43.3d * d) < 0.5f ? -1.0d : 1.0d) * 2.0d) * 3.141592653589793d) * this.M3) / ((c0(37.1d * d) * 11.0f) + 9.0f));
        this.L4 = ((float) Math.cos(c03)) * c02;
        this.M4 = c02 * ((float) Math.sin(c03));
    }

    public final void H(Canvas canvas, RectF rectF, float f10) {
        j1 j1Var = this.n;
        int f11 = j1Var != null ? i0.a.f(0.5f, j1Var.b, j1Var.c) : -12947803;
        Paint paint = this.z1;
        paint.setColor(f11 | (-16777216));
        paint.setAlpha((int) (Utilities.l(f10) * 224.4f));
        canvas.drawRect(rectF, paint);
    }

    public final float H0() {
        return (a1() - b1()) + org.telegram.messenger.g0.L(8.0f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0171, code lost:
    
        if (r4.e != r3) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void I(Canvas canvas, int i7, TL_stars.TL_starGiftUnique tL_starGiftUnique, float f10, float f11, float f12, float f13) {
        float v;
        int size;
        int i10;
        TLRPC.Document document;
        RadialGradient radialGradient;
        float f14;
        g5 g5Var;
        float f15;
        float f16;
        TLRPC.Document document2;
        long currentAnimationTimeMillis;
        int i11;
        TLRPC.Document document3;
        float f17;
        float f18;
        float f19;
        Bitmap bitmap;
        Canvas canvas2 = canvas;
        long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
        int i12 = this.P7;
        if (i7 == i12) {
            if (this.S7 < this.R7) {
                float l10 = 1.0f - Utilities.l((currentAnimationTimeMillis2 - r14) / 120.0f);
                v = 1.0f - ((1.0f - (l10 * l10)) * 0.06f);
                if (v != 1.0f) {
                    canvas2.save();
                    canvas2.scale(v, v, (f12 / 2.0f) + f10, (f13 / 2.0f) + f11);
                }
                int[] iArr = this.h2;
                e0(iArr, i7);
                int i13 = iArr[0];
                int i14 = iArr[1];
                ArrayList<TL_stars.StarGiftAttribute> arrayList = tL_starGiftUnique.attributes;
                size = arrayList.size();
                i10 = 0;
                document = null;
                while (i10 < size) {
                    TL_stars.StarGiftAttribute starGiftAttribute = arrayList.get(i10);
                    i10++;
                    TL_stars.StarGiftAttribute starGiftAttribute2 = starGiftAttribute;
                    if (starGiftAttribute2 instanceof TL_stars.starGiftAttributeModel) {
                        document = ((TL_stars.starGiftAttributeModel) starGiftAttribute2).document;
                    }
                }
                RectF rectF = this.F1;
                rectF.set(f10, f11, f10 + f12, f11 + f13);
                Paint paint = this.z1;
                paint.setColor(-1);
                long j3 = tL_starGiftUnique.id;
                LongSparseArray longSparseArray = this.R5;
                radialGradient = (RadialGradient) longSparseArray.get(j3);
                if (radialGradient == null) {
                    radialGradient = new RadialGradient(0.0f, 0.0f, 1.0f, new int[]{i13, i14}, (float[]) null, Shader.TileMode.CLAMP);
                    longSparseArray.put(tL_starGiftUnique.id, radialGradient);
                }
                float f20 = f13 * 0.7f;
                float max = Math.max(1.0f, f12 / f13) * f20;
                Matrix matrix = this.O5;
                matrix.setScale(max, f20);
                matrix.postTranslate(rectF.centerX(), rectF.centerY());
                radialGradient.setLocalMatrix(matrix);
                paint.setShader(radialGradient);
                f14 = this.U7;
                canvas2.drawRoundRect(rectF, f14, f14, paint);
                paint.setShader(null);
                canvas2.save();
                Path path = this.E1;
                path.rewind();
                path.addRoundRect(rectF, f14, f14, Path.Direction.CW);
                canvas2.clipPath(path);
                int i15 = iArr[2] | (-16777216);
                k1 m12 = m1(tL_starGiftUnique);
                g5Var = m12.a;
                if (g5Var != null || g5Var.f[0] == null) {
                    f15 = f14;
                    f16 = 0.7f;
                    document2 = document;
                } else {
                    canvas2.save();
                    canvas2.translate(rectF.centerX(), rectF.centerY());
                    int i16 = Build.VERSION.SDK_INT;
                    if (i16 >= 29) {
                        g5 g5Var2 = m12.a;
                        f16 = 0.7f;
                        Drawable drawable = g5Var2.f[0];
                        if (drawable != null && g5Var2.d.c == 1.0f && (drawable instanceof i5)) {
                            i5 i5Var = (i5) drawable;
                            z2 z2Var = i5Var.k;
                            if (z2Var != null) {
                                long h = i5Var.h();
                                document2 = document;
                                if (h == m12.b) {
                                    bitmap = z2Var.n();
                                    if (bitmap == null) {
                                        if (m12.c != bitmap || m12.d == null) {
                                            m12.c = bitmap;
                                            m12.d = g0.a.a(bitmap);
                                        }
                                        m12.e = i15;
                                        m12.d.setColorFilter(i16 >= 29 ? a0.l(i15) : new PorterDuffColorFilter(i15, PorterDuff.Mode.SRC_IN));
                                        f15 = f14;
                                        bi.i1.b(canvas2, 2, m12.d, bitmap, rectF.width(), rectF.height(), 1.0f);
                                        canvas2 = canvas;
                                        canvas2.restore();
                                    } else {
                                        f15 = f14;
                                        m12.a.k(Integer.valueOf(i15));
                                        canvas2 = canvas;
                                        bi.i1.a(canvas2, 2, m12.a, rectF.width(), rectF.height(), 1.0f, 1.0f);
                                        canvas2.restore();
                                    }
                                }
                            } else {
                                document2 = document;
                            }
                            bitmap = null;
                            if (bitmap == null) {
                            }
                        } else {
                            f15 = f14;
                        }
                    } else {
                        f15 = f14;
                        f16 = 0.7f;
                    }
                    document2 = document;
                    m12.a.k(Integer.valueOf(i15));
                    canvas2 = canvas;
                    bi.i1.a(canvas2, 2, m12.a, rectF.width(), rectF.height(), 1.0f, 1.0f);
                    canvas2.restore();
                }
                canvas2.restore();
                paint.setColor(318767103);
                canvas2.drawRoundRect(rectF, f15, f15, paint);
                Paint paint2 = this.A1;
                paint2.setColor(1308622847);
                paint2.setStrokeWidth(Math.max(1.0f, org.telegram.messenger.g0.N(0.4f)));
                RectF rectF2 = this.V5;
                rectF2.set(rectF);
                rectF2.inset(0.5f, 0.5f);
                float f21 = f15 - 0.5f;
                canvas2.drawRoundRect(rectF2, f21, f21, paint2);
                currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                i11 = this.L7;
                if (i7 == i11 || this.O7 <= 0.5f) {
                    document3 = document2;
                    if (i7 != this.Q7 || (i7 == i11 && this.O7 < 0.5f)) {
                        float l11 = Utilities.l((currentAnimationTimeMillis - this.T7) / 180.0f);
                        f17 = 1.0f - (l11 * l11);
                    } else {
                        f17 = 0.0f;
                    }
                } else {
                    document3 = document2;
                    float l12 = 1.0f - Utilities.l((currentAnimationTimeMillis - this.S7) / 260.0f);
                    f17 = org.telegram.ui.Cells.f1.x(l12, l12, l12, 1.0f);
                }
                if (f17 <= 0.002f) {
                    boolean z9 = i7 == this.L7 && this.O7 > 0.5f;
                    f18 = 3.0f;
                    float T1 = org.telegram.messenger.g0.T1(org.telegram.messenger.g0.N(1.0f), org.telegram.messenger.g0.L(4.0f), f17);
                    float L = org.telegram.messenger.g0.L(2.0f) * f17;
                    float min = Math.min(1.0f, z9 ? f17 * 4.0f : f17 * 3.0f);
                    rectF2.set(rectF);
                    rectF2.inset(T1, T1);
                    paint2.setColor(-1);
                    paint2.setAlpha((int) (min * 255.0f * (i7 == this.L7 ? (f17 * 0.3f) + f16 : 1.0f)));
                    paint2.setStrokeWidth(L);
                    float f22 = f15 - T1;
                    canvas2.drawRoundRect(rectF2, Math.max(0.0f, f22), Math.max(0.0f, f22), paint2);
                } else {
                    f18 = 3.0f;
                }
                if (document3 != null) {
                    i5 g02 = g0(tL_starGiftUnique.id, document3);
                    float f23 = 0.82f * f13;
                    long currentAnimationTimeMillis3 = AnimationUtils.currentAnimationTimeMillis();
                    int i17 = this.L7;
                    if (i7 == i17 && this.O7 > 0.5f) {
                        f19 = 1.0f - (((float) h1((currentAnimationTimeMillis3 - this.S7) / 1000.0f, 0.6d, 0.3d)) * 0.14f);
                    } else if (i7 == this.Q7 || (i7 == i17 && this.O7 < 0.5f)) {
                        float l13 = Utilities.l((currentAnimationTimeMillis3 - this.T7) / 180.0f);
                        f19 = ((f18 - (l13 * 2.0f)) * 0.14f * l13 * l13) + 0.86f;
                    } else {
                        f19 = 1.0f;
                    }
                    float f24 = (f23 * f19) / 2.0f;
                    g02.setBounds((int) (rectF.centerX() - f24), (int) (rectF.centerY() - f24), (int) (rectF.centerX() + f24), (int) (rectF.centerY() + f24));
                    g02.setAlpha(qs.e4);
                    g02.setColorFilter(null);
                    g02.draw(canvas2);
                }
                if (v == 1.0f) {
                    canvas2.restore();
                    return;
                }
                return;
            }
        }
        v = i7 == i12 ? com.google.android.recaptcha.internal.a.v(1.0f, (float) h1((currentAnimationTimeMillis2 - this.S7) / 1000.0f, 0.6d, 0.3d), 0.06f, 1.0f) : 1.0f;
        if (v != 1.0f) {
        }
        int[] iArr2 = this.h2;
        e0(iArr2, i7);
        int i132 = iArr2[0];
        int i142 = iArr2[1];
        ArrayList<TL_stars.StarGiftAttribute> arrayList2 = tL_starGiftUnique.attributes;
        size = arrayList2.size();
        i10 = 0;
        document = null;
        while (i10 < size) {
        }
        RectF rectF3 = this.F1;
        rectF3.set(f10, f11, f10 + f12, f11 + f13);
        Paint paint3 = this.z1;
        paint3.setColor(-1);
        long j32 = tL_starGiftUnique.id;
        LongSparseArray longSparseArray2 = this.R5;
        radialGradient = (RadialGradient) longSparseArray2.get(j32);
        if (radialGradient == null) {
        }
        float f202 = f13 * 0.7f;
        float max2 = Math.max(1.0f, f12 / f13) * f202;
        Matrix matrix2 = this.O5;
        matrix2.setScale(max2, f202);
        matrix2.postTranslate(rectF3.centerX(), rectF3.centerY());
        radialGradient.setLocalMatrix(matrix2);
        paint3.setShader(radialGradient);
        f14 = this.U7;
        canvas2.drawRoundRect(rectF3, f14, f14, paint3);
        paint3.setShader(null);
        canvas2.save();
        Path path2 = this.E1;
        path2.rewind();
        path2.addRoundRect(rectF3, f14, f14, Path.Direction.CW);
        canvas2.clipPath(path2);
        int i152 = iArr2[2] | (-16777216);
        k1 m122 = m1(tL_starGiftUnique);
        g5Var = m122.a;
        if (g5Var != null) {
        }
        f15 = f14;
        f16 = 0.7f;
        document2 = document;
        canvas2.restore();
        paint3.setColor(318767103);
        canvas2.drawRoundRect(rectF3, f15, f15, paint3);
        Paint paint22 = this.A1;
        paint22.setColor(1308622847);
        paint22.setStrokeWidth(Math.max(1.0f, org.telegram.messenger.g0.N(0.4f)));
        RectF rectF22 = this.V5;
        rectF22.set(rectF3);
        rectF22.inset(0.5f, 0.5f);
        float f212 = f15 - 0.5f;
        canvas2.drawRoundRect(rectF22, f212, f212, paint22);
        currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        i11 = this.L7;
        if (i7 == i11) {
        }
        document3 = document2;
        if (i7 != this.Q7) {
        }
        float l112 = Utilities.l((currentAnimationTimeMillis - this.T7) / 180.0f);
        f17 = 1.0f - (l112 * l112);
        if (f17 <= 0.002f) {
        }
        if (document3 != null) {
        }
        if (v == 1.0f) {
        }
    }

    public final void I0(float f10, float f11, int i7) {
        Path path;
        int i10;
        int i11;
        TLRPC.Document document;
        TLRPC.Document document2;
        TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.v1.get(i7);
        j1 j1Var = new j1();
        j1Var.a = 2;
        j1Var.f = i7;
        final i1 i1Var = new i1();
        i1Var.a = 2;
        i1Var.q = i7;
        long j3 = tL_starGiftUnique.id;
        i1Var.r = (int) (j3 ^ (j3 >>> 32));
        ArrayList<TL_stars.StarGiftAttribute> arrayList = tL_starGiftUnique.attributes;
        int size = arrayList.size();
        int i12 = 0;
        int i13 = 0;
        while (i13 < size) {
            TL_stars.StarGiftAttribute starGiftAttribute = arrayList.get(i13);
            i13++;
            TL_stars.StarGiftAttribute starGiftAttribute2 = starGiftAttribute;
            if ((starGiftAttribute2 instanceof TL_stars.starGiftAttributePattern) && (document2 = ((TL_stars.starGiftAttributePattern) starGiftAttribute2).document) != null) {
                i1Var.A = document2;
                i1Var.c = i5.l(this.b, 9, document2);
            } else if ((starGiftAttribute2 instanceof TL_stars.starGiftAttributeModel) && (document = ((TL_stars.starGiftAttributeModel) starGiftAttribute2).document) != null) {
                i1Var.z = document;
                i1Var.d = i5.l(this.b, 24, document);
            }
        }
        e0(this.h2, i7);
        j1Var.b = x(this.h2[0], false);
        int x10 = x(this.h2[1], true);
        j1Var.c = x10;
        j1Var.d = this.h2[2];
        j1Var.e = v(j1Var.b, x10);
        j1Var.h = Z0(j1Var.b);
        j1Var.g = h.k(0.5f, j1Var.b, j1Var.c);
        i1Var.j = l1(j1Var.d, j1Var.b);
        double[] dArr = {r15, 0.0d, 0.0d};
        i0.a.j(l1(j1Var.d, j1Var.b) | (-16777216), dArr);
        double min = Math.min(97.0d, dArr[0] + 20.0d);
        float[] fArr = new float[3];
        Color.colorToHSV(i0.a.b(min, dArr[1], dArr[2]), fArr);
        fArr[1] = Math.min(1.0f, fArr[1] * 1.15f);
        i1Var.s = Color.HSVToColor(fArr) | (-16777216);
        i1Var.v.setColorFilter(new PorterDuffColorFilter(i1Var.s, PorterDuff.Mode.SRC_IN));
        i1Var.t = -1;
        i1Var.B = tL_starGiftUnique;
        i5 i5Var = i1Var.c;
        if (i5Var != null) {
            i5Var.a(this);
        }
        i5 i5Var2 = i1Var.d;
        if (i5Var2 != null) {
            i5Var2.a(this);
        }
        TLRPC.Document document3 = i1Var.z;
        if (document3 != null) {
            int i14 = 0;
            while (true) {
                if (i14 >= document3.thumbs.size()) {
                    path = null;
                    break;
                } else {
                    if (document3.thumbs.get(i14) instanceof TLRPC.TL_photoPathSize) {
                        path = ((TLRPC.TL_photoPathSize) document3.thumbs.get(i14)).svgPath;
                        break;
                    }
                    i14++;
                }
            }
            if (path != null) {
                while (true) {
                    if (i12 >= document3.attributes.size()) {
                        i10 = 512;
                        i11 = 512;
                        break;
                    }
                    TLRPC.DocumentAttribute documentAttribute = document3.attributes.get(i12);
                    if (((documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) && (i10 = documentAttribute.w) > 0 && (i11 = documentAttribute.h) > 0) {
                        break;
                    } else {
                        i12++;
                    }
                }
                final Path path2 = new Path(path);
                float f12 = I9;
                final float f13 = f12 / i10;
                final float f14 = f12 / i11;
                final int i15 = i1Var.j;
                Utilities.e.c(new Runnable() { // from class: ai.e1
                    @Override // java.lang.Runnable
                    public final void run() {
                        Bitmap bitmap;
                        float f15 = f13;
                        float f16 = f14;
                        int i16 = i15;
                        Path path3 = path2;
                        try {
                            int i17 = l1.I9;
                            bitmap = Bitmap.createBitmap(i17, i17, Bitmap.Config.ARGB_8888);
                            Canvas canvas = new Canvas(bitmap);
                            canvas.scale(f15, f16);
                            Paint paint = new Paint(1);
                            paint.setColor(i16);
                            canvas.drawPath(path3, paint);
                            bitmap.prepareToDraw();
                        } catch (Throwable th2) {
                            a8.g(th2, true);
                            bitmap = null;
                        }
                        org.telegram.messenger.g0.h3(new aa.s(l1.this, i1Var, bitmap, 3));
                    }
                });
            }
        }
        this.I.clear();
        Y0(j1Var, f10, f11);
        if (!this.f2) {
            this.p2 = j(this.n2, 0.03f, 0.005f);
            this.n2 = AnimationUtils.currentAnimationTimeMillis();
        }
        setPattern(i1Var);
    }

    public final void J(Canvas canvas, RectF rectF, float f10, float f11) {
        RectF rectF2;
        float f12;
        RectF rectF3;
        float f13;
        char c10;
        char c11;
        if (f11 <= 0.0f) {
            return;
        }
        if (this.A6) {
            float min = Math.min(0.0f, org.telegram.messenger.g0.N(o1.a[2][8]));
            rectF3 = this.W5;
            rectF2 = rectF;
            rectF3.set(rectF2);
            rectF3.inset(min, min);
            f12 = f10 - min;
        } else {
            rectF2 = rectF;
            f12 = f10;
            rectF3 = rectF2;
        }
        boolean z9 = (j0(canvas) || this.Y2 == null) ? false : true;
        if (z9 && this.Y2 != null && this.a3 != null) {
            float f14 = this.f3;
            Matrix matrix = this.d3;
            matrix.setScale(f14, f14);
            float f15 = (-f14) / 2.0f;
            matrix.postTranslate(f15, f15);
            this.a3.setLocalMatrix(matrix);
            int l10 = (int) (Utilities.l(f11) * 255.0f);
            Paint paint = this.c3;
            paint.setAlpha(l10);
            canvas.drawRoundRect(rectF3, f12, f12, paint);
            paint.setAlpha(qs.e4);
        }
        Path path = this.E1;
        path.rewind();
        path.addRoundRect(rectF3, f12, f12, Path.Direction.CW);
        canvas.save();
        canvas.clipPath(path);
        float[] fArr = o1.b;
        if (z9) {
            f13 = 0.0f;
            c10 = '\t';
            c11 = 3;
        } else if (a0.f() && j0(canvas)) {
            f13 = 0.0f;
            if (f11 < 1.0f) {
                canvas.saveLayerAlpha(rectF3, (int) (f11 * 255.0f));
            }
            if (!this.s6 || this.r6 <= 0.004f) {
                c10 = '\t';
                c11 = 3;
                Object obj = this.H1;
                canvas.save();
                canvas.scale(9.0f, 9.0f);
                a0.c(canvas, obj);
                canvas.restore();
            } else {
                canvas.save();
                canvas.scale(8.0f, 8.0f);
                if (this.t6 == null) {
                    this.t6 = android.support.v4.media.session.w.d("qrSheetLift");
                }
                float round = Math.round(this.r6 * 50.0f) / 50.0f;
                c10 = '\t';
                j1 j1Var = this.n;
                int i7 = j1Var != null ? j1Var.b : 0;
                if (round == this.u6 && this.v6 == 1 && this.w6 == i7) {
                    c11 = 3;
                } else {
                    this.u6 = round;
                    this.v6 = 1;
                    this.w6 = i7;
                    Object obj2 = this.t6;
                    c11 = 3;
                    float max = (fArr[10] / 100.0f) * round * ((float) Math.max(0.0d, Math.min(1.0d, (0.85d - (j1Var != null ? i0.a.h(j1Var.b) : 0.3d)) / 0.45d)));
                    float c12 = com.google.android.recaptcha.internal.a.c(fArr[11], 100.0f, round, 1.0f);
                    float f16 = ((0.5f - (c12 * 0.5f)) + max) * 255.0f;
                    a0.k(obj2, Math.max(0.5f, org.telegram.messenger.g0.N(org.telegram.messenger.g0.T1(fArr[2], fArr[12], round)) / 8.0f), new float[]{c12, 0.0f, 0.0f, 0.0f, f16, 0.0f, c12, 0.0f, 0.0f, f16, 0.0f, 0.0f, c12, 0.0f, f16, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f});
                }
                Canvas a10 = a0.a((getWidth() + 7) / 8, (getHeight() + 7) / 8, this.t6);
                a10.scale(0.125f, 0.125f);
                a0.c(a10, this.G1);
                a0.d(this.t6);
                a0.c(canvas, this.t6);
                canvas.restore();
            }
            if (f11 < 1.0f) {
                canvas.restore();
            }
        } else {
            f13 = 0.0f;
            c10 = '\t';
            c11 = 3;
            H(canvas, rectF3, f11);
        }
        int i10 = this.T8;
        if (i10 == 0) {
            i10 = g((fArr[c11] + (this.s6 ? fArr[c10] * this.r6 : f13)) / 100.0f, 16777215);
        }
        Paint paint2 = this.z1;
        paint2.setColor(i10);
        paint2.setAlpha((int) (Color.alpha(paint2.getColor()) * f11));
        canvas.drawRect(rectF3, paint2);
        z.b(canvas, rectF3, f11);
        boolean z10 = this.s6;
        if ((((z10 || this.A6) ? f13 : (fArr[21] / 100.0f) * this.b6) > f13 || fArr[39] > f13) && this.y3 && !z10 && !this.A6) {
            int width = getWidth();
            int height = getHeight();
            float c13 = c1(rectF3.left, rectF3.centerY(), width, height);
            float c14 = c1(rectF3.centerX(), rectF3.centerY(), width, height);
            float c15 = c1(rectF3.right, rectF3.centerY(), width, height);
            if (c13 + c14 + c15 > 0.01f) {
                float f17 = ((fArr[39] * 1.25f) / 100.0f) * this.b6 * 0.1f;
                float f18 = c14 * f17 * f11;
                float f19 = f17 * c15 * f11;
                float centerX = rectF3.centerX();
                L(rectF3.left, centerX, c13 * f17 * f11, f18, canvas, rectF3);
                L(centerX, rectF3.right, f18, f19, canvas, rectF3);
            }
        }
        canvas.restore();
        C(canvas, null, rectF2, f10, f11);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean J0(float f10, float f11, float f12, int i7, int i10, int i11, int i12, int i13, float f13) {
        float f14;
        float f15;
        int i14;
        int i15;
        float f16;
        int i16;
        float f17;
        float f18;
        float f19;
        float f20;
        float f21;
        float f22;
        float f23;
        float f24;
        float exp;
        float f25;
        float f26;
        float g12;
        float f27;
        float f28;
        float L = org.telegram.messenger.g0.L(90.0f);
        float f29 = 1.3f * L;
        float f30 = -f29;
        if (f10 < f30) {
            return false;
        }
        float f31 = i7;
        if (f10 > f31 + f29 || f11 < f30) {
            return false;
        }
        float f32 = i10;
        if (f11 > f29 + f32) {
            return false;
        }
        long j3 = ((i11 << 60) ^ ((i12 & 1073741823) << 30)) ^ (i13 & 1073741823);
        h1 h1Var = this.L3;
        int i17 = h1Var.m;
        float[] fArr = h1Var.j;
        float[] fArr2 = h1Var.i;
        float[] fArr3 = h1Var.h;
        float[] fArr4 = h1Var.g;
        float[] fArr5 = h1Var.f;
        float[] fArr6 = h1Var.e;
        float[] fArr7 = h1Var.d;
        float[] fArr8 = h1Var.c;
        long[] jArr = h1Var.a;
        boolean[] zArr = h1Var.b;
        int[] iArr = h1Var.k;
        int i18 = -1;
        if (i17 == 0) {
            f14 = f32;
            f15 = f31;
        } else {
            long j10 = (j3 ^ (j3 >>> 33)) * (-49064778989728563L);
            f14 = f32;
            f15 = f31;
            i14 = (int) ((j10 ^ (j10 >>> 33)) & 4095);
            while (zArr[i14]) {
                if (jArr[i14] == j3) {
                    break;
                }
                i14 = (i14 + 1) & 4095;
            }
        }
        i14 = -1;
        if (this.s >= 1.0f || this.r == null) {
            i15 = i14;
            f16 = 0.0f;
        } else {
            if (i14 >= 0) {
                f16 = 0.0f;
                if (iArr[i14] == this.q0) {
                    i15 = i14;
                }
            } else {
                f16 = 0.0f;
            }
            float f33 = this.x;
            i15 = i14;
            double max = Math.max(f33, f15 - f33);
            float f34 = this.y;
            float hypot = ((float) Math.hypot(max, Math.max(f34, f14 - f34))) + org.telegram.messenger.g0.L(60.0f);
            float f35 = f10 - this.x;
            float f36 = f11 - this.y;
            float sqrt = (float) Math.sqrt((f36 * f36) + (f35 * f35));
            if (sqrt <= y1(this.s) * hypot) {
                if (i15 < 0) {
                    if (h1Var.m >= 3072) {
                        f27 = f35;
                        f28 = f36;
                    } else {
                        long j11 = (j3 ^ (j3 >>> 33)) * (-49064778989728563L);
                        f28 = f36;
                        int i19 = (int) ((j11 ^ (j11 >>> 33)) & 4095);
                        while (true) {
                            if (!zArr[i19]) {
                                zArr[i19] = true;
                                jArr[i19] = j3;
                                iArr[i19] = -1;
                                fArr[i19] = f16;
                                fArr2[i19] = f16;
                                fArr3[i19] = f16;
                                fArr4[i19] = f16;
                                fArr5[i19] = f16;
                                fArr6[i19] = f16;
                                fArr7[i19] = f16;
                                fArr8[i19] = f16;
                                int[] iArr2 = h1Var.l;
                                f27 = f35;
                                int i20 = h1Var.m;
                                h1Var.m = i20 + 1;
                                iArr2[i20] = i19;
                                break;
                            }
                            if (jArr[i19] == j3) {
                                f27 = f35;
                                break;
                            }
                            i19 = (i19 + 1) & 4095;
                        }
                        i18 = i19;
                    }
                    i16 = i18;
                } else {
                    f27 = f35;
                    f28 = f36;
                    i16 = i15;
                }
                if (i16 >= 0) {
                    iArr[i16] = this.q0;
                    float f37 = 1.0f / f13;
                    float f38 = sqrt > 1.0f ? f27 / sqrt : f16;
                    float f39 = sqrt > 1.0f ? f28 / sqrt : -1.0f;
                    fArr6[i16] = com.google.android.recaptcha.internal.a.x(f38, org.telegram.messenger.g0.L(360.0f), f37, fArr6[i16]);
                    fArr5[i16] = com.google.android.recaptcha.internal.a.x(f39, org.telegram.messenger.g0.L(360.0f), f37, fArr5[i16]);
                    fArr3[i16] = com.google.android.recaptcha.internal.a.x(f38 >= f16 ? 1.0f : -1.0f, 180.0f, f37, fArr3[i16]);
                    fArr[i16] = fArr[i16] + 1.8f;
                }
                if (i16 < 0) {
                    f17 = f10 + fArr8[i16];
                    f18 = f11 + fArr7[i16];
                    this.n0 = fArr4[i16];
                    this.o0 = fArr2[i16];
                } else {
                    float f40 = f16;
                    this.n0 = f40;
                    this.o0 = f40;
                    f17 = f10;
                    f18 = f11;
                }
                float f41 = f15 / 2.0f;
                float l10 = (l() / 2.0f) + m();
                f19 = f17 - f41;
                f20 = f18 - l10;
                if (f19 <= 0.5f) {
                    f22 = 1.0f;
                    f21 = 2.0f;
                    f23 = Math.max(0.0f, f19 / Math.max(1.0f, f15 - f41));
                } else {
                    f21 = 2.0f;
                    f22 = 1.0f;
                    f23 = 0.0f;
                    if (f19 < -0.5f) {
                        f23 = Math.max(0.0f, (-f19) / Math.max(1.0f, f41));
                    }
                }
                if (f20 <= 0.5f) {
                    f23 = Math.max(f23, f20 / Math.max(f22, f14 - l10));
                } else if (f20 < -0.5f) {
                    f23 = Math.max(f23, (-f20) / Math.max(f22, l10));
                }
                float min = Math.min(f22, f23);
                float g13 = f22 - (g1(0.55f, f22, min) * 0.22f);
                float g14 = f22 - (g1(0.8f, f22, min) * 0.2f);
                if (f17 < L || f17 > f15 - f17) {
                    if (f15 - f17 >= L) {
                        exp = (float) Math.exp((r9 / L) - 1.0f);
                        f25 = f15 - (L * exp);
                    } else {
                        f24 = 1.0f;
                        if (f18 < L || f18 > f14 - f18) {
                            if (f14 - f18 < L) {
                                float exp2 = (float) Math.exp((r10 / L) - 1.0f);
                                f26 = f14 - (L * exp2);
                                f24 = Math.min(f24, exp2);
                            }
                            g12 = g1(0.08f, 0.25f, f24) * g14;
                            this.m0 = g12;
                            if (g12 <= 0.004f) {
                                return false;
                            }
                            if (f12 * g13 < org.telegram.messenger.g0.L(10.0f)) {
                                g13 = org.telegram.messenger.g0.L(10.0f) / Math.max(1.0f, f12);
                            }
                            float f42 = f24 * g13;
                            if (i11 != 1) {
                                f42 = Math.max(f42, Math.min(f12, org.telegram.messenger.g0.L(9.0f)) / Math.max(1.0f, f12));
                            }
                            this.l0 = f42;
                            float f43 = (f12 * f42) / f21;
                            float l11 = Utilities.l(Math.min(Math.min(f17 - f43, (f15 - f17) - f43), Math.min(f18 - f43, (f14 - f18) - f43)) / org.telegram.messenger.g0.L(12.0f));
                            float f44 = (3.0f - (l11 * f21)) * l11 * l11 * this.m0;
                            this.m0 = f44;
                            if (f44 <= 0.004f) {
                                return false;
                            }
                            this.J3 = f17;
                            this.K3 = f18;
                            this.p0 = c1(f17, f18, i7, i10);
                            this.n4 = this.m4;
                            this.q4 = this.o4;
                            this.r4 = this.p4;
                            return true;
                        }
                        float exp3 = (float) Math.exp((f18 / L) - 1.0f);
                        f26 = L * exp3;
                        f24 = Math.min(f24, exp3);
                        f18 = f26;
                        g12 = g1(0.08f, 0.25f, f24) * g14;
                        this.m0 = g12;
                        if (g12 <= 0.004f) {
                        }
                    }
                } else {
                    exp = (float) Math.exp((f17 / L) - f22);
                    f25 = L * exp;
                }
                float f45 = f25;
                f24 = exp;
                f17 = f45;
                if (f18 < L) {
                }
                if (f14 - f18 < L) {
                }
                g12 = g1(0.08f, 0.25f, f24) * g14;
                this.m0 = g12;
                if (g12 <= 0.004f) {
                }
            }
        }
        i16 = i15;
        if (i16 < 0) {
        }
        float f412 = f15 / 2.0f;
        float l102 = (l() / 2.0f) + m();
        f19 = f17 - f412;
        f20 = f18 - l102;
        if (f19 <= 0.5f) {
        }
        if (f20 <= 0.5f) {
        }
        float min2 = Math.min(f22, f23);
        float g132 = f22 - (g1(0.55f, f22, min2) * 0.22f);
        float g142 = f22 - (g1(0.8f, f22, min2) * 0.2f);
        if (f17 < L) {
        }
        if (f15 - f17 >= L) {
        }
    }

    public final void K(Canvas canvas) {
        float f10;
        float f11;
        int i7;
        float f12;
        Canvas canvas2 = canvas;
        if (this.k1 <= 0.001f) {
            return;
        }
        float L = org.telegram.messenger.g0.L(222.0f);
        float L2 = org.telegram.messenger.g0.L(46.0f);
        float L3 = org.telegram.messenger.g0.L(54.0f);
        org.telegram.messenger.g0.L(8.0f);
        float f13 = this.y0 ? L2 + L2 : L2 + L3 + L2;
        float f14 = this.f1;
        RectF rectF = this.J5;
        float L4 = f14 > 0.5f ? (rectF.bottom + org.telegram.messenger.g0.L(6.0f)) - f13 : rectF.top - org.telegram.messenger.g0.L(6.0f);
        float width = (getWidth() - L) / 2.0f;
        RectF rectF2 = this.K8;
        rectF2.set(width, L4, L + width, f13 + L4);
        float f15 = this.E8;
        float f16 = this.F8;
        float l10 = Utilities.l(this.k1);
        float T1 = org.telegram.messenger.g0.T1(rectF.left, rectF2.left, f15);
        float T12 = org.telegram.messenger.g0.T1(rectF.top, rectF2.top, f16);
        float T13 = org.telegram.messenger.g0.T1(rectF.right, rectF2.right, f15);
        float T14 = org.telegram.messenger.g0.T1(rectF.bottom, rectF2.bottom, f16);
        RectF rectF3 = this.J8;
        rectF3.set(T1, T12, T13, T14);
        float min = Math.min(rectF3.height() / 2.0f, Math.min(rectF3.width() / 2.0f, org.telegram.messenger.g0.T1(rectF.height() / 2.0f, org.telegram.messenger.g0.L(22.0f), Utilities.l(f16))));
        float max = Math.max(-0.25f, Math.min(1.0f, this.G8 / 9.0f)) * org.telegram.messenger.g0.L(5.0f);
        float f17 = rectF3.left;
        float f18 = rectF3.top;
        float f19 = rectF3.right;
        float f20 = 1.0f;
        float f21 = rectF3.bottom;
        float centerX = rectF3.centerX();
        Path path = this.I8;
        path.rewind();
        float f22 = f17 + min;
        path.moveTo(f22, f18);
        float f23 = f19 - min;
        path.lineTo(f23, f18);
        float f24 = f18 + min;
        path.quadTo(f19, f18, f19, f24);
        float f25 = f21 - min;
        path.lineTo(f19, f25);
        path.quadTo(f19, f21, f23, f21);
        float f26 = f21 + max;
        path.cubicTo(org.telegram.messenger.g0.T1(f23, centerX, 0.55f), f26, org.telegram.messenger.g0.T1(f22, centerX, 0.55f), f26, f22, f21);
        path.quadTo(f17, f21, f17, f25);
        path.lineTo(f17, f24);
        path.quadTo(f17, f18, f22, f18);
        path.close();
        float max2 = Math.max(0.0f, max) + f21;
        RectF rectF4 = this.F1;
        rectF4.set(f17, f18, f19, max2);
        canvas2.save();
        canvas2.clipPath(path);
        float f27 = 255.0f;
        if (a0.f() && j0(canvas)) {
            Object obj = this.H1;
            canvas2.save();
            canvas2.scale(9.0f, 9.0f);
            a0.c(canvas2, obj);
            canvas2.restore();
        } else if (this.Y2 != null) {
            int l11 = (int) (Utilities.l(1.0f) * 255.0f);
            Paint paint = this.b3;
            paint.setAlpha(l11);
            Bitmap bitmap = this.Y2;
            if (bitmap != null) {
                y(canvas2, bitmap);
            }
            paint.setAlpha(qs.e4);
        } else {
            H(canvas2, rectF4, 1.0f);
        }
        Paint paint2 = this.z1;
        paint2.setColor(352321535);
        paint2.setAlpha((int) (Color.alpha(paint2.getColor()) * 1.0f));
        canvas2.drawRect(rectF4, paint2);
        z.b(canvas2, rectF4, 1.0f);
        canvas2.restore();
        C(canvas2, path, rectF4, 0.0f, 1.0f);
        canvas2.save();
        canvas2.clipPath(path);
        float f28 = l10 / 0.3f;
        float l12 = 1.0f - Utilities.l(f28);
        float f29 = 0.004f;
        float f30 = 0.15f;
        boolean z9 = false;
        int i10 = 1;
        if (l12 > 0.004f) {
            canvas2.saveLayerAlpha(rectF4, (int) (l12 * 255.0f));
            float l13 = 1.0f - (Utilities.l(f28) * 0.15f);
            canvas2.scale(l13, l13, rectF.centerX(), rectF.centerY());
            this.T5 = true;
            int width2 = getWidth();
            System.currentTimeMillis();
            B(canvas2, width2);
            this.T5 = false;
            canvas2.restore();
        }
        float centerX2 = rectF3.centerX() - rectF2.centerX();
        float f31 = rectF3.top - rectF2.top;
        float f32 = 0.6f;
        if (Math.abs(this.G8) < 0.6f) {
            centerX2 = Math.round(centerX2);
            f31 = Math.round(f31);
        }
        canvas2.save();
        canvas2.translate(centerX2, f31);
        TextPaint textPaint = this.C1;
        textPaint.setSubpixelText(true);
        textPaint.setLinearText(false);
        String[] strArr = {hd.M0(2131746484, null), hd.M0(this.x0 ? 2131746488 : 2131746486, null), hd.M0(2131746483, null)};
        String[] strArr2 = {null, hd.M0(this.x0 ? 2131746487 : 2131746485, null), null};
        int i11 = 0;
        float f33 = L4;
        while (i11 < 3) {
            RectF[] rectFArr = this.y8;
            if (i11 == i10 && this.y0) {
                rectFArr[i11].setEmpty();
                i7 = i11;
                f10 = f27;
                f11 = f29;
            } else {
                float f34 = strArr2[i11] != null ? L3 : L2;
                f10 = f27;
                f11 = f29;
                float f35 = f33 + f34;
                rectFArr[i11].set(rectF2.left, f33, rectF2.right, f35);
                float g12 = this.l1 > 0.5f ? g1(f30, f32, l10) : g1(f32, f20, l10);
                if (g12 <= f11) {
                    i7 = i11;
                } else {
                    M(canvas2, i11, rectFArr[i11], z9);
                    canvas2.save();
                    float f36 = (f34 / 2.0f) + f33;
                    if (i11 == 2) {
                        i7 = i11;
                        o0(canvas2, this.K1, rectF2.left + org.telegram.messenger.g0.L(26.0f), f36, org.telegram.messenger.g0.L(20.0f), g12);
                        canvas2 = canvas;
                    } else {
                        i7 = i11;
                        if (i7 == 0) {
                            canvas2 = canvas;
                            o0(canvas2, this.R1, rectF2.left + org.telegram.messenger.g0.L(26.0f), f36, org.telegram.messenger.g0.L(20.0f), g12);
                        } else {
                            canvas2 = canvas;
                            boolean z10 = this.x0;
                            Bitmap bitmap2 = z10 ? this.O8 : this.P8;
                            if (bitmap2 != null) {
                                f12 = 26.0f;
                            } else {
                                int round = Math.round(org.telegram.messenger.g0.L(22.4f));
                                Bitmap createBitmap = Bitmap.createBitmap(round, round, Bitmap.Config.ALPHA_8);
                                f12 = 26.0f;
                                Canvas canvas3 = new Canvas(createBitmap);
                                float f37 = round / 24.0f;
                                canvas3.scale(f37, f37);
                                Paint paint3 = new Paint(1);
                                Paint.Style style = Paint.Style.STROKE;
                                paint3.setStyle(style);
                                paint3.setStrokeWidth(1.66f);
                                Paint.Cap cap = Paint.Cap.ROUND;
                                paint3.setStrokeCap(cap);
                                paint3.setStrokeJoin(Paint.Join.ROUND);
                                paint3.setColor(-16777216);
                                canvas3.drawCircle(11.0f, 11.0f, 8.0f, paint3);
                                canvas3.drawLine(11.0f, 11.0f, 11.0f, 6.6f, paint3);
                                canvas3.drawLine(11.0f, 11.0f, 7.8f, 11.0f, paint3);
                                if (z10) {
                                    Paint paint4 = new Paint(1);
                                    paint4.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                                    canvas3.drawCircle(18.2f, 18.2f, 5.7f, paint4);
                                    Paint paint5 = new Paint(1);
                                    paint5.setColor(-16777216);
                                    canvas3.drawCircle(18.2f, 18.2f, 4.4f, paint5);
                                    paint4.setStyle(style);
                                    paint4.setStrokeWidth(1.4f);
                                    paint4.setStrokeCap(cap);
                                    canvas3.drawLine(16.6f, 16.6f, 19.8f, 19.8f, paint4);
                                    canvas3.drawLine(19.8f, 16.6f, 16.6f, 19.8f, paint4);
                                    this.O8 = createBitmap;
                                } else {
                                    this.P8 = createBitmap;
                                }
                                bitmap2 = createBitmap;
                            }
                            float L5 = rectF2.left + org.telegram.messenger.g0.L(f12);
                            Paint paint6 = this.Q8;
                            paint6.setColor(-1);
                            paint6.setAlpha((int) (Color.alpha(-1) * g12));
                            canvas2.drawBitmap(bitmap2, L5 - (bitmap2.getWidth() / 2.0f), f36 - (bitmap2.getHeight() / 2.0f), paint6);
                        }
                    }
                    textPaint.setTextSize(org.telegram.messenger.g0.L(15.0f));
                    textPaint.setColor(-1);
                    textPaint.setAlpha((int) (g12 * f10));
                    canvas2.drawText(strArr[i7], rectF2.left + org.telegram.messenger.g0.L(52.0f), strArr2[i7] != null ? f36 - org.telegram.messenger.g0.L(2.0f) : org.telegram.messenger.g0.L(5.0f) + f36, textPaint);
                    if (strArr2[i7] != null) {
                        textPaint.setTextSize(org.telegram.messenger.g0.L(12.0f));
                        textPaint.setColor(-1493172225);
                        textPaint.setAlpha((int) (Color.alpha(-1493172225) * g12));
                        canvas2.drawText(strArr2[i7], rectF2.left + org.telegram.messenger.g0.L(52.0f), f36 + org.telegram.messenger.g0.L(14.0f), textPaint);
                    }
                    canvas2.restore();
                }
                f33 = f35;
            }
            i11 = i7 + 1;
            f27 = f10;
            f29 = f11;
            f30 = 0.15f;
            f32 = 0.6f;
            z9 = false;
            i10 = 1;
            f20 = 1.0f;
        }
        canvas2.restore();
        canvas2.restore();
    }

    public final void K0() {
        if (this.W4 != null || this.V4) {
            return;
        }
        this.V4 = true;
        Utilities.e.c(new z0(this, i0.a.o(i0.a.f(0.4f, N0(), -16777216), 16), 0));
    }

    public final void L(float f10, float f11, float f12, float f13, Canvas canvas, RectF rectF) {
        float min = Math.min(f12, f13);
        float max = Math.max(f12, f13);
        Paint paint = this.a6;
        if (min > 0.002f) {
            paint.setShader(null);
            paint.setColor(g(min, 16777215));
            canvas.drawRect(f10, rectF.top, f11, rectF.bottom, paint);
        }
        float f14 = max - min;
        if (f14 > 0.002f) {
            LinearGradient linearGradient = f13 >= f12 ? this.X5 : this.Y5;
            Matrix matrix = this.Z5;
            matrix.setScale(f11 - f10, 1.0f);
            matrix.postTranslate(f10, 0.0f);
            linearGradient.setLocalMatrix(matrix);
            paint.setShader(linearGradient);
            paint.setColor(-1);
            paint.setAlpha((int) (f14 * 255.0f));
            canvas.drawRect(f10, rectF.top, f11, rectF.bottom, paint);
            paint.setShader(null);
        }
    }

    public final float L0(float f10) {
        if (!this.y3 || this.r4 <= 0.001f) {
            return 0.0f;
        }
        float f11 = this.q4;
        float[] fArr = o1.b;
        float max = f11 / Math.max(0.3f, fArr[50]);
        if (max > 4.0f || max < -4.0f) {
            return 0.0f;
        }
        return Math.min(org.telegram.messenger.g0.N(fArr[42]), (org.telegram.messenger.g0.L(3.5f) / 2.0f) / 0.607f) * f10 * max * ((float) Math.exp((-0.5f) * max * max)) * this.r4;
    }

    public final void M(Canvas canvas, int i7, RectF rectF, boolean z9) {
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        boolean z10 = this.r9 == i7;
        long[] jArr = this.x9;
        if (z10 || jArr[i7] != 0) {
            float X0 = z10 ? X0(i7, currentAnimationTimeMillis) : this.y9[i7] * ((float) Math.exp((-(currentAnimationTimeMillis - jArr[i7])) / 180.0f));
            if (!z10 && X0 < 0.004f) {
                jArr[i7] = 0;
                return;
            }
            float C = com.google.android.recaptcha.internal.a.C(X0, 2.0f, 3.0f, X0 * X0);
            float min = Math.min(1.0f, (currentAnimationTimeMillis - this.w9[i7]) / 320.0f);
            float f10 = 1.0f - min;
            float x10 = org.telegram.ui.Cells.f1.x(f10, f10, f10, 1.0f);
            if (!z10 || X0 < 0.996f || min < 1.0f) {
                invalidate();
            }
            float max = Math.max(rectF.left, Math.min(rectF.right, this.u9[i7]));
            float max2 = Math.max(rectF.top, Math.min(rectF.bottom, this.v9[i7]));
            float max3 = (float) Math.max(Math.hypot(max - rectF.left, max2 - rectF.top), Math.max(Math.hypot(max - rectF.right, max2 - rectF.top), Math.max(Math.hypot(max - rectF.left, max2 - rectF.bottom), Math.hypot(max - rectF.right, max2 - rectF.bottom))));
            int i10 = z9 ? 335544320 : 738197503;
            Paint paint = this.s9;
            paint.setColor((((int) ((i10 >>> 24) * C)) << 24) | (16777215 & i10));
            Path path = this.t9;
            path.rewind();
            if (i7 == 3 || i7 == 4 || i7 == 11) {
                path.addOval(rectF, Path.Direction.CW);
            } else if (i7 >= 6 || i7 == 5) {
                float min2 = Math.min(org.telegram.messenger.g0.L(20.0f), rectF.height() / 2.0f);
                path.addRoundRect(rectF, min2, min2, Path.Direction.CW);
            } else {
                path.addRect(rectF, Path.Direction.CW);
            }
            canvas.save();
            canvas.clipPath(path);
            canvas.drawCircle(max, max2, Math.max(org.telegram.messenger.g0.L(6.0f), max3 * x10), paint);
            canvas.restore();
        }
    }

    public final void M0(int i7, j1 j1Var, int i10, int i11) {
        int i12 = i7 * 7;
        int i13 = j1Var.a;
        float[] fArr = this.j3;
        if (i13 == 0 && j1Var.f == H9) {
            fArr[i12] = 0.0f;
            fArr[i12 + 1] = 0.0f;
            fArr[i12 + 2] = 0.0f;
            float f10 = L9;
            fArr[i12 + 3] = f10;
            float f11 = M9;
            fArr[i12 + 4] = f11;
            fArr[i12 + 5] = 1.0f / ((i11 * f11) + (i10 * f10));
            fArr[i12 + 6] = 0.5f;
        } else {
            fArr[i12] = 1.0f;
            fArr[i12 + 1] = i10 / 2.0f;
            fArr[i12 + 2] = (l() / 2.0f) + m();
            fArr[i12 + 3] = 0.0f;
            fArr[i12 + 4] = 0.0f;
            fArr[i12 + 5] = 1.0f / (((float) Math.hypot(i10, i11)) * 0.62f);
            fArr[i12 + 6] = 0.55f;
        }
        int i14 = i7 * 3;
        int i15 = j1Var.b;
        int[] iArr = this.l3;
        iArr[i14] = i15;
        iArr[i14 + 1] = j1Var.g;
        iArr[i14 + 2] = j1Var.c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:113:0x03e9, code lost:
    
        if (r6.s8[r7] != ((r49 * 31) + r50)) goto L136;
     */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0cc9  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0d17  */
    /* JADX WARN: Removed duplicated region for block: B:165:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0abe  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0ac7  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0ba3  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0bf6  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0c2d  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0c69  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0c7d  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0c82  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0c85 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:296:0x0c3c  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0c23  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x0c91 A[EDGE_INSN: B:312:0x0c91->B:313:0x0c91 BREAK  A[LOOP:2: B:259:0x0ac3->B:294:0x0c85], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:316:0x0c96 A[LOOP:3: B:314:0x0c92->B:316:0x0c96, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:320:0x0cc1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void N(Canvas canvas, int i7, int i10) {
        RectF rectF;
        float f10;
        float f11;
        float f12;
        float f13;
        int i11;
        float f14;
        int i12;
        l1 l1Var;
        Canvas canvas2;
        float f15;
        float f16;
        RectF rectF2;
        int i13;
        int i14;
        float f17;
        float f18;
        float f19;
        RectF rectF3;
        boolean z9;
        ArrayList arrayList;
        float f20;
        boolean z10;
        int i15;
        float[] fArr;
        int i16;
        boolean z11;
        RectF rectF4;
        int i17;
        float f21;
        float x10;
        float f22;
        boolean z12;
        float f23;
        float f24;
        i1 i1Var;
        float f25;
        float f26;
        TLRPC.Document document;
        ArrayList<TLRPC.Document> arrayList2;
        RectF rectF5;
        long j3;
        float f27;
        float f28;
        float f29;
        float T1;
        float f30;
        int i18;
        int i19;
        float f31;
        int i20;
        int i21;
        l1 l1Var2 = this;
        float f32 = l1Var2.f1;
        if (f32 <= 0.001f) {
            return;
        }
        float l10 = Utilities.l(f32);
        float b12 = l1Var2.b1();
        float a12 = l1Var2.a1();
        float f33 = a12 - b12;
        float L = org.telegram.messenger.g0.L(10.0f);
        float L2 = i7 - org.telegram.messenger.g0.L(10.0f);
        RectF rectF6 = l1Var2.u7;
        rectF6.set(L, f33, L2, a12);
        float height = (l1Var2.getHeight() - l1Var2.u3) - org.telegram.messenger.g0.L(40.0f);
        float L3 = org.telegram.messenger.g0.L(10.0f) - org.telegram.messenger.g0.L(3.0f);
        float f34 = i7;
        float f35 = f34 / 2.0f;
        float max = Math.max(L3, org.telegram.messenger.g0.T1(f35 - org.telegram.messenger.g0.L(72.0f), rectF6.left, f32));
        float T12 = org.telegram.messenger.g0.T1(height - org.telegram.messenger.g0.L(20.0f), f33, f32);
        float min = Math.min(f34 - L3, org.telegram.messenger.g0.T1(f35 + org.telegram.messenger.g0.L(72.0f), rectF6.right, f32));
        float T13 = org.telegram.messenger.g0.T1(org.telegram.messenger.g0.L(20.0f) + height, a12, l10);
        RectF rectF7 = l1Var2.z7;
        rectF7.set(max, T12, min, T13);
        float min2 = Math.min(rectF7.height() / 2.0f, org.telegram.messenger.g0.W1(l10, org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(28.17f)));
        float f36 = 0.5f;
        l1Var2.A6 = l10 > 0.5f;
        if (l10 >= 0.35f) {
            f10 = 0.35f;
            if (l1Var2.e6 || l1Var2.g1 <= 0.5f) {
                f11 = 10.0f;
                rectF = rectF6;
            } else {
                l1Var2.e6 = true;
                f11 = 10.0f;
                rectF = rectF6;
                l1Var2.c6 = AnimationUtils.currentAnimationTimeMillis();
            }
        } else {
            rectF = rectF6;
            f10 = 0.35f;
            f11 = 10.0f;
        }
        if (l10 < 0.05f) {
            l1Var2.e6 = false;
        }
        l1Var2.r6 = l10;
        l1Var2.s6 = true;
        l1Var2.J(canvas, rectF7, min2, 1.0f);
        l1Var2.s6 = false;
        l1Var2.A6 = false;
        j1 j1Var = l1Var2.n;
        int i22 = j1Var != null ? j1Var.h : TLObject.FLAG_30;
        float f37 = f11;
        Paint paint = l1Var2.z1;
        paint.setColor(i22);
        paint.setAlpha((int) (Color.alpha(i22) * l10));
        float[][] fArr2 = o1.a;
        int i23 = 2;
        if (l10 > 0.5f) {
            float min3 = Math.min(0.0f, org.telegram.messenger.g0.N(fArr2[2][8]));
            RectF rectF8 = l1Var2.V5;
            rectF8.set(rectF7);
            rectF8.inset(min3, min3);
            float f38 = min2 - min3;
            canvas.drawRoundRect(rectF8, f38, f38, paint);
        } else {
            canvas.drawRoundRect(rectF7, min2, min2, paint);
        }
        float l11 = 1.0f - Utilities.l(l10 / f10);
        int i24 = 3;
        Path path = l1Var2.E1;
        if (l11 > 0.0f) {
            canvas.save();
            path.rewind();
            path.addRoundRect(rectF7, min2, min2, Path.Direction.CW);
            canvas.clipPath(path);
            float L4 = org.telegram.messenger.g0.L(144.0f) / 3.0f;
            int i25 = 0;
            while (i25 < i24) {
                int i26 = i24;
                float b10 = org.telegram.messenger.camera.q.b(i25, f36, L4, f35 - org.telegram.messenger.g0.L(72.0f));
                Drawable drawable = l1Var2.f7[i25];
                float T14 = org.telegram.messenger.g0.T1(height, height - org.telegram.messenger.g0.L(f37), l10);
                float L5 = org.telegram.messenger.g0.L(i25 == 1 ? 24.5f : 22.0f);
                float f39 = min2;
                float f40 = l10 * 0.15f;
                int i27 = i25 == l1Var2.h1 ? 1 : 0;
                int i28 = i25;
                float f41 = l11;
                o0(canvas, drawable, b10, T14, com.google.android.recaptcha.internal.a.B(f40, i27, 1.0f, L5), f41);
                f36 = 0.5f;
                l11 = f41;
                l1Var2 = this;
                min2 = f39;
                L4 = L4;
                i24 = i26;
                l10 = l10;
                i25 = i28 + 1;
            }
            l1Var = l1Var2;
            f12 = f36;
            f13 = l10;
            i11 = i24;
            i12 = 1;
            f14 = min2;
            canvas.restore();
        } else {
            f12 = 0.5f;
            f13 = l10;
            i11 = 3;
            f14 = min2;
            i12 = 1;
            l1Var = l1Var2;
        }
        float f42 = l1Var.y7;
        if (f42 <= 0.004f) {
            return;
        }
        int i29 = f42 < 0.999f ? i12 : 0;
        if (i29 != 0) {
            RectF rectF9 = rectF;
            int i30 = (int) (f42 * 255.0f);
            canvas2 = canvas;
            rectF2 = rectF9;
            canvas2.saveLayerAlpha(rectF9.left, f33, rectF9.right, a12, i30);
            f15 = f33;
            f16 = a12;
        } else {
            canvas2 = canvas;
            f15 = f33;
            f16 = a12;
            rectF2 = rectF;
        }
        canvas2.save();
        path.rewind();
        path.addRoundRect(rectF7, f14, f14, Path.Direction.CW);
        canvas2.clipPath(path);
        int i31 = l1Var.h1 != i12 ? i12 : 0;
        if (i31 != 0) {
            canvas2.saveLayer(rectF7, null);
        }
        canvas2.save();
        canvas2.translate(0.0f, (1.0f - l1Var.y7) * org.telegram.messenger.g0.L(14.0f));
        canvas2.translate(0.0f, -l1Var.j1);
        float L6 = org.telegram.messenger.g0.L(4.0f) + f15;
        int i32 = l1Var.h1;
        if (i32 == 0) {
            float width = (rectF2.width() - org.telegram.messenger.g0.L(8.0f)) / 6.0f;
            float min4 = Math.min(width - org.telegram.messenger.g0.L(f37), org.telegram.messenger.g0.L(44.0f));
            int i33 = l1Var.g1 > f12 ? i12 : 0;
            float V0 = i33 != 0 ? l1Var.V0() : 1.0f;
            if (i33 != 0) {
                f28 = 1.0f;
                float f43 = 1.0f - V0;
                T1 = org.telegram.messenger.g0.T1(0.8f, 1.0f, org.telegram.ui.Cells.f1.x(f43, f43, f43, 1.0f));
                f29 = 0.8f;
            } else {
                f28 = 1.0f;
                f29 = 0.8f;
                T1 = org.telegram.messenger.g0.T1(0.96f, 1.0f, l1Var.y7);
            }
            if (i33 != 0 && V0 < f28) {
                l1Var.invalidate();
            }
            canvas2.save();
            float centerX = rectF2.centerX();
            float f44 = l1Var.j1;
            canvas2.scale(T1, T1, centerX, i33 != 0 ? f44 + f16 : com.google.android.recaptcha.internal.a.A(f16, f15, 2.0f, f44 + f15));
            int i34 = 0;
            while (i34 < a.b.length) {
                int e12 = e1(i34);
                float f45 = f12;
                float b11 = org.telegram.messenger.camera.q.b(i34 % 6, f45, width, rectF2.left + org.telegram.messenger.g0.L(4.0f));
                float b13 = org.telegram.messenger.camera.q.b(i34 / 6, f45, width, L6);
                float f46 = b13 - l1Var.j1;
                float f47 = L6;
                if (f46 > i10 + width || f46 < f15 - width) {
                    f30 = f15;
                    i18 = i31;
                    i19 = i29;
                    f31 = width;
                } else {
                    float max2 = Math.max(0.0f, Math.min(f37, (f46 - f15) / width));
                    float l12 = Utilities.l(i33 != 0 ? ((V0 * 420.0f) - (max2 * 12.0f)) / 300.0f : (l1Var.y7 - (max2 * 0.02f)) / f29);
                    float f48 = i33 != 0 ? 0.82f : 0.85f;
                    float f49 = 1.0f - l12;
                    float k12 = (((1.0f - ((f49 * f49) * f49)) * (1.0f - f48)) + f48) * l1Var.k1(i34);
                    if (k12 != 1.0f) {
                        canvas2.save();
                        canvas2.scale(k12, k12, b11, b13);
                    }
                    float f50 = min4 / 2.0f;
                    float f51 = f15;
                    if (e12 == H9) {
                        i20 = -12602881;
                    } else {
                        k();
                        i20 = D9[e12];
                    }
                    int i35 = i20;
                    if (e12 == H9) {
                        i21 = -15308082;
                    } else {
                        k();
                        i21 = E9[e12];
                    }
                    int i36 = i21;
                    j1 j1Var2 = l1Var.n;
                    if (j1Var2 != null && j1Var2.a == 0) {
                        int i37 = j1Var2.f;
                    }
                    float f52 = i34 == l1Var.u8 ? l1Var.w8 : i34 == l1Var.v8 ? l1Var.x8 : 0.0f;
                    paint.setColor(-1);
                    int length = l1Var.r8.length;
                    int[] iArr = a.b;
                    float f53 = f52;
                    if (length != iArr.length) {
                        l1Var.r8 = new LinearGradient[iArr.length];
                        l1Var.s8 = new int[iArr.length];
                    }
                    LinearGradient[] linearGradientArr = l1Var.r8;
                    LinearGradient linearGradient = linearGradientArr[i34];
                    LinearGradient[] linearGradientArr2 = linearGradient != null ? linearGradientArr : linearGradientArr;
                    LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, 1.0f, 1.0f, i35, i36, Shader.TileMode.CLAMP);
                    linearGradientArr2[i34] = linearGradient2;
                    l1Var.s8[i34] = (i35 * 31) + i36;
                    linearGradient = linearGradient2;
                    float f54 = f50 * 2.0f;
                    Matrix matrix = l1Var.d7;
                    matrix.setScale(f54, f54);
                    float f55 = b11 - f50;
                    i18 = i31;
                    float f56 = b13 - f50;
                    matrix.postTranslate(f55, f56);
                    linearGradient.setLocalMatrix(matrix);
                    paint.setShader(linearGradient);
                    canvas2.drawCircle(b11, b13, f50, paint);
                    paint.setShader(null);
                    float max3 = Math.max(0.0f, -org.telegram.messenger.g0.N(fArr2[i11][8])) + 1.0f;
                    float f57 = (b11 + f50) - max3;
                    float f58 = (b13 + f50) - max3;
                    RectF rectF10 = l1Var.c7;
                    rectF10.set(f55 + max3, f56 + max3, f57, f58);
                    i19 = i29;
                    float f59 = f53;
                    f31 = width;
                    float f60 = f29;
                    f30 = f51;
                    l1Var.t8.a(f50 - max3, 1.0f, 3, canvas, rectF10);
                    canvas2 = canvas;
                    if (f59 > 0.01f) {
                        boolean z13 = i34 == l1Var.u8;
                        float L7 = (f50 - org.telegram.messenger.g0.L(4.0f)) - org.telegram.messenger.g0.L(1.0f);
                        float T15 = z13 ? org.telegram.messenger.g0.T1(f60, 1.0f, f59) * L7 : org.telegram.messenger.g0.T1(f50 - org.telegram.messenger.g0.N(1.0f), L7, f59);
                        float L8 = org.telegram.messenger.g0.L(2.0f);
                        if (!z13) {
                            L8 *= f59;
                        }
                        float min5 = z13 ? f59 : Math.min(1.0f, f59 * 3.0f);
                        double h = i0.a.h(i35);
                        Paint paint2 = l1Var.A1;
                        if (h > 0.62d) {
                            paint2.setColor(a(min5, 939524096));
                            float N = org.telegram.messenger.g0.N(1.2f);
                            if (z13) {
                                f59 = 1.0f;
                            }
                            paint2.setStrokeWidth((N * f59) + L8);
                            canvas2.drawCircle(b11, b13, T15, paint2);
                        }
                        paint2.setColor(a(min5, -1));
                        paint2.setStrokeWidth(L8);
                        canvas2.drawCircle(b11, b13, T15, paint2);
                    }
                    if (k12 != 1.0f) {
                        canvas2.restore();
                        l1Var.invalidate();
                    }
                }
                i34++;
                f15 = f30;
                width = f31;
                i29 = i19;
                L6 = f47;
                i31 = i18;
                f12 = 0.5f;
                f29 = 0.8f;
                f37 = 10.0f;
            }
            i13 = i31;
            i14 = i29;
            canvas2.restore();
        } else {
            float f61 = f15;
            i13 = i31;
            i14 = i29;
            float f62 = 1.2f;
            if (i32 != i12) {
                boolean z14 = l1Var.g1 > 0.5f;
                float V02 = z14 ? l1Var.V0() : 1.0f;
                boolean z15 = z14 && V02 < 1.0f;
                if (z15) {
                    float f63 = 1.0f - V02;
                    float T16 = org.telegram.messenger.g0.T1(0.75f, 1.0f, org.telegram.ui.Cells.f1.x(f63, f63, f63, 1.0f));
                    canvas2.save();
                    canvas2.scale(T16, T16, rectF2.centerX(), l1Var.j1 + f16);
                    l1Var.invalidate();
                }
                boolean h02 = l1Var.h0();
                ArrayList arrayList3 = l1Var.v1;
                if (h02) {
                    float centerX2 = rectF2.centerX();
                    float L10 = org.telegram.messenger.g0.L(99.0f);
                    Typeface o4 = org.telegram.messenger.g0.o();
                    f20 = 250.0f;
                    TextPaint textPaint = l1Var.a8;
                    textPaint.setTypeface(o4);
                    textPaint.setTextSize(org.telegram.messenger.g0.L(16.0f));
                    Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
                    int width2 = (int) (rectF2.width() - org.telegram.messenger.g0.L(32.0f));
                    f17 = f16;
                    f18 = V02;
                    boolean z16 = l1Var.w1 > 0;
                    boolean z17 = !z16;
                    StaticLayout staticLayout = l1Var.f8;
                    boolean z18 = z16;
                    TextPaint textPaint2 = l1Var.b8;
                    if (staticLayout == null || l1Var.g8 != width2 || l1Var.h8 != z17) {
                        l1Var.g8 = width2;
                        l1Var.h8 = z17;
                        textPaint2.setTextSize(org.telegram.messenger.g0.L(14.0f));
                        Paint.FontMetrics fontMetrics2 = textPaint2.getFontMetrics();
                        l1Var.f8 = new StaticLayout(hd.M0(!z18 ? 2131746500 : 2131746492, null), textPaint2, width2, Layout.Alignment.ALIGN_CENTER, 1.0f, org.telegram.messenger.g0.L(18.5f) - (fontMetrics2.descent - fontMetrics2.ascent), false);
                    }
                    float A = com.google.android.recaptcha.internal.a.A(org.telegram.messenger.g0.L(300.0f), ((((fontMetrics.descent - fontMetrics.ascent) + (org.telegram.messenger.g0.L(22.0f) + L10)) + org.telegram.messenger.g0.L(7.0f)) + l1Var.f8.getHeight()) + (l1Var.w1 > 0 ? org.telegram.messenger.g0.L(20.0f) + org.telegram.messenger.g0.L(36.0f) : 0), 2.0f, f61) - org.telegram.messenger.g0.L(8.0f);
                    TLRPC.Document document2 = l1Var.p8;
                    int i38 = l1Var.b;
                    if (document2 != null) {
                        f26 = A;
                        f25 = 36.0f;
                        document = document2;
                    } else {
                        if (l1Var.o8 == null) {
                            TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                            l1Var.o8 = tL_inputStickerSetShortName;
                            f25 = 36.0f;
                            tL_inputStickerSetShortName.short_name = "Redo_edc21keMa";
                        } else {
                            f25 = 36.0f;
                        }
                        if (l1Var.n8) {
                            f26 = A;
                            document = null;
                        } else {
                            l1Var.n8 = true;
                            f26 = A;
                            TLRPC.TL_messages_stickerSet l02 = ui.b0(i38).l0(l1Var.o8, null, false, false, new i(l1Var, i11));
                            if (l02 != null && (arrayList2 = l02.documents) != null && !arrayList2.isEmpty()) {
                                l1Var.p8 = l02.documents.get(0);
                            }
                            document = l1Var.p8;
                        }
                    }
                    if (document != null) {
                        i5 i5Var = l1Var.k8;
                        f19 = f61;
                        rectF5 = rectF7;
                        if (i5Var == null || l1Var.m8 != document.id) {
                            if (i5Var != null) {
                                i5Var.n(l1Var);
                            }
                            i5 l13 = i5.l(i38, 14, document);
                            l1Var.k8 = l13;
                            l13.a(l1Var);
                            l1Var.m8 = document.id;
                            l1Var.q8 = 0L;
                        }
                    } else {
                        f19 = f61;
                        rectF5 = rectF7;
                    }
                    i5 i5Var2 = l1Var.k8;
                    z2 z2Var = i5Var2 != null ? i5Var2.k : null;
                    long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                    if (z2Var == null || !z2Var.I()) {
                        z9 = z15;
                        j3 = 0;
                    } else {
                        z9 = z15;
                        j3 = 0;
                        if (l1Var.q8 == 0) {
                            l1Var.q8 = currentAnimationTimeMillis;
                        }
                    }
                    float min6 = l1Var.q8 == j3 ? 0.0f : Math.min(1.0f, (currentAnimationTimeMillis - r12) / 250.0f);
                    float C = com.google.android.recaptcha.internal.a.C(min6, 2.0f, 3.0f, min6 * min6);
                    float l14 = l1Var.g1 > 0.5f ? Utilities.l(l1Var.V0() / 0.7f) : 1.0f;
                    float f64 = 1.0f - l14;
                    float x11 = org.telegram.ui.Cells.f1.x(f64, f64, f64, 1.0f);
                    float T17 = org.telegram.messenger.g0.T1(0.95f, 1.0f, x11);
                    if (l14 < 1.0f) {
                        l1Var.invalidate();
                    }
                    canvas2.save();
                    canvas2.translate(0.0f, (1.0f - x11) * org.telegram.messenger.g0.L(6.0f));
                    float f65 = L10 / 2.0f;
                    canvas2.scale(T17, T17, centerX2, (f26 - org.telegram.messenger.g0.L(2.0f)) + f65);
                    if (C < 1.0f) {
                        if (l1Var.l8 == null) {
                            int i39 = (int) L10;
                            zg0 zg0Var = new zg0(R.raw.qr_resistance_dog, i39, i39, true, null);
                            l1Var.l8 = zg0Var;
                            zg0Var.K(1);
                            l1Var.l8.J(true);
                            l1Var.l8.R(l1Var);
                            l1Var.l8.setCallback(l1Var);
                            l1Var.l8.start();
                        }
                        if (l1Var.l8.u()) {
                            f27 = centerX2;
                            l1Var.l8.setBounds((int) (centerX2 - f65), (int) (f26 - org.telegram.messenger.g0.L(2.0f)), (int) (centerX2 + f65), (int) ((f26 - org.telegram.messenger.g0.L(2.0f)) + L10));
                            l1Var.l8.setAlpha((int) ((1.0f - C) * f13 * 255.0f));
                            l1Var.l8.draw(canvas2);
                        } else {
                            f27 = centerX2;
                        }
                        l1Var.invalidate();
                    } else {
                        f27 = centerX2;
                        zg0 zg0Var2 = l1Var.l8;
                        if (zg0Var2 != null) {
                            zg0Var2.C(false);
                            l1Var.l8 = null;
                        }
                    }
                    i5 i5Var3 = l1Var.k8;
                    if (i5Var3 != null && C > 0.0f) {
                        i5Var3.setBounds((int) (f27 - f65), (int) (f26 - org.telegram.messenger.g0.L(2.0f)), (int) (f27 + f65), (int) ((f26 - org.telegram.messenger.g0.L(2.0f)) + L10));
                        l1Var.k8.setAlpha((int) (f13 * 255.0f * C));
                        l1Var.k8.draw(canvas2);
                    }
                    canvas2.restore();
                    textPaint.setColor(-1);
                    int i40 = (int) (f13 * 255.0f);
                    textPaint.setAlpha(i40);
                    Paint.FontMetrics fontMetrics3 = textPaint.getFontMetrics();
                    float L11 = ((f26 + L10) + org.telegram.messenger.g0.L(18.0f)) - fontMetrics3.ascent;
                    String str = l1Var.i8;
                    canvas2.drawText(str, f27 - (textPaint.measureText(str) / 2.0f), L11, textPaint);
                    textPaint2.setColor(-1);
                    textPaint2.setAlpha((int) (191.0f * f13));
                    float L12 = L11 + fontMetrics3.descent + org.telegram.messenger.g0.L(7.0f);
                    canvas2.save();
                    canvas2.translate(f27 - (l1Var.f8.getWidth() / 2.0f), L12);
                    l1Var.f8.draw(canvas2);
                    canvas2.restore();
                    long j10 = l1Var.w1;
                    RectF rectF11 = l1Var.Z7;
                    if (j10 > 0) {
                        float height2 = L12 + l1Var.f8.getHeight() + org.telegram.messenger.g0.L(20.0f);
                        Typeface o10 = org.telegram.messenger.g0.o();
                        TextPaint textPaint3 = l1Var.c8;
                        textPaint3.setTypeface(o10);
                        textPaint3.setTextSize(org.telegram.messenger.g0.L(14.0f));
                        String str2 = l1Var.j8;
                        float measureText = textPaint3.measureText(str2) + (org.telegram.messenger.g0.L(19.0f) * 2);
                        float L13 = org.telegram.messenger.g0.L(f25);
                        float f66 = measureText / 2.0f;
                        rectF11.set(f27 - f66, height2, f27 + f66, height2 + L13);
                        rectF3 = rectF5;
                        arrayList = arrayList3;
                        int saveLayer = canvas2.saveLayer(rectF11.left - 1.0f, rectF11.top - 1.0f, rectF11.right + 1.0f, rectF11.bottom + 1.0f, null);
                        paint.setColor(-1);
                        paint.setAlpha(i40);
                        float f67 = L13 / 2.0f;
                        canvas2.drawRoundRect(rectF11, f67, f67, paint);
                        l1Var.M(canvas2, 10, rectF11, true);
                        Typeface o11 = org.telegram.messenger.g0.o();
                        TextPaint textPaint4 = l1Var.e8;
                        textPaint4.setTypeface(o11);
                        textPaint4.setTextSize(org.telegram.messenger.g0.L(14.0f));
                        Paint.FontMetrics fontMetrics4 = textPaint4.getFontMetrics();
                        canvas2.drawText(str2, f27 - (textPaint4.measureText(str2) / 2.0f), rectF11.centerY() - ((fontMetrics4.ascent + fontMetrics4.descent) / 2.0f), textPaint4);
                        canvas2.restoreToCount(saveLayer);
                        if (l1Var.d8 == null) {
                            TextPaint textPaint5 = new TextPaint(1);
                            l1Var.d8 = textPaint5;
                            textPaint5.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.MULTIPLY));
                        }
                        l1Var.d8.setTypeface(org.telegram.messenger.g0.o());
                        l1Var.d8.setTextSize(org.telegram.messenger.g0.L(14.0f));
                        j1 j1Var3 = l1Var.n;
                        l1Var.d8.setColor(D0(0.9f, 1.4f, 0.1f, j1Var3 != null ? i0.a.f(0.5f, j1Var3.b, j1Var3.c) : -8355712));
                        l1Var.d8.setAlpha(i40);
                        canvas2.drawText(str2, f27 - (l1Var.d8.measureText(str2) / 2.0f), rectF11.centerY() - ((fontMetrics4.ascent + fontMetrics4.descent) / 2.0f), l1Var.d8);
                    } else {
                        rectF3 = rectF5;
                        arrayList = arrayList3;
                        rectF11.setEmpty();
                    }
                } else {
                    f17 = f16;
                    f18 = V02;
                    f19 = f61;
                    rectF3 = rectF7;
                    z9 = z15;
                    arrayList = arrayList3;
                    f20 = 250.0f;
                    if (arrayList.isEmpty()) {
                        TextPaint textPaint6 = l1Var.C1;
                        textPaint6.setColor(-1275068417);
                        textPaint6.setTextSize(org.telegram.messenger.g0.L(14.0f));
                        String M0 = hd.M0(!l1Var.x1 ? 2131746494 : l1Var.w1 < 0 ? 2131746500 : 2131746493, null);
                        canvas2.drawText(M0, (f34 - textPaint6.measureText(M0)) / 2.0f, L6 + org.telegram.messenger.g0.L(40.0f), textPaint6);
                    }
                }
                int f02 = l1Var.f0();
                int size = arrayList.size();
                float width3 = (rectF2.width() - org.telegram.messenger.g0.L(8.0f)) / 3.0f;
                float f68 = f02;
                float width4 = (rectF2.width() - org.telegram.messenger.g0.L(8.0f)) / f68;
                float f69 = L6 + 0.0f;
                l1Var.q6 = false;
                l1Var.i6 = 0;
                int max4 = (int) Math.max(0.0d, Math.floor(((f19 + l1Var.j1) - f69) / width3));
                l1Var.g6 = max4;
                int max5 = (int) Math.max(max4, Math.floor(((f17 + l1Var.j1) - f69) / width3));
                l1Var.h6 = max5;
                int i41 = (max5 - l1Var.g6) + 1;
                boolean z19 = l1Var.g1 < 0.5f;
                l1Var.f6 = z19;
                if (z19) {
                    l1Var.k6 = AnimationUtils.currentAnimationTimeMillis() - l1Var.d6;
                    l1Var.j6 = Math.min(25.0f, 60.0f / Math.max(1, r1));
                    l1Var.l6 = 0.6f;
                    l1Var.m6 = org.telegram.messenger.g0.L(4.0f);
                    z10 = true;
                } else {
                    float currentAnimationTimeMillis2 = !l1Var.e6 ? 0.0f : AnimationUtils.currentAnimationTimeMillis() - l1Var.c6;
                    l1Var.k6 = currentAnimationTimeMillis2;
                    if (currentAnimationTimeMillis2 > 470.0f) {
                        l1Var.k6 = -1.0f;
                        z10 = true;
                        if (z14) {
                            l1Var.k6 = -1.0f;
                        }
                        i15 = 0;
                        while (true) {
                            fArr = l1Var.n6;
                            if (i15 < size) {
                                break;
                            }
                            float f70 = i15 % f02;
                            float L14 = (width4 * f70) + rectF2.left + org.telegram.messenger.g0.L(4.0f);
                            float f71 = ((i15 / f02) * width3) + f69;
                            float f72 = l1Var.j1;
                            if (f71 - f72 <= f17) {
                                float f73 = f71 + width3;
                                if (f73 - f72 >= f19) {
                                    l1Var.p6 = 1.0f;
                                    if (l1Var.k6 < 0.0f) {
                                        f21 = 1.0f;
                                    } else {
                                        if (l1Var.f6) {
                                            float l15 = Utilities.l((l1Var.k6 - ((f70 * 3.0f) + (Math.max(0, r1 - l1Var.g6) * l1Var.j6))) / 90.0f);
                                            f21 = 1.0f;
                                            l1Var.p6 = org.telegram.messenger.g0.T1(1.0f, l1Var.l6, l15 * l15);
                                            if (l15 >= 0.7f) {
                                                f22 = k5.y(l15, 0.7f, 0.3f, 1.0f);
                                            }
                                        } else {
                                            float l16 = Utilities.l((l1Var.k6 - ((f70 * 4.0f) + (Math.max(0, l1Var.h6 - r1) * l1Var.j6))) / 220.0f);
                                            float f74 = l1Var.l6;
                                            if (l1Var.q6) {
                                                x10 = S(l16, f62);
                                                f21 = 1.0f;
                                            } else {
                                                f21 = 1.0f;
                                                float f75 = 1.0f - l16;
                                                x10 = org.telegram.ui.Cells.f1.x(f75, f75, f75, 1.0f);
                                            }
                                            l1Var.p6 = org.telegram.messenger.g0.T1(f74, f21, x10);
                                            float l17 = f21 - Utilities.l(l16 / f10);
                                            f22 = f21 - (l17 * l17);
                                        }
                                        z12 = f22 >= f21 || l1Var.p6 != f21;
                                        if (z12) {
                                            canvas2.save();
                                            float f76 = f21;
                                            float f77 = f22;
                                            canvas2.translate(0.0f, Utilities.l((f76 - l1Var.p6) / (f76 - l1Var.l6)) * l1Var.m6);
                                            float f78 = l1Var.p6;
                                            canvas2.scale(f78, f78, (width4 / 2.0f) + L14, (width3 / 2.0f) + f71);
                                            if (f22 < f21) {
                                                float f79 = L14 + width4;
                                                int i42 = l1Var.i6;
                                                if (i42 < 64) {
                                                    l1Var.i6 = i42 + 1;
                                                    int i43 = i42 * 5;
                                                    fArr[i43] = L14;
                                                    fArr[i43 + 1] = f71;
                                                    fArr[i43 + 2] = f79;
                                                    fArr[i43 + 3] = f73;
                                                    fArr[i43 + 4] = f77;
                                                }
                                            }
                                        }
                                        if (z9) {
                                            f23 = 1.0f;
                                            f24 = 1.0f;
                                        } else {
                                            f23 = 1.0f;
                                            float l18 = 1.0f - Utilities.l(((f18 * 420.0f) - (Math.max(0.0f, Math.min(10.0f, ((f71 - l1Var.j1) - f19) / width3)) * 12.0f)) / 300.0f);
                                            f24 = ((1.0f - ((l18 * l18) * l18)) * 0.18f) + 0.82f;
                                        }
                                        if (f24 == f23) {
                                            canvas2.save();
                                            canvas2.scale(f24, f24, (width4 / 2.0f) + L14, (width3 / 2.0f) + f71);
                                        }
                                        TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList.get(i15);
                                        float L15 = L14 + org.telegram.messenger.g0.L(4.0f);
                                        float L16 = f71 + org.telegram.messenger.g0.L(4.0f);
                                        float L17 = width4 - org.telegram.messenger.g0.L(8.0f);
                                        float L18 = width3 - org.telegram.messenger.g0.L(8.0f);
                                        i1Var = l1Var.F;
                                        rectF4 = rectF2;
                                        i17 = i23;
                                        if (i1Var.a == i17) {
                                            int i44 = i1Var.q;
                                        }
                                        l1 l1Var3 = l1Var;
                                        z11 = true;
                                        f62 = 1.2f;
                                        l1Var3.I(canvas, i15, tL_starGiftUnique, L15, L16, L17, L18);
                                        l1Var = l1Var3;
                                        if (f24 != f23) {
                                            canvas.restore();
                                        }
                                        if (!z12) {
                                            canvas.restore();
                                        }
                                        i15++;
                                        canvas2 = canvas;
                                        i23 = i17;
                                        z10 = z11;
                                        rectF2 = rectF4;
                                    }
                                    f22 = f21;
                                    if (f22 >= f21) {
                                    }
                                    if (z12) {
                                    }
                                    if (z9) {
                                    }
                                    if (f24 == f23) {
                                    }
                                    TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) arrayList.get(i15);
                                    float L152 = L14 + org.telegram.messenger.g0.L(4.0f);
                                    float L162 = f71 + org.telegram.messenger.g0.L(4.0f);
                                    float L172 = width4 - org.telegram.messenger.g0.L(8.0f);
                                    float L182 = width3 - org.telegram.messenger.g0.L(8.0f);
                                    i1Var = l1Var.F;
                                    rectF4 = rectF2;
                                    i17 = i23;
                                    if (i1Var.a == i17) {
                                    }
                                    l1 l1Var32 = l1Var;
                                    z11 = true;
                                    f62 = 1.2f;
                                    l1Var32.I(canvas, i15, tL_starGiftUnique2, L152, L162, L172, L182);
                                    l1Var = l1Var32;
                                    if (f24 != f23) {
                                    }
                                    if (!z12) {
                                    }
                                    i15++;
                                    canvas2 = canvas;
                                    i23 = i17;
                                    z10 = z11;
                                    rectF2 = rectF4;
                                }
                            }
                            z11 = z10;
                            rectF4 = rectF2;
                            i17 = i23;
                            i15++;
                            canvas2 = canvas;
                            i23 = i17;
                            z10 = z11;
                            rectF2 = rectF4;
                        }
                        for (i16 = 0; i16 < l1Var.i6; i16++) {
                            int i45 = i16 * 5;
                            int i46 = (int) (fArr[i45 + 4] * 255.0f);
                            Paint paint3 = l1Var.o6;
                            paint3.setAlpha(i46);
                            canvas.drawRect(fArr[i45], fArr[i45 + 1], fArr[i45 + 2], fArr[i45 + 3], paint3);
                        }
                        l1Var.i6 = 0;
                        if (z9) {
                            canvas.restore();
                        }
                        canvas.restore();
                        if (i13 != 0) {
                            float L19 = org.telegram.messenger.g0.L(12.0f);
                            Matrix matrix2 = l1Var.C7;
                            matrix2.setScale(1.0f, L19);
                            RectF rectF12 = rectF3;
                            matrix2.postTranslate(0.0f, rectF12.top);
                            LinearGradient linearGradient3 = l1Var.A7;
                            linearGradient3.setLocalMatrix(matrix2);
                            float f80 = rectF12.left;
                            float f81 = rectF12.top;
                            canvas.drawRect(f80, f81, rectF12.right, f81 + L19, l1Var.B7);
                            matrix2.setScale(1.0f, -L19);
                            matrix2.postTranslate(0.0f, rectF12.bottom);
                            linearGradient3.setLocalMatrix(matrix2);
                            float f82 = rectF12.left;
                            float f83 = rectF12.bottom;
                            canvas.drawRect(f82, f83 - L19, rectF12.right, f83, l1Var.B7);
                            canvas.restore();
                        }
                        canvas.restore();
                        if (i14 != 0) {
                            canvas.restore();
                            return;
                        }
                        return;
                    }
                    z10 = true;
                    l1Var.j6 = Math.min(45.0f, (f20 - (f68 * 4.0f)) / Math.max(1, i41));
                    l1Var.l6 = 0.7f;
                    l1Var.m6 = org.telegram.messenger.g0.L(7.0f);
                }
                l1Var.invalidate();
                if (z14) {
                }
                i15 = 0;
                while (true) {
                    fArr = l1Var.n6;
                    if (i15 < size) {
                    }
                    i15++;
                    canvas2 = canvas;
                    i23 = i17;
                    z10 = z11;
                    rectF2 = rectF4;
                }
                while (i16 < l1Var.i6) {
                }
                l1Var.i6 = 0;
                if (z9) {
                }
                canvas.restore();
                if (i13 != 0) {
                }
                canvas.restore();
                if (i14 != 0) {
                }
            }
        }
        rectF3 = rectF7;
        canvas.restore();
        if (i13 != 0) {
        }
        canvas.restore();
        if (i14 != 0) {
        }
    }

    public final int N0() {
        j1 j1Var = this.n;
        if (j1Var == null) {
            return -16777216;
        }
        if (this.s >= 1.0f || this.r == null) {
            return j1Var.e;
        }
        float l10 = (l() / 2.0f) + m();
        float l11 = Utilities.l(((((((float) Math.hypot(Math.max(this.x, getWidth() - this.x), Math.max(this.y, getHeight() - this.y))) + org.telegram.messenger.g0.L(60.0f)) * y1(this.s)) - ((float) Math.hypot((getWidth() / 2.0f) - this.x, l10 - this.y))) + org.telegram.messenger.g0.L(80.0f)) / org.telegram.messenger.g0.L(160.0f));
        int i7 = this.r.e;
        int i10 = this.n.e;
        float C = com.google.android.recaptcha.internal.a.C(l11, 2.0f, 3.0f, l11 * l11);
        double[] dArr = this.q3;
        i0.a.j(i7, dArr);
        double[] dArr2 = this.r3;
        i0.a.j(i10, dArr2);
        double d = C;
        double[] dArr3 = this.s3;
        if (dArr3.length != 3) {
            throw new IllegalArgumentException("outResult must have a length of 3.");
        }
        double d2 = 1.0d - d;
        double d10 = (dArr2[0] * d) + (dArr[0] * d2);
        dArr3[0] = d10;
        double d11 = (dArr2[1] * d) + (dArr[1] * d2);
        dArr3[1] = d11;
        double d12 = (dArr2[2] * d) + (dArr[2] * d2);
        dArr3[2] = d12;
        return i0.a.b(d10, d11, d12);
    }

    public final void O(Canvas canvas, float f10, float f11, float f12, int i7, boolean z9) {
        PorterDuffColorFilter n1 = n1(i7);
        m1 m1Var = this.T1;
        m1Var.setColorFilter(n1);
        m1Var.setAlpha(qs.e4);
        float f13 = f12 / 2.0f;
        float f14 = f11 - f13;
        float f15 = f10 + f12;
        float f16 = f11 + f13;
        m1Var.setBounds((int) f10, (int) f14, (int) f15, (int) f16);
        if (!z9) {
            m1Var.draw(canvas);
            return;
        }
        float f17 = f12 * 0.095f;
        float f18 = (0.28f * f12) + f10;
        float f19 = f11 - (0.21f * f12);
        float f20 = (0.74f * f12) + f10;
        float f21 = (0.25f * f12) + f11;
        RectF rectF = this.V5;
        rectF.set(f10 - org.telegram.messenger.g0.L(2.0f), f14 - org.telegram.messenger.g0.L(2.0f), f15 + org.telegram.messenger.g0.L(2.0f), f16 + org.telegram.messenger.g0.L(2.0f));
        canvas.saveLayer(rectF, null);
        m1Var.draw(canvas);
        Paint paint = this.Y1;
        paint.setStrokeWidth((0.065f * f12 * 2.0f) + f17);
        canvas.drawLine(f18, f19, f20, f21, paint);
        canvas.restore();
        Paint paint2 = this.A1;
        paint2.setColor(i7);
        paint2.setStrokeWidth(f17);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        canvas.drawLine(f18, f19, f20, f21, paint2);
        paint2.setStrokeCap(Paint.Cap.BUTT);
    }

    public final void O0() {
        this.X1.C(false);
        Bitmap bitmap = this.R2;
        if (bitmap != null) {
            bitmap.recycle();
            this.R2 = null;
        }
        zg0 zg0Var = this.a9;
        if (zg0Var != null) {
            zg0Var.C(false);
            this.a9 = null;
        }
        zg0 zg0Var2 = this.l8;
        if (zg0Var2 != null) {
            zg0Var2.C(false);
            this.l8 = null;
        }
        i5 i5Var = this.k8;
        if (i5Var != null) {
            i5Var.n(this);
            this.k8 = null;
            this.m8 = 0L;
        }
        P0(this.F);
        P0(this.G);
        removeCallbacks(this.p9);
        v9 v9Var = this.i2;
        if (v9Var != null) {
            v9Var.f();
        }
        VelocityTracker velocityTracker = this.k0;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.k0 = null;
        }
        VelocityTracker velocityTracker2 = this.m9;
        if (velocityTracker2 != null) {
            velocityTracker2.recycle();
            this.m9 = null;
        }
        HashMap hashMap = this.J7;
        Iterator it = hashMap.values().iterator();
        while (it.hasNext()) {
            ((i5) it.next()).n(this);
        }
        for (Drawable drawable : this.J.values()) {
            if (drawable instanceof i5) {
                ((i5) drawable).n(this);
            }
        }
        hashMap.clear();
        HashMap hashMap2 = this.K7;
        Iterator it2 = hashMap2.values().iterator();
        while (it2.hasNext()) {
            g5 g5Var = ((k1) it2.next()).a;
            if (g5Var != null) {
                g5Var.b();
            }
        }
        hashMap2.clear();
    }

    public final void P(Canvas canvas, float f10, float f11, float f12, float f13) {
        if (this.p1 == null || f13 <= 0.004f) {
            return;
        }
        float L = org.telegram.messenger.g0.L(15.0f);
        TextPaint textPaint = this.y2;
        textPaint.setTextSize(L);
        textPaint.setColor(-1);
        textPaint.setAlpha((int) (f13 * 255.0f));
        canvas.drawText(this.p1, ((f10 + f12) - org.telegram.messenger.g0.L(16.0f)) - textPaint.measureText(this.p1), f11 + org.telegram.messenger.g0.L(5.0f), textPaint);
        textPaint.setAlpha(qs.e4);
    }

    public final void P0(i1 i1Var) {
        if (i1Var == null) {
            return;
        }
        i5 i5Var = i1Var.c;
        if (i5Var != null) {
            i5Var.n(this);
        }
        i5 i5Var2 = i1Var.d;
        if (i5Var2 != null && !this.J7.containsValue(i5Var2)) {
            i1Var.d.n(this);
        }
        i1Var.G = true;
        y yVar = i1Var.F;
        if (yVar != null) {
            yVar.e = true;
            qs.f(yVar.a).n(yVar, qs.Y1);
            i1Var.F = null;
        }
    }

    public final void Q(float f10, float f11, float f12, Canvas canvas, boolean z9) {
        Canvas canvas2;
        float f13;
        float f14;
        if (this.W8 == 0) {
            canvas2 = canvas;
            zg0 r12 = r1();
            int L = org.telegram.messenger.g0.L(27.0f);
            float f15 = L / 2.0f;
            int i7 = (int) (f11 - f15);
            r12.setBounds((int) ((org.telegram.messenger.g0.L(26.0f) + f10) - f15), i7, ((int) ((org.telegram.messenger.g0.L(26.0f) + f10) - f15)) + L, L + i7);
            r12.draw(canvas2);
        } else if (z9) {
            float L2 = f11 - org.telegram.messenger.g0.L(10.0f);
            Paint.Style style = Paint.Style.STROKE;
            Paint paint = this.R8;
            paint.setStyle(style);
            paint.setStrokeCap(Paint.Cap.ROUND);
            paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
            paint.setColor(-1);
            float f16 = 1.0f;
            paint.setAlpha((int) (Color.alpha(-1) * 1.0f));
            float L3 = ((org.telegram.messenger.g0.L(26.0f) + f10) - org.telegram.messenger.g0.L(10.0f)) + org.telegram.messenger.g0.L(10.0f);
            float L4 = L2 + org.telegram.messenger.g0.L(11.0f);
            float L5 = org.telegram.messenger.g0.L(7.25f);
            if (f12 >= 0.0f) {
                float l10 = 1.0f - Utilities.l(f12 / 0.42f);
                float x10 = org.telegram.ui.Cells.f1.x(l10, l10, l10, 1.0f);
                if (f12 < 0.6f) {
                    float f17 = 1.0f - (f12 / 0.6f);
                    f14 = (1.0f - ((f17 * f17) * f17)) * 364.0f;
                } else {
                    float l11 = Utilities.l((f12 - 0.6f) / 0.12f);
                    f14 = 364.0f - ((3.0f - (l11 * 2.0f)) * ((4.0f * l11) * l11));
                }
                f13 = f14;
                f16 = x10;
            } else {
                f13 = 0.0f;
            }
            float f18 = L4 - L5;
            RectF rectF = this.S8;
            rectF.set(L3 - L5, f18, L3 + L5, L5 + L4);
            canvas.drawArc(rectF, -82.0f, f16 * 344.0f, false, paint);
            canvas.drawLine(L3, f18, L3, L2 + org.telegram.messenger.g0.L(2.2f), paint);
            double radians = Math.toRadians(f13 - 90.0f);
            canvas2 = canvas;
            canvas2.drawLine(L3, L4, org.telegram.ui.Cells.f1.d(3.8f, (float) Math.cos(radians), L3), org.telegram.ui.Cells.f1.d(3.8f, (float) Math.sin(radians), L4), paint);
            paint.setStyle(Paint.Style.FILL);
            canvas2.drawCircle(L3, L4, org.telegram.messenger.g0.N(1.2f), paint);
        } else {
            canvas2 = canvas;
            if (n()) {
                zg0 p12 = p1();
                int L6 = org.telegram.messenger.g0.L(28.0f);
                float f19 = L6 / 2.0f;
                int i10 = (int) (f11 - f19);
                p12.setBounds((int) ((org.telegram.messenger.g0.L(26.0f) + f10) - f19), i10, ((int) ((org.telegram.messenger.g0.L(26.0f) + f10) - f19)) + L6, L6 + i10);
                p12.draw(canvas2);
            } else {
                int i11 = this.W8;
                if (i11 == R.drawable.msg_download) {
                    zg0 q12 = q1();
                    int L7 = org.telegram.messenger.g0.L(28.0f);
                    float f20 = L7 / 2.0f;
                    int i12 = (int) (f11 - f20);
                    q12.setBounds((int) ((org.telegram.messenger.g0.L(26.0f) + f10) - f20), i12, ((int) ((org.telegram.messenger.g0.L(26.0f) + f10) - f20)) + L7, L7 + i12);
                    q12.draw(canvas2);
                } else {
                    o0(canvas2, i11 == R.drawable.msg_retry ? this.R1 : i11 == R.drawable.msg_copy ? this.J1 : this.S1, f10 + org.telegram.messenger.g0.L(26.0f), f11, org.telegram.messenger.g0.L(20.0f), 1.0f);
                    canvas2 = canvas2;
                }
            }
        }
        TextPaint textPaint = this.C1;
        textPaint.setColor(-1);
        float f21 = this.s1;
        if (f21 <= 0.0f) {
            f21 = org.telegram.messenger.g0.L(15.0f);
        }
        textPaint.setTextSize(f21);
        String str = this.U8;
        float L8 = f10 + org.telegram.messenger.g0.L(48.0f);
        float L10 = org.telegram.messenger.g0.L(5.0f) + f11;
        int indexOf = str.indexOf(10);
        if (indexOf >= 0) {
            canvas2.drawText(str, 0, indexOf, L8, L10 - org.telegram.messenger.g0.L(9.0f), (Paint) textPaint);
            canvas.drawText(str, indexOf + 1, str.length(), L8, L10 + org.telegram.messenger.g0.L(9.0f), (Paint) textPaint);
            return;
        }
        if (!s0(str)) {
            canvas2.drawText(str, L8, L10, textPaint);
            return;
        }
        float textSize = textPaint.getTextSize();
        TextPaint textPaint2 = this.y2;
        textPaint2.setTextSize(textSize);
        textPaint2.setColor(textPaint.getColor());
        canvas2.drawText(this.v2, L8, L10, textPaint);
        float measureText = textPaint.measureText(this.v2) + L8;
        canvas2.drawText(this.w2, measureText, L10, textPaint2);
        canvas2.drawText(this.x2, textPaint2.measureText(this.w2) + measureText, L10, textPaint);
    }

    public final void Q0() {
        int i7 = this.r9;
        if (i7 >= 0) {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.y9[i7] = X0(i7, currentAnimationTimeMillis);
            this.x9[i7] = currentAnimationTimeMillis;
            invalidate();
        }
        this.r9 = -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:171:0x040a, code lost:
    
        if (r2.a0 < (r2.e[0] - 1)) goto L218;
     */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0425  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0447  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x048a  */
    /* JADX WARN: Removed duplicated region for block: B:184:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:185:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0265  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void R(Canvas canvas, int i7, long j3) {
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        boolean z9;
        float f15;
        float f16;
        float max;
        float f17;
        float height;
        int L;
        RectF rectF;
        boolean z10;
        float f18;
        float max2;
        boolean z11;
        boolean z12;
        boolean z13;
        zg0 zg0Var;
        String sb2;
        float f19;
        float L2;
        zg0 zg0Var2;
        float f20;
        String str;
        boolean z14 = this.g9 || (this.m1 != null && j3 < this.u1);
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        if (!this.g9 && z14 && this.N8 && (str = this.U8) != null && !str.equals(this.m1)) {
            this.N8 = false;
            this.M8 = currentAnimationTimeMillis;
        }
        if (!z14 || this.N8) {
            if (!z14 && this.N8) {
                this.N8 = false;
                this.M8 = currentAnimationTimeMillis;
            }
        } else if (this.U8 == null || currentAnimationTimeMillis - this.M8 >= 360) {
            this.N8 = true;
            this.M8 = currentAnimationTimeMillis;
            this.U8 = this.m1;
            int i10 = this.n1;
            this.W8 = i10;
            this.p1 = this.o1;
            this.V8 = false;
            this.X8 = currentAnimationTimeMillis;
            if (i10 == 0) {
                zg0 r12 = r1();
                r12.N(0, false, false);
                r12.start();
            } else if (n()) {
                zg0 p12 = p1();
                p12.N(0, false, false);
                p12.start();
            } else if (this.W8 == R.drawable.msg_download) {
                zg0 q12 = q1();
                q12.N(0, false, false);
                q12.start();
            }
        }
        String str2 = this.U8;
        if (str2 == null) {
            return;
        }
        float f21 = (currentAnimationTimeMillis - this.M8) / 1000.0f;
        float f22 = 2.0f;
        if (this.N8) {
            boolean z15 = str2.indexOf(10) >= 0 || s1(this.U8) + ((float) org.telegram.messenger.g0.L(66.0f)) >= ((float) (i7 - org.telegram.messenger.g0.L(32.0f)));
            if (f21 >= 0.5f) {
                f13 = 1.0f;
                f20 = 1.0f;
            } else {
                f20 = 1.0f;
                f13 = (float) h1(f21, z15 ? 0.75d : 0.6d, 0.42d);
            }
            f10 = f20;
            f11 = 2.0f;
        } else {
            if (!this.V8) {
                if (f21 >= 0.36f) {
                    this.U8 = null;
                    return;
                }
                float f23 = f21 / 0.36f;
                float f24 = f23;
                int i11 = 0;
                float f25 = 1.0f;
                f10 = 1.0f;
                float f26 = 0.0f;
                while (i11 < 12) {
                    float f27 = (f26 + f25) / f22;
                    float f28 = 1.0f - f27;
                    float f29 = f22;
                    float f30 = f28 * 3.0f;
                    if (com.google.android.recaptcha.internal.a.x(f27, f27, f27, (f30 * f27 * f27 * 0.9f) + com.google.android.recaptcha.internal.a.D(f30, f28, f27, 0.5f)) < f23) {
                        f26 = f27;
                    } else {
                        f25 = f27;
                    }
                    i11++;
                    f24 = f27;
                    f22 = f29;
                }
                f11 = f22;
                f12 = 3.0f;
                f13 = 1.0f - (((f24 * f24) * f24) + (((((1.0f - f24) * 3.0f) * f24) * f24) * 0.5f));
                if (!this.N8 || f13 > 0.0f) {
                    invalidate();
                }
                boolean z16 = this.U8.indexOf(10) < 0;
                float L3 = org.telegram.messenger.g0.L(!z16 ? 14.0f : 15.0f);
                TextPaint textPaint = this.C1;
                textPaint.setTextSize(L3);
                float s12 = s1(this.U8);
                if (this.p1 == null) {
                    float L4 = org.telegram.messenger.g0.L(15.0f);
                    TextPaint textPaint2 = this.y2;
                    textPaint2.setTextSize(L4);
                    f14 = textPaint2.measureText(this.p1) + org.telegram.messenger.g0.L(16.0f);
                } else {
                    f14 = 0.0f;
                }
                float min = Math.min(i7 - org.telegram.messenger.g0.L(32.0f), org.telegram.messenger.g0.L(66.0f) + s12 + f14);
                float L5 = org.telegram.messenger.g0.L(!z16 ? 56.0f : 44.0f);
                float L6 = (min - org.telegram.messenger.g0.L(66.0f)) - f14;
                this.s1 = textPaint.getTextSize() * ((s12 > L6 || s12 <= 0.0f) ? f10 : Math.max(0.8f, L6 / s12));
                z9 = f13 >= 0.0f;
                float l10 = !z9 ? Utilities.l(f21 / 0.14f) : 0.0f;
                float max3 = Math.max(f13, 0.0f);
                if (z9) {
                    f15 = 0.8f;
                    f16 = f10;
                    max = (Math.max(0.0f, max3 - f16) + Math.min(f16, max3 / 0.55f)) * L5;
                } else {
                    f15 = 0.8f;
                    max = L5;
                    f16 = f10;
                }
                if (z9) {
                    float f31 = min - max;
                    if (max3 <= f16) {
                        max3 = g1(0.15f, f16, max3);
                    }
                    f17 = (f31 * max3) + max;
                } else {
                    f17 = org.telegram.messenger.g0.T1(min, L5, l10 * l10);
                }
                float f32 = f17;
                float x10 = !z9 ? org.telegram.ui.Cells.f1.x(l10, l10, l10, f16) : 1.0f;
                if (max >= 0.5f) {
                    return;
                }
                float f33 = i7 / f11;
                if (this.f1 > 0.001f) {
                    height = a1() - (Utilities.l(this.f1) * b1());
                    L = org.telegram.messenger.g0.L(12.0f);
                } else {
                    height = ((getHeight() - this.u3) - org.telegram.messenger.g0.L(40.0f)) - org.telegram.messenger.g0.L(20.0f);
                    L = org.telegram.messenger.g0.L(14.0f);
                }
                float f34 = this.g9 ? this.f9 : (height - L) - (L5 / f11);
                float f35 = f32 / f11;
                float f36 = max / f11;
                boolean z17 = z9;
                RectF rectF2 = this.L8;
                rectF2.set(f33 - f35, f34 - f36, f35 + f33, f34 + f36);
                float min2 = Math.min(f36, org.telegram.messenger.g0.L(24.0f));
                Path path = this.E1;
                path.rewind();
                path.addRoundRect(rectF2, min2, min2, Path.Direction.CW);
                this.T8 = 352321535;
                this.A6 = true;
                J(canvas, rectF2, min2, x10);
                this.T8 = 0;
                this.A6 = false;
                float g12 = z17 ? 1.0f : g1(0.2f, 0.95f, f13);
                float l11 = z17 ? 1.0f - Utilities.l(f21 / 0.05f) : g1(0.08f, 0.5f, f13);
                if (l11 <= 0.004f) {
                    return;
                }
                boolean z18 = this.N8;
                float f37 = z18 ? (currentAnimationTimeMillis - this.X8) / 1000.0f : -1.0f;
                float l12 = z18 ? Utilities.l((f21 - 0.15f) / 0.23f) : 1.0f;
                float C = com.google.android.recaptcha.internal.a.C(l12, f11, f12, l11 * l12 * l12);
                if (this.N8 && l12 < 1.0f) {
                    invalidate();
                }
                int i12 = this.W8;
                if (i12 == R.drawable.msg_recent || (i12 == R.drawable.msg_retry && s0(this.U8))) {
                    rectF = rectF2;
                    z10 = true;
                } else {
                    rectF = rectF2;
                    z10 = false;
                }
                if (this.N8) {
                    f18 = 1.0f;
                    max2 = com.google.android.recaptcha.internal.a.z(1.0f, g12, 0.35f, 1.0f);
                } else {
                    f18 = 1.0f;
                    max2 = Math.max(0.05f, Math.min(1.0f, f32 / min));
                }
                canvas.save();
                canvas.clipPath(path);
                canvas.scale(max2, max2, f33, f34);
                if (i() && ((this.S4 || this.Z1) && canvas.isHardwareAccelerated())) {
                    if (this.b9 == null) {
                        this.b9 = android.support.v4.media.session.w.d("toastContent");
                    }
                    if ((this.W8 != 0 || (zg0Var2 = this.Y8) == null || zg0Var2.a0 >= zg0Var2.e[0] - 1) && (!n() || (zg0Var = this.Z8) == null || zg0Var.a0 >= zg0Var.e[0] - 1)) {
                        zg0 zg0Var3 = this.a9;
                        if (zg0Var3 == null || this.W8 != R.drawable.msg_download) {
                            z11 = false;
                            z12 = true;
                        } else {
                            z11 = false;
                            z12 = true;
                        }
                        z13 = z11;
                        if ((z10 && f37 >= 0.0f && f37 < f15) || z13) {
                            z11 = z12;
                        }
                        if (z13) {
                            invalidate();
                        }
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(this.U8);
                        sb3.append(this.W8);
                        int i13 = (int) min;
                        sb3.append(i13);
                        sb3.append((int) this.s1);
                        sb2 = sb3.toString();
                        if (z11 && sb2.equals(this.d9) && a0.e(this.b9)) {
                            f19 = f34;
                        } else {
                            this.d9 = sb2;
                            f19 = f34;
                            Q(0.0f, L5 / 2.0f, f37, a0.a(i13, (int) L5, this.b9), z10);
                            a0.d(this.b9);
                        }
                        L2 = (f18 - g12) * org.telegram.messenger.g0.L(5.0f);
                        if (Math.abs(L2 - this.c9) > 0.25f) {
                            this.c9 = L2;
                            Object obj = this.b9;
                            if (L2 <= 0.3f) {
                                L2 = 0.0f;
                            }
                            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                            a0.j(obj, L2);
                        }
                        a0.h(this.b9, l11);
                        float f38 = L5 / 2.0f;
                        canvas.translate(f33 - (min / 2.0f), f19 - f38);
                        a0.c(canvas, this.b9);
                        P(canvas, 0.0f, f38, min, C);
                    } else {
                        z11 = false;
                        z12 = true;
                    }
                    z13 = z12;
                    if (z10) {
                        z11 = z12;
                        if (z13) {
                        }
                        StringBuilder sb32 = new StringBuilder();
                        sb32.append(this.U8);
                        sb32.append(this.W8);
                        int i132 = (int) min;
                        sb32.append(i132);
                        sb32.append((int) this.s1);
                        sb2 = sb32.toString();
                        if (z11) {
                        }
                        this.d9 = sb2;
                        f19 = f34;
                        Q(0.0f, L5 / 2.0f, f37, a0.a(i132, (int) L5, this.b9), z10);
                        a0.d(this.b9);
                        L2 = (f18 - g12) * org.telegram.messenger.g0.L(5.0f);
                        if (Math.abs(L2 - this.c9) > 0.25f) {
                        }
                        a0.h(this.b9, l11);
                        float f382 = L5 / 2.0f;
                        canvas.translate(f33 - (min / 2.0f), f19 - f382);
                        a0.c(canvas, this.b9);
                        P(canvas, 0.0f, f382, min, C);
                    }
                    z11 = z12;
                    if (z13) {
                    }
                    StringBuilder sb322 = new StringBuilder();
                    sb322.append(this.U8);
                    sb322.append(this.W8);
                    int i1322 = (int) min;
                    sb322.append(i1322);
                    sb322.append((int) this.s1);
                    sb2 = sb322.toString();
                    if (z11) {
                    }
                    this.d9 = sb2;
                    f19 = f34;
                    Q(0.0f, L5 / 2.0f, f37, a0.a(i1322, (int) L5, this.b9), z10);
                    a0.d(this.b9);
                    L2 = (f18 - g12) * org.telegram.messenger.g0.L(5.0f);
                    if (Math.abs(L2 - this.c9) > 0.25f) {
                    }
                    a0.h(this.b9, l11);
                    float f3822 = L5 / 2.0f;
                    canvas.translate(f33 - (min / 2.0f), f19 - f3822);
                    a0.c(canvas, this.b9);
                    P(canvas, 0.0f, f3822, min, C);
                } else {
                    float f39 = f34;
                    canvas.saveLayerAlpha(rectF, (int) (l11 * 255.0f));
                    float f40 = f33 - (min / 2.0f);
                    Q(f40, f39, f37, canvas, z10);
                    canvas.restore();
                    P(canvas, f40, f39, min, C);
                }
                canvas.restore();
                return;
            }
            if (f21 >= 0.14f) {
                this.U8 = null;
                this.V8 = false;
                return;
            } else {
                f10 = 1.0f;
                f11 = 2.0f;
                f13 = -1.0f;
            }
        }
        f12 = 3.0f;
        if (!this.N8) {
        }
        invalidate();
        if (this.U8.indexOf(10) < 0) {
        }
        float L32 = org.telegram.messenger.g0.L(!z16 ? 14.0f : 15.0f);
        TextPaint textPaint3 = this.C1;
        textPaint3.setTextSize(L32);
        float s122 = s1(this.U8);
        if (this.p1 == null) {
        }
        float min3 = Math.min(i7 - org.telegram.messenger.g0.L(32.0f), org.telegram.messenger.g0.L(66.0f) + s122 + f14);
        float L52 = org.telegram.messenger.g0.L(!z16 ? 56.0f : 44.0f);
        float L62 = (min3 - org.telegram.messenger.g0.L(66.0f)) - f14;
        this.s1 = textPaint3.getTextSize() * ((s122 > L62 || s122 <= 0.0f) ? f10 : Math.max(0.8f, L62 / s122));
        if (f13 >= 0.0f) {
        }
        if (!z9) {
        }
        float max32 = Math.max(f13, 0.0f);
        if (z9) {
        }
        if (z9) {
        }
        float f322 = f17;
        if (!z9) {
        }
        if (max >= 0.5f) {
        }
    }

    public final void R0() {
        float f10 = this.e0;
        if (f10 == 0.0f && this.f0 == 0.0f) {
            return;
        }
        this.i0 = f10;
        this.j0 = this.f0;
        this.W = AnimationUtils.currentAnimationTimeMillis();
        this.U = true;
    }

    public final void S0() {
        int i7 = this.V7;
        if (i7 < 0 || this.X7 >= this.W7) {
            return;
        }
        this.Y7 = k1(i7);
        this.X7 = AnimationUtils.currentAnimationTimeMillis();
        invalidate();
    }

    public final float T(float f10) {
        if (this.Q4 >= 1.0f) {
            return 1.0f;
        }
        return org.telegram.messenger.g0.T1(this.T4 ? 0.85f : 0.92f, 1.0f, f10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x007f, code lost:
    
        if (r11 == null) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Bitmap T0() {
        RLottieNative rLottieNative;
        int width = getWidth();
        int height = getHeight();
        if (width > 0 && height > 0) {
            float f10 = this.f1;
            this.f1 = 0.0f;
            int min = Math.min(height, (int) (width * 1.92f));
            int max = (int) Math.max(0.0f, Math.min(height - min, ((l() / 2.0f) + m()) - (min / 2.0f)));
            try {
                Bitmap.Config config = Bitmap.Config.ARGB_8888;
                Bitmap createBitmap = Bitmap.createBitmap(width, min, config);
                if (this.R2 == null) {
                    zg0 zg0Var = this.X1;
                    if (zg0Var.b > 0) {
                        try {
                            rLottieNative = RLottieNative.b(org.telegram.messenger.g0.y2(null, R.raw.plane_logo_plain), null, null, null);
                            if (rLottieNative != null) {
                                try {
                                    Bitmap createBitmap2 = Bitmap.createBitmap(zg0Var.b, zg0Var.c, config);
                                    rLottieNative.c(Math.min(33, rLottieNative.a[0] - 1), createBitmap2, true);
                                    this.R2 = createBitmap2;
                                } catch (Throwable th2) {
                                    th = th2;
                                    try {
                                        a8.g(th, true);
                                    } finally {
                                        if (rLottieNative != null) {
                                            rLottieNative.d();
                                        }
                                    }
                                }
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            rLottieNative = null;
                        }
                    }
                }
                Canvas canvas = new Canvas(createBitmap);
                canvas.translate(0.0f, -max);
                System.currentTimeMillis();
                z(canvas, width, height);
                this.T2 = true;
                A(canvas, width);
                this.T2 = false;
                canvas.setBitmap(null);
                this.f1 = f10;
                return createBitmap;
            } catch (OutOfMemoryError unused) {
                this.f1 = f10;
            }
        }
        return null;
    }

    public final Drawable U(String str) {
        HashMap hashMap = this.J;
        Drawable drawable = (Drawable) hashMap.get(str);
        if (drawable == null) {
            drawable = org.telegram.messenger.i6.g(str);
            if (drawable == null) {
                drawable = org.telegram.messenger.i6.g(str.replace("️", ""));
            }
            if (drawable != null) {
                hashMap.put(str, drawable);
            }
        }
        return drawable;
    }

    public final void U0(String str) {
        if (this.v0) {
            this.t2 = this.L0.c() + org.telegram.messenger.g0.L(2.0f) + org.telegram.messenger.g0.L(12.0f) + org.telegram.messenger.g0.L(8.0f) + org.telegram.messenger.g0.L(11.0f);
            this.v0 = false;
            this.A0 = false;
            this.s2 = this.B0 * this.G0 > 0.001f;
            this.q2 = AnimationUtils.currentAnimationTimeMillis();
            this.C0 = this.B0;
            this.D0 = 0.0f;
            this.E0 = System.currentTimeMillis();
            g gVar = this.t0;
            if (gVar != null) {
                j1(gVar);
            }
            u1(true);
            if (str != null) {
                d1(0, str, null);
            }
            i0();
            this.e = null;
            this.u0 = null;
            cb.c cVar = this.c;
            if (cVar != null) {
                cVar.w(0);
            }
        }
    }

    public final Bitmap V(i5 i5Var) {
        Bitmap n10;
        z2 z2Var = i5Var.k;
        if (z2Var != null) {
            zg0 B = z2Var.B();
            if (B != null) {
                if (!this.T2) {
                    B.V(0L);
                }
                if (B.u()) {
                    if (B.Q != null) {
                        return B.Q;
                    }
                    if (B.R != null) {
                        return B.R;
                    }
                    return null;
                }
            } else {
                v5 m10 = z2Var.m();
                if (m10 != null) {
                    if (!this.T2) {
                        m10.D(System.currentTimeMillis());
                    }
                    if (m10.s()) {
                        return m10.m();
                    }
                } else if (z2Var.J() && z2Var.L() && (n10 = z2Var.n()) != null && !n10.isRecycled()) {
                    return n10;
                }
            }
        }
        return null;
    }

    public final float V0() {
        if (this.g1 < 0.5f) {
            return 1.0f;
        }
        return Utilities.l((AnimationUtils.currentAnimationTimeMillis() - this.I2) / 420.0f);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0077 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final i1 W() {
        long j3;
        i1 i1Var = new i1();
        ArrayList arrayList = this.I;
        if (!arrayList.isEmpty()) {
            i1Var.a = 1;
            i1Var.b = new Drawable[arrayList.size()];
            i1Var.w = new long[arrayList.size()];
            i1Var.x = new boolean[arrayList.size()];
            long[] jArr = new long[arrayList.size()];
            i1Var.y = jArr;
            if (this.S4) {
                Arrays.fill(jArr, 1L);
            }
            for (int i7 = 0; i7 < i1Var.b.length; i7++) {
                String str = (String) arrayList.get(i7);
                i1Var.b[i7] = U(str);
                if (str.startsWith("c:")) {
                    try {
                        j3 = Long.parseLong(str.substring(2));
                    } catch (NumberFormatException unused) {
                    }
                    long[] jArr2 = i1Var.w;
                    if (j3 > 0) {
                        j3 = (-1) - (str.hashCode() & 4294967295L);
                    }
                    jArr2[i7] = j3;
                    i1Var.x[i7] = x.d(i1Var.b[i7]);
                }
                j3 = 0;
                long[] jArr22 = i1Var.w;
                if (j3 > 0) {
                }
                jArr22[i7] = j3;
                i1Var.x[i7] = x.d(i1Var.b[i7]);
            }
        }
        return i1Var;
    }

    public final void X(i1 i1Var) {
        TLRPC.Document document;
        if (i1Var == null || i1Var.G || i1Var.a != 2 || i1Var.F != null || (document = i1Var.A) == null) {
            return;
        }
        i1Var.F = new y(this.b, document, i1Var.B, org.telegram.messenger.g0.L(48.0f), new f1(0, this, i1Var));
    }

    public final float X0(int i7, long j3) {
        return 1.0f - ((1.0f - this.z9[i7]) * ((float) Math.exp((-(j3 - this.w9[i7])) / 90.0f)));
    }

    public final boolean Y(Bitmap bitmap) {
        float[] fArr = o1.b;
        float f10 = fArr[36];
        float f11 = fArr[38];
        float f12 = fArr[24];
        if (this.S3 != null && this.T3 == bitmap && f10 == this.U3 && f11 == this.V3 && f12 == this.W3) {
            return true;
        }
        if (bitmap == null || bitmap.isRecycled()) {
            return false;
        }
        this.T3 = bitmap;
        this.U3 = f10;
        this.V3 = f11;
        this.W3 = f12;
        Bitmap bitmap2 = this.S3;
        if (bitmap2 == null || bitmap2.getWidth() != bitmap.getWidth() || this.S3.getHeight() != bitmap.getHeight()) {
            this.S3 = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        }
        this.S3.eraseColor(0);
        Canvas canvas = new Canvas(this.S3);
        double radians = Math.toRadians(f12);
        float f13 = (float) (-Math.cos(radians));
        float f14 = (float) (-Math.sin(radians));
        float N = org.telegram.messenger.g0.N(f10);
        float N2 = org.telegram.messenger.g0.N(f11);
        float f15 = f13 * N2;
        float f16 = N2 * f14;
        canvas.drawBitmap(bitmap, f15, f16, (Paint) null);
        canvas.drawBitmap(bitmap, f15 - (f13 * N), f16 - (f14 * N), this.X3);
        return true;
    }

    public final void Y0(j1 j1Var, float f10, float f11) {
        if (j1Var != null) {
            this.b7 = W0(j1Var.c);
        }
        if (this.f2) {
            if (this.r != null) {
                this.r = null;
            }
            this.n = j1Var;
            this.s = 1.0f;
            invalidate();
            return;
        }
        this.r = this.n;
        this.n = j1Var;
        this.s = 0.0f;
        this.w = System.currentTimeMillis();
        this.x = f10;
        this.y = f11;
        this.q0++;
        i0();
        invalidate();
    }

    public final void Z(i1 i1Var) {
        i5 i5Var;
        z2 z2Var;
        if (i1Var == null || i1Var.e != null || (i5Var = i1Var.c) == null) {
            return;
        }
        y yVar = i1Var.F;
        if ((yVar == null || yVar.h) && (z2Var = i5Var.k) != null && z2Var.J() && z2Var.L()) {
            int L = org.telegram.messenger.g0.L(48.0f);
            Bitmap createBitmap = Bitmap.createBitmap(L, L, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            i1Var.c.setBounds(0, 0, L, L);
            i1Var.c.setColorFilter(null);
            i1Var.c.setAlpha(qs.e4);
            z2Var.h1 = 1.0f;
            i1Var.c.draw(canvas);
            E0(i1Var, createBitmap);
        }
    }

    public final String a0() {
        String M0 = hd.M0(2131746478, null);
        if (!M0.equals(this.u2)) {
            this.u2 = M0;
            Matcher matcher = Pattern.compile("\\d+").matcher(M0);
            if (matcher.find()) {
                this.v2 = M0.substring(0, matcher.start());
                this.w2 = matcher.group();
                this.x2 = M0.substring(matcher.end());
            } else {
                this.v2 = M0;
                this.x2 = "";
                this.w2 = "";
            }
        }
        return this.u2;
    }

    public final float a1() {
        return (getHeight() - this.u3) - org.telegram.messenger.g0.L(10.0f);
    }

    public final float b(double d) {
        float f10 = this.A4;
        double sin = Math.sin((f10 * 78.233d) + (((f10 * 17.31d) + d) * 12.9898d)) * 43758.5453d;
        return ((float) (sin - Math.floor(sin))) * 300.0f;
    }

    public final float b1() {
        float max = Math.max(org.telegram.messenger.g0.L(160.0f), a1() - ((((l() + (org.telegram.messenger.g0.L(51.0f) + this.t3)) + org.telegram.messenger.g0.L(24.0f)) + org.telegram.messenger.g0.L(11.0f)) + org.telegram.messenger.g0.L(13.0f)));
        if (this.h1 == 2 && this.x1) {
            ArrayList arrayList = this.v1;
            if (arrayList.size() <= 3) {
                max = Math.min(max, arrayList.isEmpty() ? org.telegram.messenger.g0.L(286.0f) : org.telegram.messenger.g0.L(8.0f) + ((org.telegram.messenger.camera.q.A(10.0f, 2, getWidth()) - org.telegram.messenger.g0.L(8.0f)) / 3.0f));
            }
        }
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        float f10 = this.P2;
        if (f10 < 0.0f || this.f1 < 0.01f) {
            this.P2 = max;
        } else if (f10 != max) {
            long min = Math.min(64L, Math.max(0L, currentAnimationTimeMillis - this.Q2));
            float f11 = this.P2;
            float z9 = com.google.android.recaptcha.internal.a.z(1.0f, (float) Math.exp((-min) / 140.0f), max - f11, f11);
            this.P2 = z9;
            if (Math.abs(max - z9) < 0.5f) {
                this.P2 = max;
            } else {
                invalidate();
            }
        }
        this.Q2 = currentAnimationTimeMillis;
        return this.P2;
    }

    public final void c() {
        j1 j1Var;
        Runnable runnable = this.d2;
        if (runnable != null) {
            runnable.run();
        }
        if (!this.e2 && !this.I.isEmpty() && (j1Var = this.n) != null && (j1Var.a != 0 || this.F.a == 2)) {
            this.T7 = AnimationUtils.currentAnimationTimeMillis();
            this.Q7 = -1;
            this.O7 = 0.0f;
            setSceneFromCard(t(this.M7));
        }
        setPattern(W());
        if (!this.f2) {
            this.r0 = AnimationUtils.currentAnimationTimeMillis();
        }
        B0();
    }

    public final float c1(float f10, float f11, int i7, int i10) {
        float f12;
        float f13;
        float f14;
        float f15;
        int i11;
        float f16;
        if (!this.y3) {
            return 0.0f;
        }
        float f17 = i7;
        float f18 = f10 - (f17 / 2.0f);
        float f19 = this.H3;
        float f20 = i10;
        float f21 = f11 - (f20 / 2.0f);
        float f22 = (this.I3 * f21) + (f18 * f19);
        float abs = ((Math.abs(this.I3) * f20) + (Math.abs(f19) * f17)) / 2.0f;
        float f23 = 1.0f;
        float max = Math.max(1.0f, abs);
        float[] fArr = o1.b;
        float f24 = fArr[19] / 100.0f;
        if (f24 > 0.0f) {
            float f25 = this.I3;
            float max2 = ((f21 * this.H3) + (f18 * (-f25))) / Math.max(1.0f, ((Math.abs(this.H3) * f20) + (Math.abs(f25) * f17)) / 2.0f);
            f22 -= ((f24 * f17) * max2) * max2;
        }
        float f26 = (f22 - this.w3) / this.x3;
        float f27 = fArr[20] / 100.0f;
        if (f27 > 0.0f) {
            f26 += (((((float) Math.asin(Math.max(-1.0f, Math.min(1.0f, f22 / max)))) - Math.max(-2.1991148f, Math.min(2.1991148f, (this.w3 / max) * 1.5707964f))) / ((this.x3 / max) * 1.5707964f)) - f26) * f27;
            f12 = com.google.android.recaptcha.internal.a.v(1.0f, (float) Math.cos(Math.max(-1.5707964f, Math.min(1.5707964f, r4))), (f27 * fArr[31]) / 100.0f, 1.0f);
        } else {
            f12 = 1.0f;
        }
        this.o4 = f26;
        float f28 = this.E3;
        this.p4 = f28 * f12;
        float f29 = fArr[34] / 100.0f;
        int i12 = (f26 > 4.0f ? 1 : (f26 == 4.0f ? 0 : -1));
        if ((i12 > 0 || f26 < -4.0f) && f29 <= 0.0f) {
            this.m4 = 0.0f;
            return 0.0f;
        }
        float f30 = fArr[32];
        float f31 = f26 / fArr[29];
        i1 i1Var = this.F;
        if (i1Var != null && i1Var.a == 1) {
            f23 = 0.7f;
        }
        float f32 = f12 * f23;
        if (f31 > 4.0f || f31 < -4.0f) {
            f13 = 0.0f;
            f14 = f32;
            f15 = 4.0f;
            i11 = i12;
            f16 = 0.0f;
        } else {
            float abs2 = Math.abs(f31);
            f13 = 0.0f;
            f14 = f32;
            f15 = 4.0f;
            i11 = i12;
            f16 = f28 * f32 * ((float) Math.exp(Math.pow(abs2, f30) * (-0.5d)));
        }
        this.m4 = f16;
        float exp = (fArr[28] / 100.0f) * ((i11 > 0 || f26 < -4.0f) ? f13 : (float) Math.exp(Math.pow(Math.abs(f26), f30) * (-0.5d)));
        if (f29 > f13) {
            float f33 = f26 - fArr[33];
            if (f33 < f15 && f33 > -4.0f) {
                exp += f29 * ((float) Math.exp(Math.pow(Math.abs(f33), f30) * (-0.5d)));
            }
        }
        return this.E3 * f14 * exp;
    }

    public final void d(int i7) {
        this.e2 = true;
        boolean z9 = this.F.a != 0;
        this.I.clear();
        this.O7 = 0.0f;
        this.M7 = i7;
        j1 j1Var = this.n;
        if (j1Var == null || j1Var.a != 0 || j1Var.f != i7) {
            setSceneFromCard(t(i7));
        }
        if (z9) {
            setPattern(new i1());
        }
        Runnable runnable = this.d2;
        if (runnable != null) {
            runnable.run();
        }
        this.e2 = false;
    }

    public final void d1(int i7, String str, String str2) {
        long currentTimeMillis = 0 - System.currentTimeMillis();
        if (currentTimeMillis > 0) {
            postDelayed(new a1((Object) this, i7, (Object) str, (Object) str2, 0), currentTimeMillis);
            return;
        }
        this.n1 = i7;
        this.m1 = str;
        this.o1 = str2;
        this.u1 = System.currentTimeMillis() + (str2 != null ? 4000 : 2800);
        invalidate();
    }

    public final void e(int i7, ArrayList arrayList, boolean z9) {
        int i10 = -1;
        if (z9 && a.h != null) {
            int i11 = 0;
            while (true) {
                int[] iArr = a.h;
                if (i11 >= iArr.length) {
                    break;
                }
                if (iArr[i11] == i7) {
                    i10 = i11;
                    break;
                }
                i11++;
            }
        }
        if (i10 < 0) {
            i10 = G9;
        }
        if (arrayList == null || arrayList.isEmpty()) {
            d(i10);
            return;
        }
        this.e2 = true;
        this.M7 = i10;
        j1 j1Var = this.n;
        if (j1Var == null || j1Var.a != 0 || j1Var.f != i10) {
            setSceneFromCard(t(i10));
        }
        this.O7 = 0.0f;
        ArrayList arrayList2 = this.I;
        arrayList2.clear();
        int size = arrayList.size();
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            TLRPC.Reaction reaction = (TLRPC.Reaction) obj;
            if (arrayList2.size() >= 6) {
                break;
            }
            if (reaction instanceof TLRPC.TL_reactionCustomEmoji) {
                long j3 = ((TLRPC.TL_reactionCustomEmoji) reaction).document_id;
                String o4 = a8.p0.o(j3, "c:");
                HashMap hashMap = this.J;
                if (!hashMap.containsKey(o4)) {
                    i5 m10 = i5.m(this.b, j3, null, 2);
                    m10.a(this);
                    hashMap.put(o4, m10);
                }
                if (!arrayList2.contains(o4)) {
                    arrayList2.add(o4);
                }
            } else if (reaction instanceof TLRPC.TL_reactionEmoji) {
                TLRPC.TL_reactionEmoji tL_reactionEmoji = (TLRPC.TL_reactionEmoji) reaction;
                if (!TextUtils.isEmpty(tL_reactionEmoji.emoticon)) {
                    String str = tL_reactionEmoji.emoticon;
                    String replace = (str == null || str.startsWith("c:")) ? str : str.replace("️", "");
                    this.c2.put(replace, str);
                    if (!arrayList2.contains(replace)) {
                        arrayList2.add(replace);
                    }
                }
            }
        }
        c();
        this.e2 = false;
    }

    public final void e0(int[] iArr, int i7) {
        iArr[0] = -7829368;
        iArr[1] = -11184811;
        iArr[2] = -13421773;
        ArrayList<TL_stars.StarGiftAttribute> arrayList = ((TL_stars.TL_starGiftUnique) this.v1.get(i7)).attributes;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            TL_stars.StarGiftAttribute starGiftAttribute = arrayList.get(i10);
            i10++;
            TL_stars.StarGiftAttribute starGiftAttribute2 = starGiftAttribute;
            if (starGiftAttribute2 instanceof TL_stars.starGiftAttributeBackdrop) {
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) starGiftAttribute2;
                iArr[0] = stargiftattributebackdrop.center_color | (-16777216);
                iArr[1] = stargiftattributebackdrop.edge_color | (-16777216);
                iArr[2] = stargiftattributebackdrop.pattern_color | (-16777216);
            }
        }
    }

    public final float f(float f10, float f11, float f12) {
        float z9 = com.google.android.recaptcha.internal.a.z(f11, f10, 1.0f - ((float) Math.pow(1.0f - f12, this.X2)), f10);
        return Math.abs(f11 - z9) < 0.002f ? f11 : z9;
    }

    public final int f0() {
        int size = this.v1.size();
        if (!this.x1 || size <= 0 || size >= 3) {
            return 3;
        }
        return size;
    }

    public final i5 g0(long j3, TLRPC.Document document) {
        Long valueOf = Long.valueOf(j3);
        HashMap hashMap = this.J7;
        i5 i5Var = (i5) hashMap.get(valueOf);
        if (i5Var != null) {
            return i5Var;
        }
        i5 l10 = i5.l(this.b, 24, document);
        l10.a(this);
        hashMap.put(Long.valueOf(j3), l10);
        return l10;
    }

    public String getCurrentLink() {
        String str;
        if (this.v0 && (str = this.e) != null && this.u0 != null) {
            return str;
        }
        if (this.t0 != null) {
            return this.d;
        }
        return null;
    }

    public ArrayList<TLRPC.Reaction> getPickedEmoji() {
        ArrayList<TLRPC.Reaction> arrayList = new ArrayList<>();
        ArrayList arrayList2 = this.I;
        int size = arrayList2.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList2.get(i7);
            i7++;
            String str = (String) obj;
            if (str.startsWith("c:")) {
                try {
                    TLRPC.TL_reactionCustomEmoji tL_reactionCustomEmoji = new TLRPC.TL_reactionCustomEmoji();
                    tL_reactionCustomEmoji.document_id = Long.parseLong(str.substring(2));
                    arrayList.add(tL_reactionCustomEmoji);
                } catch (NumberFormatException unused) {
                }
            } else {
                TLRPC.TL_reactionEmoji tL_reactionEmoji = new TLRPC.TL_reactionEmoji();
                String str2 = (String) this.c2.get(str);
                if (str2 != null) {
                    str = str2;
                }
                tL_reactionEmoji.emoticon = str;
                arrayList.add(tL_reactionEmoji);
            }
        }
        return arrayList;
    }

    public int getThemeBackdropIndex() {
        j1 j1Var = this.n;
        if (j1Var == null || j1Var.a != 0) {
            return -1;
        }
        return j1Var.f;
    }

    public TL_stars.TL_starGiftUnique getThemeGift() {
        int i7;
        i1 i1Var = this.F;
        if (i1Var.a != 2 || (i7 = i1Var.q) < 0) {
            return null;
        }
        ArrayList arrayList = this.v1;
        if (i7 < arrayList.size()) {
            return (TL_stars.TL_starGiftUnique) arrayList.get(this.F.q);
        }
        return null;
    }

    public long getThemeGiftSavedId() {
        Long l10;
        TL_stars.TL_starGiftUnique themeGift = getThemeGift();
        if (themeGift != null) {
            l10 = (Long) this.y1.get(Long.valueOf(themeGift.id));
        } else {
            l10 = null;
        }
        if (l10 != null) {
            return l10.longValue();
        }
        return 0L;
    }

    public final boolean h0() {
        return this.x1 && this.v1.isEmpty();
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    public final void i0() {
        try {
            performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
    }

    public final boolean j0(Canvas canvas) {
        if (i()) {
            return (this.S4 || this.Z1) && canvas.isHardwareAccelerated() && a0.e(this.H1);
        }
        return false;
    }

    public final void j1(g gVar) {
        h hVar = this.s0;
        if (hVar.q != 2 || hVar.o >= 1.0f) {
            postDelayed(new a1.e(17, this, gVar), 40L);
        } else {
            hVar.m = gVar;
            invalidate();
        }
    }

    public final float k1(int i7) {
        if (i7 != this.V7) {
            return 1.0f;
        }
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        if (this.X7 < this.W7) {
            float l10 = 1.0f - Utilities.l((currentAnimationTimeMillis - r6) / 110.0f);
            return 1.0f - ((1.0f - (l10 * l10)) * 0.08f);
        }
        double h12 = h1((currentAnimationTimeMillis - r4) / 1000.0f, 0.6d, 0.28d);
        if (currentAnimationTimeMillis - this.X7 > 900) {
            this.V7 = -1;
            return 1.0f;
        }
        float f10 = this.Y7;
        return ((1.0f - f10) * ((float) h12)) + f10;
    }

    public final float l() {
        return org.telegram.messenger.g0.T1(1.07f, 1.0f, this.C2) * getWidth() * 0.745f;
    }

    public final void l0() {
        if (this.U8 == null) {
            this.u1 = 0L;
            return;
        }
        this.u1 = 0L;
        if (this.N8) {
            this.N8 = false;
            this.M8 = AnimationUtils.currentAnimationTimeMillis();
        }
        this.V8 = true;
        invalidate();
    }

    public final float m() {
        float max = ((1.0f - Math.max(this.J2, this.C2)) * org.telegram.messenger.g0.L(16.0f)) + (((getHeight() * 0.468f) - (l() / 2.0f)) - org.telegram.messenger.g0.L(15.0f));
        return org.telegram.messenger.g0.T1(max, Math.max(org.telegram.messenger.g0.L(51.0f) + this.t3, Math.min(max, (((a1() - b1()) - org.telegram.messenger.g0.L(13.0f)) - (org.telegram.messenger.g0.L(35.0f) * Math.max(this.J2, this.C2))) - l())), this.f1);
    }

    public final k1 m1(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        Long valueOf = Long.valueOf(tL_starGiftUnique.id);
        HashMap hashMap = this.K7;
        k1 k1Var = (k1) hashMap.get(valueOf);
        if (k1Var == null) {
            k1Var = new k1();
            ArrayList<TL_stars.StarGiftAttribute> arrayList = tL_starGiftUnique.attributes;
            int size = arrayList.size();
            TLRPC.Document document = null;
            int i7 = 0;
            while (i7 < size) {
                TL_stars.StarGiftAttribute starGiftAttribute = arrayList.get(i7);
                i7++;
                TL_stars.StarGiftAttribute starGiftAttribute2 = starGiftAttribute;
                if (starGiftAttribute2 instanceof TL_stars.starGiftAttributePattern) {
                    document = ((TL_stars.starGiftAttributePattern) starGiftAttribute2).document;
                }
            }
            if (document != null) {
                g5 g5Var = new g5(org.telegram.messenger.g0.L(28.0f), this);
                k1Var.a = g5Var;
                g5Var.i(document, false);
                k1Var.a.a();
                k1Var.b = document.id;
            }
            hashMap.put(Long.valueOf(tL_starGiftUnique.id), k1Var);
        }
        return k1Var;
    }

    public final boolean n() {
        String str;
        return (this.W8 != R.drawable.msg_retry || (str = this.U8) == null || s0(str)) ? false : true;
    }

    public final boolean n0(float f10, float f11) {
        if (this.p1 == null || !this.N8) {
            return false;
        }
        RectF rectF = this.L8;
        if (rectF.isEmpty()) {
            return false;
        }
        float f12 = rectF.right;
        float L = org.telegram.messenger.g0.L(15.0f);
        TextPaint textPaint = this.y2;
        textPaint.setTextSize(L);
        float measureText = (f12 - textPaint.measureText(this.p1)) - org.telegram.messenger.g0.L(28.0f);
        float L2 = rectF.top - org.telegram.messenger.g0.L(6.0f);
        float L3 = rectF.right + org.telegram.messenger.g0.L(6.0f);
        float L4 = rectF.bottom + org.telegram.messenger.g0.L(6.0f);
        RectF rectF2 = this.q1;
        rectF2.set(measureText, L2, L3, L4);
        return rectF2.contains(f10, f11);
    }

    public final PorterDuffColorFilter n1(int i7) {
        SparseArray sparseArray = this.e7;
        PorterDuffColorFilter porterDuffColorFilter = (PorterDuffColorFilter) sparseArray.get(i7);
        if (porterDuffColorFilter != null) {
            return porterDuffColorFilter;
        }
        if (sparseArray.size() > 96) {
            sparseArray.clear();
        }
        PorterDuffColorFilter porterDuffColorFilter2 = new PorterDuffColorFilter(i7, PorterDuff.Mode.SRC_IN);
        sparseArray.put(i7, porterDuffColorFilter2);
        return porterDuffColorFilter2;
    }

    public final float o() {
        return l() + m() + org.telegram.messenger.g0.L(24.0f);
    }

    public final void o0(Canvas canvas, Drawable drawable, float f10, float f11, float f12, float f13) {
        drawable.setColorFilter(n1(-1));
        drawable.setAlpha((int) (f13 * 255.0f));
        float f14 = f12 / 2.0f;
        drawable.setBounds((int) (f10 - f14), (int) (f11 - f14), (int) (f10 + f14), (int) (f11 + f14));
        drawable.draw(canvas);
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        K0();
        int i7 = this.y6;
        SparseIntArray sparseIntArray = this.x6;
        if (i7 != 1) {
            sparseIntArray.clear();
            this.y6 = 1;
        }
        int i10 = 0;
        while (true) {
            int[] iArr = a.b;
            if (i10 >= iArr.length) {
                break;
            }
            j1 j1Var = new j1();
            int i11 = iArr[i10] | (-16777216);
            j1Var.b = i11;
            j1Var.c = (-16777216) | a.c[i10];
            j1Var.h = Z0(i11);
            if (sparseIntArray.indexOfKey(j1Var.b) < 0) {
                sparseIntArray.put(j1Var.b, u(j1Var));
            }
            i10++;
        }
        qs.f(this.b).c(this.j2, qs.G3);
        y0();
        SensorManager sensorManager = (SensorManager) getContext().getSystemService("sensor");
        this.N6 = sensorManager;
        Sensor defaultSensor = sensorManager != null ? sensorManager.getDefaultSensor(9) : null;
        if (defaultSensor != null) {
            this.N6.registerListener(this.O6, defaultSensor, 1);
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        qs.f(this.b).n(this.j2, qs.G3);
        removeCallbacks(this.k2);
        SensorManager sensorManager = this.N6;
        if (sensorManager != null) {
            sensorManager.unregisterListener(this.O6);
        }
        this.L6 = false;
        this.r9 = -1;
        Arrays.fill(this.x9, 0L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0954  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0a52  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0a6a  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0abc  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x0bd6  */
    /* JADX WARN: Removed duplicated region for block: B:304:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:307:0x0ab3  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x095b  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x09ae  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x0a02  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x0a22  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x09b5  */
    /* JADX WARN: Type inference failed for: r29v0 */
    /* JADX WARN: Type inference failed for: r29v1 */
    /* JADX WARN: Type inference failed for: r29v2 */
    /* JADX WARN: Type inference failed for: r3v65, types: [android.graphics.RectF, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v70, types: [android.graphics.RectF] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDraw(Canvas canvas) {
        float f10;
        float f11;
        long j3;
        float f12;
        float f13;
        boolean z9;
        int i7;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        float f20;
        float f21;
        float f22;
        float f23;
        int i10;
        int i11;
        float f24;
        float f25;
        float T1;
        float f26;
        float T12;
        l1 l1Var;
        float sin;
        float f27;
        boolean z10;
        int i12;
        long j10;
        RectF rectF;
        float f28;
        float h12;
        l1 l1Var2 = this;
        l1Var2.H2 = true;
        float f29 = l1Var2.B2 ? 1.0f : 0.0f;
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        float f30 = l1Var2.E2;
        if (f29 != f30) {
            if (f29 == 1.0f && f30 == 0.0f && l1Var2.C2 <= 0.001f) {
                l1Var2.n5 = true;
                l1Var2.m5 = null;
            } else if (f29 == 0.0f && l1Var2.C2 >= 0.999f) {
                l1Var2.n5 = false;
            }
            l1Var2.E2 = f29;
            l1Var2.D2 = l1Var2.C2;
            l1Var2.F2 = currentAnimationTimeMillis;
        }
        if (l1Var2.C2 != f29) {
            f10 = 0.0f;
            float l10 = Utilities.l((currentAnimationTimeMillis - l1Var2.F2) / 300.0f);
            float D = l10 < 0.5f ? com.google.android.recaptcha.internal.a.D(l10, 4.0f, l10, l10) : 1.0f - (((float) Math.pow((l10 * (-2.0f)) + 2.0f, 3.0d)) / 2.0f);
            if (l10 < 1.0f) {
                f29 = org.telegram.messenger.g0.T1(l1Var2.D2, f29, D);
            }
            l1Var2.C2 = f29;
            if (f29 <= 0.0f) {
                l1Var2.n5 = false;
            }
            l1Var2.invalidate();
        } else {
            f10 = 0.0f;
        }
        float f31 = l1Var2.K0 ? 1.0f : f10;
        long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
        float f32 = l1Var2.L2;
        if (f32 < f10) {
            l1Var2.L2 = f31;
            l1Var2.J2 = f31;
        } else {
            if (f31 != f32) {
                l1Var2.L2 = f31;
                l1Var2.K2 = l1Var2.J2;
                l1Var2.M2 = currentAnimationTimeMillis2;
            }
            if (l1Var2.J2 != f31) {
                float l11 = Utilities.l((currentAnimationTimeMillis2 - l1Var2.M2) / 320.0f);
                float D2 = l11 < 0.5f ? com.google.android.recaptcha.internal.a.D(l11, 4.0f, l11, l11) : 1.0f - (((float) Math.pow((l11 * (-2.0f)) + 2.0f, 3.0d)) / 2.0f);
                if (l11 < 1.0f) {
                    f31 = org.telegram.messenger.g0.T1(l1Var2.K2, f31, D2);
                }
                l1Var2.J2 = f31;
                l1Var2.invalidate();
            }
        }
        l1Var2.V2 = !l1Var2.S4 && l1Var2.U2 == 0 && !l1Var2.T2 && l1Var2.Z1;
        long currentTimeMillis = System.currentTimeMillis();
        int width = l1Var2.getWidth();
        int height = l1Var2.getHeight();
        float min = l1Var2.W2 == 0 ? 1.0f : Math.min(3.0f, (currentTimeMillis - r4) / 16.667f);
        l1Var2.W2 = currentTimeMillis;
        l1Var2.X2 = min;
        float f33 = l1Var2.s;
        cb.c cVar = l1Var2.c;
        if (f33 < 1.0f) {
            f11 = 4.0f;
            j3 = currentTimeMillis;
            float min2 = Math.min(1.0f, (j3 - l1Var2.w) / 600.0f);
            l1Var2.s = min2;
            if (f33 < 0.3f && min2 >= 0.3f && cVar != null) {
                l1Var2.n.getClass();
                ((s0) cVar.b).b0();
            }
            if (l1Var2.s >= 1.0f) {
                l1Var2.r = null;
            }
        } else {
            f11 = 4.0f;
            j3 = currentTimeMillis;
        }
        long currentAnimationTimeMillis3 = AnimationUtils.currentAnimationTimeMillis();
        OverScroller overScroller = l1Var2.k9;
        if (!overScroller.isFinished() && overScroller.computeScrollOffset()) {
            l1Var2.j1 = Math.max(f10, Math.min(l1Var2.z0(), overScroller.getCurrY()));
        }
        float f34 = l1Var2.g1;
        if (f34 != l1Var2.x7) {
            if (f34 < 0.5f) {
                l1Var2.d6 = currentAnimationTimeMillis3;
            } else if (l1Var2.f1 < 0.35f) {
                l1Var2.e6 = false;
            }
            if (f34 > 0.5f) {
                l1Var2.I2 = currentAnimationTimeMillis3;
            }
            l1Var2.x7 = f34;
            l1Var2.w7 = l1Var2.f1;
            l1Var2.v7 = currentAnimationTimeMillis3;
        }
        float f35 = f11;
        float f36 = (currentAnimationTimeMillis3 - l1Var2.v7) / 1000.0f;
        xq xqVar = R9;
        if (f34 > 0.5f) {
            float T13 = org.telegram.messenger.g0.T1(l1Var2.w7, 1.0f, xqVar.getInterpolation(Utilities.l(f36 / 0.42f)));
            l1Var2.f1 = T13;
            l1Var2.y7 = Utilities.l(Utilities.l(T13) / 0.8f);
            f12 = 1000.0f;
            f13 = 0.5f;
            z9 = 0;
        } else {
            f12 = 1000.0f;
            f13 = 0.5f;
            z9 = 0;
            l1Var2.y7 = Math.min(l1Var2.y7, (float) Math.pow(1.0f - Utilities.l(f36 / 0.17f), 1.7000000476837158d));
            l1Var2.f1 = org.telegram.messenger.g0.T1(l1Var2.w7, 0.0f, xqVar.getInterpolation(Utilities.l(f36 / 0.36f)));
        }
        l1Var2.N7 = l1Var2.f(l1Var2.N7, l1Var2.O7, 0.25f);
        j1 j1Var = l1Var2.n;
        if (j1Var != null && j1Var.a == 0) {
            i7 = z9;
            while (i7 < a.b.length) {
                if (e1(i7) == l1Var2.n.f) {
                    break;
                } else {
                    i7++;
                }
            }
        }
        i7 = -100;
        int i13 = l1Var2.u8;
        if (i7 != i13) {
            float f37 = i7 == l1Var2.v8 ? l1Var2.x8 : 0.0f;
            l1Var2.v8 = i13;
            l1Var2.x8 = l1Var2.w8;
            l1Var2.u8 = i7;
            l1Var2.w8 = f37;
        }
        l1Var2.w8 = l1Var2.f(l1Var2.w8, 1.0f, 0.2f);
        l1Var2.x8 = l1Var2.f(l1Var2.x8, 0.0f, 0.2f);
        long currentAnimationTimeMillis4 = AnimationUtils.currentAnimationTimeMillis();
        float f38 = l1Var2.l1;
        if (f38 != l1Var2.C8) {
            l1Var2.C8 = f38;
            l1Var2.B8 = Math.max(l1Var2.E8, l1Var2.F8);
            l1Var2.z8 = currentAnimationTimeMillis4;
        }
        float f39 = (currentAnimationTimeMillis4 - l1Var2.z8) / f12;
        if (l1Var2.l1 > f13) {
            float f40 = l1Var2.B8;
            if (f39 > 0.7f) {
                f14 = f35;
                h12 = 1.0f;
                f15 = 1.0f;
            } else {
                f14 = f35;
                f15 = 1.0f;
                h12 = ((1.0f - f40) * ((float) h1(f39, 0.78d, 0.3d))) + f40;
            }
            l1Var2.E8 = h12;
            l1Var2.F8 = f39 > 0.7f ? f15 : ((f15 - f40) * ((float) h1(f39 - 0.02d, 0.8d, 0.34d))) + f40;
        } else {
            f14 = f35;
            f15 = 1.0f;
            float l12 = Utilities.l(f39 / 0.2f);
            float l13 = Utilities.l(f39 / 0.17f);
            float f41 = l1Var2.B8;
            l1Var2.E8 = (1.0f - ((3.0f - (l13 * 2.0f)) * (l13 * l13))) * f41;
            l1Var2.F8 = (1.0f - ((3.0f - (l12 * 2.0f)) * (l12 * l12))) * f41;
        }
        float max = Math.max(0.004f, l1Var2.X2 * 0.016667f);
        float f42 = l1Var2.F8;
        l1Var2.G8 = (f42 - l1Var2.H8) / max;
        l1Var2.H8 = f42;
        float max2 = Math.max(0.0f, Math.max(l1Var2.E8, f42));
        l1Var2.k1 = max2;
        if (l1Var2.D8 > 0.001f && max2 <= 0.001f) {
            l1Var2.A8 = currentAnimationTimeMillis4;
        }
        l1Var2.D8 = max2;
        l1Var2.i1 = l1Var2.f(l1Var2.i1, l1Var2.h1, 0.25f);
        boolean z11 = (l1Var2.m1 == null || j3 >= l1Var2.u1) ? z9 : true;
        l1Var2.t1 = l1Var2.f(l1Var2.t1, z11 ? f15 : 0.0f, z11 ? 0.2f : l1Var2.l1 > f13 ? 0.4f : 0.16f);
        float T14 = org.telegram.messenger.g0.T1(l1Var2.C0, l1Var2.D0, f15 - ((float) Math.pow(f15 - Math.min(f15, (j3 - l1Var2.E0) / (l1Var2.D0 > l1Var2.C0 ? 340L : 380L)), 3.0d)));
        l1Var2.B0 = T14;
        boolean z12 = l1Var2.v0;
        if (z12 && T14 >= 0.999f) {
            l1Var2.F0 = true;
        }
        if (z12) {
            if (l1Var2.w0) {
                f28 = Utilities.l((l1Var2.A0 ? 60000L : Math.max(0L, l1Var2.z0 - j3)) / 60000.0f);
            } else {
                f28 = 1.0f;
            }
            l1Var2.G0 = f28;
            if (l1Var2.w0 && !l1Var2.A0 && j3 >= l1Var2.z0) {
                l1Var2.U0(hd.M0(2131746479, null));
            }
        }
        l1Var2.u1(true);
        long nanoTime = System.nanoTime();
        float min3 = l1Var2.M6 == 0 ? 0.016f : Math.min(0.1f, (nanoTime - r8) / 1.0E9f);
        l1Var2.M6 = nanoTime;
        if (l1Var2.L6) {
            float exp = 1.0f - ((float) Math.exp((-min3) / f14));
            float f43 = l1Var2.J6;
            float f44 = l1Var2.H6;
            float z13 = com.google.android.recaptcha.internal.a.z(f44, f43, exp, f43);
            l1Var2.J6 = z13;
            float f45 = l1Var2.K6;
            l1Var2.K6 = com.google.android.recaptcha.internal.a.z(l1Var2.I6, f45, exp, f45);
            f16 = 1.0f;
            f17 = Math.max(-1.0f, Math.min(1.0f, (-(f44 - z13)) / 4.9f));
            f18 = Math.max(-1.0f, Math.min(1.0f, (l1Var2.I6 - l1Var2.K6) / 4.9f));
        } else {
            f16 = 1.0f;
            f17 = 0.0f;
            f18 = 0.0f;
        }
        float exp2 = f16 - ((float) Math.exp((-min3) / 0.08f));
        float f46 = l1Var2.F6;
        l1Var2.F6 = com.google.android.recaptcha.internal.a.z(f17, f46, exp2, f46);
        float f47 = l1Var2.G6;
        l1Var2.G6 = com.google.android.recaptcha.internal.a.z(f18, f47, exp2, f47);
        float[] fArr = o1.b;
        float f48 = fArr[z9];
        l1Var2.D6 = Math.round(r4 / r6) * (f48 > 0.0f ? f13 / f48 : 1.0f);
        float round = Math.round(l1Var2.G6 * 40.0f) / 40.0f;
        l1Var2.E6 = round;
        n1.i = l1Var2.D6 * fArr[z9];
        n1.j = (round * fArr[1]) / 100.0f;
        float f49 = l1Var2.b6;
        i1 i1Var = l1Var2.F;
        l1Var2.b6 = l1Var2.f(f49, (i1Var == null || i1Var.a == 0) ? 0.0f : 1.0f, 0.12f);
        if (a0.f()) {
            canvas.isHardwareAccelerated();
        }
        if (i() && ((l1Var2.S4 || l1Var2.Z1) && canvas.isHardwareAccelerated())) {
            if (l1Var2.G1 == null) {
                l1Var2.G1 = android.support.v4.media.session.w.d("qrBg");
                RenderNode d = android.support.v4.media.session.w.d("qrBlur");
                l1Var2.H1 = d;
                float N = org.telegram.messenger.g0.N(17.6f) / 9.0f;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                a0.j(d, N);
            }
            l1Var2.z(a0.a(width, height, l1Var2.G1), width, height);
            a0.d(l1Var2.G1);
            if (l1Var2.I1 != 1) {
                l1Var2.I1 = 1;
                Object obj = l1Var2.H1;
                float max3 = Math.max(f13, org.telegram.messenger.g0.N(fArr[2]) / 9.0f);
                Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                a0.j(obj, max3);
            }
            Canvas a10 = a0.a((width + 8) / 9, (height + 8) / 9, l1Var2.H1);
            a10.scale(0.11111111f, 0.11111111f);
            a0.c(a10, l1Var2.G1);
            a0.d(l1Var2.H1);
            a0.c(canvas, l1Var2.G1);
        } else {
            l1Var2.z(canvas, width, height);
        }
        l1Var2.A(canvas, width);
        l1Var2.R4 = l1Var2.Q4 < 1.0f ? Utilities.l(l1Var2.U4) : 1.0f;
        float currentActionBarHeight = l1Var2.t3 + (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2.0f);
        RectF rectF2 = l1Var2.g7;
        rectF2.set(org.telegram.messenger.g0.L(29.0f) - org.telegram.messenger.g0.L(20.0f), currentActionBarHeight - org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(20.0f) + org.telegram.messenger.g0.L(29.0f), org.telegram.messenger.g0.L(20.0f) + currentActionBarHeight);
        float T = l1Var2.T(l1Var2.R4);
        canvas.save();
        canvas.scale(T, T, rectF2.centerX(), rectF2.centerY());
        l1Var2.J(canvas, rectF2, org.telegram.messenger.g0.L(20.0f), 1.0f);
        l1Var2.M(canvas, 3, rectF2, z9);
        y1 y1Var = l1Var2.W1;
        y1Var.a(-1);
        canvas.save();
        canvas.translate(rectF2.centerX() - (org.telegram.messenger.g0.L(24.0f) / 2.0f), currentActionBarHeight - (org.telegram.messenger.g0.L(24.0f) / 2.0f));
        y1Var.draw(canvas);
        canvas.restore();
        canvas.restore();
        if (l1Var2.l7) {
            f19 = 0.08f;
            f20 = 40.0f;
            f21 = 20.0f;
            f22 = 14.0f;
            f23 = 10.0f;
            i10 = width;
            i11 = height;
        } else {
            float L = org.telegram.messenger.g0.L(14.0f);
            f23 = 10.0f;
            Paint paint = l1Var2.U1;
            paint.setTextSize(L);
            float L2 = org.telegram.messenger.g0.L(6.0f) + org.telegram.messenger.g0.L(20.0f) + org.telegram.messenger.g0.L(12.0f);
            f19 = 0.08f;
            String str = l1Var2.V1;
            f20 = 40.0f;
            f21 = 20.0f;
            f22 = 14.0f;
            RectF rectF3 = l1Var2.j7;
            rectF3.set((l1Var2.getWidth() - org.telegram.messenger.g0.L(9.0f)) - ((paint.measureText(str) + L2) + org.telegram.messenger.g0.L(14.0f)), currentActionBarHeight - org.telegram.messenger.g0.L(20.0f), l1Var2.getWidth() - org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(20.0f) + currentActionBarHeight);
            canvas.save();
            canvas.scale(T, T, rectF3.centerX(), rectF3.centerY());
            l1Var2.J(canvas, rectF3, org.telegram.messenger.g0.L(20.0f), 1.0f);
            l1Var2.M(canvas, 5, rectF3, false);
            i11 = height;
            i10 = width;
            l1Var2.o0(canvas, l1Var2.N1, rectF3.left + org.telegram.messenger.g0.L(12.0f) + org.telegram.messenger.g0.L(10.0f), currentActionBarHeight, org.telegram.messenger.g0.L(20.0f), 1.0f);
            paint.setColor(-1);
            Paint.FontMetrics fontMetrics = paint.getFontMetrics();
            canvas.drawText(str, rectF3.left + org.telegram.messenger.g0.L(12.0f) + org.telegram.messenger.g0.L(20.0f) + org.telegram.messenger.g0.L(6.0f), currentActionBarHeight - ((fontMetrics.ascent + fontMetrics.descent) / 2.0f), paint);
            canvas.restore();
        }
        float l14 = 1.0f - Utilities.l(l1Var2.f1 * 2.2f);
        long currentAnimationTimeMillis5 = AnimationUtils.currentAnimationTimeMillis();
        boolean z14 = l1Var2.l1 > 0.5f;
        if (z14 != l1Var2.m7) {
            l1Var2.m7 = z14;
            l1Var2.o7 = l1Var2.n7;
            l1Var2.p7 = currentAnimationTimeMillis5;
        }
        float l15 = Utilities.l((currentAnimationTimeMillis5 - l1Var2.p7) / 220.0f);
        if (z14) {
            f24 = 220.0f;
            T1 = org.telegram.messenger.g0.T1(l1Var2.o7, 0.0f, l15 * l15);
            f25 = 1.0f;
        } else {
            f24 = 220.0f;
            f25 = 1.0f;
            T1 = org.telegram.messenger.g0.T1(l1Var2.o7, 1.0f, Math.min(1.0f, S(l15, 0.6f)));
        }
        l1Var2.n7 = T1;
        if (l15 < f25) {
            l1Var2.invalidate();
        }
        float l16 = Utilities.l(Utilities.l(l1Var2.n7) * 2.0f);
        float T15 = org.telegram.messenger.g0.T1(0.6f, f25, l1Var2.n7);
        boolean z15 = z14 || (l1Var2.v0 && l1Var2.w0);
        if (z15 != l1Var2.q7) {
            l1Var2.q7 = z15;
            l1Var2.s7 = l1Var2.r7;
            l1Var2.t7 = currentAnimationTimeMillis5;
        }
        int i14 = i10;
        float l17 = Utilities.l((currentAnimationTimeMillis5 - l1Var2.t7) / f24);
        if (z15) {
            T12 = org.telegram.messenger.g0.T1(l1Var2.s7, 0.0f, l17 * l17);
            f26 = 1.0f;
        } else {
            f26 = 1.0f;
            T12 = org.telegram.messenger.g0.T1(l1Var2.s7, 1.0f, Math.min(1.0f, S(l17, 0.6f)));
        }
        l1Var2.r7 = T12;
        if (l17 < f26) {
            l1Var2.invalidate();
        }
        float T16 = org.telegram.messenger.g0.T1(0.6f, f26, l1Var2.r7);
        float min4 = Math.min(l14, Utilities.l(Utilities.l(l1Var2.r7) * 2.0f));
        boolean z16 = l1Var2.f1 <= 0.001f;
        if (min4 > 0.0f || l14 > 0.0f || z16) {
            float height2 = (l1Var2.getHeight() - l1Var2.u3) - org.telegram.messenger.g0.L(f20);
            int width2 = l1Var2.getWidth();
            int L3 = org.telegram.messenger.g0.L(f21);
            float L4 = org.telegram.messenger.g0.L(42.0f) - L3;
            float f50 = L3;
            float f51 = height2 - f50;
            float L5 = org.telegram.messenger.g0.L(42.0f) + L3;
            float f52 = f50 + height2;
            boolean z17 = z16;
            RectF rectF4 = l1Var2.h7;
            rectF4.set(L4, f51, L5, f52);
            float z18 = k5.z(42.0f, width2, L3);
            float D3 = org.telegram.messenger.camera.q.D(42.0f, width2, L3);
            RectF rectF5 = l1Var2.i7;
            rectF5.set(z18, f51, D3, f52);
            float f53 = width2 / 2.0f;
            RectF rectF6 = l1Var2.k7;
            rectF6.set(f53 - org.telegram.messenger.g0.L(72.0f), height2 - org.telegram.messenger.g0.L(f21), f53 + org.telegram.messenger.g0.L(72.0f), org.telegram.messenger.g0.L(f21) + height2);
            float T2 = l1Var2.T(l1Var2.R4) * org.telegram.messenger.g0.T1(0.6f, 1.0f, l14);
            if (min4 > 0.0f) {
                canvas.save();
                float f54 = T2 * T16;
                canvas.scale(f54, f54, rectF4.centerX(), height2);
                l1Var2.J(canvas, rectF4, org.telegram.messenger.g0.L(f21), min4);
                l1Var2.M(canvas, 4, rectF4, false);
                l1Var2.o0(canvas, l1Var2.L1, rectF4.centerX(), height2, org.telegram.messenger.g0.L(22.0f), min4);
                canvas.restore();
                canvas.save();
                float f55 = T2 * T15;
                canvas.scale(f55, f55, rectF5.centerX(), height2);
                l1Var2.J(canvas, rectF5, org.telegram.messenger.g0.L(f21), min4);
                l1Var2.M(canvas, 11, rectF5, false);
                l1Var2.o0(canvas, l1Var2.M1, rectF5.centerX(), height2, org.telegram.messenger.g0.L(24.0f), min4);
                canvas.restore();
            }
            if (z17 && l16 > 0.0f && l1Var2.a) {
                float T3 = l1Var2.T(l1Var2.R4) * T15;
                canvas.save();
                canvas.scale(T3, T3, rectF6.centerX(), rectF6.centerY());
                l1Var2.J(canvas, rectF6, org.telegram.messenger.g0.L(f21), l16);
                float width3 = rectF6.width() / 3.0f;
                canvas.save();
                Path path = l1Var2.E1;
                path.rewind();
                path.addRoundRect(rectF6, org.telegram.messenger.g0.L(f21), org.telegram.messenger.g0.L(f21), Path.Direction.CW);
                canvas.clipPath(path);
                int i15 = 0;
                while (i15 < 3) {
                    float f56 = rectF6.left;
                    float f57 = (i15 * width3) + f56;
                    float f58 = rectF6.top;
                    int i16 = i15 + 1;
                    float f59 = (i16 * width3) + f56;
                    float f60 = rectF6.bottom;
                    RectF rectF7 = l1Var2.c7;
                    rectF7.set(f57, f58, f59, f60);
                    l1Var2.M(canvas, i15 + 6, rectF7, false);
                    i15 = i16;
                }
                canvas.restore();
                int i17 = 0;
                while (i17 < 3) {
                    float f61 = l16;
                    l1Var2.o0(canvas, l1Var2.f7[i17], org.telegram.messenger.camera.q.b(i17, 0.5f, width3, rectF6.left), height2, org.telegram.messenger.g0.L(i17 == 1 ? 24.5f : 22.0f), f61);
                    i17++;
                    l16 = f61;
                    l1Var2 = l1Var2;
                }
                l1Var = l1Var2;
                canvas.restore();
                if (l1Var.k1 <= 0.001f) {
                    K(canvas);
                    i12 = i14;
                } else {
                    if (l1Var.A8 != 0) {
                        float currentAnimationTimeMillis6 = (AnimationUtils.currentAnimationTimeMillis() - l1Var.A8) / f12;
                        if (currentAnimationTimeMillis6 <= 0.45f) {
                            sin = ((float) Math.sin((currentAnimationTimeMillis6 * 6.283185307179586d) / 0.17000000178813934d)) * ((float) Math.exp((-currentAnimationTimeMillis6) / 0.11f)) * 0.07f;
                            float T4 = l1Var.T(l1Var.Q4 >= 1.0f ? Utilities.l(l1Var.U4) : 1.0f) * j(l1Var.m2, 0.06f, 0.02f);
                            if (l1Var.q2 > 0 || l1Var.v0) {
                                f27 = 1.0f;
                            } else {
                                float currentAnimationTimeMillis7 = (AnimationUtils.currentAnimationTimeMillis() - l1Var.q2) / 180.0f;
                                f27 = 1.0f;
                                if (currentAnimationTimeMillis7 < 1.0f) {
                                    T4 *= (((float) Math.sin(currentAnimationTimeMillis7 * 3.141592653589793d)) * 0.04f) + 1.0f;
                                    l1Var.invalidate();
                                }
                            }
                            z10 = sin == 0.0f || T4 != f27;
                            if (z10) {
                                canvas.save();
                                float f62 = ((sin * 0.5f) + f27) * T4;
                                float f63 = (f27 - sin) * T4;
                                RectF rectF8 = l1Var.J5;
                                canvas.scale(f62, f63, rectF8.centerX(), rectF8.centerY());
                            }
                            i12 = i14;
                            l1Var.B(canvas, i12);
                            if (z10) {
                                canvas.restore();
                            }
                        }
                    }
                    sin = 0.0f;
                    float T42 = l1Var.T(l1Var.Q4 >= 1.0f ? Utilities.l(l1Var.U4) : 1.0f) * j(l1Var.m2, 0.06f, 0.02f);
                    if (l1Var.q2 > 0) {
                    }
                    f27 = 1.0f;
                    if (sin == 0.0f) {
                    }
                    if (z10) {
                    }
                    i12 = i14;
                    l1Var.B(canvas, i12);
                    if (z10) {
                    }
                }
                l1Var.N(canvas, i12, i11);
                long currentAnimationTimeMillis8 = AnimationUtils.currentAnimationTimeMillis();
                if (l1Var.e9 == 0 && l1Var.N8 && l1Var.U8 != null && l1Var.g1 == 0.0f && l1Var.f1 > 0.001f) {
                    rectF = l1Var.L8;
                    if (!rectF.isEmpty()) {
                        l1Var.e9 = currentAnimationTimeMillis8;
                        l1Var.f9 = rectF.centerY();
                        l1Var.m1 = null;
                        j10 = 0;
                        l1Var.u1 = 0L;
                        if (l1Var.e9 != j10) {
                            float f64 = (currentAnimationTimeMillis8 - r7) / 140.0f;
                            if (f64 >= 1.0f || l1Var.U8 == null) {
                                l1Var.e9 = 0L;
                                l1Var.N8 = false;
                                l1Var.U8 = null;
                            } else {
                                l1Var.invalidate();
                                float f65 = i12;
                                canvas.saveLayerAlpha(0.0f, 0.0f, f65, i11, (int) ((1.0f - f64) * 255.0f));
                                float f66 = 1.0f - (f64 * f19);
                                canvas.scale(f66, f66, f65 / 2.0f, l1Var.f9);
                                l1Var.g9 = true;
                                l1Var.R(canvas, i12, j3);
                                l1Var.g9 = false;
                                canvas.restore();
                            }
                        } else {
                            l1Var.R(canvas, i12, j3);
                        }
                        if (cVar != null) {
                            s0 s0Var = (s0) cVar.b;
                            boolean z19 = l1Var.f1 > 0.01f && l1Var.y7 > 0.004f && l1Var.h1 == 1;
                            float L6 = ((1.0f - l1Var.y7) * org.telegram.messenger.g0.L(f22)) + (l1Var.a1() - l1Var.b1()) + org.telegram.messenger.g0.L(8.0f);
                            float f67 = l1Var.y7;
                            ?? r32 = l1Var.I7;
                            ?? r52 = l1Var.z7;
                            boolean z20 = z19 && !r52.equals(r32);
                            j1 j1Var2 = l1Var.n;
                            int i18 = j1Var2 != null ? j1Var2.b : 0;
                            boolean z21 = z19 && i18 != l1Var.H7;
                            if (z19 != l1Var.G7 || z20 || z21 || (z19 && (Math.abs(L6 - l1Var.E7) > 0.5f || Math.abs(f67 - l1Var.F7) > 0.01f))) {
                                l1Var.H7 = i18;
                                r32.set(r52);
                                l1Var.G7 = z19;
                                l1Var.E7 = L6;
                                l1Var.F7 = f67;
                                s0Var.g0(L6, f67, z19);
                                org.telegram.messenger.g0.L(f23);
                                l1Var.getWidth();
                                org.telegram.messenger.g0.L(f23);
                                l1Var.a1();
                                float f68 = ((RectF) r52).left;
                                float f69 = ((RectF) r52).top;
                                float f70 = ((RectF) r52).right;
                                float f71 = ((RectF) r52).bottom;
                                float min5 = Math.min(r52.height() / 2.0f, org.telegram.messenger.g0.W1(Utilities.l(l1Var.f1), org.telegram.messenger.g0.L(f21), org.telegram.messenger.g0.L(28.17f)));
                                s0Var.n = f68;
                                s0Var.r = f69;
                                s0Var.s = f70;
                                s0Var.w = f71;
                                s0Var.x = min5;
                                if (s0Var.h != null) {
                                    float min6 = Math.min(r1.getHeight(), s0Var.w - (s0Var.h.getTranslationY() + s0Var.h.getTop()));
                                    d dVar = s0Var.y;
                                    if (dVar != null) {
                                        dVar.G = min6;
                                    }
                                    s0Var.K = min6;
                                    if (dVar != null) {
                                        dVar.U = s0Var.s - dVar.getLeft();
                                    }
                                    r rVar = s0Var.Z;
                                    if (rVar != null) {
                                        rVar.invalidate();
                                    }
                                    s0Var.h.invalidateOutline();
                                }
                                d dVar2 = s0Var.y;
                                if (dVar2 != null) {
                                    dVar2.invalidateOutline();
                                }
                            }
                        }
                        l1Var.invalidate();
                        l1Var.V2 = false;
                        if (l1Var.S4) {
                            return;
                        }
                        l1Var.U2++;
                        return;
                    }
                }
                j10 = 0;
                if (l1Var.e9 != j10) {
                }
                if (cVar != null) {
                }
                l1Var.invalidate();
                l1Var.V2 = false;
                if (l1Var.S4) {
                }
            }
        }
        l1Var = l1Var2;
        if (l1Var.k1 <= 0.001f) {
        }
        l1Var.N(canvas, i12, i11);
        long currentAnimationTimeMillis82 = AnimationUtils.currentAnimationTimeMillis();
        if (l1Var.e9 == 0) {
            rectF = l1Var.L8;
            if (!rectF.isEmpty()) {
            }
        }
        j10 = 0;
        if (l1Var.e9 != j10) {
        }
        if (cVar != null) {
        }
        l1Var.invalidate();
        l1Var.V2 = false;
        if (l1Var.S4) {
        }
    }

    @Override // android.view.View
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        int top;
        super.onLayout(z9, i7, i10, i11, i12);
        int i13 = org.telegram.messenger.g0.m;
        View view = this;
        int i14 = 0;
        while (true) {
            top = view.getTop() + i14;
            if (!(view.getParent() instanceof View)) {
                break;
            }
            view = (View) view.getParent();
            i14 = top - view.getScrollY();
        }
        this.t3 = Math.max(Math.max(0, i13 - top), (org.telegram.messenger.g0.L(20.0f) + org.telegram.messenger.g0.L(9.0f)) - (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2));
        int height = getRootView().getHeight();
        View view2 = this;
        int i15 = 0;
        while (true) {
            int top2 = view2.getTop() + i15;
            if (!(view2.getParent() instanceof View)) {
                this.u3 = jg.g.e(20.0f, org.telegram.messenger.g0.L(22.0f), Math.max(0, org.telegram.messenger.g0.n - (height - (getHeight() + top2))));
                return;
            }
            view2 = (View) view2.getParent();
            i15 = top2 - view2.getScrollY();
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        if (i7 > 0 && i10 > 0) {
            float L = org.telegram.messenger.g0.L(12.0f);
            int ceil = ((int) Math.ceil(i7 / L)) + 1;
            int ceil2 = ((int) Math.ceil(i10 / L)) + 1;
            Bitmap bitmap = this.z3;
            if (bitmap == null || bitmap.getWidth() != ceil || this.z3.getHeight() != ceil2) {
                this.z3 = Bitmap.createBitmap(ceil, ceil2, Bitmap.Config.ARGB_8888);
                this.A3 = new int[ceil * ceil2];
            }
        }
        super.onSizeChanged(i7, i10, i11, i12);
    }

    /* JADX WARN: Removed duplicated region for block: B:380:0x07ca  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x07fa  */
    /* JADX WARN: Removed duplicated region for block: B:394:0x0810  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x08b4  */
    /* JADX WARN: Removed duplicated region for block: B:415:0x0832  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z9;
        float f10;
        int i7;
        int width;
        boolean z10;
        float f11;
        j1 j1Var;
        boolean z11;
        y0 y0Var;
        VelocityTracker velocityTracker;
        RippleDrawable rippleDrawable;
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        if (motionEvent.getActionMasked() == 0) {
            this.r1 = n0(x10, y10);
        }
        boolean z12 = this.r1;
        cb.c cVar = this.c;
        if (z12) {
            if (motionEvent.getActionMasked() == 1) {
                this.r1 = false;
                if (n0(x10, y10)) {
                    this.u1 = 0L;
                    invalidate();
                    if (cVar != null) {
                        ((s0) cVar.b).presentFragment(new PremiumPreviewFragment(0, "qr_emoji"));
                        return true;
                    }
                }
            } else if (motionEvent.getActionMasked() == 3) {
                this.r1 = false;
                return true;
            }
            return true;
        }
        int actionMasked = motionEvent.getActionMasked();
        ArrayList arrayList = this.v1;
        RectF rectF = this.Z7;
        RectF rectF2 = this.i7;
        RectF rectF3 = this.h7;
        RectF rectF4 = this.J5;
        RectF rectF5 = this.g7;
        RectF[] rectFArr = this.y8;
        RectF rectF6 = this.j7;
        RectF rectF7 = this.k7;
        OverScroller overScroller = this.k9;
        d1 d1Var = this.p9;
        RectF rectF8 = this.u7;
        if (actionMasked != 0) {
            ViewConfiguration viewConfiguration = this.l9;
            if (actionMasked == 1) {
                removeCallbacks(d1Var);
                Q0();
                S0();
                if (this.R) {
                    this.R = false;
                    if (this.S) {
                        this.k0.addMovement(motionEvent);
                        this.k0.computeCurrentVelocity(1000);
                        float xVelocity = this.k0.getXVelocity();
                        float yVelocity = this.k0.getYVelocity();
                        float hypot = (float) Math.hypot(xVelocity, yVelocity);
                        float L = org.telegram.messenger.g0.L(1.0f) * 2600.0f;
                        if (hypot > L) {
                            float f12 = L / hypot;
                            xVelocity *= f12;
                            yVelocity *= f12;
                        }
                        this.a0 = this.N;
                        this.b0 = this.O;
                        this.c0 = xVelocity;
                        this.d0 = yVelocity;
                        this.V = AnimationUtils.currentAnimationTimeMillis();
                        this.T = true;
                        R0();
                        return true;
                    }
                    R0();
                }
                if (this.o9 && (velocityTracker = this.m9) != null) {
                    velocityTracker.addMovement(motionEvent);
                    this.m9.computeCurrentVelocity(1000, viewConfiguration.getScaledMaximumFlingVelocity());
                    float yVelocity2 = this.m9.getYVelocity();
                    int z02 = (int) z0();
                    if (Math.abs(yVelocity2) > viewConfiguration.getScaledMinimumFlingVelocity() && z02 > 0) {
                        overScroller.fling(0, Math.round(this.j1), 0, Math.round(-yVelocity2), 0, 0, 0, z02);
                        invalidate();
                    }
                }
                if (!this.o9 && !this.n9 && Math.hypot(x10 - this.h9, y10 - this.i9) < org.telegram.messenger.g0.L(10.0f)) {
                    if (this.l7 || !m0(rectF6, x10, y10)) {
                        if (this.k1 <= 0.5f) {
                            if (m0(rectF5, x10, y10)) {
                                if (this.f1 > 0.5f) {
                                    this.g1 = 0.0f;
                                    return true;
                                }
                                if (cVar != null) {
                                    ((s0) cVar.b).finishFragment();
                                    return true;
                                }
                            } else if (!this.K0 || !m0(rectF4, x10, y10)) {
                                if (this.f1 > 0.5f) {
                                    if (y10 < rectF8.top) {
                                        z10 = true;
                                        f11 = 0.0f;
                                    } else if (y10 > rectF8.bottom) {
                                        f11 = 0.0f;
                                        z10 = true;
                                    } else if (this.h1 == 1) {
                                        int i10 = 0;
                                        while (true) {
                                            ArrayList arrayList2 = this.I;
                                            if (i10 >= arrayList2.size()) {
                                                break;
                                            }
                                            if (this.D7[i10].contains(x10, y10)) {
                                                arrayList2.remove(i10);
                                                c();
                                                i0();
                                                return true;
                                            }
                                            i10++;
                                        }
                                    } else {
                                        getWidth();
                                        float L2 = (this.j1 + y10) - (org.telegram.messenger.g0.L(4.0f) + rectF8.top);
                                        if (L2 >= 0.0f) {
                                            float L3 = x10 - (rectF8.left + org.telegram.messenger.g0.L(4.0f));
                                            float width2 = rectF8.width() - org.telegram.messenger.g0.L(8.0f);
                                            if (L3 >= 0.0f && L3 < width2) {
                                                int i11 = this.h1;
                                                if (i11 == 2) {
                                                    if (!h0()) {
                                                        float f13 = width2 / 3.0f;
                                                        float f02 = width2 / f0();
                                                        if (L2 >= 0.0f) {
                                                            int f03 = (f0() * ((int) ((L2 - 0.0f) / f13))) + ((int) (L3 / f02));
                                                            if (f03 >= 0 && f03 < arrayList.size()) {
                                                                long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                                                                this.S7 = currentAnimationTimeMillis;
                                                                i1 i1Var = this.F;
                                                                if (i1Var.a == 2 && i1Var.q == f03) {
                                                                    this.T7 = currentAnimationTimeMillis;
                                                                    this.Q7 = -1;
                                                                    this.O7 = 0.0f;
                                                                    setSceneFromCard(t(this.M7));
                                                                    setPattern(W());
                                                                    B0();
                                                                    return true;
                                                                }
                                                                int i12 = this.L7;
                                                                if (i12 >= 0 && i12 != f03 && this.O7 > 0.5f) {
                                                                    this.Q7 = i12;
                                                                    this.T7 = currentAnimationTimeMillis;
                                                                }
                                                                this.L7 = f03;
                                                                this.N7 = 0.0f;
                                                                this.O7 = 1.0f;
                                                                I0(getWidth() / 2.0f, (l() / 2.0f) + m(), f03);
                                                                B0();
                                                                return true;
                                                            }
                                                        }
                                                    } else if (rectF.contains(x10, y10)) {
                                                        i0();
                                                        if (cVar != null) {
                                                            s0.a0((s0) cVar.b);
                                                            return true;
                                                        }
                                                    }
                                                } else if (i11 == 0) {
                                                    float f14 = width2 / 6.0f;
                                                    int i13 = (((int) (L2 / f14)) * 6) + ((int) (L3 / f14));
                                                    if (i13 >= 0 && i13 < a.b.length) {
                                                        int e12 = e1(i13);
                                                        int i14 = G9;
                                                        if (e12 != i14 || (j1Var = this.n) == null || j1Var.a != 0 || j1Var.f != i14 || this.F.a != 0) {
                                                            int e13 = e1(i13);
                                                            this.M7 = e13;
                                                            boolean z13 = this.F.a == 2;
                                                            if (z13) {
                                                                this.T7 = AnimationUtils.currentAnimationTimeMillis();
                                                                this.Q7 = -1;
                                                                this.O7 = 0.0f;
                                                            }
                                                            setSceneFromCard(t(e13));
                                                            if (z13) {
                                                                setPattern(W());
                                                            }
                                                            B0();
                                                            return true;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    this.g1 = f11;
                                    return z10;
                                }
                                if (this.a && m0(rectF7, x10, y10)) {
                                    int max = Math.max(0, Math.min(2, (int) ((x10 - rectF7.left) / (rectF7.width() / 3.0f))));
                                    if (this.l1 <= 0.0f && this.k1 <= 0.05f) {
                                        F0(max);
                                        return true;
                                    }
                                    this.l1 = 0.0f;
                                    i0();
                                    postDelayed(new z0(this, max, 2), 200L);
                                    return true;
                                }
                                if (this.q7 || !m0(rectF3, x10, y10)) {
                                    if (!this.q7 && m0(rectF2, x10, y10) && cVar != null) {
                                        ((s0) cVar.b).h0();
                                        return true;
                                    }
                                } else if (cVar != null) {
                                    ((s0) cVar.b).i0(getCurrentLink());
                                    return true;
                                }
                            } else if (this.K0) {
                                if (this.v0) {
                                    this.x0 = this.w0;
                                    this.l1 = 1.0f;
                                    l0();
                                    i0();
                                    return true;
                                }
                                this.v0 = true;
                                this.q2 = 0L;
                                this.w0 = true;
                                this.A0 = true;
                                this.z0 = System.currentTimeMillis() + 60000;
                                this.C0 = this.B0;
                                this.D0 = 1.0f;
                                this.E0 = System.currentTimeMillis();
                                this.F0 = false;
                                this.d1 = true;
                                this.m2 = AnimationUtils.currentAnimationTimeMillis();
                                this.o2 = System.currentTimeMillis() + 340;
                                this.e = null;
                                this.u0 = null;
                                this.z2 = null;
                                u1(false);
                                d1(R.drawable.msg_recent, a0(), null);
                                i0();
                                if (cVar != null) {
                                    cVar.w(1);
                                    return true;
                                }
                            }
                            return true;
                        }
                        int i15 = 0;
                        while (true) {
                            if (i15 >= 3) {
                                this.l1 = 0.0f;
                                if (rectF7.contains(x10, y10)) {
                                    int max2 = Math.max(0, Math.min(2, (int) ((x10 - rectF7.left) / (rectF7.width() / 3.0f))));
                                    i0();
                                    postDelayed(new z0(this, max2, 1), 200L);
                                    return true;
                                }
                            } else if (rectFArr[i15].contains(x10, y10)) {
                                this.l1 = 0.0f;
                                if (i15 == 0) {
                                    if (this.w0) {
                                        this.A0 = true;
                                        this.z0 = System.currentTimeMillis() + 60000;
                                    }
                                    this.A2 = -1;
                                    if (cVar == null || (y0Var = ((s0) cVar.b).e) == null) {
                                        z11 = true;
                                    } else {
                                        z11 = true;
                                        y0Var.n(true, y0Var.d == 1);
                                    }
                                    u1(z11);
                                    if (this.w0) {
                                        d1(R.drawable.msg_recent, a0(), null);
                                    } else {
                                        d1(R.drawable.msg_retry, hd.M0(2131746476, null), null);
                                    }
                                    i0();
                                    return true;
                                }
                                if (i15 != 1) {
                                    U0(hd.M0(2131746477, null));
                                    return true;
                                }
                                boolean z14 = this.w0;
                                this.w0 = !z14;
                                if (z14) {
                                    this.A0 = false;
                                } else {
                                    this.A0 = true;
                                    this.z0 = System.currentTimeMillis() + 60000;
                                }
                                this.A2 = -1;
                                u1(true);
                                d1(R.drawable.msg_recent, this.w0 ? a0() : hd.M0(2131746475, null), null);
                                if (cVar != null) {
                                    cVar.w(this.w0 ? 1 : 2);
                                    return true;
                                }
                            } else {
                                i15++;
                            }
                        }
                    } else {
                        if (this.f1 > 0.001f) {
                            this.g1 = 0.0f;
                            invalidate();
                            return true;
                        }
                        if (cVar != null) {
                            s0 s0Var = (s0) cVar.b;
                            if (s0Var.getParentActivity() != null) {
                                if (s0Var.getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                                    s0Var.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 34);
                                    return true;
                                }
                                s0Var.f0();
                                return true;
                            }
                        }
                    }
                }
            } else if (actionMasked != 2) {
                if (actionMasked != 3) {
                    return super.onTouchEvent(motionEvent);
                }
                removeCallbacks(d1Var);
                Q0();
                S0();
                if (this.R) {
                    this.R = false;
                    R0();
                    return true;
                }
            } else if (this.R) {
                this.k0.addMovement(motionEvent);
                float f15 = x10 - this.h9;
                float f16 = y10 - this.i9;
                if (!this.S && Math.hypot(f15, f16) > org.telegram.messenger.g0.L(8.0f)) {
                    this.S = true;
                }
                if (this.S) {
                    this.N = this.P + f15;
                    this.O = this.Q + f16;
                    this.e0 = (getWidth() * 0.32f * ((float) Math.tanh((f15 / Math.max(1.0f, r4)) * 2.5f))) + this.g0;
                    this.f0 = (0.32f * getHeight() * ((float) Math.tanh((f16 / Math.max(1.0f, r2)) * 2.5f))) + this.h0;
                    return true;
                }
            } else {
                int i16 = this.r9;
                if (i16 >= 0 && (rippleDrawable = this.q9[i16]) != null) {
                    rippleDrawable.setHotspot(x10, y10);
                }
                if (this.r9 >= 0 && Math.hypot(x10 - this.h9, y10 - this.i9) > org.telegram.messenger.g0.L(10.0f)) {
                    Q0();
                }
                if (Math.hypot(x10 - this.h9, y10 - this.i9) > org.telegram.messenger.g0.L(10.0f)) {
                    S0();
                }
                VelocityTracker velocityTracker2 = this.m9;
                if (velocityTracker2 != null) {
                    velocityTracker2.addMovement(motionEvent);
                }
                if (!this.o9 && this.f1 > 0.5f) {
                    float f17 = this.i9;
                    if (f17 > rectF8.top && Math.abs(y10 - f17) > viewConfiguration.getScaledTouchSlop()) {
                        this.o9 = true;
                        removeCallbacks(d1Var);
                        this.i9 = y10;
                        this.j9 = this.j1;
                    }
                }
                if (this.o9) {
                    this.j1 = Math.max(0.0f, Math.min(z0(), this.j9 - (y10 - this.i9)));
                    return true;
                }
            }
        } else {
            boolean isFinished = overScroller.isFinished();
            this.n9 = !isFinished;
            if (!isFinished) {
                overScroller.forceFinished(true);
                invalidate();
            }
            this.h9 = x10;
            this.i9 = y10;
            this.j9 = this.j1;
            this.o9 = false;
            VelocityTracker velocityTracker3 = this.m9;
            if (velocityTracker3 == null) {
                this.m9 = VelocityTracker.obtain();
            } else {
                velocityTracker3.clear();
            }
            this.m9.addMovement(motionEvent);
            if (this.f1 < 0.5f && this.k1 < 0.5f) {
                float width3 = getWidth() * 0.745f;
                float width4 = (getWidth() - width3) / 2.0f;
                float m10 = m();
                if ((x10 <= width4 || x10 >= width4 + width3 || y10 <= m10 || y10 >= l() + m10) && ((!this.K0 || !m0(rectF4, x10, y10)) && !m0(rectF5, x10, y10) && ((this.q7 || (!m0(rectF3, x10, y10) && !m0(rectF2, x10, y10))) && !m0(rectF6, x10, y10) && !m0(rectF7, x10, y10)))) {
                    z9 = true;
                    this.R = z9;
                    if (this.f1 > 0.5f && this.h1 == 2) {
                        int f04 = f0();
                        float L4 = x10 - (rectF8.left + org.telegram.messenger.g0.L(4.0f));
                        float L5 = ((this.j1 + y10) - (org.telegram.messenger.g0.L(4.0f) + rectF8.top)) - 0.0f;
                        width = (L4 >= 0.0f || L5 < 0.0f || h0()) ? -1 : ((int) (L4 / ((rectF8.width() - org.telegram.messenger.g0.L(8.0f)) / f04))) + (((int) (L5 / ((rectF8.width() - org.telegram.messenger.g0.L(8.0f)) / 3.0f))) * f04);
                        if (width >= 0 && width < arrayList.size()) {
                            this.P7 = width;
                            this.R7 = AnimationUtils.currentAnimationTimeMillis();
                        }
                    }
                    if (this.f1 > 0.5f || this.h1 != 0 || y10 <= rectF8.top) {
                        f10 = 0.0f;
                    } else {
                        float L6 = x10 - (rectF8.left + org.telegram.messenger.g0.L(4.0f));
                        float L7 = (this.j1 + y10) - (org.telegram.messenger.g0.L(4.0f) + rectF8.top);
                        float width5 = (rectF8.width() - org.telegram.messenger.g0.L(8.0f)) / 6.0f;
                        f10 = 0.0f;
                        int i17 = (L6 < 0.0f || L7 < 0.0f || L6 >= 6.0f * width5) ? -1 : ((int) (L6 / width5)) + (((int) (L7 / width5)) * 6);
                        if (i17 >= 0 && i17 < a.b.length) {
                            this.V7 = i17;
                            this.W7 = AnimationUtils.currentAnimationTimeMillis();
                            invalidate();
                        }
                    }
                    this.S = false;
                    if (this.R) {
                        this.T = false;
                        this.U = false;
                        this.P = this.N;
                        this.Q = this.O;
                        this.g0 = this.e0;
                        this.h0 = this.f0;
                        VelocityTracker velocityTracker4 = this.k0;
                        if (velocityTracker4 == null) {
                            this.k0 = VelocityTracker.obtain();
                        } else {
                            velocityTracker4.clear();
                        }
                        this.k0.addMovement(motionEvent);
                    }
                    removeCallbacks(d1Var);
                    if (this.k1 > 0.5f) {
                        for (int i18 = 0; i18 < 3; i18++) {
                            rectFArr[i18].contains(x10, y10);
                        }
                    }
                    Q0();
                    if (this.k1 <= 0.5f) {
                        if (this.l7 || !m0(rectF6, x10, y10)) {
                            for (int i19 = 0; i19 < 3; i19++) {
                                if (rectFArr[i19].contains(x10, y10)) {
                                    i7 = i19;
                                    break;
                                }
                            }
                            i7 = -1;
                            if (i7 >= 0) {
                                long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                                long[] jArr = this.x9;
                                this.z9[i7] = jArr[i7] != 0 ? this.y9[i7] * ((float) Math.exp((-(currentAnimationTimeMillis2 - r6)) / 180.0f)) : f10;
                                jArr[i7] = 0;
                                this.u9[i7] = x10;
                                this.v9[i7] = y10;
                                this.w9[i7] = currentAnimationTimeMillis2;
                                this.r9 = i7;
                                invalidate();
                                return true;
                            }
                        }
                        i7 = 5;
                        if (i7 >= 0) {
                        }
                    } else {
                        if (m0(rectF5, x10, y10)) {
                            i7 = 3;
                        } else {
                            if (this.l7 || !m0(rectF6, x10, y10)) {
                                if (this.K0 && m0(rectF4, x10, y10)) {
                                    i7 = 9;
                                } else {
                                    if (this.f1 < 0.5f) {
                                        if (!this.q7 && m0(rectF3, x10, y10)) {
                                            i7 = 4;
                                        } else if (!this.q7 && m0(rectF2, x10, y10)) {
                                            i7 = 11;
                                        } else if (this.a && m0(rectF7, x10, y10)) {
                                            i7 = Math.max(0, Math.min(2, (int) ((x10 - rectF7.left) / (rectF7.width() / 3.0f)))) + 6;
                                        }
                                    }
                                    if (this.f1 > 0.5f && this.h1 == 2 && h0() && m0(rectF, x10, y10)) {
                                        i7 = 10;
                                    }
                                    i7 = -1;
                                }
                            }
                            i7 = 5;
                        }
                        if (i7 >= 0) {
                        }
                    }
                }
            }
            z9 = false;
            this.R = z9;
            if (this.f1 > 0.5f) {
                int f042 = f0();
                float L42 = x10 - (rectF8.left + org.telegram.messenger.g0.L(4.0f));
                float L52 = ((this.j1 + y10) - (org.telegram.messenger.g0.L(4.0f) + rectF8.top)) - 0.0f;
                if (L42 >= 0.0f) {
                }
                if (width >= 0) {
                    this.P7 = width;
                    this.R7 = AnimationUtils.currentAnimationTimeMillis();
                }
            }
            if (this.f1 > 0.5f) {
            }
            f10 = 0.0f;
            this.S = false;
            if (this.R) {
            }
            removeCallbacks(d1Var);
            if (this.k1 > 0.5f) {
            }
            Q0();
            if (this.k1 <= 0.5f) {
            }
        }
        return true;
    }

    public final void p(float f10, float f11, float f12) {
        float L;
        float nextFloat;
        float f13;
        float d;
        int i7 = this.c1;
        if (i7 >= 320) {
            return;
        }
        this.c1 = i7 + 1;
        Random random = this.e1;
        float nextFloat2 = random.nextFloat();
        int i10 = nextFloat2 < 0.65f ? 0 : nextFloat2 < 0.9f ? 1 : 2;
        byte[] bArr = this.a1;
        bArr[i7] = (byte) i10;
        this.b1[i7] = false;
        this.M0[i7] = ((random.nextFloat() - 0.5f) * org.telegram.messenger.g0.L(4.0f)) + f10;
        this.N0[i7] = f11;
        byte b10 = bArr[i7];
        if (b10 == 0) {
            L = org.telegram.messenger.g0.L(1.4f);
            nextFloat = random.nextFloat();
            f13 = 1.6f;
        } else {
            if (b10 == 1) {
                d = org.telegram.ui.Cells.f1.d(0.7f, random.nextFloat(), org.telegram.messenger.g0.N(0.7f));
                this.S0[i7] = d;
                this.O0[i7] = (random.nextFloat() * org.telegram.messenger.g0.L(80.0f)) + (-org.telegram.messenger.g0.L(30.0f));
                this.P0[i7] = (-org.telegram.messenger.g0.L(50.0f)) - (random.nextFloat() * org.telegram.messenger.g0.L(100.0f));
                this.Q0[i7] = Math.max(0.05f, Math.min((random.nextFloat() * 0.2f) + 0.3f, f12));
                this.R0[i7] = 0.0f;
                this.T0[i7] = random.nextFloat() * 90.0f;
                this.U0[i7] = (random.nextFloat() - 0.5f) * 1080.0f;
            }
            L = org.telegram.messenger.g0.L(3.0f);
            nextFloat = random.nextFloat();
            f13 = 1.5f;
        }
        d = (nextFloat * org.telegram.messenger.g0.L(f13)) + L;
        this.S0[i7] = d;
        this.O0[i7] = (random.nextFloat() * org.telegram.messenger.g0.L(80.0f)) + (-org.telegram.messenger.g0.L(30.0f));
        this.P0[i7] = (-org.telegram.messenger.g0.L(50.0f)) - (random.nextFloat() * org.telegram.messenger.g0.L(100.0f));
        this.Q0[i7] = Math.max(0.05f, Math.min((random.nextFloat() * 0.2f) + 0.3f, f12));
        this.R0[i7] = 0.0f;
        this.T0[i7] = random.nextFloat() * 90.0f;
        this.U0[i7] = (random.nextFloat() - 0.5f) * 1080.0f;
    }

    public final zg0 p1() {
        if (this.Z8 == null) {
            zg0 zg0Var = new zg0(R.raw.contact_check, org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(28.0f));
            this.Z8 = zg0Var;
            zg0Var.setColorFilter(new ColorMatrixColorFilter(new float[]{0.0f, 0.0f, 0.0f, 0.0f, 255.0f, 0.0f, 0.0f, 0.0f, 0.0f, 255.0f, 0.0f, 0.0f, 0.0f, 0.0f, 255.0f, 0.2126f, 0.7152f, 0.0722f, 1.0f, -255.0f}));
            this.Z8.K(0);
            this.Z8.R(this);
            this.Z8.J(true);
        }
        return this.Z8;
    }

    public final void q(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, boolean z9, boolean z10) {
        int i7 = this.c1;
        if (i7 >= 320) {
            return;
        }
        this.c1 = i7 + 1;
        this.a1[i7] = z9 ? (byte) 1 : (byte) 0;
        this.b1[i7] = true;
        this.M0[i7] = f10;
        this.N0[i7] = f11;
        this.O0[i7] = f12;
        this.P0[i7] = f13;
        this.V0[i7] = f10;
        this.W0[i7] = f11;
        this.X0[i7] = f14;
        Random random = this.e1;
        this.Y0[i7] = z10 ? (random.nextFloat() * 3.0f) + 4.0f : 0.0f;
        this.Z0[i7] = random.nextFloat() * 6.2832f;
        this.S0[i7] = f15;
        this.Q0[i7] = f16;
        this.R0[i7] = 0.0f;
        this.T0[i7] = f17;
        this.U0[i7] = 0.0f;
    }

    public final zg0 q1() {
        if (this.a9 == null) {
            zg0 zg0Var = new zg0(R.raw.ic_save_to_gallery, org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(28.0f));
            this.a9 = zg0Var;
            zg0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            this.a9.K(0);
            this.a9.R(this);
            this.a9.J(true);
        }
        return this.a9;
    }

    public final zg0 r1() {
        if (this.Y8 == null) {
            zg0 zg0Var = new zg0(R.raw.star_premium_2, org.telegram.messenger.g0.L(27.0f), org.telegram.messenger.g0.L(27.0f));
            this.Y8 = zg0Var;
            zg0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            this.Y8.K(0);
            this.Y8.R(this);
            this.Y8.J(true);
        }
        return this.Y8;
    }

    public final boolean s0(String str) {
        return str != null && str.equals(this.u2);
    }

    public final float s1(String str) {
        int indexOf = str.indexOf(10);
        TextPaint textPaint = this.C1;
        if (indexOf >= 0) {
            return Math.max(textPaint.measureText(str, 0, indexOf), textPaint.measureText(str, indexOf + 1, str.length()));
        }
        if (!s0(str)) {
            return textPaint.measureText(str);
        }
        float textSize = textPaint.getTextSize();
        TextPaint textPaint2 = this.y2;
        textPaint2.setTextSize(textSize);
        return textPaint.measureText(this.x2) + textPaint2.measureText(this.w2) + textPaint.measureText(this.v2);
    }

    public void setFeeStars(long j3) {
        this.K0 = j3 > 0;
        String a02 = j3 > 0 ? hd.a0(null, null, 2131746480, hd.E(j3, ',')) : "";
        int indexOf = a02.indexOf(9733);
        this.I0 = indexOf >= 0 ? a02.substring(0, indexOf) : "";
        if (indexOf >= 0) {
            a02 = a02.substring(indexOf + 1);
        }
        this.J0 = a02;
        if (!this.K0 && this.v0) {
            U0(null);
        }
        invalidate();
    }

    public void setFreeLink(String str) {
        if (TextUtils.equals(this.e, str)) {
            return;
        }
        this.e = str;
        if (str == null) {
            this.u0 = null;
        } else {
            Utilities.e.c(new a1.e(18, str, new b1(this, str, 1)));
        }
    }

    public void setGiftsOwner(long j3) {
        if (this.w1 == j3) {
            return;
        }
        this.w1 = j3;
        v9 v9Var = this.i2;
        if (v9Var != null) {
            v9Var.f();
        }
        v9 v9Var2 = new v9(this.b, j3, false);
        this.i2 = v9Var2;
        v9Var2.g = 776;
        v9Var2.e = true;
        v9Var2.j(true);
        y0();
    }

    public void setImmediateOnOpen(boolean z9) {
        this.Z1 = z9;
    }

    public void setInstantTheme(boolean z9) {
        this.f2 = z9;
    }

    public void setLinkExpires(long j3) {
        long j10 = this.G2;
        if (j10 == j3) {
            return;
        }
        if (j10 != 0 && j3 != 0) {
            i0();
        }
        this.G2 = j3;
        this.N2 = -1L;
        invalidate();
    }

    public void setOnPicksChanged(Runnable runnable) {
        this.d2 = runnable;
    }

    public void setReveal(float f10) {
        float f11;
        float sin;
        this.Q4 = f10;
        if (this.T4) {
            double d = f10 * 0.86d;
            double sqrt = Math.sqrt(0.18999999999999995d) * 10.134169850289656d;
            if (f10 >= 1.0f) {
                sin = 1.0f;
            } else {
                double d2 = sqrt * d;
                sin = (float) (1.0d - (((Math.sin(d2) * (0.9d / Math.sqrt(0.18999999999999995d))) + Math.cos(d2)) * Math.exp((-9.120752865260691d) * d)));
            }
            float l10 = Utilities.l((f10 - 0.85f) / 0.15f);
            f11 = com.google.android.recaptcha.internal.a.z(1.0f, sin, com.google.android.recaptcha.internal.a.C(l10, 2.0f, 3.0f, l10 * l10), sin);
        } else {
            float f12 = 1.0f - f10;
            f11 = 1.0f - (f12 * f12);
        }
        this.U4 = f11;
        boolean z9 = f10 < 1.0f;
        if (!z9) {
            this.S4 = true;
        }
        setTranslationY(z9 ? Math.round((1.0f - f11) * org.telegram.messenger.g0.L(64.0f)) : 0.0f);
        setAlpha(z9 ? Utilities.l(f11 / 0.35f) : 1.0f);
        if (getParent() instanceof View) {
            ((View) getParent()).setBackgroundColor(z9 ? a(f11, TLObject.FLAG_30) : 0);
        }
        float f13 = -1.0f;
        if (!z9) {
            this.p3 = -1.0f;
        }
        if (z9 && this.T4) {
            f13 = Utilities.l(f11);
        }
        this.s0.D = f13;
        int i7 = z9 ? 2 : 0;
        if (getLayerType() != i7) {
            setLayerType(i7, null);
        }
        invalidate();
    }

    public void setRevealOpening(boolean z9) {
        this.T4 = z9;
    }

    public void setScanHidden(boolean z9) {
        if (this.l7 != z9) {
            this.l7 = z9;
            invalidate();
        }
    }

    public void setTemporaryLink(boolean z9) {
        if (this.B2 == z9) {
            return;
        }
        this.B2 = z9;
        if (!this.H2) {
            float f10 = z9 ? 1.0f : 0.0f;
            this.E2 = f10;
            this.C2 = f10;
        }
        invalidate();
    }

    public void setThemeEditable(boolean z9) {
        if (this.a != z9) {
            this.a = z9;
            invalidate();
        }
    }

    public void setTimerOnly(boolean z9) {
        this.y0 = z9;
    }

    public final int t0() {
        int i7 = this.y6;
        SparseIntArray sparseIntArray = this.x6;
        if (i7 != 1) {
            sparseIntArray.clear();
            this.y6 = 1;
        }
        j1 j1Var = this.n;
        int i10 = j1Var != null ? j1Var.b : 0;
        int indexOfKey = sparseIntArray.indexOfKey(i10);
        if (indexOfKey >= 0) {
            return sparseIntArray.valueAt(indexOfKey);
        }
        int u10 = u(this.n);
        sparseIntArray.put(i10, u10);
        return u10;
    }

    public final void u1(boolean z9) {
        String sb2;
        if (this.v0) {
            if (this.w0) {
                int ceil = (int) Math.ceil((this.A0 ? 60000L : Math.max(0L, this.z0 - System.currentTimeMillis())) / 1000.0d);
                if (ceil == this.A2 && this.z2 != null) {
                    return;
                }
                this.A2 = ceil;
                StringBuilder sb3 = new StringBuilder();
                org.telegram.messenger.camera.q.q(null, 2131746489, sb3, " · ");
                sb3.append(hd.a0(null, null, 2131746490, String.format(Locale.US, "%d:%02d", Integer.valueOf(ceil / 60), Integer.valueOf(ceil % 60))));
                sb2 = sb3.toString();
            } else {
                StringBuilder sb4 = new StringBuilder();
                org.telegram.messenger.camera.q.q(null, 2131746489, sb4, " · ");
                sb2 = jg.g.l(2131746482, null, sb4);
                this.A2 = -1;
            }
            if (sb2.equals(this.z2)) {
                return;
            }
            this.z2 = sb2;
            this.L0.t(sb2, z9, true);
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        zg0 zg0Var;
        return (drawable instanceof RippleDrawable) || drawable == this.L0 || drawable == this.X1 || ((zg0Var = this.l8) != null && drawable == zg0Var) || super.verifyDrawable(drawable);
    }

    public final Drawable w(int i7) {
        return getContext().getResources().getDrawable(i7).mutate();
    }

    public final float x1(float f10, float f11, int i7, int i10) {
        float f12 = this.x;
        double max = Math.max(f12, i7 - f12);
        float f13 = this.y;
        return (((1.0f - ((float) Math.pow(1.0f - Utilities.l(((float) Math.hypot(f10 - this.x, f11 - this.y)) / (((float) Math.hypot(max, Math.max(f13, i10 - f13))) + org.telegram.messenger.g0.L(60.0f))), 0.4166666567325592d))) * 600.0f) / 1000.0f) - 0.03f;
    }

    public final void y(Canvas canvas, Bitmap bitmap) {
        float f10 = this.f3;
        float f11 = (-f10) / 2.0f;
        float width = (bitmap.getWidth() - 0.5f) * f10;
        float height = (bitmap.getHeight() - 0.5f) * f10;
        RectF rectF = this.e3;
        rectF.set(f11, f11, width, height);
        canvas.drawBitmap(bitmap, (Rect) null, rectF, this.b3);
    }

    public final void y0() {
        int i7;
        v9 v9Var = this.i2;
        if (v9Var == null) {
            return;
        }
        i1 i1Var = this.F;
        int i10 = i1Var.a;
        ArrayList arrayList = this.v1;
        long j3 = (i10 != 2 || (i7 = i1Var.q) < 0 || i7 >= arrayList.size()) ? 0L : ((TL_stars.TL_starGiftUnique) arrayList.get(this.F.q)).id;
        TL_stars.TL_starGiftUnique tL_starGiftUnique = j3 != 0 ? (TL_stars.TL_starGiftUnique) arrayList.get(this.F.q) : null;
        arrayList.clear();
        HashMap hashMap = this.y1;
        hashMap.clear();
        ArrayList arrayList2 = v9Var.l;
        int size = arrayList2.size();
        int i11 = 0;
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList2.get(i12);
            i12++;
            TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
            TL_stars.StarGift starGift = savedStarGift.gift;
            if ((starGift instanceof TL_stars.TL_starGiftUnique) && !savedStarGift.refunded) {
                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) starGift;
                if (!tL_starGiftUnique2.burned) {
                    arrayList.add(tL_starGiftUnique2);
                    hashMap.put(Long.valueOf(savedStarGift.gift.id), Long.valueOf(savedStarGift.saved_id));
                }
            }
        }
        if (tL_starGiftUnique != null) {
            int i13 = 0;
            while (true) {
                if (i13 >= arrayList.size()) {
                    i13 = -1;
                    break;
                } else if (((TL_stars.TL_starGiftUnique) arrayList.get(i13)).id == j3) {
                    break;
                } else {
                    i13++;
                }
            }
            if (i13 < 0) {
                arrayList.add(0, tL_starGiftUnique);
            } else {
                i11 = i13;
            }
            this.F.q = i11;
            this.L7 = i11;
        }
        boolean z9 = v9Var.j;
        this.x1 = z9;
        if (!z9 && !v9Var.i) {
            v9Var.a();
        }
        if (!arrayList.isEmpty() && !this.l2) {
            this.l2 = true;
            d1 d1Var = this.k2;
            removeCallbacks(d1Var);
            postDelayed(d1Var, 900L);
        }
        invalidate();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0516  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0548  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x05a1  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x05e9 A[EDGE_INSN: B:158:0x05e9->B:159:0x05e9 BREAK  A[LOOP:3: B:148:0x058c->B:155:0x05b5], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:161:0x05ed  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0608  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x061f  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x063c  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0680  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0698  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x07a7  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x081f  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x08ec  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x092c  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x094c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0957  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0a48  */
    /* JADX WARN: Removed duplicated region for block: B:274:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0975  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0a10  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x0a2b  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0a37  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x0a39  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0970  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x0683  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0395  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void z(Canvas canvas, int i7, int i10) {
        Canvas canvas2;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        boolean z9;
        float f20;
        float min;
        long j3;
        float f21;
        float f22;
        float f23;
        float[] fArr;
        float f24;
        float f25;
        float f26;
        float f27;
        float f28;
        float f29;
        float f30;
        float[] fArr2;
        float f31;
        boolean z10;
        i1 i1Var;
        boolean z11;
        boolean z12;
        int i11;
        int i12;
        boolean z13;
        float f32;
        int ceil;
        int ceil2;
        Bitmap bitmap;
        int i13;
        boolean z14;
        float f33;
        float f34;
        int i14;
        int i15;
        int i16;
        boolean z15;
        float[] fArr3;
        int[] iArr;
        float[] fArr4;
        float[] fArr5;
        boolean z16 = (this.s >= 1.0f || this.r == null || this.n == null) ? false : true;
        if (this.n == null || i7 <= 0 || i10 <= 0) {
            canvas2 = canvas;
            f10 = 0.2f;
            f11 = 1.0f;
            f12 = 3.0f;
            f13 = 0.0f;
            f14 = 0.6f;
            f15 = 2.0f;
            f16 = 0.45f;
            canvas2.drawColor(-16777216);
        } else {
            float max = Math.max(i7, i10) / 160.0f;
            float f35 = i7;
            f14 = 0.6f;
            int ceil3 = ((int) Math.ceil(f35 / max)) + 1;
            float f36 = i10;
            int ceil4 = ((int) Math.ceil(f36 / max)) + 1;
            Bitmap bitmap2 = this.Y2;
            Paint paint = this.c3;
            if (bitmap2 != null && bitmap2.getWidth() == ceil3 && this.Y2.getHeight() == ceil4) {
                f15 = 2.0f;
            } else {
                Bitmap.Config config = Bitmap.Config.ARGB_8888;
                f15 = 2.0f;
                this.Y2 = Bitmap.createBitmap(ceil3, ceil4, config);
                this.Z2 = Bitmap.createBitmap(ceil3, ceil4, config);
                Bitmap bitmap3 = this.Y2;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap3, tileMode, tileMode);
                this.a3 = bitmapShader;
                paint.setShader(bitmapShader);
                this.g3 = false;
            }
            this.f3 = max;
            M0(0, z16 ? this.r : this.n, i7, i10);
            this.h3 = false;
            int[] iArr2 = this.l3;
            float[] fArr6 = this.n3;
            if (z16) {
                M0(1, this.n, i7, i10);
                float y12 = y1(this.s);
                float f37 = this.x;
                i15 = 1;
                double max2 = Math.max(f37, f35 - f37);
                i14 = 0;
                float f38 = this.y;
                float hypot = (((float) Math.hypot(max2, Math.max(f38, f36 - f38))) + org.telegram.messenger.g0.L(60.0f)) * y12;
                fArr6[0] = this.x;
                fArr6[1] = this.y;
                fArr6[2] = hypot;
                boolean z17 = hypot > ((float) org.telegram.messenger.g0.L(4.0f));
                this.h3 = z17;
                if (z17) {
                    float W1 = org.telegram.messenger.g0.W1(y12, org.telegram.messenger.g0.L(90.0f), org.telegram.messenger.g0.L(56.0f));
                    float l10 = Utilities.l((1.0f - this.s) * 1.6f) * 0.38f;
                    float max3 = Math.max(0.0f, hypot - W1) / hypot;
                    float L = org.telegram.messenger.g0.L(8.0f) + hypot;
                    fArr6[3] = max3 * hypot;
                    fArr6[4] = org.telegram.messenger.g0.T1(max3, 1.0f, 0.45f) * hypot;
                    fArr6[5] = org.telegram.messenger.g0.T1(max3, 1.0f, 0.82f) * hypot;
                    fArr6[6] = hypot - (0.004f * L);
                    fArr6[7] = hypot + org.telegram.messenger.g0.L(3.0f);
                    fArr6[8] = L;
                    fArr6[9] = 0.0f;
                    fArr6[10] = l10 * 0.2f;
                    fArr6[11] = l10 * 0.6f;
                    fArr6[12] = l10;
                    fArr6[13] = l10 * 0.4f;
                    fArr6[14] = 0.0f;
                    iArr2[6] = h.k(0.55f, this.n.b, -1);
                    i16 = !z16 ? 2 : i15;
                    z15 = this.g3;
                    fArr3 = this.o3;
                    iArr = this.m3;
                    fArr4 = this.k3;
                    fArr5 = this.j3;
                    if (!z15 && i16 == this.i3 && Arrays.equals(fArr5, fArr4) && Arrays.equals(iArr2, iArr) && (!z16 || Arrays.equals(fArr6, fArr3))) {
                        f11 = 1.0f;
                    } else {
                        f11 = 1.0f;
                        Utilities.generateQrBackdrop(this.Y2, !this.h3 ? this.Z2 : null, max, i16, this.j3, this.l3, this.n3);
                        max = max;
                        int i17 = i14;
                        System.arraycopy(fArr5, i17, fArr4, i17, fArr5.length);
                        System.arraycopy(iArr2, i17, iArr, i17, iArr2.length);
                        System.arraycopy(fArr6, i17, fArr3, i17, fArr6.length);
                        this.i3 = i16;
                        this.g3 = i15;
                    }
                    if (this.Q4 >= f11) {
                        if (this.p3 < 0.0f && isAttachedToWindow()) {
                            this.p3 = a0.g(this);
                        }
                        if (this.p3 > 0.0f) {
                            Matrix matrix = this.d3;
                            matrix.setScale(max, max);
                            float f39 = (-max) / f15;
                            matrix.postTranslate(f39, f39);
                            this.a3.setLocalMatrix(matrix);
                            float f40 = this.p3;
                            canvas2 = canvas;
                            f10 = 0.2f;
                            f12 = 3.0f;
                            f13 = 0.0f;
                            f16 = 0.45f;
                            canvas2.drawRoundRect(0.0f, 0.0f, f35, f36, f40, f40, paint);
                        } else {
                            f13 = 0.0f;
                        }
                    } else {
                        f13 = 0.0f;
                    }
                    canvas2 = canvas;
                    f10 = 0.2f;
                    f12 = 3.0f;
                    f16 = 0.45f;
                    y(canvas2, this.Y2);
                }
            } else {
                i14 = 0;
                i15 = 1;
            }
            if (!z16) {
            }
            z15 = this.g3;
            fArr3 = this.o3;
            iArr = this.m3;
            fArr4 = this.k3;
            fArr5 = this.j3;
            if (!z15) {
            }
            f11 = 1.0f;
            Utilities.generateQrBackdrop(this.Y2, !this.h3 ? this.Z2 : null, max, i16, this.j3, this.l3, this.n3);
            max = max;
            int i172 = i14;
            System.arraycopy(fArr5, i172, fArr4, i172, fArr5.length);
            System.arraycopy(iArr2, i172, iArr, i172, iArr2.length);
            System.arraycopy(fArr6, i172, fArr3, i172, fArr6.length);
            this.i3 = i16;
            this.g3 = i15;
            if (this.Q4 >= f11) {
            }
            canvas2 = canvas;
            f10 = 0.2f;
            f12 = 3.0f;
            f16 = 0.45f;
            y(canvas2, this.Y2);
        }
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        float f41 = (currentAnimationTimeMillis - this.D) / 1000.0f;
        this.v3 = f41;
        float f42 = this.P3;
        float max4 = f42 < f13 ? f13 : Math.max(f13, Math.min(0.05f, f41 - f42));
        float f43 = this.v3;
        this.P3 = f43;
        boolean z18 = this.R || this.T || this.U;
        if (z18) {
            f17 = 0.05f;
            this.Q3 = f43 + 0.25f;
        } else {
            f17 = 0.05f;
        }
        float f44 = (z18 || f43 < this.Q3) ? f13 : f11;
        float f45 = this.N3;
        if (f44 < f45) {
            f16 = 0.07f;
        }
        if (max4 > f13) {
            f18 = 1000.0f;
            f19 = max4;
            this.N3 = com.google.android.recaptcha.internal.a.z(f11, (float) Math.exp((-max4) / f16), f44 - f45, f45);
        } else {
            f18 = 1000.0f;
            f19 = max4;
        }
        float f46 = f19 * this.N3;
        this.O3 = f46;
        this.M3 = this.M3 + f46;
        double radians = (float) Math.toRadians((r4 * (-0.763f)) % 360.0f);
        Math.cos(radians);
        Math.sin(radians);
        float f47 = this.v3;
        if (this.M >= f13) {
            float f48 = this.O3;
            if (f48 > f13) {
                float f49 = this.M3 - (f48 / f15);
                f20 = 0.016f;
                double sin = (((float) Math.sin((f49 * 0.016f) + 1.0f)) * f14) + (((float) Math.sin(0.025f * f49)) * 1.2f) + C9;
                z9 = z16;
                this.K = com.google.android.recaptcha.internal.a.x(((float) Math.cos(sin)) * 6.2f, org.telegram.messenger.g0.L(1.0f), f48, this.K);
                this.L = com.google.android.recaptcha.internal.a.x(((float) Math.sin(sin)) * 6.2f, org.telegram.messenger.g0.L(1.0f), f48, this.L);
                float f50 = this.M;
                min = f50 < f13 ? Math.min(0.033f, Math.max(f13, f47 - f50)) : f13;
                Math.exp((-min) / 0.09f);
                this.M = f47;
                if (min > f13) {
                    h1 h1Var = this.L3;
                    int i18 = h1Var.m;
                    int[] iArr3 = h1Var.l;
                    if (i18 > 0) {
                        float f51 = min / f15;
                        int i19 = 0;
                        boolean z19 = false;
                        while (i19 < 2) {
                            float[] fArr7 = h1Var.c;
                            float[] fArr8 = h1Var.j;
                            float f52 = f12;
                            float[] fArr9 = h1Var.i;
                            float f53 = f10;
                            float[] fArr10 = h1Var.h;
                            float f54 = f13;
                            float[] fArr11 = h1Var.g;
                            long j10 = currentAnimationTimeMillis;
                            float[] fArr12 = h1Var.f;
                            float[] fArr13 = h1Var.e;
                            float[] fArr14 = h1Var.d;
                            float sqrt = ((float) Math.sqrt(220.0d)) * 1.24f;
                            boolean z20 = false;
                            for (int i20 = 0; i20 < h1Var.m; i20++) {
                                int i21 = iArr3[i20];
                                float f55 = fArr7[i21];
                                if (f55 != f54 || fArr14[i21] != f54 || fArr13[i21] != f54 || fArr12[i21] != f54 || fArr11[i21] != f54 || fArr10[i21] != f54 || fArr9[i21] != f54 || fArr8[i21] != f54) {
                                    float f56 = fArr13[i21];
                                    float f57 = (((f55 * (-220.0f)) - (sqrt * f56)) * f51) + f56;
                                    fArr13[i21] = f57;
                                    fArr7[i21] = (f57 * f51) + fArr7[i21];
                                    float f58 = fArr12[i21];
                                    float f59 = (((fArr14[i21] * (-220.0f)) - (sqrt * f58)) * f51) + f58;
                                    fArr12[i21] = f59;
                                    fArr14[i21] = (f59 * f51) + fArr14[i21];
                                    float f60 = fArr10[i21];
                                    float f61 = (((fArr11[i21] * (-220.0f)) - (sqrt * f60)) * f51) + f60;
                                    fArr10[i21] = f61;
                                    fArr11[i21] = (f61 * f51) + fArr11[i21];
                                    float f62 = fArr8[i21];
                                    float f63 = (((fArr9[i21] * (-220.0f)) - (sqrt * f62)) * f51) + f62;
                                    fArr8[i21] = f63;
                                    fArr9[i21] = (f63 * f51) + fArr9[i21];
                                    if (Math.abs(fArr12[i21]) + Math.abs(fArr13[i21]) + Math.abs(fArr14[i21]) + Math.abs(fArr7[i21]) < f17) {
                                        if (Math.abs(fArr10[i21]) + Math.abs(fArr11[i21]) < 0.02f) {
                                            if (Math.abs(fArr8[i21]) + Math.abs(fArr9[i21]) < 5.0E-4f) {
                                                fArr8[i21] = f54;
                                                fArr9[i21] = f54;
                                                fArr10[i21] = f54;
                                                fArr11[i21] = f54;
                                                fArr12[i21] = f54;
                                                fArr13[i21] = f54;
                                                fArr14[i21] = f54;
                                                fArr7[i21] = f54;
                                            }
                                        }
                                    }
                                    z20 = true;
                                }
                            }
                            z19 |= z20;
                            i19++;
                            f10 = f53;
                            currentAnimationTimeMillis = j10;
                            f12 = f52;
                            f13 = f54;
                        }
                        j3 = currentAnimationTimeMillis;
                        f21 = f12;
                        f22 = f13;
                        f23 = f10;
                        if (!z19 && (this.s >= 1.0f || this.r == null)) {
                            for (int i22 = 0; i22 < h1Var.m; i22++) {
                                h1Var.b[iArr3[i22]] = false;
                            }
                            h1Var.m = 0;
                        }
                        if (this.T) {
                            float f64 = (j3 - this.V) / f18;
                            float exp = (1.0f - ((float) Math.exp((-f64) / 0.35f))) * 0.35f;
                            this.N = (this.c0 * exp) + this.a0;
                            this.O = (this.d0 * exp) + this.b0;
                            if (f64 > 2.8f) {
                                this.T = false;
                            }
                        }
                        if (this.U) {
                            float f65 = (j3 - this.W) / f18;
                            float cos = (float) (Math.cos((f65 * 6.283185307179586d) / 0.8500000238418579d) * Math.exp((-f65) / 0.22f));
                            this.e0 = this.i0 * cos;
                            this.f0 = this.j0 * cos;
                            if (f65 > 1.6f) {
                                this.U = false;
                                float f66 = f22;
                                this.f0 = f66;
                                this.e0 = f66;
                            }
                        }
                        fArr = o1.b;
                        f24 = fArr[27] / 100.0f;
                        while (true) {
                            f25 = this.v3;
                            f26 = this.F3 + this.G3;
                            f27 = 1.5f;
                            if (f25 < f26) {
                                break;
                            }
                            this.F3 = f26;
                            float f67 = fArr[25] + f23;
                            float f68 = fArr[26];
                            i1 i1Var2 = this.F;
                            if (i1Var2 == null || i1Var2.a != 1) {
                                f27 = 1.0f;
                            }
                            this.G3 = Math.max(f67, (this.e1.nextFloat() * 0.8f * f24) + (f68 * f27));
                            double radians2 = Math.toRadians(((r7.nextFloat() - 0.5f) * 12.0f * f24) + fArr[24]);
                            this.H3 = (float) Math.cos(radians2);
                            this.I3 = (float) Math.sin(radians2);
                        }
                        if (!this.D3) {
                            this.D3 = true;
                            this.F3 = (fArr[51] / f18) + f25 + 1.5f;
                            this.G3 = f18;
                        }
                        f28 = this.F3;
                        f29 = fArr[25];
                        if (f25 >= f28 + f29 && this.G3 > 999.0f) {
                            this.G3 = fArr[26];
                        }
                        float f69 = (f25 - f28) / f29;
                        this.y3 = this.Q4 < 1.0f && f69 >= 0.0f && f69 < 1.0f;
                        this.x3 = org.telegram.messenger.g0.N(fArr[23]);
                        if (this.y3) {
                            float cos2 = 0.5f - (((float) Math.cos(f69 * 3.141592653589793d)) * 0.5f);
                            float y10 = (this.x3 * f21) + com.google.android.recaptcha.internal.a.y(Math.abs(this.I3), i10, Math.abs(this.H3) * i7, f15);
                            this.w3 = org.telegram.messenger.g0.T1(-y10, y10, cos2);
                            this.E3 = 1.0f;
                        }
                        long nanoTime = System.nanoTime();
                        float min2 = this.U6 == 0 ? f20 : Math.min(0.1f, (nanoTime - r12) / 1.0E9f);
                        this.U6 = nanoTime;
                        if (fArr[15] >= 0.5f || this.Q4 < 1.0f) {
                            f30 = 0.35f;
                            fArr2 = fArr;
                            f31 = 0.0f;
                            this.Q6 = 0.0f;
                        } else {
                            float max5 = 30.0f / Math.max(1.0f, fArr[16]);
                            float max6 = Math.max(-1.0f, Math.min(1.0f, this.F6 * max5));
                            float max7 = Math.max(-1.0f, Math.min(1.0f, this.G6 * max5));
                            if (!this.V6) {
                                this.R6 = max6;
                                this.S6 = max7;
                                this.V6 = true;
                            }
                            f30 = 0.35f;
                            fArr2 = fArr;
                            float hypot2 = ((float) Math.hypot(max6 - this.R6, max7 - this.S6)) / min2;
                            this.R6 = max6;
                            this.S6 = max7;
                            long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                            if (hypot2 > 0.15f) {
                                this.T6 = currentAnimationTimeMillis2;
                            }
                            boolean z21 = currentAnimationTimeMillis2 - this.T6 < 1500;
                            float B = com.google.android.recaptcha.internal.a.B(max7, -this.I3, max6 * (-this.H3), com.google.android.recaptcha.internal.a.y(Math.abs(this.I3), i10, Math.abs(this.H3) * i7, 2.0f) + this.x3);
                            if (this.Q6 <= 0.001f) {
                                this.P6 = B;
                            }
                            float f70 = this.P6;
                            this.P6 = com.google.android.recaptcha.internal.a.z(1.0f, (float) Math.exp((-min2) / 0.1f), B - f70, f70);
                            float e10 = z21 ? org.telegram.ui.Cells.f1.e(min2, f23, this.Q6, 1.0f) : org.telegram.ui.Cells.f1.v(min2, f14, this.Q6, 0.0f);
                            this.Q6 = e10;
                            if (e10 > 0.001f) {
                                float C = com.google.android.recaptcha.internal.a.C(e10, 2.0f, f21, e10 * e10);
                                if (this.y3) {
                                    this.w3 = org.telegram.messenger.g0.T1(this.w3, this.P6, C);
                                    this.E3 = org.telegram.messenger.g0.T1(this.E3, 1.0f, C);
                                } else {
                                    this.w3 = this.P6;
                                    this.E3 = C;
                                }
                                this.y3 = true;
                                if (this.Q6 >= 0.999f) {
                                    this.F3 = this.v3;
                                }
                            }
                            f31 = 0.0f;
                        }
                        if (this.y3 && this.F.a != 0) {
                            f32 = fArr2[46] / 100.0f;
                            if (f32 > f31 && i7 > 0 && i10 > 0) {
                                float L2 = org.telegram.messenger.g0.L(12.0f);
                                float f71 = i7;
                                ceil = ((int) Math.ceil(f71 / L2)) + 1;
                                float f72 = i10;
                                ceil2 = ((int) Math.ceil(f72 / L2)) + 1;
                                bitmap = this.z3;
                                if (bitmap != null || bitmap.getWidth() != ceil || this.z3.getHeight() != ceil2) {
                                    this.z3 = Bitmap.createBitmap(ceil, ceil2, Bitmap.Config.ARGB_8888);
                                    this.A3 = new int[ceil * ceil2];
                                }
                                float max8 = Math.max(1.0f, fArr2[45]);
                                float f73 = fArr2[47] / 100.0f;
                                float f74 = f32 * 0.0275f;
                                float L3 = org.telegram.messenger.g0.L(130.0f);
                                float f75 = this.v3 * 0.12f;
                                i13 = 0;
                                z14 = false;
                                while (i13 < ceil2) {
                                    int i23 = 0;
                                    while (i23 < ceil) {
                                        float f76 = f74;
                                        float f77 = i23 * L2;
                                        float f78 = f75;
                                        float f79 = i13 * L2;
                                        c1(f77, f79, i7, i10);
                                        float f80 = this.o4 / max8;
                                        if (f80 >= 3.5f || f80 <= -3.5f) {
                                            f33 = f71;
                                            f34 = 0.0f;
                                        } else {
                                            f33 = f71;
                                            float exp2 = ((float) Math.exp((-0.5f) * f80 * f80)) * this.p4;
                                            if (f73 > 0.0f) {
                                                float y11 = com.google.android.recaptcha.internal.a.y(f79 - (f72 / 2.0f), this.H3, (f77 - (f33 / 2.0f)) * (-this.I3), L3);
                                                exp2 = ((((((v1(((y11 * 2.3f) - (1.7f * f78)) + 11.3f) * f30) + (v1(y11 + f78) * 0.65f)) * 2.0f) - 1.0f) * f73) + 1.0f) * exp2;
                                            }
                                            f34 = exp2;
                                        }
                                        int max9 = Math.max(0, Math.min(qs.e4, Math.round(255.0f * f76 * f34)));
                                        if (max9 > 0) {
                                            z14 = true;
                                        }
                                        this.A3[(i13 * ceil) + i23] = (max9 << 24) | 16777215;
                                        i23++;
                                        f74 = f76;
                                        f75 = f78;
                                        f71 = f33;
                                    }
                                    i13++;
                                    f75 = f75;
                                }
                                z10 = false;
                                if (z14) {
                                    this.z3.setPixels(this.A3, 0, ceil, 0, 0, ceil, ceil2);
                                    float f81 = (-L2) / 2.0f;
                                    float f82 = ceil * L2;
                                    float f83 = L2 / 2.0f;
                                    float f84 = (ceil2 * L2) - f83;
                                    RectF rectF = this.C3;
                                    rectF.set(f81, f81, f82 - f83, f84);
                                    canvas2.drawBitmap(this.z3, (Rect) null, rectF, this.B3);
                                }
                                float f85 = (j3 - this.H) / 1000.0f;
                                i1Var = this.G;
                                if (i1Var != null) {
                                    if (f85 < (this.F.h ? 0.6f : 0.3f) + 0.135f + 0.315f) {
                                        z11 = true;
                                        if (!z11 && i1Var != null) {
                                            P0(i1Var);
                                            this.G = null;
                                        }
                                        z12 = z10;
                                        if (z11) {
                                            i11 = i7;
                                            i12 = i10;
                                            z13 = true;
                                        } else {
                                            i1 i1Var3 = this.G;
                                            z13 = true;
                                            if (i1Var3.a == 1) {
                                                i1 i1Var4 = this.F;
                                                if (i1Var4.a == 1) {
                                                    E(canvas2, i7, i10, i1Var3, i1Var4, f85, false, false);
                                                    if (z9 && this.h3) {
                                                        y(canvas2, this.Z2);
                                                        return;
                                                    }
                                                    return;
                                                }
                                            }
                                            i11 = i7;
                                            i12 = i10;
                                        }
                                        if (z11 || !this.F.h) {
                                            if (z11) {
                                                F(canvas, i7, i10, this.G, true, this.F.a == 0 ? z13 : z12, f85);
                                                f85 = f85;
                                            }
                                            canvas2 = canvas;
                                            F(canvas2, i7, i10, this.F, false, (z11 || this.G.a == 0) ? z13 : z12, !z11 ? f85 : 100.0f);
                                        } else if (this.s >= 1.0f || this.r == null) {
                                            P0(this.G);
                                            this.G = null;
                                            canvas2 = canvas;
                                            F(canvas2, i7, i10, this.F, false, true, 100.0f);
                                        } else {
                                            float f86 = this.x;
                                            double max10 = Math.max(f86, i11 - f86);
                                            float f87 = this.y;
                                            float y13 = y1(this.s) * (((float) Math.hypot(max10, Math.max(f87, i12 - f87))) + org.telegram.messenger.g0.L(60.0f));
                                            Path path = this.R3;
                                            path.rewind();
                                            path.addCircle(this.x, this.y, y13, Path.Direction.CW);
                                            canvas2.save();
                                            a0.b(canvas2, path);
                                            F(canvas2, i11, i12, this.G, true, this.F.a == 0 ? z13 : z12, -1.0f);
                                            canvas2.restore();
                                            canvas2.save();
                                            canvas2.clipPath(path);
                                            F(canvas2, i7, i10, this.F, false, this.G.a == 0 ? z13 : z12, 100.0f);
                                            canvas.restore();
                                            canvas2 = canvas;
                                        }
                                        if (z9) {
                                            return;
                                        } else {
                                            return;
                                        }
                                    }
                                }
                                z11 = z10;
                                if (!z11) {
                                    P0(i1Var);
                                    this.G = null;
                                }
                                z12 = z10;
                                if (z11) {
                                }
                                if (z11) {
                                }
                                if (z11) {
                                }
                                canvas2 = canvas;
                                F(canvas2, i7, i10, this.F, false, (z11 || this.G.a == 0) ? z13 : z12, !z11 ? f85 : 100.0f);
                                if (z9) {
                                }
                            }
                        }
                        z10 = false;
                        float f852 = (j3 - this.H) / 1000.0f;
                        i1Var = this.G;
                        if (i1Var != null) {
                        }
                        z11 = z10;
                        if (!z11) {
                        }
                        z12 = z10;
                        if (z11) {
                        }
                        if (z11) {
                        }
                        if (z11) {
                        }
                        canvas2 = canvas;
                        F(canvas2, i7, i10, this.F, false, (z11 || this.G.a == 0) ? z13 : z12, !z11 ? f852 : 100.0f);
                        if (z9) {
                        }
                    }
                }
                j3 = currentAnimationTimeMillis;
                f21 = f12;
                f22 = f13;
                f23 = f10;
                if (this.T) {
                }
                if (this.U) {
                }
                fArr = o1.b;
                f24 = fArr[27] / 100.0f;
                while (true) {
                    f25 = this.v3;
                    f26 = this.F3 + this.G3;
                    f27 = 1.5f;
                    if (f25 < f26) {
                    }
                    this.G3 = Math.max(f67, (this.e1.nextFloat() * 0.8f * f24) + (f68 * f27));
                    double radians22 = Math.toRadians(((r7.nextFloat() - 0.5f) * 12.0f * f24) + fArr[24]);
                    this.H3 = (float) Math.cos(radians22);
                    this.I3 = (float) Math.sin(radians22);
                }
                if (!this.D3) {
                }
                f28 = this.F3;
                f29 = fArr[25];
                if (f25 >= f28 + f29) {
                    this.G3 = fArr[26];
                }
                float f692 = (f25 - f28) / f29;
                this.y3 = this.Q4 < 1.0f && f692 >= 0.0f && f692 < 1.0f;
                this.x3 = org.telegram.messenger.g0.N(fArr[23]);
                if (this.y3) {
                }
                long nanoTime2 = System.nanoTime();
                if (this.U6 == 0) {
                }
                this.U6 = nanoTime2;
                if (fArr[15] >= 0.5f) {
                }
                f30 = 0.35f;
                fArr2 = fArr;
                f31 = 0.0f;
                this.Q6 = 0.0f;
                if (this.y3) {
                    f32 = fArr2[46] / 100.0f;
                    if (f32 > f31) {
                        float L22 = org.telegram.messenger.g0.L(12.0f);
                        float f712 = i7;
                        ceil = ((int) Math.ceil(f712 / L22)) + 1;
                        float f722 = i10;
                        ceil2 = ((int) Math.ceil(f722 / L22)) + 1;
                        bitmap = this.z3;
                        if (bitmap != null) {
                        }
                        this.z3 = Bitmap.createBitmap(ceil, ceil2, Bitmap.Config.ARGB_8888);
                        this.A3 = new int[ceil * ceil2];
                        float max82 = Math.max(1.0f, fArr2[45]);
                        float f732 = fArr2[47] / 100.0f;
                        float f742 = f32 * 0.0275f;
                        float L32 = org.telegram.messenger.g0.L(130.0f);
                        float f752 = this.v3 * 0.12f;
                        i13 = 0;
                        z14 = false;
                        while (i13 < ceil2) {
                        }
                        z10 = false;
                        if (z14) {
                        }
                        float f8522 = (j3 - this.H) / 1000.0f;
                        i1Var = this.G;
                        if (i1Var != null) {
                        }
                        z11 = z10;
                        if (!z11) {
                        }
                        z12 = z10;
                        if (z11) {
                        }
                        if (z11) {
                        }
                        if (z11) {
                        }
                        canvas2 = canvas;
                        F(canvas2, i7, i10, this.F, false, (z11 || this.G.a == 0) ? z13 : z12, !z11 ? f8522 : 100.0f);
                        if (z9) {
                        }
                    }
                }
                z10 = false;
                float f85222 = (j3 - this.H) / 1000.0f;
                i1Var = this.G;
                if (i1Var != null) {
                }
                z11 = z10;
                if (!z11) {
                }
                z12 = z10;
                if (z11) {
                }
                if (z11) {
                }
                if (z11) {
                }
                canvas2 = canvas;
                F(canvas2, i7, i10, this.F, false, (z11 || this.G.a == 0) ? z13 : z12, !z11 ? f85222 : 100.0f);
                if (z9) {
                }
            }
        }
        z9 = z16;
        f20 = 0.016f;
        float f502 = this.M;
        if (f502 < f13) {
        }
        Math.exp((-min) / 0.09f);
        this.M = f47;
        if (min > f13) {
        }
        j3 = currentAnimationTimeMillis;
        f21 = f12;
        f22 = f13;
        f23 = f10;
        if (this.T) {
        }
        if (this.U) {
        }
        fArr = o1.b;
        f24 = fArr[27] / 100.0f;
        while (true) {
            f25 = this.v3;
            f26 = this.F3 + this.G3;
            f27 = 1.5f;
            if (f25 < f26) {
            }
            this.G3 = Math.max(f67, (this.e1.nextFloat() * 0.8f * f24) + (f68 * f27));
            double radians222 = Math.toRadians(((r7.nextFloat() - 0.5f) * 12.0f * f24) + fArr[24]);
            this.H3 = (float) Math.cos(radians222);
            this.I3 = (float) Math.sin(radians222);
        }
        if (!this.D3) {
        }
        f28 = this.F3;
        f29 = fArr[25];
        if (f25 >= f28 + f29) {
        }
        float f6922 = (f25 - f28) / f29;
        this.y3 = this.Q4 < 1.0f && f6922 >= 0.0f && f6922 < 1.0f;
        this.x3 = org.telegram.messenger.g0.N(fArr[23]);
        if (this.y3) {
        }
        long nanoTime22 = System.nanoTime();
        if (this.U6 == 0) {
        }
        this.U6 = nanoTime22;
        if (fArr[15] >= 0.5f) {
        }
        f30 = 0.35f;
        fArr2 = fArr;
        f31 = 0.0f;
        this.Q6 = 0.0f;
        if (this.y3) {
        }
        z10 = false;
        float f852222 = (j3 - this.H) / 1000.0f;
        i1Var = this.G;
        if (i1Var != null) {
        }
        z11 = z10;
        if (!z11) {
        }
        z12 = z10;
        if (z11) {
        }
        if (z11) {
        }
        if (z11) {
        }
        canvas2 = canvas;
        F(canvas2, i7, i10, this.F, false, (z11 || this.G.a == 0) ? z13 : z12, !z11 ? f852222 : 100.0f);
        if (z9) {
        }
    }

    public final float z0() {
        float f10;
        int f02;
        int L;
        int L2;
        float f11;
        float A = org.telegram.messenger.camera.q.A(10.0f, 2, getWidth()) - org.telegram.messenger.g0.L(8.0f);
        int i7 = this.h1;
        if (i7 != 0) {
            if (i7 == 1) {
                f10 = A / 6.0f;
                f11 = 0.0f;
            } else if (h0()) {
                f10 = 0.0f;
                f11 = 0.0f;
            } else {
                f10 = A / 3.0f;
                f02 = ((f0() + this.v1.size()) - 1) / f0();
                L = org.telegram.messenger.g0.L(4.0f) - org.telegram.messenger.g0.L(32.0f);
                L2 = org.telegram.messenger.g0.L(4.0f);
            }
            f02 = 0;
            return Math.max(0.0f, (((f02 * f10) + f11) + org.telegram.messenger.g0.L(32.0f)) - b1());
        }
        f10 = A / 6.0f;
        f02 = (a.b.length + 5) / 6;
        L = org.telegram.messenger.g0.L(4.0f) - org.telegram.messenger.g0.L(32.0f);
        L2 = org.telegram.messenger.g0.L(4.0f);
        f11 = L2 + L;
        return Math.max(0.0f, (((f02 * f10) + f11) + org.telegram.messenger.g0.L(32.0f)) - b1());
    }
}
