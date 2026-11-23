package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class ia0 extends jg.r0 {
    public boolean e0;
    public final /* synthetic */ qa0 f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ia0(qa0 qa0Var, Context context, int i7, long j3, org.telegram.ui.ActionBar.h6 h6Var, boolean z10, boolean z11) {
        super(context, i7, j3, false, h6Var, false, z10, z11);
        this.f0 = qa0Var;
        this.e0 = true;
    }

    @Override // jg.r0
    public final void J() {
        this.f0.B0(null);
    }

    @Override // jg.r0
    public final void N(ArrayList arrayList) {
        int i7;
        qa0 qa0Var = this.f0;
        org.telegram.messenger.gj gjVar = qa0Var.J0;
        if (gjVar != null && gjVar.C3()) {
            if (arrayList != null) {
                i7 = 0;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    ma0 ma0Var = (ma0) arrayList.get(i10);
                    if (ma0Var != null && !org.telegram.messenger.p10.C(ma0Var.c)) {
                        i7++;
                    }
                }
            } else {
                i7 = 0;
            }
            if (this.e0 && i7 == 1) {
                qa0Var.q0 = ((ma0) arrayList.get(0)).a;
            }
            this.e0 = false;
            qa0Var.W.setVisibility(i7 != 1 ? 8 : 0);
        }
        super.N(arrayList);
    }
}
