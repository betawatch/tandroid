package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
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
                ku0 ku0Var = (ku0) this.b;
                if (ku0Var.a && ku0Var.b > 0) {
                    ku0Var.f("PRE_DRAW_BEFORE", null, 0, 0, true);
                }
                ku0Var.p();
                if (ku0Var.g0 && (recyclerView = ku0Var.E) != null && !recyclerView.c0()) {
                    float o10 = ku0Var.o();
                    if (!Float.isInfinite(o10)) {
                        ku0Var.g0 = false;
                        ku0Var.t(ku0Var.E, Math.round(o10 - ku0Var.U));
                        ku0Var.B();
                    }
                }
                if (ku0Var.a && ku0Var.b > 0) {
                    ku0Var.f("PRE_DRAW_AFTER", null, 0, 0, true);
                    ku0Var.b--;
                    ku0Var.c++;
                    break;
                }
                break;
        }
        return true;
    }
}
