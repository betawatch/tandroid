package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class pn0 extends qj0 {
    public final /* synthetic */ int e3;
    public final /* synthetic */ no0 f3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pn0(no0 no0Var, Context context, org.telegram.ui.ActionBar.g6 g6Var, int i7) {
        super(context, g6Var);
        this.e3 = i7;
        this.f3 = no0Var;
    }

    @Override // org.telegram.ui.Components.qj0
    public final boolean E0(float f10) {
        switch (this.e3) {
            case 0:
                no0 no0Var = this.f3;
                if (f10 >= org.telegram.messenger.g0.L((!no0Var.Z1 || no0Var.g2[1] == null) ? 58.0f : 111.0f) + no0Var.y2.b) {
                }
                break;
            default:
                no0 no0Var2 = this.f3;
                if (f10 >= org.telegram.messenger.g0.L((!no0Var2.Z1 || no0Var2.g2[1] == null) ? 58.0f : 111.0f) + no0Var2.y2.b) {
                }
                break;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void draw(Canvas canvas) {
        switch (this.e3) {
            case 0:
                no0 no0Var = this.f3;
                qj0 qj0Var = no0Var.w1;
                if (qj0Var.getVisibility() != 8) {
                    canvas.save();
                    canvas.clipRect(0, org.telegram.messenger.g0.L((!no0Var.Z1 || no0Var.g2[1] == null) ? 58.0f : 111.0f) + no0Var.h2, getWidth(), getHeight());
                }
                super.draw(canvas);
                if (qj0Var.getVisibility() != 8) {
                    canvas.restore();
                    break;
                }
                break;
            default:
                no0 no0Var2 = this.f3;
                qj0 qj0Var2 = no0Var2.w1;
                if (qj0Var2.getVisibility() != 8) {
                    canvas.save();
                    canvas.clipRect(0, org.telegram.messenger.g0.L((!no0Var2.Z1 || no0Var2.g2[1] == null) ? 58.0f : 111.0f) + no0Var2.h2, getWidth(), getHeight());
                }
                super.draw(canvas);
                if (qj0Var2.getVisibility() != 8) {
                    canvas.restore();
                    break;
                }
                break;
        }
    }
}
