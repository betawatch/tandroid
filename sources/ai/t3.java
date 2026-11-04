package ai;

import android.content.Context;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ac;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.oo0;
import org.telegram.ui.Components.vp0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class t3 extends oo0 {
    public final /* synthetic */ org.telegram.ui.ActionBar.d2 S2;
    public final /* synthetic */ vp0 T2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t3(vp0 vp0Var, Context context, String str, String str2, org.telegram.ui.ActionBar.e6 e6Var, org.telegram.ui.ActionBar.d2 d2Var) {
        super(context, null, str, false, str2, false, e6Var);
        this.T2 = vp0Var;
        this.S2 = d2Var;
    }

    @Override // org.telegram.ui.Components.oo0
    public final void R0(a0.h hVar, int i3, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        fc a02;
        if (z10 && (a02 = fc.a0(this.S2)) != null) {
            if (hVar.m() == 1) {
                long j10 = hVar.j(0);
                if (j10 == h10.i(this.a).n) {
                    ac G = a02.G(R.raw.saved_messages, 5000, org.telegram.messenger.g0.X2(bd.a0(null, null, 2131749810, new Object[0])));
                    G.r = false;
                    G.j();
                } else if (j10 < 0) {
                    ac G2 = a02.G(R.raw.forward, 5000, org.telegram.messenger.g0.X2(bd.a0(null, null, 2131749814, tL_forumTopic != null ? tL_forumTopic.title : hp.s1(this.a).M0(Long.valueOf(-j10)).title)));
                    G2.r = false;
                    G2.j();
                } else {
                    ac G3 = a02.G(R.raw.forward, 5000, org.telegram.messenger.g0.X2(bd.a0(null, null, 2131749814, hp.s1(this.a).a2(Long.valueOf(j10)).first_name)));
                    G3.r = false;
                    G3.j();
                }
            } else {
                ac Q = a02.Q(R.raw.forward, 36, org.telegram.messenger.g0.X2(bd.G(hVar.m(), "GiftCollectionSharedToManyChats", Integer.valueOf(hVar.m()))));
                Q.r = false;
                Q.j();
            }
            try {
                this.T2.performHapticFeedback(3);
            } catch (Exception unused) {
            }
        }
    }
}
