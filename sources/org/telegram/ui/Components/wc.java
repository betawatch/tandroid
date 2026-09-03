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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public abstract class wc extends View {
    public static final int[] T;
    public static final int[] U;
    public static long V;
    public static Long W;
    public static Long a0;
    public RectF B;
    public final Path C;
    public final Paint D;
    public final Paint E;
    public final LinearGradient F;
    public final LinearGradient G;
    public final Matrix H;
    public final Matrix I;
    public final j6 J;
    public final j6 K;
    public final j6 L;
    public final j6 M;
    public eg.p2 N;
    public boolean O;
    public boolean P;
    public int Q;
    public int[] R;
    public float[] S;
    public final RectF a;
    public final RectF b;
    public final RectF c;
    public final int d;
    public final boolean e;
    public final int[] f;
    public boolean h;
    public final z5 n;
    public boolean r;
    public final z5 s;
    public final uc[] v;
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
        T = new int[]{i10, i11, i12, i13, i14, i15, i16, i17, i13, i18, i18};
        int i19 = R.raw.cache_photos;
        int i20 = R.raw.cache_videos;
        int i21 = R.raw.cache_documents;
        int i22 = R.raw.cache_music;
        int i23 = R.raw.cache_stickers;
        int i24 = R.raw.cache_profile_photos;
        int i25 = R.raw.cache_other;
        U = new int[]{i19, i20, i21, i22, i20, i22, i23, i24, i25, i25, i21};
        V = -1L;
    }

    public wc(Context context, int i10, int[] iArr, int i11, int[] iArr2) {
        super(context);
        this.a = new RectF();
        this.b = new RectF();
        this.c = new RectF();
        this.h = true;
        mr mrVar = mr.h;
        this.n = new z5(this, 750L, mrVar);
        this.r = false;
        this.s = new z5(this, 650L, mrVar);
        this.w = new float[2];
        this.x = new RectF();
        Paint paint = new Paint(1);
        this.y = paint;
        this.C = new Path();
        Paint paint2 = new Paint(1);
        this.D = paint2;
        Paint paint3 = new Paint(1);
        this.E = paint3;
        j6 j6Var = new j6(false, true, true, false);
        this.J = j6Var;
        j6 j6Var2 = new j6(false, true, true, false);
        this.K = j6Var2;
        j6 j6Var3 = new j6(false, true, true, false);
        this.L = j6Var3;
        j6 j6Var4 = new j6(false, true, true, false);
        this.M = j6Var4;
        this.O = true;
        this.Q = -1;
        setLayerType(2, null);
        this.f = iArr2;
        this.d = i11;
        this.e = i11 == 0;
        this.v = new uc[i10];
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.i6, false));
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(200.0f), new int[]{7263574, -9513642, -12469647, 4307569}, new float[]{0.0f, 0.07f, 0.93f, 1.0f}, tileMode);
        this.F = linearGradient;
        LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(200.0f), new int[]{7263574, -9513642, -12469647, 4307569}, new float[]{0.0f, 0.07f, 0.93f, 1.0f}, tileMode);
        this.G = linearGradient2;
        this.H = new Matrix();
        this.I = new Matrix();
        paint2.setShader(linearGradient);
        paint3.setShader(linearGradient);
        paint2.setStyle(style);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        paint2.setStrokeJoin(Paint.Join.ROUND);
        j6Var.k(0.2f, 450L, mrVar);
        j6Var.v = 0.6f;
        j6Var.r(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false));
        j6Var.u(AndroidUtilities.bold());
        j6Var.t(AndroidUtilities.dp(32.0f));
        j6Var.b = 17;
        j6Var2.k(0.6f, 450L, mrVar);
        j6Var2.v = 0.6f;
        j6Var2.r(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.y6, false));
        j6Var2.t(AndroidUtilities.dp(12.0f));
        j6Var2.b = 17;
        j6Var3.k(0.2f, 450L, mrVar);
        j6Var3.v = 0.6f;
        j6Var3.a.setShader(linearGradient2);
        j6Var3.u(AndroidUtilities.bold());
        j6Var3.t(AndroidUtilities.dp(32.0f));
        j6Var3.b = 17;
        j6Var4.k(0.6f, 450L, mrVar);
        j6Var4.v = 0.6f;
        j6Var4.a.setShader(linearGradient2);
        j6Var4.u(AndroidUtilities.bold());
        j6Var4.t(AndroidUtilities.dp(12.0f));
        j6Var4.b = 17;
        int i12 = 0;
        while (true) {
            uc[] ucVarArr = this.v;
            if (i12 >= ucVarArr.length) {
                return;
            }
            uc ucVar = new uc(this);
            ucVarArr[i12] = ucVar;
            int v = org.telegram.ui.ActionBar.j6.v(org.telegram.ui.ActionBar.j6.w0(null, iArr[i12], false), ConnectionsManager.FileTypeAudio);
            int v10 = org.telegram.ui.ActionBar.j6.v(org.telegram.ui.ActionBar.j6.w0(null, iArr[i12], false), 822083583);
            AndroidUtilities.dp(50.0f);
            RadialGradient radialGradient = new RadialGradient(0.0f, 0.0f, AndroidUtilities.dp(86.0f), new int[]{v10, v}, new float[]{0.3f, 1.0f}, Shader.TileMode.CLAMP);
            ucVar.v = radialGradient;
            Matrix matrix = new Matrix();
            ucVar.w = matrix;
            radialGradient.setLocalMatrix(matrix);
            ucVar.q.setShader(ucVar.v);
            i12++;
        }
    }

    public static float a(float f10) {
        return (float) ((f10 / 180.0f) * 3.141592653589793d);
    }

    public static boolean b(Canvas canvas, j6 j6Var, float f10, float f11, float f12, float f13) {
        if (f13 <= 0.0f) {
            return false;
        }
        j6Var.w = (int) (f13 * 255.0f);
        j6Var.setBounds(0, 0, 0, 0);
        canvas.save();
        canvas.translate(f10, f11);
        canvas.scale(f12, f12);
        j6Var.draw(canvas);
        canvas.restore();
        return j6Var.f();
    }

    public int c() {
        return 200;
    }

    public abstract void d(int i10, boolean z4);

    /* JADX WARN: Code restructure failed: missing block: B:137:0x0734, code lost:
    
        if (r1.equals(r8) != false) goto L155;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        char c3;
        float f11;
        float f12;
        char c10;
        boolean z4;
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
        boolean z10;
        int i10;
        float f21;
        RectF rectF5;
        boolean z11;
        float f22;
        float f23;
        j6 j6Var;
        float f24;
        float f25;
        float f26;
        RectF rectF6;
        uc ucVar;
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
        if (W == null) {
            W = Long.valueOf(System.currentTimeMillis());
        }
        boolean z12 = this.h;
        if (!z12 && a0 == null) {
            a0 = Long.valueOf(System.currentTimeMillis());
        } else if (z12 && a0 != null) {
            a0 = null;
        }
        float currentTimeMillis = ((a0 == null ? System.currentTimeMillis() : r9.longValue()) - W.longValue()) * 0.6f;
        float[] fArr2 = this.w;
        qp.a(fArr2, currentTimeMillis % 5400.0f);
        float f27 = fArr2[0];
        float f28 = fArr2[1];
        if (d > 0.0f) {
            c3 = 1;
            Paint paint = this.y;
            paint.setStrokeWidth(lerp2);
            f11 = 1.0f;
            int alpha = paint.getAlpha();
            f12 = 0.0f;
            paint.setAlpha((int) (alpha * d));
            c10 = 0;
            f10 = d10;
            canvas2.drawCircle(rectF7.centerX(), rectF7.centerY(), (rectF7.width() - lerp2) / 2.0f, paint);
            paint.setAlpha(alpha);
        } else {
            f10 = d10;
            c3 = 1;
            f11 = 1.0f;
            f12 = 0.0f;
            c10 = 0;
        }
        boolean z13 = d > 0.0f || f10 > f12;
        int i11 = 0;
        while (true) {
            uc[] ucVarArr = this.v;
            if (i11 >= ucVarArr.length) {
                break;
            }
            uc ucVar2 = ucVarArr[i11];
            qp.a(fArr2, (currentTimeMillis + (i11 * 80)) % 5400.0f);
            float min = Math.min(Math.max(fArr2[c10], f27), f28);
            float min2 = Math.min(Math.max(fArr2[c3], f27), f28);
            if (d < f11 || min < min2) {
                RectF rectF10 = rectF8;
                float f29 = (min + min2) / 2.0f;
                float abs = Math.abs(min2 - min) / 2.0f;
                if (d <= f12) {
                    f13 = 360.0f;
                    float d11 = ucVar2.e.d(ucVar2.c, false);
                    abs = ucVar2.f.d(ucVar2.d, false);
                    rectF2 = rectF9;
                    f14 = lerp2;
                    f29 = d11;
                } else {
                    f13 = 360.0f;
                    rectF2 = rectF9;
                    if (d < f11) {
                        f14 = lerp2;
                        f29 = AndroidUtilities.lerp((((float) Math.floor(f28 / 360.0f)) * 360.0f) + ucVar2.e.d(ucVar2.c, false), f29, d);
                        abs = AndroidUtilities.lerp(ucVar2.f.d(ucVar2.d, false), abs, d);
                    } else {
                        f14 = lerp2;
                    }
                }
                boolean z14 = ucVar2.e.i || ucVar2.f.i || z13;
                float f30 = f11 - f10;
                float f31 = f11 - d;
                j6 j6Var2 = ucVar2.k;
                f15 = d;
                Path path = ucVar2.p;
                Paint paint2 = ucVar2.s;
                Paint paint3 = ucVar2.q;
                f16 = lerp3;
                RectF rectF11 = ucVar2.E.x;
                RectF rectF12 = ucVar2.u;
                f17 = f27;
                fArr = fArr2;
                float d12 = ucVar2.o.d(ucVar2.n ? 1.0f : 0.0f, false);
                rectF12.set(rectF7);
                rectF12.inset((-AndroidUtilities.dp(9.0f)) * d12, d12 * (-AndroidUtilities.dp(9.0f)));
                float width = (float) ((((rectF2.width() + rectF12.width()) * Math.cos(a(f29))) / 4.0d) + rectF12.centerX());
                rectF3 = rectF7;
                float width2 = (float) ((((rectF2.width() + rectF12.width()) * Math.sin(a(f29))) / 4.0d) + rectF12.centerY());
                float d13 = ucVar2.h.d(ucVar2.g, false) * f30 * f31;
                float d14 = ucVar2.m.d(ucVar2.l, false);
                paint3.setAlpha((int) (f30 * 255.0f));
                if (abs * 2.0f >= 359.0f) {
                    canvas2.saveLayerAlpha(rectF12, 255, 31);
                    canvas2.drawCircle(rectF12.centerX(), rectF12.centerY(), rectF12.width() / 2.0f, paint2);
                    canvas2.drawRect(rectF12, paint3);
                    f23 = d13;
                    f18 = f28;
                    ucVar2.a(canvas, rectF12.centerX(), rectF12.centerY(), width, width2, 0.0f, 359.0f, rectF2.width() / 2.0f, rectF12.width() / 2.0f, f23, Math.max(0.0f, (f31 / 0.75f) - 0.75f) * d14);
                    ucVar = ucVar2;
                    canvas2 = canvas;
                    canvas2.drawCircle(rectF2.centerX(), rectF2.centerY(), rectF2.width() / 2.0f, ucVar.t);
                    canvas2.restore();
                    i10 = i11;
                    rectF4 = rectF10;
                    z11 = z14;
                    f22 = f10;
                    rectF6 = rectF11;
                    j6Var = j6Var2;
                    f24 = width;
                    f25 = width2;
                    f26 = 0.0f;
                } else {
                    rectF4 = rectF10;
                    f18 = f28;
                    float min3 = Math.min(Math.min(f16, (rectF12.width() - rectF2.width()) / 4.0f), (float) ((rectF2.width() / 2.0f) * (abs / 180.0f) * 3.141592653589793d));
                    float width3 = (rectF12.width() - rectF2.width()) / 2.0f;
                    if (ucVar2.x == f29 && ucVar2.y == abs && ucVar2.z == min3 && ucVar2.A == width3 && ucVar2.B == rectF12.width() && ucVar2.C == rectF12.centerX() && ucVar2.D == rectF12.centerY()) {
                        f19 = f29;
                    } else {
                        ucVar2.x = f29;
                        ucVar2.y = abs;
                        ucVar2.z = min3;
                        ucVar2.A = width3;
                        ucVar2.B = rectF12.width();
                        ucVar2.C = rectF12.centerX();
                        ucVar2.D = rectF12.centerY();
                        float f32 = f29 - abs;
                        float f33 = f29 + abs;
                        boolean z15 = min3 > 0.0f;
                        float f34 = min3 * 2.0f;
                        f19 = f29;
                        float width4 = (min3 / ((float) ((rectF12.width() - f34) * 3.141592653589793d))) * f13;
                        float width5 = ((abs > 175.0f ? 0 : 1) * 0.5f) + ((min3 / ((float) ((rectF2.width() + f34) * 3.141592653589793d))) * f13);
                        float width6 = (rectF12.width() / 2.0f) - min3;
                        float width7 = (rectF2.width() / 2.0f) + min3;
                        path.rewind();
                        float f35 = f33 - f32;
                        if (f35 >= 0.5f) {
                            if (z15) {
                                f20 = f33;
                                double d15 = width6;
                                float f36 = f32 + width4;
                                double a2 = kf.k0.a(a(f36), d15, rectF12.centerX());
                                z10 = z15;
                                i10 = i11;
                                f21 = abs;
                                double sin = (Math.sin(a(f36)) * d15) + rectF12.centerY();
                                float f37 = (float) a2;
                                float f38 = (float) sin;
                                rectF11.set(f37 - min3, f38 - min3, f37 + min3, f38 + min3);
                                path.arcTo(rectF11, f36 - 90.0f, 90.0f);
                            } else {
                                f20 = f33;
                                z10 = z15;
                                i10 = i11;
                                f21 = abs;
                            }
                            path.arcTo(rectF12, f32 + width4, f35 - (width4 * 2.0f));
                            if (z10) {
                                double d16 = width6;
                                float a10 = (float) kf.k0.a(a(r4), d16, rectF12.centerX());
                                float sin2 = (float) ((Math.sin(a(r4)) * d16) + rectF12.centerY());
                                rectF11.set(a10 - min3, sin2 - min3, a10 + min3, sin2 + min3);
                                path.arcTo(rectF11, f20 - width4, 90.0f);
                                double d17 = width7;
                                float a11 = (float) kf.k0.a(a(r4), d17, rectF2.centerX());
                                float sin3 = (float) ((Math.sin(a(r4)) * d17) + rectF2.centerY());
                                rectF11.set(a11 - min3, sin3 - min3, a11 + min3, sin3 + min3);
                                path.arcTo(rectF11, (f20 - width5) + 90.0f, 90.0f);
                            }
                            rectF5 = rectF2;
                            path.arcTo(rectF5, f20 - width5, -(f35 - (width5 * 2.0f)));
                            if (z10) {
                                double d18 = width7;
                                float f39 = f32 + width5;
                                double a12 = kf.k0.a(a(f39), d18, rectF5.centerX());
                                double sin4 = (Math.sin(a(f39)) * d18) + rectF5.centerY();
                                float f40 = (float) a12;
                                float f41 = (float) sin4;
                                rectF11.set(f40 - min3, f41 - min3, f40 + min3, f41 + min3);
                                path.arcTo(rectF11, f39 + 180.0f, 90.0f);
                            }
                            path.close();
                            path.computeBounds(ucVar2.r, false);
                            float centerX = rectF12.centerX();
                            float centerY = rectF3.centerY();
                            rectF12.width();
                            ucVar2.w.reset();
                            ucVar2.w.setTranslate(centerX, centerY);
                            ucVar2.v.setLocalMatrix(ucVar2.w);
                            canvas2.saveLayerAlpha(rectF12, 255, 31);
                            canvas2.drawPath(path, paint2);
                            canvas2.drawRect(rectF12, paint3);
                            rectF2 = rectF5;
                            z11 = z14;
                            f22 = f10;
                            f23 = d13;
                            j6Var = j6Var2;
                            f24 = width;
                            f25 = width2;
                            f26 = 0.0f;
                            rectF6 = rectF11;
                            ucVar2.a(canvas, rectF12.centerX(), rectF12.centerY(), f24, f25, f19 - f21, f19 + f21, rectF5.width() / 2.0f, rectF12.width() / 2.0f, f23, Math.max(0.0f, (f31 / 0.75f) - 0.75f) * d14);
                            ucVar = ucVar2;
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
                    ucVar2.w.reset();
                    ucVar2.w.setTranslate(centerX2, centerY2);
                    ucVar2.v.setLocalMatrix(ucVar2.w);
                    canvas2.saveLayerAlpha(rectF12, 255, 31);
                    canvas2.drawPath(path, paint2);
                    canvas2.drawRect(rectF12, paint3);
                    rectF2 = rectF5;
                    z11 = z14;
                    f22 = f10;
                    f23 = d13;
                    j6Var = j6Var2;
                    f24 = width;
                    f25 = width2;
                    f26 = 0.0f;
                    rectF6 = rectF11;
                    ucVar2.a(canvas, rectF12.centerX(), rectF12.centerY(), f24, f25, f19 - f21, f19 + f21, rectF5.width() / 2.0f, rectF12.width() / 2.0f, f23, Math.max(0.0f, (f31 / 0.75f) - 0.75f) * d14);
                    ucVar = ucVar2;
                    canvas2 = canvas;
                    canvas2.restore();
                }
                float d19 = ucVar.j.d(ucVar.i, false);
                rectF6.set(f24 - f26, f25 - f26, f24 + f26, f25 + f26);
                if (d19 != f11) {
                    canvas2.save();
                    canvas2.scale(d19, d19, rectF6.centerX(), rectF6.centerY());
                }
                j6Var.w = (int) (f23 * 255.0f);
                j6Var.setBounds((int) rectF6.left, (int) rectF6.top, (int) rectF6.right, (int) rectF6.bottom);
                j6Var.draw(canvas2);
                if (d19 != f11) {
                    canvas2.restore();
                }
                z13 = z11;
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
            c3 = 1;
            f12 = 0.0f;
            c10 = 0;
        }
        float f42 = d;
        RectF rectF13 = rectF7;
        RectF rectF14 = rectF8;
        float f43 = lerp2;
        float f44 = f10;
        j6 j6Var3 = this.K;
        j6 j6Var4 = this.J;
        int i12 = this.d;
        if (i12 == 0) {
            float f45 = (f11 - f44) * (f11 - f42);
            if (b(canvas2, j6Var4, rectF13.centerX(), rectF13.centerY() - AndroidUtilities.dpf2(5.0f), 1.0f, f45) || z13) {
            }
            b(canvas, j6Var3, rectF13.centerX(), AndroidUtilities.dpf2(22.0f) + rectF13.centerY(), 1.0f, f45);
            z4 = true;
        } else {
            z4 = true;
            if (i12 == 1) {
                float f46 = f11 - f42;
                float centerX3 = rectF13.centerX() - AndroidUtilities.lerp(0.0f, AndroidUtilities.dpf2(4.0f), f44);
                float centerY3 = rectF13.centerY() - AndroidUtilities.lerp(AndroidUtilities.dpf2(5.0f), 0.0f, f44);
                float lerp4 = AndroidUtilities.lerp(1.0f, 2.25f, f44);
                float f47 = f46 * f44;
                boolean z16 = b(canvas, this.L, centerX3, centerY3, lerp4, f47) || z13;
                float f48 = (1.0f - f44) * f46;
                boolean z17 = b(canvas, j6Var4, centerX3, centerY3, lerp4, f48) || z16;
                float lerp5 = AndroidUtilities.lerp(0.0f, AndroidUtilities.dpf2(26.0f), f44) + rectF13.centerX();
                float lerp6 = AndroidUtilities.lerp(AndroidUtilities.dpf2(22.0f), -AndroidUtilities.dpf2(18.0f), f44) + rectF13.centerY();
                float lerp7 = AndroidUtilities.lerp(1.0f, 1.4f, f44);
                if (b(canvas, this.M, lerp5, lerp6, lerp7, f47) || z17) {
                }
                b(canvas, j6Var3, lerp5, lerp6, lerp7, f48);
            }
        }
        if (f44 > 0.0f) {
            if (this.N == null) {
                eg.p2 p2Var = new eg.p2(25);
                this.N = p2Var;
                p2Var.N = 100;
                p2Var.M = z4;
                p2Var.G = z4;
                p2Var.K = false;
                p2Var.H = z4;
                p2Var.r = 18;
                p2Var.B = false;
                p2Var.j = AndroidUtilities.dp(80.0f);
                eg.p2 p2Var2 = this.N;
                p2Var2.w = 0.85f;
                p2Var2.v = 0.85f;
                p2Var2.u = 0.85f;
                p2Var2.c();
                rectF = rectF14;
            } else {
                RectF rectF15 = this.B;
                rectF = rectF14;
                if (rectF15 != null) {
                }
            }
            float min4 = Math.min(getMeasuredHeight(), Math.min(getMeasuredWidth(), AndroidUtilities.dp(150.0f)));
            this.N.a.set(0.0f, 0.0f, min4, min4);
            this.N.a.offset((getMeasuredWidth() - this.N.a.width()) / 2.0f, (getMeasuredHeight() - this.N.a.height()) / 2.0f);
            this.N.b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            this.N.f();
            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
            this.N.e(canvas, f44);
            int i13 = (int) (f44 * 255.0f);
            Paint paint4 = this.E;
            paint4.setAlpha(i13);
            canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint4);
            canvas.restore();
            Paint paint5 = this.D;
            paint5.setStrokeWidth(f43);
            paint5.setAlpha(i13);
            canvas.drawCircle(rectF13.centerX(), rectF13.centerY(), (rectF13.width() - f43) / 2.0f, paint5);
            RectF rectF16 = this.B;
            Path path2 = this.C;
            if (rectF16 == null || !rectF16.equals(rectF)) {
                if (this.B == null) {
                    this.B = new RectF();
                }
                this.B.set(rectF);
                path2.rewind();
                if (i12 == 0) {
                    path2.moveTo(rectF13.width() * 0.348f, rectF13.height() * 0.538f);
                    path2.lineTo(rectF13.width() * 0.447f, rectF13.height() * 0.636f);
                    path2.lineTo(rectF13.width() * 0.678f, rectF13.height() * 0.402f);
                } else if (i12 == z4) {
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
        if (this.P) {
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
        float y10 = motionEvent.getY();
        RectF rectF = this.b;
        float a2 = k7.n6.a(rectF.centerX(), rectF.centerY(), x10, y10);
        float atan2 = (float) ((Math.atan2(y10 - rectF.centerY(), x10 - rectF.centerX()) / 3.141592653589793d) * 180.0d);
        if (atan2 < 0.0f) {
            atan2 += 360.0f;
        }
        if (a2 > this.c.width() / 2.0f && a2 < (rectF.width() / 2.0f) + AndroidUtilities.dp(14.0f)) {
            i10 = 0;
            while (true) {
                uc[] ucVarArr = this.v;
                if (i10 >= ucVarArr.length) {
                    break;
                }
                uc ucVar = ucVarArr[i10];
                float f10 = ucVar.c;
                float f11 = ucVar.d;
                if (atan2 >= f10 - f11 && atan2 <= f10 + f11) {
                    break;
                }
                i10++;
            }
            if (motionEvent.getAction() != 0) {
                setSelected(i10);
                if (i10 >= 0) {
                    d(i10, i10 != -1);
                    if (getParent() != null && this.O) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                        return true;
                    }
                }
            } else {
                if (motionEvent.getAction() != 2) {
                    if (motionEvent.getAction() == 1) {
                        boolean z4 = i10 != -1;
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
    public final void f(long j10, boolean z4, vc... vcVarArr) {
        boolean z10;
        float f10;
        float f11;
        boolean z11;
        uc ucVar;
        float f12;
        uc[] ucVarArr;
        float[] fArr;
        float f13;
        int i10;
        long j11;
        float f14;
        float f15;
        boolean z12;
        long j12;
        boolean z13;
        vc[] vcVarArr2 = vcVarArr;
        z5 z5Var = this.n;
        z5 z5Var2 = this.s;
        j6 j6Var = this.M;
        j6 j6Var2 = this.L;
        j6 j6Var3 = this.K;
        j6 j6Var4 = this.J;
        uc[] ucVarArr2 = this.v;
        float f16 = 1.0f;
        if (vcVarArr2 == null || vcVarArr2.length == 0) {
            this.h = false;
            this.r = j10 == 0;
            if (z4) {
                z10 = true;
            } else {
                z10 = true;
                z5Var.d(0.0f, true);
                z5Var2.d(this.r ? 1.0f : 0.0f, true);
            }
            j6Var2.q(j6Var4.g, false, z10);
            j6Var4.q("0", z4, z10);
            j6Var2.q("0", z4, z10);
            j6Var.q(j6Var3.g, false, z10);
            j6Var3.q("KB", z4, z10);
            j6Var.q("KB", z4, z10);
            for (uc ucVar2 : ucVarArr2) {
                ucVar2.g = 0.0f;
                if (!z4) {
                    ucVar2.h.d(0.0f, z10);
                }
            }
            invalidate();
            return;
        }
        this.h = false;
        if (!z4) {
            z5Var.d(0.0f, true);
        }
        SpannableString spannableString = new SpannableString("%");
        int length = vcVarArr2.length;
        SpannableString spannableString2 = spannableString;
        long j13 = 0;
        int i11 = 0;
        while (i11 < vcVarArr2.length) {
            if (vcVarArr2[i11] == null) {
                vc vcVar = new vc();
                vcVarArr2[i11] = vcVar;
                j12 = j13;
                vcVar.c = 0L;
            } else {
                j12 = j13;
            }
            vc vcVar2 = vcVarArr2[i11];
            vcVar2.a = i11;
            boolean z14 = vcVar2.b;
            if (z14) {
                z13 = z14;
                j12 += vcVar2.c;
            } else {
                z13 = z14;
            }
            if (vcVar2.c <= 0 || !z13) {
                length--;
            }
            i11++;
            j13 = j12;
        }
        long j14 = j13;
        if (j14 <= 0) {
            this.h = false;
            this.r = j10 <= 0;
            if (z4) {
                z12 = true;
            } else {
                z12 = true;
                z5Var.d(0.0f, true);
                z5Var2.d(this.r ? 1.0f : 0.0f, true);
            }
            j6Var2.q(j6Var4.g, false, z12);
            j6Var4.q("0", z4, z12);
            j6Var2.q("0", z4, z12);
            j6Var.q(j6Var3.g, false, z12);
            j6Var3.q("KB", z4, z12);
            j6Var.q("KB", z4, z12);
            int i12 = 0;
            while (i12 < ucVarArr2.length) {
                uc ucVar3 = ucVarArr2[i12];
                ucVar3.g = 0.0f;
                if (!z4) {
                    ucVar3.h.d(0.0f, z12);
                }
                i12++;
                z12 = true;
            }
            invalidate();
            return;
        }
        uc[] ucVarArr3 = ucVarArr2;
        int i13 = 0;
        int i14 = 0;
        float f17 = 0.0f;
        while (i13 < vcVarArr2.length) {
            vc vcVar3 = vcVarArr2[i13];
            if (vcVar3 == null || !vcVar3.b) {
                i10 = i13;
                j11 = j14;
                f14 = 0.02f;
                f15 = 0.0f;
            } else {
                f14 = 0.02f;
                i10 = i13;
                j11 = j14;
                f15 = vcVar3.c / j11;
            }
            if (f15 > 0.0f && f15 < f14) {
                i14++;
                f17 += f15;
            }
            i13 = i10 + 1;
            j14 = j11;
        }
        long j15 = j14;
        Math.min(vcVarArr2.length, ucVarArr3.length);
        int[] iArr = this.R;
        if (iArr == null || iArr.length != vcVarArr2.length) {
            this.R = new int[vcVarArr2.length];
        }
        float[] fArr2 = this.S;
        if (fArr2 == null || fArr2.length != vcVarArr2.length) {
            this.S = new float[vcVarArr2.length];
        }
        int i15 = 0;
        while (i15 < vcVarArr2.length) {
            float[] fArr3 = this.S;
            int i16 = i15;
            vc vcVar4 = vcVarArr2[i16];
            float f18 = f17;
            if (vcVar4 != null) {
                ucVarArr = ucVarArr3;
                if (vcVar4.b) {
                    fArr = fArr3;
                    f13 = vcVar4.c / j15;
                    fArr[i16] = f13;
                    i15 = i16 + 1;
                    f17 = f18;
                    ucVarArr3 = ucVarArr;
                }
            } else {
                ucVarArr = ucVarArr3;
            }
            fArr = fArr3;
            f13 = 0.0f;
            fArr[i16] = f13;
            i15 = i16 + 1;
            f17 = f18;
            ucVarArr3 = ucVarArr;
        }
        float f19 = f17;
        uc[] ucVarArr4 = ucVarArr3;
        AndroidUtilities.roundPercents(this.S, this.R);
        if (this.d == 0) {
            Arrays.sort(vcVarArr2, new nh.e4(19));
            int i17 = 0;
            while (true) {
                if (i17 > vcVarArr2.length) {
                    break;
                }
                vc vcVar5 = vcVarArr2[i17];
                if (vcVar5.a == vcVarArr2.length - 1) {
                    vc vcVar6 = vcVarArr2[0];
                    vcVarArr2[0] = vcVar5;
                    vcVarArr2[i17] = vcVar6;
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
        while (i18 < vcVarArr2.length) {
            vc vcVar7 = vcVarArr2[i18];
            int i20 = vcVar7.a;
            int i21 = i18;
            float f22 = !vcVar7.b ? 0.0f : vcVar7.c / j15;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            float f23 = f20;
            spannableStringBuilder.append((CharSequence) String.format("%d", Integer.valueOf(this.R[i20])));
            SpannableString spannableString3 = spannableString2;
            spannableStringBuilder.append((CharSequence) spannableString3);
            uc ucVar4 = ucVarArr4[i20];
            j6 j6Var5 = j6Var;
            j6 j6Var6 = j6Var2;
            float f24 = (((double) f22) <= 0.05d || f22 >= f16) ? 0.0f : 1.0f;
            ucVar4.g = f24;
            if (f22 >= 0.08f) {
                f10 = f22;
                if (this.R[i20] < 100) {
                    f11 = 1.0f;
                    ucVar4.i = f11;
                    ucVar4.l = 1.0f;
                    if (z4) {
                        z5 z5Var3 = ucVar4.h;
                        z11 = true;
                        z5Var3.d(f24, true);
                        uc ucVar5 = ucVarArr4[i20];
                        ucVar5.j.d(ucVar5.i, true);
                        uc ucVar6 = ucVarArr4[i20];
                        ucVar6.m.d(ucVar6.l, true);
                    } else {
                        z11 = true;
                    }
                    ucVar = ucVarArr4[i20];
                    if (ucVar.g > 0.0f) {
                        ucVar.k.q(spannableStringBuilder, z4, z11);
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
                        uc ucVar7 = ucVarArr4[i20];
                        ucVar7.c = (f25 + f26) / 2.0f;
                        ucVar7.d = Math.abs(f26 - f25) / 2.0f;
                        uc ucVar8 = ucVarArr4[i20];
                        ucVar8.g = 0.0f;
                        if (!z4) {
                            ucVar8.e.d(ucVar8.c, true);
                            uc ucVar9 = ucVarArr4[i20];
                            ucVar9.f.d(ucVar9.d, true);
                            uc ucVar10 = ucVarArr4[i20];
                            ucVar10.h.d(ucVar10.g, true);
                        }
                    } else {
                        uc ucVar11 = ucVarArr4[i20];
                        ucVar11.c = (f25 + f26) / 2.0f;
                        ucVar11.d = Math.abs(f26 - f25) / 2.0f;
                        if (!z4) {
                            uc ucVar12 = ucVarArr4[i20];
                            ucVar12.e.d(ucVar12.c, true);
                            uc ucVar13 = ucVarArr4[i20];
                            ucVar13.f.d(ucVar13.d, true);
                        }
                        f21 += f12;
                        i19++;
                    }
                    i18 = i21 + 1;
                    vcVarArr2 = vcVarArr;
                    j6Var2 = j6Var6;
                    j6Var = j6Var5;
                    f20 = f23;
                    spannableString2 = spannableString3;
                }
            } else {
                f10 = f22;
            }
            f11 = 0.85f;
            ucVar4.i = f11;
            ucVar4.l = 1.0f;
            if (z4) {
            }
            ucVar = ucVarArr4[i20];
            if (ucVar.g > 0.0f) {
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
            vcVarArr2 = vcVarArr;
            j6Var2 = j6Var6;
            j6Var = j6Var5;
            f20 = f23;
            spannableString2 = spannableString3;
        }
        j6 j6Var7 = j6Var;
        j6 j6Var8 = j6Var2;
        String[] split = AndroidUtilities.formatFileSize(j15, true, true).split(" ");
        String str = split.length > 0 ? split[0] : "";
        if (str.length() >= 4 && j15 < 1073741824) {
            str = str.split("\\.")[0];
        }
        j6Var4.q(str, z4, true);
        j6Var3.q(split.length > 1 ? split[1] : "", z4, true);
        if (z5Var2.c > 0.0f) {
            j6Var8.q(j6Var4.g, z4, true);
            j6Var7.q(j6Var3.g, z4, true);
        }
        this.r = false;
        if (!z4) {
            z5Var2.d(0.0f, true);
        }
        invalidate();
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.P = true;
        int i10 = 0;
        while (true) {
            uc[] ucVarArr = this.v;
            if (i10 >= ucVarArr.length) {
                return;
            }
            uc ucVar = ucVarArr[i10];
            if (ucVar.b == null) {
                boolean z4 = this.e;
                int[] iArr = this.f;
                if (z4) {
                    ucVar.b = SvgHelper.getBitmap(iArr[i10], AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), -1);
                } else {
                    ucVar.b = BitmapFactory.decodeResource(getContext().getResources(), iArr[i10]);
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
        this.P = false;
        while (true) {
            uc[] ucVarArr = this.v;
            if (i10 >= ucVarArr.length) {
                return;
            }
            Bitmap bitmap = ucVarArr[i10].b;
            if (bitmap != null) {
                bitmap.recycle();
                ucVarArr[i10].b = null;
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
        Matrix matrix = this.H;
        matrix.reset();
        matrix.setTranslate(rectF.left, 0.0f);
        this.F.setLocalMatrix(matrix);
        Matrix matrix2 = this.I;
        matrix2.reset();
        matrix2.setTranslate(rectF.left, -rectF.centerY());
        this.G.setLocalMatrix(matrix2);
        eg.p2 p2Var = this.N;
        if (p2Var != null) {
            p2Var.a.set(0.0f, 0.0f, AndroidUtilities.dp(140.0f), AndroidUtilities.dp(140.0f));
            this.N.a.offset((getMeasuredWidth() - this.N.a.width()) / 2.0f, (getMeasuredHeight() - this.N.a.height()) / 2.0f);
            this.N.b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            this.N.f();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(dp, TLObject.FLAG_30));
    }

    public void setInterceptTouch(boolean z4) {
        this.O = z4;
    }

    public void setSelected(int i10) {
        if (i10 == this.Q) {
            return;
        }
        int i11 = 0;
        while (true) {
            uc[] ucVarArr = this.v;
            if (i11 >= ucVarArr.length) {
                this.Q = i10;
                invalidate();
                return;
            }
            if (i10 == i11 && ucVarArr[i11].d <= 0.0f) {
                i10 = -1;
            }
            ucVarArr[i11].n = i10 == i11;
            i11++;
        }
    }
}
