package org.telegram.ui.Components;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import java.util.Arrays;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public abstract class sc extends View {
    public static final int[] S;
    public static final int[] T;
    public static long U;
    public static Long V;
    public static Long W;
    public RectF A;
    public final Path B;
    public final Paint C;
    public final Paint D;
    public final LinearGradient E;
    public final LinearGradient F;
    public final Matrix G;
    public final Matrix H;
    public final i6 I;
    public final i6 J;
    public final i6 K;
    public final i6 L;
    public ag.j3 M;
    public boolean N;
    public boolean O;
    public int P;
    public int[] Q;
    public float[] R;
    public final RectF a;
    public final RectF b;
    public final RectF c;
    public final int d;
    public final boolean e;
    public final int[] f;
    public boolean h;
    public final y5 n;
    public boolean r;
    public final y5 s;
    public final qc[] v;
    public final float[] w;
    public final RectF x;
    public final Paint y;

    static {
        int i10 = org.telegram.ui.ActionBar.g6.lj;
        int i11 = org.telegram.ui.ActionBar.g6.hj;
        int i12 = org.telegram.ui.ActionBar.g6.ij;
        int i13 = org.telegram.ui.ActionBar.g6.pj;
        int i14 = org.telegram.ui.ActionBar.g6.mj;
        int i15 = org.telegram.ui.ActionBar.g6.jj;
        int i16 = org.telegram.ui.ActionBar.g6.nj;
        int i17 = org.telegram.ui.ActionBar.g6.qj;
        int i18 = org.telegram.ui.ActionBar.g6.kj;
        S = new int[]{i10, i11, i12, i13, i14, i15, i16, i17, i13, i18, i18};
        int i19 = R.raw.cache_photos;
        int i20 = R.raw.cache_videos;
        int i21 = R.raw.cache_documents;
        int i22 = R.raw.cache_music;
        int i23 = R.raw.cache_stickers;
        int i24 = R.raw.cache_profile_photos;
        int i25 = R.raw.cache_other;
        T = new int[]{i19, i20, i21, i22, i20, i22, i23, i24, i25, i25, i21};
        U = -1L;
    }

    public sc(Context context, int i10, int[] iArr, int i11, int[] iArr2) {
        super(context);
        this.a = new RectF();
        this.b = new RectF();
        this.c = new RectF();
        this.h = true;
        er erVar = er.h;
        this.n = new y5(this, 750L, erVar);
        this.r = false;
        this.s = new y5(this, 650L, erVar);
        this.w = new float[2];
        this.x = new RectF();
        Paint paint = new Paint(1);
        this.y = paint;
        this.B = new Path();
        Paint paint2 = new Paint(1);
        this.C = paint2;
        Paint paint3 = new Paint(1);
        this.D = paint3;
        i6 i6Var = new i6(false, true, true, false);
        this.I = i6Var;
        i6 i6Var2 = new i6(false, true, true, false);
        this.J = i6Var2;
        i6 i6Var3 = new i6(false, true, true, false);
        this.K = i6Var3;
        i6 i6Var4 = new i6(false, true, true, false);
        this.L = i6Var4;
        this.N = true;
        this.P = -1;
        setLayerType(2, null);
        this.f = iArr2;
        this.d = i11;
        this.e = i11 == 0;
        this.v = new qc[i10];
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.i6, false));
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(200.0f), new int[]{7263574, -9513642, -12469647, 4307569}, new float[]{0.0f, 0.07f, 0.93f, 1.0f}, tileMode);
        this.E = linearGradient;
        LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(200.0f), new int[]{7263574, -9513642, -12469647, 4307569}, new float[]{0.0f, 0.07f, 0.93f, 1.0f}, tileMode);
        this.F = linearGradient2;
        this.G = new Matrix();
        this.H = new Matrix();
        paint2.setShader(linearGradient);
        paint3.setShader(linearGradient);
        paint2.setStyle(style);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        paint2.setStrokeJoin(Paint.Join.ROUND);
        i6Var.k(0.2f, 450L, erVar);
        i6Var.v = 0.6f;
        i6Var.r(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.G6, false));
        i6Var.u(AndroidUtilities.bold());
        i6Var.t(AndroidUtilities.dp(32.0f));
        i6Var.b = 17;
        i6Var2.k(0.6f, 450L, erVar);
        i6Var2.v = 0.6f;
        i6Var2.r(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.y6, false));
        i6Var2.t(AndroidUtilities.dp(12.0f));
        i6Var2.b = 17;
        i6Var3.k(0.2f, 450L, erVar);
        i6Var3.v = 0.6f;
        i6Var3.a.setShader(linearGradient2);
        i6Var3.u(AndroidUtilities.bold());
        i6Var3.t(AndroidUtilities.dp(32.0f));
        i6Var3.b = 17;
        i6Var4.k(0.6f, 450L, erVar);
        i6Var4.v = 0.6f;
        i6Var4.a.setShader(linearGradient2);
        i6Var4.u(AndroidUtilities.bold());
        i6Var4.t(AndroidUtilities.dp(12.0f));
        i6Var4.b = 17;
        int i12 = 0;
        while (true) {
            qc[] qcVarArr = this.v;
            if (i12 >= qcVarArr.length) {
                return;
            }
            qc qcVar = new qc(this);
            qcVarArr[i12] = qcVar;
            int v = org.telegram.ui.ActionBar.g6.v(org.telegram.ui.ActionBar.g6.w0(null, iArr[i12], false), ConnectionsManager.FileTypeAudio);
            int v4 = org.telegram.ui.ActionBar.g6.v(org.telegram.ui.ActionBar.g6.w0(null, iArr[i12], false), 822083583);
            AndroidUtilities.dp(50.0f);
            RadialGradient radialGradient = new RadialGradient(0.0f, 0.0f, AndroidUtilities.dp(86.0f), new int[]{v4, v}, new float[]{0.3f, 1.0f}, Shader.TileMode.CLAMP);
            qcVar.v = radialGradient;
            Matrix matrix = new Matrix();
            qcVar.w = matrix;
            radialGradient.setLocalMatrix(matrix);
            qcVar.q.setShader(qcVar.v);
            i12++;
        }
    }

    public static float a(float f10) {
        return (float) ((f10 / 180.0f) * 3.141592653589793d);
    }

    public static boolean b(Canvas canvas, i6 i6Var, float f10, float f11, float f12, float f13) {
        if (f13 <= 0.0f) {
            return false;
        }
        i6Var.w = (int) (f13 * 255.0f);
        i6Var.setBounds(0, 0, 0, 0);
        canvas.save();
        canvas.translate(f10, f11);
        canvas.scale(f12, f12);
        i6Var.draw(canvas);
        canvas.restore();
        return i6Var.f();
    }

    public int c() {
        return 200;
    }

    public abstract void d(int i10, boolean z10);

    /* JADX WARN: Code restructure failed: missing block: B:137:0x0734, code lost:
    
        if (r1.equals(r8) != false) goto L155;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        char c10;
        float f11;
        float f12;
        char c11;
        boolean z10;
        RectF rectF;
        float f13;
        RectF rectF2;
        float f14;
        float f15;
        float f16;
        float f17;
        float[] fArr;
        RectF rectF3;
        RectF rectF4;
        float f18;
        float f19;
        float f20;
        boolean z11;
        int i10;
        float f21;
        RectF rectF5;
        boolean z12;
        float f22;
        float f23;
        i6 i6Var;
        float f24;
        float f25;
        float f26;
        RectF rectF6;
        qc qcVar;
        Canvas canvas2 = canvas;
        float d = this.n.d(this.h ? 1.0f : 0.0f, false);
        float d10 = this.s.d(this.r ? 1.0f : 0.0f, false);
        RectF rectF7 = this.b;
        RectF rectF8 = this.a;
        rectF7.set(rectF8);
        float lerp = AndroidUtilities.lerp(0.0f, AndroidUtilities.dpf2(e()), d10);
        rectF7.inset(lerp, lerp);
        RectF rectF9 = this.c;
        rectF9.set(rectF7);
        float lerp2 = AndroidUtilities.lerp(AndroidUtilities.dpf2(38.0f), AndroidUtilities.dpf2(10.0f), Math.max(d, d10));
        rectF9.inset(lerp2, lerp2);
        float lerp3 = AndroidUtilities.lerp(0, AndroidUtilities.dp(60.0f), d);
        if (V == null) {
            V = Long.valueOf(System.currentTimeMillis());
        }
        boolean z13 = this.h;
        if (!z13 && W == null) {
            W = Long.valueOf(System.currentTimeMillis());
        } else if (z13 && W != null) {
            W = null;
        }
        float currentTimeMillis = ((W == null ? System.currentTimeMillis() : r9.longValue()) - V.longValue()) * 0.6f;
        float[] fArr2 = this.w;
        hp.a(fArr2, currentTimeMillis % 5400.0f);
        float f27 = fArr2[0];
        float f28 = fArr2[1];
        if (d > 0.0f) {
            c10 = 1;
            Paint paint = this.y;
            paint.setStrokeWidth(lerp2);
            f11 = 1.0f;
            int alpha = paint.getAlpha();
            f12 = 0.0f;
            paint.setAlpha((int) (alpha * d));
            c11 = 0;
            f10 = d10;
            canvas2.drawCircle(rectF7.centerX(), rectF7.centerY(), (rectF7.width() - lerp2) / 2.0f, paint);
            paint.setAlpha(alpha);
        } else {
            f10 = d10;
            c10 = 1;
            f11 = 1.0f;
            f12 = 0.0f;
            c11 = 0;
        }
        boolean z14 = d > 0.0f || f10 > f12;
        int i11 = 0;
        while (true) {
            qc[] qcVarArr = this.v;
            if (i11 >= qcVarArr.length) {
                break;
            }
            qc qcVar2 = qcVarArr[i11];
            hp.a(fArr2, (currentTimeMillis + (i11 * 80)) % 5400.0f);
            float min = Math.min(Math.max(fArr2[c11], f27), f28);
            float min2 = Math.min(Math.max(fArr2[c10], f27), f28);
            if (d < f11 || min < min2) {
                RectF rectF10 = rectF8;
                float f29 = (min + min2) / 2.0f;
                float abs = Math.abs(min2 - min) / 2.0f;
                if (d <= f12) {
                    f13 = 360.0f;
                    float d11 = qcVar2.e.d(qcVar2.c, false);
                    abs = qcVar2.f.d(qcVar2.d, false);
                    rectF2 = rectF9;
                    f14 = lerp2;
                    f29 = d11;
                } else {
                    f13 = 360.0f;
                    rectF2 = rectF9;
                    if (d < f11) {
                        f14 = lerp2;
                        f29 = AndroidUtilities.lerp((((float) Math.floor(f28 / 360.0f)) * 360.0f) + qcVar2.e.d(qcVar2.c, false), f29, d);
                        abs = AndroidUtilities.lerp(qcVar2.f.d(qcVar2.d, false), abs, d);
                    } else {
                        f14 = lerp2;
                    }
                }
                boolean z15 = qcVar2.e.i || qcVar2.f.i || z14;
                float f30 = f11 - f10;
                float f31 = f11 - d;
                i6 i6Var2 = qcVar2.k;
                f15 = d;
                Path path = qcVar2.p;
                Paint paint2 = qcVar2.s;
                Paint paint3 = qcVar2.q;
                f16 = lerp3;
                RectF rectF11 = qcVar2.E.x;
                RectF rectF12 = qcVar2.u;
                f17 = f27;
                fArr = fArr2;
                float d12 = qcVar2.o.d(qcVar2.n ? 1.0f : 0.0f, false);
                rectF12.set(rectF7);
                rectF12.inset((-AndroidUtilities.dp(9.0f)) * d12, d12 * (-AndroidUtilities.dp(9.0f)));
                float width = (float) ((((rectF2.width() + rectF12.width()) * Math.cos(a(f29))) / 4.0d) + rectF12.centerX());
                rectF3 = rectF7;
                float width2 = (float) ((((rectF2.width() + rectF12.width()) * Math.sin(a(f29))) / 4.0d) + rectF12.centerY());
                float d13 = qcVar2.h.d(qcVar2.g, false) * f30 * f31;
                float d14 = qcVar2.m.d(qcVar2.l, false);
                paint3.setAlpha((int) (f30 * 255.0f));
                if (abs * 2.0f >= 359.0f) {
                    canvas2.saveLayerAlpha(rectF12, 255, 31);
                    canvas2.drawCircle(rectF12.centerX(), rectF12.centerY(), rectF12.width() / 2.0f, paint2);
                    canvas2.drawRect(rectF12, paint3);
                    f23 = d13;
                    f18 = f28;
                    qcVar2.a(canvas, rectF12.centerX(), rectF12.centerY(), width, width2, 0.0f, 359.0f, rectF2.width() / 2.0f, rectF12.width() / 2.0f, f23, Math.max(0.0f, (f31 / 0.75f) - 0.75f) * d14);
                    qcVar = qcVar2;
                    canvas2 = canvas;
                    canvas2.drawCircle(rectF2.centerX(), rectF2.centerY(), rectF2.width() / 2.0f, qcVar.t);
                    canvas2.restore();
                    i10 = i11;
                    rectF4 = rectF10;
                    z12 = z15;
                    f22 = f10;
                    rectF6 = rectF11;
                    i6Var = i6Var2;
                    f24 = width;
                    f25 = width2;
                    f26 = 0.0f;
                } else {
                    rectF4 = rectF10;
                    f18 = f28;
                    float min3 = Math.min(Math.min(f16, (rectF12.width() - rectF2.width()) / 4.0f), (float) ((rectF2.width() / 2.0f) * (abs / 180.0f) * 3.141592653589793d));
                    float width3 = (rectF12.width() - rectF2.width()) / 2.0f;
                    if (qcVar2.x == f29 && qcVar2.y == abs && qcVar2.z == min3 && qcVar2.A == width3 && qcVar2.B == rectF12.width() && qcVar2.C == rectF12.centerX() && qcVar2.D == rectF12.centerY()) {
                        f19 = f29;
                    } else {
                        qcVar2.x = f29;
                        qcVar2.y = abs;
                        qcVar2.z = min3;
                        qcVar2.A = width3;
                        qcVar2.B = rectF12.width();
                        qcVar2.C = rectF12.centerX();
                        qcVar2.D = rectF12.centerY();
                        float f32 = f29 - abs;
                        float f33 = f29 + abs;
                        boolean z16 = min3 > 0.0f;
                        float f34 = min3 * 2.0f;
                        f19 = f29;
                        float width4 = (min3 / ((float) ((rectF12.width() - f34) * 3.141592653589793d))) * f13;
                        float width5 = ((abs > 175.0f ? 0 : 1) * 0.5f) + ((min3 / ((float) ((rectF2.width() + f34) * 3.141592653589793d))) * f13);
                        float width6 = (rectF12.width() / 2.0f) - min3;
                        float width7 = (rectF2.width() / 2.0f) + min3;
                        path.rewind();
                        float f35 = f33 - f32;
                        if (f35 >= 0.5f) {
                            if (z16) {
                                f20 = f33;
                                double d15 = width6;
                                float f36 = f32 + width4;
                                double b10 = i0.a.b(a(f36), d15, rectF12.centerX());
                                z11 = z16;
                                i10 = i11;
                                f21 = abs;
                                double sin = (Math.sin(a(f36)) * d15) + rectF12.centerY();
                                float f37 = (float) b10;
                                float f38 = (float) sin;
                                rectF11.set(f37 - min3, f38 - min3, f37 + min3, f38 + min3);
                                path.arcTo(rectF11, f36 - 90.0f, 90.0f);
                            } else {
                                f20 = f33;
                                z11 = z16;
                                i10 = i11;
                                f21 = abs;
                            }
                            path.arcTo(rectF12, f32 + width4, f35 - (width4 * 2.0f));
                            if (z11) {
                                double d16 = width6;
                                float b11 = (float) i0.a.b(a(r4), d16, rectF12.centerX());
                                float sin2 = (float) ((Math.sin(a(r4)) * d16) + rectF12.centerY());
                                rectF11.set(b11 - min3, sin2 - min3, b11 + min3, sin2 + min3);
                                path.arcTo(rectF11, f20 - width4, 90.0f);
                                double d17 = width7;
                                float b12 = (float) i0.a.b(a(r4), d17, rectF2.centerX());
                                float sin3 = (float) ((Math.sin(a(r4)) * d17) + rectF2.centerY());
                                rectF11.set(b12 - min3, sin3 - min3, b12 + min3, sin3 + min3);
                                path.arcTo(rectF11, (f20 - width5) + 90.0f, 90.0f);
                            }
                            rectF5 = rectF2;
                            path.arcTo(rectF5, f20 - width5, -(f35 - (width5 * 2.0f)));
                            if (z11) {
                                double d18 = width7;
                                float f39 = f32 + width5;
                                double b13 = i0.a.b(a(f39), d18, rectF5.centerX());
                                double sin4 = (Math.sin(a(f39)) * d18) + rectF5.centerY();
                                float f40 = (float) b13;
                                float f41 = (float) sin4;
                                rectF11.set(f40 - min3, f41 - min3, f40 + min3, f41 + min3);
                                path.arcTo(rectF11, f39 + 180.0f, 90.0f);
                            }
                            path.close();
                            path.computeBounds(qcVar2.r, false);
                            float centerX = rectF12.centerX();
                            float centerY = rectF3.centerY();
                            rectF12.width();
                            qcVar2.w.reset();
                            qcVar2.w.setTranslate(centerX, centerY);
                            qcVar2.v.setLocalMatrix(qcVar2.w);
                            canvas2.saveLayerAlpha(rectF12, 255, 31);
                            canvas2.drawPath(path, paint2);
                            canvas2.drawRect(rectF12, paint3);
                            rectF2 = rectF5;
                            z12 = z15;
                            f22 = f10;
                            f23 = d13;
                            i6Var = i6Var2;
                            f24 = width;
                            f25 = width2;
                            f26 = 0.0f;
                            rectF6 = rectF11;
                            qcVar2.a(canvas, rectF12.centerX(), rectF12.centerY(), f24, f25, f19 - f21, f19 + f21, rectF5.width() / 2.0f, rectF12.width() / 2.0f, f23, Math.max(0.0f, (f31 / 0.75f) - 0.75f) * d14);
                            qcVar = qcVar2;
                            canvas2 = canvas;
                            canvas2.restore();
                        }
                    }
                    i10 = i11;
                    f21 = abs;
                    rectF5 = rectF2;
                    float centerX2 = rectF12.centerX();
                    float centerY2 = rectF3.centerY();
                    rectF12.width();
                    qcVar2.w.reset();
                    qcVar2.w.setTranslate(centerX2, centerY2);
                    qcVar2.v.setLocalMatrix(qcVar2.w);
                    canvas2.saveLayerAlpha(rectF12, 255, 31);
                    canvas2.drawPath(path, paint2);
                    canvas2.drawRect(rectF12, paint3);
                    rectF2 = rectF5;
                    z12 = z15;
                    f22 = f10;
                    f23 = d13;
                    i6Var = i6Var2;
                    f24 = width;
                    f25 = width2;
                    f26 = 0.0f;
                    rectF6 = rectF11;
                    qcVar2.a(canvas, rectF12.centerX(), rectF12.centerY(), f24, f25, f19 - f21, f19 + f21, rectF5.width() / 2.0f, rectF12.width() / 2.0f, f23, Math.max(0.0f, (f31 / 0.75f) - 0.75f) * d14);
                    qcVar = qcVar2;
                    canvas2 = canvas;
                    canvas2.restore();
                }
                float d19 = qcVar.j.d(qcVar.i, false);
                rectF6.set(f24 - f26, f25 - f26, f24 + f26, f25 + f26);
                if (d19 != f11) {
                    canvas2.save();
                    canvas2.scale(d19, d19, rectF6.centerX(), rectF6.centerY());
                }
                i6Var.w = (int) (f23 * 255.0f);
                i6Var.setBounds((int) rectF6.left, (int) rectF6.top, (int) rectF6.right, (int) rectF6.bottom);
                i6Var.draw(canvas2);
                if (d19 != f11) {
                    canvas2.restore();
                }
                z14 = z12;
            } else {
                f15 = d;
                rectF3 = rectF7;
                rectF4 = rectF8;
                rectF2 = rectF9;
                f14 = lerp2;
                f16 = lerp3;
                f17 = f27;
                fArr = fArr2;
                f18 = f28;
                i10 = i11;
                f22 = f10;
            }
            i11 = i10 + 1;
            f10 = f22;
            f28 = f18;
            rectF9 = rectF2;
            lerp2 = f14;
            d = f15;
            lerp3 = f16;
            f27 = f17;
            fArr2 = fArr;
            rectF7 = rectF3;
            rectF8 = rectF4;
            c10 = 1;
            f12 = 0.0f;
            c11 = 0;
        }
        float f42 = d;
        RectF rectF13 = rectF7;
        RectF rectF14 = rectF8;
        float f43 = lerp2;
        float f44 = f10;
        i6 i6Var3 = this.J;
        i6 i6Var4 = this.I;
        int i12 = this.d;
        if (i12 == 0) {
            float f45 = (f11 - f44) * (f11 - f42);
            if (b(canvas2, i6Var4, rectF13.centerX(), rectF13.centerY() - AndroidUtilities.dpf2(5.0f), 1.0f, f45) || z14) {
            }
            b(canvas, i6Var3, rectF13.centerX(), AndroidUtilities.dpf2(22.0f) + rectF13.centerY(), 1.0f, f45);
            z10 = true;
        } else {
            z10 = true;
            if (i12 == 1) {
                float f46 = f11 - f42;
                float centerX3 = rectF13.centerX() - AndroidUtilities.lerp(0.0f, AndroidUtilities.dpf2(4.0f), f44);
                float centerY3 = rectF13.centerY() - AndroidUtilities.lerp(AndroidUtilities.dpf2(5.0f), 0.0f, f44);
                float lerp4 = AndroidUtilities.lerp(1.0f, 2.25f, f44);
                float f47 = f46 * f44;
                boolean z17 = b(canvas, this.K, centerX3, centerY3, lerp4, f47) || z14;
                float f48 = (1.0f - f44) * f46;
                boolean z18 = b(canvas, i6Var4, centerX3, centerY3, lerp4, f48) || z17;
                float lerp5 = AndroidUtilities.lerp(0.0f, AndroidUtilities.dpf2(26.0f), f44) + rectF13.centerX();
                float lerp6 = AndroidUtilities.lerp(AndroidUtilities.dpf2(22.0f), -AndroidUtilities.dpf2(18.0f), f44) + rectF13.centerY();
                float lerp7 = AndroidUtilities.lerp(1.0f, 1.4f, f44);
                if (b(canvas, this.L, lerp5, lerp6, lerp7, f47) || z18) {
                }
                b(canvas, i6Var3, lerp5, lerp6, lerp7, f48);
            }
        }
        if (f44 > 0.0f) {
            if (this.M == null) {
                ag.j3 j3Var = new ag.j3(25);
                this.M = j3Var;
                j3Var.N = 100;
                j3Var.M = z10;
                j3Var.G = z10;
                j3Var.K = false;
                j3Var.H = z10;
                j3Var.r = 18;
                j3Var.B = false;
                j3Var.j = AndroidUtilities.dp(80.0f);
                ag.j3 j3Var2 = this.M;
                j3Var2.w = 0.85f;
                j3Var2.v = 0.85f;
                j3Var2.u = 0.85f;
                j3Var2.c();
                rectF = rectF14;
            } else {
                RectF rectF15 = this.A;
                rectF = rectF14;
                if (rectF15 != null) {
                }
            }
            float min4 = Math.min(getMeasuredHeight(), Math.min(getMeasuredWidth(), AndroidUtilities.dp(150.0f)));
            this.M.a.set(0.0f, 0.0f, min4, min4);
            this.M.a.offset((getMeasuredWidth() - this.M.a.width()) / 2.0f, (getMeasuredHeight() - this.M.a.height()) / 2.0f);
            this.M.b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            this.M.f();
            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
            this.M.e(canvas, f44);
            int i13 = (int) (f44 * 255.0f);
            Paint paint4 = this.D;
            paint4.setAlpha(i13);
            canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint4);
            canvas.restore();
            Paint paint5 = this.C;
            paint5.setStrokeWidth(f43);
            paint5.setAlpha(i13);
            canvas.drawCircle(rectF13.centerX(), rectF13.centerY(), (rectF13.width() - f43) / 2.0f, paint5);
            RectF rectF16 = this.A;
            Path path2 = this.B;
            if (rectF16 == null || !rectF16.equals(rectF)) {
                if (this.A == null) {
                    this.A = new RectF();
                }
                this.A.set(rectF);
                path2.rewind();
                if (i12 == 0) {
                    path2.moveTo(rectF13.width() * 0.348f, rectF13.height() * 0.538f);
                    path2.lineTo(rectF13.width() * 0.447f, rectF13.height() * 0.636f);
                    path2.lineTo(rectF13.width() * 0.678f, rectF13.height() * 0.402f);
                } else if (i12 == z10) {
                    path2.moveTo(rectF13.width() * 0.2929f, rectF13.height() * 0.4369f);
                    path2.lineTo(rectF13.width() * 0.381f, rectF13.height() * 0.35f);
                    path2.lineTo(rectF13.width() * 0.4691f, rectF13.height() * 0.4369f);
                    path2.moveTo(rectF13.width() * 0.381f, rectF13.height() * 0.35f);
                    path2.lineTo(rectF13.width() * 0.381f, rectF13.height() * 0.6548f);
                    path2.moveTo(rectF13.width() * 0.5214f, rectF13.height() * 0.5821f);
                    path2.lineTo(rectF13.width() * 0.6095f, rectF13.height() * 0.669f);
                    path2.lineTo(rectF13.width() * 0.6976f, rectF13.height() * 0.5821f);
                    path2.moveTo(rectF13.width() * 0.6095f, rectF13.height() * 0.669f);
                    path2.lineTo(rectF13.width() * 0.6095f, rectF13.height() * 0.3643f);
                }
                path2.offset(rectF13.left, rectF13.top);
            }
            if (i12 == 0) {
                paint5.setStrokeWidth(AndroidUtilities.dpf2(10.0f));
                canvas.drawPath(path2, paint5);
            }
        }
        if (this.O) {
            invalidate();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ac, code lost:
    
        if (r1 != (-1)) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c0, code lost:
    
        if (r0 != false) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009c  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int i10;
        float x8 = motionEvent.getX();
        float y10 = motionEvent.getY();
        RectF rectF = this.b;
        float a2 = h7.y.a(rectF.centerX(), rectF.centerY(), x8, y10);
        float atan2 = (float) ((Math.atan2(y10 - rectF.centerY(), x8 - rectF.centerX()) / 3.141592653589793d) * 180.0d);
        if (atan2 < 0.0f) {
            atan2 += 360.0f;
        }
        if (a2 > this.c.width() / 2.0f && a2 < (rectF.width() / 2.0f) + AndroidUtilities.dp(14.0f)) {
            i10 = 0;
            while (true) {
                qc[] qcVarArr = this.v;
                if (i10 >= qcVarArr.length) {
                    break;
                }
                qc qcVar = qcVarArr[i10];
                float f10 = qcVar.c;
                float f11 = qcVar.d;
                if (atan2 >= f10 - f11 && atan2 <= f10 + f11) {
                    break;
                }
                i10++;
            }
            if (motionEvent.getAction() != 0) {
                setSelected(i10);
                if (i10 >= 0) {
                    d(i10, i10 != -1);
                    if (getParent() != null && this.N) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                        return true;
                    }
                }
            } else {
                if (motionEvent.getAction() != 2) {
                    if (motionEvent.getAction() == 1) {
                        boolean z10 = i10 != -1;
                        setSelected(-1);
                        d(i10, false);
                    } else if (motionEvent.getAction() == 3) {
                        setSelected(-1);
                        d(i10, false);
                    }
                    return super.dispatchTouchEvent(motionEvent);
                }
                d(i10, i10 != -1);
                setSelected(i10);
            }
            return true;
        }
        i10 = -1;
        if (motionEvent.getAction() != 0) {
        }
        return true;
    }

    public int e() {
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:130:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0232  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(long j10, boolean z10, rc... rcVarArr) {
        boolean z11;
        float f10;
        float f11;
        boolean z12;
        qc qcVar;
        float f12;
        qc[] qcVarArr;
        float[] fArr;
        float f13;
        int i10;
        long j11;
        float f14;
        float f15;
        boolean z13;
        long j12;
        boolean z14;
        rc[] rcVarArr2 = rcVarArr;
        y5 y5Var = this.n;
        y5 y5Var2 = this.s;
        i6 i6Var = this.L;
        i6 i6Var2 = this.K;
        i6 i6Var3 = this.J;
        i6 i6Var4 = this.I;
        qc[] qcVarArr2 = this.v;
        float f16 = 1.0f;
        if (rcVarArr2 == null || rcVarArr2.length == 0) {
            this.h = false;
            this.r = j10 == 0;
            if (z10) {
                z11 = true;
            } else {
                z11 = true;
                y5Var.d(0.0f, true);
                y5Var2.d(this.r ? 1.0f : 0.0f, true);
            }
            i6Var2.q(i6Var4.g, false, z11);
            i6Var4.q("0", z10, z11);
            i6Var2.q("0", z10, z11);
            i6Var.q(i6Var3.g, false, z11);
            i6Var3.q("KB", z10, z11);
            i6Var.q("KB", z10, z11);
            for (qc qcVar2 : qcVarArr2) {
                qcVar2.g = 0.0f;
                if (!z10) {
                    qcVar2.h.d(0.0f, z11);
                }
            }
            invalidate();
            return;
        }
        this.h = false;
        if (!z10) {
            y5Var.d(0.0f, true);
        }
        SpannableString spannableString = new SpannableString("%");
        int length = rcVarArr2.length;
        SpannableString spannableString2 = spannableString;
        long j13 = 0;
        int i11 = 0;
        while (i11 < rcVarArr2.length) {
            if (rcVarArr2[i11] == null) {
                rc rcVar = new rc();
                rcVarArr2[i11] = rcVar;
                j12 = j13;
                rcVar.c = 0L;
            } else {
                j12 = j13;
            }
            rc rcVar2 = rcVarArr2[i11];
            rcVar2.a = i11;
            boolean z15 = rcVar2.b;
            if (z15) {
                z14 = z15;
                j12 += rcVar2.c;
            } else {
                z14 = z15;
            }
            if (rcVar2.c <= 0 || !z14) {
                length--;
            }
            i11++;
            j13 = j12;
        }
        long j14 = j13;
        if (j14 <= 0) {
            this.h = false;
            this.r = j10 <= 0;
            if (z10) {
                z13 = true;
            } else {
                z13 = true;
                y5Var.d(0.0f, true);
                y5Var2.d(this.r ? 1.0f : 0.0f, true);
            }
            i6Var2.q(i6Var4.g, false, z13);
            i6Var4.q("0", z10, z13);
            i6Var2.q("0", z10, z13);
            i6Var.q(i6Var3.g, false, z13);
            i6Var3.q("KB", z10, z13);
            i6Var.q("KB", z10, z13);
            int i12 = 0;
            while (i12 < qcVarArr2.length) {
                qc qcVar3 = qcVarArr2[i12];
                qcVar3.g = 0.0f;
                if (!z10) {
                    qcVar3.h.d(0.0f, z13);
                }
                i12++;
                z13 = true;
            }
            invalidate();
            return;
        }
        qc[] qcVarArr3 = qcVarArr2;
        int i13 = 0;
        int i14 = 0;
        float f17 = 0.0f;
        while (i13 < rcVarArr2.length) {
            rc rcVar3 = rcVarArr2[i13];
            if (rcVar3 == null || !rcVar3.b) {
                i10 = i13;
                j11 = j14;
                f14 = 0.02f;
                f15 = 0.0f;
            } else {
                f14 = 0.02f;
                i10 = i13;
                j11 = j14;
                f15 = rcVar3.c / j11;
            }
            if (f15 > 0.0f && f15 < f14) {
                i14++;
                f17 += f15;
            }
            i13 = i10 + 1;
            j14 = j11;
        }
        long j15 = j14;
        Math.min(rcVarArr2.length, qcVarArr3.length);
        int[] iArr = this.Q;
        if (iArr == null || iArr.length != rcVarArr2.length) {
            this.Q = new int[rcVarArr2.length];
        }
        float[] fArr2 = this.R;
        if (fArr2 == null || fArr2.length != rcVarArr2.length) {
            this.R = new float[rcVarArr2.length];
        }
        int i15 = 0;
        while (i15 < rcVarArr2.length) {
            float[] fArr3 = this.R;
            int i16 = i15;
            rc rcVar4 = rcVarArr2[i16];
            float f18 = f17;
            if (rcVar4 != null) {
                qcVarArr = qcVarArr3;
                if (rcVar4.b) {
                    fArr = fArr3;
                    f13 = rcVar4.c / j15;
                    fArr[i16] = f13;
                    i15 = i16 + 1;
                    f17 = f18;
                    qcVarArr3 = qcVarArr;
                }
            } else {
                qcVarArr = qcVarArr3;
            }
            fArr = fArr3;
            f13 = 0.0f;
            fArr[i16] = f13;
            i15 = i16 + 1;
            f17 = f18;
            qcVarArr3 = qcVarArr;
        }
        float f19 = f17;
        qc[] qcVarArr4 = qcVarArr3;
        AndroidUtilities.roundPercents(this.R, this.Q);
        if (this.d == 0) {
            Arrays.sort(rcVarArr2, new k9.a(22));
            int i17 = 0;
            while (true) {
                if (i17 > rcVarArr2.length) {
                    break;
                }
                rc rcVar5 = rcVarArr2[i17];
                if (rcVar5.a == rcVarArr2.length - 1) {
                    rc rcVar6 = rcVarArr2[0];
                    rcVarArr2[0] = rcVar5;
                    rcVarArr2[i17] = rcVar6;
                    break;
                }
                i17++;
            }
        }
        if (length < 2) {
            length = 0;
        }
        float f20 = 360.0f - (length * 2.0f);
        int i18 = 0;
        int i19 = 0;
        float f21 = 0.0f;
        while (i18 < rcVarArr2.length) {
            rc rcVar7 = rcVarArr2[i18];
            int i20 = rcVar7.a;
            int i21 = i18;
            float f22 = !rcVar7.b ? 0.0f : rcVar7.c / j15;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            float f23 = f20;
            spannableStringBuilder.append((CharSequence) String.format("%d", Integer.valueOf(this.Q[i20])));
            SpannableString spannableString3 = spannableString2;
            spannableStringBuilder.append((CharSequence) spannableString3);
            qc qcVar4 = qcVarArr4[i20];
            i6 i6Var5 = i6Var;
            i6 i6Var6 = i6Var2;
            float f24 = (((double) f22) <= 0.05d || f22 >= f16) ? 0.0f : 1.0f;
            qcVar4.g = f24;
            if (f22 >= 0.08f) {
                f10 = f22;
                if (this.Q[i20] < 100) {
                    f11 = 1.0f;
                    qcVar4.i = f11;
                    qcVar4.l = 1.0f;
                    if (z10) {
                        y5 y5Var3 = qcVar4.h;
                        z12 = true;
                        y5Var3.d(f24, true);
                        qc qcVar5 = qcVarArr4[i20];
                        qcVar5.j.d(qcVar5.i, true);
                        qc qcVar6 = qcVarArr4[i20];
                        qcVar6.m.d(qcVar6.l, true);
                    } else {
                        z12 = true;
                    }
                    qcVar = qcVarArr4[i20];
                    if (qcVar.g > 0.0f) {
                        qcVar.k.q(spannableStringBuilder, z10, z12);
                    }
                    if (f10 < 0.02f || f10 <= 0.0f) {
                        f16 = 1.0f;
                        f12 = (1.0f - ((i14 * 0.02f) - f19)) * f10;
                    } else {
                        f12 = 0.02f;
                        f16 = 1.0f;
                    }
                    float f25 = (i19 * 2.0f) + (f21 * f23);
                    float f26 = (f12 * f23) + f25;
                    if (f12 > 0.0f) {
                        qc qcVar7 = qcVarArr4[i20];
                        qcVar7.c = (f25 + f26) / 2.0f;
                        qcVar7.d = Math.abs(f26 - f25) / 2.0f;
                        qc qcVar8 = qcVarArr4[i20];
                        qcVar8.g = 0.0f;
                        if (!z10) {
                            qcVar8.e.d(qcVar8.c, true);
                            qc qcVar9 = qcVarArr4[i20];
                            qcVar9.f.d(qcVar9.d, true);
                            qc qcVar10 = qcVarArr4[i20];
                            qcVar10.h.d(qcVar10.g, true);
                        }
                    } else {
                        qc qcVar11 = qcVarArr4[i20];
                        qcVar11.c = (f25 + f26) / 2.0f;
                        qcVar11.d = Math.abs(f26 - f25) / 2.0f;
                        if (!z10) {
                            qc qcVar12 = qcVarArr4[i20];
                            qcVar12.e.d(qcVar12.c, true);
                            qc qcVar13 = qcVarArr4[i20];
                            qcVar13.f.d(qcVar13.d, true);
                        }
                        f21 += f12;
                        i19++;
                    }
                    i18 = i21 + 1;
                    rcVarArr2 = rcVarArr;
                    i6Var2 = i6Var6;
                    i6Var = i6Var5;
                    f20 = f23;
                    spannableString2 = spannableString3;
                }
            } else {
                f10 = f22;
            }
            f11 = 0.85f;
            qcVar4.i = f11;
            qcVar4.l = 1.0f;
            if (z10) {
            }
            qcVar = qcVarArr4[i20];
            if (qcVar.g > 0.0f) {
            }
            if (f10 < 0.02f) {
            }
            f16 = 1.0f;
            f12 = (1.0f - ((i14 * 0.02f) - f19)) * f10;
            float f252 = (i19 * 2.0f) + (f21 * f23);
            float f262 = (f12 * f23) + f252;
            if (f12 > 0.0f) {
            }
            i18 = i21 + 1;
            rcVarArr2 = rcVarArr;
            i6Var2 = i6Var6;
            i6Var = i6Var5;
            f20 = f23;
            spannableString2 = spannableString3;
        }
        i6 i6Var7 = i6Var;
        i6 i6Var8 = i6Var2;
        String[] split = AndroidUtilities.formatFileSize(j15, true, true).split(" ");
        String str = split.length > 0 ? split[0] : "";
        if (str.length() >= 4 && j15 < 1073741824) {
            str = str.split("\\.")[0];
        }
        i6Var4.q(str, z10, true);
        i6Var3.q(split.length > 1 ? split[1] : "", z10, true);
        if (y5Var2.c > 0.0f) {
            i6Var8.q(i6Var4.g, z10, true);
            i6Var7.q(i6Var3.g, z10, true);
        }
        this.r = false;
        if (!z10) {
            y5Var2.d(0.0f, true);
        }
        invalidate();
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.O = true;
        int i10 = 0;
        while (true) {
            qc[] qcVarArr = this.v;
            if (i10 >= qcVarArr.length) {
                return;
            }
            qc qcVar = qcVarArr[i10];
            if (qcVar.b == null) {
                boolean z10 = this.e;
                int[] iArr = this.f;
                if (z10) {
                    qcVar.b = SvgHelper.getBitmap(iArr[i10], AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), -1);
                } else {
                    qcVar.b = BitmapFactory.decodeResource(getContext().getResources(), iArr[i10]);
                }
            }
            i10++;
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        requestLayout();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = 0;
        this.O = false;
        while (true) {
            qc[] qcVarArr = this.v;
            if (i10 >= qcVarArr.length) {
                return;
            }
            Bitmap bitmap = qcVarArr[i10].b;
            if (bitmap != null) {
                bitmap.recycle();
                qcVarArr[i10].b = null;
            }
            i10++;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int dp = AndroidUtilities.dp(c());
        int dp2 = AndroidUtilities.dp(172.0f);
        RectF rectF = this.a;
        rectF.set((size - dp2) / 2.0f, (dp - dp2) / 2.0f, (size + dp2) / 2.0f, (dp2 + dp) / 2.0f);
        Matrix matrix = this.G;
        matrix.reset();
        matrix.setTranslate(rectF.left, 0.0f);
        this.E.setLocalMatrix(matrix);
        Matrix matrix2 = this.H;
        matrix2.reset();
        matrix2.setTranslate(rectF.left, -rectF.centerY());
        this.F.setLocalMatrix(matrix2);
        ag.j3 j3Var = this.M;
        if (j3Var != null) {
            j3Var.a.set(0.0f, 0.0f, AndroidUtilities.dp(140.0f), AndroidUtilities.dp(140.0f));
            this.M.a.offset((getMeasuredWidth() - this.M.a.width()) / 2.0f, (getMeasuredHeight() - this.M.a.height()) / 2.0f);
            this.M.b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            this.M.f();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(dp, TLObject.FLAG_30));
    }

    public void setInterceptTouch(boolean z10) {
        this.N = z10;
    }

    public void setSelected(int i10) {
        if (i10 == this.P) {
            return;
        }
        int i11 = 0;
        while (true) {
            qc[] qcVarArr = this.v;
            if (i11 >= qcVarArr.length) {
                this.P = i10;
                invalidate();
                return;
            }
            if (i10 == i11 && qcVarArr[i11].d <= 0.0f) {
                i10 = -1;
            }
            qcVarArr[i11].n = i10 == i11;
            i11++;
        }
    }
}
