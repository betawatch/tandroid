package org.telegram.ui.Components;

import android.widget.FrameLayout;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class da0 extends wh.n {
    public final /* synthetic */ int E = 1;
    public final /* synthetic */ Object F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public da0(org.telegram.ui.uh0 uh0Var, org.telegram.ui.uh0 uh0Var2, FrameLayout frameLayout, long j3) {
        super(uh0Var2, frameLayout, j3, true);
        this.F = uh0Var;
    }

    @Override // wh.n
    public final void f(String str, boolean z10, boolean z11) {
        org.telegram.ui.ActionBar.k kVar;
        switch (this.E) {
            case 0:
                wh.b bVar = (wh.b) this.F;
                xw0 xw0Var = bVar.W;
                if (!this.e.isEmpty()) {
                    if (!z11) {
                        super.f(str, z10, z11);
                        break;
                    } else {
                        bVar.w.J.setText("");
                        break;
                    }
                } else if (xw0Var.getVisibility() != 4) {
                    xw0Var.setVisibility(4);
                    break;
                }
                break;
            default:
                if (!z11) {
                    super.f(str, z10, z11);
                    break;
                } else {
                    kVar = ((org.telegram.ui.ActionBar.n2) ((org.telegram.ui.uh0) this.F)).actionBar;
                    kVar.setSearchFieldText("");
                    break;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public da0(wh.b bVar, org.telegram.ui.ActionBar.n2 n2Var, FrameLayout frameLayout, long j3) {
        super(n2Var, frameLayout, j3, false);
        this.F = bVar;
    }
}
