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

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public abstract class nc extends View implements org.telegram.ui.ActionBar.b6 {
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
    public final i6 M;
    public final i6 N;
    public final i6 O;
    public final i6 P;
    public ug.p1 Q;
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
    public final w5 n;
    public boolean r;
    public final w5 s;
    public final lc[] w;
    public final float[] x;
    public final RectF y;

    static {
        int i7 = org.telegram.ui.ActionBar.l6.Zj;
        int i10 = org.telegram.ui.ActionBar.l6.Vj;
        int i11 = org.telegram.ui.ActionBar.l6.Wj;
        int i12 = org.telegram.ui.ActionBar.l6.dk;
        int i13 = org.telegram.ui.ActionBar.l6.ak;
        int i14 = org.telegram.ui.ActionBar.l6.Xj;
        int i15 = org.telegram.ui.ActionBar.l6.bk;
        int i16 = org.telegram.ui.ActionBar.l6.ek;
        int i17 = org.telegram.ui.ActionBar.l6.Yj;
        W = new int[]{i7, i10, i11, i12, i13, i14, i15, i16, i12, i17, i17};
        a0 = new int[]{R.raw.cache_photos, R.raw.cache_videos, R.raw.cache_documents, R.raw.cache_music, R.raw.cache_videos, R.raw.cache_music, R.raw.cache_stickers, R.raw.cache_profile_photos, R.raw.cache_other, R.raw.cache_other, R.raw.cache_documents};
        b0 = -1L;
    }

    public nc(Context context, int i7, int[] iArr, int i10, int[] iArr2) {
        super(context);
        this.a = new RectF();
        this.b = new RectF();
        this.c = new RectF();
        this.h = true;
        xq xqVar = xq.h;
        this.n = new w5(this, 750L, xqVar);
        this.r = false;
        this.s = new w5(this, 650L, xqVar);
        this.x = new float[2];
        this.y = new RectF();
        Paint paint = new Paint(1);
        this.D = paint;
        this.F = new Path();
        Paint paint2 = new Paint(1);
        this.G = paint2;
        Paint paint3 = new Paint(1);
        this.H = paint3;
        i6 i6Var = new i6(false, true, true);
        this.M = i6Var;
        i6 i6Var2 = new i6(false, true, true);
        this.N = i6Var2;
        i6 i6Var3 = new i6(false, true, true);
        this.O = i6Var3;
        i6 i6Var4 = new i6(false, true, true);
        this.P = i6Var4;
        this.R = true;
        this.T = -1;
        setLayerType(2, null);
        this.f = iArr2;
        this.d = i10;
        this.e = i10 == 0;
        this.w = new lc[i7];
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setColor(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.i6, false));
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, org.telegram.messenger.g0.L(200.0f), new int[]{7263574, -9513642, -12469647, 4307569}, new float[]{0.0f, 0.07f, 0.93f, 1.0f}, tileMode);
        this.I = linearGradient;
        LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, 0.0f, org.telegram.messenger.g0.L(200.0f), new int[]{7263574, -9513642, -12469647, 4307569}, new float[]{0.0f, 0.07f, 0.93f, 1.0f}, tileMode);
        this.J = linearGradient2;
        this.K = new Matrix();
        this.L = new Matrix();
        paint2.setShader(linearGradient);
        paint3.setShader(linearGradient);
        paint2.setStyle(style);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        paint2.setStrokeJoin(Paint.Join.ROUND);
        i6Var.n(0.2f, 450L, xqVar);
        i6Var.A = 0.6f;
        i6Var.u(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.G6, false));
        i6Var.x(org.telegram.messenger.g0.o());
        i6Var.w(org.telegram.messenger.g0.L(32.0f));
        i6Var.b = 17;
        i6Var2.n(0.6f, 450L, xqVar);
        i6Var2.A = 0.6f;
        i6Var2.u(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.y6, false));
        i6Var2.w(org.telegram.messenger.g0.L(12.0f));
        i6Var2.b = 17;
        i6Var3.n(0.2f, 450L, xqVar);
        i6Var3.A = 0.6f;
        i6Var3.a.setShader(linearGradient2);
        i6Var3.x(org.telegram.messenger.g0.o());
        i6Var3.w(org.telegram.messenger.g0.L(32.0f));
        i6Var3.b = 17;
        i6Var4.n(0.6f, 450L, xqVar);
        i6Var4.A = 0.6f;
        i6Var4.a.setShader(linearGradient2);
        i6Var4.x(org.telegram.messenger.g0.o());
        i6Var4.w(org.telegram.messenger.g0.L(12.0f));
        i6Var4.b = 17;
        int i11 = 0;
        while (true) {
            lc[] lcVarArr = this.w;
            if (i11 >= lcVarArr.length) {
                return;
            }
            lc lcVar = new lc(this);
            lcVarArr[i11] = lcVar;
            int w10 = org.telegram.ui.ActionBar.l6.w(org.telegram.ui.ActionBar.l6.x0(null, iArr[i11], false), ConnectionsManager.FileTypeAudio);
            int w11 = org.telegram.ui.ActionBar.l6.w(org.telegram.ui.ActionBar.l6.x0(null, iArr[i11], false), 822083583);
            org.telegram.messenger.g0.L(50.0f);
            RadialGradient radialGradient = new RadialGradient(0.0f, 0.0f, org.telegram.messenger.g0.L(86.0f), new int[]{w11, w10}, new float[]{0.3f, 1.0f}, Shader.TileMode.CLAMP);
            lcVar.v = radialGradient;
            Matrix matrix = new Matrix();
            lcVar.w = matrix;
            radialGradient.setLocalMatrix(matrix);
            lcVar.q.setShader(lcVar.v);
            i11++;
        }
    }

    public static float a(float f10) {
        return (float) ((f10 / 180.0f) * 3.141592653589793d);
    }

    public static boolean b(Canvas canvas, i6 i6Var, float f10, float f11, float f12, float f13) {
        if (f13 <= 0.0f) {
            return false;
        }
        i6Var.B = (int) (f13 * 255.0f);
        i6Var.setBounds(0, 0, 0, 0);
        canvas.save();
        canvas.translate(f10, f11);
        canvas.scale(f12, f12);
        i6Var.draw(canvas);
        canvas.restore();
        return i6Var.h();
    }

    public int c() {
        return org.telegram.messenger.qs.e3;
    }

    public abstract void d(int i7, boolean z9);

    /* JADX WARN: Code restructure failed: missing block: B:137:0x0738, code lost:
    
        if (r1.equals(r8) != false) goto L155;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        int i7;
        float f11;
        int i10;
        float f12;
        boolean z9;
        RectF rectF;
        RectF rectF2;
        float f13;
        float f14;
        float f15;
        float f16;
        float[] fArr;
        RectF rectF3;
        RectF rectF4;
        float f17;
        float f18;
        float f19;
        boolean z10;
        int i11;
        float f20;
        RectF rectF5;
        float f21;
        int i12;
        float f22;
        i6 i6Var;
        float f23;
        float f24;
        float f25;
        RectF rectF6;
        lc lcVar;
        Canvas canvas2 = canvas;
        float e10 = this.n.e(false, this.h ? 1.0f : 0.0f);
        float e11 = this.s.e(false, this.r ? 1.0f : 0.0f);
        RectF rectF7 = this.b;
        RectF rectF8 = this.a;
        rectF7.set(rectF8);
        float T1 = org.telegram.messenger.g0.T1(0.0f, org.telegram.messenger.g0.N(e()), e11);
        rectF7.inset(T1, T1);
        RectF rectF9 = this.c;
        rectF9.set(rectF7);
        float T12 = org.telegram.messenger.g0.T1(org.telegram.messenger.g0.N(38.0f), org.telegram.messenger.g0.N(10.0f), Math.max(e10, e11));
        rectF9.inset(T12, T12);
        float W1 = org.telegram.messenger.g0.W1(e10, 0, org.telegram.messenger.g0.L(60.0f));
        if (c0 == null) {
            c0 = Long.valueOf(System.currentTimeMillis());
        }
        boolean z11 = this.h;
        if (!z11 && d0 == null) {
            d0 = Long.valueOf(System.currentTimeMillis());
        } else if (z11 && d0 != null) {
            d0 = null;
        }
        float currentTimeMillis = ((d0 == null ? System.currentTimeMillis() : r9.longValue()) - c0.longValue()) * 0.6f;
        float[] fArr2 = this.x;
        cp.a(currentTimeMillis % 5400.0f, fArr2);
        float f26 = fArr2[0];
        float f27 = fArr2[1];
        if (e10 > 0.0f) {
            i7 = 1;
            Paint paint = this.D;
            paint.setStrokeWidth(T12);
            f12 = 1.0f;
            int alpha = paint.getAlpha();
            f11 = 0.0f;
            paint.setAlpha((int) (alpha * e10));
            i10 = 0;
            f10 = e11;
            canvas2.drawCircle(rectF7.centerX(), rectF7.centerY(), (rectF7.width() - T12) / 2.0f, paint);
            paint.setAlpha(alpha);
        } else {
            f10 = e11;
            i7 = 1;
            f11 = 0.0f;
            i10 = 0;
            f12 = 1.0f;
        }
        int i13 = (e10 > 0.0f || f10 > f11) ? i7 : i10;
        int i14 = i10;
        while (true) {
            lc[] lcVarArr = this.w;
            if (i14 >= lcVarArr.length) {
                break;
            }
            lc lcVar2 = lcVarArr[i14];
            cp.a((currentTimeMillis + (i14 * 80)) % 5400.0f, fArr2);
            float min = Math.min(Math.max(fArr2[i10], f26), f27);
            float min2 = Math.min(Math.max(fArr2[i7], f26), f27);
            if (e10 < f12 || min < min2) {
                RectF rectF10 = rectF8;
                float f28 = (min + min2) / 2.0f;
                float abs = Math.abs(min2 - min) / 2.0f;
                if (e10 <= f11) {
                    boolean z12 = i10;
                    float e12 = lcVar2.e.e(z12, lcVar2.c);
                    abs = lcVar2.f.e(z12, lcVar2.d);
                    rectF2 = rectF9;
                    f13 = T12;
                    f28 = e12;
                } else {
                    boolean z13 = i10;
                    rectF2 = rectF9;
                    if (e10 < f12) {
                        f13 = T12;
                        f28 = org.telegram.messenger.g0.T1((((float) Math.floor(f27 / 360.0f)) * 360.0f) + lcVar2.e.e(z13, lcVar2.c), f28, e10);
                        abs = org.telegram.messenger.g0.T1(lcVar2.f.e(z13, lcVar2.d), abs, e10);
                    } else {
                        f13 = T12;
                    }
                }
                int i15 = (lcVar2.e.i || lcVar2.f.i || i13 != 0) ? i7 : 0;
                float f29 = f12 - f10;
                float f30 = f12 - e10;
                i6 i6Var2 = lcVar2.k;
                f14 = e10;
                Path path = lcVar2.p;
                Paint paint2 = lcVar2.s;
                Paint paint3 = lcVar2.q;
                f15 = W1;
                RectF rectF11 = lcVar2.E.y;
                RectF rectF12 = lcVar2.u;
                f16 = f26;
                fArr = fArr2;
                float e13 = lcVar2.o.e(false, lcVar2.n ? f12 : f11);
                rectF12.set(rectF7);
                rectF12.inset((-org.telegram.messenger.g0.L(9.0f)) * e13, e13 * (-org.telegram.messenger.g0.L(9.0f)));
                float width = (float) ((((rectF2.width() + rectF12.width()) * Math.cos(a(f28))) / 4.0d) + rectF12.centerX());
                rectF3 = rectF7;
                float width2 = (float) ((((rectF2.width() + rectF12.width()) * Math.sin(a(f28))) / 4.0d) + rectF12.centerY());
                float e14 = lcVar2.h.e(false, lcVar2.g) * f29 * f30;
                float e15 = lcVar2.m.e(false, lcVar2.l);
                paint3.setAlpha((int) (f29 * 255.0f));
                if (abs * 2.0f >= 359.0f) {
                    canvas2.saveLayerAlpha(rectF12, org.telegram.messenger.qs.e4, 31);
                    canvas2.drawCircle(rectF12.centerX(), rectF12.centerY(), rectF12.width() / 2.0f, paint2);
                    canvas2.drawRect(rectF12, paint3);
                    f25 = e14;
                    f17 = f27;
                    lcVar2.a(canvas, rectF12.centerX(), rectF12.centerY(), width, width2, 0.0f, 359.0f, rectF2.width() / 2.0f, rectF12.width() / 2.0f, f25, Math.max(f11, (f30 / 0.75f) - 0.75f) * e15);
                    lcVar = lcVar2;
                    canvas2 = canvas;
                    canvas2.drawCircle(rectF2.centerX(), rectF2.centerY(), rectF2.width() / 2.0f, lcVar.t);
                    canvas2.restore();
                    i11 = i14;
                    rectF4 = rectF10;
                    i12 = i15;
                    f22 = f10;
                    rectF6 = rectF11;
                    i6Var = i6Var2;
                    f23 = width;
                    f24 = width2;
                    f21 = 0.0f;
                } else {
                    rectF4 = rectF10;
                    f17 = f27;
                    float min3 = Math.min(Math.min(f15, (rectF12.width() - rectF2.width()) / 4.0f), (float) ((rectF2.width() / 2.0f) * (abs / 180.0f) * 3.141592653589793d));
                    float width3 = (rectF12.width() - rectF2.width()) / 2.0f;
                    if (lcVar2.x == f28 && lcVar2.y == abs && lcVar2.z == min3 && lcVar2.A == width3 && lcVar2.B == rectF12.width() && lcVar2.C == rectF12.centerX() && lcVar2.D == rectF12.centerY()) {
                        f18 = f28;
                    } else {
                        lcVar2.x = f28;
                        lcVar2.y = abs;
                        lcVar2.z = min3;
                        lcVar2.A = width3;
                        lcVar2.B = rectF12.width();
                        lcVar2.C = rectF12.centerX();
                        lcVar2.D = rectF12.centerY();
                        float f31 = f28 - abs;
                        float f32 = f28 + abs;
                        boolean z14 = min3 > 0.0f;
                        float f33 = min3 * 2.0f;
                        f18 = f28;
                        float width4 = (min3 / ((float) ((rectF12.width() - f33) * 3.141592653589793d))) * 360.0f;
                        float width5 = ((abs > 175.0f ? 0 : 1) * 0.5f) + ((min3 / ((float) ((rectF2.width() + f33) * 3.141592653589793d))) * 360.0f);
                        float width6 = (rectF12.width() / 2.0f) - min3;
                        float width7 = (rectF2.width() / 2.0f) + min3;
                        path.rewind();
                        float f34 = f32 - f31;
                        if (f34 >= 0.5f) {
                            if (z14) {
                                f19 = f32;
                                double d = width6;
                                float f35 = f31 + width4;
                                double d2 = jg.g.d(a(f35), d, rectF12.centerX());
                                z10 = z14;
                                i11 = i14;
                                f20 = abs;
                                double sin = (Math.sin(a(f35)) * d) + rectF12.centerY();
                                float f36 = (float) d2;
                                float f37 = (float) sin;
                                rectF11.set(f36 - min3, f37 - min3, f36 + min3, f37 + min3);
                                path.arcTo(rectF11, f35 - 90.0f, 90.0f);
                            } else {
                                f19 = f32;
                                z10 = z14;
                                i11 = i14;
                                f20 = abs;
                            }
                            path.arcTo(rectF12, f31 + width4, f34 - (width4 * 2.0f));
                            if (z10) {
                                double d10 = width6;
                                float d11 = (float) jg.g.d(a(r4), d10, rectF12.centerX());
                                float sin2 = (float) ((Math.sin(a(r4)) * d10) + rectF12.centerY());
                                rectF11.set(d11 - min3, sin2 - min3, d11 + min3, sin2 + min3);
                                path.arcTo(rectF11, f19 - width4, 90.0f);
                                double d12 = width7;
                                float d13 = (float) jg.g.d(a(r4), d12, rectF2.centerX());
                                float sin3 = (float) ((Math.sin(a(r4)) * d12) + rectF2.centerY());
                                rectF11.set(d13 - min3, sin3 - min3, d13 + min3, sin3 + min3);
                                path.arcTo(rectF11, (f19 - width5) + 90.0f, 90.0f);
                            }
                            rectF5 = rectF2;
                            path.arcTo(rectF5, f19 - width5, -(f34 - (width5 * 2.0f)));
                            if (z10) {
                                double d14 = width7;
                                float f38 = f31 + width5;
                                double d15 = jg.g.d(a(f38), d14, rectF5.centerX());
                                double sin4 = (Math.sin(a(f38)) * d14) + rectF5.centerY();
                                float f39 = (float) d15;
                                float f40 = (float) sin4;
                                rectF11.set(f39 - min3, f40 - min3, f39 + min3, f40 + min3);
                                path.arcTo(rectF11, f38 + 180.0f, 90.0f);
                            }
                            path.close();
                            path.computeBounds(lcVar2.r, false);
                            float centerX = rectF12.centerX();
                            float centerY = rectF3.centerY();
                            rectF12.width();
                            lcVar2.w.reset();
                            lcVar2.w.setTranslate(centerX, centerY);
                            lcVar2.v.setLocalMatrix(lcVar2.w);
                            canvas2.saveLayerAlpha(rectF12, org.telegram.messenger.qs.e4, 31);
                            canvas2.drawPath(path, paint2);
                            canvas2.drawRect(rectF12, paint3);
                            rectF2 = rectF5;
                            f21 = 0.0f;
                            i12 = i15;
                            f22 = f10;
                            f15 = f15;
                            i6Var = i6Var2;
                            f23 = width;
                            f24 = width2;
                            f25 = e14;
                            rectF6 = rectF11;
                            lcVar2.a(canvas, rectF12.centerX(), rectF12.centerY(), f23, f24, f18 - f20, f18 + f20, rectF5.width() / 2.0f, rectF12.width() / 2.0f, f25, Math.max(0.0f, (f30 / 0.75f) - 0.75f) * e15);
                            lcVar = lcVar2;
                            canvas2 = canvas;
                            canvas2.restore();
                        }
                    }
                    i11 = i14;
                    f20 = abs;
                    rectF5 = rectF2;
                    float centerX2 = rectF12.centerX();
                    float centerY2 = rectF3.centerY();
                    rectF12.width();
                    lcVar2.w.reset();
                    lcVar2.w.setTranslate(centerX2, centerY2);
                    lcVar2.v.setLocalMatrix(lcVar2.w);
                    canvas2.saveLayerAlpha(rectF12, org.telegram.messenger.qs.e4, 31);
                    canvas2.drawPath(path, paint2);
                    canvas2.drawRect(rectF12, paint3);
                    rectF2 = rectF5;
                    f21 = 0.0f;
                    i12 = i15;
                    f22 = f10;
                    f15 = f15;
                    i6Var = i6Var2;
                    f23 = width;
                    f24 = width2;
                    f25 = e14;
                    rectF6 = rectF11;
                    lcVar2.a(canvas, rectF12.centerX(), rectF12.centerY(), f23, f24, f18 - f20, f18 + f20, rectF5.width() / 2.0f, rectF12.width() / 2.0f, f25, Math.max(0.0f, (f30 / 0.75f) - 0.75f) * e15);
                    lcVar = lcVar2;
                    canvas2 = canvas;
                    canvas2.restore();
                }
                float e16 = lcVar.j.e(false, lcVar.i);
                rectF6.set(f23 - f21, f24 - f21, f23 + f21, f24 + f21);
                if (e16 != f12) {
                    canvas2.save();
                    canvas2.scale(e16, e16, rectF6.centerX(), rectF6.centerY());
                }
                i6Var.B = (int) (f25 * 255.0f);
                i6Var.setBounds((int) rectF6.left, (int) rectF6.top, (int) rectF6.right, (int) rectF6.bottom);
                i6Var.draw(canvas2);
                if (e16 != f12) {
                    canvas2.restore();
                }
                i13 = i12;
            } else {
                f14 = e10;
                rectF3 = rectF7;
                rectF4 = rectF8;
                rectF2 = rectF9;
                f13 = T12;
                f15 = W1;
                f16 = f26;
                fArr = fArr2;
                f17 = f27;
                i11 = i14;
                f22 = f10;
            }
            i14 = i11 + 1;
            f10 = f22;
            f27 = f17;
            rectF9 = rectF2;
            T12 = f13;
            e10 = f14;
            W1 = f15;
            f26 = f16;
            fArr2 = fArr;
            rectF7 = rectF3;
            rectF8 = rectF4;
            i7 = 1;
            f11 = 0.0f;
            i10 = 0;
        }
        float f41 = e10;
        RectF rectF13 = rectF7;
        RectF rectF14 = rectF8;
        float f42 = T12;
        float f43 = f10;
        i6 i6Var3 = this.N;
        i6 i6Var4 = this.M;
        int i16 = this.d;
        if (i16 == 0) {
            float f44 = (f12 - f43) * (f12 - f41);
            if (b(canvas2, i6Var4, rectF13.centerX(), rectF13.centerY() - org.telegram.messenger.g0.N(5.0f), 1.0f, f44) || i13 != 0) {
            }
            b(canvas, i6Var3, rectF13.centerX(), org.telegram.messenger.g0.N(22.0f) + rectF13.centerY(), 1.0f, f44);
            z9 = true;
        } else {
            z9 = true;
            if (i16 == 1) {
                float f45 = f12 - f41;
                float centerX3 = rectF13.centerX() - org.telegram.messenger.g0.T1(0.0f, org.telegram.messenger.g0.N(4.0f), f43);
                float centerY3 = rectF13.centerY() - org.telegram.messenger.g0.T1(org.telegram.messenger.g0.N(5.0f), 0.0f, f43);
                float f46 = f12;
                float T13 = org.telegram.messenger.g0.T1(f46, 2.25f, f43);
                float f47 = f45 * f43;
                boolean z15 = b(canvas, this.O, centerX3, centerY3, T13, f47) || i13 != 0;
                float f48 = (f46 - f43) * f45;
                boolean z16 = b(canvas, i6Var4, centerX3, centerY3, T13, f48) || z15;
                float T14 = org.telegram.messenger.g0.T1(0.0f, org.telegram.messenger.g0.N(26.0f), f43) + rectF13.centerX();
                float T15 = org.telegram.messenger.g0.T1(org.telegram.messenger.g0.N(22.0f), -org.telegram.messenger.g0.N(18.0f), f43) + rectF13.centerY();
                float T16 = org.telegram.messenger.g0.T1(1.0f, 1.4f, f43);
                if (b(canvas, this.P, T14, T15, T16, f47) || z16) {
                }
                b(canvas, i6Var3, T14, T15, T16, f48);
            }
        }
        if (f43 > 0.0f) {
            if (this.Q == null) {
                ug.p1 p1Var = new ug.p1(25);
                this.Q = p1Var;
                p1Var.O = 100;
                p1Var.M = z9;
                p1Var.G = z9;
                p1Var.K = false;
                p1Var.H = z9;
                p1Var.r = 18;
                p1Var.B = false;
                p1Var.j = org.telegram.messenger.g0.L(80.0f);
                ug.p1 p1Var2 = this.Q;
                p1Var2.w = 0.85f;
                p1Var2.v = 0.85f;
                p1Var2.u = 0.85f;
                p1Var2.c();
                rectF = rectF14;
            } else {
                RectF rectF15 = this.E;
                rectF = rectF14;
                if (rectF15 != null) {
                }
            }
            float min4 = Math.min(getMeasuredHeight(), Math.min(getMeasuredWidth(), org.telegram.messenger.g0.L(150.0f)));
            this.Q.a.set(0.0f, 0.0f, min4, min4);
            this.Q.a.offset((getMeasuredWidth() - this.Q.a.width()) / 2.0f, (getMeasuredHeight() - this.Q.a.height()) / 2.0f);
            this.Q.b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            this.Q.f();
            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), org.telegram.messenger.qs.e4, 31);
            this.Q.e(canvas, f43);
            int i17 = (int) (f43 * 255.0f);
            Paint paint4 = this.H;
            paint4.setAlpha(i17);
            canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint4);
            canvas.restore();
            Paint paint5 = this.G;
            paint5.setStrokeWidth(f42);
            paint5.setAlpha(i17);
            canvas.drawCircle(rectF13.centerX(), rectF13.centerY(), (rectF13.width() - f42) / 2.0f, paint5);
            RectF rectF16 = this.E;
            Path path2 = this.F;
            if (rectF16 == null || !rectF16.equals(rectF)) {
                if (this.E == null) {
                    this.E = new RectF();
                }
                this.E.set(rectF);
                path2.rewind();
                if (i16 == 0) {
                    path2.moveTo(rectF13.width() * 0.348f, rectF13.height() * 0.538f);
                    path2.lineTo(rectF13.width() * 0.447f, rectF13.height() * 0.636f);
                    path2.lineTo(rectF13.width() * 0.678f, rectF13.height() * 0.402f);
                } else if (i16 == z9) {
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
            if (i16 == 0) {
                paint5.setStrokeWidth(org.telegram.messenger.g0.N(10.0f));
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
        int i7;
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        RectF rectF = this.b;
        float a10 = a8.r9.a(rectF.centerX(), rectF.centerY(), x10, y10);
        float atan2 = (float) ((Math.atan2(y10 - rectF.centerY(), x10 - rectF.centerX()) / 3.141592653589793d) * 180.0d);
        if (atan2 < 0.0f) {
            atan2 += 360.0f;
        }
        if (a10 > this.c.width() / 2.0f && a10 < (rectF.width() / 2.0f) + org.telegram.messenger.g0.L(14.0f)) {
            i7 = 0;
            while (true) {
                lc[] lcVarArr = this.w;
                if (i7 >= lcVarArr.length) {
                    break;
                }
                lc lcVar = lcVarArr[i7];
                float f10 = lcVar.c;
                float f11 = lcVar.d;
                if (atan2 >= f10 - f11 && atan2 <= f10 + f11) {
                    break;
                }
                i7++;
            }
        }
        i7 = -1;
        if (motionEvent.getAction() == 0) {
            setSelected(i7);
            if (i7 >= 0) {
                d(i7, i7 != -1);
                if (getParent() != null && this.R) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                    return true;
                }
            }
        } else {
            if (motionEvent.getAction() != 2) {
                if (motionEvent.getAction() == 1) {
                    boolean z9 = i7 != -1;
                    setSelected(-1);
                    d(i7, false);
                } else if (motionEvent.getAction() == 3) {
                    setSelected(-1);
                    d(i7, false);
                }
                return super.dispatchTouchEvent(motionEvent);
            }
            d(i7, i7 != -1);
            setSelected(i7);
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
    public final void f(long j3, boolean z9, mc... mcVarArr) {
        boolean z10;
        float f10;
        float f11;
        boolean z11;
        lc lcVar;
        float f12;
        lc[] lcVarArr;
        float[] fArr;
        float f13;
        int i7;
        long j10;
        float f14;
        float f15;
        boolean z12;
        long j11;
        boolean z13;
        mc[] mcVarArr2 = mcVarArr;
        w5 w5Var = this.n;
        w5 w5Var2 = this.s;
        i6 i6Var = this.P;
        i6 i6Var2 = this.O;
        i6 i6Var3 = this.N;
        i6 i6Var4 = this.M;
        lc[] lcVarArr2 = this.w;
        float f16 = 1.0f;
        if (mcVarArr2 == null || mcVarArr2.length == 0) {
            this.h = false;
            this.r = j3 == 0;
            if (z9) {
                z10 = true;
            } else {
                z10 = true;
                w5Var.e(true, 0.0f);
                w5Var2.e(true, this.r ? 1.0f : 0.0f);
            }
            i6Var2.t(i6Var4.i, false, z10);
            i6Var4.t("0", z9, z10);
            i6Var2.t("0", z9, z10);
            i6Var.t(i6Var3.i, false, z10);
            i6Var3.t("KB", z9, z10);
            i6Var.t("KB", z9, z10);
            for (lc lcVar2 : lcVarArr2) {
                lcVar2.g = 0.0f;
                if (!z9) {
                    lcVar2.h.e(z10, 0.0f);
                }
            }
            invalidate();
            return;
        }
        this.h = false;
        if (!z9) {
            w5Var.e(true, 0.0f);
        }
        SpannableString spannableString = new SpannableString("%");
        int length = mcVarArr2.length;
        SpannableString spannableString2 = spannableString;
        int i10 = 0;
        long j12 = 0;
        while (i10 < mcVarArr2.length) {
            if (mcVarArr2[i10] == null) {
                mc mcVar = new mc();
                mcVarArr2[i10] = mcVar;
                j11 = j12;
                mcVar.c = 0L;
            } else {
                j11 = j12;
            }
            mc mcVar2 = mcVarArr2[i10];
            mcVar2.a = i10;
            boolean z14 = mcVar2.b;
            if (z14) {
                z13 = z14;
                j11 += mcVar2.c;
            } else {
                z13 = z14;
            }
            if (mcVar2.c <= 0 || !z13) {
                length--;
            }
            i10++;
            j12 = j11;
        }
        long j13 = j12;
        if (j13 <= 0) {
            this.h = false;
            this.r = j3 <= 0;
            if (z9) {
                z12 = true;
            } else {
                z12 = true;
                w5Var.e(true, 0.0f);
                w5Var2.e(true, this.r ? 1.0f : 0.0f);
            }
            i6Var2.t(i6Var4.i, false, z12);
            i6Var4.t("0", z9, z12);
            i6Var2.t("0", z9, z12);
            i6Var.t(i6Var3.i, false, z12);
            i6Var3.t("KB", z9, z12);
            i6Var.t("KB", z9, z12);
            int i11 = 0;
            while (i11 < lcVarArr2.length) {
                lc lcVar3 = lcVarArr2[i11];
                lcVar3.g = 0.0f;
                if (!z9) {
                    lcVar3.h.e(z12, 0.0f);
                }
                i11++;
                z12 = true;
            }
            invalidate();
            return;
        }
        lc[] lcVarArr3 = lcVarArr2;
        int i12 = 0;
        int i13 = 0;
        float f17 = 0.0f;
        while (i12 < mcVarArr2.length) {
            mc mcVar3 = mcVarArr2[i12];
            if (mcVar3 == null || !mcVar3.b) {
                i7 = i12;
                j10 = j13;
                f14 = 0.02f;
                f15 = 0.0f;
            } else {
                f14 = 0.02f;
                i7 = i12;
                j10 = j13;
                f15 = mcVar3.c / j10;
            }
            if (f15 > 0.0f && f15 < f14) {
                i13++;
                f17 += f15;
            }
            i12 = i7 + 1;
            j13 = j10;
        }
        long j14 = j13;
        Math.min(mcVarArr2.length, lcVarArr3.length);
        int[] iArr = this.U;
        if (iArr == null || iArr.length != mcVarArr2.length) {
            this.U = new int[mcVarArr2.length];
        }
        float[] fArr2 = this.V;
        if (fArr2 == null || fArr2.length != mcVarArr2.length) {
            this.V = new float[mcVarArr2.length];
        }
        int i14 = 0;
        while (i14 < mcVarArr2.length) {
            float[] fArr3 = this.V;
            int i15 = i14;
            mc mcVar4 = mcVarArr2[i15];
            float f18 = f17;
            if (mcVar4 != null) {
                lcVarArr = lcVarArr3;
                if (mcVar4.b) {
                    fArr = fArr3;
                    f13 = mcVar4.c / j14;
                    fArr[i15] = f13;
                    i14 = i15 + 1;
                    f17 = f18;
                    lcVarArr3 = lcVarArr;
                }
            } else {
                lcVarArr = lcVarArr3;
            }
            fArr = fArr3;
            f13 = 0.0f;
            fArr[i15] = f13;
            i14 = i15 + 1;
            f17 = f18;
            lcVarArr3 = lcVarArr;
        }
        float f19 = f17;
        lc[] lcVarArr4 = lcVarArr3;
        org.telegram.messenger.g0.f3(this.V, this.U);
        if (this.d == 0) {
            Arrays.sort(mcVarArr2, new org.telegram.ui.oe(8));
            int i16 = 0;
            while (true) {
                if (i16 > mcVarArr2.length) {
                    break;
                }
                mc mcVar5 = mcVarArr2[i16];
                if (mcVar5.a == mcVarArr2.length - 1) {
                    mc mcVar6 = mcVarArr2[0];
                    mcVarArr2[0] = mcVar5;
                    mcVarArr2[i16] = mcVar6;
                    break;
                }
                i16++;
            }
        }
        if (length < 2) {
            length = 0;
        }
        float f20 = 360.0f - (length * 2.0f);
        int i17 = 0;
        int i18 = 0;
        float f21 = 0.0f;
        while (i17 < mcVarArr2.length) {
            mc mcVar7 = mcVarArr2[i17];
            int i19 = mcVar7.a;
            int i20 = i17;
            float f22 = !mcVar7.b ? 0.0f : mcVar7.c / j14;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            float f23 = f20;
            spannableStringBuilder.append((CharSequence) String.format("%d", Integer.valueOf(this.U[i19])));
            SpannableString spannableString3 = spannableString2;
            spannableStringBuilder.append((CharSequence) spannableString3);
            lc lcVar4 = lcVarArr4[i19];
            i6 i6Var5 = i6Var;
            i6 i6Var6 = i6Var2;
            float f24 = (((double) f22) <= 0.05d || f22 >= f16) ? 0.0f : f16;
            lcVar4.g = f24;
            if (f22 >= 0.08f) {
                f10 = f22;
                if (this.U[i19] < 100) {
                    f11 = f16;
                    lcVar4.i = f11;
                    lcVar4.l = f16;
                    if (z9) {
                        w5 w5Var3 = lcVar4.h;
                        z11 = true;
                        w5Var3.e(true, f24);
                        lc lcVar5 = lcVarArr4[i19];
                        lcVar5.j.e(true, lcVar5.i);
                        lc lcVar6 = lcVarArr4[i19];
                        lcVar6.m.e(true, lcVar6.l);
                    } else {
                        z11 = true;
                    }
                    lcVar = lcVarArr4[i19];
                    if (lcVar.g > 0.0f) {
                        lcVar.k.t(spannableStringBuilder, z9, z11);
                    }
                    if (f10 < 0.02f || f10 <= 0.0f) {
                        f16 = 1.0f;
                        f12 = (1.0f - ((i13 * 0.02f) - f19)) * f10;
                    } else {
                        f12 = 0.02f;
                        f16 = 1.0f;
                    }
                    float f25 = (i18 * 2.0f) + (f21 * f23);
                    float f26 = (f12 * f23) + f25;
                    if (f12 > 0.0f) {
                        lc lcVar7 = lcVarArr4[i19];
                        lcVar7.c = (f25 + f26) / 2.0f;
                        lcVar7.d = Math.abs(f26 - f25) / 2.0f;
                        lc lcVar8 = lcVarArr4[i19];
                        lcVar8.g = 0.0f;
                        if (!z9) {
                            lcVar8.e.e(true, lcVar8.c);
                            lc lcVar9 = lcVarArr4[i19];
                            lcVar9.f.e(true, lcVar9.d);
                            lc lcVar10 = lcVarArr4[i19];
                            lcVar10.h.e(true, lcVar10.g);
                        }
                    } else {
                        lc lcVar11 = lcVarArr4[i19];
                        lcVar11.c = (f25 + f26) / 2.0f;
                        lcVar11.d = Math.abs(f26 - f25) / 2.0f;
                        if (!z9) {
                            lc lcVar12 = lcVarArr4[i19];
                            lcVar12.e.e(true, lcVar12.c);
                            lc lcVar13 = lcVarArr4[i19];
                            lcVar13.f.e(true, lcVar13.d);
                        }
                        f21 += f12;
                        i18++;
                    }
                    i17 = i20 + 1;
                    mcVarArr2 = mcVarArr;
                    i6Var2 = i6Var6;
                    i6Var = i6Var5;
                    f20 = f23;
                    spannableString2 = spannableString3;
                }
            } else {
                f10 = f22;
            }
            f11 = 0.85f;
            lcVar4.i = f11;
            lcVar4.l = f16;
            if (z9) {
            }
            lcVar = lcVarArr4[i19];
            if (lcVar.g > 0.0f) {
            }
            if (f10 < 0.02f) {
            }
            f16 = 1.0f;
            f12 = (1.0f - ((i13 * 0.02f) - f19)) * f10;
            float f252 = (i18 * 2.0f) + (f21 * f23);
            float f262 = (f12 * f23) + f252;
            if (f12 > 0.0f) {
            }
            i17 = i20 + 1;
            mcVarArr2 = mcVarArr;
            i6Var2 = i6Var6;
            i6Var = i6Var5;
            f20 = f23;
            spannableString2 = spannableString3;
        }
        i6 i6Var7 = i6Var;
        i6 i6Var8 = i6Var2;
        String[] split = org.telegram.messenger.g0.i0(j14, true, true).split(" ");
        String str = split.length > 0 ? split[0] : "";
        if (str.length() >= 4 && j14 < 1073741824) {
            str = str.split("\\.")[0];
        }
        i6Var4.t(str, z9, true);
        i6Var3.t(split.length > 1 ? split[1] : "", z9, true);
        if (w5Var2.c > 0.0f) {
            i6Var8.t(i6Var4.i, z9, true);
            i6Var7.t(i6Var3.i, z9, true);
        }
        this.r = false;
        if (!z9) {
            w5Var2.e(true, 0.0f);
        }
        invalidate();
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.S = true;
        int i7 = 0;
        while (true) {
            lc[] lcVarArr = this.w;
            if (i7 >= lcVarArr.length) {
                return;
            }
            lc lcVar = lcVarArr[i7];
            if (lcVar.b == null) {
                boolean z9 = this.e;
                int[] iArr = this.f;
                if (z9) {
                    lcVar.b = org.telegram.messenger.sz.d(iArr[i7], org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), -1);
                } else {
                    lcVar.b = BitmapFactory.decodeResource(getContext().getResources(), iArr[i7]);
                }
            }
            i7++;
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
        int i7 = 0;
        this.S = false;
        while (true) {
            lc[] lcVarArr = this.w;
            if (i7 >= lcVarArr.length) {
                return;
            }
            Bitmap bitmap = lcVarArr[i7].b;
            if (bitmap != null) {
                bitmap.recycle();
                lcVarArr[i7].b = null;
            }
            i7++;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7);
        int L = org.telegram.messenger.g0.L(c());
        int L2 = org.telegram.messenger.g0.L(172.0f);
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
        ug.p1 p1Var = this.Q;
        if (p1Var != null) {
            p1Var.a.set(0.0f, 0.0f, org.telegram.messenger.g0.L(140.0f), org.telegram.messenger.g0.L(140.0f));
            this.Q.a.offset((getMeasuredWidth() - this.Q.a.width()) / 2.0f, (getMeasuredHeight() - this.Q.a.height()) / 2.0f);
            this.Q.b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            this.Q.f();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(L, TLObject.FLAG_30));
    }

    public void setInterceptTouch(boolean z9) {
        this.R = z9;
    }

    public void setSelected(int i7) {
        if (i7 == this.T) {
            return;
        }
        int i10 = 0;
        while (true) {
            lc[] lcVarArr = this.w;
            if (i10 >= lcVarArr.length) {
                this.T = i7;
                invalidate();
                return;
            }
            if (i7 == i10 && lcVarArr[i10].d <= 0.0f) {
                i7 = -1;
            }
            lcVarArr[i10].n = i7 == i10;
            i10++;
        }
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        try {
            this.D.setColor(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.i6, false));
            try {
                i6 i6Var = this.M;
                if (i6Var != null) {
                    i6Var.u(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.G6, false));
                }
                i6 i6Var2 = this.N;
                if (i6Var2 != null) {
                    i6Var2.u(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.y6, false));
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
            invalidate();
        } catch (Exception e11) {
            org.telegram.messenger.a8.g(e11, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
