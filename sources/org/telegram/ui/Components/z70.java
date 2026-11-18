package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class z70 extends yo0 {
    public final /* synthetic */ e80 V2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z70(e80 e80Var, Context context, String str, String str2, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, null, str, false, str2, false, i6Var);
        this.V2 = e80Var;
    }

    @Override // org.telegram.ui.Components.yo0
    public final void S0(a0.h hVar, int i7, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        String a02;
        if (z10) {
            if (hVar == null || hVar.m() != 1) {
                a02 = org.telegram.messenger.gd.a0(null, null, 2131748995, org.telegram.messenger.gd.G(i7, "Chats", new Object[0]));
            } else {
                long j3 = ((TLRPC.Dialog) hVar.n(0)).id;
                a02 = (j3 == 0 || j3 == org.telegram.messenger.j10.i(this.a).e()) ? org.telegram.messenger.gd.M0(2131748993, null) : org.telegram.messenger.gd.a0(null, null, 2131748992, org.telegram.messenger.mp.u1(this.a).D1(j3, true));
            }
            this.V2.e(org.telegram.messenger.g0.W2(a02));
        }
    }
}
