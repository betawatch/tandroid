package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class dp0 extends jl0 {
    public final /* synthetic */ int T2;
    public final /* synthetic */ dq0 U2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dp0(dq0 dq0Var, Context context, org.telegram.ui.ActionBar.c6 c6Var, int i10) {
        super(context, c6Var);
        this.T2 = i10;
        this.U2 = dq0Var;
    }

    @Override // org.telegram.ui.Components.jl0
    public final boolean E0(float f9) {
        switch (this.T2) {
            case 0:
                dq0 dq0Var = this.U2;
                if (f9 >= AndroidUtilities.dp((!dq0Var.d0 || dq0Var.k0[1] == null) ? 58.0f : 111.0f) + dq0Var.C0.b) {
                }
                break;
            default:
                dq0 dq0Var2 = this.U2;
                if (f9 >= AndroidUtilities.dp((!dq0Var2.d0 || dq0Var2.k0[1] == null) ? 58.0f : 111.0f) + dq0Var2.C0.b) {
                }
                break;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void draw(Canvas canvas) {
        switch (this.T2) {
            case 0:
                dq0 dq0Var = this.U2;
                jl0 jl0Var = dq0Var.A;
                if (jl0Var.getVisibility() != 8) {
                    canvas.save();
                    canvas.clipRect(0, AndroidUtilities.dp((!dq0Var.d0 || dq0Var.k0[1] == null) ? 58.0f : 111.0f) + dq0Var.l0, getWidth(), getHeight());
                }
                super.draw(canvas);
                if (jl0Var.getVisibility() != 8) {
                    canvas.restore();
                    break;
                }
                break;
            default:
                dq0 dq0Var2 = this.U2;
                jl0 jl0Var2 = dq0Var2.A;
                if (jl0Var2.getVisibility() != 8) {
                    canvas.save();
                    canvas.clipRect(0, AndroidUtilities.dp((!dq0Var2.d0 || dq0Var2.k0[1] == null) ? 58.0f : 111.0f) + dq0Var2.l0, getWidth(), getHeight());
                }
                super.draw(canvas);
                if (jl0Var2.getVisibility() != 8) {
                    canvas.restore();
                    break;
                }
                break;
        }
    }
}
