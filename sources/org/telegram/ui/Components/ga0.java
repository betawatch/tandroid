package org.telegram.ui.Components;

import android.widget.FrameLayout;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class ga0 extends kh.v {
    public final /* synthetic */ int E = 0;
    public final /* synthetic */ Object F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ga0(org.telegram.ui.rh0 rh0Var, org.telegram.ui.rh0 rh0Var2, FrameLayout frameLayout, long j10) {
        super(rh0Var2, frameLayout, j10, true);
        this.F = rh0Var;
    }

    @Override // kh.v
    public final void f(String str, boolean z4, boolean z10) {
        org.telegram.ui.ActionBar.k kVar;
        switch (this.E) {
            case 0:
                kh.c cVar = (kh.c) this.F;
                ax0 ax0Var = cVar.T;
                if (!this.e.isEmpty()) {
                    if (!z10) {
                        super.f(str, z4, z10);
                        break;
                    } else {
                        cVar.w.G.setText("");
                        break;
                    }
                } else if (ax0Var.getVisibility() != 4) {
                    ax0Var.setVisibility(4);
                    break;
                }
                break;
            default:
                if (!z10) {
                    super.f(str, z4, z10);
                    break;
                } else {
                    kVar = ((org.telegram.ui.ActionBar.p2) ((org.telegram.ui.rh0) this.F)).actionBar;
                    kVar.setSearchFieldText("");
                    break;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ga0(kh.c cVar, org.telegram.ui.ActionBar.p2 p2Var, FrameLayout frameLayout, long j10) {
        super(p2Var, frameLayout, j10, false);
        this.F = cVar;
    }
}
