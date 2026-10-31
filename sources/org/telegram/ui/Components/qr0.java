package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class qr0 extends org.telegram.ui.Cells.k7 {
    public final /* synthetic */ zt0 l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qr0(zt0 zt0Var, Context context) {
        super(context);
        this.l0 = zt0Var;
    }

    @Override // org.telegram.ui.Cells.k7
    public final boolean d(org.telegram.messenger.jj jjVar) {
        zt0 zt0Var = this.l0;
        ot0[] ot0VarArr = zt0Var.v1;
        if (org.telegram.messenger.jj.R4(jjVar.k) || jjVar.h4()) {
            boolean S = MediaController.B().S(jjVar);
            MediaController.B().r0(S ? ot0VarArr[4].a : null, false);
            return S;
        }
        if (jjVar.I3()) {
            return MediaController.B().o0(ot0VarArr[4].a, jjVar, zt0Var.e1, true, null);
        }
        return false;
    }
}
