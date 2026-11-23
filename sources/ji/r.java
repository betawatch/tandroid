package ji;

import ai.c1;
import ai.j2;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.RecordingCanvas;
import android.graphics.RectF;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.SystemClock;
import android.text.Layout;
import android.text.SpannableString;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.Log;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;
import com.google.android.gms.internal.vision.e2;
import java.util.ArrayList;
import java.util.Random;
import n2.a0;
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.f3;
import org.telegram.messenger.g0;
import org.telegram.messenger.hd;
import org.telegram.messenger.o10;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Cells.c0;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.p5;
import org.telegram.ui.Components.rg;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes4.dex */
public final class r extends View {
    public static int X1;
    public static int Y1;
    public static float Z1;
    public static long b2;
    public boolean A0;
    public boolean A1;
    public float B0;
    public long B1;
    public float C0;
    public long C1;
    public float D0;
    public StaticLayout D1;
    public final LinearGradient E;
    public float E0;
    public final ArrayList E1;
    public final Matrix F;
    public float F0;
    public final Paint F1;
    public final Drawable G;
    public float G0;
    public final Paint G1;
    public final Drawable H;
    public float H0;
    public final Path H1;
    public final String I;
    public float I0;
    public final Paint I1;
    public final String J;
    public float J0;
    public final RectF J1;
    public Drawable K;
    public boolean K0;
    public final Paint K1;
    public final String L;
    public boolean L0;
    public final Path L1;
    public String M;
    public boolean M0;
    public final Paint M1;
    public final String N;
    public float N0;
    public final Paint N1;
    public String O;
    public float O0;
    public float O1;
    public float P;
    public boolean P0;
    public boolean P1;
    public float Q;
    public float Q0;
    public float Q1;
    public final RectF R;
    public long R0;
    public Paint R1;
    public final RectF S;
    public long S0;
    public Paint S1;
    public final RectF T;
    public float T0;
    public float T1;
    public Drawable U;
    public boolean U0;
    public Drawable V;
    public float V0;
    public boolean W;
    public float W0;
    public float X0;
    public float Y0;
    public boolean Z0;
    public final o a;
    public boolean a0;
    public float a1;
    public final h6 b;
    public Paint b0;
    public float b1;
    public final TextPaint c;
    public Object c0;
    public int c1;
    public final TextPaint d;
    public Object d0;
    public final RectF d1;
    public final TextPaint e;
    public float e0;
    public final RectF e1;
    public final Paint f;
    public long f0;
    public final RectF f1;
    public boolean g0;
    public final RectF g1;
    public final Paint h;
    public int h0;
    public final RectF h1;
    public int i0;
    public final RectF i1;
    public boolean j0;
    public float j1;
    public String k0;
    public float k1;
    public StaticLayout l0;
    public int l1;
    public StaticLayout m0;
    public final float[] m1;
    public final Paint n;
    public int n0;
    public final RectF n1;
    public final ArrayList o0;
    public float o1;
    public boolean p0;
    public Drawable p1;
    public boolean q0;
    public float q1;
    public int r;
    public long r0;
    public float r1;
    public final Paint s;
    public long s0;
    public float s1;
    public long t0;
    public boolean t1;
    public float u0;
    public boolean u1;
    public float v0;
    public VelocityTracker v1;
    public final Paint w;
    public float w0;
    public final int w1;
    public final Paint x;
    public float x0;
    public String x1;
    public final Paint y;
    public float y0;
    public int y1;
    public float z0;
    public boolean z1;
    public static final nr U1 = new nr(0.4d, 0.0d, 0.2d, 1.0d);
    public static final nr V1 = nr.h;
    public static final nr W1 = new nr(0.4d, 0.0d, 1.0d, 1.0d);
    public static final OvershootInterpolator a2 = new OvershootInterpolator(1.3f);

    static {
        new nr(0.3d, 0.0d, 0.1d, 1.0d);
    }

