package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class u7 extends View {
    public final /* synthetic */ b8 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u7(b8 b8Var, Context context) {
        super(context);
        this.a = b8Var;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float pow;
        Canvas canvas2;
        b8 b8Var = this.a;
        if (b8Var.Z0 <= 0.0f) {
            return;
        }
        if (b8Var.Y0) {
            float f10 = b8Var.V0;
            pow = com.google.android.recaptcha.internal.a.B(f10, 2.0f, 3.0f, f10 * f10);
        } else {
            pow = 1.0f - ((float) Math.pow(1.0f - b8Var.V0, 4.0d));
        }
        float f11 = pow;
        boolean z10 = b8Var.Y0;
        float f12 = (z10 || f11 >= 1.0f) ? -1.0f : b8Var.Z0 * 1.2f * f11;
        a8 a8Var = b8Var.T0;
        if (a8Var == null || f11 >= 1.0f) {
            canvas2 = canvas;
        } else {
            float f13 = z10 ? 1.0f - f11 : 1.0f;
            canvas2 = canvas;
            b8Var.s(canvas2, a8Var, f13, f12, true);
        }
        a8 a8Var2 = b8Var.U0;
        if (a8Var2 != null) {
            b8Var.s(canvas2, a8Var2, b8Var.Y0 ? f11 : 1.0f, f12, false);
        }
    }
}
