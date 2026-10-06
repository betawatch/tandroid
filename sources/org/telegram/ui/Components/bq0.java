package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final class bq0 extends zl0 {
    public final /* synthetic */ int e3;
    public final /* synthetic */ br0 f3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bq0(br0 br0Var, Context context, org.telegram.ui.ActionBar.d6 d6Var, int i10) {
        super(context, d6Var);
        this.e3 = i10;
        this.f3 = br0Var;
    }

    @Override // org.telegram.ui.Components.zl0
    public final boolean F0(float f7) {
        switch (this.e3) {
            case 0:
                br0 br0Var = this.f3;
                if (f7 >= AndroidUtilities.dp((!br0Var.h0 || br0Var.o0[1] == null) ? 58.0f : 111.0f) + br0Var.G0.b) {
                }
                break;
            default:
                br0 br0Var2 = this.f3;
                if (f7 >= AndroidUtilities.dp((!br0Var2.h0 || br0Var2.o0[1] == null) ? 58.0f : 111.0f) + br0Var2.G0.b) {
                }
                break;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void draw(Canvas canvas) {
        switch (this.e3) {
            case 0:
                br0 br0Var = this.f3;
                zl0 zl0Var = br0Var.E;
                if (zl0Var.getVisibility() != 8) {
                    canvas.save();
                    canvas.clipRect(0, AndroidUtilities.dp((!br0Var.h0 || br0Var.o0[1] == null) ? 58.0f : 111.0f) + br0Var.p0, getWidth(), getHeight());
                }
                super.draw(canvas);
                if (zl0Var.getVisibility() != 8) {
                    canvas.restore();
                    break;
                }
                break;
            default:
                br0 br0Var2 = this.f3;
                zl0 zl0Var2 = br0Var2.E;
                if (zl0Var2.getVisibility() != 8) {
                    canvas.save();
                    canvas.clipRect(0, AndroidUtilities.dp((!br0Var2.h0 || br0Var2.o0[1] == null) ? 58.0f : 111.0f) + br0Var2.p0, getWidth(), getHeight());
                }
                super.draw(canvas);
                if (zl0Var2.getVisibility() != 8) {
                    canvas.restore();
                    break;
                }
                break;
        }
    }
}
