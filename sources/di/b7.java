package di;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextPaint;
import android.util.TypedValue;
import android.view.View;
import org.telegram.ui.Components.zg0;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class b7 extends View {
    public final String a;
    public final String b;
    public final zg0 c;
    public final Paint d;
    public final TextPaint e;
    public final TextPaint f;
    public final RectF h;
    public float n;
    public final Rect r;

    public b7(Context context, int i7, String str, String str2) {
        super(context);
        this.r = new Rect();
        this.a = str;
        this.b = str2;
        zg0 zg0Var = new zg0(i7, org.telegram.messenger.g0.L(36.0f), org.telegram.messenger.g0.L(36.0f), true, null);
        this.c = zg0Var;
        zg0Var.K(1);
        zg0Var.R(this);
        Paint paint = new Paint(1);
        this.d = paint;
        paint.setColor(383310040);
        TextPaint textPaint = new TextPaint(1);
        this.e = textPaint;
        textPaint.setColor(-1);
        textPaint.setTextSize(TypedValue.applyDimension(1, 16.0f, getResources().getDisplayMetrics()));
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        TextPaint textPaint2 = new TextPaint(1);
        this.f = textPaint2;
        textPaint2.setColor(-1761607681);
        textPaint2.setTextSize(TypedValue.applyDimension(1, 14.0f, getResources().getDisplayMetrics()));
        this.h = new RectF();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int L = org.telegram.messenger.g0.L(40.0f);
        int measuredHeight = getMeasuredHeight() / 2;
        int L2 = (int) ((org.telegram.messenger.g0.L(8.0f) * this.n) + org.telegram.messenger.g0.L(36.0f));
        int i7 = L2 / 2;
        int i10 = L - i7;
        int i11 = measuredHeight - i7;
        zg0 zg0Var = this.c;
        zg0Var.setBounds(i10, i11, i10 + L2, L2 + i11);
        zg0Var.draw(canvas);
        if (this.n > 0.0f) {
            float N = (1.0f - this.n) * org.telegram.messenger.g0.N(4.0f);
            float f10 = N * 2.0f;
            float measuredWidth = getMeasuredWidth() - f10;
            float measuredHeight2 = getMeasuredHeight() - f10;
            RectF rectF = this.h;
            rectF.set(N, N, measuredWidth, measuredHeight2);
            int i12 = (int) (this.n * 30.0f);
            Paint paint = this.d;
            paint.setAlpha(i12);
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.N(12.0f), org.telegram.messenger.g0.N(12.0f), paint);
            canvas.save();
            float f11 = this.n;
            canvas.scale((f11 * 0.05f) + 1.0f, (f11 * 0.05f) + 1.0f, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
        }
        canvas.drawText(this.a, org.telegram.messenger.g0.N(80.0f), (getMeasuredHeight() / 2.0f) - org.telegram.messenger.g0.N(4.0f), this.e);
        canvas.drawText(this.b, org.telegram.messenger.g0.N(80.0f), org.telegram.messenger.g0.N(18.0f) + (getMeasuredHeight() / 2.0f), this.f);
        if (this.n > 0.0f) {
            canvas.restore();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        int L = org.telegram.messenger.g0.L(40.0f);
        int measuredHeight = getMeasuredHeight() / 2;
        int L2 = org.telegram.messenger.g0.L(36.0f);
        int i11 = L2 / 2;
        int i12 = L - i11;
        int i13 = measuredHeight - i11;
        this.c.setBounds(i12, i13, i12 + L2, L2 + i13);
    }
}
