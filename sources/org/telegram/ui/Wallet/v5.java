package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import j$.util.Objects;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
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
                float min = (((c10 > 0.0f ? Math.min(1.0f, x5Var.V / c10) : 1.0f) - a2) * x5Var.U) + a2;
                x5Var.b = min;
                int save = canvas.save();
                canvas.scale(min, min, 0.0f, getHeight() / 2.0f);
                float d = (1.0f - x5Var.U) * x5Var.j0.d(x5Var.h0, false);
                org.telegram.ui.Components.p6 drawable = getDrawable();
                Objects.requireNonNull(drawable);
                x5Var.b(d, false, new o2(drawable, 4), new v3(8, this, canvas));
                canvas.restoreToCount(save);
                break;
            default:
                x5 x5Var2 = this.v;
                float d10 = (1.0f - x5Var2.U) * x5Var2.j0.d(x5Var2.h0, false);
                org.telegram.ui.Components.p6 drawable2 = getDrawable();
                Objects.requireNonNull(drawable2);
                x5Var2.b(d10, false, new o2(drawable2, 4), new v3(9, this, canvas));
                break;
        }
    }
}
