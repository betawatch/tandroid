package bi;

import android.content.Context;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.po0;
import org.telegram.ui.Components.wp0;
import org.telegram.ui.Components.xb;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class i3 extends po0 {
    public final /* synthetic */ org.telegram.ui.ActionBar.e2 V2;
    public final /* synthetic */ wp0 W2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i3(wp0 wp0Var, Context context, String str, String str2, org.telegram.ui.ActionBar.e6 e6Var, org.telegram.ui.ActionBar.e2 e2Var) {
        super(context, null, str, false, str2, false, e6Var);
        this.W2 = wp0Var;
        this.V2 = e2Var;
    }

    @Override // org.telegram.ui.Components.po0
    public final void R0(a0.h hVar, int i7, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        cc a02;
        if (z10 && (a02 = cc.a0(this.V2)) != null) {
            if (hVar.m() == 1) {
                long j3 = hVar.j(0);
                if (j3 == m10.i(this.a).n) {
                    xb G = a02.G(R.raw.saved_messages, 5000, org.telegram.messenger.g0.X2(hd.a0(null, null, 2131749802, new Object[0])));
                    G.r = false;
                    G.j();
                } else if (j3 < 0) {
                    xb G2 = a02.G(R.raw.forward, 5000, org.telegram.messenger.g0.X2(hd.a0(null, null, 2131749806, tL_forumTopic != null ? tL_forumTopic.title : np.s1(this.a).M0(Long.valueOf(-j3)).title)));
                    G2.r = false;
                    G2.j();
                } else {
                    xb G3 = a02.G(R.raw.forward, 5000, org.telegram.messenger.g0.X2(hd.a0(null, null, 2131749806, np.s1(this.a).a2(Long.valueOf(j3)).first_name)));
                    G3.r = false;
                    G3.j();
                }
            } else {
                xb Q = a02.Q(R.raw.forward, 36, org.telegram.messenger.g0.X2(hd.G(hVar.m(), "GiftCollectionSharedToManyChats", Integer.valueOf(hVar.m()))));
                Q.r = false;
                Q.j();
            }
            try {
                this.W2.performHapticFeedback(3);
            } catch (Exception unused) {
            }
        }
    }
}
