package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class jp0 extends ml0 {
    public final /* synthetic */ int X2;
    public final /* synthetic */ hq0 Y2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jp0(hq0 hq0Var, Context context, org.telegram.ui.ActionBar.d6 d6Var, int i10) {
        super(context, d6Var);
        this.X2 = i10;
        this.Y2 = hq0Var;
    }

    @Override // org.telegram.ui.Components.ml0
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
                ml0 ml0Var = hq0Var.E;
                if (ml0Var.getVisibility() != 8) {
                    canvas.save();
                    canvas.clipRect(0, AndroidUtilities.dp((!hq0Var.h0 || hq0Var.o0[1] == null) ? 58.0f : 111.0f) + hq0Var.p0, getWidth(), getHeight());
                }
                super.draw(canvas);
                if (ml0Var.getVisibility() != 8) {
                    canvas.restore();
                    break;
                }
                break;
            default:
                hq0 hq0Var2 = this.Y2;
                ml0 ml0Var2 = hq0Var2.E;
                if (ml0Var2.getVisibility() != 8) {
                    canvas.save();
                    canvas.clipRect(0, AndroidUtilities.dp((!hq0Var2.h0 || hq0Var2.o0[1] == null) ? 58.0f : 111.0f) + hq0Var2.p0, getWidth(), getHeight());
                }
                super.draw(canvas);
                if (ml0Var2.getVisibility() != 8) {
                    canvas.restore();
                    break;
                }
                break;
        }
    }
}
