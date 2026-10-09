package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class oq0 extends qm0 {
    public final /* synthetic */ int V2;
    public final /* synthetic */ mr0 W2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oq0(mr0 mr0Var, Context context, org.telegram.ui.ActionBar.e6 e6Var, int i10) {
        super(context, e6Var);
        this.V2 = i10;
        this.W2 = mr0Var;
    }

    @Override // org.telegram.ui.Components.qm0
    public final boolean E0(float f7) {
        switch (this.V2) {
            case 0:
                mr0 mr0Var = this.W2;
                if (f7 >= AndroidUtilities.dp((!mr0Var.h0 || mr0Var.o0[1] == null) ? 58.0f : 111.0f) + mr0Var.G0.b) {
                }
                break;
            default:
                mr0 mr0Var2 = this.W2;
                if (f7 >= AndroidUtilities.dp((!mr0Var2.h0 || mr0Var2.o0[1] == null) ? 58.0f : 111.0f) + mr0Var2.G0.b) {
                }
                break;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void draw(Canvas canvas) {
        switch (this.V2) {
            case 0:
                mr0 mr0Var = this.W2;
                qm0 qm0Var = mr0Var.E;
                if (qm0Var.getVisibility() != 8) {
                    canvas.save();
                    canvas.clipRect(0, AndroidUtilities.dp((!mr0Var.h0 || mr0Var.o0[1] == null) ? 58.0f : 111.0f) + mr0Var.p0, getWidth(), getHeight());
                }
                super.draw(canvas);
                if (qm0Var.getVisibility() != 8) {
                    canvas.restore();
                    break;
                }
                break;
            default:
                mr0 mr0Var2 = this.W2;
                qm0 qm0Var2 = mr0Var2.E;
                if (qm0Var2.getVisibility() != 8) {
                    canvas.save();
                    canvas.clipRect(0, AndroidUtilities.dp((!mr0Var2.h0 || mr0Var2.o0[1] == null) ? 58.0f : 111.0f) + mr0Var2.p0, getWidth(), getHeight());
                }
                super.draw(canvas);
                if (qm0Var2.getVisibility() != 8) {
                    canvas.restore();
                    break;
                }
                break;
        }
    }
}
