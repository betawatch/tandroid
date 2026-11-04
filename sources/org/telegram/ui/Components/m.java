package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class m extends oo0 {
    public final /* synthetic */ e0 S2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(e0 e0Var, Context context, String str, String str2, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, null, str, false, str2, false, e6Var);
        this.S2 = e0Var;
    }

    @Override // org.telegram.ui.Components.oo0
    public final void R0(a0.h hVar, int i3, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        FrameLayout frameLayout = this.S2.z2;
        if (z10) {
            fc fcVar = new fc(frameLayout, this.J0);
            if (hVar.m() == 1) {
                long j10 = hVar.j(0);
                if (j10 == org.telegram.messenger.h10.i(this.a).n) {
                    ac G = fcVar.G(R.raw.saved_messages, 5000, org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0(null, null, 2131754967, new Object[0])));
                    G.r = false;
                    G.j();
                } else if (j10 < 0) {
                    ac G2 = fcVar.G(R.raw.forward, 5000, org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0(null, null, 2131754971, tL_forumTopic != null ? tL_forumTopic.title : org.telegram.messenger.hp.s1(this.a).M0(Long.valueOf(-j10)).title)));
                    G2.r = false;
                    G2.j();
                } else {
                    ac G3 = fcVar.G(R.raw.forward, 5000, org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0(null, null, 2131754971, org.telegram.messenger.hp.s1(this.a).a2(Long.valueOf(j10)).first_name)));
                    G3.r = false;
                    G3.j();
                }
            } else {
                ac Q = fcVar.Q(R.raw.forward, 36, org.telegram.messenger.g0.X2(org.telegram.messenger.bd.G(hVar.m(), "AIEditorStyleSharedToManyChats", Integer.valueOf(hVar.m()))));
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
