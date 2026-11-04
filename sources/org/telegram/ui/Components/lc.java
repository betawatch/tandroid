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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public abstract class lc extends View implements org.telegram.ui.ActionBar.z5 {
    public static final int[] a0;
    public static final int[] b0;
    public static long c0;
    public static Long d0;
    public static Long e0;
    public final Paint E;
    public RectF F;
    public final Path G;
    public final Paint H;
    public final Paint I;
    public final LinearGradient J;
    public final LinearGradient K;
    public final Matrix L;
    public final Matrix M;
    public final g6 N;
    public final g6 O;
    public final g6 P;
    public final g6 Q;
    public vg.s1 R;
    public boolean S;
    public boolean T;
    public int U;
    public int[] V;
    public float[] W;
    public final RectF a;
    public final RectF b;
    public final RectF c;
    public final int d;
    public final boolean e;
    public final int[] f;
    public boolean h;
    public final u5 n;
    public boolean r;
    public final u5 s;
    public final jc[] w;
    public final float[] x;
    public final RectF y;

    static {
        int i3 = org.telegram.ui.ActionBar.k6.Zj;
        int i10 = org.telegram.ui.ActionBar.k6.Vj;
        int i11 = org.telegram.ui.ActionBar.k6.Wj;
        int i12 = org.telegram.ui.ActionBar.k6.dk;
        int i13 = org.telegram.ui.ActionBar.k6.ak;
        int i14 = org.telegram.ui.ActionBar.k6.Xj;
        int i15 = org.telegram.ui.ActionBar.k6.bk;
        int i16 = org.telegram.ui.ActionBar.k6.ek;
        int i17 = org.telegram.ui.ActionBar.k6.Yj;
        a0 = new int[]{i3, i10, i11, i12, i13, i14, i15, i16, i12, i17, i17};
        b0 = new int[]{R.raw.cache_photos, R.raw.cache_videos, R.raw.cache_documents, R.raw.cache_music, R.raw.cache_videos, R.raw.cache_music, R.raw.cache_stickers, R.raw.cache_profile_photos, R.raw.cache_other, R.raw.cache_other, R.raw.cache_documents};
        c0 = -1L;
    }

    public lc(Context context, int i3, int[] iArr, int i10, int[] iArr2) {
        super(context);
        this.a = new RectF();
        this.b = new RectF();
        this.c = new RectF();
        this.h = true;
        xq xqVar = xq.h;
        this.n = new u5(this, 750L, xqVar);
        this.r = false;
        this.s = new u5(this, 650L, xqVar);
        this.x = new float[2];
        this.y = new RectF();
        Paint paint = new Paint(1);
        this.E = paint;
        this.G = new Path();
        Paint paint2 = new Paint(1);
        this.H = paint2;
        Paint paint3 = new Paint(1);
        this.I = paint3;
        g6 g6Var = new g6(false, true, true);
        this.N = g6Var;
        g6 g6Var2 = new g6(false, true, true);
        this.O = g6Var2;
        g6 g6Var3 = new g6(false, true, true);
        this.P = g6Var3;
        g6 g6Var4 = new g6(false, true, true);
        this.Q = g6Var4;
        this.S = true;
        this.U = -1;
        setLayerType(2, null);
        this.f = iArr2;
        this.d = i10;
        this.e = i10 == 0;
        this.w = new jc[i3];
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.i6, false));
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, org.telegram.messenger.g0.L(200.0f), new int[]{7263574, -9513642, -12469647, 4307569}, new float[]{0.0f, 0.07f, 0.93f, 1.0f}, tileMode);
        this.J = linearGradient;
        LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, 0.0f, org.telegram.messenger.g0.L(200.0f), new int[]{7263574, -9513642, -12469647, 4307569}, new float[]{0.0f, 0.07f, 0.93f, 1.0f}, tileMode);
        this.K = linearGradient2;
        this.L = new Matrix();
        this.M = new Matrix();
        paint2.setShader(linearGradient);
        paint3.setShader(linearGradient);
        paint2.setStyle(style);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        paint2.setStrokeJoin(Paint.Join.ROUND);
        g6Var.n(0.2f, 450L, xqVar);
        g6Var.A = 0.6f;
        g6Var.u(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.G6, false));
        g6Var.x(org.telegram.messenger.g0.o());
        g6Var.w(org.telegram.messenger.g0.L(32.0f));
        g6Var.b = 17;
        g6Var2.n(0.6f, 450L, xqVar);
        g6Var2.A = 0.6f;
        g6Var2.u(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.y6, false));
        g6Var2.w(org.telegram.messenger.g0.L(12.0f));
        g6Var2.b = 17;
        g6Var3.n(0.2f, 450L, xqVar);
        g6Var3.A = 0.6f;
        g6Var3.a.setShader(linearGradient2);
        g6Var3.x(org.telegram.messenger.g0.o());
        g6Var3.w(org.telegram.messenger.g0.L(32.0f));
        g6Var3.b = 17;
        g6Var4.n(0.6f, 450L, xqVar);
        g6Var4.A = 0.6f;
        g6Var4.a.setShader(linearGradient2);
        g6Var4.x(org.telegram.messenger.g0.o());
        g6Var4.w(org.telegram.messenger.g0.L(12.0f));
        g6Var4.b = 17;
        int i11 = 0;
        while (true) {
            jc[] jcVarArr = this.w;
            if (i11 >= jcVarArr.length) {
                return;
            }
            jc jcVar = new jc(this);
            jcVarArr[i11] = jcVar;
            int w10 = org.telegram.ui.ActionBar.k6.w(org.telegram.ui.ActionBar.k6.x0(null, iArr[i11], false), ConnectionsManager.FileTypeAudio);
            int w11 = org.telegram.ui.ActionBar.k6.w(org.telegram.ui.ActionBar.k6.x0(null, iArr[i11], false), 822083583);
            org.telegram.messenger.g0.L(50.0f);
            RadialGradient radialGradient = new RadialGradient(0.0f, 0.0f, org.telegram.messenger.g0.L(86.0f), new int[]{w11, w10}, new float[]{0.3f, 1.0f}, Shader.TileMode.CLAMP);
            jcVar.v = radialGradient;
            Matrix matrix = new Matrix();
            jcVar.w = matrix;
            radialGradient.setLocalMatrix(matrix);
            jcVar.q.setShader(jcVar.v);
            i11++;
        }
    }

    public static float a(float f10) {
        return (float) ((f10 / 180.0f) * 3.141592653589793d);
    }

    public static boolean b(Canvas canvas, g6 g6Var, float f10, float f11, float f12, float f13) {
        if (f13 <= 0.0f) {
            return false;
        }
        g6Var.B = (int) (f13 * 255.0f);
        g6Var.setBounds(0, 0, 0, 0);
        canvas.save();
        canvas.translate(f10, f11);
        canvas.scale(f12, f12);
        g6Var.draw(canvas);
        canvas.restore();
        return g6Var.h();
    }

    public int c() {
        return org.telegram.messenger.hs.e3;
    }

    public abstract void d(int i3, boolean z10);

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
        int i3;
        float f11;
        int i10;
        float f12;
        boolean z10;
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
        boolean z11;
        int i11;
        float f20;
        RectF rectF5;
        float f21;
        int i12;
        float f22;
        g6 g6Var;
        float f23;
        float f24;
        float f25;
        RectF rectF6;
        jc jcVar;
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
        if (d0 == null) {
            d0 = Long.valueOf(System.currentTimeMillis());
        }
        boolean z12 = this.h;
        if (!z12 && e0 == null) {
            e0 = Long.valueOf(System.currentTimeMillis());
        } else if (z12 && e0 != null) {
            e0 = null;
        }
        float currentTimeMillis = ((e0 == null ? System.currentTimeMillis() : r9.longValue()) - d0.longValue()) * 0.6f;
        float[] fArr2 = this.x;
        cp.a(currentTimeMillis % 5400.0f, fArr2);
        float f26 = fArr2[0];
        float f27 = fArr2[1];
        if (e10 > 0.0f) {
            i3 = 1;
            Paint paint = this.E;
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
            i3 = 1;
            f11 = 0.0f;
            i10 = 0;
            f12 = 1.0f;
        }
        int i13 = (e10 > 0.0f || f10 > f11) ? i3 : i10;
        int i14 = i10;
        while (true) {
            jc[] jcVarArr = this.w;
            if (i14 >= jcVarArr.length) {
                break;
            }
            jc jcVar2 = jcVarArr[i14];
            cp.a((currentTimeMillis + (i14 * 80)) % 5400.0f, fArr2);
            float min = Math.min(Math.max(fArr2[i10], f26), f27);
            float min2 = Math.min(Math.max(fArr2[i3], f26), f27);
            if (e10 < f12 || min < min2) {
                RectF rectF10 = rectF8;
                float f28 = (min + min2) / 2.0f;
                float abs = Math.abs(min2 - min) / 2.0f;
                if (e10 <= f11) {
                    boolean z13 = i10;
                    float e12 = jcVar2.e.e(z13, jcVar2.c);
                    abs = jcVar2.f.e(z13, jcVar2.d);
                    rectF2 = rectF9;
                    f13 = T12;
                    f28 = e12;
                } else {
                    boolean z14 = i10;
                    rectF2 = rectF9;
                    if (e10 < f12) {
                        f13 = T12;
                        f28 = org.telegram.messenger.g0.T1((((float) Math.floor(f27 / 360.0f)) * 360.0f) + jcVar2.e.e(z14, jcVar2.c), f28, e10);
                        abs = org.telegram.messenger.g0.T1(jcVar2.f.e(z14, jcVar2.d), abs, e10);
                    } else {
                        f13 = T12;
                    }
                }
                int i15 = (jcVar2.e.i || jcVar2.f.i || i13 != 0) ? i3 : 0;
                float f29 = f12 - f10;
                float f30 = f12 - e10;
                g6 g6Var2 = jcVar2.k;
                f14 = e10;
                Path path = jcVar2.p;
                Paint paint2 = jcVar2.s;
                Paint paint3 = jcVar2.q;
                f15 = W1;
                RectF rectF11 = jcVar2.E.y;
                RectF rectF12 = jcVar2.u;
                f16 = f26;
                fArr = fArr2;
                float e13 = jcVar2.o.e(false, jcVar2.n ? f12 : f11);
                rectF12.set(rectF7);
                rectF12.inset((-org.telegram.messenger.g0.L(9.0f)) * e13, e13 * (-org.telegram.messenger.g0.L(9.0f)));
                float width = (float) ((((rectF2.width() + rectF12.width()) * Math.cos(a(f28))) / 4.0d) + rectF12.centerX());
                rectF3 = rectF7;
                float width2 = (float) ((((rectF2.width() + rectF12.width()) * Math.sin(a(f28))) / 4.0d) + rectF12.centerY());
                float e14 = jcVar2.h.e(false, jcVar2.g) * f29 * f30;
                float e15 = jcVar2.m.e(false, jcVar2.l);
                paint3.setAlpha((int) (f29 * 255.0f));
                if (abs * 2.0f >= 359.0f) {
                    canvas2.saveLayerAlpha(rectF12, org.telegram.messenger.hs.e4, 31);
                    canvas2.drawCircle(rectF12.centerX(), rectF12.centerY(), rectF12.width() / 2.0f, paint2);
                    canvas2.drawRect(rectF12, paint3);
                    f25 = e14;
                    f17 = f27;
                    jcVar2.a(canvas, rectF12.centerX(), rectF12.centerY(), width, width2, 0.0f, 359.0f, rectF2.width() / 2.0f, rectF12.width() / 2.0f, f25, Math.max(f11, (f30 / 0.75f) - 0.75f) * e15);
                    jcVar = jcVar2;
                    canvas2 = canvas;
                    canvas2.drawCircle(rectF2.centerX(), rectF2.centerY(), rectF2.width() / 2.0f, jcVar.t);
                    canvas2.restore();
                    i11 = i14;
                    rectF4 = rectF10;
                    i12 = i15;
                    f22 = f10;
                    rectF6 = rectF11;
                    g6Var = g6Var2;
                    f23 = width;
                    f24 = width2;
                    f21 = 0.0f;
                } else {
                    rectF4 = rectF10;
                    f17 = f27;
                    float min3 = Math.min(Math.min(f15, (rectF12.width() - rectF2.width()) / 4.0f), (float) ((rectF2.width() / 2.0f) * (abs / 180.0f) * 3.141592653589793d));
                    float width3 = (rectF12.width() - rectF2.width()) / 2.0f;
                    if (jcVar2.x == f28 && jcVar2.y == abs && jcVar2.z == min3 && jcVar2.A == width3 && jcVar2.B == rectF12.width() && jcVar2.C == rectF12.centerX() && jcVar2.D == rectF12.centerY()) {
                        f18 = f28;
                    } else {
                        jcVar2.x = f28;
                        jcVar2.y = abs;
                        jcVar2.z = min3;
                        jcVar2.A = width3;
                        jcVar2.B = rectF12.width();
                        jcVar2.C = rectF12.centerX();
                        jcVar2.D = rectF12.centerY();
                        float f31 = f28 - abs;
                        float f32 = f28 + abs;
                        boolean z15 = min3 > 0.0f;
                        float f33 = min3 * 2.0f;
                        f18 = f28;
                        float width4 = (min3 / ((float) ((rectF12.width() - f33) * 3.141592653589793d))) * 360.0f;
                        float width5 = ((abs > 175.0f ? 0 : 1) * 0.5f) + ((min3 / ((float) ((rectF2.width() + f33) * 3.141592653589793d))) * 360.0f);
                        float width6 = (rectF12.width() / 2.0f) - min3;
                        float width7 = (rectF2.width() / 2.0f) + min3;
                        path.rewind();
                        float f34 = f32 - f31;
                        if (f34 >= 0.5f) {
                            if (z15) {
                                f19 = f32;
                                double d = width6;
                                float f35 = f31 + width4;
                                double c2 = k2.p1.c(a(f35), d, rectF12.centerX());
                                z11 = z15;
                                i11 = i14;
                                f20 = abs;
                                double sin = (Math.sin(a(f35)) * d) + rectF12.centerY();
                                float f36 = (float) c2;
                                float f37 = (float) sin;
                                rectF11.set(f36 - min3, f37 - min3, f36 + min3, f37 + min3);
                                path.arcTo(rectF11, f35 - 90.0f, 90.0f);
                            } else {
                                f19 = f32;
                                z11 = z15;
                                i11 = i14;
                                f20 = abs;
                            }
                            path.arcTo(rectF12, f31 + width4, f34 - (width4 * 2.0f));
                            if (z11) {
                                double d10 = width6;
                                float c10 = (float) k2.p1.c(a(r4), d10, rectF12.centerX());
                                float sin2 = (float) ((Math.sin(a(r4)) * d10) + rectF12.centerY());
                                rectF11.set(c10 - min3, sin2 - min3, c10 + min3, sin2 + min3);
                                path.arcTo(rectF11, f19 - width4, 90.0f);
                                double d11 = width7;
                                float c11 = (float) k2.p1.c(a(r4), d11, rectF2.centerX());
                                float sin3 = (float) ((Math.sin(a(r4)) * d11) + rectF2.centerY());
                                rectF11.set(c11 - min3, sin3 - min3, c11 + min3, sin3 + min3);
                                path.arcTo(rectF11, (f19 - width5) + 90.0f, 90.0f);
                            }
                            rectF5 = rectF2;
                            path.arcTo(rectF5, f19 - width5, -(f34 - (width5 * 2.0f)));
                            if (z11) {
                                double d12 = width7;
                                float f38 = f31 + width5;
                                double c12 = k2.p1.c(a(f38), d12, rectF5.centerX());
                                double sin4 = (Math.sin(a(f38)) * d12) + rectF5.centerY();
                                float f39 = (float) c12;
                                float f40 = (float) sin4;
                                rectF11.set(f39 - min3, f40 - min3, f39 + min3, f40 + min3);
                                path.arcTo(rectF11, f38 + 180.0f, 90.0f);
                            }
                            path.close();
                            path.computeBounds(jcVar2.r, false);
                            float centerX = rectF12.centerX();
                            float centerY = rectF3.centerY();
                            rectF12.width();
                            jcVar2.w.reset();
                            jcVar2.w.setTranslate(centerX, centerY);
                            jcVar2.v.setLocalMatrix(jcVar2.w);
                            canvas2.saveLayerAlpha(rectF12, org.telegram.messenger.hs.e4, 31);
                            canvas2.drawPath(path, paint2);
                            canvas2.drawRect(rectF12, paint3);
                            rectF2 = rectF5;
                            f21 = 0.0f;
                            i12 = i15;
                            f22 = f10;
                            f15 = f15;
                            g6Var = g6Var2;
                            f23 = width;
                            f24 = width2;
                            f25 = e14;
                            rectF6 = rectF11;
                            jcVar2.a(canvas, rectF12.centerX(), rectF12.centerY(), f23, f24, f18 - f20, f18 + f20, rectF5.width() / 2.0f, rectF12.width() / 2.0f, f25, Math.max(0.0f, (f30 / 0.75f) - 0.75f) * e15);
                            jcVar = jcVar2;
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
                    jcVar2.w.reset();
                    jcVar2.w.setTranslate(centerX2, centerY2);
                    jcVar2.v.setLocalMatrix(jcVar2.w);
                    canvas2.saveLayerAlpha(rectF12, org.telegram.messenger.hs.e4, 31);
                    canvas2.drawPath(path, paint2);
                    canvas2.drawRect(rectF12, paint3);
                    rectF2 = rectF5;
                    f21 = 0.0f;
                    i12 = i15;
                    f22 = f10;
                    f15 = f15;
                    g6Var = g6Var2;
                    f23 = width;
                    f24 = width2;
                    f25 = e14;
                    rectF6 = rectF11;
                    jcVar2.a(canvas, rectF12.centerX(), rectF12.centerY(), f23, f24, f18 - f20, f18 + f20, rectF5.width() / 2.0f, rectF12.width() / 2.0f, f25, Math.max(0.0f, (f30 / 0.75f) - 0.75f) * e15);
                    jcVar = jcVar2;
                    canvas2 = canvas;
                    canvas2.restore();
                }
                float e16 = jcVar.j.e(false, jcVar.i);
                rectF6.set(f23 - f21, f24 - f21, f23 + f21, f24 + f21);
                if (e16 != f12) {
                    canvas2.save();
                    canvas2.scale(e16, e16, rectF6.centerX(), rectF6.centerY());
                }
                g6Var.B = (int) (f25 * 255.0f);
                g6Var.setBounds((int) rectF6.left, (int) rectF6.top, (int) rectF6.right, (int) rectF6.bottom);
                g6Var.draw(canvas2);
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
            i3 = 1;
            f11 = 0.0f;
            i10 = 0;
        }
        float f41 = e10;
        RectF rectF13 = rectF7;
        RectF rectF14 = rectF8;
        float f42 = T12;
        float f43 = f10;
        g6 g6Var3 = this.O;
        g6 g6Var4 = this.N;
        int i16 = this.d;
        if (i16 == 0) {
            float f44 = (f12 - f43) * (f12 - f41);
            if (b(canvas2, g6Var4, rectF13.centerX(), rectF13.centerY() - org.telegram.messenger.g0.N(5.0f), 1.0f, f44) || i13 != 0) {
            }
            b(canvas, g6Var3, rectF13.centerX(), org.telegram.messenger.g0.N(22.0f) + rectF13.centerY(), 1.0f, f44);
            z10 = true;
        } else {
            z10 = true;
            if (i16 == 1) {
                float f45 = f12 - f41;
                float centerX3 = rectF13.centerX() - org.telegram.messenger.g0.T1(0.0f, org.telegram.messenger.g0.N(4.0f), f43);
                float centerY3 = rectF13.centerY() - org.telegram.messenger.g0.T1(org.telegram.messenger.g0.N(5.0f), 0.0f, f43);
                float f46 = f12;
                float T13 = org.telegram.messenger.g0.T1(f46, 2.25f, f43);
                float f47 = f45 * f43;
                boolean z16 = b(canvas, this.P, centerX3, centerY3, T13, f47) || i13 != 0;
                float f48 = (f46 - f43) * f45;
                boolean z17 = b(canvas, g6Var4, centerX3, centerY3, T13, f48) || z16;
                float T14 = org.telegram.messenger.g0.T1(0.0f, org.telegram.messenger.g0.N(26.0f), f43) + rectF13.centerX();
                float T15 = org.telegram.messenger.g0.T1(org.telegram.messenger.g0.N(22.0f), -org.telegram.messenger.g0.N(18.0f), f43) + rectF13.centerY();
                float T16 = org.telegram.messenger.g0.T1(1.0f, 1.4f, f43);
                if (b(canvas, this.Q, T14, T15, T16, f47) || z17) {
                }
                b(canvas, g6Var3, T14, T15, T16, f48);
            }
        }
        if (f43 > 0.0f) {
            if (this.R == null) {
                vg.s1 s1Var = new vg.s1(25);
                this.R = s1Var;
                s1Var.O = 100;
                s1Var.M = z10;
                s1Var.G = z10;
                s1Var.K = false;
                s1Var.H = z10;
                s1Var.r = 18;
                s1Var.B = false;
                s1Var.j = org.telegram.messenger.g0.L(80.0f);
                vg.s1 s1Var2 = this.R;
                s1Var2.w = 0.85f;
                s1Var2.v = 0.85f;
                s1Var2.u = 0.85f;
                s1Var2.c();
                rectF = rectF14;
            } else {
                RectF rectF15 = this.F;
                rectF = rectF14;
                if (rectF15 != null) {
                }
            }
            float min4 = Math.min(getMeasuredHeight(), Math.min(getMeasuredWidth(), org.telegram.messenger.g0.L(150.0f)));
            this.R.a.set(0.0f, 0.0f, min4, min4);
            this.R.a.offset((getMeasuredWidth() - this.R.a.width()) / 2.0f, (getMeasuredHeight() - this.R.a.height()) / 2.0f);
            this.R.b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            this.R.f();
            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), org.telegram.messenger.hs.e4, 31);
            this.R.e(canvas, f43);
            int i17 = (int) (f43 * 255.0f);
            Paint paint4 = this.I;
            paint4.setAlpha(i17);
            canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint4);
            canvas.restore();
            Paint paint5 = this.H;
            paint5.setStrokeWidth(f42);
            paint5.setAlpha(i17);
            canvas.drawCircle(rectF13.centerX(), rectF13.centerY(), (rectF13.width() - f42) / 2.0f, paint5);
            RectF rectF16 = this.F;
            Path path2 = this.G;
            if (rectF16 == null || !rectF16.equals(rectF)) {
                if (this.F == null) {
                    this.F = new RectF();
                }
                this.F.set(rectF);
                path2.rewind();
                if (i16 == 0) {
                    path2.moveTo(rectF13.width() * 0.348f, rectF13.height() * 0.538f);
                    path2.lineTo(rectF13.width() * 0.447f, rectF13.height() * 0.636f);
                    path2.lineTo(rectF13.width() * 0.678f, rectF13.height() * 0.402f);
                } else if (i16 == z10) {
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
        if (this.T) {
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
        int i3;
        float x10 = motionEvent.getX();
        float y9 = motionEvent.getY();
        RectF rectF = this.b;
        float a10 = a7.h.a(rectF.centerX(), rectF.centerY(), x10, y9);
        float atan2 = (float) ((Math.atan2(y9 - rectF.centerY(), x10 - rectF.centerX()) / 3.141592653589793d) * 180.0d);
        if (atan2 < 0.0f) {
            atan2 += 360.0f;
        }
        if (a10 > this.c.width() / 2.0f && a10 < (rectF.width() / 2.0f) + org.telegram.messenger.g0.L(14.0f)) {
            i3 = 0;
            while (true) {
                jc[] jcVarArr = this.w;
                if (i3 >= jcVarArr.length) {
                    break;
                }
                jc jcVar = jcVarArr[i3];
                float f10 = jcVar.c;
                float f11 = jcVar.d;
                if (atan2 >= f10 - f11 && atan2 <= f10 + f11) {
                    break;
                }
                i3++;
            }
        }
        i3 = -1;
        if (motionEvent.getAction() == 0) {
            setSelected(i3);
            if (i3 >= 0) {
                d(i3, i3 != -1);
                if (getParent() != null && this.S) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                    return true;
                }
            }
        } else {
            if (motionEvent.getAction() != 2) {
                if (motionEvent.getAction() == 1) {
                    boolean z10 = i3 != -1;
                    setSelected(-1);
                    d(i3, false);
                } else if (motionEvent.getAction() == 3) {
                    setSelected(-1);
                    d(i3, false);
                }
                return super.dispatchTouchEvent(motionEvent);
            }
            d(i3, i3 != -1);
            setSelected(i3);
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
    public final void f(long j10, boolean z10, kc... kcVarArr) {
        boolean z11;
        float f10;
        float f11;
        boolean z12;
        jc jcVar;
        float f12;
        jc[] jcVarArr;
        float[] fArr;
        float f13;
        int i3;
        long j11;
        float f14;
        float f15;
        boolean z13;
        long j12;
        boolean z14;
        kc[] kcVarArr2 = kcVarArr;
        u5 u5Var = this.n;
        u5 u5Var2 = this.s;
        g6 g6Var = this.Q;
        g6 g6Var2 = this.P;
        g6 g6Var3 = this.O;
        g6 g6Var4 = this.N;
        jc[] jcVarArr2 = this.w;
        float f16 = 1.0f;
        if (kcVarArr2 == null || kcVarArr2.length == 0) {
            this.h = false;
            this.r = j10 == 0;
            if (z10) {
                z11 = true;
            } else {
                z11 = true;
                u5Var.e(true, 0.0f);
                u5Var2.e(true, this.r ? 1.0f : 0.0f);
            }
            g6Var2.t(g6Var4.i, false, z11);
            g6Var4.t("0", z10, z11);
            g6Var2.t("0", z10, z11);
            g6Var.t(g6Var3.i, false, z11);
            g6Var3.t("KB", z10, z11);
            g6Var.t("KB", z10, z11);
            for (jc jcVar2 : jcVarArr2) {
                jcVar2.g = 0.0f;
                if (!z10) {
                    jcVar2.h.e(z11, 0.0f);
                }
            }
            invalidate();
            return;
        }
        this.h = false;
        if (!z10) {
            u5Var.e(true, 0.0f);
        }
        SpannableString spannableString = new SpannableString("%");
        int length = kcVarArr2.length;
        SpannableString spannableString2 = spannableString;
        int i10 = 0;
        long j13 = 0;
        while (i10 < kcVarArr2.length) {
            if (kcVarArr2[i10] == null) {
                kc kcVar = new kc();
                kcVarArr2[i10] = kcVar;
                j12 = j13;
                kcVar.c = 0L;
            } else {
                j12 = j13;
            }
            kc kcVar2 = kcVarArr2[i10];
            kcVar2.a = i10;
            boolean z15 = kcVar2.b;
            if (z15) {
                z14 = z15;
                j12 += kcVar2.c;
            } else {
                z14 = z15;
            }
            if (kcVar2.c <= 0 || !z14) {
                length--;
            }
            i10++;
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
                u5Var.e(true, 0.0f);
                u5Var2.e(true, this.r ? 1.0f : 0.0f);
            }
            g6Var2.t(g6Var4.i, false, z13);
            g6Var4.t("0", z10, z13);
            g6Var2.t("0", z10, z13);
            g6Var.t(g6Var3.i, false, z13);
            g6Var3.t("KB", z10, z13);
            g6Var.t("KB", z10, z13);
            int i11 = 0;
            while (i11 < jcVarArr2.length) {
                jc jcVar3 = jcVarArr2[i11];
                jcVar3.g = 0.0f;
                if (!z10) {
                    jcVar3.h.e(z13, 0.0f);
                }
                i11++;
                z13 = true;
            }
            invalidate();
            return;
        }
        jc[] jcVarArr3 = jcVarArr2;
        int i12 = 0;
        int i13 = 0;
        float f17 = 0.0f;
        while (i12 < kcVarArr2.length) {
            kc kcVar3 = kcVarArr2[i12];
            if (kcVar3 == null || !kcVar3.b) {
                i3 = i12;
                j11 = j14;
                f14 = 0.02f;
                f15 = 0.0f;
            } else {
                f14 = 0.02f;
                i3 = i12;
                j11 = j14;
                f15 = kcVar3.c / j11;
            }
            if (f15 > 0.0f && f15 < f14) {
                i13++;
                f17 += f15;
            }
            i12 = i3 + 1;
            j14 = j11;
        }
        long j15 = j14;
        Math.min(kcVarArr2.length, jcVarArr3.length);
        int[] iArr = this.V;
        if (iArr == null || iArr.length != kcVarArr2.length) {
            this.V = new int[kcVarArr2.length];
        }
        float[] fArr2 = this.W;
        if (fArr2 == null || fArr2.length != kcVarArr2.length) {
            this.W = new float[kcVarArr2.length];
        }
        int i14 = 0;
        while (i14 < kcVarArr2.length) {
            float[] fArr3 = this.W;
            int i15 = i14;
            kc kcVar4 = kcVarArr2[i15];
            float f18 = f17;
            if (kcVar4 != null) {
                jcVarArr = jcVarArr3;
                if (kcVar4.b) {
                    fArr = fArr3;
                    f13 = kcVar4.c / j15;
                    fArr[i15] = f13;
                    i14 = i15 + 1;
                    f17 = f18;
                    jcVarArr3 = jcVarArr;
                }
            } else {
                jcVarArr = jcVarArr3;
            }
            fArr = fArr3;
            f13 = 0.0f;
            fArr[i15] = f13;
            i14 = i15 + 1;
            f17 = f18;
            jcVarArr3 = jcVarArr;
        }
        float f19 = f17;
        jc[] jcVarArr4 = jcVarArr3;
        org.telegram.messenger.g0.f3(this.W, this.V);
        if (this.d == 0) {
            Arrays.sort(kcVarArr2, new org.telegram.messenger.tq(28));
            int i16 = 0;
            while (true) {
                if (i16 > kcVarArr2.length) {
                    break;
                }
                kc kcVar5 = kcVarArr2[i16];
                if (kcVar5.a == kcVarArr2.length - 1) {
                    kc kcVar6 = kcVarArr2[0];
                    kcVarArr2[0] = kcVar5;
                    kcVarArr2[i16] = kcVar6;
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
        while (i17 < kcVarArr2.length) {
            kc kcVar7 = kcVarArr2[i17];
            int i19 = kcVar7.a;
            int i20 = i17;
            float f22 = !kcVar7.b ? 0.0f : kcVar7.c / j15;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            float f23 = f20;
            spannableStringBuilder.append((CharSequence) String.format("%d", Integer.valueOf(this.V[i19])));
            SpannableString spannableString3 = spannableString2;
            spannableStringBuilder.append((CharSequence) spannableString3);
            jc jcVar4 = jcVarArr4[i19];
            g6 g6Var5 = g6Var;
            g6 g6Var6 = g6Var2;
            float f24 = (((double) f22) <= 0.05d || f22 >= f16) ? 0.0f : f16;
            jcVar4.g = f24;
            if (f22 >= 0.08f) {
                f10 = f22;
                if (this.V[i19] < 100) {
                    f11 = f16;
                    jcVar4.i = f11;
                    jcVar4.l = f16;
                    if (z10) {
                        u5 u5Var3 = jcVar4.h;
                        z12 = true;
                        u5Var3.e(true, f24);
                        jc jcVar5 = jcVarArr4[i19];
                        jcVar5.j.e(true, jcVar5.i);
                        jc jcVar6 = jcVarArr4[i19];
                        jcVar6.m.e(true, jcVar6.l);
                    } else {
                        z12 = true;
                    }
                    jcVar = jcVarArr4[i19];
                    if (jcVar.g > 0.0f) {
                        jcVar.k.t(spannableStringBuilder, z10, z12);
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
                        jc jcVar7 = jcVarArr4[i19];
                        jcVar7.c = (f25 + f26) / 2.0f;
                        jcVar7.d = Math.abs(f26 - f25) / 2.0f;
                        jc jcVar8 = jcVarArr4[i19];
                        jcVar8.g = 0.0f;
                        if (!z10) {
                            jcVar8.e.e(true, jcVar8.c);
                            jc jcVar9 = jcVarArr4[i19];
                            jcVar9.f.e(true, jcVar9.d);
                            jc jcVar10 = jcVarArr4[i19];
                            jcVar10.h.e(true, jcVar10.g);
                        }
                    } else {
                        jc jcVar11 = jcVarArr4[i19];
                        jcVar11.c = (f25 + f26) / 2.0f;
                        jcVar11.d = Math.abs(f26 - f25) / 2.0f;
                        if (!z10) {
                            jc jcVar12 = jcVarArr4[i19];
                            jcVar12.e.e(true, jcVar12.c);
                            jc jcVar13 = jcVarArr4[i19];
                            jcVar13.f.e(true, jcVar13.d);
                        }
                        f21 += f12;
                        i18++;
                    }
                    i17 = i20 + 1;
                    kcVarArr2 = kcVarArr;
                    g6Var2 = g6Var6;
                    g6Var = g6Var5;
                    f20 = f23;
                    spannableString2 = spannableString3;
                }
            } else {
                f10 = f22;
            }
            f11 = 0.85f;
            jcVar4.i = f11;
            jcVar4.l = f16;
            if (z10) {
            }
            jcVar = jcVarArr4[i19];
            if (jcVar.g > 0.0f) {
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
            kcVarArr2 = kcVarArr;
            g6Var2 = g6Var6;
            g6Var = g6Var5;
            f20 = f23;
            spannableString2 = spannableString3;
        }
        g6 g6Var7 = g6Var;
        g6 g6Var8 = g6Var2;
        String[] split = org.telegram.messenger.g0.i0(j15, true, true).split(" ");
        String str = split.length > 0 ? split[0] : "";
        if (str.length() >= 4 && j15 < 1073741824) {
            str = str.split("\\.")[0];
        }
        g6Var4.t(str, z10, true);
        g6Var3.t(split.length > 1 ? split[1] : "", z10, true);
        if (u5Var2.c > 0.0f) {
            g6Var8.t(g6Var4.i, z10, true);
            g6Var7.t(g6Var3.i, z10, true);
        }
        this.r = false;
        if (!z10) {
            u5Var2.e(true, 0.0f);
        }
        invalidate();
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.T = true;
        int i3 = 0;
        while (true) {
            jc[] jcVarArr = this.w;
            if (i3 >= jcVarArr.length) {
                return;
            }
            jc jcVar = jcVarArr[i3];
            if (jcVar.b == null) {
                boolean z10 = this.e;
                int[] iArr = this.f;
                if (z10) {
                    jcVar.b = org.telegram.messenger.kz.d(iArr[i3], org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), -1);
                } else {
                    jcVar.b = BitmapFactory.decodeResource(getContext().getResources(), iArr[i3]);
                }
            }
            i3++;
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
        int i3 = 0;
        this.T = false;
        while (true) {
            jc[] jcVarArr = this.w;
            if (i3 >= jcVarArr.length) {
                return;
            }
            Bitmap bitmap = jcVarArr[i3].b;
            if (bitmap != null) {
                bitmap.recycle();
                jcVarArr[i3].b = null;
            }
            i3++;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i3, int i10) {
        int size = View.MeasureSpec.getSize(i3);
        int L = org.telegram.messenger.g0.L(c());
        int L2 = org.telegram.messenger.g0.L(172.0f);
        RectF rectF = this.a;
        rectF.set((size - L2) / 2.0f, (L - L2) / 2.0f, (size + L2) / 2.0f, (L2 + L) / 2.0f);
        Matrix matrix = this.L;
        matrix.reset();
        matrix.setTranslate(rectF.left, 0.0f);
        this.J.setLocalMatrix(matrix);
        Matrix matrix2 = this.M;
        matrix2.reset();
        matrix2.setTranslate(rectF.left, -rectF.centerY());
        this.K.setLocalMatrix(matrix2);
        vg.s1 s1Var = this.R;
        if (s1Var != null) {
            s1Var.a.set(0.0f, 0.0f, org.telegram.messenger.g0.L(140.0f), org.telegram.messenger.g0.L(140.0f));
            this.R.a.offset((getMeasuredWidth() - this.R.a.width()) / 2.0f, (getMeasuredHeight() - this.R.a.height()) / 2.0f);
            this.R.b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            this.R.f();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(L, TLObject.FLAG_30));
    }

    public void setInterceptTouch(boolean z10) {
        this.S = z10;
    }

    public void setSelected(int i3) {
        if (i3 == this.U) {
            return;
        }
        int i10 = 0;
        while (true) {
            jc[] jcVarArr = this.w;
            if (i10 >= jcVarArr.length) {
                this.U = i3;
                invalidate();
                return;
            }
            if (i3 == i10 && jcVarArr[i10].d <= 0.0f) {
                i3 = -1;
            }
            jcVarArr[i10].n = i3 == i10;
            i10++;
        }
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        try {
            this.E.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.i6, false));
            try {
                g6 g6Var = this.N;
                if (g6Var != null) {
                    g6Var.u(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.G6, false));
                }
                g6 g6Var2 = this.O;
                if (g6Var2 != null) {
                    g6Var2.u(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.y6, false));
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
            invalidate();
        } catch (Exception e11) {
            org.telegram.messenger.a8.g(e11, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
