package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class zb extends View {
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
    public long v;
    public final RectF w;

    public zb(Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        this.r = 1.0f;
        this.w = new RectF();
        TextPaint textPaint = new TextPaint(1);
        this.s = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint.setTypeface(AndroidUtilities.getTypeface("fonts/num.otf"));
        Paint paint = new Paint(1);
        this.a = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        setColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Hi, b6Var));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int ceil = this.b > 0 ? (int) Math.ceil(r2 / 1000.0f) : 0;
        float dp = AndroidUtilities.dp(1.0f);
        float dp2 = AndroidUtilities.dp(1.0f);
        float measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(1.0f);
        float measuredHeight = getMeasuredHeight() - AndroidUtilities.dp(1.0f);
        RectF rectF = this.w;
        rectF.set(dp, dp2, measuredWidth, measuredHeight);
        int i9 = this.c;
        TextPaint textPaint = this.s;
        if (i9 != ceil) {
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
        float f10 = this.r;
        if (f10 < 1.0f) {
            float f11 = f10 + 0.10666667f;
            this.r = f11;
            if (f11 > 1.0f) {
                this.r = 1.0f;
            } else {
                invalidate();
            }
        }
        int alpha = textPaint.getAlpha();
        if (this.h != null) {
            float f12 = this.r;
            if (f12 < 1.0f) {
                textPaint.setAlpha((int) ((1.0f - f12) * alpha));
                canvas.save();
                canvas.translate(rectF.centerX() - (this.n / 2.0f), ((AndroidUtilities.dp(10.0f) * this.r) + (rectF.centerY() - (this.h.getHeight() / 2.0f))) - AndroidUtilities.dp(0.5f));
                this.h.draw(canvas);
                textPaint.setAlpha(alpha);
                canvas.restore();
            }
        }
        if (this.f != null) {
            float f13 = this.r;
            if (f13 != 1.0f) {
                textPaint.setAlpha((int) (alpha * f13));
            }
            canvas.save();
            canvas.translate(rectF.centerX() - (this.e / 2.0f), j3.r0.C(1.0f, this.r, AndroidUtilities.dp(10.0f), rectF.centerY() - (this.f.getHeight() / 2.0f)) - AndroidUtilities.dp(0.5f));
            this.f.draw(canvas);
            if (this.r != 1.0f) {
                textPaint.setAlpha(alpha);
            }
            canvas.restore();
        }
        canvas.drawArc(rectF, -90.0f, (Math.max(0L, this.b) / 5000.0f) * (-360.0f), false, this.a);
        if (this.v != 0) {
            long currentTimeMillis = System.currentTimeMillis();
            this.b -= currentTimeMillis - this.v;
            this.v = currentTimeMillis;
        } else {
            this.v = System.currentTimeMillis();
        }
        invalidate();
    }

    public void setColor(int i9) {
        this.s.setColor(i9);
        this.a.setColor(i9);
    }
}
