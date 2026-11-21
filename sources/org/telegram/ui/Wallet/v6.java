package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import j$.util.Objects;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes4.dex */
public final class v6 extends org.telegram.ui.Components.o6 {
    public final /* synthetic */ int s;
    public final /* synthetic */ x6 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v6(x6 x6Var, Context context, int i7) {
        super(context, false, true, true, true, true);
        this.s = i7;
        this.w = x6Var;
    }

    @Override // org.telegram.ui.Components.o6, android.view.View
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
                org.telegram.ui.Components.n6 drawable = getDrawable();
                Objects.requireNonNull(drawable);
                x6Var.c(e10, new h3(drawable, 4), new u4(5, this, canvas));
                canvas.restoreToCount(save);
                break;
            default:
                x6 x6Var2 = this.w;
                float e11 = (1.0f - x6Var2.U) * x6Var2.g0.e(false, x6Var2.e0);
                org.telegram.ui.Components.n6 drawable2 = getDrawable();
                Objects.requireNonNull(drawable2);
                x6Var2.c(e11, new h3(drawable2, 4), new u4(6, this, canvas));
                break;
        }
    }
}
