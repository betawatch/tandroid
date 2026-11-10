package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes4.dex */
public final class w7 extends View {
    public final /* synthetic */ d8 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w7(d8 d8Var, Context context) {
        super(context);
        this.a = d8Var;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float pow;
        Canvas canvas2;
        d8 d8Var = this.a;
        if (d8Var.Y0 <= 0.0f) {
            return;
        }
        if (d8Var.X0) {
            float f10 = d8Var.U0;
            pow = com.google.android.recaptcha.internal.a.C(f10, 2.0f, 3.0f, f10 * f10);
        } else {
            pow = 1.0f - ((float) Math.pow(1.0f - d8Var.U0, 4.0d));
        }
        float f11 = pow;
        boolean z9 = d8Var.X0;
        float f12 = (z9 || f11 >= 1.0f) ? -1.0f : d8Var.Y0 * 1.2f * f11;
        c8 c8Var = d8Var.S0;
        if (c8Var == null || f11 >= 1.0f) {
            canvas2 = canvas;
        } else {
            float f13 = z9 ? 1.0f - f11 : 1.0f;
            canvas2 = canvas;
            d8Var.s(canvas2, c8Var, f13, f12, true);
        }
        c8 c8Var2 = d8Var.T0;
        if (c8Var2 != null) {
            d8Var.s(canvas2, c8Var2, d8Var.X0 ? f11 : 1.0f, f12, false);
        }
    }
}
