package fi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.c20;
import org.telegram.messenger.hd;
import org.telegram.messenger.qs;
import org.telegram.ui.Components.xq;
import org.telegram.ui.l61;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public class y6 extends View {
    public final org.telegram.ui.Components.i6 D;
    public final Path E;
    public final Path F;
    public final Path G;
    public final Path H;
    public final Path I;
    public final org.telegram.ui.Components.w5 J;
    public final org.telegram.ui.Components.w5 K;
    public float L;
    public long M;
    public float N;
    public int O;
    public int P;
    public final TextPaint Q;
    public int R;
    public final int a;
    public float b;
    public float c;
    public float d;
    public boolean e;
    public final org.telegram.ui.Components.w5 f;
    public c20 h;
    public final Paint n;
    public final Paint r;
    public final Paint s;
    public final Paint w;
    public final Paint x;
    public final org.telegram.ui.Components.i6 y;

    public y6(Context context, int i7) {
        super(context);
        this.b = 0.0f;
        this.c = 1.0f;
        xq xqVar = xq.h;
        this.f = new org.telegram.ui.Components.w5(this, 0L, 320L, xqVar);
        Paint paint = new Paint(1);
        this.n = paint;
        Paint paint2 = new Paint(1);
        this.r = paint2;
        Paint paint3 = new Paint(1);
        this.s = paint3;
        Paint paint4 = new Paint(1);
        this.w = paint4;
        Paint paint5 = new Paint(1);
        this.x = paint5;
        org.telegram.ui.Components.i6 i6Var = new org.telegram.ui.Components.i6(false, true, true);
        this.y = i6Var;
        this.E = new Path();
        this.F = new Path();
        this.G = new Path();
        this.H = new Path();
        this.I = new Path();
        this.J = new org.telegram.ui.Components.w5(this, 0L, 350L, xqVar);
        this.K = new org.telegram.ui.Components.w5(this, 0L, 350L, xqVar);
        this.Q = new TextPaint(1);
        this.a = i7;
        i6Var.x(org.telegram.messenger.g0.o());
        i6Var.n(0.3f, 40L, xqVar);
        i6Var.setCallback(this);
        i6Var.u(-1);
        Point point = org.telegram.messenger.g0.q;
        i6Var.M = point.x;
        if (i7 == 0) {
            i6Var.w(org.telegram.messenger.g0.L(15.0f));
            this.D = null;
            paint2.setColor(-1);
            paint3.setColor(-1);
            paint4.setColor(-1);
            paint5.setColor(-1);
            paint5.setStyle(Paint.Style.STROKE);
            paint5.setStrokeCap(Paint.Cap.ROUND);
        } else {
            i6Var.w(org.telegram.messenger.g0.L(14.0f));
            i6Var.b = 5;
            org.telegram.ui.Components.i6 i6Var2 = new org.telegram.ui.Components.i6(false, true, true);
            this.D = i6Var2;
            i6Var2.M = point.x;
            i6Var2.w(org.telegram.messenger.g0.L(14.0f));
            i6Var2.x(org.telegram.messenger.g0.o());
            i6Var2.n(0.3f, 40L, xqVar);
            i6Var2.setCallback(this);
            i6Var2.u(-1);
            if (i7 == 1) {
                i6Var2.t(hd.M0(2131750692, null), true, true);
            } else if (i7 == 2) {
                i6Var2.t(hd.M0(2131750693, null), true, true);
            } else if (i7 == 3) {
                i6Var2.t(hd.M0(2131742955, null), true, true);
            }
        }
        i6Var.t("", true, true);
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.XOR));
    }

    public final void a(float f10) {
        this.e = true;
        float f11 = this.b;
        this.d = (f10 - f11) / (this.c - f11);
        e(f10);
    }

    public final void b() {
        this.b = 0.0f;
        this.c = 0.9f;
    }

    public final void c(l61 l61Var) {
        this.h = l61Var;
    }

    public final void d(float f10) {
        float f11 = this.b;
        float f12 = (f10 - f11) / (this.c - f11);
        this.d = f12;
        this.f.e(true, f12);
        e(f10);
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        canvas.save();
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(0.0f, 0.0f, this.O, this.P);
        Path path = this.E;
        path.rewind();
        float f10 = this.N;
        path.addRoundRect(rectF, f10, f10, Path.Direction.CW);
        canvas.clipPath(path);
        float e10 = this.e ? this.f.e(false, this.d) : this.d;
        canvas.saveLayerAlpha(0.0f, 0.0f, this.O, this.P, qs.e4, 31);
        int i7 = this.a;
        org.telegram.ui.Components.i6 i6Var = this.y;
        if (i7 == 0) {
            i6Var.setBounds(org.telegram.messenger.g0.L(42.0f), -org.telegram.messenger.g0.L(1.0f), this.O, this.P - org.telegram.messenger.g0.L(1.0f));
            i6Var.draw(canvas);
        } else {
            int L = org.telegram.messenger.g0.L(12.33f);
            int i10 = -org.telegram.messenger.g0.L(1.0f);
            int c10 = (this.O - ((int) i6Var.c())) - org.telegram.messenger.g0.L(6.0f);
            int L2 = this.P - org.telegram.messenger.g0.L(1.0f);
            org.telegram.ui.Components.i6 i6Var2 = this.D;
            i6Var2.setBounds(L, i10, c10, L2);
            i6Var2.draw(canvas);
            i6Var.setBounds(this.O - org.telegram.messenger.g0.L(111.0f), -org.telegram.messenger.g0.L(1.0f), this.O - org.telegram.messenger.g0.L(11.0f), this.P - org.telegram.messenger.g0.L(1.0f));
            i6Var.draw(canvas);
        }
        if (i7 == 0) {
            canvas.drawPath(this.F, this.r);
            canvas.drawPath(this.G, this.s);
            float f11 = this.c;
            float f12 = this.b;
            float f13 = f11 - f12;
            double d = f13 != 0.0f ? (f13 * this.d) + f12 : 0.0f;
            float d2 = this.J.d(d > 0.25d);
            canvas.save();
            canvas.translate((1.0f - d2) * (-org.telegram.messenger.g0.N(0.33f)), 0.0f);
            Paint paint = this.w;
            paint.setAlpha((int) (d2 * 255.0f));
            canvas.drawPath(this.H, paint);
            canvas.restore();
            float d10 = this.K.d(d > 0.5d);
            canvas.save();
            canvas.translate((1.0f - d10) * (-org.telegram.messenger.g0.N(0.66f)), 0.0f);
            Paint paint2 = this.x;
            paint2.setAlpha((int) (d10 * 255.0f));
            canvas.drawPath(this.I, paint2);
            canvas.restore();
        }
        canvas.save();
        canvas.drawRect(0.0f, 0.0f, this.O * e10, this.P, this.n);
        canvas.restore();
        canvas.restore();
        canvas.restore();
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z9 = false;
        if (this.O <= 0) {
            return false;
        }
        float x10 = motionEvent.getX();
        if (motionEvent.getAction() == 0) {
            this.M = System.currentTimeMillis();
            this.e = false;
        } else if (motionEvent.getAction() == 2 || motionEvent.getAction() == 1) {
            float f10 = this.c;
            float f11 = this.b;
            float z10 = f10 - f11 != 0.0f ? com.google.android.recaptcha.internal.a.z(f10, f11, this.d, f11) : 0.0f;
            if (motionEvent.getAction() != 1 || System.currentTimeMillis() - this.M >= ViewConfiguration.getTapTimeout()) {
                this.d = Utilities.i(((x10 - this.L) / this.O) + this.d, 1.0f, 0.0f);
                this.e = false;
                z9 = true;
            } else {
                this.f.e(true, this.d);
                this.d = x10 / this.O;
                this.e = true;
            }
            float f12 = this.c;
            float f13 = this.b;
            float z11 = f12 - f13 != 0.0f ? com.google.android.recaptcha.internal.a.z(f12, f13, this.d, f13) : 0.0f;
            if (z9) {
                if ((z11 <= f13 && z10 > z11) || (z11 >= f12 && z10 < z11)) {
                    try {
                        performHapticFeedback(3, 1);
                    } catch (Exception unused) {
                    }
                } else if (Math.floor(z10 * 5.0f) != Math.floor(5.0f * z11)) {
                    org.telegram.messenger.g0.c4(this);
                }
            }
            e(z11);
            c20 c20Var = this.h;
            if (c20Var != null) {
                c20Var.a(Float.valueOf(z11));
            }
        }
        this.L = x10;
        return true;
    }

    public final void e(float f10) {
        String str = Math.round(100.0f * f10) + "%";
        org.telegram.ui.Components.i6 i6Var = this.y;
        if (!TextUtils.equals(i6Var.i, str)) {
            i6Var.a();
            i6Var.n(0.3f, this.e ? 320L : 40L, xq.h);
            i6Var.t(str, true, true);
        }
        if (this.a == 1) {
            this.n.setColor(p2.f(f10));
        }
        invalidate();
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        this.N = org.telegram.messenger.g0.L(12.0f);
        float L = org.telegram.messenger.g0.L(16.0f);
        TextPaint textPaint = this.Q;
        textPaint.setTextSize(L);
        this.y.w(org.telegram.messenger.g0.L(15.0f));
        int i11 = this.R;
        int i12 = this.a;
        if (i11 > 0) {
            this.O = i11;
            this.P = org.telegram.messenger.g0.L(48.0f);
        } else if (i12 == 0) {
            this.O = (int) Math.min(textPaint.measureText(hd.M0(2131744721, null)) + org.telegram.messenger.g0.L(88.0f), View.MeasureSpec.getSize(i7));
            this.P = org.telegram.messenger.g0.L(48.0f);
        } else {
            this.O = org.telegram.messenger.g0.L(190.0f);
            this.P = org.telegram.messenger.g0.L(44.0f);
        }
        setMeasuredDimension(this.O, this.P);
        if (i12 == 0) {
            float L2 = org.telegram.messenger.g0.L(25.0f);
            float f10 = this.P / 2.0f;
            this.r.setPathEffect(new CornerPathEffect(org.telegram.messenger.g0.N(1.33f)));
            Path path = this.F;
            path.rewind();
            path.moveTo(L2 - org.telegram.messenger.g0.N(8.66f), f10 - org.telegram.messenger.g0.N(2.9f));
            path.lineTo(L2 - org.telegram.messenger.g0.N(3.0f), f10 - org.telegram.messenger.g0.N(2.9f));
            path.lineTo(L2 - org.telegram.messenger.g0.N(3.0f), org.telegram.messenger.g0.N(2.9f) + f10);
            path.lineTo(L2 - org.telegram.messenger.g0.N(8.66f), org.telegram.messenger.g0.N(2.9f) + f10);
            path.close();
            this.s.setPathEffect(new CornerPathEffect(org.telegram.messenger.g0.N(2.66f)));
            Path path2 = this.G;
            path2.rewind();
            path2.moveTo(L2 - org.telegram.messenger.g0.N(7.5f), f10);
            path2.lineTo(L2, f10 - org.telegram.messenger.g0.N(7.33f));
            path2.lineTo(L2, org.telegram.messenger.g0.N(7.33f) + f10);
            path2.close();
            Path path3 = this.H;
            path3.rewind();
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set((L2 - org.telegram.messenger.g0.N(0.33f)) - org.telegram.messenger.g0.L(4.33f), f10 - org.telegram.messenger.g0.L(4.33f), (L2 - org.telegram.messenger.g0.N(0.33f)) + org.telegram.messenger.g0.L(4.33f), org.telegram.messenger.g0.L(4.33f) + f10);
            path3.arcTo(rectF, -60.0f, 120.0f);
            path3.close();
            Paint.Style style = Paint.Style.STROKE;
            Paint paint = this.x;
            paint.setStyle(style);
            paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
            Path path4 = this.I;
            path4.rewind();
            rectF.set((L2 - org.telegram.messenger.g0.N(0.33f)) - org.telegram.messenger.g0.L(8.0f), f10 - org.telegram.messenger.g0.L(8.0f), (L2 - org.telegram.messenger.g0.N(0.33f)) + org.telegram.messenger.g0.L(8.0f), f10 + org.telegram.messenger.g0.L(8.0f));
            path4.arcTo(rectF, -70.0f, 140.0f);
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.y || drawable == this.D || super.verifyDrawable(drawable);
    }
}
