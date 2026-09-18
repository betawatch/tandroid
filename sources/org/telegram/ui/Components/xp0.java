package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class xp0 extends wl0 {
    public final /* synthetic */ int X2;
    public final /* synthetic */ vq0 Y2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xp0(vq0 vq0Var, Context context, org.telegram.ui.ActionBar.e6 e6Var, int i10) {
        super(context, e6Var);
        this.X2 = i10;
        this.Y2 = vq0Var;
    }

    @Override // org.telegram.ui.Components.wl0
    public final boolean F0(float f7) {
        switch (this.X2) {
            case 0:
                vq0 vq0Var = this.Y2;
                if (f7 >= AndroidUtilities.dp((!vq0Var.h0 || vq0Var.o0[1] == null) ? 58.0f : 111.0f) + vq0Var.G0.b) {
                }
                break;
            default:
                vq0 vq0Var2 = this.Y2;
                if (f7 >= AndroidUtilities.dp((!vq0Var2.h0 || vq0Var2.o0[1] == null) ? 58.0f : 111.0f) + vq0Var2.G0.b) {
                }
                break;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void draw(Canvas canvas) {
        switch (this.X2) {
            case 0:
                vq0 vq0Var = this.Y2;
                wl0 wl0Var = vq0Var.E;
                if (wl0Var.getVisibility() != 8) {
                    canvas.save();
                    canvas.clipRect(0, AndroidUtilities.dp((!vq0Var.h0 || vq0Var.o0[1] == null) ? 58.0f : 111.0f) + vq0Var.p0, getWidth(), getHeight());
                }
                super.draw(canvas);
                if (wl0Var.getVisibility() != 8) {
                    canvas.restore();
                    break;
                }
                break;
            default:
                vq0 vq0Var2 = this.Y2;
                wl0 wl0Var2 = vq0Var2.E;
                if (wl0Var2.getVisibility() != 8) {
                    canvas.save();
                    canvas.clipRect(0, AndroidUtilities.dp((!vq0Var2.h0 || vq0Var2.o0[1] == null) ? 58.0f : 111.0f) + vq0Var2.p0, getWidth(), getHeight());
                }
                super.draw(canvas);
                if (wl0Var2.getVisibility() != 8) {
                    canvas.restore();
                    break;
                }
                break;
        }
    }
}
