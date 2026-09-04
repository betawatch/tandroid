package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class jp0 extends ll0 {
    public final /* synthetic */ int X2;
    public final /* synthetic */ hq0 Y2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jp0(hq0 hq0Var, Context context, org.telegram.ui.ActionBar.f6 f6Var, int i10) {
        super(context, f6Var);
        this.X2 = i10;
        this.Y2 = hq0Var;
    }

    @Override // org.telegram.ui.Components.ll0
    public final boolean E0(float f7) {
        switch (this.X2) {
            case 0:
                hq0 hq0Var = this.Y2;
                if (f7 >= AndroidUtilities.dp((!hq0Var.h0 || hq0Var.o0[1] == null) ? 58.0f : 111.0f) + hq0Var.G0.b) {
                }
                break;
            default:
                hq0 hq0Var2 = this.Y2;
                if (f7 >= AndroidUtilities.dp((!hq0Var2.h0 || hq0Var2.o0[1] == null) ? 58.0f : 111.0f) + hq0Var2.G0.b) {
                }
                break;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void draw(Canvas canvas) {
        switch (this.X2) {
            case 0:
                hq0 hq0Var = this.Y2;
                ll0 ll0Var = hq0Var.E;
                if (ll0Var.getVisibility() != 8) {
                    canvas.save();
                    canvas.clipRect(0, AndroidUtilities.dp((!hq0Var.h0 || hq0Var.o0[1] == null) ? 58.0f : 111.0f) + hq0Var.p0, getWidth(), getHeight());
                }
                super.draw(canvas);
                if (ll0Var.getVisibility() != 8) {
                    canvas.restore();
                    break;
                }
                break;
            default:
                hq0 hq0Var2 = this.Y2;
                ll0 ll0Var2 = hq0Var2.E;
                if (ll0Var2.getVisibility() != 8) {
                    canvas.save();
                    canvas.clipRect(0, AndroidUtilities.dp((!hq0Var2.h0 || hq0Var2.o0[1] == null) ? 58.0f : 111.0f) + hq0Var2.p0, getWidth(), getHeight());
                }
                super.draw(canvas);
                if (ll0Var2.getVisibility() != 8) {
                    canvas.restore();
                    break;
                }
                break;
        }
    }
}
