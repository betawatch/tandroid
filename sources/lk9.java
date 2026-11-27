// default package

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class lk9 extends dk9 {
    public final Paint X;

    public lk9(hl9 hl9Var, Rect rect, int i) {
        super(hl9Var, rect, i);
        this.X = new Paint(1);
    }

    @Override // dk9
    public final int H() {
        Rect rect = this.b;
        return hl.L(12.0f) + rect.top + rect.bottom;
    }

    @Override // dk9
    public final int J() {
        return hl.L(32.0f);
    }

    @Override // dk9
    public final void V(Canvas canvas) {
        hl9 hl9Var = this.a;
        int i = hl9Var.C;
        int i2 = hl9Var.S;
        int i3 = i + i2 + hl9Var.T;
        Rect rect = this.b;
        int i4 = rect.left;
        int i5 = ((i3 - i4) - rect.right) / 2;
        float f = (((r1 - i5) / 2.0f) - i2) + i4;
        float L = (hl.L(12.0f) - hl.L(1.0f)) / 2.0f;
        int v0 = aob.v0(hl9Var.D() ? aob.nl : aob.ml, hl9Var.D);
        Paint paint = this.X;
        paint.setColor(v0);
        RectF rectF = hl.P;
        rectF.set(f, L, i5 + f, hl.L(1.0f) + L);
        canvas.drawRoundRect(rectF, hl.L(0.5f), hl.L(0.5f), paint);
    }
}
