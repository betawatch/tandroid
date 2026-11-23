package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import j$.util.Objects;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class w6 extends org.telegram.ui.Components.n6 {
    public final /* synthetic */ int s;
    public final /* synthetic */ y6 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w6(y6 y6Var, Context context, int i7) {
        super(context, false, true, true, true, true);
        this.s = i7;
        this.w = y6Var;
    }

    @Override // org.telegram.ui.Components.n6, android.view.View
    public final void onDraw(Canvas canvas) {
        switch (this.s) {
            case 0:
                float c10 = getDrawable().c();
                y6 y6Var = this.w;
                float b10 = y6Var.b();
                float min = (((c10 > 0.0f ? Math.min(1.0f, y6Var.V / c10) : 1.0f) - b10) * y6Var.U) + b10;
                y6Var.b = min;
                int save = canvas.save();
                canvas.scale(min, min, 0.0f, getHeight() / 2.0f);
                float e10 = (1.0f - y6Var.U) * y6Var.g0.e(false, y6Var.e0);
                org.telegram.ui.Components.m6 drawable = getDrawable();
                Objects.requireNonNull(drawable);
                y6Var.c(e10, new i3(drawable, 4), new r(9, this, canvas));
                canvas.restoreToCount(save);
                break;
            default:
                y6 y6Var2 = this.w;
                float e11 = (1.0f - y6Var2.U) * y6Var2.g0.e(false, y6Var2.e0);
                org.telegram.ui.Components.m6 drawable2 = getDrawable();
                Objects.requireNonNull(drawable2);
                y6Var2.c(e11, new i3(drawable2, 4), new r(10, this, canvas));
                break;
        }
    }
}
