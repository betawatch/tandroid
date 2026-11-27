// default package

import android.content.Context;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class b91 extends kea {
    public final /* synthetic */ nx0 U2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b91(Context context, String str, String str2, vnb vnbVar, nx0 nx0Var) {
        super(context, null, str, false, str2, false, vnbVar);
        this.U2 = nx0Var;
    }

    @Override // kea
    public final void M0(zh6 zh6Var, int i, TLRPC.TL_forumTopic tL_forumTopic, boolean z) {
        String a0;
        if (z) {
            if (zh6Var == null || zh6Var.m() != 1) {
                a0 = ob6.a0(null, null, 2131748941, ob6.G(zh6Var == null ? 1 : zh6Var.m(), "Chats", new Object[0]));
            } else {
                long j = ((TLRPC.Dialog) zh6Var.n(0)).id;
                a0 = (j == 0 || j == yac.h(this.a).e()) ? ob6.M0(2131748939, null) : ob6.a0(null, null, 2131748938, uc7.s1(this.a).A1(j, true));
            }
            v21 Q = new d31(this.U2.F, this.J0).Q(R.raw.forward, 36, hl.S2(a0));
            Q.s = false;
            Q.j();
        }
    }
}
