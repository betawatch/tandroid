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
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public abstract class ic extends View implements org.telegram.ui.ActionBar.k6 {
    public static final int[] W;
    public static final int[] a0;
    public static long b0;
    public static Long c0;
    public static Long d0;
    public final Paint D;
    public RectF E;
    public final Path F;
    public final Paint G;
    public final Paint H;
    public final LinearGradient I;
    public final LinearGradient J;
    public final Matrix K;
    public final Matrix L;
    public final e6 M;
    public final e6 N;
    public final e6 O;
    public final e6 P;
    public kg.f2 Q;
    public boolean R;
    public boolean S;
    public int T;
    public int[] U;
    public float[] V;
    public final RectF a;
    public final RectF b;
    public final RectF c;
    public final int d;
    public final boolean e;
    public final int[] f;
    public boolean h;
    public final t5 n;
    public boolean r;
    public final t5 s;
    public final gc[] w;
    public final float[] x;
    public final RectF y;

    static {
        int i10 = org.telegram.ui.ActionBar.t6.Zj;
        int i11 = org.telegram.ui.ActionBar.t6.Vj;
        int i12 = org.telegram.ui.ActionBar.t6.Wj;
        int i13 = org.telegram.ui.ActionBar.t6.dk;
        int i14 = org.telegram.ui.ActionBar.t6.ak;
        int i15 = org.telegram.ui.ActionBar.t6.Xj;
        int i16 = org.telegram.ui.ActionBar.t6.bk;
        int i17 = org.telegram.ui.ActionBar.t6.ek;
        int i18 = org.telegram.ui.ActionBar.t6.Yj;
        W = new int[]{i10, i11, i12, i13, i14, i15, i16, i17, i13, i18, i18};
        a0 = new int[]{R.raw.cache_photos, R.raw.cache_videos, R.raw.cache_documents, R.raw.cache_music, R.raw.cache_videos, R.raw.cache_music, R.raw.cache_stickers, R.raw.cache_profile_photos, R.raw.cache_other, R.raw.cache_other, R.raw.cache_documents};
        b0 = -1L;
    }

    public ic(Context context, int i10, int[] iArr, int i11, int[] iArr2) {
        super(context);
        this.a = new RectF();
        this.b = new RectF();
        this.c = new RectF();
        this.h = true;
        gr grVar = gr.h;
        this.n = new t5(this, 750L, grVar);
        this.r = false;
        this.s = new t5(this, 650L, grVar);
        this.x = new float[2];
        this.y = new RectF();
        Paint paint = new Paint(1);
        this.D = paint;
        this.F = new Path();
        Paint paint2 = new Paint(1);
        this.G = paint2;
        Paint paint3 = new Paint(1);
        this.H = paint3;
        e6 e6Var = new e6(false, true, true);
        this.M = e6Var;
        e6 e6Var2 = new e6(false, true, true);
        this.N = e6Var2;
        e6 e6Var3 = new e6(false, true, true);
        this.O = e6Var3;
        e6 e6Var4 = new e6(false, true, true);
        this.P = e6Var4;
        this.R = true;
        this.T = -1;
        setLayerType(2, null);
        this.f = iArr2;
        this.d = i11;
        this.e = i11 == 0;
        this.w = new gc[i10];
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.i6, false));
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, org.telegram.messenger.i0.L(200.0f), new int[]{7263574, -9513642, -12469647, 4307569}, new float[]{0.0f, 0.07f, 0.93f, 1.0f}, tileMode);
        this.I = linearGradient;
        LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, 0.0f, org.telegram.messenger.i0.L(200.0f), new int[]{7263574, -9513642, -12469647, 4307569}, new float[]{0.0f, 0.07f, 0.93f, 1.0f}, tileMode);
        this.J = linearGradient2;
        this.K = new Matrix();
        this.L = new Matrix();
        paint2.setShader(linearGradient);
        paint3.setShader(linearGradient);
        paint2.setStyle(style);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        paint2.setStrokeJoin(Paint.Join.ROUND);
        e6Var.n(0.2f, 450L, grVar);
        e6Var.A = 0.6f;
        e6Var.u(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.G6, false));
        e6Var.x(org.telegram.messenger.i0.o());
        e6Var.w(org.telegram.messenger.i0.L(32.0f));
        e6Var.b = 17;
        e6Var2.n(0.6f, 450L, grVar);
        e6Var2.A = 0.6f;
        e6Var2.u(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.y6, false));
        e6Var2.w(org.telegram.messenger.i0.L(12.0f));
        e6Var2.b = 17;
        e6Var3.n(0.2f, 450L, grVar);
        e6Var3.A = 0.6f;
        e6Var3.a.setShader(linearGradient2);
        e6Var3.x(org.telegram.messenger.i0.o());
        e6Var3.w(org.telegram.messenger.i0.L(32.0f));
        e6Var3.b = 17;
        e6Var4.n(0.6f, 450L, grVar);
        e6Var4.A = 0.6f;
        e6Var4.a.setShader(linearGradient2);
        e6Var4.x(org.telegram.messenger.i0.o());
        e6Var4.w(org.telegram.messenger.i0.L(12.0f));
        e6Var4.b = 17;
        int i12 = 0;
        while (true) {
            gc[] gcVarArr = this.w;
            if (i12 >= gcVarArr.length) {
                return;
            }
            gc gcVar = new gc(this);
            gcVarArr[i12] = gcVar;
            int w9 = org.telegram.ui.ActionBar.t6.w(org.telegram.ui.ActionBar.t6.x0(null, iArr[i12], false), ConnectionsManager.FileTypeAudio);
            int w10 = org.telegram.ui.ActionBar.t6.w(org.telegram.ui.ActionBar.t6.x0(null, iArr[i12], false), 822083583);
            org.telegram.messenger.i0.L(50.0f);
            RadialGradient radialGradient = new RadialGradient(0.0f, 0.0f, org.telegram.messenger.i0.L(86.0f), new int[]{w10, w9}, new float[]{0.3f, 1.0f}, Shader.TileMode.CLAMP);
            gcVar.v = radialGradient;
            Matrix matrix = new Matrix();
            gcVar.w = matrix;
            radialGradient.setLocalMatrix(matrix);
            gcVar.q.setShader(gcVar.v);
            i12++;
        }
    }

    public static float a(float f7) {
        return (float) ((f7 / 180.0f) * 3.141592653589793d);
    }

    public static boolean b(Canvas canvas, e6 e6Var, float f7, float f10, float f11, float f12) {
        if (f12 <= 0.0f) {
            return false;
        }
        e6Var.B = (int) (f12 * 255.0f);
        e6Var.setBounds(0, 0, 0, 0);
        canvas.save();
        canvas.translate(f7, f10);
        canvas.scale(f11, f11);
        e6Var.draw(canvas);
        canvas.restore();
        return e6Var.h();
    }

    public int c() {
        return org.telegram.messenger.zs.e3;
    }

    public abstract void d(int i10, boolean z10);

    /* JADX WARN: Code restructure failed: missing block: B:137:0x0738, code lost:
    
        if (r1.equals(r8) != false) goto L155;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        int i10;
        float f10;
        int i11;
        float f11;
        boolean z10;
        RectF rectF;
        RectF rectF2;
        float f12;
        float f13;
        float f14;
        float f15;
        float[] fArr;
        RectF rectF3;
        RectF rectF4;
        float f16;
        float f17;
        float f18;
        boolean z11;
        int i12;
        float f19;
        RectF rectF5;
        float f20;
        int i13;
        float f21;
        e6 e6Var;
        float f22;
        float f23;
        float f24;
        RectF rectF6;
        gc gcVar;
        Canvas canvas2 = canvas;
        float e = this.n.e(false, this.h ? 1.0f : 0.0f);
        float e7 = this.s.e(false, this.r ? 1.0f : 0.0f);
        RectF rectF7 = this.b;
        RectF rectF8 = this.a;
        rectF7.set(rectF8);
        float T1 = org.telegram.messenger.i0.T1(0.0f, org.telegram.messenger.i0.N(e()), e7);
        rectF7.inset(T1, T1);
        RectF rectF9 = this.c;
        rectF9.set(rectF7);
        float T12 = org.telegram.messenger.i0.T1(org.telegram.messenger.i0.N(38.0f), org.telegram.messenger.i0.N(10.0f), Math.max(e, e7));
        rectF9.inset(T12, T12);
        float W1 = org.telegram.messenger.i0.W1(e, 0, org.telegram.messenger.i0.L(60.0f));
        if (c0 == null) {
            c0 = Long.valueOf(System.currentTimeMillis());
        }
        boolean z12 = this.h;
        if (!z12 && d0 == null) {
            d0 = Long.valueOf(System.currentTimeMillis());
        } else if (z12 && d0 != null) {
            d0 = null;
        }
        float currentTimeMillis = ((d0 == null ? System.currentTimeMillis() : r9.longValue()) - c0.longValue()) * 0.6f;
        float[] fArr2 = this.x;
        kp.a(currentTimeMillis % 5400.0f, fArr2);
        float f25 = fArr2[0];
        float f26 = fArr2[1];
        if (e > 0.0f) {
            i10 = 1;
            Paint paint = this.D;
            paint.setStrokeWidth(T12);
            f11 = 1.0f;
            int alpha = paint.getAlpha();
            f10 = 0.0f;
            paint.setAlpha((int) (alpha * e));
            i11 = 0;
            f7 = e7;
            canvas2.drawCircle(rectF7.centerX(), rectF7.centerY(), (rectF7.width() - T12) / 2.0f, paint);
            paint.setAlpha(alpha);
        } else {
            f7 = e7;
            i10 = 1;
            f10 = 0.0f;
            i11 = 0;
            f11 = 1.0f;
        }
        int i14 = (e > 0.0f || f7 > f10) ? i10 : i11;
        int i15 = i11;
        while (true) {
            gc[] gcVarArr = this.w;
            if (i15 >= gcVarArr.length) {
                break;
            }
            gc gcVar2 = gcVarArr[i15];
            kp.a((currentTimeMillis + (i15 * 80)) % 5400.0f, fArr2);
            float min = Math.min(Math.max(fArr2[i11], f25), f26);
            float min2 = Math.min(Math.max(fArr2[i10], f25), f26);
            if (e < f11 || min < min2) {
                RectF rectF10 = rectF8;
                float f27 = (min + min2) / 2.0f;
                float abs = Math.abs(min2 - min) / 2.0f;
                if (e <= f10) {
                    boolean z13 = i11;
                    float e10 = gcVar2.e.e(z13, gcVar2.c);
                    abs = gcVar2.f.e(z13, gcVar2.d);
                    rectF2 = rectF9;
                    f12 = T12;
                    f27 = e10;
                } else {
                    boolean z14 = i11;
                    rectF2 = rectF9;
                    if (e < f11) {
                        f12 = T12;
                        f27 = org.telegram.messenger.i0.T1((((float) Math.floor(f26 / 360.0f)) * 360.0f) + gcVar2.e.e(z14, gcVar2.c), f27, e);
                        abs = org.telegram.messenger.i0.T1(gcVar2.f.e(z14, gcVar2.d), abs, e);
                    } else {
                        f12 = T12;
                    }
                }
                int i16 = (gcVar2.e.i || gcVar2.f.i || i14 != 0) ? i10 : 0;
                float f28 = f11 - f7;
                float f29 = f11 - e;
                e6 e6Var2 = gcVar2.k;
                f13 = e;
                Path path = gcVar2.p;
                Paint paint2 = gcVar2.s;
                Paint paint3 = gcVar2.q;
                f14 = W1;
                RectF rectF11 = gcVar2.E.y;
                RectF rectF12 = gcVar2.u;
                f15 = f25;
                fArr = fArr2;
                float e11 = gcVar2.o.e(false, gcVar2.n ? f11 : f10);
                rectF12.set(rectF7);
                rectF12.inset((-org.telegram.messenger.i0.L(9.0f)) * e11, e11 * (-org.telegram.messenger.i0.L(9.0f)));
                float width = (float) ((((rectF2.width() + rectF12.width()) * Math.cos(a(f27))) / 4.0d) + rectF12.centerX());
                rectF3 = rectF7;
                float width2 = (float) ((((rectF2.width() + rectF12.width()) * Math.sin(a(f27))) / 4.0d) + rectF12.centerY());
                float e12 = gcVar2.h.e(false, gcVar2.g) * f28 * f29;
                float e13 = gcVar2.m.e(false, gcVar2.l);
                paint3.setAlpha((int) (f28 * 255.0f));
                if (abs * 2.0f >= 359.0f) {
                    canvas2.saveLayerAlpha(rectF12, org.telegram.messenger.zs.e4, 31);
                    canvas2.drawCircle(rectF12.centerX(), rectF12.centerY(), rectF12.width() / 2.0f, paint2);
                    canvas2.drawRect(rectF12, paint3);
                    f24 = e12;
                    f16 = f26;
                    gcVar2.a(canvas, rectF12.centerX(), rectF12.centerY(), width, width2, 0.0f, 359.0f, rectF2.width() / 2.0f, rectF12.width() / 2.0f, f24, Math.max(f10, (f29 / 0.75f) - 0.75f) * e13);
                    gcVar = gcVar2;
                    canvas2 = canvas;
                    canvas2.drawCircle(rectF2.centerX(), rectF2.centerY(), rectF2.width() / 2.0f, gcVar.t);
                    canvas2.restore();
                    i12 = i15;
                    rectF4 = rectF10;
                    i13 = i16;
                    f21 = f7;
                    rectF6 = rectF11;
                    e6Var = e6Var2;
                    f22 = width;
                    f23 = width2;
                    f20 = 0.0f;
                } else {
                    rectF4 = rectF10;
                    f16 = f26;
                    float min3 = Math.min(Math.min(f14, (rectF12.width() - rectF2.width()) / 4.0f), (float) ((rectF2.width() / 2.0f) * (abs / 180.0f) * 3.141592653589793d));
                    float width3 = (rectF12.width() - rectF2.width()) / 2.0f;
                    if (gcVar2.x == f27 && gcVar2.y == abs && gcVar2.z == min3 && gcVar2.A == width3 && gcVar2.B == rectF12.width() && gcVar2.C == rectF12.centerX() && gcVar2.D == rectF12.centerY()) {
                        f17 = f27;
                    } else {
                        gcVar2.x = f27;
                        gcVar2.y = abs;
                        gcVar2.z = min3;
                        gcVar2.A = width3;
                        gcVar2.B = rectF12.width();
                        gcVar2.C = rectF12.centerX();
                        gcVar2.D = rectF12.centerY();
                        float f30 = f27 - abs;
                        float f31 = f27 + abs;
                        boolean z15 = min3 > 0.0f;
                        float f32 = min3 * 2.0f;
                        f17 = f27;
                        float width4 = (min3 / ((float) ((rectF12.width() - f32) * 3.141592653589793d))) * 360.0f;
                        float width5 = ((abs > 175.0f ? 0 : 1) * 0.5f) + ((min3 / ((float) ((rectF2.width() + f32) * 3.141592653589793d))) * 360.0f);
                        float width6 = (rectF12.width() / 2.0f) - min3;
                        float width7 = (rectF2.width() / 2.0f) + min3;
                        path.rewind();
                        float f33 = f31 - f30;
                        if (f33 >= 0.5f) {
                            if (z15) {
                                f18 = f31;
                                double d = width6;
                                float f34 = f30 + width4;
                                double c10 = i0.a.c(a(f34), d, rectF12.centerX());
                                z11 = z15;
                                i12 = i15;
                                f19 = abs;
                                double sin = (Math.sin(a(f34)) * d) + rectF12.centerY();
                                float f35 = (float) c10;
                                float f36 = (float) sin;
                                rectF11.set(f35 - min3, f36 - min3, f35 + min3, f36 + min3);
                                path.arcTo(rectF11, f34 - 90.0f, 90.0f);
                            } else {
                                f18 = f31;
                                z11 = z15;
                                i12 = i15;
                                f19 = abs;
                            }
                            path.arcTo(rectF12, f30 + width4, f33 - (width4 * 2.0f));
                            if (z11) {
                                double d10 = width6;
                                float c11 = (float) i0.a.c(a(r4), d10, rectF12.centerX());
                                float sin2 = (float) ((Math.sin(a(r4)) * d10) + rectF12.centerY());
                                rectF11.set(c11 - min3, sin2 - min3, c11 + min3, sin2 + min3);
                                path.arcTo(rectF11, f18 - width4, 90.0f);
                                double d11 = width7;
                                float c12 = (float) i0.a.c(a(r4), d11, rectF2.centerX());
                                float sin3 = (float) ((Math.sin(a(r4)) * d11) + rectF2.centerY());
                                rectF11.set(c12 - min3, sin3 - min3, c12 + min3, sin3 + min3);
                                path.arcTo(rectF11, (f18 - width5) + 90.0f, 90.0f);
                            }
                            rectF5 = rectF2;
                            path.arcTo(rectF5, f18 - width5, -(f33 - (width5 * 2.0f)));
                            if (z11) {
                                double d12 = width7;
                                float f37 = f30 + width5;
                                double c13 = i0.a.c(a(f37), d12, rectF5.centerX());
                                double sin4 = (Math.sin(a(f37)) * d12) + rectF5.centerY();
                                float f38 = (float) c13;
                                float f39 = (float) sin4;
                                rectF11.set(f38 - min3, f39 - min3, f38 + min3, f39 + min3);
                                path.arcTo(rectF11, f37 + 180.0f, 90.0f);
                            }
                            path.close();
                            path.computeBounds(gcVar2.r, false);
                            float centerX = rectF12.centerX();
                            float centerY = rectF3.centerY();
                            rectF12.width();
                            gcVar2.w.reset();
                            gcVar2.w.setTranslate(centerX, centerY);
                            gcVar2.v.setLocalMatrix(gcVar2.w);
                            canvas2.saveLayerAlpha(rectF12, org.telegram.messenger.zs.e4, 31);
                            canvas2.drawPath(path, paint2);
                            canvas2.drawRect(rectF12, paint3);
                            rectF2 = rectF5;
                            f20 = 0.0f;
                            i13 = i16;
                            f21 = f7;
                            f14 = f14;
                            e6Var = e6Var2;
                            f22 = width;
                            f23 = width2;
                            f24 = e12;
                            rectF6 = rectF11;
                            gcVar2.a(canvas, rectF12.centerX(), rectF12.centerY(), f22, f23, f17 - f19, f17 + f19, rectF5.width() / 2.0f, rectF12.width() / 2.0f, f24, Math.max(0.0f, (f29 / 0.75f) - 0.75f) * e13);
                            gcVar = gcVar2;
                            canvas2 = canvas;
                            canvas2.restore();
                        }
                    }
                    i12 = i15;
                    f19 = abs;
                    rectF5 = rectF2;
                    float centerX2 = rectF12.centerX();
                    float centerY2 = rectF3.centerY();
                    rectF12.width();
                    gcVar2.w.reset();
                    gcVar2.w.setTranslate(centerX2, centerY2);
                    gcVar2.v.setLocalMatrix(gcVar2.w);
                    canvas2.saveLayerAlpha(rectF12, org.telegram.messenger.zs.e4, 31);
                    canvas2.drawPath(path, paint2);
                    canvas2.drawRect(rectF12, paint3);
                    rectF2 = rectF5;
                    f20 = 0.0f;
                    i13 = i16;
                    f21 = f7;
                    f14 = f14;
                    e6Var = e6Var2;
                    f22 = width;
                    f23 = width2;
                    f24 = e12;
                    rectF6 = rectF11;
                    gcVar2.a(canvas, rectF12.centerX(), rectF12.centerY(), f22, f23, f17 - f19, f17 + f19, rectF5.width() / 2.0f, rectF12.width() / 2.0f, f24, Math.max(0.0f, (f29 / 0.75f) - 0.75f) * e13);
                    gcVar = gcVar2;
                    canvas2 = canvas;
                    canvas2.restore();
                }
                float e14 = gcVar.j.e(false, gcVar.i);
                rectF6.set(f22 - f20, f23 - f20, f22 + f20, f23 + f20);
                if (e14 != f11) {
                    canvas2.save();
                    canvas2.scale(e14, e14, rectF6.centerX(), rectF6.centerY());
                }
                e6Var.B = (int) (f24 * 255.0f);
                e6Var.setBounds((int) rectF6.left, (int) rectF6.top, (int) rectF6.right, (int) rectF6.bottom);
                e6Var.draw(canvas2);
                if (e14 != f11) {
                    canvas2.restore();
                }
                i14 = i13;
            } else {
                f13 = e;
                rectF3 = rectF7;
                rectF4 = rectF8;
                rectF2 = rectF9;
                f12 = T12;
                f14 = W1;
                f15 = f25;
                fArr = fArr2;
                f16 = f26;
                i12 = i15;
                f21 = f7;
            }
            i15 = i12 + 1;
            f7 = f21;
            f26 = f16;
            rectF9 = rectF2;
            T12 = f12;
            e = f13;
            W1 = f14;
            f25 = f15;
            fArr2 = fArr;
            rectF7 = rectF3;
            rectF8 = rectF4;
            i10 = 1;
            f10 = 0.0f;
            i11 = 0;
        }
        float f40 = e;
        RectF rectF13 = rectF7;
        RectF rectF14 = rectF8;
        float f41 = T12;
        float f42 = f7;
        e6 e6Var3 = this.N;
        e6 e6Var4 = this.M;
        int i17 = this.d;
        if (i17 == 0) {
            float f43 = (f11 - f42) * (f11 - f40);
            if (b(canvas2, e6Var4, rectF13.centerX(), rectF13.centerY() - org.telegram.messenger.i0.N(5.0f), 1.0f, f43) || i14 != 0) {
            }
            b(canvas, e6Var3, rectF13.centerX(), org.telegram.messenger.i0.N(22.0f) + rectF13.centerY(), 1.0f, f43);
            z10 = true;
        } else {
            z10 = true;
            if (i17 == 1) {
                float f44 = f11 - f40;
                float centerX3 = rectF13.centerX() - org.telegram.messenger.i0.T1(0.0f, org.telegram.messenger.i0.N(4.0f), f42);
                float centerY3 = rectF13.centerY() - org.telegram.messenger.i0.T1(org.telegram.messenger.i0.N(5.0f), 0.0f, f42);
                float f45 = f11;
                float T13 = org.telegram.messenger.i0.T1(f45, 2.25f, f42);
                float f46 = f44 * f42;
                boolean z16 = b(canvas, this.O, centerX3, centerY3, T13, f46) || i14 != 0;
                float f47 = (f45 - f42) * f44;
                boolean z17 = b(canvas, e6Var4, centerX3, centerY3, T13, f47) || z16;
                float T14 = org.telegram.messenger.i0.T1(0.0f, org.telegram.messenger.i0.N(26.0f), f42) + rectF13.centerX();
                float T15 = org.telegram.messenger.i0.T1(org.telegram.messenger.i0.N(22.0f), -org.telegram.messenger.i0.N(18.0f), f42) + rectF13.centerY();
                float T16 = org.telegram.messenger.i0.T1(1.0f, 1.4f, f42);
                if (b(canvas, this.P, T14, T15, T16, f46) || z17) {
                }
                b(canvas, e6Var3, T14, T15, T16, f47);
            }
        }
        if (f42 > 0.0f) {
            if (this.Q == null) {
                kg.f2 f2Var = new kg.f2(25);
                this.Q = f2Var;
                f2Var.O = 100;
                f2Var.M = z10;
                f2Var.G = z10;
                f2Var.K = false;
                f2Var.H = z10;
                f2Var.r = 18;
                f2Var.B = false;
                f2Var.j = org.telegram.messenger.i0.L(80.0f);
                kg.f2 f2Var2 = this.Q;
                f2Var2.w = 0.85f;
                f2Var2.v = 0.85f;
                f2Var2.u = 0.85f;
                f2Var2.c();
                rectF = rectF14;
            } else {
                RectF rectF15 = this.E;
                rectF = rectF14;
                if (rectF15 != null) {
                }
            }
            float min4 = Math.min(getMeasuredHeight(), Math.min(getMeasuredWidth(), org.telegram.messenger.i0.L(150.0f)));
            this.Q.a.set(0.0f, 0.0f, min4, min4);
            this.Q.a.offset((getMeasuredWidth() - this.Q.a.width()) / 2.0f, (getMeasuredHeight() - this.Q.a.height()) / 2.0f);
            this.Q.b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            this.Q.f();
            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), org.telegram.messenger.zs.e4, 31);
            this.Q.e(canvas, f42);
            int i18 = (int) (f42 * 255.0f);
            Paint paint4 = this.H;
            paint4.setAlpha(i18);
            canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint4);
            canvas.restore();
            Paint paint5 = this.G;
            paint5.setStrokeWidth(f41);
            paint5.setAlpha(i18);
            canvas.drawCircle(rectF13.centerX(), rectF13.centerY(), (rectF13.width() - f41) / 2.0f, paint5);
            RectF rectF16 = this.E;
            Path path2 = this.F;
            if (rectF16 == null || !rectF16.equals(rectF)) {
                if (this.E == null) {
                    this.E = new RectF();
                }
                this.E.set(rectF);
                path2.rewind();
                if (i17 == 0) {
                    path2.moveTo(rectF13.width() * 0.348f, rectF13.height() * 0.538f);
                    path2.lineTo(rectF13.width() * 0.447f, rectF13.height() * 0.636f);
                    path2.lineTo(rectF13.width() * 0.678f, rectF13.height() * 0.402f);
                } else if (i17 == z10) {
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
            if (i17 == 0) {
                paint5.setStrokeWidth(org.telegram.messenger.i0.N(10.0f));
                canvas.drawPath(path2, paint5);
            }
        }
        if (this.S) {
            invalidate();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ab, code lost:
    
        if (r1 != (-1)) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00bf, code lost:
    
        if (r0 != false) goto L45;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int i10;
        float x10 = motionEvent.getX();
        float y3 = motionEvent.getY();
        RectF rectF = this.b;
        float a2 = w7.z8.a(rectF.centerX(), rectF.centerY(), x10, y3);
        float atan2 = (float) ((Math.atan2(y3 - rectF.centerY(), x10 - rectF.centerX()) / 3.141592653589793d) * 180.0d);
        if (atan2 < 0.0f) {
            atan2 += 360.0f;
        }
        if (a2 > this.c.width() / 2.0f && a2 < (rectF.width() / 2.0f) + org.telegram.messenger.i0.L(14.0f)) {
            i10 = 0;
            while (true) {
                gc[] gcVarArr = this.w;
                if (i10 >= gcVarArr.length) {
                    break;
                }
                gc gcVar = gcVarArr[i10];
                float f7 = gcVar.c;
                float f10 = gcVar.d;
                if (atan2 >= f7 - f10 && atan2 <= f7 + f10) {
                    break;
                }
                i10++;
            }
        }
        i10 = -1;
        if (motionEvent.getAction() == 0) {
            setSelected(i10);
            if (i10 >= 0) {
                d(i10, i10 != -1);
                if (getParent() != null && this.R) {
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

    public int e() {
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:130:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0231  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(long j10, boolean z10, hc... hcVarArr) {
        boolean z11;
        float f7;
        float f10;
        boolean z12;
        gc gcVar;
        float f11;
        gc[] gcVarArr;
        float[] fArr;
        float f12;
        int i10;
        long j11;
        float f13;
        float f14;
        boolean z13;
        long j12;
        boolean z14;
        hc[] hcVarArr2 = hcVarArr;
        t5 t5Var = this.n;
        t5 t5Var2 = this.s;
        e6 e6Var = this.P;
        e6 e6Var2 = this.O;
        e6 e6Var3 = this.N;
        e6 e6Var4 = this.M;
        gc[] gcVarArr2 = this.w;
        float f15 = 1.0f;
        if (hcVarArr2 == null || hcVarArr2.length == 0) {
            this.h = false;
            this.r = j10 == 0;
            if (z10) {
                z11 = true;
            } else {
                z11 = true;
                t5Var.e(true, 0.0f);
                t5Var2.e(true, this.r ? 1.0f : 0.0f);
            }
            e6Var2.t(e6Var4.i, false, z11);
            e6Var4.t("0", z10, z11);
            e6Var2.t("0", z10, z11);
            e6Var.t(e6Var3.i, false, z11);
            e6Var3.t("KB", z10, z11);
            e6Var.t("KB", z10, z11);
            for (gc gcVar2 : gcVarArr2) {
                gcVar2.g = 0.0f;
                if (!z10) {
                    gcVar2.h.e(z11, 0.0f);
                }
            }
            invalidate();
            return;
        }
        this.h = false;
        if (!z10) {
            t5Var.e(true, 0.0f);
        }
        SpannableString spannableString = new SpannableString("%");
        int length = hcVarArr2.length;
        SpannableString spannableString2 = spannableString;
        int i11 = 0;
        long j13 = 0;
        while (i11 < hcVarArr2.length) {
            if (hcVarArr2[i11] == null) {
                hc hcVar = new hc();
                hcVarArr2[i11] = hcVar;
                j12 = j13;
                hcVar.c = 0L;
            } else {
                j12 = j13;
            }
            hc hcVar2 = hcVarArr2[i11];
            hcVar2.a = i11;
            boolean z15 = hcVar2.b;
            if (z15) {
                z14 = z15;
                j12 += hcVar2.c;
            } else {
                z14 = z15;
            }
            if (hcVar2.c <= 0 || !z14) {
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
                t5Var.e(true, 0.0f);
                t5Var2.e(true, this.r ? 1.0f : 0.0f);
            }
            e6Var2.t(e6Var4.i, false, z13);
            e6Var4.t("0", z10, z13);
            e6Var2.t("0", z10, z13);
            e6Var.t(e6Var3.i, false, z13);
            e6Var3.t("KB", z10, z13);
            e6Var.t("KB", z10, z13);
            int i12 = 0;
            while (i12 < gcVarArr2.length) {
                gc gcVar3 = gcVarArr2[i12];
                gcVar3.g = 0.0f;
                if (!z10) {
                    gcVar3.h.e(z13, 0.0f);
                }
                i12++;
                z13 = true;
            }
            invalidate();
            return;
        }
        gc[] gcVarArr3 = gcVarArr2;
        int i13 = 0;
        int i14 = 0;
        float f16 = 0.0f;
        while (i13 < hcVarArr2.length) {
            hc hcVar3 = hcVarArr2[i13];
            if (hcVar3 == null || !hcVar3.b) {
                i10 = i13;
                j11 = j14;
                f13 = 0.02f;
                f14 = 0.0f;
            } else {
                f13 = 0.02f;
                i10 = i13;
                j11 = j14;
                f14 = hcVar3.c / j11;
            }
            if (f14 > 0.0f && f14 < f13) {
                i14++;
                f16 += f14;
            }
            i13 = i10 + 1;
            j14 = j11;
        }
        long j15 = j14;
        Math.min(hcVarArr2.length, gcVarArr3.length);
        int[] iArr = this.U;
        if (iArr == null || iArr.length != hcVarArr2.length) {
            this.U = new int[hcVarArr2.length];
        }
        float[] fArr2 = this.V;
        if (fArr2 == null || fArr2.length != hcVarArr2.length) {
            this.V = new float[hcVarArr2.length];
        }
        int i15 = 0;
        while (i15 < hcVarArr2.length) {
            float[] fArr3 = this.V;
            int i16 = i15;
            hc hcVar4 = hcVarArr2[i16];
            float f17 = f16;
            if (hcVar4 != null) {
                gcVarArr = gcVarArr3;
                if (hcVar4.b) {
                    fArr = fArr3;
                    f12 = hcVar4.c / j15;
                    fArr[i16] = f12;
                    i15 = i16 + 1;
                    f16 = f17;
                    gcVarArr3 = gcVarArr;
                }
            } else {
                gcVarArr = gcVarArr3;
            }
            fArr = fArr3;
            f12 = 0.0f;
            fArr[i16] = f12;
            i15 = i16 + 1;
            f16 = f17;
            gcVarArr3 = gcVarArr;
        }
        float f18 = f16;
        gc[] gcVarArr4 = gcVarArr3;
        org.telegram.messenger.i0.e3(this.V, this.U);
        if (this.d == 0) {
            Arrays.sort(hcVarArr2, new org.telegram.ui.f6(10));
            int i17 = 0;
            while (true) {
                if (i17 > hcVarArr2.length) {
                    break;
                }
                hc hcVar5 = hcVarArr2[i17];
                if (hcVar5.a == hcVarArr2.length - 1) {
                    hc hcVar6 = hcVarArr2[0];
                    hcVarArr2[0] = hcVar5;
                    hcVarArr2[i17] = hcVar6;
                    break;
                }
                i17++;
            }
        }
        if (length < 2) {
            length = 0;
        }
        float f19 = 360.0f - (length * 2.0f);
        int i18 = 0;
        int i19 = 0;
        float f20 = 0.0f;
        while (i18 < hcVarArr2.length) {
            hc hcVar7 = hcVarArr2[i18];
            int i20 = hcVar7.a;
            int i21 = i18;
            float f21 = !hcVar7.b ? 0.0f : hcVar7.c / j15;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            float f22 = f19;
            spannableStringBuilder.append((CharSequence) String.format("%d", Integer.valueOf(this.U[i20])));
            SpannableString spannableString3 = spannableString2;
            spannableStringBuilder.append((CharSequence) spannableString3);
            gc gcVar4 = gcVarArr4[i20];
            e6 e6Var5 = e6Var;
            e6 e6Var6 = e6Var2;
            float f23 = (((double) f21) <= 0.05d || f21 >= f15) ? 0.0f : f15;
            gcVar4.g = f23;
            if (f21 >= 0.08f) {
                f7 = f21;
                if (this.U[i20] < 100) {
                    f10 = f15;
                    gcVar4.i = f10;
                    gcVar4.l = f15;
                    if (z10) {
                        t5 t5Var3 = gcVar4.h;
                        z12 = true;
                        t5Var3.e(true, f23);
                        gc gcVar5 = gcVarArr4[i20];
                        gcVar5.j.e(true, gcVar5.i);
                        gc gcVar6 = gcVarArr4[i20];
                        gcVar6.m.e(true, gcVar6.l);
                    } else {
                        z12 = true;
                    }
                    gcVar = gcVarArr4[i20];
                    if (gcVar.g > 0.0f) {
                        gcVar.k.t(spannableStringBuilder, z10, z12);
                    }
                    if (f7 < 0.02f || f7 <= 0.0f) {
                        f15 = 1.0f;
                        f11 = (1.0f - ((i14 * 0.02f) - f18)) * f7;
                    } else {
                        f11 = 0.02f;
                        f15 = 1.0f;
                    }
                    float f24 = (i19 * 2.0f) + (f20 * f22);
                    float f25 = (f11 * f22) + f24;
                    if (f11 > 0.0f) {
                        gc gcVar7 = gcVarArr4[i20];
                        gcVar7.c = (f24 + f25) / 2.0f;
                        gcVar7.d = Math.abs(f25 - f24) / 2.0f;
                        gc gcVar8 = gcVarArr4[i20];
                        gcVar8.g = 0.0f;
                        if (!z10) {
                            gcVar8.e.e(true, gcVar8.c);
                            gc gcVar9 = gcVarArr4[i20];
                            gcVar9.f.e(true, gcVar9.d);
                            gc gcVar10 = gcVarArr4[i20];
                            gcVar10.h.e(true, gcVar10.g);
                        }
                    } else {
                        gc gcVar11 = gcVarArr4[i20];
                        gcVar11.c = (f24 + f25) / 2.0f;
                        gcVar11.d = Math.abs(f25 - f24) / 2.0f;
                        if (!z10) {
                            gc gcVar12 = gcVarArr4[i20];
                            gcVar12.e.e(true, gcVar12.c);
                            gc gcVar13 = gcVarArr4[i20];
                            gcVar13.f.e(true, gcVar13.d);
                        }
                        f20 += f11;
                        i19++;
                    }
                    i18 = i21 + 1;
                    hcVarArr2 = hcVarArr;
                    e6Var2 = e6Var6;
                    e6Var = e6Var5;
                    f19 = f22;
                    spannableString2 = spannableString3;
                }
            } else {
                f7 = f21;
            }
            f10 = 0.85f;
            gcVar4.i = f10;
            gcVar4.l = f15;
            if (z10) {
            }
            gcVar = gcVarArr4[i20];
            if (gcVar.g > 0.0f) {
            }
            if (f7 < 0.02f) {
            }
            f15 = 1.0f;
            f11 = (1.0f - ((i14 * 0.02f) - f18)) * f7;
            float f242 = (i19 * 2.0f) + (f20 * f22);
            float f252 = (f11 * f22) + f242;
            if (f11 > 0.0f) {
            }
            i18 = i21 + 1;
            hcVarArr2 = hcVarArr;
            e6Var2 = e6Var6;
            e6Var = e6Var5;
            f19 = f22;
            spannableString2 = spannableString3;
        }
        e6 e6Var7 = e6Var;
        e6 e6Var8 = e6Var2;
        String[] split = org.telegram.messenger.i0.i0(j15, true, true).split(" ");
        String str = split.length > 0 ? split[0] : "";
        if (str.length() >= 4 && j15 < 1073741824) {
            str = str.split("\\.")[0];
        }
        e6Var4.t(str, z10, true);
        e6Var3.t(split.length > 1 ? split[1] : "", z10, true);
        if (t5Var2.c > 0.0f) {
            e6Var8.t(e6Var4.i, z10, true);
            e6Var7.t(e6Var3.i, z10, true);
        }
        this.r = false;
        if (!z10) {
            t5Var2.e(true, 0.0f);
        }
        invalidate();
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.S = true;
        int i10 = 0;
        while (true) {
            gc[] gcVarArr = this.w;
            if (i10 >= gcVarArr.length) {
                return;
            }
            gc gcVar = gcVarArr[i10];
            if (gcVar.b == null) {
                boolean z10 = this.e;
                int[] iArr = this.f;
                if (z10) {
                    gcVar.b = org.telegram.messenger.d00.d(iArr[i10], org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(16.0f), -1);
                } else {
                    gcVar.b = BitmapFactory.decodeResource(getContext().getResources(), iArr[i10]);
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
        this.S = false;
        while (true) {
            gc[] gcVarArr = this.w;
            if (i10 >= gcVarArr.length) {
                return;
            }
            Bitmap bitmap = gcVarArr[i10].b;
            if (bitmap != null) {
                bitmap.recycle();
                gcVarArr[i10].b = null;
            }
            i10++;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int L = org.telegram.messenger.i0.L(c());
        int L2 = org.telegram.messenger.i0.L(172.0f);
        RectF rectF = this.a;
        rectF.set((size - L2) / 2.0f, (L - L2) / 2.0f, (size + L2) / 2.0f, (L2 + L) / 2.0f);
        Matrix matrix = this.K;
        matrix.reset();
        matrix.setTranslate(rectF.left, 0.0f);
        this.I.setLocalMatrix(matrix);
        Matrix matrix2 = this.L;
        matrix2.reset();
        matrix2.setTranslate(rectF.left, -rectF.centerY());
        this.J.setLocalMatrix(matrix2);
        kg.f2 f2Var = this.Q;
        if (f2Var != null) {
            f2Var.a.set(0.0f, 0.0f, org.telegram.messenger.i0.L(140.0f), org.telegram.messenger.i0.L(140.0f));
            this.Q.a.offset((getMeasuredWidth() - this.Q.a.width()) / 2.0f, (getMeasuredHeight() - this.Q.a.height()) / 2.0f);
            this.Q.b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            this.Q.f();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(L, TLObject.FLAG_30));
    }

    public void setInterceptTouch(boolean z10) {
        this.R = z10;
    }

    public void setSelected(int i10) {
        if (i10 == this.T) {
            return;
        }
        int i11 = 0;
        while (true) {
            gc[] gcVarArr = this.w;
            if (i11 >= gcVarArr.length) {
                this.T = i10;
                invalidate();
                return;
            }
            if (i10 == i11 && gcVarArr[i11].d <= 0.0f) {
                i10 = -1;
            }
            gcVarArr[i11].n = i10 == i11;
            i11++;
        }
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        try {
            this.D.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.i6, false));
            try {
                e6 e6Var = this.M;
                if (e6Var != null) {
                    e6Var.u(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.G6, false));
                }
                e6 e6Var2 = this.N;
                if (e6Var2 != null) {
                    e6Var2.u(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.y6, false));
                }
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
            }
            invalidate();
        } catch (Exception e7) {
            org.telegram.messenger.f8.g(e7, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
