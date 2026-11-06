package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class m extends mo0 {
    public final /* synthetic */ g0 R2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(g0 g0Var, Context context, String str, String str2, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, null, str, false, str2, false, f6Var);
        this.R2 = g0Var;
    }

    @Override // org.telegram.ui.Components.mo0
    public final void R0(a0.h hVar, int i7, TLRPC.TL_forumTopic tL_forumTopic, boolean z9) {
        FrameLayout frameLayout = this.R2.y2;
        if (z9) {
            hc hcVar = new hc(frameLayout, this.I0);
            if (hVar.m() == 1) {
                long j3 = hVar.j(0);
                if (j3 == org.telegram.messenger.p10.i(this.a).n) {
                    cc G = hcVar.G(R.raw.saved_messages, 5000, org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0(null, null, 2131754967, new Object[0])));
                    G.r = false;
                    G.j();
                } else if (j3 < 0) {
                    cc G2 = hcVar.G(R.raw.forward, 5000, org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0(null, null, 2131754971, tL_forumTopic != null ? tL_forumTopic.title : org.telegram.messenger.qp.s1(this.a).M0(Long.valueOf(-j3)).title)));
                    G2.r = false;
                    G2.j();
                } else {
                    cc G3 = hcVar.G(R.raw.forward, 5000, org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0(null, null, 2131754971, org.telegram.messenger.qp.s1(this.a).a2(Long.valueOf(j3)).first_name)));
                    G3.r = false;
                    G3.j();
                }
            } else {
                cc Q = hcVar.Q(R.raw.forward, 36, org.telegram.messenger.g0.X2(org.telegram.messenger.hd.G(hVar.m(), "AIEditorStyleSharedToManyChats", Integer.valueOf(hVar.m()))));
                Q.r = false;
                Q.j();
            }
            try {
                frameLayout.performHapticFeedback(3);
            } catch (Exception unused) {
            }
        }
    }
}
