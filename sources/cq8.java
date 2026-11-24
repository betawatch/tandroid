// default package

import android.content.Context;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class cq8 extends taa {
    public final /* synthetic */ d U2;
    public final /* synthetic */ lca V2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cq8(lca lcaVar, Context context, String str, String str2, wjb wjbVar, d dVar) {
        super(context, null, str, false, str2, false, wjbVar);
        this.V2 = lcaVar;
        this.U2 = dVar;
    }

    @Override // taa
    public final void L0(vf6 vf6Var, int i, TLRPC.TL_forumTopic tL_forumTopic, boolean z) {
        u21 b0;
        if (!z || (b0 = u21.b0(this.U2)) == null) {
            return;
        }
        if (vf6Var.m() == 1) {
            long j = vf6Var.j(0);
            if (j == y6c.h(this.a).n) {
                m21 G = b0.G(R.raw.saved_messages, 5000, gl.T2(k96.a0(null, null, 2131749786, new Object[0])));
                G.r = false;
                G.j();
            } else {
                int i2 = this.a;
                if (j < 0) {
                    m21 G2 = b0.G(R.raw.forward, 5000, gl.T2(k96.a0(null, null, 2131749790, tL_forumTopic != null ? tL_forumTopic.title : na7.q1(i2).K0(Long.valueOf(-j)).title)));
                    G2.r = false;
                    G2.j();
                } else {
                    m21 G3 = b0.G(R.raw.forward, 5000, gl.T2(k96.a0(null, null, 2131749790, na7.q1(i2).V1(Long.valueOf(j)).first_name)));
                    G3.r = false;
                    G3.j();
                }
            }
        } else {
            m21 Q = b0.Q(R.raw.forward, 36, gl.T2(k96.G(vf6Var.m(), "GiftCollectionSharedToManyChats", Integer.valueOf(vf6Var.m()))));
            Q.r = false;
            Q.j();
        }
        try {
            this.V2.performHapticFeedback(3);
        } catch (Exception unused) {
        }
    }
}
