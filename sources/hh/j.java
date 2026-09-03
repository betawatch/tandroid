package hh;

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
import cg.h0;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.y3;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.s1;
import org.telegram.ui.Components.qb;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class j extends Drawable implements Animator.AnimatorListener {
    public static final RectF Y = new RectF();
    public static final Rect Z = new Rect();
    public static final int[] a0 = new int[2];
    public static final g b0 = new g("openFactor", 0);
    public static final g c0 = new g("openFactor", 1);
    public final MessageObject B;
    public float C;
    public Bitmap F;
    public BitmapShader G;
    public Paint I;
    public b M;
    public boolean P;
    public boolean Q;
    public int R;
    public int S;
    public qb T;
    public float U;
    public float V;
    public final k a;
    public final ff.c b;
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
    public float D = 0.0f;
    public float E = 0.0f;
    public final Matrix H = new Matrix();
    public boolean J = false;
    public boolean K = false;
    public boolean L = false;
    public boolean N = true;
    public int O = -1;
    public final ObjectAnimator W = ObjectAnimator.ofFloat(this, b0, 1.0f).setDuration(560L);
    public final ObjectAnimator X = ObjectAnimator.ofFloat(this, c0, 1.0f).setDuration(240L);

    public j(k kVar, s1 s1Var, ArrayList arrayList, ff.c cVar) {
        this.b = cVar;
        this.a = kVar;
        this.y = s1Var;
        this.B = s1Var.getMessageObject();
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
                int v02 = j6.v0(j6.G8, this.y.getResourcesProvider());
                mutate.setColorFilter(new PorterDuffColorFilter(j6.w0(null, j6.Td, false), PorterDuff.Mode.MULTIPLY));
                LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(100.0f), new int[]{v02, 16777215 & v02}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                this.f = linearGradient;
                this.c.setShader(linearGradient);
                ObjectAnimator objectAnimator = this.W;
                LinearInterpolator linearInterpolator = h.b;
                objectAnimator.setInterpolator(linearInterpolator);
                this.W.addListener(this);
                this.X.setInterpolator(linearInterpolator);
                this.X.addListener(this);
                AndroidUtilities.makeGlobalBlurBitmap(new h0(this, 13), 15.0f);
                return;
            }
            dVarArr[i10] = new d(this, ((Long) arrayList.get(i10)).longValue());
            i10++;
        }
    }

    public static float b(float f10, float f11, float f12, float f13) {
        return (float) Math.toDegrees((float) Math.atan2(f13 - f11, f12 - f10));
    }

    public static PointF f(float f10, float f11, float f12, float f13, float f14, float f15, boolean z4) {
        float f16 = f13 - f10;
        float f17 = f14 - f11;
        float sqrt = (float) Math.sqrt(Math.pow(f17, 2.0d) + Math.pow(f16, 2.0d));
        if (sqrt > f12 + f15 || sqrt < Math.abs(f12 - f15)) {
            return null;
        }
        float f18 = ((sqrt * sqrt) + ((f12 * f12) - (f15 * f15))) / (2.0f * sqrt);
        float sqrt2 = (float) Math.sqrt(r8 - (f18 * f18));
        float d = android.support.v4.media.a.d(f18, f16, sqrt, f10);
        float d10 = android.support.v4.media.a.d(f18, f17, sqrt, f11);
        float f19 = (f17 * sqrt2) / sqrt;
        float f20 = d + f19;
        float f21 = (sqrt2 * f16) / sqrt;
        float f22 = d10 - f21;
        float f23 = d - f19;
        float f24 = d10 + f21;
        return (f20 == f23 || f20 >= f23) ? f22 > f24 ? new PointF(f20, f22) : new PointF(f23, f24) : z4 ? new PointF(f20, f22) : new PointF(f23, f24);
    }

    public static float g(float f10, float f11, float f12) {
        return e2.c.w(f11, f10, f12, f10);
    }

    public static e i(Interpolator interpolator, int i10, int i11, int i12, boolean z4) {
        float f10 = i12;
        return new e(z4, i10 / f10, i11 / f10, interpolator);
    }

    public static float j(float f10) {
        return f10 <= 0.0f ? f10 + 180.0f : f10 - 180.0f;
    }

    public final void a(Path path, RectF rectF, float f10, float f11, boolean z4, boolean z10) {
        float f12 = f11 - f10;
        if (z4) {
            if (f12 > 0.0f) {
                f12 -= 360.0f;
            }
        } else if (f12 < 0.0f) {
            f12 += 360.0f;
        }
        if (Math.abs(f12) > 270.0f && z10) {
            this.N = false;
        }
        path.arcTo(rectF, f10, f12);
    }

    public final void c() {
        this.X.start();
        this.L = true;
        if (this.J && !this.Q) {
            b bVar = new b(new gg.f(this, 3));
            this.M = bVar;
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
        if (this.Q) {
            return;
        }
        this.Q = true;
        Bitmap bitmap4 = this.F;
        if (bitmap4 != null) {
            bitmap4.recycle();
        }
        b bVar = this.M;
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

    public final void e(Canvas canvas, boolean z4, int i10) {
        int i11;
        k kVar;
        Canvas canvas2;
        int i12;
        float f10;
        int i13;
        j jVar = this;
        boolean z10 = jVar.P;
        k kVar2 = jVar.a;
        s1 s1Var = jVar.y;
        int i14 = 1;
        if (!z10) {
            int[] iArr = a0;
            s1Var.getLocationInWindow(iArr);
            int i15 = iArr[0];
            int i16 = iArr[1];
            kVar2.getLocationInWindow(iArr);
            int i17 = iArr[0];
            int i18 = iArr[1];
            jVar.R = i15 - i17;
            jVar.S = i16 - i18;
            float dp = AndroidUtilities.dp(16.0f);
            float sideButtonStartX = s1Var.getSideButtonStartX() + jVar.R + dp;
            float sideButtonStartY = s1Var.getSideButtonStartY() + jVar.S + dp;
            float f11 = sideButtonStartX - dp;
            float f12 = sideButtonStartY - dp;
            float f13 = sideButtonStartX + dp;
            float f14 = sideButtonStartY + dp;
            RectF rectF = jVar.h;
            rectF.set(f11, f12, f13, f14);
            float dp2 = AndroidUtilities.dp(16.0f);
            if (rectF.right + AndroidUtilities.dp(48.0f) + dp2 > kVar2.getMeasuredWidth()) {
                jVar.C = Math.max(0.0f, (kVar2.getMeasuredWidth() - dp2) - rectF.right);
            } else if (((rectF.right + AndroidUtilities.dp(48.0f)) - jVar.h()) - dp2 < 0.0f) {
                jVar.C = Math.max(0.0f, (dp2 + jVar.h()) - rectF.right);
            } else {
                jVar.C = AndroidUtilities.dp(48.0f);
            }
            jVar.W.start();
            jVar.P = true;
        }
        b bVar = jVar.M;
        d[] dVarArr = jVar.w;
        int i19 = 2;
        RectF rectF2 = jVar.r;
        if (bVar != null && !z4) {
            bVar.setBounds((int) rectF2.left, (int) (rectF2.top - AndroidUtilities.dp(30.0f)), (int) rectF2.right, (int) rectF2.bottom);
            jVar.M.i = (int) ((1.0f - h.c.getInterpolation(jVar.E)) * 255.0f);
            jVar.M.draw(canvas);
            if (jVar.O != -1) {
                float interpolation = 1.0f - h.e.getInterpolation(jVar.E);
                float interpolation2 = h.d.getInterpolation(jVar.E);
                int i20 = jVar.O - 2;
                float centerX = rectF2.centerX();
                int i21 = i.a;
                float dp3 = centerX + (AndroidUtilities.dp(i21 + 11) * i20);
                float centerY = rectF2.centerY();
                float f15 = jVar.U;
                float f16 = jVar.V;
                float f17 = (dp3 + f15) / 2.0f;
                qb qbVar = jVar.T;
                float min = (qbVar == null || !qbVar.top) ? Math.min(centerY, f16) - AndroidUtilities.dp(15) : Math.max(centerY, f16) + AndroidUtilities.dp(15);
                float g10 = g(dp3, f15, interpolation2);
                double d = dp3;
                double d10 = centerY;
                double d11 = f15;
                double d12 = f16;
                double d13 = f17;
                double d14 = d11 - d;
                double d15 = ((d11 * d) + ((d13 * d13) - (d11 * d13))) - (d13 * d);
                double d16 = d15 == 0.0d ? 0.0d : ((min - (((d12 - d10) * (d13 - d)) / d14)) - d10) / d15;
                double d17 = d * d;
                double d18 = d14 != 0.0d ? ((d12 - (((d11 * d11) - d17) * d16)) - d10) / d14 : 0.0d;
                double g11 = g(dp3, f15, interpolation2);
                float f18 = (float) ((d18 * g11) + (d16 * g11 * g11) + ((d10 - (d17 * d16)) - (d18 * d)));
                float f19 = i21;
                float g12 = g((AndroidUtilities.dp(f19) / 2.0f) + AndroidUtilities.dp(2.0f), AndroidUtilities.dp(12.0f), interpolation2);
                final d dVar = dVarArr[jVar.O];
                if (dVar.e == null) {
                    final int i22 = 1;
                    b bVar2 = new b(new a() { // from class: hh.c
                        @Override // hh.a
                        public final void p(Canvas canvas3, int i23) {
                            float f20;
                            switch (i22) {
                                case 0:
                                    d dVar2 = dVar;
                                    dVar2.getClass();
                                    canvas3.save();
                                    canvas3.translate(-dVar2.i, -dVar2.j);
                                    float f21 = dVar2.i;
                                    float f22 = dVar2.j;
                                    float f23 = i23 / 255.0f;
                                    RectF rectF3 = AndroidUtilities.rectTmp;
                                    float dp4 = AndroidUtilities.dp(21.0f) / 2.0f;
                                    int i24 = i.a;
                                    float f24 = 8;
                                    rectF3.set(f21, f22, dVar2.h.getWidth() + f21 + (AndroidUtilities.dp(f24) * 2), AndroidUtilities.dp(21.0f) + f22);
                                    s1 s1Var2 = dVar2.b;
                                    boolean R2 = s1Var2.R2();
                                    Paint paint = dVar2.g;
                                    if (paint != null) {
                                        int alpha = paint.getAlpha();
                                        paint.setAlpha((int) (255.0f * f23));
                                        canvas3.drawRoundRect(rectF3, dp4, dp4, paint);
                                        paint.setAlpha(alpha);
                                        f20 = 21.0f;
                                    } else {
                                        Point point = AndroidUtilities.displaySize;
                                        f20 = 21.0f;
                                        s1Var2.q0(0.0f, 0.0f, point.x, point.y);
                                        Paint M2 = s1Var2.M2("paintChatActionBackground");
                                        int alpha2 = M2.getAlpha();
                                        M2.setAlpha((int) ((R2 ? alpha2 : 229.5f) * f23));
                                        canvas3.drawRoundRect(rectF3, dp4, dp4, M2);
                                        M2.setAlpha(alpha2);
                                    }
                                    if (R2 || paint != null) {
                                        int alpha3 = j6.h2.getAlpha();
                                        j6.h2.setAlpha((int) (alpha3 * f23));
                                        canvas3.drawRoundRect(rectF3, dp4, dp4, j6.h2);
                                        j6.h2.setAlpha(alpha3);
                                    }
                                    canvas3.save();
                                    canvas3.translate(f21 + AndroidUtilities.dp(f24), ((AndroidUtilities.dp(f20) - dVar2.h.getHeight()) / 2.0f) + f22);
                                    int alpha4 = dVar2.h.getPaint().getAlpha();
                                    dVar2.h.getPaint().setAlpha((int) (alpha4 * f23));
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
                    bVar2.a(AndroidUtilities.dp(f19), AndroidUtilities.dp(f19), 4.0f, AndroidUtilities.dp(10));
                }
                canvas.save();
                canvas.translate(g10 - g12, f18 - g12);
                float f20 = 21;
                canvas.scale(g12 / AndroidUtilities.dp(f20), g12 / AndroidUtilities.dp(f20));
                b bVar3 = dVar.e;
                bVar3.i = (int) (interpolation * 255.0f);
                bVar3.draw(canvas);
                canvas.restore();
                return;
            }
            return;
        }
        float f21 = !z4 ? 1.0f - jVar.E : i10 / 255.0f;
        float g13 = g(0.3f, 0.075f, h.k.getInterpolation(jVar.D));
        Matrix matrix = jVar.d;
        matrix.reset();
        matrix.setScale(g13, g13);
        matrix.postTranslate(0.0f, rectF2.bottom);
        jVar.f.setLocalMatrix(matrix);
        int interpolation3 = (int) (h.j.getInterpolation(jVar.D) * 255.0f * f21);
        Paint paint = jVar.c;
        paint.setAlpha(interpolation3);
        RectF rectF3 = Y;
        rectF3.set(rectF2);
        rectF3.inset(-AndroidUtilities.dp(8.0f), -AndroidUtilities.dp(8.0f));
        Rect rect = Z;
        rectF3.round(rect);
        Drawable drawable = jVar.x;
        drawable.setAlpha((int) (f21 * 255.0f));
        drawable.setBounds(rect);
        drawable.draw(canvas);
        boolean z11 = jVar.J;
        RectF rectF4 = jVar.n;
        if (!z11) {
            float interpolation4 = (h.f.getInterpolation(jVar.D) - h.g.getInterpolation(jVar.D)) * (-40.0f);
            canvas.save();
            canvas.translate(rectF4.left, rectF4.top);
            canvas.rotate(interpolation4, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
            canvas.translate(-s1Var.getSideButtonStartX(), -s1Var.getSideButtonStartY());
            s1Var.k2(canvas, true);
            canvas.restore();
        }
        if (!jVar.N || jVar.J) {
            float min2 = Math.min(rectF2.width(), rectF2.height()) / 2.0f;
            float min3 = Math.min(rectF4.width(), rectF4.height()) / 2.0f;
            canvas.drawRoundRect(rectF2, min2, min2, paint);
            if (!jVar.J) {
                canvas.drawRoundRect(rectF4, min3, min3, paint);
            }
        } else {
            canvas.drawPath(jVar.e, paint);
        }
        float interpolation5 = h.t.getInterpolation(jVar.D) * AndroidUtilities.dp(2.0f);
        float f22 = i.a + 2;
        float interpolation6 = ((h.q.getInterpolation(jVar.D) * AndroidUtilities.dp(f22)) / 2.0f) - interpolation5;
        float interpolation7 = ((h.r.getInterpolation(jVar.D) * AndroidUtilities.dp(f22)) / 2.0f) - interpolation5;
        float interpolation8 = ((h.s.getInterpolation(jVar.D) * AndroidUtilities.dp(f22)) / 2.0f) - interpolation5;
        int i23 = 0;
        while (i23 < i19) {
            int i24 = 0;
            while (i24 < dVarArr.length) {
                if (!(i23 == 0 && i24 == jVar.O) && (i23 != i14 || i24 == jVar.O)) {
                    float length = i24 - ((dVarArr.length / 2.0f) - 0.5f);
                    float f23 = i24 == i19 ? interpolation6 : (i24 == i14 || i24 == 3) ? interpolation7 : interpolation8;
                    float dp4 = (AndroidUtilities.dp(i.a + 11) * length) + rectF2.centerX();
                    float centerY2 = rectF2.centerY();
                    i11 = i23;
                    final d dVar2 = dVarArr[i24];
                    float f24 = 16;
                    float dp5 = AndroidUtilities.dp(f24);
                    float measuredWidth = kVar2.getMeasuredWidth() - AndroidUtilities.dp(f24);
                    float f25 = rectF2.left;
                    kVar = kVar2;
                    float f26 = rectF2.right;
                    if (i24 == jVar.O && jVar.L) {
                        canvas2 = canvas;
                        i12 = i24;
                        f10 = dp4;
                    } else {
                        dVar2.getClass();
                        canvas2 = canvas;
                        i12 = i24;
                        f10 = dp4;
                        dVar2.a(canvas2, f10, centerY2, f23 + (AndroidUtilities.dp(2.0f) * dVar2.o), f21);
                    }
                    float f27 = dVar2.o;
                    if (f27 <= 0.0f || dVar2.h == null) {
                        i13 = i12;
                    } else {
                        float f28 = (f27 * 0.15f) + 0.85f;
                        canvas2.save();
                        canvas2.scale(f28, f28, f10, centerY2);
                        float f29 = dVar2.o * f21;
                        i13 = i12;
                        float D = y3.D(8, 2, dVar2.h.getWidth());
                        dVar2.i = d.b(d.b(f10, D, f25, f26), D, dp5, measuredWidth) - (D / 2.0f);
                        dVar2.j = centerY2 - AndroidUtilities.dp(58.0f);
                        if (dVar2.f == null) {
                            j jVar2 = dVar2.a;
                            if (!jVar2.Q) {
                                dVar2.g = jVar2.I;
                                final int i25 = 0;
                                b bVar4 = new b(new a() { // from class: hh.c
                                    @Override // hh.a
                                    public final void p(Canvas canvas3, int i232) {
                                        float f202;
                                        switch (i25) {
                                            case 0:
                                                d dVar22 = dVar2;
                                                dVar22.getClass();
                                                canvas3.save();
                                                canvas3.translate(-dVar22.i, -dVar22.j);
                                                float f212 = dVar22.i;
                                                float f222 = dVar22.j;
                                                float f232 = i232 / 255.0f;
                                                RectF rectF32 = AndroidUtilities.rectTmp;
                                                float dp42 = AndroidUtilities.dp(21.0f) / 2.0f;
                                                int i242 = i.a;
                                                float f242 = 8;
                                                rectF32.set(f212, f222, dVar22.h.getWidth() + f212 + (AndroidUtilities.dp(f242) * 2), AndroidUtilities.dp(21.0f) + f222);
                                                s1 s1Var2 = dVar22.b;
                                                boolean R2 = s1Var2.R2();
                                                Paint paint2 = dVar22.g;
                                                if (paint2 != null) {
                                                    int alpha = paint2.getAlpha();
                                                    paint2.setAlpha((int) (255.0f * f232));
                                                    canvas3.drawRoundRect(rectF32, dp42, dp42, paint2);
                                                    paint2.setAlpha(alpha);
                                                    f202 = 21.0f;
                                                } else {
                                                    Point point = AndroidUtilities.displaySize;
                                                    f202 = 21.0f;
                                                    s1Var2.q0(0.0f, 0.0f, point.x, point.y);
                                                    Paint M2 = s1Var2.M2("paintChatActionBackground");
                                                    int alpha2 = M2.getAlpha();
                                                    M2.setAlpha((int) ((R2 ? alpha2 : 229.5f) * f232));
                                                    canvas3.drawRoundRect(rectF32, dp42, dp42, M2);
                                                    M2.setAlpha(alpha2);
                                                }
                                                if (R2 || paint2 != null) {
                                                    int alpha3 = j6.h2.getAlpha();
                                                    j6.h2.setAlpha((int) (alpha3 * f232));
                                                    canvas3.drawRoundRect(rectF32, dp42, dp42, j6.h2);
                                                    j6.h2.setAlpha(alpha3);
                                                }
                                                canvas3.save();
                                                canvas3.translate(f212 + AndroidUtilities.dp(f242), ((AndroidUtilities.dp(f202) - dVar22.h.getHeight()) / 2.0f) + f222);
                                                int alpha4 = dVar22.h.getPaint().getAlpha();
                                                dVar22.h.getPaint().setAlpha((int) (alpha4 * f232));
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
                            float f30 = dVar2.i;
                            float f31 = dVar2.j;
                            bVar5.setBounds((int) f30, (int) f31, (int) (f30 + D), (int) (f31 + AndroidUtilities.dp(21.0f)));
                            b bVar6 = dVar2.f;
                            bVar6.i = (int) (f29 * 255.0f);
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
        ObjectAnimator objectAnimator = this.W;
        ff.c cVar = this.b;
        if (animator == objectAnimator) {
            this.y.setHideSideButtonByQuickShare(false);
            this.J = true;
            invalidateSelf();
            if (this.K) {
                cVar.run();
                return;
            }
            return;
        }
        if (animator == this.X) {
            this.K = true;
            invalidateSelf();
            qb qbVar = this.T;
            if (qbVar != null) {
                qbVar.a.setVisibility(0);
            }
            if (this.J) {
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
