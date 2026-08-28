package org.telegram.ui.Components;

import android.widget.FrameLayout;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class l90 extends eh.x {
    public final /* synthetic */ int E = 0;
    public final /* synthetic */ Object F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l90(org.telegram.ui.ih0 ih0Var, org.telegram.ui.ih0 ih0Var2, FrameLayout frameLayout, long j10) {
        super(ih0Var2, frameLayout, j10, true);
        this.F = ih0Var;
    }

    @Override // eh.x
    public final void f(String str, boolean z10, boolean z11) {
        org.telegram.ui.ActionBar.k kVar;
        switch (this.E) {
            case 0:
                eh.c cVar = (eh.c) this.F;
                gw0 gw0Var = cVar.S;
                if (!this.e.isEmpty()) {
                    if (!z11) {
                        super.f(str, z10, z11);
                        break;
                    } else {
                        cVar.w.F.setText("");
                        break;
                    }
                } else if (gw0Var.getVisibility() != 4) {
                    gw0Var.setVisibility(4);
                    break;
                }
                break;
            default:
                if (!z11) {
                    super.f(str, z10, z11);
                    break;
                } else {
                    kVar = ((org.telegram.ui.ActionBar.o2) ((org.telegram.ui.ih0) this.F)).actionBar;
                    kVar.setSearchFieldText("");
                    break;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l90(eh.c cVar, org.telegram.ui.ActionBar.o2 o2Var, FrameLayout frameLayout, long j10) {
        super(o2Var, frameLayout, j10, false);
        this.F = cVar;
    }
}
