package ch;

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
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.l0;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Components.ob;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
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
    public ob S;
    public float T;
    public float U;
    public final k a;
    public final a1.e b;
    public final LinearGradient f;
    public final d[] w;
    public final Drawable x;
    public final t1 y;
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

    public j(k kVar, t1 t1Var, ArrayList arrayList, a1.e eVar) {
        this.b = eVar;
        this.a = kVar;
        this.y = t1Var;
        this.A = t1Var.getMessageObject();
        this.w = new d[Math.min(5, arrayList.size())];
        int i9 = 0;
        while (true) {
            d[] dVarArr = this.w;
            if (i9 >= dVarArr.length) {
                this.c.setStyle(Paint.Style.FILL);
                Drawable mutate = kVar.getContext().getDrawable(R.drawable.reactions_bubble_shadow).mutate();
                this.x = mutate;
                t1Var.setHideSideButtonByQuickShare(true);
                kVar.performHapticFeedback(3, 1);
                int v02 = f6.v0(f6.G8, this.y.getResourcesProvider());
                mutate.setColorFilter(new PorterDuffColorFilter(f6.w0(null, f6.Td, false), PorterDuff.Mode.MULTIPLY));
                LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(100.0f), new int[]{v02, 16777215 & v02}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                this.f = linearGradient;
                this.c.setShader(linearGradient);
                ObjectAnimator objectAnimator = this.V;
                LinearInterpolator linearInterpolator = h.b;
                objectAnimator.setInterpolator(linearInterpolator);
                this.V.addListener(this);
                this.W.setInterpolator(linearInterpolator);
                this.W.addListener(this);
                AndroidUtilities.makeGlobalBlurBitmap(new bg.i(this, 6), 15.0f);
                return;
            }
            dVarArr[i9] = new d(this, ((Long) arrayList.get(i9)).longValue());
            i9++;
        }
    }

    public static float b(float f10, float f11, float f12, float f13) {
        return (float) Math.toDegrees((float) Math.atan2(f13 - f11, f12 - f10));
    }

    public static PointF f(float f10, float f11, float f12, float f13, float f14, float f15, boolean z10) {
        float f16 = f13 - f10;
        float f17 = f14 - f11;
        float sqrt = (float) Math.sqrt(Math.pow(f17, 2.0d) + Math.pow(f16, 2.0d));
        if (sqrt > f12 + f15 || sqrt < Math.abs(f12 - f15)) {
            return null;
        }
        float f18 = ((sqrt * sqrt) + ((f12 * f12) - (f15 * f15))) / (2.0f * sqrt);
        float sqrt2 = (float) Math.sqrt(r8 - (f18 * f18));
        float d = aa.d.d(f18, f16, sqrt, f10);
        float d9 = aa.d.d(f18, f17, sqrt, f11);
        float f19 = (f17 * sqrt2) / sqrt;
        float f20 = d + f19;
        float f21 = (sqrt2 * f16) / sqrt;
        float f22 = d9 - f21;
        float f23 = d - f19;
        float f24 = d9 + f21;
        return (f20 == f23 || f20 >= f23) ? f22 > f24 ? new PointF(f20, f22) : new PointF(f23, f24) : z10 ? new PointF(f20, f22) : new PointF(f23, f24);
    }

    public static float g(float f10, float f11, float f12) {
        return e2.c.z(f11, f10, f12, f10);
    }

    public static e i(Interpolator interpolator, int i9, int i10, int i11, boolean z10) {
        float f10 = i11;
        return new e(z10, i9 / f10, i10 / f10, interpolator);
    }

    public static float j(float f10) {
        return f10 <= 0.0f ? f10 + 180.0f : f10 - 180.0f;
    }

    public final void a(Path path, RectF rectF, float f10, float f11, boolean z10, boolean z11) {
        float f12 = f11 - f10;
        if (z10) {
            if (f12 > 0.0f) {
                f12 -= 360.0f;
            }
        } else if (f12 < 0.0f) {
            f12 += 360.0f;
        }
        if (Math.abs(f12) > 270.0f && z11) {
            this.M = false;
        }
        path.arcTo(rectF, f10, f12);
    }

    public final void c() {
        this.W.start();
        this.K = true;
        if (this.I && !this.P) {
            b bVar = new b(new a1.c(this, 13));
            this.L = bVar;
            RectF rectF = this.r;
            int width = (int) rectF.width();
            int height = (int) (rectF.height() + AndroidUtilities.dp(30.0f));
            int i9 = i.a;
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

    public final void e(Canvas canvas, boolean z10, int i9) {
        int i10;
        k kVar;
        Canvas canvas2;
        int i11;
        float f10;
        int i12;
        j jVar = this;
        boolean z11 = jVar.O;
        k kVar2 = jVar.a;
        t1 t1Var = jVar.y;
        int i13 = 1;
        if (!z11) {
            int[] iArr = Z;
            t1Var.getLocationInWindow(iArr);
            int i14 = iArr[0];
            int i15 = iArr[1];
            kVar2.getLocationInWindow(iArr);
            int i16 = iArr[0];
            int i17 = iArr[1];
            jVar.Q = i14 - i16;
            jVar.R = i15 - i17;
            float dp = AndroidUtilities.dp(16.0f);
            float sideButtonStartX = t1Var.getSideButtonStartX() + jVar.Q + dp;
            float sideButtonStartY = t1Var.getSideButtonStartY() + jVar.R + dp;
            float f11 = sideButtonStartX - dp;
            float f12 = sideButtonStartY - dp;
            float f13 = sideButtonStartX + dp;
            float f14 = sideButtonStartY + dp;
            RectF rectF = jVar.h;
            rectF.set(f11, f12, f13, f14);
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
        int i18 = 2;
        RectF rectF2 = jVar.r;
        if (bVar != null && !z10) {
            bVar.setBounds((int) rectF2.left, (int) (rectF2.top - AndroidUtilities.dp(30.0f)), (int) rectF2.right, (int) rectF2.bottom);
            jVar.L.i = (int) ((1.0f - h.c.getInterpolation(jVar.D)) * 255.0f);
            jVar.L.draw(canvas);
            if (jVar.N != -1) {
                float interpolation = 1.0f - h.e.getInterpolation(jVar.D);
                float interpolation2 = h.d.getInterpolation(jVar.D);
                int i19 = jVar.N - 2;
                float centerX = rectF2.centerX();
                int i20 = i.a;
                float dp3 = centerX + (AndroidUtilities.dp(i20 + 11) * i19);
                float centerY = rectF2.centerY();
                float f15 = jVar.T;
                float f16 = jVar.U;
                float f17 = (dp3 + f15) / 2.0f;
                ob obVar = jVar.S;
                float min = (obVar == null || !obVar.top) ? Math.min(centerY, f16) - AndroidUtilities.dp(15) : Math.max(centerY, f16) + AndroidUtilities.dp(15);
                float g10 = g(dp3, f15, interpolation2);
                double d = dp3;
                double d9 = centerY;
                double d10 = f15;
                double d11 = f16;
                double d12 = f17;
                double d13 = d10 - d;
                double d14 = ((d10 * d) + ((d12 * d12) - (d10 * d12))) - (d12 * d);
                double d15 = d14 == 0.0d ? 0.0d : ((min - (((d11 - d9) * (d12 - d)) / d13)) - d9) / d14;
                double d16 = d * d;
                double d17 = d13 != 0.0d ? ((d11 - (((d10 * d10) - d16) * d15)) - d9) / d13 : 0.0d;
                double g11 = g(dp3, f15, interpolation2);
                float f18 = (float) ((d17 * g11) + (d15 * g11 * g11) + ((d9 - (d16 * d15)) - (d17 * d)));
                float f19 = i20;
                float g12 = g((AndroidUtilities.dp(f19) / 2.0f) + AndroidUtilities.dp(2.0f), AndroidUtilities.dp(12.0f), interpolation2);
                final d dVar = dVarArr[jVar.N];
                if (dVar.e == null) {
                    final int i21 = 1;
                    b bVar2 = new b(new a() { // from class: ch.c
                        @Override // ch.a
                        public final void l(Canvas canvas3, int i22) {
                            float f20;
                            switch (i21) {
                                case 0:
                                    d dVar2 = dVar;
                                    dVar2.getClass();
                                    canvas3.save();
                                    canvas3.translate(-dVar2.i, -dVar2.j);
                                    float f21 = dVar2.i;
                                    float f22 = dVar2.j;
                                    float f23 = i22 / 255.0f;
                                    RectF rectF3 = AndroidUtilities.rectTmp;
                                    float dp4 = AndroidUtilities.dp(21.0f) / 2.0f;
                                    int i23 = i.a;
                                    float f24 = 8;
                                    rectF3.set(f21, f22, dVar2.h.getWidth() + f21 + (AndroidUtilities.dp(f24) * 2), AndroidUtilities.dp(21.0f) + f22);
                                    t1 t1Var2 = dVar2.b;
                                    boolean R2 = t1Var2.R2();
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
                                        t1Var2.p0(0.0f, 0.0f, point.x, point.y);
                                        Paint M2 = t1Var2.M2("paintChatActionBackground");
                                        int alpha2 = M2.getAlpha();
                                        M2.setAlpha((int) ((R2 ? alpha2 : 229.5f) * f23));
                                        canvas3.drawRoundRect(rectF3, dp4, dp4, M2);
                                        M2.setAlpha(alpha2);
                                    }
                                    if (R2 || paint != null) {
                                        int alpha3 = f6.h2.getAlpha();
                                        f6.h2.setAlpha((int) (alpha3 * f23));
                                        canvas3.drawRoundRect(rectF3, dp4, dp4, f6.h2);
                                        f6.h2.setAlpha(alpha3);
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
                                    int i24 = i.a;
                                    float dp5 = AndroidUtilities.dp(21);
                                    dVar3.a(canvas3, dp5, dp5, dp5, i22 / 255.0f);
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
        float f21 = !z10 ? 1.0f - jVar.D : i9 / 255.0f;
        float g13 = g(0.3f, 0.075f, h.k.getInterpolation(jVar.C));
        Matrix matrix = jVar.d;
        matrix.reset();
        matrix.setScale(g13, g13);
        matrix.postTranslate(0.0f, rectF2.bottom);
        jVar.f.setLocalMatrix(matrix);
        int interpolation3 = (int) (h.j.getInterpolation(jVar.C) * 255.0f * f21);
        Paint paint = jVar.c;
        paint.setAlpha(interpolation3);
        RectF rectF3 = X;
        rectF3.set(rectF2);
        rectF3.inset(-AndroidUtilities.dp(8.0f), -AndroidUtilities.dp(8.0f));
        Rect rect = Y;
        rectF3.round(rect);
        Drawable drawable = jVar.x;
        drawable.setAlpha((int) (f21 * 255.0f));
        drawable.setBounds(rect);
        drawable.draw(canvas);
        boolean z12 = jVar.I;
        RectF rectF4 = jVar.n;
        if (!z12) {
            float interpolation4 = (h.f.getInterpolation(jVar.C) - h.g.getInterpolation(jVar.C)) * (-40.0f);
            canvas.save();
            canvas.translate(rectF4.left, rectF4.top);
            canvas.rotate(interpolation4, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
            canvas.translate(-t1Var.getSideButtonStartX(), -t1Var.getSideButtonStartY());
            t1Var.k2(canvas, true);
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
        float f22 = i.a + 2;
        float interpolation6 = ((h.q.getInterpolation(jVar.C) * AndroidUtilities.dp(f22)) / 2.0f) - interpolation5;
        float interpolation7 = ((h.r.getInterpolation(jVar.C) * AndroidUtilities.dp(f22)) / 2.0f) - interpolation5;
        float interpolation8 = ((h.s.getInterpolation(jVar.C) * AndroidUtilities.dp(f22)) / 2.0f) - interpolation5;
        int i22 = 0;
        while (i22 < i18) {
            int i23 = 0;
            while (i23 < dVarArr.length) {
                if (!(i22 == 0 && i23 == jVar.N) && (i22 != i13 || i23 == jVar.N)) {
                    float length = i23 - ((dVarArr.length / 2.0f) - 0.5f);
                    float f23 = i23 == i18 ? interpolation6 : (i23 == i13 || i23 == 3) ? interpolation7 : interpolation8;
                    float dp4 = (AndroidUtilities.dp(i.a + 11) * length) + rectF2.centerX();
                    float centerY2 = rectF2.centerY();
                    i10 = i22;
                    final d dVar2 = dVarArr[i23];
                    float f24 = 16;
                    float dp5 = AndroidUtilities.dp(f24);
                    float measuredWidth = kVar2.getMeasuredWidth() - AndroidUtilities.dp(f24);
                    float f25 = rectF2.left;
                    kVar = kVar2;
                    float f26 = rectF2.right;
                    if (i23 == jVar.N && jVar.K) {
                        canvas2 = canvas;
                        i11 = i23;
                        f10 = dp4;
                    } else {
                        dVar2.getClass();
                        canvas2 = canvas;
                        i11 = i23;
                        f10 = dp4;
                        dVar2.a(canvas2, f10, centerY2, f23 + (AndroidUtilities.dp(2.0f) * dVar2.o), f21);
                    }
                    float f27 = dVar2.o;
                    if (f27 <= 0.0f || dVar2.h == null) {
                        i12 = i11;
                    } else {
                        float f28 = (f27 * 0.15f) + 0.85f;
                        canvas2.save();
                        canvas2.scale(f28, f28, f10, centerY2);
                        float f29 = dVar2.o * f21;
                        i12 = i11;
                        float D = l0.D(8, 2, dVar2.h.getWidth());
                        dVar2.i = d.b(d.b(f10, D, f25, f26), D, dp5, measuredWidth) - (D / 2.0f);
                        dVar2.j = centerY2 - AndroidUtilities.dp(58.0f);
                        if (dVar2.f == null) {
                            j jVar2 = dVar2.a;
                            if (!jVar2.P) {
                                dVar2.g = jVar2.H;
                                final int i24 = 0;
                                b bVar4 = new b(new a() { // from class: ch.c
                                    @Override // ch.a
                                    public final void l(Canvas canvas3, int i222) {
                                        float f202;
                                        switch (i24) {
                                            case 0:
                                                d dVar22 = dVar2;
                                                dVar22.getClass();
                                                canvas3.save();
                                                canvas3.translate(-dVar22.i, -dVar22.j);
                                                float f212 = dVar22.i;
                                                float f222 = dVar22.j;
                                                float f232 = i222 / 255.0f;
                                                RectF rectF32 = AndroidUtilities.rectTmp;
                                                float dp42 = AndroidUtilities.dp(21.0f) / 2.0f;
                                                int i232 = i.a;
                                                float f242 = 8;
                                                rectF32.set(f212, f222, dVar22.h.getWidth() + f212 + (AndroidUtilities.dp(f242) * 2), AndroidUtilities.dp(21.0f) + f222);
                                                t1 t1Var2 = dVar22.b;
                                                boolean R2 = t1Var2.R2();
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
                                                    t1Var2.p0(0.0f, 0.0f, point.x, point.y);
                                                    Paint M2 = t1Var2.M2("paintChatActionBackground");
                                                    int alpha2 = M2.getAlpha();
                                                    M2.setAlpha((int) ((R2 ? alpha2 : 229.5f) * f232));
                                                    canvas3.drawRoundRect(rectF32, dp42, dp42, M2);
                                                    M2.setAlpha(alpha2);
                                                }
                                                if (R2 || paint2 != null) {
                                                    int alpha3 = f6.h2.getAlpha();
                                                    f6.h2.setAlpha((int) (alpha3 * f232));
                                                    canvas3.drawRoundRect(rectF32, dp42, dp42, f6.h2);
                                                    f6.h2.setAlpha(alpha3);
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
                                                int i242 = i.a;
                                                float dp52 = AndroidUtilities.dp(21);
                                                dVar3.a(canvas3, dp52, dp52, dp52, i222 / 255.0f);
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
                    i10 = i22;
                    i12 = i23;
                    kVar = kVar2;
                }
                i23 = i12 + 1;
                jVar = this;
                i22 = i10;
                kVar2 = kVar;
                i13 = 1;
                i18 = 2;
            }
            i22++;
            jVar = this;
            i13 = 1;
            i18 = 2;
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
        a1.e eVar = this.b;
        if (animator == objectAnimator) {
            this.y.setHideSideButtonByQuickShare(false);
            this.I = true;
            invalidateSelf();
            if (this.J) {
                eVar.run();
                return;
            }
            return;
        }
        if (animator == this.W) {
            this.J = true;
            invalidateSelf();
            ob obVar = this.S;
            if (obVar != null) {
                obVar.a.setVisibility(0);
            }
            if (this.I) {
                eVar.run();
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
    public final void setAlpha(int i9) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
