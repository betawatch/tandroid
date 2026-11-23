package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class y70 extends zo0 {
    public final /* synthetic */ d80 V2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y70(d80 d80Var, Context context, String str, String str2, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, null, str, false, str2, false, i6Var);
        this.V2 = d80Var;
    }

    @Override // org.telegram.ui.Components.zo0
    public final void S0(a0.h hVar, int i7, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        String a02;
        if (z10) {
            if (hVar == null || hVar.m() != 1) {
                a02 = org.telegram.messenger.gd.a0(null, null, 2131748994, org.telegram.messenger.gd.G(i7, "Chats", new Object[0]));
            } else {
                long j3 = ((TLRPC.Dialog) hVar.n(0)).id;
                a02 = (j3 == 0 || j3 == org.telegram.messenger.i10.i(this.a).e()) ? org.telegram.messenger.gd.N0(2131748992, null) : org.telegram.messenger.gd.a0(null, null, 2131748991, org.telegram.messenger.mp.u1(this.a).D1(j3, true));
            }
            this.V2.e(org.telegram.messenger.g0.W2(a02));
        }
    }
}
