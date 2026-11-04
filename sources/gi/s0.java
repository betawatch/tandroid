package gi;

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
import org.telegram.messenger.bd;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class s0 extends View {
    public float E;
    public boolean F;
    public final org.telegram.ui.Components.u5 G;
    public boolean H;
    public float I;
    public final org.telegram.ui.Components.u5 J;
    public final org.telegram.ui.Components.u5 K;
    public final RectF L;
    public final RectF M;
    public final RectF N;
    public final RectF O;
    public boolean P;
    public r0 Q;
    public Runnable R;
    public final Paint a;
    public final TextPaint b;
    public final TextPaint c;
    public final Paint d;
    public final Paint e;
    public final Paint f;
    public final gc h;
    public ch0 n;
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
        this.h = new gc(this);
        this.F = false;
        this.G = new org.telegram.ui.Components.u5(0.0f, this, 0L, 350L, xq.h);
        this.H = true;
        this.I = 0.0f;
        this.J = new org.telegram.ui.Components.u5(this);
        this.K = new org.telegram.ui.Components.u5(this);
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
        this.F = true;
        invalidate();
    }

    public final void a() {
        r0 r0Var = this.Q;
        if (r0Var != null) {
            org.telegram.messenger.g0.r(r0Var);
            this.Q = null;
        }
        this.F = false;
        invalidate();
    }

    public final void b(int i3, int i10, CharSequence charSequence) {
        ch0 ch0Var = this.n;
        if (ch0Var != null) {
            ch0Var.setCallback(null);
            this.n.C(true);
        }
        ch0 ch0Var2 = new ch0(i3, org.telegram.messenger.g0.L(36.0f), org.telegram.messenger.g0.L(36.0f));
        this.n = ch0Var2;
        ch0Var2.setCallback(this);
        this.n.start();
        StaticLayout staticLayout = new StaticLayout(charSequence, this.c, org.telegram.messenger.g0.q.x, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.x = staticLayout;
        this.y = staticLayout.getLineCount() > 0 ? this.x.getLineWidth(0) : 0.0f;
        this.E = this.x.getLineCount() > 0 ? this.x.getLineLeft(0) : 0.0f;
        this.H = false;
        invalidate();
        r0 r0Var = this.Q;
        if (r0Var != null) {
            org.telegram.messenger.g0.r(r0Var);
        }
        r0 r0Var2 = new r0(this, 1);
        this.Q = r0Var2;
        org.telegram.messenger.g0.i3(r0Var2, i10);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f10;
        RectF rectF;
        float f11;
        int saveCount = canvas.getSaveCount();
        float e10 = this.G.e(false, this.F ? 1.0f : 0.0f);
        float e11 = this.J.e(false, this.H ? 0.0f : 1.0f);
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
        RectF rectF2 = this.L;
        rectF2.set(width, height2, width2, height3);
        float L2 = org.telegram.messenger.g0.L(74.0f) + this.y;
        float L3 = org.telegram.messenger.g0.L(48.0f);
        float width3 = (getWidth() - L2) / 2.0f;
        float height4 = (getHeight() - L3) / 2.0f;
        float width4 = (getWidth() + L2) / 2.0f;
        float height5 = (getHeight() + L3) / 2.0f;
        RectF rectF3 = this.M;
        rectF3.set(width3, height4, width4, height5);
        RectF rectF4 = this.N;
        org.telegram.messenger.g0.Z1(rectF2, rectF3, e11, rectF4);
        if (e10 >= 1.0f || !this.H) {
            f10 = 42.0f;
        } else {
            f10 = 42.0f;
            RectF rectF5 = this.O;
            rectF5.set(getWidth() / 2.0f, getHeight() / 2.0f, getWidth() / 2.0f, getHeight() / 2.0f);
            org.telegram.messenger.g0.Z1(rectF5, rectF4, e10, rectF4);
        }
        if (e10 < 1.0f && !this.H) {
            canvas2.scale(org.telegram.messenger.g0.T1(0.8f, 1.0f, e10), org.telegram.messenger.g0.T1(0.8f, 1.0f, e10), rectF4.centerX(), rectF4.centerY());
        }
        Paint paint2 = this.d;
        paint2.setAlpha((int) (204.0f * e10));
        canvas2.drawRoundRect(rectF4, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), paint2);
        canvas2.save();
        canvas2.clipRect(rectF4);
        if (e11 < 1.0f) {
            float f13 = f12 * e10;
            float e12 = this.K.e(false, this.I);
            float centerX = rectF2.centerX();
            float L4 = rectF2.top + org.telegram.messenger.g0.L(48.0f);
            float L5 = org.telegram.messenger.g0.L(25.0f);
            Paint paint3 = this.f;
            paint3.setAlpha((int) (51.0f * f13));
            canvas2.drawCircle(centerX, L4, L5, paint3);
            RectF rectF6 = org.telegram.messenger.g0.P;
            f11 = 255.0f;
            rectF6.set(centerX - L5, L4 - L5, centerX + L5, L5 + L4);
            int i3 = (int) (f13 * 255.0f);
            Paint paint4 = this.e;
            paint4.setAlpha(i3);
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
            this.b.setAlpha(i3);
            staticLayout.draw(canvas2);
            canvas2.restore();
        } else {
            rectF = rectF3;
            f11 = 255.0f;
        }
        if (e11 > 0.0f) {
            float f14 = e11 * e10;
            ch0 ch0Var = this.n;
            if (ch0Var != null) {
                ch0Var.setAlpha((int) (f14 * f11));
                this.n.setBounds((int) (rectF.left + org.telegram.messenger.g0.L(9.0f)), (int) (rectF.top + org.telegram.messenger.g0.L(6.0f)), (int) (rectF.left + org.telegram.messenger.g0.L(45.0f)), (int) (rectF.top + org.telegram.messenger.g0.L(f10)));
                this.n.draw(canvas2);
            }
            if (this.x != null) {
                canvas2.save();
                canvas2.translate((rectF.left + org.telegram.messenger.g0.L(52.0f)) - this.E, rectF.centerY() - (this.x.getHeight() / 2.0f));
                this.c.setAlpha((int) (f14 * f11));
                this.x.draw(canvas2);
                canvas2.restore();
            }
        }
        canvas2.restoreToCount(saveCount);
        if (e10 > 0.0f || this.F || this.P) {
            return;
        }
        this.P = true;
        post(new r0(this, 0));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean contains = this.N.contains(motionEvent.getX(), motionEvent.getY());
        int action = motionEvent.getAction();
        gc gcVar = this.h;
        if (action == 0 && (this.H || contains)) {
            gcVar.c(contains);
            return true;
        }
        if (motionEvent.getAction() == 1) {
            if (gcVar.i) {
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
                gcVar.c(false);
                return true;
            }
        } else if (motionEvent.getAction() == 3) {
            gcVar.c(false);
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setOnCancelListener(Runnable runnable) {
        this.R = runnable;
    }

    public void setProgress(float f10) {
        this.I = f10;
        invalidate();
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.n || super.verifyDrawable(drawable);
    }

    public s0(Context context) {
        this(context, bd.M0(2131746926, null));
    }
}
