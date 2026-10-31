package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import j$.util.Objects;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class j6 extends org.telegram.ui.Components.f6 {
    public final /* synthetic */ int s;
    public final /* synthetic */ l6 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j6(l6 l6Var, Context context, int i10) {
        super(context, false, true, true, true, true);
        this.s = i10;
        this.w = l6Var;
    }

    @Override // org.telegram.ui.Components.f6, android.view.View
    public final void onDraw(Canvas canvas) {
        switch (this.s) {
            case 0:
                float c10 = getDrawable().c();
                l6 l6Var = this.w;
                float b10 = l6Var.b();
                float min = (((c10 > 0.0f ? Math.min(1.0f, l6Var.U / c10) : 1.0f) - b10) * l6Var.T) + b10;
                l6Var.b = min;
                int save = canvas.save();
                canvas.scale(min, min, 0.0f, getHeight() / 2.0f);
                float e = (1.0f - l6Var.T) * l6Var.f0.e(false, l6Var.d0);
                org.telegram.ui.Components.e6 drawable = getDrawable();
                Objects.requireNonNull(drawable);
                l6Var.c(e, new d3(drawable, 4), new k3(8, this, canvas));
                canvas.restoreToCount(save);
                break;
            default:
                l6 l6Var2 = this.w;
                float e7 = (1.0f - l6Var2.T) * l6Var2.f0.e(false, l6Var2.d0);
                org.telegram.ui.Components.e6 drawable2 = getDrawable();
                Objects.requireNonNull(drawable2);
                l6Var2.c(e7, new d3(drawable2, 4), new k3(9, this, canvas));
                break;
        }
    }
}
