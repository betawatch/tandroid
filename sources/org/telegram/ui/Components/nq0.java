package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class nq0 extends mm0 {
    public final /* synthetic */ int f3;
    public final /* synthetic */ mr0 g3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nq0(mr0 mr0Var, Context context, org.telegram.ui.ActionBar.u6 u6Var, int i10) {
        super(context, u6Var);
        this.f3 = i10;
        this.g3 = mr0Var;
    }

    @Override // org.telegram.ui.Components.mm0
    public final boolean E0(float f7) {
        switch (this.f3) {
            case 0:
                mr0 mr0Var = this.g3;
                if (f7 >= AndroidUtilities.dp((!mr0Var.i0 || mr0Var.p0[1] == null) ? 58.0f : 111.0f) + mr0Var.H0.b) {
                }
                break;
            default:
                mr0 mr0Var2 = this.g3;
                if (f7 >= AndroidUtilities.dp((!mr0Var2.i0 || mr0Var2.p0[1] == null) ? 58.0f : 111.0f) + mr0Var2.H0.b) {
                }
                break;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void draw(Canvas canvas) {
        switch (this.f3) {
            case 0:
                mr0 mr0Var = this.g3;
                mm0 mm0Var = mr0Var.F;
                if (mm0Var.getVisibility() != 8) {
                    canvas.save();
                    canvas.clipRect(0, AndroidUtilities.dp((!mr0Var.i0 || mr0Var.p0[1] == null) ? 58.0f : 111.0f) + mr0Var.q0, getWidth(), getHeight());
                }
                super.draw(canvas);
                if (mm0Var.getVisibility() != 8) {
                    canvas.restore();
                    break;
                }
                break;
            default:
                mr0 mr0Var2 = this.g3;
                mm0 mm0Var2 = mr0Var2.F;
                if (mm0Var2.getVisibility() != 8) {
                    canvas.save();
                    canvas.clipRect(0, AndroidUtilities.dp((!mr0Var2.i0 || mr0Var2.p0[1] == null) ? 58.0f : 111.0f) + mr0Var2.q0, getWidth(), getHeight());
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
