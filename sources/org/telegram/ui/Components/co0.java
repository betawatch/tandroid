package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class co0 extends ek0 {
    public final /* synthetic */ int f3;
    public final /* synthetic */ ap0 g3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ co0(ap0 ap0Var, Context context, org.telegram.ui.ActionBar.h6 h6Var, int i7) {
        super(context, h6Var);
        this.f3 = i7;
        this.g3 = ap0Var;
    }

    @Override // org.telegram.ui.Components.ek0
    public final boolean E0(float f10) {
        switch (this.f3) {
            case 0:
                ap0 ap0Var = this.g3;
                if (f10 >= org.telegram.messenger.g0.L((!ap0Var.d2 || ap0Var.k2[1] == null) ? 58.0f : 111.0f) + ap0Var.C2.b) {
                }
                break;
            default:
                ap0 ap0Var2 = this.g3;
                if (f10 >= org.telegram.messenger.g0.L((!ap0Var2.d2 || ap0Var2.k2[1] == null) ? 58.0f : 111.0f) + ap0Var2.C2.b) {
                }
                break;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void draw(Canvas canvas) {
        switch (this.f3) {
            case 0:
                ap0 ap0Var = this.g3;
                ek0 ek0Var = ap0Var.A1;
                if (ek0Var.getVisibility() != 8) {
                    canvas.save();
                    canvas.clipRect(0, org.telegram.messenger.g0.L((!ap0Var.d2 || ap0Var.k2[1] == null) ? 58.0f : 111.0f) + ap0Var.l2, getWidth(), getHeight());
                }
                super.draw(canvas);
                if (ek0Var.getVisibility() != 8) {
                    canvas.restore();
                    break;
                }
                break;
            default:
                ap0 ap0Var2 = this.g3;
                ek0 ek0Var2 = ap0Var2.A1;
                if (ek0Var2.getVisibility() != 8) {
                    canvas.save();
                    canvas.clipRect(0, org.telegram.messenger.g0.L((!ap0Var2.d2 || ap0Var2.k2[1] == null) ? 58.0f : 111.0f) + ap0Var2.l2, getWidth(), getHeight());
                }
                super.draw(canvas);
                if (ek0Var2.getVisibility() != 8) {
                    canvas.restore();
                    break;
                }
                break;
        }
    }
}
