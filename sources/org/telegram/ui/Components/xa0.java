package org.telegram.ui.Components;

import android.widget.FrameLayout;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class xa0 extends xh.k {
    public final /* synthetic */ int E = 1;
    public final /* synthetic */ Object F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xa0(org.telegram.ui.jh0 jh0Var, org.telegram.ui.jh0 jh0Var2, FrameLayout frameLayout, long j10) {
        super(jh0Var2, frameLayout, j10, true);
        this.F = jh0Var;
    }

    @Override // xh.k
    public final void f(String str, boolean z10, boolean z11) {
        org.telegram.ui.ActionBar.k kVar;
        switch (this.E) {
            case 0:
                xh.b bVar = (xh.b) this.F;
                sx0 sx0Var = bVar.W;
                if (!this.e.isEmpty()) {
                    if (!z11) {
                        super.f(str, z10, z11);
                        break;
                    } else {
                        bVar.w.J.setText("");
                        break;
                    }
                } else if (sx0Var.getVisibility() != 4) {
                    sx0Var.setVisibility(4);
                    break;
                }
                break;
            default:
                if (!z11) {
                    super.f(str, z10, z11);
                    break;
                } else {
                    kVar = ((org.telegram.ui.ActionBar.n2) ((org.telegram.ui.jh0) this.F)).actionBar;
                    kVar.setSearchFieldText("");
                    break;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xa0(xh.b bVar, org.telegram.ui.ActionBar.n2 n2Var, FrameLayout frameLayout, long j10) {
        super(n2Var, frameLayout, j10, false);
        this.F = bVar;
    }
}
