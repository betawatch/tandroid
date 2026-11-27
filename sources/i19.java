// default package

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

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class i19 extends Drawable implements Animator.AnimatorListener {
    public static final RectF c0 = new RectF();
    public static final Rect d0 = new Rect();
    public static final int[] e0 = new int[2];
    public static final qm f0 = new qm("openFactor", (byte) 11);
    public static final qm g0 = new qm("openFactor", (byte) 12);
    public final wb2 E;
    public final r47 F;
    public float G;
    public Bitmap J;
    public BitmapShader K;
    public Paint M;
    public al0 Q;
    public boolean T;
    public boolean U;
    public int V;
    public int W;
    public c21 X;
    public float Y;
    public float Z;
    public final j19 a;
    public final z09 b;
    public final LinearGradient f;
    public final f19[] x;
    public final Drawable y;
    public final Paint c = new Paint(1);
    public final Matrix d = new Matrix();
    public final Path e = new Path();
    public final RectF h = new RectF();
    public final RectF n = new RectF();
    public final RectF r = new RectF();
    public final RectF s = new RectF();
    public final RectF w = new RectF();
    public float H = 0.0f;
    public float I = 0.0f;
    public final Matrix L = new Matrix();
    public boolean N = false;
    public boolean O = false;
    public boolean P = false;
    public boolean R = true;
    public int S = -1;
    public final ObjectAnimator a0 = ObjectAnimator.ofFloat(this, f0, 1.0f).setDuration(560L);
    public final ObjectAnimator b0 = ObjectAnimator.ofFloat(this, g0, 1.0f).setDuration(240L);

    public i19(j19 j19Var, wb2 wb2Var, ArrayList arrayList, z09 z09Var) {
        this.b = z09Var;
        this.a = j19Var;
        this.E = wb2Var;
        this.F = wb2Var.getMessageObject();
        this.x = new f19[Math.min(5, arrayList.size())];
        int i = 0;
        while (true) {
            f19[] f19VarArr = this.x;
            if (i >= f19VarArr.length) {
                this.c.setStyle(Paint.Style.FILL);
                Drawable mutate = j19Var.getContext().getDrawable(R.drawable.reactions_bubble_shadow).mutate();
                this.y = mutate;
                wb2Var.setHideSideButtonByQuickShare(true);
                j19Var.performHapticFeedback(3, 1);
                int v0 = aob.v0(aob.G8, this.E.getResourcesProvider());
                mutate.setColorFilter(new PorterDuffColorFilter(aob.w0(null, aob.Ke, false), PorterDuff.Mode.MULTIPLY));
                LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, hl.L(100.0f), new int[]{v0, 16777215 & v0}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                this.f = linearGradient;
                this.c.setShader(linearGradient);
                ObjectAnimator objectAnimator = this.a0;
                LinearInterpolator linearInterpolator = h19.b;
                objectAnimator.setInterpolator(linearInterpolator);
                this.a0.addListener(this);
                this.b0.setInterpolator(linearInterpolator);
                this.b0.addListener(this);
                hl.j2(new ii7(this, (byte) 26), 15.0f);
                return;
            }
            f19VarArr[i] = new f19(this, ((Long) arrayList.get(i)).longValue());
            i++;
        }
    }

    public static float b(float f, float f2, float f3, float f4) {
        return (float) Math.toDegrees((float) Math.atan2(f4 - f2, f3 - f));
    }

    public static PointF f(float f, float f2, float f3, float f4, float f5, float f6, boolean z) {
        float f7 = f4 - f;
        float f8 = f5 - f2;
        float sqrt = (float) Math.sqrt(Math.pow(f8, 2.0d) + Math.pow(f7, 2.0d));
        if (sqrt > f3 + f6 || sqrt < Math.abs(f3 - f6)) {
            return null;
        }
        float f9 = ((sqrt * sqrt) + ((f3 * f3) - (f6 * f6))) / (2.0f * sqrt);
        float sqrt2 = (float) Math.sqrt(r8 - (f9 * f9));
        float d = qu6.d(f9, f7, sqrt, f);
        float d2 = qu6.d(f9, f8, sqrt, f2);
        float f10 = (f8 * sqrt2) / sqrt;
        float f11 = d + f10;
        float f12 = (sqrt2 * f7) / sqrt;
        float f13 = d2 - f12;
        float f14 = d - f10;
        float f15 = d2 + f12;
        return (f11 == f14 || f11 >= f14) ? f13 > f15 ? new PointF(f11, f13) : new PointF(f14, f15) : z ? new PointF(f11, f13) : new PointF(f14, f15);
    }

    public static float g(float f, float f2, float f3) {
        return qd4.A(f2, f, f3, f);
    }

    public static g19 i(Interpolator interpolator, int i, int i2, int i3, boolean z) {
        float f = i3;
        return new g19(z, i / f, i2 / f, interpolator);
    }

    public static float j(float f) {
        return f <= 0.0f ? f + 180.0f : f - 180.0f;
    }

    public final void a(Path path, RectF rectF, float f, float f2, boolean z, boolean z2) {
        float f3 = f2 - f;
        if (z) {
            if (f3 > 0.0f) {
                f3 -= 360.0f;
            }
        } else if (f3 < 0.0f) {
            f3 += 360.0f;
        }
        if (Math.abs(f3) > 270.0f && z2) {
            this.R = false;
        }
        path.arcTo(rectF, f, f3);
    }

    public final void c() {
        this.b0.start();
        this.P = true;
        if (this.N && !this.U) {
            al0 al0Var = new al0(new jz7((Object) this, (byte) 24));
            this.Q = al0Var;
            RectF rectF = this.r;
            al0Var.b((int) rectF.width(), (int) (rectF.height() + hl.L(30.0f)), 4.0f, hl.L(10.0f));
        }
        invalidateSelf();
    }

    public final void d() {
        this.E.setHideSideButtonByQuickShare(false);
        if (this.U) {
            return;
        }
        this.U = true;
        Bitmap bitmap = this.J;
        if (bitmap != null) {
            bitmap.recycle();
        }
        al0 al0Var = this.Q;
        if (al0Var != null) {
            al0Var.a();
        }
        for (f19 f19Var : this.x) {
            al0 al0Var2 = f19Var.f;
            if (al0Var2 != null) {
                al0Var2.a();
            }
            al0 al0Var3 = f19Var.e;
            if (al0Var3 != null) {
                al0Var3.a();
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        e(canvas, false, jn7.d4);
    }

    /* JADX WARN: Removed duplicated region for block: B:83:0x0439  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(Canvas canvas, boolean z, int i) {
        float f;
        float f2;
        j19 j19Var;
        float f3;
        float f4;
        int i2;
        final f19 f19Var;
        float f5;
        int i3;
        RectF rectF;
        float f6;
        int i4;
        final byte b;
        al0 al0Var;
        i19 i19Var = this;
        boolean z2 = i19Var.T;
        j19 j19Var2 = i19Var.a;
        byte b2 = 0;
        wb2 wb2Var = i19Var.E;
        if (!z2) {
            int[] iArr = e0;
            wb2Var.getLocationInWindow(iArr);
            int i5 = iArr[0];
            int i6 = iArr[1];
            j19Var2.getLocationInWindow(iArr);
            int i7 = iArr[0];
            int i8 = iArr[1];
            i19Var.V = i5 - i7;
            i19Var.W = i6 - i8;
            float L = hl.L(16.0f);
            float sideButtonStartX = wb2Var.getSideButtonStartX() + i19Var.V + L;
            float sideButtonStartY = wb2Var.getSideButtonStartY() + i19Var.W + L;
            float f7 = sideButtonStartX - L;
            float f8 = sideButtonStartY - L;
            float f9 = sideButtonStartX + L;
            float f10 = sideButtonStartY + L;
            RectF rectF2 = i19Var.h;
            rectF2.set(f7, f8, f9, f10);
            float L2 = hl.L(16.0f);
            if (rectF2.right + hl.L(48.0f) + L2 > j19Var2.getMeasuredWidth()) {
                i19Var.G = Math.max(0.0f, (j19Var2.getMeasuredWidth() - L2) - rectF2.right);
            } else if (((rectF2.right + hl.L(48.0f)) - i19Var.h()) - L2 < 0.0f) {
                i19Var.G = Math.max(0.0f, (L2 + i19Var.h()) - rectF2.right);
            } else {
                i19Var.G = hl.L(48.0f);
            }
            i19Var.a0.start();
            i19Var.T = true;
        }
        al0 al0Var2 = i19Var.Q;
        float f11 = 53.0f;
        f19[] f19VarArr = i19Var.x;
        int i9 = 2;
        RectF rectF3 = i19Var.r;
        if (al0Var2 != null && !z) {
            al0Var2.setBounds((int) rectF3.left, (int) (rectF3.top - hl.L(30.0f)), (int) rectF3.right, (int) rectF3.bottom);
            i19Var.Q.i = (int) ((1.0f - h19.c.getInterpolation(i19Var.I)) * 255.0f);
            i19Var.Q.draw(canvas);
            if (i19Var.S != -1) {
                float interpolation = 1.0f - h19.e.getInterpolation(i19Var.I);
                float interpolation2 = h19.d.getInterpolation(i19Var.I);
                float centerX = rectF3.centerX() + (hl.L(53.0f) * (i19Var.S - 2));
                float centerY = rectF3.centerY();
                float f12 = i19Var.Y;
                float f13 = i19Var.Z;
                float f14 = (centerX + f12) / 2.0f;
                c21 c21Var = i19Var.X;
                float min = (c21Var == null || !c21Var.top) ? Math.min(centerY, f13) - hl.L(15.0f) : Math.max(centerY, f13) + hl.L(15.0f);
                float g = g(centerX, f12, interpolation2);
                double d = centerX;
                double d2 = centerY;
                double d3 = f12;
                double d4 = f13;
                double d5 = f14;
                double d6 = d3 - d;
                double d7 = ((d3 * d) + ((d5 * d5) - (d3 * d5))) - (d5 * d);
                double d8 = d7 == 0.0d ? 0.0d : ((min - (((d4 - d2) * (d5 - d)) / d6)) - d2) / d7;
                double d9 = d * d;
                double d10 = d6 != 0.0d ? ((d4 - (((d3 * d3) - d9) * d8)) - d2) / d6 : 0.0d;
                double g2 = g(centerX, f12, interpolation2);
                float f15 = (float) ((d10 * g2) + (d8 * g2 * g2) + ((d2 - (d9 * d8)) - (d10 * d)));
                float g3 = g((hl.L(42.0f) / 2.0f) + hl.L(2.0f), hl.L(12.0f), interpolation2);
                final f19 f19Var2 = f19VarArr[i19Var.S];
                if (f19Var2.e == null) {
                    final byte b3 = 1;
                    al0 al0Var3 = new al0(new zk0() { // from class: e19
                        @Override // zk0
                        public final void n(Canvas canvas2, int i10) {
                            switch (b3) {
                                case 0:
                                    f19 f19Var3 = f19Var2;
                                    f19Var3.getClass();
                                    canvas2.save();
                                    canvas2.translate(-f19Var3.i, -f19Var3.j);
                                    float f16 = f19Var3.i;
                                    float f17 = f19Var3.j;
                                    float f18 = i10 / 255.0f;
                                    RectF rectF4 = hl.P;
                                    float L3 = hl.L(21.0f) / 2.0f;
                                    rectF4.set(f16, f17, f19Var3.h.getWidth() + f16 + (hl.L(8.0f) << 1), hl.L(21.0f) + f17);
                                    wb2 wb2Var2 = f19Var3.b;
                                    boolean i22 = wb2Var2.i2();
                                    Paint paint = f19Var3.g;
                                    if (paint != null) {
                                        int alpha = paint.getAlpha();
                                        paint.setAlpha((int) (255.0f * f18));
                                        canvas2.drawRoundRect(rectF4, L3, L3, paint);
                                        paint.setAlpha(alpha);
                                    } else {
                                        Point point = hl.q;
                                        wb2Var2.D(0.0f, 0.0f, point.x, point.y);
                                        Paint c2 = wb2Var2.c2("paintChatActionBackground");
                                        int alpha2 = c2.getAlpha();
                                        c2.setAlpha((int) ((i22 ? alpha2 : 229.5f) * f18));
                                        canvas2.drawRoundRect(rectF4, L3, L3, c2);
                                        c2.setAlpha(alpha2);
                                    }
                                    if (i22 || paint != null) {
                                        int alpha3 = aob.h2.getAlpha();
                                        aob.h2.setAlpha((int) (alpha3 * f18));
                                        canvas2.drawRoundRect(rectF4, L3, L3, aob.h2);
                                        aob.h2.setAlpha(alpha3);
                                    }
                                    canvas2.save();
                                    canvas2.translate(f16 + hl.L(8.0f), ((hl.L(21.0f) - f19Var3.h.getHeight()) / 2.0f) + f17);
                                    int alpha4 = f19Var3.h.getPaint().getAlpha();
                                    f19Var3.h.getPaint().setAlpha((int) (alpha4 * f18));
                                    f19Var3.h.draw(canvas2);
                                    f19Var3.h.getPaint().setAlpha(alpha4);
                                    canvas2.restore();
                                    canvas2.restore();
                                    break;
                                default:
                                    float L4 = hl.L(21.0f);
                                    f19Var2.a(L4, L4, L4, i10 / 255.0f, canvas2);
                                    break;
                            }
                        }
                    });
                    f19Var2.e = al0Var3;
                    al0Var3.b(hl.L(42.0f), hl.L(42.0f), 4.0f, hl.L(10.0f));
                }
                canvas.save();
                canvas.translate(g - g3, f15 - g3);
                canvas.scale(g3 / hl.L(21.0f), g3 / hl.L(21.0f));
                al0 al0Var4 = f19Var2.e;
                al0Var4.i = (int) (interpolation * 255.0f);
                al0Var4.draw(canvas);
                canvas.restore();
                return;
            }
            return;
        }
        float f16 = !z ? 1.0f - i19Var.I : i / 255.0f;
        float g4 = g(0.3f, 0.075f, h19.k.getInterpolation(i19Var.H));
        Matrix matrix = i19Var.d;
        matrix.reset();
        matrix.setScale(g4, g4);
        matrix.postTranslate(0.0f, rectF3.bottom);
        i19Var.f.setLocalMatrix(matrix);
        int interpolation3 = (int) (h19.j.getInterpolation(i19Var.H) * 255.0f * f16);
        Paint paint = i19Var.c;
        paint.setAlpha(interpolation3);
        RectF rectF4 = c0;
        rectF4.set(rectF3);
        float f17 = 8.0f;
        rectF4.inset(-hl.L(8.0f), -hl.L(8.0f));
        Rect rect = d0;
        rectF4.round(rect);
        Drawable drawable = i19Var.y;
        drawable.setAlpha((int) (f16 * 255.0f));
        drawable.setBounds(rect);
        drawable.draw(canvas);
        boolean z3 = i19Var.N;
        RectF rectF5 = i19Var.n;
        if (z3) {
            f = 16.0f;
        } else {
            f = 16.0f;
            float interpolation4 = (h19.f.getInterpolation(i19Var.H) - h19.g.getInterpolation(i19Var.H)) * (-40.0f);
            canvas.save();
            canvas.translate(rectF5.left, rectF5.top);
            canvas.rotate(interpolation4, hl.L(16.0f), hl.L(16.0f));
            canvas.translate(-wb2Var.getSideButtonStartX(), -wb2Var.getSideButtonStartY());
            wb2Var.x1(canvas, true);
            canvas.restore();
        }
        if (!i19Var.R || i19Var.N) {
            float min2 = Math.min(rectF3.width(), rectF3.height()) / 2.0f;
            float min3 = Math.min(rectF5.width(), rectF5.height()) / 2.0f;
            canvas.drawRoundRect(rectF3, min2, min2, paint);
            if (!i19Var.N) {
                canvas.drawRoundRect(rectF5, min3, min3, paint);
            }
        } else {
            canvas.drawPath(i19Var.e, paint);
        }
        float interpolation5 = h19.t.getInterpolation(i19Var.H) * hl.L(2.0f);
        float interpolation6 = ((h19.q.getInterpolation(i19Var.H) * hl.L(44.0f)) / 2.0f) - interpolation5;
        float interpolation7 = ((h19.r.getInterpolation(i19Var.H) * hl.L(44.0f)) / 2.0f) - interpolation5;
        float interpolation8 = ((h19.s.getInterpolation(i19Var.H) * hl.L(44.0f)) / 2.0f) - interpolation5;
        int i10 = 0;
        while (i10 < i9) {
            int i11 = b2;
            while (i11 < f19VarArr.length) {
                if (!(i10 == 0 && i11 == i19Var.S) && (i10 != 1 || i11 == i19Var.S)) {
                    f2 = f17;
                    float length = i11 - ((f19VarArr.length / 2.0f) - 0.5f);
                    float f18 = i11 == i9 ? interpolation6 : (i11 == 1 || i11 == 3) ? interpolation7 : interpolation8;
                    float L3 = (hl.L(f11) * length) + rectF3.centerX();
                    float centerY2 = rectF3.centerY();
                    f19 f19Var3 = f19VarArr[i11];
                    float L4 = hl.L(f);
                    float measuredWidth = j19Var2.getMeasuredWidth() - hl.L(f);
                    j19Var = j19Var2;
                    float f19 = rectF3.left;
                    f3 = interpolation8;
                    float f20 = rectF3.right;
                    if (i11 == i19Var.S && i19Var.P) {
                        f4 = L3;
                        i2 = i11;
                        f19Var = f19Var3;
                        f5 = measuredWidth;
                        i3 = 2;
                        rectF = rectF3;
                        f6 = f16;
                    } else {
                        f19Var3.getClass();
                        float L5 = (hl.L(2.0f) * f19Var3.o) + f18;
                        i2 = i11;
                        f19Var = f19Var3;
                        f5 = measuredWidth;
                        i3 = 2;
                        rectF = rectF3;
                        f6 = f16;
                        f4 = L3;
                        f19Var.a(f4, centerY2, L5, f6, canvas);
                    }
                    float f21 = f19Var.o;
                    i4 = i2;
                    if (f21 <= 0.0f || f19Var.h == null) {
                        b = 0;
                    } else {
                        float f22 = (f21 * 0.15f) + 0.85f;
                        canvas.save();
                        canvas.scale(f22, f22, f4, centerY2);
                        float f23 = f19Var.o * f6;
                        float width = f19Var.h.getWidth() + (hl.L(f2) << 1);
                        f19Var.i = f19.b(f19.b(f4, width, f19, f20), width, L4, f5) - (width / 2.0f);
                        f19Var.j = centerY2 - hl.L(58.0f);
                        if (f19Var.f == null) {
                            i19 i19Var2 = f19Var.a;
                            if (!i19Var2.U) {
                                f19Var.g = i19Var2.M;
                                b = 0;
                                al0 al0Var5 = new al0(new zk0() { // from class: e19
                                    @Override // zk0
                                    public final void n(Canvas canvas2, int i102) {
                                        switch (b) {
                                            case 0:
                                                f19 f19Var32 = f19Var;
                                                f19Var32.getClass();
                                                canvas2.save();
                                                canvas2.translate(-f19Var32.i, -f19Var32.j);
                                                float f162 = f19Var32.i;
                                                float f172 = f19Var32.j;
                                                float f182 = i102 / 255.0f;
                                                RectF rectF42 = hl.P;
                                                float L32 = hl.L(21.0f) / 2.0f;
                                                rectF42.set(f162, f172, f19Var32.h.getWidth() + f162 + (hl.L(8.0f) << 1), hl.L(21.0f) + f172);
                                                wb2 wb2Var2 = f19Var32.b;
                                                boolean i22 = wb2Var2.i2();
                                                Paint paint2 = f19Var32.g;
                                                if (paint2 != null) {
                                                    int alpha = paint2.getAlpha();
                                                    paint2.setAlpha((int) (255.0f * f182));
                                                    canvas2.drawRoundRect(rectF42, L32, L32, paint2);
                                                    paint2.setAlpha(alpha);
                                                } else {
                                                    Point point = hl.q;
                                                    wb2Var2.D(0.0f, 0.0f, point.x, point.y);
                                                    Paint c2 = wb2Var2.c2("paintChatActionBackground");
                                                    int alpha2 = c2.getAlpha();
                                                    c2.setAlpha((int) ((i22 ? alpha2 : 229.5f) * f182));
                                                    canvas2.drawRoundRect(rectF42, L32, L32, c2);
                                                    c2.setAlpha(alpha2);
                                                }
                                                if (i22 || paint2 != null) {
                                                    int alpha3 = aob.h2.getAlpha();
                                                    aob.h2.setAlpha((int) (alpha3 * f182));
                                                    canvas2.drawRoundRect(rectF42, L32, L32, aob.h2);
                                                    aob.h2.setAlpha(alpha3);
                                                }
                                                canvas2.save();
                                                canvas2.translate(f162 + hl.L(8.0f), ((hl.L(21.0f) - f19Var32.h.getHeight()) / 2.0f) + f172);
                                                int alpha4 = f19Var32.h.getPaint().getAlpha();
                                                f19Var32.h.getPaint().setAlpha((int) (alpha4 * f182));
                                                f19Var32.h.draw(canvas2);
                                                f19Var32.h.getPaint().setAlpha(alpha4);
                                                canvas2.restore();
                                                canvas2.restore();
                                                break;
                                            default:
                                                float L42 = hl.L(21.0f);
                                                f19Var.a(L42, L42, L42, i102 / 255.0f, canvas2);
                                                break;
                                        }
                                    }
                                });
                                f19Var.f = al0Var5;
                                al0Var5.b((int) width, hl.L(21.0f), 3.0f, hl.L(4.0f));
                                al0Var = f19Var.f;
                                if (al0Var != null) {
                                    float f24 = f19Var.i;
                                    float f25 = f19Var.j;
                                    al0Var.setBounds((int) f24, (int) f25, (int) (f24 + width), (int) (f25 + hl.L(21.0f)));
                                    al0 al0Var6 = f19Var.f;
                                    al0Var6.i = (int) (f23 * 255.0f);
                                    al0Var6.draw(canvas);
                                }
                                canvas.restore();
                            }
                        }
                        b = 0;
                        al0Var = f19Var.f;
                        if (al0Var != null) {
                        }
                        canvas.restore();
                    }
                } else {
                    i4 = i11;
                    i3 = i9;
                    rectF = rectF3;
                    j19Var = j19Var2;
                    f3 = interpolation8;
                    b = b2;
                    f2 = f17;
                    f6 = f16;
                }
                i11 = i4 + 1;
                i19Var = this;
                f17 = f2;
                f16 = f6;
                b2 = b;
                rectF3 = rectF;
                i9 = i3;
                j19Var2 = j19Var;
                interpolation8 = f3;
                f11 = 53.0f;
            }
            i10++;
            i19Var = this;
            rectF3 = rectF3;
            j19Var2 = j19Var2;
            f11 = 53.0f;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return 0;
    }

    public final int h() {
        return hl.L((53 * this.x.length) + 7);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ObjectAnimator objectAnimator = this.a0;
        z09 z09Var = this.b;
        if (animator == objectAnimator) {
            this.E.setHideSideButtonByQuickShare(false);
            this.N = true;
            invalidateSelf();
            if (this.O) {
                z09Var.run();
                return;
            }
            return;
        }
        if (animator == this.b0) {
            this.O = true;
            invalidateSelf();
            c21 c21Var = this.X;
            if (c21Var != null) {
                c21Var.a.setVisibility(0);
            }
            if (this.N) {
                z09Var.run();
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
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
