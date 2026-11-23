package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes4.dex */
public final class k8 extends View {
    public final /* synthetic */ r8 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k8(r8 r8Var, Context context) {
        super(context);
        this.a = r8Var;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float pow;
        Canvas canvas2;
        r8 r8Var = this.a;
        if (r8Var.Z0 <= 0.0f) {
            return;
        }
        if (r8Var.Y0) {
            float f10 = r8Var.V0;
            pow = com.google.android.gms.internal.vision.e2.C(f10, 2.0f, 3.0f, f10 * f10);
        } else {
            pow = 1.0f - ((float) Math.pow(1.0f - r8Var.V0, 4.0d));
        }
        float f11 = pow;
        boolean z10 = r8Var.Y0;
        float f12 = (z10 || f11 >= 1.0f) ? -1.0f : r8Var.Z0 * 1.2f * f11;
        q8 q8Var = r8Var.T0;
        if (q8Var == null || f11 >= 1.0f) {
            canvas2 = canvas;
        } else {
            float f13 = z10 ? 1.0f - f11 : 1.0f;
            canvas2 = canvas;
            r8Var.s(canvas2, q8Var, f13, f12, true);
        }
        q8 q8Var2 = r8Var.U0;
        if (q8Var2 != null) {
            r8Var.s(canvas2, q8Var2, r8Var.Y0 ? f11 : 1.0f, f12, false);
        }
    }
}
