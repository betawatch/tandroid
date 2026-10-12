package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class lq0 extends mm0 {
    public final /* synthetic */ int V2;
    public final /* synthetic */ jr0 W2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lq0(jr0 jr0Var, Context context, org.telegram.ui.ActionBar.c6 c6Var, int i10) {
        super(context, c6Var);
        this.V2 = i10;
        this.W2 = jr0Var;
    }

    @Override // org.telegram.ui.Components.mm0
    public final boolean E0(float f7) {
        switch (this.V2) {
            case 0:
                jr0 jr0Var = this.W2;
                if (f7 >= AndroidUtilities.dp((!jr0Var.h0 || jr0Var.o0[1] == null) ? 58.0f : 111.0f) + jr0Var.G0.b) {
                }
                break;
            default:
                jr0 jr0Var2 = this.W2;
                if (f7 >= AndroidUtilities.dp((!jr0Var2.h0 || jr0Var2.o0[1] == null) ? 58.0f : 111.0f) + jr0Var2.G0.b) {
                }
                break;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void draw(Canvas canvas) {
        switch (this.V2) {
            case 0:
                jr0 jr0Var = this.W2;
                mm0 mm0Var = jr0Var.E;
                if (mm0Var.getVisibility() != 8) {
                    canvas.save();
                    canvas.clipRect(0, AndroidUtilities.dp((!jr0Var.h0 || jr0Var.o0[1] == null) ? 58.0f : 111.0f) + jr0Var.p0, getWidth(), getHeight());
                }
                super.draw(canvas);
                if (mm0Var.getVisibility() != 8) {
                    canvas.restore();
                    break;
                }
                break;
            default:
                jr0 jr0Var2 = this.W2;
                mm0 mm0Var2 = jr0Var2.E;
                if (mm0Var2.getVisibility() != 8) {
                    canvas.save();
                    canvas.clipRect(0, AndroidUtilities.dp((!jr0Var2.h0 || jr0Var2.o0[1] == null) ? 58.0f : 111.0f) + jr0Var2.p0, getWidth(), getHeight());
                }
                super.draw(canvas);
                if (mm0Var2.getVisibility() != 8) {
                    canvas.restore();
                    break;
                }
                break;
        }
    }
}
