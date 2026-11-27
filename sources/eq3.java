// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public final class eq3 extends View {
    public float E;
    public boolean F;
    public final mm G;
    public boolean H;
    public float I;
    public final mm J;
    public final mm K;
    public final RectF L;
    public final RectF M;
    public final RectF N;
    public final RectF O;
    public boolean P;
    public dq3 Q;
    public Runnable R;
    public final Paint a;
    public final TextPaint b;
    public final TextPaint c;
    public final Paint d;
    public final Paint e;
    public final Paint f;
    public final v41 h;
    public b29 n;
    public final StaticLayout r;
    public final float s;
    public final float w;
    public StaticLayout x;
    public float y;

    public eq3(Context context, String str) {
        super(context);
        Paint paint = new Paint(1);
        this.a = paint;
        TextPaint textPaint = new TextPaint(1);
        this.b = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.c = textPaint2;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        Paint paint3 = new Paint(1);
        this.e = paint3;
        Paint paint4 = new Paint(1);
        this.f = paint4;
        this.h = new v41(this);
        this.F = false;
        this.G = new mm(0.0f, this, 0L, 350L, k43.h);
        this.H = true;
        this.I = 0.0f;
        this.J = new mm(this);
        this.K = new mm(this);
        this.L = new RectF();
        this.M = new RectF();
        this.N = new RectF();
        this.O = new RectF();
        paint.setColor(1509949440);
        textPaint.setColor(-1);
        textPaint2.setColor(-1);
        paint2.setColor(-869783512);
        paint3.setColor(-1);
        paint4.setColor(872415231);
        Paint.Style style = Paint.Style.STROKE;
        paint3.setStyle(style);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint3.setStrokeCap(cap);
        paint3.setStrokeWidth(hl.L(4.0f));
        paint4.setStyle(style);
        paint4.setStrokeCap(cap);
        paint4.setStrokeWidth(hl.L(4.0f));
        textPaint.setTextSize(hl.L(14.0f));
        textPaint2.setTextSize(hl.N(14.66f));
        StaticLayout staticLayout = new StaticLayout(str, textPaint, hl.q.x, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.r = staticLayout;
        this.s = staticLayout.getLineCount() > 0 ? staticLayout.getLineWidth(0) : 0.0f;
        this.w = staticLayout.getLineCount() > 0 ? staticLayout.getLineLeft(0) : 0.0f;
        this.F = true;
        invalidate();
    }

    public final void a() {
        dq3 dq3Var = this.Q;
        if (dq3Var != null) {
            hl.r(dq3Var);
            this.Q = null;
        }
        this.F = false;
        invalidate();
    }

    public final void b(int i, int i2, String str) {
        b29 b29Var = this.n;
        if (b29Var != null) {
            b29Var.setCallback(null);
            this.n.x(true);
        }
        b29 b29Var2 = new b29(i, hl.L(36.0f), hl.L(36.0f));
        this.n = b29Var2;
        b29Var2.setCallback(this);
        this.n.start();
        StaticLayout staticLayout = new StaticLayout(str, this.c, hl.q.x, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.x = staticLayout;
        this.y = staticLayout.getLineCount() > 0 ? this.x.getLineWidth(0) : 0.0f;
        this.E = this.x.getLineCount() > 0 ? this.x.getLineLeft(0) : 0.0f;
        this.H = false;
        invalidate();
        dq3 dq3Var = this.Q;
        if (dq3Var != null) {
            hl.r(dq3Var);
        }
        dq3 dq3Var2 = new dq3(this, (byte) 1);
        this.Q = dq3Var2;
        hl.d3(dq3Var2, i2);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f;
        float f2;
        float f3;
        RectF rectF;
        float f4;
        int saveCount = canvas.getSaveCount();
        float e = this.G.e(false, this.F ? 1.0f : 0.0f);
        float e2 = this.J.e(false, this.H ? 0.0f : 1.0f);
        float f5 = 1.0f - e2;
        Paint paint = this.a;
        paint.setAlpha((int) (90.0f * f5 * e));
        Canvas canvas2 = canvas;
        canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
        float max = Math.max(this.s, hl.L(54.0f)) + hl.L(42.0f);
        int L = hl.L(111.0f);
        StaticLayout staticLayout = this.r;
        float height = staticLayout.getHeight() + L;
        float width = (getWidth() - max) / 2.0f;
        float height2 = (getHeight() - height) / 2.0f;
        float width2 = (getWidth() + max) / 2.0f;
        float height3 = (getHeight() + height) / 2.0f;
        RectF rectF2 = this.L;
        rectF2.set(width, height2, width2, height3);
        float L2 = hl.L(74.0f) + this.y;
        float L3 = hl.L(48.0f);
        float width3 = (getWidth() - L2) / 2.0f;
        float height4 = (getHeight() - L3) / 2.0f;
        float width4 = (getWidth() + L2) / 2.0f;
        float height5 = (getHeight() + L3) / 2.0f;
        RectF rectF3 = this.M;
        rectF3.set(width3, height4, width4, height5);
        RectF rectF4 = this.N;
        hl.X1(rectF2, rectF3, e2, rectF4);
        if (e >= 1.0f || !this.H) {
            f = 42.0f;
        } else {
            f = 42.0f;
            RectF rectF5 = this.O;
            rectF5.set(getWidth() / 2.0f, getHeight() / 2.0f, getWidth() / 2.0f, getHeight() / 2.0f);
            hl.X1(rectF5, rectF4, e, rectF4);
        }
        if (e < 1.0f && !this.H) {
            canvas2.scale(hl.R1(0.8f, 1.0f, e), hl.R1(0.8f, 1.0f, e), rectF4.centerX(), rectF4.centerY());
        }
        Paint paint2 = this.d;
        paint2.setAlpha((int) (204.0f * e));
        canvas2.drawRoundRect(rectF4, hl.L(10.0f), hl.L(10.0f), paint2);
        canvas2.save();
        canvas2.clipRect(rectF4);
        if (e2 < 1.0f) {
            float f6 = f5 * e;
            float e3 = this.K.e(false, this.I);
            float centerX = rectF2.centerX();
            float L4 = rectF2.top + hl.L(48.0f);
            float L5 = hl.L(25.0f);
            Paint paint3 = this.f;
            paint3.setAlpha((int) (51.0f * f6));
            canvas2.drawCircle(centerX, L4, L5, paint3);
            RectF rectF6 = hl.P;
            f4 = 255.0f;
            rectF6.set(centerX - L5, L4 - L5, centerX + L5, L5 + L4);
            int i = (int) (f6 * 255.0f);
            Paint paint4 = this.e;
            paint4.setAlpha(i);
            paint4.setStrokeWidth(hl.L(4.0f));
            f2 = e;
            f3 = 2.0f;
            rectF = rectF3;
            canvas.drawArc(rectF6, -90.0f, 360.0f * e3, false, paint4);
            float a = this.h.a(0.15f);
            canvas.save();
            canvas.scale(a, a, centerX, L4);
            paint4.setStrokeWidth(hl.L(3.4f));
            canvas.drawLine(centerX - hl.L(7.0f), L4 - hl.L(7.0f), hl.L(7.0f) + centerX, hl.L(7.0f) + L4, paint4);
            canvas2 = canvas;
            canvas2.drawLine(centerX - hl.L(7.0f), L4 + hl.L(7.0f), centerX + hl.L(7.0f), L4 - hl.L(7.0f), paint4);
            canvas2.restore();
            canvas2.save();
            canvas2.translate((rectF2.left + hl.L(21.0f)) - this.w, (rectF2.bottom - hl.L(18.0f)) - staticLayout.getHeight());
            this.b.setAlpha(i);
            staticLayout.draw(canvas2);
            canvas2.restore();
        } else {
            f2 = e;
            f3 = 2.0f;
            rectF = rectF3;
            f4 = 255.0f;
        }
        if (e2 > 0.0f) {
            float f7 = f2 * e2;
            b29 b29Var = this.n;
            if (b29Var != null) {
                b29Var.setAlpha((int) (f7 * f4));
                this.n.setBounds((int) (rectF.left + hl.L(9.0f)), (int) (rectF.top + hl.L(6.0f)), (int) (rectF.left + hl.L(45.0f)), (int) (rectF.top + hl.L(f)));
                this.n.draw(canvas2);
            }
            if (this.x != null) {
                canvas2.save();
                uh9.n(this.x.getHeight(), f3, rectF.centerY(), (rectF.left + hl.L(52.0f)) - this.E, canvas2);
                this.c.setAlpha((int) (f7 * f4));
                this.x.draw(canvas2);
                canvas2.restore();
            }
        }
        canvas2.restoreToCount(saveCount);
        if (f2 > 0.0f || this.F || this.P) {
            return;
        }
        this.P = true;
        post(new dq3(this, (byte) 0));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean contains = this.N.contains(motionEvent.getX(), motionEvent.getY());
        int action = motionEvent.getAction();
        v41 v41Var = this.h;
        if (action == 0 && (this.H || contains)) {
            v41Var.c(contains);
            return true;
        }
        if (motionEvent.getAction() == 1) {
            if (v41Var.i) {
                if (contains) {
                    if (this.H) {
                        Runnable runnable = this.R;
                        if (runnable != null) {
                            runnable.run();
                        }
                    } else {
                        a();
                    }
                }
                v41Var.c(false);
                return true;
            }
        } else if (motionEvent.getAction() == 3) {
            v41Var.c(false);
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setOnCancelListener(Runnable runnable) {
        this.R = runnable;
    }

    public void setProgress(float f) {
        this.I = f;
        invalidate();
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.n || super.verifyDrawable(drawable);
    }

    public eq3(Context context) {
        this(context, ob6.M0(2131746647, null));
    }
}
