package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class da0 extends kg.o0 {
    public boolean e0;
    public final /* synthetic */ la0 f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public da0(la0 la0Var, Context context, int i3, long j10, org.telegram.ui.ActionBar.e6 e6Var, boolean z10, boolean z11) {
        super(context, i3, j10, false, e6Var, false, z10, z11);
        this.f0 = la0Var;
        this.e0 = true;
    }

    @Override // kg.o0
    public final void J() {
        this.f0.B0(null);
    }

    @Override // kg.o0
    public final void N(ArrayList arrayList) {
        int i3;
        la0 la0Var = this.f0;
        org.telegram.messenger.zi ziVar = la0Var.E0;
        if (ziVar != null && ziVar.D3()) {
            if (arrayList != null) {
                i3 = 0;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    ha0 ha0Var = (ha0) arrayList.get(i10);
                    if (ha0Var != null && !org.telegram.messenger.l10.B(ha0Var.c)) {
                        i3++;
                    }
                }
            } else {
                i3 = 0;
            }
            if (this.e0 && i3 == 1) {
                la0Var.q0 = ((ha0) arrayList.get(0)).a;
            }
            this.e0 = false;
            la0Var.W.setVisibility(i3 != 1 ? 8 : 0);
        }
        super.N(arrayList);
    }
}
