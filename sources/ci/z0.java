package ci;

import ai.v1;
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
import com.google.android.gms.internal.vision.e2;
import di.l8;
import fi.u2;
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
import org.telegram.messenger.f6;
import org.telegram.messenger.hd;
import org.telegram.messenger.i20;
import org.telegram.messenger.is;
import org.telegram.messenger.j6;
import org.telegram.messenger.k5;
import org.telegram.messenger.m10;
import org.telegram.messenger.ns;
import org.telegram.messenger.qc;
import org.telegram.messenger.si;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.x1;
import org.telegram.ui.Cells.t6;
import org.telegram.ui.Components.RLottieNative;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.e5;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.g5;
import org.telegram.ui.Components.g6;
import org.telegram.ui.Components.ou0;
import org.telegram.ui.Components.t5;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class z0 extends View {
    public static int[] E9;
    public static int[] F9;
    public static int[] G9;
    public static String K9;
    public static e L9;
    public static volatile byte[] O9;
    public static int P9;
    public static int Q9;
    public static int R9;
    public long A0;
    public final Paint A1;
    public String A2;
    public Bitmap A3;
    public final Paint A4;
    public final float[] A5;
    public boolean A6;
    public final RectF A7;
    public long A8;
    public final float[] A9;
    public boolean B0;
    public final Paint B1;
    public int B2;
    public int[] B3;
    public final float B4;
    public final boolean[] B5;
    public boolean B6;
    public final LinearGradient B7;
    public long B8;
    public final Rect[] B9;
    public float C0;
    public final Paint C1;
    public boolean C2;
    public final Paint C3;
    public final Paint C4;
    public int C5;
    public int C6;
    public final Paint C7;
    public float C8;
    public float D0;
    public final TextPaint D1;
    public float D2;
    public final RectF D3;
    public final Paint D4;
    public final LinearGradient D5;
    public final SweepGradient[] D6;
    public final Matrix D7;
    public float D8;
    public final long E;
    public float E0;
    public final TextPaint E1;
    public float E2;
    public boolean E3;
    public final RectF E4;
    public final Paint E5;
    public float E6;
    public final RectF[] E7;
    public float E8;
    public final Matrix F;
    public long F0;
    public final Path F1;
    public float F2;
    public float F3;
    public final float[] F4;
    public final Path F5;
    public float F6;
    public float F7;
    public float F8;
    public w0 G;
    public boolean G0;
    public final RectF G1;
    public long G2;
    public float G3;
    public final float[] G4;
    public final TextPaint G5;
    public float G6;
    public float G7;
    public float G8;
    public w0 H;
    public float H0;
    public Object H1;
    public long H2;
    public float H3;
    public final float[] H4;
    public Drawable H5;
    public float H6;
    public boolean H7;
    public float H8;
    public long I;
    public final TextPaint I0;
    public Object I1;
    public boolean I2;
    public float I3;
    public final float[] I4;
    public StaticLayout I5;
    public float I6;
    public int I7;
    public float I8;
    public final ArrayList J;
    public String J0;
    public int J1;
    public long J2;
    public float J3;
    public final float[] J4;
    public int J5;
    public float J6;
    public final RectF J7;
    public final Path J8;
    public final HashMap K;
    public String K0;
    public final Drawable K1;
    public float K2;
    public float K3;
    public final long[] K4;
    public final RectF K5;
    public float K6;
    public final HashMap K7;
    public final RectF K8;
    public float L;
    public boolean L0;
    public final Drawable L1;
    public float L2;
    public float L3;
    public int L4;
    public final RectF L5;
    public float L6;
    public final HashMap L7;
    public final RectF L8;
    public float M;
    public final g6 M0;
    public final Drawable M1;
    public float M2;
    public final v0 M3;
    public float M4;
    public final Path M5;
    public boolean M6;
    public int M7;
    public final RectF M8;
    public float N;
    public final float[] N0;
    public final Drawable N1;
    public long N2;
    public float N3;
    public float N4;
    public final float[] N5;
    public long N6;
    public int N7;
    public long N8;
    public float O;
    public final float[] O0;
    public final Drawable O1;
    public long O2;
    public float O3;
    public final Paint O4;
    public float O5;
    public SensorManager O6;
    public float O7;
    public boolean O8;
    public float P;
    public final float[] P0;
    public final Drawable P1;
    public String P2;
    public float P3;
    public final Paint P4;
    public final Matrix P5;
    public final u0 P6;
    public float P7;
    public Bitmap P8;
    public float Q;
    public final float[] Q0;
    public final Drawable Q1;
    public float Q2;
    public float Q3;
    public final RectF Q4;
    public final Matrix Q5;
    public float Q6;
    public int Q7;
    public Bitmap Q8;
    public float R;
    public final float[] R0;
    public final Drawable R1;
    public long R2;
    public float R3;
    public float R4;
    public final LinearGradient R5;
    public float R6;
    public int R7;
    public final Paint R8;
    public boolean S;
    public final float[] S0;
    public final Drawable S1;
    public Bitmap S2;
    public final Path S3;
    public float S4;
    public final LongSparseArray S5;
    public float S6;
    public long S7;
    public final Paint S8;
    public boolean T;
    public final float[] T0;
    public final Drawable T1;
    public final Paint T2;
    public Bitmap T3;
    public boolean T4;
    public final Path T5;
    public float T6;
    public long T7;
    public final RectF T8;
    public boolean U;
    public final float[] U0;
    public final a1 U1;
    public boolean U2;
    public Bitmap U3;
    public boolean U4;
    public boolean U5;
    public long U6;
    public long U7;
    public int U8;
    public boolean V;
    public final float[] V0;
    public final Paint V1;
    public int V2;
    public float V3;
    public float V4;
    public final RectF V5;
    public long V6;
    public final float V7;
    public String V8;
    public long W;
    public final float[] W0;
    public final String W1;
    public boolean W2;
    public float W3;
    public boolean W4;
    public final RectF W5;
    public boolean W6;
    public int W7;
    public boolean W8;
    public final float[] X0;
    public final x1 X1;
    public long X2;
    public float X3;
    public Bitmap X4;
    public final RectF X5;
    public final Matrix X6;
    public long X7;
    public int X8;
    public final float[] Y0;
    public final ch0 Y1;
    public float Y2;
    public final Paint Y3;
    public int[] Y4;
    public final LinearGradient Y5;
    public final Path Y6;
    public long Y7;
    public long Y8;
    public final float[] Z0;
    public final Paint Z1;
    public Bitmap Z2;
    public final int[] Z3;
    public int Z4;
    public final LinearGradient Z5;
    public final RectF Z6;
    public float Z7;
    public ch0 Z8;
    public boolean a;
    public long a0;
    public final float[] a1;
    public boolean a2;
    public Bitmap a3;
    public final int[] a4;
    public final Paint a5;
    public final Matrix a6;
    public final Path a7;
    public final RectF a8;
    public ch0 a9;
    public final int b;
    public float b0;
    public final byte[] b1;
    public int b2;
    public BitmapShader b3;
    public final float[] b4;
    public final Rect b5;
    public final Paint b6;
    public final Path b7;
    public final TextPaint b8;
    public ch0 b9;
    public final cb.c c;
    public float c0;
    public final boolean[] c1;
    public int c2;
    public final Paint c3;
    public final float[] c4;
    public final RectF c5;
    public float c6;
    public int c7;
    public final TextPaint c8;
    public Object c9;
    public String d;
    public float d0;
    public int d1;
    public final HashMap d2;
    public final Paint d3;
    public final float[] d4;
    public final int[] d5;
    public long d6;
    public final RectF d7;
    public final TextPaint d8;
    public float d9;
    public String e;
    public float e0;
    public boolean e1;
    public Runnable e2;
    public final Matrix e3;
    public final float[] e4;
    public final float[] e5;
    public long e6;
    public final Matrix e7;
    public TextPaint e8;
    public String e9;
    public String f;
    public float f0;
    public final Random f1;
    public boolean f2;
    public final RectF f3;
    public int f4;
    public final float[] f5;
    public boolean f6;
    public final SparseArray f7;
    public final TextPaint f8;
    public long f9;
    public float g0;
    public float g1;
    public boolean g2;
    public float g3;
    public float[] g4;
    public final float[] g5;
    public boolean g6;
    public final Drawable[] g7;
    public StaticLayout g8;
    public float g9;
    public boolean h;
    public float h0;
    public float h1;
    public Bitmap h2;
    public boolean h3;
    public float[] h4;
    public final float[] h5;
    public int h6;
    public final RectF h7;
    public int h8;
    public boolean h9;
    public float i0;
    public int i1;
    public final int[] i2;
    public boolean i3;
    public float[] i4;
    public final float[] i5;
    public int i6;
    public final RectF i7;
    public boolean i8;
    public float i9;
    public float j0;
    public float j1;
    public l8 j2;
    public int j3;
    public int j4;
    public final boolean[] j5;
    public int j6;
    public final RectF j7;
    public final String j8;
    public float j9;
    public float k0;
    public float k1;
    public final r0 k2;
    public final float[] k3;
    public int k4;
    public int k5;
    public float k6;
    public final RectF k7;
    public final String k8;
    public float k9;
    public VelocityTracker l0;
    public float l1;
    public final s0 l2;
    public final float[] l3;
    public PorterDuffColorFilter l4;
    public float l5;
    public float l6;
    public final RectF l7;
    public g5 l8;
    public final OverScroller l9;
    public float m0;
    public float m1;
    public boolean m2;
    public final int[] m3;
    public int m4;
    public float m5;
    public float m6;
    public boolean m7;
    public ch0 m8;
    public final ViewConfiguration m9;
    public x0 n;
    public float n0;
    public String n1;
    public long n2;
    public final int[] n3;
    public float n4;
    public StaticLayout n5;
    public float n6;
    public boolean n7;
    public long n8;
    public VelocityTracker n9;
    public float o0;
    public int o1;
    public long o2;
    public final float[] o3;
    public float o4;
    public boolean o5;
    public final float[] o6;
    public float o7;
    public boolean o8;
    public boolean o9;
    public float p0;
    public String p1;
    public long p2;
    public final float[] p3;
    public float p4;
    public final float[] p5;
    public final Paint p6;
    public float p7;
    public TLRPC.TL_inputStickerSetShortName p8;
    public boolean p9;
    public float q0;
    public String q1;
    public float q2;
    public float q3;
    public float q4;
    public final float[] q5;
    public float q6;
    public long q7;
    public TLRPC.Document q8;
    public final s0 q9;
    public x0 r;
    public int r0;
    public final RectF r1;
    public long r2;
    public final double[] r3;
    public float r4;
    public final float[] r5;
    public boolean r6;
    public boolean r7;
    public long r8;
    public final RippleDrawable[] r9;
    public float s;
    public long s0;
    public boolean s1;
    public final RectF s2;
    public final double[] s3;
    public float s4;
    public final float[] s5;
    public float s6;
    public float s7;
    public LinearGradient[] s8;
    public int s9;
    public final f t0;
    public float t1;
    public boolean t2;
    public final double[] t3;
    public final long[] t4;
    public final float[] t5;
    public boolean t6;
    public float t7;
    public int[] t8;
    public final Paint t9;
    public e u0;
    public float u1;
    public float u2;
    public int u3;
    public final float[] u4;
    public final float[] u5;
    public Object u6;
    public long u7;
    public final b1 u8;
    public final Path u9;
    public e v0;
    public long v1;
    public String v2;
    public int v3;
    public final float[] v4;
    public final float[] v5;
    public float v6;
    public final RectF v7;
    public int v8;
    public final float[] v9;
    public long w;
    public boolean w0;
    public final ArrayList w1;
    public String w2;
    public float w3;
    public final float[] w4;
    public final float[] w5;
    public int w6;
    public long w7;
    public int w8;
    public final float[] w9;
    public float x;
    public boolean x0;
    public long x1;
    public String x2;
    public float x3;
    public final float[] x4;
    public final float[] x5;
    public int x6;
    public float x7;
    public float x8;
    public final long[] x9;
    public float y;
    public boolean y0;
    public boolean y1;
    public String y2;
    public float y3;
    public final long[] y4;
    public final float[] y5;
    public final SparseIntArray y6;
    public float y7;
    public float y8;
    public final long[] y9;
    public boolean z0;
    public final HashMap z1;
    public final TextPaint z2;
    public boolean z3;
    public final boolean[] z4;
    public final float[] z5;
    public int z6;
    public float z7;
    public final RectF[] z8;
    public final float[] z9;
    public static final String[] C9 = {"❤️", "🔥", "🎉", "😎", "🚀", "💎", "💙", "✨", "⭐", "🍀", "🐸", "🦄", "🌈", "🍕", "👻", "🍒", "🌸", "⚡", "🏆", "🎁", "👀", "😍", "🥳", "🤩", "🐱", "🐶", "🦋", "🌙", "☀️", "🍓", "🍩", "🎈", "🎮", "🎧", "💜", "🌊"};
    public static final float D9 = (float) Math.atan2(-5.5d, -3.5d);
    public static int H9 = a.b("Black");
    public static int I9 = a.b("Neon Blue");
    public static final int J9 = org.telegram.messenger.g0.L(70.0f);
    public static final float M9 = (float) Math.sin(Math.toRadians(18.0d));
    public static final float N9 = (float) Math.cos(Math.toRadians(18.0d));
    public static final er S9 = new er(0.16d, 1.0d, 0.3d, 1.0d);

    /* JADX WARN: Type inference failed for: r11v17, types: [ci.r0] */
    /* JADX WARN: Type inference failed for: r11v18, types: [ci.s0] */
    /* JADX WARN: Type inference failed for: r3v26, types: [ci.s0] */
    public z0(Context context, int i7, String str, String str2, boolean z10, cb.c cVar) {
        super(context);
        e eVar;
        final int i10 = 1;
        this.a = true;
        this.s = 1.0f;
        this.E = AnimationUtils.currentAnimationTimeMillis();
        this.F = new Matrix();
        this.G = new w0();
        this.J = new ArrayList();
        this.K = new HashMap();
        Paint paint = new Paint(3);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        paint.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.N = -1.0f;
        this.t0 = new f();
        this.x0 = true;
        this.y0 = true;
        this.E0 = 0.0f;
        this.H0 = 1.0f;
        this.I0 = new TextPaint(1);
        this.J0 = "";
        this.K0 = "";
        this.N0 = new float[ns.r5];
        this.O0 = new float[ns.r5];
        this.P0 = new float[ns.r5];
        this.Q0 = new float[ns.r5];
        this.R0 = new float[ns.r5];
        this.S0 = new float[ns.r5];
        this.T0 = new float[ns.r5];
        this.U0 = new float[ns.r5];
        this.V0 = new float[ns.r5];
        this.W0 = new float[ns.r5];
        this.X0 = new float[ns.r5];
        this.Y0 = new float[ns.r5];
        this.Z0 = new float[ns.r5];
        this.a1 = new float[ns.r5];
        this.b1 = new byte[ns.r5];
        this.c1 = new boolean[ns.r5];
        this.f1 = new Random();
        final int i11 = 0;
        this.i1 = 0;
        this.r1 = new RectF();
        this.w1 = new ArrayList();
        this.z1 = new HashMap();
        this.A1 = new Paint(1);
        this.B1 = new Paint(1);
        this.C1 = new Paint(1);
        this.D1 = new TextPaint(1);
        this.E1 = new TextPaint(1);
        this.F1 = new Path();
        new Path();
        this.G1 = new RectF();
        this.J1 = -1;
        this.V1 = new Paint(1);
        this.W1 = hd.M0(2131746470, null);
        this.Z1 = new Paint(1);
        this.b2 = 1;
        this.d2 = new HashMap();
        this.i2 = new int[3];
        this.k2 = new is() { // from class: ci.r0
            @Override // org.telegram.messenger.is
            public final void didReceivedNotification(int i12, int i13, Object[] objArr) {
                if (objArr.length > 1) {
                    Object obj = objArr[1];
                    z0 z0Var = z0.this;
                    if (obj == z0Var.j2) {
                        z0Var.y0();
                    }
                }
            }
        };
        this.l2 = new Runnable(this) { // from class: ci.s0
            public final /* synthetic */ z0 b;

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
                        z0 z0Var = this.b;
                        ArrayList arrayList = z0Var.w1;
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
                                    z0Var.g0(tL_starGiftUnique.id, document);
                                }
                            }
                            z0Var.m1(tL_starGiftUnique);
                        }
                        break;
                    default:
                        z0 z0Var2 = this.b;
                        ArrayList arrayList3 = z0Var2.J;
                        if (z0Var2.g1 >= 0.5f && z0Var2.i1 == 1 && !z0Var2.p9) {
                            float f10 = z0Var2.i9;
                            float f11 = z0Var2.j9;
                            float width = (z0Var2.getWidth() - org.telegram.messenger.g0.L(28.0f)) / 6.0f;
                            float f12 = z0Var2.k1 + f11;
                            RectF rectF = z0Var2.v7;
                            float L2 = f12 - (rectF.top + org.telegram.messenger.g0.L(16.0f));
                            int i14 = -1;
                            if (L2 >= 0.0f && f10 >= org.telegram.messenger.g0.L(14.0f) && f11 >= rectF.top + org.telegram.messenger.g0.L(8.0f) && (L = (((int) (L2 / width)) * 6) + ((int) ((f10 - org.telegram.messenger.g0.L(14.0f)) / width))) >= 0 && L < 36) {
                                i14 = L;
                            }
                            if (i14 >= 0) {
                                String[] strArr = z0.C9;
                                if (arrayList3.contains(strArr[i14]) && (lastIndexOf = arrayList3.lastIndexOf(strArr[i14])) >= 0) {
                                    arrayList3.remove(lastIndexOf);
                                    z0Var2.c();
                                    z0Var2.i0();
                                    break;
                                }
                            }
                        }
                        break;
                }
            }
        };
        this.q2 = 1.0f;
        this.s2 = new RectF();
        TextPaint textPaint = new TextPaint(1);
        this.z2 = textPaint;
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        this.B2 = -1;
        this.F2 = -1.0f;
        this.M2 = -1.0f;
        this.O2 = -1L;
        this.P2 = "";
        this.Q2 = -1.0f;
        this.T2 = new Paint(3);
        this.Y2 = 1.0f;
        this.c3 = new Paint(2);
        this.d3 = new Paint(3);
        this.e3 = new Matrix();
        this.f3 = new RectF();
        this.k3 = new float[14];
        this.l3 = new float[14];
        this.m3 = new int[7];
        this.n3 = new int[7];
        this.o3 = new float[15];
        this.p3 = new float[15];
        this.q3 = -1.0f;
        this.r3 = new double[3];
        this.s3 = new double[3];
        this.t3 = new double[3];
        this.u3 = org.telegram.messenger.g0.m;
        this.v3 = org.telegram.messenger.g0.n;
        this.C3 = new Paint(2);
        this.D3 = new RectF();
        this.H3 = 5.0f;
        this.I3 = -0.7071f;
        this.J3 = 0.7071f;
        this.M3 = new v0();
        this.O3 = 1.0f;
        this.Q3 = -1.0f;
        this.S3 = new Path();
        this.V3 = -1.0f;
        this.W3 = -1.0f;
        this.X3 = -1.0f;
        Paint paint2 = new Paint(2);
        this.Y3 = paint2;
        PorterDuff.Mode mode2 = PorterDuff.Mode.DST_OUT;
        paint2.setXfermode(new PorterDuffXfermode(mode2));
        this.Z3 = new int[1024];
        this.a4 = new int[1024];
        this.b4 = new float[1024];
        this.c4 = new float[1024];
        this.d4 = new float[1024];
        this.e4 = new float[1024];
        this.k4 = -1;
        this.m4 = -1;
        this.t4 = new long[2048];
        this.u4 = new float[2048];
        this.v4 = new float[2048];
        this.w4 = new float[2048];
        this.x4 = new float[2048];
        this.y4 = new long[2048];
        this.z4 = new boolean[2048];
        Paint paint3 = new Paint(2);
        this.A4 = paint3;
        paint3.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.B4 = (float) Math.random();
        this.C4 = new Paint(2);
        this.D4 = new Paint(2);
        this.E4 = new RectF();
        this.F4 = new float[96];
        this.G4 = new float[96];
        this.H4 = new float[96];
        this.I4 = new float[96];
        this.J4 = new float[96];
        this.K4 = new long[96];
        this.O4 = new Paint(2);
        Paint paint4 = new Paint(2);
        this.P4 = paint4;
        paint4.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.Q4 = new RectF();
        this.R4 = 1.0f;
        this.S4 = 1.0f;
        this.U4 = true;
        this.V4 = 1.0f;
        this.a5 = new Paint(2);
        this.b5 = new Rect();
        this.c5 = new RectF();
        this.d5 = new int[4];
        this.e5 = new float[4];
        this.f5 = new float[4];
        this.g5 = new float[ns.P3];
        this.h5 = new float[ns.P3];
        this.i5 = new float[ns.P3];
        this.j5 = new boolean[ns.P3];
        this.p5 = new float[ns.P3];
        this.q5 = new float[ns.P3];
        this.r5 = new float[ns.P3];
        this.s5 = new float[ns.P3];
        this.t5 = new float[ns.P3];
        this.u5 = new float[ns.P3];
        this.v5 = new float[ns.P3];
        this.w5 = new float[ns.P3];
        this.x5 = new float[ns.P3];
        this.y5 = new float[ns.P3];
        this.z5 = new float[ns.P3];
        this.A5 = new float[ns.P3];
        this.B5 = new boolean[ns.P3];
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 1.0f, 0.0f, -16777216, 0, tileMode);
        this.D5 = linearGradient;
        Paint paint5 = new Paint(1);
        this.E5 = paint5;
        paint5.setShader(linearGradient);
        paint5.setXfermode(new PorterDuffXfermode(mode2));
        this.F5 = new Path();
        this.G5 = new TextPaint(65);
        this.K5 = new RectF();
        this.L5 = new RectF();
        this.M5 = new Path();
        this.N5 = new float[7];
        this.P5 = new Matrix();
        this.Q5 = new Matrix();
        this.R5 = new LinearGradient(0.0f, 0.0f, 1.0f, 0.0f, new int[]{16777215, -1, 16777215}, new float[]{0.0f, 0.88f, 1.0f}, tileMode);
        this.S5 = new LongSparseArray();
        this.T5 = new Path();
        this.V5 = new RectF();
        this.W5 = new RectF();
        this.X5 = new RectF();
        this.Y5 = new LinearGradient(0.0f, 0.0f, 1.0f, 0.0f, 16777215, -1, tileMode);
        this.Z5 = new LinearGradient(0.0f, 0.0f, 1.0f, 0.0f, -1, 16777215, tileMode);
        this.a6 = new Matrix();
        this.b6 = new Paint();
        this.m6 = 0.85f;
        this.o6 = new float[ns.r5];
        Paint paint6 = new Paint();
        this.p6 = paint6;
        PorterDuff.Mode mode3 = PorterDuff.Mode.DST_IN;
        paint6.setXfermode(new PorterDuffXfermode(mode3));
        this.q6 = 1.0f;
        this.r6 = true;
        this.v6 = -1.0f;
        this.w6 = -1;
        this.y6 = new SparseIntArray();
        this.z6 = -1;
        this.C6 = -1;
        this.D6 = new SweepGradient[4];
        this.P6 = new u0(this);
        this.X6 = new Matrix();
        this.Y6 = new Path();
        this.Z6 = new RectF();
        this.a7 = new Path();
        this.b7 = new Path();
        this.c7 = -1;
        this.d7 = new RectF();
        this.e7 = new Matrix();
        this.f7 = new SparseArray();
        this.h7 = new RectF();
        this.i7 = new RectF();
        this.j7 = new RectF();
        this.k7 = new RectF();
        this.l7 = new RectF();
        this.o7 = 1.0f;
        this.p7 = 1.0f;
        this.s7 = 1.0f;
        this.t7 = 1.0f;
        this.v7 = new RectF();
        this.A7 = new RectF();
        LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, new int[]{0, 805306368, -1627389952, -285212672, -16777216}, new float[]{0.0f, 0.25f, 0.5f, 0.75f, 1.0f}, tileMode);
        this.B7 = linearGradient2;
        Paint paint7 = new Paint();
        this.C7 = paint7;
        paint7.setXfermode(new PorterDuffXfermode(mode3));
        paint7.setShader(linearGradient2);
        this.D7 = new Matrix();
        this.E7 = new RectF[]{new RectF(), new RectF(), new RectF(), new RectF(), new RectF(), new RectF()};
        this.F7 = -1.0f;
        this.G7 = -1.0f;
        this.J7 = new RectF();
        this.K7 = new HashMap();
        this.L7 = new HashMap();
        this.M7 = -1;
        this.N7 = H9;
        this.Q7 = -1;
        this.R7 = -1;
        this.V7 = org.telegram.messenger.g0.L(20.17f);
        this.W7 = -1;
        this.Y7 = -1L;
        this.Z7 = 1.0f;
        this.a8 = new RectF();
        this.b8 = new TextPaint(1);
        this.c8 = new TextPaint(1);
        this.d8 = new TextPaint(1);
        TextPaint textPaint2 = new TextPaint(ns.N1);
        this.f8 = textPaint2;
        textPaint2.setXfermode(new PorterDuffXfermode(mode2));
        this.j8 = hd.M0(2131746492, null);
        this.k8 = hd.M0(2131746502, null);
        int[] iArr = a.b;
        this.s8 = new LinearGradient[iArr.length];
        this.t8 = new int[iArr.length];
        this.u8 = new b1(0);
        this.v8 = -100;
        this.w8 = -100;
        this.z8 = new RectF[]{new RectF(), new RectF(), new RectF()};
        this.J8 = new Path();
        this.K8 = new RectF();
        this.L8 = new RectF();
        this.M8 = new RectF();
        this.R8 = new Paint(3);
        this.S8 = new Paint(1);
        this.T8 = new RectF();
        this.d9 = -1.0f;
        this.l9 = new OverScroller(getContext());
        this.m9 = ViewConfiguration.get(getContext());
        this.q9 = new Runnable(this) { // from class: ci.s0
            public final /* synthetic */ z0 b;

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
                        z0 z0Var = this.b;
                        ArrayList arrayList = z0Var.w1;
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
                                    z0Var.g0(tL_starGiftUnique.id, document);
                                }
                            }
                            z0Var.m1(tL_starGiftUnique);
                        }
                        break;
                    default:
                        z0 z0Var2 = this.b;
                        ArrayList arrayList3 = z0Var2.J;
                        if (z0Var2.g1 >= 0.5f && z0Var2.i1 == 1 && !z0Var2.p9) {
                            float f10 = z0Var2.i9;
                            float f11 = z0Var2.j9;
                            float width = (z0Var2.getWidth() - org.telegram.messenger.g0.L(28.0f)) / 6.0f;
                            float f12 = z0Var2.k1 + f11;
                            RectF rectF = z0Var2.v7;
                            float L2 = f12 - (rectF.top + org.telegram.messenger.g0.L(16.0f));
                            int i14 = -1;
                            if (L2 >= 0.0f && f10 >= org.telegram.messenger.g0.L(14.0f) && f11 >= rectF.top + org.telegram.messenger.g0.L(8.0f) && (L = (((int) (L2 / width)) * 6) + ((int) ((f10 - org.telegram.messenger.g0.L(14.0f)) / width))) >= 0 && L < 36) {
                                i14 = L;
                            }
                            if (i14 >= 0) {
                                String[] strArr = z0.C9;
                                if (arrayList3.contains(strArr[i14]) && (lastIndexOf = arrayList3.lastIndexOf(strArr[i14])) >= 0) {
                                    arrayList3.remove(lastIndexOf);
                                    z0Var2.c();
                                    z0Var2.i0();
                                    break;
                                }
                            }
                        }
                        break;
                }
            }
        };
        this.r9 = new RippleDrawable[12];
        ColorStateList.valueOf(738197503);
        ColorStateList.valueOf(335544320);
        this.s9 = -1;
        this.t9 = new Paint(1);
        this.u9 = new Path();
        this.v9 = new float[12];
        this.w9 = new float[12];
        this.x9 = new long[12];
        this.y9 = new long[12];
        this.z9 = new float[12];
        this.A9 = new float[12];
        this.B9 = new Rect[12];
        for (int i12 = 0; i12 < 12; i12++) {
            this.B9[i12] = new Rect();
        }
        this.b = i7;
        this.d = str;
        this.f = str2;
        this.h = z10;
        this.c = cVar;
        this.M1 = w(R.drawable.msg_share);
        this.N1 = w(R.drawable.msg_download);
        this.O1 = w(R.drawable.msg_qr_scan);
        this.V1.setTypeface(org.telegram.messenger.g0.o());
        Drawable w10 = w(R.drawable.msg_colors);
        this.P1 = w10;
        Drawable w11 = w(R.drawable.input_smile);
        this.Q1 = w11;
        Drawable w12 = w(R.drawable.menu_gift);
        this.R1 = w12;
        this.X1 = new x1(true);
        this.S1 = w(R.drawable.msg_retry);
        this.T1 = w(R.drawable.msg_recent);
        this.U1 = new a1();
        this.K1 = w(R.drawable.msg_copy);
        this.L1 = w(R.drawable.menu_premium_main);
        this.g7 = new Drawable[]{w10, w11, w12};
        ch0 ch0Var = new ch0(R.raw.plane_logo_plain, org.telegram.messenger.g0.L(60.0f), org.telegram.messenger.g0.L(60.0f), false, null);
        this.Y1 = ch0Var;
        ch0Var.R(this);
        ch0Var.K(1);
        ch0Var.setCallback(this);
        ch0Var.start();
        Paint paint8 = this.Z1;
        Paint.Style style = Paint.Style.STROKE;
        paint8.setStyle(style);
        this.Z1.setStrokeCap(Paint.Cap.ROUND);
        this.Z1.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.D1.setTextSize(org.telegram.messenger.g0.L(11.0f));
        this.E1.setTypeface(org.telegram.messenger.g0.o());
        this.B1.setStyle(style);
        g6 g6Var = new g6(false, true, true);
        this.M0 = g6Var;
        g6Var.w(org.telegram.messenger.g0.L(11.0f));
        g6Var.n(0.35f, 280L, er.h);
        g6Var.setCallback(this);
        g6Var.b = 3;
        x0 t6 = t(H9);
        this.n = t6;
        this.c7 = W0(t6.c);
        if (str != null) {
            String str3 = this.d;
            if (!str3.equals(K9) || (eVar = L9) == null) {
                e c10 = f.c(str3, org.telegram.messenger.g0.L(240.0f), gc.c.c, 0.75f, null);
                this.u0 = c10;
                L9 = c10;
                K9 = str3;
            } else {
                this.u0 = eVar;
            }
            this.t0.a(this.u0);
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
        return e2.x(f11, f12, f12, ((f11 + 1.0f) * f12 * f12 * f12) + 1.0f);
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

    public static float f1(boolean z10, boolean z11, float f10) {
        if (!z10) {
            if (!z11) {
                f10 -= 0.135f;
            }
            if (f10 <= 0.0f) {
                return 0.0f;
            }
            if (f10 < 0.315f) {
                return h(f10 / 0.315f);
            }
        } else if (f10 > 0.0f) {
            return org.telegram.ui.Cells.y0.z(f10, 0.18f, 1.0f, 0.0f);
        }
        return 1.0f;
    }

    public static int g(float f10, int i7) {
        return (((int) (Math.max(0.0f, Math.min(1.0f, f10)) * 255.0f)) << 24) | (i7 & 16777215);
    }

    public static float g1(float f10, float f11, float f12) {
        float l10 = Utilities.l((f12 - f10) / (f11 - f10));
        return e2.C(l10, 2.0f, 3.0f, l10 * l10);
    }

    public static float h(float f10) {
        float f11 = f10 - 1.0f;
        return e2.x(f11, 1.70158f, f11, (2.70158f * f11 * f11 * f11) + 1.0f);
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
        return v.f() && qc.e(256);
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
            return org.telegram.messenger.g0.T1(f10 + 1.0f, 1.0f - f11, e2.C(f12, 2.0f, 3.0f, f12 * f12));
        }
        float f13 = (currentAnimationTimeMillis - 0.6f) / 0.4f;
        return org.telegram.messenger.g0.T1(1.0f - f11, 1.0f, e2.C(f13, 2.0f, 3.0f, f13 * f13));
    }

    public static void k() {
        if (E9 != null) {
            return;
        }
        int length = a.b.length;
        E9 = new int[length];
        F9 = new int[length];
        G9 = new int[length];
        for (int i7 = 0; i7 < length; i7++) {
            E9[i7] = x(a.b[i7], false);
            F9[i7] = x(a.c[i7], true);
            G9[i7] = v(E9[i7], F9[i7]);
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

    public static boolean m0(float f10, float f11, RectF rectF) {
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
            iArr[i13] = ((((iArr[i13] >>> 24) * i12) / ns.e4) << 24) | i11;
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

    public static Bitmap r0(w0 w0Var, Bitmap bitmap, boolean z10) {
        if (z10) {
            Bitmap bitmap2 = w0Var.m;
            if (bitmap2 == null || w0Var.n != bitmap || w0Var.p != w0Var.j) {
                w0Var.m = q0(bitmap, bitmap2, w0Var.j);
                w0Var.n = bitmap;
                w0Var.p = w0Var.j;
            }
            return w0Var.m;
        }
        Bitmap bitmap3 = w0Var.k;
        if (bitmap3 == null || w0Var.l != bitmap || w0Var.o != w0Var.j) {
            w0Var.k = q0(bitmap, bitmap3, w0Var.j);
            w0Var.l = bitmap;
            w0Var.o = w0Var.j;
        }
        return w0Var.k;
    }

    public static void s(int[] iArr, byte[] bArr, int i7) {
        int i10 = 16777215 & i7;
        int i11 = i7 >>> 24;
        for (int i12 = 0; i12 < iArr.length; i12++) {
            iArr[i12] = ((((bArr[i12] & ns.e4) * i11) / ns.e4) << 24) | i10;
        }
    }

    private void setPattern(w0 w0Var) {
        if (!this.g2) {
            w0Var.h = this.s < 1.0f && this.r != null;
            if (w0Var.a == 2) {
                Z(w0Var);
                if (w0Var.e == null) {
                    w0Var.f = this.h2;
                }
            }
            w0 w0Var2 = this.H;
            if (w0Var2 != null && w0Var2 != this.G) {
                P0(w0Var2);
            }
            this.H = this.G;
            this.G = w0Var;
            this.I = AnimationUtils.currentAnimationTimeMillis();
            invalidate();
            return;
        }
        w0 w0Var3 = this.H;
        if (w0Var3 != null && w0Var3 != this.G) {
            P0(w0Var3);
        }
        w0 w0Var4 = this.G;
        if (w0Var4 != w0Var) {
            P0(w0Var4);
        }
        this.H = null;
        this.G = w0Var;
        if (w0Var.a == 2) {
            Z(w0Var);
            if (w0Var.e == null) {
                w0Var.f = this.h2;
            }
        }
        this.I = AnimationUtils.currentAnimationTimeMillis() - 10000;
        invalidate();
    }

    private void setSceneFromCard(x0 x0Var) {
        Y0(x0Var, getWidth() / 2.0f, (l() / 2.0f) + m());
        if (this.g2) {
            return;
        }
        this.q2 = j(this.o2, 0.03f, 0.005f);
        this.o2 = AnimationUtils.currentAnimationTimeMillis();
    }

    public static x0 t(int i7) {
        x0 x0Var = new x0();
        x0Var.a = 0;
        x0Var.f = i7;
        if (i7 == I9) {
            x0Var.b = -12602881;
            x0Var.c = -15308082;
            x0Var.d = a.d[i7];
        } else {
            x0Var.b = x(a.b[i7], false);
            x0Var.c = x(a.c[i7], true);
            x0Var.d = a.d[i7];
        }
        if (i7 == I9) {
            x0Var.e = -16747023;
        } else {
            k();
            x0Var.e = G9[i7];
        }
        x0Var.h = Z0(x0Var.b);
        x0Var.g = f.k(0.5f, x0Var.b, x0Var.c);
        return x0Var;
    }

    public static float t1(float f10, float f11, float f12) {
        float N = (f10 - f12) / org.telegram.messenger.g0.N(1.7f);
        float N2 = f11 / org.telegram.messenger.g0.N(3.2f);
        return org.telegram.messenger.g0.N(3.6f) * (((w1(N * 2.6f, N2 * 1.7f, 91) * 0.32f) + (w1(N, N2, 17) * 0.68f)) - 0.5f);
    }

    public static int u(x0 x0Var) {
        int f10 = x0Var != null ? i0.a.f(0.5f, x0Var.b, x0Var.c) : -16777216;
        double h = x0Var != null ? i0.a.h(x0Var.b) : 0.3d;
        float[] fArr = c1.b;
        float max = (fArr[10] / 100.0f) * ((float) Math.max(0.0d, Math.min(1.0d, (0.85d - h) / 0.45d)));
        float f11 = (fArr[11] / 100.0f) + 1.0f;
        float f12 = ((0.5f - (f11 * 0.5f)) + max) * 255.0f;
        return i0.a.k(x0Var != null ? x0Var.h : TLObject.FLAG_30, i0.a.k(g((fArr[3] + fArr[9]) / 100.0f, 16777215), Color.rgb(Math.max(0, Math.min(ns.e4, Math.round((Color.red(f10) * f11) + f12))), Math.max(0, Math.min(ns.e4, Math.round((Color.green(f10) * f11) + f12))), Math.max(0, Math.min(ns.e4, Math.round((f11 * Color.blue(f10)) + f12))))));
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
        float C = e2.C(f11, 2.0f, 3.0f, f11 * f11);
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
        float C = e2.C(f12, 2.0f, 3.0f, f12 * f12);
        float C2 = e2.C(f13, 2.0f, 3.0f, f13 * f13);
        float k02 = k0(floor, floor2, i7);
        int i10 = floor + 1;
        float k03 = k0(i10, floor2, i7);
        int i11 = floor2 + 1;
        float k04 = k0(floor, i11, i7);
        float k05 = k0(i10, i11, i7);
        float z10 = e2.z(k03, k02, C, k02);
        return (((((k05 - k04) * C) + k04) - z10) * C2) + z10;
    }

    public static int x(int i7, boolean z10) {
        double[] dArr = new double[3];
        i0.a.j(i7, dArr);
        if (!z10) {
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

    public static PorterDuffColorFilter x0(w0 w0Var) {
        float[] fArr = c1.b;
        int i7 = ((int) (fArr[14] * 10.0f)) ^ w0Var.s;
        if (w0Var.u == null || w0Var.t != i7) {
            w0Var.t = i7;
            w0Var.u = new PorterDuffColorFilter(i0.a.f(fArr[14] / 100.0f, w0Var.s, -1), PorterDuff.Mode.SRC_IN);
        }
        return w0Var.u;
    }

    public static float y1(float f10) {
        return 1.0f - ((float) Math.pow(1.0f - f10, 2.4000000953674316d));
    }

    /* JADX WARN: Code restructure failed: missing block: B:255:0x024e, code lost:
    
        if (r4 > 1500) goto L50;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x06de  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x084b  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0a4f  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x06d8  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x080b  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x044c  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0603  */
    /* JADX WARN: Type inference failed for: r5v40 */
    /* JADX WARN: Type inference failed for: r5v41, types: [int] */
    /* JADX WARN: Type inference failed for: r5v71 */
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
        int i16;
        int i17;
        float[] fArr;
        float[] fArr2;
        float[] fArr3;
        float f17;
        int i18;
        float pow;
        float[] fArr4;
        int i19;
        int i20;
        float[] fArr5;
        RectF rectF;
        float f18;
        char c10;
        float f19;
        boolean z10;
        char c11;
        int i21;
        boolean[] zArr;
        char c12;
        float f20;
        int i22;
        float d;
        float f21;
        Canvas canvas2 = canvas;
        canvas2.save();
        float T1 = this.R4 >= 1.0f ? 1.0f : this.U4 ? org.telegram.messenger.g0.T1(0.9f, 1.0f, this.V4) : org.telegram.messenger.g0.T1(0.92f, 1.0f, this.V4);
        float l11 = 1.0f - (this.o2 == 0 ? 1.0f : Utilities.l((AnimationUtils.currentAnimationTimeMillis() - this.o2) / 320.0f));
        float j3 = (((this.q2 - 1.0f) * l11 * l11) + j(this.o2, 0.03f, 0.005f)) * T1;
        if (this.s0 != 0) {
            float currentAnimationTimeMillis = (AnimationUtils.currentAnimationTimeMillis() - this.s0) / 360.0f;
            if (currentAnimationTimeMillis >= 1.0f) {
                this.s0 = 0L;
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
        this.G1.set(f23, m10, f24, f25);
        this.C1.setColor(-1);
        RectF rectF2 = this.G1;
        int o4 = i0.a.o(i0.a.f(0.4f, N0(), -16777216), 16);
        Bitmap bitmap2 = this.X4;
        float f26 = 4.0f;
        int i23 = 3;
        if (bitmap2 == null) {
            K0();
            i10 = 0;
            i11 = 1;
        } else {
            i10 = 0;
            byte[] bArr = O9;
            int i24 = P9;
            i11 = 1;
            if (o4 != this.Z4) {
                this.Z4 = o4;
                s(this.Y4, bArr, o4);
                bitmap2.setPixels(this.Y4, 0, i24, 0, 0, i24, i24);
                bitmap = bitmap2;
            } else {
                bitmap = bitmap2;
            }
            float f27 = Q9 * 4.0f;
            float f28 = R9 * 4.0f;
            float L = org.telegram.messenger.g0.L(4.0f);
            int[] iArr = this.d5;
            iArr[0] = 0;
            int i25 = R9;
            iArr[1] = i25;
            iArr[2] = i24 - i25;
            iArr[3] = i24;
            float[] fArr6 = this.e5;
            float f29 = rectF2.left - f27;
            fArr6[0] = f29;
            fArr6[1] = f29 + f28;
            float f30 = rectF2.right + f27;
            fArr6[3] = f30;
            fArr6[2] = f30 - f28;
            float[] fArr7 = this.f5;
            float f31 = (rectF2.top - f27) + L;
            fArr7[0] = f31;
            fArr7[1] = f31 + f28;
            float f32 = rectF2.bottom + f27 + L;
            fArr7[3] = f32;
            fArr7[2] = f32 - f28;
            for (int i26 = 0; i26 < i23; i26++) {
                int i27 = 0;
                while (i27 < i23) {
                    Rect rect = this.b5;
                    int[] iArr2 = this.d5;
                    int i28 = i27 + 1;
                    int i29 = i23;
                    int i30 = i26 + 1;
                    rect.set(iArr2[i27], iArr2[i26], iArr2[i28], iArr2[i30]);
                    RectF rectF3 = this.c5;
                    float[] fArr8 = this.e5;
                    float f33 = fArr8[i27];
                    float[] fArr9 = this.f5;
                    rectF3.set(f33, fArr9[i26], fArr8[i28], fArr9[i30]);
                    canvas2.drawBitmap(bitmap, this.b5, this.c5, this.a5);
                    i27 = i28;
                    i23 = i29;
                }
            }
        }
        int i31 = i23;
        canvas2.drawRoundRect(this.G1, org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(30.0f), this.C1);
        this.t0.r.set(f23, m10, f24, f25);
        int N0 = N0();
        float f34 = 0.7f * width;
        float f35 = (width - f34) / 2.0f;
        float f36 = f23 + f35;
        float T12 = org.telegram.messenger.g0.T1(width * 0.12f, f35, this.D2) + m10;
        f fVar = this.t0;
        if (fVar.y != N0 || fVar.z == null) {
            fVar.y = N0;
            fVar.z = new PorterDuffColorFilter(N0, PorterDuff.Mode.SRC_IN);
        }
        this.t0.e(canvas2, f36, T12, f34);
        f fVar2 = this.t0;
        float f37 = (fVar2.m == null ? 0.0f : (r13.l * f34) / r13.b) / 2.0f;
        float f38 = f34 / 2.0f;
        float f39 = f36 + f38;
        float f40 = f38 + T12;
        if (fVar2.q == 2) {
            Math.max(0.0f, fVar2.o);
        }
        float T = T(1.0f);
        canvas2.save();
        canvas2.scale(T, T, f39, f40);
        this.A1.setColor(N0);
        canvas2.drawCircle(f39, f40, f37, this.A1);
        f fVar3 = this.t0;
        if (fVar3.q == 2) {
            f10 = 30.0f;
            i12 = 2;
            if (fVar3.p == 0) {
                currentTimeMillis = -1;
                f11 = 0.12f;
            } else {
                f11 = 0.12f;
                currentTimeMillis = System.currentTimeMillis() - fVar3.p;
            }
            l10 = (!this.U2 || currentTimeMillis == Long.MAX_VALUE) ? 1.0f : currentTimeMillis < 0 ? 0.0f : Utilities.l(currentTimeMillis / 500.0f);
            if (l10 < 1.0f) {
                f12 = T12;
                x10 = 1.0f;
            } else {
                f12 = T12;
                x10 = e2.x((float) Math.sin(l10 * 3.141592653589793d), 0.015f, l10, 1.0f - ((float) Math.pow(1.0f - l10, 3.0d)));
            }
            if (x10 <= 0.004f) {
                canvas2.save();
                this.F5.rewind();
                f13 = 0.004f;
                this.F5.addCircle(f39, f40, f37, Path.Direction.CW);
                canvas2.clipPath(this.F5);
                float min = (1.0f - Math.min(1.0f, x10)) * f37 * 0.55f;
                float f41 = (x10 * 0.5f) + 0.5f;
                canvas2.translate(-min, min);
                canvas2.scale(f41, f41, f39, f40);
                if (!this.U2 || this.S2 == null) {
                    this.Y1.setAlpha((int) (Utilities.l(l10 * 2.0f) * 255.0f));
                    this.Y1.setBounds((int) (f39 - f37), (int) (f40 - f37), (int) (f39 + f37), (int) (f40 + f37));
                    this.Y1.draw(canvas2);
                    this.Y1.setAlpha(ns.e4);
                } else {
                    this.d7.set(f39 - f37, f40 - f37, f39 + f37, f40 + f37);
                    canvas2.drawBitmap(this.S2, (Rect) null, this.d7, this.T2);
                }
                canvas2.restore();
            } else {
                f13 = 0.004f;
            }
            canvas2.restore();
            i13 = (int) width;
            textPaint = this.G5;
            staticLayout = this.I5;
            if (staticLayout == null && this.J5 == i13) {
                f14 = f34;
            } else {
                this.J5 = i13;
                str = this.f;
                if (str == null) {
                    str = "";
                }
                String upperCase = str.toUpperCase();
                textPaint.setTypeface(org.telegram.messenger.g0.o1("fonts/rcondensedbold.ttf"));
                int L2 = i13 - (org.telegram.messenger.g0.L(20.0f) * i12);
                this.I5 = null;
                i14 = i10;
                while (i14 <= i12) {
                    if (i14 == 0) {
                        this.H5 = w(R.drawable.qr_at_large);
                        textPaint.setTextSize(org.telegram.messenger.g0.L(f10));
                    } else if (i14 == i11) {
                        this.H5 = w(R.drawable.qr_at_medium);
                        textPaint.setTextSize(org.telegram.messenger.g0.L(25.0f));
                    } else {
                        this.H5 = w(R.drawable.qr_at_small);
                        textPaint.setTextSize(org.telegram.messenger.g0.L(19.0f));
                    }
                    Drawable drawable = this.H5;
                    int i32 = i10;
                    drawable.setBounds(i32, i32, drawable.getIntrinsicWidth(), this.H5.getIntrinsicHeight());
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.h ? r.b.k(" ", upperCase) : upperCase);
                    if (this.h) {
                        f14 = f34;
                        spannableStringBuilder.setSpan(new t6(this.H5), 0, 1, 33);
                    } else {
                        f14 = f34;
                    }
                    float width2 = this.h ? this.H5.getBounds().width() : 0;
                    float measureText = textPaint.measureText(spannableStringBuilder, this.h ? 1 : 0, spannableStringBuilder.length()) + width2;
                    if (i14 > 1 || measureText <= L2) {
                        int i33 = measureText > ((float) L2) ? 2 : 1;
                        int L3 = i33 > 1 ? org.telegram.messenger.g0.L(2.0f) + (((int) (measureText + width2)) / 2) : L2;
                        if (L3 > L2) {
                            L3 = org.telegram.messenger.g0.L(4.0f) + (((int) (measureText + width2)) / 3);
                            i15 = i31;
                        } else {
                            i15 = i33;
                        }
                        int i34 = L3;
                        this.I5 = ou0.c(spannableStringBuilder, textPaint, i34, Layout.Alignment.ALIGN_CENTER, 0.0f, null, Math.min(org.telegram.messenger.g0.L(10.0f) + i34, i13), i15, true);
                        staticLayout = this.I5;
                    } else {
                        i14++;
                        f34 = f14;
                        i12 = 2;
                        i10 = 0;
                        i11 = 1;
                    }
                }
                f14 = f34;
                staticLayout = this.I5;
            }
            staticLayout2 = staticLayout;
            if (staticLayout2 == null) {
                this.G5.setColor(N0);
                this.H5.setColorFilter(n1(N0));
                float descent = (this.G5.descent() - this.G5.ascent()) * staticLayout2.getLineCount();
                float f42 = f12 + f14;
                boolean z11 = this.o5 && !this.U2;
                float f43 = this.D2;
                float f44 = z11 ? f43 < 0.999f ? 1.0f : 0.0f : 1.0f - f43;
                f15 = 36.0f;
                float A = e2.A(width, staticLayout2.getWidth(), 2.0f, f23);
                float L4 = ((((f25 - f42) - descent) / 2.0f) + f42) - org.telegram.messenger.g0.L(4.0f);
                if (z11) {
                    c10 = 26214;
                    if (this.n5 != staticLayout2) {
                        Random random = this.f1;
                        this.n5 = staticLayout2;
                        f19 = 0.82f;
                        this.k5 = 0;
                        int max = Math.max(1, staticLayout2.getWidth());
                        f16 = 1.6f;
                        int max2 = Math.max(1, staticLayout2.getHeight());
                        Bitmap createBitmap = Bitmap.createBitmap(max, max2, Bitmap.Config.ALPHA_8);
                        staticLayout2.draw(new Canvas(createBitmap));
                        int[] iArr3 = new int[max];
                        int max3 = Math.max(2, org.telegram.messenger.g0.L(2.0f));
                        int i35 = max3 / 2;
                        f18 = descent;
                        int i36 = max;
                        int i37 = i35;
                        int i38 = 0;
                        int i39 = 0;
                        while (i37 < max2) {
                            int i40 = i37;
                            Bitmap bitmap3 = createBitmap;
                            bitmap3.getPixels(iArr3, 0, i36, 0, i40, i36, 1);
                            int i41 = i36;
                            int i42 = i35;
                            int i43 = i39;
                            while (i42 < i41) {
                                int i44 = i38;
                                int i45 = max3;
                                if ((iArr3[i42] >>> 24) < 96) {
                                    i38 = i44;
                                } else {
                                    i38 = i44 + 1;
                                    if (i42 < max) {
                                        max = i42;
                                    }
                                    if (i42 > i43) {
                                        i43 = i42;
                                    }
                                }
                                i42 += i45;
                                max3 = i45;
                            }
                            int i46 = max3;
                            i37 = i40 + i46;
                            i38 = i38;
                            i36 = i41;
                            i39 = i43;
                            createBitmap = bitmap3;
                            max3 = i46;
                        }
                        int i47 = max3;
                        Bitmap bitmap4 = createBitmap;
                        int i48 = i36;
                        if (i38 == 0) {
                            bitmap4.recycle();
                            this.l5 = 0.0f;
                            this.m5 = i48;
                            z10 = false;
                            if (f44 > f13) {
                                canvas2.save();
                                canvas2.translate(A, L4);
                                float T2 = T(f44);
                                canvas2.scale(T2, T2, staticLayout2.getWidth() / 2.0f, f18 / 2.0f);
                                if (z11) {
                                    float f45 = -org.telegram.messenger.g0.L(8.0f);
                                    float f46 = -org.telegram.messenger.g0.L(4.0f);
                                    float L5 = org.telegram.messenger.g0.L(8.0f) + staticLayout2.getWidth();
                                    float L6 = org.telegram.messenger.g0.L(4.0f) + staticLayout2.getHeight();
                                    c11 = c10;
                                    float f47 = f19;
                                    i21 = ns.P3;
                                    canvas2.saveLayer(f45, f46, L5, L6, null);
                                    staticLayout2.draw(canvas2);
                                    float f48 = this.D2 * 1.12f;
                                    float f49 = this.l5;
                                    float f50 = this.m5;
                                    float f51 = (((f48 - 0.18f) * f50) / f47) + f49;
                                    this.F.setScale(Math.max(1.0f, a8.p0.f(f50, f48, f47, f49) - f51), 1.0f);
                                    this.F.postTranslate(f51, 0.0f);
                                    this.D5.setLocalMatrix(this.F);
                                    canvas2.drawRect(-org.telegram.messenger.g0.L(8.0f), -org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(8.0f) + staticLayout2.getWidth(), org.telegram.messenger.g0.L(4.0f) + staticLayout2.getHeight(), this.E5);
                                    canvas.restore();
                                    canvas2 = canvas;
                                } else {
                                    c11 = c10;
                                    i21 = ns.P3;
                                    if (f44 < 1.0f) {
                                        canvas2 = canvas;
                                        canvas2.saveLayerAlpha(0.0f, -org.telegram.messenger.g0.L(4.0f), staticLayout2.getWidth(), f18 + org.telegram.messenger.g0.L(4.0f), (int) (f44 * 255.0f));
                                    } else {
                                        canvas2 = canvas;
                                    }
                                    staticLayout2.draw(canvas2);
                                    if (f44 < 1.0f) {
                                        canvas2.restore();
                                    }
                                }
                                canvas2.restore();
                            } else {
                                c11 = c10;
                                i21 = ns.P3;
                            }
                            if (z11) {
                                boolean[] zArr2 = this.j5;
                                Random random2 = this.f1;
                                float f52 = this.D2 * 1.12f;
                                for (?? r52 = z10; r52 < this.k5; r52++) {
                                    boolean z12 = this.i5[r52] < f52 ? true : z10;
                                    if (!z12 || zArr2[r52] || this.F2 != 1.0f || (i22 = this.C5) >= i21) {
                                        zArr = zArr2;
                                        c12 = c11;
                                        f20 = f26;
                                    } else {
                                        this.C5 = i22 + 1;
                                        boolean z13 = random2.nextFloat() < f11 ? true : z10;
                                        float[] fArr10 = this.p5;
                                        float[] fArr11 = this.u5;
                                        float nextFloat = ((random2.nextFloat() - 0.5f) * org.telegram.messenger.g0.L(2.0f)) + this.g5[r52] + A;
                                        fArr11[i22] = nextFloat;
                                        fArr10[i22] = nextFloat;
                                        float[] fArr12 = this.q5;
                                        float[] fArr13 = this.v5;
                                        zArr = zArr2;
                                        float nextFloat2 = ((random2.nextFloat() - 0.5f) * org.telegram.messenger.g0.L(2.0f)) + this.h5[r52] + L4;
                                        fArr13[i22] = nextFloat2;
                                        fArr12[i22] = nextFloat2;
                                        this.r5[i22] = ((random2.nextFloat() - 0.5f) * org.telegram.messenger.g0.L(36.0f)) + org.telegram.messenger.g0.L(6.0f);
                                        this.s5[i22] = -((random2.nextFloat() * org.telegram.messenger.g0.L(36.0f)) + org.telegram.messenger.g0.L(18.0f));
                                        this.t5[i22] = -((random2.nextFloat() * org.telegram.messenger.g0.L(70.0f)) + org.telegram.messenger.g0.L(60.0f));
                                        float[] fArr14 = this.w5;
                                        if (z13) {
                                            d = org.telegram.ui.Cells.y0.d(0.8f, random2.nextFloat(), org.telegram.messenger.g0.N(f16));
                                            c12 = 26214;
                                        } else {
                                            c12 = 26214;
                                            d = org.telegram.ui.Cells.y0.d(1.3f, random2.nextFloat(), org.telegram.messenger.g0.N(1.2f));
                                        }
                                        fArr14[i22] = d;
                                        this.x5[i22] = org.telegram.ui.Cells.y0.g(random2, 0.4f, 0.6f);
                                        this.y5[i22] = 0.0f;
                                        f20 = f26;
                                        this.z5[i22] = org.telegram.ui.Cells.y0.g(random2, 3.0f, f20);
                                        this.A5[i22] = random2.nextFloat() * 6.2832f;
                                        this.B5[i22] = z13;
                                    }
                                    zArr[r52] = z12;
                                    f26 = f20;
                                    c11 = c12;
                                    zArr2 = zArr;
                                    i21 = ns.P3;
                                }
                            }
                        } else {
                            this.l5 = max;
                            this.m5 = Math.max(1, i39 - max);
                            float min2 = Math.min(1.0f, Math.max(80, Math.min(ns.e3, (int) (r6 / org.telegram.messenger.g0.N(1.3f)))) / i38);
                            int i49 = i35;
                            while (i49 < max2) {
                                bitmap4.getPixels(iArr3, 0, i48, 0, i49, i48, 1);
                                int i50 = i35;
                                while (i50 < i48 && this.k5 < 240) {
                                    if ((iArr3[i50] >>> 24) < 96 || random.nextFloat() > min2) {
                                        f21 = min2;
                                    } else {
                                        int i51 = this.k5;
                                        this.k5 = i51 + 1;
                                        f21 = min2;
                                        float f53 = i50;
                                        this.g5[i51] = f53;
                                        this.h5[i51] = i49;
                                        this.i5[i51] = org.telegram.ui.Cells.y0.g(random, 0.18f, ((f53 - this.l5) * 0.82f) / this.m5);
                                        this.j5[i51] = false;
                                    }
                                    i50 += i47;
                                    min2 = f21;
                                }
                                i49 += i47;
                                min2 = min2;
                            }
                            z10 = false;
                            bitmap4.recycle();
                            if (f44 > f13) {
                            }
                            if (z11) {
                            }
                        }
                    } else {
                        f18 = descent;
                    }
                } else {
                    f18 = descent;
                    c10 = 26214;
                }
                f19 = 0.82f;
                f16 = 1.6f;
                z10 = false;
                if (f44 > f13) {
                }
                if (z11) {
                }
            } else {
                f15 = 36.0f;
                f16 = 1.6f;
            }
            if (!this.U2 && (i16 = this.C5) > 0) {
                RectF rectF4 = this.G1;
                boolean[] zArr3 = this.B5;
                float[] fArr15 = this.A5;
                float[] fArr16 = this.z5;
                float[] fArr17 = this.w5;
                float[] fArr18 = this.v5;
                float[] fArr19 = this.u5;
                float[] fArr20 = this.t5;
                float[] fArr21 = this.x5;
                float[] fArr22 = this.q5;
                float[] fArr23 = this.p5;
                float[] fArr24 = this.y5;
                Paint paint = this.A1;
                float[] fArr25 = this.s5;
                float[] fArr26 = this.r5;
                float f54 = this.Y2 * 0.016667f;
                i17 = i16 - 1;
                while (i17 >= 0) {
                    float f55 = fArr24[i17] + f54;
                    fArr24[i17] = f55;
                    if (f55 >= fArr21[i17]) {
                        fArr = fArr15;
                        int i52 = this.C5 - 1;
                        this.C5 = i52;
                        fArr23[i17] = fArr23[i52];
                        fArr22[i17] = fArr22[i52];
                        fArr26[i17] = fArr26[i52];
                        fArr25[i17] = fArr25[i52];
                        fArr20[i17] = fArr20[i52];
                        fArr19[i17] = fArr19[i52];
                        fArr18[i17] = fArr18[i52];
                        fArr17[i17] = fArr17[i52];
                        fArr21[i17] = fArr21[i52];
                        fArr24[i17] = fArr24[i52];
                        fArr16[i17] = fArr16[i52];
                        fArr[i17] = fArr[i52];
                        zArr3[i17] = zArr3[i52];
                        rectF = rectF4;
                        f17 = f54;
                        fArr2 = fArr16;
                        fArr3 = fArr17;
                        fArr4 = fArr18;
                        fArr5 = fArr19;
                        i19 = N0;
                    } else {
                        fArr = fArr15;
                        fArr25[i17] = (fArr20[i17] * f54) + fArr25[i17];
                        fArr2 = fArr16;
                        fArr3 = fArr17;
                        fArr26[i17] = e2.C(f54, f16, 1.0f, fArr26[i17]);
                        fArr25[i17] = e2.C(f54, 0.8f, 1.0f, fArr25[i17]);
                        fArr23[i17] = (fArr26[i17] * f54) + fArr23[i17];
                        float f56 = (fArr25[i17] * f54) + fArr22[i17];
                        fArr22[i17] = f56;
                        float f57 = fArr23[i17] - fArr19[i17];
                        float f58 = f56 - fArr18[i17];
                        float f59 = (f58 * f58) + (f57 * f57);
                        int i53 = N0;
                        float sqrt = (float) Math.sqrt(f59);
                        float f60 = fArr24[i17] / fArr21[i17];
                        if (f60 < 0.08f) {
                            pow = f60 / 0.08f;
                            f17 = f54;
                            i18 = i53;
                        } else {
                            f17 = f54;
                            i18 = i53;
                            pow = (float) Math.pow(k5.y(f60, 0.08f, 0.92f, 1.0f), 0.550000011920929d);
                        }
                        float exp = pow * ((float) Math.exp((-sqrt) / org.telegram.messenger.g0.L(90.0f)));
                        float min3 = (1.0f - (Math.min(1.0f, sqrt / org.telegram.messenger.g0.L(90.0f)) * 0.4f)) * (fArr3[i17] / 2.0f);
                        float hypot = (float) Math.hypot(fArr26[i17], fArr25[i17]);
                        float f61 = fArr23[i17];
                        float f62 = fArr22[i17];
                        if (hypot > 1.0f) {
                            float sin = ((float) Math.sin((fArr24[i17] * fArr2[i17]) + fArr[i17])) * org.telegram.messenger.g0.L(3.0f);
                            f61 = e2.c(-fArr25[i17], hypot, sin, f61);
                            f62 = e2.c(fArr26[i17], hypot, sin, f62);
                        }
                        fArr4 = fArr18;
                        float min4 = Math.min(1.0f, Math.max(Math.max(rectF4.left - f61, Math.max(0.0f, f61 - rectF4.right)), Math.max(rectF4.top - f62, Math.max(0.0f, f62 - rectF4.bottom))) / org.telegram.messenger.g0.L(f15));
                        if (min4 > 0.0f) {
                            i19 = i18;
                            i20 = f.k(min4, i19, -1);
                        } else {
                            i19 = i18;
                            i20 = i19;
                        }
                        paint.setColor(i20);
                        paint.setAlpha((int) (exp * 255.0f));
                        float min5 = Math.min(1.8f, (hypot / org.telegram.messenger.g0.L(220.0f)) + 1.0f);
                        canvas2.save();
                        fArr5 = fArr19;
                        rectF = rectF4;
                        canvas2.rotate((float) Math.toDegrees(Math.atan2(fArr25[i17], fArr26[i17])), f61, f62);
                        float f63 = min3 * min5;
                        this.V5.set(f61 - f63, f62 - min3, f63 + f61, f62 + min3);
                        canvas2.drawOval(this.V5, paint);
                        canvas2.restore();
                        if (zArr3[i17]) {
                            paint.setAlpha((int) (exp * f15));
                            canvas2.drawCircle(f61, f62, 2.2f * min3, paint);
                        }
                    }
                    i17--;
                    N0 = i19;
                    fArr18 = fArr4;
                    fArr15 = fArr;
                    fArr16 = fArr2;
                    fArr17 = fArr3;
                    f54 = f17;
                    fArr19 = fArr5;
                    rectF4 = rectF;
                    f16 = 1.6f;
                }
                if (this.C5 > 0) {
                    invalidate();
                }
            }
            canvas2.restore();
        }
        f10 = 30.0f;
        i12 = 2;
        f11 = 0.12f;
        currentTimeMillis = Long.MAX_VALUE;
        if (this.U2) {
        }
        if (l10 < 1.0f) {
        }
        if (x10 <= 0.004f) {
        }
        canvas2.restore();
        i13 = (int) width;
        textPaint = this.G5;
        staticLayout = this.I5;
        if (staticLayout == null) {
        }
        this.J5 = i13;
        str = this.f;
        if (str == null) {
        }
        String upperCase2 = str.toUpperCase();
        textPaint.setTypeface(org.telegram.messenger.g0.o1("fonts/rcondensedbold.ttf"));
        int L22 = i13 - (org.telegram.messenger.g0.L(20.0f) * i12);
        this.I5 = null;
        i14 = i10;
        while (i14 <= i12) {
        }
        f14 = f34;
        staticLayout = this.I5;
        staticLayout2 = staticLayout;
        if (staticLayout2 == null) {
        }
        if (!this.U2) {
            RectF rectF42 = this.G1;
            boolean[] zArr32 = this.B5;
            float[] fArr152 = this.A5;
            float[] fArr162 = this.z5;
            float[] fArr172 = this.w5;
            float[] fArr182 = this.v5;
            float[] fArr192 = this.u5;
            float[] fArr202 = this.t5;
            float[] fArr212 = this.x5;
            float[] fArr222 = this.q5;
            float[] fArr232 = this.p5;
            float[] fArr242 = this.y5;
            Paint paint2 = this.A1;
            float[] fArr252 = this.s5;
            float[] fArr262 = this.r5;
            float f542 = this.Y2 * 0.016667f;
            i17 = i16 - 1;
            while (i17 >= 0) {
            }
            if (this.C5 > 0) {
            }
        }
        canvas2.restore();
    }

    public final PorterDuffColorFilter A0(w0 w0Var) {
        float[] fArr = c1.b;
        int i7 = ((int) (fArr[30] * 10.0f)) ^ (w0Var.s * 31);
        if (this.l4 == null || this.m4 != i7) {
            this.m4 = i7;
            this.l4 = new PorterDuffColorFilter(i0.a.f(fArr[30] / 100.0f, w0Var.s, -1), PorterDuff.Mode.SRC_IN);
        }
        return this.l4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0094, code lost:
    
        if (r0.C0 > 0.001f) goto L20;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0ada  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0b07  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0b44  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0be6  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0b1c  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0adf  */
    /* JADX WARN: Type inference failed for: r58v1 */
    /* JADX WARN: Type inference failed for: r58v2 */
    /* JADX WARN: Type inference failed for: r58v3 */
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
        float f16;
        boolean z10;
        float[] fArr2;
        boolean z11;
        Random random;
        int i10;
        float f17;
        float[] fArr3;
        Paint paint;
        int i11;
        Path path;
        RectF rectF2;
        boolean[] zArr;
        Random random2;
        TextPaint textPaint3;
        float f18;
        float f19;
        float f20;
        Path path2;
        Path path3;
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
        float f21;
        RectF rectF3;
        float f22;
        float f23;
        Paint paint2;
        byte b10;
        float f24;
        RectF rectF4;
        float f25;
        float f26;
        float f27;
        float f28;
        TextPaint textPaint4;
        Paint paint3;
        Random random3;
        int i12;
        float d;
        int i13;
        int i14;
        int i15;
        float f29;
        float f30;
        float[] fArr16;
        boolean z12;
        float f31;
        float d2;
        z0 z0Var = this;
        Canvas canvas2 = canvas;
        float f32 = z0Var.D2;
        float f33 = z0Var.K2;
        float f34 = (1.0f - f33) * f32;
        RectF rectF5 = z0Var.K5;
        TextPaint textPaint5 = z0Var.I0;
        RectF rectF6 = z0Var.G1;
        if (f33 > 0.001f) {
            boolean z13 = f33 < 0.999f;
            if (z13) {
                canvas2.save();
                float f35 = z0Var.K2;
                f12 = 0.999f;
                f10 = 2.0f;
                canvas2.scale(f35, f35, i7 / 2.0f, z0Var.o());
            } else {
                f12 = 0.999f;
                f10 = 2.0f;
            }
            float o4 = z0Var.o();
            textPaint5.setTextSize(org.telegram.messenger.g0.L(11.0f));
            float measureText = textPaint5.measureText(z0Var.K0) + textPaint5.measureText(z0Var.J0) + org.telegram.messenger.g0.L(11.0f) + org.telegram.messenger.g0.L(12.0f) + org.telegram.messenger.g0.L(1.0f) + org.telegram.messenger.g0.L(11.0f);
            if (!z0Var.w0) {
                f14 = z0Var.u2;
                if (f14 > 0.0f) {
                    f13 = 8.0f;
                }
            }
            f13 = 8.0f;
            f14 = org.telegram.messenger.g0.L(11.0f) + z0Var.M0.c() + org.telegram.messenger.g0.L(f10) + org.telegram.messenger.g0.L(12.0f) + org.telegram.messenger.g0.L(f13);
            boolean z14 = z0Var.w0;
            if (!z14 && z0Var.C0 <= 0.001f) {
                z0Var.u2 = 0.0f;
            }
            float f36 = z0Var.C0;
            if (z14) {
                f36 = Math.max(f36, z0Var.G0 ? 1.0f : 0.0f);
            }
            float T1 = org.telegram.messenger.g0.T1(measureText, f14, f36);
            float L = org.telegram.messenger.g0.L(22.0f);
            float f37 = (i7 - T1) / f10;
            float f38 = L / f10;
            rectF6.set(f37, o4 - f38, T1 + f37, o4 + f38);
            rectF5.set(rectF6);
            if (!z0Var.U5) {
                z0Var.A6 = true;
                z0Var.J(canvas2, rectF6, f38, 1.0f);
                z0Var.A6 = false;
            }
            z0Var.M(canvas2, 9, rectF6, false);
            RectF rectF7 = z0Var.L5;
            rectF7.set(rectF6);
            float min = Math.min(0.0f, org.telegram.messenger.g0.N(c1.a[1][8]));
            rectF7.inset(min, min);
            float f39 = f38 - min;
            f11 = f34;
            boolean z15 = z0Var.r2 > 0 && !z0Var.w0;
            boolean z16 = z0Var.t2;
            float[] fArr17 = z0Var.a1;
            float[] fArr18 = z0Var.Z0;
            RectF rectF8 = rectF5;
            float[] fArr19 = z0Var.Y0;
            float[] fArr20 = z0Var.V0;
            float[] fArr21 = z0Var.U0;
            float[] fArr22 = z0Var.S0;
            float[] fArr23 = z0Var.R0;
            float[] fArr24 = z0Var.T0;
            float[] fArr25 = z0Var.Q0;
            float[] fArr26 = z0Var.P0;
            float[] fArr27 = z0Var.X0;
            float[] fArr28 = z0Var.W0;
            float[] fArr29 = z0Var.O0;
            float[] fArr30 = z0Var.N0;
            boolean[] zArr2 = z0Var.c1;
            byte[] bArr = z0Var.b1;
            float f40 = 0.8f;
            RectF rectF9 = z0Var.s2;
            Random random4 = z0Var.f1;
            if (z16) {
                z0Var.t2 = false;
                float f41 = rectF7.left;
                z11 = 0;
                textPaint2 = textPaint5;
                fArr = fArr18;
                rectF9.set(f41, rectF7.top, (rectF7.width() * z0Var.C0 * z0Var.H0) + f41, rectF7.bottom);
                float L2 = org.telegram.messenger.g0.L(3.0f);
                float centerX = rectF6.centerX();
                float centerY = rectF6.centerY();
                int max = Math.max(1, (int) (rectF9.width() / L2));
                int max2 = Math.max(1, (int) (rectF9.height() / L2));
                float min2 = Math.min(1.0f, 260.0f / (max * max2));
                int i16 = 0;
                while (i16 < max2) {
                    float f42 = min2;
                    int i17 = 0;
                    while (i17 < max) {
                        if (random4.nextFloat() <= f42) {
                            i14 = max2;
                            f30 = f38;
                            if (z0Var.d1 >= 320) {
                                i13 = i17;
                                i15 = i16;
                                f29 = L;
                            } else {
                                float nextFloat = ((((random4.nextFloat() - 0.5f) * f40) + i17 + 0.5f) * L2) + rectF9.left;
                                float nextFloat2 = ((((random4.nextFloat() - 0.5f) * f40) + i16 + 0.5f) * L2) + rectF9.top;
                                float height = rectF6.height() / f10;
                                if (nextFloat < rectF6.left + height) {
                                    z12 = z15;
                                    fArr16 = fArr17;
                                    i15 = i16;
                                    f29 = L;
                                    if (Math.hypot(nextFloat - r8, nextFloat2 - centerY) > height) {
                                        i13 = i17;
                                        i17 = i13 + 1;
                                        max2 = i14;
                                        f38 = f30;
                                        z15 = z12;
                                        fArr17 = fArr16;
                                        L = f29;
                                        i16 = i15;
                                        f40 = 0.8f;
                                    }
                                } else {
                                    i15 = i16;
                                    f29 = L;
                                    z12 = z15;
                                    fArr16 = fArr17;
                                }
                                float f43 = nextFloat - centerX;
                                float f44 = nextFloat2 - centerY;
                                float max3 = Math.max(1.0f, (float) Math.hypot(f43, f44));
                                float f45 = f43 / max3;
                                float f46 = f44 / max3;
                                float nextFloat3 = (random4.nextFloat() * org.telegram.messenger.g0.L(140.0f)) + org.telegram.messenger.g0.L(60.0f);
                                boolean z17 = random4.nextFloat() < 0.15f;
                                int i18 = z0Var.d1;
                                z0Var.d1 = i18 + 1;
                                bArr[i18] = (byte) (z17 ? 4 : 3);
                                zArr2[i18] = false;
                                fArr30[i18] = nextFloat;
                                fArr29[i18] = nextFloat2;
                                fArr28[i18] = nextFloat;
                                fArr27[i18] = nextFloat2;
                                i13 = i17;
                                fArr26[i18] = ((random4.nextFloat() - 0.5f) * org.telegram.messenger.g0.L(60.0f)) + (f45 * nextFloat3);
                                fArr25[i18] = ((random4.nextFloat() - 0.5f) * org.telegram.messenger.g0.L(60.0f)) + ((f46 * nextFloat3) - ((random4.nextFloat() * org.telegram.messenger.g0.L(80.0f)) + org.telegram.messenger.g0.L(40.0f)));
                                if (z17) {
                                    d2 = org.telegram.ui.Cells.y0.d(f40, random4.nextFloat(), org.telegram.messenger.g0.N(1.4f));
                                    f31 = 1.0f;
                                } else {
                                    f31 = 1.0f;
                                    d2 = org.telegram.ui.Cells.y0.d(1.2f, random4.nextFloat(), org.telegram.messenger.g0.N(1.0f));
                                }
                                fArr24[i18] = d2;
                                fArr23[i18] = org.telegram.ui.Cells.y0.g(random4, 0.3f, 0.35f);
                                fArr22[i18] = 0.0f;
                                fArr21[i18] = f31;
                                fArr20[i18] = 0.0f;
                                fArr19[i18] = 0.0f;
                                fArr[i18] = 0.0f;
                                fArr16[i18] = 0.0f;
                                i17 = i13 + 1;
                                max2 = i14;
                                f38 = f30;
                                z15 = z12;
                                fArr17 = fArr16;
                                L = f29;
                                i16 = i15;
                                f40 = 0.8f;
                            }
                        } else {
                            i13 = i17;
                            i14 = max2;
                            i15 = i16;
                            f29 = L;
                            f30 = f38;
                        }
                        z12 = z15;
                        fArr16 = fArr17;
                        i17 = i13 + 1;
                        max2 = i14;
                        f38 = f30;
                        z15 = z12;
                        fArr17 = fArr16;
                        L = f29;
                        i16 = i15;
                        f40 = 0.8f;
                    }
                    i16++;
                    min2 = f42;
                    L = L;
                    f40 = 0.8f;
                }
                f15 = L;
                f16 = f38;
                z10 = z15;
                fArr2 = fArr17;
                z0Var.invalidate();
            } else {
                textPaint2 = textPaint5;
                fArr = fArr18;
                f15 = L;
                f16 = f38;
                z10 = z15;
                fArr2 = fArr17;
                z11 = 0;
            }
            float f47 = z10 ? 0.0f : z0Var.C0 * z0Var.H0;
            float width = (rectF7.width() * f47) + rectF7.left;
            float l10 = z10 ? Utilities.l((AnimationUtils.currentAnimationTimeMillis() - z0Var.r2) / 80.0f) : 1.0f;
            Paint paint4 = z0Var.A1;
            Path path4 = z0Var.F1;
            if (!z10 || l10 >= 1.0f) {
                random = random4;
            } else {
                random = random4;
                float l11 = 1.0f - Utilities.l((AnimationUtils.currentAnimationTimeMillis() - z0Var.r2) / 60.0f);
                canvas2.save();
                path4.rewind();
                path4.addRoundRect(rectF7, f39, f39, Path.Direction.CW);
                canvas2.clipPath(path4);
                canvas2.clipRect(rectF9);
                if (l11 > 0.0f) {
                    paint4.setColor(-134217729);
                    paint4.setAlpha((int) (l11 * 247.0f));
                    canvas2.drawRect(rectF9, paint4);
                }
                z0Var.G(canvas2, rectF6, a(1.0f - l10, z0Var.n != null ? z0Var.N0() : -16777216));
                canvas2.restore();
                z0Var.invalidate();
            }
            boolean z18 = z0Var.w0;
            boolean z19 = (z18 && z0Var.G0 && z0Var.x0 && f47 < f12) ? true : z11;
            RectF rectF10 = rectF6;
            float elapsedRealtime = (SystemClock.elapsedRealtime() % 100000) / 1000.0f;
            float f48 = 6.0f;
            float f49 = f47;
            z0Var.O5 = org.telegram.messenger.g0.N((!z18 || z0Var.G0) ? z11 : true ? 5.0f : 2.2f) * Utilities.l((rectF7.right - width) / org.telegram.messenger.g0.L(6.0f)) * Utilities.l((width - rectF7.left) / org.telegram.messenger.g0.L(6.0f));
            float L3 = rectF10.top - org.telegram.messenger.g0.L(4.0f);
            float L4 = rectF10.bottom + org.telegram.messenger.g0.L(4.0f);
            float f50 = L4 - L3;
            int i19 = z11;
            while (true) {
                i10 = 7;
                f17 = l10;
                fArr3 = z0Var.N5;
                if (i19 >= 7) {
                    break;
                }
                float f51 = 5.1f * elapsedRealtime;
                float f52 = i19;
                fArr3[i19] = (((float) ((Math.sin((f52 * 2.9f) + (8.3f * elapsedRealtime)) * 0.4000000059604645d) + (Math.sin((1.7f * f52) + f51) * 0.6000000238418579d))) * z0Var.O5) + width;
                i19++;
                l10 = f17;
                z19 = z19;
            }
            boolean z20 = z19;
            Path path5 = z0Var.M5;
            path5.rewind();
            path5.moveTo(rectF10.left - org.telegram.messenger.g0.L(f13), L3);
            path5.lineTo(fArr3[z11], L3);
            int i20 = 1;
            while (i20 < i10) {
                int i21 = i20 - 1;
                float f53 = i21;
                float f54 = f48;
                float f55 = a8.p0.f(f50, f53, f54, L3);
                float f56 = a8.p0.f(f50, i20, f54, L3);
                float f57 = fArr3[i21];
                path5.quadTo(f57, f55, (f57 + fArr3[i20]) / f10, (f56 + f55) / f10);
                i20++;
                L3 = L3;
                i10 = 7;
                f48 = 6.0f;
            }
            path5.lineTo(fArr3[6], L4);
            path5.lineTo(rectF10.left - org.telegram.messenger.g0.L(f13), L4);
            path5.close();
            if (z0Var.O5 > 0.01f) {
                z0Var.invalidate();
            }
            int i22 = (f49 > 0.001f ? 1 : (f49 == 0.001f ? 0 : -1));
            Path path6 = z0Var.T5;
            if (i22 > 0) {
                canvas2.save();
                path4.rewind();
                path4.addRoundRect(rectF7, f39, f39, Path.Direction.CW);
                canvas2.clipPath(path4);
                canvas2.clipPath(path5);
                paint4.setColor(-134217729);
                if (z20) {
                    path6.rewind();
                    float L5 = rectF7.top - org.telegram.messenger.g0.L(f10);
                    float L6 = rectF7.bottom + org.telegram.messenger.g0.L(f10);
                    float N = org.telegram.messenger.g0.N(0.75f);
                    f19 = 20.0f;
                    path6.moveTo(rectF7.left - org.telegram.messenger.g0.L(4.0f), L5);
                    while (true) {
                        float min3 = Math.min(L5, L6);
                        path6.lineTo(t1(min3, width, rectF7.top) + width, min3);
                        if (min3 >= L6) {
                            break;
                        } else {
                            L5 += N;
                        }
                    }
                    path6.lineTo(rectF7.left - org.telegram.messenger.g0.L(4.0f), L6);
                    path6.close();
                    canvas2.drawPath(path6, paint4);
                    textPaint4 = textPaint2;
                } else {
                    f19 = 20.0f;
                    textPaint4 = textPaint2;
                    canvas2.drawRect(rectF7.left, rectF7.top, z0Var.O5 + width, rectF7.bottom, paint4);
                }
                if (z20 || (z0Var.w0 && !z0Var.G0)) {
                    float L7 = org.telegram.messenger.g0.L(23.0f);
                    Matrix matrix = z0Var.Q5;
                    matrix.setScale(L7, 1.0f);
                    matrix.postTranslate(width - org.telegram.messenger.g0.L(22.0f), 0.0f);
                    LinearGradient linearGradient = z0Var.R5;
                    linearGradient.setLocalMatrix(matrix);
                    paint4.setShader(linearGradient);
                    canvas.drawRect(width - org.telegram.messenger.g0.L(22.0f), rectF7.top, width + org.telegram.messenger.g0.L(1.0f), rectF7.bottom, paint4);
                    paint3 = paint4;
                    paint3.setShader(null);
                } else {
                    paint3 = paint4;
                }
                canvas.restore();
                float f58 = z0Var.Y2 * 0.016667f;
                float currentTimeMillis = z20 ? 1.2f : ((z0Var.p2 + 250) - System.currentTimeMillis()) / 1000.0f;
                if (z20) {
                    int floor = (int) Math.floor(random.nextFloat() + (110.0f * f58));
                    int i23 = z11;
                    while (i23 < floor) {
                        Random random5 = random;
                        float f59 = f15;
                        float g10 = org.telegram.ui.Cells.y0.g(random5, f59, rectF10.top);
                        boolean[] zArr3 = zArr2;
                        float[] fArr31 = fArr30;
                        float[] fArr32 = fArr29;
                        float[] fArr33 = fArr28;
                        float[] fArr34 = fArr27;
                        float[] fArr35 = fArr26;
                        float[] fArr36 = fArr25;
                        float[] fArr37 = fArr24;
                        q((random5.nextFloat() * org.telegram.messenger.g0.L(3.0f)) + t1(g10, width, rectF7.top) + width, g10, (random5.nextFloat() * org.telegram.messenger.g0.L(f19)) + org.telegram.messenger.g0.L(10.0f), -((random5.nextFloat() * org.telegram.messenger.g0.L(10.0f)) + org.telegram.messenger.g0.L(4.0f)), 0.0f, org.telegram.ui.Cells.y0.d(0.7f, random5.nextFloat(), org.telegram.messenger.g0.N(0.8f)), org.telegram.ui.Cells.y0.g(random5, 0.25f, 0.25f), org.telegram.ui.Cells.y0.g(random5, 0.1f, 0.9f), false, false);
                        i23++;
                        rectF7 = rectF7;
                        f15 = f59;
                        rectF10 = rectF10;
                        i22 = i22;
                        path5 = path5;
                        path6 = path6;
                        floor = floor;
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
                        random = random5;
                        paint3 = paint3;
                        rectF8 = rectF8;
                    }
                    paint = paint3;
                    i11 = i22;
                    path = path5;
                    textPaint3 = textPaint4;
                    rectF2 = rectF8;
                    zArr = zArr2;
                    random3 = random;
                    f18 = f16;
                    float f60 = f15;
                    f20 = 0.12f;
                    path2 = path4;
                    path3 = path6;
                    RectF rectF11 = rectF7;
                    rectF = rectF10;
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
                    int floor2 = (int) Math.floor(random3.nextFloat() + (f58 * 70.0f));
                    int i24 = z11;
                    while (i24 < floor2) {
                        boolean z21 = random3.nextFloat() < 0.12f ? true : z11;
                        Random random6 = random3;
                        float g11 = org.telegram.ui.Cells.y0.g(random6, f60, rectF.top);
                        float nextFloat4 = (random6.nextFloat() * org.telegram.messenger.g0.L(10.0f)) + t1(g11, width, rectF11.top) + width + org.telegram.messenger.g0.L(f10);
                        float nextFloat5 = (random6.nextFloat() * org.telegram.messenger.g0.L(70.0f)) + org.telegram.messenger.g0.L(40.0f);
                        float f61 = -((random6.nextFloat() * org.telegram.messenger.g0.L(30.0f)) + org.telegram.messenger.g0.L(10.0f));
                        float f62 = -((random6.nextFloat() * org.telegram.messenger.g0.L(34.0f)) + org.telegram.messenger.g0.L(26.0f));
                        if (z21) {
                            i12 = floor2;
                            d = org.telegram.ui.Cells.y0.d(0.8f, random6.nextFloat(), org.telegram.messenger.g0.N(1.4f));
                        } else {
                            i12 = floor2;
                            d = org.telegram.ui.Cells.y0.d(1.1f, random6.nextFloat(), org.telegram.messenger.g0.N(0.9f));
                        }
                        random3 = random6;
                        q(nextFloat4, g11, nextFloat5, f61, f62, d, org.telegram.ui.Cells.y0.g(random6, 0.7f, 0.6f), 1.0f, z21, true);
                        i24++;
                        floor2 = i12;
                    }
                    z0Var = this;
                } else {
                    paint = paint3;
                    i11 = i22;
                    path = path5;
                    textPaint3 = textPaint4;
                    rectF2 = rectF8;
                    zArr = zArr2;
                    random3 = random;
                    f18 = f16;
                    float f63 = f15;
                    f20 = 0.12f;
                    path2 = path4;
                    path3 = path6;
                    rectF = rectF10;
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
                    int floor3 = (int) Math.floor(random3.nextFloat() + (((!z0Var.w0 || z0Var.G0) ? 0.0f : 260.0f) * f58));
                    for (int i25 = z11; i25 < floor3; i25++) {
                        z0Var.p(width, org.telegram.ui.Cells.y0.g(random3, f63, rectF.top), currentTimeMillis);
                    }
                }
                random2 = random3;
            } else {
                paint = paint4;
                rectF = rectF10;
                i11 = i22;
                path = path5;
                rectF2 = rectF8;
                zArr = zArr2;
                random2 = random;
                textPaint3 = textPaint2;
                f18 = f16;
                f19 = 20.0f;
                f20 = 0.12f;
                path2 = path4;
                path3 = path6;
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
            }
            int N0 = z0Var.n != null ? z0Var.N0() : -16777216;
            canvas.save();
            path2.rewind();
            Path path7 = path2;
            path7.addRoundRect(rectF, f18, f18, Path.Direction.CW);
            canvas2 = canvas;
            canvas2.clipPath(path7);
            if (i11 > 0) {
                v.b(canvas2, z20 ? path3 : path);
            }
            if (z0Var.w0 && z0Var.G0) {
                z0Var.G(canvas2, rectF, -218103809);
                textPaint = textPaint3;
            } else {
                int a10 = a(z10 ? f17 : 1.0f - Utilities.l(z0Var.C0 * 1.25f), -218103809);
                float centerY2 = rectF.centerY();
                float L8 = org.telegram.messenger.g0.L(12.0f);
                float L10 = rectF.left + org.telegram.messenger.g0.L(11.0f);
                textPaint = textPaint3;
                textPaint.setColor(a10);
                canvas2.drawText(z0Var.J0, L10, org.telegram.messenger.g0.L(4.0f) + centerY2, textPaint);
                float measureText2 = textPaint.measureText(z0Var.J0) + L10;
                z0Var.O(measureText2, centerY2, L8, a10, canvas, false);
                canvas2 = canvas;
                textPaint.setColor(a10);
                canvas2.drawText(z0Var.K0, measureText2 + L8 + org.telegram.messenger.g0.L(1.0f), centerY2 + org.telegram.messenger.g0.L(4.0f), textPaint);
            }
            canvas2.restore();
            if (i11 > 0) {
                canvas2.save();
                canvas2.clipPath(z20 ? path3 : path);
                z0Var.G(canvas2, rectF, N0);
                canvas2.restore();
            }
            if (z0Var.e1) {
                z0Var.e1 = z11;
                for (int i26 = 0; i26 < 24; i26++) {
                    z0Var.p((rectF.width() * random2.nextFloat() * 0.4f) + rectF.left, (rectF.height() * random2.nextFloat()) + rectF.top, 0.5f);
                }
            }
            float f64 = 0.5f;
            float f65 = z0Var.Y2 * 0.016667f;
            RectF rectF12 = rectF2;
            float L11 = rectF12.top - org.telegram.messenger.g0.L(40.0f);
            float L12 = rectF12.top - org.telegram.messenger.g0.L(48.0f);
            int i27 = z0Var.d1 - 1;
            while (i27 >= 0) {
                float f66 = fArr12[i27] + f65;
                fArr12[i27] = f66;
                if (f66 >= fArr11[i27]) {
                    int i28 = z0Var.d1 - 1;
                    z0Var.d1 = i28;
                    fArr4[i27] = fArr4[i28];
                    fArr5[i27] = fArr5[i28];
                    fArr8[i27] = fArr8[i28];
                    fArr9[i27] = fArr9[i28];
                    fArr11[i27] = fArr11[i28];
                    fArr12[i27] = fArr12[i28];
                    fArr10[i27] = fArr10[i28];
                    fArr13[i27] = fArr13[i28];
                    fArr14[i27] = fArr14[i28];
                    bArr[i27] = bArr[i28];
                    zArr[i27] = zArr[i28];
                    fArr6[i27] = fArr6[i28];
                    fArr7[i27] = fArr7[i28];
                    fArr15[i27] = fArr15[i28];
                    fArr[i27] = fArr[i28];
                    fArr2[i27] = fArr2[i28];
                    f24 = f65;
                    f21 = f64;
                    rectF4 = rectF12;
                    f25 = L11;
                    f26 = L12;
                    paint2 = paint;
                } else {
                    if (bArr[i27] >= 3) {
                        float f67 = 1.0f - (2.4f * f65);
                        fArr8[i27] = fArr8[i27] * f67;
                        float f68 = fArr9[i27] * f67;
                        fArr9[i27] = f68;
                        if (fArr12[i27] > f20) {
                            fArr9[i27] = (org.telegram.messenger.g0.L(120.0f) * f65) + f68;
                        }
                        if (fArr5[i27] < rectF12.top - org.telegram.messenger.g0.L(70.0f)) {
                            fArr9[i27] = fArr9[i27] * 0.85f;
                        }
                    } else {
                        if (zArr[i27]) {
                            fArr9[i27] = (fArr15[i27] * f65) + fArr9[i27];
                            fArr8[i27] = e2.C(f65, 1.6f, 1.0f, fArr8[i27]);
                            float C = e2.C(f65, 0.8f, 1.0f, fArr9[i27]);
                            fArr9[i27] = C;
                            if (fArr5[i27] < L12) {
                                f21 = f64;
                                rectF3 = rectF12;
                                fArr9[i27] = C * ((float) Math.pow(0.8999999761581421d, z0Var.Y2));
                            }
                        } else {
                            f21 = f64;
                            rectF3 = rectF12;
                            fArr9[i27] = fArr9[i27] - (org.telegram.messenger.g0.L(f19) * f65);
                            float f69 = 1.0f - (f65 * 3.0f);
                            fArr8[i27] = fArr8[i27] * f69;
                            float f70 = fArr9[i27] * f69;
                            fArr9[i27] = f70;
                            if (fArr5[i27] < L11) {
                                fArr9[i27] = f70 * 0.85f;
                            }
                        }
                        fArr4[i27] = (fArr8[i27] * f65) + fArr4[i27];
                        fArr5[i27] = (fArr9[i27] * f65) + fArr5[i27];
                        float f71 = fArr12[i27] / fArr11[i27];
                        float pow = f71 >= f20 ? f71 / f20 : (float) Math.pow(k5.y(f71, f20, 0.88f, 1.0f), zArr[i27] ? 0.550000011920929d : 0.699999988079071d);
                        f22 = fArr5[i27];
                        if (f22 >= L11) {
                            f23 = 1.0f;
                            pow *= Math.max(0.0f, 1.0f - ((L11 - f22) / org.telegram.messenger.g0.L(24.0f)));
                        } else {
                            f23 = 1.0f;
                        }
                        float f72 = ((f23 - (f71 * f21)) * fArr10[i27]) / f10;
                        paint2 = paint;
                        paint2.setColor(-1);
                        paint2.setAlpha((int) (pow * 255.0f));
                        b10 = bArr[i27];
                        RectF rectF13 = z0Var.V5;
                        if (b10 < 3) {
                            f24 = f65;
                            float f73 = f10;
                            float e10 = org.telegram.ui.Cells.y0.e((float) Math.hypot(fArr8[i27], fArr9[i27]), org.telegram.messenger.g0.L(200.0f), 1.0f, f73);
                            float f74 = ((1.0f - (f71 * 0.4f)) * fArr10[i27]) / f73;
                            rectF4 = rectF3;
                            if (fArr5[i27] < rectF4.top - org.telegram.messenger.g0.L(70.0f)) {
                                pow *= Math.max(0.0f, 1.0f - (((rectF4.top - org.telegram.messenger.g0.L(70.0f)) - fArr5[i27]) / org.telegram.messenger.g0.L(16.0f)));
                            }
                            paint2.setAlpha((int) (pow * 255.0f));
                            canvas2.save();
                            float f75 = pow;
                            f25 = L11;
                            canvas2.rotate((float) Math.toDegrees(Math.atan2(fArr9[i27], fArr8[i27])), fArr4[i27], fArr5[i27]);
                            float f76 = fArr4[i27];
                            float f77 = f74 * e10;
                            float f78 = fArr5[i27];
                            rectF13.set(f76 - f77, f78 - f74, f76 + f77, f78 + f74);
                            canvas2.drawOval(rectF13, paint2);
                            canvas2.restore();
                            if (bArr[i27] == 4) {
                                paint2.setAlpha((int) (f75 * 36.0f));
                                canvas2.drawCircle(fArr4[i27], fArr5[i27], f74 * 2.2f, paint2);
                            }
                            f26 = L12;
                        } else {
                            f24 = f65;
                            rectF4 = rectF3;
                            f25 = L11;
                            if (zArr[i27]) {
                                float f79 = fArr4[i27] - fArr6[i27];
                                float f80 = fArr5[i27] - fArr7[i27];
                                float sqrt = (float) Math.sqrt((f80 * f80) + (f79 * f79));
                                float f81 = fArr12[i27] / fArr11[i27];
                                float exp = fArr13[i27] * ((float) Math.exp((-sqrt) / org.telegram.messenger.g0.L(44.0f))) * (f81 < 0.08f ? f81 / 0.08f : (float) Math.pow(k5.y(f81, 0.08f, 0.92f, 1.0f), 0.550000011920929d));
                                float f82 = fArr5[i27];
                                if (f82 < L12) {
                                    f27 = 1.0f;
                                    exp *= Math.max(0.0f, 1.0f - ((L12 - f82) / org.telegram.messenger.g0.L(16.0f)));
                                } else {
                                    f27 = 1.0f;
                                }
                                float min4 = (f27 - (Math.min(f27, sqrt / org.telegram.messenger.g0.L(70.0f)) * 0.4f)) * (fArr10[i27] / f10);
                                float hypot = (float) Math.hypot(fArr8[i27], fArr9[i27]);
                                float f83 = fArr4[i27];
                                float f84 = fArr5[i27];
                                if (fArr[i27] <= 0.0f || hypot <= 1.0f) {
                                    f28 = exp;
                                    f26 = L12;
                                } else {
                                    f28 = exp;
                                    f26 = L12;
                                    float L13 = org.telegram.messenger.g0.L(3.0f) * ((float) Math.sin((fArr12[i27] * fArr[i27]) + fArr2[i27]));
                                    f83 = e2.c(-fArr9[i27], hypot, L13, f83);
                                    f84 = e2.c(fArr8[i27], hypot, L13, f84);
                                }
                                paint2.setAlpha((int) (f28 * 255.0f));
                                float min5 = Math.min(1.8f, (hypot / org.telegram.messenger.g0.L(220.0f)) + 1.0f);
                                canvas2.save();
                                canvas2.rotate((float) Math.toDegrees(Math.atan2(fArr9[i27], fArr8[i27])), f83, f84);
                                float f85 = min4 * min5;
                                rectF13.set(f83 - f85, f84 - min4, f85 + f83, f84 + min4);
                                canvas2.drawOval(rectF13, paint2);
                                canvas2.restore();
                                if (bArr[i27] == 1) {
                                    paint2.setAlpha((int) (f28 * 36.0f));
                                    canvas2.drawCircle(f83, f84, min4 * 2.2f, paint2);
                                }
                            } else {
                                f26 = L12;
                                canvas2.drawCircle(fArr4[i27], fArr5[i27], b10 == 1 ? f72 * f10 : f72, paint2);
                                if (bArr[i27] == 1) {
                                    paint2.setAlpha((int) (pow * 36.0f));
                                    canvas2.drawCircle(fArr4[i27], fArr5[i27], f72 * 4.4f, paint2);
                                }
                            }
                            i27--;
                            rectF12 = rectF4;
                            paint = paint2;
                            L12 = f26;
                            L11 = f25;
                            f65 = f24;
                            f64 = f21;
                            f20 = 0.12f;
                        }
                    }
                    f21 = f64;
                    rectF3 = rectF12;
                    fArr4[i27] = (fArr8[i27] * f65) + fArr4[i27];
                    fArr5[i27] = (fArr9[i27] * f65) + fArr5[i27];
                    float f712 = fArr12[i27] / fArr11[i27];
                    if (f712 >= f20) {
                    }
                    f22 = fArr5[i27];
                    if (f22 >= L11) {
                    }
                    float f722 = ((f23 - (f712 * f21)) * fArr10[i27]) / f10;
                    paint2 = paint;
                    paint2.setColor(-1);
                    paint2.setAlpha((int) (pow * 255.0f));
                    b10 = bArr[i27];
                    RectF rectF132 = z0Var.V5;
                    if (b10 < 3) {
                    }
                }
                i27--;
                rectF12 = rectF4;
                paint = paint2;
                L12 = f26;
                L11 = f25;
                f65 = f24;
                f64 = f21;
                f20 = 0.12f;
            }
            if (z13) {
                canvas2.restore();
            }
        } else {
            textPaint = textPaint5;
            rectF = rectF6;
            f10 = 2.0f;
            f11 = f34;
            rectF5.setEmpty();
        }
        if (f11 > 0.001f) {
            long currentTimeMillis2 = System.currentTimeMillis();
            long j3 = z0Var.H2;
            long max4 = j3 > 0 ? Math.max(0L, (j3 - (currentTimeMillis2 / 1000)) - 1) : -1L;
            if (max4 != z0Var.O2) {
                z0Var.O2 = max4;
                z0Var.P2 = max4 >= 0 ? hd.a0(null, null, 2131746491, String.format(Locale.US, "%d:%02d", Long.valueOf(max4 / 60), Long.valueOf(max4 % 60))) : hd.M0(2131746498, null);
            }
            String str = z0Var.P2;
            textPaint.setTextSize(org.telegram.messenger.g0.L(11.0f));
            float measureText3 = textPaint.measureText(str) + org.telegram.messenger.g0.L(11.0f) + org.telegram.messenger.g0.L(11.0f);
            float L14 = org.telegram.messenger.g0.L(22.0f);
            float o10 = z0Var.o();
            float f86 = i7;
            float f87 = L14 / f10;
            rectF.set((f86 - measureText3) / f10, o10 - f87, (f86 + measureText3) / f10, o10 + f87);
            z0Var.A6 = true;
            float f88 = f11;
            z0Var.J(canvas2, rectF, f87, f88);
            z0Var.A6 = false;
            textPaint.setColor(a(f88, -218103809));
            canvas2.drawText(str, rectF.left + org.telegram.messenger.g0.L(11.0f), o10 + org.telegram.messenger.g0.L(4.0f), textPaint);
            if (z0Var.H2 > 0) {
                z0Var.postInvalidateDelayed(1005 - (currentTimeMillis2 % 1000));
            }
        }
    }

    public final void B0() {
        cb.c cVar;
        n0 n0Var;
        if (this.f2 || (cVar = this.c) == null || (n0Var = ((i0) cVar.b).e) == null) {
            return;
        }
        n0Var.j();
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
            if (u.a(f10, f11, this.A6 ? 1 : this.B6 ? 2 : 0, canvas, rectF)) {
                return;
            }
        }
        int i13 = this.C6;
        SweepGradient[] sweepGradientArr = this.D6;
        int i14 = 4;
        float[][] fArr2 = c1.a;
        if (i13 != 1) {
            this.C6 = 1;
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
        int i24 = this.A6 ? i22 : this.B6 ? 2 : 0;
        float[] fArr5 = fArr2[i24];
        float f19 = this.E6;
        float[] fArr6 = c1.b;
        float f20 = f19 * fArr6[0];
        float f21 = (this.F6 * fArr6[i22]) / 100.0f;
        float N = org.telegram.messenger.g0.N(fArr5[8]);
        if (N != 0.0f) {
            rectF2 = this.d7;
            rectF2.set(rectF);
            rectF2.inset(N, N);
            if (path2 != null) {
                float width = rectF2.width() / Math.max(1.0f, rectF.width());
                float height = rectF2.height() / Math.max(1.0f, rectF.height());
                float centerX = rectF.centerX();
                float centerY = rectF.centerY();
                i7 = i24;
                Matrix matrix = this.X6;
                matrix.setScale(width, height, centerX, centerY);
                Path path3 = this.Y6;
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
        Matrix matrix2 = this.e7;
        matrix2.setRotate(f20);
        matrix2.postScale(rectF2.width() / Math.max(1.0f, rectF2.height()), 1.0f);
        matrix2.postTranslate(rectF2.centerX(), rectF2.centerY());
        float N2 = org.telegram.messenger.g0.N(fArr5[i23]);
        if (N2 > 0.05f) {
            SweepGradient sweepGradient = sweepGradientArr[i7];
            sweepGradient.setLocalMatrix(matrix2);
            Paint paint = this.B1;
            paint.setShader(sweepGradient);
            paint.setColor(-1);
            paint.setAlpha((int) (f11 * 255.0f));
            if (path2 == null) {
                paint.setStrokeWidth(N2);
                RectF rectF3 = this.W5;
                rectF3.set(rectF2);
                float f22 = (-N2) / 2.0f;
                rectF3.inset(f22, f22);
                float f23 = (N2 / 2.0f) + f12;
                canvas.drawRoundRect(rectF3, f23, f23, paint);
            } else {
                canvas.save();
                v.b(canvas, path2);
                paint.setStrokeWidth(N2 * 2.0f);
                canvas.drawPath(path2, paint);
                canvas.restore();
            }
            paint.setShader(null);
            paint.setAlpha(ns.e4);
        }
        double radians2 = Math.toRadians(f20);
        float f24 = (float) (-Math.sin(radians2));
        float cos = (float) Math.cos(radians2);
        float N3 = org.telegram.messenger.g0.N(fArr5[0]);
        float N4 = org.telegram.messenger.g0.N(fArr5[2]);
        float f25 = this.B6 ? 0.0f : this.c6 * ((fArr6[21] * 1.25f) / 100.0f);
        if (f25 <= 0.0f || !this.z3) {
            fArr = fArr2;
            f13 = 0.0f;
        } else {
            fArr = fArr2;
            f13 = c1(rectF2.centerX(), rectF2.top, getWidth(), getHeight());
        }
        float c12 = (f25 <= 0.0f || !this.z3) ? 0.0f : c1(rectF2.centerX(), rectF2.bottom, getWidth(), getHeight());
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
                Path path4 = this.a7;
                f15 = min;
                Path path5 = this.b7;
                if (path2 == null) {
                    f16 = min2;
                    f17 = f24;
                    float min3 = Math.min(f12, Math.min(rectF2.width(), rectF2.height()) / 2.0f);
                    path4.rewind();
                    Path.Direction direction = Path.Direction.CW;
                    path4.addRoundRect(rectF2, min3, min3, direction);
                    f14 = f12;
                    RectF rectF4 = this.Z6;
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
                v.b(canvas, path5);
                Paint paint2 = this.A1;
                if (i10 == 0) {
                    float f28 = fArr[i7][10];
                    int i28 = this.c7;
                    paint2.setColor(Color.rgb(Math.max(0, Math.min(ns.e4, Math.round(((Color.red(i28) - ns.e4) * f28) + 255.0f))), Math.max(0, Math.min(ns.e4, Math.round(((Color.green(i28) - ns.e4) * f28) + 255.0f))), Math.max(0, Math.min(ns.e4, Math.round(((Color.blue(i28) - ns.e4) * f28) + 255.0f)))));
                    paint2.setAlpha((int) (f27 * 255.0f * f11));
                    i11 = i22;
                } else {
                    int round = Math.round(Math.max(0.0f, Math.min(1.0f, f27)) * 255.0f);
                    paint2.setColor(round | (round << 16) | (-16777216) | (round << 8));
                    paint2.setAlpha((int) (f11 * 255.0f));
                    i11 = i22;
                    v.i(i11, paint2);
                }
                canvas.drawPath(path4, paint2);
                if (i10 != 0) {
                    v.i(0, paint2);
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
    public final void D(Canvas canvas, w0 w0Var, int i7, float f10, float f11, float f12, float f13, float f14) {
        float f15;
        Drawable drawable = w0Var.b[i7];
        if (drawable == null || f13 <= 0.01f) {
            return;
        }
        boolean z10 = drawable instanceof g5;
        Bitmap V = z10 ? V((g5) drawable) : null;
        boolean z11 = false;
        if (!z10 ? !(drawable instanceof f6) || ((f6) drawable).a() : V != null) {
            z11 = true;
        }
        long[] jArr = w0Var.y;
        if (!this.U2) {
            if (jArr != null && i7 < jArr.length) {
                if (jArr[i7] != 1) {
                    if (this.T4) {
                        if (z11) {
                            long elapsedRealtime = SystemClock.elapsedRealtime();
                            if (jArr[i7] == 0) {
                                jArr[i7] = elapsedRealtime;
                            }
                            f15 = Utilities.l(((elapsedRealtime - jArr[i7]) - b(f14)) / 380.0f);
                        }
                    } else if (this.W2 && z11) {
                        jArr[i7] = 1;
                    }
                }
                if (f15 <= 0.0f) {
                    return;
                }
                float B = e2.B((float) Math.sin((this.N3 * 1.3f) + f12), 0.03f, 1.0f, (this.p0 + 1.0f) * (f15 < 1.0f ? h(f15) : 1.0f) * f13 * this.m0);
                int round = Math.round(f10 / 2.0f);
                if (V == null) {
                    canvas.save();
                    canvas.translate(this.K3, this.L3);
                    canvas.rotate(f11 + this.o0);
                    canvas.scale(B, B);
                    int i10 = -round;
                    drawable.setBounds(i10, i10, round, round);
                    drawable.setAlpha((int) (this.n0 * 255.0f));
                    if (s.d(drawable)) {
                        s.b(canvas, drawable);
                    } else {
                        drawable.draw(canvas);
                    }
                    drawable.setAlpha(ns.e4);
                    canvas.restore();
                    return;
                }
                float f16 = round * B;
                canvas.save();
                canvas.translate(this.K3, this.L3);
                canvas.rotate(f11 + this.o0);
                float f17 = -f16;
                RectF rectF = this.Q4;
                rectF.set(f17, f17, f16, f16);
                if (s.d(drawable)) {
                    int i11 = (int) (this.n0 * 255.0f);
                    Paint paint = this.P4;
                    paint.setAlpha(i11);
                    canvas.drawBitmap(V, (Rect) null, rectF, paint);
                } else {
                    int i12 = (int) (this.n0 * 255.0f);
                    Paint paint2 = this.O4;
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

    public final void E(Canvas canvas, int i7, int i10, w0 w0Var, w0 w0Var2, float f10, boolean z10, boolean z11) {
        float f11;
        int i11;
        float f12;
        boolean z12;
        float f13;
        float f14;
        int i12;
        int i13;
        z0 z0Var = this;
        w0 w0Var3 = w0Var;
        w0 w0Var4 = w0Var2;
        z0Var.X(w0Var3);
        z0Var.X(w0Var4);
        float L = org.telegram.messenger.g0.L(86.0f);
        float L2 = org.telegram.messenger.g0.L(70.0f);
        float L3 = org.telegram.messenger.g0.L(90.0f) * 1.3f;
        float f15 = z0Var.L + z0Var.O;
        float f16 = z0Var.M + z0Var.P;
        float f17 = -L3;
        boolean z13 = true;
        int floor = ((int) Math.floor((f17 - f16) / L2)) - 1;
        int ceil = ((int) Math.ceil(((i10 + L3) - f16) / L2)) + 1;
        org.telegram.messenger.g0.L(24.0f);
        int i14 = floor;
        while (i14 <= ceil) {
            int i15 = i14 & 1;
            float f18 = i15 == 0 ? 0.0f : L / 2.0f;
            boolean z14 = z13;
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
                    z12 = z14;
                    f14 = f17;
                } else {
                    z0Var.G0(u02, 3.0f, 10.0f);
                    float f21 = f17;
                    float f22 = (float) (2.0d * u02 * 3.141592653589793d);
                    f11 = f15;
                    float e10 = z0Var.M4 + r.b.e(floor2, L, f18, f15);
                    float sin = (((float) Math.sin((z0Var.N3 * 0.45f) + f22)) * org.telegram.messenger.g0.L(3.0f)) + (i14 * f20) + f16 + z0Var.N4;
                    boolean z15 = i15 == 0 ? z14 : false;
                    i11 = ceil;
                    float f23 = (float) u02;
                    float B = e2.B(f23, 0.16f, 0.92f, org.telegram.messenger.g0.L(38.0f) * (z15 ? 1.3f : 0.9f));
                    f12 = L;
                    z12 = z14;
                    f13 = f18;
                    f14 = f21;
                    int i18 = floor2;
                    i12 = i14;
                    i13 = i18;
                    if (J0(e10, sin, B, i16, i10, 0, i14, i18, (Math.max(0.0f, (B / org.telegram.messenger.g0.L(24.0f)) - 1.0f) * 0.8f) + 1.0f)) {
                        if (z15) {
                            B *= 0.9f;
                        }
                        float f24 = B;
                        float sin2 = (((float) Math.sin((this.N3 * 0.3f) + f22)) * 4.0f) + ((f23 - 0.5f) * 26.0f);
                        float c02 = c0(59.3d * u02) * 0.3f;
                        int i19 = (i13 - ((i12 - i15) / 2)) - i12;
                        int length = w0Var4.b.length;
                        int i20 = ((i19 % length) + length) % length;
                        float c03 = c0(71.9d * u02);
                        if (w0Var3 == null) {
                            D(canvas, w0Var4, i20, f24, sin2, f22 * 2.0f, f1(z10, z11, f10 - c02), c03);
                        } else {
                            w0 w0Var5 = w0Var4;
                            Drawable[] drawableArr = w0Var3.b;
                            int length2 = drawableArr.length;
                            int i21 = ((i19 % length2) + length2) % length2;
                            if (drawableArr[i21] == w0Var5.b[i20]) {
                                D(canvas, w0Var5, i20, f24, sin2, f22 * 2.0f, 1.0f, c03);
                            } else {
                                float f25 = f22 * 2.0f;
                                float f26 = f10 - c02;
                                D(canvas, w0Var3, i21, f24, sin2, f25, f1(z12, false, f26), c03);
                                D(canvas, w0Var2, i20, f24, sin2, f25, f1(false, false, f26), c03);
                            }
                        }
                    }
                }
                floor2 = i13 + 1;
                z0Var = this;
                i16 = i7;
                w0Var3 = w0Var;
                w0Var4 = w0Var2;
                i14 = i12;
                f17 = f14;
                ceil2 = i17;
                f18 = f13;
                f15 = f11;
                ceil = i11;
                L = f12;
                z14 = z12;
                L2 = f20;
            }
            i14++;
            z0Var = this;
            w0Var3 = w0Var;
            w0Var4 = w0Var2;
            z13 = z14;
            L2 = L2;
            L3 = f19;
        }
    }

    public final void E0(w0 w0Var, Bitmap bitmap) {
        w0Var.e = bitmap;
        if (bitmap != null) {
            if (c1.b[35] > 0.5f) {
                Y(bitmap);
            }
            x0(w0Var);
        }
        w0Var.g = AnimationUtils.currentAnimationTimeMillis();
        this.h2 = bitmap;
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
    public final void F(Canvas canvas, int i7, int i10, w0 w0Var, boolean z10, boolean z11, float f10) {
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
        boolean z12;
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
        w0 w0Var2;
        Paint paint;
        float f27;
        Bitmap bitmap2;
        Paint paint2;
        int i11;
        float f28;
        z0 z0Var = this;
        if (w0Var != null) {
            Paint paint3 = w0Var.i;
            Paint paint4 = w0Var.v;
            int i12 = w0Var.a;
            if (i12 == 0) {
                return;
            }
            float f29 = z0Var.w3;
            if (i12 == 1) {
                z0Var.E(canvas, i7, i10, null, w0Var, f10, z10, z11);
                return;
            }
            w0 w0Var3 = w0Var;
            float f30 = z0Var.L + z0Var.O;
            float f31 = z0Var.M + z0Var.P;
            float L = org.telegram.messenger.g0.L(90.0f) * 1.3f;
            float L2 = org.telegram.messenger.g0.L(170.0f);
            float L3 = org.telegram.messenger.g0.L(150.0f);
            z0Var.L4 = 0;
            float f32 = -(org.telegram.messenger.g0.L(60.0f) + L);
            boolean z13 = true;
            Paint paint5 = paint3;
            int floor = ((int) Math.floor((f32 - f31) / L3)) - 1;
            float f33 = i10;
            int ceil = ((int) Math.ceil(((f33 + r8) - f31) / L3)) + 1;
            while (true) {
                jArr = z0Var.K4;
                fArr = z0Var.I4;
                f11 = f33;
                fArr2 = z0Var.H4;
                fArr3 = z0Var.G4;
                fArr4 = z0Var.F4;
                float f34 = f32;
                fArr5 = z0Var.J4;
                f12 = 0.5f;
                f13 = 2.0f;
                c10 = 0;
                if (floor > ceil) {
                    f14 = 0.0f;
                    break;
                }
                f14 = 0.0f;
                if (z0Var.L4 >= 96) {
                    break;
                }
                float f35 = (floor & 1) == 0 ? 0.0f : L2 / 2.0f;
                int i13 = ceil;
                int floor2 = ((int) Math.floor(((f34 - f30) - f35) / L2)) - 1;
                int ceil2 = ((int) Math.ceil((((i7 + r8) - f30) - f35) / L2)) + 1;
                while (floor2 <= ceil2 && z0Var.L4 < 96) {
                    float f36 = L2;
                    double u02 = u0(floor, floor2);
                    z0Var.G0(u02, 5.0f, 12.0f);
                    float f37 = f30;
                    fArr4[z0Var.L4] = (org.telegram.messenger.g0.L(76.0f) * (c0(u02 * 3.7d) - 0.5f)) + r.b.e(floor2, f36, f35, f30) + z0Var.M4;
                    fArr3[z0Var.L4] = (org.telegram.messenger.g0.L(64.0f) * (c0(u02 * 5.3d) - 0.5f)) + (floor * L3) + f31 + z0Var.N4;
                    fArr2[z0Var.L4] = (c0(u02 * 11.9d) * org.telegram.messenger.g0.L(32.0f)) + org.telegram.messenger.g0.L(62.0f);
                    fArr[z0Var.L4] = (c0(17.3d * u02) - 0.5f) * 22.0f;
                    int i14 = z0Var.L4;
                    fArr5[i14] = (float) u02;
                    jArr[i14] = (floor << 32) ^ (floor2 & 4294967295L);
                    z0Var.L4 = i14 + 1;
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
            z0Var.X(w0Var3);
            z0Var.Z(w0Var3);
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            Bitmap bitmap3 = w0Var3.e;
            Bitmap bitmap4 = bitmap3 != null ? bitmap3 : w0Var3.f;
            float l11 = (bitmap3 == null || w0Var3.f == null) ? 1.0f : Utilities.l((currentAnimationTimeMillis - w0Var3.g) / 150.0f);
            if (bitmap4 != null) {
                org.telegram.messenger.g0.L(44.0f);
                org.telegram.messenger.g0.L(38.0f);
                org.telegram.messenger.g0.L(17.0f);
                int i15 = w0Var3.r;
                z0Var.f4 = 0;
                float width = bitmap4.getWidth() / 2.0f;
                float f39 = 7.0f;
                if (z0Var.k4 != i15 || z0Var.g4 == null) {
                    z0Var.k4 = i15;
                    f17 = 0.55f;
                    Random random = new Random((i15 * 7919) + 20973);
                    float L4 = org.telegram.messenger.g0.L(300.0f);
                    int round = Math.round(33.46154f);
                    z0Var.g4 = new float[round];
                    z0Var.h4 = new float[round];
                    z0Var.i4 = new float[round];
                    int i16 = 0;
                    z0Var.j4 = 0;
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
                            while (i21 < z0Var.j4) {
                                float abs = Math.abs(nextFloat2 - z0Var.g4[i21]);
                                float abs2 = Math.abs(nextFloat3 - z0Var.h4[i21]);
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
                                float f46 = z0Var.i4[i21];
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
                        if (z0Var.j4 > 0 && f41 < org.telegram.messenger.g0.L(3.5f)) {
                            break;
                        }
                        float[] fArr10 = z0Var.g4;
                        int i28 = z0Var.j4;
                        fArr10[i28] = f42;
                        z0Var.h4[i28] = f40;
                        z0Var.i4[i28] = nextFloat;
                        z0Var.j4 = i28 + 1;
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
                    fArr6 = z0Var.e4;
                    float f52 = f50;
                    fArr7 = z0Var.d4;
                    fArr8 = z0Var.c4;
                    fArr9 = z0Var.b4;
                    iArr = z0Var.a4;
                    iArr2 = z0Var.Z3;
                    if (floor3 > ceil3) {
                        break;
                    }
                    int i29 = floor4;
                    while (i29 <= ceil4) {
                        int i30 = ceil4;
                        float f53 = f49;
                        int i31 = 0;
                        while (i31 < z0Var.j4) {
                            int i32 = i31;
                            if (z0Var.f4 < 1024) {
                                float f54 = (i29 * L6) + z0Var.g4[i32];
                                float f55 = (floor3 * L6) + z0Var.h4[i32];
                                float f56 = f54 + f38;
                                float f57 = f55 + f31;
                                if (f56 < f53 - org.telegram.messenger.g0.L(20.0f) || f56 > org.telegram.messenger.g0.L(20.0f) + f51 || f57 < f53 - org.telegram.messenger.g0.L(20.0f) || f57 > f52 + org.telegram.messenger.g0.L(20.0f)) {
                                    i11 = i29;
                                } else {
                                    float f58 = z0Var.i4[i32];
                                    float L7 = ((((((f58 * 0.75f) * f58) + f17) * (org.telegram.messenger.g0.L(21.0f) * 1.1f)) / 2.0f) * 1.25f) + org.telegram.messenger.g0.L(7.0f);
                                    float L8 = org.telegram.messenger.g0.L(170.0f);
                                    float L10 = org.telegram.messenger.g0.L(150.0f);
                                    int round2 = Math.round(f55 / L10);
                                    int i33 = round2 - 1;
                                    while (true) {
                                        i11 = i29;
                                        if (i33 > round2 + 1) {
                                            int i34 = z0Var.f4;
                                            iArr2[i34] = (floor3 * TLObject.FLAG_12) + i32;
                                            iArr[i34] = i11;
                                            fArr9[i34] = f54;
                                            fArr8[i34] = f55;
                                            fArr7[i34] = f19;
                                            fArr6[i34] = f58;
                                            z0Var.f4 = i34 + 1;
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
                while (i38 < z0Var.f4) {
                    int i39 = iArr2[i38];
                    int i40 = iArr[i38];
                    double u04 = u0(i39, i40);
                    float f63 = fArr9[i38];
                    float f64 = fArr8[i38];
                    float f65 = fArr7[i38];
                    float f66 = fArr6[i38];
                    int i41 = i38;
                    z0Var.G0(u04, f13, f39);
                    float f67 = f63 + f38 + z0Var.M4;
                    float f68 = f64 + f31 + z0Var.N4;
                    float c06 = c0(7.31d * u04);
                    float L11 = ((f66 * 0.75f * f66) + f17) * org.telegram.messenger.g0.L(21.0f) * 1.1f * f65;
                    int[] iArr3 = iArr2;
                    Bitmap bitmap5 = bitmap4;
                    Paint paint6 = paint4;
                    long[] jArr3 = jArr;
                    f39 = 7.0f;
                    z0Var = this;
                    if (z0Var.J0(f67, f68, L11, i7, i10, 1, i39, i40, (Math.max(f14, (L11 / org.telegram.messenger.g0.L(15.0f)) - f19) * 0.8f) + f19)) {
                        float f110 = f1(z10, z11, f10 - ((w0Var3.h || (z10 && z0Var.G.h)) ? z0Var.x1(z0Var.K3, z0Var.L3, i7, i10) : c0(u04 * 53.1d) * 0.3f));
                        if (f110 > 0.01f) {
                            float L0 = z0Var.L0(1.0f);
                            float f69 = z0Var.q0;
                            long j10 = (i40 & 4294967295L) ^ (i39 << 32);
                            int i42 = ((int) (((-7046029254386353131L) * j10) >>> 53)) & 2047;
                            int i43 = 0;
                            while (true) {
                                f22 = f110;
                                zArr = z0Var.z4;
                                jArr2 = z0Var.t4;
                                if (i43 >= 2048 || !zArr[i42] || jArr2[i42] == j10) {
                                    break;
                                }
                                i43++;
                                i42 = (i42 + 1) & 2047;
                                f110 = f22;
                            }
                            long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                            boolean z14 = zArr[i42];
                            float[] fArr11 = c1.b;
                            float[] fArr12 = z0Var.w4;
                            float[] fArr13 = z0Var.u4;
                            long[] jArr4 = z0Var.y4;
                            float[] fArr14 = z0Var.x4;
                            float[] fArr15 = z0Var.v4;
                            if (z14 && jArr2[i42] == j10) {
                                f23 = L11;
                                if (currentAnimationTimeMillis2 - jArr4[i42] <= 1000) {
                                    float exp = 1.0f - ((float) Math.exp((-Math.min(64.0f, r3)) / Math.max(10.0f, (((Math.abs(L0) > Math.abs(fArr15[i42]) || f69 > fArr14[i42]) ? fArr11[48] : fArr11[49]) / 3.4f) / 2.0f)));
                                    float f70 = fArr13[i42];
                                    float z15 = e2.z(L0, f70, exp, f70);
                                    fArr13[i42] = z15;
                                    float f71 = fArr15[i42];
                                    fArr15[i42] = e2.z(z15, f71, exp, f71);
                                    float f72 = fArr12[i42];
                                    float z16 = e2.z(f69, f72, exp, f72);
                                    fArr12[i42] = z16;
                                    float f73 = fArr14[i42];
                                    fArr14[i42] = e2.z(z16, f73, exp, f73);
                                    jArr4[i42] = currentAnimationTimeMillis2;
                                    f24 = fArr15[i42];
                                    float f74 = fArr14[i42];
                                    if (Math.abs(f24) <= 0.05f || f74 > 0.002f) {
                                        z0Var.invalidate();
                                    }
                                    float f75 = (z0Var.I3 * f24) + z0Var.K3;
                                    float f76 = (z0Var.J3 * f24) + z0Var.L3;
                                    f25 = z0Var.q0;
                                    float f77 = c0(61.37d * u04) * 100.0f >= fArr11[17] ? fArr11[18] / 100.0f : 1.0f;
                                    f26 = 0.35f;
                                    float pow = (float) Math.pow((Math.sin((u04 * 6.283d) + e2.B(c06, 0.55f, 0.35f, f29)) * 0.5d) + 0.5d, 2.0d);
                                    float B = (((((fArr11[43] / 100.0f) * f74) + 1.0f) * e2.B(pow, 0.1f, (0.06f * f25) + 1.0f, (z0Var.p0 + 1.0f) * (z0Var.m0 * f22))) * f23) / bitmap5.getWidth();
                                    float f78 = fArr11[44] * f74;
                                    canvas.save();
                                    canvas.translate(f75, f76);
                                    canvas.rotate(((c06 - 0.5f) * 70.0f) + z0Var.o0 + f78);
                                    canvas.scale(B, B);
                                    int i44 = (int) (((pow * 0.15f) + 0.85f) * z0Var.n0 * 255.0f * f77);
                                    if (l11 >= 1.0f) {
                                        paint = paint5;
                                        paint.setAlpha((int) ((1.0f - l11) * i44));
                                        w0Var2 = w0Var;
                                        f27 = width;
                                        float f79 = -f27;
                                        canvas.drawBitmap(r0(w0Var2, w0Var2.f, z13), f79, f79, paint);
                                    } else {
                                        w0Var2 = w0Var;
                                        paint = paint5;
                                        f27 = width;
                                    }
                                    paint.setAlpha((int) (i44 * l11));
                                    bitmap2 = bitmap5;
                                    float f80 = -f27;
                                    canvas.drawBitmap(r0(w0Var2, bitmap2, false), f80, f80, paint);
                                    if (f25 <= 0.01f) {
                                        ColorFilter colorFilter = paint6.getColorFilter();
                                        paint2 = paint6;
                                        paint2.setColorFilter(x0(w0Var2));
                                        paint2.setAlpha((int) (Math.min(1.0f, (fArr11[13] * f25) / 100.0f) * 255.0f * z0Var.n0 * l11));
                                        canvas.drawBitmap(bitmap2, f80, f80, paint2);
                                        paint2.setColorFilter(colorFilter);
                                        float f81 = fArr11[35];
                                        Paint paint7 = z0Var.A4;
                                        if (f81 > 0.5f && z0Var.Y(bitmap2)) {
                                            paint7.setColorFilter(z0Var.A0(w0Var2));
                                            paint7.setAlpha((int) (Math.min(255.0f, ((f25 * 255.0f) * fArr11[37]) / 100.0f) * z0Var.n0 * l11));
                                            canvas.drawBitmap(z0Var.T3, f80, f80, paint7);
                                        }
                                        float f82 = (z0Var.o4 * fArr11[22]) / 100.0f;
                                        if (f82 > 0.01f) {
                                            paint7.setColorFilter(z0Var.A0(w0Var2));
                                            paint7.setAlpha((int) (Math.min(1.0f, f82) * 255.0f * z0Var.n0 * l11));
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
                                    w0Var3 = w0Var2;
                                    jArr = jArr3;
                                    iArr2 = iArr3;
                                    f18 = f26;
                                    z13 = true;
                                    f13 = 2.0f;
                                    c10 = 0;
                                    f14 = 0.0f;
                                    f17 = 0.55f;
                                    f19 = 1.0f;
                                }
                            } else {
                                f23 = L11;
                            }
                            zArr[i42] = z13;
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
                            z0Var.invalidate();
                            float f752 = (z0Var.I3 * f24) + z0Var.K3;
                            float f762 = (z0Var.J3 * f24) + z0Var.L3;
                            f25 = z0Var.q0;
                            if (c0(61.37d * u04) * 100.0f >= fArr11[17]) {
                            }
                            f26 = 0.35f;
                            float pow2 = (float) Math.pow((Math.sin((u04 * 6.283d) + e2.B(c06, 0.55f, 0.35f, f29)) * 0.5d) + 0.5d, 2.0d);
                            float B2 = (((((fArr11[43] / 100.0f) * f742) + 1.0f) * e2.B(pow2, 0.1f, (0.06f * f25) + 1.0f, (z0Var.p0 + 1.0f) * (z0Var.m0 * f22))) * f23) / bitmap5.getWidth();
                            float f782 = fArr11[44] * f742;
                            canvas.save();
                            canvas.translate(f752, f762);
                            canvas.rotate(((c06 - 0.5f) * 70.0f) + z0Var.o0 + f782);
                            canvas.scale(B2, B2);
                            int i442 = (int) (((pow2 * 0.15f) + 0.85f) * z0Var.n0 * 255.0f * f77);
                            if (l11 >= 1.0f) {
                            }
                            paint.setAlpha((int) (i442 * l11));
                            bitmap2 = bitmap5;
                            float f802 = -f27;
                            canvas.drawBitmap(r0(w0Var2, bitmap2, false), f802, f802, paint);
                            if (f25 <= 0.01f) {
                            }
                            canvas.restore();
                            i38 = i41 + 1;
                            bitmap4 = bitmap2;
                            paint5 = paint;
                            width = f27;
                            paint4 = paint2;
                            w0Var3 = w0Var2;
                            jArr = jArr3;
                            iArr2 = iArr3;
                            f18 = f26;
                            z13 = true;
                            f13 = 2.0f;
                            c10 = 0;
                            f14 = 0.0f;
                            f17 = 0.55f;
                            f19 = 1.0f;
                        }
                    }
                    w0Var2 = w0Var3;
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
                    w0Var3 = w0Var2;
                    jArr = jArr3;
                    iArr2 = iArr3;
                    f18 = f26;
                    z13 = true;
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
            w0 w0Var4 = w0Var3;
            g5 g5Var = w0Var4.d;
            Bitmap V = g5Var != null ? z0Var.V(g5Var) : null;
            Bitmap bitmap6 = (V == null || V.isRecycled()) ? null : V;
            Bitmap bitmap7 = w0Var4.D;
            if (bitmap6 == null && bitmap7 == null) {
                return;
            }
            if (w0Var4.C == 0 && z0Var.W2) {
                w0Var4.C = 1L;
            }
            if (w0Var4.C == 0 && z0Var.T4) {
                w0Var4.C = SystemClock.elapsedRealtime();
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (bitmap6 != null && w0Var4.E == 0) {
                w0Var4.E = (bitmap7 == null || w0Var4.C == 0) ? 1L : elapsedRealtime;
            }
            if (bitmap6 == null) {
                l10 = 0.0f;
            } else {
                l10 = w0Var4.E == 1 ? 1.0f : Utilities.l((elapsedRealtime - r8) / 150.0f);
            }
            if (l10 > 0.0f && l10 < 1.0f) {
                z0Var.invalidate();
            }
            if (z0Var.U2) {
                j3 = Long.MAX_VALUE;
            } else {
                long j11 = w0Var4.C;
                j3 = j11 == 0 ? -1L : elapsedRealtime - j11;
            }
            org.telegram.messenger.g0.L(41.0f);
            int i45 = 0;
            while (i45 < z0Var.L4) {
                long j12 = j3;
                float f83 = fArr2[i45];
                float sin = fArr3[i45] + (((float) Math.sin((fArr5[i45] * 2.0f * 3.141592653589793d) + (z0Var.N3 * f15))) * org.telegram.messenger.g0.L(3.0f));
                Bitmap bitmap8 = bitmap7;
                float f84 = fArr4[i45];
                long j13 = jArr5[i45];
                Bitmap bitmap9 = bitmap6;
                int i46 = i45;
                if (z0Var.J0(f84, sin, f83, i7, i10, 2, (int) (j13 >> 32), (int) j13, (Math.max(0.0f, (f83 / org.telegram.messenger.g0.L(40.0f)) - 1.0f) * 0.8f) + 1.0f)) {
                    z12 = z11;
                    float f111 = f1(z10, z12, f10 - ((w0Var4.h || (z10 && z0Var.G.h)) ? z0Var.x1(z0Var.K3, z0Var.L3, i7, i10) : c0(fArr5[i46] * 53.1d) * 0.3f));
                    if (f111 > 0.01f) {
                        float l12 = Utilities.l((j12 - z0Var.b(fArr5[i46])) / 380.0f);
                        if (l12 <= 0.0f) {
                            bitmap = bitmap9;
                            f16 = f12;
                            bitmap6 = bitmap;
                            j3 = j12;
                            f12 = f16;
                            i45 = i46 + 1;
                            bitmap7 = bitmap8;
                        } else {
                            float B3 = (f83 / 2.0f) * e2.B((float) Math.sin((fArr5[i46] * 12.6f) + (z0Var.N3 * 1.3f)), 0.03f, 1.0f, (z0Var.p0 + 1.0f) * f111 * (l12 < 1.0f ? h(l12) : 1.0f) * z0Var.m0);
                            f16 = f12;
                            float L02 = z0Var.L0(f16);
                            canvas.save();
                            canvas.translate((z0Var.I3 * L02) + z0Var.K3, (z0Var.J3 * L02) + z0Var.L3);
                            canvas.rotate(fArr[i46] + z0Var.o0);
                            float f85 = -B3;
                            RectF rectF = z0Var.E4;
                            rectF.set(f85, f85, B3, B3);
                            if (bitmap8 == null) {
                                rect = null;
                            } else if (l10 < 1.0f) {
                                int i47 = (int) ((1.0f - l10) * z0Var.n0 * 38.25f);
                                Paint paint8 = z0Var.D4;
                                paint8.setAlpha(i47);
                                rect = null;
                                canvas.drawBitmap(bitmap8, (Rect) null, rectF, paint8);
                            } else {
                                rect = null;
                            }
                            if (bitmap9 != null) {
                                int i48 = (int) (z0Var.n0 * 255.0f * l10);
                                Paint paint9 = z0Var.C4;
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
                    z12 = z11;
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
            if (i7 == 2 && !m10.i(this.b).q()) {
                d1(0, hd.M0(2131746474, null), hd.M0(2131746473, null));
                i0();
                return;
            }
            if (i7 == 2 && (this.i1 != i7 || this.g1 < 0.5f)) {
                AnimationUtils.currentAnimationTimeMillis();
            }
            this.i1 = i7;
            this.j1 = i7;
            this.k1 = 0.0f;
            this.l9.forceFinished(true);
            if (this.g1 > 0.5f) {
                this.d6 = AnimationUtils.currentAnimationTimeMillis();
            }
            if (this.h1 < 0.5f) {
                this.J2 = AnimationUtils.currentAnimationTimeMillis();
            }
            this.h1 = 1.0f;
            l0();
            if (this.i1 == 2) {
                y0();
            }
            i0();
        }
    }

    public final void G(Canvas canvas, RectF rectF, int i7) {
        float centerY = rectF.centerY();
        float L = org.telegram.messenger.g0.L(12.0f);
        g6 g6Var = this.M0;
        float c10 = g6Var.c() + org.telegram.messenger.g0.L(2.0f) + L;
        float L2 = rectF.left + org.telegram.messenger.g0.L(8.0f);
        O(L2, centerY, L, i7, canvas, true);
        g6Var.u(i7);
        g6Var.setBounds((int) (L2 + L + org.telegram.messenger.g0.L(2.0f)), (int) (centerY - org.telegram.messenger.g0.L(8.0f)), (int) (L2 + c10 + org.telegram.messenger.g0.L(40.0f)), (int) (centerY + org.telegram.messenger.g0.L(8.0f)));
        g6Var.draw(canvas);
    }

    public final void G0(double d, float f10, float f11) {
        float c02 = ((c0(31.7d * d) * (f11 - f10)) + f10) * org.telegram.messenger.g0.L(1.0f);
        double c03 = (d * 6.283d) + (((((c0(43.3d * d) < 0.5f ? -1.0d : 1.0d) * 2.0d) * 3.141592653589793d) * this.N3) / ((c0(37.1d * d) * 11.0f) + 9.0f));
        this.M4 = ((float) Math.cos(c03)) * c02;
        this.N4 = c02 * ((float) Math.sin(c03));
    }

    public final void H(Canvas canvas, RectF rectF, float f10) {
        x0 x0Var = this.n;
        int f11 = x0Var != null ? i0.a.f(0.5f, x0Var.b, x0Var.c) : -12947803;
        Paint paint = this.A1;
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
        float t6;
        int size;
        int i10;
        TLRPC.Document document;
        RadialGradient radialGradient;
        float f14;
        e5 e5Var;
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
        int i12 = this.Q7;
        if (i7 == i12) {
            if (this.T7 < this.S7) {
                float l10 = 1.0f - Utilities.l((currentAnimationTimeMillis2 - r14) / 120.0f);
                t6 = 1.0f - ((1.0f - (l10 * l10)) * 0.06f);
                if (t6 != 1.0f) {
                    canvas2.save();
                    canvas2.scale(t6, t6, (f12 / 2.0f) + f10, (f13 / 2.0f) + f11);
                }
                int[] iArr = this.i2;
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
                RectF rectF = this.G1;
                rectF.set(f10, f11, f10 + f12, f11 + f13);
                Paint paint = this.A1;
                paint.setColor(-1);
                long j3 = tL_starGiftUnique.id;
                LongSparseArray longSparseArray = this.S5;
                radialGradient = (RadialGradient) longSparseArray.get(j3);
                if (radialGradient == null) {
                    radialGradient = new RadialGradient(0.0f, 0.0f, 1.0f, new int[]{i13, i14}, (float[]) null, Shader.TileMode.CLAMP);
                    longSparseArray.put(tL_starGiftUnique.id, radialGradient);
                }
                float f20 = f13 * 0.7f;
                float max = Math.max(1.0f, f12 / f13) * f20;
                Matrix matrix = this.P5;
                matrix.setScale(max, f20);
                matrix.postTranslate(rectF.centerX(), rectF.centerY());
                radialGradient.setLocalMatrix(matrix);
                paint.setShader(radialGradient);
                f14 = this.V7;
                canvas2.drawRoundRect(rectF, f14, f14, paint);
                paint.setShader(null);
                canvas2.save();
                Path path = this.F1;
                path.rewind();
                path.addRoundRect(rectF, f14, f14, Path.Direction.CW);
                canvas2.clipPath(path);
                int i15 = iArr[2] | (-16777216);
                y0 m12 = m1(tL_starGiftUnique);
                e5Var = m12.a;
                if (e5Var != null || e5Var.f[0] == null) {
                    f15 = f14;
                    f16 = 0.7f;
                    document2 = document;
                } else {
                    canvas2.save();
                    canvas2.translate(rectF.centerX(), rectF.centerY());
                    int i16 = Build.VERSION.SDK_INT;
                    if (i16 >= 29) {
                        e5 e5Var2 = m12.a;
                        f16 = 0.7f;
                        Drawable drawable = e5Var2.f[0];
                        if (drawable != null && e5Var2.d.c == 1.0f && (drawable instanceof g5)) {
                            g5 g5Var = (g5) drawable;
                            u2 u2Var = g5Var.k;
                            if (u2Var != null) {
                                long h = g5Var.h();
                                document2 = document;
                                if (h == m12.b) {
                                    bitmap = u2Var.n();
                                    if (bitmap == null) {
                                        if (m12.c != bitmap || m12.d == null) {
                                            m12.c = bitmap;
                                            m12.d = ai.d.b(bitmap);
                                        }
                                        m12.e = i15;
                                        m12.d.setColorFilter(i16 >= 29 ? v.l(i15) : new PorterDuffColorFilter(i15, PorterDuff.Mode.SRC_IN));
                                        f15 = f14;
                                        di.w0.b(canvas2, 2, m12.d, bitmap, rectF.width(), rectF.height(), 1.0f);
                                        canvas2 = canvas;
                                        canvas2.restore();
                                    } else {
                                        f15 = f14;
                                        m12.a.k(Integer.valueOf(i15));
                                        canvas2 = canvas;
                                        di.w0.a(canvas2, 2, m12.a, rectF.width(), rectF.height(), 1.0f, 1.0f);
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
                    di.w0.a(canvas2, 2, m12.a, rectF.width(), rectF.height(), 1.0f, 1.0f);
                    canvas2.restore();
                }
                canvas2.restore();
                paint.setColor(318767103);
                canvas2.drawRoundRect(rectF, f15, f15, paint);
                Paint paint2 = this.B1;
                paint2.setColor(1308622847);
                paint2.setStrokeWidth(Math.max(1.0f, org.telegram.messenger.g0.N(0.4f)));
                RectF rectF2 = this.W5;
                rectF2.set(rectF);
                rectF2.inset(0.5f, 0.5f);
                float f21 = f15 - 0.5f;
                canvas2.drawRoundRect(rectF2, f21, f21, paint2);
                currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                i11 = this.M7;
                if (i7 == i11 || this.P7 <= 0.5f) {
                    document3 = document2;
                    if (i7 != this.R7 || (i7 == i11 && this.P7 < 0.5f)) {
                        float l11 = Utilities.l((currentAnimationTimeMillis - this.U7) / 180.0f);
                        f17 = 1.0f - (l11 * l11);
                    } else {
                        f17 = 0.0f;
                    }
                } else {
                    document3 = document2;
                    float l12 = 1.0f - Utilities.l((currentAnimationTimeMillis - this.T7) / 260.0f);
                    f17 = org.telegram.ui.Cells.y0.x(l12, l12, l12, 1.0f);
                }
                if (f17 <= 0.002f) {
                    boolean z10 = i7 == this.M7 && this.P7 > 0.5f;
                    f18 = 3.0f;
                    float T1 = org.telegram.messenger.g0.T1(org.telegram.messenger.g0.N(1.0f), org.telegram.messenger.g0.L(4.0f), f17);
                    float L = org.telegram.messenger.g0.L(2.0f) * f17;
                    float min = Math.min(1.0f, z10 ? f17 * 4.0f : f17 * 3.0f);
                    rectF2.set(rectF);
                    rectF2.inset(T1, T1);
                    paint2.setColor(-1);
                    paint2.setAlpha((int) (min * 255.0f * (i7 == this.M7 ? (f17 * 0.3f) + f16 : 1.0f)));
                    paint2.setStrokeWidth(L);
                    float f22 = f15 - T1;
                    canvas2.drawRoundRect(rectF2, Math.max(0.0f, f22), Math.max(0.0f, f22), paint2);
                } else {
                    f18 = 3.0f;
                }
                if (document3 != null) {
                    g5 g02 = g0(tL_starGiftUnique.id, document3);
                    float f23 = 0.82f * f13;
                    long currentAnimationTimeMillis3 = AnimationUtils.currentAnimationTimeMillis();
                    int i17 = this.M7;
                    if (i7 == i17 && this.P7 > 0.5f) {
                        f19 = 1.0f - (((float) h1((currentAnimationTimeMillis3 - this.T7) / 1000.0f, 0.6d, 0.3d)) * 0.14f);
                    } else if (i7 == this.R7 || (i7 == i17 && this.P7 < 0.5f)) {
                        float l13 = Utilities.l((currentAnimationTimeMillis3 - this.U7) / 180.0f);
                        f19 = ((f18 - (l13 * 2.0f)) * 0.14f * l13 * l13) + 0.86f;
                    } else {
                        f19 = 1.0f;
                    }
                    float f24 = (f23 * f19) / 2.0f;
                    g02.setBounds((int) (rectF.centerX() - f24), (int) (rectF.centerY() - f24), (int) (rectF.centerX() + f24), (int) (rectF.centerY() + f24));
                    g02.setAlpha(ns.e4);
                    g02.setColorFilter(null);
                    g02.draw(canvas2);
                }
                if (t6 == 1.0f) {
                    canvas2.restore();
                    return;
                }
                return;
            }
        }
        t6 = i7 == i12 ? e2.t(1.0f, (float) h1((currentAnimationTimeMillis2 - this.T7) / 1000.0f, 0.6d, 0.3d), 0.06f, 1.0f) : 1.0f;
        if (t6 != 1.0f) {
        }
        int[] iArr2 = this.i2;
        e0(iArr2, i7);
        int i132 = iArr2[0];
        int i142 = iArr2[1];
        ArrayList<TL_stars.StarGiftAttribute> arrayList2 = tL_starGiftUnique.attributes;
        size = arrayList2.size();
        i10 = 0;
        document = null;
        while (i10 < size) {
        }
        RectF rectF3 = this.G1;
        rectF3.set(f10, f11, f10 + f12, f11 + f13);
        Paint paint3 = this.A1;
        paint3.setColor(-1);
        long j32 = tL_starGiftUnique.id;
        LongSparseArray longSparseArray2 = this.S5;
        radialGradient = (RadialGradient) longSparseArray2.get(j32);
        if (radialGradient == null) {
        }
        float f202 = f13 * 0.7f;
        float max2 = Math.max(1.0f, f12 / f13) * f202;
        Matrix matrix2 = this.P5;
        matrix2.setScale(max2, f202);
        matrix2.postTranslate(rectF3.centerX(), rectF3.centerY());
        radialGradient.setLocalMatrix(matrix2);
        paint3.setShader(radialGradient);
        f14 = this.V7;
        canvas2.drawRoundRect(rectF3, f14, f14, paint3);
        paint3.setShader(null);
        canvas2.save();
        Path path2 = this.F1;
        path2.rewind();
        path2.addRoundRect(rectF3, f14, f14, Path.Direction.CW);
        canvas2.clipPath(path2);
        int i152 = iArr2[2] | (-16777216);
        y0 m122 = m1(tL_starGiftUnique);
        e5Var = m122.a;
        if (e5Var != null) {
        }
        f15 = f14;
        f16 = 0.7f;
        document2 = document;
        canvas2.restore();
        paint3.setColor(318767103);
        canvas2.drawRoundRect(rectF3, f15, f15, paint3);
        Paint paint22 = this.B1;
        paint22.setColor(1308622847);
        paint22.setStrokeWidth(Math.max(1.0f, org.telegram.messenger.g0.N(0.4f)));
        RectF rectF22 = this.W5;
        rectF22.set(rectF3);
        rectF22.inset(0.5f, 0.5f);
        float f212 = f15 - 0.5f;
        canvas2.drawRoundRect(rectF22, f212, f212, paint22);
        currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        i11 = this.M7;
        if (i7 == i11) {
        }
        document3 = document2;
        if (i7 != this.R7) {
        }
        float l112 = Utilities.l((currentAnimationTimeMillis - this.U7) / 180.0f);
        f17 = 1.0f - (l112 * l112);
        if (f17 <= 0.002f) {
        }
        if (document3 != null) {
        }
        if (t6 == 1.0f) {
        }
    }

    public final void I0(float f10, float f11, int i7) {
        Path path;
        int i10;
        int i11;
        TLRPC.Document document;
        TLRPC.Document document2;
        TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.w1.get(i7);
        x0 x0Var = new x0();
        x0Var.a = 2;
        x0Var.f = i7;
        final w0 w0Var = new w0();
        w0Var.a = 2;
        w0Var.q = i7;
        long j3 = tL_starGiftUnique.id;
        w0Var.r = (int) (j3 ^ (j3 >>> 32));
        ArrayList<TL_stars.StarGiftAttribute> arrayList = tL_starGiftUnique.attributes;
        int size = arrayList.size();
        int i12 = 0;
        int i13 = 0;
        while (i13 < size) {
            TL_stars.StarGiftAttribute starGiftAttribute = arrayList.get(i13);
            i13++;
            TL_stars.StarGiftAttribute starGiftAttribute2 = starGiftAttribute;
            if ((starGiftAttribute2 instanceof TL_stars.starGiftAttributePattern) && (document2 = ((TL_stars.starGiftAttributePattern) starGiftAttribute2).document) != null) {
                w0Var.A = document2;
                w0Var.c = g5.l(this.b, 9, document2);
            } else if ((starGiftAttribute2 instanceof TL_stars.starGiftAttributeModel) && (document = ((TL_stars.starGiftAttributeModel) starGiftAttribute2).document) != null) {
                w0Var.z = document;
                w0Var.d = g5.l(this.b, 24, document);
            }
        }
        e0(this.i2, i7);
        x0Var.b = x(this.i2[0], false);
        int x10 = x(this.i2[1], true);
        x0Var.c = x10;
        x0Var.d = this.i2[2];
        x0Var.e = v(x0Var.b, x10);
        x0Var.h = Z0(x0Var.b);
        x0Var.g = f.k(0.5f, x0Var.b, x0Var.c);
        w0Var.j = l1(x0Var.d, x0Var.b);
        double[] dArr = {r15, 0.0d, 0.0d};
        i0.a.j(l1(x0Var.d, x0Var.b) | (-16777216), dArr);
        double min = Math.min(97.0d, dArr[0] + 20.0d);
        float[] fArr = new float[3];
        Color.colorToHSV(i0.a.b(min, dArr[1], dArr[2]), fArr);
        fArr[1] = Math.min(1.0f, fArr[1] * 1.15f);
        w0Var.s = Color.HSVToColor(fArr) | (-16777216);
        w0Var.v.setColorFilter(new PorterDuffColorFilter(w0Var.s, PorterDuff.Mode.SRC_IN));
        w0Var.t = -1;
        w0Var.B = tL_starGiftUnique;
        g5 g5Var = w0Var.c;
        if (g5Var != null) {
            g5Var.a(this);
        }
        g5 g5Var2 = w0Var.d;
        if (g5Var2 != null) {
            g5Var2.a(this);
        }
        TLRPC.Document document3 = w0Var.z;
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
                float f12 = J9;
                final float f13 = f12 / i10;
                final float f14 = f12 / i11;
                final int i15 = w0Var.j;
                Utilities.e.c(new Runnable() { // from class: ci.t0
                    @Override // java.lang.Runnable
                    public final void run() {
                        Bitmap bitmap;
                        float f15 = f13;
                        float f16 = f14;
                        int i16 = i15;
                        Path path3 = path2;
                        try {
                            int i17 = z0.J9;
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
                        org.telegram.messenger.g0.h3(new aa.r(z0.this, w0Var, bitmap, 11));
                    }
                });
            }
        }
        this.J.clear();
        Y0(x0Var, f10, f11);
        if (!this.g2) {
            this.q2 = j(this.o2, 0.03f, 0.005f);
            this.o2 = AnimationUtils.currentAnimationTimeMillis();
        }
        setPattern(w0Var);
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
        if (this.B6) {
            float min = Math.min(0.0f, org.telegram.messenger.g0.N(c1.a[2][8]));
            rectF3 = this.X5;
            rectF2 = rectF;
            rectF3.set(rectF2);
            rectF3.inset(min, min);
            f12 = f10 - min;
        } else {
            rectF2 = rectF;
            f12 = f10;
            rectF3 = rectF2;
        }
        boolean z10 = (j0(canvas) || this.Z2 == null) ? false : true;
        if (z10 && this.Z2 != null && this.b3 != null) {
            float f14 = this.g3;
            Matrix matrix = this.e3;
            matrix.setScale(f14, f14);
            float f15 = (-f14) / 2.0f;
            matrix.postTranslate(f15, f15);
            this.b3.setLocalMatrix(matrix);
            int l10 = (int) (Utilities.l(f11) * 255.0f);
            Paint paint = this.d3;
            paint.setAlpha(l10);
            canvas.drawRoundRect(rectF3, f12, f12, paint);
            paint.setAlpha(ns.e4);
        }
        Path path = this.F1;
        path.rewind();
        path.addRoundRect(rectF3, f12, f12, Path.Direction.CW);
        canvas.save();
        canvas.clipPath(path);
        float[] fArr = c1.b;
        if (z10) {
            f13 = 0.0f;
            c10 = '\t';
            c11 = 3;
        } else if (v.f() && j0(canvas)) {
            f13 = 0.0f;
            if (f11 < 1.0f) {
                canvas.saveLayerAlpha(rectF3, (int) (f11 * 255.0f));
            }
            if (!this.t6 || this.s6 <= 0.004f) {
                c10 = '\t';
                c11 = 3;
                Object obj = this.I1;
                canvas.save();
                canvas.scale(9.0f, 9.0f);
                v.c(canvas, obj);
                canvas.restore();
            } else {
                canvas.save();
                canvas.scale(8.0f, 8.0f);
                if (this.u6 == null) {
                    this.u6 = android.support.v4.media.session.w.d("qrSheetLift");
                }
                float round = Math.round(this.s6 * 50.0f) / 50.0f;
                c10 = '\t';
                x0 x0Var = this.n;
                int i7 = x0Var != null ? x0Var.b : 0;
                if (round == this.v6 && this.w6 == 1 && this.x6 == i7) {
                    c11 = 3;
                } else {
                    this.v6 = round;
                    this.w6 = 1;
                    this.x6 = i7;
                    Object obj2 = this.u6;
                    c11 = 3;
                    float max = (fArr[10] / 100.0f) * round * ((float) Math.max(0.0d, Math.min(1.0d, (0.85d - (x0Var != null ? i0.a.h(x0Var.b) : 0.3d)) / 0.45d)));
                    float c12 = e2.c(fArr[11], 100.0f, round, 1.0f);
                    float f16 = ((0.5f - (c12 * 0.5f)) + max) * 255.0f;
                    v.k(obj2, Math.max(0.5f, org.telegram.messenger.g0.N(org.telegram.messenger.g0.T1(fArr[2], fArr[12], round)) / 8.0f), new float[]{c12, 0.0f, 0.0f, 0.0f, f16, 0.0f, c12, 0.0f, 0.0f, f16, 0.0f, 0.0f, c12, 0.0f, f16, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f});
                }
                Canvas a10 = v.a((getWidth() + 7) / 8, (getHeight() + 7) / 8, this.u6);
                a10.scale(0.125f, 0.125f);
                v.c(a10, this.H1);
                v.d(this.u6);
                v.c(canvas, this.u6);
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
        int i10 = this.U8;
        if (i10 == 0) {
            i10 = g((fArr[c11] + (this.t6 ? fArr[c10] * this.s6 : f13)) / 100.0f, 16777215);
        }
        Paint paint2 = this.A1;
        paint2.setColor(i10);
        paint2.setAlpha((int) (Color.alpha(paint2.getColor()) * f11));
        canvas.drawRect(rectF3, paint2);
        u.b(canvas, rectF3, f11);
        boolean z11 = this.t6;
        if ((((z11 || this.B6) ? f13 : (fArr[21] / 100.0f) * this.c6) > f13 || fArr[39] > f13) && this.z3 && !z11 && !this.B6) {
            int width = getWidth();
            int height = getHeight();
            float c13 = c1(rectF3.left, rectF3.centerY(), width, height);
            float c14 = c1(rectF3.centerX(), rectF3.centerY(), width, height);
            float c15 = c1(rectF3.right, rectF3.centerY(), width, height);
            if (c13 + c14 + c15 > 0.01f) {
                float f17 = ((fArr[39] * 1.25f) / 100.0f) * this.c6 * 0.1f;
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
        v0 v0Var = this.M3;
        int i17 = v0Var.m;
        float[] fArr = v0Var.j;
        float[] fArr2 = v0Var.i;
        float[] fArr3 = v0Var.h;
        float[] fArr4 = v0Var.g;
        float[] fArr5 = v0Var.f;
        float[] fArr6 = v0Var.e;
        float[] fArr7 = v0Var.d;
        float[] fArr8 = v0Var.c;
        long[] jArr = v0Var.a;
        boolean[] zArr = v0Var.b;
        int[] iArr = v0Var.k;
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
                if (iArr[i14] == this.r0) {
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
                    if (v0Var.m >= 3072) {
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
                                int[] iArr2 = v0Var.l;
                                f27 = f35;
                                int i20 = v0Var.m;
                                v0Var.m = i20 + 1;
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
                    iArr[i16] = this.r0;
                    float f37 = 1.0f / f13;
                    float f38 = sqrt > 1.0f ? f27 / sqrt : f16;
                    float f39 = sqrt > 1.0f ? f28 / sqrt : -1.0f;
                    fArr6[i16] = e2.x(f38, org.telegram.messenger.g0.L(360.0f), f37, fArr6[i16]);
                    fArr5[i16] = e2.x(f39, org.telegram.messenger.g0.L(360.0f), f37, fArr5[i16]);
                    fArr3[i16] = e2.x(f38 >= f16 ? 1.0f : -1.0f, 180.0f, f37, fArr3[i16]);
                    fArr[i16] = fArr[i16] + 1.8f;
                }
                if (i16 < 0) {
                    f17 = f10 + fArr8[i16];
                    f18 = f11 + fArr7[i16];
                    this.o0 = fArr4[i16];
                    this.p0 = fArr2[i16];
                } else {
                    float f40 = f16;
                    this.o0 = f40;
                    this.p0 = f40;
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
                            this.n0 = g12;
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
                            this.m0 = f42;
                            float f43 = (f12 * f42) / f21;
                            float l11 = Utilities.l(Math.min(Math.min(f17 - f43, (f15 - f17) - f43), Math.min(f18 - f43, (f14 - f18) - f43)) / org.telegram.messenger.g0.L(12.0f));
                            float f44 = (3.0f - (l11 * f21)) * l11 * l11 * this.n0;
                            this.n0 = f44;
                            if (f44 <= 0.004f) {
                                return false;
                            }
                            this.K3 = f17;
                            this.L3 = f18;
                            this.q0 = c1(f17, f18, i7, i10);
                            this.o4 = this.n4;
                            this.r4 = this.p4;
                            this.s4 = this.q4;
                            return true;
                        }
                        float exp3 = (float) Math.exp((f18 / L) - 1.0f);
                        f26 = L * exp3;
                        f24 = Math.min(f24, exp3);
                        f18 = f26;
                        g12 = g1(0.08f, 0.25f, f24) * g14;
                        this.n0 = g12;
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
                this.n0 = g12;
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
        if (this.l1 <= 0.001f) {
            return;
        }
        float L = org.telegram.messenger.g0.L(222.0f);
        float L2 = org.telegram.messenger.g0.L(46.0f);
        float L3 = org.telegram.messenger.g0.L(54.0f);
        org.telegram.messenger.g0.L(8.0f);
        float f13 = this.z0 ? L2 + L2 : L2 + L3 + L2;
        float f14 = this.g1;
        RectF rectF = this.K5;
        float L4 = f14 > 0.5f ? (rectF.bottom + org.telegram.messenger.g0.L(6.0f)) - f13 : rectF.top - org.telegram.messenger.g0.L(6.0f);
        float width = (getWidth() - L) / 2.0f;
        RectF rectF2 = this.L8;
        rectF2.set(width, L4, L + width, f13 + L4);
        float f15 = this.F8;
        float f16 = this.G8;
        float l10 = Utilities.l(this.l1);
        float T1 = org.telegram.messenger.g0.T1(rectF.left, rectF2.left, f15);
        float T12 = org.telegram.messenger.g0.T1(rectF.top, rectF2.top, f16);
        float T13 = org.telegram.messenger.g0.T1(rectF.right, rectF2.right, f15);
        float T14 = org.telegram.messenger.g0.T1(rectF.bottom, rectF2.bottom, f16);
        RectF rectF3 = this.K8;
        rectF3.set(T1, T12, T13, T14);
        float min = Math.min(rectF3.height() / 2.0f, Math.min(rectF3.width() / 2.0f, org.telegram.messenger.g0.T1(rectF.height() / 2.0f, org.telegram.messenger.g0.L(22.0f), Utilities.l(f16))));
        float C = a8.p0.C(this.H8, 9.0f, 1.0f, -0.25f) * org.telegram.messenger.g0.L(5.0f);
        float f17 = rectF3.left;
        float f18 = rectF3.top;
        float f19 = rectF3.right;
        float f20 = 1.0f;
        float f21 = rectF3.bottom;
        float centerX = rectF3.centerX();
        Path path = this.J8;
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
        float f26 = f21 + C;
        path.cubicTo(org.telegram.messenger.g0.T1(f23, centerX, 0.55f), f26, org.telegram.messenger.g0.T1(f22, centerX, 0.55f), f26, f22, f21);
        path.quadTo(f17, f21, f17, f25);
        path.lineTo(f17, f24);
        path.quadTo(f17, f18, f22, f18);
        path.close();
        float max = Math.max(0.0f, C) + f21;
        RectF rectF4 = this.G1;
        rectF4.set(f17, f18, f19, max);
        canvas2.save();
        canvas2.clipPath(path);
        float f27 = 255.0f;
        if (v.f() && j0(canvas)) {
            Object obj = this.I1;
            canvas2.save();
            canvas2.scale(9.0f, 9.0f);
            v.c(canvas2, obj);
            canvas2.restore();
        } else if (this.Z2 != null) {
            int l11 = (int) (Utilities.l(1.0f) * 255.0f);
            Paint paint = this.c3;
            paint.setAlpha(l11);
            Bitmap bitmap = this.Z2;
            if (bitmap != null) {
                y(canvas2, bitmap);
            }
            paint.setAlpha(ns.e4);
        } else {
            H(canvas2, rectF4, 1.0f);
        }
        Paint paint2 = this.A1;
        paint2.setColor(352321535);
        paint2.setAlpha((int) (Color.alpha(paint2.getColor()) * 1.0f));
        canvas2.drawRect(rectF4, paint2);
        u.b(canvas2, rectF4, 1.0f);
        canvas2.restore();
        C(canvas2, path, rectF4, 0.0f, 1.0f);
        canvas2.save();
        canvas2.clipPath(path);
        float f28 = l10 / 0.3f;
        float l12 = 1.0f - Utilities.l(f28);
        float f29 = 0.004f;
        float f30 = 0.15f;
        boolean z10 = false;
        int i10 = 1;
        if (l12 > 0.004f) {
            canvas2.saveLayerAlpha(rectF4, (int) (l12 * 255.0f));
            float l13 = 1.0f - (Utilities.l(f28) * 0.15f);
            canvas2.scale(l13, l13, rectF.centerX(), rectF.centerY());
            this.U5 = true;
            int width2 = getWidth();
            System.currentTimeMillis();
            B(canvas2, width2);
            this.U5 = false;
            canvas2.restore();
        }
        float centerX2 = rectF3.centerX() - rectF2.centerX();
        float f31 = rectF3.top - rectF2.top;
        float f32 = 0.6f;
        if (Math.abs(this.H8) < 0.6f) {
            centerX2 = Math.round(centerX2);
            f31 = Math.round(f31);
        }
        canvas2.save();
        canvas2.translate(centerX2, f31);
        TextPaint textPaint = this.D1;
        textPaint.setSubpixelText(true);
        textPaint.setLinearText(false);
        String[] strArr = {hd.M0(2131746485, null), hd.M0(this.y0 ? 2131746489 : 2131746487, null), hd.M0(2131746484, null)};
        String[] strArr2 = {null, hd.M0(this.y0 ? 2131746488 : 2131746486, null), null};
        int i11 = 0;
        float f33 = L4;
        while (i11 < 3) {
            RectF[] rectFArr = this.z8;
            if (i11 == i10 && this.z0) {
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
                float g12 = this.m1 > 0.5f ? g1(f30, f32, l10) : g1(f32, f20, l10);
                if (g12 <= f11) {
                    i7 = i11;
                } else {
                    M(canvas2, i11, rectFArr[i11], z10);
                    canvas2.save();
                    float f36 = (f34 / 2.0f) + f33;
                    if (i11 == 2) {
                        i7 = i11;
                        o0(canvas2, this.L1, rectF2.left + org.telegram.messenger.g0.L(26.0f), f36, org.telegram.messenger.g0.L(20.0f), g12);
                        canvas2 = canvas;
                    } else {
                        i7 = i11;
                        if (i7 == 0) {
                            canvas2 = canvas;
                            o0(canvas2, this.S1, rectF2.left + org.telegram.messenger.g0.L(26.0f), f36, org.telegram.messenger.g0.L(20.0f), g12);
                        } else {
                            canvas2 = canvas;
                            boolean z11 = this.y0;
                            Bitmap bitmap2 = z11 ? this.P8 : this.Q8;
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
                                if (z11) {
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
                                    this.P8 = createBitmap;
                                } else {
                                    this.Q8 = createBitmap;
                                }
                                bitmap2 = createBitmap;
                            }
                            float L5 = rectF2.left + org.telegram.messenger.g0.L(f12);
                            Paint paint6 = this.R8;
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
            z10 = false;
            i10 = 1;
            f20 = 1.0f;
        }
        canvas2.restore();
        canvas2.restore();
    }

    public final void K0() {
        if (this.X4 != null || this.W4) {
            return;
        }
        this.W4 = true;
        Utilities.e.c(new o0(this, i0.a.o(i0.a.f(0.4f, N0(), -16777216), 16), 0));
    }

    public final void L(float f10, float f11, float f12, float f13, Canvas canvas, RectF rectF) {
        float min = Math.min(f12, f13);
        float max = Math.max(f12, f13);
        Paint paint = this.b6;
        if (min > 0.002f) {
            paint.setShader(null);
            paint.setColor(g(min, 16777215));
            canvas.drawRect(f10, rectF.top, f11, rectF.bottom, paint);
        }
        float f14 = max - min;
        if (f14 > 0.002f) {
            LinearGradient linearGradient = f13 >= f12 ? this.Y5 : this.Z5;
            Matrix matrix = this.a6;
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
        if (!this.z3 || this.s4 <= 0.001f) {
            return 0.0f;
        }
        float f11 = this.r4;
        float[] fArr = c1.b;
        float max = f11 / Math.max(0.3f, fArr[50]);
        if (max > 4.0f || max < -4.0f) {
            return 0.0f;
        }
        return Math.min(org.telegram.messenger.g0.N(fArr[42]), (org.telegram.messenger.g0.L(3.5f) / 2.0f) / 0.607f) * f10 * max * ((float) Math.exp((-0.5f) * max * max)) * this.s4;
    }

    public final void M(Canvas canvas, int i7, RectF rectF, boolean z10) {
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        boolean z11 = this.s9 == i7;
        long[] jArr = this.y9;
        if (z11 || jArr[i7] != 0) {
            float X0 = z11 ? X0(i7, currentAnimationTimeMillis) : this.z9[i7] * ((float) Math.exp((-(currentAnimationTimeMillis - jArr[i7])) / 180.0f));
            if (!z11 && X0 < 0.004f) {
                jArr[i7] = 0;
                return;
            }
            float C = e2.C(X0, 2.0f, 3.0f, X0 * X0);
            float min = Math.min(1.0f, (currentAnimationTimeMillis - this.x9[i7]) / 320.0f);
            float f10 = 1.0f - min;
            float x10 = org.telegram.ui.Cells.y0.x(f10, f10, f10, 1.0f);
            if (!z11 || X0 < 0.996f || min < 1.0f) {
                invalidate();
            }
            float max = Math.max(rectF.left, Math.min(rectF.right, this.v9[i7]));
            float max2 = Math.max(rectF.top, Math.min(rectF.bottom, this.w9[i7]));
            float max3 = (float) Math.max(Math.hypot(max - rectF.left, max2 - rectF.top), Math.max(Math.hypot(max - rectF.right, max2 - rectF.top), Math.max(Math.hypot(max - rectF.left, max2 - rectF.bottom), Math.hypot(max - rectF.right, max2 - rectF.bottom))));
            int i10 = z10 ? 335544320 : 738197503;
            Paint paint = this.t9;
            paint.setColor((((int) ((i10 >>> 24) * C)) << 24) | (16777215 & i10));
            Path path = this.u9;
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

    public final void M0(int i7, x0 x0Var, int i10, int i11) {
        int i12 = i7 * 7;
        int i13 = x0Var.a;
        float[] fArr = this.k3;
        if (i13 == 0 && x0Var.f == I9) {
            fArr[i12] = 0.0f;
            fArr[i12 + 1] = 0.0f;
            fArr[i12 + 2] = 0.0f;
            float f10 = M9;
            fArr[i12 + 3] = f10;
            float f11 = N9;
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
        int i15 = x0Var.b;
        int[] iArr = this.m3;
        iArr[i14] = i15;
        iArr[i14 + 1] = x0Var.g;
        iArr[i14 + 2] = x0Var.c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:113:0x03e9, code lost:
    
        if (r6.t8[r7] != ((r49 * 31) + r50)) goto L136;
     */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0cc6  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0d14  */
    /* JADX WARN: Removed duplicated region for block: B:165:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0abd  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0ac6  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0ba2  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0bf5  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0c2c  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0c68  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0c7c  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0c81  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0c84 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:296:0x0c3b  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0c22  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x0c90 A[EDGE_INSN: B:312:0x0c90->B:313:0x0c90 BREAK  A[LOOP:2: B:259:0x0ac2->B:294:0x0c84], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:316:0x0c95 A[LOOP:3: B:314:0x0c91->B:316:0x0c95, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:320:0x0cbe  */
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
        z0 z0Var;
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
        boolean z10;
        ArrayList arrayList;
        float f20;
        boolean z11;
        int i15;
        float[] fArr;
        int i16;
        boolean z12;
        RectF rectF4;
        int i17;
        float f21;
        float x10;
        float f22;
        boolean z13;
        float f23;
        float f24;
        w0 w0Var;
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
        z0 z0Var2 = this;
        float f32 = z0Var2.g1;
        if (f32 <= 0.001f) {
            return;
        }
        float l10 = Utilities.l(f32);
        float b12 = z0Var2.b1();
        float a12 = z0Var2.a1();
        float f33 = a12 - b12;
        float L = org.telegram.messenger.g0.L(10.0f);
        float L2 = i7 - org.telegram.messenger.g0.L(10.0f);
        RectF rectF6 = z0Var2.v7;
        rectF6.set(L, f33, L2, a12);
        float height = (z0Var2.getHeight() - z0Var2.v3) - org.telegram.messenger.g0.L(40.0f);
        float L3 = org.telegram.messenger.g0.L(10.0f) - org.telegram.messenger.g0.L(3.0f);
        float f34 = i7;
        float f35 = f34 / 2.0f;
        float max = Math.max(L3, org.telegram.messenger.g0.T1(f35 - org.telegram.messenger.g0.L(72.0f), rectF6.left, f32));
        float T12 = org.telegram.messenger.g0.T1(height - org.telegram.messenger.g0.L(20.0f), f33, f32);
        float min = Math.min(f34 - L3, org.telegram.messenger.g0.T1(f35 + org.telegram.messenger.g0.L(72.0f), rectF6.right, f32));
        float T13 = org.telegram.messenger.g0.T1(org.telegram.messenger.g0.L(20.0f) + height, a12, l10);
        RectF rectF7 = z0Var2.A7;
        rectF7.set(max, T12, min, T13);
        float min2 = Math.min(rectF7.height() / 2.0f, org.telegram.messenger.g0.W1(l10, org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(28.17f)));
        float f36 = 0.5f;
        z0Var2.B6 = l10 > 0.5f;
        if (l10 >= 0.35f) {
            f10 = 0.35f;
            if (z0Var2.f6 || z0Var2.h1 <= 0.5f) {
                f11 = 10.0f;
                rectF = rectF6;
            } else {
                z0Var2.f6 = true;
                f11 = 10.0f;
                rectF = rectF6;
                z0Var2.d6 = AnimationUtils.currentAnimationTimeMillis();
            }
        } else {
            rectF = rectF6;
            f10 = 0.35f;
            f11 = 10.0f;
        }
        if (l10 < 0.05f) {
            z0Var2.f6 = false;
        }
        z0Var2.s6 = l10;
        z0Var2.t6 = true;
        z0Var2.J(canvas, rectF7, min2, 1.0f);
        z0Var2.t6 = false;
        z0Var2.B6 = false;
        x0 x0Var = z0Var2.n;
        int i22 = x0Var != null ? x0Var.h : TLObject.FLAG_30;
        float f37 = f11;
        Paint paint = z0Var2.A1;
        paint.setColor(i22);
        paint.setAlpha((int) (Color.alpha(i22) * l10));
        float[][] fArr2 = c1.a;
        int i23 = 2;
        if (l10 > 0.5f) {
            float min3 = Math.min(0.0f, org.telegram.messenger.g0.N(fArr2[2][8]));
            RectF rectF8 = z0Var2.W5;
            rectF8.set(rectF7);
            rectF8.inset(min3, min3);
            float f38 = min2 - min3;
            canvas.drawRoundRect(rectF8, f38, f38, paint);
        } else {
            canvas.drawRoundRect(rectF7, min2, min2, paint);
        }
        float l11 = 1.0f - Utilities.l(l10 / f10);
        int i24 = 3;
        Path path = z0Var2.F1;
        if (l11 > 0.0f) {
            canvas.save();
            path.rewind();
            path.addRoundRect(rectF7, min2, min2, Path.Direction.CW);
            canvas.clipPath(path);
            float L4 = org.telegram.messenger.g0.L(144.0f) / 3.0f;
            int i25 = 0;
            while (i25 < i24) {
                int i26 = i24;
                float b10 = i20.b(i25, f36, L4, f35 - org.telegram.messenger.g0.L(72.0f));
                Drawable drawable = z0Var2.g7[i25];
                float T14 = org.telegram.messenger.g0.T1(height, height - org.telegram.messenger.g0.L(f37), l10);
                float L5 = org.telegram.messenger.g0.L(i25 == 1 ? 24.5f : 22.0f);
                float f39 = min2;
                float f40 = l10 * 0.15f;
                int i27 = i25 == z0Var2.i1 ? 1 : 0;
                int i28 = i25;
                float f41 = l11;
                o0(canvas, drawable, b10, T14, e2.B(f40, i27, 1.0f, L5), f41);
                f36 = 0.5f;
                l11 = f41;
                z0Var2 = this;
                min2 = f39;
                L4 = L4;
                i24 = i26;
                l10 = l10;
                i25 = i28 + 1;
            }
            z0Var = z0Var2;
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
            z0Var = z0Var2;
        }
        float f42 = z0Var.z7;
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
        int i31 = z0Var.i1 != i12 ? i12 : 0;
        if (i31 != 0) {
            canvas2.saveLayer(rectF7, null);
        }
        canvas2.save();
        canvas2.translate(0.0f, (1.0f - z0Var.z7) * org.telegram.messenger.g0.L(14.0f));
        canvas2.translate(0.0f, -z0Var.k1);
        float L6 = org.telegram.messenger.g0.L(4.0f) + f15;
        int i32 = z0Var.i1;
        if (i32 == 0) {
            float width = (rectF2.width() - org.telegram.messenger.g0.L(8.0f)) / 6.0f;
            float min4 = Math.min(width - org.telegram.messenger.g0.L(f37), org.telegram.messenger.g0.L(44.0f));
            int i33 = z0Var.h1 > f12 ? i12 : 0;
            float V0 = i33 != 0 ? z0Var.V0() : 1.0f;
            if (i33 != 0) {
                f28 = 1.0f;
                float f43 = 1.0f - V0;
                T1 = org.telegram.messenger.g0.T1(0.8f, 1.0f, org.telegram.ui.Cells.y0.x(f43, f43, f43, 1.0f));
                f29 = 0.8f;
            } else {
                f28 = 1.0f;
                f29 = 0.8f;
                T1 = org.telegram.messenger.g0.T1(0.96f, 1.0f, z0Var.z7);
            }
            if (i33 != 0 && V0 < f28) {
                z0Var.invalidate();
            }
            canvas2.save();
            float centerX = rectF2.centerX();
            float f44 = z0Var.k1;
            canvas2.scale(T1, T1, centerX, i33 != 0 ? f44 + f16 : e2.A(f16, f15, 2.0f, f44 + f15));
            int i34 = 0;
            while (i34 < a.b.length) {
                int e12 = e1(i34);
                float f45 = f12;
                float b11 = i20.b(i34 % 6, f45, width, rectF2.left + org.telegram.messenger.g0.L(4.0f));
                float b13 = i20.b(i34 / 6, f45, width, L6);
                float f46 = b13 - z0Var.k1;
                float f47 = L6;
                if (f46 > i10 + width || f46 < f15 - width) {
                    f30 = f15;
                    i18 = i31;
                    i19 = i29;
                    f31 = width;
                } else {
                    float max2 = Math.max(0.0f, Math.min(f37, (f46 - f15) / width));
                    float l12 = Utilities.l(i33 != 0 ? ((V0 * 420.0f) - (max2 * 12.0f)) / 300.0f : (z0Var.z7 - (max2 * 0.02f)) / f29);
                    float f48 = i33 != 0 ? 0.82f : 0.85f;
                    float f49 = 1.0f - l12;
                    float k12 = (((1.0f - ((f49 * f49) * f49)) * (1.0f - f48)) + f48) * z0Var.k1(i34);
                    if (k12 != 1.0f) {
                        canvas2.save();
                        canvas2.scale(k12, k12, b11, b13);
                    }
                    float f50 = min4 / 2.0f;
                    float f51 = f15;
                    if (e12 == I9) {
                        i20 = -12602881;
                    } else {
                        k();
                        i20 = E9[e12];
                    }
                    int i35 = i20;
                    if (e12 == I9) {
                        i21 = -15308082;
                    } else {
                        k();
                        i21 = F9[e12];
                    }
                    int i36 = i21;
                    x0 x0Var2 = z0Var.n;
                    if (x0Var2 != null && x0Var2.a == 0) {
                        int i37 = x0Var2.f;
                    }
                    float f52 = i34 == z0Var.v8 ? z0Var.x8 : i34 == z0Var.w8 ? z0Var.y8 : 0.0f;
                    paint.setColor(-1);
                    int length = z0Var.s8.length;
                    int[] iArr = a.b;
                    float f53 = f52;
                    if (length != iArr.length) {
                        z0Var.s8 = new LinearGradient[iArr.length];
                        z0Var.t8 = new int[iArr.length];
                    }
                    LinearGradient[] linearGradientArr = z0Var.s8;
                    LinearGradient linearGradient = linearGradientArr[i34];
                    LinearGradient[] linearGradientArr2 = linearGradient != null ? linearGradientArr : linearGradientArr;
                    LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, 1.0f, 1.0f, i35, i36, Shader.TileMode.CLAMP);
                    linearGradientArr2[i34] = linearGradient2;
                    z0Var.t8[i34] = (i35 * 31) + i36;
                    linearGradient = linearGradient2;
                    float f54 = f50 * 2.0f;
                    Matrix matrix = z0Var.e7;
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
                    RectF rectF10 = z0Var.d7;
                    rectF10.set(f55 + max3, f56 + max3, f57, f58);
                    i19 = i29;
                    float f59 = f53;
                    f31 = width;
                    float f60 = f29;
                    f30 = f51;
                    z0Var.u8.a(f50 - max3, 1.0f, 3, canvas, rectF10);
                    canvas2 = canvas;
                    if (f59 > 0.01f) {
                        boolean z14 = i34 == z0Var.v8;
                        float L7 = (f50 - org.telegram.messenger.g0.L(4.0f)) - org.telegram.messenger.g0.L(1.0f);
                        float T15 = z14 ? org.telegram.messenger.g0.T1(f60, 1.0f, f59) * L7 : org.telegram.messenger.g0.T1(f50 - org.telegram.messenger.g0.N(1.0f), L7, f59);
                        float L8 = org.telegram.messenger.g0.L(2.0f);
                        if (!z14) {
                            L8 *= f59;
                        }
                        float min5 = z14 ? f59 : Math.min(1.0f, f59 * 3.0f);
                        double h = i0.a.h(i35);
                        Paint paint2 = z0Var.B1;
                        if (h > 0.62d) {
                            paint2.setColor(a(min5, 939524096));
                            float N = org.telegram.messenger.g0.N(1.2f);
                            if (z14) {
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
                        z0Var.invalidate();
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
                boolean z15 = z0Var.h1 > 0.5f;
                float V02 = z15 ? z0Var.V0() : 1.0f;
                boolean z16 = z15 && V02 < 1.0f;
                if (z16) {
                    float f63 = 1.0f - V02;
                    float T16 = org.telegram.messenger.g0.T1(0.75f, 1.0f, org.telegram.ui.Cells.y0.x(f63, f63, f63, 1.0f));
                    canvas2.save();
                    canvas2.scale(T16, T16, rectF2.centerX(), z0Var.k1 + f16);
                    z0Var.invalidate();
                }
                boolean h02 = z0Var.h0();
                ArrayList arrayList3 = z0Var.w1;
                if (h02) {
                    float centerX2 = rectF2.centerX();
                    float L10 = org.telegram.messenger.g0.L(99.0f);
                    Typeface o4 = org.telegram.messenger.g0.o();
                    f20 = 250.0f;
                    TextPaint textPaint = z0Var.b8;
                    textPaint.setTypeface(o4);
                    textPaint.setTextSize(org.telegram.messenger.g0.L(16.0f));
                    Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
                    int width2 = (int) (rectF2.width() - org.telegram.messenger.g0.L(32.0f));
                    f17 = f16;
                    f18 = V02;
                    boolean z17 = z0Var.x1 > 0;
                    boolean z18 = !z17;
                    StaticLayout staticLayout = z0Var.g8;
                    boolean z19 = z17;
                    TextPaint textPaint2 = z0Var.c8;
                    if (staticLayout == null || z0Var.h8 != width2 || z0Var.i8 != z18) {
                        z0Var.h8 = width2;
                        z0Var.i8 = z18;
                        textPaint2.setTextSize(org.telegram.messenger.g0.L(14.0f));
                        Paint.FontMetrics fontMetrics2 = textPaint2.getFontMetrics();
                        z0Var.g8 = new StaticLayout(hd.M0(!z19 ? 2131746501 : 2131746493, null), textPaint2, width2, Layout.Alignment.ALIGN_CENTER, 1.0f, org.telegram.messenger.g0.L(18.5f) - (fontMetrics2.descent - fontMetrics2.ascent), false);
                    }
                    float A = e2.A(org.telegram.messenger.g0.L(300.0f), ((((fontMetrics.descent - fontMetrics.ascent) + (org.telegram.messenger.g0.L(22.0f) + L10)) + org.telegram.messenger.g0.L(7.0f)) + z0Var.g8.getHeight()) + (z0Var.x1 > 0 ? org.telegram.messenger.g0.L(20.0f) + org.telegram.messenger.g0.L(36.0f) : 0), 2.0f, f61) - org.telegram.messenger.g0.L(8.0f);
                    TLRPC.Document document2 = z0Var.q8;
                    int i38 = z0Var.b;
                    if (document2 != null) {
                        f26 = A;
                        f25 = 36.0f;
                        document = document2;
                    } else {
                        if (z0Var.p8 == null) {
                            TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                            z0Var.p8 = tL_inputStickerSetShortName;
                            f25 = 36.0f;
                            tL_inputStickerSetShortName.short_name = "Redo_edc21keMa";
                        } else {
                            f25 = 36.0f;
                        }
                        if (z0Var.o8) {
                            f26 = A;
                            document = null;
                        } else {
                            z0Var.o8 = true;
                            f26 = A;
                            TLRPC.TL_messages_stickerSet l02 = si.b0(i38).l0(z0Var.p8, null, false, false, new ai.g0(z0Var, 7));
                            if (l02 != null && (arrayList2 = l02.documents) != null && !arrayList2.isEmpty()) {
                                z0Var.q8 = l02.documents.get(0);
                            }
                            document = z0Var.q8;
                        }
                    }
                    if (document != null) {
                        g5 g5Var = z0Var.l8;
                        f19 = f61;
                        rectF5 = rectF7;
                        if (g5Var == null || z0Var.n8 != document.id) {
                            if (g5Var != null) {
                                g5Var.n(z0Var);
                            }
                            g5 l13 = g5.l(i38, 14, document);
                            z0Var.l8 = l13;
                            l13.a(z0Var);
                            z0Var.n8 = document.id;
                            z0Var.r8 = 0L;
                        }
                    } else {
                        f19 = f61;
                        rectF5 = rectF7;
                    }
                    g5 g5Var2 = z0Var.l8;
                    u2 u2Var = g5Var2 != null ? g5Var2.k : null;
                    long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                    if (u2Var == null || !u2Var.I()) {
                        z10 = z16;
                        j3 = 0;
                    } else {
                        z10 = z16;
                        j3 = 0;
                        if (z0Var.r8 == 0) {
                            z0Var.r8 = currentAnimationTimeMillis;
                        }
                    }
                    float min6 = z0Var.r8 == j3 ? 0.0f : Math.min(1.0f, (currentAnimationTimeMillis - r12) / 250.0f);
                    float C = e2.C(min6, 2.0f, 3.0f, min6 * min6);
                    float l14 = z0Var.h1 > 0.5f ? Utilities.l(z0Var.V0() / 0.7f) : 1.0f;
                    float f64 = 1.0f - l14;
                    float x11 = org.telegram.ui.Cells.y0.x(f64, f64, f64, 1.0f);
                    float T17 = org.telegram.messenger.g0.T1(0.95f, 1.0f, x11);
                    if (l14 < 1.0f) {
                        z0Var.invalidate();
                    }
                    canvas2.save();
                    canvas2.translate(0.0f, (1.0f - x11) * org.telegram.messenger.g0.L(6.0f));
                    float f65 = L10 / 2.0f;
                    canvas2.scale(T17, T17, centerX2, (f26 - org.telegram.messenger.g0.L(2.0f)) + f65);
                    if (C < 1.0f) {
                        if (z0Var.m8 == null) {
                            int i39 = (int) L10;
                            ch0 ch0Var = new ch0(R.raw.qr_resistance_dog, i39, i39, true, null);
                            z0Var.m8 = ch0Var;
                            ch0Var.K(1);
                            z0Var.m8.J(true);
                            z0Var.m8.R(z0Var);
                            z0Var.m8.setCallback(z0Var);
                            z0Var.m8.start();
                        }
                        if (z0Var.m8.u()) {
                            f27 = centerX2;
                            z0Var.m8.setBounds((int) (centerX2 - f65), (int) (f26 - org.telegram.messenger.g0.L(2.0f)), (int) (centerX2 + f65), (int) ((f26 - org.telegram.messenger.g0.L(2.0f)) + L10));
                            z0Var.m8.setAlpha((int) ((1.0f - C) * f13 * 255.0f));
                            z0Var.m8.draw(canvas2);
                        } else {
                            f27 = centerX2;
                        }
                        z0Var.invalidate();
                    } else {
                        f27 = centerX2;
                        ch0 ch0Var2 = z0Var.m8;
                        if (ch0Var2 != null) {
                            ch0Var2.C(false);
                            z0Var.m8 = null;
                        }
                    }
                    g5 g5Var3 = z0Var.l8;
                    if (g5Var3 != null && C > 0.0f) {
                        g5Var3.setBounds((int) (f27 - f65), (int) (f26 - org.telegram.messenger.g0.L(2.0f)), (int) (f27 + f65), (int) ((f26 - org.telegram.messenger.g0.L(2.0f)) + L10));
                        z0Var.l8.setAlpha((int) (f13 * 255.0f * C));
                        z0Var.l8.draw(canvas2);
                    }
                    canvas2.restore();
                    textPaint.setColor(-1);
                    int i40 = (int) (f13 * 255.0f);
                    textPaint.setAlpha(i40);
                    Paint.FontMetrics fontMetrics3 = textPaint.getFontMetrics();
                    float L11 = ((f26 + L10) + org.telegram.messenger.g0.L(18.0f)) - fontMetrics3.ascent;
                    String str = z0Var.j8;
                    canvas2.drawText(str, f27 - (textPaint.measureText(str) / 2.0f), L11, textPaint);
                    textPaint2.setColor(-1);
                    textPaint2.setAlpha((int) (191.0f * f13));
                    float L12 = L11 + fontMetrics3.descent + org.telegram.messenger.g0.L(7.0f);
                    canvas2.save();
                    canvas2.translate(f27 - (z0Var.g8.getWidth() / 2.0f), L12);
                    z0Var.g8.draw(canvas2);
                    canvas2.restore();
                    long j10 = z0Var.x1;
                    RectF rectF11 = z0Var.a8;
                    if (j10 > 0) {
                        float height2 = L12 + z0Var.g8.getHeight() + org.telegram.messenger.g0.L(20.0f);
                        Typeface o10 = org.telegram.messenger.g0.o();
                        TextPaint textPaint3 = z0Var.d8;
                        textPaint3.setTypeface(o10);
                        textPaint3.setTextSize(org.telegram.messenger.g0.L(14.0f));
                        String str2 = z0Var.k8;
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
                        z0Var.M(canvas2, 10, rectF11, true);
                        Typeface o11 = org.telegram.messenger.g0.o();
                        TextPaint textPaint4 = z0Var.f8;
                        textPaint4.setTypeface(o11);
                        textPaint4.setTextSize(org.telegram.messenger.g0.L(14.0f));
                        Paint.FontMetrics fontMetrics4 = textPaint4.getFontMetrics();
                        canvas2.drawText(str2, f27 - (textPaint4.measureText(str2) / 2.0f), rectF11.centerY() - ((fontMetrics4.ascent + fontMetrics4.descent) / 2.0f), textPaint4);
                        canvas2.restoreToCount(saveLayer);
                        if (z0Var.e8 == null) {
                            TextPaint textPaint5 = new TextPaint(1);
                            z0Var.e8 = textPaint5;
                            textPaint5.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.MULTIPLY));
                        }
                        z0Var.e8.setTypeface(org.telegram.messenger.g0.o());
                        z0Var.e8.setTextSize(org.telegram.messenger.g0.L(14.0f));
                        x0 x0Var3 = z0Var.n;
                        z0Var.e8.setColor(D0(0.9f, 1.4f, 0.1f, x0Var3 != null ? i0.a.f(0.5f, x0Var3.b, x0Var3.c) : -8355712));
                        z0Var.e8.setAlpha(i40);
                        canvas2.drawText(str2, f27 - (z0Var.e8.measureText(str2) / 2.0f), rectF11.centerY() - ((fontMetrics4.ascent + fontMetrics4.descent) / 2.0f), z0Var.e8);
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
                    z10 = z16;
                    arrayList = arrayList3;
                    f20 = 250.0f;
                    if (arrayList.isEmpty()) {
                        TextPaint textPaint6 = z0Var.D1;
                        textPaint6.setColor(-1275068417);
                        textPaint6.setTextSize(org.telegram.messenger.g0.L(14.0f));
                        String M0 = hd.M0(!z0Var.y1 ? 2131746495 : z0Var.x1 < 0 ? 2131746501 : 2131746494, null);
                        canvas2.drawText(M0, (f34 - textPaint6.measureText(M0)) / 2.0f, L6 + org.telegram.messenger.g0.L(40.0f), textPaint6);
                    }
                }
                int f02 = z0Var.f0();
                int size = arrayList.size();
                float width3 = (rectF2.width() - org.telegram.messenger.g0.L(8.0f)) / 3.0f;
                float f68 = f02;
                float width4 = (rectF2.width() - org.telegram.messenger.g0.L(8.0f)) / f68;
                float f69 = L6 + 0.0f;
                z0Var.r6 = false;
                z0Var.j6 = 0;
                int max4 = (int) Math.max(0.0d, Math.floor(((f19 + z0Var.k1) - f69) / width3));
                z0Var.h6 = max4;
                int max5 = (int) Math.max(max4, Math.floor(((f17 + z0Var.k1) - f69) / width3));
                z0Var.i6 = max5;
                int i41 = (max5 - z0Var.h6) + 1;
                boolean z20 = z0Var.h1 < 0.5f;
                z0Var.g6 = z20;
                if (z20) {
                    z0Var.l6 = AnimationUtils.currentAnimationTimeMillis() - z0Var.e6;
                    z0Var.k6 = Math.min(25.0f, 60.0f / Math.max(1, r1));
                    z0Var.m6 = 0.6f;
                    z0Var.n6 = org.telegram.messenger.g0.L(4.0f);
                    z11 = true;
                } else {
                    float currentAnimationTimeMillis2 = !z0Var.f6 ? 0.0f : AnimationUtils.currentAnimationTimeMillis() - z0Var.d6;
                    z0Var.l6 = currentAnimationTimeMillis2;
                    if (currentAnimationTimeMillis2 > 470.0f) {
                        z0Var.l6 = -1.0f;
                        z11 = true;
                        if (z15) {
                            z0Var.l6 = -1.0f;
                        }
                        i15 = 0;
                        while (true) {
                            fArr = z0Var.o6;
                            if (i15 < size) {
                                break;
                            }
                            float f70 = i15 % f02;
                            float L14 = (width4 * f70) + rectF2.left + org.telegram.messenger.g0.L(4.0f);
                            float f71 = ((i15 / f02) * width3) + f69;
                            float f72 = z0Var.k1;
                            if (f71 - f72 <= f17) {
                                float f73 = f71 + width3;
                                if (f73 - f72 >= f19) {
                                    z0Var.q6 = 1.0f;
                                    if (z0Var.l6 < 0.0f) {
                                        f21 = 1.0f;
                                    } else {
                                        if (z0Var.g6) {
                                            float l15 = Utilities.l((z0Var.l6 - ((f70 * 3.0f) + (Math.max(0, r1 - z0Var.h6) * z0Var.k6))) / 90.0f);
                                            f21 = 1.0f;
                                            z0Var.q6 = org.telegram.messenger.g0.T1(1.0f, z0Var.m6, l15 * l15);
                                            if (l15 >= 0.7f) {
                                                f22 = k5.y(l15, 0.7f, 0.3f, 1.0f);
                                            }
                                        } else {
                                            float l16 = Utilities.l((z0Var.l6 - ((f70 * 4.0f) + (Math.max(0, z0Var.i6 - r1) * z0Var.k6))) / 220.0f);
                                            float f74 = z0Var.m6;
                                            if (z0Var.r6) {
                                                x10 = S(l16, f62);
                                                f21 = 1.0f;
                                            } else {
                                                f21 = 1.0f;
                                                float f75 = 1.0f - l16;
                                                x10 = org.telegram.ui.Cells.y0.x(f75, f75, f75, 1.0f);
                                            }
                                            z0Var.q6 = org.telegram.messenger.g0.T1(f74, f21, x10);
                                            float l17 = f21 - Utilities.l(l16 / f10);
                                            f22 = f21 - (l17 * l17);
                                        }
                                        z13 = f22 >= f21 || z0Var.q6 != f21;
                                        if (z13) {
                                            canvas2.save();
                                            float f76 = f21;
                                            float f77 = f22;
                                            canvas2.translate(0.0f, Utilities.l((f76 - z0Var.q6) / (f76 - z0Var.m6)) * z0Var.n6);
                                            float f78 = z0Var.q6;
                                            canvas2.scale(f78, f78, (width4 / 2.0f) + L14, (width3 / 2.0f) + f71);
                                            if (f22 < f21) {
                                                float f79 = L14 + width4;
                                                int i42 = z0Var.j6;
                                                if (i42 < 64) {
                                                    z0Var.j6 = i42 + 1;
                                                    int i43 = i42 * 5;
                                                    fArr[i43] = L14;
                                                    fArr[i43 + 1] = f71;
                                                    fArr[i43 + 2] = f79;
                                                    fArr[i43 + 3] = f73;
                                                    fArr[i43 + 4] = f77;
                                                }
                                            }
                                        }
                                        if (z10) {
                                            f23 = 1.0f;
                                            f24 = 1.0f;
                                        } else {
                                            f23 = 1.0f;
                                            float l18 = 1.0f - Utilities.l(((f18 * 420.0f) - (Math.max(0.0f, Math.min(10.0f, ((f71 - z0Var.k1) - f19) / width3)) * 12.0f)) / 300.0f);
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
                                        w0Var = z0Var.G;
                                        rectF4 = rectF2;
                                        i17 = i23;
                                        if (w0Var.a == i17) {
                                            int i44 = w0Var.q;
                                        }
                                        z0 z0Var3 = z0Var;
                                        z12 = true;
                                        f62 = 1.2f;
                                        z0Var3.I(canvas, i15, tL_starGiftUnique, L15, L16, L17, L18);
                                        z0Var = z0Var3;
                                        if (f24 != f23) {
                                            canvas.restore();
                                        }
                                        if (!z13) {
                                            canvas.restore();
                                        }
                                        i15++;
                                        canvas2 = canvas;
                                        i23 = i17;
                                        z11 = z12;
                                        rectF2 = rectF4;
                                    }
                                    f22 = f21;
                                    if (f22 >= f21) {
                                    }
                                    if (z13) {
                                    }
                                    if (z10) {
                                    }
                                    if (f24 == f23) {
                                    }
                                    TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) arrayList.get(i15);
                                    float L152 = L14 + org.telegram.messenger.g0.L(4.0f);
                                    float L162 = f71 + org.telegram.messenger.g0.L(4.0f);
                                    float L172 = width4 - org.telegram.messenger.g0.L(8.0f);
                                    float L182 = width3 - org.telegram.messenger.g0.L(8.0f);
                                    w0Var = z0Var.G;
                                    rectF4 = rectF2;
                                    i17 = i23;
                                    if (w0Var.a == i17) {
                                    }
                                    z0 z0Var32 = z0Var;
                                    z12 = true;
                                    f62 = 1.2f;
                                    z0Var32.I(canvas, i15, tL_starGiftUnique2, L152, L162, L172, L182);
                                    z0Var = z0Var32;
                                    if (f24 != f23) {
                                    }
                                    if (!z13) {
                                    }
                                    i15++;
                                    canvas2 = canvas;
                                    i23 = i17;
                                    z11 = z12;
                                    rectF2 = rectF4;
                                }
                            }
                            z12 = z11;
                            rectF4 = rectF2;
                            i17 = i23;
                            i15++;
                            canvas2 = canvas;
                            i23 = i17;
                            z11 = z12;
                            rectF2 = rectF4;
                        }
                        for (i16 = 0; i16 < z0Var.j6; i16++) {
                            int i45 = i16 * 5;
                            int i46 = (int) (fArr[i45 + 4] * 255.0f);
                            Paint paint3 = z0Var.p6;
                            paint3.setAlpha(i46);
                            canvas.drawRect(fArr[i45], fArr[i45 + 1], fArr[i45 + 2], fArr[i45 + 3], paint3);
                        }
                        z0Var.j6 = 0;
                        if (z10) {
                            canvas.restore();
                        }
                        canvas.restore();
                        if (i13 != 0) {
                            float L19 = org.telegram.messenger.g0.L(12.0f);
                            Matrix matrix2 = z0Var.D7;
                            matrix2.setScale(1.0f, L19);
                            RectF rectF12 = rectF3;
                            matrix2.postTranslate(0.0f, rectF12.top);
                            LinearGradient linearGradient3 = z0Var.B7;
                            linearGradient3.setLocalMatrix(matrix2);
                            float f80 = rectF12.left;
                            float f81 = rectF12.top;
                            canvas.drawRect(f80, f81, rectF12.right, f81 + L19, z0Var.C7);
                            matrix2.setScale(1.0f, -L19);
                            matrix2.postTranslate(0.0f, rectF12.bottom);
                            linearGradient3.setLocalMatrix(matrix2);
                            float f82 = rectF12.left;
                            float f83 = rectF12.bottom;
                            canvas.drawRect(f82, f83 - L19, rectF12.right, f83, z0Var.C7);
                            canvas.restore();
                        }
                        canvas.restore();
                        if (i14 != 0) {
                            canvas.restore();
                            return;
                        }
                        return;
                    }
                    z11 = true;
                    z0Var.k6 = Math.min(45.0f, (f20 - (f68 * 4.0f)) / Math.max(1, i41));
                    z0Var.m6 = 0.7f;
                    z0Var.n6 = org.telegram.messenger.g0.L(7.0f);
                }
                z0Var.invalidate();
                if (z15) {
                }
                i15 = 0;
                while (true) {
                    fArr = z0Var.o6;
                    if (i15 < size) {
                    }
                    i15++;
                    canvas2 = canvas;
                    i23 = i17;
                    z11 = z12;
                    rectF2 = rectF4;
                }
                while (i16 < z0Var.j6) {
                }
                z0Var.j6 = 0;
                if (z10) {
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
        x0 x0Var = this.n;
        if (x0Var == null) {
            return -16777216;
        }
        if (this.s >= 1.0f || this.r == null) {
            return x0Var.e;
        }
        float l10 = (l() / 2.0f) + m();
        float l11 = Utilities.l(((((((float) Math.hypot(Math.max(this.x, getWidth() - this.x), Math.max(this.y, getHeight() - this.y))) + org.telegram.messenger.g0.L(60.0f)) * y1(this.s)) - ((float) Math.hypot((getWidth() / 2.0f) - this.x, l10 - this.y))) + org.telegram.messenger.g0.L(80.0f)) / org.telegram.messenger.g0.L(160.0f));
        int i7 = this.r.e;
        int i10 = this.n.e;
        float C = e2.C(l11, 2.0f, 3.0f, l11 * l11);
        double[] dArr = this.r3;
        i0.a.j(i7, dArr);
        double[] dArr2 = this.s3;
        i0.a.j(i10, dArr2);
        double d = C;
        double[] dArr3 = this.t3;
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

    public final void O(float f10, float f11, float f12, int i7, Canvas canvas, boolean z10) {
        PorterDuffColorFilter n1 = n1(i7);
        a1 a1Var = this.U1;
        a1Var.setColorFilter(n1);
        a1Var.setAlpha(ns.e4);
        float f13 = f12 / 2.0f;
        float f14 = f11 - f13;
        float f15 = f10 + f12;
        float f16 = f11 + f13;
        a1Var.setBounds((int) f10, (int) f14, (int) f15, (int) f16);
        if (!z10) {
            a1Var.draw(canvas);
            return;
        }
        float f17 = f12 * 0.095f;
        float f18 = (0.28f * f12) + f10;
        float f19 = f11 - (0.21f * f12);
        float f20 = (0.74f * f12) + f10;
        float f21 = (0.25f * f12) + f11;
        RectF rectF = this.W5;
        rectF.set(f10 - org.telegram.messenger.g0.L(2.0f), f14 - org.telegram.messenger.g0.L(2.0f), f15 + org.telegram.messenger.g0.L(2.0f), f16 + org.telegram.messenger.g0.L(2.0f));
        canvas.saveLayer(rectF, null);
        a1Var.draw(canvas);
        Paint paint = this.Z1;
        paint.setStrokeWidth((0.065f * f12 * 2.0f) + f17);
        canvas.drawLine(f18, f19, f20, f21, paint);
        canvas.restore();
        Paint paint2 = this.B1;
        paint2.setColor(i7);
        paint2.setStrokeWidth(f17);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        canvas.drawLine(f18, f19, f20, f21, paint2);
        paint2.setStrokeCap(Paint.Cap.BUTT);
    }

    public final void O0() {
        this.Y1.C(false);
        Bitmap bitmap = this.S2;
        if (bitmap != null) {
            bitmap.recycle();
            this.S2 = null;
        }
        ch0 ch0Var = this.b9;
        if (ch0Var != null) {
            ch0Var.C(false);
            this.b9 = null;
        }
        ch0 ch0Var2 = this.m8;
        if (ch0Var2 != null) {
            ch0Var2.C(false);
            this.m8 = null;
        }
        g5 g5Var = this.l8;
        if (g5Var != null) {
            g5Var.n(this);
            this.l8 = null;
            this.n8 = 0L;
        }
        P0(this.G);
        P0(this.H);
        removeCallbacks(this.q9);
        l8 l8Var = this.j2;
        if (l8Var != null) {
            l8Var.f();
        }
        VelocityTracker velocityTracker = this.l0;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.l0 = null;
        }
        VelocityTracker velocityTracker2 = this.n9;
        if (velocityTracker2 != null) {
            velocityTracker2.recycle();
            this.n9 = null;
        }
        HashMap hashMap = this.K7;
        Iterator it = hashMap.values().iterator();
        while (it.hasNext()) {
            ((g5) it.next()).n(this);
        }
        for (Drawable drawable : this.K.values()) {
            if (drawable instanceof g5) {
                ((g5) drawable).n(this);
            }
        }
        hashMap.clear();
        HashMap hashMap2 = this.L7;
        Iterator it2 = hashMap2.values().iterator();
        while (it2.hasNext()) {
            e5 e5Var = ((y0) it2.next()).a;
            if (e5Var != null) {
                e5Var.b();
            }
        }
        hashMap2.clear();
    }

    public final void P(float f10, float f11, float f12, float f13, Canvas canvas) {
        if (this.q1 == null || f13 <= 0.004f) {
            return;
        }
        float L = org.telegram.messenger.g0.L(15.0f);
        TextPaint textPaint = this.z2;
        textPaint.setTextSize(L);
        textPaint.setColor(-1);
        textPaint.setAlpha((int) (f13 * 255.0f));
        canvas.drawText(this.q1, ((f10 + f12) - org.telegram.messenger.g0.L(16.0f)) - textPaint.measureText(this.q1), f11 + org.telegram.messenger.g0.L(5.0f), textPaint);
        textPaint.setAlpha(ns.e4);
    }

    public final void P0(w0 w0Var) {
        if (w0Var == null) {
            return;
        }
        g5 g5Var = w0Var.c;
        if (g5Var != null) {
            g5Var.n(this);
        }
        g5 g5Var2 = w0Var.d;
        if (g5Var2 != null && !this.K7.containsValue(g5Var2)) {
            w0Var.d.n(this);
        }
        w0Var.G = true;
        t tVar = w0Var.F;
        if (tVar != null) {
            tVar.e = true;
            ns.f(tVar.a).n(tVar, ns.Y1);
            w0Var.F = null;
        }
    }

    public final void Q(float f10, float f11, float f12, Canvas canvas, boolean z10) {
        Canvas canvas2;
        float f13;
        float f14;
        if (this.X8 == 0) {
            canvas2 = canvas;
            ch0 r12 = r1();
            int L = org.telegram.messenger.g0.L(27.0f);
            float f15 = L / 2.0f;
            int i7 = (int) (f11 - f15);
            r12.setBounds((int) ((org.telegram.messenger.g0.L(26.0f) + f10) - f15), i7, ((int) ((org.telegram.messenger.g0.L(26.0f) + f10) - f15)) + L, L + i7);
            r12.draw(canvas2);
        } else if (z10) {
            float L2 = f11 - org.telegram.messenger.g0.L(10.0f);
            Paint.Style style = Paint.Style.STROKE;
            Paint paint = this.S8;
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
                float x10 = org.telegram.ui.Cells.y0.x(l10, l10, l10, 1.0f);
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
            RectF rectF = this.T8;
            rectF.set(L3 - L5, f18, L3 + L5, L5 + L4);
            canvas.drawArc(rectF, -82.0f, f16 * 344.0f, false, paint);
            canvas.drawLine(L3, f18, L3, L2 + org.telegram.messenger.g0.L(2.2f), paint);
            double radians = Math.toRadians(f13 - 90.0f);
            canvas2 = canvas;
            canvas2.drawLine(L3, L4, org.telegram.ui.Cells.y0.d(3.8f, (float) Math.cos(radians), L3), org.telegram.ui.Cells.y0.d(3.8f, (float) Math.sin(radians), L4), paint);
            paint.setStyle(Paint.Style.FILL);
            canvas2.drawCircle(L3, L4, org.telegram.messenger.g0.N(1.2f), paint);
        } else {
            canvas2 = canvas;
            if (n()) {
                ch0 p12 = p1();
                int L6 = org.telegram.messenger.g0.L(28.0f);
                float f19 = L6 / 2.0f;
                int i10 = (int) (f11 - f19);
                p12.setBounds((int) ((org.telegram.messenger.g0.L(26.0f) + f10) - f19), i10, ((int) ((org.telegram.messenger.g0.L(26.0f) + f10) - f19)) + L6, L6 + i10);
                p12.draw(canvas2);
            } else {
                int i11 = this.X8;
                if (i11 == R.drawable.msg_download) {
                    ch0 q12 = q1();
                    int L7 = org.telegram.messenger.g0.L(28.0f);
                    float f20 = L7 / 2.0f;
                    int i12 = (int) (f11 - f20);
                    q12.setBounds((int) ((org.telegram.messenger.g0.L(26.0f) + f10) - f20), i12, ((int) ((org.telegram.messenger.g0.L(26.0f) + f10) - f20)) + L7, L7 + i12);
                    q12.draw(canvas2);
                } else {
                    o0(canvas2, i11 == R.drawable.msg_retry ? this.S1 : i11 == R.drawable.msg_copy ? this.K1 : this.T1, f10 + org.telegram.messenger.g0.L(26.0f), f11, org.telegram.messenger.g0.L(20.0f), 1.0f);
                    canvas2 = canvas2;
                }
            }
        }
        TextPaint textPaint = this.D1;
        textPaint.setColor(-1);
        float f21 = this.t1;
        if (f21 <= 0.0f) {
            f21 = org.telegram.messenger.g0.L(15.0f);
        }
        textPaint.setTextSize(f21);
        String str = this.V8;
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
        TextPaint textPaint2 = this.z2;
        textPaint2.setTextSize(textSize);
        textPaint2.setColor(textPaint.getColor());
        canvas2.drawText(this.w2, L8, L10, textPaint);
        float measureText = textPaint.measureText(this.w2) + L8;
        canvas2.drawText(this.x2, measureText, L10, textPaint2);
        canvas2.drawText(this.y2, textPaint2.measureText(this.x2) + measureText, L10, textPaint);
    }

    public final void Q0() {
        int i7 = this.s9;
        if (i7 >= 0) {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.z9[i7] = X0(i7, currentAnimationTimeMillis);
            this.y9[i7] = currentAnimationTimeMillis;
            invalidate();
        }
        this.s9 = -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:172:0x040b, code lost:
    
        if (r3.b0 < (r3.e[0] - 1)) goto L219;
     */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0426  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0448  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0491  */
    /* JADX WARN: Removed duplicated region for block: B:185:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:186:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0264  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void R(Canvas canvas, int i7, long j3) {
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        boolean z10;
        float f15;
        float f16;
        float max;
        float f17;
        float f18;
        float height;
        int L;
        float f19;
        boolean z11;
        float f20;
        float C;
        boolean z12;
        boolean z13;
        boolean z14;
        ch0 ch0Var;
        String sb2;
        float f21;
        float f22;
        float L2;
        ch0 ch0Var2;
        float f23;
        String str;
        boolean z15 = this.h9 || (this.n1 != null && j3 < this.v1);
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        if (!this.h9 && z15 && this.O8 && (str = this.V8) != null && !str.equals(this.n1)) {
            this.O8 = false;
            this.N8 = currentAnimationTimeMillis;
        }
        if (!z15 || this.O8) {
            if (!z15 && this.O8) {
                this.O8 = false;
                this.N8 = currentAnimationTimeMillis;
            }
        } else if (this.V8 == null || currentAnimationTimeMillis - this.N8 >= 360) {
            this.O8 = true;
            this.N8 = currentAnimationTimeMillis;
            this.V8 = this.n1;
            int i10 = this.o1;
            this.X8 = i10;
            this.q1 = this.p1;
            this.W8 = false;
            this.Y8 = currentAnimationTimeMillis;
            if (i10 == 0) {
                ch0 r12 = r1();
                r12.N(0, false, false);
                r12.start();
            } else if (n()) {
                ch0 p12 = p1();
                p12.N(0, false, false);
                p12.start();
            } else if (this.X8 == R.drawable.msg_download) {
                ch0 q12 = q1();
                q12.N(0, false, false);
                q12.start();
            }
        }
        String str2 = this.V8;
        if (str2 == null) {
            return;
        }
        float f24 = (currentAnimationTimeMillis - this.N8) / 1000.0f;
        float f25 = 2.0f;
        if (this.O8) {
            boolean z16 = str2.indexOf(10) >= 0 || s1(this.V8) + ((float) org.telegram.messenger.g0.L(66.0f)) >= ((float) (i7 - org.telegram.messenger.g0.L(32.0f)));
            if (f24 >= 0.5f) {
                f13 = 1.0f;
                f23 = 1.0f;
            } else {
                f23 = 1.0f;
                f13 = (float) h1(f24, z16 ? 0.75d : 0.6d, 0.42d);
            }
            f10 = f23;
            f11 = 2.0f;
        } else {
            if (!this.W8) {
                if (f24 >= 0.36f) {
                    this.V8 = null;
                    return;
                }
                float f26 = f24 / 0.36f;
                float f27 = f26;
                int i11 = 0;
                float f28 = 1.0f;
                f10 = 1.0f;
                float f29 = 0.0f;
                while (i11 < 12) {
                    float f30 = (f29 + f28) / f25;
                    float f31 = 1.0f - f30;
                    float f32 = f25;
                    float f33 = f31 * 3.0f;
                    if (e2.x(f30, f30, f30, (f33 * f30 * f30 * 0.9f) + e2.D(f33, f31, f30, 0.5f)) < f26) {
                        f29 = f30;
                    } else {
                        f28 = f30;
                    }
                    i11++;
                    f27 = f30;
                    f25 = f32;
                }
                f11 = f25;
                f12 = 3.0f;
                f13 = 1.0f - (((f27 * f27) * f27) + (((((1.0f - f27) * 3.0f) * f27) * f27) * 0.5f));
                if (!this.O8 || f13 > 0.0f) {
                    invalidate();
                }
                boolean z17 = this.V8.indexOf(10) < 0;
                float L3 = org.telegram.messenger.g0.L(!z17 ? 14.0f : 15.0f);
                TextPaint textPaint = this.D1;
                textPaint.setTextSize(L3);
                float s12 = s1(this.V8);
                if (this.q1 == null) {
                    float L4 = org.telegram.messenger.g0.L(15.0f);
                    TextPaint textPaint2 = this.z2;
                    textPaint2.setTextSize(L4);
                    f14 = textPaint2.measureText(this.q1) + org.telegram.messenger.g0.L(16.0f);
                } else {
                    f14 = 0.0f;
                }
                float min = Math.min(i7 - org.telegram.messenger.g0.L(32.0f), org.telegram.messenger.g0.L(66.0f) + s12 + f14);
                float L5 = org.telegram.messenger.g0.L(!z17 ? 56.0f : 44.0f);
                float L6 = (min - org.telegram.messenger.g0.L(66.0f)) - f14;
                this.t1 = textPaint.getTextSize() * ((s12 > L6 || s12 <= 0.0f) ? f10 : Math.max(0.8f, L6 / s12));
                z10 = f13 >= 0.0f;
                float l10 = !z10 ? Utilities.l(f24 / 0.14f) : 0.0f;
                float max2 = Math.max(f13, 0.0f);
                if (z10) {
                    f15 = 0.8f;
                    f16 = f10;
                    max = (Math.max(0.0f, max2 - f16) + Math.min(f16, max2 / 0.55f)) * L5;
                } else {
                    f15 = 0.8f;
                    max = L5;
                    f16 = f10;
                }
                if (z10) {
                    float f34 = min - max;
                    if (max2 <= f16) {
                        max2 = g1(0.15f, f16, max2);
                    }
                    f17 = (f34 * max2) + max;
                } else {
                    f17 = org.telegram.messenger.g0.T1(min, L5, l10 * l10);
                }
                float x10 = !z10 ? org.telegram.ui.Cells.y0.x(l10, l10, l10, f16) : 1.0f;
                float f35 = f17;
                if (max >= 0.5f) {
                    return;
                }
                float f36 = i7 / f11;
                if (this.g1 > 0.001f) {
                    f18 = 0.15f;
                    height = a1() - (Utilities.l(this.g1) * b1());
                    L = org.telegram.messenger.g0.L(12.0f);
                } else {
                    f18 = 0.15f;
                    height = ((getHeight() - this.v3) - org.telegram.messenger.g0.L(40.0f)) - org.telegram.messenger.g0.L(20.0f);
                    L = org.telegram.messenger.g0.L(14.0f);
                }
                float f37 = this.h9 ? this.g9 : (height - L) - (L5 / f11);
                float f38 = f35 / f11;
                float f39 = max / f11;
                boolean z18 = z10;
                RectF rectF = this.M8;
                rectF.set(f36 - f38, f37 - f39, f38 + f36, f37 + f39);
                float min2 = Math.min(f39, org.telegram.messenger.g0.L(24.0f));
                Path path = this.F1;
                path.rewind();
                path.addRoundRect(rectF, min2, min2, Path.Direction.CW);
                this.U8 = 352321535;
                this.B6 = true;
                J(canvas, rectF, min2, x10);
                this.U8 = 0;
                this.B6 = false;
                float g12 = z18 ? 1.0f : g1(0.2f, 0.95f, f13);
                float l11 = z18 ? 1.0f - Utilities.l(f24 / 0.05f) : g1(0.08f, 0.5f, f13);
                if (l11 <= 0.004f) {
                    return;
                }
                boolean z19 = this.O8;
                float f40 = z19 ? (currentAnimationTimeMillis - this.Y8) / 1000.0f : -1.0f;
                float l12 = z19 ? Utilities.l((f24 - f18) / 0.23f) : 1.0f;
                float C2 = e2.C(l12, f11, f12, l11 * l12 * l12);
                if (this.O8 && l12 < 1.0f) {
                    invalidate();
                }
                int i12 = this.X8;
                if (i12 == R.drawable.msg_recent || (i12 == R.drawable.msg_retry && s0(this.V8))) {
                    f19 = f40;
                    z11 = true;
                } else {
                    f19 = f40;
                    z11 = false;
                }
                if (this.O8) {
                    f20 = 1.0f;
                    C = e2.z(1.0f, g12, 0.35f, 1.0f);
                } else {
                    f20 = 1.0f;
                    C = a8.p0.C(f35, min, 1.0f, 0.05f);
                }
                canvas.save();
                canvas.clipPath(path);
                canvas.scale(C, C, f36, f37);
                if (i() && ((this.T4 || this.a2) && canvas.isHardwareAccelerated())) {
                    if (this.c9 == null) {
                        this.c9 = android.support.v4.media.session.w.d("toastContent");
                    }
                    if ((this.X8 != 0 || (ch0Var2 = this.Z8) == null || ch0Var2.b0 >= ch0Var2.e[0] - 1) && (!n() || (ch0Var = this.a9) == null || ch0Var.b0 >= ch0Var.e[0] - 1)) {
                        ch0 ch0Var3 = this.b9;
                        if (ch0Var3 == null || this.X8 != R.drawable.msg_download) {
                            z12 = false;
                            z13 = true;
                        } else {
                            z12 = false;
                            z13 = true;
                        }
                        z14 = z12;
                        if ((z11 && f19 >= 0.0f && f19 < f15) || z14) {
                            z12 = z13;
                        }
                        if (z14) {
                            invalidate();
                        }
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(this.V8);
                        sb3.append(this.X8);
                        int i13 = (int) min;
                        sb3.append(i13);
                        sb3.append((int) this.t1);
                        sb2 = sb3.toString();
                        if (z12 && sb2.equals(this.e9) && v.e(this.c9)) {
                            f21 = f20;
                            f22 = f36;
                        } else {
                            this.e9 = sb2;
                            f21 = f20;
                            f22 = f36;
                            Q(0.0f, L5 / 2.0f, f19, v.a(i13, (int) L5, this.c9), z11);
                            v.d(this.c9);
                        }
                        L2 = (f21 - g12) * org.telegram.messenger.g0.L(5.0f);
                        if (Math.abs(L2 - this.d9) > 0.25f) {
                            this.d9 = L2;
                            Object obj = this.c9;
                            if (L2 <= 0.3f) {
                                L2 = 0.0f;
                            }
                            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                            v.j(obj, L2);
                        }
                        v.h(this.c9, l11);
                        float f41 = L5 / 2.0f;
                        canvas.translate(f22 - (min / 2.0f), f37 - f41);
                        v.c(canvas, this.c9);
                        P(0.0f, f41, min, C2, canvas);
                    } else {
                        z12 = false;
                        z13 = true;
                    }
                    z14 = z13;
                    if (z11) {
                        z12 = z13;
                        if (z14) {
                        }
                        StringBuilder sb32 = new StringBuilder();
                        sb32.append(this.V8);
                        sb32.append(this.X8);
                        int i132 = (int) min;
                        sb32.append(i132);
                        sb32.append((int) this.t1);
                        sb2 = sb32.toString();
                        if (z12) {
                        }
                        this.e9 = sb2;
                        f21 = f20;
                        f22 = f36;
                        Q(0.0f, L5 / 2.0f, f19, v.a(i132, (int) L5, this.c9), z11);
                        v.d(this.c9);
                        L2 = (f21 - g12) * org.telegram.messenger.g0.L(5.0f);
                        if (Math.abs(L2 - this.d9) > 0.25f) {
                        }
                        v.h(this.c9, l11);
                        float f412 = L5 / 2.0f;
                        canvas.translate(f22 - (min / 2.0f), f37 - f412);
                        v.c(canvas, this.c9);
                        P(0.0f, f412, min, C2, canvas);
                    }
                    z12 = z13;
                    if (z14) {
                    }
                    StringBuilder sb322 = new StringBuilder();
                    sb322.append(this.V8);
                    sb322.append(this.X8);
                    int i1322 = (int) min;
                    sb322.append(i1322);
                    sb322.append((int) this.t1);
                    sb2 = sb322.toString();
                    if (z12) {
                    }
                    this.e9 = sb2;
                    f21 = f20;
                    f22 = f36;
                    Q(0.0f, L5 / 2.0f, f19, v.a(i1322, (int) L5, this.c9), z11);
                    v.d(this.c9);
                    L2 = (f21 - g12) * org.telegram.messenger.g0.L(5.0f);
                    if (Math.abs(L2 - this.d9) > 0.25f) {
                    }
                    v.h(this.c9, l11);
                    float f4122 = L5 / 2.0f;
                    canvas.translate(f22 - (min / 2.0f), f37 - f4122);
                    v.c(canvas, this.c9);
                    P(0.0f, f4122, min, C2, canvas);
                } else {
                    float f42 = f19;
                    boolean z20 = z11;
                    canvas.saveLayerAlpha(rectF, (int) (l11 * 255.0f));
                    float f43 = f36 - (min / 2.0f);
                    Q(f43, f37, f42, canvas, z20);
                    canvas.restore();
                    P(f43, f37, min, C2, canvas);
                }
                canvas.restore();
                return;
            }
            if (f24 >= 0.14f) {
                this.V8 = null;
                this.W8 = false;
                return;
            } else {
                f10 = 1.0f;
                f11 = 2.0f;
                f13 = -1.0f;
            }
        }
        f12 = 3.0f;
        if (!this.O8) {
        }
        invalidate();
        if (this.V8.indexOf(10) < 0) {
        }
        float L32 = org.telegram.messenger.g0.L(!z17 ? 14.0f : 15.0f);
        TextPaint textPaint3 = this.D1;
        textPaint3.setTextSize(L32);
        float s122 = s1(this.V8);
        if (this.q1 == null) {
        }
        float min3 = Math.min(i7 - org.telegram.messenger.g0.L(32.0f), org.telegram.messenger.g0.L(66.0f) + s122 + f14);
        float L52 = org.telegram.messenger.g0.L(!z17 ? 56.0f : 44.0f);
        float L62 = (min3 - org.telegram.messenger.g0.L(66.0f)) - f14;
        this.t1 = textPaint3.getTextSize() * ((s122 > L62 || s122 <= 0.0f) ? f10 : Math.max(0.8f, L62 / s122));
        if (f13 >= 0.0f) {
        }
        if (!z10) {
        }
        float max22 = Math.max(f13, 0.0f);
        if (z10) {
        }
        if (z10) {
        }
        if (!z10) {
        }
        float f352 = f17;
        if (max >= 0.5f) {
        }
    }

    public final void R0() {
        float f10 = this.f0;
        if (f10 == 0.0f && this.g0 == 0.0f) {
            return;
        }
        this.j0 = f10;
        this.k0 = this.g0;
        this.a0 = AnimationUtils.currentAnimationTimeMillis();
        this.V = true;
    }

    public final void S0() {
        int i7 = this.W7;
        if (i7 < 0 || this.Y7 >= this.X7) {
            return;
        }
        this.Z7 = k1(i7);
        this.Y7 = AnimationUtils.currentAnimationTimeMillis();
        invalidate();
    }

    public final float T(float f10) {
        if (this.R4 >= 1.0f) {
            return 1.0f;
        }
        return org.telegram.messenger.g0.T1(this.U4 ? 0.85f : 0.92f, 1.0f, f10);
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
            float f10 = this.g1;
            this.g1 = 0.0f;
            int min = Math.min(height, (int) (width * 1.92f));
            int max = (int) Math.max(0.0f, Math.min(height - min, ((l() / 2.0f) + m()) - (min / 2.0f)));
            try {
                Bitmap.Config config = Bitmap.Config.ARGB_8888;
                Bitmap createBitmap = Bitmap.createBitmap(width, min, config);
                if (this.S2 == null) {
                    ch0 ch0Var = this.Y1;
                    if (ch0Var.b > 0) {
                        try {
                            rLottieNative = RLottieNative.b(org.telegram.messenger.g0.y2(null, R.raw.plane_logo_plain), null, null, null);
                            if (rLottieNative != null) {
                                try {
                                    Bitmap createBitmap2 = Bitmap.createBitmap(ch0Var.b, ch0Var.c, config);
                                    rLottieNative.c(Math.min(33, rLottieNative.a[0] - 1), createBitmap2, true);
                                    this.S2 = createBitmap2;
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
                this.U2 = true;
                A(canvas, width);
                this.U2 = false;
                canvas.setBitmap(null);
                this.g1 = f10;
                return createBitmap;
            } catch (OutOfMemoryError unused) {
                this.g1 = f10;
            }
        }
        return null;
    }

    public final Drawable U(String str) {
        HashMap hashMap = this.K;
        Drawable drawable = (Drawable) hashMap.get(str);
        if (drawable == null) {
            drawable = j6.g(str);
            if (drawable == null) {
                drawable = j6.g(str.replace("️", ""));
            }
            if (drawable != null) {
                hashMap.put(str, drawable);
            }
        }
        return drawable;
    }

    public final void U0(String str) {
        if (this.w0) {
            this.u2 = this.M0.c() + org.telegram.messenger.g0.L(2.0f) + org.telegram.messenger.g0.L(12.0f) + org.telegram.messenger.g0.L(8.0f) + org.telegram.messenger.g0.L(11.0f);
            this.w0 = false;
            this.B0 = false;
            this.t2 = this.C0 * this.H0 > 0.001f;
            this.r2 = AnimationUtils.currentAnimationTimeMillis();
            this.D0 = this.C0;
            this.E0 = 0.0f;
            this.F0 = System.currentTimeMillis();
            e eVar = this.u0;
            if (eVar != null) {
                j1(eVar);
            }
            u1(true);
            if (str != null) {
                d1(0, str, null);
            }
            i0();
            this.e = null;
            this.v0 = null;
            cb.c cVar = this.c;
            if (cVar != null) {
                cVar.x(0);
            }
        }
    }

    public final Bitmap V(g5 g5Var) {
        Bitmap n10;
        u2 u2Var = g5Var.k;
        if (u2Var != null) {
            ch0 B = u2Var.B();
            if (B != null) {
                if (!this.U2) {
                    B.V(0L);
                }
                if (B.u()) {
                    if (B.R != null) {
                        return B.R;
                    }
                    if (B.S != null) {
                        return B.S;
                    }
                    return null;
                }
            } else {
                t5 m10 = u2Var.m();
                if (m10 != null) {
                    if (!this.U2) {
                        m10.D(System.currentTimeMillis());
                    }
                    if (m10.s()) {
                        return m10.m();
                    }
                } else if (u2Var.J() && u2Var.L() && (n10 = u2Var.n()) != null && !n10.isRecycled()) {
                    return n10;
                }
            }
        }
        return null;
    }

    public final float V0() {
        if (this.h1 < 0.5f) {
            return 1.0f;
        }
        return Utilities.l((AnimationUtils.currentAnimationTimeMillis() - this.J2) / 420.0f);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0077 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final w0 W() {
        long j3;
        w0 w0Var = new w0();
        ArrayList arrayList = this.J;
        if (!arrayList.isEmpty()) {
            w0Var.a = 1;
            w0Var.b = new Drawable[arrayList.size()];
            w0Var.w = new long[arrayList.size()];
            w0Var.x = new boolean[arrayList.size()];
            long[] jArr = new long[arrayList.size()];
            w0Var.y = jArr;
            if (this.T4) {
                Arrays.fill(jArr, 1L);
            }
            for (int i7 = 0; i7 < w0Var.b.length; i7++) {
                String str = (String) arrayList.get(i7);
                w0Var.b[i7] = U(str);
                if (str.startsWith("c:")) {
                    try {
                        j3 = Long.parseLong(str.substring(2));
                    } catch (NumberFormatException unused) {
                    }
                    long[] jArr2 = w0Var.w;
                    if (j3 > 0) {
                        j3 = (-1) - (str.hashCode() & 4294967295L);
                    }
                    jArr2[i7] = j3;
                    w0Var.x[i7] = s.d(w0Var.b[i7]);
                }
                j3 = 0;
                long[] jArr22 = w0Var.w;
                if (j3 > 0) {
                }
                jArr22[i7] = j3;
                w0Var.x[i7] = s.d(w0Var.b[i7]);
            }
        }
        return w0Var;
    }

    public final void X(w0 w0Var) {
        TLRPC.Document document;
        if (w0Var == null || w0Var.G || w0Var.a != 2 || w0Var.F != null || (document = w0Var.A) == null) {
            return;
        }
        w0Var.F = new t(this.b, document, w0Var.B, org.telegram.messenger.g0.L(48.0f), new v1(5, this, w0Var));
    }

    public final float X0(int i7, long j3) {
        return 1.0f - ((1.0f - this.A9[i7]) * ((float) Math.exp((-(j3 - this.x9[i7])) / 90.0f)));
    }

    public final boolean Y(Bitmap bitmap) {
        float[] fArr = c1.b;
        float f10 = fArr[36];
        float f11 = fArr[38];
        float f12 = fArr[24];
        if (this.T3 != null && this.U3 == bitmap && f10 == this.V3 && f11 == this.W3 && f12 == this.X3) {
            return true;
        }
        if (bitmap == null || bitmap.isRecycled()) {
            return false;
        }
        this.U3 = bitmap;
        this.V3 = f10;
        this.W3 = f11;
        this.X3 = f12;
        Bitmap bitmap2 = this.T3;
        if (bitmap2 == null || bitmap2.getWidth() != bitmap.getWidth() || this.T3.getHeight() != bitmap.getHeight()) {
            this.T3 = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        }
        this.T3.eraseColor(0);
        Canvas canvas = new Canvas(this.T3);
        double radians = Math.toRadians(f12);
        float f13 = (float) (-Math.cos(radians));
        float f14 = (float) (-Math.sin(radians));
        float N = org.telegram.messenger.g0.N(f10);
        float N2 = org.telegram.messenger.g0.N(f11);
        float f15 = f13 * N2;
        float f16 = N2 * f14;
        canvas.drawBitmap(bitmap, f15, f16, (Paint) null);
        canvas.drawBitmap(bitmap, f15 - (f13 * N), f16 - (f14 * N), this.Y3);
        return true;
    }

    public final void Y0(x0 x0Var, float f10, float f11) {
        if (x0Var != null) {
            this.c7 = W0(x0Var.c);
        }
        if (this.g2) {
            if (this.r != null) {
                this.r = null;
            }
            this.n = x0Var;
            this.s = 1.0f;
            invalidate();
            return;
        }
        this.r = this.n;
        this.n = x0Var;
        this.s = 0.0f;
        this.w = System.currentTimeMillis();
        this.x = f10;
        this.y = f11;
        this.r0++;
        i0();
        invalidate();
    }

    public final void Z(w0 w0Var) {
        g5 g5Var;
        u2 u2Var;
        if (w0Var == null || w0Var.e != null || (g5Var = w0Var.c) == null) {
            return;
        }
        t tVar = w0Var.F;
        if ((tVar == null || tVar.h) && (u2Var = g5Var.k) != null && u2Var.J() && u2Var.L()) {
            int L = org.telegram.messenger.g0.L(48.0f);
            Bitmap createBitmap = Bitmap.createBitmap(L, L, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            w0Var.c.setBounds(0, 0, L, L);
            w0Var.c.setColorFilter(null);
            w0Var.c.setAlpha(ns.e4);
            u2Var.i1 = 1.0f;
            w0Var.c.draw(canvas);
            E0(w0Var, createBitmap);
        }
    }

    public final String a0() {
        String M0 = hd.M0(2131746479, null);
        if (!M0.equals(this.v2)) {
            this.v2 = M0;
            Matcher matcher = Pattern.compile("\\d+").matcher(M0);
            if (matcher.find()) {
                this.w2 = M0.substring(0, matcher.start());
                this.x2 = matcher.group();
                this.y2 = M0.substring(matcher.end());
            } else {
                this.w2 = M0;
                this.y2 = "";
                this.x2 = "";
            }
        }
        return this.v2;
    }

    public final float a1() {
        return (getHeight() - this.v3) - org.telegram.messenger.g0.L(10.0f);
    }

    public final float b(double d) {
        float f10 = this.B4;
        double sin = Math.sin((f10 * 78.233d) + (((f10 * 17.31d) + d) * 12.9898d)) * 43758.5453d;
        return ((float) (sin - Math.floor(sin))) * 300.0f;
    }

    public final float b1() {
        float max = Math.max(org.telegram.messenger.g0.L(160.0f), a1() - ((((l() + (org.telegram.messenger.g0.L(51.0f) + this.u3)) + org.telegram.messenger.g0.L(24.0f)) + org.telegram.messenger.g0.L(11.0f)) + org.telegram.messenger.g0.L(13.0f)));
        if (this.i1 == 2 && this.y1) {
            ArrayList arrayList = this.w1;
            if (arrayList.size() <= 3) {
                max = Math.min(max, arrayList.isEmpty() ? org.telegram.messenger.g0.L(286.0f) : org.telegram.messenger.g0.L(8.0f) + ((i20.A(10.0f, 2, getWidth()) - org.telegram.messenger.g0.L(8.0f)) / 3.0f));
            }
        }
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        float f10 = this.Q2;
        if (f10 < 0.0f || this.g1 < 0.01f) {
            this.Q2 = max;
        } else if (f10 != max) {
            long min = Math.min(64L, Math.max(0L, currentAnimationTimeMillis - this.R2));
            float f11 = this.Q2;
            float z10 = e2.z(1.0f, (float) Math.exp((-min) / 140.0f), max - f11, f11);
            this.Q2 = z10;
            if (Math.abs(max - z10) < 0.5f) {
                this.Q2 = max;
            } else {
                invalidate();
            }
        }
        this.R2 = currentAnimationTimeMillis;
        return this.Q2;
    }

    public final void c() {
        x0 x0Var;
        Runnable runnable = this.e2;
        if (runnable != null) {
            runnable.run();
        }
        if (!this.f2 && !this.J.isEmpty() && (x0Var = this.n) != null && (x0Var.a != 0 || this.G.a == 2)) {
            this.U7 = AnimationUtils.currentAnimationTimeMillis();
            this.R7 = -1;
            this.P7 = 0.0f;
            setSceneFromCard(t(this.N7));
        }
        setPattern(W());
        if (!this.g2) {
            this.s0 = AnimationUtils.currentAnimationTimeMillis();
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
        if (!this.z3) {
            return 0.0f;
        }
        float f17 = i7;
        float f18 = f10 - (f17 / 2.0f);
        float f19 = this.I3;
        float f20 = i10;
        float f21 = f11 - (f20 / 2.0f);
        float f22 = (this.J3 * f21) + (f18 * f19);
        float abs = ((Math.abs(this.J3) * f20) + (Math.abs(f19) * f17)) / 2.0f;
        float f23 = 1.0f;
        float max = Math.max(1.0f, abs);
        float[] fArr = c1.b;
        float f24 = fArr[19] / 100.0f;
        if (f24 > 0.0f) {
            float f25 = this.J3;
            float max2 = ((f21 * this.I3) + (f18 * (-f25))) / Math.max(1.0f, ((Math.abs(this.I3) * f20) + (Math.abs(f25) * f17)) / 2.0f);
            f22 -= ((f24 * f17) * max2) * max2;
        }
        float f26 = (f22 - this.x3) / this.y3;
        float f27 = fArr[20] / 100.0f;
        if (f27 > 0.0f) {
            f26 += (((((float) Math.asin(a8.p0.C(f22, max, 1.0f, -1.0f))) - Math.max(-2.1991148f, Math.min(2.1991148f, (this.x3 / max) * 1.5707964f))) / ((this.y3 / max) * 1.5707964f)) - f26) * f27;
            f12 = e2.t(1.0f, (float) Math.cos(Math.max(-1.5707964f, Math.min(1.5707964f, r4))), (f27 * fArr[31]) / 100.0f, 1.0f);
        } else {
            f12 = 1.0f;
        }
        this.p4 = f26;
        float f28 = this.F3;
        this.q4 = f28 * f12;
        float f29 = fArr[34] / 100.0f;
        int i12 = (f26 > 4.0f ? 1 : (f26 == 4.0f ? 0 : -1));
        if ((i12 > 0 || f26 < -4.0f) && f29 <= 0.0f) {
            this.n4 = 0.0f;
            return 0.0f;
        }
        float f30 = fArr[32];
        float f31 = f26 / fArr[29];
        w0 w0Var = this.G;
        if (w0Var != null && w0Var.a == 1) {
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
        this.n4 = f16;
        float exp = (fArr[28] / 100.0f) * ((i11 > 0 || f26 < -4.0f) ? f13 : (float) Math.exp(Math.pow(Math.abs(f26), f30) * (-0.5d)));
        if (f29 > f13) {
            float f33 = f26 - fArr[33];
            if (f33 < f15 && f33 > -4.0f) {
                exp += f29 * ((float) Math.exp(Math.pow(Math.abs(f33), f30) * (-0.5d)));
            }
        }
        return this.F3 * f14 * exp;
    }

    public final void d(int i7) {
        this.f2 = true;
        boolean z10 = this.G.a != 0;
        this.J.clear();
        this.P7 = 0.0f;
        this.N7 = i7;
        x0 x0Var = this.n;
        if (x0Var == null || x0Var.a != 0 || x0Var.f != i7) {
            setSceneFromCard(t(i7));
        }
        if (z10) {
            setPattern(new w0());
        }
        Runnable runnable = this.e2;
        if (runnable != null) {
            runnable.run();
        }
        this.f2 = false;
    }

    public final void d1(int i7, String str, String str2) {
        long currentTimeMillis = 0 - System.currentTimeMillis();
        if (currentTimeMillis > 0) {
            postDelayed(new p0((Object) this, i7, (Object) str, (Object) str2, 0), currentTimeMillis);
            return;
        }
        this.o1 = i7;
        this.n1 = str;
        this.p1 = str2;
        this.v1 = System.currentTimeMillis() + (str2 != null ? 4000 : 2800);
        invalidate();
    }

    public final void e(int i7, ArrayList arrayList, boolean z10) {
        int i10 = -1;
        if (z10 && a.h != null) {
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
            i10 = H9;
        }
        if (arrayList == null || arrayList.isEmpty()) {
            d(i10);
            return;
        }
        this.f2 = true;
        this.N7 = i10;
        x0 x0Var = this.n;
        if (x0Var == null || x0Var.a != 0 || x0Var.f != i10) {
            setSceneFromCard(t(i10));
        }
        this.P7 = 0.0f;
        ArrayList arrayList2 = this.J;
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
                HashMap hashMap = this.K;
                if (!hashMap.containsKey(o4)) {
                    g5 m10 = g5.m(this.b, j3, null, 2);
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
                    this.d2.put(replace, str);
                    if (!arrayList2.contains(replace)) {
                        arrayList2.add(replace);
                    }
                }
            }
        }
        c();
        this.f2 = false;
    }

    public final void e0(int[] iArr, int i7) {
        iArr[0] = -7829368;
        iArr[1] = -11184811;
        iArr[2] = -13421773;
        ArrayList<TL_stars.StarGiftAttribute> arrayList = ((TL_stars.TL_starGiftUnique) this.w1.get(i7)).attributes;
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
        float z10 = e2.z(f11, f10, 1.0f - ((float) Math.pow(1.0f - f12, this.Y2)), f10);
        return Math.abs(f11 - z10) < 0.002f ? f11 : z10;
    }

    public final int f0() {
        int size = this.w1.size();
        if (!this.y1 || size <= 0 || size >= 3) {
            return 3;
        }
        return size;
    }

    public final g5 g0(long j3, TLRPC.Document document) {
        Long valueOf = Long.valueOf(j3);
        HashMap hashMap = this.K7;
        g5 g5Var = (g5) hashMap.get(valueOf);
        if (g5Var != null) {
            return g5Var;
        }
        g5 l10 = g5.l(this.b, 24, document);
        l10.a(this);
        hashMap.put(Long.valueOf(j3), l10);
        return l10;
    }

    public String getCurrentLink() {
        String str;
        if (this.w0 && (str = this.e) != null && this.v0 != null) {
            return str;
        }
        if (this.u0 != null) {
            return this.d;
        }
        return null;
    }

    public ArrayList<TLRPC.Reaction> getPickedEmoji() {
        ArrayList<TLRPC.Reaction> arrayList = new ArrayList<>();
        ArrayList arrayList2 = this.J;
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
                String str2 = (String) this.d2.get(str);
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
        x0 x0Var = this.n;
        if (x0Var == null || x0Var.a != 0) {
            return -1;
        }
        return x0Var.f;
    }

    public TL_stars.TL_starGiftUnique getThemeGift() {
        int i7;
        w0 w0Var = this.G;
        if (w0Var.a != 2 || (i7 = w0Var.q) < 0) {
            return null;
        }
        ArrayList arrayList = this.w1;
        if (i7 < arrayList.size()) {
            return (TL_stars.TL_starGiftUnique) arrayList.get(this.G.q);
        }
        return null;
    }

    public long getThemeGiftSavedId() {
        Long l10;
        TL_stars.TL_starGiftUnique themeGift = getThemeGift();
        if (themeGift != null) {
            l10 = (Long) this.z1.get(Long.valueOf(themeGift.id));
        } else {
            l10 = null;
        }
        if (l10 != null) {
            return l10.longValue();
        }
        return 0L;
    }

    public final boolean h0() {
        return this.y1 && this.w1.isEmpty();
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
            return (this.T4 || this.a2) && canvas.isHardwareAccelerated() && v.e(this.I1);
        }
        return false;
    }

    public final void j1(e eVar) {
        f fVar = this.t0;
        if (fVar.q != 2 || fVar.o >= 1.0f) {
            postDelayed(new c1.c(17, this, eVar), 40L);
        } else {
            fVar.m = eVar;
            invalidate();
        }
    }

    public final float k1(int i7) {
        if (i7 != this.W7) {
            return 1.0f;
        }
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        if (this.Y7 < this.X7) {
            float l10 = 1.0f - Utilities.l((currentAnimationTimeMillis - r6) / 110.0f);
            return 1.0f - ((1.0f - (l10 * l10)) * 0.08f);
        }
        double h12 = h1((currentAnimationTimeMillis - r4) / 1000.0f, 0.6d, 0.28d);
        if (currentAnimationTimeMillis - this.Y7 > 900) {
            this.W7 = -1;
            return 1.0f;
        }
        float f10 = this.Z7;
        return ((1.0f - f10) * ((float) h12)) + f10;
    }

    public final float l() {
        return org.telegram.messenger.g0.T1(1.07f, 1.0f, this.D2) * getWidth() * 0.745f;
    }

    public final void l0() {
        if (this.V8 == null) {
            this.v1 = 0L;
            return;
        }
        this.v1 = 0L;
        if (this.O8) {
            this.O8 = false;
            this.N8 = AnimationUtils.currentAnimationTimeMillis();
        }
        this.W8 = true;
        invalidate();
    }

    public final float m() {
        float max = ((1.0f - Math.max(this.K2, this.D2)) * org.telegram.messenger.g0.L(16.0f)) + (((getHeight() * 0.468f) - (l() / 2.0f)) - org.telegram.messenger.g0.L(15.0f));
        return org.telegram.messenger.g0.T1(max, Math.max(org.telegram.messenger.g0.L(51.0f) + this.u3, Math.min(max, (((a1() - b1()) - org.telegram.messenger.g0.L(13.0f)) - (org.telegram.messenger.g0.L(35.0f) * Math.max(this.K2, this.D2))) - l())), this.g1);
    }

    public final y0 m1(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        Long valueOf = Long.valueOf(tL_starGiftUnique.id);
        HashMap hashMap = this.L7;
        y0 y0Var = (y0) hashMap.get(valueOf);
        if (y0Var == null) {
            y0Var = new y0();
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
                e5 e5Var = new e5(org.telegram.messenger.g0.L(28.0f), this);
                y0Var.a = e5Var;
                e5Var.i(document, false);
                y0Var.a.a();
                y0Var.b = document.id;
            }
            hashMap.put(Long.valueOf(tL_starGiftUnique.id), y0Var);
        }
        return y0Var;
    }

    public final boolean n() {
        String str;
        return (this.X8 != R.drawable.msg_retry || (str = this.V8) == null || s0(str)) ? false : true;
    }

    public final boolean n0(float f10, float f11) {
        if (this.q1 == null || !this.O8) {
            return false;
        }
        RectF rectF = this.M8;
        if (rectF.isEmpty()) {
            return false;
        }
        float f12 = rectF.right;
        float L = org.telegram.messenger.g0.L(15.0f);
        TextPaint textPaint = this.z2;
        textPaint.setTextSize(L);
        float measureText = (f12 - textPaint.measureText(this.q1)) - org.telegram.messenger.g0.L(28.0f);
        float L2 = rectF.top - org.telegram.messenger.g0.L(6.0f);
        float L3 = rectF.right + org.telegram.messenger.g0.L(6.0f);
        float L4 = rectF.bottom + org.telegram.messenger.g0.L(6.0f);
        RectF rectF2 = this.r1;
        rectF2.set(measureText, L2, L3, L4);
        return rectF2.contains(f10, f11);
    }

    public final PorterDuffColorFilter n1(int i7) {
        SparseArray sparseArray = this.f7;
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
        int i7 = this.z6;
        SparseIntArray sparseIntArray = this.y6;
        if (i7 != 1) {
            sparseIntArray.clear();
            this.z6 = 1;
        }
        int i10 = 0;
        while (true) {
            int[] iArr = a.b;
            if (i10 >= iArr.length) {
                break;
            }
            x0 x0Var = new x0();
            int i11 = iArr[i10] | (-16777216);
            x0Var.b = i11;
            x0Var.c = (-16777216) | a.c[i10];
            x0Var.h = Z0(i11);
            if (sparseIntArray.indexOfKey(x0Var.b) < 0) {
                sparseIntArray.put(x0Var.b, u(x0Var));
            }
            i10++;
        }
        ns.f(this.b).c(this.k2, ns.G3);
        y0();
        SensorManager sensorManager = (SensorManager) getContext().getSystemService("sensor");
        this.O6 = sensorManager;
        Sensor defaultSensor = sensorManager != null ? sensorManager.getDefaultSensor(9) : null;
        if (defaultSensor != null) {
            this.O6.registerListener(this.P6, defaultSensor, 1);
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ns.f(this.b).n(this.k2, ns.G3);
        removeCallbacks(this.l2);
        SensorManager sensorManager = this.O6;
        if (sensorManager != null) {
            sensorManager.unregisterListener(this.P6);
        }
        this.M6 = false;
        this.s9 = -1;
        Arrays.fill(this.y9, 0L);
    }

    /* JADX WARN: Removed duplicated region for block: B:243:0x0a91  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0ae8  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0c06  */
    /* JADX WARN: Removed duplicated region for block: B:302:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0adf  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x09d5  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x0a2a  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x0a49  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x09dc  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDraw(Canvas canvas) {
        float f10;
        float f11;
        float f12;
        float f13;
        int i7;
        float f14;
        float f15;
        long j3;
        float f16;
        float f17;
        float f18;
        int i10;
        cb.c cVar;
        float f19;
        float f20;
        int i11;
        float f21;
        float f22;
        float T1;
        float f23;
        float f24;
        float T12;
        cb.c cVar2;
        long j10;
        float f25;
        z0 z0Var;
        float sin;
        float f26;
        boolean z10;
        long j11;
        boolean z11;
        long j12;
        float f27;
        float h12;
        z0 z0Var2 = this;
        z0Var2.I2 = true;
        float f28 = 1.0f;
        float f29 = z0Var2.C2 ? 1.0f : 0.0f;
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        float f30 = z0Var2.F2;
        if (f29 != f30) {
            if (f29 == 1.0f && f30 == 0.0f && z0Var2.D2 <= 0.001f) {
                z0Var2.o5 = true;
                z0Var2.n5 = null;
            } else if (f29 == 0.0f && z0Var2.D2 >= 0.999f) {
                z0Var2.o5 = false;
            }
            z0Var2.F2 = f29;
            z0Var2.E2 = z0Var2.D2;
            z0Var2.G2 = currentAnimationTimeMillis;
        }
        if (z0Var2.D2 != f29) {
            f10 = 0.0f;
            float l10 = Utilities.l((currentAnimationTimeMillis - z0Var2.G2) / 300.0f);
            float D = l10 < 0.5f ? e2.D(l10, 4.0f, l10, l10) : 1.0f - (((float) Math.pow((l10 * (-2.0f)) + 2.0f, 3.0d)) / 2.0f);
            if (l10 < 1.0f) {
                f29 = org.telegram.messenger.g0.T1(z0Var2.E2, f29, D);
            }
            z0Var2.D2 = f29;
            if (f29 <= 0.0f) {
                z0Var2.o5 = false;
            }
            z0Var2.invalidate();
        } else {
            f10 = 0.0f;
        }
        float f31 = z0Var2.L0 ? 1.0f : f10;
        long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
        float f32 = z0Var2.M2;
        if (f32 < f10) {
            z0Var2.M2 = f31;
            z0Var2.K2 = f31;
        } else {
            if (f31 != f32) {
                z0Var2.M2 = f31;
                z0Var2.L2 = z0Var2.K2;
                z0Var2.N2 = currentAnimationTimeMillis2;
            }
            if (z0Var2.K2 != f31) {
                float l11 = Utilities.l((currentAnimationTimeMillis2 - z0Var2.N2) / 320.0f);
                float D2 = l11 < 0.5f ? e2.D(l11, 4.0f, l11, l11) : 1.0f - (((float) Math.pow((l11 * (-2.0f)) + 2.0f, 3.0d)) / 2.0f);
                if (l11 < 1.0f) {
                    f31 = org.telegram.messenger.g0.T1(z0Var2.L2, f31, D2);
                }
                z0Var2.K2 = f31;
                z0Var2.invalidate();
            }
        }
        z0Var2.W2 = !z0Var2.T4 && z0Var2.V2 == 0 && !z0Var2.U2 && z0Var2.a2;
        long currentTimeMillis = System.currentTimeMillis();
        int width = z0Var2.getWidth();
        int height = z0Var2.getHeight();
        float min = z0Var2.X2 == 0 ? 1.0f : Math.min(3.0f, (currentTimeMillis - r4) / 16.667f);
        z0Var2.X2 = currentTimeMillis;
        z0Var2.Y2 = min;
        float f33 = z0Var2.s;
        cb.c cVar3 = z0Var2.c;
        if (f33 < 1.0f) {
            float min2 = Math.min(1.0f, (currentTimeMillis - z0Var2.w) / 600.0f);
            z0Var2.s = min2;
            if (f33 < 0.3f && min2 >= 0.3f && cVar3 != null) {
                z0Var2.n.getClass();
                ((i0) cVar3.b).b0();
            }
            if (z0Var2.s >= 1.0f) {
                z0Var2.r = null;
            }
        }
        long currentAnimationTimeMillis3 = AnimationUtils.currentAnimationTimeMillis();
        OverScroller overScroller = z0Var2.l9;
        if (!overScroller.isFinished() && overScroller.computeScrollOffset()) {
            z0Var2.k1 = Math.max(f10, Math.min(z0Var2.z0(), overScroller.getCurrY()));
        }
        float f34 = z0Var2.h1;
        if (f34 != z0Var2.y7) {
            if (f34 < 0.5f) {
                z0Var2.e6 = currentAnimationTimeMillis3;
            } else if (z0Var2.g1 < 0.35f) {
                z0Var2.f6 = false;
            }
            if (f34 > 0.5f) {
                z0Var2.J2 = currentAnimationTimeMillis3;
            }
            z0Var2.y7 = f34;
            z0Var2.x7 = z0Var2.g1;
            z0Var2.w7 = currentAnimationTimeMillis3;
        }
        float f35 = (currentAnimationTimeMillis3 - z0Var2.w7) / 1000.0f;
        er erVar = S9;
        if (f34 > 0.5f) {
            float T13 = org.telegram.messenger.g0.T1(z0Var2.x7, 1.0f, erVar.getInterpolation(Utilities.l(f35 / 0.42f)));
            z0Var2.g1 = T13;
            z0Var2.z7 = Utilities.l(Utilities.l(T13) / 0.8f);
            f12 = 0.5f;
            f11 = 1000.0f;
            f13 = 0.17f;
        } else {
            f11 = 1000.0f;
            f12 = 0.5f;
            f13 = 0.17f;
            z0Var2.z7 = Math.min(z0Var2.z7, (float) Math.pow(1.0f - Utilities.l(f35 / 0.17f), 1.7000000476837158d));
            z0Var2.g1 = org.telegram.messenger.g0.T1(z0Var2.x7, 0.0f, erVar.getInterpolation(Utilities.l(f35 / 0.36f)));
        }
        z0Var2.O7 = z0Var2.f(z0Var2.O7, z0Var2.P7, 0.25f);
        x0 x0Var = z0Var2.n;
        if (x0Var != null && x0Var.a == 0) {
            i7 = 0;
            while (i7 < a.b.length) {
                if (e1(i7) == z0Var2.n.f) {
                    break;
                } else {
                    i7++;
                }
            }
        }
        i7 = -100;
        int i12 = z0Var2.v8;
        if (i7 != i12) {
            float f36 = i7 == z0Var2.w8 ? z0Var2.y8 : 0.0f;
            z0Var2.w8 = i12;
            z0Var2.y8 = z0Var2.x8;
            z0Var2.v8 = i7;
            z0Var2.x8 = f36;
        }
        z0Var2.x8 = z0Var2.f(z0Var2.x8, 1.0f, 0.2f);
        z0Var2.y8 = z0Var2.f(z0Var2.y8, 0.0f, 0.2f);
        long currentAnimationTimeMillis4 = AnimationUtils.currentAnimationTimeMillis();
        float f37 = z0Var2.m1;
        if (f37 != z0Var2.D8) {
            z0Var2.D8 = f37;
            z0Var2.C8 = Math.max(z0Var2.F8, z0Var2.G8);
            z0Var2.A8 = currentAnimationTimeMillis4;
        }
        float f38 = f13;
        float f39 = (currentAnimationTimeMillis4 - z0Var2.A8) / f11;
        if (z0Var2.m1 > f12) {
            float f40 = z0Var2.C8;
            if (f39 > 0.7f) {
                f14 = 1.0f;
                f15 = 0.2f;
            } else {
                f14 = 1.0f;
                f15 = 0.2f;
                f28 = ((1.0f - f40) * ((float) h1(f39, 0.78d, 0.3d))) + f40;
            }
            z0Var2.F8 = f28;
            if (f39 > 0.7f) {
                j3 = currentAnimationTimeMillis4;
                h12 = f14;
            } else {
                j3 = currentAnimationTimeMillis4;
                h12 = ((f14 - f40) * ((float) h1(f39 - 0.02d, 0.8d, 0.34d))) + f40;
            }
            z0Var2.G8 = h12;
        } else {
            f14 = 1.0f;
            f15 = 0.2f;
            j3 = currentAnimationTimeMillis4;
            float l12 = Utilities.l(f39 / 0.2f);
            float l13 = Utilities.l(f39 / f38);
            float f41 = z0Var2.C8;
            z0Var2.F8 = (1.0f - ((3.0f - (l13 * 2.0f)) * (l13 * l13))) * f41;
            z0Var2.G8 = (1.0f - ((3.0f - (l12 * 2.0f)) * (l12 * l12))) * f41;
        }
        float max = Math.max(0.004f, z0Var2.Y2 * 0.016667f);
        float f42 = z0Var2.G8;
        z0Var2.H8 = (f42 - z0Var2.I8) / max;
        z0Var2.I8 = f42;
        float max2 = Math.max(0.0f, Math.max(z0Var2.F8, f42));
        z0Var2.l1 = max2;
        if (z0Var2.E8 > 0.001f && max2 <= 0.001f) {
            z0Var2.B8 = j3;
        }
        z0Var2.E8 = max2;
        z0Var2.j1 = z0Var2.f(z0Var2.j1, z0Var2.i1, 0.25f);
        boolean z12 = z0Var2.n1 != null && currentTimeMillis < z0Var2.v1;
        z0Var2.u1 = z0Var2.f(z0Var2.u1, z12 ? f14 : 0.0f, z12 ? f15 : z0Var2.m1 > f12 ? 0.4f : 0.16f);
        float T14 = org.telegram.messenger.g0.T1(z0Var2.D0, z0Var2.E0, f14 - ((float) Math.pow(r5 - Math.min(r5, (currentTimeMillis - z0Var2.F0) / (z0Var2.E0 > z0Var2.D0 ? 340L : 380L)), 3.0d)));
        z0Var2.C0 = T14;
        boolean z13 = z0Var2.w0;
        if (z13 && T14 >= 0.999f) {
            z0Var2.G0 = true;
        }
        if (z13) {
            if (z0Var2.x0) {
                f27 = Utilities.l((z0Var2.B0 ? 60000L : Math.max(0L, z0Var2.A0 - currentTimeMillis)) / 60000.0f);
            } else {
                f27 = 1.0f;
            }
            z0Var2.H0 = f27;
            if (z0Var2.x0 && !z0Var2.B0 && currentTimeMillis >= z0Var2.A0) {
                z0Var2.U0(hd.M0(2131746480, null));
            }
        }
        z0Var2.u1(true);
        long nanoTime = System.nanoTime();
        float min3 = z0Var2.N6 == 0 ? 0.016f : Math.min(0.1f, (nanoTime - r10) / 1.0E9f);
        z0Var2.N6 = nanoTime;
        if (z0Var2.M6) {
            float exp = 1.0f - ((float) Math.exp((-min3) / 4.0f));
            float f43 = z0Var2.K6;
            float f44 = z0Var2.I6;
            float z14 = e2.z(f44, f43, exp, f43);
            z0Var2.K6 = z14;
            float f45 = z0Var2.L6;
            z0Var2.L6 = e2.z(z0Var2.J6, f45, exp, f45);
            f16 = 1.0f;
            f17 = a8.p0.C(-(f44 - z14), 4.9f, 1.0f, -1.0f);
            f18 = Math.max(-1.0f, Math.min(1.0f, (z0Var2.J6 - z0Var2.L6) / 4.9f));
        } else {
            f16 = 1.0f;
            f17 = 0.0f;
            f18 = 0.0f;
        }
        float exp2 = f16 - ((float) Math.exp((-min3) / 0.08f));
        float f46 = z0Var2.G6;
        z0Var2.G6 = e2.z(f17, f46, exp2, f46);
        float f47 = z0Var2.H6;
        z0Var2.H6 = e2.z(f18, f47, exp2, f47);
        float[] fArr = c1.b;
        float f48 = fArr[0];
        z0Var2.E6 = Math.round(r5 / r10) * (f48 > 0.0f ? f12 / f48 : 1.0f);
        float round = Math.round(z0Var2.H6 * 40.0f) / 40.0f;
        z0Var2.F6 = round;
        b1.i = z0Var2.E6 * fArr[0];
        b1.j = (round * fArr[1]) / 100.0f;
        float f49 = z0Var2.c6;
        w0 w0Var = z0Var2.G;
        z0Var2.c6 = z0Var2.f(f49, (w0Var == null || w0Var.a == 0) ? 0.0f : 1.0f, 0.12f);
        if (v.f()) {
            canvas.isHardwareAccelerated();
        }
        if (i() && ((z0Var2.T4 || z0Var2.a2) && canvas.isHardwareAccelerated())) {
            if (z0Var2.H1 == null) {
                z0Var2.H1 = android.support.v4.media.session.w.d("qrBg");
                RenderNode d = android.support.v4.media.session.w.d("qrBlur");
                z0Var2.I1 = d;
                float N = org.telegram.messenger.g0.N(17.6f) / 9.0f;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                v.j(d, N);
            }
            z0Var2.z(v.a(width, height, z0Var2.H1), width, height);
            v.d(z0Var2.H1);
            if (z0Var2.J1 != 1) {
                z0Var2.J1 = 1;
                Object obj = z0Var2.I1;
                float max3 = Math.max(f12, org.telegram.messenger.g0.N(fArr[2]) / 9.0f);
                Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                v.j(obj, max3);
            }
            Canvas a10 = v.a((width + 8) / 9, (height + 8) / 9, z0Var2.I1);
            a10.scale(0.11111111f, 0.11111111f);
            v.c(a10, z0Var2.H1);
            v.d(z0Var2.I1);
            v.c(canvas, z0Var2.H1);
        } else {
            z0Var2.z(canvas, width, height);
        }
        z0Var2.A(canvas, width);
        z0Var2.S4 = z0Var2.R4 < 1.0f ? Utilities.l(z0Var2.V4) : 1.0f;
        float currentActionBarHeight = (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2.0f) + z0Var2.u3;
        RectF rectF = z0Var2.h7;
        rectF.set(org.telegram.messenger.g0.L(29.0f) - org.telegram.messenger.g0.L(20.0f), currentActionBarHeight - org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(20.0f) + org.telegram.messenger.g0.L(29.0f), org.telegram.messenger.g0.L(20.0f) + currentActionBarHeight);
        float T = z0Var2.T(z0Var2.S4);
        canvas.save();
        canvas.scale(T, T, rectF.centerX(), rectF.centerY());
        z0Var2.J(canvas, rectF, org.telegram.messenger.g0.L(20.0f), 1.0f);
        z0Var2.M(canvas, 3, rectF, false);
        x1 x1Var = z0Var2.X1;
        x1Var.a(-1);
        canvas.save();
        i20.j(org.telegram.messenger.g0.L(24.0f), 2.0f, currentActionBarHeight, rectF.centerX() - (org.telegram.messenger.g0.L(24.0f) / 2.0f), canvas);
        x1Var.draw(canvas);
        canvas.restore();
        canvas.restore();
        if (z0Var2.m7) {
            i10 = height;
            cVar = cVar3;
            f19 = 14.0f;
            f20 = 10.0f;
            i11 = width;
        } else {
            float L = org.telegram.messenger.g0.L(14.0f);
            Paint paint = z0Var2.V1;
            paint.setTextSize(L);
            float L2 = org.telegram.messenger.g0.L(6.0f) + org.telegram.messenger.g0.L(20.0f) + org.telegram.messenger.g0.L(12.0f);
            f20 = 10.0f;
            String str = z0Var2.W1;
            f19 = 14.0f;
            RectF rectF2 = z0Var2.k7;
            rectF2.set((z0Var2.getWidth() - org.telegram.messenger.g0.L(9.0f)) - ((paint.measureText(str) + L2) + org.telegram.messenger.g0.L(14.0f)), currentActionBarHeight - org.telegram.messenger.g0.L(20.0f), z0Var2.getWidth() - org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(20.0f) + currentActionBarHeight);
            canvas.save();
            canvas.scale(T, T, rectF2.centerX(), rectF2.centerY());
            z0Var2.J(canvas, rectF2, org.telegram.messenger.g0.L(20.0f), 1.0f);
            z0Var2.M(canvas, 5, rectF2, false);
            cVar = cVar3;
            i11 = width;
            i10 = height;
            z0Var2.o0(canvas, z0Var2.O1, rectF2.left + org.telegram.messenger.g0.L(12.0f) + org.telegram.messenger.g0.L(10.0f), currentActionBarHeight, org.telegram.messenger.g0.L(20.0f), 1.0f);
            paint.setColor(-1);
            Paint.FontMetrics fontMetrics = paint.getFontMetrics();
            canvas.drawText(str, rectF2.left + org.telegram.messenger.g0.L(12.0f) + org.telegram.messenger.g0.L(20.0f) + org.telegram.messenger.g0.L(6.0f), currentActionBarHeight - ((fontMetrics.ascent + fontMetrics.descent) / 2.0f), paint);
            canvas.restore();
        }
        float l14 = 1.0f - Utilities.l(z0Var2.g1 * 2.2f);
        long currentAnimationTimeMillis5 = AnimationUtils.currentAnimationTimeMillis();
        boolean z15 = z0Var2.m1 > 0.5f;
        if (z15 != z0Var2.n7) {
            z0Var2.n7 = z15;
            z0Var2.p7 = z0Var2.o7;
            z0Var2.q7 = currentAnimationTimeMillis5;
        }
        float l15 = Utilities.l((currentAnimationTimeMillis5 - z0Var2.q7) / 220.0f);
        if (z15) {
            f21 = 220.0f;
            T1 = org.telegram.messenger.g0.T1(z0Var2.p7, 0.0f, l15 * l15);
            f22 = 1.0f;
        } else {
            f21 = 220.0f;
            f22 = 1.0f;
            T1 = org.telegram.messenger.g0.T1(z0Var2.p7, 1.0f, Math.min(1.0f, S(l15, 0.6f)));
        }
        z0Var2.o7 = T1;
        if (l15 < f22) {
            z0Var2.invalidate();
        }
        float l16 = Utilities.l(Utilities.l(z0Var2.o7) * 2.0f);
        float T15 = org.telegram.messenger.g0.T1(0.6f, f22, z0Var2.o7);
        boolean z16 = z15 || (z0Var2.w0 && z0Var2.x0);
        if (z16 != z0Var2.r7) {
            z0Var2.r7 = z16;
            z0Var2.t7 = z0Var2.s7;
            z0Var2.u7 = currentAnimationTimeMillis5;
        }
        float l17 = Utilities.l((currentAnimationTimeMillis5 - z0Var2.u7) / f21);
        if (z16) {
            T12 = org.telegram.messenger.g0.T1(z0Var2.t7, 0.0f, l17 * l17);
            f23 = 0.6f;
            f24 = 1.0f;
        } else {
            f23 = 0.6f;
            f24 = 1.0f;
            T12 = org.telegram.messenger.g0.T1(z0Var2.t7, 1.0f, Math.min(1.0f, S(l17, 0.6f)));
        }
        z0Var2.s7 = T12;
        if (l17 < f24) {
            z0Var2.invalidate();
        }
        float T16 = org.telegram.messenger.g0.T1(f23, f24, z0Var2.s7);
        float min4 = Math.min(l14, Utilities.l(Utilities.l(z0Var2.s7) * 2.0f));
        boolean z17 = z0Var2.g1 <= 0.001f;
        if (min4 > 0.0f || l14 > 0.0f || z17) {
            float height2 = (z0Var2.getHeight() - z0Var2.v3) - org.telegram.messenger.g0.L(40.0f);
            int width2 = z0Var2.getWidth();
            int L3 = org.telegram.messenger.g0.L(20.0f);
            float L4 = org.telegram.messenger.g0.L(42.0f) - L3;
            float f50 = L3;
            float f51 = height2 - f50;
            boolean z18 = z17;
            float L5 = org.telegram.messenger.g0.L(42.0f) + L3;
            cVar2 = cVar;
            float f52 = height2 + f50;
            j10 = currentTimeMillis;
            RectF rectF3 = z0Var2.i7;
            rectF3.set(L4, f51, L5, f52);
            float z19 = k5.z(42.0f, width2, L3);
            float D3 = i20.D(42.0f, width2, L3);
            RectF rectF4 = z0Var2.j7;
            rectF4.set(z19, f51, D3, f52);
            float f53 = width2 / 2.0f;
            RectF rectF5 = z0Var2.l7;
            rectF5.set(f53 - org.telegram.messenger.g0.L(72.0f), height2 - org.telegram.messenger.g0.L(20.0f), f53 + org.telegram.messenger.g0.L(72.0f), org.telegram.messenger.g0.L(20.0f) + height2);
            float T2 = z0Var2.T(z0Var2.S4) * org.telegram.messenger.g0.T1(0.6f, 1.0f, l14);
            if (min4 > 0.0f) {
                canvas.save();
                float f54 = T2 * T16;
                canvas.scale(f54, f54, rectF3.centerX(), height2);
                z0Var2.J(canvas, rectF3, org.telegram.messenger.g0.L(20.0f), min4);
                z0Var2.M(canvas, 4, rectF3, false);
                f25 = height2;
                z0Var2.o0(canvas, z0Var2.M1, rectF3.centerX(), f25, org.telegram.messenger.g0.L(22.0f), min4);
                canvas.restore();
                canvas.save();
                float f55 = T2 * T15;
                canvas.scale(f55, f55, rectF4.centerX(), f25);
                z0Var2.J(canvas, rectF4, org.telegram.messenger.g0.L(20.0f), min4);
                z0Var2.M(canvas, 11, rectF4, false);
                z0Var2.o0(canvas, z0Var2.N1, rectF4.centerX(), f25, org.telegram.messenger.g0.L(24.0f), min4);
                canvas.restore();
            } else {
                f25 = height2;
            }
            if (z18 && l16 > 0.0f && z0Var2.a) {
                float T3 = z0Var2.T(z0Var2.S4) * T15;
                canvas.save();
                canvas.scale(T3, T3, rectF5.centerX(), rectF5.centerY());
                z0Var2.J(canvas, rectF5, org.telegram.messenger.g0.L(20.0f), l16);
                float width3 = rectF5.width() / 3.0f;
                canvas.save();
                Path path = z0Var2.F1;
                path.rewind();
                path.addRoundRect(rectF5, org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(20.0f), Path.Direction.CW);
                canvas.clipPath(path);
                int i13 = 0;
                while (i13 < 3) {
                    float f56 = rectF5.left;
                    float f57 = (i13 * width3) + f56;
                    float f58 = rectF5.top;
                    int i14 = i13 + 1;
                    float f59 = (i14 * width3) + f56;
                    float f60 = rectF5.bottom;
                    RectF rectF6 = z0Var2.d7;
                    rectF6.set(f57, f58, f59, f60);
                    z0Var2.M(canvas, i13 + 6, rectF6, false);
                    i13 = i14;
                }
                canvas.restore();
                int i15 = 0;
                while (i15 < 3) {
                    float f61 = l16;
                    z0Var2.o0(canvas, z0Var2.g7[i15], i20.b(i15, 0.5f, width3, rectF5.left), f25, org.telegram.messenger.g0.L(i15 == 1 ? 24.5f : 22.0f), f61);
                    i15++;
                    l16 = f61;
                    z0Var2 = z0Var2;
                }
                z0Var = z0Var2;
                canvas.restore();
            } else {
                z0Var = z0Var2;
            }
        } else {
            z0Var = z0Var2;
            j10 = currentTimeMillis;
            cVar2 = cVar;
        }
        if (z0Var.l1 > 0.001f) {
            K(canvas);
        } else {
            if (z0Var.B8 != 0) {
                float currentAnimationTimeMillis6 = (AnimationUtils.currentAnimationTimeMillis() - z0Var.B8) / f11;
                if (currentAnimationTimeMillis6 <= 0.45f) {
                    sin = ((float) Math.sin((currentAnimationTimeMillis6 * 6.283185307179586d) / 0.17000000178813934d)) * ((float) Math.exp((-currentAnimationTimeMillis6) / 0.11f)) * 0.07f;
                    float T4 = z0Var.T(z0Var.R4 >= 1.0f ? Utilities.l(z0Var.V4) : 1.0f) * j(z0Var.n2, 0.06f, 0.02f);
                    if (z0Var.r2 > 0 || z0Var.w0) {
                        f26 = 1.0f;
                    } else {
                        float currentAnimationTimeMillis7 = (AnimationUtils.currentAnimationTimeMillis() - z0Var.r2) / 180.0f;
                        f26 = 1.0f;
                        if (currentAnimationTimeMillis7 < 1.0f) {
                            T4 *= (((float) Math.sin(currentAnimationTimeMillis7 * 3.141592653589793d)) * 0.04f) + 1.0f;
                            z0Var.invalidate();
                        }
                    }
                    z10 = sin == 0.0f || T4 != f26;
                    if (z10) {
                        canvas.save();
                        float f62 = ((sin * 0.5f) + f26) * T4;
                        float f63 = (f26 - sin) * T4;
                        RectF rectF7 = z0Var.K5;
                        canvas.scale(f62, f63, rectF7.centerX(), rectF7.centerY());
                    }
                    z0Var.B(canvas, i11);
                    if (z10) {
                        canvas.restore();
                    }
                }
            }
            sin = 0.0f;
            float T42 = z0Var.T(z0Var.R4 >= 1.0f ? Utilities.l(z0Var.V4) : 1.0f) * j(z0Var.n2, 0.06f, 0.02f);
            if (z0Var.r2 > 0) {
            }
            f26 = 1.0f;
            if (sin == 0.0f) {
            }
            if (z10) {
            }
            z0Var.B(canvas, i11);
            if (z10) {
            }
        }
        z0Var.N(canvas, i11, i10);
        long currentAnimationTimeMillis8 = AnimationUtils.currentAnimationTimeMillis();
        if (z0Var.f9 == 0 && z0Var.O8 && z0Var.V8 != null && z0Var.h1 == 0.0f && z0Var.g1 > 0.001f) {
            RectF rectF8 = z0Var.M8;
            if (!rectF8.isEmpty()) {
                z0Var.f9 = currentAnimationTimeMillis8;
                z0Var.g9 = rectF8.centerY();
                z0Var.n1 = null;
                j11 = 0;
                z0Var.v1 = 0L;
                if (z0Var.f9 == j11) {
                    float f64 = (currentAnimationTimeMillis8 - r4) / 140.0f;
                    if (f64 >= 1.0f) {
                        z11 = false;
                        j12 = 0;
                    } else if (z0Var.V8 == null) {
                        j12 = 0;
                        z11 = false;
                    } else {
                        z0Var.invalidate();
                        float f65 = i11;
                        canvas.saveLayerAlpha(0.0f, 0.0f, f65, i10, (int) ((1.0f - f64) * 255.0f));
                        float f66 = 1.0f - (f64 * 0.08f);
                        canvas.scale(f66, f66, f65 / 2.0f, z0Var.g9);
                        z0Var.h9 = true;
                        z0Var.R(canvas, i11, j10);
                        z0Var.h9 = false;
                        canvas.restore();
                    }
                    z0Var.f9 = j12;
                    z0Var.O8 = z11;
                    z0Var.V8 = null;
                } else {
                    z0Var.R(canvas, i11, j10);
                }
                if (cVar2 != null) {
                    i0 i0Var = (i0) cVar2.b;
                    boolean z20 = z0Var.g1 > 0.01f && z0Var.z7 > 0.004f && z0Var.i1 == 1;
                    float L6 = ((1.0f - z0Var.z7) * org.telegram.messenger.g0.L(f19)) + (z0Var.a1() - z0Var.b1()) + org.telegram.messenger.g0.L(8.0f);
                    float f67 = z0Var.z7;
                    RectF rectF9 = z0Var.J7;
                    RectF rectF10 = z0Var.A7;
                    boolean z21 = z20 && !rectF10.equals(rectF9);
                    x0 x0Var2 = z0Var.n;
                    int i16 = x0Var2 != null ? x0Var2.b : 0;
                    boolean z22 = z20 && i16 != z0Var.I7;
                    if (z20 != z0Var.H7 || z21 || z22 || (z20 && (Math.abs(L6 - z0Var.F7) > 0.5f || Math.abs(f67 - z0Var.G7) > 0.01f))) {
                        z0Var.I7 = i16;
                        rectF9.set(rectF10);
                        z0Var.H7 = z20;
                        z0Var.F7 = L6;
                        z0Var.G7 = f67;
                        i0Var.g0(L6, f67, z20);
                        org.telegram.messenger.g0.L(f20);
                        z0Var.getWidth();
                        org.telegram.messenger.g0.L(f20);
                        z0Var.a1();
                        float f68 = rectF10.left;
                        float f69 = rectF10.top;
                        float f70 = rectF10.right;
                        float f71 = rectF10.bottom;
                        float min5 = Math.min(rectF10.height() / 2.0f, org.telegram.messenger.g0.W1(Utilities.l(z0Var.g1), org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(28.17f)));
                        i0Var.n = f68;
                        i0Var.r = f69;
                        i0Var.s = f70;
                        i0Var.w = f71;
                        i0Var.x = min5;
                        if (i0Var.h != null) {
                            float min6 = Math.min(r1.getHeight(), i0Var.w - (i0Var.h.getTranslationY() + i0Var.h.getTop()));
                            c cVar4 = i0Var.y;
                            if (cVar4 != null) {
                                cVar4.H = min6;
                            }
                            i0Var.L = min6;
                            if (cVar4 != null) {
                                cVar4.V = i0Var.s - cVar4.getLeft();
                            }
                            m mVar = i0Var.a0;
                            if (mVar != null) {
                                mVar.invalidate();
                            }
                            i0Var.h.invalidateOutline();
                        }
                        c cVar5 = i0Var.y;
                        if (cVar5 != null) {
                            cVar5.invalidateOutline();
                        }
                    }
                }
                z0Var.invalidate();
                z0Var.W2 = false;
                if (z0Var.T4) {
                    z0Var.V2++;
                    return;
                }
                return;
            }
        }
        j11 = 0;
        if (z0Var.f9 == j11) {
        }
        if (cVar2 != null) {
        }
        z0Var.invalidate();
        z0Var.W2 = false;
        if (z0Var.T4) {
        }
    }

    @Override // android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        int top;
        super.onLayout(z10, i7, i10, i11, i12);
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
        this.u3 = Math.max(Math.max(0, i13 - top), (org.telegram.messenger.g0.L(20.0f) + org.telegram.messenger.g0.L(9.0f)) - (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2));
        int height = getRootView().getHeight();
        View view2 = this;
        int i15 = 0;
        while (true) {
            int top2 = view2.getTop() + i15;
            if (!(view2.getParent() instanceof View)) {
                this.v3 = i5.c.d(20.0f, org.telegram.messenger.g0.L(22.0f), Math.max(0, org.telegram.messenger.g0.n - (height - (getHeight() + top2))));
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
            Bitmap bitmap = this.A3;
            if (bitmap == null || bitmap.getWidth() != ceil || this.A3.getHeight() != ceil2) {
                this.A3 = Bitmap.createBitmap(ceil, ceil2, Bitmap.Config.ARGB_8888);
                this.B3 = new int[ceil * ceil2];
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
        boolean z10;
        float f10;
        int i7;
        int width;
        boolean z11;
        float f11;
        x0 x0Var;
        boolean z12;
        n0 n0Var;
        VelocityTracker velocityTracker;
        RippleDrawable rippleDrawable;
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        if (motionEvent.getActionMasked() == 0) {
            this.s1 = n0(x10, y10);
        }
        boolean z13 = this.s1;
        cb.c cVar = this.c;
        if (z13) {
            if (motionEvent.getActionMasked() == 1) {
                this.s1 = false;
                if (n0(x10, y10)) {
                    this.v1 = 0L;
                    invalidate();
                    if (cVar != null) {
                        ((i0) cVar.b).presentFragment(new PremiumPreviewFragment(0, "qr_emoji"));
                        return true;
                    }
                }
            } else if (motionEvent.getActionMasked() == 3) {
                this.s1 = false;
                return true;
            }
            return true;
        }
        int actionMasked = motionEvent.getActionMasked();
        ArrayList arrayList = this.w1;
        RectF rectF = this.a8;
        RectF rectF2 = this.j7;
        RectF rectF3 = this.i7;
        RectF rectF4 = this.K5;
        RectF rectF5 = this.h7;
        RectF[] rectFArr = this.z8;
        RectF rectF6 = this.k7;
        RectF rectF7 = this.l7;
        OverScroller overScroller = this.l9;
        s0 s0Var = this.q9;
        RectF rectF8 = this.v7;
        if (actionMasked != 0) {
            ViewConfiguration viewConfiguration = this.m9;
            if (actionMasked == 1) {
                removeCallbacks(s0Var);
                Q0();
                S0();
                if (this.S) {
                    this.S = false;
                    if (this.T) {
                        this.l0.addMovement(motionEvent);
                        this.l0.computeCurrentVelocity(1000);
                        float xVelocity = this.l0.getXVelocity();
                        float yVelocity = this.l0.getYVelocity();
                        float hypot = (float) Math.hypot(xVelocity, yVelocity);
                        float L = org.telegram.messenger.g0.L(1.0f) * 2600.0f;
                        if (hypot > L) {
                            float f12 = L / hypot;
                            xVelocity *= f12;
                            yVelocity *= f12;
                        }
                        this.b0 = this.O;
                        this.c0 = this.P;
                        this.d0 = xVelocity;
                        this.e0 = yVelocity;
                        this.W = AnimationUtils.currentAnimationTimeMillis();
                        this.U = true;
                        R0();
                        return true;
                    }
                    R0();
                }
                if (this.p9 && (velocityTracker = this.n9) != null) {
                    velocityTracker.addMovement(motionEvent);
                    this.n9.computeCurrentVelocity(1000, viewConfiguration.getScaledMaximumFlingVelocity());
                    float yVelocity2 = this.n9.getYVelocity();
                    int z02 = (int) z0();
                    if (Math.abs(yVelocity2) > viewConfiguration.getScaledMinimumFlingVelocity() && z02 > 0) {
                        overScroller.fling(0, Math.round(this.k1), 0, Math.round(-yVelocity2), 0, 0, 0, z02);
                        invalidate();
                    }
                }
                if (!this.p9 && !this.o9 && Math.hypot(x10 - this.i9, y10 - this.j9) < org.telegram.messenger.g0.L(10.0f)) {
                    if (this.m7 || !m0(x10, y10, rectF6)) {
                        if (this.l1 <= 0.5f) {
                            if (m0(x10, y10, rectF5)) {
                                if (this.g1 > 0.5f) {
                                    this.h1 = 0.0f;
                                    return true;
                                }
                                if (cVar != null) {
                                    ((i0) cVar.b).finishFragment();
                                    return true;
                                }
                            } else if (!this.L0 || !m0(x10, y10, rectF4)) {
                                if (this.g1 > 0.5f) {
                                    if (y10 < rectF8.top) {
                                        z11 = true;
                                        f11 = 0.0f;
                                    } else if (y10 > rectF8.bottom) {
                                        f11 = 0.0f;
                                        z11 = true;
                                    } else if (this.i1 == 1) {
                                        int i10 = 0;
                                        while (true) {
                                            ArrayList arrayList2 = this.J;
                                            if (i10 >= arrayList2.size()) {
                                                break;
                                            }
                                            if (this.E7[i10].contains(x10, y10)) {
                                                arrayList2.remove(i10);
                                                c();
                                                i0();
                                                return true;
                                            }
                                            i10++;
                                        }
                                    } else {
                                        getWidth();
                                        float L2 = (this.k1 + y10) - (org.telegram.messenger.g0.L(4.0f) + rectF8.top);
                                        if (L2 >= 0.0f) {
                                            float L3 = x10 - (rectF8.left + org.telegram.messenger.g0.L(4.0f));
                                            float width2 = rectF8.width() - org.telegram.messenger.g0.L(8.0f);
                                            if (L3 >= 0.0f && L3 < width2) {
                                                int i11 = this.i1;
                                                if (i11 == 2) {
                                                    if (!h0()) {
                                                        float f13 = width2 / 3.0f;
                                                        float f02 = width2 / f0();
                                                        if (L2 >= 0.0f) {
                                                            int f03 = (f0() * ((int) ((L2 - 0.0f) / f13))) + ((int) (L3 / f02));
                                                            if (f03 >= 0 && f03 < arrayList.size()) {
                                                                long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                                                                this.T7 = currentAnimationTimeMillis;
                                                                w0 w0Var = this.G;
                                                                if (w0Var.a == 2 && w0Var.q == f03) {
                                                                    this.U7 = currentAnimationTimeMillis;
                                                                    this.R7 = -1;
                                                                    this.P7 = 0.0f;
                                                                    setSceneFromCard(t(this.N7));
                                                                    setPattern(W());
                                                                    B0();
                                                                    return true;
                                                                }
                                                                int i12 = this.M7;
                                                                if (i12 >= 0 && i12 != f03 && this.P7 > 0.5f) {
                                                                    this.R7 = i12;
                                                                    this.U7 = currentAnimationTimeMillis;
                                                                }
                                                                this.M7 = f03;
                                                                this.O7 = 0.0f;
                                                                this.P7 = 1.0f;
                                                                I0(getWidth() / 2.0f, (l() / 2.0f) + m(), f03);
                                                                B0();
                                                                return true;
                                                            }
                                                        }
                                                    } else if (rectF.contains(x10, y10)) {
                                                        i0();
                                                        if (cVar != null) {
                                                            i0.a0((i0) cVar.b);
                                                            return true;
                                                        }
                                                    }
                                                } else if (i11 == 0) {
                                                    float f14 = width2 / 6.0f;
                                                    int i13 = (((int) (L2 / f14)) * 6) + ((int) (L3 / f14));
                                                    if (i13 >= 0 && i13 < a.b.length) {
                                                        int e12 = e1(i13);
                                                        int i14 = H9;
                                                        if (e12 != i14 || (x0Var = this.n) == null || x0Var.a != 0 || x0Var.f != i14 || this.G.a != 0) {
                                                            int e13 = e1(i13);
                                                            this.N7 = e13;
                                                            boolean z14 = this.G.a == 2;
                                                            if (z14) {
                                                                this.U7 = AnimationUtils.currentAnimationTimeMillis();
                                                                this.R7 = -1;
                                                                this.P7 = 0.0f;
                                                            }
                                                            setSceneFromCard(t(e13));
                                                            if (z14) {
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
                                    this.h1 = f11;
                                    return z11;
                                }
                                if (this.a && m0(x10, y10, rectF7)) {
                                    int max = Math.max(0, Math.min(2, (int) ((x10 - rectF7.left) / (rectF7.width() / 3.0f))));
                                    if (this.m1 <= 0.0f && this.l1 <= 0.05f) {
                                        F0(max);
                                        return true;
                                    }
                                    this.m1 = 0.0f;
                                    i0();
                                    postDelayed(new o0(this, max, 2), 200L);
                                    return true;
                                }
                                if (this.r7 || !m0(x10, y10, rectF3)) {
                                    if (!this.r7 && m0(x10, y10, rectF2) && cVar != null) {
                                        ((i0) cVar.b).h0();
                                        return true;
                                    }
                                } else if (cVar != null) {
                                    ((i0) cVar.b).i0(getCurrentLink());
                                    return true;
                                }
                            } else if (this.L0) {
                                if (this.w0) {
                                    this.y0 = this.x0;
                                    this.m1 = 1.0f;
                                    l0();
                                    i0();
                                    return true;
                                }
                                this.w0 = true;
                                this.r2 = 0L;
                                this.x0 = true;
                                this.B0 = true;
                                this.A0 = System.currentTimeMillis() + 60000;
                                this.D0 = this.C0;
                                this.E0 = 1.0f;
                                this.F0 = System.currentTimeMillis();
                                this.G0 = false;
                                this.e1 = true;
                                this.n2 = AnimationUtils.currentAnimationTimeMillis();
                                this.p2 = System.currentTimeMillis() + 340;
                                this.e = null;
                                this.v0 = null;
                                this.A2 = null;
                                u1(false);
                                d1(R.drawable.msg_recent, a0(), null);
                                i0();
                                if (cVar != null) {
                                    cVar.x(1);
                                    return true;
                                }
                            }
                            return true;
                        }
                        int i15 = 0;
                        while (true) {
                            if (i15 >= 3) {
                                this.m1 = 0.0f;
                                if (rectF7.contains(x10, y10)) {
                                    int max2 = Math.max(0, Math.min(2, (int) ((x10 - rectF7.left) / (rectF7.width() / 3.0f))));
                                    i0();
                                    postDelayed(new o0(this, max2, 1), 200L);
                                    return true;
                                }
                            } else if (rectFArr[i15].contains(x10, y10)) {
                                this.m1 = 0.0f;
                                if (i15 == 0) {
                                    if (this.x0) {
                                        this.B0 = true;
                                        this.A0 = System.currentTimeMillis() + 60000;
                                    }
                                    this.B2 = -1;
                                    if (cVar == null || (n0Var = ((i0) cVar.b).e) == null) {
                                        z12 = true;
                                    } else {
                                        z12 = true;
                                        n0Var.n(true, n0Var.d == 1);
                                    }
                                    u1(z12);
                                    if (this.x0) {
                                        d1(R.drawable.msg_recent, a0(), null);
                                    } else {
                                        d1(R.drawable.msg_retry, hd.M0(2131746477, null), null);
                                    }
                                    i0();
                                    return true;
                                }
                                if (i15 != 1) {
                                    U0(hd.M0(2131746478, null));
                                    return true;
                                }
                                boolean z15 = this.x0;
                                this.x0 = !z15;
                                if (z15) {
                                    this.B0 = false;
                                } else {
                                    this.B0 = true;
                                    this.A0 = System.currentTimeMillis() + 60000;
                                }
                                this.B2 = -1;
                                u1(true);
                                d1(R.drawable.msg_recent, this.x0 ? a0() : hd.M0(2131746476, null), null);
                                if (cVar != null) {
                                    cVar.x(this.x0 ? 1 : 2);
                                    return true;
                                }
                            } else {
                                i15++;
                            }
                        }
                    } else {
                        if (this.g1 > 0.001f) {
                            this.h1 = 0.0f;
                            invalidate();
                            return true;
                        }
                        if (cVar != null) {
                            i0 i0Var = (i0) cVar.b;
                            if (i0Var.getParentActivity() != null) {
                                if (i0Var.getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                                    i0Var.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 34);
                                    return true;
                                }
                                i0Var.f0();
                                return true;
                            }
                        }
                    }
                }
            } else if (actionMasked != 2) {
                if (actionMasked != 3) {
                    return super.onTouchEvent(motionEvent);
                }
                removeCallbacks(s0Var);
                Q0();
                S0();
                if (this.S) {
                    this.S = false;
                    R0();
                    return true;
                }
            } else if (this.S) {
                this.l0.addMovement(motionEvent);
                float f15 = x10 - this.i9;
                float f16 = y10 - this.j9;
                if (!this.T && Math.hypot(f15, f16) > org.telegram.messenger.g0.L(8.0f)) {
                    this.T = true;
                }
                if (this.T) {
                    this.O = this.Q + f15;
                    this.P = this.R + f16;
                    this.f0 = (getWidth() * 0.32f * ((float) Math.tanh((f15 / Math.max(1.0f, r4)) * 2.5f))) + this.h0;
                    this.g0 = (0.32f * getHeight() * ((float) Math.tanh((f16 / Math.max(1.0f, r2)) * 2.5f))) + this.i0;
                    return true;
                }
            } else {
                int i16 = this.s9;
                if (i16 >= 0 && (rippleDrawable = this.r9[i16]) != null) {
                    rippleDrawable.setHotspot(x10, y10);
                }
                if (this.s9 >= 0 && Math.hypot(x10 - this.i9, y10 - this.j9) > org.telegram.messenger.g0.L(10.0f)) {
                    Q0();
                }
                if (Math.hypot(x10 - this.i9, y10 - this.j9) > org.telegram.messenger.g0.L(10.0f)) {
                    S0();
                }
                VelocityTracker velocityTracker2 = this.n9;
                if (velocityTracker2 != null) {
                    velocityTracker2.addMovement(motionEvent);
                }
                if (!this.p9 && this.g1 > 0.5f) {
                    float f17 = this.j9;
                    if (f17 > rectF8.top && Math.abs(y10 - f17) > viewConfiguration.getScaledTouchSlop()) {
                        this.p9 = true;
                        removeCallbacks(s0Var);
                        this.j9 = y10;
                        this.k9 = this.k1;
                    }
                }
                if (this.p9) {
                    this.k1 = Math.max(0.0f, Math.min(z0(), this.k9 - (y10 - this.j9)));
                    return true;
                }
            }
        } else {
            boolean isFinished = overScroller.isFinished();
            this.o9 = !isFinished;
            if (!isFinished) {
                overScroller.forceFinished(true);
                invalidate();
            }
            this.i9 = x10;
            this.j9 = y10;
            this.k9 = this.k1;
            this.p9 = false;
            VelocityTracker velocityTracker3 = this.n9;
            if (velocityTracker3 == null) {
                this.n9 = VelocityTracker.obtain();
            } else {
                velocityTracker3.clear();
            }
            this.n9.addMovement(motionEvent);
            if (this.g1 < 0.5f && this.l1 < 0.5f) {
                float width3 = getWidth() * 0.745f;
                float width4 = (getWidth() - width3) / 2.0f;
                float m10 = m();
                if ((x10 <= width4 || x10 >= width4 + width3 || y10 <= m10 || y10 >= l() + m10) && ((!this.L0 || !m0(x10, y10, rectF4)) && !m0(x10, y10, rectF5) && ((this.r7 || (!m0(x10, y10, rectF3) && !m0(x10, y10, rectF2))) && !m0(x10, y10, rectF6) && !m0(x10, y10, rectF7)))) {
                    z10 = true;
                    this.S = z10;
                    if (this.g1 > 0.5f && this.i1 == 2) {
                        int f04 = f0();
                        float L4 = x10 - (rectF8.left + org.telegram.messenger.g0.L(4.0f));
                        float L5 = ((this.k1 + y10) - (org.telegram.messenger.g0.L(4.0f) + rectF8.top)) - 0.0f;
                        width = (L4 >= 0.0f || L5 < 0.0f || h0()) ? -1 : ((int) (L4 / ((rectF8.width() - org.telegram.messenger.g0.L(8.0f)) / f04))) + (((int) (L5 / ((rectF8.width() - org.telegram.messenger.g0.L(8.0f)) / 3.0f))) * f04);
                        if (width >= 0 && width < arrayList.size()) {
                            this.Q7 = width;
                            this.S7 = AnimationUtils.currentAnimationTimeMillis();
                        }
                    }
                    if (this.g1 > 0.5f || this.i1 != 0 || y10 <= rectF8.top) {
                        f10 = 0.0f;
                    } else {
                        float L6 = x10 - (rectF8.left + org.telegram.messenger.g0.L(4.0f));
                        float L7 = (this.k1 + y10) - (org.telegram.messenger.g0.L(4.0f) + rectF8.top);
                        float width5 = (rectF8.width() - org.telegram.messenger.g0.L(8.0f)) / 6.0f;
                        f10 = 0.0f;
                        int i17 = (L6 < 0.0f || L7 < 0.0f || L6 >= 6.0f * width5) ? -1 : ((int) (L6 / width5)) + (((int) (L7 / width5)) * 6);
                        if (i17 >= 0 && i17 < a.b.length) {
                            this.W7 = i17;
                            this.X7 = AnimationUtils.currentAnimationTimeMillis();
                            invalidate();
                        }
                    }
                    this.T = false;
                    if (this.S) {
                        this.U = false;
                        this.V = false;
                        this.Q = this.O;
                        this.R = this.P;
                        this.h0 = this.f0;
                        this.i0 = this.g0;
                        VelocityTracker velocityTracker4 = this.l0;
                        if (velocityTracker4 == null) {
                            this.l0 = VelocityTracker.obtain();
                        } else {
                            velocityTracker4.clear();
                        }
                        this.l0.addMovement(motionEvent);
                    }
                    removeCallbacks(s0Var);
                    if (this.l1 > 0.5f) {
                        for (int i18 = 0; i18 < 3; i18++) {
                            rectFArr[i18].contains(x10, y10);
                        }
                    }
                    Q0();
                    if (this.l1 <= 0.5f) {
                        if (this.m7 || !m0(x10, y10, rectF6)) {
                            for (int i19 = 0; i19 < 3; i19++) {
                                if (rectFArr[i19].contains(x10, y10)) {
                                    i7 = i19;
                                    break;
                                }
                            }
                            i7 = -1;
                            if (i7 >= 0) {
                                long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                                long[] jArr = this.y9;
                                this.A9[i7] = jArr[i7] != 0 ? this.z9[i7] * ((float) Math.exp((-(currentAnimationTimeMillis2 - r6)) / 180.0f)) : f10;
                                jArr[i7] = 0;
                                this.v9[i7] = x10;
                                this.w9[i7] = y10;
                                this.x9[i7] = currentAnimationTimeMillis2;
                                this.s9 = i7;
                                invalidate();
                                return true;
                            }
                        }
                        i7 = 5;
                        if (i7 >= 0) {
                        }
                    } else {
                        if (m0(x10, y10, rectF5)) {
                            i7 = 3;
                        } else {
                            if (this.m7 || !m0(x10, y10, rectF6)) {
                                if (this.L0 && m0(x10, y10, rectF4)) {
                                    i7 = 9;
                                } else {
                                    if (this.g1 < 0.5f) {
                                        if (!this.r7 && m0(x10, y10, rectF3)) {
                                            i7 = 4;
                                        } else if (!this.r7 && m0(x10, y10, rectF2)) {
                                            i7 = 11;
                                        } else if (this.a && m0(x10, y10, rectF7)) {
                                            i7 = Math.max(0, Math.min(2, (int) ((x10 - rectF7.left) / (rectF7.width() / 3.0f)))) + 6;
                                        }
                                    }
                                    if (this.g1 > 0.5f && this.i1 == 2 && h0() && m0(x10, y10, rectF)) {
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
            z10 = false;
            this.S = z10;
            if (this.g1 > 0.5f) {
                int f042 = f0();
                float L42 = x10 - (rectF8.left + org.telegram.messenger.g0.L(4.0f));
                float L52 = ((this.k1 + y10) - (org.telegram.messenger.g0.L(4.0f) + rectF8.top)) - 0.0f;
                if (L42 >= 0.0f) {
                }
                if (width >= 0) {
                    this.Q7 = width;
                    this.S7 = AnimationUtils.currentAnimationTimeMillis();
                }
            }
            if (this.g1 > 0.5f) {
            }
            f10 = 0.0f;
            this.T = false;
            if (this.S) {
            }
            removeCallbacks(s0Var);
            if (this.l1 > 0.5f) {
            }
            Q0();
            if (this.l1 <= 0.5f) {
            }
        }
        return true;
    }

    public final void p(float f10, float f11, float f12) {
        float L;
        float nextFloat;
        float f13;
        float d;
        int i7 = this.d1;
        if (i7 >= 320) {
            return;
        }
        this.d1 = i7 + 1;
        Random random = this.f1;
        float nextFloat2 = random.nextFloat();
        int i10 = nextFloat2 < 0.65f ? 0 : nextFloat2 < 0.9f ? 1 : 2;
        byte[] bArr = this.b1;
        bArr[i7] = (byte) i10;
        this.c1[i7] = false;
        this.N0[i7] = ((random.nextFloat() - 0.5f) * org.telegram.messenger.g0.L(4.0f)) + f10;
        this.O0[i7] = f11;
        byte b10 = bArr[i7];
        if (b10 == 0) {
            L = org.telegram.messenger.g0.L(1.4f);
            nextFloat = random.nextFloat();
            f13 = 1.6f;
        } else {
            if (b10 == 1) {
                d = org.telegram.ui.Cells.y0.d(0.7f, random.nextFloat(), org.telegram.messenger.g0.N(0.7f));
                this.T0[i7] = d;
                this.P0[i7] = (random.nextFloat() * org.telegram.messenger.g0.L(80.0f)) + (-org.telegram.messenger.g0.L(30.0f));
                this.Q0[i7] = (-org.telegram.messenger.g0.L(50.0f)) - (random.nextFloat() * org.telegram.messenger.g0.L(100.0f));
                this.R0[i7] = Math.max(0.05f, Math.min((random.nextFloat() * 0.2f) + 0.3f, f12));
                this.S0[i7] = 0.0f;
                this.U0[i7] = random.nextFloat() * 90.0f;
                this.V0[i7] = (random.nextFloat() - 0.5f) * 1080.0f;
            }
            L = org.telegram.messenger.g0.L(3.0f);
            nextFloat = random.nextFloat();
            f13 = 1.5f;
        }
        d = (nextFloat * org.telegram.messenger.g0.L(f13)) + L;
        this.T0[i7] = d;
        this.P0[i7] = (random.nextFloat() * org.telegram.messenger.g0.L(80.0f)) + (-org.telegram.messenger.g0.L(30.0f));
        this.Q0[i7] = (-org.telegram.messenger.g0.L(50.0f)) - (random.nextFloat() * org.telegram.messenger.g0.L(100.0f));
        this.R0[i7] = Math.max(0.05f, Math.min((random.nextFloat() * 0.2f) + 0.3f, f12));
        this.S0[i7] = 0.0f;
        this.U0[i7] = random.nextFloat() * 90.0f;
        this.V0[i7] = (random.nextFloat() - 0.5f) * 1080.0f;
    }

    public final ch0 p1() {
        if (this.a9 == null) {
            ch0 ch0Var = new ch0(R.raw.contact_check, org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(28.0f));
            this.a9 = ch0Var;
            ch0Var.setColorFilter(new ColorMatrixColorFilter(new float[]{0.0f, 0.0f, 0.0f, 0.0f, 255.0f, 0.0f, 0.0f, 0.0f, 0.0f, 255.0f, 0.0f, 0.0f, 0.0f, 0.0f, 255.0f, 0.2126f, 0.7152f, 0.0722f, 1.0f, -255.0f}));
            this.a9.K(0);
            this.a9.R(this);
            this.a9.J(true);
        }
        return this.a9;
    }

    public final void q(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, boolean z10, boolean z11) {
        int i7 = this.d1;
        if (i7 >= 320) {
            return;
        }
        this.d1 = i7 + 1;
        this.b1[i7] = z10 ? (byte) 1 : (byte) 0;
        this.c1[i7] = true;
        this.N0[i7] = f10;
        this.O0[i7] = f11;
        this.P0[i7] = f12;
        this.Q0[i7] = f13;
        this.W0[i7] = f10;
        this.X0[i7] = f11;
        this.Y0[i7] = f14;
        Random random = this.f1;
        this.Z0[i7] = z11 ? org.telegram.ui.Cells.y0.g(random, 3.0f, 4.0f) : 0.0f;
        this.a1[i7] = random.nextFloat() * 6.2832f;
        this.T0[i7] = f15;
        this.R0[i7] = f16;
        this.S0[i7] = 0.0f;
        this.U0[i7] = f17;
        this.V0[i7] = 0.0f;
    }

    public final ch0 q1() {
        if (this.b9 == null) {
            ch0 ch0Var = new ch0(R.raw.ic_save_to_gallery, org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(28.0f));
            this.b9 = ch0Var;
            ch0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            this.b9.K(0);
            this.b9.R(this);
            this.b9.J(true);
        }
        return this.b9;
    }

    public final ch0 r1() {
        if (this.Z8 == null) {
            ch0 ch0Var = new ch0(R.raw.star_premium_2, org.telegram.messenger.g0.L(27.0f), org.telegram.messenger.g0.L(27.0f));
            this.Z8 = ch0Var;
            ch0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            this.Z8.K(0);
            this.Z8.R(this);
            this.Z8.J(true);
        }
        return this.Z8;
    }

    public final boolean s0(String str) {
        return str != null && str.equals(this.v2);
    }

    public final float s1(String str) {
        int indexOf = str.indexOf(10);
        TextPaint textPaint = this.D1;
        if (indexOf >= 0) {
            return Math.max(textPaint.measureText(str, 0, indexOf), textPaint.measureText(str, indexOf + 1, str.length()));
        }
        if (!s0(str)) {
            return textPaint.measureText(str);
        }
        float textSize = textPaint.getTextSize();
        TextPaint textPaint2 = this.z2;
        textPaint2.setTextSize(textSize);
        return textPaint.measureText(this.y2) + textPaint2.measureText(this.x2) + textPaint.measureText(this.w2);
    }

    public void setFeeStars(long j3) {
        this.L0 = j3 > 0;
        String a02 = j3 > 0 ? hd.a0(null, null, 2131746481, hd.E(j3, ',')) : "";
        int indexOf = a02.indexOf(9733);
        this.J0 = indexOf >= 0 ? a02.substring(0, indexOf) : "";
        if (indexOf >= 0) {
            a02 = a02.substring(indexOf + 1);
        }
        this.K0 = a02;
        if (!this.L0 && this.w0) {
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
            this.v0 = null;
        } else {
            Utilities.e.c(new ai.h0(str, new q0(this, str, 1)));
        }
    }

    public void setGiftsOwner(long j3) {
        if (this.x1 == j3) {
            return;
        }
        this.x1 = j3;
        l8 l8Var = this.j2;
        if (l8Var != null) {
            l8Var.f();
        }
        l8 l8Var2 = new l8(this.b, j3, false);
        this.j2 = l8Var2;
        l8Var2.g = 776;
        l8Var2.e = true;
        l8Var2.j(true);
        y0();
    }

    public void setImmediateOnOpen(boolean z10) {
        this.a2 = z10;
    }

    public void setInstantTheme(boolean z10) {
        this.g2 = z10;
    }

    public void setLinkExpires(long j3) {
        long j10 = this.H2;
        if (j10 == j3) {
            return;
        }
        if (j10 != 0 && j3 != 0) {
            i0();
        }
        this.H2 = j3;
        this.O2 = -1L;
        invalidate();
    }

    public void setOnPicksChanged(Runnable runnable) {
        this.e2 = runnable;
    }

    public void setReveal(float f10) {
        float f11;
        float sin;
        this.R4 = f10;
        if (this.U4) {
            double d = f10 * 0.86d;
            double sqrt = Math.sqrt(0.18999999999999995d) * 10.134169850289656d;
            if (f10 >= 1.0f) {
                sin = 1.0f;
            } else {
                double d2 = sqrt * d;
                sin = (float) (1.0d - (((Math.sin(d2) * (0.9d / Math.sqrt(0.18999999999999995d))) + Math.cos(d2)) * Math.exp((-9.120752865260691d) * d)));
            }
            float l10 = Utilities.l((f10 - 0.85f) / 0.15f);
            f11 = e2.z(1.0f, sin, e2.C(l10, 2.0f, 3.0f, l10 * l10), sin);
        } else {
            float f12 = 1.0f - f10;
            f11 = 1.0f - (f12 * f12);
        }
        this.V4 = f11;
        boolean z10 = f10 < 1.0f;
        if (!z10) {
            this.T4 = true;
        }
        setTranslationY(z10 ? Math.round((1.0f - f11) * org.telegram.messenger.g0.L(64.0f)) : 0.0f);
        setAlpha(z10 ? Utilities.l(f11 / 0.35f) : 1.0f);
        if (getParent() instanceof View) {
            ((View) getParent()).setBackgroundColor(z10 ? a(f11, TLObject.FLAG_30) : 0);
        }
        float f13 = -1.0f;
        if (!z10) {
            this.q3 = -1.0f;
        }
        if (z10 && this.U4) {
            f13 = Utilities.l(f11);
        }
        this.t0.D = f13;
        int i7 = z10 ? 2 : 0;
        if (getLayerType() != i7) {
            setLayerType(i7, null);
        }
        invalidate();
    }

    public void setRevealOpening(boolean z10) {
        this.U4 = z10;
    }

    public void setScanHidden(boolean z10) {
        if (this.m7 != z10) {
            this.m7 = z10;
            invalidate();
        }
    }

    public void setTemporaryLink(boolean z10) {
        if (this.C2 == z10) {
            return;
        }
        this.C2 = z10;
        if (!this.I2) {
            float f10 = z10 ? 1.0f : 0.0f;
            this.F2 = f10;
            this.D2 = f10;
        }
        invalidate();
    }

    public void setThemeEditable(boolean z10) {
        if (this.a != z10) {
            this.a = z10;
            invalidate();
        }
    }

    public void setTimerOnly(boolean z10) {
        this.z0 = z10;
    }

    public final int t0() {
        int i7 = this.z6;
        SparseIntArray sparseIntArray = this.y6;
        if (i7 != 1) {
            sparseIntArray.clear();
            this.z6 = 1;
        }
        x0 x0Var = this.n;
        int i10 = x0Var != null ? x0Var.b : 0;
        int indexOfKey = sparseIntArray.indexOfKey(i10);
        if (indexOfKey >= 0) {
            return sparseIntArray.valueAt(indexOfKey);
        }
        int u10 = u(this.n);
        sparseIntArray.put(i10, u10);
        return u10;
    }

    public final void u1(boolean z10) {
        String sb2;
        if (this.w0) {
            if (this.x0) {
                int ceil = (int) Math.ceil((this.B0 ? 60000L : Math.max(0L, this.A0 - System.currentTimeMillis())) / 1000.0d);
                if (ceil == this.B2 && this.A2 != null) {
                    return;
                }
                this.B2 = ceil;
                StringBuilder sb3 = new StringBuilder();
                org.telegram.ui.Cells.y0.r(null, 2131746490, sb3, " · ");
                sb3.append(hd.a0(null, null, 2131746491, String.format(Locale.US, "%d:%02d", Integer.valueOf(ceil / 60), Integer.valueOf(ceil % 60))));
                sb2 = sb3.toString();
            } else {
                StringBuilder sb4 = new StringBuilder();
                org.telegram.ui.Cells.y0.r(null, 2131746490, sb4, " · ");
                sb2 = i5.c.k(2131746483, null, sb4);
                this.B2 = -1;
            }
            if (sb2.equals(this.A2)) {
                return;
            }
            this.A2 = sb2;
            this.M0.t(sb2, z10, true);
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        ch0 ch0Var;
        return (drawable instanceof RippleDrawable) || drawable == this.M0 || drawable == this.Y1 || ((ch0Var = this.m8) != null && drawable == ch0Var) || super.verifyDrawable(drawable);
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
        float f10 = this.g3;
        float f11 = (-f10) / 2.0f;
        float width = (bitmap.getWidth() - 0.5f) * f10;
        float height = (bitmap.getHeight() - 0.5f) * f10;
        RectF rectF = this.f3;
        rectF.set(f11, f11, width, height);
        canvas.drawBitmap(bitmap, (Rect) null, rectF, this.c3);
    }

    public final void y0() {
        int i7;
        l8 l8Var = this.j2;
        if (l8Var == null) {
            return;
        }
        w0 w0Var = this.G;
        int i10 = w0Var.a;
        ArrayList arrayList = this.w1;
        long j3 = (i10 != 2 || (i7 = w0Var.q) < 0 || i7 >= arrayList.size()) ? 0L : ((TL_stars.TL_starGiftUnique) arrayList.get(this.G.q)).id;
        TL_stars.TL_starGiftUnique tL_starGiftUnique = j3 != 0 ? (TL_stars.TL_starGiftUnique) arrayList.get(this.G.q) : null;
        arrayList.clear();
        HashMap hashMap = this.z1;
        hashMap.clear();
        ArrayList arrayList2 = l8Var.l;
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
            this.G.q = i11;
            this.M7 = i11;
        }
        boolean z10 = l8Var.j;
        this.y1 = z10;
        if (!z10 && !l8Var.i) {
            l8Var.a();
        }
        if (!arrayList.isEmpty() && !this.m2) {
            this.m2 = true;
            s0 s0Var = this.l2;
            removeCallbacks(s0Var);
            postDelayed(s0Var, 900L);
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
        boolean z10;
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
        boolean z11;
        w0 w0Var;
        boolean z12;
        boolean z13;
        int i11;
        int i12;
        boolean z14;
        float f32;
        int ceil;
        int ceil2;
        Bitmap bitmap;
        int i13;
        boolean z15;
        float f33;
        float f34;
        int i14;
        int i15;
        int i16;
        boolean z16;
        float[] fArr3;
        int[] iArr;
        float[] fArr4;
        float[] fArr5;
        boolean z17 = (this.s >= 1.0f || this.r == null || this.n == null) ? false : true;
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
            Bitmap bitmap2 = this.Z2;
            Paint paint = this.d3;
            if (bitmap2 != null && bitmap2.getWidth() == ceil3 && this.Z2.getHeight() == ceil4) {
                f15 = 2.0f;
            } else {
                Bitmap.Config config = Bitmap.Config.ARGB_8888;
                f15 = 2.0f;
                this.Z2 = Bitmap.createBitmap(ceil3, ceil4, config);
                this.a3 = Bitmap.createBitmap(ceil3, ceil4, config);
                Bitmap bitmap3 = this.Z2;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap3, tileMode, tileMode);
                this.b3 = bitmapShader;
                paint.setShader(bitmapShader);
                this.h3 = false;
            }
            this.g3 = max;
            M0(0, z17 ? this.r : this.n, i7, i10);
            this.i3 = false;
            int[] iArr2 = this.m3;
            float[] fArr6 = this.o3;
            if (z17) {
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
                boolean z18 = hypot > ((float) org.telegram.messenger.g0.L(4.0f));
                this.i3 = z18;
                if (z18) {
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
                    iArr2[6] = f.k(0.55f, this.n.b, -1);
                    i16 = !z17 ? 2 : i15;
                    z16 = this.h3;
                    fArr3 = this.p3;
                    iArr = this.n3;
                    fArr4 = this.l3;
                    fArr5 = this.k3;
                    if (!z16 && i16 == this.j3 && Arrays.equals(fArr5, fArr4) && Arrays.equals(iArr2, iArr) && (!z17 || Arrays.equals(fArr6, fArr3))) {
                        f11 = 1.0f;
                    } else {
                        f11 = 1.0f;
                        Utilities.generateQrBackdrop(this.Z2, !this.i3 ? this.a3 : null, max, i16, this.k3, this.m3, this.o3);
                        max = max;
                        int i17 = i14;
                        System.arraycopy(fArr5, i17, fArr4, i17, fArr5.length);
                        System.arraycopy(iArr2, i17, iArr, i17, iArr2.length);
                        System.arraycopy(fArr6, i17, fArr3, i17, fArr6.length);
                        this.j3 = i16;
                        this.h3 = i15;
                    }
                    if (this.R4 >= f11) {
                        if (this.q3 < 0.0f && isAttachedToWindow()) {
                            this.q3 = v.g(this);
                        }
                        if (this.q3 > 0.0f) {
                            Matrix matrix = this.e3;
                            matrix.setScale(max, max);
                            float f39 = (-max) / f15;
                            matrix.postTranslate(f39, f39);
                            this.b3.setLocalMatrix(matrix);
                            float f40 = this.q3;
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
                    y(canvas2, this.Z2);
                }
            } else {
                i14 = 0;
                i15 = 1;
            }
            if (!z17) {
            }
            z16 = this.h3;
            fArr3 = this.p3;
            iArr = this.n3;
            fArr4 = this.l3;
            fArr5 = this.k3;
            if (!z16) {
            }
            f11 = 1.0f;
            Utilities.generateQrBackdrop(this.Z2, !this.i3 ? this.a3 : null, max, i16, this.k3, this.m3, this.o3);
            max = max;
            int i172 = i14;
            System.arraycopy(fArr5, i172, fArr4, i172, fArr5.length);
            System.arraycopy(iArr2, i172, iArr, i172, iArr2.length);
            System.arraycopy(fArr6, i172, fArr3, i172, fArr6.length);
            this.j3 = i16;
            this.h3 = i15;
            if (this.R4 >= f11) {
            }
            canvas2 = canvas;
            f10 = 0.2f;
            f12 = 3.0f;
            f16 = 0.45f;
            y(canvas2, this.Z2);
        }
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        float f41 = (currentAnimationTimeMillis - this.E) / 1000.0f;
        this.w3 = f41;
        float f42 = this.Q3;
        float max4 = f42 < f13 ? f13 : Math.max(f13, Math.min(0.05f, f41 - f42));
        float f43 = this.w3;
        this.Q3 = f43;
        boolean z19 = this.S || this.U || this.V;
        if (z19) {
            f17 = 0.05f;
            this.R3 = f43 + 0.25f;
        } else {
            f17 = 0.05f;
        }
        float f44 = (z19 || f43 < this.R3) ? f13 : f11;
        float f45 = this.O3;
        if (f44 < f45) {
            f16 = 0.07f;
        }
        if (max4 > f13) {
            f18 = 1000.0f;
            f19 = max4;
            this.O3 = e2.z(f11, (float) Math.exp((-max4) / f16), f44 - f45, f45);
        } else {
            f18 = 1000.0f;
            f19 = max4;
        }
        float f46 = f19 * this.O3;
        this.P3 = f46;
        this.N3 = this.N3 + f46;
        double radians = (float) Math.toRadians((r4 * (-0.763f)) % 360.0f);
        Math.cos(radians);
        Math.sin(radians);
        float f47 = this.w3;
        if (this.N >= f13) {
            float f48 = this.P3;
            if (f48 > f13) {
                float f49 = this.N3 - (f48 / f15);
                f20 = 0.016f;
                double sin = (((float) Math.sin((f49 * 0.016f) + 1.0f)) * f14) + (((float) Math.sin(0.025f * f49)) * 1.2f) + D9;
                z10 = z17;
                this.L = e2.x(((float) Math.cos(sin)) * 6.2f, org.telegram.messenger.g0.L(1.0f), f48, this.L);
                this.M = e2.x(((float) Math.sin(sin)) * 6.2f, org.telegram.messenger.g0.L(1.0f), f48, this.M);
                float f50 = this.N;
                min = f50 < f13 ? Math.min(0.033f, Math.max(f13, f47 - f50)) : f13;
                Math.exp((-min) / 0.09f);
                this.N = f47;
                if (min > f13) {
                    v0 v0Var = this.M3;
                    int i18 = v0Var.m;
                    int[] iArr3 = v0Var.l;
                    if (i18 > 0) {
                        float f51 = min / f15;
                        int i19 = 0;
                        boolean z20 = false;
                        while (i19 < 2) {
                            float[] fArr7 = v0Var.c;
                            float[] fArr8 = v0Var.j;
                            float f52 = f12;
                            float[] fArr9 = v0Var.i;
                            float f53 = f10;
                            float[] fArr10 = v0Var.h;
                            float f54 = f13;
                            float[] fArr11 = v0Var.g;
                            long j10 = currentAnimationTimeMillis;
                            float[] fArr12 = v0Var.f;
                            float[] fArr13 = v0Var.e;
                            float[] fArr14 = v0Var.d;
                            float sqrt = ((float) Math.sqrt(220.0d)) * 1.24f;
                            boolean z21 = false;
                            for (int i20 = 0; i20 < v0Var.m; i20++) {
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
                                    z21 = true;
                                }
                            }
                            z20 |= z21;
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
                        if (!z20 && (this.s >= 1.0f || this.r == null)) {
                            for (int i22 = 0; i22 < v0Var.m; i22++) {
                                v0Var.b[iArr3[i22]] = false;
                            }
                            v0Var.m = 0;
                        }
                        if (this.U) {
                            float f64 = (j3 - this.W) / f18;
                            float exp = (1.0f - ((float) Math.exp((-f64) / 0.35f))) * 0.35f;
                            this.O = (this.d0 * exp) + this.b0;
                            this.P = (this.e0 * exp) + this.c0;
                            if (f64 > 2.8f) {
                                this.U = false;
                            }
                        }
                        if (this.V) {
                            float f65 = (j3 - this.a0) / f18;
                            float cos = (float) (Math.cos((f65 * 6.283185307179586d) / 0.8500000238418579d) * Math.exp((-f65) / 0.22f));
                            this.f0 = this.j0 * cos;
                            this.g0 = this.k0 * cos;
                            if (f65 > 1.6f) {
                                this.V = false;
                                float f66 = f22;
                                this.g0 = f66;
                                this.f0 = f66;
                            }
                        }
                        fArr = c1.b;
                        f24 = fArr[27] / 100.0f;
                        while (true) {
                            f25 = this.w3;
                            f26 = this.G3 + this.H3;
                            f27 = 1.5f;
                            if (f25 < f26) {
                                break;
                            }
                            this.G3 = f26;
                            float f67 = fArr[25] + f23;
                            float f68 = fArr[26];
                            w0 w0Var2 = this.G;
                            if (w0Var2 == null || w0Var2.a != 1) {
                                f27 = 1.0f;
                            }
                            this.H3 = Math.max(f67, (this.f1.nextFloat() * 0.8f * f24) + (f68 * f27));
                            double radians2 = Math.toRadians(((r7.nextFloat() - 0.5f) * 12.0f * f24) + fArr[24]);
                            this.I3 = (float) Math.cos(radians2);
                            this.J3 = (float) Math.sin(radians2);
                        }
                        if (!this.E3) {
                            this.E3 = true;
                            this.G3 = (fArr[51] / f18) + f25 + 1.5f;
                            this.H3 = f18;
                        }
                        f28 = this.G3;
                        f29 = fArr[25];
                        if (f25 >= f28 + f29 && this.H3 > 999.0f) {
                            this.H3 = fArr[26];
                        }
                        float f69 = (f25 - f28) / f29;
                        this.z3 = this.R4 < 1.0f && f69 >= 0.0f && f69 < 1.0f;
                        this.y3 = org.telegram.messenger.g0.N(fArr[23]);
                        if (this.z3) {
                            float cos2 = 0.5f - (((float) Math.cos(f69 * 3.141592653589793d)) * 0.5f);
                            float y10 = (this.y3 * f21) + e2.y(Math.abs(this.J3), i10, Math.abs(this.I3) * i7, f15);
                            this.x3 = org.telegram.messenger.g0.T1(-y10, y10, cos2);
                            this.F3 = 1.0f;
                        }
                        long nanoTime = System.nanoTime();
                        float min2 = this.V6 == 0 ? f20 : Math.min(0.1f, (nanoTime - r12) / 1.0E9f);
                        this.V6 = nanoTime;
                        if (fArr[15] >= 0.5f || this.R4 < 1.0f) {
                            f30 = 0.35f;
                            fArr2 = fArr;
                            f31 = 0.0f;
                            this.R6 = 0.0f;
                        } else {
                            float max5 = 30.0f / Math.max(1.0f, fArr[16]);
                            float max6 = Math.max(-1.0f, Math.min(1.0f, this.G6 * max5));
                            float max7 = Math.max(-1.0f, Math.min(1.0f, this.H6 * max5));
                            if (!this.W6) {
                                this.S6 = max6;
                                this.T6 = max7;
                                this.W6 = true;
                            }
                            f30 = 0.35f;
                            fArr2 = fArr;
                            float hypot2 = ((float) Math.hypot(max6 - this.S6, max7 - this.T6)) / min2;
                            this.S6 = max6;
                            this.T6 = max7;
                            long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                            if (hypot2 > 0.15f) {
                                this.U6 = currentAnimationTimeMillis2;
                            }
                            boolean z22 = currentAnimationTimeMillis2 - this.U6 < 1500;
                            float B = e2.B(max7, -this.J3, max6 * (-this.I3), e2.y(Math.abs(this.J3), i10, Math.abs(this.I3) * i7, 2.0f) + this.y3);
                            if (this.R6 <= 0.001f) {
                                this.Q6 = B;
                            }
                            float f70 = this.Q6;
                            this.Q6 = e2.z(1.0f, (float) Math.exp((-min2) / 0.1f), B - f70, f70);
                            float e10 = z22 ? org.telegram.ui.Cells.y0.e(min2, f23, this.R6, 1.0f) : org.telegram.ui.Cells.y0.z(min2, f14, this.R6, 0.0f);
                            this.R6 = e10;
                            if (e10 > 0.001f) {
                                float C = e2.C(e10, 2.0f, f21, e10 * e10);
                                if (this.z3) {
                                    this.x3 = org.telegram.messenger.g0.T1(this.x3, this.Q6, C);
                                    this.F3 = org.telegram.messenger.g0.T1(this.F3, 1.0f, C);
                                } else {
                                    this.x3 = this.Q6;
                                    this.F3 = C;
                                }
                                this.z3 = true;
                                if (this.R6 >= 0.999f) {
                                    this.G3 = this.w3;
                                }
                            }
                            f31 = 0.0f;
                        }
                        if (this.z3 && this.G.a != 0) {
                            f32 = fArr2[46] / 100.0f;
                            if (f32 > f31 && i7 > 0 && i10 > 0) {
                                float L2 = org.telegram.messenger.g0.L(12.0f);
                                float f71 = i7;
                                ceil = ((int) Math.ceil(f71 / L2)) + 1;
                                float f72 = i10;
                                ceil2 = ((int) Math.ceil(f72 / L2)) + 1;
                                bitmap = this.A3;
                                if (bitmap != null || bitmap.getWidth() != ceil || this.A3.getHeight() != ceil2) {
                                    this.A3 = Bitmap.createBitmap(ceil, ceil2, Bitmap.Config.ARGB_8888);
                                    this.B3 = new int[ceil * ceil2];
                                }
                                float max8 = Math.max(1.0f, fArr2[45]);
                                float f73 = fArr2[47] / 100.0f;
                                float f74 = f32 * 0.0275f;
                                float L3 = org.telegram.messenger.g0.L(130.0f);
                                float f75 = this.w3 * 0.12f;
                                i13 = 0;
                                z15 = false;
                                while (i13 < ceil2) {
                                    int i23 = 0;
                                    while (i23 < ceil) {
                                        float f76 = f74;
                                        float f77 = i23 * L2;
                                        float f78 = f75;
                                        float f79 = i13 * L2;
                                        c1(f77, f79, i7, i10);
                                        float f80 = this.p4 / max8;
                                        if (f80 >= 3.5f || f80 <= -3.5f) {
                                            f33 = f71;
                                            f34 = 0.0f;
                                        } else {
                                            f33 = f71;
                                            float exp2 = ((float) Math.exp((-0.5f) * f80 * f80)) * this.q4;
                                            if (f73 > 0.0f) {
                                                float y11 = e2.y(f79 - (f72 / 2.0f), this.I3, (f77 - (f33 / 2.0f)) * (-this.J3), L3);
                                                exp2 = ((((((v1(((y11 * 2.3f) - (1.7f * f78)) + 11.3f) * f30) + (v1(y11 + f78) * 0.65f)) * 2.0f) - 1.0f) * f73) + 1.0f) * exp2;
                                            }
                                            f34 = exp2;
                                        }
                                        int max9 = Math.max(0, Math.min(ns.e4, Math.round(255.0f * f76 * f34)));
                                        if (max9 > 0) {
                                            z15 = true;
                                        }
                                        this.B3[(i13 * ceil) + i23] = (max9 << 24) | 16777215;
                                        i23++;
                                        f74 = f76;
                                        f75 = f78;
                                        f71 = f33;
                                    }
                                    i13++;
                                    f75 = f75;
                                }
                                z11 = false;
                                if (z15) {
                                    this.A3.setPixels(this.B3, 0, ceil, 0, 0, ceil, ceil2);
                                    float f81 = (-L2) / 2.0f;
                                    float f82 = ceil * L2;
                                    float f83 = L2 / 2.0f;
                                    float f84 = (ceil2 * L2) - f83;
                                    RectF rectF = this.D3;
                                    rectF.set(f81, f81, f82 - f83, f84);
                                    canvas2.drawBitmap(this.A3, (Rect) null, rectF, this.C3);
                                }
                                float f85 = (j3 - this.I) / 1000.0f;
                                w0Var = this.H;
                                if (w0Var != null) {
                                    if (f85 < (this.G.h ? 0.6f : 0.3f) + 0.135f + 0.315f) {
                                        z12 = true;
                                        if (!z12 && w0Var != null) {
                                            P0(w0Var);
                                            this.H = null;
                                        }
                                        z13 = z11;
                                        if (z12) {
                                            i11 = i7;
                                            i12 = i10;
                                            z14 = true;
                                        } else {
                                            w0 w0Var3 = this.H;
                                            z14 = true;
                                            if (w0Var3.a == 1) {
                                                w0 w0Var4 = this.G;
                                                if (w0Var4.a == 1) {
                                                    E(canvas2, i7, i10, w0Var3, w0Var4, f85, false, false);
                                                    if (z10 && this.i3) {
                                                        y(canvas2, this.a3);
                                                        return;
                                                    }
                                                    return;
                                                }
                                            }
                                            i11 = i7;
                                            i12 = i10;
                                        }
                                        if (z12 || !this.G.h) {
                                            if (z12) {
                                                F(canvas, i7, i10, this.H, true, this.G.a == 0 ? z14 : z13, f85);
                                                f85 = f85;
                                            }
                                            canvas2 = canvas;
                                            F(canvas2, i7, i10, this.G, false, (z12 || this.H.a == 0) ? z14 : z13, !z12 ? f85 : 100.0f);
                                        } else if (this.s >= 1.0f || this.r == null) {
                                            P0(this.H);
                                            this.H = null;
                                            canvas2 = canvas;
                                            F(canvas2, i7, i10, this.G, false, true, 100.0f);
                                        } else {
                                            float f86 = this.x;
                                            double max10 = Math.max(f86, i11 - f86);
                                            float f87 = this.y;
                                            float y13 = y1(this.s) * (((float) Math.hypot(max10, Math.max(f87, i12 - f87))) + org.telegram.messenger.g0.L(60.0f));
                                            Path path = this.S3;
                                            path.rewind();
                                            path.addCircle(this.x, this.y, y13, Path.Direction.CW);
                                            canvas2.save();
                                            v.b(canvas2, path);
                                            F(canvas2, i11, i12, this.H, true, this.G.a == 0 ? z14 : z13, -1.0f);
                                            canvas2.restore();
                                            canvas2.save();
                                            canvas2.clipPath(path);
                                            F(canvas2, i7, i10, this.G, false, this.H.a == 0 ? z14 : z13, 100.0f);
                                            canvas.restore();
                                            canvas2 = canvas;
                                        }
                                        if (z10) {
                                            return;
                                        } else {
                                            return;
                                        }
                                    }
                                }
                                z12 = z11;
                                if (!z12) {
                                    P0(w0Var);
                                    this.H = null;
                                }
                                z13 = z11;
                                if (z12) {
                                }
                                if (z12) {
                                }
                                if (z12) {
                                }
                                canvas2 = canvas;
                                F(canvas2, i7, i10, this.G, false, (z12 || this.H.a == 0) ? z14 : z13, !z12 ? f85 : 100.0f);
                                if (z10) {
                                }
                            }
                        }
                        z11 = false;
                        float f852 = (j3 - this.I) / 1000.0f;
                        w0Var = this.H;
                        if (w0Var != null) {
                        }
                        z12 = z11;
                        if (!z12) {
                        }
                        z13 = z11;
                        if (z12) {
                        }
                        if (z12) {
                        }
                        if (z12) {
                        }
                        canvas2 = canvas;
                        F(canvas2, i7, i10, this.G, false, (z12 || this.H.a == 0) ? z14 : z13, !z12 ? f852 : 100.0f);
                        if (z10) {
                        }
                    }
                }
                j3 = currentAnimationTimeMillis;
                f21 = f12;
                f22 = f13;
                f23 = f10;
                if (this.U) {
                }
                if (this.V) {
                }
                fArr = c1.b;
                f24 = fArr[27] / 100.0f;
                while (true) {
                    f25 = this.w3;
                    f26 = this.G3 + this.H3;
                    f27 = 1.5f;
                    if (f25 < f26) {
                    }
                    this.H3 = Math.max(f67, (this.f1.nextFloat() * 0.8f * f24) + (f68 * f27));
                    double radians22 = Math.toRadians(((r7.nextFloat() - 0.5f) * 12.0f * f24) + fArr[24]);
                    this.I3 = (float) Math.cos(radians22);
                    this.J3 = (float) Math.sin(radians22);
                }
                if (!this.E3) {
                }
                f28 = this.G3;
                f29 = fArr[25];
                if (f25 >= f28 + f29) {
                    this.H3 = fArr[26];
                }
                float f692 = (f25 - f28) / f29;
                this.z3 = this.R4 < 1.0f && f692 >= 0.0f && f692 < 1.0f;
                this.y3 = org.telegram.messenger.g0.N(fArr[23]);
                if (this.z3) {
                }
                long nanoTime2 = System.nanoTime();
                if (this.V6 == 0) {
                }
                this.V6 = nanoTime2;
                if (fArr[15] >= 0.5f) {
                }
                f30 = 0.35f;
                fArr2 = fArr;
                f31 = 0.0f;
                this.R6 = 0.0f;
                if (this.z3) {
                    f32 = fArr2[46] / 100.0f;
                    if (f32 > f31) {
                        float L22 = org.telegram.messenger.g0.L(12.0f);
                        float f712 = i7;
                        ceil = ((int) Math.ceil(f712 / L22)) + 1;
                        float f722 = i10;
                        ceil2 = ((int) Math.ceil(f722 / L22)) + 1;
                        bitmap = this.A3;
                        if (bitmap != null) {
                        }
                        this.A3 = Bitmap.createBitmap(ceil, ceil2, Bitmap.Config.ARGB_8888);
                        this.B3 = new int[ceil * ceil2];
                        float max82 = Math.max(1.0f, fArr2[45]);
                        float f732 = fArr2[47] / 100.0f;
                        float f742 = f32 * 0.0275f;
                        float L32 = org.telegram.messenger.g0.L(130.0f);
                        float f752 = this.w3 * 0.12f;
                        i13 = 0;
                        z15 = false;
                        while (i13 < ceil2) {
                        }
                        z11 = false;
                        if (z15) {
                        }
                        float f8522 = (j3 - this.I) / 1000.0f;
                        w0Var = this.H;
                        if (w0Var != null) {
                        }
                        z12 = z11;
                        if (!z12) {
                        }
                        z13 = z11;
                        if (z12) {
                        }
                        if (z12) {
                        }
                        if (z12) {
                        }
                        canvas2 = canvas;
                        F(canvas2, i7, i10, this.G, false, (z12 || this.H.a == 0) ? z14 : z13, !z12 ? f8522 : 100.0f);
                        if (z10) {
                        }
                    }
                }
                z11 = false;
                float f85222 = (j3 - this.I) / 1000.0f;
                w0Var = this.H;
                if (w0Var != null) {
                }
                z12 = z11;
                if (!z12) {
                }
                z13 = z11;
                if (z12) {
                }
                if (z12) {
                }
                if (z12) {
                }
                canvas2 = canvas;
                F(canvas2, i7, i10, this.G, false, (z12 || this.H.a == 0) ? z14 : z13, !z12 ? f85222 : 100.0f);
                if (z10) {
                }
            }
        }
        z10 = z17;
        f20 = 0.016f;
        float f502 = this.N;
        if (f502 < f13) {
        }
        Math.exp((-min) / 0.09f);
        this.N = f47;
        if (min > f13) {
        }
        j3 = currentAnimationTimeMillis;
        f21 = f12;
        f22 = f13;
        f23 = f10;
        if (this.U) {
        }
        if (this.V) {
        }
        fArr = c1.b;
        f24 = fArr[27] / 100.0f;
        while (true) {
            f25 = this.w3;
            f26 = this.G3 + this.H3;
            f27 = 1.5f;
            if (f25 < f26) {
            }
            this.H3 = Math.max(f67, (this.f1.nextFloat() * 0.8f * f24) + (f68 * f27));
            double radians222 = Math.toRadians(((r7.nextFloat() - 0.5f) * 12.0f * f24) + fArr[24]);
            this.I3 = (float) Math.cos(radians222);
            this.J3 = (float) Math.sin(radians222);
        }
        if (!this.E3) {
        }
        f28 = this.G3;
        f29 = fArr[25];
        if (f25 >= f28 + f29) {
        }
        float f6922 = (f25 - f28) / f29;
        this.z3 = this.R4 < 1.0f && f6922 >= 0.0f && f6922 < 1.0f;
        this.y3 = org.telegram.messenger.g0.N(fArr[23]);
        if (this.z3) {
        }
        long nanoTime22 = System.nanoTime();
        if (this.V6 == 0) {
        }
        this.V6 = nanoTime22;
        if (fArr[15] >= 0.5f) {
        }
        f30 = 0.35f;
        fArr2 = fArr;
        f31 = 0.0f;
        this.R6 = 0.0f;
        if (this.z3) {
        }
        z11 = false;
        float f852222 = (j3 - this.I) / 1000.0f;
        w0Var = this.H;
        if (w0Var != null) {
        }
        z12 = z11;
        if (!z12) {
        }
        z13 = z11;
        if (z12) {
        }
        if (z12) {
        }
        if (z12) {
        }
        canvas2 = canvas;
        F(canvas2, i7, i10, this.G, false, (z12 || this.H.a == 0) ? z14 : z13, !z12 ? f852222 : 100.0f);
        if (z10) {
        }
    }

    public final float z0() {
        float f10;
        int f02;
        int L;
        int L2;
        float f11;
        float A = i20.A(10.0f, 2, getWidth()) - org.telegram.messenger.g0.L(8.0f);
        int i7 = this.i1;
        if (i7 != 0) {
            if (i7 == 1) {
                f10 = A / 6.0f;
                f11 = 0.0f;
            } else if (h0()) {
                f10 = 0.0f;
                f11 = 0.0f;
            } else {
                f10 = A / 3.0f;
                f02 = ((f0() + this.w1.size()) - 1) / f0();
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
