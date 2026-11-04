package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class qn0 extends tj0 {
    public final /* synthetic */ int f3;
    public final /* synthetic */ oo0 g3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qn0(oo0 oo0Var, Context context, org.telegram.ui.ActionBar.e6 e6Var, int i3) {
        super(context, e6Var);
        this.f3 = i3;
        this.g3 = oo0Var;
    }

    @Override // org.telegram.ui.Components.tj0
    public final boolean E0(float f10) {
        switch (this.f3) {
            case 0:
                oo0 oo0Var = this.g3;
                if (f10 >= org.telegram.messenger.g0.L((!oo0Var.a2 || oo0Var.h2[1] == null) ? 58.0f : 111.0f) + oo0Var.z2.b) {
                }
                break;
            default:
                oo0 oo0Var2 = this.g3;
                if (f10 >= org.telegram.messenger.g0.L((!oo0Var2.a2 || oo0Var2.h2[1] == null) ? 58.0f : 111.0f) + oo0Var2.z2.b) {
                }
                break;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void draw(Canvas canvas) {
        switch (this.f3) {
            case 0:
                oo0 oo0Var = this.g3;
                tj0 tj0Var = oo0Var.x1;
                if (tj0Var.getVisibility() != 8) {
                    canvas.save();
                    canvas.clipRect(0, org.telegram.messenger.g0.L((!oo0Var.a2 || oo0Var.h2[1] == null) ? 58.0f : 111.0f) + oo0Var.i2, getWidth(), getHeight());
                }
                super.draw(canvas);
                if (tj0Var.getVisibility() != 8) {
                    canvas.restore();
                    break;
                }
                break;
            default:
                oo0 oo0Var2 = this.g3;
                tj0 tj0Var2 = oo0Var2.x1;
                if (tj0Var2.getVisibility() != 8) {
                    canvas.save();
                    canvas.clipRect(0, org.telegram.messenger.g0.L((!oo0Var2.a2 || oo0Var2.h2[1] == null) ? 58.0f : 111.0f) + oo0Var2.i2, getWidth(), getHeight());
                }
                super.draw(canvas);
                if (tj0Var2.getVisibility() != 8) {
                    canvas.restore();
                    break;
                }
                break;
        }
    }
}
