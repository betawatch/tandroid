// default package

import android.content.Context;
import android.view.View;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class m58 extends kea {
    public final /* synthetic */ o68 U2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m58(o68 o68Var, Context context, String str, String str2, boolean z, pu0 pu0Var) {
        super(context, null, null, str, null, false, str2, null, false, false, z, null, pu0Var);
        this.U2 = o68Var;
    }

    @Override // kea, nx0
    public final void H() {
        super.H();
        this.U2.J2 = null;
    }

    @Override // kea
    public final void M0(zh6 zh6Var, int i, TLRPC.TL_forumTopic tL_forumTopic, boolean z) {
        if (z) {
            o68 o68Var = this.U2;
            d31 d31Var = new d31(o68Var.M0, this.J0);
            if (zh6Var.m() == 1) {
                long j = zh6Var.j(0);
                if (j == yac.h(this.a).n) {
                    v21 G = d31Var.G(R.raw.saved_messages, 5000, hl.S2(ob6.a0(null, null, 2131744117, new Object[0])));
                    G.s = false;
                    G.j();
                } else {
                    int i2 = this.a;
                    if (j < 0) {
                        v21 G2 = d31Var.G(R.raw.forward, 5000, hl.S2(ob6.a0(null, null, 2131744130, tL_forumTopic != null ? tL_forumTopic.title : uc7.s1(i2).M0(Long.valueOf(-j)).title)));
                        G2.s = false;
                        G2.j();
                    } else {
                        v21 G3 = d31Var.G(R.raw.forward, 5000, hl.S2(ob6.a0(null, null, 2131744130, uc7.s1(i2).X1(Long.valueOf(j)).first_name)));
                        G3.s = false;
                        G3.j();
                    }
                }
            } else {
                v21 Q = d31Var.Q(R.raw.forward, 36, hl.S2(ob6.G(zh6Var.m(), "StorySharedToManyChats", Integer.valueOf(zh6Var.m()))));
                Q.s = false;
                Q.j();
            }
            try {
                o68Var.performHapticFeedback(3);
            } catch (Exception unused) {
            }
        }
    }

    @Override // kea
    public final void N0(View view) {
        this.U2.b1();
    }
}
