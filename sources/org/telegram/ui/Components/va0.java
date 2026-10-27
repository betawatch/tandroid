package org.telegram.ui.Components;

import android.widget.FrameLayout;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class va0 extends yh.k {
    public final /* synthetic */ int E = 1;
    public final /* synthetic */ Object F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public va0(org.telegram.ui.mh0 mh0Var, org.telegram.ui.mh0 mh0Var2, FrameLayout frameLayout, long j10) {
        super(mh0Var2, frameLayout, j10, true);
        this.F = mh0Var;
    }

    @Override // yh.k
    public final void f(String str, boolean z10, boolean z11) {
        org.telegram.ui.ActionBar.k kVar;
        switch (this.E) {
            case 0:
                yh.b bVar = (yh.b) this.F;
                fy0 fy0Var = bVar.W;
                if (!this.e.isEmpty()) {
                    if (!z11) {
                        super.f(str, z10, z11);
                        break;
                    } else {
                        bVar.w.J.setText("");
                        break;
                    }
                } else if (fy0Var.getVisibility() != 4) {
                    fy0Var.setVisibility(4);
                    break;
                }
                break;
            default:
                if (!z11) {
                    super.f(str, z10, z11);
                    break;
                } else {
                    kVar = ((org.telegram.ui.ActionBar.r2) ((org.telegram.ui.mh0) this.F)).actionBar;
                    kVar.setSearchFieldText("");
                    break;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public va0(yh.b bVar, org.telegram.ui.ActionBar.r2 r2Var, FrameLayout frameLayout, long j10) {
        super(r2Var, frameLayout, j10, false);
        this.F = bVar;
    }
}
