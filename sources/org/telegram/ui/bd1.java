package org.telegram.ui;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class bd1 extends org.telegram.ui.Components.br0 {
    public final /* synthetic */ dd1 X0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bd1(dd1 dd1Var, Activity activity, String str, String str2) {
        super(activity, null, str, false, str2, false, null);
        this.X0 = dd1Var;
    }

    @Override // org.telegram.ui.Components.br0
    public final void O0(a0.i iVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (z10) {
            int m10 = iVar.m();
            dd1 dd1Var = this.X0;
            if (m10 == 1) {
                dd1Var.a.l0.m(((TLRPC.Dialog) iVar.n(0)).id, Integer.valueOf(i10), 61);
            } else {
                dd1Var.a.l0.k(0L, 61, Integer.valueOf(i10), Integer.valueOf(iVar.m()), null, null);
            }
        }
    }
}
