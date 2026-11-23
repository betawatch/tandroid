package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class fl implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;

    public /* synthetic */ fl(int i7, View view) {
        this.a = i7;
        this.b = view;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        RecyclerView recyclerView;
        switch (this.a) {
            case 0:
                kl klVar = (kl) this.b;
                u7 u7Var = klVar.b.V2;
                float alpha = u7Var != null ? u7Var.getAlpha() : 0.0f;
                if (alpha != klVar.A0) {
                    klVar.A0 = alpha;
                    klVar.i0();
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
                ((t60) this.b).invalidate();
                break;
            default:
                st0 st0Var = (st0) this.b;
                if (st0Var.a && st0Var.b > 0) {
                    st0Var.f("PRE_DRAW_BEFORE", null, 0, 0, true);
                }
                st0Var.p();
                if (st0Var.h0 && (recyclerView = st0Var.F) != null && !recyclerView.c0()) {
                    float n10 = st0Var.n();
                    if (!Float.isInfinite(n10)) {
                        st0Var.h0 = false;
                        st0Var.t(st0Var.F, Math.round(n10 - st0Var.V));
                        st0Var.B();
                    }
                }
                if (st0Var.a && st0Var.b > 0) {
                    st0Var.f("PRE_DRAW_AFTER", null, 0, 0, true);
                    st0Var.b--;
                    st0Var.c++;
                    break;
                }
                break;
        }
        return true;
    }
}
