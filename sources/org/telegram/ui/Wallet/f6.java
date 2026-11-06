package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import j$.util.Objects;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes4.dex */
public final class f6 extends org.telegram.ui.Components.j6 {
    public final /* synthetic */ int s;
    public final /* synthetic */ h6 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f6(h6 h6Var, Context context, int i7) {
        super(context, false, true, true, true, true);
        this.s = i7;
        this.w = h6Var;
    }

    @Override // org.telegram.ui.Components.j6, android.view.View
    public final void onDraw(Canvas canvas) {
        switch (this.s) {
            case 0:
                float c10 = getDrawable().c();
                h6 h6Var = this.w;
                float b10 = h6Var.b();
                float min = (((c10 > 0.0f ? Math.min(1.0f, h6Var.U / c10) : 1.0f) - b10) * h6Var.T) + b10;
                h6Var.b = min;
                int save = canvas.save();
                canvas.scale(min, min, 0.0f, getHeight() / 2.0f);
                float e10 = (1.0f - h6Var.T) * h6Var.f0.e(false, h6Var.d0);
                org.telegram.ui.Components.i6 drawable = getDrawable();
                Objects.requireNonNull(drawable);
                h6Var.c(e10, new e3(drawable, 4), new n(15, this, canvas));
                canvas.restoreToCount(save);
                break;
            default:
                h6 h6Var2 = this.w;
                float e11 = (1.0f - h6Var2.T) * h6Var2.f0.e(false, h6Var2.d0);
                org.telegram.ui.Components.i6 drawable2 = getDrawable();
                Objects.requireNonNull(drawable2);
                h6Var2.c(e11, new e3(drawable2, 4), new n(16, this, canvas));
                break;
        }
    }
}
