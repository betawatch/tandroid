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

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public abstract class ed extends View {
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
    public final p6 M;
    public final p6 N;
    public final p6 O;
    public final p6 P;
    public sg.y1 Q;
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
    public final e6 n;
    public boolean r;
    public final e6 s;
    public final cd[] v;
    public final float[] w;
    public final RectF x;
    public final Paint y;

    static {
        int i10 = org.telegram.ui.ActionBar.j6.lj;
        int i11 = org.telegram.ui.ActionBar.j6.hj;
        int i12 = org.telegram.ui.ActionBar.j6.ij;
        int i13 = org.telegram.ui.ActionBar.j6.pj;
        int i14 = org.telegram.ui.ActionBar.j6.mj;
        int i15 = org.telegram.ui.ActionBar.j6.jj;
        int i16 = org.telegram.ui.ActionBar.j6.nj;
        int i17 = org.telegram.ui.ActionBar.j6.qj;
        int i18 = org.telegram.ui.ActionBar.j6.kj;
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

    public ed(Context context, int i10, int[] iArr, int i11, int[] iArr2) {
        super(context);
        this.a = new RectF();
        this.b = new RectF();
        this.c = new RectF();
        this.h = true;
        pr prVar = pr.h;
        this.n = new e6(this, 750L, prVar);
        this.r = false;
        this.s = new e6(this, 650L, prVar);
        this.w = new float[2];
        this.x = new RectF();
        Paint paint = new Paint(1);
        this.y = paint;
        this.F = new Path();
        Paint paint2 = new Paint(1);
        this.G = paint2;
        Paint paint3 = new Paint(1);
        this.H = paint3;
        p6 p6Var = new p6(false, true, true, false);
        this.M = p6Var;
        p6 p6Var2 = new p6(false, true, true, false);
        this.N = p6Var2;
        p6 p6Var3 = new p6(false, true, true, false);
        this.O = p6Var3;
        p6 p6Var4 = new p6(false, true, true, false);
        this.P = p6Var4;
        this.R = true;
        this.T = -1;
        setLayerType(2, null);
        this.f = iArr2;
        this.d = i11;
        this.e = i11 == 0;
        this.v = new cd[i10];
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.i6, false));
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
        p6Var.k(0.2f, 450L, prVar);
        p6Var.v = 0.6f;
        p6Var.r(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false));
        p6Var.u(AndroidUtilities.bold());
        p6Var.t(AndroidUtilities.dp(32.0f));
        p6Var.b = 17;
        p6Var2.k(0.6f, 450L, prVar);
        p6Var2.v = 0.6f;
        p6Var2.r(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.y6, false));
        p6Var2.t(AndroidUtilities.dp(12.0f));
        p6Var2.b = 17;
        p6Var3.k(0.2f, 450L, prVar);
        p6Var3.v = 0.6f;
        p6Var3.a.setShader(linearGradient2);
        p6Var3.u(AndroidUtilities.bold());
        p6Var3.t(AndroidUtilities.dp(32.0f));
        p6Var3.b = 17;
        p6Var4.k(0.6f, 450L, prVar);
        p6Var4.v = 0.6f;
        p6Var4.a.setShader(linearGradient2);
        p6Var4.u(AndroidUtilities.bold());
        p6Var4.t(AndroidUtilities.dp(12.0f));
        p6Var4.b = 17;
        int i12 = 0;
        while (true) {
            cd[] cdVarArr = this.v;
            if (i12 >= cdVarArr.length) {
                return;
            }
            cd cdVar = new cd(this);
            cdVarArr[i12] = cdVar;
            int v = org.telegram.ui.ActionBar.j6.v(org.telegram.ui.ActionBar.j6.w0(null, iArr[i12], false), ConnectionsManager.FileTypeAudio);
            int v9 = org.telegram.ui.ActionBar.j6.v(org.telegram.ui.ActionBar.j6.w0(null, iArr[i12], false), 822083583);
            AndroidUtilities.dp(50.0f);
            RadialGradient radialGradient = new RadialGradient(0.0f, 0.0f, AndroidUtilities.dp(86.0f), new int[]{v9, v}, new float[]{0.3f, 1.0f}, Shader.TileMode.CLAMP);
            cdVar.v = radialGradient;
            Matrix matrix = new Matrix();
            cdVar.w = matrix;
            radialGradient.setLocalMatrix(matrix);
            cdVar.q.setShader(cdVar.v);
            i12++;
        }
    }

    public static float a(float f7) {
        return (float) ((f7 / 180.0f) * 3.141592653589793d);
    }

    public static boolean b(Canvas canvas, p6 p6Var, float f7, float f10, float f11, float f12) {
        if (f12 <= 0.0f) {
            return false;
        }
        p6Var.w = (int) (f12 * 255.0f);
        p6Var.setBounds(0, 0, 0, 0);
        canvas.save();
        canvas.translate(f7, f10);
        canvas.scale(f11, f11);
        p6Var.draw(canvas);
        canvas.restore();
        return p6Var.f();
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
        float f7;
        char c10;
        float f10;
        float f11;
        char c11;
        boolean z10;
        RectF rectF;
        float f12;
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
        int i10;
        float f20;
        RectF rectF5;
        boolean z12;
        float f21;
        float f22;
        p6 p6Var;
        float f23;
        float f24;
        float f25;
        RectF rectF6;
        cd cdVar;
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
        boolean z13 = this.h;
        if (!z13 && d0 == null) {
            d0 = Long.valueOf(System.currentTimeMillis());
        } else if (z13 && d0 != null) {
            d0 = null;
        }
        float currentTimeMillis = ((d0 == null ? System.currentTimeMillis() : r9.longValue()) - c0.longValue()) * 0.6f;
        float[] fArr2 = this.w;
        sp.a(fArr2, currentTimeMillis % 5400.0f);
        float f26 = fArr2[0];
        float f27 = fArr2[1];
        if (d > 0.0f) {
            c10 = 1;
            Paint paint = this.y;
            paint.setStrokeWidth(lerp2);
            f10 = 1.0f;
            int alpha = paint.getAlpha();
            f11 = 0.0f;
            paint.setAlpha((int) (alpha * d));
            c11 = 0;
            f7 = d10;
            canvas2.drawCircle(rectF7.centerX(), rectF7.centerY(), (rectF7.width() - lerp2) / 2.0f, paint);
            paint.setAlpha(alpha);
        } else {
            f7 = d10;
            c10 = 1;
            f10 = 1.0f;
            f11 = 0.0f;
            c11 = 0;
        }
        boolean z14 = d > 0.0f || f7 > f11;
        int i11 = 0;
        while (true) {
            cd[] cdVarArr = this.v;
            if (i11 >= cdVarArr.length) {
                break;
            }
            cd cdVar2 = cdVarArr[i11];
            sp.a(fArr2, (currentTimeMillis + (i11 * 80)) % 5400.0f);
            float min = Math.min(Math.max(fArr2[c11], f26), f27);
            float min2 = Math.min(Math.max(fArr2[c10], f26), f27);
            if (d < f10 || min < min2) {
                RectF rectF10 = rectF8;
                float f28 = (min + min2) / 2.0f;
                float abs = Math.abs(min2 - min) / 2.0f;
                if (d <= f11) {
                    f12 = 360.0f;
                    float d11 = cdVar2.e.d(cdVar2.c, false);
                    abs = cdVar2.f.d(cdVar2.d, false);
                    rectF2 = rectF9;
                    f13 = lerp2;
                    f28 = d11;
                } else {
                    f12 = 360.0f;
                    rectF2 = rectF9;
                    if (d < f10) {
                        f13 = lerp2;
                        f28 = AndroidUtilities.lerp((((float) Math.floor(f27 / 360.0f)) * 360.0f) + cdVar2.e.d(cdVar2.c, false), f28, d);
                        abs = AndroidUtilities.lerp(cdVar2.f.d(cdVar2.d, false), abs, d);
                    } else {
                        f13 = lerp2;
                    }
                }
                boolean z15 = cdVar2.e.i || cdVar2.f.i || z14;
                float f29 = f10 - f7;
                float f30 = f10 - d;
                p6 p6Var2 = cdVar2.k;
                f14 = d;
                Path path = cdVar2.p;
                Paint paint2 = cdVar2.s;
                Paint paint3 = cdVar2.q;
                f15 = lerp3;
                RectF rectF11 = cdVar2.E.x;
                RectF rectF12 = cdVar2.u;
                f16 = f26;
                fArr = fArr2;
                float d12 = cdVar2.o.d(cdVar2.n ? 1.0f : 0.0f, false);
                rectF12.set(rectF7);
                rectF12.inset((-AndroidUtilities.dp(9.0f)) * d12, d12 * (-AndroidUtilities.dp(9.0f)));
                float width = (float) ((((rectF2.width() + rectF12.width()) * Math.cos(a(f28))) / 4.0d) + rectF12.centerX());
                rectF3 = rectF7;
                float width2 = (float) ((((rectF2.width() + rectF12.width()) * Math.sin(a(f28))) / 4.0d) + rectF12.centerY());
                float d13 = cdVar2.h.d(cdVar2.g, false) * f29 * f30;
                float d14 = cdVar2.m.d(cdVar2.l, false);
                paint3.setAlpha((int) (f29 * 255.0f));
                if (abs * 2.0f >= 359.0f) {
                    canvas2.saveLayerAlpha(rectF12, 255, 31);
                    canvas2.drawCircle(rectF12.centerX(), rectF12.centerY(), rectF12.width() / 2.0f, paint2);
                    canvas2.drawRect(rectF12, paint3);
                    f22 = d13;
                    f17 = f27;
                    cdVar2.a(canvas, rectF12.centerX(), rectF12.centerY(), width, width2, 0.0f, 359.0f, rectF2.width() / 2.0f, rectF12.width() / 2.0f, f22, Math.max(0.0f, (f30 / 0.75f) - 0.75f) * d14);
                    cdVar = cdVar2;
                    canvas2 = canvas;
                    canvas2.drawCircle(rectF2.centerX(), rectF2.centerY(), rectF2.width() / 2.0f, cdVar.t);
                    canvas2.restore();
                    i10 = i11;
                    rectF4 = rectF10;
                    z12 = z15;
                    f21 = f7;
                    rectF6 = rectF11;
                    p6Var = p6Var2;
                    f23 = width;
                    f24 = width2;
                    f25 = 0.0f;
                } else {
                    rectF4 = rectF10;
                    f17 = f27;
                    float min3 = Math.min(Math.min(f15, (rectF12.width() - rectF2.width()) / 4.0f), (float) ((rectF2.width() / 2.0f) * (abs / 180.0f) * 3.141592653589793d));
                    float width3 = (rectF12.width() - rectF2.width()) / 2.0f;
                    if (cdVar2.x == f28 && cdVar2.y == abs && cdVar2.z == min3 && cdVar2.A == width3 && cdVar2.B == rectF12.width() && cdVar2.C == rectF12.centerX() && cdVar2.D == rectF12.centerY()) {
                        f18 = f28;
                    } else {
                        cdVar2.x = f28;
                        cdVar2.y = abs;
                        cdVar2.z = min3;
                        cdVar2.A = width3;
                        cdVar2.B = rectF12.width();
                        cdVar2.C = rectF12.centerX();
                        cdVar2.D = rectF12.centerY();
                        float f31 = f28 - abs;
                        float f32 = f28 + abs;
                        boolean z16 = min3 > 0.0f;
                        float f33 = min3 * 2.0f;
                        f18 = f28;
                        float width4 = (min3 / ((float) ((rectF12.width() - f33) * 3.141592653589793d))) * f12;
                        float width5 = ((abs > 175.0f ? 0 : 1) * 0.5f) + ((min3 / ((float) ((rectF2.width() + f33) * 3.141592653589793d))) * f12);
                        float width6 = (rectF12.width() / 2.0f) - min3;
                        float width7 = (rectF2.width() / 2.0f) + min3;
                        path.rewind();
                        float f34 = f32 - f31;
                        if (f34 >= 0.5f) {
                            if (z16) {
                                f19 = f32;
                                double d15 = width6;
                                float f35 = f31 + width4;
                                double e7 = i2.g.e(a(f35), d15, rectF12.centerX());
                                z11 = z16;
                                i10 = i11;
                                f20 = abs;
                                double sin = (Math.sin(a(f35)) * d15) + rectF12.centerY();
                                float f36 = (float) e7;
                                float f37 = (float) sin;
                                rectF11.set(f36 - min3, f37 - min3, f36 + min3, f37 + min3);
                                path.arcTo(rectF11, f35 - 90.0f, 90.0f);
                            } else {
                                f19 = f32;
                                z11 = z16;
                                i10 = i11;
                                f20 = abs;
                            }
                            path.arcTo(rectF12, f31 + width4, f34 - (width4 * 2.0f));
                            if (z11) {
                                double d16 = width6;
                                float e10 = (float) i2.g.e(a(r4), d16, rectF12.centerX());
                                float sin2 = (float) ((Math.sin(a(r4)) * d16) + rectF12.centerY());
                                rectF11.set(e10 - min3, sin2 - min3, e10 + min3, sin2 + min3);
                                path.arcTo(rectF11, f19 - width4, 90.0f);
                                double d17 = width7;
                                float e11 = (float) i2.g.e(a(r4), d17, rectF2.centerX());
                                float sin3 = (float) ((Math.sin(a(r4)) * d17) + rectF2.centerY());
                                rectF11.set(e11 - min3, sin3 - min3, e11 + min3, sin3 + min3);
                                path.arcTo(rectF11, (f19 - width5) + 90.0f, 90.0f);
                            }
                            rectF5 = rectF2;
                            path.arcTo(rectF5, f19 - width5, -(f34 - (width5 * 2.0f)));
                            if (z11) {
                                double d18 = width7;
                                float f38 = f31 + width5;
                                double e12 = i2.g.e(a(f38), d18, rectF5.centerX());
                                double sin4 = (Math.sin(a(f38)) * d18) + rectF5.centerY();
                                float f39 = (float) e12;
                                float f40 = (float) sin4;
                                rectF11.set(f39 - min3, f40 - min3, f39 + min3, f40 + min3);
                                path.arcTo(rectF11, f38 + 180.0f, 90.0f);
                            }
                            path.close();
                            path.computeBounds(cdVar2.r, false);
                            float centerX = rectF12.centerX();
                            float centerY = rectF3.centerY();
                            rectF12.width();
                            cdVar2.w.reset();
                            cdVar2.w.setTranslate(centerX, centerY);
                            cdVar2.v.setLocalMatrix(cdVar2.w);
                            canvas2.saveLayerAlpha(rectF12, 255, 31);
                            canvas2.drawPath(path, paint2);
                            canvas2.drawRect(rectF12, paint3);
                            rectF2 = rectF5;
                            z12 = z15;
                            f21 = f7;
                            f22 = d13;
                            p6Var = p6Var2;
                            f23 = width;
                            f24 = width2;
                            f25 = 0.0f;
                            rectF6 = rectF11;
                            cdVar2.a(canvas, rectF12.centerX(), rectF12.centerY(), f23, f24, f18 - f20, f18 + f20, rectF5.width() / 2.0f, rectF12.width() / 2.0f, f22, Math.max(0.0f, (f30 / 0.75f) - 0.75f) * d14);
                            cdVar = cdVar2;
                            canvas2 = canvas;
                            canvas2.restore();
                        }
                    }
                    i10 = i11;
                    f20 = abs;
                    rectF5 = rectF2;
                    float centerX2 = rectF12.centerX();
                    float centerY2 = rectF3.centerY();
                    rectF12.width();
                    cdVar2.w.reset();
                    cdVar2.w.setTranslate(centerX2, centerY2);
                    cdVar2.v.setLocalMatrix(cdVar2.w);
                    canvas2.saveLayerAlpha(rectF12, 255, 31);
                    canvas2.drawPath(path, paint2);
                    canvas2.drawRect(rectF12, paint3);
                    rectF2 = rectF5;
                    z12 = z15;
                    f21 = f7;
                    f22 = d13;
                    p6Var = p6Var2;
                    f23 = width;
                    f24 = width2;
                    f25 = 0.0f;
                    rectF6 = rectF11;
                    cdVar2.a(canvas, rectF12.centerX(), rectF12.centerY(), f23, f24, f18 - f20, f18 + f20, rectF5.width() / 2.0f, rectF12.width() / 2.0f, f22, Math.max(0.0f, (f30 / 0.75f) - 0.75f) * d14);
                    cdVar = cdVar2;
                    canvas2 = canvas;
                    canvas2.restore();
                }
                float d19 = cdVar.j.d(cdVar.i, false);
                rectF6.set(f23 - f25, f24 - f25, f23 + f25, f24 + f25);
                if (d19 != f10) {
                    canvas2.save();
                    canvas2.scale(d19, d19, rectF6.centerX(), rectF6.centerY());
                }
                p6Var.w = (int) (f22 * 255.0f);
                p6Var.setBounds((int) rectF6.left, (int) rectF6.top, (int) rectF6.right, (int) rectF6.bottom);
                p6Var.draw(canvas2);
                if (d19 != f10) {
                    canvas2.restore();
                }
                z14 = z12;
            } else {
                f14 = d;
                rectF3 = rectF7;
                rectF4 = rectF8;
                rectF2 = rectF9;
                f13 = lerp2;
                f15 = lerp3;
                f16 = f26;
                fArr = fArr2;
                f17 = f27;
                i10 = i11;
                f21 = f7;
            }
            i11 = i10 + 1;
            f7 = f21;
            f27 = f17;
            rectF9 = rectF2;
            lerp2 = f13;
            d = f14;
            lerp3 = f15;
            f26 = f16;
            fArr2 = fArr;
            rectF7 = rectF3;
            rectF8 = rectF4;
            c10 = 1;
            f11 = 0.0f;
            c11 = 0;
        }
        float f41 = d;
        RectF rectF13 = rectF7;
        RectF rectF14 = rectF8;
        float f42 = lerp2;
        float f43 = f7;
        p6 p6Var3 = this.N;
        p6 p6Var4 = this.M;
        int i12 = this.d;
        if (i12 == 0) {
            float f44 = (f10 - f43) * (f10 - f41);
            if (b(canvas2, p6Var4, rectF13.centerX(), rectF13.centerY() - AndroidUtilities.dpf2(5.0f), 1.0f, f44) || z14) {
            }
            b(canvas, p6Var3, rectF13.centerX(), AndroidUtilities.dpf2(22.0f) + rectF13.centerY(), 1.0f, f44);
            z10 = true;
        } else {
            z10 = true;
            if (i12 == 1) {
                float f45 = f10 - f41;
                float centerX3 = rectF13.centerX() - AndroidUtilities.lerp(0.0f, AndroidUtilities.dpf2(4.0f), f43);
                float centerY3 = rectF13.centerY() - AndroidUtilities.lerp(AndroidUtilities.dpf2(5.0f), 0.0f, f43);
                float lerp4 = AndroidUtilities.lerp(1.0f, 2.25f, f43);
                float f46 = f45 * f43;
                boolean z17 = b(canvas, this.O, centerX3, centerY3, lerp4, f46) || z14;
                float f47 = (1.0f - f43) * f45;
                boolean z18 = b(canvas, p6Var4, centerX3, centerY3, lerp4, f47) || z17;
                float lerp5 = AndroidUtilities.lerp(0.0f, AndroidUtilities.dpf2(26.0f), f43) + rectF13.centerX();
                float lerp6 = AndroidUtilities.lerp(AndroidUtilities.dpf2(22.0f), -AndroidUtilities.dpf2(18.0f), f43) + rectF13.centerY();
                float lerp7 = AndroidUtilities.lerp(1.0f, 1.4f, f43);
                if (b(canvas, this.P, lerp5, lerp6, lerp7, f46) || z18) {
                }
                b(canvas, p6Var3, lerp5, lerp6, lerp7, f47);
            }
        }
        if (f43 > 0.0f) {
            if (this.Q == null) {
                sg.y1 y1Var = new sg.y1(25);
                this.Q = y1Var;
                y1Var.N = 100;
                y1Var.M = z10;
                y1Var.G = z10;
                y1Var.K = false;
                y1Var.H = z10;
                y1Var.r = 18;
                y1Var.B = false;
                y1Var.j = AndroidUtilities.dp(80.0f);
                sg.y1 y1Var2 = this.Q;
                y1Var2.w = 0.85f;
                y1Var2.v = 0.85f;
                y1Var2.u = 0.85f;
                y1Var2.c();
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
            this.Q.e(canvas, f43);
            int i13 = (int) (f43 * 255.0f);
            Paint paint4 = this.H;
            paint4.setAlpha(i13);
            canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint4);
            canvas.restore();
            Paint paint5 = this.G;
            paint5.setStrokeWidth(f42);
            paint5.setAlpha(i13);
            canvas.drawCircle(rectF13.centerX(), rectF13.centerY(), (rectF13.width() - f42) / 2.0f, paint5);
            RectF rectF16 = this.E;
            Path path2 = this.F;
            if (rectF16 == null || !rectF16.equals(rectF)) {
                if (this.E == null) {
                    this.E = new RectF();
                }
                this.E.set(rectF);
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
        if (this.S) {
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
        float x10 = motionEvent.getX();
        float y3 = motionEvent.getY();
        RectF rectF = this.b;
        float a2 = v7.z6.a(rectF.centerX(), rectF.centerY(), x10, y3);
        float atan2 = (float) ((Math.atan2(y3 - rectF.centerY(), x10 - rectF.centerX()) / 3.141592653589793d) * 180.0d);
        if (atan2 < 0.0f) {
            atan2 += 360.0f;
        }
        if (a2 > this.c.width() / 2.0f && a2 < (rectF.width() / 2.0f) + AndroidUtilities.dp(14.0f)) {
            i10 = 0;
            while (true) {
                cd[] cdVarArr = this.v;
                if (i10 >= cdVarArr.length) {
                    break;
                }
                cd cdVar = cdVarArr[i10];
                float f7 = cdVar.c;
                float f10 = cdVar.d;
                if (atan2 >= f7 - f10 && atan2 <= f7 + f10) {
                    break;
                }
                i10++;
            }
            if (motionEvent.getAction() != 0) {
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
    public final void f(long j3, boolean z10, dd... ddVarArr) {
        boolean z11;
        float f7;
        float f10;
        boolean z12;
        cd cdVar;
        float f11;
        cd[] cdVarArr;
        float[] fArr;
        float f12;
        int i10;
        long j10;
        float f13;
        float f14;
        boolean z13;
        long j11;
        boolean z14;
        dd[] ddVarArr2 = ddVarArr;
        e6 e6Var = this.n;
        e6 e6Var2 = this.s;
        p6 p6Var = this.P;
        p6 p6Var2 = this.O;
        p6 p6Var3 = this.N;
        p6 p6Var4 = this.M;
        cd[] cdVarArr2 = this.v;
        float f15 = 1.0f;
        if (ddVarArr2 == null || ddVarArr2.length == 0) {
            this.h = false;
            this.r = j3 == 0;
            if (z10) {
                z11 = true;
            } else {
                z11 = true;
                e6Var.d(0.0f, true);
                e6Var2.d(this.r ? 1.0f : 0.0f, true);
            }
            p6Var2.q(p6Var4.g, false, z11);
            p6Var4.q("0", z10, z11);
            p6Var2.q("0", z10, z11);
            p6Var.q(p6Var3.g, false, z11);
            p6Var3.q("KB", z10, z11);
            p6Var.q("KB", z10, z11);
            for (cd cdVar2 : cdVarArr2) {
                cdVar2.g = 0.0f;
                if (!z10) {
                    cdVar2.h.d(0.0f, z11);
                }
            }
            invalidate();
            return;
        }
        this.h = false;
        if (!z10) {
            e6Var.d(0.0f, true);
        }
        SpannableString spannableString = new SpannableString("%");
        int length = ddVarArr2.length;
        SpannableString spannableString2 = spannableString;
        long j12 = 0;
        int i11 = 0;
        while (i11 < ddVarArr2.length) {
            if (ddVarArr2[i11] == null) {
                dd ddVar = new dd();
                ddVarArr2[i11] = ddVar;
                j11 = j12;
                ddVar.c = 0L;
            } else {
                j11 = j12;
            }
            dd ddVar2 = ddVarArr2[i11];
            ddVar2.a = i11;
            boolean z15 = ddVar2.b;
            if (z15) {
                z14 = z15;
                j11 += ddVar2.c;
            } else {
                z14 = z15;
            }
            if (ddVar2.c <= 0 || !z14) {
                length--;
            }
            i11++;
            j12 = j11;
        }
        long j13 = j12;
        if (j13 <= 0) {
            this.h = false;
            this.r = j3 <= 0;
            if (z10) {
                z13 = true;
            } else {
                z13 = true;
                e6Var.d(0.0f, true);
                e6Var2.d(this.r ? 1.0f : 0.0f, true);
            }
            p6Var2.q(p6Var4.g, false, z13);
            p6Var4.q("0", z10, z13);
            p6Var2.q("0", z10, z13);
            p6Var.q(p6Var3.g, false, z13);
            p6Var3.q("KB", z10, z13);
            p6Var.q("KB", z10, z13);
            int i12 = 0;
            while (i12 < cdVarArr2.length) {
                cd cdVar3 = cdVarArr2[i12];
                cdVar3.g = 0.0f;
                if (!z10) {
                    cdVar3.h.d(0.0f, z13);
                }
                i12++;
                z13 = true;
            }
            invalidate();
            return;
        }
        cd[] cdVarArr3 = cdVarArr2;
        int i13 = 0;
        int i14 = 0;
        float f16 = 0.0f;
        while (i13 < ddVarArr2.length) {
            dd ddVar3 = ddVarArr2[i13];
            if (ddVar3 == null || !ddVar3.b) {
                i10 = i13;
                j10 = j13;
                f13 = 0.02f;
                f14 = 0.0f;
            } else {
                f13 = 0.02f;
                i10 = i13;
                j10 = j13;
                f14 = ddVar3.c / j10;
            }
            if (f14 > 0.0f && f14 < f13) {
                i14++;
                f16 += f14;
            }
            i13 = i10 + 1;
            j13 = j10;
        }
        long j14 = j13;
        Math.min(ddVarArr2.length, cdVarArr3.length);
        int[] iArr = this.U;
        if (iArr == null || iArr.length != ddVarArr2.length) {
            this.U = new int[ddVarArr2.length];
        }
        float[] fArr2 = this.V;
        if (fArr2 == null || fArr2.length != ddVarArr2.length) {
            this.V = new float[ddVarArr2.length];
        }
        int i15 = 0;
        while (i15 < ddVarArr2.length) {
            float[] fArr3 = this.V;
            int i16 = i15;
            dd ddVar4 = ddVarArr2[i16];
            float f17 = f16;
            if (ddVar4 != null) {
                cdVarArr = cdVarArr3;
                if (ddVar4.b) {
                    fArr = fArr3;
                    f12 = ddVar4.c / j14;
                    fArr[i16] = f12;
                    i15 = i16 + 1;
                    f16 = f17;
                    cdVarArr3 = cdVarArr;
                }
            } else {
                cdVarArr = cdVarArr3;
            }
            fArr = fArr3;
            f12 = 0.0f;
            fArr[i16] = f12;
            i15 = i16 + 1;
            f16 = f17;
            cdVarArr3 = cdVarArr;
        }
        float f18 = f16;
        cd[] cdVarArr4 = cdVarArr3;
        AndroidUtilities.roundPercents(this.V, this.U);
        if (this.d == 0) {
            Arrays.sort(ddVarArr2, new org.telegram.ui.f6(10));
            int i17 = 0;
            while (true) {
                if (i17 > ddVarArr2.length) {
                    break;
                }
                dd ddVar5 = ddVarArr2[i17];
                if (ddVar5.a == ddVarArr2.length - 1) {
                    dd ddVar6 = ddVarArr2[0];
                    ddVarArr2[0] = ddVar5;
                    ddVarArr2[i17] = ddVar6;
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
        while (i18 < ddVarArr2.length) {
            dd ddVar7 = ddVarArr2[i18];
            int i20 = ddVar7.a;
            int i21 = i18;
            float f21 = !ddVar7.b ? 0.0f : ddVar7.c / j14;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            float f22 = f19;
            spannableStringBuilder.append((CharSequence) String.format("%d", Integer.valueOf(this.U[i20])));
            SpannableString spannableString3 = spannableString2;
            spannableStringBuilder.append((CharSequence) spannableString3);
            cd cdVar4 = cdVarArr4[i20];
            p6 p6Var5 = p6Var;
            p6 p6Var6 = p6Var2;
            float f23 = (((double) f21) <= 0.05d || f21 >= f15) ? 0.0f : 1.0f;
            cdVar4.g = f23;
            if (f21 >= 0.08f) {
                f7 = f21;
                if (this.U[i20] < 100) {
                    f10 = 1.0f;
                    cdVar4.i = f10;
                    cdVar4.l = 1.0f;
                    if (z10) {
                        e6 e6Var3 = cdVar4.h;
                        z12 = true;
                        e6Var3.d(f23, true);
                        cd cdVar5 = cdVarArr4[i20];
                        cdVar5.j.d(cdVar5.i, true);
                        cd cdVar6 = cdVarArr4[i20];
                        cdVar6.m.d(cdVar6.l, true);
                    } else {
                        z12 = true;
                    }
                    cdVar = cdVarArr4[i20];
                    if (cdVar.g > 0.0f) {
                        cdVar.k.q(spannableStringBuilder, z10, z12);
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
                        cd cdVar7 = cdVarArr4[i20];
                        cdVar7.c = (f24 + f25) / 2.0f;
                        cdVar7.d = Math.abs(f25 - f24) / 2.0f;
                        cd cdVar8 = cdVarArr4[i20];
                        cdVar8.g = 0.0f;
                        if (!z10) {
                            cdVar8.e.d(cdVar8.c, true);
                            cd cdVar9 = cdVarArr4[i20];
                            cdVar9.f.d(cdVar9.d, true);
                            cd cdVar10 = cdVarArr4[i20];
                            cdVar10.h.d(cdVar10.g, true);
                        }
                    } else {
                        cd cdVar11 = cdVarArr4[i20];
                        cdVar11.c = (f24 + f25) / 2.0f;
                        cdVar11.d = Math.abs(f25 - f24) / 2.0f;
                        if (!z10) {
                            cd cdVar12 = cdVarArr4[i20];
                            cdVar12.e.d(cdVar12.c, true);
                            cd cdVar13 = cdVarArr4[i20];
                            cdVar13.f.d(cdVar13.d, true);
                        }
                        f20 += f11;
                        i19++;
                    }
                    i18 = i21 + 1;
                    ddVarArr2 = ddVarArr;
                    p6Var2 = p6Var6;
                    p6Var = p6Var5;
                    f19 = f22;
                    spannableString2 = spannableString3;
                }
            } else {
                f7 = f21;
            }
            f10 = 0.85f;
            cdVar4.i = f10;
            cdVar4.l = 1.0f;
            if (z10) {
            }
            cdVar = cdVarArr4[i20];
            if (cdVar.g > 0.0f) {
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
            ddVarArr2 = ddVarArr;
            p6Var2 = p6Var6;
            p6Var = p6Var5;
            f19 = f22;
            spannableString2 = spannableString3;
        }
        p6 p6Var7 = p6Var;
        p6 p6Var8 = p6Var2;
        String[] split = AndroidUtilities.formatFileSize(j14, true, true).split(" ");
        String str = split.length > 0 ? split[0] : "";
        if (str.length() >= 4 && j14 < 1073741824) {
            str = str.split("\\.")[0];
        }
        p6Var4.q(str, z10, true);
        p6Var3.q(split.length > 1 ? split[1] : "", z10, true);
        if (e6Var2.c > 0.0f) {
            p6Var8.q(p6Var4.g, z10, true);
            p6Var7.q(p6Var3.g, z10, true);
        }
        this.r = false;
        if (!z10) {
            e6Var2.d(0.0f, true);
        }
        invalidate();
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.S = true;
        int i10 = 0;
        while (true) {
            cd[] cdVarArr = this.v;
            if (i10 >= cdVarArr.length) {
                return;
            }
            cd cdVar = cdVarArr[i10];
            if (cdVar.b == null) {
                boolean z10 = this.e;
                int[] iArr = this.f;
                if (z10) {
                    cdVar.b = SvgHelper.getBitmap(iArr[i10], AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), -1);
                } else {
                    cdVar.b = BitmapFactory.decodeResource(getContext().getResources(), iArr[i10]);
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
            cd[] cdVarArr = this.v;
            if (i10 >= cdVarArr.length) {
                return;
            }
            Bitmap bitmap = cdVarArr[i10].b;
            if (bitmap != null) {
                bitmap.recycle();
                cdVarArr[i10].b = null;
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
        sg.y1 y1Var = this.Q;
        if (y1Var != null) {
            y1Var.a.set(0.0f, 0.0f, AndroidUtilities.dp(140.0f), AndroidUtilities.dp(140.0f));
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
            cd[] cdVarArr = this.v;
            if (i11 >= cdVarArr.length) {
                this.T = i10;
                invalidate();
                return;
            }
            if (i10 == i11 && cdVarArr[i11].d <= 0.0f) {
                i10 = -1;
            }
            cdVarArr[i11].n = i10 == i11;
            i11++;
        }
    }
}
