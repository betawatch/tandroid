package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class yk implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;

    public /* synthetic */ yk(int i7, View view) {
        this.a = i7;
        this.b = view;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        RecyclerView recyclerView;
        switch (this.a) {
            case 0:
                dl dlVar = (dl) this.b;
                o7 o7Var = dlVar.b.V2;
                float alpha = o7Var != null ? o7Var.getAlpha() : 0.0f;
                if (alpha != dlVar.A0) {
                    dlVar.A0 = alpha;
                    dlVar.i0();
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
                ((k60) this.b).invalidate();
                break;
            default:
                it0 it0Var = (it0) this.b;
                if (it0Var.a && it0Var.b > 0) {
                    it0Var.f("PRE_DRAW_BEFORE", null, 0, 0, true);
                }
                it0Var.p();
                if (it0Var.h0 && (recyclerView = it0Var.F) != null && !recyclerView.c0()) {
                    float n10 = it0Var.n();
                    if (!Float.isInfinite(n10)) {
                        it0Var.h0 = false;
                        it0Var.t(it0Var.F, Math.round(n10 - it0Var.V));
                        it0Var.B();
                    }
                }
                if (it0Var.a && it0Var.b > 0) {
                    it0Var.f("PRE_DRAW_AFTER", null, 0, 0, true);
                    it0Var.b--;
                    it0Var.c++;
                    break;
                }
                break;
        }
        return true;
    }
}
