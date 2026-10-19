package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class gq0 extends im0 {
    public final /* synthetic */ int V2;
    public final /* synthetic */ er0 W2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gq0(er0 er0Var, Context context, org.telegram.ui.ActionBar.d6 d6Var, int i10) {
        super(context, d6Var);
        this.V2 = i10;
        this.W2 = er0Var;
    }

    @Override // org.telegram.ui.Components.im0
    public final boolean E0(float f7) {
        switch (this.V2) {
            case 0:
                er0 er0Var = this.W2;
                if (f7 >= AndroidUtilities.dp((!er0Var.i0 || er0Var.p0[1] == null) ? 58.0f : 111.0f) + er0Var.H0.b) {
                }
                break;
            default:
                er0 er0Var2 = this.W2;
                if (f7 >= AndroidUtilities.dp((!er0Var2.i0 || er0Var2.p0[1] == null) ? 58.0f : 111.0f) + er0Var2.H0.b) {
                }
                break;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void draw(Canvas canvas) {
        switch (this.V2) {
            case 0:
                er0 er0Var = this.W2;
                im0 im0Var = er0Var.F;
                if (im0Var.getVisibility() != 8) {
                    canvas.save();
                    canvas.clipRect(0, AndroidUtilities.dp((!er0Var.i0 || er0Var.p0[1] == null) ? 58.0f : 111.0f) + er0Var.q0, getWidth(), getHeight());
                }
                super.draw(canvas);
                if (im0Var.getVisibility() != 8) {
                    canvas.restore();
                    break;
                }
                break;
            default:
                er0 er0Var2 = this.W2;
                im0 im0Var2 = er0Var2.F;
                if (im0Var2.getVisibility() != 8) {
                    canvas.save();
                    canvas.clipRect(0, AndroidUtilities.dp((!er0Var2.i0 || er0Var2.p0[1] == null) ? 58.0f : 111.0f) + er0Var2.q0, getWidth(), getHeight());
                }
                super.draw(canvas);
                if (im0Var2.getVisibility() != 8) {
                    canvas.restore();
                    break;
                }
                break;
        }
    }
}
