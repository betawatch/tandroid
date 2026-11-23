package bi;

import android.content.Context;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gd;
import org.telegram.messenger.i10;
import org.telegram.messenger.mp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.fq0;
import org.telegram.ui.Components.kc;
import org.telegram.ui.Components.zo0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class v5 extends zo0 {
    public final /* synthetic */ org.telegram.ui.ActionBar.g2 V2;
    public final /* synthetic */ fq0 W2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v5(fq0 fq0Var, Context context, String str, String str2, org.telegram.ui.ActionBar.i6 i6Var, org.telegram.ui.ActionBar.g2 g2Var) {
        super(context, null, str, false, str2, false, i6Var);
        this.W2 = fq0Var;
        this.V2 = g2Var;
    }

    @Override // org.telegram.ui.Components.zo0
    public final void S0(a0.h hVar, int i7, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        kc b02;
        if (z10 && (b02 = kc.b0(this.V2)) != null) {
            if (hVar.m() == 1) {
                long j3 = hVar.j(0);
                if (j3 == i10.i(this.a).n) {
                    fc G = b02.G(R.raw.saved_messages, 5000, org.telegram.messenger.g0.W2(gd.a0(null, null, 2131749785, new Object[0])));
                    G.r = false;
                    G.j();
                } else if (j3 < 0) {
                    fc G2 = b02.G(R.raw.forward, 5000, org.telegram.messenger.g0.W2(gd.a0(null, null, 2131749789, tL_forumTopic != null ? tL_forumTopic.title : mp.u1(this.a).O0(Long.valueOf(-j3)).title)));
                    G2.r = false;
                    G2.j();
                } else {
                    fc G3 = b02.G(R.raw.forward, 5000, org.telegram.messenger.g0.W2(gd.a0(null, null, 2131749789, mp.u1(this.a).c2(Long.valueOf(j3)).first_name)));
                    G3.r = false;
                    G3.j();
                }
            } else {
                fc Q = b02.Q(R.raw.forward, 36, org.telegram.messenger.g0.W2(gd.G(hVar.m(), "GiftCollectionSharedToManyChats", Integer.valueOf(hVar.m()))));
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
