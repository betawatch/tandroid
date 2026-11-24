// default package

import android.content.Context;
import android.graphics.Canvas;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class aj8 extends io {
    public final /* synthetic */ byte s;
    public final /* synthetic */ cj8 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ aj8(cj8 cj8Var, Context context, byte b) {
        super(context, true, true, true);
        this.s = b;
        this.w = cj8Var;
    }

    @Override // io, android.view.View
    public final void onDraw(Canvas canvas) {
        byte b = this.s;
        cj8 cj8Var = this.w;
        switch (b) {
            case 0:
                if (cj8Var.P > 0.0f) {
                    if (cj8Var.O == null) {
                        cj8Var.O = new wi2(cj8Var.f.getTextColor());
                    }
                    int L = (int) ((1.0f - cj8Var.P) * gm.L(24.0f));
                    cj8Var.O.setBounds(0, L, getWidth(), getHeight() + L);
                    cj8Var.O.setAlpha((int) (cj8Var.P * 255.0f));
                    cj8Var.O.draw(canvas);
                    invalidate();
                }
                float f = cj8Var.P;
                if (f < 1.0f) {
                    if (f == 0.0f) {
                        super.onDraw(canvas);
                        break;
                    } else {
                        canvas.save();
                        canvas.translate(0.0f, (int) (cj8Var.P * gm.L(-24.0f)));
                        canvas.scale(1.0f, 1.0f - (cj8Var.P * 0.4f));
                        super.onDraw(canvas);
                        canvas.restore();
                        break;
                    }
                }
                break;
            default:
                if (cj8Var.P > 0.0f) {
                    if (cj8Var.O == null) {
                        cj8Var.O = new wi2(cj8Var.f.getTextColor());
                    }
                    int L2 = (int) ((1.0f - cj8Var.P) * gm.L(24.0f));
                    cj8Var.O.setBounds(0, L2, getWidth(), getHeight() + L2);
                    cj8Var.O.setAlpha((int) (cj8Var.P * 255.0f));
                    cj8Var.O.draw(canvas);
                    invalidate();
                }
                float f2 = cj8Var.P;
                if (f2 < 1.0f) {
                    if (f2 == 0.0f) {
                        super.onDraw(canvas);
                        break;
                    } else {
                        canvas.save();
                        canvas.translate(0.0f, (int) (cj8Var.P * gm.L(-24.0f)));
                        canvas.scale(1.0f, 1.0f - (cj8Var.P * 0.4f));
                        super.onDraw(canvas);
                        canvas.restore();
                        break;
                    }
                }
                break;
        }
    }
}
