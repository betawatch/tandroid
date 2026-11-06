package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class on0 extends pj0 {
    public final /* synthetic */ int e3;
    public final /* synthetic */ mo0 f3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ on0(mo0 mo0Var, Context context, org.telegram.ui.ActionBar.f6 f6Var, int i7) {
        super(context, f6Var);
        this.e3 = i7;
        this.f3 = mo0Var;
    }

    @Override // org.telegram.ui.Components.pj0
    public final boolean E0(float f10) {
        switch (this.e3) {
            case 0:
                mo0 mo0Var = this.f3;
                if (f10 >= org.telegram.messenger.g0.L((!mo0Var.Z1 || mo0Var.g2[1] == null) ? 58.0f : 111.0f) + mo0Var.y2.b) {
                }
                break;
            default:
                mo0 mo0Var2 = this.f3;
                if (f10 >= org.telegram.messenger.g0.L((!mo0Var2.Z1 || mo0Var2.g2[1] == null) ? 58.0f : 111.0f) + mo0Var2.y2.b) {
                }
                break;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void draw(Canvas canvas) {
        switch (this.e3) {
            case 0:
                mo0 mo0Var = this.f3;
                pj0 pj0Var = mo0Var.w1;
                if (pj0Var.getVisibility() != 8) {
                    canvas.save();
                    canvas.clipRect(0, org.telegram.messenger.g0.L((!mo0Var.Z1 || mo0Var.g2[1] == null) ? 58.0f : 111.0f) + mo0Var.h2, getWidth(), getHeight());
                }
                super.draw(canvas);
                if (pj0Var.getVisibility() != 8) {
                    canvas.restore();
                    break;
                }
                break;
            default:
                mo0 mo0Var2 = this.f3;
                pj0 pj0Var2 = mo0Var2.w1;
                if (pj0Var2.getVisibility() != 8) {
                    canvas.save();
                    canvas.clipRect(0, org.telegram.messenger.g0.L((!mo0Var2.Z1 || mo0Var2.g2[1] == null) ? 58.0f : 111.0f) + mo0Var2.h2, getWidth(), getHeight());
                }
                super.draw(canvas);
                if (pj0Var2.getVisibility() != 8) {
                    canvas.restore();
                    break;
                }
                break;
        }
    }
}
