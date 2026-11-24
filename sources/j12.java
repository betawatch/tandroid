// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextPaint;
import android.view.View;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class j12 extends View {
    public final /* synthetic */ byte a;
    public final /* synthetic */ i22 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j12(i22 i22Var, Context context, byte b) {
        super(context);
        this.a = b;
        this.b = i22Var;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        switch (this.a) {
            case 0:
                super.draw(canvas);
                this.b.V1.draw(canvas);
                break;
            default:
                super.draw(canvas);
                break;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        switch (this.a) {
            case 1:
                i22 i22Var = this.b;
                String format = String.format("%d", Integer.valueOf(Math.max(1, i22Var.v2.getSelectedItemsCount())));
                TextPaint textPaint = i22Var.G2;
                int max = Math.max(gm.L(16.0f) + ((int) Math.ceil(textPaint.measureText(format))), gm.L(24.0f));
                int measuredWidth = getMeasuredWidth() / 2;
                textPaint.setColor(on2.p(cmb.v0(cmb.B5, i22Var.J0), (int) (((i22Var.S2 * 0.42d) + 0.58d) * Color.alpha(r6))));
                Paint paint = i22Var.I2;
                paint.setColor(cmb.v0(cmb.g5, i22Var.J0));
                RectF rectF = i22Var.H2;
                int i = max / 2;
                rectF.set(measuredWidth - i, 0.0f, i + measuredWidth, getMeasuredHeight());
                canvas.drawRoundRect(rectF, gm.L(12.0f), gm.L(12.0f), paint);
                paint.setColor(cmb.v0(cmb.V9, i22Var.J0));
                rectF.set(gm.L(2.0f) + r8, gm.L(2.0f), r4 - gm.L(2.0f), getMeasuredHeight() - gm.L(2.0f));
                canvas.drawRoundRect(rectF, gm.L(10.0f), gm.L(10.0f), paint);
                canvas.drawText(format, measuredWidth - (r3 / 2), gm.L(16.2f), textPaint);
                break;
            default:
                super.onDraw(canvas);
                break;
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        switch (this.a) {
            case 0:
                super.onSizeChanged(i, i2, i3, i4);
                this.b.V1.setBounds(0, (i2 - gm.n) - gm.L(48.0f), i, i2);
                break;
            default:
                super.onSizeChanged(i, i2, i3, i4);
                break;
        }
    }
}
