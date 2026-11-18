package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class ao0 extends ck0 {
    public final /* synthetic */ int f3;
    public final /* synthetic */ yo0 g3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ao0(yo0 yo0Var, Context context, org.telegram.ui.ActionBar.i6 i6Var, int i7) {
        super(context, i6Var);
        this.f3 = i7;
        this.g3 = yo0Var;
    }

    @Override // org.telegram.ui.Components.ck0
    public final boolean E0(float f10) {
        switch (this.f3) {
            case 0:
                yo0 yo0Var = this.g3;
                if (f10 >= org.telegram.messenger.g0.L((!yo0Var.d2 || yo0Var.k2[1] == null) ? 58.0f : 111.0f) + yo0Var.C2.b) {
                }
                break;
            default:
                yo0 yo0Var2 = this.g3;
                if (f10 >= org.telegram.messenger.g0.L((!yo0Var2.d2 || yo0Var2.k2[1] == null) ? 58.0f : 111.0f) + yo0Var2.C2.b) {
                }
                break;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void draw(Canvas canvas) {
        switch (this.f3) {
            case 0:
                yo0 yo0Var = this.g3;
                ck0 ck0Var = yo0Var.A1;
                if (ck0Var.getVisibility() != 8) {
                    canvas.save();
                    canvas.clipRect(0, org.telegram.messenger.g0.L((!yo0Var.d2 || yo0Var.k2[1] == null) ? 58.0f : 111.0f) + yo0Var.l2, getWidth(), getHeight());
                }
                super.draw(canvas);
                if (ck0Var.getVisibility() != 8) {
                    canvas.restore();
                    break;
                }
                break;
            default:
                yo0 yo0Var2 = this.g3;
                ck0 ck0Var2 = yo0Var2.A1;
                if (ck0Var2.getVisibility() != 8) {
                    canvas.save();
                    canvas.clipRect(0, org.telegram.messenger.g0.L((!yo0Var2.d2 || yo0Var2.k2[1] == null) ? 58.0f : 111.0f) + yo0Var2.l2, getWidth(), getHeight());
                }
                super.draw(canvas);
                if (ck0Var2.getVisibility() != 8) {
                    canvas.restore();
                    break;
                }
                break;
        }
    }
}
