package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class lq0 extends mm0 {
    public final /* synthetic */ int Y2;
    public final /* synthetic */ ir0 Z2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lq0(ir0 ir0Var, Context context, org.telegram.ui.ActionBar.g6 g6Var, int i10) {
        super(context, g6Var);
        this.Y2 = i10;
        this.Z2 = ir0Var;
    }

    @Override // org.telegram.ui.Components.mm0
    public final boolean E0(float f7) {
        switch (this.Y2) {
            case 0:
                ir0 ir0Var = this.Z2;
                if (f7 >= AndroidUtilities.dp((!ir0Var.i0 || ir0Var.p0[1] == null) ? 58.0f : 111.0f) + ir0Var.H0.b) {
                }
                break;
            default:
                ir0 ir0Var2 = this.Z2;
                if (f7 >= AndroidUtilities.dp((!ir0Var2.i0 || ir0Var2.p0[1] == null) ? 58.0f : 111.0f) + ir0Var2.H0.b) {
                }
                break;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void draw(Canvas canvas) {
        switch (this.Y2) {
            case 0:
                ir0 ir0Var = this.Z2;
                mm0 mm0Var = ir0Var.F;
                if (mm0Var.getVisibility() != 8) {
                    canvas.save();
                    canvas.clipRect(0, AndroidUtilities.dp((!ir0Var.i0 || ir0Var.p0[1] == null) ? 58.0f : 111.0f) + ir0Var.q0, getWidth(), getHeight());
                }
                super.draw(canvas);
                if (mm0Var.getVisibility() != 8) {
                    canvas.restore();
                    break;
                }
                break;
            default:
                ir0 ir0Var2 = this.Z2;
                mm0 mm0Var2 = ir0Var2.F;
                if (mm0Var2.getVisibility() != 8) {
                    canvas.save();
                    canvas.clipRect(0, AndroidUtilities.dp((!ir0Var2.i0 || ir0Var2.p0[1] == null) ? 58.0f : 111.0f) + ir0Var2.q0, getWidth(), getHeight());
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
