package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class tp0 extends vl0 {
    public final /* synthetic */ int X2;
    public final /* synthetic */ sq0 Y2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tp0(sq0 sq0Var, Context context, org.telegram.ui.ActionBar.f6 f6Var, int i10) {
        super(context, f6Var);
        this.X2 = i10;
        this.Y2 = sq0Var;
    }

    @Override // org.telegram.ui.Components.vl0
    public final boolean E0(float f7) {
        switch (this.X2) {
            case 0:
                sq0 sq0Var = this.Y2;
                if (f7 >= AndroidUtilities.dp((!sq0Var.h0 || sq0Var.o0[1] == null) ? 58.0f : 111.0f) + sq0Var.G0.b) {
                }
                break;
            default:
                sq0 sq0Var2 = this.Y2;
                if (f7 >= AndroidUtilities.dp((!sq0Var2.h0 || sq0Var2.o0[1] == null) ? 58.0f : 111.0f) + sq0Var2.G0.b) {
                }
                break;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void draw(Canvas canvas) {
        switch (this.X2) {
            case 0:
                sq0 sq0Var = this.Y2;
                vl0 vl0Var = sq0Var.E;
                if (vl0Var.getVisibility() != 8) {
                    canvas.save();
                    canvas.clipRect(0, AndroidUtilities.dp((!sq0Var.h0 || sq0Var.o0[1] == null) ? 58.0f : 111.0f) + sq0Var.p0, getWidth(), getHeight());
                }
                super.draw(canvas);
                if (vl0Var.getVisibility() != 8) {
                    canvas.restore();
                    break;
                }
                break;
            default:
                sq0 sq0Var2 = this.Y2;
                vl0 vl0Var2 = sq0Var2.E;
                if (vl0Var2.getVisibility() != 8) {
                    canvas.save();
                    canvas.clipRect(0, AndroidUtilities.dp((!sq0Var2.h0 || sq0Var2.o0[1] == null) ? 58.0f : 111.0f) + sq0Var2.p0, getWidth(), getHeight());
                }
                super.draw(canvas);
                if (vl0Var2.getVisibility() != 8) {
                    canvas.restore();
                    break;
                }
                break;
        }
    }
}
