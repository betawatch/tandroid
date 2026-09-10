package org.telegram.ui.Components;

import android.widget.FrameLayout;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class ma0 extends vh.p {
    public final /* synthetic */ int E = 1;
    public final /* synthetic */ Object F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ma0(org.telegram.ui.ai0 ai0Var, org.telegram.ui.ai0 ai0Var2, FrameLayout frameLayout, long j3) {
        super(ai0Var2, frameLayout, j3, true);
        this.F = ai0Var;
    }

    @Override // vh.p
    public final void f(String str, boolean z10, boolean z11) {
        org.telegram.ui.ActionBar.l lVar;
        switch (this.E) {
            case 0:
                vh.c cVar = (vh.c) this.F;
                jx0 jx0Var = cVar.W;
                if (!this.e.isEmpty()) {
                    if (!z11) {
                        super.f(str, z10, z11);
                        break;
                    } else {
                        cVar.w.J.setText("");
                        break;
                    }
                } else if (jx0Var.getVisibility() != 4) {
                    jx0Var.setVisibility(4);
                    break;
                }
                break;
            default:
                if (!z11) {
                    super.f(str, z10, z11);
                    break;
                } else {
                    lVar = ((org.telegram.ui.ActionBar.p2) ((org.telegram.ui.ai0) this.F)).actionBar;
                    lVar.setSearchFieldText("");
                    break;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ma0(vh.c cVar, org.telegram.ui.ActionBar.p2 p2Var, FrameLayout frameLayout, long j3) {
        super(p2Var, frameLayout, j3, false);
        this.F = cVar;
    }
}
