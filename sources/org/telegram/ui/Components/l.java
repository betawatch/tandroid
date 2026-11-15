package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class l extends po0 {
    public final /* synthetic */ d0 V2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(d0 d0Var, Context context, String str, String str2, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, null, str, false, str2, false, e6Var);
        this.V2 = d0Var;
    }

    @Override // org.telegram.ui.Components.po0
    public final void R0(a0.h hVar, int i7, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        FrameLayout frameLayout = this.V2.C2;
        if (z10) {
            cc ccVar = new cc(frameLayout, this.J0);
            if (hVar.m() == 1) {
                long j3 = hVar.j(0);
                if (j3 == org.telegram.messenger.m10.i(this.a).n) {
                    xb G = ccVar.G(R.raw.saved_messages, 5000, org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0(null, null, 2131754967, new Object[0])));
                    G.r = false;
                    G.j();
                } else if (j3 < 0) {
                    xb G2 = ccVar.G(R.raw.forward, 5000, org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0(null, null, 2131754971, tL_forumTopic != null ? tL_forumTopic.title : org.telegram.messenger.np.s1(this.a).M0(Long.valueOf(-j3)).title)));
                    G2.r = false;
                    G2.j();
                } else {
                    xb G3 = ccVar.G(R.raw.forward, 5000, org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0(null, null, 2131754971, org.telegram.messenger.np.s1(this.a).a2(Long.valueOf(j3)).first_name)));
                    G3.r = false;
                    G3.j();
                }
            } else {
                xb Q = ccVar.Q(R.raw.forward, 36, org.telegram.messenger.g0.X2(org.telegram.messenger.hd.G(hVar.m(), "AIEditorStyleSharedToManyChats", Integer.valueOf(hVar.m()))));
                Q.r = false;
                Q.j();
            }
            try {
                frameLayout.performHapticFeedback(3);
            } catch (Exception unused) {
            }
        }
    }
}
