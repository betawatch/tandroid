package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import j$.util.Objects;
import org.telegram.ui.wb1;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes4.dex */
public final class d6 extends org.telegram.ui.Components.j6 {
    public final /* synthetic */ int s;
    public final /* synthetic */ f6 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d6(f6 f6Var, Context context, int i7) {
        super(context, false, true, true, true, true);
        this.s = i7;
        this.w = f6Var;
    }

    @Override // org.telegram.ui.Components.j6, android.view.View
    public final void onDraw(Canvas canvas) {
        switch (this.s) {
            case 0:
                float c10 = getDrawable().c();
                f6 f6Var = this.w;
                float b10 = f6Var.b();
                float min = (((c10 > 0.0f ? Math.min(1.0f, f6Var.U / c10) : 1.0f) - b10) * f6Var.T) + b10;
                f6Var.b = min;
                int save = canvas.save();
                canvas.scale(min, min, 0.0f, getHeight() / 2.0f);
                float e10 = (1.0f - f6Var.T) * f6Var.f0.e(false, f6Var.d0);
                org.telegram.ui.Components.i6 drawable = getDrawable();
                Objects.requireNonNull(drawable);
                f6Var.c(e10, new c3(drawable, 4), new wb1(16, this, canvas));
                canvas.restoreToCount(save);
                break;
            default:
                f6 f6Var2 = this.w;
                float e11 = (1.0f - f6Var2.T) * f6Var2.f0.e(false, f6Var2.d0);
                org.telegram.ui.Components.i6 drawable2 = getDrawable();
                Objects.requireNonNull(drawable2);
                f6Var2.c(e11, new c3(drawable2, 4), new wb1(17, this, canvas));
                break;
        }
    }
}
