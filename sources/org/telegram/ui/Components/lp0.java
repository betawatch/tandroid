package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class lp0 extends rl0 {
    public final /* synthetic */ int U2;
    public final /* synthetic */ lq0 V2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lp0(lq0 lq0Var, Context context, org.telegram.ui.ActionBar.f6 f6Var, int i10) {
        super(context, f6Var);
        this.U2 = i10;
        this.V2 = lq0Var;
    }

    @Override // org.telegram.ui.Components.rl0
    public final boolean E0(float f10) {
        switch (this.U2) {
            case 0:
                lq0 lq0Var = this.V2;
                if (f10 >= AndroidUtilities.dp((!lq0Var.e0 || lq0Var.l0[1] == null) ? 58.0f : 111.0f) + lq0Var.D0.b) {
                }
                break;
            default:
                lq0 lq0Var2 = this.V2;
                if (f10 >= AndroidUtilities.dp((!lq0Var2.e0 || lq0Var2.l0[1] == null) ? 58.0f : 111.0f) + lq0Var2.D0.b) {
                }
                break;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void draw(Canvas canvas) {
        switch (this.U2) {
            case 0:
                lq0 lq0Var = this.V2;
                rl0 rl0Var = lq0Var.B;
                if (rl0Var.getVisibility() != 8) {
                    canvas.save();
                    canvas.clipRect(0, AndroidUtilities.dp((!lq0Var.e0 || lq0Var.l0[1] == null) ? 58.0f : 111.0f) + lq0Var.m0, getWidth(), getHeight());
                }
                super.draw(canvas);
                if (rl0Var.getVisibility() != 8) {
                    canvas.restore();
                    break;
                }
                break;
            default:
                lq0 lq0Var2 = this.V2;
                rl0 rl0Var2 = lq0Var2.B;
                if (rl0Var2.getVisibility() != 8) {
                    canvas.save();
                    canvas.clipRect(0, AndroidUtilities.dp((!lq0Var2.e0 || lq0Var2.l0[1] == null) ? 58.0f : 111.0f) + lq0Var2.m0, getWidth(), getHeight());
                }
                super.draw(canvas);
                if (rl0Var2.getVisibility() != 8) {
                    canvas.restore();
                    break;
                }
                break;
        }
    }
}
