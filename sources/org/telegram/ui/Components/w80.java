package org.telegram.ui.Components;

import android.widget.FrameLayout;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class w80 extends yh.m {
    public final /* synthetic */ int E = 1;
    public final /* synthetic */ Object F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w80(bi.w4 w4Var, bi.w4 w4Var2, FrameLayout frameLayout, long j3) {
        super(w4Var2, frameLayout, j3, true);
        this.F = w4Var;
    }

    @Override // yh.m
    public final void f(String str, boolean z9, boolean z10) {
        org.telegram.ui.ActionBar.l lVar;
        switch (this.E) {
            case 0:
                yh.b bVar = (yh.b) this.F;
                bv0 bv0Var = bVar.Q1;
                if (!this.e.isEmpty()) {
                    if (!z10) {
                        super.f(str, z9, z10);
                        break;
                    } else {
                        bVar.v1.J.setText("");
                        break;
                    }
                } else if (bv0Var.getVisibility() != 4) {
                    bv0Var.setVisibility(4);
                    break;
                }
                break;
            default:
                if (!z10) {
                    super.f(str, z9, z10);
                    break;
                } else {
                    lVar = ((org.telegram.ui.ActionBar.f2) ((bi.w4) this.F)).actionBar;
                    lVar.setSearchFieldText("");
                    break;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w80(yh.b bVar, org.telegram.ui.ActionBar.f2 f2Var, org.telegram.ui.ActionBar.m2 m2Var, long j3) {
        super(f2Var, m2Var, j3, false);
        this.F = bVar;
    }
}
