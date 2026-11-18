package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class ia0 extends jg.r0 {
    public boolean e0;
    public final /* synthetic */ qa0 f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ia0(qa0 qa0Var, Context context, int i7, long j3, org.telegram.ui.ActionBar.i6 i6Var, boolean z10, boolean z11) {
        super(context, i7, j3, false, i6Var, false, z10, z11);
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
        org.telegram.messenger.fj fjVar = qa0Var.J0;
        if (fjVar != null && fjVar.C3()) {
            if (arrayList != null) {
                i7 = 0;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    ma0 ma0Var = (ma0) arrayList.get(i10);
                    if (ma0Var != null && !org.telegram.messenger.o10.C(ma0Var.c)) {
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
