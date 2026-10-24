package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final class m7 extends View {
    public final /* synthetic */ t7 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m7(t7 t7Var, Context context) {
        super(context);
        this.a = t7Var;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float pow;
        Canvas canvas2;
        t7 t7Var = this.a;
        if (t7Var.Y0 <= 0.0f) {
            return;
        }
        if (t7Var.X0) {
            float f7 = t7Var.U0;
            pow = com.google.android.gms.internal.play_billing.k3.B(f7, 2.0f, 3.0f, f7 * f7);
        } else {
            pow = 1.0f - ((float) Math.pow(1.0f - t7Var.U0, 4.0d));
        }
        float f10 = pow;
        boolean z10 = t7Var.X0;
        float f11 = (z10 || f10 >= 1.0f) ? -1.0f : t7Var.Y0 * 1.2f * f10;
        s7 s7Var = t7Var.S0;
        if (s7Var == null || f10 >= 1.0f) {
            canvas2 = canvas;
        } else {
            float f12 = z10 ? 1.0f - f10 : 1.0f;
            canvas2 = canvas;
            t7Var.s(canvas2, s7Var, f12, f11, true);
        }
        s7 s7Var2 = t7Var.T0;
        if (s7Var2 != null) {
            t7Var.s(canvas2, s7Var2, t7Var.X0 ? f10 : 1.0f, f11, false);
        }
    }
}
