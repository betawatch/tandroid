package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import j$.util.Objects;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes4.dex */
public final class e6 extends org.telegram.ui.Components.j6 {
    public final /* synthetic */ int s;
    public final /* synthetic */ g6 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e6(g6 g6Var, Context context, int i7) {
        super(context, false, true, true, true, true);
        this.s = i7;
        this.w = g6Var;
    }

    @Override // org.telegram.ui.Components.j6, android.view.View
    public final void onDraw(Canvas canvas) {
        switch (this.s) {
            case 0:
                float c10 = getDrawable().c();
                g6 g6Var = this.w;
                float b10 = g6Var.b();
                float min = (((c10 > 0.0f ? Math.min(1.0f, g6Var.U / c10) : 1.0f) - b10) * g6Var.T) + b10;
                g6Var.b = min;
                int save = canvas.save();
                canvas.scale(min, min, 0.0f, getHeight() / 2.0f);
                float e10 = (1.0f - g6Var.T) * g6Var.f0.e(false, g6Var.d0);
                org.telegram.ui.Components.i6 drawable = getDrawable();
                Objects.requireNonNull(drawable);
                g6Var.c(e10, new d3(drawable, 4), new n(15, this, canvas));
                canvas.restoreToCount(save);
                break;
            default:
                g6 g6Var2 = this.w;
                float e11 = (1.0f - g6Var2.T) * g6Var2.f0.e(false, g6Var2.d0);
                org.telegram.ui.Components.i6 drawable2 = getDrawable();
                Objects.requireNonNull(drawable2);
                g6Var2.c(e11, new d3(drawable2, 4), new n(16, this, canvas));
                break;
        }
    }
}
