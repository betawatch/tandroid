package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class bu implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;

    public /* synthetic */ bu(int i10, View view) {
        this.a = i10;
        this.b = view;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        RecyclerView recyclerView;
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.m4 m4Var = ((EditTextBoldCursor) this.b).floatingActionMode;
                if (m4Var != null) {
                    m4Var.c();
                    break;
                }
                break;
            case 1:
                ((i80) this.b).invalidate();
                break;
            default:
                lw0 lw0Var = (lw0) this.b;
                if (lw0Var.a && lw0Var.b > 0) {
                    lw0Var.f("PRE_DRAW_BEFORE", null, 0, 0, true);
                }
                lw0Var.l();
                if (lw0Var.g0 && (recyclerView = lw0Var.E) != null && !recyclerView.c0()) {
                    float k10 = lw0Var.k();
                    if (!Float.isInfinite(k10)) {
                        lw0Var.g0 = false;
                        lw0Var.r(lw0Var.E, Math.round(k10 - lw0Var.U));
                        lw0Var.B();
                    }
                }
                if (lw0Var.a && lw0Var.b > 0) {
                    lw0Var.f("PRE_DRAW_AFTER", null, 0, 0, true);
                    lw0Var.b--;
                    lw0Var.c++;
                    break;
                }
                break;
        }
        return true;
    }
}
