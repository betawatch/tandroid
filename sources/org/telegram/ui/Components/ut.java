package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
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
                aw0 aw0Var = (aw0) this.b;
                if (aw0Var.w0 && aw0Var.x0 > 0) {
                    aw0Var.e0("PRE_DRAW_BEFORE", null, 0, 0, true);
                }
                aw0Var.k0();
                if (aw0Var.j1 && (recyclerView = aw0Var.K0) != null && !recyclerView.c0()) {
                    float j02 = aw0Var.j0();
                    if (!Float.isInfinite(j02)) {
                        aw0Var.j1 = false;
                        aw0Var.m0(aw0Var.K0, Math.round(j02 - aw0Var.a1));
                        aw0Var.u0();
                    }
                }
                if (aw0Var.w0 && aw0Var.x0 > 0) {
                    aw0Var.e0("PRE_DRAW_AFTER", null, 0, 0, true);
                    aw0Var.x0--;
                    aw0Var.y0++;
                    break;
                }
                break;
        }
        return true;
    }
}
