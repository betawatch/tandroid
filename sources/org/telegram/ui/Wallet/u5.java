package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import j$.util.Objects;
import org.telegram.ui.zc1;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class u5 extends org.telegram.ui.Components.s6 {
    public final /* synthetic */ int s;
    public final /* synthetic */ w5 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u5(w5 w5Var, Context context, int i10) {
        super(context, false, true, true, true, true);
        this.s = i10;
        this.v = w5Var;
    }

    @Override // org.telegram.ui.Components.s6, android.view.View
    public final void onDraw(Canvas canvas) {
        switch (this.s) {
            case 0:
                float c10 = getDrawable().c();
                w5 w5Var = this.v;
                float b10 = w5Var.b();
                float min = (((c10 > 0.0f ? Math.min(1.0f, w5Var.U / c10) : 1.0f) - b10) * w5Var.T) + b10;
                w5Var.b = min;
                int save = canvas.save();
                canvas.scale(min, min, 0.0f, getHeight() / 2.0f);
                float d = (1.0f - w5Var.T) * w5Var.f0.d(w5Var.d0, false);
                org.telegram.ui.Components.r6 drawable = getDrawable();
                Objects.requireNonNull(drawable);
                w5Var.c(d, new n2(drawable, 4), new zc1(27, this, canvas));
                canvas.restoreToCount(save);
                break;
            default:
                w5 w5Var2 = this.v;
                float d10 = (1.0f - w5Var2.T) * w5Var2.f0.d(w5Var2.d0, false);
                org.telegram.ui.Components.r6 drawable2 = getDrawable();
                Objects.requireNonNull(drawable2);
                w5Var2.c(d10, new n2(drawable2, 4), new zc1(28, this, canvas));
                break;
        }
    }
}
