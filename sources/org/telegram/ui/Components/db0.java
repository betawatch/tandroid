package org.telegram.ui.Components;

import android.widget.FrameLayout;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class db0 extends xh.l {
    public final /* synthetic */ int E = 1;
    public final /* synthetic */ Object F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public db0(org.telegram.ui.fi0 fi0Var, org.telegram.ui.fi0 fi0Var2, FrameLayout frameLayout, long j10) {
        super(fi0Var2, frameLayout, j10, true);
        this.F = fi0Var;
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
                    kVar = ((org.telegram.ui.ActionBar.m2) ((org.telegram.ui.fi0) this.F)).actionBar;
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
