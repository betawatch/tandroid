package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class kp0 extends ml0 {
    public final /* synthetic */ int X2;
    public final /* synthetic */ iq0 Y2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kp0(iq0 iq0Var, Context context, org.telegram.ui.ActionBar.f6 f6Var, int i10) {
        super(context, f6Var);
        this.X2 = i10;
        this.Y2 = iq0Var;
    }

    @Override // org.telegram.ui.Components.ml0
    public final boolean F0(float f7) {
        switch (this.X2) {
            case 0:
                iq0 iq0Var = this.Y2;
                if (f7 >= AndroidUtilities.dp((!iq0Var.h0 || iq0Var.o0[1] == null) ? 58.0f : 111.0f) + iq0Var.G0.b) {
                }
                break;
            default:
                iq0 iq0Var2 = this.Y2;
                if (f7 >= AndroidUtilities.dp((!iq0Var2.h0 || iq0Var2.o0[1] == null) ? 58.0f : 111.0f) + iq0Var2.G0.b) {
                }
                break;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void draw(Canvas canvas) {
        switch (this.X2) {
            case 0:
                iq0 iq0Var = this.Y2;
                ml0 ml0Var = iq0Var.E;
                if (ml0Var.getVisibility() != 8) {
                    canvas.save();
                    canvas.clipRect(0, AndroidUtilities.dp((!iq0Var.h0 || iq0Var.o0[1] == null) ? 58.0f : 111.0f) + iq0Var.p0, getWidth(), getHeight());
                }
                super.draw(canvas);
                if (ml0Var.getVisibility() != 8) {
                    canvas.restore();
                    break;
                }
                break;
            default:
                iq0 iq0Var2 = this.Y2;
                ml0 ml0Var2 = iq0Var2.E;
                if (ml0Var2.getVisibility() != 8) {
                    canvas.save();
                    canvas.clipRect(0, AndroidUtilities.dp((!iq0Var2.h0 || iq0Var2.o0[1] == null) ? 58.0f : 111.0f) + iq0Var2.p0, getWidth(), getHeight());
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
