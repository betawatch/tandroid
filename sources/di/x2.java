package di;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.id;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.mo0;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class x2 extends mo0 {
    public final /* synthetic */ i4 R2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x2(i4 i4Var, Context context, String str, String str2, boolean z9, m2 m2Var) {
        super(context, null, null, str, null, false, str2, null, false, false, z9, null, m2Var);
        this.R2 = i4Var;
    }

    @Override // org.telegram.ui.Components.mo0, org.telegram.ui.ActionBar.v2
    public final void K() {
        super.K();
        this.R2.I2 = null;
    }

    @Override // org.telegram.ui.Components.mo0
    public final void R0(a0.h hVar, int i7, TLRPC.TL_forumTopic tL_forumTopic, boolean z9) {
        if (z9) {
            i4 i4Var = this.R2;
            hc hcVar = new hc(i4Var.L0, this.I0);
            if (hVar.m() == 1) {
                long j3 = hVar.j(0);
                if (j3 == p10.i(this.a).n) {
                    cc G = hcVar.G(R.raw.saved_messages, 5000, org.telegram.messenger.g0.X2(id.a0(null, null, 2131744466, new Object[0])));
                    G.r = false;
                    G.j();
                } else if (j3 < 0) {
                    cc G2 = hcVar.G(R.raw.forward, 5000, org.telegram.messenger.g0.X2(id.a0(null, null, 2131744479, tL_forumTopic != null ? tL_forumTopic.title : qp.s1(this.a).M0(Long.valueOf(-j3)).title)));
                    G2.r = false;
                    G2.j();
                } else {
                    cc G3 = hcVar.G(R.raw.forward, 5000, org.telegram.messenger.g0.X2(id.a0(null, null, 2131744479, qp.s1(this.a).a2(Long.valueOf(j3)).first_name)));
                    G3.r = false;
                    G3.j();
                }
            } else {
                cc Q = hcVar.Q(R.raw.forward, 36, org.telegram.messenger.g0.X2(id.G(hVar.m(), "StorySharedToManyChats", Integer.valueOf(hVar.m()))));
                Q.r = false;
                Q.j();
            }
            try {
                i4Var.performHapticFeedback(3);
            } catch (Exception unused) {
            }
        }
    }

    @Override // org.telegram.ui.Components.mo0
    public final void S0(View view) {
        this.R2.c1();
    }
}
