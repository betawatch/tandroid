package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class o70 extends po0 {
    public final /* synthetic */ t70 V2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o70(t70 t70Var, Context context, String str, String str2, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, null, str, false, str2, false, e6Var);
        this.V2 = t70Var;
    }

    @Override // org.telegram.ui.Components.po0
    public final void R0(a0.h hVar, int i7, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        String a02;
        if (z10) {
            if (hVar == null || hVar.m() != 1) {
                a02 = org.telegram.messenger.hd.a0(null, null, 2131749187, org.telegram.messenger.hd.G(i7, "Chats", new Object[0]));
            } else {
                long j3 = ((TLRPC.Dialog) hVar.n(0)).id;
                a02 = (j3 == 0 || j3 == org.telegram.messenger.m10.i(this.a).e()) ? org.telegram.messenger.hd.M0(2131749185, null) : org.telegram.messenger.hd.a0(null, null, 2131749184, org.telegram.messenger.np.s1(this.a).B1(j3, true));
            }
            this.V2.e(org.telegram.messenger.g0.X2(a02));
        }
    }
}
