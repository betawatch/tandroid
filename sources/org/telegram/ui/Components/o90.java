package org.telegram.ui.Components;

import android.widget.FrameLayout;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class o90 extends oh.q {
    public final /* synthetic */ int E = 1;
    public final /* synthetic */ Object F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o90(kg.q1 q1Var, kg.q1 q1Var2, FrameLayout frameLayout, long j10) {
        super(q1Var2, frameLayout, j10, true);
        this.F = q1Var;
    }

    @Override // oh.q
    public final void f(String str, boolean z10, boolean z11) {
        org.telegram.ui.ActionBar.l lVar;
        switch (this.E) {
            case 0:
                oh.c cVar = (oh.c) this.F;
                dw0 dw0Var = cVar.N1;
                if (!this.e.isEmpty()) {
                    if (!z11) {
                        super.f(str, z10, z11);
                        break;
                    } else {
                        cVar.s1.J.setText("");
                        break;
                    }
                } else if (dw0Var.getVisibility() != 4) {
                    dw0Var.setVisibility(4);
                    break;
                }
                break;
            default:
                if (!z11) {
                    super.f(str, z10, z11);
                    break;
                } else {
                    lVar = ((org.telegram.ui.ActionBar.k2) ((kg.q1) this.F)).actionBar;
                    lVar.setSearchFieldText("");
                    break;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o90(oh.c cVar, org.telegram.ui.ActionBar.k2 k2Var, org.telegram.ui.ActionBar.p2 p2Var, long j10) {
        super(k2Var, p2Var, j10, false);
        this.F = cVar;
    }
}
