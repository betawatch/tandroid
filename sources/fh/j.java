package fh;

import a4.w;
import ag.i0;
import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import eg.n;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.x3;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.s1;
import org.telegram.ui.Components.ub;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class j extends Drawable implements Animator.AnimatorListener {
    public static final RectF X = new RectF();
    public static final Rect Y = new Rect();
    public static final int[] Z = new int[2];
    public static final g a0 = new g("openFactor", 0);
    public static final g b0 = new g("openFactor", 1);
    public final MessageObject A;
    public float B;
    public Bitmap E;
    public BitmapShader F;
    public Paint H;
    public b L;
    public boolean O;
    public boolean P;
    public int Q;
    public int R;
    public ub S;
    public float T;
    public float U;
    public final k a;
    public final ef.c b;
    public final LinearGradient f;
    public final d[] w;
    public final Drawable x;
    public final s1 y;
    public final Paint c = new Paint(1);
    public final Matrix d = new Matrix();
    public final Path e = new Path();
    public final RectF h = new RectF();
    public final RectF n = new RectF();
    public final RectF r = new RectF();
    public final RectF s = new RectF();
    public final RectF v = new RectF();
    public float C = 0.0f;
    public float D = 0.0f;
    public final Matrix G = new Matrix();
    public boolean I = false;
    public boolean J = false;
    public boolean K = false;
    public boolean M = true;
    public int N = -1;
    public final ObjectAnimator V = ObjectAnimator.ofFloat(this, a0, 1.0f).setDuration(560L);
    public final ObjectAnimator W = ObjectAnimator.ofFloat(this, b0, 1.0f).setDuration(240L);

    public j(k kVar, s1 s1Var, ArrayList arrayList, ef.c cVar) {
        this.b = cVar;
        this.a = kVar;
        this.y = s1Var;
        this.A = s1Var.getMessageObject();
        this.w = new d[Math.min(5, arrayList.size())];
        int i10 = 0;
        while (true) {
            d[] dVarArr = this.w;
            if (i10 >= dVarArr.length) {
                this.c.setStyle(Paint.Style.FILL);
                Drawable mutate = kVar.getContext().getDrawable(R.drawable.reactions_bubble_shadow).mutate();
                this.x = mutate;
                s1Var.setHideSideButtonByQuickShare(true);
                kVar.performHapticFeedback(3, 1);
                int v02 = g6.v0(g6.G8, this.y.getResourcesProvider());
                mutate.setColorFilter(new PorterDuffColorFilter(g6.w0(null, g6.Td, false), PorterDuff.Mode.MULTIPLY));
                LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(100.0f), new int[]{v02, 16777215 & v02}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                this.f = linearGradient;
                this.c.setShader(linearGradient);
                ObjectAnimator objectAnimator = this.V;
                LinearInterpolator linearInterpolator = h.b;
                objectAnimator.setInterpolator(linearInterpolator);
                this.V.addListener(this);
                this.W.setInterpolator(linearInterpolator);
                this.W.addListener(this);
                AndroidUtilities.makeGlobalBlurBitmap(new i0(this, 13), 15.0f);
                return;
            }
            dVarArr[i10] = new d(this, ((Long) arrayList.get(i10)).longValue());
            i10++;
        }
    }

    public static float b(float f9, float f10, float f11, float f12) {
        return (float) Math.toDegrees((float) Math.atan2(f12 - f10, f11 - f9));
    }

    public static PointF f(float f9, float f10, float f11, float f12, float f13, float f14, boolean z10) {
        float f15 = f12 - f9;
        float f16 = f13 - f10;
        float sqrt = (float) Math.sqrt(Math.pow(f16, 2.0d) + Math.pow(f15, 2.0d));
        if (sqrt > f11 + f14 || sqrt < Math.abs(f11 - f14)) {
            return null;
        }
        float f17 = ((sqrt * sqrt) + ((f11 * f11) - (f14 * f14))) / (2.0f * sqrt);
        float sqrt2 = (float) Math.sqrt(r8 - (f17 * f17));
        float d = w.d(f17, f15, sqrt, f9);
        float d10 = w.d(f17, f16, sqrt, f10);
        float f18 = (f16 * sqrt2) / sqrt;
        float f19 = d + f18;
        float f20 = (sqrt2 * f15) / sqrt;
        float f21 = d10 - f20;
        float f22 = d - f18;
        float f23 = d10 + f20;
        return (f19 == f22 || f19 >= f22) ? f21 > f23 ? new PointF(f19, f21) : new PointF(f22, f23) : z10 ? new PointF(f19, f21) : new PointF(f22, f23);
    }

    public static float g(float f9, float f10, float f11) {
        return com.google.android.recaptcha.internal.a.z(f10, f9, f11, f9);
    }

    public static e i(Interpolator interpolator, int i10, int i11, int i12, boolean z10) {
        float f9 = i12;
        return new e(z10, i10 / f9, i11 / f9, interpolator);
    }

    public static float j(float f9) {
        return f9 <= 0.0f ? f9 + 180.0f : f9 - 180.0f;
    }

    public final void a(Path path, RectF rectF, float f9, float f10, boolean z10, boolean z11) {
        float f11 = f10 - f9;
        if (z10) {
            if (f11 > 0.0f) {
                f11 -= 360.0f;
            }
        } else if (f11 < 0.0f) {
            f11 += 360.0f;
        }
        if (Math.abs(f11) > 270.0f && z11) {
            this.M = false;
        }
        path.arcTo(rectF, f9, f11);
    }

    public final void c() {
        this.W.start();
        this.K = true;
        if (this.I && !this.P) {
            b bVar = new b(new n(this, 3));
            this.L = bVar;
            RectF rectF = this.r;
            int width = (int) rectF.width();
            int height = (int) (rectF.height() + AndroidUtilities.dp(30.0f));
            int i10 = i.a;
            bVar.a(width, height, 4.0f, AndroidUtilities.dp(10));
        }
        invalidateSelf();
    }

    public final void d() {
        Bitmap bitmap;
        Bitmap bitmap2;
        Bitmap bitmap3;
        this.y.setHideSideButtonByQuickShare(false);
        if (this.P) {
            return;
        }
        this.P = true;
        Bitmap bitmap4 = this.E;
        if (bitmap4 != null) {
            bitmap4.recycle();
        }
        b bVar = this.L;
        if (bVar != null && (bitmap3 = bVar.c) != null) {
            bitmap3.recycle();
            bVar.c = null;
        }
        for (d dVar : this.w) {
            b bVar2 = dVar.f;
            if (bVar2 != null && (bitmap2 = bVar2.c) != null) {
                bitmap2.recycle();
                bVar2.c = null;
            }
            b bVar3 = dVar.e;
            if (bVar3 != null && (bitmap = bVar3.c) != null) {
                bitmap.recycle();
                bVar3.c = null;
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        e(canvas, false, 255);
    }

    public final void e(Canvas canvas, boolean z10, int i10) {
        int i11;
        k kVar;
        Canvas canvas2;
        int i12;
        float f9;
        int i13;
        j jVar = this;
        boolean z11 = jVar.O;
        k kVar2 = jVar.a;
        s1 s1Var = jVar.y;
        int i14 = 1;
        if (!z11) {
            int[] iArr = Z;
            s1Var.getLocationInWindow(iArr);
            int i15 = iArr[0];
            int i16 = iArr[1];
            kVar2.getLocationInWindow(iArr);
            int i17 = iArr[0];
            int i18 = iArr[1];
            jVar.Q = i15 - i17;
            jVar.R = i16 - i18;
            float dp = AndroidUtilities.dp(16.0f);
            float sideButtonStartX = s1Var.getSideButtonStartX() + jVar.Q + dp;
            float sideButtonStartY = s1Var.getSideButtonStartY() + jVar.R + dp;
            float f10 = sideButtonStartX - dp;
            float f11 = sideButtonStartY - dp;
            float f12 = sideButtonStartX + dp;
            float f13 = sideButtonStartY + dp;
            RectF rectF = jVar.h;
            rectF.set(f10, f11, f12, f13);
            float dp2 = AndroidUtilities.dp(16.0f);
            if (rectF.right + AndroidUtilities.dp(48.0f) + dp2 > kVar2.getMeasuredWidth()) {
                jVar.B = Math.max(0.0f, (kVar2.getMeasuredWidth() - dp2) - rectF.right);
            } else if (((rectF.right + AndroidUtilities.dp(48.0f)) - jVar.h()) - dp2 < 0.0f) {
                jVar.B = Math.max(0.0f, (dp2 + jVar.h()) - rectF.right);
            } else {
                jVar.B = AndroidUtilities.dp(48.0f);
            }
            jVar.V.start();
            jVar.O = true;
        }
        b bVar = jVar.L;
        d[] dVarArr = jVar.w;
        int i19 = 2;
        RectF rectF2 = jVar.r;
        if (bVar != null && !z10) {
            bVar.setBounds((int) rectF2.left, (int) (rectF2.top - AndroidUtilities.dp(30.0f)), (int) rectF2.right, (int) rectF2.bottom);
            jVar.L.i = (int) ((1.0f - h.c.getInterpolation(jVar.D)) * 255.0f);
            jVar.L.draw(canvas);
            if (jVar.N != -1) {
                float interpolation = 1.0f - h.e.getInterpolation(jVar.D);
                float interpolation2 = h.d.getInterpolation(jVar.D);
                int i20 = jVar.N - 2;
                float centerX = rectF2.centerX();
                int i21 = i.a;
                float dp3 = centerX + (AndroidUtilities.dp(i21 + 11) * i20);
                float centerY = rectF2.centerY();
                float f14 = jVar.T;
                float f15 = jVar.U;
                float f16 = (dp3 + f14) / 2.0f;
                ub ubVar = jVar.S;
                float min = (ubVar == null || !ubVar.top) ? Math.min(centerY, f15) - AndroidUtilities.dp(15) : Math.max(centerY, f15) + AndroidUtilities.dp(15);
                float g10 = g(dp3, f14, interpolation2);
                double d = dp3;
                double d10 = centerY;
                double d11 = f14;
                double d12 = f15;
                double d13 = f16;
                double d14 = d11 - d;
                double d15 = ((d11 * d) + ((d13 * d13) - (d11 * d13))) - (d13 * d);
                double d16 = d15 == 0.0d ? 0.0d : ((min - (((d12 - d10) * (d13 - d)) / d14)) - d10) / d15;
                double d17 = d * d;
                double d18 = d14 != 0.0d ? ((d12 - (((d11 * d11) - d17) * d16)) - d10) / d14 : 0.0d;
                double g11 = g(dp3, f14, interpolation2);
                float f17 = (float) ((d18 * g11) + (d16 * g11 * g11) + ((d10 - (d17 * d16)) - (d18 * d)));
                float f18 = i21;
                float g12 = g((AndroidUtilities.dp(f18) / 2.0f) + AndroidUtilities.dp(2.0f), AndroidUtilities.dp(12.0f), interpolation2);
                final d dVar = dVarArr[jVar.N];
                if (dVar.e == null) {
                    final int i22 = 1;
                    b bVar2 = new b(new a() { // from class: fh.c
                        @Override // fh.a
                        public final void p(Canvas canvas3, int i23) {
                            float f19;
                            switch (i22) {
                                case 0:
                                    d dVar2 = dVar;
                                    dVar2.getClass();
                                    canvas3.save();
                                    canvas3.translate(-dVar2.i, -dVar2.j);
                                    float f20 = dVar2.i;
                                    float f21 = dVar2.j;
                                    float f22 = i23 / 255.0f;
                                    RectF rectF3 = AndroidUtilities.rectTmp;
                                    float dp4 = AndroidUtilities.dp(21.0f) / 2.0f;
                                    int i24 = i.a;
                                    float f23 = 8;
                                    rectF3.set(f20, f21, dVar2.h.getWidth() + f20 + (AndroidUtilities.dp(f23) * 2), AndroidUtilities.dp(21.0f) + f21);
                                    s1 s1Var2 = dVar2.b;
                                    boolean R2 = s1Var2.R2();
                                    Paint paint = dVar2.g;
                                    if (paint != null) {
                                        int alpha = paint.getAlpha();
                                        paint.setAlpha((int) (255.0f * f22));
                                        canvas3.drawRoundRect(rectF3, dp4, dp4, paint);
                                        paint.setAlpha(alpha);
                                        f19 = 21.0f;
                                    } else {
                                        Point point = AndroidUtilities.displaySize;
                                        f19 = 21.0f;
                                        s1Var2.q0(0.0f, 0.0f, point.x, point.y);
                                        Paint M2 = s1Var2.M2("paintChatActionBackground");
                                        int alpha2 = M2.getAlpha();
                                        M2.setAlpha((int) ((R2 ? alpha2 : 229.5f) * f22));
                                        canvas3.drawRoundRect(rectF3, dp4, dp4, M2);
                                        M2.setAlpha(alpha2);
                                    }
                                    if (R2 || paint != null) {
                                        int alpha3 = g6.h2.getAlpha();
                                        g6.h2.setAlpha((int) (alpha3 * f22));
                                        canvas3.drawRoundRect(rectF3, dp4, dp4, g6.h2);
                                        g6.h2.setAlpha(alpha3);
                                    }
                                    canvas3.save();
                                    canvas3.translate(f20 + AndroidUtilities.dp(f23), ((AndroidUtilities.dp(f19) - dVar2.h.getHeight()) / 2.0f) + f21);
                                    int alpha4 = dVar2.h.getPaint().getAlpha();
                                    dVar2.h.getPaint().setAlpha((int) (alpha4 * f22));
                                    dVar2.h.draw(canvas3);
                                    dVar2.h.getPaint().setAlpha(alpha4);
                                    canvas3.restore();
                                    canvas3.restore();
                                    break;
                                default:
                                    d dVar3 = dVar;
                                    dVar3.getClass();
                                    int i25 = i.a;
                                    float dp5 = AndroidUtilities.dp(21);
                                    dVar3.a(canvas3, dp5, dp5, dp5, i23 / 255.0f);
                                    break;
                            }
                        }
                    });
                    dVar.e = bVar2;
                    bVar2.a(AndroidUtilities.dp(f18), AndroidUtilities.dp(f18), 4.0f, AndroidUtilities.dp(10));
                }
                canvas.save();
                canvas.translate(g10 - g12, f17 - g12);
                float f19 = 21;
                canvas.scale(g12 / AndroidUtilities.dp(f19), g12 / AndroidUtilities.dp(f19));
                b bVar3 = dVar.e;
                bVar3.i = (int) (interpolation * 255.0f);
                bVar3.draw(canvas);
                canvas.restore();
                return;
            }
            return;
        }
        float f20 = !z10 ? 1.0f - jVar.D : i10 / 255.0f;
        float g13 = g(0.3f, 0.075f, h.k.getInterpolation(jVar.C));
        Matrix matrix = jVar.d;
        matrix.reset();
        matrix.setScale(g13, g13);
        matrix.postTranslate(0.0f, rectF2.bottom);
        jVar.f.setLocalMatrix(matrix);
        int interpolation3 = (int) (h.j.getInterpolation(jVar.C) * 255.0f * f20);
        Paint paint = jVar.c;
        paint.setAlpha(interpolation3);
        RectF rectF3 = X;
        rectF3.set(rectF2);
        rectF3.inset(-AndroidUtilities.dp(8.0f), -AndroidUtilities.dp(8.0f));
        Rect rect = Y;
        rectF3.round(rect);
        Drawable drawable = jVar.x;
        drawable.setAlpha((int) (f20 * 255.0f));
        drawable.setBounds(rect);
        drawable.draw(canvas);
        boolean z12 = jVar.I;
        RectF rectF4 = jVar.n;
        if (!z12) {
            float interpolation4 = (h.f.getInterpolation(jVar.C) - h.g.getInterpolation(jVar.C)) * (-40.0f);
            canvas.save();
            canvas.translate(rectF4.left, rectF4.top);
            canvas.rotate(interpolation4, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
            canvas.translate(-s1Var.getSideButtonStartX(), -s1Var.getSideButtonStartY());
            s1Var.k2(canvas, true);
            canvas.restore();
        }
        if (!jVar.M || jVar.I) {
            float min2 = Math.min(rectF2.width(), rectF2.height()) / 2.0f;
            float min3 = Math.min(rectF4.width(), rectF4.height()) / 2.0f;
            canvas.drawRoundRect(rectF2, min2, min2, paint);
            if (!jVar.I) {
                canvas.drawRoundRect(rectF4, min3, min3, paint);
            }
        } else {
            canvas.drawPath(jVar.e, paint);
        }
        float interpolation5 = h.t.getInterpolation(jVar.C) * AndroidUtilities.dp(2.0f);
        float f21 = i.a + 2;
        float interpolation6 = ((h.q.getInterpolation(jVar.C) * AndroidUtilities.dp(f21)) / 2.0f) - interpolation5;
        float interpolation7 = ((h.r.getInterpolation(jVar.C) * AndroidUtilities.dp(f21)) / 2.0f) - interpolation5;
        float interpolation8 = ((h.s.getInterpolation(jVar.C) * AndroidUtilities.dp(f21)) / 2.0f) - interpolation5;
        int i23 = 0;
        while (i23 < i19) {
            int i24 = 0;
            while (i24 < dVarArr.length) {
                if (!(i23 == 0 && i24 == jVar.N) && (i23 != i14 || i24 == jVar.N)) {
                    float length = i24 - ((dVarArr.length / 2.0f) - 0.5f);
                    float f22 = i24 == i19 ? interpolation6 : (i24 == i14 || i24 == 3) ? interpolation7 : interpolation8;
                    float dp4 = (AndroidUtilities.dp(i.a + 11) * length) + rectF2.centerX();
                    float centerY2 = rectF2.centerY();
                    i11 = i23;
                    final d dVar2 = dVarArr[i24];
                    float f23 = 16;
                    float dp5 = AndroidUtilities.dp(f23);
                    float measuredWidth = kVar2.getMeasuredWidth() - AndroidUtilities.dp(f23);
                    float f24 = rectF2.left;
                    kVar = kVar2;
                    float f25 = rectF2.right;
                    if (i24 == jVar.N && jVar.K) {
                        canvas2 = canvas;
                        i12 = i24;
                        f9 = dp4;
                    } else {
                        dVar2.getClass();
                        canvas2 = canvas;
                        i12 = i24;
                        f9 = dp4;
                        dVar2.a(canvas2, f9, centerY2, f22 + (AndroidUtilities.dp(2.0f) * dVar2.o), f20);
                    }
                    float f26 = dVar2.o;
                    if (f26 <= 0.0f || dVar2.h == null) {
                        i13 = i12;
                    } else {
                        float f27 = (f26 * 0.15f) + 0.85f;
                        canvas2.save();
                        canvas2.scale(f27, f27, f9, centerY2);
                        float f28 = dVar2.o * f20;
                        i13 = i12;
                        float D = x3.D(8, 2, dVar2.h.getWidth());
                        dVar2.i = d.b(d.b(f9, D, f24, f25), D, dp5, measuredWidth) - (D / 2.0f);
                        dVar2.j = centerY2 - AndroidUtilities.dp(58.0f);
                        if (dVar2.f == null) {
                            j jVar2 = dVar2.a;
                            if (!jVar2.P) {
                                dVar2.g = jVar2.H;
                                final int i25 = 0;
                                b bVar4 = new b(new a() { // from class: fh.c
                                    @Override // fh.a
                                    public final void p(Canvas canvas3, int i232) {
                                        float f192;
                                        switch (i25) {
                                            case 0:
                                                d dVar22 = dVar2;
                                                dVar22.getClass();
                                                canvas3.save();
                                                canvas3.translate(-dVar22.i, -dVar22.j);
                                                float f202 = dVar22.i;
                                                float f212 = dVar22.j;
                                                float f222 = i232 / 255.0f;
                                                RectF rectF32 = AndroidUtilities.rectTmp;
                                                float dp42 = AndroidUtilities.dp(21.0f) / 2.0f;
                                                int i242 = i.a;
                                                float f232 = 8;
                                                rectF32.set(f202, f212, dVar22.h.getWidth() + f202 + (AndroidUtilities.dp(f232) * 2), AndroidUtilities.dp(21.0f) + f212);
                                                s1 s1Var2 = dVar22.b;
                                                boolean R2 = s1Var2.R2();
                                                Paint paint2 = dVar22.g;
                                                if (paint2 != null) {
                                                    int alpha = paint2.getAlpha();
                                                    paint2.setAlpha((int) (255.0f * f222));
                                                    canvas3.drawRoundRect(rectF32, dp42, dp42, paint2);
                                                    paint2.setAlpha(alpha);
                                                    f192 = 21.0f;
                                                } else {
                                                    Point point = AndroidUtilities.displaySize;
                                                    f192 = 21.0f;
                                                    s1Var2.q0(0.0f, 0.0f, point.x, point.y);
                                                    Paint M2 = s1Var2.M2("paintChatActionBackground");
                                                    int alpha2 = M2.getAlpha();
                                                    M2.setAlpha((int) ((R2 ? alpha2 : 229.5f) * f222));
                                                    canvas3.drawRoundRect(rectF32, dp42, dp42, M2);
                                                    M2.setAlpha(alpha2);
                                                }
                                                if (R2 || paint2 != null) {
                                                    int alpha3 = g6.h2.getAlpha();
                                                    g6.h2.setAlpha((int) (alpha3 * f222));
                                                    canvas3.drawRoundRect(rectF32, dp42, dp42, g6.h2);
                                                    g6.h2.setAlpha(alpha3);
                                                }
                                                canvas3.save();
                                                canvas3.translate(f202 + AndroidUtilities.dp(f232), ((AndroidUtilities.dp(f192) - dVar22.h.getHeight()) / 2.0f) + f212);
                                                int alpha4 = dVar22.h.getPaint().getAlpha();
                                                dVar22.h.getPaint().setAlpha((int) (alpha4 * f222));
                                                dVar22.h.draw(canvas3);
                                                dVar22.h.getPaint().setAlpha(alpha4);
                                                canvas3.restore();
                                                canvas3.restore();
                                                break;
                                            default:
                                                d dVar3 = dVar2;
                                                dVar3.getClass();
                                                int i252 = i.a;
                                                float dp52 = AndroidUtilities.dp(21);
                                                dVar3.a(canvas3, dp52, dp52, dp52, i232 / 255.0f);
                                                break;
                                        }
                                    }
                                });
                                dVar2.f = bVar4;
                                bVar4.a((int) D, AndroidUtilities.dp(21.0f), 3.0f, AndroidUtilities.dp(4));
                            }
                        }
                        b bVar5 = dVar2.f;
                        if (bVar5 != null) {
                            float f29 = dVar2.i;
                            float f30 = dVar2.j;
                            bVar5.setBounds((int) f29, (int) f30, (int) (f29 + D), (int) (f30 + AndroidUtilities.dp(21.0f)));
                            b bVar6 = dVar2.f;
                            bVar6.i = (int) (f28 * 255.0f);
                            bVar6.draw(canvas2);
                        }
                        canvas2.restore();
                    }
                } else {
                    i11 = i23;
                    i13 = i24;
                    kVar = kVar2;
                }
                i24 = i13 + 1;
                jVar = this;
                i23 = i11;
                kVar2 = kVar;
                i14 = 1;
                i19 = 2;
            }
            i23++;
            jVar = this;
            i14 = 1;
            i19 = 2;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return 0;
    }

    public final int h() {
        return AndroidUtilities.dp(((i.a + 11) * this.w.length) + 7);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ObjectAnimator objectAnimator = this.V;
        ef.c cVar = this.b;
        if (animator == objectAnimator) {
            this.y.setHideSideButtonByQuickShare(false);
            this.I = true;
            invalidateSelf();
            if (this.J) {
                cVar.run();
                return;
            }
            return;
        }
        if (animator == this.W) {
            this.J = true;
            invalidateSelf();
            ub ubVar = this.S;
            if (ubVar != null) {
                ubVar.a.setVisibility(0);
            }
            if (this.I) {
                cVar.run();
            }
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
