package gi;

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
import org.telegram.messenger.bd;
import org.telegram.messenger.hs;
import org.telegram.messenger.u10;
import org.telegram.ui.Components.xq;
import org.telegram.ui.b61;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public class z6 extends View {
    public final org.telegram.ui.Components.g6 E;
    public final Path F;
    public final Path G;
    public final Path H;
    public final Path I;
    public final Path J;
    public final org.telegram.ui.Components.u5 K;
    public final org.telegram.ui.Components.u5 L;
    public float M;
    public long N;
    public float O;
    public int P;
    public int Q;
    public final TextPaint R;
    public int S;
    public final int a;
    public float b;
    public float c;
    public float d;
    public boolean e;
    public final org.telegram.ui.Components.u5 f;
    public u10 h;
    public final Paint n;
    public final Paint r;
    public final Paint s;
    public final Paint w;
    public final Paint x;
    public final org.telegram.ui.Components.g6 y;

    public z6(Context context, int i3) {
        super(context);
        this.b = 0.0f;
        this.c = 1.0f;
        xq xqVar = xq.h;
        this.f = new org.telegram.ui.Components.u5(this, 0L, 320L, xqVar);
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
        org.telegram.ui.Components.g6 g6Var = new org.telegram.ui.Components.g6(false, true, true);
        this.y = g6Var;
        this.F = new Path();
        this.G = new Path();
        this.H = new Path();
        this.I = new Path();
        this.J = new Path();
        this.K = new org.telegram.ui.Components.u5(this, 0L, 350L, xqVar);
        this.L = new org.telegram.ui.Components.u5(this, 0L, 350L, xqVar);
        this.R = new TextPaint(1);
        this.a = i3;
        g6Var.x(org.telegram.messenger.g0.o());
        g6Var.n(0.3f, 40L, xqVar);
        g6Var.setCallback(this);
        g6Var.u(-1);
        Point point = org.telegram.messenger.g0.q;
        g6Var.M = point.x;
        if (i3 == 0) {
            g6Var.w(org.telegram.messenger.g0.L(15.0f));
            this.E = null;
            paint2.setColor(-1);
            paint3.setColor(-1);
            paint4.setColor(-1);
            paint5.setColor(-1);
            paint5.setStyle(Paint.Style.STROKE);
            paint5.setStrokeCap(Paint.Cap.ROUND);
        } else {
            g6Var.w(org.telegram.messenger.g0.L(14.0f));
            g6Var.b = 5;
            org.telegram.ui.Components.g6 g6Var2 = new org.telegram.ui.Components.g6(false, true, true);
            this.E = g6Var2;
            g6Var2.M = point.x;
            g6Var2.w(org.telegram.messenger.g0.L(14.0f));
            g6Var2.x(org.telegram.messenger.g0.o());
            g6Var2.n(0.3f, 40L, xqVar);
            g6Var2.setCallback(this);
            g6Var2.u(-1);
            if (i3 == 1) {
                g6Var2.t(bd.M0(2131750692, null), true, true);
            } else if (i3 == 2) {
                g6Var2.t(bd.M0(2131750693, null), true, true);
            } else if (i3 == 3) {
                g6Var2.t(bd.M0(2131742964, null), true, true);
            }
        }
        g6Var.t("", true, true);
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

    public final void c(b61 b61Var) {
        this.h = b61Var;
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
        rectF.set(0.0f, 0.0f, this.P, this.Q);
        Path path = this.F;
        path.rewind();
        float f10 = this.O;
        path.addRoundRect(rectF, f10, f10, Path.Direction.CW);
        canvas.clipPath(path);
        float e10 = this.e ? this.f.e(false, this.d) : this.d;
        canvas.saveLayerAlpha(0.0f, 0.0f, this.P, this.Q, hs.e4, 31);
        int i3 = this.a;
        org.telegram.ui.Components.g6 g6Var = this.y;
        if (i3 == 0) {
            g6Var.setBounds(org.telegram.messenger.g0.L(42.0f), -org.telegram.messenger.g0.L(1.0f), this.P, this.Q - org.telegram.messenger.g0.L(1.0f));
            g6Var.draw(canvas);
        } else {
            int L = org.telegram.messenger.g0.L(12.33f);
            int i10 = -org.telegram.messenger.g0.L(1.0f);
            int c2 = (this.P - ((int) g6Var.c())) - org.telegram.messenger.g0.L(6.0f);
            int L2 = this.Q - org.telegram.messenger.g0.L(1.0f);
            org.telegram.ui.Components.g6 g6Var2 = this.E;
            g6Var2.setBounds(L, i10, c2, L2);
            g6Var2.draw(canvas);
            g6Var.setBounds(this.P - org.telegram.messenger.g0.L(111.0f), -org.telegram.messenger.g0.L(1.0f), this.P - org.telegram.messenger.g0.L(11.0f), this.Q - org.telegram.messenger.g0.L(1.0f));
            g6Var.draw(canvas);
        }
        if (i3 == 0) {
            canvas.drawPath(this.G, this.r);
            canvas.drawPath(this.H, this.s);
            float f11 = this.c;
            float f12 = this.b;
            float f13 = f11 - f12;
            double d = f13 != 0.0f ? (f13 * this.d) + f12 : 0.0f;
            float d10 = this.K.d(d > 0.25d);
            canvas.save();
            canvas.translate((1.0f - d10) * (-org.telegram.messenger.g0.N(0.33f)), 0.0f);
            Paint paint = this.w;
            paint.setAlpha((int) (d10 * 255.0f));
            canvas.drawPath(this.I, paint);
            canvas.restore();
            float d11 = this.L.d(d > 0.5d);
            canvas.save();
            canvas.translate((1.0f - d11) * (-org.telegram.messenger.g0.N(0.66f)), 0.0f);
            Paint paint2 = this.x;
            paint2.setAlpha((int) (d11 * 255.0f));
            canvas.drawPath(this.J, paint2);
            canvas.restore();
        }
        canvas.save();
        canvas.drawRect(0.0f, 0.0f, this.P * e10, this.Q, this.n);
        canvas.restore();
        canvas.restore();
        canvas.restore();
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z10 = false;
        if (this.P <= 0) {
            return false;
        }
        float x10 = motionEvent.getX();
        if (motionEvent.getAction() == 0) {
            this.N = System.currentTimeMillis();
            this.e = false;
        } else if (motionEvent.getAction() == 2 || motionEvent.getAction() == 1) {
            float f10 = this.c;
            float f11 = this.b;
            float y9 = f10 - f11 != 0.0f ? com.google.android.recaptcha.internal.a.y(f10, f11, this.d, f11) : 0.0f;
            if (motionEvent.getAction() != 1 || System.currentTimeMillis() - this.N >= ViewConfiguration.getTapTimeout()) {
                this.d = Utilities.i(((x10 - this.M) / this.P) + this.d, 1.0f, 0.0f);
                this.e = false;
                z10 = true;
            } else {
                this.f.e(true, this.d);
                this.d = x10 / this.P;
                this.e = true;
            }
            float f12 = this.c;
            float f13 = this.b;
            float y10 = f12 - f13 != 0.0f ? com.google.android.recaptcha.internal.a.y(f12, f13, this.d, f13) : 0.0f;
            if (z10) {
                if ((y10 <= f13 && y9 > y10) || (y10 >= f12 && y9 < y10)) {
                    try {
                        performHapticFeedback(3, 1);
                    } catch (Exception unused) {
                    }
                } else if (Math.floor(y9 * 5.0f) != Math.floor(5.0f * y10)) {
                    org.telegram.messenger.g0.c4(this);
                }
            }
            e(y10);
            u10 u10Var = this.h;
            if (u10Var != null) {
                u10Var.a(Float.valueOf(y10));
            }
        }
        this.M = x10;
        return true;
    }

    public final void e(float f10) {
        String str = Math.round(100.0f * f10) + "%";
        org.telegram.ui.Components.g6 g6Var = this.y;
        if (!TextUtils.equals(g6Var.i, str)) {
            g6Var.a();
            g6Var.n(0.3f, this.e ? 320L : 40L, xq.h);
            g6Var.t(str, true, true);
        }
        if (this.a == 1) {
            this.n.setColor(n2.f(f10));
        }
        invalidate();
    }

    @Override // android.view.View
    public final void onMeasure(int i3, int i10) {
        this.O = org.telegram.messenger.g0.L(12.0f);
        float L = org.telegram.messenger.g0.L(16.0f);
        TextPaint textPaint = this.R;
        textPaint.setTextSize(L);
        this.y.w(org.telegram.messenger.g0.L(15.0f));
        int i11 = this.S;
        int i12 = this.a;
        if (i11 > 0) {
            this.P = i11;
            this.Q = org.telegram.messenger.g0.L(48.0f);
        } else if (i12 == 0) {
            this.P = (int) Math.min(textPaint.measureText(bd.M0(2131744730, null)) + org.telegram.messenger.g0.L(88.0f), View.MeasureSpec.getSize(i3));
            this.Q = org.telegram.messenger.g0.L(48.0f);
        } else {
            this.P = org.telegram.messenger.g0.L(190.0f);
            this.Q = org.telegram.messenger.g0.L(44.0f);
        }
        setMeasuredDimension(this.P, this.Q);
        if (i12 == 0) {
            float L2 = org.telegram.messenger.g0.L(25.0f);
            float f10 = this.Q / 2.0f;
            this.r.setPathEffect(new CornerPathEffect(org.telegram.messenger.g0.N(1.33f)));
            Path path = this.G;
            path.rewind();
            path.moveTo(L2 - org.telegram.messenger.g0.N(8.66f), f10 - org.telegram.messenger.g0.N(2.9f));
            path.lineTo(L2 - org.telegram.messenger.g0.N(3.0f), f10 - org.telegram.messenger.g0.N(2.9f));
            path.lineTo(L2 - org.telegram.messenger.g0.N(3.0f), org.telegram.messenger.g0.N(2.9f) + f10);
            path.lineTo(L2 - org.telegram.messenger.g0.N(8.66f), org.telegram.messenger.g0.N(2.9f) + f10);
            path.close();
            this.s.setPathEffect(new CornerPathEffect(org.telegram.messenger.g0.N(2.66f)));
            Path path2 = this.H;
            path2.rewind();
            path2.moveTo(L2 - org.telegram.messenger.g0.N(7.5f), f10);
            path2.lineTo(L2, f10 - org.telegram.messenger.g0.N(7.33f));
            path2.lineTo(L2, org.telegram.messenger.g0.N(7.33f) + f10);
            path2.close();
            Path path3 = this.I;
            path3.rewind();
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set((L2 - org.telegram.messenger.g0.N(0.33f)) - org.telegram.messenger.g0.L(4.33f), f10 - org.telegram.messenger.g0.L(4.33f), (L2 - org.telegram.messenger.g0.N(0.33f)) + org.telegram.messenger.g0.L(4.33f), org.telegram.messenger.g0.L(4.33f) + f10);
            path3.arcTo(rectF, -60.0f, 120.0f);
            path3.close();
            Paint.Style style = Paint.Style.STROKE;
            Paint paint = this.x;
            paint.setStyle(style);
            paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
            Path path4 = this.J;
            path4.rewind();
            rectF.set((L2 - org.telegram.messenger.g0.N(0.33f)) - org.telegram.messenger.g0.L(8.0f), f10 - org.telegram.messenger.g0.L(8.0f), (L2 - org.telegram.messenger.g0.N(0.33f)) + org.telegram.messenger.g0.L(8.0f), f10 + org.telegram.messenger.g0.L(8.0f));
            path4.arcTo(rectF, -70.0f, 140.0f);
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.y || drawable == this.E || super.verifyDrawable(drawable);
    }
}
