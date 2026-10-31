package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class c9 extends org.telegram.ui.Components.op0 {
    public final /* synthetic */ org.telegram.ui.ActionBar.z2 R2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c9(Context context, String str, String str2, org.telegram.ui.ActionBar.p6 p6Var, org.telegram.ui.ActionBar.z2 z2Var) {
        super(context, null, str, false, str2, false, p6Var);
        this.R2 = z2Var;
    }

    @Override // org.telegram.ui.Components.op0
    public final void R0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        String a02;
        if (z10) {
            if (hVar == null || hVar.m() != 1) {
                a02 = org.telegram.messenger.cd.a0(null, null, 2131749197, org.telegram.messenger.cd.G(hVar == null ? 1 : hVar.m(), "Chats", new Object[0]));
            } else {
                long j10 = ((TLRPC.Dialog) hVar.n(0)).id;
                a02 = (j10 == 0 || j10 == org.telegram.messenger.d20.i(this.a).e()) ? org.telegram.messenger.cd.L0(2131749195, null) : org.telegram.messenger.cd.a0(null, null, 2131749194, org.telegram.messenger.vp.r1(this.a).A1(j10, true));
            }
            org.telegram.ui.Components.wb Q = new org.telegram.ui.Components.cc(this.R2.E, this.I0).Q(R.raw.forward, 36, org.telegram.messenger.i0.W2(a02));
            Q.r = false;
            Q.j();
        }
    }
}
