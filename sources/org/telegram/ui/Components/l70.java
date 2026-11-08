package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class l70 extends mo0 {
    public final /* synthetic */ q70 R2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l70(q70 q70Var, Context context, String str, String str2, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, null, str, false, str2, false, f6Var);
        this.R2 = q70Var;
    }

    @Override // org.telegram.ui.Components.mo0
    public final void R0(a0.h hVar, int i7, TLRPC.TL_forumTopic tL_forumTopic, boolean z9) {
        String a02;
        if (z9) {
            if (hVar == null || hVar.m() != 1) {
                a02 = org.telegram.messenger.id.a0(null, null, 2131749188, org.telegram.messenger.id.G(i7, "Chats", new Object[0]));
            } else {
                long j3 = ((TLRPC.Dialog) hVar.n(0)).id;
                a02 = (j3 == 0 || j3 == org.telegram.messenger.p10.i(this.a).e()) ? org.telegram.messenger.id.M0(2131749186, null) : org.telegram.messenger.id.a0(null, null, 2131749185, org.telegram.messenger.qp.s1(this.a).B1(j3, true));
            }
            this.R2.e(org.telegram.messenger.g0.X2(a02));
        }
    }
}
