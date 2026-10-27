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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public abstract class cd extends View implements org.telegram.ui.ActionBar.p6 {
    public static final int[] W;
    public static final int[] a0;
    public static long b0;
    public static Long c0;
    public static Long d0;
    public RectF E;
    public final Path F;
    public final Paint G;
    public final Paint H;
    public final LinearGradient I;
    public final LinearGradient J;
    public final Matrix K;
    public final Matrix L;
    public final r6 M;
    public final r6 N;
    public final r6 O;
    public final r6 P;
    public tg.w1 Q;
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
    public final h6 n;
    public boolean r;
    public final h6 s;
    public final ad[] v;
    public final float[] w;
    public final RectF x;
    public final Paint y;

    static {
        int i10 = org.telegram.ui.ActionBar.y6.lj;
        int i11 = org.telegram.ui.ActionBar.y6.hj;
        int i12 = org.telegram.ui.ActionBar.y6.ij;
        int i13 = org.telegram.ui.ActionBar.y6.pj;
        int i14 = org.telegram.ui.ActionBar.y6.mj;
        int i15 = org.telegram.ui.ActionBar.y6.jj;
        int i16 = org.telegram.ui.ActionBar.y6.nj;
        int i17 = org.telegram.ui.ActionBar.y6.qj;
        int i18 = org.telegram.ui.ActionBar.y6.kj;
        W = new int[]{i10, i11, i12, i13, i14, i15, i16, i17, i13, i18, i18};
        int i19 = R.raw.cache_photos;
        int i20 = R.raw.cache_videos;
        int i21 = R.raw.cache_documents;
        int i22 = R.raw.cache_music;
        int i23 = R.raw.cache_stickers;
        int i24 = R.raw.cache_profile_photos;
        int i25 = R.raw.cache_other;
        a0 = new int[]{i19, i20, i21, i22, i20, i22, i23, i24, i25, i25, i21};
        b0 = -1L;
    }

    public cd(Context context, int i10, int[] iArr, int i11, int[] iArr2) {
        super(context);
        this.a = new RectF();
        this.b = new RectF();
        this.c = new RectF();
        this.h = true;
        ds dsVar = ds.h;
        this.n = new h6(this, 750L, dsVar);
        this.r = false;
        this.s = new h6(this, 650L, dsVar);
        this.w = new float[2];
        this.x = new RectF();
        Paint paint = new Paint(1);
        this.y = paint;
        this.F = new Path();
        Paint paint2 = new Paint(1);
        this.G = paint2;
        Paint paint3 = new Paint(1);
        this.H = paint3;
        r6 r6Var = new r6(false, true, true);
        this.M = r6Var;
        r6 r6Var2 = new r6(false, true, true);
        this.N = r6Var2;
        r6 r6Var3 = new r6(false, true, true);
        this.O = r6Var3;
        r6 r6Var4 = new r6(false, true, true);
        this.P = r6Var4;
        this.R = true;
        this.T = -1;
        setLayerType(2, null);
        this.f = iArr2;
        this.d = i11;
        this.e = i11 == 0;
        this.v = new ad[i10];
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.i6, false));
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(200.0f), new int[]{7263574, -9513642, -12469647, 4307569}, new float[]{0.0f, 0.07f, 0.93f, 1.0f}, tileMode);
        this.I = linearGradient;
        LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(200.0f), new int[]{7263574, -9513642, -12469647, 4307569}, new float[]{0.0f, 0.07f, 0.93f, 1.0f}, tileMode);
        this.J = linearGradient2;
        this.K = new Matrix();
        this.L = new Matrix();
        paint2.setShader(linearGradient);
        paint3.setShader(linearGradient);
        paint2.setStyle(style);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        paint2.setStrokeJoin(Paint.Join.ROUND);
        r6Var.n(0.2f, 450L, dsVar);
        r6Var.A = 0.6f;
        r6Var.u(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.G6, false));
        r6Var.x(AndroidUtilities.bold());
        r6Var.w(AndroidUtilities.dp(32.0f));
        r6Var.b = 17;
        r6Var2.n(0.6f, 450L, dsVar);
        r6Var2.A = 0.6f;
        r6Var2.u(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.y6, false));
        r6Var2.w(AndroidUtilities.dp(12.0f));
        r6Var2.b = 17;
        r6Var3.n(0.2f, 450L, dsVar);
        r6Var3.A = 0.6f;
        r6Var3.a.setShader(linearGradient2);
        r6Var3.x(AndroidUtilities.bold());
        r6Var3.w(AndroidUtilities.dp(32.0f));
        r6Var3.b = 17;
        r6Var4.n(0.6f, 450L, dsVar);
        r6Var4.A = 0.6f;
        r6Var4.a.setShader(linearGradient2);
        r6Var4.x(AndroidUtilities.bold());
        r6Var4.w(AndroidUtilities.dp(12.0f));
        r6Var4.b = 17;
        int i12 = 0;
        while (true) {
            ad[] adVarArr = this.v;
            if (i12 >= adVarArr.length) {
                return;
            }
            ad adVar = new ad(this);
            adVarArr[i12] = adVar;
            int v = org.telegram.ui.ActionBar.y6.v(org.telegram.ui.ActionBar.y6.x0(null, iArr[i12], false), ConnectionsManager.FileTypeAudio);
            int v10 = org.telegram.ui.ActionBar.y6.v(org.telegram.ui.ActionBar.y6.x0(null, iArr[i12], false), 822083583);
            AndroidUtilities.dp(50.0f);
            RadialGradient radialGradient = new RadialGradient(0.0f, 0.0f, AndroidUtilities.dp(86.0f), new int[]{v10, v}, new float[]{0.3f, 1.0f}, Shader.TileMode.CLAMP);
            adVar.v = radialGradient;
            Matrix matrix = new Matrix();
            adVar.w = matrix;
            radialGradient.setLocalMatrix(matrix);
            adVar.q.setShader(adVar.v);
            i12++;
        }
    }

    public static float a(float f7) {
        return (float) ((f7 / 180.0f) * 3.141592653589793d);
    }

    public static boolean b(Canvas canvas, r6 r6Var, float f7, float f10, float f11, float f12) {
        if (f12 <= 0.0f) {
            return false;
        }
        r6Var.B = (int) (f12 * 255.0f);
        r6Var.setBounds(0, 0, 0, 0);
        canvas.save();
        canvas.translate(f7, f10);
        canvas.scale(f11, f11);
        r6Var.draw(canvas);
        canvas.restore();
        return r6Var.h();
    }

    public int c() {
        return 200;
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
        r6 r6Var;
        float f22;
        float f23;
        float f24;
        RectF rectF6;
        ad adVar;
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
        float[] fArr2 = this.w;
        gq.a(fArr2, currentTimeMillis % 5400.0f);
        float f25 = fArr2[0];
        float f26 = fArr2[1];
        if (d > 0.0f) {
            i10 = 1;
            Paint paint = this.y;
            paint.setStrokeWidth(lerp2);
            f11 = 1.0f;
            int alpha = paint.getAlpha();
            f10 = 0.0f;
            paint.setAlpha((int) (alpha * d));
            i11 = 0;
            f7 = d10;
            canvas2.drawCircle(rectF7.centerX(), rectF7.centerY(), (rectF7.width() - lerp2) / 2.0f, paint);
            paint.setAlpha(alpha);
        } else {
            f7 = d10;
            i10 = 1;
            f10 = 0.0f;
            i11 = 0;
            f11 = 1.0f;
        }
        int i14 = (d > 0.0f || f7 > f10) ? i10 : i11;
        int i15 = i11;
        while (true) {
            ad[] adVarArr = this.v;
            if (i15 >= adVarArr.length) {
                break;
            }
            ad adVar2 = adVarArr[i15];
            gq.a(fArr2, (currentTimeMillis + (i15 * 80)) % 5400.0f);
            float min = Math.min(Math.max(fArr2[i11], f25), f26);
            float min2 = Math.min(Math.max(fArr2[i10], f25), f26);
            if (d < f11 || min < min2) {
                RectF rectF10 = rectF8;
                float f27 = (min + min2) / 2.0f;
                float abs = Math.abs(min2 - min) / 2.0f;
                if (d <= f10) {
                    boolean z13 = i11;
                    float d11 = adVar2.e.d(adVar2.c, z13);
                    abs = adVar2.f.d(adVar2.d, z13);
                    rectF2 = rectF9;
                    f12 = lerp2;
                    f27 = d11;
                } else {
                    boolean z14 = i11;
                    rectF2 = rectF9;
                    if (d < f11) {
                        f12 = lerp2;
                        f27 = AndroidUtilities.lerp((((float) Math.floor(f26 / 360.0f)) * 360.0f) + adVar2.e.d(adVar2.c, z14), f27, d);
                        abs = AndroidUtilities.lerp(adVar2.f.d(adVar2.d, z14), abs, d);
                    } else {
                        f12 = lerp2;
                    }
                }
                int i16 = (adVar2.e.i || adVar2.f.i || i14 != 0) ? i10 : 0;
                float f28 = f11 - f7;
                float f29 = f11 - d;
                r6 r6Var2 = adVar2.k;
                f13 = d;
                Path path = adVar2.p;
                Paint paint2 = adVar2.s;
                Paint paint3 = adVar2.q;
                f14 = lerp3;
                RectF rectF11 = adVar2.E.x;
                RectF rectF12 = adVar2.u;
                f15 = f25;
                fArr = fArr2;
                float d12 = adVar2.o.d(adVar2.n ? f11 : f10, false);
                rectF12.set(rectF7);
                rectF12.inset((-AndroidUtilities.dp(9.0f)) * d12, d12 * (-AndroidUtilities.dp(9.0f)));
                float width = (float) ((((rectF2.width() + rectF12.width()) * Math.cos(a(f27))) / 4.0d) + rectF12.centerX());
                rectF3 = rectF7;
                float width2 = (float) ((((rectF2.width() + rectF12.width()) * Math.sin(a(f27))) / 4.0d) + rectF12.centerY());
                float d13 = adVar2.h.d(adVar2.g, false) * f28 * f29;
                float d14 = adVar2.m.d(adVar2.l, false);
                paint3.setAlpha((int) (f28 * 255.0f));
                if (abs * 2.0f >= 359.0f) {
                    canvas2.saveLayerAlpha(rectF12, 255, 31);
                    canvas2.drawCircle(rectF12.centerX(), rectF12.centerY(), rectF12.width() / 2.0f, paint2);
                    canvas2.drawRect(rectF12, paint3);
                    f24 = d13;
                    f16 = f26;
                    adVar2.a(canvas, rectF12.centerX(), rectF12.centerY(), width, width2, 0.0f, 359.0f, rectF2.width() / 2.0f, rectF12.width() / 2.0f, f24, Math.max(f10, (f29 / 0.75f) - 0.75f) * d14);
                    adVar = adVar2;
                    canvas2 = canvas;
                    canvas2.drawCircle(rectF2.centerX(), rectF2.centerY(), rectF2.width() / 2.0f, adVar.t);
                    canvas2.restore();
                    i12 = i15;
                    rectF4 = rectF10;
                    i13 = i16;
                    f21 = f7;
                    rectF6 = rectF11;
                    r6Var = r6Var2;
                    f22 = width;
                    f23 = width2;
                    f20 = 0.0f;
                } else {
                    rectF4 = rectF10;
                    f16 = f26;
                    float min3 = Math.min(Math.min(f14, (rectF12.width() - rectF2.width()) / 4.0f), (float) ((rectF2.width() / 2.0f) * (abs / 180.0f) * 3.141592653589793d));
                    float width3 = (rectF12.width() - rectF2.width()) / 2.0f;
                    if (adVar2.x == f27 && adVar2.y == abs && adVar2.z == min3 && adVar2.A == width3 && adVar2.B == rectF12.width() && adVar2.C == rectF12.centerX() && adVar2.D == rectF12.centerY()) {
                        f17 = f27;
                    } else {
                        adVar2.x = f27;
                        adVar2.y = abs;
                        adVar2.z = min3;
                        adVar2.A = width3;
                        adVar2.B = rectF12.width();
                        adVar2.C = rectF12.centerX();
                        adVar2.D = rectF12.centerY();
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
                                double d15 = width6;
                                float f34 = f30 + width4;
                                double a2 = org.telegram.messenger.t.a(a(f34), d15, rectF12.centerX());
                                z11 = z15;
                                i12 = i15;
                                f19 = abs;
                                double sin = (Math.sin(a(f34)) * d15) + rectF12.centerY();
                                float f35 = (float) a2;
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
                                double d16 = width6;
                                float a10 = (float) org.telegram.messenger.t.a(a(r4), d16, rectF12.centerX());
                                float sin2 = (float) ((Math.sin(a(r4)) * d16) + rectF12.centerY());
                                rectF11.set(a10 - min3, sin2 - min3, a10 + min3, sin2 + min3);
                                path.arcTo(rectF11, f18 - width4, 90.0f);
                                double d17 = width7;
                                float a11 = (float) org.telegram.messenger.t.a(a(r4), d17, rectF2.centerX());
                                float sin3 = (float) ((Math.sin(a(r4)) * d17) + rectF2.centerY());
                                rectF11.set(a11 - min3, sin3 - min3, a11 + min3, sin3 + min3);
                                path.arcTo(rectF11, (f18 - width5) + 90.0f, 90.0f);
                            }
                            rectF5 = rectF2;
                            path.arcTo(rectF5, f18 - width5, -(f33 - (width5 * 2.0f)));
                            if (z11) {
                                double d18 = width7;
                                float f37 = f30 + width5;
                                double a12 = org.telegram.messenger.t.a(a(f37), d18, rectF5.centerX());
                                double sin4 = (Math.sin(a(f37)) * d18) + rectF5.centerY();
                                float f38 = (float) a12;
                                float f39 = (float) sin4;
                                rectF11.set(f38 - min3, f39 - min3, f38 + min3, f39 + min3);
                                path.arcTo(rectF11, f37 + 180.0f, 90.0f);
                            }
                            path.close();
                            path.computeBounds(adVar2.r, false);
                            float centerX = rectF12.centerX();
                            float centerY = rectF3.centerY();
                            rectF12.width();
                            adVar2.w.reset();
                            adVar2.w.setTranslate(centerX, centerY);
                            adVar2.v.setLocalMatrix(adVar2.w);
                            canvas2.saveLayerAlpha(rectF12, 255, 31);
                            canvas2.drawPath(path, paint2);
                            canvas2.drawRect(rectF12, paint3);
                            rectF2 = rectF5;
                            f20 = 0.0f;
                            i13 = i16;
                            f21 = f7;
                            f14 = f14;
                            r6Var = r6Var2;
                            f22 = width;
                            f23 = width2;
                            f24 = d13;
                            rectF6 = rectF11;
                            adVar2.a(canvas, rectF12.centerX(), rectF12.centerY(), f22, f23, f17 - f19, f17 + f19, rectF5.width() / 2.0f, rectF12.width() / 2.0f, f24, Math.max(0.0f, (f29 / 0.75f) - 0.75f) * d14);
                            adVar = adVar2;
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
                    adVar2.w.reset();
                    adVar2.w.setTranslate(centerX2, centerY2);
                    adVar2.v.setLocalMatrix(adVar2.w);
                    canvas2.saveLayerAlpha(rectF12, 255, 31);
                    canvas2.drawPath(path, paint2);
                    canvas2.drawRect(rectF12, paint3);
                    rectF2 = rectF5;
                    f20 = 0.0f;
                    i13 = i16;
                    f21 = f7;
                    f14 = f14;
                    r6Var = r6Var2;
                    f22 = width;
                    f23 = width2;
                    f24 = d13;
                    rectF6 = rectF11;
                    adVar2.a(canvas, rectF12.centerX(), rectF12.centerY(), f22, f23, f17 - f19, f17 + f19, rectF5.width() / 2.0f, rectF12.width() / 2.0f, f24, Math.max(0.0f, (f29 / 0.75f) - 0.75f) * d14);
                    adVar = adVar2;
                    canvas2 = canvas;
                    canvas2.restore();
                }
                float d19 = adVar.j.d(adVar.i, false);
                rectF6.set(f22 - f20, f23 - f20, f22 + f20, f23 + f20);
                if (d19 != f11) {
                    canvas2.save();
                    canvas2.scale(d19, d19, rectF6.centerX(), rectF6.centerY());
                }
                r6Var.B = (int) (f24 * 255.0f);
                r6Var.setBounds((int) rectF6.left, (int) rectF6.top, (int) rectF6.right, (int) rectF6.bottom);
                r6Var.draw(canvas2);
                if (d19 != f11) {
                    canvas2.restore();
                }
                i14 = i13;
            } else {
                f13 = d;
                rectF3 = rectF7;
                rectF4 = rectF8;
                rectF2 = rectF9;
                f12 = lerp2;
                f14 = lerp3;
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
            lerp2 = f12;
            d = f13;
            lerp3 = f14;
            f25 = f15;
            fArr2 = fArr;
            rectF7 = rectF3;
            rectF8 = rectF4;
            i10 = 1;
            f10 = 0.0f;
            i11 = 0;
        }
        float f40 = d;
        RectF rectF13 = rectF7;
        RectF rectF14 = rectF8;
        float f41 = lerp2;
        float f42 = f7;
        r6 r6Var3 = this.N;
        r6 r6Var4 = this.M;
        int i17 = this.d;
        if (i17 == 0) {
            float f43 = (f11 - f42) * (f11 - f40);
            if (b(canvas2, r6Var4, rectF13.centerX(), rectF13.centerY() - AndroidUtilities.dpf2(5.0f), 1.0f, f43) || i14 != 0) {
            }
            b(canvas, r6Var3, rectF13.centerX(), AndroidUtilities.dpf2(22.0f) + rectF13.centerY(), 1.0f, f43);
            z10 = true;
        } else {
            z10 = true;
            if (i17 == 1) {
                float f44 = f11 - f40;
                float centerX3 = rectF13.centerX() - AndroidUtilities.lerp(0.0f, AndroidUtilities.dpf2(4.0f), f42);
                float centerY3 = rectF13.centerY() - AndroidUtilities.lerp(AndroidUtilities.dpf2(5.0f), 0.0f, f42);
                float f45 = f11;
                float lerp4 = AndroidUtilities.lerp(f45, 2.25f, f42);
                float f46 = f44 * f42;
                boolean z16 = b(canvas, this.O, centerX3, centerY3, lerp4, f46) || i14 != 0;
                float f47 = (f45 - f42) * f44;
                boolean z17 = b(canvas, r6Var4, centerX3, centerY3, lerp4, f47) || z16;
                float lerp5 = AndroidUtilities.lerp(0.0f, AndroidUtilities.dpf2(26.0f), f42) + rectF13.centerX();
                float lerp6 = AndroidUtilities.lerp(AndroidUtilities.dpf2(22.0f), -AndroidUtilities.dpf2(18.0f), f42) + rectF13.centerY();
                float lerp7 = AndroidUtilities.lerp(1.0f, 1.4f, f42);
                if (b(canvas, this.P, lerp5, lerp6, lerp7, f46) || z17) {
                }
                b(canvas, r6Var3, lerp5, lerp6, lerp7, f47);
            }
        }
        if (f42 > 0.0f) {
            if (this.Q == null) {
                tg.w1 w1Var = new tg.w1(25);
                this.Q = w1Var;
                w1Var.O = 100;
                w1Var.M = z10;
                w1Var.G = z10;
                w1Var.K = false;
                w1Var.H = z10;
                w1Var.r = 18;
                w1Var.B = false;
                w1Var.j = AndroidUtilities.dp(80.0f);
                tg.w1 w1Var2 = this.Q;
                w1Var2.w = 0.85f;
                w1Var2.v = 0.85f;
                w1Var2.u = 0.85f;
                w1Var2.c();
                rectF = rectF14;
            } else {
                RectF rectF15 = this.E;
                rectF = rectF14;
                if (rectF15 != null) {
                }
            }
            float min4 = Math.min(getMeasuredHeight(), Math.min(getMeasuredWidth(), AndroidUtilities.dp(150.0f)));
            this.Q.a.set(0.0f, 0.0f, min4, min4);
            this.Q.a.offset((getMeasuredWidth() - this.Q.a.width()) / 2.0f, (getMeasuredHeight() - this.Q.a.height()) / 2.0f);
            this.Q.b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            this.Q.f();
            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
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
                paint5.setStrokeWidth(AndroidUtilities.dpf2(10.0f));
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
        float x9 = motionEvent.getX();
        float y3 = motionEvent.getY();
        RectF rectF = this.b;
        float a2 = a8.ic.a(rectF.centerX(), rectF.centerY(), x9, y3);
        float atan2 = (float) ((Math.atan2(y3 - rectF.centerY(), x9 - rectF.centerX()) / 3.141592653589793d) * 180.0d);
        if (atan2 < 0.0f) {
            atan2 += 360.0f;
        }
        if (a2 > this.c.width() / 2.0f && a2 < (rectF.width() / 2.0f) + AndroidUtilities.dp(14.0f)) {
            i10 = 0;
            while (true) {
                ad[] adVarArr = this.v;
                if (i10 >= adVarArr.length) {
                    break;
                }
                ad adVar = adVarArr[i10];
                float f7 = adVar.c;
                float f10 = adVar.d;
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
    public final void f(long j10, boolean z10, bd... bdVarArr) {
        boolean z11;
        float f7;
        float f10;
        boolean z12;
        ad adVar;
        float f11;
        ad[] adVarArr;
        float[] fArr;
        float f12;
        int i10;
        long j11;
        float f13;
        float f14;
        boolean z13;
        long j12;
        boolean z14;
        bd[] bdVarArr2 = bdVarArr;
        h6 h6Var = this.n;
        h6 h6Var2 = this.s;
        r6 r6Var = this.P;
        r6 r6Var2 = this.O;
        r6 r6Var3 = this.N;
        r6 r6Var4 = this.M;
        ad[] adVarArr2 = this.v;
        float f15 = 1.0f;
        if (bdVarArr2 == null || bdVarArr2.length == 0) {
            this.h = false;
            this.r = j10 == 0;
            if (z10) {
                z11 = true;
            } else {
                z11 = true;
                h6Var.d(0.0f, true);
                h6Var2.d(this.r ? 1.0f : 0.0f, true);
            }
            r6Var2.t(r6Var4.i, false, z11);
            r6Var4.t("0", z10, z11);
            r6Var2.t("0", z10, z11);
            r6Var.t(r6Var3.i, false, z11);
            r6Var3.t("KB", z10, z11);
            r6Var.t("KB", z10, z11);
            for (ad adVar2 : adVarArr2) {
                adVar2.g = 0.0f;
                if (!z10) {
                    adVar2.h.d(0.0f, z11);
                }
            }
            invalidate();
            return;
        }
        this.h = false;
        if (!z10) {
            h6Var.d(0.0f, true);
        }
        SpannableString spannableString = new SpannableString("%");
        int length = bdVarArr2.length;
        SpannableString spannableString2 = spannableString;
        int i11 = 0;
        long j13 = 0;
        while (i11 < bdVarArr2.length) {
            if (bdVarArr2[i11] == null) {
                bd bdVar = new bd();
                bdVarArr2[i11] = bdVar;
                j12 = j13;
                bdVar.c = 0L;
            } else {
                j12 = j13;
            }
            bd bdVar2 = bdVarArr2[i11];
            bdVar2.a = i11;
            boolean z15 = bdVar2.b;
            if (z15) {
                z14 = z15;
                j12 += bdVar2.c;
            } else {
                z14 = z15;
            }
            if (bdVar2.c <= 0 || !z14) {
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
                h6Var.d(0.0f, true);
                h6Var2.d(this.r ? 1.0f : 0.0f, true);
            }
            r6Var2.t(r6Var4.i, false, z13);
            r6Var4.t("0", z10, z13);
            r6Var2.t("0", z10, z13);
            r6Var.t(r6Var3.i, false, z13);
            r6Var3.t("KB", z10, z13);
            r6Var.t("KB", z10, z13);
            int i12 = 0;
            while (i12 < adVarArr2.length) {
                ad adVar3 = adVarArr2[i12];
                adVar3.g = 0.0f;
                if (!z10) {
                    adVar3.h.d(0.0f, z13);
                }
                i12++;
                z13 = true;
            }
            invalidate();
            return;
        }
        ad[] adVarArr3 = adVarArr2;
        int i13 = 0;
        int i14 = 0;
        float f16 = 0.0f;
        while (i13 < bdVarArr2.length) {
            bd bdVar3 = bdVarArr2[i13];
            if (bdVar3 == null || !bdVar3.b) {
                i10 = i13;
                j11 = j14;
                f13 = 0.02f;
                f14 = 0.0f;
            } else {
                f13 = 0.02f;
                i10 = i13;
                j11 = j14;
                f14 = bdVar3.c / j11;
            }
            if (f14 > 0.0f && f14 < f13) {
                i14++;
                f16 += f14;
            }
            i13 = i10 + 1;
            j14 = j11;
        }
        long j15 = j14;
        Math.min(bdVarArr2.length, adVarArr3.length);
        int[] iArr = this.U;
        if (iArr == null || iArr.length != bdVarArr2.length) {
            this.U = new int[bdVarArr2.length];
        }
        float[] fArr2 = this.V;
        if (fArr2 == null || fArr2.length != bdVarArr2.length) {
            this.V = new float[bdVarArr2.length];
        }
        int i15 = 0;
        while (i15 < bdVarArr2.length) {
            float[] fArr3 = this.V;
            int i16 = i15;
            bd bdVar4 = bdVarArr2[i16];
            float f17 = f16;
            if (bdVar4 != null) {
                adVarArr = adVarArr3;
                if (bdVar4.b) {
                    fArr = fArr3;
                    f12 = bdVar4.c / j15;
                    fArr[i16] = f12;
                    i15 = i16 + 1;
                    f16 = f17;
                    adVarArr3 = adVarArr;
                }
            } else {
                adVarArr = adVarArr3;
            }
            fArr = fArr3;
            f12 = 0.0f;
            fArr[i16] = f12;
            i15 = i16 + 1;
            f16 = f17;
            adVarArr3 = adVarArr;
        }
        float f18 = f16;
        ad[] adVarArr4 = adVarArr3;
        AndroidUtilities.roundPercents(this.V, this.U);
        if (this.d == 0) {
            Arrays.sort(bdVarArr2, new org.telegram.ui.ActionBar.n4(15));
            int i17 = 0;
            while (true) {
                if (i17 > bdVarArr2.length) {
                    break;
                }
                bd bdVar5 = bdVarArr2[i17];
                if (bdVar5.a == bdVarArr2.length - 1) {
                    bd bdVar6 = bdVarArr2[0];
                    bdVarArr2[0] = bdVar5;
                    bdVarArr2[i17] = bdVar6;
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
        while (i18 < bdVarArr2.length) {
            bd bdVar7 = bdVarArr2[i18];
            int i20 = bdVar7.a;
            int i21 = i18;
            float f21 = !bdVar7.b ? 0.0f : bdVar7.c / j15;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            float f22 = f19;
            spannableStringBuilder.append((CharSequence) String.format("%d", Integer.valueOf(this.U[i20])));
            SpannableString spannableString3 = spannableString2;
            spannableStringBuilder.append((CharSequence) spannableString3);
            ad adVar4 = adVarArr4[i20];
            r6 r6Var5 = r6Var;
            r6 r6Var6 = r6Var2;
            float f23 = (((double) f21) <= 0.05d || f21 >= f15) ? 0.0f : f15;
            adVar4.g = f23;
            if (f21 >= 0.08f) {
                f7 = f21;
                if (this.U[i20] < 100) {
                    f10 = f15;
                    adVar4.i = f10;
                    adVar4.l = f15;
                    if (z10) {
                        h6 h6Var3 = adVar4.h;
                        z12 = true;
                        h6Var3.d(f23, true);
                        ad adVar5 = adVarArr4[i20];
                        adVar5.j.d(adVar5.i, true);
                        ad adVar6 = adVarArr4[i20];
                        adVar6.m.d(adVar6.l, true);
                    } else {
                        z12 = true;
                    }
                    adVar = adVarArr4[i20];
                    if (adVar.g > 0.0f) {
                        adVar.k.t(spannableStringBuilder, z10, z12);
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
                        ad adVar7 = adVarArr4[i20];
                        adVar7.c = (f24 + f25) / 2.0f;
                        adVar7.d = Math.abs(f25 - f24) / 2.0f;
                        ad adVar8 = adVarArr4[i20];
                        adVar8.g = 0.0f;
                        if (!z10) {
                            adVar8.e.d(adVar8.c, true);
                            ad adVar9 = adVarArr4[i20];
                            adVar9.f.d(adVar9.d, true);
                            ad adVar10 = adVarArr4[i20];
                            adVar10.h.d(adVar10.g, true);
                        }
                    } else {
                        ad adVar11 = adVarArr4[i20];
                        adVar11.c = (f24 + f25) / 2.0f;
                        adVar11.d = Math.abs(f25 - f24) / 2.0f;
                        if (!z10) {
                            ad adVar12 = adVarArr4[i20];
                            adVar12.e.d(adVar12.c, true);
                            ad adVar13 = adVarArr4[i20];
                            adVar13.f.d(adVar13.d, true);
                        }
                        f20 += f11;
                        i19++;
                    }
                    i18 = i21 + 1;
                    bdVarArr2 = bdVarArr;
                    r6Var2 = r6Var6;
                    r6Var = r6Var5;
                    f19 = f22;
                    spannableString2 = spannableString3;
                }
            } else {
                f7 = f21;
            }
            f10 = 0.85f;
            adVar4.i = f10;
            adVar4.l = f15;
            if (z10) {
            }
            adVar = adVarArr4[i20];
            if (adVar.g > 0.0f) {
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
            bdVarArr2 = bdVarArr;
            r6Var2 = r6Var6;
            r6Var = r6Var5;
            f19 = f22;
            spannableString2 = spannableString3;
        }
        r6 r6Var7 = r6Var;
        r6 r6Var8 = r6Var2;
        String[] split = AndroidUtilities.formatFileSize(j15, true, true).split(" ");
        String str = split.length > 0 ? split[0] : "";
        if (str.length() >= 4 && j15 < 1073741824) {
            str = str.split("\\.")[0];
        }
        r6Var4.t(str, z10, true);
        r6Var3.t(split.length > 1 ? split[1] : "", z10, true);
        if (h6Var2.c > 0.0f) {
            r6Var8.t(r6Var4.i, z10, true);
            r6Var7.t(r6Var3.i, z10, true);
        }
        this.r = false;
        if (!z10) {
            h6Var2.d(0.0f, true);
        }
        invalidate();
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.S = true;
        int i10 = 0;
        while (true) {
            ad[] adVarArr = this.v;
            if (i10 >= adVarArr.length) {
                return;
            }
            ad adVar = adVarArr[i10];
            if (adVar.b == null) {
                boolean z10 = this.e;
                int[] iArr = this.f;
                if (z10) {
                    adVar.b = SvgHelper.getBitmap(iArr[i10], AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), -1);
                } else {
                    adVar.b = BitmapFactory.decodeResource(getContext().getResources(), iArr[i10]);
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
            ad[] adVarArr = this.v;
            if (i10 >= adVarArr.length) {
                return;
            }
            Bitmap bitmap = adVarArr[i10].b;
            if (bitmap != null) {
                bitmap.recycle();
                adVarArr[i10].b = null;
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
        Matrix matrix = this.K;
        matrix.reset();
        matrix.setTranslate(rectF.left, 0.0f);
        this.I.setLocalMatrix(matrix);
        Matrix matrix2 = this.L;
        matrix2.reset();
        matrix2.setTranslate(rectF.left, -rectF.centerY());
        this.J.setLocalMatrix(matrix2);
        tg.w1 w1Var = this.Q;
        if (w1Var != null) {
            w1Var.a.set(0.0f, 0.0f, AndroidUtilities.dp(140.0f), AndroidUtilities.dp(140.0f));
            this.Q.a.offset((getMeasuredWidth() - this.Q.a.width()) / 2.0f, (getMeasuredHeight() - this.Q.a.height()) / 2.0f);
            this.Q.b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            this.Q.f();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(dp, TLObject.FLAG_30));
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
            ad[] adVarArr = this.v;
            if (i11 >= adVarArr.length) {
                this.T = i10;
                invalidate();
                return;
            }
            if (i10 == i11 && adVarArr[i11].d <= 0.0f) {
                i10 = -1;
            }
            adVarArr[i11].n = i10 == i11;
            i11++;
        }
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final void updateColors() {
        try {
            this.y.setColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.i6, false));
            try {
                r6 r6Var = this.M;
                if (r6Var != null) {
                    r6Var.u(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.G6, false));
                }
                r6 r6Var2 = this.N;
                if (r6Var2 != null) {
                    r6Var2.u(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.y6, false));
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
            invalidate();
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
