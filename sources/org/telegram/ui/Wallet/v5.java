package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import j$.util.Objects;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
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
                float b10 = x5Var.b();
                float min = (((c10 > 0.0f ? Math.min(1.0f, x5Var.U / c10) : 1.0f) - b10) * x5Var.T) + b10;
                x5Var.b = min;
                int save = canvas.save();
                canvas.scale(min, min, 0.0f, getHeight() / 2.0f);
                float d = (1.0f - x5Var.T) * x5Var.f0.d(x5Var.d0, false);
                org.telegram.ui.Components.p6 drawable = getDrawable();
                Objects.requireNonNull(drawable);
                x5Var.c(d, new o2(drawable, 4), new z3(7, this, canvas));
                canvas.restoreToCount(save);
                break;
            default:
                x5 x5Var2 = this.v;
                float d10 = (1.0f - x5Var2.T) * x5Var2.f0.d(x5Var2.d0, false);
                org.telegram.ui.Components.p6 drawable2 = getDrawable();
                Objects.requireNonNull(drawable2);
                x5Var2.c(d10, new o2(drawable2, 4), new z3(8, this, canvas));
                break;
        }
    }
}
