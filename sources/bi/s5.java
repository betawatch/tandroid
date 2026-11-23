package bi;

import android.content.Context;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.messenger.k10;
import org.telegram.messenger.np;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ap0;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.gq0;
import org.telegram.ui.Components.lc;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class s5 extends ap0 {
    public final /* synthetic */ org.telegram.ui.ActionBar.g2 V2;
    public final /* synthetic */ gq0 W2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s5(gq0 gq0Var, Context context, String str, String str2, org.telegram.ui.ActionBar.h6 h6Var, org.telegram.ui.ActionBar.g2 g2Var) {
        super(context, null, str, false, str2, false, h6Var);
        this.W2 = gq0Var;
        this.V2 = g2Var;
    }

    @Override // org.telegram.ui.Components.ap0
    public final void S0(a0.h hVar, int i7, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        lc b02;
        if (z10 && (b02 = lc.b0(this.V2)) != null) {
            if (hVar.m() == 1) {
                long j3 = hVar.j(0);
                if (j3 == k10.i(this.a).n) {
                    gc G = b02.G(R.raw.saved_messages, 5000, org.telegram.messenger.g0.W2(hd.a0(null, null, 2131749785, new Object[0])));
                    G.r = false;
                    G.j();
                } else if (j3 < 0) {
                    gc G2 = b02.G(R.raw.forward, 5000, org.telegram.messenger.g0.W2(hd.a0(null, null, 2131749789, tL_forumTopic != null ? tL_forumTopic.title : np.u1(this.a).O0(Long.valueOf(-j3)).title)));
                    G2.r = false;
                    G2.j();
                } else {
                    gc G3 = b02.G(R.raw.forward, 5000, org.telegram.messenger.g0.W2(hd.a0(null, null, 2131749789, np.u1(this.a).c2(Long.valueOf(j3)).first_name)));
                    G3.r = false;
                    G3.j();
                }
            } else {
                gc Q = b02.Q(R.raw.forward, 36, org.telegram.messenger.g0.W2(hd.G(hVar.m(), "GiftCollectionSharedToManyChats", Integer.valueOf(hVar.m()))));
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
