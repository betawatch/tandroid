package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class np0 extends tl0 {
    public final /* synthetic */ int U2;
    public final /* synthetic */ mq0 V2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ np0(mq0 mq0Var, Context context, org.telegram.ui.ActionBar.g6 g6Var, int i10) {
        super(context, g6Var);
        this.U2 = i10;
        this.V2 = mq0Var;
    }

    @Override // org.telegram.ui.Components.tl0
    public final boolean E0(float f10) {
        switch (this.U2) {
            case 0:
                mq0 mq0Var = this.V2;
                if (f10 >= AndroidUtilities.dp((!mq0Var.e0 || mq0Var.l0[1] == null) ? 58.0f : 111.0f) + mq0Var.D0.b) {
                }
                break;
            default:
                mq0 mq0Var2 = this.V2;
                if (f10 >= AndroidUtilities.dp((!mq0Var2.e0 || mq0Var2.l0[1] == null) ? 58.0f : 111.0f) + mq0Var2.D0.b) {
                }
                break;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void draw(Canvas canvas) {
        switch (this.U2) {
            case 0:
                mq0 mq0Var = this.V2;
                tl0 tl0Var = mq0Var.B;
                if (tl0Var.getVisibility() != 8) {
                    canvas.save();
                    canvas.clipRect(0, AndroidUtilities.dp((!mq0Var.e0 || mq0Var.l0[1] == null) ? 58.0f : 111.0f) + mq0Var.m0, getWidth(), getHeight());
                }
                super.draw(canvas);
                if (tl0Var.getVisibility() != 8) {
                    canvas.restore();
                    break;
                }
                break;
            default:
                mq0 mq0Var2 = this.V2;
                tl0 tl0Var2 = mq0Var2.B;
                if (tl0Var2.getVisibility() != 8) {
                    canvas.save();
                    canvas.clipRect(0, AndroidUtilities.dp((!mq0Var2.e0 || mq0Var2.l0[1] == null) ? 58.0f : 111.0f) + mq0Var2.m0, getWidth(), getHeight());
                }
                super.draw(canvas);
                if (tl0Var2.getVisibility() != 8) {
                    canvas.restore();
                    break;
                }
                break;
        }
    }
}
