package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class hl implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;

    public /* synthetic */ hl(int i7, View view) {
        this.a = i7;
        this.b = view;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        RecyclerView recyclerView;
        switch (this.a) {
            case 0:
                ml mlVar = (ml) this.b;
                v7 v7Var = mlVar.b.V2;
                float alpha = v7Var != null ? v7Var.getAlpha() : 0.0f;
                if (alpha != mlVar.A0) {
                    mlVar.A0 = alpha;
                    mlVar.i0();
                    break;
                }
                break;
            case 1:
                org.telegram.ui.ActionBar.x3 x3Var = ((EditTextBoldCursor) this.b).Z0;
                if (x3Var != null) {
                    x3Var.c();
                    break;
                }
                break;
            case 2:
                ((w60) this.b).invalidate();
                break;
            default:
                tt0 tt0Var = (tt0) this.b;
                if (tt0Var.a && tt0Var.b > 0) {
                    tt0Var.f("PRE_DRAW_BEFORE", null, 0, 0, true);
                }
                tt0Var.p();
                if (tt0Var.h0 && (recyclerView = tt0Var.F) != null && !recyclerView.c0()) {
                    float n10 = tt0Var.n();
                    if (!Float.isInfinite(n10)) {
                        tt0Var.h0 = false;
                        tt0Var.t(tt0Var.F, Math.round(n10 - tt0Var.V));
                        tt0Var.B();
                    }
                }
                if (tt0Var.a && tt0Var.b > 0) {
                    tt0Var.f("PRE_DRAW_AFTER", null, 0, 0, true);
                    tt0Var.b--;
                    tt0Var.c++;
                    break;
                }
                break;
        }
        return true;
    }
}
