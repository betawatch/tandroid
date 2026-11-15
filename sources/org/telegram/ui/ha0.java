package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class ha0 extends jg.r0 {
    public boolean e0;
    public final /* synthetic */ pa0 f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ha0(pa0 pa0Var, Context context, int i7, long j3, org.telegram.ui.ActionBar.e6 e6Var, boolean z10, boolean z11) {
        super(context, i7, j3, false, e6Var, false, z10, z11);
        this.f0 = pa0Var;
        this.e0 = true;
    }

    @Override // jg.r0
    public final void J() {
        this.f0.B0(null);
    }

    @Override // jg.r0
    public final void N(ArrayList arrayList) {
        int i7;
        pa0 pa0Var = this.f0;
        org.telegram.messenger.gj gjVar = pa0Var.E0;
        if (gjVar != null && gjVar.C3()) {
            if (arrayList != null) {
                i7 = 0;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    la0 la0Var = (la0) arrayList.get(i10);
                    if (la0Var != null && !org.telegram.messenger.q10.B(la0Var.c)) {
                        i7++;
                    }
                }
            } else {
                i7 = 0;
            }
            if (this.e0 && i7 == 1) {
                pa0Var.q0 = ((la0) arrayList.get(0)).a;
            }
            this.e0 = false;
            pa0Var.W.setVisibility(i7 != 1 ? 8 : 0);
        }
        super.N(arrayList);
    }
}
