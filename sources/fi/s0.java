package fi;

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
import org.telegram.messenger.hd;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Components.zg0;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class s0 extends View {
    public float D;
    public boolean E;
    public final org.telegram.ui.Components.w5 F;
    public boolean G;
    public float H;
    public final org.telegram.ui.Components.w5 I;
    public final org.telegram.ui.Components.w5 J;
    public final RectF K;
    public final RectF L;
    public final RectF M;
    public final RectF N;
    public boolean O;
    public r0 P;
    public Runnable Q;
    public final Paint a;
    public final TextPaint b;
    public final TextPaint c;
    public final Paint d;
    public final Paint e;
    public final Paint f;
    public final ic h;
    public zg0 n;
    public final StaticLayout r;
    public final float s;
    public final float w;
    public StaticLayout x;
    public float y;

    public s0(Context context, String str) {
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
        this.h = new ic(this);
        this.E = false;
        this.F = new org.telegram.ui.Components.w5(0.0f, this, 0L, 350L, xq.h);
        this.G = true;
        this.H = 0.0f;
        this.I = new org.telegram.ui.Components.w5(this);
        this.J = new org.telegram.ui.Components.w5(this);
        this.K = new RectF();
        this.L = new RectF();
        this.M = new RectF();
        this.N = new RectF();
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
        paint3.setStrokeWidth(org.telegram.messenger.g0.L(4.0f));
        paint4.setStyle(style);
        paint4.setStrokeCap(cap);
        paint4.setStrokeWidth(org.telegram.messenger.g0.L(4.0f));
        textPaint.setTextSize(org.telegram.messenger.g0.L(14.0f));
        textPaint2.setTextSize(org.telegram.messenger.g0.N(14.66f));
        StaticLayout staticLayout = new StaticLayout(str, textPaint, org.telegram.messenger.g0.q.x, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.r = staticLayout;
        this.s = staticLayout.getLineCount() > 0 ? staticLayout.getLineWidth(0) : 0.0f;
        this.w = staticLayout.getLineCount() > 0 ? staticLayout.getLineLeft(0) : 0.0f;
        this.E = true;
        invalidate();
    }

    public final void a() {
        r0 r0Var = this.P;
        if (r0Var != null) {
            org.telegram.messenger.g0.r(r0Var);
            this.P = null;
        }
        this.E = false;
        invalidate();
    }

    public final void b(int i7, int i10, CharSequence charSequence) {
        zg0 zg0Var = this.n;
        if (zg0Var != null) {
            zg0Var.setCallback(null);
            this.n.C(true);
        }
        zg0 zg0Var2 = new zg0(i7, org.telegram.messenger.g0.L(36.0f), org.telegram.messenger.g0.L(36.0f));
        this.n = zg0Var2;
        zg0Var2.setCallback(this);
        this.n.start();
        StaticLayout staticLayout = new StaticLayout(charSequence, this.c, org.telegram.messenger.g0.q.x, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.x = staticLayout;
        this.y = staticLayout.getLineCount() > 0 ? this.x.getLineWidth(0) : 0.0f;
        this.D = this.x.getLineCount() > 0 ? this.x.getLineLeft(0) : 0.0f;
        this.G = false;
        invalidate();
        r0 r0Var = this.P;
        if (r0Var != null) {
            org.telegram.messenger.g0.r(r0Var);
        }
        r0 r0Var2 = new r0(this, 1);
        this.P = r0Var2;
        org.telegram.messenger.g0.i3(r0Var2, i10);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f10;
        RectF rectF;
        float f11;
        int saveCount = canvas.getSaveCount();
        float e10 = this.F.e(false, this.E ? 1.0f : 0.0f);
        float e11 = this.I.e(false, this.G ? 0.0f : 1.0f);
        float f12 = 1.0f - e11;
        Paint paint = this.a;
        paint.setAlpha((int) (90.0f * f12 * e10));
        Canvas canvas2 = canvas;
        canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
        float max = Math.max(this.s, org.telegram.messenger.g0.L(54.0f)) + org.telegram.messenger.g0.L(42.0f);
        int L = org.telegram.messenger.g0.L(111.0f);
        StaticLayout staticLayout = this.r;
        float height = staticLayout.getHeight() + L;
        float width = (getWidth() - max) / 2.0f;
        float height2 = (getHeight() - height) / 2.0f;
        float width2 = (getWidth() + max) / 2.0f;
        float height3 = (getHeight() + height) / 2.0f;
        RectF rectF2 = this.K;
        rectF2.set(width, height2, width2, height3);
        float L2 = org.telegram.messenger.g0.L(74.0f) + this.y;
        float L3 = org.telegram.messenger.g0.L(48.0f);
        float width3 = (getWidth() - L2) / 2.0f;
        float height4 = (getHeight() - L3) / 2.0f;
        float width4 = (getWidth() + L2) / 2.0f;
        float height5 = (getHeight() + L3) / 2.0f;
        RectF rectF3 = this.L;
        rectF3.set(width3, height4, width4, height5);
        RectF rectF4 = this.M;
        org.telegram.messenger.g0.Z1(rectF2, rectF3, e11, rectF4);
        if (e10 >= 1.0f || !this.G) {
            f10 = 42.0f;
        } else {
            f10 = 42.0f;
            RectF rectF5 = this.N;
            rectF5.set(getWidth() / 2.0f, getHeight() / 2.0f, getWidth() / 2.0f, getHeight() / 2.0f);
            org.telegram.messenger.g0.Z1(rectF5, rectF4, e10, rectF4);
        }
        if (e10 < 1.0f && !this.G) {
            canvas2.scale(org.telegram.messenger.g0.T1(0.8f, 1.0f, e10), org.telegram.messenger.g0.T1(0.8f, 1.0f, e10), rectF4.centerX(), rectF4.centerY());
        }
        Paint paint2 = this.d;
        paint2.setAlpha((int) (204.0f * e10));
        canvas2.drawRoundRect(rectF4, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), paint2);
        canvas2.save();
        canvas2.clipRect(rectF4);
        if (e11 < 1.0f) {
            float f13 = f12 * e10;
            float e12 = this.J.e(false, this.H);
            float centerX = rectF2.centerX();
            float L4 = rectF2.top + org.telegram.messenger.g0.L(48.0f);
            float L5 = org.telegram.messenger.g0.L(25.0f);
            Paint paint3 = this.f;
            paint3.setAlpha((int) (51.0f * f13));
            canvas2.drawCircle(centerX, L4, L5, paint3);
            RectF rectF6 = org.telegram.messenger.g0.P;
            f11 = 255.0f;
            rectF6.set(centerX - L5, L4 - L5, centerX + L5, L5 + L4);
            int i7 = (int) (f13 * 255.0f);
            Paint paint4 = this.e;
            paint4.setAlpha(i7);
            paint4.setStrokeWidth(org.telegram.messenger.g0.L(4.0f));
            rectF = rectF3;
            canvas.drawArc(rectF6, -90.0f, 360.0f * e12, false, paint4);
            float a10 = this.h.a(0.15f);
            canvas.save();
            canvas.scale(a10, a10, centerX, L4);
            paint4.setStrokeWidth(org.telegram.messenger.g0.L(3.4f));
            canvas.drawLine(centerX - org.telegram.messenger.g0.L(7.0f), L4 - org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(7.0f) + centerX, org.telegram.messenger.g0.L(7.0f) + L4, paint4);
            canvas2 = canvas;
            canvas2.drawLine(centerX - org.telegram.messenger.g0.L(7.0f), L4 + org.telegram.messenger.g0.L(7.0f), centerX + org.telegram.messenger.g0.L(7.0f), L4 - org.telegram.messenger.g0.L(7.0f), paint4);
            canvas2.restore();
            canvas2.save();
            canvas2.translate((rectF2.left + org.telegram.messenger.g0.L(21.0f)) - this.w, (rectF2.bottom - org.telegram.messenger.g0.L(18.0f)) - staticLayout.getHeight());
            this.b.setAlpha(i7);
            staticLayout.draw(canvas2);
            canvas2.restore();
        } else {
            rectF = rectF3;
            f11 = 255.0f;
        }
        if (e11 > 0.0f) {
            float f14 = e11 * e10;
            zg0 zg0Var = this.n;
            if (zg0Var != null) {
                zg0Var.setAlpha((int) (f14 * f11));
                this.n.setBounds((int) (rectF.left + org.telegram.messenger.g0.L(9.0f)), (int) (rectF.top + org.telegram.messenger.g0.L(6.0f)), (int) (rectF.left + org.telegram.messenger.g0.L(45.0f)), (int) (rectF.top + org.telegram.messenger.g0.L(f10)));
                this.n.draw(canvas2);
            }
            if (this.x != null) {
                canvas2.save();
                canvas2.translate((rectF.left + org.telegram.messenger.g0.L(52.0f)) - this.D, rectF.centerY() - (this.x.getHeight() / 2.0f));
                this.c.setAlpha((int) (f14 * f11));
                this.x.draw(canvas2);
                canvas2.restore();
            }
        }
        canvas2.restoreToCount(saveCount);
        if (e10 > 0.0f || this.E || this.O) {
            return;
        }
        this.O = true;
        post(new r0(this, 0));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean contains = this.M.contains(motionEvent.getX(), motionEvent.getY());
        int action = motionEvent.getAction();
        ic icVar = this.h;
        if (action == 0 && (this.G || contains)) {
            icVar.c(contains);
            return true;
        }
        if (motionEvent.getAction() == 1) {
            if (icVar.i) {
                if (contains) {
                    if (this.G) {
                        Runnable runnable = this.Q;
                        if (runnable != null) {
                            runnable.run();
                        }
                    } else {
                        a();
                    }
                }
                icVar.c(false);
                return true;
            }
        } else if (motionEvent.getAction() == 3) {
            icVar.c(false);
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setOnCancelListener(Runnable runnable) {
        this.Q = runnable;
    }

    public void setProgress(float f10) {
        this.H = f10;
        invalidate();
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.n || super.verifyDrawable(drawable);
    }

    public s0(Context context) {
        this(context, hd.M0(2131746917, null));
    }
}
