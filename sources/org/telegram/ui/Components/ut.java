package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final /* synthetic */ class ut implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;

    public /* synthetic */ ut(int i10, View view) {
        this.a = i10;
        this.b = view;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        RecyclerView recyclerView;
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.h4 h4Var = ((EditTextBoldCursor) this.b).floatingActionMode;
                if (h4Var != null) {
                    h4Var.e();
                    break;
                }
                break;
            case 1:
                ((z70) this.b).invalidate();
                break;
            default:
                bw0 bw0Var = (bw0) this.b;
                if (bw0Var.a && bw0Var.b > 0) {
                    bw0Var.f("PRE_DRAW_BEFORE", null, 0, 0, true);
                }
                bw0Var.l();
                if (bw0Var.g0 && (recyclerView = bw0Var.E) != null && !recyclerView.c0()) {
                    float k10 = bw0Var.k();
                    if (!Float.isInfinite(k10)) {
                        bw0Var.g0 = false;
                        bw0Var.r(bw0Var.E, Math.round(k10 - bw0Var.U));
                        bw0Var.B();
                    }
                }
                if (bw0Var.a && bw0Var.b > 0) {
                    bw0Var.f("PRE_DRAW_AFTER", null, 0, 0, true);
                    bw0Var.b--;
                    bw0Var.c++;
                    break;
                }
                break;
        }
        return true;
    }
}
