package bi;

import android.content.Context;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.messenger.mp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.eq0;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.yo0;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class q5 extends yo0 {
    public final /* synthetic */ org.telegram.ui.ActionBar.h2 V2;
    public final /* synthetic */ eq0 W2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q5(eq0 eq0Var, Context context, String str, String str2, org.telegram.ui.ActionBar.i6 i6Var, org.telegram.ui.ActionBar.h2 h2Var) {
        super(context, null, str, false, str2, false, i6Var);
        this.W2 = eq0Var;
        this.V2 = h2Var;
    }

    @Override // org.telegram.ui.Components.yo0
    public final void S0(a0.h hVar, int i7, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        lc b02;
        if (z10 && (b02 = lc.b0(this.V2)) != null) {
            if (hVar.m() == 1) {
                long j3 = hVar.j(0);
                if (j3 == j10.i(this.a).n) {
                    gc G = b02.G(R.raw.saved_messages, 5000, org.telegram.messenger.g0.W2(gd.a0(null, null, 2131749786, new Object[0])));
                    G.r = false;
                    G.j();
                } else if (j3 < 0) {
                    gc G2 = b02.G(R.raw.forward, 5000, org.telegram.messenger.g0.W2(gd.a0(null, null, 2131749790, tL_forumTopic != null ? tL_forumTopic.title : mp.u1(this.a).O0(Long.valueOf(-j3)).title)));
                    G2.r = false;
                    G2.j();
                } else {
                    gc G3 = b02.G(R.raw.forward, 5000, org.telegram.messenger.g0.W2(gd.a0(null, null, 2131749790, mp.u1(this.a).c2(Long.valueOf(j3)).first_name)));
                    G3.r = false;
                    G3.j();
                }
            } else {
                gc Q = b02.Q(R.raw.forward, 36, org.telegram.messenger.g0.W2(gd.G(hVar.m(), "GiftCollectionSharedToManyChats", Integer.valueOf(hVar.m()))));
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
