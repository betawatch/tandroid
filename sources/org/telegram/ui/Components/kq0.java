package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class kq0 extends mm0 {
    public final /* synthetic */ int V2;
    public final /* synthetic */ ir0 W2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kq0(ir0 ir0Var, Context context, org.telegram.ui.ActionBar.c6 c6Var, int i10) {
        super(context, c6Var);
        this.V2 = i10;
        this.W2 = ir0Var;
    }

    @Override // org.telegram.ui.Components.mm0
    public final boolean E0(float f7) {
        switch (this.V2) {
            case 0:
                ir0 ir0Var = this.W2;
                if (f7 >= AndroidUtilities.dp((!ir0Var.h0 || ir0Var.o0[1] == null) ? 58.0f : 111.0f) + ir0Var.G0.b) {
                }
                break;
            default:
                ir0 ir0Var2 = this.W2;
                if (f7 >= AndroidUtilities.dp((!ir0Var2.h0 || ir0Var2.o0[1] == null) ? 58.0f : 111.0f) + ir0Var2.G0.b) {
                }
                break;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void draw(Canvas canvas) {
        switch (this.V2) {
            case 0:
                ir0 ir0Var = this.W2;
                mm0 mm0Var = ir0Var.E;
                if (mm0Var.getVisibility() != 8) {
                    canvas.save();
                    canvas.clipRect(0, AndroidUtilities.dp((!ir0Var.h0 || ir0Var.o0[1] == null) ? 58.0f : 111.0f) + ir0Var.p0, getWidth(), getHeight());
                }
                super.draw(canvas);
                if (mm0Var.getVisibility() != 8) {
                    canvas.restore();
                    break;
                }
                break;
            default:
                ir0 ir0Var2 = this.W2;
                mm0 mm0Var2 = ir0Var2.E;
                if (mm0Var2.getVisibility() != 8) {
                    canvas.save();
                    canvas.clipRect(0, AndroidUtilities.dp((!ir0Var2.h0 || ir0Var2.o0[1] == null) ? 58.0f : 111.0f) + ir0Var2.p0, getWidth(), getHeight());
                }
                super.draw(canvas);
                if (mm0Var2.getVisibility() != 8) {
                    canvas.restore();
                    break;
                }
                break;
        }
    }
}
