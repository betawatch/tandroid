package di;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.id;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.bc;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.mo0;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class x2 extends mo0 {
    public final /* synthetic */ j4 U2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x2(j4 j4Var, Context context, String str, String str2, boolean z9, m2 m2Var) {
        super(context, null, null, str, null, false, str2, null, false, false, z9, null, m2Var);
        this.U2 = j4Var;
    }

    @Override // org.telegram.ui.Components.mo0, org.telegram.ui.ActionBar.w2
    public final void K() {
        super.K();
        this.U2.I2 = null;
    }

    @Override // org.telegram.ui.Components.mo0
    public final void R0(a0.h hVar, int i7, TLRPC.TL_forumTopic tL_forumTopic, boolean z9) {
        if (z9) {
            j4 j4Var = this.U2;
            gc gcVar = new gc(j4Var.L0, this.I0);
            if (hVar.m() == 1) {
                long j3 = hVar.j(0);
                if (j3 == p10.i(this.a).n) {
                    bc G = gcVar.G(R.raw.saved_messages, 5000, org.telegram.messenger.g0.X2(id.a0(null, null, 2131744463, new Object[0])));
                    G.r = false;
                    G.j();
                } else if (j3 < 0) {
                    bc G2 = gcVar.G(R.raw.forward, 5000, org.telegram.messenger.g0.X2(id.a0(null, null, 2131744476, tL_forumTopic != null ? tL_forumTopic.title : qp.s1(this.a).M0(Long.valueOf(-j3)).title)));
                    G2.r = false;
                    G2.j();
                } else {
                    bc G3 = gcVar.G(R.raw.forward, 5000, org.telegram.messenger.g0.X2(id.a0(null, null, 2131744476, qp.s1(this.a).a2(Long.valueOf(j3)).first_name)));
                    G3.r = false;
                    G3.j();
                }
            } else {
                bc Q = gcVar.Q(R.raw.forward, 36, org.telegram.messenger.g0.X2(id.G(hVar.m(), "StorySharedToManyChats", Integer.valueOf(hVar.m()))));
                Q.r = false;
                Q.j();
            }
            try {
                j4Var.performHapticFeedback(3);
            } catch (Exception unused) {
            }
        }
    }

    @Override // org.telegram.ui.Components.mo0
    public final void S0(View view) {
        this.U2.c1();
    }
}
