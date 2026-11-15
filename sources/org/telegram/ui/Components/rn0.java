package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class rn0 extends uj0 {
    public final /* synthetic */ int f3;
    public final /* synthetic */ po0 g3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rn0(po0 po0Var, Context context, org.telegram.ui.ActionBar.e6 e6Var, int i7) {
        super(context, e6Var);
        this.f3 = i7;
        this.g3 = po0Var;
    }

    @Override // org.telegram.ui.Components.uj0
    public final boolean E0(float f10) {
        switch (this.f3) {
            case 0:
                po0 po0Var = this.g3;
                if (f10 >= org.telegram.messenger.g0.L((!po0Var.d2 || po0Var.k2[1] == null) ? 58.0f : 111.0f) + po0Var.C2.b) {
                }
                break;
            default:
                po0 po0Var2 = this.g3;
                if (f10 >= org.telegram.messenger.g0.L((!po0Var2.d2 || po0Var2.k2[1] == null) ? 58.0f : 111.0f) + po0Var2.C2.b) {
                }
                break;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void draw(Canvas canvas) {
        switch (this.f3) {
            case 0:
                po0 po0Var = this.g3;
                uj0 uj0Var = po0Var.A1;
                if (uj0Var.getVisibility() != 8) {
                    canvas.save();
                    canvas.clipRect(0, org.telegram.messenger.g0.L((!po0Var.d2 || po0Var.k2[1] == null) ? 58.0f : 111.0f) + po0Var.l2, getWidth(), getHeight());
                }
                super.draw(canvas);
                if (uj0Var.getVisibility() != 8) {
                    canvas.restore();
                    break;
                }
                break;
            default:
                po0 po0Var2 = this.g3;
                uj0 uj0Var2 = po0Var2.A1;
                if (uj0Var2.getVisibility() != 8) {
                    canvas.save();
                    canvas.clipRect(0, org.telegram.messenger.g0.L((!po0Var2.d2 || po0Var2.k2[1] == null) ? 58.0f : 111.0f) + po0Var2.l2, getWidth(), getHeight());
                }
                super.draw(canvas);
                if (uj0Var2.getVisibility() != 8) {
                    canvas.restore();
                    break;
                }
                break;
        }
    }
}
