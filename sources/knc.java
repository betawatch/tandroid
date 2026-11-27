// default package

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LightingColorFilter;
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
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.c;
import org.telegram.ui.Dictation.DictationAsr;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final class knc extends View {
    public static int L3;
    public static long P3;
    public static int Q3;
    public static int R3;
    public static float S3;
    public float A0;
    public final String A1;
    public boolean A2;
    public final Matrix A3;
    public long B0;
    public String B1;
    public boolean B2;
    public LinearGradient B3;
    public float C0;
    public String C1;
    public long C2;
    public LinearGradient C3;
    public long D0;
    public rx D1;
    public float D2;
    public final Matrix D3;
    public final Matrix E;
    public float E0;
    public String E1;
    public float[] E2;
    public float E3;
    public LinearGradient F;
    public float F0;
    public String F1;
    public int F2;
    public final gnc F3;
    public final hc G;
    public long G0;
    public float G1;
    public int G2;
    public boolean G3;
    public final Drawable H;
    public float H0;
    public float H1;
    public float H2;
    public boolean H3;
    public jl0 I;
    public float I0;
    public float I1;
    public float I2;
    public final int[] I3;
    public jl0 J;
    public float J0;
    public float J1;
    public float J2;
    public float K;
    public float K0;
    public float K1;
    public float K2;
    public float L;
    public boolean L0;
    public float L1;
    public final ArrayList L2;
    public boolean M;
    public final int M0;
    public float M1;
    public final Paint M2;
    public int N;
    public LinearGradient N0;
    public boolean N1;
    public final RectF N2;
    public int O;
    public final Matrix O0;
    public final RectF O1;
    public final k43 O2;
    public int P;
    public String P0;
    public final RectF P1;
    public final float[] P2;
    public int Q;
    public StaticLayout Q0;
    public final RectF Q1;
    public final Path Q2;
    public boolean R;
    public StaticLayout R0;
    public Drawable R1;
    public final mva R2;
    public boolean S;
    public StaticLayout S0;
    public Drawable S1;
    public boolean S2;
    public boolean T;
    public StaticLayout T0;
    public Drawable T1;
    public boolean T2;
    public float U;
    public float U0;
    public final int U1;
    public boolean U2;
    public float V;
    public LinearGradient V0;
    public LinearGradient V1;
    public long V2;
    public float W;
    public float W0;
    public LinearGradient W1;
    public long W2;
    public final Matrix X0;
    public final Matrix X1;
    public float X2;
    public final Paint Y0;
    public final TextPaint Y1;
    public float Y2;
    public long Z0;
    public final Matrix Z1;
    public float Z2;
    public final lyc a;
    public float a0;
    public int a1;
    public final TextPaint a2;
    public float a3;
    public final vnb b;
    public float b0;
    public float b1;
    public jl0 b2;
    public float b3;
    public final gn3 c;
    public float c0;
    public long c1;
    public jl0 c2;
    public float c3;
    public final TextPaint d;
    public float d0;
    public final ArrayList d1;
    public jl0 d2;
    public float d3;
    public final TextPaint e;
    public float e0;
    public boolean e1;
    public String[] e2;
    public float e3;
    public final TextPaint f;
    public int f0;
    public int[] f1;
    public float f2;
    public float f3;
    public long g0;
    public final ArrayList g1;
    public long g2;
    public float g3;
    public int h;
    public long h0;
    public final Paint h1;
    public LinearGradient h2;
    public float h3;
    public final RectF i0;
    public float i1;
    public RadialGradient i2;
    public Bitmap i3;
    public final RectF j0;
    public boolean j1;
    public LinearGradient j2;
    public float[] j3;
    public final RectF k0;
    public float k1;
    public final Paint k2;
    public float[] k3;
    public final RectF l0;
    public float l1;
    public final Paint l2;
    public int l3;
    public final RectF m0;
    public boolean m1;
    public final Paint m2;
    public int m3;
    public final TextPaint n;
    public boolean n0;
    public int n1;
    public final Paint n2;
    public int n3;
    public float o0;
    public boolean o1;
    public final Matrix o2;
    public int o3;
    public float p0;
    public float p1;
    public final RectF p2;
    public float p3;
    public float q0;
    public boolean q1;
    public boolean q2;
    public float q3;
    public final Paint r;
    public float r0;
    public final RectF r1;
    public boolean r2;
    public float r3;
    public final Paint s;
    public float s0;
    public final Path s1;
    public long s2;
    public float s3;
    public float t0;
    public final Path t1;
    public float t2;
    public boolean t3;
    public float u0;
    public final Paint u1;
    public float u2;
    public final Paint u3;
    public float v0;
    public final Paint v1;
    public float v2;
    public final Paint v3;
    public final Paint w;
    public float w0;
    public float w1;
    public final RectF w2;
    public final Paint w3;
    public final Paint x;
    public float x0;
    public boolean x1;
    public Drawable x2;
    public LinearGradient x3;
    public final Paint y;
    public float y0;
    public float y1;
    public jl0 y2;
    public LinearGradient y3;
    public float z0;
    public float z1;
    public boolean z2;
    public LinearGradient z3;
    public static final float J3 = hl.L(19.0f);
    public static final float K3 = hl.L(3.0f);
    public static final float M3 = hl.L(3.0f);
    public static final float N3 = hl.N(0.5f);
    public static final float O3 = hl.L(6.0f);
    public static final k43 T3 = new k43(0.3d, 0.0d, 0.2d, 1.0d);
    public static final k43 U3 = sn3.J;

    public knc(Context context, vnb vnbVar, lyc lycVar) {
        super(context);
        this.c = new gn3();
        this.d = new TextPaint(1);
        this.e = new TextPaint(1);
        this.f = new TextPaint(1);
        this.h = jn7.d4;
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
        this.Q = jn7.d4;
        this.f0 = -1;
        this.i0 = new RectF();
        this.j0 = new RectF();
        this.k0 = new RectF();
        this.l0 = new RectF();
        this.m0 = new RectF();
        this.t0 = -1.0f;
        this.C0 = -1.0f;
        this.F0 = -1.0f;
        this.H0 = Float.NaN;
        this.M0 = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        this.O0 = new Matrix();
        this.P0 = "";
        this.X0 = new Matrix();
        Paint paint3 = new Paint(1);
        this.Y0 = paint3;
        Paint.Style style = Paint.Style.STROKE;
        paint3.setStyle(style);
        paint3.setStrokeWidth(hl.N(1.0f));
        this.b1 = -1.0f;
        this.d1 = new ArrayList();
        this.f1 = new int[0];
        this.g1 = new ArrayList();
        this.h1 = new Paint(1);
        this.j1 = true;
        this.k1 = 1.0f;
        this.l1 = 1.0f;
        this.r1 = new RectF();
        this.s1 = new Path();
        this.t1 = new Path();
        this.u1 = new Paint(1);
        this.v1 = new Paint(1);
        this.y1 = Float.NaN;
        this.A1 = ob6.M0(2131744986, null);
        this.O1 = new RectF();
        this.P1 = new RectF();
        this.Q1 = new RectF();
        this.U1 = hl.L(36.0f);
        this.X1 = new Matrix();
        this.Y1 = new TextPaint(1);
        this.Z1 = new Matrix();
        this.a2 = new TextPaint(1);
        this.k2 = new Paint(1);
        this.l2 = new Paint(1);
        this.m2 = new Paint(1);
        this.n2 = new Paint(1);
        this.o2 = new Matrix();
        this.p2 = new RectF();
        this.w2 = new RectF();
        this.E2 = new float[0];
        this.L2 = new ArrayList();
        this.M2 = new Paint(1);
        this.N2 = new RectF();
        this.O2 = k43.h;
        this.P2 = new float[2];
        this.Q2 = new Path();
        this.R2 = new mva(2200);
        this.W2 = 900L;
        this.j3 = new float[0];
        this.k3 = new float[0];
        this.u3 = new Paint();
        this.v3 = new Paint();
        this.w3 = new Paint();
        this.A3 = new Matrix();
        this.D3 = new Matrix();
        this.F3 = new gnc(this, (byte) 1);
        this.I3 = new int[2];
        this.b = vnbVar;
        this.a = lycVar;
        hc hcVar = new hc(context);
        this.G = hcVar;
        hcVar.setCallback(this);
        this.H = context.getResources().getDrawable(R.drawable.send_plane_24).mutate();
        textPaint.setTextSize(hl.L(15.0f));
        textPaint.setTypeface(hl.o());
        paint.setStyle(style);
        paint.setStrokeWidth(hl.N(0.66f));
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        K();
    }

    public static void H(jnc jncVar, float f, float[] fArr) {
        float max = Math.max(0.0f, Math.min(1.0f, (f - jncVar.j) / 0.12f));
        float f2 = jncVar.l;
        float f3 = jncVar.d;
        float f4 = f2 - f3;
        if (jncVar.m) {
            fArr[0] = f3;
            fArr[1] = f2 - (f4 * max);
        } else {
            fArr[0] = (f4 * max) + f3;
            fArr[1] = f2;
        }
    }

    public static ArrayList J(String str) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i < str.length()) {
            while (i < str.length() && Character.isWhitespace(str.charAt(i))) {
                i++;
            }
            if (i >= str.length()) {
                break;
            }
            int i2 = i;
            while (i2 < str.length() && !Character.isWhitespace(str.charAt(i2))) {
                i2++;
            }
            arrayList.add(new int[]{i, i2});
            i = i2;
        }
        return arrayList;
    }

    public static float a(float f, float f2, float f3, float f4) {
        return qd4.A(1.0f, (float) Math.exp((-f3) / f4), f2 - f, f);
    }

    public static int d(String str, String str2) {
        int min = Math.min(str.length(), str2.length());
        int i = 0;
        while (i < min && str.charAt(i) == str2.charAt(i)) {
            i++;
        }
        while (i > 0 && !Character.isWhitespace(str2.charAt(i - 1))) {
            i--;
        }
        return i;
    }

    public static int t(int[] iArr) {
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = i + 1;
            if (i3 >= iArr.length) {
                return i2;
            }
            i2 += Math.max(0, iArr[i3] - iArr[i]);
            i += 2;
        }
    }

    public final float A(long j) {
        return U3.getInterpolation(Math.max(0.0f, Math.min(1.0f, (j - this.V2) / this.W2)));
    }

    public final float B(float f) {
        float f2 = 0.0f;
        if (this.Z2 <= this.Y2) {
            return 0.0f;
        }
        float f3 = this.W2 / 1000.0f;
        for (int i = 0; i < 24; i++) {
            float f4 = (f2 + f3) / 2.0f;
            if (x(f4) < f) {
                f2 = f4;
            } else {
                f3 = f4;
            }
        }
        return Math.min(f3, this.W2 / 1000.0f);
    }

    public final void C() {
        if (this.a1 <= 0) {
            return;
        }
        if (this.P0.isEmpty()) {
            this.Q0 = null;
            return;
        }
        SpannableString spannableString = new SpannableString(this.P0);
        ArrayList arrayList = this.d1;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            inc incVar = (inc) obj;
            int i2 = incVar.b;
            if (i2 > incVar.a && i2 <= spannableString.length()) {
                spannableString.setSpan(new go3(incVar, (byte) 1), incVar.a, incVar.b, 33);
            }
        }
        int i3 = 0;
        while (true) {
            int i4 = i3 + 1;
            int[] iArr = this.f1;
            if (i4 >= iArr.length) {
                break;
            }
            int max = Math.max(0, iArr[i3]);
            int min = Math.min(spannableString.length(), this.f1[i4]);
            if (min > max) {
                spannableString.setSpan(new hnc((byte) 0), max, min, 33);
            }
            i3 += 2;
        }
        this.Q0 = b(spannableString, this.d);
        ArrayList arrayList2 = this.g1;
        arrayList2.clear();
        int i5 = 0;
        while (true) {
            int i6 = i5 + 1;
            int[] iArr2 = this.f1;
            if (i6 >= iArr2.length) {
                return;
            }
            int max2 = Math.max(0, iArr2[i5]);
            int min2 = Math.min(spannableString.length(), this.f1[i6]);
            if (min2 > max2) {
                int lineForOffset = this.Q0.getLineForOffset(max2);
                int lineForOffset2 = this.Q0.getLineForOffset(min2);
                int i7 = lineForOffset;
                while (i7 <= lineForOffset2) {
                    StaticLayout staticLayout = this.Q0;
                    float primaryHorizontal = i7 == lineForOffset ? staticLayout.getPrimaryHorizontal(max2) : staticLayout.getLineLeft(i7);
                    StaticLayout staticLayout2 = this.Q0;
                    float primaryHorizontal2 = i7 == lineForOffset2 ? staticLayout2.getPrimaryHorizontal(min2) : staticLayout2.getLineRight(i7);
                    if ((i7 != lineForOffset2 || min2 <= 0 || min2 != this.Q0.getLineStart(i7)) && primaryHorizontal2 - primaryHorizontal >= 1.0f) {
                        float f = M3;
                        float lineTop = this.Q0.getLineTop(i7);
                        float f2 = N3;
                        arrayList2.add(new RectF(primaryHorizontal - f, lineTop + f2, primaryHorizontal2 + f, this.Q0.getLineBottom(i7) - f2));
                    }
                    i7++;
                }
            }
            i5 += 2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:162:0x066d  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0672  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void D(ArrayList arrayList, boolean[] zArr, boolean z) {
        long j;
        ArrayList arrayList2;
        long j2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        String str;
        boolean z2;
        ArrayList arrayList5;
        String str2;
        float f;
        float f2;
        Bitmap bitmap;
        mva mvaVar;
        float f3;
        int i;
        mva mvaVar2;
        int i2;
        float f4;
        float f5;
        float f6;
        jnc jncVar;
        Bitmap bitmap2;
        Bitmap bitmap3;
        ArrayList arrayList6;
        int i3;
        StaticLayout staticLayout;
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList7 = new ArrayList();
        int i4 = 0;
        int i5 = 0;
        while (i5 < arrayList.size()) {
            Object[] objArr = zArr != null && i5 < zArr.length && zArr[i5];
            if (objArr == false || z) {
                if (sb.length() > 0) {
                    sb.append(' ');
                }
                int length = sb.length();
                sb.append((String) arrayList.get(i5));
                if (objArr != false) {
                    if (arrayList7.isEmpty() || ((Integer) c00.g(1, arrayList7)).intValue() < length - 1) {
                        arrayList7.add(Integer.valueOf(length));
                        arrayList7.add(Integer.valueOf(sb.length()));
                    } else {
                        arrayList7.set(arrayList7.size() - 1, Integer.valueOf(sb.length()));
                    }
                }
            }
            i5++;
        }
        int size = arrayList7.size();
        int[] iArr = new int[size];
        for (int i6 = 0; i6 < size; i6++) {
            iArr[i6] = ((Integer) arrayList7.get(i6)).intValue();
        }
        String sb2 = sb.toString();
        boolean equals = Arrays.equals(iArr, this.f1);
        if (t(iArr) > t(this.f1) && sb2.length() <= this.P0.length()) {
            this.j1 = true;
        } else if (sb2.length() > this.P0.length()) {
            this.j1 = false;
        }
        if (sb2.equals(this.P0) && equals) {
            if (!this.S2 || (staticLayout = this.Q0) == null) {
                return;
            }
            this.S2 = false;
            v(staticLayout, staticLayout);
            invalidate();
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        String str3 = this.P0;
        Object[] objArr2 = sb2.equals(str3) && t(iArr) < t(this.f1) && this.Q0 != null && !this.z2;
        this.f1 = iArr;
        boolean z3 = this.S2;
        ArrayList arrayList8 = this.d1;
        if (z3 && !str3.isEmpty() && !sb2.equals(str3) && this.Q0 != null) {
            this.S2 = false;
            arrayList8.clear();
            this.R0 = null;
            this.f1 = iArr;
            this.P0 = sb2;
            StaticLayout staticLayout2 = this.Q0;
            C();
            v(staticLayout2, this.Q0);
            invalidate();
            return;
        }
        if (sb2.equals(str3)) {
            if (objArr2 != false) {
                this.R0 = this.Q0;
                this.e1 = true;
                this.Z0 = uptimeMillis;
            }
        } else if (sb2.startsWith(str3) || str3.isEmpty()) {
            int min = Math.min(str3.length(), sb2.length());
            int i7 = 0;
            while (i7 < min && str3.charAt(i7) == sb2.charAt(i7)) {
                i7++;
            }
            for (int size2 = arrayList8.size() - 1; size2 >= 0; size2--) {
                inc incVar = (inc) arrayList8.get(size2);
                if (incVar.a >= i7 || uptimeMillis - incVar.c > 1550) {
                    arrayList8.remove(size2);
                } else if (incVar.b > i7) {
                    incVar.b = i7;
                }
            }
            while (i7 > 0 && !Character.isWhitespace(sb2.charAt(Math.min(i7, sb2.length()) - 1))) {
                i7--;
            }
            int i8 = 0;
            while (i7 < sb2.length()) {
                int i9 = i7;
                while (i9 < sb2.length() && Character.isWhitespace(sb2.charAt(i9))) {
                    i9++;
                }
                while (i9 < sb2.length() && !Character.isWhitespace(sb2.charAt(i9))) {
                    i9++;
                }
                inc incVar2 = new inc();
                incVar2.a = i7;
                incVar2.b = i9;
                incVar2.d = i7 < str3.length() ? 1.0f : 0.0f;
                incVar2.c = (Math.min(i8, 5) * 40) + uptimeMillis;
                arrayList8.add(incVar2);
                i8++;
                i7 = i9;
            }
        } else {
            if (this.S || !this.T || this.Q0 == null || sb2.isEmpty()) {
                j = uptimeMillis;
                arrayList2 = arrayList8;
                j2 = 1550;
            } else {
                StaticLayout staticLayout3 = this.Q0;
                j2 = 1550;
                boolean z4 = this.z2;
                ArrayList arrayList9 = this.L2;
                if (z4) {
                    arrayList4 = new ArrayList();
                    int size3 = arrayList9.size();
                    int i10 = 0;
                    while (i10 < size3) {
                        Object obj = arrayList9.get(i10);
                        i10++;
                        int i11 = i4;
                        jnc jncVar2 = (jnc) obj;
                        if (!this.A2 || !jncVar2.b) {
                            float f7 = jncVar2.n;
                            float f8 = jncVar2.o;
                            float[] fArr = new float[2];
                            fArr[i11] = f7;
                            fArr[1] = f8;
                            arrayList4.add(fArr);
                        }
                        i4 = i11;
                    }
                } else {
                    arrayList4 = null;
                }
                int i12 = i4;
                arrayList9.clear();
                ArrayList J = J(str3);
                ArrayList J2 = J(sb2);
                if (J.size() == J2.size() || J.size() > 400 || J2.size() > 400) {
                    j = uptimeMillis;
                    arrayList2 = arrayList8;
                } else {
                    boolean z5 = J2.size() < J.size() ? 1 : i12;
                    if (z5 != 0) {
                        str = sb2;
                        arrayList5 = J;
                        z2 = true;
                        str2 = str3;
                    } else {
                        str = str3;
                        z2 = true;
                        arrayList5 = J2;
                        str2 = sb2;
                        J2 = J;
                    }
                    arrayList2 = arrayList8;
                    boolean[] zArr2 = new boolean[arrayList5.size()];
                    j = uptimeMillis;
                    int i13 = i12;
                    int i14 = i13;
                    while (i14 < arrayList5.size()) {
                        int[] iArr2 = (int[]) arrayList5.get(i14);
                        if (i13 < J2.size()) {
                            int[] iArr3 = (int[]) J2.get(i13);
                            int i15 = iArr2[i12];
                            arrayList6 = J2;
                            int i16 = iArr3[i12];
                            i3 = i14;
                            if (str2.regionMatches(i15, str, i16, iArr3[z2 ? 1 : 0] - i16) && iArr2[z2 ? 1 : 0] - iArr2[i12] == iArr3[z2 ? 1 : 0] - iArr3[i12]) {
                                i13++;
                                i14 = i3 + 1;
                                J2 = arrayList6;
                            }
                        } else {
                            arrayList6 = J2;
                            i3 = i14;
                        }
                        zArr2[i3] = z2;
                        i14 = i3 + 1;
                        J2 = arrayList6;
                    }
                    if (i13 == J2.size()) {
                        this.A2 = z5;
                        for (int i17 = i12; i17 < arrayList5.size(); i17++) {
                            int[] iArr4 = (int[]) arrayList5.get(i17);
                            jnc jncVar3 = new jnc();
                            jncVar3.n = Float.NaN;
                            jncVar3.o = Float.NaN;
                            jncVar3.a = str2.substring(iArr4[i12], iArr4[z2 ? 1 : 0]);
                            boolean z6 = zArr2[i17];
                            jncVar3.b = z6;
                            jncVar3.c = (z5 == 0 && z6) ? z2 ? 1 : 0 : i12;
                            if (z5 != 0) {
                                int lineForOffset = staticLayout3.getLineForOffset(iArr4[i12]);
                                jncVar3.d = staticLayout3.getPrimaryHorizontal(iArr4[i12]);
                                jncVar3.e = staticLayout3.getLineBaseline(lineForOffset);
                                jncVar3.f = staticLayout3.getLineTop(lineForOffset);
                                jncVar3.g = staticLayout3.getLineBottom(lineForOffset);
                                o(jncVar3, arrayList4, i17);
                            }
                            arrayList9.add(jncVar3);
                        }
                        TextPaint textPaint = this.d;
                        mva mvaVar3 = this.R2;
                        if (z5 == 0) {
                            int size4 = arrayList9.size();
                            int i18 = i12;
                            int i19 = i18;
                            f = 4.0f;
                            while (i18 < size4) {
                                Object obj2 = arrayList9.get(i18);
                                i18++;
                                jnc jncVar4 = (jnc) obj2;
                                if (!jncVar4.c) {
                                    int[] iArr5 = (int[]) J.get(i19);
                                    int lineForOffset2 = staticLayout3.getLineForOffset(iArr5[i12]);
                                    jncVar4.d = staticLayout3.getPrimaryHorizontal(iArr5[i12]);
                                    jncVar4.e = staticLayout3.getLineBaseline(lineForOffset2);
                                    o(jncVar4, arrayList4, i19);
                                    i19++;
                                }
                            }
                            f2 = 2.0f;
                            this.H2 = this.e3;
                            this.I2 = this.f3;
                            this.C2 = SystemClock.uptimeMillis();
                            this.z2 = z2 ? 1 : 0;
                        } else {
                            f = 4.0f;
                            f2 = 2.0f;
                            this.H2 = this.e3;
                            this.I2 = this.f3;
                            this.J2 = this.g3;
                            this.K2 = Math.max(1.0f, this.h3);
                            SpannableString spannableString = new SpannableString(str3);
                            u(true, 0.0f);
                            for (int i20 = i12; i20 < arrayList9.size(); i20++) {
                                jnc jncVar5 = (jnc) arrayList9.get(i20);
                                float measureText = textPaint.measureText(jncVar5.a);
                                jncVar5.k = measureText;
                                jncVar5.l = jncVar5.d + measureText;
                                if (jncVar5.b) {
                                    int i21 = i20 + 1;
                                    jnc jncVar6 = i21 < arrayList9.size() ? (jnc) arrayList9.get(i21) : null;
                                    if (jncVar6 != null && jncVar6.b && Math.abs(jncVar6.f - jncVar5.f) < 1.0f) {
                                        jncVar5.l = jncVar6.d;
                                    }
                                }
                            }
                            mvaVar3.a();
                            mvaVar3.e(this.M);
                            mvaVar3.b = gn3.k(this.M);
                            float f9 = 10.0f;
                            mvaVar3.R = hl.L(10.0f);
                            int size5 = arrayList9.size();
                            int i22 = i12;
                            int i23 = i22;
                            while (i23 < size5) {
                                Object obj3 = arrayList9.get(i23);
                                i23++;
                                jnc jncVar7 = (jnc) obj3;
                                int indexOf = str3.indexOf(jncVar7.a, i22);
                                int length2 = jncVar7.a.length() + indexOf;
                                if (!jncVar7.b) {
                                    spannableString.setSpan(new ForegroundColorSpan(i12), indexOf, length2, 33);
                                }
                                i22 = length2;
                                i12 = 0;
                            }
                            textPaint.setAlpha(jn7.d4);
                            StaticLayout b = b(spannableString, textPaint);
                            try {
                                bitmap = Bitmap.createBitmap(b.getWidth() + hl.L(4.0f), Math.max(1, b.getHeight()), Bitmap.Config.ARGB_8888);
                                try {
                                    b.draw(new Canvas(bitmap));
                                    int width = bitmap.getWidth();
                                    int height = bitmap.getHeight();
                                    int[] iArr6 = new int[width * height];
                                    try {
                                        bitmap.getPixels(iArr6, 0, width, 0, 0, width, height);
                                        int i24 = width;
                                        int max = Math.max(1, Math.round(hl.p * 0.8f));
                                        int i25 = 0;
                                        for (int i26 = 0; i26 < height; i26 += max) {
                                            for (int i27 = 0; i27 < i24; i27 += max) {
                                                if ((iArr6[(i26 * i24) + i27] >>> 24) > 90) {
                                                    i25++;
                                                }
                                            }
                                        }
                                        float f10 = i25 > 1400 ? 1400.0f / i25 : 1.0f;
                                        float f11 = hl.p;
                                        int i28 = 0;
                                        while (i28 < height) {
                                            float f12 = f9;
                                            float f13 = i28;
                                            float f14 = this.J2;
                                            float f15 = max;
                                            if (f13 >= f14 - f15 && f13 <= f14 + this.K2 + f15) {
                                                int i29 = 0;
                                                while (i29 < i24) {
                                                    mvaVar = mvaVar3;
                                                    if ((iArr6[(i28 * i24) + i29] >>> 24) > 90) {
                                                        try {
                                                            if (mvaVar.d() <= f10) {
                                                                float f16 = i29;
                                                                int size6 = arrayList9.size();
                                                                i2 = i24;
                                                                int i30 = 0;
                                                                jnc jncVar8 = null;
                                                                while (i30 < size6) {
                                                                    Object obj4 = arrayList9.get(i30);
                                                                    int i31 = i30 + 1;
                                                                    jnc jncVar9 = (jnc) obj4;
                                                                    float f17 = f13;
                                                                    if (jncVar9.b && f17 >= jncVar9.f && f17 <= jncVar9.g && f16 >= jncVar9.d - hl.L(2.0f)) {
                                                                        if (jncVar8 != null) {
                                                                            jncVar = jncVar9;
                                                                            if (jncVar9.d > jncVar8.d) {
                                                                            }
                                                                        } else {
                                                                            jncVar = jncVar9;
                                                                        }
                                                                        jncVar8 = jncVar;
                                                                    }
                                                                    i30 = i31;
                                                                    f13 = f17;
                                                                }
                                                                f4 = f13;
                                                                float f18 = jncVar8 != null ? jncVar8.j : 0.0f;
                                                                if (jncVar8 != null) {
                                                                    float f19 = jncVar8.d;
                                                                    f5 = f18;
                                                                    f6 = Math.max(0.0f, Math.min(1.0f, (f16 - f19) / Math.max(1.0f, jncVar8.l - f19)));
                                                                } else {
                                                                    f5 = f18;
                                                                    f6 = 0.0f;
                                                                }
                                                                if (jncVar8 != null && jncVar8.m) {
                                                                    f6 = 1.0f - f6;
                                                                }
                                                                mvaVar.h(((mvaVar.d() - 0.5f) * f15) + this.H2 + f16, ((mvaVar.d() - 0.5f) * f15) + this.I2 + f4, ((mvaVar.d() * 30.0f) + 8.0f) * f11, (-((mvaVar.d() * 26.0f) + f12)) * f11, (mvaVar.d() * 0.34f) + 0.32f, (f6 * 0.12f) + f5);
                                                                i29 += max;
                                                                mvaVar3 = mvaVar;
                                                                i24 = i2;
                                                                f13 = f4;
                                                            }
                                                        } catch (Throwable unused) {
                                                            mvaVar3 = mvaVar;
                                                            bitmap = bitmap;
                                                            if (bitmap != null) {
                                                                bitmap.recycle();
                                                            }
                                                            this.C2 = SystemClock.uptimeMillis();
                                                            this.z2 = true;
                                                            arrayList2.clear();
                                                            jnc jncVar10 = null;
                                                            this.R0 = null;
                                                            this.f1 = iArr;
                                                            this.P0 = sb2;
                                                            C();
                                                            if (this.Q0 != null) {
                                                            }
                                                            invalidate();
                                                            return;
                                                        }
                                                    }
                                                    i2 = i24;
                                                    f4 = f13;
                                                    i29 += max;
                                                    mvaVar3 = mvaVar;
                                                    i24 = i2;
                                                    f13 = f4;
                                                }
                                            }
                                            i28 += max;
                                            mvaVar3 = mvaVar3;
                                            f9 = f12;
                                            i24 = i24;
                                        }
                                        mvaVar = mvaVar3;
                                        float L = hl.L(3.0f);
                                        int size7 = arrayList9.size();
                                        int i32 = 0;
                                        while (i32 < size7) {
                                            Object obj5 = arrayList9.get(i32);
                                            i32++;
                                            jnc jncVar11 = (jnc) obj5;
                                            if (jncVar11.b) {
                                                float f20 = jncVar11.f;
                                                float f21 = N3;
                                                float f22 = f20 + f21;
                                                float f23 = jncVar11.g - f21;
                                                float f24 = this.J2;
                                                if (f23 >= f24 && f22 <= f24 + this.K2) {
                                                    float f25 = jncVar11.d;
                                                    boolean r = r(jncVar11);
                                                    float f26 = M3;
                                                    float f27 = f25 - (r ? f26 : 0.0f);
                                                    float f28 = jncVar11.l;
                                                    if (!q(jncVar11)) {
                                                        f26 = 0.0f;
                                                    }
                                                    float f29 = f28 + f26;
                                                    float f30 = L / 2.0f;
                                                    float f31 = f22 + f30;
                                                    while (f31 < f23) {
                                                        float f32 = f27 + f30;
                                                        while (f32 < f29) {
                                                            if (mvaVar.d() > 0.5f) {
                                                                f3 = L;
                                                                i = size7;
                                                                mvaVar2 = mvaVar;
                                                            } else {
                                                                f3 = L;
                                                                float f33 = jncVar11.d;
                                                                i = size7;
                                                                float max2 = Math.max(0.0f, Math.min(1.0f, (f32 - f33) / Math.max(1.0f, jncVar11.l - f33)));
                                                                if (jncVar11.m) {
                                                                    max2 = 1.0f - max2;
                                                                }
                                                                mvaVar.h(((mvaVar.d() - 0.5f) * f3) + this.H2 + f32, ((mvaVar.d() - 0.5f) * f3) + this.I2 + f31, ((mvaVar.d() * 22.0f) + 6.0f) * f11, (-((mvaVar.d() * 20.0f) + 8.0f)) * f11, (mvaVar.d() * 0.3f) + 0.26f, (max2 * 0.12f) + jncVar11.j);
                                                                mvaVar2 = mvaVar;
                                                            }
                                                            f32 += f3;
                                                            mvaVar = mvaVar2;
                                                            L = f3;
                                                            size7 = i;
                                                        }
                                                        float f34 = L;
                                                        f31 += f34;
                                                        L = f34;
                                                    }
                                                }
                                            }
                                        }
                                        mvaVar3 = mvaVar;
                                        bitmap.recycle();
                                    } catch (Throwable unused2) {
                                    }
                                } catch (Throwable unused3) {
                                }
                            } catch (Throwable unused4) {
                                bitmap = null;
                            }
                            this.C2 = SystemClock.uptimeMillis();
                            this.z2 = true;
                        }
                        arrayList2.clear();
                        jnc jncVar102 = null;
                        this.R0 = null;
                        this.f1 = iArr;
                        this.P0 = sb2;
                        C();
                        if (this.Q0 != null) {
                            this.z2 = false;
                        } else {
                            String str4 = this.P0;
                            int size8 = arrayList9.size();
                            int i33 = 0;
                            int i34 = 0;
                            while (true) {
                                if (i34 < size8) {
                                    Object obj6 = arrayList9.get(i34);
                                    i34++;
                                    jnc jncVar12 = (jnc) obj6;
                                    if (!jncVar12.b || !this.A2) {
                                        int indexOf2 = str4.indexOf(jncVar12.a, i33);
                                        if (indexOf2 < 0) {
                                            this.z2 = false;
                                            break;
                                        }
                                        int length3 = jncVar12.a.length() + indexOf2;
                                        int lineForOffset3 = this.Q0.getLineForOffset(indexOf2);
                                        jncVar12.h = this.Q0.getPrimaryHorizontal(indexOf2);
                                        jncVar12.i = this.Q0.getLineBaseline(lineForOffset3);
                                        jncVar12.p = indexOf2;
                                        jncVar12.k = textPaint.measureText(jncVar12.a);
                                        jncVar12.q = false;
                                        int i35 = 0;
                                        while (true) {
                                            int i36 = i35 + 1;
                                            int[] iArr7 = this.f1;
                                            if (i36 >= iArr7.length) {
                                                break;
                                            }
                                            if (indexOf2 >= iArr7[i35] && indexOf2 < iArr7[i36]) {
                                                jncVar12.q = true;
                                            }
                                            i35 += 2;
                                        }
                                        i33 = length3;
                                    }
                                } else {
                                    this.D2 = 0.48000002f;
                                    this.G2 = 0;
                                    this.F2 = 0;
                                    if (!this.A2) {
                                        int size9 = arrayList9.size();
                                        int i37 = 0;
                                        while (i37 < size9) {
                                            Object obj7 = arrayList9.get(i37);
                                            i37++;
                                            boolean z7 = ((jnc) obj7).c;
                                        }
                                        SpannableString spannableString2 = new SpannableString(str4);
                                        u(false, 0.14f);
                                        int size10 = arrayList9.size();
                                        int i38 = 0;
                                        while (i38 < size10) {
                                            Object obj8 = arrayList9.get(i38);
                                            i38++;
                                            jnc jncVar13 = (jnc) obj8;
                                            if (jncVar13.c) {
                                                this.D2 = Math.max(this.D2, jncVar13.j + 0.26f + 0.12f + 0.45f);
                                            } else {
                                                ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(0);
                                                int i39 = jncVar13.p;
                                                spannableString2.setSpan(foregroundColorSpan, i39, jncVar13.a.length() + i39, 33);
                                            }
                                        }
                                        int i40 = 0;
                                        mvaVar3.a();
                                        mvaVar3.e(this.M);
                                        mvaVar3.b = gn3.k(this.M);
                                        mvaVar3.R = 0.0f;
                                        textPaint.setAlpha(jn7.d4);
                                        StaticLayout b2 = b(spannableString2, textPaint);
                                        try {
                                            Bitmap createBitmap = Bitmap.createBitmap(b2.getWidth() + hl.L(f), Math.max(1, b2.getHeight()), Bitmap.Config.ARGB_8888);
                                            try {
                                                b2.draw(new Canvas(createBitmap));
                                                int width2 = createBitmap.getWidth();
                                                int height2 = createBitmap.getHeight();
                                                int[] iArr8 = new int[width2 * height2];
                                                bitmap3 = createBitmap;
                                                try {
                                                    bitmap3.getPixels(iArr8, 0, width2, 0, 0, width2, height2);
                                                    int max3 = Math.max(1, Math.round(hl.p * 0.8f));
                                                    int i41 = 0;
                                                    for (int i42 = 0; i42 < height2; i42 += max3) {
                                                        for (int i43 = 0; i43 < width2; i43 += max3) {
                                                            if ((iArr8[(i42 * width2) + i43] >>> 24) > 90) {
                                                                i41++;
                                                            }
                                                        }
                                                    }
                                                    float f35 = i41 > 1300 ? 1300.0f / i41 : 1.0f;
                                                    if (this.E2.length < Math.min(i41, 1340) * 3) {
                                                        this.E2 = new float[Math.min(i41, 1340) * 3];
                                                    }
                                                    int i44 = 0;
                                                    while (i44 < height2) {
                                                        int i45 = i40;
                                                        while (i45 < width2) {
                                                            if ((iArr8[(i44 * width2) + i45] >>> 24) > 90 && mvaVar3.d() <= f35 && (this.F2 + 1) * 3 <= this.E2.length) {
                                                                int size11 = arrayList9.size();
                                                                jnc jncVar14 = jncVar102;
                                                                int i46 = i40;
                                                                while (i46 < size11) {
                                                                    Object obj9 = arrayList9.get(i46);
                                                                    i46++;
                                                                    jnc jncVar15 = (jnc) obj9;
                                                                    if (jncVar15.c) {
                                                                        StaticLayout staticLayout4 = this.Q0;
                                                                        if (i44 >= staticLayout4.getLineTop(staticLayout4.getLineForOffset(jncVar15.p))) {
                                                                            StaticLayout staticLayout5 = this.Q0;
                                                                            if (i44 <= staticLayout5.getLineBottom(staticLayout5.getLineForOffset(jncVar15.p)) && i45 >= jncVar15.h - hl.L(f2) && (jncVar14 == null || jncVar15.h > jncVar14.h)) {
                                                                                jncVar14 = jncVar15;
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                if (jncVar14 != null) {
                                                                    float f36 = i45;
                                                                    float max4 = Math.max(0.0f, Math.min(1.0f, (f36 - jncVar14.h) / Math.max(1.0f, jncVar14.k)));
                                                                    if (jncVar14.m) {
                                                                        max4 = 1.0f - max4;
                                                                    }
                                                                    float[] fArr2 = this.E2;
                                                                    int i47 = this.F2;
                                                                    int i48 = i47 * 3;
                                                                    fArr2[i48] = f36;
                                                                    fArr2[i48 + 1] = i44;
                                                                    fArr2[i48 + 2] = (max4 * 0.12f) + jncVar14.j;
                                                                    this.F2 = i47 + 1;
                                                                }
                                                            }
                                                            i45 += max3;
                                                            jncVar102 = null;
                                                            i40 = 0;
                                                        }
                                                        i44 += max3;
                                                        jncVar102 = null;
                                                        i40 = 0;
                                                    }
                                                    float[] fArr3 = this.E2;
                                                    Integer[] numArr = new Integer[this.F2];
                                                    for (int i49 = 0; i49 < this.F2; i49++) {
                                                        numArr[i49] = Integer.valueOf(i49);
                                                    }
                                                    Arrays.sort(numArr, new gm3(fArr3, (byte) 5));
                                                    float[] copyOf = Arrays.copyOf(fArr3, this.F2 * 3);
                                                    for (int i50 = 0; i50 < this.F2; i50++) {
                                                        int i51 = i50 * 3;
                                                        int intValue = numArr[i50].intValue() * 3;
                                                        fArr3[i51] = copyOf[intValue];
                                                        fArr3[i51 + 1] = copyOf[intValue + 1];
                                                        fArr3[i51 + 2] = copyOf[intValue + 2];
                                                    }
                                                    bitmap3.recycle();
                                                } catch (Throwable unused5) {
                                                    bitmap2 = bitmap3;
                                                    if (bitmap2 != null) {
                                                        bitmap2.recycle();
                                                    }
                                                    invalidate();
                                                    return;
                                                }
                                            } catch (Throwable unused6) {
                                                bitmap3 = createBitmap;
                                            }
                                        } catch (Throwable unused7) {
                                            bitmap2 = null;
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
            if (d(str3, sb2) > 0 || d(str3.toLowerCase(), sb2.toLowerCase()) > 0) {
                long j3 = j;
                int min2 = Math.min(str3.length(), sb2.length());
                int i52 = 0;
                while (i52 < min2 && Character.toLowerCase(str3.charAt(i52)) == Character.toLowerCase(sb2.charAt(i52))) {
                    i52++;
                }
                int i53 = 0;
                while (i53 < i52 && str3.charAt(i53) == sb2.charAt(i53)) {
                    i53++;
                }
                int size12 = arrayList2.size() - 1;
                while (true) {
                    arrayList3 = arrayList2;
                    if (size12 < 0) {
                        break;
                    }
                    inc incVar3 = (inc) arrayList3.get(size12);
                    if (incVar3.a >= i53 || j3 - incVar3.c > j2) {
                        arrayList3.remove(size12);
                    } else if (incVar3.b > i53) {
                        incVar3.b = i53;
                    }
                    size12--;
                    arrayList2 = arrayList3;
                }
                while (i53 > 0 && !Character.isWhitespace(sb2.charAt(Math.min(i53, sb2.length()) - 1))) {
                    i53--;
                }
                int i54 = 0;
                while (i53 < sb2.length()) {
                    int i55 = i53;
                    while (i55 < sb2.length() && Character.isWhitespace(sb2.charAt(i55))) {
                        i55++;
                    }
                    while (i55 < sb2.length() && !Character.isWhitespace(sb2.charAt(i55))) {
                        i55++;
                    }
                    inc incVar4 = new inc();
                    incVar4.a = i53;
                    incVar4.b = i55;
                    incVar4.d = i53 < str3.length() ? 0.8f : 0.0f;
                    incVar4.c = (Math.min(i54, 5) * 40) + j3;
                    arrayList3.add(incVar4);
                    i54++;
                    i53 = i55;
                }
            } else {
                arrayList2.clear();
                this.R0 = this.Q0;
                this.Z0 = j;
            }
        }
        this.P0 = sb2;
        C();
        invalidate();
    }

    public final void E(long j) {
        if (this.q2) {
            if (this.B3 == null) {
                int e = this.M ? gn3.e(-10777345) : this.O | (-16777216);
                int e2 = this.M ? gn3.e(-6128385) : vm2.f(0.3f, this.O | (-16777216), -1);
                float f = this.M ? 0.6f : 0.95f;
                int f2 = vm2.f(f, this.N, e);
                int f3 = vm2.f(f, this.N, e2);
                this.B3 = new LinearGradient(0.0f, 0.0f, hl.L(150.0f), 0.0f, new int[]{this.N, f2, vm2.f(0.5f, f2, f3), f3, this.N}, new float[]{0.0f, 0.3f, 0.5f, 0.7f, 1.0f}, Shader.TileMode.MIRROR);
            }
            float f4 = (j - this.s2) / 1000.0f;
            if (this.C3 == null) {
                int e3 = this.M ? gn3.e(-10777345) : this.O | (-16777216);
                int e4 = this.M ? gn3.e(-6128385) : vm2.f(0.3f, e3, -1);
                float L = hl.L(140.0f);
                int i = this.N;
                this.C3 = new LinearGradient(0.0f, 0.0f, L, 0.0f, new int[]{i, e3, e4, e3, i}, new float[]{0.0f, 0.3f, 0.5f, 0.7f, 1.0f}, Shader.TileMode.CLAMP);
            }
            float max = Math.max(hl.L(140.0f), this.a1);
            float f5 = (f4 % 1.4f) / 1.4f;
            float f6 = (3.0f - (f5 * 2.0f)) * f5 * f5;
            Matrix matrix = this.D3;
            matrix.reset();
            matrix.setRotate(12.0f);
            matrix.postTranslate(uh9.v(max, hl.L(140.0f), f6, -hl.L(140.0f)), 0.0f);
            this.C3.setLocalMatrix(matrix);
            this.d.setShader(this.C3);
        }
    }

    public final void F() {
        if (this.I == null) {
            lyc lycVar = this.a;
            this.I = lycVar.g(this);
            this.J = lycVar.g(this);
        }
        if (!this.R) {
            this.R = true;
            this.h0 = SystemClock.uptimeMillis();
            this.n0 = false;
            this.c.f();
            this.T2 = false;
            Bitmap bitmap = this.i3;
            if (bitmap != null) {
                bitmap.recycle();
                this.i3 = null;
            }
            this.z2 = false;
            this.R2.a();
            this.r2 = false;
            this.u2 = 0.0f;
            this.F1 = null;
            this.E1 = null;
            this.B1 = null;
            this.C1 = null;
            rx rxVar = this.D1;
            if (rxVar != null) {
                rxVar.i(null, false);
            }
            this.S0 = null;
            this.G1 = 0.0f;
            this.q2 = false;
            this.t2 = 0.0f;
            this.f2 = 0.0f;
            this.S2 = false;
            this.G3 = false;
            this.H3 = false;
        }
        setVisibility(0);
        invalidate();
    }

    public final void G(float f, float f2, float f3, long j, Canvas canvas) {
        mva mvaVar;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        jnc jncVar;
        float f9;
        char c;
        jnc jncVar2;
        int i;
        float f10;
        Canvas canvas2 = canvas;
        float f11 = (j - this.C2) / 1000.0f;
        float f12 = 0.4f;
        float f13 = 1.0f;
        float f14 = 0.0f;
        float interpolation = this.O2.getInterpolation(Math.max(0.0f, Math.min(1.0f, (f11 - 0.08f) / 0.4f)));
        int i2 = this.N;
        TextPaint textPaint = this.d;
        textPaint.setColor(i2);
        ArrayList arrayList = this.L2;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            int i4 = i3 + 1;
            jnc jncVar3 = (jnc) arrayList.get(i3);
            if (jncVar3.c) {
                float max = Math.max(f14, Math.min(f13, ((f11 - jncVar3.j) - 0.26f) / 0.12f));
                if (max <= f14) {
                    i3 = i4;
                } else {
                    float L = hl.L(10.0f);
                    float f15 = jncVar3.h;
                    float f16 = jncVar3.k;
                    float f17 = (L + f16) * max;
                    float f18 = f17 + f15;
                    f4 = f12;
                    if (jncVar3.m) {
                        f15 += f16;
                    } else {
                        f17 = hl.L(4.0f);
                    }
                    float f19 = f15 - f17;
                    float max2 = Math.max(f14, Math.min(f13, (((f11 - jncVar3.j) - 0.26f) - 0.12f) / 0.45f));
                    f5 = f13;
                    textPaint.setColor(vm2.f(xnb.B(max2, 2.0f, 3.0f, max2 * max2), this.O, jncVar3.q ? L3 : this.N));
                    textPaint.setAlpha((int) (255.0f * f3 * f5));
                    canvas2.save();
                    canvas2.clipRect(f + f19, (f2 + jncVar3.i) - hl.L(40.0f), jncVar3.m ? f + jncVar3.h + jncVar3.k + hl.L(4.0f) : f + f18, f2 + jncVar3.i + hl.L(20.0f));
                    canvas2.drawText(jncVar3.a, f + jncVar3.h, f2 + jncVar3.i, textPaint);
                    canvas2.restore();
                    textPaint.setColor(this.N);
                    jncVar3.n = f + jncVar3.h;
                    jncVar3.o = f2 + jncVar3.i;
                    i3 = i4;
                    f12 = f4;
                    f13 = f5;
                    f14 = 0.0f;
                }
            } else {
                f4 = f12;
                f5 = f13;
                if (jncVar3.b) {
                    boolean r = r(jncVar3);
                    float[] fArr = this.P2;
                    if (r) {
                        int indexOf = arrayList.indexOf(jncVar3);
                        int i5 = indexOf;
                        while (!q((jnc) arrayList.get(i5))) {
                            i5++;
                        }
                        jnc jncVar4 = (jnc) arrayList.get(i5);
                        float f20 = this.I2;
                        float f21 = jncVar3.f + f20;
                        float f22 = N3;
                        float f23 = f21 + f22;
                        f9 = 0.5f;
                        float f24 = (f20 + jncVar3.g) - f22;
                        float f25 = this.H2;
                        c = 1;
                        float f26 = jncVar3.d + f25;
                        float f27 = M3;
                        float f28 = f25 + jncVar4.l + f27;
                        RectF rectF = this.N2;
                        rectF.set(f26 - f27, f23, f28, f24);
                        Path path = this.Q2;
                        path.rewind();
                        float f29 = O3;
                        jnc jncVar5 = jncVar3;
                        path.addRoundRect(rectF, f29, f29, Path.Direction.CW);
                        canvas2.save();
                        canvas2.clipPath(path);
                        int i6 = this.P;
                        float f30 = f23;
                        Paint paint = this.M2;
                        paint.setColor(i6);
                        paint.setAlpha((int) (Color.alpha(this.P) * f3));
                        int i7 = indexOf;
                        while (i7 <= i5) {
                            jnc jncVar6 = (jnc) arrayList.get(i7);
                            H(jncVar6, f11, fArr);
                            float f31 = fArr[1];
                            float f32 = fArr[0];
                            if (f31 - f32 < 0.5f) {
                                jncVar2 = jncVar5;
                                i = i5;
                                f10 = f30;
                            } else {
                                if (f32 <= jncVar6.d + 0.5f && i7 == indexOf) {
                                    f32 -= f27;
                                }
                                if (f31 >= jncVar6.l - 0.5f && i7 == i5) {
                                    f31 += f27;
                                }
                                float f33 = this.H2;
                                float f34 = f33 + f32;
                                float f35 = f33 + f31;
                                jncVar2 = jncVar5;
                                i = i5;
                                f10 = f30;
                                canvas2 = canvas;
                                canvas2.drawRect(f34, f10, f35, f24, paint);
                            }
                            i7++;
                            f30 = f10;
                            i5 = i;
                            jncVar5 = jncVar2;
                        }
                        jncVar = jncVar5;
                        canvas2.restore();
                    } else {
                        jncVar = jncVar3;
                        f9 = 0.5f;
                        c = 1;
                    }
                    H(jncVar, f11, fArr);
                    if (Math.min(fArr[c], (jncVar.d + jncVar.k) + hl.L(4.0f)) - Math.max(fArr[0], jncVar.d - hl.L(4.0f)) >= f9) {
                        canvas2.save();
                        float f36 = this.H2;
                        float f37 = fArr[0];
                        float f38 = jncVar.d;
                        if (f37 <= f38 + f9) {
                            f37 = f38 - hl.L(4.0f);
                        }
                        float f39 = f36 + f37;
                        float L2 = (this.I2 + jncVar.f) - hl.L(4.0f);
                        float f40 = this.H2;
                        float f41 = fArr[c];
                        if (f41 >= jncVar.l - f9) {
                            f41 = jncVar.d + jncVar.k + hl.L(4.0f);
                        }
                        canvas2.clipRect(f39, L2, f40 + f41, this.I2 + jncVar.g + hl.L(4.0f));
                        textPaint.setColor(L3);
                        textPaint.setAlpha((int) (f3 * 255.0f));
                        canvas2.drawText(jncVar.a, this.H2 + jncVar.d, this.I2 + jncVar.e, textPaint);
                        textPaint.setColor(this.N);
                        canvas2.restore();
                        f6 = f11;
                        f7 = f5;
                        f8 = 0.0f;
                    } else {
                        i3 = i4;
                        f12 = f4;
                        f13 = f5;
                        f14 = 0.0f;
                    }
                } else {
                    float f42 = this.H2 + jncVar3.d;
                    float f43 = this.I2 + jncVar3.e;
                    float f44 = f + jncVar3.h;
                    float f45 = f2 + jncVar3.i;
                    textPaint.setColor((this.A2 || !jncVar3.q) ? this.N : L3);
                    float f46 = 255.0f * f3 * f5;
                    float f47 = f45 - f43;
                    if (Math.abs(f47) > textPaint.getTextSize() * 1.9f) {
                        f8 = 0.0f;
                        float max3 = Math.max(0.0f, f5 - (2.2f * interpolation));
                        f6 = f11;
                        f7 = f5;
                        float max4 = Math.max(0.0f, Math.min(f7, (interpolation - 0.25f) / 0.55f));
                        if (max3 > 0.0f) {
                            textPaint.setAlpha((int) (max3 * f46));
                            canvas2.drawText(jncVar3.a, f42, f43, textPaint);
                        }
                        if (max4 > 0.0f) {
                            textPaint.setAlpha((int) (f46 * max4));
                            canvas2.drawText(jncVar3.a, f44, f45, textPaint);
                        }
                        textPaint.setColor(this.N);
                        jncVar3.n = f44;
                        jncVar3.o = f45;
                    } else {
                        f6 = f11;
                        f7 = f5;
                        f8 = 0.0f;
                        float A = qd4.A(f44, f42, interpolation, f42);
                        float f48 = (f47 * interpolation) + f43;
                        textPaint.setAlpha((int) f46);
                        canvas2.drawText(jncVar3.a, A, f48, textPaint);
                        textPaint.setColor(this.N);
                        jncVar3.n = A;
                        jncVar3.o = f48;
                    }
                }
                f13 = f7;
                f14 = f8;
                i3 = i4;
                f11 = f6;
                f12 = f4;
            }
        }
        float f49 = f11;
        float f50 = f12;
        textPaint.setAlpha(jn7.d4);
        float f51 = hl.p;
        while (true) {
            int i8 = this.G2;
            int i9 = this.F2;
            mvaVar = this.R2;
            if (i8 >= i9) {
                break;
            }
            float[] fArr2 = this.E2;
            int i10 = i8 * 3;
            if (fArr2[i10 + 2] > f49) {
                break;
            }
            this.G2 = i8 + 1;
            float f52 = f + fArr2[i10];
            float f53 = f2 + fArr2[i10 + 1];
            RectF rectF2 = this.j0;
            if (f53 >= rectF2.top && f53 <= rectF2.bottom) {
                double d = mvaVar.d() * 3.141592653589793d * 2.0d;
                float d2 = ((mvaVar.d() * 18.0f) + 8.0f) * f51;
                this.R2.i((((float) Math.cos(d)) * d2) + f52, c00.x((float) Math.sin(d), d2, 0.7f, f53), f52, f53, ((mvaVar.d() * f50) + 0.8f) * 0.26f);
            }
        }
        if (f49 >= this.D2) {
            this.z2 = false;
            arrayList.clear();
            mvaVar.R = hl.L(10.0f);
        }
    }

    public final boolean I(jnc jncVar, boolean z) {
        float L;
        float L2;
        if (z) {
            L = jncVar.f;
            L2 = jncVar.g;
        } else {
            L = jncVar.i - hl.L(14.0f);
            L2 = jncVar.i + hl.L(4.0f);
        }
        if (L2 >= this.g3 - hl.L(2.0f)) {
            return L <= (Math.max(1.0f, this.h3) + this.g3) + ((float) hl.L(2.0f));
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x003f, code lost:
    
        r6 = ((wma) r6).getBackgroundImage();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0045, code lost:
    
        if (r6 != null) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0047, code lost:
    
        r17 = -16777216;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x004b, code lost:
    
        r10 = 8;
        r9 = android.graphics.Bitmap.createBitmap(8, 8, android.graphics.Bitmap.Config.ARGB_8888);
        r11 = new android.graphics.Canvas(r9);
        r12 = new android.graphics.Rect(r6.getBounds());
        r6.setBounds(0, 0, 8, 8);
        r6.draw(r11);
        r6.setBounds(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x006a, code lost:
    
        r11 = 0;
        r6 = 0;
        r13 = 0;
        r15 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x006f, code lost:
    
        if (r6 >= r10) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0071, code lost:
    
        r17 = r5;
        r5 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0074, code lost:
    
        if (r5 >= r10) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0076, code lost:
    
        r18 = r9.getPixel(r5, r6);
        r13 = r13 + android.graphics.Color.green(r18);
        r15 = r15 + android.graphics.Color.blue(r18);
        r5 = r5 + 1;
        r11 = r11 + android.graphics.Color.red(r18);
        r10 = 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00b0, code lost:
    
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0095, code lost:
    
        r6 = r6 + 1;
        r5 = r17;
        r8 = 0;
        r10 = 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x009d, code lost:
    
        r17 = r5;
        r9.recycle();
        r8 = android.graphics.Color.rgb((int) (r11 / 64), (int) (r13 / 64), (int) (r15 / 64));
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00b2, code lost:
    
        r17 = -16777216;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void K() {
        int i;
        int i2;
        int i3 = aob.d6;
        vnb vnbVar = this.b;
        int v0 = aob.v0(i3, vnbVar);
        boolean c = gn3.c(v0);
        this.M = c;
        gn3 gn3Var = this.c;
        if (gn3Var.h != c) {
            gn3Var.h = c;
        }
        int i4 = -16777216;
        int v02 = aob.v0(aob.Pe, vnbVar) | (-16777216);
        gn3.h(v02);
        k43 k43Var = bn3.J0;
        View view = this;
        while (true) {
            i = 0;
            if (view == null) {
                break;
            } else if (view instanceof wma) {
                break;
            } else {
                view = view.getParent() instanceof View ? (View) view.getParent() : null;
            }
        }
        if (i == 0) {
            i = -6440822;
        }
        gn3Var.g(i, v02);
        this.N = aob.v0(aob.Le, vnbVar) | i2;
        boolean z = this.M;
        this.O = z ? vm2.f(0.12f, v02, -1) : bn3.x(v02, v0, z);
        S3 = this.M ? hl.L(7.0f) : 0.0f;
        this.P = aob.p1(this.M ? 0.18f : 0.14f, this.O);
        L3 = this.O;
        this.d.setColor(this.N);
        int v03 = aob.v0(aob.Me, vnbVar);
        TextPaint textPaint = this.e;
        textPaint.setColor(v03);
        this.Q = Color.alpha(textPaint.getColor());
        int v04 = aob.v0(aob.G6, vnbVar);
        TextPaint textPaint2 = this.n;
        textPaint2.setColor(v04);
        int color = textPaint2.getColor();
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.G.setColorFilter(new PorterDuffColorFilter(color, mode));
        this.x.setColor(v02);
        this.H.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.w.setColor(this.O);
        this.r.setColor(this.M ? -651810255 : -335544321);
        this.s.setColor(this.M ? 654311423 : 335544320);
        jl0 jl0Var = this.I;
        if (jl0Var != null) {
            jl0Var.updateColors();
        }
        jl0 jl0Var2 = this.J;
        if (jl0Var2 != null) {
            jl0Var2.updateColors();
        }
        this.S0 = null;
        this.N0 = null;
        this.B3 = null;
        this.C3 = null;
        this.h2 = null;
        this.W1 = null;
        textPaint.setShader(null);
        invalidate();
    }

    public final void L() {
        int i;
        int v0;
        int[] iArr;
        if (this.N0 == null) {
            int[] iArr2 = this.c.B;
            boolean z = this.M;
            vnb vnbVar = this.b;
            if (z) {
                i = aob.Me;
                v0 = gn3.d(aob.v0(i, vnbVar));
            } else {
                i = aob.Me;
                v0 = aob.v0(i, vnbVar);
            }
            int i2 = v0 | (-16777216);
            int e = this.M ? gn3.e(-7359233) : vm2.f(0.55f, iArr2[0], iArr2[4]);
            int e2 = this.M ? gn3.e(-7411982) : vm2.f(0.55f, iArr2[1], iArr2[4]);
            int e3 = this.M ? gn3.e(-4940545) : vm2.f(0.55f, iArr2[2], iArr2[4]);
            if (this.M) {
                int e4 = gn3.e(-7359233);
                int e5 = gn3.e(-5650177);
                iArr = new int[]{vm2.f(0.58f, i2, e4), vm2.f(0.45f, i2, e5), vm2.f(0.58f, i2, e4), vm2.f(0.45f, i2, e5)};
            } else {
                int v02 = aob.v0(i, vnbVar);
                int alpha = Color.alpha(v02);
                int[] iArr3 = new int[4];
                iArr3[0] = e;
                iArr3[1] = e2;
                iArr3[2] = e3;
                iArr3[3] = e;
                for (int i3 = 0; i3 < 4; i3++) {
                    iArr3[i3] = vm2.o(vm2.f(0.12f, v02 | (-16777216), iArr3[i3]), alpha);
                }
                iArr = iArr3;
            }
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 1.0f, 0.0f, iArr, (float[]) null, Shader.TileMode.MIRROR);
            this.N0 = linearGradient;
            TextPaint textPaint = this.e;
            textPaint.setShader(linearGradient);
            textPaint.setColor(-1);
            this.Q = jn7.d2;
        }
        float L = hl.L(this.M ? 260.0f : 160.0f);
        Matrix matrix = this.O0;
        matrix.setScale(L, 1.0f);
        matrix.postTranslate(((SystemClock.uptimeMillis() % 6000) / 6000.0f) * 2.0f * L, 0.0f);
        this.N0.setLocalMatrix(matrix);
    }

    public final StaticLayout b(CharSequence charSequence, TextPaint textPaint) {
        return StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, Math.max(1, this.a1)).setAlignment(Layout.Alignment.ALIGN_NORMAL).setLineSpacing(0.0f, 1.0f).setIncludePad(false).build();
    }

    public final void c() {
        int v0 = aob.v0(aob.Pe, this.b);
        if (v0 != this.n1) {
            this.n1 = v0;
            K();
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        lyc lycVar = this.a;
        float max = Math.max(0.0f, Math.min(1.0f, lycVar != null ? lycVar.w() : 0.0f));
        this.p1 = max;
        if (lycVar != null) {
            snc sncVar = (snc) lycVar.e;
            if (sncVar.Y != null && Math.abs(max - sncVar.b0) >= 0.002f) {
                sncVar.b0 = max;
                if (max <= 0.002f) {
                    sncVar.Y.setLayerType(0, null);
                } else {
                    int round = Math.round((1.0f - max) * 255.0f);
                    Paint paint = new Paint();
                    paint.setColorFilter(new LightingColorFilter(Color.rgb(round, round, round), 0));
                    sncVar.Y.setLayerType(2, paint);
                }
            }
        }
        if (max <= 0.002f) {
            super.draw(canvas);
            return;
        }
        int saveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null);
        super.draw(canvas);
        canvas.drawColor(Color.argb(Math.round(max * 255.0f), 0, 0, 0), PorterDuff.Mode.SRC_ATOP);
        canvas.restoreToCount(saveLayer);
    }

    public final void e(Canvas canvas, String str, float f) {
        RectF rectF = this.k0;
        float centerY = rectF.centerY();
        float L = rectF.left + hl.L(12.0f);
        int i = (int) L;
        hc hcVar = this.G;
        hcVar.setBounds(i, (int) (centerY - hl.L(12.0f)), hl.L(24.0f) + i, (int) (hl.L(12.0f) + centerY));
        int i2 = (int) (255.0f * f);
        hcVar.setAlpha(i2);
        hcVar.draw(canvas);
        TextPaint textPaint = this.n;
        int alpha = textPaint.getAlpha();
        textPaint.setAlpha(i2);
        Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
        canvas.drawText(str, L + hl.L(6.0f) + hl.L(24.0f), centerY - ((fontMetrics.ascent + fontMetrics.descent) / 2.0f), textPaint);
        textPaint.setAlpha(alpha);
        Path path = this.t1;
        boolean isEmpty = path.isEmpty();
        Paint paint = this.u1;
        if (isEmpty) {
            path.moveTo(-hl.N(3.8f), hl.N(1.9f));
            path.lineTo(0.0f, -hl.N(1.9f));
            path.lineTo(hl.N(3.8f), hl.N(1.9f));
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(hl.N(1.75f));
            paint.setStrokeCap(Paint.Cap.ROUND);
            paint.setStrokeJoin(Paint.Join.ROUND);
        }
        float L2 = (((rectF.right - hl.L(10.0f)) - hl.L(14.0f)) - hl.L(8.0f)) - hl.L(1.0f);
        this.w1 = L2;
        int p1 = aob.p1(0.14f * f, textPaint.getColor());
        Paint paint2 = this.v1;
        paint2.setColor(p1);
        canvas.drawRect(L2, rectF.centerY() - hl.L(10.0f), hl.L(1.0f) + L2, rectF.centerY() + hl.L(10.0f), paint2);
        paint.setColor(textPaint.getColor());
        paint.setAlpha(i2);
        canvas.save();
        canvas.translate((rectF.right - hl.L(10.0f)) - hl.L(7.0f), rectF.centerY());
        canvas.drawPath(path, paint);
        canvas.restore();
    }

    public final void f(Canvas canvas, float f, float f2, float f3, float f4, long j) {
        if (this.M) {
            LinearGradient linearGradient = this.h2;
            Paint paint = this.l2;
            Paint paint2 = this.k2;
            Paint paint3 = this.m2;
            if (linearGradient == null) {
                LinearGradient linearGradient2 = new LinearGradient(-1.0f, 0.0f, 1.0f, 0.0f, new int[]{gn3.e(-7447553), gn3.e(-13649665), gn3.e(-13665281)}, (float[]) null, Shader.TileMode.MIRROR);
                this.h2 = linearGradient2;
                paint2.setShader(linearGradient2);
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                RadialGradient radialGradient = new RadialGradient(0.0f, 0.0f, 1.0f, new int[]{788529151, 536870911, 234881023, 16777215}, new float[]{0.0f, 0.35f, 0.7f, 1.0f}, tileMode);
                this.i2 = radialGradient;
                paint.setShader(radialGradient);
                LinearGradient linearGradient3 = new LinearGradient(0.0f, -1.0f, 0.0f, 1.0f, new int[]{1090519039, 184549375, 352321535}, new float[]{0.0f, 0.6f, 1.0f}, tileMode);
                this.j2 = linearGradient3;
                paint3.setShader(linearGradient3);
                paint3.setStyle(Paint.Style.STROKE);
            }
            float f5 = (j % 5000) / 5000.0f;
            Matrix matrix = this.o2;
            matrix.setTranslate(4.0f * f5, 0.0f);
            float f6 = 2.6f * f3;
            matrix.postScale(f6, f6);
            matrix.postRotate(35.0f);
            matrix.postTranslate(f, f2);
            this.h2.setLocalMatrix(matrix);
            int i = (int) (255.0f * f4);
            paint2.setAlpha(i);
            canvas.drawCircle(f, f2, f3, paint2);
            float sin = 0.06f * f3 * ((float) Math.sin(f5 * 3.141592653589793d * 2.0d));
            float f7 = 0.62f * f3;
            matrix.setScale(1.35f * f3, f7);
            matrix.postTranslate(f + sin, f2 - f7);
            this.i2.setLocalMatrix(matrix);
            paint.setAlpha(i);
            canvas.drawCircle(f, f2, f3, paint);
            matrix.setScale(f3, f3);
            matrix.postTranslate(f, f2);
            this.j2.setLocalMatrix(matrix);
            paint3.setStrokeWidth(Math.max(1.0f, hl.N(0.8f)));
            paint3.setAlpha(i);
            canvas.drawCircle(f, f2, f3 - hl.N(0.4f), paint3);
        }
    }

    public final void g(Canvas canvas, jl0 jl0Var, RectF rectF, float f) {
        float height = rectF.height() / 2.0f;
        if (jl0Var != null) {
            jl0Var.r(height);
            jl0Var.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            jl0Var.setAlpha((int) (f * 255.0f));
            jl0Var.draw(canvas);
            return;
        }
        int i = this.M ? jn7.t3 : 235;
        Paint paint = this.r;
        paint.setAlpha((int) (i * f));
        canvas.drawRoundRect(rectF, height, height, paint);
    }

    public float getFieldBottomInWindow() {
        if (getVisibility() != 0 || getAlpha() < 0.05f) {
            return Float.NaN;
        }
        RectF rectF = this.j0;
        if (rectF.isEmpty() || getParent() == null) {
            return Float.NaN;
        }
        getLocationInWindow(new int[2]);
        return r1[1] + rectF.bottom;
    }

    public float getMaxTextHeight() {
        return this.t0;
    }

    public String getShownText() {
        return this.P0;
    }

    public final void h(Canvas canvas, RectF rectF, float f) {
        TextPaint textPaint;
        float f2;
        boolean z;
        if (this.R1 == null) {
            this.R1 = getContext().getResources().getDrawable(R.drawable.msg_language).mutate();
        }
        TextPaint textPaint2 = this.n;
        int color = textPaint2.getColor();
        float centerY = rectF.centerY();
        this.R1.setColorFilter(new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN));
        float f3 = 255.0f * f;
        int i = (int) f3;
        this.R1.setAlpha(i);
        int L = (int) (rectF.left + hl.L(12.0f));
        int L2 = (int) (centerY - hl.L(9.0f));
        this.R1.setBounds(L, L2, hl.L(18.0f) + L, hl.L(18.0f) + L2);
        this.R1.draw(canvas);
        float L4 = (rectF.right - hl.L(13.0f)) - hl.L(4.0f);
        canvas.save();
        canvas.clipRect(rectF.left, rectF.top, L4 - hl.L(8.0f), rectF.bottom);
        int alpha = textPaint2.getAlpha();
        float L5 = rectF.left + hl.L(12.0f) + hl.L(18.0f) + hl.L(6.0f);
        boolean z2 = this.B1 == null && this.M1 < 0.99f;
        String str = this.A1;
        TextPaint textPaint3 = this.a2;
        if (z2) {
            f2 = 2.0f;
            if (this.V1 == null) {
                this.V1 = new LinearGradient(0.0f, 0.0f, 1.0f, 0.0f, new int[]{16777215, -1, 16777215}, (float[]) null, Shader.TileMode.CLAMP);
                textPaint3.setTypeface(textPaint2.getTypeface());
            }
            textPaint3.setTextSize(textPaint2.getTextSize());
            float measureText = textPaint2.measureText(str);
            float L6 = hl.L(36.0f);
            textPaint = textPaint3;
            float min = (Math.min(1.0f, (SystemClock.uptimeMillis() % 2200) / 1100.0f) * ((L6 * 2.0f) + measureText)) + (L5 - L6);
            Matrix matrix = this.Z1;
            matrix.setScale(L6, 1.0f);
            matrix.postTranslate(min - (L6 / 2.0f), 0.0f);
            this.V1.setLocalMatrix(matrix);
            postInvalidateOnAnimation();
        } else {
            textPaint = textPaint3;
            f2 = 2.0f;
        }
        Paint.FontMetrics fontMetrics = textPaint2.getFontMetrics();
        float f4 = centerY - ((fontMetrics.ascent + fontMetrics.descent) / f2);
        if (z2 && this.M) {
            if (this.W1 == null) {
                int color2 = textPaint2.getColor() | (-16777216);
                int f5 = vm2.f(0.4f, color2, gn3.e(-7359233));
                z = z2;
                this.W1 = new LinearGradient(0.0f, 0.0f, 1.0f, 0.0f, new int[]{f5, vm2.f(0.28f, color2, gn3.e(-5650177)), f5}, (float[]) null, Shader.TileMode.MIRROR);
            } else {
                z = z2;
            }
            float L7 = hl.L(200.0f);
            Matrix matrix2 = this.X1;
            matrix2.setScale(L7, 1.0f);
            matrix2.postTranslate((((SystemClock.uptimeMillis() % 6000) / 6000.0f) * f2 * L7) + L5, 0.0f);
            this.W1.setLocalMatrix(matrix2);
            Typeface typeface = textPaint2.getTypeface();
            TextPaint textPaint4 = this.Y1;
            textPaint4.setTypeface(typeface);
            textPaint4.setTextSize(textPaint2.getTextSize());
            textPaint4.setShader(this.W1);
            textPaint4.setAlpha((int) ((1.0f - this.M1) * 0.62f * f3));
            canvas.drawText(str, L5, f4, textPaint4);
            float f6 = this.M1;
            if (f6 > 0.01f && this.B1 != null) {
                textPaint2.setAlpha((int) (f6 * f3));
                canvas.drawText(this.F1, L5, f4, textPaint2);
            }
        } else {
            z = z2;
            textPaint2.setAlpha((int) xnb.z(this.M1, 0.5f, 0.5f, f3));
            String str2 = this.F1;
            if (str2 == null) {
                str2 = str;
            }
            canvas.drawText(str2, L5, f4, textPaint2);
        }
        if (z && SystemClock.uptimeMillis() % 2200 < 1100) {
            TextPaint textPaint5 = textPaint;
            textPaint5.setShader(this.V1);
            textPaint5.setAlpha((int) ((1.0f - this.M1) * f3 * 0.55f));
            canvas.drawText(str, L5, f4, textPaint5);
        }
        textPaint2.setAlpha(alpha);
        canvas.restore();
        Path path = this.t1;
        boolean isEmpty = path.isEmpty();
        Paint paint = this.u1;
        if (isEmpty) {
            path.moveTo(-hl.N(3.8f), hl.N(1.9f));
            path.lineTo(0.0f, -hl.N(1.9f));
            path.lineTo(hl.N(3.8f), hl.N(1.9f));
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(hl.N(1.75f));
            paint.setStrokeCap(Paint.Cap.ROUND);
            paint.setStrokeJoin(Paint.Join.ROUND);
        }
        paint.setColor(color);
        paint.setAlpha(i);
        canvas.save();
        canvas.translate(L4, centerY);
        canvas.drawPath(path, paint);
        canvas.restore();
    }

    public final void i(Canvas canvas, float f, float f2, boolean z) {
        float f3;
        float f4;
        float f5;
        this.M1 = a(this.M1, this.B1 != null ? 1.0f : 0.0f, f2, 0.09f);
        this.F1 = this.B1;
        String str = this.E1;
        int i = this.U1;
        RectF rectF = this.j0;
        TextPaint textPaint = this.n;
        if (str != null) {
            f3 = 6.0f;
            f4 = 22.0f;
            if (textPaint.measureText(this.B1) + hl.L(6.0f) + hl.L(18.0f) + hl.L(12.0f) + hl.L(8.0f) + hl.L(8.0f) + hl.L(13.0f) > (rectF.right - (((rectF.left + hl.L(2.0f)) + i) + hl.L(8.0f))) - ((this.T || !z) ? 0.0f : (textPaint.measureText(ob6.M0(2131745368, null)) + (hl.L(8.0f) + (hl.L(22.0f) + (hl.L(12.0f) + hl.L(8.0f))))) + hl.L(16.0f))) {
                this.F1 = this.E1;
            }
        } else {
            f3 = 6.0f;
            f4 = 22.0f;
        }
        String str2 = this.F1;
        if (str2 == null) {
            str2 = this.A1;
        }
        float measureText = textPaint.measureText(str2);
        float f6 = this.L1;
        if (f6 > 0.0f) {
            measureText = a(f6, measureText, f2, 0.11f);
        }
        this.L1 = measureText;
        float L = hl.L(36.0f);
        float L2 = rectF.top - hl.L(8.0f);
        float f7 = this.G1;
        float B = xnb.B(f7, 2.0f, 3.0f, f7 * f7);
        int color = textPaint.getColor();
        float L4 = rectF.left + hl.L(2.0f);
        float f8 = L2 - L;
        float f9 = i + L4;
        RectF rectF2 = this.P1;
        rectF2.set(L4, f8, f9, L2);
        jl0 jl0Var = this.c2;
        lyc lycVar = this.a;
        if (jl0Var == null) {
            this.c2 = lycVar.g(this);
        }
        canvas.save();
        float f10 = 1.0f - B;
        canvas.translate(0.0f, hl.L(f3) * f10);
        float f11 = (B * 0.1f) + 0.9f;
        float B2 = xnb.B(this.I1, 0.06f, 1.0f, f11);
        canvas.scale(B2, B2, rectF2.centerX(), rectF2.centerY());
        g(canvas, this.c2, rectF2, f);
        Drawable drawable = this.S1;
        if (drawable == null) {
            drawable = getContext().getResources().getDrawable(R.drawable.msg_settings).mutate();
            this.S1 = drawable;
        }
        drawable.setColorFilter(new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN));
        this.S1.setAlpha((int) (f * 255.0f));
        int centerX = (int) rectF2.centerX();
        int centerY = (int) rectF2.centerY();
        int L5 = hl.L(18.5f);
        float f12 = L5 / 2.0f;
        float f13 = centerX - f12;
        float f14 = centerY - f12;
        this.S1.setBounds(Math.round(f13), Math.round(f14), Math.round(f13) + L5, Math.round(f14) + L5);
        float N = hl.N(0.05f);
        int i2 = 0;
        while (i2 < 4) {
            canvas.save();
            canvas.translate(i2 == 0 ? -N : i2 == 1 ? N : 0.0f, i2 == 2 ? -N : i2 == 3 ? N : 0.0f);
            this.S1.draw(canvas);
            canvas.restore();
            i2++;
        }
        canvas.restore();
        float L6 = rectF2.right + hl.L(8.0f);
        float s = s() + L6;
        RectF rectF3 = this.O1;
        rectF3.set(L6, f8, s, L2);
        if (this.N1) {
            s = rectF2.right;
        } else if (this.q1) {
            s = Math.max(s, this.r1.right);
        }
        float max = Math.max(0.0f, 1.0f - (this.a0 * 2.0f));
        if (max < 0.01f && !this.N1) {
            rectF3.setEmpty();
        }
        if (!this.q1 || this.N1) {
            f5 = 0.01f;
            if (!this.N1 && max >= 0.01f) {
                float f15 = f * max;
                if (this.b2 == null) {
                    this.b2 = lycVar.g(this);
                }
                canvas.save();
                canvas.translate(0.0f, hl.L(f3) * f10);
                float B3 = xnb.B(this.H1, 0.04f, 1.0f, f11);
                canvas.scale(B3, B3, rectF3.left + hl.L(18.0f), rectF3.bottom);
                if (!this.m1) {
                    g(canvas, this.b2, rectF3, f15);
                    h(canvas, rectF3, f15);
                }
                canvas.restore();
            }
        } else {
            f5 = 0.01f;
            float x = bp1.x(this.a0, 0.5f, 1.0f, 0.0f);
            if (x > 0.0f) {
                canvas.save();
                canvas.clipPath(this.s1);
                h(canvas, rectF3, xnb.B(x, 2.0f, 3.0f, f * x * x));
                canvas.restore();
            }
        }
        float a = a(this.K1, (this.T || !z) ? 0.0f : 1.0f, f2, 0.06f);
        this.K1 = a;
        RectF rectF4 = this.Q1;
        if (a <= f5) {
            rectF4.setEmpty();
            return;
        }
        String M0 = ob6.M0(2131745368, null);
        float L7 = s + hl.L(8.0f);
        rectF4.set(L7, f8, textPaint.measureText(M0) + hl.L(12.0f) + L7 + hl.L(f4) + hl.L(8.0f) + hl.L(16.0f), L2);
        if (this.d2 == null) {
            this.d2 = lycVar.g(this);
        }
        float f16 = this.K1;
        float B4 = xnb.B(f16, 2.0f, 3.0f, f16 * f16);
        float f17 = f16 * f * max;
        canvas.save();
        float B5 = xnb.B(this.J1, 0.04f, 1.0f, (B4 * 0.4f) + 0.6f);
        canvas.scale(B5, B5, rectF4.left, rectF4.centerY());
        g(canvas, this.d2, rectF4, f17);
        Drawable drawable2 = this.T1;
        if (drawable2 == null) {
            drawable2 = getContext().getResources().getDrawable(R.drawable.voice_field_send_text).mutate();
            this.T1 = drawable2;
        }
        drawable2.setColorFilter(new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN));
        int i3 = (int) (f17 * 255.0f);
        this.T1.setAlpha(i3);
        int L8 = (int) (rectF4.left + hl.L(12.0f));
        int centerY2 = (int) (rectF4.centerY() - hl.L(11.0f));
        this.T1.setBounds(L8, centerY2, hl.L(f4) + L8, hl.L(f4) + centerY2);
        this.T1.draw(canvas);
        int alpha = textPaint.getAlpha();
        textPaint.setAlpha(i3);
        Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
        canvas.drawText(M0, rectF4.left + hl.L(12.0f) + hl.L(f4) + hl.L(8.0f), rectF4.centerY() - ((fontMetrics.ascent + fontMetrics.descent) / 2.0f), textPaint);
        textPaint.setAlpha(alpha);
        canvas.restore();
    }

    public final void j(Canvas canvas, float f) {
        float f2;
        float f3;
        float L;
        float f4 = this.a0;
        float L2 = hl.L(36.0f);
        String M0 = ob6.M0(this.q2 ? 2131744978 : 2131744979, null);
        float m = m();
        RectF rectF = this.j0;
        float L4 = rectF.left + hl.L(2.0f);
        float L5 = rectF.top - hl.L(8.0f);
        lyc lycVar = this.a;
        boolean z = lycVar.z();
        int i = this.U1;
        if (z) {
            float L6 = i + L4 + hl.L(8.0f);
            f2 = 2.0f;
            if (m() + ((!this.r2 || this.q2) ? 0 : hl.L(36.0f) + hl.L(6.0f)) + L6 <= rectF.right - hl.L(56.0f)) {
                L4 = L6;
                L = 0.0f;
            } else {
                L = hl.L(8.0f) + L2;
            }
            if (Float.isNaN(this.y1)) {
                this.y1 = L4;
                this.z1 = L;
            } else if (this.T) {
                this.y1 = a(this.y1, L4, 0.016f, 0.07f);
                this.z1 = a(this.z1, L, 0.016f, 0.07f);
                if (Math.abs(this.y1 - L4) > 0.5f || Math.abs(this.z1 - L) > 0.5f) {
                    postInvalidateOnAnimation();
                }
            }
            if (this.a0 < 0.01f) {
                this.y1 = Float.NaN;
            }
            if (!Float.isNaN(this.y1)) {
                L4 = this.y1;
            }
            if (!Float.isNaN(this.y1)) {
                L = this.z1;
            }
            L5 -= L;
        } else {
            f2 = 2.0f;
        }
        RectF rectF2 = this.k0;
        rectF2.set(L4, L5 - L2, L4 + m, L5);
        if (!lycVar.z() || this.N1 || this.m1) {
            f3 = 0.04f;
        } else {
            f3 = 0.04f;
            if (Math.abs(rectF2.left - (((rectF.left + hl.L(f2)) + i) + hl.L(8.0f))) < 1.0f && Math.abs(L5 - (rectF.top - hl.L(8.0f))) < 1.0f) {
                this.q1 = true;
                float B = xnb.B(f4, f2, 3.0f, f4 * f4);
                float f5 = rectF2.left;
                float f6 = rectF2.top;
                float s = ((m - s()) * B) + s() + f5;
                float f7 = rectF2.bottom;
                RectF rectF3 = this.r1;
                rectF3.set(f5, f6, s, f7);
                float f8 = 1.0f - (this.d0 * 0.04f);
                canvas.save();
                canvas.scale(f8, f8, rectF2.left + hl.L(18.0f), rectF2.bottom);
                jl0 jl0Var = this.J;
                if (jl0Var == null) {
                    jl0Var = lycVar.g(this);
                    this.J = jl0Var;
                }
                g(canvas, jl0Var, rectF3, f);
                float max = Math.max(0.0f, Math.min(1.0f, (f4 - 0.35f) / 0.55f));
                if (max > 0.0f) {
                    canvas.save();
                    Path path = this.s1;
                    path.rewind();
                    path.addRoundRect(rectF3, rectF3.height() / 2.0f, rectF3.height() / 2.0f, Path.Direction.CW);
                    canvas.clipPath(path);
                    e(canvas, M0, xnb.B(max, 2.0f, 3.0f, f * max * max));
                    canvas.restore();
                }
                canvas.restore();
                return;
            }
        }
        float f9 = 1.0f - f4;
        float pow = 1.0f - ((float) Math.pow(f9, 3.0d));
        float min = 1.0f - Math.min(1.0f, f4 / 0.55f);
        float sin = ((((float) Math.sin(Math.min(1.0f, f4 / 0.8f) * 3.141592653589793d)) * 0.07f * f9) + ((1.0f - (min * min)) * 0.38f) + 0.62f) * L2;
        float f10 = L2 * 0.62f;
        float max2 = Math.max(sin, ((rectF2.width() - f10) * pow) + f10);
        float min2 = Math.min(1.0f, f4 * 3.0f) * f;
        float max3 = Math.max(0.0f, Math.min(1.0f, (f4 - 0.62f) / 0.38f)) * f;
        boolean z2 = this.T;
        RectF rectF4 = this.m0;
        if (z2) {
            float f11 = rectF2.left;
            float f12 = rectF2.bottom;
            rectF4.set(f11, f12 - sin, max2 + f11, f12);
        } else {
            float width = rectF2.width();
            float B2 = xnb.B(f4, 2.0f, 3.0f, f4 * f4);
            float f13 = f * B2;
            float f14 = (B2 * 0.1f) + 0.9f;
            float centerX = rectF2.centerX();
            float centerY = rectF2.centerY();
            float f15 = (width * f14) / 2.0f;
            float f16 = (L2 * f14) / 2.0f;
            rectF4.set(centerX - f15, centerY - f16, centerX + f15, centerY + f16);
            min2 = f13;
            max3 = min2;
        }
        float f17 = 1.0f - (this.d0 * f3);
        canvas.save();
        canvas.scale(f17, f17, rectF2.left + hl.L(18.0f), rectF2.bottom);
        float height = rectF4.height() / 2.0f;
        if (this.J != null) {
            if (Math.abs(this.L - height) > 0.5f) {
                this.L = height;
                this.J.r(height);
            }
            this.J.setBounds((int) rectF4.left, (int) rectF4.top, (int) rectF4.right, (int) rectF4.bottom);
            this.J.setAlpha((int) (min2 * 255.0f));
            this.J.draw(canvas);
        } else {
            int i2 = this.M ? jn7.t3 : 235;
            Paint paint = this.r;
            paint.setAlpha((int) (i2 * min2));
            canvas.drawRoundRect(rectF4, height, height, paint);
            int i3 = this.M ? 38 : 20;
            Paint paint2 = this.s;
            paint2.setAlpha((int) (i3 * min2));
            canvas.drawRoundRect(rectF4, height, height, paint2);
        }
        if (max3 > 0.0f) {
            e(canvas, M0, max3);
        }
        canvas.restore();
    }

    public final void k(Canvas canvas, float f) {
        float a = a(this.u2, (!this.r2 || this.q2) ? 0.0f : 1.0f, 0.016f, 0.06f);
        this.u2 = a;
        RectF rectF = this.w2;
        if (a < 0.01f) {
            rectF.setEmpty();
            return;
        }
        Drawable drawable = this.x2;
        lyc lycVar = this.a;
        if (drawable == null) {
            this.x2 = getContext().getResources().getDrawable(R.drawable.chats_undo).mutate();
            jl0 g = lycVar.g(this);
            this.y2 = g;
            if (g != null) {
                g.r(hl.L(18.0f));
            }
        }
        float L = hl.L(36.0f);
        RectF rectF2 = this.k0;
        rectF.set(rectF2.right + hl.L(6.0f), rectF2.top, rectF2.right + hl.L(6.0f) + L, rectF2.top + L);
        float max = Math.max(0.0f, Math.min(1.0f, (this.a0 - 0.62f) / 0.38f));
        float f2 = this.u2;
        float f3 = f * f2 * max;
        if (f3 >= 0.01f) {
            float x = (1.0f - (this.v2 * 0.06f)) * c00.x(f2, 0.3f, max, 0.7f);
            canvas.save();
            canvas.scale(x, x, rectF.centerX(), rectF.centerY());
            jl0 jl0Var = this.y2;
            if (jl0Var != null) {
                jl0Var.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                this.y2.setAlpha((int) (255.0f * f3));
                this.y2.draw(canvas);
            } else {
                int i = this.M ? jn7.t3 : 235;
                Paint paint = this.r;
                paint.setAlpha((int) (i * f3));
                float f4 = L / 2.0f;
                canvas.drawRoundRect(rectF, f4, f4, paint);
            }
            ((snc) lycVar.e).b.getClass();
            this.x2.setColorFilter(new PorterDuffColorFilter((-16777216) | this.n.getColor(), PorterDuff.Mode.SRC_IN));
            float L2 = hl.L(24.0f) / 2.0f;
            this.x2.setBounds((int) (rectF.centerX() - L2), (int) (rectF.centerY() - L2), (int) (rectF.centerX() + L2), (int) (rectF.centerY() + L2));
            this.x2.setAlpha((int) (Color.alpha(r0) * f3));
            this.x2.draw(canvas);
            canvas.restore();
            float f5 = this.u2;
            if (f5 <= 0.01f || f5 >= 0.99f) {
                return;
            }
            postInvalidateOnAnimation();
        }
    }

    public final void l(Canvas canvas, float f, float f2, float f3, float f4, long j) {
        Paint.Style style = Paint.Style.STROKE;
        Paint paint = this.n2;
        paint.setStyle(style);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(hl.N(2.0f));
        paint.setColor(-1);
        paint.setAlpha((int) (f3 * 255.0f));
        float z = xnb.z(f4, 0.3f, 0.7f, hl.N(8.5f));
        RectF rectF = this.p2;
        rectF.set(f - z, f2 - z, f + z, f2 + z);
        long j2 = j - this.g2;
        float f5 = ((j2 % 1400) / 1400.0f) * 2.0f;
        float min = Math.min(1.0f, f5);
        float B = xnb.B(min, 2.0f, 3.0f, min * min);
        float max = Math.max(0.0f, f5 - 1.0f);
        float f6 = ((j2 / 1400) % 18) * 220.0f;
        float B2 = (xnb.B(max, 2.0f, 3.0f, max * max) * 220.0f) + f6;
        canvas.drawArc(rectF, (((((j2 % 6000) / 6000.0f) * 360.0f) * 5.0f) + B2) % 360.0f, (((B * 220.0f) + f6) + 30.0f) - B2, false, paint);
    }

    public final float m() {
        return this.n.measureText(ob6.M0(this.q2 ? 2131744978 : 2131744979, null)) + hl.L(6.0f) + hl.L(24.0f) + hl.L(12.0f) + hl.L(12.0f) + hl.L(1.0f) + hl.L(8.0f) + hl.L(14.0f) + hl.L(10.0f);
    }

    public final boolean n() {
        long uptimeMillis = SystemClock.uptimeMillis();
        ArrayList arrayList = this.d1;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            if (uptimeMillis - ((inc) obj).c < 1520) {
                return true;
            }
        }
        return false;
    }

    public final void o(jnc jncVar, ArrayList arrayList, int i) {
        if (arrayList == null || i >= arrayList.size()) {
            return;
        }
        float[] fArr = (float[]) arrayList.get(i);
        if (Float.isNaN(fArr[0])) {
            return;
        }
        float f = fArr[1] - this.f3;
        float f2 = jncVar.e;
        float f3 = f - f2;
        jncVar.d = fArr[0] - this.e3;
        jncVar.e = f2 + f3;
        jncVar.f += f3;
        jncVar.g += f3;
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        K();
    }

    /* JADX WARN: Code restructure failed: missing block: B:126:0x03a1, code lost:
    
        if ((r8 - r69.c1) >= 34) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:356:0x0eb2, code lost:
    
        if (java.lang.Math.abs(r9.i1 - (r9.j1 ? 1.0f : 0.0f)) <= 0.01f) goto L521;
     */
    /* JADX WARN: Code restructure failed: missing block: B:378:0x0ef8, code lost:
    
        if (java.lang.Math.abs(r9.K1 - ((r9.T || !r11) ? 0.0f : 1.0f)) <= 0.01f) goto L544;
     */
    /* JADX WARN: Removed duplicated region for block: B:129:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x048f  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x04a0  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x04ff  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0525  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x055b  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x05c4  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x066c  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x06df  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0b7d  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0b84  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0bd6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0bf0  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0d4b  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0d6c  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0d7d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0d9e  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x0db9  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x0dce  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x0de0  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x0df0  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x0e44  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x0ea1  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x0ee5  */
    /* JADX WARN: Removed duplicated region for block: B:420:0x0e2a  */
    /* JADX WARN: Removed duplicated region for block: B:421:0x0de3  */
    /* JADX WARN: Removed duplicated region for block: B:422:0x0dd1  */
    /* JADX WARN: Removed duplicated region for block: B:423:0x0dbf  */
    /* JADX WARN: Removed duplicated region for block: B:426:0x0d6f  */
    /* JADX WARN: Removed duplicated region for block: B:427:0x0d61  */
    /* JADX WARN: Removed duplicated region for block: B:433:0x0d3e  */
    /* JADX WARN: Removed duplicated region for block: B:437:0x0bb3  */
    /* JADX WARN: Removed duplicated region for block: B:442:0x0bbf  */
    /* JADX WARN: Removed duplicated region for block: B:444:0x0bc2  */
    /* JADX WARN: Removed duplicated region for block: B:491:0x09b0  */
    /* JADX WARN: Removed duplicated region for block: B:493:0x09b4  */
    /* JADX WARN: Removed duplicated region for block: B:501:0x06a3  */
    /* JADX WARN: Removed duplicated region for block: B:504:0x0653  */
    /* JADX WARN: Removed duplicated region for block: B:505:0x065c  */
    /* JADX WARN: Removed duplicated region for block: B:510:0x0606  */
    /* JADX WARN: Removed duplicated region for block: B:513:0x0627  */
    /* JADX WARN: Removed duplicated region for block: B:515:0x0615  */
    /* JADX WARN: Removed duplicated region for block: B:516:0x05ca  */
    /* JADX WARN: Removed duplicated region for block: B:517:0x0590  */
    /* JADX WARN: Removed duplicated region for block: B:526:0x053f  */
    /* JADX WARN: Removed duplicated region for block: B:527:0x0502  */
    /* JADX WARN: Removed duplicated region for block: B:529:0x04a4  */
    /* JADX WARN: Removed duplicated region for block: B:530:0x0491  */
    /* JADX WARN: Removed duplicated region for block: B:536:0x0455  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDraw(Canvas canvas) {
        long j;
        int i;
        float f;
        float f2;
        float f3;
        float f4;
        float a;
        float min;
        boolean z;
        float f5;
        float f6;
        float w;
        float f7;
        float max;
        float f8;
        float f9;
        float f10;
        boolean z2;
        TextPaint textPaint;
        float f11;
        RectF rectF;
        float f12;
        Canvas canvas2;
        float f13;
        float f14;
        long j2;
        ArrayList arrayList;
        ArrayList arrayList2;
        RectF rectF2;
        float f15;
        long j3;
        knc kncVar;
        lyc lycVar;
        float f16;
        mva mvaVar;
        boolean z3;
        float f17;
        boolean z4;
        float f18;
        lyc lycVar2;
        float f19;
        float f20;
        float f21;
        RectF rectF3;
        float f22;
        knc kncVar2;
        float f23;
        float f24;
        float f25;
        long j4;
        float f26;
        long j5;
        float f27;
        float f28;
        float f29;
        int i2;
        int i3;
        float f30;
        float f31;
        int i4;
        float f32;
        float f33;
        float f34;
        float f35;
        float L;
        float f36;
        float L2;
        float f37;
        long j6;
        float f38;
        float a2;
        float f39;
        float f40;
        float interpolation;
        c();
        long uptimeMillis = SystemClock.uptimeMillis();
        float min2 = this.g0 == 0 ? 0.016f : Math.min(0.05f, (uptimeMillis - r2) / 1000.0f);
        this.g0 = uptimeMillis;
        P3 = uptimeMillis;
        Q3 = this.O;
        R3 = this.N;
        boolean z5 = this.R;
        float f41 = this.W;
        float z6 = z5 ? qu6.z(min2, 0.3f, f41, 1.0f) : bp1.x(min2, 0.26f, f41, 0.0f);
        this.W = z6;
        boolean z7 = this.R;
        byte b = 0;
        lyc lycVar3 = this.a;
        if (!z7 && z6 <= 0.0f) {
            lycVar3.H(Float.NaN, 0.0f);
            this.g0 = 0L;
            this.n0 = false;
            post(new gnc(this, b));
            return;
        }
        boolean z8 = this.T;
        float f42 = this.a0;
        this.a0 = z8 ? qu6.z(min2, 0.32f, f42, 1.0f) : bp1.x(min2, 0.2f, f42, 0.0f);
        this.b0 = a(this.b0, (this.S && this.R) ? 1.0f : 0.0f, min2, 0.14f);
        float f43 = this.q2 ? 0.55f : this.U;
        float f44 = this.V;
        this.V = a(f44, f43, min2, f43 > f44 ? 0.12f : 0.4f);
        this.c0 = a(this.c0, this.f0 == 0 ? 1.0f : 0.0f, min2, 0.05f);
        float f45 = this.d0;
        int i5 = this.f0;
        this.d0 = a(f45, (i5 == 1 || i5 == 4) ? 1.0f : 0.0f, min2, 0.05f);
        this.v2 = a(this.v2, this.f0 == 5 ? 1.0f : 0.0f, min2, 0.05f);
        this.e0 = a(this.e0, this.f0 == 2 ? 1.0f : 0.0f, min2, 0.05f);
        boolean z9 = lycVar3.t() >= 0.0f;
        float L4 = hl.L(16.0f);
        boolean z10 = this.T;
        float f46 = K3;
        float L5 = L4 + ((!z10 || (!z9 && this.P0.isEmpty())) ? 0.0f : (((J3 * 2.0f) + f46) + hl.L(8.0f)) - hl.L(16.0f));
        boolean z11 = this.T;
        RectF rectF4 = this.i0;
        boolean v = lycVar3.v(rectF4, z11);
        boolean z12 = this.n0;
        if (v) {
            if (!z12) {
                float f47 = rectF4.left;
                this.y0 = f47;
                this.o0 = f47;
                float f48 = rectF4.right;
                this.z0 = f48;
                this.p0 = f48;
                this.q0 = rectF4.bottom;
                this.A0 = L5;
                this.u0 = L5;
                this.B0 = 0L;
            }
            if (Math.abs(rectF4.left - this.y0) > 1.0f || Math.abs(rectF4.right - this.z0) > 1.0f || Math.abs(L5 - this.A0) > 1.0f) {
                this.v0 = this.o0;
                this.w0 = this.p0;
                this.x0 = this.u0;
                this.y0 = rectF4.left;
                this.z0 = rectF4.right;
                this.A0 = L5;
                this.B0 = uptimeMillis;
            }
            j = 0;
            float min3 = this.B0 == 0 ? 1.0f : Math.min(1.0f, (uptimeMillis - r10) / 320.0f);
            float pow = 1.0f - ((float) Math.pow(1.0f - min3, 3.0d));
            float f49 = this.v0;
            float f50 = this.y0;
            this.o0 = qd4.A(f50, f49, pow, f49);
            float f51 = this.w0;
            float f52 = this.z0;
            this.p0 = qd4.A(f52, f51, pow, f51);
            float f53 = this.x0;
            float f54 = this.A0;
            this.u0 = qd4.A(f54, f53, pow, f53);
            if (min3 >= 1.0f) {
                this.o0 = f50;
                this.p0 = f52;
                this.u0 = f54;
            }
            this.o1 = Math.abs(rectF4.bottom - this.q0) > 0.5f;
            this.q0 = rectF4.bottom;
        } else {
            j = 0;
            if (!z12) {
                postInvalidateOnAnimation();
                return;
            }
        }
        float x = lycVar3.x();
        TextPaint textPaint2 = this.d;
        float abs = Math.abs(textPaint2.getTextSize() - x);
        TextPaint textPaint3 = this.e;
        if (abs > 0.5f) {
            textPaint2.setTextSize(x);
            textPaint3.setTextSize(x);
            this.S0 = null;
            this.a1 = 0;
        }
        boolean z13 = lycVar3.t() >= 0.0f;
        boolean z14 = z13 || !this.P0.isEmpty();
        float f55 = this.a0;
        float B = xnb.B(f55, 2.0f, 3.0f, f55 * f55);
        float L6 = hl.L(16.0f);
        float f56 = this.u0;
        float f57 = ((this.z0 - this.y0) - L6) - this.A0;
        boolean z15 = z14;
        long j7 = this.B0;
        boolean z16 = j7 == j || uptimeMillis - j7 >= 320;
        if (!this.T && z16 && uptimeMillis - this.D0 > 250) {
            this.C0 = f57;
        }
        float L7 = hl.L(40.0f);
        float f58 = this.C0;
        if (f58 > 0.0f) {
            f57 = Math.min(f58, f57 + (this.T ? 0 : hl.L(400.0f)));
        }
        int max2 = (int) Math.max(L7, f57);
        if (Math.abs(max2 - this.a1) > 1) {
            this.a1 = max2;
            this.S0 = null;
            C();
        }
        StaticLayout staticLayout = this.S0;
        TextPaint textPaint4 = this.f;
        if (staticLayout == null) {
            this.S0 = b(ob6.L0(2131744967), textPaint3);
            int v0 = aob.v0(aob.Me, this.b);
            textPaint4.setTextSize(textPaint3.getTextSize());
            if (this.M) {
                i = -16777216;
                v0 = vm2.f(0.3f, gn3.d(v0) | (-16777216), gn3.e(-7359233));
            } else {
                i = -16777216;
            }
            textPaint4.setColor(v0);
            this.h = Color.alpha(textPaint4.getColor());
            this.T0 = b(ob6.L0(2131744961), textPaint4);
        } else {
            i = -16777216;
        }
        float height = this.S0.getHeight();
        float f59 = height * 6.0f;
        this.t0 = f59;
        float f60 = bp1.f(hl.L(44.0f), height, 2.0f, hl.L(6.0f));
        float t = lycVar3.t();
        if (t >= 0.0f) {
            f = Math.max(height, t);
        } else {
            f = this.Q0 != null ? r2.getHeight() : height;
        }
        float min4 = Math.min(f, f59);
        float f61 = f;
        float max3 = Math.max(hl.L(44.0f), (f60 * 2.0f) + min4);
        if (this.n0) {
            float f62 = this.F0;
            if (f62 >= 0.0f) {
                if (Math.abs(max3 - f62) > 0.5f) {
                    if (Math.abs(max3 - this.b1) > 0.5f) {
                        this.b1 = max3;
                        this.c1 = uptimeMillis;
                    }
                    boolean z17 = this.T2;
                    boolean z18 = (z17 || this.z2) ? z17 : z17;
                    this.E0 = this.r0;
                    this.F0 = max3;
                    this.G0 = z18 ? Math.max(uptimeMillis, this.V2) : this.z2 ? this.C2 : uptimeMillis;
                    this.B2 = !this.T2 && this.z2;
                    this.b1 = -1.0f;
                } else {
                    this.b1 = -1.0f;
                }
                if (this.F0 < 0.0f) {
                    f2 = L6;
                    f3 = f56;
                    float w2 = qu6.w(uptimeMillis - this.G0, this.T2 ? this.W2 : 320L, 1.0f, 0.0f);
                    if (this.B2) {
                        float f63 = (uptimeMillis - this.G0) / 1000.0f;
                        interpolation = this.O2.getInterpolation(Math.max(0.0f, Math.min(1.0f, (f63 - 0.08f) / 0.4f)));
                        if (f63 >= 0.48000002f) {
                            this.B2 = false;
                        }
                    } else {
                        interpolation = this.T2 ? U3.getInterpolation(w2) : 1.0f - ((float) Math.pow(1.0f - w2, 3.0d));
                    }
                    float f64 = this.E0;
                    this.r0 = qd4.A(this.F0, f64, interpolation, f64);
                } else {
                    f2 = L6;
                    f3 = f56;
                }
                this.n0 = true;
                this.K0 = Math.max(0.0f, f61 - min4);
                if (!Float.isNaN(this.H0) && !this.L0 && this.H0 >= this.K0 - hl.L(4.0f)) {
                    this.H0 = Float.NaN;
                }
                boolean isNaN = Float.isNaN(this.H0);
                float f65 = this.K0;
                float max4 = !isNaN ? f65 : Math.max(0.0f, Math.min(f65, this.H0));
                if (this.L0) {
                    f4 = min2;
                    a = a(this.s0, max4, f4, 0.12f);
                } else {
                    a = max4;
                    f4 = min2;
                }
                this.s0 = a;
                float f66 = this.o0;
                float f67 = this.q0;
                float f68 = f67 - this.r0;
                float f69 = max4;
                float f70 = this.p0;
                RectF rectF5 = this.j0;
                rectF5.set(f66, f68, f70, f67);
                min = Math.min(hl.L(22.0f), this.r0 / 2.0f);
                float f71 = this.W;
                float B2 = xnb.B(f71, 2.0f, 3.0f, f71 * f71);
                this.E3 = a(this.E3, (this.R || !lycVar3.C()) ? 0.0f : 1.0f, f4, 0.04f);
                float f72 = !this.R ? B2 : B2 * B2;
                canvas.save();
                float B3 = xnb.B(this.e0, 0.015f, 1.0f, (B2 * 0.06f) + 0.94f);
                if (this.R) {
                    canvas.scale((B2 * 0.08f) + 0.92f, (0.65f * B2) + 0.35f, rectF5.centerX(), rectF5.bottom);
                } else {
                    canvas.translate(0.0f, (1.0f - B2) * hl.L(10.0f));
                    canvas.scale(B3, B3, rectF5.left + hl.L(24.0f), rectF5.bottom);
                }
                if (this.I == null) {
                    if (Math.abs(this.K - min) > 0.5f) {
                        this.K = min;
                        this.I.r(min);
                    }
                    f5 = 255.0f;
                    z = z13;
                    this.I.setBounds((int) rectF5.left, (int) rectF5.top, (int) rectF5.right, (int) rectF5.bottom);
                    this.I.setAlpha((int) (f72 * 255.0f));
                    this.I.draw(canvas);
                } else {
                    z = z13;
                    f5 = 255.0f;
                    int i6 = this.M ? jn7.t3 : 235;
                    Paint paint = this.r;
                    paint.setAlpha((int) (i6 * f72));
                    canvas.drawRoundRect(rectF5, min, min, paint);
                    int i7 = this.M ? 38 : 20;
                    Paint paint2 = this.s;
                    paint2.setAlpha((int) (i7 * f72));
                    canvas.drawRoundRect(rectF5, min, min, paint2);
                }
                this.t2 = a(this.t2, !this.q2 ? 1.0f : 0.0f, f4, 0.12f);
                if (!this.T2 || this.U2) {
                    f6 = min;
                    long j8 = this.V2 + ((long) (this.W2 * 0.87f));
                    w = qu6.w(uptimeMillis - j8, 580.0f, 1.0f, 0.0f);
                    float f73 = this.X2;
                    float max5 = uptimeMillis >= j8 ? Math.max(f73, Math.min(1.0f, (f4 / 0.12f) + f73)) : Math.min(f73, 1.0f - T3.getInterpolation(w));
                    this.X2 = max5;
                    if (w >= 1.0f) {
                        this.X2 = 0.0f;
                        this.U2 = false;
                        max5 = 0.0f;
                    }
                    f7 = max5;
                } else {
                    f7 = a(this.X2, 0.0f, f4, 0.18f);
                    this.X2 = f7;
                    f6 = min;
                }
                max = Math.max(this.b0, Math.max(this.t2, f7) * 0.85f) * f72;
                if (!this.M || this.b0 >= 0.5f) {
                    if (!this.T2) {
                        float A = A(uptimeMillis);
                        this.U2 = true;
                        f8 = A;
                    } else if (this.U2) {
                        f8 = 1.0f;
                    }
                    if (max > 0.002f) {
                        gn3 gn3Var = this.c;
                        gn3Var.i();
                        f10 = 0.002f;
                        f12 = 1.0f;
                        gn3Var.H = qu6.B(1.0f, this.b0, Math.max(this.t2, this.X2), 1.0f);
                        f9 = f4;
                        z2 = z15;
                        textPaint = textPaint4;
                        f11 = B;
                        rectF = rectF4;
                        f13 = min4;
                        f14 = max3;
                        j2 = uptimeMillis;
                        this.c.b(f6, max, f8, this.V, canvas, rectF5);
                        canvas2 = canvas;
                    } else {
                        f9 = f4;
                        f10 = 0.002f;
                        z2 = z15;
                        textPaint = textPaint4;
                        f11 = B;
                        rectF = rectF4;
                        f12 = 1.0f;
                        canvas2 = canvas;
                        f13 = min4;
                        f14 = max3;
                        j2 = uptimeMillis;
                    }
                    float f74 = rectF5.left + f2;
                    lycVar3.J(f74, rectF5.top + f60, Math.min(rectF5.right - f3, this.a1 + f74), rectF5.bottom - f60);
                    arrayList = this.g1;
                    if (!z || this.G3) {
                        arrayList2 = arrayList;
                        rectF2 = rectF5;
                        f15 = f14;
                        j3 = j2;
                        kncVar = this;
                        lycVar = lycVar3;
                        f16 = f72;
                    } else {
                        canvas2.save();
                        canvas2.clipRect(rectF5.left, rectF5.top + hl.L(2.0f), rectF5.right, rectF5.bottom - hl.L(2.0f));
                        float f75 = this.K0;
                        float f76 = this.s0;
                        float f77 = f75 - f76;
                        boolean z19 = f76 > f12 || f77 > f12;
                        if (z19) {
                            arrayList2 = arrayList;
                            i2 = canvas2.saveLayer(rectF5.left, rectF5.top, rectF5.right, rectF5.bottom, null);
                        } else {
                            arrayList2 = arrayList;
                            i2 = -1;
                        }
                        float f78 = rectF5.left + f2;
                        float f79 = rectF5.top + f60;
                        float f80 = this.s0;
                        float f81 = f79 - f80;
                        this.e3 = f78;
                        this.f3 = f81;
                        this.g3 = f80;
                        this.h3 = f13;
                        float min5 = this.R0 != null ? Math.min(f12, (j2 - this.Z0) / 220.0f) : f12;
                        if (this.R0 != null && min5 >= f12) {
                            this.R0 = null;
                            this.e1 = false;
                        }
                        if (this.R0 == null || this.e1) {
                            i3 = i2;
                            f30 = f12;
                        } else {
                            canvas2.save();
                            f30 = f12;
                            i3 = i2;
                            canvas2.translate(f78, (rectF5.top + f60) - Math.max(0.0f, this.R0.getHeight() - f59));
                            textPaint2.setAlpha((int) ((f30 - min5) * f72 * f5));
                            this.R0.draw(canvas2);
                            canvas2.restore();
                        }
                        if (this.Q0 == null) {
                            f31 = f77;
                            i4 = i3;
                            ArrayList arrayList3 = arrayList2;
                            float f82 = f72;
                            f15 = f14;
                            L();
                            rx rxVar = this.D1;
                            float d = rxVar != null ? ((mm) rxVar.d).d(rxVar.b) : 0.0f;
                            float f83 = this.a0;
                            if (f83 < f30) {
                                if (d < f30) {
                                    textPaint3.setAlpha((int) ((f30 - d) * (f30 - f83) * this.Q * f82));
                                    canvas2.save();
                                    canvas2.translate(hl.L(4.0f) + f78, rectF5.top + f60);
                                    this.S0.draw(canvas2);
                                    canvas2.restore();
                                }
                                if (d > 0.0f) {
                                    f32 = f78;
                                    f33 = f81;
                                    canvas2 = canvas;
                                    kncVar = this;
                                    f16 = f82;
                                    arrayList2 = arrayList3;
                                    j3 = j2;
                                    lycVar = lycVar3;
                                    f34 = height;
                                    rectF2 = rectF5;
                                    this.D1.d(canvas2, hl.L(4.0f) + f78, this.a1 + f78, (height / 2.0f) + rectF5.top + f60, textPaint3.getTextSize(), textPaint3.getColor() | i, textPaint3.getShader(), (int) ((f30 - this.a0) * this.Q * f82));
                                    f35 = kncVar.a0;
                                    if (f35 > 0.0f && kncVar.T0 != null) {
                                        textPaint.setAlpha((int) (kncVar.h * f16 * f35 * (!kncVar.M ? 0.8f : f30)));
                                        canvas2.save();
                                        canvas2.translate(f32 + hl.L(4.0f), rectF2.top + f60);
                                        kncVar.T0.draw(canvas2);
                                        canvas2.restore();
                                    }
                                }
                            }
                            kncVar = this;
                            f32 = f78;
                            f33 = f81;
                            arrayList2 = arrayList3;
                            j3 = j2;
                            lycVar = lycVar3;
                            f34 = height;
                            rectF2 = rectF5;
                            f16 = f82;
                            f35 = kncVar.a0;
                            if (f35 > 0.0f) {
                                textPaint.setAlpha((int) (kncVar.h * f16 * f35 * (!kncVar.M ? 0.8f : f30)));
                                canvas2.save();
                                canvas2.translate(f32 + hl.L(4.0f), rectF2.top + f60);
                                kncVar.T0.draw(canvas2);
                                canvas2.restore();
                            }
                        } else if (this.z2) {
                            float f84 = this.F0;
                            if (f84 >= 0.0f) {
                                f40 = f81;
                                f39 = ((this.q0 - f84) + f60) - f69;
                            } else {
                                f39 = f81;
                                f40 = f39;
                            }
                            long j9 = j2;
                            i4 = i3;
                            float f85 = f72;
                            G(f78, f39, f85, j9, canvas2);
                            f32 = f78;
                            f15 = f14;
                            lycVar = lycVar3;
                            f33 = f40;
                            f31 = f77;
                            f34 = height;
                            canvas2 = canvas;
                            kncVar = this;
                            f16 = f85;
                            j3 = j9;
                            rectF2 = rectF5;
                        } else {
                            long j10 = j2;
                            i4 = i3;
                            float f86 = f72;
                            if (this.T2) {
                                canvas2 = canvas;
                                w(canvas2, j10, f78, f81, f86, rectF5.top + f60, f13);
                                f32 = f78;
                                f33 = f81;
                                f15 = f14;
                                lycVar = lycVar3;
                                f31 = f77;
                                f34 = height;
                                kncVar = this;
                                f16 = f86;
                                rectF2 = rectF5;
                                j3 = j10;
                            } else {
                                canvas2 = canvas;
                                canvas2.save();
                                canvas2.translate(f78, f81);
                                E(j10);
                                if (arrayList2.isEmpty()) {
                                    j6 = j10;
                                    f15 = f14;
                                    f38 = f9;
                                    a2 = 0.0f;
                                } else {
                                    j6 = j10;
                                    f15 = f14;
                                    f38 = f9;
                                    a2 = a(this.i1, this.j1 ? f30 : 0.0f, f38, 0.1f);
                                }
                                this.i1 = a2;
                                if (!arrayList2.isEmpty()) {
                                    int i8 = this.P;
                                    Paint paint3 = this.h1;
                                    paint3.setColor(i8);
                                    paint3.setAlpha((int) (Color.alpha(this.P) * f86 * min5 * this.i1));
                                    int size = arrayList2.size();
                                    int i9 = 0;
                                    while (i9 < size) {
                                        float f87 = f77;
                                        ArrayList arrayList4 = arrayList2;
                                        Object obj = arrayList4.get(i9);
                                        i9++;
                                        float f88 = f38;
                                        float f89 = O3;
                                        canvas2.drawRoundRect((RectF) obj, f89, f89, paint3);
                                        size = size;
                                        f38 = f88;
                                        arrayList2 = arrayList4;
                                        f77 = f87;
                                    }
                                }
                                f9 = f38;
                                f31 = f77;
                                ArrayList arrayList5 = arrayList2;
                                float f90 = f86 * f5;
                                int i10 = (int) f90;
                                textPaint2.setAlpha(i10);
                                this.Q0.draw(canvas2);
                                StaticLayout staticLayout2 = this.R0;
                                if (staticLayout2 != null && this.e1 && staticLayout2.getText().length() == this.Q0.getText().length()) {
                                    textPaint2.setAlpha((int) ((f30 - ((3.0f - (min5 * 2.0f)) * (min5 * min5))) * f90));
                                    this.R0.draw(canvas2);
                                    textPaint2.setAlpha(i10);
                                }
                                textPaint2.setShader(null);
                                canvas2.restore();
                                kncVar = this;
                                f32 = f78;
                                f33 = f81;
                                arrayList2 = arrayList5;
                                f16 = f86;
                                long j11 = j6;
                                lycVar = lycVar3;
                                f34 = height;
                                rectF2 = rectF5;
                                j3 = j11;
                            }
                        }
                        textPaint2.setAlpha(jn7.d4);
                        if (kncVar.b0 > 0.01f && kncVar.Q0 != null) {
                            float min6 = Math.min(f30, ((((float) Math.cos(((j3 - kncVar.h0) / 530.0f) * 3.141592653589793d)) * 0.5f) + 0.5f) * 1.6f) * kncVar.b0 * f16;
                            StaticLayout staticLayout3 = kncVar.Q0;
                            if (staticLayout3 != null) {
                                L = kncVar.Q0.getLineRight(staticLayout3.getLineCount() - 1) + f32 + hl.L(2.0f);
                                float lineTop = f33 + kncVar.Q0.getLineTop(r2) + hl.L(2.0f);
                                float lineBottom = (f33 + kncVar.Q0.getLineBottom(r2)) - hl.L(2.0f);
                                if (L > rectF2.right - hl.L(10.0f)) {
                                    L = rectF2.right - hl.L(10.0f);
                                }
                                L2 = lineBottom;
                                f37 = lineTop;
                                f36 = 2.0f;
                            } else {
                                L = f32 + hl.L(1.0f);
                                f36 = 2.0f;
                                float L8 = hl.L(2.0f) + ((rectF2.bottom - f60) - f34);
                                L2 = (rectF2.bottom - f60) - hl.L(2.0f);
                                f37 = L8;
                            }
                            kncVar.w.setAlpha((int) (min6 * f5));
                            canvas2.drawRoundRect(L, f37, hl.N(f36) + L, L2, hl.L(1.0f), hl.L(1.0f), kncVar.w);
                        }
                        if (z19) {
                            LinearGradient linearGradient = kncVar.F;
                            Paint paint4 = kncVar.y;
                            if (linearGradient == null) {
                                LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, -16777216, 0, Shader.TileMode.CLAMP);
                                kncVar.F = linearGradient2;
                                paint4.setShader(linearGradient2);
                            }
                            float L9 = hl.L(18.0f);
                            Matrix matrix = kncVar.E;
                            float f91 = 1.0f;
                            matrix.setScale(1.0f, L9);
                            matrix.postTranslate(0.0f, rectF2.top + hl.L(2.0f));
                            kncVar.F.setLocalMatrix(matrix);
                            float f92 = kncVar.s0;
                            if (f92 > 1.0f) {
                                paint4.setAlpha((int) (Math.min(1.0f, f92 / hl.L(8.0f)) * f5));
                                float f93 = rectF2.left;
                                float f94 = rectF2.top;
                                canvas.drawRect(f93, f94, rectF2.right, hl.L(2.0f) + f94 + L9, paint4);
                                f91 = 1.0f;
                            }
                            if (f31 > f91) {
                                matrix.setScale(f91, -L9);
                                matrix.postTranslate(0.0f, rectF2.bottom - hl.L(2.0f));
                                kncVar.F.setLocalMatrix(matrix);
                                paint4.setAlpha((int) (Math.min(f91, f31 / hl.L(8.0f)) * f5));
                                canvas.drawRect(rectF2.left, (rectF2.bottom - hl.L(2.0f)) - L9, rectF2.right, rectF2.bottom, paint4);
                                canvas2 = canvas;
                            } else {
                                canvas2 = canvas;
                            }
                            canvas2.restoreToCount(i4);
                        } else {
                            canvas2 = canvas;
                        }
                        canvas2.restore();
                    }
                    mvaVar = kncVar.R2;
                    if (mvaVar.E > 0) {
                        mvaVar.b(canvas2, f16);
                    }
                    if (kncVar.T2 || !kncVar.t3) {
                        z3 = kncVar.q2;
                        if (z3 && kncVar.f2 < 0.01f) {
                            kncVar.g2 = j3;
                        }
                        f17 = f9;
                        kncVar.f2 = a(kncVar.f2, z3 ? 1.0f : 0.0f, f17, 0.09f);
                    } else {
                        float f95 = kncVar.r3;
                        kncVar.f2 = 1.0f - Math.max(0.0f, Math.min(1.0f, (((j3 - kncVar.V2) / 1000.0f) - f95) / Math.max(0.12f, kncVar.s3 - f95)));
                        f17 = f9;
                    }
                    z4 = z2;
                    float a3 = a(kncVar.U0, (kncVar.T || !z4) ? 0.0f : 1.0f, f17, 0.06f);
                    kncVar.U0 = a3;
                    f18 = kncVar.a0;
                    RectF rectF6 = kncVar.l0;
                    if (f18 <= 0.0f && a3 > 0.01f && !kncVar.H3) {
                        float min7 = Math.min(f18, a3);
                        float B4 = xnb.B(min7, 2.0f, 3.0f, min7 * min7);
                        float f96 = rectF2.right - f46;
                        float f97 = J3;
                        float f98 = f96 - f97;
                        float f99 = rectF2.top + f46 + f97;
                        long j12 = j3;
                        rectF6.set(f98 - f97, f99 - f97, f98 + f97, f99 + f97);
                        float f100 = (1.0f - (kncVar.c0 * 0.08f)) * ((B4 * 0.4f) + 0.6f);
                        canvas2.save();
                        canvas2.scale(f100, f100, f98, f99);
                        float f101 = B4 * f5 * f16;
                        Paint paint5 = kncVar.x;
                        paint5.setAlpha((int) f101);
                        canvas2.drawCircle(f98, f99, f97, paint5);
                        float f102 = kncVar.f2;
                        if (f102 > 0.01f) {
                            kncVar2 = kncVar;
                            f23 = f102;
                            kncVar2.f(canvas2, f98, f99, f97, f102 * B4 * f16, j12);
                            f25 = f99;
                            f22 = f98;
                            j4 = j12;
                            f24 = f97;
                        } else {
                            f22 = f98;
                            kncVar2 = kncVar;
                            f23 = f102;
                            f24 = f97;
                            f25 = f99;
                            j4 = j12;
                        }
                        if (kncVar2.V0 == null || kncVar2.W0 != f24) {
                            kncVar2.W0 = f24;
                            f26 = 0.6f;
                            j5 = j4;
                            LinearGradient linearGradient3 = new LinearGradient(0.0f, -f24, 0.0f, f24, new int[]{1442840575, 16777215, 16777215, 1442840575}, new float[]{0.0f, 0.3f, 0.7f, 1.0f}, Shader.TileMode.CLAMP);
                            kncVar2.V0 = linearGradient3;
                            kncVar2.Y0.setShader(linearGradient3);
                        } else {
                            j5 = j4;
                            f26 = 0.6f;
                        }
                        Matrix matrix2 = kncVar2.X0;
                        matrix2.setTranslate(f22, f25);
                        kncVar2.V0.setLocalMatrix(matrix2);
                        int L10 = hl.L(24.0f);
                        float f103 = L10 / 2.0f;
                        float f104 = f22 - f103;
                        float f105 = f25 - f103;
                        int round = Math.round(f104);
                        int round2 = Math.round(f105);
                        int round3 = Math.round(f104) + L10;
                        int round4 = Math.round(f105) + L10;
                        Drawable drawable = kncVar2.H;
                        drawable.setBounds(round, round2, round3, round4);
                        if (f23 < 0.99f) {
                            float f106 = 1.0f - f23;
                            float f107 = (0.4f * f106) + f26;
                            canvas2.save();
                            canvas2.scale(f107, f107, f22, f25);
                            drawable.setAlpha((int) (f106 * f101));
                            drawable.draw(canvas2);
                            canvas2.restore();
                        }
                        if (f102 > 0.01f) {
                            f27 = f22;
                            f28 = f25;
                            f29 = f23;
                            kncVar2.l(canvas2, f27, f28, f23 * B4 * f16, f29, j5);
                        } else {
                            f27 = f22;
                            f28 = f25;
                            f29 = f23;
                        }
                        kncVar = kncVar2;
                        lv3 u = lycVar.u();
                        if (u != null) {
                            int L11 = hl.L(8.0f);
                            int L12 = (int) (f27 + hl.L(12.0f));
                            int L13 = (int) (f28 + hl.L(10.0f));
                            u.setBounds(L12 - L11, L13 - L11, L12 + L11, L13 + L11);
                            u.setAlpha((int) ((1.0f - f29) * f101));
                            u.draw(canvas2);
                        }
                        canvas2.restore();
                    } else if (!kncVar.H3) {
                        rectF6.setEmpty();
                    }
                    canvas2.restore();
                    if (kncVar.a0 > 0.0f) {
                        lycVar2 = lycVar;
                        lycVar2.H((rectF2.top - hl.L(8.0f)) - hl.L(18.0f), f11);
                    } else {
                        lycVar2 = lycVar;
                        lycVar2.H(Float.NaN, 0.0f);
                    }
                    lycVar2.G(kncVar.R ? 1.0f : B2 * B2);
                    kncVar.q1 = false;
                    if (kncVar.a0 > 0.0f || !z4 || kncVar.x1 || !lycVar2.y()) {
                        kncVar.k0.setEmpty();
                    } else {
                        kncVar.j(canvas2, kncVar.l1 * f16);
                        kncVar.k(canvas2, f16);
                    }
                    kncVar.G1 = a(kncVar.G1, (kncVar.R || !lycVar2.z()) ? 0.0f : 1.0f, f17, 0.1f);
                    kncVar.H1 = a(kncVar.H1, kncVar.f0 == 6 ? 1.0f : 0.0f, f17, 0.05f);
                    kncVar.I1 = a(kncVar.I1, kncVar.f0 == 7 ? 1.0f : 0.0f, f17, 0.05f);
                    kncVar.J1 = a(kncVar.J1, kncVar.f0 == 8 ? 1.0f : 0.0f, f17, 0.05f);
                    f19 = kncVar.G1;
                    if (f19 > 0.01f) {
                        kncVar.i(canvas2, f19 * f16, f17, z4);
                        rn3.b(canvas, kncVar.e2, hl.L(2.0f) + rectF2.left, ((rectF2.top - hl.L(8.0f)) - hl.L(36.0f)) - hl.L(8.0f), kncVar.n.getColor(), kncVar.M, f16 * kncVar.G1);
                        f20 = 0.0f;
                    } else {
                        kncVar.O1.setEmpty();
                        kncVar.P1.setEmpty();
                        kncVar.Q1.setEmpty();
                        f20 = 0.0f;
                        kncVar.K1 = 0.0f;
                    }
                    if (kncVar.W >= 1.0f && kncVar.R && kncVar.b0 <= 0.01f) {
                        f21 = kncVar.a0;
                        if ((f21 > f20 || f21 >= 1.0f) && !kncVar.n() && kncVar.R0 == null) {
                            if (Math.abs(kncVar.U0 - ((kncVar.T || !z4) ? 0.0f : 1.0f)) <= 0.01f && !z && kncVar.t2 <= 0.01f && !kncVar.T2 && !kncVar.U2 && !kncVar.z2 && kncVar.X2 <= 0.01f && kncVar.f2 <= 0.01f && mvaVar.E <= 0) {
                                if (!arrayList2.isEmpty()) {
                                }
                                if (Math.abs(kncVar.G1 - ((kncVar.R || !lycVar2.z()) ? 0.0f : 1.0f)) <= 0.01f && kncVar.H1 <= 0.01f && kncVar.I1 <= 0.01f && kncVar.J1 <= 0.01f) {
                                    if (kncVar.G1 > 0.01f) {
                                    }
                                    if (Math.abs(kncVar.E3 - ((kncVar.R || !lycVar2.C()) ? 0.0f : 1.0f)) <= 0.01f && !kncVar.o1 && Math.abs(kncVar.p1 - lycVar2.w()) <= f10 && ((kncVar.p1 <= 0.0f || !lycVar2.C()) && Math.abs(kncVar.r0 - f15) <= 0.5f && Math.abs(kncVar.s0 - f69) <= 0.5f)) {
                                        rectF3 = rectF;
                                        if (Math.abs(kncVar.o0 - rectF3.left) <= 0.5f && Math.abs(kncVar.p0 - rectF3.right) <= 0.5f && Math.abs(kncVar.q0 - rectF3.bottom) <= 0.5f && kncVar.c0 <= 0.01f && kncVar.d0 <= 0.01f && kncVar.e0 <= 0.01f && kncVar.f0 < 0) {
                                            kncVar.g0 = j;
                                            kncVar.postInvalidateDelayed(120L);
                                            return;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    kncVar.postInvalidateOnAnimation();
                }
                this.U2 = false;
                f8 = -1.0f;
                if (max > 0.002f) {
                }
                float f742 = rectF5.left + f2;
                lycVar3.J(f742, rectF5.top + f60, Math.min(rectF5.right - f3, this.a1 + f742), rectF5.bottom - f60);
                arrayList = this.g1;
                if (z) {
                }
                arrayList2 = arrayList;
                rectF2 = rectF5;
                f15 = f14;
                j3 = j2;
                kncVar = this;
                lycVar = lycVar3;
                f16 = f72;
                mvaVar = kncVar.R2;
                if (mvaVar.E > 0) {
                }
                if (kncVar.T2) {
                }
                z3 = kncVar.q2;
                if (z3) {
                    kncVar.g2 = j3;
                }
                f17 = f9;
                kncVar.f2 = a(kncVar.f2, z3 ? 1.0f : 0.0f, f17, 0.09f);
                z4 = z2;
                float a32 = a(kncVar.U0, (kncVar.T || !z4) ? 0.0f : 1.0f, f17, 0.06f);
                kncVar.U0 = a32;
                f18 = kncVar.a0;
                RectF rectF62 = kncVar.l0;
                if (f18 <= 0.0f) {
                }
                if (!kncVar.H3) {
                }
                canvas2.restore();
                if (kncVar.a0 > 0.0f) {
                }
                lycVar2.G(kncVar.R ? 1.0f : B2 * B2);
                kncVar.q1 = false;
                if (kncVar.a0 > 0.0f) {
                }
                kncVar.k0.setEmpty();
                kncVar.G1 = a(kncVar.G1, (kncVar.R || !lycVar2.z()) ? 0.0f : 1.0f, f17, 0.1f);
                kncVar.H1 = a(kncVar.H1, kncVar.f0 == 6 ? 1.0f : 0.0f, f17, 0.05f);
                kncVar.I1 = a(kncVar.I1, kncVar.f0 == 7 ? 1.0f : 0.0f, f17, 0.05f);
                kncVar.J1 = a(kncVar.J1, kncVar.f0 == 8 ? 1.0f : 0.0f, f17, 0.05f);
                f19 = kncVar.G1;
                if (f19 > 0.01f) {
                }
                if (kncVar.W >= 1.0f) {
                    f21 = kncVar.a0;
                    if (f21 > f20) {
                    }
                    if (Math.abs(kncVar.U0 - ((kncVar.T || !z4) ? 0.0f : 1.0f)) <= 0.01f) {
                        if (!arrayList2.isEmpty()) {
                        }
                        if (Math.abs(kncVar.G1 - ((kncVar.R || !lycVar2.z()) ? 0.0f : 1.0f)) <= 0.01f) {
                            if (kncVar.G1 > 0.01f) {
                            }
                            if (Math.abs(kncVar.E3 - ((kncVar.R || !lycVar2.C()) ? 0.0f : 1.0f)) <= 0.01f) {
                                rectF3 = rectF;
                                if (Math.abs(kncVar.o0 - rectF3.left) <= 0.5f) {
                                    kncVar.g0 = j;
                                    kncVar.postInvalidateDelayed(120L);
                                    return;
                                }
                            }
                        }
                    }
                }
                kncVar.postInvalidateOnAnimation();
            }
        }
        this.F0 = max3;
        this.E0 = max3;
        this.r0 = max3;
        this.b1 = -1.0f;
        if (this.F0 < 0.0f) {
        }
        this.n0 = true;
        this.K0 = Math.max(0.0f, f61 - min4);
        if (!Float.isNaN(this.H0)) {
            this.H0 = Float.NaN;
        }
        boolean isNaN2 = Float.isNaN(this.H0);
        float f652 = this.K0;
        if (!isNaN2) {
        }
        if (this.L0) {
        }
        this.s0 = a;
        float f662 = this.o0;
        float f672 = this.q0;
        float f682 = f672 - this.r0;
        float f692 = max4;
        float f702 = this.p0;
        RectF rectF52 = this.j0;
        rectF52.set(f662, f682, f702, f672);
        min = Math.min(hl.L(22.0f), this.r0 / 2.0f);
        float f712 = this.W;
        float B22 = xnb.B(f712, 2.0f, 3.0f, f712 * f712);
        this.E3 = a(this.E3, (this.R || !lycVar3.C()) ? 0.0f : 1.0f, f4, 0.04f);
        if (!this.R) {
        }
        canvas.save();
        float B32 = xnb.B(this.e0, 0.015f, 1.0f, (B22 * 0.06f) + 0.94f);
        if (this.R) {
        }
        if (this.I == null) {
        }
        this.t2 = a(this.t2, !this.q2 ? 1.0f : 0.0f, f4, 0.12f);
        if (this.T2) {
        }
        f6 = min;
        long j82 = this.V2 + ((long) (this.W2 * 0.87f));
        w = qu6.w(uptimeMillis - j82, 580.0f, 1.0f, 0.0f);
        float f732 = this.X2;
        if (uptimeMillis >= j82) {
        }
        this.X2 = max5;
        if (w >= 1.0f) {
        }
        f7 = max5;
        max = Math.max(this.b0, Math.max(this.t2, f7) * 0.85f) * f72;
        if (this.M) {
        }
        if (!this.T2) {
        }
        if (max > 0.002f) {
        }
        float f7422 = rectF52.left + f2;
        lycVar3.J(f7422, rectF52.top + f60, Math.min(rectF52.right - f3, this.a1 + f7422), rectF52.bottom - f60);
        arrayList = this.g1;
        if (z) {
        }
        arrayList2 = arrayList;
        rectF2 = rectF52;
        f15 = f14;
        j3 = j2;
        kncVar = this;
        lycVar = lycVar3;
        f16 = f72;
        mvaVar = kncVar.R2;
        if (mvaVar.E > 0) {
        }
        if (kncVar.T2) {
        }
        z3 = kncVar.q2;
        if (z3) {
        }
        f17 = f9;
        kncVar.f2 = a(kncVar.f2, z3 ? 1.0f : 0.0f, f17, 0.09f);
        z4 = z2;
        float a322 = a(kncVar.U0, (kncVar.T || !z4) ? 0.0f : 1.0f, f17, 0.06f);
        kncVar.U0 = a322;
        f18 = kncVar.a0;
        RectF rectF622 = kncVar.l0;
        if (f18 <= 0.0f) {
        }
        if (!kncVar.H3) {
        }
        canvas2.restore();
        if (kncVar.a0 > 0.0f) {
        }
        lycVar2.G(kncVar.R ? 1.0f : B22 * B22);
        kncVar.q1 = false;
        if (kncVar.a0 > 0.0f) {
        }
        kncVar.k0.setEmpty();
        kncVar.G1 = a(kncVar.G1, (kncVar.R || !lycVar2.z()) ? 0.0f : 1.0f, f17, 0.1f);
        kncVar.H1 = a(kncVar.H1, kncVar.f0 == 6 ? 1.0f : 0.0f, f17, 0.05f);
        kncVar.I1 = a(kncVar.I1, kncVar.f0 == 7 ? 1.0f : 0.0f, f17, 0.05f);
        kncVar.J1 = a(kncVar.J1, kncVar.f0 == 8 ? 1.0f : 0.0f, f17, 0.05f);
        f19 = kncVar.G1;
        if (f19 > 0.01f) {
        }
        if (kncVar.W >= 1.0f) {
        }
        kncVar.postInvalidateOnAnimation();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        byte b;
        int actionMasked = motionEvent.getActionMasked();
        gnc gncVar = this.F3;
        byte b2 = 3;
        byte b3 = 0;
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                removeCallbacks(gncVar);
                int i = this.f0;
                if (i == 3) {
                    i = 2;
                }
                this.f0 = -1;
                if (this.L0) {
                    this.L0 = false;
                    invalidate();
                    return true;
                }
                invalidate();
                if (i >= 0 && p(motionEvent.getX(), motionEvent.getY()) == i) {
                    performHapticFeedback(3);
                    lyc lycVar = this.a;
                    if (i == 0) {
                        lycVar.I();
                        return true;
                    }
                    if (i == 1) {
                        snc sncVar = (snc) lycVar.e;
                        c cVar = sncVar.b;
                        zu1 zu1Var = cVar.a.E3;
                        if (zu1Var != null && zu1Var.y()) {
                            return true;
                        }
                        ChatActivityEnterView chatActivityEnterView = cVar.a;
                        int i2 = ChatActivityEnterView.X7;
                        ArrayList N = chatActivityEnterView.D0().N();
                        sncVar.m(N.isEmpty() ? dm3.c : N.get(0));
                        return true;
                    }
                    byte b4 = 4;
                    if (i == 4) {
                        snc sncVar2 = (snc) lycVar.e;
                        if (sncVar2.L != null && !sncVar2.n.trim().isEmpty()) {
                            c cVar2 = sncVar2.b;
                            knc kncVar = sncVar2.L;
                            sh9 sh9Var = new sh9(lycVar, (byte) 26);
                            ChatActivityEnterView chatActivityEnterView2 = cVar2.a;
                            wma wmaVar = chatActivityEnterView2.b2;
                            RectF rectF = new RectF();
                            rectF.set(kncVar.k0);
                            if (!rectF.isEmpty() && wmaVar != null) {
                                FrameLayout frameLayout = new FrameLayout(chatActivityEnterView2.getContext());
                                wmaVar.addView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
                                ey1 ey1Var = new ey1(chatActivityEnterView2.getContext(), kncVar, (byte) 1);
                                frameLayout.addView(ey1Var, new FrameLayout.LayoutParams((int) rectF.width(), (int) rectF.height(), 51));
                                frameLayout.post(new z87((Object) cVar2, (Object) kncVar, (Object) frameLayout, (Object) ey1Var, (Object) rectF, (Object) sh9Var, (byte) 8));
                                return true;
                            }
                        }
                    } else if (i == 5) {
                        snc sncVar3 = (snc) lycVar.e;
                        if (sncVar3.i0 != null && !sncVar3.k0) {
                            Log.d("VoiceLive", "field: back to the text before the style");
                            if (sncVar3.j0) {
                                sncVar3.g0 = sncVar3.i0;
                                sncVar3.h0 = sncVar3.b().size();
                            } else {
                                sncVar3.g0 = null;
                            }
                            sncVar3.i0 = null;
                            knc kncVar2 = sncVar3.L;
                            if (kncVar2 != null) {
                                kncVar2.setRevertShown(false);
                                sncVar3.L.setRebuildNext(true);
                            }
                            sncVar3.q();
                            knc kncVar3 = sncVar3.L;
                            if (kncVar3 != null) {
                                kncVar3.setRebuildNext(false);
                                return true;
                            }
                        }
                    } else if (i == 6) {
                        snc sncVar4 = (snc) lycVar.e;
                        if (sncVar4.L != null && ((b = sncVar4.c) == 2 || b == 4)) {
                            String[] I = DictationAsr.I();
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(ob6.M0(2131744990, null));
                            boolean y = DictationAsr.y();
                            int i3 = y ? 0 : -1;
                            for (int i4 = 0; i4 < I.length; i4++) {
                                arrayList.add(bn3.t(I[i4]));
                                if (!y && i3 < 0 && DictationAsr.A(I[i4])) {
                                    i3 = i4 + 1;
                                }
                            }
                            nnc nncVar = new nnc(sncVar4, I, b3);
                            c cVar3 = sncVar4.b;
                            knc kncVar4 = sncVar4.L;
                            ArrayList x = snc.x(I, y, nncVar);
                            ChatActivityEnterView chatActivityEnterView3 = cVar3.a;
                            wma wmaVar2 = chatActivityEnterView3.b2;
                            RectF rectF2 = new RectF();
                            rectF2.set(kncVar4.O1);
                            if (!rectF2.isEmpty() && wmaVar2 != null) {
                                FrameLayout frameLayout2 = new FrameLayout(chatActivityEnterView3.getContext());
                                wmaVar2.addView(frameLayout2, new FrameLayout.LayoutParams(-1, -1));
                                ey1 ey1Var2 = new ey1(chatActivityEnterView3.getContext(), kncVar4, (byte) 0);
                                frameLayout2.addView(ey1Var2, new FrameLayout.LayoutParams((int) rectF2.width(), (int) rectF2.height(), 51));
                                frameLayout2.post(new zx1(cVar3, kncVar4, frameLayout2, ey1Var2, rectF2, arrayList, x, i3, nncVar));
                                return true;
                            }
                        }
                    } else if (i == 7) {
                        snc sncVar5 = (snc) lycVar.e;
                        c cVar4 = sncVar5.b;
                        byte b5 = sncVar5.c;
                        if (b5 == 4) {
                            sncVar5.u();
                            zu1 zu1Var2 = cVar4.a.E3;
                            if (zu1Var2 != null) {
                                zu1Var2.presentFragment(new woa());
                                return true;
                            }
                        } else if (b5 == 2) {
                            cVar4.e();
                            hl.d3(new lnc(sncVar5, b2), 300L);
                            return true;
                        }
                    } else {
                        if (i == 8) {
                            lycVar.I();
                            return true;
                        }
                        snc sncVar6 = (snc) lycVar.e;
                        c cVar5 = sncVar6.b;
                        if (sncVar6.L != null && sncVar6.c != 0) {
                            ChatActivityEnterView chatActivityEnterView4 = cVar5.a;
                            ChatActivityEnterView chatActivityEnterView5 = cVar5.a;
                            wma wmaVar3 = chatActivityEnterView4.b2;
                            if (wmaVar3 != null) {
                                m7 m7Var = sncVar6.Y;
                                if (m7Var != null) {
                                    m7Var.requestFocus();
                                    hl.E3(sncVar6.Y);
                                    return true;
                                }
                                vnb vnbVar = chatActivityEnterView4.K4;
                                m7 m7Var2 = new m7((byte) 10, sncVar6.a, sncVar6);
                                m7Var2.setBackground(null);
                                m7Var2.setPadding(0, 0, 0, 0);
                                m7Var2.setIncludeFontPadding(false);
                                tx1 tx1Var = chatActivityEnterView5.F0;
                                m7Var2.setTextSize(0, tx1Var != null ? tx1Var.getTextSize() : hl.L(18.0f));
                                m7Var2.setTextColor(aob.v0(aob.Le, vnbVar));
                                int i5 = aob.Ne;
                                int i6 = ChatActivityEnterView.X7;
                                m7Var2.setCursorColor(chatActivityEnterView5.J0(i5) | (-16777216));
                                yob.C(m7Var2, aob.lg, vnbVar);
                                yob.l(m7Var2, 36, aob.mg, vnbVar);
                                m7Var2.setCursorSize(hl.L(20.0f));
                                m7Var2.setCursorWidth(2.0f);
                                m7Var2.setGravity(51);
                                m7Var2.setVerticalFadingEdgeEnabled(true);
                                m7Var2.setFadingEdgeLength(hl.L(18.0f));
                                m7Var2.setInputType(147457);
                                m7Var2.setImeOptions(TLObject.FLAG_28);
                                m7Var2.setText(sncVar6.n);
                                m7Var2.setSelection(m7Var2.length());
                                int size = sncVar6.b().size();
                                sncVar6.d0 = size;
                                sncVar6.Z = size;
                                sncVar6.a0 = m7Var2.length();
                                sncVar6.c0 = "";
                                m7Var2.addTextChangedListener(new nh6(sncVar6, (byte) 24));
                                wmaVar3.addView(m7Var2, sncVar6.L.getParent() == wmaVar3 ? wmaVar3.indexOfChild(sncVar6.L) + 1 : wmaVar3.getChildCount(), new FrameLayout.LayoutParams(1, 1, 51));
                                sncVar6.Y = m7Var2;
                                m7Var2.requestFocus();
                                hl.d3(new slc(sncVar6, m7Var2, b4), 50L);
                                StringBuilder sb = new StringBuilder("field: editing in place (");
                                sb.append(sncVar6.n.length());
                                sb.append(" chars, recording ");
                                sb.append(sncVar6.c == 2 ? "on" : "paused");
                                sb.append(")");
                                Log.d("VoiceLive", sb.toString());
                                sncVar6.L.invalidate();
                            }
                        }
                    }
                }
            } else if (actionMasked == 2) {
                int i7 = this.f0;
                if ((i7 == 2 || i7 == 3 || this.L0) && this.K0 > 0.0f) {
                    float y2 = motionEvent.getY() - this.I0;
                    if (!this.L0 && Math.abs(y2) > this.M0) {
                        this.L0 = true;
                        this.I0 = motionEvent.getY();
                        this.J0 = this.s0;
                        this.f0 = -1;
                    }
                    if (this.L0) {
                        this.H0 = Math.max(0.0f, Math.min(this.K0, this.J0 - (motionEvent.getY() - this.I0)));
                        invalidate();
                        return true;
                    }
                }
                int i8 = this.f0;
                if (i8 >= 0 && i8 != 3 && p(motionEvent.getX(), motionEvent.getY()) != this.f0) {
                    removeCallbacks(gncVar);
                    this.f0 = -1;
                    invalidate();
                    return true;
                }
            } else if (actionMasked == 3) {
                removeCallbacks(gncVar);
                this.f0 = -1;
                this.L0 = false;
                invalidate();
                return true;
            }
            return true;
        }
        this.L0 = false;
        int p = p(motionEvent.getX(), motionEvent.getY());
        this.f0 = p;
        if (p >= 0) {
            if (getParent() != null) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            this.I0 = motionEvent.getY();
            this.J0 = this.s0;
            int i9 = this.f0;
            if (i9 != 2 || this.T) {
                b2 = i9;
            } else {
                this.f0 = 3;
            }
            if (b2 == 0) {
                postDelayed(gncVar, ViewConfiguration.getLongPressTimeout());
            }
            invalidate();
            return true;
        }
        return false;
    }

    public final int p(float f, float f2) {
        if (!this.R || this.W < 0.6f || this.E3 > 0.3f) {
            return -1;
        }
        float L = hl.L(6.0f);
        if (this.G1 > 0.7f) {
            RectF rectF = this.P1;
            if (!rectF.isEmpty() && f >= rectF.left - L && f < rectF.right + hl.L(4.0f) && f2 >= rectF.top - L && f2 <= rectF.bottom + L) {
                return 7;
            }
            if (!this.T) {
                RectF rectF2 = this.O1;
                if (!rectF2.isEmpty() && !this.N1 && f >= rectF2.left - hl.L(4.0f) && f < rectF2.right + hl.L(4.0f) && f2 >= rectF2.top - L && f2 <= rectF2.bottom + L) {
                    return 6;
                }
            }
            if (this.K1 > 0.7f && !this.T) {
                RectF rectF3 = this.Q1;
                if (!rectF3.isEmpty() && f >= rectF3.left - hl.L(4.0f) && f <= rectF3.right + L && f2 >= rectF3.top - L && f2 <= rectF3.bottom + L) {
                    return 8;
                }
            }
        }
        if (this.a0 > 0.7f && this.U0 > 0.7f && !this.q2) {
            RectF rectF4 = this.l0;
            if (!rectF4.isEmpty() && f >= rectF4.left - L && f <= rectF4.right + L && f2 >= rectF4.top - L && f2 <= rectF4.bottom + L) {
                return 0;
            }
        }
        RectF rectF5 = this.w2;
        if (!rectF5.isEmpty() && this.u2 > 0.7f && f >= rectF5.left - L && f <= rectF5.right + L && f2 >= rectF5.top - L && f2 <= rectF5.bottom + L) {
            return 5;
        }
        boolean z = this.q2;
        RectF rectF6 = this.k0;
        if (z && !rectF6.isEmpty() && rectF6.contains(f, f2)) {
            return -1;
        }
        return (this.a0 <= 0.7f || rectF6.isEmpty() || f < rectF6.left - L || f > rectF6.right + L || f2 < rectF6.top - L || f2 > rectF6.bottom + L) ? this.j0.contains(f, f2) ? 2 : -1 : f >= this.w1 ? 4 : 1;
    }

    public final boolean q(jnc jncVar) {
        ArrayList arrayList = this.L2;
        int indexOf = arrayList.indexOf(jncVar) + 1;
        jnc jncVar2 = indexOf < arrayList.size() ? (jnc) arrayList.get(indexOf) : null;
        return jncVar2 == null || !jncVar2.b || Math.abs(jncVar2.f - jncVar.f) >= 1.0f;
    }

    public final boolean r(jnc jncVar) {
        ArrayList arrayList = this.L2;
        int indexOf = arrayList.indexOf(jncVar);
        jnc jncVar2 = indexOf > 0 ? (jnc) arrayList.get(indexOf - 1) : null;
        return jncVar2 == null || !jncVar2.b || Math.abs(jncVar2.f - jncVar.f) >= 1.0f;
    }

    public final float s() {
        float f = this.L1;
        if (f <= 0.0f) {
            String str = this.F1;
            if (str == null) {
                str = this.A1;
            }
            f = this.n.measureText(str);
        }
        return hl.L(6.0f) + hl.L(18.0f) + hl.L(12.0f) + f + hl.L(8.0f) + hl.L(8.0f) + hl.L(13.0f);
    }

    public void setBusy(boolean z) {
        if (this.q2 == z) {
            return;
        }
        this.q2 = z;
        if (z) {
            this.s2 = SystemClock.uptimeMillis();
        }
        invalidate();
    }

    public void setDetected(String[] strArr) {
        this.e2 = strArr;
        invalidate();
    }

    public void setLanguage(CharSequence charSequence) {
        String charSequence2 = charSequence == null ? null : charSequence.toString();
        this.B1 = charSequence2;
        int lastIndexOf = (charSequence2 == null || !charSequence2.endsWith(")")) ? -1 : this.B1.lastIndexOf(" (");
        this.E1 = lastIndexOf > 0 ? this.B1.substring(0, lastIndexOf) : null;
        this.F1 = this.B1;
        invalidate();
    }

    public void setLanguageMenuUp(boolean z) {
        if (this.m1 == z) {
            return;
        }
        this.m1 = z;
        invalidate();
    }

    public void setLanguagePillAlpha(float f) {
        if (this.k1 == f) {
            return;
        }
        this.k1 = f;
        invalidate();
    }

    public void setLanguagePillHidden(boolean z) {
        this.N1 = z;
        invalidate();
    }

    public void setLevel(float f) {
        this.U = Math.max(0.0f, Math.min(1.0f, f));
    }

    public void setListening(boolean z) {
        this.S = z;
        invalidate();
    }

    public void setPaused(boolean z) {
        if (this.T != z) {
            this.D0 = SystemClock.uptimeMillis();
        }
        this.T = z;
        invalidate();
    }

    public void setPillAlpha(float f) {
        if (this.l1 == f) {
            return;
        }
        this.l1 = f;
        invalidate();
    }

    public void setPillHidden(boolean z) {
        this.x1 = z;
        invalidate();
    }

    public void setPlaceholder(String str) {
        if (Objects.equals(str, this.C1)) {
            return;
        }
        this.C1 = str;
        rx rxVar = this.D1;
        if (rxVar == null) {
            if (str == null) {
                return;
            }
            rxVar = new rx((View) this);
            this.D1 = rxVar;
        }
        rxVar.i(str, true);
        invalidate();
    }

    public void setRebuildNext(boolean z) {
        this.S2 = z;
    }

    public void setRevertShown(boolean z) {
        this.r2 = z;
        invalidate();
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void u(boolean z, float f) {
        int i;
        ArrayList arrayList;
        int i2;
        int i3 = -1;
        int i4 = 0;
        int i5 = -1;
        while (true) {
            arrayList = this.L2;
            if (i >= arrayList.size()) {
                break;
            }
            jnc jncVar = (jnc) arrayList.get(i);
            if (z) {
                i = jncVar.b ? i + 1 : 0;
                if (i3 < 0) {
                    i3 = i;
                }
                i5 = i;
            } else {
                if (jncVar.c) {
                }
                if (i3 < 0) {
                }
                i5 = i;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (0; i2 < arrayList.size(); i2 + 1) {
            jnc jncVar2 = (jnc) arrayList.get(i2);
            if (z) {
                i2 = jncVar2.b ? 0 : i2 + 1;
                if (i5 >= 0 || i2 < i5) {
                    arrayList2.add(jncVar2);
                }
            } else {
                if (!jncVar2.c) {
                }
                if (i5 >= 0) {
                }
                arrayList2.add(jncVar2);
            }
        }
        for (int size = arrayList.size() - 1; size > i5 && i5 >= 0; size--) {
            ((jnc) arrayList.get(size)).m = true;
            arrayList2.add((jnc) arrayList.get(size));
        }
        int size2 = arrayList2.size();
        int i6 = 0;
        int i7 = 0;
        while (i7 < size2) {
            Object obj = arrayList2.get(i7);
            i7++;
            if (I((jnc) obj, z)) {
                i6++;
            }
        }
        int size3 = arrayList2.size();
        int i8 = 0;
        while (i8 < size3) {
            Object obj2 = arrayList2.get(i8);
            i8++;
            jnc jncVar3 = (jnc) obj2;
            jncVar3.j = c00.B(i4, Math.max(1, i6), 0.16f, f);
            if (I(jncVar3, z)) {
                i4++;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x011d, code lost:
    
        if (r2 != null) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(StaticLayout staticLayout, StaticLayout staticLayout2) {
        this.T2 = false;
        Bitmap bitmap = this.i3;
        Bitmap bitmap2 = null;
        if (bitmap != null) {
            bitmap.recycle();
            this.i3 = null;
        }
        if (staticLayout == null || staticLayout2 == null || !this.n0 || staticLayout.getWidth() <= 0 || staticLayout.getHeight() <= 0) {
            return;
        }
        LinearGradient linearGradient = this.x3;
        Paint paint = this.w3;
        if (linearGradient == null) {
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            this.x3 = new LinearGradient(0.0f, 0.0f, 1.0f, 0.0f, 0, -16777216, tileMode);
            this.y3 = new LinearGradient(0.0f, 0.0f, 1.0f, 0.0f, -16777216, 0, tileMode);
            this.z3 = new LinearGradient(0.0f, 0.0f, 1.0f, 0.0f, 16777215, -1, tileMode);
            this.v3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_ATOP));
        }
        paint.setColorFilter(new PorterDuffColorFilter(gn3.e(this.M ? -7358721 : -15363160), PorterDuff.Mode.SRC_IN));
        this.a3 = this.e3;
        this.b3 = this.f3;
        this.c3 = this.g3;
        this.d3 = Math.max(1.0f, this.h3);
        try {
            int width = staticLayout.getWidth() + hl.L(4.0f);
            int height = staticLayout.getHeight() + 2;
            Bitmap.Config config = Bitmap.Config.ARGB_8888;
            this.i3 = Bitmap.createBitmap(width, height, config);
            TextPaint textPaint = this.d;
            textPaint.setAlpha(jn7.d4);
            float f = this.a3;
            this.p3 = f - ((float) Math.floor(f));
            float f2 = this.b3;
            this.q3 = f2 - ((float) Math.floor(f2));
            Canvas canvas = new Canvas(this.i3);
            canvas.translate(this.p3, this.q3);
            E(SystemClock.uptimeMillis());
            staticLayout.draw(canvas);
            textPaint.setShader(null);
            this.t3 = this.q2;
            this.l3 = z(1100, this.i3, true);
            this.m3 = 0;
            try {
                bitmap2 = Bitmap.createBitmap(staticLayout2.getWidth() + hl.L(4.0f), Math.max(1, staticLayout2.getHeight()), config);
                staticLayout2.draw(new Canvas(bitmap2));
                this.m3 = z(1000, bitmap2, false);
            } catch (Throwable unused) {
            }
            bitmap2.recycle();
            RectF rectF = this.j0;
            float width2 = rectF.width();
            float centerY = rectF.centerY() - this.b3;
            float f3 = rectF.left;
            float f4 = this.a3;
            float f5 = centerY * 0.9f;
            this.Y2 = ((f3 - (0.35f * width2)) - f4) + f5;
            this.Z2 = (((width2 * 1.35f) + f3) - f4) + f5;
            this.W2 = Math.max(800L, Math.min(1200L, (Math.max(staticLayout.getLineCount(), staticLayout2.getLineCount()) * 70) + 700));
            float B = B(this.c3 * 0.9f);
            this.r3 = B;
            this.s3 = Math.max(B + 0.12f, B(((this.c3 + this.d3) * 0.9f) + staticLayout.getWidth()) + 0.06f);
            this.o3 = 0;
            this.n3 = 0;
            mva mvaVar = this.R2;
            mvaVar.a();
            mvaVar.e(this.M);
            mvaVar.b = gn3.k(this.M);
            mvaVar.R = hl.L(10.0f);
            this.V2 = SystemClock.uptimeMillis();
            float f6 = this.t2;
            if (f6 > 0.05f) {
                this.X2 = Math.max(this.X2, f6);
            }
            this.T2 = true;
        } catch (Throwable unused2) {
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.G || super.verifyDrawable(drawable);
    }

    public final void w(Canvas canvas, long j, float f, float f2, float f3, float f4, float f5) {
        float f6;
        mva mvaVar;
        float f7 = (j - this.V2) / 1000.0f;
        float x = x(f7);
        float x2 = x(f7 - 0.06f);
        float L = hl.L(22.0f);
        float f8 = -hl.L(8.0f);
        float L2 = hl.L(8.0f) + this.Q0.getWidth();
        float f9 = -hl.L(40.0f);
        float L4 = hl.L(40.0f) + this.Q0.getHeight();
        canvas.save();
        canvas.translate(f, f2);
        int saveLayer = canvas.saveLayer(f8, f9, L2, L4, null);
        int i = (int) (255.0f * f3);
        this.d.setAlpha(i);
        this.Q0.draw(canvas);
        y(this.z3, x2 - hl.L(48.0f), x2);
        LinearGradient linearGradient = this.z3;
        Paint paint = this.w3;
        paint.setShader(linearGradient);
        canvas.drawRect(f8, f9, L2, L4, paint);
        y(this.y3, x2 - L, x2);
        LinearGradient linearGradient2 = this.y3;
        Paint paint2 = this.v3;
        paint2.setShader(linearGradient2);
        canvas.drawRect(f8, f9, L2, L4, paint2);
        canvas.restoreToCount(saveLayer);
        canvas.restore();
        if (this.i3 == null || x - L >= this.Z2) {
            f6 = 2.0f;
        } else {
            canvas.save();
            canvas.translate(this.a3, this.b3);
            float max = Math.max(L2, this.i3.getWidth());
            f6 = 2.0f;
            int saveLayer2 = canvas.saveLayer(f8, this.c3 - hl.L(2.0f), max, this.c3 + this.d3 + hl.L(2.0f), null);
            Paint paint3 = this.u3;
            paint3.setAlpha(i);
            canvas.drawBitmap(this.i3, -this.p3, -this.q3, paint3);
            y(this.x3, x, L + x);
            paint2.setShader(this.x3);
            canvas.drawRect(f8, f9, max, Math.max(L4, hl.L(40.0f) + this.i3.getHeight()), paint2);
            canvas.restoreToCount(saveLayer2);
            canvas.restore();
        }
        float f10 = hl.p;
        long j2 = this.W2;
        float max2 = Math.max(0.05f, Math.min(j2, j2 - (j - this.V2)) / 1000.0f);
        while (true) {
            int i2 = this.n3;
            int i3 = this.l3;
            mvaVar = this.R2;
            if (i2 >= i3) {
                break;
            }
            float[] fArr = this.j3;
            int i4 = i2 * 3;
            if (fArr[i4 + 2] > x) {
                break;
            }
            mvaVar.h(this.a3 + fArr[i4], this.b3 + fArr[i4 + 1], ((mvaVar.d() * 34.0f) + 10.0f) * f10, (-((mvaVar.d() * 20.0f) + 6.0f)) * f10, Math.min(max2, (mvaVar.d() * 0.3f) + 0.26f), 0.0f);
            this.n3++;
        }
        float f11 = f4 - f2;
        while (true) {
            int i5 = this.o3;
            if (i5 >= this.m3) {
                break;
            }
            float[] fArr2 = this.k3;
            int i6 = i5 * 3;
            if (fArr2[i6 + 2] > x) {
                break;
            }
            this.o3 = i5 + 1;
            float f12 = fArr2[i6 + 1];
            if (f12 >= f11 - hl.L(f6) && f12 <= f11 + f5 + hl.L(f6)) {
                float f13 = f + this.k3[i6];
                float f14 = f2 + f12;
                mvaVar.i((((mvaVar.d() * 16.0f) + 6.0f) * f10) + f13, ((mvaVar.d() - 0.5f) * 14.0f * f10) + f14, f13, f14, Math.min(max2, (mvaVar.d() * 0.08f) + 0.099999994f));
            }
        }
        if (f7 * 1000.0f >= this.W2) {
            this.T2 = false;
            Bitmap bitmap = this.i3;
            if (bitmap != null) {
                bitmap.recycle();
                this.i3 = null;
            }
        }
    }

    public final float x(float f) {
        float interpolation = U3.getInterpolation(Math.max(0.0f, Math.min(1.0f, (f * 1000.0f) / (this.W2 - 60.0f))));
        float f2 = this.Y2;
        return qd4.A(this.Z2, f2, interpolation, f2);
    }

    public final void y(LinearGradient linearGradient, float f, float f2) {
        float f3 = f / 1.3453624f;
        Matrix matrix = this.A3;
        matrix.reset();
        matrix.setScale(Math.max(0.01f, (f2 / 1.3453624f) - f3), 1.0f);
        matrix.postRotate(41.987213f);
        matrix.postTranslate(0.7432941f * f3, f3 * 0.6689647f);
        linearGradient.setLocalMatrix(matrix);
    }

    public final int z(int i, Bitmap bitmap, boolean z) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int[] iArr = new int[width * height];
        bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
        int max = Math.max(1, Math.round(hl.p * 0.8f));
        int i2 = 0;
        for (int i3 = 0; i3 < height; i3 += max) {
            if (z) {
                float f = i3;
                float f2 = this.c3;
                float f3 = max;
                if (f >= f2 - f3) {
                    if (f > f2 + this.d3 + f3) {
                    }
                }
            }
            for (int i4 = 0; i4 < width; i4 += max) {
                if ((iArr[(i3 * width) + i4] >>> 24) > 90) {
                    i2++;
                }
            }
        }
        float f4 = i2 > i ? i / i2 : 1.0f;
        int min = Math.min(i2, i + 32) * 3;
        float[] fArr = z ? this.j3 : this.k3;
        if (fArr.length < min) {
            fArr = new float[min];
        }
        int i5 = 0;
        for (int i6 = 0; i6 < height; i6 += max) {
            if (z) {
                float f5 = i6;
                float f6 = this.c3;
                float f7 = max;
                if (f5 >= f6 - f7) {
                    if (f5 > f6 + this.d3 + f7) {
                    }
                }
            }
            for (int i7 = 0; i7 < width; i7 += max) {
                if ((iArr[(i6 * width) + i7] >>> 24) > 90) {
                    mva mvaVar = this.R2;
                    if (mvaVar.d() <= f4) {
                        int i8 = i5 + 1;
                        if (i8 * 3 <= fArr.length) {
                            float f8 = max;
                            float d = ((mvaVar.d() - 0.5f) * f8) + i7;
                            float d2 = ((mvaVar.d() - 0.5f) * f8) + i6;
                            int i9 = i5 * 3;
                            fArr[i9] = d;
                            fArr[i9 + 1] = d2;
                            fArr[i9 + 2] = (d2 * 0.9f) + d;
                            i5 = i8;
                        }
                    }
                }
            }
        }
        Integer[] numArr = new Integer[i5];
        for (int i10 = 0; i10 < i5; i10++) {
            numArr[i10] = Integer.valueOf(i10);
        }
        Arrays.sort(numArr, new gm3(fArr, (byte) 4));
        float[] copyOf = Arrays.copyOf(fArr, i5 * 3);
        for (int i11 = 0; i11 < i5; i11++) {
            int i12 = i11 * 3;
            int intValue = numArr[i11].intValue() * 3;
            fArr[i12] = copyOf[intValue];
            fArr[i12 + 1] = copyOf[intValue + 1];
            fArr[i12 + 2] = copyOf[intValue + 2];
        }
        if (z) {
            this.j3 = fArr;
            return i5;
        }
        this.k3 = fArr;
        return i5;
    }
}
