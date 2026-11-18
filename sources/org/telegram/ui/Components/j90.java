package org.telegram.ui.Components;

import android.widget.FrameLayout;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class j90 extends zh.l {
    public final /* synthetic */ int E = 1;
    public final /* synthetic */ Object F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j90(bi.y8 y8Var, bi.y8 y8Var2, FrameLayout frameLayout, long j3) {
        super(y8Var2, frameLayout, j3, true);
        this.F = y8Var;
    }

    @Override // zh.l
    public final void f(String str, boolean z10, boolean z11) {
        org.telegram.ui.ActionBar.k kVar;
        switch (this.E) {
            case 0:
                zh.b bVar = (zh.b) this.F;
                kv0 kv0Var = bVar.R1;
                if (!this.e.isEmpty()) {
                    if (!z11) {
                        super.f(str, z10, z11);
                        break;
                    } else {
                        bVar.w1.K.setText("");
                        break;
                    }
                } else if (kv0Var.getVisibility() != 4) {
                    kv0Var.setVisibility(4);
                    break;
                }
                break;
            default:
                if (!z11) {
                    super.f(str, z10, z11);
                    break;
                } else {
                    kVar = ((org.telegram.ui.ActionBar.h2) ((bi.y8) this.F)).actionBar;
                    kVar.setSearchFieldText("");
                    break;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j90(zh.b bVar, org.telegram.ui.ActionBar.h2 h2Var, org.telegram.ui.ActionBar.n2 n2Var, long j3) {
        super(h2Var, n2Var, j3, false);
        this.F = bVar;
    }
}
