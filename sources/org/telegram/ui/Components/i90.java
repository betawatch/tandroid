package org.telegram.ui.Components;

import android.widget.FrameLayout;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class i90 extends zh.l {
    public final /* synthetic */ int E = 1;
    public final /* synthetic */ Object F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i90(bi.e9 e9Var, bi.e9 e9Var2, FrameLayout frameLayout, long j3) {
        super(e9Var2, frameLayout, j3, true);
        this.F = e9Var;
    }

    @Override // zh.l
    public final void f(String str, boolean z10, boolean z11) {
        org.telegram.ui.ActionBar.k kVar;
        switch (this.E) {
            case 0:
                zh.b bVar = (zh.b) this.F;
                mv0 mv0Var = bVar.R1;
                if (!this.e.isEmpty()) {
                    if (!z11) {
                        super.f(str, z10, z11);
                        break;
                    } else {
                        bVar.w1.K.setText("");
                        break;
                    }
                } else if (mv0Var.getVisibility() != 4) {
                    mv0Var.setVisibility(4);
                    break;
                }
                break;
            default:
                if (!z11) {
                    super.f(str, z10, z11);
                    break;
                } else {
                    kVar = ((org.telegram.ui.ActionBar.g2) ((bi.e9) this.F)).actionBar;
                    kVar.setSearchFieldText("");
                    break;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i90(zh.b bVar, org.telegram.ui.ActionBar.g2 g2Var, org.telegram.ui.ActionBar.m2 m2Var, long j3) {
        super(g2Var, m2Var, j3, false);
        this.F = bVar;
    }
}
