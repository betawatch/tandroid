package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class oq0 extends nm0 {
    public final /* synthetic */ int f3;
    public final /* synthetic */ nr0 g3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oq0(nr0 nr0Var, Context context, org.telegram.ui.ActionBar.u6 u6Var, int i10) {
        super(context, u6Var);
        this.f3 = i10;
        this.g3 = nr0Var;
    }

    @Override // org.telegram.ui.Components.nm0
    public final boolean E0(float f7) {
        switch (this.f3) {
            case 0:
                nr0 nr0Var = this.g3;
                if (f7 >= AndroidUtilities.dp((!nr0Var.i0 || nr0Var.p0[1] == null) ? 58.0f : 111.0f) + nr0Var.H0.b) {
                }
                break;
            default:
                nr0 nr0Var2 = this.g3;
                if (f7 >= AndroidUtilities.dp((!nr0Var2.i0 || nr0Var2.p0[1] == null) ? 58.0f : 111.0f) + nr0Var2.H0.b) {
                }
                break;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void draw(Canvas canvas) {
        switch (this.f3) {
            case 0:
                nr0 nr0Var = this.g3;
                nm0 nm0Var = nr0Var.F;
                if (nm0Var.getVisibility() != 8) {
                    canvas.save();
                    canvas.clipRect(0, AndroidUtilities.dp((!nr0Var.i0 || nr0Var.p0[1] == null) ? 58.0f : 111.0f) + nr0Var.q0, getWidth(), getHeight());
                }
                super.draw(canvas);
                if (nm0Var.getVisibility() != 8) {
                    canvas.restore();
                    break;
                }
                break;
            default:
                nr0 nr0Var2 = this.g3;
                nm0 nm0Var2 = nr0Var2.F;
                if (nm0Var2.getVisibility() != 8) {
                    canvas.save();
                    canvas.clipRect(0, AndroidUtilities.dp((!nr0Var2.i0 || nr0Var2.p0[1] == null) ? 58.0f : 111.0f) + nr0Var2.q0, getWidth(), getHeight());
                }
                super.draw(canvas);
                if (nm0Var2.getVisibility() != 8) {
                    canvas.restore();
                    break;
                }
                break;
        }
    }
}
