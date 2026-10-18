package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final class s7 extends View {
    public final /* synthetic */ z7 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s7(z7 z7Var, Context context) {
        super(context);
        this.a = z7Var;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float pow;
        Canvas canvas2;
        z7 z7Var = this.a;
        if (z7Var.T0 <= 0.0f) {
            return;
        }
        if (z7Var.S0) {
            float f7 = z7Var.P0;
            pow = com.google.android.gms.internal.play_billing.k3.B(f7, 2.0f, 3.0f, f7 * f7);
        } else {
            pow = 1.0f - ((float) Math.pow(1.0f - z7Var.P0, 4.0d));
        }
        float f10 = pow;
        boolean z10 = z7Var.S0;
        float f11 = (z10 || f10 >= 1.0f) ? -1.0f : z7Var.T0 * 1.2f * f10;
        y7 y7Var = z7Var.N0;
        if (y7Var == null || f10 >= 1.0f) {
            canvas2 = canvas;
        } else {
            float f12 = z10 ? 1.0f - f10 : 1.0f;
            canvas2 = canvas;
            z7Var.s(canvas2, y7Var, f12, f11, true);
        }
        y7 y7Var2 = z7Var.O0;
        if (y7Var2 != null) {
            z7Var.s(canvas2, y7Var2, z7Var.S0 ? f10 : 1.0f, f11, false);
        }
    }
}
