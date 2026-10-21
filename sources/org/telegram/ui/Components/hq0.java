package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class hq0 extends jm0 {
    public final /* synthetic */ int V2;
    public final /* synthetic */ fr0 W2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hq0(fr0 fr0Var, Context context, org.telegram.ui.ActionBar.d6 d6Var, int i10) {
        super(context, d6Var);
        this.V2 = i10;
        this.W2 = fr0Var;
    }

    @Override // org.telegram.ui.Components.jm0
    public final boolean E0(float f7) {
        switch (this.V2) {
            case 0:
                fr0 fr0Var = this.W2;
                if (f7 >= AndroidUtilities.dp((!fr0Var.i0 || fr0Var.p0[1] == null) ? 58.0f : 111.0f) + fr0Var.H0.b) {
                }
                break;
            default:
                fr0 fr0Var2 = this.W2;
                if (f7 >= AndroidUtilities.dp((!fr0Var2.i0 || fr0Var2.p0[1] == null) ? 58.0f : 111.0f) + fr0Var2.H0.b) {
                }
                break;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void draw(Canvas canvas) {
        switch (this.V2) {
            case 0:
                fr0 fr0Var = this.W2;
                jm0 jm0Var = fr0Var.F;
                if (jm0Var.getVisibility() != 8) {
                    canvas.save();
                    canvas.clipRect(0, AndroidUtilities.dp((!fr0Var.i0 || fr0Var.p0[1] == null) ? 58.0f : 111.0f) + fr0Var.q0, getWidth(), getHeight());
                }
                super.draw(canvas);
                if (jm0Var.getVisibility() != 8) {
                    canvas.restore();
                    break;
                }
                break;
            default:
                fr0 fr0Var2 = this.W2;
                jm0 jm0Var2 = fr0Var2.F;
                if (jm0Var2.getVisibility() != 8) {
                    canvas.save();
                    canvas.clipRect(0, AndroidUtilities.dp((!fr0Var2.i0 || fr0Var2.p0[1] == null) ? 58.0f : 111.0f) + fr0Var2.q0, getWidth(), getHeight());
                }
                super.draw(canvas);
                if (jm0Var2.getVisibility() != 8) {
                    canvas.restore();
                    break;
                }
                break;
        }
    }
}
