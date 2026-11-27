// default package

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class lkc extends View {
    public final Paint a;
    public final ic0 b;
    public pkb c;

    public lkc(Activity activity) {
        super(activity);
        Paint paint = new Paint(1);
        this.a = paint;
        paint.setColor(-14538189);
        ic0 ic0Var = new ic0(this, false);
        this.b = ic0Var;
        ic0Var.p = hl.L(100.0f);
        ic0Var.o = hl.L(30.0f);
        ic0Var.x = false;
        ic0Var.s = hl.L(24.0f);
        ic0Var.h(hl.L(18.0f));
        ic0Var.t = 0.58f;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.c == null) {
            return;
        }
        float L = hl.L(4.0f);
        ic0 ic0Var = this.b;
        float c = ic0Var.c() + L + hl.L(7.0f) + this.c.c + hl.L(13.0f);
        float L2 = hl.L(30.0f);
        RectF rectF = hl.P;
        rectF.set((getWidth() - c) / 2.0f, 0.0f, (getWidth() + c) / 2.0f, getHeight());
        float f = L2 / 2.0f;
        canvas.drawRoundRect(rectF, f, f, this.a);
        canvas.save();
        canvas.translate(rectF.left + hl.L(4.0f), 0.0f);
        ic0Var.g(canvas);
        canvas.translate(ic0Var.A + hl.L(7.0f), 0.0f);
        this.c.c(0.0f, f, 1.0f, -1, canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(View.MeasureSpec.getSize(i), hl.L(30.0f));
    }
}
