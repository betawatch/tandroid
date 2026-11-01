package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class m extends pp0 {
    public final /* synthetic */ g0 R2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(g0 g0Var, Context context, String str, String str2, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context, null, str, false, str2, false, p6Var);
        this.R2 = g0Var;
    }

    @Override // org.telegram.ui.Components.pp0
    public final void R0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        FrameLayout frameLayout = this.R2.y2;
        if (z10) {
            cc ccVar = new cc(frameLayout, this.I0);
            if (hVar.m() == 1) {
                long j10 = hVar.j(0);
                if (j10 == org.telegram.messenger.e20.i(this.a).n) {
                    wb G = ccVar.G(R.raw.saved_messages, 5000, org.telegram.messenger.i0.W2(org.telegram.messenger.dd.a0(null, null, 2131754967, new Object[0])));
                    G.r = false;
                    G.j();
                } else if (j10 < 0) {
                    wb G2 = ccVar.G(R.raw.forward, 5000, org.telegram.messenger.i0.W2(org.telegram.messenger.dd.a0(null, null, 2131754971, tL_forumTopic != null ? tL_forumTopic.title : org.telegram.messenger.wp.r1(this.a).L0(Long.valueOf(-j10)).title)));
                    G2.r = false;
                    G2.j();
                } else {
                    wb G3 = ccVar.G(R.raw.forward, 5000, org.telegram.messenger.i0.W2(org.telegram.messenger.dd.a0(null, null, 2131754971, org.telegram.messenger.wp.r1(this.a).Z1(Long.valueOf(j10)).first_name)));
                    G3.r = false;
                    G3.j();
                }
            } else {
                wb Q = ccVar.Q(R.raw.forward, 36, org.telegram.messenger.i0.W2(org.telegram.messenger.dd.G(hVar.m(), "AIEditorStyleSharedToManyChats", Integer.valueOf(hVar.m()))));
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
