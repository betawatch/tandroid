package org.telegram.ui.Components;

import android.widget.FrameLayout;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class l90 extends zh.l {
    public final /* synthetic */ int E = 1;
    public final /* synthetic */ Object F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l90(bi.b9 b9Var, bi.b9 b9Var2, FrameLayout frameLayout, long j3) {
        super(b9Var2, frameLayout, j3, true);
        this.F = b9Var;
    }

    @Override // zh.l
    public final void f(String str, boolean z10, boolean z11) {
        org.telegram.ui.ActionBar.k kVar;
        switch (this.E) {
            case 0:
                zh.b bVar = (zh.b) this.F;
                nv0 nv0Var = bVar.R1;
                if (!this.e.isEmpty()) {
                    if (!z11) {
                        super.f(str, z10, z11);
                        break;
                    } else {
                        bVar.w1.K.setText("");
                        break;
                    }
                } else if (nv0Var.getVisibility() != 4) {
                    nv0Var.setVisibility(4);
                    break;
                }
                break;
            default:
                if (!z11) {
                    super.f(str, z10, z11);
                    break;
                } else {
                    kVar = ((org.telegram.ui.ActionBar.g2) ((bi.b9) this.F)).actionBar;
                    kVar.setSearchFieldText("");
                    break;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l90(zh.b bVar, org.telegram.ui.ActionBar.g2 g2Var, org.telegram.ui.ActionBar.m2 m2Var, long j3) {
        super(g2Var, m2Var, j3, false);
        this.F = bVar;
    }
}
