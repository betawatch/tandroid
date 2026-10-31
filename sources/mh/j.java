package mh;

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
import org.telegram.messenger.beta.R;
import org.telegram.messenger.i0;
import org.telegram.messenger.jj;
import org.telegram.messenger.m5;
import org.telegram.messenger.zs;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Components.eb;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class j extends Drawable implements Animator.AnimatorListener {
    public static final RectF b0 = new RectF();
    public static final Rect c0 = new Rect();
    public static final int[] d0 = new int[2];
    public static final g e0 = new g("openFactor", 0);
    public static final g f0 = new g("openFactor", 1);
    public final q1 D;
    public final jj E;
    public float F;
    public Bitmap I;
    public BitmapShader J;
    public Paint L;
    public b P;
    public boolean S;
    public boolean T;
    public int U;
    public int V;
    public eb W;
    public float X;
    public float Y;
    public final l a;
    public final k b;
    public final LinearGradient f;
    public final d[] x;
    public final Drawable y;
    public final Paint c = new Paint(1);
    public final Matrix d = new Matrix();
    public final Path e = new Path();
    public final RectF h = new RectF();
    public final RectF n = new RectF();
    public final RectF r = new RectF();
    public final RectF s = new RectF();
    public final RectF w = new RectF();
    public float G = 0.0f;
    public float H = 0.0f;
    public final Matrix K = new Matrix();
    public boolean M = false;
    public boolean N = false;
    public boolean O = false;
    public boolean Q = true;
    public int R = -1;
    public final ObjectAnimator Z = ObjectAnimator.ofFloat(this, e0, 1.0f).setDuration(560L);
    public final ObjectAnimator a0 = ObjectAnimator.ofFloat(this, f0, 1.0f).setDuration(240L);

    public j(l lVar, q1 q1Var, ArrayList arrayList, k kVar) {
        this.b = kVar;
        this.a = lVar;
        this.D = q1Var;
        this.E = q1Var.getMessageObject();
        this.x = new d[Math.min(5, arrayList.size())];
        int i10 = 0;
        while (true) {
            d[] dVarArr = this.x;
            if (i10 >= dVarArr.length) {
                this.c.setStyle(Paint.Style.FILL);
                Drawable mutate = lVar.getContext().getDrawable(R.drawable.reactions_bubble_shadow).mutate();
                this.y = mutate;
                q1Var.setHideSideButtonByQuickShare(true);
                lVar.performHapticFeedback(3, 1);
                int w02 = t6.w0(t6.G8, this.D.getResourcesProvider());
                mutate.setColorFilter(new PorterDuffColorFilter(t6.x0(null, t6.He, false), PorterDuff.Mode.MULTIPLY));
                LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, i0.L(100.0f), new int[]{w02, 16777215 & w02}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                this.f = linearGradient;
                this.c.setShader(linearGradient);
                ObjectAnimator objectAnimator = this.Z;
                LinearInterpolator linearInterpolator = h.b;
                objectAnimator.setInterpolator(linearInterpolator);
                this.Z.addListener(this);
                this.a0.setInterpolator(linearInterpolator);
                this.a0.addListener(this);
                i0.l2(new ag.l(this, 20), 15.0f);
                return;
            }
            dVarArr[i10] = new d(this, ((Long) arrayList.get(i10)).longValue());
            i10++;
        }
    }

    public static float b(float f7, float f10, float f11, float f12) {
        return (float) Math.toDegrees((float) Math.atan2(f12 - f10, f11 - f7));
    }

    public static PointF f(float f7, float f10, float f11, float f12, float f13, float f14, boolean z10) {
        float f15 = f12 - f7;
        float f16 = f13 - f10;
        float sqrt = (float) Math.sqrt(Math.pow(f16, 2.0d) + Math.pow(f15, 2.0d));
        if (sqrt > f11 + f14 || sqrt < Math.abs(f11 - f14)) {
            return null;
        }
        float f17 = ((sqrt * sqrt) + ((f11 * f11) - (f14 * f14))) / (2.0f * sqrt);
        float sqrt2 = (float) Math.sqrt(r8 - (f17 * f17));
        float A = a1.g.A(f17, f15, sqrt, f7);
        float A2 = a1.g.A(f17, f16, sqrt, f10);
        float f18 = (f16 * sqrt2) / sqrt;
        float f19 = A + f18;
        float f20 = (sqrt2 * f15) / sqrt;
        float f21 = A2 - f20;
        float f22 = A - f18;
        float f23 = A2 + f20;
        return (f19 == f22 || f19 >= f22) ? f21 > f23 ? new PointF(f19, f21) : new PointF(f22, f23) : z10 ? new PointF(f19, f21) : new PointF(f22, f23);
    }

    public static float g(float f7, float f10, float f11) {
        return c3.i0.z(f10, f7, f11, f7);
    }

    public static e i(Interpolator interpolator, int i10, int i11, int i12, boolean z10) {
        float f7 = i12;
        return new e(z10, i10 / f7, i11 / f7, interpolator);
    }

    public static float j(float f7) {
        return f7 <= 0.0f ? f7 + 180.0f : f7 - 180.0f;
    }

    public final void a(Path path, RectF rectF, float f7, float f10, boolean z10, boolean z11) {
        float f11 = f10 - f7;
        if (z10) {
            if (f11 > 0.0f) {
                f11 -= 360.0f;
            }
        } else if (f11 < 0.0f) {
            f11 += 360.0f;
        }
        if (Math.abs(f11) > 270.0f && z11) {
            this.Q = false;
        }
        path.arcTo(rectF, f7, f11);
    }

    public final void c() {
        this.a0.start();
        this.O = true;
        if (this.M && !this.T) {
            b bVar = new b(new mg.l(this, 2));
            this.P = bVar;
            RectF rectF = this.r;
            int width = (int) rectF.width();
            int height = (int) (rectF.height() + i0.L(30.0f));
            int i10 = i.a;
            bVar.a(width, height, 4.0f, i0.L(10));
        }
        invalidateSelf();
    }

    public final void d() {
        Bitmap bitmap;
        Bitmap bitmap2;
        Bitmap bitmap3;
        this.D.setHideSideButtonByQuickShare(false);
        if (this.T) {
            return;
        }
        this.T = true;
        Bitmap bitmap4 = this.I;
        if (bitmap4 != null) {
            bitmap4.recycle();
        }
        b bVar = this.P;
        if (bVar != null && (bitmap3 = bVar.c) != null) {
            bitmap3.recycle();
            bVar.c = null;
        }
        for (d dVar : this.x) {
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
        e(canvas, false, zs.e4);
    }

    public final void e(Canvas canvas, boolean z10, int i10) {
        float f7;
        int i11;
        l lVar;
        Canvas canvas2;
        int i12;
        float f10;
        int i13;
        int i14;
        j jVar = this;
        boolean z11 = jVar.S;
        l lVar2 = jVar.a;
        float f11 = 0.0f;
        int i15 = 0;
        q1 q1Var = jVar.D;
        int i16 = 1;
        if (!z11) {
            int[] iArr = d0;
            q1Var.getLocationInWindow(iArr);
            int i17 = iArr[0];
            int i18 = iArr[1];
            lVar2.getLocationInWindow(iArr);
            int i19 = iArr[0];
            int i20 = iArr[1];
            jVar.U = i17 - i19;
            jVar.V = i18 - i20;
            float L = i0.L(16.0f);
            float sideButtonStartX = q1Var.getSideButtonStartX() + jVar.U + L;
            float sideButtonStartY = q1Var.getSideButtonStartY() + jVar.V + L;
            float f12 = sideButtonStartX - L;
            float f13 = sideButtonStartY - L;
            float f14 = sideButtonStartX + L;
            float f15 = sideButtonStartY + L;
            RectF rectF = jVar.h;
            rectF.set(f12, f13, f14, f15);
            float L2 = i0.L(16.0f);
            if (rectF.right + i0.L(48.0f) + L2 > lVar2.getMeasuredWidth()) {
                jVar.F = Math.max(0.0f, (lVar2.getMeasuredWidth() - L2) - rectF.right);
            } else if (((rectF.right + i0.L(48.0f)) - jVar.h()) - L2 < 0.0f) {
                jVar.F = Math.max(0.0f, (L2 + jVar.h()) - rectF.right);
            } else {
                jVar.F = i0.L(48.0f);
            }
            jVar.Z.start();
            jVar.S = true;
        }
        b bVar = jVar.P;
        d[] dVarArr = jVar.x;
        int i21 = 2;
        RectF rectF2 = jVar.r;
        if (bVar != null && !z10) {
            bVar.setBounds((int) rectF2.left, (int) (rectF2.top - i0.L(30.0f)), (int) rectF2.right, (int) rectF2.bottom);
            jVar.P.i = (int) ((1.0f - h.c.getInterpolation(jVar.H)) * 255.0f);
            jVar.P.draw(canvas);
            if (jVar.R != -1) {
                float interpolation = 1.0f - h.e.getInterpolation(jVar.H);
                float interpolation2 = h.d.getInterpolation(jVar.H);
                int i22 = jVar.R - 2;
                float centerX = rectF2.centerX();
                int i23 = i.a;
                float L3 = centerX + (i0.L(i23 + 11) * i22);
                float centerY = rectF2.centerY();
                float f16 = jVar.X;
                float f17 = jVar.Y;
                float f18 = (L3 + f16) / 2.0f;
                eb ebVar = jVar.W;
                float min = (ebVar == null || !ebVar.top) ? Math.min(centerY, f17) - i0.L(15) : Math.max(centerY, f17) + i0.L(15);
                float g10 = g(L3, f16, interpolation2);
                double d = L3;
                double d10 = centerY;
                double d11 = f16;
                double d12 = f17;
                double d13 = f18;
                double d14 = d11 - d;
                double d15 = ((d11 * d) + ((d13 * d13) - (d11 * d13))) - (d13 * d);
                double d16 = d15 == 0.0d ? 0.0d : ((min - (((d12 - d10) * (d13 - d)) / d14)) - d10) / d15;
                double d17 = d * d;
                double d18 = d14 != 0.0d ? ((d12 - (((d11 * d11) - d17) * d16)) - d10) / d14 : 0.0d;
                double g11 = g(L3, f16, interpolation2);
                float f19 = (float) ((d18 * g11) + (d16 * g11 * g11) + ((d10 - (d17 * d16)) - (d18 * d)));
                float f20 = i23;
                float g12 = g((i0.L(f20) / 2.0f) + i0.L(2.0f), i0.L(12.0f), interpolation2);
                final d dVar = dVarArr[jVar.R];
                if (dVar.e == null) {
                    final int i24 = 1;
                    b bVar2 = new b(new a() { // from class: mh.c
                        @Override // mh.a
                        public final void s(Canvas canvas3, int i25) {
                            float f21;
                            switch (i24) {
                                case 0:
                                    d dVar2 = dVar;
                                    dVar2.getClass();
                                    canvas3.save();
                                    canvas3.translate(-dVar2.i, -dVar2.j);
                                    float f22 = dVar2.i;
                                    float f23 = dVar2.j;
                                    float f24 = i25 / 255.0f;
                                    RectF rectF3 = i0.P;
                                    float L4 = i0.L(21.0f) / 2.0f;
                                    int i26 = i.a;
                                    float f25 = 8;
                                    rectF3.set(f22, f23, dVar2.h.getWidth() + f22 + (i0.L(f25) * 2), i0.L(21.0f) + f23);
                                    q1 q1Var2 = dVar2.b;
                                    boolean e22 = q1Var2.e2();
                                    Paint paint = dVar2.g;
                                    if (paint != null) {
                                        int alpha = paint.getAlpha();
                                        paint.setAlpha((int) (255.0f * f24));
                                        canvas3.drawRoundRect(rectF3, L4, L4, paint);
                                        paint.setAlpha(alpha);
                                        f21 = 21.0f;
                                    } else {
                                        Point point = i0.q;
                                        f21 = 21.0f;
                                        q1Var2.A(0.0f, 0.0f, point.x, point.y);
                                        Paint X1 = q1Var2.X1("paintChatActionBackground");
                                        int alpha2 = X1.getAlpha();
                                        X1.setAlpha((int) ((e22 ? alpha2 : 229.5f) * f24));
                                        canvas3.drawRoundRect(rectF3, L4, L4, X1);
                                        X1.setAlpha(alpha2);
                                    }
                                    if (e22 || paint != null) {
                                        int alpha3 = t6.h2.getAlpha();
                                        t6.h2.setAlpha((int) (alpha3 * f24));
                                        canvas3.drawRoundRect(rectF3, L4, L4, t6.h2);
                                        t6.h2.setAlpha(alpha3);
                                    }
                                    canvas3.save();
                                    canvas3.translate(f22 + i0.L(f25), ((i0.L(f21) - dVar2.h.getHeight()) / 2.0f) + f23);
                                    int alpha4 = dVar2.h.getPaint().getAlpha();
                                    dVar2.h.getPaint().setAlpha((int) (alpha4 * f24));
                                    dVar2.h.draw(canvas3);
                                    dVar2.h.getPaint().setAlpha(alpha4);
                                    canvas3.restore();
                                    canvas3.restore();
                                    break;
                                default:
                                    d dVar3 = dVar;
                                    dVar3.getClass();
                                    int i27 = i.a;
                                    float L5 = i0.L(21);
                                    dVar3.a(canvas3, L5, L5, L5, i25 / 255.0f);
                                    break;
                            }
                        }
                    });
                    dVar.e = bVar2;
                    bVar2.a(i0.L(f20), i0.L(f20), 4.0f, i0.L(10));
                }
                canvas.save();
                canvas.translate(g10 - g12, f19 - g12);
                float f21 = 21;
                canvas.scale(g12 / i0.L(f21), g12 / i0.L(f21));
                b bVar3 = dVar.e;
                bVar3.i = (int) (interpolation * 255.0f);
                bVar3.draw(canvas);
                canvas.restore();
                return;
            }
            return;
        }
        float f22 = !z10 ? 1.0f - jVar.H : i10 / 255.0f;
        float g13 = g(0.3f, 0.075f, h.k.getInterpolation(jVar.G));
        Matrix matrix = jVar.d;
        matrix.reset();
        matrix.setScale(g13, g13);
        matrix.postTranslate(0.0f, rectF2.bottom);
        jVar.f.setLocalMatrix(matrix);
        int interpolation3 = (int) (h.j.getInterpolation(jVar.G) * 255.0f * f22);
        Paint paint = jVar.c;
        paint.setAlpha(interpolation3);
        RectF rectF3 = b0;
        rectF3.set(rectF2);
        rectF3.inset(-i0.L(8.0f), -i0.L(8.0f));
        Rect rect = c0;
        rectF3.round(rect);
        Drawable drawable = jVar.y;
        drawable.setAlpha((int) (f22 * 255.0f));
        drawable.setBounds(rect);
        drawable.draw(canvas);
        boolean z12 = jVar.M;
        RectF rectF4 = jVar.n;
        if (!z12) {
            float interpolation4 = (h.f.getInterpolation(jVar.G) - h.g.getInterpolation(jVar.G)) * (-40.0f);
            canvas.save();
            canvas.translate(rectF4.left, rectF4.top);
            canvas.rotate(interpolation4, i0.L(16.0f), i0.L(16.0f));
            canvas.translate(-q1Var.getSideButtonStartX(), -q1Var.getSideButtonStartY());
            q1Var.t1(canvas, true);
            canvas.restore();
        }
        if (!jVar.Q || jVar.M) {
            float min2 = Math.min(rectF2.width(), rectF2.height()) / 2.0f;
            float min3 = Math.min(rectF4.width(), rectF4.height()) / 2.0f;
            canvas.drawRoundRect(rectF2, min2, min2, paint);
            if (!jVar.M) {
                canvas.drawRoundRect(rectF4, min3, min3, paint);
            }
        } else {
            canvas.drawPath(jVar.e, paint);
        }
        float interpolation5 = h.t.getInterpolation(jVar.G) * i0.L(2.0f);
        float f23 = i.a + 2;
        float interpolation6 = ((h.q.getInterpolation(jVar.G) * i0.L(f23)) / 2.0f) - interpolation5;
        float interpolation7 = ((h.r.getInterpolation(jVar.G) * i0.L(f23)) / 2.0f) - interpolation5;
        float interpolation8 = ((h.s.getInterpolation(jVar.G) * i0.L(f23)) / 2.0f) - interpolation5;
        int i25 = 0;
        while (i25 < i21) {
            int i26 = i15;
            while (i26 < dVarArr.length) {
                if (!(i25 == 0 && i26 == jVar.R) && (i25 != i16 || i26 == jVar.R)) {
                    float length = i26 - ((dVarArr.length / 2.0f) - 0.5f);
                    float f24 = i26 == i21 ? interpolation6 : (i26 == i16 || i26 == 3) ? interpolation7 : interpolation8;
                    f7 = f11;
                    float L4 = (i0.L(i.a + 11) * length) + rectF2.centerX();
                    float centerY2 = rectF2.centerY();
                    i11 = i25;
                    final d dVar2 = dVarArr[i26];
                    float f25 = 16;
                    float L5 = i0.L(f25);
                    float measuredWidth = lVar2.getMeasuredWidth() - i0.L(f25);
                    float f26 = rectF2.left;
                    lVar = lVar2;
                    float f27 = rectF2.right;
                    if (i26 == jVar.R && jVar.O) {
                        canvas2 = canvas;
                        i12 = i26;
                        f10 = L4;
                    } else {
                        dVar2.getClass();
                        canvas2 = canvas;
                        i12 = i26;
                        f10 = L4;
                        dVar2.a(canvas2, f10, centerY2, f24 + (i0.L(2.0f) * dVar2.o), f22);
                    }
                    float f28 = dVar2.o;
                    if (f28 <= f7 || dVar2.h == null) {
                        i13 = i12;
                        i14 = 2;
                    } else {
                        float f29 = (f28 * 0.15f) + 0.85f;
                        canvas2.save();
                        canvas2.scale(f29, f29, f10, centerY2);
                        float f30 = dVar2.o * f22;
                        i13 = i12;
                        i14 = 2;
                        float D = m5.D(8, 2, dVar2.h.getWidth());
                        dVar2.i = d.b(d.b(f10, D, f26, f27), D, L5, measuredWidth) - (D / 2.0f);
                        dVar2.j = centerY2 - i0.L(58.0f);
                        if (dVar2.f == null) {
                            j jVar2 = dVar2.a;
                            if (!jVar2.T) {
                                dVar2.g = jVar2.L;
                                final int i27 = 0;
                                b bVar4 = new b(new a() { // from class: mh.c
                                    @Override // mh.a
                                    public final void s(Canvas canvas3, int i252) {
                                        float f212;
                                        switch (i27) {
                                            case 0:
                                                d dVar22 = dVar2;
                                                dVar22.getClass();
                                                canvas3.save();
                                                canvas3.translate(-dVar22.i, -dVar22.j);
                                                float f222 = dVar22.i;
                                                float f232 = dVar22.j;
                                                float f242 = i252 / 255.0f;
                                                RectF rectF32 = i0.P;
                                                float L42 = i0.L(21.0f) / 2.0f;
                                                int i262 = i.a;
                                                float f252 = 8;
                                                rectF32.set(f222, f232, dVar22.h.getWidth() + f222 + (i0.L(f252) * 2), i0.L(21.0f) + f232);
                                                q1 q1Var2 = dVar22.b;
                                                boolean e22 = q1Var2.e2();
                                                Paint paint2 = dVar22.g;
                                                if (paint2 != null) {
                                                    int alpha = paint2.getAlpha();
                                                    paint2.setAlpha((int) (255.0f * f242));
                                                    canvas3.drawRoundRect(rectF32, L42, L42, paint2);
                                                    paint2.setAlpha(alpha);
                                                    f212 = 21.0f;
                                                } else {
                                                    Point point = i0.q;
                                                    f212 = 21.0f;
                                                    q1Var2.A(0.0f, 0.0f, point.x, point.y);
                                                    Paint X1 = q1Var2.X1("paintChatActionBackground");
                                                    int alpha2 = X1.getAlpha();
                                                    X1.setAlpha((int) ((e22 ? alpha2 : 229.5f) * f242));
                                                    canvas3.drawRoundRect(rectF32, L42, L42, X1);
                                                    X1.setAlpha(alpha2);
                                                }
                                                if (e22 || paint2 != null) {
                                                    int alpha3 = t6.h2.getAlpha();
                                                    t6.h2.setAlpha((int) (alpha3 * f242));
                                                    canvas3.drawRoundRect(rectF32, L42, L42, t6.h2);
                                                    t6.h2.setAlpha(alpha3);
                                                }
                                                canvas3.save();
                                                canvas3.translate(f222 + i0.L(f252), ((i0.L(f212) - dVar22.h.getHeight()) / 2.0f) + f232);
                                                int alpha4 = dVar22.h.getPaint().getAlpha();
                                                dVar22.h.getPaint().setAlpha((int) (alpha4 * f242));
                                                dVar22.h.draw(canvas3);
                                                dVar22.h.getPaint().setAlpha(alpha4);
                                                canvas3.restore();
                                                canvas3.restore();
                                                break;
                                            default:
                                                d dVar3 = dVar2;
                                                dVar3.getClass();
                                                int i272 = i.a;
                                                float L52 = i0.L(21);
                                                dVar3.a(canvas3, L52, L52, L52, i252 / 255.0f);
                                                break;
                                        }
                                    }
                                });
                                dVar2.f = bVar4;
                                bVar4.a((int) D, i0.L(21.0f), 3.0f, i0.L(4));
                            }
                        }
                        b bVar5 = dVar2.f;
                        if (bVar5 != null) {
                            float f31 = dVar2.i;
                            float f32 = dVar2.j;
                            bVar5.setBounds((int) f31, (int) f32, (int) (f31 + D), (int) (f32 + i0.L(21.0f)));
                            b bVar6 = dVar2.f;
                            bVar6.i = (int) (f30 * 255.0f);
                            bVar6.draw(canvas2);
                        }
                        canvas2.restore();
                    }
                } else {
                    i11 = i25;
                    i13 = i26;
                    lVar = lVar2;
                    f7 = f11;
                    i14 = i21;
                }
                i26 = i13 + 1;
                jVar = this;
                i21 = i14;
                i25 = i11;
                f11 = f7;
                lVar2 = lVar;
                i16 = 1;
            }
            i25++;
            jVar = this;
            i15 = 0;
            i16 = 1;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return 0;
    }

    public final int h() {
        return i0.L(((i.a + 11) * this.x.length) + 7);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ObjectAnimator objectAnimator = this.Z;
        k kVar = this.b;
        if (animator == objectAnimator) {
            this.D.setHideSideButtonByQuickShare(false);
            this.M = true;
            invalidateSelf();
            if (this.N) {
                kVar.run();
                return;
            }
            return;
        }
        if (animator == this.a0) {
            this.N = true;
            invalidateSelf();
            eb ebVar = this.W;
            if (ebVar != null) {
                ebVar.a.setVisibility(0);
            }
            if (this.M) {
                kVar.run();
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
