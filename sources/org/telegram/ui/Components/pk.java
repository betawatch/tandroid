package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pk implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;

    public /* synthetic */ pk(int i3, View view) {
        this.a = i3;
        this.b = view;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        RecyclerView recyclerView;
        switch (this.a) {
            case 0:
                uk ukVar = (uk) this.b;
                p7 p7Var = ukVar.b.S2;
                float alpha = p7Var != null ? p7Var.getAlpha() : 0.0f;
                if (alpha != ukVar.A0) {
                    ukVar.A0 = alpha;
                    ukVar.i0();
                    break;
                }
                break;
            case 1:
                org.telegram.ui.ActionBar.u3 u3Var = ((EditTextBoldCursor) this.b).Z0;
                if (u3Var != null) {
                    u3Var.c();
                    break;
                }
                break;
            case 2:
                ((d60) this.b).invalidate();
                break;
            default:
                gt0 gt0Var = (gt0) this.b;
                if (gt0Var.a && gt0Var.b > 0) {
                    gt0Var.f("PRE_DRAW_BEFORE", null, 0, 0, true);
                }
                gt0Var.l();
                if (gt0Var.h0 && (recyclerView = gt0Var.F) != null && !recyclerView.c0()) {
                    float k10 = gt0Var.k();
                    if (!Float.isInfinite(k10)) {
                        gt0Var.h0 = false;
                        gt0Var.r(gt0Var.F, Math.round(k10 - gt0Var.V));
                        gt0Var.B();
                    }
                }
                if (gt0Var.a && gt0Var.b > 0) {
                    gt0Var.f("PRE_DRAW_AFTER", null, 0, 0, true);
                    gt0Var.b--;
                    gt0Var.c++;
                    break;
                }
                break;
        }
        return true;
    }
}
