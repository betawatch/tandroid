package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class so0 extends zk0 {
    public final /* synthetic */ int T2;
    public final /* synthetic */ sp0 U2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ so0(sp0 sp0Var, Context context, org.telegram.ui.ActionBar.c6 c6Var, int i10) {
        super(context, c6Var);
        this.T2 = i10;
        this.U2 = sp0Var;
    }

    @Override // org.telegram.ui.Components.zk0
    public final boolean E0(float f10) {
        switch (this.T2) {
            case 0:
                sp0 sp0Var = this.U2;
                if (f10 >= AndroidUtilities.dp((!sp0Var.d0 || sp0Var.k0[1] == null) ? 58.0f : 111.0f) + sp0Var.C0.b) {
                }
                break;
            default:
                sp0 sp0Var2 = this.U2;
                if (f10 >= AndroidUtilities.dp((!sp0Var2.d0 || sp0Var2.k0[1] == null) ? 58.0f : 111.0f) + sp0Var2.C0.b) {
                }
                break;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void draw(Canvas canvas) {
        switch (this.T2) {
            case 0:
                sp0 sp0Var = this.U2;
                zk0 zk0Var = sp0Var.A;
                if (zk0Var.getVisibility() != 8) {
                    canvas.save();
                    canvas.clipRect(0, AndroidUtilities.dp((!sp0Var.d0 || sp0Var.k0[1] == null) ? 58.0f : 111.0f) + sp0Var.l0, getWidth(), getHeight());
                }
                super.draw(canvas);
                if (zk0Var.getVisibility() != 8) {
                    canvas.restore();
                    break;
                }
                break;
            default:
                sp0 sp0Var2 = this.U2;
                zk0 zk0Var2 = sp0Var2.A;
                if (zk0Var2.getVisibility() != 8) {
                    canvas.save();
                    canvas.clipRect(0, AndroidUtilities.dp((!sp0Var2.d0 || sp0Var2.k0[1] == null) ? 58.0f : 111.0f) + sp0Var2.l0, getWidth(), getHeight());
                }
                super.draw(canvas);
                if (zk0Var2.getVisibility() != 8) {
                    canvas.restore();
                    break;
                }
                break;
        }
    }
}
