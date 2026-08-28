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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public abstract class uc extends View {
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
    public zf.v1 M;
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
    public final sc[] v;
    public final float[] w;
    public final RectF x;
    public final Paint y;

    static {
        int i9 = org.telegram.ui.ActionBar.f6.lj;
        int i10 = org.telegram.ui.ActionBar.f6.hj;
        int i11 = org.telegram.ui.ActionBar.f6.ij;
        int i12 = org.telegram.ui.ActionBar.f6.pj;
        int i13 = org.telegram.ui.ActionBar.f6.mj;
        int i14 = org.telegram.ui.ActionBar.f6.jj;
        int i15 = org.telegram.ui.ActionBar.f6.nj;
        int i16 = org.telegram.ui.ActionBar.f6.qj;
        int i17 = org.telegram.ui.ActionBar.f6.kj;
        S = new int[]{i9, i10, i11, i12, i13, i14, i15, i16, i12, i17, i17};
        int i18 = R.raw.cache_photos;
        int i19 = R.raw.cache_videos;
        int i20 = R.raw.cache_documents;
        int i21 = R.raw.cache_music;
        int i22 = R.raw.cache_stickers;
        int i23 = R.raw.cache_profile_photos;
        int i24 = R.raw.cache_other;
        T = new int[]{i18, i19, i20, i21, i19, i21, i22, i23, i24, i24, i20};
        U = -1L;
    }

    public uc(Context context, int i9, int[] iArr, int i10, int[] iArr2) {
        super(context);
        this.a = new RectF();
        this.b = new RectF();
        this.c = new RectF();
        this.h = true;
        gr grVar = gr.h;
        this.n = new y5(this, 750L, grVar);
        this.r = false;
        this.s = new y5(this, 650L, grVar);
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
        this.d = i10;
        this.e = i10 == 0;
        this.v = new sc[i9];
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.i6, false));
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
        i6Var.k(0.2f, 450L, grVar);
        i6Var.v = 0.6f;
        i6Var.r(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.G6, false));
        i6Var.u(AndroidUtilities.bold());
        i6Var.t(AndroidUtilities.dp(32.0f));
        i6Var.b = 17;
        i6Var2.k(0.6f, 450L, grVar);
        i6Var2.v = 0.6f;
        i6Var2.r(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.y6, false));
        i6Var2.t(AndroidUtilities.dp(12.0f));
        i6Var2.b = 17;
        i6Var3.k(0.2f, 450L, grVar);
        i6Var3.v = 0.6f;
        i6Var3.a.setShader(linearGradient2);
        i6Var3.u(AndroidUtilities.bold());
        i6Var3.t(AndroidUtilities.dp(32.0f));
        i6Var3.b = 17;
        i6Var4.k(0.6f, 450L, grVar);
        i6Var4.v = 0.6f;
        i6Var4.a.setShader(linearGradient2);
        i6Var4.u(AndroidUtilities.bold());
        i6Var4.t(AndroidUtilities.dp(12.0f));
        i6Var4.b = 17;
        int i11 = 0;
        while (true) {
            sc[] scVarArr = this.v;
            if (i11 >= scVarArr.length) {
                return;
            }
            sc scVar = new sc(this);
            scVarArr[i11] = scVar;
            int v = org.telegram.ui.ActionBar.f6.v(org.telegram.ui.ActionBar.f6.w0(null, iArr[i11], false), ConnectionsManager.FileTypeAudio);
            int v4 = org.telegram.ui.ActionBar.f6.v(org.telegram.ui.ActionBar.f6.w0(null, iArr[i11], false), 822083583);
            AndroidUtilities.dp(50.0f);
            RadialGradient radialGradient = new RadialGradient(0.0f, 0.0f, AndroidUtilities.dp(86.0f), new int[]{v4, v}, new float[]{0.3f, 1.0f}, Shader.TileMode.CLAMP);
            scVar.v = radialGradient;
            Matrix matrix = new Matrix();
            scVar.w = matrix;
            radialGradient.setLocalMatrix(matrix);
            scVar.q.setShader(scVar.v);
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

    public abstract void d(int i9, boolean z10);

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
        int i9;
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
        sc scVar;
        Canvas canvas2 = canvas;
        float d = this.n.d(this.h ? 1.0f : 0.0f, false);
        float d9 = this.s.d(this.r ? 1.0f : 0.0f, false);
        RectF rectF7 = this.b;
        RectF rectF8 = this.a;
        rectF7.set(rectF8);
        float lerp = AndroidUtilities.lerp(0.0f, AndroidUtilities.dpf2(e()), d9);
        rectF7.inset(lerp, lerp);
        RectF rectF9 = this.c;
        rectF9.set(rectF7);
        float lerp2 = AndroidUtilities.lerp(AndroidUtilities.dpf2(38.0f), AndroidUtilities.dpf2(10.0f), Math.max(d, d9));
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
        jp.a(fArr2, currentTimeMillis % 5400.0f);
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
            f10 = d9;
            canvas2.drawCircle(rectF7.centerX(), rectF7.centerY(), (rectF7.width() - lerp2) / 2.0f, paint);
            paint.setAlpha(alpha);
        } else {
            f10 = d9;
            c10 = 1;
            f11 = 1.0f;
            f12 = 0.0f;
            c11 = 0;
        }
        boolean z14 = d > 0.0f || f10 > f12;
        int i10 = 0;
        while (true) {
            sc[] scVarArr = this.v;
            if (i10 >= scVarArr.length) {
                break;
            }
            sc scVar2 = scVarArr[i10];
            jp.a(fArr2, (currentTimeMillis + (i10 * 80)) % 5400.0f);
            float min = Math.min(Math.max(fArr2[c11], f27), f28);
            float min2 = Math.min(Math.max(fArr2[c10], f27), f28);
            if (d < f11 || min < min2) {
                RectF rectF10 = rectF8;
                float f29 = (min + min2) / 2.0f;
                float abs = Math.abs(min2 - min) / 2.0f;
                if (d <= f12) {
                    f13 = 360.0f;
                    float d10 = scVar2.e.d(scVar2.c, false);
                    abs = scVar2.f.d(scVar2.d, false);
                    rectF2 = rectF9;
                    f14 = lerp2;
                    f29 = d10;
                } else {
                    f13 = 360.0f;
                    rectF2 = rectF9;
                    if (d < f11) {
                        f14 = lerp2;
                        f29 = AndroidUtilities.lerp((((float) Math.floor(f28 / 360.0f)) * 360.0f) + scVar2.e.d(scVar2.c, false), f29, d);
                        abs = AndroidUtilities.lerp(scVar2.f.d(scVar2.d, false), abs, d);
                    } else {
                        f14 = lerp2;
                    }
                }
                boolean z15 = scVar2.e.i || scVar2.f.i || z14;
                float f30 = f11 - f10;
                float f31 = f11 - d;
                i6 i6Var2 = scVar2.k;
                f15 = d;
                Path path = scVar2.p;
                Paint paint2 = scVar2.s;
                Paint paint3 = scVar2.q;
                f16 = lerp3;
                RectF rectF11 = scVar2.E.x;
                RectF rectF12 = scVar2.u;
                f17 = f27;
                fArr = fArr2;
                float d11 = scVar2.o.d(scVar2.n ? 1.0f : 0.0f, false);
                rectF12.set(rectF7);
                rectF12.inset((-AndroidUtilities.dp(9.0f)) * d11, d11 * (-AndroidUtilities.dp(9.0f)));
                float width = (float) ((((rectF2.width() + rectF12.width()) * Math.cos(a(f29))) / 4.0d) + rectF12.centerX());
                rectF3 = rectF7;
                float width2 = (float) ((((rectF2.width() + rectF12.width()) * Math.sin(a(f29))) / 4.0d) + rectF12.centerY());
                float d12 = scVar2.h.d(scVar2.g, false) * f30 * f31;
                float d13 = scVar2.m.d(scVar2.l, false);
                paint3.setAlpha((int) (f30 * 255.0f));
                if (abs * 2.0f >= 359.0f) {
                    canvas2.saveLayerAlpha(rectF12, 255, 31);
                    canvas2.drawCircle(rectF12.centerX(), rectF12.centerY(), rectF12.width() / 2.0f, paint2);
                    canvas2.drawRect(rectF12, paint3);
                    f23 = d12;
                    f18 = f28;
                    scVar2.a(canvas, rectF12.centerX(), rectF12.centerY(), width, width2, 0.0f, 359.0f, rectF2.width() / 2.0f, rectF12.width() / 2.0f, f23, Math.max(0.0f, (f31 / 0.75f) - 0.75f) * d13);
                    scVar = scVar2;
                    canvas2 = canvas;
                    canvas2.drawCircle(rectF2.centerX(), rectF2.centerY(), rectF2.width() / 2.0f, scVar.t);
                    canvas2.restore();
                    i9 = i10;
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
                    if (scVar2.x == f29 && scVar2.y == abs && scVar2.z == min3 && scVar2.A == width3 && scVar2.B == rectF12.width() && scVar2.C == rectF12.centerX() && scVar2.D == rectF12.centerY()) {
                        f19 = f29;
                    } else {
                        scVar2.x = f29;
                        scVar2.y = abs;
                        scVar2.z = min3;
                        scVar2.A = width3;
                        scVar2.B = rectF12.width();
                        scVar2.C = rectF12.centerX();
                        scVar2.D = rectF12.centerY();
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
                                double d14 = width6;
                                float f36 = f32 + width4;
                                double b10 = j3.r0.b(a(f36), d14, rectF12.centerX());
                                z11 = z16;
                                i9 = i10;
                                f21 = abs;
                                double sin = (Math.sin(a(f36)) * d14) + rectF12.centerY();
                                float f37 = (float) b10;
                                float f38 = (float) sin;
                                rectF11.set(f37 - min3, f38 - min3, f37 + min3, f38 + min3);
                                path.arcTo(rectF11, f36 - 90.0f, 90.0f);
                            } else {
                                f20 = f33;
                                z11 = z16;
                                i9 = i10;
                                f21 = abs;
                            }
                            path.arcTo(rectF12, f32 + width4, f35 - (width4 * 2.0f));
                            if (z11) {
                                double d15 = width6;
                                float b11 = (float) j3.r0.b(a(r4), d15, rectF12.centerX());
                                float sin2 = (float) ((Math.sin(a(r4)) * d15) + rectF12.centerY());
                                rectF11.set(b11 - min3, sin2 - min3, b11 + min3, sin2 + min3);
                                path.arcTo(rectF11, f20 - width4, 90.0f);
                                double d16 = width7;
                                float b12 = (float) j3.r0.b(a(r4), d16, rectF2.centerX());
                                float sin3 = (float) ((Math.sin(a(r4)) * d16) + rectF2.centerY());
                                rectF11.set(b12 - min3, sin3 - min3, b12 + min3, sin3 + min3);
                                path.arcTo(rectF11, (f20 - width5) + 90.0f, 90.0f);
                            }
                            rectF5 = rectF2;
                            path.arcTo(rectF5, f20 - width5, -(f35 - (width5 * 2.0f)));
                            if (z11) {
                                double d17 = width7;
                                float f39 = f32 + width5;
                                double b13 = j3.r0.b(a(f39), d17, rectF5.centerX());
                                double sin4 = (Math.sin(a(f39)) * d17) + rectF5.centerY();
                                float f40 = (float) b13;
                                float f41 = (float) sin4;
                                rectF11.set(f40 - min3, f41 - min3, f40 + min3, f41 + min3);
                                path.arcTo(rectF11, f39 + 180.0f, 90.0f);
                            }
                            path.close();
                            path.computeBounds(scVar2.r, false);
                            float centerX = rectF12.centerX();
                            float centerY = rectF3.centerY();
                            rectF12.width();
                            scVar2.w.reset();
                            scVar2.w.setTranslate(centerX, centerY);
                            scVar2.v.setLocalMatrix(scVar2.w);
                            canvas2.saveLayerAlpha(rectF12, 255, 31);
                            canvas2.drawPath(path, paint2);
                            canvas2.drawRect(rectF12, paint3);
                            rectF2 = rectF5;
                            z12 = z15;
                            f22 = f10;
                            f23 = d12;
                            i6Var = i6Var2;
                            f24 = width;
                            f25 = width2;
                            f26 = 0.0f;
                            rectF6 = rectF11;
                            scVar2.a(canvas, rectF12.centerX(), rectF12.centerY(), f24, f25, f19 - f21, f19 + f21, rectF5.width() / 2.0f, rectF12.width() / 2.0f, f23, Math.max(0.0f, (f31 / 0.75f) - 0.75f) * d13);
                            scVar = scVar2;
                            canvas2 = canvas;
                            canvas2.restore();
                        }
                    }
                    i9 = i10;
                    f21 = abs;
                    rectF5 = rectF2;
                    float centerX2 = rectF12.centerX();
                    float centerY2 = rectF3.centerY();
                    rectF12.width();
                    scVar2.w.reset();
                    scVar2.w.setTranslate(centerX2, centerY2);
                    scVar2.v.setLocalMatrix(scVar2.w);
                    canvas2.saveLayerAlpha(rectF12, 255, 31);
                    canvas2.drawPath(path, paint2);
                    canvas2.drawRect(rectF12, paint3);
                    rectF2 = rectF5;
                    z12 = z15;
                    f22 = f10;
                    f23 = d12;
                    i6Var = i6Var2;
                    f24 = width;
                    f25 = width2;
                    f26 = 0.0f;
                    rectF6 = rectF11;
                    scVar2.a(canvas, rectF12.centerX(), rectF12.centerY(), f24, f25, f19 - f21, f19 + f21, rectF5.width() / 2.0f, rectF12.width() / 2.0f, f23, Math.max(0.0f, (f31 / 0.75f) - 0.75f) * d13);
                    scVar = scVar2;
                    canvas2 = canvas;
                    canvas2.restore();
                }
                float d18 = scVar.j.d(scVar.i, false);
                rectF6.set(f24 - f26, f25 - f26, f24 + f26, f25 + f26);
                if (d18 != f11) {
                    canvas2.save();
                    canvas2.scale(d18, d18, rectF6.centerX(), rectF6.centerY());
                }
                i6Var.w = (int) (f23 * 255.0f);
                i6Var.setBounds((int) rectF6.left, (int) rectF6.top, (int) rectF6.right, (int) rectF6.bottom);
                i6Var.draw(canvas2);
                if (d18 != f11) {
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
                i9 = i10;
                f22 = f10;
            }
            i10 = i9 + 1;
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
        int i11 = this.d;
        if (i11 == 0) {
            float f45 = (f11 - f44) * (f11 - f42);
            if (b(canvas2, i6Var4, rectF13.centerX(), rectF13.centerY() - AndroidUtilities.dpf2(5.0f), 1.0f, f45) || z14) {
            }
            b(canvas, i6Var3, rectF13.centerX(), AndroidUtilities.dpf2(22.0f) + rectF13.centerY(), 1.0f, f45);
            z10 = true;
        } else {
            z10 = true;
            if (i11 == 1) {
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
                zf.v1 v1Var = new zf.v1(25);
                this.M = v1Var;
                v1Var.N = 100;
                v1Var.M = z10;
                v1Var.G = z10;
                v1Var.K = false;
                v1Var.H = z10;
                v1Var.r = 18;
                v1Var.B = false;
                v1Var.j = AndroidUtilities.dp(80.0f);
                zf.v1 v1Var2 = this.M;
                v1Var2.w = 0.85f;
                v1Var2.v = 0.85f;
                v1Var2.u = 0.85f;
                v1Var2.c();
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
            int i12 = (int) (f44 * 255.0f);
            Paint paint4 = this.D;
            paint4.setAlpha(i12);
            canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint4);
            canvas.restore();
            Paint paint5 = this.C;
            paint5.setStrokeWidth(f43);
            paint5.setAlpha(i12);
            canvas.drawCircle(rectF13.centerX(), rectF13.centerY(), (rectF13.width() - f43) / 2.0f, paint5);
            RectF rectF16 = this.A;
            Path path2 = this.B;
            if (rectF16 == null || !rectF16.equals(rectF)) {
                if (this.A == null) {
                    this.A = new RectF();
                }
                this.A.set(rectF);
                path2.rewind();
                if (i11 == 0) {
                    path2.moveTo(rectF13.width() * 0.348f, rectF13.height() * 0.538f);
                    path2.lineTo(rectF13.width() * 0.447f, rectF13.height() * 0.636f);
                    path2.lineTo(rectF13.width() * 0.678f, rectF13.height() * 0.402f);
                } else if (i11 == z10) {
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
            if (i11 == 0) {
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
        int i9;
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        RectF rectF = this.b;
        float a2 = g7.w.a(rectF.centerX(), rectF.centerY(), x10, y10);
        float atan2 = (float) ((Math.atan2(y10 - rectF.centerY(), x10 - rectF.centerX()) / 3.141592653589793d) * 180.0d);
        if (atan2 < 0.0f) {
            atan2 += 360.0f;
        }
        if (a2 > this.c.width() / 2.0f && a2 < (rectF.width() / 2.0f) + AndroidUtilities.dp(14.0f)) {
            i9 = 0;
            while (true) {
                sc[] scVarArr = this.v;
                if (i9 >= scVarArr.length) {
                    break;
                }
                sc scVar = scVarArr[i9];
                float f10 = scVar.c;
                float f11 = scVar.d;
                if (atan2 >= f10 - f11 && atan2 <= f10 + f11) {
                    break;
                }
                i9++;
            }
            if (motionEvent.getAction() != 0) {
                setSelected(i9);
                if (i9 >= 0) {
                    d(i9, i9 != -1);
                    if (getParent() != null && this.N) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                        return true;
                    }
                }
            } else {
                if (motionEvent.getAction() != 2) {
                    if (motionEvent.getAction() == 1) {
                        boolean z10 = i9 != -1;
                        setSelected(-1);
                        d(i9, false);
                    } else if (motionEvent.getAction() == 3) {
                        setSelected(-1);
                        d(i9, false);
                    }
                    return super.dispatchTouchEvent(motionEvent);
                }
                d(i9, i9 != -1);
                setSelected(i9);
            }
            return true;
        }
        i9 = -1;
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
    public final void f(long j10, boolean z10, tc... tcVarArr) {
        boolean z11;
        float f10;
        float f11;
        boolean z12;
        sc scVar;
        float f12;
        sc[] scVarArr;
        float[] fArr;
        float f13;
        int i9;
        long j11;
        float f14;
        float f15;
        boolean z13;
        long j12;
        boolean z14;
        tc[] tcVarArr2 = tcVarArr;
        y5 y5Var = this.n;
        y5 y5Var2 = this.s;
        i6 i6Var = this.L;
        i6 i6Var2 = this.K;
        i6 i6Var3 = this.J;
        i6 i6Var4 = this.I;
        sc[] scVarArr2 = this.v;
        float f16 = 1.0f;
        if (tcVarArr2 == null || tcVarArr2.length == 0) {
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
            for (sc scVar2 : scVarArr2) {
                scVar2.g = 0.0f;
                if (!z10) {
                    scVar2.h.d(0.0f, z11);
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
        int length = tcVarArr2.length;
        SpannableString spannableString2 = spannableString;
        long j13 = 0;
        int i10 = 0;
        while (i10 < tcVarArr2.length) {
            if (tcVarArr2[i10] == null) {
                tc tcVar = new tc();
                tcVarArr2[i10] = tcVar;
                j12 = j13;
                tcVar.c = 0L;
            } else {
                j12 = j13;
            }
            tc tcVar2 = tcVarArr2[i10];
            tcVar2.a = i10;
            boolean z15 = tcVar2.b;
            if (z15) {
                z14 = z15;
                j12 += tcVar2.c;
            } else {
                z14 = z15;
            }
            if (tcVar2.c <= 0 || !z14) {
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
                y5Var.d(0.0f, true);
                y5Var2.d(this.r ? 1.0f : 0.0f, true);
            }
            i6Var2.q(i6Var4.g, false, z13);
            i6Var4.q("0", z10, z13);
            i6Var2.q("0", z10, z13);
            i6Var.q(i6Var3.g, false, z13);
            i6Var3.q("KB", z10, z13);
            i6Var.q("KB", z10, z13);
            int i11 = 0;
            while (i11 < scVarArr2.length) {
                sc scVar3 = scVarArr2[i11];
                scVar3.g = 0.0f;
                if (!z10) {
                    scVar3.h.d(0.0f, z13);
                }
                i11++;
                z13 = true;
            }
            invalidate();
            return;
        }
        sc[] scVarArr3 = scVarArr2;
        int i12 = 0;
        int i13 = 0;
        float f17 = 0.0f;
        while (i12 < tcVarArr2.length) {
            tc tcVar3 = tcVarArr2[i12];
            if (tcVar3 == null || !tcVar3.b) {
                i9 = i12;
                j11 = j14;
                f14 = 0.02f;
                f15 = 0.0f;
            } else {
                f14 = 0.02f;
                i9 = i12;
                j11 = j14;
                f15 = tcVar3.c / j11;
            }
            if (f15 > 0.0f && f15 < f14) {
                i13++;
                f17 += f15;
            }
            i12 = i9 + 1;
            j14 = j11;
        }
        long j15 = j14;
        Math.min(tcVarArr2.length, scVarArr3.length);
        int[] iArr = this.Q;
        if (iArr == null || iArr.length != tcVarArr2.length) {
            this.Q = new int[tcVarArr2.length];
        }
        float[] fArr2 = this.R;
        if (fArr2 == null || fArr2.length != tcVarArr2.length) {
            this.R = new float[tcVarArr2.length];
        }
        int i14 = 0;
        while (i14 < tcVarArr2.length) {
            float[] fArr3 = this.R;
            int i15 = i14;
            tc tcVar4 = tcVarArr2[i15];
            float f18 = f17;
            if (tcVar4 != null) {
                scVarArr = scVarArr3;
                if (tcVar4.b) {
                    fArr = fArr3;
                    f13 = tcVar4.c / j15;
                    fArr[i15] = f13;
                    i14 = i15 + 1;
                    f17 = f18;
                    scVarArr3 = scVarArr;
                }
            } else {
                scVarArr = scVarArr3;
            }
            fArr = fArr3;
            f13 = 0.0f;
            fArr[i15] = f13;
            i14 = i15 + 1;
            f17 = f18;
            scVarArr3 = scVarArr;
        }
        float f19 = f17;
        sc[] scVarArr4 = scVarArr3;
        AndroidUtilities.roundPercents(this.R, this.Q);
        if (this.d == 0) {
            Arrays.sort(tcVarArr2, new j9.a(24));
            int i16 = 0;
            while (true) {
                if (i16 > tcVarArr2.length) {
                    break;
                }
                tc tcVar5 = tcVarArr2[i16];
                if (tcVar5.a == tcVarArr2.length - 1) {
                    tc tcVar6 = tcVarArr2[0];
                    tcVarArr2[0] = tcVar5;
                    tcVarArr2[i16] = tcVar6;
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
        while (i17 < tcVarArr2.length) {
            tc tcVar7 = tcVarArr2[i17];
            int i19 = tcVar7.a;
            int i20 = i17;
            float f22 = !tcVar7.b ? 0.0f : tcVar7.c / j15;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            float f23 = f20;
            spannableStringBuilder.append((CharSequence) String.format("%d", Integer.valueOf(this.Q[i19])));
            SpannableString spannableString3 = spannableString2;
            spannableStringBuilder.append((CharSequence) spannableString3);
            sc scVar4 = scVarArr4[i19];
            i6 i6Var5 = i6Var;
            i6 i6Var6 = i6Var2;
            float f24 = (((double) f22) <= 0.05d || f22 >= f16) ? 0.0f : 1.0f;
            scVar4.g = f24;
            if (f22 >= 0.08f) {
                f10 = f22;
                if (this.Q[i19] < 100) {
                    f11 = 1.0f;
                    scVar4.i = f11;
                    scVar4.l = 1.0f;
                    if (z10) {
                        y5 y5Var3 = scVar4.h;
                        z12 = true;
                        y5Var3.d(f24, true);
                        sc scVar5 = scVarArr4[i19];
                        scVar5.j.d(scVar5.i, true);
                        sc scVar6 = scVarArr4[i19];
                        scVar6.m.d(scVar6.l, true);
                    } else {
                        z12 = true;
                    }
                    scVar = scVarArr4[i19];
                    if (scVar.g > 0.0f) {
                        scVar.k.q(spannableStringBuilder, z10, z12);
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
                        sc scVar7 = scVarArr4[i19];
                        scVar7.c = (f25 + f26) / 2.0f;
                        scVar7.d = Math.abs(f26 - f25) / 2.0f;
                        sc scVar8 = scVarArr4[i19];
                        scVar8.g = 0.0f;
                        if (!z10) {
                            scVar8.e.d(scVar8.c, true);
                            sc scVar9 = scVarArr4[i19];
                            scVar9.f.d(scVar9.d, true);
                            sc scVar10 = scVarArr4[i19];
                            scVar10.h.d(scVar10.g, true);
                        }
                    } else {
                        sc scVar11 = scVarArr4[i19];
                        scVar11.c = (f25 + f26) / 2.0f;
                        scVar11.d = Math.abs(f26 - f25) / 2.0f;
                        if (!z10) {
                            sc scVar12 = scVarArr4[i19];
                            scVar12.e.d(scVar12.c, true);
                            sc scVar13 = scVarArr4[i19];
                            scVar13.f.d(scVar13.d, true);
                        }
                        f21 += f12;
                        i18++;
                    }
                    i17 = i20 + 1;
                    tcVarArr2 = tcVarArr;
                    i6Var2 = i6Var6;
                    i6Var = i6Var5;
                    f20 = f23;
                    spannableString2 = spannableString3;
                }
            } else {
                f10 = f22;
            }
            f11 = 0.85f;
            scVar4.i = f11;
            scVar4.l = 1.0f;
            if (z10) {
            }
            scVar = scVarArr4[i19];
            if (scVar.g > 0.0f) {
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
            tcVarArr2 = tcVarArr;
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
        int i9 = 0;
        while (true) {
            sc[] scVarArr = this.v;
            if (i9 >= scVarArr.length) {
                return;
            }
            sc scVar = scVarArr[i9];
            if (scVar.b == null) {
                boolean z10 = this.e;
                int[] iArr = this.f;
                if (z10) {
                    scVar.b = SvgHelper.getBitmap(iArr[i9], AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), -1);
                } else {
                    scVar.b = BitmapFactory.decodeResource(getContext().getResources(), iArr[i9]);
                }
            }
            i9++;
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
        int i9 = 0;
        this.O = false;
        while (true) {
            sc[] scVarArr = this.v;
            if (i9 >= scVarArr.length) {
                return;
            }
            Bitmap bitmap = scVarArr[i9].b;
            if (bitmap != null) {
                bitmap.recycle();
                scVarArr[i9].b = null;
            }
            i9++;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i9, int i10) {
        int size = View.MeasureSpec.getSize(i9);
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
        zf.v1 v1Var = this.M;
        if (v1Var != null) {
            v1Var.a.set(0.0f, 0.0f, AndroidUtilities.dp(140.0f), AndroidUtilities.dp(140.0f));
            this.M.a.offset((getMeasuredWidth() - this.M.a.width()) / 2.0f, (getMeasuredHeight() - this.M.a.height()) / 2.0f);
            this.M.b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            this.M.f();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(dp, TLObject.FLAG_30));
    }

    public void setInterceptTouch(boolean z10) {
        this.N = z10;
    }

    public void setSelected(int i9) {
        if (i9 == this.P) {
            return;
        }
        int i10 = 0;
        while (true) {
            sc[] scVarArr = this.v;
            if (i10 >= scVarArr.length) {
                this.P = i9;
                invalidate();
                return;
            }
            if (i9 == i10 && scVarArr[i10].d <= 0.0f) {
                i9 = -1;
            }
            scVarArr[i10].n = i9 == i10;
            i10++;
        }
    }
}
