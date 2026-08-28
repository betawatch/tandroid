package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class so0 extends wk0 {
    public final /* synthetic */ int T2;
    public final /* synthetic */ rp0 U2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ so0(rp0 rp0Var, Context context, org.telegram.ui.ActionBar.b6 b6Var, int i9) {
        super(context, b6Var);
        this.T2 = i9;
        this.U2 = rp0Var;
    }

    @Override // org.telegram.ui.Components.wk0
    public final boolean E0(float f10) {
        switch (this.T2) {
            case 0:
                rp0 rp0Var = this.U2;
                if (f10 >= AndroidUtilities.dp((!rp0Var.d0 || rp0Var.k0[1] == null) ? 58.0f : 111.0f) + rp0Var.C0.b) {
                }
                break;
            default:
                rp0 rp0Var2 = this.U2;
                if (f10 >= AndroidUtilities.dp((!rp0Var2.d0 || rp0Var2.k0[1] == null) ? 58.0f : 111.0f) + rp0Var2.C0.b) {
                }
                break;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void draw(Canvas canvas) {
        switch (this.T2) {
            case 0:
                rp0 rp0Var = this.U2;
                wk0 wk0Var = rp0Var.A;
                if (wk0Var.getVisibility() != 8) {
                    canvas.save();
                    canvas.clipRect(0, AndroidUtilities.dp((!rp0Var.d0 || rp0Var.k0[1] == null) ? 58.0f : 111.0f) + rp0Var.l0, getWidth(), getHeight());
                }
                super.draw(canvas);
                if (wk0Var.getVisibility() != 8) {
                    canvas.restore();
                    break;
                }
                break;
            default:
                rp0 rp0Var2 = this.U2;
                wk0 wk0Var2 = rp0Var2.A;
                if (wk0Var2.getVisibility() != 8) {
                    canvas.save();
                    canvas.clipRect(0, AndroidUtilities.dp((!rp0Var2.d0 || rp0Var2.k0[1] == null) ? 58.0f : 111.0f) + rp0Var2.l0, getWidth(), getHeight());
                }
                super.draw(canvas);
                if (wk0Var2.getVisibility() != 8) {
                    canvas.restore();
                    break;
                }
                break;
        }
    }
}
