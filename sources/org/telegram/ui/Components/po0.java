package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class po0 extends uk0 {
    public final /* synthetic */ int e3;
    public final /* synthetic */ pp0 f3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ po0(pp0 pp0Var, Context context, org.telegram.ui.ActionBar.p6 p6Var, int i10) {
        super(context, p6Var);
        this.e3 = i10;
        this.f3 = pp0Var;
    }

    @Override // org.telegram.ui.Components.uk0
    public final boolean E0(float f7) {
        switch (this.e3) {
            case 0:
                pp0 pp0Var = this.f3;
                if (f7 >= org.telegram.messenger.i0.L((!pp0Var.Z1 || pp0Var.g2[1] == null) ? 58.0f : 111.0f) + pp0Var.y2.b) {
                }
                break;
            default:
                pp0 pp0Var2 = this.f3;
                if (f7 >= org.telegram.messenger.i0.L((!pp0Var2.Z1 || pp0Var2.g2[1] == null) ? 58.0f : 111.0f) + pp0Var2.y2.b) {
                }
                break;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void draw(Canvas canvas) {
        switch (this.e3) {
            case 0:
                pp0 pp0Var = this.f3;
                uk0 uk0Var = pp0Var.w1;
                if (uk0Var.getVisibility() != 8) {
                    canvas.save();
                    canvas.clipRect(0, org.telegram.messenger.i0.L((!pp0Var.Z1 || pp0Var.g2[1] == null) ? 58.0f : 111.0f) + pp0Var.h2, getWidth(), getHeight());
                }
                super.draw(canvas);
                if (uk0Var.getVisibility() != 8) {
                    canvas.restore();
                    break;
                }
                break;
            default:
                pp0 pp0Var2 = this.f3;
                uk0 uk0Var2 = pp0Var2.w1;
                if (uk0Var2.getVisibility() != 8) {
                    canvas.save();
                    canvas.clipRect(0, org.telegram.messenger.i0.L((!pp0Var2.Z1 || pp0Var2.g2[1] == null) ? 58.0f : 111.0f) + pp0Var2.h2, getWidth(), getHeight());
                }
                super.draw(canvas);
                if (uk0Var2.getVisibility() != 8) {
                    canvas.restore();
                    break;
                }
                break;
        }
    }
}
