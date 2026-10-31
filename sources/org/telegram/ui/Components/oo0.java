package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class oo0 extends tk0 {
    public final /* synthetic */ int e3;
    public final /* synthetic */ op0 f3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oo0(op0 op0Var, Context context, org.telegram.ui.ActionBar.p6 p6Var, int i10) {
        super(context, p6Var);
        this.e3 = i10;
        this.f3 = op0Var;
    }

    @Override // org.telegram.ui.Components.tk0
    public final boolean E0(float f7) {
        switch (this.e3) {
            case 0:
                op0 op0Var = this.f3;
                if (f7 >= org.telegram.messenger.i0.L((!op0Var.Z1 || op0Var.g2[1] == null) ? 58.0f : 111.0f) + op0Var.y2.b) {
                }
                break;
            default:
                op0 op0Var2 = this.f3;
                if (f7 >= org.telegram.messenger.i0.L((!op0Var2.Z1 || op0Var2.g2[1] == null) ? 58.0f : 111.0f) + op0Var2.y2.b) {
                }
                break;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void draw(Canvas canvas) {
        switch (this.e3) {
            case 0:
                op0 op0Var = this.f3;
                tk0 tk0Var = op0Var.w1;
                if (tk0Var.getVisibility() != 8) {
                    canvas.save();
                    canvas.clipRect(0, org.telegram.messenger.i0.L((!op0Var.Z1 || op0Var.g2[1] == null) ? 58.0f : 111.0f) + op0Var.h2, getWidth(), getHeight());
                }
                super.draw(canvas);
                if (tk0Var.getVisibility() != 8) {
                    canvas.restore();
                    break;
                }
                break;
            default:
                op0 op0Var2 = this.f3;
                tk0 tk0Var2 = op0Var2.w1;
                if (tk0Var2.getVisibility() != 8) {
                    canvas.save();
                    canvas.clipRect(0, org.telegram.messenger.i0.L((!op0Var2.Z1 || op0Var2.g2[1] == null) ? 58.0f : 111.0f) + op0Var2.h2, getWidth(), getHeight());
                }
                super.draw(canvas);
                if (tk0Var2.getVisibility() != 8) {
                    canvas.restore();
                    break;
                }
                break;
        }
    }
}