    public r(Context context, h6 h6Var, o oVar) {
        super(context);
        TextPaint textPaint = new TextPaint(1);
        this.c = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.d = textPaint2;
        TextPaint textPaint3 = new TextPaint(1);
        this.e = textPaint3;
        this.f = new Paint();
        this.h = new Paint(1);
        this.n = new Paint(1);
        Paint paint = new Paint(1);
        this.s = paint;
        this.w = new Paint(1);
        this.x = new Paint(1);
        Paint paint2 = new Paint(1);
        this.y = paint2;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, new int[]{-603979776, -1073741824, TLObject.FLAG_31, 939524096, 201326592, 0}, new float[]{0.0f, 0.18f, 0.42f, 0.66f, 0.86f, 1.0f}, Shader.TileMode.CLAMP);
        this.E = linearGradient;
        this.F = new Matrix();
        String N0 = hd.N0(2131745054, null);
        this.L = N0;
        this.M = N0;
        this.N = hd.N0(2131745065, null);
        this.R = new RectF();
        this.S = new RectF();
        this.T = new RectF();
        new Matrix();
        this.e0 = -1.0f;
        this.i0 = -12939291;
        this.k0 = "";
        this.o0 = new ArrayList();
        this.A0 = true;
        this.G0 = -1.0f;
        this.H0 = -1.0f;
        this.J0 = -1.0f;
        this.Q0 = -1.0f;
        this.U0 = true;
        this.Z0 = true;
        this.a1 = 1.0f;
        this.c1 = -1;
        this.d1 = new RectF();
        this.e1 = new RectF();
        this.f1 = new RectF();
        this.g1 = new RectF();
        this.h1 = new RectF();
        this.i1 = new RectF();
        this.k1 = 1.0f;
        this.l1 = -1;
        this.m1 = new float[6];
        this.n1 = new RectF();
        this.y1 = -1;
        new RectF();
        this.E1 = new ArrayList();
        this.F1 = new Paint(1);
        this.G1 = new Paint();
        this.H1 = new Path();
        this.I1 = new Paint(1);
        this.J1 = new RectF();
        this.K1 = new Paint(1);
        new Paint(1);
        this.L1 = new Path();
        this.M1 = new Paint(1);
        this.N1 = new Paint(1);
        this.T1 = 1.0f;
        this.b = h6Var;
        this.a = oVar;
        this.w1 = ViewConfiguration.get(context).getScaledTouchSlop();
        textPaint.setTextSize(g0.L(21.0f));
        textPaint2.setTextSize(g0.L(21.0f));
        textPaint3.setTextSize(g0.L(14.0f));
        textPaint3.setTypeface(g0.o());
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(g0.N(0.66f));
        paint2.setShader(linearGradient);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.G = context.getResources().getDrawable(R.drawable.msg_edit).mutate();
        this.H = i5.c.g(context, R.drawable.send_plane_24);
        this.I = hd.N0(2131751323, null);
        this.J = hd.N0(2131745036, null);
        setVisibility(8);
    }

    public static float b(float f10) {
        if (f10 < 0.0f) {
            return 0.0f;
        }
        if (f10 > 1.0f) {
            return 1.0f;
        }
        return f10;
    }

    public static float c(int i7) {
        return Math.max(g0.L(28.0f), (i7 - g0.L(560.0f)) / 2.0f);
    }

    public static float k(float f10, float f11, float f12, float f13) {
        return e2.z(1.0f, (float) Math.exp((-f11) / f13), f12 - f10, f10);
    }

    public static String p(String str) {
        StringBuilder sb2 = new StringBuilder(str.length());
        for (int i7 = 0; i7 < str.length(); i7++) {
            char charAt = str.charAt(i7);
            if (Character.isLetterOrDigit(charAt)) {
                sb2.append(Character.toLowerCase(charAt));
            }
        }
        return sb2.toString();
    }

    public final StaticLayout a(CharSequence charSequence, TextPaint textPaint) {
        return StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, this.n0).setAlignment(Layout.Alignment.ALIGN_NORMAL).setLineSpacing(g0.L(4.0f), 1.0f).setIncludePad(false).build();
    }

    public final void d(Canvas canvas) {
        Canvas canvas2;
        if (getParent() instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) getParent();
            int indexOfChild = viewGroup.indexOfChild(this);
            canvas.save();
            canvas.translate(-getLeft(), -getTop());
            int i7 = 0;
            while (i7 < indexOfChild) {
                View childAt = viewGroup.getChildAt(i7);
                if (childAt == null || childAt.getVisibility() != 0 || childAt.getAlpha() <= 0.01f || childAt.getWidth() <= 0 || childAt.getHeight() <= 0 || (childAt instanceof SurfaceView)) {
                    canvas2 = canvas;
                } else {
                    int save = canvas.save();
                    canvas.translate(childAt.getLeft(), childAt.getTop());
                    Matrix matrix = childAt.getMatrix();
                    if (!matrix.isIdentity()) {
                        canvas.concat(matrix);
                    }
                    if (childAt.getAlpha() < 0.99f) {
                        canvas2 = canvas;
                        canvas2.saveLayerAlpha(0.0f, 0.0f, childAt.getWidth(), childAt.getHeight(), (int) (childAt.getAlpha() * 255.0f));
                    } else {
                        canvas2 = canvas;
                    }
                    try {
                        childAt.draw(canvas2);
                    } catch (Throwable th2) {
                        a8.g(th2, true);
                    }
                    canvas2.restoreToCount(save);
                }
                i7++;
                canvas = canvas2;
            }
            canvas.restore();
        }
    }

    public final void e(Canvas canvas, RectF rectF, int i7, float f10) {
        i(canvas, this.I, rectF.left + g0.L(14.0f), rectF.centerY(), i7, f10);
        float centerY = rectF.centerY();
        float L = rectF.right - (g0.L(10.0f) + (g0.L(14.0f) + (g0.L(8.0f) + g0.L(1.0f))));
        Paint paint = this.w;
        paint.setColor(i7);
        paint.setAlpha((int) (35.7f * f10));
        canvas.drawRect(L, centerY - g0.L(9.0f), g0.N(1.0f) + L, centerY + g0.L(9.0f), paint);
        Path path = this.H1;
        if (path.isEmpty()) {
            path.moveTo(-g0.N(3.8f), g0.N(3.8f));
            path.lineTo(0.0f, 0.0f);
            path.lineTo(g0.N(3.8f), g0.N(3.8f));
        }
        Paint.Style style = Paint.Style.STROKE;
        Paint paint2 = this.I1;
        paint2.setStyle(style);
        paint2.setStrokeWidth(g0.N(1.75f));
        Paint.Cap cap = Paint.Cap.ROUND;
        paint2.setStrokeCap(cap);
        paint2.setStrokeJoin(Paint.Join.ROUND);
        paint2.setColor(i7);
        float f11 = f10 * 255.0f;
        int i10 = (int) f11;
        paint2.setAlpha(i10);
        float L2 = L + g0.L(1.0f) + g0.L(8.0f) + g0.L(7.0f);
        if (this.z1) {
            float L3 = g0.L(6.5f);
            Paint paint3 = this.N1;
            paint3.setStyle(style);
            paint3.setStrokeWidth(g0.N(1.75f));
            paint3.setStrokeCap(cap);
            paint3.setColor(i7);
            paint3.setAlpha((int) (f11 * 0.9f));
            RectF rectF2 = g0.P;
            rectF2.set(L2 - L3, centerY - L3, L2 + L3, centerY + L3);
            canvas.drawArc(rectF2, ((SystemClock.uptimeMillis() % 900) / 900.0f) * 360.0f, 270.0f, false, paint3);
            return;
        }
        if (this.K == null) {
            canvas.save();
            canvas.translate(L2, (centerY - g0.N(1.9f)) - g0.N(0.4f));
            canvas.drawPath(path, paint2);
            canvas.restore();
            return;
        }
        float L4 = g0.L(20.0f) / 2.0f;
        this.K.setBounds((int) (L2 - L4), (int) (centerY - L4), (int) (L2 + L4), (int) (centerY + L4));
        this.K.setAlpha(i10);
        this.K.draw(canvas);
    }

    public final void f(Canvas canvas, float f10, float f11, float f12, float f13, boolean z10, float f14) {
        Matrix matrix = this.F;
        matrix.reset();
        if (z10) {
            matrix.setScale(1.0f, -(f13 - f11));
            matrix.postTranslate(0.0f, f13);
        } else {
            matrix.setScale(1.0f, f13 - f11);
            matrix.postTranslate(0.0f, f11);
        }
        this.E.setLocalMatrix(matrix);
        Paint paint = this.y;
        paint.setAlpha((int) (f14 * 255.0f));
        canvas.drawRect(f10, f11, f12, f13, paint);
    }

    public final void g(Canvas canvas, RectF rectF, float f10, float f11, float f12) {
        canvas.save();
        float height = rectF.height() / 2.0f;
        boolean z10 = this.g0;
        RectF rectF2 = this.e1;
        Path path = this.L1;
        Paint paint = this.n;
        Paint paint2 = this.K1;
        if (z10) {
            paint.clearShadowLayer();
            if (this.d0 != null && Build.VERSION.SDK_INT >= 31 && canvas.isHardwareAccelerated()) {
                if (this.R1 == null) {
                    ColorMatrix colorMatrix = new ColorMatrix();
                    colorMatrix.setSaturation(1.7f);
                    colorMatrix.postConcat(new ColorMatrix(new float[]{0.95f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.95f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.95f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f}));
                    Paint paint3 = new Paint();
                    this.R1 = paint3;
                    paint3.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                }
                this.R1.setAlpha((int) (f11 * 255.0f));
                canvas.save();
                path.rewind();
                path.addRoundRect(rectF, height, height, Path.Direction.CW);
                canvas.clipPath(path);
                float f13 = 1.0f / f12;
                canvas.scale(f13, f13, rectF.centerX(), rectF.centerY());
                float f14 = 1.0f / this.T1;
                canvas.scale(f14, f14, rectF2.left, rectF2.centerY());
                canvas.translate(0.0f, -this.j1);
                int saveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), this.R1);
                canvas.scale(4.0f, 4.0f);
                canvas.drawRenderNode(a0.d(this.d0));
                canvas.restoreToCount(saveLayer);
                canvas.restore();
            }
            paint.setColor(m6.r1(f11 * 0.55f, -14276047));
            canvas.drawRoundRect(rectF, height, height, paint);
            paint2.setShader(null);
            Paint.Style style = Paint.Style.STROKE;
            paint2.setStyle(style);
            paint2.setStrokeWidth(g0.N(0.66f));
            paint2.setColor(m6.r1(0.12f * f11, -1));
            RectF rectF3 = g0.P;
            rectF3.set(rectF);
            rectF3.inset(g0.N(0.33f), g0.N(0.33f));
            canvas.drawRoundRect(rectF3, height, height, paint2);
            Paint paint4 = this.M1;
            paint4.setStyle(style);
            paint4.setStrokeWidth(g0.N(1.0f));
            int r12 = m6.r1(0.19f * f11, -16777216);
            int i7 = 16777215 & r12;
            paint4.setShader(new LinearGradient(rectF.left, 0.0f, rectF.right, 0.0f, new int[]{r12, i7, i7, r12}, new float[]{0.0f, Math.min(0.45f, (height / rectF.width()) * 1.1f), Math.max(0.55f, 1.0f - ((height / rectF.width()) * 1.1f)), 1.0f}, Shader.TileMode.CLAMP));
            rectF3.set(rectF);
            rectF3.inset(-g0.N(0.5f), -g0.N(0.5f));
            canvas.drawRoundRect(rectF3, g0.N(0.5f) + height, g0.N(0.5f) + height, paint4);
        } else {
            paint.clearShadowLayer();
            if (this.d0 != null && Build.VERSION.SDK_INT >= 31 && canvas.isHardwareAccelerated()) {
                if (this.S1 == null) {
                    ColorMatrix colorMatrix2 = new ColorMatrix();
                    colorMatrix2.setSaturation(1.3f);
                    colorMatrix2.postConcat(new ColorMatrix(new float[]{1.04f, 0.0f, 0.0f, 0.0f, 14.0f, 0.0f, 1.04f, 0.0f, 0.0f, 14.0f, 0.0f, 0.0f, 1.04f, 0.0f, 14.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f}));
                    Paint paint5 = new Paint();
                    this.S1 = paint5;
                    paint5.setColorFilter(new ColorMatrixColorFilter(colorMatrix2));
                }
                this.S1.setAlpha((int) (f11 * 255.0f));
                canvas.save();
                path.rewind();
                path.addRoundRect(rectF, height, height, Path.Direction.CW);
                canvas.clipPath(path);
                float f15 = 1.0f / f12;
                canvas.scale(f15, f15, rectF.centerX(), rectF.centerY());
                float f16 = 1.0f / this.T1;
                canvas.scale(f16, f16, rectF2.left, rectF2.centerY());
                canvas.translate(0.0f, -this.j1);
                int saveLayer2 = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), this.S1);
                canvas.scale(4.0f, 4.0f);
                canvas.drawRenderNode(a0.d(this.d0));
                canvas.restoreToCount(saveLayer2);
                canvas.restore();
            }
            paint.setColor(m6.r1(0.62f * f11, -1));
            canvas.drawRoundRect(rectF, height, height, paint);
            paint2.setStyle(Paint.Style.STROKE);
            paint2.setStrokeWidth(g0.N(1.0f));
            paint2.setShader(new LinearGradient(0.0f, rectF.top, 0.0f, rectF.bottom, new int[]{m6.r1(0.95f * f11, -1), m6.r1(0.25f * f11, -1), m6.r1(f11 * 0.55f, -1)}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP));
            RectF rectF4 = g0.P;
            rectF4.set(rectF);
            rectF4.inset(g0.N(0.5f), g0.N(0.5f));
            canvas.drawRoundRect(rectF4, height, height, paint2);
            paint2.setShader(null);
            paint2.setStrokeWidth(g0.N(0.66f));
            paint2.setColor(m6.r1(0.07f * f11, -16777216));
            rectF4.set(rectF);
            rectF4.inset(-g0.N(0.33f), -g0.N(0.33f));
            canvas.drawRoundRect(rectF4, g0.N(0.33f) + height, g0.N(0.33f) + height, paint2);
        }
        if (f10 > 0.01f) {
            int i10 = this.g0 ? -1 : -16777216;
            Paint paint6 = this.w;
            paint6.setColor(i10);
            paint6.setAlpha((int) (20.4f * f10 * f11));
            canvas.drawRoundRect(rectF, height, height, paint6);
        }
        canvas.restore();
    }

    public final void h(float f10, float f11, float f12, int i7, Canvas canvas, boolean z10) {
        float[] fArr;
        char c10;
        float f13;
        float b10;
        float f14;
        Canvas canvas2;
        float f15;
        int i10 = 0;
        while (true) {
            fArr = this.m1;
            if (i10 >= fArr.length) {
                break;
            }
            float f16 = fArr[i10];
            int i11 = this.l1;
            fArr[i10] = k(f16, f12, i11 == i10 ? 1.0f : 0.0f, i11 == i10 ? 40.0f : 70.0f);
            i10++;
        }
        this.o1 = k(this.o1, f12, (this.K == null || this.z1) ? 0.0f : 1.0f, 90.0f);
        String str = this.I;
        TextPaint textPaint = this.e;
        float measureText = textPaint.measureText(str);
        float measureText2 = textPaint.measureText(this.J);
        float c11 = c(i7) - g0.L(2.0f);
        float L = g0.L(10.0f) + g0.L(14.0f) + g0.L(8.0f) + g0.L(1.0f) + (this.K != null ? g0.L(4.0f) : 0);
        float L2 = g0.L(14.0f) + measureText + g0.L(12.0f);
        float f17 = this.O1;
        if (f17 > 0.0f) {
            L2 = k(f17, f12, L2, 110.0f);
        }
        this.O1 = L2;
        float f18 = f10 + f11;
        RectF rectF = this.h1;
        rectF.set(c11, f10, L2 + c11, f18);
        float f19 = rectF.right;
        RectF rectF2 = this.i1;
        rectF2.set(f19, f10, L + f19, f18);
        float f20 = rectF.left;
        float f21 = rectF2.right;
        RectF rectF3 = this.f1;
        rectF3.set(f20, f10, f21, f18);
        float f22 = this.o1 * f11;
        float L3 = rectF3.right + g0.L(8.0f);
        float L4 = rectF3.right + g0.L(8.0f) + f11;
        RectF rectF4 = this.n1;
        rectF4.set(L3, f10, L4, f18);
        float L5 = ((f22 + g0.L(8.0f)) * this.o1) + rectF3.right + g0.L(8.0f);
        RectF rectF5 = this.g1;
        rectF5.set(L5, f10, measureText2 + L5 + g0.L(32.0f), f18);
        float f23 = rectF3.left;
        float f24 = rectF5.right;
        RectF rectF6 = this.e1;
        rectF6.set(f23, f10, f24, f18);
        if (this.z0 <= 0.001f) {
            return;
        }
        if (z10 && this.S0 == 0) {
            this.S0 = SystemClock.uptimeMillis();
        }
        if (this.S0 == 0) {
            c10 = 0;
            f13 = 0.001f;
            b10 = 0.0f;
        } else {
            c10 = 0;
            f13 = 0.001f;
            b10 = b((SystemClock.uptimeMillis() - this.S0) / 460.0f);
        }
        float interpolation = !this.p0 ? this.T0 : a2.getInterpolation(b10);
        this.T0 = interpolation;
        if (interpolation <= f13) {
            return;
        }
        float b11 = b(this.T0 * 1.8f) * (this.p0 ? b(this.z0 * 1.6f) : this.z0);
        float T1 = g0.T1(0.6f, 1.0f, this.b1) * b11;
        canvas.save();
        canvas.translate(0.0f, this.j1);
        float T12 = g0.T1(0.6f, 1.0f, this.T0) * this.k1;
        canvas.scale(T12, T12, rectF6.left, rectF6.centerY());
        this.T1 = T12;
        int i12 = this.g0 ? -1 : this.h0;
        float max = Math.max(fArr[c10], fArr[2]);
        if (this.P1) {
            float b12 = b(1.0f - (this.Q1 / 0.35f));
            if (b12 > 0.01f) {
                e(canvas, rectF3, i12, b12 * T1);
            }
            canvas2 = canvas;
            f14 = 2.0f;
            f15 = b11;
        } else {
            canvas.save();
            float f25 = 1.0f - (max * 0.05f);
            f14 = 2.0f;
            canvas.scale(f25, f25, rectF3.centerX(), rectF3.centerY());
            canvas2 = canvas;
            g(canvas2, rectF3, max, b11, f25);
            f15 = b11;
            e(canvas2, rectF3, i12, T1);
            canvas2.restore();
        }
        if (this.o1 > 0.01f) {
            canvas2.save();
            float T13 = g0.T1(0.6f, 1.0f, this.o1) * (1.0f - (fArr[3] * 0.05f));
            canvas2.scale(T13, T13, rectF4.centerX(), rectF4.centerY());
            g(canvas2, rectF4, fArr[3], f15 * this.o1, T13);
            if (this.p1 == null) {
                this.p1 = getContext().getResources().getDrawable(R.drawable.chats_undo).mutate();
            }
            this.p1.setColorFilter(new PorterDuffColorFilter(i12, PorterDuff.Mode.SRC_IN));
            this.p1.setAlpha((int) (255.0f * T1 * this.o1));
            float L6 = g0.L(22.0f) / f14;
            this.p1.setBounds((int) (rectF4.centerX() - L6), (int) (rectF4.centerY() - L6), (int) (rectF4.centerX() + L6), (int) (rectF4.centerY() + L6));
            this.p1.draw(canvas2);
            canvas2.restore();
        }
        canvas2.save();
        float f26 = 1.0f - (fArr[1] * 0.05f);
        canvas2.scale(f26, f26, rectF5.centerX(), rectF5.centerY());
        g(canvas2, rectF5, fArr[1], f15 * 1.0f, f26);
        i(canvas, this.J, g0.L(16.0f) + rectF5.left, rectF5.centerY(), i12, T1 * 1.0f);
        canvas.restore();
        canvas.restore();
    }

    public final void i(Canvas canvas, String str, float f10, float f11, int i7, float f12) {
        TextPaint textPaint = this.e;
        textPaint.setColor(i7);
        textPaint.setAlpha((int) (f12 * 255.0f));
        Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
        canvas.drawText(str, f10, f11 - ((fontMetrics.ascent + fontMetrics.descent) / 2.0f), textPaint);
    }

    public final void j(Canvas canvas, RectF rectF, int i7, float f10) {
        if (this.U == null) {
            this.U = getContext().getResources().getDrawable(R.drawable.msg_language).mutate();
            this.V = getContext().getResources().getDrawable(R.drawable.msg_settings).mutate();
        }
        float centerY = rectF.centerY();
        Drawable drawable = this.U;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        drawable.setColorFilter(new PorterDuffColorFilter(i7, mode));
        int i10 = (int) (255.0f * f10);
        this.U.setAlpha(i10);
        int L = (int) (rectF.left + g0.L(10.0f));
        int L2 = (int) (centerY - g0.L(10.0f));
        this.U.setBounds(L, L2, g0.L(20.0f) + L, g0.L(20.0f) + L2);
        this.U.draw(canvas);
        float L3 = (((rectF.right - g0.L(9.0f)) - g0.L(20.0f)) - g0.L(8.0f)) - g0.L(1.0f);
        canvas.save();
        canvas.clipRect(rectF.left, rectF.top, L3 - g0.L(4.0f), rectF.bottom);
        String str = this.O;
        if (str == null) {
            str = this.N;
        }
        i(canvas, str, rectF.left + g0.L(10.0f) + g0.L(20.0f) + g0.L(6.0f), centerY, i7, g0.T1(0.5f, 1.0f, this.P) * f10);
        canvas.restore();
        Paint paint = this.w;
        paint.setColor(i7);
        paint.setAlpha((int) (35.7f * f10));
        canvas.drawRect(L3, centerY - g0.L(9.0f), g0.N(1.0f) + L3, centerY + g0.L(9.0f), paint);
        this.V.setColorFilter(new PorterDuffColorFilter(i7, mode));
        this.V.setAlpha(i10);
        int L4 = (int) ((rectF.right - g0.L(9.0f)) - g0.L(10.0f));
        int i11 = (int) centerY;
        this.V.setBounds(L4 - g0.L(10.0f), i11 - g0.L(10.0f), g0.L(10.0f) + L4, g0.L(10.0f) + i11);
        this.V.draw(canvas);
    }

    public final void l(RectF rectF) {
        float f10 = this.T1;
        RectF rectF2 = this.e1;
        float centerY = rectF2.centerY();
        float f11 = rectF2.left;
        RectF rectF3 = this.f1;
        float z10 = e2.z(rectF3.left, f11, f10, f11);
        float z11 = e2.z(rectF3.top, centerY, f10, centerY);
        float f12 = this.j1;
        rectF.set(z10, z11 + f12, e2.z(rectF3.right, f11, f10, f11), ((rectF3.bottom - centerY) * f10) + centerY + f12);
    }

    public final void m() {
        r rVar;
        if (!this.p0) {
            if (getVisibility() == 0 || (rVar = this.a.h) == null) {
                return;
            }
            g0.E2(rVar);
            Log.d("VoiceLive", "overlay removed");
            return;
        }
        this.p0 = false;
        this.q0 = false;
        this.s0 = SystemClock.uptimeMillis();
        this.u0 = this.x0;
        this.v0 = this.y0;
        this.w0 = this.z0;
        this.l1 = -1;
        invalidate();
    }

    public final int n(float f10, float f11) {
        float f12 = 0.7f;
        if (this.z0 >= 0.7f && this.T0 >= 0.7f) {
            float L = g0.L(4.0f);
            float f13 = f11 - this.j1;
            int i7 = 0;
            RectF[] rectFArr = {this.h1, this.g1, this.i1, this.n1};
            while (i7 < 4) {
                if (i7 != 3 || this.o1 >= f12) {
                    RectF rectF = rectFArr[i7];
                    RectF rectF2 = this.e1;
                    float f14 = rectF2.left;
                    float f15 = rectF.left - f14;
                    float f16 = this.k1;
                    float f17 = (f15 * f16) + f14;
                    float z10 = e2.z(rectF.right, f14, f16, f14);
                    float centerY = ((rectF.top - rectF2.centerY()) * this.k1) + rectF2.centerY();
                    float centerY2 = ((rectF.bottom - rectF2.centerY()) * this.k1) + rectF2.centerY();
                    if (f10 < f17 - (i7 == 2 ? 0.0f : L)) {
                        continue;
                    } else {
                        if (f10 <= z10 + (i7 != 0 ? L : 0.0f) && f13 >= centerY - L && f13 <= centerY2 + L) {
                            return i7;
                        }
                    }
                }
                i7++;
                f12 = 0.7f;
            }
        }
        return -1;
    }

    public final int o(float f10, float f11) {
        if (this.y0 >= 0.7f) {
            RectF rectF = this.R;
            if (!rectF.isEmpty() && !this.W) {
                float L = g0.L(4.0f);
                if (f11 >= rectF.top - L && f11 <= rectF.bottom + L && f10 >= rectF.left - L && f10 <= rectF.right + L) {
                    return f10 >= this.T.left - ((float) g0.L(4.0f)) ? 5 : 4;
                }
            }
        }
        return -1;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        s();
        VelocityTracker velocityTracker = this.v1;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.v1 = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0470  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x048a  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x04a4  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x04b0  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x04bd  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x04e2  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0513  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x051a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x052f  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x05db A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0bba  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0bc0  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0bc7  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0bdd  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0c20  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0c2f  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0c40  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0ca0  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0c23  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0bc2  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x06da  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x054a  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0515  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x0491  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0428  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0457  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0468  */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4, types: [int] */
    /* JADX WARN: Type inference failed for: r11v66 */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDraw(Canvas canvas) {
        float f10;
        float f11;
        boolean z10;
        float f12;
        float f13;
        int i7;
        int i10;
        float f14;
        float f15;
        float f16;
        float f17;
        int i11;
        ?? r11;
        boolean z11;
        StaticLayout staticLayout;
        float height;
        float L;
        rg rgVar;
        StaticLayout staticLayout2;
        boolean z12;
        float f18;
        float top;
        float f19;
        float f20;
        float min;
        float f21;
        TextPaint textPaint;
        float f22;
        float f23;
        float f24;
        float f25;
        float max;
        float textSize;
        float max2;
        float f26;
        float f27;
        long j3;
        float f28;
        float f29;
        float f30;
        int i12;
        float f31;
        float f32;
        int i13;
        float f33;
        float min2;
        float f34;
        float f35;
        String str;
        float f36;
        float f37;
        float f38;
        int size;
        char c10;
        int i14;
        int i15;
        int i16;
        float y10;
        float f39;
        int i17;
        float f40;
        float f41;
        float f42;
        RecordingCanvas beginRecording;
        float f43;
        float B;
        Canvas canvas2 = canvas;
        long uptimeMillis = SystemClock.uptimeMillis();
        float max3 = this.t0 == 0 ? 16.0f : Math.max(1L, Math.min(48L, uptimeMillis - r3));
        this.t0 = uptimeMillis;
        b2 = uptimeMillis;
        int width = getWidth();
        int height2 = getHeight();
        if (width <= 0 || height2 <= 0) {
            return;
        }
        boolean z13 = this.p0;
        nr nrVar = U1;
        if (z13) {
            f10 = 16.0f;
            long j10 = uptimeMillis - this.r0;
            this.x0 = nrVar.getInterpolation(b(j10 / 360.0f));
            float b10 = b((j10 - 60) / 460.0f);
            nr nrVar2 = V1;
            this.y0 = nrVar2.getInterpolation(b10);
            this.z0 = nrVar2.getInterpolation(b((j10 - 120) / 520.0f));
            float L2 = (1.0f - this.y0) * g0.L(14.0f);
            this.j1 = (1.0f - this.z0) * g0.L(18.0f);
            f11 = L2;
            if (j10 >= 700) {
                z10 = false;
                this.k1 = g0.T1(0.92f, 1.0f, this.z0);
                f12 = this.x0;
                float f44 = 1.0f;
                boolean z14 = z10;
                if (f12 <= 0.001f) {
                    int width2 = getWidth();
                    int height3 = getHeight();
                    boolean z15 = this.j0 && canvas2.isHardwareAccelerated() && Build.VERSION.SDK_INT >= 31;
                    if (z15) {
                        i10 = 31;
                        int width3 = getWidth();
                        int height4 = getHeight();
                        RenderNode d = a0.d(this.d0);
                        if (d == null) {
                            d = new RenderNode("VoiceLiveBackdrop");
                            this.d0 = d;
                            this.e0 = -1.0f;
                            f13 = f11;
                            this.f0 = 0L;
                        } else {
                            f13 = f11;
                        }
                        int max4 = Math.max(1, (int) Math.ceil(width3 * 0.25f));
                        int max5 = Math.max(1, (int) Math.ceil(height4 * 0.25f));
                        i11 = width;
                        i7 = height2;
                        try {
                            if (!z14) {
                                long j11 = this.f0;
                                if (j11 != 0 && uptimeMillis - j11 < 100 && d.getWidth() == max4 && d.getHeight() == max5) {
                                    f43 = 0.25f;
                                    B = e2.B(f12, 0.65f, 0.35f, g0.L(30.0f) * f43);
                                    if (Math.abs(B - this.e0) > f43) {
                                        this.e0 = B;
                                        d.setRenderEffect(RenderEffect.createBlurEffect(B, B, Shader.TileMode.CLAMP));
                                    }
                                    d.setAlpha(f12);
                                    canvas2.save();
                                    f41 = 4.0f;
                                    canvas2.scale(4.0f, 4.0f);
                                    canvas2.drawRenderNode(d);
                                    canvas2.restore();
                                }
                            }
                            beginRecording.scale(0.25f, 0.25f);
                            d(beginRecording);
                            B = e2.B(f12, 0.65f, 0.35f, g0.L(30.0f) * f43);
                            if (Math.abs(B - this.e0) > f43) {
                            }
                            d.setAlpha(f12);
                            canvas2.save();
                            f41 = 4.0f;
                            canvas2.scale(4.0f, 4.0f);
                            canvas2.drawRenderNode(d);
                            canvas2.restore();
                        } finally {
                        }
                        this.f0 = uptimeMillis;
                        d.setPosition(0, 0, max4, max5);
                        beginRecording = d.beginRecording(max4, max5);
                        f43 = 0.25f;
                    } else {
                        f13 = f11;
                        i7 = height2;
                        i10 = 31;
                        f41 = 4.0f;
                        i11 = width;
                    }
                    int i18 = this.g0 ? z15 ? -1978658282 : -300936682 : z15 ? 1811413242 : -285738758;
                    f16 = f41;
                    Paint paint = this.f;
                    paint.setColor(i18);
                    paint.setAlpha((int) (Color.alpha(i18) * f12));
                    float f45 = width2;
                    float f46 = height3;
                    r11 = 0;
                    f14 = 2.0f;
                    f15 = 80.0f;
                    f17 = -1.0f;
                    canvas2.drawRect(0.0f, 0.0f, f45, f46, paint);
                    float f47 = f45 / 2.0f;
                    float L3 = g0.L(80.0f) + g0.m;
                    float max6 = Math.max(width2, g0.L(200.0f)) * 0.95f;
                    int i19 = (((((int) (f12 * 64.0f)) * 31) + width2) * 31) + this.i0 + (this.g0 ? 1 : 0);
                    int i20 = this.r;
                    Paint paint2 = this.h;
                    if (i19 != i20) {
                        this.r = i19;
                        f42 = L3;
                        paint2.setShader(new RadialGradient(f47, f42, max6, m6.r1((this.g0 ? 0.16f : 0.1f) * f12, this.i0), 0, Shader.TileMode.CLAMP));
                    } else {
                        f42 = L3;
                    }
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, f45, Math.min(f46, f42 + max6), paint2);
                } else {
                    f13 = f11;
                    i7 = height2;
                    i10 = 31;
                    f14 = 2.0f;
                    f15 = 80.0f;
                    f16 = 4.0f;
                    f17 = -1.0f;
                    i11 = width;
                    r11 = 0;
                }
                if (this.c1 < 0) {
                    int[] iArr = new int[2];
                    getLocationInWindow(iArr);
                    this.c1 = iArr[1];
                }
                float c11 = c(i11);
                float L4 = g0.L(36.0f);
                float L5 = g0.L(f10);
                float f48 = i7;
                o oVar = this.a;
                float f49 = f14;
                ChatActivityEnterView chatActivityEnterView = oVar.b.a;
                chatActivityEnterView.getLocationInWindow(new int[2]);
                chatActivityEnterView.c2.getLocationInWindow(new int[2]);
                float min3 = Math.min(f48, (r8[1] - r14[1]) - getTop()) - g0.L(18.0f);
                z11 = (this.l0 != null || this.k0.trim().isEmpty()) ? r11 : true;
                this.b1 = k(this.b1, max3, !z11 ? 1.0f : 0.0f, 60.0f);
                staticLayout = !z11 ? this.l0 : this.m0;
                height = staticLayout == null ? staticLayout.getHeight() : g0.L(30.0f);
                float L6 = g0.L(8.0f) + Math.max((int) r11, g0.m - this.c1);
                L = g0.L(36.0f) + L6 + g0.L(12.0f);
                float f50 = (min3 - L4) - L5;
                float max7 = Math.max(L, ((Math.max(0.0f, f50 - L) * 0.3f) + L) - g0.L(36.0f));
                ChatActivityEnterView chatActivityEnterView2 = oVar.b.a;
                rgVar = chatActivityEnterView2.E2;
                RectF rectF = chatActivityEnterView2.I4;
                if (rgVar == null && !rectF.isEmpty() && chatActivityEnterView2.E2.getVisibility() == 0) {
                    staticLayout2 = staticLayout;
                    z12 = z11;
                    chatActivityEnterView2.E2.getLocationInWindow(new int[2]);
                    chatActivityEnterView2.c2.getLocationInWindow(new int[2]);
                    f18 = rectF.centerY() + (r8[1] - r14[1]);
                } else {
                    staticLayout2 = staticLayout;
                    z12 = z11;
                    f18 = f17;
                }
                top = f18 - getTop();
                if (this.M0 || top <= 0.0f) {
                    ChatActivityEnterView chatActivityEnterView3 = oVar.b.a;
                    chatActivityEnterView3.getLocationInWindow(new int[2]);
                    chatActivityEnterView3.c2.getLocationInWindow(new int[2]);
                    top = Math.min(f48, (r7[1] - r8[1]) - getTop()) - g0.L(42.0f);
                }
                float f51 = top - (L4 / f49);
                if (this.P0 || this.M0) {
                    f19 = 0.0f;
                } else {
                    float f52 = this.Q0;
                    f19 = 0.0f;
                    if (f52 > 0.0f) {
                        f20 = f52;
                        this.Q0 = f20;
                        min = Math.min(f50, f20 - L5);
                        f21 = this.N0;
                        textPaint = this.c;
                        if (f21 <= f19 && this.n0 > 0) {
                            StaticLayout a10 = a("A\nA", textPaint);
                            StaticLayout a11 = a("A", textPaint);
                            this.N0 = a10.getLineTop(1) - a10.getLineTop(0);
                            this.O0 = a11.getHeight();
                        }
                        f22 = this.N0;
                        if (f22 <= 0.0f) {
                            f22 = textPaint.getFontMetrics(null) + g0.L(f16);
                        }
                        f23 = this.O0;
                        if (f23 <= 0.0f) {
                            f23 = textPaint.getFontMetrics(null);
                        }
                        if (f22 > 0.0f) {
                            float f53 = min - f23;
                            if (f53 > max7) {
                                f24 = f53 - (((int) Math.floor((f53 - max7) / f22)) * f22);
                                float max8 = !this.L0 ? Math.max(L, min - height) : Math.max(L, Math.min(f24, min - height));
                                f25 = this.G0;
                                if (f25 >= 0.0f) {
                                    max8 = Math.min(f25, max8);
                                }
                                this.G0 = max8;
                                if (!this.A0 && !this.K0) {
                                    f40 = this.H0;
                                    if (f40 >= 0.0f) {
                                        max8 = k(f40, max3, max8, 160.0f);
                                    }
                                }
                                float f54 = max8;
                                this.H0 = f54;
                                max = Math.max(this.E0, Math.min(height, Math.max(g0.L(64.0f), min - this.G0)));
                                this.E0 = max;
                                if (!this.A0 || this.K0) {
                                    this.B0 = max;
                                } else {
                                    this.B0 = k(this.B0, max3, max, 140.0f);
                                }
                                float max9 = Math.max(0.0f, height - this.B0);
                                textSize = textPaint.getTextSize() * 1.35f;
                                max2 = Math.max(0.0f, height - max);
                                boolean z16 = uptimeMillis - this.R0 >= 900;
                                if (this.U0 && z16) {
                                    max2 = o10.A(max2, textSize, this.F0, max2);
                                }
                                this.F0 = max2;
                                float max10 = Math.max(max9, max2);
                                if (!this.U0) {
                                    this.C0 = (this.A0 || this.K0) ? this.F0 : k(this.C0, max3, this.F0, 160.0f);
                                } else if (!this.u1) {
                                    if (Math.abs(this.D0) > 0.01f) {
                                        float f55 = this.C0;
                                        float f56 = this.D0;
                                        this.C0 = (f56 * max3) + f55;
                                        f26 = max9;
                                        float exp = f56 * ((float) Math.exp((-max3) / 325.0f));
                                        this.D0 = exp;
                                        if (Math.abs(exp) <= 0.01f) {
                                            f27 = 0.0f;
                                            this.D0 = 0.0f;
                                            if (this.C0 >= f26 - g0.L(6.0f) && this.D0 >= f27) {
                                                this.U0 = true;
                                                this.D0 = f27;
                                            }
                                            this.C0 = Math.max(f27, Math.min(max10, this.C0));
                                            float c12 = (i11 - (c(i11) * f49)) + c11 + g0.L(12.0f);
                                            float L7 = this.B0 + f54 + g0.L(8.0f);
                                            RectF rectF2 = this.d1;
                                            rectF2.set(c11 - g0.L(12.0f), f54 - g0.L(8.0f), c12, L7);
                                            if (this.y0 > 0.001f || staticLayout2 == null) {
                                                j3 = uptimeMillis;
                                                f28 = f54;
                                                f29 = c11;
                                                f30 = f20;
                                                i12 = i11;
                                                f31 = L6;
                                                f32 = 90.0f;
                                                i13 = -1;
                                            } else {
                                                StaticLayout staticLayout3 = this.D1;
                                                float f57 = f26;
                                                ArrayList arrayList = this.E1;
                                                if (staticLayout3 == null && arrayList.isEmpty()) {
                                                    f28 = f54;
                                                    f30 = f20;
                                                    i12 = i11;
                                                    f31 = L6;
                                                    c10 = 52429;
                                                    f32 = 90.0f;
                                                    f38 = 140.0f;
                                                    i14 = 3;
                                                } else {
                                                    canvas2.save();
                                                    canvas2.translate(c11, this.I0);
                                                    if (this.D1 != null) {
                                                        float b11 = b((uptimeMillis - this.C1) / 520.0f);
                                                        if (b11 >= 1.0f) {
                                                            this.D1 = null;
                                                        } else {
                                                            float L8 = g0.L(60.0f);
                                                            float g10 = c0.g(L8, f49, this.n0, b11, -L8);
                                                            f28 = f54;
                                                            f31 = L6;
                                                            f32 = 90.0f;
                                                            f38 = 140.0f;
                                                            int saveLayer = canvas2.saveLayer(-g0.L(10.0f), -g0.L(10.0f), g0.L(30.0f) + this.n0, g0.L(10.0f) + this.D1.getHeight(), null);
                                                            this.D1.draw(canvas2);
                                                            PorterDuffXfermode porterDuffXfermode = new PorterDuffXfermode(PorterDuff.Mode.DST_OUT);
                                                            Paint paint3 = this.G1;
                                                            paint3.setXfermode(porterDuffXfermode);
                                                            paint3.setShader(new LinearGradient(g10 - L8, 0.0f, g10 + L8, 0.0f, -16777216, 0, Shader.TileMode.CLAMP));
                                                            canvas2.drawRect(-g0.L(10.0f), -g0.L(10.0f), g0.L(30.0f) + this.n0, g0.L(10.0f) + this.D1.getHeight(), paint3);
                                                            canvas2.restoreToCount(saveLayer);
                                                            size = arrayList.size() - 1;
                                                            while (size >= 0) {
                                                                ArrayList arrayList2 = arrayList;
                                                                float[] fArr = (float[]) arrayList2.get(size);
                                                                float f58 = uptimeMillis - fArr[4];
                                                                if (f58 >= 0.0f) {
                                                                    float f59 = fArr[5];
                                                                    if (f58 > f59) {
                                                                        arrayList2.remove(size);
                                                                    } else {
                                                                        float f60 = f58 / f59;
                                                                        if (f60 < 0.15f) {
                                                                            y10 = f60 / 0.15f;
                                                                            i15 = size;
                                                                            i16 = i11;
                                                                        } else {
                                                                            i15 = size;
                                                                            i16 = i11;
                                                                            y10 = f3.y(f60, 0.15f, 0.85f, f44);
                                                                        }
                                                                        int i21 = (int) fArr[6];
                                                                        Paint paint4 = this.F1;
                                                                        paint4.setColor(i21);
                                                                        paint4.setAlpha((int) (b(y10) * 255.0f));
                                                                        f39 = f20;
                                                                        canvas2.drawCircle((fArr[2] * f58) + fArr[0], (fArr[3] * f58) + fArr[1], e2.C(f60, 0.4f, 1.0f, fArr[7]), paint4);
                                                                        size = i15 - 1;
                                                                        i11 = i16;
                                                                        f20 = f39;
                                                                        f44 = 1.0f;
                                                                        arrayList = arrayList2;
                                                                    }
                                                                }
                                                                i15 = size;
                                                                f39 = f20;
                                                                i16 = i11;
                                                                size = i15 - 1;
                                                                i11 = i16;
                                                                f20 = f39;
                                                                f44 = 1.0f;
                                                                arrayList = arrayList2;
                                                            }
                                                            f30 = f20;
                                                            i12 = i11;
                                                            c10 = 52429;
                                                            i14 = 3;
                                                            canvas2.restore();
                                                        }
                                                    }
                                                    f28 = f54;
                                                    f31 = L6;
                                                    f32 = 90.0f;
                                                    f38 = 140.0f;
                                                    size = arrayList.size() - 1;
                                                    while (size >= 0) {
                                                    }
                                                    f30 = f20;
                                                    i12 = i11;
                                                    c10 = 52429;
                                                    i14 = 3;
                                                    canvas2.restore();
                                                }
                                                float L9 = this.C0 > 0.5f ? -getTop() : f28 - g0.L(f16);
                                                int saveLayerAlpha = canvas2.saveLayerAlpha(rectF2.left, Math.min(rectF2.top, L9) + f13, rectF2.right, rectF2.bottom + f13, (int) (this.y0 * 255.0f));
                                                float f61 = f13;
                                                canvas2.translate(0.0f, f61);
                                                canvas2.save();
                                                canvas2.clipRect(rectF2.left, L9, rectF2.right, Math.max(this.B0, this.E0) + f28 + g0.L(6.0f));
                                                canvas2.translate(c11, f28 - this.C0);
                                                float f62 = this.b1;
                                                if (f62 >= 0.999f || this.m0 == null) {
                                                    i17 = saveLayerAlpha;
                                                    f29 = c11;
                                                    i13 = -1;
                                                } else {
                                                    float f63 = (1.0f - f62) * (this.g0 ? 0.9f : 0.85f);
                                                    Object obj = this.d0;
                                                    TextPaint textPaint2 = this.d;
                                                    if (obj == null || Build.VERSION.SDK_INT < i10 || !canvas2.isHardwareAccelerated()) {
                                                        i17 = saveLayerAlpha;
                                                        f29 = c11;
                                                        i13 = -1;
                                                        textPaint2.setShader(null);
                                                        textPaint2.setColor(m6.r1((1.0f - this.b1) * (this.g0 ? 0.42f : 0.36f), this.h0));
                                                        this.m0.draw(canvas2);
                                                    } else {
                                                        float f64 = -c11;
                                                        i17 = saveLayerAlpha;
                                                        canvas2 = canvas;
                                                        int saveLayer2 = canvas2.saveLayer(f64, (this.C0 - f28) - f61, getWidth() - c11, ((this.C0 - f28) - f61) + getHeight(), null);
                                                        textPaint2.setShader(null);
                                                        textPaint2.setColor(-1);
                                                        textPaint2.setAlpha((int) (f63 * 255.0f));
                                                        this.m0.draw(canvas2);
                                                        if (this.b0 == null || this.a0 != this.g0) {
                                                            this.a0 = this.g0;
                                                            ColorMatrix colorMatrix = new ColorMatrix();
                                                            colorMatrix.setSaturation(2.2f);
                                                            boolean z17 = this.g0;
                                                            float f65 = z17 ? 1.45f : 0.5f;
                                                            float f66 = z17 ? 72.0f : -4.0f;
                                                            float[] fArr2 = new float[20];
                                                            fArr2[0] = f65;
                                                            fArr2[1] = 0.0f;
                                                            fArr2[2] = 0.0f;
                                                            fArr2[i14] = 0.0f;
                                                            fArr2[4] = f66;
                                                            fArr2[5] = 0.0f;
                                                            fArr2[6] = f65;
                                                            fArr2[7] = 0.0f;
                                                            fArr2[8] = 0.0f;
                                                            fArr2[9] = f66;
                                                            fArr2[10] = 0.0f;
                                                            fArr2[11] = 0.0f;
                                                            fArr2[12] = f65;
                                                            fArr2[13] = 0.0f;
                                                            fArr2[14] = f66;
                                                            fArr2[15] = 0.0f;
                                                            fArr2[16] = 0.0f;
                                                            fArr2[17] = 0.0f;
                                                            fArr2[18] = 1.0f;
                                                            fArr2[19] = 0.0f;
                                                            colorMatrix.postConcat(new ColorMatrix(fArr2));
                                                            Paint paint5 = new Paint();
                                                            this.b0 = paint5;
                                                            paint5.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                                                            this.b0.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
                                                        }
                                                        f29 = c11;
                                                        i13 = -1;
                                                        int saveLayer3 = canvas2.saveLayer(f64, (this.C0 - f28) - f61, getWidth() - c11, ((this.C0 - f28) - f61) + getHeight(), this.b0);
                                                        canvas2.save();
                                                        canvas2.translate(f64, (this.C0 - f28) - f61);
                                                        float f67 = f16;
                                                        canvas2.scale(f67, f67);
                                                        RenderNode d2 = a0.d(this.d0);
                                                        RenderNode d10 = a0.d(this.c0);
                                                        if (d10 == null) {
                                                            d10 = new RenderNode("VoiceLiveListen");
                                                            this.c0 = d10;
                                                            d10.setRenderEffect(RenderEffect.createBlurEffect(g0.L(f32) * 0.25f, g0.L(24.0f) * 0.25f, Shader.TileMode.CLAMP));
                                                        }
                                                        d10.setPosition(0, 0, d2.getWidth(), d2.getHeight());
                                                        try {
                                                            d10.beginRecording(d2.getWidth(), d2.getHeight()).drawRenderNode(d2);
                                                            d10.endRecording();
                                                            canvas2.drawRenderNode(d10);
                                                            canvas2.restore();
                                                            canvas2.restoreToCount(saveLayer3);
                                                            canvas2.restoreToCount(saveLayer2);
                                                        } finally {
                                                        }
                                                    }
                                                }
                                                if (this.z1) {
                                                    float max11 = Math.max(g0.L(f38), this.n0 * 0.45f);
                                                    float g11 = c0.g(max11, 2.0f, this.n0, ((uptimeMillis - this.B1) % 1300) / 1300.0f, -max11);
                                                    float[] fArr3 = new float[i14];
                                                    // fill-array-data instruction
                                                    fArr3[0] = 0.0f;
                                                    fArr3[1] = 0.5f;
                                                    fArr3[2] = 1.0f;
                                                    textPaint.setShader(new LinearGradient(g11, 0.0f, g11 + max11, 0.0f, new int[]{this.h0, m6.r1(1.0f, X1), this.h0}, fArr3, Shader.TileMode.CLAMP));
                                                }
                                                StaticLayout staticLayout4 = this.l0;
                                                if (staticLayout4 != null) {
                                                    staticLayout4.draw(canvas2);
                                                }
                                                if (this.z1) {
                                                    textPaint.setShader(null);
                                                }
                                                if (z12) {
                                                    StaticLayout staticLayout5 = this.l0;
                                                    int i22 = X1;
                                                    float k10 = k(this.a1, max3, this.Z0 ? 1.0f : 0.0f, f15);
                                                    this.a1 = k10;
                                                    if (staticLayout5 != null && k10 >= 0.01f) {
                                                        float lineRight = staticLayout5.getLineRight(staticLayout5.getLineCount() - 1) + g0.L(10.0f);
                                                        float lineBaseline = staticLayout5.getLineBaseline(r5) - (textPaint.getTextSize() * 0.34f);
                                                        this.V0 = lineRight;
                                                        this.W0 = lineBaseline;
                                                        float f68 = this.Y0;
                                                        float f69 = this.X0;
                                                        this.Y0 = k(f68, max3, f69, f69 > f68 ? 60.0f : 220.0f);
                                                        float N = g0.N(2.2f);
                                                        float N2 = g0.N(2.0f);
                                                        float f70 = uptimeMillis / 1000.0f;
                                                        Paint paint6 = this.x;
                                                        paint6.setColor(i22);
                                                        paint6.setAlpha((int) (Color.alpha(i22) * this.a1 * 1.0f));
                                                        int i23 = 0;
                                                        while (i23 < 3) {
                                                            long j12 = uptimeMillis;
                                                            double d11 = 1.6d * f70 * 2.0f * 3.141592653589793d;
                                                            double d12 = i23;
                                                            float T1 = g0.T1(0.4f, 1.0f, this.a1) * g0.W1(b((((((((float) Math.sin((1.9d * d12) + d11)) * 0.5f) + 0.5f) * 0.55f) + 0.45f) * this.Y0) + (((float) Math.sin((d12 * 1.3d) + (r8 * 0.7d))) * 0.1f) + 0.16f), g0.L(2.5f), g0.L(10.5f));
                                                            float b12 = o10.b(N, N2, i23, this.V0);
                                                            RectF rectF3 = g0.P;
                                                            float f71 = this.W0;
                                                            float f72 = T1 / 2.0f;
                                                            float f73 = N;
                                                            rectF3.set(b12, f71 - f72, b12 + f73, f71 + f72);
                                                            float f74 = f73 / 2.0f;
                                                            canvas2.drawRoundRect(rectF3, f74, f74, paint6);
                                                            i23++;
                                                            N = f73;
                                                            uptimeMillis = j12;
                                                        }
                                                    }
                                                }
                                                j3 = uptimeMillis;
                                                canvas2.restore();
                                                float f75 = this.C0;
                                                if (f75 > 0.5f) {
                                                    f(canvas2, rectF2.left, L9, rectF2.right, f28 + g0.L(30.0f), false, Math.min(1.0f, f75 / g0.L(40.0f)));
                                                }
                                                if (!this.U0) {
                                                    float f76 = f57 - this.C0;
                                                    if (f76 > 0.5f) {
                                                        canvas2 = canvas;
                                                        f(canvas2, rectF2.left, (f28 + this.B0) - g0.L(28.0f), rectF2.right, f28 + this.B0 + g0.L(6.0f), true, Math.min(1.0f, f76 / g0.L(28.0f)));
                                                        canvas2.restoreToCount(i17);
                                                    }
                                                }
                                                canvas2 = canvas;
                                                canvas2.restoreToCount(i17);
                                            }
                                            float f77 = f28 + this.B0 + L5;
                                            f33 = f30;
                                            min2 = Math.min(f77, f33);
                                            if (min2 >= f33 - g0.L(1.0f)) {
                                                this.L0 = true;
                                            }
                                            float f78 = !this.L0 ? f33 : min2;
                                            boolean z18 = this.D1 == null || j3 - this.C1 < 600;
                                            f34 = this.J0;
                                            if (f34 >= 0.0f || this.A0 || !z18) {
                                                f35 = f32;
                                            } else {
                                                f35 = f32;
                                                f78 = k(f34, max3, f78, f35);
                                            }
                                            this.J0 = f78;
                                            this.K0 = false;
                                            float f79 = max3;
                                            Canvas canvas3 = canvas2;
                                            h(f78, L4, f79, i12, canvas3, z12);
                                            float L10 = f29 - g0.L(2.0f);
                                            float max12 = Math.max(f31, (f28 - g0.L(12.0f)) - g0.L(36.0f));
                                            this.P = k(this.P, f79, this.O == null ? 1.0f : 0.0f, f35);
                                            str = this.O;
                                            if (str == null) {
                                                str = this.N;
                                            }
                                            float measureText = this.e.measureText(str);
                                            f36 = this.Q;
                                            if (f36 > 0.0f) {
                                                measureText = k(f36, f79, measureText, 110.0f);
                                            }
                                            this.Q = measureText;
                                            float L11 = g0.L(36.0f);
                                            float L12 = g0.L(10.0f) + L10 + g0.L(20.0f) + g0.L(6.0f) + this.Q + g0.L(12.0f);
                                            float f80 = L11 + max12;
                                            RectF rectF4 = this.R;
                                            rectF4.set(L10, max12, g0.L(1.0f) + L12 + g0.L(8.0f) + g0.L(20.0f) + g0.L(9.0f), f80);
                                            this.S.set(L10, max12, L12, f80);
                                            this.T.set(L12, max12, rectF4.right, f80);
                                            f37 = this.y0;
                                            if (f37 > 0.001f) {
                                                int i24 = this.g0 ? i13 : this.h0;
                                                float[] fArr4 = this.m1;
                                                float max13 = Math.max(fArr4[4], fArr4[5]);
                                                canvas3.save();
                                                canvas3.translate(0.0f, (1.0f - this.y0) * (-g0.L(6.0f)));
                                                if (this.W) {
                                                    j(canvas3, rectF4, i24, f37);
                                                } else {
                                                    float f81 = 1.0f - (0.04f * max13);
                                                    canvas3.scale(f81, f81, rectF4.centerX(), rectF4.centerY());
                                                    float f82 = this.T1;
                                                    float f83 = this.j1;
                                                    RectF rectF5 = this.J1;
                                                    RectF rectF6 = this.e1;
                                                    rectF5.set(rectF6);
                                                    this.T1 = 1.0f;
                                                    this.j1 = 0.0f;
                                                    rectF6.set(rectF4);
                                                    g(canvas3, rectF4, max13, f37, f81);
                                                    this.T1 = f82;
                                                    this.j1 = f83;
                                                    rectF6.set(rectF5);
                                                    j(canvas3, rectF4, i24, f37);
                                                }
                                                canvas3.restore();
                                            }
                                            this.A0 = false;
                                            invalidate();
                                        }
                                    } else {
                                        f26 = max9;
                                    }
                                    f27 = 0.0f;
                                    if (this.C0 >= f26 - g0.L(6.0f)) {
                                        this.U0 = true;
                                        this.D0 = f27;
                                    }
                                    this.C0 = Math.max(f27, Math.min(max10, this.C0));
                                    float c122 = (i11 - (c(i11) * f49)) + c11 + g0.L(12.0f);
                                    float L72 = this.B0 + f54 + g0.L(8.0f);
                                    RectF rectF22 = this.d1;
                                    rectF22.set(c11 - g0.L(12.0f), f54 - g0.L(8.0f), c122, L72);
                                    if (this.y0 > 0.001f) {
                                    }
                                    j3 = uptimeMillis;
                                    f28 = f54;
                                    f29 = c11;
                                    f30 = f20;
                                    i12 = i11;
                                    f31 = L6;
                                    f32 = 90.0f;
                                    i13 = -1;
                                    float f772 = f28 + this.B0 + L5;
                                    f33 = f30;
                                    min2 = Math.min(f772, f33);
                                    if (min2 >= f33 - g0.L(1.0f)) {
                                    }
                                    if (!this.L0) {
                                    }
                                    if (this.D1 == null) {
                                    }
                                    f34 = this.J0;
                                    if (f34 >= 0.0f) {
                                    }
                                    f35 = f32;
                                    this.J0 = f78;
                                    this.K0 = false;
                                    float f792 = max3;
                                    Canvas canvas32 = canvas2;
                                    h(f78, L4, f792, i12, canvas32, z12);
                                    float L102 = f29 - g0.L(2.0f);
                                    float max122 = Math.max(f31, (f28 - g0.L(12.0f)) - g0.L(36.0f));
                                    this.P = k(this.P, f792, this.O == null ? 1.0f : 0.0f, f35);
                                    str = this.O;
                                    if (str == null) {
                                    }
                                    float measureText2 = this.e.measureText(str);
                                    f36 = this.Q;
                                    if (f36 > 0.0f) {
                                    }
                                    this.Q = measureText2;
                                    float L112 = g0.L(36.0f);
                                    float L122 = g0.L(10.0f) + L102 + g0.L(20.0f) + g0.L(6.0f) + this.Q + g0.L(12.0f);
                                    float f802 = L112 + max122;
                                    RectF rectF42 = this.R;
                                    rectF42.set(L102, max122, g0.L(1.0f) + L122 + g0.L(8.0f) + g0.L(20.0f) + g0.L(9.0f), f802);
                                    this.S.set(L102, max122, L122, f802);
                                    this.T.set(L122, max122, rectF42.right, f802);
                                    f37 = this.y0;
                                    if (f37 > 0.001f) {
                                    }
                                    this.A0 = false;
                                    invalidate();
                                }
                                f26 = max9;
                                f27 = 0.0f;
                                this.C0 = Math.max(f27, Math.min(max10, this.C0));
                                float c1222 = (i11 - (c(i11) * f49)) + c11 + g0.L(12.0f);
                                float L722 = this.B0 + f54 + g0.L(8.0f);
                                RectF rectF222 = this.d1;
                                rectF222.set(c11 - g0.L(12.0f), f54 - g0.L(8.0f), c1222, L722);
                                if (this.y0 > 0.001f) {
                                }
                                j3 = uptimeMillis;
                                f28 = f54;
                                f29 = c11;
                                f30 = f20;
                                i12 = i11;
                                f31 = L6;
                                f32 = 90.0f;
                                i13 = -1;
                                float f7722 = f28 + this.B0 + L5;
                                f33 = f30;
                                min2 = Math.min(f7722, f33);
                                if (min2 >= f33 - g0.L(1.0f)) {
                                }
                                if (!this.L0) {
                                }
                                if (this.D1 == null) {
                                }
                                f34 = this.J0;
                                if (f34 >= 0.0f) {
                                }
                                f35 = f32;
                                this.J0 = f78;
                                this.K0 = false;
                                float f7922 = max3;
                                Canvas canvas322 = canvas2;
                                h(f78, L4, f7922, i12, canvas322, z12);
                                float L1022 = f29 - g0.L(2.0f);
                                float max1222 = Math.max(f31, (f28 - g0.L(12.0f)) - g0.L(36.0f));
                                this.P = k(this.P, f7922, this.O == null ? 1.0f : 0.0f, f35);
                                str = this.O;
                                if (str == null) {
                                }
                                float measureText22 = this.e.measureText(str);
                                f36 = this.Q;
                                if (f36 > 0.0f) {
                                }
                                this.Q = measureText22;
                                float L1122 = g0.L(36.0f);
                                float L1222 = g0.L(10.0f) + L1022 + g0.L(20.0f) + g0.L(6.0f) + this.Q + g0.L(12.0f);
                                float f8022 = L1122 + max1222;
                                RectF rectF422 = this.R;
                                rectF422.set(L1022, max1222, g0.L(1.0f) + L1222 + g0.L(8.0f) + g0.L(20.0f) + g0.L(9.0f), f8022);
                                this.S.set(L1022, max1222, L1222, f8022);
                                this.T.set(L1222, max1222, rectF422.right, f8022);
                                f37 = this.y0;
                                if (f37 > 0.001f) {
                                }
                                this.A0 = false;
                                invalidate();
                            }
                        }
                        f24 = max7;
                        if (!this.L0) {
                        }
                        f25 = this.G0;
                        if (f25 >= 0.0f) {
                        }
                        this.G0 = max8;
                        if (!this.A0) {
                            f40 = this.H0;
                            if (f40 >= 0.0f) {
                            }
                        }
                        float f542 = max8;
                        this.H0 = f542;
                        max = Math.max(this.E0, Math.min(height, Math.max(g0.L(64.0f), min - this.G0)));
                        this.E0 = max;
                        if (this.A0) {
                        }
                        this.B0 = max;
                        float max92 = Math.max(0.0f, height - this.B0);
                        textSize = textPaint.getTextSize() * 1.35f;
                        max2 = Math.max(0.0f, height - max);
                        if (uptimeMillis - this.R0 >= 900) {
                        }
                        if (this.U0) {
                            max2 = o10.A(max2, textSize, this.F0, max2);
                        }
                        this.F0 = max2;
                        float max102 = Math.max(max92, max2);
                        if (!this.U0) {
                        }
                        f26 = max92;
                        f27 = 0.0f;
                        this.C0 = Math.max(f27, Math.min(max102, this.C0));
                        float c12222 = (i11 - (c(i11) * f49)) + c11 + g0.L(12.0f);
                        float L7222 = this.B0 + f542 + g0.L(8.0f);
                        RectF rectF2222 = this.d1;
                        rectF2222.set(c11 - g0.L(12.0f), f542 - g0.L(8.0f), c12222, L7222);
                        if (this.y0 > 0.001f) {
                        }
                        j3 = uptimeMillis;
                        f28 = f542;
                        f29 = c11;
                        f30 = f20;
                        i12 = i11;
                        f31 = L6;
                        f32 = 90.0f;
                        i13 = -1;
                        float f77222 = f28 + this.B0 + L5;
                        f33 = f30;
                        min2 = Math.min(f77222, f33);
                        if (min2 >= f33 - g0.L(1.0f)) {
                        }
                        if (!this.L0) {
                        }
                        if (this.D1 == null) {
                        }
                        f34 = this.J0;
                        if (f34 >= 0.0f) {
                        }
                        f35 = f32;
                        this.J0 = f78;
                        this.K0 = false;
                        float f79222 = max3;
                        Canvas canvas3222 = canvas2;
                        h(f78, L4, f79222, i12, canvas3222, z12);
                        float L10222 = f29 - g0.L(2.0f);
                        float max12222 = Math.max(f31, (f28 - g0.L(12.0f)) - g0.L(36.0f));
                        this.P = k(this.P, f79222, this.O == null ? 1.0f : 0.0f, f35);
                        str = this.O;
                        if (str == null) {
                        }
                        float measureText222 = this.e.measureText(str);
                        f36 = this.Q;
                        if (f36 > 0.0f) {
                        }
                        this.Q = measureText222;
                        float L11222 = g0.L(36.0f);
                        float L12222 = g0.L(10.0f) + L10222 + g0.L(20.0f) + g0.L(6.0f) + this.Q + g0.L(12.0f);
                        float f80222 = L11222 + max12222;
                        RectF rectF4222 = this.R;
                        rectF4222.set(L10222, max12222, g0.L(1.0f) + L12222 + g0.L(8.0f) + g0.L(20.0f) + g0.L(9.0f), f80222);
                        this.S.set(L10222, max12222, L12222, f80222);
                        this.T.set(L12222, max12222, rectF4222.right, f80222);
                        f37 = this.y0;
                        if (f37 > 0.001f) {
                        }
                        this.A0 = false;
                        invalidate();
                    }
                }
                f20 = f51;
                this.Q0 = f20;
                min = Math.min(f50, f20 - L5);
                f21 = this.N0;
                textPaint = this.c;
                if (f21 <= f19) {
                    StaticLayout a102 = a("A\nA", textPaint);
                    StaticLayout a112 = a("A", textPaint);
                    this.N0 = a102.getLineTop(1) - a102.getLineTop(0);
                    this.O0 = a112.getHeight();
                }
                f22 = this.N0;
                if (f22 <= 0.0f) {
                }
                f23 = this.O0;
                if (f23 <= 0.0f) {
                }
                if (f22 > 0.0f) {
                }
                f24 = max7;
                if (!this.L0) {
                }
                f25 = this.G0;
                if (f25 >= 0.0f) {
                }
                this.G0 = max8;
                if (!this.A0) {
                }
                float f5422 = max8;
                this.H0 = f5422;
                max = Math.max(this.E0, Math.min(height, Math.max(g0.L(64.0f), min - this.G0)));
                this.E0 = max;
                if (this.A0) {
                }
                this.B0 = max;
                float max922 = Math.max(0.0f, height - this.B0);
                textSize = textPaint.getTextSize() * 1.35f;
                max2 = Math.max(0.0f, height - max);
                if (uptimeMillis - this.R0 >= 900) {
                }
                if (this.U0) {
                }
                this.F0 = max2;
                float max1022 = Math.max(max922, max2);
                if (!this.U0) {
                }
                f26 = max922;
                f27 = 0.0f;
                this.C0 = Math.max(f27, Math.min(max1022, this.C0));
                float c122222 = (i11 - (c(i11) * f49)) + c11 + g0.L(12.0f);
                float L72222 = this.B0 + f5422 + g0.L(8.0f);
                RectF rectF22222 = this.d1;
                rectF22222.set(c11 - g0.L(12.0f), f5422 - g0.L(8.0f), c122222, L72222);
                if (this.y0 > 0.001f) {
                }
                j3 = uptimeMillis;
                f28 = f5422;
                f29 = c11;
                f30 = f20;
                i12 = i11;
                f31 = L6;
                f32 = 90.0f;
                i13 = -1;
                float f772222 = f28 + this.B0 + L5;
                f33 = f30;
                min2 = Math.min(f772222, f33);
                if (min2 >= f33 - g0.L(1.0f)) {
                }
                if (!this.L0) {
                }
                if (this.D1 == null) {
                }
                f34 = this.J0;
                if (f34 >= 0.0f) {
                }
                f35 = f32;
                this.J0 = f78;
                this.K0 = false;
                float f792222 = max3;
                Canvas canvas32222 = canvas2;
                h(f78, L4, f792222, i12, canvas32222, z12);
                float L102222 = f29 - g0.L(2.0f);
                float max122222 = Math.max(f31, (f28 - g0.L(12.0f)) - g0.L(36.0f));
                this.P = k(this.P, f792222, this.O == null ? 1.0f : 0.0f, f35);
                str = this.O;
                if (str == null) {
                }
                float measureText2222 = this.e.measureText(str);
                f36 = this.Q;
                if (f36 > 0.0f) {
                }
                this.Q = measureText2222;
                float L112222 = g0.L(36.0f);
                float L122222 = g0.L(10.0f) + L102222 + g0.L(20.0f) + g0.L(6.0f) + this.Q + g0.L(12.0f);
                float f802222 = L112222 + max122222;
                RectF rectF42222 = this.R;
                rectF42222.set(L102222, max122222, g0.L(1.0f) + L122222 + g0.L(8.0f) + g0.L(20.0f) + g0.L(9.0f), f802222);
                this.S.set(L102222, max122222, L122222, f802222);
                this.T.set(L122222, max122222, rectF42222.right, f802222);
                f37 = this.y0;
                if (f37 > 0.001f) {
                }
                this.A0 = false;
                invalidate();
            }
        } else {
            f10 = 16.0f;
            long j13 = uptimeMillis - this.s0;
            float interpolation = W1.getInterpolation(b(j13 / 200.0f));
            this.x0 = (1.0f - nrVar.getInterpolation(b((j13 - 40) / 300.0f))) * this.u0;
            float f84 = 1.0f - interpolation;
            this.y0 = this.v0 * f84;
            this.z0 = this.w0 * f84;
            float f85 = (-g0.L(6.0f)) * interpolation;
            this.j1 = g0.L(6.0f) * interpolation;
            if (j13 >= 340) {
                this.z0 = 0.0f;
                this.y0 = 0.0f;
                this.x0 = 0.0f;
                if (this.q0) {
                    return;
                }
                this.q0 = true;
                g0.g3(new hi.l(this, 27));
                return;
            }
            f11 = f85;
        }
        z10 = true;
        this.k1 = g0.T1(0.92f, 1.0f, this.z0);
        f12 = this.x0;
        float f442 = 1.0f;
        boolean z142 = z10;
        if (f12 <= 0.001f) {
        }
        if (this.c1 < 0) {
        }
        float c112 = c(i11);
        float L42 = g0.L(36.0f);
        float L52 = g0.L(f10);
        float f482 = i7;
        o oVar2 = this.a;
        float f492 = f14;
        ChatActivityEnterView chatActivityEnterView4 = oVar2.b.a;
        chatActivityEnterView4.getLocationInWindow(new int[2]);
        chatActivityEnterView4.c2.getLocationInWindow(new int[2]);
        float min32 = Math.min(f482, (r8[1] - r14[1]) - getTop()) - g0.L(18.0f);
        if (this.l0 != null) {
        }
        this.b1 = k(this.b1, max3, !z11 ? 1.0f : 0.0f, 60.0f);
        if (!z11) {
        }
        height = staticLayout == null ? staticLayout.getHeight() : g0.L(30.0f);
        float L62 = g0.L(8.0f) + Math.max((int) r11, g0.m - this.c1);
        L = g0.L(36.0f) + L62 + g0.L(12.0f);
        float f502 = (min32 - L42) - L52;
        float max72 = Math.max(L, ((Math.max(0.0f, f502 - L) * 0.3f) + L) - g0.L(36.0f));
        ChatActivityEnterView chatActivityEnterView22 = oVar2.b.a;
        rgVar = chatActivityEnterView22.E2;
        RectF rectF7 = chatActivityEnterView22.I4;
        if (rgVar == null) {
        }
        staticLayout2 = staticLayout;
        z12 = z11;
        f18 = f17;
        top = f18 - getTop();
        if (this.M0) {
        }
        ChatActivityEnterView chatActivityEnterView32 = oVar2.b.a;
        chatActivityEnterView32.getLocationInWindow(new int[2]);
        chatActivityEnterView32.c2.getLocationInWindow(new int[2]);
        top = Math.min(f482, (r7[1] - r8[1]) - getTop()) - g0.L(42.0f);
        float f512 = top - (L42 / f492);
        if (this.P0) {
        }
        f19 = 0.0f;
        f20 = f512;
        this.Q0 = f20;
        min = Math.min(f502, f20 - L52);
        f21 = this.N0;
        textPaint = this.c;
        if (f21 <= f19) {
        }
        f22 = this.N0;
        if (f22 <= 0.0f) {
        }
        f23 = this.O0;
        if (f23 <= 0.0f) {
        }
        if (f22 > 0.0f) {
        }
        f24 = max72;
        if (!this.L0) {
        }
        f25 = this.G0;
        if (f25 >= 0.0f) {
        }
        this.G0 = max8;
        if (!this.A0) {
        }
        float f54222 = max8;
        this.H0 = f54222;
        max = Math.max(this.E0, Math.min(height, Math.max(g0.L(64.0f), min - this.G0)));
        this.E0 = max;
        if (this.A0) {
        }
        this.B0 = max;
        float max9222 = Math.max(0.0f, height - this.B0);
        textSize = textPaint.getTextSize() * 1.35f;
        max2 = Math.max(0.0f, height - max);
        if (uptimeMillis - this.R0 >= 900) {
        }
        if (this.U0) {
        }
        this.F0 = max2;
        float max10222 = Math.max(max9222, max2);
        if (!this.U0) {
        }
        f26 = max9222;
        f27 = 0.0f;
        this.C0 = Math.max(f27, Math.min(max10222, this.C0));
        float c1222222 = (i11 - (c(i11) * f492)) + c112 + g0.L(12.0f);
        float L722222 = this.B0 + f54222 + g0.L(8.0f);
        RectF rectF222222 = this.d1;
        rectF222222.set(c112 - g0.L(12.0f), f54222 - g0.L(8.0f), c1222222, L722222);
        if (this.y0 > 0.001f) {
        }
        j3 = uptimeMillis;
        f28 = f54222;
        f29 = c112;
        f30 = f20;
        i12 = i11;
        f31 = L62;
        f32 = 90.0f;
        i13 = -1;
        float f7722222 = f28 + this.B0 + L52;
        f33 = f30;
        min2 = Math.min(f7722222, f33);
        if (min2 >= f33 - g0.L(1.0f)) {
        }
        if (!this.L0) {
        }
        if (this.D1 == null) {
        }
        f34 = this.J0;
        if (f34 >= 0.0f) {
        }
        f35 = f32;
        this.J0 = f78;
        this.K0 = false;
        float f7922222 = max3;
        Canvas canvas322222 = canvas2;
        h(f78, L42, f7922222, i12, canvas322222, z12);
        float L1022222 = f29 - g0.L(2.0f);
        float max1222222 = Math.max(f31, (f28 - g0.L(12.0f)) - g0.L(36.0f));
        this.P = k(this.P, f7922222, this.O == null ? 1.0f : 0.0f, f35);
        str = this.O;
        if (str == null) {
        }
        float measureText22222 = this.e.measureText(str);
        f36 = this.Q;
        if (f36 > 0.0f) {
        }
        this.Q = measureText22222;
        float L1122222 = g0.L(36.0f);
        float L1222222 = g0.L(10.0f) + L1022222 + g0.L(20.0f) + g0.L(6.0f) + this.Q + g0.L(12.0f);
        float f8022222 = L1122222 + max1222222;
        RectF rectF422222 = this.R;
        rectF422222.set(L1022222, max1222222, g0.L(1.0f) + L1222222 + g0.L(8.0f) + g0.L(20.0f) + g0.L(9.0f), f8022222);
        this.S.set(L1022222, max1222222, L1222222, f8022222);
        this.T.set(L1222222, max1222222, rectF422222.right, f8022222);
        f37 = this.y0;
        if (f37 > 0.001f) {
        }
        this.A0 = false;
        invalidate();
    }

    @Override // android.view.View
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        int c10 = (int) ((i7 - (c(i7) * 2.0f)) - g0.L(28.0f));
        if (c10 != this.n0 && c10 > 0) {
            this.n0 = c10;
            this.O0 = 0.0f;
            this.N0 = 0.0f;
            this.m0 = a(this.M, this.d);
            q();
        }
        this.c1 = -1;
        if (getParent() instanceof View) {
            View view = (View) getParent();
            StringBuilder sb2 = new StringBuilder("overlay bounds top=");
            sb2.append(getTop());
            sb2.append(" h=");
            sb2.append(i10);
            sb2.append(" parent h=");
            sb2.append(view.getHeight());
            p5.c.t(sb2, (getTop() == 0 && i10 == view.getHeight()) ? " (full-screen ok)" : "  ← NOT full-screen: a strip stays unblurred", "VoiceLive");
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        boolean z10 = false;
        if (!this.p0) {
            return false;
        }
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.q1 = x10;
            this.s1 = y10;
            this.r1 = y10;
            this.u1 = false;
            boolean isEmpty = this.k0.trim().isEmpty();
            int o4 = o(x10, y10);
            this.l1 = o4;
            if (o4 < 0) {
                this.l1 = isEmpty ? -1 : n(x10, y10);
            }
            if (this.l1 < 0 && this.d1.contains(x10, y10)) {
                z10 = true;
            }
            this.t1 = z10;
            if (z10) {
                if (this.v1 == null) {
                    this.v1 = VelocityTracker.obtain();
                }
                this.v1.clear();
                this.v1.addMovement(motionEvent);
                this.D0 = 0.0f;
            }
            invalidate();
            return true;
        }
        if (actionMasked == 1) {
            int i7 = this.l1;
            this.l1 = -1;
            if (i7 >= 0) {
                int o10 = o(x10, y10);
                if (o10 < 0) {
                    o10 = n(x10, y10);
                }
                if (o10 == i7) {
                    try {
                        performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    post(new c1(this, i7, 15));
                }
            }
            if (this.t1 && this.u1 && (velocityTracker = this.v1) != null) {
                velocityTracker.addMovement(motionEvent);
                this.v1.computeCurrentVelocity(1);
                this.D0 = -this.v1.getYVelocity();
            }
            this.u1 = false;
            this.t1 = false;
            invalidate();
            return true;
        }
        if (actionMasked != 2) {
            if (actionMasked != 3) {
                return true;
            }
            this.l1 = -1;
            this.u1 = false;
            this.t1 = false;
            invalidate();
            return true;
        }
        int i10 = this.l1;
        int i11 = this.w1;
        if (i10 >= 0) {
            int o11 = o(x10, y10);
            if (o11 < 0) {
                o11 = n(x10, y10);
            }
            if (o11 != this.l1 && Math.hypot(x10 - this.q1, y10 - this.r1) > i11) {
                this.l1 = -1;
            }
        }
        if (this.t1) {
            this.v1.addMovement(motionEvent);
            if (!this.u1 && Math.abs(y10 - this.r1) > i11) {
                this.u1 = true;
                this.U0 = false;
                this.s1 = y10;
            }
            if (this.u1) {
                this.C0 -= y10 - this.s1;
                this.s1 = y10;
            }
        }
        invalidate();
        return true;
    }

    public final void q() {
        if (this.n0 <= 0) {
            return;
        }
        if (this.k0.isEmpty()) {
            this.l0 = null;
            return;
        }
        SpannableString spannableString = new SpannableString(this.k0);
        ArrayList arrayList = this.o0;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            q qVar = (q) obj;
            int i10 = qVar.b;
            if (i10 > qVar.a && i10 <= spannableString.length()) {
                spannableString.setSpan(new j2(qVar, 2), qVar.a, qVar.b, 65569);
            }
        }
        int i11 = this.y1;
        if (i11 >= 0 && i11 < spannableString.length()) {
            spannableString.setSpan(new b(1), this.y1, spannableString.length(), 33);
        }
        this.l0 = a(spannableString, this.c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void r(String str) {
        if (str == null) {
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        StaticLayout staticLayout = this.l0;
        this.D1 = staticLayout;
        this.C1 = uptimeMillis;
        int i7 = 1;
        if (this.P0) {
            this.M0 = true;
        }
        float f10 = this.H0;
        if (f10 < 0.0f) {
            f10 = 0.0f;
        }
        this.I0 = f10 - this.C0;
        this.H0 = -1.0f;
        this.G0 = -1.0f;
        this.E0 = 0.0f;
        this.F0 = 0.0f;
        this.U0 = true;
        this.D0 = 0.0f;
        this.K0 = true;
        if (staticLayout != null) {
            Random random = new Random();
            int i10 = X1;
            float f11 = 0.45f;
            float f12 = 0.5f;
            int[] iArr = {i10, i0.a.f(0.45f, i10, -1), i0.a.f(0.5f, X1, -10493697), -1};
            int i11 = 0;
            while (i11 < this.D1.getLineCount()) {
                float lineLeft = this.D1.getLineLeft(i11);
                float lineRight = this.D1.getLineRight(i11);
                float lineTop = this.D1.getLineTop(i11);
                float lineBottom = this.D1.getLineBottom(i11);
                float f13 = lineRight - lineLeft;
                float f14 = f11;
                float f15 = f12;
                int min = (int) Math.min(140.0f, f13 / g0.L(2.6f));
                int i12 = 0;
                while (i12 < min) {
                    float h = c0.h(random, f13, lineLeft);
                    float nextFloat = (random.nextFloat() * 0.6f) + 0.2f;
                    int i13 = i7;
                    float c10 = e2.c(h, Math.max(i7, this.n0), 520.0f, uptimeMillis);
                    float nextFloat2 = ((random.nextFloat() - f15) * g0.L(36.0f)) / 1000.0f;
                    long j3 = uptimeMillis;
                    float f16 = (-((random.nextFloat() * g0.L(34.0f)) + g0.L(10.0f))) / 1000.0f;
                    float h7 = c0.h(random, 380.0f, 480.0f);
                    float f17 = iArr[random.nextInt(4)];
                    float e10 = c0.e(0.75f, random.nextFloat(), g0.N(f14));
                    float[] fArr = new float[8];
                    fArr[0] = h;
                    fArr[i13] = (nextFloat * (lineBottom - lineTop)) + lineTop;
                    fArr[2] = nextFloat2;
                    fArr[3] = f16;
                    fArr[4] = c10;
                    fArr[5] = h7;
                    fArr[6] = f17;
                    fArr[7] = e10;
                    this.E1.add(fArr);
                    i12++;
                    i7 = i13;
                    uptimeMillis = j3;
                    random = random;
                }
                i11++;
                f12 = f15;
                f11 = f14;
            }
        }
        long j10 = uptimeMillis;
        this.k0 = "";
        ArrayList arrayList = this.o0;
        arrayList.clear();
        this.A1 = i7;
        setText(str);
        this.A1 = false;
        if (this.l0 != null) {
            int size = arrayList.size();
            int i14 = 0;
            while (i14 < size) {
                Object obj = arrayList.get(i14);
                i14++;
                q qVar = (q) obj;
                if (qVar.a < this.k0.length()) {
                    qVar.c = j10 + ((long) (b((this.l0.getPrimaryHorizontal(Math.max(qVar.a, Math.min(qVar.b, this.k0.length()) - 1)) + g0.L(60.0f)) / f3.b(120.0f, this.n0, 1)) * 520.0f)) + 60;
                    qVar.d = 0.0f;
                }
            }
        }
        invalidate();
    }

    public final void s() {
        Object obj;
        if (Build.VERSION.SDK_INT >= 29 && (obj = this.d0) != null) {
            a0.d(obj).discardDisplayList();
        }
        this.d0 = null;
        this.e0 = -1.0f;
    }

    public void setAccent(int i7) {
        this.i0 = i7 | (-16777216);
    }

    public void setBusy(boolean z10) {
        if (this.z1 == z10) {
            return;
        }
        this.z1 = z10;
        this.B1 = SystemClock.uptimeMillis();
        if (!z10) {
            this.c.setShader(null);
        }
        invalidate();
    }

    public void setEditMenuProgress(float f10) {
        this.Q1 = f10;
        invalidate();
    }

    public void setEditPillHidden(boolean z10) {
        this.P1 = z10;
        if (!z10) {
            this.Q1 = 0.0f;
            if (this.P0) {
                this.x1 = null;
            }
            String str = this.x1;
            if (str != null) {
                this.x1 = null;
                setText(str);
            }
        }
        invalidate();
    }

    public void setLanguage(CharSequence charSequence) {
        String charSequence2 = charSequence == null ? null : charSequence.toString();
        this.O = charSequence2;
        if (this.y0 < 0.01f) {
            this.P = charSequence2 != null ? 1.0f : 0.0f;
            this.Q = 0.0f;
        }
        invalidate();
    }

    public void setLanguagePillHidden(boolean z10) {
        this.W = z10;
        invalidate();
    }

    public void setLevel(float f10) {
        this.X0 = Math.max(0.0f, Math.min(1.0f, f10));
    }

    public void setListening(boolean z10) {
        this.Z0 = z10;
        invalidate();
    }

    public void setPlaceholder(String str) {
        if (str == null) {
            str = this.L;
        }
        if (str.equals(this.M)) {
            return;
        }
        this.M = str;
        if (this.n0 > 0) {
            this.m0 = a(str, this.d);
        }
        invalidate();
    }

    public void setReview(boolean z10) {
        this.P0 = z10;
        invalidate();
    }

    public void setStyleIcon(Drawable drawable) {
        Drawable drawable2 = this.K;
        if (drawable2 instanceof p5) {
            ((p5) drawable2).n(this);
        }
        this.K = drawable;
        if (drawable instanceof p5) {
            ((p5) drawable).a(this);
        }
        invalidate();
    }

    public void setStyleLabel(String str) {
        invalidate();
    }

    public void setText(String str) {
        t(-1, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x013b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(int i7, String str) {
        boolean z10;
        long min;
        String str2;
        ArrayList arrayList;
        int i10;
        int i11 = i7;
        String str3 = str == null ? "" : str;
        if (i11 < 0 || i11 >= str3.length()) {
            i11 = -1;
        }
        if (i11 != this.y1) {
            this.y1 = i11;
            if (str3.equals(this.k0) && !this.P1) {
                q();
                invalidate();
            }
        }
        if (this.P1) {
            this.x1 = str3;
            return;
        }
        if (str3.equals(this.k0)) {
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        String str4 = this.k0;
        int min2 = Math.min(str4.length(), str3.length());
        int i12 = 0;
        while (i12 < min2 && str4.charAt(i12) == str3.charAt(i12)) {
            i12++;
        }
        ArrayList arrayList2 = this.o0;
        ArrayList arrayList3 = new ArrayList(arrayList2);
        for (int size = arrayList2.size() - 1; size >= 0; size--) {
            q qVar = (q) arrayList2.get(size);
            if (qVar.a >= i12 || uptimeMillis - qVar.c > 1950) {
                arrayList2.remove(size);
            } else if (qVar.b > i12) {
                qVar.b = i12;
            }
        }
        int i13 = 0;
        boolean z11 = false;
        while (i12 < str3.length()) {
            int i14 = i12;
            while (i14 < str3.length() && Character.isWhitespace(str3.charAt(i14))) {
                i14++;
            }
            while (i14 < str3.length() && !Character.isWhitespace(str3.charAt(i14))) {
                i14++;
            }
            q qVar2 = new q();
            qVar2.a = i12;
            qVar2.b = i14;
            if (this.A1) {
                z10 = z11;
                min = (i13 * 28) + 200 + uptimeMillis;
            } else {
                z10 = z11;
                min = (Math.min(i13, 5) * 45) + uptimeMillis;
            }
            qVar2.c = min;
            qVar2.d = 0.0f;
            if (this.A1 || i12 >= str4.length()) {
                str2 = str4;
                arrayList = arrayList3;
                z11 = z10;
            } else {
                qVar2.d = 1.0f;
                if (!z10) {
                    int i15 = i12;
                    while (i15 < str4.length() && Character.isWhitespace(str4.charAt(i15))) {
                        i15++;
                    }
                    while (i15 < str4.length() && !Character.isWhitespace(str4.charAt(i15))) {
                        i15++;
                    }
                    if (!p(str4.substring(i12, i15)).equals(p(str3.substring(i12, i14)))) {
                        z11 = true;
                        if (z11) {
                            long j3 = uptimeMillis - 2000;
                            int size2 = arrayList3.size();
                            int i16 = 0;
                            while (true) {
                                if (i16 >= size2) {
                                    str2 = str4;
                                    arrayList = arrayList3;
                                    break;
                                }
                                Object obj = arrayList3.get(i16);
                                int i17 = i16 + 1;
                                str2 = str4;
                                q qVar3 = (q) obj;
                                arrayList = arrayList3;
                                int i18 = qVar3.a;
                                if (i18 <= i12) {
                                    i10 = i17;
                                    if (i12 < Math.max(qVar3.b, i18 + 1)) {
                                        j3 = qVar3.c;
                                        break;
                                    }
                                } else {
                                    i10 = i17;
                                }
                                arrayList3 = arrayList;
                                str4 = str2;
                                i16 = i10;
                            }
                            qVar2.c = j3;
                        } else {
                            str2 = str4;
                            arrayList = arrayList3;
                            qVar2.c = uptimeMillis;
                        }
                    }
                }
                z11 = z10;
                if (z11) {
                }
            }
            arrayList2.add(qVar2);
            i13++;
            i12 = i14;
            arrayList3 = arrayList;
            str4 = str2;
        }
        this.k0 = str3;
        this.R0 = uptimeMillis;
        q();
        invalidate();
    }
}
