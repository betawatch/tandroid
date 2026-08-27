package org.telegram.ui.Components;

import android.widget.FrameLayout;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class p90 extends fh.v {
    public final /* synthetic */ int E = 0;
    public final /* synthetic */ Object F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p90(org.telegram.ui.lh0 lh0Var, org.telegram.ui.lh0 lh0Var2, FrameLayout frameLayout, long j10) {
        super(lh0Var2, frameLayout, j10, true);
        this.F = lh0Var;
    }

    @Override // fh.v
    public final void f(String str, boolean z10, boolean z11) {
        org.telegram.ui.ActionBar.k kVar;
        switch (this.E) {
            case 0:
                fh.c cVar = (fh.c) this.F;
                iw0 iw0Var = cVar.S;
                if (!this.e.isEmpty()) {
                    if (!z11) {
                        super.f(str, z10, z11);
                        break;
                    } else {
                        cVar.w.F.setText("");
                        break;
                    }
                } else if (iw0Var.getVisibility() != 4) {
                    iw0Var.setVisibility(4);
                    break;
                }
                break;
            default:
                if (!z11) {
                    super.f(str, z10, z11);
                    break;
                } else {
                    kVar = ((org.telegram.ui.ActionBar.n2) ((org.telegram.ui.lh0) this.F)).actionBar;
                    kVar.setSearchFieldText("");
                    break;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p90(fh.c cVar, org.telegram.ui.ActionBar.n2 n2Var, FrameLayout frameLayout, long j10) {
        super(n2Var, frameLayout, j10, false);
        this.F = cVar;
    }
}
