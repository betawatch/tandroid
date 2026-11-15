package org.telegram.ui.Components;

import android.widget.FrameLayout;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class z80 extends zh.l {
    public final /* synthetic */ int E = 1;
    public final /* synthetic */ Object F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z80(bi.t6 t6Var, bi.t6 t6Var2, FrameLayout frameLayout, long j3) {
        super(t6Var2, frameLayout, j3, true);
        this.F = t6Var;
    }

    @Override // zh.l
    public final void f(String str, boolean z10, boolean z11) {
        org.telegram.ui.ActionBar.k kVar;
        switch (this.E) {
            case 0:
                zh.b bVar = (zh.b) this.F;
                cv0 cv0Var = bVar.R1;
                if (!this.e.isEmpty()) {
                    if (!z11) {
                        super.f(str, z10, z11);
                        break;
                    } else {
                        bVar.w1.K.setText("");
                        break;
                    }
                } else if (cv0Var.getVisibility() != 4) {
                    cv0Var.setVisibility(4);
                    break;
                }
                break;
            default:
                if (!z11) {
                    super.f(str, z10, z11);
                    break;
                } else {
                    kVar = ((org.telegram.ui.ActionBar.e2) ((bi.t6) this.F)).actionBar;
                    kVar.setSearchFieldText("");
                    break;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z80(zh.b bVar, org.telegram.ui.ActionBar.e2 e2Var, org.telegram.ui.ActionBar.k2 k2Var, long j3) {
        super(e2Var, k2Var, j3, false);
        this.F = bVar;
    }
}
