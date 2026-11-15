package ji;

import ai.g2;
import ai.w0;
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
import hi.e1;
import java.util.ArrayList;
import java.util.Random;
import n2.a0;
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.g0;
import org.telegram.messenger.hd;
import org.telegram.messenger.i20;
import org.telegram.messenger.k5;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.y0;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.g5;
import org.telegram.ui.Components.gg;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class p extends View {
    public static int V1;
    public static int W1;
    public static float X1;
    public static long Z1;
    public float A0;
    public long A1;
    public float B0;
    public StaticLayout B1;
    public float C0;
    public final ArrayList C1;
    public float D0;
    public final Paint D1;
    public final LinearGradient E;
    public float E0;
    public final Paint E1;
    public final Matrix F;
    public float F0;
    public final Path F1;
    public final Drawable G;
    public float G0;
    public final Paint G1;
    public final Drawable H;
    public float H0;
    public final RectF H1;
    public final String I;
    public boolean I0;
    public final Paint I1;
    public final String J;
    public boolean J0;
    public final Path J1;
    public Drawable K;
    public boolean K0;
    public final Paint K1;
    public String L;
    public float L0;
    public final Paint L1;
    public String M;
    public float M0;
    public float M1;
    public float N;
    public boolean N0;
    public boolean N1;
    public float O;
    public float O0;
    public float O1;
    public final RectF P;
    public long P0;
    public Paint P1;
    public final RectF Q;
    public long Q0;
    public Paint Q1;
    public final RectF R;
    public float R0;
    public float R1;
    public Drawable S;
    public boolean S0;
    public Drawable T;
    public float T0;
    public boolean U;
    public float U0;
    public boolean V;
    public float V0;
    public Paint W;
    public float W0;
    public boolean X0;
    public float Y0;
    public float Z0;
    public final m a;
    public Object a0;
    public int a1;
    public final e6 b;
    public Object b0;
    public final RectF b1;
    public final TextPaint c;
    public float c0;
    public final RectF c1;
    public final TextPaint d;
    public long d0;
    public final RectF d1;
    public final TextPaint e;
    public boolean e0;
    public final RectF e1;
    public final Paint f;
    public int f0;
    public final RectF f1;
    public int g0;
    public final RectF g1;
    public final Paint h;
    public boolean h0;
    public float h1;
    public String i0;
    public float i1;
    public StaticLayout j0;
    public int j1;
    public StaticLayout k0;
    public final float[] k1;
    public int l0;
    public final RectF l1;
    public final ArrayList m0;
    public float m1;
    public final Paint n;
    public boolean n0;
    public Drawable n1;
    public boolean o0;
    public float o1;
    public long p0;
    public float p1;
    public long q0;
    public float q1;
    public int r;
    public long r0;
    public boolean r1;
    public final Paint s;
    public float s0;
    public boolean s1;
    public float t0;
    public VelocityTracker t1;
    public float u0;
    public final int u1;
    public float v0;
    public String v1;
    public final Paint w;
    public float w0;
    public int w1;
    public final Paint x;
    public float x0;
    public boolean x1;
    public final Paint y;
    public boolean y0;
    public boolean y1;
    public float z0;
    public long z1;
    public static final er S1 = new er(0.4d, 0.0d, 0.2d, 1.0d);
    public static final er T1 = er.h;
    public static final er U1 = new er(0.4d, 0.0d, 1.0d, 1.0d);
    public static final OvershootInterpolator Y1 = new OvershootInterpolator(1.3f);

    static {
        new er(0.3d, 0.0d, 0.1d, 1.0d);
    }

    public p(Context context, e6 e6Var, m mVar) {
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
        this.L = "Listening…";
        this.P = new RectF();
        this.Q = new RectF();
        this.R = new RectF();
        new Matrix();
        this.c0 = -1.0f;
        this.g0 = -12939291;
        this.i0 = "";
        this.m0 = new ArrayList();
        this.y0 = true;
        this.E0 = -1.0f;
        this.F0 = -1.0f;
        this.H0 = -1.0f;
        this.O0 = -1.0f;
        this.S0 = true;
        this.X0 = true;
        this.Y0 = 1.0f;
        this.a1 = -1;
        this.b1 = new RectF();
        this.c1 = new RectF();
        this.d1 = new RectF();
        this.e1 = new RectF();
        this.f1 = new RectF();
        this.g1 = new RectF();
        this.i1 = 1.0f;
        this.j1 = -1;
        this.k1 = new float[6];
        this.l1 = new RectF();
        this.w1 = -1;
        new RectF();
        this.C1 = new ArrayList();
        this.D1 = new Paint(1);
        this.E1 = new Paint();
        this.F1 = new Path();
        this.G1 = new Paint(1);
        this.H1 = new RectF();
        this.I1 = new Paint(1);
        new Paint(1);
        this.J1 = new Path();
        this.K1 = new Paint(1);
        this.L1 = new Paint(1);
        this.R1 = 1.0f;
        this.b = e6Var;
        this.a = mVar;
        this.u1 = ViewConfiguration.get(context).getScaledTouchSlop();
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
        this.I = hd.M0(2131751335, null);
        this.J = "Send as text";
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
        return StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, this.l0).setAlignment(Layout.Alignment.ALIGN_NORMAL).setLineSpacing(g0.L(4.0f), 1.0f).setIncludePad(false).build();
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
        Path path = this.F1;
        if (path.isEmpty()) {
            path.moveTo(-g0.N(3.8f), g0.N(3.8f));
            path.lineTo(0.0f, 0.0f);
            path.lineTo(g0.N(3.8f), g0.N(3.8f));
        }
        Paint.Style style = Paint.Style.STROKE;
        Paint paint2 = this.G1;
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
        if (this.x1) {
            float L3 = g0.L(6.5f);
            Paint paint3 = this.L1;
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
        boolean z10 = this.e0;
        RectF rectF2 = this.c1;
        Path path = this.J1;
        Paint paint = this.n;
        Paint paint2 = this.I1;
        if (z10) {
            paint.clearShadowLayer();
            if (this.b0 != null && Build.VERSION.SDK_INT >= 31 && canvas.isHardwareAccelerated()) {
                if (this.P1 == null) {
                    ColorMatrix colorMatrix = new ColorMatrix();
                    colorMatrix.setSaturation(1.7f);
                    colorMatrix.postConcat(new ColorMatrix(new float[]{0.95f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.95f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.95f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f}));
                    Paint paint3 = new Paint();
                    this.P1 = paint3;
                    paint3.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                }
                this.P1.setAlpha((int) (f11 * 255.0f));
                canvas.save();
                path.rewind();
                path.addRoundRect(rectF, height, height, Path.Direction.CW);
                canvas.clipPath(path);
                float f13 = 1.0f / f12;
                canvas.scale(f13, f13, rectF.centerX(), rectF.centerY());
                float f14 = 1.0f / this.R1;
                canvas.scale(f14, f14, rectF2.left, rectF2.centerY());
                canvas.translate(0.0f, -this.h1);
                int saveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), this.P1);
                canvas.scale(4.0f, 4.0f);
                canvas.drawRenderNode(a0.d(this.b0));
                canvas.restoreToCount(saveLayer);
                canvas.restore();
            }
            paint.setColor(j6.r1(f11 * 0.55f, -14276047));
            canvas.drawRoundRect(rectF, height, height, paint);
            paint2.setShader(null);
            Paint.Style style = Paint.Style.STROKE;
            paint2.setStyle(style);
            paint2.setStrokeWidth(g0.N(0.66f));
            paint2.setColor(j6.r1(0.12f * f11, -1));
            RectF rectF3 = g0.P;
            rectF3.set(rectF);
            rectF3.inset(g0.N(0.33f), g0.N(0.33f));
            canvas.drawRoundRect(rectF3, height, height, paint2);
            Paint paint4 = this.K1;
            paint4.setStyle(style);
            paint4.setStrokeWidth(g0.N(1.0f));
            int r12 = j6.r1(0.19f * f11, -16777216);
            int i7 = 16777215 & r12;
            paint4.setShader(new LinearGradient(rectF.left, 0.0f, rectF.right, 0.0f, new int[]{r12, i7, i7, r12}, new float[]{0.0f, Math.min(0.45f, (height / rectF.width()) * 1.1f), Math.max(0.55f, 1.0f - ((height / rectF.width()) * 1.1f)), 1.0f}, Shader.TileMode.CLAMP));
            rectF3.set(rectF);
            rectF3.inset(-g0.N(0.5f), -g0.N(0.5f));
            canvas.drawRoundRect(rectF3, g0.N(0.5f) + height, g0.N(0.5f) + height, paint4);
        } else {
            paint.clearShadowLayer();
            if (this.b0 != null && Build.VERSION.SDK_INT >= 31 && canvas.isHardwareAccelerated()) {
                if (this.Q1 == null) {
                    ColorMatrix colorMatrix2 = new ColorMatrix();
                    colorMatrix2.setSaturation(1.3f);
                    colorMatrix2.postConcat(new ColorMatrix(new float[]{1.04f, 0.0f, 0.0f, 0.0f, 14.0f, 0.0f, 1.04f, 0.0f, 0.0f, 14.0f, 0.0f, 0.0f, 1.04f, 0.0f, 14.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f}));
                    Paint paint5 = new Paint();
                    this.Q1 = paint5;
                    paint5.setColorFilter(new ColorMatrixColorFilter(colorMatrix2));
                }
                this.Q1.setAlpha((int) (f11 * 255.0f));
                canvas.save();
                path.rewind();
                path.addRoundRect(rectF, height, height, Path.Direction.CW);
                canvas.clipPath(path);
                float f15 = 1.0f / f12;
                canvas.scale(f15, f15, rectF.centerX(), rectF.centerY());
                float f16 = 1.0f / this.R1;
                canvas.scale(f16, f16, rectF2.left, rectF2.centerY());
                canvas.translate(0.0f, -this.h1);
                int saveLayer2 = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), this.Q1);
                canvas.scale(4.0f, 4.0f);
                canvas.drawRenderNode(a0.d(this.b0));
                canvas.restoreToCount(saveLayer2);
                canvas.restore();
            }
            paint.setColor(j6.r1(0.62f * f11, -1));
            canvas.drawRoundRect(rectF, height, height, paint);
            paint2.setStyle(Paint.Style.STROKE);
            paint2.setStrokeWidth(g0.N(1.0f));
            paint2.setShader(new LinearGradient(0.0f, rectF.top, 0.0f, rectF.bottom, new int[]{j6.r1(0.95f * f11, -1), j6.r1(0.25f * f11, -1), j6.r1(f11 * 0.55f, -1)}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP));
            RectF rectF4 = g0.P;
            rectF4.set(rectF);
            rectF4.inset(g0.N(0.5f), g0.N(0.5f));
            canvas.drawRoundRect(rectF4, height, height, paint2);
            paint2.setShader(null);
            paint2.setStrokeWidth(g0.N(0.66f));
            paint2.setColor(j6.r1(0.07f * f11, -16777216));
            rectF4.set(rectF);
            rectF4.inset(-g0.N(0.33f), -g0.N(0.33f));
            canvas.drawRoundRect(rectF4, g0.N(0.33f) + height, g0.N(0.33f) + height, paint2);
        }
        if (f10 > 0.01f) {
            int i10 = this.e0 ? -1 : -16777216;
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
            fArr = this.k1;
            if (i10 >= fArr.length) {
                break;
            }
            float f16 = fArr[i10];
            int i11 = this.j1;
            fArr[i10] = k(f16, f12, i11 == i10 ? 1.0f : 0.0f, i11 == i10 ? 40.0f : 70.0f);
            i10++;
        }
        this.m1 = k(this.m1, f12, (this.K == null || this.x1) ? 0.0f : 1.0f, 90.0f);
        String str = this.I;
        TextPaint textPaint = this.e;
        float measureText = textPaint.measureText(str);
        float measureText2 = textPaint.measureText(this.J);
        float c11 = c(i7) - g0.L(2.0f);
        float L = g0.L(10.0f) + g0.L(14.0f) + g0.L(8.0f) + g0.L(1.0f) + (this.K != null ? g0.L(4.0f) : 0);
        float L2 = g0.L(14.0f) + measureText + g0.L(12.0f);
        float f17 = this.M1;
        if (f17 > 0.0f) {
            L2 = k(f17, f12, L2, 110.0f);
        }
        this.M1 = L2;
        float f18 = f10 + f11;
        RectF rectF = this.f1;
        rectF.set(c11, f10, L2 + c11, f18);
        float f19 = rectF.right;
        RectF rectF2 = this.g1;
        rectF2.set(f19, f10, L + f19, f18);
        float f20 = rectF.left;
        float f21 = rectF2.right;
        RectF rectF3 = this.d1;
        rectF3.set(f20, f10, f21, f18);
        float f22 = this.m1 * f11;
        float L3 = rectF3.right + g0.L(8.0f);
        float L4 = rectF3.right + g0.L(8.0f) + f11;
        RectF rectF4 = this.l1;
        rectF4.set(L3, f10, L4, f18);
        float L5 = ((f22 + g0.L(8.0f)) * this.m1) + rectF3.right + g0.L(8.0f);
        RectF rectF5 = this.e1;
        rectF5.set(L5, f10, measureText2 + L5 + g0.L(32.0f), f18);
        float f23 = rectF3.left;
        float f24 = rectF5.right;
        RectF rectF6 = this.c1;
        rectF6.set(f23, f10, f24, f18);
        if (this.x0 <= 0.001f) {
            return;
        }
        if (z10 && this.Q0 == 0) {
            this.Q0 = SystemClock.uptimeMillis();
        }
        if (this.Q0 == 0) {
            c10 = 0;
            f13 = 0.001f;
            b10 = 0.0f;
        } else {
            c10 = 0;
            f13 = 0.001f;
            b10 = b((SystemClock.uptimeMillis() - this.Q0) / 460.0f);
        }
        float interpolation = !this.n0 ? this.R0 : Y1.getInterpolation(b10);
        this.R0 = interpolation;
        if (interpolation <= f13) {
            return;
        }
        float b11 = b(this.R0 * 1.8f) * (this.n0 ? b(this.x0 * 1.6f) : this.x0);
        float T12 = g0.T1(0.6f, 1.0f, this.Z0) * b11;
        canvas.save();
        canvas.translate(0.0f, this.h1);
        float T13 = g0.T1(0.6f, 1.0f, this.R0) * this.i1;
        canvas.scale(T13, T13, rectF6.left, rectF6.centerY());
        this.R1 = T13;
        int i12 = this.e0 ? -1 : this.f0;
        float max = Math.max(fArr[c10], fArr[2]);
        if (this.N1) {
            float b12 = b(1.0f - (this.O1 / 0.35f));
            if (b12 > 0.01f) {
                e(canvas, rectF3, i12, b12 * T12);
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
            e(canvas2, rectF3, i12, T12);
            canvas2.restore();
        }
        if (this.m1 > 0.01f) {
            canvas2.save();
            float T14 = g0.T1(0.6f, 1.0f, this.m1) * (1.0f - (fArr[3] * 0.05f));
            canvas2.scale(T14, T14, rectF4.centerX(), rectF4.centerY());
            g(canvas2, rectF4, fArr[3], f15 * this.m1, T14);
            if (this.n1 == null) {
                this.n1 = getContext().getResources().getDrawable(R.drawable.chats_undo).mutate();
            }
            this.n1.setColorFilter(new PorterDuffColorFilter(i12, PorterDuff.Mode.SRC_IN));
            this.n1.setAlpha((int) (255.0f * T12 * this.m1));
            float L6 = g0.L(22.0f) / f14;
            this.n1.setBounds((int) (rectF4.centerX() - L6), (int) (rectF4.centerY() - L6), (int) (rectF4.centerX() + L6), (int) (rectF4.centerY() + L6));
            this.n1.draw(canvas2);
            canvas2.restore();
        }
        canvas2.save();
        float f26 = 1.0f - (fArr[1] * 0.05f);
        canvas2.scale(f26, f26, rectF5.centerX(), rectF5.centerY());
        g(canvas2, rectF5, fArr[1], f15 * 1.0f, f26);
        i(canvas, this.J, g0.L(16.0f) + rectF5.left, rectF5.centerY(), i12, T12 * 1.0f);
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
        if (this.S == null) {
            this.S = getContext().getResources().getDrawable(R.drawable.msg_language).mutate();
            this.T = getContext().getResources().getDrawable(R.drawable.msg_settings).mutate();
        }
        float centerY = rectF.centerY();
        Drawable drawable = this.S;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        drawable.setColorFilter(new PorterDuffColorFilter(i7, mode));
        int i10 = (int) (255.0f * f10);
        this.S.setAlpha(i10);
        int L = (int) (rectF.left + g0.L(10.0f));
        int L2 = (int) (centerY - g0.L(10.0f));
        this.S.setBounds(L, L2, g0.L(20.0f) + L, g0.L(20.0f) + L2);
        this.S.draw(canvas);
        float L3 = (((rectF.right - g0.L(9.0f)) - g0.L(20.0f)) - g0.L(8.0f)) - g0.L(1.0f);
        canvas.save();
        canvas.clipRect(rectF.left, rectF.top, L3 - g0.L(4.0f), rectF.bottom);
        String str = this.M;
        if (str == null) {
            str = "Detecting…";
        }
        i(canvas, str, rectF.left + g0.L(10.0f) + g0.L(20.0f) + g0.L(6.0f), centerY, i7, g0.T1(0.5f, 1.0f, this.N) * f10);
        canvas.restore();
        Paint paint = this.w;
        paint.setColor(i7);
        paint.setAlpha((int) (35.7f * f10));
        canvas.drawRect(L3, centerY - g0.L(9.0f), g0.N(1.0f) + L3, centerY + g0.L(9.0f), paint);
        this.T.setColorFilter(new PorterDuffColorFilter(i7, mode));
        this.T.setAlpha(i10);
        int L4 = (int) ((rectF.right - g0.L(9.0f)) - g0.L(10.0f));
        int i11 = (int) centerY;
        this.T.setBounds(L4 - g0.L(10.0f), i11 - g0.L(10.0f), g0.L(10.0f) + L4, g0.L(10.0f) + i11);
        this.T.draw(canvas);
    }

    public final void l(RectF rectF) {
        float f10 = this.R1;
        RectF rectF2 = this.c1;
        float centerY = rectF2.centerY();
        float f11 = rectF2.left;
        RectF rectF3 = this.d1;
        float z10 = e2.z(rectF3.left, f11, f10, f11);
        float z11 = e2.z(rectF3.top, centerY, f10, centerY);
        float f12 = this.h1;
        rectF.set(z10, z11 + f12, e2.z(rectF3.right, f11, f10, f11), ((rectF3.bottom - centerY) * f10) + centerY + f12);
    }

    public final void m() {
        p pVar;
        if (!this.n0) {
            if (getVisibility() == 0 || (pVar = this.a.h) == null) {
                return;
            }
            g0.E2(pVar);
            Log.d("VoiceLive", "overlay removed");
            return;
        }
        this.n0 = false;
        this.o0 = false;
        this.q0 = SystemClock.uptimeMillis();
        this.s0 = this.v0;
        this.t0 = this.w0;
        this.u0 = this.x0;
        this.j1 = -1;
        invalidate();
    }

    public final int n(float f10, float f11) {
        float f12 = 0.7f;
        if (this.x0 >= 0.7f && this.R0 >= 0.7f) {
            float L = g0.L(4.0f);
            float f13 = f11 - this.h1;
            int i7 = 0;
            RectF[] rectFArr = {this.f1, this.e1, this.g1, this.l1};
            while (i7 < 4) {
                if (i7 != 3 || this.m1 >= f12) {
                    RectF rectF = rectFArr[i7];
                    RectF rectF2 = this.c1;
                    float f14 = rectF2.left;
                    float f15 = rectF.left - f14;
                    float f16 = this.i1;
                    float f17 = (f15 * f16) + f14;
                    float z10 = e2.z(rectF.right, f14, f16, f14);
                    float centerY = ((rectF.top - rectF2.centerY()) * this.i1) + rectF2.centerY();
                    float centerY2 = ((rectF.bottom - rectF2.centerY()) * this.i1) + rectF2.centerY();
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
        if (this.w0 >= 0.7f) {
            RectF rectF = this.P;
            if (!rectF.isEmpty() && !this.U) {
                float L = g0.L(4.0f);
                if (f11 >= rectF.top - L && f11 <= rectF.bottom + L && f10 >= rectF.left - L && f10 <= rectF.right + L) {
                    return f10 >= this.R.left - ((float) g0.L(4.0f)) ? 5 : 4;
                }
            }
        }
        return -1;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        s();
        VelocityTracker velocityTracker = this.t1;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.t1 = null;
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
        gg ggVar;
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
        float max3 = this.r0 == 0 ? 16.0f : Math.max(1L, Math.min(48L, uptimeMillis - r3));
        this.r0 = uptimeMillis;
        Z1 = uptimeMillis;
        int width = getWidth();
        int height2 = getHeight();
        if (width <= 0 || height2 <= 0) {
            return;
        }
        boolean z13 = this.n0;
        er erVar = S1;
        if (z13) {
            f10 = 16.0f;
            long j10 = uptimeMillis - this.p0;
            this.v0 = erVar.getInterpolation(b(j10 / 360.0f));
            float b10 = b((j10 - 60) / 460.0f);
            er erVar2 = T1;
            this.w0 = erVar2.getInterpolation(b10);
            this.x0 = erVar2.getInterpolation(b((j10 - 120) / 520.0f));
            float L2 = (1.0f - this.w0) * g0.L(14.0f);
            this.h1 = (1.0f - this.x0) * g0.L(18.0f);
            f11 = L2;
            if (j10 >= 700) {
                z10 = false;
                this.i1 = g0.T1(0.92f, 1.0f, this.x0);
                f12 = this.v0;
                float f44 = 1.0f;
                boolean z14 = z10;
                if (f12 <= 0.001f) {
                    int width2 = getWidth();
                    int height3 = getHeight();
                    boolean z15 = this.h0 && canvas2.isHardwareAccelerated() && Build.VERSION.SDK_INT >= 31;
                    if (z15) {
                        i10 = 31;
                        int width3 = getWidth();
                        int height4 = getHeight();
                        RenderNode d = a0.d(this.b0);
                        if (d == null) {
                            d = new RenderNode("VoiceLiveBackdrop");
                            this.b0 = d;
                            this.c0 = -1.0f;
                            f13 = f11;
                            this.d0 = 0L;
                        } else {
                            f13 = f11;
                        }
                        int max4 = Math.max(1, (int) Math.ceil(width3 * 0.25f));
                        int max5 = Math.max(1, (int) Math.ceil(height4 * 0.25f));
                        i11 = width;
                        i7 = height2;
                        try {
                            if (!z14) {
                                long j11 = this.d0;
                                if (j11 != 0 && uptimeMillis - j11 < 100 && d.getWidth() == max4 && d.getHeight() == max5) {
                                    f43 = 0.25f;
                                    B = e2.B(f12, 0.65f, 0.35f, g0.L(30.0f) * f43);
                                    if (Math.abs(B - this.c0) > f43) {
                                        this.c0 = B;
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
                            if (Math.abs(B - this.c0) > f43) {
                            }
                            d.setAlpha(f12);
                            canvas2.save();
                            f41 = 4.0f;
                            canvas2.scale(4.0f, 4.0f);
                            canvas2.drawRenderNode(d);
                            canvas2.restore();
                        } finally {
                        }
                        this.d0 = uptimeMillis;
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
                    int i18 = this.e0 ? z15 ? -1978658282 : -300936682 : z15 ? 1811413242 : -285738758;
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
                    int i19 = (((((int) (f12 * 64.0f)) * 31) + width2) * 31) + this.g0 + (this.e0 ? 1 : 0);
                    int i20 = this.r;
                    Paint paint2 = this.h;
                    if (i19 != i20) {
                        this.r = i19;
                        f42 = L3;
                        paint2.setShader(new RadialGradient(f47, f42, max6, j6.r1((this.e0 ? 0.16f : 0.1f) * f12, this.g0), 0, Shader.TileMode.CLAMP));
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
                if (this.a1 < 0) {
                    int[] iArr = new int[2];
                    getLocationInWindow(iArr);
                    this.a1 = iArr[1];
                }
                float c11 = c(i11);
                float L4 = g0.L(36.0f);
                float L5 = g0.L(f10);
                float f48 = i7;
                m mVar = this.a;
                float f49 = f14;
                ChatActivityEnterView chatActivityEnterView = mVar.b.a;
                chatActivityEnterView.getLocationInWindow(new int[2]);
                chatActivityEnterView.U1.getLocationInWindow(new int[2]);
                float min3 = Math.min(f48, (r8[1] - r14[1]) - getTop()) - g0.L(18.0f);
                z11 = (this.j0 != null || this.i0.trim().isEmpty()) ? r11 : true;
                this.Z0 = k(this.Z0, max3, !z11 ? 1.0f : 0.0f, 60.0f);
                staticLayout = !z11 ? this.j0 : this.k0;
                height = staticLayout == null ? staticLayout.getHeight() : g0.L(30.0f);
                float L6 = g0.L(8.0f) + Math.max((int) r11, g0.m - this.a1);
                L = g0.L(36.0f) + L6 + g0.L(12.0f);
                float f50 = (min3 - L4) - L5;
                float max7 = Math.max(L, ((Math.max(0.0f, f50 - L) * 0.3f) + L) - g0.L(36.0f));
                ChatActivityEnterView chatActivityEnterView2 = mVar.b.a;
                ggVar = chatActivityEnterView2.w2;
                RectF rectF = chatActivityEnterView2.A4;
                if (ggVar == null && !rectF.isEmpty() && chatActivityEnterView2.w2.getVisibility() == 0) {
                    staticLayout2 = staticLayout;
                    z12 = z11;
                    chatActivityEnterView2.w2.getLocationInWindow(new int[2]);
                    chatActivityEnterView2.U1.getLocationInWindow(new int[2]);
                    f18 = rectF.centerY() + (r8[1] - r14[1]);
                } else {
                    staticLayout2 = staticLayout;
                    z12 = z11;
                    f18 = f17;
                }
                top = f18 - getTop();
                if (this.K0 || top <= 0.0f) {
                    ChatActivityEnterView chatActivityEnterView3 = mVar.b.a;
                    chatActivityEnterView3.getLocationInWindow(new int[2]);
                    chatActivityEnterView3.U1.getLocationInWindow(new int[2]);
                    top = Math.min(f48, (r7[1] - r8[1]) - getTop()) - g0.L(42.0f);
                }
                float f51 = top - (L4 / f49);
                if (this.N0 || this.K0) {
                    f19 = 0.0f;
                } else {
                    float f52 = this.O0;
                    f19 = 0.0f;
                    if (f52 > 0.0f) {
                        f20 = f52;
                        this.O0 = f20;
                        min = Math.min(f50, f20 - L5);
                        f21 = this.L0;
                        textPaint = this.c;
                        if (f21 <= f19 && this.l0 > 0) {
                            StaticLayout a10 = a("A\nA", textPaint);
                            StaticLayout a11 = a("A", textPaint);
                            this.L0 = a10.getLineTop(1) - a10.getLineTop(0);
                            this.M0 = a11.getHeight();
                        }
                        f22 = this.L0;
                        if (f22 <= 0.0f) {
                            f22 = textPaint.getFontMetrics(null) + g0.L(f16);
                        }
                        f23 = this.M0;
                        if (f23 <= 0.0f) {
                            f23 = textPaint.getFontMetrics(null);
                        }
                        if (f22 > 0.0f) {
                            float f53 = min - f23;
                            if (f53 > max7) {
                                f24 = f53 - (((int) Math.floor((f53 - max7) / f22)) * f22);
                                float max8 = !this.J0 ? Math.max(L, min - height) : Math.max(L, Math.min(f24, min - height));
                                f25 = this.E0;
                                if (f25 >= 0.0f) {
                                    max8 = Math.min(f25, max8);
                                }
                                this.E0 = max8;
                                if (!this.y0 && !this.I0) {
                                    f40 = this.F0;
                                    if (f40 >= 0.0f) {
                                        max8 = k(f40, max3, max8, 160.0f);
                                    }
                                }
                                float f54 = max8;
                                this.F0 = f54;
                                max = Math.max(this.C0, Math.min(height, Math.max(g0.L(64.0f), min - this.E0)));
                                this.C0 = max;
                                if (!this.y0 || this.I0) {
                                    this.z0 = max;
                                } else {
                                    this.z0 = k(this.z0, max3, max, 140.0f);
                                }
                                float max9 = Math.max(0.0f, height - this.z0);
                                textSize = textPaint.getTextSize() * 1.35f;
                                max2 = Math.max(0.0f, height - max);
                                boolean z16 = uptimeMillis - this.P0 >= 900;
                                if (this.S0 && z16) {
                                    max2 = i20.z(max2, textSize, this.D0, max2);
                                }
                                this.D0 = max2;
                                float max10 = Math.max(max9, max2);
                                if (!this.S0) {
                                    this.A0 = (this.y0 || this.I0) ? this.D0 : k(this.A0, max3, this.D0, 160.0f);
                                } else if (!this.s1) {
                                    if (Math.abs(this.B0) > 0.01f) {
                                        float f55 = this.A0;
                                        float f56 = this.B0;
                                        this.A0 = (f56 * max3) + f55;
                                        f26 = max9;
                                        float exp = f56 * ((float) Math.exp((-max3) / 325.0f));
                                        this.B0 = exp;
                                        if (Math.abs(exp) <= 0.01f) {
                                            f27 = 0.0f;
                                            this.B0 = 0.0f;
                                            if (this.A0 >= f26 - g0.L(6.0f) && this.B0 >= f27) {
                                                this.S0 = true;
                                                this.B0 = f27;
                                            }
                                            this.A0 = Math.max(f27, Math.min(max10, this.A0));
                                            float c12 = (i11 - (c(i11) * f49)) + c11 + g0.L(12.0f);
                                            float L7 = this.z0 + f54 + g0.L(8.0f);
                                            RectF rectF2 = this.b1;
                                            rectF2.set(c11 - g0.L(12.0f), f54 - g0.L(8.0f), c12, L7);
                                            if (this.w0 > 0.001f || staticLayout2 == null) {
                                                j3 = uptimeMillis;
                                                f28 = f54;
                                                f29 = c11;
                                                f30 = f20;
                                                i12 = i11;
                                                f31 = L6;
                                                f32 = 90.0f;
                                                i13 = -1;
                                            } else {
                                                StaticLayout staticLayout3 = this.B1;
                                                float f57 = f26;
                                                ArrayList arrayList = this.C1;
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
                                                    canvas2.translate(c11, this.G0);
                                                    if (this.B1 != null) {
                                                        float b11 = b((uptimeMillis - this.A1) / 520.0f);
                                                        if (b11 >= 1.0f) {
                                                            this.B1 = null;
                                                        } else {
                                                            float L8 = g0.L(60.0f);
                                                            float f58 = y0.f(L8, f49, this.l0, b11, -L8);
                                                            f28 = f54;
                                                            f31 = L6;
                                                            f32 = 90.0f;
                                                            f38 = 140.0f;
                                                            int saveLayer = canvas2.saveLayer(-g0.L(10.0f), -g0.L(10.0f), g0.L(30.0f) + this.l0, g0.L(10.0f) + this.B1.getHeight(), null);
                                                            this.B1.draw(canvas2);
                                                            PorterDuffXfermode porterDuffXfermode = new PorterDuffXfermode(PorterDuff.Mode.DST_OUT);
                                                            Paint paint3 = this.E1;
                                                            paint3.setXfermode(porterDuffXfermode);
                                                            paint3.setShader(new LinearGradient(f58 - L8, 0.0f, f58 + L8, 0.0f, -16777216, 0, Shader.TileMode.CLAMP));
                                                            canvas2.drawRect(-g0.L(10.0f), -g0.L(10.0f), g0.L(30.0f) + this.l0, g0.L(10.0f) + this.B1.getHeight(), paint3);
                                                            canvas2.restoreToCount(saveLayer);
                                                            size = arrayList.size() - 1;
                                                            while (size >= 0) {
                                                                ArrayList arrayList2 = arrayList;
                                                                float[] fArr = (float[]) arrayList2.get(size);
                                                                float f59 = uptimeMillis - fArr[4];
                                                                if (f59 >= 0.0f) {
                                                                    float f60 = fArr[5];
                                                                    if (f59 > f60) {
                                                                        arrayList2.remove(size);
                                                                    } else {
                                                                        float f61 = f59 / f60;
                                                                        if (f61 < 0.15f) {
                                                                            y10 = f61 / 0.15f;
                                                                            i15 = size;
                                                                            i16 = i11;
                                                                        } else {
                                                                            i15 = size;
                                                                            i16 = i11;
                                                                            y10 = k5.y(f61, 0.15f, 0.85f, f44);
                                                                        }
                                                                        int i21 = (int) fArr[6];
                                                                        Paint paint4 = this.D1;
                                                                        paint4.setColor(i21);
                                                                        paint4.setAlpha((int) (b(y10) * 255.0f));
                                                                        f39 = f20;
                                                                        canvas2.drawCircle((fArr[2] * f59) + fArr[0], (fArr[3] * f59) + fArr[1], e2.C(f61, 0.4f, 1.0f, fArr[7]), paint4);
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
                                                float L9 = this.A0 > 0.5f ? -getTop() : f28 - g0.L(f16);
                                                int saveLayerAlpha = canvas2.saveLayerAlpha(rectF2.left, Math.min(rectF2.top, L9) + f13, rectF2.right, rectF2.bottom + f13, (int) (this.w0 * 255.0f));
                                                float f62 = f13;
                                                canvas2.translate(0.0f, f62);
                                                canvas2.save();
                                                canvas2.clipRect(rectF2.left, L9, rectF2.right, Math.max(this.z0, this.C0) + f28 + g0.L(6.0f));
                                                canvas2.translate(c11, f28 - this.A0);
                                                float f63 = this.Z0;
                                                if (f63 >= 0.999f || this.k0 == null) {
                                                    i17 = saveLayerAlpha;
                                                    f29 = c11;
                                                    i13 = -1;
                                                } else {
                                                    float f64 = (1.0f - f63) * (this.e0 ? 0.9f : 0.85f);
                                                    Object obj = this.b0;
                                                    TextPaint textPaint2 = this.d;
                                                    if (obj == null || Build.VERSION.SDK_INT < i10 || !canvas2.isHardwareAccelerated()) {
                                                        i17 = saveLayerAlpha;
                                                        f29 = c11;
                                                        i13 = -1;
                                                        textPaint2.setShader(null);
                                                        textPaint2.setColor(j6.r1((1.0f - this.Z0) * (this.e0 ? 0.42f : 0.36f), this.f0));
                                                        this.k0.draw(canvas2);
                                                    } else {
                                                        float f65 = -c11;
                                                        i17 = saveLayerAlpha;
                                                        canvas2 = canvas;
                                                        int saveLayer2 = canvas2.saveLayer(f65, (this.A0 - f28) - f62, getWidth() - c11, ((this.A0 - f28) - f62) + getHeight(), null);
                                                        textPaint2.setShader(null);
                                                        textPaint2.setColor(-1);
                                                        textPaint2.setAlpha((int) (f64 * 255.0f));
                                                        this.k0.draw(canvas2);
                                                        if (this.W == null || this.V != this.e0) {
                                                            this.V = this.e0;
                                                            ColorMatrix colorMatrix = new ColorMatrix();
                                                            colorMatrix.setSaturation(2.2f);
                                                            boolean z17 = this.e0;
                                                            float f66 = z17 ? 1.45f : 0.5f;
                                                            float f67 = z17 ? 72.0f : -4.0f;
                                                            float[] fArr2 = new float[20];
                                                            fArr2[0] = f66;
                                                            fArr2[1] = 0.0f;
                                                            fArr2[2] = 0.0f;
                                                            fArr2[i14] = 0.0f;
                                                            fArr2[4] = f67;
                                                            fArr2[5] = 0.0f;
                                                            fArr2[6] = f66;
                                                            fArr2[7] = 0.0f;
                                                            fArr2[8] = 0.0f;
                                                            fArr2[9] = f67;
                                                            fArr2[10] = 0.0f;
                                                            fArr2[11] = 0.0f;
                                                            fArr2[12] = f66;
                                                            fArr2[13] = 0.0f;
                                                            fArr2[14] = f67;
                                                            fArr2[15] = 0.0f;
                                                            fArr2[16] = 0.0f;
                                                            fArr2[17] = 0.0f;
                                                            fArr2[18] = 1.0f;
                                                            fArr2[19] = 0.0f;
                                                            colorMatrix.postConcat(new ColorMatrix(fArr2));
                                                            Paint paint5 = new Paint();
                                                            this.W = paint5;
                                                            paint5.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                                                            this.W.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
                                                        }
                                                        f29 = c11;
                                                        i13 = -1;
                                                        int saveLayer3 = canvas2.saveLayer(f65, (this.A0 - f28) - f62, getWidth() - c11, ((this.A0 - f28) - f62) + getHeight(), this.W);
                                                        canvas2.save();
                                                        canvas2.translate(f65, (this.A0 - f28) - f62);
                                                        float f68 = f16;
                                                        canvas2.scale(f68, f68);
                                                        RenderNode d2 = a0.d(this.b0);
                                                        RenderNode d10 = a0.d(this.a0);
                                                        if (d10 == null) {
                                                            d10 = new RenderNode("VoiceLiveListen");
                                                            this.a0 = d10;
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
                                                if (this.x1) {
                                                    float max11 = Math.max(g0.L(f38), this.l0 * 0.45f);
                                                    float f69 = y0.f(max11, 2.0f, this.l0, ((uptimeMillis - this.z1) % 1300) / 1300.0f, -max11);
                                                    float[] fArr3 = new float[i14];
                                                    // fill-array-data instruction
                                                    fArr3[0] = 0.0f;
                                                    fArr3[1] = 0.5f;
                                                    fArr3[2] = 1.0f;
                                                    textPaint.setShader(new LinearGradient(f69, 0.0f, f69 + max11, 0.0f, new int[]{this.f0, j6.r1(1.0f, V1), this.f0}, fArr3, Shader.TileMode.CLAMP));
                                                }
                                                StaticLayout staticLayout4 = this.j0;
                                                if (staticLayout4 != null) {
                                                    staticLayout4.draw(canvas2);
                                                }
                                                if (this.x1) {
                                                    textPaint.setShader(null);
                                                }
                                                if (z12) {
                                                    StaticLayout staticLayout5 = this.j0;
                                                    int i22 = V1;
                                                    float k10 = k(this.Y0, max3, this.X0 ? 1.0f : 0.0f, f15);
                                                    this.Y0 = k10;
                                                    if (staticLayout5 != null && k10 >= 0.01f) {
                                                        float lineRight = staticLayout5.getLineRight(staticLayout5.getLineCount() - 1) + g0.L(10.0f);
                                                        float lineBaseline = staticLayout5.getLineBaseline(r5) - (textPaint.getTextSize() * 0.34f);
                                                        this.T0 = lineRight;
                                                        this.U0 = lineBaseline;
                                                        float f70 = this.W0;
                                                        float f71 = this.V0;
                                                        this.W0 = k(f70, max3, f71, f71 > f70 ? 60.0f : 220.0f);
                                                        float N = g0.N(2.2f);
                                                        float N2 = g0.N(2.0f);
                                                        float f72 = uptimeMillis / 1000.0f;
                                                        Paint paint6 = this.x;
                                                        paint6.setColor(i22);
                                                        paint6.setAlpha((int) (Color.alpha(i22) * this.Y0 * 1.0f));
                                                        int i23 = 0;
                                                        while (i23 < 3) {
                                                            long j12 = uptimeMillis;
                                                            double d11 = 1.6d * f72 * 2.0f * 3.141592653589793d;
                                                            double d12 = i23;
                                                            float T12 = g0.T1(0.4f, 1.0f, this.Y0) * g0.W1(b((((((((float) Math.sin((1.9d * d12) + d11)) * 0.5f) + 0.5f) * 0.55f) + 0.45f) * this.W0) + (((float) Math.sin((d12 * 1.3d) + (r8 * 0.7d))) * 0.1f) + 0.16f), g0.L(2.5f), g0.L(10.5f));
                                                            float b12 = i20.b(N, N2, i23, this.T0);
                                                            RectF rectF3 = g0.P;
                                                            float f73 = this.U0;
                                                            float f74 = T12 / 2.0f;
                                                            float f75 = N;
                                                            rectF3.set(b12, f73 - f74, b12 + f75, f73 + f74);
                                                            float f76 = f75 / 2.0f;
                                                            canvas2.drawRoundRect(rectF3, f76, f76, paint6);
                                                            i23++;
                                                            N = f75;
                                                            uptimeMillis = j12;
                                                        }
                                                    }
                                                }
                                                j3 = uptimeMillis;
                                                canvas2.restore();
                                                float f77 = this.A0;
                                                if (f77 > 0.5f) {
                                                    f(canvas2, rectF2.left, L9, rectF2.right, f28 + g0.L(30.0f), false, Math.min(1.0f, f77 / g0.L(40.0f)));
                                                }
                                                if (!this.S0) {
                                                    float f78 = f57 - this.A0;
                                                    if (f78 > 0.5f) {
                                                        canvas2 = canvas;
                                                        f(canvas2, rectF2.left, (f28 + this.z0) - g0.L(28.0f), rectF2.right, f28 + this.z0 + g0.L(6.0f), true, Math.min(1.0f, f78 / g0.L(28.0f)));
                                                        canvas2.restoreToCount(i17);
                                                    }
                                                }
                                                canvas2 = canvas;
                                                canvas2.restoreToCount(i17);
                                            }
                                            float f79 = f28 + this.z0 + L5;
                                            f33 = f30;
                                            min2 = Math.min(f79, f33);
                                            if (min2 >= f33 - g0.L(1.0f)) {
                                                this.J0 = true;
                                            }
                                            float f80 = !this.J0 ? f33 : min2;
                                            boolean z18 = this.B1 == null || j3 - this.A1 < 600;
                                            f34 = this.H0;
                                            if (f34 >= 0.0f || this.y0 || !z18) {
                                                f35 = f32;
                                            } else {
                                                f35 = f32;
                                                f80 = k(f34, max3, f80, f35);
                                            }
                                            this.H0 = f80;
                                            this.I0 = false;
                                            float f81 = max3;
                                            Canvas canvas3 = canvas2;
                                            h(f80, L4, f81, i12, canvas3, z12);
                                            float L10 = f29 - g0.L(2.0f);
                                            float max12 = Math.max(f31, (f28 - g0.L(12.0f)) - g0.L(36.0f));
                                            this.N = k(this.N, f81, this.M == null ? 1.0f : 0.0f, f35);
                                            str = this.M;
                                            if (str == null) {
                                                str = "Detecting…";
                                            }
                                            float measureText = this.e.measureText(str);
                                            f36 = this.O;
                                            if (f36 > 0.0f) {
                                                measureText = k(f36, f81, measureText, 110.0f);
                                            }
                                            this.O = measureText;
                                            float L11 = g0.L(36.0f);
                                            float L12 = g0.L(10.0f) + L10 + g0.L(20.0f) + g0.L(6.0f) + this.O + g0.L(12.0f);
                                            float f82 = L11 + max12;
                                            RectF rectF4 = this.P;
                                            rectF4.set(L10, max12, g0.L(1.0f) + L12 + g0.L(8.0f) + g0.L(20.0f) + g0.L(9.0f), f82);
                                            this.Q.set(L10, max12, L12, f82);
                                            this.R.set(L12, max12, rectF4.right, f82);
                                            f37 = this.w0;
                                            if (f37 > 0.001f) {
                                                int i24 = this.e0 ? i13 : this.f0;
                                                float[] fArr4 = this.k1;
                                                float max13 = Math.max(fArr4[4], fArr4[5]);
                                                canvas3.save();
                                                canvas3.translate(0.0f, (1.0f - this.w0) * (-g0.L(6.0f)));
                                                if (this.U) {
                                                    j(canvas3, rectF4, i24, f37);
                                                } else {
                                                    float f83 = 1.0f - (0.04f * max13);
                                                    canvas3.scale(f83, f83, rectF4.centerX(), rectF4.centerY());
                                                    float f84 = this.R1;
                                                    float f85 = this.h1;
                                                    RectF rectF5 = this.H1;
                                                    RectF rectF6 = this.c1;
                                                    rectF5.set(rectF6);
                                                    this.R1 = 1.0f;
                                                    this.h1 = 0.0f;
                                                    rectF6.set(rectF4);
                                                    g(canvas3, rectF4, max13, f37, f83);
                                                    this.R1 = f84;
                                                    this.h1 = f85;
                                                    rectF6.set(rectF5);
                                                    j(canvas3, rectF4, i24, f37);
                                                }
                                                canvas3.restore();
                                            }
                                            this.y0 = false;
                                            invalidate();
                                        }
                                    } else {
                                        f26 = max9;
                                    }
                                    f27 = 0.0f;
                                    if (this.A0 >= f26 - g0.L(6.0f)) {
                                        this.S0 = true;
                                        this.B0 = f27;
                                    }
                                    this.A0 = Math.max(f27, Math.min(max10, this.A0));
                                    float c122 = (i11 - (c(i11) * f49)) + c11 + g0.L(12.0f);
                                    float L72 = this.z0 + f54 + g0.L(8.0f);
                                    RectF rectF22 = this.b1;
                                    rectF22.set(c11 - g0.L(12.0f), f54 - g0.L(8.0f), c122, L72);
                                    if (this.w0 > 0.001f) {
                                    }
                                    j3 = uptimeMillis;
                                    f28 = f54;
                                    f29 = c11;
                                    f30 = f20;
                                    i12 = i11;
                                    f31 = L6;
                                    f32 = 90.0f;
                                    i13 = -1;
                                    float f792 = f28 + this.z0 + L5;
                                    f33 = f30;
                                    min2 = Math.min(f792, f33);
                                    if (min2 >= f33 - g0.L(1.0f)) {
                                    }
                                    if (!this.J0) {
                                    }
                                    if (this.B1 == null) {
                                    }
                                    f34 = this.H0;
                                    if (f34 >= 0.0f) {
                                    }
                                    f35 = f32;
                                    this.H0 = f80;
                                    this.I0 = false;
                                    float f812 = max3;
                                    Canvas canvas32 = canvas2;
                                    h(f80, L4, f812, i12, canvas32, z12);
                                    float L102 = f29 - g0.L(2.0f);
                                    float max122 = Math.max(f31, (f28 - g0.L(12.0f)) - g0.L(36.0f));
                                    this.N = k(this.N, f812, this.M == null ? 1.0f : 0.0f, f35);
                                    str = this.M;
                                    if (str == null) {
                                    }
                                    float measureText2 = this.e.measureText(str);
                                    f36 = this.O;
                                    if (f36 > 0.0f) {
                                    }
                                    this.O = measureText2;
                                    float L112 = g0.L(36.0f);
                                    float L122 = g0.L(10.0f) + L102 + g0.L(20.0f) + g0.L(6.0f) + this.O + g0.L(12.0f);
                                    float f822 = L112 + max122;
                                    RectF rectF42 = this.P;
                                    rectF42.set(L102, max122, g0.L(1.0f) + L122 + g0.L(8.0f) + g0.L(20.0f) + g0.L(9.0f), f822);
                                    this.Q.set(L102, max122, L122, f822);
                                    this.R.set(L122, max122, rectF42.right, f822);
                                    f37 = this.w0;
                                    if (f37 > 0.001f) {
                                    }
                                    this.y0 = false;
                                    invalidate();
                                }
                                f26 = max9;
                                f27 = 0.0f;
                                this.A0 = Math.max(f27, Math.min(max10, this.A0));
                                float c1222 = (i11 - (c(i11) * f49)) + c11 + g0.L(12.0f);
                                float L722 = this.z0 + f54 + g0.L(8.0f);
                                RectF rectF222 = this.b1;
                                rectF222.set(c11 - g0.L(12.0f), f54 - g0.L(8.0f), c1222, L722);
                                if (this.w0 > 0.001f) {
                                }
                                j3 = uptimeMillis;
                                f28 = f54;
                                f29 = c11;
                                f30 = f20;
                                i12 = i11;
                                f31 = L6;
                                f32 = 90.0f;
                                i13 = -1;
                                float f7922 = f28 + this.z0 + L5;
                                f33 = f30;
                                min2 = Math.min(f7922, f33);
                                if (min2 >= f33 - g0.L(1.0f)) {
                                }
                                if (!this.J0) {
                                }
                                if (this.B1 == null) {
                                }
                                f34 = this.H0;
                                if (f34 >= 0.0f) {
                                }
                                f35 = f32;
                                this.H0 = f80;
                                this.I0 = false;
                                float f8122 = max3;
                                Canvas canvas322 = canvas2;
                                h(f80, L4, f8122, i12, canvas322, z12);
                                float L1022 = f29 - g0.L(2.0f);
                                float max1222 = Math.max(f31, (f28 - g0.L(12.0f)) - g0.L(36.0f));
                                this.N = k(this.N, f8122, this.M == null ? 1.0f : 0.0f, f35);
                                str = this.M;
                                if (str == null) {
                                }
                                float measureText22 = this.e.measureText(str);
                                f36 = this.O;
                                if (f36 > 0.0f) {
                                }
                                this.O = measureText22;
                                float L1122 = g0.L(36.0f);
                                float L1222 = g0.L(10.0f) + L1022 + g0.L(20.0f) + g0.L(6.0f) + this.O + g0.L(12.0f);
                                float f8222 = L1122 + max1222;
                                RectF rectF422 = this.P;
                                rectF422.set(L1022, max1222, g0.L(1.0f) + L1222 + g0.L(8.0f) + g0.L(20.0f) + g0.L(9.0f), f8222);
                                this.Q.set(L1022, max1222, L1222, f8222);
                                this.R.set(L1222, max1222, rectF422.right, f8222);
                                f37 = this.w0;
                                if (f37 > 0.001f) {
                                }
                                this.y0 = false;
                                invalidate();
                            }
                        }
                        f24 = max7;
                        if (!this.J0) {
                        }
                        f25 = this.E0;
                        if (f25 >= 0.0f) {
                        }
                        this.E0 = max8;
                        if (!this.y0) {
                            f40 = this.F0;
                            if (f40 >= 0.0f) {
                            }
                        }
                        float f542 = max8;
                        this.F0 = f542;
                        max = Math.max(this.C0, Math.min(height, Math.max(g0.L(64.0f), min - this.E0)));
                        this.C0 = max;
                        if (this.y0) {
                        }
                        this.z0 = max;
                        float max92 = Math.max(0.0f, height - this.z0);
                        textSize = textPaint.getTextSize() * 1.35f;
                        max2 = Math.max(0.0f, height - max);
                        if (uptimeMillis - this.P0 >= 900) {
                        }
                        if (this.S0) {
                            max2 = i20.z(max2, textSize, this.D0, max2);
                        }
                        this.D0 = max2;
                        float max102 = Math.max(max92, max2);
                        if (!this.S0) {
                        }
                        f26 = max92;
                        f27 = 0.0f;
                        this.A0 = Math.max(f27, Math.min(max102, this.A0));
                        float c12222 = (i11 - (c(i11) * f49)) + c11 + g0.L(12.0f);
                        float L7222 = this.z0 + f542 + g0.L(8.0f);
                        RectF rectF2222 = this.b1;
                        rectF2222.set(c11 - g0.L(12.0f), f542 - g0.L(8.0f), c12222, L7222);
                        if (this.w0 > 0.001f) {
                        }
                        j3 = uptimeMillis;
                        f28 = f542;
                        f29 = c11;
                        f30 = f20;
                        i12 = i11;
                        f31 = L6;
                        f32 = 90.0f;
                        i13 = -1;
                        float f79222 = f28 + this.z0 + L5;
                        f33 = f30;
                        min2 = Math.min(f79222, f33);
                        if (min2 >= f33 - g0.L(1.0f)) {
                        }
                        if (!this.J0) {
                        }
                        if (this.B1 == null) {
                        }
                        f34 = this.H0;
                        if (f34 >= 0.0f) {
                        }
                        f35 = f32;
                        this.H0 = f80;
                        this.I0 = false;
                        float f81222 = max3;
                        Canvas canvas3222 = canvas2;
                        h(f80, L4, f81222, i12, canvas3222, z12);
                        float L10222 = f29 - g0.L(2.0f);
                        float max12222 = Math.max(f31, (f28 - g0.L(12.0f)) - g0.L(36.0f));
                        this.N = k(this.N, f81222, this.M == null ? 1.0f : 0.0f, f35);
                        str = this.M;
                        if (str == null) {
                        }
                        float measureText222 = this.e.measureText(str);
                        f36 = this.O;
                        if (f36 > 0.0f) {
                        }
                        this.O = measureText222;
                        float L11222 = g0.L(36.0f);
                        float L12222 = g0.L(10.0f) + L10222 + g0.L(20.0f) + g0.L(6.0f) + this.O + g0.L(12.0f);
                        float f82222 = L11222 + max12222;
                        RectF rectF4222 = this.P;
                        rectF4222.set(L10222, max12222, g0.L(1.0f) + L12222 + g0.L(8.0f) + g0.L(20.0f) + g0.L(9.0f), f82222);
                        this.Q.set(L10222, max12222, L12222, f82222);
                        this.R.set(L12222, max12222, rectF4222.right, f82222);
                        f37 = this.w0;
                        if (f37 > 0.001f) {
                        }
                        this.y0 = false;
                        invalidate();
                    }
                }
                f20 = f51;
                this.O0 = f20;
                min = Math.min(f50, f20 - L5);
                f21 = this.L0;
                textPaint = this.c;
                if (f21 <= f19) {
                    StaticLayout a102 = a("A\nA", textPaint);
                    StaticLayout a112 = a("A", textPaint);
                    this.L0 = a102.getLineTop(1) - a102.getLineTop(0);
                    this.M0 = a112.getHeight();
                }
                f22 = this.L0;
                if (f22 <= 0.0f) {
                }
                f23 = this.M0;
                if (f23 <= 0.0f) {
                }
                if (f22 > 0.0f) {
                }
                f24 = max7;
                if (!this.J0) {
                }
                f25 = this.E0;
                if (f25 >= 0.0f) {
                }
                this.E0 = max8;
                if (!this.y0) {
                }
                float f5422 = max8;
                this.F0 = f5422;
                max = Math.max(this.C0, Math.min(height, Math.max(g0.L(64.0f), min - this.E0)));
                this.C0 = max;
                if (this.y0) {
                }
                this.z0 = max;
                float max922 = Math.max(0.0f, height - this.z0);
                textSize = textPaint.getTextSize() * 1.35f;
                max2 = Math.max(0.0f, height - max);
                if (uptimeMillis - this.P0 >= 900) {
                }
                if (this.S0) {
                }
                this.D0 = max2;
                float max1022 = Math.max(max922, max2);
                if (!this.S0) {
                }
                f26 = max922;
                f27 = 0.0f;
                this.A0 = Math.max(f27, Math.min(max1022, this.A0));
                float c122222 = (i11 - (c(i11) * f49)) + c11 + g0.L(12.0f);
                float L72222 = this.z0 + f5422 + g0.L(8.0f);
                RectF rectF22222 = this.b1;
                rectF22222.set(c11 - g0.L(12.0f), f5422 - g0.L(8.0f), c122222, L72222);
                if (this.w0 > 0.001f) {
                }
                j3 = uptimeMillis;
                f28 = f5422;
                f29 = c11;
                f30 = f20;
                i12 = i11;
                f31 = L6;
                f32 = 90.0f;
                i13 = -1;
                float f792222 = f28 + this.z0 + L5;
                f33 = f30;
                min2 = Math.min(f792222, f33);
                if (min2 >= f33 - g0.L(1.0f)) {
                }
                if (!this.J0) {
                }
                if (this.B1 == null) {
                }
                f34 = this.H0;
                if (f34 >= 0.0f) {
                }
                f35 = f32;
                this.H0 = f80;
                this.I0 = false;
                float f812222 = max3;
                Canvas canvas32222 = canvas2;
                h(f80, L4, f812222, i12, canvas32222, z12);
                float L102222 = f29 - g0.L(2.0f);
                float max122222 = Math.max(f31, (f28 - g0.L(12.0f)) - g0.L(36.0f));
                this.N = k(this.N, f812222, this.M == null ? 1.0f : 0.0f, f35);
                str = this.M;
                if (str == null) {
                }
                float measureText2222 = this.e.measureText(str);
                f36 = this.O;
                if (f36 > 0.0f) {
                }
                this.O = measureText2222;
                float L112222 = g0.L(36.0f);
                float L122222 = g0.L(10.0f) + L102222 + g0.L(20.0f) + g0.L(6.0f) + this.O + g0.L(12.0f);
                float f822222 = L112222 + max122222;
                RectF rectF42222 = this.P;
                rectF42222.set(L102222, max122222, g0.L(1.0f) + L122222 + g0.L(8.0f) + g0.L(20.0f) + g0.L(9.0f), f822222);
                this.Q.set(L102222, max122222, L122222, f822222);
                this.R.set(L122222, max122222, rectF42222.right, f822222);
                f37 = this.w0;
                if (f37 > 0.001f) {
                }
                this.y0 = false;
                invalidate();
            }
        } else {
            f10 = 16.0f;
            long j13 = uptimeMillis - this.q0;
            float interpolation = U1.getInterpolation(b(j13 / 200.0f));
            this.v0 = (1.0f - erVar.getInterpolation(b((j13 - 40) / 300.0f))) * this.s0;
            float f86 = 1.0f - interpolation;
            this.w0 = this.t0 * f86;
            this.x0 = this.u0 * f86;
            float f87 = (-g0.L(6.0f)) * interpolation;
            this.h1 = g0.L(6.0f) * interpolation;
            if (j13 >= 340) {
                this.x0 = 0.0f;
                this.w0 = 0.0f;
                this.v0 = 0.0f;
                if (this.o0) {
                    return;
                }
                this.o0 = true;
                g0.h3(new e1(this, 23));
                return;
            }
            f11 = f87;
        }
        z10 = true;
        this.i1 = g0.T1(0.92f, 1.0f, this.x0);
        f12 = this.v0;
        float f442 = 1.0f;
        boolean z142 = z10;
        if (f12 <= 0.001f) {
        }
        if (this.a1 < 0) {
        }
        float c112 = c(i11);
        float L42 = g0.L(36.0f);
        float L52 = g0.L(f10);
        float f482 = i7;
        m mVar2 = this.a;
        float f492 = f14;
        ChatActivityEnterView chatActivityEnterView4 = mVar2.b.a;
        chatActivityEnterView4.getLocationInWindow(new int[2]);
        chatActivityEnterView4.U1.getLocationInWindow(new int[2]);
        float min32 = Math.min(f482, (r8[1] - r14[1]) - getTop()) - g0.L(18.0f);
        if (this.j0 != null) {
        }
        this.Z0 = k(this.Z0, max3, !z11 ? 1.0f : 0.0f, 60.0f);
        if (!z11) {
        }
        height = staticLayout == null ? staticLayout.getHeight() : g0.L(30.0f);
        float L62 = g0.L(8.0f) + Math.max((int) r11, g0.m - this.a1);
        L = g0.L(36.0f) + L62 + g0.L(12.0f);
        float f502 = (min32 - L42) - L52;
        float max72 = Math.max(L, ((Math.max(0.0f, f502 - L) * 0.3f) + L) - g0.L(36.0f));
        ChatActivityEnterView chatActivityEnterView22 = mVar2.b.a;
        ggVar = chatActivityEnterView22.w2;
        RectF rectF7 = chatActivityEnterView22.A4;
        if (ggVar == null) {
        }
        staticLayout2 = staticLayout;
        z12 = z11;
        f18 = f17;
        top = f18 - getTop();
        if (this.K0) {
        }
        ChatActivityEnterView chatActivityEnterView32 = mVar2.b.a;
        chatActivityEnterView32.getLocationInWindow(new int[2]);
        chatActivityEnterView32.U1.getLocationInWindow(new int[2]);
        top = Math.min(f482, (r7[1] - r8[1]) - getTop()) - g0.L(42.0f);
        float f512 = top - (L42 / f492);
        if (this.N0) {
        }
        f19 = 0.0f;
        f20 = f512;
        this.O0 = f20;
        min = Math.min(f502, f20 - L52);
        f21 = this.L0;
        textPaint = this.c;
        if (f21 <= f19) {
        }
        f22 = this.L0;
        if (f22 <= 0.0f) {
        }
        f23 = this.M0;
        if (f23 <= 0.0f) {
        }
        if (f22 > 0.0f) {
        }
        f24 = max72;
        if (!this.J0) {
        }
        f25 = this.E0;
        if (f25 >= 0.0f) {
        }
        this.E0 = max8;
        if (!this.y0) {
        }
        float f54222 = max8;
        this.F0 = f54222;
        max = Math.max(this.C0, Math.min(height, Math.max(g0.L(64.0f), min - this.E0)));
        this.C0 = max;
        if (this.y0) {
        }
        this.z0 = max;
        float max9222 = Math.max(0.0f, height - this.z0);
        textSize = textPaint.getTextSize() * 1.35f;
        max2 = Math.max(0.0f, height - max);
        if (uptimeMillis - this.P0 >= 900) {
        }
        if (this.S0) {
        }
        this.D0 = max2;
        float max10222 = Math.max(max9222, max2);
        if (!this.S0) {
        }
        f26 = max9222;
        f27 = 0.0f;
        this.A0 = Math.max(f27, Math.min(max10222, this.A0));
        float c1222222 = (i11 - (c(i11) * f492)) + c112 + g0.L(12.0f);
        float L722222 = this.z0 + f54222 + g0.L(8.0f);
        RectF rectF222222 = this.b1;
        rectF222222.set(c112 - g0.L(12.0f), f54222 - g0.L(8.0f), c1222222, L722222);
        if (this.w0 > 0.001f) {
        }
        j3 = uptimeMillis;
        f28 = f54222;
        f29 = c112;
        f30 = f20;
        i12 = i11;
        f31 = L62;
        f32 = 90.0f;
        i13 = -1;
        float f7922222 = f28 + this.z0 + L52;
        f33 = f30;
        min2 = Math.min(f7922222, f33);
        if (min2 >= f33 - g0.L(1.0f)) {
        }
        if (!this.J0) {
        }
        if (this.B1 == null) {
        }
        f34 = this.H0;
        if (f34 >= 0.0f) {
        }
        f35 = f32;
        this.H0 = f80;
        this.I0 = false;
        float f8122222 = max3;
        Canvas canvas322222 = canvas2;
        h(f80, L42, f8122222, i12, canvas322222, z12);
        float L1022222 = f29 - g0.L(2.0f);
        float max1222222 = Math.max(f31, (f28 - g0.L(12.0f)) - g0.L(36.0f));
        this.N = k(this.N, f8122222, this.M == null ? 1.0f : 0.0f, f35);
        str = this.M;
        if (str == null) {
        }
        float measureText22222 = this.e.measureText(str);
        f36 = this.O;
        if (f36 > 0.0f) {
        }
        this.O = measureText22222;
        float L1122222 = g0.L(36.0f);
        float L1222222 = g0.L(10.0f) + L1022222 + g0.L(20.0f) + g0.L(6.0f) + this.O + g0.L(12.0f);
        float f8222222 = L1122222 + max1222222;
        RectF rectF422222 = this.P;
        rectF422222.set(L1022222, max1222222, g0.L(1.0f) + L1222222 + g0.L(8.0f) + g0.L(20.0f) + g0.L(9.0f), f8222222);
        this.Q.set(L1022222, max1222222, L1222222, f8222222);
        this.R.set(L1222222, max1222222, rectF422222.right, f8222222);
        f37 = this.w0;
        if (f37 > 0.001f) {
        }
        this.y0 = false;
        invalidate();
    }

    @Override // android.view.View
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        int c10 = (int) ((i7 - (c(i7) * 2.0f)) - g0.L(28.0f));
        if (c10 != this.l0 && c10 > 0) {
            this.l0 = c10;
            this.M0 = 0.0f;
            this.L0 = 0.0f;
            this.k0 = a(this.L, this.d);
            q();
        }
        this.a1 = -1;
        if (getParent() instanceof View) {
            View view = (View) getParent();
            StringBuilder sb2 = new StringBuilder("overlay bounds top=");
            sb2.append(getTop());
            sb2.append(" h=");
            sb2.append(i10);
            sb2.append(" parent h=");
            sb2.append(view.getHeight());
            r.b.t(sb2, (getTop() == 0 && i10 == view.getHeight()) ? " (full-screen ok)" : "  ← NOT full-screen: a strip stays unblurred", "VoiceLive");
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        boolean z10 = false;
        if (!this.n0) {
            return false;
        }
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.o1 = x10;
            this.q1 = y10;
            this.p1 = y10;
            this.s1 = false;
            boolean isEmpty = this.i0.trim().isEmpty();
            int o4 = o(x10, y10);
            this.j1 = o4;
            if (o4 < 0) {
                this.j1 = isEmpty ? -1 : n(x10, y10);
            }
            if (this.j1 < 0 && this.b1.contains(x10, y10)) {
                z10 = true;
            }
            this.r1 = z10;
            if (z10) {
                if (this.t1 == null) {
                    this.t1 = VelocityTracker.obtain();
                }
                this.t1.clear();
                this.t1.addMovement(motionEvent);
                this.B0 = 0.0f;
            }
            invalidate();
            return true;
        }
        if (actionMasked == 1) {
            int i7 = this.j1;
            this.j1 = -1;
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
                    post(new w0(this, i7, 12));
                }
            }
            if (this.r1 && this.s1 && (velocityTracker = this.t1) != null) {
                velocityTracker.addMovement(motionEvent);
                this.t1.computeCurrentVelocity(1);
                this.B0 = -this.t1.getYVelocity();
            }
            this.s1 = false;
            this.r1 = false;
            invalidate();
            return true;
        }
        if (actionMasked != 2) {
            if (actionMasked != 3) {
                return true;
            }
            this.j1 = -1;
            this.s1 = false;
            this.r1 = false;
            invalidate();
            return true;
        }
        int i10 = this.j1;
        int i11 = this.u1;
        if (i10 >= 0) {
            int o11 = o(x10, y10);
            if (o11 < 0) {
                o11 = n(x10, y10);
            }
            if (o11 != this.j1 && Math.hypot(x10 - this.o1, y10 - this.p1) > i11) {
                this.j1 = -1;
            }
        }
        if (this.r1) {
            this.t1.addMovement(motionEvent);
            if (!this.s1 && Math.abs(y10 - this.p1) > i11) {
                this.s1 = true;
                this.S0 = false;
                this.q1 = y10;
            }
            if (this.s1) {
                this.A0 -= y10 - this.q1;
                this.q1 = y10;
            }
        }
        invalidate();
        return true;
    }

    public final void q() {
        if (this.l0 <= 0) {
            return;
        }
        if (this.i0.isEmpty()) {
            this.j0 = null;
            return;
        }
        SpannableString spannableString = new SpannableString(this.i0);
        ArrayList arrayList = this.m0;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            o oVar = (o) obj;
            int i10 = oVar.b;
            if (i10 > oVar.a && i10 <= spannableString.length()) {
                spannableString.setSpan(new g2(oVar, 2), oVar.a, oVar.b, 65569);
            }
        }
        int i11 = this.w1;
        if (i11 >= 0 && i11 < spannableString.length()) {
            spannableString.setSpan(new b(1), this.w1, spannableString.length(), 33);
        }
        this.j0 = a(spannableString, this.c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void r(String str) {
        if (str == null) {
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        StaticLayout staticLayout = this.j0;
        this.B1 = staticLayout;
        this.A1 = uptimeMillis;
        int i7 = 1;
        if (this.N0) {
            this.K0 = true;
        }
        float f10 = this.F0;
        if (f10 < 0.0f) {
            f10 = 0.0f;
        }
        this.G0 = f10 - this.A0;
        this.F0 = -1.0f;
        this.E0 = -1.0f;
        this.C0 = 0.0f;
        this.D0 = 0.0f;
        this.S0 = true;
        this.B0 = 0.0f;
        this.I0 = true;
        if (staticLayout != null) {
            Random random = new Random();
            int i10 = V1;
            float f11 = 0.45f;
            float f12 = 0.5f;
            int[] iArr = {i10, i0.a.f(0.45f, i10, -1), i0.a.f(0.5f, V1, -10493697), -1};
            int i11 = 0;
            while (i11 < this.B1.getLineCount()) {
                float lineLeft = this.B1.getLineLeft(i11);
                float lineRight = this.B1.getLineRight(i11);
                float lineTop = this.B1.getLineTop(i11);
                float lineBottom = this.B1.getLineBottom(i11);
                float f13 = lineRight - lineLeft;
                float f14 = f11;
                float f15 = f12;
                int min = (int) Math.min(140.0f, f13 / g0.L(2.6f));
                int i12 = 0;
                while (i12 < min) {
                    float g10 = y0.g(random, f13, lineLeft);
                    float nextFloat = (random.nextFloat() * 0.6f) + 0.2f;
                    int i13 = i7;
                    float c10 = e2.c(g10, Math.max(i7, this.l0), 520.0f, uptimeMillis);
                    float nextFloat2 = ((random.nextFloat() - f15) * g0.L(36.0f)) / 1000.0f;
                    long j3 = uptimeMillis;
                    float f16 = (-((random.nextFloat() * g0.L(34.0f)) + g0.L(10.0f))) / 1000.0f;
                    float g11 = y0.g(random, 380.0f, 480.0f);
                    float f17 = iArr[random.nextInt(4)];
                    float d = y0.d(0.75f, random.nextFloat(), g0.N(f14));
                    float[] fArr = new float[8];
                    fArr[0] = g10;
                    fArr[i13] = (nextFloat * (lineBottom - lineTop)) + lineTop;
                    fArr[2] = nextFloat2;
                    fArr[3] = f16;
                    fArr[4] = c10;
                    fArr[5] = g11;
                    fArr[6] = f17;
                    fArr[7] = d;
                    this.C1.add(fArr);
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
        this.i0 = "";
        ArrayList arrayList = this.m0;
        arrayList.clear();
        this.y1 = i7;
        setText(str);
        this.y1 = false;
        if (this.j0 != null) {
            int size = arrayList.size();
            int i14 = 0;
            while (i14 < size) {
                Object obj = arrayList.get(i14);
                i14++;
                o oVar = (o) obj;
                if (oVar.a < this.i0.length()) {
                    oVar.c = j10 + ((long) (b((this.j0.getPrimaryHorizontal(Math.max(oVar.a, Math.min(oVar.b, this.i0.length()) - 1)) + g0.L(60.0f)) / k5.b(120.0f, this.l0, 1)) * 520.0f)) + 60;
                    oVar.d = 0.0f;
                }
            }
        }
        invalidate();
    }

    public final void s() {
        Object obj;
        if (Build.VERSION.SDK_INT >= 29 && (obj = this.b0) != null) {
            a0.d(obj).discardDisplayList();
        }
        this.b0 = null;
        this.c0 = -1.0f;
    }

    public void setAccent(int i7) {
        this.g0 = i7 | (-16777216);
    }

    public void setBusy(boolean z10) {
        if (this.x1 == z10) {
            return;
        }
        this.x1 = z10;
        this.z1 = SystemClock.uptimeMillis();
        if (!z10) {
            this.c.setShader(null);
        }
        invalidate();
    }

    public void setEditMenuProgress(float f10) {
        this.O1 = f10;
        invalidate();
    }

    public void setEditPillHidden(boolean z10) {
        this.N1 = z10;
        if (!z10) {
            this.O1 = 0.0f;
            if (this.N0) {
                this.v1 = null;
            }
            String str = this.v1;
            if (str != null) {
                this.v1 = null;
                setText(str);
            }
        }
        invalidate();
    }

    public void setLanguage(CharSequence charSequence) {
        String charSequence2 = charSequence == null ? null : charSequence.toString();
        this.M = charSequence2;
        if (this.w0 < 0.01f) {
            this.N = charSequence2 != null ? 1.0f : 0.0f;
            this.O = 0.0f;
        }
        invalidate();
    }

    public void setLanguagePillHidden(boolean z10) {
        this.U = z10;
        invalidate();
    }

    public void setLevel(float f10) {
        this.V0 = Math.max(0.0f, Math.min(1.0f, f10));
    }

    public void setListening(boolean z10) {
        this.X0 = z10;
        invalidate();
    }

    public void setPlaceholder(String str) {
        if (str == null) {
            str = "Listening…";
        }
        if (str.equals(this.L)) {
            return;
        }
        this.L = str;
        if (this.l0 > 0) {
            this.k0 = a(str, this.d);
        }
        invalidate();
    }

    public void setReview(boolean z10) {
        this.N0 = z10;
        invalidate();
    }

    public void setStyleIcon(Drawable drawable) {
        Drawable drawable2 = this.K;
        if (drawable2 instanceof g5) {
            ((g5) drawable2).n(this);
        }
        this.K = drawable;
        if (drawable instanceof g5) {
            ((g5) drawable).a(this);
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
        if (i11 != this.w1) {
            this.w1 = i11;
            if (str3.equals(this.i0) && !this.N1) {
                q();
                invalidate();
            }
        }
        if (this.N1) {
            this.v1 = str3;
            return;
        }
        if (str3.equals(this.i0)) {
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        String str4 = this.i0;
        int min2 = Math.min(str4.length(), str3.length());
        int i12 = 0;
        while (i12 < min2 && str4.charAt(i12) == str3.charAt(i12)) {
            i12++;
        }
        ArrayList arrayList2 = this.m0;
        ArrayList arrayList3 = new ArrayList(arrayList2);
        for (int size = arrayList2.size() - 1; size >= 0; size--) {
            o oVar = (o) arrayList2.get(size);
            if (oVar.a >= i12 || uptimeMillis - oVar.c > 1950) {
                arrayList2.remove(size);
            } else if (oVar.b > i12) {
                oVar.b = i12;
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
            o oVar2 = new o();
            oVar2.a = i12;
            oVar2.b = i14;
            if (this.y1) {
                z10 = z11;
                min = (i13 * 28) + 200 + uptimeMillis;
            } else {
                z10 = z11;
                min = (Math.min(i13, 5) * 45) + uptimeMillis;
            }
            oVar2.c = min;
            oVar2.d = 0.0f;
            if (this.y1 || i12 >= str4.length()) {
                str2 = str4;
                arrayList = arrayList3;
                z11 = z10;
            } else {
                oVar2.d = 1.0f;
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
                                o oVar3 = (o) obj;
                                arrayList = arrayList3;
                                int i18 = oVar3.a;
                                if (i18 <= i12) {
                                    i10 = i17;
                                    if (i12 < Math.max(oVar3.b, i18 + 1)) {
                                        j3 = oVar3.c;
                                        break;
                                    }
                                } else {
                                    i10 = i17;
                                }
                                arrayList3 = arrayList;
                                str4 = str2;
                                i16 = i10;
                            }
                            oVar2.c = j3;
                        } else {
                            str2 = str4;
                            arrayList = arrayList3;
                            oVar2.c = uptimeMillis;
                        }
                    }
                }
                z11 = z10;
                if (z11) {
                }
            }
            arrayList2.add(oVar2);
            i13++;
            i12 = i14;
            arrayList3 = arrayList;
            str4 = str2;
        }
        this.i0 = str3;
        this.P0 = uptimeMillis;
        q();
        invalidate();
    }
}
