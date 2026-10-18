package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import j$.util.Objects;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final class v5 extends org.telegram.ui.Components.q6 {
    public final /* synthetic */ int s;
    public final /* synthetic */ x5 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v5(x5 x5Var, Context context, int i10) {
        super(context, false, true, true, true, true);
        this.s = i10;
        this.v = x5Var;
    }

    @Override // org.telegram.ui.Components.q6, android.view.View
    public final void onDraw(Canvas canvas) {
        switch (this.s) {
            case 0:
                float c10 = getDrawable().c();
                x5 x5Var = this.v;
                float a2 = x5Var.a();
                float min = (((c10 > 0.0f ? Math.min(1.0f, x5Var.b0 / c10) : 1.0f) - a2) * x5Var.a0) + a2;
                x5Var.b = min;
                int save = canvas.save();
                canvas.scale(min, min, 0.0f, getHeight() / 2.0f);
                float d = (1.0f - x5Var.a0) * x5Var.j0.d(x5Var.h0, false);
                org.telegram.ui.Components.p6 drawable = getDrawable();
                Objects.requireNonNull(drawable);
                x5Var.d(d, false, new o2(drawable, 4), new u3(7, this, canvas));
                canvas.restoreToCount(save);
                break;
            default:
                x5 x5Var2 = this.v;
                float d10 = (1.0f - x5Var2.a0) * x5Var2.j0.d(x5Var2.h0, false);
                org.telegram.ui.Components.p6 drawable2 = getDrawable();
                Objects.requireNonNull(drawable2);
                x5Var2.d(d10, false, new o2(drawable2, 4), new u3(8, this, canvas));
                break;
        }
    }
}
