package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import j$.util.Objects;
import org.telegram.ui.ma1;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class d6 extends org.telegram.ui.Components.h6 {
    public final /* synthetic */ int s;
    public final /* synthetic */ f6 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d6(f6 f6Var, Context context, int i3) {
        super(context, false, true, true, true, true);
        this.s = i3;
        this.w = f6Var;
    }

    @Override // org.telegram.ui.Components.h6, android.view.View
    public final void onDraw(Canvas canvas) {
        switch (this.s) {
            case 0:
                float c2 = getDrawable().c();
                f6 f6Var = this.w;
                float b10 = f6Var.b();
                float min = (((c2 > 0.0f ? Math.min(1.0f, f6Var.V / c2) : 1.0f) - b10) * f6Var.U) + b10;
                f6Var.b = min;
                int save = canvas.save();
                canvas.scale(min, min, 0.0f, getHeight() / 2.0f);
                float e10 = (1.0f - f6Var.U) * f6Var.g0.e(false, f6Var.e0);
                org.telegram.ui.Components.g6 drawable = getDrawable();
                Objects.requireNonNull(drawable);
                f6Var.c(e10, new c3(drawable, 4), new ma1(20, this, canvas));
                canvas.restoreToCount(save);
                break;
            default:
                f6 f6Var2 = this.w;
                float e11 = (1.0f - f6Var2.U) * f6Var2.g0.e(false, f6Var2.e0);
                org.telegram.ui.Components.g6 drawable2 = getDrawable();
                Objects.requireNonNull(drawable2);
                f6Var2.c(e11, new c3(drawable2, 4), new ma1(21, this, canvas));
                break;
        }
    }
}
