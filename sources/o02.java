// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextPaint;
import android.view.View;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class o02 extends View {
    public final /* synthetic */ byte a;
    public final /* synthetic */ n12 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o02(n12 n12Var, Context context, byte b) {
        super(context);
        this.a = b;
        this.b = n12Var;
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
                n12 n12Var = this.b;
                String format = String.format("%d", Integer.valueOf(Math.max(1, n12Var.v2.getSelectedItemsCount())));
                TextPaint textPaint = n12Var.G2;
                int max = Math.max(hl.L(16.0f) + ((int) Math.ceil(textPaint.measureText(format))), hl.L(24.0f));
                int measuredWidth = getMeasuredWidth() / 2;
                textPaint.setColor(vm2.o(aob.v0(aob.C5, n12Var.J0), (int) (((n12Var.S2 * 0.42d) + 0.58d) * Color.alpha(r6))));
                Paint paint = n12Var.I2;
                paint.setColor(aob.v0(aob.h5, n12Var.J0));
                RectF rectF = n12Var.H2;
                int i = max / 2;
                rectF.set(measuredWidth - i, 0.0f, i + measuredWidth, getMeasuredHeight());
                canvas.drawRoundRect(rectF, hl.L(12.0f), hl.L(12.0f), paint);
                paint.setColor(aob.v0(aob.W9, n12Var.J0));
                rectF.set(hl.L(2.0f) + r8, hl.L(2.0f), r4 - hl.L(2.0f), getMeasuredHeight() - hl.L(2.0f));
                canvas.drawRoundRect(rectF, hl.L(10.0f), hl.L(10.0f), paint);
                canvas.drawText(format, measuredWidth - (r3 / 2), hl.L(16.2f), textPaint);
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
                this.b.V1.setBounds(0, (i2 - hl.n) - hl.L(48.0f), i, i2);
                break;
            default:
                super.onSizeChanged(i, i2, i3, i4);
                break;
        }
    }
}
