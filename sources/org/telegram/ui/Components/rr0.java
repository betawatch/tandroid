package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class rr0 extends org.telegram.ui.Cells.k7 {
    public final /* synthetic */ au0 l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rr0(au0 au0Var, Context context) {
        super(context);
        this.l0 = au0Var;
    }

    @Override // org.telegram.ui.Cells.k7
    public final boolean d(org.telegram.messenger.kj kjVar) {
        au0 au0Var = this.l0;
        pt0[] pt0VarArr = au0Var.v1;
        if (org.telegram.messenger.kj.R4(kjVar.k) || kjVar.h4()) {
            boolean S = MediaController.B().S(kjVar);
            MediaController.B().r0(S ? pt0VarArr[4].a : null, false);
            return S;
        }
        if (kjVar.I3()) {
            return MediaController.B().o0(pt0VarArr[4].a, kjVar, au0Var.e1, true, null);
        }
        return false;
    }
}
