// default package

import android.content.Context;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class es8 extends tca {
    public final /* synthetic */ d U2;
    public final /* synthetic */ lea V2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public es8(lea leaVar, Context context, String str, String str2, ylb ylbVar, d dVar) {
        super(context, null, str, false, str2, false, ylbVar);
        this.V2 = leaVar;
        this.U2 = dVar;
    }

    @Override // tca
    public final void L0(vh6 vh6Var, int i, TLRPC.TL_forumTopic tL_forumTopic, boolean z) {
        c41 b0;
        if (!z || (b0 = c41.b0(this.U2)) == null) {
            return;
        }
        if (vh6Var.m() == 1) {
            long j = vh6Var.j(0);
            if (j == z8c.h(this.a).n) {
                u31 G = b0.G(R.raw.saved_messages, 5000, gm.S2(jb6.a0(null, null, 2131749735, new Object[0])));
                G.s = false;
                G.j();
            } else {
                int i2 = this.a;
                if (j < 0) {
                    u31 G2 = b0.G(R.raw.forward, 5000, gm.S2(jb6.a0(null, null, 2131749739, tL_forumTopic != null ? tL_forumTopic.title : oc7.r1(i2).L0(Long.valueOf(-j)).title)));
                    G2.s = false;
                    G2.j();
                } else {
                    u31 G3 = b0.G(R.raw.forward, 5000, gm.S2(jb6.a0(null, null, 2131749739, oc7.r1(i2).W1(Long.valueOf(j)).first_name)));
                    G3.s = false;
                    G3.j();
                }
            }
        } else {
            u31 Q = b0.Q(R.raw.forward, 36, gm.S2(jb6.G(vh6Var.m(), "GiftCollectionSharedToManyChats", Integer.valueOf(vh6Var.m()))));
            Q.s = false;
            Q.j();
        }
        try {
            this.V2.performHapticFeedback(3);
        } catch (Exception unused) {
        }
    }
}
