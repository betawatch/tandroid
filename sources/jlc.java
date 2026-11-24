// default package

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
import java.util.ArrayList;
import java.util.Random;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.c;
import org.telegram.ui.Components.l;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class jlc extends View {
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
    public final glc a;
    public boolean a0;
    public float a1;
    public final ylb b;
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
    public static final d53 U1 = new d53(0.4d, 0.0d, 0.2d, 1.0d);
    public static final d53 V1 = d53.h;
    public static final d53 W1 = new d53(0.4d, 0.0d, 1.0d, 1.0d);
    public static final OvershootInterpolator a2 = new OvershootInterpolator(1.3f);

    static {
        new d53(0.3d, 0.0d, 0.1d, 1.0d);
    }

    public jlc(Context context, ylb ylbVar, glc glcVar) {
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
        String M0 = jb6.M0(2131744986, null);
        this.L = M0;
        this.M = M0;
        this.N = jb6.M0(2131744995, null);
        this.R = new RectF();
        this.S = new RectF();
        this.T = new RectF();
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
        this.b = ylbVar;
        this.a = glcVar;
        this.w1 = ViewConfiguration.get(context).getScaledTouchSlop();
        textPaint.setTextSize(gm.L(21.0f));
        textPaint2.setTextSize(gm.L(21.0f));
        hg9.o(textPaint3, gm.L(14.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(gm.N(0.66f));
        paint2.setShader(linearGradient);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.G = context.getResources().getDrawable(R.drawable.msg_edit).mutate();
        this.H = b10.d(context, R.drawable.send_plane_24);
        this.I = jb6.M0(2131751272, null);
        this.J = jb6.M0(2131744968, null);
        setVisibility(8);
    }

    public static float b(float f) {
        if (f < 0.0f) {
            return 0.0f;
        }
        if (f > 1.0f) {
            return 1.0f;
        }
        return f;
    }

    public static float c(int i) {
        return Math.max(gm.L(28.0f), (i - gm.L(560.0f)) / 2.0f);
    }

    public static float k(float f, float f2, float f3, float f4) {
        return td4.A(1.0f, (float) Math.exp((-f2) / f4), f3 - f, f);
    }

    public static String p(String str) {
        StringBuilder sb = new StringBuilder(str.length());
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (Character.isLetterOrDigit(charAt)) {
                sb.append(Character.toLowerCase(charAt));
            }
        }
        return sb.toString();
    }

    public final StaticLayout a(CharSequence charSequence, TextPaint textPaint) {
        return StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, this.n0).setAlignment(Layout.Alignment.ALIGN_NORMAL).setLineSpacing(gm.L(4.0f), 1.0f).setIncludePad(false).build();
    }

    public final void d(Canvas canvas) {
        Canvas canvas2;
        if (getParent() instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) getParent();
            int indexOfChild = viewGroup.indexOfChild(this);
            canvas.save();
            canvas.translate(-getLeft(), -getTop());
            int i = 0;
            while (i < indexOfChild) {
                View childAt = viewGroup.getChildAt(i);
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
                    } catch (Throwable th) {
                        fc4.g(th, true);
                    }
                    canvas2.restoreToCount(save);
                }
                i++;
                canvas = canvas2;
            }
            canvas.restore();
        }
    }

    public final void e(Canvas canvas, RectF rectF, int i, float f) {
        i(canvas, this.I, rectF.left + gm.L(14.0f), rectF.centerY(), i, f);
        float centerY = rectF.centerY();
        float L = rectF.right - (gm.L(10.0f) + (gm.L(14.0f) + (gm.L(8.0f) + gm.L(1.0f))));
        Paint paint = this.w;
        paint.setColor(i);
        paint.setAlpha((int) (35.7f * f));
        canvas.drawRect(L, centerY - gm.L(9.0f), gm.N(1.0f) + L, centerY + gm.L(9.0f), paint);
        Path path = this.H1;
        if (path.isEmpty()) {
            path.moveTo(-gm.N(3.8f), gm.N(3.8f));
            path.lineTo(0.0f, 0.0f);
            path.lineTo(gm.N(3.8f), gm.N(3.8f));
        }
        Paint.Style style = Paint.Style.STROKE;
        Paint paint2 = this.I1;
        paint2.setStyle(style);
        paint2.setStrokeWidth(gm.N(1.75f));
        Paint.Cap cap = Paint.Cap.ROUND;
        paint2.setStrokeCap(cap);
        paint2.setStrokeJoin(Paint.Join.ROUND);
        paint2.setColor(i);
        float f2 = f * 255.0f;
        int i2 = (int) f2;
        paint2.setAlpha(i2);
        float L2 = L + gm.L(1.0f) + gm.L(8.0f) + gm.L(7.0f);
        if (this.z1) {
            float L3 = gm.L(6.5f);
            Paint paint3 = this.N1;
            paint3.setStyle(style);
            paint3.setStrokeWidth(gm.N(1.75f));
            paint3.setStrokeCap(cap);
            paint3.setColor(i);
            paint3.setAlpha((int) (f2 * 0.9f));
            RectF rectF2 = gm.P;
            rectF2.set(L2 - L3, centerY - L3, L2 + L3, centerY + L3);
            canvas.drawArc(rectF2, ((SystemClock.uptimeMillis() % 900) / 900.0f) * 360.0f, 270.0f, false, paint3);
            return;
        }
        if (this.K == null) {
            canvas.save();
            canvas.translate(L2, (centerY - gm.N(1.9f)) - gm.N(0.4f));
            canvas.drawPath(path, paint2);
            canvas.restore();
            return;
        }
        int L4 = gm.L(20.0f);
        Drawable drawable = this.K;
        float f3 = L4 / 2.0f;
        drawable.setBounds((int) (L2 - f3), (int) (centerY - f3), (int) (L2 + f3), (int) (centerY + f3));
        this.K.setAlpha(i2);
        this.K.draw(canvas);
    }

    public final void f(Canvas canvas, float f, float f2, float f3, float f4, boolean z, float f5) {
        Matrix matrix = this.F;
        matrix.reset();
        if (z) {
            matrix.setScale(1.0f, -(f4 - f2));
            matrix.postTranslate(0.0f, f4);
        } else {
            matrix.setScale(1.0f, f4 - f2);
            matrix.postTranslate(0.0f, f2);
        }
        this.E.setLocalMatrix(matrix);
        Paint paint = this.y;
        paint.setAlpha((int) (f5 * 255.0f));
        canvas.drawRect(f, f2, f3, f4, paint);
    }

    public final void g(Canvas canvas, RectF rectF, float f, float f2, float f3) {
        canvas.save();
        float height = rectF.height() / 2.0f;
        boolean z = this.g0;
        RectF rectF2 = this.e1;
        Path path = this.L1;
        Paint paint = this.K1;
        Paint paint2 = this.n;
        if (z) {
            paint2.clearShadowLayer();
            if (this.d0 != null && Build.VERSION.SDK_INT >= 31 && canvas.isHardwareAccelerated()) {
                if (this.R1 == null) {
                    ColorMatrix colorMatrix = new ColorMatrix();
                    colorMatrix.setSaturation(1.7f);
                    colorMatrix.postConcat(new ColorMatrix(new float[]{0.95f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.95f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.95f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f}));
                    Paint paint3 = new Paint();
                    this.R1 = paint3;
                    paint3.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                }
                this.R1.setAlpha((int) (f2 * 255.0f));
                canvas.save();
                path.rewind();
                path.addRoundRect(rectF, height, height, Path.Direction.CW);
                canvas.clipPath(path);
                float f4 = 1.0f / f3;
                canvas.scale(f4, f4, rectF.centerX(), rectF.centerY());
                float f5 = 1.0f / this.T1;
                canvas.scale(f5, f5, rectF2.left, rectF2.centerY());
                canvas.translate(0.0f, -this.j1);
                int saveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), this.R1);
                canvas.scale(4.0f, 4.0f);
                canvas.drawRenderNode(qn0.c(this.d0));
                canvas.restoreToCount(saveLayer);
                canvas.restore();
            }
            paint2.setColor(cmb.p1(f2 * 0.55f, -14276047));
            canvas.drawRoundRect(rectF, height, height, paint2);
            paint.setShader(null);
            Paint.Style style = Paint.Style.STROKE;
            paint.setStyle(style);
            paint.setStrokeWidth(gm.N(0.66f));
            paint.setColor(cmb.p1(0.12f * f2, -1));
            RectF rectF3 = gm.P;
            rectF3.set(rectF);
            rectF3.inset(gm.N(0.33f), gm.N(0.33f));
            canvas.drawRoundRect(rectF3, height, height, paint);
            Paint paint4 = this.M1;
            paint4.setStyle(style);
            paint4.setStrokeWidth(gm.N(1.0f));
            int p1 = cmb.p1(0.19f * f2, -16777216);
            int i = 16777215 & p1;
            paint4.setShader(new LinearGradient(rectF.left, 0.0f, rectF.right, 0.0f, new int[]{p1, i, i, p1}, new float[]{0.0f, Math.min(0.45f, (height / rectF.width()) * 1.1f), Math.max(0.55f, 1.0f - ((height / rectF.width()) * 1.1f)), 1.0f}, Shader.TileMode.CLAMP));
            rectF3.set(rectF);
            rectF3.inset(-gm.N(0.5f), -gm.N(0.5f));
            canvas.drawRoundRect(rectF3, gm.N(0.5f) + height, gm.N(0.5f) + height, paint4);
        } else {
            paint2.clearShadowLayer();
            if (this.d0 != null && Build.VERSION.SDK_INT >= 31 && canvas.isHardwareAccelerated()) {
                if (this.S1 == null) {
                    ColorMatrix colorMatrix2 = new ColorMatrix();
                    colorMatrix2.setSaturation(1.3f);
                    colorMatrix2.postConcat(new ColorMatrix(new float[]{1.04f, 0.0f, 0.0f, 0.0f, 14.0f, 0.0f, 1.04f, 0.0f, 0.0f, 14.0f, 0.0f, 0.0f, 1.04f, 0.0f, 14.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f}));
                    Paint paint5 = new Paint();
                    this.S1 = paint5;
                    paint5.setColorFilter(new ColorMatrixColorFilter(colorMatrix2));
                }
                this.S1.setAlpha((int) (f2 * 255.0f));
                canvas.save();
                path.rewind();
                path.addRoundRect(rectF, height, height, Path.Direction.CW);
                canvas.clipPath(path);
                float f6 = 1.0f / f3;
                canvas.scale(f6, f6, rectF.centerX(), rectF.centerY());
                float f7 = 1.0f / this.T1;
                canvas.scale(f7, f7, rectF2.left, rectF2.centerY());
                canvas.translate(0.0f, -this.j1);
                int saveLayer2 = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), this.S1);
                canvas.scale(4.0f, 4.0f);
                canvas.drawRenderNode(qn0.c(this.d0));
                canvas.restoreToCount(saveLayer2);
                canvas.restore();
            }
            paint2.setColor(cmb.p1(0.62f * f2, -1));
            canvas.drawRoundRect(rectF, height, height, paint2);
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(gm.N(1.0f));
            paint.setShader(new LinearGradient(0.0f, rectF.top, 0.0f, rectF.bottom, new int[]{cmb.p1(0.95f * f2, -1), cmb.p1(0.25f * f2, -1), cmb.p1(f2 * 0.55f, -1)}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP));
            RectF rectF4 = gm.P;
            rectF4.set(rectF);
            rectF4.inset(gm.N(0.5f), gm.N(0.5f));
            canvas.drawRoundRect(rectF4, height, height, paint);
            paint.setShader(null);
            paint.setStrokeWidth(gm.N(0.66f));
            paint.setColor(cmb.p1(0.07f * f2, -16777216));
            rectF4.set(rectF);
            rectF4.inset(-gm.N(0.33f), -gm.N(0.33f));
            canvas.drawRoundRect(rectF4, gm.N(0.33f) + height, gm.N(0.33f) + height, paint);
        }
        if (f > 0.01f) {
            int i2 = this.g0 ? -1 : -16777216;
            Paint paint6 = this.w;
            paint6.setColor(i2);
            paint6.setAlpha((int) (20.4f * f * f2));
            canvas.drawRoundRect(rectF, height, height, paint6);
        }
        canvas.restore();
    }

    public final void h(float f, float f2, float f3, int i, Canvas canvas, boolean z) {
        float[] fArr;
        char c;
        float f4;
        float b;
        float f5;
        Canvas canvas2;
        float f6;
        float f7;
        int i2 = 0;
        while (true) {
            fArr = this.m1;
            float f8 = 1.0f;
            if (i2 >= fArr.length) {
                break;
            }
            float f9 = fArr[i2];
            if (this.l1 == i2) {
                f7 = 40.0f;
            } else {
                f8 = 0.0f;
                f7 = 70.0f;
            }
            fArr[i2] = k(f9, f3, f8, f7);
            i2++;
        }
        this.o1 = k(this.o1, f3, (this.K == null || this.z1) ? 0.0f : 1.0f, 90.0f);
        String str = this.I;
        TextPaint textPaint = this.e;
        float measureText = textPaint.measureText(str);
        float measureText2 = textPaint.measureText(this.J);
        float c2 = c(i) - gm.L(2.0f);
        float L = gm.L(10.0f) + gm.L(14.0f) + gm.L(8.0f) + gm.L(1.0f) + (this.K != null ? gm.L(4.0f) : 0);
        float L2 = gm.L(14.0f) + measureText + gm.L(12.0f);
        float f10 = this.O1;
        if (f10 > 0.0f) {
            L2 = k(f10, f3, L2, 110.0f);
        }
        this.O1 = L2;
        float f11 = f + f2;
        RectF rectF = this.h1;
        rectF.set(c2, f, L2 + c2, f11);
        float f12 = rectF.right;
        RectF rectF2 = this.i1;
        rectF2.set(f12, f, L + f12, f11);
        float f13 = rectF.left;
        float f14 = rectF2.right;
        RectF rectF3 = this.f1;
        rectF3.set(f13, f, f14, f11);
        float f15 = this.o1 * f2;
        float L3 = rectF3.right + gm.L(8.0f);
        float L4 = rectF3.right + gm.L(8.0f) + f2;
        RectF rectF4 = this.n1;
        rectF4.set(L3, f, L4, f11);
        float L5 = ((f15 + gm.L(8.0f)) * this.o1) + rectF3.right + gm.L(8.0f);
        RectF rectF5 = this.g1;
        rectF5.set(L5, f, measureText2 + L5 + gm.L(32.0f), f11);
        float f16 = rectF3.left;
        float f17 = rectF5.right;
        RectF rectF6 = this.e1;
        rectF6.set(f16, f, f17, f11);
        if (this.z0 > 0.001f) {
            if (z && this.S0 == 0) {
                this.S0 = SystemClock.uptimeMillis();
            }
            if (this.S0 == 0) {
                c = 0;
                f4 = 0.001f;
                b = 0.0f;
            } else {
                c = 0;
                f4 = 0.001f;
                b = b((SystemClock.uptimeMillis() - this.S0) / 460.0f);
            }
            float interpolation = !this.p0 ? this.T0 : a2.getInterpolation(b);
            this.T0 = interpolation;
            if (interpolation <= f4) {
                return;
            }
            boolean z2 = this.p0;
            float f18 = this.z0;
            if (z2) {
                f18 = b(f18 * 1.6f);
            }
            float b3 = b(this.T0 * 1.8f) * f18;
            float R1 = gm.R1(0.6f, 1.0f, this.b1) * b3;
            canvas.save();
            canvas.translate(0.0f, this.j1);
            float R12 = gm.R1(0.6f, 1.0f, this.T0) * this.k1;
            canvas.scale(R12, R12, rectF6.left, rectF6.centerY());
            this.T1 = R12;
            int i3 = this.g0 ? -1 : this.h0;
            float max = Math.max(fArr[c], fArr[2]);
            if (this.P1) {
                float b4 = b(1.0f - (this.Q1 / 0.35f));
                if (b4 > 0.01f) {
                    e(canvas, rectF3, i3, b4 * R1);
                }
                canvas2 = canvas;
                f5 = 2.0f;
                f6 = b3;
            } else {
                canvas.save();
                float f19 = 1.0f - (max * 0.05f);
                f5 = 2.0f;
                canvas.scale(f19, f19, rectF3.centerX(), rectF3.centerY());
                canvas2 = canvas;
                g(canvas2, rectF3, max, b3, f19);
                f6 = b3;
                e(canvas2, rectF3, i3, R1);
                canvas2.restore();
            }
            if (this.o1 > 0.01f) {
                canvas2.save();
                float R13 = gm.R1(0.6f, 1.0f, this.o1) * (1.0f - (fArr[3] * 0.05f));
                canvas2.scale(R13, R13, rectF4.centerX(), rectF4.centerY());
                g(canvas2, rectF4, fArr[3], f6 * this.o1, R13);
                Drawable drawable = this.p1;
                if (drawable == null) {
                    drawable = getContext().getResources().getDrawable(R.drawable.chats_undo).mutate();
                    this.p1 = drawable;
                }
                drawable.setColorFilter(new PorterDuffColorFilter(i3, PorterDuff.Mode.SRC_IN));
                this.p1.setAlpha((int) (255.0f * R1 * this.o1));
                float L6 = gm.L(22.0f) / f5;
                this.p1.setBounds((int) (rectF4.centerX() - L6), (int) (rectF4.centerY() - L6), (int) (rectF4.centerX() + L6), (int) (rectF4.centerY() + L6));
                this.p1.draw(canvas2);
                canvas2.restore();
            }
            canvas2.save();
            float f20 = 1.0f - (fArr[1] * 0.05f);
            canvas2.scale(f20, f20, rectF5.centerX(), rectF5.centerY());
            g(canvas2, rectF5, fArr[1], f6 * 1.0f, f20);
            i(canvas, this.J, gm.L(16.0f) + rectF5.left, rectF5.centerY(), i3, R1 * 1.0f);
            canvas.restore();
            canvas.restore();
        }
    }

    public final void i(Canvas canvas, String str, float f, float f2, int i, float f3) {
        TextPaint textPaint = this.e;
        textPaint.setColor(i);
        textPaint.setAlpha((int) (f3 * 255.0f));
        Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
        canvas.drawText(str, f, f2 - ((fontMetrics.ascent + fontMetrics.descent) / 2.0f), textPaint);
    }

    public final void j(Canvas canvas, RectF rectF, int i, float f) {
        if (this.U == null) {
            this.U = getContext().getResources().getDrawable(R.drawable.msg_language).mutate();
            this.V = getContext().getResources().getDrawable(R.drawable.msg_settings).mutate();
        }
        float centerY = rectF.centerY();
        Drawable drawable = this.U;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        drawable.setColorFilter(new PorterDuffColorFilter(i, mode));
        int i2 = (int) (255.0f * f);
        this.U.setAlpha(i2);
        int L = (int) (rectF.left + gm.L(10.0f));
        int L2 = (int) (centerY - gm.L(10.0f));
        this.U.setBounds(L, L2, gm.L(20.0f) + L, gm.L(20.0f) + L2);
        this.U.draw(canvas);
        float L3 = (((rectF.right - gm.L(9.0f)) - gm.L(20.0f)) - gm.L(8.0f)) - gm.L(1.0f);
        canvas.save();
        canvas.clipRect(rectF.left, rectF.top, L3 - gm.L(4.0f), rectF.bottom);
        String str = this.O;
        if (str == null) {
            str = this.N;
        }
        i(canvas, str, rectF.left + gm.L(10.0f) + gm.L(20.0f) + gm.L(6.0f), centerY, i, gm.R1(0.5f, 1.0f, this.P) * f);
        canvas.restore();
        Paint paint = this.w;
        paint.setColor(i);
        paint.setAlpha((int) (35.7f * f));
        canvas.drawRect(L3, centerY - gm.L(9.0f), gm.N(1.0f) + L3, centerY + gm.L(9.0f), paint);
        this.V.setColorFilter(new PorterDuffColorFilter(i, mode));
        this.V.setAlpha(i2);
        int L4 = (int) ((rectF.right - gm.L(9.0f)) - gm.L(10.0f));
        int i3 = (int) centerY;
        this.V.setBounds(L4 - gm.L(10.0f), i3 - gm.L(10.0f), gm.L(10.0f) + L4, gm.L(10.0f) + i3);
        this.V.draw(canvas);
    }

    public final void l(RectF rectF) {
        float f = this.T1;
        RectF rectF2 = this.e1;
        float centerY = rectF2.centerY();
        float f2 = rectF2.left;
        RectF rectF3 = this.f1;
        float A = td4.A(rectF3.left, f2, f, f2);
        float A2 = td4.A(rectF3.top, centerY, f, centerY);
        float f3 = this.j1;
        rectF.set(A, A2 + f3, td4.A(rectF3.right, f2, f, f2), ((rectF3.bottom - centerY) * f) + centerY + f3);
    }

    public final void m() {
        jlc jlcVar;
        if (!this.p0) {
            if (getVisibility() == 0 || (jlcVar = this.a.h) == null) {
                return;
            }
            gm.B2(jlcVar);
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

    public final int n(float f, float f2) {
        float f3 = 0.7f;
        if (this.z0 >= 0.7f && this.T0 >= 0.7f) {
            float L = gm.L(4.0f);
            float f4 = f2 - this.j1;
            int i = 0;
            RectF[] rectFArr = {this.h1, this.g1, this.i1, this.n1};
            while (i < 4) {
                if (i != 3 || this.o1 >= f3) {
                    RectF rectF = rectFArr[i];
                    RectF rectF2 = this.e1;
                    float f5 = rectF2.left;
                    float f6 = rectF.left - f5;
                    float f7 = this.k1;
                    float f8 = (f6 * f7) + f5;
                    float A = td4.A(rectF.right, f5, f7, f5);
                    float centerY = ((rectF.top - rectF2.centerY()) * this.k1) + rectF2.centerY();
                    float centerY2 = ((rectF.bottom - rectF2.centerY()) * this.k1) + rectF2.centerY();
                    if (f < f8 - (i == 2 ? 0.0f : L)) {
                        continue;
                    } else {
                        if (f <= A + (i != 0 ? L : 0.0f) && f4 >= centerY - L && f4 <= centerY2 + L) {
                            return i;
                        }
                    }
                }
                i++;
                f3 = 0.7f;
            }
        }
        return -1;
    }

    public final int o(float f, float f2) {
        if (this.y0 >= 0.7f) {
            RectF rectF = this.R;
            if (!rectF.isEmpty() && !this.W) {
                float L = gm.L(4.0f);
                if (f2 >= rectF.top - L && f2 <= rectF.bottom + L && f >= rectF.left - L && f <= rectF.right + L) {
                    return f >= this.T.left - ((float) gm.L(4.0f)) ? 5 : 4;
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
    /* JADX WARN: Removed duplicated region for block: B:102:0x046c  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0486  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x049f  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x04ab  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x04b7  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x04dc  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x050b  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0512 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0527  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x05d9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0b9a  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0ba0  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0ba5  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0bba  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0bfd  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0c0b  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0c1b  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0c7b  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0c00  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x06d0  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0541  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x050d  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x048d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0454  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0464  */
    /* JADX WARN: Type inference failed for: r10v32 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5, types: [int] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDraw(Canvas canvas) {
        float f;
        boolean z;
        float f2;
        int i;
        int i2;
        float f3;
        float f4;
        float f5;
        float f6;
        ?? r10;
        float f7;
        boolean z2;
        float f8;
        float f9;
        float f10;
        float min;
        float f11;
        TextPaint textPaint;
        float f12;
        float f13;
        float f14;
        float f15;
        float max;
        float f16;
        float textSize;
        float max2;
        float f17;
        float f18;
        int i3;
        long j;
        float f19;
        float f20;
        int i4;
        float f21;
        float f22;
        int i5;
        float min2;
        float f23;
        float f24;
        String str;
        float f25;
        float f26;
        RectF rectF;
        float f27;
        int size;
        int i6;
        int i7;
        float y;
        ArrayList arrayList;
        int i8;
        float f28;
        float f29;
        float f30;
        float f31;
        float f32;
        boolean z3;
        float f33;
        RecordingCanvas beginRecording;
        float f34;
        float A;
        Canvas canvas2 = canvas;
        long uptimeMillis = SystemClock.uptimeMillis();
        float max3 = this.t0 == 0 ? 16.0f : Math.max(1L, Math.min(48L, uptimeMillis - r2));
        this.t0 = uptimeMillis;
        b2 = uptimeMillis;
        int width = getWidth();
        int height = getHeight();
        if (width <= 0 || height <= 0) {
            return;
        }
        boolean z4 = this.p0;
        d53 d53Var = U1;
        if (z4) {
            long j2 = uptimeMillis - this.r0;
            this.x0 = d53Var.getInterpolation(b(j2 / 360.0f));
            float b = b((j2 - 60) / 460.0f);
            d53 d53Var2 = V1;
            this.y0 = d53Var2.getInterpolation(b);
            this.z0 = d53Var2.getInterpolation(b((j2 - 120) / 520.0f));
            float L = (1.0f - this.y0) * gm.L(14.0f);
            this.j1 = (1.0f - this.z0) * gm.L(18.0f);
            z = j2 < 700;
            f = L;
        } else {
            long j3 = uptimeMillis - this.s0;
            float interpolation = W1.getInterpolation(b(j3 / 200.0f));
            this.x0 = (1.0f - d53Var.getInterpolation(b((j3 - 40) / 300.0f))) * this.u0;
            float f35 = 1.0f - interpolation;
            this.y0 = this.v0 * f35;
            this.z0 = this.w0 * f35;
            float f36 = (-gm.L(6.0f)) * interpolation;
            this.j1 = gm.L(6.0f) * interpolation;
            if (j3 >= 340) {
                this.z0 = 0.0f;
                this.y0 = 0.0f;
                this.x0 = 0.0f;
                if (this.q0) {
                    return;
                }
                this.q0 = true;
                gm.c3(new f8c(this, (byte) 27));
                return;
            }
            f = f36;
            z = true;
        }
        this.k1 = gm.R1(0.92f, 1.0f, this.z0);
        float f37 = this.x0;
        float f38 = 1.0f;
        boolean z5 = z;
        if (f37 > 0.001f) {
            int width2 = getWidth();
            int height2 = getHeight();
            boolean z6 = this.j0 && canvas2.isHardwareAccelerated() && Build.VERSION.SDK_INT >= 31;
            if (z6) {
                i2 = 31;
                int width3 = getWidth();
                int height3 = getHeight();
                RenderNode c = qn0.c(this.d0);
                if (c == null) {
                    c = new RenderNode("VoiceLiveBackdrop");
                    this.d0 = c;
                    this.e0 = -1.0f;
                    f2 = f;
                    this.f0 = 0L;
                } else {
                    f2 = f;
                }
                int max4 = Math.max(1, (int) Math.ceil(width3 * 0.25f));
                int max5 = Math.max(1, (int) Math.ceil(height3 * 0.25f));
                f6 = max3;
                try {
                    if (z5) {
                        i = width;
                    } else {
                        i = width;
                        long j4 = this.f0;
                        if (j4 != 0 && uptimeMillis - j4 < 100 && c.getWidth() == max4 && c.getHeight() == max5) {
                            f34 = 0.25f;
                            z3 = false;
                            A = mlb.A(f37, 0.65f, 0.35f, gm.L(30.0f) * f34);
                            if (Math.abs(A - this.e0) > f34) {
                                this.e0 = A;
                                c.setRenderEffect(RenderEffect.createBlurEffect(A, A, Shader.TileMode.CLAMP));
                            }
                            c.setAlpha(f37);
                            canvas2.save();
                            f32 = 4.0f;
                            canvas2.scale(4.0f, 4.0f);
                            canvas2.drawRenderNode(c);
                            canvas2.restore();
                        }
                    }
                    beginRecording.scale(0.25f, 0.25f);
                    d(beginRecording);
                    A = mlb.A(f37, 0.65f, 0.35f, gm.L(30.0f) * f34);
                    if (Math.abs(A - this.e0) > f34) {
                    }
                    c.setAlpha(f37);
                    canvas2.save();
                    f32 = 4.0f;
                    canvas2.scale(4.0f, 4.0f);
                    canvas2.drawRenderNode(c);
                    canvas2.restore();
                } finally {
                }
                this.f0 = uptimeMillis;
                z3 = false;
                c.setPosition(0, 0, max4, max5);
                beginRecording = c.beginRecording(max4, max5);
                f34 = 0.25f;
            } else {
                f2 = f;
                i = width;
                i2 = 31;
                f32 = 4.0f;
                z3 = false;
                f6 = max3;
            }
            int i9 = this.g0 ? z6 ? -1978658282 : -300936682 : z6 ? 1811413242 : -285738758;
            f4 = f32;
            Paint paint = this.f;
            paint.setColor(i9);
            paint.setAlpha((int) (Color.alpha(i9) * f37));
            float f39 = width2;
            float f40 = height2;
            r10 = z3;
            f3 = 2.0f;
            f5 = -1.0f;
            canvas2.drawRect(0.0f, 0.0f, f39, f40, paint);
            float f41 = f39 / 2.0f;
            float L2 = gm.L(80.0f) + gm.m;
            float max6 = Math.max(width2, gm.L(200.0f)) * 0.95f;
            int i10 = (((((int) (f37 * 64.0f)) * 31) + width2) * 31) + this.i0 + (this.g0 ? 1 : 0);
            int i11 = this.r;
            Paint paint2 = this.h;
            if (i10 != i11) {
                this.r = i10;
                f33 = L2;
                paint2.setShader(new RadialGradient(f41, f33, max6, cmb.p1((this.g0 ? 0.16f : 0.1f) * f37, this.i0), 0, Shader.TileMode.CLAMP));
            } else {
                f33 = L2;
            }
            canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, f39, Math.min(f40, f33 + max6), paint2);
        } else {
            f2 = f;
            i = width;
            i2 = 31;
            f3 = 2.0f;
            f4 = 4.0f;
            f5 = -1.0f;
            f6 = max3;
            r10 = 0;
        }
        if (this.c1 < 0) {
            int[] iArr = new int[2];
            getLocationInWindow(iArr);
            this.c1 = iArr[1];
        }
        float c2 = c(i);
        float L3 = gm.L(36.0f);
        float L4 = gm.L(16.0f);
        float f42 = height;
        glc glcVar = this.a;
        ChatActivityEnterView chatActivityEnterView = glcVar.b.a;
        chatActivityEnterView.getLocationInWindow(new int[2]);
        chatActivityEnterView.c2.getLocationInWindow(new int[2]);
        float min3 = Math.min(f42, (r12[1] - r13[1]) - getTop()) - gm.L(18.0f);
        boolean z7 = (this.l0 == null || this.k0.trim().isEmpty()) ? r10 : true;
        float f43 = f3;
        this.b1 = k(this.b1, f6, z7 ? 1.0f : 0.0f, 60.0f);
        StaticLayout staticLayout = z7 ? this.l0 : this.m0;
        float height4 = staticLayout != null ? staticLayout.getHeight() : gm.L(30.0f);
        float L5 = gm.L(8.0f) + Math.max((int) r10, gm.m - this.c1);
        float L6 = gm.L(36.0f) + L5 + gm.L(12.0f);
        float f44 = (min3 - L3) - L4;
        float max7 = Math.max(L6, ((Math.max(0.0f, f44 - L6) * 0.3f) + L6) - gm.L(36.0f));
        ChatActivityEnterView chatActivityEnterView2 = glcVar.b.a;
        l lVar = chatActivityEnterView2.E2;
        RectF rectF2 = chatActivityEnterView2.H4;
        if (lVar == null || rectF2.isEmpty() || chatActivityEnterView2.E2.getVisibility() != 0) {
            f7 = L5;
            z2 = z7;
            f8 = f5;
        } else {
            f7 = L5;
            z2 = z7;
            chatActivityEnterView2.E2.getLocationInWindow(new int[2]);
            chatActivityEnterView2.c2.getLocationInWindow(new int[2]);
            f8 = rectF2.centerY() + (r6[1] - r12[1]);
        }
        float top = f8 - getTop();
        if (!this.M0 || top <= 0.0f) {
            c cVar = glcVar.b;
            ChatActivityEnterView chatActivityEnterView3 = cVar.a;
            chatActivityEnterView3.getLocationInWindow(new int[2]);
            chatActivityEnterView3.c2.getLocationInWindow(new int[2]);
            top = Math.min(f42, (r5[1] - r6[1]) - getTop()) - gm.L(42.0f);
        }
        float f45 = top - (L3 / f43);
        if (!this.P0 || this.M0) {
            f9 = 0.0f;
        } else {
            float f46 = this.Q0;
            f9 = 0.0f;
            if (f46 > 0.0f) {
                f10 = f46;
                this.Q0 = f10;
                min = Math.min(f44, f10 - L4);
                f11 = this.N0;
                textPaint = this.c;
                if (f11 <= f9 && this.n0 > 0) {
                    StaticLayout a = a("A\nA", textPaint);
                    StaticLayout a3 = a("A", textPaint);
                    this.N0 = a.getLineTop(1) - a.getLineTop(0);
                    this.O0 = a3.getHeight();
                }
                f12 = this.N0;
                if (f12 <= 0.0f) {
                    f12 = textPaint.getFontMetrics(null) + gm.L(f4);
                }
                f13 = this.O0;
                if (f13 <= 0.0f) {
                    f13 = textPaint.getFontMetrics(null);
                }
                if (f12 > 0.0f) {
                    float f47 = min - f13;
                    if (f47 > max7) {
                        f14 = f47 - (((int) Math.floor((f47 - max7) / f12)) * f12);
                        float max8 = this.L0 ? Math.max(L6, min - height4) : Math.max(L6, Math.min(f14, min - height4));
                        f15 = this.G0;
                        if (f15 >= 0.0f) {
                            max8 = Math.min(f15, max8);
                        }
                        this.G0 = max8;
                        if (!this.A0 && !this.K0) {
                            f31 = this.H0;
                            if (f31 >= 0.0f) {
                                max8 = k(f31, f6, max8, 160.0f);
                            }
                        }
                        float f48 = max8;
                        this.H0 = f48;
                        max = Math.max(this.E0, Math.min(height4, Math.max(gm.L(64.0f), min - this.G0)));
                        this.E0 = max;
                        if (!this.A0 || this.K0) {
                            this.B0 = max;
                            f16 = max;
                        } else {
                            f16 = k(this.B0, f6, max, 140.0f);
                            this.B0 = f16;
                        }
                        float max9 = Math.max(0.0f, height4 - f16);
                        textSize = textPaint.getTextSize() * 1.35f;
                        max2 = Math.max(0.0f, height4 - max);
                        boolean z8 = uptimeMillis - this.R0 < 900;
                        if (this.U0 && z8) {
                            max2 = mlb.f(max2, textSize, this.F0, max2);
                        }
                        this.F0 = max2;
                        float max10 = Math.max(max9, max2);
                        if (this.U0) {
                            this.C0 = (this.A0 || this.K0) ? this.F0 : k(this.C0, f6, this.F0, 160.0f);
                        } else if (!this.u1) {
                            if (Math.abs(this.D0) > 0.01f) {
                                float f49 = this.C0;
                                float f50 = this.D0;
                                this.C0 = (f50 * f6) + f49;
                                f17 = max9;
                                float exp = f50 * ((float) Math.exp((-f6) / 325.0f));
                                this.D0 = exp;
                                if (Math.abs(exp) <= 0.01f) {
                                    f18 = 0.0f;
                                    this.D0 = 0.0f;
                                    if (this.C0 >= f17 - gm.L(6.0f) && this.D0 >= f18) {
                                        this.U0 = true;
                                        this.D0 = f18;
                                    }
                                    this.C0 = Math.max(f18, Math.min(max10, this.C0));
                                    i3 = i;
                                    float c3 = (i3 - (c(i3) * f43)) + c2 + gm.L(12.0f);
                                    float L7 = this.B0 + f48 + gm.L(8.0f);
                                    float f51 = f17;
                                    RectF rectF3 = this.d1;
                                    rectF3.set(c2 - gm.L(12.0f), f48 - gm.L(8.0f), c3, L7);
                                    if (this.y0 > 0.001f || staticLayout == null) {
                                        j = uptimeMillis;
                                        f19 = f48;
                                        f20 = c2;
                                        i4 = i3;
                                        f21 = f7;
                                        f22 = 90.0f;
                                        i5 = -1;
                                    } else {
                                        StaticLayout staticLayout2 = this.D1;
                                        ArrayList arrayList2 = this.E1;
                                        if (staticLayout2 == null && arrayList2.isEmpty()) {
                                            f19 = f48;
                                            f21 = f7;
                                            rectF = rectF3;
                                            f22 = 90.0f;
                                            f27 = 140.0f;
                                            i6 = 3;
                                        } else {
                                            canvas2.save();
                                            canvas2.translate(c2, this.I0);
                                            if (this.D1 != null) {
                                                float b3 = b((uptimeMillis - this.C1) / 520.0f);
                                                if (b3 >= 1.0f) {
                                                    this.D1 = null;
                                                } else {
                                                    float L8 = gm.L(60.0f);
                                                    float g = aq1.g(L8, f43, this.n0, b3, -L8);
                                                    f19 = f48;
                                                    f21 = f7;
                                                    rectF = rectF3;
                                                    f22 = 90.0f;
                                                    f27 = 140.0f;
                                                    int saveLayer = canvas2.saveLayer(-gm.L(10.0f), -gm.L(10.0f), gm.L(30.0f) + this.n0, gm.L(10.0f) + this.D1.getHeight(), null);
                                                    this.D1.draw(canvas2);
                                                    PorterDuffXfermode porterDuffXfermode = new PorterDuffXfermode(PorterDuff.Mode.DST_OUT);
                                                    Paint paint3 = this.G1;
                                                    paint3.setXfermode(porterDuffXfermode);
                                                    paint3.setShader(new LinearGradient(g - L8, 0.0f, g + L8, 0.0f, -16777216, 0, Shader.TileMode.CLAMP));
                                                    canvas2.drawRect(-gm.L(10.0f), -gm.L(10.0f), gm.L(30.0f) + this.n0, gm.L(10.0f) + this.D1.getHeight(), paint3);
                                                    canvas2.restoreToCount(saveLayer);
                                                    size = arrayList2.size() - 1;
                                                    while (size >= 0) {
                                                        float[] fArr = (float[]) arrayList2.get(size);
                                                        float f52 = uptimeMillis - fArr[4];
                                                        if (f52 >= 0.0f) {
                                                            float f53 = fArr[5];
                                                            if (f52 > f53) {
                                                                arrayList2.remove(size);
                                                            } else {
                                                                float f54 = f52 / f53;
                                                                if (f54 < 0.15f) {
                                                                    y = f54 / 0.15f;
                                                                    i7 = size;
                                                                } else {
                                                                    i7 = size;
                                                                    y = td4.y(f54, 0.15f, 0.85f, f38);
                                                                }
                                                                int i12 = (int) fArr[6];
                                                                Paint paint4 = this.F1;
                                                                paint4.setColor(i12);
                                                                paint4.setAlpha((int) (b(y) * 255.0f));
                                                                arrayList = arrayList2;
                                                                canvas2.drawCircle((fArr[2] * f52) + fArr[0], (fArr[3] * f52) + fArr[1], mlb.B(f54, 0.4f, 1.0f, fArr[7]), paint4);
                                                                size = i7 - 1;
                                                                arrayList2 = arrayList;
                                                                f38 = 1.0f;
                                                            }
                                                        }
                                                        i7 = size;
                                                        arrayList = arrayList2;
                                                        size = i7 - 1;
                                                        arrayList2 = arrayList;
                                                        f38 = 1.0f;
                                                    }
                                                    i6 = 3;
                                                    canvas2.restore();
                                                }
                                            }
                                            f19 = f48;
                                            f21 = f7;
                                            rectF = rectF3;
                                            f22 = 90.0f;
                                            f27 = 140.0f;
                                            size = arrayList2.size() - 1;
                                            while (size >= 0) {
                                            }
                                            i6 = 3;
                                            canvas2.restore();
                                        }
                                        float L9 = this.C0 > 0.5f ? -getTop() : f19 - gm.L(f4);
                                        RectF rectF4 = rectF;
                                        int saveLayerAlpha = canvas2.saveLayerAlpha(rectF4.left, Math.min(rectF4.top, L9) + f2, rectF4.right, rectF4.bottom + f2, (int) (this.y0 * 255.0f));
                                        float f55 = f2;
                                        canvas2.translate(0.0f, f55);
                                        canvas2.save();
                                        canvas2.clipRect(rectF4.left, L9, rectF4.right, Math.max(this.B0, this.E0) + f19 + gm.L(6.0f));
                                        canvas2.translate(c2, f19 - this.C0);
                                        float f56 = this.b1;
                                        if (f56 >= 0.999f || this.m0 == null) {
                                            f20 = c2;
                                            i4 = i3;
                                            i8 = saveLayerAlpha;
                                            i5 = -1;
                                            f28 = L9;
                                        } else {
                                            float f57 = (1.0f - f56) * (this.g0 ? 0.9f : 0.85f);
                                            Object obj = this.d0;
                                            TextPaint textPaint2 = this.d;
                                            if (obj == null || Build.VERSION.SDK_INT < i2 || !canvas2.isHardwareAccelerated()) {
                                                f20 = c2;
                                                i4 = i3;
                                                i8 = saveLayerAlpha;
                                                i5 = -1;
                                                f28 = L9;
                                                textPaint2.setShader(null);
                                                textPaint2.setColor(cmb.p1((1.0f - this.b1) * (this.g0 ? 0.42f : 0.36f), this.h0));
                                                this.m0.draw(canvas2);
                                            } else {
                                                float f58 = -c2;
                                                f20 = c2;
                                                i8 = saveLayerAlpha;
                                                f28 = L9;
                                                canvas2 = canvas;
                                                int saveLayer2 = canvas2.saveLayer(f58, (this.C0 - f19) - f55, getWidth() - c2, ((this.C0 - f19) - f55) + getHeight(), null);
                                                textPaint2.setShader(null);
                                                textPaint2.setColor(-1);
                                                textPaint2.setAlpha((int) (f57 * 255.0f));
                                                this.m0.draw(canvas2);
                                                if (this.b0 == null || this.a0 != this.g0) {
                                                    this.a0 = this.g0;
                                                    ColorMatrix colorMatrix = new ColorMatrix();
                                                    colorMatrix.setSaturation(2.2f);
                                                    if (this.g0) {
                                                        f30 = 1.45f;
                                                        f29 = 72.0f;
                                                    } else {
                                                        f29 = -4.0f;
                                                        f30 = 0.5f;
                                                    }
                                                    float[] fArr2 = new float[20];
                                                    fArr2[0] = f30;
                                                    fArr2[1] = 0.0f;
                                                    fArr2[2] = 0.0f;
                                                    fArr2[i6] = 0.0f;
                                                    fArr2[4] = f29;
                                                    fArr2[5] = 0.0f;
                                                    fArr2[6] = f30;
                                                    fArr2[7] = 0.0f;
                                                    fArr2[8] = 0.0f;
                                                    fArr2[9] = f29;
                                                    fArr2[10] = 0.0f;
                                                    fArr2[11] = 0.0f;
                                                    fArr2[12] = f30;
                                                    fArr2[13] = 0.0f;
                                                    fArr2[14] = f29;
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
                                                i4 = i3;
                                                i5 = -1;
                                                int saveLayer3 = canvas2.saveLayer(f58, (this.C0 - f19) - f55, getWidth() - f20, ((this.C0 - f19) - f55) + getHeight(), this.b0);
                                                canvas2.save();
                                                canvas2.translate(f58, (this.C0 - f19) - f55);
                                                float f59 = f4;
                                                canvas2.scale(f59, f59);
                                                RenderNode c4 = qn0.c(this.d0);
                                                RenderNode c5 = qn0.c(this.c0);
                                                if (c5 == null) {
                                                    c5 = new RenderNode("VoiceLiveListen");
                                                    this.c0 = c5;
                                                    c5.setRenderEffect(RenderEffect.createBlurEffect(gm.L(f22) * 0.25f, gm.L(24.0f) * 0.25f, Shader.TileMode.CLAMP));
                                                }
                                                c5.setPosition(0, 0, c4.getWidth(), c4.getHeight());
                                                try {
                                                    c5.beginRecording(c4.getWidth(), c4.getHeight()).drawRenderNode(c4);
                                                    c5.endRecording();
                                                    canvas2.drawRenderNode(c5);
                                                    canvas2.restore();
                                                    canvas2.restoreToCount(saveLayer3);
                                                    canvas2.restoreToCount(saveLayer2);
                                                } finally {
                                                }
                                            }
                                        }
                                        if (this.z1) {
                                            float max11 = Math.max(gm.L(f27), this.n0 * 0.45f);
                                            float g2 = aq1.g(max11, 2.0f, this.n0, ((uptimeMillis - this.B1) % 1300) / 1300.0f, -max11);
                                            float[] fArr3 = new float[i6];
                                            // fill-array-data instruction
                                            fArr3[0] = 0.0f;
                                            fArr3[1] = 0.5f;
                                            fArr3[2] = 1.0f;
                                            textPaint.setShader(new LinearGradient(g2, 0.0f, g2 + max11, 0.0f, new int[]{this.h0, cmb.p1(1.0f, X1), this.h0}, fArr3, Shader.TileMode.CLAMP));
                                        }
                                        StaticLayout staticLayout3 = this.l0;
                                        if (staticLayout3 != null) {
                                            staticLayout3.draw(canvas2);
                                        }
                                        if (this.z1) {
                                            textPaint.setShader(null);
                                        }
                                        if (z2) {
                                            StaticLayout staticLayout4 = this.l0;
                                            int i13 = X1;
                                            float k = k(this.a1, f6, this.Z0 ? 1.0f : 0.0f, 80.0f);
                                            this.a1 = k;
                                            if (staticLayout4 != null && k >= 0.01f) {
                                                float lineRight = staticLayout4.getLineRight(staticLayout4.getLineCount() - 1) + gm.L(10.0f);
                                                float lineBaseline = staticLayout4.getLineBaseline(r4) - (textPaint.getTextSize() * 0.34f);
                                                this.V0 = lineRight;
                                                this.W0 = lineBaseline;
                                                float f60 = this.Y0;
                                                float f61 = this.X0;
                                                this.Y0 = k(f60, f6, f61, f61 > f60 ? 60.0f : 220.0f);
                                                float N = gm.N(2.2f);
                                                float N2 = gm.N(2.0f);
                                                float f62 = uptimeMillis / 1000.0f;
                                                Paint paint6 = this.x;
                                                paint6.setColor(i13);
                                                paint6.setAlpha((int) (Color.alpha(i13) * this.a1 * 1.0f));
                                                int i14 = 0;
                                                while (i14 < 3) {
                                                    double d = f62 * 2.0f * 3.141592653589793d;
                                                    long j5 = uptimeMillis;
                                                    double d2 = i14;
                                                    float R1 = gm.R1(0.4f, 1.0f, this.a1) * gm.U1(b((((((((float) Math.sin((1.9d * d2) + (1.6d * d))) * 0.5f) + 0.5f) * 0.55f) + 0.45f) * this.Y0) + (((float) Math.sin((1.3d * d2) + (d * 0.7d))) * 0.1f) + 0.16f), gm.L(2.5f), gm.L(10.5f));
                                                    float u = hg9.u(N, N2, i14, this.V0);
                                                    RectF rectF5 = gm.P;
                                                    float f63 = this.W0;
                                                    float f64 = R1 / 2.0f;
                                                    float f65 = N;
                                                    rectF5.set(u, f63 - f64, u + f65, f63 + f64);
                                                    float f66 = f65 / 2.0f;
                                                    canvas2.drawRoundRect(rectF5, f66, f66, paint6);
                                                    i14++;
                                                    N = f65;
                                                    uptimeMillis = j5;
                                                }
                                            }
                                        }
                                        j = uptimeMillis;
                                        canvas2.restore();
                                        float f67 = this.C0;
                                        if (f67 > 0.5f) {
                                            f(canvas2, rectF4.left, f28, rectF4.right, f19 + gm.L(30.0f), false, Math.min(1.0f, f67 / gm.L(40.0f)));
                                        }
                                        if (!this.U0) {
                                            float f68 = f51 - this.C0;
                                            if (f68 > 0.5f) {
                                                canvas2 = canvas;
                                                f(canvas2, rectF4.left, (f19 + this.B0) - gm.L(28.0f), rectF4.right, f19 + this.B0 + gm.L(6.0f), true, Math.min(1.0f, f68 / gm.L(28.0f)));
                                                canvas2.restoreToCount(i8);
                                            }
                                        }
                                        canvas2 = canvas;
                                        canvas2.restoreToCount(i8);
                                    }
                                    min2 = Math.min(f19 + this.B0 + L4, f10);
                                    if (min2 >= f10 - gm.L(1.0f)) {
                                        this.L0 = true;
                                    }
                                    if (!this.L0) {
                                        f10 = min2;
                                    }
                                    boolean z9 = this.D1 == null || j - this.C1 < 600;
                                    f23 = this.J0;
                                    if (f23 >= 0.0f || this.A0 || !z9) {
                                        f24 = f22;
                                    } else {
                                        f24 = f22;
                                        f10 = k(f23, f6, f10, f24);
                                    }
                                    this.J0 = f10;
                                    this.K0 = false;
                                    Canvas canvas3 = canvas2;
                                    h(f10, L3, f6, i4, canvas3, z2);
                                    float L10 = f20 - gm.L(2.0f);
                                    float max12 = Math.max(f21, (f19 - gm.L(12.0f)) - gm.L(36.0f));
                                    this.P = k(this.P, f6, this.O != null ? 1.0f : 0.0f, f24);
                                    str = this.O;
                                    if (str == null) {
                                        str = this.N;
                                    }
                                    float measureText = this.e.measureText(str);
                                    f25 = this.Q;
                                    if (f25 > 0.0f) {
                                        measureText = k(f25, f6, measureText, 110.0f);
                                    }
                                    this.Q = measureText;
                                    float L11 = gm.L(36.0f);
                                    float L12 = gm.L(10.0f) + L10 + gm.L(20.0f) + gm.L(6.0f) + this.Q + gm.L(12.0f);
                                    float f69 = L11 + max12;
                                    RectF rectF6 = this.R;
                                    rectF6.set(L10, max12, gm.L(1.0f) + L12 + gm.L(8.0f) + gm.L(20.0f) + gm.L(9.0f), f69);
                                    this.S.set(L10, max12, L12, f69);
                                    this.T.set(L12, max12, rectF6.right, f69);
                                    f26 = this.y0;
                                    if (f26 > 0.001f) {
                                        int i15 = this.g0 ? i5 : this.h0;
                                        float[] fArr4 = this.m1;
                                        float max13 = Math.max(fArr4[4], fArr4[5]);
                                        canvas3.save();
                                        canvas3.translate(0.0f, (1.0f - this.y0) * (-gm.L(6.0f)));
                                        if (this.W) {
                                            j(canvas3, rectF6, i15, f26);
                                        } else {
                                            float f70 = 1.0f - (0.04f * max13);
                                            canvas3.scale(f70, f70, rectF6.centerX(), rectF6.centerY());
                                            float f71 = this.T1;
                                            float f72 = this.j1;
                                            RectF rectF7 = this.J1;
                                            RectF rectF8 = this.e1;
                                            rectF7.set(rectF8);
                                            this.T1 = 1.0f;
                                            this.j1 = 0.0f;
                                            rectF8.set(rectF6);
                                            g(canvas3, rectF6, max13, f26, f70);
                                            this.T1 = f71;
                                            this.j1 = f72;
                                            rectF8.set(rectF7);
                                            j(canvas3, rectF6, i15, f26);
                                        }
                                        canvas3.restore();
                                    }
                                    this.A0 = false;
                                    invalidate();
                                }
                            } else {
                                f17 = max9;
                            }
                            f18 = 0.0f;
                            if (this.C0 >= f17 - gm.L(6.0f)) {
                                this.U0 = true;
                                this.D0 = f18;
                            }
                            this.C0 = Math.max(f18, Math.min(max10, this.C0));
                            i3 = i;
                            float c32 = (i3 - (c(i3) * f43)) + c2 + gm.L(12.0f);
                            float L72 = this.B0 + f48 + gm.L(8.0f);
                            float f512 = f17;
                            RectF rectF32 = this.d1;
                            rectF32.set(c2 - gm.L(12.0f), f48 - gm.L(8.0f), c32, L72);
                            if (this.y0 > 0.001f) {
                            }
                            j = uptimeMillis;
                            f19 = f48;
                            f20 = c2;
                            i4 = i3;
                            f21 = f7;
                            f22 = 90.0f;
                            i5 = -1;
                            min2 = Math.min(f19 + this.B0 + L4, f10);
                            if (min2 >= f10 - gm.L(1.0f)) {
                            }
                            if (!this.L0) {
                            }
                            if (this.D1 == null) {
                            }
                            f23 = this.J0;
                            if (f23 >= 0.0f) {
                            }
                            f24 = f22;
                            this.J0 = f10;
                            this.K0 = false;
                            Canvas canvas32 = canvas2;
                            h(f10, L3, f6, i4, canvas32, z2);
                            float L102 = f20 - gm.L(2.0f);
                            float max122 = Math.max(f21, (f19 - gm.L(12.0f)) - gm.L(36.0f));
                            this.P = k(this.P, f6, this.O != null ? 1.0f : 0.0f, f24);
                            str = this.O;
                            if (str == null) {
                            }
                            float measureText2 = this.e.measureText(str);
                            f25 = this.Q;
                            if (f25 > 0.0f) {
                            }
                            this.Q = measureText2;
                            float L112 = gm.L(36.0f);
                            float L122 = gm.L(10.0f) + L102 + gm.L(20.0f) + gm.L(6.0f) + this.Q + gm.L(12.0f);
                            float f692 = L112 + max122;
                            RectF rectF62 = this.R;
                            rectF62.set(L102, max122, gm.L(1.0f) + L122 + gm.L(8.0f) + gm.L(20.0f) + gm.L(9.0f), f692);
                            this.S.set(L102, max122, L122, f692);
                            this.T.set(L122, max122, rectF62.right, f692);
                            f26 = this.y0;
                            if (f26 > 0.001f) {
                            }
                            this.A0 = false;
                            invalidate();
                        }
                        f17 = max9;
                        f18 = 0.0f;
                        this.C0 = Math.max(f18, Math.min(max10, this.C0));
                        i3 = i;
                        float c322 = (i3 - (c(i3) * f43)) + c2 + gm.L(12.0f);
                        float L722 = this.B0 + f48 + gm.L(8.0f);
                        float f5122 = f17;
                        RectF rectF322 = this.d1;
                        rectF322.set(c2 - gm.L(12.0f), f48 - gm.L(8.0f), c322, L722);
                        if (this.y0 > 0.001f) {
                        }
                        j = uptimeMillis;
                        f19 = f48;
                        f20 = c2;
                        i4 = i3;
                        f21 = f7;
                        f22 = 90.0f;
                        i5 = -1;
                        min2 = Math.min(f19 + this.B0 + L4, f10);
                        if (min2 >= f10 - gm.L(1.0f)) {
                        }
                        if (!this.L0) {
                        }
                        if (this.D1 == null) {
                        }
                        f23 = this.J0;
                        if (f23 >= 0.0f) {
                        }
                        f24 = f22;
                        this.J0 = f10;
                        this.K0 = false;
                        Canvas canvas322 = canvas2;
                        h(f10, L3, f6, i4, canvas322, z2);
                        float L1022 = f20 - gm.L(2.0f);
                        float max1222 = Math.max(f21, (f19 - gm.L(12.0f)) - gm.L(36.0f));
                        this.P = k(this.P, f6, this.O != null ? 1.0f : 0.0f, f24);
                        str = this.O;
                        if (str == null) {
                        }
                        float measureText22 = this.e.measureText(str);
                        f25 = this.Q;
                        if (f25 > 0.0f) {
                        }
                        this.Q = measureText22;
                        float L1122 = gm.L(36.0f);
                        float L1222 = gm.L(10.0f) + L1022 + gm.L(20.0f) + gm.L(6.0f) + this.Q + gm.L(12.0f);
                        float f6922 = L1122 + max1222;
                        RectF rectF622 = this.R;
                        rectF622.set(L1022, max1222, gm.L(1.0f) + L1222 + gm.L(8.0f) + gm.L(20.0f) + gm.L(9.0f), f6922);
                        this.S.set(L1022, max1222, L1222, f6922);
                        this.T.set(L1222, max1222, rectF622.right, f6922);
                        f26 = this.y0;
                        if (f26 > 0.001f) {
                        }
                        this.A0 = false;
                        invalidate();
                    }
                }
                f14 = max7;
                if (this.L0) {
                }
                f15 = this.G0;
                if (f15 >= 0.0f) {
                }
                this.G0 = max8;
                if (!this.A0) {
                    f31 = this.H0;
                    if (f31 >= 0.0f) {
                    }
                }
                float f482 = max8;
                this.H0 = f482;
                max = Math.max(this.E0, Math.min(height4, Math.max(gm.L(64.0f), min - this.G0)));
                this.E0 = max;
                if (this.A0) {
                }
                this.B0 = max;
                f16 = max;
                float max92 = Math.max(0.0f, height4 - f16);
                textSize = textPaint.getTextSize() * 1.35f;
                max2 = Math.max(0.0f, height4 - max);
                if (uptimeMillis - this.R0 < 900) {
                }
                if (this.U0) {
                    max2 = mlb.f(max2, textSize, this.F0, max2);
                }
                this.F0 = max2;
                float max102 = Math.max(max92, max2);
                if (this.U0) {
                }
                f17 = max92;
                f18 = 0.0f;
                this.C0 = Math.max(f18, Math.min(max102, this.C0));
                i3 = i;
                float c3222 = (i3 - (c(i3) * f43)) + c2 + gm.L(12.0f);
                float L7222 = this.B0 + f482 + gm.L(8.0f);
                float f51222 = f17;
                RectF rectF3222 = this.d1;
                rectF3222.set(c2 - gm.L(12.0f), f482 - gm.L(8.0f), c3222, L7222);
                if (this.y0 > 0.001f) {
                }
                j = uptimeMillis;
                f19 = f482;
                f20 = c2;
                i4 = i3;
                f21 = f7;
                f22 = 90.0f;
                i5 = -1;
                min2 = Math.min(f19 + this.B0 + L4, f10);
                if (min2 >= f10 - gm.L(1.0f)) {
                }
                if (!this.L0) {
                }
                if (this.D1 == null) {
                }
                f23 = this.J0;
                if (f23 >= 0.0f) {
                }
                f24 = f22;
                this.J0 = f10;
                this.K0 = false;
                Canvas canvas3222 = canvas2;
                h(f10, L3, f6, i4, canvas3222, z2);
                float L10222 = f20 - gm.L(2.0f);
                float max12222 = Math.max(f21, (f19 - gm.L(12.0f)) - gm.L(36.0f));
                this.P = k(this.P, f6, this.O != null ? 1.0f : 0.0f, f24);
                str = this.O;
                if (str == null) {
                }
                float measureText222 = this.e.measureText(str);
                f25 = this.Q;
                if (f25 > 0.0f) {
                }
                this.Q = measureText222;
                float L11222 = gm.L(36.0f);
                float L12222 = gm.L(10.0f) + L10222 + gm.L(20.0f) + gm.L(6.0f) + this.Q + gm.L(12.0f);
                float f69222 = L11222 + max12222;
                RectF rectF6222 = this.R;
                rectF6222.set(L10222, max12222, gm.L(1.0f) + L12222 + gm.L(8.0f) + gm.L(20.0f) + gm.L(9.0f), f69222);
                this.S.set(L10222, max12222, L12222, f69222);
                this.T.set(L12222, max12222, rectF6222.right, f69222);
                f26 = this.y0;
                if (f26 > 0.001f) {
                }
                this.A0 = false;
                invalidate();
            }
        }
        f10 = f45;
        this.Q0 = f10;
        min = Math.min(f44, f10 - L4);
        f11 = this.N0;
        textPaint = this.c;
        if (f11 <= f9) {
            StaticLayout a4 = a("A\nA", textPaint);
            StaticLayout a32 = a("A", textPaint);
            this.N0 = a4.getLineTop(1) - a4.getLineTop(0);
            this.O0 = a32.getHeight();
        }
        f12 = this.N0;
        if (f12 <= 0.0f) {
        }
        f13 = this.O0;
        if (f13 <= 0.0f) {
        }
        if (f12 > 0.0f) {
        }
        f14 = max7;
        if (this.L0) {
        }
        f15 = this.G0;
        if (f15 >= 0.0f) {
        }
        this.G0 = max8;
        if (!this.A0) {
        }
        float f4822 = max8;
        this.H0 = f4822;
        max = Math.max(this.E0, Math.min(height4, Math.max(gm.L(64.0f), min - this.G0)));
        this.E0 = max;
        if (this.A0) {
        }
        this.B0 = max;
        f16 = max;
        float max922 = Math.max(0.0f, height4 - f16);
        textSize = textPaint.getTextSize() * 1.35f;
        max2 = Math.max(0.0f, height4 - max);
        if (uptimeMillis - this.R0 < 900) {
        }
        if (this.U0) {
        }
        this.F0 = max2;
        float max1022 = Math.max(max922, max2);
        if (this.U0) {
        }
        f17 = max922;
        f18 = 0.0f;
        this.C0 = Math.max(f18, Math.min(max1022, this.C0));
        i3 = i;
        float c32222 = (i3 - (c(i3) * f43)) + c2 + gm.L(12.0f);
        float L72222 = this.B0 + f4822 + gm.L(8.0f);
        float f512222 = f17;
        RectF rectF32222 = this.d1;
        rectF32222.set(c2 - gm.L(12.0f), f4822 - gm.L(8.0f), c32222, L72222);
        if (this.y0 > 0.001f) {
        }
        j = uptimeMillis;
        f19 = f4822;
        f20 = c2;
        i4 = i3;
        f21 = f7;
        f22 = 90.0f;
        i5 = -1;
        min2 = Math.min(f19 + this.B0 + L4, f10);
        if (min2 >= f10 - gm.L(1.0f)) {
        }
        if (!this.L0) {
        }
        if (this.D1 == null) {
        }
        f23 = this.J0;
        if (f23 >= 0.0f) {
        }
        f24 = f22;
        this.J0 = f10;
        this.K0 = false;
        Canvas canvas32222 = canvas2;
        h(f10, L3, f6, i4, canvas32222, z2);
        float L102222 = f20 - gm.L(2.0f);
        float max122222 = Math.max(f21, (f19 - gm.L(12.0f)) - gm.L(36.0f));
        this.P = k(this.P, f6, this.O != null ? 1.0f : 0.0f, f24);
        str = this.O;
        if (str == null) {
        }
        float measureText2222 = this.e.measureText(str);
        f25 = this.Q;
        if (f25 > 0.0f) {
        }
        this.Q = measureText2222;
        float L112222 = gm.L(36.0f);
        float L122222 = gm.L(10.0f) + L102222 + gm.L(20.0f) + gm.L(6.0f) + this.Q + gm.L(12.0f);
        float f692222 = L112222 + max122222;
        RectF rectF62222 = this.R;
        rectF62222.set(L102222, max122222, gm.L(1.0f) + L122222 + gm.L(8.0f) + gm.L(20.0f) + gm.L(9.0f), f692222);
        this.S.set(L102222, max122222, L122222, f692222);
        this.T.set(L122222, max122222, rectF62222.right, f692222);
        f26 = this.y0;
        if (f26 > 0.001f) {
        }
        this.A0 = false;
        invalidate();
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        int c = (int) ((i - (c(i) * 2.0f)) - gm.L(28.0f));
        if (c != this.n0 && c > 0) {
            this.n0 = c;
            this.O0 = 0.0f;
            this.N0 = 0.0f;
            this.m0 = a(this.M, this.d);
            q();
        }
        this.c1 = -1;
        if (getParent() instanceof View) {
            View view = (View) getParent();
            StringBuilder sb = new StringBuilder("overlay bounds top=");
            sb.append(getTop());
            sb.append(" h=");
            sb.append(i2);
            sb.append(" parent h=");
            sb.append(view.getHeight());
            ts2.w(sb, (getTop() == 0 && i2 == view.getHeight()) ? " (full-screen ok)" : "  ← NOT full-screen: a strip stays unblurred", "VoiceLive");
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        boolean z = false;
        if (!this.p0) {
            return false;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.q1 = x;
            this.s1 = y;
            this.r1 = y;
            this.u1 = false;
            boolean isEmpty = this.k0.trim().isEmpty();
            int o = o(x, y);
            this.l1 = o;
            if (o < 0) {
                int n = isEmpty ? -1 : n(x, y);
                this.l1 = n;
                o = n;
            }
            if (o < 0 && this.d1.contains(x, y)) {
                z = true;
            }
            this.t1 = z;
            if (z) {
                VelocityTracker velocityTracker2 = this.v1;
                if (velocityTracker2 == null) {
                    velocityTracker2 = VelocityTracker.obtain();
                    this.v1 = velocityTracker2;
                }
                velocityTracker2.clear();
                this.v1.addMovement(motionEvent);
                this.D0 = 0.0f;
            }
            invalidate();
            return true;
        }
        if (actionMasked == 1) {
            int i = this.l1;
            this.l1 = -1;
            if (i >= 0) {
                int o2 = o(x, y);
                if (o2 < 0) {
                    o2 = n(x, y);
                }
                if (o2 == i) {
                    try {
                        performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    post(new ge7((Object) this, i, (byte) 26));
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
        int i2 = this.l1;
        int i3 = this.w1;
        if (i2 >= 0) {
            int o3 = o(x, y);
            if (o3 < 0) {
                o3 = n(x, y);
            }
            if (o3 != this.l1 && Math.hypot(x - this.q1, y - this.r1) > i3) {
                this.l1 = -1;
            }
        }
        if (this.t1) {
            this.v1.addMovement(motionEvent);
            if (!this.u1 && Math.abs(y - this.r1) > i3) {
                this.u1 = true;
                this.U0 = false;
                this.s1 = y;
            }
            if (this.u1) {
                this.C0 -= y - this.s1;
                this.s1 = y;
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
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ilc ilcVar = (ilc) obj;
            int i2 = ilcVar.b;
            if (i2 > ilcVar.a && i2 <= spannableString.length()) {
                spannableString.setSpan(new zo3(ilcVar, (byte) 2), ilcVar.a, ilcVar.b, 65569);
            }
        }
        int i3 = this.y1;
        if (i3 >= 0 && i3 < spannableString.length()) {
            spannableString.setSpan(new vkc((byte) 1), this.y1, spannableString.length(), 33);
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
        int i = 1;
        if (this.P0) {
            this.M0 = true;
        }
        float f = this.H0;
        if (f < 0.0f) {
            f = 0.0f;
        }
        this.I0 = f - this.C0;
        this.H0 = -1.0f;
        this.G0 = -1.0f;
        this.E0 = 0.0f;
        this.F0 = 0.0f;
        this.U0 = true;
        this.D0 = 0.0f;
        this.K0 = true;
        if (staticLayout != null) {
            Random random = new Random();
            int i2 = X1;
            float f2 = 0.45f;
            float f3 = 0.5f;
            int[] iArr = {i2, on2.f(0.45f, i2, -1), on2.f(0.5f, X1, -10493697), -1};
            int i3 = 0;
            while (i3 < this.D1.getLineCount()) {
                float lineLeft = this.D1.getLineLeft(i3);
                float lineRight = this.D1.getLineRight(i3);
                float lineTop = this.D1.getLineTop(i3);
                float lineBottom = this.D1.getLineBottom(i3);
                float f4 = lineRight - lineLeft;
                float f5 = f2;
                float f6 = f3;
                int min = (int) Math.min(140.0f, f4 / gm.L(2.6f));
                int i4 = 0;
                while (i4 < min) {
                    float e = wi8.e(random, f4, lineLeft);
                    float nextFloat = (random.nextFloat() * 0.6f) + 0.2f;
                    int i5 = i;
                    float A = b10.A(e, Math.max(i, this.n0), 520.0f, uptimeMillis);
                    float nextFloat2 = ((random.nextFloat() - f6) * gm.L(36.0f)) / 1000.0f;
                    long j = uptimeMillis;
                    float f7 = (-((random.nextFloat() * gm.L(34.0f)) + gm.L(10.0f))) / 1000.0f;
                    float e2 = wi8.e(random, 380.0f, 480.0f);
                    float f8 = iArr[random.nextInt(4)];
                    float e3 = aq1.e(0.75f, random.nextFloat(), gm.N(f5));
                    float[] fArr = new float[8];
                    fArr[0] = e;
                    fArr[i5] = (nextFloat * (lineBottom - lineTop)) + lineTop;
                    fArr[2] = nextFloat2;
                    fArr[3] = f7;
                    fArr[4] = A;
                    fArr[5] = e2;
                    fArr[6] = f8;
                    fArr[7] = e3;
                    this.E1.add(fArr);
                    i4++;
                    i = i5;
                    uptimeMillis = j;
                    random = random;
                }
                i3++;
                f3 = f6;
                f2 = f5;
            }
        }
        long j2 = uptimeMillis;
        this.k0 = "";
        ArrayList arrayList = this.o0;
        arrayList.clear();
        this.A1 = i;
        setText(str);
        this.A1 = false;
        if (this.l0 != null) {
            int size = arrayList.size();
            int i6 = 0;
            while (i6 < size) {
                Object obj = arrayList.get(i6);
                i6++;
                ilc ilcVar = (ilc) obj;
                if (ilcVar.a < this.k0.length()) {
                    ilcVar.c = j2 + ((long) (b((this.l0.getPrimaryHorizontal(Math.max(ilcVar.a, Math.min(ilcVar.b, this.k0.length()) - 1)) + gm.L(60.0f)) / kt6.e(120.0f, this.n0, 1)) * 520.0f)) + 60;
                    ilcVar.d = 0.0f;
                }
            }
        }
        invalidate();
    }

    public final void s() {
        Object obj;
        if (Build.VERSION.SDK_INT >= 29 && (obj = this.d0) != null) {
            qn0.c(obj).discardDisplayList();
        }
        this.d0 = null;
        this.e0 = -1.0f;
    }

    public void setAccent(int i) {
        this.i0 = i | (-16777216);
    }

    public void setBusy(boolean z) {
        if (this.z1 == z) {
            return;
        }
        this.z1 = z;
        this.B1 = SystemClock.uptimeMillis();
        if (!z) {
            this.c.setShader(null);
        }
        invalidate();
    }

    public void setEditMenuProgress(float f) {
        this.Q1 = f;
        invalidate();
    }

    public void setEditPillHidden(boolean z) {
        this.P1 = z;
        if (!z) {
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

    public void setLanguagePillHidden(boolean z) {
        this.W = z;
        invalidate();
    }

    public void setLevel(float f) {
        this.X0 = Math.max(0.0f, Math.min(1.0f, f));
    }

    public void setListening(boolean z) {
        this.Z0 = z;
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

    public void setReview(boolean z) {
        this.P0 = z;
        invalidate();
    }

    public void setStyleIcon(Drawable drawable) {
        Drawable drawable2 = this.K;
        if (drawable2 instanceof vm) {
            ((vm) drawable2).o(this);
        }
        this.K = drawable;
        if (drawable instanceof vm) {
            ((vm) drawable).b(this);
        }
        invalidate();
    }

    public void setStyleLabel(String str) {
        invalidate();
    }

    public void setText(String str) {
        t(-1, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x013a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(int i, String str) {
        boolean z;
        long min;
        String str2;
        ArrayList arrayList;
        int i2;
        int i3 = i;
        String str3 = str == null ? "" : str;
        if (i3 < 0 || i3 >= str3.length()) {
            i3 = -1;
        }
        if (i3 != this.y1) {
            this.y1 = i3;
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
        int i4 = 0;
        while (i4 < min2 && str4.charAt(i4) == str3.charAt(i4)) {
            i4++;
        }
        ArrayList arrayList2 = this.o0;
        ArrayList arrayList3 = new ArrayList(arrayList2);
        for (int size = arrayList2.size() - 1; size >= 0; size--) {
            ilc ilcVar = (ilc) arrayList2.get(size);
            if (ilcVar.a >= i4 || uptimeMillis - ilcVar.c > 1950) {
                arrayList2.remove(size);
            } else if (ilcVar.b > i4) {
                ilcVar.b = i4;
            }
        }
        int i5 = 0;
        boolean z2 = false;
        while (i4 < str3.length()) {
            int i6 = i4;
            while (i6 < str3.length() && Character.isWhitespace(str3.charAt(i6))) {
                i6++;
            }
            while (i6 < str3.length() && !Character.isWhitespace(str3.charAt(i6))) {
                i6++;
            }
            ilc ilcVar2 = new ilc();
            ilcVar2.a = i4;
            ilcVar2.b = i6;
            if (this.A1) {
                z = z2;
                min = (i5 * 28) + 200 + uptimeMillis;
            } else {
                z = z2;
                min = (Math.min(i5, 5) * 45) + uptimeMillis;
            }
            ilcVar2.c = min;
            ilcVar2.d = 0.0f;
            if (this.A1 || i4 >= str4.length()) {
                str2 = str4;
                arrayList = arrayList3;
                z2 = z;
            } else {
                ilcVar2.d = 1.0f;
                if (!z) {
                    int i7 = i4;
                    while (i7 < str4.length() && Character.isWhitespace(str4.charAt(i7))) {
                        i7++;
                    }
                    while (i7 < str4.length() && !Character.isWhitespace(str4.charAt(i7))) {
                        i7++;
                    }
                    if (!p(str4.substring(i4, i7)).equals(p(str3.substring(i4, i6)))) {
                        z2 = true;
                        if (z2) {
                            long j = uptimeMillis - 2000;
                            int size2 = arrayList3.size();
                            int i8 = 0;
                            while (true) {
                                if (i8 >= size2) {
                                    str2 = str4;
                                    arrayList = arrayList3;
                                    break;
                                }
                                Object obj = arrayList3.get(i8);
                                int i9 = i8 + 1;
                                str2 = str4;
                                ilc ilcVar3 = (ilc) obj;
                                arrayList = arrayList3;
                                int i10 = ilcVar3.a;
                                if (i10 <= i4) {
                                    i2 = i9;
                                    if (i4 < Math.max(ilcVar3.b, i10 + 1)) {
                                        j = ilcVar3.c;
                                        break;
                                    }
                                } else {
                                    i2 = i9;
                                }
                                arrayList3 = arrayList;
                                str4 = str2;
                                i8 = i2;
                            }
                            ilcVar2.c = j;
                        } else {
                            str2 = str4;
                            arrayList = arrayList3;
                            ilcVar2.c = uptimeMillis;
                        }
                    }
                }
                z2 = z;
                if (z2) {
                }
            }
            arrayList2.add(ilcVar2);
            i5++;
            i4 = i6;
            arrayList3 = arrayList;
            str4 = str2;
        }
        this.k0 = str3;
        this.R0 = uptimeMillis;
        q();
        invalidate();
    }
}
