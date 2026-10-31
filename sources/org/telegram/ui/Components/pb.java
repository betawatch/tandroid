package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public class pb extends View {
    public final Paint a;
    public long b;
    public int c;
    public String d;
    public int e;
    public StaticLayout f;
    public StaticLayout h;
    public int n;
    public float r;
    public final TextPaint s;
    public long w;
    public final RectF x;

    public pb(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.r = 1.0f;
        this.x = new RectF();
        TextPaint textPaint = new TextPaint(1);
        this.s = textPaint;
        textPaint.setTextSize(org.telegram.messenger.i0.L(12.0f));
        textPaint.setTypeface(org.telegram.messenger.i0.o1("fonts/num.otf"));
        Paint paint = new Paint(1);
        this.a = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.i0.L(2.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.vj, p6Var));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int ceil = this.b > 0 ? (int) Math.ceil(r2 / 1000.0f) : 0;
        float L = org.telegram.messenger.i0.L(1.0f);
        float L2 = org.telegram.messenger.i0.L(1.0f);
        float measuredWidth = getMeasuredWidth() - org.telegram.messenger.i0.L(1.0f);
        float measuredHeight = getMeasuredHeight() - org.telegram.messenger.i0.L(1.0f);
        RectF rectF = this.x;
        rectF.set(L, L2, measuredWidth, measuredHeight);
        int i10 = this.c;
        TextPaint textPaint = this.s;
        if (i10 != ceil) {
            this.c = ceil;
            this.d = String.valueOf(Math.max(0, ceil));
            StaticLayout staticLayout = this.f;
            if (staticLayout != null) {
                this.h = staticLayout;
                this.r = 0.0f;
                this.n = this.e;
            }
            this.e = (int) Math.ceil(textPaint.measureText(r2));
            this.f = new StaticLayout(this.d, textPaint, ConnectionsManager.DEFAULT_DATACENTER_ID, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        }
        float f7 = this.r;
        if (f7 < 1.0f) {
            float f10 = f7 + 0.10666667f;
            this.r = f10;
            if (f10 > 1.0f) {
                this.r = 1.0f;
            } else {
                invalidate();
            }
        }
        int alpha = textPaint.getAlpha();
        if (this.h != null) {
            float f11 = this.r;
            if (f11 < 1.0f) {
                textPaint.setAlpha((int) ((1.0f - f11) * alpha));
                canvas.save();
                canvas.translate(rectF.centerX() - (this.n / 2.0f), ((org.telegram.messenger.i0.L(10.0f) * this.r) + (rectF.centerY() - (this.h.getHeight() / 2.0f))) - org.telegram.messenger.i0.L(0.5f));
                this.h.draw(canvas);
                textPaint.setAlpha(alpha);
                canvas.restore();
            }
        }
        if (this.f != null) {
            float f12 = this.r;
            if (f12 != 1.0f) {
                textPaint.setAlpha((int) (alpha * f12));
            }
            canvas.save();
            canvas.translate(rectF.centerX() - (this.e / 2.0f), sc.e.z(1.0f, this.r, org.telegram.messenger.i0.L(10.0f), rectF.centerY() - (this.f.getHeight() / 2.0f)) - org.telegram.messenger.i0.L(0.5f));
            this.f.draw(canvas);
            if (this.r != 1.0f) {
                textPaint.setAlpha(alpha);
            }
            canvas.restore();
        }
        canvas.drawArc(rectF, -90.0f, (Math.max(0L, this.b) / 5000.0f) * (-360.0f), false, this.a);
        if (this.w != 0) {
            long currentTimeMillis = System.currentTimeMillis();
            this.b -= currentTimeMillis - this.w;
            this.w = currentTimeMillis;
        } else {
            this.w = System.currentTimeMillis();
        }
        invalidate();
    }

    public void setColor(int i10) {
        this.s.setColor(i10);
        this.a.setColor(i10);
    }
}
