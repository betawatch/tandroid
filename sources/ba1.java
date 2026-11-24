// default package

import android.content.Context;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ba1 extends tca {
    public final /* synthetic */ my0 U2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ba1(Context context, String str, String str2, ylb ylbVar, my0 my0Var) {
        super(context, null, str, false, str2, false, ylbVar);
        this.U2 = my0Var;
    }

    @Override // tca
    public final void L0(vh6 vh6Var, int i, TLRPC.TL_forumTopic tL_forumTopic, boolean z) {
        String a0;
        if (z) {
            if (vh6Var == null || vh6Var.m() != 1) {
                a0 = jb6.a0(null, null, 2131748944, jb6.G(vh6Var == null ? 1 : vh6Var.m(), "Chats", new Object[0]));
            } else {
                long j = ((TLRPC.Dialog) vh6Var.n(0)).id;
                a0 = (j == 0 || j == z8c.h(this.a).e()) ? jb6.M0(2131748942, null) : jb6.a0(null, null, 2131748941, oc7.r1(this.a).z1(j, true));
            }
            u31 Q = new c41(this.U2.F, this.J0).Q(R.raw.forward, 36, gm.S2(a0));
            Q.s = false;
            Q.j();
        }
    }
}
