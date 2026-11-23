package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class l8 extends View {
    public final /* synthetic */ s8 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l8(s8 s8Var, Context context) {
        super(context);
        this.a = s8Var;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float pow;
        Canvas canvas2;
        s8 s8Var = this.a;
        if (s8Var.Z0 <= 0.0f) {
            return;
        }
        if (s8Var.Y0) {
            float f10 = s8Var.V0;
            pow = com.google.android.gms.internal.vision.e2.C(f10, 2.0f, 3.0f, f10 * f10);
        } else {
            pow = 1.0f - ((float) Math.pow(1.0f - s8Var.V0, 4.0d));
        }
        float f11 = pow;
        boolean z10 = s8Var.Y0;
        float f12 = (z10 || f11 >= 1.0f) ? -1.0f : s8Var.Z0 * 1.2f * f11;
        r8 r8Var = s8Var.T0;
        if (r8Var == null || f11 >= 1.0f) {
            canvas2 = canvas;
        } else {
            float f13 = z10 ? 1.0f - f11 : 1.0f;
            canvas2 = canvas;
            s8Var.s(canvas2, r8Var, f13, f12, true);
        }
        r8 r8Var2 = s8Var.U0;
        if (r8Var2 != null) {
            s8Var.s(canvas2, r8Var2, s8Var.Y0 ? f11 : 1.0f, f12, false);
        }
    }
}
