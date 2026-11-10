package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class ka0 extends jg.r0 {
    public boolean d0;
    public final /* synthetic */ sa0 e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ka0(sa0 sa0Var, Context context, int i7, long j3, org.telegram.ui.ActionBar.h6 h6Var, boolean z9, boolean z10) {
        super(context, i7, j3, false, h6Var, false, z9, z10);
        this.e0 = sa0Var;
        this.d0 = true;
    }

    @Override // jg.r0
    public final void J() {
        this.e0.B0(null);
    }

    @Override // jg.r0
    public final void N(ArrayList arrayList) {
        int i7;
        sa0 sa0Var = this.e0;
        org.telegram.messenger.ij ijVar = sa0Var.D0;
        if (ijVar != null && ijVar.C3()) {
            if (arrayList != null) {
                i7 = 0;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    oa0 oa0Var = (oa0) arrayList.get(i10);
                    if (oa0Var != null && !org.telegram.messenger.t10.B(oa0Var.c)) {
                        i7++;
                    }
                }
            } else {
                i7 = 0;
            }
            if (this.d0 && i7 == 1) {
                sa0Var.p0 = ((oa0) arrayList.get(0)).a;
            }
            this.d0 = false;
            sa0Var.V.setVisibility(i7 != 1 ? 8 : 0);
        }
        super.N(arrayList);
    }
}
