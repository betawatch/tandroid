package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class wp0 extends vl0 {
    public final /* synthetic */ int X2;
    public final /* synthetic */ uq0 Y2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wp0(uq0 uq0Var, Context context, org.telegram.ui.ActionBar.f6 f6Var, int i10) {
        super(context, f6Var);
        this.X2 = i10;
        this.Y2 = uq0Var;
    }

    @Override // org.telegram.ui.Components.vl0
    public final boolean F0(float f7) {
        switch (this.X2) {
            case 0:
                uq0 uq0Var = this.Y2;
                if (f7 >= AndroidUtilities.dp((!uq0Var.h0 || uq0Var.o0[1] == null) ? 58.0f : 111.0f) + uq0Var.G0.b) {
                }
                break;
            default:
                uq0 uq0Var2 = this.Y2;
                if (f7 >= AndroidUtilities.dp((!uq0Var2.h0 || uq0Var2.o0[1] == null) ? 58.0f : 111.0f) + uq0Var2.G0.b) {
                }
                break;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void draw(Canvas canvas) {
        switch (this.X2) {
            case 0:
                uq0 uq0Var = this.Y2;
                vl0 vl0Var = uq0Var.E;
                if (vl0Var.getVisibility() != 8) {
                    canvas.save();
                    canvas.clipRect(0, AndroidUtilities.dp((!uq0Var.h0 || uq0Var.o0[1] == null) ? 58.0f : 111.0f) + uq0Var.p0, getWidth(), getHeight());
                }
                super.draw(canvas);
                if (vl0Var.getVisibility() != 8) {
                    canvas.restore();
                    break;
                }
                break;
            default:
                uq0 uq0Var2 = this.Y2;
                vl0 vl0Var2 = uq0Var2.E;
                if (vl0Var2.getVisibility() != 8) {
                    canvas.save();
                    canvas.clipRect(0, AndroidUtilities.dp((!uq0Var2.h0 || uq0Var2.o0[1] == null) ? 58.0f : 111.0f) + uq0Var2.p0, getWidth(), getHeight());
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
