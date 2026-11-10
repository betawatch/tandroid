package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import j$.util.Objects;
import org.telegram.ui.sb1;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes4.dex */
public final class g6 extends org.telegram.ui.Components.i6 {
    public final /* synthetic */ int s;
    public final /* synthetic */ i6 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g6(i6 i6Var, Context context, int i7) {
        super(context, false, true, true, true, true);
        this.s = i7;
        this.w = i6Var;
    }

    @Override // org.telegram.ui.Components.i6, android.view.View
    public final void onDraw(Canvas canvas) {
        switch (this.s) {
            case 0:
                float c10 = getDrawable().c();
                i6 i6Var = this.w;
                float b10 = i6Var.b();
                float min = (((c10 > 0.0f ? Math.min(1.0f, i6Var.U / c10) : 1.0f) - b10) * i6Var.T) + b10;
                i6Var.b = min;
                int save = canvas.save();
                canvas.scale(min, min, 0.0f, getHeight() / 2.0f);
                float e10 = (1.0f - i6Var.T) * i6Var.f0.e(false, i6Var.d0);
                org.telegram.ui.Components.h6 drawable = getDrawable();
                Objects.requireNonNull(drawable);
                i6Var.c(e10, new c3(drawable, 4), new sb1(16, this, canvas));
                canvas.restoreToCount(save);
                break;
            default:
                i6 i6Var2 = this.w;
                float e11 = (1.0f - i6Var2.T) * i6Var2.f0.e(false, i6Var2.d0);
                org.telegram.ui.Components.h6 drawable2 = getDrawable();
                Objects.requireNonNull(drawable2);
                i6Var2.c(e11, new c3(drawable2, 4), new sb1(17, this, canvas));
                break;
        }
    }
}
