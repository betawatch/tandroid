package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import j$.util.Objects;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final class v6 extends org.telegram.ui.Components.n6 {
    public final /* synthetic */ int s;
    public final /* synthetic */ x6 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v6(x6 x6Var, Context context, int i7) {
        super(context, false, true, true, true, true);
        this.s = i7;
        this.w = x6Var;
    }

    @Override // org.telegram.ui.Components.n6, android.view.View
    public final void onDraw(Canvas canvas) {
        switch (this.s) {
            case 0:
                float c10 = getDrawable().c();
                x6 x6Var = this.w;
                float b10 = x6Var.b();
                float min = (((c10 > 0.0f ? Math.min(1.0f, x6Var.V / c10) : 1.0f) - b10) * x6Var.U) + b10;
                x6Var.b = min;
                int save = canvas.save();
                canvas.scale(min, min, 0.0f, getHeight() / 2.0f);
                float e10 = (1.0f - x6Var.U) * x6Var.g0.e(false, x6Var.e0);
                org.telegram.ui.Components.m6 drawable = getDrawable();
                Objects.requireNonNull(drawable);
                x6Var.c(e10, new h3(drawable, 4), new c5(3, this, canvas));
                canvas.restoreToCount(save);
                break;
            default:
                x6 x6Var2 = this.w;
                float e11 = (1.0f - x6Var2.U) * x6Var2.g0.e(false, x6Var2.e0);
                org.telegram.ui.Components.m6 drawable2 = getDrawable();
                Objects.requireNonNull(drawable2);
                int i7 = 4;
                x6Var2.c(e11, new h3(drawable2, i7), new c5(i7, this, canvas));
                break;
        }
    }
}
