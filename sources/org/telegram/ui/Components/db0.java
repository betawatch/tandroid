package org.telegram.ui.Components;

import android.widget.FrameLayout;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class db0 extends xh.l {
    public final /* synthetic */ int E = 1;
    public final /* synthetic */ Object F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public db0(org.telegram.ui.ei0 ei0Var, org.telegram.ui.ei0 ei0Var2, FrameLayout frameLayout, long j10) {
        super(ei0Var2, frameLayout, j10, true);
        this.F = ei0Var;
    }

    @Override // xh.l
    public final void f(String str, boolean z10, boolean z11) {
        org.telegram.ui.ActionBar.k kVar;
        switch (this.E) {
            case 0:
                xh.b bVar = (xh.b) this.F;
                wx0 wx0Var = bVar.W;
                if (!this.e.isEmpty()) {
                    if (!z11) {
                        super.f(str, z10, z11);
                        break;
                    } else {
                        bVar.w.J.setText("");
                        break;
                    }
                } else if (wx0Var.getVisibility() != 4) {
                    wx0Var.setVisibility(4);
                    break;
                }
                break;
            default:
                if (!z11) {
                    super.f(str, z10, z11);
                    break;
                } else {
                    kVar = ((org.telegram.ui.ActionBar.m2) ((org.telegram.ui.ei0) this.F)).actionBar;
                    kVar.setSearchFieldText("");
                    break;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public db0(xh.b bVar, org.telegram.ui.ActionBar.m2 m2Var, FrameLayout frameLayout, long j10) {
        super(m2Var, frameLayout, j10, false);
        this.F = bVar;
    }
}
