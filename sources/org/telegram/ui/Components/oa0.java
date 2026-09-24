package org.telegram.ui.Components;

import android.widget.FrameLayout;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class oa0 extends wh.n {
    public final /* synthetic */ int E = 1;
    public final /* synthetic */ Object F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oa0(org.telegram.ui.th0 th0Var, org.telegram.ui.th0 th0Var2, FrameLayout frameLayout, long j3) {
        super(th0Var2, frameLayout, j3, true);
        this.F = th0Var;
    }

    @Override // wh.n
    public final void f(String str, boolean z10, boolean z11) {
        org.telegram.ui.ActionBar.k kVar;
        switch (this.E) {
            case 0:
                wh.b bVar = (wh.b) this.F;
                ix0 ix0Var = bVar.W;
                if (!this.e.isEmpty()) {
                    if (!z11) {
                        super.f(str, z10, z11);
                        break;
                    } else {
                        bVar.w.J.setText("");
                        break;
                    }
                } else if (ix0Var.getVisibility() != 4) {
                    ix0Var.setVisibility(4);
                    break;
                }
                break;
            default:
                if (!z11) {
                    super.f(str, z10, z11);
                    break;
                } else {
                    kVar = ((org.telegram.ui.ActionBar.m2) ((org.telegram.ui.th0) this.F)).actionBar;
                    kVar.setSearchFieldText("");
                    break;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oa0(wh.b bVar, org.telegram.ui.ActionBar.m2 m2Var, FrameLayout frameLayout, long j3) {
        super(m2Var, frameLayout, j3, false);
        this.F = bVar;
    }
}
