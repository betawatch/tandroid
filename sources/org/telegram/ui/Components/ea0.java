package org.telegram.ui.Components;

import android.widget.FrameLayout;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class ea0 extends jh.v {
    public final /* synthetic */ int E = 0;
    public final /* synthetic */ Object F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ea0(org.telegram.ui.qh0 qh0Var, org.telegram.ui.qh0 qh0Var2, FrameLayout frameLayout, long j10) {
        super(qh0Var2, frameLayout, j10, true);
        this.F = qh0Var;
    }

    @Override // jh.v
    public final void f(String str, boolean z4, boolean z10) {
        org.telegram.ui.ActionBar.k kVar;
        switch (this.E) {
            case 0:
                jh.c cVar = (jh.c) this.F;
                zw0 zw0Var = cVar.T;
                if (!this.e.isEmpty()) {
                    if (!z10) {
                        super.f(str, z4, z10);
                        break;
                    } else {
                        cVar.w.G.setText("");
                        break;
                    }
                } else if (zw0Var.getVisibility() != 4) {
                    zw0Var.setVisibility(4);
                    break;
                }
                break;
            default:
                if (!z10) {
                    super.f(str, z4, z10);
                    break;
                } else {
                    kVar = ((org.telegram.ui.ActionBar.p2) ((org.telegram.ui.qh0) this.F)).actionBar;
                    kVar.setSearchFieldText("");
                    break;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ea0(jh.c cVar, org.telegram.ui.ActionBar.p2 p2Var, FrameLayout frameLayout, long j10) {
        super(p2Var, frameLayout, j10, false);
        this.F = cVar;
    }
}
