package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
                ((j80) this.b).invalidate();
                break;
            default:
                mw0 mw0Var = (mw0) this.b;
                if (mw0Var.a && mw0Var.b > 0) {
                    mw0Var.f("PRE_DRAW_BEFORE", null, 0, 0, true);
                }
                mw0Var.l();
                if (mw0Var.g0 && (recyclerView = mw0Var.E) != null && !recyclerView.c0()) {
                    float k10 = mw0Var.k();
                    if (!Float.isInfinite(k10)) {
                        mw0Var.g0 = false;
                        mw0Var.r(mw0Var.E, Math.round(k10 - mw0Var.U));
                        mw0Var.B();
                    }
                }
                if (mw0Var.a && mw0Var.b > 0) {
                    mw0Var.f("PRE_DRAW_AFTER", null, 0, 0, true);
                    mw0Var.b--;
                    mw0Var.c++;
                    break;
                }
                break;
        }
        return true;
    }
}
