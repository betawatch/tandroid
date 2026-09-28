package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final class yp0 extends yl0 {
    public final /* synthetic */ int X2;
    public final /* synthetic */ wq0 Y2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yp0(wq0 wq0Var, Context context, org.telegram.ui.ActionBar.d6 d6Var, int i10) {
        super(context, d6Var);
        this.X2 = i10;
        this.Y2 = wq0Var;
    }

    @Override // org.telegram.ui.Components.yl0
    public final boolean E0(float f7) {
        switch (this.X2) {
            case 0:
                wq0 wq0Var = this.Y2;
                if (f7 >= AndroidUtilities.dp((!wq0Var.h0 || wq0Var.o0[1] == null) ? 58.0f : 111.0f) + wq0Var.G0.b) {
                }
                break;
            default:
                wq0 wq0Var2 = this.Y2;
                if (f7 >= AndroidUtilities.dp((!wq0Var2.h0 || wq0Var2.o0[1] == null) ? 58.0f : 111.0f) + wq0Var2.G0.b) {
                }
                break;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void draw(Canvas canvas) {
        switch (this.X2) {
            case 0:
                wq0 wq0Var = this.Y2;
                yl0 yl0Var = wq0Var.E;
                if (yl0Var.getVisibility() != 8) {
                    canvas.save();
                    canvas.clipRect(0, AndroidUtilities.dp((!wq0Var.h0 || wq0Var.o0[1] == null) ? 58.0f : 111.0f) + wq0Var.p0, getWidth(), getHeight());
                }
                super.draw(canvas);
                if (yl0Var.getVisibility() != 8) {
                    canvas.restore();
                    break;
                }
                break;
            default:
                wq0 wq0Var2 = this.Y2;
                yl0 yl0Var2 = wq0Var2.E;
                if (yl0Var2.getVisibility() != 8) {
                    canvas.save();
                    canvas.clipRect(0, AndroidUtilities.dp((!wq0Var2.h0 || wq0Var2.o0[1] == null) ? 58.0f : 111.0f) + wq0Var2.p0, getWidth(), getHeight());
                }
                super.draw(canvas);
                if (yl0Var2.getVisibility() != 8) {
                    canvas.restore();
                    break;
                }
                break;
        }
    }
}
