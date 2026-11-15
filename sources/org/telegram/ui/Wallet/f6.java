package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import j$.util.Objects;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes4.dex */
public final class f6 extends org.telegram.ui.Components.h6 {
    public final /* synthetic */ int s;
    public final /* synthetic */ h6 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f6(h6 h6Var, Context context, int i7) {
        super(context, false, true, true, true, true);
        this.s = i7;
        this.w = h6Var;
    }

    @Override // org.telegram.ui.Components.h6, android.view.View
    public final void onDraw(Canvas canvas) {
        switch (this.s) {
            case 0:
                float c10 = getDrawable().c();
                h6 h6Var = this.w;
                float b10 = h6Var.b();
                float min = (((c10 > 0.0f ? Math.min(1.0f, h6Var.V / c10) : 1.0f) - b10) * h6Var.U) + b10;
                h6Var.b = min;
                int save = canvas.save();
                canvas.scale(min, min, 0.0f, getHeight() / 2.0f);
                float e10 = (1.0f - h6Var.U) * h6Var.g0.e(false, h6Var.e0);
                org.telegram.ui.Components.g6 drawable = getDrawable();
                Objects.requireNonNull(drawable);
                h6Var.c(e10, new b3(drawable, 4), new r(11, this, canvas));
                canvas.restoreToCount(save);
                break;
            default:
                h6 h6Var2 = this.w;
                float e11 = (1.0f - h6Var2.U) * h6Var2.g0.e(false, h6Var2.e0);
                org.telegram.ui.Components.g6 drawable2 = getDrawable();
                Objects.requireNonNull(drawable2);
                h6Var2.c(e11, new b3(drawable2, 4), new r(12, this, canvas));
                break;
        }
    }
}
