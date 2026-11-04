package ei;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ac;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.oo0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class a3 extends oo0 {
    public final /* synthetic */ j4 S2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a3(j4 j4Var, Context context, String str, String str2, boolean z10, q2 q2Var) {
        super(context, null, null, str, null, false, str2, null, false, false, z10, null, q2Var);
        this.S2 = j4Var;
    }

    @Override // org.telegram.ui.Components.oo0, org.telegram.ui.ActionBar.t2
    public final void K() {
        super.K();
        this.S2.J2 = null;
    }

    @Override // org.telegram.ui.Components.oo0
    public final void R0(a0.h hVar, int i3, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (z10) {
            j4 j4Var = this.S2;
            fc fcVar = new fc(j4Var.M0, this.J0);
            if (hVar.m() == 1) {
                long j10 = hVar.j(0);
                if (j10 == h10.i(this.a).n) {
                    ac G = fcVar.G(R.raw.saved_messages, 5000, org.telegram.messenger.g0.X2(bd.a0(null, null, 2131744473, new Object[0])));
                    G.r = false;
                    G.j();
                } else if (j10 < 0) {
                    ac G2 = fcVar.G(R.raw.forward, 5000, org.telegram.messenger.g0.X2(bd.a0(null, null, 2131744486, tL_forumTopic != null ? tL_forumTopic.title : hp.s1(this.a).M0(Long.valueOf(-j10)).title)));
                    G2.r = false;
                    G2.j();
                } else {
                    ac G3 = fcVar.G(R.raw.forward, 5000, org.telegram.messenger.g0.X2(bd.a0(null, null, 2131744486, hp.s1(this.a).a2(Long.valueOf(j10)).first_name)));
                    G3.r = false;
                    G3.j();
                }
            } else {
                ac Q = fcVar.Q(R.raw.forward, 36, org.telegram.messenger.g0.X2(bd.G(hVar.m(), "StorySharedToManyChats", Integer.valueOf(hVar.m()))));
                Q.r = false;
                Q.j();
            }
            try {
                j4Var.performHapticFeedback(3);
            } catch (Exception unused) {
            }
        }
    }

    @Override // org.telegram.ui.Components.oo0
    public final void S0(View view) {
        this.S2.c1();
    }
}
