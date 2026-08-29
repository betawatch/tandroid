package org.telegram.ui.Components;

import android.widget.FrameLayout;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class z90 extends hh.v {
    public final /* synthetic */ int E = 0;
    public final /* synthetic */ Object F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z90(org.telegram.ui.ih0 ih0Var, org.telegram.ui.ih0 ih0Var2, FrameLayout frameLayout, long j10) {
        super(ih0Var2, frameLayout, j10, true);
        this.F = ih0Var;
    }

    @Override // hh.v
    public final void f(String str, boolean z10, boolean z11) {
        org.telegram.ui.ActionBar.l lVar;
        switch (this.E) {
            case 0:
                hh.c cVar = (hh.c) this.F;
                qw0 qw0Var = cVar.S;
                if (!this.e.isEmpty()) {
                    if (!z11) {
                        super.f(str, z10, z11);
                        break;
                    } else {
                        cVar.w.F.setText("");
                        break;
                    }
                } else if (qw0Var.getVisibility() != 4) {
                    qw0Var.setVisibility(4);
                    break;
                }
                break;
            default:
                if (!z11) {
                    super.f(str, z10, z11);
                    break;
                } else {
                    lVar = ((org.telegram.ui.ActionBar.o2) ((org.telegram.ui.ih0) this.F)).actionBar;
                    lVar.setSearchFieldText("");
                    break;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z90(hh.c cVar, org.telegram.ui.ActionBar.o2 o2Var, FrameLayout frameLayout, long j10) {
        super(o2Var, frameLayout, j10, false);
        this.F = cVar;
    }
}
