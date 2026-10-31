package kg;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.ui.Components.f6;
import org.telegram.ui.Components.kp;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class w0 extends f6 {
    public final /* synthetic */ int s;
    public final /* synthetic */ x0 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w0(x0 x0Var, Context context, int i10) {
        super(context, true, true, true);
        this.s = i10;
        this.w = x0Var;
    }

    @Override // org.telegram.ui.Components.f6, android.view.View
    public final void onDraw(Canvas canvas) {
        switch (this.s) {
            case 0:
                x0 x0Var = this.w;
                if (x0Var.O > 0.0f) {
                    if (x0Var.N == null) {
                        x0Var.N = new kp(x0Var.f.getTextColor());
                    }
                    int L = (int) ((1.0f - x0Var.O) * org.telegram.messenger.i0.L(24.0f));
                    x0Var.N.setBounds(0, L, getWidth(), getHeight() + L);
                    x0Var.N.setAlpha((int) (x0Var.O * 255.0f));
                    x0Var.N.draw(canvas);
                    invalidate();
                }
                float f7 = x0Var.O;
                if (f7 < 1.0f) {
                    if (f7 == 0.0f) {
                        super.onDraw(canvas);
                        break;
                    } else {
                        canvas.save();
                        canvas.translate(0.0f, (int) (x0Var.O * org.telegram.messenger.i0.L(-24.0f)));
                        canvas.scale(1.0f, 1.0f - (x0Var.O * 0.4f));
                        super.onDraw(canvas);
                        canvas.restore();
                        break;
                    }
                }
                break;
            default:
                x0 x0Var2 = this.w;
                if (x0Var2.O > 0.0f) {
                    if (x0Var2.N == null) {
                        x0Var2.N = new kp(x0Var2.f.getTextColor());
                    }
                    int L2 = (int) ((1.0f - x0Var2.O) * org.telegram.messenger.i0.L(24.0f));
                    x0Var2.N.setBounds(0, L2, getWidth(), getHeight() + L2);
                    x0Var2.N.setAlpha((int) (x0Var2.O * 255.0f));
                    x0Var2.N.draw(canvas);
                    invalidate();
                }
                float f10 = x0Var2.O;
                if (f10 < 1.0f) {
                    if (f10 == 0.0f) {
                        super.onDraw(canvas);
                        break;
                    } else {
                        canvas.save();
                        canvas.translate(0.0f, (int) (x0Var2.O * org.telegram.messenger.i0.L(-24.0f)));
                        canvas.scale(1.0f, 1.0f - (x0Var2.O * 0.4f));
                        super.onDraw(canvas);
                        canvas.restore();
                        break;
                    }
                }
                break;
        }
    }
}
