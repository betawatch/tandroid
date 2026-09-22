package org.telegram.ui.Components;

import android.widget.FrameLayout;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class na0 extends wh.n {
    public final /* synthetic */ int E = 1;
    public final /* synthetic */ Object F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public na0(org.telegram.ui.bi0 bi0Var, org.telegram.ui.bi0 bi0Var2, FrameLayout frameLayout, long j3) {
        super(bi0Var2, frameLayout, j3, true);
        this.F = bi0Var;
    }

    @Override // wh.n
    public final void f(String str, boolean z10, boolean z11) {
        org.telegram.ui.ActionBar.k kVar;
        switch (this.E) {
            case 0:
                wh.b bVar = (wh.b) this.F;
                lx0 lx0Var = bVar.W;
                if (!this.e.isEmpty()) {
                    if (!z11) {
                        super.f(str, z10, z11);
                        break;
                    } else {
                        bVar.w.J.setText("");
                        break;
                    }
                } else if (lx0Var.getVisibility() != 4) {
                    lx0Var.setVisibility(4);
                    break;
                }
                break;
            default:
                if (!z11) {
                    super.f(str, z10, z11);
                    break;
                } else {
                    kVar = ((org.telegram.ui.ActionBar.n2) ((org.telegram.ui.bi0) this.F)).actionBar;
                    kVar.setSearchFieldText("");
                    break;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public na0(wh.b bVar, org.telegram.ui.ActionBar.n2 n2Var, FrameLayout frameLayout, long j3) {
        super(n2Var, frameLayout, j3, false);
        this.F = bVar;
    }
}
