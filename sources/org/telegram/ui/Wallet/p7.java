package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final class p7 extends View {
    public final /* synthetic */ w7 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p7(w7 w7Var, Context context) {
        super(context);
        this.a = w7Var;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float pow;
        Canvas canvas2;
        w7 w7Var = this.a;
        if (w7Var.T0 <= 0.0f) {
            return;
        }
        if (w7Var.S0) {
            float f7 = w7Var.P0;
            pow = com.google.android.gms.internal.cast.a6.B(f7, 2.0f, 3.0f, f7 * f7);
        } else {
            pow = 1.0f - ((float) Math.pow(1.0f - w7Var.P0, 4.0d));
        }
        float f10 = pow;
        boolean z10 = w7Var.S0;
        float f11 = (z10 || f10 >= 1.0f) ? -1.0f : w7Var.T0 * 1.2f * f10;
        v7 v7Var = w7Var.N0;
        if (v7Var == null || f10 >= 1.0f) {
            canvas2 = canvas;
        } else {
            float f12 = z10 ? 1.0f - f10 : 1.0f;
            canvas2 = canvas;
            w7Var.s(canvas2, v7Var, f12, f11, true);
        }
        v7 v7Var2 = w7Var.O0;
        if (v7Var2 != null) {
            w7Var.s(canvas2, v7Var2, w7Var.S0 ? f10 : 1.0f, f11, false);
        }
    }
}
