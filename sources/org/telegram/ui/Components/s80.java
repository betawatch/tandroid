package org.telegram.ui.Components;

import android.widget.FrameLayout;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class s80 extends zh.k {
    public final /* synthetic */ int E = 1;
    public final /* synthetic */ Object F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s80(ai.c7 c7Var, ai.c7 c7Var2, FrameLayout frameLayout, long j10) {
        super(c7Var2, frameLayout, j10, true);
        this.F = c7Var;
    }

    @Override // zh.k
    public final void f(String str, boolean z10, boolean z11) {
        org.telegram.ui.ActionBar.k kVar;
        switch (this.E) {
            case 0:
                zh.b bVar = (zh.b) this.F;
                zu0 zu0Var = bVar.O1;
                if (!this.e.isEmpty()) {
                    if (!z11) {
                        super.f(str, z10, z11);
                        break;
                    } else {
                        bVar.t1.K.setText("");
                        break;
                    }
                } else if (zu0Var.getVisibility() != 4) {
                    zu0Var.setVisibility(4);
                    break;
                }
                break;
            default:
                if (!z11) {
                    super.f(str, z10, z11);
                    break;
                } else {
                    kVar = ((org.telegram.ui.ActionBar.d2) ((ai.c7) this.F)).actionBar;
                    kVar.setSearchFieldText("");
                    break;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s80(zh.b bVar, org.telegram.ui.ActionBar.d2 d2Var, org.telegram.ui.ActionBar.j2 j2Var, long j10) {
        super(d2Var, j2Var, j10, false);
        this.F = bVar;
    }
}
