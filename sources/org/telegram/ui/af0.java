package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class af0 extends org.telegram.ui.Components.zo0 {
    public final /* synthetic */ bf0 V2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public af0(bf0 bf0Var, Context context, String str, String str2, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, null, str, false, str2, false, i6Var);
        this.V2 = bf0Var;
    }

    @Override // org.telegram.ui.Components.zo0
    public final void S0(a0.h hVar, int i7, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        String a02;
        ef0 ef0Var = this.V2.L;
        if (z10) {
            if (hVar == null || hVar.m() != 1) {
                a02 = org.telegram.messenger.gd.a0(null, null, 2131748994, org.telegram.messenger.gd.G(i7, "Chats", new Object[0]));
            } else {
                long j3 = ((TLRPC.Dialog) hVar.n(0)).id;
                a02 = (j3 == 0 || j3 == ef0Var.getUserConfig().e()) ? org.telegram.messenger.gd.N0(2131748992, null) : org.telegram.messenger.gd.a0(null, null, 2131748991, ef0Var.getMessagesController().D1(j3, true));
            }
            org.telegram.ui.Components.fc Q = org.telegram.ui.Components.kc.b0(ef0Var).Q(R.raw.forward, 36, org.telegram.messenger.g0.W2(a02));
            Q.r = false;
            Q.k(true);
        }
    }
}
