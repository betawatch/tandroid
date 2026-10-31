package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class a8 extends View {
    public final /* synthetic */ h8 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a8(h8 h8Var, Context context) {
        super(context);
        this.a = h8Var;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float pow;
        Canvas canvas2;
        h8 h8Var = this.a;
        if (h8Var.Y0 <= 0.0f) {
            return;
        }
        if (h8Var.X0) {
            float f7 = h8Var.U0;
            pow = c3.i0.D(f7, 2.0f, 3.0f, f7 * f7);
        } else {
            pow = 1.0f - ((float) Math.pow(1.0f - h8Var.U0, 4.0d));
        }
        float f10 = pow;
        boolean z10 = h8Var.X0;
        float f11 = (z10 || f10 >= 1.0f) ? -1.0f : h8Var.Y0 * 1.2f * f10;
        g8 g8Var = h8Var.S0;
        if (g8Var == null || f10 >= 1.0f) {
            canvas2 = canvas;
        } else {
            float f12 = z10 ? 1.0f - f10 : 1.0f;
            canvas2 = canvas;
            h8Var.s(canvas2, g8Var, f12, f11, true);
        }
        g8 g8Var2 = h8Var.T0;
        if (g8Var2 != null) {
            h8Var.s(canvas2, g8Var2, h8Var.X0 ? f10 : 1.0f, f11, false);
        }
    }
}
