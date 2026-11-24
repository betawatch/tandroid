// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class ix2 extends Drawable {
    public final /* synthetic */ byte a = 0;
    public final TextPaint b;
    public String c;
    public final RectF d;
    public float e;
    public final Paint f;
    public final Object g;

    public ix2(on9 on9Var) {
        this.g = on9Var;
        TextPaint textPaint = new TextPaint(1);
        this.b = textPaint;
        this.f = new Paint(1);
        String M0 = k96.M0(2131743232, null);
        this.c = M0;
        this.d = new RectF();
        textPaint.setTextSize(gl.L(11.0f));
        textPaint.setTypeface(gl.o());
        textPaint.setColor(-1);
        this.e = textPaint.measureText(M0);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        byte b = this.a;
        TextPaint textPaint = this.b;
        Object obj = this.g;
        Paint paint = this.f;
        RectF rectF = this.d;
        switch (b) {
            case 0:
                Rect bounds = getBounds();
                rectF.set(bounds.left, bounds.top, bounds.right, bounds.bottom);
                canvas.drawRoundRect(rectF, gl.L(12.0f), gl.L(12.0f), (TextPaint) paint);
                Drawable drawable = (Drawable) obj;
                drawable.setBounds(gl.L(2.0f) + bounds.left, gl.L(1.0f) + bounds.top, drawable.getIntrinsicWidth() + gl.L(2.0f) + bounds.left, drawable.getIntrinsicHeight() + gl.L(1.0f) + getBounds().top);
                drawable.draw(canvas);
                String str = this.c;
                if (str != null) {
                    canvas.drawText(str, gl.L(16.5f) + bounds.left, gl.L(13.0f) + bounds.top, textPaint);
                    break;
                }
                break;
            default:
                Rect bounds2 = getBounds();
                float L = gl.L(6.0f) + bounds2.left;
                float f = bounds2.top;
                int L2 = gl.L(6.0f) + bounds2.left;
                float f2 = this.e;
                rectF.set(L, f, de9.w(16.0f, (int) Math.ceil(f2), L2), bounds2.bottom);
                on9 on9Var = (on9) obj;
                paint.setColor(bm2.f(on9Var.x0, -12761513, -1163700));
                canvas.drawRoundRect(rectF, gl.L(9.0f), gl.L(9.0f), paint);
                Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
                canvas.drawText(this.c, rectF.centerX() - (f2 / 2.0f), rectF.centerY() - ((fontMetrics.ascent + fontMetrics.descent) / 2.0f), textPaint);
                if (on9Var.w0) {
                    paint.setColor(-1163700);
                    canvas.drawCircle(rectF.right + gl.L(10.0f), rectF.centerY(), gl.L(4.0f), paint);
                    break;
                }
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        switch (this.a) {
        }
        return gl.L(18.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        switch (this.a) {
            case 0:
                return (int) (gl.L(23.0f) + this.e);
            default:
                return de9.w(16.0f, (int) Math.ceil(this.e), gl.L(6.0f)) + (((on9) this.g).w0 ? gl.L(14.0f) : 0);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        switch (this.a) {
            case 0:
                return -1;
            default:
                return -3;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        byte b = this.a;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        byte b = this.a;
    }

    private final void a(int i) {
    }

    private final void b(int i) {
    }

    private final void c(ColorFilter colorFilter) {
    }

    private final void d(ColorFilter colorFilter) {
    }

    public ix2(Context context) {
        TextPaint textPaint = new TextPaint(1);
        this.b = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.f = textPaint2;
        this.d = new RectF();
        textPaint.setColor(-1);
        textPaint.setTypeface(gl.o());
        textPaint.setTextSize(gl.L(12.0f));
        textPaint2.setColor(-6915073);
        this.g = context.getDrawable(R.drawable.mini_boost_badge);
    }
}
