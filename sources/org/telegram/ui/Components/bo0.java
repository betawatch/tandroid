package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class bo0 extends ek0 {
    public final /* synthetic */ int f3;
    public final /* synthetic */ zo0 g3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bo0(zo0 zo0Var, Context context, org.telegram.ui.ActionBar.i6 i6Var, int i7) {
        super(context, i6Var);
        this.f3 = i7;
        this.g3 = zo0Var;
    }

    @Override // org.telegram.ui.Components.ek0
    public final boolean E0(float f10) {
        switch (this.f3) {
            case 0:
                zo0 zo0Var = this.g3;
                if (f10 >= org.telegram.messenger.g0.L((!zo0Var.d2 || zo0Var.k2[1] == null) ? 58.0f : 111.0f) + zo0Var.C2.b) {
                }
                break;
            default:
                zo0 zo0Var2 = this.g3;
                if (f10 >= org.telegram.messenger.g0.L((!zo0Var2.d2 || zo0Var2.k2[1] == null) ? 58.0f : 111.0f) + zo0Var2.C2.b) {
                }
                break;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void draw(Canvas canvas) {
        switch (this.f3) {
            case 0:
                zo0 zo0Var = this.g3;
                ek0 ek0Var = zo0Var.A1;
                if (ek0Var.getVisibility() != 8) {
                    canvas.save();
                    canvas.clipRect(0, org.telegram.messenger.g0.L((!zo0Var.d2 || zo0Var.k2[1] == null) ? 58.0f : 111.0f) + zo0Var.l2, getWidth(), getHeight());
                }
                super.draw(canvas);
                if (ek0Var.getVisibility() != 8) {
                    canvas.restore();
                    break;
                }
                break;
            default:
                zo0 zo0Var2 = this.g3;
                ek0 ek0Var2 = zo0Var2.A1;
                if (ek0Var2.getVisibility() != 8) {
                    canvas.save();
                    canvas.clipRect(0, org.telegram.messenger.g0.L((!zo0Var2.d2 || zo0Var2.k2[1] == null) ? 58.0f : 111.0f) + zo0Var2.l2, getWidth(), getHeight());
                }
                super.draw(canvas);
                if (ek0Var2.getVisibility() != 8) {
                    canvas.restore();
                    break;
                }
                break;
        }
    }
}
