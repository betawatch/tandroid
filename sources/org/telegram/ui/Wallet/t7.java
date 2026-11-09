package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes4.dex */
public final class t7 extends View {
    public final /* synthetic */ a8 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t7(a8 a8Var, Context context) {
        super(context);
        this.a = a8Var;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float pow;
        Canvas canvas2;
        a8 a8Var = this.a;
        if (a8Var.Y0 <= 0.0f) {
            return;
        }
        if (a8Var.X0) {
            float f10 = a8Var.U0;
            pow = com.google.android.recaptcha.internal.a.C(f10, 2.0f, 3.0f, f10 * f10);
        } else {
            pow = 1.0f - ((float) Math.pow(1.0f - a8Var.U0, 4.0d));
        }
        float f11 = pow;
        boolean z9 = a8Var.X0;
        float f12 = (z9 || f11 >= 1.0f) ? -1.0f : a8Var.Y0 * 1.2f * f11;
        z7 z7Var = a8Var.S0;
        if (z7Var == null || f11 >= 1.0f) {
            canvas2 = canvas;
        } else {
            float f13 = z9 ? 1.0f - f11 : 1.0f;
            canvas2 = canvas;
            a8Var.s(canvas2, z7Var, f13, f12, true);
        }
        z7 z7Var2 = a8Var.T0;
        if (z7Var2 != null) {
            a8Var.s(canvas2, z7Var2, a8Var.X0 ? f11 : 1.0f, f12, false);
        }
    }
}
