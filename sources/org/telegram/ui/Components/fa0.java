package org.telegram.ui.Components;

import android.widget.FrameLayout;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class fa0 extends jh.v {
    public final /* synthetic */ int E = 0;
    public final /* synthetic */ Object F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fa0(org.telegram.ui.sh0 sh0Var, org.telegram.ui.sh0 sh0Var2, FrameLayout frameLayout, long j10) {
        super(sh0Var2, frameLayout, j10, true);
        this.F = sh0Var;
    }

    @Override // jh.v
    public final void f(String str, boolean z4, boolean z10) {
        org.telegram.ui.ActionBar.k kVar;
        switch (this.E) {
            case 0:
                jh.c cVar = (jh.c) this.F;
                zw0 zw0Var = cVar.T;
                if (!this.e.isEmpty()) {
                    if (!z10) {
                        super.f(str, z4, z10);
                        break;
                    } else {
                        cVar.w.G.setText("");
                        break;
                    }
                } else if (zw0Var.getVisibility() != 4) {
                    zw0Var.setVisibility(4);
                    break;
                }
                break;
            default:
                if (!z10) {
                    super.f(str, z4, z10);
                    break;
                } else {
                    kVar = ((org.telegram.ui.ActionBar.p2) ((org.telegram.ui.sh0) this.F)).actionBar;
                    kVar.setSearchFieldText("");
                    break;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fa0(jh.c cVar, org.telegram.ui.ActionBar.p2 p2Var, FrameLayout frameLayout, long j10) {
        super(p2Var, frameLayout, j10, false);
        this.F = cVar;
    }
}
