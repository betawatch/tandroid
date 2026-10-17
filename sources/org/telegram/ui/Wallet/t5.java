package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import j$.util.Objects;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final class t5 extends org.telegram.ui.Components.q6 {
    public final /* synthetic */ int s;
    public final /* synthetic */ v5 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t5(v5 v5Var, Context context, int i10) {
        super(context, false, true, true, true, true);
        this.s = i10;
        this.v = v5Var;
    }

    @Override // org.telegram.ui.Components.q6, android.view.View
    public final void onDraw(Canvas canvas) {
        switch (this.s) {
            case 0:
                float c10 = getDrawable().c();
                v5 v5Var = this.v;
                float a2 = v5Var.a();
                float min = (((c10 > 0.0f ? Math.min(1.0f, v5Var.b0 / c10) : 1.0f) - a2) * v5Var.a0) + a2;
                v5Var.b = min;
                int save = canvas.save();
                canvas.scale(min, min, 0.0f, getHeight() / 2.0f);
                float d = (1.0f - v5Var.a0) * v5Var.j0.d(v5Var.h0, false);
                org.telegram.ui.Components.p6 drawable = getDrawable();
                Objects.requireNonNull(drawable);
                v5Var.d(d, false, new o2(drawable, 4), new t3(7, this, canvas));
                canvas.restoreToCount(save);
                break;
            default:
                v5 v5Var2 = this.v;
                float d10 = (1.0f - v5Var2.a0) * v5Var2.j0.d(v5Var2.h0, false);
                org.telegram.ui.Components.p6 drawable2 = getDrawable();
                Objects.requireNonNull(drawable2);
                v5Var2.d(d10, false, new o2(drawable2, 4), new t3(8, this, canvas));
                break;
        }
    }
}
