package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class on0 extends pj0 {
    public final /* synthetic */ int e3;
    public final /* synthetic */ mo0 f3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ on0(mo0 mo0Var, Context context, org.telegram.ui.ActionBar.h6 h6Var, int i7) {
        super(context, h6Var);
        this.e3 = i7;
        this.f3 = mo0Var;
    }

    @Override // org.telegram.ui.Components.pj0
    public final boolean E0(float f10) {
        switch (this.e3) {
            case 0:
                mo0 mo0Var = this.f3;
                if (f10 >= org.telegram.messenger.g0.L((!mo0Var.c2 || mo0Var.j2[1] == null) ? 58.0f : 111.0f) + mo0Var.B2.b) {
                }
                break;
            default:
                mo0 mo0Var2 = this.f3;
                if (f10 >= org.telegram.messenger.g0.L((!mo0Var2.c2 || mo0Var2.j2[1] == null) ? 58.0f : 111.0f) + mo0Var2.B2.b) {
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
                pj0 pj0Var = mo0Var.z1;
                if (pj0Var.getVisibility() != 8) {
                    canvas.save();
                    canvas.clipRect(0, org.telegram.messenger.g0.L((!mo0Var.c2 || mo0Var.j2[1] == null) ? 58.0f : 111.0f) + mo0Var.k2, getWidth(), getHeight());
                }
                super.draw(canvas);
                if (pj0Var.getVisibility() != 8) {
                    canvas.restore();
                    break;
                }
                break;
            default:
                mo0 mo0Var2 = this.f3;
                pj0 pj0Var2 = mo0Var2.z1;
                if (pj0Var2.getVisibility() != 8) {
                    canvas.save();
                    canvas.clipRect(0, org.telegram.messenger.g0.L((!mo0Var2.c2 || mo0Var2.j2[1] == null) ? 58.0f : 111.0f) + mo0Var2.k2, getWidth(), getHeight());
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
