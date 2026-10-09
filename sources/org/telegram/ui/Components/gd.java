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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public abstract class gd extends View {
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
    public final q6 M;
    public final q6 N;
    public final q6 O;
    public final q6 P;
    public rg.v1 Q;
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
    public final g6 n;
    public boolean r;
    public final g6 s;
    public final ed[] v;
    public final float[] w;
    public final RectF x;
    public final Paint y;

    static {
        int i10 = org.telegram.ui.ActionBar.i6.lj;
        int i11 = org.telegram.ui.ActionBar.i6.hj;
        int i12 = org.telegram.ui.ActionBar.i6.ij;
        int i13 = org.telegram.ui.ActionBar.i6.pj;
        int i14 = org.telegram.ui.ActionBar.i6.mj;
        int i15 = org.telegram.ui.ActionBar.i6.jj;
        int i16 = org.telegram.ui.ActionBar.i6.nj;
        int i17 = org.telegram.ui.ActionBar.i6.qj;
        int i18 = org.telegram.ui.ActionBar.i6.kj;
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

    public gd(Context context, int i10, int[] iArr, int i11, int[] iArr2) {
        super(context);
        this.a = new RectF();
        this.b = new RectF();
        this.c = new RectF();
        this.h = true;
        hs hsVar = hs.h;
        this.n = new g6(this, 750L, hsVar);
        this.r = false;
        this.s = new g6(this, 650L, hsVar);
        this.w = new float[2];
        this.x = new RectF();
        Paint paint = new Paint(1);
        this.y = paint;
        this.F = new Path();
        Paint paint2 = new Paint(1);
        this.G = paint2;
        Paint paint3 = new Paint(1);
        this.H = paint3;
        q6 q6Var = new q6(false, true, true);
        this.M = q6Var;
        q6 q6Var2 = new q6(false, true, true);
        this.N = q6Var2;
        q6 q6Var3 = new q6(false, true, true);
        this.O = q6Var3;
        q6 q6Var4 = new q6(false, true, true);
        this.P = q6Var4;
        this.R = true;
        this.T = -1;
        setLayerType(2, null);
        this.f = iArr2;
        this.d = i11;
        this.e = i11 == 0;
        this.v = new ed[i10];
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.i6, false));
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
        q6Var.n(0.2f, 450L, hsVar);
        q6Var.A = 0.6f;
        q6Var.u(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.G6, false));
        q6Var.x(AndroidUtilities.bold());
        q6Var.w(AndroidUtilities.dp(32.0f));
        q6Var.b = 17;
        q6Var2.n(0.6f, 450L, hsVar);
        q6Var2.A = 0.6f;
        q6Var2.u(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.y6, false));
        q6Var2.w(AndroidUtilities.dp(12.0f));
        q6Var2.b = 17;
        q6Var3.n(0.2f, 450L, hsVar);
        q6Var3.A = 0.6f;
        q6Var3.a.setShader(linearGradient2);
        q6Var3.x(AndroidUtilities.bold());
        q6Var3.w(AndroidUtilities.dp(32.0f));
        q6Var3.b = 17;
        q6Var4.n(0.6f, 450L, hsVar);
        q6Var4.A = 0.6f;
        q6Var4.a.setShader(linearGradient2);
        q6Var4.x(AndroidUtilities.bold());
        q6Var4.w(AndroidUtilities.dp(12.0f));
        q6Var4.b = 17;
        int i12 = 0;
        while (true) {
            ed[] edVarArr = this.v;
            if (i12 >= edVarArr.length) {
                return;
            }
            ed edVar = new ed(this);
            edVarArr[i12] = edVar;
            int v = org.telegram.ui.ActionBar.i6.v(org.telegram.ui.ActionBar.i6.x0(null, iArr[i12], false), ConnectionsManager.FileTypeAudio);
            int v9 = org.telegram.ui.ActionBar.i6.v(org.telegram.ui.ActionBar.i6.x0(null, iArr[i12], false), 822083583);
            AndroidUtilities.dp(50.0f);
            RadialGradient radialGradient = new RadialGradient(0.0f, 0.0f, AndroidUtilities.dp(86.0f), new int[]{v9, v}, new float[]{0.3f, 1.0f}, Shader.TileMode.CLAMP);
            edVar.v = radialGradient;
            Matrix matrix = new Matrix();
            edVar.w = matrix;
            radialGradient.setLocalMatrix(matrix);
            edVar.q.setShader(edVar.v);
            i12++;
        }
    }

    public static float a(float f7) {
        return (float) ((f7 / 180.0f) * 3.141592653589793d);
    }

    public static boolean b(Canvas canvas, q6 q6Var, float f7, float f10, float f11, float f12) {
        if (f12 <= 0.0f) {
            return false;
        }
        q6Var.B = (int) (f12 * 255.0f);
        q6Var.setBounds(0, 0, 0, 0);
        canvas.save();
        canvas.translate(f7, f10);
        canvas.scale(f11, f11);
        q6Var.draw(canvas);
        canvas.restore();
        return q6Var.h();
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
        q6 q6Var;
        float f22;
        float f23;
        float f24;
        RectF rectF6;
        ed edVar;
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
        jq.a(fArr2, currentTimeMillis % 5400.0f);
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
            ed[] edVarArr = this.v;
            if (i15 >= edVarArr.length) {
                break;
            }
            ed edVar2 = edVarArr[i15];
            jq.a(fArr2, (currentTimeMillis + (i15 * 80)) % 5400.0f);
            float min = Math.min(Math.max(fArr2[i11], f25), f26);
            float min2 = Math.min(Math.max(fArr2[i10], f25), f26);
            if (d < f11 || min < min2) {
                RectF rectF10 = rectF8;
                float f27 = (min + min2) / 2.0f;
                float abs = Math.abs(min2 - min) / 2.0f;
                if (d <= f10) {
                    boolean z13 = i11;
                    float d11 = edVar2.e.d(edVar2.c, z13);
                    abs = edVar2.f.d(edVar2.d, z13);
                    rectF2 = rectF9;
                    f12 = lerp2;
                    f27 = d11;
                } else {
                    boolean z14 = i11;
                    rectF2 = rectF9;
                    if (d < f11) {
                        f12 = lerp2;
                        f27 = AndroidUtilities.lerp((((float) Math.floor(f26 / 360.0f)) * 360.0f) + edVar2.e.d(edVar2.c, z14), f27, d);
                        abs = AndroidUtilities.lerp(edVar2.f.d(edVar2.d, z14), abs, d);
                    } else {
                        f12 = lerp2;
                    }
                }
                int i16 = (edVar2.e.i || edVar2.f.i || i14 != 0) ? i10 : 0;
                float f28 = f11 - f7;
                float f29 = f11 - d;
                q6 q6Var2 = edVar2.k;
                f13 = d;
                Path path = edVar2.p;
                Paint paint2 = edVar2.s;
                Paint paint3 = edVar2.q;
                f14 = lerp3;
                RectF rectF11 = edVar2.E.x;
                RectF rectF12 = edVar2.u;
                f15 = f25;
                fArr = fArr2;
                float d12 = edVar2.o.d(edVar2.n ? f11 : f10, false);
                rectF12.set(rectF7);
                rectF12.inset((-AndroidUtilities.dp(9.0f)) * d12, d12 * (-AndroidUtilities.dp(9.0f)));
                float width = (float) ((((rectF2.width() + rectF12.width()) * Math.cos(a(f27))) / 4.0d) + rectF12.centerX());
                rectF3 = rectF7;
                float width2 = (float) ((((rectF2.width() + rectF12.width()) * Math.sin(a(f27))) / 4.0d) + rectF12.centerY());
                float d13 = edVar2.h.d(edVar2.g, false) * f28 * f29;
                float d14 = edVar2.m.d(edVar2.l, false);
                paint3.setAlpha((int) (f28 * 255.0f));
                if (abs * 2.0f >= 359.0f) {
                    canvas2.saveLayerAlpha(rectF12, 255, 31);
                    canvas2.drawCircle(rectF12.centerX(), rectF12.centerY(), rectF12.width() / 2.0f, paint2);
                    canvas2.drawRect(rectF12, paint3);
                    f24 = d13;
                    f16 = f26;
                    edVar2.a(canvas, rectF12.centerX(), rectF12.centerY(), width, width2, 0.0f, 359.0f, rectF2.width() / 2.0f, rectF12.width() / 2.0f, f24, Math.max(f10, (f29 / 0.75f) - 0.75f) * d14);
                    edVar = edVar2;
                    canvas2 = canvas;
                    canvas2.drawCircle(rectF2.centerX(), rectF2.centerY(), rectF2.width() / 2.0f, edVar.t);
                    canvas2.restore();
                    i12 = i15;
                    rectF4 = rectF10;
                    i13 = i16;
                    f21 = f7;
                    rectF6 = rectF11;
                    q6Var = q6Var2;
                    f22 = width;
                    f23 = width2;
                    f20 = 0.0f;
                } else {
                    rectF4 = rectF10;
                    f16 = f26;
                    float min3 = Math.min(Math.min(f14, (rectF12.width() - rectF2.width()) / 4.0f), (float) ((rectF2.width() / 2.0f) * (abs / 180.0f) * 3.141592653589793d));
                    float width3 = (rectF12.width() - rectF2.width()) / 2.0f;
                    if (edVar2.x == f27 && edVar2.y == abs && edVar2.z == min3 && edVar2.A == width3 && edVar2.B == rectF12.width() && edVar2.C == rectF12.centerX() && edVar2.D == rectF12.centerY()) {
                        f17 = f27;
                    } else {
                        edVar2.x = f27;
                        edVar2.y = abs;
                        edVar2.z = min3;
                        edVar2.A = width3;
                        edVar2.B = rectF12.width();
                        edVar2.C = rectF12.centerX();
                        edVar2.D = rectF12.centerY();
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
                                double e7 = hg.c.e(a(f34), d15, rectF12.centerX());
                                z11 = z15;
                                i12 = i15;
                                f19 = abs;
                                double sin = (Math.sin(a(f34)) * d15) + rectF12.centerY();
                                float f35 = (float) e7;
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
                                float e10 = (float) hg.c.e(a(r4), d16, rectF12.centerX());
                                float sin2 = (float) ((Math.sin(a(r4)) * d16) + rectF12.centerY());
                                rectF11.set(e10 - min3, sin2 - min3, e10 + min3, sin2 + min3);
                                path.arcTo(rectF11, f18 - width4, 90.0f);
                                double d17 = width7;
                                float e11 = (float) hg.c.e(a(r4), d17, rectF2.centerX());
                                float sin3 = (float) ((Math.sin(a(r4)) * d17) + rectF2.centerY());
                                rectF11.set(e11 - min3, sin3 - min3, e11 + min3, sin3 + min3);
                                path.arcTo(rectF11, (f18 - width5) + 90.0f, 90.0f);
                            }
                            rectF5 = rectF2;
                            path.arcTo(rectF5, f18 - width5, -(f33 - (width5 * 2.0f)));
                            if (z11) {
                                double d18 = width7;
                                float f37 = f30 + width5;
                                double e12 = hg.c.e(a(f37), d18, rectF5.centerX());
                                double sin4 = (Math.sin(a(f37)) * d18) + rectF5.centerY();
                                float f38 = (float) e12;
                                float f39 = (float) sin4;
                                rectF11.set(f38 - min3, f39 - min3, f38 + min3, f39 + min3);
                                path.arcTo(rectF11, f37 + 180.0f, 90.0f);
                            }
                            path.close();
                            path.computeBounds(edVar2.r, false);
                            float centerX = rectF12.centerX();
                            float centerY = rectF3.centerY();
                            rectF12.width();
                            edVar2.w.reset();
                            edVar2.w.setTranslate(centerX, centerY);
                            edVar2.v.setLocalMatrix(edVar2.w);
                            canvas2.saveLayerAlpha(rectF12, 255, 31);
                            canvas2.drawPath(path, paint2);
                            canvas2.drawRect(rectF12, paint3);
                            rectF2 = rectF5;
                            f20 = 0.0f;
                            i13 = i16;
                            f21 = f7;
                            f14 = f14;
                            q6Var = q6Var2;
                            f22 = width;
                            f23 = width2;
                            f24 = d13;
                            rectF6 = rectF11;
                            edVar2.a(canvas, rectF12.centerX(), rectF12.centerY(), f22, f23, f17 - f19, f17 + f19, rectF5.width() / 2.0f, rectF12.width() / 2.0f, f24, Math.max(0.0f, (f29 / 0.75f) - 0.75f) * d14);
                            edVar = edVar2;
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
                    edVar2.w.reset();
                    edVar2.w.setTranslate(centerX2, centerY2);
                    edVar2.v.setLocalMatrix(edVar2.w);
                    canvas2.saveLayerAlpha(rectF12, 255, 31);
                    canvas2.drawPath(path, paint2);
                    canvas2.drawRect(rectF12, paint3);
                    rectF2 = rectF5;
                    f20 = 0.0f;
                    i13 = i16;
                    f21 = f7;
                    f14 = f14;
                    q6Var = q6Var2;
                    f22 = width;
                    f23 = width2;
                    f24 = d13;
                    rectF6 = rectF11;
                    edVar2.a(canvas, rectF12.centerX(), rectF12.centerY(), f22, f23, f17 - f19, f17 + f19, rectF5.width() / 2.0f, rectF12.width() / 2.0f, f24, Math.max(0.0f, (f29 / 0.75f) - 0.75f) * d14);
                    edVar = edVar2;
                    canvas2 = canvas;
                    canvas2.restore();
                }
                float d19 = edVar.j.d(edVar.i, false);
                rectF6.set(f22 - f20, f23 - f20, f22 + f20, f23 + f20);
                if (d19 != f11) {
                    canvas2.save();
                    canvas2.scale(d19, d19, rectF6.centerX(), rectF6.centerY());
                }
                q6Var.B = (int) (f24 * 255.0f);
                q6Var.setBounds((int) rectF6.left, (int) rectF6.top, (int) rectF6.right, (int) rectF6.bottom);
                q6Var.draw(canvas2);
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
        q6 q6Var3 = this.N;
        q6 q6Var4 = this.M;
        int i17 = this.d;
        if (i17 == 0) {
            float f43 = (f11 - f42) * (f11 - f40);
            if (b(canvas2, q6Var4, rectF13.centerX(), rectF13.centerY() - AndroidUtilities.dpf2(5.0f), 1.0f, f43) || i14 != 0) {
            }
            b(canvas, q6Var3, rectF13.centerX(), AndroidUtilities.dpf2(22.0f) + rectF13.centerY(), 1.0f, f43);
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
                boolean z17 = b(canvas, q6Var4, centerX3, centerY3, lerp4, f47) || z16;
                float lerp5 = AndroidUtilities.lerp(0.0f, AndroidUtilities.dpf2(26.0f), f42) + rectF13.centerX();
                float lerp6 = AndroidUtilities.lerp(AndroidUtilities.dpf2(22.0f), -AndroidUtilities.dpf2(18.0f), f42) + rectF13.centerY();
                float lerp7 = AndroidUtilities.lerp(1.0f, 1.4f, f42);
                if (b(canvas, this.P, lerp5, lerp6, lerp7, f46) || z17) {
                }
                b(canvas, q6Var3, lerp5, lerp6, lerp7, f47);
            }
        }
        if (f42 > 0.0f) {
            if (this.Q == null) {
                rg.v1 v1Var = new rg.v1(25);
                this.Q = v1Var;
                v1Var.N = 100;
                v1Var.M = z10;
                v1Var.G = z10;
                v1Var.K = false;
                v1Var.H = z10;
                v1Var.r = 18;
                v1Var.B = false;
                v1Var.j = AndroidUtilities.dp(80.0f);
                rg.v1 v1Var2 = this.Q;
                v1Var2.w = 0.85f;
                v1Var2.v = 0.85f;
                v1Var2.u = 0.85f;
                v1Var2.c();
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
                ed[] edVarArr = this.v;
                if (i10 >= edVarArr.length) {
                    break;
                }
                ed edVar = edVarArr[i10];
                float f7 = edVar.c;
                float f10 = edVar.d;
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
    public final void f(long j3, boolean z10, fd... fdVarArr) {
        boolean z11;
        float f7;
        float f10;
        boolean z12;
        ed edVar;
        float f11;
        ed[] edVarArr;
        float[] fArr;
        float f12;
        int i10;
        long j10;
        float f13;
        float f14;
        boolean z13;
        long j11;
        boolean z14;
        fd[] fdVarArr2 = fdVarArr;
        g6 g6Var = this.n;
        g6 g6Var2 = this.s;
        q6 q6Var = this.P;
        q6 q6Var2 = this.O;
        q6 q6Var3 = this.N;
        q6 q6Var4 = this.M;
        ed[] edVarArr2 = this.v;
        float f15 = 1.0f;
        if (fdVarArr2 == null || fdVarArr2.length == 0) {
            this.h = false;
            this.r = j3 == 0;
            if (z10) {
                z11 = true;
            } else {
                z11 = true;
                g6Var.d(0.0f, true);
                g6Var2.d(this.r ? 1.0f : 0.0f, true);
            }
            q6Var2.t(q6Var4.i, false, z11);
            q6Var4.t("0", z10, z11);
            q6Var2.t("0", z10, z11);
            q6Var.t(q6Var3.i, false, z11);
            q6Var3.t("KB", z10, z11);
            q6Var.t("KB", z10, z11);
            for (ed edVar2 : edVarArr2) {
                edVar2.g = 0.0f;
                if (!z10) {
                    edVar2.h.d(0.0f, z11);
                }
            }
            invalidate();
            return;
        }
        this.h = false;
        if (!z10) {
            g6Var.d(0.0f, true);
        }
        SpannableString spannableString = new SpannableString("%");
        int length = fdVarArr2.length;
        SpannableString spannableString2 = spannableString;
        int i11 = 0;
        long j12 = 0;
        while (i11 < fdVarArr2.length) {
            if (fdVarArr2[i11] == null) {
                fd fdVar = new fd();
                fdVarArr2[i11] = fdVar;
                j11 = j12;
                fdVar.c = 0L;
            } else {
                j11 = j12;
            }
            fd fdVar2 = fdVarArr2[i11];
            fdVar2.a = i11;
            boolean z15 = fdVar2.b;
            if (z15) {
                z14 = z15;
                j11 += fdVar2.c;
            } else {
                z14 = z15;
            }
            if (fdVar2.c <= 0 || !z14) {
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
                g6Var.d(0.0f, true);
                g6Var2.d(this.r ? 1.0f : 0.0f, true);
            }
            q6Var2.t(q6Var4.i, false, z13);
            q6Var4.t("0", z10, z13);
            q6Var2.t("0", z10, z13);
            q6Var.t(q6Var3.i, false, z13);
            q6Var3.t("KB", z10, z13);
            q6Var.t("KB", z10, z13);
            int i12 = 0;
            while (i12 < edVarArr2.length) {
                ed edVar3 = edVarArr2[i12];
                edVar3.g = 0.0f;
                if (!z10) {
                    edVar3.h.d(0.0f, z13);
                }
                i12++;
                z13 = true;
            }
            invalidate();
            return;
        }
        ed[] edVarArr3 = edVarArr2;
        int i13 = 0;
        int i14 = 0;
        float f16 = 0.0f;
        while (i13 < fdVarArr2.length) {
            fd fdVar3 = fdVarArr2[i13];
            if (fdVar3 == null || !fdVar3.b) {
                i10 = i13;
                j10 = j13;
                f13 = 0.02f;
                f14 = 0.0f;
            } else {
                f13 = 0.02f;
                i10 = i13;
                j10 = j13;
                f14 = fdVar3.c / j10;
            }
            if (f14 > 0.0f && f14 < f13) {
                i14++;
                f16 += f14;
            }
            i13 = i10 + 1;
            j13 = j10;
        }
        long j14 = j13;
        Math.min(fdVarArr2.length, edVarArr3.length);
        int[] iArr = this.U;
        if (iArr == null || iArr.length != fdVarArr2.length) {
            this.U = new int[fdVarArr2.length];
        }
        float[] fArr2 = this.V;
        if (fArr2 == null || fArr2.length != fdVarArr2.length) {
            this.V = new float[fdVarArr2.length];
        }
        int i15 = 0;
        while (i15 < fdVarArr2.length) {
            float[] fArr3 = this.V;
            int i16 = i15;
            fd fdVar4 = fdVarArr2[i16];
            float f17 = f16;
            if (fdVar4 != null) {
                edVarArr = edVarArr3;
                if (fdVar4.b) {
                    fArr = fArr3;
                    f12 = fdVar4.c / j14;
                    fArr[i16] = f12;
                    i15 = i16 + 1;
                    f16 = f17;
                    edVarArr3 = edVarArr;
                }
            } else {
                edVarArr = edVarArr3;
            }
            fArr = fArr3;
            f12 = 0.0f;
            fArr[i16] = f12;
            i15 = i16 + 1;
            f16 = f17;
            edVarArr3 = edVarArr;
        }
        float f18 = f16;
        ed[] edVarArr4 = edVarArr3;
        AndroidUtilities.roundPercents(this.V, this.U);
        if (this.d == 0) {
            Arrays.sort(fdVarArr2, new org.telegram.ui.gf(8));
            int i17 = 0;
            while (true) {
                if (i17 > fdVarArr2.length) {
                    break;
                }
                fd fdVar5 = fdVarArr2[i17];
                if (fdVar5.a == fdVarArr2.length - 1) {
                    fd fdVar6 = fdVarArr2[0];
                    fdVarArr2[0] = fdVar5;
                    fdVarArr2[i17] = fdVar6;
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
        while (i18 < fdVarArr2.length) {
            fd fdVar7 = fdVarArr2[i18];
            int i20 = fdVar7.a;
            int i21 = i18;
            float f21 = !fdVar7.b ? 0.0f : fdVar7.c / j14;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            float f22 = f19;
            spannableStringBuilder.append((CharSequence) String.format("%d", Integer.valueOf(this.U[i20])));
            SpannableString spannableString3 = spannableString2;
            spannableStringBuilder.append((CharSequence) spannableString3);
            ed edVar4 = edVarArr4[i20];
            q6 q6Var5 = q6Var;
            q6 q6Var6 = q6Var2;
            float f23 = (((double) f21) <= 0.05d || f21 >= f15) ? 0.0f : f15;
            edVar4.g = f23;
            if (f21 >= 0.08f) {
                f7 = f21;
                if (this.U[i20] < 100) {
                    f10 = f15;
                    edVar4.i = f10;
                    edVar4.l = f15;
                    if (z10) {
                        g6 g6Var3 = edVar4.h;
                        z12 = true;
                        g6Var3.d(f23, true);
                        ed edVar5 = edVarArr4[i20];
                        edVar5.j.d(edVar5.i, true);
                        ed edVar6 = edVarArr4[i20];
                        edVar6.m.d(edVar6.l, true);
                    } else {
                        z12 = true;
                    }
                    edVar = edVarArr4[i20];
                    if (edVar.g > 0.0f) {
                        edVar.k.t(spannableStringBuilder, z10, z12);
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
                        ed edVar7 = edVarArr4[i20];
                        edVar7.c = (f24 + f25) / 2.0f;
                        edVar7.d = Math.abs(f25 - f24) / 2.0f;
                        ed edVar8 = edVarArr4[i20];
                        edVar8.g = 0.0f;
                        if (!z10) {
                            edVar8.e.d(edVar8.c, true);
                            ed edVar9 = edVarArr4[i20];
                            edVar9.f.d(edVar9.d, true);
                            ed edVar10 = edVarArr4[i20];
                            edVar10.h.d(edVar10.g, true);
                        }
                    } else {
                        ed edVar11 = edVarArr4[i20];
                        edVar11.c = (f24 + f25) / 2.0f;
                        edVar11.d = Math.abs(f25 - f24) / 2.0f;
                        if (!z10) {
                            ed edVar12 = edVarArr4[i20];
                            edVar12.e.d(edVar12.c, true);
                            ed edVar13 = edVarArr4[i20];
                            edVar13.f.d(edVar13.d, true);
                        }
                        f20 += f11;
                        i19++;
                    }
                    i18 = i21 + 1;
                    fdVarArr2 = fdVarArr;
                    q6Var2 = q6Var6;
                    q6Var = q6Var5;
                    f19 = f22;
                    spannableString2 = spannableString3;
                }
            } else {
                f7 = f21;
            }
            f10 = 0.85f;
            edVar4.i = f10;
            edVar4.l = f15;
            if (z10) {
            }
            edVar = edVarArr4[i20];
            if (edVar.g > 0.0f) {
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
            fdVarArr2 = fdVarArr;
            q6Var2 = q6Var6;
            q6Var = q6Var5;
            f19 = f22;
            spannableString2 = spannableString3;
        }
        q6 q6Var7 = q6Var;
        q6 q6Var8 = q6Var2;
        String[] split = AndroidUtilities.formatFileSize(j14, true, true).split(" ");
        String str = split.length > 0 ? split[0] : "";
        if (str.length() >= 4 && j14 < 1073741824) {
            str = str.split("\\.")[0];
        }
        q6Var4.t(str, z10, true);
        q6Var3.t(split.length > 1 ? split[1] : "", z10, true);
        if (g6Var2.c > 0.0f) {
            q6Var8.t(q6Var4.i, z10, true);
            q6Var7.t(q6Var3.i, z10, true);
        }
        this.r = false;
        if (!z10) {
            g6Var2.d(0.0f, true);
        }
        invalidate();
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.S = true;
        int i10 = 0;
        while (true) {
            ed[] edVarArr = this.v;
            if (i10 >= edVarArr.length) {
                return;
            }
            ed edVar = edVarArr[i10];
            if (edVar.b == null) {
                boolean z10 = this.e;
                int[] iArr = this.f;
                if (z10) {
                    edVar.b = SvgHelper.getBitmap(iArr[i10], AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), -1);
                } else {
                    edVar.b = BitmapFactory.decodeResource(getContext().getResources(), iArr[i10]);
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
            ed[] edVarArr = this.v;
            if (i10 >= edVarArr.length) {
                return;
            }
            Bitmap bitmap = edVarArr[i10].b;
            if (bitmap != null) {
                bitmap.recycle();
                edVarArr[i10].b = null;
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
        rg.v1 v1Var = this.Q;
        if (v1Var != null) {
            v1Var.a.set(0.0f, 0.0f, AndroidUtilities.dp(140.0f), AndroidUtilities.dp(140.0f));
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
            ed[] edVarArr = this.v;
            if (i11 >= edVarArr.length) {
                this.T = i10;
                invalidate();
                return;
            }
            if (i10 == i11 && edVarArr[i11].d <= 0.0f) {
                i10 = -1;
            }
            edVarArr[i11].n = i10 == i11;
            i11++;
        }
    }
}
