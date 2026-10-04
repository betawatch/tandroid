package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class aq0 extends zl0 {
    public final /* synthetic */ int e3;
    public final /* synthetic */ zq0 f3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ aq0(zq0 zq0Var, Context context, org.telegram.ui.ActionBar.d6 d6Var, int i10) {
        super(context, d6Var);
        this.e3 = i10;
        this.f3 = zq0Var;
    }

    @Override // org.telegram.ui.Components.zl0
    public final boolean F0(float f7) {
        switch (this.e3) {
            case 0:
                zq0 zq0Var = this.f3;
                if (f7 >= AndroidUtilities.dp((!zq0Var.h0 || zq0Var.o0[1] == null) ? 58.0f : 111.0f) + zq0Var.G0.b) {
                }
                break;
            default:
                zq0 zq0Var2 = this.f3;
                if (f7 >= AndroidUtilities.dp((!zq0Var2.h0 || zq0Var2.o0[1] == null) ? 58.0f : 111.0f) + zq0Var2.G0.b) {
                }
                break;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void draw(Canvas canvas) {
        switch (this.e3) {
            case 0:
                zq0 zq0Var = this.f3;
                zl0 zl0Var = zq0Var.E;
                if (zl0Var.getVisibility() != 8) {
                    canvas.save();
                    canvas.clipRect(0, AndroidUtilities.dp((!zq0Var.h0 || zq0Var.o0[1] == null) ? 58.0f : 111.0f) + zq0Var.p0, getWidth(), getHeight());
                }
                super.draw(canvas);
                if (zl0Var.getVisibility() != 8) {
                    canvas.restore();
                    break;
                }
                break;
            default:
                zq0 zq0Var2 = this.f3;
                zl0 zl0Var2 = zq0Var2.E;
                if (zl0Var2.getVisibility() != 8) {
                    canvas.save();
                    canvas.clipRect(0, AndroidUtilities.dp((!zq0Var2.h0 || zq0Var2.o0[1] == null) ? 58.0f : 111.0f) + zq0Var2.p0, getWidth(), getHeight());
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
