package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class dt implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;

    public /* synthetic */ dt(int i10, View view) {
        this.a = i10;
        this.b = view;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        RecyclerView recyclerView;
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.d4 d4Var = ((EditTextBoldCursor) this.b).Y0;
                if (d4Var != null) {
                    d4Var.c();
                    break;
                }
                break;
            case 1:
                ((x60) this.b).invalidate();
                break;
            default:
                lu0 lu0Var = (lu0) this.b;
                if (lu0Var.a && lu0Var.b > 0) {
                    lu0Var.f("PRE_DRAW_BEFORE", null, 0, 0, true);
                }
                lu0Var.p();
                if (lu0Var.g0 && (recyclerView = lu0Var.E) != null && !recyclerView.c0()) {
                    float o10 = lu0Var.o();
                    if (!Float.isInfinite(o10)) {
                        lu0Var.g0 = false;
                        lu0Var.t(lu0Var.E, Math.round(o10 - lu0Var.U));
                        lu0Var.B();
                    }
                }
                if (lu0Var.a && lu0Var.b > 0) {
                    lu0Var.f("PRE_DRAW_AFTER", null, 0, 0, true);
                    lu0Var.b--;
                    lu0Var.c++;
                    break;
                }
                break;
        }
        return true;
    }
}
