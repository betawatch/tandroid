// default package

import android.content.Context;
import android.graphics.Canvas;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class mk8 extends in {
    public final /* synthetic */ byte s;
    public final /* synthetic */ ok8 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mk8(ok8 ok8Var, Context context, byte b) {
        super(context, true, true, true);
        this.s = b;
        this.w = ok8Var;
    }

    @Override // in, android.view.View
    public final void onDraw(Canvas canvas) {
        byte b = this.s;
        ok8 ok8Var = this.w;
        switch (b) {
            case 0:
                if (ok8Var.P > 0.0f) {
                    if (ok8Var.O == null) {
                        ok8Var.O = new di2(ok8Var.f.getTextColor());
                    }
                    int L = (int) ((1.0f - ok8Var.P) * hl.L(24.0f));
                    ok8Var.O.setBounds(0, L, getWidth(), getHeight() + L);
                    ok8Var.O.setAlpha((int) (ok8Var.P * 255.0f));
                    ok8Var.O.draw(canvas);
                    invalidate();
                }
                float f = ok8Var.P;
                if (f < 1.0f) {
                    if (f == 0.0f) {
                        super.onDraw(canvas);
                        break;
                    } else {
                        canvas.save();
                        canvas.translate(0.0f, (int) (ok8Var.P * hl.L(-24.0f)));
                        canvas.scale(1.0f, 1.0f - (ok8Var.P * 0.4f));
                        super.onDraw(canvas);
                        canvas.restore();
                        break;
                    }
                }
                break;
            default:
                if (ok8Var.P > 0.0f) {
                    if (ok8Var.O == null) {
                        ok8Var.O = new di2(ok8Var.f.getTextColor());
                    }
                    int L2 = (int) ((1.0f - ok8Var.P) * hl.L(24.0f));
                    ok8Var.O.setBounds(0, L2, getWidth(), getHeight() + L2);
                    ok8Var.O.setAlpha((int) (ok8Var.P * 255.0f));
                    ok8Var.O.draw(canvas);
                    invalidate();
                }
                float f2 = ok8Var.P;
                if (f2 < 1.0f) {
                    if (f2 == 0.0f) {
                        super.onDraw(canvas);
                        break;
                    } else {
                        canvas.save();
                        canvas.translate(0.0f, (int) (ok8Var.P * hl.L(-24.0f)));
                        canvas.scale(1.0f, 1.0f - (ok8Var.P * 0.4f));
                        super.onDraw(canvas);
                        canvas.restore();
                        break;
                    }
                }
                break;
        }
    }
}
