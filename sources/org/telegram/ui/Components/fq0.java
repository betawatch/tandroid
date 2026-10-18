package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class fq0 extends im0 {
    public final /* synthetic */ int V2;
    public final /* synthetic */ dr0 W2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fq0(dr0 dr0Var, Context context, org.telegram.ui.ActionBar.d6 d6Var, int i10) {
        super(context, d6Var);
        this.V2 = i10;
        this.W2 = dr0Var;
    }

    @Override // org.telegram.ui.Components.im0
    public final boolean E0(float f7) {
        switch (this.V2) {
            case 0:
                dr0 dr0Var = this.W2;
                if (f7 >= AndroidUtilities.dp((!dr0Var.h0 || dr0Var.o0[1] == null) ? 58.0f : 111.0f) + dr0Var.G0.b) {
                }
                break;
            default:
                dr0 dr0Var2 = this.W2;
                if (f7 >= AndroidUtilities.dp((!dr0Var2.h0 || dr0Var2.o0[1] == null) ? 58.0f : 111.0f) + dr0Var2.G0.b) {
                }
                break;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void draw(Canvas canvas) {
        switch (this.V2) {
            case 0:
                dr0 dr0Var = this.W2;
                im0 im0Var = dr0Var.E;
                if (im0Var.getVisibility() != 8) {
                    canvas.save();
                    canvas.clipRect(0, AndroidUtilities.dp((!dr0Var.h0 || dr0Var.o0[1] == null) ? 58.0f : 111.0f) + dr0Var.p0, getWidth(), getHeight());
                }
                super.draw(canvas);
                if (im0Var.getVisibility() != 8) {
                    canvas.restore();
                    break;
                }
                break;
            default:
                dr0 dr0Var2 = this.W2;
                im0 im0Var2 = dr0Var2.E;
                if (im0Var2.getVisibility() != 8) {
                    canvas.save();
                    canvas.clipRect(0, AndroidUtilities.dp((!dr0Var2.h0 || dr0Var2.o0[1] == null) ? 58.0f : 111.0f) + dr0Var2.p0, getWidth(), getHeight());
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
