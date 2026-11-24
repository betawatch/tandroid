// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public class n31 extends View {
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

    public n31(Context context, ylb ylbVar) {
        super(context);
        this.r = 1.0f;
        this.x = new RectF();
        TextPaint textPaint = new TextPaint(1);
        this.s = textPaint;
        textPaint.setTextSize(gm.L(12.0f));
        textPaint.setTypeface(gm.n1("fonts/num.otf"));
        Paint paint = new Paint(1);
        this.a = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(gm.L(2.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        setColor(cmb.v0(cmb.xj, ylbVar));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int ceil = this.b > 0 ? (int) Math.ceil(r2 / 1000.0f) : 0;
        float L = gm.L(1.0f);
        float L2 = gm.L(1.0f);
        float measuredWidth = getMeasuredWidth() - gm.L(1.0f);
        float measuredHeight = getMeasuredHeight() - gm.L(1.0f);
        RectF rectF = this.x;
        rectF.set(L, L2, measuredWidth, measuredHeight);
        int i = this.c;
        TextPaint textPaint = this.s;
        if (i != ceil) {
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
        float f = this.r;
        if (f < 1.0f) {
            float f2 = f + 0.10666667f;
            this.r = f2;
            if (f2 > 1.0f) {
                this.r = 1.0f;
            } else {
                invalidate();
            }
        }
        int alpha = textPaint.getAlpha();
        if (this.h != null) {
            float f3 = this.r;
            if (f3 < 1.0f) {
                textPaint.setAlpha((int) ((1.0f - f3) * alpha));
                canvas.save();
                canvas.translate(rectF.centerX() - (this.n / 2.0f), ((gm.L(10.0f) * this.r) + (rectF.centerY() - (this.h.getHeight() / 2.0f))) - gm.L(0.5f));
                this.h.draw(canvas);
                textPaint.setAlpha(alpha);
                canvas.restore();
            }
        }
        if (this.f != null) {
            float f4 = this.r;
            if (f4 != 1.0f) {
                textPaint.setAlpha((int) (alpha * f4));
            }
            canvas.save();
            canvas.translate(rectF.centerX() - (this.e / 2.0f), kt6.B(1.0f, this.r, gm.L(10.0f), rectF.centerY() - (this.f.getHeight() / 2.0f)) - gm.L(0.5f));
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

    public void setColor(int i) {
        this.s.setColor(i);
        this.a.setColor(i);
    }
}
