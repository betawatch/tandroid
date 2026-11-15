package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes4.dex */
public final class v7 extends View {
    public final /* synthetic */ c8 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v7(c8 c8Var, Context context) {
        super(context);
        this.a = c8Var;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float pow;
        Canvas canvas2;
        c8 c8Var = this.a;
        if (c8Var.Z0 <= 0.0f) {
            return;
        }
        if (c8Var.Y0) {
            float f10 = c8Var.V0;
            pow = com.google.android.gms.internal.vision.e2.C(f10, 2.0f, 3.0f, f10 * f10);
        } else {
            pow = 1.0f - ((float) Math.pow(1.0f - c8Var.V0, 4.0d));
        }
        float f11 = pow;
        boolean z10 = c8Var.Y0;
        float f12 = (z10 || f11 >= 1.0f) ? -1.0f : c8Var.Z0 * 1.2f * f11;
        b8 b8Var = c8Var.T0;
        if (b8Var == null || f11 >= 1.0f) {
            canvas2 = canvas;
        } else {
            float f13 = z10 ? 1.0f - f11 : 1.0f;
            canvas2 = canvas;
            c8Var.s(canvas2, b8Var, f13, f12, true);
        }
        b8 b8Var2 = c8Var.U0;
        if (b8Var2 != null) {
            c8Var.s(canvas2, b8Var2, c8Var.Y0 ? f11 : 1.0f, f12, false);
        }
    }
}
