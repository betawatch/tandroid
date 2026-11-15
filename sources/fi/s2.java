package fi;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.po0;
import org.telegram.ui.Components.xb;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class s2 extends po0 {
    public final /* synthetic */ b4 V2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s2(b4 b4Var, Context context, String str, String str2, boolean z10, i2 i2Var) {
        super(context, null, null, str, null, false, str2, null, false, false, z10, null, i2Var);
        this.V2 = b4Var;
    }

    @Override // org.telegram.ui.Components.po0, org.telegram.ui.ActionBar.u2
    public final void L() {
        super.L();
        this.V2.J2 = null;
    }

    @Override // org.telegram.ui.Components.po0
    public final void R0(a0.h hVar, int i7, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (z10) {
            b4 b4Var = this.V2;
            cc ccVar = new cc(b4Var.M0, this.J0);
            if (hVar.m() == 1) {
                long j3 = hVar.j(0);
                if (j3 == m10.i(this.a).n) {
                    xb G = ccVar.G(R.raw.saved_messages, 5000, org.telegram.messenger.g0.X2(hd.a0(null, null, 2131744463, new Object[0])));
                    G.r = false;
                    G.j();
                } else if (j3 < 0) {
                    xb G2 = ccVar.G(R.raw.forward, 5000, org.telegram.messenger.g0.X2(hd.a0(null, null, 2131744476, tL_forumTopic != null ? tL_forumTopic.title : np.s1(this.a).M0(Long.valueOf(-j3)).title)));
                    G2.r = false;
                    G2.j();
                } else {
                    xb G3 = ccVar.G(R.raw.forward, 5000, org.telegram.messenger.g0.X2(hd.a0(null, null, 2131744476, np.s1(this.a).a2(Long.valueOf(j3)).first_name)));
                    G3.r = false;
                    G3.j();
                }
            } else {
                xb Q = ccVar.Q(R.raw.forward, 36, org.telegram.messenger.g0.X2(hd.G(hVar.m(), "StorySharedToManyChats", Integer.valueOf(hVar.m()))));
                Q.r = false;
                Q.j();
            }
            try {
                b4Var.performHapticFeedback(3);
            } catch (Exception unused) {
            }
        }
    }

    @Override // org.telegram.ui.Components.po0
    public final void S0(View view) {
        this.V2.c1();
    }
}
